package l;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴ᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20136 extends AbstractC17152 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static InterfaceC25186 f64713 = C16980.m40038(AbstractC20136.class.getName());

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public InetAddress f64714;

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo7640() {
        return false;
    }

    public AbstractC20136(String str, EnumC24021 enumC24021, EnumC6121 enumC6121, boolean z, int i, InetAddress inetAddress) {
        super(str, enumC24021, enumC6121, z, i);
        this.f64714 = inetAddress;
    }

    public AbstractC20136(String str, EnumC24021 enumC24021, EnumC6121 enumC6121, boolean z, int i, byte[] bArr) {
        super(str, enumC24021, enumC6121, z, i);
        try {
            this.f64714 = InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            f64713.mo13702("Address() exception ", (Throwable) e);
        }
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo7638(AbstractC17152 abstractC17152) {
        try {
            if (abstractC17152 instanceof AbstractC20136) {
                InetAddress inetAddress = ((AbstractC20136) abstractC17152).f64714;
                InetAddress inetAddress2 = this.f64714;
                if (inetAddress2 != null || inetAddress == null) {
                    return inetAddress2.equals(inetAddress);
                }
            }
            return false;
        } catch (Exception e) {
            f64713.mo13700("Failed to compare addresses of DNSRecords", e);
            return false;
        }
    }

    @Override // l.AbstractC14694
    /* JADX INFO: renamed from: ۙ */
    public final void mo29889(DataOutputStream dataOutputStream) throws IOException {
        super.mo29889(dataOutputStream);
        for (byte b : this.f64714.getAddress()) {
            dataOutputStream.writeByte(b);
        }
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo7639(C14168 c14168) {
        AbstractC20136 abstractC20136M49147;
        if (!c14168.m34408().m49151(this) || (abstractC20136M49147 = c14168.m34408().m49147(m35360(), m35348(), C3137.f10167)) == null) {
            return false;
        }
        int iM35349 = m35349((AbstractC17152) abstractC20136M49147);
        InterfaceC25186 interfaceC25186 = f64713;
        if (iM35349 == 0) {
            interfaceC25186.mo13721("handleQuery() Ignoring an identical address query");
            return false;
        }
        interfaceC25186.mo13721("handleQuery() Conflicting query detected.");
        if (c14168.m34446() && iM35349 > 0) {
            c14168.m34408().m49153();
            c14168.m34412().clear();
            Iterator it = ((ConcurrentMapC17249) c14168.m34445()).values().iterator();
            while (it.hasNext()) {
                ((C17307) ((AbstractC12457) it.next())).m40644();
            }
        }
        c14168.m34437();
        return true;
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo7637(C14168 c14168) {
        if (!c14168.m34408().m49151(this)) {
            return false;
        }
        f64713.mo13721("handleResponse() Denial detected");
        if (c14168.m34446()) {
            c14168.m34408().m49153();
            c14168.m34412().clear();
            Iterator it = ((ConcurrentMapC17249) c14168.m34445()).values().iterator();
            while (it.hasNext()) {
                ((C17307) ((AbstractC12457) it.next())).m40644();
            }
        }
        c14168.m34437();
        return true;
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ۙ */
    public C17307 mo7633(boolean z) {
        return new C17307(C4681.unmodifiableMap(this.f48028), 0, 0, 0, z, null);
    }

    @Override // l.AbstractC17152
    /* JADX INFO: renamed from: ۙ */
    public final C11340 mo7632(C14168 c14168) {
        C17307 c17307Mo7633 = mo7633(false);
        c17307Mo7633.m40642(c14168);
        return new C11340(c14168, c17307Mo7633.mo30939(), c17307Mo7633.getName(), c17307Mo7633);
    }

    @Override // l.AbstractC17152, l.AbstractC14694
    /* JADX INFO: renamed from: ۙ */
    public final void mo7634(StringBuilder sb) {
        super.mo7634(sb);
        sb.append(" address: '");
        InetAddress inetAddress = this.f64714;
        sb.append(inetAddress != null ? inetAddress.getHostAddress() : "null");
        sb.append('\'');
    }
}
