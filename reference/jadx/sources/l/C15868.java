package l;

/* JADX INFO: renamed from: l.ܺۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8U7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15868 implements InterfaceC22155 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float f51346;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float f51347;

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C7648 mo3145() {
        return null;
    }

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo3146(C2398 c2398) {
    }

    @Override // l.InterfaceC22155
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ byte[] mo3147() {
        return null;
    }

    public C15868(float f, float f2) {
        C2023.m6506("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f);
        this.f51346 = f;
        this.f51347 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15868.class == obj.getClass()) {
            C15868 c15868 = (C15868) obj;
            if (this.f51346 == c15868.f51346 && this.f51347 == c15868.f51347) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f51347) + ((Float.floatToIntBits(this.f51346) + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f51346 + ", longitude=" + this.f51347;
    }
}
