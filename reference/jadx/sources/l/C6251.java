package l;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ۛ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes3.dex */
public final class C6251 implements InterfaceC15475 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C3267 f21219;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f21220 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f21221;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f21222;

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ۙۤ */
    public final /* synthetic */ FileChannel mo7066() {
        return null;
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ۚۤ */
    public final /* synthetic */ boolean mo7067() {
        return false;
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ InterfaceC15475 mo7068(long j, long j2) {
        return C19951.m45879(this, j, j2);
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ InterfaceC15475 mo7070(long j, long j2) {
        return C19951.m45880(this, j, j2);
    }

    public C6251(C3267 c3267, String str, String str2) {
        this.f21219 = c3267;
        this.f21221 = str;
        this.f21222 = str2;
    }

    @Override // l.InterfaceC15475
    public final void seek(long j) throws IOException {
        this.f21219.m10746(j);
    }

    @Override // l.InterfaceC15475
    public final int read(byte[] bArr, int i, int i2) {
        return this.f21219.m10744(bArr, i, i2);
    }

    @Override // l.InterfaceC15475
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f21219.m10750(bArr, i, i2);
    }

    @Override // l.InterfaceC15475
    public final long length() {
        return this.f21219.m10748();
    }

    @Override // l.InterfaceC15475
    public final long position() {
        return this.f21219.m10751();
    }

    @Override // l.InterfaceC15475
    public final void setLength(long j) throws IOException {
        this.f21219.m10749(j);
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ܺ */
    public final void mo7069() throws IOException {
        this.f21219.m10747();
    }

    @Override // l.InterfaceC15475
    public final String getName() {
        return new File(this.f21221).getName();
    }

    @Override // l.InterfaceC15475
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC15475 mo7071() {
        return C7742.m21077(this.f21219.f10640.f51774).m38060(this.f21221, this.f21222);
    }

    @Override // l.InterfaceC15475
    public final boolean isClosed() {
        return this.f21220;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f21220) {
            return;
        }
        this.f21220 = true;
        boolean zEquals = this.f21222.equals("r");
        C3267 c3267 = this.f21219;
        if (zEquals) {
            try {
                c3267.m10745();
            } catch (IOException unused) {
            }
        } else {
            c3267.m10745();
        }
    }
}
