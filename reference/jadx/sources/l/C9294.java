package l;

/* JADX INFO: renamed from: l.ۢۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9294 extends AbstractC9986 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9294(AbstractC5752 abstractC5752, int i, int i2) {
        super(abstractC5752, i);
        this.s = i2;
    }

    @Override // l.AbstractC5752
    public final InterfaceC19171 q0(int i, InterfaceC19171 interfaceC19171) {
        switch (this.s) {
            case 0:
                return new C3211(this, interfaceC19171, 2);
            case 1:
                return interfaceC19171;
            default:
                return new C8803(this, interfaceC19171, 2);
        }
    }
}
