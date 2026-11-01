package l;

import android.util.Base64;
import com.alipay.sdk.m.t0.b;
import com.alipay.sdk.m.y.l;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.bo;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.Stack;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۚ᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01T6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5575 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f19120;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f19125;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f19126;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f19127;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f19128;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f19129;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public byte f19130;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f19132;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C4869 f19133;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f19134;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f19136;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f19137;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC21803 f19138;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f19139;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public byte f19140;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f19142;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4869 f19143;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f19145;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f19146;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f19147;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C4869 f19149;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f19150;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f19151;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f19152;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f19153;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f19156;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f19157;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean[] f19158;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Stack f19122 = new Stack();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f19155 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f19123 = new int[16];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final StringBuilder f19154 = new StringBuilder();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C2752 f19141 = new C2752();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2752 f19148 = new C2752();

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f19144 = true;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f19131 = 0;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f19124 = new byte[4];

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f19135 = -1;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C11926 f19121 = new C11926();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static int m15411(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 25) {
            return 16;
        }
        if (i == 66) {
            return 32;
        }
        if (i == 69) {
            return 2048;
        }
        if (i == 1000) {
            return 64;
        }
        if (i == 1002) {
            return 128;
        }
        if (i == 1004) {
            return 256;
        }
        if (i == 1006) {
            return 512;
        }
        if (i == 2004) {
            return 1024;
        }
        if (i == 5) {
            return 2;
        }
        if (i != 6) {
            return i != 7 ? -1 : 8;
        }
        return 4;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private boolean m15400(int i) {
        return (i & this.f19132) != 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m15415(int i, boolean z) {
        if (z) {
            if (i == 64) {
                m15415(128, false);
            } else if (i == 128) {
                m15415(64, false);
            }
        }
        if (z) {
            this.f19132 = i | this.f19132;
        } else {
            this.f19132 = (~i) & this.f19132;
        }
    }

    public C5575(C4995 c4995, int i, int i2) {
        this.f19138 = c4995;
        C4869 c4869 = new C4869(i, 2000, i2);
        this.f19133 = c4869;
        this.f19149 = c4869;
        this.f19143 = new C4869(i, i2, i2);
        this.f19153 = i2;
        this.f19142 = i;
        this.f19158 = new boolean[i];
        m15438();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C4869 m15433() {
        return this.f19149;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m15423() {
        return this.f19149 == this.f19143;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15429(int i, int i2) {
        int i3 = this.f19153;
        if (i3 == i2 && this.f19142 == i) {
            return;
        }
        if (i < 2 || i2 < 2) {
            throw new IllegalArgumentException(C2271.m6967("rows=", i2, i, ", columns="));
        }
        if (i3 != i2) {
            this.f19153 = i2;
            this.f19136 = 0;
            this.f19156 = i2;
        }
        int i4 = this.f19142;
        if (i4 != i) {
            this.f19142 = i;
            boolean[] zArr = this.f19158;
            this.f19158 = new boolean[i];
            int i5 = 0;
            while (i5 < this.f19142) {
                this.f19158[i5] = (i5 & 7) == 0 && i5 != 0;
                i5++;
            }
            System.arraycopy(zArr, 0, this.f19158, 0, Math.min(i4, i));
            this.f19137 = 0;
            this.f19147 = this.f19142;
        }
        m15418();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m15418() {
        int[] iArr = {this.f19157, this.f19146};
        C4869 c4869 = this.f19149;
        c4869.m13569(this.f19142, this.f19153, c4869 == this.f19143 ? this.f19153 : this.f19133.f17126, iArr, m15417(), m15423());
        this.f19157 = iArr[0];
        this.f19146 = iArr[1];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m15435() {
        return this.f19146;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m15437() {
        return this.f19157;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m15424() {
        return this.f19155;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m15434() {
        return m15400(2);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m15440() {
        return m15400(16);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m15425() {
        return m15400(32);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m15436() {
        return m15400(1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15431(int i, byte[] bArr) {
        for (int i2 = 0; i2 < i; i2++) {
            m15404(bArr[i2]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15404(byte b) {
        int i;
        byte b2;
        byte b3 = this.f19130;
        byte[] bArr = this.f19124;
        int i2 = 65533;
        if (b3 <= 0) {
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                m15428((int) b);
                return;
            }
            if ((b & bo.k) == 192) {
                this.f19130 = (byte) 1;
            } else if ((b & 240) == 224) {
                this.f19130 = (byte) 2;
            } else if ((b & 248) == 240) {
                this.f19130 = (byte) 3;
            } else {
                m15428(65533);
                return;
            }
            byte b4 = this.f19140;
            this.f19140 = (byte) (b4 + 1);
            bArr[b4] = b;
            return;
        }
        if ((b & 192) == 128) {
            byte b5 = this.f19140;
            byte b6 = (byte) (b5 + 1);
            this.f19140 = b6;
            bArr[b5] = b;
            byte b7 = (byte) (b3 - 1);
            this.f19130 = b7;
            if (b7 == 0) {
                if (b6 == 2) {
                    i = 31;
                } else {
                    i = b6 == 3 ? 15 : 7;
                }
                int i3 = ((byte) i) & bArr[0];
                int i4 = 1;
                while (true) {
                    b2 = this.f19140;
                    if (i4 >= b2) {
                        break;
                    }
                    i3 = (i3 << 6) | (bArr[i4] & 63);
                    i4++;
                }
                if ((i3 <= 127 && b2 > 1) || ((i3 < 2047 && b2 > 2) || (i3 < 65535 && b2 > 3))) {
                    i3 = 65533;
                }
                this.f19130 = (byte) 0;
                this.f19140 = (byte) 0;
                if (i3 < 128 || i3 > 159) {
                    int type = Character.getType(i3);
                    if (type != 0 && type != 19) {
                        i2 = i3;
                    }
                    m15428(i2);
                    return;
                }
                return;
            }
            return;
        }
        this.f19130 = (byte) 0;
        this.f19140 = (byte) 0;
        m15421(65533);
        m15404(b);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:136:0x0245  */
    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX WARN: Code duplicated, block: B:212:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:214:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:215:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:283:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:285:0x0515  */
    /* JADX WARN: Code duplicated, block: B:286:0x051b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:287:0x051d  */
    /* JADX WARN: Code duplicated, block: B:288:0x0520  */
    /* JADX WARN: Code duplicated, block: B:389:0x0694  */
    /* JADX WARN: Code duplicated, block: B:93:0x0169  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v45, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15428(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int iM15403;
        int i17;
        C4869 c4869;
        long j;
        String strM6576;
        if (i != 0) {
            ?? r3 = 0;
            if (i == 24 || i == 26) {
                if (this.f19151 != 0) {
                    this.f19151 = 0;
                    m15421(127);
                    return;
                }
                return;
            }
            int[] iArr = this.f19123;
            int i18 = 1;
            i = 1;
            int i19 = 1;
            if (i == 27) {
                int i20 = this.f19151;
                if (i20 == 13) {
                    return;
                }
                if (i20 == 10) {
                    m15405(i);
                    return;
                }
                this.f19151 = 1;
                this.f19139 = 0;
                Arrays.fill(iArr, -1);
                return;
            }
            AbstractC21803 abstractC21803 = this.f19138;
            switch (i) {
                case 7:
                    if (this.f19151 == 10) {
                        m15405(i);
                    } else {
                        abstractC21803.mo13844();
                    }
                    break;
                case 8:
                    int i21 = this.f19137;
                    int i22 = this.f19157;
                    if (i21 == i22) {
                        int i23 = this.f19146 - 1;
                        if (i23 >= 0) {
                            C4869 c48610 = this.f19149;
                            if (c48610.f17124[c48610.m13573(i23)].f61443) {
                                C4869 c48611 = this.f19149;
                                c48611.f17124[c48611.m13573(i23)].f61443 = false;
                                m15410(i23, this.f19147 - 1);
                            }
                        }
                    } else {
                        m15422(i22 - 1);
                    }
                    break;
                case 9:
                    this.f19157 = m15402(1);
                    break;
                case 10:
                case 11:
                case 12:
                    m15420();
                    break;
                case 13:
                    m15422(this.f19137);
                    break;
                case 14:
                    this.f19144 = false;
                    break;
                case 15:
                    this.f19144 = true;
                    break;
                default:
                    this.f19126 = false;
                    int i24 = this.f19151;
                    StringBuilder sb = this.f19154;
                    switch (i24) {
                        case 0:
                            if (i >= 32) {
                                m15421(i);
                            }
                            break;
                        case 1:
                            if (i == 35) {
                                m15409(2);
                                break;
                            } else if (i != 48) {
                                if (i == 72) {
                                    this.f19158[this.f19157] = true;
                                    break;
                                } else if (i == 80) {
                                    sb.setLength(0);
                                    m15409(13);
                                    break;
                                } else if (i == 91) {
                                    m15409(6);
                                    break;
                                } else if (i == 93) {
                                    sb.setLength(0);
                                    m15409(10);
                                    break;
                                } else if (i == 99) {
                                    m15438();
                                    m15414(0, 0, this.f19142, this.f19153);
                                    m15413(0, 0);
                                    break;
                                } else if (i == 40) {
                                    m15409(3);
                                    break;
                                } else if (i == 41) {
                                    m15409(4);
                                    break;
                                } else if (i == 61) {
                                    m15415(32, true);
                                    break;
                                } else if (i == 62) {
                                    m15415(32, false);
                                    break;
                                } else if (i == 77) {
                                    int i25 = this.f19146;
                                    int i26 = this.f19136;
                                    if (i25 <= i26) {
                                        int i27 = i26 + 1;
                                        this.f19149.m13566(0, i26, this.f19142, this.f19156 - i27, 0, i27);
                                        m15414(0, this.f19136, this.f19142, 1);
                                    } else {
                                        this.f19146 = i25 - 1;
                                    }
                                    break;
                                } else if (i != 78) {
                                    switch (i) {
                                        case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                            int i28 = this.f19157;
                                            int i29 = this.f19137;
                                            if (i28 > i29) {
                                                this.f19157 = i28 - 1;
                                            } else {
                                                int i30 = this.f19156;
                                                int i31 = this.f19136;
                                                int i32 = i30 - i31;
                                                this.f19149.m13566(i29, i31, (this.f19147 - i29) - 1, i32, i29 + 1, i31);
                                                this.f19149.m13567(this.f19137, this.f19136, 1, i32, 32, C0761.m3276(this.f19134, this.f19129, 0));
                                            }
                                            break;
                                        case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                            m15419();
                                            break;
                                        case 56:
                                            m15407();
                                            break;
                                        case 57:
                                            int i33 = this.f19157;
                                            int i34 = this.f19147;
                                            if (i33 < i34 - 1) {
                                                this.f19157 = i33 + 1;
                                            } else {
                                                int i35 = this.f19156;
                                                int i36 = this.f19136;
                                                int i37 = i35 - i36;
                                                C4869 c48612 = this.f19149;
                                                int i38 = this.f19137;
                                                c48612.m13566(i38 + 1, i36, (i34 - i38) - 1, i37, i38, i36);
                                                this.f19149.m13567(this.f19147 - 1, this.f19136, 1, i37, 32, C0761.m3276(this.f19134, this.f19129, 0));
                                            }
                                            break;
                                        default:
                                            switch (i) {
                                                case 68:
                                                    m15420();
                                                    break;
                                                case 69:
                                                    m15422(m15400(4) ? this.f19137 : 0);
                                                    m15420();
                                                    break;
                                                case 70:
                                                    m15410(0, this.f19156 - 1);
                                                    break;
                                                default:
                                                    i2 = 0;
                                                    this.f19151 = i2;
                                                    break;
                                            }
                                            break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            if (i != 56) {
                                i2 = 0;
                                this.f19151 = i2;
                            } else {
                                this.f19149.m13567(0, 0, this.f19142, this.f19153, 69, m15417());
                            }
                            break;
                        case 3:
                            this.f19125 = i == 48;
                            break;
                        case 4:
                            this.f19128 = i == 48;
                            break;
                        case 5:
                        default:
                            this.f19151 = 0;
                            break;
                        case 6:
                            m15401(i);
                            break;
                        case 7:
                            if (i == 36) {
                                m15409(14);
                            } else if (i == 104 || i == 108) {
                                if (this.f19139 >= iArr.length) {
                                    this.f19139 = iArr.length - 1;
                                }
                                for (int i39 = 0; i39 <= this.f19139; i39++) {
                                    m15430(iArr[i39], i == 104);
                                }
                            } else if (i == 110) {
                                i2 = 0;
                                if (m15403(0, -1, true) != 6) {
                                    this.f19151 = i2;
                                } else {
                                    Locale locale = Locale.US;
                                    abstractC21803.m48569(C8015.m21119("\u001b[?", this.f19146 + 1, l.b, ";1R", this.f19157 + 1));
                                }
                            } else if (i == 74 || i == 75) {
                                this.f19127 = false;
                                boolean z2 = i == 75;
                                int iM15404 = m15403(0, 0, true);
                                if (iM15404 != 0) {
                                    if (iM15404 == 1) {
                                        int i40 = z2 ? this.f19146 : 0;
                                        int i41 = this.f19157 + 1;
                                        i6 = this.f19146 + 1;
                                        i5 = i40;
                                        i4 = i41;
                                    } else if (iM15404 != 2) {
                                        this.f19151 = 0;
                                        i6 = -1;
                                        i4 = -1;
                                        i5 = -1;
                                        i3 = -1;
                                    } else {
                                        int i42 = z2 ? this.f19146 : 0;
                                        int i43 = this.f19142;
                                        i6 = z2 ? this.f19146 + 1 : this.f19153;
                                        i5 = i42;
                                        i4 = i43;
                                    }
                                    i3 = 0;
                                } else {
                                    i3 = this.f19157;
                                    int i44 = this.f19146;
                                    i4 = this.f19142;
                                    int i45 = z2 ? i44 + 1 : this.f19153;
                                    i5 = i44;
                                    i6 = i45;
                                }
                                long jM15417 = m15417();
                                while (i5 < i6) {
                                    for (int i46 = i3; i46 < i4; i46++) {
                                        C4869 c48613 = this.f19149;
                                        if ((((int) (c48613.m13565(c48613.m13573(i5)).f61442[i46] & 2047)) & 128) == 0) {
                                            this.f19149.m13568(i46, i5, 32, jM15417);
                                        }
                                    }
                                    i5++;
                                }
                            } else if (i == 114 || i == 115) {
                                if (this.f19139 >= iArr.length) {
                                    this.f19139 = iArr.length - 1;
                                }
                                for (int i47 = 0; i47 <= this.f19139; i47++) {
                                    int i48 = iArr[i47];
                                    int iM15411 = m15411(i48);
                                    if (iM15411 != -1) {
                                        if (i == 115) {
                                            this.f19120 |= iM15411;
                                        } else {
                                            m15430(i48, (iM15411 & this.f19120) != 0);
                                        }
                                    }
                                }
                            } else {
                                m15406(i);
                            }
                            break;
                        case 8:
                            boolean zM15400 = m15400(4);
                            int i49 = zM15400 ? this.f19136 : 0;
                            int i50 = zM15400 ? this.f19156 : this.f19153;
                            int i51 = zM15400 ? this.f19137 : 0;
                            int i52 = zM15400 ? this.f19147 : this.f19142;
                            int i53 = 5;
                            if (i != 114) {
                                i7 = 116;
                                if (i != 116) {
                                    if (i == 118) {
                                        int iMin = Math.min((m15403(0, 1, true) - 1) + i49, this.f19153);
                                        int iMin2 = Math.min((m15403(1, 1, true) - 1) + i51, this.f19142);
                                        int iMin3 = Math.min(Math.max(m15403(2, this.f19153, true) + i49, iMin), this.f19153);
                                        int iMin4 = Math.min(Math.max(m15403(3, this.f19142, true) + i51, iMin2), this.f19142);
                                        int iMin5 = Math.min((m15403(5, 1, true) - 1) + i49, this.f19153);
                                        int iMin6 = Math.min((m15403(6, 1, true) - 1) + i51, this.f19142);
                                        this.f19149.m13566(iMin2, iMin, Math.min(this.f19142 - iMin6, iMin4 - iMin2), Math.min(this.f19153 - iMin5, iMin3 - iMin), iMin6, iMin5);
                                    } else if (i == 120 || i == 122 || i == 123) {
                                        boolean z3 = i != 120;
                                        boolean z4 = i == 123;
                                        boolean z5 = z3 && z4;
                                        if (z3) {
                                            i17 = 0;
                                            iM15403 = 32;
                                        } else {
                                            iM15403 = m15403(0, -1, true);
                                            i17 = 1;
                                        }
                                        if ((iM15403 >= 32 && iM15403 <= 126) || (iM15403 >= 160 && iM15403 <= 255)) {
                                            int iMin7 = Math.min(m15403(i17, 1, true) + i49, i50 + 1);
                                            int iMin8 = Math.min(m15403(i17 + 1, 1, true) + i51, i52 + 1);
                                            int iMin9 = Math.min(m15403(i17 + 2, this.f19153, true) + i49, i50);
                                            int iMin10 = Math.min(m15403(i17 + 3, this.f19142, true) + i51, i52);
                                            long jM15418 = m15417();
                                            for (int i54 = iMin7 - 1; i54 < iMin9; i54++) {
                                                for (int i55 = iMin8 - 1; i55 < iMin10; i55++) {
                                                    if (z4) {
                                                        C4869 c48614 = this.f19149;
                                                        if ((((int) (c48614.m13565(c48614.m13573(i54)).f61442[i55] & 2047)) & 128) == 0) {
                                                            c4869 = this.f19149;
                                                            if (z5) {
                                                                j = c4869.m13565(c4869.m13573(i54)).f61442[i55];
                                                            } else {
                                                                j = jM15418;
                                                            }
                                                            c4869.m13568(i55, i54, iM15403, j);
                                                        }
                                                    } else {
                                                        c4869 = this.f19149;
                                                        if (z5) {
                                                            j = c4869.m13565(c4869.m13573(i54)).f61442[i55];
                                                        } else {
                                                            j = jM15418;
                                                        }
                                                        c4869.m13568(i55, i54, iM15403, j);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        this.f19151 = 0;
                                    }
                                }
                            } else {
                                i7 = 116;
                            }
                            boolean z6 = i == i7;
                            int iMin11 = Math.min(m15403(0, 1, true) - 1, i50) + i49;
                            int iMin12 = Math.min(m15403(1, 1, true) - 1, i52) + i51;
                            int iMin13 = Math.min(m15403(2, this.f19153, true) + 1, i50 - 1) + i49;
                            int iMin14 = Math.min(m15403(3, this.f19142, true) + 1, i52 - 1) + i51;
                            int i56 = this.f19139;
                            if (i56 >= 4) {
                                if (i56 >= iArr.length) {
                                    this.f19139 = iArr.length - 1;
                                }
                                int i57 = 4;
                                while (i57 <= this.f19139) {
                                    int iM15405 = m15403(i57, r3, r3);
                                    if (iM15405 != 0) {
                                        if (iM15405 != i18) {
                                            if (iM15405 != 4) {
                                                if (iM15405 != i53) {
                                                    i8 = 16;
                                                    if (iM15405 == 7) {
                                                        z = true;
                                                    } else if (iM15405 == 22) {
                                                        z = false;
                                                    } else if (iM15405 == 27) {
                                                        z = false;
                                                    } else if (iM15405 == 24) {
                                                        z = false;
                                                    } else if (iM15405 != 25) {
                                                        z = true;
                                                        i8 = 0;
                                                    } else {
                                                        z = false;
                                                    }
                                                } else {
                                                    z = true;
                                                }
                                                i8 = 8;
                                            } else {
                                                z = true;
                                            }
                                            i8 = 4;
                                        } else {
                                            z = true;
                                        }
                                        i8 = 1;
                                    } else {
                                        z = z6;
                                        i8 = 29;
                                    }
                                    if (!z6 || z) {
                                        C4869 c48615 = this.f19149;
                                        boolean zM15401 = m15400(4096);
                                        int i58 = iMin11;
                                        while (i58 < iMin13) {
                                            C18981 c18981 = c48615.f17124[c48615.m13573(i58)];
                                            int i59 = (zM15401 || i58 == iMin11) ? iMin12 : i51;
                                            if (zM15401) {
                                                i13 = i52;
                                            } else {
                                                i13 = i52;
                                                if (i58 + 1 != iMin13) {
                                                    i14 = i13;
                                                }
                                                while (i59 < i14) {
                                                    int i60 = i14;
                                                    long j2 = c18981.f61442[i59];
                                                    int iM3277 = C0761.m3277(j2);
                                                    int i61 = iMin14;
                                                    int iM3275 = C0761.m3275(j2);
                                                    int i62 = iMin13;
                                                    int i63 = i51;
                                                    i15 = (int) (j2 & 2047);
                                                    if (z6) {
                                                        i16 = ((~i8) & i15) | ((~i15) & i8);
                                                    } else if (z) {
                                                        i16 = i15 | i8;
                                                    } else {
                                                        i16 = (~i8) & i15;
                                                    }
                                                    c18981.f61442[i59] = C0761.m3276(iM3277, iM3275, i16);
                                                    i59++;
                                                    iMin14 = i61;
                                                    i14 = i60;
                                                    i51 = i63;
                                                    iMin13 = i62;
                                                }
                                                i58++;
                                                i52 = i13;
                                            }
                                            i14 = iMin14;
                                            while (i59 < i14) {
                                                int i64 = i14;
                                                long j3 = c18981.f61442[i59];
                                                int iM3278 = C0761.m3277(j3);
                                                int i65 = iMin14;
                                                int iM3276 = C0761.m3275(j3);
                                                int i66 = iMin13;
                                                int i67 = i51;
                                                i15 = (int) (j3 & 2047);
                                                if (z6) {
                                                    i16 = ((~i8) & i15) | ((~i15) & i8);
                                                } else if (z) {
                                                    i16 = i15 | i8;
                                                } else {
                                                    i16 = (~i8) & i15;
                                                }
                                                c18981.f61442[i59] = C0761.m3276(iM3278, iM3276, i16);
                                                i59++;
                                                iMin14 = i65;
                                                i14 = i64;
                                                i51 = i67;
                                                iMin13 = i66;
                                            }
                                            i58++;
                                            i52 = i13;
                                        }
                                        i9 = i52;
                                        i10 = iMin14;
                                        i11 = iMin13;
                                        i12 = i51;
                                        c48615.getClass();
                                    } else {
                                        i9 = i52;
                                        i10 = iMin14;
                                        i11 = iMin13;
                                        i12 = i51;
                                    }
                                    i57++;
                                    r3 = 0;
                                    i18 = 1;
                                    i53 = 5;
                                    iMin14 = i10;
                                    i52 = i9;
                                    i51 = i12;
                                    iMin13 = i11;
                                }
                            }
                            break;
                        case 9:
                            break;
                        case 10:
                            m15405(i);
                            break;
                        case 11:
                            if (i != 92) {
                                m15412(27);
                                m15412(i);
                                m15409(10);
                            } else {
                                m15416("\u001b\\");
                            }
                            break;
                        case 12:
                            if (i == 99) {
                                abstractC21803.m48569("\u001b[>41;320;0c");
                            } else if (i != 109) {
                                m15406(i);
                            }
                            break;
                        case 13:
                            if (i != 92) {
                                if (sb.length() <= 8192) {
                                    sb.appendCodePoint(i);
                                    m15409(this.f19151);
                                } else {
                                    sb.setLength(0);
                                }
                                break;
                            } else {
                                String string = sb.toString();
                                if (string.startsWith("$q")) {
                                    if (string.equals("$q\"p")) {
                                        abstractC21803.m48569("\u001bP1$r64;1\"p\u001b\\");
                                    } else {
                                        this.f19151 = 0;
                                    }
                                } else if (string.startsWith("+q")) {
                                    for (String str : string.substring(2).split(l.b)) {
                                        if (str.length() % 2 == 0) {
                                            StringBuilder sb2 = new StringBuilder();
                                            for (int i68 = 0; i68 < str.length(); i68 += 2) {
                                                sb2.append((char) Long.decode("0x" + str.charAt(i68) + "" + str.charAt(i68 + 1)).longValue());
                                            }
                                            String string2 = sb2.toString();
                                            string2.getClass();
                                            switch (string2) {
                                                case "colors":
                                                case "Co":
                                                    strM6576 = "256";
                                                    break;
                                                case "TN":
                                                case "name":
                                                    strM6576 = "xterm";
                                                    break;
                                                default:
                                                    strM6576 = C2067.m6576(string2, m15400(1), m15400(32));
                                                    break;
                                            }
                                            if (strM6576 == null) {
                                                abstractC21803.m48569("\u001bP0+r" + str + "\u001b\\");
                                            } else {
                                                StringBuilder sb3 = new StringBuilder();
                                                for (int i69 = 0; i69 < strM6576.length(); i69++) {
                                                    sb3.append(String.format("%02X", Integer.valueOf(strM6576.charAt(i69))));
                                                }
                                                abstractC21803.m48569("\u001bP1+r" + str + "=" + ((Object) sb3) + "\u001b\\");
                                            }
                                        }
                                    }
                                }
                            }
                            this.f19151 = 0;
                            break;
                        case 14:
                            if (i == 112) {
                                int iM15406 = m15403(0, 0, true);
                                if (iM15406 != 47 && iM15406 != 1047 && iM15406 != 1049) {
                                    int iM15412 = m15411(iM15406);
                                    if (iM15412 != -1) {
                                        i19 = 0;
                                    } else if (!m15400(iM15412)) {
                                        i19 = 2;
                                    }
                                } else if (this.f19149 != this.f19143) {
                                    i19 = 2;
                                }
                                Locale locale2 = Locale.US;
                                abstractC21803.m48569(C8015.m21119("\u001b[?", iM15406, l.b, "$y", i19));
                            } else {
                                this.f19151 = 0;
                            }
                            break;
                        case 15:
                            int iM15407 = m15403(0, 0, true);
                            if (i == 113) {
                                switch (iM15407) {
                                    case 0:
                                    case 1:
                                    case 2:
                                        this.f19155 = 0;
                                        break;
                                    case 3:
                                    case 4:
                                        this.f19155 = 1;
                                        break;
                                    case 5:
                                    case 6:
                                        this.f19155 = 2;
                                        break;
                                }
                            } else {
                                if (i != 116 && i != 117) {
                                    this.f19151 = 0;
                                }
                                break;
                            }
                            break;
                        case 16:
                            int iM15408 = m15403(0, 0, true);
                            if (i != 120 || iM15408 < 0 || iM15408 > 2) {
                                this.f19151 = 0;
                            } else {
                                m15415(4096, iM15408 == 2);
                            }
                            break;
                        case 17:
                            if (i != 113) {
                                this.f19151 = 0;
                            } else {
                                int iM15409 = m15403(0, 0, true);
                                if (iM15409 == 0 || iM15409 == 2) {
                                    this.f19150 &= -129;
                                } else if (iM15409 == 1) {
                                    this.f19150 |= 128;
                                } else {
                                    this.f19151 = 0;
                                }
                            }
                            break;
                        case 18:
                            if (i == 125) {
                                int i70 = this.f19147 - this.f19157;
                                int iMin15 = Math.min(m15403(0, 1, true), i70);
                                C4869 c48616 = this.f19149;
                                int i71 = this.f19157;
                                c48616.m13566(i71, 0, i70 - iMin15, this.f19153, i71 + iMin15, 0);
                                m15414(this.f19157, 0, iMin15, this.f19153);
                            } else if (i == 126) {
                                int i72 = this.f19147 - this.f19157;
                                int iMin16 = Math.min(m15403(0, 1, true), i72);
                                int i73 = i72 - iMin16;
                                C4869 c48617 = this.f19149;
                                int i74 = this.f19157;
                                c48617.m13566(i74 + iMin16, 0, i73, this.f19153, i74, 0);
                                m15414(this.f19146 + i73, 0, iMin16, this.f19153);
                            } else {
                                this.f19151 = 0;
                            }
                            break;
                        case 19:
                            if (i == 112) {
                                m15438();
                            } else {
                                this.f19151 = 0;
                            }
                            break;
                    }
                    if (!this.f19126) {
                        this.f19151 = 0;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private int m15402(int i) {
        int i2 = this.f19157;
        while (true) {
            i2++;
            if (i2 < this.f19142) {
                if (this.f19158[i2] && (i = i - 1) == 0) {
                    return Math.min(i2, this.f19147);
                }
            } else {
                return this.f19147 - 1;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15430(int i, boolean z) {
        int iM15411 = m15411(i);
        if (iM15411 != -1) {
            m15415(iM15411, z);
        }
        switch (i) {
            case 1:
            case 12:
            case 25:
            case 40:
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
            case 66:
            case 1015:
            case 1034:
            case 2004:
                return;
            case 47:
                break;
            case 69:
                if (z) {
                    return;
                }
                this.f19137 = 0;
                this.f19147 = this.f19142;
                return;
            default:
                switch (i) {
                    case 3:
                        this.f19136 = 0;
                        this.f19137 = 0;
                        this.f19156 = this.f19153;
                        this.f19147 = this.f19142;
                        m15415(2048, false);
                        m15414(0, 0, this.f19142, this.f19153);
                        m15410(0, 0);
                        return;
                    case 4:
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                        return;
                    case 6:
                        if (z) {
                            m15413(0, 0);
                            return;
                        }
                        return;
                    default:
                        switch (i) {
                            case 1000:
                            case 1001:
                            case b.c /* 1002 */:
                            case b.d /* 1003 */:
                            case 1004:
                            case 1005:
                            case 1006:
                                return;
                            default:
                                switch (i) {
                                    case 1047:
                                    case 1049:
                                        break;
                                    case 1048:
                                        if (z) {
                                            m15419();
                                        } else {
                                            m15407();
                                        }
                                        break;
                                    default:
                                        this.f19151 = 0;
                                        break;
                                }
                                return;
                        }
                }
        }
        C4869 c4869 = this.f19143;
        C4869 c48610 = z ? c4869 : this.f19133;
        if (c48610 != this.f19149) {
            boolean z2 = (c48610.f17125 == this.f19142 && c48610.f17123 == this.f19153) ? false : true;
            if (z) {
                m15419();
            }
            this.f19149 = c48610;
            if (!z) {
                C2752 c2752 = this.f19141;
                int i2 = c2752.f10562;
                int i3 = c2752.f10560;
                m15407();
                if (z2) {
                    this.f19157 = i2;
                    this.f19146 = i3;
                }
            }
            if (z2) {
                m15418();
            }
            if (c48610 == c4869) {
                c48610.m13567(0, 0, this.f19142, this.f19153, 32, m15417());
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m15420() {
        int i = this.f19146;
        int i2 = this.f19156;
        int i3 = i + 1;
        if (i >= i2) {
            if (i != this.f19153 - 1) {
                this.f19146 = i3;
                this.f19127 = false;
                return;
            }
            return;
        }
        if (i3 == i2) {
            m15408();
            i3 = this.f19156 - 1;
        }
        this.f19146 = i3;
        this.f19127 = false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m15409(int i) {
        this.f19151 = i;
        this.f19126 = true;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m15419() {
        C2752 c2752 = this.f19149 == this.f19133 ? this.f19141 : this.f19148;
        c2752.f10560 = this.f19146;
        c2752.f10562 = this.f19157;
        c2752.f10559 = this.f19150;
        c2752.f10563 = this.f19134;
        c2752.f10558 = this.f19129;
        c2752.f10556 = this.f19132;
        c2752.f10555 = this.f19125;
        c2752.f10561 = this.f19128;
        c2752.f10557 = this.f19144;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m15407() {
        C2752 c2752 = this.f19149 == this.f19133 ? this.f19141 : this.f19148;
        m15410(c2752.f10560, c2752.f10562);
        this.f19150 = c2752.f10559;
        this.f19134 = c2752.f10563;
        this.f19129 = c2752.f10558;
        this.f19132 = (this.f19132 & (-13)) | (c2752.f10556 & 12);
        this.f19125 = c2752.f10555;
        this.f19128 = c2752.f10561;
        this.f19144 = c2752.f10557;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:117:0x0223  */
    /* JADX WARN: Code duplicated, block: B:143:0x0287  */
    /* JADX WARN: Code duplicated, block: B:144:0x028f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x0291  */
    /* JADX WARN: Code duplicated, block: B:146:0x0298 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x029a  */
    /* JADX WARN: Code duplicated, block: B:148:0x02a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:150:0x02aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:152:0x02b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:154:0x02bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x02be  */
    /* JADX WARN: Code duplicated, block: B:156:0x02c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:158:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:160:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:161:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:168:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:169:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:171:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:172:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:174:0x0302  */
    /* JADX WARN: Code duplicated, block: B:175:0x030a  */
    /* JADX WARN: Code duplicated, block: B:177:0x030e  */
    /* JADX WARN: Code duplicated, block: B:178:0x0316  */
    /* JADX WARN: Code duplicated, block: B:180:0x031a  */
    /* JADX WARN: Code duplicated, block: B:181:0x0322  */
    /* JADX WARN: Code duplicated, block: B:183:0x0326  */
    /* JADX WARN: Code duplicated, block: B:184:0x032e  */
    /* JADX WARN: Code duplicated, block: B:186:0x0332  */
    /* JADX WARN: Code duplicated, block: B:187:0x033a  */
    /* JADX WARN: Code duplicated, block: B:192:0x0348  */
    /* JADX WARN: Code duplicated, block: B:194:0x034c  */
    /* JADX WARN: Code duplicated, block: B:218:0x038a  */
    /* JADX WARN: Code duplicated, block: B:221:0x038f  */
    /* JADX WARN: Code duplicated, block: B:223:0x0395  */
    /* JADX WARN: Code duplicated, block: B:226:0x039a  */
    /* JADX WARN: Code duplicated, block: B:228:0x03a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:239:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:241:0x03c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:242:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:244:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:247:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:248:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:250:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:367:0x03db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x03db A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m15401(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 8;
        if (i == 36) {
            m15409(8);
            return;
        }
        if (i == 39) {
            m15409(18);
            return;
        }
        if (i == 42) {
            m15409(16);
            return;
        }
        int i10 = 0;
        if (i == 80) {
            this.f19127 = false;
            int i11 = this.f19142 - this.f19157;
            int iMin = Math.min(m15403(0, 1, true), i11);
            int i12 = i11 - iMin;
            C4869 c4869 = this.f19149;
            int i13 = this.f19157;
            int i14 = this.f19146;
            c4869.m13566(i13 + iMin, i14, i12, 1, i13, i14);
            m15414(this.f19157 + i12, this.f19146, iMin, 1);
            return;
        }
        if (i == 88) {
            this.f19127 = false;
            this.f19149.m13567(this.f19157, this.f19146, Math.min(m15403(0, 1, true), this.f19142 - this.f19157), 1, 32, m15417());
            return;
        }
        if (i == 90) {
            int iM15403 = m15403(0, 1, true);
            int iMax = this.f19137;
            for (int i15 = this.f19157 - 1; i15 >= 0; i15--) {
                if (this.f19158[i15] && (iM15403 = iM15403 - 1) == 0) {
                    iMax = Math.max(i15, this.f19137);
                    break;
                }
            }
            this.f19157 = iMax;
            return;
        }
        if (i == 83) {
            int iM15404 = m15403(0, 1, true);
            while (i10 < iM15404) {
                m15408();
                i10++;
            }
            return;
        }
        if (i == 84) {
            if (this.f19139 != 0) {
                this.f19151 = 0;
                return;
            }
            int iM15405 = m15403(0, 1, true);
            int i16 = this.f19156 - this.f19136;
            int iMin2 = Math.min(i16, iM15405);
            C4869 c48610 = this.f19149;
            int i17 = this.f19136;
            c48610.m13566(0, i17, this.f19142, i16 - iMin2, 0, i17 + iMin2);
            m15414(0, this.f19136, this.f19142, iMin2);
            return;
        }
        switch (i) {
            case 32:
                m15409(15);
                break;
            case 33:
                m15409(19);
                break;
            case 34:
                m15409(17);
                break;
            default:
                switch (i) {
                    case 62:
                        m15409(12);
                        break;
                    case 63:
                        m15409(7);
                        break;
                    case 64:
                        this.f19127 = false;
                        int i18 = this.f19142 - this.f19157;
                        int iMin3 = Math.min(m15403(0, 1, true), i18);
                        C4869 c48611 = this.f19149;
                        int i19 = this.f19157;
                        int i20 = this.f19146;
                        c48611.m13566(i19, i20, i18 - iMin3, 1, i19 + iMin3, i20);
                        m15414(this.f19157, this.f19146, iMin3, 1);
                        break;
                    case 65:
                        this.f19146 = Math.max(this.f19136, this.f19146 - m15403(0, 1, true));
                        this.f19127 = false;
                        break;
                    case 66:
                        this.f19146 = Math.min(this.f19156 - 1, this.f19146 + m15403(0, 1, true));
                        this.f19127 = false;
                        break;
                    case 67:
                        m15422(Math.min(this.f19147 - 1, this.f19157 + m15403(0, 1, true)));
                        break;
                    case 68:
                        m15422(Math.max(this.f19137, this.f19157 - m15403(0, 1, true)));
                        break;
                    case 69:
                        m15413(0, this.f19146 + m15403(0, 1, true));
                        break;
                    case 70:
                        m15413(0, this.f19146 - m15403(0, 1, true));
                        break;
                    case 71:
                        m15422(Math.min(Math.max(1, m15403(0, 1, true)), this.f19142) - 1);
                        break;
                    case 72:
                        m15413(m15403(1, 1, true) - 1, m15403(0, 1, true) - 1);
                        break;
                    case 73:
                        m15422(m15402(m15403(0, 1, true)));
                        break;
                    case 74:
                        int iM15406 = m15403(0, 0, true);
                        if (iM15406 == 0) {
                            int i21 = this.f19157;
                            m15414(i21, this.f19146, this.f19142 - i21, 1);
                            int i22 = this.f19146 + 1;
                            m15414(0, i22, this.f19142, this.f19153 - i22);
                        } else if (iM15406 == 1) {
                            m15414(0, 0, this.f19142, this.f19146);
                            m15414(0, this.f19146, this.f19157 + 1, 1);
                        } else if (iM15406 != 2) {
                            this.f19151 = 0;
                        } else {
                            m15414(0, 0, this.f19142, this.f19153);
                        }
                        this.f19127 = false;
                        break;
                    case 75:
                        int iM15407 = m15403(0, 0, true);
                        if (iM15407 != 0) {
                            if (iM15407 == 1) {
                                i2 = this.f19146;
                                i3 = this.f19157 + 1;
                            } else if (iM15407 != 2) {
                                this.f19151 = 0;
                            } else {
                                i2 = this.f19146;
                                i3 = this.f19142;
                            }
                            m15414(0, i2, i3, 1);
                        } else {
                            int i23 = this.f19157;
                            m15414(i23, this.f19146, this.f19142 - i23, 1);
                        }
                        this.f19127 = false;
                        break;
                    case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                        int i24 = this.f19156 - this.f19146;
                        int iMin4 = Math.min(m15403(0, 1, true), i24);
                        C4869 c48612 = this.f19149;
                        int i25 = this.f19146;
                        c48612.m13566(0, i25, this.f19142, i24 - iMin4, 0, i25 + iMin4);
                        m15414(0, this.f19146, this.f19142, iMin4);
                        break;
                    case 77:
                        this.f19127 = false;
                        int i26 = this.f19156 - this.f19146;
                        int iMin5 = Math.min(m15403(0, 1, true), i26);
                        int i27 = i26 - iMin5;
                        C4869 c48613 = this.f19149;
                        int i28 = this.f19146;
                        c48613.m13566(0, i28 + iMin5, this.f19142, i27, 0, i28);
                        m15414(0, this.f19146 + i27, this.f19142, iMin5);
                        break;
                    default:
                        AbstractC21803 abstractC21803 = this.f19138;
                        switch (i) {
                            case 96:
                                m15413(m15403(0, 1, true) - 1, this.f19146);
                                break;
                            case 97:
                                m15422(Math.min(this.f19147 - 1, this.f19157 + m15403(0, 1, true)));
                                break;
                            case 98:
                                if (this.f19135 != -1) {
                                    int iM15408 = m15403(0, 1, true);
                                    while (i10 < iM15408) {
                                        m15421(this.f19135);
                                        i10++;
                                    }
                                    break;
                                }
                                break;
                            case q.f /* 99 */:
                                if (m15403(0, 0, true) == 0) {
                                    abstractC21803.m48569("\u001b[?64;1;2;6;9;15;18;21;22c");
                                }
                                break;
                            case 100:
                                this.f19146 = Math.min(Math.max(1, m15403(0, 1, true)), this.f19153) - 1;
                                this.f19127 = false;
                                break;
                            case 101:
                                m15413(this.f19157, this.f19146 + m15403(0, 1, true));
                                break;
                            case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                m15413(m15403(1, 1, true) - 1, m15403(0, 1, true) - 1);
                                break;
                            case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                int iM15409 = m15403(0, 0, true);
                                if (iM15409 == 0) {
                                    this.f19158[this.f19157] = false;
                                    break;
                                } else if (iM15409 == 3) {
                                    for (int i29 = 0; i29 < this.f19142; i29++) {
                                        this.f19158[i29] = false;
                                    }
                                    break;
                                }
                                break;
                            case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                int iM154010 = m15403(0, 0, true);
                                if (iM154010 == 4) {
                                    this.f19152 = true;
                                } else if (iM154010 == 20) {
                                    this.f19151 = 0;
                                } else if (iM154010 != 34) {
                                    this.f19151 = 0;
                                }
                                break;
                            default:
                                int i30 = 11;
                                switch (i) {
                                    case 108:
                                        int iM154011 = m15403(0, 0, true);
                                        if (iM154011 == 4) {
                                            this.f19152 = false;
                                        } else if (iM154011 == 20) {
                                            this.f19151 = 0;
                                        } else if (iM154011 != 34) {
                                            this.f19151 = 0;
                                        }
                                        break;
                                    case 109:
                                        int i31 = this.f19139;
                                        int[] iArr = this.f19123;
                                        if (i31 >= iArr.length) {
                                            this.f19139 = iArr.length - 1;
                                        }
                                        int i32 = 0;
                                        while (true) {
                                            int i33 = this.f19139;
                                            if (i32 <= i33) {
                                                int i34 = iArr[i32];
                                                if (i34 >= 0) {
                                                    if (i34 == 0) {
                                                        this.f19134 = 256;
                                                        this.f19129 = 257;
                                                        this.f19150 = 0;
                                                    } else if (i34 == 1) {
                                                        this.f19150 |= 1;
                                                    } else if (i34 == 2) {
                                                        this.f19150 |= 256;
                                                    } else if (i34 == 3) {
                                                        this.f19150 |= 2;
                                                    } else if (i34 == 4) {
                                                        this.f19150 |= 4;
                                                    } else if (i34 == 5) {
                                                        this.f19150 = i9 | this.f19150;
                                                    } else if (i34 == 7) {
                                                        this.f19150 |= 16;
                                                    } else if (i34 == i9) {
                                                        this.f19150 |= 32;
                                                    } else if (i34 == 9) {
                                                        this.f19150 |= 64;
                                                    } else if (i34 != 10 && i34 != i30) {
                                                        if (i34 == 22) {
                                                            this.f19150 &= -258;
                                                        } else if (i34 == 23) {
                                                            this.f19150 &= -3;
                                                        } else if (i34 == 24) {
                                                            this.f19150 &= -5;
                                                        } else if (i34 == 25) {
                                                            this.f19150 &= -9;
                                                        } else if (i34 == 27) {
                                                            this.f19150 &= -17;
                                                        } else if (i34 == 28) {
                                                            this.f19150 &= -33;
                                                        } else if (i34 == 29) {
                                                            this.f19150 &= -65;
                                                        } else if (i34 < 30 && i34 <= 37) {
                                                            this.f19134 = i34 - 30;
                                                        } else if (i34 != 38 || i34 == 48) {
                                                            i4 = i32 + 2;
                                                            if (i4 <= i33) {
                                                                i5 = iArr[i32 + 1];
                                                                if (i5 == 2) {
                                                                    i7 = i32 + 4;
                                                                    if (i7 <= i33) {
                                                                        i8 = iArr[i4];
                                                                        int i35 = iArr[i32 + 3];
                                                                        int i36 = iArr[i7];
                                                                        if (i8 >= 0 || i35 < 0 || i36 < 0 || i8 > 255 || i35 > 255 || i36 > 255) {
                                                                            this.f19151 = 0;
                                                                        } else {
                                                                            int i37 = (i35 << 8) | (i8 << 16) | (-16777216) | i36;
                                                                            if (i34 == 38) {
                                                                                this.f19134 = i37;
                                                                            } else {
                                                                                this.f19129 = i37;
                                                                            }
                                                                        }
                                                                        i32 = i7;
                                                                    }
                                                                } else if (i5 == 5) {
                                                                    i6 = iArr[i4];
                                                                    if (i6 >= 0 && i6 < 261) {
                                                                        if (i34 == 38) {
                                                                            this.f19134 = i6;
                                                                        } else {
                                                                            this.f19129 = i6;
                                                                        }
                                                                    }
                                                                    i32 = i4;
                                                                } else {
                                                                    this.f19151 = 0;
                                                                }
                                                            }
                                                        } else if (i34 == 39) {
                                                            this.f19134 = 256;
                                                        } else if (i34 >= 40 && i34 <= 47) {
                                                            this.f19129 = i34 - 40;
                                                        } else if (i34 == 49) {
                                                            this.f19129 = 257;
                                                        } else if (i34 >= 90 && i34 <= 97) {
                                                            this.f19134 = i34 - 82;
                                                        } else if (i34 >= 100 && i34 <= 107) {
                                                            this.f19129 = i34 - 92;
                                                        }
                                                    }
                                                } else if (i33 <= 0) {
                                                    i34 = 0;
                                                    if (i34 == 0) {
                                                        this.f19134 = 256;
                                                        this.f19129 = 257;
                                                        this.f19150 = 0;
                                                    } else if (i34 == 1) {
                                                        this.f19150 |= 1;
                                                    } else if (i34 == 2) {
                                                        this.f19150 |= 256;
                                                    } else if (i34 == 3) {
                                                        this.f19150 |= 2;
                                                    } else if (i34 == 4) {
                                                        this.f19150 |= 4;
                                                    } else if (i34 == 5) {
                                                        this.f19150 = i9 | this.f19150;
                                                    } else if (i34 == 7) {
                                                        this.f19150 |= 16;
                                                    } else if (i34 == i9) {
                                                        this.f19150 |= 32;
                                                    } else if (i34 == 9) {
                                                        this.f19150 |= 64;
                                                    } else if (i34 != 10) {
                                                        if (i34 == 22) {
                                                            this.f19150 &= -258;
                                                        } else if (i34 == 23) {
                                                            this.f19150 &= -3;
                                                        } else if (i34 == 24) {
                                                            this.f19150 &= -5;
                                                        } else if (i34 == 25) {
                                                            this.f19150 &= -9;
                                                        } else if (i34 == 27) {
                                                            this.f19150 &= -17;
                                                        } else if (i34 == 28) {
                                                            this.f19150 &= -33;
                                                        } else if (i34 == 29) {
                                                            this.f19150 &= -65;
                                                        } else if (i34 < 30) {
                                                            if (i34 != 38) {
                                                                i4 = i32 + 2;
                                                                if (i4 <= i33) {
                                                                    i5 = iArr[i32 + 1];
                                                                    if (i5 == 2) {
                                                                        i7 = i32 + 4;
                                                                        if (i7 <= i33) {
                                                                            i8 = iArr[i4];
                                                                            int i38 = iArr[i32 + 3];
                                                                            int i39 = iArr[i7];
                                                                            if (i8 >= 0) {
                                                                                this.f19151 = 0;
                                                                            } else {
                                                                                this.f19151 = 0;
                                                                            }
                                                                            i32 = i7;
                                                                        }
                                                                    } else if (i5 == 5) {
                                                                        i6 = iArr[i4];
                                                                        if (i6 >= 0) {
                                                                            if (i34 == 38) {
                                                                                this.f19134 = i6;
                                                                            } else {
                                                                                this.f19129 = i6;
                                                                            }
                                                                        }
                                                                        i32 = i4;
                                                                    } else {
                                                                        this.f19151 = 0;
                                                                    }
                                                                }
                                                            } else {
                                                                i4 = i32 + 2;
                                                                if (i4 <= i33) {
                                                                    i5 = iArr[i32 + 1];
                                                                    if (i5 == 2) {
                                                                        i7 = i32 + 4;
                                                                        if (i7 <= i33) {
                                                                            i8 = iArr[i4];
                                                                            int i310 = iArr[i32 + 3];
                                                                            int i311 = iArr[i7];
                                                                            if (i8 >= 0) {
                                                                                this.f19151 = 0;
                                                                            } else {
                                                                                this.f19151 = 0;
                                                                            }
                                                                            i32 = i7;
                                                                        }
                                                                    } else if (i5 == 5) {
                                                                        i6 = iArr[i4];
                                                                        if (i6 >= 0) {
                                                                            if (i34 == 38) {
                                                                                this.f19134 = i6;
                                                                            } else {
                                                                                this.f19129 = i6;
                                                                            }
                                                                        }
                                                                        i32 = i4;
                                                                    } else {
                                                                        this.f19151 = 0;
                                                                    }
                                                                }
                                                            }
                                                        } else if (i34 != 38) {
                                                            i4 = i32 + 2;
                                                            if (i4 <= i33) {
                                                                i5 = iArr[i32 + 1];
                                                                if (i5 == 2) {
                                                                    i7 = i32 + 4;
                                                                    if (i7 <= i33) {
                                                                        i8 = iArr[i4];
                                                                        int i312 = iArr[i32 + 3];
                                                                        int i313 = iArr[i7];
                                                                        if (i8 >= 0) {
                                                                            this.f19151 = 0;
                                                                        } else {
                                                                            this.f19151 = 0;
                                                                        }
                                                                        i32 = i7;
                                                                    }
                                                                } else if (i5 == 5) {
                                                                    i6 = iArr[i4];
                                                                    if (i6 >= 0) {
                                                                        if (i34 == 38) {
                                                                            this.f19134 = i6;
                                                                        } else {
                                                                            this.f19129 = i6;
                                                                        }
                                                                    }
                                                                    i32 = i4;
                                                                } else {
                                                                    this.f19151 = 0;
                                                                }
                                                            }
                                                        } else {
                                                            i4 = i32 + 2;
                                                            if (i4 <= i33) {
                                                                i5 = iArr[i32 + 1];
                                                                if (i5 == 2) {
                                                                    i7 = i32 + 4;
                                                                    if (i7 <= i33) {
                                                                        i8 = iArr[i4];
                                                                        int i314 = iArr[i32 + 3];
                                                                        int i315 = iArr[i7];
                                                                        if (i8 >= 0) {
                                                                            this.f19151 = 0;
                                                                        } else {
                                                                            this.f19151 = 0;
                                                                        }
                                                                        i32 = i7;
                                                                    }
                                                                } else if (i5 == 5) {
                                                                    i6 = iArr[i4];
                                                                    if (i6 >= 0) {
                                                                        if (i34 == 38) {
                                                                            this.f19134 = i6;
                                                                        } else {
                                                                            this.f19129 = i6;
                                                                        }
                                                                    }
                                                                    i32 = i4;
                                                                } else {
                                                                    this.f19151 = 0;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                i32++;
                                                i9 = 8;
                                                i30 = 11;
                                            }
                                            break;
                                        }
                                        break;
                                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                        int iM154012 = m15403(0, 0, true);
                                        if (iM154012 == 5) {
                                            abstractC21803.mo13840(4, new byte[]{27, 91, UTF8.S_P3A, KeyFactorySpi.x25519_type});
                                            break;
                                        } else if (iM154012 == 6) {
                                            Locale locale = Locale.US;
                                            abstractC21803.m48569(C8015.m21119("\u001b[", this.f19146 + 1, l.b, "R", this.f19157 + 1));
                                            break;
                                        }
                                        break;
                                    default:
                                        switch (i) {
                                            case 114:
                                                int iMax2 = Math.max(0, Math.min(m15403(0, 1, true) - 1, this.f19153 - 2));
                                                this.f19136 = iMax2;
                                                this.f19156 = Math.max(iMax2 + 2, Math.min(m15403(1, this.f19153, true), this.f19153));
                                                m15413(0, 0);
                                                break;
                                            case 115:
                                                if (m15400(2048)) {
                                                    int iMin6 = Math.min(m15403(0, 1, true) - 1, this.f19142 - 2);
                                                    this.f19137 = iMin6;
                                                    this.f19147 = Math.max(iMin6 + 1, Math.min(m15403(1, this.f19142, true), this.f19142));
                                                    m15413(0, 0);
                                                } else {
                                                    m15419();
                                                }
                                                break;
                                            case 116:
                                                int iM154013 = m15403(0, 0, true);
                                                if (iM154013 == 11) {
                                                    abstractC21803.m48569("\u001b[1t");
                                                    break;
                                                } else if (iM154013 == 13) {
                                                    abstractC21803.m48569("\u001b[3;0;0t");
                                                    break;
                                                } else if (iM154013 == 14) {
                                                    Locale locale2 = Locale.US;
                                                    abstractC21803.m48569(C8015.m21119("\u001b[4;", this.f19153 * 12, l.b, am.aI, this.f19142 * 12));
                                                    break;
                                                } else {
                                                    Stack stack = this.f19122;
                                                    switch (iM154013) {
                                                        case 18:
                                                            Locale locale3 = Locale.US;
                                                            abstractC21803.m48569(C8015.m21119("\u001b[8;", this.f19153, l.b, am.aI, this.f19142));
                                                            break;
                                                        case 19:
                                                            Locale locale4 = Locale.US;
                                                            abstractC21803.m48569(C8015.m21119("\u001b[9;", this.f19153, l.b, am.aI, this.f19142));
                                                            break;
                                                        case 20:
                                                            abstractC21803.m48569("\u001b]LIconLabel\u001b\\");
                                                            break;
                                                        case 21:
                                                            abstractC21803.m48569("\u001b]l\u001b\\");
                                                            break;
                                                        case 22:
                                                            stack.push(this.f19145);
                                                            if (stack.size() > 20) {
                                                                stack.remove(0);
                                                            }
                                                            break;
                                                        case 23:
                                                            if (!stack.isEmpty()) {
                                                                String str = (String) stack.pop();
                                                                String str2 = this.f19145;
                                                                this.f19145 = str;
                                                                if (!C13638.equals(str2, str)) {
                                                                    abstractC21803.mo13842();
                                                                }
                                                            }
                                                            break;
                                                    }
                                                }
                                                break;
                                            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                                m15407();
                                                break;
                                            default:
                                                m15406(i);
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m15405(int i) {
        if (i == 7) {
            m15416("\u0007");
        } else if (i == 27) {
            m15409(11);
        } else {
            m15412(i);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m15416(String str) {
        char c;
        String strSubstring;
        int i = 0;
        int i2 = -1;
        while (true) {
            StringBuilder sb = this.f19154;
            c = ';';
            if (i >= sb.length()) {
                strSubstring = "";
                break;
            }
            char cCharAt = sb.charAt(i);
            if (cCharAt == ';') {
                strSubstring = sb.substring(i + 1);
                break;
            } else if (cCharAt < '0' || cCharAt > '9') {
                this.f19151 = 0;
                return;
            } else {
                i2 = (i2 < 0 ? 0 : i2 * 10) + (cCharAt - '0');
                i++;
            }
        }
        AbstractC21803 abstractC21803 = this.f19138;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            String str2 = this.f19145;
            this.f19145 = strSubstring;
            if (!C13638.equals(str2, strSubstring)) {
                abstractC21803.mo13842();
            }
        } else {
            int i3 = 255;
            C11926 c11926 = this.f19121;
            if (i2 == 4) {
                int i4 = 0;
                int i5 = -1;
                int i6 = -1;
                while (true) {
                    boolean z = i4 == strSubstring.length();
                    char cCharAt2 = z ? ';' : strSubstring.charAt(i4);
                    if (cCharAt2 == ';') {
                        if (i5 < 0) {
                            i5 = i4 + 1;
                        } else {
                            if (i6 < 0 || i6 > 255) {
                                break;
                            }
                            c11926.m29726(i6, strSubstring.substring(i5, i4));
                            abstractC21803.mo13835();
                            i5 = -1;
                            i6 = -1;
                        }
                    } else if (i5 < 0) {
                        if (i5 >= 0 || cCharAt2 < '0' || cCharAt2 > '9') {
                            this.f19151 = 0;
                            return;
                        }
                        i6 = (i6 < 0 ? 0 : i6 * 10) + (cCharAt2 - '0');
                    }
                    if (!z) {
                        i4++;
                    }
                }
                this.f19151 = 0;
                return;
            }
            if (i2 == 52) {
                try {
                    abstractC21803.mo13841(new String(Base64.decode(strSubstring.substring(strSubstring.indexOf(l.b) + 1), 0), StandardCharsets.UTF_8));
                } catch (Exception unused) {
                }
            } else if (i2 != 104) {
                if (i2 != 119) {
                    switch (i2) {
                        case 10:
                        case 11:
                        case 12:
                            int i7 = i2 + 246;
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                boolean z2 = i8 == strSubstring.length();
                                if (z2 || strSubstring.charAt(i8) == c) {
                                    try {
                                        String strSubstring2 = strSubstring.substring(i9, i8);
                                        if ("?".equals(strSubstring2)) {
                                            int i10 = c11926.f40021[i7];
                                            int i11 = (((16711680 & i10) >> 16) * 65535) / i3;
                                            int i12 = (((i10 & 65280) >> 8) * 65535) / i3;
                                            int i13 = ((i10 & 255) * 65535) / i3;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("\u001b]");
                                            sb2.append(i2);
                                            sb2.append(";rgb:");
                                            Locale locale = Locale.US;
                                            sb2.append(String.format(locale, "%04x", Integer.valueOf(i11)));
                                            sb2.append("/");
                                            sb2.append(String.format(locale, "%04x", Integer.valueOf(i12)));
                                            sb2.append("/");
                                            sb2.append(String.format(locale, "%04x", Integer.valueOf(i13)));
                                            try {
                                                sb2.append(str);
                                                abstractC21803.m48569(sb2.toString());
                                            } catch (NumberFormatException unused2) {
                                                continue;
                                            }
                                        } else {
                                            c11926.m29726(i7, strSubstring2);
                                            abstractC21803.mo13835();
                                        }
                                        i7++;
                                        if (!z2 && i7 <= 258 && (i8 = i8 + 1) < strSubstring.length()) {
                                            i9 = i8;
                                        }
                                        break;
                                    } catch (NumberFormatException unused3) {
                                    }
                                }
                                i8++;
                                c = ';';
                                i3 = 255;
                            }
                            break;
                        default:
                            switch (i2) {
                                case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                                    int i14 = i2 + 146;
                                    c11926.f40021[i14] = C11926.f40020.f46172[i14];
                                    abstractC21803.mo13835();
                                    break;
                                default:
                                    this.f19151 = 0;
                                    break;
                            }
                            break;
                    }
                }
            } else if (strSubstring.isEmpty()) {
                c11926.m29725();
                abstractC21803.mo13835();
            } else {
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    boolean z3 = i15 == strSubstring.length();
                    if (z3 || strSubstring.charAt(i15) == ';') {
                        try {
                            int i17 = Integer.parseInt(strSubstring.substring(i16, i15));
                            c11926.f40021[i17] = C11926.f40020.f46172[i17];
                            abstractC21803.mo13835();
                            if (z3) {
                                break;
                            }
                            i15++;
                            i16 = i15;
                        } catch (NumberFormatException unused4) {
                            continue;
                        }
                    }
                    i15++;
                }
            }
        }
        this.f19151 = 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m15414(int i, int i2, int i3, int i4) {
        this.f19149.m13567(i, i2, i3, i4, 32, m15417());
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private long m15417() {
        return C0761.m3276(this.f19134, this.f19129, this.f19150);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m15413(int i, int i2) {
        boolean zM15400 = m15400(4);
        int i3 = zM15400 ? this.f19136 : 0;
        int i4 = zM15400 ? this.f19156 : this.f19153;
        int i5 = zM15400 ? this.f19137 : 0;
        m15410(Math.max(i3, Math.min(i2 + i3, i4 - 1)), Math.max(i5, Math.min(i + i5, (zM15400 ? this.f19147 : this.f19142) - 1)));
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m15408() {
        this.f19131++;
        int i = this.f19137;
        if (i != 0 || this.f19147 != this.f19142) {
            C4869 c4869 = this.f19149;
            int i2 = this.f19136;
            c4869.m13566(i, i2 + 1, this.f19147 - i, (this.f19156 - i2) - 1, i, i2);
            C4869 c48610 = this.f19149;
            int i3 = this.f19137;
            c48610.m13567(i3, this.f19156 - 1, this.f19147 - i3, 1, 32, this.f19150);
            return;
        }
        this.f19149.m13570(this.f19136, this.f19156, m15417());
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m15406(int i) {
        int[] iArr = this.f19123;
        if (i < 48 || i > 57) {
            if (i == 59) {
                int i2 = this.f19139;
                if (i2 < iArr.length) {
                    this.f19139 = i2 + 1;
                }
                m15409(this.f19151);
                return;
            }
            this.f19151 = 0;
            return;
        }
        int i3 = this.f19139;
        if (i3 < iArr.length) {
            int i4 = iArr[i3];
            int i5 = i - 48;
            if (i4 >= 0) {
                i5 += i4 * 10;
            }
            iArr[i3] = i5;
        }
        m15409(this.f19151);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m15403(int i, int i2, boolean z) {
        int i3 = this.f19123[i];
        return (i3 < 0 || (i3 == 0 && z)) ? i2 : i3;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m15412(int i) {
        StringBuilder sb = this.f19154;
        if (sb.length() < 8192) {
            sb.appendCodePoint(i);
            m15409(this.f19151);
        } else {
            this.f19151 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0017  */
    /* JADX WARN: Code duplicated, block: B:13:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:16:0x002e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:88:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m15421(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        this.f19135 = i;
        if (this.f19144) {
            if (!this.f19125) {
                i2 = i;
            } else if (i != 48) {
                switch (i) {
                    case 95:
                        i2 = 32;
                        break;
                    case 96:
                        i2 = 9670;
                        break;
                    case 97:
                        i2 = 9618;
                        break;
                    case 98:
                        i2 = 9225;
                        break;
                    case q.f /* 99 */:
                        i2 = 9228;
                        break;
                    case 100:
                        i2 = 13;
                        break;
                    case 101:
                        i2 = 9226;
                        break;
                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                        i2 = PicnicEngine.MAX_AUX_BYTES;
                        break;
                    case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                        i2 = 177;
                        break;
                    case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                        i2 = 10;
                        break;
                    case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                        i2 = 9227;
                        break;
                    case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                        i2 = 9496;
                        break;
                    case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                        i2 = 9488;
                        break;
                    case 108:
                        i2 = 9484;
                        break;
                    case 109:
                        i2 = 9492;
                        break;
                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                        i2 = 9532;
                        break;
                    case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                        i2 = 9146;
                        break;
                    case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                        i2 = 9147;
                        break;
                    case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                        i2 = 9472;
                        break;
                    case 114:
                        i2 = 9148;
                        break;
                    case 115:
                        i2 = 9149;
                        break;
                    case 116:
                        i2 = 9500;
                        break;
                    case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                        i2 = 9508;
                        break;
                    case 118:
                        i2 = 9524;
                        break;
                    case 119:
                        i2 = 9516;
                        break;
                    case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                        i2 = 9474;
                        break;
                    case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                        i2 = 8804;
                        break;
                    case 122:
                        i2 = 8805;
                        break;
                    case 123:
                        i2 = 960;
                        break;
                    case 124:
                        i2 = 8800;
                        break;
                    case q.h /* 125 */:
                        i2 = 163;
                        break;
                    case 126:
                        i2 = 183;
                        break;
                    default:
                        i2 = i;
                        break;
                }
            } else {
                i2 = 9608;
            }
        } else if (!this.f19128) {
            i2 = i;
        } else if (i != 48) {
            switch (i) {
                case 95:
                    i2 = 32;
                    break;
                case 96:
                    i2 = 9670;
                    break;
                case 97:
                    i2 = 9618;
                    break;
                case 98:
                    i2 = 9225;
                    break;
                case q.f /* 99 */:
                    i2 = 9228;
                    break;
                case 100:
                    i2 = 13;
                    break;
                case 101:
                    i2 = 9226;
                    break;
                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                    i2 = PicnicEngine.MAX_AUX_BYTES;
                    break;
                case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                    i2 = 177;
                    break;
                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                    i2 = 10;
                    break;
                case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                    i2 = 9227;
                    break;
                case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                    i2 = 9496;
                    break;
                case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                    i2 = 9488;
                    break;
                case 108:
                    i2 = 9484;
                    break;
                case 109:
                    i2 = 9492;
                    break;
                case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                    i2 = 9532;
                    break;
                case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                    i2 = 9146;
                    break;
                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                    i2 = 9147;
                    break;
                case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                    i2 = 9472;
                    break;
                case 114:
                    i2 = 9148;
                    break;
                case 115:
                    i2 = 9149;
                    break;
                case 116:
                    i2 = 9500;
                    break;
                case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                    i2 = 9508;
                    break;
                case 118:
                    i2 = 9524;
                    break;
                case 119:
                    i2 = 9516;
                    break;
                case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                    i2 = 9474;
                    break;
                case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                    i2 = 8804;
                    break;
                case 122:
                    i2 = 8805;
                    break;
                case 123:
                    i2 = 960;
                    break;
                case 124:
                    i2 = 8800;
                    break;
                case q.h /* 125 */:
                    i2 = 163;
                    break;
                case 126:
                    i2 = 183;
                    break;
                default:
                    i2 = i;
                    break;
            }
        } else {
            i2 = 9608;
        }
        boolean zM15400 = m15400(8);
        int iM31705 = C12757.m31705(i2);
        boolean z = this.f19157 == this.f19147 - 1;
        if (zM15400) {
            if (z && ((this.f19127 && iM31705 == 1) || iM31705 == 2)) {
                C4869 c4869 = this.f19149;
                c4869.f17124[c4869.m13573(this.f19146)].f61443 = true;
                this.f19157 = this.f19137;
                int i6 = this.f19146 + 1;
                if (i6 < this.f19156) {
                    this.f19146 = i6;
                } else {
                    m15408();
                }
            }
        } else if (z && iM31705 == 2) {
            return;
        }
        if (this.f19152 && iM31705 > 0 && (i4 = (i3 = this.f19157) + iM31705) < (i5 = this.f19147)) {
            C4869 c48610 = this.f19149;
            int i7 = this.f19146;
            c48610.m13566(i3, i7, i5 - i4, 1, i4, i7);
        }
        this.f19149.m13568(this.f19157 - ((iM31705 > 0 || this.f19157 <= 0 || this.f19127) ? 0 : 1), this.f19146, i2, m15417());
        if (zM15400 && iM31705 > 0) {
            this.f19127 = this.f19157 == this.f19147 - iM31705;
        }
        this.f19157 = Math.min(this.f19157 + iM31705, this.f19147 - 1);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m15422(int i) {
        this.f19157 = i;
        this.f19127 = false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m15410(int i, int i2) {
        this.f19146 = Math.max(0, Math.min(i, this.f19153 - 1));
        this.f19157 = Math.max(0, Math.min(i2, this.f19142 - 1));
        this.f19127 = false;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m15439() {
        return this.f19131;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15427() {
        this.f19131 = 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m15438() {
        this.f19155 = 0;
        this.f19139 = 0;
        this.f19126 = false;
        this.f19151 = 0;
        this.f19152 = false;
        this.f19137 = 0;
        this.f19136 = 0;
        this.f19156 = this.f19153;
        this.f19147 = this.f19142;
        this.f19127 = false;
        C2752 c2752 = this.f19148;
        c2752.f10563 = 256;
        C2752 c2753 = this.f19141;
        c2753.f10563 = 256;
        this.f19134 = 256;
        c2752.f10558 = 257;
        c2753.f10558 = 257;
        this.f19129 = 257;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < this.f19142) {
                boolean[] zArr = this.f19158;
                if ((i & 7) != 0 || i == 0) {
                    z = false;
                }
                zArr[i] = z;
                i++;
            } else {
                this.f19128 = false;
                this.f19125 = false;
                this.f19144 = true;
                c2753.f10556 = 0;
                c2753.f10559 = 0;
                c2753.f10562 = 0;
                c2753.f10560 = 0;
                c2752.f10556 = 0;
                c2752.f10559 = 0;
                c2752.f10562 = 0;
                c2752.f10560 = 0;
                this.f19132 = 0;
                m15415(8, true);
                m15415(16, true);
                int i2 = this.f19132;
                c2752.f10556 = i2;
                c2753.f10556 = i2;
                this.f19120 = i2;
                this.f19130 = (byte) 0;
                this.f19140 = (byte) 0;
                this.f19121.m29725();
                this.f19138.mo13835();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m15426(int i, int i2, int i3, int i4) {
        return this.f19149.m13564(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15432(String str) {
        String strReplaceAll = str.replaceAll("(\u001b|[\u0080-\u009f])", "").replaceAll("\r?\n", "\r");
        if (strReplaceAll.isEmpty()) {
            return;
        }
        boolean zM15400 = m15400(1024);
        AbstractC21803 abstractC21803 = this.f19138;
        if (zM15400) {
            abstractC21803.m48569("\u001b[200~");
        }
        abstractC21803.m48569(strReplaceAll);
        if (zM15400) {
            abstractC21803.m48569("\u001b[201~");
        }
    }
}
