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

WebUI.callTestCase(findTestCase('Data Entry/BPKB Beda Nama/Identitas/MASTER FLOW/TC_BPKB Beda Nama - Identitas - MASTER FLOW'), 
    [('BPKB_Identitas_varNomorIdentitas') : BPKB_Identitas_varNomorIdentitas, ('BPKB_Identitas_varNamaSesuaiIdentitas') : BPKB_Identitas_varNamaSesuaiIdentitas
        , ('BPKB_Identitas_varTempatLahir') : BPKB_Identitas_varTempatLahir, ('BPKB_Identitas_varAlamatLengkap') : BPKB_Identitas_varAlamatLengkap
        , ('BPKB_Identitas_varRT') : BPKB_Identitas_varRT, ('BPKB_Identitas_varRW') : BPKB_Identitas_varRW, ('BPKB_Identitas_varKodePos') : BPKB_Identitas_varKodePos
        , ('BPKB_Identitas_varAgama') : BPKB_Identitas_varAgama, ('BPKB_Identitas_varStatusPerkawinan') : BPKB_Identitas_varStatusPerkawinan
        , ('BPKB_Identitas_varKewarganegaraan') : BPKB_Identitas_varKewarganegaraan, ('BPKB_Identitas_varNegaraAsal') : BPKB_Identitas_varNegaraAsal
        , ('BPKB_Identitas_varNoPassport') : BPKB_Identitas_varNoPassport, ('BPKB_Identitas_varMasaBerlaku') : BPKB_Identitas_varMasaBerlaku], 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'mobile.mobileSwipe.RightLeft'(0.9, 0.5, 1000)

WebUI.callTestCase(findTestCase('Data Entry/BPKB Beda Nama/Alamat Survey/MASTER FLOW/TC_BPKB Beda Nama - Alamat Survey - MASTER FLOW'), 
    [('Survey_varAlamatLengkap') : Survey_varAlamatLengkap, ('Survey_varRT') : Survey_varRT, ('Survey_varRW') : Survey_varRW
        , ('Survey_varKodePos') : Survey_varKodePos, ('Survey_varNoTeleponFixedLine') : Survey_varNoTeleponFixedLine, ('Survey_varTeleponSeluler') : Survey_varTeleponSeluler
        , ('Survey_varPetunjukAlamat') : Survey_varvarPetunjukAlamat, ('Survey_varAlamatSurveySamaDomisili') : Survey_varAlamatSurveySamaDomisili], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('dynamic object/BtnBerikutnya'), 0)

