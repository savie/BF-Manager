package l;

import org.bouncycastle.crypto.generators.KDFCounterBytesGenerator;
import org.bouncycastle.crypto.params.KDFCounterParameters;

/* JADX INFO: renamed from: l.ܰۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9KI */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13596 implements InterfaceC19201 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final KDFCounterBytesGenerator f44836;

    @Override // l.InterfaceC19201
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo33217(C17828 c17828) {
        this.f44836.init(new KDFCounterParameters(c17828.m41404(), c17828.m41405(), c17828.m41403()));
    }

    public AbstractC13596(KDFCounterBytesGenerator kDFCounterBytesGenerator) {
        this.f44836 = kDFCounterBytesGenerator;
    }

    @Override // l.InterfaceC19201
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo33216(int i, byte[] bArr) {
        return this.f44836.generateBytes(bArr, 0, i);
    }
}
