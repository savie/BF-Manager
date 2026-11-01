package l;

import android.content.DialogInterface;
import java.util.HashSet;

/* JADX INFO: renamed from: l.֡᩷ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 956H */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogInterfaceOnMultiChoiceClickListenerC0663 implements DialogInterface.OnMultiChoiceClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogFragmentC16892 f2799;

    public DialogInterfaceOnMultiChoiceClickListenerC0663(DialogFragmentC16892 dialogFragmentC16892) {
        this.f2799 = dialogFragmentC16892;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        DialogFragmentC16892 dialogFragmentC16892 = this.f2799;
        HashSet hashSet = dialogFragmentC16892.f54036;
        if (z) {
            dialogFragmentC16892.f54037 = hashSet.add(dialogFragmentC16892.f54038[i].toString()) | dialogFragmentC16892.f54037;
        } else {
            dialogFragmentC16892.f54037 = hashSet.remove(dialogFragmentC16892.f54038[i].toString()) | dialogFragmentC16892.f54037;
        }
    }
}
