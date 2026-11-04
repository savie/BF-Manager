package l;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: renamed from: l.ۖ֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes3.dex */
public final class C2328 implements InterfaceC14499 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24943 f7509;

    public C2328(C24943 c24943) {
        this.f7509 = c24943;
    }

    @Override // l.InterfaceC14499
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo7842() {
        C24943 c24943 = this.f7509;
        return !c24943.f80757 || c24943.f80733.m53888();
    }

    @Override // l.InterfaceC14499
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7836() {
        C24943 c24943 = this.f7509;
        if (c24943.f80757) {
            c24943.f80733.invalidate();
        }
    }

    @Override // l.InterfaceC14499
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo7841() {
        C19721 c19721 = this.f7509.f80731;
        c19721.f63471 = false;
        c19721.f63472 = null;
        c19721.f63475 = null;
        c19721.f63470 = null;
        c19721.f63474 = null;
        c19721.f63469.clear();
    }

    @Override // l.InterfaceC14499
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7840(boolean z) {
        C24943 c24943 = this.f7509;
        C24943.m55638(c24943, c24943.f80731, z);
    }

    @Override // l.InterfaceC14499
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7839(C6909 c6909, int i, int i2, int i3, Canvas canvas, Paint paint, C14540 c14540) {
        C24943.m55642(this.f7509, true, c6909, i, i2, i3, canvas, paint, c14540);
    }

    @Override // l.InterfaceC14499
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7838(C6909 c6909, int i, int i2, float f, float f2, boolean z, Canvas canvas, C10232 c10232, InterfaceC7829 interfaceC7829, C14540 c14540) {
        C24943.m55641(this.f7509, true, c6909, i, i2, f, f2, z, canvas, (Paint) c10232, interfaceC7829, c14540);
    }

    @Override // l.InterfaceC14499
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7837(C6909 c6909, float f, float f2, float f3, float f4, Canvas canvas, C10232 c10232, C14540 c14540) {
        C24943.m55640(this.f7509, true, c6909, f, f2, f3, f4, canvas, c10232, c14540);
    }
}
