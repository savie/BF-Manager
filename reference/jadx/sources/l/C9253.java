package l;

import java.security.AccessControlContext;
import java.security.AccessController;

/* JADX INFO: renamed from: l.ۢ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H6Q8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9253 implements InterfaceC2901 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AccessControlContext f31466 = C5369.m14871(new RuntimePermission("getClassLoader"));

    @Override // l.InterfaceC2901
    /* JADX INFO: renamed from: ۙ */
    public final C18069 mo8709(C5369 c5369) {
        return (C18069) AccessController.doPrivileged(new C1490(c5369), f31466);
    }
}
