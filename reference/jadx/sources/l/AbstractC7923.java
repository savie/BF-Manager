package l;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7923 extends AbstractC19918 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4314 f26021 = C13488.m32998(AbstractC7923.class.getName());

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InetAddress f26022;

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo19185() {
        return false;
    }

    public AbstractC7923(String str, EnumC14357 enumC14357, EnumC23529 enumC23529, boolean z, int i, InetAddress inetAddress) {
        super(str, enumC14357, enumC23529, z, i);
        this.f26022 = inetAddress;
    }

    public AbstractC7923(String str, EnumC14357 enumC14357, EnumC23529 enumC23529, boolean z, int i, byte[] bArr) {
        super(str, enumC14357, enumC23529, z, i);
        try {
            this.f26022 = InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            f26021.mo12122("Address() exception ", (Throwable) e);
        }
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo19182(AbstractC19918 abstractC19918) {
        try {
            if (abstractC19918 instanceof AbstractC7923) {
                InetAddress inetAddress = ((AbstractC7923) abstractC19918).f26022;
                InetAddress inetAddress2 = this.f26022;
                if (inetAddress2 != null || inetAddress == null) {
                    return inetAddress2.equals(inetAddress);
                }
            }
            return false;
        } catch (Exception e) {
            f26021.mo12136("Failed to compare addresses of DNSRecords", e);
            return false;
        }
    }

    @Override // l.AbstractC9604
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20927(DataOutputStream dataOutputStream) throws IOException {
        super.mo20927(dataOutputStream);
        for (byte b : this.f26022.getAddress()) {
            dataOutputStream.writeByte(b);
        }
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo19184(C22823 c22823) {
        AbstractC7923 abstractC7923M8886;
        if (!c22823.m50562().m8890(this) || (abstractC7923M8886 = c22823.m50562().m8886(m24467(), m24468(), C17178.f54761)) == null) {
            return false;
        }
        int iM24469 = m24469((AbstractC19918) abstractC7923M8886);
        InterfaceC4314 interfaceC4314 = f26021;
        if (iM24469 == 0) {
            interfaceC4314.mo12135("handleQuery() Ignoring an identical address query");
            return false;
        }
        interfaceC4314.mo12135("handleQuery() Conflicting query detected.");
        if (c22823.m50548() && iM24469 > 0) {
            c22823.m50562().m8893();
            c22823.m50566().clear();
            Iterator it = ((ConcurrentMapC13783) c22823.m50563()).values().iterator();
            while (it.hasNext()) {
                ((C0244) ((AbstractC11015) it.next())).m1652();
            }
        }
        c22823.m50530();
        return true;
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo19183(C22823 c22823) {
        if (!c22823.m50562().m8890(this)) {
            return false;
        }
        f26021.mo12135("handleResponse() Denial detected");
        if (c22823.m50548()) {
            c22823.m50562().m8893();
            c22823.m50566().clear();
            Iterator it = ((ConcurrentMapC13783) c22823.m50563()).values().iterator();
            while (it.hasNext()) {
                ((C0244) ((AbstractC11015) it.next())).m1652();
            }
        }
        c22823.m50530();
        return true;
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ۙ */
    public C0244 mo19176(boolean z) {
        return new C0244(C0561.unmodifiableMap(this.f32353), 0, 0, 0, z, null);
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ۙ */
    public final C20706 mo19177(C22823 c22823) {
        C0244 c0244Mo19176 = mo19176(false);
        c0244Mo19176.m1649(c22823);
        return new C20706(c22823, c0244Mo19176.mo1660(), c0244Mo19176.getName(), c0244Mo19176);
    }

    @Override // l.AbstractC19918, l.AbstractC9604
    /* JADX INFO: renamed from: ۙ */
    public final void mo19178(StringBuilder sb) {
        super.mo19178(sb);
        sb.append(" address: '");
        InetAddress inetAddress = this.f26022;
        sb.append(inetAddress != null ? inetAddress.getHostAddress() : "null");
        sb.append('\'');
    }
}
