package l;

import java.security.AccessControlContext;
import java.security.AccessController;

/* JADX INFO: renamed from: l.ܰ۬۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H6Q8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13837 implements InterfaceC2901 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AccessControlContext f45657 = C5369.m14871(C5369.f18541, new RuntimePermission("enableContextClassLoaderOverride"), new RuntimePermission("modifyThreadGroup"), new RuntimePermission("getClassLoader"), new RuntimePermission("setContextClassLoader"));

    @Override // l.InterfaceC2901
    /* JADX INFO: renamed from: ۙ */
    public final C18069 mo8709(C5369 c5369) {
        return (C18069) AccessController.doPrivileged(new C4663(c5369), f45657);
    }
}
