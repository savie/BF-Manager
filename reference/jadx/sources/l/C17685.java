package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿ᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9JB */
/* JADX INFO: loaded from: classes4.dex */
public final class C17685 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f56174 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41207(C1186 c1186, C19240 c19240) {
        c19240.m27389(2);
        byte bM27388 = c19240.m27388();
        c19240.m27389(1);
        int iM27378 = c19240.m27378();
        if (bM27388 > 0) {
            for (int i = 0; i < bM27388; i++) {
                c19240.m27378();
                c19240.m27389(4);
                m41205(c1186, c19240);
            }
            return;
        }
        if (iM27378 > 0) {
            m41205(c1186, c19240);
        } else {
            if (iM27378 != 0 || c19240.m27391() <= 0) {
                return;
            }
            c19240.m27389(1);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m41205(C1186 c1186, C19240 c19240) {
        long jM4349 = c1186.m4349();
        long value = EnumC3055.STATUS_BUFFER_TOO_SMALL.getValue();
        ArrayList arrayList = this.f56174;
        if (jM4349 == value) {
            C0751 c0751 = new C0751();
            c19240.m27394();
            arrayList.add(c0751);
        } else if (jM4349 == EnumC3055.STATUS_STOPPED_ON_SYMLINK.getValue()) {
            C12747 c12747 = new C12747();
            C12747.m31677(c12747, c19240);
            arrayList.add(c12747);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m41206() {
        return this.f56174;
    }
}
