package l;

/* JADX INFO: renamed from: l.᩶ܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC20226 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC12465 f65642;

    public RunnableC20226(ServiceC12465 serviceC12465) {
        this.f65642 = serviceC12465;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        ServiceC12465 serviceC12465 = this.f65642;
        serviceC12465.f41571.getLocationOnScreen(iArr);
        if (iArr[0] == 0 && iArr[1] == 0) {
            C16737.m39274(this, 50L);
            return;
        }
        int[] iArr2 = new int[2];
        serviceC12465.f41571.m19519(iArr2);
        serviceC12465.f41563.left = iArr[0] - iArr2[0];
        serviceC12465.f41563.top = iArr[1] - iArr2[1];
        serviceC12465.f41563.right = serviceC12465.f41563.left + serviceC12465.f41559.x;
        serviceC12465.f41563.bottom = serviceC12465.f41563.top + serviceC12465.f41559.y;
        serviceC12465.m30947((serviceC12465.f41571.getWidth() / 2) + iArr[0], (serviceC12465.f41571.getHeight() / 2) + iArr[1]);
        serviceC12465.f41567.m19514();
        serviceC12465.f41571.m19518((C19520) null);
    }
}
