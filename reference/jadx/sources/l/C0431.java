package l;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֡۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4DQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0431 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13306 f1986;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C17354 f1987;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC19887 f1988;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f1989;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f1990;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f1991;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC6595 f1992;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public List f1993;

    public C0431(C13306 c13306, C17354 c17354, InterfaceC6595 interfaceC6595, AbstractC19887 abstractC19887) {
        List list = Collections.EMPTY_LIST;
        this.f1989 = list;
        this.f1993 = list;
        this.f1990 = new ArrayList();
        this.f1986 = c13306;
        this.f1987 = c17354;
        this.f1992 = interfaceC6595;
        this.f1988 = abstractC19887;
        C16903 c16903M32873 = c13306.m32873();
        Proxy proxyM32869 = c13306.m32869();
        if (proxyM32869 != null) {
            this.f1989 = Collections.singletonList(proxyM32869);
        } else {
            List<Proxy> listSelect = c13306.m32865().select(c16903M32873.m39879());
            this.f1989 = (listSelect == null || listSelect.isEmpty()) ? C19822.m45598(Proxy.NO_PROXY) : C19822.m45597(listSelect);
        }
        this.f1991 = 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18330 m2236() throws SocketException, UnknownHostException {
        ArrayList arrayList;
        String strM39872;
        int iM39880;
        if (!m2235()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList2 = new ArrayList();
        do {
            int i = this.f1991;
            int size = this.f1989.size();
            arrayList = this.f1990;
            if (i >= size) {
                break;
            }
            int i2 = this.f1991;
            int size2 = this.f1989.size();
            C13306 c13306 = this.f1986;
            if (i2 >= size2) {
                throw new SocketException("No route to " + c13306.m32873().m39872() + "; exhausted proxy configurations: " + this.f1989);
            }
            int i3 = this.f1991;
            this.f1991 = i3 + 1;
            Proxy proxy = (Proxy) this.f1989.get(i3);
            this.f1993 = new ArrayList();
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                strM39872 = c13306.m32873().m39872();
                iM39880 = c13306.m32873().m39880();
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                InetAddress address = inetSocketAddress.getAddress();
                if (address == null) {
                    strM39872 = inetSocketAddress.getHostName();
                } else {
                    strM39872 = address.getHostAddress();
                }
                iM39880 = inetSocketAddress.getPort();
            }
            if (iM39880 < 1 || iM39880 > 65535) {
                throw new SocketException("No route to " + strM39872 + ":" + iM39880 + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.f1993.add(InetSocketAddress.createUnresolved(strM39872, iM39880));
            } else {
                this.f1988.getClass();
                List listMo15177 = c13306.m32866().mo15177(strM39872);
                if (listMo15177.isEmpty()) {
                    throw new UnknownHostException(c13306.m32866() + " returned no addresses for " + strM39872);
                }
                int size3 = listMo15177.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    this.f1993.add(new InetSocketAddress((InetAddress) listMo15177.get(i4), iM39880));
                }
            }
            int size4 = this.f1993.size();
            for (int i5 = 0; i5 < size4; i5++) {
                C7208 c7208 = new C7208(c13306, proxy, (InetSocketAddress) this.f1993.get(i5));
                if (this.f1987.m40753(c7208)) {
                    arrayList.add(c7208);
                } else {
                    arrayList2.add(c7208);
                }
            }
        } while (arrayList2.isEmpty());
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(arrayList);
            arrayList.clear();
        }
        return new C18330(arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2234(C7208 c7208, IOException iOException) {
        if (c7208.m19795().type() != Proxy.Type.DIRECT) {
            C13306 c13306 = this.f1986;
            if (c13306.m32865() != null) {
                c13306.m32865().connectFailed(c13306.m32873().m39879(), c7208.m19795().address(), iOException);
            }
        }
        this.f1987.m40754(c7208);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m2235() {
        return this.f1991 < this.f1989.size() || !this.f1990.isEmpty();
    }
}
