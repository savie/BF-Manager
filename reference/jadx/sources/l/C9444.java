package l;

import android.widget.CompoundButton;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۢ۟ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05VZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9444 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3092 f31959;

    public C9444(C3092 c3092) {
        this.f31959 = c3092;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        C3092 c3092 = this.f31959;
        c3092.m13140((Serializable) boolValueOf);
        c3092.m38259(z);
    }
}
