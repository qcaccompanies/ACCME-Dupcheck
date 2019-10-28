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

if (CDvarDomisili == 'Tidak') {
    Mobile.tap(findTestObject('Coborrower/Coborrower - Domisili/Coborrower-Domisili-Tidak'), 0)

    Mobile.setText(findTestObject('Coborrower/Coborrower - Domisili/Cobborower-Domisili-AlamatLengkap'), CDvarAlamatLengkap, 
        0)

    Mobile.setText(findTestObject('Coborrower/Coborrower - Domisili/Cobborower-Domisili-RT'), CDvarRT, 0)

    Mobile.setText(findTestObject('Coborrower/Coborrower - Domisili/Cobborower-Domisili-RW'), CDvarRW, 0)

    Mobile.setText(findTestObject('Coborrower/Coborrower - Domisili/Cobborower-Domisili-KodePOs'), CDvarKodePos, 0)

    Mobile.tap(findTestObject('Coborrower/Coborrower - Domisili/Cobborower-Domisili-KodePOs'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Coborrower/Coborrower - Domisili/Cobborower-Domisili-12420'), 0)
} else {
    Mobile.tap(findTestObject('Coborrower/Coborrower - Domisili/Coborrower-Domisili-YaDomisili'), 0)
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Coborrower/Coborrower - Domisili/Coborrower-Domisili-NegaraDomisili'), CDvarNegaraDomisili, 
    0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.7, 0.3, 1000)

Mobile.tap(findTestObject('Coborrower/Coborrower - Domisili/Coborrower-Domisili-NegaraDomisili'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('dynamic object/pickListItem_viewView', [('text') : CDvarNegaraDomisili]), 0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.8, 0.5, 1000)

Mobile.tap(findTestObject('Coborrower/Coborrower - Domisili/Coborrower-Domisili-TinggalSejakTahun (1)'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : CDvarTinggalSejakKapan]), 0)

Mobile.tap(findTestObject('Coborrower/Coborrower - Domisili/Coborrower-Domisili-StatusTempatTinggal'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : CDvarStatusTempatTinggal]), 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Domisili/Coborrower-Domisili-NoTelepon1'), CDvarNoTlp1, 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Domisili/Coborrower-Domisili-NoTelepon2'), CDvarNoTlp2, 0)

