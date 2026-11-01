package l;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܶ֡ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9O0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14881 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f48637;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f48638;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f48639;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f48640;

    public C14881(int i, int i2, long j, long j2) {
        this.f48637 = i;
        this.f48639 = i2;
        this.f48640 = j;
        this.f48638 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C14881)) {
            C14881 c14881 = (C14881) obj;
            if (this.f48639 == c14881.f48639 && this.f48640 == c14881.f48640 && this.f48637 == c14881.f48637 && this.f48638 == c14881.f48638) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13638.hash(Integer.valueOf(this.f48639), Long.valueOf(this.f48640), Integer.valueOf(this.f48637), Long.valueOf(this.f48638));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35578(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f48637);
            dataOutputStream.writeInt(this.f48639);
            dataOutputStream.writeLong(this.f48640);
            dataOutputStream.writeLong(this.f48638);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C14881 m35577(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C14881 c14881 = new C14881(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c14881;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
