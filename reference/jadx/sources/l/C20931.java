package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩷ܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C20931 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC12465 f68018;

    public C20931(ServiceC12465 serviceC12465) {
        this.f68018 = serviceC12465;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ServiceC12465 serviceC12465 = this.f68018;
        serviceC12465.f41564.m32561(C17403.m40553());
        serviceC12465.f41560.invalidate();
        int iM40565 = C17403.m40565();
        for (int i = 0; i < 2; i++) {
            View childAt = serviceC12465.f41567.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.height = iM40565;
            layoutParams.width = iM40565;
            childAt.setLayoutParams(layoutParams);
        }
        ServiceC12465.m30957(serviceC12465);
    }
}
