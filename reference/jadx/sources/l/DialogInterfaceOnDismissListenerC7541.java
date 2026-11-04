package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.۟֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O60D */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC7541 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f24877;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f24878;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f24879;

    public /* synthetic */ DialogInterfaceOnDismissListenerC7541(int i, Object obj, Object obj2) {
        this.f24877 = i;
        this.f24879 = obj;
        this.f24878 = obj2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f24877) {
            case 0:
                AbstractDialogInterfaceOnClickListenerC9777 abstractDialogInterfaceOnClickListenerC9777 = (AbstractDialogInterfaceOnClickListenerC9777) this.f24879;
                String str = (String) this.f24878;
                C1255 c1255 = abstractDialogInterfaceOnClickListenerC9777.f31515;
                InterfaceC18752 interfaceC18752Edit = ApplicationC17729.f58258.edit();
                if (abstractDialogInterfaceOnClickListenerC9777.f31519.getVisibility() == 0) {
                    interfaceC18752Edit.mo3486(abstractDialogInterfaceOnClickListenerC9777.f31520.getSelectedItemPosition(), str);
                }
                if (c1255.getVisibility() == 0) {
                    interfaceC18752Edit.putBoolean("dzds", c1255.isChecked());
                }
                interfaceC18752Edit.apply();
                break;
            default:
                C14031 c14031 = (C14031) this.f24879;
                c14031.m34163();
                break;
        }
    }
}
