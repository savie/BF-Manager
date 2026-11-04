package l;

import android.net.Uri;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩵֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes5.dex */
public final class C20214 extends AbstractC8433 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Uri f64892;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9771 f64893;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f64894;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InputStream f64895;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f64896;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20214(C9771 c9771) {
        super(c9771.f31502 instanceof AbstractC18881);
        this.f64893 = c9771;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final long mo8326(C25368 c25368) throws IOException {
        Uri uri = c25368.f81907;
        long j = c25368.f81909;
        this.f64892 = uri;
        m22621(c25368);
        Uri uri2 = this.f64892;
        C9771 c9771 = this.f64893;
        InterfaceC2386 interfaceC2386M25478 = c9771.m25478(uri2);
        long size = interfaceC2386M25478.getSize();
        if (size >= 0 && j > size) {
            throw new C5976(null, null, 2008);
        }
        long j2 = c25368.f81910;
        this.f64896 = j2;
        if (j2 == -1 && size >= 0) {
            this.f64896 = size - j;
        }
        try {
            if (size >= 0 && j == size) {
                this.f64895 = new ByteArrayInputStream(new byte[0]);
                this.f64894 = true;
                m22619(c25368);
                return this.f64896;
            }
            AbstractC7629 abstractC7629 = c9771.f31502;
            if (abstractC7629 instanceof AbstractC18881) {
                AbstractC18881 abstractC18881 = (AbstractC18881) abstractC7629;
                C9771.m25450(c9771, interfaceC2386M25478);
                if (c9771.f31503) {
                    throw new C10517(interfaceC2386M25478.getName());
                }
                long j3 = c25368.f81910;
                this.f64895 = j3 == -1 ? abstractC18881.mo35570(j, interfaceC2386M25478.getPath()) : abstractC18881.mo43786(interfaceC2386M25478.getPath(), c25368.f81909, j3);
            } else {
                if (!(c9771.f31502 instanceof C11969)) {
                    throw new IOException("HLS direct reading requires a local or network visitor");
                }
                if (c9771.f31503) {
                    throw new C10517(interfaceC2386M25478.getName());
                }
                InputStream inputStreamMo4290 = interfaceC2386M25478.mo8093().mo4290();
                this.f64895 = inputStreamMo4290;
                while (j > 0) {
                    long jSkip = inputStreamMo4290.skip(j);
                    if (jSkip <= 0) {
                        if (inputStreamMo4290.read() == -1) {
                            throw new C5976(null, null, 2008);
                        }
                        jSkip = 1;
                    }
                    j -= jSkip;
                }
            }
            if (!c9771.f31503) {
                this.f64894 = true;
                m22619(c25368);
                return this.f64896;
            }
            InputStream inputStream = this.f64895;
            this.f64895 = null;
            if (inputStream != null) {
                inputStream.close();
            }
            throw new C10517(interfaceC2386M25478.getName());
        } catch (IOException e) {
            throw C9771.m25439(c9771, e);
        }
    }

    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f64896;
        if (j == 0) {
            return -1;
        }
        InputStream inputStream = this.f64895;
        if (inputStream == null) {
            throw new IOException("Data source is not open");
        }
        if (j != -1) {
            i2 = (int) Math.min(j, i2);
        }
        try {
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 == -1) {
                this.f64896 = 0L;
                return -1;
            }
            long j2 = this.f64896;
            if (j2 != -1) {
                this.f64896 = j2 - ((long) i3);
            }
            m22622(i3);
            return i3;
        } catch (IOException e) {
            throw C9771.m25439(this.f64893, e);
        }
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ᩴ */
    public final Uri mo8327() {
        return this.f64892;
    }

    @Override // l.InterfaceC13433
    public final void close() {
        this.f64892 = null;
        try {
            InputStream inputStream = this.f64895;
            if (inputStream != null) {
                inputStream.close();
            }
        } finally {
            this.f64895 = null;
            this.f64896 = 0L;
            if (this.f64894) {
                this.f64894 = false;
                m22620();
            }
        }
    }
}
