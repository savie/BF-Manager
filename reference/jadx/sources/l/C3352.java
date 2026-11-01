package l;

/* JADX INFO: renamed from: l.ۗܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74H */
/* JADX INFO: loaded from: classes3.dex */
public final class C3352 extends C18033 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final int f12398;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f12399;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f12400;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public long f12401;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2522 f12402;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3352(C2522 c2522, C5853 c5853, int i) {
        super(c5853, null, null);
        this.f12402 = c2522;
        this.f12398 = i;
        this.f12401 = -9223372036854775807L;
        this.f12400 = -1;
        this.f12399 = -1;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m9993(int i) {
        this.f12400 = i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m9992(int i) {
        this.f12399 = i;
    }

    @Override // l.C18033, l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public final void mo8113(long j) {
        this.f12401 = j;
    }

    @Override // l.C18033
    /* JADX INFO: renamed from: ܰ */
    public final C7648 mo6827(C7648 c7648) {
        if (m41993() == null) {
            C2522.m7881(this.f12402, this, c7648);
        }
        return super.mo6827(c7648);
    }

    @Override // l.C18033, l.InterfaceC8011
    /* JADX INFO: renamed from: ۙ */
    public final void mo8114(long j, int i, int i2, int i3, C18594 c18594) {
        int i4 = i & (-536870913);
        C2023.m6510(this.f12400 != -1);
        int iM42009 = m42009();
        super.mo8114(j, i4, i2, i3, c18594);
        if (m42009() == iM42009 + 1) {
            int i5 = ((i & 1073741824) != 0 ? 2 : 0) | ((i & 1) != 0 ? 1 : 0);
            int i6 = this.f12399;
            C2522 c2522 = this.f12402;
            if (i6 != -1) {
                c2522.f10017.m29204(i5, this.f12399, j);
            }
            c2522.f10017.m29204(i5, this.f12400, j);
        }
    }

    public final String toString() {
        int i = this.f12400;
        int i2 = this.f12399;
        StringBuilder sbM2791 = C0589.m2791("trackId: ", this.f12398, ", mainTrackIndex: ", ", compatibilityTrackIndex: ", i);
        sbM2791.append(i2);
        return sbM2791.toString();
    }
}
