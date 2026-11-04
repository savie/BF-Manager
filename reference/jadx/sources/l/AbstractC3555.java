package l;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۗܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: G1DZ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3555 implements InterfaceC23123, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
        return C24247.$default$andThen(this, function);
    }

    @Override // l.InterfaceC21433, java.util.Map
    public /* synthetic */ Object get(Object obj) {
        return C11188.m28190(this, obj);
    }

    @Override // l.InterfaceC21433, java.util.Map
    public abstract /* synthetic */ int size();

    @Override // l.InterfaceC23123
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object mo11586() {
        return null;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        return mo19863(C8485.m22804(i));
    }

    @Override // l.InterfaceC23123
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object mo11584(char c, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // l.InterfaceC23123
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Object mo11585(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC21433, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo19857(((Character) obj).charValue());
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }
}
