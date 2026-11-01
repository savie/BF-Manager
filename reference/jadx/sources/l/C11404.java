package l;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: l.ۨۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L19N */
/* JADX INFO: loaded from: classes3.dex */
public final class C11404 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        char[] cArr = C22253.f72746;
        try {
            return MessageDigest.getInstance("SHA-384");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
