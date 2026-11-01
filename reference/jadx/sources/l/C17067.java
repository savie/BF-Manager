package l;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: renamed from: l.ܿۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 33S4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17067 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InputConnection m39851(C1647 c1647, InputConnection inputConnection, EditorInfo editorInfo) {
        C4895 c4895 = new C4895(c1647);
        if (Build.VERSION.SDK_INT >= 25) {
            return new C16362(inputConnection, c4895);
        }
        return C0133.m1210(editorInfo).length == 0 ? inputConnection : new C12129(inputConnection, c4895);
    }
}
