package l;

import java.io.DataInput;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.֫ۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: MIRA */
/* JADX INFO: loaded from: classes2.dex */
public final class C1685 {
    /* JADX WARN: Bottom block not found for handler: all -> 0x0087 */
    /* JADX WARN: Code duplicated, block: B:104:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m6035(final l.C16774 r18, l.C4842 r19, final l.C1442 r20, final l.C1442 r21, final boolean r22, final boolean r23, final l.C16028 r24, final l.C16028 r25, java.util.concurrent.Executor r26) throws java.lang.Throwable {
        /*
            r1 = r19
            r2 = 0
            monitor-enter(r19)     // Catch: java.lang.Error -> La1 java.lang.RuntimeException -> La3 java.io.IOException -> La5
            l.ᩳܳܳ r3 = r1.f16913     // Catch: java.lang.Throwable -> L92
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L92
            l.ᩳܳܳ r4 = r1.f16907     // Catch: java.lang.Throwable -> L89
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L89
            l.۬ۙܳ r15 = r19.m14875()     // Catch: java.lang.Throwable -> L7a
            l.۠ۙܳ r0 = r15.f43255     // Catch: java.lang.Throwable -> L7a
            int r0 = r0.f27510     // Catch: java.lang.Throwable -> L7a
            r5 = 1000000(0xf4240, float:1.401298E-39)
            if (r0 > r5) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            java.lang.String r5 = "Comparison checkpoint exceeds span limit"
            m6032(r5, r0)     // Catch: java.lang.Throwable -> L7a
            l.ᩳܳܳ r0 = r1.f16913     // Catch: java.lang.Throwable -> L7a
            l.۬ᩴܳ r16 = r0.m44369()     // Catch: java.lang.Throwable -> L7a
            l.ᩳܳܳ r0 = r1.f16907     // Catch: java.lang.Throwable -> L75
            l.۬ᩴܳ r2 = r0.m44369()     // Catch: java.lang.Throwable -> L75
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L75
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r19)     // Catch: java.lang.Throwable -> L66
            long r0 = r16.m34223()     // Catch: java.lang.Error -> L5a java.lang.RuntimeException -> L5e java.io.IOException -> L60
            r4 = r18
            r4.m39600(r0)     // Catch: java.lang.Error -> L54 java.lang.RuntimeException -> L56 java.io.IOException -> L58
            l.ᩴۙܳ r0 = new l.ᩴۙܳ     // Catch: java.lang.Error -> L54 java.lang.RuntimeException -> L56 java.io.IOException -> L58
            r5 = r0
            r6 = r16
            r7 = r2
            r8 = r18
            r9 = r20
            r10 = r22
            r11 = r24
            r12 = r21
            r13 = r23
            r14 = r25
            r5.<init>()     // Catch: java.lang.Error -> L54 java.lang.RuntimeException -> L56 java.io.IOException -> L58
            r1 = r26
            r1.execute(r0)     // Catch: java.lang.Error -> L54 java.lang.RuntimeException -> L56 java.io.IOException -> L58
            return
        L54:
            r0 = move-exception
            goto L62
        L56:
            r0 = move-exception
            goto L62
        L58:
            r0 = move-exception
            goto L62
        L5a:
            r0 = move-exception
        L5b:
            r4 = r18
            goto L62
        L5e:
            r0 = move-exception
            goto L5b
        L60:
            r0 = move-exception
            goto L5b
        L62:
            r3 = r2
            r2 = r16
            goto L9d
        L66:
            r0 = move-exception
            r4 = r18
            r3 = r2
            r2 = r16
            goto L96
        L6d:
            r0 = move-exception
            r4 = r18
            r5 = r3
            r3 = r2
            r2 = r16
            goto L8e
        L75:
            r0 = move-exception
            r5 = r2
            r2 = r16
            goto L7c
        L7a:
            r0 = move-exception
            r5 = r2
        L7c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L87
            throw r0     // Catch: java.lang.Throwable -> L7e
        L7e:
            r0 = move-exception
            r4 = r18
            r17 = r5
            r5 = r3
            r3 = r17
            goto L8e
        L87:
            r0 = move-exception
            goto L7c
        L89:
            r0 = move-exception
            r4 = r18
            r5 = r3
            r3 = r2
        L8e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L90
            throw r0     // Catch: java.lang.Throwable -> L9f
        L90:
            r0 = move-exception
            goto L8e
        L92:
            r0 = move-exception
            r4 = r18
            r3 = r2
        L96:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9f
            throw r0     // Catch: java.lang.Error -> L98 java.lang.RuntimeException -> L9a java.io.IOException -> L9c
        L98:
            r0 = move-exception
            goto L9d
        L9a:
            r0 = move-exception
            goto L9d
        L9c:
            r0 = move-exception
        L9d:
            r1 = r0
            goto Laa
        L9f:
            r0 = move-exception
            goto L96
        La1:
            r0 = move-exception
            goto La6
        La3:
            r0 = move-exception
            goto La6
        La5:
            r0 = move-exception
        La6:
            r4 = r18
            r1 = r0
            r3 = r2
        Laa:
            if (r2 == 0) goto Lb5
            r2.close()     // Catch: java.io.IOException -> Lb0
            goto Lb5
        Lb0:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)
        Lb5:
            if (r3 == 0) goto Lc0
            r3.close()     // Catch: java.io.IOException -> Lbb
            goto Lc0
        Lbb:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)
        Lc0:
            r4.m39601(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1685.m6035(l.ܺۤܳ, l.ۙۤܳ, l.֨᩷ܳ, l.֨᩷ܳ, boolean, boolean, l.ܶۤܳ, l.ܶۤܳ, java.util.concurrent.Executor):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6034(C14053 c14053, C14053 c14054, C16774 c16774, C1442 c1442, boolean z, C16028 c16028, C1442 c1443, boolean z2, C16028 c16029, C13616 c13616) {
        C8396 c8396 = c13616.f43255;
        try {
            try {
                try {
                    C13136 c13136 = new C13136(c16774.m39608(), c16774);
                    try {
                        DataOutputStream dataOutputStream = new DataOutputStream(c13136);
                        try {
                            dataOutputStream.writeInt(1212370993);
                            m6031(dataOutputStream, c1442, z, c16028, c14053);
                            m6031(dataOutputStream, c1443, z2, c16029, c14054);
                            dataOutputStream.writeInt(c8396.f27510);
                            C2430 c2430 = new C2430(c8396);
                            while (c2430.hasNext()) {
                                C9141 c9141 = (C9141) c2430.next();
                                dataOutputStream.writeByte(c9141.f29712);
                                dataOutputStream.writeInt(c9141.f29713);
                                dataOutputStream.writeInt(c9141.f29710);
                            }
                            dataOutputStream.writeInt(826495048);
                            dataOutputStream.flush();
                            long jM32649 = c13136.m32649();
                            c13136.m32650();
                            dataOutputStream.writeLong(jM32649);
                            dataOutputStream.close();
                            c13136.close();
                            c16774.m39603(false);
                            c14054.close();
                            c14053.close();
                        } catch (Throwable th) {
                            try {
                                dataOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            c13136.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        c14053.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                try {
                    c14054.close();
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                }
                throw th7;
            }
        } catch (Throwable th9) {
            c16774.m39601(th9);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6031(DataOutputStream dataOutputStream, C1442 c1442, boolean z, C16028 c16028, C14053 c14053) throws IOException {
        C11644.m29267(dataOutputStream, c1442.m5189());
        C11644.m29267(dataOutputStream, c1442.m5190());
        dataOutputStream.writeLong(c1442.m5194().m18524());
        dataOutputStream.writeLong(c1442.m5194().m18522());
        dataOutputStream.writeBoolean(z);
        if (!z) {
            C11644.m29267(dataOutputStream, c16028.m38187());
            C6597 c6597M18521 = C6597.m18521(c16028.m38189());
            dataOutputStream.writeLong(c6597M18521.m18524());
            dataOutputStream.writeLong(c6597M18521.m18522());
        }
        c14053.m34224(dataOutputStream);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0189 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x019e */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C12871 m6030(l.C16028 r28, l.AbstractC22044 r29, l.AbstractC22044 r30, l.C2695 r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1685.m6030(l.ܶۤܳ, l.᩷ۨᩴ, l.᩷ۨᩴ, l.ۖ۬ᩴ):l.۫ۙܳ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5414 m6029(DataInput dataInput, AbstractC22044 abstractC22044, final C16028 c16028, final C15373 c15373, C2695 c2695) throws Throwable {
        C1442 c1442M5188;
        C16028 c16028M38171;
        AbstractC22044 abstractC22044M38189;
        m6032("Comparison target mismatch", C11644.m29263(dataInput).equals(abstractC22044.mo4294()));
        String strM29263 = C11644.m29263(dataInput);
        C19849 c19849 = (C19849) dataInput;
        C6597 c6597 = new C6597(c19849.readLong(), c19849.readLong());
        boolean z = c19849.readBoolean();
        if (z) {
            c1442M5188 = C1442.m5184(abstractC22044, strM29263, c6597);
        } else {
            c1442M5188 = C1442.m5188(abstractC22044, strM29263, c6597);
        }
        if (z) {
            abstractC22044M38189 = c1442M5188.m5193();
            c16028M38171 = null;
        } else {
            c16028M38171 = C16028.m38171(C11644.m29263(dataInput), c2695);
            abstractC22044M38189 = c16028M38171.m38189();
            c6597 = new C6597(c19849.readLong(), c19849.readLong());
        }
        boolean z2 = false;
        m6032("Invalid comparison backing", abstractC22044M38189.mo4295() && !abstractC22044M38189.m49860());
        C13111 c13111M32574 = C13111.m32574(abstractC22044M38189.mo4275());
        try {
            m6032("Comparison backing revision mismatch", c6597.equals(c13111M32574.m32577()));
            try {
                return new C5414(C19143.m44297(c13111M32574, dataInput, new InterfaceC2867() { // from class: l.ܳۙܳ
                    @Override // l.InterfaceC2867
                    public final InterfaceC9578 create() {
                        return c16028.m38181(new C22833(c15373));
                    }
                }), c1442M5188, z, c16028M38171);
            } catch (Throwable th) {
                th = th;
                z2 = true;
                if (!z2) {
                    c13111M32574.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6032(String str, boolean z) throws IOException {
        if (!z) {
            throw new IOException(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6033(C5414 c5414) {
        try {
            c5414.f18905.close();
        } catch (IOException unused) {
        }
    }
}
