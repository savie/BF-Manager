package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ᩳ᩹ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19376 extends AbstractC23261 implements InterfaceC1148 {
    public static final C10205 c;
    public static final C10205 d;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C18279.$default$andThen(this, longConsumer);
    }

    @Override // l.AbstractC23261, l.InterfaceC15143
    public final void accept(long j) {
        n(Long.valueOf(j));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new C19487(((Long) this.b).longValue());
        }
        return null;
    }

    static {
        EnumC14154 enumC14154 = EnumC14154.LONG_VALUE;
        C22272 c22272 = new C22272(17);
        C8189 c8189 = new C8189(12);
        C19487 c19487 = C19487.c;
        c = new C10205(true, enumC14154, c19487, c22272, c8189);
        d = new C10205(false, enumC14154, c19487, new C22272(17), new C8189(12));
    }
}
