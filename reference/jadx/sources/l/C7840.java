package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.۟ۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6G6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7840 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C9725 m21363(C15266 c15266, AbstractC8585 abstractC8585, String str, Bundle bundle) {
        C10471 c10471;
        C15243.m36590(c15266, "registry");
        C15243.m36590(abstractC8585, "lifecycle");
        Bundle bundleM36619 = c15266.m36619(str);
        if (bundleM36619 != null) {
            bundle = bundleM36619;
        }
        if (bundle == null) {
            c10471 = new C10471();
        } else {
            ClassLoader classLoader = C10471.class.getClassLoader();
            C15243.m36586(classLoader);
            bundle.setClassLoader(classLoader);
            C14782 c14782 = new C14782(bundle.size());
            for (String str2 : bundle.keySet()) {
                C15243.m36586((Object) str2);
                c14782.put(str2, bundle.get(str2));
            }
            c10471 = new C10471(c14782.m35603());
        }
        C9725 c9725 = new C9725(str, c10471);
        c9725.m25316(abstractC8585, c15266);
        m21364(abstractC8585, c15266);
        return c9725;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m21365(AbstractC13213 abstractC13213, C15266 c15266, AbstractC8585 abstractC8585) {
        C15243.m36590(c15266, "registry");
        C15243.m36590(abstractC8585, "lifecycle");
        C9725 c9725 = (C9725) abstractC13213.m32724();
        if (c9725 == null || c9725.m25317()) {
            return;
        }
        c9725.m25316(abstractC8585, c15266);
        m21364(abstractC8585, c15266);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21364(AbstractC8585 abstractC8585, C15266 c15266) {
        EnumC2619 enumC2619Mo23076 = abstractC8585.mo23076();
        if (enumC2619Mo23076 == EnumC2619.INITIALIZED || enumC2619Mo23076.m8762(EnumC2619.STARTED)) {
            c15266.m36622();
        } else {
            abstractC8585.mo23077(new C0382(abstractC8585, c15266));
        }
    }
}
