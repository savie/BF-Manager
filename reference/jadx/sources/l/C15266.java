package l;

import java.util.concurrent.CancellationException;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ܶܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44TS */
/* JADX INFO: loaded from: classes4.dex */
public final class C15266 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10327 f49761;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC3800 f49762;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2916 f49763;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f49764;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f49765;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17069 f49766;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49767;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9268 f49768;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C23379 f49769;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14690 f49770;

    public C15266(C10327 c10327, C9268 c9268, InterfaceC2916 interfaceC2916, int i, C14690 c14690, C17069 c17069, String str, boolean z, InterfaceC3800 interfaceC3800) {
        this.f49761 = c10327;
        this.f49768 = c9268;
        this.f49763 = interfaceC2916;
        this.f49767 = i;
        this.f49770 = c14690;
        this.f49766 = c17069;
        this.f49765 = str;
        this.f49764 = z;
        this.f49762 = interfaceC3800;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C10327.m26186(this.f49761);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C9268 c9268 = this.f49768;
        c9268.m23807();
        RunnableC7856 runnableC7856 = new RunnableC7856(0, c9268);
        C3329 c3329Mo2398 = this.f49763.mo2398();
        try {
            c3329Mo2398.m9894(runnableC7856);
            c9268.m23807();
            if (c3329Mo2398.m9896() != this.f49767) {
                throw new CancellationException();
            }
            C6222 c6222Matcher = this.f49770.matcher((CharSequence) c3329Mo2398);
            c6222Matcher.m17274();
            c6222Matcher.m17263(runnableC7856);
            C17069 c17069 = this.f49766;
            if (c17069 != null) {
                c6222Matcher.m17275region(c17069.f54487, c17069.f54486);
            }
            this.f49769 = C23379.m51502(c3329Mo2398, c6222Matcher, this.f49765, this.f49764, 0, false, runnableC7856, new C14953(1, this.f49762));
            c9268.m23807();
            c3329Mo2398.close();
        } catch (Throwable th) {
            try {
                c3329Mo2398.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f49768.m23808()) {
            int iCount = this.f49769.count();
            C10327 c10327 = this.f49761;
            if (iCount != 0) {
                this.f49769.m51514(c10327.f35412, this.f49763, false);
                C10327.m26161(c10327, this.f49769.count());
            } else {
                c10327.m26190(true);
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f49768.m23811()) {
            boolean z = exc instanceof RuntimeException;
            C10327 c10327 = this.f49761;
            if (z) {
                if (c10327.f35412.m16894(this.f49763, (RuntimeException) exc)) {
                    return;
                }
            }
            if (exc instanceof CancellationException) {
                return;
            }
            if (exc instanceof C22356) {
                C15829.m37619(exc.getMessage());
            } else if (exc instanceof PatternSyntaxException) {
                c10327.m26160((PatternSyntaxException) exc);
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C9268 c9268 = this.f49768;
        C10327 c10327 = this.f49761;
        try {
            C23379 c23379 = this.f49769;
            if (c23379 != null) {
                c23379.close();
            }
        } finally {
            c9268.m23809();
            if (c10327.f35402 == c9268) {
                c10327.f35402 = null;
            }
            C10327.m26188(c10327);
        }
    }
}
