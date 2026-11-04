package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34R9 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11768 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC8327 f38031;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final TextView f38032;

    public AbstractC11768(final ActivityC22957 activityC22957) {
        View viewM40395 = activityC22957.m40395(R.layout.MT_Protector);
        final C17771 c17771 = (C17771) viewM40395.findViewById(R.id.MT_Protector);
        final C17771 c17772 = (C17771) viewM40395.findViewById(R.id.editText2);
        final Spinner spinner = (Spinner) viewM40395.findViewById(R.id.spinner1);
        this.f38032 = (TextView) viewM40395.findViewById(R.id.title);
        spinner.setAdapter((SpinnerAdapter) new C3054(activityC22957, activityC22957.getResources().getStringArray(R.array.MT_Protector)));
        spinner.setSelection(Math.min(1, ApplicationC17729.f58258.getInt("dex_search_type_class", 0)));
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(activityC22957);
        c2361.m8005(viewM40395);
        c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۚܿۤ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                InterfaceC18752 interfaceC18752Edit = ApplicationC17729.f58258.edit();
                Spinner spinner2 = spinner;
                interfaceC18752Edit.mo3486(spinner2.getSelectedItemPosition(), "dex_search_type_class").apply();
                C17771 c17773 = c17771;
                c17773.m41603();
                C17771 c17774 = c17772;
                c17774.m41603();
                String strTrim = c17773.m41599().toString().trim();
                String strTrim2 = c17774.m41599().toString().trim();
                int selectedItemPosition = spinner2.getSelectedItemPosition();
                if (strTrim.isEmpty()) {
                    return;
                }
                new C2074(this.f19941, activityC22957, strTrim, strTrim2, selectedItemPosition).m8197();
            }
        });
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f38031 = c2361.m7999();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29544(boolean z) {
        this.f38032.setText(z ? R.string.MT_Protector : R.string.MT_Protector);
        this.f38031.m22432();
    }
}
