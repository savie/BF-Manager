package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Iterator;
import java.util.List;
import java.util.function.ToIntFunction;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.ۤۘ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 24FJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10039 {

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f34268 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f34270;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23800 f34271;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f34273;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f34276;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C13485 f34277;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f34280;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C14978[] f34281;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C14978[] f34283;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18258 f34284;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public EnumC7922 f34287;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C3836 f34290;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C5888 f34293;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC9831 f34296;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f34300;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f34301;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C8628 f34303;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f34282 = 0;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f34297 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f34286 = new byte[64];

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f34272 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C19003 f34289 = new C19003();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C21825 f34295 = C21825.m48588();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f34275 = true;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f34288 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f34299 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C6510 f34292 = null;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f34269 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f34298 = false;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f34291 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C19211[] f34294 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC4393[] f34285 = null;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f34278 = 0;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f34302 = -1;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C19211 f34279 = null;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C19211 f34274 = null;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static int m25343(int i) {
        if (i == 1 || i == 3) {
            return 2;
        }
        return i != 8 ? 1 : 0;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m25347(int i) {
        if (i == 198) {
            return 199;
        }
        if (i == 199) {
            return 198;
        }
        return ((i + 1) ^ 1) - 1;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int m25348(int i) {
        if (i == 5 || i == 6 || i == 7) {
            return 0;
        }
        return i;
    }

    public C10039(C18258 c18258, boolean z, InterfaceC9831 interfaceC9831, boolean z2, EnumC7922 enumC7922, boolean z3, C13485 c13485, C3836 c3836, C23800 c23800, C5888 c5888) {
        this.f34284 = c18258;
        this.f34270 = z;
        this.f34296 = interfaceC9831;
        this.f34300 = interfaceC9831 != null;
        this.f34276 = z2;
        this.f34277 = c13485;
        this.f34290 = c3836;
        this.f34271 = c23800;
        this.f34293 = c5888;
        this.f34301 = z3;
        this.f34287 = enumC7922;
        int iOrdinal = enumC7922.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            this.f34280 = true;
        } else {
            this.f34280 = false;
        }
        this.f34303 = new C8628(this);
        this.f34281 = new C14978[20];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m25336(AbstractC16579 abstractC16579) {
        switch (C3687.f13463[abstractC16579.mo1933().ordinal()]) {
            case 1:
                return 5;
            case 2:
                return 7;
            case 3:
                return 6;
            case 4:
                return 0;
            case 5:
                return 1;
            case 6:
                return 2;
            case 7:
                return 3;
            case 8:
                return 5;
            case 9:
                return 8;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return 4;
            default:
                throw new AssertionError("typecode " + abstractC16579.mo1933());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m25344(AbstractC16579 abstractC16579) {
        if (abstractC16579 == null) {
            return 1;
        }
        return m25343(m25336(abstractC16579));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m25337(C21825 c21825) {
        int iM25344 = 0;
        while (c21825.m48595()) {
            iM25344 += m25344((AbstractC16579) c21825.f70876);
            c21825 = c21825.f70877;
        }
        return iM25344;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m25383() {
        if (this.f34292 != null) {
            m25356();
        }
        if (this.f34269 != -1) {
            m25351();
        }
        this.f34288 = true;
        return this.f34272;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m25342(int i) {
        if (this.f34275) {
            byte[] bArrM52455 = C23805.m52455(this.f34272, this.f34286);
            this.f34286 = bArrM52455;
            int i2 = this.f34272;
            this.f34272 = i2 + 1;
            bArrM52455[i2] = (byte) i;
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m25350(int i) {
        if (this.f34275) {
            int i2 = this.f34272;
            int i3 = i2 + 2;
            byte[] bArr = this.f34286;
            if (i3 > bArr.length) {
                m25342(i >> 8);
                m25342(i);
                return;
            }
            int i4 = i2 + 1;
            this.f34272 = i4;
            bArr[i2] = (byte) (i >> 8);
            this.f34272 = i3;
            bArr[i4] = (byte) i;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m25384(int i) {
        if (this.f34275) {
            int i2 = this.f34272;
            int i3 = i2 + 4;
            byte[] bArr = this.f34286;
            if (i3 > bArr.length) {
                m25342(i >> 24);
                m25342(i >> 16);
                m25342(i >> 8);
                m25342(i);
                return;
            }
            int i4 = i2 + 1;
            this.f34272 = i4;
            bArr[i2] = (byte) (i >> 24);
            int i5 = i2 + 2;
            this.f34272 = i5;
            bArr[i4] = (byte) (i >> 16);
            int i6 = i2 + 3;
            this.f34272 = i6;
            bArr[i5] = (byte) (i >> 8);
            this.f34272 = i3;
            bArr[i6] = (byte) i;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01c2  */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m25346(int i) {
        C14978 c14978;
        AbstractC4393 c14542;
        AbstractC4393 c9603;
        C14978 c14979;
        int i2;
        if (this.f34292 != null) {
            m25356();
        }
        if (this.f34275) {
            if (this.f34269 != -1) {
                m25351();
            }
            boolean z = this.f34298;
            boolean z2 = this.f34301;
            if (z) {
                int i3 = 0;
                this.f34298 = false;
                int iM25383 = m25383();
                if (this.f34280) {
                    int iOrdinal = this.f34287.ordinal();
                    C23800 c23800 = this.f34271;
                    if (iOrdinal == 1) {
                        int iM25341 = m25341();
                        if (this.f34302 == iM25383) {
                            C19211[] c19211Arr = this.f34294;
                            int i4 = this.f34278 - 1;
                            this.f34278 = i4;
                            c19211Arr[i4] = null;
                        }
                        this.f34302 = iM25383;
                        C19211[] c19211Arr2 = this.f34294;
                        if (c19211Arr2 == null) {
                            this.f34294 = new C19211[20];
                        } else {
                            this.f34294 = (C19211[]) C23805.m52456(this.f34278, c19211Arr2);
                        }
                        C19211[] c19211Arr3 = this.f34294;
                        int i5 = this.f34278;
                        this.f34278 = i5 + 1;
                        C19211 c19211 = new C19211();
                        c19211Arr3[i5] = c19211;
                        c19211.f62037 = iM25383;
                        c19211.f62035 = new AbstractC16579[iM25341];
                        for (int i6 = 0; i6 < iM25341; i6++) {
                            if (this.f34303.f29777.m19735(i6) && (c14978 = this.f34281[i6]) != null) {
                                AbstractC16579 abstractC16579M52402 = c14978.f48887.f77449;
                                if (!(abstractC16579M52402 instanceof C12011)) {
                                    abstractC16579M52402 = c23800.m52402(abstractC16579M52402);
                                }
                                c19211.f62035[i6] = abstractC16579M52402;
                            }
                        }
                        c19211.f62036 = new AbstractC16579[this.f34303.f29776];
                        while (true) {
                            C8628 c8628 = this.f34303;
                            if (i3 >= c8628.f29776) {
                                break;
                            }
                            c19211.f62036[i3] = c8628.f29778[i3];
                            i3++;
                        }
                    } else if (iOrdinal == 2) {
                        int iM25342 = m25341();
                        C19211 c19212 = this.f34279;
                        if (c19212 != null) {
                            if (c19212.f62037 == iM25383) {
                                AbstractC4393[] abstractC4393Arr = this.f34285;
                                int i7 = this.f34278 - 1;
                                this.f34278 = i7;
                                abstractC4393Arr[i7] = null;
                                this.f34279 = this.f34274;
                                this.f34274 = null;
                            }
                        } else {
                            C19211 c19213 = new C19211();
                            C18258 c18258 = this.f34284;
                            C21825 c21825 = ((C13757) c18258.m52698(c23800)).f45367;
                            int iM48596 = c21825.m48596();
                            if (!c18258.mo22992()) {
                                AbstractC16579 abstractC16579 = c18258.f77448.f77449;
                                c19213.f62035 = new AbstractC16579[iM48596 + 1];
                                if (c18258.m52713() && abstractC16579 != this.f34290.f14275) {
                                    c19213.f62035[0] = C12011.m29905(abstractC16579);
                                } else {
                                    c19213.f62035[0] = c23800.m52402(abstractC16579);
                                }
                                i2 = 1;
                            } else {
                                c19213.f62035 = new AbstractC16579[iM48596];
                                i2 = 0;
                            }
                            Iterator it = c21825.iterator();
                            while (it.hasNext()) {
                                c19213.f62035[i2] = c23800.m52402((AbstractC16579) it.next());
                                i2++;
                            }
                            c19213.f62037 = -1;
                            c19213.f62036 = null;
                            this.f34279 = c19213;
                        }
                        C19211 c19214 = new C19211();
                        c19214.f62037 = iM25383;
                        AbstractC16579[] abstractC16579Arr = new AbstractC16579[iM25342];
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < iM25342) {
                            if (this.f34303.f29777.m19735(i8) && (c14979 = this.f34281[i8]) != null) {
                                AbstractC16579 abstractC16579M52403 = c14979.f48887.f77449;
                                if (!(abstractC16579M52403 instanceof C12011)) {
                                    abstractC16579M52403 = c23800.m52402(abstractC16579M52403);
                                }
                                abstractC16579Arr[i8] = abstractC16579M52403;
                                if (m25344(abstractC16579M52403) > 1) {
                                    i8++;
                                }
                            }
                            i8++;
                            i9++;
                        }
                        c19214.f62035 = new AbstractC16579[i9];
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < iM25342) {
                            C6171.m17176(i11 < i9);
                            c19214.f62035[i11] = abstractC16579Arr[i10];
                            if (m25344(abstractC16579Arr[i10]) > 1) {
                                i10++;
                            }
                            i10++;
                            i11++;
                        }
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            C8628 c8629 = this.f34303;
                            if (i12 >= c8629.f29776) {
                                break;
                            }
                            if (c8629.f29778[i12] != null) {
                                i13++;
                            }
                            i12++;
                        }
                        c19214.f62036 = new AbstractC16579[i13];
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            C8628 c86210 = this.f34303;
                            if (i14 >= c86210.f29776) {
                                break;
                            }
                            AbstractC16579 abstractC165710 = c86210.f29778[i14];
                            if (abstractC165710 != null) {
                                c19214.f62036[i15] = c23800.m52402(abstractC165710);
                                i15++;
                            }
                            i14++;
                        }
                        AbstractC4393[] abstractC4393Arr2 = this.f34285;
                        if (abstractC4393Arr2 == null) {
                            this.f34285 = new AbstractC4393[20];
                        } else {
                            this.f34285 = (AbstractC4393[]) C23805.m52456(this.f34278, abstractC4393Arr2);
                        }
                        AbstractC4393[] abstractC4393Arr3 = this.f34285;
                        int i16 = this.f34278;
                        this.f34278 = i16 + 1;
                        C19211 c19215 = this.f34279;
                        int i17 = c19215.f62037;
                        AbstractC16579[] abstractC16579Arr2 = c19215.f62035;
                        AbstractC16579[] abstractC16579Arr3 = c19214.f62035;
                        AbstractC16579[] abstractC16579Arr4 = c19214.f62036;
                        int i18 = (c19214.f62037 - i17) - 1;
                        if (abstractC16579Arr4.length == 1) {
                            if (abstractC16579Arr3.length == abstractC16579Arr2.length && AbstractC4393.m12253(abstractC16579Arr2, abstractC16579Arr3, c23800) == 0) {
                                c9603 = new C3251(i18, abstractC16579Arr4[0]);
                            } else {
                                c9603 = new C1840(i18, abstractC16579Arr3, abstractC16579Arr4);
                            }
                        } else if (abstractC16579Arr4.length == 0) {
                            int iM12253 = AbstractC4393.m12253(abstractC16579Arr2, abstractC16579Arr3, c23800);
                            if (iM12253 == 0) {
                                c9603 = new C9603(i18);
                            } else {
                                if (-4 < iM12253 && iM12253 < 0) {
                                    AbstractC16579[] abstractC16579Arr5 = new AbstractC16579[-iM12253];
                                    int length = abstractC16579Arr2.length;
                                    while (length < abstractC16579Arr3.length) {
                                        abstractC16579Arr5[i3] = abstractC16579Arr3[length];
                                        length++;
                                        i3++;
                                    }
                                    c14542 = new C23714(251 - iM12253, i18, abstractC16579Arr5);
                                } else if (iM12253 > 0 && iM12253 < 4) {
                                    c14542 = new C14542(251 - iM12253, i18);
                                } else {
                                    c9603 = new C1840(i18, abstractC16579Arr3, abstractC16579Arr4);
                                }
                                c9603 = c14542;
                            }
                        } else {
                            c9603 = new C1840(i18, abstractC16579Arr3, abstractC16579Arr4);
                        }
                        abstractC4393Arr3[i16] = c9603;
                        this.f34274 = this.f34279;
                        this.f34279 = c19214;
                    } else {
                        throw new AssertionError("Should have chosen a stackmap format");
                    }
                    if (z2) {
                        this.f34303.m22420(iM25383);
                    }
                }
            }
            if (z2) {
                System.err.println("emit@" + this.f34272 + " stack=" + this.f34303.f29776 + ": " + C21327.f69414[i]);
            }
            m25342(i);
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m25382() {
        C6171.m17176(this.f34275 || m25376());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25371(InterfaceC7299 interfaceC7299) {
        int iM16112 = this.f34293.m16112(interfaceC7299);
        if (iM16112 <= 255) {
            m25364(18, iM16112, interfaceC7299);
        } else {
            m25365(19, iM16112, (InterfaceC15767) interfaceC7299);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25366(int i, int i2, AbstractC16579 abstractC16579) {
        m25346(197);
        if (this.f34275) {
            m25350(i2);
            m25342(i);
            this.f34303.m22423(i);
            this.f34303.m22424(abstractC16579);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m25386(int i, AbstractC16579 abstractC16579) {
        m25346(188);
        if (this.f34275) {
            m25342(i);
            this.f34303.m22423(1);
            this.f34303.m22424(abstractC16579);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25367(int i, AbstractC16579 abstractC16579) {
        m25346(189);
        if (this.f34275) {
            m25350(i);
            this.f34303.m22423(1);
            this.f34303.m22424(abstractC16579);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:34:0x0100  */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m25378(int i) {
        m25346(i);
        if (this.f34275) {
            if (i != 167) {
                C3836 c3836 = this.f34290;
                if (i == 190) {
                    this.f34303.m22423(1);
                    this.f34303.m22424(c3836.f14232);
                } else {
                    if (i != 191) {
                        switch (i) {
                            case 0:
                                break;
                            case 1:
                                this.f34303.m22424(c3836.f14228);
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                this.f34303.m22424(c3836.f14232);
                                break;
                            case 9:
                            case 10:
                                this.f34303.m22424(c3836.f14264);
                                break;
                            case 11:
                            case 12:
                            case 13:
                                this.f34303.m22424(c3836.f14256);
                                break;
                            case 14:
                            case 15:
                                this.f34303.m22424(c3836.f14291);
                                break;
                            default:
                                switch (i) {
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                        this.f34303.m22424(c3836.f14232);
                                        break;
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                        this.f34303.m22424(c3836.f14264);
                                        break;
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                        this.f34303.m22424(c3836.f14256);
                                        break;
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                        this.f34303.m22424(c3836.f14291);
                                        break;
                                    case 42:
                                        this.f34303.m22424(this.f34281[0].f48887.f77449);
                                        break;
                                    case 43:
                                        this.f34303.m22424(this.f34281[1].f48887.f77449);
                                        break;
                                    case 44:
                                        this.f34303.m22424(this.f34281[2].f48887.f77449);
                                        break;
                                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                        this.f34303.m22424(this.f34281[3].f48887.f77449);
                                        break;
                                    case 46:
                                    case 51:
                                    case 52:
                                    case 53:
                                        this.f34303.m22423(2);
                                        this.f34303.m22424(c3836.f14232);
                                        break;
                                    case 47:
                                        this.f34303.m22423(2);
                                        this.f34303.m22424(c3836.f14264);
                                        break;
                                    case 48:
                                        this.f34303.m22423(2);
                                        this.f34303.m22424(c3836.f14256);
                                        break;
                                    case 49:
                                        this.f34303.m22423(2);
                                        this.f34303.m22424(c3836.f14291);
                                        break;
                                    case 50:
                                        this.f34303.m22423(1);
                                        C8628 c8628 = this.f34303;
                                        AbstractC16579 abstractC16579 = c8628.f29778[c8628.f29776 - 1];
                                        C6171.m17176(!abstractC16579.m39001(EnumC6617.BOT));
                                        this.f34303.m22423(1);
                                        C8628 c8629 = this.f34303;
                                        C23800 c23800 = this.f34271;
                                        c8629.m22424(c23800.m52402(c23800.m52416(abstractC16579)));
                                        break;
                                    default:
                                        switch (i) {
                                            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                            case 60:
                                            case 61:
                                            case 62:
                                            case 67:
                                            case 68:
                                            case 69:
                                            case 70:
                                            case 75:
                                            case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                            case 77:
                                            case 78:
                                            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                            case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                            case 123:
                                            case q.h /* 125 */:
                                                this.f34303.m22423(1);
                                                break;
                                            case 63:
                                            case 64:
                                            case 65:
                                            case 66:
                                            case 71:
                                            case 72:
                                            case 73:
                                            case 74:
                                            case 88:
                                                this.f34303.m22423(2);
                                                break;
                                            case 79:
                                            case 81:
                                            case 85:
                                            case HRSS1373Polynomial.K /* 86 */:
                                                this.f34303.m22423(3);
                                                break;
                                            case 80:
                                            case 82:
                                                this.f34303.m22423(4);
                                                break;
                                            case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                                this.f34303.m22423(3);
                                                break;
                                            case 84:
                                                this.f34303.m22423(3);
                                                break;
                                            case 89:
                                                C8628 c86210 = this.f34303;
                                                c86210.m22424(c86210.f29778[c86210.f29776 - 1]);
                                                break;
                                            case 90:
                                                AbstractC16579 abstractC16579M22422 = this.f34303.m22422();
                                                AbstractC16579 abstractC16579M22423 = this.f34303.m22422();
                                                this.f34303.m22424(abstractC16579M22422);
                                                this.f34303.m22424(abstractC16579M22423);
                                                this.f34303.m22424(abstractC16579M22422);
                                                break;
                                            case 91:
                                                AbstractC16579 abstractC16579M22424 = this.f34303.m22422();
                                                C8628 c86211 = this.f34303;
                                                if (c86211.f29778[c86211.f29776 - 1] != null) {
                                                    AbstractC16579 abstractC16579M22425 = c86211.m22422();
                                                    AbstractC16579 abstractC16579M22426 = this.f34303.m22422();
                                                    this.f34303.m22424(abstractC16579M22424);
                                                    this.f34303.m22424(abstractC16579M22426);
                                                    this.f34303.m22424(abstractC16579M22425);
                                                    this.f34303.m22424(abstractC16579M22424);
                                                } else {
                                                    AbstractC16579 abstractC16579M22418 = c86211.m22418();
                                                    this.f34303.m22424(abstractC16579M22424);
                                                    this.f34303.m22424(abstractC16579M22418);
                                                    this.f34303.m22424(abstractC16579M22424);
                                                }
                                                break;
                                            case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                                C8628 c86212 = this.f34303;
                                                if (c86212.f29778[c86212.f29776 - 1] != null) {
                                                    AbstractC16579 abstractC16579M22427 = c86212.m22422();
                                                    AbstractC16579 abstractC16579M22428 = this.f34303.m22422();
                                                    this.f34303.m22424(abstractC16579M22428);
                                                    this.f34303.m22424(abstractC16579M22427);
                                                    this.f34303.m22424(abstractC16579M22428);
                                                    this.f34303.m22424(abstractC16579M22427);
                                                } else {
                                                    AbstractC16579 abstractC16579M22419 = c86212.m22418();
                                                    this.f34303.m22424(abstractC16579M22419);
                                                    this.f34303.m22424(abstractC16579M22419);
                                                }
                                                break;
                                            case 93:
                                                C8628 c86213 = this.f34303;
                                                if (c86213.f29778[c86213.f29776 - 1] != null) {
                                                    AbstractC16579 abstractC16579M22429 = c86213.m22422();
                                                    AbstractC16579 abstractC16579M224210 = this.f34303.m22422();
                                                    AbstractC16579 abstractC16579M224211 = this.f34303.m22422();
                                                    this.f34303.m22424(abstractC16579M224210);
                                                    this.f34303.m22424(abstractC16579M22429);
                                                    this.f34303.m22424(abstractC16579M224211);
                                                    this.f34303.m22424(abstractC16579M224210);
                                                    this.f34303.m22424(abstractC16579M22429);
                                                } else {
                                                    AbstractC16579 abstractC16579M224110 = c86213.m22418();
                                                    AbstractC16579 abstractC16579M224212 = this.f34303.m22422();
                                                    this.f34303.m22424(abstractC16579M224110);
                                                    this.f34303.m22424(abstractC16579M224212);
                                                    this.f34303.m22424(abstractC16579M224110);
                                                }
                                                break;
                                            case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                                C8628 c86214 = this.f34303;
                                                if (c86214.f29778[c86214.f29776 - 1] != null) {
                                                    AbstractC16579 abstractC16579M224213 = c86214.m22422();
                                                    AbstractC16579 abstractC16579M224214 = this.f34303.m22422();
                                                    C8628 c86215 = this.f34303;
                                                    if (c86215.f29778[c86215.f29776 - 1] != null) {
                                                        AbstractC16579 abstractC16579M224215 = c86215.m22422();
                                                        AbstractC16579 abstractC16579M224216 = this.f34303.m22422();
                                                        this.f34303.m22424(abstractC16579M224214);
                                                        this.f34303.m22424(abstractC16579M224213);
                                                        this.f34303.m22424(abstractC16579M224216);
                                                        this.f34303.m22424(abstractC16579M224215);
                                                        this.f34303.m22424(abstractC16579M224214);
                                                        this.f34303.m22424(abstractC16579M224213);
                                                    } else {
                                                        AbstractC16579 abstractC16579M224111 = c86215.m22418();
                                                        this.f34303.m22424(abstractC16579M224214);
                                                        this.f34303.m22424(abstractC16579M224213);
                                                        this.f34303.m22424(abstractC16579M224111);
                                                        this.f34303.m22424(abstractC16579M224214);
                                                        this.f34303.m22424(abstractC16579M224213);
                                                    }
                                                } else {
                                                    AbstractC16579 abstractC16579M224112 = c86214.m22418();
                                                    C8628 c86216 = this.f34303;
                                                    if (c86216.f29778[c86216.f29776 - 1] != null) {
                                                        AbstractC16579 abstractC16579M224217 = c86216.m22422();
                                                        AbstractC16579 abstractC16579M224218 = this.f34303.m22422();
                                                        this.f34303.m22424(abstractC16579M224112);
                                                        this.f34303.m22424(abstractC16579M224218);
                                                        this.f34303.m22424(abstractC16579M224217);
                                                        this.f34303.m22424(abstractC16579M224112);
                                                    } else {
                                                        AbstractC16579 abstractC16579M224113 = c86216.m22418();
                                                        this.f34303.m22424(abstractC16579M224112);
                                                        this.f34303.m22424(abstractC16579M224113);
                                                        this.f34303.m22424(abstractC16579M224112);
                                                    }
                                                }
                                                break;
                                            case 95:
                                                AbstractC16579 abstractC16579M224219 = this.f34303.m22422();
                                                AbstractC16579 abstractC16579M224220 = this.f34303.m22422();
                                                this.f34303.m22424(abstractC16579M224219);
                                                this.f34303.m22424(abstractC16579M224220);
                                                break;
                                            case 96:
                                            case 100:
                                            case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                            case 108:
                                            case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                                            case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                            case 122:
                                            case 124:
                                            case 126:
                                            case 128:
                                            case 130:
                                                this.f34303.m22423(1);
                                                break;
                                            case 97:
                                            case 101:
                                            case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                            case 109:
                                            case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                            case 127:
                                            case 129:
                                            case 131:
                                                this.f34303.m22423(2);
                                                break;
                                            case 98:
                                            case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                            case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                            case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                            case 114:
                                                this.f34303.m22423(1);
                                                break;
                                            case q.f /* 99 */:
                                            case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                            case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                                            case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                            case 115:
                                                this.f34303.m22423(2);
                                                break;
                                            case 116:
                                            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                            case 118:
                                            case 119:
                                                break;
                                            default:
                                                switch (i) {
                                                    case 133:
                                                        this.f34303.m22423(1);
                                                        this.f34303.m22424(c3836.f14264);
                                                        break;
                                                    case 134:
                                                        this.f34303.m22423(1);
                                                        this.f34303.m22424(c3836.f14256);
                                                        break;
                                                    case 135:
                                                        this.f34303.m22423(1);
                                                        this.f34303.m22424(c3836.f14291);
                                                        break;
                                                    case 136:
                                                        this.f34303.m22423(2);
                                                        this.f34303.m22424(c3836.f14232);
                                                        break;
                                                    case 137:
                                                        this.f34303.m22423(2);
                                                        this.f34303.m22424(c3836.f14256);
                                                        break;
                                                    case 138:
                                                        this.f34303.m22423(2);
                                                        this.f34303.m22424(c3836.f14291);
                                                        break;
                                                    case 139:
                                                        this.f34303.m22423(1);
                                                        this.f34303.m22424(c3836.f14232);
                                                        break;
                                                    case 140:
                                                        this.f34303.m22423(1);
                                                        this.f34303.m22424(c3836.f14264);
                                                        break;
                                                    case 141:
                                                        this.f34303.m22423(1);
                                                        this.f34303.m22424(c3836.f14291);
                                                        break;
                                                    case 142:
                                                        this.f34303.m22423(2);
                                                        this.f34303.m22424(c3836.f14232);
                                                        break;
                                                    case 143:
                                                        this.f34303.m22423(2);
                                                        this.f34303.m22424(c3836.f14264);
                                                        break;
                                                    case 144:
                                                        this.f34303.m22423(2);
                                                        this.f34303.m22424(c3836.f14256);
                                                        break;
                                                    case 145:
                                                    case 146:
                                                    case 147:
                                                        break;
                                                    case 148:
                                                        this.f34303.m22423(4);
                                                        this.f34303.m22424(c3836.f14232);
                                                        break;
                                                    case 149:
                                                    case 150:
                                                        this.f34303.m22423(2);
                                                        this.f34303.m22424(c3836.f14232);
                                                        break;
                                                    case 151:
                                                    case 152:
                                                        this.f34303.m22423(4);
                                                        this.f34303.m22424(c3836.f14232);
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 169:
                                                                break;
                                                            case 170:
                                                            case 171:
                                                                this.f34303.m22423(1);
                                                                break;
                                                            case 172:
                                                            case 174:
                                                            case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                                                                C6171.m17176(this.f34303.f29775 == 0);
                                                                this.f34303.m22423(1);
                                                                break;
                                                            case 173:
                                                            case HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS /* 175 */:
                                                                C6171.m17176(this.f34303.f29775 == 0);
                                                                this.f34303.m22423(2);
                                                                break;
                                                            case 177:
                                                                C6171.m17176(this.f34303.f29775 == 0);
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case 194:
                                                                    case 195:
                                                                        this.f34303.m22423(1);
                                                                        break;
                                                                    case 196:
                                                                        return;
                                                                    default:
                                                                        throw new AssertionError(C21327.f69414[i]);
                                                                }
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
                    } else {
                        this.f34303.m22423(1);
                    }
                    this.f34275 = false;
                }
            } else {
                this.f34275 = false;
            }
            m25382();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25364(int i, int i2, InterfaceC7299 interfaceC7299) {
        m25346(i);
        if (this.f34275) {
            m25342(i2);
            if (i == 16) {
                this.f34303.m22424(this.f34290.f14232);
            } else if (i == 18) {
                this.f34303.m22424(this.f34271.m52368(interfaceC7299));
            } else {
                throw new AssertionError(C21327.f69414[i]);
            }
            m25382();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25363(int i, int i2) {
        if (i2 > 255) {
            m25346(196);
            m25346(i);
            m25350(i2);
        } else {
            m25346(i);
            m25342(i2);
        }
        if (this.f34275) {
            if (i != 169) {
                C3836 c3836 = this.f34290;
                switch (i) {
                    case 21:
                        this.f34303.m22424(c3836.f14232);
                        break;
                    case 22:
                        this.f34303.m22424(c3836.f14264);
                        break;
                    case 23:
                        this.f34303.m22424(c3836.f14256);
                        break;
                    case 24:
                        this.f34303.m22424(c3836.f14291);
                        break;
                    case 25:
                        this.f34303.m22424(this.f34281[i2].f48887.f77449);
                        break;
                    default:
                        switch (i) {
                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                            case 56:
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                this.f34303.m22423(1);
                                break;
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                            case 57:
                                this.f34303.m22423(2);
                                break;
                            default:
                                throw new AssertionError(C21327.f69414[i]);
                        }
                        break;
                }
            } else {
                this.f34275 = false;
            }
            m25382();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m25385(int i, int i2) {
        if (i > 255 || i2 < -128 || i2 > 127) {
            m25346(196);
            m25346(132);
            m25350(i);
            m25350(i2);
            return;
        }
        m25346(132);
        m25342(i);
        m25342(i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25365(int i, int i2, InterfaceC15767 interfaceC15767) {
        m25346(i);
        if (this.f34275) {
            m25350(i2);
            C3836 c3836 = this.f34290;
            if (i == 17) {
                this.f34303.m22424(c3836.f14232);
                return;
            }
            C23800 c23800 = this.f34271;
            if (i == 187) {
                this.f34303.m22424(C12011.m29906(this.f34272 - 3, ((AbstractC16579) interfaceC15767).f53222.mo50006(c23800)));
                return;
            }
            if (i == 19) {
                this.f34303.m22424(c23800.m52368((InterfaceC7299) interfaceC15767));
                return;
            }
            if (i == 20) {
                this.f34303.m22424(c23800.m52368((InterfaceC7299) interfaceC15767));
                return;
            }
            if (i == 192) {
                this.f34303.m22423(1);
                this.f34303.m22424(c23800.m52402((AbstractC16579) interfaceC15767));
                return;
            }
            if (i != 193) {
                if (i != 198 && i != 199) {
                    switch (i) {
                        case 153:
                        case EnumC2300.f8185 /* 154 */:
                        case 155:
                        case 156:
                        case 157:
                        case 158:
                            break;
                        case 159:
                        case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                        case 161:
                        case 162:
                        case 163:
                        case 164:
                        case 165:
                        case 166:
                            this.f34303.m22423(2);
                            return;
                        case 167:
                            this.f34275 = false;
                            return;
                        case 168:
                            return;
                        default:
                            switch (i) {
                                case 178:
                                    this.f34303.m22424(((AbstractC23903) interfaceC15767).mo50006(c23800));
                                    return;
                                case 179:
                                    C8628 c8628 = this.f34303;
                                    AbstractC16579 abstractC16579Mo50006 = ((AbstractC23903) interfaceC15767).mo50006(c23800);
                                    c8628.getClass();
                                    c8628.m22423(m25344(abstractC16579Mo50006));
                                    return;
                                case 180:
                                    this.f34303.m22423(1);
                                    this.f34303.m22424(((AbstractC23903) interfaceC15767).mo50006(c23800));
                                    return;
                                case 181:
                                    C8628 c8629 = this.f34303;
                                    AbstractC16579 abstractC16579Mo50007 = ((AbstractC23903) interfaceC15767).mo50006(c23800);
                                    c8629.getClass();
                                    c8629.m22423(m25344(abstractC16579Mo50007));
                                    this.f34303.m22423(1);
                                    return;
                                default:
                                    throw new AssertionError(C21327.f69414[i]);
                            }
                    }
                }
                this.f34303.m22423(1);
                return;
            }
            this.f34303.m22423(1);
            this.f34303.m22424(c3836.f14232);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m25353(int i) {
        m25346(i);
        if (this.f34275) {
            m25384(0);
            if (i == 200) {
                this.f34275 = false;
            } else if (i != 201) {
                throw new AssertionError(C21327.f69414[i]);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25362() {
        if (this.f34275) {
            while (this.f34272 % 4 != 0) {
                m25378(0);
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m25335(int i, int i2) {
        this.f34286[i] = (byte) i2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m25379(int i, int i2) {
        m25335(i, i2 >> 24);
        m25335(i + 1, i2 >> 16);
        m25335(i + 2, i2 >> 8);
        m25335(i + 3, i2);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private int m25349(int i) {
        return this.f34286[i] & 255;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m25388(int i) {
        return m25349(i + 3) | (m25349(i) << 24) | (m25349(i + 1) << 16) | (m25349(i + 2) << 8);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m25355() {
        return this.f34275 || this.f34292 != null;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m25389() {
        this.f34275 = false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m25377() {
        int iM25383 = m25383();
        this.f34275 = true;
        this.f34298 = this.f34280;
        return iM25383;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25359(C8628 c8628) {
        int iM25383 = m25383();
        this.f34275 = true;
        C8628 c8628M22419 = c8628.m22419();
        m25372(c8628M22419.f29777);
        this.f34303 = c8628M22419;
        C6171.m17176(c8628.f29776 <= this.f34282);
        if (this.f34301) {
            System.err.println("entry point " + c8628);
        }
        this.f34298 = this.f34280;
        return iM25383;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25360(C8628 c8628, AbstractC16579 abstractC16579) {
        int iM25383 = m25383();
        this.f34275 = true;
        C8628 c8628M22419 = c8628.m22419();
        m25372(c8628M22419.f29777);
        this.f34303 = c8628M22419;
        C6171.m17176(c8628.f29776 <= this.f34282);
        this.f34303.m22424(abstractC16579);
        if (this.f34301) {
            System.err.println("entry point " + c8628);
        }
        this.f34298 = this.f34280;
        return iM25383;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m25381(int i) {
        int i2 = this.f34291;
        this.f34291 = i;
        return i2;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m25376() {
        return !this.f34275 || this.f34303.f29776 == this.f34291;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private int m25341() {
        C14978 c14978;
        int i = this.f34297;
        while (true) {
            i--;
            if (i < 0) {
                return 0;
            }
            if (this.f34303.f29777.m19735(i) && (c14978 = this.f34281[i]) != null) {
                return m25344(c14978.f48887.mo50006(this.f34271)) + i;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6510 m25361(int i) {
        C6510 c6510;
        int i2;
        if (i == 167) {
            c6510 = this.f34292;
            this.f34292 = null;
        } else {
            c6510 = null;
        }
        if (i == 168 || !m25355()) {
            return c6510;
        }
        if (!this.f34270) {
            m25365(i, 0, (InterfaceC15767) null);
            i2 = this.f34272 - 3;
        } else {
            if (i != 167 && i != 168) {
                m25365(m25347(i), 8, (InterfaceC15767) null);
                m25353(200);
                this.f34275 = true;
                this.f34298 = this.f34280;
            } else {
                m25353(i + 33);
            }
            i2 = this.f34272 - 5;
        }
        C6510 c6511 = new C6510(i2, c6510, this.f34303.m22419());
        this.f34288 = this.f34270;
        if (i == 167) {
            this.f34275 = false;
        }
        return c6511;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25369(C6510 c6510, int i) {
        int i2;
        char c;
        C8628 c8628 = this.f34303;
        boolean z = false;
        while (c6510 != null) {
            C6510 c6511 = c6510.f21933;
            int i3 = c6510.f21935;
            C8628 c8629 = c6510.f21934;
            C6171.m17176(this.f34303 != c8629 && (i > i3 || m25376()));
            int i4 = this.f34272;
            if (i >= i4) {
                i = i4;
            } else if (m25349(i) == 167) {
                i += this.f34270 ? m25388(i + 1) : (m25349(i + 1) << 8) | m25349(i + 2);
            }
            if (m25349(i3) == 167 && i3 + 3 == i && i == (i2 = this.f34272) && !this.f34288) {
                if (this.f34276) {
                    for (C14978 c14978 : this.f34281) {
                        if (c14978 != null) {
                            for (C22739 c22739 : c14978.f48886) {
                                char c2 = c22739.f74074;
                                if (c2 != 65535 && (c = c22739.f74073) != 65535 && c2 + c >= i2) {
                                    c22739.f74073 = (char) (c - 3);
                                }
                            }
                        }
                    }
                }
                this.f34272 -= 3;
                i -= 3;
                if (c6511 == null) {
                    this.f34275 = true;
                    break;
                }
            } else {
                if (this.f34270) {
                    m25379(i3 + 1, i - i3);
                } else {
                    int i5 = i - i3;
                    if (i5 >= -32768 && i5 <= 32767) {
                        m25335(i3 + 1, i5 >> 8);
                        m25335(i3 + 2, i5);
                    } else {
                        this.f34270 = true;
                    }
                }
                C6171.m17176(!this.f34275 || (c8629.f29776 == c8628.f29776 && c8629.f29775 == c8628.f29775));
            }
            this.f34288 = true;
            if (this.f34272 == i) {
                if (this.f34301) {
                    System.err.println("resolving chain state=" + c8629);
                }
                if (!this.f34275) {
                    this.f34275 = true;
                } else {
                    C23800 c23800 = c8629.f29779.f34271;
                    c8629.f29777.m19739(c8628.f29777);
                    C6171.m17176(c8629.f29776 == c8628.f29776 && c8629.f29775 == c8628.f29775);
                    int i6 = 0;
                    while (i6 < c8629.f29776) {
                        AbstractC16579 abstractC16579 = c8629.f29778[i6];
                        AbstractC16579 abstractC165710 = c8628.f29778[i6];
                        if (abstractC16579 != abstractC165710) {
                            if (c23800.m52413(abstractC16579, abstractC165710, true)) {
                                abstractC16579 = abstractC165710;
                            } else if (!c23800.m52413(abstractC165710, abstractC16579, true)) {
                                throw new AssertionError("inconsistent stack types at join point");
                            }
                        }
                        int iM25344 = m25344(abstractC16579);
                        AbstractC16579[] abstractC16579Arr = c8629.f29778;
                        abstractC16579Arr[i6] = abstractC16579;
                        if (iM25344 == 2) {
                            C6171.m17178(abstractC16579Arr[i6 + 1]);
                        }
                        i6 += iM25344;
                    }
                }
                c8628 = c8629;
                z = true;
            }
            c6510 = c6511;
        }
        C6171.m17176((z && this.f34303 == c8628) ? false : true);
        if (this.f34303 != c8628) {
            m25372(c8628.f29777);
            this.f34303 = c8628;
            this.f34298 = this.f34280;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m25354(AbstractC23903 abstractC23903, C13757 c13757) {
        int iM25337 = m25337(c13757.f45367);
        m25346(182);
        if (this.f34275) {
            m25350(C17177.m40100(this.f34293.f20079, abstractC23903));
            this.f34303.m22423(iM25337 + 1);
            this.f34303.m22424(c13757.mo16235());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25370(C6969 c6969, C13757 c13757) {
        int iM25337 = m25337(c13757.f45367);
        m25346(186);
        if (this.f34275) {
            m25350(C17177.m40100(this.f34293.f20079, c6969));
            m25350(0);
            this.f34303.m22423(iM25337);
            this.f34303.m22424(c13757.mo16235());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25374(AbstractC23903 abstractC23903, C13757 c13757) {
        int iM25337 = m25337(c13757.f45367);
        m25346(185);
        if (this.f34275) {
            m25350(C17177.m40100(this.f34293.f20079, abstractC23903));
            int i = iM25337 + 1;
            m25342(i);
            m25342(0);
            this.f34303.m22423(i);
            this.f34303.m22424(c13757.mo16235());
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m25380(AbstractC23903 abstractC23903, C13757 c13757) {
        int iM25337 = m25337(c13757.f45367);
        m25346(184);
        if (this.f34275) {
            m25350(C17177.m40100(this.f34293.f20079, abstractC23903));
            this.f34303.m22423(iM25337);
            this.f34303.m22424(c13757.mo16235());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m25387(AbstractC23903 abstractC23903, C13757 c13757) {
        int iM25337 = m25337(c13757.f45367);
        m25346(183);
        if (this.f34275) {
            m25350(C17177.m40100(this.f34293.f20079, abstractC23903));
            this.f34303.m22423(iM25337);
            if (abstractC23903.m52713()) {
                C8628 c8628 = this.f34303;
                C12011 c12011 = (C12011) c8628.f29778[c8628.f29776 - 1];
                C10039 c10039 = c8628.f29779;
                AbstractC16579 abstractC16579 = c12011.f53121;
                int i = 0;
                for (int i2 = 0; i2 < c8628.f29776; i2++) {
                    AbstractC16579[] abstractC16579Arr = c8628.f29778;
                    if (abstractC16579Arr[i2] == c12011) {
                        abstractC16579Arr[i2] = abstractC16579;
                    }
                }
                while (true) {
                    C14978[] c14978Arr = c10039.f34281;
                    if (i >= c14978Arr.length) {
                        break;
                    }
                    C14978 c14978 = c14978Arr[i];
                    if (c14978 != null) {
                        C6263 c6263 = c14978.f48887;
                        if (c6263.f77449 == c12011) {
                            C6263 c6263Mo17330 = c6263.mo17330(c6263.f77448);
                            c6263Mo17330.f77449 = abstractC16579;
                            C14978[] c14978Arr2 = c10039.f34281;
                            C14978 c14979 = new C14978(c6263Mo17330);
                            c14978Arr2[i] = c14979;
                            c14979.f48886 = c14978.f48886;
                        }
                    }
                    i++;
                }
            }
            this.f34303.m22423(1);
            this.f34303.m22424(c13757.mo16235());
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25368(C6510 c6510) {
        boolean z;
        if (!this.f34275 || c6510 == null) {
            z = true;
        } else {
            C8628 c8628 = this.f34303;
            int i = c8628.f29776;
            C8628 c8629 = c6510.f21934;
            if (i == c8629.f29776 && c8628.f29775 == c8629.f29775) {
                z = true;
            } else {
                z = false;
            }
        }
        C6171.m17176(z);
        this.f34292 = m25338(c6510, this.f34292);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m25356() {
        C6510 c6510 = this.f34292;
        this.f34292 = null;
        m25369(c6510, this.f34272);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6510 m25338(C6510 c6510, C6510 c6511) {
        if (c6511 == null) {
            return c6510;
        }
        C8628 c8628 = c6511.f21934;
        if (c6510 == null) {
            return c6511;
        }
        C8628 c8629 = c6510.f21934;
        C6171.m17176(c8629.f29776 == c8628.f29776 && c8629.f29775 == c8628.f29775);
        int i = c6510.f21935;
        int i2 = c6511.f21935;
        if (i < i2) {
            return new C6510(i2, m25338(c6510, c6511.f21933), c8628);
        }
        return new C6510(i, m25338(c6510.f21933, c6511), c8629);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m25357(int i) {
        if (i != -1) {
            this.f34269 = i;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m25351() {
        boolean z;
        if (this.f34275 && (z = this.f34300)) {
            int iMo10209 = this.f34296.mo10209(this.f34269);
            int i = this.f34272;
            char c = (char) i;
            char c2 = (char) iMo10209;
            if (c == i && c2 == iMo10209 && z) {
                if (this.f34295.m48595()) {
                    C21825 c21825 = this.f34295;
                    if (((char[]) c21825.f70876)[0] == c) {
                        this.f34295 = c21825.f70877;
                    }
                }
                if (this.f34295.isEmpty() || ((char[]) this.f34295.f70876)[1] != c2) {
                    this.f34295 = this.f34295.m48597(new char[]{c, c2});
                }
            }
        }
        this.f34269 = -1;
    }

    static {
        new C3131(EnumC6617.INT);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25372(C7403 c7403) {
        C7403 c7404;
        C14978 c14978;
        if (!this.f34275 || c7403 == (c7404 = this.f34303.f29777)) {
            return;
        }
        C7403 c7405 = new C7403(c7404);
        c7405.m19749(c7403);
        for (int iM19740 = c7405.m19740(0); iM19740 >= 0; iM19740 = c7405.m19740(iM19740 + 1)) {
            if (iM19740 >= this.f34299) {
                this.f34303.f29777.m19737(iM19740);
            } else if (!this.f34303.f29777.m19735(iM19740)) {
                m25352(iM19740);
            } else {
                this.f34303.f29777.m19737(iM19740);
                C14978[] c14978Arr = this.f34281;
                if (iM19740 < c14978Arr.length && (c14978 = c14978Arr[iM19740]) != null && c14978.m35954()) {
                    C14978 c14979 = this.f34281[iM19740];
                    char cM25383 = (char) (m25383() - c14979.m35955().f74074);
                    if (cM25383 >= 65535) {
                        C22739 c22739M35955 = c14979.m35955();
                        if (c22739M35955 != null) {
                            c14979.f48886.remove(c22739M35955);
                        }
                    } else {
                        this.f34281[iM19740] = new C14978(c14979.f48887);
                        if (!c14979.m35954() || cM25383 <= 0) {
                            C22739 c22739M35956 = c14979.m35955();
                            if (c22739M35956 != null) {
                                c14979.f48886.remove(c22739M35956);
                            }
                        } else {
                            C22739 c22739M35957 = c14979.m35955();
                            if (c22739M35957 != null && c22739M35957.f74073 == 65535) {
                                c22739M35957.f74073 = cM25383;
                            }
                        }
                        m25373(c14979);
                        m25345(c14979);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m25352(int i) {
        C14978 c14978 = this.f34281[i];
        if (c14978 == null) {
            this.f34303.f29777.m19737(i);
            return;
        }
        this.f34303.f29777.m19743(i);
        int i2 = this.f34272;
        if (i2 < 65535) {
            char c = (char) i2;
            if (!c14978.f48886.isEmpty() && c14978.m35955().f74073 == 65535) {
                return;
            }
            List list = c14978.f48886;
            C22739 c22739 = new C22739();
            c22739.f74073 = (char) 65535;
            c22739.f74074 = c;
            list.add(c22739);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m25345(final C14978 c14978) {
        C6263 c6263 = c14978.f48887;
        if (c6263 == null || c6263.m17331() || !c6263.m52696()) {
            return;
        }
        C22739[] c22739Arr = (C22739[]) C9030.stream(c14978.f48886).filter(new C2276()).toArray(new C5099());
        if (c22739Arr.length == 0) {
            return;
        }
        int[] array = C20318.stream(c22739Arr).mapToInt(new C22033()).toArray();
        int[] array2 = C20318.stream(c22739Arr).mapToInt(new C0865()).toArray();
        int[] array3 = C20318.stream(c22739Arr).mapToInt(new ToIntFunction() { // from class: l.۬ۘ۟
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return c14978.f48888;
            }
        }).toArray();
        Iterator it = c6263.mo50009().iterator();
        while (it.hasNext()) {
            C10935 c10935 = ((C13278) it.next()).f39811;
            c10935.f37187 = m25340(c10935.f37187, array);
            c10935.f37180 = m25340(c10935.f37180, array2);
            c10935.f37192 = m25340(c10935.f37192, array3);
            c10935.f37181 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m25340(int[] iArr, int[] iArr2) {
        if (iArr == null || iArr.length == 0) {
            return iArr2;
        }
        int[] iArr3 = new int[iArr.length + iArr2.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        return iArr3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25373(C14978 c14978) {
        C6263 c6263 = c14978.f48887;
        if (this.f34276 || (c6263.m17331() && c6263.m52696())) {
            if ((c6263.f77447 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0 || !((c6263.f77448.mo20276() & 562949953421312L) == 0 || (c6263.f77447 & 8589934592L) == 0)) {
                C14978[] c14978Arr = this.f34283;
                if (c14978Arr == null) {
                    this.f34283 = new C14978[20];
                } else {
                    this.f34283 = (C14978[]) C23805.m52456(this.f34273, c14978Arr);
                }
                C14978[] c14978Arr2 = this.f34283;
                int i = this.f34273;
                this.f34273 = i + 1;
                c14978Arr2[i] = c14978;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25358(C6263 c6263) {
        int iM25336 = m25336(c6263.mo50006(this.f34271));
        int i = this.f34299;
        int iM25343 = m25343(iM25336) + i;
        this.f34299 = iM25343;
        if (iM25343 > this.f34297) {
            this.f34297 = iM25343;
        }
        c6263.f21228 = i;
        C14978[] c14978Arr = (C14978[]) C23805.m52456(i + 1, this.f34281);
        this.f34281 = c14978Arr;
        C6171.m17178(c14978Arr[i]);
        if (this.f34292 != null) {
            m25356();
        }
        this.f34281[i] = new C14978(c6263);
        this.f34303.f29777.m19737(i);
        return i;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m25375(int i) {
        char cM25383;
        int i2 = this.f34299;
        this.f34299 = i;
        while (i < i2) {
            C14978 c14978 = this.f34281[i];
            if (c14978 != null) {
                if (c14978.m35954() && (cM25383 = (char) (m25383() - c14978.m35955().f74074)) < 65535) {
                    if (!c14978.m35954() || cM25383 <= 0) {
                        C22739 c22739M35955 = c14978.m35955();
                        if (c22739M35955 != null) {
                            c14978.f48886.remove(c22739M35955);
                        }
                    } else {
                        C22739 c22739M35956 = c14978.m35955();
                        if (c22739M35956 != null && c22739M35956.f74073 == 65535) {
                            c22739M35956.f74073 = cM25383;
                        }
                    }
                    m25373(c14978);
                    m25345(c14978);
                }
                this.f34281[i] = null;
            }
            this.f34303.f29777.m19737(i);
            i++;
        }
    }
}
