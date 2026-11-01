package l;

import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫ۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes2.dex */
public final class C1629 implements InterfaceC19517 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f6537;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C6111 f6538;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3040 f6539;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C6111 f6540;

    public C1629(C3040 c3040, boolean z) {
        this.f6539 = c3040;
        this.f6537 = z;
        if (z) {
            this.f6540 = c3040.f11381;
            this.f6538 = c3040.f11363;
        } else {
            this.f6540 = c3040.f11363;
            this.f6538 = c3040.f11381;
        }
    }

    @Override // l.InterfaceC19517
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5518(ArrayList arrayList) {
        C6111 c6111 = this.f6540;
        c6111.m16858(arrayList);
        if (this.f6538.m17004()) {
            return;
        }
        C3040 c3040 = this.f6539;
        if (c3040.f11378 == null) {
            return;
        }
        int[] iArrM16971 = c6111.m16971();
        for (InterfaceC19759 interfaceC19759 : c3040.f11378) {
            boolean z = this.f6537;
            int iMo22127 = interfaceC19759.mo22127(z);
            int iMo22131 = interfaceC19759.mo22131(z);
            int i = iArrM16971[0];
            if (iMo22127 < iArrM16971[1] && i < iMo22131) {
                arrayList.add(new C16221(R.string.MT_Protector, c3040.f11361 ? z ? R.drawable.MT_Protector : R.drawable.MT_Protector : z ? R.drawable.MT_Protector : R.drawable.MT_Protector, new InterfaceC17295() { // from class: l.ܳۛۖ
                    @Override // l.InterfaceC17295
                    public final void accept(Object obj) {
                        C1629 c1629 = this.f46952;
                        C3040 c3041 = c1629.f6539;
                        C6111 c6112 = c1629.f6540;
                        boolean z2 = c1629.f6537;
                        C6111 c6113 = c1629.f6538;
                        if (c6113.m17004()) {
                            return;
                        }
                        int[] iArrM16972 = c6112.m16971();
                        C15070 c15070 = new C15070();
                        C15070 c15071 = new C15070();
                        for (InterfaceC19759 interfaceC197510 : c3041.f11378) {
                            int iMo22128 = interfaceC197510.mo22127(z2);
                            int iMo22132 = interfaceC197510.mo22131(z2);
                            int i2 = iArrM16972[0];
                            if (iMo22128 < iArrM16972[1] && i2 < iMo22132) {
                                boolean z3 = !z2;
                                int iMo22129 = interfaceC197510.mo22127(z3);
                                int iMo22133 = interfaceC197510.mo22131(z3);
                                if (interfaceC197510.mo23603(z2) == interfaceC197510.mo23592(z2) && iMo22132 == c6112.m17000().length() && iMo22129 > 0) {
                                    iMo22129--;
                                }
                                if (interfaceC197510.mo23603(z3) == interfaceC197510.mo23592(z3) && iMo22133 == c6113.m17000().length() && iMo22128 > 0) {
                                    iMo22128--;
                                }
                                c15070.add(iMo22128);
                                c15070.add(iMo22132);
                                c15071.add(iMo22129);
                                c15071.add(iMo22133);
                            }
                        }
                        if (c15070.isEmpty()) {
                            return;
                        }
                        c15070.mo3174((InterfaceC16481) null);
                        c15071.mo3174((InterfaceC16481) null);
                        c6113.m17000().replace(c15071.getInt(0), c15071.getInt(c15071.size() - 1), c6112.m17000().mo2396(c15070.getInt(0), c15070.getInt(c15070.size() - 1)));
                        c3041.m9057(c6112.m16916(), c6112.m17020(), z2);
                        c6113.requestFocus();
                    }
                }));
                return;
            }
        }
    }
}
