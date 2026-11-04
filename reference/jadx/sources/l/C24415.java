package l;

import android.util.SparseArray;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.util.encoders.UTF8;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.᩺ܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P8R9 */
/* JADX INFO: loaded from: classes.dex */
public final class C24415 implements InterfaceC22486 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f79219;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final UUID f79220;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f79221 = {49, 10, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 44, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_CS3, 45, 45, 62, UTF8.S_CS3, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 44, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_P3A, 10};

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f79222;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f79223;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public static final Map f79224;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f79225;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C3531 f79226;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f79227;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public long f79228;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f79229;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f79230;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public boolean f79231;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C21287 f79232;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final SparseArray f79233;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f79234;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f79235;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int[] f79236;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C21287 f79237;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f79238;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final C21287 f79239;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f79240;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C21287 f79241;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f79242;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f79243;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f79244;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f79245;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public byte f79246;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f79247;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public boolean f79248;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f79249;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final C21287 f79250;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f79251;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public int f79252;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f79253;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f79254;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C14717 f79255;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f79256;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final C21287 f79257;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C11590 f79258;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public long f79259;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f79260;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public long f79261;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f79262;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public boolean f79263;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f79264;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C21287 f79265;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f79266;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C21287 f79267;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C6515 f79268;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1272 f79269;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC12789 f79270;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final C21287 f79271;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f79272;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f79273;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f79274;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f79275;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C11590 f79276;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public long f79277;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C21287 f79278;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public long f79279;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f79280;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f79281;

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2291() {
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC22486 mo2296() {
        return this;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ܳ */
    public final List mo2297() {
        return AbstractC1928.of();
    }

    static {
        String str = C7116.f23455;
        f79223 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f79219 = new byte[]{68, 105, 97, 108, KeyFactorySpi.x448_type, 103, 117, 101, 58, UTF8.S_CS3, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 44, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 44};
        f79222 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 46, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_CS3, 45, 45, 62, UTF8.S_CS3, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 46, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_P3A, 10};
        f79220 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        C1402.m5129(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        C1402.m5129(180, map, "htc_video_rotA-180", BottomAppBarTopEdgeTreatment.ANGLE_UP, "htc_video_rotA-270");
        f79224 = C4681.unmodifiableMap(map);
    }

    public C24415(InterfaceC1272 interfaceC1272, int i) {
        C3531 c3531 = new C3531();
        this.f79259 = -1L;
        this.f79279 = -9223372036854775807L;
        this.f79249 = -9223372036854775807L;
        this.f79238 = -9223372036854775807L;
        this.f79230 = -1L;
        this.f79261 = -1L;
        this.f79262 = -9223372036854775807L;
        this.f79226 = c3531;
        c3531.m11557(new C12480(this));
        this.f79269 = interfaceC1272;
        this.f79281 = (i & 1) == 0;
        this.f79244 = (i & 2) == 0;
        this.f79255 = new C14717();
        this.f79233 = new SparseArray();
        this.f79257 = new C21287(4);
        this.f79271 = new C21287(ByteBuffer.allocate(4).putInt(-1).array());
        this.f79237 = new C21287(4);
        this.f79265 = new C21287(C14399.f45378);
        this.f79241 = new C21287(4);
        this.f79267 = new C21287();
        this.f79250 = new C21287();
        this.f79278 = new C21287(8);
        this.f79232 = new C21287();
        this.f79239 = new C21287();
        this.f79236 = new int[1];
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2294(InterfaceC19502 interfaceC19502) {
        return new C4277().m13633((C9169) interfaceC19502);
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2293(InterfaceC12789 interfaceC12789) {
        if (this.f79244) {
            interfaceC12789 = new C8729(interfaceC12789, this.f79269);
        }
        this.f79270 = interfaceC12789;
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final void mo2292(long j, long j2) {
        this.f79262 = -9223372036854775807L;
        int i = 0;
        this.f79227 = 0;
        this.f79226.m11556();
        this.f79255.m35411();
        m54625();
        while (true) {
            SparseArray sparseArray = this.f79233;
            if (i >= sparseArray.size()) {
                return;
            }
            C10835 c10835 = ((C6515) sparseArray.valueAt(i)).f21917;
            if (c10835 != null) {
                c10835.m27561();
            }
            i++;
        }
    }

    @Override // l.InterfaceC22486
    /* JADX INFO: renamed from: ۙ */
    public final int mo2289(InterfaceC19502 interfaceC19502, C18756 c18756) throws C2970 {
        int i = 0;
        this.f79264 = false;
        boolean zM11558 = true;
        while (zM11558 && !this.f79264) {
            zM11558 = this.f79226.m11558(interfaceC19502);
            if (zM11558) {
                long position = interfaceC19502.getPosition();
                if (this.f79248) {
                    this.f79261 = position;
                    c18756.f60914 = this.f79230;
                    this.f79248 = false;
                    return 1;
                }
                if (this.f79231) {
                    long j = this.f79261;
                    if (j != -1) {
                        c18756.f60914 = j;
                        this.f79261 = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            }
        }
        if (zM11558) {
            return 0;
        }
        while (true) {
            SparseArray sparseArray = this.f79233;
            if (i >= sparseArray.size()) {
                return -1;
            }
            C6515 c6515 = (C6515) sparseArray.valueAt(i);
            c6515.f21882.getClass();
            C10835 c10835 = c6515.f21917;
            if (c10835 != null) {
                c10835.m27564(c6515.f21882, c6515.f21919);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54633(int i, long j) {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw C2970.m9688("ContentEncodingOrder " + j + " not supported", (Throwable) null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw C2970.m9688("ContentEncodingScope " + j + " not supported", (Throwable) null);
        }
        switch (i) {
            case 131:
                m54624(i);
                this.f79268.f21874 = (int) j;
                return;
            case 136:
                m54624(i);
                this.f79268.f21891 = j == 1;
                return;
            case 155:
                this.f79272 = m54619(j);
                return;
            case 159:
                m54624(i);
                this.f79268.f21914 = (int) j;
                return;
            case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                m54624(i);
                this.f79268.f21881 = (int) j;
                return;
            case 179:
                m54627(i);
                this.f79276.m29118(m54619(j));
                return;
            case 186:
                m54624(i);
                this.f79268.f21896 = (int) j;
                return;
            case 215:
                m54624(i);
                this.f79268.f21884 = (int) j;
                return;
            case 231:
                this.f79262 = m54619(j);
                return;
            case 238:
                this.f79234 = (int) j;
                return;
            case 241:
                if (this.f79263) {
                    return;
                }
                m54627(i);
                this.f79258.m29118(j);
                this.f79263 = true;
                return;
            case 251:
                this.f79266 = true;
                return;
            case 16871:
                m54624(i);
                this.f79268.f21887 = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw C2970.m9688("ContentCompAlgo " + j + " not supported", (Throwable) null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw C2970.m9688("DocTypeReadVersion " + j + " not supported", (Throwable) null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw C2970.m9688("EBMLReadVersion " + j + " not supported", (Throwable) null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw C2970.m9688("ContentEncAlgo " + j + " not supported", (Throwable) null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw C2970.m9688("AESSettingsCipherMode " + j + " not supported", (Throwable) null);
            case 21420:
                this.f79228 = j + this.f79259;
                return;
            case 21432:
                int i2 = (int) j;
                m54624(i);
                if (i2 == 0) {
                    this.f79268.f21900 = 0;
                    return;
                }
                if (i2 == 1) {
                    this.f79268.f21900 = 2;
                    return;
                } else if (i2 == 3) {
                    this.f79268.f21900 = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.f79268.f21900 = 3;
                    return;
                }
            case 21680:
                m54624(i);
                this.f79268.f21916 = (int) j;
                return;
            case 21682:
                m54624(i);
                this.f79268.f21899 = (int) j;
                return;
            case 21690:
                m54624(i);
                this.f79268.f21903 = (int) j;
                return;
            case 21930:
                m54624(i);
                this.f79268.f21880 = j == 1;
                return;
            case 21938:
                m54624(i);
                C6515 c6515 = this.f79268;
                c6515.f21918 = true;
                c6515.f21912 = (int) j;
                return;
            case 21998:
                m54624(i);
                this.f79268.f21868 = (int) j;
                return;
            case 22186:
                m54624(i);
                this.f79268.f21907 = j;
                return;
            case 22203:
                m54624(i);
                this.f79268.f21904 = j;
                return;
            case 25188:
                m54624(i);
                this.f79268.f21876 = (int) j;
                return;
            case 30114:
                this.f79274 = j;
                return;
            case 30321:
                m54624(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    this.f79268.f21890 = 0;
                    return;
                }
                if (i3 == 1) {
                    this.f79268.f21890 = 1;
                    return;
                } else if (i3 == 2) {
                    this.f79268.f21890 = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.f79268.f21890 = 3;
                    return;
                }
            case 2352003:
                m54624(i);
                this.f79268.f21901 = (int) j;
                return;
            case 2807729:
                this.f79279 = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        m54624(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            this.f79268.f21878 = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.f79268.f21878 = 1;
                            return;
                        }
                    case 21946:
                        m54624(i);
                        int iM4559 = C1259.m4559((int) j);
                        if (iM4559 != -1) {
                            this.f79268.f21889 = iM4559;
                            return;
                        }
                        return;
                    case 21947:
                        m54624(i);
                        this.f79268.f21918 = true;
                        int iM4561 = C1259.m4561((int) j);
                        if (iM4561 != -1) {
                            this.f79268.f21870 = iM4561;
                            return;
                        }
                        return;
                    case 21948:
                        m54624(i);
                        this.f79268.f21883 = (int) j;
                        return;
                    case 21949:
                        m54624(i);
                        this.f79268.f21906 = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:0x02b6  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54632(int i, int i2, InterfaceC19502 interfaceC19502) {
        C21287 c21287;
        char c;
        char c2;
        C21287 c21288;
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        SparseArray sparseArray = this.f79233;
        int i7 = 1;
        int i8 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (this.f79227 != 2) {
                    return;
                }
                C6515 c6515 = (C6515) sparseArray.get(this.f79280);
                if (this.f79234 == 4 && "V_VP9".equals(c6515.f21897)) {
                    C21287 c21289 = this.f79239;
                    c21289.m48496(i2);
                    interfaceC19502.readFully(c21289.m48497(), 0, i2);
                    return;
                }
                interfaceC19502.mo10073(i2);
                return;
            }
            if (i == 16877) {
                m54624(i);
                C6515 c6516 = this.f79268;
                if (c6516.f21887 == 1685485123 || c6516.f21887 == 1685480259) {
                    byte[] bArr = new byte[i2];
                    c6516.f21873 = bArr;
                    interfaceC19502.readFully(bArr, 0, i2);
                    return;
                }
                interfaceC19502.mo10073(i2);
                return;
            }
            if (i == 16981) {
                m54624(i);
                byte[] bArr2 = new byte[i2];
                this.f79268.f21902 = bArr2;
                interfaceC19502.readFully(bArr2, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                interfaceC19502.readFully(bArr3, 0, i2);
                m54624(i);
                this.f79268.f21919 = new C4870(1, bArr3, 0, 0);
                return;
            }
            if (i == 21419) {
                C21287 c212810 = this.f79237;
                Arrays.fill(c212810.m48497(), (byte) 0);
                interfaceC19502.readFully(c212810.m48497(), 4 - i2, i2);
                c212810.m48510(0);
                this.f79252 = (int) c212810.m48485();
                return;
            }
            if (i == 25506) {
                m54624(i);
                byte[] bArr4 = new byte[i2];
                this.f79268.f21893 = bArr4;
                interfaceC19502.readFully(bArr4, 0, i2);
                return;
            }
            if (i == 30322) {
                m54624(i);
                byte[] bArr5 = new byte[i2];
                this.f79268.f21898 = bArr5;
                interfaceC19502.readFully(bArr5, 0, i2);
                return;
            }
            throw C2970.m9688("Unexpected id: " + i, (Throwable) null);
        }
        int i9 = this.f79227;
        int i10 = 8;
        C21287 c212811 = this.f79257;
        if (i9 == 0) {
            C14717 c14717 = this.f79255;
            this.f79280 = (int) c14717.m35410(interfaceC19502, false, true, 8);
            this.f79260 = c14717.m35409();
            this.f79272 = -9223372036854775807L;
            this.f79227 = 1;
            c212811.m48496(0);
        }
        C6515 c6517 = (C6515) sparseArray.get(this.f79280);
        if (c6517 != null) {
            c6517.f21882.getClass();
            if (this.f79227 == 1) {
                m54621(interfaceC19502, 3);
                int i11 = (c212811.m48497()[2] & 6) >> 1;
                byte b = 255;
                if (i11 == 0) {
                    this.f79256 = 1;
                    int[] iArr = this.f79236;
                    if (iArr == null) {
                        iArr = new int[1];
                    } else if (iArr.length < 1) {
                        iArr = new int[Math.max(iArr.length * 2, 1)];
                    }
                    this.f79236 = iArr;
                    iArr[0] = (i2 - this.f79260) - 3;
                } else {
                    m54621(interfaceC19502, 4);
                    int i12 = (c212811.m48497()[3] & 255) + 1;
                    this.f79256 = i12;
                    int[] iArr2 = this.f79236;
                    if (iArr2 == null) {
                        iArr2 = new int[i12];
                    } else if (iArr2.length < i12) {
                        iArr2 = new int[Math.max(iArr2.length * 2, i12)];
                    }
                    this.f79236 = iArr2;
                    if (i11 == 2) {
                        int i13 = (i2 - this.f79260) - 4;
                        int i14 = this.f79256;
                        Arrays.fill(iArr2, 0, i14, i13 / i14);
                    } else {
                        if (i11 == 1) {
                            int i15 = 0;
                            int i16 = 0;
                            int i17 = 4;
                            while (true) {
                                i3 = this.f79256 - 1;
                                if (i15 >= i3) {
                                    break;
                                }
                                this.f79236[i15] = 0;
                                while (true) {
                                    i4 = i17 + 1;
                                    m54621(interfaceC19502, i4);
                                    int i18 = c212811.m48497()[i17] & 255;
                                    int[] iArr3 = this.f79236;
                                    i5 = iArr3[i15] + i18;
                                    iArr3[i15] = i5;
                                    if (i18 != 255) {
                                        break;
                                    } else {
                                        i17 = i4;
                                    }
                                }
                                i16 += i5;
                                i15++;
                                i17 = i4;
                            }
                            this.f79236[i3] = ((i2 - this.f79260) - i17) - i16;
                        } else {
                            if (i11 != 3) {
                                throw C2970.m9688("Unexpected lacing value: " + i11, (Throwable) null);
                            }
                            int i19 = 0;
                            int i20 = 0;
                            int i21 = 4;
                            while (true) {
                                int i22 = this.f79256 - i7;
                                if (i19 < i22) {
                                    this.f79236[i19] = i8;
                                    int i23 = i21 + 1;
                                    m54621(interfaceC19502, i23);
                                    if (c212811.m48497()[i21] == 0) {
                                        throw C2970.m9688("No valid varint length mask found", (Throwable) null);
                                    }
                                    int i24 = 0;
                                    while (true) {
                                        if (i24 >= i10) {
                                            c21288 = c212811;
                                            j = 0;
                                            i21 = i23;
                                            break;
                                        }
                                        int i25 = i7 << (7 - i24);
                                        if ((c212811.m48497()[i21] & i25) != 0) {
                                            int i26 = i23 + i24;
                                            m54621(interfaceC19502, i26);
                                            j = (~i25) & c212811.m48497()[i21] & b;
                                            while (i23 < i26) {
                                                j = (j << 8) | ((long) (c212811.m48497()[i23] & 255));
                                                i23++;
                                                c212811 = c212811;
                                            }
                                            c21288 = c212811;
                                            if (i19 > 0) {
                                                j -= (1 << ((i24 * 7) + 6)) - 1;
                                            }
                                            i21 = i26;
                                            break;
                                        }
                                        i24++;
                                        i7 = 1;
                                        i10 = 8;
                                        b = 255;
                                    }
                                    if (j < -2147483648L || j > 2147483647L) {
                                        throw C2970.m9688("EBML lacing sample size out of range.", (Throwable) null);
                                    }
                                    int i27 = (int) j;
                                    int[] iArr4 = this.f79236;
                                    if (i19 != 0) {
                                        i27 += iArr4[i19 - 1];
                                    }
                                    iArr4[i19] = i27;
                                    i20 += i27;
                                    i19++;
                                    i7 = 1;
                                    i8 = 0;
                                    i10 = 8;
                                    c212811 = c21288;
                                    b = 255;
                                } else {
                                    c21287 = c212811;
                                    this.f79236[i22] = ((i2 - this.f79260) - i21) - i20;
                                    c = 1;
                                    c2 = 0;
                                    break;
                                }
                            }
                        }
                        this.f79247 = this.f79262 + m54619((c21287.m48497()[c] & 255) | (c21287.m48497()[c2] << 8));
                        if (c6517.f21874 != 2 || (i == 163 && (c21287.m48497()[2] & GCMSIVBlockCipher.MASK) == 128)) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        this.f79245 = i6;
                        this.f79227 = 2;
                        this.f79251 = 0;
                    }
                }
                c = 1;
                c2 = 0;
                c21287 = c212811;
                this.f79247 = this.f79262 + m54619((c21287.m48497()[c] & 255) | (c21287.m48497()[c2] << 8));
                if (c6517.f21874 != 2) {
                    i6 = 1;
                } else {
                    i6 = 1;
                }
                this.f79245 = i6;
                this.f79227 = 2;
                this.f79251 = 0;
            }
            if (i == 163) {
                while (true) {
                    int i28 = this.f79251;
                    if (i28 < this.f79256) {
                        m54620(c6517, ((long) ((this.f79251 * c6517.f21901) / 1000)) + this.f79247, this.f79245, m54618(interfaceC19502, c6517, this.f79236[i28], false), 0);
                        this.f79251++;
                    } else {
                        this.f79227 = 0;
                        return;
                    }
                }
            } else {
                while (true) {
                    int i29 = this.f79251;
                    if (i29 >= this.f79256) {
                        return;
                    }
                    int[] iArr5 = this.f79236;
                    iArr5[i29] = m54618(interfaceC19502, c6517, iArr5[i29], true);
                    this.f79251++;
                }
            }
        } else {
            interfaceC19502.mo10073(i2 - this.f79260);
            this.f79227 = 0;
        }
    }

    @EnsuresNonNull({"currentTrack"})
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m54624(int i) throws C2970 {
        if (this.f79268 != null) {
            return;
        }
        throw C2970.m9688("Element " + i + " must be in a TrackEntry", (Throwable) null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m54627(int i) throws C2970 {
        if (this.f79276 == null || this.f79258 == null) {
            throw C2970.m9688("Element " + i + " must be in a Cues", (Throwable) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54631(int i, double d) {
        if (i == 181) {
            m54624(i);
            this.f79268.f21920 = (int) d;
            return;
        }
        if (i == 17545) {
            this.f79249 = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                m54624(i);
                this.f79268.f21915 = (float) d;
                break;
            case 21970:
                m54624(i);
                this.f79268.f21908 = (float) d;
                break;
            case 21971:
                m54624(i);
                this.f79268.f21913 = (float) d;
                break;
            case 21972:
                m54624(i);
                this.f79268.f21888 = (float) d;
                break;
            case 21973:
                m54624(i);
                this.f79268.f21895 = (float) d;
                break;
            case 21974:
                m54624(i);
                this.f79268.f21877 = (float) d;
                break;
            case 21975:
                m54624(i);
                this.f79268.f21910 = (float) d;
                break;
            case 21976:
                m54624(i);
                this.f79268.f21892 = (float) d;
                break;
            case 21977:
                m54624(i);
                this.f79268.f21886 = (float) d;
                break;
            case 21978:
                m54624(i);
                this.f79268.f21869 = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        m54624(i);
                        this.f79268.f21871 = (float) d;
                        break;
                    case 30324:
                        m54624(i);
                        this.f79268.f21894 = (float) d;
                        break;
                    case 30325:
                        m54624(i);
                        this.f79268.f21879 = (float) d;
                        break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54634(int i, String str) {
        if (i == 134) {
            m54624(i);
            this.f79268.f21897 = str;
            return;
        }
        if (i == 17026) {
            if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw C2970.m9688("DocType " + str + " not supported", (Throwable) null);
            }
            this.f79225 = str.equals("webm");
            return;
        }
        if (i == 21358) {
            m54624(i);
            this.f79268.f21872 = str;
        } else {
            if (i != 2274716) {
                return;
            }
            m54624(i);
            this.f79268.f21905 = str;
        }
    }

    @RequiresNonNull({"#1.output"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m54620(C6515 c6515, long j, int i, int i2, int i3) {
        byte[] bArrM54623;
        int i4;
        int iM48509;
        C10835 c10835 = c6515.f21917;
        if (c10835 != null) {
            c10835.m27563(c6515.f21882, j, i, i2, i3, c6515.f21919);
        } else {
            if ("S_TEXT/UTF8".equals(c6515.f21897) || "S_TEXT/ASS".equals(c6515.f21897) || "S_TEXT/SSA".equals(c6515.f21897) || "S_TEXT/WEBVTT".equals(c6515.f21897)) {
                if (this.f79256 > 1) {
                    C1896.m6517("Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.f79272;
                    if (j2 == -9223372036854775807L) {
                        C1896.m6517("Skipping subtitle sample with no duration.");
                    } else {
                        String str = c6515.f21897;
                        C21287 c21287 = this.f79250;
                        byte[] bArrM48497 = c21287.m48497();
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                bArrM54623 = m54623("%01d:%02d:%02d:%02d", j2, 10000L);
                                i4 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrM54623 = m54623("%02d:%02d:%02d.%03d", j2, 1000L);
                                i4 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrM54623 = m54623("%02d:%02d:%02d,%03d", j2, 1000L);
                                i4 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(bArrM54623, 0, bArrM48497, i4, bArrM54623.length);
                        for (int iM48516 = c21287.m48516(); iM48516 < c21287.m48509(); iM48516++) {
                            if (c21287.m48497()[iM48516] == 0) {
                                c21287.m48517(iM48516);
                                c6515.f21882.mo14381(c21287.m48509(), c21287);
                                iM48509 = c21287.m48509() + i2;
                            }
                        }
                        c6515.f21882.mo14381(c21287.m48509(), c21287);
                        iM48509 = c21287.m48509() + i2;
                    }
                }
                iM48509 = i2;
            } else {
                iM48509 = i2;
            }
            if ((i & 268435456) != 0) {
                int i5 = this.f79256;
                C21287 c21288 = this.f79239;
                if (i5 > 1) {
                    c21288.m48496(0);
                } else {
                    int iM485010 = c21288.m48509();
                    c6515.f21882.mo14385(c21288, iM485010, 2);
                    iM48509 += iM485010;
                }
            }
            c6515.f21882.mo14383(j, i, iM48509, i3, c6515.f21919);
        }
        this.f79264 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m54621(InterfaceC19502 interfaceC19502, int i) {
        C21287 c21287 = this.f79257;
        if (c21287.m48509() >= i) {
            return;
        }
        if (c21287.m48513() < i) {
            c21287.m48489(Math.max(c21287.m48513() * 2, i));
        }
        interfaceC19502.readFully(c21287.m48497(), c21287.m48509(), i - c21287.m48509());
        c21287.m48517(i);
    }

    @RequiresNonNull({"#2.output"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m54618(InterfaceC19502 interfaceC19502, C6515 c6515, int i, boolean z) throws C2970 {
        int iMo14380;
        int iMo14381;
        boolean z2;
        int i2;
        if ("S_TEXT/UTF8".equals(c6515.f21897)) {
            m54622(interfaceC19502, f79221, i);
        } else if ("S_TEXT/ASS".equals(c6515.f21897) || "S_TEXT/SSA".equals(c6515.f21897)) {
            m54622(interfaceC19502, f79219, i);
        } else if ("S_TEXT/WEBVTT".equals(c6515.f21897)) {
            m54622(interfaceC19502, f79222, i);
        } else {
            InterfaceC22024 interfaceC22024 = c6515.f21882;
            boolean z3 = this.f79240;
            C21287 c21287 = this.f79267;
            if (!z3) {
                boolean z4 = c6515.f21875;
                C21287 c21288 = this.f79257;
                if (z4) {
                    this.f79245 &= -1073741825;
                    if (!this.f79275) {
                        interfaceC19502.readFully(c21288.m48497(), 0, 1);
                        this.f79243++;
                        if ((c21288.m48497()[0] & GCMSIVBlockCipher.MASK) == 128) {
                            throw C2970.m9688("Extension bit is set in signal byte", (Throwable) null);
                        }
                        this.f79246 = c21288.m48497()[0];
                        this.f79275 = true;
                    }
                    byte b = this.f79246;
                    if ((b & 1) == 1) {
                        boolean z5 = (b & 2) == 2;
                        this.f79245 |= 1073741824;
                        if (!this.f79253) {
                            C21287 c21289 = this.f79278;
                            interfaceC19502.readFully(c21289.m48497(), 0, 8);
                            this.f79243 += 8;
                            this.f79253 = true;
                            c21288.m48497()[0] = (byte) ((z5 ? 128 : 0) | 8);
                            c21288.m48510(0);
                            interfaceC22024.mo14385(c21288, 1, 1);
                            this.f79229++;
                            c21289.m48510(0);
                            interfaceC22024.mo14385(c21289, 8, 1);
                            this.f79229 += 8;
                        }
                        if (z5) {
                            if (!this.f79273) {
                                interfaceC19502.readFully(c21288.m48497(), 0, 1);
                                this.f79243++;
                                c21288.m48510(0);
                                this.f79235 = c21288.m48493();
                                this.f79273 = true;
                            }
                            int i3 = this.f79235 * 4;
                            c21288.m48496(i3);
                            interfaceC19502.readFully(c21288.m48497(), 0, i3);
                            this.f79243 += i3;
                            short s = (short) ((this.f79235 / 2) + 1);
                            int i4 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.f79254;
                            if (byteBuffer == null || byteBuffer.capacity() < i4) {
                                this.f79254 = ByteBuffer.allocate(i4);
                            }
                            this.f79254.position(0);
                            this.f79254.putShort(s);
                            int i5 = 0;
                            int i6 = 0;
                            while (true) {
                                i2 = this.f79235;
                                if (i5 >= i2) {
                                    break;
                                }
                                int iM48512 = c21288.m48512();
                                if (i5 % 2 == 0) {
                                    this.f79254.putShort((short) (iM48512 - i6));
                                } else {
                                    this.f79254.putInt(iM48512 - i6);
                                }
                                i5++;
                                i6 = iM48512;
                            }
                            int i7 = (i - this.f79243) - i6;
                            if (i2 % 2 == 1) {
                                this.f79254.putInt(i7);
                            } else {
                                this.f79254.putShort((short) i7);
                                this.f79254.putInt(0);
                            }
                            byte[] bArrArray = this.f79254.array();
                            C21287 c212810 = this.f79232;
                            c212810.m48491(i4, bArrArray);
                            interfaceC22024.mo14385(c212810, i4, 1);
                            this.f79229 += i4;
                        }
                    }
                } else {
                    byte[] bArr = c6515.f21902;
                    if (bArr != null) {
                        c21287.m48491(bArr.length, bArr);
                    }
                }
                if ("A_OPUS".equals(c6515.f21897)) {
                    z2 = z;
                } else {
                    z2 = c6515.f21868 > 0;
                }
                if (z2) {
                    this.f79245 |= 268435456;
                    this.f79239.m48496(0);
                    int iM48509 = (c21287.m48509() + i) - this.f79243;
                    c21288.m48496(4);
                    c21288.m48497()[0] = (byte) ((iM48509 >> 24) & 255);
                    c21288.m48497()[1] = (byte) ((iM48509 >> 16) & 255);
                    c21288.m48497()[2] = (byte) ((iM48509 >> 8) & 255);
                    c21288.m48497()[3] = (byte) (iM48509 & 255);
                    interfaceC22024.mo14385(c21288, 4, 2);
                    this.f79229 += 4;
                }
                this.f79240 = true;
            }
            int iM485010 = c21287.m48509() + i;
            if ("V_MPEG4/ISO/AVC".equals(c6515.f21897) || "V_MPEGH/ISO/HEVC".equals(c6515.f21897)) {
                C21287 c212811 = this.f79241;
                byte[] bArrM48497 = c212811.m48497();
                bArrM48497[0] = 0;
                bArrM48497[1] = 0;
                bArrM48497[2] = 0;
                int i8 = c6515.f21885;
                int i9 = 4 - i8;
                while (this.f79243 < iM485010) {
                    int i10 = this.f79242;
                    if (i10 == 0) {
                        int iMin = Math.min(i8, c21287.m48486());
                        interfaceC19502.readFully(bArrM48497, i9 + iMin, i8 - iMin);
                        if (iMin > 0) {
                            c21287.m48490(i9, iMin, bArrM48497);
                        }
                        this.f79243 += i8;
                        c212811.m48510(0);
                        this.f79242 = c212811.m48512();
                        C21287 c212812 = this.f79265;
                        c212812.m48510(0);
                        interfaceC22024.mo14381(4, c212812);
                        this.f79229 += 4;
                    } else {
                        int iM48486 = c21287.m48486();
                        if (iM48486 > 0) {
                            iMo14380 = Math.min(i10, iM48486);
                            interfaceC22024.mo14381(iMo14380, c21287);
                        } else {
                            iMo14380 = interfaceC22024.mo14380((InterfaceC9461) interfaceC19502, i10, false);
                        }
                        this.f79243 += iMo14380;
                        this.f79229 += iMo14380;
                        this.f79242 -= iMo14380;
                    }
                }
            } else {
                if (c6515.f21917 != null) {
                    C20782.m47568(c21287.m48509() == 0);
                    c6515.f21917.m27562(interfaceC19502);
                }
                while (true) {
                    int i11 = this.f79243;
                    if (i11 >= iM485010) {
                        break;
                    }
                    int i12 = iM485010 - i11;
                    int iM48487 = c21287.m48486();
                    if (iM48487 > 0) {
                        iMo14381 = Math.min(i12, iM48487);
                        interfaceC22024.mo14381(iMo14381, c21287);
                    } else {
                        iMo14381 = interfaceC22024.mo14380((InterfaceC9461) interfaceC19502, i12, false);
                    }
                    this.f79243 += iMo14381;
                    this.f79229 += iMo14381;
                }
            }
            if ("A_VORBIS".equals(c6515.f21897)) {
                C21287 c212813 = this.f79271;
                c212813.m48510(0);
                interfaceC22024.mo14381(4, c212813);
                this.f79229 += 4;
            }
        }
        int i13 = this.f79229;
        m54625();
        return i13;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m54625() {
        this.f79243 = 0;
        this.f79229 = 0;
        this.f79242 = 0;
        this.f79240 = false;
        this.f79275 = false;
        this.f79273 = false;
        this.f79235 = 0;
        this.f79246 = (byte) 0;
        this.f79253 = false;
        this.f79267.m48496(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m54622(InterfaceC19502 interfaceC19502, byte[] bArr, int i) {
        int length = bArr.length + i;
        C21287 c21287 = this.f79250;
        if (c21287.m48513() < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            c21287.getClass();
            c21287.m48491(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, c21287.m48497(), 0, bArr.length);
        }
        interfaceC19502.readFully(c21287.m48497(), bArr.length, i);
        c21287.m48510(0);
        c21287.m48517(length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m54623(String str, long j, long j2) {
        C20782.m47565(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        String str3 = C7116.f23455;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m54619(long j) throws C2970 {
        long j2 = this.f79279;
        if (j2 == -9223372036854775807L) {
            throw C2970.m9688("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
        }
        String str = C7116.f23455;
        return C7116.m19477(j, j2, 1000L, RoundingMode.DOWN);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:227:0x0345  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54630(int i) {
        InterfaceC9060 c0857;
        int i2;
        C20782.m47566(this.f79270);
        byte b = 8;
        SparseArray sparseArray = this.f79233;
        int i3 = 0;
        if (i == 160) {
            if (this.f79227 != 2) {
                return;
            }
            C6515 c6515 = (C6515) sparseArray.get(this.f79280);
            c6515.f21882.getClass();
            if (this.f79274 > 0 && "A_OPUS".equals(c6515.f21897)) {
                byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f79274).array();
                C21287 c21287 = this.f79239;
                c21287.getClass();
                c21287.m48491(bArrArray.length, bArrArray);
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f79256; i5++) {
                i4 += this.f79236[i5];
            }
            int i6 = 0;
            while (i6 < this.f79256) {
                long j = this.f79247 + ((long) ((c6515.f21901 * i6) / 1000));
                int i7 = this.f79245;
                if (i6 == 0 && !this.f79266) {
                    i7 |= 1;
                }
                int i8 = this.f79236[i6];
                int i9 = i4 - i8;
                m54620(c6515, j, i7, i8, i9);
                i6++;
                i4 = i9;
            }
            this.f79227 = 0;
            return;
        }
        if (i != 174) {
            if (i == 19899) {
                int i10 = this.f79252;
                if (i10 != -1) {
                    long j2 = this.f79228;
                    if (j2 != -1) {
                        if (i10 == 475249515) {
                            this.f79230 = j2;
                            return;
                        }
                        return;
                    }
                }
                throw C2970.m9688("Mandatory element SeekID or SeekPosition not found", (Throwable) null);
            }
            if (i == 25152) {
                m54624(i);
                C6515 c6516 = this.f79268;
                if (c6516.f21875) {
                    C4870 c4870 = c6516.f21919;
                    if (c4870 == null) {
                        throw C2970.m9688("Encrypted Track found but ContentEncKeyID was not found", (Throwable) null);
                    }
                    c6516.f21909 = new C22362(new C5208(C19158.f61990, null, "video/webm", c4870.f16984));
                    return;
                }
                return;
            }
            if (i == 28032) {
                m54624(i);
                C6515 c6517 = this.f79268;
                if (c6517.f21875 && c6517.f21902 != null) {
                    throw C2970.m9688("Combining encryption and compression is not supported", (Throwable) null);
                }
                return;
            }
            if (i == 357149030) {
                if (this.f79279 == -9223372036854775807L) {
                    this.f79279 = 1000000L;
                }
                long j3 = this.f79249;
                if (j3 != -9223372036854775807L) {
                    this.f79238 = m54619(j3);
                    return;
                }
                return;
            }
            if (i == 374648427) {
                if (sparseArray.size() == 0) {
                    throw C2970.m9688("No valid tracks were found", (Throwable) null);
                }
                this.f79270.mo16661();
                return;
            }
            if (i != 475249515) {
                return;
            }
            if (!this.f79231) {
                InterfaceC12789 interfaceC12789 = this.f79270;
                C11590 c11590 = this.f79276;
                C11590 c11591 = this.f79258;
                if (this.f79259 == -1 || this.f79238 == -9223372036854775807L || c11590 == null || c11590.m29116() == 0 || c11591 == null || c11591.m29116() != c11590.m29116()) {
                    c0857 = new C0857(this.f79238);
                } else {
                    int iM29116 = c11590.m29116();
                    int[] iArrCopyOf = new int[iM29116];
                    long[] jArrCopyOf = new long[iM29116];
                    long[] jArrCopyOf2 = new long[iM29116];
                    long[] jArrCopyOf3 = new long[iM29116];
                    for (int i11 = 0; i11 < iM29116; i11++) {
                        jArrCopyOf3[i11] = c11590.m29117(i11);
                        jArrCopyOf[i11] = c11591.m29117(i11) + this.f79259;
                    }
                    while (true) {
                        i2 = iM29116 - 1;
                        if (i3 >= i2) {
                            break;
                        }
                        int i12 = i3 + 1;
                        iArrCopyOf[i3] = (int) (jArrCopyOf[i12] - jArrCopyOf[i3]);
                        jArrCopyOf2[i3] = jArrCopyOf3[i12] - jArrCopyOf3[i3];
                        i3 = i12;
                    }
                    int i13 = i2;
                    while (i13 > 0 && jArrCopyOf3[i13] > this.f79238) {
                        i13--;
                    }
                    iArrCopyOf[i13] = (int) ((this.f79259 + this.f79277) - jArrCopyOf[i13]);
                    jArrCopyOf2[i13] = this.f79238 - jArrCopyOf3[i13];
                    if (i13 < i2) {
                        C1896.m6517("Discarding trailing cue points with timestamps greater than total duration");
                        int i14 = i13 + 1;
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i14);
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i14);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i14);
                        jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i14);
                    }
                    c0857 = new C18866(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                }
                interfaceC12789.mo16659(c0857);
                this.f79231 = true;
            }
            this.f79276 = null;
            this.f79258 = null;
            return;
        }
        C6515 c6518 = this.f79268;
        C20782.m47566(c6518);
        String str = c6518.f21897;
        if (str == null) {
            throw C2970.m9688("CodecId is missing in TrackEntry element", (Throwable) null);
        }
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    b = 1;
                } else {
                    b = -1;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    b = 3;
                } else {
                    b = -1;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    b = 4;
                } else {
                    b = -1;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    b = 5;
                } else {
                    b = -1;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    b = 6;
                } else {
                    b = -1;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    b = 7;
                } else {
                    b = -1;
                }
                break;
            case -933872740:
                if (!str.equals("S_DVBSUB")) {
                    b = -1;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    b = 9;
                } else {
                    b = -1;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    b = 10;
                } else {
                    b = -1;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    b = 11;
                } else {
                    b = -1;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    b = 12;
                } else {
                    b = -1;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    b = cb.k;
                } else {
                    b = -1;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    b = cb.f82047l;
                } else {
                    b = -1;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    b = 15;
                } else {
                    b = -1;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    b = 16;
                } else {
                    b = -1;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    b = 17;
                } else {
                    b = -1;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    b = 18;
                } else {
                    b = -1;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    b = 19;
                } else {
                    b = -1;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    b = 20;
                } else {
                    b = -1;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    b = 21;
                } else {
                    b = -1;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    b = 22;
                } else {
                    b = -1;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    b = 23;
                } else {
                    b = -1;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    b = 24;
                } else {
                    b = -1;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    b = 25;
                } else {
                    b = -1;
                }
                break;
            case 738614379:
                if (str.equals("S_TEXT/SSA")) {
                    b = 26;
                } else {
                    b = -1;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    b = 27;
                } else {
                    b = -1;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                } else {
                    b = -1;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    b = 29;
                } else {
                    b = -1;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    b = 30;
                } else {
                    b = -1;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    b = bo.j;
                } else {
                    b = -1;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    b = UTF8.S_CS3;
                } else {
                    b = -1;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    b = PublicSuffixDatabase.EXCEPTION_MARKER;
                } else {
                    b = -1;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
                c6518.m18391(this.f79270, c6518.f21884);
                sparseArray.put(c6518.f21884, c6518);
                break;
        }
        this.f79268 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54635(long j, int i, long j2) {
        C20782.m47566(this.f79270);
        if (i == 160) {
            this.f79266 = false;
            this.f79274 = 0L;
            return;
        }
        if (i == 174) {
            C6515 c6515 = new C6515();
            this.f79268 = c6515;
            c6515.f21911 = this.f79225;
            return;
        }
        if (i == 187) {
            this.f79263 = false;
            return;
        }
        if (i == 19899) {
            this.f79252 = -1;
            this.f79228 = -1L;
            return;
        }
        if (i == 20533) {
            m54624(i);
            this.f79268.f21875 = true;
            return;
        }
        if (i == 21968) {
            m54624(i);
            this.f79268.f21918 = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.f79259;
            if (j3 != -1 && j3 != j) {
                throw C2970.m9688("Multiple Segment elements not supported", (Throwable) null);
            }
            this.f79259 = j;
            this.f79277 = j2;
            return;
        }
        if (i == 475249515) {
            this.f79276 = new C11590();
            this.f79258 = new C11590();
        } else if (i == 524531317 && !this.f79231) {
            if (this.f79281 && this.f79230 != -1) {
                this.f79248 = true;
            } else {
                this.f79270.mo16659(new C0857(this.f79238));
                this.f79231 = true;
            }
        }
    }
}
