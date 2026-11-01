package l;

/* JADX INFO: renamed from: l.ᩴۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7HH */
/* JADX INFO: loaded from: classes4.dex */
public final class C18690 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f60648;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f60649 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f60650;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m43178() {
        notifyAll();
        synchronized (C8107.f28385) {
            C8107.f28385.remove(this.f60650);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m43176() {
        System.out.println("waitStatusChanged " + this.f60650);
        int i = this.f60649;
        if (i == 0 || i == 3 || i == 2) {
            return false;
        }
        try {
            wait(15000L);
        } catch (InterruptedException unused) {
        }
        return i != this.f60649;
    }

    public C18690(int i) {
        this.f60650 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m43179() {
        return this.f60649;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m43177() {
        return this.f60648;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43175(C18690 c18690, int i, String str) {
        synchronized (c18690) {
            System.out.println("update " + c18690.f60650 + " status " + i + " extra " + str);
            c18690.f60649 = i;
            c18690.f60648 = str;
            c18690.notifyAll();
        }
    }
}
