package l;

import javax.crypto.spec.GCMParameterSpec;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: renamed from: l.᩸᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: G9IQ */
/* JADX INFO: loaded from: classes.dex */
public final class C23116 extends AbstractC5962 {
    @Override // l.AbstractC5962
    /* JADX INFO: renamed from: ۙ */
    public final AEADParameters mo17348(byte[] bArr, GCMParameterSpec gCMParameterSpec) {
        return new AEADParameters(new KeyParameter(bArr), gCMParameterSpec.getTLen(), gCMParameterSpec.getIV());
    }
}
