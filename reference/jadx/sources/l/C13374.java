package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۫᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4ZQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13374 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C19143 f42623;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C7210 f42624;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C4908 f42625;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C7956 f42626;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f42627;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int f42628;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f42629;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C5917 f42630;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7210 f42631;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f42632;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f42633;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C8701 f42634;

    /* JADX WARN: Code duplicated, block: B:29:0x0038 A[DONT_INVERT, PHI: r1
      0x0038: PHI (r1v9 'e' java.io.IOException) = 
      (r1v7 'e' java.io.IOException)
      (r1v7 'e' java.io.IOException)
      (r1v8 'e' java.io.IOException)
      (r1v7 'e' java.io.IOException)
     binds: [B:22:0x002a, B:28:0x0035, B:27:0x0033, B:23:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x003a A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:32:0x003c A[Catch: all -> 0x003d, TRY_ENTER, TryCatch #3 {, blocks: (B:4:0x0002, B:9:0x0009, B:10:0x0010, B:13:0x0018, B:15:0x001c, B:21:0x0028, B:23:0x002c, B:32:0x003c, B:28:0x0035, B:20:0x0025), top: B:42:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x003a, please report this as an issue */
    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        C7210 c7210;
        if (this.f42632) {
            return;
        }
        this.f42632 = true;
        this.f42626.close();
        try {
            this.f42634.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        C4908 c4908 = this.f42625;
        if (c4908 == null) {
            c7210 = this.f42624;
            if (c7210 != null) {
                if (e == null) {
                    return;
                } else {
                    throw e;
                }
            } else {
                c7210.close();
                if (e == null) {
                    return;
                } else {
                    throw e;
                }
            }
        }
        try {
            c4908.close();
        } catch (IOException e2) {
            if (e == null) {
                e = e2;
            } else {
                e.addSuppressed(e2);
            }
        }
        c7210 = this.f42624;
        if (c7210 != null) {
            if (e == null) {
                return;
            } else {
                throw e;
            }
        }
        try {
            c7210.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            } else {
                e.addSuppressed(e3);
            }
        }
        if (e == null) {
            return;
        } else {
            throw e;
        }
        throw th;
    }

    public C13374(C5917 c5917, C7210 c7210, C8701 c8701, C19143 c19143, C7956 c7956, int i, int i2, int i3) {
        this.f42630 = c5917;
        this.f42631 = c7210;
        this.f42634 = c8701;
        this.f42623 = c19143;
        this.f42626 = c7956;
        this.f42628 = i;
        this.f42627 = i2;
        this.f42629 = i3;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0046 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m32973(l.C18266 r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f42632     // Catch: java.lang.Throwable -> L81
            if (r0 != 0) goto L79
            boolean r0 = r4.f42633     // Catch: java.lang.Throwable -> L81
            if (r0 != 0) goto L79
            r0 = 1
            r4.f42633 = r0     // Catch: java.lang.Throwable -> L81
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L81
            r0 = 0
            l.۠ܳܳ r1 = r4.f42634     // Catch: java.lang.Throwable -> L51 java.lang.Error -> L53 java.lang.RuntimeException -> L55 java.io.IOException -> L57
            l.ۜܳܳ r1 = r1.m23394(r5)     // Catch: java.lang.Throwable -> L51 java.lang.Error -> L53 java.lang.RuntimeException -> L55 java.io.IOException -> L57
            l.۟ܳܳ r2 = r4.f42626     // Catch: java.lang.Error -> L40 java.lang.RuntimeException -> L42 java.io.IOException -> L44 java.lang.Throwable -> L51
            l.ۙ۫ܳ r5 = r2.m21659(r5)     // Catch: java.lang.Error -> L40 java.lang.RuntimeException -> L42 java.io.IOException -> L44 java.lang.Throwable -> L51
            monitor-enter(r4)     // Catch: java.lang.Error -> L48 java.lang.RuntimeException -> L4a java.io.IOException -> L4c java.lang.Throwable -> L51
            boolean r2 = r4.f42632     // Catch: java.lang.Throwable -> L3a
            if (r2 != 0) goto L32
            r4.f42624 = r1     // Catch: java.lang.Throwable -> L3a
            r4.f42625 = r5     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2f
            l.۟ܳܳ r5 = r4.f42626
            r5.close()
            l.۠ܳܳ r5 = r4.f42634     // Catch: java.io.IOException -> L2e
            r5.close()     // Catch: java.io.IOException -> L2e
        L2e:
            return
        L2f:
            r5 = move-exception
            r1 = r0
            goto L3e
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = "Paste request is closed"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L3a
            throw r0     // Catch: java.lang.Throwable -> L3a
        L3a:
            r0 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
        L3e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L46
            throw r5     // Catch: java.lang.Error -> L40 java.lang.RuntimeException -> L42 java.io.IOException -> L44 java.lang.Throwable -> L51
        L40:
            r5 = move-exception
            goto L59
        L42:
            r5 = move-exception
            goto L59
        L44:
            r5 = move-exception
            goto L59
        L46:
            r5 = move-exception
            goto L3e
        L48:
            r0 = move-exception
            goto L4d
        L4a:
            r0 = move-exception
            goto L4d
        L4c:
            r0 = move-exception
        L4d:
            r3 = r0
            r0 = r5
            r5 = r3
            goto L59
        L51:
            r5 = move-exception
            goto L6e
        L53:
            r5 = move-exception
            goto L58
        L55:
            r5 = move-exception
            goto L58
        L57:
            r5 = move-exception
        L58:
            r1 = r0
        L59:
            if (r0 == 0) goto L63
            r0.close()     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L5f
            goto L63
        L5f:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch: java.lang.Throwable -> L51
        L63:
            if (r1 == 0) goto L6d
            r1.close()     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L69
            goto L6d
        L69:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch: java.lang.Throwable -> L51
        L6d:
            throw r5     // Catch: java.lang.Throwable -> L51
        L6e:
            l.۟ܳܳ r0 = r4.f42626
            r0.close()
            l.۠ܳܳ r0 = r4.f42634     // Catch: java.io.IOException -> L78
            r0.close()     // Catch: java.io.IOException -> L78
        L78:
            throw r5
        L79:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = "Paste request is already consumed"
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L81
            throw r5     // Catch: java.lang.Throwable -> L81
        L81:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L81
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13374.m32973(l.ܿۤܳ):void");
    }
}
