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

//simulasi kredit
WebUI.callTestCase(findTestCase('dynamic test case/open application'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Data Entry/Simulasi Kredit/Simulasi Kredit/MASTER FLOW/TC_Simulasi Kredit - MASTER FLOW'), 
    [('varBrand') : varBrand, ('varType') : varType, ('varModel') : varModel, ('varTahun') : varTahun, ('varTenor') : varTenor
        , ('varOTR') : varOTR, ('varRP') : varRP, ('varDealer') : varDealer, ('varSales') : varSales], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Data Entry/Simulasi Kredit/Simulasi Kredit - Asuransi/MASTER FLOW/TC_Asuransi - MASTER FLOW'), 
    [('varAsuransi') : varAsuransi, ('varKodeWilayah') : varKodeWilayah], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Data Entry/Simulasi Kredit/Kategori Loan/MASTER FLOW/TC_Kategori Loan - Master FLOW'), 
    [('varOpsiNPWP') : varOpsiNPWP], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Data Entry/Simulasi Kredit/Loan Detail/MASTER FLOW/TC_Loan Detail - MASTER FLOW'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Data Entry/Upload Document/Borrower/MASTER FLOW/TC_Upload Document - borrower - MASTER FLOW'), 
    [('Borrower_varKTP') : Borrower_varKTP], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.mobileSwipe.RightLeft'(0.9, 0.5, 1000)

Mobile.waitForElementPresent(findTestObject('dynamic object/BtnBerikutnya'), 0)

Mobile.tap(findTestObject('dynamic object/BtnBerikutnya'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Data Entry/Borrower/Flow Borrower'), [('BIvarNoKTP') : BIvarNoKTP, ('BIvarAgama') : BIvarAgama
        , ('BIvarStatusPerkawinan') : BIvarStatusPerkawinan, ('BEvarRT') : BEvarRT, ('BEvarRW') : BEvarRW, ('BEvarKodePos') : BEvarKodePos], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('dynamic object/BtnBerikutnya'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('dynamic object/BtnBerikutnya'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Data Entry/Penghasilan/MASTER FLOW/TC_Penghasilan - MASTER FLOW'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('dynamic object/BtnBerikutnya'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('dynamic object/BtnBerikutnya'), 0)

WebUI.callTestCase(findTestCase('Data Entry/Summary Outstanding/MASTER FLOW/TC_Summary Outstanding - MASTER FLOW'), [:], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Simulasi Kredit/Simulasi Kredit - Simulasi Kredit/SimulasiKredit_Btn Simulasi Kredit'), 
    60)

Mobile.closeApplication()

