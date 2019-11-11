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

not_run: WebUI.callTestCase(findTestCase('Data Entry/Co-Borrower/Co-Borrower - Identitas/TC Co-borrower Identitas'), [('CIvarKTP') : CIvarKTP
        , ('CIvarNamaSesuaiIdentitas') : CIvarNamaSesuaiIdentitas, ('CIvarTempatLahir') : CIvarTempatLahir, ('CIvarAlamatLengkap') : CIvarAlamatLengkap
        , ('CIvarRT') : CIvarRT, ('CIvarRW') : CIvarRW, ('CIvarKodePos') : CIvarKodePos, ('CIvarAgama') : CIvarAgama, ('CIvarPerkawinan') : CIvarPerkawinan
        , ('CIvarNegaraAsal') : CIvarNegaraAsal, ('CIvarNomorPassport') : CIvarNomorPassport, ('CIvarKewarganegaraan') : CIvarKewarganegaraan
        , ('CIvarMasaBerlaku') : CIvarMasaBerlaku, ('CIvarVerifikasi') : CIvarVerifikasi], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.mobileSwipe.RightLeft'(0.9, 0.5, 1000)

not_run: CustomKeywords.'mobile.mobileSwipe.UpDown'(0.2, 0.8, 1000)

not_run: WebUI.callTestCase(findTestCase('Data Entry/Co-Borrower/Co-Borrower - Info Umum/TC Co-borrower Info Umum'), [('CIUvarNamaLengkap') : CIUvarNamaLengkap
        , ('CIUvarNPWP') : CIUvarNPWP, ('CIUvarNamaNPWP') : CIUvarNamaNPWP, ('CIUvarNamaIbu') : CIUvarNamaIbu, ('CIUvarPendidikan') : CIUvarPendidikan
        , ('CIUvarAlamatEmail') : CIUvarAlamatEmail, ('CIUvarNoTlp1') : CIUvarNoTlp1, ('CIUvarNoTlp2') : CIUvarNoTlp2, ('CIUvarHP') : CIUvarHP
        , ('CIUvarJenisAkunSosmed') : CIUvarJenisAkunSosmed, ('CIUvarAkunSosmed') : CIUvarAkunSosmed], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.mobileSwipe.RightLeft'(0.9, 0.5, 1000)

not_run: CustomKeywords.'mobile.mobileSwipe.UpDown'(0.2, 0.8, 1000)

not_run: WebUI.callTestCase(findTestCase('Data Entry/Co-Borrower/Co-Borrower - Domisili/TC Co-borrower Domisili'), [('CDvarAlamatLengkap') : CDvarAlamatLengkap
        , ('CDvarRT') : CDvarRT, ('CDvarRW') : CDvarRW, ('CDvarKodePos') : CDvarKodePos, ('CDvarNegaraDomisili') : CDvarNegaraDomisili
        , ('CDvarPetunjukAlamat') : CDvarPetunjukAlamat, ('CDvarNoTlp1') : CDvarNoTlp1, ('CDvarNoTlp2') : CDvarNoTlp2, ('CDvarTinggalSejakKapan') : CDvarTinggalSejakKapan
        , ('CDvarStatusTempatTinggal') : CDvarStatusTempatTinggal, ('CDvarDomisili') : CDvarDomisili], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.mobileSwipe.RightLeft'(0.9, 0.5, 1000)

Mobile.tap(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborower-Pekerjaan-DetailPekerjaanBar'), 0)

WebUI.callTestCase(findTestCase('Data Entry/Co-Borrower/Co-Borrower - Pekerjaan/TC Co-borrower pekerjaan Dupcek'), [:], 
    FailureHandling.STOP_ON_FAILURE)

not_run: if (CvarPekerjaanTab == 'Ya') {
    not_run: WebUI.callTestCase(findTestCase('Data Entry/Co-Borrower/Co-Borrower - Pekerjaan/TC Co-borrower pekerjaan Dupcek'), 
        [:], FailureHandling.STOP_ON_FAILURE)
}

not_run: CustomKeywords.'mobile.mobileSwipe.RightLeft'(0.9, 0.5, 1000)

not_run: if (CvarUsahaTab == 'Ya') {
    not_run: WebUI.callTestCase(findTestCase('Data Entry/Co-Borrower/Co-Borrower - Usaha/TC Co-borrower Usaha'), [('CUvarPekerjaan') : CUvarPekerjaan
            , ('CUvarBadanUsaha') : CUvarBadanUsaha, ('CUvarNamaPerusahaan') : CUvarNamaPerusahaan, ('CUvarBidangUsaha') : CUvarBidangUsaha
            , ('CUvarSubBidangUsaha') : CUvarSubBidangUsaha, ('CUvarAlamatKantor') : CUvarAlamatKantor, ('CUvarRT') : CUvarRT
            , ('CUvarRW') : CUvarRW, ('CUvarKodePos') : CUvarKodePos, ('CUvarPetunjukAlamat') : CUvarPetunjukAlamat, ('CUvarTlp1') : CUvarTlp1
            , ('CUvarTlp2') : CUvarTlp2, ('CUvarExt') : CUvarExt, ('CUvarHP') : CUvarHP, ('CUvarWebsite') : CUvarWebsite
            , ('CUvarAkunsosmed') : CUvarAkunsosmed, ('CUvarJenisSosmed') : CUvarJenisSosmed], FailureHandling.STOP_ON_FAILURE)
}

