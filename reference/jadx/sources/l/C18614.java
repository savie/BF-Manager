package l;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6KF */
/* JADX INFO: loaded from: classes5.dex */
public class C18614 extends AbstractC11813 {
    public C18614(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12575((InterfaceC24044) new C5612(context));
    }

    @Override // l.AbstractC11813
    /* JADX INFO: renamed from: ۙ */
    public final void mo2388(AbstractActivityC17204 abstractActivityC17204) {
        int i;
        String strM40856 = C17394.m40856();
        String[] strArr = {abstractActivityC17204.getString(R.string.MT_Protector), abstractActivityC17204.getString(R.string.MT_Protector), abstractActivityC17204.getString(R.string.MT_Protector)};
        if (strM40856.isEmpty()) {
            i = 0;
        } else {
            i = strM40856.equals("com.android.vending") ? 1 : 2;
        }
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8017(R.layout.MT_Protector);
        c2361BuildDialog.m8013(strArr, i, new DialogInterfaceOnClickListenerC14884(this, abstractActivityC17204, strM40856, 0));
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m43303(AbstractActivityC17204 abstractActivityC17204, String str, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (i != 2) {
            C17394.m40860(i == 0 ? "" : "com.android.vending");
            mo7306();
            return;
        }
        C21598 c21598 = new C21598(this, abstractActivityC17204);
        c21598.m22945(R.string.MT_Protector);
        c21598.m22929(R.string.MT_Protector);
        c21598.m22933(abstractActivityC17204.getString(R.string.MT_Protector));
        c21598.m22948(524289);
        c21598.m22924((CharSequence) str);
        c21598.m22918();
        c21598.m22955(true);
    }
}
