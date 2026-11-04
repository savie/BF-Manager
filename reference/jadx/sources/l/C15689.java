package l;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܳ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: S6MO */
/* JADX INFO: loaded from: classes4.dex */
public final class C15689 extends OutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FileOutputStream f50999;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2266 f51000;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13452 f51001;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7509 f51002;

    public C15689(C2266 c2266, C13452 c13452, InterfaceC7509 interfaceC7509, FileOutputStream fileOutputStream) {
        this.f51000 = c2266;
        this.f51001 = c13452;
        this.f51002 = interfaceC7509;
        this.f50999 = fileOutputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        C2266.m7693(this.f51000, this.f51001, 1, this.f51002);
        this.f50999.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        C2266.m7693(this.f51000, this.f51001, i2, this.f51002);
        this.f50999.write(bArr, i, i2);
    }
}
