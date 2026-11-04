package l;

/* JADX INFO: renamed from: l.ܰ᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes4.dex */
public final class C14902 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17140 f48680;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20870 f48681;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C12665 f48682;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C0733 f48683;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3716 f48684;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f48685;

    static {
        new C2225().m7570();
        C7116.m19499(0);
        C7116.m19499(1);
        C7116.m19499(2);
        C7116.m19499(3);
        C7116.m19499(4);
        C7116.m19499(5);
    }

    public C14902(String str, C17140 c17140, C20870 c20870, C3716 c3716, C0733 c0733, C12665 c12665) {
        this.f48685 = str;
        this.f48681 = c20870;
        this.f48684 = c3716;
        this.f48683 = c0733;
        this.f48680 = c17140;
        this.f48682 = c12665;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2225 m35851() {
        return new C2225(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14902)) {
            return false;
        }
        C14902 c14902 = (C14902) obj;
        return C17359.equals(this.f48685, c14902.f48685) && this.f48680.equals(c14902.f48680) && C17359.equals(this.f48681, c14902.f48681) && this.f48684.equals(c14902.f48684) && C17359.equals(this.f48683, c14902.f48683) && C17359.equals(this.f48682, c14902.f48682);
    }

    public final int hashCode() {
        int iHashCode = this.f48685.hashCode() * 31;
        C20870 c20870 = this.f48681;
        int iHashCode2 = (this.f48683.hashCode() + ((this.f48680.hashCode() + ((this.f48684.hashCode() + ((iHashCode + (c20870 != null ? c20870.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f48682.getClass();
        return iHashCode2;
    }
}
