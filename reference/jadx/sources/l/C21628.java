package l;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z7 */
/* JADX INFO: loaded from: classes.dex */
public final class C21628 implements InterfaceC23866 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static InterfaceC25186 f69053 = C16980.m40038(C21628.class.getName());

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C14914 f69054;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InetAddress f69055;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f69056;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public NetworkInterface f69057;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized void m49153() {
        this.f69056 = ((C12832) C19545.m45079()).m31861(this.f69056, EnumC15069.HOST);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21628 m49143(InetAddress inetAddress, C14168 c14168) {
        InetAddress localHost;
        String strSubstring;
        InterfaceC25186 interfaceC25186 = f69053;
        if (inetAddress == null) {
            try {
                String property = System.getProperty("net.mdns.interface");
                if (property != null) {
                    localHost = InetAddress.getByName(property);
                } else {
                    localHost = InetAddress.getLocalHost();
                    if (localHost.isLoopbackAddress()) {
                        InetAddress[] inetAddressArrM5928 = ((C1646) C16186.m38412()).m5928();
                        if (inetAddressArrM5928.length > 0) {
                            localHost = inetAddressArrM5928[0];
                        }
                    }
                }
                if (localHost.isLoopbackAddress()) {
                    interfaceC25186.mo13729("Could not find any address beside the loopback.");
                }
            } catch (IOException e) {
                interfaceC25186.mo13702("Could not initialize the host network interface on " + inetAddress + "because of an error: " + e.getMessage(), (Throwable) e);
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
        return new C21628(localHost, C14483.m34972(strSubstring.replaceAll("[:%\\.]", "-"), ".local."), c14168);
    }

    public C21628(InetAddress inetAddress, String str, C14168 c14168) {
        C14914 c14914 = new C14914();
        c14914.mo38970(c14168);
        this.f69054 = c14914;
        this.f69055 = inetAddress;
        this.f69056 = str;
        if (inetAddress != null) {
            try {
                this.f69057 = NetworkInterface.getByInetAddress(inetAddress);
            } catch (Exception e) {
                f69053.mo13702("LocalHostInfo() exception ", (Throwable) e);
            }
        }
    }

    public final String toString() {
        StringBuilder sbM3018 = C0703.m3018(1024, "local host info[");
        String str = this.f69056;
        if (str == null) {
            str = "no name";
        }
        sbM3018.append(str);
        sbM3018.append(", ");
        NetworkInterface networkInterface = this.f69057;
        sbM3018.append(networkInterface != null ? networkInterface.getDisplayName() : "???");
        sbM3018.append(":");
        InetAddress inetAddress = this.f69055;
        sbM3018.append(inetAddress != null ? inetAddress.getHostAddress() : "no address");
        sbM3018.append(", ");
        sbM3018.append(this.f69054);
        sbM3018.append("]");
        return sbM3018.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m49159() {
        return this.f69056;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49151(AbstractC20136 abstractC20136) {
        AbstractC20136 abstractC20136M49147 = m49147(abstractC20136.m35360(), abstractC20136.m35348(), C3137.f10167);
        return abstractC20136M49147 != null && abstractC20136M49147.m35360() == abstractC20136.m35360() && abstractC20136M49147.m35359().equalsIgnoreCase(abstractC20136.m35359()) && !abstractC20136M49147.mo7638(abstractC20136);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20136 m49147(EnumC24021 enumC24021, boolean z, int i) {
        int i2 = C4474.f16004[enumC24021.ordinal()];
        InetAddress inetAddress = this.f69055;
        if (i2 == 1) {
            if (!(inetAddress instanceof Inet4Address)) {
                return null;
            }
            return new C13423(this.f69056, EnumC24021.TYPE_A, EnumC6121.CLASS_IN, z, i, this.f69055);
        }
        if ((i2 != 2 && i2 != 3) || !(inetAddress instanceof Inet6Address)) {
            return null;
        }
        return new C5966(this.f69056, EnumC24021.TYPE_AAAA, EnumC6121.CLASS_IN, z, i, this.f69055);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2237 m49146(EnumC24021 enumC24021, int i) {
        int i2 = C4474.f16004[enumC24021.ordinal()];
        InetAddress inetAddress = this.f69055;
        if (i2 == 1) {
            if (!(inetAddress instanceof Inet4Address)) {
                return null;
            }
            return new C2237(inetAddress.getHostAddress() + ".in-addr.arpa.", EnumC6121.CLASS_IN, false, i, this.f69056);
        }
        if ((i2 != 2 && i2 != 3) || !(inetAddress instanceof Inet6Address)) {
            return null;
        }
        return new C2237(inetAddress.getHostAddress() + ".ip6.arpa.", EnumC6121.CLASS_IN, false, i, this.f69056);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m49145(EnumC6121 enumC6121, boolean z, int i) {
        C13423 c13423;
        ArrayList arrayList = new ArrayList();
        InetAddress inetAddress = this.f69055;
        C5966 c5966 = null;
        if (inetAddress instanceof Inet4Address) {
            c13423 = new C13423(this.f69056, EnumC24021.TYPE_A, EnumC6121.CLASS_IN, z, i, this.f69055);
        } else {
            c13423 = null;
        }
        if (c13423 != null && c13423.m35352(enumC6121)) {
            arrayList.add(c13423);
        }
        if (inetAddress instanceof Inet6Address) {
            c5966 = new C5966(this.f69056, EnumC24021.TYPE_AAAA, EnumC6121.CLASS_IN, z, i, this.f69055);
        }
        if (c5966 != null && c5966.m35352(enumC6121)) {
            arrayList.add(c5966);
        }
        return arrayList;
    }

    @Override // l.InterfaceC23866
    /* JADX INFO: renamed from: ۙ */
    public final void mo34430(AbstractC18053 abstractC18053) {
        this.f69054.mo34430(abstractC18053);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m49154() {
        C14914 c14914 = this.f69054;
        c14914.lock();
        try {
            c14914.m38971(EnumC21037.f67241);
            c14914.mo38975(null);
            return false;
        } finally {
            c14914.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49148(AbstractC8357 abstractC8357) {
        this.f69054.m38968(abstractC8357);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m49162() {
        this.f69054.m38973();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49149(AbstractC8357 abstractC8357, EnumC21037 enumC21037) {
        this.f69054.m38969(abstractC8357, enumC21037);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m49160(AbstractC8357 abstractC8357, EnumC21037 enumC21037) {
        C14914 c14914 = this.f69054;
        c14914.lock();
        try {
            return c14914.f53242 == abstractC8357 && c14914.f53241 == enumC21037;
        } finally {
            c14914.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49150() {
        return this.f69054.m38972();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m49144() {
        return this.f69054.f53241.m48086();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m49161() {
        return this.f69054.f53241.m48088();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m49156() {
        return this.f69054.f53241.m48082();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m49158() {
        return this.f69054.f53241.m48085();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m49152() {
        return this.f69054.f53241.m48090();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m49155() {
        return this.f69054.f53241.m48084();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m49157() {
        if (this.f69055 == null) {
            return true;
        }
        return this.f69054.m38976();
    }
}
