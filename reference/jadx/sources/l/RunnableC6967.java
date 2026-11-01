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

/* JADX INFO: renamed from: l.ۜ᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 0A0C */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC6967 implements Runnable, InterfaceC0721 {

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f23415 = C13488.m32997(RunnableC6967.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InetAddress f23416;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public C11907 f23417;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public DatagramPacket f23418;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public Thread f23419;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ArrayList f23420;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public HashMap f23421;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C13899 f23422;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C14024 f23423;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte[] f23424;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15435 f23425;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public DatagramSocket f23426;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public DatagramPacket f23427;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public byte[] f23428;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f23429;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Object f23430;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f23431;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashSet f23432;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HashMap f23433;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C15435 f23434;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f23435;

    public RunnableC6967(C13899 c13899) {
        InetAddress byName;
        c13899.mo29449().getClass();
        c13899.mo29449().getClass();
        this.f23430 = new Object();
        this.f23435 = 0;
        HashMap map = new HashMap();
        this.f23433 = map;
        this.f23432 = new HashSet();
        this.f23421 = new HashMap();
        this.f23429 = 0;
        this.f23420 = new ArrayList();
        this.f23423 = new C14024();
        this.f23422 = c13899;
        InetAddress inetAddressM25067 = ((C9895) c13899.mo29449()).m25067();
        this.f23416 = inetAddressM25067;
        byte[] bArr = new byte[((C9895) c13899.mo29449()).m25072()];
        this.f23428 = bArr;
        byte[] bArr2 = new byte[((C9895) c13899.mo29449()).m25071()];
        this.f23424 = bArr2;
        this.f23418 = new DatagramPacket(bArr, ((C9895) c13899.mo29449()).m25072(), inetAddressM25067, 137);
        this.f23427 = new DatagramPacket(bArr2, ((C9895) c13899.mo29449()).m25071());
        this.f23420 = ((C9895) c13899.mo29449()).m25069();
        C11907 c11907 = new C11907(c13899.mo29449(), "0.0.0.0", 0, null);
        this.f23417 = c11907;
        C15435 c15435 = new C15435(c11907, 0);
        this.f23434 = c15435;
        map.put(c11907, new C1322(c15435, -1L));
        c13899.mo29449().getClass();
        try {
            try {
                byName = InetAddress.getLocalHost();
            } catch (UnknownHostException e) {
                throw new C17655(e);
            }
        } catch (UnknownHostException unused) {
            byName = InetAddress.getByName("127.0.0.1");
        }
        c13899.mo29449().getClass();
        byte[] address = byName.getAddress();
        String str = "JCIFS" + (address[2] & 255) + "_" + (address[3] & 255) + "_" + C5993.m16280((int) (Math.random() * 255.0d), 2);
        InterfaceC10601 interfaceC10601Mo29449 = c13899.mo29449();
        c13899.mo29449().getClass();
        C11907 c11908 = new C11907(interfaceC10601Mo29449, str, 0, null);
        C15435 c15436 = new C15435(c11908, byName.hashCode(), 0);
        this.f23425 = c15436;
        m18727(c11908, c15436, -1L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15435 m18722(C11907 c11907) throws UnknownHostException {
        C15435 c15435M18723;
        C15435 c15435M18737 = null;
        InetAddress inetAddress = c11907.f39951 == 29 ? this.f23416 : null;
        c11907.f39949 = inetAddress != null ? inetAddress.hashCode() : 0;
        C15435 c15435M18738 = m18737(c11907);
        if (c15435M18738 == null) {
            synchronized (this.f23432) {
                if (!this.f23432.contains(c11907)) {
                    this.f23432.add(c11907);
                } else {
                    while (this.f23432.contains(c11907)) {
                        try {
                            this.f23432.wait();
                        } catch (InterruptedException e) {
                            f23415.mo12131("Interrupted", e);
                        }
                    }
                    c15435M18737 = m18737(c11907);
                    if (c15435M18737 == null) {
                        synchronized (this.f23432) {
                            this.f23432.add(c11907);
                        }
                    }
                }
            }
            try {
                if (c15435M18737 == null) {
                    try {
                        c15435M18723 = m18723(c11907, inetAddress);
                    } catch (UnknownHostException unused) {
                        c15435M18723 = this.f23434;
                    }
                    c15435M18738 = c15435M18723;
                    m18726(c11907, c15435M18738);
                    m18718(c11907);
                } else {
                    c15435M18738 = c15435M18737;
                }
            } catch (Throwable th) {
                m18726(c11907, c15435M18737);
                m18718(c11907);
                throw th;
            }
        }
        if (c15435M18738 != this.f23434) {
            return c15435M18738;
        }
        throw new UnknownHostException(c11907.toString());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m18718(C11907 c11907) {
        synchronized (this.f23432) {
            this.f23432.remove(c11907);
            this.f23432.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18726(C11907 c11907, C15435 c15435) {
        C13899 c13899 = this.f23422;
        if (((C9895) c13899.mo29449()).m25078() == 0) {
            return;
        }
        m18727(c11907, c15435, ((C9895) c13899.mo29449()).m25078() != -1 ? System.currentTimeMillis() + ((long) (((C9895) c13899.mo29449()).m25078() * 1000)) : -1L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18727(C11907 c11907, C15435 c15435, long j) {
        if (((C9895) this.f23422.mo29449()).m25078() == 0) {
            return;
        }
        synchronized (this.f23433) {
            C1322 c1322 = (C1322) this.f23433.get(c11907);
            if (c1322 == null) {
                this.f23433.put(c11907, new C1322(c15435, j));
            } else {
                c1322.f5613 = c15435;
                c1322.f5614 = j;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18729(C15435[] c15435Arr) {
        if (((C9895) this.f23422.mo29449()).m25078() == 0) {
            return;
        }
        long jCurrentTimeMillis = ((C9895) this.f23422.mo29449()).m25078() != -1 ? System.currentTimeMillis() + ((long) (((C9895) this.f23422.mo29449()).m25078() * 1000)) : -1L;
        synchronized (this.f23433) {
            for (int i = 0; i < c15435Arr.length; i++) {
                C1322 c1322 = (C1322) this.f23433.get(c15435Arr[i].f50302);
                if (c1322 == null) {
                    C15435 c15435 = c15435Arr[i];
                    this.f23433.put(c15435.f50302, new C1322(c15435, jCurrentTimeMillis));
                } else {
                    c1322.f5613 = c15435Arr[i];
                    c1322.f5614 = jCurrentTimeMillis;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15435 m18737(C11907 c11907) {
        C15435 c15435;
        if (((C9895) this.f23422.mo29449()).m25078() == 0) {
            return null;
        }
        synchronized (this.f23433) {
            C1322 c1322 = (C1322) this.f23433.get(c11907);
            if (c1322 != null && c1322.f5614 < System.currentTimeMillis() && c1322.f5614 >= 0) {
                c1322 = null;
            }
            c15435 = c1322 != null ? c1322.f5613 : null;
        }
        return c15435;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18725(int i) {
        this.f23431 = 0;
        C13899 c13899 = this.f23422;
        if (((C9895) c13899.mo29449()).m25064() != 0) {
            this.f23431 = Math.max(((C9895) c13899.mo29449()).m25064(), i);
        }
        if (this.f23426 == null) {
            this.f23426 = new DatagramSocket(0, null);
            Thread thread = new Thread(this, "JCIFS-NameServiceClient");
            this.f23419 = thread;
            thread.setDaemon(true);
            this.f23419.start();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m18719() {
        synchronized (this.f23430) {
            DatagramSocket datagramSocket = this.f23426;
            if (datagramSocket != null) {
                datagramSocket.close();
                this.f23426 = null;
            }
            this.f23419 = null;
            this.f23421.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (this.f23419 == Thread.currentThread()) {
            try {
                try {
                    this.f23427.setLength(((C9895) this.f23422.mo29449()).m25071());
                    this.f23426.setSoTimeout(this.f23431);
                    this.f23426.receive(this.f23427);
                    InterfaceC4314 interfaceC4314 = f23415;
                    interfaceC4314.mo12127("NetBIOS: new data read from socket");
                    AbstractC23196 abstractC23196 = (AbstractC23196) this.f23421.get(new Integer(AbstractC23196.m51223(0, this.f23424)));
                    if (abstractC23196 != null && !abstractC23196.f75295) {
                        synchronized (abstractC23196) {
                            abstractC23196.m51225(this.f23424);
                            abstractC23196.f75295 = true;
                            if (interfaceC4314.mo12133()) {
                                interfaceC4314.mo12127(abstractC23196.toString());
                                interfaceC4314.mo12127(C5993.m16281(this.f23424, 0, this.f23427.getLength()));
                            }
                            abstractC23196.notify();
                        }
                    }
                } catch (SocketTimeoutException e) {
                    f23415.mo12131("Socket timeout", e);
                    m18719();
                    return;
                } catch (Exception e2) {
                    f23415.mo12122("Uncaught exception in NameServiceClient", (Throwable) e2);
                    m18719();
                    return;
                }
            } catch (Throwable th) {
                m18719();
                throw th;
            }
        }
        m18719();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00e3 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m18728(l.AbstractC23196 r18, l.AbstractC23196 r19, int r20) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.RunnableC6967.m18728(l.᩺᩵۠, l.᩺᩵۠, int):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15435 m18723(C11907 c11907, InetAddress inetAddress) throws UnknownHostException {
        C13899 c13899 = this.f23422;
        C2733 c2733 = new C2733(c13899.mo29449(), c11907);
        C5556 c5556 = new C5556(c13899.mo29449());
        InetAddress inetAddress2 = this.f23416;
        InterfaceC4314 interfaceC4314 = f23415;
        if (inetAddress != null) {
            c2733.f75287 = inetAddress;
            c2733.f75276 = inetAddress.equals(inetAddress2) || inetAddress.getAddress()[3] == -1;
            int iM25077 = ((C9895) c13899.mo29449()).m25077();
            do {
                try {
                    m18728(c2733, c5556, ((C9895) c13899.mo29449()).m25039());
                    if (!c5556.f75295 || c5556.f75290 != 0) {
                        iM25077--;
                        if (iM25077 <= 0) {
                            break;
                        }
                    } else {
                        C15435[] c15435Arr = c5556.f75284;
                        int length = c15435Arr.length - 1;
                        c15435Arr[length].f50302.f39949 = inetAddress.hashCode();
                        return c5556.f75284[length];
                    }
                } catch (InterruptedIOException e) {
                    if (interfaceC4314.mo12133()) {
                        interfaceC4314.mo12131("Timeout waiting for response " + c11907.f39950, e);
                    }
                    throw new UnknownHostException(c11907.f39950);
                } catch (IOException e2) {
                    interfaceC4314.mo12136("Failed to send nameservice request for " + c11907.f39950, (Exception) e2);
                    throw new UnknownHostException(c11907.f39950);
                }
            } while (c2733.f75276);
            throw new UnknownHostException(c11907.f39950);
        }
        for (EnumC12717 enumC12717 : this.f23420) {
            try {
                int i = C22490.f73412[enumC12717.ordinal()];
                if (i == 1) {
                    this.f23423.m33941(c13899);
                } else if (i == 2 || i == 3) {
                    if (enumC12717 == EnumC12717.RESOLVER_WINS && c11907.f39950 != "\u0001\u0002__MSBROWSE__\u0002" && c11907.f39951 != 29) {
                        c2733.f75287 = m18736();
                        c2733.f75276 = false;
                    } else {
                        c2733.f75287 = inetAddress2;
                        c2733.f75276 = true;
                    }
                    int iM25078 = ((C9895) c13899.mo29449()).m25077();
                    while (true) {
                        int i2 = iM25078 - 1;
                        if (iM25078 <= 0) {
                            break;
                        }
                        try {
                            m18728(c2733, c5556, ((C9895) c13899.mo29449()).m25039());
                            if (c5556.f75295 && c5556.f75290 == 0) {
                                c5556.f75284[0].f50302.f39949 = c2733.f75287.hashCode();
                                return c5556.f75284[0];
                            }
                            if (enumC12717 == EnumC12717.RESOLVER_WINS) {
                                break;
                            }
                            iM25078 = i2;
                        } catch (IOException e3) {
                            interfaceC4314.mo12136("Failed to send nameservice request for " + c11907.f39950, (Exception) e3);
                            throw new UnknownHostException(c11907.f39950);
                        }
                    }
                }
            } catch (IOException e4) {
                interfaceC4314.mo12120("Failed to lookup name", (Exception) e4);
            }
        }
        throw new UnknownHostException(c11907.f39950);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15435[] m18732(C15435 c15435) throws UnknownHostException {
        C13899 c13899 = this.f23422;
        InterfaceC10601 interfaceC10601Mo29449 = c13899.mo29449();
        c15435.getClass();
        C18962 c18962 = new C18962(interfaceC10601Mo29449, C15435.class.isAssignableFrom(C15435.class) ? c15435 : null);
        InterfaceC10601 interfaceC10601Mo294410 = c13899.mo29449();
        int i = 0;
        C11907 c11907 = new C11907(c13899.mo29449(), "*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", 0, null);
        AbstractC23196 c18256 = new C18256(interfaceC10601Mo294410);
        c18256.f75282 = c11907;
        c18256.f75283 = 33;
        c18256.f75298 = false;
        c18256.f75276 = false;
        c18256.f75287 = InetAddress.getByName(c15435.mo36917());
        int iM25077 = ((C9895) c13899.mo29449()).m25077();
        while (true) {
            int i2 = iM25077 - 1;
            if (iM25077 > 0) {
                try {
                    m18728(c18256, c18962, ((C9895) c13899.mo29449()).m25039());
                    if (c18962.f75295 && c18962.f75290 == 0) {
                        int iHashCode = c18256.f75287.hashCode();
                        while (true) {
                            C15435[] c15435Arr = c18962.f61405;
                            if (i >= c15435Arr.length) {
                                return c15435Arr;
                            }
                            c15435Arr[i].f50302.f39949 = iHashCode;
                            i++;
                        }
                    } else {
                        iM25077 = i2;
                    }
                } catch (IOException e) {
                    f23415.mo12136("Failed to send node status request for " + c15435, (Exception) e);
                    throw new UnknownHostException(c15435.toString());
                }
            } else {
                throw new UnknownHostException(c15435.mo36921());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15435 m18721(int i, String str) {
        if (str != null && str.length() != 0) {
            C11907 c11907 = new C11907(this.f23422.mo29449(), str, i, null);
            if (!Character.isDigit(str.charAt(0))) {
                return m18722(c11907);
            }
            char[] charArray = str.toCharArray();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < charArray.length) {
                char c = charArray[i2];
                if (c < '0' || c > '9') {
                    return m18722(c11907);
                }
                int i5 = 0;
                while (c != '.') {
                    if (c < '0' || c > '9') {
                        return m18722(c11907);
                    }
                    i5 = ((i5 * 10) + c) - 48;
                    i2++;
                    if (i2 >= charArray.length) {
                        break;
                    }
                    c = charArray[i2];
                }
                if (i5 > 255) {
                    return m18722(c11907);
                }
                i4 = (i4 << 8) + i5;
                i3++;
                i2++;
            }
            if (i3 != 4 || str.endsWith(".")) {
                return m18722(c11907);
            }
            return new C15435(this.f23417, i4);
        }
        return this.f23425;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15435[] m18731(String str, int i, InetAddress inetAddress) throws UnknownHostException {
        C13899 c13899 = this.f23422;
        C11907 c11907 = new C11907(c13899.mo29449(), str, i, null);
        InterfaceC4314 interfaceC4314 = f23415;
        InterfaceC10601 interfaceC10601Mo29449 = c13899.mo29449();
        C2733 c2733 = new C2733(interfaceC10601Mo29449, c11907);
        C5556 c5556 = new C5556(interfaceC10601Mo29449);
        if (inetAddress == null) {
            inetAddress = m18736();
        }
        c2733.f75287 = inetAddress;
        InetAddress inetAddress2 = this.f23416;
        int iM25077 = 1;
        boolean z = inetAddress == null || inetAddress.equals(inetAddress2) || inetAddress.getAddress()[3] == -1;
        c2733.f75276 = z;
        if (z) {
            if (c2733.f75287 == null) {
                c2733.f75287 = inetAddress2;
            }
            iM25077 = ((C9895) interfaceC10601Mo29449).m25077();
        }
        do {
            try {
                m18728(c2733, c5556, ((C9895) interfaceC10601Mo29449).m25039());
                if (!c5556.f75295 || c5556.f75290 != 0) {
                    iM25077--;
                    if (iM25077 <= 0) {
                        break;
                    }
                } else {
                    return c5556.f75284;
                }
            } catch (InterruptedIOException e) {
                if (interfaceC4314.mo12133()) {
                    interfaceC4314.mo12131("Failed to send nameservice request for " + c11907.f39950, e);
                }
                throw new UnknownHostException(c11907.f39950);
            } catch (IOException e2) {
                interfaceC4314.mo12136("Failed to send nameservice request for " + c11907.f39950, (Exception) e2);
                throw new UnknownHostException(c11907.f39950);
            }
        } while (c2733.f75276);
        throw new UnknownHostException(c11907.f39950);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16950[] m18738(String str) {
        String str2;
        C15435 c15435M18721 = m18721(0, str);
        try {
            C15435[] c15435ArrM18732 = m18732(c15435M18721);
            m18729(c15435ArrM18732);
            return c15435ArrM18732;
        } catch (UnknownHostException unused) {
            StringBuilder sb = new StringBuilder("no name with type 0x");
            sb.append(C5993.m16280(c15435M18721.f50302.f39951, 2));
            String str3 = c15435M18721.f50302.f39947;
            if (str3 == null || str3.isEmpty()) {
                str2 = " with no scope";
            } else {
                str2 = " with scope " + c15435M18721.f50302.f39947;
            }
            sb.append(str2);
            sb.append(" for host ");
            sb.append(c15435M18721.mo36917());
            throw new UnknownHostException(sb.toString());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InetAddress m18736() {
        C13899 c13899 = this.f23422;
        if (((C9895) c13899.mo29449()).m25052().length == 0) {
            return null;
        }
        return ((C9895) c13899.mo29449()).m25052()[this.f23435];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m18730(InetAddress inetAddress) {
        int i = 0;
        while (inetAddress != null) {
            C13899 c13899 = this.f23422;
            if (i >= ((C9895) c13899.mo29449()).m25052().length) {
                break;
            }
            if (inetAddress.hashCode() == ((C9895) c13899.mo29449()).m25052()[i].hashCode()) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m18735() {
        int i = this.f23435 + 1;
        C13899 c13899 = this.f23422;
        this.f23435 = i < ((C9895) c13899.mo29449()).m25052().length ? this.f23435 + 1 : 0;
        if (((C9895) c13899.mo29449()).m25052().length == 0) {
            return;
        }
        InetAddress inetAddress = ((C9895) c13899.mo29449()).m25052()[this.f23435];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16950[] m18733(String str, InetAddress inetAddress) throws UnknownHostException {
        C4144 c4144 = new C4144();
        c4144.f15161 = 2;
        C13318 c13318 = new C13318(c4144, str, m18730(inetAddress) ? 27 : 29, inetAddress, this.f23422);
        C13318 c13319 = new C13318(c4144, str, 32, inetAddress, this.f23422);
        c13318.setDaemon(true);
        c13319.setDaemon(true);
        try {
            synchronized (c4144) {
                c13318.start();
                c13319.start();
                while (c4144.f15161 > 0 && c13318.m32832() == null && c13319.m32832() == null) {
                    c4144.wait();
                }
            }
            try {
                c13318.interrupt();
            } catch (SecurityException unused) {
            }
            try {
                c13318.join();
            } catch (InterruptedException unused2) {
            }
            try {
                c13319.interrupt();
            } catch (SecurityException unused3) {
            }
            try {
                c13319.join();
            } catch (InterruptedException unused4) {
            }
            if (c13318.m32832() != null) {
                return c13318.m32832();
            }
            if (c13319.m32832() != null) {
                return c13319.m32832();
            }
            throw c13318.m32833();
        } catch (InterruptedException unused5) {
            throw new UnknownHostException(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19668 m18724(String str) {
        return m18734(str, false)[0];
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0118 A[Catch: IOException -> 0x0156, TryCatch #1 {IOException -> 0x0156, blocks: (B:16:0x0060, B:24:0x0078, B:26:0x007e, B:28:0x0088, B:29:0x0090, B:31:0x0093, B:32:0x009f, B:34:0x00a7, B:36:0x00b1, B:37:0x00b4, B:38:0x00b9, B:39:0x00ba, B:40:0x00bf, B:41:0x00c0, B:45:0x00c9, B:56:0x0110, B:58:0x0118, B:59:0x0129, B:60:0x012d, B:62:0x0130, B:46:0x00da, B:47:0x00eb, B:49:0x00f3, B:53:0x00fd, B:54:0x0106, B:64:0x013d, B:65:0x0142, B:67:0x0150, B:71:0x0155, B:66:0x0143), top: B:80:0x0060, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0130 A[Catch: IOException -> 0x0156, LOOP:1: B:60:0x012d->B:62:0x0130, LOOP_END, TryCatch #1 {IOException -> 0x0156, blocks: (B:16:0x0060, B:24:0x0078, B:26:0x007e, B:28:0x0088, B:29:0x0090, B:31:0x0093, B:32:0x009f, B:34:0x00a7, B:36:0x00b1, B:37:0x00b4, B:38:0x00b9, B:39:0x00ba, B:40:0x00bf, B:41:0x00c0, B:45:0x00c9, B:56:0x0110, B:58:0x0118, B:59:0x0129, B:60:0x012d, B:62:0x0130, B:46:0x00da, B:47:0x00eb, B:49:0x00f3, B:53:0x00fd, B:54:0x0106, B:64:0x013d, B:65:0x0142, B:67:0x0150, B:71:0x0155, B:66:0x0143), top: B:80:0x0060, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0053 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19668[] m18734(String str, boolean z) throws UnknownHostException {
        InterfaceC16950[] interfaceC16950ArrM18733;
        InterfaceC4314 interfaceC4314;
        C19668[] c19668Arr;
        int i;
        if (str == null || str.length() == 0) {
            throw new UnknownHostException();
        }
        if (C19668.m44791(str)) {
            return new C19668[]{new C19668(m18721(0, str))};
        }
        InterfaceC4314 interfaceC4315 = f23415;
        if (interfaceC4315.mo12133()) {
            interfaceC4315.mo12127("Resolver order is " + ((C9895) this.f23422.mo29449()).m25069());
        }
        for (EnumC12717 enumC12717 : ((C9895) this.f23422.mo29449()).m25069()) {
            try {
                int i2 = C22490.f73412[enumC12717.ordinal()];
                if (i2 == 1) {
                    C14024 c14024 = this.f23423;
                    C13899 c13899 = this.f23422;
                    synchronized (c14024) {
                        new C11907(c13899.mo29449(), str, 32, null);
                        c14024.m33941(c13899);
                    }
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new UnknownHostException(str);
                        }
                        for (int i3 = 0; i3 < str.length(); i3++) {
                            if (!Character.isDigit(str.charAt(i3))) {
                                InetAddress[] allByName = InetAddress.getAllByName(str);
                                C19668[] c19668Arr2 = new C19668[allByName.length];
                                for (int i4 = 0; i4 < allByName.length; i4++) {
                                    c19668Arr2[i4] = new C19668(allByName[i4]);
                                }
                                InterfaceC4314 interfaceC4316 = f23415;
                                if (interfaceC4316.mo12125()) {
                                    interfaceC4316.mo12121("Resolved '{}' to {} using DNS", str, Arrays.toString(c19668Arr2));
                                }
                                return c19668Arr2;
                            }
                        }
                        throw new UnknownHostException(str);
                    }
                    if (str.length() <= 15) {
                        interfaceC16950ArrM18733 = z ? m18733(str, ((C9895) this.f23422.mo29449()).m25067()) : m18731(str, 32, ((C9895) this.f23422.mo29449()).m25067());
                        if (interfaceC16950ArrM18733 != null) {
                            interfaceC4314 = f23415;
                            if (interfaceC4314.mo12125()) {
                                interfaceC4314.mo12139("Resolved '{}' to addrs {} via {}", str, Arrays.toString(interfaceC16950ArrM18733), enumC12717);
                            }
                            c19668Arr = new C19668[interfaceC16950ArrM18733.length];
                            for (i = 0; i < interfaceC16950ArrM18733.length; i++) {
                                c19668Arr[i] = new C19668(interfaceC16950ArrM18733[i]);
                            }
                            return c19668Arr;
                        }
                    }
                } else if (!str.equals("\u0001\u0002__MSBROWSE__\u0002") && str.length() <= 15) {
                    interfaceC16950ArrM18733 = z ? m18733(str, m18736()) : m18731(str, 32, m18736());
                    if (interfaceC16950ArrM18733 != null) {
                        interfaceC4314 = f23415;
                        if (interfaceC4314.mo12125()) {
                            interfaceC4314.mo12139("Resolved '{}' to addrs {} via {}", str, Arrays.toString(interfaceC16950ArrM18733), enumC12717);
                        }
                        c19668Arr = new C19668[interfaceC16950ArrM18733.length];
                        while (i < interfaceC16950ArrM18733.length) {
                            c19668Arr[i] = new C19668(interfaceC16950ArrM18733[i]);
                        }
                        return c19668Arr;
                    }
                }
            } catch (IOException e) {
                InterfaceC4314 interfaceC4317 = f23415;
                interfaceC4317.mo12137("Resolving {} via {} failed:", str, enumC12717);
                interfaceC4317.mo12131("Exception is", e);
            }
        }
        throw new UnknownHostException(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11907 m18720() {
        C15435 c15435 = this.f23425;
        if (c15435 != null) {
            return c15435.f50302;
        }
        return null;
    }
}
