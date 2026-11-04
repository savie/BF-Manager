package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩷۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71K9 */
/* JADX INFO: loaded from: classes.dex */
public final class C21926 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static String f70792;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static String f70793;

    /* JADX INFO: renamed from: ۫ۧۙ, reason: not valid java name and contains not printable characters */
    private static final short[] f70794 = {2836, -15685, -8414, 13648, 14594, -15738, -8087, -6358, -15854, 15795, -5930, -13925, -11742, -11494, -5862, -5564, 14583, -5762, 9808, 13244, -13512, 15864, 12697, 13305, -14911, 7344, 19152, 19167, 19162, 19155, 19163, 19161, 19154, 19155, 19161, 19142, 19138, 19165, 19155, 19155, 19142, 19191, 19142, 19165, 19173, 19167, 19153, 19188, 19162, 19161, 19157, 19165, 4179, 31028, 27411, 21169, 28591, 30369, 29855, 26706, 23765, -28309, 26412, 26002, -32264, 7105, -4234, -12180, 14118, 11804, 14011, -6650, -18242, -18242, -18188, -18187, -18200, 8164, 15147, -11801, 8675, -20939, -20931, -20932, 11066, -15241, 15737, -310, -11835, -10036, 8233, -7695, 15929, 14135, -9283, -2642, 13293, 8457, -12058, 7701, 10309, 10306, 10304, 10308, 10308, 10308, 5024, 16721, -20741, -30167, -32428, -16493, -24888, 16658, 23832, -30692, -18212, -24488, 20228};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public TextView f70795;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C23255 f70796;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f70797;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TextView f70798;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C8614 f70799;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f70800;

    /* JADX WARN: Code duplicated, block: B:39:0x0122 A[PHI: r17
      0x0122: PHI (r17v20 int) = (r17v14 int), (r17v21 int) binds: [B:37:0x011f, B:18:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0140 A[PHI: r17
      0x0140: PHI (r17v24 int) = (r17v13 int), (r17v25 int) binds: [B:41:0x013e, B:9:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0167 A[PHI: r8 r9 r17 r18 r19
      0x0167: PHI (r8v3 short[]) = (r8v1 short[]), (r8v1 short[]), (r8v1 short[]), (r8v2 short[]), (r8v1 short[]) binds: [B:45:0x0165, B:37:0x011f, B:29:0x00e2, B:22:0x00a7, B:9:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0167: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v1 int), (r9v2 int), (r9v1 int) binds: [B:45:0x0165, B:37:0x011f, B:29:0x00e2, B:22:0x00a7, B:9:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0167: PHI (r17v23 int) = (r17v10 int), (r17v14 int), (r17v16 int), (r17v19 int), (r17v25 int) binds: [B:45:0x0165, B:37:0x011f, B:29:0x00e2, B:22:0x00a7, B:9:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0167: PHI (r18v3 char) = (r18v2 char), (r18v1 char), (r18v1 char), (r18v1 char), (r18v1 char) binds: [B:45:0x0165, B:37:0x011f, B:29:0x00e2, B:22:0x00a7, B:9:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0167: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:45:0x0165, B:37:0x011f, B:29:0x00e2, B:22:0x00a7, B:9:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01ff A[PHI: r1 r6 r10 r11 r12 r13 r17
      0x01ff: PHI (r1v3 short) = (r1v2 short), (r1v1 short), (r1v1 short), (r1v1 short), (r1v1 short) binds: [B:59:0x01fd, B:55:0x01dd, B:49:0x019b, B:41:0x013e, B:26:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x01ff: PHI (r6v3 int) = (r6v1 int), (r6v1 int), (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:59:0x01fd, B:55:0x01dd, B:49:0x019b, B:41:0x013e, B:26:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x01ff: PHI (r10v2 int) = (r10v1 int), (r10v1 int), (r10v1 int), (r10v1 int), (r10v3 int) binds: [B:59:0x01fd, B:55:0x01dd, B:49:0x019b, B:41:0x013e, B:26:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x01ff: PHI (r11v3 short[]) = (r11v1 short[]), (r11v2 short[]), (r11v1 short[]), (r11v1 short[]), (r11v1 short[]) binds: [B:59:0x01fd, B:55:0x01dd, B:49:0x019b, B:41:0x013e, B:26:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x01ff: PHI (r12v3 int) = (r12v1 int), (r12v2 int), (r12v1 int), (r12v1 int), (r12v1 int) binds: [B:59:0x01fd, B:55:0x01dd, B:49:0x019b, B:41:0x013e, B:26:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x01ff: PHI (r13v3 int) = (r13v1 int), (r13v2 int), (r13v1 int), (r13v1 int), (r13v1 int) binds: [B:59:0x01fd, B:55:0x01dd, B:49:0x019b, B:41:0x013e, B:26:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x01ff: PHI (r17v17 int) = (r17v6 int), (r17v7 int), (r17v9 int), (r17v13 int), (r17v18 int) binds: [B:59:0x01fd, B:55:0x01dd, B:49:0x019b, B:41:0x013e, B:26:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x025b A[PHI: r2 r3 r4 r5
      0x025b: PHI (r2v53 int) = (r2v28 int), (r2v1 int), (r2v58 int) binds: [B:34:0x00ff, B:12:0x005a, B:6:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r3v3 int) = (r3v1 int), (r3v2 int), (r3v1 int) binds: [B:34:0x00ff, B:12:0x005a, B:6:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r4v3 int) = (r4v2 int), (r4v1 int), (r4v1 int) binds: [B:34:0x00ff, B:12:0x005a, B:6:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r5v3 short) = (r5v2 short), (r5v1 short), (r5v1 short) binds: [B:34:0x00ff, B:12:0x005a, B:6:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        int iM2761;
        int i;
        int i2;
        int i3;
        int i4;
        short s = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short s2 = 0;
        int i8 = 0;
        int i9 = 0;
        short[] sArr = null;
        int i10 = 0;
        int i11 = 0;
        short[] sArr2 = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 665772041;
        int i15 = C3734.f12817;
        int i16 = C1783.f6087;
        int iM3169 = C0773.m3169("ۛۨ") ^ i15;
        int i17 = ((iM3169 ^ i16) * 11893) ^ 980334486;
        int i18 = iM3169 ^ 868631554;
        short[] sArr3 = null;
        char c = 0;
        while (true) {
            i14 = i18 ^ (i17 & (((i14 ^ i16) * (-4105)) >> 31));
            switch (i14) {
                case -2091273833:
                case 2138892521:
                    i5 = i5;
                    if ((i8 * i8) - i7 > 0) {
                        iM2761 = C0619.m2761("ۡ᩺") ^ i15;
                        i = ((iM2761 ^ i16) * (-17631)) ^ (-1377858979);
                        i2 = 1880402214;
                    } else {
                        iM2761 = C0619.m2761("ۨۘ") ^ i16;
                        i = ((iM2761 ^ i15) * 32443) ^ (-823040798);
                        i2 = -673560359;
                    }
                    int i19 = i5;
                    i18 = iM2761 ^ i2;
                    i17 = i;
                    i5 = i19;
                    break;
                case -1932520324:
                case -357141350:
                    i5 = i5;
                    s = sArr3[c];
                    if (C2966.f9654 >= 0) {
                        iM2761 = (C0619.m2761("ܿۚ") ^ i16) * 123;
                        i = ((iM2761 ^ i15) * 23685) ^ 993947199;
                        i2 = -141513136;
                    } else {
                        iM2761 = C0773.m3169("۠۟") ^ i15;
                        i = ((iM2761 ^ i16) * (-16241)) ^ (-727127212);
                        i2 = -1088813116;
                    }
                    int i110 = i5;
                    i18 = iM2761 ^ i2;
                    i17 = i;
                    i5 = i110;
                    break;
                case -1734892985:
                case 893256933:
                    i5 = i5;
                    sArr2 = f70794;
                    i12 = 101;
                    i13 = 5;
                    if (C3448.f11240 >= 0) {
                        iM2761 = (C0619.m2761("ܿۚ") ^ i16) * 123;
                        i = ((iM2761 ^ i15) * 23685) ^ 993947199;
                        i2 = -141513136;
                    } else {
                        iM2761 = (C0773.m3169("ۛ᩸") ^ i15) * (-9);
                        i = ((iM2761 ^ i16) * (-17753)) ^ 1357147218;
                        i2 = -31047097;
                    }
                    int i111 = i5;
                    i18 = iM2761 ^ i2;
                    i17 = i;
                    i5 = i111;
                    break;
                case -1645281825:
                case -1483604040:
                    i3 = 10356;
                    int iM2762 = (C0619.m2761("ᩳۢ") + i15) * 7;
                    i2 = 2062830311;
                    i9 = i3;
                    iM2761 = iM2762;
                    i = ((iM2762 ^ i16) * (-13637)) ^ (-798228815);
                    int i112 = i5;
                    i18 = iM2761 ^ i2;
                    i17 = i;
                    i5 = i112;
                    break;
                case -1642183246:
                case -617759113:
                    i5 = i5;
                    i8 = s + s2;
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (C0619.m2761("ܿۚ") ^ i16) * 123;
                        i = ((iM2761 ^ i15) * 23685) ^ 993947199;
                        i2 = -141513136;
                    } else {
                        iM2761 = C0773.m3169("᩸ܳ") ^ i15;
                        i = ((iM2761 ^ i16) * 139) ^ (-693673726);
                        i2 = 373965973;
                    }
                    int i113 = i5;
                    i18 = iM2761 ^ i2;
                    i17 = i;
                    i5 = i113;
                    break;
                case -1495903786:
                case 356659658:
                    i5 = i5;
                    sArr3 = f70794;
                    c = 'c';
                    if (C1343.m4943()) {
                        iM2761 = (C0773.m3169("ۙ᩶") ^ i16) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2761 ^ i15) * (-25613)) ^ (-1322163880);
                        i2 = -1643911665;
                    } else {
                        iM2761 = C0619.m2761("ۖۖ") ^ i16;
                        i = ((iM2761 ^ i15) * (-27003)) ^ 1335620694;
                        i2 = -1075501069;
                    }
                    int i114 = i5;
                    i18 = iM2761 ^ i2;
                    i17 = i;
                    i5 = i114;
                    break;
                case -1260905523:
                case -452687834:
                    i3 = 21798;
                    int iM2763 = (C0619.m2761("ᩳۢ") + i15) * 7;
                    i2 = 2062830311;
                    i9 = i3;
                    iM2761 = iM2763;
                    i = ((iM2763 ^ i16) * (-13637)) ^ (-798228815);
                    int i115 = i5;
                    i18 = iM2761 ^ i2;
                    i17 = i;
                    i5 = i115;
                    break;
                case -1069557447:
                case -458570807:
                    i5 = i5;
                    C0269.m1775();
                    if (RunnableC3646.f12471) {
                        iM2761 = (C0619.m2761("ܿۚ") ^ i16) * 123;
                        i = ((iM2761 ^ i15) * 23685) ^ 993947199;
                        i2 = -141513136;
                    } else {
                        iM2761 = C0773.m3169("᩵۬") ^ i16;
                        i = ((iM2761 ^ i15) * (-18709)) ^ (-1250230101);
                        i2 = 1364309361;
                    }
                    int i116 = i5;
                    i18 = iM2761 ^ i2;
                    i17 = i;
                    i5 = i116;
                    break;
                case -935922701:
                case 459728784:
                    i5 = i5;
                    if (C13473.m33144()) {
                        iM2761 = C0619.m2761("ۖۖ") ^ i16;
                        i = ((iM2761 ^ i15) * (-27003)) ^ 1335620694;
                        i2 = -1075501069;
                    } else {
                        iM2761 = C0619.m2761("۠ۡ") ^ i15;
                        i = ((iM2761 ^ i16) * 19721) ^ (-2101556342);
                        i2 = -1053975683;
                    }
                    int i117 = i5;
                    i18 = iM2761 ^ i2;
                    i17 = i;
                    i5 = i117;
                    break;
                case -875252715:
                case -556338449:
                    i5 = i5;
                    i7 = i6 + i6;
                    s2 = 18844;
                    if (C0269.f1558 <= 0) {
                        i5 = i5;
                        iM2761 = (C0773.m3169("ܰܿ") + i15) * 79;
                        i4 = ((iM2761 ^ i16) * 29315) ^ (-1880106726);
                        i2 = -455341455;
                        int i20 = i5;
                        i = i4;
                        s = s;
                        i5 = i20;
                    } else {
                        iM2761 = C0773.m3169("ۜ֡") ^ i16;
                        i = ((iM2761 ^ i15) * 31449) ^ (-860407105);
                        i2 = -735382015;
                    }
                    int i118 = i5;
                    i18 = iM2761 ^ i2;
                    i17 = i;
                    i5 = i118;
                    break;
                case -170814267:
                case 1806853592:
                    C1564.m5509();
                    throw new RuntimeException();
                case 132090353:
                case 1413319109:
                    i5 = i5;
                    C1343.m4943();
                    RunnableC0334.m2063();
                    iM2761 = C0619.m2761("ۖۖ") ^ i16;
                    i = ((iM2761 ^ i15) * (-27003)) ^ 1335620694;
                    i2 = -1075501069;
                    int i119 = i5;
                    i18 = iM2761 ^ i2;
                    i17 = i;
                    i5 = i119;
                    break;
                case 133940613:
                case 1884738063:
                    i5 = i5;
                    i11 = 1;
                    if (C1321.f4751 >= 0) {
                        iM2761 = (C0619.m2761("ܿۚ") ^ i16) * 123;
                        i = ((iM2761 ^ i15) * 23685) ^ 993947199;
                        i2 = -141513136;
                    } else {
                        iM2761 = (C0619.m2761("᩵᩹") + i16) * (-73);
                        i = ((iM2761 ^ i15) * 67) ^ (-167015655);
                        i2 = -1248515090;
                    }
                    int i1110 = i5;
                    i18 = iM2761 ^ i2;
                    i17 = i;
                    i5 = i1110;
                    break;
                case 158784276:
                case 1769474143:
                    i5 = i5;
                    sArr = f70794;
                    i10 = 100;
                    if (RunnableC3646.f12471) {
                        iM2761 = C0619.m2761("ۖۖ") ^ i16;
                        i = ((iM2761 ^ i15) * (-27003)) ^ 1335620694;
                        i2 = -1075501069;
                    } else {
                        iM2761 = C0619.m2761("᩶۫") ^ i16;
                        i = ((iM2761 ^ i15) * (-27709)) ^ 1780558180;
                        i2 = 979468492;
                    }
                    int i1111 = i5;
                    i18 = iM2761 ^ i2;
                    i17 = i;
                    i5 = i1111;
                    break;
                case 432578348:
                case 1669953528:
                    i5 = i5;
                    f70792 = C2834.m9343(sArr, i10, i11, i9);
                    if (C3998.f13671 != 0) {
                        iM2761 = C0619.m2761("۠ۡ") ^ i15;
                        i = ((iM2761 ^ i16) * 19721) ^ (-2101556342);
                        i2 = -1053975683;
                    } else {
                        iM2761 = C0619.m2761("᩷ۜ") ^ i15;
                        i = ((iM2761 ^ i16) * (-25587)) ^ 1906745888;
                        i2 = -1607601895;
                    }
                    int i1112 = i5;
                    i18 = iM2761 ^ i2;
                    i17 = i;
                    i5 = i1112;
                    break;
                case 1011392475:
                case 1232750255:
                    f70793 = C1826.m6310(sArr2, i12, i13, i9);
                    return;
                case 1051926478:
                case 1940080187:
                    i6 = i5 + 355096336;
                    if (C3099.f10023 <= 0) {
                        iM2761 = (C0773.m3169("ܰܿ") + i15) * 79;
                        i4 = ((iM2761 ^ i16) * 29315) ^ (-1880106726);
                        i2 = -455341455;
                        int i21 = i5;
                        i = i4;
                        s = s;
                        i5 = i21;
                    } else {
                        iM2761 = C0619.m2761("۠ۢ") ^ i15;
                        i5 = i5;
                        i = ((iM2761 ^ i16) * 22417) ^ (-594327705);
                        i2 = 1589946030;
                    }
                    int i1113 = i5;
                    i18 = iM2761 ^ i2;
                    i17 = i;
                    i5 = i1113;
                    break;
                case 1336776654:
                case 1355863023:
                    i5 = i5;
                    if (C3734.f12817 >= 0) {
                        iM2761 = C0619.m2761("ۖۖ") ^ i16;
                        i = ((iM2761 ^ i15) * (-27003)) ^ 1335620694;
                        i2 = -1075501069;
                    } else {
                        iM2761 = C0773.m3169("᩵۬") ^ i16;
                        i = ((iM2761 ^ i15) * (-18709)) ^ (-1250230101);
                        i2 = 1364309361;
                    }
                    int i1114 = i5;
                    i18 = iM2761 ^ i2;
                    i17 = i;
                    i5 = i1114;
                    break;
                default:
                    i5 = s * s;
                    if (C2288.f7433 <= 0) {
                        iM2761 = (C0773.m3169("ܰܿ") + i15) * 79;
                        i4 = ((iM2761 ^ i16) * 29315) ^ (-1880106726);
                        i2 = -455341455;
                    } else {
                        iM2761 = C0773.m3169("ۨ۬") ^ i16;
                        i4 = ((iM2761 ^ i15) * 8393) ^ (-1879229162);
                        i2 = 1955048252;
                    }
                    int i22 = i5;
                    i = i4;
                    s = s;
                    i5 = i22;
                    int i1115 = i5;
                    i18 = iM2761 ^ i2;
                    i17 = i;
                    i5 = i1115;
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0099, code lost:
    
        if (l.RunnableC0334.f1808 <= 0) goto L8;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m49618(l.C21926 r24, android.widget.Spinner r25, int r26, l.C9651 r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21926.m49618(l.᩷۠ۤ, android.widget.Spinner, int, l.ۡ᩷᩸, boolean):void");
    }

    public C21926(AbstractC22044 abstractC22044, final C8614 c8614, final String str) {
        int i;
        C23255 c23255;
        C23255 c23256;
        int i2;
        Spinner spinner;
        int i3;
        int i4;
        int iM3169;
        int i5;
        int i6;
        short[] sArr;
        int i7;
        int i8;
        short[] sArr2;
        int iM2761;
        int i9;
        int i10;
        int iM31610;
        int i11;
        int i12;
        int iM2762;
        int i13;
        int i14;
        int i15;
        short[] sArr3;
        C23255 c23257;
        DialogInterfaceC8327 dialogInterfaceC8327M23911 = null;
        int i16 = 398520757;
        int i17 = RunnableC0334.f1808;
        int i18 = C3033.f9831;
        short s = f70794[0];
        int i19 = (s * s) + 42680089;
        int i20 = s + 6533;
        int i21 = (i20 * i20) - (i19 + i19) <= 0 ? 48899 : 62336;
        int iM31611 = C0773.m3169("۬᩹") ^ i17;
        int i22 = ((iM31611 ^ i18) * 18129) ^ 1581851017;
        int i23 = iM31611 ^ (-1165481316);
        C23255 c23258 = null;
        DialogInterface.OnClickListener onClickListener = null;
        String str2 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        int i24 = 0;
        int iM2763 = 0;
        int iM31612 = 0;
        Main mainM2816 = null;
        int iM31613 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        Spinner spinner2 = null;
        C2361 c2361M3794 = null;
        short[] sArr8 = null;
        int i31 = 0;
        short[] sArr9 = null;
        View viewM11246 = null;
        View view = null;
        int i32 = i22;
        int i33 = 0;
        while (true) {
            i16 = i23 ^ (i32 & (((i16 ^ i18) * (-10127)) >> 31));
            switch (i16) {
                case -2145142683:
                case -400328533:
                    RunnableC0334.m2063();
                    RunnableC3646.m11813();
                    i = i33;
                    sArr5 = sArr5;
                    sArr9 = sArr9;
                    view = view;
                    i27 = i27;
                    i7 = i30;
                    sArr6 = sArr6;
                    c23256 = c23258;
                    i31 = i31;
                    sArr = sArr4;
                    int i34 = i28;
                    spinner = spinner2;
                    i3 = i29;
                    i4 = i34;
                    int iM31614 = C0773.m3169("ܺ᩵") ^ i17;
                    i21 = i21;
                    int i35 = ((iM31614 ^ i18) * (-30163)) ^ (-441895142);
                    i15 = iM31614 ^ 1338633557;
                    i32 = i35;
                    sArr4 = sArr;
                    i30 = i7;
                    view = view;
                    i31 = i31;
                    i21 = i21;
                    sArr5 = sArr5;
                    c23258 = c23256;
                    sArr6 = sArr6;
                    i27 = i27;
                    sArr9 = sArr9;
                    int i36 = i;
                    i23 = i15;
                    i33 = i36;
                    int i37 = i4;
                    i29 = i3;
                    spinner2 = spinner;
                    i28 = i37;
                    break;
                case -2099069189:
                case -1264392755:
                    int i38 = i33;
                    short[] sArr10 = sArr9;
                    int i39 = i27;
                    short[] sArr11 = sArr6;
                    C23255 c23259 = c23258;
                    int i40 = i31;
                    int i41 = i28;
                    spinner = spinner2;
                    i3 = i29;
                    i4 = i41;
                    View viewM9942 = RunnableC3055.m9942(mainM2816, iM31613);
                    int iM31615 = C0773.m3169(C2878.m9486(f70794, 4, 3, i21));
                    int iM31616 = C0773.m3169("ۗ֡") ^ i18;
                    i32 = ((iM31616 ^ i17) * 15717) ^ (-1339433496);
                    sArr5 = sArr5;
                    view = viewM9942;
                    i25 = iM31615;
                    i33 = i38;
                    i23 = iM31616 ^ (-1281462694);
                    i31 = i40;
                    c23258 = c23259;
                    sArr6 = sArr11;
                    i27 = i39;
                    sArr9 = sArr10;
                    int i42 = i4;
                    i29 = i3;
                    spinner2 = spinner;
                    i28 = i42;
                    break;
                case -1977267147:
                case 495580136:
                    i = i33;
                    int i43 = i27;
                    sArr9 = sArr9;
                    C23255 c232510 = c23258;
                    i8 = i31;
                    short[] sArr12 = sArr6;
                    c23256 = c232510;
                    int i44 = i28;
                    spinner = spinner2;
                    i3 = i29;
                    i4 = i44;
                    sArr6 = sArr12;
                    i27 = i43;
                    sArr2 = sArr5;
                    viewM11246 = C3448.m11246(view, C0619.m2761(C2023.m6966(sArr2, 7, 3, i21)) ^ 2119211599);
                    if (C2375.f7641 <= 0) {
                        iM2761 = (i17 - C0773.m3169("۬᩸")) * (-19);
                        i9 = ((iM2761 ^ i18) * (-4307)) ^ (-1493242498);
                        i10 = 1473546781;
                    } else {
                        iM2761 = C0619.m2761("ܿ۬") ^ i18;
                        i9 = ((iM2761 ^ i17) * 28945) ^ 587315641;
                        i10 = 1268734201;
                    }
                    i15 = iM2761 ^ i10;
                    i32 = i9;
                    sArr5 = sArr2;
                    i31 = i8;
                    c23258 = c23256;
                    sArr6 = sArr6;
                    i27 = i27;
                    sArr9 = sArr9;
                    int i310 = i;
                    i23 = i15;
                    i33 = i310;
                    int i311 = i4;
                    i29 = i3;
                    spinner2 = spinner;
                    i28 = i311;
                    break;
                case -1892211362:
                case -1201294273:
                    i21 = i21;
                    i = i33;
                    sArr5 = sArr5;
                    sArr9 = sArr9;
                    view = view;
                    i27 = i27;
                    sArr6 = sArr6;
                    c23256 = c23258;
                    i31 = i31;
                    int i45 = i28;
                    spinner = spinner2;
                    i3 = i29;
                    i4 = i45;
                    this.f70797 = 0;
                    this.f70799 = c8614;
                    this.f70800 = abstractC22044;
                    mainM2816 = AbstractC0641.m2816(c8614);
                    sArr4 = f70794;
                    i30 = 1;
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0619.m2761("ۖܶ") ^ i18;
                        i5 = ((iM3169 ^ i17) * (-11277)) ^ 663868744;
                        i6 = -1952216402;
                    } else {
                        iM3169 = (C0773.m3169("֨᩹") + i18) * 67;
                        i5 = ((iM3169 ^ i17) * (-13163)) ^ (-1708253659);
                        i6 = -1356620805;
                    }
                    i15 = iM3169 ^ i6;
                    i32 = i5;
                    view = view;
                    i31 = i31;
                    i21 = i21;
                    sArr5 = sArr5;
                    c23258 = c23256;
                    sArr6 = sArr6;
                    i27 = i27;
                    sArr9 = sArr9;
                    int i312 = i;
                    i23 = i15;
                    i33 = i312;
                    int i313 = i4;
                    i29 = i3;
                    spinner2 = spinner;
                    i28 = i313;
                    break;
                case -1646440137:
                case -672188891:
                    i = i33;
                    Spinner spinner3 = spinner2;
                    c23255 = c23258;
                    i31 = i31;
                    this.f70796 = c23255;
                    sArr9 = f70794;
                    i29 = 3;
                    if (!RunnableC1848.f6235) {
                        int iM2764 = (C0619.m2761("۠ۤ") ^ i17) * 97;
                        int i46 = ((iM2764 ^ i18) * (-4701)) ^ (-1913828184);
                        i2 = iM2764 ^ (-1532115450);
                        i32 = i46;
                        spinner2 = spinner3;
                        i31 = i31;
                        i28 = 13;
                        c23258 = c23255;
                        i33 = i;
                        i23 = i2;
                    } else {
                        spinner2 = spinner3;
                        sArr9 = sArr9;
                        i28 = 13;
                        sArr3 = sArr6;
                        c23257 = c23255;
                        int iM2765 = (C0619.m2761("ܳۧ") ^ i17) * 5;
                        i32 = ((iM2765 ^ i18) * (-9923)) ^ (-1565099829);
                        i31 = i31;
                        c23258 = c23257;
                        sArr6 = sArr3;
                        i27 = i27;
                        sArr9 = sArr9;
                        int i47 = i;
                        i23 = iM2765 ^ (-940844071);
                        i33 = i47;
                    }
                    break;
                case -1609927405:
                case 1686073892:
                    if (RunnableC0334.f1808 <= 0) {
                        i = i33;
                        sArr2 = sArr5;
                        sArr9 = sArr9;
                        i27 = i27;
                        sArr6 = sArr6;
                        c23256 = c23258;
                        i8 = i31;
                        int i48 = i28;
                        spinner = spinner2;
                        i3 = i29;
                        i4 = i48;
                        iM2761 = (i17 - C0773.m3169("۬᩸")) * (-19);
                        i9 = ((iM2761 ^ i18) * (-4307)) ^ (-1493242498);
                        i10 = 1473546781;
                        i15 = iM2761 ^ i10;
                        i32 = i9;
                        sArr5 = sArr2;
                        i31 = i8;
                        c23258 = c23256;
                        sArr6 = sArr6;
                        i27 = i27;
                        sArr9 = sArr9;
                        int i314 = i;
                        i23 = i15;
                        i33 = i314;
                        int i315 = i4;
                        i29 = i3;
                        spinner2 = spinner;
                        i28 = i315;
                    } else {
                        iM2762 = (C0773.m3169("ܶۧ") + i18) * (-95);
                        i13 = ((iM2762 ^ i17) * 14851) ^ 194693970;
                        i14 = 2094696350;
                        i23 = iM2762 ^ i14;
                        i32 = i13;
                    }
                    break;
                case -1539072802:
                case -891980785:
                    i = i33;
                    sArr9 = sArr9;
                    c23255 = c23258;
                    i31 = i31;
                    int i49 = i28;
                    spinner = spinner2;
                    i3 = i29;
                    i4 = i49;
                    this.f70795 = (TextView) viewM11246;
                    sArr6 = f70794;
                    i27 = 10;
                    i26 = 3;
                    if (C2485.f7950 == 0) {
                        iM31610 = C0773.m3169("ۧܺ") ^ i17;
                        i11 = ((iM31610 ^ i18) * (-13699)) ^ (-1446227614);
                        i12 = 1319881891;
                        int i50 = iM31610 ^ i12;
                        i32 = i11;
                        sArr9 = sArr9;
                        int i51 = i31;
                        c23258 = c23255;
                        i33 = i;
                        i23 = i50;
                        i31 = i51;
                        int i316 = i4;
                        i29 = i3;
                        spinner2 = spinner;
                        i28 = i316;
                    } else {
                        i21 = i21;
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        i27 = 10;
                        c23256 = c23255;
                        view = view;
                        iM3169 = C0619.m2761("ۖܶ") ^ i18;
                        i5 = ((iM3169 ^ i17) * (-11277)) ^ 663868744;
                        i6 = -1952216402;
                        i15 = iM3169 ^ i6;
                        i32 = i5;
                        view = view;
                        i31 = i31;
                        i21 = i21;
                        sArr5 = sArr5;
                        c23258 = c23256;
                        sArr6 = sArr6;
                        i27 = i27;
                        sArr9 = sArr9;
                        int i317 = i;
                        i23 = i15;
                        i33 = i317;
                        int i318 = i4;
                        i29 = i3;
                        spinner2 = spinner;
                        i28 = i318;
                    }
                    break;
                case -1384650183:
                case 1777450186:
                    i = i33;
                    sArr5 = sArr5;
                    sArr9 = sArr9;
                    i27 = i27;
                    sArr6 = sArr6;
                    c23256 = c23258;
                    i31 = i31;
                    int i52 = i28;
                    spinner = spinner2;
                    i3 = i29;
                    i4 = i52;
                    view = view;
                    sArr = sArr4;
                    i7 = i30;
                    iM31613 = C0773.m3169(C3099.m10092(sArr, i7, 3, i21)) ^ 2129206903;
                    if (C1564.f5401 > 0) {
                        int i53 = i21;
                        int iM2766 = C0619.m2761("ܳ᩺") ^ i17;
                        i32 = ((iM2766 ^ i18) * 32405) ^ (-779371556);
                        sArr4 = sArr;
                        i30 = i7;
                        view = view;
                        i31 = i31;
                        i33 = i;
                        i23 = iM2766 ^ (-1218594413);
                        sArr5 = sArr5;
                        c23258 = c23256;
                        sArr6 = sArr6;
                        i27 = i27;
                        sArr9 = sArr9;
                        i21 = i53;
                        int i410 = i4;
                        i29 = i3;
                        spinner2 = spinner;
                        i28 = i410;
                    } else {
                        int iM31617 = C0773.m3169("ܺ᩵") ^ i17;
                        i21 = i21;
                        int i319 = ((iM31617 ^ i18) * (-30163)) ^ (-441895142);
                        i15 = iM31617 ^ 1338633557;
                        i32 = i319;
                        sArr4 = sArr;
                        i30 = i7;
                        view = view;
                        i31 = i31;
                        i21 = i21;
                        sArr5 = sArr5;
                        c23258 = c23256;
                        sArr6 = sArr6;
                        i27 = i27;
                        sArr9 = sArr9;
                        int i3110 = i;
                        i23 = i15;
                        i33 = i3110;
                        int i3111 = i4;
                        i29 = i3;
                        spinner2 = spinner;
                        i28 = i3111;
                    }
                    break;
                case -1352756265:
                case -337800036:
                    C0938.m3745(c8614, dialogInterfaceC8327M23911, str);
                    final Spinner spinner4 = spinner2;
                    final DialogInterfaceC8327 dialogInterfaceC8327 = dialogInterfaceC8327M23911;
                    C2375.m8070(AbstractC0641.m2817(dialogInterfaceC8327M23911), new View.OnClickListener(this) { // from class: l.ܿۖۤ

                        /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C21926 f59016;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            C8614 c8615 = null;
                            String str3 = null;
                            C21926 c21926 = null;
                            Spinner spinner5 = null;
                            int i54 = -637661345;
                            int i55 = C1783.f6087;
                            int i56 = AbstractC0641.f2496;
                            int iM31618 = (C0773.m3169("᩵ᩴ") ^ i56) * 85;
                            int i57 = ((iM31618 ^ i55) * (-15289)) ^ (-1594893384);
                            int i58 = -653778811;
                            while (true) {
                                i54 = ((((i54 ^ i55) * (-12425)) >> 31) & i57) ^ (iM31618 ^ i58);
                                switch (i54) {
                                    case -2146010803:
                                    case 1691629984:
                                        if (C2023.m6964() <= 0) {
                                            iM31618 = (C0619.m2761("ܳۚ") ^ i56) * 9;
                                            i57 = ((iM31618 ^ i55) * (-5417)) ^ (-634422197);
                                            i58 = 1089922290;
                                        } else {
                                            iM31618 = C0619.m2761("᩺ܰ") ^ i55;
                                            i57 = ((iM31618 ^ i56) * 22493) ^ 1905190339;
                                            i58 = -388431074;
                                        }
                                        break;
                                    case -1871091049:
                                    case 1389753690:
                                        if (C4282.f15546 > 0) {
                                            iM31618 = (C0619.m2761("ܳۚ") ^ i56) * 9;
                                            i57 = ((iM31618 ^ i55) * (-5417)) ^ (-634422197);
                                            i58 = 1089922290;
                                        } else {
                                            iM31618 = C0619.m2761("֡۠") ^ i55;
                                            i57 = ((iM31618 ^ i56) * 3355) ^ 601926030;
                                            i58 = 1308107528;
                                        }
                                        break;
                                    case -1630940867:
                                    case -1067517004:
                                        if (C2288.f7433 <= 0) {
                                            iM31618 = C0619.m2761("֡۠") ^ i55;
                                            i57 = ((iM31618 ^ i56) * 3355) ^ 601926030;
                                            i58 = 1308107528;
                                        } else {
                                            iM31618 = (C0619.m2761("ۡᩳ") + i55) * (-9);
                                            i57 = ((iM31618 ^ i56) * (-3971)) ^ (-1746058312);
                                            i58 = 562476162;
                                        }
                                        break;
                                    case -1585973393:
                                    case -407103751:
                                        C2310.m7813();
                                        C0619.m2763();
                                        iM31618 = C0619.m2761("֡۠") ^ i55;
                                        i57 = ((iM31618 ^ i56) * 3355) ^ 601926030;
                                        i58 = 1308107528;
                                        break;
                                    case -1561439970:
                                    case 1188654391:
                                        if (C1343.f4799 != 0) {
                                            iM31618 = (C0773.m3169("۬ܶ") + i55) * 33;
                                            i57 = ((iM31618 ^ i56) * (-19471)) ^ 824704337;
                                            i58 = 1316447235;
                                        } else {
                                            iM31618 = C0619.m2761("ۙܺ") ^ i55;
                                            i57 = ((iM31618 ^ i56) * 15931) ^ (-67592433);
                                            i58 = 1223414935;
                                        }
                                        break;
                                    case -1216408919:
                                    case 301721093:
                                        if (AbstractC3624.f12429 <= 0) {
                                            iM31618 = C0619.m2761("֡۠") ^ i55;
                                            i57 = ((iM31618 ^ i56) * 3355) ^ 601926030;
                                            i58 = 1308107528;
                                        } else {
                                            iM31618 = C0619.m2761("ۖۛ") ^ i56;
                                            i57 = ((iM31618 ^ i55) * (-31499)) ^ (-938536252);
                                            i58 = -252255029;
                                        }
                                        break;
                                    case -1180616244:
                                    case 1294070234:
                                        c21926 = this.f59016;
                                        spinner5 = spinner4;
                                        if (C2966.f9654 >= 0) {
                                            iM31618 = C0619.m2761("֡۠") ^ i55;
                                            i57 = ((iM31618 ^ i56) * 3355) ^ 601926030;
                                            i58 = 1308107528;
                                        } else {
                                            iM31618 = (i56 - C0619.m2761("ܺ᩺")) * (-85);
                                            i57 = ((iM31618 ^ i55) * 8483) ^ (-1799822759);
                                            i58 = 311980134;
                                        }
                                        break;
                                    case -878535908:
                                    case 49507488:
                                        if (C1826.m6301() < 0) {
                                            iM31618 = (C0773.m3169("۬ܶ") + i55) * 33;
                                            i57 = ((iM31618 ^ i56) * (-19471)) ^ 824704337;
                                            i58 = 1316447235;
                                        } else {
                                            iM31618 = C0619.m2761("֡۠") ^ i55;
                                            i57 = ((iM31618 ^ i56) * 3355) ^ 601926030;
                                            i58 = 1308107528;
                                        }
                                        break;
                                    case -559326269:
                                    case -314275456:
                                        if (C13473.f42873 != 0) {
                                            iM31618 = (C0619.m2761("ܳۚ") ^ i56) * 9;
                                            i57 = ((iM31618 ^ i55) * (-5417)) ^ (-634422197);
                                            i58 = 1089922290;
                                        } else {
                                            iM31618 = (C0619.m2761("᩵ۡ") ^ i56) * (-117);
                                            i57 = ((iM31618 ^ i55) * 19531) ^ (-1287298055);
                                            i58 = 463171453;
                                        }
                                        break;
                                    case -330297930:
                                    case 130875297:
                                        RunnableC1848.m6360();
                                        break;
                                    case -239944855:
                                    case -168815808:
                                        C21926.m49619(c21926, spinner5, dialogInterfaceC8327, c8615, str3);
                                        break;
                                    case -35535230:
                                    case 318006083:
                                        str3 = str;
                                        if (RunnableC3646.f12471) {
                                            iM31618 = (i55 - C0773.m3169("۫ܳ")) * 95;
                                            i57 = ((iM31618 ^ i56) * (-14093)) ^ (-1923888964);
                                            i58 = 1115917294;
                                        } else {
                                            iM31618 = (C0773.m3169("᩹֫") ^ i55) * (-113);
                                            i57 = ((iM31618 ^ i56) * (-28297)) ^ 1020571700;
                                            i58 = 1890968902;
                                        }
                                        break;
                                    case 38905928:
                                    case 48195296:
                                        c8615 = c8614;
                                        if (C0773.m3161() != 0) {
                                            iM31618 = C0619.m2761("֡۠") ^ i55;
                                            i57 = ((iM31618 ^ i56) * 3355) ^ 601926030;
                                            i58 = 1308107528;
                                        } else {
                                            iM31618 = C0773.m3169("᩹ܿ") ^ i56;
                                            i57 = ((iM31618 ^ i55) * 15651) ^ (-2018015193);
                                            i58 = -1742549673;
                                        }
                                        break;
                                    case 983049101:
                                    case 2049158140:
                                        if (C23916.f77426 <= 0) {
                                            iM31618 = (C0619.m2761("ܳۚ") ^ i56) * 9;
                                            i57 = ((iM31618 ^ i55) * (-5417)) ^ (-634422197);
                                            i58 = 1089922290;
                                        } else {
                                            iM31618 = (C0619.m2761("ۢۖ") + i55) * 99;
                                            i57 = ((iM31618 ^ i56) * (-1361)) ^ (-2123699332);
                                            i58 = -710718984;
                                        }
                                        break;
                                    case 1182555342:
                                    case 1731816390:
                                        if (C13473.f42873 != 0) {
                                            iM31618 = C0619.m2761("֡۠") ^ i55;
                                            i57 = ((iM31618 ^ i56) * 3355) ^ 601926030;
                                            i58 = 1308107528;
                                        } else {
                                            iM31618 = (C0619.m2761("ۙ᩷") ^ i56) * (-93);
                                            i57 = ((iM31618 ^ i55) * 30009) ^ 624629359;
                                            i58 = 275008553;
                                        }
                                        break;
                                    default:
                                        if (C3998.f13671 != 0) {
                                            iM31618 = (C0773.m3169("۬ܶ") + i55) * 33;
                                            i57 = ((iM31618 ^ i56) * (-19471)) ^ 824704337;
                                            i58 = 1316447235;
                                        } else {
                                            iM31618 = C0773.m3169("ۖ۟") ^ i56;
                                            i57 = ((iM31618 ^ i55) * 17883) ^ 378898163;
                                            i58 = 1034575250;
                                        }
                                        break;
                                }
                                return;
                            }
                        }

                        {
                            int i54 = -392862266;
                            int i55 = C11235.f35427;
                            int i56 = C3033.f9831;
                            int iM2767 = (C0619.m2761("᩵᩻") + i55) * 49;
                            int i57 = ((iM2767 ^ i56) * (-20771)) ^ 1952212210;
                            int i58 = 1922234004;
                            while (true) {
                                i54 = ((((i54 ^ i56) * 21159) >> 31) & i57) ^ (iM2767 ^ i58);
                                switch (i54) {
                                    case -2071871980:
                                    case -158597380:
                                        if (C13473.f42873 != 0) {
                                            iM2767 = C0619.m2761("ۢ۟") ^ i55;
                                            i57 = ((iM2767 ^ i56) * 29839) ^ 1497023408;
                                            i58 = -530690866;
                                        } else {
                                            iM2767 = (i56 - C0773.m3169("֡۫")) * 35;
                                            i57 = ((iM2767 ^ i55) * 16681) ^ (-1116322547);
                                            i58 = -1077765090;
                                        }
                                        break;
                                    case -1979714403:
                                    case 146160789:
                                        if (C13473.m33144()) {
                                            iM2767 = (C0773.m3169("۫ۖ") + i56) * 99;
                                            i57 = ((iM2767 ^ i55) * 21691) ^ (-1189766590);
                                            i58 = -960604556;
                                        } else {
                                            iM2767 = C0619.m2761("᩺۬") ^ i55;
                                            i57 = ((iM2767 ^ i56) * (-28333)) ^ (-1791005514);
                                            i58 = -773366035;
                                        }
                                        break;
                                    case -1862392921:
                                    case 1096860136:
                                        if (C1519.f5300 >= 0) {
                                            iM2767 = C0619.m2761("᩺۬") ^ i55;
                                            i57 = ((iM2767 ^ i56) * (-28333)) ^ (-1791005514);
                                            i58 = -773366035;
                                        } else {
                                            iM2767 = (C0773.m3169("ᩴۛ") + i56) * 97;
                                            i57 = ((iM2767 ^ i55) * (-5897)) ^ (-1365131205);
                                            i58 = -350951324;
                                        }
                                        break;
                                    case -1619440360:
                                    case 1282120339:
                                        return;
                                    case -1084488752:
                                    case -456376588:
                                        if (AbstractC3624.m11755() != 0) {
                                            iM2767 = C0773.m3169("֨ۙ") ^ i56;
                                            i57 = ((iM2767 ^ i55) * (-21301)) ^ (-1287289929);
                                            i58 = -1510119006;
                                        } else {
                                            iM2767 = (C0773.m3169("֫᩶") ^ i56) * (-95);
                                            i57 = ((iM2767 ^ i55) * (-5565)) ^ 1985416090;
                                            i58 = -1828083494;
                                        }
                                        break;
                                    case -1019859175:
                                    case 1124488715:
                                        C2966.m9664();
                                        throw new RuntimeException();
                                    case -750058531:
                                    case -320730521:
                                        if (C3448.f11240 >= 0) {
                                            iM2767 = C0619.m2761("ۢ۟") ^ i55;
                                            i57 = ((iM2767 ^ i56) * 29839) ^ 1497023408;
                                            i58 = -530690866;
                                        } else {
                                            iM2767 = C0773.m3169("ۚۧ") ^ i55;
                                            i57 = ((iM2767 ^ i56) * 21223) ^ 1390634093;
                                            i58 = 1684608741;
                                        }
                                        break;
                                    case 101269351:
                                    case 1958907614:
                                        if (C2288.f7433 <= 0) {
                                            iM2767 = C0619.m2761("᩺۬") ^ i55;
                                            i57 = ((iM2767 ^ i56) * (-28333)) ^ (-1791005514);
                                            i58 = -773366035;
                                        } else {
                                            iM2767 = C0773.m3169("᩺ܺ") ^ i55;
                                            i57 = ((iM2767 ^ i56) * (-741)) ^ 132446511;
                                            i58 = -617089253;
                                        }
                                        break;
                                    case 636055898:
                                    case 1938196847:
                                        if (AbstractC0641.f2496 >= 0) {
                                            iM2767 = C0619.m2761("ۢ۟") ^ i55;
                                            i57 = ((iM2767 ^ i56) * 29839) ^ 1497023408;
                                            i58 = -530690866;
                                        } else {
                                            iM2767 = C0773.m3169("ۗ᩹") ^ i56;
                                            i57 = ((iM2767 ^ i55) * (-26517)) ^ (-141694297);
                                            i58 = -2110138771;
                                        }
                                        break;
                                    case 870237610:
                                    case 1238825039:
                                        if (C3033.f9831 >= 0) {
                                            iM2767 = C0619.m2761("ۢ۟") ^ i55;
                                            i57 = ((iM2767 ^ i56) * 29839) ^ 1497023408;
                                            i58 = -530690866;
                                        } else {
                                            iM2767 = C0619.m2761("ۗܿ") ^ i55;
                                            i57 = ((iM2767 ^ i56) * 30485) ^ (-1488540255);
                                            i58 = -746444300;
                                        }
                                        break;
                                    case 949364139:
                                    case 1243741241:
                                        C1321.m4852();
                                        if (C2966.f9654 < 0) {
                                            iM2767 = C0773.m3169("ۗ᩹") ^ i56;
                                            i57 = ((iM2767 ^ i55) * (-26517)) ^ (-141694297);
                                            i58 = -2110138771;
                                        } else {
                                            iM2767 = C0619.m2761("᩺۬") ^ i55;
                                            i57 = ((iM2767 ^ i56) * (-28333)) ^ (-1791005514);
                                            i58 = -773366035;
                                        }
                                        break;
                                    case 1064871180:
                                    case 1870599758:
                                        this.f59016 = this;
                                        if (C1826.f6190 <= 0) {
                                            iM2767 = C0619.m2761("ۢ۟") ^ i55;
                                            i57 = ((iM2767 ^ i56) * 29839) ^ 1497023408;
                                            i58 = -530690866;
                                        } else {
                                            iM2767 = C0773.m3169("ۙܽ") ^ i55;
                                            i57 = ((iM2767 ^ i56) * (-17665)) ^ (-830902366);
                                            i58 = 1982780964;
                                        }
                                        break;
                                    case 1096473850:
                                    case 1924965287:
                                        C2485.m8357();
                                        if (!C2023.f6737) {
                                            iM2767 = C0619.m2761("᩺۬") ^ i55;
                                            i57 = ((iM2767 ^ i56) * (-28333)) ^ (-1791005514);
                                            i58 = -773366035;
                                        } else {
                                            iM2767 = C0773.m3169("֨ۙ") ^ i56;
                                            i57 = ((iM2767 ^ i55) * (-21301)) ^ (-1287289929);
                                            i58 = -1510119006;
                                        }
                                        break;
                                    case 1536756790:
                                    case 1843731269:
                                        RunnableC1848.m6360();
                                        C1146.m4231();
                                        iM2767 = C0619.m2761("᩺۬") ^ i55;
                                        i57 = ((iM2767 ^ i56) * (-28333)) ^ (-1791005514);
                                        i58 = -773366035;
                                        break;
                                    case 1846342139:
                                    case 2117154046:
                                        if (C3690.f12684 <= 0) {
                                            iM2767 = C0773.m3169("ۗ᩹") ^ i56;
                                            i57 = ((iM2767 ^ i55) * (-26517)) ^ (-141694297);
                                            i58 = -2110138771;
                                        } else {
                                            iM2767 = C0773.m3169("ܺۜ") ^ i56;
                                            i57 = ((iM2767 ^ i55) * (-31319)) ^ 1375210950;
                                            i58 = 54447919;
                                        }
                                        break;
                                    default:
                                        if (C0619.m2763()) {
                                            iM2767 = (C0773.m3169("ܿۗ") ^ i56) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i57 = ((iM2767 ^ i55) * 4159) ^ 37538143;
                                            i58 = 752848429;
                                        } else {
                                            iM2767 = C0773.m3169("ۜ۫") ^ i55;
                                            i57 = ((iM2767 ^ i56) * 599) ^ (-553856276);
                                            i58 = -561417656;
                                        }
                                        break;
                                }
                            }
                        }
                    });
                    return;
                case -1053804250:
                case -104732435:
                    i = i33;
                    int i54 = i28;
                    c23255 = c23258;
                    i31 = i31;
                    spinner = spinner2;
                    i3 = i29;
                    short[] sArr13 = sArr9;
                    sArr9 = sArr13;
                    this.f70798 = (TextView) C2834.m9333(view, C0619.m2761(C13473.m33137(sArr13, i54, i3, i21)) ^ 2125105705);
                    if (!C17202.m40372()) {
                        i29 = i3;
                        spinner2 = spinner;
                        i28 = i54;
                        sArr3 = sArr6;
                        c23257 = c23255;
                        int iM2767 = (C0619.m2761("ܳۧ") ^ i17) * 5;
                        i32 = ((iM2767 ^ i18) * (-9923)) ^ (-1565099829);
                        i31 = i31;
                        c23258 = c23257;
                        sArr6 = sArr3;
                        i27 = i27;
                        sArr9 = sArr9;
                        int i411 = i;
                        i23 = iM2767 ^ (-940844071);
                        i33 = i411;
                    } else {
                        iM31610 = C0773.m3169("ᩳ۟") ^ i18;
                        i4 = i54;
                        i11 = ((iM31610 ^ i17) * 9765) ^ (-416955421);
                        i12 = -296726956;
                        int i55 = iM31610 ^ i12;
                        i32 = i11;
                        sArr9 = sArr9;
                        int i56 = i31;
                        c23258 = c23255;
                        i33 = i;
                        i23 = i55;
                        i31 = i56;
                        int i3112 = i4;
                        i29 = i3;
                        spinner2 = spinner;
                        i28 = i3112;
                    }
                    break;
                case -891147466:
                case -634547897:
                    c2361M3794 = C0950.m3794(AbstractC0641.m2816(c8614));
                    C1343.m4952(c2361M3794, view);
                    sArr7 = f70794;
                    i33 = 16;
                    i31 = 3;
                    iM2762 = (C0773.m3169("ᩴܶ") ^ i17) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i13 = ((iM2762 ^ i18) * (-3843)) ^ (-1235733892);
                    i14 = 793240460;
                    i23 = iM2762 ^ i14;
                    i32 = i13;
                    break;
                case -883906658:
                case 434249516:
                    C0619.m2763();
                    if (C3779.f12953 <= 0) {
                        i = i33;
                        c23256 = c23258;
                        int i57 = i28;
                        spinner = spinner2;
                        i3 = i29;
                        i4 = i57;
                        iM3169 = C0619.m2761("ۖܶ") ^ i18;
                        i5 = ((iM3169 ^ i17) * (-11277)) ^ 663868744;
                        i6 = -1952216402;
                        i15 = iM3169 ^ i6;
                        i32 = i5;
                        view = view;
                        i31 = i31;
                        i21 = i21;
                        sArr5 = sArr5;
                        c23258 = c23256;
                        sArr6 = sArr6;
                        i27 = i27;
                        sArr9 = sArr9;
                        int i3113 = i;
                        i23 = i15;
                        i33 = i3113;
                        int i3114 = i4;
                        i29 = i3;
                        spinner2 = spinner;
                        i28 = i3114;
                    } else {
                        iM2762 = (C0773.m3169("ܶۧ") + i18) * (-95);
                        i13 = ((iM2762 ^ i17) * 14851) ^ 194693970;
                        i14 = 2094696350;
                        i23 = iM2762 ^ i14;
                        i32 = i13;
                    }
                    break;
                case -849508467:
                case -284106806:
                    C2419.m8168(c2361M3794, iM2763, null);
                    String strM12149 = C3734.m12149(f70794, 19, 3, i21);
                    int iM2768 = C0619.m2761("ۚۤ") ^ i17;
                    i23 = iM2768 ^ 809607640;
                    str2 = strM12149;
                    i32 = ((iM2768 ^ i18) * 8091) ^ 1721015663;
                    onClickListener = null;
                    break;
                case 100566109:
                case 1423865415:
                    iM31612 = C0773.m3169(str2) ^ 2097999486;
                    sArr8 = f70794;
                    i24 = 22;
                    if (C3734.m12152() < 0) {
                        iM2762 = (C0773.m3169("᩸ᩴ") + i18) * (-9);
                        i13 = ((iM2762 ^ i17) * (-91)) ^ 1675812044;
                        i14 = -803425730;
                        i23 = iM2762 ^ i14;
                        i32 = i13;
                    } else {
                        i = i33;
                        sArr5 = sArr5;
                        sArr9 = sArr9;
                        view = view;
                        i27 = i27;
                        i7 = i30;
                        sArr6 = sArr6;
                        c23256 = c23258;
                        i31 = i31;
                        sArr = sArr4;
                        int i320 = i28;
                        spinner = spinner2;
                        i3 = i29;
                        i4 = i320;
                        int iM31618 = C0773.m3169("ܺ᩵") ^ i17;
                        i21 = i21;
                        int i3115 = ((iM31618 ^ i18) * (-30163)) ^ (-441895142);
                        i15 = iM31618 ^ 1338633557;
                        i32 = i3115;
                        sArr4 = sArr;
                        i30 = i7;
                        view = view;
                        i31 = i31;
                        i21 = i21;
                        sArr5 = sArr5;
                        c23258 = c23256;
                        sArr6 = sArr6;
                        i27 = i27;
                        sArr9 = sArr9;
                        int i3116 = i;
                        i23 = i15;
                        i33 = i3116;
                        int i3117 = i4;
                        i29 = i3;
                        spinner2 = spinner;
                        i28 = i3117;
                    }
                    break;
                case 254551174:
                case 1233042473:
                    iM2763 = C0619.m2761(C17202.m40377(sArr7, i33, i31, i21)) ^ 2098947491;
                    if (!C2966.m9664()) {
                        i = i33;
                        sArr5 = sArr5;
                        sArr9 = sArr9;
                        view = view;
                        i27 = i27;
                        i7 = i30;
                        sArr6 = sArr6;
                        c23256 = c23258;
                        i31 = i31;
                        sArr = sArr4;
                        int i321 = i28;
                        spinner = spinner2;
                        i3 = i29;
                        i4 = i321;
                        int iM31619 = C0773.m3169("ܺ᩵") ^ i17;
                        i21 = i21;
                        int i3118 = ((iM31619 ^ i18) * (-30163)) ^ (-441895142);
                        i15 = iM31619 ^ 1338633557;
                        i32 = i3118;
                        sArr4 = sArr;
                        i30 = i7;
                        view = view;
                        i31 = i31;
                        i21 = i21;
                        sArr5 = sArr5;
                        c23258 = c23256;
                        sArr6 = sArr6;
                        i27 = i27;
                        sArr9 = sArr9;
                        int i3119 = i;
                        i23 = i15;
                        i33 = i3119;
                        int i31110 = i4;
                        i29 = i3;
                        spinner2 = spinner;
                        i28 = i31110;
                    } else {
                        iM2762 = (C0619.m2761("۠ۚ") ^ i18) * (-111);
                        i13 = ((iM2762 ^ i17) * (-20503)) ^ (-986137360);
                        i14 = 846058205;
                        i23 = iM2762 ^ i14;
                        i32 = i13;
                    }
                    break;
                case 312327107:
                case 2064969567:
                    int i58 = i33;
                    int i59 = i31;
                    int i60 = i26;
                    short[] sArr14 = sArr6;
                    int i61 = i27;
                    int i62 = i28;
                    spinner = spinner2;
                    i3 = i29;
                    i4 = i62;
                    C23255 c232511 = (C23255) C2834.m9333(view, C0619.m2761(AbstractC0116.m1236(sArr14, i61, i60, i21)) ^ 2119336344);
                    int iM2769 = (C0619.m2761("ܿ֡") ^ i18) * (-61);
                    i32 = ((iM2769 ^ i17) * 8479) ^ 1204829051;
                    i33 = i58;
                    sArr9 = sArr9;
                    i23 = iM2769 ^ 1169786511;
                    i26 = i60;
                    i27 = i61;
                    sArr6 = sArr14;
                    i31 = i59;
                    c23258 = c232511;
                    int i31111 = i4;
                    i29 = i3;
                    spinner2 = spinner;
                    i28 = i31111;
                    break;
                case 761098521:
                case 1547867226:
                    i = i33;
                    int i63 = i29;
                    sArr9 = sArr9;
                    i27 = i27;
                    int i64 = i28;
                    sArr3 = sArr6;
                    c23257 = c23258;
                    i31 = i31;
                    Spinner spinner5 = (Spinner) C3448.m11246(view, i25 ^ 2097977828);
                    sArr5 = f70794;
                    if (C13473.f42873 != 0) {
                        i28 = i64;
                        i29 = i63;
                        spinner2 = spinner5;
                        int iM27610 = (C0619.m2761("ܳۧ") ^ i17) * 5;
                        i32 = ((iM27610 ^ i18) * (-9923)) ^ (-1565099829);
                        i31 = i31;
                        c23258 = c23257;
                        sArr6 = sArr3;
                        i27 = i27;
                        sArr9 = sArr9;
                        int i412 = i;
                        i23 = iM27610 ^ (-940844071);
                        i33 = i412;
                    } else {
                        int iM31620 = C0773.m3169("ۖ֨") ^ i17;
                        i32 = ((iM31620 ^ i18) * (-7917)) ^ (-1609315704);
                        i28 = i64;
                        i29 = i63;
                        spinner2 = spinner5;
                        i33 = i;
                        i23 = iM31620 ^ 674682037;
                        i31 = i31;
                        c23258 = c23257;
                        sArr6 = sArr3;
                        i27 = i27;
                        sArr9 = sArr9;
                    }
                    break;
                case 817484477:
                case 2054613473:
                    C0619.m2763();
                    throw new RuntimeException();
                case 871936525:
                case 1426419866:
                    C13473.m33144();
                    if (C0269.f1558 > 0) {
                        iM2762 = (C0773.m3169("ܶۧ") + i18) * (-95);
                        i13 = ((iM2762 ^ i17) * 14851) ^ 194693970;
                        i14 = 2094696350;
                        i23 = iM2762 ^ i14;
                        i32 = i13;
                    } else {
                        i = i33;
                        sArr5 = sArr5;
                        sArr9 = sArr9;
                        view = view;
                        i27 = i27;
                        i7 = i30;
                        sArr6 = sArr6;
                        c23256 = c23258;
                        i31 = i31;
                        sArr = sArr4;
                        int i322 = i28;
                        spinner = spinner2;
                        i3 = i29;
                        i4 = i322;
                        int iM316110 = C0773.m3169("ܺ᩵") ^ i17;
                        i21 = i21;
                        int i31112 = ((iM316110 ^ i18) * (-30163)) ^ (-441895142);
                        i15 = iM316110 ^ 1338633557;
                        i32 = i31112;
                        sArr4 = sArr;
                        i30 = i7;
                        view = view;
                        i31 = i31;
                        i21 = i21;
                        sArr5 = sArr5;
                        c23258 = c23256;
                        sArr6 = sArr6;
                        i27 = i27;
                        sArr9 = sArr9;
                        int i31113 = i;
                        i23 = i15;
                        i33 = i31113;
                        int i31114 = i4;
                        i29 = i3;
                        spinner2 = spinner;
                        i28 = i31114;
                    }
                    break;
                case 1094208020:
                case 1581128257:
                    dialogInterfaceC8327M23911 = C8947.m23911(c2361M3794, iM31612, onClickListener, C0619.m2761(C0619.m2756(sArr8, i24, 3, i21)) ^ 2101008790, onClickListener);
                    iM2762 = (C0773.m3169("᩺᩺") + i18) * (-11);
                    i13 = ((iM2762 ^ i17) * (-12761)) ^ (-392769280);
                    i14 = 1522244462;
                    i23 = iM2762 ^ i14;
                    i32 = i13;
                    break;
                default:
                    spinner2.setOnItemSelectedListener(this);
                    i = i33;
                    c23255 = c23258;
                    C0269.m1786(c23255, f70793);
                    C4238.m13531(c23255, c23255.m54099());
                    if (C4238.f15451 < 0) {
                        int iM31621 = C0773.m3169("ۧܳ") ^ i17;
                        int i65 = i31;
                        int i66 = ((iM31621 ^ i18) * 13723) ^ (-1445989566);
                        i2 = iM31621 ^ (-10680107);
                        i32 = i66;
                        i31 = i65;
                        c23258 = c23255;
                        i33 = i;
                        i23 = i2;
                    } else {
                        c23256 = c23255;
                        int i510 = i28;
                        spinner = spinner2;
                        i3 = i29;
                        i4 = i510;
                        iM3169 = C0619.m2761("ۖܶ") ^ i18;
                        i5 = ((iM3169 ^ i17) * (-11277)) ^ 663868744;
                        i6 = -1952216402;
                        i15 = iM3169 ^ i6;
                        i32 = i5;
                        view = view;
                        i31 = i31;
                        i21 = i21;
                        sArr5 = sArr5;
                        c23258 = c23256;
                        sArr6 = sArr6;
                        i27 = i27;
                        sArr9 = sArr9;
                        int i31115 = i;
                        i23 = i15;
                        i33 = i31115;
                        int i31116 = i4;
                        i29 = i3;
                        spinner2 = spinner;
                        i28 = i31116;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x04a1 A[PHI: r7 r16
      0x04a1: PHI (r7v3 short) = (r7v2 short), (r7v5 short) binds: [B:115:0x049f, B:107:0x0443] A[DONT_GENERATE, DONT_INLINE]
      0x04a1: PHI (r16v4 int) = (r16v2 int), (r16v5 int) binds: [B:115:0x049f, B:107:0x0443] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:120:0x04d6 A[PHI: r6 r16
      0x04d6: PHI (r6v5 java.lang.String) = (r6v2 java.lang.String), (r6v4 java.lang.String), (r6v2 java.lang.String) binds: [B:119:0x04d4, B:58:0x01c8, B:15:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x04d6: PHI (r16v31 int) = (r16v1 int), (r16v18 int), (r16v32 int) binds: [B:119:0x04d4, B:58:0x01c8, B:15:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:124:0x050a A[PHI: r3 r16
      0x050a: PHI (r3v6 java.lang.String) = (r3v2 java.lang.String), (r3v5 java.lang.String), (r3v2 java.lang.String) binds: [B:123:0x0508, B:84:0x030b, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x050a: PHI (r16v33 int) = (r16v0 int), (r16v13 int), (r16v36 int) binds: [B:123:0x0508, B:84:0x030b, B:12:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0175 A[PHI: r16
      0x0175: PHI (r16v22 int) = (r16v20 int), (r16v23 int) binds: [B:49:0x015e, B:45:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0201 A[PHI: r16
      0x0201: PHI (r16v21 int) = (r16v17 int), (r16v19 int), (r16v23 int) binds: [B:62:0x01ea, B:53:0x0192, B:45:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        if (l.C2966.f9654 < 0) goto L15;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m49619(final l.C21926 r18, final android.widget.Spinner r19, l.DialogInterfaceC8327 r20, l.C8614 r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 1630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21926.m49619(l.᩷۠ۤ, android.widget.Spinner, l.۠ۖۧ, l.۠ۨܳ, java.lang.String):void");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x019f  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m49622(C22941 c22941, C25179 c25179, int i, C4772 c4772) throws Exception {
        int iM3169;
        int i2;
        int i3;
        int i4;
        int i5;
        Exception exc;
        int i6;
        int i7;
        List list;
        C22941 c22942;
        int iM2761;
        int i8;
        int i9;
        C4772 c4773;
        int iM2762;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iM31610;
        int i15;
        int i16;
        int i17;
        int i18;
        int iM2763;
        int i19;
        int i20;
        int i21;
        List list2;
        C22941 c22943 = c22941;
        c25179 = c25179;
        c4772 = c4772;
        int i22 = C1080.f3865;
        int i23 = C3492.f12043;
        int iM2764 = (C0619.m2761("᩹֡") ^ i23) * 47;
        int i24 = ((iM2764 ^ i22) * (-17171)) ^ 689269086;
        C4157[] c4157Arr = null;
        C6835[] c6835Arr = null;
        ArrayList arrayList = null;
        List list3 = null;
        InterfaceC12119[] interfaceC12119ArrM29318 = null;
        Iterator itM4942 = null;
        C8002 c8002 = null;
        Exception exc2 = null;
        int i25 = iM2764 ^ (-2092365872);
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int iM9336 = 0;
        char c = 0;
        char c2 = 0;
        int i29 = 0;
        boolean zM8058 = false;
        int i30 = 0;
        boolean zM4851 = false;
        C19647[] c19647Arr = null;
        boolean zM6317 = false;
        int i31 = 0;
        HashSet hashSet = null;
        C14597 c14597 = null;
        int[] iArr = null;
        Iterator itM13647 = null;
        int i32 = 0;
        int i33 = 351455901;
        int i34 = 0;
        int i35 = 0;
        while (true) {
            i33 = i25 ^ (i24 & (((i33 ^ i22) * (-13623)) >> 31));
            switch (i33) {
                case -2009634542:
                case -142409689:
                    C6835 c6835 = (C6835) C4238.m13529(itM4942);
                    i35++;
                    String strM7820 = C2317.m7820(i35);
                    C2310.m7799(c4772, strM7820);
                    m49621(c25179, c6835.m19052(c4772), strM7820);
                    c4773 = c4772;
                    int iM2765 = C0619.m2761("᩻ۢ") ^ i23;
                    i2 = ((iM2765 ^ i22) * 13517) ^ (-2081372981);
                    i9 = iM2765 ^ 1556437271;
                    c4772 = c4773;
                    list3 = list3;
                    i26 = i26;
                    exc2 = exc2;
                    i27 = i27;
                    iM9336 = iM9336;
                    c22943 = c22941;
                    i25 = i9;
                    i24 = i2;
                    i33 = i33;
                    break;
                case -2001425093:
                case 847346047:
                    i12 = 44565;
                    int iM31611 = (C0773.m3169("ܽܰ") ^ i22) * (-87);
                    int i36 = ((iM31611 ^ i23) * (-23895)) ^ 1876640062;
                    c25179 = c25179;
                    c4772 = c4772;
                    list3 = list3;
                    i26 = i26;
                    exc2 = exc2;
                    i27 = i27;
                    i25 = iM31611 ^ 376553225;
                    c22943 = c22943;
                    i33 = i33;
                    i34 = i12;
                    i24 = i36;
                    break;
                case -1822243033:
                case 384218237:
                    C2834.m9332(arrayList);
                    C3099.m10086(c6835Arr[c2]);
                    String strM7821 = C2317.m7820(i35 + 1);
                    C2310.m7799(c4772, strM7821);
                    m49621(c25179, c6835Arr[c2].m19052(c4772), strM7821);
                    return;
                case -1716352715:
                case -1331504250:
                    try {
                        C6835 c6836 = (C6835) C0950.m3796(itM13647);
                        int i37 = i31 + 1;
                        String strM7822 = C2317.m7820(i37);
                        C2310.m7799(c4772, strM7822);
                        m49621(c25179, c6836.m19052(c4772), strM7822);
                        i31 = i37;
                        iM3169 = C0773.m3169("֨ۙ") ^ i22;
                        i2 = ((iM3169 ^ i23) * (-16673)) ^ (-1096932438);
                        i3 = -1099498999;
                        i25 = i3 ^ iM3169;
                        i24 = i2;
                        i33 = i33;
                    } catch (Exception e) {
                        exc2 = e;
                        i15 = i34;
                        i21 = i26;
                        i16 = i27;
                        i17 = i28;
                        i18 = iM9336;
                        list2 = list3;
                        int iM31612 = (C0773.m3169("ۗܶ") ^ i22) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i25 = (-1414717970) ^ iM31612;
                        i24 = ((iM31612 ^ i23) * 22385) ^ (-1982503874);
                        list3 = list2;
                        i26 = i21;
                        i27 = i16;
                        i34 = i15;
                        iM9336 = i18;
                        i28 = i17;
                        c22943 = c22941;
                    }
                    break;
                case -1566846197:
                case -626492531:
                    if (i26 > 20971520) {
                        iM3169 = (C0619.m2761("ܿᩴ") ^ i22) * (-11);
                        i2 = ((iM3169 ^ i23) * (-8789)) ^ (-1125139262);
                        i3 = -1755636010;
                    } else {
                        i30 = i29;
                        iM3169 = (C0773.m3169("᩶ۧ") + i23) * (-79);
                        i2 = ((iM3169 ^ i22) * (-2673)) ^ 1915416414;
                        i3 = -366887802;
                    }
                    i25 = i3 ^ iM3169;
                    i24 = i2;
                    i33 = i33;
                    break;
                case -1370371958:
                case 1695554256:
                    zM6317 = C1826.m6317(itM13647);
                    iM3169 = (C0619.m2761("ۢۖ") + i22) * (-115);
                    i2 = ((iM3169 ^ i23) * (-21563)) ^ 684674028;
                    i3 = 1579190036;
                    i25 = i3 ^ iM3169;
                    i24 = i2;
                    i33 = i33;
                    break;
                case -914913293:
                case 1230956192:
                    c4773 = c4772;
                    RunnableC1848.m6364(c4773, C0773.m3169(C1321.m4861(f70794, 78, 3, i34)) ^ 2102544450);
                    itM4942 = C1343.m4942(arrayList);
                    i35 = i29;
                    c2 = 0;
                    int iM2766 = C0619.m2761("᩻ۢ") ^ i23;
                    i2 = ((iM2766 ^ i22) * 13517) ^ (-2081372981);
                    i9 = iM2766 ^ 1556437271;
                    c4772 = c4773;
                    list3 = list3;
                    i26 = i26;
                    exc2 = exc2;
                    i27 = i27;
                    iM9336 = iM9336;
                    c22943 = c22941;
                    i25 = i9;
                    i24 = i2;
                    i33 = i33;
                    break;
                case -802098296:
                case -15178064:
                    int i38 = i26;
                    Exception exc3 = exc2;
                    int i39 = i27;
                    List list4 = list3;
                    C4772 c4774 = c4772;
                    c = 0;
                    if (i28 < iM9336) {
                        iM2761 = (C0619.m2761("ᩴ᩺") + i22) * (-83);
                        i2 = ((iM2761 ^ i23) * (-22271)) ^ (-34038225);
                        i8 = -1576530413;
                    } else {
                        iM2761 = (C0619.m2761("ۘ֡") + i23) * (-119);
                        i2 = ((iM2761 ^ i22) * (-27137)) ^ (-1094990235);
                        i8 = 2122343889;
                    }
                    i9 = iM2761 ^ i8;
                    c4772 = c4774;
                    list3 = list4;
                    i26 = i38;
                    exc2 = exc3;
                    i27 = i39;
                    c22943 = c22941;
                    i25 = i9;
                    i24 = i2;
                    i33 = i33;
                    break;
                case -720610068:
                case 1070064988:
                    i28++;
                    c22942 = c22943;
                    i29 = i30;
                    i27 = 1;
                    int iM2767 = C0619.m2761("ۡۤ") ^ i23;
                    i2 = ((iM2767 ^ i22) * (-24207)) ^ 541486554;
                    i9 = iM2767 ^ (-319936934);
                    c25179 = c25179;
                    c4772 = c4772;
                    c22943 = c22942;
                    i26 = i26;
                    exc2 = exc2;
                    i34 = i34;
                    i25 = i9;
                    i24 = i2;
                    i33 = i33;
                    break;
                case -625359329:
                case 674307102:
                    i26 = iArr[i32];
                    iM3169 = C0773.m3169("ܽۜ") ^ i22;
                    i2 = ((iM3169 ^ i23) * (-19577)) ^ 507931732;
                    i3 = 2046649052;
                    i25 = i3 ^ iM3169;
                    i24 = i2;
                    i33 = i33;
                    break;
                case -580781417:
                case 272827839:
                    C3033.m9854(c4772, C0773.m3169(C2354.m7980(f70794, 96, 3, i34)) ^ 2104545759);
                    C2834.m9332(arrayList);
                    iArr[i32] = i32;
                    i30 = i31;
                    iM3169 = (C0773.m3169("᩶ۧ") + i23) * (-79);
                    i2 = ((iM3169 ^ i22) * (-2673)) ^ 1915416414;
                    i3 = -366887802;
                    i25 = i3 ^ iM3169;
                    i24 = i2;
                    i33 = i33;
                    break;
                case -579490951:
                case -294400339:
                    StringBuilder sb = new StringBuilder();
                    C1783.m6234(sb, C3779.m12261(exc2));
                    C3779.m12258(sb, C2288.m7761(f70794, 81, 2, i34));
                    C1783.m6234(sb, C2287.m7741(c8002));
                    C3779.m12258(sb, C4238.m13530(f70794, 83, 1, i34));
                    throw new Exception(C2023.m6952(sb), exc2);
                case -418282086:
                case 2004782322:
                    if (zM4851) {
                        i30 = i29;
                        iM3169 = (C0773.m3169("᩶ۧ") + i23) * (-79);
                        i2 = ((iM3169 ^ i22) * (-2673)) ^ 1915416414;
                        i3 = -366887802;
                    } else {
                        iM3169 = (C0773.m3169("᩻᩷") + i23) * 57;
                        i2 = ((iM3169 ^ i22) * (-6461)) ^ (-1771385520);
                        i3 = -2033972077;
                    }
                    i25 = i3 ^ iM3169;
                    i24 = i2;
                    i33 = i33;
                    break;
                case -194930514:
                case 207131585:
                    RunnableC1848.m6364(c4772, C0773.m3169(C3734.m12149(f70794, 93, 3, i34)) ^ 2103408629);
                    itM13647 = C4282.m13647(arrayList);
                    i31 = i29;
                    iM3169 = C0773.m3169("֨ۙ") ^ i22;
                    i2 = ((iM3169 ^ i23) * (-16673)) ^ (-1096932438);
                    i3 = -1099498999;
                    i25 = i3 ^ iM3169;
                    i24 = i2;
                    i33 = i33;
                    break;
                case -22649651:
                case 97360119:
                    zM4851 = C1321.m4851(arrayList);
                    iM3169 = (C0619.m2761("᩵۬") + i23) * (-69);
                    i2 = ((iM3169 ^ i22) * (-21821)) ^ 509284784;
                    i3 = 2058966330;
                    i25 = i3 ^ iM3169;
                    i24 = i2;
                    i33 = i33;
                    break;
                case 270291142:
                case 1005630373:
                    try {
                        Object[] objArr = new Object[i27];
                        objArr[c] = C2287.m7741(c8002);
                        C0269.m1783(c4772, C17202.m40366(C0773.m3169(C11235.m28300(f70794, 84, 3, i34)) ^ 2098422750, objArr));
                        c4772.mo16839(0);
                        C0619.m2761(RunnableC3055.m9937(f70794, 87, 3, i34));
                        try {
                            C0773.m3169(C0269.m1785(f70794, 90, 3, i34));
                            i21 = i26;
                            Exception exc4 = exc2;
                            i16 = i27;
                            i15 = i34;
                            i18 = iM9336;
                            i17 = i28;
                            list2 = list3;
                            try {
                                try {
                                    new C18768(c22941, c8002, interfaceC12119ArrM29318, i28, iArr, c6835Arr, c19647Arr, c4772, hashSet, c14597, c4157Arr, i, arrayList).m43564();
                                    zM8058 = C2375.m8058(c4772);
                                    int iM31613 = C0773.m3169("֡ۨ") ^ i23;
                                    i25 = iM31613 ^ 658197826;
                                    c25179 = c25179;
                                    c4772 = c4772;
                                    i24 = ((iM31613 ^ i22) * 13783) ^ 1313543963;
                                    list3 = list2;
                                    i33 = i33;
                                    i26 = i21;
                                    exc2 = exc4;
                                    i27 = i16;
                                    i34 = i15;
                                    iM9336 = i18;
                                    i28 = i17;
                                    i32 = 0;
                                } catch (Exception e2) {
                                    exc2 = e2;
                                    i32 = 0;
                                    int iM31614 = (C0773.m3169("ۗܶ") ^ i22) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                    i25 = (-1414717970) ^ iM31614;
                                    i24 = ((iM31614 ^ i23) * 22385) ^ (-1982503874);
                                    list3 = list2;
                                    i26 = i21;
                                    i27 = i16;
                                    i34 = i15;
                                    iM9336 = i18;
                                    i28 = i17;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                i32 = 0;
                                exc2 = e;
                                int iM31615 = (C0773.m3169("ۗܶ") ^ i22) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                i25 = (-1414717970) ^ iM31615;
                                i24 = ((iM31615 ^ i23) * 22385) ^ (-1982503874);
                                list3 = list2;
                                i26 = i21;
                                i27 = i16;
                                i34 = i15;
                                iM9336 = i18;
                                i28 = i17;
                                c22943 = c22941;
                                break;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            i15 = i34;
                            i21 = i26;
                            i16 = i27;
                            i17 = i28;
                            i18 = iM9336;
                            list2 = list3;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        i15 = i34;
                        i21 = i26;
                        i16 = i27;
                        i17 = i28;
                        i18 = iM9336;
                        list2 = list3;
                    }
                    c22943 = c22941;
                    break;
                case 556929597:
                case 885875948:
                    if (!zM8058) {
                        iM3169 = C0773.m3169("ᩳ᩷") ^ i22;
                        i2 = ((iM3169 ^ i23) * 5417) ^ (-873397748);
                        i3 = 31252115;
                        i25 = i3 ^ iM3169;
                        i24 = i2;
                        i33 = i33;
                    } else {
                        i4 = i34;
                        i5 = i26;
                        exc = exc2;
                        i6 = i27;
                        i7 = iM9336;
                        list = list3;
                        iM31610 = (C0773.m3169("᩸ܳ") ^ i23) * 87;
                        i14 = ((iM31610 ^ i22) * 12423) ^ (-929420235);
                        i13 = -239349171;
                        i25 = i13 ^ iM31610;
                        c25179 = c25179;
                        c4772 = c4772;
                        i24 = i14;
                        list3 = list;
                        i33 = i33;
                        i26 = i5;
                        exc2 = exc;
                        i27 = i6;
                        i34 = i4;
                        iM9336 = i7;
                        c22943 = c22941;
                    }
                    break;
                case 572088218:
                case 693147263:
                    int i40 = i34;
                    int i41 = i26;
                    Exception exc5 = exc2;
                    int i42 = i27;
                    C4772 c4775 = c4772;
                    C22941 c22944 = c22943;
                    List list5 = list3;
                    short s = f70794[77];
                    if ((s * 340) - ((s * s) + 28900) <= 0) {
                        iM2762 = C0773.m3169("۠ܿ") ^ i22;
                        i10 = ((iM2762 ^ i23) * 4957) ^ 875975042;
                        i11 = -370674744;
                    } else {
                        iM2762 = (i23 - C0619.m2761("۫ܿ")) * (-105);
                        i10 = ((iM2762 ^ i22) * (-28095)) ^ 2125377092;
                        i11 = -1126122401;
                    }
                    c25179 = c25179;
                    c4772 = c4775;
                    list3 = list5;
                    i26 = i41;
                    exc2 = exc5;
                    i27 = i42;
                    i25 = iM2762 ^ i11;
                    i24 = i10;
                    c22943 = c22944;
                    i33 = i33;
                    i34 = i40;
                    break;
                case 677014835:
                case 1825840188:
                    i12 = 59462;
                    int iM31616 = (C0773.m3169("ܽܰ") ^ i22) * (-87);
                    int i310 = ((iM31616 ^ i23) * (-23895)) ^ 1876640062;
                    c25179 = c25179;
                    c4772 = c4772;
                    list3 = list3;
                    i26 = i26;
                    exc2 = exc2;
                    i27 = i27;
                    i25 = iM31616 ^ 376553225;
                    c22943 = c22943;
                    i33 = i33;
                    i34 = i12;
                    i24 = i310;
                    break;
                case 710989070:
                case 1718095930:
                    HashSet hashSet2 = new HashSet();
                    C14597 c14598 = new C14597();
                    C4157[] c4157Arr2 = {new C4157()};
                    ArrayList arrayList2 = new ArrayList();
                    c22942 = c22941;
                    List listM51728 = c22942.m51728(false);
                    c19647Arr = new C19647[]{null};
                    arrayList = arrayList2;
                    hashSet = hashSet2;
                    c14597 = c14598;
                    c6835Arr = new C6835[]{null};
                    c4157Arr = c4157Arr2;
                    iArr = new int[]{0};
                    interfaceC12119ArrM29318 = C11650.m29318(c22942, listM51728);
                    iM9336 = C2834.m9336(listM51728);
                    i27 = 1;
                    i28 = 0;
                    i29 = 0;
                    list3 = listM51728;
                    int iM2768 = C0619.m2761("ۡۤ") ^ i23;
                    i2 = ((iM2768 ^ i22) * (-24207)) ^ 541486554;
                    i9 = iM2768 ^ (-319936934);
                    c25179 = c25179;
                    c4772 = c4772;
                    c22943 = c22942;
                    i26 = i26;
                    exc2 = exc2;
                    i34 = i34;
                    i25 = i9;
                    i24 = i2;
                    i33 = i33;
                    break;
                case 968898035:
                case 1421000092:
                    return;
                case 1026782709:
                case 2125943621:
                    i4 = i34;
                    i5 = i26;
                    exc = exc2;
                    i6 = i27;
                    i7 = iM9336;
                    list = list3;
                    c8002 = (C8002) C3690.m11998(list, i28);
                    if (C11235.m28304(c4772)) {
                        iM31610 = (C0773.m3169("᩸ܳ") ^ i23) * 87;
                        i14 = ((iM31610 ^ i22) * 12423) ^ (-929420235);
                        i13 = -239349171;
                    } else {
                        iM31610 = (C0619.m2761("ܳۤ") ^ i22) * 39;
                        i14 = ((iM31610 ^ i23) * 5539) ^ (-658863);
                        i13 = 1465140810;
                    }
                    i25 = i13 ^ iM31610;
                    c25179 = c25179;
                    c4772 = c4772;
                    i24 = i14;
                    list3 = list;
                    i33 = i33;
                    i26 = i5;
                    exc2 = exc;
                    i27 = i6;
                    i34 = i4;
                    iM9336 = i7;
                    c22943 = c22941;
                    break;
                case 1328610841:
                case 1734039548:
                    i15 = i34;
                    int i43 = i26;
                    Exception exc6 = exc2;
                    i16 = i27;
                    i17 = i28;
                    i18 = iM9336;
                    List list6 = list3;
                    if (C1826.m6317(itM4942)) {
                        iM2763 = C0773.m3169("᩻֡") ^ i22;
                        i19 = ((iM2763 ^ i23) * 28343) ^ (-1935892396);
                        i20 = 753298505;
                    } else {
                        iM2763 = (i23 - C0619.m2761("֡۟")) * 9;
                        i19 = ((iM2763 ^ i22) * (-2385)) ^ 2123810879;
                        i20 = 549971428;
                    }
                    i25 = i20 ^ iM2763;
                    i24 = i19;
                    list3 = list6;
                    i26 = i43;
                    exc2 = exc6;
                    i27 = i16;
                    i34 = i15;
                    iM9336 = i18;
                    i28 = i17;
                    c22943 = c22941;
                    break;
                default:
                    if (zM6317) {
                        iM3169 = C0619.m2761("ۤ۫") ^ i23;
                        i2 = ((iM3169 ^ i22) * 31831) ^ (-622835495);
                        i3 = -1554736184;
                    } else {
                        iM3169 = (i23 - C0773.m3169("᩷۠")) * 53;
                        i2 = ((iM3169 ^ i22) * 20601) ^ 799284480;
                        i3 = -66923241;
                    }
                    i25 = i3 ^ iM3169;
                    i24 = i2;
                    i33 = i33;
                    break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49620(C22941 c22941, C25179 c25179, int i, C4772 c4772) throws Throwable {
        int iM3169;
        int i2;
        int i3;
        int i4;
        int i5;
        List list;
        int iM2761;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        List list2;
        List listM51728;
        int i14;
        int i15;
        int iM31610;
        int i16;
        int i17;
        int i18;
        boolean z;
        int iM2762;
        int i19;
        int iM2763;
        int i20;
        int i21;
        int i22;
        boolean zM8058 = false;
        Iterator itM7968 = null;
        boolean zM6317 = false;
        C6835[] c6835Arr = null;
        List[] listArr = null;
        boolean zM4851 = false;
        int i23 = 382028723;
        int i24 = C0773.f2792;
        int i25 = C1542.f5343;
        int iM2764 = C0619.m2761("ۛ֨") ^ i24;
        int i26 = ((iM2764 ^ i25) * (-4773)) ^ (-527134572);
        int i27 = iM2764 ^ (-584697539);
        C14597 c14597 = null;
        C9817 c9817 = null;
        Boolean bool = null;
        List list3 = null;
        Throwable th = null;
        Boolean[] boolArr = null;
        C8002 c8002 = null;
        String strM7820 = null;
        C6835 c6835 = null;
        String strM6952 = null;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        boolean z2 = false;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        boolean zM8059 = false;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        HashSet hashSet = null;
        InterfaceC12119[] interfaceC12119ArrM29318 = null;
        AbstractC22044 abstractC22044M2354 = null;
        int i39 = 0;
        while (true) {
            i23 = i27 ^ (i26 & (((i23 ^ i25) * 1319) >> 31));
            switch (i23) {
                case -2145837079:
                case 1027242962:
                    i29 = i29;
                    strM6952 = strM6952;
                    if (i33 < i31) {
                        iM3169 = (i24 - C0619.m2761("ۙۨ")) * (-81);
                        i2 = ((iM3169 ^ i25) * 24031) ^ (-1630944508);
                        i3 = 1025412582;
                    } else {
                        iM3169 = C0619.m2761("᩶᩷") ^ i25;
                        i2 = ((iM3169 ^ i24) * 13451) ^ (-1789177701);
                        i3 = 158727547;
                    }
                    i22 = iM3169 ^ i3;
                    strM6952 = strM6952;
                    int i40 = i29;
                    i27 = i22;
                    i26 = i2;
                    i29 = i40;
                    break;
                case -2126536320:
                case 647156978:
                    i29 = i29;
                    strM6952 = strM6952;
                    zM4851 = C1321.m4851(c6835Arr[i33].f22707);
                    iM3169 = (i25 - C0773.m3169("ۨ۬")) * (-21);
                    i2 = ((iM3169 ^ i24) * (-32403)) ^ 971384854;
                    i3 = 809215541;
                    i22 = iM3169 ^ i3;
                    strM6952 = strM6952;
                    int i41 = i29;
                    i27 = i22;
                    i26 = i2;
                    i29 = i41;
                    break;
                case -2105342141:
                case -2017754101:
                    C17202.m40378(abstractC22044M2354);
                    return;
                case -2083499013:
                case -847988332:
                    i29 = i29;
                    strM6952 = strM6952;
                    i31 = c9817.f31624;
                    iM3169 = (i24 - C0773.m3169("᩷ᩳ")) * 119;
                    i2 = ((iM3169 ^ i25) * 7505) ^ (-106250836);
                    i3 = -969313886;
                    i22 = iM3169 ^ i3;
                    strM6952 = strM6952;
                    int i42 = i29;
                    i27 = i22;
                    i26 = i2;
                    i29 = i42;
                    break;
                case -2013269197:
                case -151906885:
                    i5 = i37;
                    list = list3;
                    i39 = 47248;
                    int iM2765 = C0619.m2761("ܳۜ") ^ i25;
                    i6 = ((iM2765 ^ i24) * (-32465)) ^ (-606617385);
                    i8 = iM2765 ^ (-2062937579);
                    i31 = i31;
                    strM7820 = strM7820;
                    strM6952 = strM6952;
                    i28 = i28;
                    i38 = i38;
                    i32 = i32;
                    abstractC22044M2354 = abstractC22044M2354;
                    i27 = i8;
                    i36 = i36;
                    i26 = i6;
                    i29 = i29;
                    C6835 c6836 = c6835;
                    i37 = i5;
                    c6835 = c6836;
                    int i43 = i33;
                    list3 = list;
                    i33 = i43;
                    break;
                case -1974728773:
                case 962565108:
                    i28 = i28;
                    i29 = i29;
                    strM6952 = strM6952;
                    abstractC22044M2354 = abstractC22044M2354;
                    Object[] objArr = z2 ? 1 : 0;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM7820 = strM7820;
                    i12 = i39;
                    i13 = i31;
                    int i44 = i37;
                    c6835 = c6835;
                    i5 = i44;
                    List list4 = list3;
                    i33 = i33;
                    list2 = list4;
                    try {
                        C2419.m8176(abstractC22044M2354);
                        try {
                            listM51728 = c22941.m51728(z2);
                            try {
                                interfaceC12119ArrM29318 = C11650.m29318(c22941, listM51728);
                                try {
                                    Boolean[] boolArr2 = new Boolean[1];
                                    try {
                                        boolArr2[z2 ? 1 : 0] = bool;
                                        int iM9336 = C2834.m9336(listM51728);
                                        int iM2766 = (C0619.m2761("᩵ܳ") ^ i24) * (-27);
                                        boolArr = boolArr2;
                                        i31 = i13;
                                        i33 = i33;
                                        c6835 = c6835;
                                        strM7820 = strM7820;
                                        i29 = i29;
                                        i38 = i38;
                                        abstractC22044M2354 = abstractC22044M2354;
                                        i36 = i36;
                                        i34 = 1;
                                        i37 = iM9336;
                                        list3 = listM51728;
                                        i26 = ((iM2766 ^ i25) * (-161)) ^ 494594337;
                                        strM6952 = strM6952;
                                        i28 = i28;
                                        i27 = iM2766 ^ (-822406633);
                                        i39 = i12;
                                        i32 = i32;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        boolArr = boolArr2;
                                        i34 = 1;
                                        th = th;
                                        list = listM51728;
                                        int iM2767 = C0619.m2761("᩻᩶") ^ i24;
                                        i10 = ((iM2767 ^ i25) * (-15929)) ^ 511701329;
                                        i11 = iM2767 ^ (-1323083296);
                                        i39 = i12;
                                        i31 = i13;
                                        strM7820 = strM7820;
                                        strM6952 = strM6952;
                                        i29 = i29;
                                        i38 = i38;
                                        i32 = i32;
                                        abstractC22044M2354 = abstractC22044M2354;
                                        i36 = i36;
                                        int i45 = i28;
                                        i27 = i11;
                                        i26 = i10;
                                        i28 = i45;
                                        C6835 c6837 = c6835;
                                        i37 = i5;
                                        c6835 = c6837;
                                        int i46 = i33;
                                        list3 = list;
                                        i33 = i46;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                listM51728 = listM51728;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            listM51728 = list2;
                            th = th;
                            list = listM51728;
                            int iM2768 = C0619.m2761("᩻᩶") ^ i24;
                            i10 = ((iM2768 ^ i25) * (-15929)) ^ 511701329;
                            i11 = iM2768 ^ (-1323083296);
                            i39 = i12;
                            i31 = i13;
                            strM7820 = strM7820;
                            strM6952 = strM6952;
                            i29 = i29;
                            i38 = i38;
                            i32 = i32;
                            abstractC22044M2354 = abstractC22044M2354;
                            i36 = i36;
                            int i47 = i28;
                            i27 = i11;
                            i26 = i10;
                            i28 = i47;
                            C6835 c6838 = c6835;
                            i37 = i5;
                            c6835 = c6838;
                            int i48 = i33;
                            list3 = list;
                            i33 = i48;
                            break;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        z2 = objArr == true ? 1 : 0;
                    }
                    break;
                case -1956635777:
                case -1860996067:
                    try {
                        AbstractC22044 abstractC22044M49857 = abstractC22044M2354.m49857(strM6952);
                        c6835Arr[i33].m19051().m52044(abstractC22044M49857);
                        C0862.m3493(listArr[i33], abstractC22044M49857);
                        c6835Arr[i33] = new C6835(c9817.f31626);
                        i29 = i29;
                        strM6952 = strM6952;
                        iM3169 = C0619.m2761("ۢۖ") ^ i25;
                        i2 = ((iM3169 ^ i24) * (-8241)) ^ 1858596628;
                        i3 = 730241084;
                        i22 = iM3169 ^ i3;
                        strM6952 = strM6952;
                        int i49 = i29;
                        i27 = i22;
                        i26 = i2;
                        i29 = i49;
                    } catch (Throwable th7) {
                        th = th7;
                        strM6952 = strM6952;
                        i12 = i39;
                        i13 = i31;
                        int i50 = i37;
                        c6835 = c6835;
                        i5 = i50;
                        List list5 = list3;
                        i33 = i33;
                        list = list5;
                        th = th;
                        strM7820 = strM7820;
                        z2 = z2;
                        int iM2769 = C0619.m2761("᩻᩶") ^ i24;
                        i10 = ((iM2769 ^ i25) * (-15929)) ^ 511701329;
                        i11 = iM2769 ^ (-1323083296);
                        i39 = i12;
                        i31 = i13;
                        strM7820 = strM7820;
                        strM6952 = strM6952;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC22044M2354 = abstractC22044M2354;
                        i36 = i36;
                        int i410 = i28;
                        i27 = i11;
                        i26 = i10;
                        i28 = i410;
                        C6835 c6839 = c6835;
                        i37 = i5;
                        c6835 = c6839;
                        int i411 = i33;
                        list3 = list;
                        i33 = i411;
                    }
                    break;
                case -1909548327:
                case 1544509454:
                    C17202.m40378(abstractC22044M2354);
                    return;
                case -1770552589:
                case -128974035:
                    i5 = i37;
                    list = list3;
                    i39 = 6034;
                    int iM27610 = C0619.m2761("ܳۜ") ^ i25;
                    i6 = ((iM27610 ^ i24) * (-32465)) ^ (-606617385);
                    i8 = iM27610 ^ (-2062937579);
                    i31 = i31;
                    strM7820 = strM7820;
                    strM6952 = strM6952;
                    i28 = i28;
                    i38 = i38;
                    i32 = i32;
                    abstractC22044M2354 = abstractC22044M2354;
                    i27 = i8;
                    i36 = i36;
                    i26 = i6;
                    i29 = i29;
                    C6835 c68310 = c6835;
                    i37 = i5;
                    c6835 = c68310;
                    int i412 = i33;
                    list3 = list;
                    i33 = i412;
                    break;
                case -1683492561:
                case 1659339812:
                    i33++;
                    iM3169 = (C0773.m3169("ۛۖ") + i24) * 95;
                    i2 = ((iM3169 ^ i25) * 12453) ^ 139992831;
                    i3 = 183533191;
                    i22 = iM3169 ^ i3;
                    strM6952 = strM6952;
                    int i413 = i29;
                    i27 = i22;
                    i26 = i2;
                    i29 = i413;
                    break;
                case -1554028295:
                case -111161751:
                    strM6952 = strM6952;
                    try {
                        int i51 = i38;
                        strM7820 = strM7820;
                        try {
                            Object[] objArr2 = new Object[i51];
                            objArr2[z2 ? 1 : 0] = C2287.m7741(c8002);
                            try {
                                i28 = i28;
                                i29 = i29;
                                try {
                                    try {
                                        C2310.m7799(c4772, C17202.m40366(C0773.m3169(C3998.m12925(f70794, 69, 3, i39)) ^ 2102702128, objArr2));
                                        C8002 c8003 = c8002;
                                        i38 = i51;
                                        InterfaceC12119[] interfaceC12119Arr = interfaceC12119ArrM29318;
                                        i30 = i30;
                                        i32 = i32;
                                        i12 = i39;
                                        int i52 = i37;
                                        c6835 = c6835;
                                        i5 = i52;
                                        C9817 c9818 = c9817;
                                        List list6 = list3;
                                        i33 = i33;
                                        list = list6;
                                        abstractC22044M2354 = abstractC22044M2354;
                                        HashSet hashSet2 = hashSet;
                                        i36 = i36;
                                        i13 = i31;
                                        C14597 c14598 = c14597;
                                        z2 = z2 ? 1 : 0;
                                        try {
                                            C9071.m24208(new C9071(c22941, c8003, interfaceC12119Arr, i30, c9818, c4772, hashSet2, c14598, boolArr));
                                            zM8058 = C2375.m8058(c4772);
                                            iM2762 = (C0773.m3169("ᩳܰ") + i25) * 45;
                                            i16 = ((iM2762 ^ i24) * 21295) ^ 954533776;
                                            i19 = -945183662;
                                            i18 = iM2762 ^ i19;
                                            i39 = i12;
                                            i31 = i13;
                                            strM6952 = strM6952;
                                            i28 = i28;
                                            i29 = i29;
                                            i30 = i30;
                                            i32 = i32;
                                            abstractC22044M2354 = abstractC22044M2354;
                                            i36 = i36;
                                            z2 = z2;
                                            i27 = i18;
                                            i26 = i16;
                                            strM7820 = strM7820;
                                            i38 = i38;
                                            C6835 c68311 = c6835;
                                            i37 = i5;
                                            c6835 = c68311;
                                            int i414 = i33;
                                            list3 = list;
                                            i33 = i414;
                                        } catch (Throwable th8) {
                                            th = th8;
                                            th = th;
                                            i30 = i30;
                                            z2 = z2;
                                            int iM27611 = C0619.m2761("᩻᩶") ^ i24;
                                            i10 = ((iM27611 ^ i25) * (-15929)) ^ 511701329;
                                            i11 = iM27611 ^ (-1323083296);
                                            i39 = i12;
                                            i31 = i13;
                                            strM7820 = strM7820;
                                            strM6952 = strM6952;
                                            i29 = i29;
                                            i38 = i38;
                                            i32 = i32;
                                            abstractC22044M2354 = abstractC22044M2354;
                                            i36 = i36;
                                            int i415 = i28;
                                            i27 = i11;
                                            i26 = i10;
                                            i28 = i415;
                                            C6835 c68312 = c6835;
                                            i37 = i5;
                                            c6835 = c68312;
                                            int i416 = i33;
                                            list3 = list;
                                            i33 = i416;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        i38 = i51;
                                        i12 = i39;
                                        i13 = i31;
                                        int i53 = i37;
                                        c6835 = c6835;
                                        i5 = i53;
                                        List list7 = list3;
                                        i33 = i33;
                                        list2 = list7;
                                        listM51728 = list2;
                                        th = th;
                                        list = listM51728;
                                        int iM27612 = C0619.m2761("᩻᩶") ^ i24;
                                        i10 = ((iM27612 ^ i25) * (-15929)) ^ 511701329;
                                        i11 = iM27612 ^ (-1323083296);
                                        i39 = i12;
                                        i31 = i13;
                                        strM7820 = strM7820;
                                        strM6952 = strM6952;
                                        i29 = i29;
                                        i38 = i38;
                                        i32 = i32;
                                        abstractC22044M2354 = abstractC22044M2354;
                                        i36 = i36;
                                        int i417 = i28;
                                        i27 = i11;
                                        i26 = i10;
                                        i28 = i417;
                                        C6835 c68313 = c6835;
                                        i37 = i5;
                                        c6835 = c68313;
                                        int i418 = i33;
                                        list3 = list;
                                        i33 = i418;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    i38 = i51;
                                    int i54 = i30;
                                    abstractC22044M2354 = abstractC22044M2354;
                                    z = z2 ? 1 : 0;
                                    i32 = i32;
                                    i36 = i36;
                                    i12 = i39;
                                    i13 = i31;
                                    int i55 = i37;
                                    c6835 = c6835;
                                    i5 = i55;
                                    List list8 = list3;
                                    i33 = i33;
                                    listM51728 = list8;
                                    i30 = i54;
                                    z2 = z;
                                    th = th;
                                    list = listM51728;
                                    int iM27613 = C0619.m2761("᩻᩶") ^ i24;
                                    i10 = ((iM27613 ^ i25) * (-15929)) ^ 511701329;
                                    i11 = iM27613 ^ (-1323083296);
                                    i39 = i12;
                                    i31 = i13;
                                    strM7820 = strM7820;
                                    strM6952 = strM6952;
                                    i29 = i29;
                                    i38 = i38;
                                    i32 = i32;
                                    abstractC22044M2354 = abstractC22044M2354;
                                    i36 = i36;
                                    int i419 = i28;
                                    i27 = i11;
                                    i26 = i10;
                                    i28 = i419;
                                    C6835 c68314 = c6835;
                                    i37 = i5;
                                    c6835 = c68314;
                                    int i4110 = i33;
                                    list3 = list;
                                    i33 = i4110;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                i28 = i28;
                                i29 = i29;
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            i28 = i28;
                            i29 = i29;
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        i28 = i28;
                        i29 = i29;
                        i38 = i38;
                        strM7820 = strM7820;
                    }
                    break;
                case -1518742919:
                case -290495658:
                    i29 = i29;
                    strM6952 = strM6952;
                    try {
                        m49621(c25179, c6835.m19052(c4772), strM7820);
                        Runtime.getRuntime().gc();
                        i28 = i35;
                        i29 = i29;
                        iM2763 = C0619.m2761("᩺ܶ") ^ i24;
                        i20 = ((iM2763 ^ i25) * (-31025)) ^ (-350151320);
                        i21 = 2128878451;
                        i27 = iM2763 ^ i21;
                        i26 = i20;
                        strM6952 = strM6952;
                    } catch (Throwable th14) {
                        th = th14;
                        i29 = i29;
                        i28 = i28;
                        i12 = i39;
                        i13 = i31;
                        int i56 = i37;
                        c6835 = c6835;
                        i5 = i56;
                        List list9 = list3;
                        i33 = i33;
                        list = list9;
                        th = th;
                        strM7820 = strM7820;
                        z2 = z2;
                        int iM27614 = C0619.m2761("᩻᩶") ^ i24;
                        i10 = ((iM27614 ^ i25) * (-15929)) ^ 511701329;
                        i11 = iM27614 ^ (-1323083296);
                        i39 = i12;
                        i31 = i13;
                        strM7820 = strM7820;
                        strM6952 = strM6952;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC22044M2354 = abstractC22044M2354;
                        i36 = i36;
                        int i4111 = i28;
                        i27 = i11;
                        i26 = i10;
                        i28 = i4111;
                        C6835 c68315 = c6835;
                        i37 = i5;
                        c6835 = c68315;
                        int i4112 = i33;
                        list3 = list;
                        i33 = i4112;
                    }
                    break;
                case -1368570919:
                case 1841556379:
                    try {
                        StringBuilder sb = new StringBuilder();
                        try {
                            strM6952 = strM6952;
                            i29 = i29;
                            try {
                                C3779.m12258(sb, C2288.m7761(f70794, 72, 1, i39));
                                C3779.m12269(sb, i33);
                                C1783.m6234(sb, AbstractC0641.m2820(f70794, 73, 4, i39));
                                strM6952 = C2023.m6952(sb);
                                int iM27615 = C0619.m2761("֨ۗ") ^ i24;
                                i2 = ((iM27615 ^ i25) * 28025) ^ (-289456328);
                                i22 = iM27615 ^ (-100739591);
                                int i4113 = i29;
                                i27 = i22;
                                i26 = i2;
                                i29 = i4113;
                            } catch (Throwable th15) {
                                th = th15;
                                i29 = i29;
                                i12 = i39;
                                i13 = i31;
                                int i57 = i37;
                                c6835 = c6835;
                                i5 = i57;
                                List list10 = list3;
                                i33 = i33;
                                list = list10;
                                th = th;
                                i30 = i30;
                                z2 = z2;
                                int iM27616 = C0619.m2761("᩻᩶") ^ i24;
                                i10 = ((iM27616 ^ i25) * (-15929)) ^ 511701329;
                                i11 = iM27616 ^ (-1323083296);
                                i39 = i12;
                                i31 = i13;
                                strM7820 = strM7820;
                                strM6952 = strM6952;
                                i29 = i29;
                                i38 = i38;
                                i32 = i32;
                                abstractC22044M2354 = abstractC22044M2354;
                                i36 = i36;
                                int i4114 = i28;
                                i27 = i11;
                                i26 = i10;
                                i28 = i4114;
                                C6835 c68316 = c6835;
                                i37 = i5;
                                c6835 = c68316;
                                int i4115 = i33;
                                list3 = list;
                                i33 = i4115;
                            }
                        } catch (Throwable th16) {
                            th = th16;
                            i29 = i29;
                            strM6952 = strM6952;
                        }
                    } catch (Throwable th17) {
                        th = th17;
                        i29 = i29;
                        strM6952 = strM6952;
                        i12 = i39;
                        i13 = i31;
                        int i58 = i37;
                        c6835 = c6835;
                        i5 = i58;
                        List list11 = list3;
                        i33 = i33;
                        list = list11;
                        th = th;
                        i30 = i30;
                        z2 = z2;
                        int iM27617 = C0619.m2761("᩻᩶") ^ i24;
                        i10 = ((iM27617 ^ i25) * (-15929)) ^ 511701329;
                        i11 = iM27617 ^ (-1323083296);
                        i39 = i12;
                        i31 = i13;
                        strM7820 = strM7820;
                        strM6952 = strM6952;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC22044M2354 = abstractC22044M2354;
                        i36 = i36;
                        int i4116 = i28;
                        i27 = i11;
                        i26 = i10;
                        i28 = i4116;
                        C6835 c68317 = c6835;
                        i37 = i5;
                        c6835 = c68317;
                        int i4117 = i33;
                        list3 = list;
                        i33 = i4117;
                    }
                    break;
                case -1346856007:
                case 274305685:
                    i28 = i28;
                    i29 = i29;
                    strM6952 = strM6952;
                    abstractC22044M2354 = abstractC22044M2354;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM7820 = strM7820;
                    i4 = i39;
                    i31 = i31;
                    int i59 = i37;
                    c6835 = c6835;
                    i5 = i59;
                    List list12 = list3;
                    i33 = i33;
                    list = list12;
                    short s = f70794[65];
                    int i60 = s + 11451;
                    int i61 = (s * s) + 131125401;
                    if ((i60 * i60) - (i61 + i61) <= 0) {
                        iM2761 = (C0619.m2761("֫ܽ") ^ i25) * (-7);
                        i6 = ((iM2761 ^ i24) * 8767) ^ (-946823439);
                        i7 = 145205845;
                    } else {
                        iM2761 = C0619.m2761("ᩴ᩶") ^ i24;
                        i6 = ((iM2761 ^ i25) * (-18827)) ^ 626649837;
                        i7 = -1966263034;
                    }
                    i8 = iM2761 ^ i7;
                    i39 = i4;
                    i31 = i31;
                    strM7820 = strM7820;
                    strM6952 = strM6952;
                    i28 = i28;
                    i38 = i38;
                    i32 = i32;
                    abstractC22044M2354 = abstractC22044M2354;
                    i27 = i8;
                    i36 = i36;
                    i26 = i6;
                    i29 = i29;
                    C6835 c68318 = c6835;
                    i37 = i5;
                    c6835 = c68318;
                    int i4118 = i33;
                    list3 = list;
                    i33 = i4118;
                    break;
                case -1319989031:
                case -535323551:
                    strM6952 = strM6952;
                    if (i28 < i29) {
                        iM2763 = (C0619.m2761("᩵ۘ") + i25) * 11;
                        i20 = ((iM2763 ^ i24) * 22875) ^ 397907919;
                        i21 = 2108576431;
                    } else {
                        iM2763 = (C0773.m3169("᩸ۗ") ^ i24) * (-75);
                        i20 = ((iM2763 ^ i25) * 15543) ^ 1730363001;
                        i21 = -440169417;
                    }
                    i27 = iM2763 ^ i21;
                    i26 = i20;
                    strM6952 = strM6952;
                    break;
                case -1267538238:
                case 1227188147:
                    i29 = i29;
                    strM6952 = strM6952;
                    i32 = c9817.f31625;
                    iM3169 = C0773.m3169("ᩴܽ") ^ i25;
                    i2 = ((iM3169 ^ i24) * (-27669)) ^ 202850059;
                    i3 = -1407269175;
                    i22 = iM3169 ^ i3;
                    strM6952 = strM6952;
                    int i4119 = i29;
                    i27 = i22;
                    i26 = i2;
                    i29 = i4119;
                    break;
                case -1117481775:
                case -1010930158:
                    C17202.m40378(abstractC22044M2354);
                    throw th;
                case -885589107:
                case 1720945318:
                    i29 = i29;
                    strM6952 = strM6952;
                    if (zM4851) {
                        iM3169 = C0619.m2761("ۢۖ") ^ i25;
                        i2 = ((iM3169 ^ i24) * (-8241)) ^ 1858596628;
                        i3 = 730241084;
                    } else {
                        iM3169 = (C0773.m3169("ۤۜ") + i24) * 25;
                        i2 = ((iM3169 ^ i25) * 12895) ^ (-1157285495);
                        i3 = 1548532642;
                    }
                    i22 = iM3169 ^ i3;
                    strM6952 = strM6952;
                    int i41110 = i29;
                    i27 = i22;
                    i26 = i2;
                    i29 = i41110;
                    break;
                case -873590829:
                case 560566151:
                    i29 = i29;
                    strM6952 = strM6952;
                    if (zM8058) {
                        iM3169 = (i24 - C0773.m3169("ۨ֡")) * (-79);
                        i2 = ((iM3169 ^ i25) * 17787) ^ 431891452;
                        i3 = 652678651;
                    } else {
                        iM3169 = C0619.m2761("ۘۗ") ^ i24;
                        i2 = ((iM3169 ^ i25) * 22889) ^ (-1716760709);
                        i3 = -957594476;
                    }
                    i22 = iM3169 ^ i3;
                    strM6952 = strM6952;
                    int i41111 = i29;
                    i27 = i22;
                    i26 = i2;
                    i29 = i41111;
                    break;
                case -865389520:
                case 1145443155:
                    i5 = i37;
                    list = list3;
                    HashSet hashSet3 = new HashSet();
                    C14597 c14599 = new C14597();
                    C9817 c9819 = new C9817();
                    c9819.f31626 = null;
                    c9819.f31625 = 0;
                    c9819.f31624 = i;
                    c9819.f31628 = new C6835[i];
                    c9819.f31627 = new List[i];
                    c9819.f31629 = new C4157[i];
                    hashSet = hashSet3;
                    c14597 = c14599;
                    c9817 = c9819;
                    bool = null;
                    i9 = 0;
                    z2 = false;
                    int iM31611 = C0773.m3169("᩻ܳ") ^ i24;
                    i6 = ((iM31611 ^ i25) * (-12829)) ^ 737669746;
                    i39 = i39;
                    i31 = i31;
                    strM7820 = strM7820;
                    strM6952 = strM6952;
                    i28 = i28;
                    i38 = i38;
                    i32 = i32;
                    abstractC22044M2354 = abstractC22044M2354;
                    i36 = i9;
                    i27 = iM31611 ^ 1153597555;
                    i26 = i6;
                    i29 = i29;
                    C6835 c68319 = c6835;
                    i37 = i5;
                    c6835 = c68319;
                    int i41112 = i33;
                    list3 = list;
                    i33 = i41112;
                    break;
                case -844987468:
                case 1695189231:
                    i28 = i28;
                    i29 = i29;
                    strM6952 = strM6952;
                    abstractC22044M2354 = abstractC22044M2354;
                    z = z2 ? 1 : 0;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM7820 = strM7820;
                    i12 = i39;
                    i13 = i31;
                    int i62 = i37;
                    c6835 = c6835;
                    i5 = i62;
                    List list13 = list3;
                    i33 = i33;
                    list = list13;
                    try {
                        C8002 c8004 = (C8002) C3690.m11998(list, i30);
                        try {
                            zM8059 = C2375.m8058(c4772);
                            int iM31612 = C0773.m3169("᩺ۜ") ^ i24;
                            i10 = ((iM31612 ^ i25) * (-14069)) ^ 182841504;
                            i11 = iM31612 ^ 247861438;
                            c8002 = c8004;
                            i39 = i12;
                            i31 = i13;
                            strM7820 = strM7820;
                            strM6952 = strM6952;
                            i29 = i29;
                            i38 = i38;
                            i32 = i32;
                            abstractC22044M2354 = abstractC22044M2354;
                            i36 = i36;
                            z2 = z ? 1 : 0;
                        } catch (Throwable th18) {
                            th = th18;
                            c8002 = c8004;
                            listM51728 = list;
                            z2 = z ? 1 : 0;
                            th = th;
                            list = listM51728;
                            int iM27618 = C0619.m2761("᩻᩶") ^ i24;
                            i10 = ((iM27618 ^ i25) * (-15929)) ^ 511701329;
                            i11 = iM27618 ^ (-1323083296);
                            i39 = i12;
                            i31 = i13;
                            strM7820 = strM7820;
                            strM6952 = strM6952;
                            i29 = i29;
                            i38 = i38;
                            i32 = i32;
                            abstractC22044M2354 = abstractC22044M2354;
                            i36 = i36;
                        }
                    } catch (Throwable th19) {
                        th = th19;
                        listM51728 = list;
                        z2 = z;
                        th = th;
                        list = listM51728;
                        int iM27619 = C0619.m2761("᩻᩶") ^ i24;
                        i10 = ((iM27619 ^ i25) * (-15929)) ^ 511701329;
                        i11 = iM27619 ^ (-1323083296);
                        i39 = i12;
                        i31 = i13;
                        strM7820 = strM7820;
                        strM6952 = strM6952;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC22044M2354 = abstractC22044M2354;
                        i36 = i36;
                        int i41113 = i28;
                        i27 = i11;
                        i26 = i10;
                        i28 = i41113;
                        C6835 c683110 = c6835;
                        i37 = i5;
                        c6835 = c683110;
                        int i41114 = i33;
                        list3 = list;
                        i33 = i41114;
                        break;
                    }
                    int i41115 = i28;
                    i27 = i11;
                    i26 = i10;
                    i28 = i41115;
                    C6835 c683111 = c6835;
                    i37 = i5;
                    c6835 = c683111;
                    int i41116 = i33;
                    list3 = list;
                    i33 = i41116;
                    break;
                case -841031271:
                case 209279014:
                    strM6952 = strM6952;
                    try {
                        i29 = c9817.f31624;
                        iM2763 = C0619.m2761("ۘۛ") ^ i25;
                        i20 = ((iM2763 ^ i24) * (-25227)) ^ (-109140346);
                        i21 = -1451849906;
                        i27 = iM2763 ^ i21;
                        i26 = i20;
                        strM6952 = strM6952;
                    } catch (Throwable th20) {
                        th = th20;
                        i12 = i39;
                        i13 = i31;
                        int i510 = i37;
                        c6835 = c6835;
                        i5 = i510;
                        List list14 = list3;
                        i33 = i33;
                        list = list14;
                        th = th;
                        strM7820 = strM7820;
                        z2 = z2;
                        int iM276110 = C0619.m2761("᩻᩶") ^ i24;
                        i10 = ((iM276110 ^ i25) * (-15929)) ^ 511701329;
                        i11 = iM276110 ^ (-1323083296);
                        i39 = i12;
                        i31 = i13;
                        strM7820 = strM7820;
                        strM6952 = strM6952;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC22044M2354 = abstractC22044M2354;
                        i36 = i36;
                        int i41117 = i28;
                        i27 = i11;
                        i26 = i10;
                        i28 = i41117;
                        C6835 c683112 = c6835;
                        i37 = i5;
                        c6835 = c683112;
                        int i41118 = i33;
                        list3 = list;
                        i33 = i41118;
                    }
                    break;
                case -825101232:
                case 830174619:
                    i29 = i29;
                    strM6952 = strM6952;
                    C6835[] c6835Arr2 = c9817.f31628;
                    try {
                        List[] listArr2 = c9817.f31627;
                        int iM27620 = C0619.m2761("ܿۧ") ^ i25;
                        i26 = ((iM27620 ^ i24) * 19781) ^ (-2091832764);
                        listArr = listArr2;
                        strM6952 = strM6952;
                        c6835Arr = c6835Arr2;
                        i29 = i29;
                        i27 = iM27620 ^ 1952032965;
                    } catch (Throwable th21) {
                        th = th21;
                        c6835Arr = c6835Arr2;
                        i29 = i29;
                        i12 = i39;
                        i13 = i31;
                        int i511 = i37;
                        c6835 = c6835;
                        i5 = i511;
                        List list15 = list3;
                        i33 = i33;
                        list = list15;
                        th = th;
                        i30 = i30;
                        z2 = z2;
                        int iM276111 = C0619.m2761("᩻᩶") ^ i24;
                        i10 = ((iM276111 ^ i25) * (-15929)) ^ 511701329;
                        i11 = iM276111 ^ (-1323083296);
                        i39 = i12;
                        i31 = i13;
                        strM7820 = strM7820;
                        strM6952 = strM6952;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC22044M2354 = abstractC22044M2354;
                        i36 = i36;
                        int i41119 = i28;
                        i27 = i11;
                        i26 = i10;
                        i28 = i41119;
                        C6835 c683113 = c6835;
                        i37 = i5;
                        c6835 = c683113;
                        int i411110 = i33;
                        list3 = list;
                        i33 = i411110;
                    }
                    break;
                case -796031940:
                case -273068906:
                    i30++;
                    i15 = 1;
                    i14 = i29;
                    i5 = i37;
                    list = list3;
                    int iM31613 = C0773.m3169("ۨۜ") ^ i25;
                    i39 = i39;
                    i31 = i31;
                    strM6952 = strM6952;
                    i29 = i14;
                    i32 = i32;
                    abstractC22044M2354 = abstractC22044M2354;
                    i36 = i36;
                    z2 = z2 ? 1 : 0;
                    i38 = i15;
                    i26 = ((iM31613 ^ i24) * 18377) ^ (-121100761);
                    i28 = i28;
                    i27 = iM31613 ^ 1241327542;
                    strM7820 = strM7820;
                    C6835 c683114 = c6835;
                    i37 = i5;
                    c6835 = c683114;
                    int i411111 = i33;
                    list3 = list;
                    i33 = i411111;
                    break;
                case -722563448:
                case -245452103:
                    C17202.m40378(abstractC22044M2354);
                    return;
                case -503984637:
                case 1200767381:
                    int i63 = i36;
                    i5 = i37;
                    list = list3;
                    c9817.f31629[i63] = new C4157();
                    c9817.f31627[i63] = new ArrayList();
                    i9 = i63 + 1;
                    int iM31614 = C0773.m3169("᩻ܳ") ^ i24;
                    i6 = ((iM31614 ^ i25) * (-12829)) ^ 737669746;
                    i39 = i39;
                    i31 = i31;
                    strM7820 = strM7820;
                    strM6952 = strM6952;
                    i28 = i28;
                    i38 = i38;
                    i32 = i32;
                    abstractC22044M2354 = abstractC22044M2354;
                    i36 = i9;
                    i27 = iM31614 ^ 1153597555;
                    i26 = i6;
                    i29 = i29;
                    C6835 c683115 = c6835;
                    i37 = i5;
                    c6835 = c683115;
                    int i411112 = i33;
                    list3 = list;
                    i33 = i411112;
                    break;
                case -444842580:
                case 1707352803:
                    i29 = i29;
                    strM6952 = strM6952;
                    if (i32 > 5242880) {
                        iM3169 = (C0619.m2761("ۤܽ") + i24) * 67;
                        i2 = ((iM3169 ^ i25) * (-23489)) ^ (-1270869859);
                        i3 = -825748323;
                    } else {
                        iM3169 = C0773.m3169("ܰᩴ") ^ i25;
                        i2 = ((iM3169 ^ i24) * 11931) ^ 241808753;
                        i3 = -1495763458;
                    }
                    i22 = iM3169 ^ i3;
                    strM6952 = strM6952;
                    int i411113 = i29;
                    i27 = i22;
                    i26 = i2;
                    i29 = i411113;
                    break;
                case -340790054:
                case 820109510:
                    strM6952 = strM6952;
                    i28 = 0;
                    iM2763 = C0619.m2761("᩺ܶ") ^ i24;
                    i20 = ((iM2763 ^ i25) * (-31025)) ^ (-350151320);
                    i21 = 2128878451;
                    i27 = iM2763 ^ i21;
                    i26 = i20;
                    strM6952 = strM6952;
                    break;
                case -108817244:
                case 73981501:
                    i29 = i29;
                    strM6952 = strM6952;
                    if (zM6317) {
                        iM3169 = C0619.m2761("۬ܿ") ^ i25;
                        i2 = ((iM3169 ^ i24) * 15313) ^ (-1204845859);
                        i3 = -1982649643;
                    } else {
                        iM3169 = (C0619.m2761("֡ۨ") ^ i24) * (-111);
                        i2 = ((iM3169 ^ i25) * (-26839)) ^ 726371581;
                        i3 = -396553769;
                    }
                    i22 = iM3169 ^ i3;
                    strM6952 = strM6952;
                    int i411114 = i29;
                    i27 = i22;
                    i26 = i2;
                    i29 = i411114;
                    break;
                case -2726265:
                case 912245954:
                    i28 = i28;
                    i29 = i29;
                    strM6952 = strM6952;
                    abstractC22044M2354 = abstractC22044M2354;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM7820 = strM7820;
                    i4 = i39;
                    i31 = i31;
                    int i64 = i37;
                    c6835 = c6835;
                    i5 = i64;
                    List list16 = list3;
                    i33 = i33;
                    list = list16;
                    if (i36 < i) {
                        iM2761 = (i24 - C0619.m2761("ᩴۤ")) * (-83);
                        i6 = ((iM2761 ^ i25) * (-16039)) ^ (-1761827881);
                        i7 = 912208646;
                    } else {
                        iM2761 = (C0773.m3169("ۘ֨") + i25) * (-115);
                        i6 = ((iM2761 ^ i24) * (-8019)) ^ 178976724;
                        i7 = 1840511614;
                    }
                    i8 = iM2761 ^ i7;
                    i39 = i4;
                    i31 = i31;
                    strM7820 = strM7820;
                    strM6952 = strM6952;
                    i28 = i28;
                    i38 = i38;
                    i32 = i32;
                    abstractC22044M2354 = abstractC22044M2354;
                    i27 = i8;
                    i36 = i36;
                    i26 = i6;
                    i29 = i29;
                    C6835 c683116 = c6835;
                    i37 = i5;
                    c6835 = c683116;
                    int i411115 = i33;
                    list3 = list;
                    i33 = i411115;
                    break;
                case 10238830:
                case 137703152:
                    i28 = i28;
                    i29 = i29;
                    strM6952 = strM6952;
                    abstractC22044M2354 = abstractC22044M2354;
                    z2 = z2 ? 1 : 0;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM7820 = strM7820;
                    i12 = i39;
                    i13 = i31;
                    int i65 = i37;
                    c6835 = c6835;
                    i5 = i65;
                    List list17 = list3;
                    i33 = i33;
                    list = list17;
                    if (i30 < i5) {
                        iM31610 = C0773.m3169("ܽܶ") ^ i24;
                        i16 = ((iM31610 ^ i25) * (-3179)) ^ 1533404183;
                        i17 = 395581407;
                    } else {
                        iM31610 = C0773.m3169("ܳᩳ") ^ i25;
                        i16 = ((iM31610 ^ i24) * (-13989)) ^ 1488908491;
                        i17 = 1361003575;
                    }
                    i18 = iM31610 ^ i17;
                    i39 = i12;
                    i31 = i13;
                    strM6952 = strM6952;
                    i28 = i28;
                    i29 = i29;
                    i32 = i32;
                    abstractC22044M2354 = abstractC22044M2354;
                    i36 = i36;
                    z2 = z2;
                    i27 = i18;
                    i26 = i16;
                    strM7820 = strM7820;
                    i38 = i38;
                    C6835 c683117 = c6835;
                    i37 = i5;
                    c6835 = c683117;
                    int i411116 = i33;
                    list3 = list;
                    i33 = i411116;
                    break;
                case 159491137:
                case 1526241706:
                    i29 = i29;
                    strM6952 = strM6952;
                    i35 = i28 + 1;
                    strM7820 = C2317.m7820(i35);
                    C0269.m1783(c4772, strM7820);
                    c4772.mo16839(z2 ? 1 : 0);
                    C6835[] c6835Arr3 = c9817.f31628;
                    c6835 = c6835Arr3[i28];
                    c6835Arr3[i28] = null;
                    itM7968 = C2354.m7968(c9817.f31627[i28]);
                    iM3169 = C0773.m3169("ۘۘ") ^ i25;
                    i2 = ((iM3169 ^ i24) * 5083) ^ 1045881745;
                    i3 = 1623904748;
                    i22 = iM3169 ^ i3;
                    strM6952 = strM6952;
                    int i411117 = i29;
                    i27 = i22;
                    i26 = i2;
                    i29 = i411117;
                    break;
                case 410942907:
                case 1014872151:
                    i28 = i28;
                    i29 = i29;
                    strM6952 = strM6952;
                    abstractC22044M2354 = abstractC22044M2354;
                    z2 = z2 ? 1 : 0;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM7820 = strM7820;
                    i12 = i39;
                    i13 = i31;
                    int i66 = i37;
                    c6835 = c6835;
                    i5 = i66;
                    List list18 = list3;
                    i33 = i33;
                    list = list18;
                    try {
                        C3033.m9854(c4772, C0773.m3169(C2419.m8166(f70794, 66, 3, i12)) ^ 2118465760);
                        Arrays.fill(c9817.f31629, (Object) null);
                        Runtime.getRuntime().gc();
                        iM31610 = C0619.m2761("᩸ۘ") ^ i25;
                        i16 = ((iM31610 ^ i24) * (-2941)) ^ 122082867;
                        i17 = 2038635402;
                        i18 = iM31610 ^ i17;
                        i39 = i12;
                        i31 = i13;
                        strM6952 = strM6952;
                        i28 = i28;
                        i29 = i29;
                        i32 = i32;
                        abstractC22044M2354 = abstractC22044M2354;
                        i36 = i36;
                        z2 = z2;
                        i27 = i18;
                        i26 = i16;
                        strM7820 = strM7820;
                        i38 = i38;
                        C6835 c683118 = c6835;
                        i37 = i5;
                        c6835 = c683118;
                        int i411118 = i33;
                        list3 = list;
                        i33 = i411118;
                    } catch (Throwable th22) {
                        th = th22;
                        strM7820 = strM7820;
                        th = th;
                        strM7820 = strM7820;
                        z2 = z2;
                        int iM276112 = C0619.m2761("᩻᩶") ^ i24;
                        i10 = ((iM276112 ^ i25) * (-15929)) ^ 511701329;
                        i11 = iM276112 ^ (-1323083296);
                        i39 = i12;
                        i31 = i13;
                        strM7820 = strM7820;
                        strM6952 = strM6952;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC22044M2354 = abstractC22044M2354;
                        i36 = i36;
                        int i411119 = i28;
                        i27 = i11;
                        i26 = i10;
                        i28 = i411119;
                        C6835 c683119 = c6835;
                        i37 = i5;
                        c6835 = c683119;
                        int i4111110 = i33;
                        list3 = list;
                        i33 = i4111110;
                    }
                    break;
                case 554935777:
                case 1075278742:
                    i29 = i29;
                    strM6952 = strM6952;
                    c9817.f31625 = z2 ? 1 : 0;
                    Runtime.getRuntime().gc();
                    iM3169 = C0773.m3169("ܰᩴ") ^ i25;
                    i2 = ((iM3169 ^ i24) * 11931) ^ 241808753;
                    i3 = -1495763458;
                    i22 = iM3169 ^ i3;
                    strM6952 = strM6952;
                    int i4111111 = i29;
                    i27 = i22;
                    i26 = i2;
                    i29 = i4111111;
                    break;
                case 621994680:
                case 2086359989:
                    i28 = i28;
                    i29 = i29;
                    i30 = i30;
                    strM6952 = strM6952;
                    abstractC22044M2354 = abstractC22044M2354;
                    z2 = z2 ? 1 : 0;
                    i32 = i32;
                    i36 = i36;
                    i38 = i38;
                    strM7820 = strM7820;
                    i12 = i39;
                    i13 = i31;
                    int i67 = i37;
                    c6835 = c6835;
                    i5 = i67;
                    List list19 = list3;
                    i33 = i33;
                    list = list19;
                    if (zM8059) {
                        iM2762 = C0619.m2761("۫᩻") ^ i24;
                        i16 = ((iM2762 ^ i25) * 20053) ^ (-1771665176);
                        i19 = -2084554016;
                    } else {
                        iM2762 = C0619.m2761("ۤᩴ") ^ i25;
                        i16 = ((iM2762 ^ i24) * 13657) ^ (-272125347);
                        i19 = -1338048939;
                    }
                    i18 = iM2762 ^ i19;
                    i39 = i12;
                    i31 = i13;
                    strM6952 = strM6952;
                    i28 = i28;
                    i29 = i29;
                    i30 = i30;
                    i32 = i32;
                    abstractC22044M2354 = abstractC22044M2354;
                    i36 = i36;
                    z2 = z2;
                    i27 = i18;
                    i26 = i16;
                    strM7820 = strM7820;
                    i38 = i38;
                    C6835 c6831110 = c6835;
                    i37 = i5;
                    c6835 = c6831110;
                    int i4111112 = i33;
                    list3 = list;
                    i33 = i4111112;
                    break;
                case 663930596:
                case 1610805252:
                    i14 = i29;
                    i5 = i37;
                    list = list3;
                    i15 = i34;
                    i30 = 0;
                    int iM31615 = C0773.m3169("ۨۜ") ^ i25;
                    i39 = i39;
                    i31 = i31;
                    strM6952 = strM6952;
                    i29 = i14;
                    i32 = i32;
                    abstractC22044M2354 = abstractC22044M2354;
                    i36 = i36;
                    z2 = z2 ? 1 : 0;
                    i38 = i15;
                    i26 = ((iM31615 ^ i24) * 18377) ^ (-121100761);
                    i28 = i28;
                    i27 = iM31615 ^ 1241327542;
                    strM7820 = strM7820;
                    C6835 c6831111 = c6835;
                    i37 = i5;
                    c6835 = c6831111;
                    int i4111113 = i33;
                    list3 = list;
                    i33 = i4111113;
                    break;
                case 699124416:
                case 1344284822:
                    i29 = i29;
                    strM6952 = strM6952;
                    zM6317 = C1826.m6317(itM7968);
                    iM3169 = (C0773.m3169("ۜ۬") ^ i24) * (-75);
                    i2 = ((iM3169 ^ i25) * (-18595)) ^ 1991031460;
                    i3 = 1877930096;
                    i22 = iM3169 ^ i3;
                    strM6952 = strM6952;
                    int i4111114 = i29;
                    i27 = i22;
                    i26 = i2;
                    i29 = i4111114;
                    break;
                case 1027116897:
                case 1157767844:
                    i33 = 0;
                    iM3169 = (C0773.m3169("ۛۖ") + i24) * 95;
                    i2 = ((iM3169 ^ i25) * 12453) ^ 139992831;
                    i3 = 183533191;
                    i22 = iM3169 ^ i3;
                    strM6952 = strM6952;
                    int i4111115 = i29;
                    i27 = i22;
                    i26 = i2;
                    i29 = i4111115;
                    break;
                case 1455746343:
                case 1694968242:
                    i28 = i28;
                    int i68 = i37;
                    c6835 = c6835;
                    i5 = i68;
                    List list20 = list3;
                    i33 = i33;
                    list = list20;
                    abstractC22044M2354 = C0487.m2354(C6382.f21563);
                    int iM31616 = (C0773.m3169("ܰۡ") ^ i25) * 45;
                    i10 = ((iM31616 ^ i24) * (-8119)) ^ 753108479;
                    i11 = iM31616 ^ 1818204962;
                    i39 = i39;
                    i31 = i31;
                    strM7820 = strM7820;
                    strM6952 = strM6952;
                    i38 = i38;
                    i32 = i32;
                    i36 = i36;
                    i29 = i29;
                    int i4111116 = i28;
                    i27 = i11;
                    i26 = i10;
                    i28 = i4111116;
                    C6835 c6831112 = c6835;
                    i37 = i5;
                    c6835 = c6831112;
                    int i4111117 = i33;
                    list3 = list;
                    i33 = i4111117;
                    break;
                default:
                    i29 = i29;
                    strM6952 = strM6952;
                    try {
                        c6835.f22707.addAll(C23916.m53418(C2834.m9334(C2485.m8348((AbstractC22044) C0950.m3796(itM7968)))));
                        iM3169 = C0773.m3169("ۘۘ") ^ i25;
                        i2 = ((iM3169 ^ i24) * 5083) ^ 1045881745;
                        i3 = 1623904748;
                        i22 = iM3169 ^ i3;
                        strM6952 = strM6952;
                        int i4111118 = i29;
                        i27 = i22;
                        i26 = i2;
                        i29 = i4111118;
                    } catch (Throwable th23) {
                        th = th23;
                        i29 = i29;
                        i28 = i28;
                        i12 = i39;
                        i13 = i31;
                        int i512 = i37;
                        c6835 = c6835;
                        i5 = i512;
                        List list110 = list3;
                        i33 = i33;
                        list = list110;
                        th = th;
                        strM7820 = strM7820;
                        z2 = z2;
                        int iM276113 = C0619.m2761("᩻᩶") ^ i24;
                        i10 = ((iM276113 ^ i25) * (-15929)) ^ 511701329;
                        i11 = iM276113 ^ (-1323083296);
                        i39 = i12;
                        i31 = i13;
                        strM7820 = strM7820;
                        strM6952 = strM6952;
                        i29 = i29;
                        i38 = i38;
                        i32 = i32;
                        abstractC22044M2354 = abstractC22044M2354;
                        i36 = i36;
                        int i4111119 = i28;
                        i27 = i11;
                        i26 = i10;
                        i28 = i4111119;
                        C6835 c6831113 = c6835;
                        i37 = i5;
                        c6835 = c6831113;
                        int i41111110 = i33;
                        list3 = list;
                        i33 = i41111110;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49621(C25179 c25179, C8850 c8850, String str) throws Throwable {
        AbstractC22044 abstractC22044M2354 = null;
        Throwable th = null;
        int i = -1443113480;
        int i2 = C0773.f2792;
        int i3 = C2419.f7754;
        int iM2761 = C0619.m2761("֡ܶ") ^ i3;
        int i4 = ((iM2761 ^ i2) * 11653) ^ 2000511151;
        int i5 = -422836856;
        while (true) {
            i = ((((i ^ i2) * 29883) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2087962006:
                case -1022632296:
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0619.m2761("ۙܽ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 27729) ^ 1734676460;
                        i5 = 349380357;
                    } else {
                        iM2761 = (C0619.m2761("֫ᩴ") ^ i2) * 91;
                        i4 = ((iM2761 ^ i3) * (-15443)) ^ 1592233850;
                        i5 = 1851897094;
                    }
                    break;
                case -1764332669:
                case 1404655911:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0619.m2761("ۙܽ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 27729) ^ 1734676460;
                        i5 = 349380357;
                    } else {
                        iM2761 = C0773.m3169("᩻ۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 16469) ^ 1586573956;
                        i5 = -1717619126;
                    }
                    break;
                case -1685403524:
                case 1522134321:
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0619.m2761("᩷ۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 21831) ^ 1492248205;
                        i5 = 965045276;
                    } else {
                        iM2761 = C0619.m2761("۫ۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-5329)) ^ 787757813;
                        i5 = -464990602;
                    }
                    break;
                case -1074984641:
                case 300665865:
                    if (C1321.f4751 >= 0) {
                        iM2761 = (C0773.m3169("᩵᩻") ^ i3) * 53;
                        i4 = ((iM2761 ^ i2) * 16379) ^ (-517059315);
                        i5 = -1567737875;
                    } else {
                        iM2761 = (C0619.m2761("ۢܰ") ^ i2) * (-43);
                        i4 = ((iM2761 ^ i3) * (-25625)) ^ 1673531437;
                        i5 = 1148107060;
                    }
                    break;
                case -940711054:
                case -636244152:
                    C3998.m12920();
                    iM2761 = C0619.m2761("ۛܽ") ^ i3;
                    i4 = ((iM2761 ^ i2) * 3137) ^ 1741408641;
                    i5 = -1609981224;
                    break;
                case -818598735:
                case -182361012:
                    C17202.m40378(abstractC22044M2354);
                    throw th;
                case -664921837:
                case 1716370472:
                    C3690.m11987();
                    if (C2834.m9344() >= 0) {
                        iM2761 = (C0773.m3169("᩵᩻") ^ i3) * 53;
                        i4 = ((iM2761 ^ i2) * 16379) ^ (-517059315);
                        i5 = -1567737875;
                    } else {
                        iM2761 = C0619.m2761("᩷ۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 21831) ^ 1492248205;
                        i5 = 965045276;
                    }
                    break;
                case -491809807:
                case -85184885:
                    RunnableC1848.m6360();
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0619.m2761("᩷ۧ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 21831) ^ 1492248205;
                        i5 = 965045276;
                    } else {
                        iM2761 = C0619.m2761("ۛܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 3137) ^ 1741408641;
                        i5 = -1609981224;
                    }
                    break;
                case -363735504:
                case 679393424:
                    AbstractC0641.m2813();
                    return;
                case -255357544:
                case 1796857486:
                    C17202.m40378(abstractC22044M2354);
                    return;
                case -80423865:
                case 1544295365:
                    if (RunnableC1848.f6235) {
                        iM2761 = (C0619.m2761("᩸ܺ") + i3) * (-61);
                        i4 = ((iM2761 ^ i2) * (-3957)) ^ 1774813685;
                        i5 = -1118025834;
                    } else {
                        iM2761 = (C0773.m3169("ۤ۠") + i3) * 101;
                        i4 = ((iM2761 ^ i2) * 16341) ^ 258462321;
                        i5 = 1411015220;
                    }
                    break;
                case 271781627:
                case 1384537449:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("ۙܽ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 27729) ^ 1734676460;
                        i5 = 349380357;
                    } else {
                        iM2761 = (C0619.m2761("᩸۫") + i3) * 15;
                        i4 = ((iM2761 ^ i2) * (-10675)) ^ 1567516671;
                        i5 = 1690180271;
                    }
                    break;
                case 286855499:
                case 504857003:
                    if (C3077.f9998) {
                        iM2761 = (C0773.m3169("ܿۗ") ^ i2) * 9;
                        i4 = ((iM2761 ^ i3) * 14775) ^ (-148690617);
                        i5 = 1427489584;
                    } else {
                        iM2761 = (C0773.m3169("᩵᩻") ^ i3) * 53;
                        i4 = ((iM2761 ^ i2) * 16379) ^ (-517059315);
                        i5 = -1567737875;
                    }
                    break;
                case 809094996:
                case 901032010:
                    if (C2834.f9334 <= 0) {
                        iM2761 = (C0619.m2761("᩸ܺ") + i3) * (-61);
                        i4 = ((iM2761 ^ i2) * (-3957)) ^ 1774813685;
                        i5 = -1118025834;
                    } else {
                        iM2761 = C0619.m2761("֫᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-20819)) ^ (-925636269);
                        i5 = 1336123859;
                    }
                    break;
                case 1024002342:
                case 1027412822:
                    if (C1146.f4234 >= 0) {
                        iM2761 = C0619.m2761("ۛܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 3137) ^ 1741408641;
                        i5 = -1609981224;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۧ۬")) * (-19);
                        i4 = ((iM2761 ^ i2) * 4579) ^ (-24022568);
                        i5 = -835447158;
                    }
                    break;
                case 1259876325:
                case 1739822477:
                    if (C11235.f35427 < 0) {
                        iM2761 = (C0619.m2761("᩸ܺ") + i3) * (-61);
                        i4 = ((iM2761 ^ i2) * (-3957)) ^ 1774813685;
                        i5 = -1118025834;
                    } else {
                        iM2761 = C0619.m2761("ۛܽ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 3137) ^ 1741408641;
                        i5 = -1609981224;
                    }
                    break;
                case 1271920374:
                case 1857778103:
                    if (C4282.f15546 <= 0) {
                        iM2761 = (C0773.m3169("᩵᩻") ^ i3) * 53;
                        i4 = ((iM2761 ^ i2) * 16379) ^ (-517059315);
                        i5 = -1567737875;
                    } else {
                        iM2761 = (C0619.m2761("᩶ۨ") ^ i3) * 15;
                        i4 = ((iM2761 ^ i2) * 24459) ^ (-1439060811);
                        i5 = -881977214;
                    }
                    break;
                case 1655600392:
                case 1987028699:
                    try {
                        c8850.m52044(abstractC22044M2354);
                        C3779.m12255(c25179, str);
                        abstractC22044M2354.m49842(c25179.m56119(), (InterfaceC3573) null);
                        iM2761 = C0619.m2761("۬ۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 10733) ^ 821700649;
                        i5 = 428309343;
                    } catch (Throwable th2) {
                        th = th2;
                        iM2761 = C0619.m2761("ۧۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-18083)) ^ 1368765576;
                        i5 = 1195520481;
                    }
                    break;
                default:
                    abstractC22044M2354 = C0487.m2354(C6382.f21563);
                    iM2761 = (C0773.m3169("۫ܰ") + i2) * 97;
                    i4 = ((iM2761 ^ i3) * (-26785)) ^ (-956335953);
                    i5 = 217171590;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x020e A[PHI: r6 r8
      0x020e: PHI (r6v7 int) = (r6v2 int), (r6v4 int), (r6v2 int), (r6v2 int) binds: [B:117:0x020e, B:54:0x020c, B:38:0x015c, B:17:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x020e: PHI (r8v7 int) = (r8v2 int), (r8v2 int), (r8v4 int), (r8v2 int) binds: [B:117:0x020e, B:54:0x020c, B:38:0x015c, B:17:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x030d A[PHI: r7 r12 r13 r15
      0x030d: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v5 int) binds: [B:74:0x030b, B:50:0x01e3, B:46:0x01be] A[DONT_GENERATE, DONT_INLINE]
      0x030d: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:74:0x030b, B:50:0x01e3, B:46:0x01be] A[DONT_GENERATE, DONT_INLINE]
      0x030d: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:74:0x030b, B:50:0x01e3, B:46:0x01be] A[DONT_GENERATE, DONT_INLINE]
      0x030d: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]) binds: [B:74:0x030b, B:50:0x01e3, B:46:0x01be] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        int iM2761;
        int i2;
        int i3;
        int iM2762;
        int i4;
        short[] sArr;
        char c;
        C21926 c21926 = this;
        int i5 = -1878999703;
        int i6 = C23916.f77426;
        int i7 = AbstractC0116.f1064;
        int iM3169 = C0773.m3169("᩺۫") ^ i6;
        int i8 = ((iM3169 ^ i7) * (-20999)) ^ 1262131791;
        int i9 = iM3169 ^ (-859911272);
        C23255 c23255 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        char c2 = 0;
        int iM31610 = 0;
        int iM31611 = 0;
        int iM31612 = 0;
        int iM31613 = 0;
        int i10 = 0;
        int i11 = 0;
        TextView textView = null;
        short[] sArr4 = null;
        TextView textView2 = null;
        int i12 = 0;
        while (true) {
            i5 = i9 ^ (i8 & (((i5 ^ i7) * 4749) >> 31));
            switch (i5) {
                case -2127443436:
                case 1923710104:
                    C2310.m7800(c23255, f70793);
                    iM2761 = C0773.m3169("۠֡") ^ i6;
                    i2 = ((iM2761 ^ i7) * 22555) ^ (-1701526240);
                    i3 = 737580113;
                    i9 = iM2761 ^ i3;
                    i8 = i2;
                    break;
                case -1883326249:
                case 1915453893:
                    C2023.m6954(textView2, 2122667946 ^ iM31613);
                    if (c23255.m54099() > 0) {
                        iM2761 = (i7 - C0619.m2761("۟ᩳ")) * 33;
                        i2 = ((iM2761 ^ i6) * 6421) ^ 1966762194;
                        i3 = -1107549202;
                    } else {
                        iM2761 = (C0619.m2761("ۙܿ") + i6) * 45;
                        i2 = ((iM2761 ^ i7) * (-14151)) ^ (-1531996836);
                        i3 = 682965876;
                    }
                    i9 = iM2761 ^ i3;
                    i8 = i2;
                    break;
                case -1517769306:
                case -890750976:
                    iM31610 = C0773.m3169(C2834.m9343(f70794, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 3, i12));
                    if (C3779.f12953 <= 0) {
                        iM2761 = (i7 - C0773.m3169("ᩴܽ")) * 11;
                        i2 = ((iM2761 ^ i6) * 10233) ^ 2141118729;
                        i3 = 1206400807;
                    } else {
                        iM2761 = (i6 - C0773.m3169("ۗ᩶")) * 41;
                        i2 = ((iM2761 ^ i7) * (-5243)) ^ 650752203;
                        i3 = 528186057;
                    }
                    i9 = iM2761 ^ i3;
                    i8 = i2;
                    break;
                case -1509629908:
                case -36296590:
                    f70793 = C1080.m4058(AbstractC0116.m1233(c23255));
                    iM2761 = (C0773.m3169("ܰܺ") + i6) * (-123);
                    i2 = ((iM2761 ^ i7) * (-27563)) ^ 1411650378;
                    i3 = -1813347362;
                    i9 = iM2761 ^ i3;
                    i8 = i2;
                    break;
                case -1502263802:
                case 701369761:
                    if (C3492.f12043 > 0) {
                        iM2761 = (C0619.m2761("ܺۙ") + i6) * 9;
                        i2 = ((iM2761 ^ i7) * (-21245)) ^ 2065979843;
                        i3 = 1541939176;
                        i9 = iM2761 ^ i3;
                        i8 = i2;
                    } else {
                        iM2762 = C0619.m2761("ܽۡ") ^ i6;
                        i8 = ((iM2762 ^ i7) * (-6199)) ^ (-665446719);
                        i4 = -1765560447;
                        i9 = iM2762 ^ i4;
                        c21926 = this;
                    }
                    break;
                case -1433219638:
                case -488530780:
                    C1080.m4060(textView2, 2116855035 ^ iM31611);
                    if (c23255.m54099() > 0) {
                        iM2761 = C0619.m2761("ܺܶ") ^ i7;
                        i2 = ((iM2761 ^ i6) * 6741) ^ (-128497648);
                        i3 = -1575290196;
                    } else {
                        iM2761 = (C0773.m3169("ܰܺ") + i6) * (-123);
                        i2 = ((iM2761 ^ i7) * (-27563)) ^ 1411650378;
                        i3 = -1813347362;
                    }
                    i9 = iM2761 ^ i3;
                    i8 = i2;
                    break;
                case -1407181997:
                case -859511604:
                    C1542.m5459();
                    iM2761 = (i7 - C0773.m3169("ᩴܽ")) * 11;
                    i2 = ((iM2761 ^ i6) * 10233) ^ 2141118729;
                    i3 = 1206400807;
                    i9 = iM2761 ^ i3;
                    i8 = i2;
                    break;
                case -1334408876:
                case 428224157:
                    iM31612 = C0773.m3169(C2878.m9486(f70794, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 3, i12));
                    if (C3448.f11240 >= 0) {
                        iM2761 = (i7 - C0773.m3169("ᩴܽ")) * 11;
                        i2 = ((iM2761 ^ i6) * 10233) ^ 2141118729;
                        i3 = 1206400807;
                    } else {
                        iM2761 = C0773.m3169("᩶᩷") ^ i6;
                        i2 = ((iM2761 ^ i7) * (-17417)) ^ 475025765;
                        i3 = 1689852607;
                    }
                    i9 = iM2761 ^ i3;
                    i8 = i2;
                    break;
                case -1048727702:
                case -251583191:
                    i12 = 53349;
                    iM2761 = (C0619.m2761("ۚᩴ") ^ i7) * (-3);
                    i2 = ((iM2761 ^ i6) * 13417) ^ 614738584;
                    i3 = 232043299;
                    i9 = iM2761 ^ i3;
                    i8 = i2;
                    break;
                case -978381704:
                case 666031102:
                    C2310.m7800(c23255, f70792);
                    iM2761 = C0773.m3169("۠֡") ^ i6;
                    i2 = ((iM2761 ^ i7) * 22555) ^ (-1701526240);
                    i3 = 737580113;
                    i9 = iM2761 ^ i3;
                    i8 = i2;
                    break;
                case -964580559:
                case 1669865541:
                    i12 = 31137;
                    iM2761 = (C0619.m2761("ۚᩴ") ^ i7) * (-3);
                    i2 = ((iM2761 ^ i6) * 13417) ^ 614738584;
                    i3 = 232043299;
                    i9 = iM2761 ^ i3;
                    i8 = i2;
                    break;
                case -844236288:
                case 38682453:
                    c21926.f70797 = i;
                    textView2 = c21926.f70798;
                    textView = c21926.f70795;
                    c23255 = c21926.f70796;
                    if (i == 0) {
                        iM2761 = (C0773.m3169("ܶ֫") + i7) * q.h;
                        i2 = ((iM2761 ^ i6) * 14073) ^ (-1533099862);
                        i3 = 437772592;
                    } else {
                        iM2761 = C0619.m2761("ܶ֡") ^ i7;
                        i2 = ((iM2761 ^ i6) * 25665) ^ (-2130904345);
                        i3 = -822730601;
                    }
                    i9 = iM2761 ^ i3;
                    i8 = i2;
                    break;
                case -808685253:
                case 1707202460:
                    sArr = f70794;
                    if (C20932.m47848() != 0) {
                        c = 'j';
                        int iM2763 = C0619.m2761("ۤ֫") ^ i7;
                        int i13 = ((iM2763 ^ i6) * (-1975)) ^ (-2061475918);
                        i9 = iM2763 ^ (-1570021123);
                        sArr2 = sArr;
                        c2 = c;
                        i8 = i13;
                        c21926 = this;
                    } else {
                        int iM2764 = (C0619.m2761("ۢ۠") ^ i7) * q.h;
                        int i14 = ((iM2764 ^ i6) * (-26793)) ^ (-621058638);
                        i9 = iM2764 ^ (-141508505);
                        sArr2 = sArr;
                        i8 = i14;
                        c2 = 'j';
                    }
                    break;
                case -804300516:
                case -747778667:
                    break;
                case -395237753:
                case 2123128788:
                    if (C2354.f7599 < 0) {
                        sArr = sArr2;
                        c = c2;
                        int iM2765 = C0619.m2761("ۤ֫") ^ i7;
                        int i15 = ((iM2765 ^ i6) * (-1975)) ^ (-2061475918);
                        i9 = iM2765 ^ (-1570021123);
                        sArr2 = sArr;
                        c2 = c;
                        i8 = i15;
                        c21926 = this;
                    } else {
                        iM2761 = (C0619.m2761("ܺۙ") + i6) * 9;
                        i2 = ((iM2761 ^ i7) * (-21245)) ^ 2065979843;
                        i3 = 1541939176;
                        i9 = iM2761 ^ i3;
                        i8 = i2;
                    }
                    break;
                case -305515867:
                case 1405803225:
                    if ((307686681 + i11) - i10 >= 0) {
                        iM2761 = C0773.m3169("᩵᩶") ^ i6;
                        i2 = ((iM2761 ^ i7) * (-19943)) ^ 1308957136;
                        i3 = -73551267;
                    } else {
                        iM2761 = (C0619.m2761("۠۫") + i7) * (-31);
                        i2 = ((iM2761 ^ i6) * (-11153)) ^ 1003661963;
                        i3 = 1185221590;
                    }
                    i9 = iM2761 ^ i3;
                    i8 = i2;
                    break;
                case -225246862:
                case 1899580006:
                    C2023.m6954(textView, 2099429686 ^ iM31610);
                    sArr4 = f70794;
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0773.m3169("ᩴۤ") ^ i7;
                        i2 = ((iM2761 ^ i6) * (-3471)) ^ 1959178601;
                        i3 = -328408629;
                    } else {
                        iM2761 = C0773.m3169("ۖۡ") ^ i7;
                        i2 = ((iM2761 ^ i6) * 7503) ^ 407190912;
                        i3 = 1651651198;
                    }
                    i9 = iM2761 ^ i3;
                    i8 = i2;
                    break;
                case -182019043:
                case 1857905819:
                    short s = sArr2[c2];
                    i10 = s * 35082;
                    i11 = s * s;
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0773.m3169("ᩴۤ") ^ i7;
                        i2 = ((iM2761 ^ i6) * (-3471)) ^ 1959178601;
                        i3 = -328408629;
                    } else {
                        iM2761 = (C0619.m2761("ᩴ֫") + i6) * (-105);
                        i2 = ((iM2761 ^ i7) * (-1221)) ^ 834689265;
                        i3 = -2068131406;
                    }
                    i9 = iM2761 ^ i3;
                    i8 = i2;
                    break;
                case -161569857:
                case 108690227:
                    if (C3099.f10023 <= 0) {
                        iM2762 = C0619.m2761("ܽۡ") ^ i6;
                        i8 = ((iM2762 ^ i7) * (-6199)) ^ (-665446719);
                        i4 = -1765560447;
                    } else {
                        iM2762 = (i7 - C0773.m3169("ۜ᩺")) * (-15);
                        i8 = ((iM2762 ^ i6) * (-13351)) ^ (-1176191103);
                        i4 = -588625588;
                    }
                    i9 = iM2762 ^ i4;
                    c21926 = this;
                    break;
                case -26118419:
                case 1051252333:
                    if (c21926.f70797 == i) {
                        iM2761 = (C0773.m3169("᩵ۜ") + i6) * 39;
                        i2 = ((iM2761 ^ i7) * (-25229)) ^ 692492956;
                        i3 = 688972023;
                    } else {
                        iM2761 = (i6 - C0773.m3169("ۨ᩹")) * 53;
                        i2 = ((iM2761 ^ i7) * (-18433)) ^ 1745313566;
                        i3 = -42763767;
                    }
                    i9 = iM2761 ^ i3;
                    i8 = i2;
                    break;
                case 428339157:
                case 1240338933:
                    if (C1321.f4751 < 0) {
                        iM2762 = C0619.m2761("ܽۡ") ^ i6;
                        i8 = ((iM2762 ^ i7) * (-6199)) ^ (-665446719);
                        i4 = -1765560447;
                        i9 = iM2762 ^ i4;
                        c21926 = this;
                    } else {
                        iM2761 = (i7 - C0773.m3169("ᩴܽ")) * 11;
                        i2 = ((iM2761 ^ i6) * 10233) ^ 2141118729;
                        i3 = 1206400807;
                        i9 = iM2761 ^ i3;
                        i8 = i2;
                    }
                    break;
                case 517434866:
                case 1121217179:
                    if (C3779.f12953 > 0) {
                        iM2762 = C0773.m3169("ᩴܰ") ^ i6;
                        i8 = ((iM2762 ^ i7) * 19011) ^ (-1179335067);
                        i4 = 1596047158;
                        i9 = iM2762 ^ i4;
                        c21926 = this;
                    }
                    sArr = sArr2;
                    c = c2;
                    int iM2766 = C0619.m2761("ۤ֫") ^ i7;
                    int i16 = ((iM2766 ^ i6) * (-1975)) ^ (-2061475918);
                    i9 = iM2766 ^ (-1570021123);
                    sArr2 = sArr;
                    c2 = c;
                    i8 = i16;
                    c21926 = this;
                    break;
                case 568920130:
                case 975434918:
                    f70792 = C1080.m4058(AbstractC3624.m11756(c23255));
                    iM2761 = (C0619.m2761("ۙܿ") + i6) * 45;
                    i2 = ((iM2761 ^ i7) * (-14151)) ^ (-1531996836);
                    i3 = 682965876;
                    i9 = iM2761 ^ i3;
                    i8 = i2;
                    break;
                case 1073634032:
                case 1792634326:
                    AbstractC0641.m2813();
                    C0619.m2763();
                    break;
                case 1207565341:
                case 2019974360:
                    iM31613 = C0773.m3169(C3998.m12925(sArr3, 116, 3, i12));
                    if (C2966.f9654 >= 0) {
                        iM2761 = (C0619.m2761("ܺۙ") + i6) * 9;
                        i2 = ((iM2761 ^ i7) * (-21245)) ^ 2065979843;
                        i3 = 1541939176;
                    } else {
                        iM2761 = C0619.m2761("ᩳ᩸") ^ i7;
                        i2 = ((iM2761 ^ i6) * 6699) ^ (-1979545001);
                        i3 = -1952249074;
                    }
                    i9 = iM2761 ^ i3;
                    i8 = i2;
                    break;
                case 1464007984:
                case 1582893032:
                    C2023.m6954(textView, 2099349707 ^ iM31612);
                    sArr3 = f70794;
                    if (AbstractC0116.f1064 > 0) {
                        iM2761 = C0619.m2761("ۚ᩷") ^ i7;
                        i2 = ((iM2761 ^ i6) * (-15753)) ^ (-832389100);
                        i3 = 1139273596;
                        i9 = iM2761 ^ i3;
                        i8 = i2;
                    } else {
                        sArr = sArr2;
                        c = c2;
                        int iM2767 = C0619.m2761("ۤ֫") ^ i7;
                        int i17 = ((iM2767 ^ i6) * (-1975)) ^ (-2061475918);
                        i9 = iM2767 ^ (-1570021123);
                        sArr2 = sArr;
                        c2 = c;
                        i8 = i17;
                        c21926 = this;
                    }
                    break;
                case 1482532582:
                case 1718359305:
                    iM31611 = C0773.m3169(C2702.m8881(sArr4, UMErrorCode.E_UM_BE_JSON_FAILED, 3, i12));
                    if (C2878.f9462) {
                        iM2761 = C0773.m3169("ᩴۤ") ^ i7;
                        i2 = ((iM2761 ^ i6) * (-3471)) ^ 1959178601;
                        i3 = -328408629;
                    } else {
                        iM2761 = C0773.m3169("ۧۚ") ^ i6;
                        i2 = ((iM2761 ^ i7) * 2967) ^ 1125962417;
                        i3 = -670952479;
                    }
                    i9 = iM2761 ^ i3;
                    i8 = i2;
                    break;
                default:
                    C4238.m13531(c23255, c23255.m54099());
                    break;
            }
            return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        adapterView.setSelection(0);
    }
}
