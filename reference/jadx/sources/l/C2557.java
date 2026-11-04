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

/* JADX INFO: renamed from: l.ۖۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7B2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2557 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f8211 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18965 f8216;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f8217;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C13921 f8218;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f8219;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C0320 f8220;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f8221;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Object f8222;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ScheduledExecutorService f8223;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f8224;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final long f8213 = TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final long f8215 = TimeUnit.MINUTES.toMillis(10);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final byte[] f8214 = {0};

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f8212 = new AtomicInteger();

    public C2557(ServiceC3107 serviceC3107) {
        int i = 1;
        C0320 c0320 = new C0320(serviceC3107.getApplicationContext(), new C13921(i));
        C18965 c18965 = new C18965();
        C13921 c13921 = new C13921(i);
        this.f8222 = new Object();
        this.f8217 = new LinkedHashMap();
        this.f8220 = c0320;
        this.f8216 = c18965;
        this.f8218 = c13921;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8588() {
        synchronized (this.f8222) {
            if (this.f8221) {
                return;
            }
            this.f8221 = true;
            final long j = this.f8224 + 1;
            this.f8224 = j;
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC10014());
            this.f8223 = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            this.f8219 = scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleWithFixedDelay(new Runnable() { // from class: l.ܿۡۧ
                @Override // java.lang.Runnable
                public final void run() {
                    C2557.m8575(this.f59477, j);
                }
            }, 0L, f8213, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8590() {
        ScheduledExecutorService scheduledExecutorService;
        synchronized (this.f8222) {
            this.f8221 = false;
            this.f8224++;
            this.f8217.clear();
            ScheduledFuture scheduledFuture = this.f8219;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.f8219 = null;
            }
            scheduledExecutorService = this.f8223;
            this.f8223 = null;
        }
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8575(C2557 c2557, long j) {
        C9268 c9268;
        if (c2557.m8576(j)) {
            try {
                c9268 = c2557.f8220.m2014();
            } catch (RuntimeException unused) {
                c9268 = new C9268(null, null, null, Collections.EMPTY_LIST);
            }
            C9268 c9269 = c9268;
            c2557.f8218.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (c9269.f30146 != null) {
                ArrayList<InetAddress> arrayListM8574 = c2557.m8574(c9269, jElapsedRealtime);
                if (c9269.f30147 != null && c2557.m8576(j)) {
                    try {
                        c2557.f8216.m44054(c9269.f30146, c9269.f30147);
                    } catch (IOException | RuntimeException unused2) {
                    }
                }
                if (c9269.f30145 != null && c2557.m8576(j)) {
                    try {
                        c2557.f8216.m44054(c9269.f30146, c9269.f30145);
                    } catch (IOException | RuntimeException unused3) {
                    }
                }
                for (InetAddress inetAddress : arrayListM8574) {
                    if (!c2557.m8576(j)) {
                        return;
                    }
                    try {
                        c2557.f8216.m44054(c9269.f30146, inetAddress);
                    } catch (IOException | RuntimeException unused4) {
                    }
                }
                return;
            }
            synchronized (c2557.f8222) {
                Iterator it = c2557.f8217.entrySet().iterator();
                while (it.hasNext()) {
                    if (jElapsedRealtime - ((C7778) ((Map.Entry) it.next()).getValue()).f25587 > f8215) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m8574(C9268 c9268, long j) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f8222) {
            Iterator it = this.f8217.entrySet().iterator();
            while (it.hasNext()) {
                C7778 c7778 = (C7778) ((Map.Entry) it.next()).getValue();
                if (j - c7778.f25587 <= f8215) {
                    InetAddress inetAddress = c7778.f25586;
                    boolean zIsSiteLocalAddress = false;
                    if (m8587(inetAddress)) {
                        if (!c9268.f30148.isEmpty()) {
                            Iterator it2 = c9268.f30148.iterator();
                            while (it2.hasNext()) {
                                if (((C1066) it2.next()).m4003(inetAddress)) {
                                    zIsSiteLocalAddress = true;
                                    break;
                                }
                            }
                        } else {
                            zIsSiteLocalAddress = inetAddress.isSiteLocalAddress();
                        }
                    }
                    if (zIsSiteLocalAddress) {
                        arrayList.add(c7778.f25586);
                    }
                }
                it.remove();
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m8576(long j) {
        boolean z;
        synchronized (this.f8222) {
            z = this.f8221 && this.f8224 == j;
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m8582() {
        while (true) {
            LinkedHashMap linkedHashMap = this.f8217;
            if (linkedHashMap.size() <= 8) {
                return;
            }
            String str = null;
            long j = C25227.FOREVER_NS;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((C7778) entry.getValue()).f25587 < j) {
                    j = ((C7778) entry.getValue()).f25587;
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
    public final void m8589(String str) throws UnknownHostException {
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
                            if (!m8587(byAddress)) {
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
        this.f8218.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String hostAddress = byAddress.getHostAddress();
        synchronized (this.f8222) {
            C7778 c7778 = (C7778) this.f8217.get(hostAddress);
            if (c7778 == null) {
                this.f8217.put(hostAddress, new C7778(byAddress, jElapsedRealtime));
            } else {
                c7778.f25587 = jElapsedRealtime;
            }
            m8582();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m8587(InetAddress inetAddress) {
        return (!(inetAddress instanceof Inet4Address) || inetAddress.isAnyLocalAddress() || inetAddress.isLoopbackAddress() || inetAddress.isMulticastAddress() || inetAddress.isLinkLocalAddress() || m8579(inetAddress)) ? false : true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m8579(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        return address.length == 4 && (address[0] & 255) == 255 && (address[1] & 255) == 255 && (address[2] & 255) == 255 && (address[3] & 255) == 255;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m8577(InetAddress inetAddress) {
        return (!(inetAddress instanceof Inet4Address) || inetAddress.isAnyLocalAddress() || inetAddress.isLoopbackAddress() || inetAddress.isMulticastAddress() || inetAddress.isLinkLocalAddress() || m8579(inetAddress)) ? false : true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static InetAddress m8578(int i) {
        return m8584(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InetAddress m8584(int i) {
        if (i == 0) {
            return null;
        }
        try {
            return InetAddress.getByAddress(new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)});
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m8585(int i) {
        int iM8581;
        int iBitCount;
        InetAddress inetAddressM8584 = m8584(i);
        if (!(inetAddressM8584 instanceof Inet4Address) || (iBitCount = Integer.bitCount((iM8581 = m8581(inetAddressM8584)))) == 0) {
            return -1;
        }
        if (iM8581 == (iBitCount == 32 ? -1 : (int) (4294967295 << (32 - iBitCount)))) {
            return iBitCount;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int m8581(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        if (address.length != 4) {
            return 0;
        }
        return (address[3] & 255) | ((address[0] & 255) << 24) | ((address[1] & 255) << 16) | ((address[2] & 255) << 8);
    }
}
