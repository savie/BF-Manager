package l;

/* JADX INFO: renamed from: l.ۛۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QN */
/* JADX INFO: loaded from: classes2.dex */
public final class C5962 implements Comparable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Object f20315;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C0296 f20316;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C14430.f47309.info("Invalid key for map field.");
        return -1;
    }

    public C5962(C19741 c19741, Object obj) {
        if (obj instanceof C0296) {
            this.f20316 = (C0296) obj;
        } else {
            this.f20315 = obj;
        }
        ((C19741) c19741.m44907().getFields().get(0)).m44913();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m16250() {
        C0296 c0296 = this.f20316;
        return c0296 != null ? c0296 : this.f20315;
    }
}
