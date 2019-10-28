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

switch (varOpsiNPWP.toString()) {
    case 'Ya':
        Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Kategori Loan/KategoriLoan_Opsi NPWP Terlampir'), 0)

        break
    case 'Approval':
        Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Kategori Loan/KategoriLoan_Opsi NPWP Approval'), 0)

        break
    case 'AdminSubsidiBalik':
        Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Kategori Loan/KategoriLoan_Opsi NPWP ASB'), 0)

        break
    case 'Others':
        Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Kategori Loan/KategoriLoan_Opsi NPWP Others'), 0)

        break
}

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Simulasi Kredit/Simulasi Kredit - Kategori Loan/KategoriLoan_Berikutnya'), 0)

