package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܶۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final class C16015 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public WeakHashMap f51964 = new WeakHashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24705 f51965;

    public C16015(C24705 c24705) {
        this.f51965 = c24705;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10377 m38147(C10377 c10377, AbstractC22970 abstractC22970, boolean z, Predicate predicate) {
        WeakHashMap weakHashMap = this.f51964;
        SoftReference softReference = (SoftReference) weakHashMap.get(c10377);
        C10377 c10378 = null;
        Map map = softReference != null ? (Map) softReference.get() : null;
        if (map == null) {
            map = new HashMap();
            weakHashMap.put(c10377, new SoftReference(map));
        }
        C17507 c17507 = (C17507) map.get(abstractC22970);
        AbstractC22664 abstractC22664 = abstractC22970.f38067;
        C24705 c24705 = this.f51965;
        C24352 c24352M55106 = c24705.m55106(abstractC22664, true);
        if (c17507 != null) {
            int iMo46991 = c24352M55106.mo46991();
            if (c17507.f56920 == predicate && c17507.f56921 == z && c17507.f56922 == iMo46991) {
                return c17507.f56919;
            }
        }
        AbstractC22664 abstractC22664M55137 = abstractC22970.f38067;
        while (true) {
            if (!abstractC22664M55137.m51067(EnumC21172.CLASS) && !abstractC22664M55137.m51067(EnumC21172.TYPEVAR)) {
                break;
            }
            AbstractC22664 abstractC22664M55161 = c24705.m55161(abstractC22664M55137, false);
            AbstractC17836 abstractC17836Mo29571 = abstractC22664M55161.f73596.mo29571();
            AbstractC19728 abstractC19728 = c10377.f38072;
            abstractC17836Mo29571.getClass();
            AbstractC11781 abstractC11781 = null;
            for (AbstractC11781 abstractC11782 : abstractC17836Mo29571.mo7473(abstractC19728, predicate, EnumC13908.RECURSIVE)) {
                if (abstractC11782 != null && abstractC11782.mo26689(c10377, abstractC22970, c24705, z)) {
                    if ((abstractC11782.mo29591() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0) {
                        abstractC11781 = abstractC11782;
                        break;
                    }
                    abstractC11781 = abstractC11782;
                }
            }
            if (abstractC11781 == null) {
                abstractC22664M55137 = c24705.m55137(abstractC22664M55161);
            } else {
                c10378 = (C10377) abstractC11781;
                break;
            }
        }
        map.put(abstractC22970, new C17507(c10378, predicate, z, c24352M55106.mo46991()));
        return c10378;
    }
}
