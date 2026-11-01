package l;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 7A22 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14979 extends C18506 {
    @Override // l.C18506
    /* JADX INFO: renamed from: ۙ */
    public final void mo10854(C22823 c22823, HashSet hashSet) {
        Iterator it = ((ConcurrentMapC13783) c22823.m50563()).values().iterator();
        while (it.hasNext()) {
            m42899(c22823, hashSet, (C0244) ((AbstractC11015) it.next()));
        }
        if (m24476()) {
            Iterator it2 = c22823.m50552().values().iterator();
            while (it2.hasNext()) {
                hashSet.add(new C7217("_services._dns-sd._udp.local.", EnumC23529.CLASS_IN, false, C17178.f54761, ((C6594) it2.next()).m17901()));
            }
            return;
        }
        EnumC6075 enumC6075 = EnumC6075.Domain;
        HashMap map = this.f32353;
        if (((String) map.get(enumC6075)).endsWith("in-addr.arpa") || ((String) map.get(enumC6075)).endsWith("ip6.arpa")) {
            String str = (String) C0561.unmodifiableMap(map).get(EnumC6075.Instance);
            if (str == null || str.length() <= 0) {
                return;
            }
            InetAddress inetAddress = c22823.m50562().f11192;
            if (str.equalsIgnoreCase(inetAddress != null ? inetAddress.getHostAddress() : "")) {
                if (((String) map.get(enumC6075)).endsWith("in-addr.arpa")) {
                    hashSet.add(c22823.m50562().m8885(EnumC14357.TYPE_A, C17178.f54761));
                }
                if (((String) map.get(enumC6075)).endsWith("ip6.arpa")) {
                    hashSet.add(c22823.m50562().m8885(EnumC14357.TYPE_AAAA, C17178.f54761));
                    return;
                }
                return;
            }
            return;
        }
        m24466();
    }
}
