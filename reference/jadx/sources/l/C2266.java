package l;

import android.os.Looper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: renamed from: l.֫᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: S6MO */
/* JADX INFO: loaded from: classes2.dex */
public final class C2266 implements AutoCloseable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final long f7396 = C6808.f22672.f22673;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f7397;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Thread f7398;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f7399;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f7400;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f7401 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f7402;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final File f7403;

    public C2266(File file) {
        long j = f7396;
        if (j <= 0 || 536870912 < j) {
            throw new IllegalArgumentException("Invalid source store limits");
        }
        this.f7403 = new File(file, UUID.randomUUID().toString());
        this.f7397 = j;
        this.f7402 = 536870912L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5995 m7698(AbstractC13057 abstractC13057, boolean z, InterfaceC7509 interfaceC7509) {
        m7696();
        if (this.f7400) {
            throw new IOException("Image source store is closed");
        }
        C17359.requireNonNull(abstractC13057);
        AbstractC13057.m32543(interfaceC7509);
        if (!z && !abstractC13057.mo23981()) {
            throw new C22754("Image source requires foreground preparation");
        }
        C15294 c15294Mo17423 = abstractC13057.mo17423();
        AbstractC13057.m32543(interfaceC7509);
        if (c15294Mo17423.f50004 > this.f7397) {
            throw new C9789("Image source exceeds the preparation byte limit");
        }
        File fileMo23983 = abstractC13057.mo23983();
        if (!abstractC13057.mo32546() || fileMo23983 != null) {
            return new C5995(this, abstractC13057, c15294Mo17423, fileMo23983, null);
        }
        m7692();
        File file = this.f7403;
        if (!file.isDirectory() && !file.mkdirs()) {
            throw new IOException("Could not create image source directory");
        }
        File fileCreateTempFile = File.createTempFile("source-", ".part", file);
        C13452 c13452 = new C13452();
        c13452.f42833 = fileCreateTempFile;
        this.f7401.add(c13452);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(c13452.f42833);
            try {
                abstractC13057.mo23980(new C15689(this, c13452, interfaceC7509, fileOutputStream), z, interfaceC7509);
                AbstractC13057.m32543(interfaceC7509);
                fileOutputStream.flush();
                fileOutputStream.close();
                long j = c15294Mo17423.f50004;
                if (j >= 0 && c13452.f42831 != j) {
                    throw new IOException("Image source ended with a different length than its metadata");
                }
                abstractC13057.m32544(c15294Mo17423);
                AbstractC13057.m32543(interfaceC7509);
                File file2 = new File(file, c13452.f42833.getName().replace(".part", ".image"));
                if (!c13452.f42833.renameTo(file2)) {
                    throw new IOException("Could not publish prepared image source");
                }
                c13452.f42833 = file2;
                return new C5995(this, abstractC13057, c15294Mo17423, file2, c13452);
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            c13452.f42832 = true;
            m7692();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7693(C2266 c2266, C13452 c13452, int i, InterfaceC7509 interfaceC7509) {
        AbstractC13057.m32543(interfaceC7509);
        long j = i;
        long j2 = c2266.f7397;
        long j3 = c13452.f42831;
        if (j <= j2 - j3) {
            long j4 = c2266.f7402;
            long j5 = c2266.f7399;
            if (j <= j4 - j5) {
                c13452.f42831 = j3 + j;
                c2266.f7399 = j5 + j;
                return;
            }
        }
        throw new C9789("Image source preparation budget exhausted");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m7692() {
        ArrayList arrayList = this.f7401;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C13452 c13452 = (C13452) arrayList.get(size);
            if (c13452.f42832 && (!c13452.f42833.exists() || c13452.f42833.delete())) {
                this.f7399 -= c13452.f42831;
                arrayList.remove(size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m7696() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Image source store requires a worker thread");
        }
        Thread thread = this.f7398;
        if (thread == null) {
            this.f7398 = Thread.currentThread();
        } else if (thread != Thread.currentThread()) {
            throw new IllegalStateException("Image source store accessed from another worker");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m7696();
        this.f7400 = true;
        ArrayList arrayList = this.f7401;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C13452) it.next()).f42832 = true;
        }
        m7692();
        if (arrayList.isEmpty()) {
            File file = this.f7403;
            if (file.exists()) {
                file.delete();
            }
        }
    }
}
