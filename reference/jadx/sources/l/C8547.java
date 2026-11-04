package l;

import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ۢ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: X72V */
/* JADX INFO: loaded from: classes3.dex */
public final class C8547 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f27907 = new HashSet();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f27908;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m22868() {
        if (this.f27908) {
            throw new InterruptedIOException("Remote payload opening was canceled");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m22869(InterfaceC6595 interfaceC6595) {
        this.f27907.remove(interfaceC6595);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22867(InterfaceC6595 interfaceC6595) throws InterruptedIOException {
        synchronized (this) {
            if (!this.f27908) {
                this.f27907.add(interfaceC6595);
            } else {
                interfaceC6595.cancel();
                throw new InterruptedIOException("Remote payload opening was canceled");
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22866() {
        synchronized (this) {
            if (this.f27908) {
                return;
            }
            this.f27908 = true;
            ArrayList arrayList = new ArrayList(this.f27907);
            this.f27907.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC6595) it.next()).cancel();
            }
        }
    }
}
