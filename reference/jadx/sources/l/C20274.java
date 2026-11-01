package l;

import android.widget.CompoundButton;

/* JADX INFO: renamed from: l.᩶ܺ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C20274 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65717;

    public /* synthetic */ C20274(int i) {
        this.f65717 = i;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f65717) {
            case 0:
                C1679.m5597(ApplicationC0716.f2992, "mbp", z);
                break;
            case 1:
                int i = ServiceC12465.f41556;
                C17403.m40564(z);
                break;
            default:
                C1679.m5597(ApplicationC0716.f2992, "dfrwn", z);
                break;
        }
    }
}
