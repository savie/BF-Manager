package l;

import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.CCMBlockCipher;

/* JADX INFO: renamed from: l.ܺۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G9IQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15674 implements InterfaceC0337 {
    @Override // l.InterfaceC0337
    public final Object create() {
        return new C20612(new CCMBlockCipher(new AESEngine()));
    }
}
