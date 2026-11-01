package l;

import android.content.DialogInterface;
import java.util.HashSet;

/* JADX INFO: renamed from: l.۫᩷ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04QM */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnMultiChoiceClickListenerC12659 implements DialogInterface.OnMultiChoiceClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17597 f42270;

    public DialogInterfaceOnMultiChoiceClickListenerC12659(C17597 c17597) {
        this.f42270 = c17597;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        C17597 c17597 = this.f42270;
        HashSet hashSet = c17597.f55932;
        if (z) {
            c17597.f55933 = hashSet.add(c17597.f55934[i].toString()) | c17597.f55933;
        } else {
            c17597.f55933 = hashSet.remove(c17597.f55934[i].toString()) | c17597.f55933;
        }
    }
}
