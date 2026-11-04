package bin.mt.plus;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import l.AbstractActivityC17204;
import l.AbstractC0116;
import l.AbstractC0641;
import l.AbstractC22044;
import l.AbstractC3624;
import l.ActivityC17639;
import l.ActivityC18143;
import l.ActivityC24268;
import l.ActivityC3041;
import l.ActivityC3846;
import l.ActivityC7405;
import l.C0269;
import l.C0487;
import l.C0619;
import l.C0773;
import l.C0862;
import l.C0950;
import l.C1080;
import l.C11235;
import l.C1146;
import l.C1321;
import l.C1343;
import l.C13473;
import l.C15184;
import l.C1519;
import l.C1542;
import l.C1564;
import l.C17202;
import l.C1750;
import l.C1761;
import l.C1783;
import l.C1826;
import l.C19660;
import l.C2023;
import l.C20613;
import l.C20932;
import l.C2287;
import l.C2288;
import l.C2310;
import l.C2354;
import l.C2375;
import l.C23916;
import l.C2419;
import l.C2485;
import l.C2702;
import l.C2834;
import l.C2878;
import l.C2966;
import l.C3033;
import l.C3077;
import l.C3099;
import l.C3448;
import l.C3492;
import l.C3690;
import l.C3734;
import l.C3779;
import l.C3998;
import l.C4238;
import l.C4282;
import l.C6382;
import l.C9545;
import l.EnumC24309;
import l.RunnableC0334;
import l.RunnableC1848;
import l.RunnableC21479;
import l.RunnableC3055;
import l.RunnableC3646;
import l.ViewOnClickListenerC7793;
import l.ViewOnLayoutChangeListenerC6673;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: loaded from: classes2.dex */
public class ShortcutActivity extends ActivityC7405 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC22044 f56;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static Boolean f57;

    /* JADX INFO: renamed from: ᩵۫ᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f58 = {9839, -5518, -5527, -5522, -5517, -5515, -5534, -5516, -5515, -5518, 125, -6850, 245, -380, 28165, 28190, 28190, 28189, 28252, 28190, 28161, 28180, 28163, 28176, 28165, 28184, 28190, 28191, 28164, 28161, 28181, 28176, 28165, 28180, 28221, 28176, 28179, 28180, 28189, 28176, 28178, 28178, 28180, 28191, 28165, 28210, 28190, 28189, 28190, 28163, 28216, 28178, 28190, 28191, 28183, 28190, 28189, 28181, 28180, 28163, 28210, 28190, 28189, 28190, 28163, 28216, 28178, 28190, 28191, 7506, 12819, -6786, 6058, -383, 3478, 28184, 28162, 28213, 28184, 28163, 7842, 9854, 9825, 9844, 9827, 9840, 9829, 9848, 9854, 9855, 9825, 9840, 9829, 9849, 9829, 9854, 9854, 9853, 9788, 9844, 9833, 9829, 9827, 9840, 9842, 9829, 9788, 9840, 9825, 9850, 9829, 9854, 9854, 9853, 9788, 9848, 9855, 9829, 9844, 9827, 9847, 9840, 9842, 9844, 9788, 9840, 9855, 9840, 9853, 9832, 9826, 9848, 9826, 9844, 9845, 9848, 9829, 9788, 9829, 9844, 9833, 9829, 9829, 9854, 9854, 9853, 9788, 9840, 9825, 9850, 9788, 9852, 9842, 9825, 9829, 9854, 9854, 9853, 9788, 9852, 9828, 9826, 9848, 9842, 9788, 9825, 9853, 9840, 9832, 9844, 9827, 9825, 9827, 9844, 9831, 9848, 9844, 9830, 9788, 9849, 9829, 9852, 9853, 9854, 9825, 9844, 9855, 9788, 9855, 9826, 9853, 9854, 9842, 9840, 9829, 9844, 9788, 9842, 9853, 9848, 9842, 9850, 9829, 9854, 9854, 9853, 9788, 9842, 9854, 9853, 9854, 9827, 9788, 9825, 9848, 9842, 9850, 9844, 9827, 9853, 9854, 9842, 9840, 9829, 9844, 9829, 9854, 9854, 9853, 9788, 9829, 9844, 9827, 9852, 9848, 9855, 9840, 9853, 9829, 9854, 9854, 9853, 9788, 9826, 9848, 9846, 9855, 9840, 9829, 9828, 9827, 9844, 9788, 9850, 9844, 9832, 9829, 9854, 9854, 9853, 9788, 9840, 9842, 9829, 9848, 9831, 9848, 9829, 9832, 9788, 9827, 9844, 9842, 9854, 9827, 9845, 9846, 9854, 9829, 9854, 9788, 9854, 9827, 9788, 9853, 9854, 9842, 9840, 9829, 9844, 9829, 9854, 9854, 9853, 9788, 9825, 9853, 9828, 9846, 9848, 9855, 9788, 9852, 9840, 9855, 9840, 9846, 9844, 9829, 9854, 9854, 9853, 9788, 9826, 9829, 9827, 9844, 9840, 9852, 9788, 9852, 9844, 9845, 9848, 9840, 9846, 9854, 9829, 9854, 9829, 9854, 9854, 9853, 9788, 9826, 9852, 9840, 9853, 9848, 9788, 9824, 9828, 9844, 9827, 9832, 9844, 9833, 9844, 9842, 9788, 9826, 9842, 9827, 9848, 9825, 9829, 9829, 9854, 9854, 9853, 9788, 9829, 9828, 9829, 9854, 9827, 9848, 9840, 9853, 9829, 9854, 9854, 9853, 9788, 9827, 9844, 9852, 9854, 9829, 9844, 9788, 9825, 9840, 9832, 9853, 9854, 9840, 9845, 9829, 9854, 9854, 9853, 9788, 9827, 9844, 9852, 9854, 9829, 9844, 9788, 9852, 9840, 9855, 9840, 9846, 9844, 9829, 9854, 9854, 9853, 9788, 9842, 9854, 9852, 9852, 9854, 9855, 9788, 9825, 9840, 9826, 9826, 9830, 9854, 9827, 9845, 9826, 9829, 9854, 9854, 9853, 9788, 9827, 9844, 9842, 9832, 9842, 9853, 9844, 9788, 9843, 9848, 9855, 9829, 9854, 9854, 9853, 9788, 9840, 9825, 9825, 9788, 9825, 9827, 9854, 9829, 9844, 9842, 9829, 9829, 9854, 9854, 9853, 9788, 9829, 9844, 9833, 9829, 9788, 9844, 9845, 9848, 9829, 9854, 9827, 9840, 9855, 9845, 9827, 9854, 9848, 9845, 9791, 9848, 9855, 9829, 9844, 9855, 9829, 9791, 9840, 9842, 9829, 9848, 9854, 9855, 9791, 9799, 9816, 9812, 9798, 9826, 9849, 9854, 9827, 9829, 9842, 9828, 9829};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m132(String str, Bitmap bitmap) throws Throwable {
        BufferedOutputStream bufferedOutputStreamM49869 = null;
        Throwable th = null;
        Object th2 = null;
        int i = 89034187;
        int i2 = C1826.f6190;
        int i3 = C4238.f15451;
        int iM3169 = (i2 - C0773.m3169("ܰ᩹")) * (-117);
        int i4 = ((iM3169 ^ i3) * (-32349)) ^ (-884084522);
        int i5 = -965067061;
        while (true) {
            i = ((((i ^ i3) * 20395) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2144535909:
                case 1392180364:
                    AbstractC22044 abstractC22044 = f56;
                    C2419.m8176(abstractC22044);
                    bufferedOutputStreamM49869 = C2310.m7806(abstractC22044, str).m49869();
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStreamM49869);
                        C0950.m3797(bufferedOutputStreamM49869);
                        iM3169 = (i2 - C0619.m2761("ۢۤ")) * 91;
                        i4 = ((iM3169 ^ i3) * (-16089)) ^ (-250059123);
                        i5 = 409954757;
                    } catch (Throwable th3) {
                        th = th3;
                        iM3169 = C0619.m2761("֨᩶") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-29809)) ^ 87986477;
                        i5 = 2025786342;
                    }
                    break;
                case -2132334272:
                case -385108631:
                    if (C1783.f6087 <= 0) {
                        iM3169 = C0619.m2761("ۨܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-1069)) ^ (-927893995);
                        i5 = -1712987751;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۜ֫")) * (-31);
                        i4 = ((iM3169 ^ i2) * 67) ^ (-377384798);
                        i5 = -1516954749;
                    }
                    break;
                case -2106489984:
                case 2050666410:
                    RunnableC1848.m6360();
                    if (C2288.f7433 > 0) {
                        iM3169 = C0619.m2761("ۨܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-1069)) ^ (-927893995);
                        i5 = -1712987751;
                    } else {
                        iM3169 = C0773.m3169("᩶᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * 5113) ^ 2118032940;
                        i5 = -184460052;
                    }
                    break;
                case -2045071456:
                case 245043522:
                    if (C0862.f3233 != 0) {
                        iM3169 = C0773.m3169("ᩴۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32515) ^ (-757426272);
                        i5 = 2011332266;
                    } else {
                        iM3169 = (C0619.m2761("᩸᩹") ^ i3) * 95;
                        i4 = ((iM3169 ^ i2) * (-12751)) ^ (-1926497512);
                        i5 = -1643339692;
                    }
                    break;
                case -1996417880:
                case 992150748:
                    C1519.m5403();
                    if (C2485.m8357() > 0) {
                        iM3169 = C0619.m2761("ۨܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-1069)) ^ (-927893995);
                        i5 = -1712987751;
                    } else {
                        iM3169 = C0619.m2761("۫ܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-31001)) ^ (-2088357417);
                        i5 = 1892233641;
                    }
                    break;
                case -1720296231:
                case 690207719:
                    try {
                        C1146.m4219(th, th2);
                        iM3169 = (i3 - C0773.m3169("֨۬")) * 123;
                        i4 = ((iM3169 ^ i2) * (-24211)) ^ (-798138453);
                        i5 = 997603431;
                    } catch (Exception unused) {
                        iM3169 = (i3 - C0619.m2761("ܽܺ")) * 81;
                        i4 = ((iM3169 ^ i2) * 16059) ^ 1676090688;
                        i5 = -976622414;
                    }
                    break;
                case -1666010158:
                case -1043721334:
                    if (C3998.f13671 == 0) {
                        iM3169 = C0619.m2761("۫ܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-31001)) ^ (-2088357417);
                        i5 = 1892233641;
                    } else {
                        iM3169 = C0619.m2761("ۨ֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12011) ^ 1905199045;
                        i5 = -1494988094;
                    }
                    break;
                case -1566147143:
                case -361456670:
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0773.m3169("ۙ۟") ^ i3;
                        i4 = ((iM3169 ^ i2) * 21333) ^ 1217401378;
                        i5 = 885417359;
                    } else {
                        iM3169 = (C0773.m3169("᩵᩸") + i2) * (-3);
                        i4 = ((iM3169 ^ i3) * 30409) ^ (-1145870902);
                        i5 = 944622859;
                    }
                    break;
                case -1522292065:
                case 1135947520:
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0619.m2761("᩹۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-31247)) ^ 637656497;
                        i5 = -1152235027;
                    } else {
                        iM3169 = (C0619.m2761("ۙۗ") + i2) * 87;
                        i4 = ((iM3169 ^ i3) * 18013) ^ (-331846010);
                        i5 = -1020391909;
                    }
                    break;
                case -1400392534:
                case -631255056:
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0619.m2761("ۨܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-1069)) ^ (-927893995);
                        i5 = -1712987751;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ۤܽ")) * (-63);
                        i4 = ((iM3169 ^ i3) * (-32075)) ^ (-440361858);
                        i5 = -973687529;
                    }
                    break;
                case -1104262686:
                case 475722191:
                    try {
                        C4238.m13542(bufferedOutputStreamM49869);
                        iM3169 = (i3 - C0773.m3169("֨۬")) * 123;
                        i4 = ((iM3169 ^ i2) * (-24211)) ^ (-798138453);
                        i5 = 997603431;
                    } catch (Throwable th4) {
                        th2 = th4;
                        iM3169 = C0619.m2761("ۛܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-3713)) ^ (-859810757);
                        i5 = 801225285;
                    }
                    break;
                case -1040080228:
                case 1206645604:
                    AbstractC3624.m11755();
                    C2834.m9344();
                    return;
                case -985379230:
                case -832360115:
                    return;
                case -964767438:
                case 168516609:
                    C13473.m33144();
                    iM3169 = C0619.m2761("ۨ֡") ^ i2;
                    i4 = ((iM3169 ^ i3) * 12011) ^ 1905199045;
                    i5 = -1494988094;
                    break;
                case -890638242:
                case 634063617:
                    if (C0487.f2131 <= 0) {
                        iM3169 = (i2 - C0773.m3169("᩸ᩳ")) * 31;
                        i4 = ((iM3169 ^ i3) * (-14677)) ^ (-1541201049);
                        i5 = -158291170;
                    } else {
                        iM3169 = C0773.m3169("ۘ᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 28097) ^ 1343520696;
                        i5 = -703017430;
                    }
                    break;
                case -541834867:
                case 7113349:
                    C1080.m4050();
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0619.m2761("ۙۗ") + i2) * 87;
                        i4 = ((iM3169 ^ i3) * 18013) ^ (-331846010);
                        i5 = -1020391909;
                    } else {
                        iM3169 = C0619.m2761("ۨܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-1069)) ^ (-927893995);
                        i5 = -1712987751;
                    }
                    break;
                case -381268363:
                case 1622089117:
                    if (C3998.f13671 != 0) {
                        iM3169 = C0619.m2761("᩹۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-31247)) ^ 637656497;
                        i5 = -1152235027;
                    } else {
                        iM3169 = (C0619.m2761("ۧۛ") + i2) * (-67);
                        i4 = ((iM3169 ^ i3) * 2621) ^ 1141762537;
                        i5 = -191132844;
                    }
                    break;
                case -298309991:
                case 2028663028:
                    if (C1564.f5401 <= 0) {
                        iM3169 = C0619.m2761("۫ܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-31001)) ^ (-2088357417);
                        i5 = 1892233641;
                    } else {
                        iM3169 = (C0619.m2761("۬ۛ") ^ i3) * 115;
                        i4 = ((iM3169 ^ i2) * 16595) ^ 49438618;
                        i5 = -342004434;
                    }
                    break;
                case -280667049:
                case 175701502:
                    return;
                case -221976480:
                case 309481899:
                    throw th;
                case -16461220:
                case 607884041:
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0619.m2761("ۨܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-1069)) ^ (-927893995);
                        i5 = -1712987751;
                    } else {
                        iM3169 = C0773.m3169("ۡ۬") ^ i2;
                        i4 = ((iM3169 ^ i3) * 18985) ^ (-387244298);
                        i5 = -968650123;
                    }
                    break;
                case 319059877:
                case 2114754167:
                    C3492.m11488();
                    if (C0773.m3161() != 0) {
                        iM3169 = C0773.m3169("ۙ۟") ^ i3;
                        i4 = ((iM3169 ^ i2) * 21333) ^ 1217401378;
                        i5 = 885417359;
                    } else {
                        iM3169 = C0619.m2761("᩹۠") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-31247)) ^ 637656497;
                        i5 = -1152235027;
                    }
                    break;
                case 793903611:
                case 1539426929:
                    C3033.m9845();
                    if (C3492.f12043 <= 0) {
                        iM3169 = (i2 - C0773.m3169("᩸ᩳ")) * 31;
                        i4 = ((iM3169 ^ i3) * (-14677)) ^ (-1541201049);
                        i5 = -158291170;
                    } else {
                        iM3169 = C0619.m2761("ۨ֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12011) ^ 1905199045;
                        i5 = -1494988094;
                    }
                    break;
                case 1728327692:
                case 2055150617:
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0619.m2761("ۙۗ") + i2) * 87;
                        i4 = ((iM3169 ^ i3) * 18013) ^ (-331846010);
                        i5 = -1020391909;
                    } else {
                        iM3169 = C0619.m2761("ۧܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-30475)) ^ (-43441478);
                        i5 = -486588047;
                    }
                    break;
                default:
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0619.m2761("ۨ֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12011) ^ 1905199045;
                        i5 = -1494988094;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܽ᩻")) * 59;
                        i4 = ((iM3169 ^ i2) * 31457) ^ 1455227828;
                        i5 = -966883143;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:211:0x0791. Please report as an issue. */
    @Override // l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        int iM3169;
        int i;
        int i2;
        int iM2761;
        int i3;
        int i4;
        int iM31610;
        int i5;
        ShortcutActivity shortcutActivity = this;
        String strM3168 = null;
        String strM3169 = null;
        int i6 = 0;
        Class<ActivityC18143> cls = null;
        boolean z = false;
        int i7 = 0;
        boolean zM11490 = false;
        boolean zM8175 = false;
        boolean zM8176 = false;
        boolean zM11491 = false;
        boolean zM8177 = false;
        boolean zM11492 = false;
        boolean zM11493 = false;
        boolean zM11494 = false;
        boolean zM11495 = false;
        boolean zM8178 = false;
        boolean zM8179 = false;
        boolean zM81710 = false;
        boolean zM11496 = false;
        boolean zM81711 = false;
        boolean zM11497 = false;
        boolean zM11498 = false;
        boolean zM81712 = false;
        boolean zM81713 = false;
        boolean zM11499 = false;
        boolean zM114910 = false;
        boolean zM81714 = false;
        boolean zM81715 = false;
        boolean zM81716 = false;
        boolean zM114911 = false;
        boolean zM114912 = false;
        boolean zM114913 = false;
        boolean zM2349 = false;
        boolean zM47858 = false;
        boolean zM23410 = false;
        int i8 = -616796169;
        int i9 = C23916.f77426;
        int i10 = C3492.f12043;
        int iM31611 = C0773.m3169("ܶۚ") ^ i10;
        int i11 = ((iM31611 ^ i9) * (-21123)) ^ 422394930;
        int i12 = iM31611 ^ (-134345016);
        int i13 = 0;
        boolean zM23411 = false;
        Intent intent = null;
        int iM2762 = 0;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i9) * 30659) >> 31));
            switch (i8) {
                case -2093397273:
                case -1506569199:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM114910) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = C0773.m3169("᩹ܰ") ^ i10;
                        i = ((iM3169 ^ i9) * o.a.p) ^ 1316875534;
                        i2 = 1307656817;
                        zM11490 = zM11490;
                        String str2 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str2;
                    }
                    break;
                case -2068568103:
                case 1345399173:
                    C0950.m3790(this);
                    return;
                case -2057566098:
                case 1163004467:
                    zM11490 = zM11490;
                    zM81712 = C2419.m8175(strM3168, RunnableC3055.m9937(f58, 325, 4, i13));
                    iM31610 = C0619.m2761("ۚ᩹") ^ i10;
                    i4 = ((iM31610 ^ i9) * 26295) ^ (-1702744717);
                    i5 = -71160359;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case -2057287754:
                case 1306029316:
                    zM11490 = zM11490;
                    strM3168 = strM3168;
                    zM114913 = C3492.m11490(strM3168, C2702.m8881(f58, 459, 16, i13));
                    iM31610 = (C0773.m3169("ۘ۫") ^ i9) * 97;
                    i4 = ((iM31610 ^ i10) * (-22007)) ^ (-164853347);
                    i5 = -470892129;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case -2053874492:
                case -2007842635:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM8175) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = (C0619.m2761("᩹ۛ") ^ i10) * 79;
                        i = ((iM3169 ^ i9) * 20107) ^ (-1940909765);
                        i2 = 26100976;
                        zM11490 = zM11490;
                        String str3 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str3;
                    }
                    break;
                case -2042760305:
                case 825964413:
                    zM11490 = zM11490;
                    zM114910 = C3492.m11490(strM3168, C11235.m28300(f58, 356, 13, i13));
                    iM31610 = C0773.m3169("۬ۨ") ^ i9;
                    i4 = ((iM31610 ^ i10) * (-1191)) ^ (-68009507);
                    i5 = -1664083205;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case -2037956184:
                case -1039844674:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM8176) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = (C0619.m2761("ۡܰ") + i9) * 13;
                        i = ((iM3169 ^ i10) * (-22603)) ^ (-1035340814);
                        i2 = -461860951;
                        zM11490 = zM11490;
                        String str4 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str4;
                    }
                    break;
                case -2003199032:
                case -1668358453:
                    str = strM3168;
                    zM11490 = zM11490;
                    zM47858 = C20932.m47858(strM3169);
                    iM3169 = C0773.m3169("ܿ֨") ^ i10;
                    i = ((iM3169 ^ i9) * (-28953)) ^ 280841863;
                    i2 = -1095635750;
                    zM11490 = zM11490;
                    String str5 = str;
                    i12 = iM3169 ^ i2;
                    i11 = i;
                    strM3168 = str5;
                    break;
                case -1996901276:
                case 671928999:
                    zM11490 = zM11490;
                    zM81716 = C2419.m8175(strM3168, C20932.m47853(f58, 406, 21, i13));
                    iM31610 = (C0773.m3169("᩵ۧ") + i10) * 99;
                    i4 = ((iM31610 ^ i9) * (-11465)) ^ (-628241284);
                    i5 = 2070303017;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case -1922739526:
                case -29753197:
                    i13 = 37912;
                    iM2761 = (C0619.m2761("ۨۤ") ^ i9) * (-93);
                    i11 = ((iM2761 ^ i10) * (-12617)) ^ 1866961540;
                    i3 = -1985064351;
                    i12 = iM2761 ^ i3;
                    shortcutActivity = this;
                    zM11490 = zM11490;
                    break;
                case -1919886262:
                case 318419999:
                    zM11490 = zM11490;
                    super.onCreate(bundle);
                    iM2761 = (C0619.m2761("᩶ܰ") ^ i10) * (-43);
                    i11 = ((iM2761 ^ i9) * 8685) ^ (-1716459303);
                    i3 = 1344165866;
                    i12 = iM2761 ^ i3;
                    shortcutActivity = this;
                    zM11490 = zM11490;
                    break;
                case -1887914268:
                case -1331438720:
                    zM11490 = zM11490;
                    zM8178 = C2419.m8175(strM3168, RunnableC0334.m2049(f58, 219, 6, i13));
                    iM31610 = C0773.m3169("ܶۘ") ^ i10;
                    i4 = ((iM31610 ^ i9) * 31069) ^ 771027839;
                    i5 = -831146061;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case -1875939837:
                case 197147992:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM11496) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = (C0619.m2761("᩹ۛ") ^ i10) * 79;
                        i = ((iM3169 ^ i9) * 20107) ^ (-1940909765);
                        i2 = 26100976;
                        zM11490 = zM11490;
                        String str6 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str6;
                    }
                    break;
                case -1858640277:
                case -1277658118:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM114913) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = C0773.m3169("ۚܽ") ^ i10;
                        i = ((iM3169 ^ i9) * 11873) ^ (-278583741);
                        i2 = -755233744;
                        zM11490 = zM11490;
                        String str7 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str7;
                    }
                    break;
                case -1763001356:
                case 105159208:
                    zM11490 = zM11490;
                    zM11493 = C3492.m11490(strM3168, C1826.m6310(f58, 183, 7, i13));
                    iM31610 = C0773.m3169("ۡۨ") ^ i10;
                    i4 = ((iM31610 ^ i9) * 2645) ^ 861740243;
                    i5 = -934654448;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case -1758154268:
                case 482463575:
                    zM11490 = zM11490;
                    zM114911 = C3492.m11490(strM3168, C1826.m6310(f58, 427, 16, i13));
                    iM31610 = (C0773.m3169("۫ۙ") ^ i9) * (-71);
                    i4 = ((iM31610 ^ i10) * 2545) ^ 1937416285;
                    i5 = -88033674;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case -1745690412:
                case 223401587:
                    zM11490 = zM11490;
                    zM81711 = C2419.m8175(strM3168, C17202.m40377(f58, 276, 14, i13));
                    iM31610 = (i9 - C0619.m2761("ۨᩳ")) * 35;
                    i4 = ((iM31610 ^ i10) * 29377) ^ 37908557;
                    i5 = 428377829;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case -1743487232:
                case 1967557398:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM8179) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = (C0619.m2761("۫᩶") + i10) * 39;
                        i = ((iM3169 ^ i9) * (-17899)) ^ (-857058133);
                        i2 = 415269000;
                        zM11490 = zM11490;
                        String str8 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str8;
                    }
                    break;
                case -1740934798:
                case 782147495:
                    zM11490 = zM11490;
                    zM11494 = C3492.m11490(strM3168, C2485.m8350(f58, 190, 12, i13));
                    iM31610 = (C0619.m2761("᩶֡") + i9) * (-3);
                    i4 = ((iM31610 ^ i10) * (-31335)) ^ (-507652184);
                    i5 = 214977251;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case -1717179467:
                case 1272166630:
                    zM11490 = zM11490;
                    zM8177 = C2419.m8175(strM3168, RunnableC0334.m2049(f58, EnumC24309.f78687, 17, i13));
                    iM31610 = C0773.m3169("ۜ᩹") ^ i9;
                    i4 = ((iM31610 ^ i10) * (-10125)) ^ 937396913;
                    i5 = 832296300;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case -1700706851:
                case -1570798959:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM11490) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = C0773.m3169("֫ܰ") ^ i9;
                        i = ((iM3169 ^ i10) * (-7643)) ^ 48353203;
                        i2 = 1279455373;
                        zM11490 = zM11490;
                        String str9 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str9;
                    }
                    break;
                case -1641859851:
                case -608432386:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM11493) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = (C0619.m2761("ۧ֡") + i9) * (-121);
                        i = ((iM3169 ^ i10) * 23229) ^ 1366799628;
                        i2 = -1734065914;
                        zM11490 = zM11490;
                        String str10 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str10;
                    }
                    break;
                case -1631554041:
                case -1370736453:
                    zM11490 = zM11490;
                    if (zM23411) {
                        iM31610 = (C0619.m2761("ܰᩳ") ^ i10) * 101;
                        i4 = ((iM31610 ^ i9) * (-12717)) ^ 1473690707;
                        i5 = 1496039643;
                    } else {
                        iM31610 = (C0773.m3169("ۚۡ") ^ i9) * (-19);
                        i4 = ((iM31610 ^ i10) * 1247) ^ 1350173687;
                        i5 = -1310055208;
                    }
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case -1574861608:
                case -236260545:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM11491) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = (C0619.m2761("᩹ۛ") ^ i10) * 79;
                        i = ((iM3169 ^ i9) * 20107) ^ (-1940909765);
                        i2 = 26100976;
                        zM11490 = zM11490;
                        String str11 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str11;
                    }
                    break;
                case -1516395208:
                case -497577386:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM81715) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = (C0619.m2761("᩹ۛ") ^ i10) * 79;
                        i = ((iM3169 ^ i9) * 20107) ^ (-1940909765);
                        i2 = 26100976;
                        zM11490 = zM11490;
                        String str12 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str12;
                    }
                    break;
                case -1477403280:
                case -1271622511:
                    zM11490 = zM11490;
                    zM11497 = C3492.m11490(strM3168, C3033.m9847(f58, 290, 18, i13));
                    iM31610 = (C0619.m2761("۟ܳ") ^ i10) * (-75);
                    i4 = ((iM31610 ^ i9) * 2203) ^ 1895163130;
                    i5 = -670948471;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case -1448308933:
                case -774067421:
                    str = strM3168;
                    zM11490 = zM11490;
                    Intent intent2 = new Intent(shortcutActivity, (Class<?>) ActivityC24268.class);
                    AbstractC0116.m1232(intent2, i7);
                    C2878.m9490(shortcutActivity, intent2);
                    strM3168 = str;
                    iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                    i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                    i3 = -1757260374;
                    i12 = iM2761 ^ i3;
                    shortcutActivity = this;
                    zM11490 = zM11490;
                    break;
                case -1446779370:
                case -1189228631:
                    zM11490 = zM11490;
                    C4238.m13537(this);
                    iM31610 = C0773.m3169("ۘᩴ") ^ i9;
                    i4 = ((iM31610 ^ i10) * (-9485)) ^ 1520470289;
                    i5 = -1892198600;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case -1387817382:
                case 406232583:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM47858) {
                        iM3169 = C0773.m3169("ۡ᩹") ^ i9;
                        i = ((iM3169 ^ i10) * (-9563)) ^ (-893284227);
                        i2 = -1759381775;
                        zM11490 = zM11490;
                        String str13 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str13;
                    } else {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    }
                    break;
                case -1379775777:
                case 817377345:
                    ActivityC3846.m12402(shortcutActivity, strM3169);
                    zM11490 = zM11490;
                    iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                    i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                    i3 = -1757260374;
                    i12 = iM2761 ^ i3;
                    shortcutActivity = this;
                    zM11490 = zM11490;
                    break;
                case -1354961422:
                case 542561767:
                    zM11490 = zM11490;
                    zM81715 = C2419.m8175(strM3168, C1542.m5471(f58, 388, 18, i13));
                    iM31610 = C0619.m2761("᩸۟") ^ i10;
                    i4 = ((iM31610 ^ i9) * (-1889)) ^ (-1974085210);
                    i5 = -1234697578;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case -1354810034:
                case -370792664:
                    zM11490 = zM11490;
                    i6 = 67108864;
                    cls = ActivityC18143.class;
                    z = true;
                    i7 = 268435456;
                    switch (iM2762) {
                        case -2122614245:
                            iM31610 = (C0773.m3169("ܽۨ") ^ i9) * (-103);
                            i4 = ((iM31610 ^ i10) * 24639) ^ (-1892435858);
                            i5 = 1966312720;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        case -1977055419:
                            iM31610 = C0619.m2761("۟ۨ") ^ i10;
                            i4 = ((iM31610 ^ i9) * 6335) ^ 804361504;
                            i5 = -605500053;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        case -1912197360:
                            iM31610 = C0773.m3169("ܿᩳ") ^ i9;
                            i4 = ((iM31610 ^ i10) * (-29603)) ^ (-896313901);
                            i5 = -1008588495;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        case -1756800204:
                            iM31610 = C0773.m3169("ۗܺ") ^ i10;
                            i4 = ((iM31610 ^ i9) * 10111) ^ (-1396002314);
                            i5 = 801133327;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        case -1510480482:
                            iM31610 = (C0773.m3169("᩺ܶ") ^ i10) * (-79);
                            i4 = ((iM31610 ^ i9) * (-27883)) ^ (-740166276);
                            i5 = 1318358288;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        case -1409195376:
                            iM31610 = (C0773.m3169("ۧۢ") + i9) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i4 = ((iM31610 ^ i10) * 24463) ^ 9162361;
                            i5 = 1381522481;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        case -1263242200:
                            iM31610 = (C0619.m2761("ۡ᩻") ^ i10) * 9;
                            i4 = ((iM31610 ^ i9) * (-13233)) ^ (-427978321);
                            i5 = -1242655453;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        case -1212308659:
                            iM31610 = (C0619.m2761("۠ۗ") ^ i9) * 37;
                            i4 = ((iM31610 ^ i10) * 31089) ^ 612679385;
                            i5 = -1401149022;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        case -1119104947:
                            iM31610 = C0773.m3169("۫ۨ") ^ i10;
                            i4 = ((iM31610 ^ i9) * 31583) ^ 1105496391;
                            i5 = 1166497066;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        case -1097461934:
                            iM31610 = (C0619.m2761("ᩴۢ") ^ i9) * 37;
                            i4 = ((iM31610 ^ i10) * (-29029)) ^ (-2105821521);
                            i5 = 219646140;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        case -785778927:
                            iM31610 = (C0619.m2761("ۗۙ") + i10) * 13;
                            i4 = ((iM31610 ^ i9) * (-26255)) ^ (-2136743004);
                            i5 = -474182275;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        case -667500459:
                            iM31610 = (C0619.m2761("᩺ۛ") ^ i9) * (-71);
                            i4 = ((iM31610 ^ i10) * (-893)) ^ (-889567250);
                            i5 = 1172524622;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        case -593404262:
                            iM31610 = C0773.m3169("ۡ۠") ^ i10;
                            i4 = ((iM31610 ^ i9) * (-15599)) ^ 1581693218;
                            i5 = 411632213;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        case -560080238:
                            iM31610 = C0773.m3169("᩵ܶ") ^ i9;
                            i4 = ((iM31610 ^ i10) * (-7173)) ^ 896812141;
                            i5 = -1391294429;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        case -474293814:
                            iM31610 = (C0773.m3169("᩸᩺") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i4 = ((iM31610 ^ i9) * (-18897)) ^ (-99578316);
                            i5 = -1608995875;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        case -244759188:
                            iM31610 = (C0619.m2761("᩶۬") ^ i9) * 93;
                            i4 = ((iM31610 ^ i10) * 22013) ^ 776673423;
                            i5 = -2069571510;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        case 3178851:
                            iM31610 = (i10 - C0773.m3169("᩶᩻")) * (-61);
                            i4 = ((iM31610 ^ i9) * (-28379)) ^ (-1246318561);
                            i5 = -1168481950;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        case 24954378:
                            iM31610 = (C0773.m3169("ᩳ᩻") ^ i9) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i4 = ((iM31610 ^ i10) * (-20707)) ^ (-389894197);
                            i5 = 1245297614;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        case 35253639:
                            iM31610 = C0773.m3169("᩷ܶ") ^ i10;
                            i4 = ((iM31610 ^ i9) * (-22547)) ^ 632537660;
                            i5 = -251127505;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        case 588746739:
                            iM31610 = (C0619.m2761("ۜۜ") ^ i9) * 99;
                            i4 = ((iM31610 ^ i10) * 5977) ^ (-615221279);
                            i5 = 1136677645;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        case 594671580:
                            iM31610 = C0619.m2761("᩵ۡ") ^ i9;
                            i4 = ((iM31610 ^ i10) * 15253) ^ 523443674;
                            i5 = -1831211035;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        case 1041335639:
                            iM31610 = C0619.m2761("ܶ֫") ^ i10;
                            i4 = ((iM31610 ^ i9) * 30429) ^ (-1212661353);
                            i5 = 866167835;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        case 1634302827:
                            iM31610 = C0773.m3169("ۗ᩸") ^ i9;
                            i4 = ((iM31610 ^ i10) * (-9251)) ^ (-911458203);
                            i5 = -1306916493;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        case 1721154072:
                            iM31610 = C0773.m3169("ۤ᩹") ^ i10;
                            i4 = ((iM31610 ^ i9) * (-22169)) ^ (-989909387);
                            i5 = -2067604168;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        case 1841977966:
                            iM31610 = C0773.m3169("ᩴ᩵") ^ i10;
                            i4 = ((iM31610 ^ i9) * 6641) ^ (-21488335);
                            i5 = -641667892;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        case 2116182360:
                            iM31610 = (C0773.m3169("᩸ᩳ") ^ i9) * 59;
                            i4 = ((iM31610 ^ i10) * (-22721)) ^ (-318877672);
                            i5 = 348557225;
                            i12 = iM31610 ^ i5;
                            i11 = i4;
                            break;
                        default:
                            iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                            i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                            i3 = -1757260374;
                            i12 = iM2761 ^ i3;
                            shortcutActivity = this;
                            break;
                    }
                    zM11490 = zM11490;
                    break;
                case -1309106079:
                case 360385636:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM81711) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = (C0773.m3169("ۤᩴ") + i10) * (-39);
                        i = ((iM3169 ^ i9) * (-9049)) ^ (-906226596);
                        i2 = 112701107;
                        zM11490 = zM11490;
                        String str14 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str14;
                    }
                    break;
                case -1300106410:
                case 213743279:
                    str = strM3168;
                    zM11490 = zM11490;
                    Main.m53(shortcutActivity, intent.getExtras(), z);
                    strM3168 = str;
                    iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                    i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                    i3 = -1757260374;
                    i12 = iM2761 ^ i3;
                    shortcutActivity = this;
                    zM11490 = zM11490;
                    break;
                case -1244337614:
                case 863533370:
                    return;
                case -1244125425:
                case 1211477592:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM11498) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = (C0619.m2761("᩹ۛ") ^ i10) * 79;
                        i = ((iM3169 ^ i9) * 20107) ^ (-1940909765);
                        i2 = 26100976;
                        zM11490 = zM11490;
                        String str15 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str15;
                    }
                    break;
                case -1228878164:
                case 2082666624:
                    try {
                        Intent intent3 = new Intent(shortcutActivity, cls);
                        AbstractC0116.m1232(intent3, i7);
                        AbstractC3624.m11767(intent3, i6);
                        try {
                            str = strM3168;
                            zM11490 = zM11490;
                            try {
                                intent3.setAction(C23916.m53420(f58, 475, 26, i13));
                                intent3.setData(Uri.fromFile(new File(strM3169)));
                                intent3.putExtra(C2702.m8881(f58, 501, 8, i13), z);
                                C2878.m9490(shortcutActivity, intent3);
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            str = strM3168;
                            zM11490 = zM11490;
                        }
                        strM3168 = str;
                    } catch (Exception unused3) {
                        zM11490 = zM11490;
                    }
                    iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                    i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                    i3 = -1757260374;
                    i12 = iM2761 ^ i3;
                    shortcutActivity = this;
                    zM11490 = zM11490;
                    break;
                case -1208651815:
                case -173899003:
                    zM11490 = zM11490;
                    Intent intentM8359 = C2485.m8359(this);
                    try {
                        strM3168 = C0773.m3168(intentM8359, C0487.m2361(f58, 81, 9, i13));
                        strM3169 = C0773.m3168(intentM8359, C1783.m6233(f58, 90, 4, i13));
                        zM23411 = C0487.m2349(strM3168);
                        int iM2763 = (i9 - C0619.m2761("ۛᩳ")) * 29;
                        i4 = ((iM2763 ^ i10) * 1241) ^ (-1080116629);
                        i12 = iM2763 ^ 895816673;
                        shortcutActivity = this;
                        intent = intentM8359;
                        i11 = i4;
                    } catch (Exception unused4) {
                        intent = intentM8359;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                    }
                    zM11490 = zM11490;
                    break;
                case -1206747244:
                case 870428857:
                    zM11490 = zM11490;
                    zM11492 = C3492.m11490(strM3168, C23916.m53420(f58, 171, 12, i13));
                    iM31610 = C0773.m3169("᩸᩻") ^ i10;
                    i4 = ((iM31610 ^ i9) * 13975) ^ (-239712878);
                    i5 = 172854062;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case -1144684484:
                case -399220785:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM81712) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = (C0773.m3169("ۤᩴ") + i10) * (-39);
                        i = ((iM3169 ^ i9) * (-9049)) ^ (-906226596);
                        i2 = 112701107;
                        zM11490 = zM11490;
                        String str16 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str16;
                    }
                    break;
                case -1129212627:
                case 1553071240:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM114912) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = C0619.m2761("ܿ᩹") ^ i9;
                        i = ((iM3169 ^ i10) * (-8729)) ^ (-394363877);
                        i2 = 132927813;
                        zM11490 = zM11490;
                        String str17 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str17;
                    }
                    break;
                case -1056289958:
                case 1957516901:
                    str = strM3168;
                    zM11490 = zM11490;
                    Intent intent4 = new Intent(shortcutActivity, cls);
                    AbstractC0116.m1232(intent4, i7);
                    AbstractC3624.m11767(intent4, i6);
                    C1564.m5513(shortcutActivity, intent4);
                    strM3168 = str;
                    iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                    i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                    i3 = -1757260374;
                    i12 = iM2761 ^ i3;
                    shortcutActivity = this;
                    zM11490 = zM11490;
                    break;
                case -1023924072:
                case 655284101:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM81716) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = (C0619.m2761("᩹ۛ") ^ i10) * 79;
                        i = ((iM3169 ^ i9) * 20107) ^ (-1940909765);
                        i2 = 26100976;
                        zM11490 = zM11490;
                        String str18 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str18;
                    }
                    break;
                case -1012377698:
                case 284621989:
                    zM11490 = zM11490;
                    iM2762 = C0619.m2761(strM3168);
                    iM31610 = C0619.m2761("ܳ᩷") ^ i10;
                    i4 = ((iM31610 ^ i9) * (-28341)) ^ (-1866900241);
                    i5 = -1127655389;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case -937522613:
                case 1195678881:
                    zM11490 = zM11490;
                    zM8175 = C2419.m8175(strM3168, C3779.m12266(f58, UMErrorCode.E_UM_BE_JSON_FAILED, 23, i13));
                    iM31610 = C0773.m3169("ܳۜ") ^ i9;
                    i4 = ((iM31610 ^ i10) * 24715) ^ 809184707;
                    i5 = -1296992982;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case -932730491:
                case -486687111:
                    zM11490 = zM11490;
                    zM11499 = C3492.m11490(strM3168, C2288.m7761(f58, 345, 11, i13));
                    iM31610 = C0619.m2761("ܿ᩺") ^ i10;
                    i4 = ((iM31610 ^ i9) * 31159) ^ (-1967563482);
                    i5 = 248494016;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case -902480252:
                case -732705717:
                    zM11490 = zM11490;
                    zM114912 = C3492.m11490(strM3168, C1826.m6310(f58, 443, 16, i13));
                    iM31610 = (i10 - C0773.m3169("᩶ۧ")) * 3;
                    i4 = ((iM31610 ^ i9) * 14279) ^ (-1401907785);
                    i5 = -2022985243;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case -808302440:
                case -469207963:
                    zM11490 = zM11490;
                    short s = f58[80];
                    if (((s * s) + 21003889) - (s * 9166) >= 0) {
                        iM2761 = (C0773.m3169("ۨ۬") ^ i10) * (-23);
                        i11 = ((iM2761 ^ i9) * 32135) ^ (-588082780);
                        i3 = 1057555702;
                    } else {
                        iM2761 = (i9 - C0619.m2761("ۢۧ")) * (-97);
                        i11 = ((iM2761 ^ i10) * 30053) ^ 831795959;
                        i3 = 1309330140;
                    }
                    i12 = iM2761 ^ i3;
                    shortcutActivity = this;
                    zM11490 = zM11490;
                    break;
                case -794711115:
                case 1736673987:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM81710) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = (C0619.m2761("᩹ۛ") ^ i10) * 79;
                        i = ((iM3169 ^ i9) * 20107) ^ (-1940909765);
                        i2 = 26100976;
                        zM11490 = zM11490;
                        String str19 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str19;
                    }
                    break;
                case -578564840:
                case 492498510:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM8178) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = (C0773.m3169("ۤᩴ") + i10) * (-39);
                        i = ((iM3169 ^ i9) * (-9049)) ^ (-906226596);
                        i2 = 112701107;
                        zM11490 = zM11490;
                        String str110 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str110;
                    }
                    break;
                case -533881134:
                case 51976031:
                    zM11490 = zM11490;
                    zM8179 = C2419.m8175(strM3168, C1080.m4056(f58, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, 13, i13));
                    iM31610 = C0773.m3169("۟۠") ^ i10;
                    i4 = ((iM31610 ^ i9) * 31751) ^ (-1194496732);
                    i5 = 1722862654;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case -504759071:
                case 192889475:
                    zM11490 = zM11490;
                    zM11496 = C3492.m11490(strM3168, RunnableC3055.m9937(f58, 256, 20, i13));
                    iM31610 = (C0619.m2761("ۧ۬") ^ i10) * 33;
                    i4 = ((iM31610 ^ i9) * 11887) ^ 565468285;
                    i5 = -1719764748;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case -417146262:
                case 1299819424:
                    zM11490 = zM11490;
                    zM11498 = C3492.m11490(strM3168, C0773.m3166(f58, 308, 17, i13));
                    iM31610 = C0773.m3169("ۗ᩹") ^ i9;
                    i4 = ((iM31610 ^ i10) * (-17109)) ^ (-1555935160);
                    i5 = -1891919333;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case -340704825:
                case 366464945:
                    try {
                        Main.m53(shortcutActivity, intent.getExtras(), z);
                        break;
                    } catch (Exception unused5) {
                    }
                    zM11490 = zM11490;
                    iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                    i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                    i3 = -1757260374;
                    i12 = iM2761 ^ i3;
                    shortcutActivity = this;
                    zM11490 = zM11490;
                    break;
                case -305130800:
                case 485157015:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM23410) {
                        iM3169 = C0619.m2761("᩺ۖ") ^ i10;
                        i = ((iM3169 ^ i9) * 31373) ^ 1815032593;
                        i2 = -129702254;
                        zM11490 = zM11490;
                        String str111 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str111;
                    } else {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    }
                    break;
                case -299870479:
                case 1233838461:
                    zM11490 = zM11490;
                    zM81710 = C2419.m8175(strM3168, C0950.m3780(f58, 238, 18, i13));
                    iM31610 = C0619.m2761("᩺۬") ^ i9;
                    i4 = ((iM31610 ^ i10) * 32033) ^ 917465851;
                    i5 = -364788847;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case -201448382:
                case 1273194031:
                    str = strM3168;
                    zM11490 = zM11490;
                    zM23410 = C0487.m2349(strM3169);
                    iM3169 = (i9 - C0619.m2761("ۙۨ")) * (-97);
                    i = ((iM3169 ^ i10) * 24393) ^ 2053719031;
                    i2 = 1574990377;
                    zM11490 = zM11490;
                    String str112 = str;
                    i12 = iM3169 ^ i2;
                    i11 = i;
                    strM3168 = str112;
                    break;
                case -195293784:
                case 490328082:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM11499) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = (C0619.m2761("᩹ۛ") ^ i10) * 79;
                        i = ((iM3169 ^ i9) * 20107) ^ (-1940909765);
                        i2 = 26100976;
                        zM11490 = zM11490;
                        String str113 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str113;
                    }
                    break;
                case -117341773:
                case 1653659487:
                    zM11490 = zM11490;
                    zM8176 = C2419.m8175(strM3168, C0487.m2361(f58, 133, 9, i13));
                    iM31610 = C0619.m2761("ۗۘ") ^ i10;
                    i4 = ((iM31610 ^ i9) * 12499) ^ (-1795755892);
                    i5 = -772572010;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case -99243268:
                case 2046996312:
                    zM11490 = zM11490;
                    zM81713 = C2419.m8175(strM3168, C2310.m7803(f58, 329, 16, i13));
                    iM31610 = C0773.m3169("ܺۡ") ^ i9;
                    i4 = ((iM31610 ^ i10) * 12431) ^ (-839841260);
                    i5 = 1902927413;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case -24297839:
                case 1024457161:
                    str = strM3168;
                    zM11490 = zM11490;
                    Intent intent5 = new Intent(shortcutActivity, (Class<?>) ActivityC3041.class);
                    AbstractC0116.m1232(intent5, i7);
                    C2878.m9490(shortcutActivity, intent5);
                    strM3168 = str;
                    iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                    i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                    i3 = -1757260374;
                    i12 = iM2761 ^ i3;
                    shortcutActivity = this;
                    zM11490 = zM11490;
                    break;
                case -19343768:
                case 1781969055:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM11497) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = C0773.m3169("ۙᩴ") ^ i9;
                        i = ((iM3169 ^ i10) * (-29315)) ^ (-379059124);
                        i2 = -1823526378;
                        zM11490 = zM11490;
                        String str114 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str114;
                    }
                    break;
                case 65861682:
                case 435093480:
                    str = strM3168;
                    zM11490 = zM11490;
                    zM2349 = C0487.m2349(strM3169);
                    iM3169 = C0773.m3169("᩹ۜ") ^ i9;
                    i = ((iM3169 ^ i10) * 1395) ^ (-42570049);
                    i2 = 87774511;
                    zM11490 = zM11490;
                    String str115 = str;
                    i12 = iM3169 ^ i2;
                    i11 = i;
                    strM3168 = str115;
                    break;
                case 125409431:
                case 1010177157:
                    zM11490 = zM11490;
                    zM11491 = C3492.m11490(strM3168, AbstractC0116.m1236(f58, 142, 12, i13));
                    iM31610 = C0773.m3169("᩶ۗ") ^ i9;
                    i4 = ((iM31610 ^ i10) * (-21647)) ^ (-801152391);
                    i5 = -888497272;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case 166037666:
                case 1134304670:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM11494) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = (C0773.m3169("ۤᩴ") + i10) * (-39);
                        i = ((iM3169 ^ i9) * (-9049)) ^ (-906226596);
                        i2 = 112701107;
                        zM11490 = zM11490;
                        String str116 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str116;
                    }
                    break;
                case 192440807:
                case 466931440:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM8177) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = (C0619.m2761("᩹ۛ") ^ i10) * 79;
                        i = ((iM3169 ^ i9) * 20107) ^ (-1940909765);
                        i2 = 26100976;
                        zM11490 = zM11490;
                        String str117 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str117;
                    }
                    break;
                case 199823971:
                case 728782930:
                    i13 = 9745;
                    iM2761 = (C0619.m2761("ۨۤ") ^ i9) * (-93);
                    i11 = ((iM2761 ^ i10) * (-12617)) ^ 1866961540;
                    i3 = -1985064351;
                    i12 = iM2761 ^ i3;
                    shortcutActivity = this;
                    zM11490 = zM11490;
                    break;
                case 216349634:
                case 595757669:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM81714) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = (C0619.m2761("ۧ֡") + i9) * (-121);
                        i = ((iM3169 ^ i10) * 23229) ^ 1366799628;
                        i2 = -1734065914;
                        zM11490 = zM11490;
                        String str118 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str118;
                    }
                    break;
                case 309728996:
                case 1551541197:
                    str = strM3168;
                    zM11490 = zM11490;
                    Intent intent6 = new Intent(shortcutActivity, (Class<?>) ViewOnLayoutChangeListenerC6673.class);
                    AbstractC0116.m1232(intent6, i7);
                    C1564.m5513(shortcutActivity, intent6);
                    strM3168 = str;
                    iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                    i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                    i3 = -1757260374;
                    i12 = iM2761 ^ i3;
                    shortcutActivity = this;
                    zM11490 = zM11490;
                    break;
                case 324469554:
                case 431511780:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM11492) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = (C0773.m3169("ۗۢ") + i10) * (-39);
                        i = ((iM3169 ^ i9) * (-6083)) ^ 323118457;
                        i2 = 1774329183;
                        zM11490 = zM11490;
                        String str119 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str119;
                    }
                    break;
                case 529928623:
                case 1990268414:
                    str = strM3168;
                    zM11490 = zM11490;
                    Intent intent7 = new Intent(shortcutActivity, (Class<?>) ViewOnClickListenerC7793.class);
                    AbstractC0116.m1232(intent7, i7);
                    C2878.m9490(shortcutActivity, intent7);
                    strM3168 = str;
                    iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                    i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                    i3 = -1757260374;
                    i12 = iM2761 ^ i3;
                    shortcutActivity = this;
                    zM11490 = zM11490;
                    break;
                case 552816626:
                case 1344525422:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM114911) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = (C0619.m2761("ۧ֡") + i9) * (-121);
                        i = ((iM3169 ^ i10) * 23229) ^ 1366799628;
                        i2 = -1734065914;
                        zM11490 = zM11490;
                        String str1110 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str1110;
                    }
                    break;
                case 679972171:
                case 1116419428:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM11495) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = (C0619.m2761("᩹ۛ") ^ i10) * 79;
                        i = ((iM3169 ^ i9) * 20107) ^ (-1940909765);
                        i2 = 26100976;
                        zM11490 = zM11490;
                        String str1111 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str1111;
                    }
                    break;
                case 692118741:
                case 2049124831:
                    str = strM3168;
                    zM11490 = zM11490;
                    throw new RuntimeException();
                case 716511569:
                case 1071332666:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM2349) {
                        iM3169 = C0619.m2761("֡᩻") ^ i10;
                        i = ((iM3169 ^ i9) * (-24923)) ^ (-1488784011);
                        i2 = 1876208819;
                        zM11490 = zM11490;
                        String str1112 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str1112;
                    } else {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    }
                    break;
                case 995210757:
                case 1927659855:
                    zM11490 = C3492.m11490(strM3168, C1826.m6310(f58, 94, 16, i13));
                    int iM2764 = (C0619.m2761("ܶۖ") + i10) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i12 = iM2764 ^ (-1026385922);
                    i11 = ((iM2764 ^ i9) * (-32129)) ^ (-47741561);
                    break;
                case 1138149065:
                case 1577379183:
                    str = strM3168;
                    zM11490 = zM11490;
                    Intent intent8 = new Intent(shortcutActivity, (Class<?>) ActivityC17639.class);
                    AbstractC0116.m1232(intent8, i7);
                    C2878.m9490(shortcutActivity, intent8);
                    strM3168 = str;
                    iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                    i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                    i3 = -1757260374;
                    i12 = iM2761 ^ i3;
                    shortcutActivity = this;
                    zM11490 = zM11490;
                    break;
                case 1240283463:
                case 1450251454:
                    zM11490 = zM11490;
                    zM11495 = C3492.m11490(strM3168, C2023.m6966(f58, 202, 17, i13));
                    iM31610 = C0619.m2761("ۡۡ") ^ i9;
                    i4 = ((iM31610 ^ i10) * (-27291)) ^ 203826228;
                    i5 = 2020129490;
                    i12 = iM31610 ^ i5;
                    i11 = i4;
                    zM11490 = zM11490;
                    break;
                case 1267723076:
                case 1826237592:
                    str = strM3168;
                    zM11490 = zM11490;
                    if (!zM81713) {
                        strM3168 = str;
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                        zM11490 = zM11490;
                    } else {
                        iM3169 = (C0619.m2761("᩹ۛ") ^ i10) * 79;
                        i = ((iM3169 ^ i9) * 20107) ^ (-1940909765);
                        i2 = 26100976;
                        zM11490 = zM11490;
                        String str1113 = str;
                        i12 = iM3169 ^ i2;
                        i11 = i;
                        strM3168 = str1113;
                    }
                    break;
                default:
                    zM11490 = zM11490;
                    try {
                        zM81714 = C2419.m8175(strM3168, C3734.m12149(f58, 369, 19, i13));
                        iM31610 = C0773.m3169("֨᩺") ^ i9;
                        i4 = ((iM31610 ^ i10) * 21405) ^ 744688350;
                        i5 = 425791521;
                        i12 = iM31610 ^ i5;
                        i11 = i4;
                    } catch (Exception unused6) {
                        iM2761 = C0773.m3169("ۙᩳ") ^ i10;
                        i11 = ((iM2761 ^ i9) * (-21679)) ^ 803978793;
                        i3 = -1757260374;
                        i12 = iM2761 ^ i3;
                        shortcutActivity = this;
                    }
                    zM11490 = zM11490;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Bitmap m135(String str) throws Throwable {
        int iM2761;
        int i;
        AbstractC22044 abstractC22044 = null;
        AbstractC22044 abstractC22044M1774 = null;
        Bitmap bitmap = null;
        BufferedInputStream bufferedInputStreamM49875 = null;
        Bitmap bitmapDecodeStream = null;
        Throwable th = null;
        Object th2 = null;
        int i2 = -1210996471;
        int i3 = C0487.f2131;
        int i4 = C4238.f15451;
        int iM2762 = (i3 - C0619.m2761("ۛ᩹")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
        int i5 = ((iM2762 ^ i4) * 439) ^ 2036172209;
        int i6 = -601743771;
        while (true) {
            int i7 = iM2762 ^ i6;
            while (true) {
                i2 = ((((i2 ^ i4) * 12021) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2108937048:
                    case -1063139536:
                        if (C2878.m9491() > 0) {
                            iM2762 = (C0773.m3169("ۜ᩹") ^ i4) * 65;
                            i5 = ((iM2762 ^ i3) * (-20307)) ^ 543874451;
                            i6 = -1125429253;
                            break;
                        }
                        iM2762 = (C0619.m2761("ۜ۠") ^ i4) * (-59);
                        i5 = ((iM2762 ^ i3) * 25075) ^ (-157884843);
                        i6 = -1339141324;
                        break;
                    case -2064718597:
                    case 1119565174:
                        if (C2375.f7641 <= 0) {
                            iM2762 = C0619.m2761("֨᩶") ^ i3;
                            i5 = ((iM2762 ^ i4) * (-32233)) ^ 397078095;
                            i6 = -874843364;
                            break;
                        }
                        iM2762 = (C0619.m2761("ۜ۠") ^ i4) * (-59);
                        i5 = ((iM2762 ^ i3) * 25075) ^ (-157884843);
                        i6 = -1339141324;
                        break;
                        break;
                    case -1986677205:
                    case 1786404231:
                        abstractC22044 = f56;
                        if (C2966.f9654 < 0) {
                            iM2762 = C0773.m3169("᩹֡") ^ i4;
                            i5 = ((iM2762 ^ i3) * 6785) ^ (-1257566034);
                            i6 = 1957690230;
                            break;
                        }
                        iM2762 = (C0773.m3169("۟᩻") ^ i3) * (-71);
                        i5 = ((iM2762 ^ i4) * 4717) ^ (-342023954);
                        i6 = -1719563712;
                        break;
                    case -1867590603:
                    case -44937754:
                        bufferedInputStreamM49875 = abstractC22044M1774.m49875();
                        try {
                            bitmapDecodeStream = BitmapFactory.decodeStream(bufferedInputStreamM49875);
                            bufferedInputStreamM49875.close();
                            iM2762 = (i3 - C0619.m2761("۟ܺ")) * (-111);
                            i5 = ((iM2762 ^ i4) * (-13287)) ^ (-742531640);
                            i6 = -244803504;
                        } catch (Throwable th3) {
                            th = th3;
                            iM2762 = C0619.m2761("ۢۜ") ^ i3;
                            i5 = ((iM2762 ^ i4) * 20099) ^ 505401256;
                            i6 = 307436225;
                        }
                        break;
                    case -1779236655:
                    case 657011325:
                        return bitmapDecodeStream;
                    case -1769724780:
                    case -313890860:
                    case -81639673:
                    case -50219307:
                        return bitmap;
                    case -1608220787:
                    case 2055783916:
                        if (RunnableC3055.m9940(abstractC22044M1774)) {
                            iM2761 = (i4 - C0619.m2761("ۤ᩷")) * (-111);
                            i5 = ((iM2761 ^ i3) * 4429) ^ (-2053068091);
                            i = 1000791696;
                        } else {
                            iM2761 = (C0773.m3169("ܽۘ") ^ i3) * (-63);
                            i5 = ((iM2761 ^ i4) * (-24683)) ^ 1362674195;
                            i = -700190537;
                        }
                        i7 = iM2761 ^ i;
                        bitmap = null;
                        break;
                    case -1532447076:
                    case -494144482:
                        if (C3779.f12953 > 0) {
                            iM2762 = (C0619.m2761("᩹᩷") + i3) * (-21);
                            i5 = ((iM2762 ^ i4) * (-10293)) ^ (-1452150842);
                            i6 = 1805999884;
                            break;
                        }
                        iM2762 = (C0619.m2761("ۜ۠") ^ i4) * (-59);
                        i5 = ((iM2762 ^ i3) * 25075) ^ (-157884843);
                        i6 = -1339141324;
                        break;
                        break;
                    case -1281007587:
                    case -988861218:
                        try {
                            RunnableC3646.m11799(th, th2);
                            iM2762 = (i4 - C0619.m2761("۠ۚ")) * 123;
                            i5 = ((iM2762 ^ i3) * (-27087)) ^ 540217453;
                            i6 = 551991383;
                        } catch (Exception unused) {
                            iM2762 = C0619.m2761("ۢ᩸") ^ i4;
                            i5 = ((iM2762 ^ i3) * 5091) ^ 1569813318;
                            i6 = 540276331;
                        }
                        break;
                    case -1162794661:
                    case 1404273941:
                        if (C13473.f42873 != 0) {
                            iM2762 = (C0773.m3169("۟᩻") ^ i3) * (-71);
                            i5 = ((iM2762 ^ i4) * 4717) ^ (-342023954);
                            i6 = -1719563712;
                            break;
                            break;
                        }
                        iM2762 = C0773.m3169("᩵ۡ") ^ i4;
                        i5 = ((iM2762 ^ i3) * 18105) ^ 2103005877;
                        i6 = 1316133967;
                        break;
                    case -1153623416:
                    case -206195269:
                        if (C3033.f9831 < 0) {
                            iM2762 = C0619.m2761("᩻ܶ") ^ i4;
                            i5 = ((iM2762 ^ i3) * (-26269)) ^ (-161813069);
                            i6 = 844817865;
                            break;
                        }
                        iM2762 = C0619.m2761("֨᩶") ^ i3;
                        i5 = ((iM2762 ^ i4) * (-32233)) ^ 397078095;
                        i6 = -874843364;
                        break;
                        break;
                    case -1038353385:
                    case -69129664:
                        if (C3448.f11240 < 0) {
                            iM2762 = (C0773.m3169("᩵ۙ") ^ i3) * 41;
                            i5 = ((iM2762 ^ i4) * (-16335)) ^ 1576631045;
                            i6 = -1414808513;
                            break;
                        }
                        iM2762 = (C0773.m3169("۟᩻") ^ i3) * (-71);
                        i5 = ((iM2762 ^ i4) * 4717) ^ (-342023954);
                        i6 = -1719563712;
                        break;
                        break;
                    case -856270624:
                    case -666431281:
                        if (!C0862.m3503()) {
                            iM2762 = (C0773.m3169("۬۫") + i3) * (-25);
                            i5 = ((iM2762 ^ i4) * 1429) ^ 1773763515;
                            i6 = 1181735162;
                            break;
                        }
                        iM2762 = C0619.m2761("ۛ᩶") ^ i4;
                        i5 = ((iM2762 ^ i3) * 1589) ^ 1673186128;
                        i6 = 304047438;
                        break;
                    case -592740918:
                    case 2000894572:
                        C0773.m3161();
                        if (C2354.f7599 >= 0) {
                            iM2762 = (C0619.m2761("ۜ۠") ^ i4) * (-59);
                            i5 = ((iM2762 ^ i3) * 25075) ^ (-157884843);
                            i6 = -1339141324;
                            break;
                            break;
                        }
                        iM2762 = C0773.m3169("᩵ۡ") ^ i4;
                        i5 = ((iM2762 ^ i3) * 18105) ^ 2103005877;
                        i6 = 1316133967;
                        break;
                        break;
                    case -419707388:
                    case 1393824643:
                        C3779.m12264();
                        iM2762 = C0773.m3169("᩵ۡ") ^ i4;
                        i5 = ((iM2762 ^ i3) * 18105) ^ 2103005877;
                        i6 = 1316133967;
                        break;
                        break;
                    case -381285950:
                    case 2137839442:
                        throw th;
                    case -121202070:
                    case 1392319434:
                        C3448.m11248();
                        C2966.m9664();
                        return null;
                    case 22349068:
                    case 1258435288:
                        if (C0950.f3488 < 0) {
                            iM2762 = C0773.m3169("ܺۚ") ^ i4;
                            i5 = ((iM2762 ^ i3) * (-7501)) ^ (-2112262311);
                            i6 = -778117279;
                            break;
                        }
                        iM2762 = C0773.m3169("᩵ۡ") ^ i4;
                        i5 = ((iM2762 ^ i3) * 18105) ^ 2103005877;
                        i6 = 1316133967;
                        break;
                        break;
                    case 37211153:
                    case 2026566302:
                        if (C0269.f1558 > 0) {
                            iM2762 = (i4 - C0773.m3169("᩺֫")) * (-75);
                            i5 = ((iM2762 ^ i3) * 30075) ^ (-483641911);
                            i6 = 2052261350;
                            break;
                        }
                        iM2762 = (C0773.m3169("۟᩻") ^ i3) * (-71);
                        i5 = ((iM2762 ^ i4) * 4717) ^ (-342023954);
                        i6 = -1719563712;
                        break;
                        break;
                    case 86147555:
                    case 1409490922:
                        try {
                            bufferedInputStreamM49875.close();
                            iM2762 = (i4 - C0619.m2761("۠ۚ")) * 123;
                            i5 = ((iM2762 ^ i3) * (-27087)) ^ 540217453;
                            i6 = 551991383;
                        } catch (Throwable th4) {
                            th2 = th4;
                            iM2762 = (C0619.m2761("᩹᩹") ^ i3) * (-91);
                            i5 = ((iM2762 ^ i4) * 5317) ^ 1438501494;
                            i6 = 1870149830;
                        }
                        break;
                    case 202390019:
                    case 1795054659:
                        if (!C0619.f2439) {
                            iM2762 = (C0773.m3169("۠ܿ") ^ i3) * (-71);
                            i5 = ((iM2762 ^ i4) * (-12187)) ^ (-679736922);
                            i6 = -1076090753;
                            break;
                        }
                        iM2762 = C0619.m2761("᩻ܶ") ^ i4;
                        i5 = ((iM2762 ^ i3) * (-26269)) ^ (-161813069);
                        i6 = 844817865;
                        break;
                        break;
                    case 844055506:
                    case 1730741416:
                        abstractC22044M1774 = C0269.m1774(abstractC22044, str);
                        if (!C3779.m12264()) {
                            iM2762 = (C0773.m3169("۬۫") + i3) * (-25);
                            i5 = ((iM2762 ^ i4) * 1429) ^ 1773763515;
                            i6 = 1181735162;
                            break;
                            break;
                        }
                        iM2762 = (C0773.m3169("ᩴۙ") ^ i3) * (-41);
                        i5 = ((iM2762 ^ i4) * 11963) ^ 657798791;
                        i6 = 1143019415;
                        break;
                    default:
                        if (C1519.f5300 < 0) {
                            iM2762 = C0619.m2761("ܳᩴ") ^ i3;
                            i5 = ((iM2762 ^ i4) * (-10569)) ^ 1493523492;
                            i6 = 1551076449;
                            break;
                        }
                        iM2762 = (C0773.m3169("۟᩻") ^ i3) * (-71);
                        i5 = ((iM2762 ^ i4) * 4717) ^ (-342023954);
                        i6 = -1719563712;
                        break;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x040a A[PHI: r36
      0x040a: PHI (r36v6 java.lang.String) = (r36v1 java.lang.String), (r36v2 java.lang.String), (r36v4 java.lang.String), (r36v1 java.lang.String) binds: [B:73:0x03f0, B:60:0x0350, B:49:0x02cf, B:40:0x0275] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x04ad A[PHI: r33
      0x04ad: PHI (r33v3 java.lang.String) = (r33v1 java.lang.String), (r33v2 java.lang.String), (r33v4 java.lang.String) binds: [B:87:0x0496, B:78:0x0426, B:67:0x03a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m133(AbstractActivityC17204 abstractActivityC17204, boolean z) {
        int iM3169;
        int i;
        int i2;
        int iM31610;
        int i3;
        int i4;
        int i5;
        int iM31611;
        int i6;
        String str;
        int i7;
        short[] sArr;
        int i8;
        short[] sArr2;
        short[] sArr3;
        int i9;
        int i10;
        short[] sArr4;
        int i11;
        String str2;
        String str3;
        int i12;
        String str4;
        int iM31612;
        int i13;
        short[] sArr5;
        String str5;
        int i14;
        short[] sArr6;
        short[] sArr7;
        int i15;
        int i16;
        short[] sArr8;
        int i17;
        String str6;
        ArrayList arrayList;
        int i18;
        int iM31613;
        int i19;
        int i20;
        String str7;
        int i21;
        int i22;
        short[] sArr9;
        int i23;
        int i24;
        short[] sArr10;
        int i25;
        short[] sArr11;
        ArrayList arrayList2;
        int i26;
        int i27;
        int i28;
        short[] sArr12;
        int i29;
        short[] sArr13;
        ArrayList arrayList3;
        int i30;
        String strM2756;
        String str8;
        String str9;
        int i31;
        boolean z2;
        int i32;
        String str10;
        String str11;
        int i33;
        String str12;
        int i34;
        String str13;
        ArrayList arrayList4;
        short[] sArr14;
        int i35;
        String strM8350;
        int iM31614;
        String str14;
        int i36;
        int i37;
        ArrayList arrayList5;
        String str15;
        String str16;
        String str17;
        int i38;
        int i39;
        String str18;
        String str19;
        int i40;
        short[] sArr15;
        int i41;
        String strM2049;
        int i42;
        int iM2761;
        int i43;
        String str20;
        int iM31615;
        int i44;
        int i45;
        String str21;
        int iM2762;
        int i46;
        int i47;
        int iM31616;
        int i48;
        int i49;
        int iM31617;
        int i50;
        int i51;
        String str22;
        int i52;
        String str23;
        int iM31618;
        int i53;
        int i54;
        String str24;
        int i55;
        Bitmap bitmapM48866;
        int iM2763;
        int i56;
        int i57;
        Bitmap bitmapM48867;
        Bitmap bitmap = null;
        Bitmap bitmap2 = null;
        Bitmap bitmapM135 = null;
        String strM2760 = null;
        String strM3168 = null;
        boolean z3 = false;
        Bitmap bitmap3 = null;
        int iM31619 = 0;
        int i58 = 0;
        String strM9847 = null;
        short s = 0;
        short s2 = 0;
        int i59 = 763878880;
        int i60 = RunnableC3055.f9898;
        int i61 = C11235.f35427;
        int iM31620 = C0773.m3169("᩶ۗ") ^ i60;
        int i62 = ((iM31620 ^ i61) * 5545) ^ 1513364932;
        int i63 = iM31620 ^ (-357368000);
        Iterator itM7968 = null;
        C15184 c15184 = null;
        Intent intentM36532 = null;
        String strM3169 = null;
        Intent intentM36533 = null;
        String strM2761 = null;
        String strM6152 = null;
        CharSequence charSequence = null;
        C19660 c19660 = null;
        short[] sArr16 = null;
        short[] sArr17 = null;
        short[] sArr18 = null;
        short[] sArr19 = null;
        short[] sArr20 = null;
        short[] sArr21 = null;
        ArrayList arrayList6 = null;
        int iM47190 = 0;
        int i64 = 0;
        int i65 = 0;
        int i66 = 0;
        int iM31621 = 0;
        boolean z4 = false;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        int i70 = 0;
        int i71 = 0;
        int i72 = 0;
        int i73 = 0;
        int i74 = 0;
        int i75 = 0;
        int i76 = 0;
        String str25 = null;
        String str26 = null;
        String strM31610 = null;
        String strM2762 = null;
        boolean zM131 = false;
        String str27 = null;
        String str28 = null;
        CharSequence charSequenceM36531 = null;
        C15184 c15185 = null;
        boolean z5 = false;
        String str29 = null;
        Iterator itM13647 = null;
        boolean z6 = false;
        String strM20410 = null;
        int i77 = 0;
        while (true) {
            i59 = i63 ^ (i62 & (((i59 ^ i61) * (-3551)) >> 31));
            switch (i59) {
                case -2130547850:
                case 523286635:
                    AbstractC0116.m1243();
                    C3734.m12152();
                    str29 = str29;
                    strM2756 = str27;
                    str25 = str25;
                    i65 = i65;
                    z4 = z4;
                    i27 = i68;
                    i28 = i73;
                    sArr12 = sArr21;
                    i29 = i76;
                    str6 = strM6152;
                    strM20410 = strM20410;
                    i64 = i64;
                    sArr13 = sArr19;
                    str26 = str26;
                    i77 = i77;
                    str28 = str28;
                    arrayList3 = arrayList6;
                    i30 = i74;
                    int iM2764 = C0619.m2761("ۧ۬") ^ i61;
                    short[] sArr22 = sArr13;
                    i19 = ((iM2764 ^ i60) * 13905) ^ 1039499016;
                    i63 = iM2764 ^ (-1891301240);
                    i73 = i28;
                    i74 = i30;
                    i68 = i27;
                    arrayList6 = arrayList3;
                    str27 = strM2756;
                    sArr21 = sArr12;
                    i76 = i29;
                    sArr19 = sArr22;
                    i62 = i19;
                    str28 = str28;
                    i77 = i77;
                    str26 = str26;
                    strM6152 = str6;
                    i64 = i64;
                    z4 = z4;
                    strM20410 = strM20410;
                    i65 = i65;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -2093680755:
                case -894751768:
                    if (bitmap3 != null) {
                        iM3169 = C0619.m2761("᩵֡") ^ i60;
                        i = ((iM3169 ^ i61) * 5045) ^ 49916417;
                        i2 = -1015374002;
                    } else {
                        iM3169 = (C0773.m3169("᩻۫") + i61) * 73;
                        i = ((iM3169 ^ i60) * 13205) ^ (-339067823);
                        i2 = 96114371;
                    }
                    i63 = iM3169 ^ i2;
                    i62 = i;
                    break;
                case -2074832317:
                case 1480656497:
                    if (!C3077.m10041()) {
                        str29 = str29;
                        str = str27;
                        str25 = str25;
                        i65 = i65;
                        z4 = z4;
                        i7 = i68;
                        sArr = sArr17;
                        i8 = i71;
                        sArr2 = sArr18;
                        sArr3 = sArr19;
                        i9 = i73;
                        i10 = i74;
                        sArr4 = sArr21;
                        i11 = i76;
                        str2 = strM6152;
                        strM20410 = strM20410;
                        i64 = i64;
                        str3 = str26;
                        i12 = i77;
                        str4 = str28;
                        iM31612 = C0619.m2761("ۛۛ") ^ i61;
                        i62 = ((iM31612 ^ i60) * 31031) ^ 319635452;
                        i13 = -866681049;
                        i63 = iM31612 ^ i13;
                        str28 = str4;
                        i68 = i7;
                        i77 = i12;
                        str26 = str3;
                        strM6152 = str2;
                        str27 = str;
                        sArr21 = sArr4;
                        i76 = i11;
                        i73 = i9;
                        sArr19 = sArr3;
                        i74 = i10;
                        sArr18 = sArr2;
                        sArr17 = sArr;
                        i71 = i8;
                        i64 = i64;
                        z4 = z4;
                        strM20410 = strM20410;
                        i65 = i65;
                        str25 = str25;
                        str29 = str29;
                    } else {
                        iM3169 = (i60 - C0773.m3169("ᩳ᩻")) * (-71);
                        i = ((iM3169 ^ i61) * (-31081)) ^ (-1041660436);
                        i2 = -255677462;
                        i63 = iM3169 ^ i2;
                        i62 = i;
                    }
                    break;
                case -2023080845:
                case -185024457:
                    strM2760 = C0619.m2760(intentM36533, str29);
                    if (strM2760 != null) {
                        iM3169 = C0619.m2761("۠֨") ^ i60;
                        i = ((iM3169 ^ i61) * 19195) ^ 1844186790;
                        i2 = 583236686;
                    } else {
                        iM3169 = C0619.m2761("᩵ۙ") ^ i60;
                        i = ((iM3169 ^ i61) * (-25367)) ^ 1551690895;
                        i2 = -385116827;
                    }
                    i63 = iM3169 ^ i2;
                    i62 = i;
                    break;
                case -1971809565:
                case -91385754:
                    z5 = z3;
                    iM2761 = C0773.m3169("ᩴܳ") ^ i61;
                    i62 = ((iM2761 ^ i60) * (-17561)) ^ (-2014365137);
                    i43 = 981287143;
                    i63 = iM2761 ^ i43;
                    i68 = i68;
                    arrayList6 = arrayList6;
                    strM6152 = strM6152;
                    str27 = str27;
                    str28 = str28;
                    z4 = z4;
                    i77 = i77;
                    str26 = str26;
                    i64 = i64;
                    strM20410 = strM20410;
                    i65 = i65;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -1962551464:
                case 917018839:
                    str29 = str29;
                    str27 = str27;
                    str25 = str25;
                    i65 = i65;
                    z4 = z4;
                    i68 = i68;
                    strM6152 = strM6152;
                    strM20410 = strM20410;
                    i64 = i64;
                    str26 = str26;
                    i77 = i77;
                    str21 = str28;
                    if (C3099.m10097(arrayList6)) {
                        iM2762 = (C0619.m2761("ۙ᩵") ^ i61) * 53;
                        i62 = ((iM2762 ^ i60) * (-30437)) ^ 2091448047;
                        i46 = 1637286440;
                    } else {
                        iM2762 = C0619.m2761("ᩴۨ") ^ i60;
                        i62 = ((iM2762 ^ i61) * 24115) ^ 1666135577;
                        i46 = 1916616447;
                    }
                    i63 = iM2762 ^ i46;
                    str28 = str21;
                    i68 = i68;
                    i77 = i77;
                    str26 = str26;
                    strM6152 = strM6152;
                    str27 = str27;
                    i64 = i64;
                    z4 = z4;
                    strM20410 = strM20410;
                    i65 = i65;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -1945525705:
                case -1685791908:
                    bitmap = null;
                    z3 = z5;
                    iM31617 = C0773.m3169("ܽۢ") ^ i60;
                    i50 = ((iM31617 ^ i61) * 21501) ^ 1797827268;
                    i51 = 1464670490;
                    i63 = iM31617 ^ i51;
                    i68 = i68;
                    strM6152 = strM6152;
                    str29 = str29;
                    str27 = str27;
                    z4 = z4;
                    str24 = strM20410;
                    i65 = i65;
                    i62 = i50;
                    i77 = i77;
                    str26 = str26;
                    i64 = i64;
                    strM20410 = str24;
                    break;
                case -1943844531:
                case -937486770:
                    if (C0862.f3233 == 0) {
                        iM3169 = (C0619.m2761("۟ܶ") + i60) * (-39);
                        i = ((iM3169 ^ i61) * (-311)) ^ 371948754;
                        i2 = 1245972200;
                        i63 = iM3169 ^ i2;
                        i62 = i;
                    } else {
                        str29 = str29;
                        strM2756 = str27;
                        str25 = str25;
                        i65 = i65;
                        z4 = z4;
                        i27 = i68;
                        i28 = i73;
                        sArr12 = sArr21;
                        i29 = i76;
                        str6 = strM6152;
                        strM20410 = strM20410;
                        i64 = i64;
                        sArr13 = sArr19;
                        str26 = str26;
                        i77 = i77;
                        str28 = str28;
                        arrayList3 = arrayList6;
                        i30 = i74;
                        int iM2765 = C0619.m2761("ۧ۬") ^ i61;
                        short[] sArr23 = sArr13;
                        i19 = ((iM2765 ^ i60) * 13905) ^ 1039499016;
                        i63 = iM2765 ^ (-1891301240);
                        i73 = i28;
                        i74 = i30;
                        i68 = i27;
                        arrayList6 = arrayList3;
                        str27 = strM2756;
                        sArr21 = sArr12;
                        i76 = i29;
                        sArr19 = sArr23;
                        i62 = i19;
                        str28 = str28;
                        i77 = i77;
                        str26 = str26;
                        strM6152 = str6;
                        i64 = i64;
                        z4 = z4;
                        strM20410 = strM20410;
                        i65 = i65;
                        str25 = str25;
                        str29 = str29;
                    }
                    break;
                case -1852624513:
                case 1720175575:
                    str29 = str29;
                    str27 = str27;
                    i65 = i65;
                    z4 = z4;
                    i68 = i68;
                    strM6152 = strM6152;
                    strM20410 = strM20410;
                    i64 = i64;
                    str26 = str26;
                    i77 = i77;
                    if (!z) {
                        iM31616 = C0773.m3169("ۜ֫") ^ i61;
                        i48 = ((iM31616 ^ i60) * 14741) ^ 177445730;
                        i49 = -732249637;
                        i63 = iM31616 ^ i49;
                        i68 = i68;
                        i77 = i77;
                        str26 = str26;
                        strM6152 = strM6152;
                        str27 = str27;
                        i64 = i64;
                        z4 = z4;
                        strM20410 = strM20410;
                        i65 = i65;
                        i62 = i48;
                        str29 = str29;
                    } else {
                        iM31617 = (C0773.m3169("ܿ۟") ^ i61) * 77;
                        i50 = ((iM31617 ^ i60) * 1737) ^ (-1257433587);
                        i51 = -1923563596;
                        i63 = iM31617 ^ i51;
                        i68 = i68;
                        strM6152 = strM6152;
                        str29 = str29;
                        str27 = str27;
                        z4 = z4;
                        str24 = strM20410;
                        i65 = i65;
                        i62 = i50;
                        i77 = i77;
                        str26 = str26;
                        i64 = i64;
                        strM20410 = str24;
                    }
                    break;
                case -1824062410:
                case -1402468893:
                    String strM6153 = C1750.m6152(strM3168);
                    if (strM6153 != null) {
                        charSequence = strM6153;
                    } else {
                        charSequence = charSequenceM36531;
                    }
                    iM3169 = C0619.m2761("֫᩵") ^ i60;
                    i = ((iM3169 ^ i61) * (-6615)) ^ 140809310;
                    i2 = -537004704;
                    i63 = iM3169 ^ i2;
                    i62 = i;
                    break;
                case -1742539889:
                case -1501094726:
                    str29 = str29;
                    str27 = str27;
                    i65 = i65;
                    z4 = z4;
                    i68 = i68;
                    strM6152 = strM6152;
                    strM20410 = strM20410;
                    i64 = i64;
                    str26 = str26;
                    i77 = i77;
                    if (!C1761.m6214(abstractActivityC17204, arrayList6)) {
                        iM31616 = C0619.m2761("ᩳܺ") ^ i60;
                        i48 = ((iM31616 ^ i61) * (-14891)) ^ (-126807276);
                        i49 = -1804966299;
                        i63 = iM31616 ^ i49;
                        i68 = i68;
                        i77 = i77;
                        str26 = str26;
                        strM6152 = strM6152;
                        str27 = str27;
                        i64 = i64;
                        z4 = z4;
                        strM20410 = strM20410;
                        i65 = i65;
                        i62 = i48;
                        str29 = str29;
                    } else {
                        str25 = str25;
                        str21 = str28;
                        i65 = i65;
                        iM2762 = (C0619.m2761("ۙ᩵") ^ i61) * 53;
                        i62 = ((iM2762 ^ i60) * (-30437)) ^ 2091448047;
                        i46 = 1637286440;
                        i63 = iM2762 ^ i46;
                        str28 = str21;
                        i68 = i68;
                        i77 = i77;
                        str26 = str26;
                        strM6152 = strM6152;
                        str27 = str27;
                        i64 = i64;
                        z4 = z4;
                        strM20410 = strM20410;
                        i65 = i65;
                        str25 = str25;
                        str29 = str29;
                    }
                    break;
                case -1739742791:
                case -982419392:
                    C3690.m11987();
                    if (C0487.f2131 <= 0) {
                        str8 = str29;
                        str9 = str27;
                        z2 = z4;
                        i32 = i68;
                        sArr14 = sArr20;
                        str10 = strM6152;
                        strM8350 = str25;
                        i31 = i65;
                        str11 = strM20410;
                        i33 = i64;
                        str12 = str26;
                        i34 = i77;
                        str13 = str28;
                        arrayList4 = arrayList6;
                        i35 = i75;
                        iM31614 = (C0619.m2761("ۨ֡") + i61) * (-69);
                        str14 = strM8350;
                        i36 = ((iM31614 ^ i60) * (-31703)) ^ 1809044784;
                        i37 = -454051790;
                        i63 = iM31614 ^ i37;
                        sArr20 = sArr14;
                        i75 = i35;
                        i68 = i32;
                        arrayList6 = arrayList4;
                        str29 = str8;
                        str27 = str9;
                        i62 = i36;
                        str28 = str13;
                        i77 = i34;
                        str26 = str12;
                        strM6152 = str10;
                        i64 = i33;
                        z4 = z2;
                        strM20410 = str11;
                        i65 = i31;
                        str25 = str14;
                    } else {
                        iM3169 = (C0619.m2761("۟ܶ") + i60) * (-39);
                        i = ((iM3169 ^ i61) * (-311)) ^ 371948754;
                        i2 = 1245972200;
                        i63 = iM3169 ^ i2;
                        i62 = i;
                    }
                    break;
                case -1710578090:
                case -1199707055:
                    bitmapM135 = m135(str26);
                    z4 = z4;
                    strM6152 = strM6152;
                    str26 = str26;
                    iM2763 = C0773.m3169("۫᩸") ^ i60;
                    i56 = ((iM2763 ^ i61) * (-15611)) ^ 1864630391;
                    i57 = -51355067;
                    i63 = iM2763 ^ i57;
                    i62 = i56;
                    i77 = i77;
                    str26 = str26;
                    strM6152 = strM6152;
                    z4 = z4;
                    break;
                case -1680261050:
                case 1669993618:
                    str29 = str29;
                    str = str27;
                    str25 = str25;
                    i65 = i65;
                    z4 = z4;
                    i7 = i68;
                    sArr = sArr17;
                    i8 = i71;
                    sArr2 = sArr18;
                    sArr3 = sArr19;
                    i9 = i73;
                    i10 = i74;
                    sArr4 = sArr21;
                    i11 = i76;
                    str2 = strM6152;
                    strM20410 = strM20410;
                    i64 = i64;
                    str3 = str26;
                    i12 = i77;
                    str4 = str28;
                    arrayList6 = new ArrayList();
                    zM131 = m131();
                    sArr16 = f58;
                    i69 = 11;
                    if (C1783.m6232()) {
                        iM31612 = (C0773.m3169("۟ۜ") + i60) * 79;
                        i62 = ((iM31612 ^ i61) * 32349) ^ (-2110204992);
                        i13 = -2002272905;
                    } else {
                        iM31612 = C0619.m2761("ۛۛ") ^ i61;
                        i62 = ((iM31612 ^ i60) * 31031) ^ 319635452;
                        i13 = -866681049;
                    }
                    i63 = iM31612 ^ i13;
                    str28 = str4;
                    i68 = i7;
                    i77 = i12;
                    str26 = str3;
                    strM6152 = str2;
                    str27 = str;
                    sArr21 = sArr4;
                    i76 = i11;
                    i73 = i9;
                    sArr19 = sArr3;
                    i74 = i10;
                    sArr18 = sArr2;
                    sArr17 = sArr;
                    i71 = i8;
                    i64 = i64;
                    z4 = z4;
                    strM20410 = strM20410;
                    i65 = i65;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -1626307538:
                case -28053796:
                    str29 = str29;
                    str27 = str27;
                    str25 = str25;
                    i65 = i65;
                    z4 = z4;
                    i4 = i68;
                    sArr16 = sArr16;
                    sArr17 = sArr17;
                    i71 = i71;
                    sArr18 = sArr18;
                    sArr19 = sArr19;
                    i73 = i73;
                    i74 = i74;
                    sArr21 = sArr21;
                    i76 = i76;
                    strM6152 = strM6152;
                    strM20410 = strM20410;
                    i64 = i64;
                    str26 = str26;
                    i77 = i77;
                    str28 = str28;
                    arrayList6 = arrayList6;
                    i5 = i69;
                    if (((s * s) + 203975524) - (s * s2) < 0) {
                        iM31611 = (i61 - C0619.m2761("ۛ֡")) * (-77);
                        i62 = ((iM31611 ^ i60) * 563) ^ (-654101353);
                        i6 = 307019187;
                    } else {
                        iM31611 = (C0773.m3169("ۤۢ") ^ i61) * 15;
                        i62 = ((iM31611 ^ i60) * (-19761)) ^ (-32271900);
                        i6 = 1091016610;
                    }
                    i63 = iM31611 ^ i6;
                    i69 = i5;
                    i68 = i4;
                    arrayList6 = arrayList6;
                    strM6152 = strM6152;
                    str27 = str27;
                    sArr21 = sArr21;
                    i76 = i76;
                    i73 = i73;
                    sArr19 = sArr19;
                    i74 = i74;
                    sArr18 = sArr18;
                    sArr17 = sArr17;
                    i71 = i71;
                    sArr16 = sArr16;
                    str28 = str28;
                    z4 = z4;
                    i77 = i77;
                    str26 = str26;
                    i64 = i64;
                    strM20410 = strM20410;
                    i65 = i65;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -1622287656:
                case -870171456:
                    str29 = str29;
                    str5 = str27;
                    str25 = str25;
                    str28 = str28;
                    i65 = i65;
                    z4 = z4;
                    i14 = i68;
                    sArr6 = sArr18;
                    sArr7 = sArr19;
                    i15 = i73;
                    i16 = i74;
                    sArr8 = sArr21;
                    i17 = i76;
                    str6 = strM6152;
                    arrayList = arrayList6;
                    strM20410 = strM20410;
                    i64 = i64;
                    str26 = str26;
                    i18 = iM31619 ^ i58;
                    sArr17 = f58;
                    i70 = 14;
                    i71 = 5;
                    if (C11235.f35427 >= 0) {
                        iM31613 = C0773.m3169("᩷ۘ") ^ i60;
                        i77 = i18;
                        i19 = ((iM31613 ^ i61) * (-9365)) ^ (-1187844537);
                        i20 = -1849140626;
                    } else {
                        iM31613 = C0773.m3169("۠ۜ") ^ i61;
                        i77 = i18;
                        i19 = ((iM31613 ^ i60) * (-7639)) ^ (-1440634861);
                        i20 = -95186991;
                    }
                    i63 = iM31613 ^ i20;
                    sArr18 = sArr6;
                    i68 = i14;
                    arrayList6 = arrayList;
                    str27 = str5;
                    sArr21 = sArr8;
                    i76 = i17;
                    i73 = i15;
                    sArr19 = sArr7;
                    i74 = i16;
                    i62 = i19;
                    str28 = str28;
                    i77 = i77;
                    str26 = str26;
                    strM6152 = str6;
                    i64 = i64;
                    z4 = z4;
                    strM20410 = strM20410;
                    i65 = i65;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -1553810320:
                case -98505667:
                    C3734.m12146(iM31621);
                    break;
                case -1491275220:
                case 1984128896:
                    if (bitmap3 == null) {
                        iM2761 = (C0773.m3169("᩸᩹") + i61) * (-27);
                        i62 = ((iM2761 ^ i60) * (-21629)) ^ 1299061459;
                        i43 = 2092389660;
                        i63 = iM2761 ^ i43;
                        i68 = i68;
                        arrayList6 = arrayList6;
                        strM6152 = strM6152;
                        str27 = str27;
                        str28 = str28;
                        z4 = z4;
                        i77 = i77;
                        str26 = str26;
                        i64 = i64;
                        strM20410 = strM20410;
                        i65 = i65;
                        str25 = str25;
                        str29 = str29;
                    } else {
                        iM3169 = C0773.m3169("ۡ֨") ^ i61;
                        i = ((iM3169 ^ i60) * 15123) ^ (-1074112018);
                        i2 = -1519780326;
                        i63 = iM3169 ^ i2;
                        i62 = i;
                    }
                    break;
                case -1487097263:
                case 2121640646:
                    str29 = str29;
                    str27 = str27;
                    i65 = i65;
                    z4 = z4;
                    i68 = i68;
                    strM6152 = strM6152;
                    strM20410 = strM20410;
                    str23 = str26;
                    i77 = i77;
                    if (!z) {
                        i64 = i64;
                        str26 = str23;
                        iM31616 = C0773.m3169("ۜ֫") ^ i61;
                        i48 = ((iM31616 ^ i60) * 14741) ^ 177445730;
                        i49 = -732249637;
                        i63 = iM31616 ^ i49;
                        i68 = i68;
                        i77 = i77;
                        str26 = str26;
                        strM6152 = strM6152;
                        str27 = str27;
                        i64 = i64;
                        z4 = z4;
                        strM20410 = strM20410;
                        i65 = i65;
                        i62 = i48;
                        str29 = str29;
                    } else {
                        iM31618 = C0773.m3169("۠ۘ") ^ i60;
                        i53 = ((iM31618 ^ i61) * (-14357)) ^ (-295895854);
                        i54 = -1207127901;
                        i63 = iM31618 ^ i54;
                        i68 = i68;
                        i77 = i77;
                        str29 = str29;
                        str27 = str27;
                        str26 = str23;
                        strM6152 = strM6152;
                        z4 = z4;
                        str24 = strM20410;
                        i65 = i65;
                        i62 = i53;
                        strM20410 = str24;
                    }
                    break;
                case -1466152820:
                case 390462602:
                    str29 = str29;
                    str27 = str27;
                    str25 = str25;
                    i65 = i65;
                    z4 = z4;
                    i68 = i68;
                    strM6152 = strM6152;
                    strM20410 = strM20410;
                    i64 = i64;
                    str26 = str26;
                    i77 = i77;
                    str28 = str28;
                    arrayList6 = arrayList6;
                    if (C3998.m12923(itM13647)) {
                        iM2761 = (C0773.m3169("᩻᩻") ^ i60) * (-99);
                        i62 = ((iM2761 ^ i61) * (-18773)) ^ 617512922;
                        i43 = -1210113483;
                    } else {
                        iM2761 = C0619.m2761("ۢۡ") ^ i60;
                        i62 = ((iM2761 ^ i61) * 13769) ^ 1539369887;
                        i43 = 831201012;
                    }
                    i63 = iM2761 ^ i43;
                    i68 = i68;
                    arrayList6 = arrayList6;
                    strM6152 = strM6152;
                    str27 = str27;
                    str28 = str28;
                    z4 = z4;
                    i77 = i77;
                    str26 = str26;
                    i64 = i64;
                    strM20410 = strM20410;
                    i65 = i65;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -1461598715:
                case -616510110:
                    i55 = i66;
                    bitmapM48866 = null;
                    bitmap3 = bitmapM48866;
                    iM2763 = (i61 - C0619.m2761("ۗۧ")) * (-19);
                    i66 = i55;
                    i56 = ((iM2763 ^ i60) * (-6653)) ^ (-976304860);
                    i57 = 323045559;
                    i63 = iM2763 ^ i57;
                    i62 = i56;
                    i77 = i77;
                    str26 = str26;
                    strM6152 = strM6152;
                    z4 = z4;
                    break;
                case -1451639681:
                case 952445451:
                    arrayList5 = arrayList6;
                    str15 = strM20410;
                    str29 = str29;
                    str16 = str27;
                    str17 = str25;
                    i38 = i64;
                    z4 = z4;
                    i39 = i68;
                    str18 = strM6152;
                    str19 = str26;
                    i40 = i77;
                    sArr15 = sArr21;
                    i41 = i76;
                    strM2049 = RunnableC0334.m2049(sArr15, i41, 15, i39);
                    z6 = false;
                    if (!zM131) {
                        i42 = -1;
                        int iM2766 = (C0619.m2761("ۜۨ") ^ i61) * (-117);
                        String str30 = strM2049;
                        int i78 = ((iM2766 ^ i60) * (-4903)) ^ (-17894020);
                        i63 = iM2766 ^ (-1979341165);
                        sArr21 = sArr15;
                        i76 = i41;
                        i68 = i39;
                        i77 = i40;
                        arrayList6 = arrayList5;
                        str26 = str19;
                        str27 = str16;
                        i62 = i78;
                        i64 = i38;
                        str28 = str30;
                        strM20410 = str15;
                        strM6152 = str18;
                        i65 = i42;
                        str25 = str17;
                        z4 = z4;
                        str29 = str29;
                    } else {
                        int iM31622 = C0773.m3169("᩵ۤ") ^ i60;
                        i63 = iM31622 ^ (-782752457);
                        sArr21 = sArr15;
                        i76 = i41;
                        i62 = ((iM31622 ^ i61) * 6329) ^ (-1213509499);
                        str25 = str17;
                        i68 = i39;
                        i77 = i40;
                        arrayList6 = arrayList5;
                        str26 = str19;
                        str29 = str29;
                        str27 = str16;
                        str28 = strM2049;
                        i64 = i38;
                        strM20410 = str15;
                        strM6152 = str18;
                        i65 = -1;
                        z4 = z4;
                    }
                    break;
                case -1421637857:
                case 572258982:
                    strM6152 = C1750.m6152(strM2760);
                    iM3169 = C0773.m3169("֫ܳ") ^ i61;
                    i = ((iM3169 ^ i60) * (-20365)) ^ 90439636;
                    i2 = 1586455268;
                    i63 = iM3169 ^ i2;
                    i62 = i;
                    break;
                case -1414288899:
                case 1208745097:
                    if (intentM36532.getBooleanExtra(str27, false)) {
                        iM3169 = (C0619.m2761("ܿ֨") + i61) * 99;
                        i = ((iM3169 ^ i60) * 28505) ^ 713126975;
                        i2 = -1956566316;
                    } else {
                        charSequence = charSequenceM36531;
                        iM3169 = C0619.m2761("֫᩵") ^ i60;
                        i = ((iM3169 ^ i61) * (-6615)) ^ 140809310;
                        i2 = -537004704;
                    }
                    i63 = iM3169 ^ i2;
                    i62 = i;
                    break;
                case -1372115829:
                case -1180338098:
                    str29 = str29;
                    str27 = str27;
                    i65 = i65;
                    z4 = z4;
                    i68 = i68;
                    strM6152 = strM6152;
                    strM20410 = strM20410;
                    i64 = i64;
                    str26 = str26;
                    i77 = i77;
                    C3734.m12146(C0619.m2761(strM9847) ^ 2127129347);
                    iM31616 = C0773.m3169("ۜ֫") ^ i61;
                    i48 = ((iM31616 ^ i60) * 14741) ^ 177445730;
                    i49 = -732249637;
                    i63 = iM31616 ^ i49;
                    i68 = i68;
                    i77 = i77;
                    str26 = str26;
                    strM6152 = strM6152;
                    str27 = str27;
                    i64 = i64;
                    z4 = z4;
                    strM20410 = strM20410;
                    i65 = i65;
                    i62 = i48;
                    str29 = str29;
                    break;
                case -1364304230:
                case 903989454:
                    C19660 c19661 = new C19660(c15184);
                    c19661.m45324(charSequence);
                    c19661.m45325(C9545.m24962(bitmapM135));
                    RunnableC0334.m2054(arrayList6, c19661.m45322());
                    iM3169 = C0773.m3169("᩹ۜ") ^ i60;
                    i = ((iM3169 ^ i61) * 22795) ^ (-262614764);
                    i2 = 1617387236;
                    i63 = iM3169 ^ i2;
                    i62 = i;
                    break;
                case -1326895572:
                case -924888830:
                    String str31 = strM2760;
                    if (!C0487.m2359(str31, strM20410)) {
                        strM2760 = str31;
                        iM3169 = C0619.m2761("᩵ۙ") ^ i60;
                        i = ((iM3169 ^ i61) * (-25367)) ^ 1551690895;
                        i2 = -385116827;
                        i63 = iM3169 ^ i2;
                        i62 = i;
                    } else {
                        iM31610 = C0773.m3169("۠ۤ") ^ i61;
                        strM2760 = str31;
                        i62 = ((iM31610 ^ i60) * (-18767)) ^ (-1109811411);
                        i3 = -1325853194;
                        i63 = iM31610 ^ i3;
                    }
                    break;
                case -1315128438:
                case 1007752098:
                    i55 = i66;
                    bitmapM48866 = RunnableC21479.m48866(C20613.f66104.mo32682(), i55, z6);
                    bitmap3 = bitmapM48866;
                    iM2763 = (i61 - C0619.m2761("ۗۧ")) * (-19);
                    i66 = i55;
                    i56 = ((iM2763 ^ i60) * (-6653)) ^ (-976304860);
                    i57 = 323045559;
                    i63 = iM2763 ^ i57;
                    i62 = i56;
                    i77 = i77;
                    str26 = str26;
                    strM6152 = strM6152;
                    z4 = z4;
                    break;
                case -1291890108:
                case 1625328770:
                    str29 = str29;
                    str27 = str27;
                    i65 = i65;
                    z4 = z4;
                    i68 = i68;
                    strM6152 = strM6152;
                    strM20410 = strM20410;
                    i64 = i64;
                    str26 = str26;
                    i77 = i77;
                    if (strM2761 != null) {
                        iM31617 = C0773.m3169("ܶ᩶") ^ i61;
                        i50 = ((iM31617 ^ i60) * (-22459)) ^ 674939861;
                        i51 = 1909372440;
                    } else {
                        iM31617 = (C0773.m3169("᩵᩷") + i60) * (-11);
                        i50 = ((iM31617 ^ i61) * 16141) ^ 970472642;
                        i51 = -1903581014;
                    }
                    i63 = iM31617 ^ i51;
                    i68 = i68;
                    strM6152 = strM6152;
                    str29 = str29;
                    str27 = str27;
                    z4 = z4;
                    str24 = strM20410;
                    i65 = i65;
                    i62 = i50;
                    i77 = i77;
                    str26 = str26;
                    i64 = i64;
                    strM20410 = str24;
                    break;
                case -1286858390:
                case 384591148:
                    if (bitmapM135 == null) {
                        iM3169 = C0619.m2761("ܺ֫") ^ i60;
                        i = ((iM3169 ^ i61) * (-8043)) ^ 481075631;
                        i2 = 486763296;
                    } else {
                        iM3169 = (i61 - C0619.m2761("᩺ۗ")) * 59;
                        i = ((iM3169 ^ i60) * (-24861)) ^ 1440470703;
                        i2 = 1926282960;
                    }
                    i63 = iM3169 ^ i2;
                    i62 = i;
                    break;
                case -1285833807:
                case -185868866:
                    str29 = str29;
                    str27 = str27;
                    i65 = i65;
                    z4 = z4;
                    i68 = i68;
                    strM6152 = strM6152;
                    strM20410 = strM20410;
                    i64 = i64;
                    str26 = str26;
                    i77 = i77;
                    c15185 = (C15184) C0950.m3796(itM7968);
                    intentM36533 = c15185.m36532();
                    str21 = str28;
                    strM2762 = C0619.m2760(intentM36533, str21);
                    str25 = str25;
                    strM2761 = C0619.m2760(intentM36533, str25);
                    if (strM2762 == null) {
                        iM2762 = C0773.m3169("ۙ᩶") ^ i61;
                        i65 = i65;
                        i62 = ((iM2762 ^ i60) * (-5263)) ^ 1554651099;
                        i46 = -234729109;
                        i63 = iM2762 ^ i46;
                        str28 = str21;
                        i68 = i68;
                        i77 = i77;
                        str26 = str26;
                        strM6152 = strM6152;
                        str27 = str27;
                        i64 = i64;
                        z4 = z4;
                        strM20410 = strM20410;
                        i65 = i65;
                        str25 = str25;
                        str29 = str29;
                    } else {
                        int iM2767 = C0619.m2761("᩵֫") ^ i60;
                        i47 = ((iM2767 ^ i61) * 4875) ^ 1199095946;
                        i63 = iM2767 ^ 355381462;
                        str28 = str21;
                        str25 = str25;
                        i68 = i68;
                        i77 = i77;
                        str26 = str26;
                        str29 = str29;
                        str27 = str27;
                        i64 = i64;
                        strM20410 = strM20410;
                        i65 = i65;
                        i62 = i47;
                        strM6152 = strM6152;
                        z4 = z4;
                    }
                    break;
                case -1285134050:
                case 994568636:
                    itM7968 = C2354.m7968(C1761.m6211(abstractActivityC17204));
                    iM2761 = (C0773.m3169("᩸᩹") + i61) * (-27);
                    i62 = ((iM2761 ^ i60) * (-21629)) ^ 1299061459;
                    i43 = 2092389660;
                    i63 = iM2761 ^ i43;
                    i68 = i68;
                    arrayList6 = arrayList6;
                    strM6152 = strM6152;
                    str27 = str27;
                    str28 = str28;
                    z4 = z4;
                    i77 = i77;
                    str26 = str26;
                    i64 = i64;
                    strM20410 = strM20410;
                    i65 = i65;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -1258754228:
                case -13533564:
                    str29 = str29;
                    str27 = str27;
                    i65 = i65;
                    z4 = z4;
                    i68 = i68;
                    strM6152 = strM6152;
                    strM20410 = strM20410;
                    i64 = i64;
                    str26 = str26;
                    i77 = i77;
                    int iM47191 = C20613.m47190(strM2762);
                    if (iM47191 == i65) {
                        i66 = iM47191;
                        iM31617 = (C0619.m2761("᩶۟") ^ i60) * (-15);
                        i50 = ((iM31617 ^ i61) * (-32529)) ^ (-759650688);
                        i51 = -524105768;
                        i63 = iM31617 ^ i51;
                        i68 = i68;
                        strM6152 = strM6152;
                        str29 = str29;
                        str27 = str27;
                        z4 = z4;
                        str24 = strM20410;
                        i65 = i65;
                        i62 = i50;
                        i77 = i77;
                        str26 = str26;
                        i64 = i64;
                        strM20410 = str24;
                    } else {
                        int iM2768 = C0619.m2761("֫ۧ") ^ i61;
                        i48 = ((iM2768 ^ i60) * 13031) ^ 1382437564;
                        i63 = iM2768 ^ 595476034;
                        i66 = iM47191;
                        i68 = i68;
                        i77 = i77;
                        str26 = str26;
                        strM6152 = strM6152;
                        str27 = str27;
                        i64 = i64;
                        z4 = z4;
                        strM20410 = strM20410;
                        i65 = i65;
                        i62 = i48;
                        str29 = str29;
                    }
                    break;
                case -1215068264:
                case 1243662007:
                    str29 = str29;
                    str27 = str27;
                    str25 = str25;
                    i65 = i65;
                    z4 = z4;
                    i4 = i68;
                    sArr17 = sArr17;
                    sArr19 = sArr19;
                    i73 = i73;
                    i74 = i74;
                    sArr21 = sArr21;
                    i76 = i76;
                    strM6152 = strM6152;
                    strM20410 = strM20410;
                    i64 = i64;
                    str26 = str26;
                    i77 = i77;
                    str28 = str28;
                    arrayList6 = arrayList6;
                    sArr18 = sArr18;
                    i71 = i71;
                    sArr5 = sArr16;
                    i5 = i69;
                    iM31619 = C0773.m3169(C2878.m9486(sArr5, i5, 3, i4));
                    i58 = 2097868176;
                    if (C2354.f7599 >= 0) {
                        iM31611 = C0619.m2761("᩹ۛ") ^ i61;
                        sArr16 = sArr5;
                        i62 = ((iM31611 ^ i60) * 3663) ^ (-431107460);
                        i6 = -895480153;
                    } else {
                        sArr16 = sArr5;
                        iM31611 = C0619.m2761("᩷ܶ") ^ i61;
                        i62 = ((iM31611 ^ i60) * (-22477)) ^ (-1715907931);
                        i6 = 1589851147;
                    }
                    i63 = iM31611 ^ i6;
                    i69 = i5;
                    i68 = i4;
                    arrayList6 = arrayList6;
                    strM6152 = strM6152;
                    str27 = str27;
                    sArr21 = sArr21;
                    i76 = i76;
                    i73 = i73;
                    sArr19 = sArr19;
                    i74 = i74;
                    sArr18 = sArr18;
                    sArr17 = sArr17;
                    i71 = i71;
                    sArr16 = sArr16;
                    str28 = str28;
                    z4 = z4;
                    i77 = i77;
                    str26 = str26;
                    i64 = i64;
                    strM20410 = strM20410;
                    i65 = i65;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -1202212194:
                case 51665381:
                    strM6152 = null;
                    iM3169 = C0773.m3169("֫ܳ") ^ i61;
                    i = ((iM3169 ^ i60) * (-20365)) ^ 90439636;
                    i2 = 1586455268;
                    i63 = iM3169 ^ i2;
                    i62 = i;
                    break;
                case -1144783323:
                case 1190682060:
                    str29 = str29;
                    str27 = str27;
                    str26 = str26;
                    i65 = i65;
                    z4 = z4;
                    i68 = i68;
                    strM6152 = strM6152;
                    i77 = i77;
                    strM20410 = strM20410;
                    int iM47192 = C20613.m47190(strM31610);
                    if (iM47192 == i65) {
                        i64 = iM47192;
                        iM31616 = C0773.m3169("᩸۬") ^ i61;
                        i48 = ((iM31616 ^ i60) * 17357) ^ 1254153023;
                        i49 = 157668220;
                        i63 = iM31616 ^ i49;
                        i68 = i68;
                        i77 = i77;
                        str26 = str26;
                        strM6152 = strM6152;
                        str27 = str27;
                        i64 = i64;
                        z4 = z4;
                        strM20410 = strM20410;
                        i65 = i65;
                        i62 = i48;
                        str29 = str29;
                    } else {
                        int iM31623 = C0773.m3169("۫ۤ") ^ i61;
                        int i79 = ((iM31623 ^ i60) * 1193) ^ (-540049300);
                        i63 = iM31623 ^ (-585020078);
                        i68 = i68;
                        strM20410 = strM20410;
                        strM6152 = strM6152;
                        str27 = str27;
                        i65 = i65;
                        i62 = i79;
                        z4 = z4;
                        str29 = str29;
                        str20 = str26;
                        i64 = iM47192;
                        i77 = i77;
                        str26 = str20;
                    }
                    break;
                case -1118762533:
                case 785111646:
                    z4 = z4;
                    strM6152 = strM6152;
                    str26 = str26;
                    if (bitmap == null) {
                        iM2763 = C0619.m2761("ۛ᩻") ^ i61;
                        i77 = i77;
                        i56 = ((iM2763 ^ i60) * (-1657)) ^ (-123658057);
                        i57 = 715075589;
                    } else {
                        bitmapM135 = bitmap;
                        iM2763 = C0773.m3169("۫᩸") ^ i60;
                        i56 = ((iM2763 ^ i61) * (-15611)) ^ 1864630391;
                        i57 = -51355067;
                    }
                    i63 = iM2763 ^ i57;
                    i62 = i56;
                    i77 = i77;
                    str26 = str26;
                    strM6152 = strM6152;
                    z4 = z4;
                    break;
                case -1071984203:
                case 1376820447:
                    C17202.m40371(i77);
                    break;
                case -1066102631:
                case 1618692260:
                    i68 = 14593;
                    int iM2769 = C0619.m2761("ۨܽ") ^ i60;
                    i62 = ((iM2769 ^ i61) * (-31551)) ^ (-613972591);
                    i63 = iM2769 ^ 1908763287;
                    i69 = i69;
                    arrayList6 = arrayList6;
                    strM6152 = strM6152;
                    str27 = str27;
                    sArr21 = sArr21;
                    i76 = i76;
                    i73 = i73;
                    sArr19 = sArr19;
                    i74 = i74;
                    sArr18 = sArr18;
                    sArr17 = sArr17;
                    i71 = i71;
                    sArr16 = sArr16;
                    str28 = str28;
                    z4 = z4;
                    i77 = i77;
                    str26 = str26;
                    i64 = i64;
                    strM20410 = strM20410;
                    i65 = i65;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -1043181836:
                case 497542969:
                    C2023.m6964();
                    break;
                case -1033609759:
                case 1579367355:
                    i77 = i77;
                    str29 = str29;
                    str7 = str27;
                    str25 = str25;
                    str28 = str28;
                    i65 = i65;
                    z4 = z4;
                    i21 = i68;
                    str6 = strM6152;
                    strM20410 = strM20410;
                    i64 = i64;
                    c15184 = (C15184) C0950.m3796(itM13647);
                    String strM36530 = c15184.m36530();
                    intentM36532 = c15184.m36532();
                    if (C23916.f77426 > 0) {
                        int iM27610 = C0619.m2761("ܳۡ") ^ i61;
                        i63 = iM27610 ^ 1262266032;
                        i62 = ((iM27610 ^ i60) * 31021) ^ 1632583523;
                        i64 = i64;
                        i68 = i21;
                        strM20410 = strM20410;
                        strM6152 = str6;
                        str27 = str7;
                        z4 = z4;
                        i65 = i65;
                        str25 = str25;
                        str29 = str29;
                        str20 = strM36530;
                        str28 = str28;
                        i77 = i77;
                        str26 = str20;
                    } else {
                        str26 = strM36530;
                        arrayList2 = arrayList6;
                        sArr11 = sArr17;
                        i22 = i70;
                        i26 = i71;
                        sArr9 = sArr19;
                        i23 = i73;
                        i24 = i74;
                        sArr10 = sArr21;
                        i25 = i76;
                        int iM31624 = C0773.m3169("ۘۜ") ^ i61;
                        short[] sArr24 = sArr11;
                        i19 = ((iM31624 ^ i60) * (-1299)) ^ 1402765780;
                        i63 = iM31624 ^ (-2070449577);
                        i70 = i22;
                        i71 = i26;
                        i68 = i21;
                        arrayList6 = arrayList2;
                        str27 = str7;
                        sArr21 = sArr10;
                        i76 = i25;
                        i73 = i23;
                        sArr19 = sArr9;
                        i74 = i24;
                        sArr17 = sArr24;
                        i62 = i19;
                        str28 = str28;
                        i77 = i77;
                        str26 = str26;
                        strM6152 = str6;
                        i64 = i64;
                        z4 = z4;
                        strM20410 = strM20410;
                        i65 = i65;
                        str25 = str25;
                        str29 = str29;
                    }
                    break;
                case -879705479:
                case 1615369056:
                    str29 = str29;
                    str27 = str27;
                    i65 = i65;
                    z4 = z4;
                    i68 = i68;
                    strM6152 = strM6152;
                    strM20410 = strM20410;
                    i64 = i64;
                    str26 = str26;
                    i77 = i77;
                    if (strM3169 != null) {
                        iM31616 = (C0619.m2761("ۨۢ") ^ i60) * (-101);
                        i48 = ((iM31616 ^ i61) * (-531)) ^ 1386888032;
                        i49 = -13716626;
                    } else {
                        iM31616 = C0773.m3169("᩸۬") ^ i61;
                        i48 = ((iM31616 ^ i60) * 17357) ^ 1254153023;
                        i49 = 157668220;
                    }
                    i63 = iM31616 ^ i49;
                    i68 = i68;
                    i77 = i77;
                    str26 = str26;
                    strM6152 = strM6152;
                    str27 = str27;
                    i64 = i64;
                    z4 = z4;
                    strM20410 = strM20410;
                    i65 = i65;
                    i62 = i48;
                    str29 = str29;
                    break;
                case -865212584:
                case 529913764:
                    if (strM6152 == null) {
                        iM3169 = C0619.m2761("֨ۡ") ^ i60;
                        i = ((iM3169 ^ i61) * 22811) ^ (-376010177);
                        i2 = 1291891601;
                    } else {
                        iM3169 = C0773.m3169("ۡ֨") ^ i61;
                        i = ((iM3169 ^ i60) * 15123) ^ (-1074112018);
                        i2 = -1519780326;
                    }
                    i63 = iM3169 ^ i2;
                    i62 = i;
                    break;
                case -803563742:
                case 746976056:
                    str29 = str29;
                    str25 = str25;
                    i65 = i65;
                    z4 = z4;
                    i27 = i68;
                    i28 = i73;
                    sArr12 = sArr21;
                    i29 = i76;
                    str6 = strM6152;
                    strM20410 = strM20410;
                    i64 = i64;
                    sArr13 = sArr19;
                    str26 = str26;
                    i77 = i77;
                    str28 = str28;
                    arrayList3 = arrayList6;
                    i30 = i74;
                    strM2756 = C0619.m2756(sArr13, i28, i30, i27);
                    sArr20 = f58;
                    i75 = 39;
                    if (C3998.f13671 == 0) {
                        int iM31625 = C0773.m3169("֡ܶ") ^ i60;
                        i62 = ((iM31625 ^ i61) * (-18269)) ^ 1316988896;
                        i63 = iM31625 ^ 828945950;
                        i74 = i30;
                        i68 = i27;
                        arrayList6 = arrayList3;
                        strM6152 = str6;
                        str27 = strM2756;
                        sArr21 = sArr12;
                        i76 = i29;
                        i73 = i28;
                        sArr19 = sArr13;
                        str28 = str28;
                        z4 = z4;
                        i77 = i77;
                        str26 = str26;
                        i64 = i64;
                        strM20410 = strM20410;
                        i65 = i65;
                        str25 = str25;
                        str29 = str29;
                    }
                    int iM27611 = C0619.m2761("ۧ۬") ^ i61;
                    short[] sArr25 = sArr13;
                    i19 = ((iM27611 ^ i60) * 13905) ^ 1039499016;
                    i63 = iM27611 ^ (-1891301240);
                    i73 = i28;
                    i74 = i30;
                    i68 = i27;
                    arrayList6 = arrayList3;
                    str27 = strM2756;
                    sArr21 = sArr12;
                    i76 = i29;
                    sArr19 = sArr25;
                    i62 = i19;
                    str28 = str28;
                    i77 = i77;
                    str26 = str26;
                    strM6152 = str6;
                    i64 = i64;
                    z4 = z4;
                    strM20410 = strM20410;
                    i65 = i65;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -781355498:
                case -422172793:
                    RunnableC0334.m2054(arrayList6, c19660.m45322());
                    iM2761 = (C0773.m3169("᩸᩹") + i61) * (-27);
                    i62 = ((iM2761 ^ i60) * (-21629)) ^ 1299061459;
                    i43 = 2092389660;
                    i63 = iM2761 ^ i43;
                    i68 = i68;
                    arrayList6 = arrayList6;
                    strM6152 = strM6152;
                    str27 = str27;
                    str28 = str28;
                    z4 = z4;
                    i77 = i77;
                    str26 = str26;
                    i64 = i64;
                    strM20410 = strM20410;
                    i65 = i65;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -779331938:
                case -632580908:
                    i68 = 28273;
                    int iM27612 = C0619.m2761("ۨܽ") ^ i60;
                    i62 = ((iM27612 ^ i61) * (-31551)) ^ (-613972591);
                    i63 = iM27612 ^ 1908763287;
                    i69 = i69;
                    arrayList6 = arrayList6;
                    strM6152 = strM6152;
                    str27 = str27;
                    sArr21 = sArr21;
                    i76 = i76;
                    i73 = i73;
                    sArr19 = sArr19;
                    i74 = i74;
                    sArr18 = sArr18;
                    sArr17 = sArr17;
                    i71 = i71;
                    sArr16 = sArr16;
                    str28 = str28;
                    z4 = z4;
                    i77 = i77;
                    str26 = str26;
                    i64 = i64;
                    strM20410 = strM20410;
                    i65 = i65;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -639732758:
                case -608812145:
                    String str32 = strM6152;
                    str29 = str29;
                    String str33 = str27;
                    str25 = str25;
                    i65 = i65;
                    int i80 = i68;
                    strM20410 = strM20410;
                    i64 = i64;
                    String str34 = str26;
                    int i81 = i77;
                    String str35 = str28;
                    charSequenceM36531 = c15184.m36531();
                    strM31610 = C0773.m3168(intentM36532, str35);
                    strM3169 = C0773.m3168(intentM36532, str25);
                    if (strM31610 != null) {
                        iM31615 = (C0619.m2761("۬ۢ") ^ i61) * 53;
                        i44 = ((iM31615 ^ i60) * (-14473)) ^ (-1139426837);
                        i45 = 771952838;
                    } else {
                        iM31615 = C0773.m3169("᩶֡") ^ i60;
                        i44 = ((iM31615 ^ i61) * (-4139)) ^ 1717212686;
                        i45 = 563022870;
                    }
                    i63 = iM31615 ^ i45;
                    str28 = str35;
                    i68 = i80;
                    i62 = i44;
                    i77 = i81;
                    str26 = str34;
                    strM6152 = str32;
                    str27 = str33;
                    z4 = true;
                    i64 = i64;
                    strM20410 = strM20410;
                    i65 = i65;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -613092305:
                case -283731840:
                    str8 = str29;
                    str9 = str27;
                    i31 = i65;
                    z2 = z4;
                    i32 = i68;
                    str10 = strM6152;
                    str11 = strM20410;
                    i33 = i64;
                    str12 = str26;
                    i34 = i77;
                    str13 = str28;
                    arrayList4 = arrayList6;
                    sArr14 = sArr20;
                    i35 = i75;
                    strM8350 = C2485.m8350(sArr14, i35, 15, i32);
                    sArr21 = f58;
                    i76 = 54;
                    if (C2375.m8065() <= 0) {
                        iM31614 = (C0619.m2761("ۨ֡") + i61) * (-69);
                        str14 = strM8350;
                        i36 = ((iM31614 ^ i60) * (-31703)) ^ 1809044784;
                        i37 = -454051790;
                    } else {
                        iM31614 = C0773.m3169("ۤۖ") ^ i60;
                        str14 = strM8350;
                        i36 = ((iM31614 ^ i61) * (-257)) ^ 425055018;
                        i37 = 1130731401;
                    }
                    i63 = iM31614 ^ i37;
                    sArr20 = sArr14;
                    i75 = i35;
                    i68 = i32;
                    arrayList6 = arrayList4;
                    str29 = str8;
                    str27 = str9;
                    i62 = i36;
                    str28 = str13;
                    i77 = i34;
                    str26 = str12;
                    strM6152 = str10;
                    i64 = i33;
                    z4 = z2;
                    strM20410 = str11;
                    i65 = i31;
                    str25 = str14;
                    break;
                case -610847409:
                case 452776055:
                    str29 = str29;
                    str27 = str27;
                    str25 = str25;
                    i65 = i65;
                    z4 = z4;
                    i68 = i68;
                    strM6152 = strM6152;
                    strM20410 = strM20410;
                    i64 = i64;
                    str26 = str26;
                    i77 = i77;
                    str28 = str28;
                    arrayList6 = arrayList6;
                    iM31621 = C0773.m3169(C0773.m3166(f58, 69, 3, i68)) ^ 2125068864;
                    if (z5) {
                        iM2761 = C0619.m2761("᩵᩻") ^ i61;
                        i62 = ((iM2761 ^ i60) * (-23957)) ^ 2100682759;
                        i43 = -1686656916;
                    } else {
                        iM2761 = C0773.m3169("֨֡") ^ i60;
                        i62 = ((iM2761 ^ i61) * (-6545)) ^ 2082850349;
                        i43 = 412694899;
                    }
                    i63 = iM2761 ^ i43;
                    i68 = i68;
                    arrayList6 = arrayList6;
                    strM6152 = strM6152;
                    str27 = str27;
                    str28 = str28;
                    z4 = z4;
                    i77 = i77;
                    str26 = str26;
                    i64 = i64;
                    strM20410 = strM20410;
                    i65 = i65;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -501173546:
                case 1210729570:
                    if (C2288.f7433 <= 0) {
                        str29 = str29;
                        str = str27;
                        str25 = str25;
                        i65 = i65;
                        z4 = z4;
                        i7 = i68;
                        sArr = sArr17;
                        i8 = i71;
                        sArr2 = sArr18;
                        sArr3 = sArr19;
                        i9 = i73;
                        i10 = i74;
                        sArr4 = sArr21;
                        i11 = i76;
                        str2 = strM6152;
                        strM20410 = strM20410;
                        i64 = i64;
                        str3 = str26;
                        i12 = i77;
                        str4 = str28;
                        iM31612 = C0619.m2761("ۛۛ") ^ i61;
                        i62 = ((iM31612 ^ i60) * 31031) ^ 319635452;
                        i13 = -866681049;
                        i63 = iM31612 ^ i13;
                        str28 = str4;
                        i68 = i7;
                        i77 = i12;
                        str26 = str3;
                        strM6152 = str2;
                        str27 = str;
                        sArr21 = sArr4;
                        i76 = i11;
                        i73 = i9;
                        sArr19 = sArr3;
                        i74 = i10;
                        sArr18 = sArr2;
                        sArr17 = sArr;
                        i71 = i8;
                        i64 = i64;
                        z4 = z4;
                        strM20410 = strM20410;
                        i65 = i65;
                        str25 = str25;
                        str29 = str29;
                    } else {
                        str8 = str29;
                        str9 = str27;
                        z2 = z4;
                        i32 = i68;
                        sArr14 = sArr20;
                        str10 = strM6152;
                        strM8350 = str25;
                        i31 = i65;
                        str11 = strM20410;
                        i33 = i64;
                        str12 = str26;
                        i34 = i77;
                        str13 = str28;
                        arrayList4 = arrayList6;
                        i35 = i75;
                        iM31614 = (C0619.m2761("ۨ֡") + i61) * (-69);
                        str14 = strM8350;
                        i36 = ((iM31614 ^ i60) * (-31703)) ^ 1809044784;
                        i37 = -454051790;
                        i63 = iM31614 ^ i37;
                        sArr20 = sArr14;
                        i75 = i35;
                        i68 = i32;
                        arrayList6 = arrayList4;
                        str29 = str8;
                        str27 = str9;
                        i62 = i36;
                        str28 = str13;
                        i77 = i34;
                        str26 = str12;
                        strM6152 = str10;
                        i64 = i33;
                        z4 = z2;
                        strM20410 = str11;
                        i65 = i31;
                        str25 = str14;
                    }
                    break;
                case -483623092:
                case -33959287:
                    z4 = z4;
                    strM6152 = strM6152;
                    str23 = str26;
                    i77 = i77;
                    iM47190 = C20613.m47190(strM2761);
                    i65 = i65;
                    if (iM47190 == i65) {
                        strM20410 = strM20410;
                        str29 = str29;
                        str27 = str27;
                        i68 = i68;
                        str26 = str23;
                        iM31617 = (C0619.m2761("᩶۟") ^ i60) * (-15);
                        i50 = ((iM31617 ^ i61) * (-32529)) ^ (-759650688);
                        i51 = -524105768;
                        i63 = iM31617 ^ i51;
                        i68 = i68;
                        strM6152 = strM6152;
                        str29 = str29;
                        str27 = str27;
                        z4 = z4;
                        str24 = strM20410;
                        i65 = i65;
                        i62 = i50;
                        i77 = i77;
                        str26 = str26;
                        i64 = i64;
                        strM20410 = str24;
                    } else {
                        int iM31626 = C0773.m3169("֨᩵") ^ i60;
                        strM20410 = strM20410;
                        i53 = ((iM31626 ^ i61) * 23355) ^ 278868431;
                        i63 = iM31626 ^ (-503042999);
                        i77 = i77;
                        str26 = str23;
                        strM6152 = strM6152;
                        z4 = z4;
                        str24 = strM20410;
                        i65 = i65;
                        i62 = i53;
                        strM20410 = str24;
                    }
                    break;
                case -290315035:
                case 1433039452:
                    bitmap = bitmap2;
                    z3 = true;
                    iM31617 = C0773.m3169("ܽۢ") ^ i60;
                    i50 = ((iM31617 ^ i61) * 21501) ^ 1797827268;
                    i51 = 1464670490;
                    i63 = iM31617 ^ i51;
                    i68 = i68;
                    strM6152 = strM6152;
                    str29 = str29;
                    str27 = str27;
                    z4 = z4;
                    str24 = strM20410;
                    i65 = i65;
                    i62 = i50;
                    i77 = i77;
                    str26 = str26;
                    i64 = i64;
                    strM20410 = str24;
                    break;
                case -281701064:
                case 11351013:
                    str29 = str29;
                    str27 = str27;
                    str25 = str25;
                    i65 = i65;
                    z4 = z4;
                    i4 = i68;
                    sArr16 = sArr16;
                    sArr17 = sArr17;
                    i71 = i71;
                    sArr18 = sArr18;
                    sArr19 = sArr19;
                    i73 = i73;
                    i74 = i74;
                    sArr21 = sArr21;
                    i76 = i76;
                    strM6152 = strM6152;
                    strM20410 = strM20410;
                    i64 = i64;
                    str26 = str26;
                    i77 = i77;
                    str28 = str28;
                    arrayList6 = arrayList6;
                    i5 = i69;
                    s = f58[10];
                    s2 = 28564;
                    if (C1343.f4799 == 0) {
                        iM31611 = (C0773.m3169("ۖܳ") + i60) * (-41);
                        i62 = ((iM31611 ^ i61) * 7733) ^ (-1255261299);
                        i6 = 2137697003;
                        i63 = iM31611 ^ i6;
                        i69 = i5;
                        i68 = i4;
                        arrayList6 = arrayList6;
                        strM6152 = strM6152;
                        str27 = str27;
                        sArr21 = sArr21;
                        i76 = i76;
                        i73 = i73;
                        sArr19 = sArr19;
                        i74 = i74;
                        sArr18 = sArr18;
                        sArr17 = sArr17;
                        i71 = i71;
                        sArr16 = sArr16;
                        str28 = str28;
                        z4 = z4;
                        i77 = i77;
                        str26 = str26;
                        i64 = i64;
                        strM20410 = strM20410;
                        i65 = i65;
                        str25 = str25;
                        str29 = str29;
                    } else {
                        i73 = i73;
                        sArr19 = sArr19;
                        i74 = i74;
                        int iM27613 = (i60 - C0619.m2761("ۜۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i62 = ((iM27613 ^ i61) * 13853) ^ (-669234999);
                        i63 = iM27613 ^ (-1647649763);
                        i69 = i5;
                        i68 = i4;
                        arrayList6 = arrayList6;
                        strM6152 = strM6152;
                        str27 = str27;
                        sArr21 = sArr21;
                        i76 = i76;
                        sArr18 = sArr18;
                        sArr17 = sArr17;
                        i71 = i71;
                        sArr16 = sArr16;
                        str28 = str28;
                        z4 = z4;
                        i77 = i77;
                        str26 = str26;
                        i64 = i64;
                        strM20410 = strM20410;
                        i65 = i65;
                        str25 = str25;
                        str29 = str29;
                    }
                    break;
                case -256747296:
                case 1241008338:
                    String str36 = strM3168;
                    if (!C0487.m2359(str36, strM20410)) {
                        strM3168 = str36;
                        charSequence = charSequenceM36531;
                        iM3169 = C0619.m2761("֫᩵") ^ i60;
                        i = ((iM3169 ^ i61) * (-6615)) ^ 140809310;
                        i2 = -537004704;
                        i63 = iM3169 ^ i2;
                        i62 = i;
                    } else {
                        iM31610 = C0773.m3169("ۢ᩹") ^ i60;
                        strM3168 = str36;
                        i62 = ((iM31610 ^ i61) * 8399) ^ (-1513444484);
                        i3 = 1182014896;
                        i63 = iM31610 ^ i3;
                    }
                    break;
                case -226133490:
                case 273599460:
                    str29 = str29;
                    str27 = str27;
                    i65 = i65;
                    z4 = z4;
                    i68 = i68;
                    strM6152 = strM6152;
                    strM20410 = strM20410;
                    i64 = i64;
                    str26 = str26;
                    i77 = i77;
                    if (z) {
                        iM31616 = C0773.m3169("ܶ᩷") ^ i60;
                        i48 = ((iM31616 ^ i61) * 32765) ^ (-227735367);
                        i49 = -785485180;
                    } else {
                        iM31616 = C0773.m3169("ۜ֫") ^ i61;
                        i48 = ((iM31616 ^ i60) * 14741) ^ 177445730;
                        i49 = -732249637;
                    }
                    i63 = iM31616 ^ i49;
                    i68 = i68;
                    i77 = i77;
                    str26 = str26;
                    strM6152 = strM6152;
                    str27 = str27;
                    i64 = i64;
                    z4 = z4;
                    strM20410 = strM20410;
                    i65 = i65;
                    i62 = i48;
                    str29 = str29;
                    break;
                case -148932331:
                case 1276024271:
                    iM3169 = C0773.m3169("᩹ۜ") ^ i60;
                    i = ((iM3169 ^ i61) * 22795) ^ (-262614764);
                    i2 = 1617387236;
                    i63 = iM3169 ^ i2;
                    i62 = i;
                    break;
                case -76113653:
                case 157348640:
                    str29 = str29;
                    str16 = str27;
                    int i82 = i65;
                    z4 = z4;
                    i39 = i68;
                    str18 = strM6152;
                    str15 = strM20410;
                    i38 = i64;
                    str19 = str26;
                    i40 = i77;
                    C2834.m9332(arrayList6);
                    i42 = i82;
                    str17 = str25;
                    strM2049 = str28;
                    sArr15 = sArr21;
                    arrayList5 = arrayList6;
                    i41 = i76;
                    int iM27614 = (C0619.m2761("ۜۨ") ^ i61) * (-117);
                    String str37 = strM2049;
                    int i710 = ((iM27614 ^ i60) * (-4903)) ^ (-17894020);
                    i63 = iM27614 ^ (-1979341165);
                    sArr21 = sArr15;
                    i76 = i41;
                    i68 = i39;
                    i77 = i40;
                    arrayList6 = arrayList5;
                    str26 = str19;
                    str27 = str16;
                    i62 = i710;
                    i64 = i38;
                    str28 = str37;
                    strM20410 = str15;
                    strM6152 = str18;
                    i65 = i42;
                    str25 = str17;
                    z4 = z4;
                    str29 = str29;
                    break;
                case -62433715:
                case 1078727994:
                    str27 = str27;
                    str25 = str25;
                    i65 = i65;
                    z4 = z4;
                    i4 = i68;
                    sArr21 = sArr21;
                    i76 = i76;
                    strM6152 = strM6152;
                    strM20410 = strM20410;
                    i64 = i64;
                    str26 = str26;
                    i77 = i77;
                    str28 = str28;
                    arrayList6 = arrayList6;
                    short[] sArr26 = sArr18;
                    int i83 = i72;
                    String strM6366 = RunnableC1848.m6366(sArr26, i83, 9, i4);
                    sArr19 = f58;
                    i73 = 28;
                    i74 = 11;
                    if (C1542.f5343 <= 0) {
                        str29 = strM6366;
                        sArr18 = sArr26;
                        i72 = i83;
                        sArr16 = sArr16;
                        i5 = i69;
                        sArr17 = sArr17;
                        i71 = i71;
                        int iM27615 = (i60 - C0619.m2761("ۜۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i62 = ((iM27615 ^ i61) * 13853) ^ (-669234999);
                        i63 = iM27615 ^ (-1647649763);
                        i69 = i5;
                        i68 = i4;
                        arrayList6 = arrayList6;
                        strM6152 = strM6152;
                        str27 = str27;
                        sArr21 = sArr21;
                        i76 = i76;
                        sArr18 = sArr18;
                        sArr17 = sArr17;
                        i71 = i71;
                        sArr16 = sArr16;
                        str28 = str28;
                        z4 = z4;
                        i77 = i77;
                        str26 = str26;
                        i64 = i64;
                        strM20410 = strM20410;
                        i65 = i65;
                        str25 = str25;
                        str29 = str29;
                    } else {
                        int iM31627 = (C0773.m3169("ᩴᩴ") ^ i61) * 101;
                        i63 = iM31627 ^ (-562866276);
                        sArr18 = sArr26;
                        i72 = i83;
                        i68 = i4;
                        arrayList6 = arrayList6;
                        str27 = str27;
                        sArr21 = sArr21;
                        i76 = i76;
                        i62 = ((iM31627 ^ i60) * (-17633)) ^ 661067002;
                        str28 = str28;
                        i77 = i77;
                        str26 = str26;
                        strM6152 = strM6152;
                        i64 = i64;
                        z4 = z4;
                        strM20410 = strM20410;
                        i65 = i65;
                        str25 = str25;
                        str29 = strM6366;
                    }
                    break;
                case -42687098:
                case 1827679183:
                    C20613 c20613 = C20613.f66109;
                    bitmapM48867 = RunnableC21479.m48866(c20613.f66113.mo32682(), c20613.f66115.f11950, z6);
                    bitmap3 = bitmapM48867;
                    z4 = z4;
                    strM6152 = strM6152;
                    str26 = str26;
                    i77 = i77;
                    i55 = i66;
                    iM2763 = (i61 - C0619.m2761("ۗۧ")) * (-19);
                    i66 = i55;
                    i56 = ((iM2763 ^ i60) * (-6653)) ^ (-976304860);
                    i57 = 323045559;
                    i63 = iM2763 ^ i57;
                    i62 = i56;
                    i77 = i77;
                    str26 = str26;
                    strM6152 = strM6152;
                    z4 = z4;
                    break;
                case -42200043:
                case 1071093729:
                    str29 = str29;
                    str27 = str27;
                    str25 = str25;
                    i65 = i65;
                    z4 = z4;
                    i68 = i68;
                    strM6152 = strM6152;
                    strM20410 = strM20410;
                    i64 = i64;
                    str26 = str26;
                    i77 = i77;
                    str28 = str28;
                    arrayList6 = arrayList6;
                    if (C3998.m12923(itM7968)) {
                        iM2761 = (i60 - C0619.m2761("ۡۨ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i62 = ((iM2761 ^ i61) * (-6353)) ^ 1829343616;
                        i43 = 1403204427;
                    } else {
                        iM2761 = (i61 - C0619.m2761("᩻ۚ")) * (-91);
                        i62 = ((iM2761 ^ i60) * 863) ^ 1131576796;
                        i43 = 1102588241;
                    }
                    i63 = iM2761 ^ i43;
                    i68 = i68;
                    arrayList6 = arrayList6;
                    strM6152 = strM6152;
                    str27 = str27;
                    str28 = str28;
                    z4 = z4;
                    i77 = i77;
                    str26 = str26;
                    i64 = i64;
                    strM20410 = strM20410;
                    i65 = i65;
                    str25 = str25;
                    str29 = str29;
                    break;
                case -37604201:
                case 1960394377:
                    c19660.m45324(strM6152);
                    iM3169 = C0773.m3169("᩻ۧ") ^ i61;
                    i = ((iM3169 ^ i60) * (-6259)) ^ (-1671161335);
                    i2 = 299237141;
                    i63 = iM3169 ^ i2;
                    i62 = i;
                    break;
                case 61056338:
                case 931862441:
                    c19660 = new C19660(c15185);
                    if (strM6152 != null) {
                        iM3169 = (C0619.m2761("᩹ܳ") ^ i61) * (-23);
                        i = ((iM3169 ^ i60) * 11991) ^ 966415912;
                        i2 = 805965737;
                    } else {
                        iM3169 = C0773.m3169("᩻ۧ") ^ i61;
                        i = ((iM3169 ^ i60) * (-6259)) ^ (-1671161335);
                        i2 = 299237141;
                    }
                    i63 = iM3169 ^ i2;
                    i62 = i;
                    break;
                case 135795200:
                case 699496288:
                    bitmapM48867 = RunnableC21479.m48866(C20613.f66067.mo32682(), iM47190, z6);
                    bitmap3 = bitmapM48867;
                    z4 = z4;
                    strM6152 = strM6152;
                    str26 = str26;
                    i77 = i77;
                    i55 = i66;
                    iM2763 = (i61 - C0619.m2761("ۗۧ")) * (-19);
                    i66 = i55;
                    i56 = ((iM2763 ^ i60) * (-6653)) ^ (-976304860);
                    i57 = 323045559;
                    i63 = iM2763 ^ i57;
                    i62 = i56;
                    i77 = i77;
                    str26 = str26;
                    strM6152 = strM6152;
                    z4 = z4;
                    break;
                case 160880030:
                case 226672331:
                    str29 = str29;
                    str27 = str27;
                    i65 = i65;
                    z4 = z4;
                    i68 = i68;
                    strM6152 = strM6152;
                    strM20410 = strM20410;
                    i64 = i64;
                    str26 = str26;
                    i77 = i77;
                    if (!C1761.m6207(abstractActivityC17204, arrayList6)) {
                        iM31616 = (C0619.m2761("ܿۙ") ^ i61) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i48 = ((iM31616 ^ i60) * (-15131)) ^ (-2109201570);
                        i49 = 38364397;
                        i63 = iM31616 ^ i49;
                        i68 = i68;
                        i77 = i77;
                        str26 = str26;
                        strM6152 = strM6152;
                        str27 = str27;
                        i64 = i64;
                        z4 = z4;
                        strM20410 = strM20410;
                        i65 = i65;
                        i62 = i48;
                        str29 = str29;
                    } else {
                        str25 = str25;
                        str28 = str28;
                        i65 = i65;
                        arrayList6 = arrayList6;
                        iM2761 = C0773.m3169("֨֡") ^ i60;
                        i62 = ((iM2761 ^ i61) * (-6545)) ^ 2082850349;
                        i43 = 412694899;
                        i63 = iM2761 ^ i43;
                        i68 = i68;
                        arrayList6 = arrayList6;
                        strM6152 = strM6152;
                        str27 = str27;
                        str28 = str28;
                        z4 = z4;
                        i77 = i77;
                        str26 = str26;
                        i64 = i64;
                        strM20410 = strM20410;
                        i65 = i65;
                        str25 = str25;
                        str29 = str29;
                    }
                    break;
                case 168245283:
                case 1738410039:
                    if (intentM36533.getBooleanExtra(str27, z6)) {
                        iM3169 = C0773.m3169("᩺֫") ^ i61;
                        i = ((iM3169 ^ i60) * (-14679)) ^ 544104973;
                        i2 = 361444694;
                    } else {
                        iM3169 = C0619.m2761("᩵ۙ") ^ i60;
                        i = ((iM3169 ^ i61) * (-25367)) ^ 1551690895;
                        i2 = -385116827;
                    }
                    i63 = iM3169 ^ i2;
                    i62 = i;
                    break;
                case 376805895:
                case 1265460375:
                    if (C2834.m9344() < 0) {
                        str29 = str29;
                        str27 = str27;
                        i65 = i65;
                        z4 = z4;
                        i68 = i68;
                        strM6152 = strM6152;
                        strM20410 = strM20410;
                        i64 = i64;
                        str26 = str26;
                        i77 = i77;
                        iM31617 = C0619.m2761("ۡۗ") ^ i60;
                        i50 = ((iM31617 ^ i61) * 4293) ^ (-1313465383);
                        i51 = -1176274659;
                        i63 = iM31617 ^ i51;
                        i68 = i68;
                        strM6152 = strM6152;
                        str29 = str29;
                        str27 = str27;
                        z4 = z4;
                        str24 = strM20410;
                        i65 = i65;
                        i62 = i50;
                        i77 = i77;
                        str26 = str26;
                        i64 = i64;
                        strM20410 = str24;
                    } else {
                        iM3169 = (i60 - C0773.m3169("ᩳ᩻")) * (-71);
                        i = ((iM3169 ^ i61) * (-31081)) ^ (-1041660436);
                        i2 = -255677462;
                        i63 = iM3169 ^ i2;
                        i62 = i;
                    }
                    break;
                case 517776503:
                case 2077726379:
                    C1542.m5459();
                    if (C0619.f2439) {
                        str29 = str29;
                        str27 = str27;
                        str25 = str25;
                        i65 = i65;
                        z4 = z4;
                        i4 = i68;
                        sArr5 = sArr16;
                        sArr17 = sArr17;
                        i71 = i71;
                        sArr18 = sArr18;
                        sArr19 = sArr19;
                        i73 = i73;
                        i74 = i74;
                        sArr21 = sArr21;
                        i76 = i76;
                        strM6152 = strM6152;
                        strM20410 = strM20410;
                        i64 = i64;
                        str26 = str26;
                        i77 = i77;
                        str28 = str28;
                        arrayList6 = arrayList6;
                        i5 = i69;
                        iM31611 = C0619.m2761("᩹ۛ") ^ i61;
                        sArr16 = sArr5;
                        i62 = ((iM31611 ^ i60) * 3663) ^ (-431107460);
                        i6 = -895480153;
                        i63 = iM31611 ^ i6;
                        i69 = i5;
                        i68 = i4;
                        arrayList6 = arrayList6;
                        strM6152 = strM6152;
                        str27 = str27;
                        sArr21 = sArr21;
                        i76 = i76;
                        i73 = i73;
                        sArr19 = sArr19;
                        i74 = i74;
                        sArr18 = sArr18;
                        sArr17 = sArr17;
                        i71 = i71;
                        sArr16 = sArr16;
                        str28 = str28;
                        z4 = z4;
                        i77 = i77;
                        str26 = str26;
                        i64 = i64;
                        strM20410 = strM20410;
                        i65 = i65;
                        str25 = str25;
                        str29 = str29;
                    }
                    str29 = str29;
                    str = str27;
                    str25 = str25;
                    i65 = i65;
                    z4 = z4;
                    i7 = i68;
                    sArr = sArr17;
                    i8 = i71;
                    sArr2 = sArr18;
                    sArr3 = sArr19;
                    i9 = i73;
                    i10 = i74;
                    sArr4 = sArr21;
                    i11 = i76;
                    str2 = strM6152;
                    strM20410 = strM20410;
                    i64 = i64;
                    str3 = str26;
                    i12 = i77;
                    str4 = str28;
                    iM31612 = C0619.m2761("ۛۛ") ^ i61;
                    i62 = ((iM31612 ^ i60) * 31031) ^ 319635452;
                    i13 = -866681049;
                    i63 = iM31612 ^ i13;
                    str28 = str4;
                    i68 = i7;
                    i77 = i12;
                    str26 = str3;
                    strM6152 = str2;
                    str27 = str;
                    sArr21 = sArr4;
                    i76 = i11;
                    i73 = i9;
                    sArr19 = sArr3;
                    i74 = i10;
                    sArr18 = sArr2;
                    sArr17 = sArr;
                    i71 = i8;
                    i64 = i64;
                    z4 = z4;
                    strM20410 = strM20410;
                    i65 = i65;
                    str25 = str25;
                    str29 = str29;
                    break;
                case 526137608:
                case 1409241743:
                    C1321.m4852();
                    if (!C3690.m11987()) {
                        str29 = str29;
                        str5 = str27;
                        str25 = str25;
                        i65 = i65;
                        z4 = z4;
                        i14 = i68;
                        sArr6 = sArr18;
                        sArr7 = sArr19;
                        i15 = i73;
                        i16 = i74;
                        sArr8 = sArr21;
                        i17 = i76;
                        str6 = strM6152;
                        i18 = i77;
                        strM20410 = strM20410;
                        str28 = str28;
                        i64 = i64;
                        arrayList = arrayList6;
                        str26 = str26;
                        iM31613 = C0773.m3169("᩷ۘ") ^ i60;
                        i77 = i18;
                        i19 = ((iM31613 ^ i61) * (-9365)) ^ (-1187844537);
                        i20 = -1849140626;
                        i63 = iM31613 ^ i20;
                        sArr18 = sArr6;
                        i68 = i14;
                        arrayList6 = arrayList;
                        str27 = str5;
                        sArr21 = sArr8;
                        i76 = i17;
                        i73 = i15;
                        sArr19 = sArr7;
                        i74 = i16;
                        i62 = i19;
                        str28 = str28;
                        i77 = i77;
                        str26 = str26;
                        strM6152 = str6;
                        i64 = i64;
                        z4 = z4;
                        strM20410 = strM20410;
                        i65 = i65;
                        str25 = str25;
                        str29 = str29;
                    }
                    str29 = str29;
                    str27 = str27;
                    str25 = str25;
                    i65 = i65;
                    z4 = z4;
                    i4 = i68;
                    sArr16 = sArr16;
                    sArr17 = sArr17;
                    i71 = i71;
                    sArr18 = sArr18;
                    sArr21 = sArr21;
                    i76 = i76;
                    strM6152 = strM6152;
                    strM20410 = strM20410;
                    i64 = i64;
                    str26 = str26;
                    i77 = i77;
                    str28 = str28;
                    arrayList6 = arrayList6;
                    i5 = i69;
                    int iM27616 = (i60 - C0619.m2761("ۜۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i62 = ((iM27616 ^ i61) * 13853) ^ (-669234999);
                    i63 = iM27616 ^ (-1647649763);
                    i69 = i5;
                    i68 = i4;
                    arrayList6 = arrayList6;
                    strM6152 = strM6152;
                    str27 = str27;
                    sArr21 = sArr21;
                    i76 = i76;
                    sArr18 = sArr18;
                    sArr17 = sArr17;
                    i71 = i71;
                    sArr16 = sArr16;
                    str28 = str28;
                    z4 = z4;
                    i77 = i77;
                    str26 = str26;
                    i64 = i64;
                    strM20410 = strM20410;
                    i65 = i65;
                    str25 = str25;
                    str29 = str29;
                    break;
                case 553257035:
                case 1414411227:
                    itM13647 = C4282.m13647(C1761.m6202(abstractActivityC17204));
                    z5 = false;
                    iM2761 = C0773.m3169("ᩴܳ") ^ i61;
                    i62 = ((iM2761 ^ i60) * (-17561)) ^ (-2014365137);
                    i43 = 981287143;
                    i63 = iM2761 ^ i43;
                    i68 = i68;
                    arrayList6 = arrayList6;
                    strM6152 = strM6152;
                    str27 = str27;
                    str28 = str28;
                    z4 = z4;
                    i77 = i77;
                    str26 = str26;
                    i64 = i64;
                    strM20410 = strM20410;
                    i65 = i65;
                    str25 = str25;
                    str29 = str29;
                    break;
                case 993165057:
                case 2100474933:
                    str29 = str29;
                    str27 = str27;
                    i65 = i65;
                    z4 = z4;
                    i68 = i68;
                    strM6152 = strM6152;
                    strM20410 = strM20410;
                    i64 = i64;
                    str26 = str26;
                    i77 = i77;
                    strM9847 = C3033.m9847(f58, 72, 3, i68);
                    if (RunnableC3055.f9898 >= 0) {
                        iM31617 = C0619.m2761("ۡۗ") ^ i60;
                        i50 = ((iM31617 ^ i61) * 4293) ^ (-1313465383);
                        i51 = -1176274659;
                    } else {
                        iM31617 = C0619.m2761("֫ܶ") ^ i60;
                        i50 = ((iM31617 ^ i61) * 6073) ^ 1538362726;
                        i51 = 1143696868;
                    }
                    i63 = iM31617 ^ i51;
                    i68 = i68;
                    strM6152 = strM6152;
                    str29 = str29;
                    str27 = str27;
                    z4 = z4;
                    str24 = strM20410;
                    i65 = i65;
                    i62 = i50;
                    i77 = i77;
                    str26 = str26;
                    i64 = i64;
                    strM20410 = str24;
                    break;
                case 1079045303:
                case 1444487560:
                    z4 = z4;
                    Bitmap bitmapM48868 = RunnableC21479.m48866(C20613.f66067.mo32682(), i67, z4);
                    str22 = str26;
                    m132(str22, bitmapM48868);
                    bitmap2 = bitmapM48868;
                    i52 = i64;
                    int iM27617 = C0619.m2761("ۘۖ") ^ i60;
                    int i84 = ((iM27617 ^ i61) * (-13609)) ^ (-1193938405);
                    i63 = iM27617 ^ 78514591;
                    i64 = i52;
                    i68 = i68;
                    i77 = i77;
                    strM20410 = strM20410;
                    str27 = str27;
                    str26 = str22;
                    i65 = i65;
                    i62 = i84;
                    strM6152 = strM6152;
                    str29 = str29;
                    z4 = z4;
                    break;
                case 1134233575:
                case 1186188643:
                    strM3168 = C0773.m3168(intentM36532, str29);
                    if (strM3168 != null) {
                        iM3169 = (i60 - C0619.m2761("֫ܽ")) * 35;
                        i = ((iM3169 ^ i61) * (-18323)) ^ (-1143864120);
                        i2 = 1210358564;
                    } else {
                        charSequence = charSequenceM36531;
                        iM3169 = C0619.m2761("֫᩵") ^ i60;
                        i = ((iM3169 ^ i61) * (-6615)) ^ 140809310;
                        i2 = -537004704;
                    }
                    i63 = iM3169 ^ i2;
                    i62 = i;
                    break;
                case 1186474176:
                case 1284672041:
                    break;
                case 1210637378:
                case 1338221407:
                    z4 = z4;
                    str22 = str26;
                    i52 = i64;
                    Bitmap bitmapM48869 = RunnableC21479.m48866(C20613.f66104.mo32682(), i52, z4);
                    m132(str22, bitmapM48869);
                    bitmap2 = bitmapM48869;
                    int iM27618 = C0619.m2761("ۘۖ") ^ i60;
                    int i85 = ((iM27618 ^ i61) * (-13609)) ^ (-1193938405);
                    i63 = iM27618 ^ 78514591;
                    i64 = i52;
                    i68 = i68;
                    i77 = i77;
                    strM20410 = strM20410;
                    str27 = str27;
                    str26 = str22;
                    i65 = i65;
                    i62 = i85;
                    strM6152 = strM6152;
                    str29 = str29;
                    z4 = z4;
                    break;
                case 1445615167:
                case 1588958995:
                    if (!C17202.m40372()) {
                        str29 = str29;
                        str27 = str27;
                        str25 = str25;
                        i65 = i65;
                        z4 = z4;
                        i4 = i68;
                        sArr16 = sArr16;
                        sArr17 = sArr17;
                        i71 = i71;
                        sArr18 = sArr18;
                        sArr21 = sArr21;
                        i76 = i76;
                        strM6152 = strM6152;
                        strM20410 = strM20410;
                        i64 = i64;
                        str26 = str26;
                        i77 = i77;
                        str28 = str28;
                        arrayList6 = arrayList6;
                        i5 = i69;
                        int iM27619 = (i60 - C0619.m2761("ۜۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i62 = ((iM27619 ^ i61) * 13853) ^ (-669234999);
                        i63 = iM27619 ^ (-1647649763);
                        i69 = i5;
                        i68 = i4;
                        arrayList6 = arrayList6;
                        strM6152 = strM6152;
                        str27 = str27;
                        sArr21 = sArr21;
                        i76 = i76;
                        sArr18 = sArr18;
                        sArr17 = sArr17;
                        i71 = i71;
                        sArr16 = sArr16;
                        str28 = str28;
                        z4 = z4;
                        i77 = i77;
                        str26 = str26;
                        i64 = i64;
                        strM20410 = strM20410;
                        i65 = i65;
                        str25 = str25;
                        str29 = str29;
                    } else {
                        iM3169 = (C0619.m2761("۟ܶ") + i60) * (-39);
                        i = ((iM3169 ^ i61) * (-311)) ^ 371948754;
                        i2 = 1245972200;
                        i63 = iM3169 ^ i2;
                        i62 = i;
                    }
                    break;
                case 1536891238:
                case 1756456825:
                    str29 = str29;
                    str7 = str27;
                    str25 = str25;
                    i64 = i64;
                    i65 = i65;
                    z4 = z4;
                    i21 = i68;
                    i22 = i70;
                    sArr9 = sArr19;
                    i23 = i73;
                    i24 = i74;
                    sArr10 = sArr21;
                    i25 = i76;
                    str6 = strM6152;
                    str26 = str26;
                    sArr11 = sArr17;
                    i77 = i77;
                    str28 = str28;
                    arrayList2 = arrayList6;
                    i26 = i71;
                    strM20410 = RunnableC0334.m2049(sArr11, i22, i26, i21);
                    sArr18 = f58;
                    i72 = 19;
                    if (C2966.f9654 < 0) {
                        int iM31628 = (C0773.m3169("֫ܿ") + i60) * (-127);
                        i62 = ((iM31628 ^ i61) * 31053) ^ 1967007051;
                        i63 = iM31628 ^ (-1693817022);
                        i71 = i26;
                        i68 = i21;
                        arrayList6 = arrayList2;
                        strM6152 = str6;
                        str27 = str7;
                        sArr21 = sArr10;
                        i76 = i25;
                        i73 = i23;
                        sArr19 = sArr9;
                        i74 = i24;
                        i70 = i22;
                        sArr17 = sArr11;
                        str28 = str28;
                        z4 = z4;
                        i77 = i77;
                        str26 = str26;
                        i64 = i64;
                        strM20410 = strM20410;
                        i65 = i65;
                        str25 = str25;
                        str29 = str29;
                    }
                    int iM31629 = C0773.m3169("ۘۜ") ^ i61;
                    short[] sArr27 = sArr11;
                    i19 = ((iM31629 ^ i60) * (-1299)) ^ 1402765780;
                    i63 = iM31629 ^ (-2070449577);
                    i70 = i22;
                    i71 = i26;
                    i68 = i21;
                    arrayList6 = arrayList2;
                    str27 = str7;
                    sArr21 = sArr10;
                    i76 = i25;
                    i73 = i23;
                    sArr19 = sArr9;
                    i74 = i24;
                    sArr17 = sArr27;
                    i62 = i19;
                    str28 = str28;
                    i77 = i77;
                    str26 = str26;
                    strM6152 = str6;
                    i64 = i64;
                    z4 = z4;
                    strM20410 = strM20410;
                    i65 = i65;
                    str25 = str25;
                    str29 = str29;
                    break;
                case 1573676068:
                case 1631619714:
                    str29 = str29;
                    str27 = str27;
                    i65 = i65;
                    z4 = z4;
                    i68 = i68;
                    strM6152 = strM6152;
                    strM20410 = strM20410;
                    String str38 = str26;
                    i64 = i64;
                    i77 = i77;
                    int iM47193 = C20613.m47190(strM3169);
                    if (iM47193 == i65) {
                        str26 = str38;
                        i67 = iM47193;
                        iM31616 = C0773.m3169("᩸۬") ^ i61;
                        i48 = ((iM31616 ^ i60) * 17357) ^ 1254153023;
                        i49 = 157668220;
                        i63 = iM31616 ^ i49;
                        i68 = i68;
                        i77 = i77;
                        str26 = str26;
                        strM6152 = strM6152;
                        str27 = str27;
                        i64 = i64;
                        z4 = z4;
                        strM20410 = strM20410;
                        i65 = i65;
                        i62 = i48;
                        str29 = str29;
                    } else {
                        int iM27620 = (C0619.m2761("ۗۜ") + i61) * (-83);
                        str26 = str38;
                        i47 = ((iM27620 ^ i60) * (-1483)) ^ (-1560980726);
                        i63 = iM27620 ^ 540184370;
                        i67 = iM47193;
                        i68 = i68;
                        i77 = i77;
                        str26 = str26;
                        str29 = str29;
                        str27 = str27;
                        i64 = i64;
                        strM20410 = strM20410;
                        i65 = i65;
                        i62 = i47;
                        strM6152 = strM6152;
                        z4 = z4;
                    }
                    break;
                case 1924043188:
                case 2115327220:
                    i65 = i65;
                    z4 = z4;
                    strM6152 = strM6152;
                    strM20410 = strM20410;
                    str23 = str26;
                    i77 = i77;
                    str29 = str29;
                    str27 = str27;
                    i68 = i68;
                    if (!intentM36533.getBooleanExtra(C11235.m28300(f58, 75, 5, i68), z6)) {
                        str26 = str23;
                        iM31617 = (C0619.m2761("᩶۟") ^ i60) * (-15);
                        i50 = ((iM31617 ^ i61) * (-32529)) ^ (-759650688);
                        i51 = -524105768;
                        i63 = iM31617 ^ i51;
                        i68 = i68;
                        strM6152 = strM6152;
                        str29 = str29;
                        str27 = str27;
                        z4 = z4;
                        str24 = strM20410;
                        i65 = i65;
                        i62 = i50;
                        i77 = i77;
                        str26 = str26;
                        i64 = i64;
                        strM20410 = str24;
                    } else {
                        iM31618 = C0773.m3169("֫֫") ^ i61;
                        i53 = ((iM31618 ^ i60) * 30409) ^ (-643109511);
                        i54 = 1872110514;
                        i63 = iM31618 ^ i54;
                        i68 = i68;
                        i77 = i77;
                        str29 = str29;
                        str27 = str27;
                        str26 = str23;
                        strM6152 = strM6152;
                        z4 = z4;
                        str24 = strM20410;
                        i65 = i65;
                        i62 = i53;
                        strM20410 = str24;
                    }
                    break;
                default:
                    c19660.m45325(C9545.m24962(bitmap3));
                    iM3169 = (C0773.m3169("᩻۫") + i61) * 73;
                    i = ((iM3169 ^ i60) * 13205) ^ (-339067823);
                    i2 = 96114371;
                    i63 = iM3169 ^ i2;
                    i62 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static boolean m131() {
        boolean zM6210 = false;
        int i = -1753397882;
        int i2 = C2310.f7472;
        int i3 = C2287.f7432;
        int iM3169 = C0773.m3169("۫۬") ^ i2;
        int i4 = ((iM3169 ^ i3) * (-23653)) ^ (-684208890);
        int i5 = 1219146968;
        while (true) {
            i = ((((i ^ i3) * 28023) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2077126290:
                case -1019841650:
                    if (C2419.m8174() >= 0) {
                        iM3169 = (C0773.m3169("ܽۨ") ^ i2) * (-81);
                        i4 = ((iM3169 ^ i3) * 5813) ^ 765198276;
                        i5 = 424110489;
                    } else {
                        iM3169 = (C0619.m2761("ܰۛ") + i2) * (-65);
                        i4 = ((iM3169 ^ i3) * 18831) ^ (-732961346);
                        i5 = 240566816;
                    }
                    break;
                case -1916634246:
                case 669244626:
                    zM6210 = C1761.m6210(C3099.m10096());
                    if (C0619.f2439) {
                        iM3169 = C0773.m3169("ܿ֫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 10233) ^ 995042925;
                        i5 = 842591996;
                    } else {
                        iM3169 = (C0619.m2761("ۙ᩵") ^ i2) * (-95);
                        i4 = ((iM3169 ^ i3) * (-22653)) ^ 1150021735;
                        i5 = 520463854;
                    }
                    break;
                case -1899854816:
                case 547629015:
                    C2702.m8876();
                    C13473.m33144();
                    iM3169 = C0773.m3169("ܿ֫") ^ i3;
                    i4 = ((iM3169 ^ i2) * 10233) ^ 995042925;
                    i5 = 842591996;
                    break;
                case -1884863340:
                case 1239366015:
                    if (C3099.f10023 <= 0) {
                        iM3169 = (C0773.m3169("ܽۨ") ^ i2) * (-81);
                        i4 = ((iM3169 ^ i3) * 5813) ^ 765198276;
                        i5 = 424110489;
                    } else {
                        iM3169 = C0773.m3169("ܿ֫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 10233) ^ 995042925;
                        i5 = 842591996;
                    }
                    break;
                case -1869873752:
                case -1455875531:
                    f57 = C1343.m4947(zM6210);
                    iM3169 = (i3 - C0619.m2761("ۨ᩶")) * (-83);
                    i4 = ((iM3169 ^ i2) * 24843) ^ 1813848342;
                    i5 = 1853155420;
                    break;
                case -1824124964:
                case 151070905:
                    if (C0950.m3785() != 0) {
                        iM3169 = C0773.m3169("֨᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-6817)) ^ 698820991;
                        i5 = -1107319465;
                    } else {
                        iM3169 = C0619.m2761("ۤܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 28737) ^ (-1226626656);
                        i5 = -424548567;
                    }
                    break;
                case -1676077589:
                case 1931772328:
                    if (C1542.m5459() >= 0) {
                        iM3169 = C0773.m3169("֨᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-6817)) ^ 698820991;
                        i5 = -1107319465;
                    } else {
                        iM3169 = C0773.m3169("ᩴ۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * 5681) ^ (-636132699);
                        i5 = -664163553;
                    }
                    break;
                case -1634180384:
                case -721991859:
                    if (f57 == null) {
                        iM3169 = C0619.m2761("᩷֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-21143)) ^ 1630237004;
                        i5 = 1542670903;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۨ᩶")) * (-83);
                        i4 = ((iM3169 ^ i2) * 24843) ^ 1813848342;
                        i5 = 1853155420;
                    }
                    break;
                case -1141877917:
                case -389973769:
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0773.m3169("ܰܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-13499)) ^ (-1320208955);
                        i5 = 1502980555;
                    } else {
                        iM3169 = (C0773.m3169("۬᩸") ^ i3) * 65;
                        i4 = ((iM3169 ^ i2) * (-15845)) ^ 1016024357;
                        i5 = -1912652811;
                    }
                    break;
                case -877819312:
                case 524731143:
                    if (C0487.m2356() >= 0) {
                        iM3169 = C0773.m3169("֨᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-6817)) ^ 698820991;
                        i5 = -1107319465;
                    } else {
                        iM3169 = (C0773.m3169("۟۬") + i2) * (-111);
                        i4 = ((iM3169 ^ i3) * (-18193)) ^ (-971373828);
                        i5 = -1227578733;
                    }
                    break;
                case -708930430:
                case 2103126835:
                    C1343.m4943();
                    if (C0950.f3488 < 0) {
                        iM3169 = C0773.m3169("ܰܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-13499)) ^ (-1320208955);
                        i5 = 1502980555;
                    } else {
                        iM3169 = C0773.m3169("ܿ֫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 10233) ^ 995042925;
                        i5 = 842591996;
                    }
                    break;
                case -1520368:
                case 1722197487:
                    if (C3779.m12264()) {
                        iM3169 = C0773.m3169("᩸ۚ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 13839) ^ 1714678650;
                        i5 = 1055934668;
                    } else {
                        iM3169 = C0773.m3169("ܰܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-13499)) ^ (-1320208955);
                        i5 = 1502980555;
                    }
                    break;
                case 9330589:
                case 572690382:
                    if (C2966.f9654 >= 0) {
                        iM3169 = C0773.m3169("ܿ֫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 10233) ^ 995042925;
                        i5 = 842591996;
                    } else {
                        iM3169 = C0773.m3169("᩻᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-283)) ^ (-2079649471);
                        i5 = 1375786346;
                    }
                    break;
                case 135007152:
                case 1033057633:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0619.m2761("᩶۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 383) ^ 1262180010;
                        i5 = -45117937;
                    } else {
                        iM3169 = C0619.m2761("ۙۜ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-26041)) ^ (-738351438);
                        i5 = -1622047187;
                    }
                    break;
                case 324474031:
                case 1038676627:
                    if (C1783.f6087 > 0) {
                        iM3169 = C0619.m2761("᩶۫") ^ i3;
                        i4 = ((iM3169 ^ i2) * 383) ^ 1262180010;
                        i5 = -45117937;
                    } else {
                        iM3169 = C0773.m3169("ܰܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-13499)) ^ (-1320208955);
                        i5 = 1502980555;
                    }
                    break;
                case 382806339:
                case 2129018711:
                    return C4282.m13658(f57);
                case 1390961251:
                case 1484591086:
                    if (C17202.m40372()) {
                        iM3169 = C0619.m2761("ܺ᩹") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-21467)) ^ 138507672;
                        i5 = -2137441301;
                    } else {
                        iM3169 = C0773.m3169("֨᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-6817)) ^ 698820991;
                        i5 = -1107319465;
                    }
                    break;
                default:
                    C3448.m11248();
                    AbstractC0641.m2813();
                    return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x014f  */
    /* JADX WARN: Code duplicated, block: B:45:0x01a5 A[PHI: r1 r6 r9
      0x01a5: PHI (r1v4 short[]) = (r1v1 short[]), (r1v1 short[]), (r1v1 short[]), (r1v2 short[]), (r1v1 short[]) binds: [B:44:0x01a3, B:31:0x012a, B:29:0x011c, B:18:0x00a1, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x01a5: PHI (r6v6 l.᩷ۨᩴ) = (r6v3 l.᩷ۨᩴ), (r6v3 l.᩷ۨᩴ), (r6v3 l.᩷ۨᩴ), (r6v4 l.᩷ۨᩴ), (r6v3 l.᩷ۨᩴ) binds: [B:44:0x01a3, B:31:0x012a, B:29:0x011c, B:18:0x00a1, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x01a5: PHI (r9v4 int) = (r9v1 int), (r9v2 int), (r9v1 int), (r9v1 int), (r9v1 int) binds: [B:44:0x01a3, B:31:0x012a, B:29:0x011c, B:18:0x00a1, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01f1 A[PHI: r10 r11 r12
      0x01f1: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:52:0x01ef, B:22:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x01f1: PHI (r11v3 int) = (r11v2 int), (r11v1 int) binds: [B:52:0x01ef, B:22:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x01f1: PHI (r12v3 short) = (r12v2 short), (r12v1 short) binds: [B:52:0x01ef, B:22:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x024e A[PHI: r0 r8 r13
      0x024e: PHI (r0v9 int) = (r0v4 int), (r0v8 int), (r0v4 int), (r0v4 int) binds: [B:60:0x024c, B:56:0x0228, B:48:0x01c8, B:35:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r8v3 short) = (r8v2 short), (r8v1 short), (r8v1 short), (r8v1 short) binds: [B:60:0x024c, B:56:0x0228, B:48:0x01c8, B:35:0x014d] A[DONT_GENERATE, DONT_INLINE]
      0x024e: PHI (r13v3 int) = (r13v1 int), (r13v1 int), (r13v2 int), (r13v1 int) binds: [B:60:0x024c, B:56:0x0228, B:48:0x01c8, B:35:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0284 A[PHI: r15
      0x0284: PHI (r15v3 int) = (r15v2 int), (r15v1 int), (r15v1 int) binds: [B:64:0x0282, B:44:0x01a3, B:14:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        int iM2761;
        int i;
        int i2;
        int i3;
        char c;
        int i4;
        short[] sArr = null;
        int i5 = AbstractC3624.f12429;
        int i6 = C2310.f7472;
        int iM3169 = (i6 - C0773.m3169("֡᩺")) * 55;
        int i7 = ((iM3169 ^ i5) * 20477) ^ 778463930;
        int i8 = iM3169 ^ 1543432724;
        AbstractC22044 abstractC22044 = null;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1204614619;
        char c2 = 0;
        short[] sArr2 = null;
        int i16 = 0;
        while (true) {
            i15 = i8 ^ (i7 & (((i15 ^ i5) * (-12713)) >> 31));
            switch (i15) {
                case -1890306896:
                case 372704297:
                    i14 = 1;
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0773.m3169("᩷᩺") ^ i5;
                        i = ((iM2761 ^ i6) * 3665) ^ (-389360311);
                        i2 = i13;
                        i3 = -1634921492;
                    } else {
                        iM2761 = C0619.m2761("᩸ۨ") ^ i6;
                        i = ((iM2761 ^ i5) * 6147) ^ (-1273817678);
                        i2 = i13;
                        i3 = -2013803978;
                    }
                    int i17 = iM2761 ^ i3;
                    i13 = i2;
                    i7 = i;
                    i8 = i17;
                    break;
                case -1807045965:
                case 790789698:
                    s = sArr2[c2];
                    if (C1321.m4852()) {
                        iM2761 = C0619.m2761("ۨܳ") ^ i6;
                        i = ((iM2761 ^ i5) * (-25033)) ^ 320458240;
                        i2 = i13;
                        i3 = 486092319;
                    } else {
                        iM2761 = (C0619.m2761("ۚ۟") + i5) * 89;
                        i = ((iM2761 ^ i6) * (-28537)) ^ (-407979303);
                        i2 = i13;
                        i3 = 747267802;
                    }
                    int i18 = iM2761 ^ i3;
                    i13 = i2;
                    i7 = i;
                    i8 = i18;
                    break;
                case -1713081340:
                case 1371994655:
                    i16 = 9;
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0619.m2761("ۚ۟") + i5) * 89;
                        i = ((iM2761 ^ i6) * (-28537)) ^ (-407979303);
                        i2 = i13;
                        i3 = 747267802;
                    } else {
                        iM2761 = (i5 - C0619.m2761("ܰ᩷")) * (-73);
                        i = ((iM2761 ^ i6) * (-22851)) ^ 1371679934;
                        i2 = i13;
                        i3 = 166620984;
                    }
                    int i19 = iM2761 ^ i3;
                    i13 = i2;
                    i7 = i;
                    i8 = i19;
                    break;
                case -1527966427:
                case 865879036:
                    i11 = i10 + i10;
                    s2 = 4028;
                    if (C3734.m12152() >= 0) {
                        iM2761 = C0773.m3169("᩵֡") ^ i6;
                        i = ((iM2761 ^ i5) * 19037) ^ (-930589713);
                        i2 = i13;
                        i3 = 546057269;
                    } else {
                        iM2761 = (C0773.m3169("ܿۧ") + i5) * (-119);
                        i = ((iM2761 ^ i6) * (-11593)) ^ (-999968811);
                        i2 = i13;
                        i3 = 416701877;
                    }
                    int i110 = iM2761 ^ i3;
                    i13 = i2;
                    i7 = i;
                    i8 = i110;
                    break;
                case -1400678057:
                case -1170320849:
                    i12 = s + s2;
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (C0619.m2761("ۚ۟") + i5) * 89;
                        i = ((iM2761 ^ i6) * (-28537)) ^ (-407979303);
                        i2 = i13;
                        i3 = 747267802;
                    } else {
                        iM2761 = (i6 - C0619.m2761("ᩴۙ")) * (-29);
                        i = ((iM2761 ^ i5) * (-19759)) ^ 1091862486;
                        i2 = i13;
                        i3 = 1808252192;
                    }
                    int i111 = iM2761 ^ i3;
                    i13 = i2;
                    i7 = i;
                    i8 = i111;
                    break;
                case -1290153695:
                case -682001447:
                    C1343.m4943();
                    if (C3779.f12953 <= 0) {
                        c = c2;
                        iM2761 = (C0619.m2761("ۜ᩹") + i6) * 15;
                        i = ((iM2761 ^ i5) * 14149) ^ 1540095517;
                        c2 = c;
                        i2 = i13;
                        i3 = 1530654886;
                    } else {
                        iM2761 = C0773.m3169("᩷᩺") ^ i5;
                        i = ((iM2761 ^ i6) * 3665) ^ (-389360311);
                        i2 = i13;
                        i3 = -1634921492;
                    }
                    int i112 = iM2761 ^ i3;
                    i13 = i2;
                    i7 = i;
                    i8 = i112;
                    break;
                case -1184337361:
                case 1347155869:
                    f56 = C0269.m1774(abstractC22044, C1564.m5510(sArr, i14, i16, i13));
                    return;
                case -1014357556:
                case 1600891060:
                    short[] sArr3 = f58;
                    if (C2023.f6737) {
                        sArr2 = sArr3;
                        c = 0;
                        iM2761 = (C0619.m2761("ۜ᩹") + i6) * 15;
                        i = ((iM2761 ^ i5) * 14149) ^ 1540095517;
                        c2 = c;
                        i2 = i13;
                        i3 = 1530654886;
                    } else {
                        iM2761 = (C0773.m3169("ܿ᩶") + i5) * (-35);
                        sArr2 = sArr3;
                        i = ((iM2761 ^ i6) * 28603) ^ (-864134440);
                        i2 = i13;
                        i3 = -568629377;
                        c2 = 0;
                    }
                    int i113 = iM2761 ^ i3;
                    i13 = i2;
                    i7 = i;
                    i8 = i113;
                    break;
                case -964697908:
                case -155378016:
                    C0950.m3785();
                    if (RunnableC0334.f1808 > 0) {
                        iM2761 = (C0619.m2761("ۛ᩹") ^ i6) * 99;
                        i = ((iM2761 ^ i5) * 29285) ^ (-935604861);
                        i2 = i13;
                        i3 = 49787980;
                    } else {
                        iM2761 = (C0619.m2761("ۚ۟") + i5) * 89;
                        i = ((iM2761 ^ i6) * (-28537)) ^ (-407979303);
                        i2 = i13;
                        i3 = 747267802;
                    }
                    int i114 = iM2761 ^ i3;
                    i13 = i2;
                    i7 = i;
                    i8 = i114;
                    break;
                case -892602355:
                case -232722587:
                    i9 = s * s;
                    if (C0862.m3503()) {
                        iM2761 = (C0773.m3169("ۜۜ") + i5) * (-35);
                        i = ((iM2761 ^ i6) * (-5425)) ^ 1473907937;
                        i2 = i13;
                        i3 = 2022551680;
                    } else {
                        c = c2;
                        iM2761 = (C0619.m2761("ۜ᩹") + i6) * 15;
                        i = ((iM2761 ^ i5) * 14149) ^ 1540095517;
                        c2 = c;
                        i2 = i13;
                        i3 = 1530654886;
                    }
                    int i115 = iM2761 ^ i3;
                    i13 = i2;
                    i7 = i;
                    i8 = i115;
                    break;
                case -714901819:
                case 1029747452:
                    C3779.m12264();
                    C2354.m7983();
                    c = c2;
                    iM2761 = (C0619.m2761("ۜ᩹") + i6) * 15;
                    i = ((iM2761 ^ i5) * 14149) ^ 1540095517;
                    c2 = c;
                    i2 = i13;
                    i3 = 1530654886;
                    int i116 = iM2761 ^ i3;
                    i13 = i2;
                    i7 = i;
                    i8 = i116;
                    break;
                case -680140804:
                case 2061784796:
                    if ((i12 * i12) - i11 > 0) {
                        iM2761 = (i6 - C0773.m3169("᩸֫")) * q.h;
                        i = ((iM2761 ^ i5) * 15253) ^ 545148362;
                        i2 = i13;
                        i3 = -1279614905;
                    } else {
                        iM2761 = C0619.m2761("ۚ۫") ^ i5;
                        i = ((iM2761 ^ i6) * (-30035)) ^ 1238780565;
                        i2 = i13;
                        i3 = 368974738;
                    }
                    int i117 = iM2761 ^ i3;
                    i13 = i2;
                    i7 = i;
                    i8 = i117;
                    break;
                case -419909534:
                case -414001482:
                    i10 = i9 + 16224784;
                    if (C1564.f5401 <= 0) {
                        iM2761 = C0773.m3169("᩵֡") ^ i6;
                        i = ((iM2761 ^ i5) * 19037) ^ (-930589713);
                        i2 = i13;
                        i3 = 546057269;
                    } else {
                        iM2761 = C0773.m3169("ۨۗ") ^ i6;
                        i = ((iM2761 ^ i5) * 18483) ^ (-439125395);
                        i2 = i13;
                        i3 = -441543606;
                    }
                    int i118 = iM2761 ^ i3;
                    i13 = i2;
                    i7 = i;
                    i8 = i118;
                    break;
                case -339892486:
                case 220646110:
                    abstractC22044 = C6382.f21568;
                    sArr = f58;
                    if (C1146.f4234 >= 0) {
                        c = c2;
                        iM2761 = (C0619.m2761("ۜ᩹") + i6) * 15;
                        i = ((iM2761 ^ i5) * 14149) ^ 1540095517;
                        c2 = c;
                        i2 = i13;
                        i3 = 1530654886;
                    } else {
                        iM2761 = (C0773.m3169("᩹֫") + i5) * (-101);
                        i = ((iM2761 ^ i6) * 15417) ^ (-2144798948);
                        i2 = i13;
                        i3 = -2056027580;
                    }
                    int i119 = iM2761 ^ i3;
                    i13 = i2;
                    i7 = i;
                    i8 = i119;
                    break;
                case 568386454:
                case 1080805442:
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0773.m3169("᩷᩺") ^ i5;
                        i = ((iM2761 ^ i6) * 3665) ^ (-389360311);
                        i2 = i13;
                        i3 = -1634921492;
                    } else {
                        iM2761 = C0619.m2761("ۧ᩷") ^ i6;
                        i = ((iM2761 ^ i5) * (-11715)) ^ (-576509722);
                        i2 = i13;
                        i3 = -116357781;
                    }
                    int i1110 = iM2761 ^ i3;
                    i13 = i2;
                    i7 = i;
                    i8 = i1110;
                    break;
                case 661045193:
                case 968353175:
                    i4 = 55236;
                    iM2761 = C0773.m3169("ۖܿ") ^ i5;
                    i3 = -1605347815;
                    i2 = i4;
                    i = ((iM2761 ^ i6) * (-9251)) ^ 207684022;
                    int i1111 = iM2761 ^ i3;
                    i13 = i2;
                    i7 = i;
                    i8 = i1111;
                    break;
                case 1229591277:
                case 1673902902:
                    C2485.m8357();
                    if (C0487.m2356() < 0) {
                        c = c2;
                        iM2761 = (C0619.m2761("ۜ᩹") + i6) * 15;
                        i = ((iM2761 ^ i5) * 14149) ^ 1540095517;
                        c2 = c;
                        i2 = i13;
                        i3 = 1530654886;
                    } else {
                        iM2761 = (C0619.m2761("ۛ᩹") ^ i6) * 99;
                        i = ((iM2761 ^ i5) * 29285) ^ (-935604861);
                        i2 = i13;
                        i3 = 49787980;
                    }
                    int i1112 = iM2761 ^ i3;
                    i13 = i2;
                    i7 = i;
                    i8 = i1112;
                    break;
                case 1578363657:
                case 1704204166:
                    i4 = 59905;
                    iM2761 = C0773.m3169("ۖܿ") ^ i5;
                    i3 = -1605347815;
                    i2 = i4;
                    i = ((iM2761 ^ i6) * (-9251)) ^ 207684022;
                    int i1113 = iM2761 ^ i3;
                    i13 = i2;
                    i7 = i;
                    i8 = i1113;
                    break;
                default:
                    C1564.m5509();
                    C2966.m9664();
                    throw new RuntimeException();
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m134(String str) {
        C3734.m12147(C2310.m7806(f56, str));
    }
}
