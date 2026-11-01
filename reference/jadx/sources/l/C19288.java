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

/* JADX INFO: renamed from: l.᩵ۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes4.dex */
public final class C19288 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C19911 f62244;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C0219 f62245;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f62246 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C7999 f62247;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C11527 f62250;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Object f62249 = new Object();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final LinkedHashMap f62248 = new LinkedHashMap();

    static {
        C11527 c11527 = new C11527();
        C0219 c0219 = new C0219();
        C7999 c7999 = new C7999();
        ExecutorService executorService = C4716.f16636;
        C13638.requireNonNull(executorService);
        C19911 c19911 = new C19911(executorService);
        f62250 = c11527;
        f62245 = c0219;
        f62247 = c7999;
        f62244 = c19911;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44268(AbstractActivityC12483 abstractActivityC12483, final C15055 c15055, final InterfaceC22816 interfaceC22816, final InterfaceC17295 interfaceC17295) {
        String[] strArr;
        int length;
        int i;
        C19911 c19911;
        final C2976 c2976;
        long j;
        if (C23810.m52474(abstractActivityC12483)) {
            View viewM30995 = abstractActivityC12483.m30995(R.layout.MT_Protector);
            TextView textView = (TextView) viewM30995.findViewById(R.id.MT_Protector);
            textView.setText(R.string.MT_Protector);
            final ProgressBar progressBar = (ProgressBar) viewM30995.findViewById(R.id.MT_Protector);
            progressBar.setVisibility(0);
            ListView listView = (ListView) viewM30995.findViewById(R.id.MT_Protector);
            C16754.m39314(listView);
            final C23439 c23439 = new C23439(c15055.f49061);
            c23439.f75873 = ((View) textView.getParent()).getPaddingLeft();
            c23439.f75870 = C13932.m33769(8.0f);
            listView.setDivider(null);
            listView.setAdapter((ListAdapter) c23439);
            C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
            c8067BuildDialog.m21258(viewM30995);
            c8067BuildDialog.m21251(R.string.MT_Protector, null);
            c8067BuildDialog.m21265(false);
            final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.۟ۘ֨
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
                    interfaceC17295.accept((C13644) c23439.f75871.get(i2));
                    dialogInterfaceC19356M21269.dismiss();
                }
            });
            final C9328 c9328 = new C9328(dialogInterfaceC19356M21269);
            ArrayList<C5176> arrayList = new ArrayList();
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                if (networkInterfaces != null) {
                    while (networkInterfaces.hasMoreElements()) {
                        NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                        try {
                            String name = networkInterfaceNextElement.getName();
                            if (!m44270(name) && networkInterfaceNextElement.isUp() && !networkInterfaceNextElement.isLoopback() && !networkInterfaceNextElement.isVirtual() && !m44278(name) && !m44278(networkInterfaceNextElement.getDisplayName())) {
                                for (InterfaceAddress interfaceAddress : networkInterfaceNextElement.getInterfaceAddresses()) {
                                    InetAddress address = interfaceAddress.getAddress();
                                    if ((address instanceof Inet4Address) && !address.isAnyLocalAddress() && !address.isLoopbackAddress() && !address.isMulticastAddress()) {
                                        arrayList.add(new C5176((Inet4Address) address, interfaceAddress.getNetworkPrefixLength()));
                                    }
                                }
                            }
                        } catch (SocketException unused) {
                        }
                    }
                }
                while (true) {
                    c19911 = f62244;
                    if (i >= length) {
                        c2976 = null;
                        break;
                    }
                    if (!m44270(strArr[i])) {
                        C9328.m23983(c9328, abstractActivityC12483);
                        final C3764 c3764 = new C3764();
                        c2976 = new C2976(c9328, c3764);
                        for (String str : c15055.f49060) {
                            if (!m44270(str)) {
                                if (arrayList.isEmpty()) {
                                    c19911.f63825.execute(new Runnable() { // from class: l.ܽۘ֨
                                        @Override // java.lang.Runnable
                                        public final void run() throws Throwable {
                                            C19288.m44263(c3764, c2976, c15055, (Inet4Address) null, "default");
                                        }
                                    });
                                    break;
                                }
                                for (final C5176 c5176 : arrayList) {
                                    final String hostAddress = c5176.f17966.getHostAddress();
                                    c19911.f63825.execute(new Runnable() { // from class: l.۫ۘ֨
                                        @Override // java.lang.Runnable
                                        public final void run() throws Throwable {
                                            C5176 c5177 = c5176;
                                            C19288.m44263(c3764, c2976, c15055, c5177.f17966, hostAddress);
                                        }
                                    });
                                }
                                break;
                            }
                        }
                        dialogInterfaceC19356M21269.m44367(new DialogInterface.OnDismissListener() { // from class: l.᩷ۘ֨
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                c3764.m11008();
                                C9328.m23986(c9328);
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
                linkedHashSet.add(Long.valueOf(m44252(((C5176) it.next()).f17966)));
            }
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (Iterator it2 = arrayList.iterator(); it2.hasNext(); it2 = it2) {
                C5176 c5177 = (C5176) it2.next();
                int i2 = c5177.f17967;
                char c = 24;
                int iMax = (i2 < 0 || i2 > 32) ? 24 : Math.max(i2, 24);
                if (iMax < 31) {
                    long j2 = (4294967295 << (32 - iMax)) & 4294967295L;
                    long jM44252 = m44252(c5177.f17966) & j2;
                    long j3 = ((~j2) & 4294967295L) | jM44252;
                    long j4 = jM44252 + 1;
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
            strArr = c15055.f49060;
            length = strArr.length;
            i = 0;
            final C2976 c2977 = c2976;
            c9328.f31674.m44959(dialogInterfaceC19356M21269, new InterfaceC10597() { // from class: l.ܺۘ֨
                @Override // l.InterfaceC10597
                /* JADX INFO: renamed from: ۙ */
                public final void mo1473(Object obj) {
                    List list = (List) obj;
                    if (list == null) {
                        list = Collections.EMPTY_LIST;
                    }
                    progressBar.setVisibility(list.isEmpty() ? 0 : 8);
                    C23439 c234310 = c23439;
                    c234310.f75871 = list;
                    c234310.notifyDataSetChanged();
                }
            });
            final AtomicInteger atomicInteger = new AtomicInteger();
            int size = arrayList2.size();
            int iMin = size <= 0 ? 0 : Math.min(size, 32);
            C9328.m23980(c9328, iMin);
            for (int i3 = 0; i3 < iMin; i3++) {
                c19911.f63825.execute(new Runnable() { // from class: l.֡ۘ֨
                    @Override // java.lang.Runnable
                    public final void run() {
                        C19288.m44267(c9328, atomicInteger, arrayList2, c15055, interfaceC22816, c2977);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (m44273(r2, r6.f49060) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (r4.m11009() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        m44276(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        r6 = m44255(r7.f3746, r6.f49060).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r6.hasNext() == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        r8 = (l.C14267) r6.next();
        r5.m8871(r8.f46695, r8.f46693, r8.f46694, r8.f46696);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r4.m11009() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        m44276(r7);
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
    
        m44276(r7);
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
    public static void m44263(l.C3764 r4, l.C2976 r5, l.C15055 r6, java.net.Inet4Address r7, java.lang.String r8) throws java.lang.Throwable {
        /*
            l.֨ۜ֨ r7 = m44256(r4, r7, r8)
            if (r7 != 0) goto L7
            goto L7c
        L7:
            r1 = 0
            java.lang.Object r0 = l.C19288.f62249     // Catch: java.lang.Throwable -> L85
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L85
            boolean r2 = l.C3764.m11005(r4)     // Catch: java.lang.Throwable -> L82
            if (r2 == 0) goto L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L82
            m44276(r7)
            return
        L16:
            l.۬ۜ֨ r2 = new l.۬ۜ֨     // Catch: java.lang.Throwable -> L82
            l.ۜۜ֨ r3 = l.C0942.m3704(r7)     // Catch: java.lang.Throwable -> L82
            r2.<init>(r4, r3, r8)     // Catch: java.lang.Throwable -> L82
            l.ۧۘ֨ r8 = new l.ۧۘ֨     // Catch: java.lang.Throwable -> L7f
            r8.<init>(r2, r5)     // Catch: java.lang.Throwable -> L7f
            l.C12938.m32051(r2, r8)     // Catch: java.lang.Throwable -> L7f
            java.util.ArrayList r8 = l.C3764.m11006(r4)     // Catch: java.lang.Throwable -> L7f
            r8.add(r2)     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7f
            java.lang.String[] r8 = l.C15055.m36044(r6)     // Catch: java.lang.Throwable -> L7d
            boolean r8 = m44273(r2, r8)     // Catch: java.lang.Throwable -> L7d
            if (r8 != 0) goto L43
            boolean r4 = r4.m11009()
            if (r4 == 0) goto L7c
            m44276(r7)
            return
        L43:
            l.ۜۜ֨ r8 = l.C0942.m3704(r7)     // Catch: java.lang.Throwable -> L7d
            java.lang.String[] r6 = l.C15055.m36044(r6)     // Catch: java.lang.Throwable -> L7d
            java.util.ArrayList r6 = m44255(r8, r6)     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L7d
        L53:
            boolean r8 = r6.hasNext()     // Catch: java.lang.Throwable -> L7d
            if (r8 == 0) goto L73
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L7d
            l.ܳۘ֨ r8 = (l.C14267) r8     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = l.C14267.m34415(r8)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = l.C14267.m34413(r8)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = l.C14267.m34414(r8)     // Catch: java.lang.Throwable -> L7d
            l.ܰۜ֨ r8 = l.C14267.m34416(r8)     // Catch: java.lang.Throwable -> L7d
            r5.m8871(r0, r1, r3, r8)     // Catch: java.lang.Throwable -> L7d
            goto L53
        L73:
            boolean r4 = r4.m11009()
            if (r4 == 0) goto L7c
            m44276(r7)
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
            boolean r4 = r4.m11009()
            if (r4 == 0) goto L92
        L8f:
            m44276(r7)
        L92:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19288.m44263(l.ۘۜ֨, l.ۗۘ֨, l.ܶۜ֨, java.net.Inet4Address, java.lang.String):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0942 m44256(C3764 c3764, InetAddress inetAddress, String str) {
        RunnableC17088 runnableC17088;
        C6587 c6587;
        C0942 c0942;
        RunnableC17088 runnableC17089;
        while (true) {
            Object obj = f62249;
            synchronized (obj) {
                runnableC17088 = null;
                if (c3764.f13623) {
                    return null;
                }
                LinkedHashMap linkedHashMap = f62248;
                C6587 c6588 = (C6587) linkedHashMap.get(str);
                if (c6588 == null || c6588.f22202) {
                    C6587 c6589 = new C6587(str, inetAddress);
                    linkedHashMap.put(str, c6589);
                    c6587 = c6589;
                    c0942 = null;
                } else if (c6588.f22198) {
                    try {
                        obj.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return null;
                    }
                } else {
                    Object obj2 = c6588.f22197;
                    if (obj2 == null) {
                        runnableC17089 = null;
                    } else {
                        C7999 c7999 = f62247;
                        c6588.f22197 = null;
                        runnableC17089 = new RunnableC17088(c7999, obj2);
                    }
                    c6588.f22203++;
                    c0942 = new C0942(c6588);
                    c3764.f13625.add(c0942);
                    c6587 = null;
                    runnableC17088 = runnableC17089;
                }
            }
            if (runnableC17088 != null) {
                runnableC17088.run();
            }
            if (c0942 != null) {
                return c0942;
            }
            if (c6587 != null) {
                return m44257(c3764, c6587);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0942 m44257(C3764 c3764, C6587 c6587) {
        C22823 c22823;
        boolean z;
        C0942 c0942;
        RunnableC5799 runnableC5799;
        RunnableC17088 runnableC17088;
        try {
            C11527 c11527 = f62250;
            InetAddress inetAddress = c6587.f22200;
            c11527.getClass();
            if (inetAddress == null) {
                c22823 = new C22823(null);
            } else {
                c22823 = new C22823(inetAddress);
            }
            C2353 c2353 = new C2353(c22823);
            Object obj = f62249;
            synchronized (obj) {
                z = true;
                if (f62248.get(c6587.f22199) != c6587 || c6587.f22202) {
                    c0942 = null;
                    runnableC5799 = null;
                } else {
                    c6587.f22205 = c2353;
                    c6587.f22198 = false;
                    obj.notifyAll();
                    if (!c3764.f13623) {
                        c6587.f22203++;
                        c0942 = new C0942(c6587);
                        c3764.f13625.add(c0942);
                        runnableC5799 = null;
                    } else {
                        C7999 c7999 = f62247;
                        Object obj2 = c6587.f22197;
                        if (obj2 == null) {
                            runnableC17088 = null;
                        } else {
                            c6587.f22197 = null;
                            runnableC17088 = new RunnableC17088(c7999, obj2);
                        }
                        Object obj3 = new Object();
                        c6587.f22197 = obj3;
                        runnableC5799 = new RunnableC5799(runnableC17088, c7999, obj3, c6587);
                        c0942 = null;
                    }
                    z = false;
                }
                obj.notifyAll();
            }
            if (runnableC5799 != null) {
                runnableC5799.run();
            }
            if (c0942 != null) {
                return c0942;
            }
            if (z) {
                try {
                    c2353.m7141();
                } catch (IOException | RuntimeException unused) {
                }
            }
            return null;
        } catch (IOException | RuntimeException unused2) {
            Object obj4 = f62249;
            synchronized (obj4) {
                LinkedHashMap linkedHashMap = f62248;
                if (linkedHashMap.get(c6587.f22199) == c6587) {
                    linkedHashMap.remove(c6587.f22199);
                }
                obj4.notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44273(C12938 c12938, String[] strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            String str = strArr[i];
            if (!m44270(str)) {
                synchronized (f62249) {
                    if (!m44275(c12938)) {
                        m44277(c12938);
                        m44251(c12938);
                        return false;
                    }
                    c12938.f43004.add(str);
                    try {
                        ((C2353) c12938.f43009.f22205).m7142(str, c12938.f43008);
                    } catch (RuntimeException unused) {
                        z = false;
                    }
                    boolean zM44272 = m44272(c12938, str, z);
                    if (!z || zM44272) {
                        try {
                            ((C2353) c12938.f43009.f22205).m7143(str, c12938.f43008);
                        } catch (RuntimeException unused2) {
                        }
                    }
                    if (!z || zM44272) {
                        m44277(c12938);
                        m44251(c12938);
                        return false;
                    }
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44272(C12938 c12938, String str, boolean z) {
        synchronized (f62249) {
            c12938.f43004.remove(str);
            if (!z) {
                return false;
            }
            if (!m44275(c12938)) {
                return true;
            }
            c12938.f43007.add(str);
            return false;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m44277(C12938 c12938) {
        synchronized (f62249) {
            c12938.f43005 = false;
            c12938.f43006.f13624.remove(c12938);
        }
        m44274(c12938);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m44251(C12938 c12938) {
        C0942 c0942;
        synchronized (f62249) {
            Iterator it = c12938.f43006.f13625.iterator();
            do {
                if (!it.hasNext()) {
                    c0942 = null;
                    break;
                }
                c0942 = (C0942) it.next();
            } while (c0942.f3746 != c12938.f43009);
        }
        if (c0942 != null) {
            m44276(c0942);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m44274(C12938 c12938) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        synchronized (f62249) {
            linkedHashSet.addAll(c12938.f43004);
            linkedHashSet.addAll(c12938.f43007);
            c12938.f43004.clear();
            c12938.f43007.clear();
        }
        for (String str : linkedHashSet) {
            try {
                ((C2353) c12938.f43009.f22205).m7143(str, c12938.f43008);
            } catch (RuntimeException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14267 m44260(C12938 c12938, AbstractC17364 abstractC17364, C13644 c13644) {
        synchronized (f62249) {
            String strMo40397 = abstractC17364.mo40397();
            if (!(m44275(c12938) && (c12938.f43004.contains(strMo40397) || c12938.f43007.contains(strMo40397)))) {
                return null;
            }
            String str = c12938.f43003;
            String strMo40398 = abstractC17364.mo40397();
            AbstractC11015 abstractC11015Mo40399 = abstractC17364.mo40399();
            String strM44254 = m44254(str, strMo40398, abstractC11015Mo40399 == null ? null : abstractC11015Mo40399.mo1655(), abstractC17364.getName());
            String strM44255 = m44254(c12938.f43003, abstractC17364.mo40397(), (String) null, abstractC17364.getName());
            String strMo40399 = abstractC17364.mo40397();
            f62245.getClass();
            C14267 c14267 = new C14267(strMo40399, strM44254, strM44255, c13644, SystemClock.uptimeMillis());
            C14267 c14268 = (C14267) c12938.f43009.f22204.put(strM44254, c14267);
            if (c14268 != null) {
                C6587 c6587 = c12938.f43009;
                String str2 = c14268.f46693;
                String str3 = c14268.f46695;
                LinkedHashSet linkedHashSet = (LinkedHashSet) c6587.f22201.get(str2);
                if (linkedHashSet != null) {
                    linkedHashSet.remove(str3);
                    if (linkedHashSet.isEmpty()) {
                        c6587.f22201.remove(str2);
                    }
                }
            }
            C6587 c6588 = c12938.f43009;
            LinkedHashSet linkedHashSet2 = (LinkedHashSet) c6588.f22201.get(strM44255);
            if (linkedHashSet2 == null) {
                linkedHashSet2 = new LinkedHashSet();
                c6588.f22201.put(strM44255, linkedHashSet2);
            }
            linkedHashSet2.add(strM44254);
            return c14267;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44271(C12938 c12938, String str, String str2, String str3) {
        synchronized (f62249) {
            if (!(m44275(c12938) && (c12938.f43004.contains(str) || c12938.f43007.contains(str)))) {
                return false;
            }
            m44266(c12938.f43009, str2);
            LinkedHashSet linkedHashSet = (LinkedHashSet) c12938.f43009.f22201.remove(str3);
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    m44266(c12938.f43009, (String) it.next());
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m44255(C6587 c6587, String[] strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : strArr) {
            if (!m44270(str)) {
                linkedHashSet.add(str);
            }
        }
        ArrayList arrayList = new ArrayList();
        f62245.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (f62249) {
            ArrayList arrayList2 = new ArrayList();
            for (C14267 c14267 : c6587.f22204.values()) {
                if (jUptimeMillis - c14267.f46692 > 120000) {
                    arrayList2.add(c14267.f46695);
                } else if (linkedHashSet.contains(c14267.f46694)) {
                    arrayList.add(c14267);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                m44266(c6587, (String) it.next());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m44275(C12938 c12938) {
        if (!c12938.f43005 || c12938.f43006.f13623 || c12938.f43009.f22198 || c12938.f43009.f22202) {
            return false;
        }
        return f62248.get(c12938.f43009.f22199) == c12938.f43009;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m44276(C0942 c0942) {
        synchronized (f62249) {
            if (c0942.f3745) {
                return;
            }
            c0942.f3745 = true;
            C6587 c6587 = c0942.f3746;
            if (c6587.f22203 > 0) {
                c6587.f22203--;
            }
            RunnableC5799 runnableC5799 = null;
            RunnableC17088 runnableC17088 = null;
            runnableC5799 = null;
            runnableC5799 = null;
            runnableC5799 = null;
            if (c6587.f22203 == 0 && !c6587.f22198 && !c6587.f22202 && f62248.get(c6587.f22199) == c6587) {
                C7999 c7999 = f62247;
                Object obj = c6587.f22197;
                if (obj != null) {
                    c6587.f22197 = null;
                    runnableC17088 = new RunnableC17088(c7999, obj);
                }
                Object obj2 = new Object();
                c6587.f22197 = obj2;
                runnableC5799 = new RunnableC5799(runnableC17088, c7999, obj2, c6587);
            }
            if (runnableC5799 != null) {
                runnableC5799.run();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44265(C6587 c6587, Object obj) {
        Object obj2 = f62249;
        synchronized (obj2) {
            LinkedHashMap linkedHashMap = f62248;
            if (linkedHashMap.get(c6587.f22199) == c6587 && c6587.f22203 == 0 && c6587.f22197 == obj && !c6587.f22198 && !c6587.f22202) {
                c6587.f22202 = true;
                c6587.f22197 = null;
                c6587.f22204.clear();
                c6587.f22201.clear();
                linkedHashMap.remove(c6587.f22199);
                InterfaceC22110 interfaceC22110 = c6587.f22205;
                obj2.notifyAll();
                if (interfaceC22110 == null) {
                    return;
                }
                try {
                    ((C2353) interfaceC22110).m7141();
                } catch (IOException | RuntimeException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44266(C6587 c6587, String str) {
        C14267 c14267 = (C14267) c6587.f22204.remove(str);
        if (c14267 == null) {
            return;
        }
        String str2 = c14267.f46693;
        String str3 = c14267.f46695;
        LinkedHashSet linkedHashSet = (LinkedHashSet) c6587.f22201.get(str2);
        if (linkedHashSet == null) {
            return;
        }
        linkedHashSet.remove(str3);
        if (linkedHashSet.isEmpty()) {
            c6587.f22201.remove(str2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13644 m44258(AbstractC11015 abstractC11015) {
        String hostAddress;
        int iIndexOf;
        if (abstractC11015 == null) {
            return null;
        }
        String name = abstractC11015.getName();
        if (name != null && (iIndexOf = name.indexOf(46)) != -1) {
            name = name.substring(0, iIndexOf);
        }
        Inet4Address inet4AddressMo1637 = abstractC11015.mo1637();
        if (inet4AddressMo1637 != null) {
            hostAddress = inet4AddressMo1637.getHostAddress();
        } else {
            Inet6Address inet6AddressMo1675 = abstractC11015.mo1675();
            if (inet6AddressMo1675 == null) {
                return null;
            }
            hostAddress = inet6AddressMo1675.getHostAddress();
        }
        if (m44270(name)) {
            name = hostAddress;
        }
        return new C13644(name, abstractC11015.mo1676(), hostAddress, abstractC11015.mo1657());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44267(C9328 c9328, AtomicInteger atomicInteger, ArrayList arrayList, C15055 c15055, InterfaceC22816 interfaceC22816, InterfaceC21404 interfaceC21404) {
        int andIncrement;
        while (!c9328.m23985() && (andIncrement = atomicInteger.getAndIncrement()) < arrayList.size()) {
            try {
                C13644 c13644M44259 = m44259(c15055, interfaceC22816, interfaceC21404, (String) arrayList.get(andIncrement));
                if (c13644M44259 != null) {
                    C9328.m23984(c9328, c13644M44259);
                }
            } finally {
                C9328.m23987(c9328);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13644 m44259(C15055 c15055, InterfaceC22816 interfaceC22816, InterfaceC21404 interfaceC21404, String str) {
        int i = c15055.f49062;
        try {
            Socket socket = new Socket();
            try {
                socket.connect(new InetSocketAddress(InetAddress.getByName(str), i), 800);
                socket.close();
                try {
                    String strMo1595 = interfaceC22816.mo1595(str);
                    if (strMo1595 != null) {
                        return new C13644(strMo1595, c15055.f49062, str, strMo1595);
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
            if (interfaceC21404 != null) {
                ((C2976) interfaceC21404).m8868(c15055.f49062, str);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m44278(String str) {
        if (m44270(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        return lowerCase.equals("lo") || lowerCase.contains("rmnet") || lowerCase.equals("br") || lowerCase.matches("br\\d+") || lowerCase.startsWith("br-") || lowerCase.startsWith("br_") || lowerCase.startsWith("ccmni") || lowerCase.startsWith("pdp") || lowerCase.startsWith("wwan") || lowerCase.startsWith("ppp") || lowerCase.startsWith("dummy") || lowerCase.startsWith("ifb") || lowerCase.startsWith("veth") || lowerCase.startsWith("virbr") || lowerCase.startsWith("docker") || lowerCase.startsWith("vbox") || lowerCase.startsWith("vmnet") || lowerCase.startsWith("sit") || lowerCase.startsWith("ip6tnl") || lowerCase.startsWith("gre") || lowerCase.startsWith("gretap") || lowerCase.startsWith("vti") || lowerCase.startsWith("clat") || lowerCase.startsWith("v4-") || lowerCase.startsWith("tun") || lowerCase.startsWith("tap") || lowerCase.startsWith("utun") || lowerCase.startsWith("vpn") || lowerCase.startsWith("wg") || lowerCase.startsWith("ipsec") || lowerCase.startsWith("l2tp") || lowerCase.startsWith("tailscale") || lowerCase.startsWith("zt");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m44254(String str, String str2, String str3, String str4) {
        if (m44270(str3)) {
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
    public static long m44252(Inet4Address inet4Address) {
        byte[] address = inet4Address.getAddress();
        return ((((long) address[0]) & 255) << 24) | ((((long) address[1]) & 255) << 16) | ((((long) address[2]) & 255) << 8) | (255 & ((long) address[3]));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44270(String str) {
        return str == null || str.isEmpty();
    }
}
