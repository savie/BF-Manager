package l;

import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AQI */
/* JADX INFO: loaded from: classes4.dex */
public final class C19805 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile int f63583;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Object[] f63584;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f63585;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m45011(Object obj) {
        if (this.f63585) {
            return false;
        }
        if (this.f63583 < this.f63584.length) {
            synchronized (this) {
                int i = this.f63583;
                Object[] objArr = this.f63584;
                if (i < objArr.length) {
                    int i2 = this.f63583;
                    this.f63583 = i2 + 1;
                    objArr[i2] = obj;
                }
            }
            return true;
        }
        return false;
    }

    public C19805() {
        this((int) (C5464.f18831 * 1.5f));
    }

    public C19805(int i) {
        this.f63584 = new Object[i];
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object m45009() {
        if (this.f63583 > 0) {
            synchronized (this) {
                if (this.f63583 > 0) {
                    int i = this.f63583 - 1;
                    this.f63583 = i;
                    Object[] objArr = this.f63584;
                    Object obj = objArr[i];
                    objArr[i] = null;
                    return obj;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m45010() {
        return !this.f63585 && this.f63583 < this.f63584.length;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m45012() {
        synchronized (this) {
            Arrays.fill(this.f63584, (Object) null);
            this.f63583 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f63585 = true;
    }
}
