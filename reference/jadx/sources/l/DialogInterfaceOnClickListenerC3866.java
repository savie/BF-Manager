package l;

import android.content.DialogInterface;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۘۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H1R6 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC3866 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ۟ۡᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f13203 = {419, -24238, -24992, 20557};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13204;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f13205;

    public /* synthetic */ DialogInterfaceOnClickListenerC3866(int i, Object obj) {
        int i2 = -141877876;
        int i3 = C3690.f12684;
        int i4 = C3448.f11240;
        this.f13204 = i;
        this.f13205 = obj;
        int iM3169 = C0773.m3169("ۘ᩺") ^ i4;
        int i5 = ((iM3169 ^ i3) * 27369) ^ (-1389539124);
        int i6 = -1334778244;
        while (true) {
            i2 = (iM3169 ^ i6) ^ (i5 & (((i2 ^ i3) * 30165) >> 31));
            switch (i2) {
                case -2045734967:
                case -332201132:
                    if (C0773.f2792 > 0) {
                        iM3169 = C0773.m3169("ۤۘ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-1903)) ^ 2077033334;
                        i6 = 304452896;
                    } else {
                        iM3169 = C0773.m3169("۫᩺") ^ i3;
                        i5 = ((iM3169 ^ i4) * 10571) ^ 270179058;
                        i6 = 1226941972;
                    }
                    break;
                case -1904743760:
                case 1480176760:
                    if (C1146.f4234 >= 0) {
                        iM3169 = (i4 - C0773.m3169("ܳܳ")) * 39;
                        i5 = ((iM3169 ^ i3) * (-1369)) ^ 77171930;
                        i6 = -1727554494;
                    } else {
                        iM3169 = (i4 - C0773.m3169("ܶۨ")) * (-79);
                        i5 = ((iM3169 ^ i3) * 27513) ^ 1276214024;
                        i6 = -1770929762;
                    }
                    break;
                case -940301206:
                case -835126634:
                    return;
                case -749346454:
                case 2010257307:
                    C17202.m40372();
                    C13473.m33144();
                    throw new RuntimeException();
                case -98617112:
                case 1124507380:
                    if (C0862.f3233 == 0) {
                        iM3169 = C0773.m3169("۫᩺") ^ i3;
                        i5 = ((iM3169 ^ i4) * 10571) ^ 270179058;
                        i6 = 1226941972;
                    } else {
                        iM3169 = C0619.m2761("۟۬") ^ i3;
                        i5 = ((iM3169 ^ i4) * (-103)) ^ (-804307270);
                        i6 = -547805997;
                    }
                    break;
                case -93522446:
                case 1342075734:
                    C2375.m8065();
                    iM3169 = C0773.m3169("۫᩺") ^ i3;
                    i5 = ((iM3169 ^ i4) * 10571) ^ 270179058;
                    i6 = 1226941972;
                    break;
                default:
                    if (C1343.f4799 != 0) {
                        iM3169 = C0773.m3169("ۤۘ") ^ i4;
                        i5 = ((iM3169 ^ i3) * (-1903)) ^ 2077033334;
                        i6 = 304452896;
                    } else {
                        iM3169 = (C0773.m3169("۠᩻") ^ i3) * (-59);
                        i5 = ((iM3169 ^ i4) * (-32593)) ^ (-715635534);
                        i6 = -1847218317;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0227 A[PHI: r7 r8 r9 r10 r11 r16 r17 r20
      0x0227: PHI (r7v4 short) = (r7v2 short), (r7v3 short), (r7v2 short) binds: [B:9:0x005b, B:66:0x0225, B:62:0x0201] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r8v4 short) = (r8v2 short), (r8v3 short), (r8v2 short) binds: [B:9:0x005b, B:66:0x0225, B:62:0x0201] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r9v3 int) = (r9v2 int), (r9v2 int), (r9v4 int) binds: [B:9:0x005b, B:66:0x0225, B:62:0x0201] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r10v3 int) = (r10v2 int), (r10v2 int), (r10v4 int) binds: [B:9:0x005b, B:66:0x0225, B:62:0x0201] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v4 int) binds: [B:9:0x005b, B:66:0x0225, B:62:0x0201] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r16v10 l.۬֨ᩴ) = (r16v6 l.۬֨ᩴ), (r16v9 l.۬֨ᩴ), (r16v11 l.۬֨ᩴ) binds: [B:9:0x005b, B:66:0x0225, B:62:0x0201] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r17v6 l.ۡۖ᩻) = (r17v2 l.ۡۖ᩻), (r17v5 l.ۡۖ᩻), (r17v7 l.ۡۖ᩻) binds: [B:9:0x005b, B:66:0x0225, B:62:0x0201] A[DONT_GENERATE, DONT_INLINE]
      0x0227: PHI (r20v9 java.lang.Object) = (r20v5 java.lang.Object), (r20v8 java.lang.Object), (r20v10 java.lang.Object) binds: [B:9:0x005b, B:66:0x0225, B:62:0x0201] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2;
        int i3;
        int iM3169;
        int i4;
        int i5;
        int i6;
        int iM2761;
        int i7;
        int i8 = C2310.f7472;
        int i9 = C3779.f12953;
        int iM31610 = C0773.m3169("᩺᩻") ^ i9;
        int i10 = ((iM31610 ^ i8) * (-27301)) ^ (-1152394709);
        short[] sArr = null;
        int i11 = iM31610 ^ (-1881820130);
        C13511 c13511 = null;
        short s = 0;
        short s2 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = -106707684;
        C9085 c9085 = null;
        ViewOnClickListenerC1057 viewOnClickListenerC1057 = null;
        Object obj = null;
        while (true) {
            i16 = i11 ^ (i10 & (((i16 ^ i8) * 8603) >> 31));
            switch (i16) {
                case -2024734352:
                case -788697377:
                    viewOnClickListenerC1057 = (ViewOnClickListenerC1057) obj;
                    int i17 = ViewOnClickListenerC1057.f3785;
                    short[] sArr2 = f13203;
                    if (C3492.m11488()) {
                        obj = obj;
                        if (C20932.f66974 <= 0) {
                            int iM2762 = C0619.m2761("᩸᩵") ^ i8;
                            i11 = iM2762 ^ 841936203;
                            i10 = ((iM2762 ^ i9) * (-9885)) ^ (-1105275732);
                            obj = obj;
                            c13511 = null;
                        } else {
                            c9085 = c9085;
                            int iM2763 = C0619.m2761(C0950.m3780(sArr2, 1, 3, i15));
                            if (AbstractC0641.f2496 >= 0) {
                                int iM2764 = C0619.m2761("ܳۖ") ^ i9;
                                i11 = iM2764 ^ 2101872096;
                                i10 = ((iM2764 ^ i8) * 12351) ^ 496809727;
                                c9085 = c9085;
                                obj = obj;
                                c13511 = null;
                            } else {
                                C13511 c13512 = new C13511(viewOnClickListenerC1057, iM2763 ^ 2124858651);
                                if (C0773.f2792 <= 0) {
                                    c13511 = c13512;
                                    c9085 = c9085;
                                    int iM31611 = C0773.m3169("᩷۬") ^ i8;
                                    i4 = ((iM31611 ^ i9) * (-13211)) ^ (-542981693);
                                    i6 = iM31611 ^ (-1165242825);
                                    int i18 = i4;
                                    obj = obj;
                                    c13511 = c13511;
                                    i11 = i6;
                                    i10 = i18;
                                } else {
                                    int iM2765 = (C0619.m2761("۫᩵") + i8) * (-103);
                                    int i19 = ((iM2765 ^ i9) * 26085) ^ 45199555;
                                    i11 = iM2765 ^ 434898427;
                                    obj = obj;
                                    c13511 = c13512;
                                    i10 = i19;
                                    c9085 = c9085;
                                }
                            }
                        }
                    } else {
                        obj = obj;
                        c9085 = c9085;
                        int iM2766 = C0619.m2761("ܳۖ") ^ i9;
                        i11 = iM2766 ^ 2101872096;
                        i10 = ((iM2766 ^ i8) * 12351) ^ 496809727;
                        c9085 = c9085;
                        obj = obj;
                        c13511 = null;
                    }
                    break;
                case -1894107783:
                case -152798085:
                    c13511 = c13511;
                    obj = obj;
                    c9085 = c9085;
                    sArr = f13203;
                    if (C0487.f2131 > 0) {
                        iM3169 = C0773.m3169("ܽۗ") ^ i9;
                        i4 = ((iM3169 ^ i8) * (-1889)) ^ 281598069;
                        i5 = 1105592767;
                        i6 = iM3169 ^ i5;
                        c9085 = c9085;
                        int i110 = i4;
                        obj = obj;
                        c13511 = c13511;
                        i11 = i6;
                        i10 = i110;
                    }
                    c9085 = c9085;
                    int iM31612 = C0773.m3169("᩷۬") ^ i8;
                    i4 = ((iM31612 ^ i9) * (-13211)) ^ (-542981693);
                    i6 = iM31612 ^ (-1165242825);
                    int i111 = i4;
                    obj = obj;
                    c13511 = c13511;
                    i11 = i6;
                    i10 = i111;
                    break;
                case -1643261825:
                case 1191553423:
                    ((InterfaceC1615) obj).mo5708();
                    break;
                case -1516590402:
                case 1422965461:
                    if (C2287.f7432 < 0) {
                        obj = obj;
                        int iM2767 = C0619.m2761("᩸᩵") ^ i8;
                        i11 = iM2767 ^ 841936203;
                        i10 = ((iM2767 ^ i9) * (-9885)) ^ (-1105275732);
                        obj = obj;
                        c13511 = null;
                    } else {
                        int iM2768 = C0619.m2761("ۖ۬") ^ i9;
                        i2 = ((iM2768 ^ i8) * 18727) ^ (-359406020);
                        i11 = iM2768 ^ (-285130036);
                        i10 = i2;
                    }
                    break;
                case -1504796055:
                case 753556760:
                    c13511 = c13511;
                    obj = obj;
                    c9085 = c9085;
                    if (!C1343.m4943()) {
                        int iM2769 = C0619.m2761("ܳۖ") ^ i9;
                        i11 = iM2769 ^ 2101872096;
                        i10 = ((iM2769 ^ i8) * 12351) ^ 496809727;
                        c9085 = c9085;
                        obj = obj;
                        c13511 = null;
                    } else {
                        iM3169 = C0773.m3169("ۢۖ") ^ i8;
                        i4 = ((iM3169 ^ i9) * 5193) ^ 1128266481;
                        i5 = 550939414;
                        i6 = iM3169 ^ i5;
                        c9085 = c9085;
                        int i112 = i4;
                        obj = obj;
                        c13511 = c13511;
                        i11 = i6;
                        i10 = i112;
                    }
                    break;
                case -1372045300:
                case -694689805:
                    c13511 = c13511;
                    obj = obj;
                    c9085 = c9085;
                    int i20 = s + s2;
                    i12 = i20 * i20;
                    i13 = s * s;
                    i14 = 231587524;
                    if (RunnableC1848.f6235) {
                        iM3169 = (C0619.m2761("۠ۚ") ^ i9) * (-9);
                        i4 = ((iM3169 ^ i8) * 3279) ^ 372204469;
                        i5 = -2033603169;
                    } else {
                        iM3169 = C0773.m3169("ۡۘ") ^ i9;
                        i4 = ((iM3169 ^ i8) * 21421) ^ (-1008635472);
                        i5 = -1027249391;
                    }
                    i6 = iM3169 ^ i5;
                    c9085 = c9085;
                    int i113 = i4;
                    obj = obj;
                    c13511 = c13511;
                    i11 = i6;
                    i10 = i113;
                    break;
                case -1073892801:
                case -963002068:
                    C3099.m10095();
                    C3492.m11488();
                    break;
                case -949058534:
                case 1824194107:
                    C2310.m7813();
                    if (!C3492.m11488()) {
                        c13511 = c13511;
                        obj = obj;
                        c9085 = c9085;
                        iM3169 = (C0619.m2761("۠ۚ") ^ i9) * (-9);
                        i4 = ((iM3169 ^ i8) * 3279) ^ 372204469;
                        i5 = -2033603169;
                        i6 = iM3169 ^ i5;
                        c9085 = c9085;
                        int i114 = i4;
                        obj = obj;
                        c13511 = c13511;
                        i11 = i6;
                        i10 = i114;
                    } else {
                        int iM27610 = C0619.m2761("ۖ۬") ^ i9;
                        i2 = ((iM27610 ^ i8) * 18727) ^ (-359406020);
                        i11 = iM27610 ^ (-285130036);
                        i10 = i2;
                    }
                    break;
                case -930052880:
                case 606358434:
                    C1343.m4951(c13511);
                    C13511 c13513 = c13511;
                    c9085 = new C9085(c13513, viewOnClickListenerC1057);
                    if (C1542.m5459() < 0) {
                        int iM31613 = C0773.m3169("ܰ۬") ^ i9;
                        i2 = ((iM31613 ^ i8) * 9281) ^ 2039093850;
                        i3 = iM31613 ^ (-702410521);
                        c13511 = c13513;
                        i11 = i3;
                        i10 = i2;
                    } else {
                        obj = obj;
                        c13511 = c13513;
                        int iM31614 = C0773.m3169("᩷۬") ^ i8;
                        i4 = ((iM31614 ^ i9) * (-13211)) ^ (-542981693);
                        i6 = iM31614 ^ (-1165242825);
                        int i115 = i4;
                        obj = obj;
                        c13511 = c13511;
                        i11 = i6;
                        i10 = i115;
                    }
                    break;
                case -467687185:
                case 1091220021:
                    AbstractC3624.m11755();
                    int iM27611 = C0619.m2761("ۖ۬") ^ i9;
                    i2 = ((iM27611 ^ i8) * 18727) ^ (-359406020);
                    i11 = iM27611 ^ (-285130036);
                    i10 = i2;
                    break;
                case -346165712:
                case 986689688:
                    c13511 = c13511;
                    obj = obj;
                    c9085 = c9085;
                    int i21 = i13 + i14;
                    if ((i21 + i21) - i12 >= 0) {
                        iM3169 = (C0619.m2761("ۤ֫") + i8) * 37;
                        i4 = ((iM3169 ^ i9) * 7609) ^ 51032694;
                        i5 = -1982172694;
                    } else {
                        iM3169 = C0773.m3169("ۨۚ") ^ i9;
                        i4 = ((iM3169 ^ i8) * 16495) ^ 1273146176;
                        i5 = 1007716279;
                    }
                    i6 = iM3169 ^ i5;
                    c9085 = c9085;
                    int i116 = i4;
                    obj = obj;
                    c13511 = c13511;
                    i11 = i6;
                    i10 = i116;
                    break;
                case -4543379:
                case 1778577060:
                    ReentrantLock reentrantLock = C11650.f37690;
                    if (!RunnableC1848.f6235) {
                        C2966.m9674(new Thread(new RunnableC24881(0, viewOnClickListenerC1057, c9085)));
                    } else {
                        c13511 = c13511;
                        obj = obj;
                        int iM31615 = C0773.m3169("᩷۬") ^ i8;
                        i4 = ((iM31615 ^ i9) * (-13211)) ^ (-542981693);
                        i6 = iM31615 ^ (-1165242825);
                        int i117 = i4;
                        obj = obj;
                        c13511 = c13511;
                        i11 = i6;
                        i10 = i117;
                    }
                    break;
                case 233672717:
                case 1753137075:
                    c13511 = c13511;
                    obj = obj;
                    c9085 = c9085;
                    s = sArr[0];
                    s2 = 15218;
                    if (RunnableC1848.f6235) {
                        iM3169 = (C0619.m2761("۠ۚ") ^ i9) * (-9);
                        i4 = ((iM3169 ^ i8) * 3279) ^ 372204469;
                        i5 = -2033603169;
                    } else {
                        iM3169 = C0619.m2761("ۢ֫") ^ i8;
                        i4 = ((iM3169 ^ i9) * 17029) ^ (-1280691711);
                        i5 = 2013958236;
                    }
                    i6 = iM3169 ^ i5;
                    c9085 = c9085;
                    int i118 = i4;
                    obj = obj;
                    c13511 = c13511;
                    i11 = i6;
                    i10 = i118;
                    break;
                case 251632125:
                case 258657099:
                    if (C3492.f12043 > 0) {
                        obj = obj;
                        c9085 = c9085;
                        int iM27612 = C0619.m2761("ܳۖ") ^ i9;
                        i11 = iM27612 ^ 2101872096;
                        i10 = ((iM27612 ^ i8) * 12351) ^ 496809727;
                        c9085 = c9085;
                        obj = obj;
                        c13511 = null;
                    } else {
                        int iM27613 = C0619.m2761("ۖ۬") ^ i9;
                        i2 = ((iM27613 ^ i8) * 18727) ^ (-359406020);
                        i11 = iM27613 ^ (-285130036);
                        i10 = i2;
                    }
                    break;
                case 361235059:
                case 552714016:
                    i15 = 34614;
                    iM3169 = C0773.m3169("ۖۛ") ^ i9;
                    i4 = ((iM3169 ^ i8) * 22339) ^ (-261198767);
                    i5 = 455359048;
                    i6 = iM3169 ^ i5;
                    c9085 = c9085;
                    int i119 = i4;
                    obj = obj;
                    c13511 = c13511;
                    i11 = i6;
                    i10 = i119;
                    break;
                case 482434964:
                case 851229115:
                    C13511 c13514 = c13511;
                    C9085 c9086 = c9085;
                    int i22 = this.f13204;
                    obj = this.f13205;
                    switch (i22) {
                        case 0:
                            iM2761 = (C0619.m2761("۠۠") + i8) * (-51);
                            i2 = ((iM2761 ^ i9) * 9447) ^ (-2142761878);
                            i7 = -729094091;
                            break;
                        default:
                            iM2761 = C0773.m3169("ܳᩴ") ^ i8;
                            i2 = ((iM2761 ^ i9) * 31275) ^ (-1635549590);
                            i7 = 1212097159;
                            break;
                    }
                    i3 = iM2761 ^ i7;
                    c13511 = c13514;
                    c9085 = c9086;
                    i11 = i3;
                    i10 = i2;
                    break;
                default:
                    i15 = 53503;
                    iM3169 = C0773.m3169("ۖۛ") ^ i9;
                    i4 = ((iM3169 ^ i8) * 22339) ^ (-261198767);
                    i5 = 455359048;
                    i6 = iM3169 ^ i5;
                    c9085 = c9085;
                    int i1110 = i4;
                    obj = obj;
                    c13511 = c13511;
                    i11 = i6;
                    i10 = i1110;
                    break;
            }
            return;
        }
    }
}
