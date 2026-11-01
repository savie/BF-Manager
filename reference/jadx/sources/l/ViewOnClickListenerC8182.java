package l;

import android.app.Application;
import android.content.Intent;
import android.view.View;

/* JADX INFO: renamed from: l.۠۫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC8182 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f28527;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f28528;

    public /* synthetic */ ViewOnClickListenerC8182(int i, Object obj) {
        this.f28527 = i;
        this.f28528 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f28527;
        Object obj = this.f28528;
        switch (i) {
            case 0:
                C11005.m27754((AbstractActivityC12483) obj, view).m38297();
                break;
            case 1:
                int[] iArr = (int[]) obj;
                if (!(iArr[0] == 0 ? ServiceC4538.m12674() : ServiceC7629.m20160())) {
                    if (iArr[0] != 0) {
                        ServiceC7629.m20167();
                    } else {
                        int i2 = ServiceC4538.f16137;
                        Application applicationM39277 = C16737.m39277();
                        C10405.m26303(applicationM39277, new Intent(applicationM39277, (Class<?>) ServiceC4538.class));
                    }
                } else if (iArr[0] != 0) {
                    int i3 = ServiceC7629.f25189;
                    Application applicationM39278 = C16737.m39277();
                    applicationM39278.stopService(new Intent(applicationM39278, (Class<?>) ServiceC7629.class));
                } else {
                    int i4 = ServiceC4538.f16137;
                    Application applicationM39279 = C16737.m39277();
                    applicationM39279.stopService(new Intent(applicationM39279, (Class<?>) ServiceC4538.class));
                }
                break;
            case 2:
                ((C11718) obj).f39377.m1509();
                break;
            default:
                int i5 = ActivityC7298.f24232;
                ((ActivityC7298) obj).finish();
                break;
        }
    }
}
