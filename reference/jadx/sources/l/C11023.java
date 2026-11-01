package l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۧ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: PHN */
/* JADX INFO: loaded from: classes4.dex */
public class C11023 implements InterfaceC17372, Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C21605 f37473;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11023 f37474 = this;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo33696andThen(Function function) {
        return C4277.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    @Deprecated
    public final Object apply(Object obj) {
        Object obj2;
        Integer num = (Integer) obj;
        synchronized (this.f37474) {
            obj2 = this.f37473.get(num);
        }
        return obj2;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        Object objM30905;
        Integer num = (Integer) obj;
        synchronized (this.f37474) {
            objM30905 = C12434.m30905(this.f37473, num, obj2);
        }
        return objM30905;
    }

    public C11023(C21605 c21605) {
        this.f37473 = c21605;
    }

    @Override // l.InterfaceC17372, java.util.function.IntFunction
    public final Object apply(int i) {
        Object obj;
        synchronized (this.f37474) {
            obj = this.f37473.get(i);
        }
        return obj;
    }

    @Override // l.InterfaceC6456
    public final int size() {
        int i;
        synchronized (this.f37474) {
            i = this.f37473.f70078;
        }
        return i;
    }

    @Override // l.InterfaceC17372
    /* JADX INFO: renamed from: ۨ */
    public final Object mo10756() {
        synchronized (this.f37474) {
        }
        return null;
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }

    @Override // l.InterfaceC17372, l.InterfaceC9612
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8945(int i) {
        boolean zMo8945;
        synchronized (this.f37474) {
            zMo8945 = this.f37473.mo8945(i);
        }
        return zMo8945;
    }

    @Override // l.InterfaceC6456
    @Deprecated
    public final boolean containsKey(Object obj) {
        boolean zM30906;
        synchronized (this.f37474) {
            zM30906 = C12434.m30906(this.f37473, obj);
        }
        return zM30906;
    }

    @Override // l.InterfaceC17372
    /* JADX INFO: renamed from: ۙ */
    public final Object mo8944(int i, Object obj) {
        Object objMo8944;
        synchronized (this.f37474) {
            objMo8944 = this.f37473.mo8944(i, obj);
        }
        return objMo8944;
    }

    @Override // l.InterfaceC17372
    public final Object get(int i) {
        Object obj;
        synchronized (this.f37474) {
            obj = this.f37473.get(i);
        }
        return obj;
    }

    @Override // l.InterfaceC17372
    public final Object remove(int i) {
        Object objRemove;
        synchronized (this.f37474) {
            objRemove = this.f37473.remove(i);
        }
        return objRemove;
    }

    public final void clear() {
        synchronized (this.f37474) {
            this.f37473.clear();
        }
    }

    @Override // l.InterfaceC6456
    @Deprecated
    public final Object get(Object obj) {
        Object objM30908;
        synchronized (this.f37474) {
            objM30908 = C12434.m30908(this.f37473, obj);
        }
        return objM30908;
    }

    @Deprecated
    public final Object remove(Object obj) {
        Object objM30907;
        synchronized (this.f37474) {
            objM30907 = C12434.m30907(this.f37473, obj);
        }
        return objM30907;
    }

    public int hashCode() {
        int iHashCode;
        synchronized (this.f37474) {
            iHashCode = this.f37473.hashCode();
        }
        return iHashCode;
    }

    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f37474) {
            zEquals = this.f37473.equals(obj);
        }
        return zEquals;
    }

    public final String toString() {
        String string;
        synchronized (this.f37474) {
            string = this.f37473.toString();
        }
        return string;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f37474) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
