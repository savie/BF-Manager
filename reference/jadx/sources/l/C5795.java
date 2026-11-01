package l;

import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.engines.DESEngine;

/* JADX INFO: renamed from: l.ۛۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 99JQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5795 implements InterfaceC0337 {
    @Override // l.InterfaceC0337
    public final Object create() {
        return new C17084(new BufferedBlockCipher(new DESEngine()));
    }
}
