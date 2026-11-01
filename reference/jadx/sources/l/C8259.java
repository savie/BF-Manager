package l;

/* JADX INFO: renamed from: l.۠ܶܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8ON */
/* JADX INFO: loaded from: classes3.dex */
public final class C8259 implements InterfaceC22155 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float f28718;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f28719;

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

    public C8259(float f, int i) {
        this.f28718 = f;
        this.f28719 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8259.class == obj.getClass()) {
            C8259 c8259 = (C8259) obj;
            if (this.f28718 == c8259.f28718 && this.f28719 == c8259.f28719) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f28718) + 527) * 31) + this.f28719;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f28718 + ", svcTemporalLayerCount=" + this.f28719;
    }
}
