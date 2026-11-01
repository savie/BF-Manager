package l;

/* JADX INFO: renamed from: l.۟֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K78T */
/* JADX INFO: loaded from: classes2.dex */
public final class C7149 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Thread[] f23889;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f23890;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f23891;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C21956 f23892;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f23893;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f23894;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f23895;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f23896;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f23897;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f23899;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f23900;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f23901;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f23902;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f23903;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C21956 f23904;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C22662 f23905;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f23906;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Object f23898 = new Object();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f23888 = -1;

    public C7149(C14578 c14578, C22851 c22851, C22662 c22662) {
        this.f23905 = c22662;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19073(C21956 c21956) throws Throwable {
        Thread[] threadArrM19065;
        synchronized (this.f23898) {
            if (!this.f23894 && !c21956.f71226 && !c21956.f71235.m42780()) {
                if (this.f23906 > 0) {
                    this.f23904 = c21956;
                    C21956 c21957 = this.f23892;
                    if ((c21957 != null) && c21957 != c21956) {
                        this.f23899 = true;
                        this.f23891 = true;
                        this.f23898.notifyAll();
                    }
                    return;
                }
                C21956 c21958 = this.f23892;
                if (c21958 != null) {
                    threadArrM19065 = null;
                    if (c21958 != c21956) {
                        this.f23904 = c21956;
                        this.f23899 = true;
                        this.f23891 = true;
                        this.f23898.notifyAll();
                    }
                } else {
                    threadArrM19065 = m19065(c21956);
                }
                m19069(threadArrM19065);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7855 m19072() {
        synchronized (this.f23898) {
            if (this.f23894) {
                return new C19144();
            }
            this.f23906++;
            boolean z = false;
            while (true) {
                int i = this.f23902;
                if (i <= 0 || this.f23900 >= i) {
                    break;
                }
                try {
                    this.f23898.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return new InterfaceC7855() { // from class: l.ۡ֫֨
                @Override // java.lang.AutoCloseable
                public final void close() throws Throwable {
                    C7149.m19058(this.f29588);
                }
            };
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m19077(C21956 c21956) {
        synchronized (this.f23898) {
            m19055(c21956);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m19075(C21956 c21956) {
        boolean z;
        synchronized (this.f23898) {
            m19055(c21956);
            z = false;
            while (this.f23892 == c21956) {
                try {
                    this.f23898.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m19055(C21956 c21956) {
        C21956 c21957 = this.f23892;
        if (c21957 == c21956 && c21957 != null) {
            this.f23899 = true;
            this.f23891 = true;
        }
        if (this.f23904 == c21956) {
            this.f23904 = null;
        }
        this.f23898.notifyAll();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m19074(String str) {
        C21956 c21956;
        boolean z;
        synchronized (this.f23898) {
            C21956 c21957 = this.f23892;
            z = (c21957 != null && c21957.f71244.equals(str)) || ((c21956 = this.f23904) != null && c21956.f71244.equals(str));
        }
        return z;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m19076() {
        boolean z;
        synchronized (this.f23898) {
            this.f23894 = true;
            this.f23899 = true;
            this.f23891 = true;
            this.f23904 = null;
            this.f23906 = 0;
            this.f23898.notifyAll();
            z = false;
            while (true) {
                if (!(this.f23892 != null)) {
                    break;
                }
                try {
                    this.f23898.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private Thread[] m19065(final C21956 c21956) {
        if (this.f23894 || c21956.f71226 || c21956.f71235.m42780()) {
            return null;
        }
        final long j = this.f23893 + 1;
        this.f23893 = j;
        Thread[] threadArr = new Thread[2];
        this.f23892 = c21956;
        this.f23889 = threadArr;
        this.f23897 = j;
        this.f23899 = false;
        this.f23891 = false;
        this.f23895 = false;
        this.f23903 = false;
        this.f23896 = false;
        this.f23900 = 0;
        this.f23902 = 2;
        this.f23890 = 0;
        this.f23901 = 0;
        this.f23888 = -1;
        c21956.f71221.size();
        int i = 0;
        while (i < 2) {
            final int i2 = i;
            Runnable runnable = new Runnable() { // from class: l.ۤ֫֨
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    C7149.m19059(this.f34080, c21956, j, i2);
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
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m19069(Thread[] threadArr) throws Throwable {
        int i;
        Throwable th;
        C21956 c21956;
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
                    synchronized (this.f23898) {
                        if (this.f23889 == threadArr) {
                            throw th;
                        }
                        this.f23891 = true;
                        this.f23899 = true;
                        this.f23902 = i;
                        this.f23896 = true;
                        c21956 = null;
                        if (i == 0) {
                            C21956 c21957 = this.f23892;
                            this.f23892 = null;
                            this.f23889 = null;
                            this.f23899 = false;
                            this.f23891 = false;
                            this.f23895 = false;
                            this.f23903 = false;
                            this.f23896 = false;
                            this.f23902 = 0;
                            this.f23900 = 0;
                            this.f23890 = 0;
                            this.f23901 = 0;
                            this.f23888 = -1;
                            c21956 = c21957;
                        }
                        this.f23898.notifyAll();
                        if (c21956 != null) {
                            throw th;
                        }
                        C7845.m20694((C7845) this.f23905.f73814, c21956);
                        throw th;
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    th = e;
                    synchronized (this.f23898) {
                        if (this.f23889 == threadArr) {
                            throw th;
                        }
                        this.f23891 = true;
                        this.f23899 = true;
                        this.f23902 = i;
                        this.f23896 = true;
                        c21956 = null;
                        if (i == 0) {
                            C21956 c21958 = this.f23892;
                            this.f23892 = null;
                            this.f23889 = null;
                            this.f23899 = false;
                            this.f23891 = false;
                            this.f23895 = false;
                            this.f23903 = false;
                            this.f23896 = false;
                            this.f23902 = 0;
                            this.f23900 = 0;
                            this.f23890 = 0;
                            this.f23901 = 0;
                            this.f23888 = -1;
                            c21956 = c21958;
                        }
                        this.f23898.notifyAll();
                        if (c21956 != null) {
                            throw th;
                        }
                        C7845.m20694((C7845) this.f23905.f73814, c21956);
                        throw th;
                    }
                }
            }
            m19062(threadArr);
        } catch (Error | RuntimeException e3) {
            e = e3;
            i = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19062(Thread[] threadArr) {
        synchronized (this.f23898) {
            if (this.f23889 == threadArr) {
                this.f23896 = true;
                this.f23898.notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19058(C7149 c7149) throws Throwable {
        Thread[] threadArrM19065;
        synchronized (c7149.f23898) {
            int i = c7149.f23906;
            if (i > 0) {
                c7149.f23906 = i - 1;
            }
            threadArrM19065 = null;
            if (c7149.f23906 == 0) {
                C21956 c21956 = c7149.f23904;
                if (c21956 != null) {
                    C21956 c21957 = c7149.f23892;
                    if (!(c21957 != null)) {
                        c7149.f23904 = null;
                        threadArrM19065 = c7149.m19065(c21956);
                    } else if (c21956 == c21957) {
                        c7149.f23904 = null;
                    } else {
                        c7149.f23899 = true;
                        c7149.f23891 = true;
                    }
                }
                c7149.f23898.notifyAll();
            }
        }
        c7149.m19069(threadArrM19065);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m19066(C21956 c21956, long j) {
        boolean zM19054;
        do {
            synchronized (this.f23898) {
                zM19054 = false;
                if (m19054(c21956, j)) {
                    boolean z = false;
                    while (this.f23906 > 0 && m19054(c21956, j)) {
                        if (!z) {
                            int i = this.f23900 + 1;
                            this.f23900 = i;
                            if (i == this.f23902 && !this.f23903) {
                                String str = c21956.f71244;
                                this.f23903 = true;
                            }
                            this.f23898.notifyAll();
                            z = true;
                        }
                        try {
                            this.f23898.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            this.f23899 = true;
                            this.f23891 = true;
                        }
                    }
                    if (z) {
                        int i2 = this.f23900 - 1;
                        this.f23900 = i2;
                        if (i2 < 0) {
                            this.f23900 = 0;
                        }
                        if (this.f23903 && this.f23900 == 0 && this.f23906 == 0 && m19054(c21956, j)) {
                            String str2 = c21956.f71244;
                            this.f23903 = false;
                        }
                        this.f23898.notifyAll();
                    }
                    zM19054 = m19054(c21956, j);
                }
            }
            if (!zM19054) {
                return;
            }
        } while (m19057(c21956, j));
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private boolean m19054(C21956 c21956, long j) {
        return (this.f23892 != c21956 || this.f23897 != j || this.f23899 || this.f23894 || this.f23891) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19061(C21956 c21956, long j, boolean z) {
        synchronized (this.f23898) {
            if (this.f23892 == c21956 && this.f23897 == j) {
                this.f23895 = true;
                if (!z) {
                    this.f23891 = true;
                    this.f23890 = c21956.f71221.size();
                }
                this.f23898.notifyAll();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0042  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m19070(C21956 c21956, long j) {
        boolean z;
        synchronized (this.f23898) {
            while (true) {
                z = true;
                if (this.f23892 != c21956 || this.f23897 != j || this.f23895 || this.f23899 || this.f23894) {
                    break;
                }
                try {
                    this.f23898.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    this.f23899 = true;
                    this.f23891 = true;
                    if (this.f23895) {
                        z = false;
                    } else {
                        z = false;
                    }
                    return z;
                }
            }
            if (this.f23895 || this.f23892 != c21956 || this.f23897 != j || this.f23899 || this.f23894) {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0042  */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m19067(C21956 c21956, long j) {
        boolean z;
        synchronized (this.f23898) {
            while (true) {
                z = true;
                if (this.f23892 != c21956 || this.f23897 != j || this.f23896 || this.f23899 || this.f23894) {
                    break;
                }
                try {
                    this.f23898.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    this.f23899 = true;
                    this.f23891 = true;
                    if (this.f23896) {
                        z = false;
                    } else {
                        z = false;
                    }
                    return z;
                }
            }
            if (this.f23896 || this.f23892 != c21956 || this.f23897 != j || this.f23899 || this.f23894) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19059(C7149 c7149, C21956 c21956, long j, int i) throws Throwable {
        boolean zM19070;
        try {
            if (!c7149.m19067(c21956, j)) {
                c7149.m19064(c21956, j);
                return;
            }
            if (i == 0) {
                zM19070 = false;
                try {
                    C18438 c18438 = c21956.f71235;
                    c18438.m42774();
                    if (!c18438.m42775() && !c18438.m42773(c21956.f71221) && !c18438.m42775()) {
                        zM19070 = true;
                    }
                    c7149.m19061(c21956, j, zM19070);
                } catch (Throwable th) {
                    c7149.m19061(c21956, j, false);
                    throw th;
                }
            } else {
                zM19070 = c7149.m19070(c21956, j);
            }
            if (zM19070) {
                c7149.m19066(c21956, j);
            }
            c7149.m19064(c21956, j);
        } catch (Throwable th2) {
            c7149.m19064(c21956, j);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private boolean m19057(C21956 c21956, long j) {
        int i;
        C17358 c17358 = new C17358();
        String str = null;
        C17684 c17684M48786 = null;
        while (true) {
            synchronized (this.f23898) {
                if (m19054(c21956, j)) {
                    if (this.f23906 > 0) {
                        i = -2;
                    } else if (this.f23890 < c21956.f71221.size()) {
                        int i2 = this.f23890;
                        this.f23890 = i2 + 1;
                        i = i2;
                    }
                }
                i = -1;
            }
            if (i == -2) {
                return true;
            }
            if (i != -1) {
                C5032 c5032 = (C5032) c21956.f71221.get(i);
                EnumC12794 enumC12794M42776 = c21956.f71235.m42776(c5032.f17548);
                if (enumC12794M42776 == EnumC12794.UNAVAILABLE) {
                    m19060(c21956, j);
                    return false;
                }
                if (enumC12794M42776 == EnumC12794.OFFSET || enumC12794M42776 == EnumC12794.FAILURE) {
                    m19068(c21956, j);
                } else {
                    if (!c5032.f17547.equals(str)) {
                        try {
                            c17684M48786 = c21956.m48786(c5032.f17547);
                            str = c5032.f17547;
                        } catch (C12731 unused) {
                            m19060(c21956, j);
                            return false;
                        }
                    }
                    try {
                        C7807 c7807M35046 = C14578.m35046(c21956, c5032, c17684M48786);
                        try {
                            C9856 c9856M40393 = c17358.m40393();
                            try {
                                C16191.m38283(c9856M40393, c7807M35046, new C20424());
                                c9856M40393.close();
                                if (m19071(c21956, j)) {
                                    C18438 c18438 = c21956.f71235;
                                    if (!c18438.m42775() && !c18438.m42778()) {
                                        if (!c18438.m42779(c5032.f17548, c17358) && !m19063(c21956, j, c5032)) {
                                            m19060(c21956, j);
                                        } else {
                                            m19068(c21956, j);
                                        }
                                    }
                                }
                                m19060(c21956, j);
                            } catch (Throwable th) {
                                try {
                                    c9856M40393.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Exception unused2) {
                            if (m19071(c21956, j)) {
                                C18438 c18439 = c21956.f71235;
                                if (!c18439.m42775() && !c18439.m42778()) {
                                    if (!c18439.m42772(c5032.f17548) && !m19063(c21956, j, c5032)) {
                                        m19060(c21956, j);
                                    } else {
                                        m19068(c21956, j);
                                    }
                                }
                                return false;
                            }
                            m19060(c21956, j);
                            return false;
                        }
                    } catch (C12731 unused3) {
                        m19060(c21956, j);
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m19063(C21956 c21956, long j, C5032 c5032) {
        if (m19071(c21956, j)) {
            EnumC12794 enumC12794M42776 = c21956.f71235.m42776(c5032.f17548);
            if (enumC12794M42776 == EnumC12794.UNAVAILABLE) {
                m19060(c21956, j);
                return false;
            }
            if (enumC12794M42776 == EnumC12794.OFFSET || enumC12794M42776 == EnumC12794.FAILURE) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private boolean m19071(C21956 c21956, long j) {
        boolean zM19054;
        synchronized (this.f23898) {
            zM19054 = m19054(c21956, j);
        }
        return zM19054;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19060(C21956 c21956, long j) {
        synchronized (this.f23898) {
            if (this.f23892 == c21956 && this.f23897 == j) {
                this.f23891 = true;
                this.f23899 = true;
                this.f23898.notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m19068(C21956 c21956, long j) {
        int i;
        synchronized (this.f23898) {
            if (this.f23892 == c21956 && this.f23897 == j) {
                int i2 = this.f23901 + 1;
                this.f23901 = i2;
                int size = c21956.f71221.size();
                int i3 = this.f23888;
                if (size > 0 && (i = (int) ((((long) i2) * 100) / ((long) size))) != i3) {
                    i3 = i;
                }
                this.f23888 = i3;
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m19064(C21956 c21956, long j) throws Throwable {
        int i;
        synchronized (this.f23898) {
            if (this.f23892 == c21956 && this.f23897 == j && (i = this.f23902) > 0) {
                boolean z = true;
                if (i > 1) {
                    this.f23902 = i - 1;
                    this.f23898.notifyAll();
                    return;
                }
                if (this.f23899 || this.f23891 || this.f23894 || this.f23890 < c21956.f71221.size()) {
                    z = false;
                }
                if (z && !c21956.f71235.m42775() && !c21956.f71235.m42778()) {
                    c21956.f71235.m42777(c21956.f71221);
                }
                String str = c21956.f71244;
                c21956.f71235.m42771();
                m19056(c21956, j);
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m19056(C21956 c21956, long j) throws Throwable {
        Thread[] threadArrM19065;
        boolean z;
        C21956 c21957;
        synchronized (this.f23898) {
            threadArrM19065 = null;
            z = false;
            if (this.f23897 == j && this.f23892 == c21956) {
                this.f23892 = null;
                this.f23889 = null;
                this.f23899 = false;
                this.f23891 = false;
                this.f23895 = false;
                this.f23903 = false;
                this.f23896 = false;
                this.f23902 = 0;
                this.f23900 = 0;
                this.f23890 = 0;
                this.f23901 = 0;
                this.f23888 = -1;
                if (!this.f23894 && this.f23906 == 0 && (c21957 = this.f23904) != null) {
                    this.f23904 = null;
                    threadArrM19065 = m19065(c21957);
                }
                this.f23898.notifyAll();
                z = true;
            }
        }
        m19069(threadArrM19065);
        if (z) {
            C7845.m20694((C7845) this.f23905.f73814, c21956);
        }
    }
}
