package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫ܽ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 38V8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13241 extends AbstractC9843 {
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(final C12915 c12915) {
        Main mainM31979 = c12915.m31979();
        View viewM40395 = mainM31979.m40395(R.layout.MT_Protector);
        final RadioGroup radioGroup = (RadioGroup) viewM40395.findViewById(R.id.MT_Protector);
        final CheckBox checkBox = (CheckBox) viewM40395.findViewById(R.id.MT_Protector);
        final CheckBox checkBox2 = (CheckBox) viewM40395.findViewById(R.id.checkBox2);
        radioGroup.check(ApplicationC17729.f58258.getBoolean("eflr", true) ? R.id.MT_Protector : R.id.MT_Protector);
        checkBox.setChecked(ApplicationC17729.f58258.getBoolean("efls", false));
        checkBox2.setChecked(ApplicationC17729.f58258.getBoolean("eflfs", true));
        C2361 c2361BuildDialog = mainM31979.buildDialog();
        c2361BuildDialog.m8021(m25627());
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩴܽ۫
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                boolean z = radioGroup.getCheckedRadioButtonId() == R.id.MT_Protector;
                boolean zIsChecked = checkBox.isChecked();
                boolean zIsChecked2 = checkBox2.isChecked();
                ApplicationC17729.f58258.edit().putBoolean("eflr", z).putBoolean("efls", zIsChecked).putBoolean("eflfs", zIsChecked2).apply();
                C12915 c12916 = c12915;
                new C15478(this.f64153, c12916.m31979(), c12916.m31982(), z, zIsChecked2, zIsChecked, c12916.m31987().mo10174()).m8197();
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }
}
