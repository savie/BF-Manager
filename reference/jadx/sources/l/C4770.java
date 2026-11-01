package l;

import android.widget.CompoundButton;

/* JADX INFO: renamed from: l.ۙܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4770 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16785;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f16786;

    public /* synthetic */ C4770(int i, Object obj) {
        this.f16785 = i;
        this.f16786 = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.f16785;
        Object obj = this.f16786;
        switch (i) {
            case 0:
                int i2 = ActivityC20293.f65753;
                ApplicationC0716.f2992.edit().putBoolean("apk_signature_info_add_colon", z).apply();
                ((RunnableC9235) obj).run();
                break;
            default:
                ((AbstractViewOnClickListenerC15449) obj).m36961();
                break;
        }
    }
}
