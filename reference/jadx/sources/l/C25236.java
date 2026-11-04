package l;

import android.text.Editable;

/* JADX INFO: renamed from: l.᩻ᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B0L */
/* JADX INFO: loaded from: classes.dex */
public final class C25236 extends Editable.Factory {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object f81546 = new Object();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Class f81547;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static volatile Editable.Factory f81548;

    public static Editable.Factory getInstance() {
        if (f81548 == null) {
            synchronized (f81546) {
                if (f81548 == null) {
                    C25236 c25236 = new C25236();
                    try {
                        f81547 = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C25236.class.getClassLoader());
                    } catch (Throwable unused) {
                    }
                    f81548 = c25236;
                }
            }
        }
        return f81548;
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f81547;
        if (cls != null) {
            return C14134.m34351(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
