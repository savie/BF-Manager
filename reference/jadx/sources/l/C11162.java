package l;

import java.util.concurrent.CancellationException;
import java.util.function.Supplier;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ۤ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44TS */
/* JADX INFO: loaded from: classes4.dex */
public final class C11162 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC24329 f35145;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f35146;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19106 f35147;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11908 f35148;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C18360 f35149;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20837 f35150;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f35151;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7919 f35152;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35153;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18415 f35154;

    public C11162(C11908 c11908, C7919 c7919, InterfaceC19106 interfaceC19106, int i, C18415 c18415, C20837 c20837, String str, boolean z, InterfaceC24329 interfaceC24329) {
        this.f35148 = c11908;
        this.f35152 = c7919;
        this.f35147 = interfaceC19106;
        this.f35153 = i;
        this.f35154 = c18415;
        this.f35150 = c20837;
        this.f35151 = str;
        this.f35146 = z;
        this.f35145 = interfaceC24329;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C11908.m29816(this.f35148);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C7919 c7919 = this.f35152;
        c7919.m21468();
        RunnableC1953 runnableC1953 = new RunnableC1953(c7919);
        C15508 c15508Mo15337 = this.f35147.mo15337();
        try {
            c15508Mo15337.m37180(runnableC1953);
            c7919.m21468();
            if (c15508Mo15337.m37177() != this.f35153) {
                throw new CancellationException();
            }
            C4245 c4245Matcher = this.f35154.matcher((CharSequence) c15508Mo15337);
            c4245Matcher.m13565(false);
            c4245Matcher.m13553(runnableC1953);
            C20837 c20837 = this.f35150;
            if (c20837 != null) {
                c4245Matcher.m13567region(c20837.f66719, c20837.f66718);
            }
            String str = this.f35151;
            boolean z = this.f35146;
            final InterfaceC24329 interfaceC24329 = this.f35145;
            this.f35149 = C18360.m42816(c15508Mo15337, c4245Matcher, str, z, 0, false, runnableC1953, new Supplier() { // from class: l.᩷᩸ᩴ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new C2830(interfaceC24329, C19304.m44676(), 0);
                }
            });
            c7919.m21468();
            c15508Mo15337.close();
        } catch (Throwable th) {
            try {
                c15508Mo15337.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f35152.m21462()) {
            int iCount = this.f35149.count();
            C11908 c11908 = this.f35148;
            if (iCount != 0) {
                this.f35149.m42829(c11908.f38370, this.f35147, false);
                C11908.m29794(c11908, this.f35149.count());
            } else {
                c11908.m29815(true);
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f35152.m21467()) {
            boolean z = exc instanceof RuntimeException;
            C11908 c11908 = this.f35148;
            if (z) {
                if (c11908.f38370.m53943(this.f35147, (RuntimeException) exc)) {
                    return;
                }
            }
            if (exc instanceof CancellationException) {
                return;
            }
            if (exc instanceof C13464) {
                C22673.m51160(exc.getMessage());
            } else if (exc instanceof PatternSyntaxException) {
                c11908.m29793((PatternSyntaxException) exc);
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C7919 c7919 = this.f35152;
        C11908 c11908 = this.f35148;
        try {
            C18360 c18360 = this.f35149;
            if (c18360 != null) {
                c18360.close();
            }
        } finally {
            c7919.m21466();
            if (c11908.f38355 == c7919) {
                c11908.f38355 = null;
            }
            C11908.m29818(c11908);
        }
    }
}
