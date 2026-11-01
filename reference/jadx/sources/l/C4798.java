package l;

import android.widget.CompoundButton;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۙܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5PI */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4798 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16861;

    public /* synthetic */ C4798(int i) {
        this.f16861 = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f16861) {
            case 0:
                C1679.m5597(ApplicationC0716.f2992, "dfrwn", z);
                break;
            default:
                if (z) {
                    if (!ApplicationC0716.f2992.getBoolean("forbid_tip_".concat("multi_threaded_transfer"), false)) {
                        DialogInterfaceOnClickListenerC14147.m34222(R.string.MT_Protector, (AbstractActivityC12483) C8703.m22527(compoundButton.getContext()), "multi_threaded_transfer");
                    }
                }
                break;
        }
    }
}
