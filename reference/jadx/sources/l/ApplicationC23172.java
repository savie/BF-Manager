package l;

import android.app.Application;
import android.os.Build;

/* JADX INFO: renamed from: l.᩹֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 59KE */
/* JADX INFO: loaded from: classes.dex */
public class ApplicationC23172 extends Application {
    /* JADX INFO: renamed from: ۗ۟᩸, reason: not valid java name and contains not printable characters */
    public static native void m52091(int i);

    static {
        System.loadLibrary("mtprotect");
        if (Build.VERSION.SDK_INT >= 28) {
            C15979.m38109("Landroid/", "Lcom/android/");
        }
    }
}
