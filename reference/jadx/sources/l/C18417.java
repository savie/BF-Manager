package l;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩴ֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18417 implements TextWatcher {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f58716;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Function f58717;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C18417(EditText editText, Function function) {
        this.f58716 = editText;
        this.f58717 = function;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f58716.setHint(((CharSequence) this.f58717.apply(editable)).toString());
    }
}
