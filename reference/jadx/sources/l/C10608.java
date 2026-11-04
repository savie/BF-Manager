package l;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۤۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes4.dex */
public class C10608 extends AbstractC9051 implements InterfaceC10586 {

    /* JADX INFO: renamed from: ᩳܽ۬, reason: not valid java name and contains not printable characters */
    private static final short[] f33674 = {6403, -29155, -18409, -19455, 202, -26865, 32120, -28682, 4595, -9746, -9754, -9737, -9749, -9748, -9753, -9792, -9758, -9747, -9821, -9747, -9748, -9737, -9821, -9755, -9750, -9747, -9753, -9821, -9737, -9749, -9754, -9821, -9746, -9754, -9737, -9749, -9748, -9753, -9799, -9821, 7672, 19321, 19324, 19322, 19318, 19311, 5715, 26709, 24729, -29789, 8319, -24233, -19160, -17550, 377, 13649, -2271, -262, -1909, 15230, 12509, -7709, 6136, 7179, 13092, -7388, -7598, 20127, -4404, 13601, -3275, 28386, 28291, 28389, 28389, 28307, 28294, 28293, 28295, 28315, 28357, 28388, 28390, 28389, 28362, 28313, 28383, 28373, 28374, 28366, 28378, 28369, 28376, 28363, 28365, 28390, 28311, 28371, 28361, 28382, 28371, 28361, 28382, 3954, -2714, -4882, 5411, 23030, 23038, 23023, 23027, 23028, 23039, 7198, 16696, -18499, -17792, 17110, 17399, -18679, 24277, 20308, -22988, 320, 24696, 24695, 24698, 24680, 24680, 24683, 24698, 24687, 24691, 24694, 24702, 24687, 24691, 24692, 24703, 1902, -13361, -13369, -13354, -13366, -13363, -13370, -13428, 5189, 5628, 5619, 5630, 5612, 5612, 5615, 5630, 5611, 5623, 710, -6283, -6275, -6292, -6288, -6281, -6276, 7977, 19480, 21310, 29205};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C20283 f33675;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public View f33676;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public View f33677;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f33678;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C12318 f33679;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f33680;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C17502 f33681;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f33682;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f33683;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f33684;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C20956 f33685;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C22761 f33686;

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ᩵ */
    public final boolean mo1446() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0077 A[PHI: r16
      0x0077: PHI (r16v3 java.lang.String) = (r16v2 java.lang.String), (r16v1 java.lang.String), (r16v1 java.lang.String) binds: [B:21:0x0075, B:10:0x0048, B:7:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0197 A[PHI: r2 r9 r10 r11
      0x0197: PHI (r2v3 char) = (r2v2 char), (r2v1 char), (r2v1 char), (r2v1 char) binds: [B:51:0x0195, B:29:0x00c7, B:25:0x00a6, B:7:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r9v3 short[]) = (r9v1 short[]), (r9v2 short[]), (r9v1 short[]), (r9v1 short[]) binds: [B:51:0x0195, B:29:0x00c7, B:25:0x00a6, B:7:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r10v3 int) = (r10v1 int), (r10v2 int), (r10v1 int), (r10v1 int) binds: [B:51:0x0195, B:29:0x00c7, B:25:0x00a6, B:7:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v2 int), (r11v1 int) binds: [B:51:0x0195, B:29:0x00c7, B:25:0x00a6, B:7:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x01ca A[PHI: r7
      0x01ca: PHI (r7v3 int) = (r7v1 int), (r7v2 int), (r7v1 int) binds: [B:55:0x01c8, B:39:0x0133, B:13:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01f9 A[PHI: r3 r4 r5 r6
      0x01f9: PHI (r3v3 short) = (r3v1 short), (r3v2 short), (r3v1 short) binds: [B:59:0x01f7, B:47:0x0176, B:43:0x0152] A[DONT_GENERATE, DONT_INLINE]
      0x01f9: PHI (r4v3 short) = (r4v1 short), (r4v2 short), (r4v1 short) binds: [B:59:0x01f7, B:47:0x0176, B:43:0x0152] A[DONT_GENERATE, DONT_INLINE]
      0x01f9: PHI (r5v2 int) = (r5v1 int), (r5v1 int), (r5v3 int) binds: [B:59:0x01f7, B:47:0x0176, B:43:0x0152] A[DONT_GENERATE, DONT_INLINE]
      0x01f9: PHI (r6v2 int) = (r6v1 int), (r6v1 int), (r6v3 int) binds: [B:59:0x01f7, B:47:0x0176, B:43:0x0152] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0227 A[PHI: r1
      0x0227: PHI (r1v4 short[]) = (r1v3 short[]), (r1v1 short[]), (r1v1 short[]), (r1v1 short[]) binds: [B:63:0x0225, B:15:0x0057, B:13:0x0053, B:10:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ܳ */
    public final int mo1444() {
        int iM2761;
        int i;
        int i2;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        short[] sArr2 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = -1240154676;
        int i10 = C4282.f15546;
        int i11 = C1564.f5401;
        int iM2762 = (C0619.m2761("ᩴܺ") + i10) * 45;
        int i12 = ((iM2762 ^ i11) * 5639) ^ (-1322335245);
        int i13 = iM2762 ^ (-796587922);
        String strM1785 = null;
        while (true) {
            i9 = i13 ^ (i12 & (((i9 ^ i11) * 25673) >> 31));
            switch (i9) {
                case -2093658027:
                case 1694310358:
                    i3 = s * s2;
                    i4 = s * s;
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0619.m2761("ۘۡ") ^ i10;
                        i = ((iM2761 ^ i11) * 21919) ^ (-779980001);
                        i2 = -914502991;
                    } else {
                        iM2761 = (i11 - C0619.m2761("ۘ۬")) * 27;
                        i = ((iM2761 ^ i10) * 32225) ^ 2095008511;
                        i2 = -1395046901;
                    }
                    int i14 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i14;
                    break;
                case -1758746180:
                case -999383396:
                    i6 = 50071;
                    iM2761 = (C0773.m3169("ۖܶ") ^ i10) * 33;
                    i = ((iM2761 ^ i11) * 13163) ^ 1508140089;
                    i2 = -393645275;
                    int i15 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i15;
                    break;
                case -1590157607:
                case 832524252:
                    i8 = 3;
                    if (C4238.f15451 >= 0) {
                        iM2761 = (i11 - C0773.m3169("ۘۧ")) * (-115);
                        i = ((iM2761 ^ i10) * (-21761)) ^ 1546313213;
                        i2 = -562703440;
                    } else {
                        iM2761 = (C0619.m2761("ۡۗ") + i11) * (-83);
                        i = ((iM2761 ^ i10) * (-27533)) ^ 991352738;
                        i2 = -1292627196;
                    }
                    int i16 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i16;
                    break;
                case -1579218543:
                case 320233590:
                    sArr = f33674;
                    if (C3998.f13671 != 0) {
                        iM2761 = C0619.m2761("ܶ֨") ^ i11;
                        i = ((iM2761 ^ i10) * (-13895)) ^ 104217914;
                        i2 = 773375791;
                    } else {
                        iM2761 = C0619.m2761("ۘ۫") ^ i10;
                        i = ((iM2761 ^ i11) * (-11331)) ^ (-567385726);
                        i2 = 1163952277;
                    }
                    int i17 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i17;
                    break;
                case -1531142861:
                case -225549103:
                    strM1785 = C0269.m1785(sArr2, i7, i8, i6);
                    if (C3690.m11987()) {
                        iM2761 = C0619.m2761("ۘۢ") ^ i11;
                        i = ((iM2761 ^ i10) * 14029) ^ (-2026200624);
                        i2 = -1813860141;
                    } else {
                        iM2761 = (C0773.m3169("᩺᩹") + i10) * (-27);
                        i = ((iM2761 ^ i11) * (-20487)) ^ 1639627845;
                        i2 = -811932388;
                    }
                    int i18 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i18;
                    break;
                case -1512820258:
                case 1388182970:
                    if (C11235.f35427 >= 0) {
                        iM2761 = C0619.m2761("۠ۜ") ^ i10;
                        i = ((iM2761 ^ i11) * 24071) ^ 1086157235;
                        i2 = -1939635066;
                    } else {
                        iM2761 = (i11 - C0619.m2761("᩷۟")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2761 ^ i10) * 17589) ^ (-1439066718);
                        i2 = 1651702101;
                    }
                    int i19 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i19;
                    break;
                case -1463754641:
                case 874193066:
                    C3690.m11987();
                    iM2761 = C0619.m2761("ܶ֨") ^ i11;
                    i = ((iM2761 ^ i10) * (-13895)) ^ 104217914;
                    i2 = 773375791;
                    int i110 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i110;
                    break;
                case -1137662554:
                case 811456484:
                    if (C3077.f9998) {
                        iM2761 = C0619.m2761("ۘۢ") ^ i11;
                        i = ((iM2761 ^ i10) * 14029) ^ (-2026200624);
                        i2 = -1813860141;
                    } else {
                        iM2761 = C0619.m2761("ܶ֨") ^ i11;
                        i = ((iM2761 ^ i10) * (-13895)) ^ 104217914;
                        i2 = 773375791;
                    }
                    int i111 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i111;
                    break;
                case -958896624:
                case 1890495758:
                    if ((i4 + i5) - i3 >= 0) {
                        iM2761 = C0773.m3169("ᩴۧ") ^ i10;
                        i = ((iM2761 ^ i11) * 26147) ^ (-758361543);
                        i2 = 1500743487;
                    } else {
                        iM2761 = C0619.m2761("֫ܽ") ^ i11;
                        i = ((iM2761 ^ i10) * (-14879)) ^ (-911088908);
                        i2 = -306381059;
                    }
                    int i112 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i112;
                    break;
                case -815857917:
                case -304173395:
                    C20932.m47848();
                    if (C2878.m9491() <= 0) {
                        iM2761 = C0619.m2761("ۘۢ") ^ i11;
                        i = ((iM2761 ^ i10) * 14029) ^ (-2026200624);
                        i2 = -1813860141;
                    } else {
                        iM2761 = (i11 - C0773.m3169("ۘۧ")) * (-115);
                        i = ((iM2761 ^ i10) * (-21761)) ^ 1546313213;
                        i2 = -562703440;
                    }
                    int i113 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i113;
                    break;
                case -597763585:
                case 265554698:
                    s = sArr[c];
                    s2 = 4474;
                    if (C3779.m12264()) {
                        iM2761 = C0773.m3169("ۖۜ") ^ i10;
                        i = ((iM2761 ^ i11) * (-25291)) ^ (-697956253);
                        i2 = 1079933445;
                    } else {
                        iM2761 = C0619.m2761("ۘۡ") ^ i10;
                        i = ((iM2761 ^ i11) * 21919) ^ (-779980001);
                        i2 = -914502991;
                    }
                    int i114 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i114;
                    break;
                case -378172822:
                case -368150266:
                    C2485.m8357();
                    if (C2834.m9344() >= 0) {
                        iM2761 = C0619.m2761("ܶ֨") ^ i11;
                        i = ((iM2761 ^ i10) * (-13895)) ^ 104217914;
                        i2 = 773375791;
                    } else {
                        iM2761 = C0619.m2761("۠ۜ") ^ i10;
                        i = ((iM2761 ^ i11) * 24071) ^ 1086157235;
                        i2 = -1939635066;
                    }
                    int i115 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i115;
                    break;
                case -310952096:
                case 1418707886:
                    C3734.m12152();
                    C2287.m7745();
                    return 0;
                case -302278600:
                case 202613666:
                    return C0619.m2761(strM1785) ^ 2117961645;
                case -290955088:
                case 1640227987:
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0619.m2761("ۘۡ") ^ i10;
                        i = ((iM2761 ^ i11) * 21919) ^ (-779980001);
                        i2 = -914502991;
                    } else {
                        iM2761 = C0619.m2761("֨۠") ^ i11;
                        i = ((iM2761 ^ i10) * (-29961)) ^ 1991921686;
                        i2 = -549231019;
                    }
                    int i116 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i116;
                    break;
                case 45148267:
                case 1367775728:
                    sArr2 = f33674;
                    i7 = 165;
                    if (C2288.f7433 <= 0) {
                        iM2761 = (i11 - C0773.m3169("ۘۧ")) * (-115);
                        i = ((iM2761 ^ i10) * (-21761)) ^ 1546313213;
                        i2 = -562703440;
                    } else {
                        iM2761 = C0619.m2761("ۜ᩸") ^ i10;
                        i = ((iM2761 ^ i11) * (-14765)) ^ 175516235;
                        i2 = -2053419312;
                    }
                    int i117 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i117;
                    break;
                case 613071030:
                case 1954002682:
                    c = 164;
                    if (C2966.m9664()) {
                        iM2761 = (C0773.m3169("۟ܺ") + i10) * (-45);
                        i = ((iM2761 ^ i11) * (-5307)) ^ (-1070718726);
                        i2 = -2134590982;
                    } else {
                        iM2761 = (i11 - C0773.m3169("ۘۧ")) * (-115);
                        i = ((iM2761 ^ i10) * (-21761)) ^ 1546313213;
                        i2 = -562703440;
                    }
                    int i118 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i118;
                    break;
                case 934481377:
                case 1093989582:
                    i5 = 5004169;
                    if (C2834.m9344() >= 0) {
                        iM2761 = C0619.m2761("۠ۜ") ^ i10;
                        i = ((iM2761 ^ i11) * 24071) ^ 1086157235;
                        i2 = -1939635066;
                    } else {
                        iM2761 = C0773.m3169("ۚ֫") ^ i11;
                        i = ((iM2761 ^ i10) * 20155) ^ 1723496627;
                        i2 = -1135649358;
                    }
                    int i119 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i119;
                    break;
                default:
                    i6 = 932;
                    iM2761 = (C0773.m3169("ۖܶ") ^ i10) * 33;
                    i = ((iM2761 ^ i11) * 13163) ^ 1508140089;
                    i2 = -393645275;
                    int i1110 = i;
                    i13 = iM2761 ^ i2;
                    i12 = i1110;
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (l.C1519.m5403() != false) goto L12;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m27079(l.C10608 r22, final int r23, float r24, float r25) {
        /*
            Method dump skipped, instruction units count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10608.m27079(l.ۤۘۧ, int, float, float):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00f1 A[PHI: r1 r11
      0x00f1: PHI (r1v49 android.os.Bundle) = (r1v30 android.os.Bundle), (r1v2 android.os.Bundle) binds: [B:34:0x00ef, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r11v4 short[]) = (r11v3 short[]), (r11v2 short[]) binds: [B:34:0x00ef, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x01cf A[PHI: r5 r6 r9 r13 r17
      0x01cf: PHI (r5v4 short) = (r5v3 short), (r5v2 short), (r5v2 short) binds: [B:53:0x01cd, B:45:0x0187, B:26:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r6v4 short) = (r6v3 short), (r6v2 short), (r6v2 short) binds: [B:53:0x01cd, B:45:0x0187, B:26:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:53:0x01cd, B:45:0x0187, B:26:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r13v3 int) = (r13v2 int), (r13v2 int), (r13v4 int) binds: [B:53:0x01cd, B:45:0x0187, B:26:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r17v14 android.os.Bundle) = (r17v5 android.os.Bundle), (r17v7 android.os.Bundle), (r17v15 android.os.Bundle) binds: [B:53:0x01cd, B:45:0x0187, B:26:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0205 A[PHI: r4 r12 r17
      0x0205: PHI (r4v5 char) = (r4v3 char), (r4v2 char), (r4v2 char) binds: [B:57:0x0203, B:30:0x00cc, B:11:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r12v5 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:57:0x0203, B:30:0x00cc, B:11:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r17v24 android.os.Bundle) = (r17v4 android.os.Bundle), (r17v13 android.os.Bundle), (r17v25 android.os.Bundle) binds: [B:57:0x0203, B:30:0x00cc, B:11:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0269 A[PHI: r3 r7 r8 r17
      0x0269: PHI (r3v4 short[]) = (r3v3 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:65:0x0267, B:49:0x01aa, B:10:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0269: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:65:0x0267, B:49:0x01aa, B:10:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0269: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int) binds: [B:65:0x0267, B:49:0x01aa, B:10:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x0269: PHI (r17v20 android.os.Bundle) = (r17v2 android.os.Bundle), (r17v6 android.os.Bundle), (r17v21 android.os.Bundle) binds: [B:65:0x0267, B:49:0x01aa, B:10:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        if (l.C2485.f7950 == 0) goto L10;
     */
    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String mo1443() {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10608.mo1443():java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0258 A[PHI: r2 r3 r5 r8 r16 r17
      0x0258: PHI (r2v4 android.os.Bundle) = (r2v1 android.os.Bundle), (r2v1 android.os.Bundle), (r2v5 android.os.Bundle) binds: [B:61:0x0256, B:53:0x01ef, B:12:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r3v3 short[]) = (r3v2 short[]), (r3v1 short[]), (r3v1 short[]) binds: [B:61:0x0256, B:53:0x01ef, B:12:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r5v3 int) = (r5v1 int), (r5v2 int), (r5v1 int) binds: [B:61:0x0256, B:53:0x01ef, B:12:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r8v4 short[]) = (r8v1 short[]), (r8v1 short[]), (r8v5 short[]) binds: [B:61:0x0256, B:53:0x01ef, B:12:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r16v32 android.os.Bundle) = (r16v7 android.os.Bundle), (r16v9 android.os.Bundle), (r16v33 android.os.Bundle) binds: [B:61:0x0256, B:53:0x01ef, B:12:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x0258: PHI (r17v19 java.lang.String) = (r17v2 java.lang.String), (r17v4 java.lang.String), (r17v20 java.lang.String) binds: [B:61:0x0256, B:53:0x01ef, B:12:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27090(String str, String str2) {
        int i;
        int i2;
        int iM3169;
        String str3;
        int iM31610;
        int i3;
        int i4;
        Bundle bundleRequireArguments;
        int iM31611;
        Bundle bundle;
        int i5;
        int i6;
        Bundle bundle2;
        int iM31612;
        int i7;
        int i8;
        Bundle bundle3 = null;
        String strM28300 = null;
        Bundle bundleRequireArguments2 = null;
        short[] sArr = null;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i11 = 0;
        int i12 = 1167813398;
        int i13 = C3779.f12953;
        int i14 = C23916.f77426;
        int iM31613 = (C0773.m3169("ۡ᩶") + i14) * (-111);
        int i15 = ((iM31613 ^ i13) * 11199) ^ 95374516;
        int i16 = iM31613 ^ (-1145957830);
        while (true) {
            i12 = ((((i12 ^ i13) * (-1517)) >> 31) & i15) ^ i16;
            switch (i12) {
                case -2029836018:
                case 1768236683:
                    i10 = 24603;
                    iM31610 = C0619.m2761("᩺᩵") ^ i13;
                    str3 = strM28300;
                    i3 = ((iM31610 ^ i14) * 19035) ^ (-1607398711);
                    i4 = -1647120277;
                    i16 = iM31610 ^ i4;
                    i15 = i3;
                    bundle3 = bundle3;
                    strM28300 = str3;
                    break;
                case -1889048345:
                case 1465321774:
                    i10 = 38155;
                    iM31610 = C0619.m2761("᩺᩵") ^ i13;
                    str3 = strM28300;
                    i3 = ((iM31610 ^ i14) * 19035) ^ (-1607398711);
                    i4 = -1647120277;
                    i16 = iM31610 ^ i4;
                    i15 = i3;
                    bundle3 = bundle3;
                    strM28300 = str3;
                    break;
                case -1399348904:
                case -1146871681:
                    C2485.m8357();
                    bundle3 = bundle3;
                    str3 = strM28300;
                    iM31610 = (i14 - C0619.m2761("ۘܺ")) * (-53);
                    i3 = ((iM31610 ^ i13) * (-9589)) ^ (-855899479);
                    i4 = 1980801655;
                    i16 = iM31610 ^ i4;
                    i15 = i3;
                    bundle3 = bundle3;
                    strM28300 = str3;
                    break;
                case -1369159440:
                case 49481197:
                    bundle2 = bundle3;
                    strM28300 = C11235.m28300(sArr2, 124, 9, i10);
                    if (C1542.f5343 > 0) {
                        iM31612 = C0773.m3169("۫۬") ^ i13;
                        i7 = ((iM31612 ^ i14) * (-2725)) ^ 318170388;
                        i8 = 1207574174;
                        i16 = iM31612 ^ i8;
                        i15 = i7;
                        bundle3 = bundle2;
                    } else {
                        bundleRequireArguments = bundle2;
                        iM31611 = (i13 - C0619.m2761("ۧۨ")) * 61;
                        bundle = bundleRequireArguments;
                        i5 = ((iM31611 ^ i14) * 26379) ^ (-1292860585);
                        i6 = 511223482;
                        i15 = i5;
                        i16 = iM31611 ^ i6;
                        bundle3 = bundle;
                    }
                    break;
                case -1270225306:
                case -1146658634:
                    m24174((String) null);
                    bundleRequireArguments = requireArguments();
                    if (RunnableC3055.f9898 >= 0) {
                        iM31611 = (i13 - C0619.m2761("ۧۨ")) * 61;
                        bundle = bundleRequireArguments;
                        i5 = ((iM31611 ^ i14) * 26379) ^ (-1292860585);
                        i6 = 511223482;
                    } else {
                        iM31611 = C0773.m3169("᩵֫") ^ i13;
                        bundle = bundleRequireArguments;
                        i5 = ((iM31611 ^ i14) * (-8331)) ^ 108763314;
                        i6 = -52238763;
                    }
                    i15 = i5;
                    i16 = iM31611 ^ i6;
                    bundle3 = bundle;
                    break;
                case -1269870359:
                case -713455947:
                    bundle2 = bundle3;
                    sArr2 = f33674;
                    if (C1783.f6087 > 0) {
                        iM31612 = C0773.m3169("ܽܰ") ^ i14;
                        i7 = ((iM31612 ^ i13) * (-27015)) ^ 1238151686;
                        i8 = 940618216;
                        i16 = iM31612 ^ i8;
                        i15 = i7;
                        bundle3 = bundle2;
                    } else {
                        bundleRequireArguments = bundle2;
                        iM31611 = (i13 - C0619.m2761("ۧۨ")) * 61;
                        bundle = bundleRequireArguments;
                        i5 = ((iM31611 ^ i14) * 26379) ^ (-1292860585);
                        i6 = 511223482;
                        i15 = i5;
                        i16 = iM31611 ^ i6;
                        bundle3 = bundle;
                    }
                    break;
                case -1190281397:
                case 397658252:
                    C1080.m4050();
                    AbstractC0641.m2813();
                    break;
                case -918490349:
                case 918659223:
                    bundle3 = bundle3;
                    str3 = strM28300;
                    i9 = (s * s) + 32524209;
                    if (C2966.f9654 >= 0) {
                        iM31610 = C0773.m3169("ۢ۟") ^ i14;
                        i3 = ((iM31610 ^ i13) * 5745) ^ 1450788159;
                        i4 = 2010029719;
                    } else {
                        iM31610 = C0619.m2761("ܺۙ") ^ i14;
                        i3 = ((iM31610 ^ i13) * 8411) ^ (-1259425605);
                        i4 = -311143029;
                    }
                    i16 = iM31610 ^ i4;
                    i15 = i3;
                    bundle3 = bundle3;
                    strM28300 = str3;
                    break;
                case -860569535:
                case -256618106:
                    bundle3 = bundle3;
                    str3 = strM28300;
                    if (C0862.m3503()) {
                        iM31610 = C0773.m3169("ۤܶ") ^ i13;
                        i3 = ((iM31610 ^ i14) * 6207) ^ (-904865559);
                        i4 = 1375228872;
                    } else {
                        iM31610 = C0773.m3169("ۨܳ") ^ i13;
                        i3 = ((iM31610 ^ i14) * 26693) ^ (-706159482);
                        i4 = 965594365;
                    }
                    i16 = iM31610 ^ i4;
                    i15 = i3;
                    bundle3 = bundle3;
                    strM28300 = str3;
                    break;
                case -706447157:
                case 2019612204:
                    bundle3 = bundle3;
                    str3 = strM28300;
                    if (C1080.f3865 < 0) {
                        iM31610 = C0773.m3169("᩸ۧ") ^ i14;
                        i3 = ((iM31610 ^ i13) * 3817) ^ 823653304;
                        i4 = 1076970000;
                        i16 = iM31610 ^ i4;
                        i15 = i3;
                        bundle3 = bundle3;
                        strM28300 = str3;
                    } else {
                        bundleRequireArguments = bundle3;
                        strM28300 = str3;
                        iM31611 = (i13 - C0619.m2761("ۧۨ")) * 61;
                        bundle = bundleRequireArguments;
                        i5 = ((iM31611 ^ i14) * 26379) ^ (-1292860585);
                        i6 = 511223482;
                        i15 = i5;
                        i16 = iM31611 ^ i6;
                        bundle3 = bundle;
                    }
                    break;
                case -677912382:
                case 1273651420:
                    bundle3 = bundle3;
                    str3 = strM28300;
                    if (i9 - (s * 11406) >= 0) {
                        iM31610 = (i13 - C0773.m3169("ۜۡ")) * (-19);
                        i3 = ((iM31610 ^ i14) * (-16093)) ^ (-1395952956);
                        i4 = -2136699562;
                    } else {
                        iM31610 = (C0773.m3169("ۧᩴ") ^ i14) * (-49);
                        i3 = ((iM31610 ^ i13) * (-9725)) ^ (-1732886912);
                        i4 = -314927653;
                    }
                    i16 = iM31610 ^ i4;
                    i15 = i3;
                    bundle3 = bundle3;
                    strM28300 = str3;
                    break;
                case -430696122:
                case 1851955913:
                    C2834.m9349(bundle3, strM28300, str);
                    bundleRequireArguments2 = requireArguments();
                    sArr3 = f33674;
                    if (C0487.f2131 > 0) {
                        int iM2761 = C0619.m2761("۟᩷") ^ i14;
                        bundle2 = bundle3;
                        i15 = ((iM2761 ^ i13) * 8581) ^ 1834229609;
                        i16 = iM2761 ^ 857031054;
                        bundle3 = bundle2;
                    } else {
                        bundle3 = bundle3;
                        str3 = strM28300;
                        iM31610 = C0773.m3169("ۢ۟") ^ i14;
                        i3 = ((iM31610 ^ i13) * 5745) ^ 1450788159;
                        i4 = 2010029719;
                        i16 = iM31610 ^ i4;
                        i15 = i3;
                        bundle3 = bundle3;
                        strM28300 = str3;
                    }
                    break;
                case -144701701:
                case 1065254545:
                    if (C1343.f4799 != 0) {
                        bundle3 = bundle3;
                        str3 = strM28300;
                        iM31610 = C0773.m3169("ۢ۟") ^ i14;
                        i3 = ((iM31610 ^ i13) * 5745) ^ 1450788159;
                        i4 = 2010029719;
                        i16 = iM31610 ^ i4;
                        i15 = i3;
                        bundle3 = bundle3;
                        strM28300 = str3;
                    }
                    bundle3 = bundle3;
                    str3 = strM28300;
                    iM31610 = C0773.m3169("ۨܳ") ^ i13;
                    i3 = ((iM31610 ^ i14) * 26693) ^ (-706159482);
                    i4 = 965594365;
                    i16 = iM31610 ^ i4;
                    i15 = i3;
                    bundle3 = bundle3;
                    strM28300 = str3;
                    break;
                case 14188086:
                case 2060528361:
                    bundle3 = bundle3;
                    str3 = strM28300;
                    sArr = f33674;
                    if (C1321.f4751 >= 0) {
                        iM31610 = C0773.m3169("ۢ۟") ^ i14;
                        i3 = ((iM31610 ^ i13) * 5745) ^ 1450788159;
                        i4 = 2010029719;
                    } else {
                        iM31610 = (C0773.m3169("֡ۜ") ^ i14) * (-101);
                        i3 = ((iM31610 ^ i13) * (-18249)) ^ (-897618302);
                        i4 = -750122617;
                    }
                    i16 = iM31610 ^ i4;
                    i15 = i3;
                    bundle3 = bundle3;
                    strM28300 = str3;
                    break;
                case 167181664:
                case 1935516465:
                    i11 = 133;
                    if (C3077.f9998) {
                        iM3169 = (i13 - C0619.m2761("ۤܳ")) * (-83);
                        i2 = ((iM3169 ^ i14) * 7685) ^ (-205113811);
                        i = -494680803;
                    } else {
                        iM3169 = (C0773.m3169("ܽᩴ") ^ i14) * (-39);
                        i2 = ((iM3169 ^ i13) * (-3607)) ^ (-791476512);
                        i = -1124788378;
                    }
                    i16 = iM3169 ^ i;
                    i15 = i2;
                    break;
                case 269830272:
                case 1441087057:
                    C0487.m2356();
                    if (C0773.f2792 > 0) {
                        iM3169 = (C0773.m3169("ܽᩴ") ^ i14) * (-39);
                        i2 = ((iM3169 ^ i13) * (-3607)) ^ (-791476512);
                        i = -1124788378;
                        i16 = iM3169 ^ i;
                        i15 = i2;
                    } else {
                        bundle3 = bundle3;
                        str3 = strM28300;
                        iM31610 = (i14 - C0619.m2761("ۘܺ")) * (-53);
                        i3 = ((iM31610 ^ i13) * (-9589)) ^ (-855899479);
                        i4 = 1980801655;
                        i16 = iM31610 ^ i4;
                        i15 = i3;
                        bundle3 = bundle3;
                        strM28300 = str3;
                    }
                    break;
                case 392165528:
                case 634862421:
                    bundle3 = bundle3;
                    str3 = strM28300;
                    s = sArr[123];
                    if (C20932.f66974 <= 0) {
                        iM31610 = (i14 - C0619.m2761("ۘܺ")) * (-53);
                        i3 = ((iM31610 ^ i13) * (-9589)) ^ (-855899479);
                        i4 = 1980801655;
                    } else {
                        iM31610 = (C0619.m2761("۠ܰ") ^ i13) * 29;
                        i3 = ((iM31610 ^ i14) * 16605) ^ (-2111892420);
                        i4 = -2138653671;
                    }
                    i16 = iM31610 ^ i4;
                    i15 = i3;
                    bundle3 = bundle3;
                    strM28300 = str3;
                    break;
                case 1251883754:
                case 1633775494:
                    C3448.m11250(bundleRequireArguments2, C4282.m13650(sArr3, i11, 6, i10), str2);
                    break;
                default:
                    if (C1080.f3865 < 0) {
                        bundle3 = bundle3;
                        str3 = strM28300;
                        iM31610 = C0773.m3169("ۨܳ") ^ i13;
                        i3 = ((iM31610 ^ i14) * 26693) ^ (-706159482);
                        i4 = 965594365;
                        i16 = iM31610 ^ i4;
                        i15 = i3;
                        bundle3 = bundle3;
                        strM28300 = str3;
                    } else {
                        iM3169 = (C0773.m3169("ܽᩴ") ^ i14) * (-39);
                        i2 = ((iM3169 ^ i13) * (-3607)) ^ (-791476512);
                        i = -1124788378;
                        i16 = iM3169 ^ i;
                        i15 = i2;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27075(C10608 c10608, String str) {
        ActivityC0848 activityC0848 = null;
        int i = 1423621842;
        int i2 = C2966.f9654;
        int i3 = C2287.f7432;
        int iM2761 = C0619.m2761("۟۫") ^ i2;
        int i4 = ((iM2761 ^ i3) * (-95)) ^ (-1521492322);
        int i5 = 861862498;
        while (true) {
            i = ((((i ^ i3) * 21877) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2096533477:
                case -220930082:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0619.m2761("ۨ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20463) ^ (-1059773697);
                        i5 = -609121377;
                    } else {
                        iM2761 = (C0773.m3169("֡ۗ") ^ i3) * (-19);
                        i4 = ((iM2761 ^ i2) * (-6745)) ^ (-1796353491);
                        i5 = -1639615098;
                    }
                    break;
                case -2074573642:
                case 1967918238:
                    if (C0487.f2131 <= 0) {
                        iM2761 = (C0773.m3169("ۡ᩶") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2761 ^ i3) * 9349) ^ (-1504118051);
                        i5 = -1727639359;
                    } else {
                        iM2761 = (C0773.m3169("ۢۚ") + i3) * 9;
                        i4 = ((iM2761 ^ i2) * 27499) ^ 1525319019;
                        i5 = 64306258;
                    }
                    break;
                case -1883075858:
                case 1411267400:
                    if (C3033.m9845() <= 0) {
                        iM2761 = (C0773.m3169("ۡ᩶") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2761 ^ i3) * 9349) ^ (-1504118051);
                        i5 = -1727639359;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۖܳ")) * (-125);
                        i4 = ((iM2761 ^ i2) * (-141)) ^ 984516363;
                        i5 = -415190112;
                    }
                    break;
                case -1835866671:
                case 1532967430:
                    if (C0619.f2439) {
                        iM2761 = C0773.m3169("ۢ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14495)) ^ 690332437;
                        i5 = -682153496;
                    } else {
                        iM2761 = C0773.m3169("֫۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * 21501) ^ 1913373289;
                        i5 = 962582851;
                    }
                    break;
                case -1818074780:
                case -1231636662:
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0619.m2761("֨ܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-24753)) ^ 1258857796;
                        i5 = 1956441667;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ᩳۢ")) * (-65);
                        i4 = ((iM2761 ^ i3) * (-32205)) ^ (-1734527502);
                        i5 = 2008720865;
                    }
                    break;
                case -1770376467:
                case -1032083551:
                    if (C1564.m5509() > 0) {
                        C2834.m9339(new C8962(c10608, activityC0848, str));
                        iM2761 = C0773.m3169("᩵ܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 23295) ^ (-1940975387);
                        i5 = 1221564851;
                    } else {
                        iM2761 = C0619.m2761("ۨ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * 20463) ^ (-1059773697);
                        i5 = -609121377;
                    }
                    break;
                case -1539266015:
                case 1082604535:
                    if (C2878.f9462) {
                        iM2761 = (i3 - C0619.m2761("ۛۗ")) * (-27);
                        i4 = ((iM2761 ^ i2) * (-29129)) ^ 1343493493;
                        i5 = -1036875853;
                    } else {
                        iM2761 = (C0773.m3169("ܽۛ") ^ i2) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2761 ^ i3) * 9843) ^ (-2097383804);
                        i5 = 804420915;
                    }
                    break;
                case -1374371991:
                case -1079250830:
                    if (!RunnableC0334.m2063()) {
                        iM2761 = C0619.m2761("֨ܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-24753)) ^ 1258857796;
                        i5 = 1956441667;
                    } else {
                        iM2761 = C0773.m3169("ۢ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14495)) ^ 690332437;
                        i5 = -682153496;
                    }
                    break;
                case -1371413427:
                case 852904757:
                    if (C3779.m12264()) {
                        iM2761 = (C0773.m3169("ܽܽ") + i3) * 53;
                        i4 = ((iM2761 ^ i2) * 1369) ^ 1404327513;
                        i5 = 394350124;
                    } else {
                        iM2761 = C0619.m2761("֨ܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-24753)) ^ 1258857796;
                        i5 = 1956441667;
                    }
                    break;
                case -1358167140:
                case 1736502721:
                    activityC0848 = (ActivityC0848) AbstractC0116.m1234(c10608);
                    if (C2485.m8357() <= 0) {
                        iM2761 = C0619.m2761("֨ܳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-24753)) ^ 1258857796;
                        i5 = 1956441667;
                    } else {
                        iM2761 = C0619.m2761("᩶᩷") ^ i3;
                        i4 = ((iM2761 ^ i2) * 23451) ^ (-768527387);
                        i5 = 376365605;
                    }
                    break;
                case -1211037537:
                case -707565798:
                    break;
                case -778422145:
                case -268123895:
                    if (c10608.f33681 != null) {
                        iM2761 = (i2 - C0773.m3169("ۡ᩸")) * (-57);
                        i4 = ((iM2761 ^ i3) * 18671) ^ 1180027790;
                        i5 = 1671608981;
                    } else {
                        iM2761 = C0773.m3169("᩵ܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 23295) ^ (-1940975387);
                        i5 = 1221564851;
                    }
                    break;
                case -742312736:
                case 1819942381:
                    if (c10608.f33678) {
                        iM2761 = C0773.m3169("᩺ۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-28633)) ^ 1393067397;
                        i5 = 1368301033;
                    } else {
                        iM2761 = C0773.m3169("᩵ܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 23295) ^ (-1940975387);
                        i5 = 1221564851;
                    }
                    break;
                case -536694155:
                case 1925266696:
                    if (C2023.f6737) {
                        iM2761 = C0773.m3169("ۢ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14495)) ^ 690332437;
                        i5 = -682153496;
                    } else {
                        iM2761 = C0619.m2761("ۢۙ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-20937)) ^ 1520082173;
                        i5 = -922672452;
                    }
                    break;
                case -141320975:
                case 1446524719:
                    C2702.m8876();
                    break;
                case 1463834674:
                case 1851217758:
                    C4238.m13540();
                    iM2761 = (C0773.m3169("ۡ᩶") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i4 = ((iM2761 ^ i3) * 9349) ^ (-1504118051);
                    i5 = -1727639359;
                    break;
                case 1537664283:
                case 1551964077:
                    if (C2966.f9654 >= 0) {
                        iM2761 = (i3 - C0619.m2761("ۛۗ")) * (-27);
                        i4 = ((iM2761 ^ i2) * (-29129)) ^ 1343493493;
                        i5 = -1036875853;
                    } else {
                        iM2761 = C0773.m3169("ۢ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14495)) ^ 690332437;
                        i5 = -682153496;
                    }
                    break;
                default:
                    C2310.m7813();
                    if (C2485.f7950 == 0) {
                        iM2761 = C0773.m3169("ۢ᩵") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14495)) ^ 690332437;
                        i5 = -682153496;
                    } else {
                        iM2761 = (C0773.m3169("ۡ᩶") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((iM2761 ^ i3) * 9349) ^ (-1504118051);
                        i5 = -1727639359;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C10608() {
        boolean z = false;
        int i = -758209683;
        int i2 = C2288.f7433;
        int i3 = C2966.f9654;
        short s = f33674[0];
        int i4 = s + 18162;
        int i5 = (s * s) + 329858244;
        super(C0619.m2761(RunnableC3055.m9937(f33674, 1, 3, (i4 * i4) - (i5 + i5) > 0 ? 37652 : 57179)) ^ 2117272860);
        int iM3169 = C0773.m3169("ۚۗ") ^ i3;
        int i6 = ((iM3169 ^ i2) * 675) ^ 1698445501;
        int i7 = 603529335;
        while (true) {
            i = ((((i ^ i2) * 18819) >> 31) & i6) ^ (iM3169 ^ i7);
            switch (i) {
                case -2093856147:
                case 770359254:
                    if (C3492.m11488()) {
                        iM3169 = C0773.m3169("ܳ᩶") ^ i2;
                        i6 = ((iM3169 ^ i3) * (-21821)) ^ 917126173;
                        i7 = -1726551058;
                    } else {
                        iM3169 = (C0619.m2761("᩻ۧ") + i2) * 101;
                        i6 = ((iM3169 ^ i3) * 26649) ^ 1494360557;
                        i7 = 2039940273;
                    }
                    break;
                case -2083233648:
                case -1358775675:
                    if (C1542.m5459() >= 0) {
                        iM3169 = (C0619.m2761("᩻ۧ") + i2) * 101;
                        i6 = ((iM3169 ^ i3) * 26649) ^ 1494360557;
                        i7 = 2039940273;
                    } else {
                        iM3169 = C0619.m2761("ᩴ֨") ^ i2;
                        i6 = ((iM3169 ^ i3) * 9787) ^ (-1770597163);
                        i7 = -1302675000;
                    }
                    break;
                case -1773015875:
                case -499615440:
                    C3033.m9845();
                    if (C1564.f5401 > 0) {
                        iM3169 = (C0619.m2761("᩻ۧ") + i2) * 101;
                        i6 = ((iM3169 ^ i3) * 26649) ^ 1494360557;
                        i7 = 2039940273;
                    } else {
                        iM3169 = (C0619.m2761("ۚܰ") + i3) * (-51);
                        i6 = ((iM3169 ^ i2) * 21441) ^ (-1370167509);
                        i7 = -1783348850;
                    }
                    break;
                case -1092206967:
                case -213582083:
                    z = true;
                    if (C20932.m47848() != 0) {
                        iM3169 = (C0619.m2761("ᩳᩳ") ^ i3) * (-105);
                        i6 = ((iM3169 ^ i2) * (-3497)) ^ (-1251233929);
                        i7 = -15362793;
                    } else {
                        iM3169 = C0619.m2761("᩸ۡ") ^ i2;
                        i6 = ((iM3169 ^ i3) * (-19563)) ^ (-1231937911);
                        i7 = 876879781;
                    }
                    break;
                case -1047139499:
                case 1821234655:
                    if (C20932.f66974 <= 0) {
                        iM3169 = (C0619.m2761("ᩳᩳ") ^ i3) * (-105);
                        i6 = ((iM3169 ^ i2) * (-3497)) ^ (-1251233929);
                        i7 = -15362793;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ܳܺ")) * (-47);
                        i6 = ((iM3169 ^ i3) * 25747) ^ 333178823;
                        i7 = -432451463;
                    }
                    break;
                case -842418854:
                case -804528351:
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0619.m2761("ܺۘ") + i3) * (-115);
                        i6 = ((iM3169 ^ i2) * 24789) ^ (-1136050627);
                        i7 = -2006316387;
                    } else {
                        iM3169 = C0773.m3169("ۢ۠") ^ i3;
                        i6 = ((iM3169 ^ i2) * 6701) ^ 367557802;
                        i7 = 1552609960;
                    }
                    break;
                case -465669663:
                case 1998559743:
                    if (C1146.m4231()) {
                        iM3169 = (C0619.m2761("ۤܰ") + i3) * (-127);
                        i6 = ((iM3169 ^ i2) * 4245) ^ 1595713360;
                        i7 = 1356165329;
                    } else {
                        iM3169 = (C0619.m2761("᩻ۧ") + i2) * 101;
                        i6 = ((iM3169 ^ i3) * 26649) ^ 1494360557;
                        i7 = 2039940273;
                    }
                    break;
                case -79416048:
                case 1568360570:
                    if (C2288.f7433 <= 0) {
                        iM3169 = (C0619.m2761("᩻ۧ") + i2) * 101;
                        i6 = ((iM3169 ^ i3) * 26649) ^ 1494360557;
                        i7 = 2039940273;
                    } else {
                        iM3169 = (C0773.m3169("ܰۨ") + i3) * (-49);
                        i6 = ((iM3169 ^ i2) * 615) ^ 1222582938;
                        i7 = -481108475;
                    }
                    break;
                case -756851:
                case 1885286194:
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0619.m2761("ܿۗ") ^ i2) * (-9);
                        i6 = ((iM3169 ^ i3) * (-32107)) ^ 1401176228;
                        i7 = -2082470967;
                    } else {
                        iM3169 = (C0619.m2761("᩻ۧ") + i2) * 101;
                        i6 = ((iM3169 ^ i3) * 26649) ^ 1494360557;
                        i7 = 2039940273;
                    }
                    break;
                case 30575835:
                case 1444217745:
                    if (C3492.f12043 <= 0) {
                        iM3169 = (C0619.m2761("ᩳᩳ") ^ i3) * (-105);
                        i6 = ((iM3169 ^ i2) * (-3497)) ^ (-1251233929);
                        i7 = -15362793;
                    } else {
                        iM3169 = C0619.m2761("۟۬") ^ i3;
                        i6 = ((iM3169 ^ i2) * (-4401)) ^ (-1840859677);
                        i7 = 2032234447;
                    }
                    break;
                case 150420858:
                case 1007306222:
                    C1080.m4050();
                    if (C2419.f7754 >= 0) {
                        iM3169 = (C0619.m2761("ܺۘ") + i3) * (-115);
                        i6 = ((iM3169 ^ i2) * 24789) ^ (-1136050627);
                        i7 = -2006316387;
                    } else {
                        iM3169 = (C0619.m2761("᩻ۧ") + i2) * 101;
                        i6 = ((iM3169 ^ i3) * 26649) ^ 1494360557;
                        i7 = 2039940273;
                    }
                    break;
                case 267252592:
                case 474068978:
                    if (C3734.m12152() >= 0) {
                        iM3169 = (C0619.m2761("ܿۗ") ^ i2) * (-9);
                        i6 = ((iM3169 ^ i3) * (-32107)) ^ 1401176228;
                        i7 = -2082470967;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ܺᩳ")) * 9;
                        i6 = ((iM3169 ^ i2) * (-9395)) ^ 1227081934;
                        i7 = 96552202;
                    }
                    break;
                case 355222191:
                case 1791627367:
                    setHasOptionsMenu(z);
                    return;
                case 667654859:
                case 1392094200:
                    C2375.m8065();
                    C2878.m9491();
                    iM3169 = (C0619.m2761("᩻ۧ") + i2) * 101;
                    i6 = ((iM3169 ^ i3) * 26649) ^ 1494360557;
                    i7 = 2039940273;
                    break;
                case 979957556:
                case 1545219038:
                    if (C3077.f9998) {
                        iM3169 = C0619.m2761("۠᩵") ^ i2;
                        i6 = ((iM3169 ^ i3) * (-13901)) ^ 1539978250;
                        i7 = -513768795;
                    } else {
                        iM3169 = (C0619.m2761("ܺۘ") + i3) * (-115);
                        i6 = ((iM3169 ^ i2) * 24789) ^ (-1136050627);
                        i7 = -2006316387;
                    }
                    break;
                default:
                    AbstractC0641.m2813();
                    C2878.m9491();
                    throw new RuntimeException();
            }
        }
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ܺ */
    public final String mo1445() {
        return mo1440();
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01f4 A[PHI: r1 r3
      0x01f4: PHI (r1v5 short[]) = (r1v2 short[]), (r1v2 short[]), (r1v2 short[]), (r1v4 short[]), (r1v2 short[]), (r1v2 short[]) binds: [B:58:0x01f2, B:54:0x01d1, B:50:0x01b0, B:46:0x0191, B:38:0x0135, B:17:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x01f4: PHI (r3v5 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r3v2 int), (r3v4 int), (r3v2 int) binds: [B:58:0x01f2, B:54:0x01d1, B:50:0x01b0, B:46:0x0191, B:38:0x0135, B:17:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0255 A[PHI: r0 r5 r6 r7
      0x0255: PHI (r0v6 java.lang.String) = (r0v2 java.lang.String), (r0v2 java.lang.String), (r0v5 java.lang.String), (r0v2 java.lang.String) binds: [B:66:0x0253, B:28:0x00c0, B:24:0x0098, B:9:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r5v4 short[]) = (r5v2 short[]), (r5v3 short[]), (r5v2 short[]), (r5v2 short[]) binds: [B:66:0x0253, B:28:0x00c0, B:24:0x0098, B:9:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:66:0x0253, B:28:0x00c0, B:24:0x0098, B:9:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0255: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:66:0x0253, B:28:0x00c0, B:24:0x0098, B:9:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
    
        if (l.C3492.m11488() == false) goto L13;
     */
    @Override // l.ComponentCallbacksC11612
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreateOptionsMenu(android.view.Menu r17, android.view.MenuInflater r18) {
        /*
            Method dump skipped, instruction units count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10608.onCreateOptionsMenu(android.view.Menu, android.view.MenuInflater):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27076(C10608 c10608, C20283 c20283) {
        int i = 1115070142;
        int i2 = C3492.f12043;
        int i3 = C20932.f66974;
        int iM2761 = (i3 - C0619.m2761("۬ܶ")) * 15;
        int i4 = ((iM2761 ^ i2) * (-1309)) ^ (-981739016);
        int i5 = 2092879270;
        while (true) {
            i = ((((i ^ i2) * 10071) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2053169379:
                case 43523160:
                    c10608.f33675 = c20283;
                    if (c10608.f33678) {
                        iM2761 = C0619.m2761("ܳᩳ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-26117)) ^ 407061571;
                        i5 = 1277566361;
                    } else {
                        iM2761 = C0773.m3169("۬ۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-29779)) ^ (-436679376);
                        i5 = -2145624688;
                    }
                    break;
                case -1776659682:
                case 2008500276:
                    C0773.m3161();
                    iM2761 = C0773.m3169("۠ۙ") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-29173)) ^ (-943766150);
                    i5 = -322615845;
                    break;
                case -1764701610:
                case 1677715327:
                    if (AbstractC0116.f1064 <= 0) {
                        iM2761 = C0773.m3169("۠ۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-29173)) ^ (-943766150);
                        i5 = -322615845;
                    } else {
                        iM2761 = (C0619.m2761("۫֫") + i3) * 123;
                        i4 = ((iM2761 ^ i2) * (-11917)) ^ (-177221440);
                        i5 = -1024120284;
                    }
                    break;
                case -1551703758:
                case 1098231106:
                    if (C17202.m40372()) {
                        iM2761 = C0619.m2761("ۘ۟") ^ i3;
                        i4 = ((iM2761 ^ i2) * 22341) ^ (-940525763);
                        i5 = -1648546492;
                    } else {
                        iM2761 = (C0619.m2761("ܰ᩹") ^ i3) * 55;
                        i4 = ((iM2761 ^ i2) * 28435) ^ (-2068486892);
                        i5 = -2052108515;
                    }
                    break;
                case -1527293675:
                case -1429190530:
                    break;
                case -1481808263:
                case 1123137871:
                    C3492.m11488();
                    if (!C17202.f56030) {
                        iM2761 = (C0773.m3169("ۙۛ") + i2) * 65;
                        i4 = ((iM2761 ^ i3) * 23091) ^ 809064448;
                        i5 = -2016468555;
                    } else {
                        iM2761 = C0773.m3169("۠ۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-29173)) ^ (-943766150);
                        i5 = -322615845;
                    }
                    break;
                case -1267597879:
                case -1002608646:
                    if (C11235.f35427 < 0) {
                        iM2761 = (C0773.m3169("۬ۡ") ^ i2) * (-7);
                        i4 = ((iM2761 ^ i3) * 7419) ^ (-488874885);
                        i5 = 1133967194;
                    } else {
                        iM2761 = (C0619.m2761("ۚ۠") ^ i3) * 119;
                        i4 = ((iM2761 ^ i2) * (-8455)) ^ 2129785658;
                        i5 = -1507027222;
                    }
                    break;
                case -1217315130:
                case 603624908:
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0773.m3169("۠ۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-29173)) ^ (-943766150);
                        i5 = -322615845;
                    } else {
                        iM2761 = C0773.m3169("ܶۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 4181) ^ 1209650668;
                        i5 = 291235896;
                    }
                    break;
                case -1161188014:
                case 1329230133:
                    if (C2375.m8065() <= 0) {
                        iM2761 = C0773.m3169("۠ۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-29173)) ^ (-943766150);
                        i5 = -322615845;
                    } else {
                        iM2761 = (i2 - C0619.m2761("ܺ᩷")) * 123;
                        i4 = ((iM2761 ^ i3) * 16513) ^ 1974425506;
                        i5 = -1332487237;
                    }
                    break;
                case -996420972:
                case -385036581:
                    if (C1783.f6087 <= 0) {
                        iM2761 = (C0619.m2761("ܰ᩹") ^ i3) * 55;
                        i4 = ((iM2761 ^ i2) * 28435) ^ (-2068486892);
                        i5 = -2052108515;
                    } else {
                        iM2761 = C0773.m3169("ܿۢ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 3195) ^ (-1197139152);
                        i5 = -1771477929;
                    }
                    break;
                case -972466521:
                case 1613988122:
                    C2966.m9664();
                    C0269.m1775();
                    break;
                case -954356009:
                case 1607497968:
                    C3448.m11245(new C7471(c10608));
                    break;
                case -517236599:
                case 44929687:
                    if (C1321.m4852()) {
                        iM2761 = (C0619.m2761("֫ۜ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i2) * 17921) ^ (-844612546);
                        i5 = -674934088;
                    } else {
                        iM2761 = (C0773.m3169("ۙۛ") + i2) * 65;
                        i4 = ((iM2761 ^ i3) * 23091) ^ 809064448;
                        i5 = -2016468555;
                    }
                    break;
                case -61275108:
                case 664215871:
                    if (C3099.f10023 <= 0) {
                        iM2761 = (C0773.m3169("۬ۡ") ^ i2) * (-7);
                        i4 = ((iM2761 ^ i3) * 7419) ^ (-488874885);
                        i5 = 1133967194;
                    } else {
                        iM2761 = C0619.m2761("ܽ᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * 25079) ^ (-1858992950);
                        i5 = 1384368977;
                    }
                    break;
                case 919941993:
                case 1379610979:
                    if (RunnableC3646.f12471) {
                        iM2761 = (C0619.m2761("ܰ᩹") ^ i3) * 55;
                        i4 = ((iM2761 ^ i2) * 28435) ^ (-2068486892);
                        i5 = -2052108515;
                    } else {
                        iM2761 = (C0773.m3169("᩺ᩴ") ^ i3) * (-7);
                        i4 = ((iM2761 ^ i2) * (-17131)) ^ 203689025;
                        i5 = -1687602958;
                    }
                    break;
                case 936559750:
                case 2126689470:
                    if (RunnableC3055.f9898 < 0) {
                        iM2761 = (C0619.m2761("ۚ۠") ^ i3) * 119;
                        i4 = ((iM2761 ^ i2) * (-8455)) ^ 2129785658;
                        i5 = -1507027222;
                    } else {
                        iM2761 = (C0773.m3169("ۙۛ") + i2) * 65;
                        i4 = ((iM2761 ^ i3) * 23091) ^ 809064448;
                        i5 = -2016468555;
                    }
                    break;
                case 1213759567:
                case 1511711884:
                    if (C3492.m11488()) {
                        iM2761 = (C0773.m3169("᩹ۘ") + i3) * 79;
                        i4 = ((iM2761 ^ i2) * 17319) ^ (-922035812);
                        i5 = -223678552;
                    } else {
                        iM2761 = (C0773.m3169("ۙۛ") + i2) * 65;
                        i4 = ((iM2761 ^ i3) * 23091) ^ 809064448;
                        i5 = -2016468555;
                    }
                    break;
                default:
                    if (C3099.m10095()) {
                        iM2761 = C0773.m3169("۠ۙ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-29173)) ^ (-943766150);
                        i5 = -322615845;
                    } else {
                        iM2761 = C0619.m2761("۫ܿ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 4215) ^ (-1208316063);
                        i5 = -2061071573;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01b4 A[PHI: r5 r6 r7 r12 r16
      0x01b4: PHI (r5v4 int) = (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:52:0x01b2, B:48:0x0194, B:25:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r6v4 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:52:0x01b2, B:48:0x0194, B:25:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:52:0x01b2, B:48:0x0194, B:25:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v4 int) binds: [B:52:0x01b2, B:48:0x0194, B:25:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r16v14 int) = (r16v5 int), (r16v6 int), (r16v15 int) binds: [B:52:0x01b2, B:48:0x0194, B:25:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x021f A[PHI: r3 r4 r8 r16
      0x021f: PHI (r3v4 char) = (r3v3 char), (r3v2 char), (r3v2 char), (r3v2 char), (r3v2 char), (r3v2 char), (r3v2 char) binds: [B:60:0x0206, B:56:0x01e6, B:44:0x0170, B:19:0x0090, B:16:0x0077, B:13:0x006f, B:6:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r4v4 short) = (r4v2 short), (r4v3 short), (r4v2 short), (r4v2 short), (r4v2 short), (r4v2 short), (r4v2 short) binds: [B:60:0x0206, B:56:0x01e6, B:44:0x0170, B:19:0x0090, B:16:0x0077, B:13:0x006f, B:6:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:60:0x0206, B:56:0x01e6, B:44:0x0170, B:19:0x0090, B:16:0x0077, B:13:0x006f, B:6:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x021f: PHI (r16v23 int) = (r16v3 int), (r16v4 int), (r16v7 int), (r16v16 int), (r16v17 int), (r16v19 int), (r16v26 int) binds: [B:60:0x0206, B:56:0x01e6, B:44:0x0170, B:19:0x0090, B:16:0x0077, B:13:0x006f, B:6:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0254 A[PHI: r1 r2 r10 r11 r16
      0x0254: PHI (r1v4 android.os.Bundle) = (r1v2 android.os.Bundle), (r1v3 android.os.Bundle), (r1v2 android.os.Bundle), (r1v2 android.os.Bundle) binds: [B:66:0x0252, B:33:0x00f6, B:29:0x00d1, B:13:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r2v4 short[]) = (r2v3 short[]), (r2v2 short[]), (r2v2 short[]), (r2v2 short[]) binds: [B:66:0x0252, B:33:0x00f6, B:29:0x00d1, B:13:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r10v4 short[]) = (r10v2 short[]), (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:66:0x0252, B:33:0x00f6, B:29:0x00d1, B:13:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:66:0x0252, B:33:0x00f6, B:29:0x00d1, B:13:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r16v18 int) = (r16v2 int), (r16v12 int), (r16v13 int), (r16v19 int) binds: [B:66:0x0252, B:33:0x00f6, B:29:0x00d1, B:13:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String m27091() {
        int iM2761;
        int i;
        int i2;
        int i3 = C2419.f7754;
        int i4 = C1146.f4234;
        int iM2762 = C0619.m2761("۫᩷") ^ i3;
        int i5 = ((iM2762 ^ i4) * 16965) ^ 939569211;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2762 ^ (-1421334720);
        Bundle bundleRequireArguments = null;
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -960105950;
        while (true) {
            int i14 = i6 ^ (i5 & (((i13 ^ i4) * (-14409)) >> 31));
            switch (i14) {
                case -1978944505:
                case 199036783:
                    if (C3077.f9998) {
                        iM2761 = C0773.m3169("ۨۤ") ^ i4;
                        i14 = i14;
                        i = ((iM2761 ^ i3) * 15833) ^ (-1606240388);
                        i2 = -1087934952;
                    } else {
                        i14 = i14;
                        iM2761 = C0619.m2761("᩷ۧ") ^ i3;
                        i = ((iM2761 ^ i4) * 30025) ^ (-1439422130);
                        i2 = 1780273837;
                    }
                    int i15 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    i13 = i15;
                    break;
                case -1971859995:
                case -929706589:
                    i14 = i14;
                    s = sArr[c];
                    if (RunnableC3055.f9898 >= 0) {
                        iM2761 = (i4 - C0773.m3169("ۙܳ")) * (-5);
                        i = ((iM2761 ^ i3) * 14499) ^ 2047401403;
                        i2 = -126153934;
                    } else {
                        iM2761 = (C0619.m2761("᩹ۘ") ^ i4) * 53;
                        i = ((iM2761 ^ i3) * 23341) ^ 1373602579;
                        i2 = 1078638819;
                    }
                    int i16 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    i13 = i16;
                    break;
                case -1747013482:
                case 287188956:
                    i14 = i14;
                    i11 = 148;
                    if (C3033.m9845() <= 0) {
                        iM2761 = C0773.m3169("᩷ۛ") ^ i4;
                        i = ((iM2761 ^ i3) * 623) ^ (-1120256613);
                        i2 = 775994608;
                    } else {
                        iM2761 = (C0773.m3169("ۡۨ") + i4) * (-107);
                        i = ((iM2761 ^ i3) * 28469) ^ (-139483327);
                        i2 = -1549012037;
                    }
                    int i17 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    i13 = i17;
                    break;
                case -1640310346:
                case 1244981337:
                    i14 = i14;
                    if (C0773.f2792 > 0) {
                        iM2761 = (i4 - C0773.m3169("ۙܳ")) * (-5);
                        i = ((iM2761 ^ i3) * 14499) ^ 2047401403;
                        i2 = -126153934;
                    } else {
                        iM2761 = C0619.m2761("᩷ۧ") ^ i3;
                        i = ((iM2761 ^ i4) * 30025) ^ (-1439422130);
                        i2 = 1780273837;
                    }
                    int i18 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    i13 = i18;
                    break;
                case -1623047322:
                case 2132792356:
                    i14 = i14;
                    i12 = 9;
                    if (RunnableC1848.f6235) {
                        iM2761 = C0619.m2761("ۢ᩷") ^ i3;
                        i = ((iM2761 ^ i4) * (-3063)) ^ (-890557395);
                        i2 = -2086002384;
                    } else {
                        iM2761 = (C0773.m3169("᩵ۢ") ^ i3) * (-71);
                        i = ((iM2761 ^ i4) * (-1665)) ^ (-1116175639);
                        i2 = 670926518;
                    }
                    int i19 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    i13 = i19;
                    break;
                case -1468360853:
                case 377732073:
                    i14 = i14;
                    c = 147;
                    if (C3099.f10023 <= 0) {
                        iM2761 = (i4 - C0773.m3169("ۙܳ")) * (-5);
                        i = ((iM2761 ^ i3) * 14499) ^ 2047401403;
                        i2 = -126153934;
                    } else {
                        iM2761 = (C0619.m2761("ۗ۠") + i3) * (-99);
                        i = ((iM2761 ^ i4) * (-24083)) ^ 147500391;
                        i2 = -1288916382;
                    }
                    int i110 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    i13 = i110;
                    break;
                case -1311548762:
                case -466160031:
                    i14 = i14;
                    if (i8 - (i9 + 1) < 0) {
                        iM2761 = C0773.m3169("֨֫") ^ i4;
                        i = ((iM2761 ^ i3) * 9473) ^ (-2140801699);
                        i2 = -1357872746;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩷ۘ")) * 97;
                        i = ((iM2761 ^ i4) * 13431) ^ 853682414;
                        i2 = 172159591;
                    }
                    int i111 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    i13 = i111;
                    break;
                case -1241848791:
                case 1032658427:
                    i14 = i14;
                    i8 = i7 * i7;
                    s2 = 2;
                    if (RunnableC0334.m2063()) {
                        iM2761 = C0619.m2761("ۢ᩷") ^ i3;
                        i = ((iM2761 ^ i4) * (-3063)) ^ (-890557395);
                        i2 = -2086002384;
                    } else {
                        iM2761 = C0773.m3169("ۙܿ") ^ i4;
                        i = ((iM2761 ^ i3) * 18439) ^ 2019316157;
                        i2 = 1986156901;
                    }
                    int i112 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    i13 = i112;
                    break;
                case -1100737586:
                case -134811811:
                    i10 = 5535;
                    iM2761 = C0773.m3169("۫ܳ") ^ i3;
                    i = ((iM2761 ^ i4) * 8265) ^ 438435088;
                    i2 = -1715165094;
                    int i113 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    i13 = i113;
                    break;
                case -1013748121:
                case 1977514090:
                    C2023.m6964();
                    return null;
                case -971252511:
                case 901792062:
                    i14 = i14;
                    i9 = s * s2;
                    if (C0269.f1558 <= 0) {
                        iM2761 = (i4 - C0773.m3169("ۙܳ")) * (-5);
                        i = ((iM2761 ^ i3) * 14499) ^ 2047401403;
                        i2 = -126153934;
                    } else {
                        iM2761 = (C0773.m3169("۬᩻") ^ i4) * (-41);
                        i = ((iM2761 ^ i3) * 9335) ^ 1277415120;
                        i2 = 1488191626;
                    }
                    int i114 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    i13 = i114;
                    break;
                case -920798718:
                case 1090214878:
                    i14 = i14;
                    i7 = s + 1;
                    if (C2023.f6737) {
                        iM2761 = C0619.m2761("ۢ᩷") ^ i3;
                        i = ((iM2761 ^ i4) * (-3063)) ^ (-890557395);
                        i2 = -2086002384;
                    } else {
                        iM2761 = (C0773.m3169("֫ۖ") + i3) * (-83);
                        i = ((iM2761 ^ i4) * (-10113)) ^ 256420767;
                        i2 = -42201910;
                    }
                    int i115 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    i13 = i115;
                    break;
                case -811308055:
                case 591336998:
                    i14 = i14;
                    sArr = f33674;
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0773.m3169("᩷ۛ") ^ i4;
                        i = ((iM2761 ^ i3) * 623) ^ (-1120256613);
                        i2 = 775994608;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩹ᩳ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((iM2761 ^ i4) * 29985) ^ (-42239231);
                        i2 = -2138799366;
                    }
                    int i116 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    i13 = i116;
                    break;
                case -809070008:
                case 296989816:
                    i14 = i14;
                    bundleRequireArguments = requireArguments();
                    sArr2 = f33674;
                    if (C2288.f7433 <= 0) {
                        iM2761 = C0773.m3169("᩷ۛ") ^ i4;
                        i = ((iM2761 ^ i3) * 623) ^ (-1120256613);
                        i2 = 775994608;
                    } else {
                        iM2761 = (C0773.m3169("ۨۛ") + i3) * (-23);
                        i = ((iM2761 ^ i4) * (-28165)) ^ (-1664091817);
                        i2 = -1405623015;
                    }
                    int i117 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    i13 = i117;
                    break;
                case -617030079:
                case 527002263:
                    i10 = 43157;
                    iM2761 = C0773.m3169("۫ܳ") ^ i3;
                    i = ((iM2761 ^ i4) * 8265) ^ 438435088;
                    i2 = -1715165094;
                    int i118 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    i13 = i118;
                    break;
                case -496490377:
                case 1885780129:
                    i14 = i14;
                    C3033.m9845();
                    iM2761 = (i4 - C0773.m3169("ۙܳ")) * (-5);
                    i = ((iM2761 ^ i3) * 14499) ^ 2047401403;
                    i2 = -126153934;
                    int i119 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    i13 = i119;
                    break;
                case 7537209:
                case 569380899:
                    String strM8060 = C2375.m8060(bundleRequireArguments, C3099.m10092(sArr2, i11, i12, i10));
                    C3099.m10086(strM8060);
                    return strM8060;
                case 257879270:
                case 1161136846:
                    i14 = i14;
                    if (AbstractC0116.m1243() == 0) {
                        iM2761 = (i4 - C0773.m3169("ۙܳ")) * (-5);
                        i = ((iM2761 ^ i3) * 14499) ^ 2047401403;
                        i2 = -126153934;
                    } else {
                        iM2761 = C0773.m3169("᩷ۛ") ^ i4;
                        i = ((iM2761 ^ i3) * 623) ^ (-1120256613);
                        i2 = 775994608;
                    }
                    int i1110 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    i13 = i1110;
                    break;
                default:
                    i14 = i14;
                    if (C3033.f9831 >= 0) {
                        iM2761 = (i4 - C0773.m3169("ۙܳ")) * (-5);
                        i = ((iM2761 ^ i3) * 14499) ^ 2047401403;
                        i2 = -126153934;
                    } else {
                        iM2761 = (C0619.m2761("֨ܽ") ^ i4) * (-53);
                        i = ((iM2761 ^ i3) * (-16493)) ^ (-126898409);
                        i2 = -558346282;
                    }
                    int i1111 = i14;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    i13 = i1111;
                    break;
            }
        }
    }

    @Override // l.ComponentCallbacksC11612
    public final void onDestroyView() {
        boolean z = false;
        ActivityC0848 activityC0848 = null;
        C17502 c17502 = null;
        int i = 192426190;
        int i2 = C0269.f1558;
        int i3 = C4238.f15451;
        int iM2761 = (C0619.m2761("֡ᩴ") ^ i3) * (-79);
        int i4 = ((iM2761 ^ i2) * (-12365)) ^ (-174298185);
        int i5 = 392323372;
        while (true) {
            i = ((((i ^ i2) * (-1959)) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2121444613:
                case 104215652:
                    this.f33676 = c17502;
                    this.f33681 = c17502;
                    break;
                case -1973862250:
                case -1029369218:
                    super.onDestroyView();
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0619.m2761("֨ۙ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-2983)) ^ 905908052;
                        i5 = 44810577;
                    } else {
                        iM2761 = C0619.m2761("ۡ᩵") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-20379)) ^ 1737205243;
                        i5 = 1641582820;
                    }
                    break;
                case -1922908509:
                case 688552848:
                    this.f33678 = z;
                    if (C1146.f4234 >= 0) {
                        iM2761 = (i3 - C0773.m3169("ۖۘ")) * (-113);
                        i4 = ((iM2761 ^ i2) * 11225) ^ 1073859857;
                        i5 = 1356671309;
                    } else {
                        iM2761 = C0773.m3169("ܰۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 4179) ^ 1617815404;
                        i5 = 2015512274;
                    }
                    break;
                case -1638317924:
                case -1422799002:
                    z = false;
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0619.m2761("֨ۙ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-2983)) ^ 905908052;
                        i5 = 44810577;
                    } else {
                        iM2761 = (C0619.m2761("ۛۡ") + i3) * (-27);
                        i4 = ((iM2761 ^ i2) * (-24821)) ^ (-2052709553);
                        i5 = 938989128;
                    }
                    break;
                case -1238429795:
                case 165425661:
                    this.f33677 = c17502;
                    if (C2834.m9344() >= 0) {
                        iM2761 = C0773.m3169("᩺֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4983)) ^ (-2098254817);
                        i5 = 863323780;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۤ᩷")) * (-55);
                        i4 = ((iM2761 ^ i2) * (-23337)) ^ (-1677508576);
                        i5 = -1193065438;
                    }
                    break;
                case -1201341054:
                case 757422832:
                    if (C3099.m10095()) {
                        iM2761 = (i3 - C0773.m3169("ۖۘ")) * (-113);
                        i4 = ((iM2761 ^ i2) * 11225) ^ 1073859857;
                        i5 = 1356671309;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩸ܽ")) * (-67);
                        i4 = ((iM2761 ^ i2) * (-15439)) ^ 799187423;
                        i5 = 345383971;
                    }
                    break;
                case -1112674818:
                case 271029469:
                    activityC0848.m40414();
                    c17502 = null;
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0619.m2761("۟֫") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-13151)) ^ 598143455;
                        i5 = 1791001724;
                    } else {
                        iM2761 = C0773.m3169("۠ܶ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 7477) ^ (-2041758080);
                        i5 = 647656884;
                    }
                    break;
                case -901180909:
                case 1466186613:
                    activityC0848 = (ActivityC0848) AbstractC0116.m1234(this);
                    if (C4238.f15451 >= 0) {
                        iM2761 = C0619.m2761("֨ۙ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-2983)) ^ 905908052;
                        i5 = 44810577;
                    } else {
                        iM2761 = C0619.m2761("᩷ۗ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-31829)) ^ (-264616975);
                        i5 = 186248087;
                    }
                    break;
                case -817289508:
                case 1506298876:
                    RunnableC3055.m9933();
                    if (C2834.f9334 > 0) {
                        iM2761 = (i3 - C0773.m3169("ۖۘ")) * (-113);
                        i4 = ((iM2761 ^ i2) * 11225) ^ 1073859857;
                        i5 = 1356671309;
                    } else {
                        iM2761 = C0773.m3169("᩺֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4983)) ^ (-2098254817);
                        i5 = 863323780;
                    }
                    break;
                case -773037965:
                case 980780791:
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0619.m2761("֨ۙ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-2983)) ^ 905908052;
                        i5 = 44810577;
                    } else {
                        iM2761 = C0619.m2761("ᩴ۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-21819)) ^ (-468353257);
                        i5 = 546323533;
                    }
                    break;
                case -682488333:
                case 161724868:
                    if (RunnableC3055.m9933() == 0) {
                        iM2761 = C0773.m3169("᩺֡") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-4983)) ^ (-2098254817);
                        i5 = 863323780;
                    } else {
                        iM2761 = C0619.m2761("۟֫") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-13151)) ^ 598143455;
                        i5 = 1791001724;
                    }
                    break;
                case -596155399:
                case 1025795580:
                    C0773.m3161();
                    C1826.m6301();
                    break;
                case -256170310:
                case 472966396:
                    C2375.m8065();
                    iM2761 = C0619.m2761("۟֫") ^ i3;
                    i4 = ((iM2761 ^ i2) * (-13151)) ^ 598143455;
                    i5 = 1791001724;
                    break;
                case 265658026:
                case 499459131:
                    if (C1321.f4751 >= 0) {
                        iM2761 = (C0773.m3169("֡᩶") ^ i2) * (-83);
                        i4 = ((iM2761 ^ i3) * 27615) ^ 997057717;
                        i5 = -168063010;
                    } else {
                        iM2761 = (C0773.m3169("᩶ۧ") ^ i2) * (-57);
                        i4 = ((iM2761 ^ i3) * 7945) ^ (-2112666695);
                        i5 = -416814498;
                    }
                    break;
                case 1319036751:
                case 2113701886:
                    if (C3448.m11248() != 0) {
                        iM2761 = C0619.m2761("۟֫") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-13151)) ^ 598143455;
                        i5 = 1791001724;
                    } else {
                        iM2761 = C0619.m2761("ᩳۜ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-3987)) ^ (-149976863);
                        i5 = 248576610;
                    }
                    break;
                default:
                    C11235.m28309();
                    if (C20932.f66974 <= 0) {
                        iM2761 = (C0773.m3169("֡᩶") ^ i2) * (-83);
                        i4 = ((iM2761 ^ i3) * 27615) ^ 997057717;
                        i5 = -168063010;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ۖۘ")) * (-113);
                        i4 = ((iM2761 ^ i2) * 11225) ^ 1073859857;
                        i5 = 1356671309;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۙ */
    public final void mo1436(C22761 c22761) {
        c22761.m51298(m27091());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00d2 A[PHI: r7
      0x00d2: PHI (r7v4 java.lang.String) = (r7v3 java.lang.String), (r7v2 java.lang.String) binds: [B:27:0x00d0, B:23:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01d5 A[PHI: r2 r3 r9 r10
      0x01d5: PHI (r2v4 android.os.Bundle) = (r2v3 android.os.Bundle), (r2v2 android.os.Bundle), (r2v2 android.os.Bundle), (r2v2 android.os.Bundle) binds: [B:51:0x01d3, B:47:0x01b0, B:17:0x0080, B:15:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v3 java.lang.String), (r3v2 java.lang.String), (r3v2 java.lang.String) binds: [B:51:0x01d3, B:47:0x01b0, B:17:0x0080, B:15:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r9v4 short[]) = (r9v3 short[]), (r9v2 short[]), (r9v2 short[]), (r9v2 short[]) binds: [B:51:0x01d3, B:47:0x01b0, B:17:0x0080, B:15:0x007c] A[DONT_GENERATE, DONT_INLINE]
      0x01d5: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:51:0x01d3, B:47:0x01b0, B:17:0x0080, B:15:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x029e A[PHI: r11 r12 r13 r19 r25
      0x029e: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:68:0x029c, B:31:0x0107, B:15:0x007c, B:12:0x0076, B:9:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x029e: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:68:0x029c, B:31:0x0107, B:15:0x007c, B:12:0x0076, B:9:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x029e: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:68:0x029c, B:31:0x0107, B:15:0x007c, B:12:0x0076, B:9:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x029e: PHI (r19v4 int) = (r19v3 int), (r19v2 int), (r19v2 int), (r19v2 int), (r19v2 int) binds: [B:68:0x029c, B:31:0x0107, B:15:0x007c, B:12:0x0076, B:9:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x029e: PHI (r25v5 short) = (r25v4 short), (r25v3 short), (r25v3 short), (r25v3 short), (r25v3 short) binds: [B:68:0x029c, B:31:0x0107, B:15:0x007c, B:12:0x0076, B:9:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02d0 A[PHI: r18 r20
      0x02d0: PHI (r18v4 int) = (r18v3 int), (r18v2 int) binds: [B:72:0x02ce, B:9:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x02d0: PHI (r20v4 short) = (r20v3 short), (r20v2 short) binds: [B:72:0x02ce, B:9:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02fc A[PHI: r5 r6 r16 r17
      0x02fc: PHI (r5v4 java.lang.StringBuilder) = 
      (r5v3 java.lang.StringBuilder)
      (r5v2 java.lang.StringBuilder)
      (r5v2 java.lang.StringBuilder)
      (r5v2 java.lang.StringBuilder)
     binds: [B:39:0x0153, B:35:0x012c, B:12:0x0076, B:6:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x02fc: PHI (r6v4 java.lang.String) = (r6v3 java.lang.String), (r6v2 java.lang.String), (r6v2 java.lang.String), (r6v2 java.lang.String) binds: [B:39:0x0153, B:35:0x012c, B:12:0x0076, B:6:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x02fc: PHI (r16v3 short[]) = (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v5 short[]) binds: [B:39:0x0153, B:35:0x012c, B:12:0x0076, B:6:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x02fc: PHI (r17v3 char) = (r17v2 char), (r17v2 char), (r17v2 char), (r17v5 char) binds: [B:39:0x0153, B:35:0x012c, B:12:0x0076, B:6:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ۚ */
    public final String mo1440() {
        int iM3169;
        int i;
        int i2;
        int iM28315;
        int i3 = C1519.f5300;
        int i4 = C2375.f7641;
        int iM2761 = (i4 - C0619.m2761("ۖۖ")) * 83;
        int i5 = ((iM2761 ^ i3) * (-28179)) ^ (-1476997978);
        String strM12149 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM2761 ^ (-139729666);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        char c = 0;
        int i12 = 0;
        int i13 = 0;
        short s = 0;
        int i14 = -1016018002;
        short s2 = 0;
        String strM27091 = null;
        StringBuilder sb = null;
        String strM28303 = null;
        String strM8350 = null;
        Bundle bundleRequireArguments = null;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i3) * (-10071)) >> 31));
            switch (i14) {
                case -1657267977:
                case -318104685:
                    if (C1826.f6190 > 0) {
                        iM3169 = (C0773.m3169("ۤۜ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM3169 ^ i4) * (-5601)) ^ 139279659;
                        i2 = -1266491470;
                    } else {
                        iM3169 = C0773.m3169("ܿᩳ") ^ i3;
                        i = ((iM3169 ^ i4) * (-11131)) ^ (-1743088082);
                        i2 = -372314554;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1556609255:
                case -138063927:
                    strM8350 = C2485.m8350(sArr2, i8, 6, i11);
                    if (C1519.f5300 >= 0) {
                        iM3169 = (C0773.m3169("ۤۜ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM3169 ^ i4) * (-5601)) ^ 139279659;
                        i2 = -1266491470;
                    } else {
                        iM3169 = C0773.m3169("ۛ᩵") ^ i4;
                        i = ((iM3169 ^ i3) * 15247) ^ (-1425273336);
                        i2 = -1915423586;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1493503215:
                case -116748771:
                    strM28303 = C11235.m28303(bundleRequireArguments, strM8350);
                    iM28315 = C11235.m28315(strM28303, 40);
                    if (iM28315 == -1) {
                        iM3169 = C0619.m2761("ܺܽ") ^ i4;
                        i = ((iM3169 ^ i3) * (-25907)) ^ 1909406466;
                        i2 = 2077624669;
                    } else {
                        i7 = iM28315;
                        iM3169 = C0773.m3169("ۢ۠") ^ i3;
                        i = ((iM3169 ^ i4) * (-27917)) ^ (-1796280955);
                        i2 = -525917802;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1458377492:
                case 1580508018:
                    return this.f33684;
                case -1341889797:
                case -739693239:
                    if (i13 - (s * s2) < 0) {
                        iM3169 = (C0773.m3169("۬۠") + i4) * 31;
                        i = ((iM3169 ^ i3) * (-13393)) ^ 736425484;
                        i2 = -629713908;
                    } else {
                        iM3169 = C0773.m3169("ۜ᩶") ^ i4;
                        i = ((iM3169 ^ i3) * (-8567)) ^ (-1589794526);
                        i2 = -932313267;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1144969275:
                case 1472119857:
                    if (this.f33684 == null) {
                        iM3169 = (C0773.m3169("ۜ᩻") ^ i3) * (-51);
                        i = ((iM3169 ^ i4) * (-18187)) ^ 1474895439;
                        i2 = 437953670;
                    } else {
                        iM3169 = (C0619.m2761("ۖ᩹") + i4) * (-103);
                        i = ((iM3169 ^ i3) * (-25919)) ^ 703940125;
                        i2 = 1392555408;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1138159518:
                case -260610687:
                    if (C23916.m53419() != 0) {
                        iM3169 = C0773.m3169("ܿᩳ") ^ i3;
                        i = ((iM3169 ^ i4) * (-11131)) ^ (-1743088082);
                        i2 = -372314554;
                    } else {
                        iM3169 = C0773.m3169("᩶֡") ^ i4;
                        i = ((iM3169 ^ i3) * (-189)) ^ 944337955;
                        i2 = -1713916415;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1129284562:
                case 1683384624:
                    i11 = 52130;
                    iM3169 = (C0619.m2761("֨ۗ") ^ i3) * 123;
                    i = ((iM3169 ^ i4) * (-3715)) ^ (-1697093679);
                    i2 = -631411083;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -798449959:
                case 917538157:
                    RunnableC3055.m9933();
                    C17202.m40372();
                    iM3169 = (C0773.m3169("ۤۜ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i = ((iM3169 ^ i4) * (-5601)) ^ 139279659;
                    i2 = -1266491470;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -706261349:
                case 1682889228:
                    s = sArr[c];
                    i12 = s * s;
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = C0619.m2761("ۛ֨") ^ i3;
                        i = ((iM3169 ^ i4) * (-17757)) ^ 113387970;
                        i2 = 789131155;
                    } else {
                        iM3169 = (i3 - C0773.m3169("ۨܳ")) * 3;
                        i = ((iM3169 ^ i4) * (-23773)) ^ (-560570302);
                        i2 = -1938485838;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -334147147:
                case 1483037843:
                    C1783.m6234(sb, C15306.m36751(strM27091));
                    if (C23916.m53419() != 0) {
                        iM3169 = C0773.m3169("᩶֡") ^ i4;
                        i = ((iM3169 ^ i3) * (-189)) ^ 944337955;
                        i2 = -1713916415;
                    } else {
                        iM3169 = (C0773.m3169("ܶܳ") ^ i4) * 81;
                        i = ((iM3169 ^ i3) * 14391) ^ 544040421;
                        i2 = -6056763;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -95798109:
                case 302781806:
                    i13 = i12 + 184525056;
                    s2 = 27168;
                    if (RunnableC3646.f12471) {
                        iM3169 = C0773.m3169("ܿᩳ") ^ i3;
                        i = ((iM3169 ^ i4) * (-11131)) ^ (-1743088082);
                        i2 = -372314554;
                    } else {
                        iM3169 = C0773.m3169("ۨܽ") ^ i3;
                        i = ((iM3169 ^ i4) * 15203) ^ 316021995;
                        i2 = 1870278545;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -42360897:
                case 1195897095:
                    i11 = 55385;
                    iM3169 = (C0619.m2761("֨ۗ") ^ i3) * 123;
                    i = ((iM3169 ^ i4) * (-3715)) ^ (-1697093679);
                    i2 = -631411083;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 69794652:
                case 306017509:
                    C2834.m9344();
                    C3734.m12152();
                    return null;
                case 96584897:
                case 1721144713:
                    sArr3 = f33674;
                    i10 = 146;
                    i9 = 1;
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0773.m3169("ܿᩳ") ^ i3;
                        i = ((iM3169 ^ i4) * (-11131)) ^ (-1743088082);
                        i2 = -372314554;
                    } else {
                        iM3169 = C0619.m2761("ۚᩳ") ^ i3;
                        i = ((iM3169 ^ i4) * (-19333)) ^ (-339909154);
                        i2 = -1444834762;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 252213863:
                case 732335204:
                    iM28315 = C2966.m9671(strM28303);
                    i7 = iM28315;
                    iM3169 = C0773.m3169("ۢ۠") ^ i3;
                    i = ((iM3169 ^ i4) * (-27917)) ^ (-1796280955);
                    i2 = -525917802;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 271782166:
                case 495994239:
                    this.f33684 = C18969.m44066(80, C2023.m6952(sb));
                    iM3169 = (C0619.m2761("ۖ᩹") + i4) * (-103);
                    i = ((iM3169 ^ i3) * (-25919)) ^ 703940125;
                    i2 = 1392555408;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 288626095:
                case 775157466:
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0773.m3169("ܿᩳ") ^ i3;
                        i = ((iM3169 ^ i4) * (-11131)) ^ (-1743088082);
                        i2 = -372314554;
                    } else {
                        iM3169 = C0619.m2761("ۛ֨") ^ i3;
                        i = ((iM3169 ^ i4) * (-17757)) ^ 113387970;
                        i2 = 789131155;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 311470713:
                case 1788053539:
                    C3779.m12258(sb, strM12149);
                    C1783.m6234(sb, AbstractC0116.m1237(strM28303, 0, i7));
                    if (C3779.f12953 <= 0) {
                        iM3169 = (i4 - C0619.m2761("ᩳۛ")) * (-7);
                        i = ((iM3169 ^ i3) * (-30129)) ^ 2080335295;
                        i2 = -533497101;
                    } else {
                        iM3169 = C0619.m2761("ۘۢ") ^ i3;
                        i = ((iM3169 ^ i4) * 12793) ^ (-1214912379);
                        i2 = -817014237;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 764088171:
                case 1990192336:
                    strM12149 = C3734.m12149(sArr3, i10, i9, i11);
                    if (C2702.f8586 <= 0) {
                        iM3169 = (i4 - C0619.m2761("ᩳۛ")) * (-7);
                        i = ((iM3169 ^ i3) * (-30129)) ^ 2080335295;
                        i2 = -533497101;
                    } else {
                        iM3169 = C0619.m2761("ܰᩳ") ^ i4;
                        i = ((iM3169 ^ i3) * 6129) ^ 1900709615;
                        i2 = 508421401;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1071213975:
                case 1738435066:
                    sb = new StringBuilder();
                    strM27091 = m27091();
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0773.m3169("᩶֡") ^ i4;
                        i = ((iM3169 ^ i3) * (-189)) ^ 944337955;
                        i2 = -1713916415;
                    } else {
                        iM3169 = (C0619.m2761("᩺۠") ^ i4) * (-125);
                        i = ((iM3169 ^ i3) * (-22181)) ^ (-1690827984);
                        i2 = 64254376;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1447840196:
                case 1674971174:
                    bundleRequireArguments = requireArguments();
                    sArr2 = f33674;
                    i8 = 140;
                    if (C3099.f10023 <= 0) {
                        iM3169 = (C0773.m3169("ۤۜ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM3169 ^ i4) * (-5601)) ^ 139279659;
                        i2 = -1266491470;
                    } else {
                        iM3169 = C0773.m3169("ۙ֨") ^ i3;
                        i = ((iM3169 ^ i4) * 9007) ^ (-735345193);
                        i2 = 2084982473;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    sArr = f33674;
                    c = 139;
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0773.m3169("᩶֡") ^ i4;
                        i = ((iM3169 ^ i3) * (-189)) ^ 944337955;
                        i2 = -1713916415;
                    } else {
                        iM3169 = C0773.m3169("᩻ۢ") ^ i4;
                        i = ((iM3169 ^ i3) * (-18033)) ^ 674899608;
                        i2 = 278099378;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00f4 A[PHI: r1 r10
      0x00f4: PHI (r1v54 l.֨֫ۧ) = (r1v41 l.֨֫ۧ), (r1v2 l.֨֫ۧ), (r1v2 l.֨֫ۧ) binds: [B:31:0x00f2, B:13:0x005c, B:9:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x00f4: PHI (r10v4 short[]) = (r10v3 short[]), (r10v2 short[]), (r10v2 short[]) binds: [B:31:0x00f2, B:13:0x005c, B:9:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01f2 A[PHI: r3 r6 r7 r8 r11 r12 r16
      0x01f2: PHI (r3v5 short[]) = (r3v2 short[]), (r3v4 short[]), (r3v2 short[]), (r3v2 short[]), (r3v2 short[]) binds: [B:54:0x01f0, B:50:0x01d4, B:42:0x018e, B:14:0x005e, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r6v4 int) = (r6v2 int), (r6v2 int), (r6v3 int), (r6v2 int), (r6v2 int) binds: [B:54:0x01f0, B:50:0x01d4, B:42:0x018e, B:14:0x005e, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:54:0x01f0, B:50:0x01d4, B:42:0x018e, B:14:0x005e, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r8v4 int) = (r8v2 int), (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:54:0x01f0, B:50:0x01d4, B:42:0x018e, B:14:0x005e, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v5 int) binds: [B:54:0x01f0, B:50:0x01d4, B:42:0x018e, B:14:0x005e, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r12v3 int) = (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v5 int) binds: [B:54:0x01f0, B:50:0x01d4, B:42:0x018e, B:14:0x005e, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01f2: PHI (r16v27 l.֨֫ۧ) = (r16v6 l.֨֫ۧ), (r16v7 l.֨֫ۧ), (r16v10 l.֨֫ۧ), (r16v23 l.֨֫ۧ), (r16v30 l.֨֫ۧ) binds: [B:54:0x01f0, B:50:0x01d4, B:42:0x018e, B:14:0x005e, B:6:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x0226 A[PHI: r4 r5 r16
      0x0226: PHI (r4v3 short) = (r4v2 short), (r4v4 short) binds: [B:58:0x0224, B:46:0x01b3] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r5v3 short) = (r5v2 short), (r5v4 short) binds: [B:58:0x0224, B:46:0x01b3] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r16v8 l.֨֫ۧ) = (r16v5 l.֨֫ۧ), (r16v9 l.֨֫ۧ) binds: [B:58:0x0224, B:46:0x01b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0273 A[PHI: r16
      0x0273: PHI (r16v21 l.֨֫ۧ) = (r16v3 l.֨֫ۧ), (r16v4 l.֨֫ۧ), (r16v22 l.֨֫ۧ) binds: [B:66:0x0271, B:62:0x0256, B:17:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        if (l.C0862.f3233 != 0) goto L17;
     */
    @Override // l.ComponentCallbacksC11612
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r20, android.view.ViewGroup r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instruction units count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10608.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27074(C10608 c10608, int i) {
        C17502 c17502 = null;
        int iM41037 = 0;
        int i2 = 0;
        C15301 c15301M36736 = null;
        ActivityC3409 activityC3409M1234 = null;
        ActivityC0848 activityC0848 = null;
        int i3 = -1372623664;
        int i4 = C0950.f3488;
        int i5 = C3690.f12684;
        int iM3169 = (C0773.m3169("ۡ۟") ^ i4) * (-27);
        int i6 = ((iM3169 ^ i5) * 3039) ^ (-1715457118);
        int i7 = -2127079625;
        while (true) {
            i3 = ((((i3 ^ i5) * (-15189)) >> 31) & i6) ^ (iM3169 ^ i7);
            switch (i3) {
                case -1929040770:
                case -25368433:
                    if (RunnableC3055.m9933() != 0) {
                        iM3169 = C0619.m2761("ۚۘ") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-13751)) ^ (-1493068844);
                        i7 = -1535738654;
                    } else {
                        iM3169 = C0773.m3169("۠᩵") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-15027)) ^ (-1221731397);
                        i7 = 632881098;
                    }
                    break;
                case -1890026611:
                case 107235017:
                    if (C13473.f42873 != 0) {
                        iM3169 = C0619.m2761("ܽۤ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 29607) ^ (-1375911340);
                        i7 = 1321116956;
                    } else {
                        iM3169 = C0773.m3169("᩻ۡ") ^ i4;
                        i6 = ((iM3169 ^ i5) * 8125) ^ 2037858602;
                        i7 = -1894964625;
                    }
                    break;
                case -1889328255:
                case 1589311860:
                    c17502 = c10608.f33681;
                    if (C1826.m6301() >= 0) {
                        iM3169 = (C0773.m3169("ܰ᩶") + i5) * 41;
                        i6 = ((iM3169 ^ i4) * 14627) ^ 1906329955;
                        i7 = 27656260;
                    } else {
                        iM3169 = (C0773.m3169("ۧ᩻") + i4) * (-107);
                        i6 = ((iM3169 ^ i5) * 1491) ^ 455579818;
                        i7 = -1653770708;
                    }
                    break;
                case -1772181895:
                case 613136269:
                    activityC0848 = (ActivityC0848) activityC3409M1234;
                    if (C11235.f35427 >= 0) {
                        iM3169 = C0773.m3169("ܺ᩵") ^ i4;
                        i6 = ((iM3169 ^ i5) * 17971) ^ 2098748561;
                        i7 = -431278075;
                    } else {
                        iM3169 = C0773.m3169("۫᩷") ^ i5;
                        i6 = ((iM3169 ^ i4) * 23825) ^ 954618517;
                        i7 = -2146506637;
                    }
                    break;
                case -1733168429:
                case 1789633569:
                    if (C2023.m6964() <= 0) {
                        iM3169 = C0619.m2761("ۚۘ") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-13751)) ^ (-1493068844);
                        i7 = -1535738654;
                    } else {
                        iM3169 = (C0619.m2761("ۜۜ") ^ i5) * (-51);
                        i6 = ((iM3169 ^ i4) * (-2103)) ^ (-131630839);
                        i7 = -1478780141;
                    }
                    break;
                case -1298954637:
                case 1162955661:
                    if (C3690.f12684 <= 0) {
                        iM3169 = (i4 - C0773.m3169("۟۟")) * 35;
                        i6 = ((iM3169 ^ i5) * (-24347)) ^ 216837772;
                        i7 = 1635282575;
                    } else {
                        iM3169 = C0773.m3169("ۧ֡") ^ i5;
                        i6 = ((iM3169 ^ i4) * (-16321)) ^ 422343263;
                        i7 = -1315915397;
                    }
                    break;
                case -1090692609:
                case 1269091018:
                    activityC0848.m3431(c10608.m27091(), c15301M36736);
                    break;
                case -877717781:
                case 675690739:
                    AbstractC3624.m11755();
                    iM3169 = (C0773.m3169("ܰ᩶") + i5) * 41;
                    i6 = ((iM3169 ^ i4) * 14627) ^ 1906329955;
                    i7 = 27656260;
                    break;
                case -32111818:
                case 1902138450:
                    if (C20932.f66974 > 0) {
                        iM3169 = C0619.m2761("ۚۘ") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-13751)) ^ (-1493068844);
                        i7 = -1535738654;
                    } else {
                        iM3169 = (i4 - C0773.m3169("۟۟")) * 35;
                        i6 = ((iM3169 ^ i5) * (-24347)) ^ 216837772;
                        i7 = 1635282575;
                    }
                    break;
                case 52633964:
                case 310250098:
                    c15301M36736 = C15301.m36736(iM41037, i2);
                    activityC3409M1234 = AbstractC0116.m1234(c10608);
                    if (C0487.f2131 <= 0) {
                        iM3169 = (i4 - C0773.m3169("۟۟")) * 35;
                        i6 = ((iM3169 ^ i5) * (-24347)) ^ 216837772;
                        i7 = 1635282575;
                    } else {
                        iM3169 = C0619.m2761("֫۫") ^ i4;
                        i6 = ((iM3169 ^ i5) * 10675) ^ (-617720336);
                        i7 = 24479477;
                    }
                    break;
                case 347825362:
                case 1821750495:
                    C1783.m6232();
                    break;
                case 405114757:
                case 1750112589:
                    if (C13473.f42873 != 0) {
                        iM3169 = (i4 - C0773.m3169("۟۟")) * 35;
                        i6 = ((iM3169 ^ i5) * (-24347)) ^ 216837772;
                        i7 = 1635282575;
                    } else {
                        iM3169 = (C0619.m2761("ܿܳ") + i5) * 43;
                        i6 = ((iM3169 ^ i4) * 16477) ^ 275565474;
                        i7 = 196286831;
                    }
                    break;
                case 541644646:
                case 1292815628:
                    iM41037 = c17502.m41037(i);
                    i2 = 0;
                    if (C2878.f9462) {
                        iM3169 = C0773.m3169("ܺ᩵") ^ i4;
                        i6 = ((iM3169 ^ i5) * 17971) ^ 2098748561;
                        i7 = -431278075;
                    } else {
                        iM3169 = (C0773.m3169("ܿܿ") + i5) * (-5);
                        i6 = ((iM3169 ^ i4) * (-7101)) ^ (-1230829094);
                        i7 = -683328590;
                    }
                    break;
                case 861745648:
                case 1336353446:
                    if (C2878.m9491() <= 0) {
                        iM3169 = C0619.m2761("ܽۤ") ^ i5;
                        i6 = ((iM3169 ^ i4) * 29607) ^ (-1375911340);
                        i7 = 1321116956;
                    } else {
                        iM3169 = (C0773.m3169("ܰ᩶") + i5) * 41;
                        i6 = ((iM3169 ^ i4) * 14627) ^ 1906329955;
                        i7 = 27656260;
                    }
                    break;
                case 875301186:
                case 1884095291:
                    if (RunnableC3646.m11813() != 0) {
                        iM3169 = (i4 - C0773.m3169("۟۟")) * 35;
                        i6 = ((iM3169 ^ i5) * (-24347)) ^ 216837772;
                        i7 = 1635282575;
                    } else {
                        iM3169 = (C0773.m3169("ܰ᩶") + i5) * 41;
                        i6 = ((iM3169 ^ i4) * 14627) ^ 1906329955;
                        i7 = 27656260;
                    }
                    break;
                default:
                    if (C0950.f3488 >= 0) {
                        iM3169 = C0773.m3169("ܺ᩵") ^ i4;
                        i6 = ((iM3169 ^ i5) * 17971) ^ 2098748561;
                        i7 = -431278075;
                    } else {
                        iM3169 = C0619.m2761("ۖ֡") ^ i4;
                        i6 = ((iM3169 ^ i5) * (-303)) ^ (-1975564666);
                        i7 = 1767352104;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009d A[PHI: r4
      0x009d: PHI (r4v4 l.᩸ۧۧ) = (r4v3 l.᩸ۧۧ), (r4v2 l.᩸ۧۧ), (r4v2 l.᩸ۧۧ), (r4v2 l.᩸ۧۧ) binds: [B:23:0x009b, B:14:0x0062, B:12:0x005f, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0173 A[PHI: r6 r7 r14
      0x0173: PHI (r6v5 int) = (r6v2 int), (r6v4 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:39:0x0171, B:35:0x014a, B:20:0x008a, B:12:0x005f, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:39:0x0171, B:35:0x014a, B:20:0x008a, B:12:0x005f, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r14v4 short[]) = (r14v3 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:39:0x0171, B:35:0x014a, B:20:0x008a, B:12:0x005f, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x01d2 A[PHI: r3 r5 r11 r12 r13
      0x01d2: PHI (r3v8 int) = (r3v2 int), (r3v2 int), (r3v6 int), (r3v2 int) binds: [B:47:0x01d0, B:43:0x01ab, B:27:0x00e0, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r5v5 int) = (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:47:0x01d0, B:43:0x01ab, B:27:0x00e0, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r11v5 short[]) = (r11v3 short[]), (r11v2 short[]), (r11v2 short[]), (r11v2 short[]) binds: [B:47:0x01d0, B:43:0x01ab, B:27:0x00e0, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r12v5 int) = (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:47:0x01d0, B:43:0x01ab, B:27:0x00e0, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x01d2: PHI (r13v5 int) = (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:47:0x01d0, B:43:0x01ab, B:27:0x00e0, B:6:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0281 A[PHI: r9 r20
      0x0281: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short) binds: [B:62:0x027f, B:58:0x025f, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0281: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:62:0x027f, B:58:0x025f, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.ComponentCallbacksC11612
    public final void onViewCreated(View view, Bundle bundle) {
        int iM2761;
        int i;
        int i2;
        int i3 = C1783.f6087;
        int i4 = C2834.f9334;
        int iM2762 = C0619.m2761("᩷۠") ^ i3;
        int i5 = ((iM2762 ^ i4) * (-6037)) ^ (-1966079010);
        C22761 c22761 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM2762 ^ 1005495963;
        int iM2763 = 0;
        int iM3169 = 0;
        int iM2764 = 0;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 747427155;
        short[] sArr4 = null;
        int i11 = 0;
        while (true) {
            i10 = i6 ^ (i5 & (((i10 ^ i4) * (-22193)) >> 31));
            switch (i10) {
                case -2004576969:
                case 1950329773:
                    iM2763 = 2102612224 ^ C0619.m2761(C1321.m4861(sArr3, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 3, i8));
                    if (C1321.m4852()) {
                        iM2761 = (C0619.m2761("᩶ۛ") + i3) * (-125);
                        i = ((iM2761 ^ i4) * 22425) ^ (-683882668);
                        i2 = -1462229785;
                    } else {
                        iM2761 = C0773.m3169("ᩳܺ") ^ i4;
                        i = ((iM2761 ^ i3) * 28325) ^ 760738939;
                        i2 = 483359634;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -2002176161:
                case -1416249618:
                    this.f33676 = C3448.m11246(view, iM2764 ^ i7);
                    sArr3 = f33674;
                    if (C2375.m8065() <= 0) {
                        iM2761 = (i3 - C0619.m2761("᩻۟")) * (-9);
                        i = ((iM2761 ^ i4) * (-6395)) ^ 2137800802;
                        i2 = -585756150;
                    } else {
                        iM2761 = C0773.m3169("ܺ᩶") ^ i4;
                        i = ((iM2761 ^ i3) * 31555) ^ 1838512404;
                        i2 = -942810469;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1908300351:
                case -10473856:
                    C2310.m7810(c22761.m51321(), getViewLifecycleOwner(), new InterfaceC16438() { // from class: l.ۡ᩺ۧ
                        @Override // l.InterfaceC16438
                        /* JADX INFO: renamed from: ۙ */
                        public final void mo1486(Object obj) {
                            C10608.m27076(this.f31342, (C20283) obj);
                        }
                    });
                    break;
                case -1880023727:
                case -1800327057:
                    iM2764 = C0619.m2761(C2485.m8350(sArr4, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 3, i8));
                    i7 = 2097668218;
                    if (C0862.f3233 != 0) {
                        iM2761 = C0619.m2761("֫ۘ") ^ i4;
                        i = ((iM2761 ^ i3) * (-19319)) ^ 2009035356;
                        i2 = -2012241730;
                    } else {
                        iM2761 = C0619.m2761("᩺ۚ") ^ i3;
                        i = ((iM2761 ^ i4) * (-16645)) ^ (-2004812333);
                        i2 = -1029806839;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1655593825:
                case 1910109220:
                    sArr = f33674;
                    if (C2702.m8876()) {
                        iM2761 = C0619.m2761("᩹ۗ") ^ i4;
                        i = ((iM2761 ^ i3) * (-7111)) ^ 1417925755;
                        i2 = -1815127740;
                    } else {
                        iM2761 = (C0773.m3169("ܺᩳ") + i3) * (-81);
                        i = ((iM2761 ^ i4) * 5085) ^ 909613020;
                        i2 = -1438969903;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1336535215:
                case -19360762:
                    iM3169 = C0773.m3169(C1080.m4056(sArr2, i9, i11, i8));
                    if (C2702.m8876()) {
                        iM2761 = C0619.m2761("ܶۙ") ^ i4;
                        i = ((iM2761 ^ i3) * (-20879)) ^ (-886256494);
                        i2 = -1313462457;
                    } else {
                        iM2761 = C0773.m3169("ᩳܺ") ^ i4;
                        i = ((iM2761 ^ i3) * 28325) ^ 760738939;
                        i2 = 483359634;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1326492758:
                case 1683321682:
                    i8 = 50548;
                    iM2761 = (C0619.m2761("᩶֨") + i3) * (-99);
                    i = ((iM2761 ^ i4) * (-12459)) ^ 1422181195;
                    i2 = -1224538783;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1185713612:
                case 1348787696:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = (C0773.m3169("۠᩷") + i3) * 81;
                        i = ((iM2761 ^ i4) * (-643)) ^ 2069982578;
                        i2 = 1079475842;
                    } else {
                        iM2761 = (C0773.m3169("ܺᩳ") + i3) * (-81);
                        i = ((iM2761 ^ i4) * 5085) ^ 909613020;
                        i2 = -1438969903;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -951671837:
                case 76185660:
                    C1321.m4852();
                    C0773.m3161();
                    iM2761 = (C0773.m3169("۠᩷") + i3) * 81;
                    i = ((iM2761 ^ i4) * (-643)) ^ 2069982578;
                    i2 = 1079475842;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -950799815:
                case 965015325:
                    i8 = 25506;
                    iM2761 = (C0619.m2761("᩶֨") + i3) * (-99);
                    i = ((iM2761 ^ i4) * (-12459)) ^ 1422181195;
                    i2 = -1224538783;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -631359206:
                case -75982807:
                    super.onViewCreated(view, bundle);
                    sArr2 = f33674;
                    i9 = 114;
                    i11 = 3;
                    if (C0487.m2356() >= 0) {
                        iM2761 = C0773.m3169("ᩳܺ") ^ i4;
                        i = ((iM2761 ^ i3) * 28325) ^ 760738939;
                        i2 = 483359634;
                    } else {
                        iM2761 = C0619.m2761("ۛ۟") ^ i4;
                        i = ((iM2761 ^ i3) * (-1803)) ^ 384000381;
                        i2 = -1315833166;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -595208214:
                case -537534199:
                    s = sArr[113];
                    if (C11235.f35427 >= 0) {
                        iM2761 = (C0773.m3169("ܺᩳ") + i3) * (-81);
                        i = ((iM2761 ^ i4) * 5085) ^ 909613020;
                        i2 = -1438969903;
                    } else {
                        iM2761 = (C0619.m2761("ۖ۟") ^ i3) * (-3);
                        i = ((iM2761 ^ i4) * (-25673)) ^ (-804689985);
                        i2 = -734170604;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -259044099:
                case -178482089:
                    if (((s * s) + 151019521) - (s * 24578) < 0) {
                        iM2761 = C0773.m3169("ᩴ۠") ^ i4;
                        i = ((iM2761 ^ i3) * 4671) ^ (-1197213038);
                        i2 = 1993242657;
                    } else {
                        iM2761 = (C0619.m2761("᩶۫") ^ i3) * (-41);
                        i = ((iM2761 ^ i4) * (-15323)) ^ (-637497615);
                        i2 = 2037829015;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -78607877:
                case 1779189046:
                    C17502 c17502 = (C17502) C3448.m11246(view, iM2763);
                    this.f33681 = c17502;
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0619.m2761("֫ۘ") ^ i4;
                        i = ((iM2761 ^ i3) * (-19319)) ^ 2009035356;
                        i2 = -2012241730;
                    } else {
                        c17502.m41039(new C1505(this));
                        this.f33678 = true;
                        c22761 = this.f33686;
                        if (C1542.f5343 <= 0) {
                            iM2761 = (C0773.m3169("۠᩷") + i3) * 81;
                            i = ((iM2761 ^ i4) * (-643)) ^ 2069982578;
                            i2 = 1079475842;
                        } else {
                            iM2761 = (i4 - C0619.m2761("ܽ۫")) * 13;
                            i = ((iM2761 ^ i3) * (-20597)) ^ 1361575653;
                            i2 = -1997285029;
                        }
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -16812812:
                case 2052007443:
                    this.f33677 = C3448.m11246(view, 2129986335 ^ iM3169);
                    sArr4 = f33674;
                    if (C0619.f2439) {
                        iM2761 = C0619.m2761("֫ۘ") ^ i4;
                        i = ((iM2761 ^ i3) * (-19319)) ^ 2009035356;
                        i2 = -2012241730;
                    } else {
                        iM2761 = C0619.m2761("ۚܳ") ^ i3;
                        i = ((iM2761 ^ i4) * 5481) ^ (-1700072087);
                        i2 = -976900290;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 985017119:
                case 2030295284:
                    C3779.m12264();
                    break;
                case 1401288037:
                case 1826574523:
                    C2878.m9491();
                    if (C17202.f56030) {
                        iM2761 = (C0773.m3169("۠᩷") + i3) * 81;
                        i = ((iM2761 ^ i4) * (-643)) ^ 2069982578;
                        i2 = 1079475842;
                    } else {
                        iM2761 = C0619.m2761("֫ۘ") ^ i4;
                        i = ((iM2761 ^ i3) * (-19319)) ^ 2009035356;
                        i2 = -2012241730;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    C2702.m8876();
                    if (C1783.f6087 > 0) {
                        iM2761 = C0619.m2761("֫ۘ") ^ i4;
                        i = ((iM2761 ^ i3) * (-19319)) ^ 2009035356;
                        i2 = -2012241730;
                    } else {
                        iM2761 = C0773.m3169("ᩳܺ") ^ i4;
                        i = ((iM2761 ^ i3) * 28325) ^ 760738939;
                        i2 = 483359634;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC9051, l.ComponentCallbacksC11612
    public final void onSaveInstanceState(Bundle bundle) {
        InterfaceC19777 interfaceC19777Mo1447 = null;
        int i = -1749197393;
        int i2 = C1519.f5300;
        int i3 = C1783.f6087;
        int iM3169 = C0773.m3169("ܿ۟") ^ i3;
        int i4 = ((iM3169 ^ i2) * (-27103)) ^ 1524116636;
        int i5 = 2029355583;
        while (true) {
            i = ((((i ^ i2) * (-18835)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2059136451:
                case 1984972438:
                    if (C0619.f2439) {
                        iM3169 = C0773.m3169("᩷ۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-21469)) ^ 825269184;
                        i5 = 2073464700;
                    } else {
                        iM3169 = (i2 - C0619.m2761("ܺۨ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((iM3169 ^ i3) * (-20113)) ^ (-1333861905);
                        i5 = 2126407410;
                    }
                    break;
                case -2026057071:
                case -629368006:
                    C21797 c21797 = (C21797) interfaceC19777Mo1447;
                    c21797.mo34769();
                    c21797.mo34768();
                    iM3169 = C0619.m2761("᩶۫") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-20375)) ^ (-114721243);
                    i5 = 1644985520;
                    break;
                case -2019884500:
                case -998768671:
                    if (C2834.f9334 <= 0) {
                        iM3169 = (C0773.m3169("᩷᩺") ^ i2) * 27;
                        i4 = ((iM3169 ^ i3) * 25709) ^ (-549696812);
                        i5 = 1768549795;
                    } else {
                        iM3169 = C0773.m3169("ۗܽ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-31121)) ^ 1434537340;
                        i5 = 104405044;
                    }
                    break;
                case -1715335955:
                case -1061673467:
                    super.onSaveInstanceState(bundle);
                    interfaceC19777Mo1447 = mo1447();
                    if (interfaceC19777Mo1447 != null) {
                        iM3169 = C0619.m2761("۫ܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-13499)) ^ (-1103901247);
                        i5 = -1874317465;
                    } else {
                        iM3169 = C0619.m2761("᩶۫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-20375)) ^ (-114721243);
                        i5 = 1644985520;
                    }
                    break;
                case -1711695181:
                case 1063977904:
                    if (C13473.f42873 != 0) {
                        iM3169 = (C0619.m2761("۠ܶ") + i2) * 95;
                        i4 = ((iM3169 ^ i3) * (-493)) ^ (-209977113);
                        i5 = -1753009316;
                    } else {
                        iM3169 = (C0773.m3169("ۘ۫") ^ i3) * (-3);
                        i4 = ((iM3169 ^ i2) * (-26047)) ^ 1892305328;
                        i5 = -1964127291;
                    }
                    break;
                case -1416876908:
                case 656481226:
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0773.m3169("᩷ۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-21469)) ^ 825269184;
                        i5 = 2073464700;
                    } else {
                        iM3169 = (C0619.m2761("᩵᩸") ^ i2) * 39;
                        i4 = ((iM3169 ^ i3) * (-25441)) ^ (-1261901117);
                        i5 = -1950880792;
                    }
                    break;
                case -1179662827:
                case 1658368795:
                    if (C2288.m7767()) {
                        iM3169 = (C0619.m2761("۠ܶ") + i2) * 95;
                        i4 = ((iM3169 ^ i3) * (-493)) ^ (-209977113);
                        i5 = -1753009316;
                    } else {
                        iM3169 = C0619.m2761("ᩴܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 13319) ^ (-647793470);
                        i5 = -1378361872;
                    }
                    break;
                case -1116612678:
                case 1779077315:
                    break;
                case -434467396:
                case 851512393:
                    if (AbstractC0116.m1243() != 0) {
                        iM3169 = C0773.m3169("᩷ۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-21469)) ^ 825269184;
                        i5 = 2073464700;
                    } else {
                        iM3169 = C0773.m3169("۠ܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 11473) ^ (-1200569081);
                        i5 = -555861058;
                    }
                    break;
                case -404713660:
                case 772503115:
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0619.m2761("۠ܶ") + i2) * 95;
                        i4 = ((iM3169 ^ i3) * (-493)) ^ (-209977113);
                        i5 = -1753009316;
                    } else {
                        iM3169 = C0773.m3169("۟ۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 12337) ^ (-1971135349);
                        i5 = -814702558;
                    }
                    break;
                case -80778089:
                case 801883353:
                    if (C2287.f7432 >= 0) {
                        iM3169 = (C0619.m2761("۠ܶ") + i2) * 95;
                        i4 = ((iM3169 ^ i3) * (-493)) ^ (-209977113);
                        i5 = -1753009316;
                    } else {
                        iM3169 = (i3 - C0773.m3169("᩹ۙ")) * (-45);
                        i4 = ((iM3169 ^ i2) * 6063) ^ 2143899066;
                        i5 = -1628006878;
                    }
                    break;
                case 27293660:
                case 640593679:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0773.m3169("᩷ۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-21469)) ^ 825269184;
                        i5 = 2073464700;
                    } else {
                        iM3169 = C0619.m2761("ۢܰ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-16623)) ^ (-1326978124);
                        i5 = 1969206984;
                    }
                    break;
                case 91010473:
                case 1806451552:
                    C3690.m11987();
                    if (C1542.f5343 <= 0) {
                        iM3169 = (C0619.m2761("۠ܶ") + i2) * 95;
                        i4 = ((iM3169 ^ i3) * (-493)) ^ (-209977113);
                        i5 = -1753009316;
                    } else {
                        iM3169 = (C0773.m3169("᩸᩺") ^ i3) * (-53);
                        i4 = ((iM3169 ^ i2) * (-18469)) ^ (-1483260875);
                        i5 = -1647283799;
                    }
                    break;
                case 832691675:
                case 900398291:
                    if (!C17202.f56030) {
                        iM3169 = (C0773.m3169("᩸᩺") ^ i3) * (-53);
                        i4 = ((iM3169 ^ i2) * (-18469)) ^ (-1483260875);
                        i5 = -1647283799;
                    } else {
                        iM3169 = (C0773.m3169("᩷᩺") ^ i2) * 27;
                        i4 = ((iM3169 ^ i3) * 25709) ^ (-549696812);
                        i5 = 1768549795;
                    }
                    break;
                case 1061461717:
                case 1099129265:
                    C3779.m12264();
                    break;
                case 1236427511:
                case 1741322263:
                    C3779.m12264();
                    iM3169 = (C0773.m3169("᩸᩺") ^ i3) * (-53);
                    i4 = ((iM3169 ^ i2) * (-18469)) ^ (-1483260875);
                    i5 = -1647283799;
                    break;
                case 1275964036:
                case 2132816377:
                    if (C2354.m7983()) {
                        iM3169 = (C0773.m3169("᩶ᩴ") ^ i2) * 59;
                        i4 = ((iM3169 ^ i3) * (-20301)) ^ (-1611720239);
                        i5 = 1926975655;
                    } else {
                        iM3169 = (C0773.m3169("᩸᩺") ^ i3) * (-53);
                        i4 = ((iM3169 ^ i2) * (-18469)) ^ (-1483260875);
                        i5 = -1647283799;
                    }
                    break;
                default:
                    if (C2375.m8065() <= 0) {
                        iM3169 = (C0619.m2761("۠ܶ") + i2) * 95;
                        i4 = ((iM3169 ^ i3) * (-493)) ^ (-209977113);
                        i5 = -1753009316;
                    } else {
                        iM3169 = C0619.m2761("ܺ֨") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-7333)) ^ 2002196627;
                        i5 = -1113143670;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m27089() {
        this.f33682 = true;
    }

    @Override // l.AbstractC9051
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC19777 mo1447() {
        C20283 c20283 = null;
        C9378 c9378M24173 = null;
        C17502 c17502 = null;
        int i = -1225685495;
        int i2 = C2419.f7754;
        int i3 = C2834.f9334;
        int iM2761 = C0619.m2761("᩹ۨ") ^ i2;
        int i4 = ((iM2761 ^ i3) * 11871) ^ (-1476402565);
        int i5 = -899439720;
        while (true) {
            i = ((((i ^ i3) * 32587) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2126106673:
                case 875193342:
                    c17502 = this.f33681;
                    if (c17502 != null) {
                        iM2761 = C0773.m3169("ܳۙ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 26527) ^ 814676638;
                        i5 = 654608705;
                    } else {
                        iM2761 = (i3 - C0773.m3169("᩺ᩳ")) * (-21);
                        i4 = ((iM2761 ^ i2) * 16529) ^ 1493622851;
                        i5 = 1209396454;
                    }
                    break;
                case -2092083155:
                case -517205436:
                    if (C11235.m28309() != 0) {
                        iM2761 = (i2 - C0619.m2761("֫ۜ")) * (-67);
                        i4 = ((iM2761 ^ i3) * (-21243)) ^ 691057647;
                        i5 = 1044852370;
                    } else {
                        iM2761 = C0619.m2761("ᩳ۬") ^ i2;
                        i4 = ((iM2761 ^ i3) * 5885) ^ (-1724279482);
                        i5 = -1134651219;
                    }
                    break;
                case -1572233622:
                case -1377764748:
                    if (this.f33678) {
                        iM2761 = (i3 - C0619.m2761("ۙܰ")) * (-77);
                        i4 = ((iM2761 ^ i2) * (-12709)) ^ (-187324955);
                        i5 = -2122977397;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩵ᩳ")) * (-35);
                        i4 = ((iM2761 ^ i2) * (-14279)) ^ 2069980586;
                        i5 = 804095738;
                    }
                    break;
                case -1503413072:
                case 465472446:
                    c9378M24173 = m24173(c20283.m11163());
                    if (C1080.f3865 >= 0) {
                        iM2761 = C0773.m3169("ܰ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-11653)) ^ (-1085954840);
                        i5 = -1671461803;
                    } else {
                        iM2761 = (i2 - C0619.m2761("᩷ܿ")) * (-5);
                        i4 = ((iM2761 ^ i3) * 21873) ^ 889350256;
                        i5 = -1893136503;
                    }
                    break;
                case -1389824079:
                case 1990135367:
                    C2485.m8357();
                    if (C2485.f7950 == 0) {
                        iM2761 = C0773.m3169("᩵᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14735)) ^ 82734692;
                        i5 = 1553760039;
                    } else {
                        iM2761 = (C0619.m2761("᩻ۖ") ^ i2) * (-127);
                        i4 = ((iM2761 ^ i3) * 4587) ^ 789140495;
                        i5 = -226937932;
                    }
                    break;
                case -1351373107:
                case 1933754231:
                    return new C21797(this, c17502, c9378M24173);
                case -1248989782:
                case 855841857:
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0773.m3169("ܰ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-11653)) ^ (-1085954840);
                        i5 = -1671461803;
                    } else {
                        iM2761 = (C0619.m2761("ۚᩳ") ^ i3) * (-103);
                        i4 = ((iM2761 ^ i2) * (-19353)) ^ (-1977719068);
                        i5 = -1708062900;
                    }
                    break;
                case -1193910271:
                case -1081159163:
                    C3492.m11488();
                    C3998.m12920();
                    iM2761 = (i3 - C0619.m2761("ۙ֡")) * (-99);
                    i4 = ((iM2761 ^ i2) * (-15855)) ^ (-880015961);
                    i5 = -1486189921;
                    break;
                case -968230849:
                case 925661563:
                    throw new RuntimeException();
                case -789572712:
                case -488385660:
                    if (this.f33683) {
                        iM2761 = (i3 - C0619.m2761("᩵ᩳ")) * (-35);
                        i4 = ((iM2761 ^ i2) * (-14279)) ^ 2069980586;
                        i5 = 804095738;
                    } else {
                        iM2761 = (C0773.m3169("ۡۜ") ^ i2) * 83;
                        i4 = ((iM2761 ^ i3) * 27493) ^ (-629983455);
                        i5 = -1820431241;
                    }
                    break;
                case -690380457:
                case 338214036:
                    if (!RunnableC1848.m6360()) {
                        iM2761 = (C0619.m2761("᩻ۖ") ^ i2) * (-127);
                        i4 = ((iM2761 ^ i3) * 4587) ^ 789140495;
                        i5 = -226937932;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۙ֡")) * (-99);
                        i4 = ((iM2761 ^ i2) * (-15855)) ^ (-880015961);
                        i5 = -1486189921;
                    }
                    break;
                case -628071137:
                case 878399113:
                    if (C0619.f2439) {
                        iM2761 = C0773.m3169("ܰ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-11653)) ^ (-1085954840);
                        i5 = -1671461803;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۙܶ")) * (-63);
                        i4 = ((iM2761 ^ i2) * 32321) ^ (-1711313435);
                        i5 = 1280171962;
                    }
                    break;
                case -583794986:
                case 967787622:
                    if (C4238.m13540() <= 0) {
                        iM2761 = C0773.m3169("ܰ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-11653)) ^ (-1085954840);
                        i5 = -1671461803;
                    } else {
                        iM2761 = (C0619.m2761("᩹ۗ") ^ i2) * (-125);
                        i4 = ((iM2761 ^ i3) * 15255) ^ 1605099592;
                        i5 = 62718067;
                    }
                    break;
                case -311808107:
                case 828348969:
                    if (C2878.f9462) {
                        iM2761 = (i2 - C0619.m2761("֫ۜ")) * (-67);
                        i4 = ((iM2761 ^ i3) * (-21243)) ^ 691057647;
                        i5 = 1044852370;
                    } else {
                        iM2761 = C0773.m3169("ۛۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-16629)) ^ (-1901577346);
                        i5 = -1908736790;
                    }
                    break;
                case -239566889:
                case -66716014:
                    C20932.m47848();
                    return null;
                case 93485017:
                case 332825684:
                    C1321.m4852();
                    if (AbstractC3624.f12429 > 0) {
                        iM2761 = C0773.m3169("ܰ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-11653)) ^ (-1085954840);
                        i5 = -1671461803;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۙ֡")) * (-99);
                        i4 = ((iM2761 ^ i2) * (-15855)) ^ (-880015961);
                        i5 = -1486189921;
                    }
                    break;
                case 105768457:
                case 768624966:
                    if (C3077.m10041()) {
                        iM2761 = C0773.m3169("ܰ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-11653)) ^ (-1085954840);
                        i5 = -1671461803;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩹ܺ")) * 101;
                        i4 = ((iM2761 ^ i2) * 14245) ^ (-816459819);
                        i5 = 2137087789;
                    }
                    break;
                case 112354000:
                case 1684432858:
                    return null;
                case 300965357:
                case 1108826525:
                    c20283 = this.f33675;
                    if (c20283 != null) {
                        iM2761 = (C0773.m3169("ᩴۖ") ^ i2) * 85;
                        i4 = ((iM2761 ^ i3) * 25405) ^ (-103843612);
                        i5 = -1641584112;
                    } else {
                        iM2761 = (i3 - C0619.m2761("᩵ᩳ")) * (-35);
                        i4 = ((iM2761 ^ i2) * (-14279)) ^ 2069980586;
                        i5 = 804095738;
                    }
                    break;
                case 1300842227:
                case 1566340783:
                    if (C1783.f6087 <= 0) {
                        iM2761 = C0773.m3169("᩵᩸") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-14735)) ^ 82734692;
                        i5 = 1553760039;
                    } else {
                        iM2761 = (C0773.m3169("۫֫") + i3) * 45;
                        i4 = ((iM2761 ^ i2) * 8793) ^ 1411229822;
                        i5 = -2103069998;
                    }
                    break;
                case 1710741302:
                case 1925060066:
                    if (C0487.f2131 <= 0) {
                        iM2761 = (i2 - C0619.m2761("֫ۜ")) * (-67);
                        i4 = ((iM2761 ^ i3) * (-21243)) ^ 691057647;
                        i5 = 1044852370;
                    } else {
                        iM2761 = (C0619.m2761("᩷ᩳ") + i3) * (-113);
                        i4 = ((iM2761 ^ i2) * (-1499)) ^ 1665134253;
                        i5 = -1912519637;
                    }
                    break;
                default:
                    if (C2878.f9462) {
                        iM2761 = (i2 - C0619.m2761("֫ۜ")) * (-67);
                        i4 = ((iM2761 ^ i3) * (-21243)) ^ 691057647;
                        i5 = 1044852370;
                    } else {
                        iM2761 = C0619.m2761("ۡۨ") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-15701)) ^ 1820505236;
                        i5 = -1150025236;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27077(C10608 c10608, C20348 c20348) {
        int i = 0;
        int i2 = 1852557696;
        int i3 = C2310.f7472;
        int i4 = C2702.f8586;
        int iM2761 = (C0619.m2761("ܶܺ") ^ i4) * 93;
        int i5 = ((iM2761 ^ i3) * 7351) ^ 71457101;
        int i6 = -597405105;
        while (true) {
            i2 = ((((i2 ^ i3) * (-26727)) >> 31) & i5) ^ (iM2761 ^ i6);
            switch (i2) {
                case -2047330201:
                case -704628416:
                    c10608.f33680 = C4282.m13659(c20348);
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0773.m3169("ۚ۟") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-16377)) ^ (-1268441661);
                        i6 = 1205396903;
                    } else {
                        iM2761 = (C0773.m3169("ᩳۢ") ^ i3) * (-77);
                        i5 = ((iM2761 ^ i4) * 24179) ^ (-937247399);
                        i6 = -1343165024;
                    }
                    break;
                case -1819092265:
                case -30160531:
                    if (C2375.m8065() <= 0) {
                        iM2761 = (C0773.m3169("᩶۫") + i3) * (-53);
                        i5 = ((iM2761 ^ i4) * 12613) ^ 1632940561;
                        i6 = -1519161712;
                    } else {
                        iM2761 = (i4 - C0619.m2761("ۨܺ")) * (-15);
                        i5 = ((iM2761 ^ i3) * (-1885)) ^ (-1036632857);
                        i6 = -598259273;
                    }
                    break;
                case -1753181455:
                case -1160107752:
                    i = 1382253411;
                    if (RunnableC3646.f12471) {
                        iM2761 = (C0773.m3169("᩶۫") + i3) * (-53);
                        i5 = ((iM2761 ^ i4) * 12613) ^ 1632940561;
                        i6 = -1519161712;
                    } else {
                        iM2761 = (C0619.m2761("ۤۨ") ^ i3) * (-67);
                        i5 = ((iM2761 ^ i4) * 28495) ^ (-28160819);
                        i6 = -654041921;
                    }
                    break;
                case -1241915257:
                case -413166008:
                    if (AbstractC0116.m1243() != 0) {
                        iM2761 = (C0773.m3169("᩶۫") + i3) * (-53);
                        i5 = ((iM2761 ^ i4) * 12613) ^ 1632940561;
                        i6 = -1519161712;
                    } else {
                        iM2761 = C0619.m2761("᩶᩵") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-10783)) ^ 1513325138;
                        i6 = 2043901416;
                    }
                    break;
                case -1227444152:
                case 1365030580:
                    if (C2966.m9664()) {
                        iM2761 = C0619.m2761("ܿ֫") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-25211)) ^ (-15443966);
                        i6 = -1355704392;
                    } else {
                        iM2761 = (C0773.m3169("۫ۤ") + i4) * 69;
                        i5 = ((iM2761 ^ i3) * 27653) ^ 2021497268;
                        i6 = 1063051545;
                    }
                    break;
                case -504852111:
                case 252906232:
                    C0862.m3503();
                    C2419.m8174();
                    iM2761 = C0773.m3169("ۚ۟") ^ i4;
                    i5 = ((iM2761 ^ i3) * (-16377)) ^ (-1268441661);
                    i6 = 1205396903;
                    break;
                case -334107423:
                case 1714520880:
                    if (C0487.f2131 <= 0) {
                        iM2761 = C0619.m2761("᩹ۘ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-18119)) ^ (-950186809);
                        i6 = -1015505025;
                    } else {
                        iM2761 = C0619.m2761("᩻ۧ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-15399)) ^ (-1888314819);
                        i6 = -2022865375;
                    }
                    break;
                case -59315453:
                case 500836989:
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0773.m3169("ۚ۟") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-16377)) ^ (-1268441661);
                        i6 = 1205396903;
                    } else {
                        iM2761 = (i3 - C0619.m2761("ۚ᩺")) * (-7);
                        i5 = ((iM2761 ^ i4) * 29229) ^ 611094680;
                        i6 = 1117371265;
                    }
                    break;
                case -45202947:
                case 263641438:
                    C3448.m11248();
                    C3099.m10095();
                    break;
                case 59443722:
                case 2138318629:
                    if (C2375.f7641 > 0) {
                        iM2761 = C0619.m2761("᩹ۘ") ^ i3;
                        i5 = ((iM2761 ^ i4) * (-18119)) ^ (-950186809);
                        i6 = -1015505025;
                    } else {
                        iM2761 = (C0773.m3169("۫ۤ") + i4) * 69;
                        i5 = ((iM2761 ^ i3) * 27653) ^ 2021497268;
                        i6 = 1063051545;
                    }
                    break;
                case 357150553:
                case 2090838228:
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0773.m3169("۫ۤ") + i4) * 69;
                        i5 = ((iM2761 ^ i3) * 27653) ^ 2021497268;
                        i6 = 1063051545;
                    } else {
                        iM2761 = C0773.m3169("ۚ۟") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-16377)) ^ (-1268441661);
                        i6 = 1205396903;
                    }
                    break;
                case 440344865:
                case 1019541570:
                    c10608.f33681.m41042(c20348);
                    break;
                case 685512270:
                case 1115584976:
                    if (C3998.f13671 != 0) {
                        iM2761 = C0773.m3169("ۚ۟") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-16377)) ^ (-1268441661);
                        i6 = 1205396903;
                    } else {
                        iM2761 = C0773.m3169("ۚۖ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-7713)) ^ (-355736338);
                        i6 = -538005903;
                    }
                    break;
                case 699768214:
                case 1032623008:
                    C17364.m40795((InterfaceC15872) c20348, i);
                    if (RunnableC3646.f12471) {
                        iM2761 = (C0773.m3169("᩶۫") + i3) * (-53);
                        i5 = ((iM2761 ^ i4) * 12613) ^ 1632940561;
                        i6 = -1519161712;
                    } else {
                        iM2761 = C0619.m2761("᩹۫") ^ i4;
                        i5 = ((iM2761 ^ i3) * 3327) ^ 1818833582;
                        i6 = -845814711;
                    }
                    break;
                case 834591979:
                case 1246088611:
                    if (C2023.f6737) {
                        iM2761 = C0773.m3169("ۚ۟") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-16377)) ^ (-1268441661);
                        i6 = 1205396903;
                    } else {
                        iM2761 = C0773.m3169("ܳ۠") ^ i3;
                        i5 = ((iM2761 ^ i4) * 7877) ^ (-860226794);
                        i6 = -17892582;
                    }
                    break;
                default:
                    if (C0773.f2792 > 0) {
                        iM2761 = C0773.m3169("ۚ۟") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-16377)) ^ (-1268441661);
                        i6 = 1205396903;
                    } else {
                        iM2761 = (C0619.m2761("ܺ᩶") ^ i3) * 15;
                        i5 = ((iM2761 ^ i4) * 29115) ^ (-1910231868);
                        i6 = -2081477677;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m27092() {
        return this.f33680;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006d  */
    /* JADX WARN: Code duplicated, block: B:59:0x01fa A[PHI: r2 r8 r9
      0x01fa: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v4 java.lang.String) binds: [B:58:0x01f8, B:38:0x0123] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r8v4 int) = (r8v3 int), (r8v2 int) binds: [B:58:0x01f8, B:38:0x0123] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r9v4 int) = (r9v3 int), (r9v2 int) binds: [B:58:0x01f8, B:38:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0230 A[PHI: r3 r7 r13 r14 r15
      0x0230: PHI (r3v4 android.os.Bundle) = (r3v2 android.os.Bundle), (r3v3 android.os.Bundle), (r3v2 android.os.Bundle), (r3v2 android.os.Bundle) binds: [B:62:0x022e, B:34:0x0101, B:30:0x00de, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r7v4 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:62:0x022e, B:34:0x0101, B:30:0x00de, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r13v4 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:62:0x022e, B:34:0x0101, B:30:0x00de, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:62:0x022e, B:34:0x0101, B:30:0x00de, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int) binds: [B:62:0x022e, B:34:0x0101, B:30:0x00de, B:12:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0265 A[PHI: r6 r11
      0x0265: PHI (r6v4 char) = (r6v3 char), (r6v2 char), (r6v2 char) binds: [B:66:0x0263, B:15:0x0067, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r11v3 short) = (r11v2 short), (r11v2 short), (r11v5 short) binds: [B:66:0x0263, B:15:0x0067, B:6:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0299 A[PHI: r1 r10 r20
      0x0299: PHI (r1v5 l.ۗ۫ۙ) = (r1v2 l.ۗ۫ۙ), (r1v2 l.ۗ۫ۙ), (r1v4 l.ۗ۫ۙ), (r1v2 l.ۗ۫ۙ) binds: [B:70:0x0297, B:54:0x01d5, B:42:0x0146, B:9:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int) binds: [B:70:0x0297, B:54:0x01d5, B:42:0x0146, B:9:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0299: PHI (r20v5 short[]) = (r20v4 short[]), (r20v3 short[]), (r20v3 short[]), (r20v3 short[]) binds: [B:70:0x0297, B:54:0x01d5, B:42:0x0146, B:9:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC9051, l.ComponentCallbacksC11612
    public final void onResume() {
        int iM2761;
        int i;
        int i2;
        int i3 = AbstractC0116.f1064;
        int i4 = C2966.f9654;
        int iM2762 = (i3 - C0619.m2761("ܿۗ")) * (-87);
        int i5 = ((iM2762 ^ i4) * (-3263)) ^ 1609831146;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM2762 ^ (-742222601);
        char c = 0;
        short s = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 858093155;
        String strM8060 = null;
        Bundle bundleRequireArguments = null;
        String strMo1440 = null;
        ActivityC3409 activityC3409M11768 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-23467)) >> 31));
            switch (i13) {
                case -2110960059:
                case 675298990:
                    C1146.m4231();
                    break;
                case -1922031984:
                case 1842288164:
                    ((ActivityC0848) AbstractC0116.m1234(this)).m3428((CharSequence) m27091());
                    break;
                case -1876060469:
                case -1845706981:
                    ((ActivityC0848) AbstractC3624.m11768(this)).m3428((CharSequence) strM8060);
                    break;
                case -1831673838:
                case 2068408965:
                    activityC3409M11768.setTitle(strMo1440);
                    bundleRequireArguments = requireArguments();
                    if (C3779.f12953 <= 0) {
                        iM2761 = (C0619.m2761("۠ܰ") ^ i3) * 59;
                        i = ((iM2761 ^ i4) * (-17979)) ^ 293944679;
                        i2 = -18247606;
                    } else {
                        iM2761 = (i3 - C0773.m3169("֨᩶")) * (-77);
                        i = ((iM2761 ^ i4) * 20237) ^ 1328170996;
                        i2 = 1745300602;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1813998551:
                case 137840658:
                    strM8060 = C2375.m8060(bundleRequireArguments, C1564.m5510(sArr2, i11, i12, i10));
                    if (strM8060 != null) {
                        iM2761 = C0619.m2761("ܰ᩵") ^ i4;
                        i = ((iM2761 ^ i3) * 2947) ^ 1591900030;
                        i2 = 221424205;
                    } else {
                        iM2761 = (i4 - C0773.m3169("᩻֡")) * 89;
                        i = ((iM2761 ^ i3) * (-25493)) ^ (-532286217);
                        i2 = 329021093;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1574460607:
                case 1423673328:
                    int i14 = s + s2;
                    if (i9 - (i14 * i14) >= 0) {
                        iM2761 = (C0619.m2761("ۢ᩵") ^ i4) * (-5);
                        i = ((iM2761 ^ i3) * 4747) ^ (-1431493613);
                        i2 = 174765995;
                    } else {
                        iM2761 = C0619.m2761("᩸ᩳ") ^ i3;
                        i = ((iM2761 ^ i4) * (-26393)) ^ (-1178882714);
                        i2 = 1949778083;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1430457635:
                case -419674687:
                    if (C1146.f4234 < 0) {
                        iM2761 = C0773.m3169("ۛܳ") ^ i3;
                        i = ((iM2761 ^ i4) * (-12241)) ^ 382660962;
                        i2 = 744364202;
                    } else {
                        iM2761 = (C0619.m2761("ܶ᩷") + i3) * (-79);
                        i = ((iM2761 ^ i4) * (-17879)) ^ (-187827717);
                        i2 = -2007809823;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1427288816:
                case 1217300849:
                    sArr2 = f33674;
                    i11 = IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i12 = 6;
                    if (C0269.f1558 <= 0) {
                        iM2761 = (C0619.m2761("۠ܰ") ^ i3) * 59;
                        i = ((iM2761 ^ i4) * (-17979)) ^ 293944679;
                        i2 = -18247606;
                    } else {
                        iM2761 = C0619.m2761("ܽܺ") ^ i3;
                        i = ((iM2761 ^ i4) * 5407) ^ 893418085;
                        i2 = -1744925176;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -1108578164:
                case -468805093:
                    i10 = 22939;
                    iM2761 = C0773.m3169("ܽۜ") ^ i3;
                    i = ((iM2761 ^ i4) * 19729) ^ (-2019701226);
                    i2 = -589310336;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -690924688:
                case 2068544937:
                    c = 'j';
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0773.m3169("ۘ֡") + i4) * (-57);
                        i = ((iM2761 ^ i3) * (-13089)) ^ (-1834331628);
                        i2 = 332698792;
                    } else {
                        iM2761 = (C0773.m3169("ۛۡ") + i4) * (-21);
                        i = ((iM2761 ^ i3) * 8931) ^ (-1398699947);
                        i2 = 520768857;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -662564962:
                case 1881863140:
                    i10 = 45540;
                    iM2761 = C0773.m3169("ܽۜ") ^ i3;
                    i = ((iM2761 ^ i4) * 19729) ^ (-2019701226);
                    i2 = -589310336;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -658387965:
                case -434499243:
                    super.onResume();
                    activityC3409M11768 = AbstractC3624.m11768(this);
                    if (C0619.f2439) {
                        iM2761 = (C0619.m2761("ܶ᩷") + i3) * (-79);
                        i = ((iM2761 ^ i4) * (-17879)) ^ (-187827717);
                        i2 = -2007809823;
                    } else {
                        iM2761 = (C0619.m2761("ܽۧ") ^ i4) * 5;
                        i = ((iM2761 ^ i3) * (-10397)) ^ (-1136944993);
                        i2 = 555239523;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case -246193643:
                case 636391566:
                    i7 = s * s;
                    i8 = 201441249;
                    if (C1321.f4751 >= 0) {
                        iM2761 = (i4 - C0619.m2761("᩹֨")) * (-125);
                        i = ((iM2761 ^ i3) * (-19051)) ^ (-1781945220);
                        i2 = -474801535;
                    } else {
                        iM2761 = C0619.m2761("۠ۙ") ^ i3;
                        i = ((iM2761 ^ i4) * (-24729)) ^ (-1764909105);
                        i2 = 1527210494;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 56134394:
                case 79078866:
                    s = sArr[c];
                    if (C13473.m33144()) {
                        iM2761 = (C0773.m3169("ܰ۠") + i4) * 11;
                        i = ((iM2761 ^ i3) * (-20371)) ^ 1896661586;
                        i2 = -443953793;
                    } else {
                        iM2761 = (C0619.m2761("۠ܰ") ^ i3) * 59;
                        i = ((iM2761 ^ i4) * (-17979)) ^ 293944679;
                        i2 = -18247606;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 132575178:
                case 202916142:
                    C2966.m9664();
                    if (C13473.f42873 == 0) {
                        iM2761 = C0773.m3169("ۛܳ") ^ i3;
                        i = ((iM2761 ^ i4) * (-12241)) ^ 382660962;
                        i2 = 744364202;
                    } else {
                        iM2761 = (C0773.m3169("ۘ֡") + i4) * (-57);
                        i = ((iM2761 ^ i3) * (-13089)) ^ (-1834331628);
                        i2 = 332698792;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 275311996:
                case 560892400:
                    C1783.m6232();
                    iM2761 = C0773.m3169("ۛܳ") ^ i3;
                    i = ((iM2761 ^ i4) * (-12241)) ^ 382660962;
                    i2 = 744364202;
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 290987166:
                case 1595492283:
                    int i15 = i7 + i8;
                    i9 = i15 + i15;
                    if (C3690.f12684 <= 0) {
                        iM2761 = (C0619.m2761("ܶ᩷") + i3) * (-79);
                        i = ((iM2761 ^ i4) * (-17879)) ^ (-187827717);
                        i2 = -2007809823;
                    } else {
                        iM2761 = (C0619.m2761("᩷ܶ") ^ i3) * 47;
                        i = ((iM2761 ^ i4) * (-8569)) ^ 123975897;
                        i2 = -799658591;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 813950158:
                case 1948966082:
                    strMo1440 = mo1440();
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = (i4 - C0619.m2761("᩹֨")) * (-125);
                        i = ((iM2761 ^ i3) * (-19051)) ^ (-1781945220);
                        i2 = -474801535;
                    } else {
                        iM2761 = C0619.m2761("۠ۚ") ^ i4;
                        i = ((iM2761 ^ i3) * 16433) ^ 732317410;
                        i2 = 265158187;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 846318668:
                case 1073781545:
                    if (C2354.f7599 >= 0) {
                        iM2761 = C0773.m3169("ۛܳ") ^ i3;
                        i = ((iM2761 ^ i4) * (-12241)) ^ 382660962;
                        i2 = 744364202;
                    } else {
                        iM2761 = (C0619.m2761("۠ܰ") ^ i3) * 59;
                        i = ((iM2761 ^ i4) * (-17979)) ^ 293944679;
                        i2 = -18247606;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                case 946049310:
                case 1241840147:
                    sArr = f33674;
                    if (C2023.f6737) {
                        iM2761 = (C0619.m2761("ܶ᩷") + i3) * (-79);
                        i = ((iM2761 ^ i4) * (-17879)) ^ (-187827717);
                        i2 = -2007809823;
                    } else {
                        iM2761 = C0619.m2761("۬֨") ^ i3;
                        i = ((iM2761 ^ i4) * (-29457)) ^ 1355780180;
                        i2 = -758156560;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
                default:
                    s2 = 14193;
                    if (C20932.m47848() != 0) {
                        iM2761 = (C0773.m3169("ۘ֡") + i4) * (-57);
                        i = ((iM2761 ^ i3) * (-13089)) ^ (-1834331628);
                        i2 = 332698792;
                    } else {
                        iM2761 = C0619.m2761("֫᩷") ^ i4;
                        i = ((iM2761 ^ i3) * 26063) ^ (-1949199188);
                        i2 = 1060678830;
                    }
                    i6 = iM2761 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x05d8 A[PHI: r3 r4 r7 r10 r11 r12 r13 r16 r17 r18 r20 r24 r25 r26 r32
      0x05d8: PHI (r3v51 java.lang.String) = (r3v10 java.lang.String), (r3v11 java.lang.String), (r3v40 java.lang.String), (r3v52 java.lang.String) binds: [B:115:0x05d6, B:111:0x05a9, B:79:0x036c, B:10:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x05d8: PHI (r4v42 int) = (r4v12 int), (r4v13 int), (r4v30 int), (r4v43 int) binds: [B:115:0x05d6, B:111:0x05a9, B:79:0x036c, B:10:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x05d8: PHI (r7v10 int) = (r7v2 int), (r7v2 int), (r7v5 int), (r7v2 int) binds: [B:115:0x05d6, B:111:0x05a9, B:79:0x036c, B:10:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x05d8: PHI (r10v13 int) = (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:115:0x05d6, B:111:0x05a9, B:79:0x036c, B:10:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x05d8: PHI (r11v9 java.lang.String) = (r11v2 java.lang.String), (r11v2 java.lang.String), (r11v3 java.lang.String), (r11v2 java.lang.String) binds: [B:115:0x05d6, B:111:0x05a9, B:79:0x036c, B:10:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x05d8: PHI (r12v9 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:115:0x05d6, B:111:0x05a9, B:79:0x036c, B:10:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x05d8: PHI (r13v9 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:115:0x05d6, B:111:0x05a9, B:79:0x036c, B:10:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x05d8: PHI (r16v37 int) = (r16v16 int), (r16v17 int), (r16v27 int), (r16v38 int) binds: [B:115:0x05d6, B:111:0x05a9, B:79:0x036c, B:10:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x05d8: PHI (r17v31 android.os.Bundle) = (r17v9 android.os.Bundle), (r17v10 android.os.Bundle), (r17v21 android.os.Bundle), (r17v32 android.os.Bundle) binds: [B:115:0x05d6, B:111:0x05a9, B:79:0x036c, B:10:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x05d8: PHI (r18v43 int) = (r18v10 int), (r18v11 int), (r18v32 int), (r18v44 int) binds: [B:115:0x05d6, B:111:0x05a9, B:79:0x036c, B:10:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x05d8: PHI (r20v42 int) = (r20v10 int), (r20v11 int), (r20v30 int), (r20v43 int) binds: [B:115:0x05d6, B:111:0x05a9, B:79:0x036c, B:10:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x05d8: PHI (r24v8 short) = (r24v3 short), (r24v2 short), (r24v2 short), (r24v2 short) binds: [B:115:0x05d6, B:111:0x05a9, B:79:0x036c, B:10:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x05d8: PHI (r25v8 int) = (r25v2 int), (r25v3 int), (r25v2 int), (r25v2 int) binds: [B:115:0x05d6, B:111:0x05a9, B:79:0x036c, B:10:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x05d8: PHI (r26v8 int) = (r26v2 int), (r26v3 int), (r26v2 int), (r26v2 int) binds: [B:115:0x05d6, B:111:0x05a9, B:79:0x036c, B:10:0x00a9] A[DONT_GENERATE, DONT_INLINE]
      0x05d8: PHI (r32v74 java.lang.String) = (r32v15 java.lang.String), (r32v16 java.lang.String), (r32v37 java.lang.String), (r32v75 java.lang.String) binds: [B:115:0x05d6, B:111:0x05a9, B:79:0x036c, B:10:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0110, code lost:
    
        if (l.C3734.f12817 < 0) goto L22;
     */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C5570 m27082(l.C10608 r37) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10608.m27082(l.ۤۘۧ):l.ۚۢᩴ");
    }

    @Override // l.ComponentCallbacksC11612
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int iM2761;
        int i;
        int i2;
        int i3;
        int iM3169;
        int i4;
        int i5;
        short[] sArr;
        int i6;
        String str;
        int i7;
        String str2;
        int iM31610;
        int i8;
        int i9;
        int i10;
        short[] sArr2;
        int i11;
        short[] sArr3;
        int iM2762;
        int i12;
        int i13;
        int iM31611;
        int i14;
        int i15;
        int i16 = -1631342814;
        int i17 = C3033.f9831;
        int i18 = C2287.f7432;
        int iM31612 = (i17 - C0773.m3169("۟۟")) * 39;
        int i19 = ((iM31612 ^ i18) * 3423) ^ 1819671205;
        int i20 = iM31612 ^ (-748056710);
        StringBuilder sb = null;
        String strM1785 = null;
        String strM2364 = null;
        String strM11770 = null;
        String[] strArr = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        int i21 = 0;
        int i22 = 0;
        boolean z = false;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        short s = 0;
        short s2 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        C4643 c4643 = null;
        String strMo1440 = null;
        String strM2365 = null;
        String strM12925 = null;
        String strM34865 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        C20956 c20956 = null;
        int i34 = 0;
        while (true) {
            i16 = i20 ^ (i19 & (((i16 ^ i18) * 27185) >> 31));
            switch (i16) {
                case -2022868438:
                case 1988168985:
                    return super.onOptionsItemSelected(menuItem);
                case -1950941237:
                case -1709581964:
                    i21 = i21;
                    sArr9 = sArr9;
                    strM1785 = strM1785;
                    C4643 c4644 = c4643;
                    strMo1440 = strMo1440;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    i22 = i22;
                    i30 = i30;
                    sb = sb;
                    z = z;
                    i24 = i24;
                    sArr4 = sArr4;
                    c4644.m22945(C0773.m3169(RunnableC1848.m6366(sArr4, 64, 3, i23)) ^ 2120424169);
                    if (C2375.f7641 > 0) {
                        int iM31613 = C0773.m3169("֨᩸") ^ i17;
                        c4643 = c4644;
                        i19 = ((iM31613 ^ i18) * 10949) ^ (-79105163);
                        sArr4 = sArr4;
                        i24 = i24;
                        i21 = i21;
                        sArr9 = sArr9;
                        i20 = iM31613 ^ (-389596495);
                        z = z;
                        sb = sb;
                        i30 = i30;
                        i22 = i22;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        strMo1440 = strMo1440;
                        strM1785 = strM1785;
                    } else {
                        c4643 = c4644;
                        sArr4 = sArr4;
                        i24 = i24;
                        sArr9 = sArr9;
                        int iM31614 = (i18 - C0773.m3169("۫֨")) * 71;
                        int i35 = ((iM31614 ^ i17) * (-15141)) ^ 1118894991;
                        i3 = iM31614 ^ 616489988;
                        i19 = i35;
                        z = z;
                        sb = sb;
                        i30 = i30;
                        i22 = i22;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        strMo1440 = strMo1440;
                        strM1785 = strM1785;
                        int i36 = i21;
                        i20 = i3;
                        i21 = i36;
                    }
                    break;
                case -1758715030:
                case 1299989905:
                    i23 = 44548;
                    iM2761 = (i17 - C0619.m2761("ܳۡ")) * (-105);
                    i = ((iM2761 ^ i18) * 623) ^ 665750020;
                    i2 = -870843028;
                    i3 = iM2761 ^ i2;
                    i19 = i;
                    z = z;
                    sb = sb;
                    c4643 = c4643;
                    i30 = i30;
                    sArr4 = sArr4;
                    i24 = i24;
                    i22 = i22;
                    sArr9 = sArr9;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    strMo1440 = strMo1440;
                    strM1785 = strM1785;
                    int i37 = i21;
                    i20 = i3;
                    i21 = i37;
                    break;
                case -1710403688:
                case -1237561534:
                    C3448.m11245(new C14182(this));
                    return z;
                case -1594219320:
                case 1494114492:
                    i21 = i21;
                    sArr9 = sArr9;
                    strM1785 = strM1785;
                    i24 = i24;
                    strMo1440 = strMo1440;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    sArr4 = sArr4;
                    c4643 = c4643;
                    i22 = i22;
                    i30 = i30;
                    sb = sb;
                    z = z;
                    s = f33674[54];
                    s2 = 29640;
                    if (C2354.f7599 < 0) {
                        iM2761 = (C0619.m2761("ۢ᩸") + i18) * 55;
                        i = ((iM2761 ^ i17) * (-13331)) ^ 98750927;
                        i2 = -302024239;
                        i3 = iM2761 ^ i2;
                        i19 = i;
                        z = z;
                        sb = sb;
                        c4643 = c4643;
                        i30 = i30;
                        sArr4 = sArr4;
                        i24 = i24;
                        i22 = i22;
                        sArr9 = sArr9;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        strMo1440 = strMo1440;
                        strM1785 = strM1785;
                        int i38 = i21;
                        i20 = i3;
                        i21 = i38;
                    } else {
                        c4643 = c4643;
                        sArr4 = sArr4;
                        i24 = i24;
                        sArr9 = sArr9;
                        int iM31615 = (i18 - C0773.m3169("۫֨")) * 71;
                        int i39 = ((iM31615 ^ i17) * (-15141)) ^ 1118894991;
                        i3 = iM31615 ^ 616489988;
                        i19 = i39;
                        z = z;
                        sb = sb;
                        i30 = i30;
                        i22 = i22;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        strMo1440 = strMo1440;
                        strM1785 = strM1785;
                        int i310 = i21;
                        i20 = i3;
                        i21 = i310;
                    }
                    break;
                case -1561252752:
                case 1174628629:
                    if (C0487.m2356() >= 0) {
                        iM31611 = (i17 - C0773.m3169("ۤۙ")) * (-71);
                        i14 = ((iM31611 ^ i18) * 24365) ^ 329700398;
                        i15 = 1217531568;
                        i20 = iM31611 ^ i15;
                        i19 = i14;
                    } else {
                        sArr9 = sArr9;
                        strM1785 = strM1785;
                        i24 = i24;
                        strMo1440 = strMo1440;
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        i22 = i22;
                        i30 = i30;
                        sb = sb;
                        z = z;
                        int iM2763 = (C0619.m2761("ۘ᩸") + i17) * (-115);
                        i20 = iM2763 ^ (-848387850);
                        i19 = ((iM2763 ^ i18) * (-15935)) ^ 105759579;
                        sArr4 = sArr4;
                        z = z;
                        i24 = i24;
                        sb = sb;
                        sArr9 = sArr9;
                        c4643 = null;
                        i30 = i30;
                        i22 = i22;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        strMo1440 = strMo1440;
                        strM1785 = strM1785;
                    }
                    break;
                case -1358372128:
                case -656722071:
                    i21 = i21;
                    String str3 = strM1785;
                    short[] sArr11 = sArr6;
                    i22 = i22;
                    String str4 = strMo1440;
                    sArr5 = sArr5;
                    sArr6 = sArr11;
                    strMo1440 = str4;
                    strM1785 = str3;
                    int i40 = i30;
                    if (i40 == (C0619.m2761(C2354.m7980(f33674, 68, 3, i23)) ^ 2129129305)) {
                        iM3169 = C0773.m3169("᩶֨") ^ i18;
                        i4 = ((iM3169 ^ i17) * (-6917)) ^ (-1953045212);
                        i5 = 1196603456;
                    } else {
                        iM3169 = C0773.m3169("ܿۜ") ^ i18;
                        i4 = ((iM3169 ^ i17) * 11797) ^ 1073394302;
                        i5 = -828822215;
                    }
                    i3 = iM3169 ^ i5;
                    i30 = i40;
                    i19 = i4;
                    i22 = i22;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    strMo1440 = strMo1440;
                    strM1785 = strM1785;
                    int i311 = i21;
                    i20 = i3;
                    i21 = i311;
                    break;
                case -1281945496:
                case 583116502:
                    C0773.m3161();
                    if (C2310.f7472 < 0) {
                        sArr9 = sArr9;
                        strM1785 = strM1785;
                        i24 = i24;
                        strMo1440 = strMo1440;
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        i22 = i22;
                        i30 = i30;
                        sb = sb;
                        z = z;
                        int iM2764 = (C0619.m2761("ۘ᩸") + i17) * (-115);
                        i20 = iM2764 ^ (-848387850);
                        i19 = ((iM2764 ^ i18) * (-15935)) ^ 105759579;
                        sArr4 = sArr4;
                        z = z;
                        i24 = i24;
                        sb = sb;
                        sArr9 = sArr9;
                        c4643 = null;
                        i30 = i30;
                        i22 = i22;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        strMo1440 = strMo1440;
                        strM1785 = strM1785;
                    } else {
                        iM31611 = C0619.m2761("۠ܰ") ^ i17;
                        i14 = ((iM31611 ^ i18) * 2373) ^ (-1849047158);
                        i15 = 687393035;
                        i20 = iM31611 ^ i15;
                        i19 = i14;
                    }
                    break;
                case -1273030423:
                case 1488559810:
                    i21 = i21;
                    sArr9 = sArr9;
                    strM1785 = strM1785;
                    i24 = i24;
                    strMo1440 = strMo1440;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    sArr4 = sArr4;
                    i22 = i22;
                    i30 = i30;
                    sb = sb;
                    z = z;
                    c4643 = c4643;
                    if (i30 == (C0773.m3169(C17202.m40377(f33674, 61, 3, i23)) ^ 2099462423)) {
                        iM2761 = C0619.m2761("۫֡") ^ i18;
                        i = ((iM2761 ^ i17) * (-1053)) ^ (-1244834564);
                        i2 = 1982791415;
                    } else {
                        iM2761 = C0773.m3169("ܰܿ") ^ i18;
                        i = ((iM2761 ^ i17) * (-7515)) ^ 1317025877;
                        i2 = 790600422;
                    }
                    i3 = iM2761 ^ i2;
                    i19 = i;
                    z = z;
                    sb = sb;
                    c4643 = c4643;
                    i30 = i30;
                    sArr4 = sArr4;
                    i24 = i24;
                    i22 = i22;
                    sArr9 = sArr9;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    strMo1440 = strMo1440;
                    strM1785 = strM1785;
                    int i312 = i21;
                    i20 = i3;
                    i21 = i312;
                    break;
                case -1168125596:
                case -220305356:
                    C1783.m6232();
                    if (AbstractC0116.f1064 <= 0) {
                        iM31611 = C0619.m2761("۠ܰ") ^ i17;
                        i14 = ((iM31611 ^ i18) * 2373) ^ (-1849047158);
                        i15 = 687393035;
                        i20 = iM31611 ^ i15;
                        i19 = i14;
                    } else {
                        i10 = i21;
                        sArr3 = sArr5;
                        sArr2 = sArr6;
                        i11 = i22;
                        iM2762 = C0773.m3169("۫ۜ") ^ i18;
                        i12 = ((iM2762 ^ i17) * 26849) ^ (-1034669292);
                        i13 = 2017144608;
                        i19 = i12;
                        short[] sArr12 = sArr2;
                        sArr5 = sArr3;
                        i21 = i10;
                        i20 = iM2762 ^ i13;
                        i22 = i11;
                        sArr6 = sArr12;
                    }
                    break;
                case -1096523073:
                case 386168485:
                    int i41 = i21;
                    StringBuilder sb2 = sb;
                    short[] sArr13 = sArr9;
                    strM1785 = strM1785;
                    int i42 = i24;
                    strMo1440 = strMo1440;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    short[] sArr14 = sArr4;
                    C4643 c4645 = c4643;
                    i22 = i22;
                    int iM33146 = C13473.m33146(menuItem);
                    z = true;
                    if (iM33146 == (C0773.m3169(C4282.m13650(f33674, 55, 3, i23)) ^ 2120624189)) {
                        iM31610 = C0619.m2761("᩵ܰ") ^ i18;
                        i8 = ((iM31610 ^ i17) * (-14841)) ^ (-1079358379);
                        i9 = -589814386;
                    } else {
                        iM31610 = C0773.m3169("᩶֡") ^ i17;
                        i8 = ((iM31610 ^ i18) * (-26941)) ^ (-1643197482);
                        i9 = -1430790802;
                    }
                    int i43 = iM31610 ^ i9;
                    i19 = i8;
                    sb = sb2;
                    c4643 = c4645;
                    i30 = iM33146;
                    sArr4 = sArr14;
                    i24 = i42;
                    i21 = i41;
                    sArr9 = sArr13;
                    i20 = i43;
                    i22 = i22;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    strMo1440 = strMo1440;
                    strM1785 = strM1785;
                    break;
                case -1023641373:
                case 358824907:
                    i21 = i21;
                    strM11770 = AbstractC3624.m11770(strM2364, 0, i34);
                    str = strM2365;
                    i7 = i34;
                    sArr = sArr6;
                    i6 = i22;
                    int iM2765 = C0619.m2761("ܺۤ") ^ i17;
                    int i44 = ((iM2765 ^ i18) * (-2785)) ^ 28617678;
                    i3 = iM2765 ^ 505551727;
                    i19 = i44;
                    i22 = i6;
                    sArr6 = sArr;
                    i34 = i7;
                    strM2365 = str;
                    int i313 = i21;
                    i20 = i3;
                    i21 = i313;
                    break;
                case -980353503:
                case 1164494639:
                    i21 = i21;
                    sArr9 = sArr9;
                    strM1785 = strM1785;
                    i24 = i24;
                    strMo1440 = strMo1440;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    sArr4 = sArr4;
                    c4643 = c4643;
                    i22 = i22;
                    i30 = i30;
                    sb = sb;
                    z = z;
                    if (i30 == (C0619.m2761(C1146.m4222(f33674, 58, 3, i23)) ^ 2100596918)) {
                        iM2761 = C0773.m3169("ۖ֨") ^ i17;
                        i = ((iM2761 ^ i18) * (-24793)) ^ (-889237600);
                        i2 = -1387528774;
                    } else {
                        iM2761 = (i18 - C0619.m2761("۬۠")) * (-111);
                        i = ((iM2761 ^ i17) * (-31739)) ^ 564464160;
                        i2 = 781967783;
                    }
                    i3 = iM2761 ^ i2;
                    i19 = i;
                    z = z;
                    sb = sb;
                    c4643 = c4643;
                    i30 = i30;
                    sArr4 = sArr4;
                    i24 = i24;
                    i22 = i22;
                    sArr9 = sArr9;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    strMo1440 = strMo1440;
                    strM1785 = strM1785;
                    int i314 = i21;
                    i20 = i3;
                    i21 = i314;
                    break;
                case -953927951:
                case 514785284:
                    C0862.m3503();
                    i10 = i21;
                    sArr3 = sArr5;
                    sArr2 = sArr6;
                    i11 = i22;
                    iM2762 = C0773.m3169("۫ۜ") ^ i18;
                    i12 = ((iM2762 ^ i17) * 26849) ^ (-1034669292);
                    i13 = 2017144608;
                    i19 = i12;
                    short[] sArr15 = sArr2;
                    sArr5 = sArr3;
                    i21 = i10;
                    i20 = iM2762 ^ i13;
                    i22 = i11;
                    sArr6 = sArr15;
                    break;
                case -951705669:
                case -403692044:
                    mo24175((ActivityC0848) AbstractC0116.m1234(this));
                    return z;
                case -948519419:
                case 1317950541:
                    return super.onOptionsItemSelected(menuItem);
                case -894892005:
                case -461595100:
                    C20956.m47908(c20956, C0773.m3169(C0269.m1785(sArr8, i25, i21, i23)) ^ 2123397873, (String) null, strM34865, strArr, i26);
                    return z;
                case -785246480:
                case 1756955448:
                    i21 = i21;
                    sArr9 = sArr9;
                    strM1785 = strM1785;
                    i24 = i24;
                    strMo1440 = strMo1440;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    sArr4 = sArr4;
                    c4643 = c4643;
                    i22 = i22;
                    i30 = i30;
                    sb = sb;
                    z = z;
                    if ((s * s2) - ((s * s) + 219632400) <= 0) {
                        iM2761 = (i17 - C0619.m2761("۟᩸")) * 19;
                        i = ((iM2761 ^ i18) * 6475) ^ 1475980415;
                        i2 = -2049688107;
                    } else {
                        iM2761 = (C0619.m2761("ۜۡ") + i18) * 57;
                        i = ((iM2761 ^ i17) * 30923) ^ 1656593607;
                        i2 = 308229108;
                    }
                    i3 = iM2761 ^ i2;
                    i19 = i;
                    z = z;
                    sb = sb;
                    c4643 = c4643;
                    i30 = i30;
                    sArr4 = sArr4;
                    i24 = i24;
                    i22 = i22;
                    sArr9 = sArr9;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    strMo1440 = strMo1440;
                    strM1785 = strM1785;
                    int i315 = i21;
                    i20 = i3;
                    i21 = i315;
                    break;
                case -677078841:
                case 1217454710:
                    i23 = 28345;
                    iM2761 = (i17 - C0619.m2761("ܳۡ")) * (-105);
                    i = ((iM2761 ^ i18) * 623) ^ 665750020;
                    i2 = -870843028;
                    i3 = iM2761 ^ i2;
                    i19 = i;
                    z = z;
                    sb = sb;
                    c4643 = c4643;
                    i30 = i30;
                    sArr4 = sArr4;
                    i24 = i24;
                    i22 = i22;
                    sArr9 = sArr9;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    strMo1440 = strMo1440;
                    strM1785 = strM1785;
                    int i316 = i21;
                    i20 = i3;
                    i21 = i316;
                    break;
                case -614802466:
                case -131306376:
                    C3077.m10041();
                    return false;
                case -586998467:
                case -571969954:
                    StringBuilder sb3 = sb;
                    C3779.m12258(sb3, C2354.m7980(sArr9, i29, i33, i23));
                    C1783.m6237(sb3, i28);
                    String strM4058 = C1080.m4058(sb3);
                    C4643 c4646 = c4643;
                    c4646.m22933(strM4058);
                    c4646.m22918();
                    c4646.m22957(i32);
                    c4646.m22955(z);
                    return z;
                case -514165173:
                case -385770864:
                    strArr = new String[]{RunnableC3055.m9937(sArr7, i31, i24, i23)};
                    C17202.m40369(c20956);
                    i26 = 16;
                    sArr8 = f33674;
                    i25 = IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i21 = 3;
                    if (C2375.f7641 > 0) {
                        iM31611 = (C0773.m3169("ܽ᩶") ^ i18) * (-89);
                        i14 = ((iM31611 ^ i17) * 26845) ^ (-657547187);
                        i15 = -1116406869;
                        i20 = iM31611 ^ i15;
                        i19 = i14;
                    } else {
                        sArr9 = sArr9;
                        strM1785 = strM1785;
                        i24 = i24;
                        strMo1440 = strMo1440;
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        i22 = i22;
                        i30 = i30;
                        sb = sb;
                        z = z;
                        int iM2766 = (C0619.m2761("ۘ᩸") + i17) * (-115);
                        i20 = iM2766 ^ (-848387850);
                        i19 = ((iM2766 ^ i18) * (-15935)) ^ 105759579;
                        sArr4 = sArr4;
                        z = z;
                        i24 = i24;
                        sb = sb;
                        sArr9 = sArr9;
                        c4643 = null;
                        i30 = i30;
                        i22 = i22;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        strMo1440 = strMo1440;
                        strM1785 = strM1785;
                    }
                    break;
                case -298009403:
                case -100227080:
                    i21 = i21;
                    i22 = i22;
                    short[] sArr16 = sArr5;
                    String strM13530 = C4238.m13530(sArr16, 82, 1, i23);
                    String str5 = strMo1440;
                    sArr5 = sArr16;
                    String str6 = strM1785;
                    strM2365 = C0487.m2364(str5, str6, strM13530);
                    short[] sArr17 = f33674;
                    if (RunnableC3646.f12471) {
                        sArr6 = sArr17;
                        strMo1440 = str5;
                        strM1785 = str6;
                        i30 = i30;
                        sb = sb;
                        z = z;
                        int iM31616 = (i18 - C0773.m3169("۫֨")) * 71;
                        int i317 = ((iM31616 ^ i17) * (-15141)) ^ 1118894991;
                        i3 = iM31616 ^ 616489988;
                        i19 = i317;
                        z = z;
                        sb = sb;
                        i30 = i30;
                        i22 = i22;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        strMo1440 = strMo1440;
                        strM1785 = strM1785;
                        int i318 = i21;
                        i20 = i3;
                        i21 = i318;
                    } else {
                        int iM31617 = C0773.m3169("֫᩺") ^ i17;
                        i19 = ((iM31617 ^ i18) * 28865) ^ 217512576;
                        i21 = i21;
                        i20 = iM31617 ^ (-1832548432);
                        strM1785 = str6;
                        strMo1440 = str5;
                        i22 = i22;
                        sArr6 = sArr17;
                        sArr5 = sArr5;
                    }
                    break;
                case -238079280:
                case 874224655:
                    return z;
                case -234955217:
                case 1022992182:
                    str2 = strM11770;
                    c20956 = this.f33685;
                    strM12925 = C3998.m12925(f33674, 86, 10, i23);
                    sArr10 = f33674;
                    if (C0950.f3488 < 0) {
                        i21 = i21;
                        int iM2767 = C0619.m2761("ۧ֨") ^ i17;
                        int i45 = ((iM2767 ^ i18) * 10587) ^ 1055945620;
                        i3 = iM2767 ^ (-1336995982);
                        i19 = i45;
                        strM11770 = str2;
                        i22 = 96;
                        int i319 = i21;
                        i20 = i3;
                        i21 = i319;
                    } else {
                        i22 = 96;
                        int iM31618 = (C0773.m3169("ᩳۨ") + i18) * 47;
                        i19 = ((iM31618 ^ i17) * (-5723)) ^ 184892598;
                        i21 = i21;
                        i20 = iM31618 ^ 930791594;
                        strM11770 = str2;
                    }
                    break;
                case -163988248:
                case 1805382251:
                    i10 = i21;
                    sArr2 = sArr6;
                    i11 = i22;
                    strMo1440 = mo1440();
                    strM1785 = C0269.m1785(f33674, 71, 11, i23);
                    sArr3 = f33674;
                    if (C3779.f12953 <= 0) {
                        iM2762 = C0773.m3169("۫ۜ") ^ i18;
                        i12 = ((iM2762 ^ i17) * 26849) ^ (-1034669292);
                        i13 = 2017144608;
                    } else {
                        iM2762 = C0619.m2761("֫֨") ^ i17;
                        i12 = ((iM2762 ^ i18) * (-25063)) ^ 626573299;
                        i13 = 366620943;
                    }
                    i19 = i12;
                    short[] sArr18 = sArr2;
                    sArr5 = sArr3;
                    i21 = i10;
                    i20 = iM2762 ^ i13;
                    i22 = i11;
                    sArr6 = sArr18;
                    break;
                case 264038095:
                case 1392789096:
                    i21 = i21;
                    sArr9 = sArr9;
                    strM1785 = strM1785;
                    i24 = i24;
                    strMo1440 = strMo1440;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    sArr4 = sArr4;
                    c4643 = c4643;
                    i22 = i22;
                    i30 = i30;
                    sb = sb;
                    z = z;
                    if (this.f33683) {
                        iM2761 = C0773.m3169("ۢ۫") ^ i18;
                        i = ((iM2761 ^ i17) * 12241) ^ 1843958073;
                        i2 = 125450346;
                    } else {
                        iM2761 = C0773.m3169("ۛ᩹") ^ i17;
                        i = ((iM2761 ^ i18) * 22103) ^ (-440760703);
                        i2 = 1366863851;
                    }
                    i3 = iM2761 ^ i2;
                    i19 = i;
                    z = z;
                    sb = sb;
                    c4643 = c4643;
                    i30 = i30;
                    sArr4 = sArr4;
                    i24 = i24;
                    i22 = i22;
                    sArr9 = sArr9;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    strMo1440 = strMo1440;
                    strM1785 = strM1785;
                    int i3110 = i21;
                    i20 = i3;
                    i21 = i3110;
                    break;
                case 834670683:
                case 1603532665:
                    String str7 = strM11770;
                    strM34865 = C14442.m34865(strM12925, str7, C20932.m47853(sArr10, i22, 4, i23));
                    sArr7 = f33674;
                    i31 = 100;
                    if (C0862.m3503()) {
                        int iM31619 = (C0773.m3169("ۘۧ") + i18) * (-99);
                        i20 = iM31619 ^ (-1618431704);
                        strM11770 = str7;
                        i19 = ((iM31619 ^ i17) * 18319) ^ 870804693;
                        i24 = 3;
                    } else {
                        i21 = i21;
                        strM11770 = str7;
                        strM1785 = strM1785;
                        i24 = 3;
                        strMo1440 = strMo1440;
                        sArr5 = sArr5;
                        sArr6 = sArr6;
                        i22 = i22;
                        i30 = i30;
                        sb = sb;
                        z = z;
                        int iM316110 = (i18 - C0773.m3169("۫֨")) * 71;
                        int i3111 = ((iM316110 ^ i17) * (-15141)) ^ 1118894991;
                        i3 = iM316110 ^ 616489988;
                        i19 = i3111;
                        z = z;
                        sb = sb;
                        i30 = i30;
                        i22 = i22;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        strMo1440 = strMo1440;
                        strM1785 = strM1785;
                        int i3112 = i21;
                        i20 = i3;
                        i21 = i3112;
                    }
                    break;
                case 851267325:
                case 929158951:
                    if (C3492.f12043 > 0) {
                        str2 = strM11770;
                        int iM316111 = (C0773.m3169("ᩳۨ") + i18) * 47;
                        i19 = ((iM316111 ^ i17) * (-5723)) ^ 184892598;
                        i21 = i21;
                        i20 = iM316111 ^ 930791594;
                        strM11770 = str2;
                    } else {
                        iM31611 = C0619.m2761("۠ܰ") ^ i17;
                        i14 = ((iM31611 ^ i18) * 2373) ^ (-1849047158);
                        i15 = 687393035;
                        i20 = iM31611 ^ i15;
                        i19 = i14;
                    }
                    break;
                case 1029567545:
                case 2098818613:
                    i21 = i21;
                    sArr = sArr6;
                    i6 = i22;
                    str = strM2365;
                    strM2364 = C0487.m2364(str, C2023.m6966(sArr, 83, 2, i23), C1826.m6310(f33674, 85, 1, i23));
                    if (C2966.m9671(strM2364) > 50) {
                        int iM31620 = C0773.m3169("᩺ۚ") ^ i17;
                        int i46 = ((iM31620 ^ i18) * 22225) ^ 1210394971;
                        i3 = iM31620 ^ 757293289;
                        i19 = i46;
                        strM2365 = str;
                        i22 = i6;
                        sArr6 = sArr;
                        i34 = 50;
                    } else {
                        strM11770 = strM2364;
                        i7 = 50;
                        int iM2768 = C0619.m2761("ܺۤ") ^ i17;
                        int i47 = ((iM2768 ^ i18) * (-2785)) ^ 28617678;
                        i3 = iM2768 ^ 505551727;
                        i19 = i47;
                        i22 = i6;
                        sArr6 = sArr;
                        i34 = i7;
                        strM2365 = str;
                    }
                    int i3113 = i21;
                    i20 = i3;
                    i21 = i3113;
                    break;
                case 1117194114:
                case 2137913941:
                    i21 = i21;
                    sArr9 = sArr9;
                    strM1785 = strM1785;
                    i24 = i24;
                    strMo1440 = strMo1440;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    i22 = i22;
                    i30 = i30;
                    sb = sb;
                    z = z;
                    int iM41036 = this.f33681.m41036();
                    int iM41044 = this.f33681.m41044();
                    if (C2354.f7599 >= 0) {
                        i27 = iM41036;
                        i28 = iM41044;
                        i21 = i21;
                        int iM2769 = (C0619.m2761("ۘ᩸") + i17) * (-115);
                        i20 = iM2769 ^ (-848387850);
                        i19 = ((iM2769 ^ i18) * (-15935)) ^ 105759579;
                        sArr4 = sArr4;
                        z = z;
                        i24 = i24;
                        sb = sb;
                        sArr9 = sArr9;
                        c4643 = null;
                        i30 = i30;
                        i22 = i22;
                    } else {
                        C4643 c4647 = new C4643(this, (ActivityC0848) AbstractC0116.m1234(this), iM41036, iM41044);
                        sArr4 = f33674;
                        if (!C2354.m7983()) {
                            i27 = iM41036;
                            i28 = iM41044;
                            c4643 = c4647;
                            i24 = i24;
                            sArr9 = sArr9;
                            int iM316112 = (i18 - C0773.m3169("۫֨")) * 71;
                            int i3114 = ((iM316112 ^ i17) * (-15141)) ^ 1118894991;
                            i3 = iM316112 ^ 616489988;
                            i19 = i3114;
                            z = z;
                            sb = sb;
                            i30 = i30;
                            i22 = i22;
                            sArr6 = sArr6;
                            sArr5 = sArr5;
                            strMo1440 = strMo1440;
                            strM1785 = strM1785;
                            int i3115 = i21;
                            i20 = i3;
                            i21 = i3115;
                        } else {
                            int iM31621 = (i18 - C0773.m3169("ۨۢ")) * (-17);
                            i27 = iM41036;
                            i19 = ((iM31621 ^ i17) * 21745) ^ (-524886204);
                            i28 = iM41044;
                            c4643 = c4647;
                            z = z;
                            sb = sb;
                            i21 = i21;
                            i30 = i30;
                            i20 = iM31621 ^ (-463145099);
                            i24 = i24;
                            i22 = i22;
                            sArr9 = sArr9;
                        }
                    }
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    strMo1440 = strMo1440;
                    strM1785 = strM1785;
                    break;
                case 1556906204:
                case 2088848449:
                    i21 = i21;
                    sArr9 = sArr9;
                    strM1785 = strM1785;
                    i24 = i24;
                    strMo1440 = strMo1440;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    sArr4 = sArr4;
                    c4643 = c4643;
                    i22 = i22;
                    i30 = i30;
                    sb = sb;
                    z = z;
                    if (this.f33678) {
                        iM2761 = (C0773.m3169("ۤ֨") ^ i18) * (-107);
                        i = ((iM2761 ^ i17) * (-31439)) ^ 2142189905;
                        i2 = -330610871;
                    } else {
                        iM2761 = (i17 - C0619.m2761("ܽ᩹")) * (-69);
                        i = ((iM2761 ^ i18) * 4607) ^ 1996413266;
                        i2 = -1474219350;
                    }
                    i3 = iM2761 ^ i2;
                    i19 = i;
                    z = z;
                    sb = sb;
                    c4643 = c4643;
                    i30 = i30;
                    sArr4 = sArr4;
                    i24 = i24;
                    i22 = i22;
                    sArr9 = sArr9;
                    sArr6 = sArr6;
                    sArr5 = sArr5;
                    strMo1440 = strMo1440;
                    strM1785 = strM1785;
                    int i3116 = i21;
                    i20 = i3;
                    i21 = i3116;
                    break;
                default:
                    i21 = i21;
                    int i48 = i28;
                    strM1785 = strM1785;
                    C4643 c4648 = c4643;
                    strMo1440 = strMo1440;
                    sArr5 = sArr5;
                    sArr6 = sArr6;
                    i22 = i22;
                    i30 = i30;
                    c4648.m22948(2);
                    StringBuilder sb4 = new StringBuilder();
                    z = z;
                    int i49 = i27;
                    C3779.m12269(sb4, i49);
                    sArr9 = f33674;
                    i29 = 67;
                    i33 = 1;
                    if (C2288.f7433 > 0) {
                        int iM31622 = C0773.m3169("۟ۙ") ^ i17;
                        sb = sb4;
                        i19 = ((iM31622 ^ i18) * 31065) ^ 30319218;
                        c4643 = c4648;
                        i28 = i48;
                        i21 = i21;
                        i32 = 2;
                        i20 = iM31622 ^ 853534029;
                        i27 = i49;
                        z = z;
                        sb = sb;
                        i30 = i30;
                        i22 = i22;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        strMo1440 = strMo1440;
                        strM1785 = strM1785;
                    } else {
                        sb = sb4;
                        i27 = i49;
                        c4643 = c4648;
                        i28 = i48;
                        i32 = 2;
                        int iM316113 = (i18 - C0773.m3169("۫֨")) * 71;
                        int i3117 = ((iM316113 ^ i17) * (-15141)) ^ 1118894991;
                        i3 = iM316113 ^ 616489988;
                        i19 = i3117;
                        z = z;
                        sb = sb;
                        i30 = i30;
                        i22 = i22;
                        sArr6 = sArr6;
                        sArr5 = sArr5;
                        strMo1440 = strMo1440;
                        strM1785 = strM1785;
                        int i3118 = i21;
                        i20 = i3;
                        i21 = i3118;
                    }
                    break;
            }
        }
    }

    @Override // l.InterfaceC10586
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1439(C20283 c20283) {
        String strM27091 = null;
        int i = -316596988;
        int i2 = C2310.f7472;
        int i3 = C2966.f9654;
        int iM3169 = C0773.m3169("᩶ܳ") ^ i3;
        int i4 = ((iM3169 ^ i2) * (-5493)) ^ (-844362174);
        int i5 = 128123988;
        while (true) {
            i = ((((i ^ i2) * 25889) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2083589640:
                case -1070194434:
                    if (C2287.m7745() <= 0) {
                        iM3169 = C0773.m3169("ۛ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-847)) ^ 1878189450;
                        i5 = -258523874;
                    } else {
                        iM3169 = C0773.m3169("ᩴۛ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 24885) ^ 57063443;
                        i5 = -1963314423;
                    }
                    break;
                case -2049722935:
                case 1330101876:
                    if (C23916.f77426 <= 0) {
                        iM3169 = C0773.m3169("۠ۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15003)) ^ 875627964;
                        i5 = 2095947657;
                    } else {
                        iM3169 = C0773.m3169("ۛ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-847)) ^ 1878189450;
                        i5 = -258523874;
                    }
                    break;
                case -1866654256:
                case -504199605:
                    if (C1564.f5401 > 0) {
                        iM3169 = C0773.m3169("ۛ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-847)) ^ 1878189450;
                        i5 = -258523874;
                    } else {
                        iM3169 = C0619.m2761("ۧۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-19181)) ^ 1219617675;
                        i5 = -1194906091;
                    }
                    break;
                case -1529765395:
                case 610844951:
                    strM27091 = m27091();
                    if (C13473.f42873 != 0) {
                        iM3169 = C0619.m2761("ۚܶ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 12055) ^ (-1371021396);
                        i5 = 802341666;
                    } else {
                        iM3169 = (C0773.m3169("᩷ܺ") + i3) * (-105);
                        i4 = ((iM3169 ^ i2) * (-30291)) ^ (-177938313);
                        i5 = 888739593;
                    }
                    break;
                case -1492812467:
                case 305771651:
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("۠ۡ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15003)) ^ 875627964;
                        i5 = 2095947657;
                    } else {
                        iM3169 = (C0619.m2761("ܿ᩺") + i2) * (-45);
                        i4 = ((iM3169 ^ i3) * 21005) ^ 729071617;
                        i5 = 1802767432;
                    }
                    break;
                case -1275020538:
                case 846451156:
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0619.m2761("ۧۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-19181)) ^ 1219617675;
                        i5 = -1194906091;
                    } else {
                        iM3169 = (C0773.m3169("᩶ۖ") + i3) * 51;
                        i4 = ((iM3169 ^ i2) * 1787) ^ (-1694399879);
                        i5 = -2096418204;
                    }
                    break;
                case -1201833437:
                case 54156515:
                    return !c20283.m46617(strM27091);
                case -822993059:
                case -689472252:
                    if (RunnableC0334.m2063()) {
                        iM3169 = C0619.m2761("ۧۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-19181)) ^ 1219617675;
                        i5 = -1194906091;
                    } else {
                        iM3169 = (C0619.m2761("۠ۛ") + i2) * (-101);
                        i4 = ((iM3169 ^ i3) * 1947) ^ (-354652667);
                        i5 = 1352583341;
                    }
                    break;
                case -472612702:
                case 1702778311:
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0619.m2761("ۧۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-19181)) ^ 1219617675;
                        i5 = -1194906091;
                    } else {
                        iM3169 = C0773.m3169("ܺܶ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-16075)) ^ 820057176;
                        i5 = 1562968577;
                    }
                    break;
                case -102755353:
                case 1347367361:
                    if (!RunnableC3646.f12471) {
                        iM3169 = C0773.m3169("۟ᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 11439) ^ (-281341425);
                        i5 = 1407275492;
                    } else {
                        iM3169 = C0619.m2761("ۧۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-19181)) ^ 1219617675;
                        i5 = -1194906091;
                    }
                    break;
                case 83247173:
                case 1556808375:
                    if (C1542.m5459() >= 0) {
                        iM3169 = C0773.m3169("۟ᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 11439) ^ (-281341425);
                        i5 = 1407275492;
                    } else {
                        iM3169 = C0619.m2761("֡ܺ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 21819) ^ 1017988650;
                        i5 = -1167183426;
                    }
                    break;
                case 216462855:
                case 648403130:
                    C2834.m9344();
                    C1564.m5509();
                    iM3169 = C0619.m2761("ۧۧ") ^ i3;
                    i4 = ((iM3169 ^ i2) * (-19181)) ^ 1219617675;
                    i5 = -1194906091;
                    break;
                case 634926902:
                case 847738291:
                    C3492.m11488();
                    C3448.m11248();
                    return false;
                case 661733828:
                case 1988233215:
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0619.m2761("ۧۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-19181)) ^ 1219617675;
                        i5 = -1194906091;
                    } else {
                        iM3169 = (C0619.m2761("ۢ᩶") + i2) * 17;
                        i4 = ((iM3169 ^ i3) * (-5517)) ^ (-1646715104);
                        i5 = 487222506;
                    }
                    break;
                case 750659761:
                case 762606449:
                    if (C3779.f12953 <= 0) {
                        iM3169 = C0619.m2761("ۧۧ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-19181)) ^ 1219617675;
                        i5 = -1194906091;
                    } else {
                        iM3169 = (C0773.m3169("۟ۤ") + i2) * 109;
                        i4 = ((iM3169 ^ i3) * 27991) ^ 1743625334;
                        i5 = -797379132;
                    }
                    break;
                default:
                    if (C20932.f66974 <= 0) {
                        iM3169 = C0773.m3169("ۛ᩸") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-847)) ^ 1878189450;
                        i5 = -258523874;
                    } else {
                        iM3169 = C0619.m2761("ܿۤ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 30765) ^ (-687207491);
                        i5 = -1893296443;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x022f A[PHI: r2 r3 r5 r6 r7 r8 r10 r11 r12 r13 r15 r23
      0x022f: PHI (r2v4 l.ܶܺۙ) = (r2v2 l.ܶܺۙ), (r2v2 l.ܶܺۙ), (r2v3 l.ܶܺۙ), (r2v2 l.ܶܺۙ), (r2v2 l.ܶܺۙ), (r2v2 l.ܶܺۙ), (r2v2 l.ܶܺۙ) binds: [B:64:0x022d, B:58:0x0205, B:47:0x018d, B:39:0x0127, B:29:0x00e6, B:32:0x00f5, B:25:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r3v2 int) = (r3v1 int), (r3v1 int), (r3v1 int), (r3v1 int), (r3v1 int), (r3v1 int), (r3v3 int) binds: [B:64:0x022d, B:58:0x0205, B:47:0x018d, B:39:0x0127, B:29:0x00e6, B:32:0x00f5, B:25:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r5v4 java.lang.Class<l.ۨۧۧ>) = 
      (r5v2 java.lang.Class<l.ۨۧۧ>)
      (r5v2 java.lang.Class<l.ۨۧۧ>)
      (r5v2 java.lang.Class<l.ۨۧۧ>)
      (r5v3 java.lang.Class<l.ۨۧۧ>)
      (r5v2 java.lang.Class<l.ۨۧۧ>)
      (r5v2 java.lang.Class<l.ۨۧۧ>)
      (r5v2 java.lang.Class<l.ۨۧۧ>)
     binds: [B:64:0x022d, B:58:0x0205, B:47:0x018d, B:39:0x0127, B:29:0x00e6, B:32:0x00f5, B:25:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r6v4 l.᩶֨֫) = (r6v2 l.᩶֨֫), (r6v2 l.᩶֨֫), (r6v2 l.᩶֨֫), (r6v2 l.᩶֨֫), (r6v2 l.᩶֨֫), (r6v3 l.᩶֨֫), (r6v2 l.᩶֨֫) binds: [B:64:0x022d, B:58:0x0205, B:47:0x018d, B:39:0x0127, B:29:0x00e6, B:32:0x00f5, B:25:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r7v3 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v2 int), (r7v4 int) binds: [B:64:0x022d, B:58:0x0205, B:47:0x018d, B:39:0x0127, B:29:0x00e6, B:32:0x00f5, B:25:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r8v4 l.ܶܺۙ) = (r8v2 l.ܶܺۙ), (r8v2 l.ܶܺۙ), (r8v2 l.ܶܺۙ), (r8v3 l.ܶܺۙ), (r8v2 l.ܶܺۙ), (r8v2 l.ܶܺۙ), (r8v2 l.ܶܺۙ) binds: [B:64:0x022d, B:58:0x0205, B:47:0x018d, B:39:0x0127, B:29:0x00e6, B:32:0x00f5, B:25:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r10v5 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:64:0x022d, B:58:0x0205, B:47:0x018d, B:39:0x0127, B:29:0x00e6, B:32:0x00f5, B:25:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:64:0x022d, B:58:0x0205, B:47:0x018d, B:39:0x0127, B:29:0x00e6, B:32:0x00f5, B:25:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int), (r12v2 int) binds: [B:64:0x022d, B:58:0x0205, B:47:0x018d, B:39:0x0127, B:29:0x00e6, B:32:0x00f5, B:25:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:64:0x022d, B:58:0x0205, B:47:0x018d, B:39:0x0127, B:29:0x00e6, B:32:0x00f5, B:25:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r15v3 short[]) = (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]), (r15v4 short[]) binds: [B:64:0x022d, B:58:0x0205, B:47:0x018d, B:39:0x0127, B:29:0x00e6, B:32:0x00f5, B:25:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r23v5 short) = (r23v3 short), (r23v1 short), (r23v1 short), (r23v1 short), (r23v1 short), (r23v1 short), (r23v1 short) binds: [B:64:0x022d, B:58:0x0205, B:47:0x018d, B:39:0x0127, B:29:0x00e6, B:32:0x00f5, B:25:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC9051, l.ComponentCallbacksC11612
    public final void onCreate(Bundle bundle) {
        int iM2761;
        int i;
        int i2;
        int iM3169;
        int i3;
        C10608 c10608 = this;
        int i4 = C2375.f7641;
        int i5 = C1146.f4234;
        int iM2762 = (C0619.m2761("᩵ۨ") + i4) * 81;
        int i6 = ((iM2762 ^ i5) * 6763) ^ 1175799339;
        short[] sArr = null;
        short[] sArr2 = null;
        int i7 = iM2762 ^ 20264431;
        int i8 = 0;
        int i9 = 0;
        C16196 c16196 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1239872809;
        char c = 0;
        short s = 0;
        C20956 c20956M28897 = null;
        Class<C12318> cls = null;
        C22761 c22761 = null;
        C16196 c16197 = null;
        while (true) {
            i15 = i7 ^ (i6 & (((i15 ^ i5) * (-7751)) >> 31));
            switch (i15) {
                case -1803674869:
                case -358848324:
                    short s2 = sArr[c];
                    i10 = s2 + 13200;
                    if (!C3077.m10041()) {
                        int iM2763 = C0619.m2761("ܽܿ") ^ i4;
                        i7 = iM2763 ^ (-1363089266);
                        s = s2;
                        i6 = ((iM2763 ^ i5) * 23819) ^ (-2079599751);
                        c10608 = this;
                    } else {
                        s = s2;
                        iM2761 = C0773.m3169("ۛ᩵") ^ i5;
                        i = ((iM2761 ^ i4) * 23181) ^ (-1637917628);
                        i2 = -1743367104;
                        i7 = iM2761 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1669547491:
                case 110750981:
                    c10608.f33679 = (C12318) c16196.m38422(cls);
                    if (C1321.m4852()) {
                        c20956M28897 = ViewOnClickListenerC11499.m28897(c10608, new C0473(c10608));
                        if (C3779.m12264()) {
                            iM2761 = (i5 - C0773.m3169("ܳ֨")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i = ((iM2761 ^ i4) * 26059) ^ (-828495753);
                            i2 = -1507024927;
                        } else {
                            iM2761 = C0773.m3169("ۛ᩵") ^ i5;
                            i = ((iM2761 ^ i4) * 23181) ^ (-1637917628);
                            i2 = -1743367104;
                        }
                    } else {
                        iM2761 = C0773.m3169("ۛ᩵") ^ i5;
                        i = ((iM2761 ^ i4) * 23181) ^ (-1637917628);
                        i2 = -1743367104;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -1633521857:
                case -1129639627:
                    c10608.f33686 = c22761;
                    ActivityC3409 activityC3409M11768 = AbstractC3624.m11768(this);
                    if (!C17202.f56030) {
                        int iM31610 = C0773.m3169("ܰ۫") ^ i4;
                        i7 = iM31610 ^ 2137276016;
                        i6 = ((iM31610 ^ i5) * 25067) ^ (-2088879157);
                        c16196 = null;
                    } else {
                        c16196 = new C16196(activityC3409M11768);
                        cls = C12318.class;
                        if (C0862.m3503()) {
                            iM2761 = C0619.m2761("ᩳۚ") ^ i4;
                            i = ((iM2761 ^ i5) * 1337) ^ (-1685581116);
                            i2 = 1917076411;
                        } else {
                            iM2761 = C0773.m3169("ۛ᩵") ^ i5;
                            i = ((iM2761 ^ i4) * 23181) ^ (-1637917628);
                            i2 = -1743367104;
                        }
                        i7 = iM2761 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1602652989:
                case -1526024809:
                    c22761 = (C22761) c16197.m38422(C22761.class);
                    if (C2375.f7641 > 0) {
                        iM2761 = (C0773.m3169("۬ܳ") ^ i5) * (-109);
                        i = ((iM2761 ^ i4) * (-32233)) ^ 70550048;
                        i2 = 1122011680;
                        i7 = iM2761 ^ i2;
                        i6 = i;
                    } else {
                        int iM31611 = C0773.m3169("ܰ۫") ^ i4;
                        i7 = iM31611 ^ 2137276016;
                        i6 = ((iM31611 ^ i5) * 25067) ^ (-2088879157);
                        c16196 = null;
                    }
                    break;
                case -1529557519:
                case 678421688:
                    if (C0862.f3233 == 0) {
                        int iM31612 = C0773.m3169("ܰ۫") ^ i4;
                        i7 = iM31612 ^ 2137276016;
                        i6 = ((iM31612 ^ i5) * 25067) ^ (-2088879157);
                        c16196 = null;
                    } else {
                        iM2761 = (C0773.m3169("֫ۨ") ^ i4) * (-125);
                        i = ((iM2761 ^ i5) * (-23185)) ^ (-19403285);
                        i2 = 1571431991;
                        i7 = iM2761 ^ i2;
                        i6 = i;
                    }
                    break;
                case -1480310275:
                case -878829793:
                    int i16 = i12 + i13;
                    if (i11 - (i16 + i16) <= 0) {
                        iM2761 = C0619.m2761("ۢ۫") ^ i5;
                        i = ((iM2761 ^ i4) * (-13253)) ^ (-1447481941);
                        i2 = -1593808636;
                    } else {
                        iM2761 = (C0619.m2761("ۘۖ") + i5) * 21;
                        i = ((iM2761 ^ i4) * (-9549)) ^ (-1063431961);
                        i2 = 1595406072;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -1471519544:
                case 1737028493:
                    super.onCreate(bundle);
                    c16197 = new C16196(AbstractC3624.m11768(this));
                    if (RunnableC1848.f6235) {
                        iM2761 = C0773.m3169("ۛ᩵") ^ i5;
                        i = ((iM2761 ^ i4) * 23181) ^ (-1637917628);
                        i2 = -1743367104;
                    } else {
                        iM2761 = C0619.m2761("ܺܳ") ^ i4;
                        i = ((iM2761 ^ i5) * 9977) ^ 304156774;
                        i2 = -727251069;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -1390136700:
                case 621894648:
                    i14 = 61211;
                    iM2761 = (C0619.m2761("ۜۖ") ^ i4) * (-47);
                    i = ((iM2761 ^ i5) * (-24633)) ^ (-1301614190);
                    i2 = -324563458;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -1306341221:
                case -30968830:
                    RunnableC3646.m11813();
                    iM3169 = (C0773.m3169("ۙۚ") + i4) * 101;
                    i6 = ((iM3169 ^ i5) * (-11501)) ^ (-955962179);
                    i3 = 358122641;
                    i7 = iM3169 ^ i3;
                    c10608 = this;
                    break;
                case -928416194:
                case 1574774095:
                    c20956M28897.m37644(C4282.m13650(sArr2, i8, i9, i14));
                    c10608.f33685 = c20956M28897;
                    break;
                case -824321628:
                case 933138503:
                    sArr2 = f33674;
                    i8 = 41;
                    i9 = 5;
                    if (C0773.f2792 <= 0) {
                        iM2761 = C0773.m3169("ۛ᩵") ^ i5;
                        i = ((iM2761 ^ i4) * 23181) ^ (-1637917628);
                        i2 = -1743367104;
                    } else {
                        iM2761 = (C0619.m2761("ܺۙ") ^ i5) * (-73);
                        i = ((iM2761 ^ i4) * (-12465)) ^ 869233007;
                        i2 = 1709389509;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -650169502:
                case 293202767:
                    i14 = 19231;
                    iM2761 = (C0619.m2761("ۜۖ") ^ i4) * (-47);
                    i = ((iM2761 ^ i5) * (-24633)) ^ (-1301614190);
                    i2 = -324563458;
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -635528363:
                case 1891861887:
                    i11 = i10 * i10;
                    i12 = s * s;
                    i13 = 174240000;
                    if (C2310.f7472 >= 0) {
                        iM2761 = C0773.m3169("ۛ᩵") ^ i5;
                        i = ((iM2761 ^ i4) * 23181) ^ (-1637917628);
                        i2 = -1743367104;
                    } else {
                        iM2761 = (C0773.m3169("۫ܺ") + i4) * 99;
                        i = ((iM2761 ^ i5) * 8685) ^ (-445163760);
                        i2 = -101238169;
                    }
                    i7 = iM2761 ^ i2;
                    i6 = i;
                    break;
                case -596593141:
                case 485013223:
                    if (C1146.f4234 < 0) {
                        iM2761 = (C0773.m3169("֫ۨ") ^ i4) * (-125);
                        i = ((iM2761 ^ i5) * (-23185)) ^ (-19403285);
                        i2 = 1571431991;
                        i7 = iM2761 ^ i2;
                        i6 = i;
                    } else {
                        iM3169 = (C0773.m3169("ۙۚ") + i4) * 101;
                        i6 = ((iM3169 ^ i5) * (-11501)) ^ (-955962179);
                        i3 = 358122641;
                        i7 = iM3169 ^ i3;
                        c10608 = this;
                    }
                    break;
                case -79477074:
                case 159351635:
                    C23916.m53419();
                    C23916.m53419();
                    break;
                case 196759474:
                case 1448403257:
                    if (C3492.f12043 <= 0) {
                        iM2761 = (C0619.m2761("ۘۘ") ^ i5) * (-121);
                        i = ((iM2761 ^ i4) * 4823) ^ 1484233501;
                        i2 = -1971809047;
                        i7 = iM2761 ^ i2;
                        i6 = i;
                    } else {
                        iM3169 = (C0773.m3169("ۙۚ") + i4) * 101;
                        i6 = ((iM3169 ^ i5) * (-11501)) ^ (-955962179);
                        i3 = 358122641;
                        i7 = iM3169 ^ i3;
                        c10608 = this;
                    }
                    break;
                default:
                    sArr = f33674;
                    c = '(';
                    if (C3448.f11240 >= 0) {
                        iM3169 = (C0773.m3169("ۙۚ") + i4) * 101;
                        i6 = ((iM3169 ^ i5) * (-11501)) ^ (-955962179);
                        i3 = 358122641;
                    } else {
                        iM3169 = (C0773.m3169("۟ܿ") ^ i5) * (-105);
                        i6 = ((iM3169 ^ i4) * (-16813)) ^ 8800066;
                        i3 = 1958083154;
                    }
                    i7 = iM3169 ^ i3;
                    c10608 = this;
                    break;
            }
            return;
        }
    }
}
