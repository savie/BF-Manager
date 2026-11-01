package l;

import android.widget.CompoundButton;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜ۫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6770 implements CompoundButton.OnCheckedChangeListener {
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C1679.m5597(ApplicationC0716.f2992, "enable_auto_signature", z);
        if (ApplicationC0716.f2992.getBoolean("show_auto_settings_tip", true)) {
            C15829.m37618(R.string.MT_Protector);
        }
    }
}
