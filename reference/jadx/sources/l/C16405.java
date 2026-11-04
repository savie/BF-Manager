package l;

/* JADX INFO: renamed from: l.ܶ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6VU */
/* JADX INFO: loaded from: classes4.dex */
public final class C16405 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11974 f53233;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f53234;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C1270 f53235;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f53236;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f53237;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21407 f53238 = new C21407();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C14693 f53239;

    public C16405(C1270 c1270, C11974 c11974, int i) {
        this.f53235 = c1270;
        this.f53233 = c11974;
        this.f53234 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38965(int i, int i2, C11974 c11974) {
        int i3;
        int i4 = this.f53234;
        int iMax = Math.max(i, i4) - i4;
        int iMin = Math.min(i2 - i4, this.f53235.m4628());
        if (iMax >= iMin) {
            return;
        }
        if (this.f53239 != null && iMax < this.f53237) {
            m38963();
        }
        if (this.f53239 != null && iMax > (i3 = this.f53237)) {
            C1270 c1270 = this.f53235;
            C21407 c21407 = this.f53238;
            c21407.m48710(c1270);
            c21407.m48711(i3);
            if (c21407.m48709() < iMax) {
                m38963();
            } else {
                this.f53239.m35347(iMax - this.f53237, c21407.m48712(), c21407.m48716() && c21407.m48715() == this.f53237);
            }
            c21407.m48710(C1270.m4622());
        }
        if (this.f53239 == null) {
            this.f53239 = new C14693();
            this.f53236 = iMax;
        }
        this.f53239.m35347(iMin - iMax, c11974, iMax + i4 == i);
        this.f53237 = iMin;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17151 m38964(C23865 c23865) {
        boolean zIsEmpty = c23865.f77265.isEmpty();
        C11974 c11974 = this.f53233;
        if (zIsEmpty) {
            m38965(c23865.f77264, c23865.f77263, c11974);
            return null;
        }
        if (c23865.f77265.size() == 1) {
            C17897 c17897 = (C17897) c23865.f77265.get(0);
            if (c17897.f58632 == c23865.f77264 && c17897.f58630 == c23865.f77263) {
                m38965(c23865.f77264, c23865.f77263, c11974.m30038(c17897.f58631));
                return null;
            }
        }
        return new C17151(c23865, m38963(), c11974, this.f53234);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38966(C17151 c17151) {
        this.f53235 = c17151.m40294();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1270 m38963() {
        C14693 c14693 = this.f53239;
        if (c14693 != null) {
            this.f53235 = this.f53235.m4629(this.f53236, this.f53237, c14693.m35346());
            this.f53239 = null;
        }
        return this.f53235;
    }
}
