package l;

import android.widget.AdapterView;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: l.᩶᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A92H */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C20389 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f66077;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AdapterView.OnItemSelectedListener f66078;

    public /* synthetic */ C20389(AdapterView.OnItemSelectedListener onItemSelectedListener, int i) {
        this.f66077 = i;
        this.f66078 = onItemSelectedListener;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f66077) {
            case 0:
                C17566.m40842((C17566) this.f66078, compoundButton, z);
                break;
            default:
                ViewOnClickListenerC10786.m27084((ViewOnClickListenerC10786) this.f66078, z);
                break;
        }
    }
}
