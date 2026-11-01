package l;

/* JADX INFO: renamed from: l.ۡۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4N1 */
/* JADX INFO: loaded from: classes3.dex */
public class C8679 implements InterfaceC14551 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f29881;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f29882;

    public C8679(int i, Object obj) {
        this.f29881 = i;
        this.f29882 = obj;
    }

    @Override // l.InterfaceC14551
    /* JADX INFO: renamed from: ۙ */
    public final int mo17726() {
        return this.f29881;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f29882;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return Integer.valueOf(mo17726());
    }
}
