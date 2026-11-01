package l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.RouteInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7B2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6965 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f23402;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0219 f23403;

    public C6965(Context context, C0219 c0219) {
        this.f23402 = context.getApplicationContext();
        this.f23403 = c0219;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18960 m18717() {
        C18960 c18960;
        C18960 c18960M18714;
        C18960 c18961;
        this.f23403.getClass();
        Inet4Address inet4AddressM40774 = C17506.m40774();
        if (inet4AddressM40774 == null || inet4AddressM40774.isAnyLocalAddress() || inet4AddressM40774.isLoopbackAddress() || inet4AddressM40774.isMulticastAddress() || inet4AddressM40774.isLinkLocalAddress()) {
            return new C18960(null, null, null, Collections.EMPTY_LIST);
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f23402.getSystemService("connectivity");
        if (connectivityManager == null) {
            c18960 = new C18960(inet4AddressM40774, null, Collections.EMPTY_LIST);
        } else if (Build.VERSION.SDK_INT < 23 || (c18960M18714 = m18714(connectivityManager, connectivityManager.getActiveNetwork(), inet4AddressM40774)) == null) {
            Network[] allNetworks = connectivityManager.getAllNetworks();
            if (allNetworks != null) {
                int length = allNetworks.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        C18960 c18960M18715 = m18714(connectivityManager, allNetworks[i], inet4AddressM40774);
                        if (c18960M18715 != null) {
                            c18960 = c18960M18715;
                            break;
                        }
                        i++;
                    } else {
                        c18960 = new C18960(inet4AddressM40774, null, Collections.EMPTY_LIST);
                        break;
                    }
                }
            } else {
                c18960 = new C18960(inet4AddressM40774, null, Collections.EMPTY_LIST);
                break;
            }
        } else {
            c18960 = c18960M18714;
        }
        InetAddress inetAddress = c18960.f61397;
        List list = c18960.f61394;
        if (inetAddress != null && !list.isEmpty()) {
            return c18960;
        }
        try {
            c18961 = m18715(inet4AddressM40774);
        } catch (RuntimeException unused) {
            c18961 = new C18960(inet4AddressM40774, null, Collections.EMPTY_LIST);
        }
        if (inetAddress == null) {
            inetAddress = c18961.f61397;
        }
        if (list.isEmpty()) {
            list = c18961.f61394;
        }
        return new C18960(inet4AddressM40774, (inetAddress == null || list.isEmpty() || m18716(list, inetAddress)) ? inetAddress : null, list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18960 m18714(ConnectivityManager connectivityManager, Network network, Inet4Address inet4Address) {
        LinkProperties linkProperties;
        InetAddress gateway;
        if (network != null && (linkProperties = connectivityManager.getLinkProperties(network)) != null) {
            ArrayList arrayList = new ArrayList();
            for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
                InetAddress address = linkAddress.getAddress();
                if (address instanceof Inet4Address) {
                    C18254 c18254 = new C18254(address, linkAddress.getPrefixLength());
                    if (c18254.m42446(inet4Address)) {
                        arrayList.add(c18254);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator<RouteInfo> it = linkProperties.getRoutes().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        gateway = null;
                        break;
                    }
                    RouteInfo next = it.next();
                    if (next.isDefaultRoute() && C8377.m21994(next.getGateway())) {
                        gateway = next.getGateway();
                        break;
                    }
                }
                return new C18960(inet4Address, (gateway == null || m18716(arrayList, gateway)) ? gateway : null, arrayList);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C18960 m18715(Inet4Address inet4Address) {
        List listSingletonList;
        WifiManager wifiManager = (WifiManager) this.f23402.getSystemService("wifi");
        if (wifiManager == null) {
            return new C18960(inet4Address, null, Collections.EMPTY_LIST);
        }
        DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
        if (dhcpInfo == null) {
            return new C18960(inet4Address, null, Collections.EMPTY_LIST);
        }
        if (!inet4Address.equals(C8377.m22001(dhcpInfo.ipAddress))) {
            return new C18960(inet4Address, null, Collections.EMPTY_LIST);
        }
        int iM21987 = C8377.m21987(dhcpInfo.netmask);
        if (iM21987 < 0) {
            listSingletonList = Collections.EMPTY_LIST;
        } else {
            listSingletonList = Collections.singletonList(new C18254(inet4Address, iM21987));
        }
        InetAddress inetAddressM21997 = C8377.m21997(dhcpInfo.gateway);
        if (!C8377.m21994(inetAddressM21997)) {
            inetAddressM21997 = null;
        }
        if (inetAddressM21997 != null && !listSingletonList.isEmpty() && !m18716(listSingletonList, inetAddressM21997)) {
            return new C18960(inet4Address, null, Collections.EMPTY_LIST);
        }
        return new C18960(inet4Address, inetAddressM21997, listSingletonList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m18716(List list, InetAddress inetAddress) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C18254) it.next()).m42446(inetAddress)) {
                return true;
            }
        }
        return false;
    }
}
