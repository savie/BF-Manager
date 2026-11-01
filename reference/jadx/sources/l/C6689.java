package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۜۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: G4GB */
/* JADX INFO: loaded from: classes2.dex */
public final class C6689 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C2455 f22557;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22690 f22558;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22918 f22559;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f22560 = true;

    public C6689(C2455 c2455, C22918 c22918) {
        this.f22559 = c22918;
        C22690 c22690 = c22918.f74508;
        C13638.requireNonNull(c22690);
        this.f22558 = c22690;
        this.f22557 = c2455;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18065(InterfaceC10389 interfaceC10389) throws IOException {
        C22918 c22918 = this.f22559;
        C1388 c1388Mo4870 = this.f22557.m7467().mo4870();
        try {
            long length = c1388Mo4870.length();
            C22487.m49992(new C5984(c1388Mo4870, 0L, length, false), c22918.m50720(), length, interfaceC10389);
            c22918.m50730();
            c1388Mo4870.close();
            this.f22560 = false;
        } catch (Throwable th) {
            try {
                c1388Mo4870.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m18063() {
        return this.f22558.f73908;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m18064(String str) throws IOException {
        C22918 c22918 = this.f22559;
        if (c22918.f74502 != -1) {
            throw new UnsupportedOperationException("Virtual entry is not supported in split mode");
        }
        boolean z = this.f22560;
        C2455 c2455 = this.f22557;
        if (z) {
            C1388 c1388Mo4870 = c2455.m7467().mo4870();
            try {
                c22918.m50724(new C5984(c1388Mo4870, 0L, c1388Mo4870.length(), false));
                c22918.m50730();
                c1388Mo4870.close();
                this.f22560 = false;
            } catch (Throwable th) {
                try {
                    c1388Mo4870.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C12107 c12107M7470 = c2455.m7470(str);
        C22690 c22690 = new C22690(c12107M7470, c22918.f74499);
        C22918.m50710(c22690);
        c22690.f73893 = c12107M7470.m30131();
        long jM30137 = c12107M7470.m30137();
        C22690 c22691 = this.f22558;
        long j = jM30137 + c22691.f73896;
        c22690.f73908 = j;
        c22690.f73901 = j;
        c22690.f73896 = c12107M7470.m30099() + c22691.f73896;
        c22918.f74510.add(c22690);
        return c22690.f73908 - c22691.f73908;
    }
}
