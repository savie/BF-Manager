package l;

/* JADX INFO: renamed from: l.۬᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7HH */
/* JADX INFO: loaded from: classes4.dex */
public final class C14189 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f44859;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f44860 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f44861;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized void m34482() {
        notifyAll();
        synchronized (C4650.f16450) {
            C4650.f16450.remove(this.f44861);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m34484() {
        System.out.println("waitStatusChanged " + this.f44861);
        int i = this.f44860;
        if (i == 0 || i == 3 || i == 2) {
            return false;
        }
        try {
            wait(15000L);
        } catch (InterruptedException unused) {
        }
        return i != this.f44860;
    }

    public C14189(int i) {
        this.f44861 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m34483() {
        return this.f44860;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m34481() {
        return this.f44859;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34480(C14189 c14189, int i, String str) {
        synchronized (c14189) {
            System.out.println("update " + c14189.f44861 + " status " + i + " extra " + str);
            c14189.f44860 = i;
            c14189.f44859 = str;
            c14189.notifyAll();
        }
    }
}
