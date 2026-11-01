package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D1K5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17272 extends AbstractC4674 {
    public C17272() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        return (c21422.m47974("local") || c21422.m47974("zip")) && C9512.m24345(c21422);
    }

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        if (c21422.m47974("zip")) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        Main mainM47980 = c21422.m47980();
        View viewM30995 = mainM47980.m30995(R.layout.MT_Protector);
        final Spinner spinnerM51138 = C23144.m51138(mainM47980, viewM30995);
        C12562 c12562 = (C12562) viewM30995.findViewById(R.id.switch1);
        c12562.setChecked(ApplicationC0716.f2992.getBoolean("dfb", true));
        c12562.setOnCheckedChangeListener(new C20800());
        final TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        final TextView textView2 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        C12562 c12563 = (C12562) viewM30995.findViewById(R.id.switch2);
        final C12562 c12564 = (C12562) viewM30995.findViewById(R.id.switch3);
        c12563.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ܺۢ᩹
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                textView.setText(!z ? R.string.MT_Protector : R.string.MT_Protector);
                textView2.setVisibility(!z ? 0 : 8);
                c12564.setVisibility(z ? 8 : 0);
                spinnerM51138.setEnabled(!z);
                C1679.m5597(ApplicationC0716.f2992, "dfoh", z);
            }
        });
        c12563.setChecked(ApplicationC0716.f2992.getBoolean("dfoh", false));
        c12564.setChecked(ApplicationC0716.f2992.getBoolean("dfrwn", true));
        c12564.setOnCheckedChangeListener(new C20274(2));
        C8067 c8067BuildDialog = c21422.m47980().buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC20095(spinnerM51138, c21422, c12563, c12564));
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }
}
