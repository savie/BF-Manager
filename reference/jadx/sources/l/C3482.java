package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۗ᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public final class C3482 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public WeakHashMap f12778 = new WeakHashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23800 f12779;

    public C3482(C23800 c23800) {
        this.f12779 = c23800;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18258 m10215(C18258 c18258, AbstractC0618 abstractC0618, boolean z, Predicate predicate) {
        WeakHashMap weakHashMap = this.f12778;
        SoftReference softReference = (SoftReference) weakHashMap.get(c18258);
        C18258 c18259 = null;
        Map map = softReference != null ? (Map) softReference.get() : null;
        if (map == null) {
            map = new HashMap();
            weakHashMap.put(c18258, new SoftReference(map));
        }
        C9834 c9834 = (C9834) map.get(abstractC0618);
        AbstractC16579 abstractC16579 = abstractC0618.f77449;
        C23800 c23800 = this.f12779;
        C5227 c5227M52366 = c23800.m52366(abstractC16579, true);
        if (c9834 != null) {
            int iMo14412 = c5227M52366.mo14412();
            if (c9834.f33607 == predicate && c9834.f33608 == z && c9834.f33605 == iMo14412) {
                return c9834.f33606;
            }
        }
        AbstractC16579 abstractC16579M52432 = abstractC0618.f77449;
        while (true) {
            if (!abstractC16579M52432.m39001(EnumC6617.CLASS) && !abstractC16579M52432.m39001(EnumC6617.TYPEVAR)) {
                break;
            }
            AbstractC16579 abstractC16579M52422 = c23800.m52422(abstractC16579M52432, false);
            AbstractC9462 abstractC9462Mo20272 = abstractC16579M52422.f53222.mo20272();
            AbstractC11242 abstractC11242 = c18258.f77453;
            abstractC9462Mo20272.getClass();
            AbstractC23903 abstractC23903 = null;
            for (AbstractC23903 abstractC23904 : abstractC9462Mo20272.mo3803(abstractC11242, predicate, EnumC10167.RECURSIVE)) {
                if (abstractC23904 != null && abstractC23904.mo42453(c18258, abstractC0618, c23800, z)) {
                    if ((abstractC23904.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0) {
                        abstractC23903 = abstractC23904;
                        break;
                    }
                    abstractC23903 = abstractC23904;
                }
            }
            if (abstractC23903 == null) {
                abstractC16579M52432 = c23800.m52432(abstractC16579M52422);
            } else {
                c18259 = (C18258) abstractC23903;
                break;
            }
        }
        map.put(abstractC0618, new C9834(c18259, predicate, z, c5227M52366.mo14412()));
        return c18259;
    }
}
