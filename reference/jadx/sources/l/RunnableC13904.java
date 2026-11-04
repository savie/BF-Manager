package l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.۬ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0A0C */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC13904 implements Runnable, InterfaceC17810 {

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f44088 = C16980.m40037(RunnableC13904.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f44089;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C22308 f44090;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f44091;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public HashMap f44092;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f44093;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public DatagramPacket f44094;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public DatagramPacket f44095;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f44096;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C7939 f44097;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public DatagramSocket f44098;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public C19126 f44099;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ArrayList f44100;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f44101;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public C22308 f44102;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InetAddress f44103;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashSet f44104;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public C0657 f44105;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HashMap f44106;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f44107;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public Thread f44108;

    public RunnableC13904(C0657 c0657) {
        InetAddress byName;
        c0657.mo2875().getClass();
        c0657.mo2875().getClass();
        this.f44101 = new Object();
        this.f44096 = 0;
        HashMap map = new HashMap();
        this.f44106 = map;
        this.f44104 = new HashSet();
        this.f44092 = new HashMap();
        this.f44091 = 0;
        this.f44100 = new ArrayList();
        this.f44097 = new C7939();
        this.f44105 = c0657;
        InetAddress inetAddressM35736 = ((C14826) c0657.mo2875()).m35736();
        this.f44103 = inetAddressM35736;
        byte[] bArr = new byte[((C14826) c0657.mo2875()).m35698()];
        this.f44107 = bArr;
        byte[] bArr2 = new byte[((C14826) c0657.mo2875()).m35724()];
        this.f44093 = bArr2;
        this.f44095 = new DatagramPacket(bArr, ((C14826) c0657.mo2875()).m35698(), inetAddressM35736, 137);
        this.f44094 = new DatagramPacket(bArr2, ((C14826) c0657.mo2875()).m35724());
        this.f44100 = ((C14826) c0657.mo2875()).m35702();
        C19126 c19126 = new C19126(c0657.mo2875(), "0.0.0.0", 0, null);
        this.f44099 = c19126;
        C22308 c22308 = new C22308(c19126, 0);
        this.f44102 = c22308;
        map.put(c19126, new C2718(c22308, -1L));
        c0657.mo2875().getClass();
        try {
            try {
                byName = InetAddress.getLocalHost();
            } catch (UnknownHostException e) {
                throw new C3640(e);
            }
        } catch (UnknownHostException unused) {
            byName = InetAddress.getByName("127.0.0.1");
        }
        c0657.mo2875().getClass();
        byte[] address = byName.getAddress();
        String str = "JCIFS" + (address[2] & 255) + "_" + (address[3] & 255) + "_" + C6033.m17503((int) (Math.random() * 255.0d), 2);
        InterfaceC5878 interfaceC5878Mo2875 = c0657.mo2875();
        c0657.mo2875().getClass();
        C19126 c19127 = new C19126(interfaceC5878Mo2875, str, 0, null);
        C22308 c22309 = new C22308(c19127, byName.hashCode(), 0);
        this.f44090 = c22309;
        m33880(c19127, c22309, -1L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22308 m33875(C19126 c19126) throws UnknownHostException {
        C22308 c22308M33876;
        C22308 c22308M33889 = null;
        InetAddress inetAddress = c19126.f61898 == 29 ? this.f44103 : null;
        c19126.f61897 = inetAddress != null ? inetAddress.hashCode() : 0;
        C22308 c22308M338810 = m33889(c19126);
        if (c22308M338810 == null) {
            synchronized (this.f44104) {
                if (!this.f44104.contains(c19126)) {
                    this.f44104.add(c19126);
                } else {
                    while (this.f44104.contains(c19126)) {
                        try {
                            this.f44104.wait();
                        } catch (InterruptedException e) {
                            f44088.mo13722("Interrupted", (Exception) e);
                        }
                    }
                    c22308M33889 = m33889(c19126);
                    if (c22308M33889 == null) {
                        synchronized (this.f44104) {
                            this.f44104.add(c19126);
                        }
                    }
                }
            }
            try {
                if (c22308M33889 == null) {
                    try {
                        c22308M33876 = m33876(c19126, inetAddress);
                    } catch (UnknownHostException unused) {
                        c22308M33876 = this.f44102;
                    }
                    c22308M338810 = c22308M33876;
                    m33879(c19126, c22308M338810);
                    m33871(c19126);
                } else {
                    c22308M338810 = c22308M33889;
                }
            } catch (Throwable th) {
                m33879(c19126, c22308M33889);
                m33871(c19126);
                throw th;
            }
        }
        if (c22308M338810 != this.f44102) {
            return c22308M338810;
        }
        throw new UnknownHostException(c19126.toString());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m33871(C19126 c19126) {
        synchronized (this.f44104) {
            this.f44104.remove(c19126);
            this.f44104.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33879(C19126 c19126, C22308 c22308) {
        C0657 c0657 = this.f44105;
        if (((C14826) c0657.mo2875()).m35704() == 0) {
            return;
        }
        m33880(c19126, c22308, ((C14826) c0657.mo2875()).m35704() != -1 ? System.currentTimeMillis() + ((long) (((C14826) c0657.mo2875()).m35704() * 1000)) : -1L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33880(C19126 c19126, C22308 c22308, long j) {
        if (((C14826) this.f44105.mo2875()).m35704() == 0) {
            return;
        }
        synchronized (this.f44106) {
            C2718 c2718 = (C2718) this.f44106.get(c19126);
            if (c2718 == null) {
                this.f44106.put(c19126, new C2718(c22308, j));
            } else {
                c2718.f9077 = c22308;
                c2718.f9078 = j;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33881(C22308[] c22308Arr) {
        if (((C14826) this.f44105.mo2875()).m35704() == 0) {
            return;
        }
        long jCurrentTimeMillis = ((C14826) this.f44105.mo2875()).m35704() != -1 ? System.currentTimeMillis() + ((long) (((C14826) this.f44105.mo2875()).m35704() * 1000)) : -1L;
        synchronized (this.f44106) {
            for (int i = 0; i < c22308Arr.length; i++) {
                C2718 c2718 = (C2718) this.f44106.get(c22308Arr[i].f72221);
                if (c2718 == null) {
                    C22308 c22308 = c22308Arr[i];
                    this.f44106.put(c22308.f72221, new C2718(c22308, jCurrentTimeMillis));
                } else {
                    c2718.f9077 = c22308Arr[i];
                    c2718.f9078 = jCurrentTimeMillis;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22308 m33889(C19126 c19126) {
        C22308 c22308;
        if (((C14826) this.f44105.mo2875()).m35704() == 0) {
            return null;
        }
        synchronized (this.f44106) {
            C2718 c2718 = (C2718) this.f44106.get(c19126);
            if (c2718 != null && c2718.f9078 < System.currentTimeMillis() && c2718.f9078 >= 0) {
                c2718 = null;
            }
            c22308 = c2718 != null ? c2718.f9077 : null;
        }
        return c22308;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33877(int i) {
        this.f44089 = 0;
        C0657 c0657 = this.f44105;
        if (((C14826) c0657.mo2875()).m35712() != 0) {
            this.f44089 = Math.max(((C14826) c0657.mo2875()).m35712(), i);
        }
        if (this.f44098 == null) {
            this.f44098 = new DatagramSocket(0, null);
            Thread thread = new Thread(this, "JCIFS-NameServiceClient");
            this.f44108 = thread;
            thread.setDaemon(true);
            this.f44108.start();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m33891() {
        synchronized (this.f44101) {
            DatagramSocket datagramSocket = this.f44098;
            if (datagramSocket != null) {
                datagramSocket.close();
                this.f44098 = null;
            }
            this.f44108 = null;
            this.f44092.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (this.f44108 == Thread.currentThread()) {
            try {
                try {
                    this.f44094.setLength(((C14826) this.f44105.mo2875()).m35724());
                    this.f44098.setSoTimeout(this.f44089);
                    this.f44098.receive(this.f44094);
                    InterfaceC25186 interfaceC25186 = f44088;
                    interfaceC25186.mo13717("NetBIOS: new data read from socket");
                    AbstractC5154 abstractC5154 = (AbstractC5154) this.f44092.get(new Integer(AbstractC5154.m15571(0, this.f44093)));
                    if (abstractC5154 != null && !abstractC5154.f17961) {
                        synchronized (abstractC5154) {
                            abstractC5154.m15572(this.f44093);
                            abstractC5154.f17961 = true;
                            if (interfaceC25186.mo13713()) {
                                interfaceC25186.mo13717(abstractC5154.toString());
                                interfaceC25186.mo13717(C6033.m17504(this.f44093, 0, this.f44094.getLength()));
                            }
                            abstractC5154.notify();
                        }
                    }
                } catch (SocketTimeoutException e) {
                    f44088.mo13722("Socket timeout", (Exception) e);
                    m33891();
                    return;
                } catch (Exception e2) {
                    f44088.mo13702("Uncaught exception in NameServiceClient", (Throwable) e2);
                    m33891();
                    return;
                }
            } catch (Throwable th) {
                m33891();
                throw th;
            }
        }
        m33891();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00e3 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m33878(l.AbstractC5154 r18, l.AbstractC5154 r19, int r20) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.RunnableC13904.m33878(l.ۙ᩶᩵, l.ۙ᩶᩵, int):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22308 m33876(C19126 c19126, InetAddress inetAddress) throws UnknownHostException {
        C0657 c0657 = this.f44105;
        C10175 c10175 = new C10175(c0657.mo2875(), c19126);
        C1227 c1227 = new C1227(c0657.mo2875());
        InetAddress inetAddress2 = this.f44103;
        InterfaceC25186 interfaceC25186 = f44088;
        if (inetAddress != null) {
            c10175.f17979 = inetAddress;
            c10175.f17959 = inetAddress.equals(inetAddress2) || inetAddress.getAddress()[3] == -1;
            int iM35735 = ((C14826) c0657.mo2875()).m35735();
            do {
                try {
                    m33878(c10175, c1227, ((C14826) c0657.mo2875()).m35730());
                    if (!c1227.f17961 || c1227.f17958 != 0) {
                        iM35735--;
                        if (iM35735 <= 0) {
                            break;
                        }
                    } else {
                        C22308[] c22308Arr = c1227.f17966;
                        int length = c22308Arr.length - 1;
                        c22308Arr[length].f72221.f61897 = inetAddress.hashCode();
                        return c1227.f17966[length];
                    }
                } catch (InterruptedIOException e) {
                    if (interfaceC25186.mo13713()) {
                        interfaceC25186.mo13722("Timeout waiting for response " + c19126.f61896, (Exception) e);
                    }
                    throw new UnknownHostException(c19126.f61896);
                } catch (IOException e2) {
                    interfaceC25186.mo13700("Failed to send nameservice request for " + c19126.f61896, (Exception) e2);
                    throw new UnknownHostException(c19126.f61896);
                }
            } while (c10175.f17959);
            throw new UnknownHostException(c19126.f61896);
        }
        for (EnumC23778 enumC23778 : this.f44100) {
            try {
                int i = C9429.f30586[enumC23778.ordinal()];
                if (i == 1) {
                    this.f44097.m21510(c0657);
                } else if (i == 2 || i == 3) {
                    if (enumC23778 == EnumC23778.RESOLVER_WINS && c19126.f61896 != "\u0001\u0002__MSBROWSE__\u0002" && c19126.f61898 != 29) {
                        c10175.f17979 = m33888();
                        c10175.f17959 = false;
                    } else {
                        c10175.f17979 = inetAddress2;
                        c10175.f17959 = true;
                    }
                    int iM35736 = ((C14826) c0657.mo2875()).m35735();
                    while (true) {
                        int i2 = iM35736 - 1;
                        if (iM35736 <= 0) {
                            break;
                        }
                        try {
                            m33878(c10175, c1227, ((C14826) c0657.mo2875()).m35730());
                            if (c1227.f17961 && c1227.f17958 == 0) {
                                c1227.f17966[0].f72221.f61897 = c10175.f17979.hashCode();
                                return c1227.f17966[0];
                            }
                            if (enumC23778 == EnumC23778.RESOLVER_WINS) {
                                break;
                            }
                            iM35736 = i2;
                        } catch (IOException e3) {
                            interfaceC25186.mo13700("Failed to send nameservice request for " + c19126.f61896, (Exception) e3);
                            throw new UnknownHostException(c19126.f61896);
                        }
                    }
                }
            } catch (IOException e4) {
                interfaceC25186.mo13711("Failed to lookup name", e4);
            }
        }
        throw new UnknownHostException(c19126.f61896);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22308[] m33886(C22308 c22308) throws UnknownHostException {
        C0657 c0657 = this.f44105;
        InterfaceC5878 interfaceC5878Mo2875 = c0657.mo2875();
        c22308.getClass();
        C20070 c20070 = new C20070(interfaceC5878Mo2875, C22308.class.isAssignableFrom(C22308.class) ? c22308 : null);
        InterfaceC5878 interfaceC5878Mo2876 = c0657.mo2875();
        int i = 0;
        C19126 c19126 = new C19126(c0657.mo2875(), "*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", 0, null);
        AbstractC5154 c23054 = new C23054(interfaceC5878Mo2876);
        c23054.f17968 = c19126;
        c23054.f17964 = 33;
        c23054.f17983 = false;
        c23054.f17959 = false;
        c23054.f17979 = InetAddress.getByName(c22308.mo28041());
        int iM35735 = ((C14826) c0657.mo2875()).m35735();
        while (true) {
            int i2 = iM35735 - 1;
            if (iM35735 > 0) {
                try {
                    m33878(c23054, c20070, ((C14826) c0657.mo2875()).m35730());
                    if (c20070.f17961 && c20070.f17958 == 0) {
                        int iHashCode = c23054.f17979.hashCode();
                        while (true) {
                            C22308[] c22308Arr = c20070.f64527;
                            if (i >= c22308Arr.length) {
                                return c22308Arr;
                            }
                            c22308Arr[i].f72221.f61897 = iHashCode;
                            i++;
                        }
                    } else {
                        iM35735 = i2;
                    }
                } catch (IOException e) {
                    f44088.mo13700("Failed to send node status request for " + c22308, (Exception) e);
                    throw new UnknownHostException(c22308.toString());
                }
            } else {
                throw new UnknownHostException(c22308.mo28044());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22308 m33874(int i, String str) {
        if (str != null && str.length() != 0) {
            C19126 c19126 = new C19126(this.f44105.mo2875(), str, i, null);
            if (!Character.isDigit(str.charAt(0))) {
                return m33875(c19126);
            }
            char[] charArray = str.toCharArray();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < charArray.length) {
                char c = charArray[i2];
                if (c < '0' || c > '9') {
                    return m33875(c19126);
                }
                int i5 = 0;
                while (c != '.') {
                    if (c < '0' || c > '9') {
                        return m33875(c19126);
                    }
                    i5 = ((i5 * 10) + c) - 48;
                    i2++;
                    if (i2 >= charArray.length) {
                        break;
                    }
                    c = charArray[i2];
                }
                if (i5 > 255) {
                    return m33875(c19126);
                }
                i4 = (i4 << 8) + i5;
                i3++;
                i2++;
            }
            if (i3 != 4 || str.endsWith(".")) {
                return m33875(c19126);
            }
            return new C22308(this.f44099, i4);
        }
        return this.f44090;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22308[] m33885(String str, int i, InetAddress inetAddress) throws UnknownHostException {
        C0657 c0657 = this.f44105;
        C19126 c19126 = new C19126(c0657.mo2875(), str, i, null);
        InterfaceC25186 interfaceC25186 = f44088;
        InterfaceC5878 interfaceC5878Mo2875 = c0657.mo2875();
        C10175 c10175 = new C10175(interfaceC5878Mo2875, c19126);
        C1227 c1227 = new C1227(interfaceC5878Mo2875);
        if (inetAddress == null) {
            inetAddress = m33888();
        }
        c10175.f17979 = inetAddress;
        InetAddress inetAddress2 = this.f44103;
        int iM35735 = 1;
        boolean z = inetAddress == null || inetAddress.equals(inetAddress2) || inetAddress.getAddress()[3] == -1;
        c10175.f17959 = z;
        if (z) {
            if (c10175.f17979 == null) {
                c10175.f17979 = inetAddress2;
            }
            iM35735 = ((C14826) interfaceC5878Mo2875).m35735();
        }
        do {
            try {
                m33878(c10175, c1227, ((C14826) interfaceC5878Mo2875).m35730());
                if (!c1227.f17961 || c1227.f17958 != 0) {
                    iM35735--;
                    if (iM35735 <= 0) {
                        break;
                    }
                } else {
                    return c1227.f17966;
                }
            } catch (InterruptedIOException e) {
                if (interfaceC25186.mo13713()) {
                    interfaceC25186.mo13722("Failed to send nameservice request for " + c19126.f61896, (Exception) e);
                }
                throw new UnknownHostException(c19126.f61896);
            } catch (IOException e2) {
                interfaceC25186.mo13700("Failed to send nameservice request for " + c19126.f61896, (Exception) e2);
                throw new UnknownHostException(c19126.f61896);
            }
        } while (c10175.f17959);
        throw new UnknownHostException(c19126.f61896);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC16318[] m33890(String str) {
        String str2;
        C22308 c22308M33874 = m33874(0, str);
        try {
            C22308[] c22308ArrM33886 = m33886(c22308M33874);
            m33881(c22308ArrM33886);
            return c22308ArrM33886;
        } catch (UnknownHostException unused) {
            StringBuilder sb = new StringBuilder("no name with type 0x");
            sb.append(C6033.m17503(c22308M33874.f72221.f61898, 2));
            String str3 = c22308M33874.f72221.f61899;
            if (str3 == null || str3.isEmpty()) {
                str2 = " with no scope";
            } else {
                str2 = " with scope " + c22308M33874.f72221.f61899;
            }
            sb.append(str2);
            sb.append(" for host ");
            sb.append(c22308M33874.mo28041());
            throw new UnknownHostException(sb.toString());
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InetAddress m33888() {
        C0657 c0657 = this.f44105;
        if (((C14826) c0657.mo2875()).m35733().length == 0) {
            return null;
        }
        return ((C14826) c0657.mo2875()).m35733()[this.f44096];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33882(InetAddress inetAddress) {
        int i = 0;
        while (inetAddress != null) {
            C0657 c0657 = this.f44105;
            if (i >= ((C14826) c0657.mo2875()).m35733().length) {
                break;
            }
            if (inetAddress.hashCode() == ((C14826) c0657.mo2875()).m35733()[i].hashCode()) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m33887() {
        int i = this.f44096 + 1;
        C0657 c0657 = this.f44105;
        this.f44096 = i < ((C14826) c0657.mo2875()).m35733().length ? this.f44096 + 1 : 0;
        if (((C14826) c0657.mo2875()).m35733().length == 0) {
            return;
        }
        InetAddress inetAddress = ((C14826) c0657.mo2875()).m35733()[this.f44096];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16318[] m33884(String str, InetAddress inetAddress) throws UnknownHostException {
        C7193 c7193 = new C7193();
        c7193.f23747 = 2;
        C8684 c8684 = new C8684(c7193, str, m33882(inetAddress) ? 27 : 29, inetAddress, this.f44105);
        C8684 c8685 = new C8684(c7193, str, 32, inetAddress, this.f44105);
        c8684.setDaemon(true);
        c8685.setDaemon(true);
        try {
            synchronized (c7193) {
                c8684.start();
                c8685.start();
                while (c7193.f23747 > 0 && c8684.m23375() == null && c8685.m23375() == null) {
                    c7193.wait();
                }
            }
            try {
                c8684.interrupt();
            } catch (SecurityException unused) {
            }
            try {
                c8684.join();
            } catch (InterruptedException unused2) {
            }
            try {
                c8685.interrupt();
            } catch (SecurityException unused3) {
            }
            try {
                c8685.join();
            } catch (InterruptedException unused4) {
            }
            if (c8684.m23375() != null) {
                return c8684.m23375();
            }
            if (c8685.m23375() != null) {
                return c8685.m23375();
            }
            throw c8684.m23376();
        } catch (InterruptedException unused5) {
            throw new UnknownHostException(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13357 m33872(String str) {
        return m33883(str, false)[0];
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0118 A[Catch: IOException -> 0x0156, TryCatch #1 {IOException -> 0x0156, blocks: (B:16:0x0060, B:24:0x0078, B:26:0x007e, B:28:0x0088, B:29:0x0090, B:31:0x0093, B:32:0x009f, B:34:0x00a7, B:36:0x00b1, B:37:0x00b4, B:38:0x00b9, B:39:0x00ba, B:40:0x00bf, B:41:0x00c0, B:45:0x00c9, B:56:0x0110, B:58:0x0118, B:59:0x0129, B:60:0x012d, B:62:0x0130, B:46:0x00da, B:47:0x00eb, B:49:0x00f3, B:53:0x00fd, B:54:0x0106, B:64:0x013d, B:65:0x0142, B:67:0x0150, B:71:0x0155, B:66:0x0143), top: B:80:0x0060, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0130 A[Catch: IOException -> 0x0156, LOOP:1: B:60:0x012d->B:62:0x0130, LOOP_END, TryCatch #1 {IOException -> 0x0156, blocks: (B:16:0x0060, B:24:0x0078, B:26:0x007e, B:28:0x0088, B:29:0x0090, B:31:0x0093, B:32:0x009f, B:34:0x00a7, B:36:0x00b1, B:37:0x00b4, B:38:0x00b9, B:39:0x00ba, B:40:0x00bf, B:41:0x00c0, B:45:0x00c9, B:56:0x0110, B:58:0x0118, B:59:0x0129, B:60:0x012d, B:62:0x0130, B:46:0x00da, B:47:0x00eb, B:49:0x00f3, B:53:0x00fd, B:54:0x0106, B:64:0x013d, B:65:0x0142, B:67:0x0150, B:71:0x0155, B:66:0x0143), top: B:80:0x0060, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0053 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13357[] m33883(String str, boolean z) throws UnknownHostException {
        InterfaceC16318[] interfaceC16318ArrM33884;
        InterfaceC25186 interfaceC25186;
        C13357[] c13357Arr;
        int i;
        if (str == null || str.length() == 0) {
            throw new UnknownHostException();
        }
        if (C13357.m32937(str)) {
            return new C13357[]{new C13357(m33874(0, str))};
        }
        InterfaceC25186 interfaceC25187 = f44088;
        if (interfaceC25187.mo13713()) {
            interfaceC25187.mo13717("Resolver order is " + ((C14826) this.f44105.mo2875()).m35702());
        }
        for (EnumC23778 enumC23778 : ((C14826) this.f44105.mo2875()).m35702()) {
            try {
                int i2 = C9429.f30586[enumC23778.ordinal()];
                if (i2 == 1) {
                    C7939 c7939 = this.f44097;
                    C0657 c0657 = this.f44105;
                    synchronized (c7939) {
                        new C19126(c0657.mo2875(), str, 32, null);
                        c7939.m21510(c0657);
                    }
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new UnknownHostException(str);
                        }
                        for (int i3 = 0; i3 < str.length(); i3++) {
                            if (!Character.isDigit(str.charAt(i3))) {
                                InetAddress[] allByName = InetAddress.getAllByName(str);
                                C13357[] c13357Arr2 = new C13357[allByName.length];
                                for (int i4 = 0; i4 < allByName.length; i4++) {
                                    c13357Arr2[i4] = new C13357(allByName[i4]);
                                }
                                InterfaceC25186 interfaceC25188 = f44088;
                                if (interfaceC25188.mo13707()) {
                                    interfaceC25188.mo13701("Resolved '{}' to {} using DNS", str, Arrays.toString(c13357Arr2));
                                }
                                return c13357Arr2;
                            }
                        }
                        throw new UnknownHostException(str);
                    }
                    if (str.length() <= 15) {
                        interfaceC16318ArrM33884 = z ? m33884(str, ((C14826) this.f44105.mo2875()).m35736()) : m33885(str, 32, ((C14826) this.f44105.mo2875()).m35736());
                        if (interfaceC16318ArrM33884 != null) {
                            interfaceC25186 = f44088;
                            if (interfaceC25186.mo13707()) {
                                interfaceC25186.mo13725("Resolved '{}' to addrs {} via {}", str, Arrays.toString(interfaceC16318ArrM33884), enumC23778);
                            }
                            c13357Arr = new C13357[interfaceC16318ArrM33884.length];
                            for (i = 0; i < interfaceC16318ArrM33884.length; i++) {
                                c13357Arr[i] = new C13357(interfaceC16318ArrM33884[i]);
                            }
                            return c13357Arr;
                        }
                    }
                } else if (!str.equals("\u0001\u0002__MSBROWSE__\u0002") && str.length() <= 15) {
                    interfaceC16318ArrM33884 = z ? m33884(str, m33888()) : m33885(str, 32, m33888());
                    if (interfaceC16318ArrM33884 != null) {
                        interfaceC25186 = f44088;
                        if (interfaceC25186.mo13707()) {
                            interfaceC25186.mo13725("Resolved '{}' to addrs {} via {}", str, Arrays.toString(interfaceC16318ArrM33884), enumC23778);
                        }
                        c13357Arr = new C13357[interfaceC16318ArrM33884.length];
                        while (i < interfaceC16318ArrM33884.length) {
                            c13357Arr[i] = new C13357(interfaceC16318ArrM33884[i]);
                        }
                        return c13357Arr;
                    }
                }
            } catch (IOException e) {
                InterfaceC25186 interfaceC25189 = f44088;
                interfaceC25189.mo13723("Resolving {} via {} failed:", str, enumC23778);
                interfaceC25189.mo13722("Exception is", (Exception) e);
            }
        }
        throw new UnknownHostException(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19126 m33873() {
        C22308 c22308 = this.f44090;
        if (c22308 != null) {
            return c22308.f72221;
        }
        return null;
    }
}
