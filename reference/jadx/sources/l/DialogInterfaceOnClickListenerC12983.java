package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4I7 */
/* JADX INFO: loaded from: classes4.dex */
public final class DialogInterfaceOnClickListenerC12983 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f41615;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32394(int i, AbstractActivityC17204 abstractActivityC17204, String str) {
        m32395(abstractActivityC17204, str, abstractActivityC17204.getString(i), false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m32396(int i, AbstractActivityC17204 abstractActivityC17204, String str) {
        m32395(abstractActivityC17204, str, abstractActivityC17204.getString(i), true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32395(AbstractActivityC17204 abstractActivityC17204, String str, String str2, boolean z) {
        String strConcat = "forbid_tip_".concat(str);
        if (ApplicationC17729.f58258.getBoolean(strConcat, false)) {
            return;
        }
        new DialogInterfaceOnClickListenerC12983(abstractActivityC17204, strConcat, str2, z);
    }

    public DialogInterfaceOnClickListenerC12983(AbstractActivityC17204 abstractActivityC17204, String str, String str2, boolean z) {
        this.f41615 = str;
        boolean z2 = true;
        if (!z) {
            byte bMo7901 = ApplicationC17729.f58258.mo7901((byte) 0, str + "_count");
            if (bMo7901 <= 1) {
                ApplicationC17729.f58258.edit().mo3485((byte) (bMo7901 + 1), C14483.m34972(str, "_count")).apply();
                z2 = false;
            }
        }
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8021(R.string.MT_Protector);
        c2361.m8008(str2);
        c2361.m8026(R.string.MT_Protector, null);
        if (z2) {
            c2361.m8018(R.string.MT_Protector, this);
        }
        c2361.m8016();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ApplicationC17729.f58258.edit().putBoolean(this.f41615, true).apply();
    }
}
