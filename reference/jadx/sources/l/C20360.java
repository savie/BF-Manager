package l;

/* JADX INFO: renamed from: l.᩶ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: RC4X */
/* JADX INFO: loaded from: classes5.dex */
public class C20360 extends AbstractC17516 implements Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    public final void clear() {
    }

    @Override // l.InterfaceC6456
    public final boolean containsKey(Object obj) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    @Override // l.AbstractC17516, l.InterfaceC6456
    public final int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    @Override // l.InterfaceC16127
    /* JADX INFO: renamed from: ܰ */
    public final int mo18022(Object obj) {
        return 0;
    }

    public Object clone() {
        return C0603.f2618;
    }

    public boolean equals(Object obj) {
        return (obj instanceof InterfaceC6456) && ((InterfaceC6456) obj).size() == 0;
    }

    private Object readResolve() {
        return C0603.f2618;
    }
}
