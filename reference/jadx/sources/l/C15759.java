package l;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܺۛ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 82VA */
/* JADX INFO: loaded from: classes4.dex */
public final class C15759 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final File f51062;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final File f51063;

    public C15759(File file) {
        this.f51062 = file;
        this.f51063 = new File(file.getPath() + ".new");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final File m37499() {
        return this.f51062;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37496() {
        this.f51062.delete();
        this.f51063.delete();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final FileOutputStream m37494() throws IOException {
        File file = this.f51063;
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + file);
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e) {
                throw new IOException("Failed to create new file " + file, e);
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final FileInputStream m37498() {
        File file = this.f51063;
        boolean zExists = file.exists();
        File file2 = this.f51062;
        if (zExists && file2.exists() && !file.delete()) {
            C13638.toString(file);
        }
        return new FileInputStream(file2);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] m37502() throws IOException {
        FileInputStream fileInputStreamM37498 = m37498();
        try {
            byte[] bArr = new byte[fileInputStreamM37498.available()];
            int i = 0;
            while (true) {
                int i2 = fileInputStreamM37498.read(bArr, i, bArr.length - i);
                if (i2 > 0) {
                    i += i2;
                    int iAvailable = fileInputStreamM37498.available();
                    if (iAvailable > bArr.length - i) {
                        byte[] bArr2 = new byte[iAvailable + i];
                        System.arraycopy(bArr, 0, bArr2, 0, i);
                        bArr = bArr2;
                    }
                } else {
                    fileInputStreamM37498.close();
                    return bArr;
                }
            }
        } catch (Throwable th) {
            fileInputStreamM37498.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m37501() {
        return this.f51062.exists();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m37495() {
        return this.f51062.isFile();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37497(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException unused) {
        }
        try {
            fileOutputStream.close();
        } catch (IOException unused2) {
        }
        File file = this.f51063;
        if (file.delete()) {
            return;
        }
        C13638.toString(file);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m37500(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException unused) {
        }
        try {
            fileOutputStream.close();
        } catch (IOException unused2) {
        }
        File file = this.f51062;
        if (file.isDirectory() && !file.delete()) {
            file.toString();
        }
        File file2 = this.f51063;
        if (file2.renameTo(file)) {
            return;
        }
        file2.toString();
        file.toString();
    }
}
