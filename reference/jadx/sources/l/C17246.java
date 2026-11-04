package l;

import com.alipay.sdk.app.PayTask;
import java.util.Map;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܽ֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: T5M8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17246 extends AbstractC2432 {

    /* JADX INFO: renamed from: ᩺ܰ᩷, reason: not valid java name and contains not printable characters */
    private static final short[] f56185 = {6516, -15457, -11440, 12716, 12122, -23423, -23419, -23419, -23419, -23424, -23419, -23419, -23419, -23421, -23419, -23419, -23420, -23421, -23419, -23419, -23417, -23421, -23419, -23419, -23423, -23411, -23419, -23419, -23419, -23412, -23419, -23419, -23419, -15974, -5523, -636, 10640, 13688, -584, 12098, -14089, -15974, -5523, 11294, -2205, -14019, -9244, -9623, 11115, -14576, -2737, 12716, -15974, -5523, -9626, -15575, -15457, -11440, -15974, -5523, -14683, -2518, 8590, -17729, -17746, -17738, -17786, -17759, -17751, -17760, -17731, -17750, -17732, -17734, -17757, -17733, -17764, -17733, -17746, -17733, -17734, -17732};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f56186;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56187;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f56188;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f56189;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f56190;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f56191;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public RunnableC16500 f56192;

    public C17246(AbstractActivityC17204 abstractActivityC17204, String str, long j, int i, String str2) {
        int i2 = -953148231;
        int i3 = C3779.f12953;
        int i4 = C1542.f5343;
        this.f56190 = abstractActivityC17204;
        this.f56186 = str;
        this.f56189 = j;
        this.f56187 = i;
        this.f56188 = str2;
        int iM3169 = C0773.m3169("ۧۗ") ^ i3;
        int i5 = ((iM3169 ^ i4) * (-25413)) ^ 1526276555;
        int i6 = 92131716;
        while (true) {
            i2 = (iM3169 ^ i6) ^ (i5 & (((i2 ^ i4) * (-1923)) >> 31));
            switch (i2) {
                case -2087965218:
                case 1576574925:
                    return;
                case -1906711979:
                case -1535969802:
                    C1321.m4852();
                    if (AbstractC3624.m11755() != 0) {
                        iM3169 = C0619.m2761("ܺۤ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-32281)) ^ (-2030910707);
                        i6 = 95521938;
                    } else {
                        iM3169 = C0619.m2761("֫ۚ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 2723) ^ (-773249578);
                        i6 = -1746278040;
                    }
                    break;
                case -561471541:
                case 1977919426:
                    C2310.m7813();
                    C1080.m4050();
                    iM3169 = (C0773.m3169("ۛᩳ") + i4) * (-123);
                    i5 = ((iM3169 ^ i3) * (-25539)) ^ 491600061;
                    i6 = 1555270887;
                    break;
                case -517581485:
                case -43009260:
                    C2310.m7813();
                    C2834.m9344();
                    throw new RuntimeException();
                case 275878355:
                case 740897614:
                    if (AbstractC3624.m11755() != 0) {
                        iM3169 = C0619.m2761("֫ۚ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 2723) ^ (-773249578);
                        i6 = -1746278040;
                    } else {
                        iM3169 = (C0773.m3169("ۛᩳ") + i4) * (-123);
                        i5 = ((iM3169 ^ i3) * (-25539)) ^ 491600061;
                        i6 = 1555270887;
                    }
                    break;
                case 904036986:
                case 962145282:
                    C0950.m3785();
                    if (C13473.f42873 != 0) {
                        iM3169 = C0619.m2761("ܺۤ") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-32281)) ^ (-2030910707);
                        i6 = 95521938;
                    } else {
                        iM3169 = (C0619.m2761("᩻᩺") ^ i3) * 3;
                        i5 = ((iM3169 ^ i4) * (-18073)) ^ (-1887286558);
                        i6 = -225926802;
                    }
                    break;
                default:
                    if (C2023.f6737) {
                        iM3169 = C0773.m3169("᩸᩵") ^ i4;
                        i5 = ((iM3169 ^ i3) * 19323) ^ 427673221;
                        i6 = 2088766635;
                    } else {
                        iM3169 = C0619.m2761("ۙۧ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 14309) ^ (-1840916841);
                        i6 = -1441484858;
                    }
                    break;
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C1783.m6242(this, this.f56190);
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0801 A[PHI: r3 r4 r5 r13 r18 r19 r20 r21 r25 r26 r28 r29 r30 r31 r32 r36
      0x0801: PHI (r3v8 int) = (r3v7 int), (r3v9 int) binds: [B:149:0x07ff, B:145:0x07c8] A[DONT_GENERATE, DONT_INLINE]
      0x0801: PHI (r4v7 int) = (r4v6 int), (r4v8 int) binds: [B:149:0x07ff, B:145:0x07c8] A[DONT_GENERATE, DONT_INLINE]
      0x0801: PHI (r5v14 int) = (r5v13 int), (r5v15 int) binds: [B:149:0x07ff, B:145:0x07c8] A[DONT_GENERATE, DONT_INLINE]
      0x0801: PHI (r13v7 int) = (r13v6 int), (r13v8 int) binds: [B:149:0x07ff, B:145:0x07c8] A[DONT_GENERATE, DONT_INLINE]
      0x0801: PHI (r18v4 int) = (r18v3 int), (r18v2 int) binds: [B:149:0x07ff, B:145:0x07c8] A[DONT_GENERATE, DONT_INLINE]
      0x0801: PHI (r19v3 int) = (r19v2 int), (r19v4 int) binds: [B:149:0x07ff, B:145:0x07c8] A[DONT_GENERATE, DONT_INLINE]
      0x0801: PHI (r20v4 short) = (r20v3 short), (r20v2 short) binds: [B:149:0x07ff, B:145:0x07c8] A[DONT_GENERATE, DONT_INLINE]
      0x0801: PHI (r21v3 short) = (r21v2 short), (r21v4 short) binds: [B:149:0x07ff, B:145:0x07c8] A[DONT_GENERATE, DONT_INLINE]
      0x0801: PHI (r25v6 int) = (r25v5 int), (r25v7 int) binds: [B:149:0x07ff, B:145:0x07c8] A[DONT_GENERATE, DONT_INLINE]
      0x0801: PHI (r26v6 int) = (r26v5 int), (r26v7 int) binds: [B:149:0x07ff, B:145:0x07c8] A[DONT_GENERATE, DONT_INLINE]
      0x0801: PHI (r28v7 int) = (r28v6 int), (r28v8 int) binds: [B:149:0x07ff, B:145:0x07c8] A[DONT_GENERATE, DONT_INLINE]
      0x0801: PHI (r29v7 int) = (r29v6 int), (r29v8 int) binds: [B:149:0x07ff, B:145:0x07c8] A[DONT_GENERATE, DONT_INLINE]
      0x0801: PHI (r30v8 short[]) = (r30v7 short[]), (r30v9 short[]) binds: [B:149:0x07ff, B:145:0x07c8] A[DONT_GENERATE, DONT_INLINE]
      0x0801: PHI (r31v7 l.ܺ֨᩻) = (r31v6 l.ܺ֨᩻), (r31v8 l.ܺ֨᩻) binds: [B:149:0x07ff, B:145:0x07c8] A[DONT_GENERATE, DONT_INLINE]
      0x0801: PHI (r32v7 short[]) = (r32v6 short[]), (r32v8 short[]) binds: [B:149:0x07ff, B:145:0x07c8] A[DONT_GENERATE, DONT_INLINE]
      0x0801: PHI (r36v6 l.ܺ֨᩻) = (r36v5 l.ܺ֨᩻), (r36v7 l.ܺ֨᩻) binds: [B:149:0x07ff, B:145:0x07c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0186  */
    /* JADX WARN: Code duplicated, block: B:51:0x01dd A[PHI: r9 r10 r12
      0x01dd: PHI (r9v4 short[]) = (r9v3 short[]), (r9v2 short[]) binds: [B:50:0x01db, B:30:0x0172] A[DONT_GENERATE, DONT_INLINE]
      0x01dd: PHI (r10v4 int) = (r10v3 int), (r10v2 int) binds: [B:50:0x01db, B:30:0x0172] A[DONT_GENERATE, DONT_INLINE]
      0x01dd: PHI (r12v4 int) = (r12v3 int), (r12v2 int) binds: [B:50:0x01db, B:30:0x0172] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0229 A[PHI: r3 r4
      0x0229: PHI (r3v64 l.ܺ֨᩻) = (r3v63 l.ܺ֨᩻), (r3v2 l.ܺ֨᩻), (r3v2 l.ܺ֨᩻) binds: [B:54:0x0212, B:47:0x01bc, B:44:0x01ab] A[DONT_GENERATE, DONT_INLINE]
      0x0229: PHI (r4v81 l.ܺ֨᩻) = (r4v2 l.ܺ֨᩻), (r4v80 l.ܺ֨᩻), (r4v2 l.ܺ֨᩻) binds: [B:54:0x0212, B:47:0x01bc, B:44:0x01ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:115:0x057f. Please report as an issue. */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        int iM3169;
        int i;
        int i2;
        int i3;
        int i4;
        int iM31610;
        int i5;
        int i6;
        RunnableC16500 runnableC16500;
        int iM2761;
        int i7;
        int i8;
        RunnableC16500 runnableC16501;
        int i9;
        int i10;
        int i11;
        int i12;
        short[] sArr;
        short[] sArr2;
        RunnableC16500 runnableC16502;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        short[] sArr3;
        RunnableC16500 runnableC16503;
        int i18;
        RunnableC16500 runnableC16504;
        RunnableC16500 runnableC16505;
        short[] sArr4;
        int iM2762;
        int i19;
        int i20;
        int iM31611;
        int i21;
        int i22;
        C17246 c17246 = this;
        int i23 = C23916.f77426;
        int i24 = C3448.f11240;
        int iM31612 = (C0773.m3169("ۘ۬") + i23) * (-73);
        int i25 = ((iM31612 ^ i24) * 28565) ^ 60850632;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        int i26 = iM31612 ^ (-1548256352);
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        short s = 0;
        short s2 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 105657760;
        int i44 = 0;
        RunnableC16500 runnableC16506 = null;
        short[] sArr12 = null;
        char c = 0;
        RunnableC16500 runnableC16507 = null;
        String str = null;
        while (true) {
            i43 = i26 ^ (i25 & (((i43 ^ i24) * 17259) >> 31));
            switch (i43) {
                case -2080344263:
                case -1900743736:
                    runnableC16507 = runnableC16507;
                    if (!C2419.m8175(str, C1564.m5510(f56185, 25, 4, i32))) {
                        i41 = i41;
                        i44 = i44;
                        sArr12 = sArr12;
                        i27 = i27;
                        i40 = i40;
                        i42 = i42;
                        sArr8 = sArr8;
                        runnableC16506 = runnableC16506;
                        i3 = i36;
                        int iM2763 = C0619.m2761("᩸۠") ^ i24;
                        String str2 = str;
                        i25 = ((iM2763 ^ i23) * (-19019)) ^ (-1898308862);
                        i2 = iM2763 ^ 1687906001;
                        i37 = i37;
                        i44 = i44;
                        str = str2;
                        i36 = i3;
                        runnableC16506 = runnableC16506;
                        sArr8 = sArr8;
                        i42 = i42;
                        i40 = i40;
                        i38 = i38;
                        i27 = i27;
                        sArr12 = sArr12;
                        i41 = i41;
                        i39 = i39;
                        runnableC16507 = runnableC16507;
                        i26 = i2;
                        c17246 = this;
                    } else {
                        iM2761 = C0619.m2761("ܶ۬") ^ i24;
                        i7 = ((iM2761 ^ i23) * 9003) ^ 1105226919;
                        i8 = -1521596005;
                        runnableC16500 = runnableC16507;
                        i26 = iM2761 ^ i8;
                        i25 = i7;
                        runnableC16507 = runnableC16500;
                    }
                    break;
                case -1932402401:
                case 852926501:
                    runnableC16507 = runnableC16507;
                    i39 = i39;
                    i41 = i41;
                    i44 = i44;
                    sArr12 = sArr12;
                    i27 = i27;
                    i38 = i38;
                    i40 = i40;
                    i42 = i42;
                    sArr8 = sArr8;
                    runnableC16506 = runnableC16506;
                    sArr6 = f56185;
                    i36 = 1;
                    i37 = 4;
                    if (C2485.f7950 == 0) {
                        iM31610 = (C0773.m3169("᩶᩵") + i23) * (-125);
                        i5 = ((iM31610 ^ i24) * (-24811)) ^ (-1181227727);
                        i6 = 1906644831;
                        int i45 = iM31610 ^ i6;
                        i44 = i44;
                        runnableC16500 = runnableC16507;
                        i26 = i45;
                        i25 = i5;
                        runnableC16506 = runnableC16506;
                        sArr8 = sArr8;
                        i42 = i42;
                        i40 = i40;
                        i38 = i38;
                        i27 = i27;
                        sArr12 = sArr12;
                        i41 = i41;
                        i39 = i39;
                        runnableC16507 = runnableC16500;
                    } else {
                        int iM31613 = (C0773.m3169("ܶ۫") ^ i23) * 87;
                        i25 = ((iM31613 ^ i24) * (-32447)) ^ 1305545565;
                        i2 = iM31613 ^ 55694468;
                        i44 = i44;
                        runnableC16506 = runnableC16506;
                        sArr8 = sArr8;
                        i42 = i42;
                        i40 = i40;
                        i38 = i38;
                        i27 = i27;
                        sArr12 = sArr12;
                        i41 = i41;
                        i39 = i39;
                        runnableC16507 = runnableC16507;
                        i26 = i2;
                        c17246 = this;
                    }
                    break;
                case -1908382318:
                case 1522457808:
                    sArr11 = f56185;
                    i31 = 58;
                    i33 = 4;
                    if (C11235.f35427 >= 0) {
                        iM31611 = C0773.m3169("᩸ܽ") ^ i23;
                        i21 = ((iM31611 ^ i24) * 5471) ^ (-1583854568);
                        i22 = 1700884222;
                    } else {
                        iM31611 = (i23 - C0619.m2761("۫۫")) * 91;
                        i21 = ((iM31611 ^ i24) * 23011) ^ 765403382;
                        i22 = 1564132814;
                    }
                    i26 = iM31611 ^ i22;
                    i25 = i21;
                    break;
                case -1869377437:
                case -1806918834:
                    C1343.m4943();
                    if (C3779.f12953 <= 0) {
                        iM31611 = (i24 - C0619.m2761("᩺۟")) * (-85);
                        i21 = ((iM31611 ^ i23) * 7525) ^ (-1043140203);
                        i22 = -617352417;
                    } else {
                        iM31611 = (C0773.m3169("ۙ᩵") + i24) * (-101);
                        i21 = ((iM31611 ^ i23) * (-28583)) ^ (-5721256);
                        i22 = -1661767488;
                    }
                    i26 = iM31611 ^ i22;
                    i25 = i21;
                    break;
                case -1792308303:
                case 1866770429:
                    C17202.m40373(C2834.m9343(f56185, 37, 4, i32));
                    break;
                case -1755723226:
                case 1326630990:
                    runnableC16507 = runnableC16507;
                    i39 = i39;
                    i41 = i41;
                    i44 = i44;
                    sArr12 = sArr12;
                    i27 = i27;
                    i38 = i38;
                    i40 = i40;
                    i42 = i42;
                    sArr8 = sArr8;
                    runnableC16506 = runnableC16506;
                    i36 = i36;
                    sArr5 = f56185;
                    c = 0;
                    if (!C0619.f2439) {
                        iM3169 = (C0773.m3169("ܰ᩷") + i23) * 95;
                        i25 = ((iM3169 ^ i24) * (-6471)) ^ (-992859872);
                        i = 135212038;
                        i2 = iM3169 ^ i;
                        i36 = i36;
                        i44 = i44;
                        runnableC16506 = runnableC16506;
                        sArr8 = sArr8;
                        i42 = i42;
                        i40 = i40;
                        i38 = i38;
                        i27 = i27;
                        sArr12 = sArr12;
                        i41 = i41;
                        i39 = i39;
                        runnableC16507 = runnableC16507;
                        i26 = i2;
                        c17246 = this;
                    } else {
                        i36 = i36;
                        int iM31614 = (C0773.m3169("ܶ۫") ^ i23) * 87;
                        i25 = ((iM31614 ^ i24) * (-32447)) ^ 1305545565;
                        i2 = iM31614 ^ 55694468;
                        i44 = i44;
                        runnableC16506 = runnableC16506;
                        sArr8 = sArr8;
                        i42 = i42;
                        i40 = i40;
                        i38 = i38;
                        i27 = i27;
                        sArr12 = sArr12;
                        i41 = i41;
                        i39 = i39;
                        runnableC16507 = runnableC16507;
                        i26 = i2;
                        c17246 = this;
                    }
                    break;
                case -1748356779:
                case 676178135:
                    if (!C2966.m9664()) {
                        runnableC16501 = runnableC16507;
                        i14 = i38;
                        i15 = i39;
                        i9 = i40;
                        i10 = i41;
                        i11 = i42;
                        i12 = i44;
                        sArr = sArr12;
                        sArr2 = sArr8;
                        runnableC16502 = runnableC16506;
                        i13 = i27;
                        int iM2764 = (i23 - C0619.m2761("ۢ᩸")) * 99;
                        i44 = i12;
                        int i46 = i9;
                        i38 = i14;
                        i25 = ((iM2764 ^ i24) * 11249) ^ 829600427;
                        i27 = i13;
                        sArr12 = sArr;
                        i41 = i10;
                        i39 = i15;
                        runnableC16507 = runnableC16501;
                        i26 = iM2764 ^ 1428095779;
                        runnableC16506 = runnableC16502;
                        sArr8 = sArr2;
                        i42 = i11;
                        i40 = i46;
                    } else {
                        iM31611 = (C0773.m3169("ۙ᩵") + i24) * (-101);
                        i21 = ((iM31611 ^ i23) * (-28583)) ^ (-5721256);
                        i22 = -1661767488;
                        i26 = iM31611 ^ i22;
                        i25 = i21;
                    }
                    break;
                case -1727799758:
                case 1267216054:
                    runnableC16507 = runnableC16507;
                    i39 = i39;
                    short[] sArr13 = sArr7;
                    i41 = i41;
                    i44 = i44;
                    sArr12 = sArr12;
                    i27 = i27;
                    i38 = i38;
                    i40 = i40;
                    i42 = i42;
                    sArr8 = sArr8;
                    runnableC16506 = runnableC16506;
                    if (!C3492.m11490(str, C2310.m7803(sArr13, i38, i39, i32))) {
                        sArr7 = sArr13;
                        str = str;
                        i3 = i36;
                        i37 = i37;
                        int iM2765 = C0619.m2761("᩸۠") ^ i24;
                        String str3 = str;
                        i25 = ((iM2765 ^ i23) * (-19019)) ^ (-1898308862);
                        i2 = iM2765 ^ 1687906001;
                        i37 = i37;
                        i44 = i44;
                        str = str3;
                        i36 = i3;
                        runnableC16506 = runnableC16506;
                        sArr8 = sArr8;
                        i42 = i42;
                        i40 = i40;
                        i38 = i38;
                        i27 = i27;
                        sArr12 = sArr12;
                        i41 = i41;
                        i39 = i39;
                        runnableC16507 = runnableC16507;
                        i26 = i2;
                        c17246 = this;
                    } else {
                        int iM2766 = C0619.m2761("᩵۠") ^ i23;
                        sArr7 = sArr13;
                        i25 = ((iM2766 ^ i24) * (-6161)) ^ (-1114856318);
                        i44 = i44;
                        i4 = i41;
                        i39 = i39;
                        runnableC16507 = runnableC16507;
                        i26 = iM2766 ^ (-40202180);
                        runnableC16506 = runnableC16506;
                        sArr8 = sArr8;
                        i42 = i42;
                        i40 = i40;
                        i38 = i38;
                        i27 = i27;
                        sArr12 = sArr12;
                        i41 = i4;
                    }
                    break;
                case -1712986699:
                case 1449107992:
                    runnableC16507 = runnableC16507;
                    int i47 = i27;
                    i16 = i42;
                    i17 = i44;
                    sArr3 = sArr8;
                    runnableC16503 = runnableC16506;
                    short[] sArr14 = f56185;
                    i41 = 9;
                    i18 = 4;
                    if (C3998.f13671 != 0) {
                        i27 = i47;
                        sArr12 = sArr14;
                        int iM31615 = C0773.m3169("ۧۢ") ^ i24;
                        i44 = i17;
                        runnableC16500 = runnableC16507;
                        i26 = iM31615 ^ 712128962;
                        i25 = ((iM31615 ^ i23) * (-11771)) ^ 232993974;
                        runnableC16506 = runnableC16503;
                        sArr8 = sArr3;
                        i42 = i16;
                        i40 = i18;
                        runnableC16507 = runnableC16500;
                    } else {
                        int iM31616 = (C0773.m3169("ۜܺ") + i23) * (-17);
                        int i48 = ((iM31616 ^ i24) * 30317) ^ (-1630735485);
                        i44 = i17;
                        runnableC16507 = runnableC16507;
                        i26 = iM31616 ^ 827597927;
                        runnableC16506 = runnableC16503;
                        sArr8 = sArr3;
                        i42 = i16;
                        i40 = 4;
                        sArr12 = sArr14;
                        i25 = i48;
                        i27 = i47;
                    }
                    break;
                case -1680239056:
                case 1000659380:
                    C2702.m8876();
                    C2310.m7813();
                    break;
                case -1389142226:
                case 1292309323:
                    sArr10 = f56185;
                    i29 = 52;
                    i30 = 6;
                    if (!RunnableC1848.f6235) {
                        iM31611 = C0773.m3169("ۜۙ") ^ i23;
                        i21 = ((iM31611 ^ i24) * (-18201)) ^ (-515132564);
                        i22 = 581203391;
                        i26 = iM31611 ^ i22;
                        i25 = i21;
                    } else {
                        runnableC16501 = runnableC16507;
                        i14 = i38;
                        i15 = i39;
                        i9 = i40;
                        i10 = i41;
                        i11 = i42;
                        i12 = i44;
                        sArr = sArr12;
                        sArr2 = sArr8;
                        runnableC16502 = runnableC16506;
                        i13 = i27;
                        int iM2767 = (i23 - C0619.m2761("ۢ᩸")) * 99;
                        i44 = i12;
                        int i49 = i9;
                        i38 = i14;
                        i25 = ((iM2767 ^ i24) * 11249) ^ 829600427;
                        i27 = i13;
                        sArr12 = sArr;
                        i41 = i10;
                        i39 = i15;
                        runnableC16507 = runnableC16501;
                        i26 = iM2767 ^ 1428095779;
                        runnableC16506 = runnableC16502;
                        sArr8 = sArr2;
                        i42 = i11;
                        i40 = i49;
                    }
                    break;
                case -1279606532:
                case -1203641802:
                    C3734.m12142(C0950.m3780(sArr11, i31, i33, i32));
                    runnableC16506 = c17246.f56192;
                    if (runnableC16506 != null) {
                        iM31611 = C0619.m2761("ۤ֫") ^ i23;
                        i21 = ((iM31611 ^ i24) * (-10097)) ^ 1473732727;
                        i22 = 931571869;
                    } else {
                        iM31611 = (i23 - C0619.m2761("᩵ۛ")) * 69;
                        i21 = ((iM31611 ^ i24) * (-1059)) ^ 1575991524;
                        i22 = -1642422549;
                    }
                    i26 = iM31611 ^ i22;
                    i25 = i21;
                    break;
                case -1234312579:
                case 161520249:
                    runnableC16507 = runnableC16507;
                    i39 = i39;
                    i41 = i41;
                    i44 = i44;
                    sArr12 = sArr12;
                    i27 = i27;
                    i38 = i38;
                    i40 = i40;
                    i42 = i42;
                    sArr8 = sArr8;
                    runnableC16506 = runnableC16506;
                    i36 = i36;
                    i35 = i34 + 126630009;
                    s2 = 22506;
                    if (RunnableC3646.f12471) {
                        iM3169 = (C0773.m3169("ܺᩴ") + i23) * (-85);
                        i25 = ((iM3169 ^ i24) * (-5909)) ^ 2042986918;
                        i = 1216698720;
                    } else {
                        iM3169 = C0619.m2761("ܳ֫") ^ i23;
                        i25 = ((iM3169 ^ i24) * (-3085)) ^ (-1499292762);
                        i = 683584854;
                    }
                    i2 = iM3169 ^ i;
                    i36 = i36;
                    i44 = i44;
                    runnableC16506 = runnableC16506;
                    sArr8 = sArr8;
                    i42 = i42;
                    i40 = i40;
                    i38 = i38;
                    i27 = i27;
                    sArr12 = sArr12;
                    i41 = i41;
                    i39 = i39;
                    runnableC16507 = runnableC16507;
                    i26 = i2;
                    c17246 = this;
                    break;
                case -1152172362:
                case 172139708:
                    if (C1783.f6087 > 0) {
                        iM31611 = (i24 - C0619.m2761("᩺۟")) * (-85);
                        i21 = ((iM31611 ^ i23) * 7525) ^ (-1043140203);
                        i22 = -617352417;
                    } else {
                        iM31611 = C0773.m3169("᩸ܽ") ^ i23;
                        i21 = ((iM31611 ^ i24) * 5471) ^ (-1583854568);
                        i22 = 1700884222;
                    }
                    i26 = iM31611 ^ i22;
                    i25 = i21;
                    break;
                case -1067979685:
                case -426763642:
                    runnableC16507 = runnableC16507;
                    if (!C3492.m11490(str, C1321.m4861(f56185, 21, 4, i32))) {
                        i41 = i41;
                        i44 = i44;
                        sArr12 = sArr12;
                        i27 = i27;
                        i40 = i40;
                        i42 = i42;
                        sArr8 = sArr8;
                        runnableC16506 = runnableC16506;
                        i3 = i36;
                        int iM2768 = C0619.m2761("᩸۠") ^ i24;
                        String str4 = str;
                        i25 = ((iM2768 ^ i23) * (-19019)) ^ (-1898308862);
                        i2 = iM2768 ^ 1687906001;
                        i37 = i37;
                        i44 = i44;
                        str = str4;
                        i36 = i3;
                        runnableC16506 = runnableC16506;
                        sArr8 = sArr8;
                        i42 = i42;
                        i40 = i40;
                        i38 = i38;
                        i27 = i27;
                        sArr12 = sArr12;
                        i41 = i41;
                        i39 = i39;
                        runnableC16507 = runnableC16507;
                        i26 = i2;
                        c17246 = this;
                    } else {
                        iM2761 = C0619.m2761("ܶ۬") ^ i24;
                        i7 = ((iM2761 ^ i23) * 9003) ^ 1105226919;
                        i8 = -1521596005;
                        runnableC16500 = runnableC16507;
                        i26 = iM2761 ^ i8;
                        i25 = i7;
                        runnableC16507 = runnableC16500;
                    }
                    break;
                case -1043085501:
                case 407371092:
                    C3734.m12142(C2485.m8350(sArr10, i29, i30, i32));
                    runnableC16507 = c17246.f56192;
                    if (runnableC16507 != null) {
                        iM31611 = C0773.m3169("֫ۜ") ^ i24;
                        i21 = ((iM31611 ^ i23) * 13169) ^ 1854986269;
                        i22 = -2009973825;
                    } else {
                        iM31611 = (i23 - C0619.m2761("᩵ۛ")) * 69;
                        i21 = ((iM31611 ^ i24) * (-1059)) ^ 1575991524;
                        i22 = -1642422549;
                    }
                    i26 = iM31611 ^ i22;
                    i25 = i21;
                    break;
                case -1036297793:
                case 1210492062:
                    C2419.m8174();
                    RunnableC3055.m9933();
                    iM31611 = (i24 - C0619.m2761("᩺۟")) * (-85);
                    i21 = ((iM31611 ^ i23) * 7525) ^ (-1043140203);
                    i22 = -617352417;
                    i26 = iM31611 ^ i22;
                    i25 = i21;
                    break;
                case -1000040740:
                case 1288153888:
                    C17202.m40373(C3033.m9847(sArr6, i36, i37, i32));
                    break;
                case -965143914:
                case 1193273870:
                    if (C1783.f6087 > 0) {
                        runnableC16507 = runnableC16507;
                        i39 = i39;
                        i41 = i41;
                        i44 = i44;
                        sArr12 = sArr12;
                        i27 = i27;
                        i38 = i38;
                        i40 = i40;
                        i42 = i42;
                        sArr8 = sArr8;
                        runnableC16506 = runnableC16506;
                        int iM31617 = (C0773.m3169("ܶ۫") ^ i23) * 87;
                        i25 = ((iM31617 ^ i24) * (-32447)) ^ 1305545565;
                        i2 = iM31617 ^ 55694468;
                        i44 = i44;
                        runnableC16506 = runnableC16506;
                        sArr8 = sArr8;
                        i42 = i42;
                        i40 = i40;
                        i38 = i38;
                        i27 = i27;
                        sArr12 = sArr12;
                        i41 = i41;
                        i39 = i39;
                        runnableC16507 = runnableC16507;
                        i26 = i2;
                        c17246 = this;
                    } else {
                        runnableC16504 = runnableC16507;
                        sArr4 = sArr8;
                        runnableC16505 = runnableC16506;
                        iM2762 = C0773.m3169("ܿܰ") ^ i23;
                        i19 = ((iM2762 ^ i24) * (-24281)) ^ (-894971979);
                        i20 = 1230327617;
                        RunnableC16500 runnableC16508 = runnableC16505;
                        sArr8 = sArr4;
                        i25 = i19;
                        runnableC16506 = runnableC16508;
                        RunnableC16500 runnableC16509 = runnableC16504;
                        i26 = iM2762 ^ i20;
                        runnableC16507 = runnableC16509;
                    }
                    break;
                case -963131135:
                case 1081868347:
                    break;
                case -948242271:
                case 1814379574:
                    C3734.m12142(C3779.m12266(f56185, 33, 4, i32));
                    break;
                case -784466345:
                case 2116957707:
                    runnableC16504 = runnableC16507;
                    runnableC16505 = runnableC16506;
                    sArr4 = f56185;
                    i42 = 13;
                    i44 = 4;
                    if (C3077.f9998) {
                        iM2762 = C0619.m2761("᩻֫") ^ i23;
                        i19 = ((iM2762 ^ i24) * 14725) ^ 1821100420;
                        i20 = 1574803331;
                    } else {
                        iM2762 = C0773.m3169("ܿܰ") ^ i23;
                        i19 = ((iM2762 ^ i24) * (-24281)) ^ (-894971979);
                        i20 = 1230327617;
                    }
                    RunnableC16500 runnableC165010 = runnableC16505;
                    sArr8 = sArr4;
                    i25 = i19;
                    runnableC16506 = runnableC165010;
                    RunnableC16500 runnableC165011 = runnableC16504;
                    i26 = iM2762 ^ i20;
                    runnableC16507 = runnableC165011;
                    break;
                case -759715323:
                case 1178278936:
                    runnableC16507 = runnableC16507;
                    i39 = i39;
                    i41 = i41;
                    i44 = i44;
                    sArr12 = sArr12;
                    i27 = i27;
                    i38 = i38;
                    i40 = i40;
                    i42 = i42;
                    sArr8 = sArr8;
                    runnableC16506 = runnableC16506;
                    i36 = i36;
                    s = sArr5[c];
                    i34 = s * s;
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0773.m3169("ܺᩴ") + i23) * (-85);
                        i25 = ((iM3169 ^ i24) * (-5909)) ^ 2042986918;
                        i = 1216698720;
                    } else {
                        iM3169 = (C0619.m2761("۬᩷") + i24) * 21;
                        i25 = ((iM3169 ^ i23) * (-21259)) ^ (-530757077);
                        i = -1202856456;
                    }
                    i2 = iM3169 ^ i;
                    i36 = i36;
                    i44 = i44;
                    runnableC16506 = runnableC16506;
                    sArr8 = sArr8;
                    i42 = i42;
                    i40 = i40;
                    i38 = i38;
                    i27 = i27;
                    sArr12 = sArr12;
                    i41 = i41;
                    i39 = i39;
                    runnableC16507 = runnableC16507;
                    i26 = i2;
                    c17246 = this;
                    break;
                case -616280468:
                case 1029727820:
                    runnableC16507 = runnableC16507;
                    i37 = i37;
                    i39 = i39;
                    i41 = i41;
                    i44 = i44;
                    sArr12 = sArr12;
                    i27 = i27;
                    i38 = i38;
                    i40 = i40;
                    i42 = i42;
                    sArr8 = sArr8;
                    runnableC16506 = runnableC16506;
                    i3 = i36;
                    str = c17246.f56191;
                    if (str == null) {
                        int iM2769 = C0619.m2761("᩸۠") ^ i24;
                        String str5 = str;
                        i25 = ((iM2769 ^ i23) * (-19019)) ^ (-1898308862);
                        i2 = iM2769 ^ 1687906001;
                        i37 = i37;
                        i44 = i44;
                        str = str5;
                        i36 = i3;
                        runnableC16506 = runnableC16506;
                        sArr8 = sArr8;
                        i42 = i42;
                        i40 = i40;
                        i38 = i38;
                        i27 = i27;
                        sArr12 = sArr12;
                        i41 = i41;
                        i39 = i39;
                        runnableC16507 = runnableC16507;
                        i26 = i2;
                        c17246 = this;
                    } else {
                        int iM27610 = C0619.m2761("۠ܺ") ^ i23;
                        i37 = i37;
                        i44 = i44;
                        str = str;
                        i25 = ((iM27610 ^ i24) * 27871) ^ (-1288520697);
                        c17246 = this;
                        i4 = i41;
                        i39 = i39;
                        runnableC16507 = runnableC16507;
                        i26 = iM27610 ^ 881626863;
                        i36 = i3;
                        runnableC16506 = runnableC16506;
                        sArr8 = sArr8;
                        i42 = i42;
                        i40 = i40;
                        i38 = i38;
                        i27 = i27;
                        sArr12 = sArr12;
                        i41 = i4;
                    }
                    break;
                case -610019895:
                case 2089603218:
                    runnableC16507 = runnableC16507;
                    if (!C2419.m8175(str, C3492.m11486(sArr9, i27, i28, i32))) {
                        i41 = i41;
                        i44 = i44;
                        sArr12 = sArr12;
                        i27 = i27;
                        i40 = i40;
                        i42 = i42;
                        sArr8 = sArr8;
                        runnableC16506 = runnableC16506;
                        i3 = i36;
                        int iM27611 = C0619.m2761("᩸۠") ^ i24;
                        String str6 = str;
                        i25 = ((iM27611 ^ i23) * (-19019)) ^ (-1898308862);
                        i2 = iM27611 ^ 1687906001;
                        i37 = i37;
                        i44 = i44;
                        str = str6;
                        i36 = i3;
                        runnableC16506 = runnableC16506;
                        sArr8 = sArr8;
                        i42 = i42;
                        i40 = i40;
                        i38 = i38;
                        i27 = i27;
                        sArr12 = sArr12;
                        i41 = i41;
                        i39 = i39;
                        runnableC16507 = runnableC16507;
                        i26 = i2;
                        c17246 = this;
                    } else {
                        iM2761 = C0619.m2761("֨ܿ") ^ i24;
                        i7 = ((iM2761 ^ i23) * 26749) ^ 116774536;
                        i8 = -324277806;
                        runnableC16500 = runnableC16507;
                        i26 = iM2761 ^ i8;
                        i25 = i7;
                        runnableC16507 = runnableC16500;
                    }
                    break;
                case -533658490:
                case 308091416:
                    runnableC16507 = runnableC16507;
                    i39 = i39;
                    i41 = i41;
                    i44 = i44;
                    sArr12 = sArr12;
                    i27 = i27;
                    i38 = i38;
                    i40 = i40;
                    i42 = i42;
                    sArr8 = sArr8;
                    runnableC16506 = runnableC16506;
                    i36 = i36;
                    if ((s * s2) - i35 <= 0) {
                        iM3169 = C0619.m2761("ۙۢ") ^ i24;
                        i25 = ((iM3169 ^ i23) * (-14783)) ^ (-264723731);
                        i = -1858078850;
                    } else {
                        iM3169 = C0619.m2761("ܶܶ") ^ i24;
                        i25 = ((iM3169 ^ i23) * 2431) ^ 1121757712;
                        i = -925228226;
                    }
                    i2 = iM3169 ^ i;
                    i36 = i36;
                    i44 = i44;
                    runnableC16506 = runnableC16506;
                    sArr8 = sArr8;
                    i42 = i42;
                    i40 = i40;
                    i38 = i38;
                    i27 = i27;
                    sArr12 = sArr12;
                    i41 = i41;
                    i39 = i39;
                    runnableC16507 = runnableC16507;
                    i26 = i2;
                    c17246 = this;
                    break;
                case -471381372:
                case 1618686344:
                    runnableC16507.run();
                    C11471 c11471 = C11471.f36082;
                    iM31611 = (i23 - C0619.m2761("᩵ۛ")) * 69;
                    i21 = ((iM31611 ^ i24) * (-1059)) ^ 1575991524;
                    i22 = -1642422549;
                    i26 = iM31611 ^ i22;
                    i25 = i21;
                    break;
                case -446212770:
                case 1602291373:
                    if (AbstractC0116.f1064 <= 0) {
                        runnableC16504 = runnableC16507;
                        sArr4 = sArr8;
                        runnableC16505 = runnableC16506;
                        iM2762 = C0773.m3169("ܿܰ") ^ i23;
                        i19 = ((iM2762 ^ i24) * (-24281)) ^ (-894971979);
                        i20 = 1230327617;
                        RunnableC16500 runnableC165012 = runnableC16505;
                        sArr8 = sArr4;
                        i25 = i19;
                        runnableC16506 = runnableC165012;
                        RunnableC16500 runnableC165013 = runnableC16504;
                        i26 = iM2762 ^ i20;
                        runnableC16507 = runnableC165013;
                    } else {
                        runnableC16507 = runnableC16507;
                        i18 = i40;
                        i16 = i42;
                        i17 = i44;
                        sArr3 = sArr8;
                        runnableC16503 = runnableC16506;
                        int iM31618 = C0773.m3169("ۧۢ") ^ i24;
                        i44 = i17;
                        runnableC16500 = runnableC16507;
                        i26 = iM31618 ^ 712128962;
                        i25 = ((iM31618 ^ i23) * (-11771)) ^ 232993974;
                        runnableC16506 = runnableC16503;
                        sArr8 = sArr3;
                        i42 = i16;
                        i40 = i18;
                        runnableC16507 = runnableC16500;
                    }
                    break;
                case -419448537:
                case 254057714:
                    C17202.m40373(C1519.m5399(f56185, 41, 5, i32));
                    break;
                case -223462286:
                case 242155811:
                    runnableC16507 = runnableC16507;
                    i39 = i39;
                    i41 = i41;
                    i44 = i44;
                    sArr12 = sArr12;
                    i27 = i27;
                    i38 = i38;
                    i40 = i40;
                    i42 = i42;
                    sArr8 = sArr8;
                    runnableC16506 = runnableC16506;
                    switch (C0619.m2761(str)) {
                        case 1596796:
                            iM31610 = (i24 - C0773.m3169("ۛܺ")) * (-21);
                            i5 = ((iM31610 ^ i23) * 25585) ^ (-1772955347);
                            i6 = 104738843;
                            int i410 = iM31610 ^ i6;
                            i44 = i44;
                            runnableC16500 = runnableC16507;
                            i26 = i410;
                            i25 = i5;
                            runnableC16506 = runnableC16506;
                            sArr8 = sArr8;
                            i42 = i42;
                            i40 = i40;
                            i38 = i38;
                            i27 = i27;
                            sArr12 = sArr12;
                            i41 = i41;
                            i39 = i39;
                            runnableC16507 = runnableC16500;
                            break;
                        case 1626587:
                            iM31610 = (i23 - C0773.m3169("ܿۡ")) * (-59);
                            i5 = ((iM31610 ^ i24) * (-31001)) ^ 89313187;
                            i6 = 999208316;
                            int i411 = iM31610 ^ i6;
                            i44 = i44;
                            runnableC16500 = runnableC16507;
                            i26 = i411;
                            i25 = i5;
                            runnableC16506 = runnableC16506;
                            sArr8 = sArr8;
                            i42 = i42;
                            i40 = i40;
                            i38 = i38;
                            i27 = i27;
                            sArr12 = sArr12;
                            i41 = i41;
                            i39 = i39;
                            runnableC16507 = runnableC16500;
                            break;
                        case 1656379:
                            iM31610 = (C0773.m3169("᩹ۨ") + i24) * 11;
                            i5 = ((iM31610 ^ i23) * (-30759)) ^ 1584869749;
                            i6 = 712201232;
                            int i412 = iM31610 ^ i6;
                            i44 = i44;
                            runnableC16500 = runnableC16507;
                            i26 = i412;
                            i25 = i5;
                            runnableC16506 = runnableC16506;
                            sArr8 = sArr8;
                            i42 = i42;
                            i40 = i40;
                            i38 = i38;
                            i27 = i27;
                            sArr12 = sArr12;
                            i41 = i41;
                            i39 = i39;
                            runnableC16507 = runnableC16500;
                            break;
                        case 1656380:
                            iM31610 = (C0773.m3169("᩹ۖ") + i24) * (-111);
                            i5 = ((iM31610 ^ i23) * 26491) ^ (-1569609069);
                            i6 = 1061672042;
                            int i413 = iM31610 ^ i6;
                            i44 = i44;
                            runnableC16500 = runnableC16507;
                            i26 = i413;
                            i25 = i5;
                            runnableC16506 = runnableC16506;
                            sArr8 = sArr8;
                            i42 = i42;
                            i40 = i40;
                            i38 = i38;
                            i27 = i27;
                            sArr12 = sArr12;
                            i41 = i41;
                            i39 = i39;
                            runnableC16507 = runnableC16500;
                            break;
                        case 1656382:
                            iM31610 = (C0619.m2761("ۤ᩺") ^ i23) * (-43);
                            i5 = ((iM31610 ^ i24) * (-28243)) ^ (-2120382861);
                            i6 = -611031589;
                            int i414 = iM31610 ^ i6;
                            i44 = i44;
                            runnableC16500 = runnableC16507;
                            i26 = i414;
                            i25 = i5;
                            runnableC16506 = runnableC16506;
                            sArr8 = sArr8;
                            i42 = i42;
                            i40 = i40;
                            i38 = i38;
                            i27 = i27;
                            sArr12 = sArr12;
                            i41 = i41;
                            i39 = i39;
                            runnableC16507 = runnableC16500;
                            break;
                        case 1715960:
                            iM31610 = C0619.m2761("۟᩶") ^ i23;
                            i5 = ((iM31610 ^ i24) * 3421) ^ 594620474;
                            i6 = -1269346519;
                            int i415 = iM31610 ^ i6;
                            i44 = i44;
                            runnableC16500 = runnableC16507;
                            i26 = i415;
                            i25 = i5;
                            runnableC16506 = runnableC16506;
                            sArr8 = sArr8;
                            i42 = i42;
                            i40 = i40;
                            i38 = i38;
                            i27 = i27;
                            sArr12 = sArr12;
                            i41 = i41;
                            i39 = i39;
                            runnableC16507 = runnableC16500;
                            break;
                        case 1745751:
                            iM31610 = C0619.m2761("ۗ᩹") ^ i24;
                            i5 = ((iM31610 ^ i23) * (-14217)) ^ (-977294141);
                            i6 = -127555575;
                            int i416 = iM31610 ^ i6;
                            i44 = i44;
                            runnableC16500 = runnableC16507;
                            i26 = i416;
                            i25 = i5;
                            runnableC16506 = runnableC16506;
                            sArr8 = sArr8;
                            i42 = i42;
                            i40 = i40;
                            i38 = i38;
                            i27 = i27;
                            sArr12 = sArr12;
                            i41 = i41;
                            i39 = i39;
                            runnableC16507 = runnableC16500;
                            break;
                        default:
                            str = str;
                            i3 = i36;
                            i37 = i37;
                            int iM27612 = C0619.m2761("᩸۠") ^ i24;
                            String str7 = str;
                            i25 = ((iM27612 ^ i23) * (-19019)) ^ (-1898308862);
                            i2 = iM27612 ^ 1687906001;
                            i37 = i37;
                            i44 = i44;
                            str = str7;
                            i36 = i3;
                            runnableC16506 = runnableC16506;
                            sArr8 = sArr8;
                            i42 = i42;
                            i40 = i40;
                            i38 = i38;
                            i27 = i27;
                            sArr12 = sArr12;
                            i41 = i41;
                            i39 = i39;
                            runnableC16507 = runnableC16507;
                            i26 = i2;
                            c17246 = this;
                            break;
                    }
                    break;
                case -197411562:
                case 184870096:
                    runnableC16501 = runnableC16507;
                    i9 = i40;
                    i10 = i41;
                    i11 = i42;
                    i12 = i44;
                    sArr = sArr12;
                    sArr2 = sArr8;
                    runnableC16502 = runnableC16506;
                    i13 = i27;
                    sArr7 = f56185;
                    i14 = 5;
                    i15 = 4;
                    if (C3033.m9845() <= 0) {
                        int iM27613 = (i23 - C0619.m2761("ۢ᩸")) * 99;
                        i44 = i12;
                        int i417 = i9;
                        i38 = i14;
                        i25 = ((iM27613 ^ i24) * 11249) ^ 829600427;
                        i27 = i13;
                        sArr12 = sArr;
                        i41 = i10;
                        i39 = i15;
                        runnableC16507 = runnableC16501;
                        i26 = iM27613 ^ 1428095779;
                        runnableC16506 = runnableC16502;
                        sArr8 = sArr2;
                        i42 = i11;
                        i40 = i417;
                    } else {
                        int iM27614 = C0619.m2761("ܿۧ") ^ i24;
                        i25 = ((iM27614 ^ i23) * 23237) ^ 828544284;
                        i44 = i12;
                        i27 = i13;
                        sArr12 = sArr;
                        runnableC16507 = runnableC16501;
                        i26 = iM27614 ^ 1900709148;
                        i41 = i10;
                        runnableC16506 = runnableC16502;
                        sArr8 = sArr2;
                        i39 = 4;
                        i42 = i11;
                        i40 = i9;
                        i38 = 5;
                    }
                    break;
                case 3343521:
                case 1725145023:
                    C2023.m6964();
                    if (C0619.f2439) {
                        iM31611 = (C0619.m2761("ۨ۟") ^ i24) * (-75);
                        i21 = ((iM31611 ^ i23) * 20461) ^ (-262355619);
                        i22 = -121475847;
                    } else {
                        iM31611 = (i24 - C0619.m2761("᩺۟")) * (-85);
                        i21 = ((iM31611 ^ i23) * 7525) ^ (-1043140203);
                        i22 = -617352417;
                    }
                    i26 = iM31611 ^ i22;
                    i25 = i21;
                    break;
                case 81978339:
                case 328117216:
                    C17202.m40373(C3033.m9847(f56185, 46, 6, i32));
                    break;
                case 224731212:
                case 1314059842:
                    runnableC16506.run();
                    C11471 c11472 = C11471.f36082;
                    break;
                case 271383085:
                case 1765052240:
                    runnableC16507 = runnableC16507;
                    if (!C2419.m8175(str, C4282.m13650(f56185, 29, 4, i32))) {
                        i41 = i41;
                        i44 = i44;
                        sArr12 = sArr12;
                        i27 = i27;
                        i40 = i40;
                        i42 = i42;
                        sArr8 = sArr8;
                        runnableC16506 = runnableC16506;
                        i3 = i36;
                        int iM27615 = C0619.m2761("᩸۠") ^ i24;
                        String str8 = str;
                        i25 = ((iM27615 ^ i23) * (-19019)) ^ (-1898308862);
                        i2 = iM27615 ^ 1687906001;
                        i37 = i37;
                        i44 = i44;
                        str = str8;
                        i36 = i3;
                        runnableC16506 = runnableC16506;
                        sArr8 = sArr8;
                        i42 = i42;
                        i40 = i40;
                        i38 = i38;
                        i27 = i27;
                        sArr12 = sArr12;
                        i41 = i41;
                        i39 = i39;
                        runnableC16507 = runnableC16507;
                        i26 = i2;
                        c17246 = this;
                    } else {
                        iM2761 = C0773.m3169("ܽ۠") ^ i24;
                        i7 = ((iM2761 ^ i23) * (-23241)) ^ 91772663;
                        i8 = 1711881847;
                        runnableC16500 = runnableC16507;
                        i26 = iM2761 ^ i8;
                        i25 = i7;
                        runnableC16507 = runnableC16500;
                    }
                    break;
                case 447752973:
                case 2045230265:
                    runnableC16507 = runnableC16507;
                    sArr9 = f56185;
                    i27 = 17;
                    i28 = 4;
                    if (C0487.f2131 > 0) {
                        iM2761 = (i24 - C0619.m2761("ܽ۟")) * 15;
                        i7 = ((iM2761 ^ i23) * 5733) ^ (-1955480215);
                        i8 = -523743154;
                        runnableC16500 = runnableC16507;
                        i26 = iM2761 ^ i8;
                        i25 = i7;
                        runnableC16507 = runnableC16500;
                    }
                    i18 = i40;
                    i16 = i42;
                    i17 = i44;
                    sArr3 = sArr8;
                    runnableC16503 = runnableC16506;
                    int iM31619 = C0773.m3169("ۧۢ") ^ i24;
                    i44 = i17;
                    runnableC16500 = runnableC16507;
                    i26 = iM31619 ^ 712128962;
                    i25 = ((iM31619 ^ i23) * (-11771)) ^ 232993974;
                    runnableC16506 = runnableC16503;
                    sArr8 = sArr3;
                    i42 = i16;
                    i40 = i18;
                    runnableC16507 = runnableC16500;
                    break;
                case 519802200:
                case 546535768:
                    i32 = 20439;
                    iM3169 = (C0619.m2761("ܺۢ") + i23) * (-61);
                    i25 = ((iM3169 ^ i24) * (-28329)) ^ (-1381156764);
                    i = 752501142;
                    i2 = iM3169 ^ i;
                    i36 = i36;
                    i44 = i44;
                    runnableC16506 = runnableC16506;
                    sArr8 = sArr8;
                    i42 = i42;
                    i40 = i40;
                    i38 = i38;
                    i27 = i27;
                    sArr12 = sArr12;
                    i41 = i41;
                    i39 = i39;
                    runnableC16507 = runnableC16507;
                    i26 = i2;
                    c17246 = this;
                    break;
                case 985091536:
                case 1957949508:
                    C2023.m6964();
                    if (!RunnableC0334.m2063()) {
                        runnableC16507 = runnableC16507;
                        i18 = i40;
                        i16 = i42;
                        i17 = i44;
                        sArr3 = sArr8;
                        runnableC16503 = runnableC16506;
                        int iM316110 = C0773.m3169("ۧۢ") ^ i24;
                        i44 = i17;
                        runnableC16500 = runnableC16507;
                        i26 = iM316110 ^ 712128962;
                        i25 = ((iM316110 ^ i23) * (-11771)) ^ 232993974;
                        runnableC16506 = runnableC16503;
                        sArr8 = sArr3;
                        i42 = i16;
                        i40 = i18;
                        runnableC16507 = runnableC16500;
                    } else {
                        iM31611 = C0773.m3169("᩶ۚ") ^ i24;
                        i21 = ((iM31611 ^ i23) * 11065) ^ (-773321226);
                        i22 = 2139141847;
                        i26 = iM31611 ^ i22;
                        i25 = i21;
                    }
                    break;
                case 1200287732:
                case 1941371654:
                    if (C0862.f3233 == 0) {
                        runnableC16507 = runnableC16507;
                        i18 = i40;
                        i16 = i42;
                        i17 = i44;
                        sArr3 = sArr8;
                        runnableC16503 = runnableC16506;
                        int iM316111 = C0773.m3169("ۧۢ") ^ i24;
                        i44 = i17;
                        runnableC16500 = runnableC16507;
                        i26 = iM316111 ^ 712128962;
                        i25 = ((iM316111 ^ i23) * (-11771)) ^ 232993974;
                        runnableC16506 = runnableC16503;
                        sArr8 = sArr3;
                        i42 = i16;
                        i40 = i18;
                        runnableC16507 = runnableC16500;
                    } else {
                        iM31611 = (i24 - C0619.m2761("᩺۟")) * (-85);
                        i21 = ((iM31611 ^ i23) * 7525) ^ (-1043140203);
                        i22 = -617352417;
                        i26 = iM31611 ^ i22;
                        i25 = i21;
                    }
                    break;
                case 1232775969:
                case 1732116101:
                    runnableC16507 = runnableC16507;
                    short[] sArr15 = sArr8;
                    int i50 = i42;
                    i44 = i44;
                    runnableC16506 = runnableC16506;
                    if (C2419.m8175(str, C1146.m4222(sArr15, i50, i44, i32))) {
                        int iM31620 = (C0773.m3169("֡ᩴ") ^ i23) * (-111);
                        i25 = ((iM31620 ^ i24) * 24061) ^ (-1977177454);
                        i44 = i44;
                        i42 = i50;
                        runnableC16507 = runnableC16507;
                        i26 = iM31620 ^ (-1850726894);
                        runnableC16506 = runnableC16506;
                        sArr8 = sArr15;
                    } else {
                        sArr8 = sArr15;
                        str = str;
                        i3 = i36;
                        i37 = i37;
                        int i51 = i40;
                        i42 = i50;
                        i39 = i39;
                        i41 = i41;
                        sArr12 = sArr12;
                        i27 = i27;
                        i38 = i38;
                        i40 = i51;
                        int iM27616 = C0619.m2761("᩸۠") ^ i24;
                        String str9 = str;
                        i25 = ((iM27616 ^ i23) * (-19019)) ^ (-1898308862);
                        i2 = iM27616 ^ 1687906001;
                        i37 = i37;
                        i44 = i44;
                        str = str9;
                        i36 = i3;
                        runnableC16506 = runnableC16506;
                        sArr8 = sArr8;
                        i42 = i42;
                        i40 = i40;
                        i38 = i38;
                        i27 = i27;
                        sArr12 = sArr12;
                        i41 = i41;
                        i39 = i39;
                        runnableC16507 = runnableC16507;
                        i26 = i2;
                        c17246 = this;
                    }
                    break;
                case 1680319045:
                case 2037813489:
                    i32 = 42165;
                    iM3169 = (C0619.m2761("ܺۢ") + i23) * (-61);
                    i25 = ((iM3169 ^ i24) * (-28329)) ^ (-1381156764);
                    i = 752501142;
                    i2 = iM3169 ^ i;
                    i36 = i36;
                    i44 = i44;
                    runnableC16506 = runnableC16506;
                    sArr8 = sArr8;
                    i42 = i42;
                    i40 = i40;
                    i38 = i38;
                    i27 = i27;
                    sArr12 = sArr12;
                    i41 = i41;
                    i39 = i39;
                    runnableC16507 = runnableC16507;
                    i26 = i2;
                    c17246 = this;
                    break;
                default:
                    runnableC16507 = runnableC16507;
                    int i52 = i40;
                    short[] sArr16 = sArr12;
                    i42 = i42;
                    i44 = i44;
                    i27 = i27;
                    sArr8 = sArr8;
                    runnableC16506 = runnableC16506;
                    int i53 = i41;
                    if (C2419.m8175(str, C3033.m9847(sArr16, i53, i52, i32))) {
                        int iM27617 = (C0619.m2761("ܰۨ") ^ i24) * 31;
                        i25 = ((iM27617 ^ i23) * (-9823)) ^ 203702776;
                        i44 = i44;
                        i40 = i52;
                        runnableC16507 = runnableC16507;
                        i26 = iM27617 ^ (-1245036269);
                        i27 = i27;
                        sArr12 = sArr16;
                        i41 = i53;
                        runnableC16506 = runnableC16506;
                        sArr8 = sArr8;
                        i42 = i42;
                    } else {
                        sArr12 = sArr16;
                        i40 = i52;
                        i41 = i53;
                        i3 = i36;
                        int iM27618 = C0619.m2761("᩸۠") ^ i24;
                        String str10 = str;
                        i25 = ((iM27618 ^ i23) * (-19019)) ^ (-1898308862);
                        i2 = iM27618 ^ 1687906001;
                        i37 = i37;
                        i44 = i44;
                        str = str10;
                        i36 = i3;
                        runnableC16506 = runnableC16506;
                        sArr8 = sArr8;
                        i42 = i42;
                        i40 = i40;
                        i38 = i38;
                        i27 = i27;
                        sArr12 = sArr12;
                        i41 = i41;
                        i39 = i39;
                        runnableC16507 = runnableC16507;
                        i26 = i2;
                        c17246 = this;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        AbstractActivityC17204 abstractActivityC17204 = null;
        int i = -20782996;
        int i2 = C3734.f12817;
        int i3 = C2287.f7432;
        int iM2761 = C0619.m2761("ۨ᩻") ^ i2;
        int i4 = ((iM2761 ^ i3) * 26001) ^ 1385342490;
        int i5 = 482526478;
        while (true) {
            i = ((((i ^ i3) * 17829) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -1982661852:
                case 809492461:
                    if (C2023.f6737) {
                        iM2761 = (C0619.m2761("᩸ܳ") + i2) * (-49);
                        i4 = ((iM2761 ^ i3) * (-24739)) ^ (-1280047434);
                        i5 = -1872969405;
                    } else {
                        iM2761 = (C0619.m2761("ۤ᩻") + i3) * (-33);
                        i4 = ((iM2761 ^ i2) * (-4259)) ^ 1166545802;
                        i5 = -1911561823;
                    }
                    break;
                case -1947862543:
                case -3233532:
                    if (C2288.f7433 <= 0) {
                        iM2761 = (C0773.m3169("ۙ۫") + i3) * 73;
                        i4 = ((iM2761 ^ i2) * (-20477)) ^ (-1504456842);
                        i5 = 1121212379;
                    } else {
                        iM2761 = (C0619.m2761("᩹ۘ") ^ i2) * (-9);
                        i4 = ((iM2761 ^ i3) * 25299) ^ 675027206;
                        i5 = 133900599;
                    }
                    break;
                case -1897608996:
                case -1004239728:
                    if (C2287.m7745() <= 0) {
                        iM2761 = (i3 - C0773.m3169("ۡ֫")) * (-71);
                        i4 = ((iM2761 ^ i2) * (-15095)) ^ 315070992;
                        i5 = 989322720;
                    } else {
                        iM2761 = (i2 - C0619.m2761("᩹ۖ")) * (-117);
                        i4 = ((iM2761 ^ i3) * 7719) ^ (-1122829697);
                        i5 = -1538468853;
                    }
                    break;
                case -1837169951:
                case 952493222:
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0619.m2761("᩸ܳ") + i2) * (-49);
                        i4 = ((iM2761 ^ i3) * (-24739)) ^ (-1280047434);
                        i5 = -1872969405;
                    } else {
                        iM2761 = (C0619.m2761("ܺۖ") ^ i3) * 95;
                        i4 = ((iM2761 ^ i2) * (-14257)) ^ (-2089277573);
                        i5 = -405627086;
                    }
                    break;
                case -1617889472:
                case -1003567608:
                    C3779.m12264();
                    iM2761 = (C0773.m3169("᩶۟") + i2) * (-107);
                    i4 = ((iM2761 ^ i3) * 21847) ^ 247570957;
                    i5 = -279192596;
                    break;
                case -1214540439:
                case 727792234:
                    RunnableC3646.m11813();
                    if (!C2023.f6737) {
                        iM2761 = (C0773.m3169("᩶۟") + i2) * (-107);
                        i4 = ((iM2761 ^ i3) * 21847) ^ 247570957;
                        i5 = -279192596;
                    } else {
                        iM2761 = (C0773.m3169("ۙ۫") + i3) * 73;
                        i4 = ((iM2761 ^ i2) * (-20477)) ^ (-1504456842);
                        i5 = 1121212379;
                    }
                    break;
                case -977832643:
                case 1013801538:
                    if (C2310.f7472 >= 0) {
                        iM2761 = (C0619.m2761("᩸ܳ") + i2) * (-49);
                        i4 = ((iM2761 ^ i3) * (-24739)) ^ (-1280047434);
                        i5 = -1872969405;
                    } else {
                        iM2761 = C0773.m3169("֡᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-27575)) ^ 1616250289;
                        i5 = -1378491671;
                    }
                    break;
                case -464743764:
                case 1869039673:
                    if (C0619.f2439) {
                        iM2761 = (C0773.m3169("᩶۟") + i2) * (-107);
                        i4 = ((iM2761 ^ i3) * 21847) ^ 247570957;
                        i5 = -279192596;
                    } else {
                        iM2761 = (i2 - C0619.m2761("᩹֫")) * 79;
                        i4 = ((iM2761 ^ i3) * 7967) ^ 1212578279;
                        i5 = -1103464144;
                    }
                    break;
                case -421000298:
                case 54928300:
                    RunnableC3055.m9930(abstractActivityC17204, exc, null);
                    break;
                case -411746673:
                case 2052908968:
                    AbstractC0116.m1243();
                    if (C1321.f4751 < 0) {
                        iM2761 = (i3 - C0773.m3169("ۡ֫")) * (-71);
                        i4 = ((iM2761 ^ i2) * (-15095)) ^ 315070992;
                        i5 = 989322720;
                    } else {
                        iM2761 = (C0773.m3169("ۙ۫") + i3) * 73;
                        i4 = ((iM2761 ^ i2) * (-20477)) ^ (-1504456842);
                        i5 = 1121212379;
                    }
                    break;
                case -356725522:
                case 1606681958:
                    RunnableC3055.m9933();
                    break;
                case -220574655:
                case 1716416926:
                    if (C2310.m7813() <= 0) {
                        iM2761 = (C0773.m3169("ۙ۫") + i3) * 73;
                        i4 = ((iM2761 ^ i2) * (-20477)) ^ (-1504456842);
                        i5 = 1121212379;
                    } else {
                        iM2761 = C0619.m2761("ۙ᩷") ^ i2;
                        i4 = ((iM2761 ^ i3) * 15619) ^ 1088110721;
                        i5 = -90400949;
                    }
                    break;
                case 318688345:
                case 1129856903:
                    if (C0619.m2763()) {
                        iM2761 = (i2 - C0619.m2761("ᩴۛ")) * (-95);
                        i4 = ((iM2761 ^ i3) * (-11365)) ^ (-751688358);
                        i5 = 409841787;
                    } else {
                        iM2761 = (C0773.m3169("ۙ۫") + i3) * 73;
                        i4 = ((iM2761 ^ i2) * (-20477)) ^ (-1504456842);
                        i5 = 1121212379;
                    }
                    break;
                case 543779166:
                case 1091220217:
                    if (C4238.m13540() <= 0) {
                        iM2761 = (C0619.m2761("᩸ܳ") + i2) * (-49);
                        i4 = ((iM2761 ^ i3) * (-24739)) ^ (-1280047434);
                        i5 = -1872969405;
                    } else {
                        iM2761 = (C0619.m2761("ܽۜ") ^ i3) * 99;
                        i4 = ((iM2761 ^ i2) * (-19131)) ^ (-327268149);
                        i5 = 1295473522;
                    }
                    break;
                case 943155175:
                case 1871492940:
                    if (C2419.f7754 >= 0) {
                        iM2761 = (C0773.m3169("ۙ۫") + i3) * 73;
                        i4 = ((iM2761 ^ i2) * (-20477)) ^ (-1504456842);
                        i5 = 1121212379;
                    } else {
                        iM2761 = C0619.m2761("᩻᩺") ^ i3;
                        i4 = ((iM2761 ^ i2) * 16019) ^ 1697736904;
                        i5 = 200353959;
                    }
                    break;
                default:
                    abstractActivityC17204 = this.f56190;
                    if (C3779.f12953 <= 0) {
                        iM2761 = (C0619.m2761("᩸ܳ") + i2) * (-49);
                        i4 = ((iM2761 ^ i3) * (-24739)) ^ (-1280047434);
                        i5 = -1872969405;
                    } else {
                        iM2761 = (C0773.m3169("۫ܳ") + i3) * 9;
                        i4 = ((iM2761 ^ i2) * (-22339)) ^ 643428794;
                        i5 = -2087028075;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C0487.m2362(this);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0233 A[PHI: r2 r3 r6
      0x0233: PHI (r2v5 java.lang.String) = 
      (r2v3 java.lang.String)
      (r2v4 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
      (r2v2 java.lang.String)
     binds: [B:56:0x01ed, B:60:0x021a, B:46:0x017d, B:42:0x0152, B:22:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r3v9 long) = (r3v3 long), (r3v1 long), (r3v1 long), (r3v1 long), (r3v1 long) binds: [B:56:0x01ed, B:60:0x021a, B:46:0x017d, B:42:0x0152, B:22:0x00a1] A[DONT_GENERATE, DONT_INLINE]
      0x0233: PHI (r6v4 org.json.JSONObject) = 
      (r6v2 org.json.JSONObject)
      (r6v2 org.json.JSONObject)
      (r6v3 org.json.JSONObject)
      (r6v2 org.json.JSONObject)
      (r6v2 org.json.JSONObject)
     binds: [B:56:0x01ed, B:60:0x021a, B:46:0x017d, B:42:0x0152, B:22:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        int iM2761;
        int i;
        int i2;
        int iM2762;
        int i3;
        short s;
        int iM2763;
        int i4;
        int i5;
        C17246 c17246 = this;
        int i6 = C0269.f1558;
        int i7 = C20932.f66974;
        int iM2764 = C0619.m2761("ܿۛ") ^ i7;
        int i8 = ((iM2764 ^ i6) * (-12333)) ^ (-85206335);
        Map mapPayV2 = null;
        short[] sArr = null;
        int i9 = iM2764 ^ 631391515;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        short s2 = 0;
        int i14 = 0;
        int i15 = -1587284169;
        int i16 = 0;
        String strM11810 = null;
        String strM47853 = null;
        JSONObject jSONObjectM43548 = null;
        C2592 c2592M12270 = null;
        long j = 0;
        String str = null;
        while (true) {
            i15 = i9 ^ (i8 & (((i15 ^ i6) * (-26225)) >> 31));
            switch (i15) {
                case -2037462281:
                case 44583370:
                    str = str;
                    int i17 = i11 + i12;
                    if (i16 - (i17 + i17) <= 0) {
                        iM2763 = (C0773.m3169("ܿۤ") ^ i6) * (-75);
                        i4 = ((iM2763 ^ i7) * 2653) ^ (-177148106);
                        i5 = 1030102347;
                    } else {
                        iM2763 = (i7 - C0619.m2761("ܽۢ")) * 25;
                        i4 = ((iM2763 ^ i6) * (-27715)) ^ (-691925382);
                        i5 = -1144707448;
                    }
                    i9 = iM2763 ^ i5;
                    i8 = i4;
                    str = str;
                    break;
                case -1929921625:
                case 1742930681:
                    C2966.m9664();
                    if (C3033.f9831 < 0) {
                        str = str;
                        iM2762 = (i6 - C0619.m2761("ܰ᩷")) * (-73);
                        i8 = ((iM2762 ^ i7) * 8091) ^ (-159405565);
                        i3 = 344889553;
                        i9 = iM2762 ^ i3;
                        c17246 = this;
                        str = str;
                    } else {
                        str = str;
                        s = s2;
                        int iM3169 = C0773.m3169("ܺۨ") ^ i7;
                        int i18 = ((iM3169 ^ i6) * (-2067)) ^ (-460654179);
                        i9 = iM3169 ^ (-1001776719);
                        s2 = s;
                        str = str;
                        i8 = i18;
                        c17246 = this;
                    }
                    break;
                case -1851052871:
                case -1347694395:
                    C0862.m3503();
                    C0950.m3785();
                    str = str;
                    s = s2;
                    int iM31610 = C0773.m3169("ܺۨ") ^ i7;
                    int i19 = ((iM31610 ^ i6) * (-2067)) ^ (-460654179);
                    i9 = iM31610 ^ (-1001776719);
                    s2 = s;
                    str = str;
                    i8 = i19;
                    c17246 = this;
                    break;
                case -1775380024:
                case -128906863:
                    i13 = 43809;
                    iM2763 = (C0773.m3169("ܿ᩹") + i6) * (-121);
                    i4 = ((iM2763 ^ i7) * (-22099)) ^ (-961313382);
                    i5 = -1346361185;
                    i9 = iM2763 ^ i5;
                    i8 = i4;
                    str = str;
                    break;
                case -1557496479:
                case 427622579:
                    strM47853 = C20932.m47853(f56185, 63, 7, i13);
                    if (C1542.m5459() >= 0) {
                        iM2761 = C0619.m2761("ܳۗ") ^ i7;
                        i = ((iM2761 ^ i6) * 18273) ^ (-116075456);
                        i2 = 215159374;
                    } else {
                        iM2761 = C0619.m2761("ۤۘ") ^ i6;
                        i = ((iM2761 ^ i7) * (-32239)) ^ 1876109818;
                        i2 = -614851659;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -1547879613:
                case 887637969:
                    str = str;
                    s = s2;
                    int i20 = s + 16156;
                    if (!C0619.f2439) {
                        int iM2765 = C0619.m2761("ۚܳ") ^ i7;
                        s2 = s;
                        i8 = ((iM2765 ^ i6) * 28365) ^ (-809359782);
                        i9 = iM2765 ^ (-193660031);
                        c17246 = this;
                        i14 = i20;
                        str = str;
                    } else {
                        i14 = i20;
                        int iM31611 = C0773.m3169("ܺۨ") ^ i7;
                        int i110 = ((iM31611 ^ i6) * (-2067)) ^ (-460654179);
                        i9 = iM31611 ^ (-1001776719);
                        s2 = s;
                        str = str;
                        i8 = i110;
                        c17246 = this;
                    }
                    break;
                case -1436661574:
                case 2022739832:
                    C1080.m4048(c2592M12270, c17246.f56188);
                    jSONObjectM43548 = C18738.m43548(c2592M12270);
                    if (C15243.m36589((Object) str, (Object) C0773.m3167())) {
                        iM2761 = C0619.m2761("ۢ᩵") ^ i7;
                        i = ((iM2761 ^ i6) * 8341) ^ (-323466159);
                        i2 = 1604800141;
                    } else {
                        iM2761 = C0619.m2761("֡᩹") ^ i7;
                        i = ((iM2761 ^ i6) * (-29303)) ^ (-474366897);
                        i2 = -1747518329;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -1424067774:
                case 1108656823:
                    c2592M12270.m8674(0);
                    if (AbstractC0641.f2496 < 0) {
                        iM2761 = C0619.m2761("ۨۙ") ^ i6;
                        i = ((iM2761 ^ i7) * (-23275)) ^ (-423773179);
                        i2 = -2062021548;
                        i9 = iM2761 ^ i2;
                        i8 = i;
                    } else {
                        str = str;
                        s = s2;
                        int iM31612 = C0773.m3169("ܺۨ") ^ i7;
                        int i111 = ((iM31612 ^ i6) * (-2067)) ^ (-460654179);
                        i9 = iM31612 ^ (-1001776719);
                        s2 = s;
                        str = str;
                        i8 = i111;
                        c17246 = this;
                    }
                    break;
                case -1297730835:
                case -446630047:
                    AbstractActivityC17204 abstractActivityC17204 = c17246.f56190;
                    if (C1080.f3865 >= 0) {
                        iM2761 = (i6 - C0773.m3169("᩺ܽ")) * (-103);
                        i = ((iM2761 ^ i7) * 32433) ^ 612359470;
                        i2 = -1004172423;
                    } else {
                        mapPayV2 = new PayTask(abstractActivityC17204).payV2(strM11810, true);
                        sArr = f56185;
                        i10 = 70;
                        if (C0950.f3488 >= 0) {
                            str = str;
                            s = s2;
                            int iM31613 = C0773.m3169("ܺۨ") ^ i7;
                            int i112 = ((iM31613 ^ i6) * (-2067)) ^ (-460654179);
                            i9 = iM31613 ^ (-1001776719);
                            s2 = s;
                            str = str;
                            i8 = i112;
                            c17246 = this;
                        } else {
                            iM2761 = C0619.m2761("ۧ֡") ^ i6;
                            i = ((iM2761 ^ i7) * 18447) ^ 1433675727;
                            i2 = -915411476;
                        }
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -1284021260:
                case 457081001:
                    i13 = 47823;
                    iM2763 = (C0773.m3169("ܿ᩹") + i6) * (-121);
                    i4 = ((iM2763 ^ i7) * (-22099)) ^ (-961313382);
                    i5 = -1346361185;
                    i9 = iM2763 ^ i5;
                    i8 = i4;
                    str = str;
                    break;
                case -1223081494:
                case -199467042:
                    strM11810 = RunnableC3646.m11810(jSONObjectM43548, strM47853);
                    if (C0950.f3488 < 0) {
                        RunnableC16500 runnableC16500 = new RunnableC16500(jSONObjectM43548, str, j);
                        c17246.f56192 = runnableC16500;
                        C3076.f9994 = runnableC16500;
                        if (!C0619.f2439) {
                            iM2761 = C0619.m2761("ۤۧ") ^ i7;
                            i = ((iM2761 ^ i6) * 4633) ^ 531084797;
                            i2 = -1737873685;
                            i9 = iM2761 ^ i2;
                            i8 = i;
                            break;
                        }
                    }
                    str = str;
                    iM2762 = (i6 - C0619.m2761("ܰ᩷")) * (-73);
                    i8 = ((iM2762 ^ i7) * 8091) ^ (-159405565);
                    i3 = 344889553;
                    i9 = iM2762 ^ i3;
                    c17246 = this;
                    str = str;
                    break;
                case -1122304774:
                case -367737145:
                    break;
                case -558307171:
                case -422160992:
                    str = str;
                    i16 = i14 * i14;
                    i11 = s2 * s2;
                    i12 = 261016336;
                    if (C0487.f2131 > 0) {
                        iM2763 = (C0619.m2761("᩺᩹") + i7) * 47;
                        i4 = ((iM2763 ^ i6) * 139) ^ (-1418304388);
                        i5 = 1522177547;
                        i9 = iM2763 ^ i5;
                        i8 = i4;
                        str = str;
                    } else {
                        s = s2;
                        int iM31614 = C0773.m3169("ܺۨ") ^ i7;
                        int i113 = ((iM31614 ^ i6) * (-2067)) ^ (-460654179);
                        i9 = iM31614 ^ (-1001776719);
                        s2 = s;
                        str = str;
                        i8 = i113;
                        c17246 = this;
                    }
                    break;
                case -485280184:
                case 149635728:
                    String strM3167 = C0773.m3167();
                    str = c17246.f56186;
                    if (C15243.m36589((Object) str, (Object) strM3167)) {
                        iM2761 = (i6 - C0773.m3169("᩻᩶")) * (-57);
                        i = ((iM2761 ^ i7) * 2067) ^ (-862549479);
                        i2 = 1950298645;
                    } else {
                        iM2761 = C0619.m2761("֡᩹") ^ i7;
                        i = ((iM2761 ^ i6) * (-29303)) ^ (-474366897);
                        i2 = -1747518329;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -433475991:
                case -110383962:
                    c17246.f56191 = (String) mapPayV2.get(C0950.m3780(sArr, i10, 12, i13));
                    iM2761 = C0619.m2761("֡᩹") ^ i7;
                    i = ((iM2761 ^ i6) * (-29303)) ^ (-474366897);
                    i2 = -1747518329;
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case -293193766:
                case 1259084579:
                    C3099.m10095();
                    C0619.m2763();
                    break;
                case -240698191:
                case 258894562:
                    str = str;
                    s2 = f56185[62];
                    if (C2023.f6737) {
                        iM2762 = (i6 - C0619.m2761("ܰ᩷")) * (-73);
                        i8 = ((iM2762 ^ i7) * 8091) ^ (-159405565);
                        i3 = 344889553;
                    } else {
                        iM2762 = (i6 - C0619.m2761("֨ۚ")) * 37;
                        i8 = ((iM2762 ^ i7) * 10067) ^ (-512793570);
                        i3 = -504242032;
                    }
                    i9 = iM2762 ^ i3;
                    c17246 = this;
                    str = str;
                    break;
                case -61714357:
                case 238812745:
                    long j2 = C3076.f9997;
                    str = str;
                    long j3 = c17246.f56189;
                    if (j3 == j2) {
                        int iM31615 = (C0773.m3169("ܰ۫") ^ i7) * (-33);
                        i9 = iM31615 ^ (-667966266);
                        i8 = ((iM31615 ^ i6) * 27683) ^ 1943717287;
                        j = j3;
                        str = str;
                    } else {
                        j = j3;
                        str = str;
                        iM2761 = C0619.m2761("֡᩹") ^ i7;
                        i = ((iM2761 ^ i6) * (-29303)) ^ (-474366897);
                        i2 = -1747518329;
                        i9 = iM2761 ^ i2;
                        i8 = i;
                    }
                    break;
                case -57390206:
                case 1069579205:
                    if (AbstractC0641.f2496 >= 0) {
                        iM2761 = C0619.m2761("ܳۗ") ^ i7;
                        i = ((iM2761 ^ i6) * 18273) ^ (-116075456);
                        i2 = 215159374;
                        i9 = iM2761 ^ i2;
                        i8 = i;
                    } else {
                        str = str;
                        iM2762 = (i6 - C0619.m2761("ܰ᩷")) * (-73);
                        i8 = ((iM2762 ^ i7) * 8091) ^ (-159405565);
                        i3 = 344889553;
                        i9 = iM2762 ^ i3;
                        c17246 = this;
                        str = str;
                    }
                    break;
                case 142168311:
                case 1969973723:
                    if (j != C3076.f9997) {
                        iM2761 = C0619.m2761("֡᩹") ^ i7;
                        i = ((iM2761 ^ i6) * (-29303)) ^ (-474366897);
                        i2 = -1747518329;
                    } else {
                        iM2761 = C0773.m3169("ۗ᩺") ^ i7;
                        i = ((iM2761 ^ i6) * SecP521R1Field.P16) ^ (-1247408587);
                        i2 = -1981392025;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
                case 639581391:
                case 1295969105:
                    if (!C2878.f9462) {
                        str = str;
                        iM2762 = (i6 - C0619.m2761("ܰ᩷")) * (-73);
                        i8 = ((iM2762 ^ i7) * 8091) ^ (-159405565);
                        i3 = 344889553;
                        i9 = iM2762 ^ i3;
                        c17246 = this;
                        str = str;
                    } else {
                        iM2761 = (C0773.m3169("᩹ۙ") + i6) * 77;
                        i = ((iM2761 ^ i7) * (-9733)) ^ 1355918604;
                        i2 = -1245504140;
                        i9 = iM2761 ^ i2;
                        i8 = i;
                    }
                    break;
                default:
                    c2592M12270 = C3779.m12270(4370);
                    c2592M12270.m8681(c17246.f56187);
                    if (C2310.f7472 >= 0) {
                        iM2761 = (i6 - C0773.m3169("᩺ܽ")) * (-103);
                        i = ((iM2761 ^ i7) * 32433) ^ 612359470;
                        i2 = -1004172423;
                    } else {
                        iM2761 = C0619.m2761("ۚ۠") ^ i6;
                        i = ((iM2761 ^ i7) * 31881) ^ (-68560567);
                        i2 = -2074595301;
                    }
                    i9 = iM2761 ^ i2;
                    i8 = i;
                    break;
            }
            return;
        }
    }
}
