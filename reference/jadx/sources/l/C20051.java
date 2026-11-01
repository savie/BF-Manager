package l;

/* JADX INFO: renamed from: l.᩶۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: XEW */
/* JADX INFO: loaded from: classes5.dex */
public class C20051 extends AbstractC11167 implements Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    public final void clear() {
    }

    @Override // l.InterfaceC6456
    public final boolean containsKey(Object obj) {
        return false;
    }

    @Override // l.InterfaceC6456
    public final Object get(Object obj) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // l.AbstractC11167, l.InterfaceC6456
    public final int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    public Object clone() {
        return C0294.f1612;
    }

    public boolean equals(Object obj) {
        return (obj instanceof InterfaceC6456) && ((InterfaceC6456) obj).size() == 0;
    }

    private Object readResolve() {
        return C0294.f1612;
    }
}
