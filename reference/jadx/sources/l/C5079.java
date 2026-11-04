package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.HashSet;
import java.util.Random;

/* JADX INFO: renamed from: l.ۙᩳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 760C */
/* JADX INFO: loaded from: classes3.dex */
public final class C5079 implements InterfaceC6988 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f17713;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f17714;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f17715;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Random f17716;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public HashSet f17717;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f17718;

    @Override // l.InterfaceC6988
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized String mo15360() {
        int i;
        StringBuilder sb;
        if (this.f17717.size() >= this.f17718) {
            m15359(this.f17713 + 1);
        }
        int iM9671 = C2966.m9671(this.f17715);
        int[] iArr = this.f17714;
        int i2 = 0;
        while (true) {
            if (i2 >= 1000) {
                i = -1;
                break;
            }
            i = 0;
            for (int i3 = 0; i3 < iArr.length; i3++) {
                int iNextInt = this.f17716.nextInt(iM9671);
                iArr[i3] = iNextInt;
                i = (i * iM9671) + iNextInt;
            }
            if (!C20932.m47847(this.f17717, C0773.m3159(i))) {
                break;
            }
            i2++;
        }
        if (i == -1) {
            for (int i4 = 0; i4 < this.f17718; i4++) {
                if (!C0487.m2352(this.f17717, C0773.m3159(i4))) {
                    int i5 = i4;
                    for (int length = iArr.length - 1; length >= 0; length--) {
                        iArr[length] = i5 % iM9671;
                        i5 /= iM9671;
                    }
                    i = i4;
                    break;
                }
            }
        }
        if (i == -1) {
            throw new RuntimeException();
        }
        C0862.m3502(this.f17717, C0773.m3159(i));
        sb = new StringBuilder();
        for (int i6 : iArr) {
            C2023.m6955(sb, C1343.m4937(this.f17715, i6));
        }
        return C2023.m6952(sb);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01fb A[PHI: r3 r4 r5 r16 r18
      0x01fb: PHI (r3v4 int[]) = (r3v3 int[]), (r3v2 int[]), (r3v2 int[]), (r3v2 int[]) binds: [B:46:0x0148, B:42:0x0126, B:38:0x0102, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r4v4 java.lang.String) = (r4v2 java.lang.String), (r4v3 java.lang.String), (r4v2 java.lang.String), (r4v2 java.lang.String) binds: [B:46:0x0148, B:42:0x0126, B:38:0x0102, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:46:0x0148, B:42:0x0126, B:38:0x0102, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r16v9 double) = (r16v5 double), (r16v6 double), (r16v7 double), (r16v10 double) binds: [B:46:0x0148, B:42:0x0126, B:38:0x0102, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x01fb: PHI (r18v10 double) = (r18v3 double), (r18v4 double), (r18v5 double), (r18v11 double) binds: [B:46:0x0148, B:42:0x0126, B:38:0x0102, B:6:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (l.C11235.f35427 >= 0) goto L17;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m15359(int r23) {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5079.m15359(int):void");
    }

    public C5079(String str) {
        Random random = null;
        HashSet hashSet = null;
        int i = 994103936;
        int i2 = RunnableC0334.f1808;
        int i3 = AbstractC0641.f2496;
        int iM3169 = C0773.m3169("ۨۗ") ^ i3;
        int i4 = ((iM3169 ^ i2) * (-8409)) ^ 1927492645;
        int i5 = -1934745948;
        while (true) {
            i = ((((i ^ i2) * 12491) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2103073858:
                case -1902292758:
                    if (C2834.f9334 <= 0) {
                        iM3169 = C0773.m3169("᩵ۢ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-18593)) ^ (-2050836998);
                        i5 = -152603558;
                    } else {
                        iM3169 = (i2 - C0773.m3169("᩵۟")) * (-93);
                        i4 = ((iM3169 ^ i3) * (-27565)) ^ (-2045486537);
                        i5 = -708503567;
                    }
                    break;
                case -2034097480:
                case 1062646608:
                    m15359(1);
                    return;
                case -2011621330:
                case -1143810288:
                    C3077.m10041();
                    C1146.m4231();
                    throw new RuntimeException();
                case -1936993595:
                case -1381241668:
                    if (C3448.f11240 >= 0) {
                        iM3169 = (C0773.m3169("۫᩸") ^ i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM3169 ^ i3) * (-27433)) ^ (-1499918986);
                        i5 = -1698943015;
                    } else {
                        iM3169 = C0619.m2761("ܺᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-22223)) ^ 101512040;
                        i5 = -951800149;
                    }
                    break;
                case -1747739368:
                case -814611838:
                    if (C2288.f7433 <= 0) {
                        iM3169 = (C0619.m2761("ۗۡ") + i2) * 63;
                        i4 = ((iM3169 ^ i3) * (-11367)) ^ 1553236691;
                        i5 = -2119744617;
                    } else {
                        iM3169 = (C0773.m3169("֨ۗ") ^ i3) * 65;
                        i4 = ((iM3169 ^ i2) * 29435) ^ 1328801439;
                        i5 = -862598696;
                    }
                    break;
                case -1728973599:
                case -218387938:
                    if (C11235.m28309() != 0) {
                        iM3169 = (i2 - C0773.m3169("ۨ۬")) * (-127);
                        i4 = ((iM3169 ^ i3) * 23893) ^ (-1049873746);
                        i5 = 115050947;
                    } else {
                        iM3169 = (C0619.m2761("ܳ᩺") + i3) * 109;
                        i4 = ((iM3169 ^ i2) * 26777) ^ (-3631549);
                        i5 = 696747280;
                    }
                    break;
                case -1566453076:
                case 886874421:
                    this.f17716 = random;
                    if (C3492.m11488()) {
                        iM3169 = C0619.m2761("᩶ᩳ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 29463) ^ (-103051974);
                        i5 = -435919604;
                    } else {
                        iM3169 = C0619.m2761("۬ۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-6659)) ^ 742740181;
                        i5 = 802392543;
                    }
                    break;
                case -1526283962:
                case 1652076909:
                    C2419.m8174();
                    if (C11235.m28309() != 0) {
                        iM3169 = (i2 - C0773.m3169("ۨ۬")) * (-127);
                        i4 = ((iM3169 ^ i3) * 23893) ^ (-1049873746);
                        i5 = 115050947;
                    } else {
                        iM3169 = C0773.m3169("᩵ۢ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-18593)) ^ (-2050836998);
                        i5 = -152603558;
                    }
                    break;
                case -1347815778:
                case -413974962:
                    if (C17202.f56030) {
                        iM3169 = C0773.m3169("ᩳᩴ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 23001) ^ (-1169120324);
                        i5 = 963457206;
                    } else {
                        iM3169 = (C0619.m2761("ۗۡ") + i2) * 63;
                        i4 = ((iM3169 ^ i3) * (-11367)) ^ 1553236691;
                        i5 = -2119744617;
                    }
                    break;
                case -1199384850:
                case 1827079128:
                    this.f17717 = hashSet;
                    this.f17715 = str;
                    if (C3033.f9831 >= 0) {
                        iM3169 = (i2 - C0773.m3169("ۨ۬")) * (-127);
                        i4 = ((iM3169 ^ i3) * 23893) ^ (-1049873746);
                        i5 = 115050947;
                    } else {
                        iM3169 = (i3 - C0619.m2761("᩻ۢ")) * 35;
                        i4 = ((iM3169 ^ i2) * (-17553)) ^ (-1371266790);
                        i5 = -980098895;
                    }
                    break;
                case -742861442:
                case 1143572164:
                    hashSet = new HashSet();
                    if (C2310.m7813() <= 0) {
                        iM3169 = (C0773.m3169("۫᩸") ^ i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM3169 ^ i3) * (-27433)) ^ (-1499918986);
                        i5 = -1698943015;
                    } else {
                        iM3169 = (C0773.m3169("ܳ᩵") ^ i2) * 69;
                        i4 = ((iM3169 ^ i3) * 4241) ^ (-357548683);
                        i5 = 278528953;
                    }
                    break;
                case -104563057:
                case 2083642021:
                    C2834.m9344();
                    AbstractC0641.m2813();
                    iM3169 = (C0619.m2761("ۗۡ") + i2) * 63;
                    i4 = ((iM3169 ^ i3) * (-11367)) ^ 1553236691;
                    i5 = -2119744617;
                    break;
                case -34504245:
                case 184501661:
                    if (C2485.f7950 == 0) {
                        iM3169 = C0619.m2761("۬ۗ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-6659)) ^ 742740181;
                        i5 = 802392543;
                    } else {
                        iM3169 = (C0619.m2761("ۗۡ") + i2) * 63;
                        i4 = ((iM3169 ^ i3) * (-11367)) ^ 1553236691;
                        i5 = -2119744617;
                    }
                    break;
                case 108746681:
                case 320310626:
                    random = new Random();
                    if (C17202.f56030) {
                        iM3169 = (C0773.m3169("ۗ᩶") ^ i3) * 93;
                        i4 = ((iM3169 ^ i2) * (-26347)) ^ 810390906;
                        i5 = -316128889;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ۨ۬")) * (-127);
                        i4 = ((iM3169 ^ i3) * 23893) ^ (-1049873746);
                        i5 = 115050947;
                    }
                    break;
                case 1358280072:
                case 1571686475:
                    if (C11235.f35427 < 0) {
                        iM3169 = C0773.m3169("᩵ۢ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-18593)) ^ (-2050836998);
                        i5 = -152603558;
                    } else {
                        iM3169 = (C0619.m2761("ۗۡ") + i2) * 63;
                        i4 = ((iM3169 ^ i3) * (-11367)) ^ 1553236691;
                        i5 = -2119744617;
                    }
                    break;
                default:
                    if (C1564.m5509() <= 0) {
                        iM3169 = (C0619.m2761("ۗۡ") + i2) * 63;
                        i4 = ((iM3169 ^ i3) * (-11367)) ^ 1553236691;
                        i5 = -2119744617;
                    } else {
                        iM3169 = (C0619.m2761("ܽۜ") ^ i3) * 25;
                        i4 = ((iM3169 ^ i2) * (-8683)) ^ (-830915832);
                        i5 = 420195101;
                    }
                    break;
            }
        }
    }
}
