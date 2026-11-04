package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۠ܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1QW */
/* JADX INFO: loaded from: classes4.dex */
public final class C8776 extends AbstractC13207 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f28542;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final OutputStream f28544;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC1275 f28546;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC13207 f28547;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C22158 f28548;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f28549;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f28543 = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final byte[] f28545 = new byte[1];

    public C8776(OutputStream outputStream, C25142[] c25142Arr, AbstractC1275 abstractC1275, C0573 c0573) throws IOException {
        this.f28544 = outputStream;
        this.f28546 = abstractC1275;
        C22158 c22158 = new C22158(outputStream);
        this.f28548 = c22158;
        this.f28547 = c22158;
        for (int length = c25142Arr.length - 1; length >= 0; length--) {
            this.f28547 = c25142Arr[length].m56047(this.f28547, c0573);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(c25142Arr.length - 1);
        for (int i = 0; i < c25142Arr.length; i++) {
            c25142Arr[i].getClass();
            C7241.m19866(byteArrayOutputStream, 33L);
            byte[] bArrM56048 = c25142Arr[i].m56048();
            C7241.m19866(byteArrayOutputStream, bArrM56048.length);
            byteArrayOutputStream.write(bArrM56048);
        }
        while ((byteArrayOutputStream.size() & 3) != 0) {
            byteArrayOutputStream.write(0);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length2 = byteArray.length + 4;
        this.f28542 = length2;
        if (length2 > 1024) {
            throw new C4258();
        }
        byteArray[0] = (byte) (byteArray.length / 4);
        outputStream.write(byteArray);
        C7241.m19867(byteArray, outputStream);
        this.f28549 = (9223372036854775804L - ((long) length2)) - ((long) abstractC1275.m4665());
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f28545;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f28547.write(bArr, i, i2);
        this.f28546.mo4663(bArr, i, i2);
        this.f28543 += (long) i2;
        m23475();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f28547.flush();
        m23475();
    }

    @Override // l.AbstractC13207
    public final void finish() throws IOException {
        this.f28547.finish();
        m23475();
        long jM50122 = this.f28548.m50122();
        while (true) {
            long j = 3 & jM50122;
            OutputStream outputStream = this.f28544;
            if (j != 0) {
                outputStream.write(0);
                jM50122++;
            } else {
                outputStream.write(this.f28546.mo4664());
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m23475() throws C18428 {
        long jM50122 = this.f28548.m50122();
        if (jM50122 < 0 || jM50122 > this.f28549 || this.f28543 < 0) {
            throw new C18428("XZ Stream has grown too big");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m23477() {
        return ((long) this.f28542) + this.f28548.m50122() + ((long) this.f28546.m4665());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m23476() {
        return this.f28543;
    }
}
