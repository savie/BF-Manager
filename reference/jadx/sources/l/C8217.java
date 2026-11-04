package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.۟᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes4.dex */
public final class C8217 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f27052;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f27053;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f27054;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19404 f27055;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f27056;

    public C8217(ViewOnClickListenerC19404 viewOnClickListenerC19404, AbstractActivityC17204 abstractActivityC17204, String str) {
        this.f27055 = viewOnClickListenerC19404;
        this.f27052 = abstractActivityC17204;
        this.f27054 = str;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f27052, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException, C4866 {
        String strM49871 = C14584.m35193(this.f27054, new String[0]).m49871();
        this.f27056 = strM49871;
        String strM49367 = AbstractC21775.m49367(strM49871);
        if (strM49367 == null) {
            throw new C4866(this.f27055.getString(R.string.MT_Protector));
        }
        this.f27053 = C1402.m5124(1, 1, strM49367);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        String strM36755 = C15306.m36755(this.f27053);
        String strM36751 = C15306.m36751(this.f27053);
        if (strM36755.length() > 130 || C24013.m53566(strM36755)) {
            strM36755 = "# TOO_LONG_NAME/";
        }
        if (strM36751.length() > 100) {
            strM36751 = strM36751.substring(0, 50) + "_too_long_" + Long.toHexString(((long) strM36751.hashCode()) & 4294967295L);
        }
        this.f27055.m44871(R.string.MT_Protector, strM36755, strM36751, true, new InterfaceC23955() { // from class: l.֡᩺ۧ
            @Override // l.InterfaceC23955
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final Object mo3124(Object obj, Object obj2) {
                return this.f2766.f27056;
            }
        });
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f27052.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
