package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۚۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5087 extends AbstractC18527 implements InterfaceC8857 {
    public static final C5980 c;
    public static final C5980 d;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC14884.a(this, doubleConsumer);
    }

    @Override // l.AbstractC18527, l.InterfaceC19171
    public final void accept(double d2) {
        n(Double.valueOf(d2));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new C16460(((Double) this.b).doubleValue());
        }
        return null;
    }

    static {
        EnumC22761 enumC22761 = EnumC22761.DOUBLE_VALUE;
        C13858 c13858 = new C13858(15);
        C17821 c17821 = new C17821(10);
        C16460 c16460 = C16460.c;
        c = new C5980(true, enumC22761, c16460, c13858, c17821);
        d = new C5980(false, enumC22761, c16460, new C13858(15), new C17821(10));
    }
}
