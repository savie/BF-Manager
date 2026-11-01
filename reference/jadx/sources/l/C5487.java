package l;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K6X0 */
/* JADX INFO: loaded from: classes3.dex */
public class C5487 implements InterfaceC19429, InterfaceC7112 {
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m15158(int i) {
        return C2271.m6966(i, "http://127.0.0.1:", "/mcp");
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public void mo15159(EnumC2300 enumC2300) {
        throw null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void mo15160(EnumC2300 enumC2300) {
        throw null;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public void mo15161(EnumC2300 enumC2300) {
        throw null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public void mo15163(EnumC2300 enumC2300) {
        throw null;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public void mo15164(EnumC2300 enumC2300) {
        throw null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void mo15165(EnumC2300 enumC2300) {
        throw null;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public void mo15166(EnumC2300 enumC2300) {
        throw null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void mo15167(EnumC2300 enumC2300) {
        throw null;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void mo15168(EnumC2300 enumC2300) {
        throw null;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public void mo15169(EnumC2300 enumC2300) {
        throw null;
    }

    @Override // l.InterfaceC7112
    /* JADX INFO: renamed from: ۙ */
    public void mo11516(CharSequence charSequence, C12052 c12052, C18503 c18503) {
        String string = charSequence.toString();
        C7063 c7063 = new C7063();
        if (c12052.m29954()) {
            c7063.m18932();
        } else {
            c7063.m18931(Integer.valueOf(c12052.m29953()));
        }
        c18503.append((CharSequence) new C4240(c7063).m11896(string));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m15156() {
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
    public static ArrayList m15157(int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = m15156().iterator();
        while (it.hasNext()) {
            arrayList.add("http://" + ((String) it.next()) + ":" + i + "/mcp");
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m15162(EnumC2300 enumC2300) {
        switch (enumC2300.ordinal()) {
            case 0:
            case 1:
                mo15161(enumC2300);
                break;
            case 2:
                mo15159(enumC2300);
                break;
            case 3:
            case 4:
                mo15169(enumC2300);
                break;
            case 5:
            case 6:
            case 7:
                mo15165(enumC2300);
                break;
            case 8:
                mo15163(enumC2300);
                break;
            case 9:
                mo15166(enumC2300);
                break;
            case 10:
            case 11:
                mo15160(enumC2300);
                break;
            case 12:
                mo15167(enumC2300);
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                mo15168(enumC2300);
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                mo15164(enumC2300);
                break;
        }
    }
}
