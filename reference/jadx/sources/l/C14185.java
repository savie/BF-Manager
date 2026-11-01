package l;

import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ܳ֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: L8GV */
/* JADX INFO: loaded from: classes4.dex */
public final class C14185 implements InterfaceC21850 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9246 f46536;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f46538 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f46537 = false;

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ֨ۨ */
    public final /* synthetic */ boolean mo3051() {
        return false;
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ۙۨ */
    public final /* synthetic */ FileChannel mo3055() {
        return null;
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ InterfaceC21850 mo3056(long j, long j2) {
        return C15501.m37108(this, j, j2);
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ InterfaceC21850 mo3058(long j, long j2) {
        return C15501.m37109(this, j, j2);
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ܶ */
    public final void mo3059() {
    }

    public C14185(C9246 c9246) {
        this.f46536 = c9246;
    }

    @Override // l.InterfaceC21850
    public final void seek(long j) throws IOException {
        if (j < 0) {
            throw new IOException(C15489.m37074(j, "offset < 0: "));
        }
        this.f46538 = j;
    }

    @Override // l.InterfaceC21850
    public final int read(byte[] bArr, int i, int i2) {
        int iM23776 = this.f46536.m23776(this.f46538, bArr, i, i2);
        if (iM23776 != -1) {
            this.f46538 += (long) iM23776;
        }
        return iM23776;
    }

    @Override // l.InterfaceC21850
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        throw new IOException("Unsupported");
    }

    @Override // l.InterfaceC21850
    public final long length() {
        return this.f46536.m23773();
    }

    @Override // l.InterfaceC21850
    public final void setLength(long j) throws IOException {
        throw new IOException("Unsupported");
    }

    @Override // l.InterfaceC21850
    public final long position() {
        return this.f46538;
    }

    @Override // l.InterfaceC21850
    public final String getName() {
        return this.f46536.f31439;
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ᩺ */
    public final InterfaceC21850 mo3060() throws IOException {
        throw new IOException("Unsupported");
    }

    @Override // l.InterfaceC21850
    public final boolean isClosed() {
        return this.f46537;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f46537) {
            return;
        }
        this.f46537 = true;
        this.f46536.close();
    }
}
