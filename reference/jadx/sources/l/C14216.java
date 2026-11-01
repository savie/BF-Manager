package l;

import android.os.Looper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: renamed from: l.ܳ֫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: S6MO */
/* JADX INFO: loaded from: classes3.dex */
public final class C14216 implements AutoCloseable {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f46607;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Thread f46608;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f46609;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final File f46612;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f46606 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f46610 = 268435456;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f46611 = 536870912;

    public C14216(File file) {
        this.f46612 = new File(file, UUID.randomUUID().toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23388 m34317(AbstractC1886 abstractC1886, boolean z, InterfaceC5614 interfaceC5614) {
        m34314();
        if (this.f46609) {
            throw new IOException("Image source store is closed");
        }
        C13638.requireNonNull(abstractC1886);
        AbstractC1886.m6135(interfaceC5614);
        if (!z && !abstractC1886.mo6138()) {
            throw new C11060("Image source requires foreground preparation");
        }
        C14588 c14588Mo5283 = abstractC1886.mo5283();
        AbstractC1886.m6135(interfaceC5614);
        if (c14588Mo5283.f47739 > this.f46610) {
            throw new IOException("Image source exceeds the preparation byte limit");
        }
        File fileMo5284 = abstractC1886.mo5284();
        if (!abstractC1886.mo6140() || fileMo5284 != null) {
            return new C23388(this, abstractC1886, c14588Mo5283, fileMo5284, null);
        }
        m34311();
        File file = this.f46612;
        if (!file.isDirectory() && !file.mkdirs()) {
            throw new IOException("Could not create image source directory");
        }
        File fileCreateTempFile = File.createTempFile("source-", ".part", file);
        C10688 c10688 = new C10688();
        c10688.f36495 = fileCreateTempFile;
        this.f46606.add(c10688);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(c10688.f36495);
            try {
                abstractC1886.mo6136(new C5748(this, c10688, interfaceC5614, fileOutputStream), z, interfaceC5614);
                AbstractC1886.m6135(interfaceC5614);
                fileOutputStream.flush();
                fileOutputStream.close();
                long j = c14588Mo5283.f47739;
                if (j >= 0 && c10688.f36493 != j) {
                    throw new IOException("Image source ended with a different length than its metadata");
                }
                abstractC1886.m6137(c14588Mo5283);
                AbstractC1886.m6135(interfaceC5614);
                File file2 = new File(file, c10688.f36495.getName().replace(".part", ".image"));
                if (!c10688.f36495.renameTo(file2)) {
                    throw new IOException("Could not publish prepared image source");
                }
                c10688.f36495 = file2;
                return new C23388(this, abstractC1886, c14588Mo5283, file2, c10688);
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            c10688.f36494 = true;
            m34311();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34312(C14216 c14216, C10688 c10688, int i, InterfaceC5614 interfaceC5614) {
        AbstractC1886.m6135(interfaceC5614);
        long j = i;
        long j2 = c14216.f46610;
        long j3 = c10688.f36493;
        if (j <= j2 - j3) {
            long j4 = c14216.f46611;
            long j5 = c14216.f46607;
            if (j <= j4 - j5) {
                c10688.f36493 = j3 + j;
                c14216.f46607 = j5 + j;
                return;
            }
        }
        throw new IOException("Image source preparation budget exhausted");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m34311() {
        ArrayList arrayList = this.f46606;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C10688 c10688 = (C10688) arrayList.get(size);
            if (c10688.f36494 && (!c10688.f36495.exists() || c10688.f36495.delete())) {
                this.f46607 -= c10688.f36493;
                arrayList.remove(size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m34314() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Image source store requires a worker thread");
        }
        Thread thread = this.f46608;
        if (thread == null) {
            this.f46608 = Thread.currentThread();
        } else if (thread != Thread.currentThread()) {
            throw new IllegalStateException("Image source store accessed from another worker");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m34314();
        this.f46609 = true;
        ArrayList arrayList = this.f46606;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C10688) it.next()).f36494 = true;
        }
        m34311();
        if (arrayList.isEmpty()) {
            File file = this.f46612;
            if (file.exists()) {
                file.delete();
            }
        }
    }
}
