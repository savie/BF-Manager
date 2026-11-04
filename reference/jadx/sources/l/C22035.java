package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩷ۨۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95GT */
/* JADX INFO: loaded from: classes.dex */
public final class C22035 extends OutputStream {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f71064;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22781 f71065;

    public C22035(C22781 c22781, int i) {
        this.f71065 = c22781;
        this.f71064 = i;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        int i2 = this.f71064 + 1;
        C22781 c22781 = this.f71065;
        C22781.m51379(c22781, i2);
        byte[] bArr = c22781.f73897;
        int i3 = this.f71064;
        this.f71064 = i3 + 1;
        bArr[i3] = (byte) i;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        int length = this.f71064 + bArr.length;
        C22781 c22781 = this.f71065;
        C22781.m51379(c22781, length);
        System.arraycopy(bArr, 0, c22781.f73897, this.f71064, bArr.length);
        this.f71064 += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3 = this.f71064 + i2;
        C22781 c22781 = this.f71065;
        C22781.m51379(c22781, i3);
        System.arraycopy(bArr, i, c22781.f73897, this.f71064, i2);
        this.f71064 += i2;
    }
}
