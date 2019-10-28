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

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Coborrower/Coborrower - Usaha/Coborrower-Usaha-Pekerjaan'), CUvarPekerjaan, 0)

Mobile.tap(findTestObject('Coborrower/Coborrower - Usaha/Coborrower-Usaha-Pekerjaan'), 0, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Coborrower/Coborrower - Usaha/usaha_lov usaha'), 0)

CustomKeywords.'mobile.picklist.List'(findTestObject('dynamic object/pickListItem_viewView', [('text') : CUvarPekerjaan]), 
    FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Coborrower/Coborrower - Usaha/Coborrower-Usaha-BadanUSaha'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : CUvarBadanUsaha]), 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Usaha/Coborrower-Usaha-NamaUsaha'), CUvarNamaPerusahaan, 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Usaha/Coborrower-Usaha-BidangUsaha'), CUvarBidangUsaha, 0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.8, 0.6, 1000)

Mobile.tap(findTestObject('Coborrower/Coborrower - Usaha/Coborrower-Usaha-BidangUsaha'), 0, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('dynamic object/pickListItem_viewView', [('text') : CUVarBidangUsaha]), 0)

Mobile.tap(findTestObject('Coborrower/Coborrower - Usaha/Coborrower-Usaha-Asuransi'), 0)

not_run: CustomKeywords.'mobile.picklist.List'(findTestObject('dynamic object/pickListItem_viewView', [('text') : VarPekerjaan]), 
    FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Coborrower/Coborrower - Usaha/Coborrower-Usaha-Sub-BidangUsaha'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : CUvarSubBidangUsaha]), 0)

Mobile.tap(findTestObject('Coborrower/Coborrower - Usaha/Coborrower-Usaha-TanggalMulaiBisnis'), 0)

WebUI.callTestCase(findTestCase('dynamic test case/calendar'), [('varTahun') : '2010'], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Coborrower/Coborrower - Usaha/Coborrower-Usaha-AlamatKantor'), CUvarAlamatKantor, 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Usaha/Coborrower-Usaha-RT'), CUvarRT, 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Usaha/Coborrower-Usaha-RW'), CUvarRW, 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Usaha/Coborrower-Usaha-KodePos'), CUvarKodePos, 0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.8, 0.5, 1000)

Mobile.tap(findTestObject('Coborrower/Coborrower - Usaha/Coborrower-Usaha-KodePos'), 0)

Mobile.tap(findTestObject('Coborrower/Coborrower - Usaha/Coborrower-Usaha-12420'), 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Usaha/Coborrower-Usaha-PetunjukAlamat'), CUvarPetunjukAlamat, 0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.8, 0.5, 1000)

Mobile.setText(findTestObject('Coborrower/Coborrower - Usaha/Coborrower-Usaha-Notelepon1'), CUvarTlp1, 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Usaha/Coborrower-Usaha-Notelepon2'), CUvarTlp2, 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Usaha/Coborrower-Usaha-Ext'), CUvarExt, 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Usaha/Coborrower-Usaha-TeleponSeluler'), CUvarHP, 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Usaha/Coborrower-Usaha-Website'), CUvarWebsite, 0)

Mobile.tap(findTestObject('Coborrower/Coborrower - Usaha/Coborrower-Usaha-JenisAkunSosmed'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : CUvarJenisSosmed]), 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Usaha/Coborrower-Usaha-AkunSosmed'), CUvarAkunsosmed, 0)

