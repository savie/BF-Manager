package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩵ܺ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S97M */
/* JADX INFO: loaded from: classes5.dex */
public class C19557 extends AbstractC23941 {

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public String f62859;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f62858 = true;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f62860 = new ArrayList();

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5725;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39288(R.string.MT_Protector);
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        m41591(R.string.MT_Protector);
        mo41554("...");
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() {
        HashSet hashSet = new HashSet();
        try {
            ArrayList<C16137> arrayList = (ArrayList) m41584("infos");
            C8516 c8516 = new C8516(arrayList.size());
            c8516.m22241(new C12388(2, this));
            for (C16137 c16137 : arrayList) {
                c8516.m22242(1);
                mo41554(c16137.m38201());
                hashSet.add(c16137.m38204());
                AbstractC20745 abstractC20745M38207 = c16137.m38207();
                hashSet.remove(c16137.m38204());
                if (this.f62858) {
                    String str = this.f62859;
                    ArrayList arrayList2 = this.f62860;
                    if (str == null) {
                        this.f62859 = abstractC20745M38207.getParent();
                        arrayList2.add(abstractC20745M38207.getName());
                    } else if (str.equals(abstractC20745M38207.getParent())) {
                        arrayList2.add(abstractC20745M38207.getName());
                    } else {
                        this.f62858 = false;
                    }
                }
                if (mo2357()) {
                    C5202 c5202M14378 = C5202.m14378();
                    C20370.m46019(hashSet);
                    return c5202M14378;
                }
            }
            C5202 c5202M41583 = m41583();
            C20370.m46019(hashSet);
            return c5202M41583;
        } catch (Throwable th) {
            C20370.m46019(hashSet);
            throw th;
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        if (c5202.m14380() && m41579(c11545)) {
            c11545.m28831();
            if (this.f62858) {
                boolean zM28814 = c11546.m28814("local");
                ArrayList arrayList = this.f62860;
                if (zM28814 && m41559(c11546)) {
                    c11546.m28777((Collection) arrayList);
                    c11546.m28812(this.f62859, true);
                } else {
                    c11545.m28777((Collection) arrayList);
                    c11545.m28812(this.f62859, true);
                }
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C21094.m47530();
    }
}
