package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC24070 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f77823;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f77824;

    public /* synthetic */ DialogInterfaceOnClickListenerC24070(int i, Object obj) {
        this.f77823 = i;
        this.f77824 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f77823;
        Object obj = this.f77824;
        switch (i2) {
            case 0:
                ((Runnable) obj).run();
                break;
            case 1:
                AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) obj;
                C18730.m43546(abstractActivityC17204, abstractActivityC17204.getPackageName());
                break;
            case 2:
                C0594 c0594 = C24406.f79200;
                C6421.m18184(ApplicationC17729.f58258, "psri", ((C1255) obj).isChecked());
                break;
            default:
                int i3 = ViewOnClickListenerC1057.f3785;
                ApplicationC17729.f58258.edit().putBoolean("sal2", false).apply();
                ((ViewOnClickListenerC1057) obj).m40418(R.id.MT_Protector).setVisibility(8);
                break;
        }
    }
}
