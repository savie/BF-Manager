package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ܰۖ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: S97M */
/* JADX INFO: loaded from: classes5.dex */
public class C14295 extends AbstractC16610 {

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public String f45137;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f45138 = true;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f45139 = new ArrayList();

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46059;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49088(R.string.MT_Protector);
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        mo29447("...");
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() {
        HashSet hashSet = new HashSet();
        try {
            ArrayList<C22616> arrayList = (ArrayList) m43853("infos");
            C3374 c3374 = new C3374(arrayList.size());
            c3374.m11078(new C7256(4, this));
            for (C22616 c22616 : arrayList) {
                c3374.m11079(1);
                mo29447(c22616.m50956());
                hashSet.add(c22616.m50957());
                AbstractC22044 abstractC22044M50963 = c22616.m50963();
                hashSet.remove(c22616.m50957());
                if (this.f45138) {
                    String str = this.f45137;
                    ArrayList arrayList2 = this.f45139;
                    if (str == null) {
                        this.f45137 = abstractC22044M50963.getParent();
                        arrayList2.add(abstractC22044M50963.getName());
                    } else if (str.equals(abstractC22044M50963.getParent())) {
                        arrayList2.add(abstractC22044M50963.getName());
                    } else {
                        this.f45138 = false;
                    }
                }
                if (mo924()) {
                    C12187 c12187M30469 = C12187.m30469();
                    C19632.m45277(hashSet);
                    return c12187M30469;
                }
            }
            C12187 c12187M43857 = m43857();
            C19632.m45277(hashSet);
            return c12187M43857;
        } catch (Throwable th) {
            C19632.m45277(hashSet);
            throw th;
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        if (c12187.m30474() && m43863(c8614)) {
            c8614.m23209();
            if (this.f45138) {
                boolean zM23228 = c8615.m23228("local");
                ArrayList arrayList = this.f45139;
                if (zM23228 && m43837(c8615)) {
                    c8615.m23176((Collection) arrayList);
                    c8615.m23226(this.f45137, true);
                } else {
                    c8614.m23176((Collection) arrayList);
                    c8614.m23226(this.f45137, true);
                }
            }
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C6331.m18055();
    }
}
