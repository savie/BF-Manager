package l;

import java.io.Serializable;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.᩺ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WC20 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC22790 implements InterfaceC3033, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return C15568.$default$andThen(this, intUnaryOperator);
    }

    public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return C15568.$default$compose(this, intUnaryOperator);
    }

    @Override // l.InterfaceC3033
    /* JADX INFO: renamed from: ۙ */
    public abstract byte mo9046(byte b, int i);

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
