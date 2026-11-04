package l;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.֨᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: D9O0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1426 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f5016;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f5017;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f5018;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f5019;

    public C1426(int i, int i2, long j, long j2) {
        this.f5019 = i;
        this.f5017 = i2;
        this.f5018 = j;
        this.f5016 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C1426)) {
            C1426 c1426 = (C1426) obj;
            if (this.f5017 == c1426.f5017 && this.f5018 == c1426.f5018 && this.f5019 == c1426.f5019 && this.f5016 == c1426.f5016) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C17359.hash(Integer.valueOf(this.f5017), Long.valueOf(this.f5018), Integer.valueOf(this.f5019), Long.valueOf(this.f5016));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5162(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f5019);
            dataOutputStream.writeInt(this.f5017);
            dataOutputStream.writeLong(this.f5018);
            dataOutputStream.writeLong(this.f5016);
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C1426 m5161(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C1426 c1426 = new C1426(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c1426;
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
