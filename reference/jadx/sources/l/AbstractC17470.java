package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: C627 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17470 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC16765 f55585;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 f55586;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C9160 f55587;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f55588;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f55589;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TextView f55590;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo35372();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo35373(String str, String str2, boolean z);

    /* JADX WARN: Type inference failed for: r13v5, types: [l.ܽܽۨ] */
    public AbstractC17470(int i, final AbstractActivityC12483 abstractActivityC12483, final String str) {
        this.f55589 = false;
        this.f55588 = false;
        View viewM30995 = abstractActivityC12483.m30995(i);
        final C9160 c9160 = (C9160) viewM30995.findViewById(R.id.MT_Protector);
        final RadioButton radioButton = (RadioButton) viewM30995.findViewById(R.id.MT_Protector);
        final RadioButton radioButton2 = (RadioButton) viewM30995.findViewById(R.id.MT_Protector);
        final RadioButton radioButton3 = (RadioButton) viewM30995.findViewById(R.id.radioButton3);
        this.f55590 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        this.f55587 = c9160;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.֡ܽۨ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC17470.m40651(this.f2288, radioButton, radioButton2, radioButton3, c9160, view);
            }
        };
        radioButton.setOnClickListener(onClickListener);
        radioButton2.setOnClickListener(onClickListener);
        radioButton3.setOnClickListener(onClickListener);
        int i2 = ApplicationC0716.f2992.getInt(str, 0);
        if (i2 == 1) {
            radioButton2.setChecked(true);
            this.f55588 = true;
        } else if (i2 == 2) {
            radioButton3.setChecked(true);
            this.f55589 = true;
        } else {
            radioButton.setChecked(true);
        }
        c9160.m23510(radioButton.isChecked());
        int i3 = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21258(viewM30995);
        c8067.m21251(R.string.MT_Protector, null);
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f55586 = c8067.m21252();
        this.f55585 = new View.OnClickListener() { // from class: l.ܽܽۨ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC17470.m40652(this.f53658, radioButton2, radioButton3, c9160, str, radioButton, abstractActivityC12483);
            }
        };
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40651(AbstractC17470 abstractC17470, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, C9160 c9160, View view) {
        if (view == radioButton) {
            radioButton2.setChecked(false);
            radioButton3.setChecked(false);
            c9160.m23505(1);
            abstractC17470.f55589 = false;
            abstractC17470.f55588 = false;
        } else if (view == radioButton2) {
            radioButton.setChecked(false);
            radioButton3.setChecked(false);
            c9160.m23505(2);
            try {
                if (abstractC17470.f55589 && m40653(c9160.m23513().toString().trim())) {
                    c9160.m23507(String.valueOf(Long.parseLong(c9160.m23513().toString().trim(), 16)));
                }
                abstractC17470.f55589 = false;
                abstractC17470.f55588 = true;
            } catch (NumberFormatException unused) {
                abstractC17470.f55589 = false;
                abstractC17470.f55588 = false;
            }
        } else {
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
            c9160.m23505(1);
            try {
                if (abstractC17470.f55588 && m40654(c9160.m23513().toString().trim())) {
                    c9160.m23507(Long.toHexString(Long.parseLong(c9160.m23513().toString().trim())));
                }
                abstractC17470.f55589 = true;
                abstractC17470.f55588 = false;
            } catch (NumberFormatException unused2) {
                abstractC17470.f55589 = false;
                abstractC17470.f55588 = false;
            }
        }
        c9160.m23510(radioButton.isChecked());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40652(AbstractC17470 abstractC17470, RadioButton radioButton, RadioButton radioButton2, C9160 c9160, String str, RadioButton radioButton3, AbstractActivityC12483 abstractActivityC12483) {
        int i;
        String strTrim;
        String str2;
        if (radioButton.isChecked()) {
            i = 1;
        } else {
            i = radioButton2.isChecked() ? 2 : 0;
        }
        String string = c9160.m23513().toString();
        ApplicationC0716.f2992.edit().mo4065(i, str).apply();
        c9160.m23519();
        if (i == 1) {
            strTrim = string.trim();
            if (!m40654(strTrim)) {
                C15829.m37611(R.string.MT_Protector);
                return;
            }
        } else {
            if (i != 2) {
                str2 = string;
            } else {
                String strTrim2 = string.trim();
                if (!m40653(strTrim2)) {
                    C15829.m37611(R.string.MT_Protector);
                    return;
                }
                long jM17647 = 0;
                for (char c : strTrim2.toCharArray()) {
                    jM17647 = (jM17647 << 4) | ((long) C6461.m17647(c));
                }
                strTrim = String.valueOf(jM17647);
            }
            if (str2.length() > 0) {
                if (i != 0) {
                    try {
                        Long.parseLong(str2);
                    } catch (NumberFormatException unused) {
                        C15829.m37611(R.string.MT_Protector);
                        return;
                    }
                }
                new C12532(abstractC17470, abstractActivityC12483, str2, string, radioButton3.isChecked()).m10243();
            }
            abstractC17470.f55586.dismiss();
        }
        str2 = strTrim;
        if (str2.length() > 0) {
            if (i != 0) {
                Long.parseLong(str2);
            }
            new C12532(abstractC17470, abstractActivityC12483, str2, string, radioButton3.isChecked()).m10243();
        }
        abstractC17470.f55586.dismiss();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40655(boolean z) {
        this.f55590.setText(z ? R.string.MT_Protector : R.string.MT_Protector);
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f55586;
        dialogInterfaceC19356.m44362();
        dialogInterfaceC19356.m44373().setOnClickListener(this.f55585);
        C9160 c9160 = this.f55587;
        c9160.m23503();
        C16737.m39290(c9160.m23516());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m40656() {
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f55586;
        dialogInterfaceC19356.m44362();
        dialogInterfaceC19356.m44373().setOnClickListener(this.f55585);
        C9160 c9160 = this.f55587;
        c9160.m23503();
        C16737.m39290(c9160.m23516());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m40653(String str) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'A' || cCharAt > 'F') && cCharAt < 'a')) || cCharAt > 'f') {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m40654(String str) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return false;
            }
        }
        return true;
    }
}
