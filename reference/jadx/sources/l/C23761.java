package l;

import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: l.᩻ܳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01O7 */
/* JADX INFO: loaded from: classes2.dex */
public class C23761 extends C6121 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static boolean f76875 = true;

    @Override // l.C0476
    /* JADX INFO: renamed from: ۙ */
    public void mo2346(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo2346(view, i);
        } else if (f76875) {
            try {
                C11061.m27880(view, i);
            } catch (NoSuchMethodError unused) {
                f76875 = false;
            }
        }
    }
}
