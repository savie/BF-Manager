package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩻֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K8BJ */
/* JADX INFO: loaded from: classes2.dex */
public class C23395 extends AbstractC20413 {

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f75783 = 0;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final C2973 f75784 = new C2973();

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5726;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39264(R.string.MT_Protector, m41567("targetPath"));
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
        if (c5202.m14380() && m41579(c11545)) {
            c11545.m28831();
        }
        HashSet hashSetM8809 = this.f75784.m8809();
        if (hashSetM8809.isEmpty() || !m41559(c11546)) {
            return;
        }
        c11546.m28777((Collection) hashSetM8809);
        c11546.m28830();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() {
        String[] strArrM41566 = m41566("ARG_PATHS");
        String strM41585 = m41585("targetPath");
        this.f75784.m8810(m41560(), strArrM41566, strM41585, new C10695(this));
        return m41583();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C21094.m47530();
    }
}
