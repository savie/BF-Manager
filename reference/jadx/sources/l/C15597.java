package l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳ᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: PHN */
/* JADX INFO: loaded from: classes5.dex */
public class C15597 implements InterfaceC23057, Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18383 f50697;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C15597 f50698 = this;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
        return C24247.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    @Deprecated
    public final Object apply(Object obj) {
        Object obj2;
        Integer num = (Integer) obj;
        synchronized (this.f50698) {
            obj2 = this.f50697.get(num);
        }
        return obj2;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        Object objM28072;
        Integer num = (Integer) obj;
        synchronized (this.f50698) {
            objM28072 = C11122.m28072(this.f50697, num, obj2);
        }
        return objM28072;
    }

    public C15597(C18383 c18383) {
        this.f50697 = c18383;
    }

    @Override // l.InterfaceC23057, java.util.function.IntFunction
    public final Object apply(int i) {
        Object obj;
        synchronized (this.f50698) {
            obj = this.f50697.get(i);
        }
        return obj;
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final int size() {
        int i;
        synchronized (this.f50698) {
            i = this.f50697.f59893;
        }
        return i;
    }

    @Override // l.InterfaceC23057
    /* JADX INFO: renamed from: ᩷ */
    public final Object mo18702() {
        synchronized (this.f50698) {
        }
        return null;
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }

    @Override // l.InterfaceC23057, l.InterfaceC11868
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13467(int i) {
        boolean zMo13467;
        synchronized (this.f50698) {
            zMo13467 = this.f50697.mo13467(i);
        }
        return zMo13467;
    }

    @Override // l.InterfaceC21433, java.util.Map
    @Deprecated
    public final boolean containsKey(Object obj) {
        boolean zM28073;
        synchronized (this.f50698) {
            zM28073 = C11122.m28073(this.f50697, obj);
        }
        return zM28073;
    }

    @Override // l.InterfaceC23057
    /* JADX INFO: renamed from: ۙ */
    public final Object mo13466(int i, Object obj) {
        Object objMo13466;
        synchronized (this.f50698) {
            objMo13466 = this.f50697.mo13466(i, obj);
        }
        return objMo13466;
    }

    @Override // l.InterfaceC23057
    public final Object get(int i) {
        Object obj;
        synchronized (this.f50698) {
            obj = this.f50697.get(i);
        }
        return obj;
    }

    @Override // l.InterfaceC23057
    public final Object remove(int i) {
        Object objRemove;
        synchronized (this.f50698) {
            objRemove = this.f50697.remove(i);
        }
        return objRemove;
    }

    public final void clear() {
        synchronized (this.f50698) {
            this.f50697.clear();
        }
    }

    @Override // l.InterfaceC21433, java.util.Map
    @Deprecated
    public final Object get(Object obj) {
        Object objM28075;
        synchronized (this.f50698) {
            objM28075 = C11122.m28075(this.f50697, obj);
        }
        return objM28075;
    }

    @Deprecated
    public final Object remove(Object obj) {
        Object objM28074;
        synchronized (this.f50698) {
            objM28074 = C11122.m28074(this.f50697, obj);
        }
        return objM28074;
    }

    public int hashCode() {
        int iHashCode;
        synchronized (this.f50698) {
            iHashCode = this.f50697.hashCode();
        }
        return iHashCode;
    }

    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f50698) {
            zEquals = this.f50697.equals(obj);
        }
        return zEquals;
    }

    public final String toString() {
        String string;
        synchronized (this.f50698) {
            string = this.f50697.toString();
        }
        return string;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f50698) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
