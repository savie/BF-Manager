package l;

import java.security.PrivilegedAction;

/* JADX INFO: renamed from: l.۠۬۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G6PO */
/* JADX INFO: loaded from: classes3.dex */
public final class C8192 implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
    }
}
