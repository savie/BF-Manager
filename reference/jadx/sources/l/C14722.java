package l;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: l.ܳ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: E9TD */
/* JADX INFO: loaded from: classes4.dex */
public final class C14722 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C19805 f48137 = new C19805(12);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19570 f48138;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3431 f48139;

    public C14722(C3431 c3431) {
        this.f48139 = c3431;
        C21686 c21686M48428 = C21686.m48428();
        c21686M48428.m48434(new C11194());
        c21686M48428.m48436(20971520L);
        c21686M48428.m48432(6);
        c21686M48428.m48435();
        this.f48138 = c21686M48428.m48431(new C23894(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10033 m35244(C14722 c14722) {
        InterfaceC10033 interfaceC10033 = (InterfaceC10033) c14722.f48137.m45009();
        if (interfaceC10033 != null) {
            return interfaceC10033;
        }
        C3431 c3431 = c14722.f48139;
        return c3431.f12644.mo30351(c3431.f12648);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35245(C14722 c14722, InterfaceC10033 interfaceC10033) {
        if (c14722.f48137.m45011(interfaceC10033)) {
            return;
        }
        C19431.m44468(interfaceC10033);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m35246(long j, byte[] bArr, int i, int i2) throws IOException {
        int i3 = (int) (j % 102400);
        try {
            byte[] bArr2 = (byte[]) this.f48138.get(Long.valueOf(j / 102400));
            int iMin = Math.min(bArr2.length - i3, i2);
            if (iMin <= 0) {
                return -1;
            }
            System.arraycopy(bArr2, i3, bArr, i, iMin);
            return iMin;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            throw new IOException(cause);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f48138.mo4423();
        while (true) {
            InterfaceC10033 interfaceC10033 = (InterfaceC10033) this.f48137.m45009();
            if (interfaceC10033 == null) {
                return;
            } else {
                C19431.m44468(interfaceC10033);
            }
        }
    }
}
