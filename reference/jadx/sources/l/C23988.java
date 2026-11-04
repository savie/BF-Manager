package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.᩺ۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes.dex */
public final class C23988 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f77628;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Set f77629 = Collections.newSetFromMap(new IdentityHashMap());

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C18766 f77630;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53538(C18766 c18766) {
        synchronized (this) {
            if (!this.f77628) {
                this.f77630 = c18766;
            } else {
                c18766.f60953.m25476();
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m53540(C18766 c18766) {
        synchronized (this) {
            if (this.f77630 == c18766) {
                this.f77630 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12053 m53536(Closeable closeable) throws InterruptedIOException {
        C12053 c12053 = new C12053(this, closeable);
        synchronized (this) {
            if (!this.f77628) {
                this.f77629.add(c12053);
                return c12053;
            }
            InterruptedIOException interruptedIOException = new InterruptedIOException("HLS thumbnail generation was canceled");
            try {
                c12053.close();
                throw interruptedIOException;
            } catch (IOException e) {
                interruptedIOException.addSuppressed(e);
                throw interruptedIOException;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m53539() throws InterruptedIOException {
        synchronized (this) {
            if (this.f77628 || Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException("HLS thumbnail generation was canceled");
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53537() {
        synchronized (this) {
            if (this.f77628) {
                return;
            }
            this.f77628 = true;
            C18766 c18766 = this.f77630;
            ArrayList arrayList = new ArrayList(this.f77629);
            if (c18766 != null) {
                c18766.f60953.m25476();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C20244.m46520((C12053) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m53535(C23988 c23988, C12053 c12053) {
        synchronized (c23988) {
            c23988.f77629.remove(c12053);
        }
    }
}
