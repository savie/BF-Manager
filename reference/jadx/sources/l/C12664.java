package l;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: l.۫᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: S50A */
/* JADX INFO: loaded from: classes3.dex */
public final class C12664 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC23333 f42282;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f42283;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6998 f42284;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12664 m31468(ByteBuffer byteBuffer) {
        return new C12664(new C6998(byteBuffer));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12664 m31467(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                return new C12664(new C6998(ByteBuffer.wrap(byteArrayOutputStream.toByteArray())));
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public C12664(C6998 c6998) {
        this.f42284 = c6998;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m31471() {
        C18162 c18162 = new C18162();
        C6998 c6998 = this.f42284;
        c18162.mo22040(c6998.m18803());
        c6998.m18802(c18162, 0, this.f42283 | 32);
        Object[] objArr = {null};
        new C16897(this).m26703(c18162, new C21130(objArr), new C8516(1L));
        return (byte[]) objArr[0];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31472() {
        this.f42283 |= 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31469(OutputStream outputStream) throws IOException {
        if (!(outputStream instanceof BufferedOutputStream)) {
            outputStream = new BufferedOutputStream(outputStream);
        }
        ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
        C18162 c18162 = new C18162();
        C16897 c16897 = new C16897(this);
        C20425 c20425 = new C20425(zipOutputStream);
        C6998 c6998 = this.f42284;
        C8516 c8516 = new C8516(c6998.m18799());
        c8516.m22241(this.f42282);
        c6998.m18801(new C0668(c18162, c18162, c16897, c20425, c8516), this.f42283 | 32);
        zipOutputStream.close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31470(InterfaceC23333 interfaceC23333) {
        this.f42282 = interfaceC23333;
    }
}
