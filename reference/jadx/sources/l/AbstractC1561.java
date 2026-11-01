package l;

import org.bouncycastle.crypto.engines.RC4Engine;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: renamed from: l.֫ۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 99JQ */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1561 implements InterfaceC7912 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public RC4Engine f6292;

    public AbstractC1561(RC4Engine rC4Engine) {
        this.f6292 = rC4Engine;
    }

    @Override // l.InterfaceC7912
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5340(EnumC18495 enumC18495, byte[] bArr) {
        this.f6292.init(enumC18495 == EnumC18495.ENCRYPT, new KeyParameter(bArr));
    }

    @Override // l.InterfaceC7912
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo5339(int i, byte[] bArr, byte[] bArr2) {
        return this.f6292.processBytes(bArr, 0, i, bArr2, 0);
    }

    @Override // l.InterfaceC7912
    public final int doFinal(byte[] bArr, int i) {
        this.f6292.reset();
        return 0;
    }
}
