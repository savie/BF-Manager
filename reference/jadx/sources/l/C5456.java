package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ۚܺ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B749 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5456 implements InterfaceC3153 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public RunnableC0062 f18807;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f18808;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final int f18809;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C12257 f18810;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C9013 f18811;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final long f18812;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Thread f18813;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15785 f18814;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f18815;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public C2884 f18816;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Throwable f18817;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f18818;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f18819;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public RunnableC0062 f18820;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f18821;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f18822;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f18823;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C0219 f18824;

    public C5456(InterfaceC15785 interfaceC15785, C12257 c12257, long j, C0219 c0219) {
        C9013 c9013 = new C9013();
        this.f18822 = new Object();
        this.f18823 = new Object();
        if (j <= 0) {
            throw new IllegalArgumentException("MPEG-TS segment length must be positive");
        }
        int iMin = (int) ((Math.min(j, 524144) / 188) * 188);
        if (iMin < 940) {
            throw new IllegalArgumentException("MPEG-TS segment is too short to preview");
        }
        this.f18814 = interfaceC15785;
        this.f18810 = c12257;
        this.f18812 = j;
        this.f18809 = iMin;
        this.f18824 = c0219;
        this.f18811 = c9013;
    }

    @Override // l.InterfaceC3153
    public final long length() {
        m15124();
        return this.f18808;
    }

    @Override // l.InterfaceC3153
    /* JADX INFO: renamed from: ܰ */
    public final void mo9547(long j, byte[] bArr, int i, int i2) {
        m15124();
        synchronized (this.f18823) {
            m15117();
            if (j < 0 || i < 0 || i2 < 0 || i > bArr.length - i2 || j > ((long) this.f18808) - ((long) i2)) {
                throw new EOFException("MPEG-TS preview read exceeds clip length");
            }
            byte[] bArr2 = this.f18819;
            if (bArr2 == null) {
                throw new InterruptedIOException("MPEG-TS preview clip was closed");
            }
            System.arraycopy(bArr2, (int) j, bArr, i, i2);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0069 */
    /* JADX WARN: Code duplicated, block: B:106:? A[Catch: all -> 0x00a4, SYNTHETIC, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000a, B:9:0x000c, B:11:0x0010, B:12:0x0015, B:13:0x001a, B:23:0x0048, B:24:0x004a, B:29:0x0056, B:33:0x005a, B:68:0x0086, B:69:0x0088, B:75:0x0096, B:76:0x009d, B:79:0x00a0, B:82:0x00a3, B:14:0x001b, B:15:0x0024, B:25:0x004b, B:27:0x0053, B:28:0x0055, B:70:0x0089, B:72:0x0091, B:73:0x0093), top: B:89:0x0003, inners: #0, #13, #16 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0091 A[Catch: all -> 0x009e, TryCatch #16 {, blocks: (B:70:0x0089, B:72:0x0091, B:73:0x0093), top: B:96:0x0089, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0096 A[Catch: all -> 0x00a4, TRY_ENTER, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000a, B:9:0x000c, B:11:0x0010, B:12:0x0015, B:13:0x001a, B:23:0x0048, B:24:0x004a, B:29:0x0056, B:33:0x005a, B:68:0x0086, B:69:0x0088, B:75:0x0096, B:76:0x009d, B:79:0x00a0, B:82:0x00a3, B:14:0x001b, B:15:0x0024, B:25:0x004b, B:27:0x0053, B:28:0x0055, B:70:0x0089, B:72:0x0091, B:73:0x0093), top: B:89:0x0003, inners: #0, #13, #16 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        r1 = r8.f18823;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r8.f18813 != java.lang.Thread.currentThread()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        r8.f18813 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m15124() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f18822
            monitor-enter(r0)
            boolean r1 = r8.f18815     // Catch: java.lang.Throwable -> La4
            if (r1 == 0) goto Lc
            r8.m15117()     // Catch: java.lang.Throwable -> La4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La4
            return
        Lc:
            boolean r1 = r8.f18821     // Catch: java.lang.Throwable -> La4
            if (r1 == 0) goto L15
            java.lang.Throwable r1 = r8.f18817     // Catch: java.lang.Throwable -> La4
            m15121(r1)     // Catch: java.lang.Throwable -> La4
        L15:
            r2 = 1
            r8.f18821 = r2     // Catch: java.lang.Throwable -> La4
            java.lang.Object r1 = r8.f18823     // Catch: java.lang.Throwable -> La4
            monitor-enter(r1)     // Catch: java.lang.Throwable -> La4
            r8.m15117()     // Catch: java.lang.Throwable -> La1
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> La1
            r8.f18813 = r3     // Catch: java.lang.Throwable -> La1
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La1
            r3 = 0
            r8.m15117()     // Catch: java.lang.Throwable -> L75 java.lang.Error -> L7a java.lang.RuntimeException -> L7c java.io.IOException -> L7e
            l.ۗ᩷۬ r4 = r8.m15120()     // Catch: java.lang.Throwable -> L75 java.lang.Error -> L7a java.lang.RuntimeException -> L7c java.io.IOException -> L7e
            java.lang.Object r1 = r8.f18823     // Catch: java.lang.Throwable -> L6b java.lang.Error -> L6e java.lang.RuntimeException -> L71 java.io.IOException -> L73
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L6b java.lang.Error -> L6e java.lang.RuntimeException -> L71 java.io.IOException -> L73
            r8.m15117()     // Catch: java.lang.Throwable -> L5f
            byte[] r5 = l.C3484.m10216(r4)     // Catch: java.lang.Throwable -> L5f
            r8.f18819 = r5     // Catch: java.lang.Throwable -> L5f
            int r5 = l.C3484.m10218(r4)     // Catch: java.lang.Throwable -> L5f
            r8.f18808 = r5     // Catch: java.lang.Throwable -> L5f
            l.ۗ֡۬ r5 = l.C3484.m10217(r4)     // Catch: java.lang.Throwable -> L5f
            r8.f18816 = r5     // Catch: java.lang.Throwable -> L5f
            r8.f18815 = r2     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r1 = r8.f18823     // Catch: java.lang.Throwable -> La4
            monitor-enter(r1)     // Catch: java.lang.Throwable -> La4
            java.lang.Thread r2 = r8.f18813     // Catch: java.lang.Throwable -> L58
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L58
            if (r2 != r4) goto L55
            r8.f18813 = r3     // Catch: java.lang.Throwable -> L58
        L55:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La4
            return
        L58:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            throw r2     // Catch: java.lang.Throwable -> La4
        L5b:
            r2 = move-exception
            r5 = r8
            r4 = r3
            goto L61
        L5f:
            r2 = move-exception
            r5 = r8
        L61:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L69
            throw r2     // Catch: java.lang.Error -> L63 java.lang.RuntimeException -> L65 java.io.IOException -> L67 java.lang.Throwable -> L84
        L63:
            r1 = move-exception
            goto L81
        L65:
            r1 = move-exception
            goto L81
        L67:
            r1 = move-exception
            goto L81
        L69:
            r2 = move-exception
            goto L61
        L6b:
            r1 = move-exception
            r5 = r8
            goto L85
        L6e:
            r1 = move-exception
        L6f:
            r5 = r8
            goto L81
        L71:
            r1 = move-exception
            goto L6f
        L73:
            r1 = move-exception
            goto L6f
        L75:
            r1 = move-exception
            r5 = r8
            r2 = r1
            r4 = r3
            goto L86
        L7a:
            r1 = move-exception
            goto L7f
        L7c:
            r1 = move-exception
            goto L7f
        L7e:
            r1 = move-exception
        L7f:
            r5 = r8
            r4 = r3
        L81:
            r5.f18817 = r1     // Catch: java.lang.Throwable -> L84
            throw r1     // Catch: java.lang.Throwable -> L84
        L84:
            r1 = move-exception
        L85:
            r2 = r1
        L86:
            java.lang.Object r1 = r5.f18823     // Catch: java.lang.Throwable -> La4
            monitor-enter(r1)     // Catch: java.lang.Throwable -> La4
            java.lang.Thread r6 = r5.f18813     // Catch: java.lang.Throwable -> L9e
            java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L9e
            if (r6 != r7) goto L93
            r5.f18813 = r3     // Catch: java.lang.Throwable -> L9e
        L93:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9e
            if (r4 == 0) goto L9d
            l.ۗ֡۬ r1 = l.C3484.m10217(r4)     // Catch: java.lang.Throwable -> La4
            r1.close()     // Catch: java.lang.Throwable -> La4
        L9d:
            throw r2     // Catch: java.lang.Throwable -> La4
        L9e:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9e
            throw r2     // Catch: java.lang.Throwable -> La4
        La1:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La1
            throw r2     // Catch: java.lang.Throwable -> La4
        La4:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La4
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5456.m15124():void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C3484 m15120() throws IOException {
        C4771 c4771M13236 = C4771.m13236();
        int i = this.f18809;
        C2884 c2884M13240 = c4771M13236.m13240(i);
        if (c2884M13240 == null) {
            throw new IOException("MPEG-TS preview memory budget is exhausted");
        }
        try {
            byte[] bArr = new byte[i];
            C16490 c16490M30477 = this.f18810.m30477();
            long j = i;
            c16490M30477.m38755(j);
            RunnableC0062 runnableC0062M15119 = m15119(c16490M30477.m38753());
            Throwable th = null;
            try {
                try {
                    long jM978 = runnableC0062M15119.m978();
                    if (jM978 != -1 && jM978 < j) {
                        throw new EOFException("MPEG-TS preview source is shorter than expected");
                    }
                    C4750 c4750 = new C4750(this.f18814, bArr, this.f18809, this.f18812, new C9836(this));
                    C14984 c14984 = new C14984(c4750, 0L, this.f18812);
                    C13924 c13924 = new C13924();
                    C15130 c15130M23331 = this.f18811.m23331();
                    if (!c15130M23331.mo2754(c14984)) {
                        throw new IOException("MPEG-TS preview source could not be recognized");
                    }
                    if (m15118(c4750.m13123(), bArr) < 0) {
                        throw new IOException("MPEG-TS preview packet alignment is invalid");
                    }
                    c14984.mo19217();
                    c15130M23331.mo2753(c13924);
                    C0954 c0954 = new C0954();
                    while (!c13924.m33761()) {
                        m15117();
                        int iMo2750 = c15130M23331.mo2750(c14984, c0954);
                        if (iMo2750 == 1) {
                            throw new IOException("Unexpected seek while scanning MPEG-TS preview");
                        }
                        if (iMo2750 == -1) {
                            break;
                        }
                    }
                    if (!c13924.m33761()) {
                        throw new IOException("No decodable video keyframe found in MPEG-TS preview");
                    }
                    int iM15118 = m15118(c4750.m13123(), bArr);
                    int iM13123 = (((c4750.m13123() - iM15118) / 188) * 188) + iM15118;
                    if (iM13123 <= 0) {
                        throw new IOException("MPEG-TS preview does not contain a complete packet");
                    }
                    C3484 c3484 = new C3484(iM13123, c13924.m33762(), c2884M13240, bArr);
                    try {
                        try {
                            runnableC0062M15119.m979();
                            m15122(runnableC0062M15119);
                            return c3484;
                        } catch (Throwable th2) {
                            m15122(runnableC0062M15119);
                            throw th2;
                        }
                    } catch (IOException | Error | RuntimeException e) {
                        throw e;
                    }
                } catch (Throwable th3) {
                    try {
                        try {
                            runnableC0062M15119.m979();
                        } catch (Throwable th4) {
                            m15122(runnableC0062M15119);
                            throw th4;
                        }
                    } catch (IOException | Error | RuntimeException e2) {
                        if (0 != 0 && null != e2) {
                            th.addSuppressed(e2);
                        } else if (0 == 0) {
                            throw e2;
                        }
                    }
                    m15122(runnableC0062M15119);
                    throw th3;
                }
            } catch (IOException | Error | RuntimeException e3) {
                throw e3;
            }
        } catch (Throwable th5) {
            c2884M13240.close();
            throw th5;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0069 */
    /* JADX WARN: Code duplicated, block: B:55:0x0075 A[Catch: all -> 0x007c, TRY_ENTER, TryCatch #9 {all -> 0x007c, blocks: (B:55:0x0075, B:56:0x0079), top: B:88:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0079 A[Catch: all -> 0x007c, TRY_LEAVE, TryCatch #9 {all -> 0x007c, blocks: (B:55:0x0075, B:56:0x0079), top: B:88:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0083 A[Catch: all -> 0x0087, TryCatch #4 {, blocks: (B:59:0x007f, B:61:0x0083, B:62:0x0085), top: B:77:0x007f }] */
    /* JADX WARN: Code duplicated, block: B:67:0x008a  */
    /* JADX WARN: Code duplicated, block: B:77:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r7.f18818 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        if (r7.f18807 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r1.m976() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        r7.f18807 = null;
        r7.f18820 = r1;
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (r2 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r2 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        r1.m980();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
    
        throw new java.io.InterruptedIOException("MPEG-TS preview read was canceled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0055, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0056, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        r1.m977();
        r0 = r7.f18823;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.RunnableC0062 m15119(l.C12257 r8) throws java.lang.Throwable {
        /*
            r7 = this;
            l.֡֡۬ r1 = new l.֡֡۬
            l.ܺ۟ۙ r0 = r7.f18814
            java.util.concurrent.ThreadPoolExecutor r2 = l.C13945.m33792()
            r1.<init>(r0, r8, r2)
            r8 = 0
            r2 = 0
            java.lang.Object r0 = r7.f18823     // Catch: java.lang.Throwable -> L6b
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L6b
            r7.m15117()     // Catch: java.lang.Throwable -> L5d
            r7.f18807 = r1     // Catch: java.lang.Throwable -> L5d
            r3 = 1
            r1.m981()     // Catch: java.lang.Throwable -> L58
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L58
            r1.m977()     // Catch: java.lang.Throwable -> L55
            java.lang.Object r0 = r7.f18823     // Catch: java.lang.Throwable -> L55
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L55
            boolean r4 = r7.f18818     // Catch: java.lang.Throwable -> L52
            if (r4 != 0) goto L33
            l.֡֡۬ r4 = r7.f18807     // Catch: java.lang.Throwable -> L52
            if (r4 != r1) goto L33
            boolean r4 = r1.m976()     // Catch: java.lang.Throwable -> L52
            if (r4 == 0) goto L33
            r7.f18807 = r8     // Catch: java.lang.Throwable -> L52
            r7.f18820 = r1     // Catch: java.lang.Throwable -> L52
            r2 = 1
        L33:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L4a
            if (r2 != 0) goto L49
            r1.m980()     // Catch: java.lang.Throwable -> L3b
        L3b:
            java.lang.Object r0 = r7.f18823
            monitor-enter(r0)
            l.֡֡۬ r2 = r7.f18807     // Catch: java.lang.Throwable -> L46
            if (r2 != r1) goto L44
            r7.f18807 = r8     // Catch: java.lang.Throwable -> L46
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            goto L49
        L46:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r8
        L49:
            return r1
        L4a:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = "MPEG-TS preview read was canceled"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L55
            throw r0     // Catch: java.lang.Throwable -> L55
        L52:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            throw r4     // Catch: java.lang.Throwable -> L55
        L55:
            r0 = move-exception
            r5 = r7
            goto L64
        L58:
            r4 = move-exception
            r5 = r7
            r3 = r4
            r4 = 1
            goto L60
        L5d:
            r3 = move-exception
            r4 = 0
            r5 = r7
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
            throw r3     // Catch: java.lang.Throwable -> L62
        L62:
            r0 = move-exception
            r3 = r4
        L64:
            r6 = r1
            r1 = r0
            r0 = r2
            r2 = r6
            goto L71
        L69:
            r3 = move-exception
            goto L60
        L6b:
            r0 = move-exception
            r3 = 0
            r5 = r7
            r2 = r1
            r1 = r0
            r0 = 0
        L71:
            if (r0 != 0) goto L8a
            if (r3 == 0) goto L79
            r2.m980()     // Catch: java.lang.Throwable -> L7c
            goto L7c
        L79:
            r2.m979()     // Catch: java.lang.Throwable -> L7c
        L7c:
            java.lang.Object r0 = r5.f18823
            monitor-enter(r0)
            l.֡֡۬ r3 = r5.f18807     // Catch: java.lang.Throwable -> L87
            if (r3 != r2) goto L85
            r5.f18807 = r8     // Catch: java.lang.Throwable -> L87
        L85:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            goto L8a
        L87:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            throw r8
        L8a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5456.m15119(l.۫۟ۙ):l.֡֡۬");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15122(RunnableC0062 runnableC0062) {
        synchronized (this.f18823) {
            if (this.f18820 == runnableC0062) {
                this.f18820 = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0038  */
    /* JADX WARN: Code duplicated, block: B:41:0x004d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        RunnableC0062 runnableC0062;
        RunnableC0062 runnableC0063;
        Thread thread;
        C2884 c2884;
        synchronized (this.f18823) {
            this.f18818 = true;
            runnableC0062 = this.f18807;
            runnableC0063 = this.f18820;
            thread = this.f18813;
        }
        if (runnableC0062 != null) {
            try {
                runnableC0062.m980();
            } catch (Throwable th) {
                th = th;
            }
        }
        th = null;
        if (thread != null && thread != Thread.currentThread()) {
            thread.interrupt();
        }
        if (runnableC0063 != null) {
            try {
                runnableC0063.m979();
            } catch (Throwable th2) {
                th = th2;
                if (th != null) {
                    if (th != th) {
                        th.addSuppressed(th);
                    }
                }
                if (thread != Thread.currentThread()) {
                    synchronized (this.f18822) {
                    }
                }
                synchronized (this.f18823) {
                    this.f18819 = null;
                    c2884 = this.f18816;
                    this.f18816 = null;
                    if (c2884 != null) {
                        c2884.close();
                    }
                    m15121(th);
                }
            }
        }
        th = th;
        if (thread != Thread.currentThread()) {
            synchronized (this.f18822) {
            }
        }
        synchronized (this.f18823) {
            this.f18819 = null;
            c2884 = this.f18816;
            this.f18816 = null;
        }
        if (c2884 != null) {
            c2884.close();
        }
        m15121(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void m15117() throws InterruptedIOException {
        if (this.f18818 || Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("MPEG-TS preview read was canceled");
        }
        this.f18824.getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m15118(int i, byte[] bArr) {
        int iMin = Math.min(187, i - 940);
        for (int i2 = 0; i2 <= iMin; i2++) {
            for (int i3 = 0; i3 < 5; i3++) {
                if ((bArr[(i3 * 188) + i2] & 255) != 71) {
                }
            }
            return i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15121(Throwable th) throws IOException {
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (th != null) {
            throw new IOException("MPEG-TS preview operation failed", th);
        }
    }
}
