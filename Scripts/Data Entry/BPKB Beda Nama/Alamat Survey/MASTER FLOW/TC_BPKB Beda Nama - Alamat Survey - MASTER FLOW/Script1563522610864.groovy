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

if (Survey_varAlamatSurveySamaDomisili == 'N') {
    Mobile.tap(findTestObject('BPKB Beda Nama/Alamat Survey/BPKBBedaNama_AlamatSurvey_BtnAlamatSurveyIdentitas - Tidak'), 
        0, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('BPKB Beda Nama/Alamat Survey/BPKBBedaNama_AlamatSurvey_InpAlamatLengkap'), Survey_varAlamatLengkap, 
        0)

    Mobile.setText(findTestObject('BPKB Beda Nama/Alamat Survey/BPKBBedaNama_AlamatSurvey_InpRT'), Survey_varRT, 0)

    Mobile.tap(findTestObject('BPKB Beda Nama/Alamat Survey/BPKBBedaNama_AlamatSurvey_InpRW'), 0)

    Mobile.setText(findTestObject('BPKB Beda Nama/Alamat Survey/BPKBBedaNama_AlamatSurvey_InpRW'), Survey_varRW, 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('BPKB Beda Nama/Alamat Survey/BPKBBedaNama_AlamatSurvey_InpKodePos'), Survey_varKodePos, 
        0)

    Mobile.tap(findTestObject('BPKB Beda Nama/Alamat Survey/BPKBBedaNama_AlamatSurvey_InpKodePos'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('BPKB Beda Nama/Alamat Survey/BPKBBedaNama_AlamatSurvey_LOVKodePos'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('BPKB Beda Nama/Alamat Survey/BPKBBedaNama_AlamatSurvey_InpNoTeleponFixedLine'), Survey_varNoTeleponFixedLine, 
        0)

    Mobile.setText(findTestObject('BPKB Beda Nama/Alamat Survey/BPKBBedaNama_AlamatSurvey_InpTeleponSeluler'), Survey_varTeleponSeluler, 
        0)

    Mobile.setText(findTestObject('BPKB Beda Nama/Alamat Survey/BPKBBedaNama_AlamatSurvey_PetunjukAlamat'), Survey_varPetunjukAlamat, 
        0)
}

