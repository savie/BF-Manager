package l;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩻֫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: S6MO */
/* JADX INFO: loaded from: classes.dex */
public final class C23388 extends AbstractC1886 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final File f75772;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f75773;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14216 f75774;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f75775;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C14588 f75776;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f75777;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC1886 f75778;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C10688 f75779;

    public C23388(C14216 c14216, AbstractC1886 abstractC1886, C14588 c14588, File file, C10688 c10688) {
        this.f75774 = c14216;
        this.f75778 = abstractC1886;
        this.f75776 = c14588;
        this.f75772 = file;
        this.f75779 = c10688;
        this.f75777 = abstractC1886.mo5281();
        this.f75775 = abstractC1886.mo5282();
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ֨ */
    public final String mo5281() {
        return this.f75777;
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ۖ */
    public final String mo5282() {
        return this.f75775;
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ۬ */
    public final File mo6139() {
        return this.f75772;
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ۠ */
    public final C14588 mo5283() throws IOException {
        C14216 c14216 = this.f75774;
        c14216.m34314();
        if (!this.f75773 && !c14216.f46609) {
            C10688 c10688 = this.f75779;
            C14588 c14588 = this.f75776;
            if (c10688 == null) {
                this.f75778.m6137(c14588);
            }
            return c14588;
        }
        throw new IOException("Prepared image source is closed");
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ᩴ */
    public final InputStream mo5285() throws IOException {
        C14216 c14216 = this.f75774;
        c14216.m34314();
        if (!this.f75773 && !c14216.f46609) {
            File file = this.f75772;
            return file == null ? this.f75778.mo5285() : new FileInputStream(file);
        }
        throw new IOException("Prepared image source is closed");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C14216 c14216 = this.f75774;
        c14216.m34314();
        if (this.f75773) {
            return;
        }
        this.f75773 = true;
        C10688 c10688 = this.f75779;
        if (c10688 != null) {
            c10688.f36494 = true;
            c14216.m34311();
        }
    }
}
