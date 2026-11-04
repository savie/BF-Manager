package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩶ܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6YU */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class DialogInterfaceOnMultiChoiceClickListenerC21378 implements DialogInterface.OnMultiChoiceClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f68075;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f68076;

    public /* synthetic */ DialogInterfaceOnMultiChoiceClickListenerC21378(boolean[] zArr, int i) {
        this.f68075 = i;
        this.f68076 = zArr;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        int i2 = this.f68075;
        boolean[] zArr = this.f68076;
        switch (i2) {
            case 0:
                zArr[i] = z;
                break;
            default:
                int i3 = ActivityC6167.f21005;
                zArr[i] = z;
                break;
        }
    }
}
