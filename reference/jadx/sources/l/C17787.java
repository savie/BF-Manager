package l;

import java.util.function.DoublePredicate;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ᩳۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17787 extends AbstractC10580 implements InterfaceC21349 {
    public final /* synthetic */ int s;
    public final /* synthetic */ DoublePredicate t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17787(AbstractC8575 abstractC8575, int i, DoublePredicate doublePredicate, int i2) {
        super(abstractC8575, i);
        this.s = i2;
        this.t = doublePredicate;
    }

    @Override // l.AbstractC5752
    public final InterfaceC20693 o0(AbstractC5752 abstractC5752, InterfaceC20693 interfaceC20693) {
        switch (this.s) {
            case 0:
                return EnumC2970.ORDERED.s(abstractC5752.m) ? n0(abstractC5752, interfaceC20693, new C1040(29)).spliterator() : new C3273((InterfaceC7535) abstractC5752.h0(interfaceC20693), this.t);
            default:
                return EnumC2970.ORDERED.s(abstractC5752.m) ? n0(abstractC5752, interfaceC20693, new C16377()).spliterator() : new C20208((InterfaceC7535) abstractC5752.h0(interfaceC20693), this.t);
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
        return new C13589(this, interfaceC23280, z);
    }

    @Override // l.AbstractC5752
    public final InterfaceC19171 q0(int i, InterfaceC19171 interfaceC19171) {
        switch (this.s) {
            case 0:
                return new C11438(this, interfaceC19171);
            default:
                return new C13589(this, interfaceC19171, false);
        }
    }
}
