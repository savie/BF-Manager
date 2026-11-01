package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢܺ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9691 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4875 f32657;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9691(AbstractActivityC12483 abstractActivityC12483, C4875 c4875) {
        super(abstractActivityC12483, -1);
        this.f32657 = c4875;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strTrim = m40352().trim();
        try {
            if (strTrim.isEmpty()) {
                throw new NumberFormatException();
            }
            int i = Integer.parseInt(strTrim);
            if (i < 1 || i > 999) {
                C15829.m37611(R.string.MT_Protector);
            } else {
                C15586.m37240(i);
                m40364();
            }
        } catch (NumberFormatException unused) {
            C15829.m37611(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C4875 c4875 = this.f32657;
        if (c4875.f17149 == this) {
            c4875.f17149 = null;
        }
    }
}
