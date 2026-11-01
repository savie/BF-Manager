package l;

import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.۠ᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67VX */
/* JADX INFO: loaded from: classes3.dex */
public final class C8344 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f28889;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f28890;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f28891;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f28892;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int[] f28895;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f28897;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f28900;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C19633 f28901;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C9050 f28903;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21043 f28905;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f28906;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f28907;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f28908;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f28909;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f28911;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int[] f28912;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f28913;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int[] f28888 = {0, 1, 3, 7, 15, 31, 63, 127, 255, SecP521R1Field.P16, 1023, 2047, 4095, 8191, ASN1RelativeOID.MAX_IDENTIFIER_LENGTH, EnumC23529.f76192, 65535};

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final int[] f28887 = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f28893 = new int[1];

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int[] f28898 = new int[1];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int[] f28894 = new int[1];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int[] f28902 = new int[1];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[][] f28910 = new int[1][];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[][] f28899 = new int[1][];

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int[] f28904 = new int[1];

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int[] f28896 = new int[1];

    public C8344(C21043 c21043, int i) {
        C9050 c9050 = new C9050();
        c9050.f30876 = null;
        c9050.f30874 = null;
        c9050.f30873 = null;
        c9050.f30875 = null;
        c9050.f30872 = null;
        c9050.f30877 = null;
        this.f28903 = c9050;
        this.f28905 = c21043;
        this.f28901 = new C19633(c21043, this);
        this.f28895 = new int[4320];
        this.f28909 = new byte[i];
        this.f28892 = i;
        this.f28890 = c21043.f2539.f25222 != 0;
        this.f28907 = 0;
        m21794();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21794() {
        this.f28907 = 0;
        this.f28891 = 0;
        this.f28900 = 0;
        this.f28889 = 0;
        this.f28897 = 0;
        if (this.f28890) {
            this.f28905.f2538.reset();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:217:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0115 A[LOOP:4: B:39:0x0115->B:42:0x011a, LOOP_START, PHI: r1 r9 r10 r11 r12
      0x0115: PHI (r1v39 int) = (r1v38 int), (r1v44 int) binds: [B:38:0x0113, B:42:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x0115: PHI (r9v8 int) = (r9v6 int), (r9v9 int) binds: [B:38:0x0113, B:42:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x0115: PHI (r10v10 int) = (r10v8 int), (r10v11 int) binds: [B:38:0x0113, B:42:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x0115: PHI (r11v16 int) = (r11v15 int), (r11v18 int) binds: [B:38:0x0113, B:42:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x0115: PHI (r12v14 int) = (r12v12 int), (r12v16 int) binds: [B:38:0x0113, B:42:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x011a A[LOOP:4: B:39:0x0115->B:42:0x011a, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0144 -> B:46:0x0158). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m21795(int r34) {
        /*
            Method dump skipped, instruction units count: 1520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8344.m21795(int):int");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m21793(int i) {
        C21043 c21043 = this.f28905;
        int i2 = c21043.f2540;
        int i3 = this.f28897;
        int i4 = this.f28889;
        int i5 = this.f28892;
        if (i3 > i4) {
            i4 = i5;
        }
        int i6 = i4 - i3;
        int i7 = c21043.f2541;
        if (i6 > i7) {
            i6 = i7;
        }
        if (i6 != 0 && i == -5) {
            i = 0;
        }
        c21043.f2541 = i7 - i6;
        c21043.f2544 += (long) i6;
        boolean z = this.f28890;
        if (z && i6 > 0) {
            c21043.f2538.update(this.f28909, i3, i6);
        }
        System.arraycopy(this.f28909, i3, c21043.f2537, i2, i6);
        int i8 = i2 + i6;
        int i9 = i3 + i6;
        if (i9 == i5) {
            if (this.f28889 == i5) {
                this.f28889 = 0;
            }
            i9 = this.f28889;
            int i10 = c21043.f2541;
            if (i9 > i10) {
                i9 = i10;
            }
            if (i9 != 0 && i == -5) {
                i = 0;
            }
            c21043.f2541 = i10 - i9;
            c21043.f2544 += (long) i9;
            if (z && i9 > 0) {
                c21043.f2538.update(this.f28909, 0, i9);
            }
            System.arraycopy(this.f28909, 0, c21043.f2537, i8, i9);
            i8 += i9;
        }
        c21043.f2540 = i8;
        this.f28897 = i9;
        return i;
    }
}
