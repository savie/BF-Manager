package l;

import java.io.Serializable;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.۟ۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: V1L7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7703 implements InterfaceC14348, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f25411;

    public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return C21263.$default$andThen(this, intUnaryOperator);
    }

    public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return C21263.$default$compose(this, intUnaryOperator);
    }

    @Override // l.InterfaceC14348
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract int mo20978(int i, int i2);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20979() {
        this.f25411 = -1;
    }

    @Override // l.InterfaceC14348
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int mo20980() {
        return this.f25411;
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
    public final Function mo10608andThen(Function function) {
        throw new NoSuchMethodError();
    }
}
