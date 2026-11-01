package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩷֨ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1QW */
/* JADX INFO: loaded from: classes5.dex */
public final class C20543 extends AbstractC23366 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC23366 f66531;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final OutputStream f66534;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC8900 f66535;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f66536;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C16310 f66537;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f66538;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f66533 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final byte[] f66532 = new byte[1];

    public C20543(OutputStream outputStream, C2903[] c2903Arr, AbstractC8900 abstractC8900, C17720 c17720) throws IOException {
        this.f66534 = outputStream;
        this.f66535 = abstractC8900;
        C16310 c16310 = new C16310(outputStream);
        this.f66537 = c16310;
        this.f66531 = c16310;
        for (int length = c2903Arr.length - 1; length >= 0; length--) {
            this.f66531 = c2903Arr[length].m8710(this.f66531, c17720);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(c2903Arr.length - 1);
        for (int i = 0; i < c2903Arr.length; i++) {
            c2903Arr[i].getClass();
            C15956.m37939(byteArrayOutputStream, 33L);
            byte[] bArrM8711 = c2903Arr[i].m8711();
            C15956.m37939(byteArrayOutputStream, bArrM8711.length);
            byteArrayOutputStream.write(bArrM8711);
        }
        while ((byteArrayOutputStream.size() & 3) != 0) {
            byteArrayOutputStream.write(0);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length2 = byteArray.length + 4;
        this.f66536 = length2;
        if (length2 > 1024) {
            throw new C6782();
        }
        byteArray[0] = (byte) (byteArray.length / 4);
        outputStream.write(byteArray);
        C15956.m37940(byteArray, outputStream);
        this.f66538 = (9223372036854775804L - ((long) length2)) - ((long) abstractC8900.m23157());
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f66532;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f66531.write(bArr, i, i2);
        this.f66535.mo19985(bArr, i, i2);
        this.f66533 += (long) i2;
        m46318();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f66531.flush();
        m46318();
    }

    @Override // l.AbstractC23366
    public final void finish() throws IOException {
        this.f66531.finish();
        m46318();
        long jM38455 = this.f66537.m38455();
        while (true) {
            long j = 3 & jM38455;
            OutputStream outputStream = this.f66534;
            if (j != 0) {
                outputStream.write(0);
                jM38455++;
            } else {
                outputStream.write(this.f66535.mo19986());
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m46318() throws C21599 {
        long jM38455 = this.f66537.m38455();
        if (jM38455 < 0 || jM38455 > this.f66538 || this.f66533 < 0) {
            throw new C21599("XZ Stream has grown too big");
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m46320() {
        return ((long) this.f66536) + this.f66537.m38455() + ((long) this.f66535.m23157());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m46319() {
        return this.f66533;
    }
}
