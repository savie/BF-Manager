package l;

/* JADX INFO: renamed from: l.۬ۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XEW */
/* JADX INFO: loaded from: classes4.dex */
public class C13754 extends AbstractC15006 implements Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    public final void clear() {
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final boolean containsKey(Object obj) {
        return false;
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final Object get(Object obj) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // l.AbstractC15006, l.InterfaceC21433, java.util.Map
    public final int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    public Object clone() {
        return C4610.f16345;
    }

    public boolean equals(Object obj) {
        return (obj instanceof InterfaceC21433) && ((InterfaceC21433) obj).size() == 0;
    }

    private Object readResolve() {
        return C4610.f16345;
    }
}
