package l;

/* JADX INFO: renamed from: l.ܶܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E43E */
/* JADX INFO: loaded from: classes4.dex */
public final class C16217 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f52700;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f52701;

    public C16217() {
        this.f52701 = -1;
        this.f52700 = -1;
    }

    public C16217(int i, int i2) {
        this.f52701 = i;
        this.f52700 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38523(C16217 c16217) {
        if (c16217 == null) {
            return;
        }
        int i = this.f52701;
        if (i == -1) {
            this.f52701 = c16217.f52701;
        } else {
            int i2 = c16217.f52701;
            if (i2 != -1) {
                if (i >= i2) {
                    i = i2;
                }
                this.f52701 = i;
            }
        }
        int i3 = this.f52700;
        if (i3 == -1) {
            this.f52700 = c16217.f52700;
            return;
        }
        int i4 = c16217.f52700;
        if (i4 != -1) {
            if (i3 <= i4) {
                i3 = i4;
            }
            this.f52700 = i3;
        }
    }
}
