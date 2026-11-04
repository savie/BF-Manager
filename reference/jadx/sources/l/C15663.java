package l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 1C7F */
/* JADX INFO: loaded from: classes5.dex */
public class C15663 implements InterfaceC23123, Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22377 f50928;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C15663 f50929 = this;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
        return C24247.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    @Deprecated
    public final Object apply(Object obj) {
        Object obj2;
        Character ch = (Character) obj;
        synchronized (this.f50929) {
            obj2 = this.f50928.get(ch);
        }
        return obj2;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        Object objM28189;
        Character ch = (Character) obj;
        synchronized (this.f50929) {
            objM28189 = C11188.m28189(this.f50928, ch, obj2);
        }
        return objM28189;
    }

    public C15663(C22377 c22377) {
        this.f50928 = c22377;
    }

    @Override // java.util.function.IntFunction
    @Deprecated
    public final Object apply(int i) {
        Object objApply;
        synchronized (this.f50929) {
            objApply = this.f50928.apply(i);
        }
        return objApply;
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final int size() {
        int i;
        synchronized (this.f50929) {
            i = this.f50928.f72458;
        }
        return i;
    }

    @Override // l.InterfaceC23123
    /* JADX INFO: renamed from: ᩷ */
    public final Object mo11586() {
        synchronized (this.f50929) {
        }
        return null;
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }

    @Override // l.InterfaceC23123
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19857(char c) {
        boolean zMo19857;
        synchronized (this.f50929) {
            zMo19857 = this.f50928.mo19857(c);
        }
        return zMo19857;
    }

    @Override // l.InterfaceC21433, java.util.Map
    @Deprecated
    public final boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.f50929) {
            zContainsKey = this.f50928.containsKey(obj);
        }
        return zContainsKey;
    }

    @Override // l.InterfaceC23123
    /* JADX INFO: renamed from: ۙ */
    public final Object mo11584(char c, Object obj) {
        Object objMo11584;
        synchronized (this.f50929) {
            objMo11584 = this.f50928.mo11584(c, obj);
        }
        return objMo11584;
    }

    @Override // l.InterfaceC23123
    /* JADX INFO: renamed from: ᩷ */
    public final Object mo19863(char c) {
        Object objMo19863;
        synchronized (this.f50929) {
            objMo19863 = this.f50928.mo19863(c);
        }
        return objMo19863;
    }

    @Override // l.InterfaceC23123
    /* JADX INFO: renamed from: ᩴ */
    public final Object mo11585(char c) {
        Object objMo11585;
        synchronized (this.f50929) {
            objMo11585 = this.f50928.mo11585(c);
        }
        return objMo11585;
    }

    public final void clear() {
        synchronized (this.f50929) {
            this.f50928.clear();
        }
    }

    @Override // l.InterfaceC21433, java.util.Map
    @Deprecated
    public final Object get(Object obj) {
        Object objM28190;
        synchronized (this.f50929) {
            objM28190 = C11188.m28190(this.f50928, obj);
        }
        return objM28190;
    }

    @Deprecated
    public final Object remove(Object obj) {
        Object objM28191;
        synchronized (this.f50929) {
            objM28191 = C11188.m28191(this.f50928, obj);
        }
        return objM28191;
    }

    public int hashCode() {
        int iHashCode;
        synchronized (this.f50929) {
            iHashCode = this.f50928.hashCode();
        }
        return iHashCode;
    }

    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f50929) {
            zEquals = this.f50928.equals(obj);
        }
        return zEquals;
    }

    public final String toString() {
        String string;
        synchronized (this.f50929) {
            string = this.f50928.toString();
        }
        return string;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f50929) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
