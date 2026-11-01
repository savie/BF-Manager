package l;

/* JADX INFO: renamed from: l.ܺ۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8DU */
/* JADX INFO: loaded from: classes4.dex */
public final class C15817 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C20755[] f51186;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f51187;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f51188;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C3403 f51189;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m37597(int i) {
        C20755 c20755M37594 = m37594(i);
        if (c20755M37594 != null) {
            c20755M37594.f67550 = false;
            C15817 c15817 = c20755M37594.f67552;
            long j = c15817.f51188;
            c15817.f51188 = 1 + j;
            c20755M37594.f67551 = j;
        }
    }

    public C15817(InterfaceC3820[] interfaceC3820Arr) {
        int length = interfaceC3820Arr.length;
        this.f51187 = length;
        this.f51186 = new C20755[length];
        for (int i = 0; i < this.f51187; i++) {
            C20755[] c20755Arr = this.f51186;
            C20755 c20755 = new C20755(this);
            c20755Arr[i] = c20755;
            c20755.f67549 = interfaceC3820Arr[i];
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16810 m37596() {
        if (this.f51189 == null) {
            AbstractC0998 abstractC0998 = (AbstractC0998) this.f51186[0].f67549;
            abstractC0998.getClass();
            this.f51189 = abstractC0998.m3824();
        }
        return this.f51189;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C20755 m37594(int i) {
        for (C20755 c20755 : this.f51186) {
            if (c20755.f67553 == i) {
                return c20755;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0037  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20755 m37593(C15817 c15817, int i) {
        C20755 c20755M37594 = c15817.m37594(i);
        if (c20755M37594 == null) {
            C20755 c20755 = null;
            C20755 c20756 = null;
            for (C20755 c20757 : c15817.f51186) {
                if (c20757.f67549 == null) {
                    c20755M37594 = c20757;
                } else {
                    if (c20755 != null) {
                        if (!c20757.f67550 && c20757.f67551 < c20755.f67551) {
                            c20755 = c20757;
                        }
                    } else if (!c20757.f67550) {
                        c20755 = c20757;
                    } else if (c20756 == null || c20757.f67551 < c20756.f67551) {
                        c20756 = c20757;
                    }
                }
            }
            c20755M37594 = c20755 != null ? c20755 : c20756;
        }
        c20755M37594.f67553 = i;
        long j = c15817.f51188;
        c15817.f51188 = 1 + j;
        c20755M37594.f67551 = j;
        c20755M37594.f67550 = true;
        return c20755M37594;
    }
}
