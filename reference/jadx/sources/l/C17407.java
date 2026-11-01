package l;

/* JADX INFO: renamed from: l.ܿܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes4.dex */
public final class C17407 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC8774 f55391;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f55392;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22680 f55393;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18258 f55394;

    public C17407(C22680 c22680, C18258 c18258, C21452 c21452) {
        this.f55393 = c22680;
        this.f55394 = c18258;
        this.f55391 = c21452;
    }

    public final int hashCode() {
        int i = this.f55392;
        if (i != 0) {
            return i;
        }
        int iM14096 = C5058.m14096(this.f55391, this.f55394.m42455());
        this.f55392 = iM14096;
        return iM14096;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17407)) {
            return false;
        }
        C17407 c17407 = (C17407) obj;
        C18258 c18258 = c17407.f55394;
        C23800 c23800 = this.f55393.f73852;
        C18258 c18259 = this.f55394;
        return c23800.m52399(c18259.f77449, c18258.f77449) && new C11409(c18259.m42455(), c18258.m42455()).m28512(this.f55391, c17407.f55391);
    }
}
