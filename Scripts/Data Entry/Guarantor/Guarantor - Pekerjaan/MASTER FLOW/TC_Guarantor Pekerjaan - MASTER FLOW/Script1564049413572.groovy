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

Mobile.tap(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK Pekerjaan'), 0)

Mobile.setText(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK Pekerjaan'), GBvarPekerjaan, 0)

WebUI.delay(2)

Mobile.tap(findTestObject('dynamic object/pickListItem_viewView', [('text') : GBvarPekerjaan]), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK Jabatan'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : GBvarJabatan]), 0)

Mobile.setText(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK Departement'), GBvarDepartemen, 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK Status Karyawan'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : GBvarStatusKaryawan]), 0)

Mobile.setText(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK Nomor Induk Karyawan'), GBvarNIK, 0)

Mobile.tap(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK Bergabung Sejak'), 0)

WebUI.callTestCase(findTestCase('dynamic test case/calendar'), [('varTahun') : '2010'], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK Badan Usaha'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : GBvarBadanUsaha]), 0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.8, 0.2, 1000)

Mobile.setText(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK Nama Perusahaan'), GBvarNamaPerusahaan, 0)

Mobile.setText(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK Bidang Usaha'), GBvarBidangUsaha, 0)

Mobile.tap(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK Bidang Usaha'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('dynamic object/pickListItem_viewView', [('text') : GBvarBidangUsaha]), 0)

Mobile.tap(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK Sub Bidang Usaha'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : GBvarSubBdngUsaha]), 0)

Mobile.setText(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK Natiolity Perusahaan'), GBvarNationalityPeruahaan, 
    0)

Mobile.tap(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK Natiolity Perusahaan'), 0)

Mobile.tap(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK LOV Nationality Perusahaan'), 0)

Mobile.setText(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK Website'), GBvarWebsite, 0)

Mobile.tap(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK Jenis Akun Sosial Media'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : GBvarJenisAkunSosmed]), 0)

Mobile.setText(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK Akun Sosial Media'), GBvarSosmed, 0)

Mobile.tap(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_TabAlamatKantor'), 0)

Mobile.setText(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK Alamat Kantor'), GBvarAlamatKantor, 0)

Mobile.setText(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK RT'), GBvarRT, 0)

Mobile.setText(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK RW'), GBvarRW, 0)

Mobile.setText(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK Kode Pos'), GBvarKodePos, 0)

Mobile.tap(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK Kode Pos'), 0)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor-Pekerjaan-12420'), 0)

Mobile.setText(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK Petunjuk Alamat'), GBvarPtnjkAlamat, 0)

Mobile.setText(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK Kode Area'), GBvarKodeArea, 0)

Mobile.setText(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor_ PK No Telepon'), GBvarTelepon, 0)

Mobile.setText(findTestObject('Guarantor/Guarantor - Pekerjaan/Guarantor-Pekerjaan-Ext'), GBvarEXT, 0)

