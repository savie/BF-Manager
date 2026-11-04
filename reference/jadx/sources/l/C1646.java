package l;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashSet;

/* JADX INFO: renamed from: l.֫ۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B9V6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1646 implements InterfaceC23646 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f5717 = C16980.m40038(C1646.class.getName());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InetAddress[] m5928() {
        InterfaceC25186 interfaceC25186 = f5717;
        HashSet hashSet = new HashSet();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    interfaceC25186.mo13723("Found NetworkInterface/InetAddress: {} -- {}", networkInterfaceNextElement, inetAddressNextElement);
                    try {
                        if (networkInterfaceNextElement.isUp() && networkInterfaceNextElement.supportsMulticast() && !networkInterfaceNextElement.isLoopback()) {
                            hashSet.add(inetAddressNextElement);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (SocketException e) {
            interfaceC25186.mo13729("Error while fetching network interfaces addresses: " + e);
        }
        return (InetAddress[]) hashSet.toArray(new InetAddress[hashSet.size()]);
    }
}
