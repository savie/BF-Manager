package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۗۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2942 extends AbstractC9986 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2942(AbstractC5752 abstractC5752, int i, Object obj, int i2) {
        super(abstractC5752, i);
        this.s = i2;
        this.t = obj;
    }

    @Override // l.AbstractC5752
    public final InterfaceC19171 q0(int i, InterfaceC19171 interfaceC19171) {
        switch (this.s) {
            case 0:
                return new C19877(this, interfaceC19171, 1);
            case 1:
                return new C19877(this, interfaceC19171, 2);
            case 2:
                return new C9377(this, interfaceC19171);
            case 3:
                return new C19877(this, interfaceC19171, 5);
            case 4:
                return new C4622(this, interfaceC19171, 4);
            default:
                return new C6498(this, interfaceC19171);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2942(AbstractC23392 abstractC23392, IntConsumer intConsumer) {
        super(abstractC23392, 0);
        this.s = 0;
        this.t = intConsumer;
    }
}
