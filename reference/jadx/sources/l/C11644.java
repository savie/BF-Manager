package l;

import android.os.AsyncTask;
import java.io.DataInput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۧ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70J */
/* JADX INFO: loaded from: classes3.dex */
public final class C11644 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Executor f37669 = AsyncTask.THREAD_POOL_EXECUTOR;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Executor m29264() {
        return f37669;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16774 m29266(final C16028 c16028, final C1442 c1442, final boolean z, C19143 c19143, final boolean z2, final boolean z3, final boolean z4, Executor executor) throws Throwable {
        C17359.requireNonNull(c1442, "target");
        C17359.requireNonNull(executor, "executor");
        if (z && !z2) {
            throw new IllegalArgumentException("Direct source does not need a lightweight checkpoint");
        }
        if (z3 && (z || z2 || c19143.m44379() || c19143.length() != Integer.MAX_VALUE)) {
            throw new IllegalArgumentException("Invalid partial hex checkpoint");
        }
        final C16774 c16774M38182 = c16028.m38182();
        try {
            try {
                if (z2) {
                    C14053 c14053M44369 = c19143.m44369();
                    try {
                        c16774M38182.m39602(c14053M44369);
                    } catch (IOException | Error | RuntimeException e) {
                        try {
                            c14053M44369.close();
                            throw e;
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                            throw e;
                        }
                    }
                } else {
                    c16774M38182.m39600(c19143.m44367().m23700());
                }
                executor.execute(new Runnable() { // from class: l.᩷۬ᩴ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11644.m29274(c16028, c1442, z, z2, z3, c16774M38182, z4);
                    }
                });
                return c16774M38182;
            } catch (IOException e3) {
                e = e3;
                c16774M38182.m39601(e);
                throw e;
            }
        } catch (Error e4) {
            e = e4;
            c16774M38182.m39601(e);
            throw e;
        } catch (RuntimeException e5) {
            e = e5;
            c16774M38182.m39601(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29271(C16028 c16028, C1442 c1442, long j) throws IOException {
        C17359.requireNonNull(c16028);
        C17359.requireNonNull(c1442);
        C16774 c16774M38182 = c16028.m38182();
        try {
            c16774M38182.m39600(j);
            m29274(c16028, c1442, false, false, false, c16774M38182, false);
            if (c16774M38182.m39599(C17950.m41888(null)) != EnumC24980.COMMITTED) {
                throw c16774M38182.m39598();
            }
        } catch (IOException | Error | RuntimeException e) {
            c16774M38182.m39601(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m29274(C16028 c16028, C1442 c1442, boolean z, boolean z2, boolean z3, C16774 c16774, boolean z4) {
        C6597 c6597;
        try {
            C6597 c6597M5194 = c1442.m5194();
            if (z) {
                c6597 = c6597M5194;
            } else {
                C1161 c1161M38189 = c16028.m38189();
                if (!c1161M38189.mo4304() || c1161M38189.m49860()) {
                    throw new IOException("Hex checkpoint base is unavailable");
                }
                C6597 c6597M18521 = C6597.m18521(c1161M38189);
                if (c6597M18521.m18524() > 2147483647L) {
                    throw new IOException("Hex checkpoint base is too large");
                }
                c6597 = c6597M18521;
            }
            C13136 c13136 = new C13136(c16774.m39608(), c16774);
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(c13136);
                try {
                    if (z2) {
                        C14053 c14053M39605 = c16774.m39605();
                        try {
                            m29270(c13136, dataOutputStream, c1442, z, c6597M5194, c6597, true, z3, c14053M39605);
                            c14053M39605.close();
                        } catch (Throwable th) {
                            try {
                                c14053M39605.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } else {
                        m29270(c13136, dataOutputStream, c1442, z, c6597M5194, c6597, false, z3, null);
                    }
                    dataOutputStream.close();
                    c13136.close();
                    c16774.m39603(z4);
                } catch (Throwable th3) {
                    try {
                        dataOutputStream.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                try {
                    c13136.close();
                    throw th5;
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                    throw th5;
                }
            }
        } catch (Throwable th7) {
            c16774.m39601(th7);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29270(C13136 c13136, DataOutputStream dataOutputStream, C1442 c1442, boolean z, C6597 c6597, C6597 c6598, boolean z2, boolean z3, C14053 c14053) throws IOException {
        dataOutputStream.writeInt(1297369176);
        dataOutputStream.writeInt(7);
        m29267(dataOutputStream, c1442.m5189());
        m29267(dataOutputStream, c1442.m5190());
        dataOutputStream.writeBoolean(z);
        dataOutputStream.writeLong(c6597.m18524());
        dataOutputStream.writeLong(c6597.m18522());
        dataOutputStream.writeLong(c6598.m18524());
        dataOutputStream.writeLong(c6598.m18522());
        dataOutputStream.writeBoolean(z2);
        dataOutputStream.writeBoolean(z3);
        if (z2) {
            c14053.getClass();
            c14053.m34224(dataOutputStream);
        }
        dataOutputStream.writeInt(1481135181);
        dataOutputStream.flush();
        long jM32649 = c13136.m32649();
        c13136.m32650();
        dataOutputStream.writeLong(jM32649);
        dataOutputStream.flush();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x01d2 */
    /* JADX WARN: Code duplicated, block: B:141:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:159:0x0206 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x008a  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C1950 m29265(final l.C16028 r16, l.AbstractC22044 r17, l.C21145 r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11644.m29265(l.ܶۤܳ, l.᩷ۨᩴ, l.᩶ۜᩴ):l.֫۬ᩴ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29267(DataOutputStream dataOutputStream, String str) throws IOException {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (bytes.length > 1048576) {
            throw new IOException("Hex checkpoint path is too long");
        }
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m29263(DataInput dataInput) throws IOException {
        C19849 c19849 = (C19849) dataInput;
        int i = c19849.readInt();
        m29268("Invalid hex checkpoint path length", i >= 0 && i <= 1048576);
        byte[] bArr = new byte[i];
        c19849.readFully(bArr, 0, i);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29268(String str, boolean z) throws IOException {
        if (!z) {
            throw new IOException(str);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m29273(InterfaceC7509 interfaceC7509) throws C9446 {
        if (interfaceC7509.mo924()) {
            throw new C9446();
        }
    }
}
