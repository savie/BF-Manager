package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.ui.dialog.PluginDialog;
import java.util.List;

/* JADX INFO: renamed from: l.ۡۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 895N */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC8619 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f29742;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29743;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f29744;

    public /* synthetic */ DialogInterfaceOnClickListenerC8619(int i, Object obj, Object obj2) {
        this.f29743 = i;
        this.f29744 = obj;
        this.f29742 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f29743) {
            case 0:
                List list = (List) this.f29744;
                C21422 c21422 = (C21422) this.f29742;
                dialogInterface.dismiss();
                ((AbstractC4674) list.get(i)).mo1962(c21422);
                break;
            default:
                C18770 c18770 = (C18770) this.f29744;
                PluginDialog.OnClickListener onClickListener = (PluginDialog.OnClickListener) this.f29742;
                c18770.getClass();
                onClickListener.onClick(c18770, i);
                break;
        }
    }
}
