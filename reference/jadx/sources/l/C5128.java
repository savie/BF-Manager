package l;

import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.macs.HMac;

/* JADX INFO: renamed from: l.ۚۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9KD */
/* JADX INFO: loaded from: classes3.dex */
public final class C5128 implements InterfaceC0337 {
    @Override // l.InterfaceC0337
    public final Object create() {
        return new HMac(new MD5Digest());
    }
}
