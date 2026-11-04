package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19574 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12861 f63130;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19574(AbstractActivityC17204 abstractActivityC17204, C12861 c12861) {
        super(abstractActivityC17204, -1);
        this.f63130 = c12861;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strTrim = m22914().trim();
        try {
            if (strTrim.isEmpty()) {
                throw new NumberFormatException();
            }
            int i = Integer.parseInt(strTrim);
            if (i < 1 || i > 999) {
                C22673.m51152(R.string.MT_Protector);
            } else {
                C1432.m5167(i);
                m22951();
            }
        } catch (NumberFormatException unused) {
            C22673.m51152(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C12861 c12861 = this.f63130;
        if (c12861.f41170 == this) {
            c12861.f41170 = null;
        }
    }
}
