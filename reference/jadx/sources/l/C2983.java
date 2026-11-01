package l;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2983 implements InterfaceC12157 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static InterfaceC4314 f11190 = C13488.m32998(C2983.class.getName());

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f11191;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InetAddress f11192;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9335 f11193;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public NetworkInterface f11194;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m8893() {
        this.f11191 = ((C8712) C8006.m21103()).m22545(this.f11191, EnumC19295.HOST);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2983 m8880(InetAddress inetAddress, C22823 c22823) {
        InetAddress localHost;
        String strSubstring;
        InterfaceC4314 interfaceC4314 = f11190;
        if (inetAddress == null) {
            try {
                String property = System.getProperty("net.mdns.interface");
                if (property != null) {
                    localHost = InetAddress.getByName(property);
                } else {
                    localHost = InetAddress.getLocalHost();
                    if (localHost.isLoopbackAddress()) {
                        InetAddress[] inetAddressArrM19451 = ((C7300) C16659.m39124()).m19451();
                        if (inetAddressArrM19451.length > 0) {
                            localHost = inetAddressArrM19451[0];
                        }
                    }
                }
                if (localHost.isLoopbackAddress()) {
                    interfaceC4314.mo12116("Could not find any address beside the loopback.");
                }
            } catch (IOException e) {
                interfaceC4314.mo12122("Could not initialize the host network interface on " + inetAddress + "because of an error: " + e.getMessage(), (Throwable) e);
                InetAddress byName = null;
                try {
                    byName = InetAddress.getByName(null);
                } catch (UnknownHostException unused) {
                }
                localHost = byName;
                strSubstring = "computer";
            }
        } else {
            localHost = inetAddress;
        }
        strSubstring = "".length() == 0 ? localHost.getHostName() : "";
        if (strSubstring.contains("in-addr.arpa") || strSubstring.equals(localHost.getHostAddress())) {
            strSubstring = localHost.getHostAddress();
        }
        int iIndexOf = strSubstring.indexOf(".local");
        if (iIndexOf > 0) {
            strSubstring = strSubstring.substring(0, iIndexOf);
        }
        return new C2983(localHost, C15489.m37076(strSubstring.replaceAll("[:%\\.]", "-"), ".local."), c22823);
    }

    public C2983(InetAddress inetAddress, String str, C22823 c22823) {
        C9335 c9335 = new C9335();
        c9335.mo38595(c22823);
        this.f11193 = c9335;
        this.f11192 = inetAddress;
        this.f11191 = str;
        if (inetAddress != null) {
            try {
                this.f11194 = NetworkInterface.getByInetAddress(inetAddress);
            } catch (Exception e) {
                f11190.mo12122("LocalHostInfo() exception ", (Throwable) e);
            }
        }
    }

    public final String toString() {
        StringBuilder sbM40152 = C17214.m40152(1024, "local host info[");
        String str = this.f11191;
        if (str == null) {
            str = "no name";
        }
        sbM40152.append(str);
        sbM40152.append(", ");
        NetworkInterface networkInterface = this.f11194;
        sbM40152.append(networkInterface != null ? networkInterface.getDisplayName() : "???");
        sbM40152.append(":");
        InetAddress inetAddress = this.f11192;
        sbM40152.append(inetAddress != null ? inetAddress.getHostAddress() : "no address");
        sbM40152.append(", ");
        sbM40152.append(this.f11193);
        sbM40152.append("]");
        return sbM40152.toString();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m8895() {
        return this.f11191;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m8890(AbstractC7923 abstractC7923) {
        AbstractC7923 abstractC7923M8886 = m8886(abstractC7923.m24467(), abstractC7923.m24468(), C17178.f54761);
        return abstractC7923M8886 != null && abstractC7923M8886.m24467() == abstractC7923.m24467() && abstractC7923M8886.m24477().equalsIgnoreCase(abstractC7923.m24477()) && !abstractC7923M8886.mo19182(abstractC7923);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC7923 m8886(EnumC14357 enumC14357, boolean z, int i) {
        int i2 = C1572.f6322[enumC14357.ordinal()];
        InetAddress inetAddress = this.f11192;
        if (i2 == 1) {
            if (!(inetAddress instanceof Inet4Address)) {
                return null;
            }
            return new C8629(this.f11191, EnumC14357.TYPE_A, EnumC23529.CLASS_IN, z, i, this.f11192);
        }
        if ((i2 != 2 && i2 != 3) || !(inetAddress instanceof Inet6Address)) {
            return null;
        }
        return new C10040(this.f11191, EnumC14357.TYPE_AAAA, EnumC23529.CLASS_IN, z, i, this.f11192);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7217 m8885(EnumC14357 enumC14357, int i) {
        int i2 = C1572.f6322[enumC14357.ordinal()];
        InetAddress inetAddress = this.f11192;
        if (i2 == 1) {
            if (!(inetAddress instanceof Inet4Address)) {
                return null;
            }
            return new C7217(inetAddress.getHostAddress() + ".in-addr.arpa.", EnumC23529.CLASS_IN, false, i, this.f11191);
        }
        if ((i2 != 2 && i2 != 3) || !(inetAddress instanceof Inet6Address)) {
            return null;
        }
        return new C7217(inetAddress.getHostAddress() + ".ip6.arpa.", EnumC23529.CLASS_IN, false, i, this.f11191);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m8884(EnumC23529 enumC23529, boolean z, int i) {
        C8629 c8629;
        ArrayList arrayList = new ArrayList();
        InetAddress inetAddress = this.f11192;
        C10040 c10040 = null;
        if (inetAddress instanceof Inet4Address) {
            c8629 = new C8629(this.f11191, EnumC14357.TYPE_A, EnumC23529.CLASS_IN, z, i, this.f11192);
        } else {
            c8629 = null;
        }
        if (c8629 != null && c8629.m24472(enumC23529)) {
            arrayList.add(c8629);
        }
        if (inetAddress instanceof Inet6Address) {
            c10040 = new C10040(this.f11191, EnumC14357.TYPE_AAAA, EnumC23529.CLASS_IN, z, i, this.f11192);
        }
        if (c10040 != null && c10040.m24472(enumC23529)) {
            arrayList.add(c10040);
        }
        return arrayList;
    }

    @Override // l.InterfaceC12157
    /* JADX INFO: renamed from: ۙ */
    public final void mo1648(AbstractC4955 abstractC4955) {
        this.f11193.mo1648(abstractC4955);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m8892() {
        C9335 c9335 = this.f11193;
        c9335.lock();
        try {
            c9335.m38592(EnumC3066.f11545);
            c9335.mo38599(null);
            return false;
        } finally {
            c9335.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8887(AbstractC4249 abstractC4249) {
        this.f11193.m38593(abstractC4249);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m8899() {
        this.f11193.m38597();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8888(AbstractC4249 abstractC4249, EnumC3066 enumC3066) {
        this.f11193.m38594(abstractC4249, enumC3066);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m8896(AbstractC4249 abstractC4249, EnumC3066 enumC3066) {
        C9335 c9335 = this.f11193;
        c9335.lock();
        try {
            return c9335.f52742 == abstractC4249 && c9335.f52744 == enumC3066;
        } finally {
            c9335.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m8889() {
        return this.f11193.m38596();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m8883() {
        return this.f11193.f52744.m9203();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m8882() {
        return this.f11193.f52744.m9202();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m8898() {
        return this.f11193.f52744.m9198();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m8891() {
        return this.f11193.f52744.m9197();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m8894() {
        return this.f11193.f52744.m9205();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m8881() {
        return this.f11193.f52744.m9201();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m8897() {
        if (this.f11192 == null) {
            return true;
        }
        return this.f11193.m38591();
    }
}
