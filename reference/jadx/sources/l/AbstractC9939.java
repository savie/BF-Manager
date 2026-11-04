package l;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۢۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BXE */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9939 implements InterfaceC23057, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
        return C24247.$default$andThen(this, function);
    }

    @Override // l.InterfaceC21433, java.util.Map
    public /* synthetic */ boolean containsKey(Object obj) {
        return C11122.m28073(this, obj);
    }

    @Override // l.InterfaceC21433, java.util.Map
    public /* synthetic */ Object get(Object obj) {
        return C11122.m28075(this, obj);
    }

    @Override // l.InterfaceC21433, java.util.Map
    public abstract /* synthetic */ int size();

    @Override // l.InterfaceC23057
    /* JADX INFO: renamed from: ᩷ */
    public Object mo18702() {
        return null;
    }

    @Override // l.InterfaceC23057, java.util.function.IntFunction
    public final Object apply(int i) {
        return get(i);
    }

    @Override // l.InterfaceC23057
    /* JADX INFO: renamed from: ۙ */
    public Object mo13466(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // l.InterfaceC23057
    public Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }
}
