package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻ۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7D4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23490 extends C3275 {

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public String f76051;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f76052;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f76053;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public String f76054;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public String f76055;

    public C23490(EnumC16783 enumC16783, C21620 c21620, int i) {
        super(c21620, C17139.class, i);
        this.f76051 = ": number_of_entries = %d";
        this.f76054 = "n/a";
        this.f76055 = "n/a";
        this.f76053 = new ArrayList(i);
        int i2 = C10790.f36754[enumC16783.ordinal()];
        if (i2 == 1) {
            this.f76052 = c21620.m34923(EnumC20934.f68068.m47084());
            this.f76051 = C16236.m38348(EnumC20934.f68149, new StringBuilder(), ": number_of_entries = %d");
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("Unexpected value: " + enumC16783);
            }
            this.f76052 = c21620.m34923(EnumC20934.f68160.m47084());
            this.f76051 = C16236.m38348(EnumC20934.f68067, new StringBuilder(), ": number_of_entries = %d");
        }
        this.f76054 = C12441.m30911(this.f76052, "s = %-3d", new StringBuilder("%"));
        this.f76055 = C12441.m30911(this.f76052, "s = %s", new StringBuilder("%"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51752(C17139 c17139, boolean z) {
        c17139.m40048(this.f76052, this.f76054, this.f76055);
        m9755((AbstractC6741) c17139);
        this.f76053.add(Boolean.valueOf(z));
    }

    @Override // l.C3275, l.AbstractC6741, l.InterfaceC5144
    /* JADX INFO: renamed from: ܰ */
    public final void mo3628() {
        ArrayList arrayList = this.f12145;
        int size = arrayList.size();
        if (size > 0) {
            ((C17139) arrayList.get(0)).m40045(String.format(this.f76051, Integer.valueOf(arrayList.size() - ((int) C9030.stream(this.f76053).filter(new C5850(0)).count()))));
            mo9754(mo9753());
            for (int i = 0; i < size; i++) {
                C17139 c17139 = (C17139) arrayList.get(i);
                c17139.f22686 = this.f22686;
                c17139.mo14102(i, size);
            }
        }
    }
}
