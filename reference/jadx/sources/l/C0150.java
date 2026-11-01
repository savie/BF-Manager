package l;

import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.GCMBlockCipher;

/* JADX INFO: renamed from: l.֡ۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G9IQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0150 implements InterfaceC0337 {
    @Override // l.InterfaceC0337
    public final Object create() {
        return new C19907(new GCMBlockCipher(new AESEngine()));
    }
}
