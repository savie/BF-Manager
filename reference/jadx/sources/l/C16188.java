package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܶܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: I6TG */
/* JADX INFO: loaded from: classes5.dex */
public final class C16188 implements InterfaceC1560, AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f52545;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C3180 f52546;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7305 f52547;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f52548;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C24064 f52549;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C20334 f52550;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C9475 f52551;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f52552;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C3510 f52553;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f52554;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f52555;

    public C16188(C7305 c7305, int i) {
        this.f52547 = c7305;
        this.f52548 = i;
    }

    @Override // l.InterfaceC1560
    /* JADX INFO: renamed from: ۙ */
    public final void mo5499(int i, int i2) throws IOException {
        if (i2 >= 0) {
            long j = ((long) i) + ((long) i2);
            C7305 c7305 = this.f52547;
            if (j <= c7305.length()) {
                this.f52554 = i;
                this.f52545 = i2;
                this.f52549 = new C24064(c7305, i, i2, this.f52548);
                return;
            }
        }
        throw new IOException("Invalid migration page range");
    }

    @Override // l.InterfaceC1560
    /* JADX INFO: renamed from: ۙ */
    public final void mo5500(int i, long j, InputStream inputStream) throws IOException {
        int i2 = this.f52548;
        if (i == 261) {
            this.f52553 = C3510.m11504(i2, j, inputStream);
            return;
        }
        switch (i) {
            case 256:
                this.f52551 = C9475.m24858(i2, j, inputStream);
                return;
            case 257:
                C20334 c20334M46718 = C20334.m46718(i2, j, inputStream);
                this.f52550 = c20334M46718;
                this.f52555 = c20334M46718.m46723();
                return;
            case 258:
                if (j < 0 || j > i2) {
                    throw new IOException("Migration app field exceeds limit");
                }
                int i3 = (int) j;
                byte[] bArr = new byte[i3];
                int i4 = 0;
                while (i4 < i3) {
                    int i5 = inputStream.read(bArr, i4, i3 - i4);
                    if (i5 <= 0) {
                        throw new IOException("Truncated migration app field");
                    }
                    i4 += i5;
                }
                this.f52552 = bArr;
                this.f52546 = C3180.m10382(new ByteArrayInputStream(this.f52552), j, i2);
                return;
            default:
                this.f52549.m53607(i, j, inputStream);
                return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38418() throws IOException {
        C3510 c3510 = this.f52553;
        if (c3510 == null || this.f52551 == null || this.f52550 == null || this.f52546 == null || this.f52549 == null) {
            throw new IOException("Incomplete migration app fields");
        }
        if ((c3510.m11507() == 0 && this.f52554 != 0) || (this.f52553.m11507() == this.f52553.m11511() - 1 && ((long) this.f52554) + ((long) this.f52545) != this.f52547.length())) {
            throw new IOException("Migration page range disagrees with fragment manifest");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C24064 c24064 = this.f52549;
        if (c24064 != null) {
            c24064.close();
        }
    }
}
