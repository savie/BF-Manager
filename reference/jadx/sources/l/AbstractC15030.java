package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: T62G */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15030 extends C22791 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Object f49003;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f49004 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Object f49005 = null;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f49006 = 0;

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo21034(Object obj);

    /* JADX INFO: renamed from: ۬ */
    public abstract Object mo21037();

    @Override // l.C22791
    /* JADX INFO: renamed from: ۚ */
    public Object mo21035() {
        Object objM50450 = m50450(0);
        int i = this.f74178 + 1;
        this.f74178 = i;
        ArrayList arrayList = this.f74176;
        if (i == arrayList.size() && this.f49006 == 0) {
            this.f49003 = objM50450;
            this.f74178 = 0;
            arrayList.clear();
        }
        return objM50450;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36018() {
        m36019(1);
        mo21035();
        this.f49004++;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m36019(int i) {
        int i2 = this.f74178 + i;
        ArrayList arrayList = this.f74176;
        int size = ((i2 - 1) - arrayList.size()) + 1;
        if (size > 0) {
            for (int i3 = 1; i3 <= size; i3++) {
                Object objMo21037 = mo21037();
                if (mo21034(objMo21037)) {
                    this.f49005 = objMo21037;
                }
                arrayList.add(objMo21037);
            }
        }
    }

    @Override // l.C22791
    public final int size() {
        throw new UnsupportedOperationException("streams are of unknown size");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object m36017(int i) {
        if (i == 0) {
            return null;
        }
        ArrayList arrayList = this.f74176;
        if (i >= 0) {
            m36019(i);
            return (this.f74178 + i) + (-1) > arrayList.size() ? this.f49005 : m50450(i - 1);
        }
        int i2 = this.f74178 - (-i);
        if (i2 == -1) {
            return this.f49003;
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
        return this.f49004;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m36015() {
        this.f49006++;
        return this.f74178;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m36016(int i) {
        this.f49006--;
        this.f49004 -= this.f74178 - i;
        this.f74178 = i;
    }
}
