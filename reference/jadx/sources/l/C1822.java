package l;

import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫ۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes3.dex */
public final class C1822 implements InterfaceC5486 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24943 f6179;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C24132 f6180;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f6181;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C24132 f6182;

    public C1822(C24943 c24943, boolean z) {
        this.f6179 = c24943;
        this.f6181 = z;
        if (z) {
            this.f6182 = c24943.f80725;
            this.f6180 = c24943.f80733;
        } else {
            this.f6182 = c24943.f80733;
            this.f6180 = c24943.f80725;
        }
    }

    @Override // l.InterfaceC5486
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6299(ArrayList arrayList) {
        C24132 c24132 = this.f6182;
        c24132.mo52301(arrayList);
        if (this.f6180.m54083()) {
            return;
        }
        C24943 c24943 = this.f6179;
        if (c24943.f80732 == null) {
            return;
        }
        int[] iArrM53971 = c24132.m53971();
        for (InterfaceC8966 interfaceC8966 : c24943.f80732) {
            boolean z = this.f6181;
            int iMo9797 = interfaceC8966.mo9797(z);
            int iMo9799 = interfaceC8966.mo9799(z);
            int i = iArrM53971[0];
            if (iMo9797 < iArrM53971[1] && i < iMo9799) {
                arrayList.add(new C17372(R.string.MT_Protector, c24943.f80748 ? z ? R.drawable.MT_Protector : R.drawable.MT_Protector : z ? R.drawable.MT_Protector : R.drawable.MT_Protector, new InterfaceC0818() { // from class: l.ۚۡ᩸
                    @Override // l.InterfaceC0818
                    public final void accept(Object obj) {
                        C1822 c1822 = this.f19284;
                        C24943 c24944 = c1822.f6179;
                        C24132 c24133 = c1822.f6182;
                        boolean z2 = c1822.f6181;
                        C24132 c24134 = c1822.f6180;
                        if (c24134.m54083()) {
                            return;
                        }
                        int[] iArrM53972 = c24133.m53971();
                        C14763 c14763 = new C14763();
                        C14763 c14764 = new C14763();
                        for (InterfaceC8966 interfaceC8967 : c24944.f80732) {
                            int iMo9798 = interfaceC8967.mo9797(z2);
                            int iMo97910 = interfaceC8967.mo9799(z2);
                            int i2 = iArrM53972[0];
                            if (iMo9798 < iArrM53972[1] && i2 < iMo97910) {
                                boolean z3 = !z2;
                                int iMo97911 = interfaceC8967.mo9797(z3);
                                int iMo97912 = interfaceC8967.mo9799(z3);
                                if (interfaceC8967.mo20529(z2) == interfaceC8967.mo20530(z2) && iMo97910 == c24133.m54021().length() && iMo97911 > 0) {
                                    iMo97911--;
                                }
                                if (interfaceC8967.mo20529(z3) == interfaceC8967.mo20530(z3) && iMo97912 == c24134.m54021().length() && iMo9798 > 0) {
                                    iMo9798--;
                                }
                                c14763.add(iMo9798);
                                c14763.add(iMo97910);
                                c14764.add(iMo97911);
                                c14764.add(iMo97912);
                            }
                        }
                        if (c14763.isEmpty()) {
                            return;
                        }
                        c14763.mo14694((InterfaceC4544) null);
                        c14764.mo14694((InterfaceC4544) null);
                        c24134.m54021().replace(c14764.getInt(0), c14764.getInt(c14764.size() - 1), c24133.m54021().mo15351(c14763.getInt(0), c14763.getInt(c14763.size() - 1)));
                        c24944.m55630(c24133.m53968(), c24133.m53882(), z2);
                        c24134.requestFocus();
                    }
                }));
                return;
            }
        }
    }
}
