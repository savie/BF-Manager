package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿۤ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18265 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f59599;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10060 f59600;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f59601;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C10745 f59602;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f59603;

    public C18265(C10060 c10060, int[] iArr, Runnable runnable) {
        this.f59600 = c10060;
        this.f59601 = iArr;
        this.f59599 = runnable;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C10745 c10745 = new C10745(this.f59600.f32256);
        c10745.m27397(R.string.MT_Protector);
        c10745.mo25916((Runnable) null);
        c10745.mo25931();
        this.f59602 = c10745;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C10060 c10060;
        int[] iArr = this.f59601;
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i = 0;
        while (true) {
            c10060 = this.f59600;
            if (i >= length) {
                break;
            }
            arrayList.add((InterfaceC16199) c10060.f32258[iArr[i]].f61576.get());
            i++;
        }
        AbstractC7629 abstractC7629Mo10174 = c10060.f32253.m23213().mo10174();
        C25151 c25151 = new C25151(arrayList);
        try {
            abstractC7629Mo10174.mo20836(null, c10060.f32254, new C21249(this, c25151));
            c25151.close();
            if (this.f59603 || this.f59602.m27399()) {
                return;
            }
            this.f59602.m27403(100);
            c10060.f32252.m2139(arrayList, iArr);
        } catch (Throwable th) {
            try {
                c25151.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f59603 || this.f59602.m27399()) {
            return;
        }
        this.f59599.run();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f59600.f32256.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f59602.m27405();
        C22673.m51157();
    }
}
