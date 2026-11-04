package l;

/* JADX INFO: renamed from: l.۫ۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8U7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12908 implements InterfaceC8191 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float f41281;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float f41282;

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C15648 mo12245() {
        return null;
    }

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo12246(C18632 c18632) {
    }

    @Override // l.InterfaceC8191
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ byte[] mo12247() {
        return null;
    }

    public C12908(float f, float f2) {
        C20782.m47564("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f);
        this.f41281 = f;
        this.f41282 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12908.class == obj.getClass()) {
            C12908 c12908 = (C12908) obj;
            if (this.f41281 == c12908.f41281 && this.f41282 == c12908.f41282) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f41282) + ((Float.floatToIntBits(this.f41281) + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f41281 + ", longitude=" + this.f41282;
    }
}
