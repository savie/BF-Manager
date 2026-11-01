package l;

import android.content.DialogInterface;
import android.os.PowerManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import bin.mt.plus.R;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۨ᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5HP */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC11989 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C9160 f40165;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC6025 f40166;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final Spinner f40167;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final CheckBox f40168;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f40169;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final View f40170;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final View f40171;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C10948 f40172;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Set f40173;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final CheckBox f40174;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final CheckBox f40175;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public String f40176;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final CheckBox f40177;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ActivityC5677 f40178;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f40179;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CheckBox f40180;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C0392 f40181;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final C18377 f40182;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final CheckBox f40183;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public ViewOnClickListenerC11989(ComponentCallbacksC22654 componentCallbacksC22654, String str) {
        String strConcat = str;
        InterfaceC6025 interfaceC6025 = ApplicationC0716.f2992;
        this.f40166 = interfaceC6025;
        ActivityC5677 activityC5677 = (ActivityC5677) componentCallbacksC22654.requireActivity();
        this.f40178 = activityC5677;
        this.f40182 = (C18377) new C16717(activityC5677).m39205(C18377.class);
        View viewM30995 = activityC5677.m30995(R.layout.MT_Protector);
        this.f40170 = viewM30995;
        C9160 c9160 = (C9160) viewM30995.findViewById(R.id.MT_Protector);
        this.f40165 = c9160;
        c9160.m23508(C21905.m48704(), (String) null);
        C10948 c10948 = (C10948) viewM30995.findViewById(R.id.editText2);
        this.f40172 = c10948;
        View viewFindViewById = viewM30995.findViewById(R.id.MT_Protector);
        this.f40171 = viewFindViewById;
        CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f40180 = checkBox;
        c10948.m16853(new C3023(this));
        Spinner spinner = (Spinner) viewM30995.findViewById(R.id.spinner);
        this.f40167 = spinner;
        CheckBox checkBox2 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f40174 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f40177 = checkBox3;
        CheckBox checkBox4 = (CheckBox) viewM30995.findViewById(R.id.checkBox2);
        this.f40168 = checkBox4;
        CheckBox checkBox5 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f40183 = checkBox5;
        CheckBox checkBox6 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f40175 = checkBox6;
        String strConcat2 = "/";
        if (strConcat == null) {
            String string = interfaceC6025.getString("dex_search_path", null);
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
        spinner.setSelection(interfaceC6025.getInt("dex_search_type", 0));
        onItemSelected(null, null, spinner.getSelectedItemPosition(), 0L);
        spinner.setOnItemSelectedListener(this);
        checkBox2.setChecked(interfaceC6025.getBoolean("dex_search_sub", true));
        checkBox3.setChecked(interfaceC6025.getBoolean("dex_search_match_case", false));
        checkBox4.setChecked(interfaceC6025.getBoolean("dex_search_regex", false));
        checkBox5.setChecked(interfaceC6025.getBoolean("dex_search_hex", true));
        checkBox6.setChecked(interfaceC6025.getBoolean("dex_search_exactly_match", true));
        this.f40181 = new C0392(this);
        checkBox.setChecked(interfaceC6025.getBoolean("dseb", false));
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩻ۚۜ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C1679.m5597(this.f76046.f40166, "dseb", z);
            }
        });
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC6505(7, this));
        m29852();
        checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ܳۚۜ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f46885.m29852();
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29848(ViewOnClickListenerC11989 viewOnClickListenerC11989) {
        C4932 c4932 = new C4932(viewOnClickListenerC11989.f40178, -1);
        c4932.m40376(R.string.MT_Protector);
        c4932.m40360(C16737.m39264(R.string.MT_Protector, "com/gms/\nandroidx/"));
        c4932.m40346((CharSequence) ApplicationC0716.f2992.getString("dsel", ""));
        c4932.m40369();
        c4932.m40368(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m29852() {
        CheckBox checkBox = this.f40168;
        this.f40165.m23518(checkBox.isChecked() && checkBox.getVisibility() == 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29856(C10617 c10617) {
        this.f40169 = true;
        this.f40173 = c10617.m26797();
        this.f40176 = c10617.m26795();
        this.f40174.setVisibility(8);
        C10948 c10948 = this.f40172;
        c10948.mo16989((CharSequence) c10948.getContext().getString(R.string.MT_Protector));
        c10948.setEnabled(false);
        this.f40171.setEnabled(false);
        this.f40180.setEnabled(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29855() {
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(this.f40178);
        c8067.m21258(this.f40170);
        DialogInterfaceC19356 dialogInterfaceC19356M10334 = C3509.m10334(c8067, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f40179 = dialogInterfaceC19356M10334;
        dialogInterfaceC19356M10334.m44373().setOnClickListener(this);
        C9160 c9160 = this.f40165;
        c9160.requestFocus();
        C16737.m39290(c9160.m23516());
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f40165.m23510(i == 0 || i == 4);
        CheckBox checkBox = this.f40175;
        CheckBox checkBox2 = this.f40183;
        CheckBox checkBox3 = this.f40168;
        CheckBox checkBox4 = this.f40177;
        if (i == 0) {
            checkBox4.setVisibility(0);
            checkBox3.setVisibility(0);
            checkBox2.setVisibility(8);
            checkBox.setVisibility(8);
        } else if (i == 1 || i == 2 || i == 3 || i == 4) {
            checkBox4.setVisibility(0);
            checkBox3.setVisibility(0);
            checkBox.setVisibility(0);
            checkBox2.setVisibility(8);
        } else if (i == 5) {
            checkBox4.setVisibility(8);
            checkBox3.setVisibility(8);
            checkBox2.setVisibility(0);
            checkBox.setVisibility(8);
        }
        m29852();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:52:0x016d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0175  */
    /* JADX WARN: Code duplicated, block: B:55:0x017b  */
    /* JADX WARN: Code duplicated, block: B:62:0x019e  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01fa  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        long j;
        InterfaceC17314 interfaceC17314Edit;
        ViewOnClickListenerC11989 viewOnClickListenerC11989;
        C14106 c14106;
        C6094 c6094;
        C9375 c9375;
        String strConcat;
        C9160 c9160 = this.f40165;
        String string = c9160.m23513().toString();
        if (string.isEmpty()) {
            this.f40179.dismiss();
            return;
        }
        String string2 = this.f40172.m17000().toString();
        int selectedItemPosition = this.f40167.getSelectedItemPosition();
        boolean zIsChecked = this.f40174.isChecked();
        boolean zIsChecked2 = this.f40177.isChecked();
        boolean zIsChecked3 = this.f40168.isChecked();
        boolean zIsChecked4 = this.f40183.isChecked();
        boolean zIsChecked5 = this.f40175.isChecked();
        if (selectedItemPosition != 0 && selectedItemPosition != 1 && selectedItemPosition != 2 && selectedItemPosition != 3 && selectedItemPosition != 4) {
            if (selectedItemPosition != 5) {
                i = 0;
            } else if (zIsChecked4) {
                char c = 4;
                String strSubstring = (string.startsWith("0x") || string.startsWith("0X")) ? string.substring(2) : string;
                if (C6461.m17651(strSubstring)) {
                    char[] charArray = strSubstring.toCharArray();
                    int length = charArray.length;
                    int i2 = 0;
                    long jM17647 = 0;
                    while (i2 < length) {
                        jM17647 = (jM17647 << c) | ((long) C6461.m17647(charArray[i2]));
                        i2++;
                        charArray = charArray;
                        length = length;
                        c = 4;
                    }
                    i = 0;
                    j = jM17647;
                } else {
                    C15829.m37611(R.string.MT_Protector);
                    c9160.requestFocus();
                    return;
                }
            } else {
                try {
                    j = Long.parseLong(string);
                    i = 0;
                } catch (NumberFormatException unused) {
                    C15829.m37611(R.string.MT_Protector);
                    c9160.requestFocus();
                    return;
                }
            }
            c9160.m23519();
            interfaceC17314Edit = this.f40166.edit();
            if (!this.f40169) {
                interfaceC17314Edit.putString("dex_search_path", string2);
            }
            interfaceC17314Edit.mo4065(selectedItemPosition, "dex_search_type").putBoolean("dex_search_sub", zIsChecked).putBoolean("dex_search_match_case", zIsChecked2).putBoolean("dex_search_regex", zIsChecked3).putBoolean("dex_search_hex", zIsChecked4).putBoolean("dex_search_exactly_match", zIsChecked5).apply();
            this.f40179.dismiss();
            viewOnClickListenerC11989 = (ViewOnClickListenerC11989) this.f40181.f1871;
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) C16737.m39277().getSystemService("power")).newWakeLock(1, C16737.m39293().concat(":DexPlus"));
            wakeLockNewWakeLock.acquire();
            C1777 c1777 = new C1777(viewOnClickListenerC11989.f40178);
            c1777.m5837(R.string.MT_Protector);
            Object[] objArr = new Object[1];
            objArr[i] = Integer.valueOf(i);
            c1777.m5832(C16737.m39264(R.string.MT_Protector, objArr));
            c1777.mo5828((Runnable) null);
            c1777.mo5843();
            c14106 = new C14106(viewOnClickListenerC11989, c1777, wakeLockNewWakeLock);
            c6094 = (C6094) viewOnClickListenerC11989.f40182.m42622().m44956();
            C13638.requireNonNull(c6094);
            if (viewOnClickListenerC11989.f40169) {
                strConcat = viewOnClickListenerC11989.f40176;
                if (strConcat.startsWith("/")) {
                    strConcat = strConcat.substring(1);
                } else if (strConcat.length() > 0 && !strConcat.endsWith("/")) {
                    strConcat = strConcat.concat("/");
                }
                String str = strConcat;
                Set set = viewOnClickListenerC11989.f40173;
                C13638.requireNonNull(set);
                C23672.m52121(c6094, string, str, j, selectedItemPosition, true, zIsChecked2, zIsChecked3, zIsChecked5, (InterfaceC16966) c14106, (Predicate) new C12197(0, set));
                return;
            }
            if (viewOnClickListenerC11989.f40171.isEnabled() || !viewOnClickListenerC11989.f40180.isChecked()) {
                c9375 = null;
            } else {
                int i3 = 0;
                List list = (List) C20318.stream(ApplicationC0716.f2992.getString("dsel", "").split("\n")).map(new C5008(3)).filter(new C1612(i3)).collect(C1890.toList());
                if (list.isEmpty()) {
                    c9375 = null;
                } else {
                    c9375 = new C9375(i3, list);
                }
            }
            if (string2.startsWith("/")) {
                string2 = string2.substring(1);
            } else if (string2.length() > 0 && !string2.endsWith("/")) {
                string2 = string2.concat("/");
            }
            C23672.m52121(c6094, string, string2, j, selectedItemPosition, zIsChecked, zIsChecked2, zIsChecked3, zIsChecked5, c14106, c9375);
        }
        i = 0;
        if (zIsChecked3) {
            try {
                C14690.m35219(string);
            } catch (Exception e) {
                C15829.m37613((CharSequence) e.getMessage());
                c9160.requestFocus();
                return;
            }
        }
        j = 0;
        c9160.m23519();
        interfaceC17314Edit = this.f40166.edit();
        if (!this.f40169) {
            interfaceC17314Edit.putString("dex_search_path", string2);
        }
        interfaceC17314Edit.mo4065(selectedItemPosition, "dex_search_type").putBoolean("dex_search_sub", zIsChecked).putBoolean("dex_search_match_case", zIsChecked2).putBoolean("dex_search_regex", zIsChecked3).putBoolean("dex_search_hex", zIsChecked4).putBoolean("dex_search_exactly_match", zIsChecked5).apply();
        this.f40179.dismiss();
        viewOnClickListenerC11989 = (ViewOnClickListenerC11989) this.f40181.f1871;
        PowerManager.WakeLock wakeLockNewWakeLock2 = ((PowerManager) C16737.m39277().getSystemService("power")).newWakeLock(1, C16737.m39293().concat(":DexPlus"));
        wakeLockNewWakeLock2.acquire();
        C1777 c1778 = new C1777(viewOnClickListenerC11989.f40178);
        c1778.m5837(R.string.MT_Protector);
        Object[] objArr2 = new Object[1];
        objArr2[i] = Integer.valueOf(i);
        c1778.m5832(C16737.m39264(R.string.MT_Protector, objArr2));
        c1778.mo5828((Runnable) null);
        c1778.mo5843();
        c14106 = new C14106(viewOnClickListenerC11989, c1778, wakeLockNewWakeLock2);
        c6094 = (C6094) viewOnClickListenerC11989.f40182.m42622().m44956();
        C13638.requireNonNull(c6094);
        if (viewOnClickListenerC11989.f40169) {
            strConcat = viewOnClickListenerC11989.f40176;
            if (strConcat.startsWith("/")) {
                strConcat = strConcat.substring(1);
            } else if (strConcat.length() > 0) {
                strConcat = strConcat.concat("/");
            }
            String str2 = strConcat;
            Set set2 = viewOnClickListenerC11989.f40173;
            C13638.requireNonNull(set2);
            C23672.m52121(c6094, string, str2, j, selectedItemPosition, true, zIsChecked2, zIsChecked3, zIsChecked5, (InterfaceC16966) c14106, (Predicate) new C12197(0, set2));
            return;
        }
        if (viewOnClickListenerC11989.f40171.isEnabled()) {
            c9375 = null;
        } else {
            c9375 = null;
        }
        if (string2.startsWith("/")) {
            string2 = string2.substring(1);
        } else if (string2.length() > 0) {
            string2 = string2.concat("/");
        }
        C23672.m52121(c6094, string, string2, j, selectedItemPosition, zIsChecked, zIsChecked2, zIsChecked3, zIsChecked5, c14106, c9375);
    }
}
