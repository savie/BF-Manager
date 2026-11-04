package l;

import android.content.DialogInterface;
import android.content.Intent;
import bin.mt.plus.R;
import java.util.concurrent.CancellationException;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ۧ۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes4.dex */
public final class C11647 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f37674;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f37675;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f37676;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23582 f37677;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public StringBuilder f37678;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20837 f37679;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f37680;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7919 f37681;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f37682;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19106 f37683;

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
    }

    public C11647(C23582 c23582, C7919 c7919, InterfaceC19106 interfaceC19106, int i, String str, int i2, String str2, C20837 c20837, int i3) {
        this.f37677 = c23582;
        this.f37681 = c7919;
        this.f37683 = interfaceC19106;
        this.f37682 = i;
        this.f37674 = str;
        this.f37680 = i2;
        this.f37675 = str2;
        this.f37679 = c20837;
        this.f37676 = i3;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        String str = this.f37675;
        String str2 = this.f37674;
        C7919 c7919 = this.f37681;
        c7919.m21468();
        C15508 c15508Mo15337 = this.f37683.mo15337();
        try {
            c15508Mo15337.m37180(new RunnableC1953(c7919));
            c7919.m21468();
            if (c15508Mo15337.m37177() != this.f37682) {
                throw new CancellationException();
            }
            if (str2.isEmpty()) {
                throw new C13464(R.string.MT_Protector);
            }
            C18415 c18415M42924 = C18415.m42924(this.f37680, str2);
            C7974.m21762(c18415M42924, str);
            C4245 c4245Matcher = c18415M42924.matcher((CharSequence) c15508Mo15337);
            boolean z = false;
            c4245Matcher.m13565(false);
            c4245Matcher.m13553(new RunnableC1953(c7919));
            C20837 c20837 = this.f37679;
            if (c20837 != null) {
                c4245Matcher.m13567region(c20837.f66719, c20837.f66718);
            }
            this.f37678 = new StringBuilder();
            while (C12632.m31399(c4245Matcher)) {
                c7919.m21468();
                c4245Matcher.expandReplacementInto(this.f37678, str);
                z = true;
            }
            c7919.m21468();
            if (!z) {
                throw new C13464(R.string.MT_Protector);
            }
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
        C23582 c23582 = this.f37677;
        int i = this.f37676;
        if (!(i == 3 && c23582.f76571.m54083()) && this.f37681.m21462()) {
            if (i == 1) {
                ActivityC4300.m13685(c23582.f76553, this.f37678.toString(), C21576.m49088(R.string.MT_Protector), null, null);
                return;
            }
            if (i == 2) {
                C21576.m49067(this.f37678);
                return;
            }
            if (i == 3) {
                InterfaceC19106 interfaceC19106 = this.f37683;
                interfaceC19106.replace(0, interfaceC19106.length(), this.f37678);
                c23582.f76571.mo52339(c23582.f76571.m54099());
            } else {
                if (i == 4) {
                    Intent intent = new Intent(c23582.f76553, (Class<?>) ActivityC18143.class);
                    intent.setAction("bin.mt.edit2.ACTION_CREATE_WITH_TEXT");
                    ActivityC18143.m42259(this.f37678);
                    AbstractActivityC17204 abstractActivityC17204 = c23582.f76553;
                    if (abstractActivityC17204 instanceof ActivityC18143) {
                        ((ActivityC18143) abstractActivityC17204).m42309(intent);
                        return;
                    } else {
                        c23582.f76553.startActivity(intent);
                        return;
                    }
                }
                throw new RuntimeException();
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f37681.m21467()) {
            boolean z = exc instanceof RuntimeException;
            C23582 c23582 = this.f37677;
            if (z) {
                if (c23582.f76571.m53943(this.f37683, (RuntimeException) exc)) {
                    return;
                }
            }
            if (exc instanceof CancellationException) {
                return;
            }
            if (exc instanceof PatternSyntaxException) {
                C23582.m52781(c23582, (PatternSyntaxException) exc);
            } else {
                c23582.f76553.m40401(exc, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f37678 = null;
        C7919 c7919 = this.f37681;
        c7919.m21466();
        C23582 c23582 = this.f37677;
        if (c23582.f76562 == c7919) {
            c23582.f76562 = null;
        }
    }
}
