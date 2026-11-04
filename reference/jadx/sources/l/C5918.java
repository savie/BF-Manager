package l;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: l.ۚ᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: S50A */
/* JADX INFO: loaded from: classes3.dex */
public final class C5918 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC25004 f20258;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f20259;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7826 f20260;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5918 m17223(ByteBuffer byteBuffer) {
        return new C5918(new C7826(byteBuffer));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5918 m17222(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                return new C5918(new C7826(ByteBuffer.wrap(byteArrayOutputStream.toByteArray())));
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public C5918(C7826 c7826) {
        this.f20260 = c7826;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m17226() {
        C9645 c9645 = new C9645();
        C7826 c7826 = this.f20260;
        c9645.mo23023(c7826.m21342());
        c7826.m21341(c9645, 0, this.f20259 | 32);
        Object[] objArr = {null};
        new C13375(this).m15604(c9645, new C11137(objArr), new C3374(1L));
        return (byte[]) objArr[0];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17227() {
        this.f20259 |= 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17224(OutputStream outputStream) throws IOException {
        if (!(outputStream instanceof BufferedOutputStream)) {
            outputStream = new BufferedOutputStream(outputStream);
        }
        ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
        C9645 c9645 = new C9645();
        C13375 c13375 = new C13375(this);
        C20088 c20088 = new C20088(zipOutputStream);
        C7826 c7826 = this.f20260;
        C3374 c3374 = new C3374(c7826.m21338());
        c3374.m11078(this.f20258);
        c7826.m21340(new C15612(c9645, c9645, c13375, c20088, c3374), this.f20259 | 32);
        zipOutputStream.close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17225(InterfaceC25004 interfaceC25004) {
        this.f20258 = interfaceC25004;
    }
}
