package l;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* JADX INFO: renamed from: l.ۘ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 192I */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC3934 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f14650;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f14651;

    public /* synthetic */ ViewOnFocusChangeListenerC3934(int i, Object obj) {
        this.f14650 = i;
        this.f14651 = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.f14650) {
            case 0:
                InputMethodManager inputMethodManager = (InputMethodManager) this.f14651;
                if (z) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
                break;
            default:
                C8768.m22819((EditText) this.f14651, z);
                break;
        }
    }
}
