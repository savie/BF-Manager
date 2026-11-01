package l;

import javax.crypto.spec.GCMParameterSpec;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: renamed from: l.᩷ۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G9IQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20612 extends AbstractC16379 {
    @Override // l.AbstractC16379
    /* JADX INFO: renamed from: ۙ */
    public final AEADParameters mo38565(byte[] bArr, GCMParameterSpec gCMParameterSpec) {
        return new AEADParameters(new KeyParameter(bArr), gCMParameterSpec.getTLen(), gCMParameterSpec.getIV());
    }
}
