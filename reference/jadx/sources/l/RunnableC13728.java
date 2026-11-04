package l;

/* JADX INFO: renamed from: l.۬۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC13728 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC10702 f43580;

    public RunnableC13728(ServiceC10702 serviceC10702) {
        this.f43580 = serviceC10702;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        ServiceC10702 serviceC10702 = this.f43580;
        serviceC10702.f33976.getLocationOnScreen(iArr);
        if (iArr[0] == 0 && iArr[1] == 0) {
            C21576.m49069(this, 50L);
            return;
        }
        int[] iArr2 = new int[2];
        serviceC10702.f33976.m38586(iArr2);
        serviceC10702.f33984.left = iArr[0] - iArr2[0];
        serviceC10702.f33984.top = iArr[1] - iArr2[1];
        serviceC10702.f33984.right = serviceC10702.f33984.left + serviceC10702.f33993.x;
        serviceC10702.f33984.bottom = serviceC10702.f33984.top + serviceC10702.f33993.y;
        serviceC10702.m27271((serviceC10702.f33976.getWidth() / 2) + iArr[0], (serviceC10702.f33976.getHeight() / 2) + iArr[1]);
        serviceC10702.f33981.mo38581();
        serviceC10702.f33976.m38583((C9999) null);
    }
}
