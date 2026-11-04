package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫᩹۫, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13417 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f42733;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f42734;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f42735;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC8552 f42736;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f42737;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC18881 f42738;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f42739;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12915 f42740;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f42741;

    public C13417(Main main, int i, String str, AbstractC18881 abstractC18881, String str2, String str3, C12915 c12915, String str4, AbstractDialogInterfaceOnClickListenerC8552 abstractDialogInterfaceOnClickListenerC8552) {
        this.f42737 = main;
        this.f42739 = i;
        this.f42741 = str;
        this.f42738 = abstractC18881;
        this.f42733 = str2;
        this.f42735 = str3;
        this.f42740 = c12915;
        this.f42734 = str4;
        this.f42736 = abstractDialogInterfaceOnClickListenerC8552;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f42737, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Exception {
        String str = this.f42741;
        String str2 = this.f42735;
        String str3 = this.f42733;
        AbstractC18881 abstractC18881 = this.f42738;
        int i = this.f42739;
        if (i == 0) {
            String strM28549 = C11293.m28549(str, System.currentTimeMillis() + ".tmp");
            abstractC18881.mo35571(str3, strM28549);
            try {
                abstractC18881.mo35571(str2, str3);
                abstractC18881.mo35571(strM28549, str2);
                return;
            } catch (Exception e) {
                try {
                    abstractC18881.mo35571(strM28549, str3);
                } catch (Exception unused) {
                }
                throw e;
            }
        }
        if (i == 1) {
            String strM285410 = C11293.m28549(str, System.currentTimeMillis() + ".tmp");
            abstractC18881.mo35571(str3, strM285410);
            try {
                abstractC18881.mo35571(str2, str3);
                abstractC18881.mo35575(strM285410, false);
                return;
            } catch (Exception e2) {
                try {
                    abstractC18881.mo35571(strM285410, str3);
                } catch (Exception unused2) {
                }
                throw e2;
            }
        }
        if (i != 2) {
            return;
        }
        String strMo35577 = abstractC18881.mo35577(str3 + ".bak");
        abstractC18881.mo35571(str3, strMo35577);
        try {
            abstractC18881.mo35571(str2, str3);
        } catch (Exception e3) {
            try {
                abstractC18881.mo35571(strMo35577, str3);
            } catch (Exception unused3) {
            }
            throw e3;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        this.f42740.m31975(this.f42734);
        this.f42736.m22951();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f42737.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
        this.f42740.m31973();
        C6331.m18054(this.f42738.mo35579());
    }
}
