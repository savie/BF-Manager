package l;

import android.content.DialogInterface;
import android.content.Intent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܳܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes5.dex */
public final class C15398 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7941 f50185;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11555 f50186;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC18143 f50187;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C14691 f50188;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C15508 f50189;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f50190;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f50191;

    public C15398(C7941 c7941, ActivityC18143 activityC18143, String str, AbstractC22044 abstractC22044) {
        this.f50185 = c7941;
        this.f50187 = activityC18143;
        this.f50190 = str;
        this.f50191 = abstractC22044;
        this.f50186 = C11555.m29068(c7941.getViewLifecycleOwner());
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        this.f50189 = this.f50185.f26387.m54021().mo15337();
        m8194(this.f50187, this.f50186);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C15508 c15508 = this.f50189;
        try {
            C14691 c14691M43821 = C18899.m43821(c15508);
            this.f50188 = c14691M43821;
            c14691M43821.m35340("<--id-c5skl23kjndf-->", this.f50190);
            this.f50191.m49879(this.f50188.mo30929());
            c15508.close();
        } catch (Throwable th) {
            if (c15508 != null) {
                try {
                    c15508.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f50186.m29071()) {
            long jMo4286 = this.f50191.mo4286();
            C7941 c7941 = this.f50185;
            c7941.f26379 = jMo4286;
            c7941.startActivity(new Intent(c7941.getContext(), (Class<?>) ActivityC9202.class));
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        String message;
        if (this.f50186.m29071()) {
            this.f50187.m40401(exc, (DialogInterface.OnDismissListener) null);
            if (!(exc instanceof C7367) || (message = ((C7367) exc).getMessage()) == null) {
                return;
            }
            Matcher matcher = Pattern.compile("at line (\\d+) column (\\d+)").matcher(message);
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                C17359.requireNonNull(strGroup);
                this.f50185.f26387.m54024(Integer.parseInt(strGroup) - 1);
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C15508 c15508 = this.f50189;
        if (c15508 != null) {
            c15508.close();
        }
        m8196();
    }
}
