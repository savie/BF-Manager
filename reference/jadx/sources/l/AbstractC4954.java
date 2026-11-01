package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۙ᩺۟, reason: contains not printable characters */
/* JADX INFO: compiled from: G7LX */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4954 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C16576 f17294 = new C16576();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C23800 f17295;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C20145 f17296;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17094 f17297;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f17298;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C23942 f17299;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5286 f17300;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3836 f17301;

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC2982 mo9194(C6635 c6635);

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC2982 mo9195(C22864 c22864);

    public AbstractC4954(C12343 c12343) {
        c12343.m30659(f17294, this);
        this.f17297 = C17094.m39878(c12343);
        this.f17301 = C3836.m11131(c12343);
        this.f17295 = C23800.m52336(c12343);
        this.f17299 = C23942.m52776(c12343);
        this.f17300 = C5286.m14576(c12343);
        this.f17296 = C20145.m45505(c12343);
        this.f17298 = new HashMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21825 m13739(AbstractC8774 abstractC8774) {
        return m13740(abstractC8774, C21825.m48588());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21825 m13740(AbstractC8774 abstractC8774, C21825 c21825) {
        AbstractC8774 abstractC8774M9467 = C3128.m9467(abstractC8774);
        if (abstractC8774M9467.m22847(EnumC18651.f60558) && abstractC8774M9467.f30190.mo24292() == null) {
            C22864 c22864 = (C22864) abstractC8774M9467;
            C10498 c10498 = c22864.f35957;
            if (c10498.f77452 == EnumC10477.f35879 && c10498.f35962 == 256) {
                C21825 c21825M48594 = m13740(c22864.f74367, c21825).m48594(c21825);
                C21825 c21825M13740 = m13740(c22864.f74368, c21825);
                c21825M48594.getClass();
                return c21825M13740.m48594(c21825M48594);
            }
        }
        return c21825.m48591(abstractC8774M9467);
    }
}
