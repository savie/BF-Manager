package l;

/* JADX INFO: renamed from: l.ܺۡۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5RN */
/* JADX INFO: loaded from: classes5.dex */
public final class C16721 extends AbstractC16678 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C21943 f54011;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21943 f54012;

    public C16721(C21943 c21943, C21943 c21944, boolean z) {
        if (z) {
            mo17866(EnumC1763.SYNTHETIC);
        }
        this.f54012 = c21943;
        this.f54011 = c21944;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C21943 m39487() {
        return this.f54012;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C21943 m39488() {
        return this.f54011;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C16721.class == obj.getClass()) {
            C16721 c16721 = (C16721) obj;
            if (this.f54012.equals(c16721.f54012) && this.f54011.equals(c16721.f54011)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f54011.hashCode() * 31) + this.f54012.hashCode();
    }

    public final String toString() {
        return "Edge: " + this.f54012 + " -> " + this.f54011;
    }
}
