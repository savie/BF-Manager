package l;

import android.widget.CompoundButton;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻ۙ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24805 implements CompoundButton.OnCheckedChangeListener {
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C6421.m18184(ApplicationC17729.f58258, "enable_auto_signature", z);
        if (ApplicationC17729.f58258.getBoolean("show_auto_settings_tip", true)) {
            C22673.m51159(R.string.MT_Protector);
        }
    }
}
