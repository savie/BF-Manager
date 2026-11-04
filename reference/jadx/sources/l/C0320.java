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

/* JADX INFO: renamed from: l.֡ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7B2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0320 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f1756;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13921 f1757;

    public C0320(Context context, C13921 c13921) {
        this.f1756 = context.getApplicationContext();
        this.f1757 = c13921;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9268 m2014() {
        C9268 c9268;
        C9268 c9268M2011;
        C9268 c9269;
        this.f1757.getClass();
        Inet4Address inet4AddressM55712 = C24955.m55712();
        if (inet4AddressM55712 == null || inet4AddressM55712.isAnyLocalAddress() || inet4AddressM55712.isLoopbackAddress() || inet4AddressM55712.isMulticastAddress() || inet4AddressM55712.isLinkLocalAddress()) {
            return new C9268(null, null, null, Collections.EMPTY_LIST);
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f1756.getSystemService("connectivity");
        if (connectivityManager == null) {
            c9268 = new C9268(inet4AddressM55712, null, Collections.EMPTY_LIST);
        } else if (Build.VERSION.SDK_INT < 23 || (c9268M2011 = m2011(connectivityManager, connectivityManager.getActiveNetwork(), inet4AddressM55712)) == null) {
            Network[] allNetworks = connectivityManager.getAllNetworks();
            if (allNetworks != null) {
                int length = allNetworks.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        C9268 c9268M2012 = m2011(connectivityManager, allNetworks[i], inet4AddressM55712);
                        if (c9268M2012 != null) {
                            c9268 = c9268M2012;
                            break;
                        }
                        i++;
                    } else {
                        c9268 = new C9268(inet4AddressM55712, null, Collections.EMPTY_LIST);
                        break;
                    }
                }
            } else {
                c9268 = new C9268(inet4AddressM55712, null, Collections.EMPTY_LIST);
                break;
            }
        } else {
            c9268 = c9268M2011;
        }
        InetAddress inetAddress = c9268.f30147;
        List list = c9268.f30148;
        if (inetAddress != null && !list.isEmpty()) {
            return c9268;
        }
        try {
            c9269 = m2012(inet4AddressM55712);
        } catch (RuntimeException unused) {
            c9269 = new C9268(inet4AddressM55712, null, Collections.EMPTY_LIST);
        }
        if (inetAddress == null) {
            inetAddress = c9269.f30147;
        }
        if (list.isEmpty()) {
            list = c9269.f30148;
        }
        return new C9268(inet4AddressM55712, (inetAddress == null || list.isEmpty() || m2013(list, inetAddress)) ? inetAddress : null, list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9268 m2011(ConnectivityManager connectivityManager, Network network, Inet4Address inet4Address) {
        LinkProperties linkProperties;
        InetAddress gateway;
        if (network != null && (linkProperties = connectivityManager.getLinkProperties(network)) != null) {
            ArrayList arrayList = new ArrayList();
            for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
                InetAddress address = linkAddress.getAddress();
                if (address instanceof Inet4Address) {
                    C1066 c1066 = new C1066(address, linkAddress.getPrefixLength());
                    if (c1066.m4003(inet4Address)) {
                        arrayList.add(c1066);
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
                    if (next.isDefaultRoute() && C2557.m8577(next.getGateway())) {
                        gateway = next.getGateway();
                        break;
                    }
                }
                return new C9268(inet4Address, (gateway == null || m2013(arrayList, gateway)) ? gateway : null, arrayList);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C9268 m2012(Inet4Address inet4Address) {
        List listSingletonList;
        WifiManager wifiManager = (WifiManager) this.f1756.getSystemService("wifi");
        if (wifiManager == null) {
            return new C9268(inet4Address, null, Collections.EMPTY_LIST);
        }
        DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
        if (dhcpInfo == null) {
            return new C9268(inet4Address, null, Collections.EMPTY_LIST);
        }
        if (!inet4Address.equals(C2557.m8584(dhcpInfo.ipAddress))) {
            return new C9268(inet4Address, null, Collections.EMPTY_LIST);
        }
        int iM8585 = C2557.m8585(dhcpInfo.netmask);
        if (iM8585 < 0) {
            listSingletonList = Collections.EMPTY_LIST;
        } else {
            listSingletonList = Collections.singletonList(new C1066(inet4Address, iM8585));
        }
        InetAddress inetAddressM8578 = C2557.m8578(dhcpInfo.gateway);
        if (!C2557.m8577(inetAddressM8578)) {
            inetAddressM8578 = null;
        }
        if (inetAddressM8578 != null && !listSingletonList.isEmpty() && !m2013(listSingletonList, inetAddressM8578)) {
            return new C9268(inet4Address, null, Collections.EMPTY_LIST);
        }
        return new C9268(inet4Address, inetAddressM8578, listSingletonList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m2013(List list, InetAddress inetAddress) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C1066) it.next()).m4003(inetAddress)) {
                return true;
            }
        }
        return false;
    }
}
