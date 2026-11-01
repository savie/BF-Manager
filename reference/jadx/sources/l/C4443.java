package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۙۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ME */
/* JADX INFO: loaded from: classes2.dex */
public final class C4443 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C16936 f15818;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f15819;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f15820;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f15821;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C2824 f15822;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f15823;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f15824;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f15825;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f15826;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final CharSequence f15827;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f15828;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List f15829;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CharSequence f15830;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC13409 f15831;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f15832;

    public C4443(CharSequence charSequence, CharSequence charSequence2, List list, List list2, int i, int i2, InterfaceC13409 interfaceC13409, C16936 c16936) {
        this.f15827 = charSequence;
        this.f15830 = charSequence2;
        this.f15828 = list;
        this.f15829 = list2;
        this.f15823 = i;
        this.f15832 = i2;
        this.f15831 = interfaceC13409;
        this.f15818 = c16936;
        int length = charSequence.length();
        this.f15825 = length;
        int length2 = charSequence2.length();
        this.f15820 = length2;
        this.f15822 = new C2824(length, length2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13409 m12400() {
        this.f15824 = -1;
        this.f15819 = -1;
        this.f15821 = -1;
        this.f15826 = -1;
        m12399(-1, -1);
        Iterator it = this.f15831.mo11889().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            List list = this.f15829;
            List list2 = this.f15828;
            C2824 c2824 = this.f15822;
            if (zHasNext) {
                C20464 c20464 = (C20464) it.next();
                int i = c20464.f66400;
                int i2 = c20464.f66401;
                int i3 = i - i2;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = i2 + i4;
                    int i6 = c20464.f66399 + i4;
                    int iMo7062 = ((InterfaceC2326) list2.get(i5)).mo7062();
                    int i7 = this.f15823;
                    int iMo7063 = ((InterfaceC2326) list.get(i6)).mo7062();
                    int i8 = this.f15832;
                    int iMo7061 = ((InterfaceC2326) list2.get(i5)).mo7061() - i7;
                    int iMo7064 = ((InterfaceC2326) list.get(i6)).mo7061() - i8;
                    m12397(i5, i6);
                    c2824.m15544(iMo7062 - i7, iMo7063 - i8, iMo7061, iMo7064);
                    m12399(i5, i6);
                }
            } else {
                m12397(list2.size(), list.size());
                return C1413.m4944(c2824.m8577());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12397(int i, int i2) {
        int i3;
        int i4 = this.f15823;
        List list = this.f15828;
        int iMo7061 = i == 0 ? 0 : ((InterfaceC2326) list.get(i - 1)).mo7061() - i4;
        int i5 = this.f15832;
        List list2 = this.f15829;
        int iMo7062 = i2 != 0 ? ((InterfaceC2326) list2.get(i2 - 1)).mo7061() - i5 : 0;
        int iMo7063 = i == list.size() ? this.f15825 : ((InterfaceC2326) list.get(i)).mo7062() - i4;
        int iMo7064 = i2 == list2.size() ? this.f15820 : ((InterfaceC2326) list2.get(i2)).mo7062() - i5;
        int i6 = this.f15824;
        if (i6 == iMo7061 && this.f15819 == iMo7062) {
            m12398(iMo7061, iMo7062, iMo7063, iMo7064);
        } else if (i6 < iMo7061 && (i3 = this.f15819) < iMo7062) {
            m12398(i6, i3, this.f15821, this.f15826);
            m12398(iMo7061, iMo7062, iMo7063, iMo7064);
        } else {
            int i7 = this.f15819;
            int i8 = this.f15821;
            int i9 = this.f15826;
            C16936 c16936 = this.f15818;
            CharSequence charSequence = this.f15830;
            CharSequence charSequence2 = this.f15827;
            C2824 c2824 = this.f15822;
            if (i6 == iMo7061 && i8 == iMo7063) {
                C12703 c12703M10946 = C3737.m10946(charSequence2.subSequence(i6, i8), charSequence.subSequence(i7, i9), charSequence.subSequence(iMo7062, iMo7064), c16936);
                for (C20464 c20464 : ((InterfaceC13409) c12703M10946.f56076).mo11889()) {
                    c2824.m15544(c20464.f66401 + i6, c20464.f66399 + i7, c20464.f66400 + i6, c20464.f66402 + i7);
                }
                for (C20464 c20465 : ((InterfaceC13409) c12703M10946.f56077).mo11889()) {
                    c2824.m15544(c20465.f66401 + i6, c20465.f66399 + iMo7062, c20465.f66400 + i6, c20465.f66402 + iMo7062);
                }
            } else {
                if (i7 != iMo7062 || i9 != iMo7064) {
                    throw new IllegalStateException();
                }
                C12703 c12703M10947 = C3737.m10946(charSequence.subSequence(i7, i9), charSequence2.subSequence(i6, i8), charSequence2.subSequence(iMo7061, iMo7063), c16936);
                for (C20464 c20466 : ((InterfaceC13409) c12703M10947.f56076).mo11889()) {
                    c2824.m15544(c20466.f66399 + i6, c20466.f66401 + i7, c20466.f66402 + i6, c20466.f66400 + i7);
                }
                for (C20464 c20467 : ((InterfaceC13409) c12703M10947.f56077).mo11889()) {
                    c2824.m15544(c20467.f66399 + iMo7061, c20467.f66401 + i7, c20467.f66402 + iMo7061, c20467.f66400 + i7);
                }
            }
        }
        this.f15824 = -1;
        this.f15819 = -1;
        this.f15821 = -1;
        this.f15826 = -1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m12399(int i, int i2) {
        int i3 = this.f15823;
        List list = this.f15828;
        int iMo7061 = i == -1 ? 0 : ((InterfaceC2326) list.get(i)).mo7061() - i3;
        int i4 = this.f15832;
        List list2 = this.f15829;
        int iMo7062 = i2 != -1 ? ((InterfaceC2326) list2.get(i2)).mo7061() - i4 : 0;
        int i5 = i + 1;
        int iMo7063 = i5 == list.size() ? this.f15825 : ((InterfaceC2326) list.get(i5)).mo7062() - i3;
        int i6 = i2 + 1;
        int iMo7064 = i6 == list2.size() ? this.f15820 : ((InterfaceC2326) list2.get(i6)).mo7062() - i4;
        this.f15824 = iMo7061;
        this.f15819 = iMo7062;
        this.f15821 = iMo7063;
        this.f15826 = iMo7064;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m12398(int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return;
        }
        for (C20464 c20464 : C5772.m15898(this.f15827.subSequence(i, i3), this.f15830.subSequence(i2, i4), this.f15818).mo11889()) {
            this.f15822.m15544(c20464.f66401 + i, c20464.f66399 + i2, c20464.f66400 + i, c20464.f66402 + i2);
        }
    }
}
