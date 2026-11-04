package l;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۠ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W18B */
/* JADX INFO: loaded from: classes.dex */
public class C8837 extends AbstractC17787 {

    /* JADX INFO: renamed from: ܺۡ᩷, reason: not valid java name and contains not printable characters */
    private static final short[] f28898;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ForegroundColorSpan f28899;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List f28900;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f28901;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f28902;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f28903;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List f28904;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f28905;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final List f28906;

    static {
        ApplicationC23172.m52091(84);
        f28898 = new short[]{4502, -20226, -20301, -20303, -20316, -20301, -20296, -20226, -20301, -20303, -20316, -20301, -20296, -20303, -20292, -20292, -20226, -20301, -20292, -20303, -20317, -20317, -20226, -20317, -20315, -20320, -20299, -20318, -20226, -20295, -20291, -20320, -20292, -20299, -20291, -20299, -20290, -20316, -20317, -20226, -20317, -20289, -20315, -20318, -20301, -20299, -20226, -20292, -20295, -20290, -20299, -20226, -20292, -20289, -20301, -20303, -20292, -20317, -20226, -20318, -20299, -20297, -20295, -20317, -20316, -20299, -20318, -20317, -20226, -20320, -20318, -20289, -20292, -20289, -20297, -20315, -20299, -20226, -20303, -20290, -20290, -20289, -20316, -20303, -20316, -20295, -20289, -20290, -20226, -20299, -20290, -20300, -20240, -20303, -20290, -20290, -20289, -20316, -20303, -20316, -20295, -20289, -20290, -20226, -20317, -20315, -20302, -20303, -20290, -20290, -20289, -20316, -20303, -20316, -20295, -20289, -20290, -20226, -20299, -20290, -20300, -20240, -20317, -20315, -20302, -20303, -20290, -20290, -20289, -20316, -20303, -20316, -20295, -20289, -20290, -20226, -20320, -20303, -20318, -20303, -20291, -20226, -20299, -20290, -20300, -20240, -20320, -20303, -20318, -20303, -20291, -20226, -20292, -20289, -20301, -20303, -20292, -20226, -20299, -20290, -20300, -20240, -20292, -20289, -20301, -20303, -20292, -20226, -20318, -20299, -20317, -20316, -20303, -20318, -20316, -20240, -20292, -20289, -20301, -20303, -20292, -20226, -20298, -20295, -20299, -20292, -20300, -20226, -20299, -20290, -20300, -20240, -20298, -20295, -20299, -20292, -20300, -20226, -20291, -20299, -20316, -20296, -20289, -20300, -20226, -20299, -20290, -20300, -20240, -20291, -20299, -20316, -20296, -20289, -20300, -20226, -20303, -20318, -20318, -20303, -20311, -20227, -20300, -20303, -20316, -20303, -20226, -20299, -20290, -20300, -20240, -20303, -20318, -20318, -20303, -20311, -20227, -20300, -20303, -20316, -20303, -20226, -20320, -20303, -20301, -20293, -20299, -20300, -20227, -20317, -20313, -20295, -20316, -20301, -20296, -20226, -20299, -20290, -20300, -20240, -20320, -20303, -20301, -20293, -20299, -20300, -20227, -20317, -20313, -20295, -20316, -20301, -20296, -20226, -20317, -20320, -20303, -20318, -20317, -20299, -20227, -20317, -20313, -20295, -20316, -20301, -20296, -20226, -20299, -20290, -20300, -20240, -20317, -20320, -20303, -20318, -20317, -20299, -20227, -20317, -20313, -20295, -20316, -20301, -20296, 5853, -29829, -29898, -29895, -29900, -29914, -29914, -29835, -29829, -29896, -29904, -29919, -29891, -29894, -29903, -29835, -29829, -29901, -29892, -29904, -29895, -29903, -29835, -29829, -29904, -29893, -29903, -29835, 7083, 24105};
    }

    public native C8837(Context context, C19647 c19647);

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 65481. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC17787
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final l.C17041 mo23701(int r74, java.lang.CharSequence r75) {
        /*
            Method dump skipped, instruction units count: 6548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8837.mo23701(int, java.lang.CharSequence):l.ܺᩴᩴ");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0077  */
    /* JADX WARN: Code duplicated, block: B:59:0x01f2 A[PHI: r3 r4 r5 r11 r12 r13
      0x01f2: PHI (r3v4 l.ᩳ۬᩸) = (r3v2 l.ᩳ۬᩸), (r3v3 l.ᩳ۬᩸), (r3v2 l.ᩳ۬᩸), (r3v2 l.ᩳ۬᩸) binds: [B:58:0x01f0, B:33:0x0102, B:23:0x00ac, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int), (r4v2 int) binds: [B:58:0x01f0, B:33:0x0102, B:23:0x00ac, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:58:0x01f0, B:33:0x0102, B:23:0x00ac, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r11v4 short[]) = (r11v2 short[]), (r11v2 short[]), (r11v3 short[]), (r11v2 short[]) binds: [B:58:0x01f0, B:33:0x0102, B:23:0x00ac, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:58:0x01f0, B:33:0x0102, B:23:0x00ac, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:58:0x01f0, B:33:0x0102, B:23:0x00ac, B:9:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0220 A[PHI: r8
      0x0220: PHI (r8v5 short) = (r8v2 short), (r8v3 short), (r8v2 short) binds: [B:62:0x021e, B:50:0x01af, B:95:0x0220] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0252  */
    /* JADX WARN: Code duplicated, block: B:71:0x0282 A[PHI: r9 r18
      0x0282: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:70:0x0280, B:54:0x01d0, B:46:0x0190, B:12:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0282: PHI (r18v5 short[]) = (r18v3 short[]), (r18v4 short[]), (r18v3 short[]), (r18v3 short[]) binds: [B:70:0x0280, B:54:0x01d0, B:46:0x0190, B:12:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC17787
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23702(C24132 c24132, CharSequence charSequence) {
        int iM3169;
        int i;
        int i2;
        int i3 = C3779.f12953;
        int i4 = C0487.f2131;
        int iM2761 = C0619.m2761("᩸֨") ^ i4;
        int i5 = ((iM2761 ^ i3) * 15917) ^ 1992888743;
        InterfaceC19106 interfaceC19106M1233 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2761 ^ 353154816;
        String strM4058 = null;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1291169313;
        String strM34972 = null;
        int i13 = 0;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * 9695) >> 31));
            switch (i12) {
                case -2048681574:
                case -1198892456:
                    strM34972 = C14483.m34972(strM4058, C1783.m6233(sArr2, i10, i11, i9));
                    iM3169 = C0619.m2761("ᩳۢ") ^ i3;
                    i = ((iM3169 ^ i4) * (-22781)) ^ (-1992275374);
                    i2 = 1304584598;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1962368651:
                case 180798301:
                    if (C0950.f3488 >= 0) {
                        iM3169 = C0773.m3169("ܶᩳ") ^ i3;
                        i = ((iM3169 ^ i4) * 20919) ^ 1313508981;
                        i2 = -2146970016;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۤܶ")) * (-17);
                        i = ((iM3169 ^ i3) * (-13559)) ^ (-175655745);
                        i2 = -44289050;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1932213572:
                case -588973617:
                    if (C3099.m10095()) {
                        iM3169 = C0619.m2761("ۘᩴ") ^ i4;
                        i = ((iM3169 ^ i3) * (-3895)) ^ (-1537455235);
                        i2 = -673245137;
                    } else {
                        iM3169 = C0619.m2761("۬᩻") ^ i3;
                        i = ((iM3169 ^ i4) * (-5031)) ^ 30841073;
                        i2 = -928648719;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1706534720:
                case 2045116007:
                    if (C3734.m12152() >= 0) {
                        iM3169 = (C0619.m2761("ۧ᩺") ^ i4) * (-47);
                        i = ((iM3169 ^ i3) * (-18683)) ^ 1113496393;
                        i2 = -1842808283;
                    } else {
                        iM3169 = (C0619.m2761("ܺۡ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM3169 ^ i4) * 18985) ^ (-2058012664);
                        i2 = -1036348705;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1669455606:
                case -1654386934:
                    i8 = (s * s) + 240157009;
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0773.m3169("ܺ֡") ^ i4;
                        i = ((iM3169 ^ i3) * 12405) ^ 1135870778;
                        i2 = -1925580161;
                    } else {
                        iM3169 = C0619.m2761("ۗۤ") ^ i4;
                        i = ((iM3169 ^ i3) * (-28653)) ^ 808974963;
                        i2 = 39769652;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1571806956:
                case -1062293077:
                    if (C3779.f12953 <= 0) {
                        iM3169 = (C0619.m2761("ܺۡ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM3169 ^ i4) * 18985) ^ (-2058012664);
                        i2 = -1036348705;
                    } else {
                        iM3169 = C0773.m3169("ܺ֡") ^ i4;
                        i = ((iM3169 ^ i3) * 12405) ^ 1135870778;
                        i2 = -1925580161;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1564144416:
                case 737663925:
                    strM4058 = C1080.m4058((SpannableString) charSequence);
                    if (this.f28902) {
                        iM3169 = C0619.m2761("۠ۗ") ^ i3;
                        i = ((iM3169 ^ i4) * (-18597)) ^ 1589753715;
                        i2 = 1991591770;
                    } else {
                        strM34972 = strM4058;
                        iM3169 = C0619.m2761("ᩳۢ") ^ i3;
                        i = ((iM3169 ^ i4) * (-22781)) ^ (-1992275374);
                        i2 = 1304584598;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1449167189:
                case 475759115:
                    if (C2375.m8065() > 0) {
                        iM3169 = (C0619.m2761("ۧ᩺") ^ i4) * (-47);
                        i = ((iM3169 ^ i3) * (-18683)) ^ 1113496393;
                        i2 = -1842808283;
                    } else {
                        iM3169 = C0619.m2761("ۘᩴ") ^ i4;
                        i = ((iM3169 ^ i3) * (-3895)) ^ (-1537455235);
                        i2 = -673245137;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1408392041:
                case 1216584743:
                    i9 = 24999;
                    iM3169 = C0619.m2761("᩹ۜ") ^ i4;
                    i = ((iM3169 ^ i3) * (-3405)) ^ (-1499842910);
                    i2 = 1015392046;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1304297013:
                case 1596835227:
                    sArr2 = f28898;
                    i10 = 334;
                    i11 = 1;
                    if (C0773.f2792 <= 0) {
                        iM3169 = C0619.m2761("ۘᩴ") ^ i4;
                        i = ((iM3169 ^ i3) * (-3895)) ^ (-1537455235);
                        i2 = -673245137;
                    } else {
                        iM3169 = (C0619.m2761("᩶֫") ^ i3) * (-63);
                        i = ((iM3169 ^ i4) * (-32487)) ^ 1748959073;
                        i2 = 1193322905;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1219475767:
                case 41863720:
                    if (C1783.m6232()) {
                        iM3169 = (C0773.m3169("᩷ܰ") + i4) * (-61);
                        i = ((iM3169 ^ i3) * (-19811)) ^ (-1833083340);
                        i2 = 333350069;
                    } else {
                        iM3169 = C0773.m3169("ܺ֡") ^ i4;
                        i = ((iM3169 ^ i3) * 12405) ^ 1135870778;
                        i2 = -1925580161;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1191871074:
                case 1683554927:
                    interfaceC19106M1233 = AbstractC0116.m1233(c24132);
                    i7 = this.f28903;
                    i13 = this.f28905;
                    if (C2310.f7472 >= 0) {
                        iM3169 = C0619.m2761("ۘᩴ") ^ i4;
                        i = ((iM3169 ^ i3) * (-3895)) ^ (-1537455235);
                        i2 = -673245137;
                    } else {
                        iM3169 = (C0619.m2761("ܽ֫") + i4) * 97;
                        i = ((iM3169 ^ i3) * (-15959)) ^ (-1537012315);
                        i2 = -278367428;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -845398426:
                case 746078375:
                    C1564.m5509();
                    iM3169 = (C0619.m2761("ۧ᩺") ^ i4) * (-47);
                    i = ((iM3169 ^ i3) * (-18683)) ^ 1113496393;
                    i2 = -1842808283;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -810016945:
                case 839996296:
                    s = sArr[333];
                    if (C2023.f6737) {
                        iM3169 = C0773.m3169("ܶᩳ") ^ i3;
                        i = ((iM3169 ^ i4) * 20919) ^ 1313508981;
                        i2 = -2146970016;
                    } else {
                        iM3169 = (i4 - C0619.m2761("᩶᩺")) * (-45);
                        i = ((iM3169 ^ i3) * (-17957)) ^ 528772238;
                        i2 = 2093962806;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -654476286:
                case 1121779014:
                    C0950.m3788(c24132, C3077.m10045(strM34972) + this.f28903);
                    break;
                case -516073016:
                case 2018398016:
                    sArr = f28898;
                    if (AbstractC0641.m2813() <= 0) {
                        iM3169 = C0773.m3169("ܺ֡") ^ i4;
                        i = ((iM3169 ^ i3) * 12405) ^ 1135870778;
                        i2 = -1925580161;
                    } else {
                        iM3169 = (i3 - C0619.m2761("֨ᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM3169 ^ i4) * (-19071)) ^ 209446265;
                        i2 = 1950526697;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -440193770:
                case 540518782:
                    RunnableC3646.m11813();
                    C1564.m5509();
                    break;
                case 220948570:
                case 925201199:
                    interfaceC19106M1233.replace(i7, i13, strM34972);
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0773.m3169("ܶᩳ") ^ i3;
                        i = ((iM3169 ^ i4) * 20919) ^ 1313508981;
                        i2 = -2146970016;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    } else {
                        int iM2762 = (C0619.m2761("֡᩶") + i4) * (-73);
                        i5 = ((iM2762 ^ i3) * 10737) ^ 1421205225;
                        i6 = iM2762 ^ (-2004610999);
                    }
                    break;
                case 443047108:
                case 1036255969:
                    i9 = 24073;
                    iM3169 = C0619.m2761("᩹ۜ") ^ i4;
                    i = ((iM3169 ^ i3) * (-3405)) ^ (-1499842910);
                    i2 = 1015392046;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1834844451:
                case 2061655910:
                    if (C1542.m5459() >= 0) {
                        iM3169 = (C0619.m2761("ۧ᩺") ^ i4) * (-47);
                        i = ((iM3169 ^ i3) * (-18683)) ^ 1113496393;
                        i2 = -1842808283;
                    } else {
                        iM3169 = C0773.m3169("ܶۛ") ^ i3;
                        i = ((iM3169 ^ i4) * (-22947)) ^ 410695447;
                        i2 = 593394702;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    if ((s * 30994) - i8 <= 0) {
                        iM3169 = C0619.m2761("᩹ۧ") ^ i3;
                        i = ((iM3169 ^ i4) * (-30269)) ^ 863049413;
                        i2 = 871579260;
                    } else {
                        iM3169 = C0619.m2761("ۗۗ") ^ i3;
                        i = ((iM3169 ^ i4) * (-2997)) ^ (-1647494934);
                        i2 = -2053822655;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }
}
