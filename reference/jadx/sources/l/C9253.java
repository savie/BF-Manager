package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9253 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327[] f30112;

    public C9253(DialogInterfaceC8327[] dialogInterfaceC8327Arr) {
        this.f30112 = dialogInterfaceC8327Arr;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f30112[0];
        if (ServiceC10702.f33973) {
            dialogInterfaceC8327.dismiss();
        } else {
            dialogInterfaceC8327.m22436().setText(R.string.MT_Protector);
        }
    }
}
