package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳۤ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes4.dex */
public final class C14465 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f47435;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Set f47436 = Collections.newSetFromMap(new IdentityHashMap());

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C2385 f47437;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34867(C2385 c2385) {
        synchronized (this) {
            if (!this.f47435) {
                this.f47437 = c2385;
            } else {
                c2385.f8419.m28927();
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34869(C2385 c2385) {
        synchronized (this) {
            if (this.f47437 == c2385) {
                this.f47437 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10937 m34865(Closeable closeable) throws InterruptedIOException {
        C10937 c10937 = new C10937(this, closeable);
        synchronized (this) {
            if (!this.f47435) {
                this.f47436.add(c10937);
                return c10937;
            }
            InterruptedIOException interruptedIOException = new InterruptedIOException("HLS thumbnail generation was canceled");
            try {
                c10937.close();
                throw interruptedIOException;
            } catch (IOException e) {
                interruptedIOException.addSuppressed(e);
                throw interruptedIOException;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34868() throws InterruptedIOException {
        synchronized (this) {
            if (this.f47435 || Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException("HLS thumbnail generation was canceled");
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34866() {
        synchronized (this) {
            if (this.f47435) {
                return;
            }
            this.f47435 = true;
            C2385 c2385 = this.f47437;
            ArrayList arrayList = new ArrayList(this.f47436);
            if (c2385 != null) {
                c2385.f8419.m28927();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C19431.m44468((C10937) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34864(C14465 c14465, C10937 c10937) {
        synchronized (c14465) {
            c14465.f47436.remove(c10937);
        }
    }
}
