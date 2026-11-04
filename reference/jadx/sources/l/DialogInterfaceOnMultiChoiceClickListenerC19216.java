package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ᩳܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: J57L */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class DialogInterfaceOnMultiChoiceClickListenerC19216 implements DialogInterface.OnMultiChoiceClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62165;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f62166;

    public /* synthetic */ DialogInterfaceOnMultiChoiceClickListenerC19216(boolean[] zArr, int i) {
        this.f62165 = i;
        this.f62166 = zArr;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        switch (this.f62165) {
            case 0:
                this.f62166[i] = z;
                break;
            default:
                this.f62166[i] = z;
                break;
        }
    }
}
