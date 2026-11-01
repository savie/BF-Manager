package l;

import android.content.Intent;
import android.net.Uri;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.۠ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8066 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Intent f28279;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13752 f28280;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f28281 = C11904.f39934.m46690("Android/mt_install_tmp.apk");

    public C8066(C13752 c13752, Intent intent) {
        this.f28280 = c13752;
        this.f28279 = intent;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21249(C8066 c8066) {
        c8066.f12806.m40697((Runnable) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10248(this.f28280.f45340, R.string.MT_Protector, 300, new Runnable() { // from class: l.ᩴۡۚ
            @Override // java.lang.Runnable
            public final void run() {
                C8066.m21249(this.f60462);
            }
        });
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m21250(C8066 c8066) {
        C17485 c17485 = c8066.f12806;
        return c17485 != null && c17485.m40693();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        this.f28280.f45343.m46701(this.f28281, (C5222) null, new InterfaceC8978() { // from class: l.ᩳۡۚ
            @Override // l.InterfaceC5614
            /* JADX INFO: renamed from: ֨ */
            public final boolean mo2357() {
                return C8066.m21250(this.f57396);
            }

            @Override // l.InterfaceC8978
            /* JADX INFO: renamed from: ۘۙ */
            public final /* synthetic */ void mo2885() {
                throw null;
            }
        });
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C17485 c17485 = this.f12806;
        AbstractC20745 abstractC20745 = this.f28281;
        if (c17485 != null && c17485.m40693()) {
            abstractC20745.mo24644();
            return;
        }
        Uri uriM46732 = abstractC20745.m46732();
        Intent intent = this.f28279;
        intent.setDataAndType(uriM46732, "application/vnd.android.package-archive");
        this.f28280.m33508(intent);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f28280.m33509(exc);
        this.f28281.mo24644();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
