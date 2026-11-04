package l;

import android.content.DialogInterface;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۨۛ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes3.dex */
public final class C12168 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f39127 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static C19863 f39129;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C22611 f39130;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C20373 f39131;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C13921 f39133;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Object f39132 = new Object();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final LinkedHashMap f39128 = new LinkedHashMap();

    static {
        C22611 c22611 = new C22611();
        C13921 c13921 = new C13921(1);
        C20373 c20373 = new C20373();
        ExecutorService executorService = C5261.f18540;
        C17359.requireNonNull(executorService);
        C19863 c19863 = new C19863(executorService);
        f39130 = c22611;
        f39133 = c13921;
        f39131 = c20373;
        f39129 = c19863;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30420(AbstractActivityC17204 abstractActivityC17204, final C17389 c17389, final InterfaceC16643 interfaceC16643, final InterfaceC0818 interfaceC0818) {
        String[] strArr;
        int length;
        int i;
        C19863 c19863;
        final C4711 c4711;
        long j;
        if (C9646.m25161(abstractActivityC17204)) {
            View viewM40395 = abstractActivityC17204.m40395(R.layout.MT_Protector);
            TextView textView = (TextView) viewM40395.findViewById(R.id.title);
            textView.setText(R.string.MT_Protector);
            final ProgressBar progressBar = (ProgressBar) viewM40395.findViewById(R.id.MT_Protector);
            progressBar.setVisibility(0);
            ListView listView = (ListView) viewM40395.findViewById(R.id.MT_Protector);
            C18597.m43179(listView);
            final C2647 c2647 = new C2647(c17389.f56556);
            c2647.f8457 = ((View) textView.getParent()).getPaddingLeft();
            c2647.f8456 = C6907.m19160(8.0f);
            listView.setDivider(null);
            listView.setAdapter((ListAdapter) c2647);
            C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
            c2361BuildDialog.m8005(viewM40395);
            c2361BuildDialog.m8026(R.string.MT_Protector, null);
            c2361BuildDialog.m8012(false);
            final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ۘۨ۫
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
                    interfaceC0818.accept((C10676) c2647.f8455.get(i2));
                    dialogInterfaceC8327M8016.dismiss();
                }
            });
            final C13833 c13833 = new C13833(dialogInterfaceC8327M8016);
            ArrayList<C15151> arrayList = new ArrayList();
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                if (networkInterfaces != null) {
                    while (networkInterfaces.hasMoreElements()) {
                        NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                        try {
                            String name = networkInterfaceNextElement.getName();
                            if (!m30423(name) && networkInterfaceNextElement.isUp() && !networkInterfaceNextElement.isLoopback() && !networkInterfaceNextElement.isVirtual() && !m30431(name) && !m30431(networkInterfaceNextElement.getDisplayName())) {
                                for (InterfaceAddress interfaceAddress : networkInterfaceNextElement.getInterfaceAddresses()) {
                                    InetAddress address = interfaceAddress.getAddress();
                                    if ((address instanceof Inet4Address) && !address.isAnyLocalAddress() && !address.isLoopbackAddress() && !address.isMulticastAddress()) {
                                        arrayList.add(new C15151((Inet4Address) address, interfaceAddress.getNetworkPrefixLength()));
                                    }
                                }
                            }
                        } catch (SocketException unused) {
                        }
                    }
                }
                while (true) {
                    c19863 = f39129;
                    if (i >= length) {
                        c4711 = null;
                        break;
                    }
                    if (!m30423(strArr[i])) {
                        C13833.m33777(c13833, abstractActivityC17204);
                        final C11422 c11422 = new C11422();
                        c4711 = new C4711(c13833, c11422);
                        for (String str : c17389.f56555) {
                            if (!m30423(str)) {
                                if (arrayList.isEmpty()) {
                                    ((ExecutorService) c19863.f63894).execute(new Runnable() { // from class: l.֡ۨ۫
                                        @Override // java.lang.Runnable
                                        public final void run() throws Throwable {
                                            C12168.m30417(c11422, c4711, c17389, (Inet4Address) null, "default");
                                        }
                                    });
                                    break;
                                }
                                for (final C15151 c15151 : arrayList) {
                                    final String hostAddress = c15151.f49437.getHostAddress();
                                    ((ExecutorService) c19863.f63894).execute(new Runnable() { // from class: l.۟ۨ۫
                                        @Override // java.lang.Runnable
                                        public final void run() throws Throwable {
                                            C15151 c15152 = c15151;
                                            C12168.m30417(c11422, c4711, c17389, c15152.f49437, hostAddress);
                                        }
                                    });
                                }
                                break;
                            }
                        }
                        dialogInterfaceC8327M8016.m22426(new DialogInterface.OnDismissListener() { // from class: l.ܰۨ۫
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                c11422.m28776();
                                C13833.m33780(c13833);
                            }
                        });
                        break;
                    }
                    i++;
                }
            } catch (SocketException unused2) {
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(Long.valueOf(m30405(((C15151) it.next()).f49437)));
            }
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (Iterator it2 = arrayList.iterator(); it2.hasNext(); it2 = it2) {
                C15151 c15152 = (C15151) it2.next();
                int i2 = c15152.f49438;
                char c = 24;
                int iMax = (i2 < 0 || i2 > 32) ? 24 : Math.max(i2, 24);
                if (iMax < 31) {
                    long j2 = (4294967295 << (32 - iMax)) & 4294967295L;
                    long jM30405 = m30405(c15152.f49437) & j2;
                    long j3 = ((~j2) & 4294967295L) | jM30405;
                    long j4 = jM30405 + 1;
                    while (j4 < j3) {
                        if (linkedHashSet.contains(Long.valueOf(j4))) {
                            j = j4;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append((j4 >> c) & 255);
                            sb.append(".");
                            j = j4;
                            sb.append((j4 >> 16) & 255);
                            sb.append(".");
                            sb.append((j >> 8) & 255);
                            sb.append(".");
                            sb.append(j & 255);
                            linkedHashSet2.add(sb.toString());
                        }
                        j4 = j + 1;
                        c = 24;
                    }
                }
            }
            final ArrayList arrayList2 = new ArrayList(linkedHashSet2);
            strArr = c17389.f56555;
            length = strArr.length;
            i = 0;
            final C4711 c4712 = c4711;
            c13833.f43909.m40350(dialogInterfaceC8327M8016, new InterfaceC16438() { // from class: l.᩶ۨ۫
                @Override // l.InterfaceC16438
                /* JADX INFO: renamed from: ۙ */
                public final void mo1486(Object obj) {
                    List list = (List) obj;
                    if (list == null) {
                        list = Collections.EMPTY_LIST;
                    }
                    progressBar.setVisibility(list.isEmpty() ? 0 : 8);
                    C2647 c2648 = c2647;
                    c2648.f8455 = list;
                    c2648.notifyDataSetChanged();
                }
            });
            final AtomicInteger atomicInteger = new AtomicInteger();
            int size = arrayList2.size();
            int iMin = size <= 0 ? 0 : Math.min(size, 32);
            C13833.m33773(c13833, iMin);
            for (int i3 = 0; i3 < iMin; i3++) {
                ((ExecutorService) c19863.f63894).execute(new Runnable() { // from class: l.ܿۨ۫
                    @Override // java.lang.Runnable
                    public final void run() {
                        C12168.m30419(c13833, atomicInteger, arrayList2, c17389, interfaceC16643, c4712);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (m30426(r2, r6.f56555) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (r4.m28777() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        m30430(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        r6 = m30408(r7.f19052, r6.f56555).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r6.hasNext() == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        r8 = (l.C8613) r6.next();
        r5.m14601(r8.f28128, r8.f28127, r8.f28129, r8.f28130);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r4.m28777() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        m30430(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        r5 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0087, code lost:
    
        if (r2 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        m30430(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0092, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m30417(l.C11422 r4, l.C4711 r5, l.C17389 r6, java.net.Inet4Address r7, java.lang.String r8) throws java.lang.Throwable {
        /*
            l.ۚۛ۫ r7 = m30409(r4, r7, r8)
            if (r7 != 0) goto L7
            goto L7c
        L7:
            r1 = 0
            java.lang.Object r0 = l.C12168.f39132     // Catch: java.lang.Throwable -> L85
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L85
            boolean r2 = l.C11422.m28773(r4)     // Catch: java.lang.Throwable -> L82
            if (r2 == 0) goto L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L82
            m30430(r7)
            return
        L16:
            l.֫ۛ۫ r2 = new l.֫ۛ۫     // Catch: java.lang.Throwable -> L82
            l.᩻ۛ۫ r3 = l.C5457.m16291(r7)     // Catch: java.lang.Throwable -> L82
            r2.<init>(r4, r3, r8)     // Catch: java.lang.Throwable -> L82
            l.ۡۨ۫ r8 = new l.ۡۨ۫     // Catch: java.lang.Throwable -> L7f
            r8.<init>(r2, r5)     // Catch: java.lang.Throwable -> L7f
            l.C1728.m6120(r2, r8)     // Catch: java.lang.Throwable -> L7f
            java.util.ArrayList r8 = l.C11422.m28774(r4)     // Catch: java.lang.Throwable -> L7f
            r8.add(r2)     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7f
            java.lang.String[] r8 = l.C17389.m40846(r6)     // Catch: java.lang.Throwable -> L7d
            boolean r8 = m30426(r2, r8)     // Catch: java.lang.Throwable -> L7d
            if (r8 != 0) goto L43
            boolean r4 = r4.m28777()
            if (r4 == 0) goto L7c
            m30430(r7)
            return
        L43:
            l.᩻ۛ۫ r8 = l.C5457.m16291(r7)     // Catch: java.lang.Throwable -> L7d
            java.lang.String[] r6 = l.C17389.m40846(r6)     // Catch: java.lang.Throwable -> L7d
            java.util.ArrayList r6 = m30408(r8, r6)     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L7d
        L53:
            boolean r8 = r6.hasNext()     // Catch: java.lang.Throwable -> L7d
            if (r8 == 0) goto L73
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L7d
            l.۠ۨ۫ r8 = (l.C8613) r8     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = l.C8613.m23118(r8)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = l.C8613.m23117(r8)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = l.C8613.m23119(r8)     // Catch: java.lang.Throwable -> L7d
            l.ۤۛ۫ r8 = l.C8613.m23120(r8)     // Catch: java.lang.Throwable -> L7d
            r5.m14601(r0, r1, r3, r8)     // Catch: java.lang.Throwable -> L7d
            goto L53
        L73:
            boolean r4 = r4.m28777()
            if (r4 == 0) goto L7c
            m30430(r7)
        L7c:
            return
        L7d:
            r5 = move-exception
            goto L87
        L7f:
            r5 = move-exception
            r1 = r2
            goto L83
        L82:
            r5 = move-exception
        L83:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L82
            throw r5     // Catch: java.lang.Throwable -> L85
        L85:
            r5 = move-exception
            r2 = r1
        L87:
            if (r2 == 0) goto L8f
            boolean r4 = r4.m28777()
            if (r4 == 0) goto L92
        L8f:
            m30430(r7)
        L92:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12168.m30417(l.ۧۛ۫, l.ۙۛ۫, l.ܽۛ۫, java.net.Inet4Address, java.lang.String):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5457 m30409(C11422 c11422, InetAddress inetAddress, String str) {
        RunnableC19055 runnableC19055;
        C24849 c24849;
        C5457 c5457;
        RunnableC19055 runnableC19056;
        while (true) {
            Object obj = f39132;
            synchronized (obj) {
                runnableC19055 = null;
                if (c11422.f35920) {
                    return null;
                }
                LinkedHashMap linkedHashMap = f39128;
                C24849 c248410 = (C24849) linkedHashMap.get(str);
                if (c248410 == null || c248410.f80435) {
                    C24849 c248411 = new C24849(str, inetAddress);
                    linkedHashMap.put(str, c248411);
                    c24849 = c248411;
                    c5457 = null;
                } else if (c248410.f80440) {
                    try {
                        obj.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return null;
                    }
                } else {
                    Object obj2 = c248410.f80436;
                    if (obj2 == null) {
                        runnableC19056 = null;
                    } else {
                        C20373 c20373 = f39131;
                        c248410.f80436 = null;
                        runnableC19056 = new RunnableC19055(c20373, obj2);
                    }
                    c248410.f80434++;
                    c5457 = new C5457(c248410);
                    c11422.f35922.add(c5457);
                    c24849 = null;
                    runnableC19055 = runnableC19056;
                }
            }
            if (runnableC19055 != null) {
                runnableC19055.run();
            }
            if (c5457 != null) {
                return c5457;
            }
            if (c24849 != null) {
                return m30410(c11422, c24849);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5457 m30410(C11422 c11422, C24849 c24849) {
        C14168 c14168;
        boolean z;
        C5457 c5457;
        RunnableC10104 runnableC10104;
        RunnableC19055 runnableC19055;
        try {
            C22611 c22611 = f39130;
            InetAddress inetAddress = c24849.f80433;
            c22611.getClass();
            if (inetAddress == null) {
                c14168 = new C14168(null);
            } else {
                c14168 = new C14168(inetAddress);
            }
            C19627 c19627 = new C19627(c14168);
            Object obj = f39132;
            synchronized (obj) {
                z = true;
                if (f39128.get(c24849.f80432) != c24849 || c24849.f80435) {
                    c5457 = null;
                    runnableC10104 = null;
                } else {
                    c24849.f80437 = c19627;
                    c24849.f80440 = false;
                    obj.notifyAll();
                    if (!c11422.f35920) {
                        c24849.f80434++;
                        c5457 = new C5457(c24849);
                        c11422.f35922.add(c5457);
                        runnableC10104 = null;
                    } else {
                        C20373 c20373 = f39131;
                        Object obj2 = c24849.f80436;
                        if (obj2 == null) {
                            runnableC19055 = null;
                        } else {
                            c24849.f80436 = null;
                            runnableC19055 = new RunnableC19055(c20373, obj2);
                        }
                        Object obj3 = new Object();
                        c24849.f80436 = obj3;
                        runnableC10104 = new RunnableC10104(runnableC19055, c20373, obj3, c24849);
                        c5457 = null;
                    }
                    z = false;
                }
                obj.notifyAll();
            }
            if (runnableC10104 != null) {
                runnableC10104.run();
            }
            if (c5457 != null) {
                return c5457;
            }
            if (z) {
                try {
                    c19627.m45269();
                } catch (IOException | RuntimeException unused) {
                }
            }
            return null;
        } catch (IOException | RuntimeException unused2) {
            Object obj4 = f39132;
            synchronized (obj4) {
                LinkedHashMap linkedHashMap = f39128;
                if (linkedHashMap.get(c24849.f80432) == c24849) {
                    linkedHashMap.remove(c24849.f80432);
                }
                obj4.notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30426(C1728 c1728, String[] strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            String str = strArr[i];
            if (!m30423(str)) {
                synchronized (f39132) {
                    if (!m30427(c1728)) {
                        m30429(c1728);
                        m30432(c1728);
                        return false;
                    }
                    c1728.f5908.add(str);
                    try {
                        ((C19627) c1728.f5905.f80437).m45270(str, c1728.f5907);
                    } catch (RuntimeException unused) {
                        z = false;
                    }
                    boolean zM30425 = m30425(c1728, str, z);
                    if (!z || zM30425) {
                        try {
                            ((C19627) c1728.f5905.f80437).m45271(str, c1728.f5907);
                        } catch (RuntimeException unused2) {
                        }
                    }
                    if (!z || zM30425) {
                        m30429(c1728);
                        m30432(c1728);
                        return false;
                    }
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30425(C1728 c1728, String str, boolean z) {
        synchronized (f39132) {
            c1728.f5908.remove(str);
            if (!z) {
                return false;
            }
            if (!m30427(c1728)) {
                return true;
            }
            c1728.f5903.add(str);
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m30429(C1728 c1728) {
        synchronized (f39132) {
            c1728.f5902 = false;
            c1728.f5906.f35921.remove(c1728);
        }
        m30428(c1728);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m30432(C1728 c1728) {
        C5457 c5457;
        synchronized (f39132) {
            Iterator it = c1728.f5906.f35922.iterator();
            do {
                if (!it.hasNext()) {
                    c5457 = null;
                    break;
                }
                c5457 = (C5457) it.next();
            } while (c5457.f19052 != c1728.f5905);
        }
        if (c5457 != null) {
            m30430(c5457);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m30428(C1728 c1728) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        synchronized (f39132) {
            linkedHashSet.addAll(c1728.f5908);
            linkedHashSet.addAll(c1728.f5903);
            c1728.f5908.clear();
            c1728.f5903.clear();
        }
        for (String str : linkedHashSet) {
            try {
                ((C19627) c1728.f5905.f80437).m45271(str, c1728.f5907);
            } catch (RuntimeException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8613 m30411(C1728 c1728, AbstractC3508 abstractC3508, C10676 c10676) {
        synchronized (f39132) {
            String strMo11501 = abstractC3508.mo11501();
            if (!(m30427(c1728) && (c1728.f5908.contains(strMo11501) || c1728.f5903.contains(strMo11501)))) {
                return null;
            }
            String str = c1728.f5904;
            String strMo11502 = abstractC3508.mo11501();
            AbstractC12457 abstractC12457Mo11502 = abstractC3508.mo11502();
            String strM30407 = m30407(str, strMo11502, abstractC12457Mo11502 == null ? null : abstractC12457Mo11502.mo30941(), abstractC3508.getName());
            String strM30408 = m30407(c1728.f5904, abstractC3508.mo11501(), (String) null, abstractC3508.getName());
            String strMo11503 = abstractC3508.mo11501();
            f39133.getClass();
            C8613 c8613 = new C8613(strMo11503, strM30407, strM30408, c10676, SystemClock.uptimeMillis());
            C8613 c8614 = (C8613) c1728.f5905.f80439.put(strM30407, c8613);
            if (c8614 != null) {
                C24849 c24849 = c1728.f5905;
                String str2 = c8614.f28127;
                String str3 = c8614.f28128;
                LinkedHashSet linkedHashSet = (LinkedHashSet) c24849.f80438.get(str2);
                if (linkedHashSet != null) {
                    linkedHashSet.remove(str3);
                    if (linkedHashSet.isEmpty()) {
                        c24849.f80438.remove(str2);
                    }
                }
            }
            C24849 c248410 = c1728.f5905;
            LinkedHashSet linkedHashSet2 = (LinkedHashSet) c248410.f80438.get(strM30408);
            if (linkedHashSet2 == null) {
                linkedHashSet2 = new LinkedHashSet();
                c248410.f80438.put(strM30408, linkedHashSet2);
            }
            linkedHashSet2.add(strM30407);
            return c8613;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30424(C1728 c1728, String str, String str2, String str3) {
        synchronized (f39132) {
            if (!(m30427(c1728) && (c1728.f5908.contains(str) || c1728.f5903.contains(str)))) {
                return false;
            }
            m30422(c1728.f5905, str2);
            LinkedHashSet linkedHashSet = (LinkedHashSet) c1728.f5905.f80438.remove(str3);
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    m30422(c1728.f5905, (String) it.next());
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m30408(C24849 c24849, String[] strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : strArr) {
            if (!m30423(str)) {
                linkedHashSet.add(str);
            }
        }
        ArrayList arrayList = new ArrayList();
        f39133.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (f39132) {
            ArrayList arrayList2 = new ArrayList();
            for (C8613 c8613 : c24849.f80439.values()) {
                if (jUptimeMillis - c8613.f28131 > 120000) {
                    arrayList2.add(c8613.f28128);
                } else if (linkedHashSet.contains(c8613.f28129)) {
                    arrayList.add(c8613);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                m30422(c24849, (String) it.next());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m30427(C1728 c1728) {
        if (!c1728.f5902 || c1728.f5906.f35920 || c1728.f5905.f80440 || c1728.f5905.f80435) {
            return false;
        }
        return f39128.get(c1728.f5905.f80432) == c1728.f5905;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m30430(C5457 c5457) {
        synchronized (f39132) {
            if (c5457.f19051) {
                return;
            }
            c5457.f19051 = true;
            C24849 c24849 = c5457.f19052;
            if (c24849.f80434 > 0) {
                c24849.f80434--;
            }
            RunnableC10104 runnableC10104 = null;
            RunnableC19055 runnableC19055 = null;
            runnableC10104 = null;
            runnableC10104 = null;
            runnableC10104 = null;
            if (c24849.f80434 == 0 && !c24849.f80440 && !c24849.f80435 && f39128.get(c24849.f80432) == c24849) {
                C20373 c20373 = f39131;
                Object obj = c24849.f80436;
                if (obj != null) {
                    c24849.f80436 = null;
                    runnableC19055 = new RunnableC19055(c20373, obj);
                }
                Object obj2 = new Object();
                c24849.f80436 = obj2;
                runnableC10104 = new RunnableC10104(runnableC19055, c20373, obj2, c24849);
            }
            if (runnableC10104 != null) {
                runnableC10104.run();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30421(C24849 c24849, Object obj) {
        Object obj2 = f39132;
        synchronized (obj2) {
            LinkedHashMap linkedHashMap = f39128;
            if (linkedHashMap.get(c24849.f80432) == c24849 && c24849.f80434 == 0 && c24849.f80436 == obj && !c24849.f80440 && !c24849.f80435) {
                c24849.f80435 = true;
                c24849.f80436 = null;
                c24849.f80439.clear();
                c24849.f80438.clear();
                linkedHashMap.remove(c24849.f80432);
                InterfaceC12914 interfaceC12914 = c24849.f80437;
                obj2.notifyAll();
                if (interfaceC12914 == null) {
                    return;
                }
                try {
                    ((C19627) interfaceC12914).m45269();
                } catch (IOException | RuntimeException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30422(C24849 c24849, String str) {
        C8613 c8613 = (C8613) c24849.f80439.remove(str);
        if (c8613 == null) {
            return;
        }
        String str2 = c8613.f28127;
        String str3 = c8613.f28128;
        LinkedHashSet linkedHashSet = (LinkedHashSet) c24849.f80438.get(str2);
        if (linkedHashSet == null) {
            return;
        }
        linkedHashSet.remove(str3);
        if (linkedHashSet.isEmpty()) {
            c24849.f80438.remove(str2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10676 m30412(AbstractC12457 abstractC12457) {
        String hostAddress;
        int iIndexOf;
        if (abstractC12457 == null) {
            return null;
        }
        String name = abstractC12457.getName();
        if (name != null && (iIndexOf = name.indexOf(46)) != -1) {
            name = name.substring(0, iIndexOf);
        }
        Inet4Address inet4AddressMo30940 = abstractC12457.mo30940();
        if (inet4AddressMo30940 != null) {
            hostAddress = inet4AddressMo30940.getHostAddress();
        } else {
            Inet6Address inet6AddressMo30943 = abstractC12457.mo30943();
            if (inet6AddressMo30943 == null) {
                return null;
            }
            hostAddress = inet6AddressMo30943.getHostAddress();
        }
        if (m30423(name)) {
            name = hostAddress;
        }
        return new C10676(name, abstractC12457.mo30952(), hostAddress, abstractC12457.mo30934());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30419(C13833 c13833, AtomicInteger atomicInteger, ArrayList arrayList, C17389 c17389, InterfaceC16643 interfaceC16643, InterfaceC15897 interfaceC15897) {
        int andIncrement;
        while (!c13833.m33778() && (andIncrement = atomicInteger.getAndIncrement()) < arrayList.size()) {
            try {
                C10676 c10676M30413 = m30413(c17389, interfaceC16643, interfaceC15897, (String) arrayList.get(andIncrement));
                if (c10676M30413 != null) {
                    C13833.m33774(c13833, c10676M30413);
                }
            } finally {
                C13833.m33779(c13833);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10676 m30413(C17389 c17389, InterfaceC16643 interfaceC16643, InterfaceC15897 interfaceC15897, String str) {
        int i = c17389.f56557;
        try {
            Socket socket = new Socket();
            try {
                socket.connect(new InetSocketAddress(InetAddress.getByName(str), i), 800);
                socket.close();
                try {
                    String strMo16881 = interfaceC16643.mo16881(str);
                    if (strMo16881 != null) {
                        return new C10676(strMo16881, c17389.f56557, str, strMo16881);
                    }
                    return null;
                } catch (RuntimeException unused) {
                    return null;
                }
            } catch (Throwable th) {
                try {
                    socket.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused2) {
            if (interfaceC15897 != null) {
                ((C4711) interfaceC15897).m14598(c17389.f56557, str);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m30431(String str) {
        if (m30423(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        return lowerCase.equals("lo") || lowerCase.contains("rmnet") || lowerCase.equals("br") || lowerCase.matches("br\\d+") || lowerCase.startsWith("br-") || lowerCase.startsWith("br_") || lowerCase.startsWith("ccmni") || lowerCase.startsWith("pdp") || lowerCase.startsWith("wwan") || lowerCase.startsWith("ppp") || lowerCase.startsWith("dummy") || lowerCase.startsWith("ifb") || lowerCase.startsWith("veth") || lowerCase.startsWith("virbr") || lowerCase.startsWith("docker") || lowerCase.startsWith("vbox") || lowerCase.startsWith("vmnet") || lowerCase.startsWith("sit") || lowerCase.startsWith("ip6tnl") || lowerCase.startsWith("gre") || lowerCase.startsWith("gretap") || lowerCase.startsWith("vti") || lowerCase.startsWith("clat") || lowerCase.startsWith("v4-") || lowerCase.startsWith("tun") || lowerCase.startsWith("tap") || lowerCase.startsWith("utun") || lowerCase.startsWith("vpn") || lowerCase.startsWith("wg") || lowerCase.startsWith("ipsec") || lowerCase.startsWith("l2tp") || lowerCase.startsWith("tailscale") || lowerCase.startsWith("zt");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m30407(String str, String str2, String str3, String str4) {
        if (m30423(str3)) {
            str3 = str4;
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("|");
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append("|");
        if (str3 == null) {
            str3 = "";
        }
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m30405(Inet4Address inet4Address) {
        byte[] address = inet4Address.getAddress();
        return ((((long) address[0]) & 255) << 24) | ((((long) address[1]) & 255) << 16) | ((((long) address[2]) & 255) << 8) | (255 & ((long) address[3]));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30423(String str) {
        return str == null || str.isEmpty();
    }
}
