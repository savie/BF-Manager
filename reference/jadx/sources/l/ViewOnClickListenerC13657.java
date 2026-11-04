package l;

import android.os.PowerManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import bin.mt.plus.R;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.۬ۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5HP */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC13657 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f43365;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Set f43366;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final CheckBox f43367;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f43368;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C23255 f43369;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final CheckBox f43370;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final InterfaceC9801 f43371;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final CheckBox f43372;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final View f43373;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final CheckBox f43374;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final CheckBox f43375;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ActivityC0848 f43376;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final C22761 f43377;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17771 f43378;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CheckBox f43379;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final View f43380;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C9928 f43381;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public String f43382;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final Spinner f43383;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public ViewOnClickListenerC13657(ComponentCallbacksC11612 componentCallbacksC11612, String str) {
        String strConcat = str;
        InterfaceC9801 interfaceC9801 = ApplicationC17729.f58258;
        this.f43371 = interfaceC9801;
        ActivityC0848 activityC0848 = (ActivityC0848) componentCallbacksC11612.requireActivity();
        this.f43376 = activityC0848;
        this.f43377 = (C22761) new C16196(activityC0848).m38422(C22761.class);
        View viewM40395 = activityC0848.m40395(R.layout.MT_Protector);
        this.f43380 = viewM40395;
        C17771 c17771 = (C17771) viewM40395.findViewById(R.id.MT_Protector);
        this.f43378 = c17771;
        c17771.m41595(C10826.m27556(), (String) null);
        C23255 c23255 = (C23255) viewM40395.findViewById(R.id.editText2);
        this.f43369 = c23255;
        View viewFindViewById = viewM40395.findViewById(R.id.MT_Protector);
        this.f43373 = viewFindViewById;
        CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f43379 = checkBox;
        c23255.m53899(new C9182(this));
        Spinner spinner = (Spinner) viewM40395.findViewById(R.id.spinner);
        this.f43383 = spinner;
        CheckBox checkBox2 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f43374 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f43367 = checkBox3;
        CheckBox checkBox4 = (CheckBox) viewM40395.findViewById(R.id.checkBox2);
        this.f43375 = checkBox4;
        CheckBox checkBox5 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f43372 = checkBox5;
        CheckBox checkBox6 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f43370 = checkBox6;
        String strConcat2 = "/";
        if (strConcat == null) {
            String string = interfaceC9801.getString("dex_search_path", null);
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
        spinner.setSelection(interfaceC9801.getInt("dex_search_type", 0));
        onItemSelected(null, null, spinner.getSelectedItemPosition(), 0L);
        spinner.setOnItemSelectedListener(this);
        checkBox2.setChecked(interfaceC9801.getBoolean("dex_search_sub", true));
        checkBox3.setChecked(interfaceC9801.getBoolean("dex_search_match_case", false));
        checkBox4.setChecked(interfaceC9801.getBoolean("dex_search_regex", false));
        checkBox5.setChecked(interfaceC9801.getBoolean("dex_search_hex", true));
        checkBox6.setChecked(interfaceC9801.getBoolean("dex_search_exactly_match", true));
        this.f43381 = new C9928(this);
        checkBox.setChecked(interfaceC9801.getBoolean("dseb", false));
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.۟ۛۧ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C6421.m18184(this.f25386.f43371, "dseb", z);
            }
        });
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC18879(0, this));
        m33438();
        checkBox4.setOnCheckedChangeListener(new C9568(3, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33432(ViewOnClickListenerC13657 viewOnClickListenerC13657) {
        C8437 c8437 = new C8437(viewOnClickListenerC13657.f43376, -1);
        c8437.m22945(R.string.MT_Protector);
        c8437.m22958(C21576.m49059(R.string.MT_Protector, "com/gms/\nandroidx/"));
        c8437.m22924((CharSequence) ApplicationC17729.f58258.getString("dsel", ""));
        c8437.m22961();
        c8437.m22955(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m33438() {
        CheckBox checkBox = this.f43375;
        this.f43378.m41606(checkBox.isChecked() && checkBox.getVisibility() == 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33442(C1878 c1878) {
        this.f43368 = true;
        this.f43366 = c1878.m6424();
        this.f43382 = c1878.m6430();
        this.f43374.setVisibility(8);
        C23255 c23255 = this.f43369;
        c23255.mo52335((CharSequence) c23255.getContext().getString(R.string.MT_Protector));
        c23255.setEnabled(false);
        this.f43373.setEnabled(false);
        this.f43379.setEnabled(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33441() {
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(this.f43376);
        c2361.m8005(this.f43380);
        DialogInterfaceC8327 dialogInterfaceC8327M34866 = C14442.m34866(c2361, R.string.MT_Protector, null, R.string.MT_Protector, null);
        this.f43365 = dialogInterfaceC8327M34866;
        dialogInterfaceC8327M34866.m22436().setOnClickListener(this);
        C17771 c17771 = this.f43378;
        c17771.requestFocus();
        C21576.m49090(c17771.m41605());
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f43378.m41597(i == 0 || i == 4);
        CheckBox checkBox = this.f43370;
        CheckBox checkBox2 = this.f43372;
        CheckBox checkBox3 = this.f43375;
        CheckBox checkBox4 = this.f43367;
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
        m33438();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:52:0x016a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0172  */
    /* JADX WARN: Code duplicated, block: B:55:0x0178  */
    /* JADX WARN: Code duplicated, block: B:62:0x0199  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f6  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        long j;
        int i2;
        InterfaceC18752 interfaceC18752Edit;
        ViewOnClickListenerC13657 viewOnClickListenerC13657;
        C6946 c6946;
        C20283 c20283;
        C0980 c0980;
        String strConcat;
        C17771 c17771 = this.f43378;
        String string = c17771.m41599().toString();
        if (string.isEmpty()) {
            this.f43365.dismiss();
            return;
        }
        String string2 = this.f43369.m54021().toString();
        int selectedItemPosition = this.f43383.getSelectedItemPosition();
        boolean zIsChecked = this.f43374.isChecked();
        boolean zIsChecked2 = this.f43367.isChecked();
        boolean zIsChecked3 = this.f43375.isChecked();
        boolean zIsChecked4 = this.f43372.isChecked();
        boolean zIsChecked5 = this.f43370.isChecked();
        if (selectedItemPosition != 0 && selectedItemPosition != 1 && selectedItemPosition != 2 && selectedItemPosition != 3 && selectedItemPosition != 4) {
            if (selectedItemPosition != 5) {
                i = 0;
            } else if (zIsChecked4) {
                String strSubstring = (string.startsWith("0x") || string.startsWith("0X")) ? string.substring(2) : string;
                if (C11730.m29461(strSubstring)) {
                    char[] charArray = strSubstring.toCharArray();
                    int length = charArray.length;
                    char c = 4;
                    int i3 = 0;
                    long jM29452 = 0;
                    while (i3 < length) {
                        jM29452 = (jM29452 << c) | ((long) C11730.m29452(charArray[i3]));
                        i3++;
                        charArray = charArray;
                        c = 4;
                    }
                    i2 = 0;
                    j = jM29452;
                } else {
                    C22673.m51152(R.string.MT_Protector);
                    c17771.requestFocus();
                    return;
                }
            } else {
                i2 = 0;
                try {
                    j = Long.parseLong(string);
                } catch (NumberFormatException unused) {
                    C22673.m51152(R.string.MT_Protector);
                    c17771.requestFocus();
                    return;
                }
            }
            c17771.m41603();
            interfaceC18752Edit = this.f43371.edit();
            if (!this.f43368) {
                interfaceC18752Edit.putString("dex_search_path", string2);
            }
            interfaceC18752Edit.mo3486(selectedItemPosition, "dex_search_type").putBoolean("dex_search_sub", zIsChecked).putBoolean("dex_search_match_case", zIsChecked2).putBoolean("dex_search_regex", zIsChecked3).putBoolean("dex_search_hex", zIsChecked4).putBoolean("dex_search_exactly_match", zIsChecked5).apply();
            this.f43365.dismiss();
            viewOnClickListenerC13657 = (ViewOnClickListenerC13657) this.f43381.f31861;
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) C21576.m49084().getSystemService("power")).newWakeLock(1, C21576.m49092().concat(":DexPlus"));
            wakeLockNewWakeLock.acquire();
            C10745 c10745 = new C10745(viewOnClickListenerC13657.f43376);
            c10745.m27397(R.string.MT_Protector);
            Object[] objArr = new Object[1];
            objArr[i2] = Integer.valueOf(i2);
            c10745.m27393(C21576.m49059(R.string.MT_Protector, objArr));
            c10745.mo25916((Runnable) null);
            c10745.mo25931();
            c6946 = new C6946(viewOnClickListenerC13657, c10745, wakeLockNewWakeLock);
            c20283 = (C20283) viewOnClickListenerC13657.f43377.m51321().m40346();
            C17359.requireNonNull(c20283);
            if (viewOnClickListenerC13657.f43368) {
                strConcat = viewOnClickListenerC13657.f43382;
                if (strConcat.startsWith("/")) {
                    strConcat = strConcat.substring(1);
                } else if (strConcat.length() > 0 && !strConcat.endsWith("/")) {
                    strConcat = strConcat.concat("/");
                }
                String str = strConcat;
                Set set = viewOnClickListenerC13657.f43366;
                C17359.requireNonNull(set);
                C14818.m35679(c20283, string, str, j, selectedItemPosition, true, zIsChecked2, zIsChecked3, zIsChecked5, c6946, new C14403(set));
                return;
            }
            if (viewOnClickListenerC13657.f43373.isEnabled() || !viewOnClickListenerC13657.f43379.isChecked()) {
                c0980 = null;
            } else {
                int i4 = 2;
                List list = (List) C13847.stream(ApplicationC17729.f58258.getString("dsel", "").split("\n")).map(new C22493(i4)).filter(new C23326(i4)).collect(C2025.toList());
                if (list.isEmpty()) {
                    c0980 = null;
                } else {
                    c0980 = new C0980(0, list);
                }
            }
            if (string2.startsWith("/")) {
                string2 = string2.substring(1);
            } else if (string2.length() > 0 && !string2.endsWith("/")) {
                string2 = string2.concat("/");
            }
            C14818.m35679(c20283, string, string2, j, selectedItemPosition, zIsChecked, zIsChecked2, zIsChecked3, zIsChecked5, c6946, c0980);
        }
        i = 0;
        if (zIsChecked3) {
            try {
                C18415.m42925(string);
            } catch (Exception e) {
                C22673.m51154((CharSequence) e.getMessage());
                c17771.requestFocus();
                return;
            }
        }
        i2 = i;
        j = 0;
        c17771.m41603();
        interfaceC18752Edit = this.f43371.edit();
        if (!this.f43368) {
            interfaceC18752Edit.putString("dex_search_path", string2);
        }
        interfaceC18752Edit.mo3486(selectedItemPosition, "dex_search_type").putBoolean("dex_search_sub", zIsChecked).putBoolean("dex_search_match_case", zIsChecked2).putBoolean("dex_search_regex", zIsChecked3).putBoolean("dex_search_hex", zIsChecked4).putBoolean("dex_search_exactly_match", zIsChecked5).apply();
        this.f43365.dismiss();
        viewOnClickListenerC13657 = (ViewOnClickListenerC13657) this.f43381.f31861;
        PowerManager.WakeLock wakeLockNewWakeLock2 = ((PowerManager) C21576.m49084().getSystemService("power")).newWakeLock(1, C21576.m49092().concat(":DexPlus"));
        wakeLockNewWakeLock2.acquire();
        C10745 c10746 = new C10745(viewOnClickListenerC13657.f43376);
        c10746.m27397(R.string.MT_Protector);
        Object[] objArr2 = new Object[1];
        objArr2[i2] = Integer.valueOf(i2);
        c10746.m27393(C21576.m49059(R.string.MT_Protector, objArr2));
        c10746.mo25916((Runnable) null);
        c10746.mo25931();
        c6946 = new C6946(viewOnClickListenerC13657, c10746, wakeLockNewWakeLock2);
        c20283 = (C20283) viewOnClickListenerC13657.f43377.m51321().m40346();
        C17359.requireNonNull(c20283);
        if (viewOnClickListenerC13657.f43368) {
            strConcat = viewOnClickListenerC13657.f43382;
            if (strConcat.startsWith("/")) {
                strConcat = strConcat.substring(1);
            } else if (strConcat.length() > 0) {
                strConcat = strConcat.concat("/");
            }
            String str2 = strConcat;
            Set set2 = viewOnClickListenerC13657.f43366;
            C17359.requireNonNull(set2);
            C14818.m35679(c20283, string, str2, j, selectedItemPosition, true, zIsChecked2, zIsChecked3, zIsChecked5, c6946, new C14403(set2));
            return;
        }
        if (viewOnClickListenerC13657.f43373.isEnabled()) {
            c0980 = null;
        } else {
            c0980 = null;
        }
        if (string2.startsWith("/")) {
            string2 = string2.substring(1);
        } else if (string2.length() > 0) {
            string2 = string2.concat("/");
        }
        C14818.m35679(c20283, string, string2, j, selectedItemPosition, zIsChecked, zIsChecked2, zIsChecked3, zIsChecked5, c6946, c0980);
    }
}
