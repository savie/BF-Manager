package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩺ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes.dex */
public final class C23998 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f77642;

    public C23998(DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14300) {
        this.f77642 = new WeakReference(dialogInterfaceOnClickListenerC14300);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14300 = (DialogInterfaceOnClickListenerC14300) this.f77642.get();
        if (dialogInterfaceOnClickListenerC14300 == null || !dialogInterfaceOnClickListenerC14300.f45152.m22434()) {
            C7247.m19877(C21576.m49084()).m19879(this);
            return;
        }
        final String stringExtra = intent.getStringExtra("pkgName");
        if (C17359.equals(stringExtra, dialogInterfaceOnClickListenerC14300.f45158.m28718())) {
            DialogInterfaceOnClickListenerC14300.f45151 = false;
            C2361 c2361BuildDialog = dialogInterfaceOnClickListenerC14300.f45154.m23233().buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8000(R.string.MT_Protector);
            c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۨۖᩴ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14301 = dialogInterfaceOnClickListenerC14300;
                    dialogInterfaceOnClickListenerC14301.f45160 = true;
                    dialogInterfaceOnClickListenerC14301.f45154.m23233().startActivity(new Intent("android.intent.action.DELETE", Uri.fromParts("package", stringExtra, null)));
                }
            });
            c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361BuildDialog.m8018(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۛۖᩴ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterfaceOnClickListenerC14300.m34722(false);
                }
            });
            C5416.m16141(c2361BuildDialog.m8016());
        }
    }
}
