package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4ZQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4558 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f16181;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f16182;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C13732 f16183;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C11690 f16184;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C6750 f16185;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f16186;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C15218 f16187;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C6750 f16188;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2516 f16189;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f16190;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3927 f16191;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f16192;

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
        C6750 c6750;
        if (this.f16181) {
            return;
        }
        this.f16181 = true;
        this.f16184.close();
        try {
            this.f16191.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        C15218 c15218 = this.f16187;
        if (c15218 == null) {
            c6750 = this.f16185;
            if (c6750 != null) {
                if (e == null) {
                    return;
                } else {
                    throw e;
                }
            } else {
                c6750.close();
                if (e == null) {
                    return;
                } else {
                    throw e;
                }
            }
        }
        try {
            c15218.close();
        } catch (IOException e2) {
            if (e == null) {
                e = e2;
            } else {
                e.addSuppressed(e2);
            }
        }
        c6750 = this.f16185;
        if (c6750 != null) {
            if (e == null) {
                return;
            } else {
                throw e;
            }
        }
        try {
            c6750.close();
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

    public C4558(C13732 c13732, C6750 c6750, C3927 c3927, C2516 c2516, C11690 c11690, int i, int i2, int i3) {
        this.f16183 = c13732;
        this.f16188 = c6750;
        this.f16191 = c3927;
        this.f16189 = c2516;
        this.f16184 = c11690;
        this.f16182 = i;
        this.f16186 = i2;
        this.f16192 = i3;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0046 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m12707(l.C0843 r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f16181     // Catch: java.lang.Throwable -> L81
            if (r0 != 0) goto L79
            boolean r0 = r4.f16190     // Catch: java.lang.Throwable -> L81
            if (r0 != 0) goto L79
            r0 = 1
            r4.f16190 = r0     // Catch: java.lang.Throwable -> L81
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L81
            r0 = 0
            l.ۘۨ᩹ r1 = r4.f16191     // Catch: java.lang.Throwable -> L51 java.lang.Error -> L53 java.lang.RuntimeException -> L55 java.io.IOException -> L57
            l.ۜۨ᩹ r1 = r1.m11404(r5)     // Catch: java.lang.Throwable -> L51 java.lang.Error -> L53 java.lang.RuntimeException -> L55 java.io.IOException -> L57
            l.ۨۨ᩹ r2 = r4.f16184     // Catch: java.lang.Error -> L40 java.lang.RuntimeException -> L42 java.io.IOException -> L44 java.lang.Throwable -> L51
            l.ܶۨ᩹ r5 = r2.m29189(r5)     // Catch: java.lang.Error -> L40 java.lang.RuntimeException -> L42 java.io.IOException -> L44 java.lang.Throwable -> L51
            monitor-enter(r4)     // Catch: java.lang.Error -> L48 java.lang.RuntimeException -> L4a java.io.IOException -> L4c java.lang.Throwable -> L51
            boolean r2 = r4.f16181     // Catch: java.lang.Throwable -> L3a
            if (r2 != 0) goto L32
            r4.f16185 = r1     // Catch: java.lang.Throwable -> L3a
            r4.f16187 = r5     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2f
            l.ۨۨ᩹ r5 = r4.f16184
            r5.close()
            l.ۘۨ᩹ r5 = r4.f16191     // Catch: java.io.IOException -> L2e
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
            l.ۨۨ᩹ r0 = r4.f16184
            r0.close()
            l.ۘۨ᩹ r0 = r4.f16191     // Catch: java.io.IOException -> L78
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
        throw new UnsupportedOperationException("Method not decompiled: l.C4558.m12707(l.֨ۗۚ):void");
    }
}
