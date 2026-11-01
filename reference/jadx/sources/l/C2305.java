package l;

import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.macs.HMac;

/* JADX INFO: renamed from: l.ۖۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9KD */
/* JADX INFO: loaded from: classes2.dex */
public final class C2305 implements InterfaceC0337 {
    @Override // l.InterfaceC0337
    public final Object create() {
        return new HMac(new SHA256Digest());
    }
}
