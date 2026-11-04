package l;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۫ܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: UB8Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C13183 extends C15420 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f42112;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f42113;

    public C13183(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f42112 = -1;
        this.f42113 = (byte[]) bArr.clone();
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        byte[] bArr = this.f42113;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    @Override // java.security.cert.Certificate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X509Certificate)) {
            return false;
        }
        try {
            return Arrays.equals(getEncoded(), ((X509Certificate) obj).getEncoded());
        } catch (CertificateEncodingException unused) {
            return false;
        }
    }

    @Override // java.security.cert.Certificate
    public final int hashCode() {
        if (this.f42112 == -1) {
            try {
                this.f42112 = Arrays.hashCode(getEncoded());
            } catch (CertificateEncodingException unused) {
                this.f42112 = 0;
            }
        }
        return this.f42112;
    }
}
