package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import bin.mt.plus.Main;
import com.google.android.material.datepicker.MaterialDatePicker;

/* JADX INFO: renamed from: l.ۡۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19AV */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC8814 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f30312;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f30313;

    public /* synthetic */ ViewOnClickListenerC8814(int i, Object obj) {
        this.f30312 = i;
        this.f30313 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f30312;
        Object obj = this.f30313;
        switch (i) {
            case 0:
                Main main = (Main) obj;
                try {
                    Intent launchIntentForPackage = main.getPackageManager().getLaunchIntentForPackage("moe.shizuku.privileged.api");
                    if (launchIntentForPackage != null) {
                        main.startActivity(launchIntentForPackage);
                    }
                } catch (Exception e) {
                    main.m31002(e, (DialogInterface.OnDismissListener) null);
                    return;
                }
                break;
            case 1:
                int i2 = ActivityC23387.f75766;
                ((ActivityC23387) obj).finish();
                break;
            case 2:
                ((ActivityC10055) obj).m25458();
                break;
            default:
                ((MaterialDatePicker) obj).lambda$initHeaderToggle$0(view);
                break;
        }
    }
}
