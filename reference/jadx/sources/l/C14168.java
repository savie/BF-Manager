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

/* JADX INFO: renamed from: l.۬᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QA30 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14168 extends AbstractC16932 implements InterfaceC23866, InterfaceC24612 {

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC25186 f44796 = C16980.m40038(C14168.class.getName());

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final Random f44797 = new Random();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Thread f44798;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C21628 f44799;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C0525 f44800;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f44801;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f44802;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String f44805;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final List f44806;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public volatile MulticastSocket f44807;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f44808;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4254 f44809;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile InetAddress f44810;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f44811;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final Set f44812;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f44814;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f44815;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ExecutorService f44813 = Executors.newSingleThreadExecutor(new ThreadFactoryC22286());

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f44803 = new ReentrantLock();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Object f44804 = new Object();

    public C14168(InetAddress inetAddress) throws IOException {
        f44796.mo13721("JmDNS instance created");
        this.f44809 = new C4254(100);
        this.f44806 = C1402.m5127();
        this.f44808 = new ConcurrentMapC17249();
        this.f44812 = C4681.synchronizedSet(new HashSet());
        this.f44802 = new ConcurrentMapC17249();
        ConcurrentMapC17249 concurrentMapC17249 = new ConcurrentMapC17249(20);
        this.f44814 = concurrentMapC17249;
        this.f44801 = new ConcurrentMapC17249(20);
        C21628 c21628M49143 = C21628.m49143(inetAddress, this);
        this.f44799 = c21628M49143;
        this.f44805 = c21628M49143.f69056;
        m34404(c21628M49143);
        m34403(concurrentMapC17249.values());
        mo34443();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34403(Collection collection) {
        if (this.f44798 == null) {
            C23275 c23275 = new C23275(this);
            this.f44798 = c23275;
            c23275.start();
        }
        mo34435();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            try {
                m34454(new C17307((AbstractC12457) it.next()));
            } catch (Exception e) {
                f44796.mo13702("start() Registration exception ", (Throwable) e);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34404(C21628 c21628) throws IOException {
        if (this.f44810 == null) {
            if (c21628.f69055 instanceof Inet6Address) {
                this.f44810 = InetAddress.getByName(C3137.f10168);
            } else {
                this.f44810 = InetAddress.getByName(C3137.f10165);
            }
        }
        if (this.f44807 != null) {
            m34406();
        }
        int i = C3137.f10166;
        this.f44807 = new MulticastSocket(i);
        if (c21628 == null || c21628.f69057 == null) {
            f44796.mo13708(this.f44810, "Trying to joinGroup({})");
            this.f44807.joinGroup(this.f44810);
        } else {
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f44810, i);
            this.f44807.setNetworkInterface(c21628.f69057);
            f44796.mo13723("Trying to joinGroup({}, {})", inetSocketAddress, c21628.f69057);
            this.f44807.joinGroup(inetSocketAddress, c21628.f69057);
        }
        this.f44807.setTimeToLive(255);
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    private void m34406() {
        f44796.mo13721("closeMulticastSocket()");
        if (this.f44807 != null) {
            try {
                try {
                    this.f44807.leaveGroup(this.f44810);
                    while (true) {
                        Thread thread = this.f44798;
                        if (thread == null || !thread.isAlive()) {
                            break;
                        }
                        synchronized (this) {
                            try {
                                Thread thread2 = this.f44798;
                                if (thread2 != null && thread2.isAlive()) {
                                    f44796.mo13721("closeMulticastSocket(): waiting for jmDNS monitor");
                                    wait(1000L);
                                }
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                } catch (SocketException unused2) {
                }
                this.f44807.close();
                this.f44798 = null;
            } catch (Exception e) {
                f44796.mo13702("closeMulticastSocket() Close socket exception ", (Throwable) e);
            }
            this.f44807 = null;
        }
    }

    @Override // l.InterfaceC23866
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo34430(AbstractC18053 abstractC18053) {
        this.f44799.mo34430(abstractC18053);
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final void m34437() {
        this.f44799.m49162();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34425(AbstractC8357 abstractC8357, EnumC21037 enumC21037) {
        this.f44799.m49149(abstractC8357, enumC21037);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34424(AbstractC8357 abstractC8357) {
        this.f44799.m49148(abstractC8357);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m34456(AbstractC8357 abstractC8357, EnumC21037 enumC21037) {
        return this.f44799.m49160(abstractC8357, enumC21037);
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34446() {
        return this.f44799.m49144();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m34432() {
        return this.f44799.m49161();
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34457() {
        return this.f44799.m49156();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m34438() {
        return this.f44799.m49158();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C21628 c21628 = this.f44799;
        if (c21628.m49152()) {
            return;
        }
        InterfaceC25186 interfaceC25186 = f44796;
        interfaceC25186.mo13716(this, "Cancelling JmDNS: {}");
        if (c21628.m49150()) {
            interfaceC25186.mo13721("Canceling the timer");
            mo34449();
            m34410();
            m34407();
            interfaceC25186.mo13716(this, "Wait for JmDNS cancel: {}");
            c21628.m49157();
            interfaceC25186.mo13721("Canceling the state timer");
            mo34415();
            this.f44813.shutdown();
            m34406();
            C6712.m18748().m18749(this);
            interfaceC25186.mo13721("JmDNS closed.");
        }
        mo34430((AbstractC18053) null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34454(C17307 c17307) {
        C21628 c21628 = this.f44799;
        boolean zM49152 = c21628.m49152();
        InetAddress inetAddress = c21628.f69055;
        if (zM49152 || c21628.m49155()) {
            throw new IllegalStateException("This DNS is closed.");
        }
        C14168 c14168M40646 = c17307.m40646();
        ConcurrentMapC17249 concurrentMapC17249 = this.f44814;
        if (c14168M40646 != null) {
            if (c17307.m40646() != this) {
                throw new IllegalStateException("A service information can only be registered with a single instamce of JmDNS.");
            }
            if (concurrentMapC17249.get(c17307.mo30941()) != null) {
                throw new IllegalStateException("A service information can only be registered once.");
            }
        }
        c17307.m40642(this);
        m34455(c17307.m40634());
        c17307.m40650();
        c17307.m40652(c21628.f69056);
        c17307.m40638(inetAddress instanceof Inet4Address ? (Inet4Address) inetAddress : null);
        c17307.m40639(inetAddress instanceof Inet6Address ? (Inet6Address) inetAddress : null);
        m34405(c17307);
        while (concurrentMapC17249.putIfAbsent(c17307.mo30941(), c17307) != null) {
            m34405(c17307);
        }
        mo34435();
        f44796.mo13716(c17307, "registerService() JmDNS registered service as {}");
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m34458() {
        return this.f44799.m49152();
    }

    public final boolean isClosed() {
        return this.f44799.m49155();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C4254 m34412() {
        return this.f44809;
    }

    public final String getName() {
        return this.f44805;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34453(C0525 c0525, InetAddress inetAddress, int i) {
        f44796.mo13701("{} handle query: {}", this.f44805, c0525);
        System.currentTimeMillis();
        Iterator it = c0525.m44424().iterator();
        boolean zMo7639 = false;
        while (it.hasNext()) {
            zMo7639 |= ((AbstractC17152) it.next()).mo7639(this);
        }
        ReentrantLock reentrantLock = this.f44803;
        reentrantLock.lock();
        try {
            C0525 c0526 = this.f44800;
            if (c0526 != null) {
                c0526.m2492(c0525);
            } else {
                C0525 c0525Clone = c0525.clone();
                if (c0525.m44431()) {
                    this.f44800 = c0525Clone;
                }
                mo34421(c0525Clone, inetAddress, i);
            }
            reentrantLock.unlock();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it2 = c0525.f62027.iterator();
            while (it2.hasNext()) {
                m34427((AbstractC17152) it2.next(), jCurrentTimeMillis);
            }
            if (zMo7639) {
                mo34435();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C21628 m34408() {
        return this.f44799;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InetAddress m34448() {
        return this.f44799.f69055;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17307 m34413(String str, String str2, String str3) {
        m34447();
        String lowerCase = str.toLowerCase();
        m34455(str);
        C2982 c2982 = new C2982(str);
        ConcurrentMapC17249 concurrentMapC17249 = this.f44802;
        if (concurrentMapC17249.putIfAbsent(lowerCase, c2982) == null) {
            m34402(lowerCase, (InterfaceC6492) concurrentMapC17249.get(lowerCase), true);
        }
        C17307 c17307M34414 = m34414(str, str2, str3, true);
        mo34428(c17307M34414);
        return c17307M34414;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17307 m34414(String str, String str2, String str3, boolean z) {
        byte[] bArr;
        String strMo30934;
        HashMap mapM37743 = C15815.m37743(str);
        mapM37743.put(EnumC20662.Instance, str2);
        mapM37743.put(EnumC20662.Subtype, str3);
        C17307 c17307 = new C17307(C17307.m40632(mapM37743), 0, 0, 0, z, null);
        EnumC6121 enumC6121 = EnumC6121.CLASS_ANY;
        C2237 c2237 = new C2237(str, enumC6121, false, 0, c17307.mo30944());
        C4254 c4254 = this.f44809;
        AbstractC14694 abstractC14694M13582 = c4254.m13582(c2237);
        if (abstractC14694M13582 instanceof AbstractC17152) {
            C17307 c17307Mo7633 = ((AbstractC17152) abstractC14694M13582).mo7633(z);
            HashMap mapM40648 = c17307Mo7633.m40648();
            AbstractC14694 abstractC14694M13577 = c4254.m13577(c17307.mo30944(), EnumC24021.TYPE_SRV, enumC6121);
            if (abstractC14694M13577 instanceof AbstractC17152) {
                C17307 c17307Mo7634 = ((AbstractC17152) abstractC14694M13577).mo7633(z);
                C17307 c17308 = new C17307(mapM40648, c17307Mo7634.mo30952(), c17307Mo7634.mo30951(), c17307Mo7634.mo30945(), z, null);
                byte[] bArrMo30942 = c17307Mo7634.mo30942();
                strMo30934 = c17307Mo7634.mo30934();
                bArr = bArrMo30942;
                c17307Mo7633 = c17308;
            } else {
                bArr = null;
                strMo30934 = "";
            }
            Iterator it = c4254.m13581(strMo30934, EnumC24021.TYPE_A, enumC6121).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC14694 abstractC14694 = (AbstractC14694) it.next();
                if (abstractC14694 instanceof AbstractC17152) {
                    C17307 c17307Mo7635 = ((AbstractC17152) abstractC14694).mo7633(z);
                    for (Inet4Address inet4Address : c17307Mo7635.mo30947()) {
                        c17307Mo7633.m40638(inet4Address);
                    }
                    c17307Mo7633.m40643(c17307Mo7635.mo30942());
                }
            }
            for (AbstractC14694 abstractC14695 : c4254.m13581(strMo30934, EnumC24021.TYPE_AAAA, EnumC6121.CLASS_ANY)) {
                if (abstractC14695 instanceof AbstractC17152) {
                    C17307 c17307Mo7636 = ((AbstractC17152) abstractC14695).mo7633(z);
                    for (Inet6Address inet6Address : c17307Mo7636.mo30938()) {
                        c17307Mo7633.m40639(inet6Address);
                    }
                    c17307Mo7633.m40643(c17307Mo7636.mo30942());
                }
            }
            AbstractC14694 abstractC14694M13578 = c4254.m13577(c17307Mo7633.mo30944(), EnumC24021.TYPE_TXT, EnumC6121.CLASS_ANY);
            if (abstractC14694M13578 instanceof AbstractC17152) {
                c17307Mo7633.m40643(((AbstractC17152) abstractC14694M13578).mo7633(z).mo30942());
            }
            if (c17307Mo7633.mo30942().length == 0) {
                c17307Mo7633.m40643(bArr);
            }
            if (c17307Mo7633.mo30935()) {
                return c17307Mo7633;
            }
        }
        return c17307;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34426(C11340 c11340) {
        ArrayList arrayList;
        List list = (List) this.f44808.get(c11340.mo11501().toLowerCase());
        if (list == null || list.isEmpty() || c11340.mo11502() == null || !c11340.mo11502().mo30935()) {
            return;
        }
        synchronized (list) {
            arrayList = new ArrayList(list);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f44813.submit(new RunnableC18644((C4629) it.next(), c11340));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34419(String str, InterfaceC6492 interfaceC6492) {
        m34402(str, interfaceC6492, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m34402(String str, InterfaceC6492 interfaceC6492, boolean z) {
        C4629 c4629 = new C4629(interfaceC6492, z);
        String lowerCase = str.toLowerCase();
        List list = (List) this.f44808.get(lowerCase);
        if (list == null) {
            if (this.f44808.putIfAbsent(lowerCase, new LinkedList()) == null && this.f44802.putIfAbsent(lowerCase, new C2982(str)) == null) {
                m34402(lowerCase, (InterfaceC6492) this.f44802.get(lowerCase), true);
            }
            list = (List) this.f44808.get(lowerCase);
        }
        if (list != null) {
            synchronized (list) {
                if (!list.contains(c4629)) {
                    list.add(c4629);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        C4254 c4254 = this.f44809;
        c4254.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (List list2 : c4254.values()) {
            if (list2 != null) {
                arrayList2.addAll(list2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            AbstractC17152 abstractC17152 = (AbstractC17152) ((AbstractC14694) it.next());
            if (abstractC17152.m35360() == EnumC24021.TYPE_SRV && abstractC17152.m35350().endsWith(lowerCase)) {
                arrayList.add(new C11340(this, abstractC17152.m35357(), m34401(abstractC17152.m35357(), abstractC17152.m35359()), abstractC17152.mo7633(false)));
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c4629.m14443((AbstractC3508) it2.next());
        }
        mo34418(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34451(String str, InterfaceC6492 interfaceC6492) {
        String lowerCase = str.toLowerCase();
        List list = (List) this.f44808.get(lowerCase);
        if (list != null) {
            synchronized (list) {
                list.remove(new C4629(interfaceC6492, false));
                if (list.isEmpty()) {
                    this.f44808.remove(lowerCase, list);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final void m34410() {
        InterfaceC25186 interfaceC25186 = f44796;
        interfaceC25186.mo13721("unregisterAllServices()");
        ConcurrentMapC17249 concurrentMapC17249 = this.f44814;
        for (AbstractC12457 abstractC12457 : concurrentMapC17249.values()) {
            if (abstractC12457 != null) {
                interfaceC25186.mo13716(abstractC12457, "Cancelling service info: {}");
                ((C17307) abstractC12457).m40651();
            }
        }
        mo34431();
        for (Map.Entry entry : concurrentMapC17249.entrySet()) {
            AbstractC12457 abstractC12458 = (AbstractC12457) entry.getValue();
            if (abstractC12458 != null) {
                String str = (String) entry.getKey();
                interfaceC25186.mo13716(abstractC12458, "Wait for service info cancel: {}");
                ((C17307) abstractC12458).m40649();
                concurrentMapC17249.remove(str, abstractC12458);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m34455(String str) {
        boolean z;
        C7457 c7457;
        HashMap mapM37743 = C15815.m37743(str);
        String str2 = (String) mapM37743.get(EnumC20662.Domain);
        String str3 = (String) mapM37743.get(EnumC20662.Protocol);
        String str4 = (String) mapM37743.get(EnumC20662.Application);
        String str5 = (String) mapM37743.get(EnumC20662.Subtype);
        StringBuilder sb = new StringBuilder();
        sb.append(str4.length() > 0 ? C14442.m34865("_", str4, ".") : "");
        String strM31438 = C12669.m31438(sb, str3.length() > 0 ? C14442.m34865("_", str3, ".") : "", str2, ".");
        String lowerCase = strM31438.toLowerCase();
        boolean z2 = true;
        f44796.mo13725("{} registering service type: {} as: {}{}{}", this.f44805, str, strM31438, str5.length() > 0 ? " subtype: " : "", str5.length() > 0 ? str5 : "");
        if (this.f44801.containsKey(lowerCase) || str4.toLowerCase().equals("dns-sd") || str2.toLowerCase().endsWith("in-addr.arpa") || str2.toLowerCase().endsWith("ip6.arpa")) {
            z = false;
        } else {
            z = this.f44801.putIfAbsent(lowerCase, new C7457(strM31438)) == null;
            if (z) {
                Set set = this.f44812;
                C21783[] c21783Arr = (C21783[]) set.toArray(new C21783[set.size()]);
                C11340 c11340 = new C11340(this, strM31438, "", null);
                for (C21783 c21783 : c21783Arr) {
                    this.f44813.submit(new RunnableC0745(c21783, c11340));
                }
            }
        }
        if (str5.length() <= 0 || (c7457 = (C7457) this.f44801.get(lowerCase)) == null || c7457.containsKey(str5.toLowerCase())) {
            return z;
        }
        synchronized (c7457) {
            if (c7457.containsKey(str5.toLowerCase())) {
                z2 = z;
            } else {
                c7457.m20464(str5);
                Set set2 = this.f44812;
                C21783[] c21783Arr2 = (C21783[]) set2.toArray(new C21783[set2.size()]);
                C11340 c11341 = new C11340(this, "_" + str5 + "._sub." + strM31438, "", null);
                for (C21783 c21784 : c21783Arr2) {
                    this.f44813.submit(new RunnableC8203(c21784, c11341));
                }
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m34405(C17307 c17307) {
        boolean z;
        boolean z2;
        C21628 c21628;
        String strMo30941 = c17307.mo30941();
        long jCurrentTimeMillis = System.currentTimeMillis();
        do {
            Iterator it = this.f44809.m13576(c17307.mo30941()).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                z = false;
                z2 = true;
                c21628 = this.f44799;
                if (!zHasNext) {
                    break;
                }
                AbstractC14694 abstractC14694 = (AbstractC14694) it.next();
                if (EnumC24021.TYPE_SRV.equals(abstractC14694.m35360()) && !abstractC14694.mo35351(jCurrentTimeMillis)) {
                    C11931 c11931 = (C11931) abstractC14694;
                    if (c11931.m29888() != c17307.mo30952() || !c11931.m29891().equals(c21628.f69056)) {
                        f44796.mo13725("makeServiceNameUnique() JmDNS.makeServiceNameUnique srv collision:{} s.server={} {} equals:{}", abstractC14694, c11931.m29891(), c21628.f69056, Boolean.valueOf(c11931.m29891().equals(c21628.f69056)));
                        c17307.m40637(((C12832) C19545.m45079()).m31861(c17307.getName(), EnumC15069.SERVICE));
                        z = true;
                        break;
                    }
                }
            }
            AbstractC12457 abstractC12457 = (AbstractC12457) this.f44814.get(c17307.mo30941());
            if (abstractC12457 == null || abstractC12457 == c17307) {
                z2 = z;
            } else {
                InterfaceC5375 interfaceC5375M45079 = C19545.m45079();
                InetAddress inetAddress = c21628.f69055;
                c17307.m40637(((C12832) interfaceC5375M45079).m31861(c17307.getName(), EnumC15069.SERVICE));
            }
        } while (z2);
        strMo30941.equals(c17307.mo30941());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34429(C17307 c17307, C23120 c23120) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f44806.add(c17307);
        String lowerCase = c23120.m35359().toLowerCase();
        C4254 c4254 = this.f44809;
        for (AbstractC14694 abstractC14694 : c4254.m13576(lowerCase)) {
            if (abstractC14694 != null && abstractC14694.m35354() == c23120.m35354() && c23120.mo9135(abstractC14694) && c23120.m35359().equals(abstractC14694.m35359()) && !abstractC14694.mo35351(jCurrentTimeMillis)) {
                c17307.mo21766(c4254, jCurrentTimeMillis, abstractC14694);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34423(InterfaceC7983 interfaceC7983) {
        this.f44806.remove(interfaceC7983);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34417(long j, AbstractC17152 abstractC17152, EnumC9693 enumC9693) {
        ArrayList arrayList;
        List<C4629> arrayList2;
        C11340 c11340Mo7632 = abstractC17152.mo7632(this);
        if (enumC9693 == EnumC9693.Remove && EnumC24021.TYPE_SRV.equals(abstractC17152.m35360())) {
            Cloneable cloneableMo11502 = c11340Mo7632.mo11502();
            if (cloneableMo11502 instanceof InterfaceC7983) {
                m34423((InterfaceC7983) cloneableMo11502);
            }
        }
        synchronized (this.f44806) {
            arrayList = new ArrayList(this.f44806);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC7983) it.next()).mo21766(this.f44809, j, abstractC17152);
        }
        if (EnumC24021.TYPE_PTR.equals(abstractC17152.m35360()) || (EnumC24021.TYPE_SRV.equals(abstractC17152.m35360()) && EnumC9693.Remove.equals(enumC9693))) {
            if (c11340Mo7632.mo11502() == null || !c11340Mo7632.mo11502().mo30935()) {
                C17307 c17307M34414 = m34414(c11340Mo7632.mo11501(), c11340Mo7632.getName(), "", false);
                if (c17307M34414.mo30935()) {
                    c11340Mo7632 = new C11340(this, c11340Mo7632.mo11501(), c11340Mo7632.getName(), c17307M34414);
                }
            }
            List list = (List) this.f44808.get(c11340Mo7632.mo11501().toLowerCase());
            if (list != null) {
                synchronized (list) {
                    arrayList2 = new ArrayList(list);
                }
            } else {
                arrayList2 = Collections.EMPTY_LIST;
            }
            f44796.mo13706(this.f44805, c11340Mo7632, arrayList2, enumC9693);
            if (arrayList2.isEmpty()) {
                return;
            }
            int iOrdinal = enumC9693.ordinal();
            if (iOrdinal == 0) {
                for (C4629 c4629 : arrayList2) {
                    if (c4629.m27044()) {
                        c4629.m14445(c11340Mo7632);
                    } else {
                        this.f44813.submit(new RunnableC10439(c4629, c11340Mo7632));
                    }
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            for (C4629 c46210 : arrayList2) {
                if (c46210.m27044()) {
                    c46210.m14443((AbstractC3508) c11340Mo7632);
                } else {
                    this.f44813.submit(new RunnableC19390(c46210, c11340Mo7632));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34427(AbstractC17152 abstractC17152, long j) {
        EnumC9693 enumC9693 = EnumC9693.Noop;
        boolean zMo35351 = abstractC17152.mo35351(j);
        InterfaceC25186 interfaceC25186 = f44796;
        interfaceC25186.mo13701("{} handle response: {}", this.f44805, abstractC17152);
        if (!abstractC17152.m35353() && !abstractC17152.m35356()) {
            boolean zM35348 = abstractC17152.m35348();
            AbstractC17152 abstractC17153 = (AbstractC17152) this.f44809.m13582(abstractC17152);
            interfaceC25186.mo13701("{} handle response cached record: {}", this.f44805, abstractC17153);
            if (zM35348) {
                for (AbstractC14694 abstractC14694 : this.f44809.m13576(abstractC17152.m35350())) {
                    if (abstractC17152.m35360().equals(abstractC14694.m35360()) && abstractC17152.m35354().equals(abstractC14694.m35354())) {
                        AbstractC17152 abstractC17154 = (AbstractC17152) abstractC14694;
                        if (abstractC17154.m40305() < j - 1000) {
                            f44796.mo13708(abstractC14694, "setWillExpireSoon() on: {}");
                            abstractC17154.m40304(j);
                        }
                    }
                }
            }
            if (abstractC17153 != null) {
                if (zMo35351) {
                    if (abstractC17152.m40301() == 0) {
                        enumC9693 = EnumC9693.Noop;
                        f44796.mo13708(abstractC17153, "Record is expired - setWillExpireSoon() on:\n\t{}");
                        abstractC17153.m40304(j);
                    } else {
                        enumC9693 = EnumC9693.Remove;
                        f44796.mo13708(abstractC17153, "Record is expired - removeDNSEntry() on:\n\t{}");
                        this.f44809.m13580(abstractC17153);
                    }
                } else if (abstractC17152.mo7638(abstractC17153) && (abstractC17152.m35358().equals(abstractC17153.m35358()) || abstractC17152.m35358().length() <= 0)) {
                    abstractC17153.m40302(abstractC17152);
                    abstractC17152 = abstractC17153;
                } else if (abstractC17152.mo7640()) {
                    EnumC9693 enumC9694 = EnumC9693.Update;
                    f44796.mo13723("Record (singleValued) has changed - replaceDNSEntry() on:\n\t{}\n\t{}", abstractC17152, abstractC17153);
                    C4254 c4254 = this.f44809;
                    c4254.getClass();
                    if (abstractC17152.m35350().equals(abstractC17153.m35350())) {
                        List list = (List) c4254.get(abstractC17152.m35350());
                        if (list == null) {
                            c4254.putIfAbsent(abstractC17152.m35350(), new ArrayList());
                            list = (List) c4254.get(abstractC17152.m35350());
                        }
                        synchronized (list) {
                            list.remove(abstractC17153);
                            list.add(abstractC17152);
                        }
                    }
                    enumC9693 = enumC9694;
                } else {
                    enumC9693 = EnumC9693.Add;
                    f44796.mo13708(abstractC17152, "Record (multiValue) has changed - addDNSEntry on:\n\t{}");
                    this.f44809.m13579(abstractC17152);
                }
            } else if (!zMo35351) {
                enumC9693 = EnumC9693.Add;
                f44796.mo13708(abstractC17152, "Record not cached - addDNSEntry on:\n\t{}");
                this.f44809.m13579(abstractC17152);
            }
        }
        if (abstractC17152.m35360() == EnumC24021.TYPE_PTR) {
            if (abstractC17152.m35353()) {
                if (zMo35351) {
                    return;
                }
                m34455(((C2237) abstractC17152).m7631());
                return;
            } else if (m34455(abstractC17152.m35359()) && enumC9693 == EnumC9693.Noop) {
                enumC9693 = EnumC9693.RegisterServiceType;
            }
        }
        if (enumC9693 != EnumC9693.Noop) {
            m34417(j, abstractC17152, enumC9693);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34420(C0525 c0525) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList<AbstractC17152> arrayListM44424 = c0525.m44424();
        ArrayList<AbstractC17152> arrayList = new ArrayList(arrayListM44424.size());
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC17152 abstractC17152 : arrayListM44424) {
            if (abstractC17152.m35360().equals(EnumC24021.TYPE_A) || abstractC17152.m35360().equals(EnumC24021.TYPE_AAAA)) {
                arrayList2.add(abstractC17152);
            } else {
                arrayList.add(abstractC17152);
            }
        }
        arrayList.addAll(arrayList2);
        boolean zMo7637 = false;
        boolean zMo7638 = false;
        for (AbstractC17152 abstractC17153 : arrayList) {
            m34427(abstractC17153, jCurrentTimeMillis);
            if (EnumC24021.TYPE_A.equals(abstractC17153.m35360()) || EnumC24021.TYPE_AAAA.equals(abstractC17153.m35360())) {
                zMo7637 |= abstractC17153.mo7637(this);
            } else {
                zMo7638 |= abstractC17153.mo7637(this);
            }
        }
        if (zMo7637 || zMo7638) {
            mo34435();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34422(C1271 c1271) throws IOException {
        InetAddress address;
        int port;
        if (c1271.m44426()) {
            return;
        }
        if (c1271.m4636() != null) {
            address = c1271.m4636().getAddress();
            port = c1271.m4636().getPort();
        } else {
            address = this.f44810;
            port = C3137.f10166;
        }
        byte[] bArrM4644 = c1271.m4644();
        DatagramPacket datagramPacket = new DatagramPacket(bArrM4644, bArrM4644.length, address, port);
        InterfaceC25186 interfaceC25186 = f44796;
        if (interfaceC25186.mo13713()) {
            try {
                C0525 c0525 = new C0525(datagramPacket);
                if (interfaceC25186.mo13713()) {
                    interfaceC25186.mo13723("send({}) JmDNS out:{}", this.f44805, c0525.m2491());
                }
            } catch (IOException e) {
                f44796.mo13701(C14168.class.toString(), C8947.m23910(new StringBuilder(".send("), this.f44805, ") - JmDNS can not parse what it sends!!!"), e);
            }
        }
        MulticastSocket multicastSocket = this.f44807;
        if (multicastSocket == null || multicastSocket.isClosed()) {
            return;
        }
        multicastSocket.send(datagramPacket);
    }

    @Override // l.InterfaceC24612
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void mo34436() {
        C6712.m18748().m18750(this).mo34436();
    }

    @Override // l.InterfaceC24612
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void mo34459() {
        C6712.m18748().m18750(this).mo34459();
    }

    @Override // l.InterfaceC24612
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo34449() {
        C6712.m18748().m18750(this).mo34449();
    }

    @Override // l.InterfaceC24612
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo34415() {
        C6712.m18748().m18750(this).mo34415();
    }

    @Override // l.InterfaceC24612
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo34435() {
        C6712.m18748().m18750(this).mo34435();
    }

    @Override // l.InterfaceC24612
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void mo34442() {
        C6712.m18748().m18750(this).mo34442();
    }

    @Override // l.InterfaceC24612
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo34440() {
        C6712.m18748().m18750(this).mo34440();
    }

    @Override // l.InterfaceC24612
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo34431() {
        C6712.m18748().m18750(this).mo34431();
    }

    @Override // l.InterfaceC24612
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo34443() {
        C6712.m18748().m18750(this).mo34443();
    }

    @Override // l.InterfaceC24612
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo34428(C17307 c17307) {
        C6712.m18748().m18750(this).mo34428(c17307);
    }

    @Override // l.InterfaceC24612
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo34418(String str) {
        C6712.m18748().m18750(this).mo34418(str);
    }

    @Override // l.InterfaceC24612
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo34421(C0525 c0525, InetAddress inetAddress, int i) {
        C6712.m18748().m18750(this).mo34421(c0525, inetAddress, i);
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final void m34441() {
        InterfaceC25186 interfaceC25186 = f44796;
        interfaceC25186.mo13716(this.f44805, "{}.recover()");
        if (this.f44799.m49152() || this.f44799.m49155() || this.f44799.m49156() || this.f44799.m49158()) {
            return;
        }
        synchronized (this.f44804) {
            if (this.f44799.m49150()) {
                String str = this.f44805 + ".recover()";
                interfaceC25186.mo13701("{} thread {}", str, Thread.currentThread().getName());
                new C1491(this, str).start();
            }
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m34411() {
        InterfaceC25186 interfaceC25186 = f44796;
        String str = this.f44805;
        interfaceC25186.mo13716(str, "{}.recover() Cleanning up");
        interfaceC25186.mo13729("RECOVERING");
        mo34436();
        ArrayList arrayList = new ArrayList(this.f44814.values());
        m34410();
        m34407();
        C21628 c21628 = this.f44799;
        c21628.m49157();
        mo34459();
        m34406();
        this.f44809.clear();
        interfaceC25186.mo13716(str, "{}.recover() All is clean");
        if (c21628.m49158()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C17307) ((AbstractC12457) it.next())).m40650();
            }
            c21628.m49154();
            try {
                m34404(c21628);
                m34403(arrayList);
            } catch (Exception e) {
                interfaceC25186.mo13702(str + ".recover() Start services exception ", (Throwable) e);
            }
            interfaceC25186.mo13728(str, "{}.recover() We are back!");
            return;
        }
        interfaceC25186.mo13728(str, "{}.recover() Could not recover we are Down!");
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m34447() {
        InterfaceC25186 interfaceC25186 = f44796;
        C4254 c4254 = this.f44809;
        c4254.m13578();
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet();
        ArrayList<AbstractC14694> arrayList = new ArrayList();
        for (List list : c4254.values()) {
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        for (AbstractC14694 abstractC14694 : arrayList) {
            try {
                AbstractC17152 abstractC17152 = (AbstractC17152) abstractC14694;
                if (abstractC17152.mo35351(jCurrentTimeMillis)) {
                    m34417(jCurrentTimeMillis, abstractC17152, EnumC9693.Remove);
                    interfaceC25186.mo13708(abstractC14694, "Removing DNSEntry from cache: {}");
                    c4254.m13580(abstractC17152);
                } else if (abstractC17152.m40298(jCurrentTimeMillis)) {
                    abstractC17152.m40299();
                    String lowerCase = abstractC17152.mo7633(false).mo30939().toLowerCase();
                    if (hashSet.add(lowerCase) && this.f44802.containsKey(lowerCase.toLowerCase())) {
                        mo34418(lowerCase);
                    }
                }
            } catch (Exception e) {
                interfaceC25186.mo13702(this.f44805 + ".Error while reaping records: " + abstractC14694, (Throwable) e);
                interfaceC25186.mo13729(toString());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.AbstractMap, l.ۜ᩹᩵] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.String] */
    public final String toString() {
        StringBuilder sbM3018 = C0703.m3018(2048, "\n\t---- Local Host -----\n\t");
        sbM3018.append(this.f44799);
        sbM3018.append("\n\t---- Services -----");
        for (Map.Entry entry : this.f44814.entrySet()) {
            sbM3018.append("\n\t\tService: ");
            sbM3018.append((String) entry.getKey());
            sbM3018.append(": ");
            sbM3018.append(entry.getValue());
        }
        sbM3018.append("\n\t---- Types ----");
        for (Object obj : this.f44801.values()) {
            sbM3018.append("\n\t\tType: ");
            sbM3018.append(obj.m20463());
            sbM3018.append(": ");
            if (obj.isEmpty()) {
                obj = "no subtypes";
            }
            sbM3018.append(obj);
        }
        sbM3018.append("\n");
        sbM3018.append(this.f44809.toString());
        sbM3018.append("\n\t---- Service Collectors ----");
        for (Map.Entry entry2 : this.f44802.entrySet()) {
            sbM3018.append("\n\t\tService Collector: ");
            sbM3018.append((String) entry2.getKey());
            sbM3018.append(": ");
            sbM3018.append(entry2.getValue());
        }
        sbM3018.append("\n\t---- Service Listeners ----");
        for (Map.Entry entry3 : this.f44808.entrySet()) {
            sbM3018.append("\n\t\tService Listener: ");
            sbM3018.append((String) entry3.getKey());
            sbM3018.append(": ");
            sbM3018.append(entry3.getValue());
        }
        return sbM3018.toString();
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    private void m34407() {
        f44796.mo13721("disposeServiceCollectors()");
        ConcurrentMapC17249 concurrentMapC17249 = this.f44802;
        for (Map.Entry entry : concurrentMapC17249.entrySet()) {
            C2982 c2982 = (C2982) entry.getValue();
            if (c2982 != null) {
                String str = (String) entry.getKey();
                m34451(str, c2982);
                concurrentMapC17249.remove(str, c2982);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34401(String str, String str2) {
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        return (!lowerCase2.endsWith(lowerCase) || lowerCase2.equals(lowerCase)) ? str2 : str2.substring(0, (str2.length() - str.length()) - 1);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMap m34445() {
        return this.f44814;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34450(long j) {
        this.f44811 = j;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long m34444() {
        return this.f44811;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34416(int i) {
        this.f44815 = i;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m34434() {
        return this.f44815;
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public static Random m34400() {
        return f44797;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34452(C0525 c0525) {
        ReentrantLock reentrantLock = this.f44803;
        reentrantLock.lock();
        try {
            if (this.f44800 == c0525) {
                this.f44800 = null;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 m34433() {
        return this.f44801;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final MulticastSocket m34409() {
        return this.f44807;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InetAddress m34439() {
        return this.f44810;
    }
}
