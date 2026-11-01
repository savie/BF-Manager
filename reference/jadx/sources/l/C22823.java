package l;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.᩺ۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: QA30 */
/* JADX INFO: loaded from: classes.dex */
public final class C22823 extends AbstractC20187 implements InterfaceC12157, InterfaceC14274 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4314 f74254 = C13488.m32998(C22823.class.getName());

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final Random f74255 = new Random();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile InetAddress f74256;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f74258;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f74259;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f74260;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final Set f74261;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final List f74262;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f74263;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C2983 f74264;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public volatile MulticastSocket f74265;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f74267;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C13568 f74268;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C1841 f74269;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Thread f74270;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f74271;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f74273;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ExecutorService f74272 = Executors.newSingleThreadExecutor(new ThreadFactoryC21889());

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f74266 = new ReentrantLock();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f74257 = new Object();

    public C22823(InetAddress inetAddress) throws IOException {
        f74254.mo12135("JmDNS instance created");
        this.f74269 = new C1841(100);
        this.f74262 = C11445.m28558();
        this.f74259 = new ConcurrentMapC13783();
        this.f74261 = C0561.synchronizedSet(new HashSet());
        this.f74263 = new ConcurrentMapC13783();
        ConcurrentMapC13783 concurrentMapC13783 = new ConcurrentMapC13783(20);
        this.f74267 = concurrentMapC13783;
        this.f74260 = new ConcurrentMapC13783(20);
        C2983 c2983M8880 = C2983.m8880(inetAddress, this);
        this.f74264 = c2983M8880;
        this.f74273 = c2983M8880.f11191;
        m50524(c2983M8880);
        m50523(concurrentMapC13783.values());
        mo15986();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50523(Collection collection) {
        if (this.f74270 == null) {
            C12240 c12240 = new C12240(this);
            this.f74270 = c12240;
            c12240.start();
        }
        mo15977();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            try {
                m50555(new C0244((AbstractC11015) it.next()));
            } catch (Exception e) {
                f74254.mo12122("start() Registration exception ", (Throwable) e);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50524(C2983 c2983) throws IOException {
        if (this.f74256 == null) {
            if (c2983.f11192 instanceof Inet6Address) {
                this.f74256 = InetAddress.getByName(C17178.f54757);
            } else {
                this.f74256 = InetAddress.getByName(C17178.f54760);
            }
        }
        if (this.f74265 != null) {
            m50527();
        }
        int i = C17178.f54759;
        this.f74265 = new MulticastSocket(i);
        if (c2983 == null || c2983.f11194 == null) {
            f74254.mo12129(this.f74256, "Trying to joinGroup({})");
            this.f74265.joinGroup(this.f74256);
        } else {
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f74256, i);
            this.f74265.setNetworkInterface(c2983.f11194);
            f74254.mo12137("Trying to joinGroup({}, {})", inetSocketAddress, c2983.f11194);
            this.f74265.joinGroup(inetSocketAddress, c2983.f11194);
        }
        this.f74265.setTimeToLive(255);
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    private void m50527() {
        f74254.mo12135("closeMulticastSocket()");
        if (this.f74265 != null) {
            try {
                try {
                    this.f74265.leaveGroup(this.f74256);
                    while (true) {
                        Thread thread = this.f74270;
                        if (thread == null || !thread.isAlive()) {
                            break;
                        }
                        synchronized (this) {
                            try {
                                Thread thread2 = this.f74270;
                                if (thread2 != null && thread2.isAlive()) {
                                    f74254.mo12135("closeMulticastSocket(): waiting for jmDNS monitor");
                                    wait(1000L);
                                }
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                } catch (SocketException unused2) {
                }
                this.f74265.close();
                this.f74270 = null;
            } catch (Exception e) {
                f74254.mo12122("closeMulticastSocket() Close socket exception ", (Throwable) e);
            }
            this.f74265 = null;
        }
    }

    @Override // l.InterfaceC12157
    /* JADX INFO: renamed from: ۙ */
    public final void mo1648(AbstractC4955 abstractC4955) {
        this.f74264.mo1648(abstractC4955);
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final void m50530() {
        this.f74264.m8899();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50542(AbstractC4249 abstractC4249, EnumC3066 enumC3066) {
        this.f74264.m8888(abstractC4249, enumC3066);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50541(AbstractC4249 abstractC4249) {
        this.f74264.m8887(abstractC4249);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m50559(AbstractC4249 abstractC4249, EnumC3066 enumC3066) {
        return this.f74264.m8896(abstractC4249, enumC3066);
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50548() {
        return this.f74264.m8883();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m50550() {
        return this.f74264.m8882();
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50560() {
        return this.f74264.m8898();
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m50533() {
        return this.f74264.m8891();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C2983 c2983 = this.f74264;
        if (c2983.m8894()) {
            return;
        }
        InterfaceC4314 interfaceC4314 = f74254;
        interfaceC4314.mo12126(this, "Cancelling JmDNS: {}");
        if (c2983.m8889()) {
            interfaceC4314.mo12135("Canceling the timer");
            mo15982();
            m50534();
            m50528();
            interfaceC4314.mo12126(this, "Wait for JmDNS cancel: {}");
            c2983.m8897();
            interfaceC4314.mo12135("Canceling the state timer");
            mo15978();
            this.f74272.shutdown();
            m50527();
            C23446.m51665().m51666(this);
            interfaceC4314.mo12135("JmDNS closed.");
        }
        mo1648((AbstractC4955) null);
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50532() {
        return this.f74264.m8894();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50555(C0244 c0244) {
        C2983 c2983 = this.f74264;
        boolean zM8894 = c2983.m8894();
        InetAddress inetAddress = c2983.f11192;
        if (zM8894 || c2983.m8881()) {
            throw new IllegalStateException("This DNS is closed.");
        }
        C22823 c22823M1664 = c0244.m1664();
        ConcurrentMapC13783 concurrentMapC13783 = this.f74267;
        if (c22823M1664 != null) {
            if (c0244.m1664() != this) {
                throw new IllegalStateException("A service information can only be registered with a single instamce of JmDNS.");
            }
            if (concurrentMapC13783.get(c0244.mo1655()) != null) {
                throw new IllegalStateException("A service information can only be registered once.");
            }
        }
        c0244.m1649(this);
        m50558(c0244.m1661());
        c0244.m1638();
        c0244.m1666(c2983.f11191);
        c0244.m1643(inetAddress instanceof Inet4Address ? (Inet4Address) inetAddress : null);
        c0244.m1644(inetAddress instanceof Inet6Address ? (Inet6Address) inetAddress : null);
        m50526(c0244);
        while (concurrentMapC13783.putIfAbsent(c0244.mo1655(), c0244) != null) {
            m50526(c0244);
        }
        mo15977();
        f74254.mo12126(c0244, "registerService() JmDNS registered service as {}");
    }

    public final boolean isClosed() {
        return this.f74264.m8881();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1841 m50566() {
        return this.f74269;
    }

    public final String getName() {
        return this.f74273;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50557(C13568 c13568, InetAddress inetAddress, int i) {
        f74254.mo12121("{} handle query: {}", this.f74273, c13568);
        System.currentTimeMillis();
        Iterator it = c13568.m6976().iterator();
        boolean zMo19184 = false;
        while (it.hasNext()) {
            zMo19184 |= ((AbstractC19918) it.next()).mo19184(this);
        }
        ReentrantLock reentrantLock = this.f74266;
        reentrantLock.lock();
        try {
            C13568 c13569 = this.f74268;
            if (c13569 != null) {
                c13569.m33163(c13568);
            } else {
                C13568 c13568Clone = c13568.clone();
                if (c13568.m6984()) {
                    this.f74268 = c13568Clone;
                }
                mo15981(c13568Clone, inetAddress, i);
            }
            reentrantLock.unlock();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it2 = c13568.f8131.iterator();
            while (it2.hasNext()) {
                m50545((AbstractC19918) it2.next(), jCurrentTimeMillis);
            }
            if (zMo19184) {
                mo15977();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2983 m50562() {
        return this.f74264;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InetAddress m50565() {
        return this.f74264.f11192;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0244 m50535(String str, String str2, String str3) {
        m50564();
        String lowerCase = str.toLowerCase();
        m50558(str);
        C12945 c12945 = new C12945(str);
        ConcurrentMapC13783 concurrentMapC13783 = this.f74263;
        if (concurrentMapC13783.putIfAbsent(lowerCase, c12945) == null) {
            m50522(lowerCase, (InterfaceC23715) concurrentMapC13783.get(lowerCase), true);
        }
        C0244 c0244M50536 = m50536(str, str2, str3, true);
        mo15980(c0244M50536);
        return c0244M50536;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0244 m50536(String str, String str2, String str3, boolean z) {
        byte[] bArr;
        String strMo1657;
        HashMap mapM38742 = C16473.m38742(str);
        mapM38742.put(EnumC6075.Instance, str2);
        mapM38742.put(EnumC6075.Subtype, str3);
        C0244 c0244 = new C0244(C0244.m1634(mapM38742), 0, 0, 0, z, null);
        EnumC23529 enumC23529 = EnumC23529.CLASS_ANY;
        C7217 c7217 = new C7217(str, enumC23529, false, 0, c0244.mo1670());
        C1841 c1841 = this.f74269;
        AbstractC9604 abstractC9604M5995 = c1841.m5995(c7217);
        if (abstractC9604M5995 instanceof AbstractC19918) {
            C0244 c0244Mo19176 = ((AbstractC19918) abstractC9604M5995).mo19176(z);
            HashMap mapM1654 = c0244Mo19176.m1654();
            AbstractC9604 abstractC9604M5990 = c1841.m5990(c0244.mo1670(), EnumC14357.TYPE_SRV, enumC23529);
            if (abstractC9604M5990 instanceof AbstractC19918) {
                C0244 c0244Mo19177 = ((AbstractC19918) abstractC9604M5990).mo19176(z);
                C0244 c0245 = new C0244(mapM1654, c0244Mo19177.mo1676(), c0244Mo19177.mo1656(), c0244Mo19177.mo1669(), z, null);
                byte[] bArrMo1658 = c0244Mo19177.mo1658();
                strMo1657 = c0244Mo19177.mo1657();
                bArr = bArrMo1658;
                c0244Mo19176 = c0245;
            } else {
                bArr = null;
                strMo1657 = "";
            }
            Iterator it = c1841.m5994(strMo1657, EnumC14357.TYPE_A, enumC23529).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC9604 abstractC9604 = (AbstractC9604) it.next();
                if (abstractC9604 instanceof AbstractC19918) {
                    C0244 c0244Mo19178 = ((AbstractC19918) abstractC9604).mo19176(z);
                    for (Inet4Address inet4Address : c0244Mo19178.mo1653()) {
                        c0244Mo19176.m1643(inet4Address);
                    }
                    c0244Mo19176.m1650(c0244Mo19178.mo1658());
                }
            }
            for (AbstractC9604 abstractC9605 : c1841.m5994(strMo1657, EnumC14357.TYPE_AAAA, EnumC23529.CLASS_ANY)) {
                if (abstractC9605 instanceof AbstractC19918) {
                    C0244 c0244Mo19179 = ((AbstractC19918) abstractC9605).mo19176(z);
                    for (Inet6Address inet6Address : c0244Mo19179.mo1665()) {
                        c0244Mo19176.m1644(inet6Address);
                    }
                    c0244Mo19176.m1650(c0244Mo19179.mo1658());
                }
            }
            AbstractC9604 abstractC9604M5991 = c1841.m5990(c0244Mo19176.mo1670(), EnumC14357.TYPE_TXT, EnumC23529.CLASS_ANY);
            if (abstractC9604M5991 instanceof AbstractC19918) {
                c0244Mo19176.m1650(((AbstractC19918) abstractC9604M5991).mo19176(z).mo1658());
            }
            if (c0244Mo19176.mo1658().length == 0) {
                c0244Mo19176.m1650(bArr);
            }
            if (c0244Mo19176.mo1673()) {
                return c0244Mo19176;
            }
        }
        return c0244;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50546(C20706 c20706) {
        ArrayList arrayList;
        List list = (List) this.f74259.get(c20706.mo40397().toLowerCase());
        if (list == null || list.isEmpty() || c20706.mo40399() == null || !c20706.mo40399().mo1673()) {
            return;
        }
        synchronized (list) {
            arrayList = new ArrayList(list);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f74272.submit(new RunnableC4477((C15062) it.next(), c20706));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50539(String str, InterfaceC23715 interfaceC23715) {
        m50522(str, interfaceC23715, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50522(String str, InterfaceC23715 interfaceC23715, boolean z) {
        C15062 c15062 = new C15062(interfaceC23715, z);
        String lowerCase = str.toLowerCase();
        List list = (List) this.f74259.get(lowerCase);
        if (list == null) {
            if (this.f74259.putIfAbsent(lowerCase, new LinkedList()) == null && this.f74263.putIfAbsent(lowerCase, new C12945(str)) == null) {
                m50522(lowerCase, (InterfaceC23715) this.f74263.get(lowerCase), true);
            }
            list = (List) this.f74259.get(lowerCase);
        }
        if (list != null) {
            synchronized (list) {
                if (!list.contains(c15062)) {
                    list.add(c15062);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        C1841 c1841 = this.f74269;
        c1841.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (List list2 : c1841.values()) {
            if (list2 != null) {
                arrayList2.addAll(list2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            AbstractC19918 abstractC19918 = (AbstractC19918) ((AbstractC9604) it.next());
            if (abstractC19918.m24467() == EnumC14357.TYPE_SRV && abstractC19918.m24470().endsWith(lowerCase)) {
                arrayList.add(new C20706(this, abstractC19918.m24479(), m50521(abstractC19918.m24479(), abstractC19918.m24477()), abstractC19918.mo19176(false)));
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c15062.m36094((AbstractC17364) it2.next());
        }
        mo15979(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50554(String str, InterfaceC23715 interfaceC23715) {
        String lowerCase = str.toLowerCase();
        List list = (List) this.f74259.get(lowerCase);
        if (list != null) {
            synchronized (list) {
                list.remove(new C15062(interfaceC23715, false));
                if (list.isEmpty()) {
                    this.f74259.remove(lowerCase, list);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final void m50534() {
        InterfaceC4314 interfaceC4314 = f74254;
        interfaceC4314.mo12135("unregisterAllServices()");
        ConcurrentMapC13783 concurrentMapC13783 = this.f74267;
        for (AbstractC11015 abstractC11015 : concurrentMapC13783.values()) {
            if (abstractC11015 != null) {
                interfaceC4314.mo12126(abstractC11015, "Cancelling service info: {}");
                ((C0244) abstractC11015).m1636();
            }
        }
        mo15983();
        for (Map.Entry entry : concurrentMapC13783.entrySet()) {
            AbstractC11015 abstractC11016 = (AbstractC11015) entry.getValue();
            if (abstractC11016 != null) {
                String str = (String) entry.getKey();
                interfaceC4314.mo12126(abstractC11016, "Wait for service info cancel: {}");
                ((C0244) abstractC11016).m1663();
                concurrentMapC13783.remove(str, abstractC11016);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m50558(String str) {
        boolean z;
        C6594 c6594;
        HashMap mapM38742 = C16473.m38742(str);
        String str2 = (String) mapM38742.get(EnumC6075.Domain);
        String str3 = (String) mapM38742.get(EnumC6075.Protocol);
        String str4 = (String) mapM38742.get(EnumC6075.Application);
        String str5 = (String) mapM38742.get(EnumC6075.Subtype);
        StringBuilder sb = new StringBuilder();
        sb.append(str4.length() > 0 ? C16523.m38890("_", str4, ".") : "");
        String strM5622 = C1694.m5622(sb, str3.length() > 0 ? C16523.m38890("_", str3, ".") : "", str2, ".");
        String lowerCase = strM5622.toLowerCase();
        boolean z2 = true;
        f74254.mo12139("{} registering service type: {} as: {}{}{}", this.f74273, str, strM5622, str5.length() > 0 ? " subtype: " : "", str5.length() > 0 ? str5 : "");
        if (this.f74260.containsKey(lowerCase) || str4.toLowerCase().equals("dns-sd") || str2.toLowerCase().endsWith("in-addr.arpa") || str2.toLowerCase().endsWith("ip6.arpa")) {
            z = false;
        } else {
            z = this.f74260.putIfAbsent(lowerCase, new C6594(strM5622)) == null;
            if (z) {
                Set set = this.f74261;
                C21411[] c21411Arr = (C21411[]) set.toArray(new C21411[set.size()]);
                C20706 c20706 = new C20706(this, strM5622, "", null);
                for (C21411 c21411 : c21411Arr) {
                    this.f74272.submit(new RunnableC13651(c21411, c20706));
                }
            }
        }
        if (str5.length() <= 0 || (c6594 = (C6594) this.f74260.get(lowerCase)) == null || c6594.containsKey(str5.toLowerCase())) {
            return z;
        }
        synchronized (c6594) {
            if (c6594.containsKey(str5.toLowerCase())) {
                z2 = z;
            } else {
                c6594.m17902(str5);
                Set set2 = this.f74261;
                C21411[] c21411Arr2 = (C21411[]) set2.toArray(new C21411[set2.size()]);
                C20706 c20707 = new C20706(this, "_" + str5 + "._sub." + strM5622, "", null);
                for (C21411 c21412 : c21411Arr2) {
                    this.f74272.submit(new RunnableC11534(c21412, c20707));
                }
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m50526(C0244 c0244) {
        boolean z;
        boolean z2;
        C2983 c2983;
        String strMo1655 = c0244.mo1655();
        long jCurrentTimeMillis = System.currentTimeMillis();
        do {
            Iterator it = this.f74269.m5989(c0244.mo1655()).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                z = false;
                z2 = true;
                c2983 = this.f74264;
                if (!zHasNext) {
                    break;
                }
                AbstractC9604 abstractC9604 = (AbstractC9604) it.next();
                if (EnumC14357.TYPE_SRV.equals(abstractC9604.m24467()) && !abstractC9604.mo24471(jCurrentTimeMillis)) {
                    C20623 c20623 = (C20623) abstractC9604;
                    if (c20623.m46481() != c0244.mo1676() || !c20623.m46482().equals(c2983.f11191)) {
                        f74254.mo12139("makeServiceNameUnique() JmDNS.makeServiceNameUnique srv collision:{} s.server={} {} equals:{}", abstractC9604, c20623.m46482(), c2983.f11191, Boolean.valueOf(c20623.m46482().equals(c2983.f11191)));
                        c0244.m1642(((C8712) C8006.m21103()).m22545(c0244.getName(), EnumC19295.SERVICE));
                        z = true;
                        break;
                    }
                }
            }
            AbstractC11015 abstractC11015 = (AbstractC11015) this.f74267.get(c0244.mo1655());
            if (abstractC11015 == null || abstractC11015 == c0244) {
                z2 = z;
            } else {
                InterfaceC10123 interfaceC10123M21103 = C8006.m21103();
                InetAddress inetAddress = c2983.f11192;
                c0244.m1642(((C8712) interfaceC10123M21103).m22545(c0244.getName(), EnumC19295.SERVICE));
            }
        } while (z2);
        strMo1655.equals(c0244.mo1655());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50540(C0244 c0244, C18506 c18506) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f74262.add(c0244);
        String lowerCase = c18506.m24477().toLowerCase();
        C1841 c1841 = this.f74269;
        for (AbstractC9604 abstractC9604 : c1841.m5989(lowerCase)) {
            if (abstractC9604 != null && abstractC9604.m24475() == c18506.m24475() && c18506.mo24478(abstractC9604) && c18506.m24477().equals(abstractC9604.m24477()) && !abstractC9604.mo24471(jCurrentTimeMillis)) {
                c0244.mo1645(c1841, jCurrentTimeMillis, abstractC9604);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50543(InterfaceC11451 interfaceC11451) {
        this.f74262.remove(interfaceC11451);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50538(long j, AbstractC19918 abstractC19918, EnumC0949 enumC0949) {
        ArrayList arrayList;
        List<C15062> arrayList2;
        C20706 c20706Mo19177 = abstractC19918.mo19177(this);
        if (enumC0949 == EnumC0949.Remove && EnumC14357.TYPE_SRV.equals(abstractC19918.m24467())) {
            Cloneable cloneableMo40399 = c20706Mo19177.mo40399();
            if (cloneableMo40399 instanceof InterfaceC11451) {
                m50543((InterfaceC11451) cloneableMo40399);
            }
        }
        synchronized (this.f74262) {
            arrayList = new ArrayList(this.f74262);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC11451) it.next()).mo1645(this.f74269, j, abstractC19918);
        }
        if (EnumC14357.TYPE_PTR.equals(abstractC19918.m24467()) || (EnumC14357.TYPE_SRV.equals(abstractC19918.m24467()) && EnumC0949.Remove.equals(enumC0949))) {
            if (c20706Mo19177.mo40399() == null || !c20706Mo19177.mo40399().mo1673()) {
                C0244 c0244M50536 = m50536(c20706Mo19177.mo40397(), c20706Mo19177.getName(), "", false);
                if (c0244M50536.mo1673()) {
                    c20706Mo19177 = new C20706(this, c20706Mo19177.mo40397(), c20706Mo19177.getName(), c0244M50536);
                }
            }
            List list = (List) this.f74259.get(c20706Mo19177.mo40397().toLowerCase());
            if (list != null) {
                synchronized (list) {
                    arrayList2 = new ArrayList(list);
                }
            } else {
                arrayList2 = Collections.EMPTY_LIST;
            }
            f74254.mo12140(this.f74273, c20706Mo19177, arrayList2, enumC0949);
            if (arrayList2.isEmpty()) {
                return;
            }
            int iOrdinal = enumC0949.ordinal();
            if (iOrdinal == 0) {
                for (C15062 c15062 : arrayList2) {
                    if (c15062.m41506()) {
                        c15062.m36096(c20706Mo19177);
                    } else {
                        this.f74272.submit(new RunnableC5183(c15062, c20706Mo19177));
                    }
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            for (C15062 c15063 : arrayList2) {
                if (c15063.m41506()) {
                    c15063.m36094((AbstractC17364) c20706Mo19177);
                } else {
                    this.f74272.submit(new RunnableC2360(c15063, c20706Mo19177));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50545(AbstractC19918 abstractC19918, long j) {
        EnumC0949 enumC0949 = EnumC0949.Noop;
        boolean zMo24471 = abstractC19918.mo24471(j);
        InterfaceC4314 interfaceC4314 = f74254;
        interfaceC4314.mo12121("{} handle response: {}", this.f74273, abstractC19918);
        if (!abstractC19918.m24476() && !abstractC19918.m24466()) {
            boolean zM24468 = abstractC19918.m24468();
            AbstractC19918 abstractC19919 = (AbstractC19918) this.f74269.m5995(abstractC19918);
            interfaceC4314.mo12121("{} handle response cached record: {}", this.f74273, abstractC19919);
            if (zM24468) {
                for (AbstractC9604 abstractC9604 : this.f74269.m5989(abstractC19918.m24470())) {
                    if (abstractC19918.m24467().equals(abstractC9604.m24467()) && abstractC19918.m24475().equals(abstractC9604.m24475())) {
                        AbstractC19918 abstractC199110 = (AbstractC19918) abstractC9604;
                        if (abstractC199110.m45211() < j - 1000) {
                            f74254.mo12129(abstractC9604, "setWillExpireSoon() on: {}");
                            abstractC199110.m45201(j);
                        }
                    }
                }
            }
            if (abstractC19919 != null) {
                if (zMo24471) {
                    if (abstractC19918.m45210() == 0) {
                        enumC0949 = EnumC0949.Noop;
                        f74254.mo12129(abstractC19919, "Record is expired - setWillExpireSoon() on:\n\t{}");
                        abstractC19919.m45201(j);
                    } else {
                        enumC0949 = EnumC0949.Remove;
                        f74254.mo12129(abstractC19919, "Record is expired - removeDNSEntry() on:\n\t{}");
                        this.f74269.m5993(abstractC19919);
                    }
                } else if (abstractC19918.mo19182(abstractC19919) && (abstractC19918.m24473().equals(abstractC19919.m24473()) || abstractC19918.m24473().length() <= 0)) {
                    abstractC19919.m45206(abstractC19918);
                    abstractC19918 = abstractC19919;
                } else if (abstractC19918.mo19185()) {
                    EnumC0949 enumC09410 = EnumC0949.Update;
                    f74254.mo12137("Record (singleValued) has changed - replaceDNSEntry() on:\n\t{}\n\t{}", abstractC19918, abstractC19919);
                    C1841 c1841 = this.f74269;
                    c1841.getClass();
                    if (abstractC19918.m24470().equals(abstractC19919.m24470())) {
                        List list = (List) c1841.get(abstractC19918.m24470());
                        if (list == null) {
                            c1841.putIfAbsent(abstractC19918.m24470(), new ArrayList());
                            list = (List) c1841.get(abstractC19918.m24470());
                        }
                        synchronized (list) {
                            list.remove(abstractC19919);
                            list.add(abstractC19918);
                        }
                    }
                    enumC0949 = enumC09410;
                } else {
                    enumC0949 = EnumC0949.Add;
                    f74254.mo12129(abstractC19918, "Record (multiValue) has changed - addDNSEntry on:\n\t{}");
                    this.f74269.m5992(abstractC19918);
                }
            } else if (!zMo24471) {
                enumC0949 = EnumC0949.Add;
                f74254.mo12129(abstractC19918, "Record not cached - addDNSEntry on:\n\t{}");
                this.f74269.m5992(abstractC19918);
            }
        }
        if (abstractC19918.m24467() == EnumC14357.TYPE_PTR) {
            if (abstractC19918.m24476()) {
                if (zMo24471) {
                    return;
                }
                m50558(((C7217) abstractC19918).m19181());
                return;
            } else if (m50558(abstractC19918.m24477()) && enumC0949 == EnumC0949.Noop) {
                enumC0949 = EnumC0949.RegisterServiceType;
            }
        }
        if (enumC0949 != EnumC0949.Noop) {
            m50538(j, abstractC19918, enumC0949);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50544(C13568 c13568) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList<AbstractC19918> arrayListM6976 = c13568.m6976();
        ArrayList<AbstractC19918> arrayList = new ArrayList(arrayListM6976.size());
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC19918 abstractC19918 : arrayListM6976) {
            if (abstractC19918.m24467().equals(EnumC14357.TYPE_A) || abstractC19918.m24467().equals(EnumC14357.TYPE_AAAA)) {
                arrayList2.add(abstractC19918);
            } else {
                arrayList.add(abstractC19918);
            }
        }
        arrayList.addAll(arrayList2);
        boolean zMo19183 = false;
        boolean zMo19184 = false;
        for (AbstractC19918 abstractC19919 : arrayList) {
            m50545(abstractC19919, jCurrentTimeMillis);
            if (EnumC14357.TYPE_A.equals(abstractC19919.m24467()) || EnumC14357.TYPE_AAAA.equals(abstractC19919.m24467())) {
                zMo19183 |= abstractC19919.mo19183(this);
            } else {
                zMo19184 |= abstractC19919.mo19183(this);
            }
        }
        if (zMo19183 || zMo19184) {
            mo15977();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50547(C22034 c22034) throws IOException {
        InetAddress address;
        int port;
        if (c22034.m6981()) {
            return;
        }
        if (c22034.m48945() != null) {
            address = c22034.m48945().getAddress();
            port = c22034.m48945().getPort();
        } else {
            address = this.f74256;
            port = C17178.f54759;
        }
        byte[] bArrM48947 = c22034.m48947();
        DatagramPacket datagramPacket = new DatagramPacket(bArrM48947, bArrM48947.length, address, port);
        InterfaceC4314 interfaceC4314 = f74254;
        if (interfaceC4314.mo12133()) {
            try {
                C13568 c13568 = new C13568(datagramPacket);
                if (interfaceC4314.mo12133()) {
                    interfaceC4314.mo12137("send({}) JmDNS out:{}", this.f74273, c13568.m33164());
                }
            } catch (IOException e) {
                f74254.mo12121(C22823.class.toString(), C22697.m50267(new StringBuilder(".send("), this.f74273, ") - JmDNS can not parse what it sends!!!"), e);
            }
        }
        MulticastSocket multicastSocket = this.f74265;
        if (multicastSocket == null || multicastSocket.isClosed()) {
            return;
        }
        multicastSocket.send(datagramPacket);
    }

    @Override // l.InterfaceC14274
    /* JADX INFO: renamed from: ֨ */
    public final void mo15976() {
        C23446.m51665().m51667(this).mo15976();
    }

    @Override // l.InterfaceC14274
    /* JADX INFO: renamed from: ᩴ */
    public final void mo15985() {
        C23446.m51665().m51667(this).mo15985();
    }

    @Override // l.InterfaceC14274
    /* JADX INFO: renamed from: ۨ */
    public final void mo15982() {
        C23446.m51665().m51667(this).mo15982();
    }

    @Override // l.InterfaceC14274
    /* JADX INFO: renamed from: ۙ */
    public final void mo15978() {
        C23446.m51665().m51667(this).mo15978();
    }

    @Override // l.InterfaceC14274
    /* JADX INFO: renamed from: ۖ */
    public final void mo15977() {
        C23446.m51665().m51667(this).mo15977();
    }

    @Override // l.InterfaceC14274
    /* JADX INFO: renamed from: ᩳ */
    public final void mo15984() {
        C23446.m51665().m51667(this).mo15984();
    }

    @Override // l.InterfaceC14274
    /* JADX INFO: renamed from: ᩹ */
    public final void mo15987() {
        C23446.m51665().m51667(this).mo15987();
    }

    @Override // l.InterfaceC14274
    /* JADX INFO: renamed from: ۬ */
    public final void mo15983() {
        C23446.m51665().m51667(this).mo15983();
    }

    @Override // l.InterfaceC14274
    /* JADX INFO: renamed from: ᩸ */
    public final void mo15986() {
        C23446.m51665().m51667(this).mo15986();
    }

    @Override // l.InterfaceC14274
    /* JADX INFO: renamed from: ۙ */
    public final void mo15980(C0244 c0244) {
        C23446.m51665().m51667(this).mo15980(c0244);
    }

    @Override // l.InterfaceC14274
    /* JADX INFO: renamed from: ۙ */
    public final void mo15979(String str) {
        C23446.m51665().m51667(this).mo15979(str);
    }

    @Override // l.InterfaceC14274
    /* JADX INFO: renamed from: ۙ */
    public final void mo15981(C13568 c13568, InetAddress inetAddress, int i) {
        C23446.m51665().m51667(this).mo15981(c13568, inetAddress, i);
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final void m50567() {
        InterfaceC4314 interfaceC4314 = f74254;
        interfaceC4314.mo12126(this.f74273, "{}.recover()");
        if (this.f74264.m8894() || this.f74264.m8881() || this.f74264.m8898() || this.f74264.m8891()) {
            return;
        }
        synchronized (this.f74257) {
            if (this.f74264.m8889()) {
                String str = this.f74273 + ".recover()";
                interfaceC4314.mo12121("{} thread {}", str, Thread.currentThread().getName());
                new C22117(this, str).start();
            }
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m50549() {
        InterfaceC4314 interfaceC4314 = f74254;
        String str = this.f74273;
        interfaceC4314.mo12126(str, "{}.recover() Cleanning up");
        interfaceC4314.mo12116("RECOVERING");
        mo15976();
        ArrayList arrayList = new ArrayList(this.f74267.values());
        m50534();
        m50528();
        C2983 c2983 = this.f74264;
        c2983.m8897();
        mo15985();
        m50527();
        this.f74269.clear();
        interfaceC4314.mo12126(str, "{}.recover() All is clean");
        if (c2983.m8891()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C0244) ((AbstractC11015) it.next())).m1638();
            }
            c2983.m8892();
            try {
                m50524(c2983);
                m50523(arrayList);
            } catch (Exception e) {
                interfaceC4314.mo12122(str + ".recover() Start services exception ", (Throwable) e);
            }
            interfaceC4314.mo12115(str, "{}.recover() We are back!");
            return;
        }
        interfaceC4314.mo12115(str, "{}.recover() Could not recover we are Down!");
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m50564() {
        InterfaceC4314 interfaceC4314 = f74254;
        C1841 c1841 = this.f74269;
        c1841.m5991();
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet();
        ArrayList<AbstractC9604> arrayList = new ArrayList();
        for (List list : c1841.values()) {
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        for (AbstractC9604 abstractC9604 : arrayList) {
            try {
                AbstractC19918 abstractC19918 = (AbstractC19918) abstractC9604;
                if (abstractC19918.mo24471(jCurrentTimeMillis)) {
                    m50538(jCurrentTimeMillis, abstractC19918, EnumC0949.Remove);
                    interfaceC4314.mo12129(abstractC9604, "Removing DNSEntry from cache: {}");
                    c1841.m5993(abstractC19918);
                } else if (abstractC19918.m45205(jCurrentTimeMillis)) {
                    abstractC19918.m45209();
                    String lowerCase = abstractC19918.mo19176(false).mo1660().toLowerCase();
                    if (hashSet.add(lowerCase) && this.f74263.containsKey(lowerCase.toLowerCase())) {
                        mo15979(lowerCase);
                    }
                }
            } catch (Exception e) {
                interfaceC4314.mo12122(this.f74273 + ".Error while reaping records: " + abstractC9604, (Throwable) e);
                interfaceC4314.mo12116(toString());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.AbstractMap, l.ۜۜ۠] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.String] */
    public final String toString() {
        StringBuilder sbM40152 = C17214.m40152(2048, "\n\t---- Local Host -----\n\t");
        sbM40152.append(this.f74264);
        sbM40152.append("\n\t---- Services -----");
        for (Map.Entry entry : this.f74267.entrySet()) {
            sbM40152.append("\n\t\tService: ");
            sbM40152.append((String) entry.getKey());
            sbM40152.append(": ");
            sbM40152.append(entry.getValue());
        }
        sbM40152.append("\n\t---- Types ----");
        for (Object obj : this.f74260.values()) {
            sbM40152.append("\n\t\tType: ");
            sbM40152.append(obj.m17901());
            sbM40152.append(": ");
            if (obj.isEmpty()) {
                obj = "no subtypes";
            }
            sbM40152.append(obj);
        }
        sbM40152.append("\n");
        sbM40152.append(this.f74269.toString());
        sbM40152.append("\n\t---- Service Collectors ----");
        for (Map.Entry entry2 : this.f74263.entrySet()) {
            sbM40152.append("\n\t\tService Collector: ");
            sbM40152.append((String) entry2.getKey());
            sbM40152.append(": ");
            sbM40152.append(entry2.getValue());
        }
        sbM40152.append("\n\t---- Service Listeners ----");
        for (Map.Entry entry3 : this.f74259.entrySet()) {
            sbM40152.append("\n\t\tService Listener: ");
            sbM40152.append((String) entry3.getKey());
            sbM40152.append(": ");
            sbM40152.append(entry3.getValue());
        }
        return sbM40152.toString();
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    private void m50528() {
        f74254.mo12135("disposeServiceCollectors()");
        ConcurrentMapC13783 concurrentMapC13783 = this.f74263;
        for (Map.Entry entry : concurrentMapC13783.entrySet()) {
            C12945 c12945 = (C12945) entry.getValue();
            if (c12945 != null) {
                String str = (String) entry.getKey();
                m50554(str, c12945);
                concurrentMapC13783.remove(str, c12945);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m50521(String str, String str2) {
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        return (!lowerCase2.endsWith(lowerCase) || lowerCase2.equals(lowerCase)) ? str2 : str2.substring(0, (str2.length() - str.length()) - 1);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMap m50563() {
        return this.f74267;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50553(long j) {
        this.f74271 = j;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long m50529() {
        return this.f74271;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50537(int i) {
        this.f74258 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m50531() {
        return this.f74258;
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public static Random m50525() {
        return f74255;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50556(C13568 c13568) {
        ReentrantLock reentrantLock = this.f74266;
        reentrantLock.lock();
        try {
            if (this.f74268 == c13568) {
                this.f74268 = null;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 m50552() {
        return this.f74260;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final MulticastSocket m50551() {
        return this.f74265;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InetAddress m50561() {
        return this.f74256;
    }
}
