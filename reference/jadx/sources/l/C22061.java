package l;

/* JADX INFO: renamed from: l.᩹ۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: YATV */
/* JADX INFO: loaded from: classes.dex */
public final class C22061 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public transient String f71484;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f71485;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C22061 f71486;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object f71487;

    public C22061(C22061 c22061, Object obj, Object obj2) {
        this.f71486 = c22061;
        this.f71487 = obj;
        this.f71485 = obj2;
    }

    public final String toString() {
        if (this.f71484 == null) {
            C22061 c22061 = this.f71486;
            if (c22061 == null) {
                this.f71484 = "$";
            } else {
                Object obj = this.f71485;
                if (obj instanceof Integer) {
                    this.f71484 = c22061.toString() + "[" + obj + "]";
                } else {
                    this.f71484 = c22061.toString() + "." + obj;
                }
            }
        }
        return this.f71484;
    }
}
