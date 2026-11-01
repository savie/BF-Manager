package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ܶᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1DD */
/* JADX INFO: loaded from: classes4.dex */
public final class C15400 implements Cloneable {

    /* JADX INFO: renamed from: ۜܰ, reason: not valid java name and contains not printable characters */
    public static final C23161[] f50135 = {new C23161(0, 0, 0, 0, 0), new C23161(4, 4, 8, 4, 1), new C23161(4, 5, 16, 8, 1), new C23161(4, 6, 32, 32, 1), new C23161(4, 4, 16, 16, 2), new C23161(8, 16, 32, 32, 2), new C23161(8, 16, 128, 128, 2), new C23161(8, 32, 128, 256, 2), new C23161(32, 128, 258, 1024, 2), new C23161(32, 258, 258, 4096, 2)};

    /* JADX INFO: renamed from: ᩺ܰ, reason: not valid java name and contains not printable characters */
    public static final String[] f50136 = {"need dictionary", "stream end", "", "file error", "stream error", "data error", "insufficient memory", "buffer error", "incompatible version", ""};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public short[] f50137;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public short[] f50138;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f50139;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f50140;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public short[] f50141;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public int f50142;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f50143;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public int f50144;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C18927 f50145;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public int f50146;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public int f50147;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public int f50148;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f50149;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public int f50150;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public short[] f50151;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public int f50152;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f50153;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public byte[] f50154;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public byte[] f50155;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public int f50156;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public int f50157;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f50158;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public short[] f50159;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public int f50160;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f50161;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C20338 f50162;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f50163;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f50164;

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public int f50165;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public short[] f50166;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public int f50167;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public int f50168;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public int f50169;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f50170;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public C21749 f50171;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f50172;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public short[] f50173;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f50174;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public short f50175;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f50176;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C20338 f50177;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f50178;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f50179;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public int f50180;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public int f50181;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f50182;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f50183;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f50184;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f50185;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f50186;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f50187;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int[] f50188;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public int f50189;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public C20338 f50190;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte f50191;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f50192;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m36845() {
        for (int i = 0; i < 286; i++) {
            this.f50159[i * 2] = 0;
        }
        for (int i2 = 0; i2 < 30; i2++) {
            this.f50141[i2 * 2] = 0;
        }
        for (int i3 = 0; i3 < 19; i3++) {
            this.f50166[i3 * 2] = 0;
        }
        this.f50159[512] = 1;
        this.f50146 = 0;
        this.f50167 = 0;
        this.f50186 = 0;
        this.f50181 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36842(short[] sArr, int i) {
        int i2 = this.f50188[i];
        int i3 = i << 1;
        while (true) {
            int i4 = this.f50139;
            if (i3 > i4) {
                break;
            }
            if (i3 < i4) {
                int[] iArr = this.f50188;
                int i5 = i3 + 1;
                int i6 = iArr[i5];
                int i7 = iArr[i3];
                byte[] bArr = this.f50172;
                short s = sArr[i6 * 2];
                short s2 = sArr[i7 * 2];
                if (s < s2 || (s == s2 && bArr[i6] <= bArr[i7])) {
                    i3 = i5;
                }
            }
            int[] iArr2 = this.f50188;
            int i8 = iArr2[i3];
            byte[] bArr2 = this.f50172;
            short s3 = sArr[i2 * 2];
            short s4 = sArr[i8 * 2];
            if (s3 < s4 || (s3 == s4 && bArr2[i2] <= bArr2[i8])) {
                break;
            }
            iArr2[i] = i8;
            int i9 = i3;
            i3 <<= 1;
            i = i9;
        }
        this.f50188[i] = i2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36851(short[] sArr, int i) {
        int i2;
        int i3;
        short s = sArr[1];
        if (s == 0) {
            i2 = 138;
            i3 = 3;
        } else {
            i2 = 7;
            i3 = 4;
        }
        short s2 = -1;
        sArr[C0252.m1692(i, 1, 2, 1)] = -1;
        int i4 = 0;
        int i5 = 0;
        while (i4 <= i) {
            i4++;
            short s3 = sArr[(i4 * 2) + 1];
            i5++;
            if (i5 >= i2 || s != s3) {
                if (i5 < i3) {
                    short[] sArr2 = this.f50166;
                    int i6 = s * 2;
                    sArr2[i6] = (short) (sArr2[i6] + ((short) i5));
                } else if (s != 0) {
                    if (s != s2) {
                        short[] sArr3 = this.f50166;
                        int i7 = s * 2;
                        sArr3[i7] = (short) (sArr3[i7] + 1);
                    }
                    short[] sArr4 = this.f50166;
                    sArr4[32] = (short) (sArr4[32] + 1);
                } else if (i5 <= 10) {
                    short[] sArr5 = this.f50166;
                    sArr5[34] = (short) (sArr5[34] + 1);
                } else {
                    short[] sArr6 = this.f50166;
                    sArr6[36] = (short) (sArr6[36] + 1);
                }
                if (s3 == 0) {
                    i2 = 138;
                } else {
                    if (s == s3) {
                        i2 = 6;
                    } else {
                        i2 = 7;
                        i3 = 4;
                    }
                    s2 = s;
                    i5 = 0;
                }
                i3 = 3;
                s2 = s;
                i5 = 0;
            }
            s = s3;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m36836(short[] sArr, int i) {
        int i2;
        int i3;
        int i4 = 1;
        short s = sArr[1];
        if (s == 0) {
            i2 = 138;
            i3 = 3;
        } else {
            i2 = 7;
            i3 = 4;
        }
        int i5 = 0;
        int i6 = 0;
        short s2 = -1;
        while (i5 <= i) {
            i5++;
            short s3 = sArr[(i5 * 2) + i4];
            int i7 = i6 + 1;
            if (i7 >= i2 || s != s3) {
                if (i7 < i3) {
                    do {
                        m36849(this.f50166, s);
                        i7--;
                    } while (i7 != 0);
                } else if (s != 0) {
                    if (s != s2) {
                        m36849(this.f50166, s);
                    } else {
                        i6 = i7;
                    }
                    m36849(this.f50166, 16);
                    m36850(i6 - 3, 2);
                } else if (i7 <= 10) {
                    m36849(this.f50166, 17);
                    m36850(i6 - 2, 3);
                } else {
                    m36849(this.f50166, 18);
                    m36850(i6 - 10, 7);
                }
                if (s3 == 0) {
                    i2 = 138;
                } else {
                    if (s == s3) {
                        i2 = 6;
                    } else {
                        i2 = 7;
                        i3 = 4;
                    }
                    i6 = 0;
                    s2 = s;
                }
                i3 = 3;
                i6 = 0;
                s2 = s;
            } else {
                i6 = i7;
            }
            s = s3;
            i4 = 1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36840(int i, int i2, byte[] bArr) {
        System.arraycopy(bArr, i, this.f50154, this.f50180, i2);
        this.f50180 += i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36839(byte b) {
        byte[] bArr = this.f50154;
        int i = this.f50180;
        this.f50180 = i + 1;
        bArr[i] = b;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m36846(int i) {
        m36839((byte) i);
        m36839((byte) (i >>> 8));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m36835(int i) {
        m36839((byte) (i >> 8));
        m36839((byte) i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m36849(short[] sArr, int i) {
        int i2 = i * 2;
        m36850(sArr[i2] & HPKE.aead_EXPORT_ONLY, sArr[i2 + 1] & HPKE.aead_EXPORT_ONLY);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36850(int i, int i2) {
        int i3 = this.f50184;
        if (i3 > 16 - i2) {
            short s = (short) (((short) ((i << i3) & 65535)) | this.f50175);
            this.f50175 = s;
            m36846(s);
            int i4 = this.f50184;
            this.f50175 = (short) (i >>> (16 - i4));
            this.f50184 = (i2 - 16) + i4;
            return;
        }
        this.f50175 = (short) (((short) ((i << i3) & 65535)) | this.f50175);
        this.f50184 = i3 + i2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0094 A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36844(int i, int i2) {
        byte[] bArr = this.f50154;
        int i3 = this.f50153;
        int i4 = this.f50181;
        int i5 = (i4 * 2) + i3;
        bArr[i5] = (byte) (i >>> 8);
        bArr[i5 + 1] = (byte) i;
        this.f50155[i4] = (byte) i2;
        int i6 = i4 + 1;
        this.f50181 = i6;
        if (i == 0) {
            short[] sArr = this.f50159;
            int i7 = i2 * 2;
            sArr[i7] = (short) (sArr[i7] + 1);
        } else {
            this.f50186++;
            int i8 = i - 1;
            short[] sArr2 = this.f50159;
            int i9 = (C20338.f65869[i2] + 257) * 2;
            sArr2[i9] = (short) (sArr2[i9] + 1);
            short[] sArr3 = this.f50141;
            byte[] bArr2 = C20338.f65867;
            int i10 = (i8 < 256 ? bArr2[i8] : bArr2[(i8 >>> 7) + 256]) * 2;
            sArr3[i10] = (short) (sArr3[i10] + 1);
        }
        if ((i6 & 8191) == 0 && this.f50182 > 2) {
            int iM1692 = i6 * 8;
            int i11 = this.f50165 - this.f50179;
            for (int i12 = 0; i12 < 30; i12++) {
                iM1692 = C0252.m1692(C20338.f65870[i12], 5, this.f50141[i12 * 2], iM1692);
            }
            int i13 = iM1692 >>> 3;
            if (this.f50186 >= this.f50181 / 2 || i13 >= i11 / 2) {
                if (this.f50181 == this.f50157 - 1) {
                    return false;
                }
            }
        } else if (this.f50181 == this.f50157 - 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36843(short[] sArr, short[] sArr2) {
        if (this.f50181 != 0) {
            int i = 0;
            do {
                byte[] bArr = this.f50154;
                int i2 = (i * 2) + this.f50153;
                int i3 = (bArr[i2 + 1] & 255) | ((bArr[i2] << 8) & 65280);
                int i4 = this.f50155[i] & 255;
                i++;
                if (i3 == 0) {
                    m36849(sArr, i4);
                } else {
                    byte b = C20338.f65869[i4];
                    m36849(sArr, b + 257);
                    int i5 = C20338.f65873[b];
                    if (i5 != 0) {
                        m36850(i4 - C20338.f65866[b], i5);
                    }
                    int i6 = i3 - 1;
                    byte[] bArr2 = C20338.f65867;
                    byte b2 = i6 < 256 ? bArr2[i6] : bArr2[(i6 >>> 7) + 256];
                    m36849(sArr2, b2);
                    int i7 = C20338.f65870[b2];
                    if (i7 != 0) {
                        m36850(i6 - C20338.f65872[b2], i7);
                    }
                }
            } while (i < this.f50181);
        }
        m36849(sArr, 256);
        this.f50174 = sArr[513];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36838() {
        int i = this.f50184;
        if (i == 16) {
            m36846(this.f50175);
            this.f50175 = (short) 0;
            this.f50184 = 0;
        } else if (i >= 8) {
            m36839((byte) this.f50175);
            this.f50175 = (short) (this.f50175 >>> 8);
            this.f50184 -= 8;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36841(boolean z) {
        int i;
        int i2;
        int i3;
        int i4 = this.f50179;
        int i5 = i4 >= 0 ? i4 : -1;
        int i6 = this.f50165 - i4;
        C20338 c20338 = this.f50162;
        C20338 c20339 = this.f50190;
        int i7 = this.f50182;
        byte[] bArr = C20338.f65871;
        if (i7 > 0) {
            if (this.f50191 == 2) {
                int i8 = 0;
                int i9 = 0;
                while (i8 < 7) {
                    i9 += this.f50159[i8 * 2];
                    i8++;
                }
                int i10 = 0;
                while (i8 < 128) {
                    i10 += this.f50159[i8 * 2];
                    i8++;
                }
                while (i8 < 256) {
                    i9 += this.f50159[i8 * 2];
                    i8++;
                }
                this.f50191 = (byte) (i9 > (i10 >>> 2) ? 0 : 1);
            }
            c20339.m45904(this);
            c20338.m45904(this);
            m36851(this.f50159, c20339.f65876);
            m36851(this.f50141, c20338.f65876);
            this.f50177.m45904(this);
            i2 = 18;
            while (i2 >= 3 && this.f50166[(bArr[i2] * 2) + 1] == 0) {
                i2--;
            }
            int i11 = ((i2 + 1) * 3) + 14 + this.f50167;
            this.f50167 = i11;
            i = (i11 + 10) >>> 3;
            i3 = (this.f50146 + 10) >>> 3;
            if (i3 <= i) {
                i = i3;
            }
        } else {
            i = i6 + 5;
            i2 = 0;
            i3 = i;
        }
        if (i6 + 4 <= i && i5 != -1) {
            m36850(z ? 1 : 0, 3);
            int i12 = this.f50184;
            if (i12 > 8) {
                m36846(this.f50175);
            } else if (i12 > 0) {
                m36839((byte) this.f50175);
            }
            this.f50175 = (short) 0;
            this.f50184 = 0;
            this.f50174 = 8;
            m36846((short) i6);
            m36846((short) (~i6));
            m36840(i5, i6, this.f50140);
        } else if (i3 == i) {
            m36850((z ? 1 : 0) + 2, 3);
            m36843(C16105.f52079, C16105.f52080);
        } else {
            m36850((z ? 1 : 0) + 4, 3);
            int i13 = c20339.f65876;
            int i14 = c20338.f65876;
            int i15 = i2 + 1;
            m36850(i13 - 256, 5);
            m36850(i14, 5);
            m36850(i2 - 3, 4);
            for (int i16 = 0; i16 < i15; i16++) {
                m36850(this.f50166[(bArr[i16] * 2) + 1], 3);
            }
            m36836(this.f50159, i13);
            m36836(this.f50141, i14);
            m36843(this.f50159, this.f50141);
        }
        m36845();
        if (z) {
            int i17 = this.f50184;
            if (i17 > 8) {
                m36846(this.f50175);
            } else if (i17 > 0) {
                m36839((byte) this.f50175);
            }
            this.f50175 = (short) 0;
            this.f50184 = 0;
        }
        this.f50179 = this.f50165;
        this.f50171.m2758();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m36834() {
        int i;
        int i2;
        C21749 c21749 = this.f50171;
        do {
            int i3 = this.f50169;
            int i4 = this.f50183;
            int i5 = this.f50165;
            int i6 = (i3 - i4) - i5;
            int i7 = 0;
            if (i6 == 0 && i5 == 0 && i4 == 0) {
                i6 = this.f50189;
            } else if (i6 == -1) {
                i6--;
            } else {
                int i8 = this.f50189;
                if (i5 >= (i8 + i8) - 262) {
                    byte[] bArr = this.f50140;
                    System.arraycopy(bArr, i8, bArr, 0, i8);
                    int i9 = this.f50156;
                    int i10 = this.f50189;
                    this.f50156 = i9 - i10;
                    this.f50165 -= i10;
                    this.f50179 -= i10;
                    int i11 = this.f50143;
                    int i12 = i11;
                    do {
                        short[] sArr = this.f50151;
                        i11--;
                        int i13 = sArr[i11] & HPKE.aead_EXPORT_ONLY;
                        i = this.f50189;
                        sArr[i11] = i13 >= i ? (short) (i13 - i) : (short) 0;
                        i12--;
                    } while (i12 != 0);
                    int i14 = i;
                    do {
                        short[] sArr2 = this.f50173;
                        i--;
                        int i15 = sArr2[i] & HPKE.aead_EXPORT_ONLY;
                        i2 = this.f50189;
                        sArr2[i] = i15 >= i2 ? (short) (i15 - i2) : (short) 0;
                        i14--;
                    } while (i14 != 0);
                    i6 += i2;
                }
            }
            int i16 = c21749.f2543;
            if (i16 == 0) {
                return;
            }
            byte[] bArr2 = this.f50140;
            int i17 = this.f50165 + this.f50183;
            if (i16 <= i6) {
                i6 = i16;
            }
            if (i6 != 0) {
                c21749.f2543 = i16 - i6;
                if (c21749.f2536.f50148 != 0) {
                    c21749.f2538.update(c21749.f2535, c21749.f2542, i6);
                }
                System.arraycopy(c21749.f2535, c21749.f2542, bArr2, i17, i6);
                c21749.f2542 += i6;
                c21749.f2546 += (long) i6;
                i7 = i6;
            }
            int i18 = this.f50183 + i7;
            this.f50183 = i18;
            if (i18 >= 3) {
                byte[] bArr3 = this.f50140;
                int i19 = this.f50165;
                int i20 = bArr3[i19] & 255;
                this.f50147 = i20;
                this.f50147 = ((bArr3[i19 + 1] & 255) ^ (i20 << this.f50164)) & this.f50170;
            }
            if (i18 >= 262) {
                return;
            }
        } while (c21749.f2543 != 0);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m36848(int i) {
        byte b;
        int i2;
        byte[] bArr;
        int i3;
        int i4 = this.f50176;
        int i5 = this.f50165;
        int i6 = this.f50142;
        int i7 = this.f50189 - 262;
        int i8 = i5 > i7 ? i5 - i7 : 0;
        int i9 = this.f50178;
        int i10 = this.f50152;
        int i11 = i5 + 258;
        byte[] bArr2 = this.f50140;
        int i12 = i5 + i6;
        byte b2 = bArr2[i12 - 1];
        byte b3 = bArr2[i12];
        if (i6 >= this.f50149) {
            i4 >>= 2;
        }
        int i13 = this.f50183;
        if (i9 > i13) {
            i9 = i13;
        }
        byte b4 = b3;
        int i14 = i6;
        int i15 = i4;
        int i16 = i;
        while (true) {
            byte[] bArr3 = this.f50140;
            int i17 = i16 + i14;
            if (bArr3[i17] == b4 && bArr3[i17 - 1] == b2 && bArr3[i16] == bArr3[i5] && bArr3[i16 + 1] == bArr3[i5 + 1]) {
                int i18 = i5 + 2;
                int i19 = i16 + 2;
                while (true) {
                    bArr = this.f50140;
                    i3 = i18 + 1;
                    b = b4;
                    if (bArr[i3] != bArr[i19 + 1]) {
                        break;
                    }
                    i3 = i18 + 2;
                    if (bArr[i3] != bArr[i19 + 2]) {
                        break;
                    }
                    i3 = i18 + 3;
                    if (bArr[i3] != bArr[i19 + 3]) {
                        break;
                    }
                    i3 = i18 + 4;
                    if (bArr[i3] != bArr[i19 + 4]) {
                        break;
                    }
                    i3 = i18 + 5;
                    if (bArr[i3] != bArr[i19 + 5]) {
                        break;
                    }
                    i3 = i18 + 6;
                    if (bArr[i3] != bArr[i19 + 6]) {
                        break;
                    }
                    i3 = i18 + 7;
                    if (bArr[i3] != bArr[i19 + 7]) {
                        break;
                    }
                    i18 += 8;
                    i19 += 8;
                    if (bArr[i18] != bArr[i19] || i18 >= i11) {
                        i3 = i18;
                        break;
                    }
                    b4 = b;
                }
                i2 = 258 - (i11 - i3);
                if (i2 > i14) {
                    this.f50156 = i16;
                    if (i2 >= i9) {
                        break;
                    }
                    int i20 = i5 + i2;
                    b2 = bArr[i20 - 1];
                    b4 = bArr[i20];
                    i14 = i2;
                }
                i16 = this.f50173[i16 & i10] & HPKE.aead_EXPORT_ONLY;
                if (i16 > i8 || (i15 = i15 - 1) == 0) {
                    i2 = i14;
                    break;
                }
            } else {
                b = b4;
            }
            b4 = b;
            i16 = this.f50173[i16 & i10] & HPKE.aead_EXPORT_ONLY;
            if (i16 > i8) {
            }
            i2 = i14;
            break;
        }
        int i21 = this.f50183;
        return i2 <= i21 ? i2 : i21;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m36837(int i) {
        C21749 c21749 = this.f50171;
        c21749.f2545 = null;
        if (i == -1) {
            i = 6;
        }
        if (i < 0 || i > 9) {
            return -2;
        }
        c21749.f2536 = this;
        this.f50148 = 1;
        this.f50144 = 15;
        this.f50189 = 32768;
        this.f50152 = EnumC23529.f76192;
        this.f50143 = 32768;
        this.f50170 = EnumC23529.f76192;
        this.f50164 = 5;
        this.f50140 = new byte[65536];
        this.f50173 = new short[32768];
        this.f50151 = new short[32768];
        this.f50157 = 16384;
        this.f50154 = new byte[49152];
        this.f50163 = 49152;
        this.f50153 = 16384;
        this.f50155 = new byte[16384];
        this.f50182 = i;
        c21749.f2544 = 0L;
        c21749.f2546 = 0L;
        c21749.f2545 = null;
        this.f50180 = 0;
        this.f50192 = 0;
        this.f50150 = 42;
        c21749.f2538.reset();
        this.f50187 = 0;
        C20338 c20338 = this.f50190;
        c20338.f65874 = this.f50159;
        c20338.f65875 = C16105.f52078;
        C20338 c20339 = this.f50162;
        c20339.f65874 = this.f50141;
        c20339.f65875 = C16105.f52077;
        C20338 c203310 = this.f50177;
        c203310.f65874 = this.f50166;
        c203310.f65875 = C16105.f52081;
        this.f50175 = (short) 0;
        this.f50184 = 0;
        this.f50174 = 8;
        m36845();
        this.f50169 = this.f50189 * 2;
        this.f50151[this.f50143 - 1] = 0;
        for (int i2 = 0; i2 < this.f50143 - 1; i2++) {
            this.f50151[i2] = 0;
        }
        C23161 c23161 = f50135[this.f50182];
        this.f50185 = c23161.f75187;
        this.f50149 = c23161.f75191;
        this.f50178 = c23161.f75189;
        this.f50176 = c23161.f75190;
        this.f50165 = 0;
        this.f50179 = 0;
        this.f50183 = 0;
        this.f50142 = 2;
        this.f50161 = 2;
        this.f50158 = 0;
        this.f50147 = 0;
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0196  */
    /* JADX WARN: Code duplicated, block: B:106:0x019b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0260  */
    /* JADX WARN: Code duplicated, block: B:138:0x0264  */
    /* JADX WARN: Code duplicated, block: B:140:0x0273  */
    /* JADX WARN: Code duplicated, block: B:144:0x0286  */
    /* JADX WARN: Code duplicated, block: B:154:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:164:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:171:0x034d  */
    /* JADX WARN: Code duplicated, block: B:172:0x036b  */
    /* JADX WARN: Code duplicated, block: B:188:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:189:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:192:0x03be  */
    /* JADX WARN: Code duplicated, block: B:195:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:224:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0383 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x03d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x0399 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m36847() {
        int i;
        int i2;
        int i3;
        byte b;
        int i4;
        boolean zM36844;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int iM36848;
        C18927 c18927;
        int i11;
        String[] strArr = f50136;
        C21749 c21749 = this.f50171;
        if (c21749.f2537 == null || ((c21749.f2535 == null && c21749.f2543 != 0) || (i = this.f50150) == 666)) {
            c21749.f2545 = strArr[4];
            return -2;
        }
        if (c21749.f2541 == 0) {
            c21749.f2545 = strArr[7];
            return -5;
        }
        int i12 = this.f50187;
        this.f50187 = 1;
        if (i == 42) {
            if (this.f50148 == 2) {
                synchronized (this) {
                    if (this.f50145 == null) {
                        this.f50145 = new C18927();
                    }
                    c18927 = this.f50145;
                }
                int i13 = c18927.f61243 != null ? 4 : 0;
                if (c18927.f61242 != null) {
                    i13 |= 8;
                }
                if (c18927.f61241 != null) {
                    i13 |= 16;
                }
                int i14 = this.f50182;
                if (i14 == 1) {
                    i11 = 4;
                } else {
                    i11 = i14 == 9 ? 2 : 0;
                }
                m36846(-29921);
                m36839((byte) 8);
                m36839((byte) i13);
                m36839((byte) c18927.f61239);
                m36839((byte) (c18927.f61239 >> 8));
                m36839((byte) (c18927.f61239 >> 16));
                m36839((byte) (c18927.f61239 >> 24));
                m36839((byte) i11);
                m36839((byte) c18927.f61240);
                byte[] bArr = c18927.f61243;
                if (bArr != null) {
                    m36839((byte) bArr.length);
                    m36839((byte) (c18927.f61243.length >> 8));
                    byte[] bArr2 = c18927.f61243;
                    m36840(0, bArr2.length, bArr2);
                }
                byte[] bArr3 = c18927.f61242;
                if (bArr3 != null) {
                    m36840(0, bArr3.length, bArr3);
                    m36839((byte) 0);
                }
                byte[] bArr4 = c18927.f61241;
                if (bArr4 != null) {
                    m36840(0, bArr4.length, bArr4);
                    m36839((byte) 0);
                }
                this.f50150 = UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                c21749.f2538.reset();
            } else {
                int i15 = (((this.f50144 - 8) << 4) + 8) << 8;
                int i16 = ((this.f50182 - 1) & 255) >> 1;
                if (i16 > 3) {
                    i16 = 3;
                }
                int i17 = i15 | (i16 << 6);
                if (this.f50165 != 0) {
                    i17 |= 32;
                }
                this.f50150 = UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                m36835((31 - (i17 % 31)) + i17);
                if (this.f50165 != 0) {
                    long value = c21749.f2538.getValue();
                    m36835((int) (value >>> 16));
                    m36835((int) (65535 & value));
                }
                c21749.f2538.reset();
            }
        }
        if (this.f50180 != 0) {
            c21749.m2758();
            if (c21749.f2541 == 0) {
                this.f50187 = -1;
                return 0;
            }
        } else if (c21749.f2543 == 0 && 1 <= i12) {
            c21749.f2545 = strArr[7];
            return -5;
        }
        int i18 = this.f50150;
        if (i18 == 666 && c21749.f2543 != 0) {
            c21749.f2545 = strArr[7];
            return -5;
        }
        if (c21749.f2543 != 0 || this.f50183 != 0 || i18 != 666) {
            int i19 = f50135[this.f50182].f75188;
            int i20 = 5;
            short s = HPKE.aead_EXPORT_ONLY;
            if (i19 == 0) {
                int i21 = this.f50163 - 5;
                int i22 = 65535 > i21 ? i21 : 65535;
                while (true) {
                    if (this.f50183 <= 1) {
                        m36834();
                        if (this.f50183 == 0) {
                            m36841(false);
                            if (c21749.f2541 != 0) {
                                b = 1;
                            }
                        } else {
                            i2 = this.f50165 + this.f50183;
                            this.f50165 = i2;
                            this.f50183 = 0;
                            i3 = this.f50179 + i22;
                            if (i2 != 0 || i2 >= i3) {
                                this.f50183 = i2 - i3;
                                this.f50165 = i3;
                                m36841(false);
                                if (c21749.f2541 != 0) {
                                    if (this.f50165 - this.f50179 >= this.f50189 - 262) {
                                        m36841(false);
                                        if (c21749.f2541 == 0) {
                                        }
                                    }
                                }
                            } else if (this.f50165 - this.f50179 >= this.f50189 - 262) {
                                m36841(false);
                                if (c21749.f2541 == 0) {
                                }
                            }
                        }
                    } else {
                        i2 = this.f50165 + this.f50183;
                        this.f50165 = i2;
                        this.f50183 = 0;
                        i3 = this.f50179 + i22;
                        if (i2 != 0) {
                            this.f50183 = i2 - i3;
                            this.f50165 = i3;
                            m36841(false);
                            if (c21749.f2541 != 0) {
                                if (this.f50165 - this.f50179 >= this.f50189 - 262) {
                                    m36841(false);
                                    if (c21749.f2541 == 0) {
                                    }
                                }
                            }
                        } else {
                            this.f50183 = i2 - i3;
                            this.f50165 = i3;
                            m36841(false);
                            if (c21749.f2541 != 0) {
                                if (this.f50165 - this.f50179 >= this.f50189 - 262) {
                                    m36841(false);
                                    if (c21749.f2541 == 0) {
                                    }
                                }
                            }
                        }
                    }
                    b = 0;
                }
            } else if (i19 == 1) {
                int i23 = 0;
                while (true) {
                    if (this.f50183 < 262) {
                        m36834();
                        if (this.f50183 == 0) {
                            m36841(false);
                            if (c21749.f2541 != 0) {
                                b = 1;
                            }
                        } else {
                            if (this.f50183 >= 3) {
                                int i24 = this.f50147 << this.f50164;
                                byte[] bArr5 = this.f50140;
                                int i25 = this.f50165;
                                int i26 = (i24 ^ (bArr5[i25 + 2] & 255)) & this.f50170;
                                this.f50147 = i26;
                                short[] sArr = this.f50151;
                                short s2 = sArr[i26];
                                int i27 = s2 & HPKE.aead_EXPORT_ONLY;
                                this.f50173[this.f50152 & i25] = s2;
                                sArr[i26] = (short) i25;
                                i23 = i27;
                            }
                            if (i23 != 0 && ((this.f50165 - i23) & 65535) <= this.f50189 - 262) {
                                this.f50161 = m36848(i23);
                            }
                            i4 = this.f50161;
                            if (i4 >= 3) {
                                zM36844 = m36844(this.f50165 - this.f50156, i4 - 3);
                                int i28 = this.f50183;
                                i5 = this.f50161;
                                int i29 = i28 - i5;
                                this.f50183 = i29;
                                if (i5 <= this.f50185 || i29 < 3) {
                                    int i30 = this.f50165 + i5;
                                    this.f50165 = i30;
                                    this.f50161 = 0;
                                    byte[] bArr6 = this.f50140;
                                    int i31 = bArr6[i30] & 255;
                                    this.f50147 = i31;
                                    this.f50147 = ((bArr6[i30 + 1] & 255) ^ (i31 << this.f50164)) & this.f50170;
                                } else {
                                    this.f50161 = i5 - 1;
                                    do {
                                        i6 = this.f50165;
                                        int i32 = i6 + 1;
                                        this.f50165 = i32;
                                        int i33 = ((this.f50147 << this.f50164) ^ (this.f50140[i6 + 3] & 255)) & this.f50170;
                                        this.f50147 = i33;
                                        short[] sArr2 = this.f50151;
                                        short s3 = sArr2[i33];
                                        i7 = s3 & HPKE.aead_EXPORT_ONLY;
                                        this.f50173[this.f50152 & i32] = s3;
                                        sArr2[i33] = (short) i32;
                                        i8 = this.f50161 - 1;
                                        this.f50161 = i8;
                                    } while (i8 != 0);
                                    this.f50165 = i6 + 2;
                                    i23 = i7;
                                }
                            } else {
                                zM36844 = m36844(0, this.f50140[this.f50165] & 255);
                                this.f50183--;
                                this.f50165++;
                            }
                            if (zM36844) {
                                m36841(false);
                                if (c21749.f2541 == 0) {
                                }
                            }
                        }
                    } else {
                        if (this.f50183 >= 3) {
                            int i210 = this.f50147 << this.f50164;
                            byte[] bArr7 = this.f50140;
                            int i211 = this.f50165;
                            int i212 = (i210 ^ (bArr7[i211 + 2] & 255)) & this.f50170;
                            this.f50147 = i212;
                            short[] sArr3 = this.f50151;
                            short s4 = sArr3[i212];
                            int i213 = s4 & HPKE.aead_EXPORT_ONLY;
                            this.f50173[this.f50152 & i211] = s4;
                            sArr3[i212] = (short) i211;
                            i23 = i213;
                        }
                        if (i23 != 0) {
                            this.f50161 = m36848(i23);
                        }
                        i4 = this.f50161;
                        if (i4 >= 3) {
                            zM36844 = m36844(this.f50165 - this.f50156, i4 - 3);
                            int i214 = this.f50183;
                            i5 = this.f50161;
                            int i215 = i214 - i5;
                            this.f50183 = i215;
                            if (i5 <= this.f50185) {
                                int i34 = this.f50165 + i5;
                                this.f50165 = i34;
                                this.f50161 = 0;
                                byte[] bArr8 = this.f50140;
                                int i35 = bArr8[i34] & 255;
                                this.f50147 = i35;
                                this.f50147 = ((bArr8[i34 + 1] & 255) ^ (i35 << this.f50164)) & this.f50170;
                            } else {
                                int i36 = this.f50165 + i5;
                                this.f50165 = i36;
                                this.f50161 = 0;
                                byte[] bArr9 = this.f50140;
                                int i37 = bArr9[i36] & 255;
                                this.f50147 = i37;
                                this.f50147 = ((bArr9[i36 + 1] & 255) ^ (i37 << this.f50164)) & this.f50170;
                            }
                        } else {
                            zM36844 = m36844(0, this.f50140[this.f50165] & 255);
                            this.f50183--;
                            this.f50165++;
                        }
                        if (zM36844) {
                            m36841(false);
                            if (c21749.f2541 == 0) {
                            }
                        }
                    }
                    b = 0;
                }
            } else if (i19 != 2) {
                b = -1;
            } else {
                int i38 = 0;
                while (true) {
                    if (this.f50183 < 262) {
                        m36834();
                        if (this.f50183 == 0) {
                            if (this.f50158 != 0) {
                                m36844(0, this.f50140[this.f50165 - 1] & 255);
                                this.f50158 = 0;
                            }
                            m36841(false);
                            if (c21749.f2541 != 0) {
                                b = 1;
                            }
                        } else {
                            if (this.f50183 >= 3) {
                                int i39 = this.f50147 << this.f50164;
                                byte[] bArr10 = this.f50140;
                                int i40 = this.f50165;
                                int i41 = (i39 ^ (bArr10[i40 + 2] & 255)) & this.f50170;
                                this.f50147 = i41;
                                short[] sArr4 = this.f50151;
                                short s5 = sArr4[i41];
                                this.f50173[this.f50152 & i40] = s5;
                                sArr4[i41] = (short) i40;
                                i38 = s5 & s;
                            }
                            int i42 = this.f50161;
                            this.f50142 = i42;
                            this.f50160 = this.f50156;
                            this.f50161 = 2;
                            if (i38 != 0 && i42 < this.f50185 && ((this.f50165 - i38) & s) <= this.f50189 - 262) {
                                iM36848 = m36848(i38);
                                this.f50161 = iM36848;
                                if (iM36848 <= i20 && iM36848 == 3 && this.f50165 - this.f50156 > 4096) {
                                    this.f50161 = 2;
                                }
                            }
                            i9 = this.f50142;
                            if (i9 >= 3 || this.f50161 > i9) {
                                if (this.f50158 != 0) {
                                    if (m36844(0, this.f50140[this.f50165 - 1] & 255)) {
                                        m36841(false);
                                    }
                                    this.f50165++;
                                    this.f50183--;
                                    if (c21749.f2541 == 0) {
                                    }
                                } else {
                                    this.f50158 = 1;
                                    this.f50165++;
                                    this.f50183--;
                                }
                                i20 = 5;
                                s = HPKE.aead_EXPORT_ONLY;
                            } else {
                                int i43 = this.f50165;
                                int i44 = (this.f50183 + i43) - 3;
                                boolean zM36845 = m36844((i43 - 1) - this.f50160, i9 - 3);
                                int i45 = this.f50183;
                                int i46 = this.f50142;
                                this.f50183 = i45 - (i46 - 1);
                                this.f50142 = i46 - 2;
                                while (true) {
                                    i10 = this.f50165;
                                    int i47 = i10 + 1;
                                    this.f50165 = i47;
                                    if (i47 <= i44) {
                                        int i48 = ((this.f50147 << this.f50164) ^ (this.f50140[i10 + 3] & 255)) & this.f50170;
                                        this.f50147 = i48;
                                        short[] sArr5 = this.f50151;
                                        short s6 = sArr5[i48];
                                        this.f50173[this.f50152 & i47] = s6;
                                        sArr5[i48] = (short) i47;
                                        i38 = s6 & s;
                                    }
                                    int i49 = this.f50142 - 1;
                                    this.f50142 = i49;
                                    if (i49 == 0) {
                                        break;
                                    }
                                    s = HPKE.aead_EXPORT_ONLY;
                                }
                                this.f50158 = 0;
                                this.f50161 = 2;
                                this.f50165 = i10 + 2;
                                if (zM36845) {
                                    m36841(false);
                                    if (c21749.f2541 == 0) {
                                    }
                                } else {
                                    continue;
                                }
                                i20 = 5;
                                s = HPKE.aead_EXPORT_ONLY;
                            }
                        }
                    } else {
                        if (this.f50183 >= 3) {
                            int i310 = this.f50147 << this.f50164;
                            byte[] bArr11 = this.f50140;
                            int i410 = this.f50165;
                            int i411 = (i310 ^ (bArr11[i410 + 2] & 255)) & this.f50170;
                            this.f50147 = i411;
                            short[] sArr6 = this.f50151;
                            short s7 = sArr6[i411];
                            this.f50173[this.f50152 & i410] = s7;
                            sArr6[i411] = (short) i410;
                            i38 = s7 & s;
                        }
                        int i412 = this.f50161;
                        this.f50142 = i412;
                        this.f50160 = this.f50156;
                        this.f50161 = 2;
                        if (i38 != 0) {
                            iM36848 = m36848(i38);
                            this.f50161 = iM36848;
                            if (iM36848 <= i20) {
                                this.f50161 = 2;
                            }
                        }
                        i9 = this.f50142;
                        if (i9 >= 3) {
                            if (this.f50158 != 0) {
                                if (m36844(0, this.f50140[this.f50165 - 1] & 255)) {
                                    m36841(false);
                                }
                                this.f50165++;
                                this.f50183--;
                                if (c21749.f2541 == 0) {
                                }
                            } else {
                                this.f50158 = 1;
                                this.f50165++;
                                this.f50183--;
                            }
                            i20 = 5;
                            s = HPKE.aead_EXPORT_ONLY;
                        } else {
                            if (this.f50158 != 0) {
                                if (m36844(0, this.f50140[this.f50165 - 1] & 255)) {
                                    m36841(false);
                                }
                                this.f50165++;
                                this.f50183--;
                                if (c21749.f2541 == 0) {
                                }
                            } else {
                                this.f50158 = 1;
                                this.f50165++;
                                this.f50183--;
                            }
                            i20 = 5;
                            s = HPKE.aead_EXPORT_ONLY;
                        }
                    }
                    b = 0;
                }
            }
            if (b == 2 || b == 3) {
                this.f50150 = 666;
            }
            if (b == 0 || b == 2) {
                if (c21749.f2541 == 0) {
                    this.f50187 = -1;
                }
            } else if (b == 1) {
                m36850(2, 3);
                short[] sArr7 = C16105.f52079;
                m36849(sArr7, 256);
                m36838();
                if ((this.f50174 + 11) - this.f50184 < 9) {
                    m36850(2, 3);
                    m36849(sArr7, 256);
                    m36838();
                }
                this.f50174 = 7;
                c21749.m2758();
                if (c21749.f2541 == 0) {
                    this.f50187 = -1;
                    return 0;
                }
            }
        }
        return 0;
    }

    public final Object clone() {
        C15400 c15400 = (C15400) super.clone();
        byte[] bArr = c15400.f50154;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        c15400.f50154 = bArr2;
        byte[] bArr3 = c15400.f50155;
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[length2];
        System.arraycopy(bArr3, 0, bArr4, 0, length2);
        c15400.f50155 = bArr4;
        byte[] bArr5 = c15400.f50140;
        int length3 = bArr5.length;
        byte[] bArr6 = new byte[length3];
        System.arraycopy(bArr5, 0, bArr6, 0, length3);
        c15400.f50140 = bArr6;
        c15400.f50173 = m36833(c15400.f50173);
        c15400.f50151 = m36833(c15400.f50151);
        c15400.f50159 = m36833(c15400.f50159);
        c15400.f50141 = m36833(c15400.f50141);
        c15400.f50166 = m36833(c15400.f50166);
        c15400.f50137 = m36833(c15400.f50137);
        c15400.f50138 = m36833(c15400.f50138);
        int[] iArr = c15400.f50188;
        int length4 = iArr.length;
        int[] iArr2 = new int[length4];
        System.arraycopy(iArr, 0, iArr2, 0, length4);
        c15400.f50188 = iArr2;
        byte[] bArr7 = c15400.f50172;
        int length5 = bArr7.length;
        byte[] bArr8 = new byte[length5];
        System.arraycopy(bArr7, 0, bArr8, 0, length5);
        c15400.f50172 = bArr8;
        c15400.f50190.f65874 = c15400.f50159;
        c15400.f50162.f65874 = c15400.f50141;
        c15400.f50177.f65874 = c15400.f50166;
        C18927 c18927 = c15400.f50145;
        if (c18927 != null) {
            c15400.f50145 = (C18927) c18927.clone();
        }
        return c15400;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static short[] m36833(short[] sArr) {
        int length = sArr.length;
        short[] sArr2 = new short[length];
        System.arraycopy(sArr, 0, sArr2, 0, length);
        return sArr2;
    }
}
