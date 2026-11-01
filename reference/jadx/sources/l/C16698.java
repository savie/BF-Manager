package l;

import android.graphics.Point;

/* JADX INFO: renamed from: l.ܽܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16698 implements InterfaceC8724 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC12465 f53491;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Point f53492;

    public C16698(ServiceC12465 serviceC12465, Point point) {
        this.f53491 = serviceC12465;
        this.f53492 = point;
    }

    @Override // l.InterfaceC8724
    /* JADX INFO: renamed from: ۙ */
    public final void mo2338() {
        ServiceC12465 serviceC12465 = this.f53491;
        int i = serviceC12465.f41569;
        Point point = this.f53492;
        point.x = i;
        point.y = serviceC12465.f41558;
    }
}
