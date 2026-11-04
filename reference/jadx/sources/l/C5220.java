package l;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙ᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 7A22 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5220 extends C23120 {
    @Override // l.C23120
    /* JADX INFO: renamed from: ۙ */
    public final void mo9133(C14168 c14168, HashSet hashSet) {
        Iterator it = ((ConcurrentMapC17249) c14168.m34445()).values().iterator();
        while (it.hasNext()) {
            m52052(c14168, hashSet, (C17307) ((AbstractC12457) it.next()));
        }
        if (m35353()) {
            Iterator it2 = c14168.m34433().values().iterator();
            while (it2.hasNext()) {
                hashSet.add(new C2237("_services._dns-sd._udp.local.", EnumC6121.CLASS_IN, false, C3137.f10167, ((C7457) it2.next()).m20463()));
            }
            return;
        }
        EnumC20662 enumC20662 = EnumC20662.Domain;
        HashMap map = this.f48028;
        if (((String) map.get(enumC20662)).endsWith("in-addr.arpa") || ((String) map.get(enumC20662)).endsWith("ip6.arpa")) {
            String str = (String) C4681.unmodifiableMap(map).get(EnumC20662.Instance);
            if (str == null || str.length() <= 0) {
                return;
            }
            InetAddress inetAddress = c14168.m34408().f69055;
            if (str.equalsIgnoreCase(inetAddress != null ? inetAddress.getHostAddress() : "")) {
                if (((String) map.get(enumC20662)).endsWith("in-addr.arpa")) {
                    hashSet.add(c14168.m34408().m49146(EnumC24021.TYPE_A, C3137.f10167));
                }
                if (((String) map.get(enumC20662)).endsWith("ip6.arpa")) {
                    hashSet.add(c14168.m34408().m49146(EnumC24021.TYPE_AAAA, C3137.f10167));
                    return;
                }
                return;
            }
            return;
        }
        m35356();
    }
}
