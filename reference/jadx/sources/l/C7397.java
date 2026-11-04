package l;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: l.ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes4.dex */
public final class C7397 implements InterfaceC5252 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5577 f24378;

    public C7397(ActivityC5577 activityC5577) {
        this.f24378 = activityC5577;
    }

    @Override // l.InterfaceC5252
    /* JADX INFO: renamed from: ۙ */
    public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
        if (enumC9330 == EnumC9330.ON_STOP) {
            Window window = this.f24378.getWindow();
            View viewPeekDecorView = window != null ? window.peekDecorView() : null;
            if (viewPeekDecorView != null) {
                viewPeekDecorView.cancelPendingInputEvents();
            }
        }
    }
}
