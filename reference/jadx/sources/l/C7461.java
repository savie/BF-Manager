package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۜ᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 01RF */
/* JADX INFO: loaded from: classes4.dex */
public final class C7461 extends AbstractC17076 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final int[] f24583 = new int[128];

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f24584 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f24585;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte f24586;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f24587;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f24588;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f24589;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f24590;

    public C7461(C0573 c0573) {
        this.f24585 = c0573.mo2594(65536);
        m20490();
    }

    static {
        for (int i = 8; i < 2048; i += 16) {
            int i2 = 0;
            int i3 = i;
            for (int i4 = 0; i4 < 4; i4++) {
                i3 *= i3;
                i2 <<= 1;
                while (((-65536) & i3) != 0) {
                    i3 >>>= 1;
                    i2++;
                }
            }
            f24583[i >> 4] = 161 - i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20487(C0573 c0573) {
        c0573.mo2592(this.f24585);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m20491() {
        return this.f24589 + ((int) this.f24590) + 4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20486(OutputStream outputStream) throws IOException {
        outputStream.write(this.f24585, 0, this.f24589);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m20490() {
        this.f24588 = 0L;
        this.f24587 = -1;
        this.f24586 = (byte) 0;
        this.f24590 = 1L;
        this.f24589 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m20484() {
        for (int i = 0; i < 5; i++) {
            try {
                m20483();
            } catch (IOException unused) {
                throw new Error();
            }
        }
        return this.f24589;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m20483() {
        long j = this.f24588;
        int i = (int) (j >>> 32);
        if (i != 0 || j < 4278190080L) {
            byte b = this.f24586;
            while (true) {
                int i2 = this.f24589;
                this.f24589 = i2 + 1;
                this.f24585[i2] = (byte) (b + i);
                long j2 = this.f24590 - 1;
                this.f24590 = j2;
                if (j2 == 0) {
                    break;
                } else {
                    b = 255;
                }
            }
            this.f24586 = (byte) (this.f24588 >>> 24);
        }
        this.f24590++;
        this.f24588 = (this.f24588 & 16777215) << 8;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20489(short[] sArr, int i, int i2) {
        short s = sArr[i];
        int i3 = this.f24587;
        int i4 = (i3 >>> 11) * s;
        if (i2 == 0) {
            this.f24587 = i4;
            sArr[i] = (short) (s + ((2048 - s) >>> 5));
        } else {
            this.f24588 += ((long) i4) & 4294967295L;
            this.f24587 = i3 - i4;
            sArr[i] = (short) (s - (s >>> 5));
        }
        int i5 = this.f24587;
        if (((-16777216) & i5) == 0) {
            this.f24587 = i5 << 8;
            m20483();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m20481(int i, int i2) {
        return f24583[(i ^ ((-i2) & 2047)) >>> 4];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20488(short[] sArr, int i) {
        int length = sArr.length;
        int i2 = 1;
        do {
            length >>>= 1;
            int i3 = i & length;
            m20489(sArr, i2, i3);
            i2 <<= 1;
            if (i3 != 0) {
                i2 |= 1;
            }
        } while (length != 1);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m20482(short[] sArr, int i) {
        int length = i | sArr.length;
        int iM20481 = 0;
        do {
            int i2 = length & 1;
            length >>>= 1;
            iM20481 += m20481(sArr[length], i2);
        } while (length != 1);
        return iM20481;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20485(int i, int i2) {
        do {
            int i3 = this.f24587 >>> 1;
            this.f24587 = i3;
            i2--;
            this.f24588 += (long) ((0 - ((i >>> i2) & 1)) & i3);
            if (((-16777216) & i3) == 0) {
                this.f24587 = i3 << 8;
                m20483();
            }
        } while (i2 != 0);
    }
}
