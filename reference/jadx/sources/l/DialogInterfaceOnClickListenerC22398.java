package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import bin.mt.plugin.api.ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.᩷᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC22398 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72540;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72541;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72542;

    public /* synthetic */ DialogInterfaceOnClickListenerC22398(int i, Object obj, Object obj2) {
        this.f72540 = i;
        this.f72542 = obj;
        this.f72541 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f72540;
        Object obj = this.f72541;
        Object obj2 = this.f72542;
        switch (i2) {
            case 0:
                MenuItem menuItem = (MenuItem) obj;
                menuItem.setChecked(!menuItem.isChecked());
                boolean zIsChecked = menuItem.isChecked();
                int i3 = ActivityC18143.f59323;
                C6421.m18184(ApplicationC17729.f58258, "axml_id_2_name", zIsChecked);
                ((C7941) obj2).m21621(-1, false, true);
                break;
            default:
                C4636 c4636 = (C4636) obj2;
                c4636.getClass();
                ((PluginDialog.OnClickListener) obj).onClick(c4636, i);
                break;
        }
    }
}
