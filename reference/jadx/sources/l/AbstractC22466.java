package l;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩸֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J1LO */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC22466 implements InterfaceC6804, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C24247.$default$compose(this, function);
    }

    @Override // l.InterfaceC6804, l.InterfaceC21433, java.util.Map
    public /* synthetic */ Integer get(Object obj) {
        return C8295.m22386(this, obj);
    }

    @Override // l.InterfaceC21433, java.util.Map
    public abstract /* synthetic */ int size();

    @Override // l.InterfaceC21433, java.util.Map
    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return get(obj);
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        return mo7848(obj);
    }

    @Override // l.InterfaceC6804
    /* JADX INFO: renamed from: ۙ */
    public int mo7845(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // l.InterfaceC6804
    /* JADX INFO: renamed from: ۙ */
    public int mo7846(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final Function mo10608andThen(Function function) {
        throw new NoSuchMethodError();
    }
}
