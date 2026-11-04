package l;

import net.sf.sevenzipjbinding.ICryptoGetTextPassword;
import net.sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.ۡ᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: YB6A */
/* JADX INFO: loaded from: classes4.dex */
public final class C9664 extends C1462 implements ICryptoGetTextPassword {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f31207;

    public C9664(ISequentialOutStream iSequentialOutStream, String str) {
        super(iSequentialOutStream);
        this.f31207 = str;
    }

    @Override // net.sf.sevenzipjbinding.ICryptoGetTextPassword
    public final String cryptoGetTextPassword() {
        return this.f31207;
    }
}
