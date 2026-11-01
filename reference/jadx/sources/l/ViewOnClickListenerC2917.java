package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import bin.mt.plus.R;
import java.util.Set;

/* JADX INFO: renamed from: l.ۗ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1E5 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC2917 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C9160 f10962;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CheckBox f10963;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final C18377 f10964;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f10965;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final CheckBox f10966;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final CheckBox f10967;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f10968;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CheckBox f10969;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final View f10970;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final CheckBox f10971;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final Spinner f10972;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C10948 f10973;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ActivityC5677 f10974;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f10975;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Set f10976;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C1506 f10977;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC6025 f10978;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public ViewOnClickListenerC2917(ComponentCallbacksC22654 componentCallbacksC22654, String str) {
        String strConcat = str;
        InterfaceC6025 interfaceC6025 = ApplicationC0716.f2992;
        this.f10978 = interfaceC6025;
        ActivityC5677 activityC5677 = (ActivityC5677) componentCallbacksC22654.requireActivity();
        this.f10974 = activityC5677;
        this.f10964 = (C18377) new C16717(activityC5677).m39205(C18377.class);
        View viewM30995 = activityC5677.m30995(R.layout.MT_Protector);
        this.f10970 = viewM30995;
        C9160 c9160 = (C9160) viewM30995.findViewById(R.id.MT_Protector);
        this.f10962 = c9160;
        c9160.m23508(C21905.m48704(), (String) null);
        C10948 c10948 = (C10948) viewM30995.findViewById(R.id.editText2);
        this.f10973 = c10948;
        Spinner spinner = (Spinner) viewM30995.findViewById(R.id.spinner);
        this.f10972 = spinner;
        CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f10966 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f10969 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM30995.findViewById(R.id.checkBox2);
        this.f10963 = checkBox3;
        CheckBox checkBox4 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f10967 = checkBox4;
        CheckBox checkBox5 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f10971 = checkBox5;
        String strConcat2 = "/";
        if (strConcat == null) {
            String string = interfaceC6025.getString("arsc_search_path", null);
            if (string != null && !string.isEmpty()) {
                strConcat2 = !string.endsWith("/") ? string.concat("/") : string;
            }
            c10948.mo16989((CharSequence) strConcat2);
        } else {
            if (str.isEmpty()) {
                strConcat = "/";
            } else if (!strConcat.endsWith("/")) {
                strConcat = strConcat.concat("/");
            }
            c10948.mo16989((CharSequence) strConcat);
        }
        spinner.setSelection(interfaceC6025.getInt("arsc_search_type", 0));
        onItemSelected(null, null, spinner.getSelectedItemPosition(), 0L);
        spinner.setOnItemSelectedListener(this);
        checkBox.setChecked(interfaceC6025.getBoolean("dex_search_sub", true));
        checkBox2.setChecked(interfaceC6025.getBoolean("dex_search_match_case", false));
        checkBox3.setChecked(interfaceC6025.getBoolean("dex_search_regex", false));
        checkBox4.setChecked(interfaceC6025.getBoolean("dex_search_hex", true));
        checkBox5.setChecked(interfaceC6025.getBoolean("dex_search_exactly_match", true));
        this.f10977 = new C1506(this);
        m8740();
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ܳ֫ۘ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f46593.m8740();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m8740() {
        CheckBox checkBox = this.f10963;
        this.f10962.m23518(checkBox.isChecked() && checkBox.getVisibility() == 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8742(C10617 c10617) {
        this.f10968 = true;
        this.f10976 = c10617.m26797();
        this.f10965 = c10617.m26795();
        this.f10966.setVisibility(8);
        C10948 c10948 = this.f10973;
        c10948.mo16989((CharSequence) c10948.getContext().getString(R.string.MT_Protector));
        c10948.setEnabled(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8741() {
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(this.f10974);
        c8067.m21258(this.f10970);
        DialogInterfaceC19356 dialogInterfaceC19356M10334 = C3509.m10334(c8067, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f10975 = dialogInterfaceC19356M10334;
        dialogInterfaceC19356M10334.m44373().setOnClickListener(this);
        C9160 c9160 = this.f10962;
        c9160.requestFocus();
        C16737.m39290(c9160.m23516());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f10962.m23510(i == 0 || i == 2);
        CheckBox checkBox = this.f10971;
        CheckBox checkBox2 = this.f10967;
        CheckBox checkBox3 = this.f10963;
        CheckBox checkBox4 = this.f10969;
        if (i == 0) {
            checkBox4.setVisibility(0);
            checkBox3.setVisibility(0);
            checkBox2.setVisibility(8);
            checkBox.setVisibility(8);
        } else if (i == 1) {
            checkBox4.setVisibility(8);
            checkBox3.setVisibility(8);
            checkBox2.setVisibility(0);
            checkBox.setVisibility(8);
        } else if (i == 2) {
            checkBox4.setVisibility(0);
            checkBox3.setVisibility(0);
            checkBox2.setVisibility(8);
            checkBox.setVisibility(0);
        } else if (i == 3) {
            checkBox4.setVisibility(8);
            checkBox3.setVisibility(8);
            checkBox2.setVisibility(0);
            checkBox.setVisibility(8);
        } else if (i == 4) {
            checkBox4.setVisibility(8);
            checkBox3.setVisibility(8);
            checkBox2.setVisibility(8);
            checkBox.setVisibility(8);
        }
        m8740();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM17654;
        String str;
        String strConcat;
        String strSubstring;
        C9160 c9160 = this.f10962;
        String string = c9160.m23513().toString();
        if (string.isEmpty()) {
            this.f10975.dismiss();
            return;
        }
        String string2 = this.f10973.m17000().toString();
        int selectedItemPosition = this.f10972.getSelectedItemPosition();
        boolean zIsChecked = this.f10966.isChecked();
        boolean zIsChecked2 = this.f10969.isChecked();
        boolean zIsChecked3 = this.f10963.isChecked();
        boolean zIsChecked4 = this.f10967.isChecked();
        boolean zIsChecked5 = this.f10971.isChecked();
        if (selectedItemPosition == 0) {
            if (zIsChecked3) {
                try {
                    C14690.m35219(string);
                } catch (Exception e) {
                    C15829.m37613((CharSequence) e.getMessage());
                    c9160.requestFocus();
                    return;
                }
            }
            iM17654 = 0;
        } else if (selectedItemPosition != 1) {
            if (selectedItemPosition != 2) {
                if (selectedItemPosition != 3) {
                    if (selectedItemPosition == 4) {
                        boolean zStartsWith = string.startsWith("#");
                        if (zStartsWith) {
                            zStartsWith = C6461.m17652(string.substring(1));
                        }
                        if (!zStartsWith) {
                            C15829.m37613((CharSequence) C16737.m39288(R.string.MT_Protector).concat(" (#RRGGBB, #AARRGGBB...)"));
                            c9160.requestFocus();
                            return;
                        }
                        iM17654 = C6461.m17646(string.substring(1));
                    }
                } else if (zIsChecked4) {
                    if (string.startsWith("0x")) {
                        strSubstring = string.substring(2);
                    } else {
                        strSubstring = string.substring(2);
                    }
                    if (!C6461.m17651(strSubstring)) {
                        C15829.m37611(R.string.MT_Protector);
                        c9160.requestFocus();
                        return;
                    }
                    iM17654 = C6461.m17654(strSubstring);
                } else {
                    iM17654 = Integer.parseInt(string);
                }
            } else if (zIsChecked3) {
                C14690.m35219(string);
            }
            iM17654 = 0;
        } else if (zIsChecked4) {
            if (!string.startsWith("0x") || string.startsWith("0X")) {
                strSubstring = string.substring(2);
            } else {
                strSubstring = string;
            }
            if (!C6461.m17651(strSubstring)) {
                C15829.m37611(R.string.MT_Protector);
                c9160.requestFocus();
                return;
            }
            iM17654 = C6461.m17654(strSubstring);
        } else {
            try {
                iM17654 = Integer.parseInt(string);
            } catch (NumberFormatException unused) {
                C15829.m37611(R.string.MT_Protector);
                c9160.requestFocus();
                return;
            }
        }
        c9160.m23519();
        InterfaceC17314 interfaceC17314Edit = this.f10978.edit();
        if (!this.f10968) {
            interfaceC17314Edit.putString("arsc_search_path", string2);
        }
        interfaceC17314Edit.mo4065(selectedItemPosition, "arsc_search_type").putBoolean("dex_search_sub", zIsChecked).putBoolean("dex_search_match_case", zIsChecked2).putBoolean("dex_search_regex", zIsChecked3).putBoolean("dex_search_hex", zIsChecked4).putBoolean("dex_search_exactly_match", zIsChecked5).apply();
        this.f10975.dismiss();
        ViewOnClickListenerC2917 viewOnClickListenerC2917 = (ViewOnClickListenerC2917) this.f10977.f6081;
        C8229 c8229 = (C8229) viewOnClickListenerC2917.f10964.m42658().m44956();
        C13638.requireNonNull(c8229);
        C1777 c1777 = new C1777(viewOnClickListenerC2917.f10974);
        c1777.m5837(R.string.MT_Protector);
        c1777.m5832(C16737.m39264(R.string.MT_Protector, 0));
        c1777.mo5828((Runnable) null);
        c1777.mo5843();
        C9269 c9269 = new C9269(viewOnClickListenerC2917, c1777);
        if (!viewOnClickListenerC2917.f10968) {
            if (string2.startsWith("/")) {
                strConcat = string2.substring(1);
            } else {
                if (string2.length() <= 0 || string2.endsWith("/")) {
                    str = string2;
                } else {
                    strConcat = string2.concat("/");
                }
                C14913.m35658(c8229, string, str, iM17654, selectedItemPosition, zIsChecked, zIsChecked2, zIsChecked3, zIsChecked5, c9269, null);
                return;
            }
            str = strConcat;
            C14913.m35658(c8229, string, str, iM17654, selectedItemPosition, zIsChecked, zIsChecked2, zIsChecked3, zIsChecked5, c9269, null);
            return;
        }
        String strConcat2 = viewOnClickListenerC2917.f10965;
        if (strConcat2.startsWith("/")) {
            strConcat2 = strConcat2.substring(1);
        } else if (strConcat2.length() > 0 && !strConcat2.endsWith("/")) {
            strConcat2 = strConcat2.concat("/");
        }
        C14913.m35658(c8229, string, strConcat2, iM17654, selectedItemPosition, true, zIsChecked2, zIsChecked3, zIsChecked5, c9269, viewOnClickListenerC2917.f10976);
    }
}
