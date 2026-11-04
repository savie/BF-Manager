package l;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩷᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 12B7 */
/* JADX INFO: loaded from: classes.dex */
public final class C22322 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۟ᩳ᩶, reason: not valid java name and contains not printable characters */
    private static final short[] f72253 = {6015, 29215, 27875, 21425, -31466, 25897, 17691, 2965, 3947, 4384, 4396, 4391, 4390, 4388, 4390, 4407, 4368, 4407, 4401, 4394, 4397, 4388, 4459, 4461, 4461, 4461, 4458};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72254;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f72255;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f72256;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC5914 f72257;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f72258;

    /* JADX WARN: Code duplicated, block: B:60:0x0222 A[PHI: r4 r23
      0x0222: PHI (r4v4 org.json.JSONObject) = (r4v2 org.json.JSONObject), (r4v3 org.json.JSONObject), (r4v2 org.json.JSONObject), (r4v2 org.json.JSONObject) binds: [B:59:0x0220, B:39:0x014f, B:16:0x00a7, B:9:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0222: PHI (r23v5 int) = (r23v4 int), (r23v3 int), (r23v3 int), (r23v3 int) binds: [B:59:0x0220, B:39:0x014f, B:16:0x00a7, B:9:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0256 A[PHI: r5 r8 r9 r18
      0x0256: PHI (r5v4 java.lang.String) = (r5v2 java.lang.String), (r5v3 java.lang.String), (r5v2 java.lang.String) binds: [B:63:0x0254, B:31:0x010e, B:9:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r8v4 short[]) = (r8v2 short[]), (r8v3 short[]), (r8v2 short[]) binds: [B:63:0x0254, B:31:0x010e, B:9:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r9v4 short) = (r9v3 short), (r9v2 short), (r9v2 short) binds: [B:63:0x0254, B:31:0x010e, B:9:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0256: PHI (r18v4 int) = (r18v3 int), (r18v2 int), (r18v2 int) binds: [B:63:0x0254, B:31:0x010e, B:9:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x028d A[PHI: r7 r14 r15 r17
      0x028d: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:67:0x028b, B:35:0x012f] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r14v3 short[]) = (r14v2 short[]), (r14v4 short[]) binds: [B:67:0x028b, B:35:0x012f] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r15v3 int) = (r15v2 int), (r15v4 int) binds: [B:67:0x028b, B:35:0x012f] A[DONT_GENERATE, DONT_INLINE]
      0x028d: PHI (r17v4 char) = (r17v3 char), (r17v2 char) binds: [B:67:0x028b, B:35:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02c3 A[PHI: r3 r10 r12 r16
      0x02c3: PHI (r3v4 l.ۖۢ᩻) = (r3v2 l.ۖۢ᩻), (r3v2 l.ۖۢ᩻), (r3v3 l.ۖۢ᩻), (r3v2 l.ۖۢ᩻), (r3v2 l.ۖۢ᩻), (r3v2 l.ۖۢ᩻), (r3v2 l.ۖۢ᩻) binds: [B:71:0x02c1, B:55:0x01ff, B:43:0x0174, B:27:0x00e4, B:18:0x00ab, B:16:0x00a7, B:12:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r10v4 int) = (r10v2 int), (r10v2 int), (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:71:0x02c1, B:55:0x01ff, B:43:0x0174, B:27:0x00e4, B:18:0x00ab, B:16:0x00a7, B:12:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r12v4 short) = (r12v2 short), (r12v3 short), (r12v2 short), (r12v2 short), (r12v2 short), (r12v2 short), (r12v2 short) binds: [B:71:0x02c1, B:55:0x01ff, B:43:0x0174, B:27:0x00e4, B:18:0x00ab, B:16:0x00a7, B:12:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x02c3: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:71:0x02c1, B:55:0x01ff, B:43:0x0174, B:27:0x00e4, B:18:0x00ab, B:16:0x00a7, B:12:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        int iM3169;
        int i;
        int i2;
        int i3 = C0269.f1558;
        int i4 = C3690.f12684;
        int iM31610 = C0773.m3169("ۘۤ") ^ i3;
        int i5 = ((iM31610 ^ i4) * (-15429)) ^ (-1187110787);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM31610 ^ 1997352458;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        short s2 = 0;
        int i9 = 0;
        int i10 = 0;
        char c = 0;
        int i11 = 0;
        int i12 = 88114718;
        int i13 = 0;
        short[] sArr3 = null;
        String str = null;
        String strM4238 = null;
        JSONObject jSONObjectM43548 = null;
        C2592 c2592M6238 = null;
        String str2 = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i4) * (-22373)) >> 31));
            switch (i12) {
                case -1928510306:
                case -600062448:
                    C2310.m7811(strM4238, C2354.m7980(sArr2, i8, 14, i9));
                    str = strM4238;
                    iM3169 = (i3 - C0773.m3169("ۛۨ")) * (-119);
                    i = ((iM3169 ^ i4) * 19167) ^ (-1409504970);
                    i2 = 2010090733;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1836559036:
                case -20278284:
                    C0487.m2356();
                    if (C3099.m10095()) {
                        iM3169 = (C0773.m3169("᩺ᩳ") ^ i4) * 91;
                        i = ((iM3169 ^ i3) * 27679) ^ 671582275;
                        i2 = 22973901;
                    } else {
                        iM3169 = C0773.m3169("ۢ᩺") ^ i3;
                        i = ((iM3169 ^ i4) * 15791) ^ 2013297857;
                        i2 = 706557466;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1827173587:
                case 583719524:
                    str = "";
                    iM3169 = (i3 - C0773.m3169("ۛۨ")) * (-119);
                    i = ((iM3169 ^ i4) * 19167) ^ (-1409504970);
                    i2 = 2010090733;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1805070460:
                case -1547201066:
                    i8 = 13;
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0773.m3169("᩺ᩳ") ^ i4) * 91;
                        i = ((iM3169 ^ i3) * 27679) ^ 671582275;
                        i2 = 22973901;
                    } else {
                        iM3169 = (i4 - C0773.m3169("᩹ۛ")) * (-111);
                        i = ((iM3169 ^ i3) * (-25185)) ^ (-982305167);
                        i2 = 1775678126;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1559160215:
                case -334233572:
                    s = sArr3[c];
                    i11 = s * s;
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0773.m3169("ۨ᩻") ^ i3) * 63;
                        i = ((iM3169 ^ i4) * 7615) ^ 1805257318;
                        i2 = -410706292;
                    } else {
                        iM3169 = (C0619.m2761("᩻᩺") + i3) * (-27);
                        i = ((iM3169 ^ i4) * 5063) ^ 1229805826;
                        i2 = -838584525;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1156310551:
                case 1577817198:
                    C0269.m1775();
                    C20932.m47848();
                    break;
                case -1121551528:
                case -127879519:
                    s2 = 30746;
                    if (C0619.f2439) {
                        iM3169 = (C0773.m3169("᩺ᩳ") ^ i4) * 91;
                        i = ((iM3169 ^ i3) * 27679) ^ 671582275;
                        i2 = 22973901;
                    } else {
                        iM3169 = C0619.m2761("ۧ֫") ^ i4;
                        i = ((iM3169 ^ i3) * 901) ^ (-1873832633);
                        i2 = -1056632888;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -852450683:
                case 1600106461:
                    i13 = i11 + 236329129;
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0773.m3169("ۢ᩺") ^ i3;
                        i = ((iM3169 ^ i4) * 15791) ^ 2013297857;
                        i2 = 706557466;
                    } else {
                        iM3169 = C0619.m2761("ܽܺ") ^ i4;
                        i = ((iM3169 ^ i3) * (-30877)) ^ 1796780703;
                        i2 = -963440548;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -712271638:
                case 975479092:
                    i9 = 4419;
                    iM3169 = (i3 - C0773.m3169("ۙۨ")) * 81;
                    i = ((iM3169 ^ i4) * 31093) ^ 765534967;
                    i2 = -1350287373;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -496847258:
                case 1150128152:
                    c = '\b';
                    if (C1321.m4852()) {
                        iM3169 = (C0773.m3169("ۗ᩺") + i3) * 39;
                        i = ((iM3169 ^ i4) * (-15413)) ^ (-1151323089);
                        i2 = -537820494;
                    } else {
                        iM3169 = (C0619.m2761("ۨۘ") ^ i4) * 67;
                        i = ((iM3169 ^ i3) * 6309) ^ (-1323522004);
                        i2 = 519002864;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -455130457:
                case 1731028544:
                    RunnableC3646.m11813();
                    if (C2485.f7950 != 0) {
                        iM3169 = C0773.m3169("ۢ᩺") ^ i3;
                        i = ((iM3169 ^ i4) * 15791) ^ 2013297857;
                        i2 = 706557466;
                    } else {
                        iM3169 = (C0773.m3169("ۨ᩻") ^ i3) * 63;
                        i = ((iM3169 ^ i4) * 7615) ^ 1805257318;
                        i2 = -410706292;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -617204:
                case 1034554508:
                    if (i13 - (s * s2) >= 0) {
                        iM3169 = C0619.m2761("۟ۖ") ^ i3;
                        i = ((iM3169 ^ i4) * 14477) ^ (-1226305706);
                        i2 = 358802172;
                    } else {
                        iM3169 = C0773.m3169("ۗ֨") ^ i4;
                        i = ((iM3169 ^ i3) * (-15863)) ^ (-1192455527);
                        i2 = 2138889821;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 89866717:
                case 901585461:
                    C1542.m5459();
                    iM3169 = (C0773.m3169("᩺ᩳ") ^ i4) * 91;
                    i = ((iM3169 ^ i3) * 27679) ^ 671582275;
                    i2 = 22973901;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 104022718:
                case 2078343920:
                    strM4238 = C1146.m4238(jSONObjectM43548, C13473.m33137(sArr, i10, i7, i9));
                    sArr2 = f72253;
                    if (C17202.m40372()) {
                        iM3169 = C0619.m2761("ۖ᩻") ^ i3;
                        i = ((iM3169 ^ i4) * (-27251)) ^ 896016640;
                        i2 = -1154565634;
                    } else {
                        iM3169 = (C0773.m3169("ۨ᩻") ^ i3) * 63;
                        i = ((iM3169 ^ i4) * 7615) ^ 1805257318;
                        i2 = -410706292;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 250693923:
                case 2030246051:
                    sArr = f72253;
                    i10 = 9;
                    i7 = 4;
                    if (C13473.f42873 != 0) {
                        iM3169 = (C0619.m2761("ۨۘ") ^ i4) * 67;
                        i = ((iM3169 ^ i3) * 6309) ^ (-1323522004);
                        i2 = 519002864;
                    } else {
                        iM3169 = C0773.m3169("ᩴܽ") ^ i3;
                        i = ((iM3169 ^ i4) * 29093) ^ 1500242560;
                        i2 = 695656936;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 307677924:
                case 1161767992:
                    c2592M6238 = C1783.m6238(4372);
                    C2023.m6965(c2592M6238, str2);
                    if (C13473.f42873 != 0) {
                        iM3169 = (C0773.m3169("᩺ᩳ") ^ i4) * 91;
                        i = ((iM3169 ^ i3) * 27679) ^ 671582275;
                        i2 = 22973901;
                    } else {
                        iM3169 = C0619.m2761("᩻ۖ") ^ i4;
                        i = ((iM3169 ^ i3) * 28115) ^ 2054328674;
                        i2 = 1751036519;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 752234085:
                case 1481338137:
                    sArr3 = f72253;
                    if (C3690.m11987()) {
                        iM3169 = (C0773.m3169("᩺ᩳ") ^ i4) * 91;
                        i = ((iM3169 ^ i3) * 27679) ^ 671582275;
                        i2 = 22973901;
                    } else {
                        iM3169 = C0773.m3169("ۖ᩵") ^ i4;
                        i = ((iM3169 ^ i3) * 10305) ^ 1769003358;
                        i2 = 2055094055;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 810088235:
                case 1099908748:
                    i9 = 56834;
                    iM3169 = (i3 - C0773.m3169("ۙۨ")) * 81;
                    i = ((iM3169 ^ i4) * 31093) ^ 765534967;
                    i2 = -1350287373;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 918567282:
                case 1171694840:
                    C3734.m12152();
                    if (C3690.f12684 > 0) {
                        iM3169 = (C0773.m3169("᩺ᩳ") ^ i4) * 91;
                        i = ((iM3169 ^ i3) * 27679) ^ 671582275;
                        i2 = 22973901;
                    } else {
                        iM3169 = C0619.m2761("ܽܳ") ^ i4;
                        i = ((iM3169 ^ i3) * 26841) ^ (-932037327);
                        i2 = -1401162830;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 1167885575:
                case 1901774255:
                    this.f72258 = str;
                    break;
                case 1419117138:
                case 1454295228:
                    jSONObjectM43548 = C18738.m43548(c2592M6238);
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0773.m3169("ۢ᩺") ^ i3;
                        i = ((iM3169 ^ i4) * 15791) ^ 2013297857;
                        i2 = 706557466;
                    } else {
                        iM3169 = C0773.m3169("ۡ᩸") ^ i4;
                        i = ((iM3169 ^ i3) * 12217) ^ 1727078152;
                        i2 = 805496820;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    str2 = this.f72255;
                    if (C3077.m10045(str2) == 0) {
                        iM3169 = (C0773.m3169("᩵ܿ") + i4) * (-33);
                        i = ((iM3169 ^ i3) * (-32477)) ^ 1865722514;
                        i2 = 1898865371;
                    } else {
                        iM3169 = (C0773.m3169("ۗ۟") ^ i3) * (-95);
                        i = ((iM3169 ^ i4) * 8339) ^ 188072521;
                        i2 = 1723591859;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m50383() {
        ViewOnClickListenerC5914 viewOnClickListenerC5914 = null;
        EnumC2619 enumC2619Mo23076 = null;
        int i = -1069033938;
        int i2 = C3779.f12953;
        int i3 = C0487.f2131;
        int iM3169 = C0773.m3169("ܳ᩻") ^ i2;
        int i4 = ((iM3169 ^ i3) * (-3297)) ^ (-11646349);
        int i5 = -666573574;
        while (true) {
            i = ((((i ^ i3) * 1811) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1809938440:
                case -272182969:
                    if (!C3077.m10041()) {
                        iM3169 = C0619.m2761("᩷ܺ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-25539)) ^ 775784164;
                        i5 = -614725247;
                    } else {
                        iM3169 = (C0619.m2761("ۜܿ") ^ i3) * 91;
                        i4 = ((iM3169 ^ i2) * 20419) ^ (-118907554);
                        i5 = -428802173;
                    }
                    break;
                case -1656175946:
                case 173844637:
                    if (C1080.m4050()) {
                        iM3169 = (i2 - C0773.m3169("ܶۘ")) * (-115);
                        i4 = ((iM3169 ^ i3) * (-9873)) ^ 1931484448;
                        i5 = -1971681162;
                    } else {
                        iM3169 = C0619.m2761("ܽ᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 22129) ^ 1722149238;
                        i5 = 79854604;
                    }
                    break;
                case -1291635411:
                case -237222812:
                    viewOnClickListenerC5914 = this.f72257;
                    if (C3734.m12152() >= 0) {
                        iM3169 = C0619.m2761("᩷ܺ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-25539)) ^ 775784164;
                        i5 = -614725247;
                    } else {
                        iM3169 = C0619.m2761("ۘۢ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 355) ^ 1858388522;
                        i5 = 1600113822;
                    }
                    break;
                case -1290652998:
                case -847984759:
                    C1146.m4231();
                    return false;
                case -1280249300:
                case 1182300527:
                    return false;
                case -1157824736:
                case 1716621233:
                    C11235.m28309();
                    if (C2702.f8586 > 0) {
                        iM3169 = C0619.m2761("ܽ᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 22129) ^ 1722149238;
                        i5 = 79854604;
                    } else {
                        iM3169 = C0619.m2761("᩷ܺ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-25539)) ^ 775784164;
                        i5 = -614725247;
                    }
                    break;
                case -1144543334:
                case -302867982:
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0619.m2761("᩷ܺ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-25539)) ^ 775784164;
                        i5 = -614725247;
                    } else {
                        iM3169 = C0619.m2761("ۜۛ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 32593) ^ (-2106874385);
                        i5 = 1355831724;
                    }
                    break;
                case -628235598:
                case 1000120822:
                    if (C0269.f1558 <= 0) {
                        iM3169 = (i3 - C0773.m3169("᩵᩶")) * 123;
                        i4 = ((iM3169 ^ i2) * (-25521)) ^ 2123740356;
                        i5 = 663219868;
                    } else {
                        iM3169 = C0773.m3169("ۙ᩵") ^ i2;
                        i4 = ((iM3169 ^ i3) * 32313) ^ 773718269;
                        i5 = 601090485;
                    }
                    break;
                case -404741309:
                case 935946051:
                    if (enumC2619Mo23076.m8762(EnumC2619.CREATED)) {
                        iM3169 = C0619.m2761("۬۟") ^ i3;
                        i4 = ((iM3169 ^ i2) * 6139) ^ (-1939820523);
                        i5 = 1501915704;
                    } else {
                        iM3169 = (C0773.m3169("ۧ֨") ^ i2) * (-123);
                        i4 = ((iM3169 ^ i3) * (-2023)) ^ 849199920;
                        i5 = -1341541537;
                    }
                    break;
                case -238586206:
                case 1267604472:
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0619.m2761("᩷ܺ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-25539)) ^ 775784164;
                        i5 = -614725247;
                    } else {
                        iM3169 = C0773.m3169("ܺ᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-28939)) ^ 2041042900;
                        i5 = 314236082;
                    }
                    break;
                case -221811948:
                case 1541747561:
                    C1146.m4231();
                    iM3169 = (C0619.m2761("ۜܿ") ^ i3) * 91;
                    i4 = ((iM3169 ^ i2) * 20419) ^ (-118907554);
                    i5 = -428802173;
                    break;
                case 19278248:
                case 1839139011:
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0619.m2761("ܽ᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 22129) ^ 1722149238;
                        i5 = 79854604;
                    } else {
                        iM3169 = C0619.m2761("֡֡") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-6581)) ^ 157682496;
                        i5 = 1645672174;
                    }
                    break;
                case 36385344:
                case 172711487:
                    if (RunnableC3646.m11813() != 0) {
                        iM3169 = C0619.m2761("᩷ܺ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-25539)) ^ 775784164;
                        i5 = -614725247;
                    } else {
                        iM3169 = (i3 - C0619.m2761("۬۠")) * 45;
                        i4 = ((iM3169 ^ i2) * 24853) ^ (-1499127070);
                        i5 = -214955994;
                    }
                    break;
                case 97214929:
                case 1917132124:
                    if (C1783.f6087 <= 0) {
                        iM3169 = C0619.m2761("ܽ᩺") ^ i3;
                        i4 = ((iM3169 ^ i2) * 22129) ^ 1722149238;
                        i5 = 79854604;
                    } else {
                        iM3169 = (C0619.m2761("۫֫") ^ i3) * (-89);
                        i4 = ((iM3169 ^ i2) * 23891) ^ (-1650566735);
                        i5 = 1154075454;
                    }
                    break;
                case 415691338:
                case 1210994828:
                    if (C0487.f2131 <= 0) {
                        iM3169 = C0619.m2761("ܽۖ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-17407)) ^ 1667730344;
                        i5 = -966889656;
                    } else {
                        iM3169 = (C0773.m3169("ᩴ֨") + i2) * (-25);
                        i4 = ((iM3169 ^ i3) * (-849)) ^ 1729131273;
                        i5 = -286749042;
                    }
                    break;
                case 621870469:
                case 1201784267:
                    if (C2966.m9669(viewOnClickListenerC5914)) {
                        iM3169 = (C0773.m3169("ۧ֨") ^ i2) * (-123);
                        i4 = ((iM3169 ^ i3) * (-2023)) ^ 849199920;
                        i5 = -1341541537;
                    } else {
                        iM3169 = (C0619.m2761("ۗܰ") ^ i3) * 43;
                        i4 = ((iM3169 ^ i2) * (-13167)) ^ (-822435580);
                        i5 = -892698472;
                    }
                    break;
                case 947044206:
                case 1904829630:
                    return true;
                case 987740435:
                case 1967685402:
                    enumC2619Mo23076 = C3099.m10091(viewOnClickListenerC5914).mo23076();
                    if (C2354.f7599 >= 0) {
                        iM3169 = (i3 - C0773.m3169("᩵᩶")) * 123;
                        i4 = ((iM3169 ^ i2) * (-25521)) ^ 2123740356;
                        i5 = 663219868;
                    } else {
                        iM3169 = (C0619.m2761("ۡ᩵") ^ i2) * (-97);
                        i4 = ((iM3169 ^ i3) * 23977) ^ (-2112162154);
                        i5 = 183222269;
                    }
                    break;
                case 1324675155:
                case 1831577449:
                    if (C2419.m8175(this.f72256, C0619.m2752())) {
                        iM3169 = C0773.m3169("᩻ۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 3709) ^ (-812009193);
                        i5 = 1477576245;
                    } else {
                        iM3169 = (C0773.m3169("ۧ֨") ^ i2) * (-123);
                        i4 = ((iM3169 ^ i3) * (-2023)) ^ 849199920;
                        i5 = -1341541537;
                    }
                    break;
                default:
                    C23916.m53419();
                    if (C4238.f15451 >= 0) {
                        iM3169 = C0619.m2761("ܽۖ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-17407)) ^ 1667730344;
                        i5 = -966889656;
                    } else {
                        iM3169 = (C0619.m2761("ۜܿ") ^ i3) * 91;
                        i4 = ((iM3169 ^ i2) * 20419) ^ (-118907554);
                        i5 = -428802173;
                    }
                    break;
            }
        }
    }

    public C22322(ViewOnClickListenerC5914 viewOnClickListenerC5914, String str, String str2, int i) {
        int i2 = 9134590;
        int i3 = C20932.f66974;
        int i4 = C1321.f4751;
        this.f72257 = viewOnClickListenerC5914;
        this.f72255 = str;
        this.f72256 = str2;
        this.f72254 = i;
        int iM3169 = (i4 - C0773.m3169("۬֡")) * (-45);
        int i5 = ((iM3169 ^ i3) * (-16417)) ^ 1175807032;
        int i6 = 1999608749;
        while (true) {
            i2 = (iM3169 ^ i6) ^ (i5 & (((i2 ^ i3) * 25125) >> 31));
            switch (i2) {
                case -1707688662:
                case 1858521535:
                    C0487.m2356();
                    if (C2702.m8876()) {
                        iM3169 = (C0619.m2761("ᩳۡ") ^ i3) * (-71);
                        i5 = ((iM3169 ^ i4) * (-21953)) ^ 1863233546;
                        i6 = -2030258867;
                    } else {
                        iM3169 = C0619.m2761("ۧۗ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 27047) ^ (-1609191300);
                        i6 = -1278406181;
                    }
                    break;
                case -1498449794:
                case 980715468:
                    C13473.m33144();
                    if (!C17202.f56030) {
                        iM3169 = C0619.m2761("۬۟") ^ i3;
                        i5 = ((iM3169 ^ i4) * 10837) ^ (-234890875);
                        i6 = -50141767;
                    } else {
                        iM3169 = C0619.m2761("ۧۗ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 27047) ^ (-1609191300);
                        i6 = -1278406181;
                    }
                    break;
                case -1066862817:
                case 1099925454:
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0773.m3169("᩵۠") ^ i4;
                        i5 = ((iM3169 ^ i3) * 4941) ^ 1518256164;
                        i6 = -933417521;
                    } else {
                        iM3169 = (C0619.m2761("ۛۜ") ^ i4) * 27;
                        i5 = ((iM3169 ^ i3) * (-9227)) ^ (-198774951);
                        i6 = 1799989388;
                    }
                    break;
                case -404305138:
                case 357896816:
                    C0950.m3785();
                    if (C2419.f7754 >= 0) {
                        iM3169 = C0619.m2761("۬۟") ^ i3;
                        i5 = ((iM3169 ^ i4) * 10837) ^ (-234890875);
                        i6 = -50141767;
                    } else {
                        iM3169 = (C0773.m3169("᩺ۖ") + i3) * 85;
                        i5 = ((iM3169 ^ i4) * 6347) ^ 828371367;
                        i6 = 756716027;
                    }
                    break;
                case -113129934:
                case 1699456540:
                    return;
                case 436981518:
                case 1736127795:
                    RunnableC3055.m9933();
                    AbstractC0641.m2813();
                    throw new RuntimeException();
                default:
                    C3448.m11248();
                    C1783.m6232();
                    iM3169 = (C0773.m3169("᩺ۖ") + i3) * 85;
                    i5 = ((iM3169 ^ i4) * 6347) ^ 828371367;
                    i6 = 756716027;
                    break;
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C1783.m6242(this, this.f72257);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        int i = 0;
        String str = null;
        String strM32487 = null;
        int i2 = 1257662412;
        int i3 = C3448.f11240;
        int i4 = C4282.f15546;
        int iM3169 = (i4 - C0773.m3169("ۚۚ")) * 75;
        int i5 = ((iM3169 ^ i3) * 27297) ^ 259671616;
        int i6 = 263326606;
        while (true) {
            i2 = ((((i2 ^ i3) * (-1129)) >> 31) & i5) ^ (iM3169 ^ i6);
            switch (i2) {
                case -2067897822:
                case -1152339801:
                    break;
                case -1952125929:
                case -888665041:
                    if (C1519.f5300 >= 0) {
                        iM3169 = (C0619.m2761("ۘ᩶") ^ i3) * (-117);
                        i5 = ((iM3169 ^ i4) * (-30505)) ^ (-1460021816);
                        i6 = -1589838690;
                    } else {
                        iM3169 = (C0619.m2761("ۛ֨") ^ i3) * (-33);
                        i5 = ((iM3169 ^ i4) * 15913) ^ 354059844;
                        i6 = -694382791;
                    }
                    break;
                case -1794215646:
                case -1716561197:
                    if (C1564.f5401 <= 0) {
                        iM3169 = C0773.m3169("᩶ܺ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 8551) ^ 1670581438;
                        i6 = 267431011;
                    } else {
                        iM3169 = C0773.m3169("ۚ᩸") ^ i4;
                        i5 = ((iM3169 ^ i3) * 31663) ^ (-409659261);
                        i6 = -178859588;
                    }
                    break;
                case -1682028705:
                case 1099903181:
                    if (C2287.f7432 >= 0) {
                        iM3169 = (C0773.m3169("ۤ۟") ^ i3) * (-27);
                        i5 = ((iM3169 ^ i4) * 10983) ^ (-500899310);
                        i6 = -719289237;
                    } else {
                        iM3169 = C0619.m2761("ۙ֡") ^ i3;
                        i5 = ((iM3169 ^ i4) * 24303) ^ (-180215889);
                        i6 = -1546693585;
                    }
                    break;
                case -1476519726:
                case 257273685:
                    if (C23916.f77426 <= 0) {
                        iM3169 = (C0619.m2761("ۘ᩶") ^ i3) * (-117);
                        i5 = ((iM3169 ^ i4) * (-30505)) ^ (-1460021816);
                        i6 = -1589838690;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ۡ֫")) * (-39);
                        i5 = ((iM3169 ^ i3) * 25953) ^ 2075974285;
                        i6 = -527707804;
                    }
                    break;
                case -1274366743:
                case 760329416:
                    if (m50383()) {
                        iM3169 = C0773.m3169("ܶۚ") ^ i4;
                        i5 = ((iM3169 ^ i3) * 3503) ^ (-719954531);
                        i6 = -192513751;
                    } else {
                        iM3169 = C0773.m3169("ۛ᩺") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-8043)) ^ (-654553159);
                        i6 = 1828139131;
                    }
                    break;
                case -1259091155:
                case -629312870:
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0619.m2761("ۘ᩶") ^ i3) * (-117);
                        i5 = ((iM3169 ^ i4) * (-30505)) ^ (-1460021816);
                        i6 = -1589838690;
                    } else {
                        iM3169 = C0773.m3169("۟ۨ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 30609) ^ 926370571;
                        i6 = 2101810797;
                    }
                    break;
                case -1026870153:
                case -772439945:
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0773.m3169("᩶ܺ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 8551) ^ 1670581438;
                        i6 = 267431011;
                    } else {
                        iM3169 = (C0619.m2761("ܿۙ") ^ i3) * (-15);
                        i5 = ((iM3169 ^ i4) * (-26371)) ^ 86985314;
                        i6 = -1001552178;
                    }
                    break;
                case -997142936:
                case -669694164:
                    strM32487 = C13047.m32487(i, str);
                    if (C2023.m6964() <= 0) {
                        iM3169 = (C0619.m2761("ۘ᩶") ^ i3) * (-117);
                        i5 = ((iM3169 ^ i4) * (-30505)) ^ (-1460021816);
                        i6 = -1589838690;
                    } else {
                        iM3169 = (C0773.m3169("֨ۛ") + i4) * 41;
                        i5 = ((iM3169 ^ i3) * 29951) ^ (-421728052);
                        i6 = 11548725;
                    }
                    break;
                case -851189688:
                case 804654681:
                    if (C4282.f15546 <= 0) {
                        iM3169 = (C0619.m2761("ۨۤ") ^ i4) * 101;
                        i5 = ((iM3169 ^ i3) * (-28645)) ^ 122938551;
                        i6 = -1827887470;
                    } else {
                        iM3169 = (C0619.m2761("ۚܺ") + i4) * 9;
                        i5 = ((iM3169 ^ i3) * (-21637)) ^ 249713163;
                        i6 = -763939070;
                    }
                    break;
                case -555290435:
                case 298029475:
                    C3690.m11988(this.f72257, strM32487);
                    iM3169 = C0773.m3169("ۛ᩺") ^ i3;
                    i5 = ((iM3169 ^ i4) * (-8043)) ^ (-654553159);
                    i6 = 1828139131;
                    break;
                case -411382657:
                case 1825825057:
                    C3099.m10095();
                    C1519.m5403();
                    break;
                case -407229631:
                case 104698590:
                    if (C3448.f11240 >= 0) {
                        iM3169 = (C0619.m2761("ۨۤ") ^ i4) * 101;
                        i5 = ((iM3169 ^ i3) * (-28645)) ^ 122938551;
                        i6 = -1827887470;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ܽۨ")) * (-73);
                        i5 = ((iM3169 ^ i3) * 3407) ^ 1169399317;
                        i6 = -1847471671;
                    }
                    break;
                case 477210287:
                case 608999674:
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0773.m3169("ۤ۟") ^ i3) * (-27);
                        i5 = ((iM3169 ^ i4) * 10983) ^ (-500899310);
                        i6 = -719289237;
                    } else {
                        iM3169 = (C0619.m2761("ۨۤ") ^ i4) * 101;
                        i5 = ((iM3169 ^ i3) * (-28645)) ^ 122938551;
                        i6 = -1827887470;
                    }
                    break;
                case 900426299:
                case 1267085665:
                    if (C1321.f4751 >= 0) {
                        iM3169 = (C0773.m3169("ۤ۟") ^ i3) * (-27);
                        i5 = ((iM3169 ^ i4) * 10983) ^ (-500899310);
                        i6 = -719289237;
                    } else {
                        iM3169 = (C0773.m3169("ܰۧ") ^ i4) * 75;
                        i5 = ((iM3169 ^ i3) * (-24713)) ^ 446426631;
                        i6 = 1638334444;
                    }
                    break;
                case 1432505562:
                case 1918202420:
                    C2288.m7767();
                    iM3169 = (C0619.m2761("ۨۤ") ^ i4) * 101;
                    i5 = ((iM3169 ^ i3) * (-28645)) ^ 122938551;
                    i6 = -1827887470;
                    break;
                case 1505312965:
                case 2000785654:
                    if (C3492.f12043 <= 0) {
                        iM3169 = C0773.m3169("᩶ܺ") ^ i3;
                        i5 = ((iM3169 ^ i4) * 8551) ^ 1670581438;
                        i6 = 267431011;
                    } else {
                        iM3169 = (C0773.m3169("ۤ۟") ^ i3) * (-27);
                        i5 = ((iM3169 ^ i4) * 10983) ^ (-500899310);
                        i6 = -719289237;
                    }
                    break;
                default:
                    i = this.f72254;
                    str = this.f72258;
                    if (C1519.f5300 >= 0) {
                        iM3169 = (C0619.m2761("ۨۤ") ^ i4) * 101;
                        i5 = ((iM3169 ^ i3) * (-28645)) ^ 122938551;
                        i6 = -1827887470;
                    } else {
                        iM3169 = (C0773.m3169("۟᩹") + i3) * 35;
                        i5 = ((iM3169 ^ i4) * 495) ^ 1052824874;
                        i6 = 259418152;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x01e0 A[PHI: r10 r11
      0x01e0: PHI (r10v5 int) = (r10v4 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:52:0x01de, B:15:0x0085, B:9:0x0077, B:6:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r11v3 java.lang.String) = (r11v2 java.lang.String), (r11v2 java.lang.String), (r11v2 java.lang.String), (r11v5 java.lang.String) binds: [B:52:0x01de, B:15:0x0085, B:9:0x0077, B:6:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02db A[PHI: r12 r13 r19 r20
      0x02db: PHI (r12v4 int) = (r12v2 int), (r12v3 int), (r12v2 int) binds: [B:72:0x02d9, B:31:0x0105, B:12:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x02db: PHI (r13v4 int) = (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:72:0x02d9, B:31:0x0105, B:12:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x02db: PHI (r19v4 int) = (r19v3 int), (r19v2 int), (r19v2 int) binds: [B:72:0x02d9, B:31:0x0105, B:12:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x02db: PHI (r20v4 short) = (r20v3 short), (r20v2 short), (r20v2 short) binds: [B:72:0x02d9, B:31:0x0105, B:12:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x034f A[PHI: r5 r26 r27
      0x034f: PHI (r5v4 android.view.View) = (r5v2 android.view.View), (r5v3 android.view.View), (r5v2 android.view.View) binds: [B:80:0x034d, B:48:0x01b4, B:9:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x034f: PHI (r26v5 short[]) = (r26v4 short[]), (r26v3 short[]), (r26v3 short[]) binds: [B:80:0x034d, B:48:0x01b4, B:9:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x034f: PHI (r27v3 char) = (r27v2 char), (r27v1 char), (r27v1 char) binds: [B:80:0x034d, B:48:0x01b4, B:9:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        int iM3169;
        int i;
        int i2;
        int i3 = C0269.f1558;
        int i4 = C1826.f6190;
        int iM2761 = C0619.m2761("᩸᩵") ^ i4;
        int i5 = ((iM2761 ^ i3) * (-2549)) ^ (-1770680233);
        String strM6243 = null;
        String strM28300 = null;
        short[] sArr = null;
        int i6 = iM2761 ^ 547577617;
        int i7 = 0;
        int iM2762 = 0;
        int iM31610 = 0;
        int i8 = 0;
        StringBuilder sb = null;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        short s2 = 0;
        int i12 = 1239210460;
        char c = 0;
        TextView textView = null;
        String strM6365 = null;
        View viewM5518 = null;
        ViewOnClickListenerC5914 viewOnClickListenerC5914 = null;
        Object obj = null;
        while (true) {
            i12 = i6 ^ (i5 & (((i12 ^ i3) * 415) >> 31));
            switch (i12) {
                case -2125759481:
                case 1721750607:
                    textView = (TextView) C1564.m5518(viewOnClickListenerC5914, iM31610 ^ i8);
                    short[] sArr2 = f72253;
                    if (C0773.m3161() == 0) {
                        sb = new StringBuilder(AbstractC0641.m2820(sArr2, 7, 1, i7));
                        strM6243 = C1783.m6243(exc);
                        if (C17202.f56030) {
                            iM3169 = (i3 - C0619.m2761("ᩳܽ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i = ((iM3169 ^ i4) * 1131) ^ 739179344;
                            i2 = -2024436187;
                            i6 = iM3169 ^ i2;
                            i5 = i;
                            break;
                        }
                    }
                    int iM31611 = (C0773.m3169("ۢ᩹") ^ i4) * (-55);
                    i6 = iM31611 ^ (-944384930);
                    i5 = ((iM31611 ^ i3) * (-11679)) ^ (-1330756389);
                    sb = null;
                    break;
                case -2114922368:
                case 1563484342:
                    C2375.m8065();
                    if (C2288.f7433 > 0) {
                        iM3169 = C0619.m2761("֫֡") ^ i3;
                        i = ((iM3169 ^ i4) * 109) ^ (-1263419593);
                        i2 = -1892108605;
                    } else {
                        iM3169 = (C0619.m2761("ܳ᩸") + i4) * 63;
                        i = ((iM3169 ^ i3) * 6729) ^ (-1631144558);
                        i2 = -1379578936;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -2060491825:
                case -1654607355:
                    AbstractC0641.m2814(viewOnClickListenerC5914, exc, obj);
                    break;
                case -2001997659:
                case 777329473:
                    int i13 = i9 + i10;
                    i11 = i13 + i13;
                    s2 = 12073;
                    if (C3998.f13671 != 0) {
                        iM3169 = (C0619.m2761("ܳ᩸") + i4) * 63;
                        i = ((iM3169 ^ i3) * 6729) ^ (-1631144558);
                        i2 = -1379578936;
                    } else {
                        iM3169 = (C0773.m3169("ۚܺ") ^ i3) * 109;
                        i = ((iM3169 ^ i4) * (-11423)) ^ 1946697622;
                        i2 = -1688334551;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1897613799:
                case -1455522001:
                    iM2762 = C0619.m2761(RunnableC3646.m11809(f72253, 1, 3, i7));
                    if (C2702.f8586 <= 0) {
                        iM3169 = (C0619.m2761("ᩴܽ") ^ i4) * (-117);
                        i = ((iM3169 ^ i3) * 22081) ^ 1858095383;
                        i2 = -828365294;
                    } else {
                        iM3169 = C0619.m2761("ۨ֡") ^ i4;
                        i = ((iM3169 ^ i3) * 25301) ^ 1842587922;
                        i2 = -1584499356;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1792514578:
                case 1795913850:
                    C1826.m6301();
                    if (C1783.f6087 > 0) {
                        iM3169 = (C0619.m2761("ᩴܽ") ^ i4) * (-117);
                        i = ((iM3169 ^ i3) * 22081) ^ 1858095383;
                        i2 = -828365294;
                    } else {
                        iM3169 = C0619.m2761("ۘۜ") ^ i3;
                        i = ((iM3169 ^ i4) * (-87)) ^ (-1749769622);
                        i2 = 1920377773;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1602315382:
                case 549139627:
                    C1080.m4050();
                    C2878.m9491();
                    break;
                case -1145776262:
                case 841303000:
                    int i14 = s + s2;
                    if ((i14 * i14) - i11 <= 0) {
                        iM3169 = (C0773.m3169("ۢۚ") + i4) * 97;
                        i = ((iM3169 ^ i3) * 16287) ^ 1201831837;
                        i2 = -401060156;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ᩳᩴ")) * 27;
                        i = ((iM3169 ^ i3) * 27333) ^ 1504496186;
                        i2 = -793481625;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -1035456276:
                case -249327874:
                    boolean z = exc instanceof C4866;
                    obj = null;
                    viewOnClickListenerC5914 = this.f72257;
                    if (z) {
                        iM3169 = C0619.m2761("֡ۜ") ^ i3;
                        i = ((iM3169 ^ i4) * 1363) ^ (-1834560273);
                        i2 = -2038934933;
                    } else {
                        iM3169 = C0773.m3169("ܺ᩸") ^ i3;
                        i = ((iM3169 ^ i4) * (-2919)) ^ 819030748;
                        i2 = 1948347831;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -982803142:
                case -682787779:
                    viewM5518 = C1564.m5518(viewOnClickListenerC5914, 2128543087 ^ iM2762);
                    if (C1564.f5401 <= 0) {
                        iM3169 = C0619.m2761("ۘۜ") ^ i3;
                        i = ((iM3169 ^ i4) * (-87)) ^ (-1749769622);
                        i2 = 1920377773;
                    } else {
                        iM3169 = (i4 - C0619.m2761("ۧۗ")) * (-51);
                        i = ((iM3169 ^ i3) * 16439) ^ (-1077009895);
                        i2 = 981719925;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -779918872:
                case 915420982:
                    C3779.m12258(sb, strM6243);
                    C2354.m7978(textView, C2023.m6952(sb));
                    C13473.m33140(textView, 0);
                    break;
                case -751544965:
                case 1880754822:
                    i7 = 2975;
                    iM3169 = (C0773.m3169("᩶ܰ") ^ i3) * 49;
                    i = ((iM3169 ^ i4) * (-7213)) ^ (-2016324176);
                    i2 = 1181757262;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -603882210:
                case 185153003:
                    strM6365 = RunnableC1848.m6365(C1080.m4058(C3998.m12928((EditText) viewM5518)));
                    if (C2310.f7472 < 0) {
                        iM3169 = (C0619.m2761("ᩳۙ") + i3) * (-71);
                        i = ((iM3169 ^ i4) * (-24911)) ^ 1656404088;
                        i2 = -1400568965;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    } else {
                        int iM31612 = (C0773.m3169("ۢ᩹") ^ i4) * (-55);
                        i6 = iM31612 ^ (-944384930);
                        i5 = ((iM31612 ^ i3) * (-11679)) ^ (-1330756389);
                        sb = null;
                    }
                    break;
                case -501486819:
                case 1243900187:
                    if (m50383()) {
                        iM3169 = C0619.m2761("ۡۘ") ^ i3;
                        i = ((iM3169 ^ i4) * (-16317)) ^ (-559473249);
                        i2 = -317819676;
                    } else {
                        iM3169 = (C0619.m2761("۫֡") ^ i4) * 61;
                        i = ((iM3169 ^ i3) * (-2127)) ^ (-2058196486);
                        i2 = -514669967;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -411102180:
                case 1533480918:
                    RunnableC3055.m9930(viewOnClickListenerC5914, exc, obj);
                    break;
                case -368921599:
                case -239320658:
                    s = sArr[c];
                    i9 = s * s;
                    i10 = 145757329;
                    if (C0269.f1558 > 0) {
                        iM3169 = (C0619.m2761("᩸ܶ") + i3) * 25;
                        i = ((iM3169 ^ i4) * (-6563)) ^ 1452853134;
                        i2 = 379469872;
                        i6 = iM3169 ^ i2;
                        i5 = i;
                    } else {
                        int iM31613 = (C0773.m3169("ۢ᩹") ^ i4) * (-55);
                        i6 = iM31613 ^ (-944384930);
                        i5 = ((iM31613 ^ i3) * (-11679)) ^ (-1330756389);
                        sb = null;
                    }
                    break;
                case -342299108:
                case 1832535860:
                    break;
                case -330699260:
                case 1308852486:
                    if (C3492.m11490(this.f72255, strM6365.toUpperCase(Locale.ROOT))) {
                        iM3169 = (C0619.m2761("ۘ۫") + i3) * 45;
                        i = ((iM3169 ^ i4) * 20959) ^ (-501569686);
                        i2 = 1030959818;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ܳۗ")) * (-3);
                        i = ((iM3169 ^ i3) * 17799) ^ (-721895886);
                        i2 = 1417442712;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case -90363515:
                case 873838462:
                    iM31610 = C0773.m3169(strM28300);
                    i8 = 2100216331;
                    if (C1783.m6232()) {
                        iM3169 = (C0773.m3169("֨ܳ") + i4) * (-39);
                        i = ((iM3169 ^ i3) * 29545) ^ (-945476403);
                        i2 = -966353683;
                    } else {
                        iM3169 = (C0619.m2761("ܳ᩸") + i4) * 63;
                        i = ((iM3169 ^ i3) * 6729) ^ (-1631144558);
                        i2 = -1379578936;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 35782798:
                case 1936153413:
                    i7 = 34463;
                    iM3169 = (C0773.m3169("᩶ܰ") ^ i3) * 49;
                    i = ((iM3169 ^ i4) * (-7213)) ^ (-2016324176);
                    i2 = 1181757262;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 338664109:
                case 2036367036:
                    if (RunnableC3055.f9898 >= 0) {
                        iM3169 = C0619.m2761("֫֡") ^ i3;
                        i = ((iM3169 ^ i4) * 109) ^ (-1263419593);
                        i2 = -1892108605;
                    } else {
                        iM3169 = (C0619.m2761("ᩴܽ") ^ i4) * (-117);
                        i = ((iM3169 ^ i3) * 22081) ^ 1858095383;
                        i2 = -828365294;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 617027435:
                case 1145381387:
                    sArr = f72253;
                    c = 0;
                    if (C0269.f1558 <= 0) {
                        iM3169 = C0619.m2761("ۘۜ") ^ i3;
                        i = ((iM3169 ^ i4) * (-87)) ^ (-1749769622);
                        i2 = 1920377773;
                    } else {
                        iM3169 = C0773.m3169("ܿܽ") ^ i4;
                        i = ((iM3169 ^ i3) * (-32005)) ^ (-769785619);
                        i2 = -1897439176;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                case 746466920:
                case 914419930:
                    C2834.m9344();
                    C3998.m12920();
                    iM3169 = C0619.m2761("֫֡") ^ i3;
                    i = ((iM3169 ^ i4) * 109) ^ (-1263419593);
                    i2 = -1892108605;
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
                default:
                    strM28300 = C11235.m28300(f72253, 4, 3, i7);
                    if (C4282.m13644()) {
                        iM3169 = C0773.m3169("᩵ۜ") ^ i4;
                        i = ((iM3169 ^ i3) * (-25797)) ^ (-633056962);
                        i2 = -1636097691;
                    } else {
                        iM3169 = (C0619.m2761("ᩴܽ") ^ i4) * (-117);
                        i = ((iM3169 ^ i3) * 22081) ^ 1858095383;
                        i2 = -828365294;
                    }
                    i6 = iM3169 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f72257.f20239 = false;
        C20932.m47845(this);
    }
}
