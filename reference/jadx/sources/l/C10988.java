package l;

/* JADX INFO: renamed from: l.ۤܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R8ON */
/* JADX INFO: loaded from: classes4.dex */
public final class C10988 implements InterfaceC8191 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float f34734;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f34735;

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

    public C10988(float f, int i) {
        this.f34734 = f;
        this.f34735 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C10988.class == obj.getClass()) {
            C10988 c10988 = (C10988) obj;
            if (this.f34734 == c10988.f34734 && this.f34735 == c10988.f34735) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f34734) + 527) * 31) + this.f34735;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f34734 + ", svcTemporalLayerCount=" + this.f34735;
    }
}
