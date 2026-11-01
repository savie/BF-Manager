package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܿۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17082 extends AbstractC18527 implements InterfaceC21993 {
    public static final C5980 c;
    public static final C5980 d;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C21917.$default$andThen(this, longConsumer);
    }

    @Override // l.AbstractC18527, l.InterfaceC19171
    public final void accept(long j) {
        n(Long.valueOf(j));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new C5876(((Long) this.b).longValue());
        }
        return null;
    }

    static {
        EnumC22761 enumC22761 = EnumC22761.LONG_VALUE;
        C13858 c13858 = new C13858(17);
        C17821 c17821 = new C17821(12);
        C5876 c5876 = C5876.c;
        c = new C5980(true, enumC22761, c5876, c13858, c17821);
        d = new C5980(false, enumC22761, c5876, new C13858(17), new C17821(12));
    }
}
