package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: l.۠֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64DG */
/* JADX INFO: loaded from: classes4.dex */
public final class C8307 extends AbstractC13527 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22016 f27274;

    public C8307(InterfaceC22016 interfaceC22016) {
        this.f27274 = interfaceC22016;
    }

    @Override // l.AbstractC13527
    /* JADX INFO: renamed from: ۙ */
    public final List mo12371(String str, List list) throws SSLPeerUnverifiedException {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) j$$ExternalSyntheticOutline0.m(arrayList, 1);
            X509Certificate x509CertificateMo18990 = this.f27274.mo18990(x509Certificate);
            if (x509CertificateMo18990 != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateMo18990)) {
                    arrayList.add(x509CertificateMo18990);
                }
                if (x509CertificateMo18990.getIssuerDN().equals(x509CertificateMo18990.getSubjectDN())) {
                    try {
                        x509CertificateMo18990.verify(x509CertificateMo18990.getPublicKey());
                        return arrayList;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        if (!z) {
                            throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                        }
                        return arrayList;
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                            break;
                        } catch (GeneralSecurityException unused2) {
                        }
                    }
                }
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final int hashCode() {
        return this.f27274.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C8307) && ((C8307) obj).f27274.equals(this.f27274);
    }
}
