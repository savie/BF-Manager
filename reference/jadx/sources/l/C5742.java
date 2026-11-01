package l;

import android.os.AsyncTask;
import java.io.DataInput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۛ֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70J */
/* JADX INFO: loaded from: classes2.dex */
public final class C5742 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Executor f19536 = AsyncTask.THREAD_POOL_EXECUTOR;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Executor m15800() {
        return f19536;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23610 m15802(final C1736 c1736, final C7381 c7381, final boolean z, C2516 c2516, final boolean z2, final boolean z3, final boolean z4, Executor executor) throws Throwable {
        C13638.requireNonNull(c7381, "target");
        C13638.requireNonNull(executor, "executor");
        if (z && !z2) {
            throw new IllegalArgumentException("Direct source does not need a lightweight checkpoint");
        }
        if (z3 && (z || z2 || c2516.m7804() || c2516.length() != Integer.MAX_VALUE)) {
            throw new IllegalArgumentException("Invalid partial hex checkpoint");
        }
        final C23610 c23610M5779 = c1736.m5779();
        try {
            try {
                if (z2) {
                    C23041 c23041M7789 = c2516.m7789();
                    try {
                        c23610M5779.m52079(c23041M7789);
                    } catch (IOException | Error | RuntimeException e) {
                        try {
                            c23041M7789.close();
                            throw e;
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                            throw e;
                        }
                    }
                } else {
                    c23610M5779.m52077(c2516.m7801().m11491());
                }
                executor.execute(new Runnable() { // from class: l.۟֫ۚ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5742.m15808(c1736, c7381, z, z2, z3, c23610M5779, z4);
                    }
                });
                return c23610M5779;
            } catch (IOException e3) {
                e = e3;
                c23610M5779.m52078(e);
                throw e;
            }
        } catch (Error e4) {
            e = e4;
            c23610M5779.m52078(e);
            throw e;
        } catch (RuntimeException e5) {
            e = e5;
            c23610M5779.m52078(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15804(C1736 c1736, C7381 c7381, long j) throws IOException {
        C13638.requireNonNull(c1736);
        C13638.requireNonNull(c7381);
        C23610 c23610M5779 = c1736.m5779();
        try {
            c23610M5779.m52077(j);
            m15808(c1736, c7381, false, false, false, c23610M5779, false);
            if (c23610M5779.m52076(C11965.m29777(null)) != EnumC10910.COMMITTED) {
                throw c23610M5779.m52075();
            }
        } catch (IOException | Error | RuntimeException e) {
            c23610M5779.m52078(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m15808(C1736 c1736, C7381 c7381, boolean z, boolean z2, boolean z3, C23610 c23610, boolean z4) {
        C4695 c4695;
        try {
            C4695 c4695M19651 = c7381.m19651();
            if (z) {
                c4695 = c4695M19651;
            } else {
                C15432 c15432M5776 = c1736.m5776();
                if (c15432M5776.mo33971() && !c15432M5776.m46723()) {
                    C4695 c4696 = new C4695(c15432M5776.mo33964(), c15432M5776.mo33991());
                    if (c4696.m13012() > 2147483647L) {
                        throw new IOException("Hex checkpoint base is too large");
                    }
                    c4695 = c4696;
                } else {
                    throw new IOException("Hex checkpoint base is unavailable");
                }
            }
            C16326 c16326 = new C16326(c23610.m52074(), c23610);
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(c16326);
                try {
                    if (z2) {
                        C23041 c23041M52084 = c23610.m52084();
                        try {
                            m15807(c16326, dataOutputStream, c7381, z, c4695M19651, c4695, true, z3, c23041M52084);
                            c23041M52084.close();
                        } catch (Throwable th) {
                            try {
                                c23041M52084.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } else {
                        m15807(c16326, dataOutputStream, c7381, z, c4695M19651, c4695, false, z3, null);
                    }
                    dataOutputStream.close();
                    c16326.close();
                    c23610.m52080(z4);
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
                    c16326.close();
                    throw th5;
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                    throw th5;
                }
            }
        } catch (Throwable th7) {
            c23610.m52078(th7);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15807(C16326 c16326, DataOutputStream dataOutputStream, C7381 c7381, boolean z, C4695 c4695, C4695 c4696, boolean z2, boolean z3, C23041 c23041) throws IOException {
        dataOutputStream.writeInt(1297369176);
        dataOutputStream.writeInt(7);
        String strM19652 = c7381.m19652();
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = strM19652.getBytes(charset);
        if (bytes.length > 1048576) {
            throw new IOException("Hex checkpoint path is too long");
        }
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
        byte[] bytes2 = c7381.m19654().getBytes(charset);
        if (bytes2.length > 1048576) {
            throw new IOException("Hex checkpoint path is too long");
        }
        dataOutputStream.writeInt(bytes2.length);
        dataOutputStream.write(bytes2);
        dataOutputStream.writeBoolean(z);
        dataOutputStream.writeLong(c4695.m13012());
        dataOutputStream.writeLong(c4695.m13010());
        dataOutputStream.writeLong(c4696.m13012());
        dataOutputStream.writeLong(c4696.m13010());
        dataOutputStream.writeBoolean(z2);
        dataOutputStream.writeBoolean(z3);
        if (z2) {
            c23041.getClass();
            c23041.m50977(dataOutputStream);
        }
        dataOutputStream.writeInt(1481135181);
        dataOutputStream.flush();
        long jM38494 = c16326.m38494();
        c16326.m38495();
        dataOutputStream.writeLong(jM38494);
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
    public static l.C17031 m15801(l.C1736 r16, l.AbstractC20745 r17, l.C14915 r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5742.m15801(l.֫ۢۚ, l.᩷۠ۚ, l.ܶ֫ۚ):l.ܿ֫ۚ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15799(DataInput dataInput) throws IOException {
        C19854 c19854 = (C19854) dataInput;
        int i = c19854.readInt();
        m15803("Invalid hex checkpoint path length", i >= 0 && i <= 1048576);
        byte[] bArr = new byte[i];
        c19854.readFully(bArr, 0, i);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15803(String str, boolean z) throws IOException {
        if (!z) {
            throw new IOException(str);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m15809(InterfaceC5614 interfaceC5614) throws C1105 {
        if (interfaceC5614.mo2357()) {
            throw new C1105();
        }
    }
}
