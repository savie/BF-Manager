package l;

import android.content.DialogInterface;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۧۘ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 956H */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnMultiChoiceClickListenerC11363 implements DialogInterface.OnMultiChoiceClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogFragmentC24790 f35774;

    public DialogInterfaceOnMultiChoiceClickListenerC11363(DialogFragmentC24790 dialogFragmentC24790) {
        this.f35774 = dialogFragmentC24790;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        DialogFragmentC24790 dialogFragmentC24790 = this.f35774;
        HashSet hashSet = dialogFragmentC24790.f80236;
        if (z) {
            dialogFragmentC24790.f80235 = hashSet.add(dialogFragmentC24790.f80234[i].toString()) | dialogFragmentC24790.f80235;
        } else {
            dialogFragmentC24790.f80235 = hashSet.remove(dialogFragmentC24790.f80234[i].toString()) | dialogFragmentC24790.f80235;
        }
    }
}
