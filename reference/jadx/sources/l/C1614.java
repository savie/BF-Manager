package l;

/* JADX INFO: renamed from: l.֫ۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1614 extends AbstractC0812 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1614(AbstractC5752 abstractC5752, int i, int i2) {
        super(abstractC5752, i);
        this.s = i2;
    }

    @Override // l.AbstractC5752
    public final InterfaceC19171 q0(int i, InterfaceC19171 interfaceC19171) {
        switch (this.s) {
            case 0:
                return interfaceC19171;
            case 1:
                return new C22782(1, interfaceC19171);
            case 2:
                return new C10920(interfaceC19171);
            default:
                return new C8803(this, interfaceC19171, 3);
        }
    }
}
