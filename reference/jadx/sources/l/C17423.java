package l;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܽ۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D63W */
/* JADX INFO: loaded from: classes4.dex */
public final class C17423 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int f56645;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f56646;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int f56647;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int f56648;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int f56649;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static int f56650;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean f56651;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final HashMap f56652;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean f56653;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean f56654;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int f56655;

    /* JADX INFO: renamed from: ᩸ۚ᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f56656 = {8191, -14076, -5723, 6620, 5014, 4281, 4261, 4280, 4286, 4245, 4261, 4260, 4262, 4275, 4245, 4259, 4260, 4245, 4282, 4267, 4286, 4258, 4245, 4262, 4259, 4281, 4286, 8253, -7626, 8074, 2626, 2146, -12223, -12210, -12213, -12222, -12168, -12213, -12210, -12204, -12205, -12168, -12204, -12210, -12195, -12222, -12266, -12223, -12210, -12213, -12222, -12168, -12215, -12218, -12214, -12222, -12168, -12214, -12218, -12193, -12168, -12213, -12210, -12215, -12222, -12267, -12221, -12218, -12205, -12222, -12168, -12205, -12210, -12214, -12222, -12168, -12223, -12216, -12203, -12214, -12218, -12205, -12265, -12223, -12210, -12213, -12222, -12168, -12220, -12214, -12201, -12168, -12204, -12216, -12203, -12205, -12168, -12213, -12222, -12223, -12205, -12223, -12210, -12213, -12222, -12168, -12220, -12214, -12201, -12168, -12203, -12222, -12207, -12222, -12203, -12204, -12222, -12168, -12213, -12222, -12223, -12205, -12223, -12210, -12213, -12222, -12168, -12220, -12214, -12201, -12168, -12204, -12216, -12203, -12205, -12168, -12203, -12210, -12224, -12209, -12205, -12223, -12210, -12213, -12222, -12168, -12220, -12214, -12201, -12168, -12203, -12222, -12207, -12222, -12203, -12204, -12222, -12168, -12203, -12210, -12224, -12209, -12205, -12221, -12210, -12204, -12218, -12219, -12213, -12222, -12168, -12201, -12222, -12203, -12214, -12210, -12204, -12204, -12210, -12216, -12215, -12168, -12210, -12215, -12168, -12213, -12210, -12204, -12205, -12204, -12209, -12216, -12208, -12168, -12219, -12216, -12216, -12212, -12214, -12218, -12203, -12212, -12204, -12168, -12210, -12215, -12168, -12204, -12210, -12221, -12222, -12219, -12218, -12203, -12224, -12222, -12215, -12222, -12203, -12218, -12205, -12222, -12168, -12219, -12218, -12220, -12212, -12206, -12201, -12168, -12223, -12210, -12213, -12222, -12204, -12216, -12203, -12205, -12168, -12216, -12215, -12213, -12194, -12168, -12210, -12215, -12168, -12201, -12218, -12205, -12209, -12168, -12213, -12210, -12204, -12205, -12203, -12219, -12204, -12223, -12213, -12205, -12201, -12165, -12165};

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean f56657;

    static {
        HashMap map = null;
        int i = -1083175662;
        int i2 = C3734.f12817;
        int i3 = C3779.f12953;
        int iM2761 = (C0619.m2761("ܿܽ") + i3) * 123;
        int i4 = ((iM2761 ^ i2) * 21055) ^ 2051068651;
        int i5 = 1349202785;
        while (true) {
            i = ((((i ^ i2) * (-5043)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2081600339:
                case 43834838:
                    if (C2375.f7641 <= 0) {
                        iM2761 = (C0773.m3169("ۧܳ") + i2) * (-123);
                        i4 = ((iM2761 ^ i3) * 16563) ^ (-712583988);
                        i5 = -1705374647;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ۘ᩶")) * 95;
                        i4 = ((iM2761 ^ i3) * (-27829)) ^ 640303175;
                        i5 = 1366334825;
                    }
                    break;
                case -2036718655:
                case -86481744:
                    C1321.m4852();
                    throw new RuntimeException();
                case -1975190113:
                case 1660778157:
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0619.m2761("᩻ۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-26255)) ^ (-1098614721);
                        i5 = 224010853;
                    } else {
                        iM2761 = (C0773.m3169("ۙۡ") ^ i2) * 13;
                        i4 = ((iM2761 ^ i3) * 19887) ^ 2072934140;
                        i5 = 1733579223;
                    }
                    break;
                case -1882466221:
                case -159037046:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (C0773.m3169("ᩳ֡") ^ i3) * 43;
                        i4 = ((iM2761 ^ i2) * 475) ^ (-722579337);
                        i5 = -374379599;
                    } else {
                        iM2761 = C0773.m3169("ۗۡ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 8925) ^ (-8490892);
                        i5 = 2037704492;
                    }
                    break;
                case -1659470477:
                case 616644755:
                    C2485.m8357();
                    iM2761 = (C0773.m3169("ۧܳ") + i2) * (-123);
                    i4 = ((iM2761 ^ i3) * 16563) ^ (-712583988);
                    i5 = -1705374647;
                    break;
                case -1520109544:
                case 890129630:
                    C2310.m7813();
                    if (!C3998.m12920()) {
                        iM2761 = (C0773.m3169("ۧܳ") + i2) * (-123);
                        i4 = ((iM2761 ^ i3) * 16563) ^ (-712583988);
                        i5 = -1705374647;
                    } else {
                        iM2761 = C0619.m2761("᩻ۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-26255)) ^ (-1098614721);
                        i5 = 224010853;
                    }
                    break;
                case -1396082691:
                case -442074099:
                    map = new HashMap();
                    if (C4238.f15451 >= 0) {
                        iM2761 = (C0773.m3169("۬֡") ^ i2) * (-93);
                        i4 = ((iM2761 ^ i3) * (-6397)) ^ (-527446863);
                        i5 = -1036516400;
                    } else {
                        iM2761 = C0773.m3169("ᩴۘ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 10415) ^ 937809246;
                        i5 = -1435095169;
                    }
                    break;
                case -1109917734:
                case 26523500:
                    if (AbstractC3624.f12429 <= 0) {
                        iM2761 = (C0773.m3169("۬֡") ^ i2) * (-93);
                        i4 = ((iM2761 ^ i3) * (-6397)) ^ (-527446863);
                        i5 = -1036516400;
                    } else {
                        iM2761 = (C0619.m2761("֡ܰ") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM2761 ^ i3) * 17347) ^ 631279193;
                        i5 = 806576191;
                    }
                    break;
                case -924272326:
                case -328928385:
                    if (C1080.m4050()) {
                        iM2761 = (C0773.m3169("᩺ۘ") ^ i3) * (-7);
                        i4 = ((iM2761 ^ i2) * 2071) ^ (-488977953);
                        i5 = 932510170;
                    } else {
                        iM2761 = (C0773.m3169("ᩳ֡") ^ i3) * 43;
                        i4 = ((iM2761 ^ i2) * 475) ^ (-722579337);
                        i5 = -374379599;
                    }
                    break;
                case -769909590:
                case 1296797336:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = (C0773.m3169("۬֡") ^ i2) * (-93);
                        i4 = ((iM2761 ^ i3) * (-6397)) ^ (-527446863);
                        i5 = -1036516400;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ᩳܿ")) * 57;
                        i4 = ((iM2761 ^ i2) * 11) ^ (-700455789);
                        i5 = 550422167;
                    }
                    break;
                case -753879620:
                case 272101105:
                    f56646 = true;
                    return;
                case -346770254:
                case 743711402:
                    if (C4238.f15451 >= 0) {
                        iM2761 = (C0773.m3169("ۧܳ") + i2) * (-123);
                        i4 = ((iM2761 ^ i3) * 16563) ^ (-712583988);
                        i5 = -1705374647;
                    } else {
                        iM2761 = C0619.m2761("۬ܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 24773) ^ 769942110;
                        i5 = -1901508442;
                    }
                    break;
                case 115752594:
                case 465132501:
                    f56652 = map;
                    if (C2878.m9491() <= 0) {
                        iM2761 = (C0773.m3169("۬֡") ^ i2) * (-93);
                        i4 = ((iM2761 ^ i3) * (-6397)) ^ (-527446863);
                        i5 = -1036516400;
                    } else {
                        iM2761 = C0619.m2761("۟᩶") ^ i3;
                        i4 = ((iM2761 ^ i2) * 16243) ^ (-2076965851);
                        i5 = -91749379;
                    }
                    break;
                case 454115572:
                case 2098790515:
                    C3448.m11248();
                    if (!RunnableC3646.f12471) {
                        iM2761 = C0619.m2761("᩻ۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-26255)) ^ (-1098614721);
                        i5 = 224010853;
                    } else {
                        iM2761 = (C0773.m3169("ᩳ֡") ^ i3) * 43;
                        i4 = ((iM2761 ^ i2) * 475) ^ (-722579337);
                        i5 = -374379599;
                    }
                    break;
                case 806367124:
                case 1163195671:
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0619.m2761("᩻ۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-26255)) ^ (-1098614721);
                        i5 = 224010853;
                    } else {
                        iM2761 = (C0619.m2761("۟ᩴ") + i3) * (-91);
                        i4 = ((iM2761 ^ i2) * 27363) ^ (-697906472);
                        i5 = -459327587;
                    }
                    break;
                default:
                    if (C4238.f15451 < 0) {
                        iM2761 = C0619.m2761("᩻ۛ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-26255)) ^ (-1098614721);
                        i5 = 224010853;
                    } else {
                        iM2761 = (i2 - C0773.m3169("֫֫")) * 37;
                        i4 = ((iM2761 ^ i3) * (-21147)) ^ (-1959563407);
                        i5 = 775377349;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:66:0x0265 A[PHI: r9 r10
      0x0265: PHI (r9v6 java.lang.String) = (r9v5 java.lang.String), (r9v2 java.lang.String), (r9v2 java.lang.String) binds: [B:64:0x024c, B:54:0x01c7, B:43:0x013a] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r10v5 java.util.HashMap) = (r10v4 java.util.HashMap), (r10v2 java.util.HashMap), (r10v2 java.util.HashMap) binds: [B:64:0x024c, B:54:0x01c7, B:43:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x03e4 A[PHI: r4 r8 r20 r22
      0x03e4: PHI (r4v4 boolean) = (r4v3 boolean), (r4v2 boolean), (r4v2 boolean), (r4v2 boolean) binds: [B:93:0x03e2, B:89:0x03bd, B:81:0x0355, B:69:0x0296] A[DONT_GENERATE, DONT_INLINE]
      0x03e4: PHI (r8v3 l.ۢ֫ܺ) = (r8v2 l.ۢ֫ܺ), (r8v2 l.ۢ֫ܺ), (r8v2 l.ۢ֫ܺ), (r8v5 l.ۢ֫ܺ) binds: [B:93:0x03e2, B:89:0x03bd, B:81:0x0355, B:69:0x0296] A[DONT_GENERATE, DONT_INLINE]
      0x03e4: PHI (r20v49 java.lang.String) = (r20v43 java.lang.String), (r20v44 java.lang.String), (r20v46 java.lang.String), (r20v50 java.lang.String) binds: [B:93:0x03e2, B:89:0x03bd, B:81:0x0355, B:69:0x0296] A[DONT_GENERATE, DONT_INLINE]
      0x03e4: PHI (r22v22 java.util.HashMap) = (r22v16 java.util.HashMap), (r22v17 java.util.HashMap), (r22v19 java.util.HashMap), (r22v23 java.util.HashMap) binds: [B:93:0x03e2, B:89:0x03bd, B:81:0x0355, B:69:0x0296] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m40914() {
        int iM3169;
        int i;
        int i2;
        int length;
        int iM31610;
        int i3;
        int i4;
        int iM31611;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = C3033.f9831;
        int i9 = C2287.f7432;
        int iM31612 = C0773.m3169("ۨۡ") ^ i8;
        int i10 = ((iM31612 ^ i9) * (-16241)) ^ (-232923162);
        String strM2049 = null;
        String[] strArrM5508 = null;
        int i11 = iM31612 ^ 789979196;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 681116561;
        short s = 0;
        InterfaceC9801 interfaceC9801 = null;
        HashMap map = null;
        boolean z = false;
        String strM8877 = null;
        InterfaceC9801 interfaceC9802 = null;
        SharedPreferences sharedPreferences = null;
        SharedPreferences sharedPreferences2 = null;
        InterfaceC9801 interfaceC9803 = null;
        boolean z2 = false;
        while (true) {
            i15 = i11 ^ (i10 & (((i15 ^ i9) * (-9857)) >> 31));
            switch (i15) {
                case -1681713998:
                case 413201396:
                    strM8877 = strM8877;
                    map = map;
                    f56651 = C4238.m13535(interfaceC9803, C2702.m8881(f56656, 141, 22, i7), z2);
                    if (C1564.f5401 <= 0) {
                        iM31611 = (i8 - C0773.m3169("ۚ۫")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM31611 ^ i9) * 32079) ^ 1984571054;
                        i6 = 2258139;
                    } else {
                        iM31611 = C0773.m3169("ᩴ֡") ^ i9;
                        i5 = ((iM31611 ^ i8) * (-23157)) ^ 946184352;
                        i6 = 1892302662;
                    }
                    int i16 = iM31611 ^ i6;
                    map = map;
                    String str = strM8877;
                    i11 = i16;
                    i10 = i5;
                    strM8877 = str;
                    break;
                case -1678806712:
                case 1956999508:
                    interfaceC9801 = interfaceC9801;
                    strM8877 = strM8877;
                    map = map;
                    int i17 = (s * s) + 31911201;
                    if (i14 - (i17 + i17) > 0) {
                        iM31610 = (C0619.m2761("ۚۧ") + i9) * (-117);
                        i3 = ((iM31610 ^ i8) * 5409) ^ 214012197;
                        i4 = -2085735111;
                    } else {
                        iM31610 = (C0773.m3169("۬ܺ") ^ i8) * (-55);
                        i3 = ((iM31610 ^ i9) * 6559) ^ (-876600850);
                        i4 = 1506699887;
                    }
                    int i18 = iM31610 ^ i4;
                    strM8877 = strM8877;
                    map = map;
                    i11 = i18;
                    i10 = i3;
                    interfaceC9801 = interfaceC9801;
                    break;
                case -1659481834:
                case 308453416:
                    strM8877 = strM8877;
                    map = map;
                    f56649 = ApplicationC17729.f58258.mo7901((byte) 5, C2354.m7980(f56656, 256, 3, i7));
                    if (C2966.f9654 >= 0) {
                        iM31611 = (C0773.m3169("ܺܽ") ^ i9) * 47;
                        i5 = ((iM31611 ^ i8) * (-5003)) ^ (-1753847241);
                        i6 = -1793440531;
                    } else {
                        iM31611 = (C0619.m2761("ᩴ᩵") ^ i8) * 23;
                        i5 = ((iM31611 ^ i9) * 5899) ^ (-1034287803);
                        i6 = -299197037;
                    }
                    int i19 = iM31611 ^ i6;
                    map = map;
                    String str2 = strM8877;
                    i11 = i19;
                    i10 = i5;
                    strM8877 = str2;
                    break;
                case -1571454504:
                case -253847326:
                    strM8877 = strM8877;
                    map = map;
                    f56654 = ApplicationC17729.f58262.getBoolean(C2375.m8069(f56656, 163, 26, i7), z2);
                    sharedPreferences2 = ApplicationC17729.f58262;
                    if (C1826.m6301() >= 0) {
                        iM31611 = C0619.m2761("ᩴۘ") ^ i8;
                        i5 = ((iM31611 ^ i9) * (-13741)) ^ 2034728994;
                        i6 = -1824380631;
                    } else {
                        iM31611 = (C0773.m3169("᩺ܳ") + i8) * (-75);
                        i5 = ((iM31611 ^ i9) * 30063) ^ (-1793620340);
                        i6 = 1546065488;
                    }
                    int i110 = iM31611 ^ i6;
                    map = map;
                    String str3 = strM8877;
                    i11 = i110;
                    i10 = i5;
                    strM8877 = str3;
                    break;
                case -1533854369:
                case -1254507712:
                    interfaceC9801 = interfaceC9801;
                    strM8877 = strM8877;
                    map = map;
                    try {
                        f56647 = C1321.m4845(C4238.m13533(ApplicationC17729.f58262, C0487.m2361(f56656, 32, 14, i7), C0269.m1785(f56656, 46, 1, i7)));
                        iM31610 = (C0619.m2761("۫۫") ^ i8) * (-65);
                        i3 = ((iM31610 ^ i9) * 9607) ^ 2095477075;
                        i4 = 814754967;
                    } catch (NumberFormatException unused) {
                        iM31610 = (i9 - C0773.m3169("۟ۤ")) * 19;
                        i3 = ((iM31610 ^ i8) * (-8889)) ^ 430628293;
                        i4 = 1762561271;
                    }
                    int i111 = iM31610 ^ i4;
                    strM8877 = strM8877;
                    map = map;
                    i11 = i111;
                    i10 = i3;
                    interfaceC9801 = interfaceC9801;
                    break;
                case -1474309353:
                case 1664635726:
                    f56650 = ApplicationC17729.f58262.getInt(RunnableC3646.m11809(f56656, 259, 4, i7), z2 ? 1 : 0);
                    break;
                case -1466703409:
                case -1060446353:
                    interfaceC9801 = interfaceC9801;
                    strM8877 = strM8877;
                    map = map;
                    short s2 = f56656[31];
                    int i20 = s2 + 5649;
                    i14 = i20 * i20;
                    if (C4238.m13540() <= 0) {
                        s = s2;
                        iM31610 = (i8 - C0773.m3169("᩸ۚ")) * 51;
                        i3 = ((iM31610 ^ i9) * (-30849)) ^ (-624990118);
                        i4 = -1412394821;
                        int i112 = iM31610 ^ i4;
                        strM8877 = strM8877;
                        map = map;
                        i11 = i112;
                        i10 = i3;
                    } else {
                        int iM2761 = (C0619.m2761("ۨۙ") + i9) * (-55);
                        s = s2;
                        i10 = ((iM2761 ^ i8) * 10011) ^ 1260094652;
                        strM8877 = strM8877;
                        map = map;
                        i11 = iM2761 ^ (-514661118);
                    }
                    interfaceC9801 = interfaceC9801;
                    break;
                case -1401360448:
                case 882878498:
                    strM8877 = strM8877;
                    map = map;
                    interfaceC9801 = ApplicationC17729.f58258;
                    strM2049 = RunnableC0334.m2049(f56656, 83, 18, i7);
                    if (RunnableC3646.m11813() != 0) {
                        iM31611 = C0773.m3169("ܺܰ") ^ i8;
                        i5 = ((iM31611 ^ i9) * 13925) ^ 2091816624;
                        i6 = 1409014444;
                    } else {
                        iM31611 = (C0773.m3169("۠ᩳ") + i9) * 45;
                        i5 = ((iM31611 ^ i8) * 16955) ^ (-2037353903);
                        i6 = 1366748365;
                    }
                    int i113 = iM31611 ^ i6;
                    map = map;
                    String str4 = strM8877;
                    i11 = i113;
                    i10 = i5;
                    strM8877 = str4;
                    break;
                case -1387879922:
                case 939416037:
                    i12 = 0;
                    iM3169 = C0619.m2761("ۗۛ") ^ i9;
                    i = ((iM3169 ^ i8) * 26435) ^ 808540711;
                    i2 = -523520879;
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case -1350017970:
                case 1045318067:
                    strM8877 = strM8877;
                    map = map;
                    try {
                        interfaceC9801 = interfaceC9801;
                        try {
                            C22482.m50715(C1321.m4845(C4238.m13533(ApplicationC17729.f58262, C13473.m33137(f56656, 66, 16, i7), C0773.m3166(f56656, 82, 1, i7))));
                            break;
                        } catch (NumberFormatException unused2) {
                        }
                    } catch (NumberFormatException unused3) {
                        interfaceC9801 = interfaceC9801;
                    }
                    iM31610 = C0619.m2761("ܽۢ") ^ i8;
                    i3 = ((iM31610 ^ i9) * 14483) ^ 893437424;
                    i4 = 1134832431;
                    int i114 = iM31610 ^ i4;
                    strM8877 = strM8877;
                    map = map;
                    i11 = i114;
                    i10 = i3;
                    interfaceC9801 = interfaceC9801;
                    break;
                case -1334710967:
                case -1149843163:
                    try {
                        RunnableC0334.m2056(map, strArrM5508[i12], Integer.valueOf(strArrM5508[i12 + 1]));
                        break;
                    } catch (NumberFormatException unused4) {
                    }
                    iM3169 = (C0619.m2761("۬۠") + i9) * 15;
                    i = ((iM3169 ^ i8) * (-8411)) ^ (-7910600);
                    i2 = 1380853001;
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case -1327462718:
                case -881944045:
                    if (C1783.f6087 <= 0) {
                        strM8877 = strM8877;
                        map = map;
                        iM31611 = C0619.m2761("ᩴۘ") ^ i8;
                        i5 = ((iM31611 ^ i9) * (-13741)) ^ 2034728994;
                        i6 = -1824380631;
                        int i115 = iM31611 ^ i6;
                        map = map;
                        String str5 = strM8877;
                        i11 = i115;
                        i10 = i5;
                        strM8877 = str5;
                    } else {
                        iM3169 = (C0773.m3169("ܿۜ") + i9) * (-119);
                        i = ((iM3169 ^ i8) * (-7379)) ^ (-1105108437);
                        i2 = -1859082676;
                        i11 = iM3169 ^ i2;
                        i10 = i;
                    }
                    break;
                case -1152197111:
                case 344186939:
                    length = strArrM5508.length;
                    i13 = length;
                    iM3169 = C0773.m3169("ܺ۫") ^ i8;
                    i = ((iM3169 ^ i9) * (-31665)) ^ 1698532773;
                    i2 = -668820290;
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case -1138287056:
                case -1059085751:
                    C1783.m6232();
                    if (C4282.f15546 > 0) {
                        iM3169 = (C0773.m3169("ܿۜ") + i9) * (-119);
                        i = ((iM3169 ^ i8) * (-7379)) ^ (-1105108437);
                        i2 = -1859082676;
                    } else {
                        iM3169 = C0619.m2761("ۖۗ") ^ i9;
                        i = ((iM3169 ^ i8) * 18323) ^ (-520710249);
                        i2 = 1266278107;
                    }
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case -1000155233:
                case -752805542:
                    i12 += 2;
                    iM3169 = C0619.m2761("ۗۛ") ^ i9;
                    i = ((iM3169 ^ i8) * 26435) ^ 808540711;
                    i2 = -523520879;
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case -994701083:
                case -309505616:
                    interfaceC9801 = interfaceC9801;
                    strM8877 = strM8877;
                    map = map;
                    f56645 = z ? 1 : 0;
                    iM31610 = C0619.m2761("ۢᩴ") ^ i9;
                    i3 = ((iM31610 ^ i8) * (-6061)) ^ (-1091094690);
                    i4 = -1101449112;
                    int i116 = iM31610 ^ i4;
                    strM8877 = strM8877;
                    map = map;
                    i11 = i116;
                    i10 = i3;
                    interfaceC9801 = interfaceC9801;
                    break;
                case -883857661:
                case 1324826215:
                    strM8877 = strM8877;
                    map = map;
                    f56653 = C0950.m3781(ApplicationC17729.f58258, C1343.m4939(f56656, 101, 21, i7), z2);
                    if (C3492.f12043 <= 0) {
                        iM31611 = (i8 - C0773.m3169("ۚ۫")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM31611 ^ i9) * 32079) ^ 1984571054;
                        i6 = 2258139;
                    } else {
                        iM31611 = C0773.m3169("ۘۢ") ^ i8;
                        i5 = ((iM31611 ^ i9) * (-10273)) ^ (-1634974113);
                        i6 = -971349545;
                    }
                    int i117 = iM31611 ^ i6;
                    map = map;
                    String str6 = strM8877;
                    i11 = i117;
                    i10 = i5;
                    strM8877 = str6;
                    break;
                case -872495255:
                case -40834719:
                    C0269.m1775();
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0773.m3169("ܿۜ") + i9) * (-119);
                        i = ((iM3169 ^ i8) * (-7379)) ^ (-1105108437);
                        i2 = -1859082676;
                    } else {
                        iM3169 = C0773.m3169("ᩳܶ") ^ i8;
                        i = ((iM3169 ^ i9) * (-30745)) ^ 1620193617;
                        i2 = -919271092;
                    }
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case -722886322:
                case -259513617:
                    interfaceC9801 = interfaceC9801;
                    strM8877 = strM8877;
                    map = map;
                    z = true;
                    iM31610 = (i8 - C0773.m3169("ۛ۫")) * (-13);
                    i3 = ((iM31610 ^ i9) * (-19483)) ^ 989594716;
                    i4 = 1692724814;
                    int i118 = iM31610 ^ i4;
                    strM8877 = strM8877;
                    map = map;
                    i11 = i118;
                    i10 = i3;
                    interfaceC9801 = interfaceC9801;
                    break;
                case -718927711:
                case 1195732050:
                    strM8877 = strM8877;
                    map = map;
                    z2 = false;
                    z2 = false;
                    f56648 = interfaceC9801.getInt(strM2049, 0);
                    if (C1146.f4234 >= 0) {
                        iM31611 = (i8 - C0773.m3169("ۚ۫")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM31611 ^ i9) * 32079) ^ 1984571054;
                        i6 = 2258139;
                    } else {
                        iM31611 = C0773.m3169("ۢᩳ") ^ i8;
                        i5 = ((iM31611 ^ i9) * (-20097)) ^ 852156906;
                        i6 = -1590955492;
                    }
                    int i119 = iM31611 ^ i6;
                    map = map;
                    String str7 = strM8877;
                    i11 = i119;
                    i10 = i5;
                    strM8877 = str7;
                    break;
                case -441890566:
                case 947964733:
                    C2288.m7767();
                    if (C1321.f4751 < 0) {
                        strM8877 = strM8877;
                        map = map;
                        iM31611 = C0773.m3169("᩸֨") ^ i9;
                        i5 = ((iM31611 ^ i8) * (-14299)) ^ 1131698284;
                        i6 = -1552725925;
                        int i1110 = iM31611 ^ i6;
                        map = map;
                        String str8 = strM8877;
                        i11 = i1110;
                        i10 = i5;
                        strM8877 = str8;
                    } else {
                        interfaceC9801 = interfaceC9801;
                        strM8877 = strM8877;
                        map = map;
                        iM31610 = (i8 - C0773.m3169("᩸ۚ")) * 51;
                        i3 = ((iM31610 ^ i9) * (-30849)) ^ (-624990118);
                        i4 = -1412394821;
                        int i1111 = iM31610 ^ i4;
                        strM8877 = strM8877;
                        map = map;
                        i11 = i1111;
                        i10 = i3;
                        interfaceC9801 = interfaceC9801;
                    }
                    break;
                case -441848465:
                case 1685781385:
                    strM8877 = strM8877;
                    map = map;
                    f56657 = sharedPreferences2.getBoolean(C0487.m2361(f56656, 189, 25, i7), z2);
                    sharedPreferences = ApplicationC17729.f58262;
                    if (AbstractC0116.f1064 <= 0) {
                        iM31611 = C0773.m3169("᩸֨") ^ i9;
                        i5 = ((iM31611 ^ i8) * (-14299)) ^ 1131698284;
                        i6 = -1552725925;
                    } else {
                        iM31611 = C0773.m3169("۫ܺ") ^ i9;
                        i5 = ((iM31611 ^ i8) * 18415) ^ (-274742373);
                        i6 = -1589268350;
                    }
                    int i1112 = iM31611 ^ i6;
                    map = map;
                    String str9 = strM8877;
                    i11 = i1112;
                    i10 = i5;
                    strM8877 = str9;
                    break;
                case -390142885:
                case 550683956:
                    interfaceC9801 = interfaceC9801;
                    strM8877 = strM8877;
                    map = map;
                    f56647 = z ? 1 : 0;
                    iM31610 = (C0619.m2761("۫۫") ^ i8) * (-65);
                    i3 = ((iM31610 ^ i9) * 9607) ^ 2095477075;
                    i4 = 814754967;
                    int i1113 = iM31610 ^ i4;
                    strM8877 = strM8877;
                    map = map;
                    i11 = i1113;
                    i10 = i3;
                    interfaceC9801 = interfaceC9801;
                    break;
                case -304510894:
                case -157453184:
                    strM8877 = C2702.m8877(interfaceC9802, C4238.m13530(f56656, 234, 22, i7), null);
                    map = f56652;
                    if (strM8877 != null) {
                        iM3169 = (C0619.m2761("֡᩹") + i8) * 95;
                        i = ((iM3169 ^ i9) * (-24659)) ^ (-2027972962);
                        i2 = 1320319250;
                    } else {
                        iM3169 = C0619.m2761("ۘۗ") ^ i9;
                        i = ((iM3169 ^ i8) * 29321) ^ (-392840958);
                        i2 = 486610400;
                    }
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case -190819776:
                case 2090676327:
                    C0487.m2356();
                    if (C3099.f10023 <= 0) {
                        iM3169 = (C0773.m3169("ܿۜ") + i9) * (-119);
                        i = ((iM3169 ^ i8) * (-7379)) ^ (-1105108437);
                        i2 = -1859082676;
                        i11 = iM3169 ^ i2;
                        i10 = i;
                    } else {
                        strM8877 = strM8877;
                        map = map;
                        iM31611 = C0773.m3169("᩸֨") ^ i9;
                        i5 = ((iM31611 ^ i8) * (-14299)) ^ 1131698284;
                        i6 = -1552725925;
                        int i1114 = iM31611 ^ i6;
                        map = map;
                        String str10 = strM8877;
                        i11 = i1114;
                        i10 = i5;
                        strM8877 = str10;
                    }
                    break;
                case -142688629:
                case -36401994:
                    i7 = 47562;
                    iM31610 = (C0773.m3169("ۖܰ") + i8) * 71;
                    i3 = ((iM31610 ^ i9) * 7771) ^ 199345558;
                    i4 = 1992460979;
                    int i1115 = iM31610 ^ i4;
                    strM8877 = strM8877;
                    map = map;
                    i11 = i1115;
                    i10 = i3;
                    interfaceC9801 = interfaceC9801;
                    break;
                case -66714218:
                case 776680171:
                    i7 = 53287;
                    iM31610 = (C0773.m3169("ۖܰ") + i8) * 71;
                    i3 = ((iM31610 ^ i9) * 7771) ^ 199345558;
                    i4 = 1992460979;
                    int i1116 = iM31610 ^ i4;
                    strM8877 = strM8877;
                    map = map;
                    i11 = i1116;
                    i10 = i3;
                    interfaceC9801 = interfaceC9801;
                    break;
                case 139251595:
                case 559084324:
                    strM8877 = strM8877;
                    map = map;
                    f56646 = sharedPreferences.getBoolean(C1343.m4939(f56656, 214, 20, i7), z);
                    interfaceC9802 = ApplicationC17729.f58258;
                    if (RunnableC3055.f9898 >= 0) {
                        iM31611 = (i8 - C0773.m3169("ۚ۫")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((iM31611 ^ i9) * 32079) ^ 1984571054;
                        i6 = 2258139;
                    } else {
                        iM31611 = (C0773.m3169("ܿ᩶") ^ i8) * 9;
                        i5 = ((iM31611 ^ i9) * (-28161)) ^ (-475599994);
                        i6 = -2095442185;
                    }
                    int i1117 = iM31611 ^ i6;
                    map = map;
                    String str11 = strM8877;
                    i11 = i1117;
                    i10 = i5;
                    strM8877 = str11;
                    break;
                case 278116550:
                case 1915504725:
                    strArrM5508 = C1564.m5508(strM8877, C2834.m9343(f56656, 263, 2, i7));
                    if (strArrM5508.length % 2 == 0) {
                        iM3169 = (i8 - C0619.m2761("ۧۖ")) * 37;
                        i = ((iM3169 ^ i9) * (-10239)) ^ (-1899868772);
                        i2 = 300147630;
                    } else {
                        iM3169 = C0773.m3169("ۘۨ") ^ i9;
                        i = ((iM3169 ^ i8) * 2573) ^ 596908210;
                        i2 = 621969939;
                    }
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case 290783355:
                case 544085024:
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (C0773.m3169("۠᩸") ^ i9) * 109;
                        i = ((iM3169 ^ i8) * 29491) ^ 590109341;
                        i2 = 1953215452;
                        i11 = iM3169 ^ i2;
                        i10 = i;
                    } else {
                        strM8877 = strM8877;
                        map = map;
                        iM31611 = C0773.m3169("᩸֨") ^ i9;
                        i5 = ((iM31611 ^ i8) * (-14299)) ^ 1131698284;
                        i6 = -1552725925;
                        int i1118 = iM31611 ^ i6;
                        map = map;
                        String str12 = strM8877;
                        i11 = i1118;
                        i10 = i5;
                        strM8877 = str12;
                    }
                    break;
                case 594013282:
                case 708887601:
                    RunnableC1848.m6360();
                    interfaceC9801 = interfaceC9801;
                    strM8877 = strM8877;
                    map = map;
                    iM31610 = (i8 - C0773.m3169("᩸ۚ")) * 51;
                    i3 = ((iM31610 ^ i9) * (-30849)) ^ (-624990118);
                    i4 = -1412394821;
                    int i1119 = iM31610 ^ i4;
                    strM8877 = strM8877;
                    map = map;
                    i11 = i1119;
                    i10 = i3;
                    interfaceC9801 = interfaceC9801;
                    break;
                case 652874181:
                case 1344732436:
                    C23916.m53419();
                    if (RunnableC3055.f9898 >= 0) {
                        strM8877 = strM8877;
                        map = map;
                        iM31611 = C0773.m3169("ܺܰ") ^ i8;
                        i5 = ((iM31611 ^ i9) * 13925) ^ 2091816624;
                        i6 = 1409014444;
                        int i11110 = iM31611 ^ i6;
                        map = map;
                        String str13 = strM8877;
                        i11 = i11110;
                        i10 = i5;
                        strM8877 = str13;
                    } else {
                        iM3169 = C0619.m2761("ۖۗ") ^ i9;
                        i = ((iM3169 ^ i8) * 18323) ^ (-520710249);
                        i2 = 1266278107;
                        i11 = iM3169 ^ i2;
                        i10 = i;
                    }
                    break;
                case 678650401:
                case 1607515339:
                    interfaceC9801 = interfaceC9801;
                    strM8877 = strM8877;
                    map = map;
                    try {
                        f56645 = C3099.m10089(C0950.m3786(ApplicationC17729.f58262, C0773.m3166(f56656, 47, 18, i7), C2354.m7980(f56656, 65, 1, i7)));
                        iM31610 = C0619.m2761("ۢᩴ") ^ i9;
                        i3 = ((iM31610 ^ i8) * (-6061)) ^ (-1091094690);
                        i4 = -1101449112;
                    } catch (NumberFormatException unused5) {
                        iM31610 = (i9 - C0619.m2761("֫֫")) * 85;
                        i3 = ((iM31610 ^ i8) * 32151) ^ 1962371748;
                        i4 = 1779831213;
                    }
                    int i11111 = iM31610 ^ i4;
                    strM8877 = strM8877;
                    map = map;
                    i11 = i11111;
                    i10 = i3;
                    interfaceC9801 = interfaceC9801;
                    break;
                case 700881271:
                case 2046264095:
                    strM8877 = strM8877;
                    map = map;
                    f56655 = ApplicationC17729.f58258.getInt(C3099.m10092(f56656, 122, 19, i7), z2 ? 1 : 0);
                    interfaceC9803 = ApplicationC17729.f58258;
                    if (C13473.f42873 == 0) {
                        iM31611 = (C0619.m2761("ۙۨ") + i9) * 37;
                        i5 = ((iM31611 ^ i8) * (-24979)) ^ (-708562292);
                        i6 = 407540138;
                        int i11112 = iM31611 ^ i6;
                        map = map;
                        String str14 = strM8877;
                        i11 = i11112;
                        i10 = i5;
                        strM8877 = str14;
                    } else {
                        interfaceC9801 = interfaceC9801;
                        iM31610 = (i8 - C0773.m3169("᩸ۚ")) * 51;
                        i3 = ((iM31610 ^ i9) * (-30849)) ^ (-624990118);
                        i4 = -1412394821;
                        int i11113 = iM31610 ^ i4;
                        strM8877 = strM8877;
                        map = map;
                        i11 = i11113;
                        i10 = i3;
                        interfaceC9801 = interfaceC9801;
                    }
                    break;
                case 994849049:
                case 1279895820:
                    if (C2966.m9671(strM8877) == 0) {
                        iM3169 = C0619.m2761("ۘۗ") ^ i9;
                        i = ((iM3169 ^ i8) * 29321) ^ (-392840958);
                        i2 = 486610400;
                    } else {
                        iM3169 = C0773.m3169("ܶ᩻") ^ i9;
                        i = ((iM3169 ^ i8) * 20527) ^ 1846147049;
                        i2 = -1870340918;
                    }
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case 1210331854:
                case 1625092220:
                    if (i12 < i13) {
                        iM3169 = C0619.m2761("ܽ᩺") ^ i8;
                        i = ((iM3169 ^ i9) * 14593) ^ (-1179553518);
                        i2 = 1420431442;
                    } else {
                        iM3169 = C0619.m2761("ۘۗ") ^ i9;
                        i = ((iM3169 ^ i8) * 29321) ^ (-392840958);
                        i2 = 486610400;
                    }
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
                case 1570504972:
                case 1624430682:
                    C0773.m3161();
                    if (C2287.f7432 >= 0) {
                        strM8877 = strM8877;
                        map = map;
                        iM31611 = (C0773.m3169("ܺܽ") ^ i9) * 47;
                        i5 = ((iM31611 ^ i8) * (-5003)) ^ (-1753847241);
                        i6 = -1793440531;
                        int i11114 = iM31611 ^ i6;
                        map = map;
                        String str15 = strM8877;
                        i11 = i11114;
                        i10 = i5;
                        strM8877 = str15;
                    }
                    strM8877 = strM8877;
                    map = map;
                    iM31611 = C0619.m2761("ᩴۘ") ^ i8;
                    i5 = ((iM31611 ^ i9) * (-13741)) ^ 2034728994;
                    i6 = -1824380631;
                    int i11115 = iM31611 ^ i6;
                    map = map;
                    String str16 = strM8877;
                    i11 = i11115;
                    i10 = i5;
                    strM8877 = str16;
                    break;
                case 1676072675:
                case 1893054870:
                    C2288.m7767();
                    RunnableC3055.m9933();
                    break;
                default:
                    length = strArrM5508.length - 1;
                    i13 = length;
                    iM3169 = C0773.m3169("ܺ۫") ^ i8;
                    i = ((iM3169 ^ i9) * (-31665)) ^ 1698532773;
                    i2 = -668820290;
                    i11 = iM3169 ^ i2;
                    i10 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0197 A[PHI: r3 r11 r14
      0x0197: PHI (r3v5 int) = (r3v2 int), (r3v2 int), (r3v4 int), (r3v2 int) binds: [B:47:0x0195, B:28:0x00e1, B:20:0x0089, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:47:0x0195, B:28:0x00e1, B:20:0x0089, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int) binds: [B:47:0x0195, B:28:0x00e1, B:20:0x0089, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01cd A[PHI: r9 r10
      0x01cd: PHI (r9v4 int) = (r9v3 int), (r9v2 int) binds: [B:51:0x01cb, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x01cd: PHI (r10v4 int) = (r10v3 int), (r10v2 int) binds: [B:51:0x01cb, B:12:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0205 A[PHI: r1 r2 r7 r8 r13
      0x0205: PHI (r1v5 android.content.res.Resources) = 
      (r1v2 android.content.res.Resources)
      (r1v3 android.content.res.Resources)
      (r1v2 android.content.res.Resources)
      (r1v2 android.content.res.Resources)
      (r1v2 android.content.res.Resources)
     binds: [B:55:0x0203, B:36:0x0125, B:32:0x00ff, B:9:0x0057, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r2v5 android.content.res.Resources$Theme) = 
      (r2v2 android.content.res.Resources$Theme)
      (r2v3 android.content.res.Resources$Theme)
      (r2v2 android.content.res.Resources$Theme)
      (r2v2 android.content.res.Resources$Theme)
      (r2v2 android.content.res.Resources$Theme)
     binds: [B:55:0x0203, B:36:0x0125, B:32:0x00ff, B:9:0x0057, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r7v5 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:55:0x0203, B:36:0x0125, B:32:0x00ff, B:9:0x0057, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r8v5 short) = (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:55:0x0203, B:36:0x0125, B:32:0x00ff, B:9:0x0057, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r13v5 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:55:0x0203, B:36:0x0125, B:32:0x00ff, B:9:0x0057, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0250 A[PHI: r6 r19
      0x0250: PHI (r6v4 char) = (r6v2 char), (r6v3 char), (r6v2 char), (r6v2 char), (r6v2 char) binds: [B:63:0x024e, B:59:0x0232, B:14:0x0066, B:12:0x0062, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0250: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:63:0x024e, B:59:0x0232, B:14:0x0066, B:12:0x0062, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Drawable m40908(Context context) {
        int iM3169;
        int i;
        int i2;
        int i3 = C1321.f4751;
        int i4 = C1783.f6087;
        int iM2761 = C0619.m2761("᩺֨") ^ i3;
        int i5 = ((iM2761 ^ i4) * (-16919)) ^ (-776609704);
        Resources.Theme theme = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2761 ^ 1210574958;
        Resources resources = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 444501427;
        String strM6966 = null;
        int iM2762 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * (-8063)) >> 31));
            switch (i12) {
                case -2106048924:
                case -556926577:
                    c = 0;
                    if (RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("ۜۡ") ^ i3;
                        i = ((iM3169 ^ i4) * 9375) ^ (-903967567);
                        i2 = 1987426958;
                    } else {
                        iM3169 = C0619.m2761("᩺ۚ") ^ i4;
                        i = ((iM3169 ^ i3) * (-9815)) ^ 1909536604;
                        i2 = 538132871;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2079758353:
                case -1081367349:
                    if ((i8 + i9) - i7 < 0) {
                        iM3169 = C0619.m2761("ۜۖ") ^ i3;
                        i = ((iM3169 ^ i4) * (-3303)) ^ 1531403735;
                        i2 = -803024086;
                    } else {
                        iM3169 = (C0619.m2761("ۤۜ") ^ i3) * 43;
                        i = ((iM3169 ^ i4) * 11341) ^ 673696236;
                        i2 = -1264859136;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1963794522:
                case 1326664065:
                    i10 = 37845;
                    iM3169 = C0619.m2761("ܽܽ") ^ i4;
                    i = ((iM3169 ^ i3) * 14195) ^ 1971971123;
                    i2 = 1034234894;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1701350600:
                case 1780749265:
                    s = sArr[c];
                    s2 = 17230;
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0773.m3169("֡᩻") ^ i3;
                        i = ((iM3169 ^ i4) * 23831) ^ (-1718616937);
                        i2 = 1997085660;
                    } else {
                        iM3169 = (C0619.m2761("֡ۧ") ^ i3) * (-31);
                        i = ((iM3169 ^ i4) * 32647) ^ 1107165444;
                        i2 = -1435681291;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1519491205:
                case -779023267:
                    C2310.m7813();
                    C0487.m2356();
                    iM3169 = C0619.m2761("ۜۡ") ^ i3;
                    i = ((iM3169 ^ i4) * 9375) ^ (-903967567);
                    i2 = 1987426958;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1426140211:
                case 189964319:
                    sArr2 = f56656;
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0773.m3169("֡᩻") ^ i3;
                        i = ((iM3169 ^ i4) * 23831) ^ (-1718616937);
                        i2 = 1997085660;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ܰ᩶")) * 79;
                        i = ((iM3169 ^ i3) * 17887) ^ 1996453103;
                        i2 = 1265453736;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1364030216:
                case 486177634:
                    i11 = 1;
                    if (C20932.m47848() != 0) {
                        iM3169 = (i3 - C0773.m3169("ܿ֡")) * (-65);
                        i = ((iM3169 ^ i4) * (-621)) ^ 143328572;
                        i2 = -1680005553;
                    } else {
                        iM3169 = C0619.m2761("ܶܿ") ^ i4;
                        i = ((iM3169 ^ i3) * (-30259)) ^ (-560724940);
                        i2 = 391917897;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1141882721:
                case -355573800:
                    if (C1519.f5300 < 0) {
                        iM3169 = C0773.m3169("֡᩻") ^ i3;
                        i = ((iM3169 ^ i4) * 23831) ^ (-1718616937);
                        i2 = 1997085660;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܿ֡")) * (-65);
                        i = ((iM3169 ^ i4) * (-621)) ^ 143328572;
                        i2 = -1680005553;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1002373695:
                case 2045123464:
                    i7 = s * s2;
                    i8 = s * s;
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0773.m3169("᩹ۛ") ^ i4) * 11;
                        i = ((iM3169 ^ i3) * 6077) ^ (-1991589846);
                        i2 = 1452275702;
                    } else {
                        iM3169 = (C0773.m3169("ۛ᩻") ^ i4) * 31;
                        i = ((iM3169 ^ i3) * 9053) ^ 599126393;
                        i2 = 666674031;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -814559839:
                case 1686807566:
                    iM2762 = 2120240185 ^ C0619.m2761(strM6966);
                    if (C2966.f9654 >= 0) {
                        iM3169 = (i3 - C0773.m3169("ܿ֡")) * (-65);
                        i = ((iM3169 ^ i4) * (-621)) ^ 143328572;
                        i2 = -1680005553;
                    } else {
                        iM3169 = (C0619.m2761("ۤۘ") ^ i4) * (-19);
                        i = ((iM3169 ^ i3) * 5689) ^ (-490104240);
                        i2 = -1533207563;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -789725584:
                case 614458681:
                    C2966.m9664();
                    C2310.m7813();
                    return null;
                case -628384593:
                case 1258714022:
                    return C9217.m24392(resources, C23434.m52631(theme, iM2762), theme);
                case -606014299:
                case 541122193:
                    i9 = 74218225;
                    if (C3077.f9998) {
                        iM3169 = C0619.m2761("ܿ᩺") ^ i4;
                        i = ((iM3169 ^ i3) * 4657) ^ 1374529170;
                        i2 = -834800382;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܿ֡")) * (-65);
                        i = ((iM3169 ^ i4) * (-621)) ^ 143328572;
                        i2 = -1680005553;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -289665669:
                case 1190018232:
                    sArr = f56656;
                    if (C3998.f13671 != 0) {
                        iM3169 = C0619.m2761("ۜۡ") ^ i3;
                        i = ((iM3169 ^ i4) * 9375) ^ (-903967567);
                        i2 = 1987426958;
                    } else {
                        iM3169 = C0773.m3169("۬ܽ") ^ i3;
                        i = ((iM3169 ^ i4) * (-9031)) ^ (-1791663465);
                        i2 = 618675406;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -279965642:
                case 1567145590:
                    strM6966 = C2023.m6966(sArr2, i11, 3, i10);
                    if (C1146.f4234 >= 0) {
                        iM3169 = C0619.m2761("ۗۜ") ^ i4;
                        i = ((iM3169 ^ i3) * (-9211)) ^ 824271183;
                        i2 = -1594168117;
                    } else {
                        iM3169 = (i3 - C0619.m2761("֡᩷")) * 43;
                        i = ((iM3169 ^ i4) * (-1431)) ^ (-1036522330);
                        i2 = -1627296679;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 682925768:
                case 928344855:
                    C3734.m12152();
                    if (C0862.m3503()) {
                        iM3169 = C0619.m2761("ۜۡ") ^ i3;
                        i = ((iM3169 ^ i4) * 9375) ^ (-903967567);
                        i2 = 1987426958;
                    } else {
                        iM3169 = (C0773.m3169("᩹ۛ") ^ i4) * 11;
                        i = ((iM3169 ^ i3) * 6077) ^ (-1991589846);
                        i2 = 1452275702;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1421960284:
                case 2006032984:
                    resources = context.getResources();
                    theme = context.getTheme();
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0773.m3169("֡᩻") ^ i3;
                        i = ((iM3169 ^ i4) * 23831) ^ (-1718616937);
                        i2 = 1997085660;
                    } else {
                        iM3169 = C0619.m2761("ۧۚ") ^ i3;
                        i = ((iM3169 ^ i4) * (-14171)) ^ 1920437572;
                        i2 = -1379228745;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1991956267:
                case 1992079587:
                    i10 = 17382;
                    iM3169 = C0619.m2761("ܽܽ") ^ i4;
                    i = ((iM3169 ^ i3) * 14195) ^ 1971971123;
                    i2 = 1034234894;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    C2023.m6964();
                    if (C2354.m7983()) {
                        iM3169 = C0773.m3169("֡᩻") ^ i3;
                        i = ((iM3169 ^ i4) * 23831) ^ (-1718616937);
                        i2 = 1997085660;
                    } else {
                        iM3169 = C0619.m2761("ۜۡ") ^ i3;
                        i = ((iM3169 ^ i4) * 9375) ^ (-903967567);
                        i2 = 1987426958;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0089 A[PHI: r4
      0x0089: PHI (r4v5 java.lang.String) = 
      (r4v4 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
      (r4v2 java.lang.String)
     binds: [B:23:0x0087, B:17:0x0069, B:15:0x0066, B:12:0x005e, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00e3 A[PHI: r2
      0x00e3: PHI (r2v4 java.util.HashMap) = (r2v3 java.util.HashMap), (r2v2 java.util.HashMap) binds: [B:31:0x00e1, B:15:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01e9 A[PHI: r8 r13
      0x01e9: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short) binds: [B:58:0x01e7, B:46:0x018d, B:12:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x01e9: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:58:0x01e7, B:46:0x018d, B:12:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0217 A[PHI: r1 r7 r9 r10 r11 r12
      0x0217: PHI (r1v4 l.ᩳ֫ܺ) = (r1v2 l.ᩳ֫ܺ), (r1v2 l.ᩳ֫ܺ), (r1v3 l.ᩳ֫ܺ), (r1v2 l.ᩳ֫ܺ) binds: [B:54:0x01cb, B:50:0x01ab, B:35:0x0119, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0217: PHI (r7v3 short) = (r7v2 short), (r7v2 short), (r7v2 short), (r7v5 short) binds: [B:54:0x01cb, B:50:0x01ab, B:35:0x0119, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0217: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:54:0x01cb, B:50:0x01ab, B:35:0x0119, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0217: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:54:0x01cb, B:50:0x01ab, B:35:0x0119, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0217: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:54:0x01cb, B:50:0x01ab, B:35:0x0119, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0217: PHI (r12v4 short) = (r12v2 short), (r12v3 short), (r12v2 short), (r12v2 short) binds: [B:54:0x01cb, B:50:0x01ab, B:35:0x0119, B:6:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x024a A[PHI: r3 r6 r15 r20
      0x024a: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:64:0x0248, B:27:0x00c3, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r6v4 char) = (r6v3 char), (r6v2 char), (r6v2 char) binds: [B:64:0x0248, B:27:0x00c3, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]) binds: [B:64:0x0248, B:27:0x00c3, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x024a: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:64:0x0248, B:27:0x00c3, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m40912() {
        int iM3169;
        int i;
        int i2;
        int i3 = C2966.f9654;
        int i4 = AbstractC3624.f12429;
        int iM2761 = C0619.m2761("ۤۧ") ^ i3;
        int i5 = ((iM2761 ^ i4) * (-27073)) ^ (-1642649695);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2761 ^ 1858136522;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s3 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1418430691;
        String strM11996 = null;
        String strM40910 = null;
        HashMap map = null;
        InterfaceC18752 interfaceC18752M8173 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * 975) >> 31));
            switch (i12) {
                case -1984229784:
                case -341641826:
                    if ((i10 * i10) - i9 < 0) {
                        iM3169 = (C0773.m3169("֫֡") + i4) * (-29);
                        i = ((iM3169 ^ i3) * (-29835)) ^ 292629724;
                        i2 = 1121418991;
                    } else {
                        iM3169 = C0619.m2761("֡ܽ") ^ i3;
                        i = ((iM3169 ^ i4) * (-17611)) ^ 501598703;
                        i2 = 1947987973;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1623203695:
                case 4235446:
                    s2 = 2;
                    if (C2354.f7599 >= 0) {
                        iM3169 = (C0619.m2761("ۜܶ") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM3169 ^ i3) * 29157) ^ (-1958105059);
                        i2 = -1905298250;
                    } else {
                        iM3169 = (C0619.m2761("ۖܺ") ^ i4) * (-3);
                        i = ((iM3169 ^ i3) * (-8957)) ^ 1534063953;
                        i2 = 677486993;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1482931671:
                case 878152871:
                    i7 = s * s2;
                    i8 = 1;
                    if (C13473.f42873 != 0) {
                        iM3169 = (i4 - C0773.m3169("᩵ܶ")) * (-81);
                        i = ((iM3169 ^ i3) * 8811) ^ 1614705784;
                        i2 = 764778455;
                    } else {
                        iM3169 = C0773.m3169("ܿۗ") ^ i3;
                        i = ((iM3169 ^ i4) * 2345) ^ (-1333963645);
                        i2 = -396603358;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1241564283:
                case 2141263519:
                    interfaceC18752M8173 = C2419.m8173(ApplicationC17729.f58258);
                    if (C4238.f15451 >= 0) {
                        iM3169 = (i4 - C0773.m3169("᩵ܶ")) * (-81);
                        i = ((iM3169 ^ i3) * 8811) ^ 1614705784;
                        i2 = 764778455;
                    } else {
                        iM3169 = C0619.m2761("᩵ܽ") ^ i4;
                        i = ((iM3169 ^ i3) * (-9383)) ^ (-845904369);
                        i2 = -1096752255;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1176190716:
                case 1888237883:
                    C2485.m8357();
                    iM3169 = (i3 - C0619.m2761("ܳۛ")) * (-31);
                    i = ((iM3169 ^ i4) * (-29275)) ^ 1882628821;
                    i2 = -2051253160;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -954526037:
                case -81667861:
                    strM40910 = m40910(map);
                    sArr2 = f56656;
                    if (C13473.m33144()) {
                        iM3169 = C0619.m2761("۟ۗ") ^ i4;
                        i = ((iM3169 ^ i3) * (-21731)) ^ (-583477938);
                        i2 = 696656944;
                    } else {
                        iM3169 = C0773.m3169("᩷ۘ") ^ i3;
                        i = ((iM3169 ^ i4) * (-19129)) ^ 1897954685;
                        i2 = -685637947;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -889757920:
                case 925552457:
                    C11235.m28308(C2966.m9665(interfaceC18752M8173, strM11996, strM40910));
                    break;
                case -884118460:
                case 529405638:
                    i10 = s + s3;
                    if (C1321.m4852()) {
                        iM3169 = C0619.m2761("ۧ᩶") ^ i3;
                        i = ((iM3169 ^ i4) * 31313) ^ 117555632;
                        i2 = 346307524;
                    } else {
                        iM3169 = (C0619.m2761("ۜܶ") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM3169 ^ i3) * 29157) ^ (-1958105059);
                        i2 = -1905298250;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -680560368:
                case 1798213572:
                    C1146.m4231();
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (i3 - C0619.m2761("ܳۛ")) * (-31);
                        i = ((iM3169 ^ i4) * (-29275)) ^ 1882628821;
                        i2 = -2051253160;
                    } else {
                        iM3169 = C0773.m3169("᩷ۘ") ^ i3;
                        i = ((iM3169 ^ i4) * (-19129)) ^ 1897954685;
                        i2 = -685637947;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -644580628:
                case -385580934:
                    i11 = 4298;
                    iM3169 = (i3 - C0619.m2761("᩶֫")) * (-61);
                    i = ((iM3169 ^ i4) * (-13347)) ^ 1136935610;
                    i2 = -275531403;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -244998947:
                case -203427702:
                    sArr = f56656;
                    c = 4;
                    if (C0862.f3233 != 0) {
                        iM3169 = C0773.m3169("᩷ۘ") ^ i3;
                        i = ((iM3169 ^ i4) * (-19129)) ^ 1897954685;
                        i2 = -685637947;
                    } else {
                        iM3169 = C0773.m3169("۟ᩴ") ^ i3;
                        i = ((iM3169 ^ i4) * (-5331)) ^ (-918294624);
                        i2 = -1198874093;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -179375325:
                case -18457451:
                    map = f56652;
                    if (C1564.f5401 <= 0) {
                        iM3169 = C0619.m2761("᩵ۖ") ^ i3;
                        i = ((iM3169 ^ i4) * (-20563)) ^ 1953338967;
                        i2 = -309278727;
                    } else {
                        iM3169 = (C0619.m2761("᩻֫") ^ i3) * (-67);
                        i = ((iM3169 ^ i4) * 11385) ^ 1975360229;
                        i2 = 645020652;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -125078590:
                case 1245511751:
                    if (C1080.f3865 < 0) {
                        iM3169 = (i3 - C0619.m2761("ܳۛ")) * (-31);
                        i = ((iM3169 ^ i4) * (-29275)) ^ 1882628821;
                        i2 = -2051253160;
                    } else {
                        iM3169 = (C0619.m2761("ۜܶ") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM3169 ^ i3) * 29157) ^ (-1958105059);
                        i2 = -1905298250;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 99213356:
                case 618267023:
                    i11 = 12352;
                    iM3169 = (i3 - C0619.m2761("᩶֫")) * (-61);
                    i = ((iM3169 ^ i4) * (-13347)) ^ 1136935610;
                    i2 = -275531403;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 707156483:
                case 1967354521:
                    i9 = i7 + i8;
                    s3 = 1;
                    if (C1343.f4799 != 0) {
                        iM3169 = (i4 - C0773.m3169("᩵ܶ")) * (-81);
                        i = ((iM3169 ^ i3) * 8811) ^ 1614705784;
                        i2 = 764778455;
                    } else {
                        iM3169 = (C0773.m3169("ۡۛ") ^ i4) * (-41);
                        i = ((iM3169 ^ i3) * 13729) ^ (-960521263);
                        i2 = -915580554;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 840704518:
                case 1784691396:
                    AbstractC0116.m1243();
                    if (C3998.f13671 == 0) {
                        iM3169 = (i3 - C0619.m2761("ܳۛ")) * (-31);
                        i = ((iM3169 ^ i4) * (-29275)) ^ 1882628821;
                        i2 = -2051253160;
                    } else {
                        iM3169 = C0619.m2761("᩵ۖ") ^ i3;
                        i = ((iM3169 ^ i4) * (-20563)) ^ 1953338967;
                        i2 = -309278727;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 984022947:
                case 2097067011:
                    C1564.m5509();
                    C2702.m8876();
                    break;
                case 1388491457:
                case 1651233826:
                    strM11996 = C3690.m11996(sArr2, 5, 22, i11);
                    if (C1343.m4943()) {
                        iM3169 = (i4 - C0773.m3169("ۧ᩺")) * 9;
                        i = ((iM3169 ^ i3) * (-30651)) ^ (-1256462955);
                        i2 = 1639532847;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ܳۛ")) * (-31);
                        i = ((iM3169 ^ i4) * (-29275)) ^ 1882628821;
                        i2 = -2051253160;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    s = sArr[c];
                    if (C0619.f2439) {
                        iM3169 = (i4 - C0773.m3169("᩵ܶ")) * (-81);
                        i = ((iM3169 ^ i3) * 8811) ^ 1614705784;
                        i2 = 764778455;
                    } else {
                        iM3169 = C0619.m2761("ܿۜ") ^ i4;
                        i = ((iM3169 ^ i3) * (-6445)) ^ 200753851;
                        i2 = -724423642;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0127 A[PHI: r2 r6 r7
      0x0127: PHI (r2v5 java.util.Map$Entry) = (r2v4 java.util.Map$Entry), (r2v2 java.util.Map$Entry), (r2v2 java.util.Map$Entry) binds: [B:43:0x0125, B:10:0x003d, B:7:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0127: PHI (r6v3 int) = (r6v2 int), (r6v2 int), (r6v5 int) binds: [B:43:0x0125, B:10:0x003d, B:7:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0127: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v5 int) binds: [B:43:0x0125, B:10:0x003d, B:7:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0211 A[PHI: r13
      0x0211: PHI (r13v6 java.lang.StringBuilder) = (r13v5 java.lang.StringBuilder), (r13v4 java.lang.StringBuilder) binds: [B:66:0x020f, B:35:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m40910(HashMap map) {
        int iM2761;
        int i;
        Iterator itM9936 = null;
        Map.Entry entry = null;
        Object key = null;
        char c = 0;
        Object value = null;
        int iM7738 = 0;
        int i2 = 0;
        int i3 = 591397008;
        int i4 = C0773.f2792;
        int i5 = C3779.f12953;
        int iM3169 = C0773.m3169("ܿܺ") ^ i4;
        int i6 = ((iM3169 ^ i5) * (-9065)) ^ 1686335314;
        int i7 = -313419614;
        while (true) {
            int i8 = iM3169 ^ i7;
            StringBuilder sb = null;
            while (true) {
                i3 = ((((i3 ^ i5) * 10415) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2111882386:
                    case -1262932555:
                        C20932.m47848();
                        iM2761 = C0619.m2761("ܰ۫") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-17259)) ^ (-1286605794);
                        i = 1019671150;
                        i8 = iM2761 ^ i;
                        break;
                    case -2004051658:
                    case 304899256:
                        key = entry.getKey();
                        if (C2375.m8065() > 0) {
                            iM2761 = (C0619.m2761("۬֨") ^ i5) * (-89);
                            i6 = ((iM2761 ^ i4) * 32503) ^ (-2047474825);
                            i = 2059072735;
                            i8 = iM2761 ^ i;
                        } else {
                            iM3169 = (C0773.m3169("ܶ֫") ^ i5) * (-15);
                            i6 = ((iM3169 ^ i4) * 28481) ^ 949178657;
                            i7 = 303284413;
                        }
                        break;
                    case -1957612518:
                    case 2074746172:
                        if (C20932.m47848() != 0) {
                            iM3169 = C0773.m3169("ܰۢ") ^ i5;
                            i6 = ((iM3169 ^ i4) * 18465) ^ 1167234460;
                            i7 = -1061841412;
                        }
                        iM2761 = C0619.m2761("ܰ۫") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-17259)) ^ (-1286605794);
                        i = 1019671150;
                        i8 = iM2761 ^ i;
                        break;
                    case -1687499331:
                    case 828380749:
                        C2288.m7767();
                        if (C3448.f11240 < 0) {
                            iM3169 = C0773.m3169("ܰۢ") ^ i5;
                            i6 = ((iM3169 ^ i4) * 18465) ^ 1167234460;
                            i7 = -1061841412;
                        }
                        iM2761 = (C0773.m3169("ۗ۫") + i4) * 39;
                        i6 = ((iM2761 ^ i5) * (-2147)) ^ 251271855;
                        i = 233808343;
                        i8 = iM2761 ^ i;
                        break;
                    case -1613822000:
                    case 1179716254:
                        if (C1783.f6087 <= 0) {
                            iM3169 = (C0773.m3169("ܶ֫") ^ i5) * (-15);
                            i6 = ((iM3169 ^ i4) * 28481) ^ 949178657;
                            i7 = 303284413;
                        } else if (AbstractC3624.f12429 <= 0 || C1080.f3865 >= 0) {
                            iM3169 = C0773.m3169("ܰۢ") ^ i5;
                            i6 = ((iM3169 ^ i4) * 18465) ^ 1167234460;
                            i7 = -1061841412;
                        } else {
                            sb = new StringBuilder();
                            if (C0773.f2792 <= 0) {
                                iM2761 = (i4 - C0619.m2761("֡ۧ")) * (-35);
                                i6 = ((iM2761 ^ i5) * 1911) ^ (-302055321);
                                i = -821788566;
                            } else {
                                iM2761 = (C0619.m2761("ۙ۬") ^ i5) * (-11);
                                i6 = ((iM2761 ^ i4) * 18565) ^ (-1999000651);
                                i = -673935285;
                            }
                            i8 = iM2761 ^ i;
                        }
                        break;
                    case -1495187625:
                    case -269692880:
                        sb.setLength(iM7738 + i2);
                        iM2761 = (C0619.m2761("ۘ᩷") ^ i4) * (-113);
                        i6 = ((iM2761 ^ i5) * (-22441)) ^ 425249310;
                        i = 2104025914;
                        i8 = iM2761 ^ i;
                        break;
                    case -849203278:
                    case -810861643:
                        value = entry.getValue();
                        if (C3077.f9998) {
                            iM2761 = (C0773.m3169("ᩳ᩶") + i5) * 25;
                            i6 = ((iM2761 ^ i4) * 21657) ^ (-2054637698);
                            i = 875445394;
                        } else {
                            iM2761 = C0619.m2761("ܰ۫") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-17259)) ^ (-1286605794);
                            i = 1019671150;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -848217146:
                    case 1982262472:
                        if (C3998.m12923(itM9936)) {
                            iM2761 = (i5 - C0773.m3169("ۜ֡")) * (-9);
                            i6 = ((iM2761 ^ i4) * 311) ^ 87728988;
                            i = -613183728;
                        } else {
                            iM2761 = C0619.m2761("ۨ֨") ^ i4;
                            i6 = ((iM2761 ^ i5) * 9335) ^ 949286662;
                            i = 395609994;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -744548233:
                    case -213693607:
                        C3779.m12258(sb, (String) key);
                        if (C3448.f11240 >= 0) {
                            iM2761 = (i4 - C0619.m2761("֡ۧ")) * (-35);
                            i6 = ((iM2761 ^ i5) * 1911) ^ (-302055321);
                            i = -821788566;
                        } else {
                            iM2761 = (C0619.m2761("᩵᩹") + i4) * (-107);
                            i6 = ((iM2761 ^ i5) * 17291) ^ (-1455195861);
                            i = -137996797;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case -742325354:
                    case 1314418556:
                        C1564.m5509();
                        C2354.m7983();
                        return null;
                    case -509150846:
                    case 1526158551:
                        itM9936 = RunnableC3055.m9936(map.entrySet());
                        iM2761 = C0773.m3169("ᩴܶ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 29493) ^ (-1740111409);
                        i = 79408931;
                        i8 = iM2761 ^ i;
                        break;
                    case -509090606:
                    case 1838421652:
                        c = '\\';
                        C2023.m6955(sb, '\\');
                        if (!C3779.m12264()) {
                            iM3169 = C0773.m3169("ܰۢ") ^ i5;
                            i6 = ((iM3169 ^ i4) * 18465) ^ 1167234460;
                            i7 = -1061841412;
                        } else {
                            iM2761 = C0619.m2761("᩸ۤ") ^ i5;
                            i6 = ((iM2761 ^ i4) * 601) ^ (-1405792132);
                            i = -453423640;
                            i8 = iM2761 ^ i;
                        }
                        break;
                    case -382916232:
                    case 263474473:
                        RunnableC3055.m9933();
                        if (C0862.m3503()) {
                            iM3169 = (C0773.m3169("ܶ֫") ^ i5) * (-15);
                            i6 = ((iM3169 ^ i4) * 28481) ^ 949178657;
                            i7 = 303284413;
                        }
                        iM2761 = C0619.m2761("ܰ۫") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-17259)) ^ (-1286605794);
                        i = 1019671150;
                        i8 = iM2761 ^ i;
                        break;
                    case -273621622:
                    case 446124304:
                        return C1080.m4058(sb);
                    case 384658892:
                    case 1695163619:
                        if (C2287.m7738(sb) > 0) {
                            iM2761 = (C0619.m2761("᩸᩶") ^ i4) * (-43);
                            i6 = ((iM2761 ^ i5) * 32033) ^ (-2004653059);
                            i = 596655185;
                        } else {
                            iM2761 = (C0619.m2761("ۘ᩷") ^ i4) * (-113);
                            i6 = ((iM2761 ^ i5) * (-22441)) ^ 425249310;
                            i = 2104025914;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    case 605905251:
                    case 1747576709:
                        C1146.m4235(sb, value);
                        C1080.m4046(sb, c);
                        iM2761 = C0773.m3169("ᩴܶ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 29493) ^ (-1740111409);
                        i = 79408931;
                        i8 = iM2761 ^ i;
                        break;
                    case 1390347927:
                    case 2097634089:
                        entry = (Map.Entry) C0950.m3796(itM9936);
                        if (C1343.f4799 != 0) {
                            iM2761 = (C0773.m3169("ۗ۫") + i4) * 39;
                            i6 = ((iM2761 ^ i5) * (-2147)) ^ 251271855;
                            i = 233808343;
                        } else {
                            iM2761 = (C0773.m3169("ܿۚ") + i4) * 77;
                            i6 = ((iM2761 ^ i5) * (-27505)) ^ (-396697936);
                            i = 1807978092;
                        }
                        i8 = iM2761 ^ i;
                        break;
                    default:
                        iM7738 = C2287.m7738(sb);
                        i2 = -1;
                        if (C23916.f77426 <= 0) {
                            iM2761 = (C0773.m3169("ۗ۫") + i4) * 39;
                            i6 = ((iM2761 ^ i5) * (-2147)) ^ 251271855;
                            i = 233808343;
                        } else {
                            iM2761 = C0619.m2761("ۛ᩸") ^ i5;
                            i6 = ((iM2761 ^ i4) * (-11455)) ^ (-1555332475);
                            i = -965449733;
                        }
                        i8 = iM2761 ^ i;
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40911(View view) {
        view.setBackground(m40908(C3998.m12922(view)));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m40915(View view) {
        C3998.m12922(view);
        view.setBackground(m40909());
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0157 A[PHI: r2 r7 r8
      0x0157: PHI (r2v4 android.graphics.drawable.ColorDrawable) = 
      (r2v3 android.graphics.drawable.ColorDrawable)
      (r2v2 android.graphics.drawable.ColorDrawable)
      (r2v2 android.graphics.drawable.ColorDrawable)
     binds: [B:47:0x0155, B:29:0x00c1, B:12:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:47:0x0155, B:29:0x00c1, B:12:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r8v4 int[]) = (r8v2 int[]), (r8v3 int[]), (r8v2 int[]) binds: [B:47:0x0155, B:29:0x00c1, B:12:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StateListDrawable m40909() {
        int iM2761;
        int i;
        StateListDrawable stateListDrawable = null;
        ColorDrawable colorDrawable = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int[] iArr = null;
        int[] iArr2 = null;
        int i6 = 402070429;
        int i7 = C1783.f6087;
        int i8 = AbstractC0116.f1064;
        int iM2762 = C0619.m2761("᩷᩸") ^ i7;
        int i9 = ((iM2762 ^ i8) * 5881) ^ (-860111052);
        int i10 = iM2762 ^ (-807918975);
        while (true) {
            TransitionDrawable transitionDrawable = null;
            ColorDrawable colorDrawable2 = null;
            while (true) {
                i6 = ((((i6 ^ i8) * 11509) >> 31) & i9) ^ i10;
                switch (i6) {
                    case -2047933034:
                    case -690693903:
                        stateListDrawable = new StateListDrawable();
                        int i11 = C3296.f10758;
                        if (C3734.f12817 < 0) {
                            colorDrawable2 = new ColorDrawable(i11 & 553648127);
                            if (AbstractC3624.f12429 <= 0) {
                                iM2761 = C0619.m2761("ۜ᩹") ^ i8;
                                i9 = ((iM2761 ^ i7) * 9657) ^ 862151322;
                                i = -1495648232;
                            } else {
                                iM2761 = C0773.m3169("ۡ᩶") ^ i7;
                                i9 = ((iM2761 ^ i8) * (-25365)) ^ (-48252864);
                                i = 1849125076;
                            }
                            i10 = iM2761 ^ i;
                        }
                        break;
                    case -1667484793:
                    case 1763104242:
                        AbstractC3624.m11755();
                        if (C1519.f5300 >= 0) {
                        }
                        iM2761 = C0773.m3169("ܳ᩺") ^ i8;
                        i9 = ((iM2761 ^ i7) * 32343) ^ 739056688;
                        i = 15917337;
                        i10 = iM2761 ^ i;
                        break;
                    case -1568639975:
                    case 712028710:
                        i5 = R.attr.state_pressed;
                        iArr = new int[]{i3, i4, R.attr.state_pressed};
                        if (C1564.f5401 <= 0) {
                            iM2761 = C0619.m2761("ۧ۫") ^ i7;
                            i9 = ((iM2761 ^ i8) * (-23811)) ^ 1284704643;
                            i = 589455584;
                        } else {
                            iM2761 = C0619.m2761("ۖᩳ") ^ i7;
                            i9 = ((iM2761 ^ i8) * (-21933)) ^ (-1075205977);
                            i = 749169555;
                        }
                        i10 = iM2761 ^ i;
                        break;
                    case -1564202311:
                    case 824311036:
                        if (C0487.f2131 <= 0) {
                            int iM2763 = (C0619.m2761("ܰܳ") ^ i7) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i9 = (-1971827659) ^ ((iM2763 ^ i8) * 30779);
                            i10 = (-1581282091) ^ iM2763;
                            transitionDrawable = null;
                        } else {
                            iM2761 = C0773.m3169("ܳ᩺") ^ i8;
                            i9 = ((iM2761 ^ i7) * 32343) ^ 739056688;
                            i = 15917337;
                            i10 = iM2761 ^ i;
                        }
                        break;
                    case -876896278:
                    case 1720970296:
                        stateListDrawable.addState(iArr, new ColorDrawable(i2));
                        int[] iArr3 = {i3, i4};
                        if (C1519.f5300 < 0) {
                            stateListDrawable.addState(iArr3, new ColorDrawable(i2));
                            stateListDrawable.addState(new int[]{i3, i5}, transitionDrawable);
                            iArr2 = new int[]{-16842908, i5};
                            if (C2375.f7641 > 0) {
                                iM2761 = (C0619.m2761("ۖܰ") + i8) * 35;
                                i9 = ((iM2761 ^ i7) * 28559) ^ (-1959909907);
                                i = -115211998;
                                i10 = iM2761 ^ i;
                                break;
                            }
                        }
                        int iM2764 = (C0619.m2761("ܰܳ") ^ i7) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i9 = (-1971827659) ^ ((iM2764 ^ i8) * 30779);
                        i10 = (-1581282091) ^ iM2764;
                        transitionDrawable = null;
                        break;
                    case -660130232:
                    case -587773855:
                        Drawable[] drawableArr = new Drawable[2];
                        if (C2702.f8586 > 0) {
                            drawableArr[0] = colorDrawable2;
                            if (C3448.f11240 >= 0) {
                                i2 = 0;
                                int iM2765 = (C0619.m2761("ܰܳ") ^ i7) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                i9 = (-1971827659) ^ ((iM2765 ^ i8) * 30779);
                                i10 = (-1581282091) ^ iM2765;
                                transitionDrawable = null;
                            } else {
                                drawableArr[1] = colorDrawable;
                                transitionDrawable = new TransitionDrawable(drawableArr);
                                int[] iArr4 = {-16842909};
                                if (C20932.f66974 <= 0) {
                                    i2 = 0;
                                    iM2761 = C0619.m2761("ۜ᩹") ^ i8;
                                    i9 = ((iM2761 ^ i7) * 9657) ^ 862151322;
                                    i = -1495648232;
                                    i10 = iM2761 ^ i;
                                } else {
                                    stateListDrawable.addState(iArr4, new ColorDrawable(0));
                                    i3 = R.attr.state_focused;
                                    i4 = -16842910;
                                    if (C3690.f12684 > 0) {
                                        int iM2766 = C0619.m2761("ܶۙ") ^ i8;
                                        i9 = ((iM2766 ^ i7) * (-12535)) ^ 391441486;
                                        i10 = iM2766 ^ 779004409;
                                        i2 = 0;
                                    }
                                }
                            }
                            break;
                        }
                        i2 = 0;
                        break;
                    case -319757055:
                    case 1769514080:
                        stateListDrawable.addState(iArr2, transitionDrawable);
                        stateListDrawable.addState(new int[]{i3}, transitionDrawable);
                        stateListDrawable.setExitFadeDuration(300);
                        return stateListDrawable;
                    case -242458174:
                    case 604237463:
                        colorDrawable = new ColorDrawable(C3296.f10758 & 989855743);
                        if (C4238.m13540() <= 0) {
                            iM2761 = C0619.m2761("ۧ۫") ^ i7;
                            i9 = ((iM2761 ^ i8) * (-23811)) ^ 1284704643;
                            i = 589455584;
                        } else {
                            iM2761 = C0773.m3169("ۚۚ") ^ i8;
                            i9 = ((iM2761 ^ i7) * (-28845)) ^ (-1367062505);
                            i = -655790435;
                        }
                        i10 = iM2761 ^ i;
                        break;
                    case 82633986:
                    case 1516763321:
                        C3077.m10041();
                        C17202.m40372();
                        break;
                    case 1270498860:
                    case 1676418814:
                        if (!C3077.f9998) {
                        }
                        iM2761 = C0619.m2761("ۧ۫") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-23811)) ^ 1284704643;
                        i = 589455584;
                        i10 = iM2761 ^ i;
                        break;
                    default:
                        C3998.m12920();
                        return null;
                }
            }
            int iM2767 = C0619.m2761("ۛ᩸") ^ i7;
            i9 = (-2143049643) ^ ((iM2767 ^ i8) * (-13543));
            i10 = (-2022316365) ^ iM2767;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00e5 A[PHI: r4 r13
      0x00e5: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v4 java.lang.String) binds: [B:29:0x00e3, B:25:0x00c4] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r13v4 int) = (r13v3 int), (r13v2 int) binds: [B:29:0x00e3, B:25:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01c9 A[PHI: r9
      0x01c9: PHI (r9v5 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:52:0x01c7, B:14:0x007f, B:11:0x0077, B:5:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x021c A[PHI: r6 r10
      0x021c: PHI (r6v4 char) = (r6v3 char), (r6v2 char), (r6v2 char), (r6v2 char) binds: [B:60:0x021a, B:48:0x01a8, B:11:0x0077, B:7:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x021c: PHI (r10v4 short) = (r10v2 short), (r10v3 short), (r10v2 short), (r10v2 short) binds: [B:60:0x021a, B:48:0x01a8, B:11:0x0077, B:7:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x024d A[PHI: r1 r2 r3 r7 r8 r12 r18
      0x024d: PHI (r1v4 android.content.res.Resources) = 
      (r1v2 android.content.res.Resources)
      (r1v2 android.content.res.Resources)
      (r1v3 android.content.res.Resources)
      (r1v2 android.content.res.Resources)
      (r1v2 android.content.res.Resources)
      (r1v2 android.content.res.Resources)
     binds: [B:64:0x024b, B:56:0x01fd, B:37:0x013a, B:33:0x0115, B:21:0x00a0, B:14:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r2v4 android.content.res.Resources$Theme) = 
      (r2v2 android.content.res.Resources$Theme)
      (r2v2 android.content.res.Resources$Theme)
      (r2v3 android.content.res.Resources$Theme)
      (r2v2 android.content.res.Resources$Theme)
      (r2v2 android.content.res.Resources$Theme)
      (r2v2 android.content.res.Resources$Theme)
     binds: [B:64:0x024b, B:56:0x01fd, B:37:0x013a, B:33:0x0115, B:21:0x00a0, B:14:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r3v5 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r3v2 int), (r3v4 int), (r3v2 int) binds: [B:64:0x024b, B:56:0x01fd, B:37:0x013a, B:33:0x0115, B:21:0x00a0, B:14:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:64:0x024b, B:56:0x01fd, B:37:0x013a, B:33:0x0115, B:21:0x00a0, B:14:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:64:0x024b, B:56:0x01fd, B:37:0x013a, B:33:0x0115, B:21:0x00a0, B:14:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r12v4 short[]) = (r12v2 short[]), (r12v2 short[]), (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:64:0x024b, B:56:0x01fd, B:37:0x013a, B:33:0x0115, B:21:0x00a0, B:14:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r18v5 short[]) = (r18v4 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:64:0x024b, B:56:0x01fd, B:37:0x013a, B:33:0x0115, B:21:0x00a0, B:14:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Drawable m40913(Context context) {
        int iM2761;
        int i;
        int i2;
        int i3 = C0950.f3488;
        int i4 = C3779.f12953;
        int iM3169 = (C0773.m3169("ᩴܶ") ^ i3) * (-97);
        int i5 = ((iM3169 ^ i4) * (-14133)) ^ 1737496263;
        Resources.Theme theme = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM3169 ^ 873213373;
        Resources resources = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = -35984495;
        String strM53420 = null;
        int iM2762 = 0;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i4) * (-32347)) >> 31));
            switch (i11) {
                case -2126725980:
                case -481898445:
                    C3779.m12264();
                    C1321.m4852();
                    return null;
                case -1919261457:
                case -845451932:
                    sArr = f56656;
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0773.m3169("ᩴ᩷") ^ i3;
                        i = ((iM2761 ^ i4) * (-8731)) ^ (-890595617);
                        i2 = -2048350184;
                    } else {
                        iM2761 = C0619.m2761("᩸֫") ^ i4;
                        i = ((iM2761 ^ i3) * (-6861)) ^ 1045412160;
                        i2 = -539203726;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1727804028:
                case -1610959396:
                    s = sArr[c];
                    i7 = s * s;
                    if (C2288.m7767()) {
                        iM2761 = C0773.m3169("ᩴ᩷") ^ i3;
                        i = ((iM2761 ^ i4) * (-8731)) ^ (-890595617);
                        i2 = -2048350184;
                    } else {
                        iM2761 = (C0773.m3169("ۛۚ") ^ i3) * (-47);
                        i = ((iM2761 ^ i4) * 28991) ^ 1012993884;
                        i2 = 1367247344;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1700001024:
                case -173026080:
                    sArr2 = f56656;
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0773.m3169("ᩴ᩷") ^ i3;
                        i = ((iM2761 ^ i4) * (-8731)) ^ (-890595617);
                        i2 = -2048350184;
                    } else {
                        iM2761 = C0773.m3169("᩻۟") ^ i3;
                        i = ((iM2761 ^ i4) * (-14797)) ^ (-1215734524);
                        i2 = 1479378867;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1687340772:
                case -163117961:
                    c = 27;
                    if (C2288.f7433 <= 0) {
                        iM2761 = (i4 - C0773.m3169("֨ᩳ")) * 93;
                        i = ((iM2761 ^ i3) * 32361) ^ 720996519;
                        i2 = 423260598;
                    } else {
                        iM2761 = C0619.m2761("ۡۙ") ^ i3;
                        i = ((iM2761 ^ i4) * 28623) ^ (-554482490);
                        i2 = 237537200;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1656091803:
                case -821745061:
                    i10 = 28;
                    if (C3077.f9998) {
                        iM2761 = (C0619.m2761("ۙ֫") ^ i3) * 35;
                        i = ((iM2761 ^ i4) * (-7921)) ^ (-1102528239);
                        i2 = -1742757901;
                    } else {
                        iM2761 = C0619.m2761("ܿ۠") ^ i3;
                        i = ((iM2761 ^ i4) * 5933) ^ (-948729009);
                        i2 = 878153439;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1637684874:
                case -102357185:
                    s2 = 3462;
                    if (C23916.f77426 <= 0) {
                        iM2761 = (i4 - C0773.m3169("֨ᩳ")) * 93;
                        i = ((iM2761 ^ i3) * 32361) ^ 720996519;
                        i2 = 423260598;
                    } else {
                        iM2761 = C0773.m3169("ۧ᩸") ^ i4;
                        i = ((iM2761 ^ i3) * (-8407)) ^ 956877461;
                        i2 = -1219973842;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1630534551:
                case -934243361:
                    if ((s * s2) - i8 <= 0) {
                        iM2761 = (C0619.m2761("۫ۛ") + i3) * 11;
                        i = ((iM2761 ^ i4) * 22937) ^ 1800822466;
                        i2 = -1503849300;
                    } else {
                        iM2761 = C0773.m3169("ᩴۘ") ^ i3;
                        i = ((iM2761 ^ i4) * (-32651)) ^ (-992089517);
                        i2 = -964222769;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1552089230:
                case -97819646:
                    C13473.m33144();
                    if (C2834.f9334 > 0) {
                        iM2761 = (i4 - C0773.m3169("֨ᩳ")) * 93;
                        i = ((iM2761 ^ i3) * 32361) ^ 720996519;
                        i2 = 423260598;
                    } else {
                        iM2761 = (i4 - C0773.m3169("ۤ᩺")) * 53;
                        i = ((iM2761 ^ i3) * 6255) ^ (-1364872062);
                        i2 = -1738708413;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1530443914:
                case 994510044:
                    iM2762 = 2127283565 ^ C0619.m2761(strM53420);
                    if (C2375.m8065() <= 0) {
                        iM2761 = C0773.m3169("ᩴ᩷") ^ i3;
                        i = ((iM2761 ^ i4) * (-8731)) ^ (-890595617);
                        i2 = -2048350184;
                    } else {
                        iM2761 = (C0619.m2761("۫ܳ") + i4) * 73;
                        i = ((iM2761 ^ i3) * 8599) ^ (-550582686);
                        i2 = -1498898768;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -659168520:
                case -592289880:
                    i9 = 38103;
                    iM2761 = C0773.m3169("֫᩺") ^ i4;
                    i = ((iM2761 ^ i3) * (-4933)) ^ 5730737;
                    i2 = 1202359830;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 67480035:
                case 1839672021:
                    C3077.m10041();
                    if (C13473.m33144()) {
                        iM2761 = C0773.m3169("ۡ᩹") ^ i3;
                        i = ((iM2761 ^ i4) * (-16015)) ^ 2054415637;
                        i2 = 1953343911;
                    } else {
                        iM2761 = (i4 - C0773.m3169("֨ᩳ")) * 93;
                        i = ((iM2761 ^ i3) * 32361) ^ 720996519;
                        i2 = 423260598;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 87386217:
                case 1058292837:
                    if (AbstractC0116.m1243() != 0) {
                        iM2761 = C0773.m3169("ۡ᩹") ^ i3;
                        i = ((iM2761 ^ i4) * (-16015)) ^ 2054415637;
                        i2 = 1953343911;
                    } else {
                        iM2761 = C0773.m3169("ᩴ᩷") ^ i3;
                        i = ((iM2761 ^ i4) * (-8731)) ^ (-890595617);
                        i2 = -2048350184;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 854881449:
                case 1032902124:
                    strM53420 = C23916.m53420(sArr2, i10, 3, i9);
                    if (C3998.m12920()) {
                        iM2761 = (i4 - C0619.m2761("ۡ᩵")) * (-23);
                        i = ((iM2761 ^ i3) * 31367) ^ (-1242165032);
                        i2 = 2015527310;
                    } else {
                        iM2761 = C0619.m2761("ܿ۠") ^ i3;
                        i = ((iM2761 ^ i4) * 5933) ^ (-948729009);
                        i2 = 878153439;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1043973385:
                case 1848777999:
                    resources = context.getResources();
                    theme = context.getTheme();
                    if (C2310.m7813() <= 0) {
                        iM2761 = C0773.m3169("ᩴ᩷") ^ i3;
                        i = ((iM2761 ^ i4) * (-8731)) ^ (-890595617);
                        i2 = -2048350184;
                    } else {
                        iM2761 = C0773.m3169("۫ۙ") ^ i4;
                        i = ((iM2761 ^ i3) * (-29447)) ^ 954014804;
                        i2 = -1288401032;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1049824066:
                case 1370459143:
                    i9 = 924;
                    iM2761 = C0773.m3169("֫᩺") ^ i4;
                    i = ((iM2761 ^ i3) * (-4933)) ^ 5730737;
                    i2 = 1202359830;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 1058803026:
                case 2048408574:
                    return C9217.m24392(resources, C23434.m52631(theme, iM2762), theme);
                case 1852984851:
                case 2059164196:
                    i8 = i7 + 2996361;
                    if (C2287.f7432 >= 0) {
                        iM2761 = C0773.m3169("ۡ᩹") ^ i3;
                        i = ((iM2761 ^ i4) * (-16015)) ^ 2054415637;
                        i2 = 1953343911;
                    } else {
                        iM2761 = (C0773.m3169("᩶ܰ") ^ i4) * (-119);
                        i = ((iM2761 ^ i3) * 21177) ^ (-747128119);
                        i2 = 1361275283;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    C13473.m33144();
                    iM2761 = C0773.m3169("ۡ᩹") ^ i3;
                    i = ((iM2761 ^ i4) * (-16015)) ^ 2054415637;
                    i2 = 1953343911;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }
}
