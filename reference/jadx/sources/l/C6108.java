package l;

/* JADX INFO: renamed from: l.ۛۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes3.dex */
public final class C6108 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8935 f20850;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C24705 f20853;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C14764 f20856;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC17294[] f20855 = new AbstractC17294[9];

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C12819 f20852 = new C12819(this, 8);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C3124 f20854 = new C3124(this, false);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C3124 f20851 = new C3124(this, true);

    public C6108(C8935 c8935, C14764 c14764, C24705 c24705) {
        this.f20850 = c8935;
        this.f20853 = c24705;
        for (int i = 0; i < 8; i++) {
            this.f20855[i] = new C20278(this, i);
        }
        this.f20855[8] = this.f20852;
        this.f20856 = c14764;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3124 m17628() {
        return this.f20854;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3124 m17625() {
        return this.f20851;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC17294 m17627(AbstractC22664 abstractC22664) {
        return this.f20855[C8935.m23847(abstractC22664)];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15802 m17626(C5816 c5816) {
        return new C15802(this, c5816.mo29576(this.f20853), c5816.f19998);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1633 m17624(int i) {
        return new C1633(this, i, null, null);
    }
}
