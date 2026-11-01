package l;

import android.app.Application;
import android.os.Build;

/* JADX INFO: renamed from: l.ۛܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59KE */
/* JADX INFO: loaded from: classes2.dex */
public class ApplicationC6132 extends Application {
    /* JADX INFO: renamed from: ۤ᩻᩻, reason: not valid java name and contains not printable characters */
    public static native void m17119(int i);

    static {
        System.loadLibrary("mtprotect");
        if (Build.VERSION.SDK_INT >= 28) {
            C14751.m35370("Landroid/", "Lcom/android/");
        }
    }
}
