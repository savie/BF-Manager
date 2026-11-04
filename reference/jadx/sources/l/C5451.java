package l;

/* JADX INFO: renamed from: l.ۚۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8OY */
/* JADX INFO: loaded from: classes3.dex */
public final class C5451 implements InterfaceC8191 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f19039;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f19040;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f19041;

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

    public C5451(long j, long j2, long j3) {
        this.f19039 = j;
        this.f19041 = j2;
        this.f19040 = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5451)) {
            return false;
        }
        C5451 c5451 = (C5451) obj;
        return this.f19039 == c5451.f19039 && this.f19041 == c5451.f19041 && this.f19040 == c5451.f19040;
    }

    public final int hashCode() {
        return C19190.m44461(this.f19040) + ((C19190.m44461(this.f19041) + ((C19190.m44461(this.f19039) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f19039 + ", modification time=" + this.f19041 + ", timescale=" + this.f19040;
    }
}
