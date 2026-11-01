package l;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩸ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4CC0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21378 implements InterfaceC7765, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // l.InterfaceC7765, l.InterfaceC6456
    public /* synthetic */ Float get(Object obj) {
        return C10588.m26763(this, obj);
    }

    @Override // l.InterfaceC7765
    /* JADX INFO: renamed from: ۨ */
    public float mo20437() {
        return 0.0f;
    }

    @Override // l.InterfaceC6456
    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return get(obj);
    }

    @Override // java.util.function.IntToDoubleFunction
    public final double applyAsDouble(int i) {
        return get(i);
    }

    @Override // l.InterfaceC7765
    /* JADX INFO: renamed from: ۙ */
    public float mo10711(float f, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
    }

    @Override // l.InterfaceC7765
    public float remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC6456
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo10713(((Integer) obj).intValue());
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
