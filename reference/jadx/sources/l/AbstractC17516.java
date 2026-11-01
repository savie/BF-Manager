package l;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܿᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1LO */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17516 implements InterfaceC16127, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C4277.$default$compose(this, function);
    }

    @Override // l.InterfaceC16127, l.InterfaceC6456
    public /* synthetic */ Integer get(Object obj) {
        return C21065.m47474(this, obj);
    }

    @Override // l.InterfaceC6456
    public abstract /* synthetic */ int size();

    @Override // l.InterfaceC6456
    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return get(obj);
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        return mo18022(obj);
    }

    @Override // l.InterfaceC16127
    /* JADX INFO: renamed from: ۙ */
    public int mo18019(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // l.InterfaceC16127
    /* JADX INFO: renamed from: ۙ */
    public int mo18020(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final Function mo33696andThen(Function function) {
        throw new NoSuchMethodError();
    }
}
