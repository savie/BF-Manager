package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۗۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P67V */
/* JADX INFO: loaded from: classes3.dex */
public final class C3129 implements InterfaceC14906 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19382 f10137;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20283 f10138;

    public C3129(C20283 c20283, C19382 c19382) {
        this.f10138 = c20283;
        this.f10137 = c19382;
    }

    @Override // l.InterfaceC14906
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String mo10208() {
        return this.f10137.f62622;
    }

    @Override // l.InterfaceC14906
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C7118 mo10206() {
        return this.f10138.m46609(this.f10137.f62621);
    }

    @Override // l.InterfaceC14906
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String mo10209() {
        try {
            return this.f10138.m46574(this.f10137);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // l.InterfaceC14906
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo10205(C0560 c0560) {
        try {
            this.f10138.m46588(this.f10137, c0560);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // l.InterfaceC14906
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C22737 mo10207() {
        try {
            return mo10203();
        } catch (IOException | C4511 unused) {
            return null;
        }
    }

    @Override // l.InterfaceC14906
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22737 mo10203() throws IOException {
        C19382 c19382 = this.f10137;
        C9378 c9378 = c19382.f62623;
        C20283 c20283 = this.f10138;
        if (c9378 != null) {
            C9378 c9378M46568 = c20283.m46568(c9378);
            c20283.m46552(c19382.f62621, c9378, c9378M46568);
            C22737 c22737M46551 = C20283.m46551(c9378M46568);
            C20283.m46558(c20283, c19382.f62622, c22737M46551);
            return c22737M46551;
        }
        return new C22737(c20283.m46612(c19382.f62624.getName()), c19382.f62620, c19382.f62625);
    }

    @Override // l.InterfaceC14906
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10204(String str) {
        C20283 c20283 = this.f10138;
        try {
            c20283.m46587(this.f10137, str);
        } catch (Exception e) {
            c20283.f65121.mo40348(e);
        }
    }
}
