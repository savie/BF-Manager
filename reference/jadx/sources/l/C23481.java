package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.᩻ۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AHA */
/* JADX INFO: loaded from: classes2.dex */
public class C23481 extends AbstractC23941 {

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f76025 = new ArrayList();

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC12233 f76026;

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5716;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39264(R.string.MT_Protector, m41569("targetPath"));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        m41591(R.string.MT_Protector);
        mo41554("...");
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        if (m41579(c11545)) {
            ArrayList arrayList = this.f76025;
            if (arrayList.isEmpty()) {
                return;
            }
            c11545.m28777((Collection) arrayList);
            c11545.m28830();
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C21094.m47529(this.f76026.mo10276());
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() throws Exception {
        String[] strArrM41566 = m41566("ARG_PATHS");
        String strM41585 = m41585("targetPath");
        this.f76026 = (AbstractC12233) m41560();
        int i = 0;
        while (i < strArrM41566.length) {
            if (mo2357()) {
                return C5202.m14378();
            }
            String str = strArrM41566[i];
            String strM18175 = C6730.m18175(str);
            mo41554(strM18175);
            i++;
            m41578(i, strArrM41566.length);
            try {
                this.f76026.mo10265(str, C6730.m18162(strM41585, strM18175));
                this.f76025.add(strM18175);
            } catch (Exception e) {
                throw new Exception(C16737.m39264(R.string.MT_Protector, strM18175), e);
            }
        }
        return C5202.m14379();
    }
}
