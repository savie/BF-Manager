package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10348 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356[] f35483;

    public C10348(DialogInterfaceC19356[] dialogInterfaceC19356Arr) {
        this.f35483 = dialogInterfaceC19356Arr;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f35483[0];
        if (ServiceC12465.f41554) {
            dialogInterfaceC19356.dismiss();
        } else {
            dialogInterfaceC19356.m44373().setText(R.string.MT_Protector);
        }
    }
}
