package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4I7 */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnClickListenerC14147 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f46443;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34220(int i, AbstractActivityC12483 abstractActivityC12483, String str) {
        m34221(abstractActivityC12483, str, abstractActivityC12483.getString(i), false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m34222(int i, AbstractActivityC12483 abstractActivityC12483, String str) {
        m34221(abstractActivityC12483, str, abstractActivityC12483.getString(i), true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34221(AbstractActivityC12483 abstractActivityC12483, String str, String str2, boolean z) {
        String strConcat = "forbid_tip_".concat(str);
        if (ApplicationC0716.f2992.getBoolean(strConcat, false)) {
            return;
        }
        new DialogInterfaceOnClickListenerC14147(abstractActivityC12483, strConcat, str2, z);
    }

    public DialogInterfaceOnClickListenerC14147(AbstractActivityC12483 abstractActivityC12483, String str, String str2, boolean z) {
        this.f46443 = str;
        boolean z2 = true;
        if (!z) {
            byte bMo16345 = ApplicationC0716.f2992.mo16345((byte) 0, str + "_count");
            if (bMo16345 <= 1) {
                ApplicationC0716.f2992.edit().mo4064((byte) (bMo16345 + 1), C15489.m37076(str, "_count")).apply();
                z2 = false;
            }
        }
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21274(R.string.MT_Protector);
        c8067.m21261(str2);
        c8067.m21251(R.string.MT_Protector, null);
        if (z2) {
            c8067.m21271(R.string.MT_Protector, this);
        }
        c8067.m21269();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ApplicationC0716.f2992.edit().putBoolean(this.f46443, true).apply();
    }
}
