package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۠ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7910 extends AbstractC18527 implements InterfaceC10974 {
    public static final C5980 c;
    public static final C5980 d;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C7100.$default$andThen(this, intConsumer);
    }

    @Override // l.AbstractC18527, l.InterfaceC19171
    public final void accept(int i) {
        n(Integer.valueOf(i));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new C2347(((Integer) this.b).intValue());
        }
        return null;
    }

    static {
        EnumC22761 enumC22761 = EnumC22761.INT_VALUE;
        C13858 c13858 = new C13858(16);
        C17821 c17821 = new C17821(11);
        C2347 c2347 = C2347.c;
        c = new C5980(true, enumC22761, c2347, c13858, c17821);
        d = new C5980(false, enumC22761, c2347, new C13858(16), new C17821(11));
    }
}
