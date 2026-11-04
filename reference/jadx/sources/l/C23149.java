package l;

import android.os.Looper;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.᩸᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P6N0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23149 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f75033;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final List f75034;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final File f75035;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f75036;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Executor f75037;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m52069() {
        if (this.f75036) {
            throw new IllegalStateException("Image export already closed");
        }
        this.f75033 = true;
    }

    public C23149(ArrayList arrayList, File file, Executor executor) {
        this.f75034 = C4681.unmodifiableList(new ArrayList(arrayList));
        this.f75035 = file;
        this.f75037 = executor;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m52068() {
        return this.f75034;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f75036) {
                return;
            }
            this.f75036 = true;
            if (!this.f75033 && this.f75035 != null) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    this.f75037.execute(new RunnableC20330(3, this));
                } else {
                    C20165.m46388(this.f75035);
                }
            }
        }
    }
}
