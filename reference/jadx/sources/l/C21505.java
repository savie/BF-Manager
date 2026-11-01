package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸ۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A1YB */
/* JADX INFO: loaded from: classes5.dex */
public final class C21505 extends AbstractC4674 {
    public C21505() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(final C21422 c21422) {
        c21422.m47963("local");
        final C11545 c11545M47970 = c21422.m47970();
        final boolean z = false;
        if (!c11545M47970.m28794() && c11545M47970.m28814("local")) {
            z = true;
        }
        View viewM30995 = c21422.m47980().m30995(R.layout.MT_Protector);
        final RadioButton radioButton = (RadioButton) viewM30995.findViewById(R.id.MT_Protector);
        RadioButton radioButton2 = (RadioButton) viewM30995.findViewById(R.id.MT_Protector);
        final RadioButton radioButton3 = (RadioButton) viewM30995.findViewById(R.id.radioButton3);
        final EditText editText = (EditText) viewM30995.findViewById(R.id.MT_Protector);
        final CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        final CheckBox checkBox2 = (CheckBox) viewM30995.findViewById(R.id.checkBox2);
        checkBox.setChecked(ApplicationC0716.f2992.getBoolean("duaw", false));
        checkBox2.setChecked(ApplicationC0716.f2992.getBoolean("duds", false));
        if (!z) {
            checkBox.setVisibility(8);
        }
        checkBox2.setText(C16737.m39279().getQuantityString(R.plurals.MT_Protector, c21422.m47975()));
        radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.֫֫᩹
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                editText.setVisibility(z2 ? 0 : 8);
            }
        });
        editText.setText(((InterfaceC2557) c21422.m47979().get(0)).mo7989().m46718() + '/');
        if (c21422.m47975() != 1) {
            radioButton3.setVisibility(0);
            radioButton3.setChecked(true);
        }
        C8067 c8067BuildDialog = c21422.m47980().buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        dialogInterfaceC19356M21269.m44367(new DialogInterface.OnDismissListener() { // from class: l.ۢ֫᩹
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ApplicationC0716.f2992.edit().putBoolean("duaw", checkBox.isChecked()).putBoolean("duds", checkBox2.isChecked()).apply();
            }
        });
        dialogInterfaceC19356M21269.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ۗ֫᩹
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21505.m48147(this.f11014, z, checkBox, checkBox2, c11545M47970, c21422, radioButton, dialogInterfaceC19356M21269, radioButton3, editText);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48147(C21505 c21505, boolean z, CheckBox checkBox, CheckBox checkBox2, C11545 c11545, C21422 c21422, RadioButton radioButton, DialogInterfaceC19356 dialogInterfaceC19356, RadioButton radioButton2, EditText editText) {
        boolean z2 = z && checkBox.isChecked();
        boolean zIsChecked = checkBox2.isChecked();
        String strM28799 = z2 ? c11545.m28799() : c21422.m47961();
        if (radioButton.isChecked()) {
            m48146(c21422, strM28799, strM28799.length(), false, z2, zIsChecked);
            dialogInterfaceC19356.dismiss();
            return;
        }
        if (radioButton2.isChecked()) {
            m48146(c21422, strM28799, strM28799.length(), true, z2, zIsChecked);
            dialogInterfaceC19356.dismiss();
            return;
        }
        String strTrim = editText.getText().toString().trim();
        if (strTrim.contains("\\") || strTrim.startsWith("/") || strTrim.contains("//")) {
            C15829.m37611(R.string.MT_Protector);
        } else {
            dialogInterfaceC19356.dismiss();
            m48146(c21422, C6730.m18162(strM28799, strTrim), strM28799.length(), false, z2, zIsChecked);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48146(C21422 c21422, String str, int i, boolean z, boolean z2, boolean z3) {
        int i2 = C20725.f67443;
        C10142 c10142 = new C10142(C15156.class);
        c10142.m25772(c21422.m47979());
        c10142.m25768("extractDir", str);
        c10142.m25769("separateFolder", z);
        c10142.m25764(i, "relativeNameSubStart");
        c10142.m25769("extractToAnother", z2);
        c10142.m25769("deleteSources", z3);
        if (z2) {
            c10142.m25775(c21422);
        } else {
            c10142.m25777(c21422);
        }
        c10142.m25763();
    }
}
