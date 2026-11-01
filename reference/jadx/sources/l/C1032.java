package l;

import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: l.֨ۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: U4EH */
/* JADX INFO: loaded from: classes2.dex */
public final class C1032 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C1032 f4816 = new C5266().m14548();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC10277 f4817;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f4818;

    public C1032(LinkedHashSet linkedHashSet, AbstractC10277 abstractC10277) {
        this.f4818 = linkedHashSet;
        this.f4817 = abstractC10277;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1032)) {
            return false;
        }
        C1032 c1032 = (C1032) obj;
        return C0140.m1235(this.f4817, c1032.f4817) && this.f4818.equals(c1032.f4818);
    }

    public final int hashCode() {
        AbstractC10277 abstractC10277 = this.f4817;
        return this.f4818.hashCode() + ((abstractC10277 != null ? abstractC10277.hashCode() : 0) * 31);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3878(String str, List list) throws SSLPeerUnverifiedException {
        List list2 = Collections.EMPTY_LIST;
        Iterator it = this.f4818.iterator();
        if (!it.hasNext()) {
            if (list2.isEmpty()) {
                return;
            }
            AbstractC10277 abstractC10277 = this.f4817;
            if (abstractC10277 != null) {
                list = abstractC10277.mo26071(str, list);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list2.size() > 0) {
                    ((C22200) list2.get(0)).getClass();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                sb.append("\n    ");
                sb.append(m3876(x509Certificate));
                sb.append(": ");
                sb.append(x509Certificate.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            int size3 = list2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                C22200 c22200 = (C22200) list2.get(i3);
                sb.append("\n    ");
                sb.append(c22200);
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
        ((C22200) it.next()).getClass();
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1032 m3877(AbstractC10277 abstractC10277) {
        return C0140.m1235(this.f4817, abstractC10277) ? this : new C1032(this.f4818, abstractC10277);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m3876(X509Certificate x509Certificate) {
        if (!C6009.m16315(x509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/".concat(C14511.m34933(x509Certificate.getPublicKey().getEncoded()).mo34937().mo34940());
    }
}
