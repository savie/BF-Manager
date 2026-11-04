package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ᩴ᩹ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20122 extends AbstractC23261 implements InterfaceC13080 {
    public static final C10205 c;
    public static final C10205 d;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC2946.a(this, doubleConsumer);
    }

    @Override // l.AbstractC23261, l.InterfaceC15143, l.InterfaceC13080, java.util.function.DoubleConsumer
    public final void accept(double d2) {
        n(Double.valueOf(d2));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new C21725(((Double) this.b).doubleValue());
        }
        return null;
    }

    static {
        EnumC14154 enumC14154 = EnumC14154.DOUBLE_VALUE;
        C22272 c22272 = new C22272(15);
        C8189 c8189 = new C8189(10);
        C21725 c21725 = C21725.c;
        c = new C10205(true, enumC14154, c21725, c22272, c8189);
        d = new C10205(false, enumC14154, c21725, new C22272(15), new C8189(10));
    }
}
