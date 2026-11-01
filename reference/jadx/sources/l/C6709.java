package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۜۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D1Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6709 implements TextWatcher {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC22938 f22611;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C6709(ViewOnClickListenerC22938 viewOnClickListenerC22938) {
        this.f22611 = viewOnClickListenerC22938;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ViewOnClickListenerC22938 viewOnClickListenerC22938 = this.f22611;
        if (viewOnClickListenerC22938.f74560.getVisibility() == 0) {
            viewOnClickListenerC22938.f74560.setVisibility(8);
        }
    }
}
