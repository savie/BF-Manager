package l;

/* JADX INFO: renamed from: l.᩷֡ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84VO */
/* JADX INFO: loaded from: classes4.dex */
public final class C20525 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7119 f66502;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f66504 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f66505 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f66503 = -1;

    public C20525(C7119 c7119) {
        this.f66502 = c7119;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46309() {
        int i = this.f66504;
        if (i == 0) {
            return;
        }
        C7119 c7119 = this.f66502;
        if (i == 1) {
            c7119.m19013(this.f66505, this.f66503);
        } else if (i == 2) {
            c7119.m19010(this.f66505, this.f66503);
        } else if (i == 3) {
            c7119.m19011(this.f66505, this.f66503);
        }
        this.f66504 = 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46311(int i, int i2) {
        m46309();
        this.f66502.m19012(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46310(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f66504 == 3 && i <= (i4 = this.f66503 + (i3 = this.f66505)) && (i5 = i + i2) >= i3) {
            this.f66505 = Math.min(i, i3);
            this.f66503 = Math.max(i4, i5) - this.f66505;
        } else {
            m46309();
            this.f66505 = i;
            this.f66503 = i2;
            this.f66504 = 3;
        }
    }
}
