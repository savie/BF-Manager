package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.ui.dialog.PluginDialog;
import bin.mt.plus.Main;
import com.umeng.commonsdk.utils.UMUtils;

/* JADX INFO: renamed from: l.ۜ᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5CP */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC7410 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f24417;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f24418;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f24419;

    public /* synthetic */ DialogInterfaceOnClickListenerC7410(int i, Object obj, Object obj2) {
        this.f24417 = i;
        this.f24419 = obj;
        this.f24418 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f24417) {
            case 0:
                Main main = (Main) this.f24419;
                InterfaceC4844 interfaceC4844 = (InterfaceC4844) this.f24418;
                if (C7508.m20559(main, UMUtils.SD_PERMISSION) != 0) {
                    interfaceC4844.mo14880();
                } else {
                    interfaceC4844.onSuccess();
                }
                break;
            case 1:
                C4636 c4636 = (C4636) this.f24419;
                PluginDialog.OnClickListener onClickListener = (PluginDialog.OnClickListener) this.f24418;
                c4636.getClass();
                onClickListener.onClick(c4636, i);
                break;
            case 2:
                ActivityC0848.m3366((ActivityC0848) this.f24419, (Runnable) this.f24418);
                break;
            default:
                ViewOnClickListenerC19404.m44881((ViewOnClickListenerC19404) this.f24419, (C8230) this.f24418);
                break;
        }
    }
}
