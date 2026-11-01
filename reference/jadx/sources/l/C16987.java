package l;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6KF */
/* JADX INFO: loaded from: classes5.dex */
public class C16987 extends AbstractC18168 {
    public C16987(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13145((InterfaceC3485) new C13217(context));
    }

    @Override // l.AbstractC18168
    /* JADX INFO: renamed from: ۙ */
    public final void mo950(final AbstractActivityC12483 abstractActivityC12483) {
        int i;
        final String string = ApplicationC0716.f2992.getString("ais", "");
        String[] strArr = {abstractActivityC12483.getString(R.string.MT_Protector), abstractActivityC12483.getString(R.string.MT_Protector), abstractActivityC12483.getString(R.string.MT_Protector)};
        if (string.isEmpty()) {
            i = 0;
        } else {
            i = string.equals("com.android.vending") ? 1 : 2;
        }
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21270(R.layout.MT_Protector);
        c8067BuildDialog.m21266(strArr, i, new DialogInterface.OnClickListener() { // from class: l.ܽ֡ۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f52453.m39774(abstractActivityC12483, string, dialogInterface, i2);
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m39774(AbstractActivityC12483 abstractActivityC12483, String str, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (i != 2) {
            C14726.m35258(i == 0 ? "" : "com.android.vending");
            mo8453();
            return;
        }
        C12049 c12049 = new C12049(this, abstractActivityC12483);
        c12049.m40376(R.string.MT_Protector);
        c12049.m40363(R.string.MT_Protector);
        c12049.m40367(abstractActivityC12483.getString(R.string.MT_Protector));
        c12049.m40350(524289);
        c12049.m40346((CharSequence) str);
        c12049.m40340();
        c12049.m40368(true);
    }
}
