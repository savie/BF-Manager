package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ܽۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17498 implements TextWatcher {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC16006 f56859;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C17498(ViewOnClickListenerC16006 viewOnClickListenerC16006) {
        this.f56859 = viewOnClickListenerC16006;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ViewOnClickListenerC16006 viewOnClickListenerC16006 = this.f56859;
        if (viewOnClickListenerC16006.f51948.m5770()) {
            viewOnClickListenerC16006.f51948.m5768((CharSequence) null);
        }
    }
}
