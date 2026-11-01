package l;

import android.content.DialogInterface;
import android.view.MenuItem;

/* JADX INFO: renamed from: l.ᩳۤۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC17981 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f57498;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f57499;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20409 f57500;

    public /* synthetic */ DialogInterfaceOnClickListenerC17981(C20409 c20409, Object obj, int i) {
        this.f57499 = i;
        this.f57500 = c20409;
        this.f57498 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f57499;
        Object obj = this.f57498;
        C20409 c20409 = this.f57500;
        switch (i2) {
            case 0:
                MenuItem menuItem = (MenuItem) obj;
                menuItem.setChecked(!menuItem.isChecked());
                boolean zIsChecked = menuItem.isChecked();
                int i3 = ActivityC11632.f39058;
                C1679.m5597(ApplicationC0716.f2992, "axml_id_2_name", zIsChecked);
                c20409.m46132(-1, false, true);
                break;
            default:
                c20409.getClass();
                c20409.m46132(((int[]) obj)[0], false, false);
                break;
        }
    }
}
