package l;

import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۡۖ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8587 extends AbstractC9293 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13609 f29693;

    /* JADX INFO: renamed from: ۙ */
    public AbstractC5930 mo1177(AbstractC5930 abstractC5930) {
        return abstractC5930;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8587(C13609 c13609, EnumC5992 enumC5992, AbstractC9293 abstractC9293) {
        super(c13609, enumC5992, abstractC9293);
        this.f29693 = c13609;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4603 m22368(C4603 c4603, C8753 c8753) {
        AbstractC9462 abstractC9462M24222 = AbstractC9462.m24222(c8753.f30086);
        for (AbstractC23903 abstractC23903 : ((C22990) c4603.f16300.f16299).f74722.mo3802((Predicate) null, EnumC10167.NON_RECURSIVE)) {
            if (abstractC23903.m52728()) {
                abstractC9462M24222.mo24224(abstractC23903);
            }
        }
        C21825 c21825 = c8753.f30088;
        if (c21825 != null) {
            while (c21825.m48595()) {
                abstractC9462M24222.mo24224(((C22179) c21825.f70876).f30190.f53222);
                c21825 = c21825.f70877;
            }
        }
        C4603 c4604 = c4603.f16300;
        C4603 c4603M12747 = c4604.m12747(c8753, ((C22990) c4604.f16299).m50854(abstractC9462M24222));
        c4603M12747.f16298 = true;
        c4603M12747.f16300 = c4604;
        ((C22990) c4603M12747.f16299).f74710 = false;
        return c4603M12747;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22369(C4603 c4603, C4603 c4604) {
        AbstractC16579 abstractC16579M18297;
        AbstractC16579 c17758;
        AbstractC5930 abstractC5930;
        C8753 c8753 = c4603.f16301;
        C22492 c22492 = c8753.f30086;
        C0309 c0309 = (C0309) c22492.f77449;
        AbstractC5930 abstractC5931 = c8753.f30092;
        C19003 c19003 = null;
        C13609 c13609 = this.f29693;
        if (abstractC5931 != null) {
            AbstractC5930 abstractC5930Mo1177 = mo1177(abstractC5931);
            c17758 = c13609.f44907.m18297(abstractC5930Mo1177, c4604, true, false, true);
            if (c17758 == c13609.f44893.f14270) {
                C20414 c20414 = c13609.f44894;
                AbstractC0618 abstractC0618 = c17758.f53222;
                C5909 c5909 = C23879.f77204;
                c20414.m48199(c8753, new C5909("compiler", "invalid.supertype.record", abstractC0618));
            }
            abstractC5930 = abstractC5930Mo1177;
        } else {
            if ((c8753.f30089.f70567 & 16384) != 0) {
                C6761 c6761 = c13609.f44907;
                int i = c8753.f30189;
                C5286 c5286 = c13609.f44896;
                c5286.f18294 = i;
                abstractC16579M18297 = c6761.m18297((AbstractC5930) c5286.m14651(c13609.f44896.m14641(c13609.f44893.f14289), C21825.of((Object) c13609.f44896.m14634(c22492.f77449))), c4604, true, false, false);
            } else if (c22492.f73419 == c13609.f44901.f77535) {
                abstractC16579M18297 = AbstractC16579.f53219;
            } else {
                abstractC16579M18297 = c22492.m50010() ? c13609.f44893.f14270 : c13609.f44893.f14275;
            }
            c17758 = abstractC16579M18297;
            abstractC5930 = null;
        }
        if (c17758.m39001(EnumC6617.ERROR)) {
            c17758 = new C17758(this, c17758.mo16234(), c17758.f53222, c4604, false, abstractC5930);
        }
        c0309.f1654 = c17758;
        C19003 c19004 = new C19003();
        Iterator it = c8753.f30087.iterator();
        while (it.hasNext()) {
            AbstractC5930 abstractC5930Mo1178 = mo1177((AbstractC5930) it.next());
            AbstractC16579 abstractC16579M18298 = c13609.f44907.m18297(abstractC5930Mo1178, c4604, false, true, true);
            if (!abstractC16579M18298.m39001(EnumC6617.CLASS)) {
                if (c19003 == null) {
                    c19003 = new C19003();
                    c19003.m43724(c19004);
                }
                if (abstractC16579M18298.m39001(EnumC6617.ERROR)) {
                    abstractC16579M18298 = new C17758(this, abstractC16579M18298.mo16234(), abstractC16579M18298.f53222, c4604, true, abstractC5930Mo1178);
                }
                c19003.m43723(abstractC16579M18298);
            } else {
                c19004.m43723(abstractC16579M18298);
                if (c19003 != null) {
                    c19003.m43723(abstractC16579M18298);
                }
            }
        }
        C19003 c19005 = new C19003();
        Iterator it2 = c8753.f30091.iterator();
        while (it2.hasNext()) {
            c19005.m43723(c13609.f44907.m18297((AbstractC5930) it2.next(), c4604, false, false, false).f53222);
        }
        if ((c22492.f77447 & 8192) != 0) {
            C21825 c21825Of = C21825.of((Object) c13609.f44893.f14266);
            c0309.f1658 = c21825Of;
            c0309.f1657 = c21825Of;
        } else {
            C21825 c21825M43726 = c19004.m43726();
            c0309.f1658 = c21825M43726;
            if (c19003 != null) {
                c21825M43726 = c19003.m43726();
            }
            c0309.f1657 = c21825M43726;
        }
        if (!c19005.isEmpty()) {
            c22492.f73421 = c19005.m43726();
        }
        c22492.f73416 = true ^ c19005.isEmpty();
    }
}
