package l;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.᩷֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes5.dex */
public final class C20517 implements InterfaceC21850 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f66491;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f66492 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8523 f66493;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f66494;

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

    public C20517(C8523 c8523, String str, String str2) {
        this.f66493 = c8523;
        this.f66491 = str;
        this.f66494 = str2;
    }

    @Override // l.InterfaceC21850
    public final void seek(long j) throws IOException {
        this.f66493.m22257(j);
    }

    @Override // l.InterfaceC21850
    public final int read(byte[] bArr, int i, int i2) {
        return this.f66493.m22255(bArr, i, i2);
    }

    @Override // l.InterfaceC21850
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f66493.m22261(bArr, i, i2);
    }

    @Override // l.InterfaceC21850
    public final long length() {
        return this.f66493.m22259();
    }

    @Override // l.InterfaceC21850
    public final long position() {
        return this.f66493.m22254();
    }

    @Override // l.InterfaceC21850
    public final void setLength(long j) throws IOException {
        this.f66493.m22260(j);
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ܶ */
    public final void mo3059() throws IOException {
        this.f66493.m22258();
    }

    @Override // l.InterfaceC21850
    public final String getName() {
        return new File(this.f66491).getName();
    }

    @Override // l.InterfaceC21850
    /* JADX INFO: renamed from: ᩺ */
    public final InterfaceC21850 mo3060() {
        return C12051.m29947(this.f66493.f29509.f25727).m20575(this.f66491, this.f66494);
    }

    @Override // l.InterfaceC21850
    public final boolean isClosed() {
        return this.f66492;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f66492) {
            return;
        }
        this.f66492 = true;
        boolean zEquals = this.f66494.equals("r");
        C8523 c8523 = this.f66493;
        if (zEquals) {
            try {
                c8523.m22256();
            } catch (IOException unused) {
            }
        } else {
            c8523.m22256();
        }
    }
}
