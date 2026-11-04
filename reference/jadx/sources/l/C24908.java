package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B74J */
/* JADX INFO: loaded from: classes.dex */
public final class C24908 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C11481 f80613;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Boolean f80614;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f80615;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f80616;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f80617;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f80618;

    public /* synthetic */ C24908(C11481 c11481, int i) {
        this(c11481);
    }

    public C24908(C11481 c11481) {
        this.f80616 = -1L;
        this.f80613 = c11481;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C24908 m55488() {
        C24908 c24908 = new C24908(null);
        c24908.f80617 = true;
        return c24908;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m55490() {
        String str;
        synchronized (C23416.f75798) {
            str = (!this.f80615 || this.f80617) ? null : this.f80618;
        }
        return str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m55492() {
        long j;
        synchronized (C23416.f75798) {
            j = (!this.f80615 || this.f80617) ? -1L : this.f80616;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Boolean m55491() {
        Boolean bool;
        synchronized (C23416.f75798) {
            bool = (!this.f80615 || this.f80617) ? null : this.f80614;
        }
        return bool;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55485(C24908 c24908, String str, long j, Boolean bool) {
        C11481 c11481;
        if (c24908.f80617 || (c11481 = c24908.f80613) == null) {
            return;
        }
        c11481.f36113--;
        c11481.f36114++;
        c24908.f80618 = str;
        c24908.f80616 = j;
        c24908.f80614 = bool;
        c24908.f80615 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public void m55487() {
        if (this.f80617) {
            return;
        }
        this.f80617 = true;
        C11481 c11481 = this.f80613;
        if (c11481 != null) {
            if (this.f80615) {
                c11481.f36114--;
            } else {
                c11481.f36113--;
            }
        }
        this.f80615 = false;
        this.f80618 = null;
        this.f80616 = -1L;
        this.f80614 = null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        InterfaceC13433 interfaceC13433;
        Thread thread;
        synchronized (C23416.f75798) {
            m55487();
            C11481 c11481 = this.f80613;
            if (c11481 != null && c11481.f36118 && c11481.f36113 + c11481.f36114 == 0) {
                interfaceC13433 = c11481.f36117;
                thread = c11481.f36115;
            } else {
                interfaceC13433 = null;
                thread = null;
            }
            C23416.f75798.notifyAll();
        }
        if (thread != null && thread != Thread.currentThread()) {
            thread.interrupt();
        }
        if (interfaceC13433 != null) {
            try {
                interfaceC13433.close();
            } catch (IOException unused) {
            }
        }
    }
}
