package l;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܿܳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 66M9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17409 extends AbstractC1886 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ File f55408;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f55409;

    public C17409(File file, String str) {
        this.f55409 = str;
        this.f55408 = file;
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ֨ */
    public final String mo5281() {
        return this.f55409;
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ۖ */
    public final String mo5282() {
        return this.f55408.getName();
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ᩴ */
    public final InputStream mo5285() {
        return new FileInputStream(this.f55408);
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ۬ */
    public final File mo6139() {
        return this.f55408;
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ۠ */
    public final C14588 mo5283() throws IOException {
        File canonicalFile = this.f55408.getCanonicalFile();
        if (!canonicalFile.isFile()) {
            throw new FileNotFoundException("Image source is not a regular file");
        }
        return new C14588("file:" + canonicalFile.getPath(), canonicalFile.length(), canonicalFile.lastModified());
    }
}
