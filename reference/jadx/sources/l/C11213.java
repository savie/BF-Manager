package l;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: B4VX */
/* JADX INFO: loaded from: classes3.dex */
public final class C11213 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28257(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof InterfaceC10423) {
                editorInfo.hintText = ((InterfaceC10423) parent).getHint();
                return;
            }
        }
    }
}
