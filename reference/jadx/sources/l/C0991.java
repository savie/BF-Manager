package l;

/* JADX INFO: renamed from: l.֨ۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 4N1 */
/* JADX INFO: loaded from: classes3.dex */
public class C0991 implements InterfaceC5903 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f3592;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f3593;

    public C0991(int i, Object obj) {
        this.f3592 = i;
        this.f3593 = obj;
    }

    @Override // l.InterfaceC5903
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo3870() {
        return this.f3592;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3593;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return Integer.valueOf(mo3870());
    }
}
