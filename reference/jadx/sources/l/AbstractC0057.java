package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֡֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: C627 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0057 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 f934;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f935;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TextView f936;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C17771 f937;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f938;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC20940 f939;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo974();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo975(String str, String str2, boolean z);

    /* JADX WARN: Type inference failed for: r13v5, types: [l.᩶֡ۤ] */
    public AbstractC0057(int i, final AbstractActivityC17204 abstractActivityC17204, final String str) {
        this.f938 = false;
        this.f935 = false;
        View viewM40395 = abstractActivityC17204.m40395(i);
        final C17771 c17771 = (C17771) viewM40395.findViewById(R.id.MT_Protector);
        final RadioButton radioButton = (RadioButton) viewM40395.findViewById(R.id.MT_Protector);
        final RadioButton radioButton2 = (RadioButton) viewM40395.findViewById(R.id.MT_Protector);
        final RadioButton radioButton3 = (RadioButton) viewM40395.findViewById(R.id.radioButton3);
        this.f936 = (TextView) viewM40395.findViewById(R.id.title);
        this.f937 = c17771;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ܰ֡ۤ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC0057.m970(this.f44952, radioButton, radioButton2, radioButton3, c17771, view);
            }
        };
        radioButton.setOnClickListener(onClickListener);
        radioButton2.setOnClickListener(onClickListener);
        radioButton3.setOnClickListener(onClickListener);
        int i2 = ApplicationC17729.f58258.getInt(str, 0);
        if (i2 == 1) {
            radioButton2.setChecked(true);
            this.f935 = true;
        } else if (i2 == 2) {
            radioButton3.setChecked(true);
            this.f938 = true;
        } else {
            radioButton.setChecked(true);
        }
        c17771.m41597(radioButton.isChecked());
        int i3 = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8005(viewM40395);
        c2361.m8026(R.string.MT_Protector, null);
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f934 = c2361.m7999();
        this.f939 = new View.OnClickListener() { // from class: l.᩶֡ۤ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC0057.m971(this.f66996, radioButton2, radioButton3, c17771, str, radioButton, abstractActivityC17204);
            }
        };
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m970(AbstractC0057 abstractC0057, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, C17771 c17771, View view) {
        if (view == radioButton) {
            radioButton2.setChecked(false);
            radioButton3.setChecked(false);
            c17771.m41592(1);
            abstractC0057.f938 = false;
            abstractC0057.f935 = false;
        } else if (view == radioButton2) {
            radioButton.setChecked(false);
            radioButton3.setChecked(false);
            c17771.m41592(2);
            try {
                if (abstractC0057.f938 && m972(c17771.m41599().toString().trim())) {
                    c17771.m41594(String.valueOf(Long.parseLong(c17771.m41599().toString().trim(), 16)));
                }
                abstractC0057.f938 = false;
                abstractC0057.f935 = true;
            } catch (NumberFormatException unused) {
                abstractC0057.f938 = false;
                abstractC0057.f935 = false;
            }
        } else {
            radioButton.setChecked(false);
            radioButton2.setChecked(false);
            c17771.m41592(1);
            try {
                if (abstractC0057.f935 && m973(c17771.m41599().toString().trim())) {
                    c17771.m41594(Long.toHexString(Long.parseLong(c17771.m41599().toString().trim())));
                }
                abstractC0057.f938 = true;
                abstractC0057.f935 = false;
            } catch (NumberFormatException unused2) {
                abstractC0057.f938 = false;
                abstractC0057.f935 = false;
            }
        }
        c17771.m41597(radioButton.isChecked());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m971(AbstractC0057 abstractC0057, RadioButton radioButton, RadioButton radioButton2, C17771 c17771, String str, RadioButton radioButton3, AbstractActivityC17204 abstractActivityC17204) {
        int i;
        String strTrim;
        String str2;
        if (radioButton.isChecked()) {
            i = 1;
        } else {
            i = radioButton2.isChecked() ? 2 : 0;
        }
        String string = c17771.m41599().toString();
        ApplicationC17729.f58258.edit().mo3486(i, str).apply();
        c17771.m41603();
        if (i == 1) {
            strTrim = string.trim();
            if (!m973(strTrim)) {
                C22673.m51152(R.string.MT_Protector);
                return;
            }
        } else {
            if (i != 2) {
                str2 = string;
            } else {
                String strTrim2 = string.trim();
                if (!m972(strTrim2)) {
                    C22673.m51152(R.string.MT_Protector);
                    return;
                }
                long jM29452 = 0;
                for (char c : strTrim2.toCharArray()) {
                    jM29452 = (jM29452 << 4) | ((long) C11730.m29452(c));
                }
                strTrim = String.valueOf(jM29452);
            }
            if (str2.length() > 0) {
                if (i != 0) {
                    try {
                        Long.parseLong(str2);
                    } catch (NumberFormatException unused) {
                        C22673.m51152(R.string.MT_Protector);
                        return;
                    }
                }
                new C17956(abstractC0057, abstractActivityC17204, str2, string, radioButton3.isChecked()).m8197();
            }
            abstractC0057.f934.dismiss();
        }
        str2 = strTrim;
        if (str2.length() > 0) {
            if (i != 0) {
                Long.parseLong(str2);
            }
            new C17956(abstractC0057, abstractActivityC17204, str2, string, radioButton3.isChecked()).m8197();
        }
        abstractC0057.f934.dismiss();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m976(boolean z) {
        this.f936.setText(z ? R.string.MT_Protector : R.string.MT_Protector);
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f934;
        dialogInterfaceC8327.m22432();
        dialogInterfaceC8327.m22436().setOnClickListener(this.f939);
        C17771 c17771 = this.f937;
        c17771.m41590();
        C21576.m49090(c17771.m41605());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m977() {
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f934;
        dialogInterfaceC8327.m22432();
        dialogInterfaceC8327.m22436().setOnClickListener(this.f939);
        C17771 c17771 = this.f937;
        c17771.m41590();
        C21576.m49090(c17771.m41605());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m972(String str) {
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m973(String str) {
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
