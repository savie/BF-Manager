package l;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩵ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BXE */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19262 implements InterfaceC17372, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo33696andThen(Function function) {
        return C4277.$default$andThen(this, function);
    }

    @Override // l.InterfaceC6456
    public /* synthetic */ boolean containsKey(Object obj) {
        return C12434.m30906(this, obj);
    }

    @Override // l.InterfaceC6456
    public /* synthetic */ Object get(Object obj) {
        return C12434.m30908(this, obj);
    }

    @Override // l.InterfaceC6456
    public abstract /* synthetic */ int size();

    @Override // l.InterfaceC17372
    /* JADX INFO: renamed from: ۨ */
    public Object mo10756() {
        return null;
    }

    @Override // l.InterfaceC17372, java.util.function.IntFunction
    public final Object apply(int i) {
        return get(i);
    }

    @Override // l.InterfaceC17372
    /* JADX INFO: renamed from: ۙ */
    public Object mo8944(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // l.InterfaceC17372
    public Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }
}
