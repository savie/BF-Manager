package l;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩺᩷ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 766I */
/* JADX INFO: loaded from: classes2.dex */
public class C23243 extends AbstractDialogInterfaceOnClickListenerC22391 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public CharSequence f75418;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public EditText f75420;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Runnable f75417 = new RunnableC7014(this);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f75419 = -1;

    @Override // l.AbstractDialogInterfaceOnClickListenerC22391, l.DialogInterfaceOnCancelListenerC11281, l.ComponentCallbacksC22654
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f75418 = ((C13365) m49663()).m32863();
        } else {
            this.f75418 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC22391, l.DialogInterfaceOnCancelListenerC11281, l.ComponentCallbacksC22654
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f75418);
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC22391
    /* JADX INFO: renamed from: ۙ */
    public final void mo49661(View view) {
        super.mo49661(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f75420 = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f75420.setText(this.f75418);
        EditText editText2 = this.f75420;
        editText2.setSelection(editText2.getText().length());
        ((C13365) m49663()).getClass();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m51280() {
        long j = this.f75419;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.f75420;
        if (editText == null || !editText.isFocused()) {
            this.f75419 = -1L;
            return;
        }
        if (((InputMethodManager) this.f75420.getContext().getSystemService("input_method")).showSoftInput(this.f75420, 0)) {
            this.f75419 = -1L;
            return;
        }
        EditText editText2 = this.f75420;
        Runnable runnable = this.f75417;
        editText2.removeCallbacks(runnable);
        this.f75420.postDelayed(runnable, 50L);
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC22391
    /* JADX INFO: renamed from: ۨ */
    public final void mo49662() {
        this.f75419 = SystemClock.currentThreadTimeMillis();
        m51280();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC22391
    /* JADX INFO: renamed from: ۙ */
    public final void mo20369(boolean z) {
        if (z) {
            String string = this.f75420.getText().toString();
            C13365 c13365 = (C13365) m49663();
            c13365.m13140((Serializable) string);
            c13365.m32862(string);
        }
    }
}
