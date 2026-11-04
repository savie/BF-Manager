package l;

/* JADX INFO: renamed from: l.ۖۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K78T */
/* JADX INFO: loaded from: classes2.dex */
public final class C2446 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f7830;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f7831;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f7832;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f7834;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f7835;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f7836;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f7837;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C6338 f7839;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f7840;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f7841;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C14069 f7842;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C14069 f7843;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f7844;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f7845;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Thread[] f7846;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f7847;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f7848;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object f7833 = new Object();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f7838 = -1;

    public C2446(C12887 c12887, C12777 c12777, C6338 c6338) {
        this.f7839 = c6338;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8264(C14069 c14069) throws Throwable {
        Thread[] threadArrM8258;
        synchronized (this.f7833) {
            if (!this.f7831 && !c14069.f44555 && !c14069.f44543.m20901()) {
                if (this.f7848 > 0) {
                    this.f7842 = c14069;
                    C14069 c140610 = this.f7843;
                    if ((c140610 != null) && c140610 != c14069) {
                        this.f7845 = true;
                        this.f7832 = true;
                        this.f7833.notifyAll();
                    }
                    return;
                }
                C14069 c140611 = this.f7843;
                if (c140611 != null) {
                    threadArrM8258 = null;
                    if (c140611 != c14069) {
                        this.f7842 = c14069;
                        this.f7845 = true;
                        this.f7832 = true;
                        this.f7833.notifyAll();
                    }
                } else {
                    threadArrM8258 = m8258(c14069);
                }
                m8259(threadArrM8258);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18854 m8263() {
        synchronized (this.f7833) {
            if (this.f7831) {
                return new C9903();
            }
            this.f7848++;
            boolean z = false;
            while (true) {
                int i = this.f7847;
                if (i <= 0 || this.f7841 >= i) {
                    break;
                }
                try {
                    this.f7833.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return new InterfaceC18854() { // from class: l.֨ۚۚ
                @Override // java.lang.AutoCloseable
                public final void close() throws Throwable {
                    C2446.m8246(this.f3501);
                }
            };
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8268(C14069 c14069) {
        synchronized (this.f7833) {
            m8261(c14069);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m8266(C14069 c14069) {
        boolean z;
        synchronized (this.f7833) {
            m8261(c14069);
            z = false;
            while (this.f7843 == c14069) {
                try {
                    this.f7833.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m8261(C14069 c14069) {
        C14069 c140610 = this.f7843;
        if (c140610 == c14069 && c140610 != null) {
            this.f7845 = true;
            this.f7832 = true;
        }
        if (this.f7842 == c14069) {
            this.f7842 = null;
        }
        this.f7833.notifyAll();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m8265(String str) {
        C14069 c14069;
        boolean z;
        synchronized (this.f7833) {
            C14069 c140610 = this.f7843;
            z = (c140610 != null && c140610.f44556.equals(str)) || ((c14069 = this.f7842) != null && c14069.f44556.equals(str));
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8267() {
        boolean z;
        synchronized (this.f7833) {
            this.f7831 = true;
            this.f7845 = true;
            this.f7832 = true;
            this.f7842 = null;
            this.f7848 = 0;
            this.f7833.notifyAll();
            z = false;
            while (true) {
                if (!(this.f7843 != null)) {
                    break;
                }
                try {
                    this.f7833.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private Thread[] m8258(final C14069 c14069) {
        if (this.f7831 || c14069.f44555 || c14069.f44543.m20901()) {
            return null;
        }
        final long j = this.f7836 + 1;
        this.f7836 = j;
        Thread[] threadArr = new Thread[2];
        this.f7843 = c14069;
        this.f7846 = threadArr;
        this.f7835 = j;
        this.f7845 = false;
        this.f7832 = false;
        this.f7837 = false;
        this.f7844 = false;
        this.f7834 = false;
        this.f7841 = 0;
        this.f7847 = 2;
        this.f7830 = 0;
        this.f7840 = 0;
        this.f7838 = -1;
        c14069.f44553.size();
        int i = 0;
        while (i < 2) {
            final int i2 = i;
            Runnable runnable = new Runnable() { // from class: l.ۡۚۚ
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    C2446.m8247(this.f29735, c14069, j, i2);
                }
            };
            StringBuilder sb = new StringBuilder("MT MCP Smali Cache #");
            int i3 = i + 1;
            sb.append(i3);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            threadArr[i] = thread;
            i = i3;
        }
        return threadArr;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0027 A[Catch: all -> 0x0063, TryCatch #0 {, blocks: (B:21:0x0023, B:23:0x0027, B:25:0x0033, B:26:0x004f, B:27:0x0054, B:30:0x0061), top: B:35:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0033 A[Catch: all -> 0x0063, TryCatch #0 {, blocks: (B:21:0x0023, B:23:0x0027, B:25:0x0033, B:26:0x004f, B:27:0x0054, B:30:0x0061), top: B:35:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[Catch: all -> 0x0063, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:21:0x0023, B:23:0x0027, B:25:0x0033, B:26:0x004f, B:27:0x0054, B:30:0x0061), top: B:35:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m8259(Thread[] threadArr) throws Throwable {
        int i;
        Throwable th;
        C14069 c14069;
        if (threadArr == null) {
            return;
        }
        try {
            i = 0;
            for (Thread thread : threadArr) {
                try {
                    thread.start();
                    i++;
                } catch (Error e) {
                    e = e;
                    th = e;
                    synchronized (this.f7833) {
                        if (this.f7846 == threadArr) {
                            throw th;
                        }
                        this.f7832 = true;
                        this.f7845 = true;
                        this.f7847 = i;
                        this.f7834 = true;
                        c14069 = null;
                        if (i == 0) {
                            C14069 c140610 = this.f7843;
                            this.f7843 = null;
                            this.f7846 = null;
                            this.f7845 = false;
                            this.f7832 = false;
                            this.f7837 = false;
                            this.f7844 = false;
                            this.f7834 = false;
                            this.f7847 = 0;
                            this.f7841 = 0;
                            this.f7830 = 0;
                            this.f7840 = 0;
                            this.f7838 = -1;
                            c14069 = c140610;
                        }
                        this.f7833.notifyAll();
                        if (c14069 != null) {
                            throw th;
                        }
                        C1897.m6527((C1897) this.f7839.f21461, c14069);
                        throw th;
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    th = e;
                    synchronized (this.f7833) {
                        if (this.f7846 == threadArr) {
                            throw th;
                        }
                        this.f7832 = true;
                        this.f7845 = true;
                        this.f7847 = i;
                        this.f7834 = true;
                        c14069 = null;
                        if (i == 0) {
                            C14069 c140611 = this.f7843;
                            this.f7843 = null;
                            this.f7846 = null;
                            this.f7845 = false;
                            this.f7832 = false;
                            this.f7837 = false;
                            this.f7844 = false;
                            this.f7834 = false;
                            this.f7847 = 0;
                            this.f7841 = 0;
                            this.f7830 = 0;
                            this.f7840 = 0;
                            this.f7838 = -1;
                            c14069 = c140611;
                        }
                        this.f7833.notifyAll();
                        if (c14069 != null) {
                            throw th;
                        }
                        C1897.m6527((C1897) this.f7839.f21461, c14069);
                        throw th;
                    }
                }
            }
            m8250(threadArr);
        } catch (Error | RuntimeException e3) {
            e = e3;
            i = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8250(Thread[] threadArr) {
        synchronized (this.f7833) {
            if (this.f7846 == threadArr) {
                this.f7834 = true;
                this.f7833.notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8246(C2446 c2446) throws Throwable {
        Thread[] threadArrM8258;
        synchronized (c2446.f7833) {
            int i = c2446.f7848;
            if (i > 0) {
                c2446.f7848 = i - 1;
            }
            threadArrM8258 = null;
            if (c2446.f7848 == 0) {
                C14069 c14069 = c2446.f7842;
                if (c14069 != null) {
                    C14069 c140610 = c2446.f7843;
                    if (!(c140610 != null)) {
                        c2446.f7842 = null;
                        threadArrM8258 = c2446.m8258(c14069);
                    } else if (c14069 == c140610) {
                        c2446.f7842 = null;
                    } else {
                        c2446.f7845 = true;
                        c2446.f7832 = true;
                    }
                }
                c2446.f7833.notifyAll();
            }
        }
        c2446.m8259(threadArrM8258);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m8254(C14069 c14069, long j) {
        boolean zM8255;
        do {
            synchronized (this.f7833) {
                zM8255 = false;
                if (m8255(c14069, j)) {
                    boolean z = false;
                    while (this.f7848 > 0 && m8255(c14069, j)) {
                        if (!z) {
                            int i = this.f7841 + 1;
                            this.f7841 = i;
                            if (i == this.f7847 && !this.f7844) {
                                String str = c14069.f44556;
                                this.f7844 = true;
                            }
                            this.f7833.notifyAll();
                            z = true;
                        }
                        try {
                            this.f7833.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            this.f7845 = true;
                            this.f7832 = true;
                        }
                    }
                    if (z) {
                        int i2 = this.f7841 - 1;
                        this.f7841 = i2;
                        if (i2 < 0) {
                            this.f7841 = 0;
                        }
                        if (this.f7844 && this.f7841 == 0 && this.f7848 == 0 && m8255(c14069, j)) {
                            String str2 = c14069.f44556;
                            this.f7844 = false;
                        }
                        this.f7833.notifyAll();
                    }
                    zM8255 = m8255(c14069, j);
                }
            }
            if (!zM8255) {
                return;
            }
        } while (m8245(c14069, j));
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private boolean m8255(C14069 c14069, long j) {
        return (this.f7843 != c14069 || this.f7835 != j || this.f7845 || this.f7831 || this.f7832) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8249(C14069 c14069, long j, boolean z) {
        synchronized (this.f7833) {
            if (this.f7843 == c14069 && this.f7835 == j) {
                this.f7837 = true;
                if (!z) {
                    this.f7832 = true;
                    this.f7830 = c14069.f44553.size();
                }
                this.f7833.notifyAll();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0042  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m8260(C14069 c14069, long j) {
        boolean z;
        synchronized (this.f7833) {
            while (true) {
                z = true;
                if (this.f7843 != c14069 || this.f7835 != j || this.f7837 || this.f7845 || this.f7831) {
                    break;
                }
                try {
                    this.f7833.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    this.f7845 = true;
                    this.f7832 = true;
                    if (this.f7837) {
                        z = false;
                    } else {
                        z = false;
                    }
                    return z;
                }
            }
            if (this.f7837 || this.f7843 != c14069 || this.f7835 != j || this.f7845 || this.f7831) {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0042  */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m8253(C14069 c14069, long j) {
        boolean z;
        synchronized (this.f7833) {
            while (true) {
                z = true;
                if (this.f7843 != c14069 || this.f7835 != j || this.f7834 || this.f7845 || this.f7831) {
                    break;
                }
                try {
                    this.f7833.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    this.f7845 = true;
                    this.f7832 = true;
                    if (this.f7834) {
                        z = false;
                    } else {
                        z = false;
                    }
                    return z;
                }
            }
            if (this.f7834 || this.f7843 != c14069 || this.f7835 != j || this.f7845 || this.f7831) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8247(C2446 c2446, C14069 c14069, long j, int i) throws Throwable {
        boolean zM8260;
        try {
            if (!c2446.m8253(c14069, j)) {
                c2446.m8257(c14069, j);
                return;
            }
            if (i == 0) {
                zM8260 = false;
                try {
                    C7667 c7667 = c14069.f44543;
                    c7667.m20902();
                    if (!c7667.m20900() && !c7667.m20899(c14069.f44553) && !c7667.m20900()) {
                        zM8260 = true;
                    }
                    c2446.m8249(c14069, j, zM8260);
                } catch (Throwable th) {
                    c2446.m8249(c14069, j, false);
                    throw th;
                }
            } else {
                zM8260 = c2446.m8260(c14069, j);
            }
            if (zM8260) {
                c2446.m8254(c14069, j);
            }
            c2446.m8257(c14069, j);
        } catch (Throwable th2) {
            c2446.m8257(c14069, j);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m8245(C14069 c14069, long j) {
        int i;
        C21105 c21105 = new C21105();
        String str = null;
        C24975 c24975M34232 = null;
        while (true) {
            synchronized (this.f7833) {
                if (m8255(c14069, j)) {
                    if (this.f7848 > 0) {
                        i = -2;
                    } else if (this.f7830 < c14069.f44553.size()) {
                        int i2 = this.f7830;
                        this.f7830 = i2 + 1;
                        i = i2;
                    }
                }
                i = -1;
            }
            if (i == -2) {
                return true;
            }
            if (i != -1) {
                C23330 c23330 = (C23330) c14069.f44553.get(i);
                EnumC6176 enumC6176M20903 = c14069.f44543.m20903(c23330.f75565);
                if (enumC6176M20903 == EnumC6176.UNAVAILABLE) {
                    m8248(c14069, j);
                    return false;
                }
                if (enumC6176M20903 == EnumC6176.OFFSET || enumC6176M20903 == EnumC6176.FAILURE) {
                    m8252(c14069, j);
                } else {
                    if (!c23330.f75564.equals(str)) {
                        try {
                            c24975M34232 = c14069.m34232(c23330.f75564);
                            str = c23330.f75564;
                        } catch (C10186 unused) {
                            m8248(c14069, j);
                            return false;
                        }
                    }
                    try {
                        C22737 c22737M31925 = C12887.m31925(c14069, c23330, c24975M34232);
                        try {
                            C8018 c8018M48177 = c21105.m48177();
                            try {
                                C12777.m31666(c22737M31925, c8018M48177);
                                c8018M48177.close();
                                if (m8256(c14069, j)) {
                                    C7667 c7667 = c14069.f44543;
                                    if (!c7667.m20900() && !c7667.m20905()) {
                                        if (!c7667.m20906(c23330.f75565, c21105) && !m8251(c14069, j, c23330)) {
                                            m8248(c14069, j);
                                        } else {
                                            m8252(c14069, j);
                                        }
                                    }
                                }
                                m8248(c14069, j);
                            } catch (Throwable th) {
                                try {
                                    c8018M48177.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Exception unused2) {
                            if (m8256(c14069, j)) {
                                C7667 c7668 = c14069.f44543;
                                if (!c7668.m20900() && !c7668.m20905()) {
                                    if (!c7668.m20898(c23330.f75565) && !m8251(c14069, j, c23330)) {
                                        m8248(c14069, j);
                                    } else {
                                        m8252(c14069, j);
                                    }
                                }
                                return false;
                            }
                            m8248(c14069, j);
                            return false;
                        }
                    } catch (C10186 unused3) {
                        m8248(c14069, j);
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m8251(C14069 c14069, long j, C23330 c23330) {
        if (m8256(c14069, j)) {
            EnumC6176 enumC6176M20903 = c14069.f44543.m20903(c23330.f75565);
            if (enumC6176M20903 == EnumC6176.UNAVAILABLE) {
                m8248(c14069, j);
                return false;
            }
            if (enumC6176M20903 == EnumC6176.OFFSET || enumC6176M20903 == EnumC6176.FAILURE) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m8256(C14069 c14069, long j) {
        boolean zM8255;
        synchronized (this.f7833) {
            zM8255 = m8255(c14069, j);
        }
        return zM8255;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8248(C14069 c14069, long j) {
        synchronized (this.f7833) {
            if (this.f7843 == c14069 && this.f7835 == j) {
                this.f7832 = true;
                this.f7845 = true;
                this.f7833.notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m8252(C14069 c14069, long j) {
        int i;
        synchronized (this.f7833) {
            if (this.f7843 == c14069 && this.f7835 == j) {
                int i2 = this.f7840 + 1;
                this.f7840 = i2;
                int size = c14069.f44553.size();
                int i3 = this.f7838;
                if (size > 0 && (i = (int) ((((long) i2) * 100) / ((long) size))) != i3) {
                    i3 = i;
                }
                this.f7838 = i3;
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m8257(C14069 c14069, long j) throws Throwable {
        int i;
        synchronized (this.f7833) {
            if (this.f7843 == c14069 && this.f7835 == j && (i = this.f7847) > 0) {
                boolean z = true;
                if (i > 1) {
                    this.f7847 = i - 1;
                    this.f7833.notifyAll();
                    return;
                }
                if (this.f7845 || this.f7832 || this.f7831 || this.f7830 < c14069.f44553.size()) {
                    z = false;
                }
                if (z && !c14069.f44543.m20900() && !c14069.f44543.m20905()) {
                    c14069.f44543.m20904(c14069.f44553);
                }
                String str = c14069.f44556;
                c14069.f44543.m20897();
                m8262(c14069, j);
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m8262(C14069 c14069, long j) throws Throwable {
        Thread[] threadArrM8258;
        boolean z;
        C14069 c140610;
        synchronized (this.f7833) {
            threadArrM8258 = null;
            z = false;
            if (this.f7835 == j && this.f7843 == c14069) {
                this.f7843 = null;
                this.f7846 = null;
                this.f7845 = false;
                this.f7832 = false;
                this.f7837 = false;
                this.f7844 = false;
                this.f7834 = false;
                this.f7847 = 0;
                this.f7841 = 0;
                this.f7830 = 0;
                this.f7840 = 0;
                this.f7838 = -1;
                if (!this.f7831 && this.f7848 == 0 && (c140610 = this.f7842) != null) {
                    this.f7842 = null;
                    threadArrM8258 = m8258(c140610);
                }
                this.f7833.notifyAll();
                z = true;
            }
        }
        m8259(threadArrM8258);
        if (z) {
            C1897.m6527((C1897) this.f7839.f21461, c14069);
        }
    }
}
