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
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

Mobile.waitForElementPresent(findTestObject('Coborrower/Coborrower - Identitas/Coborrower-Identitas-WNI'), 0)

if (CIvarKewarganegaraan == 'WNI') {
    Mobile.tap(findTestObject('Coborrower/Coborrower - Identitas/Coborrower-Identitas-WNI'), 0)
} else {
    Mobile.tap(findTestObject('Coborrower/Coborrower - Identitas/Coborrower-Identitas-WNA'), 0)

    Mobile.setText(findTestObject('Coborrower/Coborrower - Identitas/Coborrower-Identitas-NegaraAsal'), CIvarNegaraAsal, 
        0)

    Mobile.tap(findTestObject('dynamic object/pickListItem_viewView', [('text') : CIvarNegaraAsal]), 0, FailureHandling.STOP_ON_FAILURE)
}

Mobile.setText(findTestObject('Coborrower/Coborrower - Identitas/Coborrower-Identitas-inputKTP'), CIvarKTP, 0)

if (CIvarVerifikasi == 'Ya') {
    Mobile.tap(findTestObject('Coborrower/Coborrower - Identitas/Coborrower-Identitas-btnVerifikasi'), 0)

    CustomKeywords.'mobile.mobileSwipe.UpDown'(0.8, 0.2, 1000)
} else {
    if (CIvarMasaBerlaku == 'seumurhidup') {
        Mobile.tap(findTestObject('Coborrower/Coborrower - Identitas/Coborrower-Identitas-SeumurHidup'), 0)

        if (CIvarKewarganegaraan == 'WNA') {
            Mobile.setText(findTestObject('Coborrower/Coborrower - Identitas/Coborrower-Identitas-NomorPassport'), CIvarNomorPassport, 
                0)

            Mobile.tap(findTestObject('Coborrower/Coborrower - Identitas/Coborrower-Identitas-TanggalBerakhirPassport'), 
                0)
        }
    } else {
        Mobile.tap(findTestObject('Coborrower/Coborrower - Identitas/Coborrower-Identitas-Tidak'), 0)

        Mobile.tap(findTestObject('Coborrower/Coborrower - Identitas/Coborrower-Identitas-TanggalBerakhirIdentitas'), 0)
    }
    
    Mobile.setText(findTestObject('Coborrower/Coborrower - Identitas/Coborrower-Identitas-NamaSesuaiIdentitas'), CIvarNamaSesuaiIdentitas, 
        0)

    CustomKeywords.'mobile.mobileSwipe.UpDown'(0.8, 0.2, 1000)

    Mobile.setText(findTestObject('Coborrower/Coborrower - Identitas/Coborrower-Identitas-TempatLahir'), CIvarTempatLahir, 
        0)

    Mobile.tap(findTestObject('Coborrower/Coborrower - Identitas/Coborrower-Identitas-TempatLahir'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('dynamic object/pickListItem_viewView', [('text') : CIvarTempatLahir]), 0)

    Mobile.tap(findTestObject('Coborrower/Coborrower - Identitas/Coborrower-Identitas-TanggalLahir'), 0)

    WebUI.callTestCase(findTestCase('dynamic test case/calendar'), [('varTahun') : CIvarTahun], FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Coborrower/Coborrower - Identitas/coborrower-identitas-alamat'), CIvarAlamatLengkap, 
        0)

    Mobile.setText(findTestObject('Coborrower/Coborrower - Identitas/coborrower-identitas-rt'), CIvarRT, 0)

    Mobile.setText(findTestObject('Coborrower/Coborrower - Identitas/coborrower-identitas-rw'), CIvarRW, 0)

    Mobile.setText(findTestObject('Coborrower/Coborrower - Identitas/Coborrower-Identitas-Kodepos'), CIvarKodePos, 0)

    Mobile.tap(findTestObject('Coborrower/Coborrower - Identitas/Coborrower-Identitas-Kodepos'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Coborrower/Coborrower - Identitas/Coborrower-Identitas-12420'), 0)

    Mobile.tap(findTestObject('Coborrower/Coborrower - Identitas/Coborrower-Identitas-StatusPerkawinan'), 0)

    Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : CIvarPerkawinan]), 0)
}

Mobile.tap(findTestObject('Coborrower/Coborrower - Identitas/Coborrower-Identitas-Agama'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : CIvarAgama]), 0)

