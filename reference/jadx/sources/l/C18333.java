package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳ᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18333 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC17341 f58470;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f58471;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f58472;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f58473;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f58474;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12233 f58475;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21422 f58476;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f58477;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f58478;

    public C18333(Main main, int i, String str, AbstractC12233 abstractC12233, String str2, String str3, C21422 c21422, String str4, AbstractDialogInterfaceOnClickListenerC17341 abstractDialogInterfaceOnClickListenerC17341) {
        this.f58477 = main;
        this.f58474 = i;
        this.f58478 = str;
        this.f58475 = abstractC12233;
        this.f58471 = str2;
        this.f58472 = str3;
        this.f58476 = c21422;
        this.f58473 = str4;
        this.f58470 = abstractDialogInterfaceOnClickListenerC17341;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f58477, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws Exception {
        String str = this.f58478;
        String str2 = this.f58472;
        String str3 = this.f58471;
        AbstractC12233 abstractC12233 = this.f58475;
        int i = this.f58474;
        if (i == 0) {
            String strM18162 = C6730.m18162(str, System.currentTimeMillis() + ".tmp");
            abstractC12233.mo10265(str3, strM18162);
            try {
                abstractC12233.mo10265(str2, str3);
                abstractC12233.mo10265(strM18162, str2);
                return;
            } catch (Exception e) {
                try {
                    abstractC12233.mo10265(strM18162, str3);
                } catch (Exception unused) {
                }
                throw e;
            }
        }
        if (i == 1) {
            String strM18163 = C6730.m18162(str, System.currentTimeMillis() + ".tmp");
            abstractC12233.mo10265(str3, strM18163);
            try {
                abstractC12233.mo10265(str2, str3);
                abstractC12233.mo10270(strM18163, false);
                return;
            } catch (Exception e2) {
                try {
                    abstractC12233.mo10265(strM18163, str3);
                } catch (Exception unused2) {
                }
                throw e2;
            }
        }
        if (i != 2) {
            return;
        }
        String strMo10260 = abstractC12233.mo10260(str3 + ".bak");
        abstractC12233.mo10265(str3, strMo10260);
        try {
            abstractC12233.mo10265(str2, str3);
        } catch (Exception e3) {
            try {
                abstractC12233.mo10265(strMo10260, str3);
            } catch (Exception unused3) {
            }
            throw e3;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        this.f58476.m47971(this.f58473);
        this.f58470.m40364();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f58477.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
        this.f58476.m47969();
        C21094.m47529(this.f58475.mo10276());
    }
}
