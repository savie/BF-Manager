package l;

import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: l.᩵۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: W9DK */
/* JADX INFO: loaded from: classes5.dex */
public final class C20572 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m47170(C5833 c5833) {
        try {
            Class<?> cls = Class.forName("android.view.ViewTreeObserver$OnComputeInternalInsetsListener");
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C3418(c5833));
        } catch (Exception unused) {
            return null;
        }
    }
}
