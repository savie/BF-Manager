package l;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: l.᩵ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 64DG */
/* JADX INFO: loaded from: classes5.dex */
public final class C19449 extends AbstractC10277 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20860 f62624;

    public C19449(InterfaceC20860 interfaceC20860) {
        this.f62624 = interfaceC20860;
    }

    @Override // l.AbstractC10277
    /* JADX INFO: renamed from: ۙ */
    public final List mo26071(String str, List list) throws SSLPeerUnverifiedException {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) C19084.m43861(arrayList, 1);
            X509Certificate x509CertificateMo4113 = this.f62624.mo4113(x509Certificate);
            if (x509CertificateMo4113 != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateMo4113)) {
                    arrayList.add(x509CertificateMo4113);
                }
                if (x509CertificateMo4113.getIssuerDN().equals(x509CertificateMo4113.getSubjectDN())) {
                    try {
                        x509CertificateMo4113.verify(x509CertificateMo4113.getPublicKey());
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
        return this.f62624.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C19449) && ((C19449) obj).f62624.equals(this.f62624);
    }
}
