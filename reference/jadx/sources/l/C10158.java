package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;
import java.util.function.LongSupplier;

/* JADX INFO: renamed from: l.ۤ۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes3.dex */
public final class C10158 extends InputStream implements InterfaceC2104, InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f34674;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC7335 f34675;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6629 f34676;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f34677;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C20741 f34678;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21446 f34679;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public EnumC14806 f34680 = EnumC14806.FAILURE;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final LongSupplier f34681;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22858 f34682;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f34683;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC22858 f34684;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C10158(C20741 c20741, long j, LongSupplier longSupplier, InterfaceC7335 interfaceC7335, InterfaceC6629 interfaceC6629, InterfaceC21446 interfaceC21446, InterfaceC22858 interfaceC22858, InterfaceC22858 interfaceC22859, boolean z) {
        this.f34678 = c20741;
        this.f34677 = j;
        this.f34681 = longSupplier;
        this.f34675 = interfaceC7335;
        this.f34676 = interfaceC6629;
        this.f34679 = interfaceC21446;
        this.f34684 = interfaceC22858;
        this.f34682 = interfaceC22859;
        this.f34683 = z;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iIntValue;
        C13638.checkFromIndexSize(i, i2, bArr.length);
        if (i2 == 0) {
            return 0;
        }
        if (!this.f34674) {
            C8747 c8747 = new C8747(this, bArr, i, i2);
            try {
                iIntValue = this.f34678.m46682().read(bArr, i, i2);
            } catch (IOException e) {
                iIntValue = ((Integer) this.f34676.mo17974(e, c8747)).intValue();
            } catch (C10360 e2) {
                throw new IOException(e2.getMessage(), e2);
            } catch (C13865 e3) {
                iIntValue = ((Integer) this.f34675.mo12547(e3, c8747)).intValue();
            } catch (RuntimeException e4) {
                throw e4;
            }
            if (iIntValue > 0) {
                this.f34677 += (long) iIntValue;
            }
            return iIntValue;
        }
        throw new IOException("Stream is closed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Integer m25805(C10158 c10158, byte[] bArr, int i, int i2) {
        InputStream inputStreamM46682 = c10158.f34678.m46682();
        if (inputStreamM46682 != null) {
            try {
                inputStreamM46682.close();
            } catch (IOException unused) {
            }
        }
        long jMax = Math.max(0L, c10158.f34681.getAsLong() - c10158.f34677);
        if (jMax <= 0) {
            c10158.f34680 = EnumC14806.NORMAL_COMPLETE;
            return -1;
        }
        C20741 c20741 = (C20741) c10158.f34679.mo7268(c10158.f34677, jMax);
        c10158.f34678 = c20741;
        return Integer.valueOf(c20741.m46682().read(bArr, i, i2));
    }

    @Override // l.InterfaceC2104
    /* JADX INFO: renamed from: ۙ */
    public final void mo6655(EnumC14806 enumC14806) {
        this.f34680 = enumC14806;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f34674) {
            return;
        }
        try {
            this.f34678.m46681();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        boolean z = this.f34683;
        try {
            ((!z || this.f34680 == EnumC14806.NORMAL_COMPLETE) ? this.f34684 : this.f34682).run();
        } catch (IOException e2) {
            e = C16508.m38787(e, e2);
        }
        this.f34674 = true;
        if (e == null && z) {
            EnumC14806 enumC14806 = EnumC14806.NORMAL_COMPLETE;
        }
        EnumC2162 enumC2162 = EnumC2162.SMB2_NEGOTIATE;
        if (z) {
            this.f34680.name();
        }
        Set set = C16508.f53027;
        if (e != null) {
            throw e;
        }
    }

    public final void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        if (this.f34674) {
            throw new IOException("Stream is closed");
        }
        if (j <= 0) {
            return 0L;
        }
        long jSkip = this.f34678.m46682().skip(j);
        if (jSkip > 0) {
            this.f34677 += jSkip;
        }
        return jSkip;
    }
}
