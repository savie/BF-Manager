package l;

import android.widget.CompoundButton;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺۗ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16555 implements CompoundButton.OnCheckedChangeListener {
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            if (ApplicationC17729.f58258.getBoolean("forbid_tip_".concat("multi_threaded_transfer"), false)) {
                return;
            }
            DialogInterfaceOnClickListenerC12983.m32396(R.string.MT_Protector, (AbstractActivityC17204) C3200.m10534(compoundButton.getContext()), "multi_threaded_transfer");
        }
    }
}
