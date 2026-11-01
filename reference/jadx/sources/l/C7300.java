package l;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashSet;

/* JADX INFO: renamed from: l.۟ۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B9V6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7300 implements InterfaceC12426 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f24236 = C13488.m32998(C7300.class.getName());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InetAddress[] m19451() {
        InterfaceC4314 interfaceC4314 = f24236;
        HashSet hashSet = new HashSet();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    interfaceC4314.mo12137("Found NetworkInterface/InetAddress: {} -- {}", networkInterfaceNextElement, inetAddressNextElement);
                    try {
                        if (networkInterfaceNextElement.isUp() && networkInterfaceNextElement.supportsMulticast() && !networkInterfaceNextElement.isLoopback()) {
                            hashSet.add(inetAddressNextElement);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (SocketException e) {
            interfaceC4314.mo12116("Error while fetching network interfaces addresses: " + e);
        }
        return (InetAddress[]) hashSet.toArray(new InetAddress[hashSet.size()]);
    }
}
