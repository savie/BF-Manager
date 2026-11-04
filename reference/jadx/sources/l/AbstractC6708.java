package l;

import org.bouncycastle.crypto.generators.KDFCounterBytesGenerator;
import org.bouncycastle.crypto.params.KDFCounterParameters;

/* JADX INFO: renamed from: l.ۛ᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9KI */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6708 implements InterfaceC13944 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final KDFCounterBytesGenerator f22312;

    @Override // l.InterfaceC13944
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18724(C12479 c12479) {
        this.f22312.init(new KDFCounterParameters(c12479.m30999(), c12479.m31004(), c12479.m30992()));
    }

    public AbstractC6708(KDFCounterBytesGenerator kDFCounterBytesGenerator) {
        this.f22312 = kDFCounterBytesGenerator;
    }

    @Override // l.InterfaceC13944
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo18723(int i, byte[] bArr) {
        return this.f22312.generateBytes(bArr, 0, i);
    }
}
