package l;

/* JADX INFO: renamed from: l.ۢ֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B9F */
/* JADX INFO: loaded from: classes3.dex */
public final class C9757 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14978 f31469;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f31470;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C24698 f31471;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C24698[] f31472;

    public C9757(C14978 c14978, int i) {
        if (c14978 == null) {
            throw new NullPointerException("blocks == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("firstLabel < 0");
        }
        this.f31469 = c14978;
        this.f31470 = i;
        this.f31472 = null;
        this.f31471 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14978 m25432() {
        return this.f31469;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m25434() {
        return this.f31470;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24698 m25433(int i) {
        if (this.f31471 == null) {
            C14978 c14978 = this.f31469;
            int iM37668 = c14978.m37668();
            C24698[] c24698Arr = new C24698[iM37668];
            C24698 c24698 = new C24698(10);
            int size = c14978.size();
            for (int i2 = 0; i2 < size; i2++) {
                C22438 c22438M31620get = c14978.m31620get(i2);
                int iMo31292 = c22438M31620get.mo31292();
                C24698 c24698M50590 = c22438M31620get.m50590();
                int size2 = c24698M50590.size();
                if (size2 == 0) {
                    c24698.add(iMo31292);
                } else {
                    for (int i3 = 0; i3 < size2; i3++) {
                        int i4 = c24698M50590.get(i3);
                        C24698 c24699 = c24698Arr[i4];
                        if (c24699 == null) {
                            c24699 = new C24698(10);
                            c24698Arr[i4] = c24699;
                        }
                        c24699.add(iMo31292);
                    }
                }
            }
            for (int i5 = 0; i5 < iM37668; i5++) {
                C24698 c246910 = c24698Arr[i5];
                if (c246910 != null) {
                    c246910.m55049();
                    c246910.mo15005();
                }
            }
            c24698.m55049();
            c24698.mo15005();
            int i6 = this.f31470;
            if (c24698Arr[i6] == null) {
                c24698Arr[i6] = C24698.f79910;
            }
            this.f31472 = c24698Arr;
            this.f31471 = c24698;
        }
        C24698 c246911 = this.f31472[i];
        if (c246911 != null) {
            return c246911;
        }
        throw new RuntimeException("no such block: ".concat(C5306.m15934(i)));
    }
}
