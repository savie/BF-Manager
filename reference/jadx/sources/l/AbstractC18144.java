package l;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܿۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 4CC0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18144 implements InterfaceC3007, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // l.InterfaceC3007, l.InterfaceC21433, java.util.Map
    public /* synthetic */ Float get(Object obj) {
        return C9718.m25305(this, obj);
    }

    @Override // l.InterfaceC3007
    /* JADX INFO: renamed from: ᩷ */
    public float mo9816() {
        return 0.0f;
    }

    @Override // l.InterfaceC21433, java.util.Map
    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return get(obj);
    }

    @Override // java.util.function.IntToDoubleFunction
    public final double applyAsDouble(int i) {
        return get(i);
    }

    @Override // l.InterfaceC3007
    /* JADX INFO: renamed from: ۙ */
    public float mo9814(float f, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // l.InterfaceC3007
    public float remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC21433, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo9815(((Integer) obj).intValue());
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
