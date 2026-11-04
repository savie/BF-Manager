package l;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۛ᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 82VA */
/* JADX INFO: loaded from: classes3.dex */
public final class C6612 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final File f22099;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final File f22100;

    public C6612(File file) {
        this.f22100 = file;
        this.f22099 = new File(file.getPath() + ".bak");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m18546() {
        return this.f22100.exists() || this.f22099.exists();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18543() {
        this.f22100.delete();
        this.f22099.delete();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final OutputStream m18547() throws IOException {
        File file = this.f22100;
        if (file.exists()) {
            File file2 = this.f22099;
            if (!file2.exists()) {
                if (!file.renameTo(file2)) {
                    C1896.m6517("Couldn't rename file " + file + " to backup file " + file2);
                }
            } else {
                file.delete();
            }
        }
        try {
            return new C12577(file);
        } catch (FileNotFoundException e) {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file, e);
            }
            try {
                return new C12577(file);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + file, e2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18544(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.close();
        this.f22099.delete();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final FileInputStream m18545() {
        File file = this.f22099;
        boolean zExists = file.exists();
        File file2 = this.f22100;
        if (zExists) {
            file2.delete();
            file.renameTo(file2);
        }
        return new FileInputStream(file2);
    }
}
