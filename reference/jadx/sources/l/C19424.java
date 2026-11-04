package l;

/* JADX INFO: renamed from: l.ᩳ᩻ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5UB */
/* JADX INFO: loaded from: classes5.dex */
public class C19424 implements InterfaceC14948, InterfaceC23505 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float f62763;

    @Override // l.InterfaceC16791
    /* JADX INFO: renamed from: ܽ */
    public final int mo5414() {
        return 16;
    }

    public C19424(float f) {
        this.f62763 = f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC16791 interfaceC16791 = (InterfaceC16791) obj;
        int iCompare = Integer.compare(16, interfaceC16791.mo5414());
        if (iCompare != 0) {
            return iCompare;
        }
        return Float.compare(this.f62763, ((InterfaceC23505) interfaceC16791).getValue());
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof InterfaceC23505) && Float.floatToRawIntBits(this.f62763) == Float.floatToRawIntBits(((InterfaceC23505) obj).getValue());
    }

    @Override // l.InterfaceC23505
    public final float getValue() {
        return this.f62763;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f62763);
    }
}
