package l;

import java.io.Serializable;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.ܶܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: KCC7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16233 implements InterfaceC25141, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return C21263.$default$andThen(this, intUnaryOperator);
    }

    public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return C21263.$default$compose(this, intUnaryOperator);
    }

    @Override // l.InterfaceC25141, l.InterfaceC21433, java.util.Map
    public /* synthetic */ Character get(Object obj) {
        return C11714.m29432(this, obj);
    }

    @Override // l.InterfaceC21433, java.util.Map
    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return get(obj);
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        return mo6946(C8485.m22804(i));
    }

    @Override // l.InterfaceC25141
    /* JADX INFO: renamed from: ۙ */
    public char mo6943(char c, char c2) {
        throw new UnsupportedOperationException();
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
