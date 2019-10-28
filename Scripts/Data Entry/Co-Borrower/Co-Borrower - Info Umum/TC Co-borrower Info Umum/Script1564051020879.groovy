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

Mobile.setText(findTestObject('Coborrower/Coborrower - Info Umum/Coborrower-InfoUmum-NamaLengkap'), CIUvarNamaLengkap, 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Info Umum/Coborrower-InfoUmum-NoNPWP'), CIUvarNPWP, 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Info Umum/Coborrower-InfoUmum-NamaNPWP'), CIUvarNamaNPWP, 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Info Umum/Coborrower-InfoUmum-NamaIbu'), CIUvarNamaIbu, 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Coborrower/Coborrower - Info Umum/Coborrower-InfoUmum-Pendidikan (1)'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : CIUvarPendidikan]), 0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.8, 0.2, 1000)

Mobile.setText(findTestObject('Coborrower/Coborrower - Info Umum/Coborrower-InfoUmum-AlamatEmail'), CIUvarAlamatEmail, 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Info Umum/Coborrower-InfoUmum-NoTelepon1'), CIUvarNoTlp1, 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Info Umum/Coborrower-InfoUmum-NoTelepon2'), CIUvarNoTlp2, 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Info Umum/Coborrower-InfoUmum-NoHP'), CIUvarHP, 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Coborrower/Coborrower - Info Umum/Coborrower-InfoUmum-JenisSosmed'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : CIUvarJenisAkunSosmed]), 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Info Umum/Coborrower-InfoUmum-AkunSosmed'), CIUvarAkunSosmed, 0)

