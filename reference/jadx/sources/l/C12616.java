package l;

import android.net.Uri;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۫᩵۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes4.dex */
public final class C12616 extends AbstractC21428 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f42143;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Uri f42144;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f42145;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11601 f42146;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InputStream f42147;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12616(C11601 c11601) {
        super(c11601.f38981 instanceof AbstractC12233);
        this.f42146 = c11601;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final long mo9272(C12257 c12257) throws IOException {
        Uri uri = c12257.f41015;
        long j = c12257.f41009;
        this.f42144 = uri;
        m48019(c12257);
        Uri uri2 = this.f42144;
        C11601 c11601 = this.f42146;
        InterfaceC2557 interfaceC2557M28931 = c11601.m28931(uri2);
        long size = interfaceC2557M28931.getSize();
        if (size >= 0 && j > size) {
            throw new C20018(null, null, 2008);
        }
        long j2 = c12257.f41017;
        this.f42145 = j2;
        if (j2 == -1 && size >= 0) {
            this.f42145 = size - j;
        }
        try {
            if (size >= 0 && j == size) {
                this.f42147 = new ByteArrayInputStream(new byte[0]);
                this.f42143 = true;
                m48018(c12257);
                return this.f42145;
            }
            AbstractC9677 abstractC9677 = c11601.f38981;
            if (abstractC9677 instanceof AbstractC12233) {
                AbstractC12233 abstractC12233 = (AbstractC12233) abstractC9677;
                C11601.m28903(c11601, interfaceC2557M28931);
                if (c11601.f38976) {
                    throw new C18260(interfaceC2557M28931.getName());
                }
                long j3 = c12257.f41017;
                this.f42147 = j3 == -1 ? abstractC12233.mo10262(j, interfaceC2557M28931.getPath()) : abstractC12233.mo30341(interfaceC2557M28931.getPath(), c12257.f41009, j3);
            } else {
                if (!(c11601.f38981 instanceof C21611)) {
                    throw new IOException("HLS direct reading requires a local or network visitor");
                }
                if (c11601.f38976) {
                    throw new C18260(interfaceC2557M28931.getName());
                }
                InputStream inputStreamMo33970 = interfaceC2557M28931.mo7989().mo33970();
                this.f42147 = inputStreamMo33970;
                while (j > 0) {
                    long jSkip = inputStreamMo33970.skip(j);
                    if (jSkip <= 0) {
                        if (inputStreamMo33970.read() == -1) {
                            throw new C20018(null, null, 2008);
                        }
                        jSkip = 1;
                    }
                    j -= jSkip;
                }
            }
            if (!c11601.f38976) {
                this.f42143 = true;
                m48018(c12257);
                return this.f42145;
            }
            InputStream inputStream = this.f42147;
            this.f42147 = null;
            if (inputStream != null) {
                inputStream.close();
            }
            throw new C18260(interfaceC2557M28931.getName());
        } catch (IOException e) {
            throw C11601.m28892(c11601, e);
        }
    }

    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f42145;
        if (j == 0) {
            return -1;
        }
        InputStream inputStream = this.f42147;
        if (inputStream == null) {
            throw new IOException("Data source is not open");
        }
        if (j != -1) {
            i2 = (int) Math.min(j, i2);
        }
        try {
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 == -1) {
                this.f42145 = 0L;
                return -1;
            }
            long j2 = this.f42145;
            if (j2 != -1) {
                this.f42145 = j2 - ((long) i3);
            }
            m48017(i3);
            return i3;
        } catch (IOException e) {
            throw C11601.m28892(this.f42146, e);
        }
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۚ */
    public final Uri mo9274() {
        return this.f42144;
    }

    @Override // l.InterfaceC15785
    public final void close() {
        this.f42144 = null;
        try {
            InputStream inputStream = this.f42147;
            if (inputStream != null) {
                inputStream.close();
            }
        } finally {
            this.f42147 = null;
            this.f42145 = 0L;
            if (this.f42143) {
                this.f42143 = false;
                m48020();
            }
        }
    }
}
