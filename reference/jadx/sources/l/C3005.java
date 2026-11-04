package l;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۖ᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 766I */
/* JADX INFO: loaded from: classes3.dex */
public class C3005 extends AbstractDialogInterfaceOnClickListenerC7635 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public CharSequence f9765;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public EditText f9767;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Runnable f9766 = new RunnableC9716(this);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f9764 = -1;

    @Override // l.AbstractDialogInterfaceOnClickListenerC7635, l.DialogInterfaceOnCancelListenerC19136, l.ComponentCallbacksC11612
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f9765 = ((C10462) m20853()).m26889();
        } else {
            this.f9765 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC7635, l.DialogInterfaceOnCancelListenerC19136, l.ComponentCallbacksC11612
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f9765);
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC7635
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9810(View view) {
        super.mo9810(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f9767 = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f9767.setText(this.f9765);
        EditText editText2 = this.f9767;
        editText2.setSelection(editText2.getText().length());
        ((C10462) m20853()).getClass();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m9813() {
        long j = this.f9764;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.f9767;
        if (editText == null || !editText.isFocused()) {
            this.f9764 = -1L;
            return;
        }
        if (((InputMethodManager) this.f9767.getContext().getSystemService("input_method")).showSoftInput(this.f9767, 0)) {
            this.f9764 = -1L;
            return;
        }
        EditText editText2 = this.f9767;
        Runnable runnable = this.f9766;
        editText2.removeCallbacks(runnable);
        this.f9767.postDelayed(runnable, 50L);
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC7635
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo9812() {
        this.f9764 = SystemClock.currentThreadTimeMillis();
        m9813();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC7635
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9811(boolean z) {
        if (z) {
            String string = this.f9767.getText().toString();
            C10462 c10462 = (C10462) m20853();
            c10462.m12566((Serializable) string);
            c10462.m26888(string);
        }
    }
}
