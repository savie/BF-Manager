package l;

import android.view.View;
import bin.mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;

/* JADX INFO: renamed from: l.ᩳۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes5.dex */
public final class C18820 implements InterfaceC15395 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2386 f61160;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f61161;

    public C18820(C8614 c8614, InterfaceC2386 interfaceC2386) {
        this.f61161 = c8614;
        this.f61160 = interfaceC2386;
    }

    @Override // l.InterfaceC15395
    /* JADX INFO: renamed from: ۙ */
    public final void mo3725(C20312 c20312, InterfaceC16648 interfaceC16648, C1512 c1512) {
        C8614 c8614 = this.f61161;
        InterfaceC2386 interfaceC2386 = this.f61160;
        if (c1512 != null) {
            c1512.m5369(c8614, interfaceC2386);
        } else if (C3158.m10299(c8614, interfaceC2386)) {
            C20065.m46116(interfaceC2386, OpenAuthTask.Duplex);
            C3158.m10298(c8614, interfaceC2386, interfaceC16648.mo39358());
        } else {
            C1663.m5975(c8614, interfaceC2386, new C5501(interfaceC2386, c20312, interfaceC16648));
        }
    }

    @Override // l.InterfaceC15395
    /* JADX INFO: renamed from: ۙ */
    public final void mo3724(View view, C20312 c20312, InterfaceC16648 interfaceC16648, C1512 c1512) {
        String strMo8098 = this.f61160.mo8098();
        C18452 c18452 = new C18452(this.f61161.m23233(), view, 0);
        C9898 c9898M42995 = c18452.m42995();
        c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setEnabled(!strMo8098.isEmpty());
        if (interfaceC16648 != null) {
            c9898M42995.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c18452.m42994(new C21897(c1512, strMo8098, interfaceC16648, this.f61161, c20312));
        c18452.mo21878();
    }
}
