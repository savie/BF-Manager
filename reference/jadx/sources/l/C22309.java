package l;

import android.widget.CompoundButton;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩷᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZR */
/* JADX INFO: loaded from: classes.dex */
public final class C22309 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11120 f72224;

    public C22309(C11120 c11120) {
        this.f72224 = c11120;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        C11120 c11120 = this.f72224;
        c11120.m12566((Serializable) boolValueOf);
        c11120.m17138(z);
    }
}
