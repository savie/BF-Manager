package l;

import android.text.Editable;
import android.text.TextWatcher;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.ۜ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6786 implements TextWatcher {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1626 f22615;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C15243.m36590(charSequence, am.aB);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C15243.m36590(charSequence, am.aB);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C15243.m36590(editable, am.aB);
        C1626 c1626 = this.f22615;
        if (c1626.m5770()) {
            c1626.m5768((CharSequence) null);
        }
    }

    public C6786(C1626 c1626) {
        this.f22615 = c1626;
    }
}
