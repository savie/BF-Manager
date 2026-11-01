package l;

/* JADX INFO: renamed from: l.ۘ᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BBU */
/* JADX INFO: loaded from: classes3.dex */
public final class C4234 extends C5541 {
    static {
        new C4234(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4234 m11884(C12205 c12205) {
        C11312 c11312 = C11312.f38175;
        int size = c12205.size();
        C13408[] c13408Arr = new C13408[size];
        int i = 0;
        C11312 c11313 = c11312;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC16438 abstractC16438M15276get = c12205.m15276get(i2);
            if (!(abstractC16438M15276get instanceof C20671)) {
                C11312 c11312M38701 = abstractC16438M15276get.m38701();
                if (!c11312M38701.equals(c11312) && !c11312M38701.m28313(c11313)) {
                    c13408Arr[i] = new C13408(abstractC16438M15276get.m38698(), c11312M38701);
                    i++;
                    c11313 = c11312M38701;
                }
            }
        }
        C4234 c4234 = new C4234(i);
        for (int i3 = 0; i3 < i; i3++) {
            c4234.m15252(i3, c13408Arr[i3]);
        }
        c4234.mo9637();
        return c4234;
    }
}
