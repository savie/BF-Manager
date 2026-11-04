package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۗ᩹ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3714 extends AbstractC23261 implements InterfaceC12334 {
    public static final C10205 c;
    public static final C10205 d;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C4109.$default$andThen(this, intConsumer);
    }

    @Override // l.AbstractC23261, l.InterfaceC15143
    public final void accept(int i) {
        n(Integer.valueOf(i));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new C23327(((Integer) this.b).intValue());
        }
        return null;
    }

    static {
        EnumC14154 enumC14154 = EnumC14154.INT_VALUE;
        C22272 c22272 = new C22272(16);
        C8189 c8189 = new C8189(11);
        C23327 c23327 = C23327.c;
        c = new C10205(true, enumC14154, c23327, c22272, c8189);
        d = new C10205(false, enumC14154, c23327, new C22272(16), new C8189(11));
    }
}
