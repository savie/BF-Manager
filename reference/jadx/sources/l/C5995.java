package l;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۚ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: S6MO */
/* JADX INFO: loaded from: classes3.dex */
public final class C5995 extends AbstractC13057 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f20511;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2266 f20512;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f20513;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f20514;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C15294 f20515;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final File f20516;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC13057 f20517;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13452 f20518;

    public C5995(C2266 c2266, AbstractC13057 abstractC13057, C15294 c15294, File file, C13452 c13452) {
        this.f20512 = c2266;
        this.f20517 = abstractC13057;
        this.f20515 = c15294;
        this.f20516 = file;
        this.f20518 = c13452;
        this.f20511 = abstractC13057.mo17426();
        this.f20513 = abstractC13057.mo17425();
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String mo17426() {
        return this.f20511;
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String mo17425() {
        return this.f20513;
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final File mo17424() {
        return this.f20516;
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InputStream mo17428() throws IOException {
        m17422();
        File file = this.f20516;
        return file == null ? this.f20517.mo17428() : new FileInputStream(file);
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C15294 mo17423() throws IOException {
        m17422();
        C13452 c13452 = this.f20518;
        C15294 c15294 = this.f20515;
        if (c13452 == null) {
            this.f20517.m32544(c15294);
        }
        return c15294;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m17427() {
        m17422();
        this.f20517.m32544(this.f20515);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m17422() throws IOException {
        C2266 c2266 = this.f20512;
        c2266.m7696();
        if (this.f20514 || c2266.f7400) {
            throw new IOException("Prepared image source is closed");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C2266 c2266 = this.f20512;
        c2266.m7696();
        if (this.f20514) {
            return;
        }
        this.f20514 = true;
        C13452 c13452 = this.f20518;
        if (c13452 != null) {
            c13452.f42832 = true;
            c2266.m7692();
        }
    }
}
