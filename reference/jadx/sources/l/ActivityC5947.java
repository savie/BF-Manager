package l;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import bin.mt.plus.Main;
import com.google.android.material.slider.BaseSlider;
import java.util.Iterator;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۛۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAQE */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC5947 extends ActivityC4866 {

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public static C17236 f20228;

    /* JADX INFO: renamed from: ᩶ܿۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f20229 = {8067, 17249, 17258, 17261, 17197, 17262, 17271, 17197, 17267, 17263, 17270, 17264, 17197, 17230, 17250, 17258, 17261, 17229, 17260, 17217, 17252, 17226, 17248, 17260, 17261, 17249, 17258, 17261, 17197, 17262, 17271, 17197, 17267, 17263, 17270, 17264, 17197, 17230, 17250, 17258, 17261, 17231, 17258, 17252, 17259, 17271, 17226, 17248, 17260, 17261, 17249, 17258, 17261, 17197, 17262, 17271, 17197, 17267, 17263, 17270, 17264, 17197, 17230, 17250, 17258, 17261, 17223, 17250, 17265, 17256, 17226, 17248, 17260, 17261, 2010, -22686, -22679, -22674, -22738, -22675, -22668, -22738, -22672, -22676, -22667, -22669, -22738, -22707, -22687, -22679, -22674, -22706, -22673, -22718, -22681, -22711, -22685, -22673, -22674, -22686, -22679, -22674, -22738, -22675, -22668, -22738, -22672, -22676, -22667, -22669, -22738, -22707, -22687, -22679, -22674, -22708, -22679, -22681, -22680, -22668, -22711, -22685, -22673, -22674, -22686, -22679, -22674, -22738, -22675, -22668, -22738, -22672, -22676, -22667, -22669, -22738, -22707, -22687, -22679, -22674, -22716, -22687, -22670, -22677, -22711, -22685, -22673, -22674, -22686, -22679, -22674, -22738, -22675, -22668, -22738, -22672, -22676, -22667, -22669, -22738, -22707, -22687, -22679, -22674, 2560, 15989, 15939, 15940, 15961, 15966, 15947, 15942, 15942, 15989, 15947, 15962, 15937, 15989, 15948, 15960, 15941, 15943, 15989, 15943, 15966, 15989, 15947, 15961, 15903, 15950, 15902, 15896, 15947, 15945, 15966, 15939, 15964, 15939, 15966, 15955, 15947, 15940, 15950, 15960, 15941, 15939, 15950, 15876, 15939, 15940, 15966, 15951, 15940, 15966, 15876, 15947, 15945, 15966, 15939, 15941, 15940, 15876, 15993, 15983, 15972, 15982, 15944, 15939, 15940, 15876, 15943, 15966, 15876, 15962, 15942, 15967, 15961, 15966, 15951, 15954, 15966, 15877, 15947, 15940, 15950, 15960, 15941, 15939, 15950, 15876, 15939, 15940, 15966, 15951, 15940, 15966, 15876, 15951, 15954, 15966, 15960, 15947, 15876, 15998, 15983, 15986, 15998, 15948, 15960, 15941, 15943, 15983, 15954, 15966, 15951, 15960, 15940, 15947, 15942, 15979, 15962, 15962, 15947, 15940, 15950, 15960, 15941, 15939, 15950, 15876, 15939, 15940, 15966, 15951, 15940, 15966, 15876, 15947, 15945, 15966, 15939, 15941, 15940, 15876, 15996, 15971, 15983, 15997};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17236 m16217(Uri uri) {
        C17236 c17236 = null;
        C17236 c17237 = null;
        int i = -308659257;
        int i2 = C2477.f9839;
        int i3 = C3535.f13026;
        int iM45029 = (C19806.m45029("᩸۟") ^ i2) * (-41);
        int i4 = ((iM45029 ^ i3) * 4057) ^ (-649607329);
        int i5 = 359830827;
        while (true) {
            i = ((((i ^ i3) * (-1699)) >> 31) & i4) ^ (iM45029 ^ i5);
            switch (i) {
                case -2062291310:
                case -1908566937:
                    RunnableC1606.m5473();
                    return null;
                case -2041811105:
                case -1900554737:
                    if (C1668.f6641 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ۟") ^ i3) * 35;
                        i4 = ((iM45029 ^ i2) * (-12179)) ^ 996288986;
                        i5 = 1885323941;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۚۢ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 29049) ^ (-2084052822);
                        i5 = -1178413880;
                    }
                    break;
                case -1939808747:
                case 1809932934:
                    if (C1066.m4023() <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 19367) ^ 1236014664;
                        i5 = -164904510;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-7507)) ^ (-1285793030);
                        i5 = -32749229;
                    }
                    break;
                case -1860917369:
                case -1074263446:
                    c17237 = null;
                    if (c17236 != null) {
                        iM45029 = (i3 - C19806.m45029("᩺᩷")) * 93;
                        i4 = ((iM45029 ^ i2) * (-9113)) ^ (-1458142955);
                        i5 = -847913936;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡֫") ^ i2) * 97;
                        i4 = ((iM45029 ^ i3) * 9089) ^ (-1457387750);
                        i5 = 835925251;
                    }
                    break;
                case -1816836629:
                case 1459574867:
                    if (C1066.m4023() <= 0) {
                        iM45029 = (i2 - C19806.m45029("۬ܽ")) * 41;
                        i4 = ((iM45029 ^ i3) * (-1327)) ^ (-868503970);
                        i5 = 1191926058;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۤ۬") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-20351)) ^ (-1370226924);
                        i5 = -535237891;
                    }
                    break;
                case -1446304030:
                case 1333172168:
                    C0797.m3359();
                    if (RunnableC3388.f12514 < 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۤ") + i2) * (-31);
                        i4 = ((iM45029 ^ i3) * (-25203)) ^ 1924297890;
                        i5 = -1449081121;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜܶ") ^ i2;
                        i4 = ((iM45029 ^ i3) * (-7507)) ^ (-1285793030);
                        i5 = -32749229;
                    }
                    break;
                case -1341416299:
                case 1824124687:
                    if (C3660.m10791() != 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۤ") + i2) * (-31);
                        i4 = ((iM45029 ^ i3) * (-25203)) ^ 1924297890;
                        i5 = -1449081121;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܽܽ") ^ i3;
                        i4 = ((iM45029 ^ i2) * (-17215)) ^ (-1447113378);
                        i5 = 1664772838;
                    }
                    break;
                case -1329738609:
                case 440423947:
                    C1937.m6279();
                    if (C1398.f5802 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ۟") ^ i3) * 35;
                        i4 = ((iM45029 ^ i2) * (-12179)) ^ 996288986;
                        i5 = 1885323941;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۤ") + i2) * (-31);
                        i4 = ((iM45029 ^ i3) * (-25203)) ^ 1924297890;
                        i5 = -1449081121;
                    }
                    break;
                case -1292933386:
                case 455771178:
                    if (C2249.f8050 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 19367) ^ 1236014664;
                        i5 = -164904510;
                    } else {
                        iM45029 = C19806.m45029("ᩳܽ") ^ i2;
                        i4 = ((iM45029 ^ i3) * 12221) ^ 13688885;
                        i5 = -1069964975;
                    }
                    break;
                case -1291351737:
                case -1088122746:
                    return c17237;
                case -1266052136:
                case -638333864:
                    C17236 c17238 = f20228;
                    f20228 = c17237;
                    return c17238;
                case -1068201024:
                case 1399439970:
                    C3660.m10791();
                    C1460.m5050();
                    iM45029 = ThreadFactoryC3888.m11306("ۜܶ") ^ i2;
                    i4 = ((iM45029 ^ i3) * (-7507)) ^ (-1285793030);
                    i5 = -32749229;
                    break;
                case -620090858:
                case 1020965209:
                    if (C2124.f7782 <= 0) {
                        iM45029 = (i2 - C19806.m45029("۬ܽ")) * 41;
                        i4 = ((iM45029 ^ i3) * (-1327)) ^ (-868503970);
                        i5 = 1191926058;
                    } else {
                        iM45029 = C19806.m45029("ۙ᩶") ^ i2;
                        i4 = ((iM45029 ^ i3) * 7299) ^ (-1361186980);
                        i5 = 651079680;
                    }
                    break;
                case -562974440:
                case 1779980184:
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۡ۟") ^ i3) * 35;
                        i4 = ((iM45029 ^ i2) * (-12179)) ^ 996288986;
                        i5 = 1885323941;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ᩴ᩸")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM45029 ^ i3) * (-23189)) ^ (-1545642593);
                        i5 = -274403168;
                    }
                    break;
                case -433966177:
                case 1530104388:
                    if (C0817.f3443) {
                        iM45029 = (i2 - ThreadFactoryC3888.m11306("᩵֡")) * 51;
                        i4 = ((iM45029 ^ i3) * 1775) ^ 1011288343;
                        i5 = 856132190;
                    } else {
                        iM45029 = (i2 - C19806.m45029("۬ܽ")) * 41;
                        i4 = ((iM45029 ^ i3) * (-1327)) ^ (-868503970);
                        i5 = 1191926058;
                    }
                    break;
                case -193480790:
                case 213443822:
                    if (C1025.f4800 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ܳۤ") + i2) * (-31);
                        i4 = ((iM45029 ^ i3) * (-25203)) ^ 1924297890;
                        i5 = -1449081121;
                    } else {
                        iM45029 = (i3 - C19806.m45029("ܰᩳ")) * 43;
                        i4 = ((iM45029 ^ i2) * 28533) ^ 902455102;
                        i5 = 27967198;
                    }
                    break;
                case 310816804:
                case 490756587:
                    c17236 = f20228;
                    if (C1461.f5957 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۗܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 19367) ^ 1236014664;
                        i5 = -164904510;
                    } else {
                        iM45029 = (i2 - C19806.m45029("ۛ᩸")) * 7;
                        i4 = ((iM45029 ^ i3) * (-9519)) ^ (-1153479329);
                        i5 = 643267131;
                    }
                    break;
                case 506974762:
                case 556210451:
                    if (AbstractC0464.m2315(c17236.f54913, uri)) {
                        iM45029 = C19806.m45029("ۡᩴ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 25359) ^ (-1614914722);
                        i5 = -2045566988;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֡֫") ^ i2) * 97;
                        i4 = ((iM45029 ^ i3) * 9089) ^ (-1457387750);
                        i5 = 835925251;
                    }
                    break;
                default:
                    if (C0629.m2907()) {
                        iM45029 = (i3 - C19806.m45029("֫ۢ")) * (-5);
                        i4 = ((iM45029 ^ i2) * (-18513)) ^ 90254650;
                        i5 = -1494349049;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۗܶ") ^ i3;
                        i4 = ((iM45029 ^ i2) * 19367) ^ 1236014664;
                        i5 = -164904510;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16218(Activity activity) {
        int i = 848152062;
        int i2 = C1025.f4800;
        int i3 = C2477.f9839;
        int iM11306 = ThreadFactoryC3888.m11306("ۤ᩵") ^ i2;
        int i4 = ((iM11306 ^ i3) * 16391) ^ (-648671333);
        int i5 = -694266685;
        while (true) {
            i = ((((i ^ i3) * (-27355)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1975581824:
                case -583731842:
                    C2124.m6673();
                    if (C3535.f13026 <= 0) {
                        iM11306 = C19806.m45029("֫ۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 6335) ^ (-337384815);
                        i5 = -477419283;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܶܺ")) * (-111);
                        i4 = ((iM11306 ^ i2) * (-23569)) ^ (-352865138);
                        i5 = -263164035;
                    }
                    break;
                case -1882717561:
                case 720838206:
                    if (CallableC1627.f6528) {
                        iM11306 = (C19806.m45029("֨᩸") + i3) * 45;
                        i4 = ((iM11306 ^ i2) * (-19095)) ^ 1715064648;
                        i5 = 1187244013;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܶܺ")) * (-111);
                        i4 = ((iM11306 ^ i2) * (-23569)) ^ (-352865138);
                        i5 = -263164035;
                    }
                    break;
                case -1725973063:
                case -967218450:
                    if (C2642.m8171() != 0) {
                        iM11306 = C19806.m45029("᩸۠") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11433)) ^ (-267430110);
                        i5 = -193159446;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶۫") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-26895)) ^ (-1467915693);
                        i5 = -462886497;
                    }
                    break;
                case -1418566985:
                case -869565294:
                    C3577.m10565();
                    C7105.m18985();
                    iM11306 = C19806.m45029("᩸۠") ^ i2;
                    i4 = ((iM11306 ^ i3) * (-11433)) ^ (-267430110);
                    i5 = -193159446;
                    break;
                case -1230596960:
                case 617501005:
                    C2249.m6915();
                    C1377.m4833();
                    break;
                case -1149939498:
                case 103763997:
                    if (C3286.f12186) {
                        iM11306 = C19806.m45029("᩸۠") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11433)) ^ (-267430110);
                        i5 = -193159446;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܰܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-31077)) ^ 1059052237;
                        i5 = -1236182817;
                    }
                    break;
                case -870947381:
                case 854332812:
                    if (C0671.f2816 != 0) {
                        iM11306 = C19806.m45029("֫ۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 6335) ^ (-337384815);
                        i5 = -477419283;
                    } else {
                        iM11306 = (C19806.m45029("ۘۤ") ^ i2) * (-31);
                        i4 = ((iM11306 ^ i3) * (-25559)) ^ (-1371096046);
                        i5 = -1321609826;
                    }
                    break;
                case -793573713:
                case 1635623821:
                    if (activity.isTaskRoot()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۛ۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-5659)) ^ (-1373247097);
                        i5 = 1061394446;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۗۤ") ^ i3) * 63;
                        i4 = ((iM11306 ^ i2) * (-3679)) ^ 1501813182;
                        i5 = -657889145;
                    }
                    break;
                case -269305936:
                case 1329175207:
                    activity.finishAndRemoveTask();
                    break;
                case -33401205:
                case 1772066450:
                    if (C0629.f2722 <= 0) {
                        iM11306 = C19806.m45029("᩸۠") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11433)) ^ (-267430110);
                        i5 = -193159446;
                    } else {
                        iM11306 = C19806.m45029("᩹᩺") ^ i2;
                        i4 = ((iM11306 ^ i3) * 6065) ^ (-103850176);
                        i5 = -1182455303;
                    }
                    break;
                case 196272893:
                case 427984250:
                    if (C0050.f912 <= 0) {
                        iM11306 = C19806.m45029("᩸۠") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11433)) ^ (-267430110);
                        i5 = -193159446;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * 5879) ^ (-2146997952);
                        i5 = -382836585;
                    }
                    break;
                case 234566864:
                case 513442057:
                    C2871.m8646();
                    if (C0216.f1393 != 0) {
                        iM11306 = (i2 - C19806.m45029("۬ܽ")) * 55;
                        i4 = ((iM11306 ^ i3) * (-29503)) ^ (-842508926);
                        i5 = 188679660;
                    } else {
                        iM11306 = C19806.m45029("֫ۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 6335) ^ (-337384815);
                        i5 = -477419283;
                    }
                    break;
                case 282065974:
                case 1150045242:
                    C0216.m1586(activity);
                    break;
                case 378882018:
                case 886711909:
                    if (C19806.m45024()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-6543)) ^ (-1061264292);
                        i5 = -835999310;
                    } else {
                        iM11306 = C19806.m45029("ۧۛ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-13567)) ^ (-1492528937);
                        i5 = -1602036587;
                    }
                    break;
                case 616207383:
                case 1189461121:
                    if (C1461.f5957 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-6543)) ^ (-1061264292);
                        i5 = -835999310;
                    } else {
                        iM11306 = (i2 - C19806.m45029("ۜۘ")) * 83;
                        i4 = ((iM11306 ^ i3) * (-26047)) ^ (-1050125696);
                        i5 = 1702711330;
                    }
                    break;
                case 1105748055:
                case 1765249559:
                    if (C0050.m946() <= 0) {
                        iM11306 = (i2 - C19806.m45029("۬ܽ")) * 55;
                        i4 = ((iM11306 ^ i3) * (-29503)) ^ (-842508926);
                        i5 = 188679660;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۡۘ")) * 31;
                        i4 = ((iM11306 ^ i2) * (-4253)) ^ 1186585092;
                        i5 = -751793016;
                    }
                    break;
                case 1725975062:
                case 2047741254:
                    if (C0216.f1393 != 0) {
                        iM11306 = C19806.m45029("᩸۠") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11433)) ^ (-267430110);
                        i5 = -193159446;
                    } else {
                        iM11306 = C19806.m45029("֨᩻") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-14399)) ^ (-697609269);
                        i5 = 1522979075;
                    }
                    break;
                default:
                    ThreadFactoryC3888.m11300();
                    if (C0050.m946() <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ܶܺ")) * (-111);
                        i4 = ((iM11306 ^ i2) * (-23569)) ^ (-352865138);
                        i5 = -263164035;
                    } else {
                        iM11306 = C19806.m45029("᩸۠") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-11433)) ^ (-267430110);
                        i5 = -193159446;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x02c6  */
    @Override // l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iM45029;
        int i;
        int i2;
        boolean z;
        int i3;
        int iM450210;
        int i4;
        int i5;
        int i6;
        Intent intent;
        int i7;
        int i8;
        String str;
        int i9;
        int i10;
        String str2;
        int iM11306;
        int i11;
        int i12;
        int i13;
        Uri uriM46732;
        Uri uri;
        int i14 = C0050.f912;
        int i15 = C1419.f5860;
        int iM450211 = C19806.m45029("᩹ܺ") ^ i15;
        int i16 = ((iM450211 ^ i14) * (-30427)) ^ 799597147;
        ComponentName componentNameM16216 = null;
        AbstractC20745 abstractC20745M15314 = null;
        Iterator itM9705 = null;
        String str3 = null;
        ResolveInfo resolveInfo = null;
        Intent intent2 = null;
        String str4 = null;
        Uri uri2 = null;
        ActivityManager.AppTask appTask = null;
        int i17 = iM450211 ^ 308180732;
        int taskId = 0;
        boolean z2 = false;
        int iM18986 = 0;
        boolean zM46725 = false;
        boolean zM2899 = false;
        boolean zM16219 = false;
        boolean zIsVisible = false;
        boolean z3 = false;
        Intent intentM18982 = null;
        int i18 = -1358561888;
        int i19 = 0;
        int i20 = 0;
        C17236 c17236 = null;
        Intent intent3 = null;
        Iterator itM5072 = null;
        List<ActivityManager.AppTask> appTasks = null;
        ResolveInfo resolveInfo2 = null;
        String str5 = null;
        String str6 = null;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        boolean z4 = false;
        List<ResolveInfo> list = null;
        int i24 = 0;
        while (true) {
            i18 = i17 ^ (i16 & (((i18 ^ i14) * (-31965)) >> 31));
            switch (i18) {
                case -1986031074:
                case 842962820:
                    str2 = str5;
                    str = str6;
                    i9 = taskId;
                    intentM18982 = intentM18982;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    i3 = i19;
                    i10 = i24;
                    appTasks = appTasks;
                    if (zM46725) {
                        iM11306 = C19806.m45029("᩻᩵") ^ i15;
                        i11 = ((iM11306 ^ i14) * (-22265)) ^ (-1293046950);
                        i12 = 2137181124;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩵ۜ") + i14) * 25;
                        i11 = ((iM11306 ^ i15) * (-22045)) ^ (-812003164);
                        i12 = 1682653775;
                    }
                    int i25 = iM11306 ^ i12;
                    appTasks = appTasks;
                    str6 = str;
                    taskId = i9;
                    uri2 = uri2;
                    resolveInfo = resolveInfo;
                    intent3 = intent3;
                    i22 = i22;
                    i20 = i20;
                    Intent intent4 = intent2;
                    intentM18982 = intentM18982;
                    i16 = i11;
                    i24 = i10;
                    i19 = i3;
                    intent2 = intent4;
                    String str7 = str2;
                    i17 = i25;
                    str5 = str7;
                    break;
                case -1925695397:
                case -1383670833:
                    if (i24 < iM18986) {
                        iM45029 = (i15 - ThreadFactoryC3888.m11306("᩷֫")) * (-121);
                        i = ((iM45029 ^ i14) * (-2193)) ^ (-1704848623);
                        i2 = 1981035158;
                    } else {
                        iM45029 = (i14 - C19806.m45029("֫ܶ")) * 19;
                        i = ((iM45029 ^ i15) * 15805) ^ (-1993935692);
                        i2 = -720512183;
                    }
                    i17 = iM45029 ^ i2;
                    i16 = i;
                    break;
                case -1918447814:
                case -718091255:
                    try {
                        appTask.moveToFront();
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۚ") ^ i14;
                        i = ((iM45029 ^ i15) * 21487) ^ 520419258;
                        i2 = 1646376635;
                        i17 = iM45029 ^ i2;
                        i16 = i;
                    } catch (Exception unused) {
                        i3 = i19;
                        i24 = i24;
                        appTasks = appTasks;
                        iM450210 = (ThreadFactoryC3888.m11306("ۜ᩵") ^ i15) * (-71);
                        i4 = ((iM450210 ^ i14) * 12211) ^ 2101474026;
                        i5 = -2083251037;
                        int i26 = iM450210 ^ i5;
                        resolveInfo2 = resolveInfo2;
                        appTasks = appTasks;
                        str5 = str5;
                        taskId = taskId;
                        i17 = i26;
                        uri2 = uri2;
                        i24 = i24;
                        i19 = i3;
                        resolveInfo = resolveInfo;
                        intent2 = intent2;
                        intentM18982 = intentM18982;
                        intent3 = intent3;
                        i16 = i4;
                        i22 = i22;
                        str6 = str6;
                        i20 = i20;
                    }
                    break;
                case -1907731489:
                case 1914045217:
                    m16218((Activity) this);
                    C2477.m7599(this, intent2);
                    iM45029 = C19806.m45029("۟ۖ") ^ i14;
                    i = ((iM45029 ^ i15) * (-15623)) ^ 1325111729;
                    i2 = 2077535906;
                    i17 = iM45029 ^ i2;
                    i16 = i;
                    break;
                case -1895330327:
                case -1651002947:
                    Intent intent5 = intentM18982;
                    int i27 = i19;
                    i20 = i20;
                    intent2 = intent2;
                    String str8 = str5;
                    String strM8172 = C2642.m8172(f20229, 242, 25, i27);
                    String strM10060 = RunnableC3388.m10060(intent5, strM8172);
                    if (strM10060 != null) {
                        int iM450212 = (C19806.m45029("᩶ۙ") ^ i14) * (-107);
                        i16 = ((iM450212 ^ i15) * 26213) ^ (-227934003);
                        i20 = i20;
                        str4 = strM10060;
                        intent2 = intent2;
                        intentM18982 = intent5;
                        i17 = iM450212 ^ (-908514990);
                        str5 = str8;
                        i19 = i27;
                        str6 = strM8172;
                    } else {
                        i22 = i22;
                        i9 = taskId;
                        intentM18982 = intent5;
                        intent3 = intent3;
                        resolveInfo = resolveInfo;
                        uri2 = uri2;
                        str5 = str8;
                        str4 = strM10060;
                        i3 = i27;
                        appTasks = appTasks;
                        str6 = strM8172;
                        i10 = i24;
                        int iM450213 = C19806.m45029("֨᩶") ^ i15;
                        i6 = ((iM450213 ^ i14) * (-24139)) ^ 365171042;
                        i17 = iM450213 ^ (-210361254);
                        i24 = i10;
                        taskId = i9;
                        i19 = i3;
                        intent2 = intent2;
                        intentM18982 = intentM18982;
                        i16 = i6;
                        appTasks = appTasks;
                        uri2 = uri2;
                        resolveInfo = resolveInfo;
                        intent3 = intent3;
                        i22 = i22;
                        i20 = i20;
                    }
                    break;
                case -1799134282:
                case -936715707:
                    i24++;
                    iM45029 = (C19806.m45029("ۗ᩸") ^ i14) * 47;
                    i = ((iM45029 ^ i15) * 14761) ^ (-1973455440);
                    i2 = 1995690661;
                    i17 = iM45029 ^ i2;
                    i16 = i;
                    break;
                case -1727812724:
                case 1256334980:
                    i24 = 0;
                    iM45029 = (C19806.m45029("ۗ᩸") ^ i14) * 47;
                    i = ((iM45029 ^ i15) * 14761) ^ (-1973455440);
                    i2 = 1995690661;
                    i17 = iM45029 ^ i2;
                    i16 = i;
                    break;
                case -1652526521:
                case 134011140:
                    i23 = appTask.getTaskInfo().id;
                    taskId = getTaskId();
                    iM45029 = (ThreadFactoryC3888.m11306("᩷ۢ") + i15) * 93;
                    i = ((iM45029 ^ i14) * (-3419)) ^ (-237545566);
                    i2 = 1139566377;
                    i17 = iM45029 ^ i2;
                    i16 = i;
                    break;
                case -1606209543:
                case 939453590:
                    break;
                case -1576820747:
                case -225863618:
                    i3 = 15914;
                    iM450210 = (i14 - ThreadFactoryC3888.m11306("ۜۡ")) * 83;
                    i4 = ((iM450210 ^ i15) * 29817) ^ (-918670190);
                    i5 = -1781203769;
                    int i28 = iM450210 ^ i5;
                    resolveInfo2 = resolveInfo2;
                    appTasks = appTasks;
                    str5 = str5;
                    taskId = taskId;
                    i17 = i28;
                    uri2 = uri2;
                    i24 = i24;
                    i19 = i3;
                    resolveInfo = resolveInfo;
                    intent2 = intent2;
                    intentM18982 = intentM18982;
                    intent3 = intent3;
                    i16 = i4;
                    i22 = i22;
                    str6 = str6;
                    i20 = i20;
                    break;
                case -1570224081:
                case -159193881:
                    str5 = str5;
                    str6 = str6;
                    taskId = taskId;
                    resolveInfo2 = resolveInfo2;
                    intentM18982 = intentM18982;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    i3 = i19;
                    i24 = i24;
                    appTasks = appTasks;
                    c17236 = f20228;
                    if (c17236 != null) {
                        iM450210 = (ThreadFactoryC3888.m11306("᩸۠") ^ i15) * 83;
                        i4 = ((iM450210 ^ i14) * 28501) ^ (-1822896293);
                        i5 = -1278507768;
                    } else {
                        iM450210 = (i15 - C19806.m45029("᩹ᩳ")) * (-73);
                        i4 = ((iM450210 ^ i14) * 18549) ^ 686259710;
                        i5 = -1508117734;
                    }
                    int i29 = iM450210 ^ i5;
                    resolveInfo2 = resolveInfo2;
                    appTasks = appTasks;
                    str5 = str5;
                    taskId = taskId;
                    i17 = i29;
                    uri2 = uri2;
                    i24 = i24;
                    i19 = i3;
                    resolveInfo = resolveInfo;
                    intent2 = intent2;
                    intentM18982 = intentM18982;
                    intent3 = intent3;
                    i16 = i4;
                    i22 = i22;
                    str6 = str6;
                    i20 = i20;
                    break;
                case -1566875279:
                case -797566293:
                    str5 = str5;
                    str6 = str6;
                    taskId = taskId;
                    intentM18982 = intentM18982;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    i3 = i19;
                    i24 = i24;
                    appTasks = appTasks;
                    itM9705 = MenuItemOnMenuItemClickListenerC3244.m9705(list);
                    iM450210 = C19806.m45029("ܺܰ") ^ i14;
                    i4 = ((iM450210 ^ i15) * 29747) ^ (-719319026);
                    i5 = 1022261166;
                    int i210 = iM450210 ^ i5;
                    resolveInfo2 = resolveInfo2;
                    appTasks = appTasks;
                    str5 = str5;
                    taskId = taskId;
                    i17 = i210;
                    uri2 = uri2;
                    i24 = i24;
                    i19 = i3;
                    resolveInfo = resolveInfo;
                    intent2 = intent2;
                    intentM18982 = intentM18982;
                    intent3 = intent3;
                    i16 = i4;
                    i22 = i22;
                    str6 = str6;
                    i20 = i20;
                    break;
                case -1565446119:
                case -477909775:
                    i22 = Build.VERSION.SDK_INT;
                    iM45029 = C19806.m45029("ܶۤ") ^ i14;
                    i = ((iM45029 ^ i15) * (-15605)) ^ (-480878841);
                    i2 = 1262428187;
                    i17 = iM45029 ^ i2;
                    i16 = i;
                    break;
                case -1559496150:
                case 1147152865:
                    if (z3) {
                        iM45029 = (C19806.m45029("֡ۡ") ^ i15) * 123;
                        i = ((iM45029 ^ i14) * (-30853)) ^ 582531676;
                        i2 = 698134340;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩴۚ") ^ i14;
                        i = ((iM45029 ^ i15) * 21487) ^ 520419258;
                        i2 = 1646376635;
                    }
                    i17 = iM45029 ^ i2;
                    i16 = i;
                    break;
                case -1430630517:
                case -869371481:
                    str2 = str5;
                    str = str6;
                    i9 = taskId;
                    intentM18982 = intentM18982;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    i3 = i19;
                    i10 = i24;
                    appTasks = appTasks;
                    if (str3 == null) {
                        str5 = str2;
                        str6 = str;
                        int iM450214 = C19806.m45029("֨᩶") ^ i15;
                        i6 = ((iM450214 ^ i14) * (-24139)) ^ 365171042;
                        i17 = iM450214 ^ (-210361254);
                        i24 = i10;
                        taskId = i9;
                        i19 = i3;
                        intent2 = intent2;
                        intentM18982 = intentM18982;
                        i16 = i6;
                        appTasks = appTasks;
                        uri2 = uri2;
                        resolveInfo = resolveInfo;
                        intent3 = intent3;
                        i22 = i22;
                        i20 = i20;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۘ᩺") ^ i15) * (-97);
                        i11 = ((iM11306 ^ i14) * 26021) ^ (-1785083414);
                        i12 = 934597424;
                        int i211 = iM11306 ^ i12;
                        appTasks = appTasks;
                        str6 = str;
                        taskId = i9;
                        uri2 = uri2;
                        resolveInfo = resolveInfo;
                        intent3 = intent3;
                        i22 = i22;
                        i20 = i20;
                        Intent intent6 = intent2;
                        intentM18982 = intentM18982;
                        i16 = i11;
                        i24 = i10;
                        i19 = i3;
                        intent2 = intent6;
                        String str9 = str2;
                        i17 = i211;
                        str5 = str9;
                    }
                    break;
                case -1430155804:
                case 1335230443:
                    str5 = str5;
                    str6 = str6;
                    ResolveInfo resolveInfo3 = resolveInfo;
                    intentM18982 = intentM18982;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    i3 = i19;
                    i24 = i24;
                    Uri uri3 = uri2;
                    try {
                        resolveInfo = resolveInfo3;
                        try {
                            uri2 = uri3;
                            try {
                                appTasks = appTasks;
                                taskId = taskId;
                                try {
                                    C17236 c17237 = new C17236(abstractC20745M15314.mo40127(), C0278.m1780(abstractC20745M15314), abstractC20745M15314.mo33964());
                                    f20228 = c17237;
                                    uriM46732 = c17237.f54913;
                                    int iM450215 = C19806.m45029("֡۬") ^ i14;
                                    i13 = ((iM450215 ^ i15) * (-139)) ^ (-426336143);
                                    resolveInfo = resolveInfo;
                                    appTasks = appTasks;
                                    taskId = taskId;
                                    uri2 = uriM46732;
                                    intent3 = intent3;
                                    str5 = str5;
                                    i22 = i22;
                                    i17 = iM450215 ^ (-519606145);
                                    i20 = i20;
                                    i24 = i24;
                                    i19 = i3;
                                    intent2 = intent2;
                                    intentM18982 = intentM18982;
                                    i16 = i13;
                                    str6 = str6;
                                } catch (Exception unused2) {
                                    resolveInfo2 = resolveInfo2;
                                    iM450210 = (ThreadFactoryC3888.m11306("ۜ᩵") ^ i15) * (-71);
                                    i4 = ((iM450210 ^ i14) * 12211) ^ 2101474026;
                                    i5 = -2083251037;
                                    int i212 = iM450210 ^ i5;
                                    resolveInfo2 = resolveInfo2;
                                    appTasks = appTasks;
                                    str5 = str5;
                                    taskId = taskId;
                                    i17 = i212;
                                    uri2 = uri2;
                                    i24 = i24;
                                    i19 = i3;
                                    resolveInfo = resolveInfo;
                                    intent2 = intent2;
                                    intentM18982 = intentM18982;
                                    intent3 = intent3;
                                    i16 = i4;
                                    i22 = i22;
                                    str6 = str6;
                                    i20 = i20;
                                }
                            } catch (Exception unused3) {
                                appTasks = appTasks;
                                taskId = taskId;
                                resolveInfo2 = resolveInfo2;
                                iM450210 = (ThreadFactoryC3888.m11306("ۜ᩵") ^ i15) * (-71);
                                i4 = ((iM450210 ^ i14) * 12211) ^ 2101474026;
                                i5 = -2083251037;
                                int i213 = iM450210 ^ i5;
                                resolveInfo2 = resolveInfo2;
                                appTasks = appTasks;
                                str5 = str5;
                                taskId = taskId;
                                i17 = i213;
                                uri2 = uri2;
                                i24 = i24;
                                i19 = i3;
                                resolveInfo = resolveInfo;
                                intent2 = intent2;
                                intentM18982 = intentM18982;
                                intent3 = intent3;
                                i16 = i4;
                                i22 = i22;
                                str6 = str6;
                                i20 = i20;
                                break;
                            }
                        } catch (Exception unused4) {
                            uri2 = uri3;
                            appTasks = appTasks;
                            taskId = taskId;
                            resolveInfo2 = resolveInfo2;
                            iM450210 = (ThreadFactoryC3888.m11306("ۜ᩵") ^ i15) * (-71);
                            i4 = ((iM450210 ^ i14) * 12211) ^ 2101474026;
                            i5 = -2083251037;
                            int i214 = iM450210 ^ i5;
                            resolveInfo2 = resolveInfo2;
                            appTasks = appTasks;
                            str5 = str5;
                            taskId = taskId;
                            i17 = i214;
                            uri2 = uri2;
                            i24 = i24;
                            i19 = i3;
                            resolveInfo = resolveInfo;
                            intent2 = intent2;
                            intentM18982 = intentM18982;
                            intent3 = intent3;
                            i16 = i4;
                            i22 = i22;
                            str6 = str6;
                            i20 = i20;
                            break;
                        }
                    } catch (Exception unused5) {
                        resolveInfo = resolveInfo3;
                    }
                    break;
                case -1389536009:
                case -364472036:
                    str5 = str5;
                    intentM18982 = intentM18982;
                    i3 = i19;
                    i20 = i20;
                    try {
                        Intent intent7 = new Intent();
                        i24 = i24;
                        ComponentName componentName = componentNameM16216;
                        try {
                            intent7.setComponent(componentName);
                            C2871.m8643(intent7, i21);
                            C2871.m8643(intent7, i20);
                            componentNameM16216 = componentName;
                            try {
                                i22 = i22;
                                str6 = str6;
                                try {
                                    try {
                                        intent7.setAction(RunnableC1564.m5344(f20229, 282, 26, i3));
                                        uri = uri2;
                                        try {
                                            intent7.setData(uri);
                                            zM2899 = C0629.m2899(appTasks);
                                            int iM11307 = (i15 - ThreadFactoryC3888.m11306("᩺ᩳ")) * (-29);
                                            intentM18982 = intentM18982;
                                            uri2 = uri;
                                            i16 = ((iM11307 ^ i14) * (-14251)) ^ 1214476487;
                                            i24 = i24;
                                            str6 = str6;
                                            i19 = i3;
                                            intent2 = intent7;
                                            str5 = str5;
                                            i17 = iM11307 ^ (-799682743);
                                            i22 = i22;
                                        } catch (Exception unused6) {
                                            intent2 = intent7;
                                            appTasks = appTasks;
                                            taskId = taskId;
                                            resolveInfo2 = resolveInfo2;
                                            intent3 = intent3;
                                            resolveInfo = resolveInfo;
                                            uri2 = uri;
                                            iM450210 = (ThreadFactoryC3888.m11306("ۜ᩵") ^ i15) * (-71);
                                            i4 = ((iM450210 ^ i14) * 12211) ^ 2101474026;
                                            i5 = -2083251037;
                                            int i215 = iM450210 ^ i5;
                                            resolveInfo2 = resolveInfo2;
                                            appTasks = appTasks;
                                            str5 = str5;
                                            taskId = taskId;
                                            i17 = i215;
                                            uri2 = uri2;
                                            i24 = i24;
                                            i19 = i3;
                                            resolveInfo = resolveInfo;
                                            intent2 = intent2;
                                            intentM18982 = intentM18982;
                                            intent3 = intent3;
                                            i16 = i4;
                                            i22 = i22;
                                            str6 = str6;
                                        }
                                    } catch (Exception unused7) {
                                        intent2 = intent7;
                                        resolveInfo2 = resolveInfo2;
                                        appTasks = appTasks;
                                        iM450210 = (ThreadFactoryC3888.m11306("ۜ᩵") ^ i15) * (-71);
                                        i4 = ((iM450210 ^ i14) * 12211) ^ 2101474026;
                                        i5 = -2083251037;
                                        int i216 = iM450210 ^ i5;
                                        resolveInfo2 = resolveInfo2;
                                        appTasks = appTasks;
                                        str5 = str5;
                                        taskId = taskId;
                                        i17 = i216;
                                        uri2 = uri2;
                                        i24 = i24;
                                        i19 = i3;
                                        resolveInfo = resolveInfo;
                                        intent2 = intent2;
                                        intentM18982 = intentM18982;
                                        intent3 = intent3;
                                        i16 = i4;
                                        i22 = i22;
                                        str6 = str6;
                                    }
                                } catch (Exception unused8) {
                                    uri = uri2;
                                    intent2 = intent7;
                                    appTasks = appTasks;
                                    taskId = taskId;
                                    resolveInfo2 = resolveInfo2;
                                    intent3 = intent3;
                                    resolveInfo = resolveInfo;
                                    uri2 = uri;
                                    iM450210 = (ThreadFactoryC3888.m11306("ۜ᩵") ^ i15) * (-71);
                                    i4 = ((iM450210 ^ i14) * 12211) ^ 2101474026;
                                    i5 = -2083251037;
                                    int i217 = iM450210 ^ i5;
                                    resolveInfo2 = resolveInfo2;
                                    appTasks = appTasks;
                                    str5 = str5;
                                    taskId = taskId;
                                    i17 = i217;
                                    uri2 = uri2;
                                    i24 = i24;
                                    i19 = i3;
                                    resolveInfo = resolveInfo;
                                    intent2 = intent2;
                                    intentM18982 = intentM18982;
                                    intent3 = intent3;
                                    i16 = i4;
                                    i22 = i22;
                                    str6 = str6;
                                    i20 = i20;
                                    break;
                                }
                            } catch (Exception unused9) {
                                i22 = i22;
                                str6 = str6;
                            }
                        } catch (Exception unused10) {
                            componentNameM16216 = componentName;
                            i22 = i22;
                            str6 = str6;
                        }
                    } catch (Exception unused11) {
                        i24 = i24;
                        i22 = i22;
                        str6 = str6;
                        intent2 = null;
                    }
                    i20 = i20;
                    break;
                case -1336596038:
                case 437240283:
                    int i30 = i22;
                    String str10 = str6;
                    int i31 = taskId;
                    Intent intent8 = intentM18982;
                    Intent intent9 = intent2;
                    int i32 = i19;
                    appTasks = ((ActivityManager) C0278.m1777(this, C0817.m3406(f20229, 192, 8, i32))).getAppTasks();
                    componentNameM16216 = m16216(this, appTasks);
                    z2 = true;
                    int iM11308 = (ThreadFactoryC3888.m11306("ۧۤ") + i14) * (-41);
                    int i33 = ((iM11308 ^ i15) * (-22793)) ^ 1887337359;
                    resolveInfo2 = resolveInfo2;
                    uri2 = uri2;
                    str5 = str5;
                    i24 = i24;
                    i19 = i32;
                    i17 = iM11308 ^ (-1383435284);
                    resolveInfo = resolveInfo;
                    intent2 = intent9;
                    str6 = str10;
                    intentM18982 = intent8;
                    intent3 = intent3;
                    i16 = i33;
                    i22 = i30;
                    taskId = i31;
                    i20 = 67108864;
                    break;
                case -1185020250:
                case 917528380:
                    zIsVisible = appTask.getTaskInfo().isVisible();
                    iM45029 = (C19806.m45029("᩻ۗ") ^ i14) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i = ((iM45029 ^ i15) * 1447) ^ (-1408142698);
                    i2 = 821310298;
                    i17 = iM45029 ^ i2;
                    i16 = i;
                    break;
                case -1133078996:
                case 526144543:
                    iM18986 = C7105.m18986(appTasks);
                    iM45029 = C19806.m45029("ۛ۟") ^ i15;
                    i = ((iM45029 ^ i14) * (-27221)) ^ 310349815;
                    i2 = 1285781906;
                    i17 = iM45029 ^ i2;
                    i16 = i;
                    break;
                case -999007828:
                case 1710331319:
                    str5 = str5;
                    str6 = str6;
                    taskId = taskId;
                    intentM18982 = intentM18982;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    i3 = i19;
                    i24 = i24;
                    appTasks = appTasks;
                    resolveInfo2 = (ResolveInfo) C0216.m1584(itM5072);
                    if ((resolveInfo2.activityInfo.applicationInfo.flags & 129) == 0) {
                        resolveInfo2 = resolveInfo2;
                        intent = intent3;
                        int iM450216 = C19806.m45029("ۖܺ") ^ i14;
                        i7 = ((iM450216 ^ i15) * 2397) ^ 1778619384;
                        i8 = iM450216 ^ (-1530728096);
                        appTasks = appTasks;
                        str6 = str6;
                        taskId = taskId;
                        uri2 = uri2;
                        resolveInfo = resolveInfo;
                        intent3 = intent;
                        i24 = i24;
                        i19 = i3;
                        intent2 = intent2;
                        intentM18982 = intentM18982;
                        i16 = i7;
                        i22 = i22;
                        i20 = i20;
                        String str11 = str5;
                        i17 = i8;
                        str5 = str11;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("᩵۟") ^ i14;
                        i4 = ((iM450210 ^ i15) * 14665) ^ 324321213;
                        i5 = 1844439866;
                        int i218 = iM450210 ^ i5;
                        resolveInfo2 = resolveInfo2;
                        appTasks = appTasks;
                        str5 = str5;
                        taskId = taskId;
                        i17 = i218;
                        uri2 = uri2;
                        i24 = i24;
                        i19 = i3;
                        resolveInfo = resolveInfo;
                        intent2 = intent2;
                        intentM18982 = intentM18982;
                        intent3 = intent3;
                        i16 = i4;
                        i22 = i22;
                        str6 = str6;
                        i20 = i20;
                    }
                    break;
                case -942749761:
                case 567882425:
                    if (zM16219) {
                        iM45029 = (i15 - ThreadFactoryC3888.m11306("ۖܶ")) * (-31);
                        i = ((iM45029 ^ i14) * 14613) ^ (-1321755771);
                        i2 = -2096606461;
                    } else {
                        iM45029 = C19806.m45029("ۤܽ") ^ i14;
                        i = ((iM45029 ^ i15) * (-15403)) ^ (-1760589645);
                        i2 = -2080333953;
                    }
                    i17 = iM45029 ^ i2;
                    i16 = i;
                    break;
                case -939703193:
                case -630938012:
                    str5 = str5;
                    str6 = str6;
                    taskId = taskId;
                    resolveInfo2 = resolveInfo2;
                    intentM18982 = intentM18982;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    i3 = i19;
                    i24 = i24;
                    appTasks = appTasks;
                    short s = f20229[164];
                    int i34 = (s * s) + 77475204;
                    int i35 = s + 8802;
                    if ((i34 + i34) - (i35 * i35) < 0) {
                        iM450210 = ThreadFactoryC3888.m11306("᩻ۡ") ^ i14;
                        i4 = ((iM450210 ^ i15) * 20049) ^ 1841662005;
                        i5 = -1877585961;
                    } else {
                        iM450210 = (C19806.m45029("ܰ۠") + i15) * 43;
                        i4 = ((iM450210 ^ i14) * 8495) ^ 559477832;
                        i5 = 276935728;
                    }
                    int i219 = iM450210 ^ i5;
                    resolveInfo2 = resolveInfo2;
                    appTasks = appTasks;
                    str5 = str5;
                    taskId = taskId;
                    i17 = i219;
                    uri2 = uri2;
                    i24 = i24;
                    i19 = i3;
                    resolveInfo = resolveInfo;
                    intent2 = intent2;
                    intentM18982 = intentM18982;
                    intent3 = intent3;
                    i16 = i4;
                    i22 = i22;
                    str6 = str6;
                    i20 = i20;
                    break;
                case -926827627:
                case 772281790:
                    AbstractActivityC12483.m30987(intent2, z2);
                    C0278.m1783(this);
                    iM45029 = (ThreadFactoryC3888.m11306("ᩴ֨") + i14) * 35;
                    i = ((iM45029 ^ i15) * (-10869)) ^ (-20340741);
                    i2 = -2016363224;
                    i17 = iM45029 ^ i2;
                    i16 = i;
                    break;
                case -896831649:
                case 148866311:
                    z = true;
                    z3 = z;
                    iM45029 = (C19806.m45029("ܿᩴ") + i15) * 33;
                    i = ((iM45029 ^ i14) * (-26899)) ^ 21413719;
                    i2 = -845037682;
                    i17 = iM45029 ^ i2;
                    i16 = i;
                    break;
                case -717861167:
                case 338856085:
                    str5 = str5;
                    str6 = str6;
                    taskId = taskId;
                    intentM18982 = intentM18982;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    i3 = i19;
                    i24 = i24;
                    appTasks = appTasks;
                    uriM46732 = abstractC20745M15314.m46732();
                    int iM450217 = C19806.m45029("֡۬") ^ i14;
                    i13 = ((iM450217 ^ i15) * (-139)) ^ (-426336143);
                    resolveInfo = resolveInfo;
                    appTasks = appTasks;
                    taskId = taskId;
                    uri2 = uriM46732;
                    intent3 = intent3;
                    str5 = str5;
                    i22 = i22;
                    i17 = iM450217 ^ (-519606145);
                    i20 = i20;
                    i24 = i24;
                    i19 = i3;
                    intent2 = intent2;
                    intentM18982 = intentM18982;
                    i16 = i13;
                    str6 = str6;
                    break;
                case -696517645:
                case -629169370:
                    str5 = str5;
                    str6 = str6;
                    taskId = taskId;
                    uri2 = uri2;
                    intentM18982 = intentM18982;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    appTasks = appTasks;
                    intent3 = intent3;
                    i3 = i19;
                    i24 = i24;
                    ResolveInfo resolveInfo4 = (ResolveInfo) C0278.m1776(itM9705);
                    if (!C1398.m4899(resolveInfo4.activityInfo.packageName, C3660.m10790(f20229, 226, 11, i3))) {
                        int iM450218 = (i14 - C19806.m45029("᩶᩷")) * 127;
                        i13 = ((iM450218 ^ i15) * 9015) ^ 569821496;
                        intent3 = intent3;
                        appTasks = appTasks;
                        i22 = i22;
                        taskId = taskId;
                        i20 = i20;
                        uri2 = uri2;
                        resolveInfo = resolveInfo4;
                        str5 = str5;
                        i17 = iM450218 ^ (-833027309);
                        i24 = i24;
                        i19 = i3;
                        intent2 = intent2;
                        intentM18982 = intentM18982;
                        i16 = i13;
                        str6 = str6;
                    } else {
                        resolveInfo = resolveInfo4;
                        iM450210 = C19806.m45029("ܺܰ") ^ i14;
                        i4 = ((iM450210 ^ i15) * 29747) ^ (-719319026);
                        i5 = 1022261166;
                        int i2110 = iM450210 ^ i5;
                        resolveInfo2 = resolveInfo2;
                        appTasks = appTasks;
                        str5 = str5;
                        taskId = taskId;
                        i17 = i2110;
                        uri2 = uri2;
                        i24 = i24;
                        i19 = i3;
                        resolveInfo = resolveInfo;
                        intent2 = intent2;
                        intentM18982 = intentM18982;
                        intent3 = intent3;
                        i16 = i4;
                        i22 = i22;
                        str6 = str6;
                        i20 = i20;
                    }
                    break;
                case -599790094:
                case 926699208:
                    i3 = 38248;
                    iM450210 = (i14 - ThreadFactoryC3888.m11306("ۜۡ")) * 83;
                    i4 = ((iM450210 ^ i15) * 29817) ^ (-918670190);
                    i5 = -1781203769;
                    int i2111 = iM450210 ^ i5;
                    resolveInfo2 = resolveInfo2;
                    appTasks = appTasks;
                    str5 = str5;
                    taskId = taskId;
                    i17 = i2111;
                    uri2 = uri2;
                    i24 = i24;
                    i19 = i3;
                    resolveInfo = resolveInfo;
                    intent2 = intent2;
                    intentM18982 = intentM18982;
                    intent3 = intent3;
                    i16 = i4;
                    i22 = i22;
                    str6 = str6;
                    i20 = i20;
                    break;
                case -542925640:
                case -343737248:
                    if (i23 != taskId) {
                        iM45029 = (C19806.m45029("᩹۬") ^ i14) * 33;
                        i = ((iM45029 ^ i15) * (-3951)) ^ 907904242;
                        i2 = 467050287;
                    } else {
                        z = z4;
                        z3 = z;
                        iM45029 = (C19806.m45029("ܿᩴ") + i15) * 33;
                        i = ((iM45029 ^ i14) * (-26899)) ^ 21413719;
                        i2 = -845037682;
                    }
                    i17 = iM45029 ^ i2;
                    i16 = i;
                    break;
                case -482226030:
                case 1883948349:
                    int i36 = C8265.f28733;
                    Intent intent10 = new Intent(this, (Class<?>) ActivityC11632.class);
                    intent10.setAction(str5);
                    C1668.m5574(intent10, str6, str4);
                    intent10.setType(str3);
                    C2871.m8643(intent10, i21);
                    C1977.m6359(intent10, i20);
                    intentM18982.putExtra(C1025.m3859(f20229, 267, 15, i19), z2);
                    m16218((Activity) this);
                    RunnableC1606.m5467(this, intent10);
                    break;
                case -387402841:
                case 554436854:
                    str5 = str5;
                    str6 = str6;
                    taskId = taskId;
                    resolveInfo2 = resolveInfo2;
                    intentM18982 = intentM18982;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    i3 = i19;
                    i24 = i24;
                    appTasks = appTasks;
                    if (RunnableC1564.m5348(itM5072)) {
                        iM450210 = ThreadFactoryC3888.m11306("ۡۡ") ^ i15;
                        i4 = ((iM450210 ^ i14) * 2859) ^ 436410888;
                        i5 = 299142390;
                    } else {
                        iM450210 = (C19806.m45029("۠ۨ") ^ i15) * 73;
                        i4 = ((iM450210 ^ i14) * (-12953)) ^ 1872448477;
                        i5 = 984270633;
                    }
                    int i2112 = iM450210 ^ i5;
                    resolveInfo2 = resolveInfo2;
                    appTasks = appTasks;
                    str5 = str5;
                    taskId = taskId;
                    i17 = i2112;
                    uri2 = uri2;
                    i24 = i24;
                    i19 = i3;
                    resolveInfo = resolveInfo;
                    intent2 = intent2;
                    intentM18982 = intentM18982;
                    intent3 = intent3;
                    i16 = i4;
                    i22 = i22;
                    str6 = str6;
                    i20 = i20;
                    break;
                case -309112691:
                case -99541149:
                    break;
                case -266158370:
                case 1815324444:
                    str5 = str5;
                    str6 = str6;
                    taskId = taskId;
                    resolveInfo2 = resolveInfo2;
                    intentM18982 = intentM18982;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    i3 = i19;
                    i24 = i24;
                    appTasks = appTasks;
                    C0050.m944(c17236.f54912);
                    f20228 = null;
                    iM450210 = (i15 - C19806.m45029("᩹ᩳ")) * (-73);
                    i4 = ((iM450210 ^ i14) * 18549) ^ 686259710;
                    i5 = -1508117734;
                    int i2113 = iM450210 ^ i5;
                    resolveInfo2 = resolveInfo2;
                    appTasks = appTasks;
                    str5 = str5;
                    taskId = taskId;
                    i17 = i2113;
                    uri2 = uri2;
                    i24 = i24;
                    i19 = i3;
                    resolveInfo = resolveInfo;
                    intent2 = intent2;
                    intentM18982 = intentM18982;
                    intent3 = intent3;
                    i16 = i4;
                    i22 = i22;
                    str6 = str6;
                    i20 = i20;
                    break;
                case -248169816:
                case 1891895675:
                    str5 = str5;
                    str6 = str6;
                    taskId = taskId;
                    resolveInfo2 = resolveInfo2;
                    intentM18982 = intentM18982;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    i3 = i19;
                    i24 = i24;
                    appTasks = appTasks;
                    if (RunnableC1564.m5348(itM9705)) {
                        iM450210 = C19806.m45029("۠ۘ") ^ i15;
                        i4 = ((iM450210 ^ i14) * 12361) ^ (-1164577156);
                        i5 = 266301860;
                    } else {
                        iM450210 = (C19806.m45029("֨ۚ") + i15) * (-63);
                        i4 = ((iM450210 ^ i14) * (-17359)) ^ 827686103;
                        i5 = -1678626741;
                    }
                    int i2114 = iM450210 ^ i5;
                    resolveInfo2 = resolveInfo2;
                    appTasks = appTasks;
                    str5 = str5;
                    taskId = taskId;
                    i17 = i2114;
                    uri2 = uri2;
                    i24 = i24;
                    i19 = i3;
                    resolveInfo = resolveInfo;
                    intent2 = intent2;
                    intentM18982 = intentM18982;
                    intent3 = intent3;
                    i16 = i4;
                    i22 = i22;
                    str6 = str6;
                    i20 = i20;
                    break;
                case -190386000:
                case -850383:
                    z = zIsVisible ^ z2;
                    z3 = z;
                    iM45029 = (C19806.m45029("ܿᩴ") + i15) * 33;
                    i = ((iM45029 ^ i14) * (-26899)) ^ 21413719;
                    i2 = -845037682;
                    i17 = iM45029 ^ i2;
                    i16 = i;
                    break;
                case -123197512:
                case 2057526374:
                    str5 = str5;
                    str6 = str6;
                    taskId = taskId;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    intentM18982 = intentM18982;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    appTasks = appTasks;
                    i3 = i19;
                    i24 = i24;
                    intent = new Intent(intentM18982.getAction());
                    intent.setDataAndType(intentM18982.getData(), intentM18982.getType());
                    C2871.m8643(intent, i21);
                    C21273.m47737(intent, intentM18982.getData());
                    List<ResolveInfo> listQueryIntentActivities = getPackageManager().queryIntentActivities(intent, 65536);
                    list = listQueryIntentActivities;
                    itM5072 = C1461.m5072(listQueryIntentActivities);
                    int iM450219 = C19806.m45029("ۖܺ") ^ i14;
                    i7 = ((iM450219 ^ i15) * 2397) ^ 1778619384;
                    i8 = iM450219 ^ (-1530728096);
                    appTasks = appTasks;
                    str6 = str6;
                    taskId = taskId;
                    uri2 = uri2;
                    resolveInfo = resolveInfo;
                    intent3 = intent;
                    i24 = i24;
                    i19 = i3;
                    intent2 = intent2;
                    intentM18982 = intentM18982;
                    i16 = i7;
                    i22 = i22;
                    i20 = i20;
                    String str12 = str5;
                    i17 = i8;
                    str5 = str12;
                    break;
                case -120844934:
                case 1135871528:
                    str = str6;
                    i9 = taskId;
                    intentM18982 = intentM18982;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    i3 = i19;
                    i10 = i24;
                    appTasks = appTasks;
                    String action = intentM18982.getAction();
                    String type = intentM18982.getType();
                    String strM45020 = C19806.m45020(f20229, 200, 26, i3);
                    if (AbstractC0464.m2315(strM45020, action)) {
                        int iM11309 = (i14 - ThreadFactoryC3888.m11306("ܺ۫")) * (-75);
                        int i37 = ((iM11309 ^ i15) * 23613) ^ (-1527548212);
                        i17 = iM11309 ^ 1676075709;
                        str3 = type;
                        str5 = strM45020;
                        appTasks = appTasks;
                        i24 = i10;
                        taskId = i9;
                        i19 = i3;
                        uri2 = uri2;
                        intent2 = intent2;
                        intentM18982 = intentM18982;
                        i16 = i37;
                        resolveInfo = resolveInfo;
                        str6 = str;
                    } else {
                        str3 = type;
                        str5 = strM45020;
                        str6 = str;
                        int iM4502110 = C19806.m45029("֨᩶") ^ i15;
                        i6 = ((iM4502110 ^ i14) * (-24139)) ^ 365171042;
                        i17 = iM4502110 ^ (-210361254);
                        i24 = i10;
                        taskId = i9;
                        i19 = i3;
                        intent2 = intent2;
                        intentM18982 = intentM18982;
                        i16 = i6;
                        appTasks = appTasks;
                        uri2 = uri2;
                        resolveInfo = resolveInfo;
                    }
                    intent3 = intent3;
                    i22 = i22;
                    i20 = i20;
                    break;
                case -108121563:
                case 968684568:
                    str5 = str5;
                    String str13 = str6;
                    intentM18982 = intentM18982;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    i3 = i19;
                    i10 = i24;
                    Uri uri4 = uri2;
                    if (!C3535.m10420(str3, ThreadFactoryC3888.m11312(f20229, 237, 5, i3))) {
                        appTasks = appTasks;
                        i9 = taskId;
                        intent3 = intent3;
                        resolveInfo = resolveInfo;
                        str5 = str5;
                        str6 = str13;
                        uri2 = uri4;
                        int iM4502111 = C19806.m45029("֨᩶") ^ i15;
                        i6 = ((iM4502111 ^ i14) * (-24139)) ^ 365171042;
                        i17 = iM4502111 ^ (-210361254);
                        i24 = i10;
                        taskId = i9;
                        i19 = i3;
                        intent2 = intent2;
                        intentM18982 = intentM18982;
                        i16 = i6;
                        appTasks = appTasks;
                        uri2 = uri2;
                        resolveInfo = resolveInfo;
                        intent3 = intent3;
                        i22 = i22;
                        i20 = i20;
                    } else {
                        int iM450220 = C19806.m45029("ۗ֡") ^ i15;
                        i7 = ((iM450220 ^ i14) * 25487) ^ 740139049;
                        i8 = iM450220 ^ 1211588973;
                        uri2 = uri4;
                        i24 = i10;
                        str6 = str13;
                        i19 = i3;
                        intent2 = intent2;
                        intentM18982 = intentM18982;
                        i16 = i7;
                        i22 = i22;
                        i20 = i20;
                        String str14 = str5;
                        i17 = i8;
                        str5 = str14;
                    }
                    break;
                case 79369231:
                case 651617518:
                    m16218((Activity) this);
                    break;
                case 118841238:
                case 2128167180:
                    if (i22 >= 32) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵۫") ^ i15;
                        i = ((iM45029 ^ i14) * (-19717)) ^ 408681135;
                        i2 = 1828533450;
                    } else {
                        iM45029 = (C19806.m45029("ۤܳ") ^ i14) * 51;
                        i = ((iM45029 ^ i15) * 6199) ^ 1549242769;
                        i2 = -1309952637;
                    }
                    i17 = iM45029 ^ i2;
                    i16 = i;
                    break;
                case 153568973:
                case 1525509321:
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    Intent intent11 = intent3;
                    intent11.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                    C2477.m7599(this, intent11);
                    C0278.m1783(this);
                    break;
                case 472752853:
                case 1619232940:
                    str5 = str5;
                    str6 = str6;
                    taskId = taskId;
                    resolveInfo2 = resolveInfo2;
                    intentM18982 = intentM18982;
                    i20 = i20;
                    intent2 = intent2;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    i3 = i19;
                    i24 = i24;
                    appTasks = appTasks;
                    try {
                        abstractC20745M15314 = C5553.m15314(this);
                        zM46725 = abstractC20745M15314.m46725();
                        iM450210 = ThreadFactoryC3888.m11306("۠ۛ") ^ i14;
                        i4 = ((iM450210 ^ i15) * (-3663)) ^ (-1248697000);
                        i5 = -977940474;
                    } catch (Exception unused12) {
                        iM450210 = (ThreadFactoryC3888.m11306("ۜ᩵") ^ i15) * (-71);
                        i4 = ((iM450210 ^ i14) * 12211) ^ 2101474026;
                        i5 = -2083251037;
                    }
                    int i2115 = iM450210 ^ i5;
                    resolveInfo2 = resolveInfo2;
                    appTasks = appTasks;
                    str5 = str5;
                    taskId = taskId;
                    i17 = i2115;
                    uri2 = uri2;
                    i24 = i24;
                    i19 = i3;
                    resolveInfo = resolveInfo;
                    intent2 = intent2;
                    intentM18982 = intentM18982;
                    intent3 = intent3;
                    i16 = i4;
                    i22 = i22;
                    str6 = str6;
                    i20 = i20;
                    break;
                case 566643155:
                case 1575440773:
                    Intent intent12 = intent3;
                    ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                    intent12.setComponent(new ComponentName(activityInfo2.packageName, activityInfo2.name));
                    RunnableC1606.m5467(this, intent12);
                    C0216.m1586(this);
                    break;
                case 610026685:
                case 705550639:
                    intent2 = intent2;
                    str5 = str5;
                    str6 = str6;
                    taskId = taskId;
                    resolveInfo2 = resolveInfo2;
                    i3 = i19;
                    i20 = i20;
                    i24 = i24;
                    i22 = i22;
                    intent3 = intent3;
                    resolveInfo = resolveInfo;
                    uri2 = uri2;
                    appTasks = appTasks;
                    super.onCreate(bundle);
                    intentM18982 = C7105.m18982(this);
                    if (!intentM18982.getBooleanExtra(C1377.m4832(f20229, 165, 27, i3), false)) {
                        i21 = 268435456;
                        z4 = false;
                        iM450210 = (C19806.m45029("֨ۚ") + i15) * (-63);
                        i4 = ((iM450210 ^ i14) * (-17359)) ^ 827686103;
                        i5 = -1678626741;
                        int i2116 = iM450210 ^ i5;
                        resolveInfo2 = resolveInfo2;
                        appTasks = appTasks;
                        str5 = str5;
                        taskId = taskId;
                        i17 = i2116;
                        uri2 = uri2;
                        i24 = i24;
                        i19 = i3;
                        resolveInfo = resolveInfo;
                        intent2 = intent2;
                        intentM18982 = intentM18982;
                        intent3 = intent3;
                        i16 = i4;
                        i22 = i22;
                        str6 = str6;
                        i20 = i20;
                    } else {
                        int iM450221 = C19806.m45029("۟ܶ") ^ i14;
                        i6 = ((iM450221 ^ i15) * (-12619)) ^ 163922136;
                        resolveInfo2 = resolveInfo2;
                        str5 = str5;
                        i24 = i24;
                        str6 = str6;
                        taskId = taskId;
                        z4 = false;
                        i19 = i3;
                        i17 = iM450221 ^ 914954674;
                        intent2 = intent2;
                        i21 = 268435456;
                        intentM18982 = intentM18982;
                        i16 = i6;
                        appTasks = appTasks;
                        uri2 = uri2;
                        resolveInfo = resolveInfo;
                        intent3 = intent3;
                        i22 = i22;
                        i20 = i20;
                    }
                    break;
                case 1230206602:
                case 2130037340:
                    ActivityManager.AppTask appTask2 = (ActivityManager.AppTask) C2477.m7592(appTasks, i24);
                    try {
                        zM16219 = m16219(appTask2);
                        int iM450222 = (i15 - C19806.m45029("ۙۛ")) * 41;
                        i16 = ((iM450222 ^ i14) * (-28045)) ^ (-1804644153);
                        appTask = appTask2;
                        i17 = iM450222 ^ (-240079961);
                    } catch (Exception unused13) {
                        appTask = appTask2;
                        i3 = i19;
                        i24 = i24;
                        appTasks = appTasks;
                        iM450210 = (ThreadFactoryC3888.m11306("ۜ᩵") ^ i15) * (-71);
                        i4 = ((iM450210 ^ i14) * 12211) ^ 2101474026;
                        i5 = -2083251037;
                        int i2117 = iM450210 ^ i5;
                        resolveInfo2 = resolveInfo2;
                        appTasks = appTasks;
                        str5 = str5;
                        taskId = taskId;
                        i17 = i2117;
                        uri2 = uri2;
                        i24 = i24;
                        i19 = i3;
                        resolveInfo = resolveInfo;
                        intent2 = intent2;
                        intentM18982 = intentM18982;
                        intent3 = intent3;
                        i16 = i4;
                        i22 = i22;
                        str6 = str6;
                        i20 = i20;
                    }
                    break;
                default:
                    if (zM2899) {
                        iM45029 = (i14 - C19806.m45029("֫ܶ")) * 19;
                        i = ((iM45029 ^ i15) * 15805) ^ (-1993935692);
                        i2 = -720512183;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ᩷") ^ i15;
                        i = ((iM45029 ^ i14) * (-19115)) ^ 894970162;
                        i2 = 1775620402;
                    }
                    i17 = iM45029 ^ i2;
                    i16 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0274 A[PHI: r6
      0x0274: PHI (r6v3 java.lang.String) = (r6v2 java.lang.String), (r6v1 java.lang.String), (r6v1 java.lang.String), (r6v1 java.lang.String) binds: [B:71:0x022d, B:59:0x01d6, B:51:0x0190, B:43:0x014a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x0121. Please report as an issue. */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ComponentName m16216(Activity activity, List list) {
        int iM11306;
        int i;
        int i2;
        int i3;
        int iM45029;
        int i4;
        int i5;
        int iM11307;
        int i6;
        Activity activity2 = activity;
        ActivityManager.RecentTaskInfo taskInfo = null;
        String className = null;
        byte b = 0;
        int i7 = 0;
        short[] sArr = null;
        int i8 = 936630887;
        int i9 = ViewTreeObserverOnPreDrawListenerC3327.f12317;
        int i10 = C2124.f7782;
        int iM11308 = (i9 - ThreadFactoryC3888.m11306("۠ܺ")) * (-33);
        int i11 = ((iM11308 ^ i10) * (-25947)) ^ 766851568;
        int i12 = iM11308 ^ (-44004667);
        ActivityManager.AppTask appTask = null;
        ComponentName componentName = null;
        ComponentName componentName2 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        char c = 0;
        int i19 = 0;
        int i20 = 0;
        short s = 0;
        short s2 = 0;
        byte b2 = 0;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i10) * (-2671)) >> 31));
            switch (i8) {
                case -1972482288:
                case -1137380070:
                    if (C1025.f4800 >= 0) {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("ۖ֨")) * (-125);
                        i4 = ((iM45029 ^ i10) * (-12897)) ^ (-1072014208);
                        i5 = -579774946;
                        i12 = iM45029 ^ i5;
                        i11 = i4;
                    } else {
                        i13 = i13;
                        iM11307 = ThreadFactoryC3888.m11306("ܿ᩺") ^ i9;
                        i11 = ((iM11307 ^ i10) * (-3841)) ^ (-309309199);
                        i6 = 1484737920;
                        int i21 = iM11307 ^ i6;
                        i13 = i13;
                        i12 = i21;
                        activity2 = activity;
                    }
                    break;
                case -1922990299:
                case -772269057:
                    i13 = i13;
                    s2 = 25444;
                    if (C1148.f5161 <= 0) {
                        iM11306 = C19806.m45029("ۧ᩹") ^ i9;
                        i = ((iM11306 ^ i10) * (-2995)) ^ (-912415813);
                        i2 = 707927282;
                    } else {
                        iM11306 = (C19806.m45029("᩷ܳ") ^ i9) * (-57);
                        i = ((iM11306 ^ i10) * 671) ^ 1142414257;
                        i2 = -1321389731;
                    }
                    i3 = i13;
                    i12 = iM11306 ^ i2;
                    i11 = i;
                    i13 = i3;
                    break;
                case -1906491207:
                case 1657546724:
                    sArr = f20229;
                    i15 = 1;
                    i16 = 24;
                    if (!RunnableC0195.m1431()) {
                        i13 = i13;
                        iM11307 = ThreadFactoryC3888.m11306("ۙ۬") ^ i10;
                        i11 = ((iM11307 ^ i9) * (-4027)) ^ (-132624665);
                        i6 = 2024324909;
                        int i22 = iM11307 ^ i6;
                        i13 = i13;
                        i12 = i22;
                        activity2 = activity;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠ۜ") ^ i9;
                        i4 = ((iM45029 ^ i10) * (-7973)) ^ (-416574675);
                        i5 = -551254112;
                        i12 = iM45029 ^ i5;
                        i11 = i4;
                    }
                    break;
                case -1834982618:
                case 387113785:
                    sArr4 = f20229;
                    i13 = 50;
                    i14 = 24;
                    if (!C3286.f12186) {
                        iM45029 = C19806.m45029("᩺ܰ") ^ i9;
                        i4 = ((iM45029 ^ i10) * 2907) ^ 273391604;
                        i5 = -1602924046;
                        i12 = iM45029 ^ i5;
                        i11 = i4;
                    } else {
                        int iM450210 = C19806.m45029("ۧۗ") ^ i9;
                        i12 = iM450210 ^ (-1306104754);
                        i11 = ((iM450210 ^ i10) * 2525) ^ (-33300147);
                        activity2 = activity;
                    }
                    break;
                case -1771925041:
                case 1681327982:
                    if (C1460.m5058(className, C0797.m3361(sArr, i15, i16, i7))) {
                        b = b2;
                        iM45029 = (ThreadFactoryC3888.m11306("ۘۗ") + i10) * 53;
                        i4 = ((iM45029 ^ i9) * (-12439)) ^ 2033625774;
                        i5 = 769669931;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢۙ") ^ i9) * 83;
                        i4 = ((iM45029 ^ i10) * (-29229)) ^ 1366638382;
                        i5 = -6610389;
                    }
                    i12 = iM45029 ^ i5;
                    i11 = i4;
                    break;
                case -1752895785:
                case -1270537849:
                    className = componentName.getClassName();
                    RunnableC3388.m10051(className);
                    switch (ThreadFactoryC3888.m11306(className)) {
                        case -1577057716:
                            iM45029 = (C19806.m45029("֫ۘ") ^ i10) * (-99);
                            i4 = ((iM45029 ^ i9) * 28887) ^ 995283686;
                            i5 = 815889559;
                            break;
                        case -1350715006:
                            iM45029 = ThreadFactoryC3888.m11306("ۧ֫") ^ i10;
                            i4 = ((iM45029 ^ i9) * (-20513)) ^ (-391417881);
                            i5 = 648348048;
                            break;
                        case 12451804:
                            iM45029 = (i10 - ThreadFactoryC3888.m11306("ۜۨ")) * 99;
                            i4 = ((iM45029 ^ i9) * 4229) ^ 64312281;
                            i5 = 1474104356;
                            break;
                        default:
                            iM45029 = (ThreadFactoryC3888.m11306("ۢۙ") ^ i9) * 83;
                            i4 = ((iM45029 ^ i10) * (-29229)) ^ 1366638382;
                            i5 = -6610389;
                            break;
                    }
                    i12 = iM45029 ^ i5;
                    i11 = i4;
                    break;
                case -1695304815:
                case 172831632:
                    b = 2;
                    iM45029 = (ThreadFactoryC3888.m11306("ۘۗ") + i10) * 53;
                    i4 = ((iM45029 ^ i9) * (-12439)) ^ 2033625774;
                    i5 = 769669931;
                    i12 = iM45029 ^ i5;
                    i11 = i4;
                    break;
                case -1643526588:
                case 750060783:
                    appTask = (ActivityManager.AppTask) C2477.m7592(list, 0);
                    if (C1025.f4800 >= 0) {
                        b2 = 0;
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۙ") ^ i10) * (-21);
                        i13 = i13;
                        i = ((iM11306 ^ i9) * 1361) ^ 649663162;
                        i2 = 2048249709;
                        i3 = i13;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                    } else {
                        int i23 = i13;
                        int iM450211 = C19806.m45029("ܶܺ") ^ i9;
                        i11 = ((iM450211 ^ i10) * (-16819)) ^ 682788840;
                        b2 = 0;
                        i3 = i23;
                        i12 = iM450211 ^ 1611072261;
                    }
                    i13 = i3;
                    break;
                case -1624693568:
                case -468125674:
                    componentName2 = taskInfo.origActivity;
                    iM11306 = (ThreadFactoryC3888.m11306("ۨ۬") ^ i9) * 57;
                    i = ((iM11306 ^ i10) * (-929)) ^ 839023724;
                    i2 = -1229144252;
                    i3 = i13;
                    i12 = iM11306 ^ i2;
                    i11 = i;
                    i13 = i3;
                    break;
                case -1595553954:
                case -401341239:
                    return new C4638(activity2).m12809();
                case -1541783730:
                case 1889234274:
                    i13 = i13;
                    if (C2871.f10837 >= 0) {
                        iM11307 = ThreadFactoryC3888.m11306("ۨ۫") ^ i10;
                        i11 = ((iM11307 ^ i9) * 18525) ^ 511833157;
                        i6 = -877679086;
                    } else {
                        iM11307 = C19806.m45029("ۗۙ") ^ i9;
                        i11 = ((iM11307 ^ i10) * (-30011)) ^ (-890687653);
                        i6 = 113772967;
                    }
                    int i24 = iM11307 ^ i6;
                    i13 = i13;
                    i12 = i24;
                    activity2 = activity;
                    break;
                case -1529660069:
                case -433778981:
                    if (componentName2 == null) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡۢ") ^ i9;
                        i4 = ((iM45029 ^ i10) * (-18191)) ^ (-1826746690);
                        i5 = -375138580;
                    } else {
                        iM45029 = C19806.m45029("ܽ۬") ^ i10;
                        i4 = ((iM45029 ^ i9) * (-23545)) ^ 151106995;
                        i5 = -641575520;
                    }
                    i12 = iM45029 ^ i5;
                    i11 = i4;
                    break;
                case -1495663983:
                case -465343921:
                    C2642.m8171();
                    if (C1875.m6086() == 0) {
                        i13 = i13;
                        iM11307 = ThreadFactoryC3888.m11306("ۨ۫") ^ i10;
                        i11 = ((iM11307 ^ i9) * 18525) ^ 511833157;
                        i6 = -877679086;
                        int i25 = iM11307 ^ i6;
                        i13 = i13;
                        i12 = i25;
                        activity2 = activity;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۙ") ^ i10) * (-21);
                        i13 = i13;
                        i = ((iM11306 ^ i9) * 1361) ^ 649663162;
                        i2 = 2048249709;
                        i3 = i13;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        i13 = i3;
                    }
                    break;
                case -1431636810:
                case -1369885468:
                    return componentName2;
                case -1398432937:
                case 1776158886:
                    i13 = i13;
                    if (Build.VERSION.SDK_INT <= 23) {
                        iM11306 = ThreadFactoryC3888.m11306("ۜۗ") ^ i10;
                        i = ((iM11306 ^ i9) * 12353) ^ (-1553079706);
                        i2 = 1809045171;
                    } else {
                        iM11306 = C19806.m45029("ۡܳ") ^ i10;
                        i = ((iM11306 ^ i9) * (-10807)) ^ (-1961885051);
                        i2 = 819953260;
                    }
                    i3 = i13;
                    i12 = iM11306 ^ i2;
                    i11 = i;
                    i13 = i3;
                    break;
                case -1381340290:
                case -293589959:
                    switch (b) {
                        case 0:
                        case 1:
                        case 2:
                            iM45029 = (ThreadFactoryC3888.m11306("֨᩸") + i10) * 17;
                            i4 = ((iM45029 ^ i9) * (-10453)) ^ (-533761826);
                            i5 = 360297885;
                            i12 = iM45029 ^ i5;
                            i11 = i4;
                            break;
                        default:
                            i13 = i13;
                            iM11306 = (ThreadFactoryC3888.m11306("ۖۢ") ^ i9) * (-35);
                            i = ((iM11306 ^ i10) * 24955) ^ 1479964529;
                            i2 = -1221807872;
                            i3 = i13;
                            i12 = iM11306 ^ i2;
                            i11 = i;
                            i13 = i3;
                            break;
                    }
                    break;
                case -1172994193:
                case 1334714070:
                    i13 = i13;
                    sArr2 = f20229;
                    if (CallableC1627.f6528) {
                        iM11307 = ThreadFactoryC3888.m11306("֫ۤ") ^ i10;
                        i11 = ((iM11307 ^ i9) * 23361) ^ (-622227078);
                        i6 = 796007311;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ܿ᩺") ^ i9;
                        i11 = ((iM11307 ^ i10) * (-3841)) ^ (-309309199);
                        i6 = 1484737920;
                    }
                    int i26 = iM11307 ^ i6;
                    i13 = i13;
                    i12 = i26;
                    activity2 = activity;
                    break;
                case -1073167594:
                case 692136018:
                    taskInfo = appTask.getTaskInfo();
                    ComponentName componentName3 = taskInfo.origActivity;
                    if (componentName3 != null) {
                        int iM11309 = ThreadFactoryC3888.m11306("ۙܳ") ^ i10;
                        componentName = componentName3;
                        i11 = ((iM11309 ^ i9) * 16235) ^ (-293412058);
                        i12 = iM11309 ^ (-534793306);
                    } else {
                        componentName = componentName3;
                        i13 = i13;
                        iM11306 = (ThreadFactoryC3888.m11306("ۖۢ") ^ i9) * (-35);
                        i = ((iM11306 ^ i10) * 24955) ^ 1479964529;
                        i2 = -1221807872;
                        i3 = i13;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        i13 = i3;
                    }
                    break;
                case -590120239:
                case 1932783427:
                    i7 = 17155;
                    iM11306 = (ThreadFactoryC3888.m11306("ۢۜ") + i9) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i = ((iM11306 ^ i10) * (-29243)) ^ (-929043775);
                    i2 = -680474068;
                    i3 = i13;
                    i12 = iM11306 ^ i2;
                    i11 = i;
                    i13 = i3;
                    break;
                case -442069603:
                case 746008165:
                    if (!C0797.f3386) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۙ") ^ i10) * (-21);
                        i13 = i13;
                        i = ((iM11306 ^ i9) * 1361) ^ 649663162;
                        i2 = 2048249709;
                        i3 = i13;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        i13 = i3;
                    } else {
                        i13 = i13;
                        iM11307 = ThreadFactoryC3888.m11306("ܿ᩺") ^ i9;
                        i11 = ((iM11307 ^ i10) * (-3841)) ^ (-309309199);
                        i6 = 1484737920;
                        int i27 = iM11307 ^ i6;
                        i13 = i13;
                        i12 = i27;
                        activity2 = activity;
                    }
                    break;
                case -382687337:
                case 513640825:
                    if (AbstractC0464.m2315(className, C3286.m9788(sArr4, i13, i14, i7))) {
                        iM45029 = C19806.m45029("ܺᩳ") ^ i10;
                        i4 = ((iM45029 ^ i9) * 19319) ^ (-1131144554);
                        i5 = 2111197154;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢۙ") ^ i9) * 83;
                        i4 = ((iM45029 ^ i10) * (-29229)) ^ 1366638382;
                        i5 = -6610389;
                    }
                    i12 = iM45029 ^ i5;
                    i11 = i4;
                    break;
                case -344906533:
                case 508626932:
                    i13 = i13;
                    if ((s * s2) - i20 > 0) {
                        iM11306 = C19806.m45029("֨᩹") ^ i10;
                        i = ((iM11306 ^ i9) * 15939) ^ (-900336938);
                        i2 = -1710969048;
                    } else {
                        iM11306 = C19806.m45029("۠ܰ") ^ i9;
                        i = ((iM11306 ^ i10) * (-29307)) ^ (-1307469958);
                        i2 = -1785369838;
                    }
                    i3 = i13;
                    i12 = iM11306 ^ i2;
                    i11 = i;
                    i13 = i3;
                    break;
                case -308289294:
                case 1045222719:
                    i7 = 21936;
                    iM11306 = (ThreadFactoryC3888.m11306("ۢۜ") + i9) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i = ((iM11306 ^ i10) * (-29243)) ^ (-929043775);
                    i2 = -680474068;
                    i3 = i13;
                    i12 = iM11306 ^ i2;
                    i11 = i;
                    i13 = i3;
                    break;
                case -282862038:
                case 1195648021:
                    return new ComponentName(activity2, (Class<?>) Main.class);
                case -276372763:
                case 255058453:
                    C0671.m3008();
                    if (C0629.f2722 > 0) {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("ۖ֨")) * (-125);
                        i4 = ((iM45029 ^ i10) * (-12897)) ^ (-1072014208);
                        i5 = -579774946;
                    } else {
                        iM45029 = C19806.m45029("ۙۜ") ^ i9;
                        i4 = ((iM45029 ^ i10) * 26347) ^ (-1080767113);
                        i5 = -1392149249;
                    }
                    i12 = iM45029 ^ i5;
                    i11 = i4;
                    break;
                case -77562611:
                case 184466792:
                    C2124.m6673();
                    if (C0629.f2722 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩺᩸") ^ i10;
                        i4 = ((iM45029 ^ i9) * 20389) ^ 1545569861;
                        i5 = 1661216106;
                        i12 = iM45029 ^ i5;
                        i11 = i4;
                    } else {
                        i13 = i13;
                        iM11307 = ThreadFactoryC3888.m11306("ܿ᩺") ^ i9;
                        i11 = ((iM11307 ^ i10) * (-3841)) ^ (-309309199);
                        i6 = 1484737920;
                        int i28 = iM11307 ^ i6;
                        i13 = i13;
                        i12 = i28;
                        activity2 = activity;
                    }
                    break;
                case -40307719:
                case 2020656098:
                    i13 = i13;
                    s = sArr2[c];
                    i19 = s * s;
                    if (C2477.f9839 > 0) {
                        iM11307 = (C19806.m45029("ۗۘ") ^ i9) * (-37);
                        i11 = ((iM11307 ^ i10) * (-3819)) ^ (-1398200795);
                        i6 = 1582749175;
                        int i29 = iM11307 ^ i6;
                        i13 = i13;
                        i12 = i29;
                        activity2 = activity;
                    } else {
                        i13 = i13;
                        int iM450212 = C19806.m45029("ۧۗ") ^ i9;
                        i12 = iM450212 ^ (-1306104754);
                        i11 = ((iM450212 ^ i10) * 2525) ^ (-33300147);
                        activity2 = activity;
                    }
                    break;
                case 288979720:
                case 1063487876:
                    C1189.m4368();
                    return null;
                case 298359708:
                case 1363041343:
                    sArr3 = f20229;
                    i18 = 25;
                    i17 = 25;
                    if (C1419.f5860 < 0) {
                        iM45029 = C19806.m45029("ᩴ۫") ^ i9;
                        i4 = ((iM45029 ^ i10) * (-3315)) ^ (-1294362293);
                        i5 = 1426356487;
                        i12 = iM45029 ^ i5;
                        i11 = i4;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۙ") ^ i10) * (-21);
                        i13 = i13;
                        i = ((iM11306 ^ i9) * 1361) ^ 649663162;
                        i2 = 2048249709;
                        i3 = i13;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        i13 = i3;
                    }
                    break;
                case 345828447:
                case 1074483940:
                    if (C2249.m6915() > 0) {
                        i13 = i13;
                        iM11306 = C19806.m45029("ۧ᩹") ^ i9;
                        i = ((iM11306 ^ i10) * (-2995)) ^ (-912415813);
                        i2 = 707927282;
                        i3 = i13;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        i13 = i3;
                    } else {
                        i13 = i13;
                        iM11307 = ThreadFactoryC3888.m11306("ۙ۬") ^ i10;
                        i11 = ((iM11307 ^ i9) * (-4027)) ^ (-132624665);
                        i6 = 2024324909;
                        int i210 = iM11307 ^ i6;
                        i13 = i13;
                        i12 = i210;
                        activity2 = activity;
                    }
                    break;
                case 346700877:
                case 1716469867:
                    b = 1;
                    iM45029 = (ThreadFactoryC3888.m11306("ۘۗ") + i10) * 53;
                    i4 = ((iM45029 ^ i9) * (-12439)) ^ 2033625774;
                    i5 = 769669931;
                    i12 = iM45029 ^ i5;
                    i11 = i4;
                    break;
                case 474058339:
                case 1259407499:
                    if (C1460.m5058(className, C0671.m3009(sArr3, i18, i17, i7))) {
                        iM45029 = (i9 - ThreadFactoryC3888.m11306("֨᩶")) * (-99);
                        i4 = ((iM45029 ^ i10) * 3775) ^ 258211456;
                        i5 = -1119439204;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢۙ") ^ i9) * 83;
                        i4 = ((iM45029 ^ i10) * (-29229)) ^ 1366638382;
                        i5 = -6610389;
                    }
                    i12 = iM45029 ^ i5;
                    i11 = i4;
                    break;
                case 474516419:
                case 1044983814:
                    i13 = i13;
                    if (C0629.m2899(list)) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۖۢ") ^ i9) * (-35);
                        i = ((iM11306 ^ i10) * 24955) ^ 1479964529;
                        i2 = -1221807872;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴܳ") ^ i10;
                        i = ((iM11306 ^ i9) * (-19365)) ^ (-48450058);
                        i2 = 1529723355;
                    }
                    i3 = i13;
                    i12 = iM11306 ^ i2;
                    i11 = i;
                    i13 = i3;
                    break;
                case 499102212:
                case 1247057770:
                    C1148.m4232();
                    C1419.m4973();
                    i13 = i13;
                    iM11307 = ThreadFactoryC3888.m11306("ܿ᩺") ^ i9;
                    i11 = ((iM11307 ^ i10) * (-3841)) ^ (-309309199);
                    i6 = 1484737920;
                    int i211 = iM11307 ^ i6;
                    i13 = i13;
                    i12 = i211;
                    activity2 = activity;
                    break;
                case 507348421:
                case 914901361:
                    i13 = i13;
                    i20 = i19 + 161849284;
                    if (C1668.f6641 < 0) {
                        iM11306 = (i10 - ThreadFactoryC3888.m11306("ۛᩳ")) * (-113);
                        i = ((iM11306 ^ i9) * (-10615)) ^ 472229028;
                        i2 = -449098910;
                        i3 = i13;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        i13 = i3;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۙ۬") ^ i10;
                        i11 = ((iM11307 ^ i9) * (-4027)) ^ (-132624665);
                        i6 = 2024324909;
                        int i212 = iM11307 ^ i6;
                        i13 = i13;
                        i12 = i212;
                        activity2 = activity;
                    }
                    break;
                case 688590794:
                case 1668555027:
                    if (!RunnableC3388.m10064()) {
                        i13 = i13;
                        iM11307 = ThreadFactoryC3888.m11306("ۙ۬") ^ i10;
                        i11 = ((iM11307 ^ i9) * (-4027)) ^ (-132624665);
                        i6 = 2024324909;
                        int i213 = iM11307 ^ i6;
                        i13 = i13;
                        i12 = i213;
                        activity2 = activity;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۛۙ") ^ i10) * (-21);
                        i13 = i13;
                        i = ((iM11306 ^ i9) * 1361) ^ 649663162;
                        i2 = 2048249709;
                        i3 = i13;
                        i12 = iM11306 ^ i2;
                        i11 = i;
                        i13 = i3;
                    }
                    break;
                case 701632524:
                case 1043110407:
                    b = -1;
                    iM45029 = (ThreadFactoryC3888.m11306("ۘۗ") + i10) * 53;
                    i4 = ((iM45029 ^ i9) * (-12439)) ^ 2033625774;
                    i5 = 769669931;
                    i12 = iM45029 ^ i5;
                    i11 = i4;
                    break;
                case 1491675933:
                case 1565270566:
                    i13 = i13;
                    c = 0;
                    if (C19806.f63586) {
                        iM11307 = ThreadFactoryC3888.m11306("ۙ۬") ^ i10;
                        i11 = ((iM11307 ^ i9) * (-4027)) ^ (-132624665);
                        i6 = 2024324909;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ۧ᩷") ^ i10;
                        i11 = ((iM11307 ^ i9) * (-1681)) ^ (-1209462397);
                        i6 = 267105689;
                    }
                    int i214 = iM11307 ^ i6;
                    i13 = i13;
                    i12 = i214;
                    activity2 = activity;
                    break;
                default:
                    componentName2 = null;
                    iM11306 = (ThreadFactoryC3888.m11306("ۨ۬") ^ i9) * 57;
                    i = ((iM11306 ^ i10) * (-929)) ^ 839023724;
                    i2 = -1229144252;
                    i3 = i13;
                    i12 = iM11306 ^ i2;
                    i11 = i;
                    i13 = i3;
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x011c, code lost:
    
        if (l.C2871.m8646() == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m16219(android.app.ActivityManager.AppTask r33) {
        /*
            Method dump skipped, instruction units count: 1948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC5947.m16219(android.app.ActivityManager$AppTask):boolean");
    }
}
