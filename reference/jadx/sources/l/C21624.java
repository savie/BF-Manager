package l;

import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.macs.CMac;

/* JADX INFO: renamed from: l.᩶᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9KD */
/* JADX INFO: loaded from: classes.dex */
public final class C21624 implements InterfaceC15436 {
    @Override // l.InterfaceC15436
    public final Object create() {
        return new CMac(new AESEngine());
    }
}
