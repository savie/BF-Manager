package l;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۛۤ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6333 implements Supplier {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21442;

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f21442) {
            case 0:
                return C17691.m41403();
            default:
                char[] cArr = C15022.f49061;
                try {
                    return MessageDigest.getInstance("SHA-384");
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}
