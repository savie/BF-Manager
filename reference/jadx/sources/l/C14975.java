package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܳ֡۫, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes5.dex */
public final class C14975 implements InterfaceC23181 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0060 f48890;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3395 f48891;

    public C14975(C0060 c0060, C3395 c3395) {
        this.f48890 = c0060;
        this.f48891 = c3395;
    }

    @Override // l.InterfaceC23181
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo36037(long j, byte[] bArr, int i, int i2) {
        int iM11108 = this.f48891.m11108(j, bArr, i, i2);
        if (i2 == 0) {
            return 0;
        }
        if (iM11108 == 0) {
            return -1;
        }
        return iM11108;
    }

    @Override // l.InterfaceC23181
    public final void close() throws IOException {
        IOException iOExceptionM982 = this.f48890.m982(this.f48891, (IOException) null);
        if (iOExceptionM982 != null) {
            throw iOExceptionM982;
        }
    }
}
