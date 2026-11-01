package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩷ۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01RF */
/* JADX INFO: loaded from: classes5.dex */
public final class C20625 extends AbstractC12807 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f67181 = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int[] f67182 = new int[128];

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f67183;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f67184;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f67185;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte f67186;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f67187;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f67188;

    public C20625(C17720 c17720) {
        this.f67184 = c17720.mo25183(65536);
        m46493();
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
            f67182[i >> 4] = 161 - i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46490(C17720 c17720) {
        c17720.mo25181(this.f67184);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m46494() {
        return this.f67187 + ((int) this.f67183) + 4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46489(OutputStream outputStream) throws IOException {
        outputStream.write(this.f67184, 0, this.f67187);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m46493() {
        this.f67185 = 0L;
        this.f67188 = -1;
        this.f67186 = (byte) 0;
        this.f67183 = 1L;
        this.f67187 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m46488() {
        for (int i = 0; i < 5; i++) {
            try {
                m46485();
            } catch (IOException unused) {
                throw new Error();
            }
        }
        return this.f67187;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m46485() {
        long j = this.f67185;
        int i = (int) (j >>> 32);
        if (i != 0 || j < 4278190080L) {
            byte b = this.f67186;
            while (true) {
                int i2 = this.f67187;
                this.f67187 = i2 + 1;
                this.f67184[i2] = (byte) (b + i);
                long j2 = this.f67183 - 1;
                this.f67183 = j2;
                if (j2 == 0) {
                    break;
                } else {
                    b = 255;
                }
            }
            this.f67186 = (byte) (this.f67185 >>> 24);
        }
        this.f67183++;
        this.f67185 = (this.f67185 & 16777215) << 8;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46492(short[] sArr, int i, int i2) {
        short s = sArr[i];
        int i3 = this.f67188;
        int i4 = (i3 >>> 11) * s;
        if (i2 == 0) {
            this.f67188 = i4;
            sArr[i] = (short) (s + ((2048 - s) >>> 5));
        } else {
            this.f67185 += ((long) i4) & 4294967295L;
            this.f67188 = i3 - i4;
            sArr[i] = (short) (s - (s >>> 5));
        }
        int i5 = this.f67188;
        if (((-16777216) & i5) == 0) {
            this.f67188 = i5 << 8;
            m46485();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m46486(int i, int i2) {
        return f67182[(i ^ ((-i2) & 2047)) >>> 4];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46491(short[] sArr, int i) {
        int length = sArr.length;
        int i2 = 1;
        do {
            length >>>= 1;
            int i3 = i & length;
            m46492(sArr, i2, i3);
            i2 <<= 1;
            if (i3 != 0) {
                i2 |= 1;
            }
        } while (length != 1);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m46487(short[] sArr, int i) {
        int length = i | sArr.length;
        int iM46486 = 0;
        do {
            int i2 = length & 1;
            length >>>= 1;
            iM46486 += m46486(sArr[length], i2);
        } while (length != 1);
        return iM46486;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46495(int i, int i2) {
        do {
            int i3 = this.f67188 >>> 1;
            this.f67188 = i3;
            i2--;
            this.f67185 += (long) ((0 - ((i >>> i2) & 1)) & i3);
            if (((-16777216) & i3) == 0) {
                this.f67188 = i3 << 8;
                m46485();
            }
        } while (i2 != 0);
    }
}
