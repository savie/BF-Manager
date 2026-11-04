package l;

/* JADX INFO: renamed from: l.۠᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H86F */
/* JADX INFO: loaded from: classes4.dex */
public final class C8968 extends AbstractC9713 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile AbstractC17567 f29247;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f29248;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C6446 f29249;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24522 f29250;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC16075 f29251;

    public C8968(InterfaceC8858 interfaceC8858, InterfaceC18554 interfaceC18554, C24522 c24522, C6446 c6446, InterfaceC16075 interfaceC16075, boolean z) {
        this.f29250 = c24522;
        this.f29249 = c6446;
        this.f29251 = interfaceC16075;
        this.f29248 = z;
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) {
        AbstractC17567 abstractC17567M54786 = this.f29247;
        if (abstractC17567M54786 == null) {
            abstractC17567M54786 = this.f29250.m54786(this.f29251, this.f29249);
            this.f29247 = abstractC17567M54786;
        }
        return abstractC17567M54786.mo3722(c4208);
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) {
        AbstractC17567 abstractC17567M54786 = this.f29247;
        if (abstractC17567M54786 == null) {
            abstractC17567M54786 = this.f29250.m54786(this.f29251, this.f29249);
            this.f29247 = abstractC17567M54786;
        }
        abstractC17567M54786.mo3723(c21362, obj);
    }

    @Override // l.AbstractC9713
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC17567 mo18558() {
        AbstractC17567 abstractC17567 = this.f29247;
        if (abstractC17567 != null) {
            return abstractC17567;
        }
        AbstractC17567 abstractC17567M54786 = this.f29250.m54786(this.f29251, this.f29249);
        this.f29247 = abstractC17567M54786;
        return abstractC17567M54786;
    }
}
