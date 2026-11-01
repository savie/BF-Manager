package l;

import com.google.android.material.slider.BaseSlider;
import java.util.ArrayList;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.᩸ۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BBR */
/* JADX INFO: loaded from: classes5.dex */
public final class C21562 implements InterfaceC0395 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int[] f70001;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C12391 f70002;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f70003;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f70004;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f70005;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7451[] f70006;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C4129[] f70007;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8863 m48281(C12391 c12391) {
        int[] iArr;
        C7451 c7451;
        C4129 c4129M11753;
        C21562 c21562 = new C21562(c12391);
        C16624 c16624M30822 = c12391.m30822();
        C7451 c7451M30819 = c12391.m30819();
        int size = c7451M30819.size();
        int[] iArr2 = c21562.f70001;
        C9754.m24734(0, iArr2);
        int[] iArr3 = c21562.f70003;
        C9754.m24734(0, iArr3);
        loop0: while (true) {
            int length = iArr2.length;
            int i = 0;
            while (true) {
                iArr = c21562.f70005;
                if (i >= length) {
                    break loop0;
                }
                if (iArr2[i] != 0) {
                    break;
                }
                i++;
            }
            try {
                c16624M30822.getClass();
                while (true) {
                    int iM24745 = C9754.m24745(0, iArr2);
                    if (iM24745 < 0) {
                        break;
                    }
                    C9754.m24740(iM24745, iArr2);
                    c16624M30822.m39089(iM24745, c21562);
                    c21562.f70004 = iM24745;
                }
                for (int i2 = 0; i2 < size; i2++) {
                    C10274 c10274M15269get = c7451M30819.m15269get(i2);
                    int iM26059 = c10274M15269get.m26059();
                    int iM26060 = c10274M15269get.m26060();
                    int iM24746 = C9754.m24745(iM26059, iArr);
                    if (iM24746 >= 0 && iM24746 < iM26060) {
                        C9754.m24734(iM26059, iArr3);
                        C9754.m24734(iM26060, iArr3);
                        c21562.m48283(c10274M15269get.m26062(), true);
                    }
                }
            } catch (IllegalArgumentException e) {
                throw new C21293("flow of control falls off end of method", e);
            }
        }
        C19446[] c19446Arr = new C19446[c21562.f70002.m30822().m39090()];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int iM24747 = C9754.m24745(i4 + 1, iArr3);
            if (iM24747 < 0) {
                break;
            }
            if (C9754.m24744(i4, iArr)) {
                int i5 = iM24747 - 1;
                C4129 c4129 = null;
                while (true) {
                    if (i5 < i4) {
                        i5 = -1;
                        break;
                    }
                    c4129 = c21562.f70007[i5];
                    if (c4129 != null) {
                        break;
                    }
                    i5--;
                }
                if (c4129 == null) {
                    c4129M11753 = C4129.m11753(iM24747);
                    c7451 = C7451.f24835;
                } else {
                    C7451 c7452 = c21562.f70006[i5];
                    if (c7452 == null) {
                        c7452 = C7451.f24835;
                    }
                    c7451 = c7452;
                    c4129M11753 = c4129;
                }
                c19446Arr[i3] = new C19446(i4, i4, iM24747, c4129M11753, c7451);
                i3++;
            }
            i4 = iM24747;
        }
        C8863 c8863 = new C8863(i3);
        for (int i6 = 0; i6 < i3; i6++) {
            c8863.m36888(i6, c19446Arr[i6]);
        }
        return c8863;
    }

    public C21562(C12391 c12391) {
        this.f70002 = c12391;
        int iM39090 = c12391.m30822().m39090() + 1;
        this.f70001 = C9754.m24742(iM39090);
        this.f70005 = C9754.m24742(iM39090);
        this.f70003 = C9754.m24742(iM39090);
        this.f70007 = new C4129[iM39090];
        this.f70006 = new C7451[iM39090];
        this.f70004 = -1;
    }

    @Override // l.InterfaceC0395
    /* JADX INFO: renamed from: ۙ */
    public final void mo2124(int i, int i2) {
        m48282(i2, 1, true);
    }

    @Override // l.InterfaceC0395
    /* JADX INFO: renamed from: ۙ */
    public final void mo2128(int i, int i2, C3320 c3320) {
        if (i == 108 || i == 112) {
            m48282(i2, 1, true);
            if (c3320 == C3320.f12281 || c3320 == C3320.f12268) {
                m48284(i2, 1, true);
                return;
            }
            return;
        }
        if (i == 172 || i == 177) {
            m48282(i2, 1, false);
            this.f70007[i2] = C4129.f15128;
            return;
        }
        if (i != 190) {
            if (i == 191) {
                m48282(i2, 1, false);
                m48284(i2, 1, false);
                return;
            } else if (i != 194 && i != 195) {
                switch (i) {
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                        break;
                    default:
                        switch (i) {
                            case 79:
                            case 80:
                            case 81:
                            case 82:
                            case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                            case 84:
                            case 85:
                            case HRSS1373Polynomial.K /* 86 */:
                                break;
                            default:
                                m48282(i2, 1, true);
                                break;
                        }
                        return;
                }
            }
        }
        m48282(i2, 1, true);
        m48284(i2, 1, true);
    }

    @Override // l.InterfaceC0395
    /* JADX INFO: renamed from: ۙ */
    public final void mo2126(int i, int i2, int i3, int i4, C3320 c3320, int i5) {
        if (i == 169) {
            m48282(i2, i3, false);
            this.f70007[i2] = C4129.f15128;
        } else {
            m48282(i2, i3, true);
        }
    }

    @Override // l.InterfaceC0395
    /* JADX INFO: renamed from: ۙ */
    public final void mo2127(int i, int i2, int i3, AbstractC9901 abstractC9901, int i4) {
        m48282(i2, i3, true);
        if ((abstractC9901 instanceof AbstractC20960) || (abstractC9901 instanceof C6143) || (abstractC9901 instanceof C17432) || (abstractC9901 instanceof C18843) || (abstractC9901 instanceof C16022) || (abstractC9901 instanceof C16727)) {
            m48284(i2, i3, true);
        }
    }

    @Override // l.InterfaceC0395
    /* JADX INFO: renamed from: ۙ */
    public final void mo2125(int i, int i2, int i3, int i4) {
        C4129[] c4129Arr = this.f70007;
        if (i == 167) {
            m48282(i2, i3, false);
            c4129Arr[i2] = C4129.m11753(i4);
        } else {
            if (i == 168) {
                m48283(i2, true);
            }
            int i5 = i2 + i3;
            m48282(i2, i3, true);
            m48283(i5, true);
            C4129 c4129 = new C4129(2);
            c4129.add(i5);
            c4129.add(i4);
            c4129.mo9637();
            c4129Arr[i2] = c4129;
        }
        m48283(i4, true);
    }

    @Override // l.InterfaceC0395
    /* JADX INFO: renamed from: ۙ */
    public final void mo2130(int i, int i2, C7888 c7888, int i3) {
        m48282(i, i2, false);
        m48283(c7888.m20812(), true);
        int size = c7888.size();
        for (int i4 = 0; i4 < size; i4++) {
            m48283(c7888.m20810(i4), true);
        }
        this.f70007[i] = c7888.m20813();
    }

    @Override // l.InterfaceC0395
    /* JADX INFO: renamed from: ۙ */
    public final void mo2129(int i, int i2, C6143 c6143, ArrayList arrayList) {
        m48282(i, i2, true);
        m48284(i, i2, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48283(int i, boolean z) {
        if (!C9754.m24744(i, this.f70005)) {
            C9754.m24734(i, this.f70001);
        }
        if (z) {
            C9754.m24734(i, this.f70003);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48282(int i, int i2, boolean z) {
        C9754.m24734(i, this.f70005);
        if (z) {
            m48283(i + i2, false);
        } else {
            C9754.m24734(i + i2, this.f70003);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m48284(int i, int i2, boolean z) {
        int i3 = i2 + i;
        if (z) {
            m48283(i3, true);
        }
        C7451 c7451M19930 = this.f70002.m30819().m19930(i);
        this.f70006[i] = c7451M19930;
        if (!z) {
            i3 = -1;
        }
        this.f70007[i] = c7451M19930.m19932(i3);
    }

    @Override // l.InterfaceC0395
    /* JADX INFO: renamed from: ۙ */
    public final int mo2123() {
        return this.f70004;
    }
}
