package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۗۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC3161 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10256;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC18143 f10257;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7941 f10258;

    public /* synthetic */ DialogInterfaceOnClickListenerC3161(C7941 c7941, ActivityC18143 activityC18143, int i) {
        this.f10256 = i;
        this.f10258 = c7941;
        this.f10257 = activityC18143;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f10256) {
            case 0:
                C7941 c7941 = this.f10258;
                c7941.getClass();
                this.f10257.m42295(c7941);
                break;
            default:
                this.f10258.m21609(this.f10257);
                break;
        }
    }
}
