package l;

import android.net.Uri;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.᩺᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: L8S9 */
/* JADX INFO: loaded from: classes.dex */
public final class C24569 implements InterfaceC0636, InterfaceC24066 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7467 f79625;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12789 f79627;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16363 f79628;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C0645 f79630;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Uri f79631;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f79632;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18601 f79633;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public volatile boolean f79634;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC22024 f79636;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f79637;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18756 f79624 = new C18756();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f79626 = true;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f79629 = C14368.m34811();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C25368 f79635 = m54872(0);

    public C24569(C18601 c18601, Uri uri, InterfaceC13433 interfaceC13433, C8650 c8650, InterfaceC12789 interfaceC12789, C0645 c0645) {
        this.f79633 = c18601;
        this.f79631 = uri;
        this.f79625 = new C7467(interfaceC13433);
        this.f79628 = c8650;
        this.f79627 = interfaceC12789;
        this.f79630 = c0645;
    }

    @Override // l.InterfaceC0636
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2803() {
        this.f79634 = true;
    }

    @Override // l.InterfaceC0636
    /* JADX INFO: renamed from: ۙ */
    public final void mo2802() {
        int iM23290 = 0;
        while (iM23290 == 0 && !this.f79634) {
            try {
                long j = this.f79624.f60914;
                C25368 c25368M54872 = m54872(j);
                this.f79635 = c25368M54872;
                long jMo8326 = this.f79625.mo8326(c25368M54872);
                if (!this.f79634) {
                    if (jMo8326 != -1) {
                        jMo8326 += j;
                        C18601.m43194(this.f79633);
                    }
                    long j2 = jMo8326;
                    this.f79633.f60424 = C3773.m12244(this.f79625.mo10893());
                    InterfaceC13433 c3928 = this.f79625;
                    if (this.f79633.f60424 != null && this.f79633.f60424.f12947 != -1) {
                        c3928 = new C3928(this.f79625, this.f79633.f60424.f12947, this);
                        InterfaceC22024 interfaceC22024M43211 = this.f79633.m43211();
                        this.f79636 = interfaceC22024M43211;
                        interfaceC22024M43211.mo14384(C18601.f60402);
                    }
                    InterfaceC13433 interfaceC13433 = c3928;
                    long jM23295 = j;
                    ((C8650) this.f79628).m23293(interfaceC13433, this.f79631, this.f79625.mo10893(), j, j2, this.f79627);
                    if (this.f79633.f60424 != null) {
                        ((C8650) this.f79628).m23291();
                    }
                    if (this.f79626) {
                        ((C8650) this.f79628).m23292(jM23295, this.f79637);
                        this.f79626 = false;
                    }
                    while (true) {
                        long j3 = jM23295;
                        while (true) {
                            if (iM23290 != 0 || this.f79634) {
                                break;
                            }
                            try {
                                this.f79630.m2830();
                                iM23290 = ((C8650) this.f79628).m23290(this.f79624);
                                jM23295 = ((C8650) this.f79628).m23295();
                                if (jM23295 > this.f79633.f60431 + j3) {
                                    this.f79630.m2832();
                                    this.f79633.f60416.post(this.f79633.f60430);
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                    }
                    if (iM23290 == 1) {
                        iM23290 = 0;
                    } else if (((C8650) this.f79628).m23295() != -1) {
                        this.f79624.f60914 = ((C8650) this.f79628).m23295();
                    }
                    C18856.m43745(this.f79625);
                } else {
                    if (iM23290 != 1 && ((C8650) this.f79628).m23295() != -1) {
                        this.f79624.f60914 = ((C8650) this.f79628).m23295();
                    }
                    C18856.m43745(this.f79625);
                    return;
                }
            } catch (Throwable th) {
                if (iM23290 != 1 && ((C8650) this.f79628).m23295() != -1) {
                    this.f79624.f60914 = ((C8650) this.f79628).m23295();
                }
                C18856.m43745(this.f79625);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54877(C21287 c21287) {
        long jMax;
        if (!this.f79632) {
            jMax = this.f79637;
        } else {
            jMax = Math.max(this.f79633.m43185(true), this.f79637);
        }
        int iM48486 = c21287.m48486();
        InterfaceC22024 interfaceC22024 = this.f79636;
        interfaceC22024.getClass();
        interfaceC22024.mo14381(iM48486, c21287);
        interfaceC22024.mo14383(jMax, 1, iM48486, 0, null);
        this.f79632 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C25368 m54872(long j) {
        C11941 c11941 = new C11941();
        c11941.m29911(this.f79631);
        c11941.m29917(j);
        int i = C18601.f60400;
        c11941.m29912((String) null);
        c11941.m29909(6);
        c11941.m29913(C18601.f60401);
        return c11941.m29908();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54873(C24569 c24569, long j, long j2) {
        c24569.f79624.f60914 = j;
        c24569.f79637 = j2;
        c24569.f79626 = true;
        c24569.f79632 = false;
    }
}
