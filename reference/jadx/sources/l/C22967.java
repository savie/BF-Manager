package l;

/* JADX INFO: renamed from: l.᩸ܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 84VO */
/* JADX INFO: loaded from: classes.dex */
public final class C22967 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C11032 f74604;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f74602 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f74603 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f74601 = -1;

    public C22967(C11032 c11032) {
        this.f74604 = c11032;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51838() {
        int i = this.f74602;
        if (i == 0) {
            return;
        }
        C11032 c11032 = this.f74604;
        if (i == 1) {
            c11032.m27893(this.f74603, this.f74601);
        } else if (i == 2) {
            c11032.m27894(this.f74603, this.f74601);
        } else if (i == 3) {
            c11032.m27891(this.f74603, this.f74601);
        }
        this.f74602 = 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m51840(int i, int i2) {
        m51838();
        this.f74604.m27892(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51839(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f74602 == 3 && i <= (i4 = this.f74601 + (i3 = this.f74603)) && (i5 = i + i2) >= i3) {
            this.f74603 = Math.min(i, i3);
            this.f74601 = Math.max(i4, i5) - this.f74603;
        } else {
            m51838();
            this.f74603 = i;
            this.f74601 = i2;
            this.f74602 = 3;
        }
    }
}
