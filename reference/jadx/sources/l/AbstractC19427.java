package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳ᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: T62G */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19427 extends C8240 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Object f62770;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f62773 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Object f62772 = null;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f62771 = 0;

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo9829(Object obj);

    /* JADX INFO: renamed from: ۚ */
    public abstract Object mo9830();

    @Override // l.C8240
    /* JADX INFO: renamed from: ᩴ */
    public Object mo9832() {
        Object objM22154 = m22154(0);
        int i = this.f27101 + 1;
        this.f27101 = i;
        ArrayList arrayList = this.f27099;
        if (i == arrayList.size() && this.f62771 == 0) {
            this.f62770 = objM22154;
            this.f27101 = 0;
            arrayList.clear();
        }
        return objM22154;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44922() {
        m44920(1);
        mo9832();
        this.f62773++;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m44920(int i) {
        int i2 = this.f27101 + i;
        ArrayList arrayList = this.f27099;
        int size = ((i2 - 1) - arrayList.size()) + 1;
        if (size > 0) {
            for (int i3 = 1; i3 <= size; i3++) {
                Object objMo9830 = mo9830();
                if (mo9829(objMo9830)) {
                    this.f62772 = objMo9830;
                }
                arrayList.add(objMo9830);
            }
        }
    }

    @Override // l.C8240
    public final int size() {
        throw new UnsupportedOperationException("streams are of unknown size");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object m44918(int i) {
        if (i == 0) {
            return null;
        }
        ArrayList arrayList = this.f27099;
        if (i >= 0) {
            m44920(i);
            return (this.f27101 + i) + (-1) > arrayList.size() ? this.f62772 : m22154(i - 1);
        }
        int i2 = this.f27101 - (-i);
        if (i2 == -1) {
            return this.f62770;
        }
        if (i2 >= 0) {
            return arrayList.get(i2);
        }
        if (i2 < -1) {
            throw new UnsupportedOperationException("can't look more than one token before the beginning of this stream's buffer");
        }
        throw new UnsupportedOperationException("can't look past the end of this stream's buffer using LB(int)");
    }

    public final int index() {
        return this.f62773;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m44919() {
        this.f62771++;
        return this.f27101;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m44921(int i) {
        this.f62771--;
        this.f62773 -= this.f27101 - i;
        this.f27101 = i;
    }
}
