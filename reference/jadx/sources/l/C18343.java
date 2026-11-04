package l;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: renamed from: l.ܿ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 33S4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18343 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InputConnection m42791(C13801 c13801, InputConnection inputConnection, EditorInfo editorInfo) {
        C5087 c5087 = new C5087(1, c13801);
        if (Build.VERSION.SDK_INT >= 25) {
            return new C14613(inputConnection, c5087);
        }
        return C4173.m13343(editorInfo).length == 0 ? inputConnection : new C21327(inputConnection, c5087);
    }
}
