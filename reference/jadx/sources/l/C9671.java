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

/* JADX INFO: renamed from: l.ۢܶܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8R9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9671 implements InterfaceC10045 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f32507;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f32508;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static final UUID f32509;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f32510 = {49, 10, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 44, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_CS3, 45, 45, 62, UTF8.S_CS3, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 44, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_P3A, 10};

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f32511;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public static final Map f32512;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f32513;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f32514;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f32515;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f32516;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f32517;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public boolean f32518;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f32519;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f32520;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public long f32521;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f32522;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f32523;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f32524;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C2460 f32525;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f32526;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f32527;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public boolean f32528;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C2460 f32529;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public long f32530;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f32531;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public boolean f32532;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f32533;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final C2460 f32534;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f32535;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f32536;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final C2460 f32537;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11082 f32538;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f32539;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public byte f32540;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C2460 f32541;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int[] f32542;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final C2460 f32543;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f32544;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f32545;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f32546;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f32547;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public long f32548;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f32549;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final C4918 f32550;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f32551;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2460 f32552;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C16532 f32553;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public long f32554;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C16532 f32555;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public long f32556;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C1908 f32557;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13302 f32558;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC15690 f32559;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final C2460 f32560;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2460 f32561;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final SparseArray f32562;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f32563;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f32564;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f32565;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final C2460 f32566;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f32567;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f32568;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f32569;

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2751() {
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC10045 mo2755() {
        return this;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ᩹ */
    public final List mo2756() {
        return AbstractC22433.of();
    }

    static {
        String str = C17983.f57504;
        f32507 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f32511 = new byte[]{68, 105, 97, 108, KeyFactorySpi.x448_type, 103, 117, 101, 58, UTF8.S_CS3, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 44, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 44};
        f32508 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 46, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_CS3, 45, 45, 62, UTF8.S_CS3, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 46, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_P3A, 10};
        f32509 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        C6009.m16314(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        C6009.m16314(180, map, "htc_video_rotA-180", BottomAppBarTopEdgeTreatment.ANGLE_UP, "htc_video_rotA-270");
        f32512 = C0561.unmodifiableMap(map);
    }

    public C9671(InterfaceC13302 interfaceC13302, int i) {
        C11082 c11082 = new C11082();
        this.f32554 = -1L;
        this.f32530 = -9223372036854775807L;
        this.f32533 = -9223372036854775807L;
        this.f32536 = -9223372036854775807L;
        this.f32531 = -1L;
        this.f32548 = -1L;
        this.f32563 = -9223372036854775807L;
        this.f32538 = c11082;
        c11082.m27928(new C14610(this));
        this.f32558 = interfaceC13302;
        this.f32568 = (i & 1) == 0;
        this.f32526 = (i & 2) == 0;
        this.f32550 = new C4918();
        this.f32562 = new SparseArray();
        this.f32566 = new C2460(4);
        this.f32560 = new C2460(ByteBuffer.allocate(4).putInt(-1).array());
        this.f32543 = new C2460(4);
        this.f32552 = new C2460(C11551.f38845);
        this.f32541 = new C2460(4);
        this.f32525 = new C2460();
        this.f32534 = new C2460();
        this.f32529 = new C2460(8);
        this.f32561 = new C2460();
        this.f32537 = new C2460();
        this.f32542 = new int[1];
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2754(InterfaceC7222 interfaceC7222) {
        return new C3319().m9825((C14984) interfaceC7222);
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2753(InterfaceC15690 interfaceC15690) {
        if (this.f32526) {
            interfaceC15690 = new C23180(interfaceC15690, this.f32558);
        }
        this.f32559 = interfaceC15690;
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final void mo2752(long j, long j2) {
        this.f32563 = -9223372036854775807L;
        int i = 0;
        this.f32520 = 0;
        this.f32538.m27927();
        this.f32550.m13684();
        m24580();
        while (true) {
            SparseArray sparseArray = this.f32562;
            if (i >= sparseArray.size()) {
                return;
            }
            C19300 c19300 = ((C1908) sparseArray.valueAt(i)).f7239;
            if (c19300 != null) {
                c19300.m44285();
            }
            i++;
        }
    }

    @Override // l.InterfaceC10045
    /* JADX INFO: renamed from: ۙ */
    public final int mo2750(InterfaceC7222 interfaceC7222, C0954 c0954) throws C22861 {
        int i = 0;
        this.f32513 = false;
        boolean zM27929 = true;
        while (zM27929 && !this.f32513) {
            zM27929 = this.f32538.m27929(interfaceC7222);
            if (zM27929) {
                long position = interfaceC7222.getPosition();
                if (this.f32528) {
                    this.f32548 = position;
                    c0954.f3770 = this.f32531;
                    this.f32528 = false;
                    return 1;
                }
                if (this.f32532) {
                    long j = this.f32548;
                    if (j != -1) {
                        c0954.f3770 = j;
                        this.f32548 = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            }
        }
        if (zM27929) {
            return 0;
        }
        while (true) {
            SparseArray sparseArray = this.f32562;
            if (i >= sparseArray.size()) {
                return -1;
            }
            C1908 c1908 = (C1908) sparseArray.valueAt(i);
            c1908.f7219.getClass();
            C19300 c19300 = c1908.f7239;
            if (c19300 != null) {
                c19300.m44288(c1908.f7219, c1908.f7248);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24595(int i, long j) {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw C22861.m50610("ContentEncodingOrder " + j + " not supported", (Throwable) null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw C22861.m50610("ContentEncodingScope " + j + " not supported", (Throwable) null);
        }
        switch (i) {
            case 131:
                m24589(i);
                this.f32557.f7216 = (int) j;
                return;
            case 136:
                m24589(i);
                this.f32557.f7217 = j == 1;
                return;
            case 155:
                this.f32544 = m24583(j);
                return;
            case 159:
                m24589(i);
                this.f32557.f7202 = (int) j;
                return;
            case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                m24589(i);
                this.f32557.f7221 = (int) j;
                return;
            case 179:
                m24590(i);
                this.f32555.m38907(m24583(j));
                return;
            case 186:
                m24589(i);
                this.f32557.f7233 = (int) j;
                return;
            case 215:
                m24589(i);
                this.f32557.f7201 = (int) j;
                return;
            case 231:
                this.f32563 = m24583(j);
                return;
            case 238:
                this.f32522 = (int) j;
                return;
            case 241:
                if (this.f32564) {
                    return;
                }
                m24590(i);
                this.f32553.m38907(j);
                this.f32564 = true;
                return;
            case 251:
                this.f32524 = true;
                return;
            case 16871:
                m24589(i);
                this.f32557.f7223 = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw C22861.m50610("ContentCompAlgo " + j + " not supported", (Throwable) null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw C22861.m50610("DocTypeReadVersion " + j + " not supported", (Throwable) null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw C22861.m50610("EBMLReadVersion " + j + " not supported", (Throwable) null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw C22861.m50610("ContentEncAlgo " + j + " not supported", (Throwable) null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw C22861.m50610("AESSettingsCipherMode " + j + " not supported", (Throwable) null);
            case 21420:
                this.f32521 = j + this.f32554;
                return;
            case 21432:
                int i2 = (int) j;
                m24589(i);
                if (i2 == 0) {
                    this.f32557.f7237 = 0;
                    return;
                }
                if (i2 == 1) {
                    this.f32557.f7237 = 2;
                    return;
                } else if (i2 == 3) {
                    this.f32557.f7237 = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.f32557.f7237 = 3;
                    return;
                }
            case 21680:
                m24589(i);
                this.f32557.f7238 = (int) j;
                return;
            case 21682:
                m24589(i);
                this.f32557.f7236 = (int) j;
                return;
            case 21690:
                m24589(i);
                this.f32557.f7244 = (int) j;
                return;
            case 21930:
                m24589(i);
                this.f32557.f7220 = j == 1;
                return;
            case 21938:
                m24589(i);
                C1908 c1908 = this.f32557;
                c1908.f7214 = true;
                c1908.f7228 = (int) j;
                return;
            case 21998:
                m24589(i);
                this.f32557.f7234 = (int) j;
                return;
            case 22186:
                m24589(i);
                this.f32557.f7209 = j;
                return;
            case 22203:
                m24589(i);
                this.f32557.f7245 = j;
                return;
            case 25188:
                m24589(i);
                this.f32557.f7207 = (int) j;
                return;
            case 30114:
                this.f32517 = j;
                return;
            case 30321:
                m24589(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    this.f32557.f7213 = 0;
                    return;
                }
                if (i3 == 1) {
                    this.f32557.f7213 = 1;
                    return;
                } else if (i3 == 2) {
                    this.f32557.f7213 = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.f32557.f7213 = 3;
                    return;
                }
            case 2352003:
                m24589(i);
                this.f32557.f7231 = (int) j;
                return;
            case 2807729:
                this.f32530 = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        m24589(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            this.f32557.f7226 = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.f32557.f7226 = 1;
                            return;
                        }
                    case 21946:
                        m24589(i);
                        int iM11703 = C4119.m11703((int) j);
                        if (iM11703 != -1) {
                            this.f32557.f7212 = iM11703;
                            return;
                        }
                        return;
                    case 21947:
                        m24589(i);
                        this.f32557.f7214 = true;
                        int iM11700 = C4119.m11700((int) j);
                        if (iM11700 != -1) {
                            this.f32557.f7205 = iM11700;
                            return;
                        }
                        return;
                    case 21948:
                        m24589(i);
                        this.f32557.f7225 = (int) j;
                        return;
                    case 21949:
                        m24589(i);
                        this.f32557.f7235 = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:0x02b6  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24594(int i, int i2, InterfaceC7222 interfaceC7222) {
        C2460 c2460;
        char c;
        char c2;
        C2460 c2461;
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        SparseArray sparseArray = this.f32562;
        int i7 = 1;
        int i8 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (this.f32520 != 2) {
                    return;
                }
                C1908 c1908 = (C1908) sparseArray.get(this.f32567);
                if (this.f32522 == 4 && "V_VP9".equals(c1908.f7246)) {
                    C2460 c2462 = this.f32537;
                    c2462.m7517(i2);
                    interfaceC7222.readFully(c2462.m7518(), 0, i2);
                    return;
                }
                interfaceC7222.mo19214(i2);
                return;
            }
            if (i == 16877) {
                m24589(i);
                C1908 c1909 = this.f32557;
                if (c1909.f7223 == 1685485123 || c1909.f7223 == 1685480259) {
                    byte[] bArr = new byte[i2];
                    c1909.f7215 = bArr;
                    interfaceC7222.readFully(bArr, 0, i2);
                    return;
                }
                interfaceC7222.mo19214(i2);
                return;
            }
            if (i == 16981) {
                m24589(i);
                byte[] bArr2 = new byte[i2];
                this.f32557.f7232 = bArr2;
                interfaceC7222.readFully(bArr2, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                interfaceC7222.readFully(bArr3, 0, i2);
                m24589(i);
                this.f32557.f7248 = new C18594(1, bArr3, 0, 0);
                return;
            }
            if (i == 21419) {
                C2460 c2463 = this.f32543;
                Arrays.fill(c2463.m7518(), (byte) 0);
                interfaceC7222.readFully(c2463.m7518(), 4 - i2, i2);
                c2463.m7510(0);
                this.f32515 = (int) c2463.m7532();
                return;
            }
            if (i == 25506) {
                m24589(i);
                byte[] bArr4 = new byte[i2];
                this.f32557.f7199 = bArr4;
                interfaceC7222.readFully(bArr4, 0, i2);
                return;
            }
            if (i == 30322) {
                m24589(i);
                byte[] bArr5 = new byte[i2];
                this.f32557.f7247 = bArr5;
                interfaceC7222.readFully(bArr5, 0, i2);
                return;
            }
            throw C22861.m50610("Unexpected id: " + i, (Throwable) null);
        }
        int i9 = this.f32520;
        int i10 = 8;
        C2460 c2464 = this.f32566;
        if (i9 == 0) {
            C4918 c4918 = this.f32550;
            this.f32567 = (int) c4918.m13683(interfaceC7222, false, true, 8);
            this.f32547 = c4918.m13682();
            this.f32544 = -9223372036854775807L;
            this.f32520 = 1;
            c2464.m7517(0);
        }
        C1908 c19010 = (C1908) sparseArray.get(this.f32567);
        if (c19010 != null) {
            c19010.f7219.getClass();
            if (this.f32520 == 1) {
                m24585(interfaceC7222, 3);
                int i11 = (c2464.m7518()[2] & 6) >> 1;
                byte b = 255;
                if (i11 == 0) {
                    this.f32565 = 1;
                    int[] iArr = this.f32542;
                    if (iArr == null) {
                        iArr = new int[1];
                    } else if (iArr.length < 1) {
                        iArr = new int[Math.max(iArr.length * 2, 1)];
                    }
                    this.f32542 = iArr;
                    iArr[0] = (i2 - this.f32547) - 3;
                } else {
                    m24585(interfaceC7222, 4);
                    int i12 = (c2464.m7518()[3] & 255) + 1;
                    this.f32565 = i12;
                    int[] iArr2 = this.f32542;
                    if (iArr2 == null) {
                        iArr2 = new int[i12];
                    } else if (iArr2.length < i12) {
                        iArr2 = new int[Math.max(iArr2.length * 2, i12)];
                    }
                    this.f32542 = iArr2;
                    if (i11 == 2) {
                        int i13 = (i2 - this.f32547) - 4;
                        int i14 = this.f32565;
                        Arrays.fill(iArr2, 0, i14, i13 / i14);
                    } else {
                        if (i11 == 1) {
                            int i15 = 0;
                            int i16 = 0;
                            int i17 = 4;
                            while (true) {
                                i3 = this.f32565 - 1;
                                if (i15 >= i3) {
                                    break;
                                }
                                this.f32542[i15] = 0;
                                while (true) {
                                    i4 = i17 + 1;
                                    m24585(interfaceC7222, i4);
                                    int i18 = c2464.m7518()[i17] & 255;
                                    int[] iArr3 = this.f32542;
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
                            this.f32542[i3] = ((i2 - this.f32547) - i17) - i16;
                        } else {
                            if (i11 != 3) {
                                throw C22861.m50610("Unexpected lacing value: " + i11, (Throwable) null);
                            }
                            int i19 = 0;
                            int i20 = 0;
                            int i21 = 4;
                            while (true) {
                                int i22 = this.f32565 - i7;
                                if (i19 < i22) {
                                    this.f32542[i19] = i8;
                                    int i23 = i21 + 1;
                                    m24585(interfaceC7222, i23);
                                    if (c2464.m7518()[i21] == 0) {
                                        throw C22861.m50610("No valid varint length mask found", (Throwable) null);
                                    }
                                    int i24 = 0;
                                    while (true) {
                                        if (i24 >= i10) {
                                            c2461 = c2464;
                                            j = 0;
                                            i21 = i23;
                                            break;
                                        }
                                        int i25 = i7 << (7 - i24);
                                        if ((c2464.m7518()[i21] & i25) != 0) {
                                            int i26 = i23 + i24;
                                            m24585(interfaceC7222, i26);
                                            j = (~i25) & c2464.m7518()[i21] & b;
                                            while (i23 < i26) {
                                                j = (j << 8) | ((long) (c2464.m7518()[i23] & 255));
                                                i23++;
                                                c2464 = c2464;
                                            }
                                            c2461 = c2464;
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
                                        throw C22861.m50610("EBML lacing sample size out of range.", (Throwable) null);
                                    }
                                    int i27 = (int) j;
                                    int[] iArr4 = this.f32542;
                                    if (i19 != 0) {
                                        i27 += iArr4[i19 - 1];
                                    }
                                    iArr4[i19] = i27;
                                    i20 += i27;
                                    i19++;
                                    i7 = 1;
                                    i8 = 0;
                                    i10 = 8;
                                    c2464 = c2461;
                                    b = 255;
                                } else {
                                    c2460 = c2464;
                                    this.f32542[i22] = ((i2 - this.f32547) - i21) - i20;
                                    c = 1;
                                    c2 = 0;
                                    break;
                                }
                            }
                        }
                        this.f32527 = this.f32563 + m24583((c2460.m7518()[c] & 255) | (c2460.m7518()[c2] << 8));
                        if (c19010.f7216 != 2 || (i == 163 && (c2460.m7518()[2] & GCMSIVBlockCipher.MASK) == 128)) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        this.f32539 = i6;
                        this.f32520 = 2;
                        this.f32514 = 0;
                    }
                }
                c = 1;
                c2 = 0;
                c2460 = c2464;
                this.f32527 = this.f32563 + m24583((c2460.m7518()[c] & 255) | (c2460.m7518()[c2] << 8));
                if (c19010.f7216 != 2) {
                    i6 = 1;
                } else {
                    i6 = 1;
                }
                this.f32539 = i6;
                this.f32520 = 2;
                this.f32514 = 0;
            }
            if (i == 163) {
                while (true) {
                    int i28 = this.f32514;
                    if (i28 < this.f32565) {
                        m24584(c19010, ((long) ((this.f32514 * c19010.f7231) / 1000)) + this.f32527, this.f32539, m24582(interfaceC7222, c19010, this.f32542[i28], false), 0);
                        this.f32514++;
                    } else {
                        this.f32520 = 0;
                        return;
                    }
                }
            } else {
                while (true) {
                    int i29 = this.f32514;
                    if (i29 >= this.f32565) {
                        return;
                    }
                    int[] iArr5 = this.f32542;
                    iArr5[i29] = m24582(interfaceC7222, c19010, iArr5[i29], true);
                    this.f32514++;
                }
            }
        } else {
            interfaceC7222.mo19214(i2 - this.f32547);
            this.f32520 = 0;
        }
    }

    @EnsuresNonNull({"currentTrack"})
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m24589(int i) throws C22861 {
        if (this.f32557 != null) {
            return;
        }
        throw C22861.m50610("Element " + i + " must be in a TrackEntry", (Throwable) null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m24590(int i) throws C22861 {
        if (this.f32555 == null || this.f32553 == null) {
            throw C22861.m50610("Element " + i + " must be in a Cues", (Throwable) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24593(int i, double d) {
        if (i == 181) {
            m24589(i);
            this.f32557.f7249 = (int) d;
            return;
        }
        if (i == 17545) {
            this.f32533 = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                m24589(i);
                this.f32557.f7203 = (float) d;
                break;
            case 21970:
                m24589(i);
                this.f32557.f7210 = (float) d;
                break;
            case 21971:
                m24589(i);
                this.f32557.f7229 = (float) d;
                break;
            case 21972:
                m24589(i);
                this.f32557.f7224 = (float) d;
                break;
            case 21973:
                m24589(i);
                this.f32557.f7204 = (float) d;
                break;
            case 21974:
                m24589(i);
                this.f32557.f7208 = (float) d;
                break;
            case 21975:
                m24589(i);
                this.f32557.f7241 = (float) d;
                break;
            case 21976:
                m24589(i);
                this.f32557.f7218 = (float) d;
                break;
            case 21977:
                m24589(i);
                this.f32557.f7211 = (float) d;
                break;
            case 21978:
                m24589(i);
                this.f32557.f7222 = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        m24589(i);
                        this.f32557.f7206 = (float) d;
                        break;
                    case 30324:
                        m24589(i);
                        this.f32557.f7200 = (float) d;
                        break;
                    case 30325:
                        m24589(i);
                        this.f32557.f7227 = (float) d;
                        break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24596(int i, String str) {
        if (i == 134) {
            m24589(i);
            this.f32557.f7246 = str;
            return;
        }
        if (i == 17026) {
            if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw C22861.m50610("DocType " + str + " not supported", (Throwable) null);
            }
            this.f32551 = str.equals("webm");
            return;
        }
        if (i == 21358) {
            m24589(i);
            this.f32557.f7230 = str;
        } else {
            if (i != 2274716) {
                return;
            }
            m24589(i);
            this.f32557.f7198 = str;
        }
    }

    @RequiresNonNull({"#1.output"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24584(C1908 c1908, long j, int i, int i2, int i3) {
        byte[] bArrM24587;
        int i4;
        int iM7509;
        C19300 c19300 = c1908.f7239;
        if (c19300 != null) {
            c19300.m44287(c1908.f7219, j, i, i2, i3, c1908.f7248);
        } else {
            if ("S_TEXT/UTF8".equals(c1908.f7246) || "S_TEXT/ASS".equals(c1908.f7246) || "S_TEXT/SSA".equals(c1908.f7246) || "S_TEXT/WEBVTT".equals(c1908.f7246)) {
                if (this.f32565 > 1) {
                    C0303.m1848("Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.f32544;
                    if (j2 == -9223372036854775807L) {
                        C0303.m1848("Skipping subtitle sample with no duration.");
                    } else {
                        String str = c1908.f7246;
                        C2460 c2460 = this.f32534;
                        byte[] bArrM7518 = c2460.m7518();
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                bArrM24587 = m24587("%01d:%02d:%02d:%02d", j2, 10000L);
                                i4 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrM24587 = m24587("%02d:%02d:%02d.%03d", j2, 1000L);
                                i4 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrM24587 = m24587("%02d:%02d:%02d,%03d", j2, 1000L);
                                i4 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(bArrM24587, 0, bArrM7518, i4, bArrM24587.length);
                        for (int iM7500 = c2460.m7500(); iM7500 < c2460.m7509(); iM7500++) {
                            if (c2460.m7518()[iM7500] == 0) {
                                c2460.m7501(iM7500);
                                c1908.f7219.mo8112(c2460.m7509(), c2460);
                                iM7509 = c2460.m7509() + i2;
                            }
                        }
                        c1908.f7219.mo8112(c2460.m7509(), c2460);
                        iM7509 = c2460.m7509() + i2;
                    }
                }
                iM7509 = i2;
            } else {
                iM7509 = i2;
            }
            if ((i & 268435456) != 0) {
                int i5 = this.f32565;
                C2460 c2461 = this.f32537;
                if (i5 > 1) {
                    c2461.m7517(0);
                } else {
                    int iM75010 = c2461.m7509();
                    c1908.f7219.mo8115(c2461, iM75010, 2);
                    iM7509 += iM75010;
                }
            }
            c1908.f7219.mo8114(j, i, iM7509, i3, c1908.f7248);
        }
        this.f32513 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24585(InterfaceC7222 interfaceC7222, int i) {
        C2460 c2460 = this.f32566;
        if (c2460.m7509() >= i) {
            return;
        }
        if (c2460.m7521() < i) {
            c2460.m7506(Math.max(c2460.m7521() * 2, i));
        }
        interfaceC7222.readFully(c2460.m7518(), c2460.m7509(), i - c2460.m7509());
        c2460.m7501(i);
    }

    @RequiresNonNull({"#2.output"})
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m24582(InterfaceC7222 interfaceC7222, C1908 c1908, int i, boolean z) throws C22861 {
        int iMo8111;
        int iMo8112;
        boolean z2;
        int i2;
        if ("S_TEXT/UTF8".equals(c1908.f7246)) {
            m24586(interfaceC7222, f32510, i);
        } else if ("S_TEXT/ASS".equals(c1908.f7246) || "S_TEXT/SSA".equals(c1908.f7246)) {
            m24586(interfaceC7222, f32511, i);
        } else if ("S_TEXT/WEBVTT".equals(c1908.f7246)) {
            m24586(interfaceC7222, f32508, i);
        } else {
            InterfaceC8011 interfaceC8011 = c1908.f7219;
            boolean z3 = this.f32535;
            C2460 c2460 = this.f32525;
            if (!z3) {
                boolean z4 = c1908.f7243;
                C2460 c2461 = this.f32566;
                if (z4) {
                    this.f32539 &= -1073741825;
                    if (!this.f32518) {
                        interfaceC7222.readFully(c2461.m7518(), 0, 1);
                        this.f32569++;
                        if ((c2461.m7518()[0] & GCMSIVBlockCipher.MASK) == 128) {
                            throw C22861.m50610("Extension bit is set in signal byte", (Throwable) null);
                        }
                        this.f32540 = c2461.m7518()[0];
                        this.f32518 = true;
                    }
                    byte b = this.f32540;
                    if ((b & 1) == 1) {
                        boolean z5 = (b & 2) == 2;
                        this.f32539 |= 1073741824;
                        if (!this.f32519) {
                            C2460 c2462 = this.f32529;
                            interfaceC7222.readFully(c2462.m7518(), 0, 8);
                            this.f32569 += 8;
                            this.f32519 = true;
                            c2461.m7518()[0] = (byte) ((z5 ? 128 : 0) | 8);
                            c2461.m7510(0);
                            interfaceC8011.mo8115(c2461, 1, 1);
                            this.f32546++;
                            c2462.m7510(0);
                            interfaceC8011.mo8115(c2462, 8, 1);
                            this.f32546 += 8;
                        }
                        if (z5) {
                            if (!this.f32545) {
                                interfaceC7222.readFully(c2461.m7518(), 0, 1);
                                this.f32569++;
                                c2461.m7510(0);
                                this.f32523 = c2461.m7516();
                                this.f32545 = true;
                            }
                            int i3 = this.f32523 * 4;
                            c2461.m7517(i3);
                            interfaceC7222.readFully(c2461.m7518(), 0, i3);
                            this.f32569 += i3;
                            short s = (short) ((this.f32523 / 2) + 1);
                            int i4 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.f32549;
                            if (byteBuffer == null || byteBuffer.capacity() < i4) {
                                this.f32549 = ByteBuffer.allocate(i4);
                            }
                            this.f32549.position(0);
                            this.f32549.putShort(s);
                            int i5 = 0;
                            int i6 = 0;
                            while (true) {
                                i2 = this.f32523;
                                if (i5 >= i2) {
                                    break;
                                }
                                int iM7531 = c2461.m7531();
                                if (i5 % 2 == 0) {
                                    this.f32549.putShort((short) (iM7531 - i6));
                                } else {
                                    this.f32549.putInt(iM7531 - i6);
                                }
                                i5++;
                                i6 = iM7531;
                            }
                            int i7 = (i - this.f32569) - i6;
                            if (i2 % 2 == 1) {
                                this.f32549.putInt(i7);
                            } else {
                                this.f32549.putShort((short) i7);
                                this.f32549.putInt(0);
                            }
                            byte[] bArrArray = this.f32549.array();
                            C2460 c2463 = this.f32561;
                            c2463.m7508(i4, bArrArray);
                            interfaceC8011.mo8115(c2463, i4, 1);
                            this.f32546 += i4;
                        }
                    }
                } else {
                    byte[] bArr = c1908.f7232;
                    if (bArr != null) {
                        c2460.m7508(bArr.length, bArr);
                    }
                }
                if ("A_OPUS".equals(c1908.f7246)) {
                    z2 = z;
                } else {
                    z2 = c1908.f7234 > 0;
                }
                if (z2) {
                    this.f32539 |= 268435456;
                    this.f32537.m7517(0);
                    int iM7509 = (c2460.m7509() + i) - this.f32569;
                    c2461.m7517(4);
                    c2461.m7518()[0] = (byte) ((iM7509 >> 24) & 255);
                    c2461.m7518()[1] = (byte) ((iM7509 >> 16) & 255);
                    c2461.m7518()[2] = (byte) ((iM7509 >> 8) & 255);
                    c2461.m7518()[3] = (byte) (iM7509 & 255);
                    interfaceC8011.mo8115(c2461, 4, 2);
                    this.f32546 += 4;
                }
                this.f32535 = true;
            }
            int iM75010 = c2460.m7509() + i;
            if ("V_MPEG4/ISO/AVC".equals(c1908.f7246) || "V_MPEGH/ISO/HEVC".equals(c1908.f7246)) {
                C2460 c2464 = this.f32541;
                byte[] bArrM7518 = c2464.m7518();
                bArrM7518[0] = 0;
                bArrM7518[1] = 0;
                bArrM7518[2] = 0;
                int i8 = c1908.f7250;
                int i9 = 4 - i8;
                while (this.f32569 < iM75010) {
                    int i10 = this.f32516;
                    if (i10 == 0) {
                        int iMin = Math.min(i8, c2460.m7503());
                        interfaceC7222.readFully(bArrM7518, i9 + iMin, i8 - iMin);
                        if (iMin > 0) {
                            c2460.m7507(i9, iMin, bArrM7518);
                        }
                        this.f32569 += i8;
                        c2464.m7510(0);
                        this.f32516 = c2464.m7531();
                        C2460 c2465 = this.f32552;
                        c2465.m7510(0);
                        interfaceC8011.mo8112(4, c2465);
                        this.f32546 += 4;
                    } else {
                        int iM7503 = c2460.m7503();
                        if (iM7503 > 0) {
                            iMo8111 = Math.min(i10, iM7503);
                            interfaceC8011.mo8112(iMo8111, c2460);
                        } else {
                            iMo8111 = interfaceC8011.mo8111((InterfaceC6942) interfaceC7222, i10, false);
                        }
                        this.f32569 += iMo8111;
                        this.f32546 += iMo8111;
                        this.f32516 -= iMo8111;
                    }
                }
            } else {
                if (c1908.f7239 != null) {
                    C2023.m6510(c2460.m7509() == 0);
                    c1908.f7239.m44286(interfaceC7222);
                }
                while (true) {
                    int i11 = this.f32569;
                    if (i11 >= iM75010) {
                        break;
                    }
                    int i12 = iM75010 - i11;
                    int iM7504 = c2460.m7503();
                    if (iM7504 > 0) {
                        iMo8112 = Math.min(i12, iM7504);
                        interfaceC8011.mo8112(iMo8112, c2460);
                    } else {
                        iMo8112 = interfaceC8011.mo8111((InterfaceC6942) interfaceC7222, i12, false);
                    }
                    this.f32569 += iMo8112;
                    this.f32546 += iMo8112;
                }
            }
            if ("A_VORBIS".equals(c1908.f7246)) {
                C2460 c2466 = this.f32560;
                c2466.m7510(0);
                interfaceC8011.mo8112(4, c2466);
                this.f32546 += 4;
            }
        }
        int i13 = this.f32546;
        m24580();
        return i13;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m24580() {
        this.f32569 = 0;
        this.f32546 = 0;
        this.f32516 = 0;
        this.f32535 = false;
        this.f32518 = false;
        this.f32545 = false;
        this.f32523 = 0;
        this.f32540 = (byte) 0;
        this.f32519 = false;
        this.f32525.m7517(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24586(InterfaceC7222 interfaceC7222, byte[] bArr, int i) {
        int length = bArr.length + i;
        C2460 c2460 = this.f32534;
        if (c2460.m7521() < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            c2460.getClass();
            c2460.m7508(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, c2460.m7518(), 0, bArr.length);
        }
        interfaceC7222.readFully(c2460.m7518(), bArr.length, i);
        c2460.m7510(0);
        c2460.m7501(length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m24587(String str, long j, long j2) {
        C2023.m6507(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        String str3 = C17983.f57504;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private long m24583(long j) throws C22861 {
        long j2 = this.f32530;
        if (j2 == -9223372036854775807L) {
            throw C22861.m50610("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
        }
        String str = C17983.f57504;
        return C17983.m41830(j, j2, 1000L, RoundingMode.DOWN);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:227:0x0345  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24592(int i) {
        InterfaceC6599 c3776;
        int i2;
        C2023.m6508(this.f32559);
        byte b = 8;
        SparseArray sparseArray = this.f32562;
        int i3 = 0;
        if (i == 160) {
            if (this.f32520 != 2) {
                return;
            }
            C1908 c1908 = (C1908) sparseArray.get(this.f32567);
            c1908.f7219.getClass();
            if (this.f32517 > 0 && "A_OPUS".equals(c1908.f7246)) {
                byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f32517).array();
                C2460 c2460 = this.f32537;
                c2460.getClass();
                c2460.m7508(bArrArray.length, bArrArray);
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f32565; i5++) {
                i4 += this.f32542[i5];
            }
            int i6 = 0;
            while (i6 < this.f32565) {
                long j = this.f32527 + ((long) ((c1908.f7231 * i6) / 1000));
                int i7 = this.f32539;
                if (i6 == 0 && !this.f32524) {
                    i7 |= 1;
                }
                int i8 = this.f32542[i6];
                int i9 = i4 - i8;
                m24584(c1908, j, i7, i8, i9);
                i6++;
                i4 = i9;
            }
            this.f32520 = 0;
            return;
        }
        if (i != 174) {
            if (i == 19899) {
                int i10 = this.f32515;
                if (i10 != -1) {
                    long j2 = this.f32521;
                    if (j2 != -1) {
                        if (i10 == 475249515) {
                            this.f32531 = j2;
                            return;
                        }
                        return;
                    }
                }
                throw C22861.m50610("Mandatory element SeekID or SeekPosition not found", (Throwable) null);
            }
            if (i == 25152) {
                m24589(i);
                C1908 c1909 = this.f32557;
                if (c1909.f7243) {
                    C18594 c18594 = c1909.f7248;
                    if (c18594 == null) {
                        throw C22861.m50610("Encrypted Track found but ContentEncKeyID was not found", (Throwable) null);
                    }
                    c1909.f7240 = new C8354(new C18937(C1297.f5560, null, "video/webm", c18594.f59156));
                    return;
                }
                return;
            }
            if (i == 28032) {
                m24589(i);
                C1908 c19010 = this.f32557;
                if (c19010.f7243 && c19010.f7232 != null) {
                    throw C22861.m50610("Combining encryption and compression is not supported", (Throwable) null);
                }
                return;
            }
            if (i == 357149030) {
                if (this.f32530 == -9223372036854775807L) {
                    this.f32530 = 1000000L;
                }
                long j3 = this.f32533;
                if (j3 != -9223372036854775807L) {
                    this.f32536 = m24583(j3);
                    return;
                }
                return;
            }
            if (i == 374648427) {
                if (sparseArray.size() == 0) {
                    throw C22861.m50610("No valid tracks were found", (Throwable) null);
                }
                this.f32559.mo7696();
                return;
            }
            if (i != 475249515) {
                return;
            }
            if (!this.f32532) {
                InterfaceC15690 interfaceC15690 = this.f32559;
                C16532 c16532 = this.f32555;
                C16532 c16533 = this.f32553;
                if (this.f32554 == -1 || this.f32536 == -9223372036854775807L || c16532 == null || c16532.m38905() == 0 || c16533 == null || c16533.m38905() != c16532.m38905()) {
                    c3776 = new C3776(this.f32536);
                } else {
                    int iM38905 = c16532.m38905();
                    int[] iArrCopyOf = new int[iM38905];
                    long[] jArrCopyOf = new long[iM38905];
                    long[] jArrCopyOf2 = new long[iM38905];
                    long[] jArrCopyOf3 = new long[iM38905];
                    for (int i11 = 0; i11 < iM38905; i11++) {
                        jArrCopyOf3[i11] = c16532.m38906(i11);
                        jArrCopyOf[i11] = c16533.m38906(i11) + this.f32554;
                    }
                    while (true) {
                        i2 = iM38905 - 1;
                        if (i3 >= i2) {
                            break;
                        }
                        int i12 = i3 + 1;
                        iArrCopyOf[i3] = (int) (jArrCopyOf[i12] - jArrCopyOf[i3]);
                        jArrCopyOf2[i3] = jArrCopyOf3[i12] - jArrCopyOf3[i3];
                        i3 = i12;
                    }
                    int i13 = i2;
                    while (i13 > 0 && jArrCopyOf3[i13] > this.f32536) {
                        i13--;
                    }
                    iArrCopyOf[i13] = (int) ((this.f32554 + this.f32556) - jArrCopyOf[i13]);
                    jArrCopyOf2[i13] = this.f32536 - jArrCopyOf3[i13];
                    if (i13 < i2) {
                        C0303.m1848("Discarding trailing cue points with timestamps greater than total duration");
                        int i14 = i13 + 1;
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i14);
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i14);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i14);
                        jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i14);
                    }
                    c3776 = new C3693(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                }
                interfaceC15690.mo7690(c3776);
                this.f32532 = true;
            }
            this.f32555 = null;
            this.f32553 = null;
            return;
        }
        C1908 c19011 = this.f32557;
        C2023.m6508(c19011);
        String str = c19011.f7246;
        if (str == null) {
            throw C22861.m50610("CodecId is missing in TrackEntry element", (Throwable) null);
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
                    b = cb.f77931l;
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
                c19011.m6214(this.f32559, c19011.f7201);
                sparseArray.put(c19011.f7201, c19011);
                break;
        }
        this.f32557 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24597(long j, int i, long j2) {
        C2023.m6508(this.f32559);
        if (i == 160) {
            this.f32524 = false;
            this.f32517 = 0L;
            return;
        }
        if (i == 174) {
            C1908 c1908 = new C1908();
            this.f32557 = c1908;
            c1908.f7242 = this.f32551;
            return;
        }
        if (i == 187) {
            this.f32564 = false;
            return;
        }
        if (i == 19899) {
            this.f32515 = -1;
            this.f32521 = -1L;
            return;
        }
        if (i == 20533) {
            m24589(i);
            this.f32557.f7243 = true;
            return;
        }
        if (i == 21968) {
            m24589(i);
            this.f32557.f7214 = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.f32554;
            if (j3 != -1 && j3 != j) {
                throw C22861.m50610("Multiple Segment elements not supported", (Throwable) null);
            }
            this.f32554 = j;
            this.f32556 = j2;
            return;
        }
        if (i == 475249515) {
            this.f32555 = new C16532();
            this.f32553 = new C16532();
        } else if (i == 524531317 && !this.f32532) {
            if (this.f32568 && this.f32531 != -1) {
                this.f32528 = true;
            } else {
                this.f32559.mo7690(new C3776(this.f32536));
                this.f32532 = true;
            }
        }
    }
}
