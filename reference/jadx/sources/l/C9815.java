package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: l.ۢ᩶۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes3.dex */
public final class C9815 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f33563;

    public C9815(DialogInterfaceC19356 dialogInterfaceC19356) {
        this.f33563 = dialogInterfaceC19356;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f33563;
        if (dialogInterfaceC19356.m44375()) {
            dialogInterfaceC19356.dismiss();
        }
    }
}
