package l;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: l.ۖ۟۫, reason: contains not printable characters */
/* JADX INFO: compiled from: E9TD */
/* JADX INFO: loaded from: classes2.dex */
public final class C2516 implements Closeable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6666 f8054;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20528 f8055 = new C20528(12);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13702 f8056;

    public C2516(C13702 c13702) {
        this.f8056 = c13702;
        C23820 c23820M53145 = C23820.m53145();
        c23820M53145.m53150(new C1025());
        c23820M53145.m53152(20971520L);
        c23820M53145.m53148(6);
        c23820M53145.m53151();
        this.f8054 = c23820M53145.m53147(new C9227(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC24277 m8403(C2516 c2516) {
        InterfaceC24277 interfaceC24277 = (InterfaceC24277) c2516.f8055.m47061();
        if (interfaceC24277 != null) {
            return interfaceC24277;
        }
        C13702 c13702 = c2516.f8056;
        return c13702.f43464.mo43789(c13702.f43469);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8404(C2516 c2516, InterfaceC24277 interfaceC24277) {
        if (c2516.f8055.m47060(interfaceC24277)) {
            return;
        }
        C20244.m46520(interfaceC24277);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m8405(long j, byte[] bArr, int i, int i2) throws IOException {
        int i3 = (int) (j % 102400);
        try {
            byte[] bArr2 = (byte[]) this.f8054.get(Long.valueOf(j / 102400));
            int iMin = Math.min(bArr2.length - i3, i2);
            if (iMin <= 0) {
                return -1;
            }
            System.arraycopy(bArr2, i3, bArr, i, iMin);
            return iMin;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                IOException iOException = (IOException) cause;
                C22327.m50389(iOException);
                throw iOException;
            }
            throw new IOException(cause);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8054.mo7498();
        while (true) {
            InterfaceC24277 interfaceC24277 = (InterfaceC24277) this.f8055.m47061();
            if (interfaceC24277 == null) {
                return;
            } else {
                C20244.m46520(interfaceC24277);
            }
        }
    }
}
