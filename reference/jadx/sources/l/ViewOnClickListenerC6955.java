package l;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: l.ۜۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J8GM */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC6955 implements InterfaceC10582, View.OnClickListener, InterfaceC15158 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object f22976;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5243 f22977;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1634 f22978 = new C1634();

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo7200(int i) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo7219(List list) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo7221(C0733 c0733) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo7222(C3125 c3125) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo7223(C4617 c4617) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo7224(C7445 c7445) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo7225(C8936 c8936) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo7229(C14902 c14902, int i) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo7234(C19378 c19378) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo7236(C21771 c21771) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo7238(AbstractC24755 abstractC24755, int i) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo7239(boolean z) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ void mo7245(boolean z) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ void mo7247(int i) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ void mo7252(int i, boolean z) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ void mo7257(C8936 c8936) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ void mo7261(boolean z) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ void mo7263(int i) {
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ void mo7265(boolean z) {
    }

    public ViewOnClickListenerC6955(C5243 c5243) {
        this.f22977 = c5243;
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final void mo7227(C11831 c11831) {
        C5243 c5243 = this.f22977;
        if (c5243.f18483 != null) {
            c5243.f18483.m28244(c11831.f38157);
        }
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final void mo7233(C18787 c18787) {
        if (c18787.equals(C18787.f61010)) {
            return;
        }
        C5243 c5243 = this.f22977;
        if (c5243.f18470 == null || c5243.f18470.mo23580() == 1) {
            return;
        }
        c5243.m15776();
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final void mo7201(int i, int i2) {
        if (Build.VERSION.SDK_INT == 34) {
            View unused = this.f22977.f18475;
        }
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ᩸ */
    public final void mo7262() {
        C5243 c5243 = this.f22977;
        if (c5243.f18469 != null) {
            c5243.f18469.setVisibility(4);
            if (c5243.m15765()) {
                C5243.m15764(c5243);
            } else {
                c5243.m15756();
            }
        }
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final void mo7228(C12074 c12074) {
        AbstractC24755 abstractC24755Mo23565;
        C5243 c5243 = this.f22977;
        InterfaceC19533 interfaceC19533 = c5243.f18470;
        interfaceC19533.getClass();
        if (interfaceC19533.mo21703(17)) {
            abstractC24755Mo23565 = interfaceC19533.mo23565();
        } else {
            abstractC24755Mo23565 = AbstractC24755.f80138;
        }
        if (abstractC24755Mo23565.m55264()) {
            this.f22976 = null;
        } else {
            boolean zMo21703 = interfaceC19533.mo21703(30);
            C1634 c1634 = this.f22978;
            if (zMo21703 && !interfaceC19533.mo23568().m30249()) {
                this.f22976 = abstractC24755Mo23565.mo1591(interfaceC19533.mo23562(), c1634, true).f5658;
            } else {
                Object obj = this.f22976;
                if (obj != null) {
                    int iMo1588 = abstractC24755Mo23565.mo1588(obj);
                    if (iMo1588 != -1) {
                        if (interfaceC19533.mo23566() == abstractC24755Mo23565.mo1591(iMo1588, c1634, false).f5657) {
                            return;
                        }
                    }
                    this.f22976 = null;
                }
            }
        }
        c5243.m15782(false);
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۤ */
    public final void mo7241(int i) {
        C5243 c5243 = this.f22977;
        c5243.m15772();
        C5243.m15784(c5243);
        C5243.m15773(c5243);
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final void mo7212(int i, boolean z) {
        C5243 c5243 = this.f22977;
        c5243.m15772();
        C5243.m15773(c5243);
    }

    @Override // l.InterfaceC10582
    /* JADX INFO: renamed from: ۙ */
    public final void mo7211(int i, C22517 c22517, C22517 c22518) {
        C5243 c5243 = this.f22977;
        if (c5243.m15769() && c5243.f18458) {
            c5243.m15797();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f22977.m15774();
    }

    @Override // l.InterfaceC15158
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo19256() {
        this.f22977.m15783();
    }
}
