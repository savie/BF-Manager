package l;

/* JADX INFO: renamed from: l.᩶ۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8OY */
/* JADX INFO: loaded from: classes5.dex */
public final class C20101 implements InterfaceC22155 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f65284;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f65285;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f65286;

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

    public C20101(long j, long j2, long j3) {
        this.f65284 = j;
        this.f65286 = j2;
        this.f65285 = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20101)) {
            return false;
        }
        C20101 c20101 = (C20101) obj;
        return this.f65284 == c20101.f65284 && this.f65286 == c20101.f65286 && this.f65285 == c20101.f65285;
    }

    public final int hashCode() {
        return C23390.m51532(this.f65285) + ((C23390.m51532(this.f65286) + ((C23390.m51532(this.f65284) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f65284 + ", modification time=" + this.f65286 + ", timescale=" + this.f65285;
    }
}
