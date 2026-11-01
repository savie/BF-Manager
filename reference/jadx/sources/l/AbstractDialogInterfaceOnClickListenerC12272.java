package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: O60D */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC12272 implements DialogInterface.OnClickListener, View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final View f41031;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Spinner f41032;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12562 f41033;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C10948 f41034;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 f41035;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final View f41036;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Spinner f41037;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final View f41038;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    public AbstractDialogInterfaceOnClickListenerC12272(C11545 c11545, String str, boolean z, String str2) {
        Main mainM28824 = c11545.m28824();
        View viewM30995 = mainM28824.m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        editText.setText(str);
        editText.setKeyListener(null);
        this.f41038 = viewM30995.findViewById(R.id.header3);
        this.f41034 = (C10948) viewM30995.findViewById(R.id.editTextView);
        Spinner spinner = (Spinner) viewM30995.findViewById(R.id.spinner1);
        this.f41037 = spinner;
        Spinner spinner2 = (Spinner) viewM30995.findViewById(R.id.spinner2);
        this.f41032 = spinner2;
        this.f41036 = viewM30995.findViewById(R.id.MT_Protector);
        this.f41031 = viewM30995.findViewById(R.id.MT_Protector);
        String[] stringArray = mainM28824.getResources().getStringArray(R.array.MT_Protector);
        String[] stringArray2 = mainM28824.getResources().getStringArray(R.array.MT_Protector);
        spinner.setAdapter((SpinnerAdapter) new C0733(mainM28824, stringArray));
        spinner2.setAdapter((SpinnerAdapter) new C0733(mainM28824, stringArray2));
        final String str3 = z ? "zacl" : "zcl";
        spinner.setSelection(Math.max(0, Math.min(ApplicationC0716.f2992.getInt(str3, z ? 6 : 3), stringArray.length - 1)));
        this.f41033 = (C12562) viewM30995.findViewById(R.id.switch1);
        C8067 c8067BuildDialog = mainM28824.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21265(false);
        c8067BuildDialog.m21251(R.string.MT_Protector, this);
        c8067BuildDialog.m21275(R.string.MT_Protector, this);
        if (z) {
            c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        }
        DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        this.f41035 = dialogInterfaceC19356M21269;
        dialogInterfaceC19356M21269.m44367(new DialogInterface.OnDismissListener() { // from class: l.֡۟᩹
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AbstractDialogInterfaceOnClickListenerC12272 abstractDialogInterfaceOnClickListenerC12272 = this.f1565;
                C12562 c12562 = abstractDialogInterfaceOnClickListenerC12272.f41033;
                InterfaceC17314 interfaceC17314Edit = ApplicationC0716.f2992.edit();
                if (abstractDialogInterfaceOnClickListenerC12272.f41031.getVisibility() == 0) {
                    interfaceC17314Edit.mo4065(abstractDialogInterfaceOnClickListenerC12272.f41037.getSelectedItemPosition(), str3);
                }
                if (c12562.getVisibility() == 0) {
                    interfaceC17314Edit.putBoolean("dzds", c12562.isChecked());
                }
                interfaceC17314Edit.apply();
            }
        });
        dialogInterfaceC19356M21269.m44368(new DialogInterface.OnKeyListener() { // from class: l.ܽ۟᩹
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                AbstractDialogInterfaceOnClickListenerC12272 abstractDialogInterfaceOnClickListenerC12272 = this.f53022;
                abstractDialogInterfaceOnClickListenerC12272.getClass();
                if (keyEvent.getAction() != 0 || i != 4) {
                    return false;
                }
                abstractDialogInterfaceOnClickListenerC12272.f41035.dismiss();
                return true;
            }
        });
        if (z) {
            C11005.m27756(c11545, dialogInterfaceC19356M21269, str2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30500(String str) {
        this.f41036.setVisibility(0);
        this.f41034.mo16989((CharSequence) str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m30503() {
        return this.f41034.m17000().toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30499(int i) {
        String quantityString = C16737.m39279().getQuantityString(R.plurals.MT_Protector, i);
        C12562 c12562 = this.f41033;
        c12562.setText(quantityString);
        c12562.setChecked(ApplicationC0716.f2992.getBoolean("dzds", false));
        c12562.setVisibility(0);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m30497() {
        this.f41031.setVisibility(8);
        this.f41032.setTranslationY(0.0f);
        this.f41038.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30498() {
        return this.f41037.getSelectedItemPosition();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m30502() {
        return this.f41032.getSelectedItemPosition();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m30501() {
        return this.f41033.isChecked();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30496(int i, C22918 c22918) {
        switch (i) {
            case 0:
                c22918.m50733(0);
                return false;
            case 1:
                c22918.m50722(1);
                return false;
            case 2:
                c22918.m50722(3);
                return false;
            case 3:
                c22918.m50722(-1);
                return false;
            case 4:
                c22918.m50722(9);
                return false;
            case 5:
                c22918.m50722(10);
                return false;
            case 6:
                c22918.m50722(-1);
                c22918.m50718();
                return true;
            default:
                return false;
        }
    }
}
