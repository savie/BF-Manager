package l;

import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X72V */
/* JADX INFO: loaded from: classes2.dex */
public final class C1752 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f6883 = new HashSet();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f6884;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m5801() {
        if (this.f6884) {
            throw new InterruptedIOException("Remote payload opening was canceled");
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m5802(InterfaceC11617 interfaceC11617) {
        this.f6883.remove(interfaceC11617);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5800(InterfaceC11617 interfaceC11617) throws InterruptedIOException {
        synchronized (this) {
            if (!this.f6884) {
                this.f6883.add(interfaceC11617);
            } else {
                interfaceC11617.cancel();
                throw new InterruptedIOException("Remote payload opening was canceled");
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5799() {
        synchronized (this) {
            if (this.f6884) {
                return;
            }
            this.f6884 = true;
            ArrayList arrayList = new ArrayList(this.f6883);
            this.f6883.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC11617) it.next()).cancel();
            }
        }
    }
}
