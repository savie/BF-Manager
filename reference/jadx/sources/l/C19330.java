package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩵۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes5.dex */
public final class C19330 implements InterfaceC10033 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC18624 f62347;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C12584 f62348;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f62349;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9762 f62350;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C4512 f62351;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f62352;

    @Override // l.InterfaceC10033
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ int mo20198(byte[] bArr) {
        return C8622.m22400(this, bArr);
    }

    public C19330(C22152 c22152, C4512 c4512, C12584 c12584, C9762 c9762) {
        this.f62347 = c22152;
        this.f62351 = c4512;
        this.f62348 = c12584;
        this.f62350 = c9762;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Integer m44322(C19330 c19330, byte[] bArr, int i, int i2) {
        InterfaceC18624 interfaceC18624 = (InterfaceC18624) c19330.f62348.get();
        c19330.f62347 = interfaceC18624;
        return Integer.valueOf(interfaceC18624.mo43073(c19330.f62352, bArr, i, i2));
    }

    @Override // l.InterfaceC10033
    public final void seek(long j) {
        this.f62352 = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f62349) {
            return;
        }
        try {
            this.f62347.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        try {
            this.f62350.run();
        } catch (IOException e2) {
            e = C16508.m38787(e, e2);
        }
        this.f62349 = true;
        if (e != null) {
            throw e;
        }
    }

    @Override // l.InterfaceC10033
    public final int read(final byte[] bArr, final int i, final int i2) throws IOException {
        int iIntValue;
        if (!this.f62349) {
            C13638.checkFromIndexSize(i, i2, bArr.length);
            try {
                iIntValue = this.f62347.mo43073(this.f62352, bArr, i, i2);
            } catch (C10360 e) {
                throw new IOException(e.getMessage(), e);
            } catch (C13865 e2) {
                iIntValue = ((Integer) C16508.m38793(this.f62351.f16032, e2, new InterfaceC15097() { // from class: l.۠۠֨
                    @Override // l.InterfaceC15097
                    public final Object get() {
                        return C19330.m44322(this.f28149, bArr, i, i2);
                    }
                })).intValue();
            }
            if (iIntValue > 0) {
                this.f62352 += (long) iIntValue;
            }
            return iIntValue;
        }
        throw new IOException("Stream is closed");
    }
}
