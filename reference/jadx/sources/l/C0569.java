package l;

import java.security.AccessControlContext;
import java.security.AccessController;

/* JADX INFO: renamed from: l.֡ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H6Q8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0569 implements InterfaceC21452 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AccessControlContext f2329 = C10263.m26455(C10263.f32773, new RuntimePermission("enableContextClassLoaderOverride"), new RuntimePermission("modifyThreadGroup"), new RuntimePermission("getClassLoader"), new RuntimePermission("setContextClassLoader"));

    @Override // l.InterfaceC21452
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10965 mo2585(C10263 c10263) {
        return (C10965) AccessController.doPrivileged(new C18468(c10263), f2329);
    }
}
