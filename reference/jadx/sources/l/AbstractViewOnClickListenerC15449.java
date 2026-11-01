package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ܶ᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 35GV */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractViewOnClickListenerC15449 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final CheckBox f50333;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11545 f50334;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final CheckBox f50335;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CheckBox f50336;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final List f50337;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Spinner f50338;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C9160 f50339;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f50340;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CheckBox f50341;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 f50342;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final CheckBox f50343;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public AbstractViewOnClickListenerC15449(C11545 c11545, AbstractC20745 abstractC20745, List list, final Runnable runnable) {
        this.f50334 = c11545;
        this.f50340 = abstractC20745;
        this.f50337 = list;
        View viewM30995 = c11545.m28824().m30995(R.layout.MT_Protector);
        if (list != null) {
            ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        }
        viewM30995.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM30995.findViewById(R.id.editText2).setVisibility(8);
        this.f50339 = (C9160) viewM30995.findViewById(R.id.MT_Protector);
        Spinner spinner = (Spinner) viewM30995.findViewById(R.id.spinner);
        this.f50338 = spinner;
        CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f50336 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM30995.findViewById(R.id.checkBox2);
        this.f50343 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f50341 = checkBox3;
        CheckBox checkBox4 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f50335 = checkBox4;
        CheckBox checkBox5 = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        this.f50333 = checkBox5;
        spinner.setSelection(ApplicationC0716.f2992.getInt("axml_search_type", 0));
        onItemSelected(null, null, spinner.getSelectedItemPosition(), 0L);
        spinner.setOnItemSelectedListener(this);
        checkBox.setChecked(ApplicationC0716.f2992.getBoolean("axml_search_match_case", false));
        checkBox2.setChecked(ApplicationC0716.f2992.getBoolean("axml_search_regex", false));
        checkBox3.setChecked(ApplicationC0716.f2992.getBoolean("axml_search_hex", true));
        checkBox4.setChecked(ApplicationC0716.f2992.getBoolean("axml_search_id2name", true));
        checkBox5.setChecked(ApplicationC0716.f2992.getBoolean("axml_search_exactly_match", true));
        checkBox2.setOnCheckedChangeListener(new C4770(1, this));
        m36961();
        C8067 c8067BuildDialog = c11545.m28824().buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֨᩶֨
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21256(new DialogInterface.OnCancelListener() { // from class: l.۬᩶֨
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        this.f50342 = c8067BuildDialog.m21252();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m36961() {
        CheckBox checkBox = this.f50343;
        this.f50339.m23518(checkBox.isChecked() && checkBox.getVisibility() == 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36963() {
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f50342;
        dialogInterfaceC19356.m44362();
        dialogInterfaceC19356.m44373().setOnClickListener(this);
        dialogInterfaceC19356.m44361().setOnClickListener(new ViewOnClickListenerC11953(3, this));
        C9160 c9160 = this.f50339;
        c9160.requestFocus();
        C16737.m39290(c9160.m23516());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m36962(AbstractViewOnClickListenerC15449 abstractViewOnClickListenerC15449) {
        abstractViewOnClickListenerC15449.f50334.m28824().m30996(R.string.MT_Protector, R.string.MT_Protector, false);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C6222 c6222Matcher;
        int i;
        C6222 c6222;
        int iM17654;
        C9160 c9160 = this.f50339;
        String string = c9160.m23513().toString();
        boolean zIsEmpty = string.isEmpty();
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f50342;
        if (zIsEmpty) {
            dialogInterfaceC19356.dismiss();
            return;
        }
        int selectedItemPosition = this.f50338.getSelectedItemPosition();
        if (selectedItemPosition != 0 || C1709.m5693()) {
            boolean zIsChecked = this.f50336.isChecked();
            boolean zIsChecked2 = this.f50343.isChecked();
            boolean zIsChecked3 = this.f50341.isChecked();
            boolean zIsChecked4 = this.f50335.isChecked();
            boolean zIsChecked5 = this.f50333.isChecked();
            if (selectedItemPosition == 0 || selectedItemPosition == 1) {
                try {
                    c6222Matcher = C12733.m31638(string, zIsChecked2, zIsChecked).matcher((CharSequence) "");
                } catch (Exception e) {
                    C15829.m37613((CharSequence) e.getMessage());
                    c9160.requestFocus();
                    return;
                }
            } else {
                c6222Matcher = null;
                if (selectedItemPosition == 2) {
                    if (zIsChecked3) {
                        if (!string.startsWith("0x") || string.startsWith("0X")) {
                            string = string.substring(2);
                        }
                        if (!C6461.m17651(string)) {
                            C15829.m37611(R.string.MT_Protector);
                            c9160.requestFocus();
                            return;
                        }
                        iM17654 = C6461.m17654(string);
                    } else {
                        try {
                            iM17654 = Integer.parseInt(string);
                        } catch (NumberFormatException unused) {
                            C15829.m37611(R.string.MT_Protector);
                            c9160.requestFocus();
                            return;
                        }
                    }
                } else if (selectedItemPosition == 3) {
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
                } else {
                    if (selectedItemPosition == 4) {
                        if (zIsChecked3) {
                            if (!string.startsWith("0x")) {
                                string = string.substring(2);
                            } else {
                                string = string.substring(2);
                            }
                            if (!C6461.m17651(string)) {
                                C15829.m37611(R.string.MT_Protector);
                                c9160.requestFocus();
                                return;
                            }
                            iM17654 = C6461.m17654(string);
                        } else {
                            iM17654 = Integer.parseInt(string);
                        }
                    }
                    c9160.m23519();
                    ApplicationC0716.f2992.edit().mo4065(selectedItemPosition, "axml_search_type").putBoolean("axml_search_match_case", zIsChecked).putBoolean("axml_search_regex", zIsChecked2).putBoolean("axml_search_hex", zIsChecked3).putBoolean("axml_search_id2name", zIsChecked4).putBoolean("axml_search_exactly_match", zIsChecked5).apply();
                    dialogInterfaceC19356.dismiss();
                    new C23210(this, selectedItemPosition, c6222, zIsChecked5, i, zIsChecked4).m10243();
                    return;
                }
                i = iM17654;
                c6222 = null;
                c9160.m23519();
                ApplicationC0716.f2992.edit().mo4065(selectedItemPosition, "axml_search_type").putBoolean("axml_search_match_case", zIsChecked).putBoolean("axml_search_regex", zIsChecked2).putBoolean("axml_search_hex", zIsChecked3).putBoolean("axml_search_id2name", zIsChecked4).putBoolean("axml_search_exactly_match", zIsChecked5).apply();
                dialogInterfaceC19356.dismiss();
                new C23210(this, selectedItemPosition, c6222, zIsChecked5, i, zIsChecked4).m10243();
                return;
            }
            c6222 = c6222Matcher;
            i = 0;
            c9160.m23519();
            ApplicationC0716.f2992.edit().mo4065(selectedItemPosition, "axml_search_type").putBoolean("axml_search_match_case", zIsChecked).putBoolean("axml_search_regex", zIsChecked2).putBoolean("axml_search_hex", zIsChecked3).putBoolean("axml_search_id2name", zIsChecked4).putBoolean("axml_search_exactly_match", zIsChecked5).apply();
            dialogInterfaceC19356.dismiss();
            new C23210(this, selectedItemPosition, c6222, zIsChecked5, i, zIsChecked4).m10243();
            return;
        }
        this.f50334.m28824().m30996(R.string.MT_Protector, R.string.MT_Protector, false);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f50339.m23510(i == 0 || i == 1);
        CheckBox checkBox = this.f50333;
        CheckBox checkBox2 = this.f50335;
        CheckBox checkBox3 = this.f50341;
        CheckBox checkBox4 = this.f50343;
        CheckBox checkBox5 = this.f50336;
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
        m36961();
    }
}
