package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳۚ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: D1K5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18859 extends AbstractC9843 {
    public C18859() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        return (c12915.m31986("local") || c12915.m31986("zip")) && C13637.m33377(c12915);
    }

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        if (c12915.m31986("zip")) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        Main mainM31979 = c12915.m31979();
        View viewM40395 = mainM31979.m40395(R.layout.MT_Protector);
        final Spinner spinnerM56568 = C25308.m56568(mainM31979, viewM40395);
        C1255 c1255 = (C1255) viewM40395.findViewById(R.id.switch1);
        c1255.setChecked(ApplicationC17729.f58258.getBoolean("dfb", true));
        c1255.setOnCheckedChangeListener(new C24081());
        final TextView textView = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        final TextView textView2 = (TextView) viewM40395.findViewById(R.id.MT_Protector);
        C1255 c1256 = (C1255) viewM40395.findViewById(R.id.switch2);
        final C1255 c1257 = (C1255) viewM40395.findViewById(R.id.switch3);
        c1256.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۘۚ۫
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                textView.setText(!z ? R.string.MT_Protector : R.string.MT_Protector);
                textView2.setVisibility(!z ? 0 : 8);
                c1257.setVisibility(z ? 8 : 0);
                spinnerM56568.setEnabled(!z);
                C6421.m18184(ApplicationC17729.f58258, "dfoh", z);
            }
        });
        c1256.setChecked(ApplicationC17729.f58258.getBoolean("dfoh", false));
        c1257.setChecked(ApplicationC17729.f58258.getBoolean("dfrwn", true));
        c1257.setOnCheckedChangeListener(new C14383());
        C2361 c2361BuildDialog = c12915.m31979().buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC21097(spinnerM56568, c12915, c1256, c1257));
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }
}
