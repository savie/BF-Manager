package l;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P53K */
/* JADX INFO: loaded from: classes4.dex */
public final class C13808 implements InterfaceC22760 {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m33720(int i) {
        return C14442.m34864(i, "http://127.0.0.1:", "/mcp");
    }

    @Override // l.InterfaceC22760
    /* JADX INFO: renamed from: ۙ */
    public void mo1200(C19929 c19929) {
        String strM36173 = C15022.m36173((byte[]) ((C14270) c19929.m45858()).m34634());
        C14270 c14270 = new C14270();
        c14270.m34621(strM36173);
        c19929.m45857(c14270);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m33716() {
        ArrayList arrayList = new ArrayList();
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.isUp() && !networkInterface.isLoopback()) {
                    for (InetAddress inetAddress : Collections.list(networkInterface.getInetAddresses())) {
                        if ((inetAddress instanceof Inet4Address) && !inetAddress.isLoopbackAddress()) {
                            arrayList.add(inetAddress.getHostAddress());
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m33717(int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = m33716().iterator();
        while (it.hasNext()) {
            arrayList.add("http://" + ((String) it.next()) + ":" + i + "/mcp");
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4825 m33719(InterfaceC23955 interfaceC23955, Object obj, InterfaceC4825 interfaceC4825) {
        C15243.m36590(interfaceC23955, "<this>");
        C15243.m36590(interfaceC4825, "completion");
        if (interfaceC23955 instanceof AbstractC20487) {
            return ((AbstractC20487) interfaceC23955).mo23811(obj, interfaceC4825);
        }
        InterfaceC11536 context = interfaceC4825.getContext();
        return context == C24963.f80840 ? new C17503(interfaceC23955, obj, interfaceC4825) : new C16011(interfaceC4825, context, interfaceC23955, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4825 m33718(InterfaceC4825 interfaceC4825) {
        C15243.m36590(interfaceC4825, "<this>");
        AbstractC6317 abstractC6317 = interfaceC4825 instanceof AbstractC6317 ? (AbstractC6317) interfaceC4825 : null;
        return abstractC6317 != null ? abstractC6317.m18032() : interfaceC4825;
    }
}
