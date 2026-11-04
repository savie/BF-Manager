package l;

import android.content.Intent;
import android.net.Uri;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.۬ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13664 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6733 f43401;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Intent f43402;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f43403 = C6382.f21566.m49876("Android/mt_install_tmp.apk");

    public C13664(C6733 c6733, Intent intent) {
        this.f43401 = c6733;
        this.f43402 = intent;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33444(C13664 c13664) {
        c13664.f7780.m33188((Runnable) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8193(this.f43401.f22436, R.string.MT_Protector, 300, new Runnable() { // from class: l.ۜۛᩴ
            @Override // java.lang.Runnable
            public final void run() {
                C13664.m33444(this.f22961);
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m33445(C13664 c13664) {
        C13511 c13511 = c13664.f7780;
        return c13511 != null && c13511.m33196();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        this.f43401.f22440.m49847(this.f43403, (C24523) null, new InterfaceC23711() { // from class: l.۠ۛᩴ
            @Override // l.InterfaceC23711
            /* JADX INFO: renamed from: ֫ۙ */
            public final /* synthetic */ void mo3465() {
                throw null;
            }

            @Override // l.InterfaceC7509
            /* JADX INFO: renamed from: ۫ */
            public final boolean mo924() {
                return C13664.m33445(this.f27611);
            }
        });
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C13511 c13511 = this.f7780;
        AbstractC22044 abstractC22044 = this.f43403;
        if (c13511 != null && c13511.m33196()) {
            abstractC22044.mo4287();
            return;
        }
        Uri uriM49836 = abstractC22044.m49836();
        Intent intent = this.f43402;
        intent.setDataAndType(uriM49836, "application/vnd.android.package-archive");
        this.f43401.m18823(intent);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f43401.m18824(exc);
        this.f43403.mo4287();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
