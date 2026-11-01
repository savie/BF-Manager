package l;

import android.text.Editable;

/* JADX INFO: renamed from: l.ᩳۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B0L */
/* JADX INFO: loaded from: classes4.dex */
public final class C17838 extends Editable.Factory {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object f56517 = new Object();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Class f56518;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static volatile Editable.Factory f56519;

    public static Editable.Factory getInstance() {
        if (f56519 == null) {
            synchronized (f56517) {
                if (f56519 == null) {
                    C17838 c17838 = new C17838();
                    try {
                        f56518 = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C17838.class.getClassLoader());
                    } catch (Throwable unused) {
                    }
                    f56519 = c17838;
                }
            }
        }
        return f56519;
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f56518;
        if (cls != null) {
            return C2938.m8767(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
