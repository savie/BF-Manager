package l;

import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.GCMBlockCipher;

/* JADX INFO: renamed from: l.۫᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: G9IQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13419 implements InterfaceC15436 {
    @Override // l.InterfaceC15436
    public final Object create() {
        return new C15656(new GCMBlockCipher(new AESEngine()));
    }
}
