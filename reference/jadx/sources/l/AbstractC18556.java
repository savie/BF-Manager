package l;

import java.io.Serializable;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.ᩴۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1L7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18556 implements InterfaceC22666, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f59037;

    public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return C15568.$default$andThen(this, intUnaryOperator);
    }

    public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return C15568.$default$compose(this, intUnaryOperator);
    }

    @Override // l.InterfaceC22666
    /* JADX INFO: renamed from: ۙ */
    public abstract int mo26878(int i, int i2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42951() {
        this.f59037 = -1;
    }

    @Override // l.InterfaceC22666
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int mo42952() {
        return this.f59037;
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        return get(i);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final Function mo33696andThen(Function function) {
        throw new NoSuchMethodError();
    }
}
