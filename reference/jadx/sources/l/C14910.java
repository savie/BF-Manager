package l;

import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.macs.HMac;

/* JADX INFO: renamed from: l.ܰ᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9KD */
/* JADX INFO: loaded from: classes5.dex */
public final class C14910 implements InterfaceC15436 {
    @Override // l.InterfaceC15436
    public final Object create() {
        return new HMac(new MD5Digest());
    }
}
