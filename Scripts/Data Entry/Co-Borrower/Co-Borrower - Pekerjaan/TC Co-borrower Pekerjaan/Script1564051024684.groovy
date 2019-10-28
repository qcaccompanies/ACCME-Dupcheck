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

Mobile.setText(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborower-Pekerjaan-Pekerjaan1'), CPvarPekerjaan, 0)

Mobile.tap(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborower-Pekerjaan-Pekerjaan1'), 0, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-KaryawanSwasta'), 0)

CustomKeywords.'mobile.picklist.List'(findTestObject('dynamic object/pickListItem_viewView', [('text') : CPvarPekerjaan]), 
    FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-Jabatan'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : CPvarJabatan]), 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-Departemen'), CPvarDepartemen, 0)

Mobile.tap(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-StatusKaryawan'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : CPvarStatusKaryawan]), 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-NIK'), CPvarNIK, 0)

Mobile.tap(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-Bergabung sejak'), 0)

WebUI.callTestCase(findTestCase('dynamic test case/calendar'), [('varTahun') : '2010'], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-BadanUsaha'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : CPvarBadanUsaha]), 0)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.8, 0.2, 1000)

Mobile.setText(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-NamaPerusahaan'), CPvarNamaPerusahaan, 
    0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-BidangUSaha'), CPvarBidangUsaha, 0)

Mobile.tap(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-BidangUSaha'), 0)

Mobile.tap(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-ASURANSI'), 0)

Mobile.tap(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-SubBidangUsaha'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : CPvarSubBidangUsaha]), 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-NationalityPerusahaan'), CPvarNationalityPerusahaan, 
    0)

Mobile.tap(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-NationalityPerusahaan'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_viewView', [('text') : CPvarNationalityPerusahaan]), 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-Website'), CPvarWebsite, 0)

Mobile.tap(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-JenisSosmed'), 0)

Mobile.tap(findTestObject('dynamic object/pickListItem_checkedTextView', [('text') : CPvarJenisAkunSosmed]), 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-AkunSosmed'), CPvarAkunSosmed, 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborower-Pekerjaan-AlamatKantorBar'), 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-AlamatKantor'), CPvarAlamatKantor, 
    0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-RTKantor'), CPvarRT, 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-RWKantor'), CPvarRW, 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-KodePos'), CPvarKodePos, 0)

not_run: CustomKeywords.'mobile.mobileSwipe.UpDown'(0.5, 0.3, 1000)

Mobile.tap(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-KodePos'), 0)

Mobile.tap(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-InputanKodepos'), 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-PetunjukAlamat'), CPvarPetunjukAlamat, 
    0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-NoTelepon1'), CPvarNoTlp1, 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-NoTelepon2'), CPvarNoTlp2, 0)

Mobile.setText(findTestObject('Coborrower/Coborrower - Pekerjaan/Coborrower-Pekerjaan-Ext'), CPvarNoExt, 0)

