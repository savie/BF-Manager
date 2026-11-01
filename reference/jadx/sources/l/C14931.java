package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 38V8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14931 extends AbstractC4674 {
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(final C21422 c21422) {
        Main mainM47980 = c21422.m47980();
        View viewM30995 = mainM47980.m30995(R.layout.MT_Protector);
        final RadioGroup radioGroup = (RadioGroup) viewM30995.findViewById(R.id.MT_Protector);
        final CheckBox checkBox = (CheckBox) viewM30995.findViewById(R.id.MT_Protector);
        final CheckBox checkBox2 = (CheckBox) viewM30995.findViewById(R.id.checkBox2);
        radioGroup.check(ApplicationC0716.f2992.getBoolean("eflr", true) ? R.id.MT_Protector : R.id.MT_Protector);
        checkBox.setChecked(ApplicationC0716.f2992.getBoolean("efls", false));
        checkBox2.setChecked(ApplicationC0716.f2992.getBoolean("eflfs", true));
        C8067 c8067BuildDialog = mainM47980.buildDialog();
        c8067BuildDialog.m21274(m12942());
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜۖ֨
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                boolean z = radioGroup.getCheckedRadioButtonId() == R.id.MT_Protector;
                boolean zIsChecked = checkBox.isChecked();
                boolean zIsChecked2 = checkBox2.isChecked();
                ApplicationC0716.f2992.edit().putBoolean("eflr", z).putBoolean("efls", zIsChecked).putBoolean("eflfs", zIsChecked2).apply();
                C21422 c21423 = c21422;
                new C22692(this.f21834, c21423.m47980(), c21423.m47979(), z, zIsChecked2, zIsChecked, c21423.m47960().mo13029()).m10243();
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }
}
