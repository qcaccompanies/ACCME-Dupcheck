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

switch (varMetodePembayaran.toString()) {
    case 'Autodebet':
        Mobile.tap(findTestObject('Bank Account/Bank Account - Bank Account/BankAccount_BankAccount_BtnMetodePembayaran - AutoDebet'), 
            0)

        break
    case 'Giro':
        Mobile.tap(findTestObject('Bank Account/Bank Account - Bank Account/BankAccount_BankAccount_BtnMetodePembayaran - Giro'), 
            0)

        break
    case 'Other':
        Mobile.tap(findTestObject('Bank Account/Bank Account - Bank Account/BankAccount_BankAccount_BtnMetodePembayaran - Others'), 
            0)

        break
}

Mobile.setText(findTestObject('Bank Account/Bank Account - Bank Account/BankAccount_BankAccount_InpNamaCabang'), varNamaCabang, 
    0)

Mobile.tap(findTestObject('Bank Account/Bank Account - Bank Account/BankAccount_BankAccount_InpNamaCabang'), 0, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.picklist.List'(findTestObject('dynamic object/pickListItem_viewView', [('text') : varNamaCabang]), 
    FailureHandling.OPTIONAL)

Mobile.setText(findTestObject('Bank Account/Bank Account - Bank Account/BankAccount_BankAccount_InpNomorRekening'), varNomorRekening, 
    0)

Mobile.setText(findTestObject('Bank Account/Bank Account - Bank Account/BankAccount_BankAccount_InpNamaPemegangRekening'), 
    varNamaPemegangRekening, 0)

if (varPembukaanRekeningPermata == 'Y') {
    Mobile.tap(findTestObject('Bank Account/Bank Account - Bank Account/BankAccount_BankAccount_BtnPembukaanRekeningPermata - Ya'), 
        0)

    Mobile.tap(findTestObject('Bank Account/Bank Account - Bank Account/BankAccount_BankAccount_TxtSumberDanaBilaTidakBekerja'), 
        0)

    Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : varSumberDanaBilaTidakBekerja]), 
        0)
}

