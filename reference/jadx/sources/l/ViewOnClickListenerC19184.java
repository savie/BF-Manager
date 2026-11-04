package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import bin.mt.plus.R;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩳܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1E5 */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC19184 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f62036;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final CheckBox f62037;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C23255 f62038;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final CheckBox f62039;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f62040;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final CheckBox f62041;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final CheckBox f62042;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9801 f62043;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final CheckBox f62044;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final View f62045;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f62046;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ActivityC0848 f62047;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17771 f62048;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Set f62049;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C0539 f62050;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final Spinner f62051;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final C22761 f62052;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public ViewOnClickListenerC19184(ComponentCallbacksC11612 componentCallbacksC11612, String str) {
        String strConcat = str;
        InterfaceC9801 interfaceC9801 = ApplicationC17729.f58258;
        this.f62043 = interfaceC9801;
        ActivityC0848 activityC0848 = (ActivityC0848) componentCallbacksC11612.requireActivity();
        this.f62047 = activityC0848;
        this.f62052 = (C22761) new C16196(activityC0848).m38422(C22761.class);
        View viewM40395 = activityC0848.m40395(R.layout.MT_Protector);
        this.f62045 = viewM40395;
        C17771 c17771 = (C17771) viewM40395.findViewById(R.id.MT_Protector);
        this.f62048 = c17771;
        c17771.m41595(C10826.m27556(), (String) null);
        C23255 c23255 = (C23255) viewM40395.findViewById(R.id.editText2);
        this.f62038 = c23255;
        Spinner spinner = (Spinner) viewM40395.findViewById(R.id.spinner);
        this.f62051 = spinner;
        CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f62039 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f62037 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM40395.findViewById(R.id.checkBox2);
        this.f62042 = checkBox3;
        CheckBox checkBox4 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f62044 = checkBox4;
        CheckBox checkBox5 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f62041 = checkBox5;
        String strConcat2 = "/";
        if (strConcat == null) {
            String string = interfaceC9801.getString("arsc_search_path", null);
            if (string != null && !string.isEmpty()) {
                strConcat2 = !string.endsWith("/") ? string.concat("/") : string;
            }
            c23255.mo52335((CharSequence) strConcat2);
        } else {
            if (str.isEmpty()) {
                strConcat = "/";
            } else if (!strConcat.endsWith("/")) {
                strConcat = strConcat.concat("/");
            }
            c23255.mo52335((CharSequence) strConcat);
        }
        spinner.setSelection(interfaceC9801.getInt("arsc_search_type", 0));
        onItemSelected(null, null, spinner.getSelectedItemPosition(), 0L);
        spinner.setOnItemSelectedListener(this);
        checkBox.setChecked(interfaceC9801.getBoolean("dex_search_sub", true));
        checkBox2.setChecked(interfaceC9801.getBoolean("dex_search_match_case", false));
        checkBox3.setChecked(interfaceC9801.getBoolean("dex_search_regex", false));
        checkBox4.setChecked(interfaceC9801.getBoolean("dex_search_hex", true));
        checkBox5.setChecked(interfaceC9801.getBoolean("dex_search_exactly_match", true));
        this.f62050 = new C0539(this);
        m44457();
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ܿܺۧ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f60037.m44457();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m44457() {
        CheckBox checkBox = this.f62042;
        this.f62048.m41606(checkBox.isChecked() && checkBox.getVisibility() == 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44460(C1878 c1878) {
        this.f62040 = true;
        this.f62049 = c1878.m6424();
        this.f62046 = c1878.m6430();
        this.f62039.setVisibility(8);
        C23255 c23255 = this.f62038;
        c23255.mo52335((CharSequence) c23255.getContext().getString(R.string.MT_Protector));
        c23255.setEnabled(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44459() {
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(this.f62047);
        c2361.m8005(this.f62045);
        DialogInterfaceC8327 dialogInterfaceC8327M34866 = C14442.m34866(c2361, R.string.MT_Protector, null, R.string.MT_Protector, null);
        this.f62036 = dialogInterfaceC8327M34866;
        dialogInterfaceC8327M34866.m22436().setOnClickListener(this);
        C17771 c17771 = this.f62048;
        c17771.requestFocus();
        C21576.m49090(c17771.m41605());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f62048.m41597(i == 0 || i == 2);
        CheckBox checkBox = this.f62041;
        CheckBox checkBox2 = this.f62044;
        CheckBox checkBox3 = this.f62042;
        CheckBox checkBox4 = this.f62037;
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
        m44457();
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
        int iM29456;
        String str;
        String strConcat;
        String strSubstring;
        C17771 c17771 = this.f62048;
        String string = c17771.m41599().toString();
        if (string.isEmpty()) {
            this.f62036.dismiss();
            return;
        }
        String string2 = this.f62038.m54021().toString();
        int selectedItemPosition = this.f62051.getSelectedItemPosition();
        boolean zIsChecked = this.f62039.isChecked();
        boolean zIsChecked2 = this.f62037.isChecked();
        boolean zIsChecked3 = this.f62042.isChecked();
        boolean zIsChecked4 = this.f62044.isChecked();
        boolean zIsChecked5 = this.f62041.isChecked();
        if (selectedItemPosition == 0) {
            if (zIsChecked3) {
                try {
                    C18415.m42925(string);
                } catch (Exception e) {
                    C22673.m51154((CharSequence) e.getMessage());
                    c17771.requestFocus();
                    return;
                }
            }
            iM29456 = 0;
        } else if (selectedItemPosition != 1) {
            if (selectedItemPosition != 2) {
                if (selectedItemPosition != 3) {
                    if (selectedItemPosition == 4) {
                        boolean zStartsWith = string.startsWith("#");
                        if (zStartsWith) {
                            zStartsWith = C11730.m29457(string.substring(1));
                        }
                        if (!zStartsWith) {
                            C22673.m51154((CharSequence) C21576.m49088(R.string.MT_Protector).concat(" (#RRGGBB, #AARRGGBB...)"));
                            c17771.requestFocus();
                            return;
                        }
                        iM29456 = C11730.m29451(string.substring(1));
                    }
                } else if (zIsChecked4) {
                    if (string.startsWith("0x")) {
                        strSubstring = string.substring(2);
                    } else {
                        strSubstring = string.substring(2);
                    }
                    if (!C11730.m29461(strSubstring)) {
                        C22673.m51152(R.string.MT_Protector);
                        c17771.requestFocus();
                        return;
                    }
                    iM29456 = C11730.m29456(strSubstring);
                } else {
                    iM29456 = Integer.parseInt(string);
                }
            } else if (zIsChecked3) {
                C18415.m42925(string);
            }
            iM29456 = 0;
        } else if (zIsChecked4) {
            if (!string.startsWith("0x") || string.startsWith("0X")) {
                strSubstring = string.substring(2);
            } else {
                strSubstring = string;
            }
            if (!C11730.m29461(strSubstring)) {
                C22673.m51152(R.string.MT_Protector);
                c17771.requestFocus();
                return;
            }
            iM29456 = C11730.m29456(strSubstring);
        } else {
            try {
                iM29456 = Integer.parseInt(string);
            } catch (NumberFormatException unused) {
                C22673.m51152(R.string.MT_Protector);
                c17771.requestFocus();
                return;
            }
        }
        c17771.m41603();
        InterfaceC18752 interfaceC18752Edit = this.f62043.edit();
        if (!this.f62040) {
            interfaceC18752Edit.putString("arsc_search_path", string2);
        }
        interfaceC18752Edit.mo3486(selectedItemPosition, "arsc_search_type").putBoolean("dex_search_sub", zIsChecked).putBoolean("dex_search_match_case", zIsChecked2).putBoolean("dex_search_regex", zIsChecked3).putBoolean("dex_search_hex", zIsChecked4).putBoolean("dex_search_exactly_match", zIsChecked5).apply();
        this.f62036.dismiss();
        ViewOnClickListenerC19184 viewOnClickListenerC19184 = this.f62050.f2256;
        C11967 c11967 = (C11967) viewOnClickListenerC19184.f62052.m51322().m40346();
        C17359.requireNonNull(c11967);
        C10745 c10745 = new C10745(viewOnClickListenerC19184.f62047);
        c10745.m27397(R.string.MT_Protector);
        c10745.m27393(C21576.m49059(R.string.MT_Protector, 0));
        c10745.mo25916((Runnable) null);
        c10745.mo25931();
        C7997 c7997 = new C7997(viewOnClickListenerC19184, c10745);
        if (!viewOnClickListenerC19184.f62040) {
            if (string2.startsWith("/")) {
                strConcat = string2.substring(1);
            } else {
                if (string2.length() <= 0 || string2.endsWith("/")) {
                    str = string2;
                } else {
                    strConcat = string2.concat("/");
                }
                C13217.m32751(c11967, string, str, iM29456, selectedItemPosition, zIsChecked, zIsChecked2, zIsChecked3, zIsChecked5, c7997, null);
                return;
            }
            str = strConcat;
            C13217.m32751(c11967, string, str, iM29456, selectedItemPosition, zIsChecked, zIsChecked2, zIsChecked3, zIsChecked5, c7997, null);
            return;
        }
        String strConcat2 = viewOnClickListenerC19184.f62046;
        if (strConcat2.startsWith("/")) {
            strConcat2 = strConcat2.substring(1);
        } else if (strConcat2.length() > 0 && !strConcat2.endsWith("/")) {
            strConcat2 = strConcat2.concat("/");
        }
        C13217.m32751(c11967, string, strConcat2, iM29456, selectedItemPosition, true, zIsChecked2, zIsChecked3, zIsChecked5, c7997, viewOnClickListenerC19184.f62049);
    }
}
