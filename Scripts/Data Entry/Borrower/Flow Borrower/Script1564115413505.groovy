import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Data Entry/Borrower/Borrower - Identitas/MASTER FLOW/TC_Borrower - Identitas - MASTER FLOW'), 
    [('BIvarNoKTP') : BIvarNoKTP, ('BIvarAgama') : BIvarAgama, ('BIvarStatusPerkawinan') : BIvarStatusPerkawinan], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.mobileSwipe.RightLeft'(0.9, 0.5, 1000)

not_run: WebUI.callTestCase(findTestCase('Data Entry/Borrower/Borrower - Info Umum/MASTER FLOW/TC_Borrower - Info Umum - MASTER FLOW'), 
    [('BIUvarNamaLengkapTanpaSingkatan') : BIUvarNamaLengkapTanpaSingkatan, ('BIUvarNamaPanggilan') : BIUvarNamaPanggilan
        , ('BIUvarNoNPWP') : BIUvarNoNPWP, ('BIUvarNamaNPWP') : BIUvarNamaNPWP, ('BIUvarNamaIbuKandung') : BIUvarNamaIbuKandung
        , ('BIUvarPendidikan') : BIUvarPendidikan, ('BIUvarAlamatEmail') : BIUvarAlamatEmail, ('BIUvarSumberDanaUangMuka') : BIUvarSumberDanaUangMuka
        , ('BIUvarSumberDanaAngsuran') : BIUvarSumberDanaAngsuran, ('BIUvarKepemilikanDana') : BIUvarKepemilikanDana, ('BIUvarAlamatMenyurat') : BIUvarAlamatMenyurat], 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.mobileSwipe.RightLeft'(0.9, 0.5, 1000)

not_run: WebUI.callTestCase(findTestCase('Data Entry/Borrower/Borrower - Domisili/MASTER FLOW/TC_Borrower - Domisili - MASTER FLOW'), 
    [('BDvarAlamatLengkap') : BDvarAlamatLengkap, ('BDvarRT') : BDvarRT, ('BDvarRW') : BDvarRW, ('BDvarKodePos') : BDvarKodePos
        , ('BDvarNegaraDomisili') : BDvarNegaraDomisili, ('BDvarPetunjukAlamat') : BDvarPetunjukAlamat, ('BDvarNoTelponFixedLine') : BDvarNoTelponFixedLine
        , ('BDvarKodeArea') : BDvarKodeArea, ('BDvarTinggalSejakTahun') : BDvarTinggalSejakTahun, ('BDvarStatusTempatTinggal') : BDvarStatusTempatTinggal
        , ('BDvarTelponSelular') : BDvarTelponSelular, ('BDvarDomisili') : BDvarNegaraDomisili, ('BDvarROAO') : BDvarROAO], 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.mobileSwipe.RightLeft'(0.9, 0.5, 1000)

Mobile.tap(findTestObject('Borrower/Borrower - Pekerjaan/Borrower_Pekerjaan_BtnDetailPekerjaan'), 0)

WebUI.callTestCase(findTestCase('Data Entry/Borrower/Borrower - Pekerjaan/MASTER FLOW/TC_Borrower - Pekerjaan - MASTER FLOW'), 
    [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.mobileSwipe.RightLeft'(0.9, 0.5, 1000)

not_run: if (BvarUsahaTab == 'Ya') {
    WebUI.callTestCase(findTestCase('Data Entry/Borrower/Borrower - Usaha/MASTER FLOW/TC_Borrower - Usaha - MASTER FLOW'), 
        [('BUvarPekerjaan') : BUvarPekerjaan, ('BUvarBadanUsaha') : BUvarBadanUsaha, ('BUvarNamaUsaha') : BUvarNamaUsaha
            , ('BUvarBidangUsaha') : BUvarBidangUsaha, ('BUvarSubBidangUsaha') : BUvarSubBidangUsaha, ('BUvarTanggalMulaiBisnis') : BUvarTanggalMulaiBisnis
            , ('BUvarAlamatKantor') : BUvarAlamatKantor, ('BUvarKodePos') : BUvarKodePos, ('BUvarRT') : BUvarRT, ('BUvarRW') : BUvarRW
            , ('BUvarPetunjukAlamat') : BUvarPetunjukAlamat, ('BUvarKodeArea') : BUvarKodeArea, ('BUvarNoTelponKantor') : BUvarNoTelponKantor
            , ('BUvarTeleponSeluler') : BUvarTeleponSeluler, ('BUvarWebsite') : BUvarWebsite, ('BUvarJenisAkunSosialMedia') : BUvarJenisAkunSosialMedia
            , ('BUvarAkunSosialMedia') : BUvarAkunSosialMedia, ('BUvarEXT') : BUvarEXT, ('BUvarSesuaiDomisili') : BUvarSesuaiDomisili], 
        FailureHandling.STOP_ON_FAILURE)
}

CustomKeywords.'mobile.mobileSwipe.RightLeft'(0.9, 0.5, 1000)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.2, 0.8, 1000)

WebUI.callTestCase(findTestCase('Data Entry/Borrower/Borrower - Emergency Contact/MASTER FLOW/TC_Borrower - Emergency Contact - MASTER FLOW'), 
    [('BEvarRT') : BEvarRT, ('BEvarRW') : BEvarRW, ('BEvarKodePos') : BEvarKodePos], FailureHandling.STOP_ON_FAILURE)

