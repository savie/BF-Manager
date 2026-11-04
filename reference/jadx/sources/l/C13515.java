package l;

/* JADX INFO: renamed from: l.۬֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: RC4X */
/* JADX INFO: loaded from: classes4.dex */
public class C13515 extends AbstractC22466 implements Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    public final void clear() {
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final boolean containsKey(Object obj) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    @Override // l.AbstractC22466, l.InterfaceC21433, java.util.Map
    public final int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    @Override // l.InterfaceC6804
    /* JADX INFO: renamed from: ᩷ */
    public final int mo7848(Object obj) {
        return 0;
    }

    public Object clone() {
        return C4806.f16827;
    }

    public boolean equals(Object obj) {
        return (obj instanceof InterfaceC21433) && ((InterfaceC21433) obj).size() == 0;
    }

    private Object readResolve() {
        return C4806.f16827;
    }
}
