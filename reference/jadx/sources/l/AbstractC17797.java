package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܽ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7LX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17797 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C13477 f58410 = new C13477();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15056 f58411;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15252 f58412;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C24705 f58413;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14764 f58414;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f58415;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15714 f58416;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22010 f58417;

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC17294 mo7377(C6435 c6435);

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC17294 mo7378(C12400 c12400);

    public AbstractC17797(C4747 c4747) {
        c4747.m14646(f58410, this);
        this.f58411 = C15056.m36212(c4747);
        this.f58414 = C14764.m35506(c4747);
        this.f58413 = C24705.m55066(c4747);
        this.f58412 = C15252.m36599(c4747);
        this.f58416 = C15714.m37502(c4747);
        this.f58417 = C22010.m49750(c4747);
        this.f58415 = new HashMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14769 m41652(AbstractC8036 abstractC8036) {
        return m41653(abstractC8036, C14769.m35543());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14769 m41653(AbstractC8036 abstractC8036, C14769 c14769) {
        AbstractC8036 abstractC8036M28345 = C11239.m28345(abstractC8036);
        if (abstractC8036M28345.m21911(EnumC21461.f68466) && abstractC8036M28345.f26659.mo39105() == null) {
            C6435 c6435 = (C6435) abstractC8036M28345;
            C7395 c7395 = c6435.f62402;
            if (c7395.f38066 == EnumC13603.f43218 && c7395.f24375 == 256) {
                C14769 c14769M35549 = m41653(c6435.f21672, c14769).m35549(c14769);
                C14769 c14769M41653 = m41653(c6435.f21671, c14769);
                c14769M35549.getClass();
                return c14769M41653.m35549(c14769M35549);
            }
        }
        return c14769.m35546(abstractC8036M28345);
    }
}
