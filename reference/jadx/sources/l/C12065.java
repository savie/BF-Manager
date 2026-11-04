package l;

import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: l.ۨۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 01O7 */
/* JADX INFO: loaded from: classes4.dex */
public class C12065 extends C3116 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f38856 = true;

    @Override // l.C16540
    /* JADX INFO: renamed from: ۙ */
    public void mo17607(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo17607(view, i);
        } else if (f38856) {
            try {
                C20270.m46537(view, i);
            } catch (NoSuchMethodError unused) {
                f38856 = false;
            }
        }
    }
}
