package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩵֡۫, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes5.dex */
public final class C20197 implements InterfaceC24277 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C7297 f64834;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C8043 f64835;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f64836;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC23181 f64837;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C4535 f64838;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f64839;

    @Override // l.InterfaceC24277
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int mo46455(byte[] bArr) {
        return C6377.m18119(this, bArr);
    }

    public C20197(C14975 c14975, C4535 c4535, C8043 c8043, C7297 c7297) {
        this.f64837 = c14975;
        this.f64838 = c4535;
        this.f64835 = c8043;
        this.f64834 = c7297;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Integer m46454(C20197 c20197, byte[] bArr, int i, int i2) {
        InterfaceC23181 interfaceC23181 = (InterfaceC23181) c20197.f64835.get();
        c20197.f64837 = interfaceC23181;
        return Integer.valueOf(interfaceC23181.mo36037(c20197.f64839, bArr, i, i2));
    }

    @Override // l.InterfaceC24277
    public final void seek(long j) {
        this.f64839 = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f64836) {
            return;
        }
        try {
            this.f64837.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        try {
            this.f64834.run();
        } catch (IOException e2) {
            e = C0060.m980(e, e2);
        }
        this.f64836 = true;
        if (e != null) {
            throw e;
        }
    }

    @Override // l.InterfaceC24277
    public final int read(final byte[] bArr, final int i, final int i2) throws IOException {
        int iIntValue;
        if (!this.f64836) {
            C17359.checkFromIndexSize(i, i2, bArr.length);
            try {
                iIntValue = this.f64837.mo36037(this.f64839, bArr, i, i2);
            } catch (C22172 e) {
                throw new IOException(e.getMessage(), e);
            } catch (C12082 e2) {
                iIntValue = ((Integer) C0060.m986(this.f64838.f16129, e2, new InterfaceC16467() { // from class: l.ۗ֡۫
                    @Override // l.InterfaceC16467
                    public final Object get() {
                        return C20197.m46454(this.f9859, bArr, i, i2);
                    }
                })).intValue();
            }
            if (iIntValue > 0) {
                this.f64839 += (long) iIntValue;
            }
            return iIntValue;
        }
        throw new IOException("Stream is closed");
    }
}
