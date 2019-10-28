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

if (BPKB_Identitas_varKewarganegaraan == 'WNA') {
    Mobile.tap(findTestObject('BPKB Beda Nama/Identitas/BPKBBedaNama_Identitas_BtnKewarganegaraan - WNA'), 0)

    Mobile.setText(findTestObject('BPKB Beda Nama/Identitas/BPKBBedaNama_Identitas_InpNegaraAsal'), BPKB_Identitas_varNegaraAsal, 
        0)

    Mobile.tap(findTestObject('BPKB Beda Nama/Identitas/BPKBBedaNama_Identitas_InpNegaraAsal'), 0, FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'mobile.picklist.List'(findTestObject('dynamic object/pickListItem_viewView', [('text') : BPKB_Identitas_varNegaraAsal]), 
        FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('BPKB Beda Nama/Identitas/BPKBBedaNama_Identitas_InpNoKitas'), BPKB_Identitas_varNomorIdentitas, 
        0)

    Mobile.sendKeys(findTestObject('BPKB Beda Nama/Identitas/BPKBBedaNama_Identitas_InpNomorPassport'), BPKB_Identitas_varNoPassport, 
        FailureHandling.STOP_ON_FAILURE)
}

if (BPKB_Identitas_varKewarganegaraan == 'WNI') {
    Mobile.tap(findTestObject('BPKB Beda Nama/Identitas/BPKBBedaNama_Identitas_BtnKewarganegaraan - WNI'), 0)

    Mobile.setText(findTestObject('BPKB Beda Nama/Identitas/BPKBBedaNama_InpNomorIdentitas'), BPKB_Identitas_varNomorIdentitas, 
        0)
}

if (BPKB_Identitas_varMasaBerlaku == 'SeumurHidup') {
    Mobile.tap(findTestObject('BPKB Beda Nama/Identitas/BPKBBedaNama_BtnMasaBerlaku - Seumur Hidup'), 0)
}

if (BPKB_Identitas_varMasaBerlaku == 'Tidak') {
    Mobile.tap(findTestObject('BPKB Beda Nama/Identitas/BPKBBedaNama_BtnMasaBerlaku - Tidak'), 0)
}

Mobile.setText(findTestObject('BPKB Beda Nama/Identitas/BPKBBedaNama_InpNamaSesuaiIdentitas'), BPKB_Identitas_varNamaSesuaiIdentitas, 
    0)

Mobile.setText(findTestObject('BPKB Beda Nama/Identitas/BPKBBedaNama_InpTempatLahir'), BPKB_Identitas_varTempatLahir, 0)

Mobile.tap(findTestObject('BPKB Beda Nama/Identitas/BPKBBedaNama_InpTempatLahir'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('dynamic object/pickListItem_viewView', [('text') : BPKB_Identitas_varTempatLahir]), 0)

Mobile.tap(findTestObject('BPKB Beda Nama/Identitas/BPKBBedaNama_TxtTanggalLahir'), 0)

Mobile.setText(findTestObject('BPKB Beda Nama/Identitas/BPKBBedaNama_InpAlamatLengkap'), BPKB_Identitas_varAlamatLengkap, 
    0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.7, 0.2, 1000)

Mobile.setText(findTestObject('BPKB Beda Nama/Identitas/BPKBBedaNama_InpRT'), BPKB_Identitas_varRT, 0)

Mobile.setText(findTestObject('BPKB Beda Nama/Identitas/BPKBBedaNama_InpRW'), BPKB_Identitas_varRW, 0)

Mobile.setText(findTestObject('BPKB Beda Nama/Identitas/BPKBBedaNama_InpKodePos'), BPKB_Identitas_varKodePos, 0)

Mobile.tap(findTestObject('BPKB Beda Nama/Identitas/BPKBBedaNama_InpKodePos'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('BPKB Beda Nama/Identitas/BPKBBedaNama_Identitas_LOVKodePos'), 0)

Mobile.tap(findTestObject('BPKB Beda Nama/Identitas/BPKBBedaNama_TxtAgama'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : BPKB_Identitas_varAgama]), 0)

Mobile.tap(findTestObject('BPKB Beda Nama/Identitas/BPKBBedaNama_TxtStatusPerkawinan'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : BPKB_Identitas_varStatusPerkawinan]), 
    0)

