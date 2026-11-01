package l;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۛ֫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: S6MO */
/* JADX INFO: loaded from: classes2.dex */
public final class C5748 extends OutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10688 f19541;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14216 f19542;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FileOutputStream f19543;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC5614 f19544;

    public C5748(C14216 c14216, C10688 c10688, InterfaceC5614 interfaceC5614, FileOutputStream fileOutputStream) {
        this.f19542 = c14216;
        this.f19541 = c10688;
        this.f19544 = interfaceC5614;
        this.f19543 = fileOutputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        C14216.m34312(this.f19542, this.f19541, 1, this.f19544);
        this.f19543.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        C14216.m34312(this.f19542, this.f19541, i2, this.f19544);
        this.f19543.write(bArr, i, i2);
    }
}
