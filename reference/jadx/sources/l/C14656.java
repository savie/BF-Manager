package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 75V0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14656 extends C0647 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC4777 f47916;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1954 f47917;

    public C14656(C1954 c1954) {
        this.f47917 = c1954;
    }

    @Override // l.C0647
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC4777 mo2941(AbstractC4777 abstractC4777) {
        C1954 c1954 = this.f47917;
        C3365[] c3365Arr = c1954.f7355;
        this.f47916 = abstractC4777;
        EnumC19699 enumC19699 = abstractC4777.f16801;
        EnumC19699 enumC196910 = EnumC19699.E2;
        C3365 c3365 = C4652.f16444;
        if (enumC19699 == enumC196910) {
            EnumC9947 enumC9947 = abstractC4777.mo13244().f23823;
            EnumC9947 enumC9948 = EnumC9947.LOCAL;
            if (enumC9947 == enumC9948) {
                C2184 c2184 = (C2184) abstractC4777.mo13244();
                if (abstractC4777.mo13245().f23823 == enumC9948) {
                    c3365Arr[c2184.f7921] = c3365Arr[((C2184) abstractC4777.mo13245()).f7921];
                    return abstractC4777;
                }
                if (abstractC4777.mo13245().f23823 == EnumC9947.NEW) {
                    c3365Arr[c2184.f7921] = new C3365((C9717) c1954.f7352.get(c2184), false);
                    return abstractC4777;
                }
                mo2942(abstractC4777.mo13245());
                c3365Arr[c2184.f7921] = c3365;
                return abstractC4777;
            }
        }
        if (abstractC4777.f16795 == EnumC2890.LABEL) {
            ArrayList arrayList = ((C17002) abstractC4777).f54351;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c3365Arr[((C2184) ((C15592) it.next()).f31402).f7921] = c3365;
                }
            }
            return abstractC4777;
        }
        super.mo2941(abstractC4777);
        return abstractC4777;
    }

    @Override // l.C0647
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7124 mo2942(AbstractC7124 abstractC7124) {
        C3365 c3365;
        C9717 c9717;
        C1954 c1954 = this.f47917;
        C3365[] c3365Arr = c1954.f7355;
        EnumC9947 enumC9947 = abstractC7124.f23823;
        EnumC9947 enumC9948 = EnumC9947.INVOKE_SPECIAL;
        C3365 c3366 = C4652.f16444;
        if (enumC9947 == enumC9948 && abstractC7124.mo19023().length >= 1 && "<init>".equals(((C13475) abstractC7124).f44541.m9295())) {
            AbstractC7124 abstractC7125 = abstractC7124.mo19023()[0];
            if (abstractC7125.f23823 == EnumC9947.LOCAL && (c9717 = (c3365 = c3365Arr[((C2184) abstractC7125).f7921]).f12477) != null) {
                if (c9717.f32712 != null) {
                    c9717.f32713 = true;
                } else {
                    c3365.f12476 = true;
                    c9717.f32712 = this.f47916;
                    for (int i = 0; i < c3365Arr.length; i++) {
                        C3365 c3367 = c3365Arr[i];
                        if (c3367 != null && c3367.f12477 == c9717) {
                            c3365Arr[i] = c3366;
                        }
                    }
                    c1954.f7353 = true;
                }
            }
        }
        super.mo2942(abstractC7124);
        if (abstractC7124.f23823 == EnumC9947.LOCAL) {
            int i2 = ((C2184) abstractC7124).f7921;
            C3365 c3368 = c3365Arr[i2];
            if (!c3368.f12476) {
                C9717 c9718 = c3368.f12477;
                if (c9718 != null) {
                    c9718.f32713 = true;
                }
                c3365Arr[i2] = c3366;
            }
        }
        return abstractC7124;
    }
}
