package com.muktadir.currencyconverter.data.responseModel


import com.google.gson.annotations.SerializedName

data class LiveCurrencyResponseModel(
    @SerializedName("quotes")
    val quotes: Quotes,
    @SerializedName("source")
    val source: String, // USD
    @SerializedName("success")
    val success: Boolean, // true
    @SerializedName("timestamp")
    val timestamp: Int // 1652719144
) {
    data class Quotes(
        @SerializedName("USDAED")
        val uSDAED: Double, // 3.672987
        @SerializedName("USDAFN")
        val uSDAFN: Double, // 87.000427
        @SerializedName("USDALL")
        val uSDALL: Double, // 115.850453
        @SerializedName("USDAMD")
        val uSDAMD: Double, // 454.989533
        @SerializedName("USDANG")
        val uSDANG: Double, // 1.802724
        @SerializedName("USDAOA")
        val uSDAOA: Double, // 409.200802
        @SerializedName("USDARS")
        val uSDARS: Double, // 117.868428
        @SerializedName("USDAUD")
        val uSDAUD: Double, // 1.439835
        @SerializedName("USDAWG")
        val uSDAWG: Double, // 1.8
        @SerializedName("USDAZN")
        val uSDAZN: Double, // 1.70406
        @SerializedName("USDBAM")
        val uSDBAM: Double, // 1.874639
        @SerializedName("USDBBD")
        val uSDBBD: Double, // 2.01963
        @SerializedName("USDBDT")
        val uSDBDT: Double, // 87.574738
        @SerializedName("USDBGN")
        val uSDBGN: Double, // 1.878584
        @SerializedName("USDBHD")
        val uSDBHD: Double, // 0.377014
        @SerializedName("USDBIF")
        val uSDBIF: Int, // 2030
        @SerializedName("USDBMD")
        val uSDBMD: Int, // 1
        @SerializedName("USDBND")
        val uSDBND: Double, // 1.393929
        @SerializedName("USDBOB")
        val uSDBOB: Double, // 6.886927
        @SerializedName("USDBRL")
        val uSDBRL: Double, // 5.083201
        @SerializedName("USDBSD")
        val uSDBSD: Double, // 1.000278
        @SerializedName("USDBTC")
        val uSDBTC: Double, // 0.000033951599
        @SerializedName("USDBTN")
        val uSDBTN: Double, // 77.601576
        @SerializedName("USDBWP")
        val uSDBWP: Double, // 12.30363
        @SerializedName("USDBYN")
        val uSDBYN: Double, // 3.374548
        @SerializedName("USDBYR")
        val uSDBYR: Int, // 19600
        @SerializedName("USDBZD")
        val uSDBZD: Double, // 2.016275
        @SerializedName("USDCAD")
        val uSDCAD: Double, // 1.28812
        @SerializedName("USDCDF")
        val uSDCDF: Double, // 2001.00018
        @SerializedName("USDCHF")
        val uSDCHF: Double, // 1.003055
        @SerializedName("USDCLF")
        val uSDCLF: Double, // 0.031105
        @SerializedName("USDCLP")
        val uSDCLP: Double, // 858.620197
        @SerializedName("USDCNY")
        val uSDCNY: Double, // 6.786198
        @SerializedName("USDCOP")
        val uSDCOP: Int, // 4058
        @SerializedName("USDCRC")
        val uSDCRC: Double, // 671.622049
        @SerializedName("USDCUC")
        val uSDCUC: Int, // 1
        @SerializedName("USDCUP")
        val uSDCUP: Double, // 26.5
        @SerializedName("USDCVE")
        val uSDCVE: Double, // 106.325014
        @SerializedName("USDCZK")
        val uSDCZK: Double, // 23.739903
        @SerializedName("USDDJF")
        val uSDDJF: Double, // 177.6749
        @SerializedName("USDDKK")
        val uSDDKK: Double, // 7.13829
        @SerializedName("USDDOP")
        val uSDDOP: Double, // 55.196877
        @SerializedName("USDDZD")
        val uSDDZD: Double, // 146.249803
        @SerializedName("USDEGP")
        val uSDEGP: Double, // 18.270102
        @SerializedName("USDERN")
        val uSDERN: Double, // 15.000001
        @SerializedName("USDETB")
        val uSDETB: Double, // 51.493911
        @SerializedName("USDEUR")
        val uSDEUR: Double, // 0.95932
        @SerializedName("USDFJD")
        val uSDFJD: Double, // 2.224995
        @SerializedName("USDFKP")
        val uSDFKP: Double, // 0.818331
        @SerializedName("USDGBP")
        val uSDGBP: Double, // 0.81475
        @SerializedName("USDGEL")
        val uSDGEL: Double, // 2.99981
        @SerializedName("USDGGP")
        val uSDGGP: Double, // 0.818331
        @SerializedName("USDGHS")
        val uSDGHS: Double, // 7.500451
        @SerializedName("USDGIP")
        val uSDGIP: Double, // 0.818331
        @SerializedName("USDGMD")
        val uSDGMD: Double, // 53.649735
        @SerializedName("USDGNF")
        val uSDGNF: Double, // 8789.999702
        @SerializedName("USDGTQ")
        val uSDGTQ: Double, // 7.672696
        @SerializedName("USDGYD")
        val uSDGYD: Double, // 209.276246
        @SerializedName("USDHKD")
        val uSDHKD: Double, // 7.849855
        @SerializedName("USDHNL")
        val uSDHNL: Double, // 24.4897
        @SerializedName("USDHRK")
        val uSDHRK: Double, // 7.215796
        @SerializedName("USDHTG")
        val uSDHTG: Double, // 111.031237
        @SerializedName("USDHUF")
        val uSDHUF: Double, // 375.451036
        @SerializedName("USDIDR")
        val uSDIDR: Double, // 14677.05
        @SerializedName("USDILS")
        val uSDILS: Double, // 3.389935
        @SerializedName("USDIMP")
        val uSDIMP: Double, // 0.818331
        @SerializedName("USDINR")
        val uSDINR: Double, // 77.846036
        @SerializedName("USDIQD")
        val uSDIQD: Int, // 1460
        @SerializedName("USDIRR")
        val uSDIRR: Double, // 42399.999762
        @SerializedName("USDISK")
        val uSDISK: Double, // 132.48021
        @SerializedName("USDJEP")
        val uSDJEP: Double, // 0.818331
        @SerializedName("USDJMD")
        val uSDJMD: Double, // 155.033499
        @SerializedName("USDJOD")
        val uSDJOD: Double, // 0.708985
        @SerializedName("USDJPY")
        val uSDJPY: Double, // 129.139501
        @SerializedName("USDKES")
        val uSDKES: Double, // 116.305123
        @SerializedName("USDKGS")
        val uSDKGS: Double, // 82.442298
        @SerializedName("USDKHR")
        val uSDKHR: Double, // 4061.000347
        @SerializedName("USDKMF")
        val uSDKMF: Double, // 472.59985
        @SerializedName("USDKPW")
        val uSDKPW: Double, // 900.000222
        @SerializedName("USDKRW")
        val uSDKRW: Double, // 1282.289856
        @SerializedName("USDKWD")
        val uSDKWD: Double, // 0.30716
        @SerializedName("USDKYD")
        val uSDKYD: Double, // 0.833597
        @SerializedName("USDKZT")
        val uSDKZT: Double, // 432.868152
        @SerializedName("USDLAK")
        val uSDLAK: Double, // 13220.000295
        @SerializedName("USDLBP")
        val uSDLBP: Double, // 1517.000214
        @SerializedName("USDLKR")
        val uSDLKR: Double, // 349.3304
        @SerializedName("USDLRD")
        val uSDLRD: Double, // 151.549687
        @SerializedName("USDLSL")
        val uSDLSL: Double, // 16.170102
        @SerializedName("USDLTL")
        val uSDLTL: Double, // 2.95274
        @SerializedName("USDLVL")
        val uSDLVL: Double, // 0.60489
        @SerializedName("USDLYD")
        val uSDLYD: Double, // 4.815001
        @SerializedName("USDMAD")
        val uSDMAD: Double, // 10.13375
        @SerializedName("USDMDL")
        val uSDMDL: Double, // 18.9656
        @SerializedName("USDMGA")
        val uSDMGA: Double, // 3994.000207
        @SerializedName("USDMKD")
        val uSDMKD: Double, // 59.109354
        @SerializedName("USDMMK")
        val uSDMMK: Double, // 1852.02356
        @SerializedName("USDMNT")
        val uSDMNT: Double, // 3075.770799
        @SerializedName("USDMOP")
        val uSDMOP: Double, // 8.087721
        @SerializedName("USDMRO")
        val uSDMRO: Double, // 356.999828
        @SerializedName("USDMUR")
        val uSDMUR: Double, // 43.308164
        @SerializedName("USDMVR")
        val uSDMVR: Double, // 15.459855
        @SerializedName("USDMWK")
        val uSDMWK: Double, // 815.000177
        @SerializedName("USDMXN")
        val uSDMXN: Double, // 20.06791
        @SerializedName("USDMYR")
        val uSDMYR: Double, // 4.397999
        @SerializedName("USDMZN")
        val uSDMZN: Double, // 63.830045
        @SerializedName("USDNAD")
        val uSDNAD: Double, // 16.210172
        @SerializedName("USDNGN")
        val uSDNGN: Double, // 415.249898
        @SerializedName("USDNIO")
        val uSDNIO: Double, // 35.77012
        @SerializedName("USDNOK")
        val uSDNOK: Double, // 9.798399
        @SerializedName("USDNPR")
        val uSDNPR: Double, // 124.162521
        @SerializedName("USDNZD")
        val uSDNZD: Double, // 1.59118
        @SerializedName("USDOMR")
        val uSDOMR: Double, // 0.38499
        @SerializedName("USDPAB")
        val uSDPAB: Double, // 1.000278
        @SerializedName("USDPEN")
        val uSDPEN: Double, // 3.782499
        @SerializedName("USDPGK")
        val uSDPGK: Double, // 3.515005
        @SerializedName("USDPHP")
        val uSDPHP: Double, // 52.498002
        @SerializedName("USDPKR")
        val uSDPKR: Double, // 192.950274
        @SerializedName("USDPLN")
        val uSDPLN: Double, // 4.47555
        @SerializedName("USDPYG")
        val uSDPYG: Double, // 6881.943047
        @SerializedName("USDQAR")
        val uSDQAR: Double, // 3.64125
        @SerializedName("USDRON")
        val uSDRON: Double, // 4.746102
        @SerializedName("USDRSD")
        val uSDRSD: Double, // 112.725033
        @SerializedName("USDRUB")
        val uSDRUB: Double, // 64.62503
        @SerializedName("USDRWF")
        val uSDRWF: Int, // 1021
        @SerializedName("USDSAR")
        val uSDSAR: Double, // 3.751136
        @SerializedName("USDSBD")
        val uSDSBD: Double, // 8.126811
        @SerializedName("USDSCR")
        val uSDSCR: Double, // 13.068119
        @SerializedName("USDSDG")
        val uSDSDG: Double, // 453.497017
        @SerializedName("USDSEK")
        val uSDSEK: Double, // 10.073014
        @SerializedName("USDSGD")
        val uSDSGD: Double, // 1.393725
        @SerializedName("USDSHP")
        val uSDSHP: Double, // 1.377399
        @SerializedName("USDSLL")
        val uSDSLL: Double, // 12819.999987
        @SerializedName("USDSOS")
        val uSDSOS: Double, // 581.000263
        @SerializedName("USDSRD")
        val uSDSRD: Double, // 20.993044
        @SerializedName("USDSTD")
        val uSDSTD: Double, // 20697.981008
        @SerializedName("USDSVC")
        val uSDSVC: Double, // 8.752911
        @SerializedName("USDSYP")
        val uSDSYP: Double, // 2512.450518
        @SerializedName("USDSZL")
        val uSDSZL: Double, // 16.210293
        @SerializedName("USDTHB")
        val uSDTHB: Double, // 34.756978
        @SerializedName("USDTJS")
        val uSDTJS: Double, // 12.513419
        @SerializedName("USDTMT")
        val uSDTMT: Double, // 3.51
        @SerializedName("USDTND")
        val uSDTND: Double, // 3.0765
        @SerializedName("USDTOP")
        val uSDTOP: Double, // 2.34135
        @SerializedName("USDTRY")
        val uSDTRY: Double, // 15.542585
        @SerializedName("USDTTD")
        val uSDTTD: Double, // 6.814465
        @SerializedName("USDTWD")
        val uSDTWD: Double, // 29.788499
        @SerializedName("USDTZS")
        val uSDTZS: Double, // 2325.504736
        @SerializedName("USDUAH")
        val uSDUAH: Double, // 29.552099
        @SerializedName("USDUGX")
        val uSDUGX: Double, // 3624.077447
        @SerializedName("USDUSD")
        val uSDUSD: Int, // 1
        @SerializedName("USDUYU")
        val uSDUYU: Double, // 41.781446
        @SerializedName("USDUZS")
        val uSDUZS: Double, // 11165.000282
        @SerializedName("USDVEF")
        val uSDVEF: Double, // 213830222338.07285
        @SerializedName("USDVND")
        val uSDVND: Double, // 23097.5
        @SerializedName("USDVUV")
        val uSDVUV: Double, // 114.265663
        @SerializedName("USDWST")
        val uSDWST: Double, // 2.579343
        @SerializedName("USDXAF")
        val uSDXAF: Double, // 628.726841
        @SerializedName("USDXAG")
        val uSDXAG: Double, // 0.046624
        @SerializedName("USDXAU")
        val uSDXAU: Double, // 0.000551
        @SerializedName("USDXCD")
        val uSDXCD: Double, // 2.70255
        @SerializedName("USDXDR")
        val uSDXDR: Double, // 0.751646
        @SerializedName("USDXOF")
        val uSDXOF: Double, // 631.000265
        @SerializedName("USDXPF")
        val uSDXPF: Double, // 115.149757
        @SerializedName("USDYER")
        val uSDYER: Double, // 250.302114
        @SerializedName("USDZAR")
        val uSDZAR: Double, // 16.199306
        @SerializedName("USDZMK")
        val uSDZMK: Double, // 9001.180379
        @SerializedName("USDZMW")
        val uSDZMW: Double, // 17.030001
        @SerializedName("USDZWL")
        val uSDZWL: Double // 321.999592
    )
}