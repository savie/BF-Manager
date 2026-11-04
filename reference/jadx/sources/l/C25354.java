package l;

import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.engines.DESEngine;

/* JADX INFO: renamed from: l.᩻᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99JQ */
/* JADX INFO: loaded from: classes.dex */
public final class C25354 implements InterfaceC15436 {
    @Override // l.InterfaceC15436
    public final Object create() {
        return new C11927(new BufferedBlockCipher(new DESEngine()));
    }
}
