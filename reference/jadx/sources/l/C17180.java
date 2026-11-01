package l;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: renamed from: l.ܿۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4WE */
/* JADX INFO: loaded from: classes4.dex */
public final class C17180 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    @SuppressLint({"StaticFieldLeak"})
    public static Context f54766;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40102() {
        try {
            System.loadLibrary("pl_droidsonroids_gif");
        } catch (UnsatisfiedLinkError unused) {
            if (f54766 == null) {
                try {
                    f54766 = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", null).invoke(null, null);
                } catch (Exception e) {
                    throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e);
                }
            }
            C1765.m5806(f54766);
        }
    }
}
