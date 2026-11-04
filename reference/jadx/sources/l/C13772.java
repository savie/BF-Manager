package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.۬ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X81I */
/* JADX INFO: loaded from: classes4.dex */
public final class C13772 implements TextWatcher {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC21716 f43715;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C13772(AbstractC21716 abstractC21716) {
        this.f43715 = abstractC21716;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        AbstractC21716 abstractC21716 = this.f43715;
        if (abstractC21716.f69301 && abstractC21716.f69302.isFocused()) {
            try {
                abstractC21716.f69300.mo52335((CharSequence) String.valueOf((Integer.parseInt(editable.toString()) * abstractC21716.f69305) / abstractC21716.f69303));
            } catch (Exception unused) {
            }
        }
    }
}
