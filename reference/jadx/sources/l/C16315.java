package l;

import com.google.android.material.slider.BaseSlider;
import java.util.ArrayList;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.ܶ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BBR */
/* JADX INFO: loaded from: classes5.dex */
public final class C16315 implements InterfaceC0654 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f52963;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f52964;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int[] f52965;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C24698[] f52966;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f52967;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C4383[] f52968;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19299 f52969;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6621 m38704(C19299 c19299) {
        int[] iArr;
        C4383 c4383;
        C24698 c24698M55041;
        C16315 c16315 = new C16315(c19299);
        C8112 c8112M44667 = c19299.m44667();
        C4383 c4383M44668 = c19299.m44668();
        int size = c4383M44668.size();
        int[] iArr2 = c16315.f52965;
        C4560.m14326(0, iArr2);
        int[] iArr3 = c16315.f52963;
        C4560.m14326(0, iArr3);
        loop0: while (true) {
            int length = iArr2.length;
            int i = 0;
            while (true) {
                iArr = c16315.f52964;
                if (i >= length) {
                    break loop0;
                }
                if (iArr2[i] != 0) {
                    break;
                }
                i++;
            }
            try {
                c8112M44667.getClass();
                while (true) {
                    int iM14323 = C4560.m14323(0, iArr2);
                    if (iM14323 < 0) {
                        break;
                    }
                    C4560.m14320(iM14323, iArr2);
                    c8112M44667.m21998(iM14323, c16315);
                    c16315.f52967 = iM14323;
                }
                for (int i2 = 0; i2 < size; i2++) {
                    C24521 c24521M31621get = c4383M44668.m31621get(i2);
                    int iM54783 = c24521M31621get.m54783();
                    int iM54779 = c24521M31621get.m54779();
                    int iM14324 = C4560.m14323(iM54783, iArr);
                    if (iM14324 >= 0 && iM14324 < iM54779) {
                        C4560.m14326(iM54783, iArr3);
                        C4560.m14326(iM54779, iArr3);
                        c16315.m38706(c24521M31621get.m54781(), true);
                    }
                }
            } catch (IllegalArgumentException e) {
                throw new C16074("flow of control falls off end of method", e);
            }
        }
        C12586[] c12586Arr = new C12586[c16315.f52969.m44667().m21999()];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int iM14325 = C4560.m14323(i4 + 1, iArr3);
            if (iM14325 < 0) {
                break;
            }
            if (C4560.m14322(i4, iArr)) {
                int i5 = iM14325 - 1;
                C24698 c24698 = null;
                while (true) {
                    if (i5 < i4) {
                        i5 = -1;
                        break;
                    }
                    c24698 = c16315.f52966[i5];
                    if (c24698 != null) {
                        break;
                    }
                    i5--;
                }
                if (c24698 == null) {
                    c24698M55041 = C24698.m55041(iM14325);
                    c4383 = C4383.f15791;
                } else {
                    C4383 c4384 = c16315.f52968[i5];
                    if (c4384 == null) {
                        c4384 = C4383.f15791;
                    }
                    c4383 = c4384;
                    c24698M55041 = c24698;
                }
                c12586Arr[i3] = new C12586(i4, i4, iM14325, c24698M55041, c4383);
                i3++;
            }
            i4 = iM14325;
        }
        C6621 c6621 = new C6621(i3);
        for (int i6 = 0; i6 < i3; i6++) {
            c6621.m37666(i6, c12586Arr[i6]);
        }
        return c6621;
    }

    public C16315(C19299 c19299) {
        this.f52969 = c19299;
        int iM21999 = c19299.m44667().m21999() + 1;
        this.f52965 = C4560.m14321(iM21999);
        this.f52964 = C4560.m14321(iM21999);
        this.f52963 = C4560.m14321(iM21999);
        this.f52966 = new C24698[iM21999];
        this.f52968 = new C4383[iM21999];
        this.f52967 = -1;
    }

    @Override // l.InterfaceC0654
    /* JADX INFO: renamed from: ۙ */
    public final void mo2859(int i, int i2) {
        m38705(i2, 1, true);
    }

    @Override // l.InterfaceC0654
    /* JADX INFO: renamed from: ۙ */
    public final void mo2864(int i, int i2, C5085 c5085) {
        if (i == 108 || i == 112) {
            m38705(i2, 1, true);
            if (c5085 == C5085.f17753 || c5085 == C5085.f17732) {
                m38707(i2, 1, true);
                return;
            }
            return;
        }
        if (i == 172 || i == 177) {
            m38705(i2, 1, false);
            this.f52966[i2] = C24698.f79910;
            return;
        }
        if (i != 190) {
            if (i == 191) {
                m38705(i2, 1, false);
                m38707(i2, 1, false);
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
                                m38705(i2, 1, true);
                                break;
                        }
                        return;
                }
            }
        }
        m38705(i2, 1, true);
        m38707(i2, 1, true);
    }

    @Override // l.InterfaceC0654
    /* JADX INFO: renamed from: ۙ */
    public final void mo2861(int i, int i2, int i3, int i4, C5085 c5085, int i5) {
        if (i == 169) {
            m38705(i2, i3, false);
            this.f52966[i2] = C24698.f79910;
        } else {
            m38705(i2, i3, true);
        }
    }

    @Override // l.InterfaceC0654
    /* JADX INFO: renamed from: ۙ */
    public final void mo2862(int i, int i2, int i3, AbstractC13487 abstractC13487, int i4) {
        m38705(i2, i3, true);
        if ((abstractC13487 instanceof AbstractC14451) || (abstractC13487 instanceof C1028) || (abstractC13487 instanceof C9976) || (abstractC13487 instanceof C3265) || (abstractC13487 instanceof C21165) || (abstractC13487 instanceof C7740)) {
            m38707(i2, i3, true);
        }
    }

    @Override // l.InterfaceC0654
    /* JADX INFO: renamed from: ۙ */
    public final void mo2860(int i, int i2, int i3, int i4) {
        C24698[] c24698Arr = this.f52966;
        if (i == 167) {
            m38705(i2, i3, false);
            c24698Arr[i2] = C24698.m55041(i4);
        } else {
            if (i == 168) {
                m38706(i2, true);
            }
            int i5 = i2 + i3;
            m38705(i2, i3, true);
            m38706(i5, true);
            C24698 c24698 = new C24698(2);
            c24698.add(i5);
            c24698.add(i4);
            c24698.mo15005();
            c24698Arr[i2] = c24698;
        }
        m38706(i4, true);
    }

    @Override // l.InterfaceC0654
    /* JADX INFO: renamed from: ۙ */
    public final void mo2865(int i, int i2, C20550 c20550, int i3) {
        m38705(i, i2, false);
        m38706(c20550.m47113(), true);
        int size = c20550.size();
        for (int i4 = 0; i4 < size; i4++) {
            m38706(c20550.m47111(i4), true);
        }
        this.f52966[i] = c20550.m47112();
    }

    @Override // l.InterfaceC0654
    /* JADX INFO: renamed from: ۙ */
    public final void mo2863(int i, int i2, C1028 c1028, ArrayList arrayList) {
        m38705(i, i2, true);
        m38707(i, i2, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38706(int i, boolean z) {
        if (!C4560.m14322(i, this.f52964)) {
            C4560.m14326(i, this.f52965);
        }
        if (z) {
            C4560.m14326(i, this.f52963);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38705(int i, int i2, boolean z) {
        C4560.m14326(i, this.f52964);
        if (z) {
            m38706(i + i2, false);
        } else {
            C4560.m14326(i + i2, this.f52963);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m38707(int i, int i2, boolean z) {
        int i3 = i2 + i;
        if (z) {
            m38706(i3, true);
        }
        C4383 c4383M13995 = this.f52969.m44668().m13995(i);
        this.f52968[i] = c4383M13995;
        if (!z) {
            i3 = -1;
        }
        this.f52966[i] = c4383M13995.m13994(i3);
    }

    @Override // l.InterfaceC0654
    /* JADX INFO: renamed from: ۙ */
    public final int mo2858() {
        return this.f52967;
    }
}
