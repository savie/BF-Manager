package l;

import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.CCMBlockCipher;

/* JADX INFO: renamed from: l.ᩴ᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: G9IQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20132 implements InterfaceC15436 {
    @Override // l.InterfaceC15436
    public final Object create() {
        return new C23116(new CCMBlockCipher(new AESEngine()));
    }
}
