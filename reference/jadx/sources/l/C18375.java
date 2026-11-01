package l;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.function.Supplier;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ᩳ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XJ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18375 implements Supplier {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f58593;

    public /* synthetic */ C18375(int i) {
        this.f58593 = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f58593) {
            case 0:
                return ServiceC8498.f29453;
            case 1:
                char[] cArr = C22253.f72746;
                try {
                    return MessageDigest.getInstance(XMSSKeyParameters.SHA_512);
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
            default:
                int i = AbstractC23844.f77093;
                return new C6204();
        }
    }
}
