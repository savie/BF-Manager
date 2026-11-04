package l;

import java.security.AccessControlContext;
import java.security.AccessController;

/* JADX INFO: renamed from: l.ܰܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H6Q8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14738 implements InterfaceC21452 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AccessControlContext f48150 = C10263.m26455(new RuntimePermission("getClassLoader"));

    @Override // l.InterfaceC21452
    /* JADX INFO: renamed from: ۙ */
    public final C10965 mo2585(C10263 c10263) {
        return (C10965) AccessController.doPrivileged(new C4298(c10263), f48150);
    }
}
