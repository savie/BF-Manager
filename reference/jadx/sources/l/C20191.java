package l;

/* JADX INFO: renamed from: l.᩵֡ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8KR */
/* JADX INFO: loaded from: classes5.dex */
public final class C20191 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f64819;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float f64820;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f64821;

    public C20191(C3037 c3037) {
        this.f64821 = c3037.f9843;
        this.f64820 = c3037.f9842;
        this.f64819 = c3037.f9841;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3037 m46433() {
        return new C3037(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20191)) {
            return false;
        }
        C20191 c20191 = (C20191) obj;
        return this.f64821 == c20191.f64821 && this.f64820 == c20191.f64820 && this.f64819 == c20191.f64819;
    }

    public final int hashCode() {
        return C17359.hash(Long.valueOf(this.f64821), Float.valueOf(this.f64820), Long.valueOf(this.f64819));
    }
}
