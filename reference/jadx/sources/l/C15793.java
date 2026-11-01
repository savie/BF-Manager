package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܺ۟۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B74J */
/* JADX INFO: loaded from: classes4.dex */
public final class C15793 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f51136;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Boolean f51137;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f51138;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20731 f51139;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f51140;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f51141;

    public /* synthetic */ C15793(C20731 c20731, int i) {
        this(c20731);
    }

    public C15793(C20731 c20731) {
        this.f51136 = -1L;
        this.f51139 = c20731;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C15793 m37556() {
        C15793 c15793 = new C15793(null);
        c15793.f51140 = true;
        return c15793;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m37558() {
        String str;
        synchronized (C12265.f41023) {
            str = (!this.f51138 || this.f51140) ? null : this.f51141;
        }
        return str;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m37559() {
        long j;
        synchronized (C12265.f41023) {
            j = (!this.f51138 || this.f51140) ? -1L : this.f51136;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Boolean m37557() {
        Boolean bool;
        synchronized (C12265.f41023) {
            bool = (!this.f51138 || this.f51140) ? null : this.f51137;
        }
        return bool;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37553(C15793 c15793, String str, long j, Boolean bool) {
        C20731 c20731;
        if (c15793.f51140 || (c20731 = c15793.f51139) == null) {
            return;
        }
        c20731.f67469--;
        c20731.f67470++;
        c15793.f51141 = str;
        c15793.f51136 = j;
        c15793.f51137 = bool;
        c15793.f51138 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public void m37552() {
        if (this.f51140) {
            return;
        }
        this.f51140 = true;
        C20731 c20731 = this.f51139;
        if (c20731 != null) {
            if (this.f51138) {
                c20731.f67470--;
            } else {
                c20731.f67469--;
            }
        }
        this.f51138 = false;
        this.f51141 = null;
        this.f51136 = -1L;
        this.f51137 = null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        InterfaceC15785 interfaceC15785;
        Thread thread;
        synchronized (C12265.f41023) {
            m37552();
            C20731 c20731 = this.f51139;
            if (c20731 != null && c20731.f67475 && c20731.f67469 + c20731.f67470 == 0) {
                interfaceC15785 = c20731.f67467;
                thread = c20731.f67473;
            } else {
                interfaceC15785 = null;
                thread = null;
            }
            C12265.f41023.notifyAll();
        }
        if (thread != null && thread != Thread.currentThread()) {
            thread.interrupt();
        }
        if (interfaceC15785 != null) {
            try {
                interfaceC15785.close();
            } catch (IOException unused) {
            }
        }
    }
}
