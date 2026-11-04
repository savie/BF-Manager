package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶ᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ABG3 */
/* JADX INFO: loaded from: classes.dex */
public final class C21493 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24960 f68707;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48898(C24960 c24960) {
        c24960.m55733(new C14779(new C21493(c24960), C2847.m9353()));
    }

    public C21493(C24960 c24960) {
        this.f68707 = c24960;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m48899(C21493 c21493, C1356 c1356) {
        C24960 c24960 = c21493.f68707;
        C18708 c18708M40434 = c1356.mo4993().m40434();
        C20946 c20946M16508 = c1356.m16508();
        if (c20946M16508 != null && !c24960.m55736(c20946M16508) && c18708M40434.m43509() != 5) {
            InterfaceC22239 interfaceC22239M47898 = c1356.m16508().m47898();
            if (interfaceC22239M47898.mo8409() && interfaceC22239M47898.mo8408() == 6) {
                C0063 c0063 = C0063.f947;
                c21493.m48896(c1356, c0063, 5, (AbstractC13487) interfaceC22239M47898);
                if (c18708M40434.m43509() == 56) {
                    c21493.m48896((C1356) j$$ExternalSyntheticOutline0.m(((C19738) c24960.m55749().get(c1356.m16506().m45465().nextSetBit(0))).m45460(), 1), c0063, 6, (AbstractC13487) null);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m48896(C1356 c1356, C0063 c0063, int i, AbstractC13487 abstractC13487) {
        AbstractC17216 c6030;
        AbstractC17216 abstractC17216Mo4993 = c1356.mo4993();
        C18708 c18708M3250 = C0809.m3250(i, c1356.m16508(), c0063, abstractC13487);
        if (abstractC13487 == null) {
            c6030 = new C23930(c18708M3250, abstractC17216Mo4993.m40433(), c1356.m16508(), c0063);
        } else {
            c6030 = new C6030(c18708M3250, abstractC17216Mo4993.m40433(), c1356.m16508(), c0063, abstractC13487);
        }
        C1356 c1357 = new C1356(c6030, c1356.m16506());
        ArrayList arrayListM45460 = c1356.m16506().m45460();
        C24960 c24960 = this.f68707;
        c24960.m55730(c1356);
        arrayListM45460.set(arrayListM45460.lastIndexOf(c1356), c1357);
        c24960.m55729(c1357, (C0063) null);
        c24960.m55731(c1357, (C20946) null);
    }
}
