package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.۠۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8508 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC10702 f27813;

    public C8508(ServiceC10702 serviceC10702) {
        this.f27813 = serviceC10702;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ServiceC10702 serviceC10702 = this.f27813;
        serviceC10702.f33980.m46873(C22637.m51028());
        serviceC10702.f33986.invalidate();
        int iM51037 = C22637.m51037();
        for (int i = 0; i < 2; i++) {
            View childAt = serviceC10702.f33981.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.height = iM51037;
            layoutParams.width = iM51037;
            childAt.setLayoutParams(layoutParams);
        }
        ServiceC10702.m27270(serviceC10702);
    }
}
