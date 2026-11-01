package l;

import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.generators.KDFCounterBytesGenerator;
import org.bouncycastle.crypto.macs.HMac;

/* JADX INFO: renamed from: l.ۙۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9KI */
/* JADX INFO: loaded from: classes3.dex */
public final class C4422 implements InterfaceC0337 {
    @Override // l.InterfaceC0337
    public final Object create() {
        return new C2972(new KDFCounterBytesGenerator(new HMac(new SHA256Digest())));
    }
}
