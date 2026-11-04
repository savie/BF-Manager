package l;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩺ۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 82VA */
/* JADX INFO: loaded from: classes.dex */
public final class C24084 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final File f77876;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final File f77877;

    public C24084(File file) {
        this.f77876 = file;
        this.f77877 = new File(file.getPath() + ".new");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final File m53635() {
        return this.f77876;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53632() {
        this.f77876.delete();
        this.f77877.delete();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final FileOutputStream m53636() {
        File file = this.f77877;
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53633(long j) {
        try {
            this.f77877.setLastModified(j);
        } catch (IllegalArgumentException | SecurityException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final FileInputStream m53638() {
        File file = this.f77877;
        boolean zExists = file.exists();
        File file2 = this.f77876;
        if (zExists && file2.exists() && !file.delete()) {
            C17359.toString(file);
        }
        return new FileInputStream(file2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m53637() throws IOException {
        FileInputStream fileInputStreamM53638 = m53638();
        try {
            byte[] bArr = new byte[fileInputStreamM53638.available()];
            int i = 0;
            while (true) {
                int i2 = fileInputStreamM53638.read(bArr, i, bArr.length - i);
                if (i2 > 0) {
                    i += i2;
                    int iAvailable = fileInputStreamM53638.available();
                    if (iAvailable > bArr.length - i) {
                        byte[] bArr2 = new byte[iAvailable + i];
                        System.arraycopy(bArr, 0, bArr2, 0, i);
                        bArr = bArr2;
                    }
                } else {
                    fileInputStreamM53638.close();
                    return bArr;
                }
            }
        } catch (Throwable th) {
            fileInputStreamM53638.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m53640() {
        return this.f77876.exists();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m53641() {
        return this.f77876.isFile();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53634(FileOutputStream fileOutputStream) {
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
        File file = this.f77877;
        if (file.delete()) {
            return;
        }
        C17359.toString(file);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m53639(FileOutputStream fileOutputStream) {
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
        File file = this.f77876;
        if (file.isDirectory() && !file.delete()) {
            file.toString();
        }
        File file2 = this.f77877;
        if (file2.renameTo(file)) {
            return;
        }
        file2.toString();
        file.toString();
    }
}
