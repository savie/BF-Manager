package l;

/* JADX INFO: renamed from: l.᩷᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: H86F */
/* JADX INFO: loaded from: classes5.dex */
public final class C21172 extends AbstractC10590 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20592 f68951;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile AbstractC7186 f68952;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11730 f68953;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f68954;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6044 f68955;

    public C21172(InterfaceC5069 interfaceC5069, InterfaceC14512 interfaceC14512, C6044 c6044, C11730 c11730, InterfaceC20592 interfaceC20592, boolean z) {
        this.f68955 = c6044;
        this.f68953 = c11730;
        this.f68951 = interfaceC20592;
        this.f68954 = z;
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) {
        AbstractC7186 abstractC7186M16441 = this.f68952;
        if (abstractC7186M16441 == null) {
            abstractC7186M16441 = this.f68955.m16441(this.f68951, this.f68953);
            this.f68952 = abstractC7186M16441;
        }
        return abstractC7186M16441.mo1571(c5379);
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) {
        AbstractC7186 abstractC7186M16441 = this.f68952;
        if (abstractC7186M16441 == null) {
            abstractC7186M16441 = this.f68955.m16441(this.f68951, this.f68953);
            this.f68952 = abstractC7186M16441;
        }
        abstractC7186M16441.mo1572(c1145, obj);
    }

    @Override // l.AbstractC10590
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC7186 mo26765() {
        AbstractC7186 abstractC7186 = this.f68952;
        if (abstractC7186 != null) {
            return abstractC7186;
        }
        AbstractC7186 abstractC7186M16441 = this.f68955.m16441(this.f68951, this.f68953);
        this.f68952 = abstractC7186M16441;
        return abstractC7186M16441;
    }
}
