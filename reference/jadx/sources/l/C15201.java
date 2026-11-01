package l;

import java.util.function.Supplier;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ܶۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15201 implements Supplier {
    @Override // java.util.function.Supplier
    public final Object get() {
        return new C10262(513, XMSSKeyParameters.SHA_256, "EC", "SHA256withECDSA", null);
    }
}
