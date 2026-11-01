package l;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۗ᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 82VA */
/* JADX INFO: loaded from: classes2.dex */
public final class C3434 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final File f12653;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final File f12654;

    public C3434(File file) {
        this.f12654 = file;
        this.f12653 = new File(file.getPath() + ".bak");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m10144() {
        return this.f12654.exists() || this.f12653.exists();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10141() {
        this.f12654.delete();
        this.f12653.delete();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final OutputStream m10140() throws IOException {
        File file = this.f12654;
        if (file.exists()) {
            File file2 = this.f12653;
            if (!file2.exists()) {
                if (!file.renameTo(file2)) {
                    C0303.m1848("Couldn't rename file " + file + " to backup file " + file2);
                }
            } else {
                file.delete();
            }
        }
        try {
            return new C9786(file);
        } catch (FileNotFoundException e) {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file, e);
            }
            try {
                return new C9786(file);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + file, e2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10142(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.close();
        this.f12653.delete();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final FileInputStream m10143() {
        File file = this.f12653;
        boolean zExists = file.exists();
        File file2 = this.f12654;
        if (zExists) {
            file2.delete();
            file.renameTo(file2);
        }
        return new FileInputStream(file2);
    }
}
