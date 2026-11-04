package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: M9PM */
/* JADX INFO: loaded from: classes3.dex */
public final class C9625 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1796[] f31136 = new C1796[2];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1796 m25128(Class cls, C10788 c10788) {
        int iM27501 = c10788.m27501();
        C1796[] c1796Arr = this.f31136;
        if (iM27501 >= c1796Arr.length) {
            this.f31136 = (C1796[]) Arrays.copyOf(c1796Arr, iM27501 * 2);
        }
        C1796 c1796 = this.f31136[iM27501];
        if (c1796 != null) {
            return c1796;
        }
        String strM9545 = C2914.m9545(c10788.getName());
        C1796 c1797 = new C1796(C2914.m9551(cls, C14483.m34972(strM9545, "Case_")), C2914.m9551(cls, C14483.m34972(strM9545, "_")));
        this.f31136[iM27501] = c1797;
        return c1797;
    }
}
