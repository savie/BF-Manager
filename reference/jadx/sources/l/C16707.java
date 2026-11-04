package l;

import android.widget.CompoundButton;

/* JADX INFO: renamed from: l.ܺ۠۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 35GV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16707 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53974;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f53975;

    public /* synthetic */ C16707(int i, Object obj) {
        this.f53974 = i;
        this.f53975 = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f53974) {
            case 0:
                ((AbstractViewOnClickListenerC20437) this.f53975).m46868();
                break;
            default:
                ActivityC2534.m8446((ActivityC2534) this.f53975, compoundButton, z);
                break;
        }
    }
}
