package l;

import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ܰ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: H88G */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24342 {
    /* JADX INFO: renamed from: ۙ */
    public abstract String mo18221();

    /* JADX INFO: renamed from: ۙ */
    public abstract List mo18222(String str, String str2);

    /* JADX INFO: renamed from: ۤ */
    public abstract String mo18223();

    /* JADX INFO: renamed from: ܳ */
    public abstract boolean mo18224();

    /* JADX INFO: renamed from: ᩴ */
    public abstract String mo18225();

    /* JADX INFO: renamed from: ᩷ */
    public abstract String mo18226();

    /* JADX INFO: renamed from: ᩸ */
    public abstract int mo18227();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC24342 m54383(int i) {
        if (i == 0) {
            return C6442.f21680;
        }
        if (i == 1) {
            return C23596.f76606;
        }
        if (i == 2) {
            return C11661.f37791;
        }
        if (i == 3) {
            return C16136.f52423;
        }
        if (i == 4) {
            return C25088.f81124;
        }
        if (i == 5) {
            return C12407.f39903;
        }
        return C6442.f21680;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo30881(AbstractActivityC17204 abstractActivityC17204, C23255 c23255, C23255 c23256, C23255 c23257, C23255 c23258, C23255 c23259) {
        if (AbstractC0148.m1321(c23255, R.string.MT_Protector) && AbstractC0148.m1321(c23256, R.string.MT_Protector)) {
            new C1967(abstractActivityC17204, new C15390(this, c23255, c23256), c23259, c23257, c23258).m8197();
        }
    }

    public final String toString() {
        return mo18223();
    }
}
