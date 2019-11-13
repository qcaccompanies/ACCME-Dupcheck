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

//simulasi kredit
WebUI.callTestCase(findTestCase('dynamic test case/open application'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Data Entry/Simulasi Kredit/Simulasi Kredit/MASTER FLOW/TC_Simulasi Kredit - MASTER FLOW'), 
    [('varBrand') : varBrand, ('varType') : varType, ('varModel') : varModel, ('varTahun') : varTahun, ('varTenor') : varTenor
        , ('varOTR') : varOTR, ('varRP') : varRP, ('varDealer') : varDealer, ('varSales') : varSales, ('varPembiayaan') : varPembiayaan], 
    FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Data Entry/Simulasi Kredit/Simulasi Kredit - Asuransi/MASTER FLOW/TC_Asuransi - MASTER FLOW'), 
    [('varAsuransi') : varAsuransi, ('varKodeWilayah') : varKodeWilayah], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Data Entry/Simulasi Kredit/Kategori Loan/MASTER FLOW/TC_Kategori Loan - Master FLOW'), 
    [('varOpsiNPWP') : varOpsiNPWP], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Data Entry/Simulasi Kredit/Loan Detail/MASTER FLOW/TC_Loan Detail - MASTER FLOW'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Data Entry/Upload Document/Borrower/MASTER FLOW/TC_Upload Document - borrower - MASTER FLOW'), 
    [('Borrower_varKTP') : Borrower_varKTP], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('dynamic object/BtnBerikutnya'), 0)

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Data Entry/Borrower/Flow Borrower'), [('BIvarNoKTP') : BIvarNoKTP, ('BIvarAgama') : BIvarAgama
        , ('BIvarStatusPerkawinan') : BIvarStatusPerkawinan, ('BEvarRT') : BEvarRT, ('BEvarRW') : BEvarRW, ('BIvarNama') : BIvarNama
        , ('BIvarTempatLahir') : BIvarTempatLahir, ('BIvarTahun') : BIvarTahun], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('dynamic object/BtnBerikutnya'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

not_run: inpKTP = Mobile.getText(findTestObject('Coborrower/Coborrower - Identitas/Coborrower-Identitas-inputKTP'), 0)

not_run: if (Mobile.verifyNotEqual(inpKTP, '', FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('Data Entry/Co-Borrower/Flow Coborrower'), [('CvarPekerjaanTab') : 'Ya', ('CvarUsahaTab') : 'Ya'
            , ('CIvarKTP') : '3471095110940001', ('CIvarNamaSesuaiIdentitas') : 'Fransiska Maya Lestari', ('CIvarTempatLahir') : 'YOGYAKARTA'
            , ('CIvarAlamatLengkap') : 'Keparakan Kidul MG 1 / 1075', ('CIvarRT') : '11', ('CIvarRW') : '11', ('CIvarKodePos') : '12420'
            , ('CIvarAgama') : 'KATOLIK', ('CIvarPerkawinan') : 'MARRIED', ('CIvarNegaraAsal') : 'AUSTRALIA', ('CIvarNomorPassport') : '34526729927762'
            , ('CIvarKewarganegaraan') : 'WNI', ('CIvarMasaBerlaku') : 'seumurhidup', ('CIvarVerifikasi') : 'Ya', ('CIUvarNamaLengkap') : 'Fransiska Maya Lestari'
            , ('CIUvarNPWP') : '826819583541000', ('CIUvarNamaNPWP') : 'Fransiska Maya Lestari', ('CIUvarNamaIbu') : 'Astri'
            , ('CIUvarPendidikan') : 'S-1', ('CIUvarAlamatEmail') : 'mcaesagustay@gmail.com', ('CIUvarNoTlp1') : '021', ('CIUvarNoTlp2') : '6289211'
            , ('CIUvarHP') : '089627266744', ('CIUvarJenisAkunSosmed') : 'INSTAGRAM', ('CIUvarAkunSosmed') : '@tharamcy'
            , ('CDvarAlamatLengkap') : 'jl wahyu 1 no 18 jakarta selatan', ('CDvarRT') : '11', ('CDvarRW') : '11', ('CDvarKodePos') : '12420'
            , ('CDvarNegaraDomisili') : 'INDONESIA', ('CDvarPetunjukAlamat') : 'seberang pasar', ('CDvarNoTlp1') : '021'
            , ('CDvarNoTlp2') : '653557', ('CDvarTinggalSejakKapan') : '1964', ('CDvarStatusTempatTinggal') : 'MILIK KELUARGA'
            , ('CDvarDomisili') : 'Ya', ('CPvarPekerjaan') : 'KARYAWAN SWASTA', ('CPvarDepartemen') : 'KEUANGAN', ('CPvarJabatan') : 'MARKETING'
            , ('CPvarStatusKaryawan') : 'TETAP', ('CPvarNIK') : '54327', ('CPvarBadanUsaha') : 'CV', ('CPvarNamaPerusahaan') : 'MARKETINGKU'
            , ('CPvarBidangUsaha') : 'ASURANSI', ('CPvarSubBidangUsaha') : 'ASURANSI DAN DANA PENSIUN', ('CPvarNationalityPerusahaan') : 'INDONESIA'
            , ('CPvarWebsite') : 'dokterku.com', ('CPvarJenisAkunSosmed') : 'INSTAGRAM', ('CPvarAkunSosmed') : '@dokterku'
            , ('CPvarAlamatKantor') : 'jl rs fatmawati no 9 jakarta selatan', ('CPvarRT') : '11', ('CPvarRW') : '11', ('CPvarKodePos') : '12420'
            , ('CPvarPetunjukAlamat') : 'seberang pasar\r\n', ('CPvarNoTlp1') : '021', ('CPvarNoTlp2') : '98727', ('CPvarNoExt') : '655'
            , ('CUvarPekerjaan') : 'PENGUSAHA', ('CUvarBadanUsaha') : 'CV', ('CUvarNamaPerusahaan') : 'ASURANSIBULAN', ('CUvarBidangUsaha') : 'ASURANSI'
            , ('CUvarSubBidangUsaha') : 'ASURANSI DAN DANA PENSIUN', ('CUvarAlamatKantor') : 'jl wahyu 1 no 18', ('CUvarRT') : '11'
            , ('CUvarRW') : '11', ('CUvarKodePos') : '12420', ('CUvarPetunjukAlamat') : 'seberang pasar', ('CUvarTlp1') : '021'
            , ('CUvarTlp2') : '647389', ('CUvarExt') : '234', ('CUvarHP') : '089725526722', ('CUvarWebsite') : 'asurnsibulan.com'
            , ('CUvarAkunsosmed') : '@ASURANSIBULAN', ('CUvarJenisSosmed') : 'INSTAGRAM'], FailureHandling.STOP_ON_FAILURE)

    Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('dynamic object/BtnBerikutnya'), 0)
} else {
    Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('dynamic object/BtnBerikutnya'), 0)
}

not_run: inpKTP = Mobile.getText(findTestObject('Guarantor/Guarantor - Identitas/Guarantor_Nomor Identitas'), 0)

not_run: if (Mobile.verifyNotEqual(inpKTP, '', FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('Data Entry/Guarantor/Flow Guarantor'), [('GvarPekerjaanTab') : 'Ya', ('GvarUsahaTab') : 'Ya'
            , ('GIvarNIK') : '3276051701950001', ('GIvarAgama') : 'ISLAM', ('GIvarStatus') : 'UNMARRIED', ('GIvarNamaSesuaiIdentitas') : 'Fransiska Maya Lestari'
            , ('GIvarTempatLahir') : 'YOGYAKARTA', ('GIvarAlamatLengkap') : 'Keparakan Kidul MG 1 / 1075', ('GIvarRT') : '11'
            , ('GIvarRW') : '11', ('GIvarKodePos') : '12420', ('GIvarNegaraAsal') : 'AUSTRALIA', ('GIvarNomorPassport') : '34526729927762'
            , ('GIvarKewarganegaraan') : 'WNI', ('GIvarMasaBerlaku') : 'seumurhidup', ('GIvarVerifikasi') : 'Ya', ('GIvarJenisKelamin') : 'perempuan'
            , ('GIUvarNamaLTS') : 'SAM SURYA', ('GIUvarNamaIbuK') : 'ANGELINA JOLIE', ('GIUvarPendidikan') : 'S1', ('GIUvarEmail') : 'SAMSURYAQC@GMAIL.COM'
            , ('GIUvarTseluler') : '085770037847', ('GIUvarAkunsosmed') : 'FACEBOOK', ('GIUvarSosmed') : 'SAMSURYA', ('GIUvarNoNPWP') : '565657575689564'
            , ('GIUvarNamaNPWP') : 'SAM SURYA', ('GIUvarKodeArea') : '021', ('GIUvarTelepon') : '837892', ('GDvarNegara') : 'INDONESIA'
            , ('GDvarPtjkAlamat') : 'DEKAT INDOMARET', ('GDvarTngglSejakTahun') : '1961', ('GDvarStatusTT') : 'MILIK SENDIRI LUNAS'
            , ('GDvarAlamatLengkap') : 'jl wahyu 1 no 18 jakarta selatan', ('GDvarRT') : '11', ('GDvarRW') : '11', ('GDvarKodePos') : '12420'
            , ('GDvarNoTlp1') : '021', ('GDvarNoTlp2') : '653557', ('GDvarDomisili') : 'Tidak', ('GBvarJabatan') : 'DOKTER'
            , ('GBvarBadanUsaha') : 'APOTIK', ('GBvarBidangUsaha') : 'INDUSTRI ALAT KEDOKTERAN', ('GBvarSubBdngUsaha') : 'INDUSTRI PERALATAN KEDOKTERAN'
            , ('GBvarPekerjaan') : 'ANGGOTA MILITER', ('GBvarNamaPerusahaan') : 'PT SEHAT SEJAHTERA', ('GBvarNationalityPeruahaan') : 'INDONESIA'
            , ('GBvarWebsite') : 'SEHATKU.CO.ID', ('GBvarJenisAkunSosmed') : 'FACEBOOK', ('GBvarSosmed') : 'SEHATKU', ('GBvarStatusKaryawan') : 'TETAP'
            , ('GBvarDepartemen') : 'KESEHATAN', ('GBvarAlamatKantor') : 'JLN SEJAHTERA', ('GBvarRT') : '03', ('GBvarRW') : '28'
            , ('GBvarKodePos') : '1642', ('GBvarPtnjkAlamat') : 'DEKAT SEKOLAH SDN 99 ', ('GBvarKodeArea') : '021', ('GBvarTelepon') : '1917161514'
            , ('GBvarNIK') : '181716', ('GBvarEXT') : '535', ('GUvarPekerjaan') : 'PENGUSAHA', ('GUvarBadanUsaha') : 'CV'
            , ('GUvarNamaUsaha') : 'BERUSAHACO', ('GUvarBidangUsaha') : 'ANGKUTAN DAN TRANSPORTASI', ('GUvarSubBidangUsaha') : 'ANGKUTAN PENYEBERANG DOMESTIK'
            , ('GUvarAlamat') : 'JLN KEBANGSAAN', ('GUvarRT') : '09', ('GUvarRW') : '10', ('GUvarKodePos') : '21462', ('GUvarPtnjkAlamat') : 'DEKAT ALFAMART'
            , ('GUIvarTeleponseluler') : '08912345678', ('GUvarWebsite') : 'MAJUTERUS.CO.ID', ('GUvarJenisSosmed') : 'FACEBOOK'
            , ('GUvarSosmed') : 'MAJUTERUS'], FailureHandling.STOP_ON_FAILURE)

    Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('dynamic object/BtnBerikutnya'), 0)
} else {
    Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('dynamic object/BtnBerikutnya'), 0)
}

not_run: Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Data Entry/Guarantor/Flow Guarantor'), [('GvarPekerjaanTab') : 'Ya', ('GvarUsahaTab') : 'Ya'
        , ('GIvarNIK') : '3276051701950001', ('GIvarAgama') : 'ISLAM', ('GIvarStatus') : 'UNMARRIED', ('GIvarNamaSesuaiIdentitas') : 'Fransiska Maya Lestari'
        , ('GIvarTempatLahir') : 'YOGYAKARTA', ('GIvarAlamatLengkap') : 'Keparakan Kidul MG 1 / 1075', ('GIvarRT') : '11'
        , ('GIvarRW') : '11', ('GIvarKodePos') : '12420', ('GIvarNegaraAsal') : 'AUSTRALIA', ('GIvarNomorPassport') : '34526729927762'
        , ('GIvarKewarganegaraan') : 'WNI', ('GIvarMasaBerlaku') : 'seumurhidup', ('GIvarVerifikasi') : 'Ya', ('GIvarJenisKelamin') : 'perempuan'
        , ('GIUvarNamaLTS') : 'SAM SURYA', ('GIUvarNamaIbuK') : 'ANGELINA JOLIE', ('GIUvarPendidikan') : 'S1', ('GIUvarEmail') : 'SAMSURYAQC@GMAIL.COM'
        , ('GIUvarTseluler') : '085770037847', ('GIUvarAkunsosmed') : 'FACEBOOK', ('GIUvarSosmed') : 'SAMSURYA', ('GIUvarNoNPWP') : '565657575689564'
        , ('GIUvarNamaNPWP') : 'SAM SURYA', ('GIUvarKodeArea') : '021', ('GIUvarTelepon') : '837892', ('GDvarNegara') : 'INDONESIA'
        , ('GDvarPtjkAlamat') : 'DEKAT INDOMARET', ('GDvarTngglSejakTahun') : '1961', ('GDvarStatusTT') : 'MILIK SENDIRI LUNAS'
        , ('GDvarAlamatLengkap') : 'jl wahyu 1 no 18 jakarta selatan', ('GDvarRT') : '11', ('GDvarRW') : '11', ('GDvarKodePos') : '12420'
        , ('GDvarNoTlp1') : '021', ('GDvarNoTlp2') : '653557', ('GDvarDomisili') : 'Tidak', ('GBvarJabatan') : 'DOKTER', ('GBvarBadanUsaha') : 'APOTIK'
        , ('GBvarBidangUsaha') : 'INDUSTRI ALAT KEDOKTERAN', ('GBvarSubBdngUsaha') : 'INDUSTRI PERALATAN KEDOKTERAN', ('GBvarPekerjaan') : 'ANGGOTA MILITER'
        , ('GBvarNamaPerusahaan') : 'PT SEHAT SEJAHTERA', ('GBvarNationalityPeruahaan') : 'INDONESIA', ('GBvarWebsite') : 'SEHATKU.CO.ID'
        , ('GBvarJenisAkunSosmed') : 'FACEBOOK', ('GBvarSosmed') : 'SEHATKU', ('GBvarStatusKaryawan') : 'TETAP', ('GBvarDepartemen') : 'KESEHATAN'
        , ('GBvarAlamatKantor') : 'JLN SEJAHTERA', ('GBvarRT') : '03', ('GBvarRW') : '28', ('GBvarKodePos') : '1642', ('GBvarPtnjkAlamat') : 'DEKAT SEKOLAH SDN 99 '
        , ('GBvarKodeArea') : '021', ('GBvarTelepon') : '1917161514', ('GBvarNIK') : '181716', ('GBvarEXT') : '535', ('GUvarPekerjaan') : 'PENGUSAHA'
        , ('GUvarBadanUsaha') : 'CV', ('GUvarNamaUsaha') : 'BERUSAHACO', ('GUvarBidangUsaha') : 'ANGKUTAN DAN TRANSPORTASI'
        , ('GUvarSubBidangUsaha') : 'ANGKUTAN PENYEBERANG DOMESTIK', ('GUvarAlamat') : 'JLN KEBANGSAAN', ('GUvarRT') : '09'
        , ('GUvarRW') : '10', ('GUvarKodePos') : '21462', ('GUvarPtnjkAlamat') : 'DEKAT ALFAMART', ('GUIvarTeleponseluler') : '08912345678'
        , ('GUvarWebsite') : 'MAJUTERUS.CO.ID', ('GUvarJenisSosmed') : 'FACEBOOK', ('GUvarSosmed') : 'MAJUTERUS'], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('dynamic object/BtnBerikutnya'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Data Entry/Penghasilan/MASTER FLOW/TC_Penghasilan - MASTER FLOW'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('dynamic object/BtnBerikutnya'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('dynamic object/BtnBerikutnya'), 0)

WebUI.callTestCase(findTestCase('Data Entry/Summary Outstanding/MASTER FLOW/TC_Summary Outstanding - MASTER FLOW'), [:], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.delay(60, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

