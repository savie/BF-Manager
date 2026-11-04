package l;

import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.ۡۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67VX */
/* JADX INFO: loaded from: classes3.dex */
public final class C9294 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C4559 f30202;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f30203;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f30204;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C2583 f30207;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f30209;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f30210;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f30212;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int[] f30214;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f30215;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C8549 f30216;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f30217;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f30218;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f30220;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f30221;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f30223;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f30224;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f30226;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int[] f30201 = {0, 1, 3, 7, 15, 31, 63, 127, 255, SecP521R1Field.P16, 1023, 2047, 4095, 8191, ASN1RelativeOID.MAX_IDENTIFIER_LENGTH, EnumC6121.f20881, 65535};

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final int[] f30200 = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f30206 = new int[1];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f30211 = new int[1];

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int[] f30219 = new int[1];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f30222 = new int[1];

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int[][] f30205 = new int[1][];

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int[][] f30208 = new int[1][];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int[] f30213 = new int[1];

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int[] f30225 = new int[1];

    public C9294(C4559 c4559, int i) {
        C8549 c8549 = new C8549();
        c8549.f27920 = null;
        c8549.f27919 = null;
        c8549.f27916 = null;
        c8549.f27917 = null;
        c8549.f27921 = null;
        c8549.f27918 = null;
        this.f30216 = c8549;
        this.f30202 = c4559;
        this.f30207 = new C2583(c4559, this);
        this.f30210 = new int[4320];
        this.f30221 = new byte[i];
        this.f30203 = i;
        this.f30212 = c4559.f72684.f43707 != 0;
        this.f30224 = 0;
        m24505();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24505() {
        this.f30224 = 0;
        this.f30223 = 0;
        this.f30209 = 0;
        this.f30218 = 0;
        this.f30204 = 0;
        if (this.f30212) {
            this.f30202.f72677.reset();
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
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m24506(int r34) {
        /*
            Method dump skipped, instruction units count: 1520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9294.m24506(int):int");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24504(int i) {
        C4559 c4559 = this.f30202;
        int i2 = c4559.f72680;
        int i3 = this.f30204;
        int i4 = this.f30218;
        int i5 = this.f30203;
        if (i3 > i4) {
            i4 = i5;
        }
        int i6 = i4 - i3;
        int i7 = c4559.f72679;
        if (i6 > i7) {
            i6 = i7;
        }
        if (i6 != 0 && i == -5) {
            i = 0;
        }
        c4559.f72679 = i7 - i6;
        c4559.f72683 += (long) i6;
        boolean z = this.f30212;
        if (z && i6 > 0) {
            c4559.f72677.update(this.f30221, i3, i6);
        }
        System.arraycopy(this.f30221, i3, c4559.f72676, i2, i6);
        int i8 = i2 + i6;
        int i9 = i3 + i6;
        if (i9 == i5) {
            if (this.f30218 == i5) {
                this.f30218 = 0;
            }
            i9 = this.f30218;
            int i10 = c4559.f72679;
            if (i9 > i10) {
                i9 = i10;
            }
            if (i9 != 0 && i == -5) {
                i = 0;
            }
            c4559.f72679 = i10 - i9;
            c4559.f72683 += (long) i9;
            if (z && i9 > 0) {
                c4559.f72677.update(this.f30221, 0, i9);
            }
            System.arraycopy(this.f30221, 0, c4559.f72676, i8, i9);
            i8 += i9;
        }
        c4559.f72680 = i8;
        this.f30204 = i9;
        return i;
    }
}
