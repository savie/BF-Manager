package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴ֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34R9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18406 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC19356 f58664;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TextView f58665;

    public AbstractC18406(final ActivityC3588 activityC3588) {
        View viewM30995 = activityC3588.m30995(R.layout.MT_Protector);
        final C9160 c9160 = (C9160) viewM30995.findViewById(R.id.MT_Protector);
        final C9160 c9161 = (C9160) viewM30995.findViewById(R.id.editText2);
        final Spinner spinner = (Spinner) viewM30995.findViewById(R.id.spinner1);
        this.f58665 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        spinner.setAdapter((SpinnerAdapter) new C0733(activityC3588, activityC3588.getResources().getStringArray(R.array.MT_Protector)));
        spinner.setSelection(Math.min(1, ApplicationC0716.f2992.getInt("dex_search_type_class", 0)));
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(activityC3588);
        c8067.m21258(viewM30995);
        c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩸֡ۨ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                InterfaceC17314 interfaceC17314Edit = ApplicationC0716.f2992.edit();
                Spinner spinner2 = spinner;
                interfaceC17314Edit.mo4065(spinner2.getSelectedItemPosition(), "dex_search_type_class").apply();
                C9160 c9162 = c9160;
                c9162.m23519();
                C9160 c9163 = c9161;
                c9163.m23519();
                String strTrim = c9162.m23513().toString().trim();
                String strTrim2 = c9163.m23513().toString().trim();
                int selectedItemPosition = spinner2.getSelectedItemPosition();
                if (strTrim.isEmpty()) {
                    return;
                }
                new C17700(this.f69148, activityC3588, strTrim, strTrim2, selectedItemPosition).m10243();
            }
        });
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f58664 = c8067.m21252();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42691(boolean z) {
        this.f58665.setText(z ? R.string.MT_Protector : R.string.MT_Protector);
        this.f58664.m44362();
    }
}
