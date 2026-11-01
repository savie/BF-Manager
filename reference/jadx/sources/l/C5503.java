package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۚܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: A4XC */
/* JADX INFO: loaded from: classes3.dex */
public final class C5503 implements InterfaceC8306 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f18903;

    public C5503(HashMap map) {
        this.f18903 = map;
    }

    @Override // l.InterfaceC8306
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15198(AbstractC4777 abstractC4777) {
        C1269 c1269;
        int iIntValue;
        EnumC2890 enumC2890 = abstractC4777.f16795;
        EnumC2890 enumC2891 = EnumC2890.ASSIGN;
        HashMap map = this.f18903;
        if (enumC2890 == enumC2891) {
            if (abstractC4777.mo13245().f23823 == EnumC9947.NEW_ARRAY && abstractC4777.mo13244().f23823 == EnumC9947.LOCAL) {
                C14886 c14886 = (C14886) abstractC4777.mo13245();
                AbstractC7124 abstractC7124 = c14886.f25764;
                if (abstractC7124.f23823 != EnumC9947.CONSTANT || (iIntValue = ((Number) ((C14760) abstractC7124).f48276).intValue()) < 0) {
                    return;
                }
                C2184 c2184 = (C2184) abstractC4777.mo13244();
                String str = c14886.f48643;
                C1269 c12610 = new C1269();
                c12610.f5498 = new ArrayList();
                c12610.f5496 = new ArrayList();
                c12610.f5497 = iIntValue;
                c12610.f5494 = str;
                c12610.f5495 = (C15592) abstractC4777;
                map.put(c2184, c12610);
                return;
            }
            if (abstractC4777.mo13244().f23823 == EnumC9947.ARRAY) {
                C6292 c6292 = (C6292) abstractC4777.mo13244();
                AbstractC7124 abstractC7125 = c6292.f61770;
                if (abstractC7125.f23823 == EnumC9947.LOCAL) {
                    C2184 c2185 = (C2184) abstractC7125;
                    C1269 c12611 = (C1269) map.get(c2185);
                    if (c12611 != null) {
                        if (c6292.f61771.f23823 == EnumC9947.CONSTANT) {
                            c12611.f5498.add(abstractC4777);
                            return;
                        } else {
                            map.remove(c2185);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (enumC2890 == EnumC2890.FILL_ARRAY_DATA && abstractC4777.mo13244().f23823 == EnumC9947.LOCAL && (c1269 = (C1269) map.get((C2184) abstractC4777.mo13244())) != null) {
            c1269.f5498.add(abstractC4777);
        }
    }
}
