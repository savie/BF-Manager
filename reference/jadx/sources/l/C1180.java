package l;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.֨۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9HP */
/* JADX INFO: loaded from: classes2.dex */
public final class C1180 extends FilterOutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2083 f4319;

    public C1180(C2083 c2083, ByteArrayOutputStream byteArrayOutputStream) {
        super(byteArrayOutputStream);
        this.f4319 = c2083;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4354(AbstractC4691 abstractC4691) throws IOException {
        AbstractC15877 abstractC15877M14567 = abstractC4691.m14567();
        write((byte) (abstractC15877M14567.m37846() | abstractC15877M14567.m37847().getValue() | abstractC15877M14567.m37844().getValue()));
        AbstractC8637 abstractC8637Mo6072 = abstractC4691.m14567().mo6072(this.f4319);
        int iMo3832 = abstractC8637Mo6072.mo3832(abstractC4691);
        if (iMo3832 < 127) {
            write(iMo3832);
        } else {
            int i = 1;
            for (int i2 = iMo3832; i2 > 255; i2 >>= 8) {
                i++;
            }
            write(i | 128);
            while (i > 0) {
                write(iMo3832 >> ((i - 1) * 8));
                i--;
            }
        }
        abstractC8637Mo6072.mo3833(abstractC4691, this);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
    }
}
