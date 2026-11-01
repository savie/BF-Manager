package l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܺ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: IF3 */
/* JADX INFO: loaded from: classes5.dex */
public class C16232 implements InterfaceC7765, Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C3614 f52361;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C16232 f52362 = this;

    @Override // java.util.function.Function
    @Deprecated
    public final Object apply(Object obj) {
        Float f;
        Integer num = (Integer) obj;
        synchronized (this.f52362) {
            f = (Float) this.f52361.get((Object) num);
        }
        return f;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        Float fM26762;
        Integer num = (Integer) obj;
        Float f = (Float) obj2;
        synchronized (this.f52362) {
            fM26762 = C10588.m26762(this.f52361, num, f);
        }
        return fM26762;
    }

    public C16232(C3614 c3614) {
        this.f52361 = c3614;
    }

    @Override // java.util.function.IntToDoubleFunction
    public final double applyAsDouble(int i) {
        double d;
        synchronized (this.f52362) {
            d = this.f52361.get(i);
        }
        return d;
    }

    @Override // l.InterfaceC6456
    public final int size() {
        int i;
        synchronized (this.f52362) {
            i = this.f52361.f13294;
        }
        return i;
    }

    @Override // l.InterfaceC7765
    /* JADX INFO: renamed from: ۨ */
    public final float mo20437() {
        synchronized (this.f52362) {
        }
        return 0.0f;
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

    @Override // l.InterfaceC7765
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo10713(int i) {
        boolean zMo10713;
        synchronized (this.f52362) {
            zMo10713 = this.f52361.mo10713(i);
        }
        return zMo10713;
    }

    @Override // l.InterfaceC6456
    @Deprecated
    public final boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.f52362) {
            zContainsKey = this.f52361.containsKey(obj);
        }
        return zContainsKey;
    }

    @Override // l.InterfaceC7765
    /* JADX INFO: renamed from: ۙ */
    public final float mo10711(float f, int i) {
        float fMo10711;
        synchronized (this.f52362) {
            fMo10711 = this.f52361.mo10711(f, i);
        }
        return fMo10711;
    }

    @Override // l.InterfaceC7765
    public final float get(int i) {
        float f;
        synchronized (this.f52362) {
            f = this.f52361.get(i);
        }
        return f;
    }

    @Override // l.InterfaceC7765
    public final float remove(int i) {
        float fRemove;
        synchronized (this.f52362) {
            fRemove = this.f52361.remove(i);
        }
        return fRemove;
    }

    public final void clear() {
        synchronized (this.f52362) {
            this.f52361.clear();
        }
    }

    @Override // l.InterfaceC6456
    @Deprecated
    public final Float get(Object obj) {
        Float fM26763;
        synchronized (this.f52362) {
            fM26763 = C10588.m26763(this.f52361, obj);
        }
        return fM26763;
    }

    @Deprecated
    public final Object remove(Object obj) {
        Float fM26764;
        synchronized (this.f52362) {
            fM26764 = C10588.m26764(this.f52361, obj);
        }
        return fM26764;
    }

    public int hashCode() {
        int iHashCode;
        synchronized (this.f52362) {
            iHashCode = this.f52361.hashCode();
        }
        return iHashCode;
    }

    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f52362) {
            zEquals = this.f52361.equals(obj);
        }
        return zEquals;
    }

    public final String toString() {
        String string;
        synchronized (this.f52362) {
            string = this.f52361.toString();
        }
        return string;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f52362) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
