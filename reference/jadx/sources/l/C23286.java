package l;

/* JADX INFO: renamed from: l.᩺᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBEJ */
/* JADX INFO: loaded from: classes.dex */
public final class C23286 extends C7078 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75529;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f75530;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75531;

    @Override // l.InterfaceC23307
    /* JADX INFO: renamed from: ۙ */
    public final void mo8605(C9196 c9196) {
        if (c9196.m37181().m31572() == 3) {
            int iMo21658 = ((C21665) c9196.m50100()).mo21658();
            boolean[] zArr = this.f75530;
            zArr[0] = zArr[0] && (this.f75529 - this.f75531) + iMo21658 == c9196.m37185().m38400();
        }
    }

    public C23286(boolean[] zArr, int i, int i2) {
        this.f75530 = zArr;
        this.f75529 = i;
        this.f75531 = i2;
    }
}
