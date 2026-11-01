package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes4.dex */
public final class C15816 implements InterfaceC8760 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f51185;

    public C15816(List list) {
        this.f51185 = list;
    }

    @Override // l.InterfaceC8760
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1820(AbstractC8075 abstractC8075) {
        Iterator it = this.f51185.iterator();
        while (it.hasNext()) {
            if (C1703.m5660((C10877) it.next(), abstractC8075)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m37592() {
        Iterator it = this.f51185.iterator();
        int i = Integer.MIN_VALUE;
        while (it.hasNext()) {
            int i2 = ((C10877) it.next()).f36988;
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    public final String toString() {
        return "not(" + this.f51185 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
