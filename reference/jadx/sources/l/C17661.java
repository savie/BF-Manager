package l;

/* JADX INFO: renamed from: l.ܿ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B9F */
/* JADX INFO: loaded from: classes4.dex */
public final class C17661 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C4129[] f56118;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5667 f56119;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f56120;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C4129 f56121;

    public C17661(C5667 c5667, int i) {
        if (c5667 == null) {
            throw new NullPointerException("blocks == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("firstLabel < 0");
        }
        this.f56119 = c5667;
        this.f56120 = i;
        this.f56118 = null;
        this.f56121 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5667 m41141() {
        return this.f56119;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m41142() {
        return this.f56120;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4129 m41140(int i) {
        if (this.f56121 == null) {
            C5667 c5667 = this.f56119;
            int iM36890 = c5667.m36890();
            C4129[] c4129Arr = new C4129[iM36890];
            C4129 c4129 = new C4129(10);
            int size = c5667.size();
            for (int i2 = 0; i2 < size; i2++) {
                C12018 c12018M15271get = c5667.m15271get(i2);
                int iMo29913 = c12018M15271get.mo29913();
                C4129 c4129M29916 = c12018M15271get.m29916();
                int size2 = c4129M29916.size();
                if (size2 == 0) {
                    c4129.add(iMo29913);
                } else {
                    for (int i3 = 0; i3 < size2; i3++) {
                        int i4 = c4129M29916.get(i3);
                        C4129 c41210 = c4129Arr[i4];
                        if (c41210 == null) {
                            c41210 = new C4129(10);
                            c4129Arr[i4] = c41210;
                        }
                        c41210.add(iMo29913);
                    }
                }
            }
            for (int i5 = 0; i5 < iM36890; i5++) {
                C4129 c41211 = c4129Arr[i5];
                if (c41211 != null) {
                    c41211.m11756();
                    c41211.mo9637();
                }
            }
            c4129.m11756();
            c4129.mo9637();
            int i6 = this.f56120;
            if (c4129Arr[i6] == null) {
                c4129Arr[i6] = C4129.f15128;
            }
            this.f56118 = c4129Arr;
            this.f56121 = c4129;
        }
        C4129 c41212 = this.f56118[i];
        if (c41212 != null) {
            return c41212;
        }
        throw new RuntimeException("no such block: ".concat(C22475.m49982(i)));
    }
}
