package l;

import android.widget.CompoundButton;
import java.io.Serializable;

/* JADX INFO: renamed from: l.۠᩶ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZR */
/* JADX INFO: loaded from: classes3.dex */
public final class C8405 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19694 f29153;

    public C8405(C19694 c19694) {
        this.f29153 = c19694;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        C19694 c19694 = this.f29153;
        c19694.m13140((Serializable) boolValueOf);
        c19694.m38259(z);
    }
}
