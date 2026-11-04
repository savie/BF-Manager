package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes4.dex */
public final class C7783 implements InterfaceC14494 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f25854;

    public C7783(List list) {
        this.f25854 = list;
    }

    @Override // l.InterfaceC14494
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4022(AbstractC14472 abstractC14472) {
        Iterator it = this.f25854.iterator();
        while (it.hasNext()) {
            if (C21758.m49322((C7037) it.next(), abstractC14472)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m21175() {
        Iterator it = this.f25854.iterator();
        int i = Integer.MIN_VALUE;
        while (it.hasNext()) {
            int i2 = ((C7037) it.next()).f23220;
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    public final String toString() {
        return "not(" + this.f25854 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
