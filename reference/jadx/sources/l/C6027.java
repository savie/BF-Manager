package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;
import java.util.function.LongSupplier;

/* JADX INFO: renamed from: l.ۛ֡۫, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes3.dex */
public final class C6027 extends InputStream implements InterfaceC0739, InterfaceC8469 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final LongSupplier f20617;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f20618;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17213 f20619;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C3789 f20620;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final InterfaceC23927 f20621;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24673 f20622;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11246 f20623;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC18638 f20624 = EnumC18638.FAILURE;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f20625;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24673 f20626;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f20627;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C6027(C3789 c3789, long j, LongSupplier longSupplier, InterfaceC23927 interfaceC23927, InterfaceC11246 interfaceC11246, InterfaceC17213 interfaceC17213, InterfaceC24673 interfaceC24673, InterfaceC24673 interfaceC24674, boolean z) {
        this.f20620 = c3789;
        this.f20618 = j;
        this.f20617 = longSupplier;
        this.f20621 = interfaceC23927;
        this.f20623 = interfaceC11246;
        this.f20619 = interfaceC17213;
        this.f20622 = interfaceC24673;
        this.f20626 = interfaceC24674;
        this.f20627 = z;
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
        C17359.checkFromIndexSize(i, i2, bArr.length);
        if (i2 == 0) {
            return 0;
        }
        if (!this.f20625) {
            C11992 c11992 = new C11992(this, bArr, i, i2);
            try {
                iIntValue = this.f20620.m12325().read(bArr, i, i2);
            } catch (IOException e) {
                iIntValue = ((Integer) this.f20623.mo28472(e, c11992)).intValue();
            } catch (C22172 e2) {
                throw new IOException(e2.getMessage(), e2);
            } catch (C12082 e3) {
                iIntValue = ((Integer) this.f20621.mo14268(e3, c11992)).intValue();
            } catch (RuntimeException e4) {
                throw e4;
            }
            if (iIntValue > 0) {
                this.f20618 += (long) iIntValue;
            }
            return iIntValue;
        }
        throw new IOException("Stream is closed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Integer m17500(C6027 c6027, byte[] bArr, int i, int i2) {
        InputStream inputStreamM12325 = c6027.f20620.m12325();
        if (inputStreamM12325 != null) {
            try {
                inputStreamM12325.close();
            } catch (IOException unused) {
            }
        }
        long jMax = Math.max(0L, c6027.f20617.getAsLong() - c6027.f20618);
        if (jMax <= 0) {
            c6027.f20624 = EnumC18638.NORMAL_COMPLETE;
            return -1;
        }
        C3789 c3789 = (C3789) c6027.f20619.mo26956(c6027.f20618, jMax);
        c6027.f20620 = c3789;
        return Integer.valueOf(c3789.m12325().read(bArr, i, i2));
    }

    @Override // l.InterfaceC0739
    /* JADX INFO: renamed from: ۙ */
    public final void mo3062(EnumC18638 enumC18638) {
        this.f20624 = enumC18638;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f20625) {
            return;
        }
        try {
            this.f20620.m12324();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        boolean z = this.f20627;
        try {
            ((!z || this.f20624 == EnumC18638.NORMAL_COMPLETE) ? this.f20622 : this.f20626).run();
        } catch (IOException e2) {
            e = C0060.m980(e, e2);
        }
        this.f20625 = true;
        if (e == null && z) {
            EnumC18638 enumC18638 = EnumC18638.NORMAL_COMPLETE;
        }
        EnumC23906 enumC23906 = EnumC23906.SMB2_NEGOTIATE;
        if (z) {
            this.f20624.name();
        }
        Set set = C0060.f940;
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
        if (this.f20625) {
            throw new IOException("Stream is closed");
        }
        if (j <= 0) {
            return 0L;
        }
        long jSkip = this.f20620.m12325().skip(j);
        if (jSkip > 0) {
            this.f20618 += jSkip;
        }
        return jSkip;
    }
}
