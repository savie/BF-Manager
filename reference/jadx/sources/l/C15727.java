package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܺۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15727 extends AbstractC5121 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15727(AbstractC5752 abstractC5752, int i, Object obj, int i2) {
        super(abstractC5752, i);
        this.s = i2;
        this.t = obj;
    }

    @Override // l.AbstractC5752
    public final InterfaceC19171 q0(int i, InterfaceC19171 interfaceC19171) {
        switch (this.s) {
            case 0:
                return new C19877(this, interfaceC19171, 3);
            case 1:
                return new C8803(this, interfaceC19171, 1);
            case 2:
                return new C22021(this, interfaceC19171);
            case 3:
                return new C8803(this, interfaceC19171, 4);
            case 4:
                return new C8803(this, interfaceC19171, 5);
            case 5:
                return new C22914(this, interfaceC19171);
            default:
                return new C4622(this, interfaceC19171, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15727(AbstractC7944 abstractC7944, LongConsumer longConsumer) {
        super(abstractC7944, 0);
        this.s = 4;
        this.t = longConsumer;
    }
}
