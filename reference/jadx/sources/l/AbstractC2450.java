package l;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۖۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1DZ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2450 implements InterfaceC17081, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo33696andThen(Function function) {
        return C4277.$default$andThen(this, function);
    }

    @Override // l.InterfaceC6456
    public /* synthetic */ Object get(Object obj) {
        return C12143.m30217(this, obj);
    }

    @Override // l.InterfaceC6456
    public abstract /* synthetic */ int size();

    @Override // l.InterfaceC17081
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Object mo7437() {
        return null;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        return mo15966(C21273.m47738(i));
    }

    @Override // l.InterfaceC17081
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object mo7435(char c, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // l.InterfaceC17081
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Object mo7436(char c) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC6456
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo15965(((Character) obj).charValue());
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }
}
