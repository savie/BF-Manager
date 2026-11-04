package l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۜ᩺᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: IF3 */
/* JADX INFO: loaded from: classes4.dex */
public class C7482 implements InterfaceC3007, Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C24046 f24755;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7482 f24756 = this;

    @Override // java.util.function.Function
    @Deprecated
    public final Object apply(Object obj) {
        Float f;
        Integer num = (Integer) obj;
        synchronized (this.f24756) {
            f = (Float) this.f24755.get((Object) num);
        }
        return f;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        Float fM25304;
        Integer num = (Integer) obj;
        Float f = (Float) obj2;
        synchronized (this.f24756) {
            fM25304 = C9718.m25304(this.f24755, num, f);
        }
        return fM25304;
    }

    public C7482(C24046 c24046) {
        this.f24755 = c24046;
    }

    @Override // java.util.function.IntToDoubleFunction
    public final double applyAsDouble(int i) {
        double d;
        synchronized (this.f24756) {
            d = this.f24755.get(i);
        }
        return d;
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final int size() {
        int i;
        synchronized (this.f24756) {
            i = this.f24755.f77778;
        }
        return i;
    }

    @Override // l.InterfaceC3007
    /* JADX INFO: renamed from: ᩷ */
    public final float mo9816() {
        synchronized (this.f24756) {
        }
        return 0.0f;
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

    @Override // l.InterfaceC3007
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9815(int i) {
        boolean zMo9815;
        synchronized (this.f24756) {
            zMo9815 = this.f24755.mo9815(i);
        }
        return zMo9815;
    }

    @Override // l.InterfaceC21433, java.util.Map
    @Deprecated
    public final boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.f24756) {
            zContainsKey = this.f24755.containsKey(obj);
        }
        return zContainsKey;
    }

    @Override // l.InterfaceC3007
    /* JADX INFO: renamed from: ۙ */
    public final float mo9814(float f, int i) {
        float fMo9814;
        synchronized (this.f24756) {
            fMo9814 = this.f24755.mo9814(f, i);
        }
        return fMo9814;
    }

    @Override // l.InterfaceC3007
    public final float get(int i) {
        float f;
        synchronized (this.f24756) {
            f = this.f24755.get(i);
        }
        return f;
    }

    @Override // l.InterfaceC3007
    public final float remove(int i) {
        float fRemove;
        synchronized (this.f24756) {
            fRemove = this.f24755.remove(i);
        }
        return fRemove;
    }

    public final void clear() {
        synchronized (this.f24756) {
            this.f24755.clear();
        }
    }

    @Override // l.InterfaceC21433, java.util.Map
    @Deprecated
    public final Float get(Object obj) {
        Float fM25305;
        synchronized (this.f24756) {
            fM25305 = C9718.m25305(this.f24755, obj);
        }
        return fM25305;
    }

    @Deprecated
    public final Object remove(Object obj) {
        Float fM25306;
        synchronized (this.f24756) {
            fM25306 = C9718.m25306(this.f24755, obj);
        }
        return fM25306;
    }

    public int hashCode() {
        int iHashCode;
        synchronized (this.f24756) {
            iHashCode = this.f24755.hashCode();
        }
        return iHashCode;
    }

    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f24756) {
            zEquals = this.f24755.equals(obj);
        }
        return zEquals;
    }

    public final String toString() {
        String string;
        synchronized (this.f24756) {
            string = this.f24755.toString();
        }
        return string;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f24756) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
