package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ܺۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15644 extends AbstractC0812 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15644(AbstractC5752 abstractC5752, int i, Object obj, int i2) {
        super(abstractC5752, i);
        this.s = i2;
        this.t = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15644(AbstractC8575 abstractC8575, DoubleConsumer doubleConsumer) {
        super(abstractC8575, 0);
        this.s = 3;
        this.t = doubleConsumer;
    }

    @Override // l.AbstractC5752
    public final InterfaceC19171 q0(int i, InterfaceC19171 interfaceC19171) {
        switch (this.s) {
            case 0:
                return new C3211(this, interfaceC19171, 1);
            case 1:
                return new C20665(this, interfaceC19171);
            case 2:
                return new C3211(this, interfaceC19171, 4);
            case 3:
                return new C3211(this, interfaceC19171, 5);
            case 4:
                return new C19877(this, interfaceC19171, 4);
            case 5:
                return new C4622(this, interfaceC19171, 6);
            default:
                return new C20610(this, interfaceC19171);
        }
    }
}
