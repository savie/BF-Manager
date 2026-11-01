package l;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: l.֫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes3.dex */
public class C1854 implements InterfaceC5657 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC1086 f7074;

    public C1854(ActivityC1086 activityC1086) {
        this.f7074 = activityC1086;
    }

    @Override // l.InterfaceC5657
    /* JADX INFO: renamed from: ۙ */
    public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
        if (enumC1651 == EnumC1651.ON_STOP) {
            Window window = this.f7074.getWindow();
            View viewPeekDecorView = window != null ? window.peekDecorView() : null;
            if (viewPeekDecorView != null) {
                viewPeekDecorView.cancelPendingInputEvents();
            }
        }
    }
}
