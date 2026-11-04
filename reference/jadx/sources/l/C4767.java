package l;

import android.app.Application;
import android.app.LocaleManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Locale;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۙ۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H4GZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4767 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Locale f16721;

    /* JADX INFO: renamed from: ۤ֫ᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f16722 = {3412, -9298, -9286, -9285, -9312, -9300, -9286, -9284, -9285, -9312, -9310, -9328, -9309, -9298, -9311, -9304, -9286, -9298, -9304, -9302, 790, 11947, 11961, 12028, 11939, 11922, 11935, 11947, 11961, 12028, 11939, 11909, 11910, 11952, 11947, 11955, 11956, 11956, 11967, 11956, 11938, 11960, 11967, 11960, 11941, 11939, 11940, 11941, 11939, 11940, 11962, 11952, 11940, 11941, 11966, 11908, 11967, 11962, 11967, 11966, 11942, 11967, 12017, 11965, 11952, 11967, 11958, 11940, 11952, 11958, 11956, 12017, 11967, 11952, 11964, 11956, 12011, 12017, 7003, -23636, -23624, -23623, -23646, -23647, -23646, -23634, -23636, -23647, -23640, 4039, -21855, -21837, 7833, 14596, 14599, 14603, 14601, 14596, 14605, 501, -6962, -6948, -6921, -6918};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14712(ActivityC1937 activityC1937, String str) {
        Locale localeM14706 = null;
        int i = 1999631726;
        int i2 = C2966.f9654;
        int i3 = C1564.f5401;
        int iM3169 = C0773.m3169("᩺ۛ") ^ i3;
        int i4 = ((iM3169 ^ i2) * (-25885)) ^ (-1015793403);
        int i5 = 1551855383;
        while (true) {
            i = ((((i ^ i2) * 25421) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1846767659:
                case -91951172:
                    if (C1343.f4799 != 0) {
                        iM3169 = (C0773.m3169("᩸֡") ^ i2) * (-3);
                        i4 = ((iM3169 ^ i3) * 29357) ^ 991746183;
                        i5 = -1008289461;
                    } else {
                        iM3169 = (C0773.m3169("ۤܽ") ^ i3) * 95;
                        i4 = ((iM3169 ^ i2) * 27503) ^ 273221166;
                        i5 = 1690539940;
                    }
                    break;
                case -1682893278:
                case 43266491:
                    if (C0487.m2356() >= 0) {
                        iM3169 = (C0773.m3169("۫۟") + i3) * (-67);
                        i4 = ((iM3169 ^ i2) * (-32205)) ^ (-901654249);
                        i5 = 1312901431;
                    } else {
                        iM3169 = (C0773.m3169("᩸֡") ^ i2) * (-3);
                        i4 = ((iM3169 ^ i3) * 29357) ^ 991746183;
                        i5 = -1008289461;
                    }
                    break;
                case -1538832356:
                case 1698601779:
                    C1564.m5509();
                    if (C2702.f8586 > 0) {
                        iM3169 = (i3 - C0619.m2761("ܿۤ")) * (-49);
                        i4 = ((iM3169 ^ i2) * (-2879)) ^ 288753904;
                        i5 = 878116970;
                    } else {
                        iM3169 = (C0773.m3169("᩸֡") ^ i2) * (-3);
                        i4 = ((iM3169 ^ i3) * 29357) ^ 991746183;
                        i5 = -1008289461;
                    }
                    break;
                case -1374062319:
                case -674446127:
                    if (C1080.f3865 >= 0) {
                        iM3169 = (C0773.m3169("᩸֡") ^ i2) * (-3);
                        i4 = ((iM3169 ^ i3) * 29357) ^ 991746183;
                        i5 = -1008289461;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ۤ᩷")) * (-33);
                        i4 = ((iM3169 ^ i3) * 21541) ^ 944850342;
                        i5 = 1166187500;
                    }
                    break;
                case -1119019688:
                case 2118538265:
                    C3492.m11488();
                    C0862.m3503();
                    iM3169 = (C0773.m3169("᩸֡") ^ i2) * (-3);
                    i4 = ((iM3169 ^ i3) * 29357) ^ 991746183;
                    i5 = -1008289461;
                    break;
                case -1078689120:
                case -175951319:
                    if (C1564.f5401 <= 0) {
                        iM3169 = (i3 - C0619.m2761("ܿۤ")) * (-49);
                        i4 = ((iM3169 ^ i2) * (-2879)) ^ 288753904;
                        i5 = 878116970;
                    } else {
                        iM3169 = C0619.m2761("֫᩻") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-61)) ^ 199673461;
                        i5 = -1341404946;
                    }
                    break;
                case -895687827:
                case 354754520:
                    if (C2878.m9491() <= 0) {
                        iM3169 = (C0773.m3169("۫۟") + i3) * (-67);
                        i4 = ((iM3169 ^ i2) * (-32205)) ^ (-901654249);
                        i5 = 1312901431;
                    } else {
                        iM3169 = C0619.m2761("ۡ᩻") ^ i2;
                        i4 = ((iM3169 ^ i3) * 6959) ^ (-498657978);
                        i5 = -817456442;
                    }
                    break;
                case -347096823:
                case 1162829907:
                    C23916.m53419();
                    C2485.m8357();
                    break;
                case -222036934:
                case 1646970021:
                    m14709((ContextWrapper) activityC1937, str);
                    m14710(activityC1937, localeM14706);
                    break;
                case 70286419:
                case 652981509:
                    if (RunnableC3646.m11813() != 0) {
                        iM3169 = (i3 - C0619.m2761("ܿۤ")) * (-49);
                        i4 = ((iM3169 ^ i2) * (-2879)) ^ 288753904;
                        i5 = 878116970;
                    } else {
                        iM3169 = C0619.m2761("֨۠") ^ i3;
                        i4 = ((iM3169 ^ i2) * 31591) ^ (-1811110395);
                        i5 = 1337450197;
                    }
                    break;
                case 450649586:
                case 2032096071:
                    if (C3734.f12817 >= 0) {
                        iM3169 = (C0773.m3169("۫۟") + i3) * (-67);
                        i4 = ((iM3169 ^ i2) * (-32205)) ^ (-901654249);
                        i5 = 1312901431;
                    } else {
                        iM3169 = (C0619.m2761("᩶᩸") + i2) * (-33);
                        i4 = ((iM3169 ^ i3) * 29181) ^ (-1482719401);
                        i5 = -67723790;
                    }
                    break;
                case 720860240:
                case 1594137644:
                    localeM14706 = m14706((Context) activityC1937, str);
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0773.m3169("ᩳᩳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 25037) ^ 466210939;
                        i5 = 876397536;
                    } else {
                        iM3169 = (C0619.m2761("ᩳ᩶") ^ i3) * 21;
                        i4 = ((iM3169 ^ i2) * 21139) ^ (-1284037962);
                        i5 = -51277782;
                    }
                    break;
                case 891324766:
                case 1729584547:
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0773.m3169("۫۟") + i3) * (-67);
                        i4 = ((iM3169 ^ i2) * (-32205)) ^ (-901654249);
                        i5 = 1312901431;
                    } else {
                        iM3169 = C0619.m2761("ᩴ۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-21643)) ^ (-347762630);
                        i5 = 581467540;
                    }
                    break;
                case 1166853929:
                case 1824040374:
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0619.m2761("᩺᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-25711)) ^ (-1115374810);
                        i5 = 112041182;
                    } else {
                        iM3169 = (C0773.m3169("۠۫") + i2) * (-45);
                        i4 = ((iM3169 ^ i3) * 15683) ^ (-1831147049);
                        i5 = 1044845286;
                    }
                    break;
                case 1319660595:
                case 1756512920:
                    C1343.m4943();
                    if (C4282.f15546 > 0) {
                        iM3169 = C0619.m2761("᩺᩹") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-25711)) ^ (-1115374810);
                        i5 = 112041182;
                    } else {
                        iM3169 = (C0773.m3169("۫۟") + i3) * (-67);
                        i4 = ((iM3169 ^ i2) * (-32205)) ^ (-901654249);
                        i5 = 1312901431;
                    }
                    break;
                default:
                    if (C0773.f2792 <= 0) {
                        iM3169 = (C0773.m3169("۫۟") + i3) * (-67);
                        i4 = ((iM3169 ^ i2) * (-32205)) ^ (-901654249);
                        i5 = 1312901431;
                    } else {
                        iM3169 = C0773.m3169("᩵ۛ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 16645) ^ (-1587466610);
                        i5 = -1386733980;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0101 A[PHI: r18
      0x0101: PHI (r18v21 int) = (r18v19 int), (r18v22 int) binds: [B:34:0x00e9, B:25:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0207 A[PHI: r1 r8 r9 r18 r19
      0x0207: PHI (r1v3 java.lang.String) = (r1v1 java.lang.String), (r1v1 java.lang.String), (r1v2 java.lang.String), (r1v1 java.lang.String) binds: [B:58:0x0205, B:43:0x0162, B:39:0x013b, B:11:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r8v3 int) = (r8v2 int), (r8v1 int), (r8v1 int), (r8v1 int) binds: [B:58:0x0205, B:43:0x0162, B:39:0x013b, B:11:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r9v3 short) = (r9v2 short), (r9v1 short), (r9v1 short), (r9v1 short) binds: [B:58:0x0205, B:43:0x0162, B:39:0x013b, B:11:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r18v26 int) = (r18v11 int), (r18v17 int), (r18v18 int), (r18v29 int) binds: [B:58:0x0205, B:43:0x0162, B:39:0x013b, B:11:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r19v3 java.util.Locale) = (r19v1 java.util.Locale), (r19v2 java.util.Locale), (r19v1 java.util.Locale), (r19v1 java.util.Locale) binds: [B:58:0x0205, B:43:0x0162, B:39:0x013b, B:11:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x025f A[PHI: r6 r10 r18
      0x025f: PHI (r6v3 int) = (r6v2 int), (r6v1 int), (r6v1 int) binds: [B:66:0x025d, B:54:0x01e3, B:10:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r10v3 int) = (r10v1 int), (r10v2 int), (r10v1 int) binds: [B:66:0x025d, B:54:0x01e3, B:10:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x025f: PHI (r18v27 int) = (r18v8 int), (r18v12 int), (r18v28 int) binds: [B:66:0x025d, B:54:0x01e3, B:10:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0296 A[PHI: r5 r7 r18
      0x0296: PHI (r5v3 short) = (r5v2 short), (r5v1 short) binds: [B:70:0x0294, B:62:0x023e] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:70:0x0294, B:62:0x023e] A[DONT_GENERATE, DONT_INLINE]
      0x0296: PHI (r18v9 int) = (r18v7 int), (r18v10 int) binds: [B:70:0x0294, B:62:0x023e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02ce A[PHI: r2 r3 r4 r12 r13 r14 r18
      0x02ce: PHI (r2v3 java.lang.String) = 
      (r2v1 java.lang.String)
      (r2v2 java.lang.String)
      (r2v1 java.lang.String)
      (r2v1 java.lang.String)
      (r2v1 java.lang.String)
     binds: [B:74:0x02cc, B:28:0x00be, B:19:0x0081, B:14:0x005d, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x02ce: PHI (r3v3 short[]) = (r3v2 short[]), (r3v1 short[]), (r3v1 short[]), (r3v1 short[]), (r3v1 short[]) binds: [B:74:0x02cc, B:28:0x00be, B:19:0x0081, B:14:0x005d, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x02ce: PHI (r4v3 char) = (r4v2 char), (r4v1 char), (r4v1 char), (r4v1 char), (r4v1 char) binds: [B:74:0x02cc, B:28:0x00be, B:19:0x0081, B:14:0x005d, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x02ce: PHI (r12v2 short[]) = (r12v1 short[]), (r12v1 short[]), (r12v1 short[]), (r12v1 short[]), (r12v4 short[]) binds: [B:74:0x02cc, B:28:0x00be, B:19:0x0081, B:14:0x005d, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x02ce: PHI (r13v3 short[]) = (r13v1 short[]), (r13v2 short[]), (r13v1 short[]), (r13v1 short[]), (r13v1 short[]) binds: [B:74:0x02cc, B:28:0x00be, B:19:0x0081, B:14:0x005d, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x02ce: PHI (r14v3 int) = (r14v1 int), (r14v2 int), (r14v1 int), (r14v1 int), (r14v1 int) binds: [B:74:0x02cc, B:28:0x00be, B:19:0x0081, B:14:0x005d, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x02ce: PHI (r18v30 int) = (r18v6 int), (r18v20 int), (r18v23 int), (r18v25 int), (r18v33 int) binds: [B:74:0x02cc, B:28:0x00be, B:19:0x0081, B:14:0x005d, B:6:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if (l.C3690.m11987() == false) goto L14;
     */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m14717() {
        /*
            Method dump skipped, instruction units count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4767.m14717():boolean");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14713(ApplicationC17729 applicationC17729) {
        f16721 = m14716(applicationC17729);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b4 A[PHI: r13 r14 r15
      0x00b4: PHI (r13v3 short[]) = (r13v2 short[]), (r13v1 short[]), (r13v1 short[]), (r13v1 short[]), (r13v1 short[]) binds: [B:28:0x00b2, B:24:0x0092, B:16:0x006e, B:14:0x006b, B:11:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x00b4: PHI (r14v3 int) = (r14v2 int), (r14v1 int), (r14v1 int), (r14v1 int), (r14v1 int) binds: [B:28:0x00b2, B:24:0x0092, B:16:0x006e, B:14:0x006b, B:11:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x00b4: PHI (r15v3 int) = (r15v1 int), (r15v2 int), (r15v1 int), (r15v1 int), (r15v1 int) binds: [B:28:0x00b2, B:24:0x0092, B:16:0x006e, B:14:0x006b, B:11:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0152 A[PHI: r20
      0x0152: PHI (r20v4 android.content.SharedPreferences) = (r20v2 android.content.SharedPreferences), (r20v1 android.content.SharedPreferences) binds: [B:40:0x0138, B:5:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x020e A[PHI: r6 r7 r11 r12
      0x020e: PHI (r6v3 int) = (r6v2 int), (r6v1 int) binds: [B:60:0x020c, B:36:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x020e: PHI (r7v3 int) = (r7v2 int), (r7v1 int) binds: [B:60:0x020c, B:36:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x020e: PHI (r11v2 short[]) = (r11v1 short[]), (r11v3 short[]) binds: [B:60:0x020c, B:36:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x020e: PHI (r12v2 int) = (r12v1 int), (r12v3 int) binds: [B:60:0x020c, B:36:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0242 A[PHI: r5 r8
      0x0242: PHI (r5v3 short) = (r5v2 short), (r5v1 short), (r5v1 short), (r5v1 short) binds: [B:64:0x0240, B:56:0x01ec, B:11:0x0066, B:8:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0242: PHI (r8v3 int) = (r8v1 int), (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:64:0x0240, B:56:0x01ec, B:11:0x0066, B:8:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0291  */
    /* JADX WARN: Code duplicated, block: B:77:0x02c1 A[PHI: r4 r9 r21
      0x02c1: PHI (r4v3 char) = (r4v1 char), (r4v2 char), (r4v1 char), (r4v1 char) binds: [B:76:0x02bf, B:68:0x0273, B:52:0x01cc, B:14:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x02c1: PHI (r9v3 short) = (r9v1 short), (r9v1 short), (r9v2 short), (r9v1 short) binds: [B:76:0x02bf, B:68:0x0273, B:52:0x01cc, B:14:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x02c1: PHI (r21v5 short[]) = (r21v4 short[]), (r21v3 short[]), (r21v3 short[]), (r21v3 short[]) binds: [B:76:0x02bf, B:68:0x0273, B:52:0x01cc, B:14:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m14704(Context context) {
        int iM2761;
        int i;
        int i2;
        String strM11769 = null;
        SharedPreferences sharedPreferencesM2326 = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short s2 = 0;
        int i6 = 0;
        short[] sArr = null;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1707403970;
        int i11 = C23916.f77426;
        int i12 = C0773.f2792;
        int iM2762 = C0619.m2761("ۚܳ") ^ i12;
        int i13 = ((iM2762 ^ i11) * o.a.g) ^ (-1496336898);
        int i14 = iM2762 ^ (-210566778);
        short[] sArr3 = null;
        SharedPreferences sharedPreferences = null;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i11) * (-29869)) >> 31));
            switch (i10) {
                case -2115132746:
                case -44440638:
                    sArr3 = f16722;
                    if (C0862.f3233 != 0) {
                        iM2761 = (i11 - C0773.m3169("ۖ᩺")) * 67;
                        i = ((iM2761 ^ i12) * (-28919)) ^ (-1130532365);
                        i2 = 417417026;
                    } else {
                        iM2761 = (i12 - C0619.m2761("ܽ᩵")) * (-15);
                        i = ((iM2761 ^ i11) * (-8921)) ^ (-259915596);
                        i2 = -1626523307;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -2067541298:
                case 1422511816:
                    s = sArr3[c];
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0619.m2761("ۧ۫") ^ i11;
                        i = ((iM2761 ^ i12) * (-17175)) ^ 1106363330;
                        i2 = -713398564;
                    } else {
                        iM2761 = (C0619.m2761("᩶᩻") ^ i12) * 43;
                        i = ((iM2761 ^ i11) * (-31701)) ^ (-1739852858);
                        i2 = 1249054070;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -2056122007:
                case 1583819018:
                    sharedPreferencesM2326 = C0482.m2326(context);
                    iM2761 = (i11 - C0619.m2761("᩹ܳ")) * 79;
                    i = ((iM2761 ^ i12) * (-9243)) ^ 952938815;
                    i2 = 1112174494;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -2011510019:
                case -60760220:
                    int i15 = i3 + i4;
                    i5 = i15 + i15;
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0619.m2761("ۧ۫") ^ i11;
                        i = ((iM2761 ^ i12) * (-17175)) ^ 1106363330;
                        i2 = -713398564;
                    } else {
                        iM2761 = C0619.m2761("ۗۛ") ^ i11;
                        i = ((iM2761 ^ i12) * 9745) ^ 364943999;
                        i2 = 1942435638;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -1905569620:
                case -979610768:
                    sharedPreferences = ApplicationC17729.f58262;
                    if (sharedPreferences == null) {
                        iM2761 = (C0773.m3169("ܶۙ") ^ i12) * (-5);
                        i = ((iM2761 ^ i11) * (-12849)) ^ 90467643;
                        i2 = 1725893488;
                    } else {
                        sharedPreferencesM2326 = sharedPreferences;
                        iM2761 = (i11 - C0619.m2761("᩹ܳ")) * 79;
                        i = ((iM2761 ^ i12) * (-9243)) ^ 952938815;
                        i2 = 1112174494;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -1893053756:
                case 976537329:
                    i6 = 56271;
                    iM2761 = (i11 - C0773.m3169("۠ۛ")) * q.h;
                    i = ((iM2761 ^ i12) * (-3629)) ^ 1835231022;
                    i2 = 1325348355;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -1812157839:
                case -1477644538:
                    C2834.m9344();
                    C2419.m8174();
                    return null;
                case -1792919438:
                case 169552210:
                    i3 = s * s;
                    i4 = 1653796;
                    if (C3492.f12043 <= 0) {
                        iM2761 = (C0773.m3169("ۢۚ") + i12) * 11;
                        i = ((iM2761 ^ i11) * (-11379)) ^ 1833876885;
                        i2 = 1090882398;
                    } else {
                        iM2761 = C0773.m3169("᩹۫") ^ i12;
                        i = ((iM2761 ^ i11) * (-23451)) ^ 1069841880;
                        i2 = -91780666;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -1630519379:
                case 401975930:
                    c = 0;
                    if (C1321.f4751 >= 0) {
                        iM2761 = (i11 - C0773.m3169("ۖ᩺")) * 67;
                        i = ((iM2761 ^ i12) * (-28919)) ^ (-1130532365);
                        i2 = 417417026;
                    } else {
                        iM2761 = (C0773.m3169("֡ܳ") ^ i11) * (-101);
                        i = ((iM2761 ^ i12) * 10285) ^ (-1313401657);
                        i2 = 1087758594;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -1544441384:
                case -232554783:
                    strM11769 = AbstractC3624.m11769(sArr, i7, 4, i6);
                    if (sharedPreferencesM2326 == null) {
                        iM2761 = (C0619.m2761("ۢۙ") ^ i12) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM2761 ^ i11) * 28457) ^ 1111052825;
                        i2 = 1522257048;
                    } else {
                        iM2761 = C0619.m2761("۠ۡ") ^ i11;
                        i = ((iM2761 ^ i12) * (-31745)) ^ (-225903595);
                        i2 = 549553515;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -1378013451:
                case -1272023559:
                    C2288.m7767();
                    if (C2354.m7983()) {
                        iM2761 = C0619.m2761("ۧ۫") ^ i11;
                        i = ((iM2761 ^ i12) * (-17175)) ^ 1106363330;
                        i2 = -713398564;
                    } else {
                        iM2761 = C0619.m2761("ܶܰ") ^ i12;
                        i = ((iM2761 ^ i11) * 29817) ^ 1864897060;
                        i2 = 1055535104;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -1334973971:
                case -1161630811:
                    i6 = 45271;
                    iM2761 = (i11 - C0773.m3169("۠ۛ")) * q.h;
                    i = ((iM2761 ^ i12) * (-3629)) ^ 1835231022;
                    i2 = 1325348355;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -1027775194:
                case 1321754455:
                    return strM11769;
                case -674719340:
                case 937473121:
                    if (C1343.f4799 != 0) {
                        iM2761 = C0619.m2761("ܶܰ") ^ i12;
                        i = ((iM2761 ^ i11) * 29817) ^ 1864897060;
                        i2 = 1055535104;
                    } else {
                        iM2761 = C0619.m2761("᩵᩻") ^ i11;
                        i = ((iM2761 ^ i12) * 19699) ^ (-553235988);
                        i2 = -1540349283;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -559434320:
                case 1227144772:
                    s2 = 1286;
                    if (C3998.f13671 != 0) {
                        iM2761 = (i11 - C0773.m3169("ۖ᩺")) * 67;
                        i = ((iM2761 ^ i12) * (-28919)) ^ (-1130532365);
                        i2 = 417417026;
                    } else {
                        iM2761 = C0773.m3169("ᩴܰ") ^ i12;
                        i = ((iM2761 ^ i11) * (-9605)) ^ 303595146;
                        i2 = 543614055;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -491211360:
                case 393072526:
                    i9 = 15;
                    if (RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("ᩳ᩶") ^ i12;
                        i = ((iM2761 ^ i11) * (-4595)) ^ (-10819365);
                        i2 = -713958964;
                    } else {
                        iM2761 = (C0773.m3169("ܿۤ") ^ i12) * (-127);
                        i = ((iM2761 ^ i11) * (-21751)) ^ (-798747766);
                        i2 = 1008501348;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case -275125842:
                case 716718143:
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0773.m3169("ᩳ᩶") ^ i12;
                        i = ((iM2761 ^ i11) * (-4595)) ^ (-10819365);
                        i2 = -713958964;
                    } else {
                        iM2761 = (i11 - C0773.m3169("ۖ᩺")) * 67;
                        i = ((iM2761 ^ i12) * (-28919)) ^ (-1130532365);
                        i2 = 417417026;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case 438438652:
                case 1533736491:
                    sArr2 = f16722;
                    i8 = 5;
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0773.m3169("ᩳ᩶") ^ i12;
                        i = ((iM2761 ^ i11) * (-4595)) ^ (-10819365);
                        i2 = -713958964;
                    } else {
                        iM2761 = C0773.m3169("ۘ᩹") ^ i11;
                        i = ((iM2761 ^ i12) * (-25671)) ^ 909705984;
                        i2 = -665122665;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case 525568840:
                case 1675163208:
                    return C4238.m13533(sharedPreferencesM2326, C3734.m12149(sArr2, i8, i9, i6), strM11769);
                case 787848548:
                case 1768766618:
                    sArr = f16722;
                    i7 = 1;
                    if (C2485.f7950 != 0) {
                        iM2761 = (C0773.m3169("ۢۚ") + i12) * 11;
                        i = ((iM2761 ^ i11) * (-11379)) ^ 1833876885;
                        i2 = 1090882398;
                    } else {
                        iM2761 = (C0619.m2761("ۢܿ") ^ i12) * (-61);
                        i = ((iM2761 ^ i11) * (-8791)) ^ (-1344087133);
                        i2 = 1108451709;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case 931762448:
                case 1906391892:
                    C4238.m13540();
                    C2966.m9664();
                    iM2761 = C0773.m3169("ᩳ᩶") ^ i12;
                    i = ((iM2761 ^ i11) * (-4595)) ^ (-10819365);
                    i2 = -713958964;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case 1282715155:
                case 1741347818:
                    C2485.m8357();
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0773.m3169("ᩳ᩶") ^ i12;
                        i = ((iM2761 ^ i11) * (-4595)) ^ (-10819365);
                        i2 = -713958964;
                    } else {
                        iM2761 = C0619.m2761("ۧ۫") ^ i11;
                        i = ((iM2761 ^ i12) * (-17175)) ^ 1106363330;
                        i2 = -713398564;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                case 1392224242:
                case 1590879753:
                    int i16 = s + s2;
                    if ((i16 * i16) - i5 > 0) {
                        iM2761 = (i12 - C0773.m3169("᩸۟")) * 89;
                        i = ((iM2761 ^ i11) * (-23721)) ^ (-1225263180);
                        i2 = 1832558679;
                    } else {
                        iM2761 = (i11 - C0773.m3169("ۛ᩹")) * 51;
                        i = ((iM2761 ^ i12) * (-25737)) ^ (-568316510);
                        i2 = 875577484;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
                default:
                    if (context != null) {
                        iM2761 = (i11 - C0619.m2761("ۨۢ")) * 87;
                        i = ((iM2761 ^ i12) * (-17827)) ^ (-1917332550);
                        i2 = 1553032718;
                    } else {
                        sharedPreferencesM2326 = sharedPreferences;
                        iM2761 = (i11 - C0619.m2761("᩹ܳ")) * 79;
                        i = ((iM2761 ^ i12) * (-9243)) ^ 952938815;
                        i2 = 1112174494;
                    }
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004c A[PHI: r11
      0x004c: PHI (r11v4 short[]) = (r11v2 short[]), (r11v1 short[]), (r11v1 short[]), (r11v1 short[]), (r11v1 short[]) binds: [B:29:0x00a9, B:19:0x0068, B:16:0x0061, B:12:0x0055, B:9:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00cc A[PHI: r1
      0x00cc: PHI (r1v42 java.lang.String) = (r1v29 java.lang.String), (r1v1 java.lang.String) binds: [B:33:0x00ca, B:9:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01c5 A[PHI: r6 r7 r8 r12 r13 r17
      0x01c5: PHI (r6v4 int) = (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:52:0x01aa, B:6:0x0041, B:26:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x01c5: PHI (r7v4 int) = (r7v2 int), (r7v1 int), (r7v1 int) binds: [B:52:0x01aa, B:6:0x0041, B:26:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x01c5: PHI (r8v4 int) = (r8v2 int), (r8v1 int), (r8v1 int) binds: [B:52:0x01aa, B:6:0x0041, B:26:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x01c5: PHI (r12v3 int) = (r12v1 int), (r12v1 int), (r12v5 int) binds: [B:52:0x01aa, B:6:0x0041, B:26:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x01c5: PHI (r13v3 int) = (r13v1 int), (r13v1 int), (r13v5 int) binds: [B:52:0x01aa, B:6:0x0041, B:26:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x01c5: PHI (r17v28 java.lang.String) = (r17v9 java.lang.String), (r17v25 java.lang.String), (r17v30 java.lang.String) binds: [B:52:0x01aa, B:6:0x0041, B:26:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01fa A[PHI: r5 r11 r17 r18
      0x01fa: PHI (r5v3 short) = (r5v2 short), (r5v1 short), (r5v1 short) binds: [B:58:0x01f8, B:37:0x0108, B:10:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r11v3 short[]) = (r11v1 short[]), (r11v1 short[]), (r11v4 short[]) binds: [B:58:0x01f8, B:37:0x0108, B:10:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r17v23 java.lang.String) = (r17v8 java.lang.String), (r17v15 java.lang.String), (r17v24 java.lang.String) binds: [B:58:0x01f8, B:37:0x0108, B:10:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r18v3 java.util.Locale) = (r18v1 java.util.Locale), (r18v2 java.util.Locale), (r18v1 java.util.Locale) binds: [B:58:0x01f8, B:37:0x0108, B:10:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x022c A[PHI: r4 r9 r17
      0x022c: PHI (r4v3 short) = (r4v2 short), (r4v1 short), (r4v1 short) binds: [B:62:0x022a, B:48:0x0186, B:14:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r9v3 int) = (r9v1 int), (r9v2 int), (r9v1 int) binds: [B:62:0x022a, B:48:0x0186, B:14:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r17v20 java.lang.String) = (r17v7 java.lang.String), (r17v10 java.lang.String), (r17v21 java.lang.String) binds: [B:62:0x022a, B:48:0x0186, B:14:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m14714() {
        int iM2761;
        int i;
        int i2;
        String language = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = -1211646051;
        int i11 = C1080.f3865;
        int i12 = C3734.f12817;
        int iM3169 = (C0773.m3169("ۘۢ") + i12) * 85;
        int i13 = ((iM3169 ^ i11) * (-289)) ^ 538137608;
        int i14 = iM3169 ^ (-1851054832);
        Locale localeM14706 = null;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i11) * 3957) >> 31));
            switch (i10) {
                case -2108987855:
                case 763788041:
                    language = language;
                    i4 = s * s;
                    i5 = 47886400;
                    if (C0862.f3233 != 0) {
                        iM2761 = C0619.m2761("᩺֡") ^ i11;
                        i = ((iM2761 ^ i12) * (-2817)) ^ 2026031679;
                        i2 = -622464627;
                    } else {
                        iM2761 = (C0619.m2761("ܶۧ") ^ i12) * (-61);
                        i = ((iM2761 ^ i11) * (-25889)) ^ (-642211330);
                        i2 = 1589786820;
                    }
                    String str = language;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    language = str;
                    break;
                case -2094615194:
                case -1571820160:
                    return C2419.m8175(language, C0862.m3500(sArr2, i8, i9, i7));
                case -1681069993:
                case 1968657464:
                    language = language;
                    s = sArr[c];
                    if (C4282.f15546 <= 0) {
                        iM2761 = C0619.m2761("ۘ۠") ^ i12;
                        i = ((iM2761 ^ i11) * (-23719)) ^ (-711394736);
                        i2 = 1176867971;
                    } else {
                        iM2761 = (C0619.m2761("ᩳܽ") + i12) * (-107);
                        i = ((iM2761 ^ i11) * 29703) ^ (-1648009164);
                        i2 = -600861447;
                    }
                    String str2 = language;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    language = str2;
                    break;
                case -1335171772:
                case 718533419:
                    language = language;
                    if ((i6 + i6) - i3 < 0) {
                        iM2761 = C0773.m3169("᩹֡") ^ i12;
                        i = ((iM2761 ^ i11) * (-18163)) ^ (-1904567779);
                        i2 = 1509686356;
                    } else {
                        iM2761 = (C0773.m3169("ۛ۫") + i11) * (-25);
                        i = ((iM2761 ^ i12) * 15339) ^ (-786335381);
                        i2 = 1788831719;
                    }
                    String str3 = language;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    language = str3;
                    break;
                case -1298859969:
                case -126651761:
                    i7 = 43739;
                    iM2761 = (C0773.m3169("᩸ܰ") + i11) * 85;
                    i = ((iM2761 ^ i12) * (-25865)) ^ (-1557981311);
                    i2 = -1742769769;
                    String str4 = language;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    language = str4;
                    break;
                case -1210705264:
                case 1840738302:
                    sArr2 = f16722;
                    if (C2834.f9334 <= 0) {
                        language = language;
                        iM2761 = C0773.m3169("ۛۙ") ^ i12;
                        i = ((iM2761 ^ i11) * (-4743)) ^ (-2046817837);
                        i2 = -1287253664;
                    } else {
                        iM2761 = C0619.m2761("ۤ᩸") ^ i12;
                        language = language;
                        i = ((iM2761 ^ i11) * 31771) ^ (-318794500);
                        i2 = -61847172;
                    }
                    String str5 = language;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    language = str5;
                    break;
                case -857208667:
                case 513203965:
                    i7 = 46159;
                    iM2761 = (C0773.m3169("᩸ܰ") + i11) * 85;
                    i = ((iM2761 ^ i12) * (-25865)) ^ (-1557981311);
                    i2 = -1742769769;
                    String str6 = language;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    language = str6;
                    break;
                case -751468238:
                case 1443590035:
                    C11235.m28309();
                    if (C1826.f6190 <= 0) {
                        language = language;
                        iM2761 = C0773.m3169("ܽ᩶") ^ i11;
                        i = ((iM2761 ^ i12) * 4337) ^ (-979905275);
                        i2 = 969238148;
                        String str7 = language;
                        i14 = iM2761 ^ i2;
                        i13 = i;
                        language = str7;
                    }
                    language = language;
                    iM2761 = C0773.m3169("ۛۙ") ^ i12;
                    i = ((iM2761 ^ i11) * (-4743)) ^ (-2046817837);
                    i2 = -1287253664;
                    String str8 = language;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    language = str8;
                    break;
                case -623878921:
                case 25206018:
                    C1146.m4231();
                    if (C2702.f8586 > 0) {
                        language = language;
                        iM2761 = C0773.m3169("ۛۙ") ^ i12;
                        i = ((iM2761 ^ i11) * (-4743)) ^ (-2046817837);
                        i2 = -1287253664;
                    } else {
                        iM2761 = (C0619.m2761("ܰ֨") + i12) * (-3);
                        language = language;
                        i = ((iM2761 ^ i11) * 30999) ^ 1975981347;
                        i2 = 1246478504;
                    }
                    String str9 = language;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    language = str9;
                    break;
                case -492582219:
                case 1689214392:
                    C0619.m2763();
                    C2702.m8876();
                    language = language;
                    iM2761 = C0773.m3169("ۛۙ") ^ i12;
                    i = ((iM2761 ^ i11) * (-4743)) ^ (-2046817837);
                    i2 = -1287253664;
                    String str10 = language;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    language = str10;
                    break;
                case -457929963:
                case 176236229:
                    AbstractC3624.m11755();
                    if (AbstractC0116.f1064 > 0) {
                        language = language;
                        iM2761 = C0619.m2761("ۘ۠") ^ i12;
                        i = ((iM2761 ^ i11) * (-23719)) ^ (-711394736);
                        i2 = 1176867971;
                        String str11 = language;
                        i14 = iM2761 ^ i2;
                        i13 = i;
                        language = str11;
                    }
                    language = language;
                    iM2761 = C0773.m3169("ۛۙ") ^ i12;
                    i = ((iM2761 ^ i11) * (-4743)) ^ (-2046817837);
                    i2 = -1287253664;
                    String str12 = language;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    language = str12;
                    break;
                case -289564605:
                case 643171463:
                    C0862.m3503();
                    return false;
                case -277448529:
                case 683482734:
                    language = language;
                    sArr = f16722;
                    c = 'Y';
                    if (C1519.m5403()) {
                        iM2761 = (C0619.m2761("۬ۨ") + i11) * (-99);
                        i = ((iM2761 ^ i12) * 14293) ^ 1826480990;
                        i2 = -1126542077;
                    } else {
                        iM2761 = C0773.m3169("ܽ᩶") ^ i11;
                        i = ((iM2761 ^ i12) * 4337) ^ (-979905275);
                        i2 = 969238148;
                    }
                    String str13 = language;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    language = str13;
                    break;
                case -191397869:
                case 1823492838:
                    language = language;
                    s2 = 6920;
                    if (C3734.m12152() >= 0) {
                        iM2761 = C0773.m3169("ۛۙ") ^ i12;
                        i = ((iM2761 ^ i11) * (-4743)) ^ (-2046817837);
                        i2 = -1287253664;
                    } else {
                        iM2761 = C0619.m2761("ۜ᩻") ^ i11;
                        i = ((iM2761 ^ i12) * (-13771)) ^ 520974434;
                        i2 = -1258056068;
                    }
                    String str14 = language;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    language = str14;
                    break;
                case -134460878:
                case 635728028:
                    language = language;
                    i6 = i4 + i5;
                    if (C1343.f4799 != 0) {
                        iM2761 = C0619.m2761("ۘ۠") ^ i12;
                        i = ((iM2761 ^ i11) * (-23719)) ^ (-711394736);
                        i2 = 1176867971;
                    } else {
                        iM2761 = (C0619.m2761("ۚ᩹") ^ i11) * q.h;
                        i = ((iM2761 ^ i12) * 18067) ^ 209940009;
                        i2 = -1857218657;
                    }
                    String str15 = language;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    language = str15;
                    break;
                case 625051754:
                case 1765832657:
                    i9 = 2;
                    if (C3492.f12043 <= 0) {
                        language = language;
                        i8 = 90;
                        iM2761 = C0619.m2761("᩺֡") ^ i11;
                        i = ((iM2761 ^ i12) * (-2817)) ^ 2026031679;
                        i2 = -622464627;
                        String str16 = language;
                        i14 = iM2761 ^ i2;
                        i13 = i;
                        language = str16;
                    } else {
                        int iM31610 = (C0773.m3169("ۙܽ") ^ i11) * 83;
                        i14 = iM31610 ^ (-1592168606);
                        i13 = ((iM31610 ^ i12) * 4503) ^ 206344349;
                        i8 = 90;
                    }
                    break;
                case 1095237033:
                case 1108532919:
                    language = language;
                    localeM14706 = m14706((Context) null, (String) null);
                    if (RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("ۛۙ") ^ i12;
                        i = ((iM2761 ^ i11) * (-4743)) ^ (-2046817837);
                        i2 = -1287253664;
                    } else {
                        iM2761 = (C0773.m3169("ۧᩳ") ^ i12) * (-47);
                        i = ((iM2761 ^ i11) * 16439) ^ (-1913500773);
                        i2 = -233046908;
                    }
                    String str17 = language;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    language = str17;
                    break;
                case 1106633521:
                case 1344244321:
                    language = localeM14706.getLanguage();
                    if (C1343.f4799 != 0) {
                        iM2761 = (C0619.m2761("ܰ֨") + i12) * (-3);
                        language = language;
                        i = ((iM2761 ^ i11) * 30999) ^ 1975981347;
                        i2 = 1246478504;
                    } else {
                        iM2761 = (C0773.m3169("ܽᩳ") + i11) * (-87);
                        language = language;
                        i = ((iM2761 ^ i12) * 9863) ^ 1462394895;
                        i2 = -667606274;
                    }
                    String str18 = language;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    language = str18;
                    break;
                default:
                    language = language;
                    int i15 = s + s2;
                    i3 = i15 * i15;
                    if (RunnableC3646.f12471) {
                        iM2761 = C0619.m2761("᩺֡") ^ i11;
                        i = ((iM2761 ^ i12) * (-2817)) ^ 2026031679;
                        i2 = -622464627;
                    } else {
                        iM2761 = C0619.m2761("۬ۢ") ^ i12;
                        i = ((iM2761 ^ i11) * 3841) ^ (-1823567073);
                        i2 = 391869950;
                    }
                    String str19 = language;
                    i14 = iM2761 ^ i2;
                    i13 = i;
                    language = str19;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0115  */
    /* JADX WARN: Code duplicated, block: B:54:0x0173  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01cf  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14711(Resources resources, Locale locale) {
        int iM2761;
        int i;
        int i2 = 646190705;
        int i3 = C1146.f4234;
        int i4 = C2834.f9334;
        int iM2762 = C0619.m2761("ܳ֨") ^ i4;
        int i5 = ((iM2762 ^ i3) * (-21963)) ^ (-429164576);
        int i6 = 641991261;
        while (true) {
            int i7 = iM2762 ^ i6;
            Configuration configuration = null;
            while (true) {
                i2 = ((((i2 ^ i3) * 27599) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -2126480795:
                    case 1450822578:
                        Configuration configuration2 = resources.getConfiguration();
                        if (!C2288.m7767()) {
                            configuration = new Configuration(configuration2);
                            if (C1343.f4799 == 0) {
                                iM2761 = (C0619.m2761("ᩳܳ") ^ i4) * (-125);
                                i5 = ((iM2761 ^ i3) * (-20853)) ^ (-1083774687);
                                i = -1683609370;
                                i7 = iM2761 ^ i;
                            }
                        }
                        break;
                    case -2106242799:
                    case -750904266:
                        configuration.setLocale(locale);
                        if (C1783.m6232()) {
                            iM2761 = (C0619.m2761("᩻ۘ") ^ i3) * (-101);
                            i5 = ((iM2761 ^ i4) * 8911) ^ (-1941370415);
                            i = -1073033062;
                        } else {
                            iM2761 = C0619.m2761("֡ܳ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 13561) ^ (-1569243697);
                            i = 326077512;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1614869697:
                    case 1363073141:
                        configuration.setLayoutDirection(locale);
                        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
                        break;
                    case -1460466923:
                    case -518329539:
                        if (C1826.m6316(locale, m14707(resources))) {
                            iM2761 = C0773.m3169("֫᩵") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-14949)) ^ (-605617037);
                            i = 1167642437;
                        } else {
                            iM2761 = C0619.m2761("ܿۗ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 32077) ^ (-526688011);
                            i = 825869087;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1449461324:
                    case 1586663234:
                        C1519.m5403();
                        C1146.m4231();
                        break;
                    case -1445123306:
                    case -670648581:
                        if (!C4282.m13644()) {
                        }
                        iM2761 = C0773.m3169("᩻֫") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-13339)) ^ (-155711874);
                        i = 1287161258;
                        i7 = iM2761 ^ i;
                        break;
                        break;
                    case -1404102390:
                    case -1363919454:
                        if (C3077.m10041()) {
                            iM2761 = (C0773.m3169("ۡۜ") + i3) * (-97);
                            i5 = ((iM2761 ^ i4) * 8041) ^ 1101829263;
                            i = -385230234;
                        } else {
                            iM2761 = C0619.m2761("ܰ۟") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-19019)) ^ (-1347163753);
                            i = -286575377;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1157861052:
                    case 1290708855:
                        if (C1783.f6087 <= 0) {
                            iM2761 = C0619.m2761("֡ܳ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 13561) ^ (-1569243697);
                            i = 326077512;
                        } else {
                            iM2761 = (C0773.m3169("ۨܿ") + i3) * 85;
                            i5 = ((iM2761 ^ i4) * (-2139)) ^ (-324528532);
                            i = -157973975;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1150886428:
                    case 181514431:
                        break;
                    case -928636571:
                    case -385133471:
                        AbstractC0116.m1243();
                        iM2761 = C0619.m2761("ܰ۟") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-19019)) ^ (-1347163753);
                        i = -286575377;
                        i7 = iM2761 ^ i;
                        break;
                    case -646577755:
                    case 1397629948:
                        if (C3033.f9831 >= 0) {
                            iM2761 = C0619.m2761("֡ܳ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 13561) ^ (-1569243697);
                            i = 326077512;
                        } else {
                            iM2761 = (i4 - C0619.m2761("ۡ᩻")) * (-43);
                            i5 = ((iM2761 ^ i3) * 20689) ^ 298645762;
                            i = -2048294248;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -577186986:
                    case 408550422:
                        if (RunnableC3646.f12471) {
                        }
                        iM2761 = (C0773.m3169("ۡۜ") + i3) * (-97);
                        i5 = ((iM2761 ^ i4) * 8041) ^ 1101829263;
                        i = -385230234;
                        i7 = iM2761 ^ i;
                        break;
                    case -429343943:
                    case 1845507748:
                        if (RunnableC3055.m9933() != 0) {
                            iM2761 = (C0773.m3169("ۡۜ") + i3) * (-97);
                            i5 = ((iM2761 ^ i4) * 8041) ^ 1101829263;
                            i = -385230234;
                        } else {
                            iM2761 = (C0773.m3169("᩷᩻") ^ i3) * 9;
                            i5 = ((iM2761 ^ i4) * (-8623)) ^ 238465611;
                            i = -1651002624;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -144246139:
                    case 1546030122:
                        if (C1519.m5403()) {
                            iM2761 = C0619.m2761("ܰ۟") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-19019)) ^ (-1347163753);
                            i = -286575377;
                        } else {
                            iM2761 = C0773.m3169("ۜۨ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 27499) ^ 144354826;
                            i = 1843484376;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case 545318603:
                    case 1762480984:
                        if (C1826.m6301() >= 0) {
                            iM2761 = C0619.m2761("ܰ۟") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-19019)) ^ (-1347163753);
                            i = -286575377;
                        } else {
                            iM2761 = C0619.m2761("۟ۘ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-21833)) ^ (-849579026);
                            i = 61327742;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case 685958104:
                    case 724515030:
                        if (C2878.f9462) {
                            iM2761 = C0619.m2761("ܰ۟") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-19019)) ^ (-1347163753);
                            i = -286575377;
                        } else {
                            iM2761 = (i4 - C0619.m2761("᩹᩹")) * (-75);
                            i5 = ((iM2761 ^ i3) * (-11067)) ^ 221029266;
                            i = 658833741;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    default:
                        if (C2702.m8876()) {
                            iM2761 = C0773.m3169("ܳܳ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 23345) ^ 1730725707;
                            i = -482894946;
                        } else {
                            iM2761 = C0773.m3169("ۜۨ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 27499) ^ 144354826;
                            i = 1843484376;
                        }
                        i7 = iM2761 ^ i;
                        break;
                }
                return;
            }
            iM2762 = (C0773.m3169("᩷ۘ") ^ i4) * 47;
            i5 = ((iM2762 ^ i3) * (-19311)) ^ (-1058510267);
            i6 = 587150741;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Locale m14705(Application application) {
        return m14706((Context) application, (String) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14708(ContextWrapper contextWrapper) {
        m14710(contextWrapper, m14706((Context) contextWrapper, (String) null));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Locale m14707(Resources resources) {
        Configuration configuration = null;
        C12266 c12266M40989 = null;
        Locale localeM30639 = null;
        Locale locale = null;
        int i = -920219476;
        int i2 = C1542.f5343;
        int i3 = C3099.f10023;
        int iM3169 = C0773.m3169("ۧᩳ") ^ i3;
        int i4 = ((iM3169 ^ i2) * 3253) ^ 1571502954;
        int i5 = 1753209591;
        while (true) {
            i = ((((i ^ i2) * (-4701)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2140080923:
                case 909096260:
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0773.m3169("ۢۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-32459)) ^ 757510510;
                        i5 = 211027967;
                    } else {
                        iM3169 = C0773.m3169("᩸᩶") ^ i3;
                        i4 = ((iM3169 ^ i2) * 22721) ^ 174938468;
                        i5 = 911625019;
                    }
                    break;
                case -2015413060:
                case -275183036:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0619.m2761("۬֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2501) ^ 802669636;
                        i5 = 656122385;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۙ۟")) * (-103);
                        i4 = ((iM3169 ^ i2) * (-17293)) ^ 1797580499;
                        i5 = 443585760;
                    }
                    break;
                case -1720932800:
                case -981267627:
                    if (C2878.m9491() <= 0) {
                        iM3169 = C0773.m3169("ۢۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-32459)) ^ 757510510;
                        i5 = 211027967;
                    } else {
                        iM3169 = C0619.m2761("᩻ܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 15053) ^ 1273953186;
                        i5 = 1576979755;
                    }
                    break;
                case -1447411215:
                case 1422270790:
                    C2834.m9344();
                    return null;
                case -1336848692:
                case -1219776520:
                    return localeM30639;
                case -1201339615:
                case -323513452:
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0619.m2761("۬֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2501) ^ 802669636;
                        i5 = 656122385;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۤ֨")) * (-123);
                        i4 = ((iM3169 ^ i2) * (-1225)) ^ (-556675531);
                        i5 = 1720750976;
                    }
                    break;
                case -1146374469:
                case 1714977540:
                    locale = resources.getConfiguration().locale;
                    if (locale != null) {
                        iM3169 = C0619.m2761("᩵ܿ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-22195)) ^ (-1083514718);
                        i5 = 397646011;
                    } else {
                        iM3169 = (C0619.m2761("ۢۚ") + i3) * (-55);
                        i4 = ((iM3169 ^ i2) * 21169) ^ 30794154;
                        i5 = 636020225;
                    }
                    break;
                case -496813050:
                case 1411831690:
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0619.m2761("۬֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2501) ^ 802669636;
                        i5 = 656122385;
                    } else {
                        iM3169 = C0773.m3169("ۢۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-32459)) ^ 757510510;
                        i5 = 211027967;
                    }
                    break;
                case -356806431:
                case 95357874:
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0773.m3169("ۢۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-32459)) ^ 757510510;
                        i5 = 211027967;
                    } else {
                        iM3169 = (C0619.m2761("᩵ܽ") ^ i3) * 91;
                        i4 = ((iM3169 ^ i2) * 31171) ^ (-628936128);
                        i5 = 421409799;
                    }
                    break;
                case -166041398:
                case 296444437:
                    C2834.m9344();
                    if (C2310.f7472 < 0) {
                        iM3169 = C0773.m3169("ۢۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-32459)) ^ 757510510;
                        i5 = 211027967;
                    } else {
                        iM3169 = C0619.m2761("ܳۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 13769) ^ (-2010289173);
                        i5 = -1425925585;
                    }
                    break;
                case -101829261:
                case 1846017859:
                    if (C1542.m5459() >= 0) {
                        iM3169 = C0773.m3169("ۢۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-32459)) ^ 757510510;
                        i5 = 211027967;
                    } else {
                        iM3169 = C0619.m2761("ᩳۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-535)) ^ 1212200715;
                        i5 = -804365144;
                    }
                    break;
                case -90616183:
                case 808308765:
                    configuration = resources.getConfiguration();
                    if (C2702.f8586 <= 0) {
                        iM3169 = (C0773.m3169("᩺ۗ") ^ i2) * (-89);
                        i4 = ((iM3169 ^ i3) * 18215) ^ 1338289666;
                        i5 = -1876824861;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ۧ᩺")) * 97;
                        i4 = ((iM3169 ^ i3) * 9563) ^ (-1602978179);
                        i5 = 574078813;
                    }
                    break;
                case 311345271:
                case 1820718208:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0773.m3169("ۢۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-32459)) ^ 757510510;
                        i5 = 211027967;
                    } else {
                        iM3169 = C0773.m3169("ۢۖ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 27433) ^ (-991119121);
                        i5 = -921573123;
                    }
                    break;
                case 538196783:
                case 1781164263:
                    return Locale.getDefault();
                case 996394399:
                case 1590780925:
                    return locale;
                case 1256830079:
                case 2081545117:
                    if (C1146.f4234 >= 0) {
                        iM3169 = C0619.m2761("۬֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * 2501) ^ 802669636;
                        i5 = 656122385;
                    } else {
                        iM3169 = (i2 - C0773.m3169("۠᩹")) * 67;
                        i4 = ((iM3169 ^ i3) * (-20607)) ^ 388360785;
                        i5 = 1464449752;
                    }
                    break;
                case 1369535767:
                case 1853537800:
                    C0487.m2356();
                    iM3169 = C0773.m3169("ۢۡ") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-32459)) ^ 757510510;
                    i5 = 211027967;
                    break;
                case 1662987425:
                case 1938094991:
                    if (C2375.m8065() <= 0) {
                        iM3169 = C0773.m3169("ۢۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-32459)) ^ 757510510;
                        i5 = 211027967;
                    } else {
                        iM3169 = (C0773.m3169("᩸ܺ") + i2) * (-7);
                        i4 = ((iM3169 ^ i3) * 21481) ^ (-1337554792);
                        i5 = 1546364330;
                    }
                    break;
                case 1865493674:
                case 1998763005:
                    localeM30639 = c12266M40989.m30639(0);
                    if (localeM30639 != null) {
                        iM3169 = C0773.m3169("ۡ۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * 29807) ^ (-18250533);
                        i5 = -283539115;
                    } else {
                        iM3169 = C0619.m2761("ۛܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 22873) ^ (-639899050);
                        i5 = -221598420;
                    }
                    break;
                default:
                    c12266M40989 = C17487.m40989(configuration);
                    if (C2287.f7432 >= 0) {
                        iM3169 = (C0773.m3169("᩺ۗ") ^ i2) * (-89);
                        i4 = ((iM3169 ^ i3) * 18215) ^ 1338289666;
                        i5 = -1876824861;
                    } else {
                        iM3169 = C0619.m2761("֨۬") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-17485)) ^ 974977853;
                        i5 = 795934527;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0124 A[PHI: r10 r13 r14
      0x0124: PHI (r10v4 short[]) = (r10v3 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:33:0x0122, B:19:0x00b5, B:16:0x009b, B:13:0x0095, B:6:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:33:0x0122, B:19:0x00b5, B:16:0x009b, B:13:0x0095, B:6:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:33:0x0122, B:19:0x00b5, B:16:0x009b, B:13:0x0095, B:6:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0176 A[PHI: r7
      0x0176: PHI (r7v5 android.app.LocaleManager) = 
      (r7v2 android.app.LocaleManager)
      (r7v4 android.app.LocaleManager)
      (r7v2 android.app.LocaleManager)
      (r7v2 android.app.LocaleManager)
     binds: [B:37:0x015c, B:30:0x00ff, B:27:0x00ee, B:25:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x0318 A[PHI: r21 r22
      0x0318: PHI (r21v4 short) = (r21v3 short), (r21v2 short) binds: [B:76:0x0316, B:16:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x0318: PHI (r22v4 int) = (r22v3 int), (r22v2 int) binds: [B:76:0x0316, B:16:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x03ac A[PHI: r9 r11 r12 r16 r17 r18 r19 r20
      0x03ac: PHI (r9v3 short[]) = (r9v2 short[]), (r9v2 short[]), (r9v2 short[]), (r9v2 short[]), (r9v4 short[]) binds: [B:92:0x03aa, B:88:0x038c, B:84:0x036d, B:80:0x034a, B:57:0x0251] A[DONT_GENERATE, DONT_INLINE]
      0x03ac: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:92:0x03aa, B:88:0x038c, B:84:0x036d, B:80:0x034a, B:57:0x0251] A[DONT_GENERATE, DONT_INLINE]
      0x03ac: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v4 int) binds: [B:92:0x03aa, B:88:0x038c, B:84:0x036d, B:80:0x034a, B:57:0x0251] A[DONT_GENERATE, DONT_INLINE]
      0x03ac: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:92:0x03aa, B:88:0x038c, B:84:0x036d, B:80:0x034a, B:57:0x0251] A[DONT_GENERATE, DONT_INLINE]
      0x03ac: PHI (r17v4 char) = (r17v2 char), (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:92:0x03aa, B:88:0x038c, B:84:0x036d, B:80:0x034a, B:57:0x0251] A[DONT_GENERATE, DONT_INLINE]
      0x03ac: PHI (r18v4 short) = (r18v2 short), (r18v2 short), (r18v3 short), (r18v2 short), (r18v2 short) binds: [B:92:0x03aa, B:88:0x038c, B:84:0x036d, B:80:0x034a, B:57:0x0251] A[DONT_GENERATE, DONT_INLINE]
      0x03ac: PHI (r19v4 int) = (r19v2 int), (r19v2 int), (r19v2 int), (r19v3 int), (r19v2 int) binds: [B:92:0x03aa, B:88:0x038c, B:84:0x036d, B:80:0x034a, B:57:0x0251] A[DONT_GENERATE, DONT_INLINE]
      0x03ac: PHI (r20v4 short) = (r20v2 short), (r20v2 short), (r20v3 short), (r20v2 short), (r20v2 short) binds: [B:92:0x03aa, B:88:0x038c, B:84:0x036d, B:80:0x034a, B:57:0x0251] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x03dc A[PHI: r3 r4 r27
      0x03dc: PHI (r3v4 java.util.Locale) = 
      (r3v2 java.util.Locale)
      (r3v2 java.util.Locale)
      (r3v3 java.util.Locale)
      (r3v2 java.util.Locale)
      (r3v2 java.util.Locale)
     binds: [B:96:0x03da, B:72:0x02f6, B:48:0x01f2, B:13:0x0095, B:9:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x03dc: PHI (r4v4 java.util.Locale[]) = 
      (r4v2 java.util.Locale[])
      (r4v2 java.util.Locale[])
      (r4v3 java.util.Locale[])
      (r4v2 java.util.Locale[])
      (r4v2 java.util.Locale[])
     binds: [B:96:0x03da, B:72:0x02f6, B:48:0x01f2, B:13:0x0095, B:9:0x0074] A[DONT_GENERATE, DONT_INLINE]
      0x03dc: PHI (r27v5 int) = (r27v3 int), (r27v4 int), (r27v3 int), (r27v3 int), (r27v3 int) binds: [B:96:0x03da, B:72:0x02f6, B:48:0x01f2, B:13:0x0095, B:9:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14709(ContextWrapper contextWrapper, String str) {
        int iM3169;
        int i;
        int i2;
        C12266 c12266M30637;
        int i3 = RunnableC3055.f9898;
        int i4 = C2419.f7754;
        int iM2761 = C0619.m2761("ۢۢ") ^ i3;
        int i5 = ((iM2761 ^ i4) * 25383) ^ 1277586803;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2761 ^ 570286773;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        char c = 0;
        short s = 0;
        int i12 = 0;
        short s2 = 0;
        short s3 = 0;
        int i13 = 0;
        int i14 = 1465557417;
        int i15 = 0;
        short[] sArr3 = null;
        LocaleManager localeManager = null;
        String strM30641 = null;
        C12266 c12266 = null;
        Locale[] localeArr = null;
        Locale localeM14706 = null;
        String strM14704 = null;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i4) * (-15337)) >> 31));
            switch (i14) {
                case -2102030940:
                case -1015768063:
                    sArr2 = f16722;
                    i11 = 83;
                    i10 = 6;
                    if (RunnableC3646.m11813() != 0) {
                        iM3169 = C0773.m3169("۫ܺ") ^ i4;
                        i = ((iM3169 ^ i3) * (-4141)) ^ 1294736359;
                        i2 = 1225029022;
                    } else {
                        iM3169 = C0619.m2761("᩶ۢ") ^ i3;
                        i = ((iM3169 ^ i4) * 25669) ^ (-453194420);
                        i2 = 206869607;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2075563235:
                case -772294421:
                    i7 = 41933;
                    iM3169 = C0619.m2761("᩻֡") ^ i4;
                    i = ((iM3169 ^ i3) * (-19947)) ^ 1798339679;
                    i2 = -1565270615;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1983273689:
                case -545092140:
                    c = 'N';
                    if (C1519.m5403()) {
                        iM3169 = (C0619.m2761("ᩴ᩵") + i4) * 71;
                        i = ((iM3169 ^ i3) * (-23245)) ^ (-1018222050);
                        i2 = -227391997;
                    } else {
                        iM3169 = C0619.m2761("ܶ۠") ^ i3;
                        i = ((iM3169 ^ i4) * (-27115)) ^ (-667569740);
                        i2 = 318141766;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1963187294:
                case -1894179325:
                    C1146.m4231();
                    if (C3779.m12264()) {
                        iM3169 = C0773.m3169("֫ۤ") ^ i3;
                        i = ((iM3169 ^ i4) * (-10153)) ^ 613621217;
                        i2 = 638538599;
                    } else {
                        iM3169 = C0773.m3169("۫ܺ") ^ i4;
                        i = ((iM3169 ^ i3) * (-4141)) ^ 1294736359;
                        i2 = 1225029022;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1953457432:
                case -409996772:
                    if (i13 - (i15 + 1) < 0) {
                        iM3169 = (C0619.m2761("᩷ۤ") ^ i3) * (-65);
                        i = ((iM3169 ^ i4) * 10309) ^ 1774737595;
                        i2 = 415845811;
                    } else {
                        iM3169 = C0773.m3169("۫᩷") ^ i3;
                        i = ((iM3169 ^ i4) * (-17899)) ^ (-808757380);
                        i2 = 1851092085;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1920091368:
                case 1280195647:
                    AbstractC1365.m5014(c12266);
                    iM3169 = C0773.m3169("ۖ֫") ^ i4;
                    i = ((iM3169 ^ i3) * (-22321)) ^ 1649492087;
                    i2 = 2075982568;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1848148553:
                case -1368153514:
                    i13 = i12 * i12;
                    s3 = 2;
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("ᩳܳ") ^ i4;
                        i = ((iM3169 ^ i3) * (-28727)) ^ (-899220445);
                        i2 = 1248651290;
                    } else {
                        iM3169 = (C0619.m2761("ᩴ᩷") + i4) * 87;
                        i = ((iM3169 ^ i3) * 17443) ^ 123710918;
                        i2 = -1377343120;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1792783036:
                case 1277016910:
                    i7 = 1754;
                    iM3169 = C0619.m2761("᩻֡") ^ i4;
                    i = ((iM3169 ^ i3) * (-19947)) ^ 1798339679;
                    i2 = -1565270615;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1393652897:
                case 555707684:
                    strM30641 = c12266.m30641();
                    if (Build.VERSION.SDK_INT >= 33) {
                        iM3169 = C0773.m3169("ۨۛ") ^ i4;
                        i = ((iM3169 ^ i3) * 30957) ^ (-171035236);
                        i2 = 1258520952;
                    } else {
                        iM3169 = (C0773.m3169("᩹᩵") ^ i3) * 69;
                        i = ((iM3169 ^ i4) * 10743) ^ 1779768900;
                        i2 = 952040823;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1328651906:
                case 232331795:
                    if (C1826.m6316(strM30641, localeManager.getApplicationLocales().toLanguageTags())) {
                        iM3169 = C0773.m3169("ۖ֫") ^ i4;
                        i = ((iM3169 ^ i3) * (-22321)) ^ 1649492087;
                        i2 = 2075982568;
                    } else {
                        iM3169 = (C0773.m3169("ۨܳ") + i3) * (-47);
                        i = ((iM3169 ^ i4) * (-19955)) ^ 360060520;
                        i2 = 791177797;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1104252197:
                case 931065924:
                    i12 = s2 + s;
                    if (C2485.f7950 != 0) {
                        iM3169 = C0619.m2761("ܶ۠") ^ i3;
                        i = ((iM3169 ^ i4) * (-27115)) ^ (-667569740);
                        i2 = 318141766;
                    } else {
                        iM3169 = (C0619.m2761("ܰ֫") + i3) * 29;
                        i = ((iM3169 ^ i4) * (-13947)) ^ 918791788;
                        i2 = 347510356;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1049400901:
                case 2014508783:
                    C3492.m11488();
                    C17202.m40372();
                    break;
                case -976564227:
                case 883114197:
                    C2288.m7767();
                    iM3169 = C0773.m3169("۫ܺ") ^ i4;
                    i = ((iM3169 ^ i3) * (-4141)) ^ 1294736359;
                    i2 = 1225029022;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -874395279:
                case 1036746720:
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0773.m3169("֫ۤ") ^ i3;
                        i = ((iM3169 ^ i4) * (-10153)) ^ 613621217;
                        i2 = 638538599;
                    } else {
                        iM3169 = C0773.m3169("۫᩻") ^ i3;
                        i = ((iM3169 ^ i4) * (-25129)) ^ 1436536705;
                        i2 = -1763078130;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -871165318:
                case 1324422346:
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0773.m3169("۫ܺ") ^ i4;
                        i = ((iM3169 ^ i3) * (-4141)) ^ 1294736359;
                        i2 = 1225029022;
                    } else {
                        iM3169 = C0773.m3169("ᩳܳ") ^ i4;
                        i = ((iM3169 ^ i3) * (-28727)) ^ (-899220445);
                        i2 = 1248651290;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -868934373:
                case 858600816:
                    i15 = s2 * s3;
                    if (C3998.f13671 != 0) {
                        iM3169 = C0773.m3169("֫ۤ") ^ i3;
                        i = ((iM3169 ^ i4) * (-10153)) ^ 613621217;
                        i2 = 638538599;
                    } else {
                        iM3169 = C0619.m2761("ۖᩳ") ^ i4;
                        i = ((iM3169 ^ i3) * (-14963)) ^ 915696707;
                        i2 = 1878580683;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -739918423:
                case 2096469882:
                    sArr3 = f16722;
                    if (C17202.f56030) {
                        iM3169 = (C0619.m2761("ۗܶ") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM3169 ^ i3) * (-22829)) ^ (-991032804);
                        i2 = 1890708310;
                    } else {
                        iM3169 = C0619.m2761("ܶ۠") ^ i3;
                        i = ((iM3169 ^ i4) * (-27115)) ^ (-667569740);
                        i2 = 318141766;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -431269681:
                case 698042281:
                    localeManager = (LocaleManager) C23916.m53416(contextWrapper, C1080.m4056(sArr2, i11, i10, i7));
                    if (localeManager != null) {
                        iM3169 = (C0619.m2761("֡֡") ^ i4) * 95;
                        i = ((iM3169 ^ i3) * 25407) ^ (-2098657405);
                        i2 = 345688936;
                    } else {
                        iM3169 = C0773.m3169("ۖ֫") ^ i4;
                        i = ((iM3169 ^ i3) * (-22321)) ^ 1649492087;
                        i2 = 2075982568;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -400648491:
                case 229651641:
                    c12266M30637 = C12266.m30638();
                    c12266 = c12266M30637;
                    iM3169 = (i4 - C0773.m3169("᩺ۙ")) * 55;
                    i = ((iM3169 ^ i3) * 3765) ^ (-304066954);
                    i2 = -35238366;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -344730411:
                case -204741897:
                    break;
                case -332523256:
                case 132182475:
                    localeArr[0] = localeM14706;
                    c12266M30637 = C12266.m30637(localeArr);
                    c12266 = c12266M30637;
                    iM3169 = (i4 - C0773.m3169("᩺ۙ")) * 55;
                    i = ((iM3169 ^ i3) * 3765) ^ (-304066954);
                    i2 = -35238366;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -118856536:
                case 1313957160:
                    if (RunnableC1848.f6235) {
                        iM3169 = C0773.m3169("֫ۤ") ^ i3;
                        i = ((iM3169 ^ i4) * (-10153)) ^ 613621217;
                        i2 = 638538599;
                    } else {
                        iM3169 = C0619.m2761("ۧۡ") ^ i4;
                        i = ((iM3169 ^ i3) * 28215) ^ (-2114734547);
                        i2 = 124650323;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -22113759:
                case 240720045:
                    strM14704 = m14704((Context) contextWrapper);
                    iM3169 = (C0773.m3169("᩹۫") ^ i4) * (-111);
                    i = ((iM3169 ^ i3) * (-28749)) ^ (-1000386812);
                    i2 = -1146031421;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 333178873:
                case 2129247030:
                    if (C2419.m8175(C0950.m3780(sArr, i8, i9, i7), strM14704)) {
                        iM3169 = C0619.m2761("֫ܿ") ^ i3;
                        i = ((iM3169 ^ i4) * 32019) ^ 777651938;
                        i2 = 33740709;
                    } else {
                        iM3169 = C0773.m3169("ܳ֫") ^ i4;
                        i = ((iM3169 ^ i3) * 6003) ^ (-428340888);
                        i2 = -983644756;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 524340690:
                case 717694629:
                    if (str == null) {
                        iM3169 = C0619.m2761("ۚ᩻") ^ i3;
                        i = ((iM3169 ^ i4) * (-18467)) ^ (-959867425);
                        i2 = -465239608;
                    } else {
                        strM14704 = str;
                        iM3169 = (C0773.m3169("᩹۫") ^ i4) * (-111);
                        i = ((iM3169 ^ i3) * (-28749)) ^ (-1000386812);
                        i2 = -1146031421;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 573717903:
                case 1263437109:
                    if (C1826.m6316(strM30641, AbstractC1365.m5024().m30641())) {
                        iM3169 = C0773.m3169("ۖ֫") ^ i4;
                        i = ((iM3169 ^ i3) * (-22321)) ^ 1649492087;
                        i2 = 2075982568;
                    } else {
                        iM3169 = (C0773.m3169("ۤ᩻") ^ i3) * (-69);
                        i = ((iM3169 ^ i4) * 7791) ^ (-1356333886);
                        i2 = 1811697273;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 676541710:
                case 1429777243:
                    s2 = sArr3[c];
                    s = 1;
                    if (C3077.m10041()) {
                        iM3169 = C0619.m2761("ܶ۠") ^ i3;
                        i = ((iM3169 ^ i4) * (-27115)) ^ (-667569740);
                        i2 = 318141766;
                    } else {
                        iM3169 = C0773.m3169("᩶֫") ^ i3;
                        i = ((iM3169 ^ i4) * (-10259)) ^ (-426304832);
                        i2 = -580829643;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 732792762:
                case 1612384803:
                    localeManager.setApplicationLocales(LocaleList.forLanguageTags(strM30641));
                    break;
                case 1180216779:
                case 1861713243:
                    sArr = f16722;
                    i8 = 79;
                    i9 = 4;
                    if (C2485.f7950 != 0) {
                        iM3169 = C0619.m2761("ܶ۠") ^ i3;
                        i = ((iM3169 ^ i4) * (-27115)) ^ (-667569740);
                        i2 = 318141766;
                    } else {
                        iM3169 = C0773.m3169("ᩴ֫") ^ i3;
                        i = ((iM3169 ^ i4) * (-2979)) ^ (-1306306822);
                        i2 = -104584758;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1294590206:
                case 1295063476:
                    localeM14706 = m14706((Context) contextWrapper, strM14704);
                    localeArr = new Locale[1];
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0773.m3169("֫ۤ") ^ i3;
                        i = ((iM3169 ^ i4) * (-10153)) ^ 613621217;
                        i2 = 638538599;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ܰ᩹")) * q.h;
                        i = ((iM3169 ^ i3) * 2069) ^ (-1192602514);
                        i2 = 1305599669;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    C0269.m1775();
                    if (C2834.f9334 > 0) {
                        iM3169 = C0773.m3169("۫ܺ") ^ i4;
                        i = ((iM3169 ^ i3) * (-4141)) ^ 1294736359;
                        i2 = 1225029022;
                    } else {
                        iM3169 = C0619.m2761("۬ۗ") ^ i3;
                        i = ((iM3169 ^ i4) * (-3833)) ^ (-1354691605);
                        i2 = -557880774;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Context m14715(Context context) {
        Locale localeM14706 = null;
        Resources resources = null;
        Configuration configuration = null;
        float f = 0.0f;
        int i = -234907041;
        int i2 = C2966.f9654;
        int i3 = C2419.f7754;
        int iM2761 = (i3 - C0619.m2761("֨ᩳ")) * 51;
        int i4 = ((iM2761 ^ i2) * (-20365)) ^ 266262381;
        int i5 = 700734854;
        while (true) {
            i = ((((i ^ i2) * (-18573)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2121798560:
                case -160070276:
                    C2419.m8174();
                    if (AbstractC0116.m1243() != 0) {
                        iM2761 = C0619.m2761("۟ۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-30747)) ^ 1311255452;
                        i5 = -437860436;
                    } else {
                        iM2761 = (C0619.m2761("۠᩺") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2761 ^ i2) * 12149) ^ 878317142;
                        i5 = -1834177210;
                    }
                    break;
                case -2079658278:
                case -853625180:
                    configuration.fontScale = f;
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = C0619.m2761("ۧܺ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-19933)) ^ 277526761;
                        i5 = 1944527779;
                    } else {
                        iM2761 = C0773.m3169("ۚۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 3069) ^ 1282013152;
                        i5 = 71485859;
                    }
                    break;
                case -1942629528:
                case 1785063008:
                    configuration.setLocale(localeM14706);
                    configuration.setLayoutDirection(localeM14706);
                    return context.createConfigurationContext(configuration);
                case -1730238646:
                case -221097081:
                    C1542.m5459();
                    AbstractC0116.m1243();
                    return null;
                case -1725921747:
                case 414738555:
                    resources = context.getResources();
                    if (C3448.m11248() != 0) {
                        iM2761 = C0619.m2761("۟ۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-30747)) ^ 1311255452;
                        i5 = -437860436;
                    } else {
                        iM2761 = (C0619.m2761("ܺۢ") ^ i3) * 65;
                        i4 = ((iM2761 ^ i2) * (-14613)) ^ 1974807565;
                        i5 = -1863113949;
                    }
                    break;
                case -1564526371:
                case 87420939:
                    C2878.m9491();
                    if (C1542.f5343 <= 0) {
                        iM2761 = C0773.m3169("ۜۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12839)) ^ 916442609;
                        i5 = 1802148803;
                    } else {
                        iM2761 = (C0619.m2761("۠᩺") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2761 ^ i2) * 12149) ^ 878317142;
                        i5 = -1834177210;
                    }
                    break;
                case -1544218118:
                case 2029640118:
                    C0950.m3785();
                    C1783.m6232();
                    iM2761 = (C0619.m2761("۠᩺") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i4 = ((iM2761 ^ i2) * 12149) ^ 878317142;
                    i5 = -1834177210;
                    break;
                case -1480156649:
                case -952012167:
                    configuration = new Configuration();
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0619.m2761("۟ۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-30747)) ^ 1311255452;
                        i5 = -437860436;
                    } else {
                        iM2761 = C0773.m3169("᩷ۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 13243) ^ (-1144206010);
                        i5 = -2009911494;
                    }
                    break;
                case -1373160758:
                case -48709433:
                    if (C3998.m12920()) {
                        iM2761 = C0619.m2761("۬ᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-17009)) ^ (-51023164);
                        i5 = -2052629313;
                    } else {
                        iM2761 = C0619.m2761("ۧܺ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-19933)) ^ 277526761;
                        i5 = 1944527779;
                    }
                    break;
                case -1372056953:
                case 917757121:
                    if (C1826.m6316(localeM14706, m14707(resources))) {
                        iM2761 = C0619.m2761("᩵֫") ^ i2;
                        i4 = ((iM2761 ^ i3) * 30515) ^ 1783076087;
                        i5 = 651258526;
                    } else {
                        iM2761 = C0619.m2761("ۖܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-6387)) ^ (-1207623794);
                        i5 = 1516137619;
                    }
                    break;
                case -1250436847:
                case 680096366:
                    f16721 = m14716(context);
                    iM2761 = (i3 - C0619.m2761("ۗۧ")) * 73;
                    i4 = ((iM2761 ^ i2) * 8045) ^ (-1352428906);
                    i5 = -454291953;
                    break;
                case -1183925649:
                case 4707825:
                    f = 0.0f;
                    if (C2878.f9462) {
                        iM2761 = C0773.m3169("ۜۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12839)) ^ 916442609;
                        i5 = 1802148803;
                    } else {
                        iM2761 = C0773.m3169("᩹᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7765) ^ (-429732615);
                        i5 = 420897851;
                    }
                    break;
                case -1173156522:
                case 1338731655:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0773.m3169("ۖ᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-6307)) ^ 800351631;
                        i5 = 717756211;
                    } else {
                        iM2761 = C0619.m2761("ܿۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20423) ^ 186384615;
                        i5 = -365941677;
                    }
                    break;
                case -1144154485:
                case -813158959:
                    return context;
                case -1143285796:
                case 291457221:
                    if (C3492.m11488()) {
                        iM2761 = (i2 - C0773.m3169("᩸᩷")) * (-39);
                        i4 = ((iM2761 ^ i3) * (-28489)) ^ 1202475375;
                        i5 = -1097936146;
                    } else {
                        iM2761 = (C0619.m2761("۠᩺") + i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM2761 ^ i2) * 12149) ^ 878317142;
                        i5 = -1834177210;
                    }
                    break;
                case -604497640:
                case 1416074836:
                    if (C4238.m13540() <= 0) {
                        iM2761 = C0619.m2761("۟ۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-30747)) ^ 1311255452;
                        i5 = -437860436;
                    } else {
                        iM2761 = C0619.m2761("ۗ֡") ^ i3;
                        i4 = ((iM2761 ^ i2) * 23855) ^ (-1403409228);
                        i5 = 867028988;
                    }
                    break;
                case -74432742:
                case 268961885:
                    if (AbstractC3624.m11755() == 0) {
                        iM2761 = C0773.m3169("ۖ᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-6307)) ^ 800351631;
                        i5 = 717756211;
                    } else {
                        iM2761 = C0619.m2761("۟ۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-30747)) ^ 1311255452;
                        i5 = -437860436;
                    }
                    break;
                case 218877925:
                case 1953685766:
                    localeM14706 = m14706(context, (String) null);
                    if (C17202.f56030) {
                        iM2761 = C0773.m3169("ۛ֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * 4727) ^ (-1497673144);
                        i5 = 655102643;
                    } else {
                        iM2761 = C0773.m3169("ۜۘ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-12839)) ^ 916442609;
                        i5 = 1802148803;
                    }
                    break;
                case 1648822875:
                case 1804582257:
                    if (C0862.f3233 != 0) {
                        iM2761 = C0773.m3169("ۖ᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-6307)) ^ 800351631;
                        i5 = 717756211;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ۜܿ")) * 89;
                        i4 = ((iM2761 ^ i3) * 18723) ^ (-19965390);
                        i5 = 1145526264;
                    }
                    break;
                default:
                    if (f16721 == null) {
                        iM2761 = C0619.m2761("᩷ۤ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 28811) ^ 288513107;
                        i5 = 1023615958;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۗۧ")) * 73;
                        i4 = ((iM2761 ^ i2) * 8045) ^ (-1352428906);
                        i5 = -454291953;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:193:0x08c2 A[PHI: r2 r4 r5 r6 r7 r8 r18 r21 r22 r23 r24 r25 r30 r31
      0x08c2: PHI (r2v22 int) = (r2v5 int), (r2v7 int), (r2v23 int) binds: [B:192:0x08c0, B:184:0x0849, B:20:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x08c2: PHI (r4v81 int) = (r4v4 int), (r4v6 int), (r4v82 int) binds: [B:192:0x08c0, B:184:0x0849, B:20:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x08c2: PHI (r5v83 int) = (r5v5 int), (r5v7 int), (r5v84 int) binds: [B:192:0x08c0, B:184:0x0849, B:20:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x08c2: PHI (r6v5 short[]) = (r6v2 short[]), (r6v2 short[]), (r6v6 short[]) binds: [B:192:0x08c0, B:184:0x0849, B:20:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x08c2: PHI (r7v5 int) = (r7v2 int), (r7v2 int), (r7v6 int) binds: [B:192:0x08c0, B:184:0x0849, B:20:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x08c2: PHI (r8v5 int) = (r8v2 int), (r8v2 int), (r8v6 int) binds: [B:192:0x08c0, B:184:0x0849, B:20:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x08c2: PHI (r18v5 char) = (r18v3 char), (r18v2 char), (r18v2 char) binds: [B:192:0x08c0, B:184:0x0849, B:20:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x08c2: PHI (r21v5 int) = (r21v2 int), (r21v3 int), (r21v2 int) binds: [B:192:0x08c0, B:184:0x0849, B:20:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x08c2: PHI (r22v5 int) = (r22v2 int), (r22v3 int), (r22v2 int) binds: [B:192:0x08c0, B:184:0x0849, B:20:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x08c2: PHI (r23v20 int) = (r23v4 int), (r23v6 int), (r23v21 int) binds: [B:192:0x08c0, B:184:0x0849, B:20:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x08c2: PHI (r24v18 byte) = (r24v4 byte), (r24v6 byte), (r24v19 byte) binds: [B:192:0x08c0, B:184:0x0849, B:20:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x08c2: PHI (r25v22 short[]) = (r25v5 short[]), (r25v7 short[]), (r25v23 short[]) binds: [B:192:0x08c0, B:184:0x0849, B:20:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x08c2: PHI (r30v51 java.util.Locale) = (r30v3 java.util.Locale), (r30v5 java.util.Locale), (r30v52 java.util.Locale) binds: [B:192:0x08c0, B:184:0x0849, B:20:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x08c2: PHI (r31v48 java.lang.String) = (r31v5 java.lang.String), (r31v7 java.lang.String), (r31v49 java.lang.String) binds: [B:192:0x08c0, B:184:0x0849, B:20:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:153:0x061d. Please report as an issue. */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Locale m14706(Context context, String str) {
        short[] sArr;
        int iM2761;
        int i;
        int i2;
        short[] sArr2;
        int i3;
        int iM3169;
        int i4;
        int i5;
        int iM2762;
        int i6;
        int i7;
        int iM2763;
        int i8;
        int i9;
        int i10;
        int i11 = C23916.f77426;
        int i12 = C11235.f35427;
        int iM31610 = C0773.m3169("ܺ᩷") ^ i12;
        int i13 = ((iM31610 ^ i11) * (-12611)) ^ 1181399038;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i14 = iM31610 ^ (-16108827);
        String strM14704 = null;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        byte b = 0;
        char c = 0;
        short s = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = -262224564;
        int i28 = 0;
        short[] sArr7 = null;
        short[] sArr8 = null;
        int i29 = 0;
        Locale locale = null;
        byte b2 = 0;
        while (true) {
            i27 = i14 ^ (i13 & (((i27 ^ i11) * 32709) >> 31));
            switch (i27) {
                case -2110440489:
                case -1556023371:
                    locale = locale;
                    if (!C2419.m8175(strM14704, C2375.m8069(f16722, 45, 2, i29))) {
                        i28 = i28;
                        short[] sArr9 = sArr8;
                        i15 = i15;
                        i25 = i25;
                        sArr = sArr9;
                        b2 = b;
                        int iM31611 = (C0773.m3169("᩵ۛ") ^ i11) * (-29);
                        strM14704 = strM14704;
                        i = ((iM31611 ^ i12) * 24689) ^ (-1761809412);
                        i10 = iM31611 ^ 1338559710;
                        i24 = i24;
                        Locale locale2 = locale;
                        i14 = i10;
                        i13 = i;
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale2;
                        short[] sArr10 = sArr;
                        i25 = i25;
                        i15 = i15;
                        sArr8 = sArr10;
                    } else {
                        iM2762 = (C0619.m2761("ۢܳ") + i12) * 7;
                        i6 = ((iM2762 ^ i11) * (-3881)) ^ (-1626657285);
                        i7 = -2006208358;
                        Locale locale3 = locale;
                        i14 = iM2762 ^ i7;
                        i13 = i6;
                        locale = locale3;
                    }
                    break;
                case -2100197876:
                case -125627254:
                    sArr = sArr8;
                    i29 = 11151;
                    iM2761 = C0619.m2761("᩹ܶ") ^ i12;
                    i = ((iM2761 ^ i11) * (-12077)) ^ 873273002;
                    i2 = 1701283525;
                    i10 = iM2761 ^ i2;
                    b2 = b2;
                    i24 = i24;
                    Locale locale4 = locale;
                    i14 = i10;
                    i13 = i;
                    strM14704 = strM14704;
                    i28 = i28;
                    locale = locale4;
                    short[] sArr11 = sArr;
                    i25 = i25;
                    i15 = i15;
                    sArr8 = sArr11;
                    break;
                case -2096024011:
                case -2078492594:
                    locale = locale;
                    i24 = i24;
                    i28 = i28;
                    strM14704 = strM14704;
                    b2 = b2;
                    short[] sArr12 = sArr8;
                    i15 = i15;
                    i25 = i25;
                    sArr = sArr12;
                    i22 = i21 * i21;
                    i23 = s * 2;
                    if (C3779.f12953 <= 0) {
                        iM2761 = C0773.m3169("ۢ֫") ^ i11;
                        i = ((iM2761 ^ i12) * 6287) ^ 2099102360;
                        i2 = -1987185820;
                    } else {
                        iM2761 = (C0773.m3169("۟ۤ") ^ i12) * (-41);
                        i = ((iM2761 ^ i11) * (-17451)) ^ (-163357406);
                        i2 = -618814326;
                    }
                    i10 = iM2761 ^ i2;
                    b2 = b2;
                    i24 = i24;
                    Locale locale5 = locale;
                    i14 = i10;
                    i13 = i;
                    strM14704 = strM14704;
                    i28 = i28;
                    locale = locale5;
                    short[] sArr13 = sArr;
                    i25 = i25;
                    i15 = i15;
                    sArr8 = sArr13;
                    break;
                case -2007243608:
                case -283568211:
                    locale = locale;
                    if (!C2419.m8175(strM14704, C3734.m12149(sArr6, i20, i15, i29))) {
                        i28 = i28;
                        short[] sArr14 = sArr8;
                        i15 = i15;
                        i25 = i25;
                        sArr = sArr14;
                        b2 = b;
                        int iM31612 = (C0773.m3169("᩵ۛ") ^ i11) * (-29);
                        strM14704 = strM14704;
                        i = ((iM31612 ^ i12) * 24689) ^ (-1761809412);
                        i10 = iM31612 ^ 1338559710;
                        i24 = i24;
                        Locale locale6 = locale;
                        i14 = i10;
                        i13 = i;
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale6;
                        short[] sArr15 = sArr;
                        i25 = i25;
                        i15 = i15;
                        sArr8 = sArr15;
                    } else {
                        iM2762 = C0619.m2761("ۚ۫") ^ i12;
                        i6 = ((iM2762 ^ i11) * (-23661)) ^ 2070878716;
                        i7 = -536390720;
                        Locale locale7 = locale;
                        i14 = iM2762 ^ i7;
                        i13 = i6;
                        locale = locale7;
                    }
                    break;
                case -1999422029:
                case 1752464391:
                    locale = locale;
                    if (!C2419.m8175(strM14704, C3033.m9847(sArr5, i18, i19, i29))) {
                        i28 = i28;
                        short[] sArr16 = sArr8;
                        i15 = i15;
                        i25 = i25;
                        sArr = sArr16;
                        b2 = b;
                        int iM31613 = (C0773.m3169("᩵ۛ") ^ i11) * (-29);
                        strM14704 = strM14704;
                        i = ((iM31613 ^ i12) * 24689) ^ (-1761809412);
                        i10 = iM31613 ^ 1338559710;
                        i24 = i24;
                        Locale locale8 = locale;
                        i14 = i10;
                        i13 = i;
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale8;
                        short[] sArr17 = sArr;
                        i25 = i25;
                        i15 = i15;
                        sArr8 = sArr17;
                    } else {
                        iM2762 = (C0619.m2761("᩹ܳ") ^ i11) * 59;
                        i6 = ((iM2762 ^ i12) * (-27199)) ^ 1788825589;
                        i7 = 1811188320;
                        Locale locale9 = locale;
                        i14 = iM2762 ^ i7;
                        i13 = i6;
                        locale = locale9;
                    }
                    break;
                case -1999025861:
                case -487412055:
                    locale = locale;
                    short[] sArr18 = sArr8;
                    i24 = i24;
                    i28 = i28;
                    i15 = i15;
                    b2 = b2;
                    i25 = i25;
                    if (!C2419.m8175(strM14704, C2834.m9343(sArr18, i24, i25, i29))) {
                        sArr = sArr18;
                        b2 = b;
                        int iM31614 = (C0773.m3169("᩵ۛ") ^ i11) * (-29);
                        strM14704 = strM14704;
                        i = ((iM31614 ^ i12) * 24689) ^ (-1761809412);
                        i10 = iM31614 ^ 1338559710;
                        i24 = i24;
                        Locale locale10 = locale;
                        i14 = i10;
                        i13 = i;
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale10;
                        short[] sArr19 = sArr;
                        i25 = i25;
                        i15 = i15;
                        sArr8 = sArr19;
                    } else {
                        int iM2764 = C0619.m2761("ۛܿ") ^ i12;
                        sArr = sArr18;
                        i13 = ((iM2764 ^ i11) * 18955) ^ 73899330;
                        i28 = i28;
                        locale = locale;
                        i14 = iM2764 ^ 736363953;
                        b2 = b2;
                        i24 = i24;
                        short[] sArr20 = sArr;
                        i25 = i25;
                        i15 = i15;
                        sArr8 = sArr20;
                    }
                    break;
                case -1971925085:
                case 525454583:
                    locale = locale;
                    i24 = i24;
                    i28 = i28;
                    b2 = b2;
                    short[] sArr21 = sArr8;
                    i15 = i15;
                    i25 = i25;
                    sArr = sArr21;
                    C17202.m40369(strM14704);
                    b = -1;
                    switch (C0619.m2761(strM14704)) {
                        case -704712386:
                            iM3169 = (i12 - C0773.m3169("᩹ۚ")) * 63;
                            i4 = ((iM3169 ^ i11) * (-1619)) ^ 1238568813;
                            i5 = 1945560543;
                            int i30 = iM3169 ^ i5;
                            i28 = i28;
                            locale = locale;
                            i14 = i30;
                            i13 = i4;
                            b2 = b2;
                            i24 = i24;
                            short[] sArr22 = sArr;
                            i25 = i25;
                            i15 = i15;
                            sArr8 = sArr22;
                            break;
                        case -704711850:
                            iM3169 = (i12 - C0773.m3169("᩻۫")) * 87;
                            i4 = ((iM3169 ^ i11) * 14213) ^ 1520143243;
                            i5 = -1881113962;
                            int i31 = iM3169 ^ i5;
                            i28 = i28;
                            locale = locale;
                            i14 = i31;
                            i13 = i4;
                            b2 = b2;
                            i24 = i24;
                            short[] sArr23 = sArr;
                            i25 = i25;
                            i15 = i15;
                            sArr8 = sArr23;
                            break;
                        case 3129:
                            iM3169 = (C0619.m2761("ۜ۫") ^ i11) * 27;
                            i4 = ((iM3169 ^ i12) * 30295) ^ 1099023905;
                            i5 = 615643017;
                            int i32 = iM3169 ^ i5;
                            i28 = i28;
                            locale = locale;
                            i14 = i32;
                            i13 = i4;
                            b2 = b2;
                            i24 = i24;
                            short[] sArr24 = sArr;
                            i25 = i25;
                            i15 = i15;
                            sArr8 = sArr24;
                            break;
                        case 3139:
                            iM3169 = (C0619.m2761("ᩳ᩹") ^ i12) * 25;
                            i4 = ((iM3169 ^ i11) * 8933) ^ (-1140204418);
                            i5 = -1898112447;
                            int i33 = iM3169 ^ i5;
                            i28 = i28;
                            locale = locale;
                            i14 = i33;
                            i13 = i4;
                            b2 = b2;
                            i24 = i24;
                            short[] sArr25 = sArr;
                            i25 = i25;
                            i15 = i15;
                            sArr8 = sArr25;
                            break;
                        case 3241:
                            iM3169 = (C0619.m2761("ۚۚ") + i11) * (-23);
                            i4 = ((iM3169 ^ i12) * (-22997)) ^ (-367891734);
                            i5 = -624960008;
                            int i34 = iM3169 ^ i5;
                            i28 = i28;
                            locale = locale;
                            i14 = i34;
                            i13 = i4;
                            b2 = b2;
                            i24 = i24;
                            short[] sArr26 = sArr;
                            i25 = i25;
                            i15 = i15;
                            sArr8 = sArr26;
                            break;
                        case 3246:
                            iM3169 = C0773.m3169("᩷֡") ^ i12;
                            i4 = ((iM3169 ^ i11) * 2209) ^ (-333356383);
                            i5 = 570522921;
                            int i35 = iM3169 ^ i5;
                            i28 = i28;
                            locale = locale;
                            i14 = i35;
                            i13 = i4;
                            b2 = b2;
                            i24 = i24;
                            short[] sArr27 = sArr;
                            i25 = i25;
                            i15 = i15;
                            sArr8 = sArr27;
                            break;
                        case 3365:
                            iM3169 = C0619.m2761("ᩴۨ") ^ i11;
                            i4 = ((iM3169 ^ i12) * 24433) ^ 2074043320;
                            i5 = 649221235;
                            int i36 = iM3169 ^ i5;
                            i28 = i28;
                            locale = locale;
                            i14 = i36;
                            i13 = i4;
                            b2 = b2;
                            i24 = i24;
                            short[] sArr28 = sArr;
                            i25 = i25;
                            i15 = i15;
                            sArr8 = sArr28;
                            break;
                        case 3371:
                            iM3169 = C0619.m2761("ܶ᩹") ^ i12;
                            i4 = ((iM3169 ^ i11) * (-25133)) ^ (-366843137);
                            i5 = -1767040819;
                            int i37 = iM3169 ^ i5;
                            i28 = i28;
                            locale = locale;
                            i14 = i37;
                            i13 = i4;
                            b2 = b2;
                            i24 = i24;
                            short[] sArr29 = sArr;
                            i25 = i25;
                            i15 = i15;
                            sArr8 = sArr29;
                            break;
                        case 3651:
                            iM3169 = C0619.m2761("֨ܺ") ^ i12;
                            i4 = ((iM3169 ^ i11) * (-775)) ^ 1124466610;
                            i5 = 282574353;
                            int i38 = iM3169 ^ i5;
                            i28 = i28;
                            locale = locale;
                            i14 = i38;
                            i13 = i4;
                            b2 = b2;
                            i24 = i24;
                            short[] sArr210 = sArr;
                            i25 = i25;
                            i15 = i15;
                            sArr8 = sArr210;
                            break;
                        case 3710:
                            iM3169 = (C0619.m2761("ۧܳ") ^ i11) * (-39);
                            i4 = ((iM3169 ^ i12) * (-22485)) ^ (-1651489703);
                            i5 = 689395963;
                            int i39 = iM3169 ^ i5;
                            i28 = i28;
                            locale = locale;
                            i14 = i39;
                            i13 = i4;
                            b2 = b2;
                            i24 = i24;
                            short[] sArr211 = sArr;
                            i25 = i25;
                            i15 = i15;
                            sArr8 = sArr211;
                            break;
                        case 3734:
                            iM3169 = C0773.m3169("ۨ᩹") ^ i11;
                            i4 = ((iM3169 ^ i12) * (-17879)) ^ 1788398043;
                            i5 = -89635464;
                            int i310 = iM3169 ^ i5;
                            i28 = i28;
                            locale = locale;
                            i14 = i310;
                            i13 = i4;
                            b2 = b2;
                            i24 = i24;
                            short[] sArr212 = sArr;
                            i25 = i25;
                            i15 = i15;
                            sArr8 = sArr212;
                            break;
                        case 3005871:
                            iM3169 = C0773.m3169("֫ۖ") ^ i12;
                            i4 = ((iM3169 ^ i11) * 12617) ^ (-1879937805);
                            i5 = -1002008125;
                            int i311 = iM3169 ^ i5;
                            i28 = i28;
                            locale = locale;
                            i14 = i311;
                            i13 = i4;
                            b2 = b2;
                            i24 = i24;
                            short[] sArr213 = sArr;
                            i25 = i25;
                            i15 = i15;
                            sArr8 = sArr213;
                            break;
                        default:
                            b2 = b;
                            int iM31615 = (C0773.m3169("᩵ۛ") ^ i11) * (-29);
                            strM14704 = strM14704;
                            i = ((iM31615 ^ i12) * 24689) ^ (-1761809412);
                            i10 = iM31615 ^ 1338559710;
                            i24 = i24;
                            Locale locale11 = locale;
                            i14 = i10;
                            i13 = i;
                            strM14704 = strM14704;
                            i28 = i28;
                            locale = locale11;
                            short[] sArr110 = sArr;
                            i25 = i25;
                            i15 = i15;
                            sArr8 = sArr110;
                            break;
                    }
                    break;
                case -1970372941:
                case 1713792842:
                    locale = locale;
                    sArr3 = f16722;
                    i26 = 27;
                    i28 = 6;
                    if (C3492.f12043 > 0) {
                        iM2762 = (C0619.m2761("ۛۢ") ^ i12) * (-57);
                        i6 = ((iM2762 ^ i11) * 22597) ^ 66020998;
                        i7 = 1300323258;
                        Locale locale12 = locale;
                        i14 = iM2762 ^ i7;
                        i13 = i6;
                        locale = locale12;
                    } else {
                        strM14704 = strM14704;
                        i24 = i24;
                        i28 = 6;
                        b2 = b2;
                        short[] sArr30 = sArr8;
                        i15 = i15;
                        i25 = i25;
                        sArr = sArr30;
                        iM2761 = (C0773.m3169("֨ۡ") + i11) * (-39);
                        i = ((iM2761 ^ i12) * 10397) ^ (-987618943);
                        i2 = -1572326985;
                        i10 = iM2761 ^ i2;
                        b2 = b2;
                        i24 = i24;
                        Locale locale13 = locale;
                        i14 = i10;
                        i13 = i;
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale13;
                        short[] sArr111 = sArr;
                        i25 = i25;
                        i15 = i15;
                        sArr8 = sArr111;
                    }
                    break;
                case -1957340128:
                case -1020970624:
                    if (C4282.f15546 > 0) {
                        iM2763 = C0773.m3169("֫ܽ") ^ i12;
                        i8 = ((iM2763 ^ i11) * (-10723)) ^ 1333633213;
                        i9 = -387516099;
                        i14 = iM2763 ^ i9;
                        i13 = i8;
                    } else {
                        locale = locale;
                        i24 = i24;
                        i28 = i28;
                        strM14704 = strM14704;
                        b2 = b2;
                        short[] sArr31 = sArr8;
                        i15 = i15;
                        i25 = i25;
                        sArr = sArr31;
                        iM2761 = C0773.m3169("ۢ֫") ^ i11;
                        i = ((iM2761 ^ i12) * 6287) ^ 2099102360;
                        i2 = -1987185820;
                        i10 = iM2761 ^ i2;
                        b2 = b2;
                        i24 = i24;
                        Locale locale14 = locale;
                        i14 = i10;
                        i13 = i;
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale14;
                        short[] sArr112 = sArr;
                        i25 = i25;
                        i15 = i15;
                        sArr8 = sArr112;
                    }
                    break;
                case -1905737898:
                case 2047114395:
                    C4238.m13540();
                    if (!C2878.f9462) {
                        locale = locale;
                        i24 = i24;
                        i28 = i28;
                        strM14704 = strM14704;
                        b2 = b2;
                        short[] sArr32 = sArr8;
                        i15 = i15;
                        i25 = i25;
                        sArr = sArr32;
                        iM2761 = C0773.m3169("ۢ֫") ^ i11;
                        i = ((iM2761 ^ i12) * 6287) ^ 2099102360;
                        i2 = -1987185820;
                        i10 = iM2761 ^ i2;
                        b2 = b2;
                        i24 = i24;
                        Locale locale15 = locale;
                        i14 = i10;
                        i13 = i;
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale15;
                        short[] sArr113 = sArr;
                        i25 = i25;
                        i15 = i15;
                        sArr8 = sArr113;
                    } else {
                        iM2763 = C0619.m2761("֫ᩳ") ^ i11;
                        i8 = ((iM2763 ^ i12) * (-9089)) ^ 900076554;
                        i9 = 1014627478;
                        i14 = iM2763 ^ i9;
                        i13 = i8;
                    }
                    break;
                case -1858895578:
                case 945955823:
                    return Locale.ENGLISH;
                case -1822960972:
                case 416996593:
                    locale = f16721;
                    if (locale != null) {
                        iM2763 = C0773.m3169("ۙۢ") ^ i12;
                        i8 = ((iM2763 ^ i11) * (-28589)) ^ 1334015707;
                        i9 = 719081416;
                    } else {
                        iM2763 = (i12 - C0773.m3169("ۙ᩸")) * (-41);
                        i8 = ((iM2763 ^ i11) * 21207) ^ 1051020286;
                        i9 = 1979284399;
                    }
                    i14 = iM2763 ^ i9;
                    i13 = i8;
                    break;
                case -1820869327:
                case 1843985356:
                    locale = locale;
                    i24 = i24;
                    i28 = i28;
                    strM14704 = strM14704;
                    b2 = b2;
                    short[] sArr33 = sArr8;
                    i15 = i15;
                    i25 = i25;
                    sArr = sArr33;
                    sArr7 = f16722;
                    if (C4238.f15451 < 0) {
                        iM2761 = C0619.m2761("᩺۫") ^ i11;
                        i = ((iM2761 ^ i12) * 3585) ^ (-1260000195);
                        i2 = -1791259150;
                        i10 = iM2761 ^ i2;
                        b2 = b2;
                        i24 = i24;
                        Locale locale16 = locale;
                        i14 = i10;
                        i13 = i;
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale16;
                        short[] sArr114 = sArr;
                        i25 = i25;
                        i15 = i15;
                        sArr8 = sArr114;
                    } else {
                        sArr2 = sArr;
                        i25 = i25;
                        i3 = i24;
                        int iM31616 = C0773.m3169("۬ۧ") ^ i11;
                        int i40 = i15;
                        sArr8 = sArr2;
                        i13 = ((iM31616 ^ i12) * 5827) ^ 1473317963;
                        b2 = b2;
                        i24 = i3;
                        i15 = i40;
                        Locale locale17 = locale;
                        i14 = iM31616 ^ (-104417427);
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale17;
                    }
                    break;
                case -1819652537:
                case 1357362869:
                    C3077.m10041();
                    if (AbstractC0641.f2496 >= 0) {
                        iM2763 = C0619.m2761("ܺᩴ") ^ i12;
                        i8 = ((iM2763 ^ i11) * 1549) ^ 1554279961;
                        i9 = -1989339011;
                        i14 = iM2763 ^ i9;
                        i13 = i8;
                    } else {
                        locale = locale;
                        i24 = i24;
                        i28 = i28;
                        strM14704 = strM14704;
                        b2 = b2;
                        short[] sArr34 = sArr8;
                        i15 = i15;
                        i25 = i25;
                        sArr = sArr34;
                        iM2761 = C0773.m3169("ۢ֫") ^ i11;
                        i = ((iM2761 ^ i12) * 6287) ^ 2099102360;
                        i2 = -1987185820;
                        i10 = iM2761 ^ i2;
                        b2 = b2;
                        i24 = i24;
                        Locale locale18 = locale;
                        i14 = i10;
                        i13 = i;
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale18;
                        short[] sArr115 = sArr;
                        i25 = i25;
                        i15 = i15;
                        sArr8 = sArr115;
                    }
                    break;
                case -1743132078:
                case 1874859838:
                    locale = locale;
                    sArr6 = f16722;
                    i20 = 37;
                    i15 = 2;
                    if (C3099.f10023 > 0) {
                        iM2762 = C0773.m3169("᩻᩸") ^ i11;
                        i6 = ((iM2762 ^ i12) * (-28975)) ^ 1473700298;
                        i7 = -1296304029;
                        Locale locale19 = locale;
                        i14 = iM2762 ^ i7;
                        i13 = i6;
                        locale = locale19;
                    } else {
                        i24 = i24;
                        i25 = i25;
                        i28 = i28;
                        strM14704 = strM14704;
                        b2 = b2;
                        sArr = sArr8;
                        i15 = 2;
                        iM2761 = (C0773.m3169("֨ۡ") + i11) * (-39);
                        i = ((iM2761 ^ i12) * 10397) ^ (-987618943);
                        i2 = -1572326985;
                        i10 = iM2761 ^ i2;
                        b2 = b2;
                        i24 = i24;
                        Locale locale110 = locale;
                        i14 = i10;
                        i13 = i;
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale110;
                        short[] sArr116 = sArr;
                        i25 = i25;
                        i15 = i15;
                        sArr8 = sArr116;
                    }
                    break;
                case -1713029897:
                case 1677937755:
                    locale = locale;
                    i24 = i24;
                    i28 = i28;
                    b2 = b2;
                    short[] sArr35 = sArr8;
                    i15 = i15;
                    i25 = i25;
                    sArr = sArr35;
                    strM14704 = m14704(context);
                    iM3169 = (C0773.m3169("ۘܰ") ^ i11) * (-37);
                    i4 = ((iM3169 ^ i12) * (-9631)) ^ (-2128921094);
                    i5 = 1649211085;
                    int i312 = iM3169 ^ i5;
                    i28 = i28;
                    locale = locale;
                    i14 = i312;
                    i13 = i4;
                    b2 = b2;
                    i24 = i24;
                    short[] sArr214 = sArr;
                    i25 = i25;
                    i15 = i15;
                    sArr8 = sArr214;
                    break;
                case -1680053442:
                case 1453593628:
                    locale = locale;
                    if (!C3492.m11490(strM14704, AbstractC0116.m1236(f16722, 51, 4, i29))) {
                        i28 = i28;
                        short[] sArr117 = sArr8;
                        i15 = i15;
                        i25 = i25;
                        sArr = sArr117;
                        b2 = b;
                        int iM31617 = (C0773.m3169("᩵ۛ") ^ i11) * (-29);
                        strM14704 = strM14704;
                        i = ((iM31617 ^ i12) * 24689) ^ (-1761809412);
                        i10 = iM31617 ^ 1338559710;
                        i24 = i24;
                        Locale locale111 = locale;
                        i14 = i10;
                        i13 = i;
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale111;
                        short[] sArr118 = sArr;
                        i25 = i25;
                        i15 = i15;
                        sArr8 = sArr118;
                    } else {
                        iM2762 = C0773.m3169("۬ᩳ") ^ i11;
                        i6 = ((iM2762 ^ i12) * (-1179)) ^ (-1950277292);
                        i7 = -769245041;
                        Locale locale112 = locale;
                        i14 = iM2762 ^ i7;
                        i13 = i6;
                        locale = locale112;
                    }
                    break;
                case -1610077631:
                case -1553785601:
                    b2 = 6;
                    short[] sArr36 = sArr8;
                    i15 = i15;
                    i25 = i25;
                    sArr = sArr36;
                    int iM31618 = (C0773.m3169("᩵ۛ") ^ i11) * (-29);
                    strM14704 = strM14704;
                    i = ((iM31618 ^ i12) * 24689) ^ (-1761809412);
                    i10 = iM31618 ^ 1338559710;
                    i24 = i24;
                    Locale locale113 = locale;
                    i14 = i10;
                    i13 = i;
                    strM14704 = strM14704;
                    i28 = i28;
                    locale = locale113;
                    short[] sArr119 = sArr;
                    i25 = i25;
                    i15 = i15;
                    sArr8 = sArr119;
                    break;
                case -1592250560:
                case 1462245682:
                    i15 = i15;
                    b2 = b2;
                    locale = locale;
                    i28 = i28;
                    sArr2 = f16722;
                    i3 = 21;
                    i25 = 6;
                    if (C1826.f6190 <= 0) {
                        strM14704 = strM14704;
                        int iM31619 = C0773.m3169("۬ۧ") ^ i11;
                        int i41 = i15;
                        sArr8 = sArr2;
                        i13 = ((iM31619 ^ i12) * 5827) ^ 1473317963;
                        b2 = b2;
                        i24 = i3;
                        i15 = i41;
                        Locale locale114 = locale;
                        i14 = iM31619 ^ (-104417427);
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale114;
                    } else {
                        int iM31620 = (C0773.m3169("֡۟") + i11) * 79;
                        i28 = i28;
                        i15 = i15;
                        locale = locale;
                        sArr8 = sArr2;
                        i14 = iM31620 ^ (-1534621065);
                        i13 = ((iM31620 ^ i12) * 27419) ^ 2087501082;
                        b2 = b2;
                        i24 = 21;
                    }
                    break;
                case -1565188307:
                case -597378614:
                    locale = locale;
                    i24 = i24;
                    i28 = i28;
                    strM14704 = strM14704;
                    b2 = b2;
                    short[] sArr37 = sArr8;
                    i15 = i15;
                    i25 = i25;
                    sArr = sArr37;
                    if (i22 - (i23 + 1) >= 0) {
                        iM2761 = (C0773.m3169("ۙ۫") + i11) * 73;
                        i = ((iM2761 ^ i12) * 15345) ^ 437374556;
                        i2 = -1424179018;
                    } else {
                        iM2761 = C0773.m3169("۠᩸") ^ i12;
                        i = ((iM2761 ^ i11) * 13723) ^ 1909325816;
                        i2 = 271801024;
                    }
                    i10 = iM2761 ^ i2;
                    b2 = b2;
                    i24 = i24;
                    Locale locale115 = locale;
                    i14 = i10;
                    i13 = i;
                    strM14704 = strM14704;
                    i28 = i28;
                    locale = locale115;
                    short[] sArr1110 = sArr;
                    i25 = i25;
                    i15 = i15;
                    sArr8 = sArr1110;
                    break;
                case -1526026048:
                case -1085659594:
                    C3077.m10041();
                    if (AbstractC0116.m1243() == 0) {
                        iM2763 = C0773.m3169("᩷ܳ") ^ i12;
                        i8 = ((iM2763 ^ i11) * 28679) ^ (-1463760918);
                        i9 = -547772281;
                        i14 = iM2763 ^ i9;
                        i13 = i8;
                    } else {
                        locale = locale;
                        sArr2 = sArr8;
                        i28 = i28;
                        strM14704 = strM14704;
                        i15 = i15;
                        i3 = i24;
                        b2 = b2;
                        int iM316110 = C0773.m3169("۬ۧ") ^ i11;
                        int i42 = i15;
                        sArr8 = sArr2;
                        i13 = ((iM316110 ^ i12) * 5827) ^ 1473317963;
                        b2 = b2;
                        i24 = i3;
                        i15 = i42;
                        Locale locale116 = locale;
                        i14 = iM316110 ^ (-104417427);
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale116;
                    }
                    break;
                case -1516544606:
                case 776083793:
                    locale = locale;
                    if (!C3492.m11490(strM14704, RunnableC3646.m11809(f16722, 47, 2, i29))) {
                        i28 = i28;
                        short[] sArr1111 = sArr8;
                        i15 = i15;
                        i25 = i25;
                        sArr = sArr1111;
                        b2 = b;
                        int iM316111 = (C0773.m3169("᩵ۛ") ^ i11) * (-29);
                        strM14704 = strM14704;
                        i = ((iM316111 ^ i12) * 24689) ^ (-1761809412);
                        i10 = iM316111 ^ 1338559710;
                        i24 = i24;
                        Locale locale117 = locale;
                        i14 = i10;
                        i13 = i;
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale117;
                        short[] sArr1112 = sArr;
                        i25 = i25;
                        i15 = i15;
                        sArr8 = sArr1112;
                    } else {
                        iM2762 = (C0773.m3169("֡ۡ") + i11) * 67;
                        i6 = ((iM2762 ^ i12) * (-18101)) ^ (-131975943);
                        i7 = 127304635;
                        Locale locale118 = locale;
                        i14 = iM2762 ^ i7;
                        i13 = i6;
                        locale = locale118;
                    }
                    break;
                case -1424578749:
                case -765208780:
                    locale = locale;
                    i24 = i24;
                    i28 = i28;
                    strM14704 = strM14704;
                    b2 = b2;
                    short[] sArr38 = sArr8;
                    i15 = i15;
                    i25 = i25;
                    sArr = sArr38;
                    s = sArr7[c];
                    i21 = s + 1;
                    if (C1783.f6087 <= 0) {
                        iM2761 = (C0773.m3169("֨ۡ") + i11) * (-39);
                        i = ((iM2761 ^ i12) * 10397) ^ (-987618943);
                        i2 = -1572326985;
                    } else {
                        iM2761 = C0619.m2761("ۨᩴ") ^ i11;
                        i = ((iM2761 ^ i12) * 7301) ^ 1939148541;
                        i2 = -1090577580;
                    }
                    i10 = iM2761 ^ i2;
                    b2 = b2;
                    i24 = i24;
                    Locale locale119 = locale;
                    i14 = i10;
                    i13 = i;
                    strM14704 = strM14704;
                    i28 = i28;
                    locale = locale119;
                    short[] sArr1113 = sArr;
                    i25 = i25;
                    i15 = i15;
                    sArr8 = sArr1113;
                    break;
                case -1344543275:
                case -767775589:
                    locale = locale;
                    i24 = i24;
                    i28 = i28;
                    strM14704 = strM14704;
                    b2 = b2;
                    short[] sArr39 = sArr8;
                    i15 = i15;
                    i25 = i25;
                    sArr = sArr39;
                    c = 20;
                    if (C2375.f7641 <= 0) {
                        iM2761 = C0773.m3169("ۢ֫") ^ i11;
                        i = ((iM2761 ^ i12) * 6287) ^ 2099102360;
                        i2 = -1987185820;
                    } else {
                        iM2761 = C0773.m3169("ۚۖ") ^ i12;
                        i = ((iM2761 ^ i11) * (-17849)) ^ 1718017797;
                        i2 = 1082212188;
                    }
                    i10 = iM2761 ^ i2;
                    b2 = b2;
                    i24 = i24;
                    Locale locale1110 = locale;
                    i14 = i10;
                    i13 = i;
                    strM14704 = strM14704;
                    i28 = i28;
                    locale = locale1110;
                    short[] sArr1114 = sArr;
                    i25 = i25;
                    i15 = i15;
                    sArr8 = sArr1114;
                    break;
                case -1327467401:
                case -527417058:
                    locale = locale;
                    if (!C2419.m8175(strM14704, C4282.m13650(f16722, 39, 2, i29))) {
                        i28 = i28;
                        short[] sArr1115 = sArr8;
                        i15 = i15;
                        i25 = i25;
                        sArr = sArr1115;
                        b2 = b;
                        int iM316112 = (C0773.m3169("᩵ۛ") ^ i11) * (-29);
                        strM14704 = strM14704;
                        i = ((iM316112 ^ i12) * 24689) ^ (-1761809412);
                        i10 = iM316112 ^ 1338559710;
                        i24 = i24;
                        Locale locale1111 = locale;
                        i14 = i10;
                        i13 = i;
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale1111;
                        short[] sArr1116 = sArr;
                        i25 = i25;
                        i15 = i15;
                        sArr8 = sArr1116;
                    } else {
                        iM2762 = C0773.m3169("᩻ۤ") ^ i11;
                        i6 = ((iM2762 ^ i12) * 24035) ^ (-192328767);
                        i7 = 335409079;
                        Locale locale1112 = locale;
                        i14 = iM2762 ^ i7;
                        i13 = i6;
                        locale = locale1112;
                    }
                    break;
                case -1284604933:
                case -857647354:
                    C0862.m3503();
                    RunnableC3646.m11813();
                    return null;
                case -1275035098:
                case -887273709:
                    b2 = 2;
                    short[] sArr310 = sArr8;
                    i15 = i15;
                    i25 = i25;
                    sArr = sArr310;
                    int iM316113 = (C0773.m3169("᩵ۛ") ^ i11) * (-29);
                    strM14704 = strM14704;
                    i = ((iM316113 ^ i12) * 24689) ^ (-1761809412);
                    i10 = iM316113 ^ 1338559710;
                    i24 = i24;
                    Locale locale1113 = locale;
                    i14 = i10;
                    i13 = i;
                    strM14704 = strM14704;
                    i28 = i28;
                    locale = locale1113;
                    short[] sArr1117 = sArr;
                    i25 = i25;
                    i15 = i15;
                    sArr8 = sArr1117;
                    break;
                case -1203853387:
                case 1105513567:
                    return locale;
                case -1192945883:
                case 754642822:
                    locale = locale;
                    if (!C3492.m11490(strM14704, C23916.m53420(sArr4, i16, i17, i29))) {
                        i28 = i28;
                        short[] sArr1118 = sArr8;
                        i15 = i15;
                        i25 = i25;
                        sArr = sArr1118;
                        b2 = b;
                        int iM316114 = (C0773.m3169("᩵ۛ") ^ i11) * (-29);
                        strM14704 = strM14704;
                        i = ((iM316114 ^ i12) * 24689) ^ (-1761809412);
                        i10 = iM316114 ^ 1338559710;
                        i24 = i24;
                        Locale locale1114 = locale;
                        i14 = i10;
                        i13 = i;
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale1114;
                        short[] sArr1119 = sArr;
                        i25 = i25;
                        i15 = i15;
                        sArr8 = sArr1119;
                    } else {
                        iM2762 = C0619.m2761("ۛ᩹") ^ i12;
                        i6 = ((iM2762 ^ i11) * 31867) ^ 112829409;
                        i7 = 652369804;
                        Locale locale1115 = locale;
                        i14 = iM2762 ^ i7;
                        i13 = i6;
                        locale = locale1115;
                    }
                    break;
                case -1190728415:
                case 88323361:
                    b2 = 0;
                    short[] sArr311 = sArr8;
                    i15 = i15;
                    i25 = i25;
                    sArr = sArr311;
                    int iM316115 = (C0773.m3169("᩵ۛ") ^ i11) * (-29);
                    strM14704 = strM14704;
                    i = ((iM316115 ^ i12) * 24689) ^ (-1761809412);
                    i10 = iM316115 ^ 1338559710;
                    i24 = i24;
                    Locale locale1116 = locale;
                    i14 = i10;
                    i13 = i;
                    strM14704 = strM14704;
                    i28 = i28;
                    locale = locale1116;
                    short[] sArr11110 = sArr;
                    i25 = i25;
                    i15 = i15;
                    sArr8 = sArr11110;
                    break;
                case -1134626946:
                case 1611503550:
                    sArr = sArr8;
                    i29 = 11985;
                    iM2761 = C0619.m2761("᩹ܶ") ^ i12;
                    i = ((iM2761 ^ i11) * (-12077)) ^ 873273002;
                    i2 = 1701283525;
                    i10 = iM2761 ^ i2;
                    b2 = b2;
                    i24 = i24;
                    Locale locale1117 = locale;
                    i14 = i10;
                    i13 = i;
                    strM14704 = strM14704;
                    i28 = i28;
                    locale = locale1117;
                    short[] sArr11111 = sArr;
                    i25 = i25;
                    i15 = i15;
                    sArr8 = sArr11111;
                    break;
                case -1092766096:
                case -542253282:
                    return new Locale(strM14704);
                case -1068767617:
                case -803584785:
                    locale = locale;
                    if (!C3492.m11490(strM14704, C1542.m5471(f16722, 49, 2, i29))) {
                        i28 = i28;
                        short[] sArr11112 = sArr8;
                        i15 = i15;
                        i25 = i25;
                        sArr = sArr11112;
                        b2 = b;
                        int iM316116 = (C0773.m3169("᩵ۛ") ^ i11) * (-29);
                        strM14704 = strM14704;
                        i = ((iM316116 ^ i12) * 24689) ^ (-1761809412);
                        i10 = iM316116 ^ 1338559710;
                        i24 = i24;
                        Locale locale1118 = locale;
                        i14 = i10;
                        i13 = i;
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale1118;
                        short[] sArr11113 = sArr;
                        i25 = i25;
                        i15 = i15;
                        sArr8 = sArr11113;
                    } else {
                        iM2762 = C0773.m3169("ܰܶ") ^ i12;
                        i6 = ((iM2762 ^ i11) * (-17329)) ^ (-1092021817);
                        i7 = 1888542474;
                        Locale locale1119 = locale;
                        i14 = iM2762 ^ i7;
                        i13 = i6;
                        locale = locale1119;
                    }
                    break;
                case -883895701:
                case -142176692:
                    locale = locale;
                    i24 = i24;
                    i28 = i28;
                    strM14704 = strM14704;
                    b2 = b2;
                    short[] sArr40 = sArr8;
                    i15 = i15;
                    i25 = i25;
                    sArr = sArr40;
                    if (str != null) {
                        strM14704 = str;
                        iM3169 = (C0773.m3169("ۘܰ") ^ i11) * (-37);
                        i4 = ((iM3169 ^ i12) * (-9631)) ^ (-2128921094);
                        i5 = 1649211085;
                        int i313 = iM3169 ^ i5;
                        i28 = i28;
                        locale = locale;
                        i14 = i313;
                        i13 = i4;
                        b2 = b2;
                        i24 = i24;
                        short[] sArr215 = sArr;
                        i25 = i25;
                        i15 = i15;
                        sArr8 = sArr215;
                    } else {
                        iM2761 = C0619.m2761("᩻ᩳ") ^ i11;
                        i = ((iM2761 ^ i12) * (-14625)) ^ 653845386;
                        i2 = -1559945159;
                        i10 = iM2761 ^ i2;
                        b2 = b2;
                        i24 = i24;
                        Locale locale11110 = locale;
                        i14 = i10;
                        i13 = i;
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale11110;
                        short[] sArr11114 = sArr;
                        i25 = i25;
                        i15 = i15;
                        sArr8 = sArr11114;
                    }
                    break;
                case -877786224:
                case 24005222:
                    short[] sArr41 = f16722;
                    locale = locale;
                    if (C2310.f7472 < 0) {
                        throw new IllegalArgumentException(C4282.m13652(C1321.m4861(sArr41, 55, 23, i29), strM14704));
                    }
                    iM2762 = (C0773.m3169("۫᩷") ^ i12) * 43;
                    i6 = ((iM2762 ^ i11) * (-19969)) ^ 2145932760;
                    i7 = -1379174388;
                    Locale locale11111 = locale;
                    i14 = iM2762 ^ i7;
                    i13 = i6;
                    locale = locale11111;
                    break;
                case -694250478:
                case 462410067:
                    C2375.m8065();
                    C3099.m10095();
                    locale = locale;
                    i24 = i24;
                    i28 = i28;
                    strM14704 = strM14704;
                    b2 = b2;
                    short[] sArr312 = sArr8;
                    i15 = i15;
                    i25 = i25;
                    sArr = sArr312;
                    iM2761 = C0773.m3169("ۢ֫") ^ i11;
                    i = ((iM2761 ^ i12) * 6287) ^ 2099102360;
                    i2 = -1987185820;
                    i10 = iM2761 ^ i2;
                    b2 = b2;
                    i24 = i24;
                    Locale locale11112 = locale;
                    i14 = i10;
                    i13 = i;
                    strM14704 = strM14704;
                    i28 = i28;
                    locale = locale11112;
                    short[] sArr11115 = sArr;
                    i25 = i25;
                    i15 = i15;
                    sArr8 = sArr11115;
                    break;
                case -690478173:
                case 2022792729:
                    locale = locale;
                    sArr5 = f16722;
                    i18 = 35;
                    i19 = 2;
                    if (C2834.f9334 <= 0) {
                        iM2762 = (C0773.m3169("۫᩷") ^ i12) * 43;
                        i6 = ((iM2762 ^ i11) * (-19969)) ^ 2145932760;
                        i7 = -1379174388;
                    } else {
                        iM2762 = C0773.m3169("ܿᩴ") ^ i12;
                        i6 = ((iM2762 ^ i11) * (-10831)) ^ 55108371;
                        i7 = -90786746;
                    }
                    Locale locale11113 = locale;
                    i14 = iM2762 ^ i7;
                    i13 = i6;
                    locale = locale11113;
                    break;
                case -565121968:
                case 1927658437:
                    b2 = 4;
                    short[] sArr313 = sArr8;
                    i15 = i15;
                    i25 = i25;
                    sArr = sArr313;
                    int iM316117 = (C0773.m3169("᩵ۛ") ^ i11) * (-29);
                    strM14704 = strM14704;
                    i = ((iM316117 ^ i12) * 24689) ^ (-1761809412);
                    i10 = iM316117 ^ 1338559710;
                    i24 = i24;
                    Locale locale11114 = locale;
                    i14 = i10;
                    i13 = i;
                    strM14704 = strM14704;
                    i28 = i28;
                    locale = locale11114;
                    short[] sArr11116 = sArr;
                    i25 = i25;
                    i15 = i15;
                    sArr8 = sArr11116;
                    break;
                case -495842728:
                case 741842403:
                    b2 = 10;
                    short[] sArr314 = sArr8;
                    i15 = i15;
                    i25 = i25;
                    sArr = sArr314;
                    int iM316118 = (C0773.m3169("᩵ۛ") ^ i11) * (-29);
                    strM14704 = strM14704;
                    i = ((iM316118 ^ i12) * 24689) ^ (-1761809412);
                    i10 = iM316118 ^ 1338559710;
                    i24 = i24;
                    Locale locale11115 = locale;
                    i14 = i10;
                    i13 = i;
                    strM14704 = strM14704;
                    i28 = i28;
                    locale = locale11115;
                    short[] sArr11117 = sArr;
                    i25 = i25;
                    i15 = i15;
                    sArr8 = sArr11117;
                    break;
                case -435552834:
                case 31303652:
                    C1146.m4231();
                    if (C2966.f9654 >= 0) {
                        locale = locale;
                        sArr2 = sArr8;
                        i28 = i28;
                        strM14704 = strM14704;
                        i15 = i15;
                        i3 = i24;
                        b2 = b2;
                        int iM316119 = C0773.m3169("۬ۧ") ^ i11;
                        int i43 = i15;
                        sArr8 = sArr2;
                        i13 = ((iM316119 ^ i12) * 5827) ^ 1473317963;
                        b2 = b2;
                        i24 = i3;
                        i15 = i43;
                        Locale locale1120 = locale;
                        i14 = iM316119 ^ (-104417427);
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale1120;
                    } else {
                        locale = locale;
                        i24 = i24;
                        i28 = i28;
                        strM14704 = strM14704;
                        b2 = b2;
                        short[] sArr315 = sArr8;
                        i15 = i15;
                        i25 = i25;
                        sArr = sArr315;
                        iM2761 = C0773.m3169("ۢ֫") ^ i11;
                        i = ((iM2761 ^ i12) * 6287) ^ 2099102360;
                        i2 = -1987185820;
                        i10 = iM2761 ^ i2;
                        b2 = b2;
                        i24 = i24;
                        Locale locale11116 = locale;
                        i14 = i10;
                        i13 = i;
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale11116;
                        short[] sArr11118 = sArr;
                        i25 = i25;
                        i15 = i15;
                        sArr8 = sArr11118;
                    }
                    break;
                case -389684706:
                case 599878387:
                    b2 = 11;
                    short[] sArr316 = sArr8;
                    i15 = i15;
                    i25 = i25;
                    sArr = sArr316;
                    int iM3161110 = (C0773.m3169("᩵ۛ") ^ i11) * (-29);
                    strM14704 = strM14704;
                    i = ((iM3161110 ^ i12) * 24689) ^ (-1761809412);
                    i10 = iM3161110 ^ 1338559710;
                    i24 = i24;
                    Locale locale11117 = locale;
                    i14 = i10;
                    i13 = i;
                    strM14704 = strM14704;
                    i28 = i28;
                    locale = locale11117;
                    short[] sArr11119 = sArr;
                    i25 = i25;
                    i15 = i15;
                    sArr8 = sArr11119;
                    break;
                case -193454514:
                case 620498042:
                    if (C1564.f5401 <= 0) {
                        locale = locale;
                        iM2762 = (C0773.m3169("۫᩷") ^ i12) * 43;
                        i6 = ((iM2762 ^ i11) * (-19969)) ^ 2145932760;
                        i7 = -1379174388;
                        Locale locale11118 = locale;
                        i14 = iM2762 ^ i7;
                        i13 = i6;
                        locale = locale11118;
                    } else {
                        iM2763 = C0773.m3169("֫ܽ") ^ i12;
                        i8 = ((iM2763 ^ i11) * (-10723)) ^ 1333633213;
                        i9 = -387516099;
                        i14 = iM2763 ^ i9;
                        i13 = i8;
                    }
                    break;
                case -159273647:
                case 910560169:
                    b2 = 1;
                    short[] sArr317 = sArr8;
                    i15 = i15;
                    i25 = i25;
                    sArr = sArr317;
                    int iM3161111 = (C0773.m3169("᩵ۛ") ^ i11) * (-29);
                    strM14704 = strM14704;
                    i = ((iM3161111 ^ i12) * 24689) ^ (-1761809412);
                    i10 = iM3161111 ^ 1338559710;
                    i24 = i24;
                    Locale locale11119 = locale;
                    i14 = i10;
                    i13 = i;
                    strM14704 = strM14704;
                    i28 = i28;
                    locale = locale11119;
                    short[] sArr111110 = sArr;
                    i25 = i25;
                    i15 = i15;
                    sArr8 = sArr111110;
                    break;
                case -95648796:
                case 1084402369:
                    b2 = 3;
                    short[] sArr318 = sArr8;
                    i15 = i15;
                    i25 = i25;
                    sArr = sArr318;
                    int iM3161112 = (C0773.m3169("᩵ۛ") ^ i11) * (-29);
                    strM14704 = strM14704;
                    i = ((iM3161112 ^ i12) * 24689) ^ (-1761809412);
                    i10 = iM3161112 ^ 1338559710;
                    i24 = i24;
                    Locale locale111110 = locale;
                    i14 = i10;
                    i13 = i;
                    strM14704 = strM14704;
                    i28 = i28;
                    locale = locale111110;
                    short[] sArr111111 = sArr;
                    i25 = i25;
                    i15 = i15;
                    sArr8 = sArr111111;
                    break;
                case -71466510:
                case 1849220057:
                    b2 = 9;
                    short[] sArr319 = sArr8;
                    i15 = i15;
                    i25 = i25;
                    sArr = sArr319;
                    int iM3161113 = (C0773.m3169("᩵ۛ") ^ i11) * (-29);
                    strM14704 = strM14704;
                    i = ((iM3161113 ^ i12) * 24689) ^ (-1761809412);
                    i10 = iM3161113 ^ 1338559710;
                    i24 = i24;
                    Locale locale111111 = locale;
                    i14 = i10;
                    i13 = i;
                    strM14704 = strM14704;
                    i28 = i28;
                    locale = locale111111;
                    short[] sArr111112 = sArr;
                    i25 = i25;
                    i15 = i15;
                    sArr8 = sArr111112;
                    break;
                case 72339866:
                case 873746806:
                    locale = locale;
                    if (!C3492.m11490(strM14704, C3492.m11486(f16722, 43, 2, i29))) {
                        i28 = i28;
                        short[] sArr111113 = sArr8;
                        i15 = i15;
                        i25 = i25;
                        sArr = sArr111113;
                        b2 = b;
                        int iM3161114 = (C0773.m3169("᩵ۛ") ^ i11) * (-29);
                        strM14704 = strM14704;
                        i = ((iM3161114 ^ i12) * 24689) ^ (-1761809412);
                        i10 = iM3161114 ^ 1338559710;
                        i24 = i24;
                        Locale locale111112 = locale;
                        i14 = i10;
                        i13 = i;
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale111112;
                        short[] sArr111114 = sArr;
                        i25 = i25;
                        i15 = i15;
                        sArr8 = sArr111114;
                    } else {
                        iM2762 = (i12 - C0619.m2761("ۘۘ")) * 7;
                        i6 = ((iM2762 ^ i11) * (-16165)) ^ 298428874;
                        i7 = 1559236445;
                        Locale locale111113 = locale;
                        i14 = iM2762 ^ i7;
                        i13 = i6;
                        locale = locale111113;
                    }
                    break;
                case 110781736:
                case 804688692:
                    C23916.m53419();
                    if (C1321.f4751 < 0) {
                        iM2763 = (C0773.m3169("ᩴۢ") ^ i11) * 19;
                        i8 = ((iM2763 ^ i12) * (-4159)) ^ (-1616115378);
                        i9 = 239101277;
                        i14 = iM2763 ^ i9;
                        i13 = i8;
                    } else {
                        locale = locale;
                        i24 = i24;
                        i28 = i28;
                        strM14704 = strM14704;
                        b2 = b2;
                        short[] sArr3110 = sArr8;
                        i15 = i15;
                        i25 = i25;
                        sArr = sArr3110;
                        iM2761 = C0773.m3169("ۢ֫") ^ i11;
                        i = ((iM2761 ^ i12) * 6287) ^ 2099102360;
                        i2 = -1987185820;
                        i10 = iM2761 ^ i2;
                        b2 = b2;
                        i24 = i24;
                        Locale locale111114 = locale;
                        i14 = i10;
                        i13 = i;
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale111114;
                        short[] sArr111115 = sArr;
                        i25 = i25;
                        i15 = i15;
                        sArr8 = sArr111115;
                    }
                    break;
                case 117118751:
                case 1172996390:
                    locale = locale;
                    int i44 = i26;
                    i28 = i28;
                    if (C3492.m11490(strM14704, C2485.m8350(sArr3, i44, i28, i29))) {
                        int iM2765 = (i11 - C0619.m2761("ۨ᩸")) * 13;
                        i26 = i44;
                        i13 = ((iM2765 ^ i12) * (-21603)) ^ (-2116290806);
                        i28 = i28;
                        locale = locale;
                        i14 = iM2765 ^ 201239071;
                    } else {
                        i26 = i44;
                        short[] sArr111116 = sArr8;
                        i15 = i15;
                        i25 = i25;
                        sArr = sArr111116;
                        b2 = b;
                        int iM3161115 = (C0773.m3169("᩵ۛ") ^ i11) * (-29);
                        strM14704 = strM14704;
                        i = ((iM3161115 ^ i12) * 24689) ^ (-1761809412);
                        i10 = iM3161115 ^ 1338559710;
                        i24 = i24;
                        Locale locale111115 = locale;
                        i14 = i10;
                        i13 = i;
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale111115;
                        short[] sArr111117 = sArr;
                        i25 = i25;
                        i15 = i15;
                        sArr8 = sArr111117;
                    }
                    break;
                case 146634216:
                case 689801192:
                    b2 = 5;
                    short[] sArr3111 = sArr8;
                    i15 = i15;
                    i25 = i25;
                    sArr = sArr3111;
                    int iM3161116 = (C0773.m3169("᩵ۛ") ^ i11) * (-29);
                    strM14704 = strM14704;
                    i = ((iM3161116 ^ i12) * 24689) ^ (-1761809412);
                    i10 = iM3161116 ^ 1338559710;
                    i24 = i24;
                    Locale locale111116 = locale;
                    i14 = i10;
                    i13 = i;
                    strM14704 = strM14704;
                    i28 = i28;
                    locale = locale111116;
                    short[] sArr111118 = sArr;
                    i25 = i25;
                    i15 = i15;
                    sArr8 = sArr111118;
                    break;
                case 152680442:
                case 290368810:
                    locale = locale;
                    sArr4 = f16722;
                    i16 = 33;
                    i17 = 2;
                    if (C2310.m7813() > 0) {
                        iM2762 = (i11 - C0773.m3169("֫ܶ")) * (-121);
                        i6 = ((iM2762 ^ i12) * (-21647)) ^ 935473354;
                        i7 = -1845042168;
                        Locale locale111117 = locale;
                        i14 = iM2762 ^ i7;
                        i13 = i6;
                        locale = locale111117;
                    } else {
                        i24 = i24;
                        i28 = i28;
                        strM14704 = strM14704;
                        b2 = b2;
                        short[] sArr3112 = sArr8;
                        i15 = i15;
                        i25 = i25;
                        sArr = sArr3112;
                        iM2761 = C0773.m3169("ۢ֫") ^ i11;
                        i = ((iM2761 ^ i12) * 6287) ^ 2099102360;
                        i2 = -1987185820;
                        i10 = iM2761 ^ i2;
                        b2 = b2;
                        i24 = i24;
                        Locale locale111118 = locale;
                        i14 = i10;
                        i13 = i;
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale111118;
                        short[] sArr111119 = sArr;
                        i25 = i25;
                        i15 = i15;
                        sArr8 = sArr111119;
                    }
                    break;
                case 155883377:
                case 202735500:
                    return Locale.getDefault();
                case 459074414:
                case 1817491510:
                    locale = locale;
                    switch (b2) {
                        case 0:
                            iM2762 = (C0773.m3169("۟۠") ^ i12) * (-25);
                            i6 = ((iM2762 ^ i11) * 13831) ^ 1458839026;
                            i7 = -749284686;
                            break;
                        case 1:
                            iM2762 = C0619.m2761("᩻۟") ^ i11;
                            i6 = ((iM2762 ^ i12) * 25249) ^ (-1419511632);
                            i7 = 1786538199;
                            break;
                        case 2:
                        case 3:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            iM2762 = C0773.m3169("ۨۨ") ^ i12;
                            i6 = ((iM2762 ^ i11) * 20625) ^ (-717655156);
                            i7 = 742348836;
                            break;
                        case 4:
                            iM2762 = C0619.m2761("ۨ۠") ^ i11;
                            i6 = ((iM2762 ^ i12) * (-7925)) ^ (-1424379209);
                            i7 = 42052737;
                            break;
                        case 11:
                            iM2762 = C0773.m3169("ܰۡ") ^ i12;
                            i6 = ((iM2762 ^ i11) * 8225) ^ 1399692694;
                            i7 = -1976038892;
                            break;
                        default:
                            iM2762 = (i11 - C0773.m3169("ۛܳ")) * 19;
                            i6 = ((iM2762 ^ i12) * (-2475)) ^ (-1069215568);
                            i7 = -1788809494;
                            break;
                    }
                    Locale locale111119 = locale;
                    i14 = iM2762 ^ i7;
                    i13 = i6;
                    locale = locale111119;
                    break;
                case 475151633:
                case 1867416959:
                    locale = locale;
                    if (!C3492.m11490(strM14704, C2287.m7749(f16722, 41, 2, i29))) {
                        i28 = i28;
                        short[] sArr1111110 = sArr8;
                        i15 = i15;
                        i25 = i25;
                        sArr = sArr1111110;
                        b2 = b;
                        int iM3161117 = (C0773.m3169("᩵ۛ") ^ i11) * (-29);
                        strM14704 = strM14704;
                        i = ((iM3161117 ^ i12) * 24689) ^ (-1761809412);
                        i10 = iM3161117 ^ 1338559710;
                        i24 = i24;
                        Locale locale1111110 = locale;
                        i14 = i10;
                        i13 = i;
                        strM14704 = strM14704;
                        i28 = i28;
                        locale = locale1111110;
                        short[] sArr1111111 = sArr;
                        i25 = i25;
                        i15 = i15;
                        sArr8 = sArr1111111;
                    } else {
                        iM2762 = C0619.m2761("᩷۫") ^ i11;
                        i6 = ((iM2762 ^ i12) * (-30317)) ^ 1672276892;
                        i7 = -1696054653;
                        Locale locale1111111 = locale;
                        i14 = iM2762 ^ i7;
                        i13 = i6;
                        locale = locale1111111;
                    }
                    break;
                case 1165097015:
                case 1303945295:
                    AbstractC3624.m11755();
                    if (C3998.f13671 != 0) {
                        iM2763 = (C0619.m2761("ۚ۬") ^ i11) * 93;
                        i8 = ((iM2763 ^ i12) * 10017) ^ (-839591340);
                        i9 = -1865371270;
                        i14 = iM2763 ^ i9;
                        i13 = i8;
                    } else {
                        locale = locale;
                        iM2762 = (C0773.m3169("۫᩷") ^ i12) * 43;
                        i6 = ((iM2762 ^ i11) * (-19969)) ^ 2145932760;
                        i7 = -1379174388;
                        Locale locale1111112 = locale;
                        i14 = iM2762 ^ i7;
                        i13 = i6;
                        locale = locale1111112;
                    }
                    break;
                case 1352401029:
                case 1806463731:
                    return Locale.TRADITIONAL_CHINESE;
                case 1490642193:
                case 1637364133:
                    b2 = 7;
                    short[] sArr3113 = sArr8;
                    i15 = i15;
                    i25 = i25;
                    sArr = sArr3113;
                    int iM3161118 = (C0773.m3169("᩵ۛ") ^ i11) * (-29);
                    strM14704 = strM14704;
                    i = ((iM3161118 ^ i12) * 24689) ^ (-1761809412);
                    i10 = iM3161118 ^ 1338559710;
                    i24 = i24;
                    Locale locale1111113 = locale;
                    i14 = i10;
                    i13 = i;
                    strM14704 = strM14704;
                    i28 = i28;
                    locale = locale1111113;
                    short[] sArr1111112 = sArr;
                    i25 = i25;
                    i15 = i15;
                    sArr8 = sArr1111112;
                    break;
                case 1802612592:
                case 1954649313:
                    return Locale.SIMPLIFIED_CHINESE;
                default:
                    b2 = 8;
                    short[] sArr3114 = sArr8;
                    i15 = i15;
                    i25 = i25;
                    sArr = sArr3114;
                    int iM3161119 = (C0773.m3169("᩵ۛ") ^ i11) * (-29);
                    strM14704 = strM14704;
                    i = ((iM3161119 ^ i12) * 24689) ^ (-1761809412);
                    i10 = iM3161119 ^ 1338559710;
                    i24 = i24;
                    Locale locale1111114 = locale;
                    i14 = i10;
                    i13 = i;
                    strM14704 = strM14704;
                    i28 = i28;
                    locale = locale1111114;
                    short[] sArr1111113 = sArr;
                    i25 = i25;
                    i15 = i15;
                    sArr8 = sArr1111113;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0292 A[PHI: r6 r17
      0x0292: PHI (r6v3 int) = (r6v1 int), (r6v2 int), (r6v1 int) binds: [B:73:0x0290, B:57:0x0206, B:19:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0292: PHI (r17v19 java.util.Locale) = (r17v4 java.util.Locale), (r17v8 java.util.Locale), (r17v20 java.util.Locale) binds: [B:73:0x0290, B:57:0x0206, B:19:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02c3 A[PHI: r3 r4 r5 r9 r10 r17
      0x02c3: PHI (r3v3 char) = (r3v1 char), (r3v2 char), (r3v1 char), (r3v1 char) binds: [B:77:0x02c1, B:65:0x024c, B:61:0x0229, B:38:0x013d] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r4v3 short) = (r4v1 short), (r4v1 short), (r4v2 short), (r4v1 short) binds: [B:77:0x02c1, B:65:0x024c, B:61:0x0229, B:38:0x013d] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r5v3 int) = (r5v1 int), (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:77:0x02c1, B:65:0x024c, B:61:0x0229, B:38:0x013d] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r9v2 short[]) = (r9v1 short[]), (r9v1 short[]), (r9v1 short[]), (r9v3 short[]) binds: [B:77:0x02c1, B:65:0x024c, B:61:0x0229, B:38:0x013d] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r10v2 int) = (r10v1 int), (r10v1 int), (r10v1 int), (r10v3 int) binds: [B:77:0x02c1, B:65:0x024c, B:61:0x0229, B:38:0x013d] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r17v14 java.util.Locale) = (r17v3 java.util.Locale), (r17v6 java.util.Locale), (r17v7 java.util.Locale), (r17v15 java.util.Locale) binds: [B:77:0x02c1, B:65:0x024c, B:61:0x0229, B:38:0x013d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x02fa A[PHI: r2 r7 r17
      0x02fa: PHI (r2v4 short[]) = (r2v2 short[]), (r2v1 short[]), (r2v1 short[]), (r2v1 short[]) binds: [B:81:0x02f8, B:69:0x026d, B:53:0x01e0, B:10:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x02fa: PHI (r7v4 short) = (r7v1 short), (r7v1 short), (r7v2 short), (r7v1 short) binds: [B:81:0x02f8, B:69:0x026d, B:53:0x01e0, B:10:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x02fa: PHI (r17v28 java.util.Locale) = (r17v2 java.util.Locale), (r17v5 java.util.Locale), (r17v9 java.util.Locale), (r17v29 java.util.Locale) binds: [B:81:0x02f8, B:69:0x026d, B:53:0x01e0, B:10:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Locale m14716(Context context) {
        int iM3169;
        int i;
        int i2;
        int iM2761;
        int i3;
        int i4;
        Locale locale = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i5 = 0;
        int i6 = 0;
        short s2 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = -206759720;
        int i11 = C1542.f5343;
        int i12 = C23916.f77426;
        int iM2762 = (i11 - C0619.m2761("۬ۢ")) * 25;
        int i13 = ((iM2762 ^ i12) * 6889) ^ (-723878905);
        int i14 = iM2762 ^ (-1957431668);
        LocaleManager localeManager = null;
        while (true) {
            i10 = i14 ^ (i13 & (((i10 ^ i12) * (-2913)) >> 31));
            switch (i10) {
                case -2132818166:
                case -1833316029:
                    locale = locale;
                    c = '\\';
                    if (C3448.f11240 >= 0) {
                        iM3169 = (C0773.m3169("ۡ֨") ^ i11) * (-57);
                        i = ((iM3169 ^ i12) * (-1507)) ^ (-931271041);
                        i2 = -56359548;
                    } else {
                        iM3169 = (C0619.m2761("ۨ᩷") ^ i11) * (-21);
                        i = ((iM3169 ^ i12) * 4457) ^ 122089381;
                        i2 = -146820349;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    locale = locale;
                    break;
                case -2081915647:
                case 1443170980:
                    C0862.m3503();
                    C0773.m3161();
                    locale = locale;
                    iM3169 = C0773.m3169("᩹ᩳ") ^ i11;
                    i = ((iM3169 ^ i12) * 24769) ^ (-1099851148);
                    i2 = 1953084958;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    locale = locale;
                    break;
                case -1904221163:
                case 107723013:
                    i7 = 56698;
                    iM3169 = C0773.m3169("֫ܰ") ^ i11;
                    i = ((iM3169 ^ i12) * (-5419)) ^ (-1419766541);
                    i2 = -1823680283;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    locale = locale;
                    break;
                case -1810179974:
                case -29674764:
                    locale = locale;
                    if (C2023.f6737) {
                        iM3169 = C0773.m3169("᩹ᩳ") ^ i11;
                        i = ((iM3169 ^ i12) * 24769) ^ (-1099851148);
                        i2 = 1953084958;
                    } else {
                        iM3169 = (C0773.m3169("᩹᩷") + i11) * 81;
                        i = ((iM3169 ^ i12) * (-32355)) ^ 866791877;
                        i2 = -1438644439;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    locale = locale;
                    break;
                case -1794867932:
                case -1381669839:
                    locale = locale;
                    if (i6 - (s * s2) < 0) {
                        iM3169 = (i11 - C0773.m3169("ۨۘ")) * 91;
                        i = ((iM3169 ^ i12) * 27721) ^ 1549259074;
                        i2 = 320569169;
                    } else {
                        iM3169 = C0773.m3169("֨ۡ") ^ i12;
                        i = ((iM3169 ^ i11) * 18073) ^ (-465608853);
                        i2 = -1944893482;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    locale = locale;
                    break;
                case -1591356086:
                case 815067549:
                    locale = locale;
                    sArr = f16722;
                    if (C1783.f6087 <= 0) {
                        iM3169 = C0773.m3169("᩹ᩳ") ^ i11;
                        i = ((iM3169 ^ i12) * 24769) ^ (-1099851148);
                        i2 = 1953084958;
                    } else {
                        iM3169 = C0773.m3169("᩻ۡ") ^ i12;
                        i = ((iM3169 ^ i11) * (-3695)) ^ (-1985064075);
                        i2 = 1592397576;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    locale = locale;
                    break;
                case -1513160092:
                case -1488649936:
                    locale = localeManager.getSystemLocales().get(0);
                    if (locale == null) {
                        iM3169 = C0773.m3169("ۚ᩸") ^ i12;
                        locale = locale;
                        i = ((iM3169 ^ i11) * (-27207)) ^ (-849002865);
                        i2 = 672031893;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                        locale = locale;
                    } else {
                        iM2761 = C0619.m2761("ᩳۛ") ^ i12;
                        i3 = ((iM2761 ^ i11) * (-19867)) ^ 293379980;
                        i4 = -128990942;
                        int i15 = i3;
                        i14 = iM2761 ^ i4;
                        i13 = i15;
                    }
                    break;
                case -1447460276:
                case -1030627927:
                    locale = locale;
                    i6 = i5 + 336098889;
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = C0619.m2761("ۖۢ") ^ i11;
                        i = ((iM3169 ^ i12) * 22211) ^ 352776007;
                        i2 = 526651460;
                    } else {
                        iM3169 = C0773.m3169("ᩴۢ") ^ i12;
                        i = ((iM3169 ^ i11) * (-8273)) ^ (-97870032);
                        i2 = 1144281680;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    locale = locale;
                    break;
                case -1225743751:
                case -842678183:
                    i7 = 14696;
                    iM3169 = C0773.m3169("֫ܰ") ^ i11;
                    i = ((iM3169 ^ i12) * (-5419)) ^ (-1419766541);
                    i2 = -1823680283;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    locale = locale;
                    break;
                case -1171242892:
                case 2127835944:
                    locale = locale;
                    s2 = 36666;
                    if (C2287.f7432 >= 0) {
                        iM3169 = C0773.m3169("᩹ᩳ") ^ i11;
                        i = ((iM3169 ^ i12) * 24769) ^ (-1099851148);
                        i2 = 1953084958;
                    } else {
                        iM3169 = (C0773.m3169("᩷ܽ") ^ i11) * 49;
                        i = ((iM3169 ^ i12) * 10589) ^ (-1480094567);
                        i2 = -1628022706;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    locale = locale;
                    break;
                case -1149785976:
                case 205042082:
                    locale = locale;
                    s = sArr[c];
                    i5 = s * s;
                    if (C2485.f7950 != 0) {
                        iM3169 = (C0773.m3169("ۡ֨") ^ i11) * (-57);
                        i = ((iM3169 ^ i12) * (-1507)) ^ (-931271041);
                        i2 = -56359548;
                    } else {
                        iM3169 = (C0619.m2761("֡۬") + i12) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((iM3169 ^ i11) * (-21393)) ^ 1014864498;
                        i2 = 1132568377;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    locale = locale;
                    break;
                case -1114244842:
                case 836610537:
                    locale = locale;
                    if (C3077.m10041()) {
                        iM3169 = C0619.m2761("ۖۢ") ^ i11;
                        i = ((iM3169 ^ i12) * 22211) ^ 352776007;
                        i2 = 526651460;
                    } else {
                        iM3169 = C0773.m3169("᩹ܺ") ^ i12;
                        i = ((iM3169 ^ i11) * (-24615)) ^ (-1573072723);
                        i2 = -1359302643;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    locale = locale;
                    break;
                case -1028675460:
                case -1017894390:
                    return locale;
                case -908936311:
                case -464830795:
                    if (C3734.f12817 < 0) {
                        locale = locale;
                        iM3169 = C0619.m2761("ۖۢ") ^ i11;
                        i = ((iM3169 ^ i12) * 22211) ^ 352776007;
                        i2 = 526651460;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                        locale = locale;
                    }
                    locale = locale;
                    iM3169 = C0773.m3169("᩹ᩳ") ^ i11;
                    i = ((iM3169 ^ i12) * 24769) ^ (-1099851148);
                    i2 = 1953084958;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    locale = locale;
                    break;
                case -840012191:
                case 1518373314:
                    locale = locale;
                    i9 = 6;
                    if (C2702.m8876()) {
                        iM3169 = (C0619.m2761("᩸ۜ") + i11) * 23;
                        i = ((iM3169 ^ i12) * (-28747)) ^ (-1569989143);
                        i2 = 1723154422;
                    } else {
                        iM3169 = C0619.m2761("ۛۙ") ^ i12;
                        i = ((iM3169 ^ i11) * (-19981)) ^ 1315494773;
                        i2 = 1618015201;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    locale = locale;
                    break;
                case -203243283:
                case 1152914831:
                    locale = locale;
                    sArr2 = f16722;
                    i8 = 93;
                    if (C17202.f56030) {
                        iM3169 = C0619.m2761("ۛ᩻") ^ i11;
                        i = ((iM3169 ^ i12) * 22101) ^ (-1487469983);
                        i2 = 333555438;
                    } else {
                        iM3169 = (C0773.m3169("ۡ֨") ^ i11) * (-57);
                        i = ((iM3169 ^ i12) * (-1507)) ^ (-931271041);
                        i2 = -56359548;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    locale = locale;
                    break;
                case -22567418:
                case 642871281:
                    localeManager = (LocaleManager) C23916.m53416(context, AbstractC0641.m2820(sArr2, i8, i9, i7));
                    if (localeManager != null) {
                        iM3169 = (C0619.m2761("ܳܽ") + i12) * (-71);
                        locale = locale;
                        i = ((iM3169 ^ i11) * 21425) ^ (-1519292616);
                        i2 = 234285872;
                    } else {
                        iM3169 = C0773.m3169("ۚ᩸") ^ i12;
                        locale = locale;
                        i = ((iM3169 ^ i11) * (-27207)) ^ (-849002865);
                        i2 = 672031893;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    locale = locale;
                    break;
                case 317577693:
                case 829109782:
                    return m14707(Resources.getSystem());
                case 974705785:
                case 1438977353:
                    C3998.m12920();
                    if (C1564.m5509() <= 0) {
                        locale = locale;
                        iM3169 = C0619.m2761("ۛۙ") ^ i12;
                        i = ((iM3169 ^ i11) * (-19981)) ^ 1315494773;
                        i2 = 1618015201;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                        locale = locale;
                    }
                    locale = locale;
                    iM3169 = C0773.m3169("᩹ᩳ") ^ i11;
                    i = ((iM3169 ^ i12) * 24769) ^ (-1099851148);
                    i2 = 1953084958;
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    locale = locale;
                    break;
                case 1024145704:
                case 1155135484:
                    C0950.m3785();
                    C0619.m2763();
                    return null;
                case 1043668497:
                case 1678403416:
                    locale = locale;
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0773.m3169("ۡ֨") ^ i11) * (-57);
                        i = ((iM3169 ^ i12) * (-1507)) ^ (-931271041);
                        i2 = -56359548;
                    } else {
                        iM3169 = (i11 - C0773.m3169("ۨۙ")) * (-25);
                        i = ((iM3169 ^ i12) * (-12547)) ^ 1166753280;
                        i2 = 1746679339;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    locale = locale;
                    break;
                case 1519614761:
                case 1691841584:
                    C4238.m13540();
                    if (C1564.f5401 > 0) {
                        iM2761 = (i12 - C0773.m3169("۬᩹")) * 53;
                        i3 = ((iM2761 ^ i11) * 22365) ^ 1907776305;
                        i4 = -116597292;
                        int i16 = i3;
                        i14 = iM2761 ^ i4;
                        i13 = i16;
                    } else {
                        locale = locale;
                        iM3169 = C0773.m3169("᩹ᩳ") ^ i11;
                        i = ((iM3169 ^ i12) * 24769) ^ (-1099851148);
                        i2 = 1953084958;
                        i14 = iM3169 ^ i2;
                        i13 = i;
                        locale = locale;
                    }
                    break;
                default:
                    locale = locale;
                    if (Build.VERSION.SDK_INT >= 33) {
                        iM3169 = C0619.m2761("᩵֨") ^ i12;
                        i = ((iM3169 ^ i11) * (-14301)) ^ (-634814151);
                        i2 = -922572120;
                    } else {
                        locale = locale;
                        iM3169 = C0773.m3169("ۚ᩸") ^ i12;
                        locale = locale;
                        i = ((iM3169 ^ i11) * (-27207)) ^ (-849002865);
                        i2 = 672031893;
                    }
                    i14 = iM3169 ^ i2;
                    i13 = i;
                    locale = locale;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14710(ContextWrapper contextWrapper, Locale locale) {
        Resources resources = null;
        Resources resources2 = null;
        Resources resourcesM49055 = null;
        String language = null;
        int i = 1222788428;
        int i2 = C1542.f5343;
        int i3 = C2419.f7754;
        int iM2761 = C0619.m2761("᩺ۖ") ^ i3;
        int i4 = ((iM2761 ^ i2) * 5975) ^ 1183563205;
        int i5 = -1298978979;
        while (true) {
            i = ((((i ^ i2) * 2901) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2118233541:
                case -1759126244:
                    if (C1146.m4231()) {
                        iM2761 = C0619.m2761("ۚۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 13155) ^ (-827970809);
                        i5 = -224967985;
                    } else {
                        iM2761 = C0773.m3169("ۨᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 22347) ^ (-49736019);
                        i5 = -1484135886;
                    }
                    break;
                case -1926978636:
                case 2061523067:
                    if (C2023.f6737) {
                        iM2761 = C0773.m3169("ܽۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20949) ^ 684646593;
                        i5 = -1792616871;
                    } else {
                        iM2761 = C0773.m3169("ۜۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-5691)) ^ 1453664186;
                        i5 = 1611452090;
                    }
                    break;
                case -1889916713:
                case 805229364:
                    C0269.m1775();
                    iM2761 = (i2 - C0773.m3169("᩸ۢ")) * 39;
                    i4 = ((iM2761 ^ i3) * (-14415)) ^ (-735178244);
                    i5 = 143856894;
                    break;
                case -1388565844:
                case 615358507:
                    if (C0487.m2356() >= 0) {
                        iM2761 = (i2 - C0773.m3169("᩸ۢ")) * 39;
                        i4 = ((iM2761 ^ i3) * (-14415)) ^ (-735178244);
                        i5 = 143856894;
                    } else {
                        iM2761 = C0773.m3169("֫᩹") ^ i2;
                        i4 = ((iM2761 ^ i3) * 23863) ^ (-1549458073);
                        i5 = 1610462552;
                    }
                    break;
                case -1240858297:
                case -566914620:
                    if (resourcesM49055 != resources2) {
                        iM2761 = C0619.m2761("ܰۖ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-31745)) ^ 1434803282;
                        i5 = -1845855129;
                    } else {
                        iM2761 = C0773.m3169("ۜۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-10507)) ^ 2123322653;
                        i5 = 302589618;
                    }
                    break;
                case -908775881:
                case 22518850:
                    C1080.m4050();
                    if (C1564.f5401 > 0) {
                        iM2761 = C0773.m3169("ܽۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20949) ^ 684646593;
                        i5 = -1792616871;
                    } else {
                        iM2761 = (i2 - C0773.m3169("᩸ۢ")) * 39;
                        i4 = ((iM2761 ^ i3) * (-14415)) ^ (-735178244);
                        i5 = 143856894;
                    }
                    break;
                case -848170007:
                case 1671259221:
                    if (C1564.m5509() <= 0) {
                        iM2761 = C0773.m3169("᩺ܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16269) ^ 1519138086;
                        i5 = 1211459479;
                    } else {
                        iM2761 = C0773.m3169("ܽۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20949) ^ 684646593;
                        i5 = -1792616871;
                    }
                    break;
                case -790058424:
                case 636824944:
                    C2375.m8065();
                    AbstractC0116.m1243();
                    break;
                case -763065252:
                case 491909271:
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0773.m3169("ۨᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 22347) ^ (-49736019);
                        i5 = -1484135886;
                    } else {
                        iM2761 = (i2 - C0773.m3169("᩸ۢ")) * 39;
                        i4 = ((iM2761 ^ i3) * (-14415)) ^ (-735178244);
                        i5 = 143856894;
                    }
                    break;
                case -531447730:
                case 1501340746:
                    resourcesM49055 = C21576.m49055();
                    iM2761 = C0773.m3169("ۛᩳ") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-5665)) ^ 1262911585;
                    i5 = -1756053744;
                    break;
                case -488039482:
                case 917154813:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0773.m3169("ܽۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20949) ^ 684646593;
                        i5 = -1792616871;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ܺۘ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2761 ^ i3) * 2005) ^ 1232092815;
                        i5 = 684410062;
                    }
                    break;
                case -354565006:
                case 2031033715:
                    C5448.m16283(language);
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = C0619.m2761("ᩴ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * 6229) ^ (-1248671159);
                        i5 = -2079097534;
                    } else {
                        iM2761 = (C0619.m2761("ܳܿ") ^ i2) * 63;
                        i4 = ((iM2761 ^ i3) * 1051) ^ 251002515;
                        i5 = -265577709;
                    }
                    break;
                case -147525902:
                case 695063834:
                    resources = contextWrapper.getResources();
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0619.m2761("ᩴ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * 6229) ^ (-1248671159);
                        i5 = -2079097534;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۛۚ")) * 7;
                        i4 = ((iM2761 ^ i2) * (-12717)) ^ 463385170;
                        i5 = -1266064171;
                    }
                    break;
                case -98721992:
                case 988273995:
                    if (C1519.m5403()) {
                        iM2761 = C0619.m2761("ᩳ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-10871)) ^ 388124033;
                        i5 = -1092726597;
                    } else {
                        iM2761 = C0773.m3169("᩺ܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16269) ^ 1519138086;
                        i5 = 1211459479;
                    }
                    break;
                case -20712749:
                case 1094839182:
                    C5448.m16287(locale.getCountry());
                    break;
                case 379371354:
                case 1995421701:
                    if (C20932.m47848() != 0) {
                        iM2761 = C0619.m2761("ᩴ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * 6229) ^ (-1248671159);
                        i5 = -2079097534;
                    } else {
                        iM2761 = C0619.m2761("ܿۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-7981)) ^ 92544265;
                        i5 = -392887826;
                    }
                    break;
                case 428693579:
                case 1685133337:
                    try {
                        m14711(resourcesM49055, locale);
                        break;
                    } catch (Throwable unused) {
                    }
                    iM2761 = C0773.m3169("ۜۢ") ^ i2;
                    i4 = ((iM2761 ^ i3) * (-10507)) ^ 2123322653;
                    i5 = 302589618;
                    break;
                case 744701887:
                case 1625433880:
                    if (C4238.m13540() <= 0) {
                        iM2761 = C0773.m3169("ۨᩴ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 22347) ^ (-49736019);
                        i5 = -1484135886;
                    } else {
                        iM2761 = C0773.m3169("ܰܽ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-29091)) ^ (-457995208);
                        i5 = -924879846;
                    }
                    break;
                case 787671205:
                case 1533558040:
                    C2592.m8669(locale);
                    language = locale.getLanguage();
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0773.m3169("ܽۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20949) ^ 684646593;
                        i5 = -1792616871;
                    } else {
                        iM2761 = (C0619.m2761("ۘۨ") ^ i3) * (-115);
                        i4 = ((iM2761 ^ i2) * 20389) ^ (-808560457);
                        i5 = -881847903;
                    }
                    break;
                default:
                    m14711(resources, locale);
                    resources2 = contextWrapper.getResources();
                    iM2761 = C0619.m2761("ܿ᩸") ^ i3;
                    i4 = ((iM2761 ^ i2) * 959) ^ (-331663995);
                    i5 = 1747319517;
                    break;
            }
            return;
        }
    }
}
