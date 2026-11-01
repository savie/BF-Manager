package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩺ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J4ZK */
/* JADX INFO: loaded from: classes.dex */
public final class C22811 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15050 f74214;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f74215 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10111 f74216;

    public C22811(int i) {
        C10111 c10111 = new C10111(i);
        this.f74216 = c10111;
        this.f74214 = (C15050) c10111.f34519.get(0);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C10111 m50484() {
        return this.f74216;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50479(String str) {
        HashMap map = this.f74215;
        C5171 c5171 = (C5171) map.get(str);
        if (c5171 != null) {
            if (c5171.m7134()) {
                throw new IllegalArgumentException("There is already a label with that name.");
            }
            ((C12933) this.f74214.m36037()).add(c5171);
        } else {
            C15050 c15050 = this.f74214;
            c15050.getClass();
            C5171 c5172 = new C5171();
            ((C12933) c15050.m36037()).add(c5172);
            map.put(str, c5172);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5171 m50486(String str) {
        HashMap map = this.f74215;
        C5171 c5171 = (C5171) map.get(str);
        if (c5171 != null) {
            return c5171;
        }
        C5171 c5172 = new C5171();
        map.put(str, c5172);
        return c5172;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50480(C1428 c1428, C5171 c5171, C5171 c5172, C5171 c5173) {
        this.f74216.m25733(c1428, c5171, c5172, c5173);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50483(C5171 c5171, C5171 c5172, C5171 c5173) {
        this.f74216.m25735(c5171, c5172, c5173);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50488(int i) {
        ((C12933) this.f74214.m36039()).add(new C19989(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50478(int i, C3067 c3067, C1428 c1428, C3067 c3068) {
        ((C12933) this.f74214.m36039()).add(new C17166(i, c3067, c1428, c3068));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50477(int i) {
        ((C12933) this.f74214.m36039()).add(new C20694(i));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m50485(int i) {
        ((C12933) this.f74214.m36039()).add(new C16461(i));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m50487() {
        ((C12933) this.f74214.m36039()).add(new C0232());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50476() {
        ((C12933) this.f74214.m36039()).add(new C15756());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50481(C3067 c3067) {
        ((C12933) this.f74214.m36039()).add(new C12228(c3067));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50482(AbstractC3384 abstractC3384) {
        C10111 c10111 = this.f74216;
        c10111.m25734(abstractC3384);
        this.f74214 = (C15050) C19084.m43861(c10111.f34519, 1);
    }
}
