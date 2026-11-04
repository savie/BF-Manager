package l;

/* JADX INFO: renamed from: l.۬᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O8SY */
/* JADX INFO: loaded from: classes5.dex */
public final class C14213 implements InterfaceC8191 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f44923;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f44924;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f44925;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f44926;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f44927;

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

    public C14213(long j, long j2, long j3, long j4, long j5) {
        this.f44924 = j;
        this.f44926 = j2;
        this.f44923 = j3;
        this.f44925 = j4;
        this.f44927 = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14213.class == obj.getClass()) {
            C14213 c14213 = (C14213) obj;
            if (this.f44924 == c14213.f44924 && this.f44926 == c14213.f44926 && this.f44923 == c14213.f44923 && this.f44925 == c14213.f44925 && this.f44927 == c14213.f44927) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C19190.m44461(this.f44927) + ((C19190.m44461(this.f44925) + ((C19190.m44461(this.f44923) + ((C19190.m44461(this.f44926) + ((C19190.m44461(this.f44924) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f44924 + ", photoSize=" + this.f44926 + ", photoPresentationTimestampUs=" + this.f44923 + ", videoStartPosition=" + this.f44925 + ", videoSize=" + this.f44927;
    }
}
