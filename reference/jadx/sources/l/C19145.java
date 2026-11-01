package l;

import android.content.DialogInterface;
import android.content.Intent;
import bin.mt.plus.R;
import java.util.concurrent.CancellationException;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.᩵֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes5.dex */
public final class C19145 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20556 f61827;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f61828;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f61829;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f61830;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f61831;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17069 f61832;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f61833;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9268 f61834;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public StringBuilder f61835;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2916 f61836;

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
    }

    public C19145(C20556 c20556, C9268 c9268, InterfaceC2916 interfaceC2916, int i, String str, int i2, String str2, C17069 c17069, int i3) {
        this.f61827 = c20556;
        this.f61834 = c9268;
        this.f61836 = interfaceC2916;
        this.f61833 = i;
        this.f61828 = str;
        this.f61831 = i2;
        this.f61830 = str2;
        this.f61832 = c17069;
        this.f61829 = i3;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        String str = this.f61830;
        String str2 = this.f61828;
        C9268 c9268 = this.f61834;
        c9268.m23807();
        C3329 c3329Mo2398 = this.f61836.mo2398();
        try {
            c3329Mo2398.m9894(new RunnableC7856(0, c9268));
            c9268.m23807();
            if (c3329Mo2398.m9896() != this.f61833) {
                throw new CancellationException();
            }
            if (str2.isEmpty()) {
                throw new C22356(R.string.MT_Protector);
            }
            C14690 c14690M35218 = C14690.m35218(this.f61831, str2);
            C9751.m24733(c14690M35218, str);
            C6222 c6222Matcher = c14690M35218.matcher((CharSequence) c3329Mo2398);
            c6222Matcher.m17274();
            c6222Matcher.m17263(new RunnableC7856(0, c9268));
            C17069 c17069 = this.f61832;
            if (c17069 != null) {
                c6222Matcher.m17275region(c17069.f54487, c17069.f54486);
            }
            this.f61835 = new StringBuilder();
            boolean z = false;
            while (C5780.m15915(c6222Matcher)) {
                c9268.m23807();
                c6222Matcher.expandReplacementInto(this.f61835, str);
                z = true;
            }
            c9268.m23807();
            if (!z) {
                throw new C22356(R.string.MT_Protector);
            }
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
        C20556 c20556 = this.f61827;
        int i = this.f61829;
        if (!(i == 3 && c20556.f66562.m17004()) && this.f61834.m23808()) {
            if (i == 1) {
                ActivityC21135.m47562(c20556.f66564, this.f61835.toString(), C16737.m39288(R.string.MT_Protector), null, null);
                return;
            }
            if (i == 2) {
                C16737.m39272(this.f61835);
                return;
            }
            if (i == 3) {
                InterfaceC2916 interfaceC2916 = this.f61836;
                interfaceC2916.replace(0, interfaceC2916.length(), this.f61835);
                c20556.f66562.mo17029(c20556.f66562.m16842());
            } else {
                if (i == 4) {
                    Intent intent = new Intent(c20556.f66564, (Class<?>) ActivityC11632.class);
                    intent.setAction("bin.mt.edit2.ACTION_CREATE_WITH_TEXT");
                    ActivityC11632.m28982(this.f61835);
                    AbstractActivityC12483 abstractActivityC12483 = c20556.f66564;
                    if (abstractActivityC12483 instanceof ActivityC11632) {
                        ((ActivityC11632) abstractActivityC12483).m29021(intent);
                        return;
                    } else {
                        c20556.f66564.startActivity(intent);
                        return;
                    }
                }
                throw new RuntimeException();
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f61834.m23811()) {
            boolean z = exc instanceof RuntimeException;
            C20556 c20556 = this.f61827;
            if (z) {
                if (c20556.f66562.m16894(this.f61836, (RuntimeException) exc)) {
                    return;
                }
            }
            if (exc instanceof CancellationException) {
                return;
            }
            if (exc instanceof PatternSyntaxException) {
                C20556.m46342(c20556, (PatternSyntaxException) exc);
            } else {
                c20556.f66564.m31002(exc, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f61835 = null;
        C9268 c9268 = this.f61834;
        c9268.m23809();
        C20556 c20556 = this.f61827;
        if (c20556.f66584 == c9268) {
            c20556.f66584 = null;
        }
    }
}
