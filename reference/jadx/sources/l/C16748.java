package l;

import java.util.Arrays;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ܺۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 819S */
/* JADX INFO: loaded from: classes4.dex */
public final class C16748 {

    /* JADX INFO: renamed from: ۬֫ᩴ, reason: not valid java name and contains not printable characters */
    private static final short[] f54057 = {8560, -28424, -28439, -28430, -28474, -28438, -28432, -28418, -28425, -28424, -28435, -28436, -28437, -28420, -28474, -28432, -28425, -28417, -28426, -28474, -28424, -28419, -28419, -28474, -28422, -28426, -28427, -28426, -28425, -28424, -28439, -28430, -28474, -28438, -28432, -28418, -28425, -28424, -28435, -28436, -28437, -28420, -28474, -28432, -28425, -28417, -28426, -28474, -28436, -28439, -28439, -28420, -28437, -28474, -28422, -28424, -28438, -28420, -28503, -28447, -28484, -28503, -28511, -28447, -28487, -28495, -28484, -28419, -28496, -28503, -28447, -28484, -28503, -28511, -28479, -28487, -28495, -28484, -28419, -28496};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f54058;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte[] f54059;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] f54060;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f54061;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f54062;

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19681. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39522(android.widget.TextView r43, android.widget.TextView r44, android.widget.TextView r45, android.widget.TextView r46, android.widget.TextView r47) {
        /*
            Method dump skipped, instruction units count: 1968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16748.m39522(android.widget.TextView, android.widget.TextView, android.widget.TextView, android.widget.TextView, android.widget.TextView):void");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0108  */
    /* JADX WARN: Code duplicated, block: B:46:0x013f A[PHI: r1 r3
      0x013f: PHI (r1v4 long) = (r1v3 long), (r1v2 long), (r1v2 long) binds: [B:45:0x013d, B:37:0x00e7, B:33:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x013f: PHI (r3v4 int) = (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:45:0x013d, B:37:0x00e7, B:33:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x018b A[PHI: r5 r11
      0x018b: PHI (r5v5 byte[]) = (r5v2 byte[]), (r5v4 byte[]), (r5v2 byte[]), (r5v2 byte[]), (r5v2 byte[]) binds: [B:52:0x0189, B:24:0x0070, B:18:0x004d, B:16:0x0049, B:13:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x018b: PHI (r11v8 java.util.zip.CRC32) = 
      (r11v5 java.util.zip.CRC32)
      (r11v4 java.util.zip.CRC32)
      (r11v4 java.util.zip.CRC32)
      (r11v4 java.util.zip.CRC32)
      (r11v4 java.util.zip.CRC32)
     binds: [B:52:0x0189, B:24:0x0070, B:18:0x004d, B:16:0x0049, B:13:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01bd A[PHI: r4
      0x01bd: PHI (r4v5 byte[]) = (r4v2 byte[]), (r4v4 byte[]), (r4v2 byte[]) binds: [B:56:0x01bb, B:29:0x00ab, B:10:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39523(byte[] bArr) {
        int iM2761;
        int i;
        long value = 0;
        int iHashCode = 0;
        byte[] bArrDigest = null;
        byte[] bArrDigest2 = null;
        int i2 = -177204316;
        int i3 = C1321.f4751;
        int i4 = C1826.f6190;
        int iM2762 = C0619.m2761("ۜۘ") ^ i4;
        int i5 = ((iM2762 ^ i3) * 9583) ^ 1506964989;
        int i6 = -555220291;
        while (true) {
            int i7 = iM2762 ^ i6;
            CRC32 crc32 = null;
            while (true) {
                i2 = ((((i2 ^ i3) * 521) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1904146949:
                    case -1173493210:
                        if (RunnableC3055.m9933() != 0) {
                            iM2761 = (C0773.m3169("ܺ᩻") + i4) * 11;
                            i5 = ((iM2761 ^ i3) * 17333) ^ 1650392309;
                            i = 1929855419;
                        } else {
                            iM2761 = C0619.m2761("᩵ۛ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 26369) ^ 1180722025;
                            i = -1613058560;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1855885058:
                    case 1299748747:
                        this.f54062 = bArrDigest2;
                        this.f54060 = C15022.m36179().digest(bArr);
                        break;
                    case -1709294638:
                    case -1325783517:
                        this.f54058 = (int) value;
                        if (C4238.f15451 >= 0) {
                            iM2761 = (C0773.m3169("۟ܳ") + i4) * (-83);
                            i5 = ((iM2761 ^ i3) * (-32757)) ^ (-668509601);
                            i = -287212285;
                        } else {
                            iM2761 = C0619.m2761("ۛᩳ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-7693)) ^ (-1727589143);
                            i = 1071396820;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1644332746:
                    case 1398592535:
                        crc32.update(bArr);
                        value = crc32.getValue();
                        if (C0773.m3161() != 0) {
                            iM2761 = C0619.m2761("ܶܰ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 1447) ^ (-636154457);
                            i = -1060674419;
                        } else {
                            iM2761 = (i3 - C0773.m3169("֫᩵")) * 25;
                            i5 = ((iM2761 ^ i4) * 7071) ^ (-1699502525);
                            i = -199216438;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1565650766:
                    case 1807530619:
                        C1783.m6232();
                        if (C2834.f9334 > 0) {
                            iM2761 = (i4 - C0619.m2761("ۗ۠")) * (-19);
                            i5 = ((iM2761 ^ i3) * (-27133)) ^ (-1987513997);
                            i = -1586948778;
                        } else {
                            iM2761 = (C0773.m3169("۟ܳ") + i4) * (-83);
                            i5 = ((iM2761 ^ i3) * (-32757)) ^ (-668509601);
                            i = -287212285;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1484146116:
                    case 1015147151:
                        AbstractC3624.m11755();
                        C0862.m3503();
                        iM2761 = (i4 - C0619.m2761("ۗ۠")) * (-19);
                        i5 = ((iM2761 ^ i3) * (-27133)) ^ (-1987513997);
                        i = -1586948778;
                        i7 = iM2761 ^ i;
                        break;
                    case -1151215922:
                    case 1530522315:
                        iHashCode = Arrays.hashCode(bArr);
                        if (C1343.m4943()) {
                            iM2761 = (i4 - C0619.m2761("۟ۧ")) * 15;
                            i5 = ((iM2761 ^ i3) * 23749) ^ (-1792473596);
                            i = -97898900;
                        } else {
                            iM2761 = C0619.m2761("ܶܰ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 1447) ^ (-636154457);
                            i = -1060674419;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -833530788:
                    case 1436273391:
                        bArrDigest = C15022.m36174().digest(bArr);
                        if (C2023.f6737) {
                            iM2761 = (C0773.m3169("ܺ᩻") + i4) * 11;
                            i5 = ((iM2761 ^ i3) * 17333) ^ 1650392309;
                            i = 1929855419;
                        } else {
                            iM2761 = C0619.m2761("۫ۡ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-2651)) ^ 1578959360;
                            i = 396059908;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -629527532:
                    case 577007728:
                        C0950.m3785();
                        break;
                    case -422586965:
                    case 323684765:
                        this.f54061 = iHashCode;
                        if (C0487.f2131 <= 0) {
                            iM2761 = C0619.m2761("ܶܰ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 1447) ^ (-636154457);
                            i = -1060674419;
                        } else {
                            iM2761 = C0619.m2761("۬֫") ^ i3;
                            i5 = ((iM2761 ^ i4) * 18131) ^ 330381034;
                            i = 1758025496;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -326235103:
                    case 1717525836:
                        if (C2702.m8876()) {
                            iM2761 = (C0773.m3169("ܺ᩻") + i4) * 11;
                            i5 = ((iM2761 ^ i3) * 17333) ^ 1650392309;
                            i = 1929855419;
                        } else {
                            iM2761 = (C0773.m3169("۟ܳ") + i4) * (-83);
                            i5 = ((iM2761 ^ i3) * (-32757)) ^ (-668509601);
                            i = -287212285;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -79911199:
                    case 1986070546:
                        if (C1826.f6190 > 0) {
                            crc32 = new CRC32();
                            if (C17202.f56030) {
                                iM2761 = (i3 - C0619.m2761("ۘܽ")) * 127;
                                i5 = ((iM2761 ^ i4) * (-28475)) ^ (-2057335264);
                                i = -164179203;
                            } else {
                                iM2761 = (i4 - C0619.m2761("ۗ۠")) * (-19);
                                i5 = ((iM2761 ^ i3) * (-27133)) ^ (-1987513997);
                                i = -1586948778;
                            }
                            i7 = iM2761 ^ i;
                        }
                        break;
                    case 453534505:
                    case 652525507:
                        C1783.m6232();
                        if (C0862.f3233 == 0) {
                        }
                        iM2761 = (i4 - C0619.m2761("ۗ۠")) * (-19);
                        i5 = ((iM2761 ^ i3) * (-27133)) ^ (-1987513997);
                        i = -1586948778;
                        i7 = iM2761 ^ i;
                        break;
                    case 836207263:
                    case 2142088695:
                        bArrDigest2 = C15022.m36183().digest(bArr);
                        if (C0862.f3233 != 0) {
                            iM2761 = (i4 - C0619.m2761("ۗ۠")) * (-19);
                            i5 = ((iM2761 ^ i3) * (-27133)) ^ (-1987513997);
                            i = -1586948778;
                        } else {
                            iM2761 = (i3 - C0773.m3169("ܿۙ")) * (-25);
                            i5 = ((iM2761 ^ i4) * 29281) ^ 1604883317;
                            i = 709474073;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    default:
                        this.f54059 = bArrDigest;
                        if (C3779.f12953 <= 0) {
                            iM2761 = (C0773.m3169("۟ܳ") + i4) * (-83);
                            i5 = ((iM2761 ^ i3) * (-32757)) ^ (-668509601);
                            i = -287212285;
                        } else {
                            iM2761 = (C0619.m2761("ᩳܺ") + i3) * 11;
                            i5 = ((iM2761 ^ i4) * 13195) ^ 711902803;
                            i = 425895529;
                        }
                        i7 = iM2761 ^ i;
                        break;
                }
                return;
            }
            iM2762 = C0619.m2761("᩺ۛ") ^ i3;
            i5 = ((iM2762 ^ i4) * 27059) ^ (-840290706);
            i6 = -853057887;
        }
    }
}
