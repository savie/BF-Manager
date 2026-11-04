package l;

/* JADX INFO: renamed from: l.ۧ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: RITT */
/* JADX INFO: loaded from: classes4.dex */
public final class C11975 implements InterfaceC7377 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f38550;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f38551 = new int[5];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f38552;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f38553;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f38554;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f38555;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C13225 f38556;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f38557;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f38558;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12479 f38559;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f38560;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C25160 f38561;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12479 f38562;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC11017 f38563;

    public C11975(C25160 c25160, C12479 c12479) {
        this.f38561 = c25160;
        this.f38562 = c12479;
        this.f38559 = c12479.m30987();
    }

    @Override // l.InterfaceC7377
    /* JADX INFO: renamed from: ܽ */
    public final void mo20260() {
        if (this.f38556 == null || this.f38553) {
            return;
        }
        C25160.m56072(this);
    }

    @Override // l.InterfaceC7377
    public final int getOffset() {
        return this.f38550;
    }

    @Override // l.InterfaceC7377
    /* JADX INFO: renamed from: ۤ */
    public final EnumC5052 mo20254() {
        C13225 c13225 = this.f38556;
        if (c13225 == null) {
            return EnumC5052.UNKNOWN;
        }
        return c13225.m32774();
    }

    @Override // l.InterfaceC7377
    /* JADX INFO: renamed from: ܶ */
    public final int mo20258() {
        return this.f38558;
    }

    @Override // l.InterfaceC7377
    /* JADX INFO: renamed from: ۙ */
    public final int mo20252(int i) {
        return this.f38551[i];
    }

    @Override // l.InterfaceC7377
    /* JADX INFO: renamed from: ᩴ */
    public final long mo20261() {
        return this.f38552;
    }

    @Override // l.InterfaceC7377
    /* JADX INFO: renamed from: ۙ */
    public final int mo20251() {
        return this.f38557;
    }

    @Override // l.InterfaceC7377
    /* JADX INFO: renamed from: ܺ */
    public final EnumC14088 mo20259() {
        return this.f38556.m32775();
    }

    @Override // l.InterfaceC7377
    /* JADX INFO: renamed from: ֫ */
    public final String mo20250() {
        return this.f38562.m30998(this.f38560);
    }

    @Override // l.InterfaceC7377
    /* JADX INFO: renamed from: ܳ */
    public final String mo20257() {
        return this.f38562.m30997(this.f38560);
    }

    @Override // l.InterfaceC7377
    /* JADX INFO: renamed from: ۚ */
    public final C16954 mo20253() {
        int i = this.f38560;
        C16954 c16954 = new C16954(null);
        C12479 c12479 = this.f38562;
        c16954.m39935(c12479.m30997(c12479.m30985(c16954, i)));
        return c16954;
    }

    @Override // l.InterfaceC7377
    /* JADX INFO: renamed from: ۫ */
    public final C20684 mo20256() {
        int i = this.f38560;
        C20684 c20684 = new C20684();
        this.f38562.m30989(i, c20684);
        return c20684;
    }

    @Override // l.InterfaceC7377
    /* JADX INFO: renamed from: ۧ */
    public final C0665 mo20255() {
        return this.f38562.m30986(this.f38560, this.f38559);
    }

    @Override // l.InterfaceC7377
    /* JADX INFO: renamed from: ᩷ */
    public final C3530 mo20262(int i) {
        return this.f38562.m31003(i);
    }

    @Override // l.InterfaceC7377
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC11017 mo20263() {
        return this.f38563;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] m30061() {
        return this.f38551;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30053(int[] iArr) {
        this.f38551 = iArr;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m30057(int i) {
        this.f38558 = i;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int m30048() {
        return this.f38555;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m30063(int i) {
        this.f38555 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30049(long j) {
        this.f38552 = j;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m30054(int i) {
        this.f38557 = i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m30055(int i) {
        this.f38560 = i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m30056() {
        return this.f38553;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30052(boolean z) {
        this.f38553 = z;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m30059(int i) {
        this.f38550 = i;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C13225 m30064() {
        return this.f38556;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30051(C13225 c13225) {
        this.f38556 = c13225;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C25160 m30062() {
        return this.f38561;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m30060() {
        return this.f38554;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m30058(int i) {
        this.f38554 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30050(InterfaceC11017 interfaceC11017) {
        this.f38563 = interfaceC11017;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("0x%04X", Integer.valueOf(this.f38550)));
        sb.append(": ");
        sb.append(mo20254());
        if (this.f38556 == null) {
            sb.append(String.format("(0x%04X)", Integer.valueOf(this.f38554)));
        } else {
            int i = this.f38558;
            if (this.f38553) {
                sb.append(' ');
                for (int i2 = 0; i2 < i; i2++) {
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append("r");
                    sb.append(this.f38551[i2]);
                }
            }
        }
        return sb.toString();
    }
}
