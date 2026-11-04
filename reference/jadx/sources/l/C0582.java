package l;

import android.widget.CompoundButton;

/* JADX INFO: renamed from: l.֡ܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4HK */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0582 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f2345;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2346;

    public /* synthetic */ C0582(int i, Object obj) {
        this.f2345 = i;
        this.f2346 = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f2345) {
            case 0:
                AbstractC10276.m26489((AbstractC10276) this.f2346, z);
                break;
            default:
                ViewOnClickListenerC21422.m48726((ViewOnClickListenerC21422) this.f2346, z);
                break;
        }
    }
}
