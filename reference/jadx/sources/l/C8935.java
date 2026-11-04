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

/* JADX INFO: renamed from: l.۠᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 24FJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8935 {

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f29131 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C15559 f29132;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C14764 f29135;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C0732[] f29136;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f29139;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C10377 f29141;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C0732[] f29142;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public EnumC1478 f29143;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C24705 f29144;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C2969 f29145;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f29150;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f29151;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f29153;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f29156;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C23677 f29159;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC1829 f29164;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean f29165;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f29149 = 0;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f29160 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte[] f29147 = new byte[64];

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f29163 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C18499 f29162 = new C18499();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C14769 f29154 = C14769.m35543();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f29138 = true;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f29140 = false;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f29137 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21615 f29152 = null;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f29157 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f29161 = false;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f29155 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C9680[] f29158 = null;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC16393[] f29133 = null;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f29146 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f29166 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C9680 f29148 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C9680 f29134 = null;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static int m23845(int i) {
        if (i == 1 || i == 3) {
            return 2;
        }
        return i != 8 ? 1 : 0;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static int m23853(int i) {
        if (i == 198) {
            return 199;
        }
        if (i == 199) {
            return 198;
        }
        return ((i + 1) ^ 1) - 1;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static int m23859(int i) {
        if (i == 5 || i == 6 || i == 7) {
            return 0;
        }
        return i;
    }

    public C8935(C10377 c10377, boolean z, InterfaceC1829 interfaceC1829, boolean z2, EnumC1478 enumC1478, boolean z3, C23677 c23677, C14764 c14764, C24705 c24705, C15559 c15559) {
        this.f29141 = c10377;
        this.f29150 = z;
        this.f29164 = interfaceC1829;
        this.f29156 = interfaceC1829 != null;
        this.f29139 = z2;
        this.f29159 = c23677;
        this.f29135 = c14764;
        this.f29144 = c24705;
        this.f29132 = c15559;
        this.f29153 = z3;
        this.f29143 = enumC1478;
        int iOrdinal = enumC1478.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            this.f29165 = true;
        } else {
            this.f29165 = false;
        }
        this.f29145 = new C2969(this);
        this.f29136 = new C0732[20];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m23847(AbstractC22664 abstractC22664) {
        switch (C14901.f48679[abstractC22664.mo9097().ordinal()]) {
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
                throw new AssertionError("typecode " + abstractC22664.mo9097());
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m23856(AbstractC22664 abstractC22664) {
        if (abstractC22664 == null) {
            return 1;
        }
        return m23845(m23847(abstractC22664));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m23846(C14769 c14769) {
        int iM23856 = 0;
        while (c14769.m35550()) {
            iM23856 += m23856((AbstractC22664) c14769.f48335);
            c14769 = c14769.f48336;
        }
        return iM23856;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m23892() {
        if (this.f29152 != null) {
            m23861();
        }
        if (this.f29157 != -1) {
            m23886();
        }
        this.f29140 = true;
        return this.f29163;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m23852(int i) {
        if (this.f29138) {
            byte[] bArrM42988 = C18450.m42988(this.f29163, this.f29147);
            this.f29147 = bArrM42988;
            int i2 = this.f29163;
            this.f29163 = i2 + 1;
            bArrM42988[i2] = (byte) i;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m23860(int i) {
        if (this.f29138) {
            int i2 = this.f29163;
            int i3 = i2 + 2;
            byte[] bArr = this.f29147;
            if (i3 > bArr.length) {
                m23852(i >> 8);
                m23852(i);
                return;
            }
            int i4 = i2 + 1;
            this.f29163 = i4;
            bArr[i2] = (byte) (i >> 8);
            this.f29163 = i3;
            bArr[i4] = (byte) i;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m23893(int i) {
        if (this.f29138) {
            int i2 = this.f29163;
            int i3 = i2 + 4;
            byte[] bArr = this.f29147;
            if (i3 > bArr.length) {
                m23852(i >> 24);
                m23852(i >> 16);
                m23852(i >> 8);
                m23852(i);
                return;
            }
            int i4 = i2 + 1;
            this.f29163 = i4;
            bArr[i2] = (byte) (i >> 24);
            int i5 = i2 + 2;
            this.f29163 = i5;
            bArr[i4] = (byte) (i >> 16);
            int i6 = i2 + 3;
            this.f29163 = i6;
            bArr[i5] = (byte) (i >> 8);
            this.f29163 = i3;
            bArr[i6] = (byte) i;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01c2  */
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m23854(int i) {
        C0732 c0732;
        AbstractC16393 c11918;
        AbstractC16393 c17139;
        C0732 c0733;
        int i2;
        if (this.f29152 != null) {
            m23861();
        }
        if (this.f29138) {
            if (this.f29157 != -1) {
                m23886();
            }
            boolean z = this.f29161;
            boolean z2 = this.f29153;
            if (z) {
                int i3 = 0;
                this.f29161 = false;
                int iM23892 = m23892();
                if (this.f29165) {
                    int iOrdinal = this.f29143.ordinal();
                    C24705 c24705 = this.f29144;
                    if (iOrdinal == 1) {
                        int iM23851 = m23851();
                        if (this.f29166 == iM23892) {
                            C9680[] c9680Arr = this.f29158;
                            int i4 = this.f29146 - 1;
                            this.f29146 = i4;
                            c9680Arr[i4] = null;
                        }
                        this.f29166 = iM23892;
                        C9680[] c9680Arr2 = this.f29158;
                        if (c9680Arr2 == null) {
                            this.f29158 = new C9680[20];
                        } else {
                            this.f29158 = (C9680[]) C18450.m42989(this.f29146, c9680Arr2);
                        }
                        C9680[] c9680Arr3 = this.f29158;
                        int i5 = this.f29146;
                        this.f29146 = i5 + 1;
                        C9680 c9680 = new C9680();
                        c9680Arr3[i5] = c9680;
                        c9680.f31255 = iM23892;
                        c9680.f31253 = new AbstractC22664[iM23851];
                        for (int i6 = 0; i6 < iM23851; i6++) {
                            if (this.f29145.f9658.m3208(i6) && (c0732 = this.f29136[i6]) != null) {
                                AbstractC22664 abstractC22664M55132 = c0732.f2665.f38067;
                                if (!(abstractC22664M55132 instanceof C23765)) {
                                    abstractC22664M55132 = c24705.m55132(abstractC22664M55132);
                                }
                                c9680.f31253[i6] = abstractC22664M55132;
                            }
                        }
                        c9680.f31254 = new AbstractC22664[this.f29145.f9657];
                        while (true) {
                            C2969 c2969 = this.f29145;
                            if (i3 >= c2969.f9657) {
                                break;
                            }
                            c9680.f31254[i3] = c2969.f9656[i3];
                            i3++;
                        }
                    } else if (iOrdinal == 2) {
                        int iM23852 = m23851();
                        C9680 c9681 = this.f29148;
                        if (c9681 != null) {
                            if (c9681.f31255 == iM23892) {
                                AbstractC16393[] abstractC16393Arr = this.f29133;
                                int i7 = this.f29146 - 1;
                                this.f29146 = i7;
                                abstractC16393Arr[i7] = null;
                                this.f29148 = this.f29134;
                                this.f29134 = null;
                            }
                        } else {
                            C9680 c9682 = new C9680();
                            C10377 c10377 = this.f29141;
                            C14769 c14769 = ((C23191) c10377.m29598(c24705)).f75155;
                            int iM35551 = c14769.m35551();
                            if (!c10377.mo7874()) {
                                AbstractC22664 abstractC22664 = c10377.f38069.f38067;
                                c9682.f31253 = new AbstractC22664[iM35551 + 1];
                                if (c10377.m29570() && abstractC22664 != this.f29135.f48286) {
                                    c9682.f31253[0] = C23765.m53046(abstractC22664);
                                } else {
                                    c9682.f31253[0] = c24705.m55132(abstractC22664);
                                }
                                i2 = 1;
                            } else {
                                c9682.f31253 = new AbstractC22664[iM35551];
                                i2 = 0;
                            }
                            Iterator it = c14769.iterator();
                            while (it.hasNext()) {
                                c9682.f31253[i2] = c24705.m55132((AbstractC22664) it.next());
                                i2++;
                            }
                            c9682.f31255 = -1;
                            c9682.f31254 = null;
                            this.f29148 = c9682;
                        }
                        C9680 c9683 = new C9680();
                        c9683.f31255 = iM23892;
                        AbstractC22664[] abstractC22664Arr = new AbstractC22664[iM23852];
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < iM23852) {
                            if (this.f29145.f9658.m3208(i8) && (c0733 = this.f29136[i8]) != null) {
                                AbstractC22664 abstractC22664M55133 = c0733.f2665.f38067;
                                if (!(abstractC22664M55133 instanceof C23765)) {
                                    abstractC22664M55133 = c24705.m55132(abstractC22664M55133);
                                }
                                abstractC22664Arr[i8] = abstractC22664M55133;
                                if (m23856(abstractC22664M55133) > 1) {
                                    i8++;
                                }
                            }
                            i8++;
                            i9++;
                        }
                        c9683.f31253 = new AbstractC22664[i9];
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < iM23852) {
                            C11972.m30026(i11 < i9);
                            c9683.f31253[i11] = abstractC22664Arr[i10];
                            if (m23856(abstractC22664Arr[i10]) > 1) {
                                i10++;
                            }
                            i10++;
                            i11++;
                        }
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            C2969 c29610 = this.f29145;
                            if (i12 >= c29610.f9657) {
                                break;
                            }
                            if (c29610.f9656[i12] != null) {
                                i13++;
                            }
                            i12++;
                        }
                        c9683.f31254 = new AbstractC22664[i13];
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            C2969 c29611 = this.f29145;
                            if (i14 >= c29611.f9657) {
                                break;
                            }
                            AbstractC22664 abstractC22665 = c29611.f9656[i14];
                            if (abstractC22665 != null) {
                                c9683.f31254[i15] = c24705.m55132(abstractC22665);
                                i15++;
                            }
                            i14++;
                        }
                        AbstractC16393[] abstractC16393Arr2 = this.f29133;
                        if (abstractC16393Arr2 == null) {
                            this.f29133 = new AbstractC16393[20];
                        } else {
                            this.f29133 = (AbstractC16393[]) C18450.m42989(this.f29146, abstractC16393Arr2);
                        }
                        AbstractC16393[] abstractC16393Arr3 = this.f29133;
                        int i16 = this.f29146;
                        this.f29146 = i16 + 1;
                        C9680 c9684 = this.f29148;
                        int i17 = c9684.f31255;
                        AbstractC22664[] abstractC22664Arr2 = c9684.f31253;
                        AbstractC22664[] abstractC22664Arr3 = c9683.f31253;
                        AbstractC22664[] abstractC22664Arr4 = c9683.f31254;
                        int i18 = (c9683.f31255 - i17) - 1;
                        if (abstractC22664Arr4.length == 1) {
                            if (abstractC22664Arr3.length == abstractC22664Arr2.length && AbstractC16393.m38918(abstractC22664Arr2, abstractC22664Arr3, c24705) == 0) {
                                c17139 = new C17885(i18, abstractC22664Arr4[0]);
                            } else {
                                c17139 = new C25345(i18, abstractC22664Arr3, abstractC22664Arr4);
                            }
                        } else if (abstractC22664Arr4.length == 0) {
                            int iM38918 = AbstractC16393.m38918(abstractC22664Arr2, abstractC22664Arr3, c24705);
                            if (iM38918 == 0) {
                                c17139 = new C17139(i18);
                            } else {
                                if (-4 < iM38918 && iM38918 < 0) {
                                    AbstractC22664[] abstractC22664Arr5 = new AbstractC22664[-iM38918];
                                    int length = abstractC22664Arr2.length;
                                    while (length < abstractC22664Arr3.length) {
                                        abstractC22664Arr5[i3] = abstractC22664Arr3[length];
                                        length++;
                                        i3++;
                                    }
                                    c11918 = new C2224(251 - iM38918, i18, abstractC22664Arr5);
                                } else if (iM38918 > 0 && iM38918 < 4) {
                                    c11918 = new C11918(251 - iM38918, i18);
                                } else {
                                    c17139 = new C25345(i18, abstractC22664Arr3, abstractC22664Arr4);
                                }
                                c17139 = c11918;
                            }
                        } else {
                            c17139 = new C25345(i18, abstractC22664Arr3, abstractC22664Arr4);
                        }
                        abstractC16393Arr3[i16] = c17139;
                        this.f29134 = this.f29148;
                        this.f29148 = c9683;
                    } else {
                        throw new AssertionError("Should have chosen a stackmap format");
                    }
                    if (z2) {
                        this.f29145.m9680(iM23892);
                    }
                }
            }
            if (z2) {
                System.err.println("emit@" + this.f29163 + " stack=" + this.f29145.f9657 + ": " + C8190.f27010[i]);
            }
            m23852(i);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m23881() {
        C11972.m30026(this.f29138 || m23891());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23875(InterfaceC8344 interfaceC8344) {
        int iM37270 = this.f29132.m37270(interfaceC8344);
        if (iM37270 <= 255) {
            m23869(18, iM37270, interfaceC8344);
        } else {
            m23870(19, iM37270, (InterfaceC13564) interfaceC8344);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23871(int i, int i2, AbstractC22664 abstractC22664) {
        m23854(197);
        if (this.f29138) {
            m23860(i2);
            m23852(i);
            this.f29145.m9683(i);
            this.f29145.m9685(abstractC22664);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m23895(int i, AbstractC22664 abstractC22664) {
        m23854(188);
        if (this.f29138) {
            m23852(i);
            this.f29145.m9683(1);
            this.f29145.m9685(abstractC22664);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23872(int i, AbstractC22664 abstractC22664) {
        m23854(189);
        if (this.f29138) {
            m23860(i);
            this.f29145.m9683(1);
            this.f29145.m9685(abstractC22664);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:34:0x0100  */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m23883(int i) {
        m23854(i);
        if (this.f29138) {
            if (i != 167) {
                C14764 c14764 = this.f29135;
                if (i == 190) {
                    this.f29145.m9683(1);
                    this.f29145.m9685(c14764.f48253);
                } else {
                    if (i != 191) {
                        switch (i) {
                            case 0:
                                break;
                            case 1:
                                this.f29145.m9685(c14764.f48241);
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                this.f29145.m9685(c14764.f48253);
                                break;
                            case 9:
                            case 10:
                                this.f29145.m9685(c14764.f48256);
                                break;
                            case 11:
                            case 12:
                            case 13:
                                this.f29145.m9685(c14764.f48239);
                                break;
                            case 14:
                            case 15:
                                this.f29145.m9685(c14764.f48249);
                                break;
                            default:
                                switch (i) {
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                        this.f29145.m9685(c14764.f48253);
                                        break;
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                        this.f29145.m9685(c14764.f48256);
                                        break;
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                        this.f29145.m9685(c14764.f48239);
                                        break;
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                        this.f29145.m9685(c14764.f48249);
                                        break;
                                    case 42:
                                        this.f29145.m9685(this.f29136[0].f2665.f38067);
                                        break;
                                    case 43:
                                        this.f29145.m9685(this.f29136[1].f2665.f38067);
                                        break;
                                    case 44:
                                        this.f29145.m9685(this.f29136[2].f2665.f38067);
                                        break;
                                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                        this.f29145.m9685(this.f29136[3].f2665.f38067);
                                        break;
                                    case 46:
                                    case 51:
                                    case 52:
                                    case 53:
                                        this.f29145.m9683(2);
                                        this.f29145.m9685(c14764.f48253);
                                        break;
                                    case 47:
                                        this.f29145.m9683(2);
                                        this.f29145.m9685(c14764.f48256);
                                        break;
                                    case 48:
                                        this.f29145.m9683(2);
                                        this.f29145.m9685(c14764.f48239);
                                        break;
                                    case 49:
                                        this.f29145.m9683(2);
                                        this.f29145.m9685(c14764.f48249);
                                        break;
                                    case 50:
                                        this.f29145.m9683(1);
                                        C2969 c2969 = this.f29145;
                                        AbstractC22664 abstractC22664 = c2969.f9656[c2969.f9657 - 1];
                                        C11972.m30026(!abstractC22664.m51067(EnumC21172.BOT));
                                        this.f29145.m9683(1);
                                        C2969 c29610 = this.f29145;
                                        C24705 c24705 = this.f29144;
                                        c29610.m9685(c24705.m55132(c24705.m55120(abstractC22664)));
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
                                                this.f29145.m9683(1);
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
                                                this.f29145.m9683(2);
                                                break;
                                            case 79:
                                            case 81:
                                            case 85:
                                            case HRSS1373Polynomial.K /* 86 */:
                                                this.f29145.m9683(3);
                                                break;
                                            case 80:
                                            case 82:
                                                this.f29145.m9683(4);
                                                break;
                                            case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                                this.f29145.m9683(3);
                                                break;
                                            case 84:
                                                this.f29145.m9683(3);
                                                break;
                                            case 89:
                                                C2969 c29611 = this.f29145;
                                                c29611.m9685(c29611.f9656[c29611.f9657 - 1]);
                                                break;
                                            case 90:
                                                AbstractC22664 abstractC22664M9684 = this.f29145.m9684();
                                                AbstractC22664 abstractC22664M9685 = this.f29145.m9684();
                                                this.f29145.m9685(abstractC22664M9684);
                                                this.f29145.m9685(abstractC22664M9685);
                                                this.f29145.m9685(abstractC22664M9684);
                                                break;
                                            case 91:
                                                AbstractC22664 abstractC22664M9686 = this.f29145.m9684();
                                                C2969 c29612 = this.f29145;
                                                if (c29612.f9656[c29612.f9657 - 1] != null) {
                                                    AbstractC22664 abstractC22664M9687 = c29612.m9684();
                                                    AbstractC22664 abstractC22664M9688 = this.f29145.m9684();
                                                    this.f29145.m9685(abstractC22664M9686);
                                                    this.f29145.m9685(abstractC22664M9688);
                                                    this.f29145.m9685(abstractC22664M9687);
                                                    this.f29145.m9685(abstractC22664M9686);
                                                } else {
                                                    AbstractC22664 abstractC22664M9682 = c29612.m9682();
                                                    this.f29145.m9685(abstractC22664M9686);
                                                    this.f29145.m9685(abstractC22664M9682);
                                                    this.f29145.m9685(abstractC22664M9686);
                                                }
                                                break;
                                            case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                                C2969 c29613 = this.f29145;
                                                if (c29613.f9656[c29613.f9657 - 1] != null) {
                                                    AbstractC22664 abstractC22664M9689 = c29613.m9684();
                                                    AbstractC22664 abstractC22664M96810 = this.f29145.m9684();
                                                    this.f29145.m9685(abstractC22664M96810);
                                                    this.f29145.m9685(abstractC22664M9689);
                                                    this.f29145.m9685(abstractC22664M96810);
                                                    this.f29145.m9685(abstractC22664M9689);
                                                } else {
                                                    AbstractC22664 abstractC22664M9683 = c29613.m9682();
                                                    this.f29145.m9685(abstractC22664M9683);
                                                    this.f29145.m9685(abstractC22664M9683);
                                                }
                                                break;
                                            case 93:
                                                C2969 c29614 = this.f29145;
                                                if (c29614.f9656[c29614.f9657 - 1] != null) {
                                                    AbstractC22664 abstractC22664M96811 = c29614.m9684();
                                                    AbstractC22664 abstractC22664M96812 = this.f29145.m9684();
                                                    AbstractC22664 abstractC22664M96813 = this.f29145.m9684();
                                                    this.f29145.m9685(abstractC22664M96812);
                                                    this.f29145.m9685(abstractC22664M96811);
                                                    this.f29145.m9685(abstractC22664M96813);
                                                    this.f29145.m9685(abstractC22664M96812);
                                                    this.f29145.m9685(abstractC22664M96811);
                                                } else {
                                                    AbstractC22664 abstractC22664M96814 = c29614.m9682();
                                                    AbstractC22664 abstractC22664M96815 = this.f29145.m9684();
                                                    this.f29145.m9685(abstractC22664M96814);
                                                    this.f29145.m9685(abstractC22664M96815);
                                                    this.f29145.m9685(abstractC22664M96814);
                                                }
                                                break;
                                            case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                                C2969 c29615 = this.f29145;
                                                if (c29615.f9656[c29615.f9657 - 1] != null) {
                                                    AbstractC22664 abstractC22664M96816 = c29615.m9684();
                                                    AbstractC22664 abstractC22664M96817 = this.f29145.m9684();
                                                    C2969 c29616 = this.f29145;
                                                    if (c29616.f9656[c29616.f9657 - 1] != null) {
                                                        AbstractC22664 abstractC22664M96818 = c29616.m9684();
                                                        AbstractC22664 abstractC22664M96819 = this.f29145.m9684();
                                                        this.f29145.m9685(abstractC22664M96817);
                                                        this.f29145.m9685(abstractC22664M96816);
                                                        this.f29145.m9685(abstractC22664M96819);
                                                        this.f29145.m9685(abstractC22664M96818);
                                                        this.f29145.m9685(abstractC22664M96817);
                                                        this.f29145.m9685(abstractC22664M96816);
                                                    } else {
                                                        AbstractC22664 abstractC22664M96820 = c29616.m9682();
                                                        this.f29145.m9685(abstractC22664M96817);
                                                        this.f29145.m9685(abstractC22664M96816);
                                                        this.f29145.m9685(abstractC22664M96820);
                                                        this.f29145.m9685(abstractC22664M96817);
                                                        this.f29145.m9685(abstractC22664M96816);
                                                    }
                                                } else {
                                                    AbstractC22664 abstractC22664M96821 = c29615.m9682();
                                                    C2969 c29617 = this.f29145;
                                                    if (c29617.f9656[c29617.f9657 - 1] != null) {
                                                        AbstractC22664 abstractC22664M96822 = c29617.m9684();
                                                        AbstractC22664 abstractC22664M96823 = this.f29145.m9684();
                                                        this.f29145.m9685(abstractC22664M96821);
                                                        this.f29145.m9685(abstractC22664M96823);
                                                        this.f29145.m9685(abstractC22664M96822);
                                                        this.f29145.m9685(abstractC22664M96821);
                                                    } else {
                                                        AbstractC22664 abstractC22664M96824 = c29617.m9682();
                                                        this.f29145.m9685(abstractC22664M96821);
                                                        this.f29145.m9685(abstractC22664M96824);
                                                        this.f29145.m9685(abstractC22664M96821);
                                                    }
                                                }
                                                break;
                                            case 95:
                                                AbstractC22664 abstractC22664M96825 = this.f29145.m9684();
                                                AbstractC22664 abstractC22664M96826 = this.f29145.m9684();
                                                this.f29145.m9685(abstractC22664M96825);
                                                this.f29145.m9685(abstractC22664M96826);
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
                                                this.f29145.m9683(1);
                                                break;
                                            case 97:
                                            case 101:
                                            case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                            case 109:
                                            case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                            case 127:
                                            case 129:
                                            case 131:
                                                this.f29145.m9683(2);
                                                break;
                                            case 98:
                                            case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                            case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                            case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                            case 114:
                                                this.f29145.m9683(1);
                                                break;
                                            case q.f /* 99 */:
                                            case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                            case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                                            case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                            case 115:
                                                this.f29145.m9683(2);
                                                break;
                                            case 116:
                                            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                            case 118:
                                            case 119:
                                                break;
                                            default:
                                                switch (i) {
                                                    case 133:
                                                        this.f29145.m9683(1);
                                                        this.f29145.m9685(c14764.f48256);
                                                        break;
                                                    case 134:
                                                        this.f29145.m9683(1);
                                                        this.f29145.m9685(c14764.f48239);
                                                        break;
                                                    case 135:
                                                        this.f29145.m9683(1);
                                                        this.f29145.m9685(c14764.f48249);
                                                        break;
                                                    case 136:
                                                        this.f29145.m9683(2);
                                                        this.f29145.m9685(c14764.f48253);
                                                        break;
                                                    case 137:
                                                        this.f29145.m9683(2);
                                                        this.f29145.m9685(c14764.f48239);
                                                        break;
                                                    case 138:
                                                        this.f29145.m9683(2);
                                                        this.f29145.m9685(c14764.f48249);
                                                        break;
                                                    case 139:
                                                        this.f29145.m9683(1);
                                                        this.f29145.m9685(c14764.f48253);
                                                        break;
                                                    case 140:
                                                        this.f29145.m9683(1);
                                                        this.f29145.m9685(c14764.f48256);
                                                        break;
                                                    case 141:
                                                        this.f29145.m9683(1);
                                                        this.f29145.m9685(c14764.f48249);
                                                        break;
                                                    case 142:
                                                        this.f29145.m9683(2);
                                                        this.f29145.m9685(c14764.f48253);
                                                        break;
                                                    case 143:
                                                        this.f29145.m9683(2);
                                                        this.f29145.m9685(c14764.f48256);
                                                        break;
                                                    case 144:
                                                        this.f29145.m9683(2);
                                                        this.f29145.m9685(c14764.f48239);
                                                        break;
                                                    case 145:
                                                    case 146:
                                                    case 147:
                                                        break;
                                                    case 148:
                                                        this.f29145.m9683(4);
                                                        this.f29145.m9685(c14764.f48253);
                                                        break;
                                                    case 149:
                                                    case 150:
                                                        this.f29145.m9683(2);
                                                        this.f29145.m9685(c14764.f48253);
                                                        break;
                                                    case 151:
                                                    case 152:
                                                        this.f29145.m9683(4);
                                                        this.f29145.m9685(c14764.f48253);
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 169:
                                                                break;
                                                            case 170:
                                                            case 171:
                                                                this.f29145.m9683(1);
                                                                break;
                                                            case 172:
                                                            case 174:
                                                            case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                                                                C11972.m30026(this.f29145.f9659 == 0);
                                                                this.f29145.m9683(1);
                                                                break;
                                                            case 173:
                                                            case HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS /* 175 */:
                                                                C11972.m30026(this.f29145.f9659 == 0);
                                                                this.f29145.m9683(2);
                                                                break;
                                                            case 177:
                                                                C11972.m30026(this.f29145.f9659 == 0);
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case 194:
                                                                    case 195:
                                                                        this.f29145.m9683(1);
                                                                        break;
                                                                    case 196:
                                                                        return;
                                                                    default:
                                                                        throw new AssertionError(C8190.f27010[i]);
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
                        this.f29145.m9683(1);
                    }
                    this.f29138 = false;
                }
            } else {
                this.f29138 = false;
            }
            m23881();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23869(int i, int i2, InterfaceC8344 interfaceC8344) {
        m23854(i);
        if (this.f29138) {
            m23852(i2);
            if (i == 16) {
                this.f29145.m9685(this.f29135.f48253);
            } else if (i == 18) {
                this.f29145.m9685(this.f29144.m55100(interfaceC8344));
            } else {
                throw new AssertionError(C8190.f27010[i]);
            }
            m23881();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23868(int i, int i2) {
        if (i2 > 255) {
            m23854(196);
            m23854(i);
            m23860(i2);
        } else {
            m23854(i);
            m23852(i2);
        }
        if (this.f29138) {
            if (i != 169) {
                C14764 c14764 = this.f29135;
                switch (i) {
                    case 21:
                        this.f29145.m9685(c14764.f48253);
                        break;
                    case 22:
                        this.f29145.m9685(c14764.f48256);
                        break;
                    case 23:
                        this.f29145.m9685(c14764.f48239);
                        break;
                    case 24:
                        this.f29145.m9685(c14764.f48249);
                        break;
                    case 25:
                        this.f29145.m9685(this.f29136[i2].f2665.f38067);
                        break;
                    default:
                        switch (i) {
                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                            case 56:
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                this.f29145.m9683(1);
                                break;
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                            case 57:
                                this.f29145.m9683(2);
                                break;
                            default:
                                throw new AssertionError(C8190.f27010[i]);
                        }
                        break;
                }
            } else {
                this.f29138 = false;
            }
            m23881();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m23894(int i, int i2) {
        if (i > 255 || i2 < -128 || i2 > 127) {
            m23854(196);
            m23854(132);
            m23860(i);
            m23860(i2);
            return;
        }
        m23854(132);
        m23852(i);
        m23852(i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23870(int i, int i2, InterfaceC13564 interfaceC13564) {
        m23854(i);
        if (this.f29138) {
            m23860(i2);
            C14764 c14764 = this.f29135;
            if (i == 17) {
                this.f29145.m9685(c14764.f48253);
                return;
            }
            C24705 c24705 = this.f29144;
            if (i == 187) {
                this.f29145.m9685(C23765.m53045(this.f29163 - 3, ((AbstractC22664) interfaceC13564).f73596.mo29576(c24705)));
                return;
            }
            if (i == 19) {
                this.f29145.m9685(c24705.m55100((InterfaceC8344) interfaceC13564));
                return;
            }
            if (i == 20) {
                this.f29145.m9685(c24705.m55100((InterfaceC8344) interfaceC13564));
                return;
            }
            if (i == 192) {
                this.f29145.m9683(1);
                this.f29145.m9685(c24705.m55132((AbstractC22664) interfaceC13564));
                return;
            }
            if (i != 193) {
                if (i != 198 && i != 199) {
                    switch (i) {
                        case 153:
                        case EnumC24309.f78687 /* 154 */:
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
                            this.f29145.m9683(2);
                            return;
                        case 167:
                            this.f29138 = false;
                            return;
                        case 168:
                            return;
                        default:
                            switch (i) {
                                case 178:
                                    this.f29145.m9685(((AbstractC11781) interfaceC13564).mo29576(c24705));
                                    return;
                                case 179:
                                    C2969 c2969 = this.f29145;
                                    AbstractC22664 abstractC22664Mo29576 = ((AbstractC11781) interfaceC13564).mo29576(c24705);
                                    c2969.getClass();
                                    c2969.m9683(m23856(abstractC22664Mo29576));
                                    return;
                                case 180:
                                    this.f29145.m9683(1);
                                    this.f29145.m9685(((AbstractC11781) interfaceC13564).mo29576(c24705));
                                    return;
                                case 181:
                                    C2969 c29610 = this.f29145;
                                    AbstractC22664 abstractC22664Mo29577 = ((AbstractC11781) interfaceC13564).mo29576(c24705);
                                    c29610.getClass();
                                    c29610.m9683(m23856(abstractC22664Mo29577));
                                    this.f29145.m9683(1);
                                    return;
                                default:
                                    throw new AssertionError(C8190.f27010[i]);
                            }
                    }
                }
                this.f29145.m9683(1);
                return;
            }
            this.f29145.m9683(1);
            this.f29145.m9685(c14764.f48253);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m23897(int i) {
        m23854(i);
        if (this.f29138) {
            m23893(0);
            if (i == 200) {
                this.f29138 = false;
            } else if (i != 201) {
                throw new AssertionError(C8190.f27010[i]);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23867() {
        if (this.f29138) {
            while (this.f29163 % 4 != 0) {
                m23883(0);
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m23858(int i, int i2) {
        this.f29147[i] = (byte) i2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m23884(int i, int i2) {
        m23858(i, i2 >> 24);
        m23858(i + 1, i2 >> 16);
        m23858(i + 2, i2 >> 8);
        m23858(i + 3, i2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m23855(int i) {
        return this.f29147[i] & 255;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m23888(int i) {
        return m23855(i + 3) | (m23855(i) << 24) | (m23855(i + 1) << 16) | (m23855(i + 2) << 8);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m23899() {
        return this.f29138 || this.f29152 != null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m23889() {
        this.f29138 = false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m23882() {
        int iM23892 = m23892();
        this.f29138 = true;
        this.f29161 = this.f29165;
        return iM23892;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23863(C2969 c2969) {
        int iM23892 = m23892();
        this.f29138 = true;
        C2969 c2969M9679 = c2969.m9679();
        m23874(c2969M9679.f9658);
        this.f29145 = c2969M9679;
        C11972.m30026(c2969.f9657 <= this.f29149);
        if (this.f29153) {
            System.err.println("entry point " + c2969);
        }
        this.f29161 = this.f29165;
        return iM23892;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23864(C2969 c2969, AbstractC22664 abstractC22664) {
        int iM23892 = m23892();
        this.f29138 = true;
        C2969 c2969M9679 = c2969.m9679();
        m23874(c2969M9679.f9658);
        this.f29145 = c2969M9679;
        C11972.m30026(c2969.f9657 <= this.f29149);
        this.f29145.m9685(abstractC22664);
        if (this.f29153) {
            System.err.println("entry point " + c2969);
        }
        this.f29161 = this.f29165;
        return iM23892;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m23880(int i) {
        int i2 = this.f29155;
        this.f29155 = i;
        return i2;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m23891() {
        return !this.f29138 || this.f29145.f9657 == this.f29155;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m23851() {
        C0732 c0732;
        int i = this.f29160;
        while (true) {
            i--;
            if (i < 0) {
                return 0;
            }
            if (this.f29145.f9658.m3208(i) && (c0732 = this.f29136[i]) != null) {
                return m23856(c0732.f2665.mo29576(this.f29144)) + i;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21615 m23866(int i) {
        C21615 c21615;
        int i2;
        if (i == 167) {
            c21615 = this.f29152;
            this.f29152 = null;
        } else {
            c21615 = null;
        }
        if (i == 168 || !m23899()) {
            return c21615;
        }
        if (!this.f29150) {
            m23870(i, 0, (InterfaceC13564) null);
            i2 = this.f29163 - 3;
        } else {
            if (i != 167 && i != 168) {
                m23870(m23853(i), 8, (InterfaceC13564) null);
                m23897(200);
                this.f29138 = true;
                this.f29161 = this.f29165;
            } else {
                m23897(i + 33);
            }
            i2 = this.f29163 - 5;
        }
        C21615 c21616 = new C21615(i2, c21615, this.f29145.m9679());
        this.f29140 = this.f29150;
        if (i == 167) {
            this.f29138 = false;
        }
        return c21616;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23879(C21615 c21615, int i) {
        int i2;
        char c;
        C2969 c2969 = this.f29145;
        boolean z = false;
        while (c21615 != null) {
            C21615 c21616 = c21615.f69038;
            int i3 = c21615.f69040;
            C2969 c29610 = c21615.f69039;
            C11972.m30026(this.f29145 != c29610 && (i > i3 || m23891()));
            int i4 = this.f29163;
            if (i >= i4) {
                i = i4;
            } else if (m23855(i) == 167) {
                i += this.f29150 ? m23888(i + 1) : (m23855(i + 1) << 8) | m23855(i + 2);
            }
            if (m23855(i3) == 167 && i3 + 3 == i && i == (i2 = this.f29163) && !this.f29140) {
                if (this.f29139) {
                    for (C0732 c0732 : this.f29136) {
                        if (c0732 != null) {
                            for (C18631 c18631 : c0732.f2664) {
                                char c2 = c18631.f60555;
                                if (c2 != 65535 && (c = c18631.f60554) != 65535 && c2 + c >= i2) {
                                    c18631.f60554 = (char) (c - 3);
                                }
                            }
                        }
                    }
                }
                this.f29163 -= 3;
                i -= 3;
                if (c21616 == null) {
                    this.f29138 = true;
                    break;
                }
            } else {
                if (this.f29150) {
                    m23884(i3 + 1, i - i3);
                } else {
                    int i5 = i - i3;
                    if (i5 >= -32768 && i5 <= 32767) {
                        m23858(i3 + 1, i5 >> 8);
                        m23858(i3 + 2, i5);
                    } else {
                        this.f29150 = true;
                    }
                }
                C11972.m30026(!this.f29138 || (c29610.f9657 == c2969.f9657 && c29610.f9659 == c2969.f9659));
            }
            this.f29140 = true;
            if (this.f29163 == i) {
                if (this.f29153) {
                    System.err.println("resolving chain state=" + c29610);
                }
                if (!this.f29138) {
                    this.f29138 = true;
                } else {
                    C24705 c24705 = c29610.f9660.f29144;
                    c29610.f9658.m3196(c2969.f9658);
                    C11972.m30026(c29610.f9657 == c2969.f9657 && c29610.f9659 == c2969.f9659);
                    int i6 = 0;
                    while (i6 < c29610.f9657) {
                        AbstractC22664 abstractC22664 = c29610.f9656[i6];
                        AbstractC22664 abstractC22665 = c2969.f9656[i6];
                        if (abstractC22664 != abstractC22665) {
                            if (c24705.m55131(abstractC22664, abstractC22665, true)) {
                                abstractC22664 = abstractC22665;
                            } else if (!c24705.m55131(abstractC22665, abstractC22664, true)) {
                                throw new AssertionError("inconsistent stack types at join point");
                            }
                        }
                        int iM23856 = m23856(abstractC22664);
                        AbstractC22664[] abstractC22664Arr = c29610.f9656;
                        abstractC22664Arr[i6] = abstractC22664;
                        if (iM23856 == 2) {
                            C11972.m30030(abstractC22664Arr[i6 + 1]);
                        }
                        i6 += iM23856;
                    }
                }
                c2969 = c29610;
                z = true;
            }
            c21615 = c21616;
        }
        C11972.m30026((z && this.f29145 == c2969) ? false : true);
        if (this.f29145 != c2969) {
            m23874(c2969.f9658);
            this.f29145 = c2969;
            this.f29161 = this.f29165;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23876(AbstractC11781 abstractC11781, C23191 c23191) {
        int iM23846 = m23846(c23191.f75155);
        m23854(185);
        if (this.f29138) {
            m23860(C20035.m46076(this.f29132.f50605, abstractC11781));
            int i = iM23846 + 1;
            m23852(i);
            m23852(0);
            this.f29145.m9683(i);
            this.f29145.m9685(c23191.mo31585());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23877(C18582 c18582, C23191 c23191) {
        int iM23846 = m23846(c23191.f75155);
        m23854(186);
        if (this.f29138) {
            m23860(C20035.m46076(this.f29132.f50605, c18582));
            m23860(0);
            this.f29145.m9683(iM23846);
            this.f29145.m9685(c23191.mo31585());
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m23885(AbstractC11781 abstractC11781, C23191 c23191) {
        int iM23846 = m23846(c23191.f75155);
        m23854(184);
        if (this.f29138) {
            m23860(C20035.m46076(this.f29132.f50605, abstractC11781));
            this.f29145.m9683(iM23846);
            this.f29145.m9685(c23191.mo31585());
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m23896(AbstractC11781 abstractC11781, C23191 c23191) {
        int iM23846 = m23846(c23191.f75155);
        m23854(183);
        if (this.f29138) {
            m23860(C20035.m46076(this.f29132.f50605, abstractC11781));
            this.f29145.m9683(iM23846);
            if (abstractC11781.m29570()) {
                C2969 c2969 = this.f29145;
                C23765 c23765 = (C23765) c2969.f9656[c2969.f9657 - 1];
                C8935 c8935 = c2969.f9660;
                AbstractC22664 abstractC22664 = c23765.f72657;
                int i = 0;
                for (int i2 = 0; i2 < c2969.f9657; i2++) {
                    AbstractC22664[] abstractC22664Arr = c2969.f9656;
                    if (abstractC22664Arr[i2] == c23765) {
                        abstractC22664Arr[i2] = abstractC22664;
                    }
                }
                while (true) {
                    C0732[] c0732Arr = c8935.f29136;
                    if (i >= c0732Arr.length) {
                        break;
                    }
                    C0732 c0732 = c0732Arr[i];
                    if (c0732 != null) {
                        C5816 c5816 = c0732.f2665;
                        if (c5816.f38067 == c23765) {
                            C5816 c5816Mo16960 = c5816.mo16960(c5816.f38069);
                            c5816Mo16960.f38067 = abstractC22664;
                            C0732[] c0732Arr2 = c8935.f29136;
                            C0732 c0733 = new C0732(c5816Mo16960);
                            c0732Arr2[i] = c0733;
                            c0733.f2664 = c0732.f2664;
                        }
                    }
                    i++;
                }
            }
            this.f29145.m9683(1);
            this.f29145.m9685(c23191.mo31585());
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m23898(AbstractC11781 abstractC11781, C23191 c23191) {
        int iM23846 = m23846(c23191.f75155);
        m23854(182);
        if (this.f29138) {
            m23860(C20035.m46076(this.f29132.f50605, abstractC11781));
            this.f29145.m9683(iM23846 + 1);
            this.f29145.m9685(c23191.mo31585());
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23878(C21615 c21615) {
        boolean z;
        if (!this.f29138 || c21615 == null) {
            z = true;
        } else {
            C2969 c2969 = this.f29145;
            int i = c2969.f9657;
            C2969 c29610 = c21615.f69039;
            if (i == c29610.f9657 && c2969.f9659 == c29610.f9659) {
                z = true;
            } else {
                z = false;
            }
        }
        C11972.m30026(z);
        this.f29152 = m23848(c21615, this.f29152);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23861() {
        C21615 c21615 = this.f29152;
        this.f29152 = null;
        m23879(c21615, this.f29163);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21615 m23848(C21615 c21615, C21615 c21616) {
        if (c21616 == null) {
            return c21615;
        }
        C2969 c2969 = c21616.f69039;
        if (c21615 == null) {
            return c21616;
        }
        C2969 c29610 = c21615.f69039;
        C11972.m30026(c29610.f9657 == c2969.f9657 && c29610.f9659 == c2969.f9659);
        int i = c21615.f69040;
        int i2 = c21616.f69040;
        if (i < i2) {
            return new C21615(i2, m23848(c21615, c21616.f69038), c2969);
        }
        return new C21615(i, m23848(c21615.f69038, c21616), c29610);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23862(int i) {
        if (i != -1) {
            this.f29157 = i;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m23886() {
        boolean z;
        if (this.f29138 && (z = this.f29156)) {
            int iMo6321 = this.f29164.mo6321(this.f29157);
            int i = this.f29163;
            char c = (char) i;
            char c2 = (char) iMo6321;
            if (c == i && c2 == iMo6321 && z) {
                if (this.f29154.m35550()) {
                    C14769 c14769 = this.f29154;
                    if (((char[]) c14769.f48335)[0] == c) {
                        this.f29154 = c14769.f48336;
                    }
                }
                if (this.f29154.isEmpty() || ((char[]) this.f29154.f48335)[1] != c2) {
                    this.f29154 = this.f29154.m35552(new char[]{c, c2});
                }
            }
        }
        this.f29157 = -1;
    }

    static {
        new C17223(EnumC21172.INT);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23874(C0799 c0799) {
        C0799 c07910;
        C0732 c0732;
        if (!this.f29138 || c0799 == (c07910 = this.f29145.f9658)) {
            return;
        }
        C0799 c07911 = new C0799(c07910);
        c07911.m3201(c0799);
        for (int iM3202 = c07911.m3202(0); iM3202 >= 0; iM3202 = c07911.m3202(iM3202 + 1)) {
            if (iM3202 >= this.f29137) {
                this.f29145.f9658.m3194(iM3202);
            } else if (!this.f29145.f9658.m3208(iM3202)) {
                m23887(iM3202);
            } else {
                this.f29145.f9658.m3194(iM3202);
                C0732[] c0732Arr = this.f29136;
                if (iM3202 < c0732Arr.length && (c0732 = c0732Arr[iM3202]) != null && c0732.m3055()) {
                    C0732 c0733 = this.f29136[iM3202];
                    char cM23892 = (char) (m23892() - c0733.m3056().f60555);
                    if (cM23892 >= 65535) {
                        C18631 c18631M3056 = c0733.m3056();
                        if (c18631M3056 != null) {
                            c0733.f2664.remove(c18631M3056);
                        }
                    } else {
                        this.f29136[iM3202] = new C0732(c0733.f2665);
                        if (!c0733.m3055() || cM23892 <= 0) {
                            C18631 c18631M3057 = c0733.m3056();
                            if (c18631M3057 != null) {
                                c0733.f2664.remove(c18631M3057);
                            }
                        } else {
                            C18631 c18631M3058 = c0733.m3056();
                            if (c18631M3058 != null && c18631M3058.f60554 == 65535) {
                                c18631M3058.f60554 = cM23892;
                            }
                        }
                        m23873(c0733);
                        m23857(c0733);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m23887(int i) {
        C0732 c0732 = this.f29136[i];
        if (c0732 == null) {
            this.f29145.f9658.m3194(i);
            return;
        }
        this.f29145.f9658.m3198(i);
        int i2 = this.f29163;
        if (i2 < 65535) {
            char c = (char) i2;
            if (!c0732.f2664.isEmpty() && c0732.m3056().f60554 == 65535) {
                return;
            }
            List list = c0732.f2664;
            C18631 c18631 = new C18631();
            c18631.f60554 = (char) 65535;
            c18631.f60555 = c;
            list.add(c18631);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m23857(final C0732 c0732) {
        C5816 c5816 = c0732.f2665;
        if (c5816 == null || c5816.m16950() || !c5816.m29581()) {
            return;
        }
        C18631[] c18631Arr = (C18631[]) C1170.stream(c0732.f2664).filter(new C20869()).toArray(new C12664());
        if (c18631Arr.length == 0) {
            return;
        }
        int[] array = C13847.stream(c18631Arr).mapToInt(new C6699()).toArray();
        int[] array2 = C13847.stream(c18631Arr).mapToInt(new C24599()).toArray();
        int[] array3 = C13847.stream(c18631Arr).mapToInt(new ToIntFunction() { // from class: l.ۘ᩹ۘ
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return c0732.f2666;
            }
        }).toArray();
        Iterator it = c5816.mo29597().iterator();
        while (it.hasNext()) {
            C5510 c5510 = ((C24638) it.next()).f77371;
            c5510.f19176 = m23850(c5510.f19176, array);
            c5510.f19179 = m23850(c5510.f19179, array2);
            c5510.f19180 = m23850(c5510.f19180, array3);
            c5510.f19186 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m23850(int[] iArr, int[] iArr2) {
        if (iArr == null || iArr.length == 0) {
            return iArr2;
        }
        int[] iArr3 = new int[iArr.length + iArr2.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        return iArr3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23873(C0732 c0732) {
        C5816 c5816 = c0732.f2665;
        if (this.f29139 || (c5816.m16950() && c5816.m29581())) {
            if ((c5816.f38071 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0 || !((c5816.f38069.mo29591() & 562949953421312L) == 0 || (c5816.f38071 & 8589934592L) == 0)) {
                C0732[] c0732Arr = this.f29142;
                if (c0732Arr == null) {
                    this.f29142 = new C0732[20];
                } else {
                    this.f29142 = (C0732[]) C18450.m42989(this.f29151, c0732Arr);
                }
                C0732[] c0732Arr2 = this.f29142;
                int i = this.f29151;
                this.f29151 = i + 1;
                c0732Arr2[i] = c0732;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23865(C5816 c5816) {
        int iM23847 = m23847(c5816.mo29576(this.f29144));
        int i = this.f29137;
        int iM23845 = m23845(iM23847) + i;
        this.f29137 = iM23845;
        if (iM23845 > this.f29160) {
            this.f29160 = iM23845;
        }
        c5816.f19998 = i;
        C0732[] c0732Arr = (C0732[]) C18450.m42989(i + 1, this.f29136);
        this.f29136 = c0732Arr;
        C11972.m30030(c0732Arr[i]);
        if (this.f29152 != null) {
            m23861();
        }
        this.f29136[i] = new C0732(c5816);
        this.f29145.f9658.m3194(i);
        return i;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m23890(int i) {
        char cM23892;
        int i2 = this.f29137;
        this.f29137 = i;
        while (i < i2) {
            C0732 c0732 = this.f29136[i];
            if (c0732 != null) {
                if (c0732.m3055() && (cM23892 = (char) (m23892() - c0732.m3056().f60555)) < 65535) {
                    if (!c0732.m3055() || cM23892 <= 0) {
                        C18631 c18631M3056 = c0732.m3056();
                        if (c18631M3056 != null) {
                            c0732.f2664.remove(c18631M3056);
                        }
                    } else {
                        C18631 c18631M3057 = c0732.m3056();
                        if (c18631M3057 != null && c18631M3057.f60554 == 65535) {
                            c18631M3057.f60554 = cM23892;
                        }
                    }
                    m23873(c0732);
                    m23857(c0732);
                }
                this.f29136[i] = null;
            }
            this.f29145.f9658.m3194(i);
            i++;
        }
    }
}
