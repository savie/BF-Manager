package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۧۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1MC */
/* JADX INFO: loaded from: classes3.dex */
public final class C10712 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f36531;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22581 f36532;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13409 f36534;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f36537;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public CharSequence f36535 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f36533 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f36536 = 0;

    public C10712(InterfaceC13409 interfaceC13409, List list, List list2, C22581 c22581) {
        this.f36534 = interfaceC13409;
        this.f36537 = list;
        this.f36531 = list2;
        this.f36532 = c22581;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26945() {
        InterfaceC13409 interfaceC13409 = this.f36534;
        for (C20464 c20464 : interfaceC13409.mo11889()) {
            int i = c20464.f66400;
            int i2 = c20464.f66401;
            int i3 = i - i2;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i2 + i4;
                int i6 = c20464.f66399 + i4;
                C1538 c1538 = (C1538) this.f36537.get(i5);
                C1538 c1539 = (C1538) this.f36531.get(i6);
                if (!C13571.m33173(this.f36535, c1538.m5312())) {
                    if (c1538.equals(c1539)) {
                        m26944(i5, i6);
                        this.f36532.m15540(i5, i6, 1);
                    } else {
                        m26944(i5, i6);
                        this.f36535 = c1538.m5312();
                    }
                }
            }
        }
        m26944(interfaceC13409.mo11887(), interfaceC13409.mo11885());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26944(int i, int i2) {
        List list;
        List list2;
        if (this.f36535 == null) {
            return;
        }
        int i3 = this.f36533;
        C22581 c22581 = this.f36532;
        int iMax = Math.max(i3, c22581.m15543());
        int iMax2 = Math.max(this.f36536, c22581.m15542());
        C15070 c15070 = new C15070();
        C15070 c15071 = new C15070();
        while (true) {
            list = this.f36537;
            if (iMax >= i) {
                break;
            }
            if (C13571.m33173(this.f36535, ((C1538) list.get(iMax)).m5312())) {
                c15070.add(iMax);
                this.f36533 = iMax + 1;
            }
            iMax++;
        }
        while (true) {
            list2 = this.f36531;
            if (iMax2 >= i2) {
                break;
            }
            if (C13571.m33173(this.f36535, ((C1538) list2.get(iMax2)).m5312())) {
                c15071.add(iMax2);
                this.f36536 = iMax2 + 1;
            }
            iMax2++;
        }
        if (Math.max(c15070.size(), c15071.size()) > 10 || c15070.size() == c15071.size()) {
            int iMin = Math.min(c15070.size(), c15071.size());
            for (int i4 = 0; i4 < iMin; i4++) {
                int i5 = c15070.getInt(i4);
                int i6 = c15071.getInt(i4);
                if (((C1538) list.get(i5)).equals(list2.get(i6))) {
                    c22581.m15540(i5, i6, 1);
                }
            }
        } else if (c15070.size() < c15071.size()) {
            int size = c15070.size();
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            for (int i7 = 0; i7 < size; i7++) {
                iArr2[i7] = i7;
            }
            new C23412(c15071, size, iArr, c15070, list, list2, iArr2).m51547();
            for (int i8 = 0; i8 < c15070.size(); i8++) {
                int i9 = c15070.getInt(i8);
                int i10 = c15071.getInt(iArr2[i8]);
                if (((C1538) list.get(i9)).equals(list2.get(i10))) {
                    c22581.m15540(i9, i10, 1);
                }
            }
        } else {
            int size2 = c15071.size();
            int[] iArr3 = new int[size2];
            int[] iArr4 = new int[size2];
            for (int i11 = 0; i11 < size2; i11++) {
                iArr4[i11] = i11;
            }
            new C23412(c15070, size2, iArr3, c15071, list2, list, iArr4).m51547();
            for (int i12 = 0; i12 < c15071.size(); i12++) {
                int i13 = c15070.getInt(iArr4[i12]);
                int i14 = c15071.getInt(i12);
                if (((C1538) list.get(i13)).equals(list2.get(i14))) {
                    c22581.m15540(i13, i14, 1);
                }
            }
        }
        this.f36535 = null;
    }
}
