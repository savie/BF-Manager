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

/* JADX INFO: renamed from: l.ۜۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F4DQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C6541 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public List f22017;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public List f22018;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16328 f22019;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f22020;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC0327 f22021;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C22874 f22022;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11617 f22023;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f22024;

    public C6541(C16328 c16328, C22874 c22874, InterfaceC11617 interfaceC11617, AbstractC0327 abstractC0327) {
        List list = Collections.EMPTY_LIST;
        this.f22017 = list;
        this.f22018 = list;
        this.f22024 = new ArrayList();
        this.f22019 = c16328;
        this.f22022 = c22874;
        this.f22023 = interfaceC11617;
        this.f22021 = abstractC0327;
        C14440 c14440M38507 = c16328.m38507();
        Proxy proxyM38506 = c16328.m38506();
        if (proxyM38506 != null) {
            this.f22017 = Collections.singletonList(proxyM38506);
        } else {
            List<Proxy> listSelect = c16328.m38504().select(c14440M38507.m34745());
            this.f22017 = (listSelect == null || listSelect.isEmpty()) ? C0140.m1228(Proxy.NO_PROXY) : C0140.m1227(listSelect);
        }
        this.f22020 = 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3718 m17774() throws SocketException, UnknownHostException {
        ArrayList arrayList;
        String strM34748;
        int iM34740;
        if (!m17773()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList2 = new ArrayList();
        do {
            int i = this.f22020;
            int size = this.f22017.size();
            arrayList = this.f22024;
            if (i >= size) {
                break;
            }
            int i2 = this.f22020;
            int size2 = this.f22017.size();
            C16328 c16328 = this.f22019;
            if (i2 >= size2) {
                throw new SocketException("No route to " + c16328.m38507().m34748() + "; exhausted proxy configurations: " + this.f22017);
            }
            int i3 = this.f22020;
            this.f22020 = i3 + 1;
            Proxy proxy = (Proxy) this.f22017.get(i3);
            this.f22018 = new ArrayList();
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                strM34748 = c16328.m38507().m34748();
                iM34740 = c16328.m38507().m34740();
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                InetAddress address = inetSocketAddress.getAddress();
                if (address == null) {
                    strM34748 = inetSocketAddress.getHostName();
                } else {
                    strM34748 = address.getHostAddress();
                }
                iM34740 = inetSocketAddress.getPort();
            }
            if (iM34740 < 1 || iM34740 > 65535) {
                throw new SocketException("No route to " + strM34748 + ":" + iM34740 + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.f22018.add(InetSocketAddress.createUnresolved(strM34748, iM34740));
            } else {
                this.f22021.getClass();
                List listMo19670 = c16328.m38503().mo19670(strM34748);
                if (listMo19670.isEmpty()) {
                    throw new UnknownHostException(c16328.m38503() + " returned no addresses for " + strM34748);
                }
                int size3 = listMo19670.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    this.f22018.add(new InetSocketAddress((InetAddress) listMo19670.get(i4), iM34740));
                }
            }
            int size4 = this.f22018.size();
            for (int i5 = 0; i5 < size4; i5++) {
                C8608 c8608 = new C8608(c16328, proxy, (InetSocketAddress) this.f22018.get(i5));
                if (this.f22022.m50619(c8608)) {
                    arrayList.add(c8608);
                } else {
                    arrayList2.add(c8608);
                }
            }
        } while (arrayList2.isEmpty());
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(arrayList);
            arrayList.clear();
        }
        return new C3718(arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17772(C8608 c8608, IOException iOException) {
        if (c8608.m22385().type() != Proxy.Type.DIRECT) {
            C16328 c16328 = this.f22019;
            if (c16328.m38504() != null) {
                c16328.m38504().connectFailed(c16328.m38507().m34745(), c8608.m22385().address(), iOException);
            }
        }
        this.f22022.m50620(c8608);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17773() {
        return this.f22020 < this.f22017.size() || !this.f22024.isEmpty();
    }
}
