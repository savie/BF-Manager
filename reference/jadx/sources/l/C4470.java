package l;

import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.macs.HMac;

/* JADX INFO: renamed from: l.ۘ᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9KD */
/* JADX INFO: loaded from: classes3.dex */
public final class C4470 implements InterfaceC15436 {
    @Override // l.InterfaceC15436
    public final Object create() {
        return new HMac(new SHA256Digest());
    }
}
