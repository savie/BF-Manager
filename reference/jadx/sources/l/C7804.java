package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.۟ۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1DD */
/* JADX INFO: loaded from: classes3.dex */
public final class C7804 implements Cloneable {

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public static final C0346[] f25948 = {new C0346(0, 0, 0, 0, 0), new C0346(4, 4, 8, 4, 1), new C0346(4, 5, 16, 8, 1), new C0346(4, 6, 32, 32, 1), new C0346(4, 4, 16, 16, 2), new C0346(8, 16, 32, 32, 2), new C0346(8, 16, 128, 128, 2), new C0346(8, 32, 128, 256, 2), new C0346(32, 128, 258, 1024, 2), new C0346(32, 258, 258, 4096, 2)};

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public static final String[] f25949 = {"need dictionary", "stream end", "", "file error", "stream error", "data error", "insufficient memory", "buffer error", "incompatible version", ""};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C10524 f25950;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f25951;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C10524 f25952;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f25953;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public int f25954;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public int f25955;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f25956;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public short[] f25957;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public int f25958;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public int f25959;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f25960;

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public int f25961;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f25962;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public int f25963;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public int f25964;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public short[] f25965;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public int f25966;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public short[] f25967;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public int f25968;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public short[] f25969;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public int f25970;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public byte f25971;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f25972;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f25973;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public byte[] f25974;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f25975;

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public int f25976;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public byte[] f25977;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f25978;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public int f25979;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public byte[] f25980;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C1092 f25981;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public int f25982;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public short f25983;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f25984;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public int[] f25985;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public int f25986;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f25987;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f25988;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f25989;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public short[] f25990;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public short[] f25991;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f25992;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public int f25993;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public short[] f25994;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public int f25995;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f25996;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f25997;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f25998;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f25999;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public C18991 f26000;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f26001;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public int f26002;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f26003;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public int f26004;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public C10524 f26005;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m21272() {
        for (int i = 0; i < 286; i++) {
            this.f25965[i * 2] = 0;
        }
        for (int i2 = 0; i2 < 30; i2++) {
            this.f25969[i2 * 2] = 0;
        }
        for (int i3 = 0; i3 < 19; i3++) {
            this.f25967[i3 * 2] = 0;
        }
        this.f25965[512] = 1;
        this.f25982 = 0;
        this.f25968 = 0;
        this.f25959 = 0;
        this.f25987 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21266(short[] sArr, int i) {
        int i2 = this.f25985[i];
        int i3 = i << 1;
        while (true) {
            int i4 = this.f25979;
            if (i3 > i4) {
                break;
            }
            if (i3 < i4) {
                int[] iArr = this.f25985;
                int i5 = i3 + 1;
                int i6 = iArr[i5];
                int i7 = iArr[i3];
                byte[] bArr = this.f25956;
                short s = sArr[i6 * 2];
                short s2 = sArr[i7 * 2];
                if (s < s2 || (s == s2 && bArr[i6] <= bArr[i7])) {
                    i3 = i5;
                }
            }
            int[] iArr2 = this.f25985;
            int i8 = iArr2[i3];
            byte[] bArr2 = this.f25956;
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
        this.f25985[i] = i2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m21276(short[] sArr, int i) {
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
        sArr[C12669.m31441(i, 1, 2, 1)] = -1;
        int i4 = 0;
        int i5 = 0;
        while (i4 <= i) {
            i4++;
            short s3 = sArr[(i4 * 2) + 1];
            i5++;
            if (i5 >= i2 || s != s3) {
                if (i5 < i3) {
                    short[] sArr2 = this.f25967;
                    int i6 = s * 2;
                    sArr2[i6] = (short) (sArr2[i6] + ((short) i5));
                } else if (s != 0) {
                    if (s != s2) {
                        short[] sArr3 = this.f25967;
                        int i7 = s * 2;
                        sArr3[i7] = (short) (sArr3[i7] + 1);
                    }
                    short[] sArr4 = this.f25967;
                    sArr4[32] = (short) (sArr4[32] + 1);
                } else if (i5 <= 10) {
                    short[] sArr5 = this.f25967;
                    sArr5[34] = (short) (sArr5[34] + 1);
                } else {
                    short[] sArr6 = this.f25967;
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

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m21278(short[] sArr, int i) {
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
                        m21271(this.f25967, s);
                        i7--;
                    } while (i7 != 0);
                } else if (s != 0) {
                    if (s != s2) {
                        m21271(this.f25967, s);
                    } else {
                        i6 = i7;
                    }
                    m21271(this.f25967, 16);
                    m21275(i6 - 3, 2);
                } else if (i7 <= 10) {
                    m21271(this.f25967, 17);
                    m21275(i6 - 2, 3);
                } else {
                    m21271(this.f25967, 18);
                    m21275(i6 - 10, 7);
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
    public final void m21264(int i, int i2, byte[] bArr) {
        System.arraycopy(bArr, i, this.f25974, this.f25993, i2);
        this.f25993 += i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21263(byte b) {
        byte[] bArr = this.f25974;
        int i = this.f25993;
        this.f25993 = i + 1;
        bArr[i] = b;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m21273(int i) {
        m21263((byte) i);
        m21263((byte) (i >>> 8));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m21277(int i) {
        m21263((byte) (i >> 8));
        m21263((byte) i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m21271(short[] sArr, int i) {
        int i2 = i * 2;
        m21275(sArr[i2] & HPKE.aead_EXPORT_ONLY, sArr[i2 + 1] & HPKE.aead_EXPORT_ONLY);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m21275(int i, int i2) {
        int i3 = this.f25997;
        if (i3 > 16 - i2) {
            short s = (short) (((short) ((i << i3) & 65535)) | this.f25983);
            this.f25983 = s;
            m21273(s);
            int i4 = this.f25997;
            this.f25983 = (short) (i >>> (16 - i4));
            this.f25997 = (i2 - 16) + i4;
            return;
        }
        this.f25983 = (short) (((short) ((i << i3) & 65535)) | this.f25983);
        this.f25997 = i3 + i2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0094 A[RETURN] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21268(int i, int i2) {
        byte[] bArr = this.f25974;
        int i3 = this.f25973;
        int i4 = this.f25987;
        int i5 = (i4 * 2) + i3;
        bArr[i5] = (byte) (i >>> 8);
        bArr[i5 + 1] = (byte) i;
        this.f25977[i4] = (byte) i2;
        int i6 = i4 + 1;
        this.f25987 = i6;
        if (i == 0) {
            short[] sArr = this.f25965;
            int i7 = i2 * 2;
            sArr[i7] = (short) (sArr[i7] + 1);
        } else {
            this.f25959++;
            int i8 = i - 1;
            short[] sArr2 = this.f25965;
            int i9 = (C10524.f33465[i2] + 257) * 2;
            sArr2[i9] = (short) (sArr2[i9] + 1);
            short[] sArr3 = this.f25969;
            byte[] bArr2 = C10524.f33466;
            int i10 = (i8 < 256 ? bArr2[i8] : bArr2[(i8 >>> 7) + 256]) * 2;
            sArr3[i10] = (short) (sArr3[i10] + 1);
        }
        if ((i6 & 8191) == 0 && this.f26003 > 2) {
            int iM31441 = i6 * 8;
            int i11 = this.f25976 - this.f25992;
            for (int i12 = 0; i12 < 30; i12++) {
                iM31441 = C12669.m31441(C10524.f33462[i12], 5, this.f25969[i12 * 2], iM31441);
            }
            int i13 = iM31441 >>> 3;
            if (this.f25959 >= this.f25987 / 2 || i13 >= i11 / 2) {
                if (this.f25987 == this.f25958 - 1) {
                    return false;
                }
            }
        } else if (this.f25987 == this.f25958 - 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21267(short[] sArr, short[] sArr2) {
        if (this.f25987 != 0) {
            int i = 0;
            do {
                byte[] bArr = this.f25974;
                int i2 = (i * 2) + this.f25973;
                int i3 = (bArr[i2 + 1] & 255) | ((bArr[i2] << 8) & 65280);
                int i4 = this.f25977[i] & 255;
                i++;
                if (i3 == 0) {
                    m21271(sArr, i4);
                } else {
                    byte b = C10524.f33465[i4];
                    m21271(sArr, b + 257);
                    int i5 = C10524.f33467[b];
                    if (i5 != 0) {
                        m21275(i4 - C10524.f33463[b], i5);
                    }
                    int i6 = i3 - 1;
                    byte[] bArr2 = C10524.f33466;
                    byte b2 = i6 < 256 ? bArr2[i6] : bArr2[(i6 >>> 7) + 256];
                    m21271(sArr2, b2);
                    int i7 = C10524.f33462[b2];
                    if (i7 != 0) {
                        m21275(i6 - C10524.f33464[b2], i7);
                    }
                }
            } while (i < this.f25987);
        }
        m21271(sArr, 256);
        this.f25988 = sArr[513];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21262() {
        int i = this.f25997;
        if (i == 16) {
            m21273(this.f25983);
            this.f25983 = (short) 0;
            this.f25997 = 0;
        } else if (i >= 8) {
            m21263((byte) this.f25983);
            this.f25983 = (short) (this.f25983 >>> 8);
            this.f25997 -= 8;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21265(boolean z) {
        int i;
        int i2;
        int i3;
        int i4 = this.f25992;
        int i5 = i4 >= 0 ? i4 : -1;
        int i6 = this.f25976 - i4;
        C10524 c10524 = this.f25952;
        C10524 c10525 = this.f26005;
        int i7 = this.f26003;
        byte[] bArr = C10524.f33461;
        if (i7 > 0) {
            if (this.f25971 == 2) {
                int i8 = 0;
                int i9 = 0;
                while (i8 < 7) {
                    i9 += this.f25965[i8 * 2];
                    i8++;
                }
                int i10 = 0;
                while (i8 < 128) {
                    i10 += this.f25965[i8 * 2];
                    i8++;
                }
                while (i8 < 256) {
                    i9 += this.f25965[i8 * 2];
                    i8++;
                }
                this.f25971 = (byte) (i9 > (i10 >>> 2) ? 0 : 1);
            }
            c10525.m26976(this);
            c10524.m26976(this);
            m21276(this.f25965, c10525.f33470);
            m21276(this.f25969, c10524.f33470);
            this.f25950.m26976(this);
            i2 = 18;
            while (i2 >= 3 && this.f25967[(bArr[i2] * 2) + 1] == 0) {
                i2--;
            }
            int i11 = ((i2 + 1) * 3) + 14 + this.f25968;
            this.f25968 = i11;
            i = (i11 + 10) >>> 3;
            i3 = (this.f25982 + 10) >>> 3;
            if (i3 <= i) {
                i = i3;
            }
        } else {
            i = i6 + 5;
            i2 = 0;
            i3 = i;
        }
        if (i6 + 4 <= i && i5 != -1) {
            m21275(z ? 1 : 0, 3);
            int i12 = this.f25997;
            if (i12 > 8) {
                m21273(this.f25983);
            } else if (i12 > 0) {
                m21263((byte) this.f25983);
            }
            this.f25983 = (short) 0;
            this.f25997 = 0;
            this.f25988 = 8;
            m21273((short) i6);
            m21273((short) (~i6));
            m21264(i5, i6, this.f25980);
        } else if (i3 == i) {
            m21275((z ? 1 : 0) + 2, 3);
            m21267(C21713.f69289, C21713.f69288);
        } else {
            m21275((z ? 1 : 0) + 4, 3);
            int i13 = c10525.f33470;
            int i14 = c10524.f33470;
            int i15 = i2 + 1;
            m21275(i13 - 256, 5);
            m21275(i14, 5);
            m21275(i2 - 3, 4);
            for (int i16 = 0; i16 < i15; i16++) {
                m21275(this.f25967[(bArr[i16] * 2) + 1], 3);
            }
            m21278(this.f25965, i13);
            m21278(this.f25969, i14);
            m21267(this.f25965, this.f25969);
        }
        m21272();
        if (z) {
            int i17 = this.f25997;
            if (i17 > 8) {
                m21273(this.f25983);
            } else if (i17 > 0) {
                m21263((byte) this.f25983);
            }
            this.f25983 = (short) 0;
            this.f25997 = 0;
        }
        this.f25992 = this.f25976;
        this.f26000.m50630();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m21270() {
        int i;
        int i2;
        C18991 c18991 = this.f26000;
        do {
            int i3 = this.f25963;
            int i4 = this.f25996;
            int i5 = this.f25976;
            int i6 = (i3 - i4) - i5;
            int i7 = 0;
            if (i6 == 0 && i5 == 0 && i4 == 0) {
                i6 = this.f25986;
            } else if (i6 == -1) {
                i6--;
            } else {
                int i8 = this.f25986;
                if (i5 >= (i8 + i8) - 262) {
                    byte[] bArr = this.f25980;
                    System.arraycopy(bArr, i8, bArr, 0, i8);
                    int i9 = this.f26004;
                    int i10 = this.f25986;
                    this.f26004 = i9 - i10;
                    this.f25976 -= i10;
                    this.f25992 -= i10;
                    int i11 = this.f26001;
                    int i12 = i11;
                    do {
                        short[] sArr = this.f25994;
                        i11--;
                        int i13 = sArr[i11] & HPKE.aead_EXPORT_ONLY;
                        i = this.f25986;
                        sArr[i11] = i13 >= i ? (short) (i13 - i) : (short) 0;
                        i12--;
                    } while (i12 != 0);
                    int i14 = i;
                    do {
                        short[] sArr2 = this.f25957;
                        i--;
                        int i15 = sArr2[i] & HPKE.aead_EXPORT_ONLY;
                        i2 = this.f25986;
                        sArr2[i] = i15 >= i2 ? (short) (i15 - i2) : (short) 0;
                        i14--;
                    } while (i14 != 0);
                    i6 += i2;
                }
            }
            int i16 = c18991.f72685;
            if (i16 == 0) {
                return;
            }
            byte[] bArr2 = this.f25980;
            int i17 = this.f25976 + this.f25996;
            if (i16 <= i6) {
                i6 = i16;
            }
            if (i6 != 0) {
                c18991.f72685 = i16 - i6;
                if (c18991.f72686.f25955 != 0) {
                    c18991.f72677.update(c18991.f72681, c18991.f72678, i6);
                }
                System.arraycopy(c18991.f72681, c18991.f72678, bArr2, i17, i6);
                c18991.f72678 += i6;
                c18991.f72687 += (long) i6;
                i7 = i6;
            }
            int i18 = this.f25996 + i7;
            this.f25996 = i18;
            if (i18 >= 3) {
                byte[] bArr3 = this.f25980;
                int i19 = this.f25976;
                int i20 = bArr3[i19] & 255;
                this.f25954 = i20;
                this.f25954 = ((bArr3[i19 + 1] & 255) ^ (i20 << this.f25975)) & this.f25999;
            }
            if (i18 >= 262) {
                return;
            }
        } while (c18991.f72685 != 0);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m21269(int i) {
        byte b;
        int i2;
        byte[] bArr;
        int i3;
        int i4 = this.f25984;
        int i5 = this.f25976;
        int i6 = this.f25970;
        int i7 = this.f25986 - 262;
        int i8 = i5 > i7 ? i5 - i7 : 0;
        int i9 = this.f25951;
        int i10 = this.f25995;
        int i11 = i5 + 258;
        byte[] bArr2 = this.f25980;
        int i12 = i5 + i6;
        byte b2 = bArr2[i12 - 1];
        byte b3 = bArr2[i12];
        if (i6 >= this.f25960) {
            i4 >>= 2;
        }
        int i13 = this.f25996;
        if (i9 > i13) {
            i9 = i13;
        }
        byte b4 = b3;
        int i14 = i6;
        int i15 = i4;
        int i16 = i;
        while (true) {
            byte[] bArr3 = this.f25980;
            int i17 = i16 + i14;
            if (bArr3[i17] == b4 && bArr3[i17 - 1] == b2 && bArr3[i16] == bArr3[i5] && bArr3[i16 + 1] == bArr3[i5 + 1]) {
                int i18 = i5 + 2;
                int i19 = i16 + 2;
                while (true) {
                    bArr = this.f25980;
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
                    this.f26004 = i16;
                    if (i2 >= i9) {
                        break;
                    }
                    int i20 = i5 + i2;
                    b2 = bArr[i20 - 1];
                    b4 = bArr[i20];
                    i14 = i2;
                }
                i16 = this.f25957[i16 & i10] & HPKE.aead_EXPORT_ONLY;
                if (i16 > i8 || (i15 = i15 - 1) == 0) {
                    i2 = i14;
                    break;
                }
            } else {
                b = b4;
            }
            b4 = b;
            i16 = this.f25957[i16 & i10] & HPKE.aead_EXPORT_ONLY;
            if (i16 > i8) {
            }
            i2 = i14;
            break;
        }
        int i21 = this.f25996;
        return i2 <= i21 ? i2 : i21;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m21261(int i) {
        C18991 c18991 = this.f26000;
        c18991.f72682 = null;
        if (i == -1) {
            i = 6;
        }
        if (i < 0 || i > 9) {
            return -2;
        }
        c18991.f72686 = this;
        this.f25955 = 1;
        this.f26002 = 15;
        this.f25986 = 32768;
        this.f25995 = EnumC6121.f20881;
        this.f26001 = 32768;
        this.f25999 = EnumC6121.f20881;
        this.f25975 = 5;
        this.f25980 = new byte[65536];
        this.f25957 = new short[32768];
        this.f25994 = new short[32768];
        this.f25958 = 16384;
        this.f25974 = new byte[49152];
        this.f25953 = 49152;
        this.f25973 = 16384;
        this.f25977 = new byte[16384];
        this.f26003 = i;
        c18991.f72683 = 0L;
        c18991.f72687 = 0L;
        c18991.f72682 = null;
        this.f25993 = 0;
        this.f25972 = 0;
        this.f25961 = 42;
        c18991.f72677.reset();
        this.f25989 = 0;
        C10524 c10524 = this.f26005;
        c10524.f33468 = this.f25965;
        c10524.f33469 = C21713.f69287;
        C10524 c10525 = this.f25952;
        c10525.f33468 = this.f25969;
        c10525.f33469 = C21713.f69290;
        C10524 c10526 = this.f25950;
        c10526.f33468 = this.f25967;
        c10526.f33469 = C21713.f69291;
        this.f25983 = (short) 0;
        this.f25997 = 0;
        this.f25988 = 8;
        m21272();
        this.f25963 = this.f25986 * 2;
        this.f25994[this.f26001 - 1] = 0;
        for (int i2 = 0; i2 < this.f26001 - 1; i2++) {
            this.f25994[i2] = 0;
        }
        C0346 c0346 = f25948[this.f26003];
        this.f25998 = c0346.f1843;
        this.f25960 = c0346.f1842;
        this.f25951 = c0346.f1841;
        this.f25984 = c0346.f1840;
        this.f25976 = 0;
        this.f25992 = 0;
        this.f25996 = 0;
        this.f25970 = 2;
        this.f25964 = 2;
        this.f25978 = 0;
        this.f25954 = 0;
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
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m21274() {
        int i;
        int i2;
        int i3;
        byte b;
        int i4;
        boolean zM21268;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int iM21269;
        C1092 c1092;
        int i11;
        String[] strArr = f25949;
        C18991 c18991 = this.f26000;
        if (c18991.f72676 == null || ((c18991.f72681 == null && c18991.f72685 != 0) || (i = this.f25961) == 666)) {
            c18991.f72682 = strArr[4];
            return -2;
        }
        if (c18991.f72679 == 0) {
            c18991.f72682 = strArr[7];
            return -5;
        }
        int i12 = this.f25989;
        this.f25989 = 1;
        if (i == 42) {
            if (this.f25955 == 2) {
                synchronized (this) {
                    if (this.f25981 == null) {
                        this.f25981 = new C1092();
                    }
                    c1092 = this.f25981;
                }
                int i13 = c1092.f3899 != null ? 4 : 0;
                if (c1092.f3895 != null) {
                    i13 |= 8;
                }
                if (c1092.f3897 != null) {
                    i13 |= 16;
                }
                int i14 = this.f26003;
                if (i14 == 1) {
                    i11 = 4;
                } else {
                    i11 = i14 == 9 ? 2 : 0;
                }
                m21273(-29921);
                m21263((byte) 8);
                m21263((byte) i13);
                m21263((byte) c1092.f3898);
                m21263((byte) (c1092.f3898 >> 8));
                m21263((byte) (c1092.f3898 >> 16));
                m21263((byte) (c1092.f3898 >> 24));
                m21263((byte) i11);
                m21263((byte) c1092.f3896);
                byte[] bArr = c1092.f3899;
                if (bArr != null) {
                    m21263((byte) bArr.length);
                    m21263((byte) (c1092.f3899.length >> 8));
                    byte[] bArr2 = c1092.f3899;
                    m21264(0, bArr2.length, bArr2);
                }
                byte[] bArr3 = c1092.f3895;
                if (bArr3 != null) {
                    m21264(0, bArr3.length, bArr3);
                    m21263((byte) 0);
                }
                byte[] bArr4 = c1092.f3897;
                if (bArr4 != null) {
                    m21264(0, bArr4.length, bArr4);
                    m21263((byte) 0);
                }
                this.f25961 = UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                c18991.f72677.reset();
            } else {
                int i15 = (((this.f26002 - 8) << 4) + 8) << 8;
                int i16 = ((this.f26003 - 1) & 255) >> 1;
                if (i16 > 3) {
                    i16 = 3;
                }
                int i17 = i15 | (i16 << 6);
                if (this.f25976 != 0) {
                    i17 |= 32;
                }
                this.f25961 = UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                m21277((31 - (i17 % 31)) + i17);
                if (this.f25976 != 0) {
                    long value = c18991.f72677.getValue();
                    m21277((int) (value >>> 16));
                    m21277((int) (65535 & value));
                }
                c18991.f72677.reset();
            }
        }
        if (this.f25993 != 0) {
            c18991.m50630();
            if (c18991.f72679 == 0) {
                this.f25989 = -1;
                return 0;
            }
        } else if (c18991.f72685 == 0 && 1 <= i12) {
            c18991.f72682 = strArr[7];
            return -5;
        }
        int i18 = this.f25961;
        if (i18 == 666 && c18991.f72685 != 0) {
            c18991.f72682 = strArr[7];
            return -5;
        }
        if (c18991.f72685 != 0 || this.f25996 != 0 || i18 != 666) {
            int i19 = f25948[this.f26003].f1839;
            int i20 = 5;
            short s = HPKE.aead_EXPORT_ONLY;
            if (i19 == 0) {
                int i21 = this.f25953 - 5;
                int i22 = 65535 > i21 ? i21 : 65535;
                while (true) {
                    if (this.f25996 <= 1) {
                        m21270();
                        if (this.f25996 == 0) {
                            m21265(false);
                            if (c18991.f72679 != 0) {
                                b = 1;
                            }
                        } else {
                            i2 = this.f25976 + this.f25996;
                            this.f25976 = i2;
                            this.f25996 = 0;
                            i3 = this.f25992 + i22;
                            if (i2 != 0 || i2 >= i3) {
                                this.f25996 = i2 - i3;
                                this.f25976 = i3;
                                m21265(false);
                                if (c18991.f72679 != 0) {
                                    if (this.f25976 - this.f25992 >= this.f25986 - 262) {
                                        m21265(false);
                                        if (c18991.f72679 == 0) {
                                        }
                                    }
                                }
                            } else if (this.f25976 - this.f25992 >= this.f25986 - 262) {
                                m21265(false);
                                if (c18991.f72679 == 0) {
                                }
                            }
                        }
                    } else {
                        i2 = this.f25976 + this.f25996;
                        this.f25976 = i2;
                        this.f25996 = 0;
                        i3 = this.f25992 + i22;
                        if (i2 != 0) {
                            this.f25996 = i2 - i3;
                            this.f25976 = i3;
                            m21265(false);
                            if (c18991.f72679 != 0) {
                                if (this.f25976 - this.f25992 >= this.f25986 - 262) {
                                    m21265(false);
                                    if (c18991.f72679 == 0) {
                                    }
                                }
                            }
                        } else {
                            this.f25996 = i2 - i3;
                            this.f25976 = i3;
                            m21265(false);
                            if (c18991.f72679 != 0) {
                                if (this.f25976 - this.f25992 >= this.f25986 - 262) {
                                    m21265(false);
                                    if (c18991.f72679 == 0) {
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
                    if (this.f25996 < 262) {
                        m21270();
                        if (this.f25996 == 0) {
                            m21265(false);
                            if (c18991.f72679 != 0) {
                                b = 1;
                            }
                        } else {
                            if (this.f25996 >= 3) {
                                int i24 = this.f25954 << this.f25975;
                                byte[] bArr5 = this.f25980;
                                int i25 = this.f25976;
                                int i26 = (i24 ^ (bArr5[i25 + 2] & 255)) & this.f25999;
                                this.f25954 = i26;
                                short[] sArr = this.f25994;
                                short s2 = sArr[i26];
                                int i27 = s2 & HPKE.aead_EXPORT_ONLY;
                                this.f25957[this.f25995 & i25] = s2;
                                sArr[i26] = (short) i25;
                                i23 = i27;
                            }
                            if (i23 != 0 && ((this.f25976 - i23) & 65535) <= this.f25986 - 262) {
                                this.f25964 = m21269(i23);
                            }
                            i4 = this.f25964;
                            if (i4 >= 3) {
                                zM21268 = m21268(this.f25976 - this.f26004, i4 - 3);
                                int i28 = this.f25996;
                                i5 = this.f25964;
                                int i29 = i28 - i5;
                                this.f25996 = i29;
                                if (i5 <= this.f25998 || i29 < 3) {
                                    int i30 = this.f25976 + i5;
                                    this.f25976 = i30;
                                    this.f25964 = 0;
                                    byte[] bArr6 = this.f25980;
                                    int i31 = bArr6[i30] & 255;
                                    this.f25954 = i31;
                                    this.f25954 = ((bArr6[i30 + 1] & 255) ^ (i31 << this.f25975)) & this.f25999;
                                } else {
                                    this.f25964 = i5 - 1;
                                    do {
                                        i6 = this.f25976;
                                        int i32 = i6 + 1;
                                        this.f25976 = i32;
                                        int i33 = ((this.f25954 << this.f25975) ^ (this.f25980[i6 + 3] & 255)) & this.f25999;
                                        this.f25954 = i33;
                                        short[] sArr2 = this.f25994;
                                        short s3 = sArr2[i33];
                                        i7 = s3 & HPKE.aead_EXPORT_ONLY;
                                        this.f25957[this.f25995 & i32] = s3;
                                        sArr2[i33] = (short) i32;
                                        i8 = this.f25964 - 1;
                                        this.f25964 = i8;
                                    } while (i8 != 0);
                                    this.f25976 = i6 + 2;
                                    i23 = i7;
                                }
                            } else {
                                zM21268 = m21268(0, this.f25980[this.f25976] & 255);
                                this.f25996--;
                                this.f25976++;
                            }
                            if (zM21268) {
                                m21265(false);
                                if (c18991.f72679 == 0) {
                                }
                            }
                        }
                    } else {
                        if (this.f25996 >= 3) {
                            int i210 = this.f25954 << this.f25975;
                            byte[] bArr7 = this.f25980;
                            int i211 = this.f25976;
                            int i212 = (i210 ^ (bArr7[i211 + 2] & 255)) & this.f25999;
                            this.f25954 = i212;
                            short[] sArr3 = this.f25994;
                            short s4 = sArr3[i212];
                            int i213 = s4 & HPKE.aead_EXPORT_ONLY;
                            this.f25957[this.f25995 & i211] = s4;
                            sArr3[i212] = (short) i211;
                            i23 = i213;
                        }
                        if (i23 != 0) {
                            this.f25964 = m21269(i23);
                        }
                        i4 = this.f25964;
                        if (i4 >= 3) {
                            zM21268 = m21268(this.f25976 - this.f26004, i4 - 3);
                            int i214 = this.f25996;
                            i5 = this.f25964;
                            int i215 = i214 - i5;
                            this.f25996 = i215;
                            if (i5 <= this.f25998) {
                                int i34 = this.f25976 + i5;
                                this.f25976 = i34;
                                this.f25964 = 0;
                                byte[] bArr8 = this.f25980;
                                int i35 = bArr8[i34] & 255;
                                this.f25954 = i35;
                                this.f25954 = ((bArr8[i34 + 1] & 255) ^ (i35 << this.f25975)) & this.f25999;
                            } else {
                                int i36 = this.f25976 + i5;
                                this.f25976 = i36;
                                this.f25964 = 0;
                                byte[] bArr9 = this.f25980;
                                int i37 = bArr9[i36] & 255;
                                this.f25954 = i37;
                                this.f25954 = ((bArr9[i36 + 1] & 255) ^ (i37 << this.f25975)) & this.f25999;
                            }
                        } else {
                            zM21268 = m21268(0, this.f25980[this.f25976] & 255);
                            this.f25996--;
                            this.f25976++;
                        }
                        if (zM21268) {
                            m21265(false);
                            if (c18991.f72679 == 0) {
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
                    if (this.f25996 < 262) {
                        m21270();
                        if (this.f25996 == 0) {
                            if (this.f25978 != 0) {
                                m21268(0, this.f25980[this.f25976 - 1] & 255);
                                this.f25978 = 0;
                            }
                            m21265(false);
                            if (c18991.f72679 != 0) {
                                b = 1;
                            }
                        } else {
                            if (this.f25996 >= 3) {
                                int i39 = this.f25954 << this.f25975;
                                byte[] bArr10 = this.f25980;
                                int i40 = this.f25976;
                                int i41 = (i39 ^ (bArr10[i40 + 2] & 255)) & this.f25999;
                                this.f25954 = i41;
                                short[] sArr4 = this.f25994;
                                short s5 = sArr4[i41];
                                this.f25957[this.f25995 & i40] = s5;
                                sArr4[i41] = (short) i40;
                                i38 = s5 & s;
                            }
                            int i42 = this.f25964;
                            this.f25970 = i42;
                            this.f25966 = this.f26004;
                            this.f25964 = 2;
                            if (i38 != 0 && i42 < this.f25998 && ((this.f25976 - i38) & s) <= this.f25986 - 262) {
                                iM21269 = m21269(i38);
                                this.f25964 = iM21269;
                                if (iM21269 <= i20 && iM21269 == 3 && this.f25976 - this.f26004 > 4096) {
                                    this.f25964 = 2;
                                }
                            }
                            i9 = this.f25970;
                            if (i9 >= 3 || this.f25964 > i9) {
                                if (this.f25978 != 0) {
                                    if (m21268(0, this.f25980[this.f25976 - 1] & 255)) {
                                        m21265(false);
                                    }
                                    this.f25976++;
                                    this.f25996--;
                                    if (c18991.f72679 == 0) {
                                    }
                                } else {
                                    this.f25978 = 1;
                                    this.f25976++;
                                    this.f25996--;
                                }
                                i20 = 5;
                                s = HPKE.aead_EXPORT_ONLY;
                            } else {
                                int i43 = this.f25976;
                                int i44 = (this.f25996 + i43) - 3;
                                boolean zM21269 = m21268((i43 - 1) - this.f25966, i9 - 3);
                                int i45 = this.f25996;
                                int i46 = this.f25970;
                                this.f25996 = i45 - (i46 - 1);
                                this.f25970 = i46 - 2;
                                while (true) {
                                    i10 = this.f25976;
                                    int i47 = i10 + 1;
                                    this.f25976 = i47;
                                    if (i47 <= i44) {
                                        int i48 = ((this.f25954 << this.f25975) ^ (this.f25980[i10 + 3] & 255)) & this.f25999;
                                        this.f25954 = i48;
                                        short[] sArr5 = this.f25994;
                                        short s6 = sArr5[i48];
                                        this.f25957[this.f25995 & i47] = s6;
                                        sArr5[i48] = (short) i47;
                                        i38 = s6 & s;
                                    }
                                    int i49 = this.f25970 - 1;
                                    this.f25970 = i49;
                                    if (i49 == 0) {
                                        break;
                                    }
                                    s = HPKE.aead_EXPORT_ONLY;
                                }
                                this.f25978 = 0;
                                this.f25964 = 2;
                                this.f25976 = i10 + 2;
                                if (zM21269) {
                                    m21265(false);
                                    if (c18991.f72679 == 0) {
                                    }
                                } else {
                                    continue;
                                }
                                i20 = 5;
                                s = HPKE.aead_EXPORT_ONLY;
                            }
                        }
                    } else {
                        if (this.f25996 >= 3) {
                            int i310 = this.f25954 << this.f25975;
                            byte[] bArr11 = this.f25980;
                            int i410 = this.f25976;
                            int i411 = (i310 ^ (bArr11[i410 + 2] & 255)) & this.f25999;
                            this.f25954 = i411;
                            short[] sArr6 = this.f25994;
                            short s7 = sArr6[i411];
                            this.f25957[this.f25995 & i410] = s7;
                            sArr6[i411] = (short) i410;
                            i38 = s7 & s;
                        }
                        int i412 = this.f25964;
                        this.f25970 = i412;
                        this.f25966 = this.f26004;
                        this.f25964 = 2;
                        if (i38 != 0) {
                            iM21269 = m21269(i38);
                            this.f25964 = iM21269;
                            if (iM21269 <= i20) {
                                this.f25964 = 2;
                            }
                        }
                        i9 = this.f25970;
                        if (i9 >= 3) {
                            if (this.f25978 != 0) {
                                if (m21268(0, this.f25980[this.f25976 - 1] & 255)) {
                                    m21265(false);
                                }
                                this.f25976++;
                                this.f25996--;
                                if (c18991.f72679 == 0) {
                                }
                            } else {
                                this.f25978 = 1;
                                this.f25976++;
                                this.f25996--;
                            }
                            i20 = 5;
                            s = HPKE.aead_EXPORT_ONLY;
                        } else {
                            if (this.f25978 != 0) {
                                if (m21268(0, this.f25980[this.f25976 - 1] & 255)) {
                                    m21265(false);
                                }
                                this.f25976++;
                                this.f25996--;
                                if (c18991.f72679 == 0) {
                                }
                            } else {
                                this.f25978 = 1;
                                this.f25976++;
                                this.f25996--;
                            }
                            i20 = 5;
                            s = HPKE.aead_EXPORT_ONLY;
                        }
                    }
                    b = 0;
                }
            }
            if (b == 2 || b == 3) {
                this.f25961 = 666;
            }
            if (b == 0 || b == 2) {
                if (c18991.f72679 == 0) {
                    this.f25989 = -1;
                }
            } else if (b == 1) {
                m21275(2, 3);
                short[] sArr7 = C21713.f69289;
                m21271(sArr7, 256);
                m21262();
                if ((this.f25988 + 11) - this.f25997 < 9) {
                    m21275(2, 3);
                    m21271(sArr7, 256);
                    m21262();
                }
                this.f25988 = 7;
                c18991.m50630();
                if (c18991.f72679 == 0) {
                    this.f25989 = -1;
                    return 0;
                }
            }
        }
        return 0;
    }

    public final Object clone() {
        C7804 c7804 = (C7804) super.clone();
        byte[] bArr = c7804.f25974;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        c7804.f25974 = bArr2;
        byte[] bArr3 = c7804.f25977;
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[length2];
        System.arraycopy(bArr3, 0, bArr4, 0, length2);
        c7804.f25977 = bArr4;
        byte[] bArr5 = c7804.f25980;
        int length3 = bArr5.length;
        byte[] bArr6 = new byte[length3];
        System.arraycopy(bArr5, 0, bArr6, 0, length3);
        c7804.f25980 = bArr6;
        c7804.f25957 = m21260(c7804.f25957);
        c7804.f25994 = m21260(c7804.f25994);
        c7804.f25965 = m21260(c7804.f25965);
        c7804.f25969 = m21260(c7804.f25969);
        c7804.f25967 = m21260(c7804.f25967);
        c7804.f25990 = m21260(c7804.f25990);
        c7804.f25991 = m21260(c7804.f25991);
        int[] iArr = c7804.f25985;
        int length4 = iArr.length;
        int[] iArr2 = new int[length4];
        System.arraycopy(iArr, 0, iArr2, 0, length4);
        c7804.f25985 = iArr2;
        byte[] bArr7 = c7804.f25956;
        int length5 = bArr7.length;
        byte[] bArr8 = new byte[length5];
        System.arraycopy(bArr7, 0, bArr8, 0, length5);
        c7804.f25956 = bArr8;
        c7804.f26005.f33468 = c7804.f25965;
        c7804.f25952.f33468 = c7804.f25969;
        c7804.f25950.f33468 = c7804.f25967;
        C1092 c1092 = c7804.f25981;
        if (c1092 != null) {
            c7804.f25981 = (C1092) c1092.clone();
        }
        return c7804;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static short[] m21260(short[] sArr) {
        int length = sArr.length;
        short[] sArr2 = new short[length];
        System.arraycopy(sArr, 0, sArr2, 0, length);
        return sArr2;
    }
}
