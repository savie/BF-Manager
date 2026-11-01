package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۡ᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes4.dex */
public class C9162 extends AbstractC23941 {

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC12233 f31204;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f31203 = new ArrayList();

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f31202 = new ArrayList();

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩺ */
    public final boolean mo12168() {
        return false;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5724;
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
        String[] strArrM41566 = m41566("oldNames");
        String[] strArrM41567 = m41566("newNames");
        String strM41585 = m41585(MotionUtils.EASING_TYPE_PATH);
        this.f31204 = (AbstractC12233) m41560();
        C8516 c8516 = new C8516(strArrM41566.length);
        c8516.m22241(new C15101(5, this));
        for (int i = 0; i < strArrM41566.length; i++) {
            C13080 c13080 = new C13080(strArrM41566[i], strArrM41567[i]);
            c8516.m22242(1);
            mo41554(c13080.m32296());
            if (c13080.m32295(this.f31204, strM41585)) {
                this.f31203.add(c13080.m32297());
            } else {
                this.f31202.add(c13080.m32296());
            }
            if (mo2357()) {
                return C5202.m14378();
            }
        }
        return C5202.m14379();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo16350(AbstractActivityC12483 abstractActivityC12483, C5202 c5202, boolean z) {
        ArrayList arrayList = this.f31202;
        if (arrayList.isEmpty()) {
            return;
        }
        C3906.m11360(abstractActivityC12483, arrayList);
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        if (m41579(c11545)) {
            if (c5202.m14380()) {
                c11545.m28831();
                if (this.f31202.isEmpty()) {
                    C15829.m37611(R.string.MT_Protector);
                }
            }
            ArrayList arrayList = this.f31203;
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
        C21094.m47529(this.f31204.mo10276());
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39288(R.string.MT_Protector);
    }
}
