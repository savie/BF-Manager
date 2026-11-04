package l;

/* JADX INFO: renamed from: l.᩺֡ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74H */
/* JADX INFO: loaded from: classes.dex */
public final class C23921 extends C14125 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f77435;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public long f77436;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f77437;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17953 f77438;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final int f77439;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23921(C17953 c17953, C17789 c17789, int i) {
        super(c17789, null, null);
        this.f77438 = c17953;
        this.f77439 = i;
        this.f77436 = -9223372036854775807L;
        this.f77435 = -1;
        this.f77437 = -1;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m53434(int i) {
        this.f77435 = i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m53435(int i) {
        this.f77437 = i;
    }

    @Override // l.C14125, l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public final void mo14382(long j) {
        this.f77436 = j;
    }

    @Override // l.C14125
    /* JADX INFO: renamed from: ᩷ */
    public final C15648 mo1260(C15648 c15648) {
        if (m34317() == null) {
            C17953.m41894(this.f77438, this, c15648);
        }
        return super.mo1260(c15648);
    }

    @Override // l.C14125, l.InterfaceC22024
    /* JADX INFO: renamed from: ۙ */
    public final void mo14383(long j, int i, int i2, int i3, C4870 c4870) {
        int i4 = i & (-536870913);
        C20782.m47568(this.f77435 != -1);
        int iM34312 = m34312();
        super.mo14383(j, i4, i2, i3, c4870);
        if (m34312() == iM34312 + 1) {
            int i5 = ((i & 1073741824) != 0 ? 2 : 0) | ((i & 1) != 0 ? 1 : 0);
            int i6 = this.f77437;
            C17953 c17953 = this.f77438;
            if (i6 != -1) {
                c17953.f58810.m47868(i5, this.f77437, j);
            }
            c17953.f58810.m47868(i5, this.f77435, j);
        }
    }

    public final String toString() {
        int i = this.f77435;
        int i2 = this.f77437;
        StringBuilder sbM5126 = C1402.m5126("trackId: ", this.f77439, ", mainTrackIndex: ", ", compatibilityTrackIndex: ", i);
        sbM5126.append(i2);
        return sbM5126.toString();
    }
}
