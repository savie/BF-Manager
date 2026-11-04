package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: G7D4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19942 extends C16521 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f64136;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f64137;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public String f64138;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public String f64139;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public String f64140;

    public C19942(EnumC13127 enumC13127, C0970 c0970, int i) {
        super(c0970, C22180.class, i);
        this.f64139 = ": number_of_entries = %d";
        this.f64140 = "n/a";
        this.f64138 = "n/a";
        this.f64137 = new ArrayList(i);
        int i2 = C22926.f74500[enumC13127.ordinal()];
        if (i2 == 1) {
            this.f64136 = c0970.m6506(EnumC5202.f18310.m15637());
            this.f64139 = C7376.m20248(EnumC5202.f18326, new StringBuilder(), ": number_of_entries = %d");
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("Unexpected value: " + enumC13127);
            }
            this.f64136 = c0970.m6506(EnumC5202.f18282.m15637());
            this.f64139 = C7376.m20248(EnumC5202.f18182, new StringBuilder(), ": number_of_entries = %d");
        }
        this.f64140 = C12669.m31437(this.f64136, "s = %-3d", new StringBuilder("%"));
        this.f64138 = C12669.m31437(this.f64136, "s = %s", new StringBuilder("%"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45867(C22180 c22180, boolean z) {
        c22180.m50176(this.f64136, this.f64140, this.f64138);
        m39148((AbstractC20997) c22180);
        this.f64137.add(Boolean.valueOf(z));
    }

    @Override // l.C16521, l.AbstractC20997, l.InterfaceC16454
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1688() {
        ArrayList arrayList = this.f53488;
        int size = arrayList.size();
        if (size > 0) {
            ((C22180) arrayList.get(0)).m50177(String.format(this.f64139, Integer.valueOf(arrayList.size() - ((int) C1170.stream(this.f64137).filter(new C10991()).count()))));
            mo12383(mo12385());
            for (int i = 0; i < size; i++) {
                C22180 c22180 = (C22180) arrayList.get(i);
                c22180.f67148 = this.f67148;
                c22180.mo11099(i, size);
            }
        }
    }
}
