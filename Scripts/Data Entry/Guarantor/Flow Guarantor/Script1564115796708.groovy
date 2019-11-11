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

not_run: WebUI.callTestCase(findTestCase('Data Entry/Guarantor/Guarantor - Identitas/MASTER FLOW/TC_Guarantor Identitas - MASTER FLOW'), 
    [('GIvarNIK') : GIvarNIK, ('GIvarAgama') : GIvarAgama, ('GIvarStatus') : GIvarStatus, ('GIvarNamaSesuaiIdentitas') : GIvarNamaSesuaiIdentitas
        , ('GIvarTempatLahir') : GIvarTempatLahir, ('GIvarAlamatLengkap') : GIvarAlamatLengkap, ('GIvarRT') : GIvarRT, ('GIvarRW') : GIvarRW
        , ('GIvarKodePos') : GIvarKodePos, ('GIvarNegaraAsal') : GIvarNegaraAsal, ('GIvarNomorPassport') : GIvarNomorPassport
        , ('GIvarKewarganegaraan') : GIvarKewarganegaraan, ('GIvarMasaBerlaku') : GIvarMasaBerlaku, ('GIvarVerifikasi') : GIvarVerifikasi
        , ('GIvarJenisKelamin') : GIvarJenisKelamin], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.mobileSwipe.RightLeft'(0.9, 0.5, 1000)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.2, 0.8, 1000)

not_run: WebUI.callTestCase(findTestCase('Data Entry/Guarantor/Guarantor - Info Umum/MASTER FLOW/TC_Guarantor Info Umum - MASTER FLOW'), 
    [('GIUvarNamaLTS') : GIUvarNamaLTS, ('GIUvarNamaIbuK') : GIUvarNamaIbuK, ('GIUvarPendidikan') : GIUvarPendidikan, ('GIUvarEmail') : GIUvarEmail
        , ('GIUvarTseluler') : GIUvarTseluler, ('GIUvarAkunsosmed') : GIUvarAkunsosmed, ('GIUvarSosmed') : GIUvarSosmed, ('GIUvarNoNPWP') : GIUvarNoNPWP
        , ('GIUvarNamaNPWP') : GIUvarNamaNPWP, ('GIUvarKodeArea') : GIUvarKodeArea, ('GIUvarTelepon') : GIUvarTelepon], 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.mobileSwipe.RightLeft'(0.9, 0.5, 1000)

not_run: CustomKeywords.'mobile.mobileSwipe.UpDown'(0.2, 0.8, 1000)

not_run: WebUI.callTestCase(findTestCase('Data Entry/Guarantor/Guarantor - Domisili/MASTER FLOW/TC_Guarantor Domisili - MASTER FLOW'), 
    [('GDvarNegara') : GDvarNegara, ('GDvarPtjkAlamat') : GDvarPtjkAlamat, ('GDvarTngglSejakTahun') : GDvarTngglSejakTahun
        , ('GDvarStatusTT') : GDvarStatusTT, ('GDvarAlamatLengkap') : GDvarAlamatLengkap, ('GDvarRT') : GDvarRT, ('GDvarRW') : GDvarRW
        , ('GDvarKodePos') : GDvarKodePos, ('GDvarNoTlp1') : GDvarNoTlp1, ('GDvarNoTlp2') : GDvarNoTlp2, ('GDvarDomisili') : GDvarDomisili], 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.mobileSwipe.RightLeft'(0.9, 0.5, 1000)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.2, 0.8, 1000)

Mobile.tap(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_TabDetailPekerjaan'), 0)

WebUI.callTestCase(findTestCase('Data Entry/Guarantor/Guarantor - Pekerjaan/MASTER FLOW/TC_Guarantor Pekerjaan - Dupcek'), 
    [:], FailureHandling.STOP_ON_FAILURE)

not_run: if (GvarPekerjaanTab == 'Ya') {
    WebUI.callTestCase(findTestCase('Data Entry/Guarantor/Guarantor - Pekerjaan/MASTER FLOW/TC_Guarantor Pekerjaan - MASTER FLOW'), 
        [('GBvarJabatan') : GBvarJabatan, ('GBvarBadanUsaha') : GBvarBadanUsaha, ('GBvarBidangUsaha') : GBvarBidangUsaha
            , ('GBvarSubBdngUsaha') : GBvarSubBdngUsaha, ('GBvarPekerjaan') : GBvarPekerjaan, ('GBvarNamaPerusahaan') : GBvarNamaPerusahaan
            , ('GBvarNationalityPeruahaan') : GBvarNationalityPeruahaan, ('GBvarWebsite') : GBvarWebsite, ('GBvarJenisAkunSosmed') : GBvarJenisAkunSosmed
            , ('GBvarSosmed') : GBvarSosmed, ('GBvarStatusKaryawan') : GBvarStatusKaryawan, ('GBvarDepartemen') : GBvarDepartemen
            , ('GBvarAlamatKantor') : GBvarAlamatKantor, ('GBvarRT') : GBvarRT, ('GBvarRW') : GBvarRW, ('GBvarKodePos') : GBvarKodePos
            , ('GBvarPtnjkAlamat') : GBvarPtnjkAlamat, ('GBvarKodeArea') : GBvarKodeArea, ('GBvarTelepon') : GBvarTelepon
            , ('GBvarNIK') : GBvarNIK, ('GBvarEXT') : GBvarEXT], FailureHandling.STOP_ON_FAILURE)
}

CustomKeywords.'mobile.mobileSwipe.RightLeft'(0.9, 0.5, 1000)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.2, 0.8, 1000)

not_run: if (GvarUsahaTab == 'Ya') {
    WebUI.callTestCase(findTestCase('Data Entry/Guarantor/Guarantor - Usaha/MASTER FLOW/TC_Guarantor Usaha - MASTER FLOW'), 
        [('GUvarPekerjaan') : GUvarPekerjaan, ('GUvarBadanUsaha') : GUvarBadanUsaha, ('GUvarNamaUsaha') : GUvarNamaUsaha
            , ('GUvarBidangUsaha') : GUvarBidangUsaha, ('GUvarSubBidangUsaha') : GUvarSubBidangUsaha, ('GUvarAlamat') : GUvarAlamat
            , ('GUvarRT') : GUvarRT, ('GUvarRW') : GUvarRW, ('GUvarKodePos') : GUvarKodePos, ('GUvarPtnjkAlamat') : GUvarPtnjkAlamat
            , ('GUIvarTeleponseluler') : GUIvarTeleponseluler, ('GUvarWebsite') : GUvarWebsite, ('GUvarJenisSosmed') : GUvarJenisSosmed
            , ('GUvarSosmed') : GUvarSosmed], FailureHandling.STOP_ON_FAILURE)
}

