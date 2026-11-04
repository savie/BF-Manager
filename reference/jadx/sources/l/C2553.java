package l;

/* JADX INFO: renamed from: l.ۖۡۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7LT */
/* JADX INFO: loaded from: classes3.dex */
public final class C2553 implements InterfaceC16527 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C18756 f8192 = new C18756();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22486 f8193;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f8194;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C1150 f8195;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15648 f8196;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC1272 f8197;

    public C2553(InterfaceC22486 interfaceC22486, C15648 c15648, C1150 c1150, InterfaceC1272 interfaceC1272, boolean z) {
        this.f8193 = interfaceC22486;
        this.f8196 = c15648;
        this.f8195 = c1150;
        this.f8197 = interfaceC1272;
        this.f8194 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m8562(C9169 c9169) {
        return this.f8193.mo2289(c9169, f8192) == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2553 m8561() {
        InterfaceC22486 c8006;
        InterfaceC22486 interfaceC22486 = this.f8193;
        InterfaceC22486 interfaceC22486Mo2296 = interfaceC22486.mo2296();
        C20782.m47568(!((interfaceC22486Mo2296 instanceof C7370) || (interfaceC22486Mo2296 instanceof C16231)));
        C20782.m47567("Can't recreate wrapped extractors. Outer type: " + interfaceC22486.getClass(), interfaceC22486.mo2296() == interfaceC22486);
        if (interfaceC22486 instanceof C9068) {
            c8006 = new C9068(this.f8196.f50811, this.f8195, this.f8197, this.f8194);
        } else if (interfaceC22486 instanceof C9849) {
            c8006 = new C9849(0);
        } else if (interfaceC22486 instanceof C18054) {
            c8006 = new C18054();
        } else if (interfaceC22486 instanceof C7613) {
            c8006 = new C7613();
        } else {
            if (!(interfaceC22486 instanceof C8006)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(interfaceC22486.getClass().getSimpleName()));
            }
            c8006 = new C8006(0);
        }
        return new C2553(c8006, this.f8196, this.f8195, this.f8197, this.f8194);
    }
}
