package l;

/* JADX INFO: renamed from: l.ᩳ᩵۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes5.dex */
public final class C18255 extends AbstractC8774 implements InterfaceC4021 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C21783 f58252;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC5930 f58253;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C21825 f58254;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EnumC13195 f58255;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C19670 f58256;

    public C18255(C21783 c21783, EnumC13195 enumC13195, AbstractC5930 abstractC5930, C21825 c21825) {
        this.f58252 = c21783;
        this.f58255 = enumC13195;
        this.f58253 = abstractC5930;
        this.f58254 = c21825;
    }

    @Override // l.AbstractC8774
    /* JADX INFO: renamed from: ۙ */
    public final void mo1802(AbstractC19357 abstractC19357) {
        abstractC19357.mo1981(this);
    }

    @Override // l.InterfaceC17428
    /* JADX INFO: renamed from: ۙ */
    public final EnumC12490 mo1801() {
        return EnumC12490.MODULE;
    }

    @Override // l.InterfaceC4021
    public final C21825 getAnnotations() {
        return this.f58252.f70566;
    }

    @Override // l.InterfaceC4021
    /* JADX INFO: renamed from: ۡ */
    public final EnumC13195 mo11527() {
        return this.f58255;
    }

    @Override // l.InterfaceC4021
    public final AbstractC5930 getName() {
        return this.f58253;
    }

    @Override // l.InterfaceC4021
    /* JADX INFO: renamed from: ۢ */
    public final C21825 mo11528() {
        return this.f58254;
    }

    @Override // l.AbstractC8774, l.InterfaceC17428
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1800(InterfaceC6139 interfaceC6139, Object obj) {
        return interfaceC6139.mo1903(this, obj);
    }

    @Override // l.AbstractC8774
    /* JADX INFO: renamed from: ۨۙ */
    public final EnumC18651 mo1803() {
        return EnumC18651.f60488;
    }
}
