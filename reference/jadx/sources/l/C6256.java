package l;

/* JADX INFO: renamed from: l.ۛ۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7L9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6256 implements InterfaceC4018 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C14769 f21228 = C14769.m35543();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14769 f21229;

    public C6256(C14769 c14769) {
        this.f21229 = c14769;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m17905() {
        return this.f21229;
    }

    @Override // l.InterfaceC4018
    /* JADX INFO: renamed from: ۙ */
    public final C6256 mo12989(C6256 c6256) {
        C11972.m30026(this.f21229 == f21228);
        this.f21229 = c6256.f21229;
        return this;
    }

    public final String toString() {
        return "ANNOTATIONS [ " + this.f21229 + " ]";
    }
}
