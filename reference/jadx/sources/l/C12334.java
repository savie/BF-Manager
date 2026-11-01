package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: renamed from: l.۫ۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D1K5 */
/* JADX INFO: loaded from: classes4.dex */
public class C12334 extends AbstractC20413 {

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f41225 = 0;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public HashSet f41226 = new HashSet();

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5721;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        m41591(R.string.MT_Protector);
        m41562(R.string.MT_Protector);
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() throws Exception {
        AbstractC20745[] abstractC20745Arr = (AbstractC20745[]) C20318.stream(m41566("ARG_PATHS")).map(new C22057(2)).toArray(new C0338());
        int iM41581 = m41581("dexVersion");
        boolean zM41573 = m41573("onlyFixHeader");
        boolean z = !zM41573 && m41573("replaceWithNop");
        int length = abstractC20745Arr.length;
        int i = 0;
        while (i < length) {
            AbstractC20745 abstractC20745 = abstractC20745Arr[i];
            AbstractC20745 abstractC20745M46733 = abstractC20745.m46733(".tmp");
            int i2 = i + 1;
            mo41554(abstractC20745.getName());
            m46157(0);
            mo21455((i2 * 100) / length);
            try {
                C23144.m51140(abstractC20745, abstractC20745M46733, iM41581, zM41573, z, new C16567(this));
                if (mo2357()) {
                    abstractC20745M46733.mo24647();
                    return C5202.m14378();
                }
                if (ApplicationC0716.f2992.getBoolean("dfb", true)) {
                    abstractC20745.m46687();
                } else {
                    abstractC20745.mo24644();
                }
                abstractC20745M46733.m46699(abstractC20745, (Runnable) null);
                this.f41226.add(abstractC20745.getName());
                i = i2;
            } catch (Exception e) {
                abstractC20745M46733.mo24647();
                throw new Exception(e.getMessage() + " (" + abstractC20745.getName() + MotionUtils.EASING_TYPE_FORMAT_END, e);
            }
        }
        return C5202.m14379();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        if (m41579(c11545)) {
            if (!c5202.m14383()) {
                c11545.m28831();
            }
            HashSet hashSet = this.f41226;
            if (hashSet.isEmpty()) {
                return;
            }
            c11545.m28777((Collection) hashSet);
            c11545.m28830();
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C21094.m47530();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39288(R.string.MT_Protector);
    }
}
