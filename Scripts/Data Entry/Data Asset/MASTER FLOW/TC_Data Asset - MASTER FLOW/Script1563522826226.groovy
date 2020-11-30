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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Data Asset/DataAsset_TxtWarna'), 0)

not_run: Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : varWarna]), 0)

Mobile.setText(findTestObject('Data Asset/DataAsset_InpNomorRangka'), varNomorRangka, 0)

Mobile.setText(findTestObject('Data Asset/DataAsset_InpNomorMesin'), varNomorMesin, 0)

Mobile.setText(findTestObject('Data Asset/DataAsset_InpNamaBPKB'), varNamaBPKB, 0)

Mobile.setText(findTestObject('Data Asset/DataAsset_InpNomorBPKB'), varNomorBPKB, 0)

not_run: if (varBPKBBedaNama == 'Y') {
    Mobile.tap(findTestObject('Data Asset/DataAsset_CheckBPKBBedaNama'), 0)

    WebUI.callTestCase(findTestCase('Data Entry/BPKB Beda Nama/TC_BPKB Beda Nama - All Flow'), [('Survey_varAlamatLengkap') : Survey_varAlamatLengkap
            , ('Survey_varRT') : Survey_varRT, ('Survey_varRW') : Survey_varRW, ('Survey_varKodePos') : Survey_varKodePos
            , ('Survey_varNoTeleponFixedLine') : Survey_varNoTeleponFixedLine, ('Survey_varTeleponSeluler') : Survey_varTeleponSeluler
            , ('Survey_varvarPetunjukAlamat') : Survey_varvarPetunjukAlamat, ('Survey_varAlamatSurveySamaDomisili') : Survey_varAlamatSurveySamaDomisili
            , ('BPKB_Identitas_varNomorIdentitas') : BPKB_Identitas_varNomorIdentitas, ('BPKB_Identitas_varNamaSesuaiIdentitas') : BPKB_Identitas_varNamaSesuaiIdentitas
            , ('BPKB_Identitas_varTempatLahir') : BPKB_Identitas_varTempatLahir, ('BPKB_Identitas_varAlamatLengkap') : BPKB_Identitas_varAlamatLengkap
            , ('BPKB_Identitas_varRT') : BPKB_Identitas_varRT, ('BPKB_Identitas_varRW') : BPKB_Identitas_varRW, ('BPKB_Identitas_varKodePos') : BPKB_Identitas_varKodePos
            , ('BPKB_Identitas_varAgama') : BPKB_Identitas_varAgama, ('BPKB_Identitas_varStatusPerkawinan') : BPKB_Identitas_varStatusPerkawinan
            , ('BPKB_Identitas_varKewarganegaraan') : BPKB_Identitas_varKewarganegaraan, ('BPKB_Identitas_varNegaraAsal') : BPKB_Identitas_varNegaraAsal
            , ('BPKB_Identitas_varNoPassport') : BPKB_Identitas_varNoPassport, ('BPKB_Identitas_varMasaBerlaku') : BPKB_Identitas_varMasaBerlaku], 
        FailureHandling.STOP_ON_FAILURE)
}

Mobile.setText(findTestObject('Data Asset/DataAsset_InpNomorPolisiDepan'), varNomorPolisiDepan, 0)

Mobile.setText(findTestObject('Data Asset/DataAsset_InpNomorPolisiTengah'), varNomorPolisiTengah, 0)

Mobile.setText(findTestObject('Data Asset/DataAsset_InpNomorPolisiBelakang'), varNomorPolisiBelakang, 0)

not_run: Mobile.setText(findTestObject('Data Asset/DataAsset_InpNomorFaktur'), varNomorFaktur, 0)

Mobile.tap(findTestObject('Data Asset/DataAsset_TxtTanggalBerakhirSTNK'), 0)

Mobile.tap(findTestObject('setel_tanggal'), 0)

not_run: Mobile.setText(findTestObject('Data Asset/DataAsset_InpAlamat'), varAlamat, 0)

not_run: Mobile.setText(findTestObject('Data Asset/DataAsset_InpRT'), varRT, 0)

not_run: Mobile.setText(findTestObject('Data Asset/DataAsset_InpRW'), varRW, 0)

not_run: Mobile.setText(findTestObject('Data Asset/DataAsset_InpKodePos'), varKodePos, 0)

not_run: Mobile.tap(findTestObject('Data Asset/DataAsset_InpKodePos'), 0, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Data Asset/DataAsset_LOVKodePos'), 0, FailureHandling.STOP_ON_FAILURE)

