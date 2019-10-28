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

WebUI.callTestCase(findTestCase('dynamic test case/open application'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(60)

WebUI.callTestCase(findTestCase('Data Entry/Borrower/Flow Borrower'), [('BvarPekerjaanTab') : 'Ya', ('BvarUsahaTab') : 'Ya'
        , ('BIvarTahun') : '1994', ('BIvarNoKTP') : '3471095110940001', ('BIvarNamaSesuaiIdentitas') : 'FRANSISKA MAYA LESTARI'
        , ('BIvarTempatLahir') : 'ACEH', ('BIvarAlamatLengkap') : 'asdasdadasd', ('BIvarRT') : '091', ('BIvarRW') : '089'
        , ('BIvarKodePos') : '12420', ('BIvarAgama') : 'ISLAM', ('BIvarStatusPerkawinan') : 'MARRIED', ('BIvarNegaraAsal') : 'AUSTRALIA'
        , ('BIvarNomorPassport') : '34526729927762', ('BIvarKewarganegaraan') : 'WNI', ('BIvarMasaBerlaku') : 'seumurhidup'
        , ('BIvarJenisKelamin') : 'perempuan', ('BIvarVerifikasi') : 'Ya', ('BIUvarNamaLengkapTanpaSingkatan') : 'FRANSISKA MAYA LESTARI'
        , ('BIUvarNamaPanggilan') : 'MAYA', ('BIUvarNoNPWP') : '192487192471924', ('BIUvarNamaNPWP') : 'wwkwkwkwk', ('BIUvarNamaIbuKandung') : 'yuhuu'
        , ('BIUvarPendidikan') : 'DIPLOMA 2', ('BIUvarAlamatEmail') : 'wkwkw@a.c', ('BIUvarSumberDanaUangMuka') : 'HIBAH'
        , ('BIUvarSumberDanaAngsuran') : 'TABUNGAN', ('BIUvarKepemilikanDana') : 'BORROWER', ('BIUvarAlamatMenyurat') : 'Domisili'
        , ('BDvarAlamatLengkap') : 'sdasdasdasd', ('BDvarRT') : '123', ('BDvarRW') : '345', ('BDvarKodePos') : '10124', ('BDvarNegaraDomisili') : 'INDONESIA'
        , ('BDvarPetunjukAlamat') : 'sfsdfsfsdfs', ('BDvarNoTelponFixedLine') : '2132132', ('BDvarKodeArea') : '021', ('BDvarTinggalSejakTahun') : '2000'
        , ('BDvarStatusTempatTinggal') : 'KOST', ('BDvarTelponSelular') : '012938178923', ('BDvarDomisili') : 'Tidak', ('BDvarROAO') : 'Tidak'
        , ('BPvarPekerjaan') : 'ANGGOTA MILITER', ('BPvarJabatan') : 'DOKTER', ('BPvarDepartemen') : 'SALES', ('BPvarStatusKaryawan') : 'TETAP'
        , ('BPvarNoIndukKaryawan') : '2434234', ('BPvarBergabungSejak') : '2000', ('BPvarBadanUsaha') : 'CV', ('BPvarNamaPerusahaan') : 'ADASDADAS'
        , ('BPvarBidangUsaha') : 'ASURANSI', ('BPvarSubBidangUsaha') : 'ASURANSI DAN DANA PENSIUN', ('BPvarNationalityPerusahaan') : 'INDONESIA'
        , ('BPvarWebsite') : 'www.hahahahha.com', ('BPvarJenisAkunSosialMedia') : 'FACEBOOK', ('BPvarAkunSosialMedia') : 'yeyeye'
        , ('BPvarAlamatKantor') : 'asdasdasdasd', ('BPvarRT') : '231', ('BPvarRW') : '222', ('BPvarKodePos') : '10124', ('BPvarPetunjukAlamat') : 'petunjuuuuuukkk'
        , ('BPvarKodeArea') : '021', ('BPvarNoTeleponKantor') : '123123', ('BPvarEXT') : '23', ('BPvarTeleponSeluler') : '08142334'
        , ('BUvarPekerjaan') : 'PENGUSAHA', ('BUvarBadanUsaha') : 'CV', ('BUvarNamaUsaha') : 'pengusaha kaya', ('BUvarBidangUsaha') : 'ANGKUTAN DAN TRANSPORTASI'
        , ('BUvarSubBidangUsaha') : 'ANGKUTAN SUNGAI DAN DANAU', ('BUvarTanggalMulaiBisnis') : '2000', ('BUvarAlamatKantor') : 'askjldajsljd'
        , ('BUvarKodePos') : '10124', ('BUvarRT') : '123', ('BUvarRW') : '267', ('BUvarPetunjukAlamat') : 'phetunjuuukkk'
        , ('BUvarKodeArea') : '021', ('BUvarNoTelponKantor') : '234234', ('BUvarTeleponSeluler') : '0812121213', ('BUvarWebsite') : '2132133123123'
        , ('BUvarJenisAkunSosialMedia') : 'FACEBOOK', ('BUvarAkunSosialMedia') : 'wkwkwkkwkwk', ('BUvarEXT') : '335', ('BUvarSesuaiDomisili') : 'Ya'
        , ('BEvarNamaLengkap') : 'sdasdasdasdasdasdasd', ('BEvarHubungan') : 'SAUDARA IPAR', ('BEvarAlamat') : 'aalamatss'
        , ('BEvarRT') : '458', ('BEvarRW') : '223', ('BEvarKodePos') : '10124', ('BEvarKodeArea') : '021', ('BEvarNoTelponKantor') : '344534'
        , ('BEvarEXT') : '344', ('BEvarTeleponSelular') : '0817171717', ('BEvarEmail') : 'ajdalsjdk@a.c'], FailureHandling.STOP_ON_FAILURE)

if (AllStatusPerkawinan == 'Married') {
    WebUI.callTestCase(findTestCase('Data Entry/Co-Borrower/Flow Coborrower'), [('CvarPekerjaanTab') : '', ('CvarUsahaTab') : ''
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
}

if (AllGuarantor == 'Ya') {
    WebUI.callTestCase(findTestCase('Data Entry/Guarantor/Flow Guarantor'), [('GvarPekerjaanTab') : '', ('GvarUsahaTab') : ''
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
}

