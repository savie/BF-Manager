package l;

import android.os.SystemClock;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۛۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 795C */
/* JADX INFO: loaded from: classes3.dex */
public class C6027 extends AbstractC23941 {

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f20494 = new ArrayList();

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f20493 = new ArrayList();

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩺ */
    public final boolean mo12168() {
        return false;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() {
        String[] strArrM41566 = m41566("ARG_PATHS");
        String strM41585 = m41585("targetPath");
        C2462.m7541(strM41585, EnumC11636.MODIFY_DIRECTORY);
        SystemClock.sleep(200L);
        C8516 c8516 = new C8516(strArrM41566.length);
        c8516.m22241(new C1506(this));
        int length = 1000 / strArrM41566.length;
        if (length > 200) {
            length = 200;
        }
        for (String str : strArrM41566) {
            AbstractC20745 abstractC20745M15313 = C5553.m15313(str, new String[0]);
            String name = abstractC20745M15313.getName();
            c8516.m22242(1);
            mo41554(name);
            if (length > 0) {
                SystemClock.sleep(length);
            }
            try {
                C5553.m15313(C6730.m18162(strM41585, name), new String[0]).mo33977(abstractC20745M15313.mo40911());
                this.f20494.add(name);
            } catch (IOException unused) {
                this.f20493.add(name);
            }
            if (mo2357()) {
                return C5202.m14378();
            }
        }
        return C5202.m14379();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5723;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        m41591(R.string.MT_Protector);
        m41562(R.string.MT_Protector);
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo16350(AbstractActivityC12483 abstractActivityC12483, C5202 c5202, boolean z) {
        ArrayList arrayList = this.f20493;
        if (arrayList.isEmpty()) {
            return;
        }
        abstractActivityC12483.m30997(R.string.MT_Protector, C6851.m18456(arrayList, "\n"), false);
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        if (c5202.m14380() && m41579(c11545)) {
            c11545.m28831();
        }
        ArrayList arrayList = this.f20494;
        if (arrayList.isEmpty() || !m41559(c11546)) {
            return;
        }
        c11546.m28777((Collection) arrayList);
        c11546.m28830();
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
