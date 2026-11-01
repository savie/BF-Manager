package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩷ۨܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8N8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20856 implements InterfaceC18739 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f67772;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20151 f67773;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f67774;

    public C20856(C20151 c20151) {
        this.f67773 = c20151;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46879() {
        if (this.f67774 == 2) {
            this.f67774 = 1;
        }
    }

    @Override // l.InterfaceC18739
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo12778() {
        return this.f67773.f65456;
    }

    @Override // l.InterfaceC18739
    /* JADX INFO: renamed from: ۙ */
    public final void mo12777() throws IOException {
        C20151 c20151 = this.f67773;
        if (c20151.f65453) {
            return;
        }
        c20151.f65454.m51367(Integer.MIN_VALUE);
    }

    @Override // l.InterfaceC18739
    /* JADX INFO: renamed from: ۙ */
    public final int mo12776(C12526 c12526, C16033 c16033, int i) {
        m46878();
        C20151 c20151 = this.f67773;
        boolean z = c20151.f65456;
        if (z && c20151.f65463 == null) {
            this.f67774 = 2;
        }
        int i2 = this.f67774;
        if (i2 == 2) {
            c16033.m42270(4);
            return -4;
        }
        if ((i & 2) != 0 || i2 == 0) {
            c12526.f41899 = c20151.f65457;
            this.f67774 = 1;
            return -5;
        }
        if (!z) {
            return -3;
        }
        c20151.f65463.getClass();
        c16033.m42270(1);
        c16033.f51910 = 0L;
        if ((i & 4) == 0) {
            c16033.m38027(c20151.f65458);
            c16033.f51912.put(c20151.f65463, 0, c20151.f65458);
        }
        if ((i & 1) == 0) {
            this.f67774 = 2;
        }
        return -4;
    }

    @Override // l.InterfaceC18739
    /* JADX INFO: renamed from: ۙ */
    public final int mo12775(long j) {
        m46878();
        if (j <= 0 || this.f67774 == 2) {
            return 0;
        }
        this.f67774 = 2;
        return 1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m46878() {
        if (this.f67772) {
            return;
        }
        C20151 c20151 = this.f67773;
        C7512 c7512 = c20151.f65460;
        c7512.m20014(new C17548(c7512, new C13157(1, C6632.m17981(c20151.f65457.f25265), c20151.f65457, 0, null, C17983.m41856(0L), -9223372036854775807L)));
        this.f67772 = true;
    }
}
