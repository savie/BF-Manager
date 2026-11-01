package l;

import net.sf.sevenzipjbinding.ICryptoGetTextPassword;
import net.sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.᩸֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: YB6A */
/* JADX INFO: loaded from: classes5.dex */
public final class C21266 extends C14917 implements ICryptoGetTextPassword {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f69248;

    public C21266(ISequentialOutStream iSequentialOutStream, String str) {
        super(iSequentialOutStream);
        this.f69248 = str;
    }

    @Override // net.sf.sevenzipjbinding.ICryptoGetTextPassword
    public final String cryptoGetTextPassword() {
        return this.f69248;
    }
}
