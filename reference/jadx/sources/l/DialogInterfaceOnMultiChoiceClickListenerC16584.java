package l;

import android.content.DialogInterface;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ܺۘ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 04QM */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceOnMultiChoiceClickListenerC16584 implements DialogInterface.OnMultiChoiceClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17330 f53663;

    public DialogInterfaceOnMultiChoiceClickListenerC16584(C17330 c17330) {
        this.f53663 = c17330;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        C17330 c17330 = this.f53663;
        HashSet hashSet = c17330.f56432;
        if (z) {
            c17330.f56431 = hashSet.add(c17330.f56430[i].toString()) | c17330.f56431;
        } else {
            c17330.f56431 = hashSet.remove(c17330.f56430[i].toString()) | c17330.f56431;
        }
    }
}
