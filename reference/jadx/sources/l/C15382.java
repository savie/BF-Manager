package l;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܶܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: D9HP */
/* JADX INFO: loaded from: classes4.dex */
public final class C15382 extends FilterOutputStream {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C7343 f50074;

    public C15382(C7343 c7343, ByteArrayOutputStream byteArrayOutputStream) {
        super(byteArrayOutputStream);
        this.f50074 = c7343;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36819(AbstractC9032 abstractC9032) throws IOException {
        AbstractC14676 abstractC14676M23364 = abstractC9032.m23364();
        write((byte) (abstractC14676M23364.m35212() | abstractC14676M23364.m35213().getValue() | abstractC14676M23364.m35211().getValue()));
        AbstractC18909 abstractC18909Mo2658 = abstractC9032.m23364().mo2658(this.f50074);
        int iMo10037 = abstractC18909Mo2658.mo10037(abstractC9032);
        if (iMo10037 < 127) {
            write(iMo10037);
        } else {
            int i = 1;
            for (int i2 = iMo10037; i2 > 255; i2 >>= 8) {
                i++;
            }
            write(i | 128);
            while (i > 0) {
                write(iMo10037 >> ((i - 1) * 8));
                i--;
            }
        }
        abstractC18909Mo2658.mo10038(abstractC9032, this);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
    }
}
