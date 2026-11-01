package l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۧۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1C7F */
/* JADX INFO: loaded from: classes4.dex */
public class C10732 implements InterfaceC17081, Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C16376 f36578;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C10732 f36579 = this;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo33696andThen(Function function) {
        return C4277.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    @Deprecated
    public final Object apply(Object obj) {
        Object obj2;
        Character ch = (Character) obj;
        synchronized (this.f36579) {
            obj2 = this.f36578.get(ch);
        }
        return obj2;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        Object objM30216;
        Character ch = (Character) obj;
        synchronized (this.f36579) {
            objM30216 = C12143.m30216(this.f36578, ch, obj2);
        }
        return objM30216;
    }

    public C10732(C16376 c16376) {
        this.f36578 = c16376;
    }

    @Override // java.util.function.IntFunction
    @Deprecated
    public final Object apply(int i) {
        Object objApply;
        synchronized (this.f36579) {
            objApply = this.f36578.apply(i);
        }
        return objApply;
    }

    @Override // l.InterfaceC6456
    public final int size() {
        int i;
        synchronized (this.f36579) {
            i = this.f36578.f52700;
        }
        return i;
    }

    @Override // l.InterfaceC17081
    /* JADX INFO: renamed from: ۨ */
    public final Object mo7437() {
        synchronized (this.f36579) {
        }
        return null;
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }

    @Override // l.InterfaceC17081
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15965(char c) {
        boolean zMo15965;
        synchronized (this.f36579) {
            zMo15965 = this.f36578.mo15965(c);
        }
        return zMo15965;
    }

    @Override // l.InterfaceC6456
    @Deprecated
    public final boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.f36579) {
            zContainsKey = this.f36578.containsKey(obj);
        }
        return zContainsKey;
    }

    @Override // l.InterfaceC17081
    /* JADX INFO: renamed from: ۙ */
    public final Object mo7435(char c, Object obj) {
        Object objMo7435;
        synchronized (this.f36579) {
            objMo7435 = this.f36578.mo7435(c, obj);
        }
        return objMo7435;
    }

    @Override // l.InterfaceC17081
    /* JADX INFO: renamed from: ܰ */
    public final Object mo15966(char c) {
        Object objMo15966;
        synchronized (this.f36579) {
            objMo15966 = this.f36578.mo15966(c);
        }
        return objMo15966;
    }

    @Override // l.InterfaceC17081
    /* JADX INFO: renamed from: ۚ */
    public final Object mo7436(char c) {
        Object objMo7436;
        synchronized (this.f36579) {
            objMo7436 = this.f36578.mo7436(c);
        }
        return objMo7436;
    }

    public final void clear() {
        synchronized (this.f36579) {
            this.f36578.clear();
        }
    }

    @Override // l.InterfaceC6456
    @Deprecated
    public final Object get(Object obj) {
        Object objM30217;
        synchronized (this.f36579) {
            objM30217 = C12143.m30217(this.f36578, obj);
        }
        return objM30217;
    }

    @Deprecated
    public final Object remove(Object obj) {
        Object objM30218;
        synchronized (this.f36579) {
            objM30218 = C12143.m30218(this.f36578, obj);
        }
        return objM30218;
    }

    public int hashCode() {
        int iHashCode;
        synchronized (this.f36579) {
            iHashCode = this.f36578.hashCode();
        }
        return iHashCode;
    }

    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f36579) {
            zEquals = this.f36578.equals(obj);
        }
        return zEquals;
    }

    public final String toString() {
        String string;
        synchronized (this.f36579) {
            string = this.f36578.toString();
        }
        return string;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f36579) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
