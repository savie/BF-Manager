package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۧܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes4.dex */
public class C11067 extends AbstractC23941 {

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public List f37553 = new ArrayList();

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5719;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39264(R.string.MT_Protector, m41569("output"));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        m41591(R.string.MT_Protector);
        mo41554("...");
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() throws Exception {
        ArrayList arrayList;
        EnumC15675 enumC15675;
        AbstractC20745 abstractC20745M41587 = m41587("output");
        String[] strArrM41566 = m41566("ARG_PATHS");
        String strM41585 = m41585("password");
        int iM41581 = m41581("level");
        boolean zM41573 = m41573("headerEncryption");
        boolean zM41574 = m41573("deleteSources");
        long jM41590 = m41590("splitSize");
        boolean zM41575 = m41573("replaceExisting");
        C4612 c4612M3391 = C0815.m3391((AbstractC17902) this, strArrM41566, false);
        if (mo2357()) {
            return C5202.m14378();
        }
        C19908 c19908M45178 = C19908.m45178(abstractC20745M41587, zM41575 || jM41590 != -1);
        AbstractC20745 abstractC20745M45186 = c19908M45178.m45186();
        ArrayList arrayList2 = new ArrayList();
        C20451 c20451 = new C20451();
        c20451.f66380 = c4612M3391.f16331.size();
        c20451.f66378 = iM41581;
        c20451.f66379 = zM41573;
        try {
            try {
                C17628.m41007(c20451, new C6127(this, jM41590, abstractC20745M45186, arrayList2, strM41585, c4612M3391));
                if (mo2357()) {
                    C0815.m3392(arrayList2);
                    abstractC20745M45186.mo24644();
                    return C5202.m14378();
                }
                if (jM41590 == -1) {
                    enumC15675 = EnumC15675.NONE;
                } else {
                    enumC15675 = EnumC15675.SEVEN_ZIP;
                }
                this.f37553 = c19908M45178.m45185(arrayList2, enumC15675);
                if (mo2357()) {
                    return C5202.m14378();
                }
                if (zM41574) {
                    C0815.m3395(this, strArrM41566, this.f37553, c4612M3391.m12760());
                }
                return C5202.m14379();
            } catch (Exception e) {
                e = e;
                arrayList = arrayList2;
                C0815.m3392(arrayList);
                abstractC20745M45186.mo24644();
                throw e;
            }
        } catch (Exception e2) {
            e = e2;
            arrayList = arrayList2;
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        boolean zM41573 = m41573("compressToAnother");
        C0815.m3393(c5202, zM41573, zM41573 ? m41559(c11546) : m41579(c11545), c11545, c11546, C0815.m3390(this.f37553));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C21094.m47530();
    }
}
