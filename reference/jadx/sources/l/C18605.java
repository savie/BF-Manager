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

/* JADX INFO: renamed from: l.ܿ᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 01T6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18605 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC8909 f60454;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f60455;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f60456;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f60457;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f60459;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f60460;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f60461;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f60462;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f60463;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean[] f60466;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f60468;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public byte f60469;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f60470;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f60473;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f60474;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f60475;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f60476;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f60477;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f60479;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C24573 f60480;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f60481;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public byte f60482;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f60483;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f60484;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24573 f60485;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f60489;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C24573 f60490;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f60491;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Stack f60465 = new Stack();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f60478 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f60487 = new int[16];

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f60458 = new StringBuilder();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C21589 f60464 = new C21589();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C21589 f60453 = new C21589();

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f60486 = true;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f60467 = 0;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f60488 = new byte[4];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f60471 = -1;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C14875 f60472 = new C14875();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int m43235(int i) {
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

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private boolean m43240(int i) {
        return (i & this.f60470) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m43249(int i, boolean z) {
        if (z) {
            if (i == 64) {
                m43249(128, false);
            } else if (i == 128) {
                m43249(64, false);
            }
        }
        if (z) {
            this.f60470 = i | this.f60470;
        } else {
            this.f60470 = (~i) & this.f60470;
        }
    }

    public C18605(C24244 c24244, int i, int i2) {
        this.f60454 = c24244;
        C24573 c24573 = new C24573(i, 2000, i2);
        this.f60490 = c24573;
        this.f60480 = c24573;
        this.f60485 = new C24573(i, i2, i2);
        this.f60484 = i2;
        this.f60461 = i;
        this.f60466 = new boolean[i];
        m43267();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C24573 m43268() {
        return this.f60480;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m43265() {
        return this.f60480 == this.f60485;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43258(int i, int i2) {
        int i3 = this.f60484;
        if (i3 == i2 && this.f60461 == i) {
            return;
        }
        if (i < 2 || i2 < 2) {
            throw new IllegalArgumentException(C6934.m19217("rows=", i2, i, ", columns="));
        }
        if (i3 != i2) {
            this.f60484 = i2;
            this.f60463 = 0;
            this.f60475 = i2;
        }
        int i4 = this.f60461;
        if (i4 != i) {
            this.f60461 = i;
            boolean[] zArr = this.f60466;
            this.f60466 = new boolean[i];
            int i5 = 0;
            while (i5 < this.f60461) {
                this.f60466[i5] = (i5 & 7) == 0 && i5 != 0;
                i5++;
            }
            System.arraycopy(zArr, 0, this.f60466, 0, Math.min(i4, i));
            this.f60462 = 0;
            this.f60474 = this.f60461;
        }
        m43252();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m43252() {
        int[] iArr = {this.f60491, this.f60477};
        C24573 c24573 = this.f60480;
        c24573.m54885(this.f60461, this.f60484, c24573 == this.f60485 ? this.f60484 : this.f60490.f79642, iArr, m43242(), m43265());
        this.f60491 = iArr[0];
        this.f60477 = iArr[1];
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m43263() {
        return this.f60477;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m43269() {
        return this.f60491;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m43270() {
        return this.f60478;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m43264() {
        return m43240(2);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m43271() {
        return m43240(16);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m43254() {
        return m43240(32);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m43262() {
        return m43240(1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43260(int i, byte[] bArr) {
        for (int i2 = 0; i2 < i; i2++) {
            m43234(bArr[i2]);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43234(byte b) {
        int i;
        byte b2;
        byte b3 = this.f60482;
        byte[] bArr = this.f60488;
        int i2 = 65533;
        if (b3 <= 0) {
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                m43257((int) b);
                return;
            }
            if ((b & bo.k) == 192) {
                this.f60482 = (byte) 1;
            } else if ((b & 240) == 224) {
                this.f60482 = (byte) 2;
            } else if ((b & 248) == 240) {
                this.f60482 = (byte) 3;
            } else {
                m43257(65533);
                return;
            }
            byte b4 = this.f60469;
            this.f60469 = (byte) (b4 + 1);
            bArr[b4] = b;
            return;
        }
        if ((b & 192) == 128) {
            byte b5 = this.f60469;
            byte b6 = (byte) (b5 + 1);
            this.f60469 = b6;
            bArr[b5] = b;
            byte b7 = (byte) (b3 - 1);
            this.f60482 = b7;
            if (b7 == 0) {
                if (b6 == 2) {
                    i = 31;
                } else {
                    i = b6 == 3 ? 15 : 7;
                }
                int i3 = ((byte) i) & bArr[0];
                int i4 = 1;
                while (true) {
                    b2 = this.f60469;
                    if (i4 >= b2) {
                        break;
                    }
                    i3 = (i3 << 6) | (bArr[i4] & 63);
                    i4++;
                }
                if ((i3 <= 127 && b2 > 1) || ((i3 < 2047 && b2 > 2) || (i3 < 65535 && b2 > 3))) {
                    i3 = 65533;
                }
                this.f60482 = (byte) 0;
                this.f60469 = (byte) 0;
                if (i3 < 128 || i3 > 159) {
                    int type = Character.getType(i3);
                    if (type != 0 && type != 19) {
                        i2 = i3;
                    }
                    m43257(i2);
                    return;
                }
                return;
            }
            return;
        }
        this.f60482 = (byte) 0;
        this.f60469 = (byte) 0;
        m43241(65533);
        m43234(b);
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
    public final void m43257(int i) {
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
        int iM43233;
        int i17;
        C24573 c24573;
        long j;
        String strM37830;
        if (i != 0) {
            ?? r3 = 0;
            if (i == 24 || i == 26) {
                if (this.f60489 != 0) {
                    this.f60489 = 0;
                    m43241(127);
                    return;
                }
                return;
            }
            int[] iArr = this.f60487;
            int i18 = 1;
            i = 1;
            int i19 = 1;
            if (i == 27) {
                int i20 = this.f60489;
                if (i20 == 13) {
                    return;
                }
                if (i20 == 10) {
                    m43244(i);
                    return;
                }
                this.f60489 = 1;
                this.f60468 = 0;
                Arrays.fill(iArr, -1);
                return;
            }
            AbstractC8909 abstractC8909 = this.f60454;
            switch (i) {
                case 7:
                    if (this.f60489 == 10) {
                        m43244(i);
                    } else {
                        abstractC8909.mo23819();
                    }
                    break;
                case 8:
                    int i21 = this.f60462;
                    int i22 = this.f60491;
                    if (i21 == i22) {
                        int i23 = this.f60477 - 1;
                        if (i23 >= 0) {
                            C24573 c24574 = this.f60480;
                            if (c24574.f79641[c24574.m54889(i23)].f44696) {
                                C24573 c24575 = this.f60480;
                                c24575.f79641[c24575.m54889(i23)].f44696 = false;
                                m43237(i23, this.f60474 - 1);
                            }
                        }
                    } else {
                        m43253(i22 - 1);
                    }
                    break;
                case 9:
                    this.f60491 = m43231(1);
                    break;
                case 10:
                case 11:
                case 12:
                    m43243();
                    break;
                case 13:
                    m43253(this.f60462);
                    break;
                case 14:
                    this.f60486 = false;
                    break;
                case 15:
                    this.f60486 = true;
                    break;
                default:
                    this.f60455 = false;
                    int i24 = this.f60489;
                    StringBuilder sb = this.f60458;
                    switch (i24) {
                        case 0:
                            if (i >= 32) {
                                m43241(i);
                            }
                            break;
                        case 1:
                            if (i == 35) {
                                m43236(2);
                                break;
                            } else if (i != 48) {
                                if (i == 72) {
                                    this.f60466[this.f60491] = true;
                                    break;
                                } else if (i == 80) {
                                    sb.setLength(0);
                                    m43236(13);
                                    break;
                                } else if (i == 91) {
                                    m43236(6);
                                    break;
                                } else if (i == 93) {
                                    sb.setLength(0);
                                    m43236(10);
                                    break;
                                } else if (i == 99) {
                                    m43267();
                                    m43248(0, 0, this.f60461, this.f60484);
                                    m43247(0, 0);
                                    break;
                                } else if (i == 40) {
                                    m43236(3);
                                    break;
                                } else if (i == 41) {
                                    m43236(4);
                                    break;
                                } else if (i == 61) {
                                    m43249(32, true);
                                    break;
                                } else if (i == 62) {
                                    m43249(32, false);
                                    break;
                                } else if (i == 77) {
                                    int i25 = this.f60477;
                                    int i26 = this.f60463;
                                    if (i25 <= i26) {
                                        int i27 = i26 + 1;
                                        this.f60480.m54882(0, i26, this.f60461, this.f60475 - i27, 0, i27);
                                        m43248(0, this.f60463, this.f60461, 1);
                                    } else {
                                        this.f60477 = i25 - 1;
                                    }
                                    break;
                                } else if (i != 78) {
                                    switch (i) {
                                        case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                            int i28 = this.f60491;
                                            int i29 = this.f60462;
                                            if (i28 > i29) {
                                                this.f60491 = i28 - 1;
                                            } else {
                                                int i30 = this.f60475;
                                                int i31 = this.f60463;
                                                int i32 = i30 - i31;
                                                this.f60480.m54882(i29, i31, (this.f60474 - i29) - 1, i32, i29 + 1, i31);
                                                this.f60480.m54883(this.f60462, this.f60463, 1, i32, 32, C14546.m35096(this.f60457, this.f60481, 0));
                                            }
                                            break;
                                        case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                            m43245();
                                            break;
                                        case 56:
                                            m43232();
                                            break;
                                        case 57:
                                            int i33 = this.f60491;
                                            int i34 = this.f60474;
                                            if (i33 < i34 - 1) {
                                                this.f60491 = i33 + 1;
                                            } else {
                                                int i35 = this.f60475;
                                                int i36 = this.f60463;
                                                int i37 = i35 - i36;
                                                C24573 c24576 = this.f60480;
                                                int i38 = this.f60462;
                                                c24576.m54882(i38 + 1, i36, (i34 - i38) - 1, i37, i38, i36);
                                                this.f60480.m54883(this.f60474 - 1, this.f60463, 1, i37, 32, C14546.m35096(this.f60457, this.f60481, 0));
                                            }
                                            break;
                                        default:
                                            switch (i) {
                                                case 68:
                                                    m43243();
                                                    break;
                                                case 69:
                                                    m43253(m43240(4) ? this.f60462 : 0);
                                                    m43243();
                                                    break;
                                                case 70:
                                                    m43237(0, this.f60475 - 1);
                                                    break;
                                                default:
                                                    i2 = 0;
                                                    this.f60489 = i2;
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
                                this.f60489 = i2;
                            } else {
                                this.f60480.m54883(0, 0, this.f60461, this.f60484, 69, m43242());
                            }
                            break;
                        case 3:
                            this.f60473 = i == 48;
                            break;
                        case 4:
                            this.f60460 = i == 48;
                            break;
                        case 5:
                        default:
                            this.f60489 = 0;
                            break;
                        case 6:
                            m43251(i);
                            break;
                        case 7:
                            if (i == 36) {
                                m43236(14);
                            } else if (i == 104 || i == 108) {
                                if (this.f60468 >= iArr.length) {
                                    this.f60468 = iArr.length - 1;
                                }
                                for (int i39 = 0; i39 <= this.f60468; i39++) {
                                    m43259(iArr[i39], i == 104);
                                }
                            } else if (i == 110) {
                                i2 = 0;
                                if (m43233(0, -1, true) != 6) {
                                    this.f60489 = i2;
                                } else {
                                    Locale locale = Locale.US;
                                    abstractC8909.m23822(C0703.m3016("\u001b[?", this.f60477 + 1, l.b, ";1R", this.f60491 + 1));
                                }
                            } else if (i == 74 || i == 75) {
                                this.f60459 = false;
                                boolean z2 = i == 75;
                                int iM43234 = m43233(0, 0, true);
                                if (iM43234 != 0) {
                                    if (iM43234 == 1) {
                                        int i40 = z2 ? this.f60477 : 0;
                                        int i41 = this.f60491 + 1;
                                        i6 = this.f60477 + 1;
                                        i5 = i40;
                                        i4 = i41;
                                    } else if (iM43234 != 2) {
                                        this.f60489 = 0;
                                        i6 = -1;
                                        i4 = -1;
                                        i5 = -1;
                                        i3 = -1;
                                    } else {
                                        int i42 = z2 ? this.f60477 : 0;
                                        int i43 = this.f60461;
                                        i6 = z2 ? this.f60477 + 1 : this.f60484;
                                        i5 = i42;
                                        i4 = i43;
                                    }
                                    i3 = 0;
                                } else {
                                    i3 = this.f60491;
                                    int i44 = this.f60477;
                                    i4 = this.f60461;
                                    int i45 = z2 ? i44 + 1 : this.f60484;
                                    i5 = i44;
                                    i6 = i45;
                                }
                                long jM43242 = m43242();
                                while (i5 < i6) {
                                    for (int i46 = i3; i46 < i4; i46++) {
                                        C24573 c24577 = this.f60480;
                                        if ((((int) (c24577.m54881(c24577.m54889(i5)).f44698[i46] & 2047)) & 128) == 0) {
                                            this.f60480.m54884(i46, i5, 32, jM43242);
                                        }
                                    }
                                    i5++;
                                }
                            } else if (i == 114 || i == 115) {
                                if (this.f60468 >= iArr.length) {
                                    this.f60468 = iArr.length - 1;
                                }
                                for (int i47 = 0; i47 <= this.f60468; i47++) {
                                    int i48 = iArr[i47];
                                    int iM43235 = m43235(i48);
                                    if (iM43235 != -1) {
                                        if (i == 115) {
                                            this.f60479 |= iM43235;
                                        } else {
                                            m43259(i48, (iM43235 & this.f60479) != 0);
                                        }
                                    }
                                }
                            } else {
                                m43238(i);
                            }
                            break;
                        case 8:
                            boolean zM43240 = m43240(4);
                            int i49 = zM43240 ? this.f60463 : 0;
                            int i50 = zM43240 ? this.f60475 : this.f60484;
                            int i51 = zM43240 ? this.f60462 : 0;
                            int i52 = zM43240 ? this.f60474 : this.f60461;
                            int i53 = 5;
                            if (i != 114) {
                                i7 = 116;
                                if (i != 116) {
                                    if (i == 118) {
                                        int iMin = Math.min((m43233(0, 1, true) - 1) + i49, this.f60484);
                                        int iMin2 = Math.min((m43233(1, 1, true) - 1) + i51, this.f60461);
                                        int iMin3 = Math.min(Math.max(m43233(2, this.f60484, true) + i49, iMin), this.f60484);
                                        int iMin4 = Math.min(Math.max(m43233(3, this.f60461, true) + i51, iMin2), this.f60461);
                                        int iMin5 = Math.min((m43233(5, 1, true) - 1) + i49, this.f60484);
                                        int iMin6 = Math.min((m43233(6, 1, true) - 1) + i51, this.f60461);
                                        this.f60480.m54882(iMin2, iMin, Math.min(this.f60461 - iMin6, iMin4 - iMin2), Math.min(this.f60484 - iMin5, iMin3 - iMin), iMin6, iMin5);
                                    } else if (i == 120 || i == 122 || i == 123) {
                                        boolean z3 = i != 120;
                                        boolean z4 = i == 123;
                                        boolean z5 = z3 && z4;
                                        if (z3) {
                                            i17 = 0;
                                            iM43233 = 32;
                                        } else {
                                            iM43233 = m43233(0, -1, true);
                                            i17 = 1;
                                        }
                                        if ((iM43233 >= 32 && iM43233 <= 126) || (iM43233 >= 160 && iM43233 <= 255)) {
                                            int iMin7 = Math.min(m43233(i17, 1, true) + i49, i50 + 1);
                                            int iMin8 = Math.min(m43233(i17 + 1, 1, true) + i51, i52 + 1);
                                            int iMin9 = Math.min(m43233(i17 + 2, this.f60484, true) + i49, i50);
                                            int iMin10 = Math.min(m43233(i17 + 3, this.f60461, true) + i51, i52);
                                            long jM43243 = m43242();
                                            for (int i54 = iMin7 - 1; i54 < iMin9; i54++) {
                                                for (int i55 = iMin8 - 1; i55 < iMin10; i55++) {
                                                    if (z4) {
                                                        C24573 c24578 = this.f60480;
                                                        if ((((int) (c24578.m54881(c24578.m54889(i54)).f44698[i55] & 2047)) & 128) == 0) {
                                                            c24573 = this.f60480;
                                                            if (z5) {
                                                                j = c24573.m54881(c24573.m54889(i54)).f44698[i55];
                                                            } else {
                                                                j = jM43243;
                                                            }
                                                            c24573.m54884(i55, i54, iM43233, j);
                                                        }
                                                    } else {
                                                        c24573 = this.f60480;
                                                        if (z5) {
                                                            j = c24573.m54881(c24573.m54889(i54)).f44698[i55];
                                                        } else {
                                                            j = jM43243;
                                                        }
                                                        c24573.m54884(i55, i54, iM43233, j);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        this.f60489 = 0;
                                    }
                                }
                            } else {
                                i7 = 116;
                            }
                            boolean z6 = i == i7;
                            int iMin11 = Math.min(m43233(0, 1, true) - 1, i50) + i49;
                            int iMin12 = Math.min(m43233(1, 1, true) - 1, i52) + i51;
                            int iMin13 = Math.min(m43233(2, this.f60484, true) + 1, i50 - 1) + i49;
                            int iMin14 = Math.min(m43233(3, this.f60461, true) + 1, i52 - 1) + i51;
                            int i56 = this.f60468;
                            if (i56 >= 4) {
                                if (i56 >= iArr.length) {
                                    this.f60468 = iArr.length - 1;
                                }
                                int i57 = 4;
                                while (i57 <= this.f60468) {
                                    int iM43236 = m43233(i57, r3, r3);
                                    if (iM43236 != 0) {
                                        if (iM43236 != i18) {
                                            if (iM43236 != 4) {
                                                if (iM43236 != i53) {
                                                    i8 = 16;
                                                    if (iM43236 == 7) {
                                                        z = true;
                                                    } else if (iM43236 == 22) {
                                                        z = false;
                                                    } else if (iM43236 == 27) {
                                                        z = false;
                                                    } else if (iM43236 == 24) {
                                                        z = false;
                                                    } else if (iM43236 != 25) {
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
                                        C24573 c24579 = this.f60480;
                                        boolean zM43241 = m43240(4096);
                                        int i58 = iMin11;
                                        while (i58 < iMin13) {
                                            C14129 c14129 = c24579.f79641[c24579.m54889(i58)];
                                            int i59 = (zM43241 || i58 == iMin11) ? iMin12 : i51;
                                            if (zM43241) {
                                                i13 = i52;
                                            } else {
                                                i13 = i52;
                                                if (i58 + 1 != iMin13) {
                                                    i14 = i13;
                                                }
                                                while (i59 < i14) {
                                                    int i60 = i14;
                                                    long j2 = c14129.f44698[i59];
                                                    int iM35097 = C14546.m35097(j2);
                                                    int i61 = iMin14;
                                                    int iM35095 = C14546.m35095(j2);
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
                                                    c14129.f44698[i59] = C14546.m35096(iM35097, iM35095, i16);
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
                                                long j3 = c14129.f44698[i59];
                                                int iM35098 = C14546.m35097(j3);
                                                int i65 = iMin14;
                                                int iM35096 = C14546.m35095(j3);
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
                                                c14129.f44698[i59] = C14546.m35096(iM35098, iM35096, i16);
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
                                        c24579.getClass();
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
                            m43244(i);
                            break;
                        case 11:
                            if (i != 92) {
                                m43246(27);
                                m43246(i);
                                m43236(10);
                            } else {
                                m43250("\u001b\\");
                            }
                            break;
                        case 12:
                            if (i == 99) {
                                abstractC8909.m23822("\u001b[>41;320;0c");
                            } else if (i != 109) {
                                m43238(i);
                            }
                            break;
                        case 13:
                            if (i != 92) {
                                if (sb.length() <= 8192) {
                                    sb.appendCodePoint(i);
                                    m43236(this.f60489);
                                } else {
                                    sb.setLength(0);
                                }
                                break;
                            } else {
                                String string = sb.toString();
                                if (string.startsWith("$q")) {
                                    if (string.equals("$q\"p")) {
                                        abstractC8909.m23822("\u001bP1$r64;1\"p\u001b\\");
                                    } else {
                                        this.f60489 = 0;
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
                                                    strM37830 = "256";
                                                    break;
                                                case "TN":
                                                case "name":
                                                    strM37830 = "xterm";
                                                    break;
                                                default:
                                                    strM37830 = C15864.m37830(string2, m43240(1), m43240(32));
                                                    break;
                                            }
                                            if (strM37830 == null) {
                                                abstractC8909.m23822("\u001bP0+r" + str + "\u001b\\");
                                            } else {
                                                StringBuilder sb3 = new StringBuilder();
                                                for (int i69 = 0; i69 < strM37830.length(); i69++) {
                                                    sb3.append(String.format("%02X", Integer.valueOf(strM37830.charAt(i69))));
                                                }
                                                abstractC8909.m23822("\u001bP1+r" + str + "=" + ((Object) sb3) + "\u001b\\");
                                            }
                                        }
                                    }
                                }
                            }
                            this.f60489 = 0;
                            break;
                        case 14:
                            if (i == 112) {
                                int iM43237 = m43233(0, 0, true);
                                if (iM43237 != 47 && iM43237 != 1047 && iM43237 != 1049) {
                                    int iM43238 = m43235(iM43237);
                                    if (iM43238 != -1) {
                                        i19 = 0;
                                    } else if (!m43240(iM43238)) {
                                        i19 = 2;
                                    }
                                } else if (this.f60480 != this.f60485) {
                                    i19 = 2;
                                }
                                Locale locale2 = Locale.US;
                                abstractC8909.m23822(C0703.m3016("\u001b[?", iM43237, l.b, "$y", i19));
                            } else {
                                this.f60489 = 0;
                            }
                            break;
                        case 15:
                            int iM43239 = m43233(0, 0, true);
                            if (i == 113) {
                                switch (iM43239) {
                                    case 0:
                                    case 1:
                                    case 2:
                                        this.f60478 = 0;
                                        break;
                                    case 3:
                                    case 4:
                                        this.f60478 = 1;
                                        break;
                                    case 5:
                                    case 6:
                                        this.f60478 = 2;
                                        break;
                                }
                            } else {
                                if (i != 116 && i != 117) {
                                    this.f60489 = 0;
                                }
                                break;
                            }
                            break;
                        case 16:
                            int iM432310 = m43233(0, 0, true);
                            if (i != 120 || iM432310 < 0 || iM432310 > 2) {
                                this.f60489 = 0;
                            } else {
                                m43249(4096, iM432310 == 2);
                            }
                            break;
                        case 17:
                            if (i != 113) {
                                this.f60489 = 0;
                            } else {
                                int iM432311 = m43233(0, 0, true);
                                if (iM432311 == 0 || iM432311 == 2) {
                                    this.f60476 &= -129;
                                } else if (iM432311 == 1) {
                                    this.f60476 |= 128;
                                } else {
                                    this.f60489 = 0;
                                }
                            }
                            break;
                        case 18:
                            if (i == 125) {
                                int i70 = this.f60474 - this.f60491;
                                int iMin15 = Math.min(m43233(0, 1, true), i70);
                                C24573 c245710 = this.f60480;
                                int i71 = this.f60491;
                                c245710.m54882(i71, 0, i70 - iMin15, this.f60484, i71 + iMin15, 0);
                                m43248(this.f60491, 0, iMin15, this.f60484);
                            } else if (i == 126) {
                                int i72 = this.f60474 - this.f60491;
                                int iMin16 = Math.min(m43233(0, 1, true), i72);
                                int i73 = i72 - iMin16;
                                C24573 c245711 = this.f60480;
                                int i74 = this.f60491;
                                c245711.m54882(i74 + iMin16, 0, i73, this.f60484, i74, 0);
                                m43248(this.f60477 + i73, 0, iMin16, this.f60484);
                            } else {
                                this.f60489 = 0;
                            }
                            break;
                        case 19:
                            if (i == 112) {
                                m43267();
                            } else {
                                this.f60489 = 0;
                            }
                            break;
                    }
                    if (!this.f60455) {
                        this.f60489 = 0;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m43231(int i) {
        int i2 = this.f60491;
        while (true) {
            i2++;
            if (i2 < this.f60461) {
                if (this.f60466[i2] && (i = i - 1) == 0) {
                    return Math.min(i2, this.f60474);
                }
            } else {
                return this.f60474 - 1;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43259(int i, boolean z) {
        int iM43235 = m43235(i);
        if (iM43235 != -1) {
            m43249(iM43235, z);
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
                this.f60462 = 0;
                this.f60474 = this.f60461;
                return;
            default:
                switch (i) {
                    case 3:
                        this.f60463 = 0;
                        this.f60462 = 0;
                        this.f60475 = this.f60484;
                        this.f60474 = this.f60461;
                        m43249(2048, false);
                        m43248(0, 0, this.f60461, this.f60484);
                        m43237(0, 0);
                        return;
                    case 4:
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                        return;
                    case 6:
                        if (z) {
                            m43247(0, 0);
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
                                            m43245();
                                        } else {
                                            m43232();
                                        }
                                        break;
                                    default:
                                        this.f60489 = 0;
                                        break;
                                }
                                return;
                        }
                }
        }
        C24573 c24573 = this.f60485;
        C24573 c24574 = z ? c24573 : this.f60490;
        if (c24574 != this.f60480) {
            boolean z2 = (c24574.f79644 == this.f60461 && c24574.f79643 == this.f60484) ? false : true;
            if (z) {
                m43245();
            }
            this.f60480 = c24574;
            if (!z) {
                C21589 c21589 = this.f60464;
                int i2 = c21589.f68979;
                int i3 = c21589.f68975;
                m43232();
                if (z2) {
                    this.f60491 = i2;
                    this.f60477 = i3;
                }
            }
            if (z2) {
                m43252();
            }
            if (c24574 == c24573) {
                c24574.m54883(0, 0, this.f60461, this.f60484, 32, m43242());
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m43243() {
        int i = this.f60477;
        int i2 = this.f60475;
        int i3 = i + 1;
        if (i >= i2) {
            if (i != this.f60484 - 1) {
                this.f60477 = i3;
                this.f60459 = false;
                return;
            }
            return;
        }
        if (i3 == i2) {
            m43239();
            i3 = this.f60475 - 1;
        }
        this.f60477 = i3;
        this.f60459 = false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m43236(int i) {
        this.f60489 = i;
        this.f60455 = true;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m43245() {
        C21589 c21589 = this.f60480 == this.f60490 ? this.f60464 : this.f60453;
        c21589.f68975 = this.f60477;
        c21589.f68979 = this.f60491;
        c21589.f68978 = this.f60476;
        c21589.f68977 = this.f60457;
        c21589.f68973 = this.f60481;
        c21589.f68980 = this.f60470;
        c21589.f68976 = this.f60473;
        c21589.f68974 = this.f60460;
        c21589.f68972 = this.f60486;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m43232() {
        C21589 c21589 = this.f60480 == this.f60490 ? this.f60464 : this.f60453;
        m43237(c21589.f68975, c21589.f68979);
        this.f60476 = c21589.f68978;
        this.f60457 = c21589.f68977;
        this.f60481 = c21589.f68973;
        this.f60470 = (this.f60470 & (-13)) | (c21589.f68980 & 12);
        this.f60473 = c21589.f68976;
        this.f60460 = c21589.f68974;
        this.f60486 = c21589.f68972;
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
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m43251(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 8;
        if (i == 36) {
            m43236(8);
            return;
        }
        if (i == 39) {
            m43236(18);
            return;
        }
        if (i == 42) {
            m43236(16);
            return;
        }
        int i10 = 0;
        if (i == 80) {
            this.f60459 = false;
            int i11 = this.f60461 - this.f60491;
            int iMin = Math.min(m43233(0, 1, true), i11);
            int i12 = i11 - iMin;
            C24573 c24573 = this.f60480;
            int i13 = this.f60491;
            int i14 = this.f60477;
            c24573.m54882(i13 + iMin, i14, i12, 1, i13, i14);
            m43248(this.f60491 + i12, this.f60477, iMin, 1);
            return;
        }
        if (i == 88) {
            this.f60459 = false;
            this.f60480.m54883(this.f60491, this.f60477, Math.min(m43233(0, 1, true), this.f60461 - this.f60491), 1, 32, m43242());
            return;
        }
        if (i == 90) {
            int iM43233 = m43233(0, 1, true);
            int iMax = this.f60462;
            for (int i15 = this.f60491 - 1; i15 >= 0; i15--) {
                if (this.f60466[i15] && (iM43233 = iM43233 - 1) == 0) {
                    iMax = Math.max(i15, this.f60462);
                    break;
                }
            }
            this.f60491 = iMax;
            return;
        }
        if (i == 83) {
            int iM43234 = m43233(0, 1, true);
            while (i10 < iM43234) {
                m43239();
                i10++;
            }
            return;
        }
        if (i == 84) {
            if (this.f60468 != 0) {
                this.f60489 = 0;
                return;
            }
            int iM43235 = m43233(0, 1, true);
            int i16 = this.f60475 - this.f60463;
            int iMin2 = Math.min(i16, iM43235);
            C24573 c24574 = this.f60480;
            int i17 = this.f60463;
            c24574.m54882(0, i17, this.f60461, i16 - iMin2, 0, i17 + iMin2);
            m43248(0, this.f60463, this.f60461, iMin2);
            return;
        }
        switch (i) {
            case 32:
                m43236(15);
                break;
            case 33:
                m43236(19);
                break;
            case 34:
                m43236(17);
                break;
            default:
                switch (i) {
                    case 62:
                        m43236(12);
                        break;
                    case 63:
                        m43236(7);
                        break;
                    case 64:
                        this.f60459 = false;
                        int i18 = this.f60461 - this.f60491;
                        int iMin3 = Math.min(m43233(0, 1, true), i18);
                        C24573 c24575 = this.f60480;
                        int i19 = this.f60491;
                        int i20 = this.f60477;
                        c24575.m54882(i19, i20, i18 - iMin3, 1, i19 + iMin3, i20);
                        m43248(this.f60491, this.f60477, iMin3, 1);
                        break;
                    case 65:
                        this.f60477 = Math.max(this.f60463, this.f60477 - m43233(0, 1, true));
                        this.f60459 = false;
                        break;
                    case 66:
                        this.f60477 = Math.min(this.f60475 - 1, this.f60477 + m43233(0, 1, true));
                        this.f60459 = false;
                        break;
                    case 67:
                        m43253(Math.min(this.f60474 - 1, this.f60491 + m43233(0, 1, true)));
                        break;
                    case 68:
                        m43253(Math.max(this.f60462, this.f60491 - m43233(0, 1, true)));
                        break;
                    case 69:
                        m43247(0, this.f60477 + m43233(0, 1, true));
                        break;
                    case 70:
                        m43247(0, this.f60477 - m43233(0, 1, true));
                        break;
                    case 71:
                        m43253(Math.min(Math.max(1, m43233(0, 1, true)), this.f60461) - 1);
                        break;
                    case 72:
                        m43247(m43233(1, 1, true) - 1, m43233(0, 1, true) - 1);
                        break;
                    case 73:
                        m43253(m43231(m43233(0, 1, true)));
                        break;
                    case 74:
                        int iM43236 = m43233(0, 0, true);
                        if (iM43236 == 0) {
                            int i21 = this.f60491;
                            m43248(i21, this.f60477, this.f60461 - i21, 1);
                            int i22 = this.f60477 + 1;
                            m43248(0, i22, this.f60461, this.f60484 - i22);
                        } else if (iM43236 == 1) {
                            m43248(0, 0, this.f60461, this.f60477);
                            m43248(0, this.f60477, this.f60491 + 1, 1);
                        } else if (iM43236 != 2) {
                            this.f60489 = 0;
                        } else {
                            m43248(0, 0, this.f60461, this.f60484);
                        }
                        this.f60459 = false;
                        break;
                    case 75:
                        int iM43237 = m43233(0, 0, true);
                        if (iM43237 != 0) {
                            if (iM43237 == 1) {
                                i2 = this.f60477;
                                i3 = this.f60491 + 1;
                            } else if (iM43237 != 2) {
                                this.f60489 = 0;
                            } else {
                                i2 = this.f60477;
                                i3 = this.f60461;
                            }
                            m43248(0, i2, i3, 1);
                        } else {
                            int i23 = this.f60491;
                            m43248(i23, this.f60477, this.f60461 - i23, 1);
                        }
                        this.f60459 = false;
                        break;
                    case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                        int i24 = this.f60475 - this.f60477;
                        int iMin4 = Math.min(m43233(0, 1, true), i24);
                        C24573 c24576 = this.f60480;
                        int i25 = this.f60477;
                        c24576.m54882(0, i25, this.f60461, i24 - iMin4, 0, i25 + iMin4);
                        m43248(0, this.f60477, this.f60461, iMin4);
                        break;
                    case 77:
                        this.f60459 = false;
                        int i26 = this.f60475 - this.f60477;
                        int iMin5 = Math.min(m43233(0, 1, true), i26);
                        int i27 = i26 - iMin5;
                        C24573 c24577 = this.f60480;
                        int i28 = this.f60477;
                        c24577.m54882(0, i28 + iMin5, this.f60461, i27, 0, i28);
                        m43248(0, this.f60477 + i27, this.f60461, iMin5);
                        break;
                    default:
                        AbstractC8909 abstractC8909 = this.f60454;
                        switch (i) {
                            case 96:
                                m43247(m43233(0, 1, true) - 1, this.f60477);
                                break;
                            case 97:
                                m43253(Math.min(this.f60474 - 1, this.f60491 + m43233(0, 1, true)));
                                break;
                            case 98:
                                if (this.f60471 != -1) {
                                    int iM43238 = m43233(0, 1, true);
                                    while (i10 < iM43238) {
                                        m43241(this.f60471);
                                        i10++;
                                    }
                                    break;
                                }
                                break;
                            case q.f /* 99 */:
                                if (m43233(0, 0, true) == 0) {
                                    abstractC8909.m23822("\u001b[?64;1;2;6;9;15;18;21;22c");
                                }
                                break;
                            case 100:
                                this.f60477 = Math.min(Math.max(1, m43233(0, 1, true)), this.f60484) - 1;
                                this.f60459 = false;
                                break;
                            case 101:
                                m43247(this.f60491, this.f60477 + m43233(0, 1, true));
                                break;
                            case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                m43247(m43233(1, 1, true) - 1, m43233(0, 1, true) - 1);
                                break;
                            case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                int iM43239 = m43233(0, 0, true);
                                if (iM43239 == 0) {
                                    this.f60466[this.f60491] = false;
                                    break;
                                } else if (iM43239 == 3) {
                                    for (int i29 = 0; i29 < this.f60461; i29++) {
                                        this.f60466[i29] = false;
                                    }
                                    break;
                                }
                                break;
                            case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                int iM432310 = m43233(0, 0, true);
                                if (iM432310 == 4) {
                                    this.f60483 = true;
                                } else if (iM432310 == 20) {
                                    this.f60489 = 0;
                                } else if (iM432310 != 34) {
                                    this.f60489 = 0;
                                }
                                break;
                            default:
                                int i30 = 11;
                                switch (i) {
                                    case 108:
                                        int iM432311 = m43233(0, 0, true);
                                        if (iM432311 == 4) {
                                            this.f60483 = false;
                                        } else if (iM432311 == 20) {
                                            this.f60489 = 0;
                                        } else if (iM432311 != 34) {
                                            this.f60489 = 0;
                                        }
                                        break;
                                    case 109:
                                        int i31 = this.f60468;
                                        int[] iArr = this.f60487;
                                        if (i31 >= iArr.length) {
                                            this.f60468 = iArr.length - 1;
                                        }
                                        int i32 = 0;
                                        while (true) {
                                            int i33 = this.f60468;
                                            if (i32 <= i33) {
                                                int i34 = iArr[i32];
                                                if (i34 >= 0) {
                                                    if (i34 == 0) {
                                                        this.f60457 = 256;
                                                        this.f60481 = 257;
                                                        this.f60476 = 0;
                                                    } else if (i34 == 1) {
                                                        this.f60476 |= 1;
                                                    } else if (i34 == 2) {
                                                        this.f60476 |= 256;
                                                    } else if (i34 == 3) {
                                                        this.f60476 |= 2;
                                                    } else if (i34 == 4) {
                                                        this.f60476 |= 4;
                                                    } else if (i34 == 5) {
                                                        this.f60476 = i9 | this.f60476;
                                                    } else if (i34 == 7) {
                                                        this.f60476 |= 16;
                                                    } else if (i34 == i9) {
                                                        this.f60476 |= 32;
                                                    } else if (i34 == 9) {
                                                        this.f60476 |= 64;
                                                    } else if (i34 != 10 && i34 != i30) {
                                                        if (i34 == 22) {
                                                            this.f60476 &= -258;
                                                        } else if (i34 == 23) {
                                                            this.f60476 &= -3;
                                                        } else if (i34 == 24) {
                                                            this.f60476 &= -5;
                                                        } else if (i34 == 25) {
                                                            this.f60476 &= -9;
                                                        } else if (i34 == 27) {
                                                            this.f60476 &= -17;
                                                        } else if (i34 == 28) {
                                                            this.f60476 &= -33;
                                                        } else if (i34 == 29) {
                                                            this.f60476 &= -65;
                                                        } else if (i34 < 30 && i34 <= 37) {
                                                            this.f60457 = i34 - 30;
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
                                                                            this.f60489 = 0;
                                                                        } else {
                                                                            int i37 = (i35 << 8) | (i8 << 16) | (-16777216) | i36;
                                                                            if (i34 == 38) {
                                                                                this.f60457 = i37;
                                                                            } else {
                                                                                this.f60481 = i37;
                                                                            }
                                                                        }
                                                                        i32 = i7;
                                                                    }
                                                                } else if (i5 == 5) {
                                                                    i6 = iArr[i4];
                                                                    if (i6 >= 0 && i6 < 261) {
                                                                        if (i34 == 38) {
                                                                            this.f60457 = i6;
                                                                        } else {
                                                                            this.f60481 = i6;
                                                                        }
                                                                    }
                                                                    i32 = i4;
                                                                } else {
                                                                    this.f60489 = 0;
                                                                }
                                                            }
                                                        } else if (i34 == 39) {
                                                            this.f60457 = 256;
                                                        } else if (i34 >= 40 && i34 <= 47) {
                                                            this.f60481 = i34 - 40;
                                                        } else if (i34 == 49) {
                                                            this.f60481 = 257;
                                                        } else if (i34 >= 90 && i34 <= 97) {
                                                            this.f60457 = i34 - 82;
                                                        } else if (i34 >= 100 && i34 <= 107) {
                                                            this.f60481 = i34 - 92;
                                                        }
                                                    }
                                                } else if (i33 <= 0) {
                                                    i34 = 0;
                                                    if (i34 == 0) {
                                                        this.f60457 = 256;
                                                        this.f60481 = 257;
                                                        this.f60476 = 0;
                                                    } else if (i34 == 1) {
                                                        this.f60476 |= 1;
                                                    } else if (i34 == 2) {
                                                        this.f60476 |= 256;
                                                    } else if (i34 == 3) {
                                                        this.f60476 |= 2;
                                                    } else if (i34 == 4) {
                                                        this.f60476 |= 4;
                                                    } else if (i34 == 5) {
                                                        this.f60476 = i9 | this.f60476;
                                                    } else if (i34 == 7) {
                                                        this.f60476 |= 16;
                                                    } else if (i34 == i9) {
                                                        this.f60476 |= 32;
                                                    } else if (i34 == 9) {
                                                        this.f60476 |= 64;
                                                    } else if (i34 != 10) {
                                                        if (i34 == 22) {
                                                            this.f60476 &= -258;
                                                        } else if (i34 == 23) {
                                                            this.f60476 &= -3;
                                                        } else if (i34 == 24) {
                                                            this.f60476 &= -5;
                                                        } else if (i34 == 25) {
                                                            this.f60476 &= -9;
                                                        } else if (i34 == 27) {
                                                            this.f60476 &= -17;
                                                        } else if (i34 == 28) {
                                                            this.f60476 &= -33;
                                                        } else if (i34 == 29) {
                                                            this.f60476 &= -65;
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
                                                                                this.f60489 = 0;
                                                                            } else {
                                                                                this.f60489 = 0;
                                                                            }
                                                                            i32 = i7;
                                                                        }
                                                                    } else if (i5 == 5) {
                                                                        i6 = iArr[i4];
                                                                        if (i6 >= 0) {
                                                                            if (i34 == 38) {
                                                                                this.f60457 = i6;
                                                                            } else {
                                                                                this.f60481 = i6;
                                                                            }
                                                                        }
                                                                        i32 = i4;
                                                                    } else {
                                                                        this.f60489 = 0;
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
                                                                                this.f60489 = 0;
                                                                            } else {
                                                                                this.f60489 = 0;
                                                                            }
                                                                            i32 = i7;
                                                                        }
                                                                    } else if (i5 == 5) {
                                                                        i6 = iArr[i4];
                                                                        if (i6 >= 0) {
                                                                            if (i34 == 38) {
                                                                                this.f60457 = i6;
                                                                            } else {
                                                                                this.f60481 = i6;
                                                                            }
                                                                        }
                                                                        i32 = i4;
                                                                    } else {
                                                                        this.f60489 = 0;
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
                                                                            this.f60489 = 0;
                                                                        } else {
                                                                            this.f60489 = 0;
                                                                        }
                                                                        i32 = i7;
                                                                    }
                                                                } else if (i5 == 5) {
                                                                    i6 = iArr[i4];
                                                                    if (i6 >= 0) {
                                                                        if (i34 == 38) {
                                                                            this.f60457 = i6;
                                                                        } else {
                                                                            this.f60481 = i6;
                                                                        }
                                                                    }
                                                                    i32 = i4;
                                                                } else {
                                                                    this.f60489 = 0;
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
                                                                            this.f60489 = 0;
                                                                        } else {
                                                                            this.f60489 = 0;
                                                                        }
                                                                        i32 = i7;
                                                                    }
                                                                } else if (i5 == 5) {
                                                                    i6 = iArr[i4];
                                                                    if (i6 >= 0) {
                                                                        if (i34 == 38) {
                                                                            this.f60457 = i6;
                                                                        } else {
                                                                            this.f60481 = i6;
                                                                        }
                                                                    }
                                                                    i32 = i4;
                                                                } else {
                                                                    this.f60489 = 0;
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
                                        int iM432312 = m43233(0, 0, true);
                                        if (iM432312 == 5) {
                                            abstractC8909.mo23817(4, new byte[]{27, 91, UTF8.S_P3A, KeyFactorySpi.x25519_type});
                                            break;
                                        } else if (iM432312 == 6) {
                                            Locale locale = Locale.US;
                                            abstractC8909.m23822(C0703.m3016("\u001b[", this.f60477 + 1, l.b, "R", this.f60491 + 1));
                                            break;
                                        }
                                        break;
                                    default:
                                        switch (i) {
                                            case 114:
                                                int iMax2 = Math.max(0, Math.min(m43233(0, 1, true) - 1, this.f60484 - 2));
                                                this.f60463 = iMax2;
                                                this.f60475 = Math.max(iMax2 + 2, Math.min(m43233(1, this.f60484, true), this.f60484));
                                                m43247(0, 0);
                                                break;
                                            case 115:
                                                if (m43240(2048)) {
                                                    int iMin6 = Math.min(m43233(0, 1, true) - 1, this.f60461 - 2);
                                                    this.f60462 = iMin6;
                                                    this.f60474 = Math.max(iMin6 + 1, Math.min(m43233(1, this.f60461, true), this.f60461));
                                                    m43247(0, 0);
                                                } else {
                                                    m43245();
                                                }
                                                break;
                                            case 116:
                                                int iM432313 = m43233(0, 0, true);
                                                if (iM432313 == 11) {
                                                    abstractC8909.m23822("\u001b[1t");
                                                    break;
                                                } else if (iM432313 == 13) {
                                                    abstractC8909.m23822("\u001b[3;0;0t");
                                                    break;
                                                } else if (iM432313 == 14) {
                                                    Locale locale2 = Locale.US;
                                                    abstractC8909.m23822(C0703.m3016("\u001b[4;", this.f60484 * 12, l.b, am.aI, this.f60461 * 12));
                                                    break;
                                                } else {
                                                    Stack stack = this.f60465;
                                                    switch (iM432313) {
                                                        case 18:
                                                            Locale locale3 = Locale.US;
                                                            abstractC8909.m23822(C0703.m3016("\u001b[8;", this.f60484, l.b, am.aI, this.f60461));
                                                            break;
                                                        case 19:
                                                            Locale locale4 = Locale.US;
                                                            abstractC8909.m23822(C0703.m3016("\u001b[9;", this.f60484, l.b, am.aI, this.f60461));
                                                            break;
                                                        case 20:
                                                            abstractC8909.m23822("\u001b]LIconLabel\u001b\\");
                                                            break;
                                                        case 21:
                                                            abstractC8909.m23822("\u001b]l\u001b\\");
                                                            break;
                                                        case 22:
                                                            stack.push(this.f60456);
                                                            if (stack.size() > 20) {
                                                                stack.remove(0);
                                                            }
                                                            break;
                                                        case 23:
                                                            if (!stack.isEmpty()) {
                                                                String str = (String) stack.pop();
                                                                String str2 = this.f60456;
                                                                this.f60456 = str;
                                                                if (!C17359.equals(str2, str)) {
                                                                    abstractC8909.mo23820();
                                                                }
                                                            }
                                                            break;
                                                    }
                                                }
                                                break;
                                            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                                m43232();
                                                break;
                                            default:
                                                m43238(i);
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

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m43244(int i) {
        if (i == 7) {
            m43250("\u0007");
        } else if (i == 27) {
            m43236(11);
        } else {
            m43246(i);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m43250(String str) {
        char c;
        String strSubstring;
        int i = 0;
        int i2 = -1;
        while (true) {
            StringBuilder sb = this.f60458;
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
                this.f60489 = 0;
                return;
            } else {
                i2 = (i2 < 0 ? 0 : i2 * 10) + (cCharAt - '0');
                i++;
            }
        }
        AbstractC8909 abstractC8909 = this.f60454;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            String str2 = this.f60456;
            this.f60456 = strSubstring;
            if (!C17359.equals(str2, strSubstring)) {
                abstractC8909.mo23820();
            }
        } else {
            int i3 = 255;
            C14875 c14875 = this.f60472;
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
                            c14875.m35813(i6, strSubstring.substring(i5, i4));
                            abstractC8909.mo23823();
                            i5 = -1;
                            i6 = -1;
                        }
                    } else if (i5 < 0) {
                        if (i5 >= 0 || cCharAt2 < '0' || cCharAt2 > '9') {
                            this.f60489 = 0;
                            return;
                        }
                        i6 = (i6 < 0 ? 0 : i6 * 10) + (cCharAt2 - '0');
                    }
                    if (!z) {
                        i4++;
                    }
                }
                this.f60489 = 0;
                return;
            }
            if (i2 == 52) {
                try {
                    abstractC8909.mo23818(new String(Base64.decode(strSubstring.substring(strSubstring.indexOf(l.b) + 1), 0), StandardCharsets.UTF_8));
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
                                            int i10 = c14875.f48607[i7];
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
                                                abstractC8909.m23822(sb2.toString());
                                            } catch (NumberFormatException unused2) {
                                                continue;
                                            }
                                        } else {
                                            c14875.m35813(i7, strSubstring2);
                                            abstractC8909.mo23823();
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
                                    c14875.f48607[i14] = C14875.f48606.f15890[i14];
                                    abstractC8909.mo23823();
                                    break;
                                default:
                                    this.f60489 = 0;
                                    break;
                            }
                            break;
                    }
                }
            } else if (strSubstring.isEmpty()) {
                c14875.m35812();
                abstractC8909.mo23823();
            } else {
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    boolean z3 = i15 == strSubstring.length();
                    if (z3 || strSubstring.charAt(i15) == ';') {
                        try {
                            int i17 = Integer.parseInt(strSubstring.substring(i16, i15));
                            c14875.f48607[i17] = C14875.f48606.f15890[i17];
                            abstractC8909.mo23823();
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
        this.f60489 = 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m43248(int i, int i2, int i3, int i4) {
        this.f60480.m54883(i, i2, i3, i4, 32, m43242());
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private long m43242() {
        return C14546.m35096(this.f60457, this.f60481, this.f60476);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m43247(int i, int i2) {
        boolean zM43240 = m43240(4);
        int i3 = zM43240 ? this.f60463 : 0;
        int i4 = zM43240 ? this.f60475 : this.f60484;
        int i5 = zM43240 ? this.f60462 : 0;
        m43237(Math.max(i3, Math.min(i2 + i3, i4 - 1)), Math.max(i5, Math.min(i + i5, (zM43240 ? this.f60474 : this.f60461) - 1)));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m43239() {
        this.f60467++;
        int i = this.f60462;
        if (i != 0 || this.f60474 != this.f60461) {
            C24573 c24573 = this.f60480;
            int i2 = this.f60463;
            c24573.m54882(i, i2 + 1, this.f60474 - i, (this.f60475 - i2) - 1, i, i2);
            C24573 c24574 = this.f60480;
            int i3 = this.f60462;
            c24574.m54883(i3, this.f60475 - 1, this.f60474 - i3, 1, 32, this.f60476);
            return;
        }
        this.f60480.m54886(this.f60463, this.f60475, m43242());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m43238(int i) {
        int[] iArr = this.f60487;
        if (i < 48 || i > 57) {
            if (i == 59) {
                int i2 = this.f60468;
                if (i2 < iArr.length) {
                    this.f60468 = i2 + 1;
                }
                m43236(this.f60489);
                return;
            }
            this.f60489 = 0;
            return;
        }
        int i3 = this.f60468;
        if (i3 < iArr.length) {
            int i4 = iArr[i3];
            int i5 = i - 48;
            if (i4 >= 0) {
                i5 += i4 * 10;
            }
            iArr[i3] = i5;
        }
        m43236(this.f60489);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m43233(int i, int i2, boolean z) {
        int i3 = this.f60487[i];
        return (i3 < 0 || (i3 == 0 && z)) ? i2 : i3;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m43246(int i) {
        StringBuilder sb = this.f60458;
        if (sb.length() < 8192) {
            sb.appendCodePoint(i);
            m43236(this.f60489);
        } else {
            this.f60489 = 0;
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
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m43241(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        this.f60471 = i;
        if (this.f60486) {
            if (!this.f60473) {
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
        } else if (!this.f60460) {
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
        boolean zM43240 = m43240(8);
        int iM48443 = C21260.m48443(i2);
        boolean z = this.f60491 == this.f60474 - 1;
        if (zM43240) {
            if (z && ((this.f60459 && iM48443 == 1) || iM48443 == 2)) {
                C24573 c24573 = this.f60480;
                c24573.f79641[c24573.m54889(this.f60477)].f44696 = true;
                this.f60491 = this.f60462;
                int i6 = this.f60477 + 1;
                if (i6 < this.f60475) {
                    this.f60477 = i6;
                } else {
                    m43239();
                }
            }
        } else if (z && iM48443 == 2) {
            return;
        }
        if (this.f60483 && iM48443 > 0 && (i4 = (i3 = this.f60491) + iM48443) < (i5 = this.f60474)) {
            C24573 c24574 = this.f60480;
            int i7 = this.f60477;
            c24574.m54882(i3, i7, i5 - i4, 1, i4, i7);
        }
        this.f60480.m54884(this.f60491 - ((iM48443 > 0 || this.f60491 <= 0 || this.f60459) ? 0 : 1), this.f60477, i2, m43242());
        if (zM43240 && iM48443 > 0) {
            this.f60459 = this.f60491 == this.f60474 - iM48443;
        }
        this.f60491 = Math.min(this.f60491 + iM48443, this.f60474 - 1);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m43253(int i) {
        this.f60491 = i;
        this.f60459 = false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m43237(int i, int i2) {
        this.f60477 = Math.max(0, Math.min(i, this.f60484 - 1));
        this.f60491 = Math.max(0, Math.min(i2, this.f60461 - 1));
        this.f60459 = false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m43266() {
        return this.f60467;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43256() {
        this.f60467 = 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m43267() {
        this.f60478 = 0;
        this.f60468 = 0;
        this.f60455 = false;
        this.f60489 = 0;
        this.f60483 = false;
        this.f60462 = 0;
        this.f60463 = 0;
        this.f60475 = this.f60484;
        this.f60474 = this.f60461;
        this.f60459 = false;
        C21589 c21589 = this.f60453;
        c21589.f68977 = 256;
        C21589 c215810 = this.f60464;
        c215810.f68977 = 256;
        this.f60457 = 256;
        c21589.f68973 = 257;
        c215810.f68973 = 257;
        this.f60481 = 257;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < this.f60461) {
                boolean[] zArr = this.f60466;
                if ((i & 7) != 0 || i == 0) {
                    z = false;
                }
                zArr[i] = z;
                i++;
            } else {
                this.f60460 = false;
                this.f60473 = false;
                this.f60486 = true;
                c215810.f68980 = 0;
                c215810.f68978 = 0;
                c215810.f68979 = 0;
                c215810.f68975 = 0;
                c21589.f68980 = 0;
                c21589.f68978 = 0;
                c21589.f68979 = 0;
                c21589.f68975 = 0;
                this.f60470 = 0;
                m43249(8, true);
                m43249(16, true);
                int i2 = this.f60470;
                c21589.f68980 = i2;
                c215810.f68980 = i2;
                this.f60479 = i2;
                this.f60482 = (byte) 0;
                this.f60469 = (byte) 0;
                this.f60472.m35812();
                this.f60454.mo23823();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m43255(int i, int i2, int i3, int i4) {
        return this.f60480.m54880(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43261(String str) {
        String strReplaceAll = str.replaceAll("(\u001b|[\u0080-\u009f])", "").replaceAll("\r?\n", "\r");
        if (strReplaceAll.isEmpty()) {
            return;
        }
        boolean zM43240 = m43240(1024);
        AbstractC8909 abstractC8909 = this.f60454;
        if (zM43240) {
            abstractC8909.m23822("\u001b[200~");
        }
        abstractC8909.m23822(strReplaceAll);
        if (zM43240) {
            abstractC8909.m23822("\u001b[201~");
        }
    }
}
