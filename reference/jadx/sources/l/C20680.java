package l;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: renamed from: l.᩷ۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes5.dex */
public final class C20680 implements InterfaceC18708 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3040 f67267;

    public C20680(C3040 c3040) {
        this.f67267 = c3040;
    }

    @Override // l.InterfaceC18708
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo19410() {
        C3040 c3040 = this.f67267;
        return !c3040.f11371 || c3040.f11381.m16926();
    }

    @Override // l.InterfaceC18708
    /* JADX INFO: renamed from: ۙ */
    public final void mo19404() {
        C3040 c3040 = this.f67267;
        if (c3040.f11371) {
            c3040.f11381.invalidate();
        }
    }

    @Override // l.InterfaceC18708
    /* JADX INFO: renamed from: ۨ */
    public final void mo19409() {
        C5863 c5863 = this.f67267.f11365;
        c5863.f20014 = false;
        c5863.f20009 = null;
        c5863.f20016 = null;
        c5863.f20015 = null;
        c5863.f20013 = null;
        c5863.f20012.clear();
    }

    @Override // l.InterfaceC18708
    /* JADX INFO: renamed from: ۙ */
    public final void mo19408(boolean z) {
        C3040 c3040 = this.f67267;
        C3040.m9064(c3040, c3040.f11365, z);
    }

    @Override // l.InterfaceC18708
    /* JADX INFO: renamed from: ۙ */
    public final void mo19407(C3662 c3662, int i, int i2, int i3, Canvas canvas, Paint paint, C1590 c1590) {
        C3040.m9069(this.f67267, false, c3662, i, i2, i3, canvas, paint, c1590);
    }

    @Override // l.InterfaceC18708
    /* JADX INFO: renamed from: ۙ */
    public final void mo19406(C3662 c3662, int i, int i2, float f, float f2, boolean z, Canvas canvas, C4916 c4916, InterfaceC13855 interfaceC13855, C1590 c1590) {
        C3040.m9068(this.f67267, false, c3662, i, i2, f, f2, z, canvas, (Paint) c4916, interfaceC13855, c1590);
    }

    @Override // l.InterfaceC18708
    /* JADX INFO: renamed from: ۙ */
    public final void mo19405(C3662 c3662, float f, float f2, float f3, float f4, Canvas canvas, C4916 c4916, C1590 c1590) {
        C3040.m9067(this.f67267, false, c3662, f, f2, f3, f4, canvas, c4916, c1590);
    }
}
