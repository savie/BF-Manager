package l;

import android.os.SystemClock;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۠᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7B2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8377 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f29079 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C6965 f29084;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f29085;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C15433 f29086;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f29087;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object f29088;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f29089;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C0219 f29090;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ScheduledExecutorService f29091;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f29092;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final long f29080 = TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final long f29083 = TimeUnit.MINUTES.toMillis(10);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final byte[] f29082 = {0};

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f29081 = new AtomicInteger();

    public C8377(ServiceC4538 serviceC4538) {
        C6965 c6965 = new C6965(serviceC4538.getApplicationContext(), new C0219());
        C15433 c15433 = new C15433();
        C0219 c0219 = new C0219();
        this.f29088 = new Object();
        this.f29087 = new LinkedHashMap();
        this.f29084 = c6965;
        this.f29086 = c15433;
        this.f29090 = c0219;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22002() {
        synchronized (this.f29088) {
            if (this.f29092) {
                return;
            }
            this.f29092 = true;
            final long j = this.f29085 + 1;
            this.f29085 = j;
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC21782());
            this.f29091 = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            this.f29089 = scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleWithFixedDelay(new Runnable() { // from class: l.ۘ᩵ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C8377.m21992(this.f15149, j);
                }
            }, 0L, f29080, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22004() {
        ScheduledExecutorService scheduledExecutorService;
        synchronized (this.f29088) {
            this.f29092 = false;
            this.f29085++;
            this.f29087.clear();
            ScheduledFuture scheduledFuture = this.f29089;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.f29089 = null;
            }
            scheduledExecutorService = this.f29091;
            this.f29091 = null;
        }
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21992(C8377 c8377, long j) {
        C18960 c18960;
        if (c8377.m21993(j)) {
            try {
                c18960 = c8377.f29084.m18717();
            } catch (RuntimeException unused) {
                c18960 = new C18960(null, null, null, Collections.EMPTY_LIST);
            }
            C18960 c18961 = c18960;
            c8377.f29090.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (c18961.f61396 != null) {
                ArrayList<InetAddress> arrayListM21991 = c8377.m21991(c18961, jElapsedRealtime);
                if (c18961.f61397 != null && c8377.m21993(j)) {
                    try {
                        c8377.f29086.m36915(c18961.f61396, c18961.f61397);
                    } catch (IOException | RuntimeException unused2) {
                    }
                }
                if (c18961.f61395 != null && c8377.m21993(j)) {
                    try {
                        c8377.f29086.m36915(c18961.f61396, c18961.f61395);
                    } catch (IOException | RuntimeException unused3) {
                    }
                }
                for (InetAddress inetAddress : arrayListM21991) {
                    if (!c8377.m21993(j)) {
                        return;
                    }
                    try {
                        c8377.f29086.m36915(c18961.f61396, inetAddress);
                    } catch (IOException | RuntimeException unused4) {
                    }
                }
                return;
            }
            synchronized (c8377.f29088) {
                Iterator it = c8377.f29087.entrySet().iterator();
                while (it.hasNext()) {
                    if (jElapsedRealtime - ((C23194) ((Map.Entry) it.next()).getValue()).f75261 > f29083) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m21991(C18960 c18960, long j) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f29088) {
            Iterator it = this.f29087.entrySet().iterator();
            while (it.hasNext()) {
                C23194 c23194 = (C23194) ((Map.Entry) it.next()).getValue();
                if (j - c23194.f75261 <= f29083) {
                    InetAddress inetAddress = c23194.f75260;
                    boolean zIsSiteLocalAddress = false;
                    if (m21989(inetAddress)) {
                        if (!c18960.f61394.isEmpty()) {
                            Iterator it2 = c18960.f61394.iterator();
                            while (it2.hasNext()) {
                                if (((C18254) it2.next()).m42446(inetAddress)) {
                                    zIsSiteLocalAddress = true;
                                    break;
                                }
                            }
                        } else {
                            zIsSiteLocalAddress = inetAddress.isSiteLocalAddress();
                        }
                    }
                    if (zIsSiteLocalAddress) {
                        arrayList.add(c23194.f75260);
                    }
                }
                it.remove();
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m21993(long j) {
        boolean z;
        synchronized (this.f29088) {
            z = this.f29092 && this.f29085 == j;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m21996() {
        while (true) {
            LinkedHashMap linkedHashMap = this.f29087;
            if (linkedHashMap.size() <= 8) {
                return;
            }
            String str = null;
            long j = C17492.FOREVER_NS;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((C23194) entry.getValue()).f75261 < j) {
                    j = ((C23194) entry.getValue()).f75261;
                    str = (String) entry.getKey();
                }
            }
            if (str == null) {
                return;
            } else {
                linkedHashMap.remove(str);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22003(String str) throws UnknownHostException {
        InetAddress byAddress;
        if (str != null) {
            String strTrim = str.trim();
            if (!strTrim.isEmpty()) {
                String[] strArrSplit = strTrim.split("\\.", -1);
                if (strArrSplit.length == 4) {
                    byte[] bArr = new byte[4];
                    int i = 0;
                    while (true) {
                        if (i < strArrSplit.length) {
                            try {
                                int i2 = Integer.parseInt(strArrSplit[i]);
                                if (i2 >= 0 && i2 <= 255) {
                                    bArr[i] = (byte) i2;
                                    i++;
                                }
                            } catch (NumberFormatException | UnknownHostException unused) {
                            }
                        } else {
                            byAddress = InetAddress.getByAddress(bArr);
                            if (!m21989(byAddress)) {
                                break;
                            } else {
                                break;
                            }
                        }
                        byAddress = null;
                        break;
                    }
                }
                byAddress = null;
                break;
            }
            byAddress = null;
            break;
        }
        byAddress = null;
        break;
        if (byAddress == null) {
            return;
        }
        this.f29090.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String hostAddress = byAddress.getHostAddress();
        synchronized (this.f29088) {
            C23194 c23194 = (C23194) this.f29087.get(hostAddress);
            if (c23194 == null) {
                this.f29087.put(hostAddress, new C23194(byAddress, jElapsedRealtime));
            } else {
                c23194.f75261 = jElapsedRealtime;
            }
            m21996();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m21989(InetAddress inetAddress) {
        return (!(inetAddress instanceof Inet4Address) || inetAddress.isAnyLocalAddress() || inetAddress.isLoopbackAddress() || inetAddress.isMulticastAddress() || inetAddress.isLinkLocalAddress() || m21998(inetAddress)) ? false : true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m21998(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        return address.length == 4 && (address[0] & 255) == 255 && (address[1] & 255) == 255 && (address[2] & 255) == 255 && (address[3] & 255) == 255;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m21994(InetAddress inetAddress) {
        return (!(inetAddress instanceof Inet4Address) || inetAddress.isAnyLocalAddress() || inetAddress.isLoopbackAddress() || inetAddress.isMulticastAddress() || inetAddress.isLinkLocalAddress() || m21998(inetAddress)) ? false : true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static InetAddress m21997(int i) {
        return m22001(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InetAddress m22001(int i) {
        if (i == 0) {
            return null;
        }
        try {
            return InetAddress.getByAddress(new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)});
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m21987(int i) {
        int iM21995;
        int iBitCount;
        InetAddress inetAddressM22001 = m22001(i);
        if (!(inetAddressM22001 instanceof Inet4Address) || (iBitCount = Integer.bitCount((iM21995 = m21995(inetAddressM22001)))) == 0) {
            return -1;
        }
        if (iM21995 == (iBitCount == 32 ? -1 : (int) (4294967295 << (32 - iBitCount)))) {
            return iBitCount;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int m21995(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        if (address.length != 4) {
            return 0;
        }
        return (address[3] & 255) | ((address[0] & 255) << 24) | ((address[1] & 255) << 16) | ((address[2] & 255) << 8);
    }
}
