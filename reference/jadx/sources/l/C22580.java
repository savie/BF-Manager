package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BFQ */
/* JADX INFO: loaded from: classes.dex */
public final class C22580 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1412 f73602;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f73603;

    public C22580(C6559 c6559, int i, int i2, int i3, int i4) {
        this.f73602 = new C1412(c6559, i, i3, i4);
        this.f73603 = new ArrayList(i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50089(AbstractC16438 abstractC16438) {
        this.f73602.m4934(abstractC16438);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC16438 m50088(int i) {
        C1412 c1412 = this.f73602;
        if (i >= c1412.m4937() || i < 0) {
            return null;
        }
        return c1412.m4933(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m50091() {
        return this.f73602.m4937();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50090(C20671 c20671) {
        this.f73602.m4936(c20671);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50092(AbstractC16438 abstractC16438) {
        this.f73603.add(abstractC16438);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1412 m50087() {
        ArrayList arrayList = this.f73603;
        if (arrayList == null) {
            throw new UnsupportedOperationException("already processed");
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            C1412 c1412 = this.f73602;
            if (i < size) {
                c1412.m4934((AbstractC16438) this.f73603.get(i));
                i++;
            } else {
                this.f73603 = null;
                return c1412;
            }
        }
    }
}
