package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۛ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X81I */
/* JADX INFO: loaded from: classes2.dex */
public final class C6052 implements TextWatcher {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC23692 f20553;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C6052(AbstractC23692 abstractC23692) {
        this.f20553 = abstractC23692;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        AbstractC23692 abstractC23692 = this.f20553;
        if (abstractC23692.f76666 && abstractC23692.f76668.isFocused()) {
            try {
                abstractC23692.f76664.mo16989((CharSequence) String.valueOf((Integer.parseInt(editable.toString()) * abstractC23692.f76663) / abstractC23692.f76665));
            } catch (Exception unused) {
            }
        }
    }
}
