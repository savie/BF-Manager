package l;

import android.os.SystemClock;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ᩳۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: B29A */
/* JADX INFO: loaded from: classes5.dex */
public class C17790 extends AbstractC23941 {

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f56402 = new ArrayList();

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f56401 = new ArrayList();

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
        C2462.m7541(strM41585, EnumC11636.MODIFY_DIRECTORY);
        SystemClock.sleep(200L);
        C8516 c8516 = new C8516(strArrM41566.length);
        c8516.m22241(new C1172(1, this));
        int length = 1000 / strArrM41566.length;
        if (length > 150) {
            length = 150;
        }
        for (int i = 0; i < strArrM41566.length; i++) {
            C13080 c13080 = new C13080(strArrM41566[i], strArrM41567[i]);
            c8516.m22242(1);
            mo41554(c13080.m32296());
            if (length > 0) {
                SystemClock.sleep(length);
            }
            if (c13080.m32294(strM41585)) {
                this.f56402.add(c13080.m32297());
            } else {
                this.f56401.add(c13080.m32296());
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
        ArrayList arrayList = this.f56401;
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
                if (this.f56401.isEmpty()) {
                    C15829.m37611(R.string.MT_Protector);
                }
            }
            ArrayList arrayList = this.f56402;
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
        C21094.m47530();
        C23186.m51173();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39288(R.string.MT_Protector);
    }
}
