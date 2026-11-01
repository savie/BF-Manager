package l;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: l.ۜ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 192I */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC6757 implements View.OnFocusChangeListener {
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z && (view instanceof EditText)) {
            C16737.m39273(new RunnableC7793(2, (EditText) view));
        }
    }
}
