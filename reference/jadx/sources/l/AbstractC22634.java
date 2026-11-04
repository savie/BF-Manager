package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88A4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22634 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f73522 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19650 f73523;

    /* JADX INFO: renamed from: ۙ */
    public abstract C5480 mo27268(Long l2);

    public AbstractC22634(C19650 c19650) {
        this.f73523 = c19650;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList m51011() {
        return this.f73522;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51010() {
        C12191 c12191M37952;
        C20396[] c20396ArrM17855;
        C0409 c0409 = new C0409();
        while (true) {
            C11445 c11445M34852 = this.f73523.m34852(mo27268(c0409.getValue()), EnumC21888.ERROR_MORE_DATA, EnumC21888.ERROR_SUCCESS);
            AbstractC15920 abstractC15920M55396 = c11445M34852.m55396();
            if (abstractC15920M55396 != null && (c12191M37952 = abstractC15920M55396.m37952()) != null && (c20396ArrM17855 = c12191M37952.m17855()) != null) {
                for (C20396 c20396 : c20396ArrM17855) {
                    C3242 c3242 = (C3242) c20396;
                    C15174 c15174 = null;
                    if (c3242 != null) {
                        C24126 c24126M46797 = c3242.m46797();
                        String strM12845 = c24126M46797 == null ? null : c24126M46797.m12845();
                        int iM10599 = c3242.m10599();
                        C24126 c24126M10600 = c3242.m10600();
                        c15174 = new C15174(strM12845, iM10599, c24126M10600 != null ? c24126M10600.m12845() : null);
                    }
                    this.f73522.add(c15174);
                }
            }
            if (EnumC21888.ERROR_SUCCESS.m49583(c11445M34852.m33542())) {
                return;
            }
            Long lM55397 = c11445M34852.m55397();
            if (lM55397 == null) {
                throw new C9469("NetrShareEnum resume handle null.");
            }
            if (lM55397.longValue() == c0409.getValue().longValue()) {
                throw new C9469("NetrShareEnum resume handle not updated.");
            }
            c0409.m2215(lM55397);
        }
    }
}
