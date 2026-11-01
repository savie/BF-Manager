package l;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.ۚ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5551 implements TextWatcher {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f19056;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C13465.m32966(charSequence, am.aB);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C13465.m32966(charSequence, am.aB);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C13465.m32966(editable, am.aB);
        TextView textView = this.f19056;
        if (textView.getVisibility() == 0) {
            textView.setVisibility(8);
        }
    }

    public C5551(TextView textView) {
        this.f19056 = textView;
    }
}
