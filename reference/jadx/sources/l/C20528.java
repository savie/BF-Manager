package l;

import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵ۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AQI */
/* JADX INFO: loaded from: classes5.dex */
public final class C20528 implements Closeable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object[] f65745;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile int f65746;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f65747;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m47060(Object obj) {
        if (this.f65747) {
            return false;
        }
        if (this.f65746 < this.f65745.length) {
            synchronized (this) {
                int i = this.f65746;
                Object[] objArr = this.f65745;
                if (i < objArr.length) {
                    int i2 = this.f65746;
                    this.f65746 = i2 + 1;
                    objArr[i2] = obj;
                }
            }
            return true;
        }
        return false;
    }

    public C20528() {
        this((int) (C11138.f35105 * 1.5f));
    }

    public C20528(int i) {
        this.f65745 = new Object[i];
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object m47061() {
        if (this.f65746 > 0) {
            synchronized (this) {
                if (this.f65746 > 0) {
                    int i = this.f65746 - 1;
                    this.f65746 = i;
                    Object[] objArr = this.f65745;
                    Object obj = objArr[i];
                    objArr[i] = null;
                    return obj;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47059() {
        return !this.f65747 && this.f65746 < this.f65745.length;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m47062() {
        synchronized (this) {
            Arrays.fill(this.f65745, (Object) null);
            this.f65746 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f65747 = true;
    }
}
