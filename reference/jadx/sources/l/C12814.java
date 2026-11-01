package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.۬ۖ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y96B */
/* JADX INFO: loaded from: classes4.dex */
public class C12814 extends AbstractC20413 {

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public String f42666;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f42667 = new ArrayList();

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5714;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        String str = this.f42666;
        if (str == null) {
            str = "null";
        }
        return C16737.m39264(R.string.MT_Protector, str, C16737.m39288(R.string.MT_Protector));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        m41591(R.string.MT_Protector);
        mo41554("...");
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() throws IOException {
        AbstractC20745[] abstractC20745ArrM15322 = C5553.m15322(m41566("ARG_PATHS"));
        boolean z = abstractC20745ArrM15322.length == 1;
        if (z) {
            m46154();
        }
        String strM41585 = m41585("password");
        boolean zM41573 = m41573("removeSource");
        long jMo33964 = 0;
        for (AbstractC20745 abstractC20745 : abstractC20745ArrM15322) {
            jMo33964 += abstractC20745.mo33964();
        }
        C8516 c8516 = new C8516(jMo33964);
        if (!z) {
            c8516.m22241(new C11509(4, this));
        }
        for (AbstractC20745 abstractC20746 : abstractC20745ArrM15322) {
            String name = abstractC20746.getName();
            this.f42666 = name;
            mo41554(name);
            AbstractC20745 abstractC20745M46706 = abstractC20746.m46706(name + ".encrypt");
            C8516 c8517 = new C8516(abstractC20746.mo33964());
            if (z) {
                c8517.m22241(new C11509(4, this));
            } else {
                c8517.m22241(new C0404(this));
            }
            C8807 c8807 = new C8807(abstractC20745M46706.m46708(), strM41585, 1, true);
            try {
                abstractC20746.m46696(c8807, new C0818(this, c8517, c8516));
                c8807.close();
                if (mo2357()) {
                    abstractC20745M46706.mo24644();
                    break;
                }
                this.f42667.add(abstractC20745M46706.getName());
                if (zM41573) {
                    abstractC20746.mo24644();
                }
            } catch (Throwable th) {
                try {
                    c8807.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return m41583();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        ArrayList arrayList = this.f42667;
        if (arrayList.isEmpty() || !m41579(c11545)) {
            return;
        }
        if (!mo2357()) {
            c11545.m28831();
        }
        c11545.m28777((Collection) arrayList);
        c11545.m28830();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C21094.m47530();
    }
}
