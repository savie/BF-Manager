package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.᩵۠۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 35GV */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractViewOnClickListenerC20437 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f65455;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final CheckBox f65456;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Spinner f65457;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final List f65458;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C8614 f65459;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final CheckBox f65460;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final CheckBox f65461;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17771 f65462;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CheckBox f65463;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CheckBox f65464;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 f65465;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public AbstractViewOnClickListenerC20437(C8614 c8614, AbstractC22044 abstractC22044, List list, final Runnable runnable) {
        this.f65459 = c8614;
        this.f65455 = abstractC22044;
        this.f65458 = list;
        View viewM40395 = c8614.m23233().m40395(R.layout.MT_Protector);
        if (list != null) {
            ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
        }
        viewM40395.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM40395.findViewById(R.id.editText2).setVisibility(8);
        this.f65462 = (C17771) viewM40395.findViewById(R.id.MT_Protector);
        Spinner spinner = (Spinner) viewM40395.findViewById(R.id.spinner);
        this.f65457 = spinner;
        CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f65456 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM40395.findViewById(R.id.checkBox2);
        this.f65460 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f65464 = checkBox3;
        CheckBox checkBox4 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f65461 = checkBox4;
        CheckBox checkBox5 = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        this.f65463 = checkBox5;
        spinner.setSelection(ApplicationC17729.f58258.getInt("axml_search_type", 0));
        onItemSelected(null, null, spinner.getSelectedItemPosition(), 0L);
        spinner.setOnItemSelectedListener(this);
        checkBox.setChecked(ApplicationC17729.f58258.getBoolean("axml_search_match_case", false));
        checkBox2.setChecked(ApplicationC17729.f58258.getBoolean("axml_search_regex", false));
        checkBox3.setChecked(ApplicationC17729.f58258.getBoolean("axml_search_hex", true));
        checkBox4.setChecked(ApplicationC17729.f58258.getBoolean("axml_search_id2name", true));
        checkBox5.setChecked(ApplicationC17729.f58258.getBoolean("axml_search_exactly_match", true));
        checkBox2.setOnCheckedChangeListener(new C16707(0, this));
        m46868();
        C2361 c2361BuildDialog = c8614.m23233().buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC0212(3, runnable));
        c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8003(new DialogInterface.OnCancelListener() { // from class: l.ܽ۠۫
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        this.f65465 = c2361BuildDialog.m7999();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m46868() {
        CheckBox checkBox = this.f65460;
        this.f65462.m41606(checkBox.isChecked() && checkBox.getVisibility() == 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46871() {
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f65465;
        dialogInterfaceC8327.m22432();
        dialogInterfaceC8327.m22436().setOnClickListener(this);
        dialogInterfaceC8327.m22440().setOnClickListener(new ViewOnClickListenerC25319(2, this));
        C17771 c17771 = this.f65462;
        c17771.requestFocus();
        C21576.m49090(c17771.m41605());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m46869(AbstractViewOnClickListenerC20437 abstractViewOnClickListenerC20437) {
        abstractViewOnClickListenerC20437.f65459.m23233().m40396(R.string.MT_Protector, R.string.MT_Protector, false);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C4245 c4245Matcher;
        int i;
        C4245 c4245;
        int iM29456;
        C17771 c17771 = this.f65462;
        String string = c17771.m41599().toString();
        boolean zIsEmpty = string.isEmpty();
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f65465;
        if (zIsEmpty) {
            dialogInterfaceC8327.dismiss();
            return;
        }
        int selectedItemPosition = this.f65457.getSelectedItemPosition();
        if (selectedItemPosition != 0 || C18978.m44078()) {
            boolean zIsChecked = this.f65456.isChecked();
            boolean zIsChecked2 = this.f65460.isChecked();
            boolean zIsChecked3 = this.f65464.isChecked();
            boolean zIsChecked4 = this.f65461.isChecked();
            boolean zIsChecked5 = this.f65463.isChecked();
            if (selectedItemPosition == 0 || selectedItemPosition == 1) {
                try {
                    c4245Matcher = C3369.m11070(string, zIsChecked2, zIsChecked).matcher((CharSequence) "");
                } catch (Exception e) {
                    C22673.m51154((CharSequence) e.getMessage());
                    c17771.requestFocus();
                    return;
                }
            } else {
                c4245Matcher = null;
                if (selectedItemPosition == 2) {
                    if (zIsChecked3) {
                        if (!string.startsWith("0x") || string.startsWith("0X")) {
                            string = string.substring(2);
                        }
                        if (!C11730.m29461(string)) {
                            C22673.m51152(R.string.MT_Protector);
                            c17771.requestFocus();
                            return;
                        }
                        iM29456 = C11730.m29456(string);
                    } else {
                        try {
                            iM29456 = Integer.parseInt(string);
                        } catch (NumberFormatException unused) {
                            C22673.m51152(R.string.MT_Protector);
                            c17771.requestFocus();
                            return;
                        }
                    }
                } else if (selectedItemPosition == 3) {
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
                } else {
                    if (selectedItemPosition == 4) {
                        if (zIsChecked3) {
                            if (!string.startsWith("0x")) {
                                string = string.substring(2);
                            } else {
                                string = string.substring(2);
                            }
                            if (!C11730.m29461(string)) {
                                C22673.m51152(R.string.MT_Protector);
                                c17771.requestFocus();
                                return;
                            }
                            iM29456 = C11730.m29456(string);
                        } else {
                            iM29456 = Integer.parseInt(string);
                        }
                    }
                    c17771.m41603();
                    ApplicationC17729.f58258.edit().mo3486(selectedItemPosition, "axml_search_type").putBoolean("axml_search_match_case", zIsChecked).putBoolean("axml_search_regex", zIsChecked2).putBoolean("axml_search_hex", zIsChecked3).putBoolean("axml_search_id2name", zIsChecked4).putBoolean("axml_search_exactly_match", zIsChecked5).apply();
                    dialogInterfaceC8327.dismiss();
                    new C3283(this, selectedItemPosition, c4245, zIsChecked5, i, zIsChecked4).m8197();
                    return;
                }
                i = iM29456;
                c4245 = null;
                c17771.m41603();
                ApplicationC17729.f58258.edit().mo3486(selectedItemPosition, "axml_search_type").putBoolean("axml_search_match_case", zIsChecked).putBoolean("axml_search_regex", zIsChecked2).putBoolean("axml_search_hex", zIsChecked3).putBoolean("axml_search_id2name", zIsChecked4).putBoolean("axml_search_exactly_match", zIsChecked5).apply();
                dialogInterfaceC8327.dismiss();
                new C3283(this, selectedItemPosition, c4245, zIsChecked5, i, zIsChecked4).m8197();
                return;
            }
            c4245 = c4245Matcher;
            i = 0;
            c17771.m41603();
            ApplicationC17729.f58258.edit().mo3486(selectedItemPosition, "axml_search_type").putBoolean("axml_search_match_case", zIsChecked).putBoolean("axml_search_regex", zIsChecked2).putBoolean("axml_search_hex", zIsChecked3).putBoolean("axml_search_id2name", zIsChecked4).putBoolean("axml_search_exactly_match", zIsChecked5).apply();
            dialogInterfaceC8327.dismiss();
            new C3283(this, selectedItemPosition, c4245, zIsChecked5, i, zIsChecked4).m8197();
            return;
        }
        this.f65459.m23233().m40396(R.string.MT_Protector, R.string.MT_Protector, false);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f65462.m41597(i == 0 || i == 1);
        CheckBox checkBox = this.f65463;
        CheckBox checkBox2 = this.f65461;
        CheckBox checkBox3 = this.f65464;
        CheckBox checkBox4 = this.f65460;
        CheckBox checkBox5 = this.f65456;
        if (i == 0) {
            checkBox5.setVisibility(0);
            checkBox4.setVisibility(0);
            checkBox2.setVisibility(0);
            checkBox3.setVisibility(8);
            checkBox.setVisibility(8);
        } else if (i == 1) {
            checkBox5.setVisibility(0);
            checkBox4.setVisibility(0);
            checkBox3.setVisibility(8);
            checkBox2.setVisibility(8);
            checkBox.setVisibility(0);
        } else if (i == 2) {
            checkBox5.setVisibility(8);
            checkBox4.setVisibility(8);
            checkBox3.setVisibility(0);
            checkBox2.setVisibility(8);
            checkBox.setVisibility(8);
        } else if (i == 3) {
            checkBox5.setVisibility(8);
            checkBox4.setVisibility(8);
            checkBox3.setVisibility(8);
            checkBox2.setVisibility(8);
            checkBox.setVisibility(8);
        } else if (i == 4) {
            checkBox5.setVisibility(8);
            checkBox4.setVisibility(8);
            checkBox3.setVisibility(0);
            checkBox2.setVisibility(8);
            checkBox.setVisibility(8);
        }
        m46868();
    }
}
