package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75V0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16160 extends C15634 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC12563 f52464;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23620 f52465;

    public C16160(C23620 c23620) {
        this.f52465 = c23620;
    }

    @Override // l.C15634
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC12563 mo37387(AbstractC12563 abstractC12563) {
        C23620 c23620 = this.f52465;
        C20636[] c20636Arr = c23620.f76656;
        this.f52464 = abstractC12563;
        EnumC7080 enumC7080 = abstractC12563.f40352;
        EnumC7080 enumC7081 = EnumC7080.E2;
        C20636 c20636 = C12431.f39969;
        if (enumC7080 == enumC7081) {
            EnumC22260 enumC22260 = abstractC12563.mo11730().f34921;
            EnumC22260 enumC22261 = EnumC22260.LOCAL;
            if (enumC22260 == enumC22261) {
                C4448 c4448 = (C4448) abstractC12563.mo11730();
                if (abstractC12563.mo11728().f34921 == enumC22261) {
                    c20636Arr[c4448.f15916] = c20636Arr[((C4448) abstractC12563.mo11728()).f15916];
                    return abstractC12563;
                }
                if (abstractC12563.mo11728().f34921 == EnumC22260.NEW) {
                    c20636Arr[c4448.f15916] = new C20636((C3482) c23620.f76659.get(c4448), false);
                    return abstractC12563;
                }
                mo37386(abstractC12563.mo11728());
                c20636Arr[c4448.f15916] = c20636;
                return abstractC12563;
            }
        }
        if (abstractC12563.f40344 == EnumC20768.LABEL) {
            ArrayList arrayList = ((C11817) abstractC12563).f38143;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c20636Arr[((C4448) ((C20022) it.next()).f12388).f15916] = c20636;
                }
            }
            return abstractC12563;
        }
        super.mo37387(abstractC12563);
        return abstractC12563;
    }

    @Override // l.C15634
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11071 mo37386(AbstractC11071 abstractC11071) {
        C20636 c20636;
        C3482 c3482;
        C23620 c23620 = this.f52465;
        C20636[] c20636Arr = c23620.f76656;
        EnumC22260 enumC22260 = abstractC11071.f34921;
        EnumC22260 enumC22261 = EnumC22260.INVOKE_SPECIAL;
        C20636 c20637 = C12431.f39969;
        if (enumC22260 == enumC22261 && abstractC11071.mo15448().length >= 1 && "<init>".equals(((C6686) abstractC11071).f22277.m10374())) {
            AbstractC11071 abstractC11072 = abstractC11071.mo15448()[0];
            if (abstractC11072.f34921 == EnumC22260.LOCAL && (c3482 = (c20636 = c20636Arr[((C4448) abstractC11072).f15916]).f66188) != null) {
                if (c3482.f12032 != null) {
                    c3482.f12033 = true;
                } else {
                    c20636.f66187 = true;
                    c3482.f12032 = this.f52464;
                    for (int i = 0; i < c20636Arr.length; i++) {
                        C20636 c20638 = c20636Arr[i];
                        if (c20638 != null && c20638.f66188 == c3482) {
                            c20636Arr[i] = c20637;
                        }
                    }
                    c23620.f76655 = true;
                }
            }
        }
        super.mo37386(abstractC11071);
        if (abstractC11071.f34921 == EnumC22260.LOCAL) {
            int i2 = ((C4448) abstractC11071).f15916;
            C20636 c20639 = c20636Arr[i2];
            if (!c20639.f66187) {
                C3482 c3483 = c20639.f66188;
                if (c3483 != null) {
                    c3483.f12033 = true;
                }
                c20636Arr[i2] = c20637;
            }
        }
        return abstractC11071;
    }
}
