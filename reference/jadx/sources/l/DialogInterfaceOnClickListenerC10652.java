package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۤۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC10652 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f33770;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f33771;

    public /* synthetic */ DialogInterfaceOnClickListenerC10652(int i, Object obj) {
        this.f33770 = i;
        this.f33771 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f33770) {
            case 0:
                ActivityC0848.m3413((ActivityC0848) this.f33771);
                break;
            default:
                C0102 c0102 = (C0102) this.f33771;
                c0102.f1042.m24164(c0102.f1043);
                c0102.m1201();
                break;
        }
    }
}
