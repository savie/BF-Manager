package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۘ۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: S515 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4181 extends AbstractC9950 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21335 f14177;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C21335 f14178;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC20589 f14179;

    public C4181(C21335 c21335, C21335 c21336, InterfaceC19775 interfaceC19775, C21335 c21337) {
        AbstractC20589 c23573;
        this.f14178 = c21335;
        this.f14177 = c21336;
        if (interfaceC19775 != null) {
            c23573 = new C23573(c21337, interfaceC19775);
        } else {
            c23573 = new C3435(c21337);
        }
        this.f14179 = c23573;
    }

    public C4181(C21335 c21335, C21335 c21336, AbstractC20589 abstractC20589) {
        this.f14178 = c21335;
        this.f14177 = c21336;
        this.f14179 = abstractC20589;
    }

    public C4181(C21335 c21335, C21335 c21336, C21335 c21337) {
        this.f14178 = c21335;
        this.f14177 = c21336;
        this.f14179 = new C3435(c21337);
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۙ */
    public final int mo4114() {
        return this.f14178.m48561().f30505;
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ۤ */
    public final int mo4115() {
        return this.f14177.m48561().f30505 - this.f14178.m48561().f30505;
    }

    @Override // l.InterfaceC4685
    /* JADX INFO: renamed from: ᩷ */
    public final List mo4116() {
        return AbstractC1928.of((Object) this.f14179);
    }
}
