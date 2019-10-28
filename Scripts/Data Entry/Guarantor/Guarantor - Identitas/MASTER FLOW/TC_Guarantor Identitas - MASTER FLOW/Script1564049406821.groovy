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

if (GIvarKewarganegaraan == 'WNI') {
    Mobile.tap(findTestObject('Guarantor/Guarantor - Identitas/Guarantor-Identitas-WNI'), 0)
} else {
    Mobile.tap(findTestObject('Guarantor/Guarantor - Identitas/Guarantor-Identitas-WNA'), 0)

    Mobile.setText(findTestObject('Guarantor/Guarantor - Identitas/Guarantor-Identitas-NegaraAsal'), GIvarNegaraAsal, 0)

    Mobile.tap(findTestObject('dynamic object/pickListItem_viewView', [('text') : GIvarNegaraAsal]), 0, FailureHandling.STOP_ON_FAILURE)
}

Mobile.setText(findTestObject('Guarantor/Guarantor - Identitas/Guarantor-Identitas-NomorIdentitas'), GIvarNIK, 0)

if (GIvarVerifikasi == 'Ya') {
    Mobile.tap(findTestObject('Guarantor/Guarantor - Identitas/Guarantor_Verifikasi KTP'), 0)

    CustomKeywords.'mobile.mobileSwipe.UpDown'(0.8, 0.2, 1000)
} else {
    if (GIvarMasaBerlaku == 'seumurhidup') {
        Mobile.tap(findTestObject('Guarantor/Guarantor - Identitas/Guarantor-Identitas-SeumurHidup'), 0)

        if (GIvarKewarganegaraan == 'WNA') {
            Mobile.setText(findTestObject('Guarantor/Guarantor - Identitas/Guarantor-Identitas-NoPassport'), GIVarNomorPassport, 
                0)

            Mobile.tap(findTestObject('Guarantor/Guarantor - Identitas/Guarantor-Identitas-TglBerakhirPassport'), 0)
        }
    } else {
        Mobile.tap(findTestObject('Guarantor/Guarantor - Identitas/Guarantor-Identitas-TidakSeumurHidup'), 0)

        Mobile.tap(findTestObject('Guarantor/Guarantor - Identitas/Guarantor-Identitas-TanggalBerakhirIdentitas'), 0)
    }
    
    Mobile.setText(findTestObject('Guarantor/Guarantor - Identitas/Guarantor_Nama Sesuai Identitas'), GIvarNamaSesuaiIdentitas, 
        0)

    if (GIvarJenisKelamin == 'perempuan') {
        Mobile.tap(findTestObject('Guarantor/Guarantor - Identitas/Guarantor-Identitas-Perempuan'), 0)
    } else {
        Mobile.tap(findTestObject('Guarantor/Guarantor - Identitas/Guarantor-Identitas-LakiLaki'), 0)
    }
    
    CustomKeywords.'mobile.mobileSwipe.UpDown'(0.7, 0.2, 1000)

    Mobile.setText(findTestObject('Guarantor/Guarantor - Identitas/Guarantor_Tempat Lahir'), GIvarTempatLahir, 0)

    Mobile.tap(findTestObject('Guarantor/Guarantor - Identitas/Guarantor_Tempat Lahir'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('dynamic object/pickListItem_viewView', [('text') : GIvarTempatLahir]), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Guarantor/Guarantor - Identitas/Guarantor_Tanggal Lahir'), 0)

    WebUI.callTestCase(findTestCase('dynamic test case/calendar'), [('varTahun') : GIvarTahun], FailureHandling.STOP_ON_FAILURE)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    not_run: WebUI.callTestCase(findTestCase('dynamic test case/calendar'), [('varTahun') : GIvarTahun], FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Guarantor/Guarantor - Identitas/Guarantor_Alamat Lengkap'), GIvarAlamatLengkap, 0)

    Mobile.setText(findTestObject('Guarantor/Guarantor - Identitas/Guarantor_RT'), GIvarRT, 0)

    Mobile.setText(findTestObject('Guarantor/Guarantor - Identitas/Guarantor_RW'), GIvarRW, 0)

    Mobile.setText(findTestObject('Guarantor/Guarantor - Identitas/Guarantor_KDPos'), GIvarKodePos, 0)

    Mobile.tap(findTestObject('Guarantor/Guarantor - Identitas/Guarantor_KDPos'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Guarantor/Guarantor - Identitas/Guarantor-Identitas-12420'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Guarantor/Guarantor - Identitas/Guarantor_Status Perkawinan'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : GIvarStatus]), 0, FailureHandling.STOP_ON_FAILURE)
}

Mobile.tap(findTestObject('Guarantor/Guarantor - Identitas/Guarantor-Identitas-Agama'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : GIvarAgama]), 0)

