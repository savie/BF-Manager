package l;

/* JADX INFO: renamed from: l.ܳ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: YATV */
/* JADX INFO: loaded from: classes4.dex */
public final class C15657 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f50880;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15657 f50881;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object f50882;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient String f50883;

    public C15657(C15657 c15657, Object obj, Object obj2) {
        this.f50881 = c15657;
        this.f50882 = obj;
        this.f50880 = obj2;
    }

    public final String toString() {
        if (this.f50883 == null) {
            C15657 c15657 = this.f50881;
            if (c15657 == null) {
                this.f50883 = "$";
            } else {
                Object obj = this.f50880;
                if (obj instanceof Integer) {
                    this.f50883 = c15657.toString() + "[" + obj + "]";
                } else {
                    this.f50883 = c15657.toString() + "." + obj;
                }
            }
        }
        return this.f50883;
    }
}
