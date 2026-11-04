package l;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.function.Supplier;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.᩺ۤ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24233 implements Supplier {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f78480;

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f78480) {
            case 0:
                return C17691.m41400();
            default:
                char[] cArr = C15022.f49061;
                try {
                    return MessageDigest.getInstance(XMSSKeyParameters.SHA_512);
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}
