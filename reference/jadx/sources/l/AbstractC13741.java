package l;

import java.io.Serializable;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.ܰۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: KCC7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13741 implements InterfaceC9508, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return C15568.$default$andThen(this, intUnaryOperator);
    }

    public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return C15568.$default$compose(this, intUnaryOperator);
    }

    @Override // l.InterfaceC9508, l.InterfaceC6456
    public /* synthetic */ Character get(Object obj) {
        return C1745.m5787(this, obj);
    }

    @Override // l.InterfaceC6456
    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return get(obj);
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        return mo9552(C21273.m47738(i));
    }

    @Override // l.InterfaceC9508
    /* JADX INFO: renamed from: ۙ */
    public char mo24344(char c, char c2) {
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
    public final Function mo33696andThen(Function function) {
        throw new NoSuchMethodError();
    }
}
