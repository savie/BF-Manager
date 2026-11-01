package l;

import android.os.Looper;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.۫֫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: P6N0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12099 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f40466;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final List f40467;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final File f40468;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f40469;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Executor f40470;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m30088() {
        if (this.f40466) {
            throw new IllegalStateException("Image export already closed");
        }
        this.f40469 = true;
    }

    public C12099(ArrayList arrayList, File file, Executor executor) {
        this.f40467 = C0561.unmodifiableList(new ArrayList(arrayList));
        this.f40468 = file;
        this.f40470 = executor;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m30087() {
        return this.f40467;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f40466) {
                return;
            }
            this.f40466 = true;
            if (!this.f40469 && this.f40468 != null) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    this.f40470.execute(new RunnableC19814(3, this));
                } else {
                    C17037.m39814(this.f40468);
                }
            }
        }
    }
}
