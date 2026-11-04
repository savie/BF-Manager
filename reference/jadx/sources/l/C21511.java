package l;

import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: l.᩶ᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4EH */
/* JADX INFO: loaded from: classes.dex */
public final class C21511 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C21511 f68742 = new C4357().m13861();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC13527 f68743;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f68744;

    public C21511(LinkedHashSet linkedHashSet, AbstractC13527 abstractC13527) {
        this.f68744 = linkedHashSet;
        this.f68743 = abstractC13527;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C21511)) {
            return false;
        }
        C21511 c21511 = (C21511) obj;
        return C19822.m45605(this.f68743, c21511.f68743) && this.f68744.equals(c21511.f68744);
    }

    public final int hashCode() {
        AbstractC13527 abstractC13527 = this.f68743;
        return this.f68744.hashCode() + ((abstractC13527 != null ? abstractC13527.hashCode() : 0) * 31);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48920(String str, List list) throws SSLPeerUnverifiedException {
        List list2 = Collections.EMPTY_LIST;
        Iterator it = this.f68744.iterator();
        if (!it.hasNext()) {
            if (list2.isEmpty()) {
                return;
            }
            AbstractC13527 abstractC13527 = this.f68743;
            if (abstractC13527 != null) {
                list = abstractC13527.mo12371(str, list);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list2.size() > 0) {
                    ((C14797) list2.get(0)).getClass();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                sb.append("\n    ");
                sb.append(m48918(x509Certificate));
                sb.append(": ");
                sb.append(x509Certificate.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            int size3 = list2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                C14797 c14797 = (C14797) list2.get(i3);
                sb.append("\n    ");
                sb.append(c14797);
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
        ((C14797) it.next()).getClass();
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21511 m48919(AbstractC13527 abstractC13527) {
        return C19822.m45605(this.f68743, abstractC13527) ? this : new C21511(this.f68744, abstractC13527);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m48918(X509Certificate x509Certificate) {
        if (!C1402.m5130(x509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/".concat(C16794.m39649(x509Certificate.getPublicKey().getEncoded()).mo23088().mo23083());
    }
}
