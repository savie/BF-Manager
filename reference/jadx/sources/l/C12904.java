package l;

import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۬ۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12904 extends AbstractC3709 implements InterfaceC21349 {
    public final /* synthetic */ int s;
    public final /* synthetic */ Predicate t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12904(AbstractC14295 abstractC14295, int i, Predicate predicate, int i2) {
        super(abstractC14295, i);
        this.s = i2;
        this.t = predicate;
    }

    @Override // l.AbstractC5752
    public final InterfaceC20693 o0(AbstractC5752 abstractC5752, InterfaceC20693 interfaceC20693) {
        switch (this.s) {
            case 0:
                return EnumC2970.ORDERED.s(abstractC5752.m) ? n0(abstractC5752, interfaceC20693, new C1040(11)).spliterator() : new C7259(abstractC5752.h0(interfaceC20693), this.t, 1);
            default:
                return EnumC2970.ORDERED.s(abstractC5752.m) ? n0(abstractC5752, interfaceC20693, new C1040(11)).spliterator() : new C7259(abstractC5752.h0(interfaceC20693), this.t, 0);
        }
    }

    @Override // l.AbstractC5752
    public final InterfaceC8616 n0(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693, IntFunction intFunction) {
        switch (this.s) {
            case 0:
                return (InterfaceC8616) new C15269(this, abstractC22686, interfaceC20693, intFunction).invoke();
            default:
                return (InterfaceC8616) new C4684(this, abstractC22686, interfaceC20693, intFunction).invoke();
        }
    }

    @Override // l.InterfaceC21349
    public InterfaceC0182 d(InterfaceC23280 interfaceC23280, boolean z) {
        return new C10082(this, interfaceC23280, z);
    }

    @Override // l.AbstractC5752
    public final InterfaceC19171 q0(int i, InterfaceC19171 interfaceC19171) {
        switch (this.s) {
            case 0:
                return new C0451(this, interfaceC19171);
            default:
                return new C10082(this, interfaceC19171, false);
        }
    }
}
