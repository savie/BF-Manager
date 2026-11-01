package l;

/* JADX INFO: renamed from: l.᩸ܶܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8SY */
/* JADX INFO: loaded from: classes5.dex */
public final class C21664 implements InterfaceC22155 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f70256;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f70257;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f70258;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f70259;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f70260;

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

    public C21664(long j, long j2, long j3, long j4, long j5) {
        this.f70259 = j;
        this.f70260 = j2;
        this.f70257 = j3;
        this.f70258 = j4;
        this.f70256 = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C21664.class == obj.getClass()) {
            C21664 c21664 = (C21664) obj;
            if (this.f70259 == c21664.f70259 && this.f70260 == c21664.f70260 && this.f70257 == c21664.f70257 && this.f70258 == c21664.f70258 && this.f70256 == c21664.f70256) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C23390.m51532(this.f70256) + ((C23390.m51532(this.f70258) + ((C23390.m51532(this.f70257) + ((C23390.m51532(this.f70260) + ((C23390.m51532(this.f70259) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f70259 + ", photoSize=" + this.f70260 + ", photoPresentationTimestampUs=" + this.f70257 + ", videoStartPosition=" + this.f70258 + ", videoSize=" + this.f70256;
    }
}
