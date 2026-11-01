package l;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* JADX INFO: renamed from: l.᩸᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: GB8B */
/* JADX INFO: loaded from: classes4.dex */
public final class C21862 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static CertificateFactory f70947;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f70946 = "-----BEGIN CERTIFICATE-----".getBytes();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final byte[] f70948 = "-----END CERTIFICATE-----".getBytes();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static X509Certificate m48643(byte[] bArr) throws CertificateException {
        CertificateFactory certificateFactory = f70947;
        if (certificateFactory == null && certificateFactory == null) {
            try {
                f70947 = CertificateFactory.getInstance("X.509");
            } catch (CertificateException e) {
                throw new RuntimeException("Failed to create X.509 CertificateFactory", e);
            }
        }
        CertificateFactory certificateFactory2 = f70947;
        try {
            try {
                return (X509Certificate) certificateFactory2.generateCertificate(new ByteArrayInputStream(bArr));
            } catch (CertificateException unused) {
                ByteBuffer byteBufferM48642 = m48642(ByteBuffer.wrap(bArr));
                int iPosition = byteBufferM48642.position();
                X509Certificate x509Certificate = (X509Certificate) certificateFactory2.generateCertificate(new ByteArrayInputStream(C10699.m26919((Certificate) C20576.m46426(byteBufferM48642, Certificate.class))));
                byte[] bArr2 = new byte[byteBufferM48642.position() - iPosition];
                byteBufferM48642.position(iPosition);
                byteBufferM48642.get(bArr2);
                return new C15513(x509Certificate, bArr2);
            }
        } catch (CertificateException | C19871 | C23399 e2) {
            throw new CertificateException("Failed to parse certificate", e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m48642(ByteBuffer byteBuffer) throws CertificateException {
        char c;
        if (byteBuffer == null) {
            throw new NullPointerException("The certificateBuffer cannot be null");
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = f70946;
        if (iRemaining < bArr.length) {
            return byteBuffer;
        }
        byteBuffer.mark();
        for (byte b : bArr) {
            if (byteBuffer.get() != b) {
                byteBuffer.reset();
                return byteBuffer;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (byteBuffer.hasRemaining() && (c = (char) byteBuffer.get()) != '-') {
            if (!Character.isWhitespace(c)) {
                sb.append(c);
            }
        }
        int i = 1;
        while (true) {
            byte[] bArr2 = f70948;
            if (i < bArr2.length) {
                if (!byteBuffer.hasRemaining()) {
                    throw new CertificateException("The provided input contains the PEM certificate header but does not contain sufficient data for the footer");
                }
                if (byteBuffer.get() != bArr2[i]) {
                    throw new CertificateException("The provided input contains the PEM certificate header without a valid certificate footer");
                }
                i++;
            } else {
                byte[] bArrDecode = Base64.decode(sb.toString(), 2);
                int iPosition = byteBuffer.position();
                while (byteBuffer.hasRemaining() && Character.isWhitespace((char) byteBuffer.get())) {
                    iPosition++;
                }
                byteBuffer.position(iPosition);
                return ByteBuffer.wrap(bArrDecode);
            }
        }
    }
}
