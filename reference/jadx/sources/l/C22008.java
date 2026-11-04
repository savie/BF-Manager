package l;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩷ۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 66M9 */
/* JADX INFO: loaded from: classes.dex */
public final class C22008 extends AbstractC13057 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ File f70993;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f70994;

    public C22008(File file, String str) {
        this.f70994 = str;
        this.f70993 = file;
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ۫ */
    public final String mo17426() {
        return this.f70994;
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ۤ */
    public final String mo17425() {
        return this.f70993.getName();
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ᩹ */
    public final InputStream mo17428() {
        return new FileInputStream(this.f70993);
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ۚ */
    public final File mo17424() {
        return this.f70993;
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ۗ */
    public final C15294 mo17423() throws IOException {
        File canonicalFile = this.f70993.getCanonicalFile();
        if (!canonicalFile.isFile()) {
            throw new FileNotFoundException("Image source is not a regular file");
        }
        return new C15294("file:" + canonicalFile.getPath(), canonicalFile.length(), canonicalFile.lastModified());
    }
}
