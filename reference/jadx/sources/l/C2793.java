package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۖ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2793 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final AbstractC13378[] f10634 = new AbstractC13378[0];

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final boolean[] f10635 = new boolean[0];

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f10638;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f10639;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C1382 f10640;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f10641;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f10642;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC13378 f10643;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f10644;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC13378[] f10645 = f10634;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean[] f10636 = f10635;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f10637 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8488(C7027 c7027) {
        C13638.requireNonNull(c7027, "store");
        AbstractC13378 abstractC13378 = c7027.f23628;
        this.f10643 = abstractC13378;
        int i = abstractC13378 == null ? 0 : abstractC13378.f44318;
        AbstractC13378[] abstractC13378Arr = this.f10645;
        if (abstractC13378Arr.length < i) {
            this.f10645 = (AbstractC13378[]) Arrays.copyOf(abstractC13378Arr, i);
            this.f10636 = Arrays.copyOf(this.f10636, i);
        }
        Arrays.fill(this.f10645, 0, this.f10644, (Object) null);
        this.f10644 = 0;
        this.f10640 = null;
        this.f10637 = -1;
        this.f10638 = 0;
        this.f10642 = 0;
        this.f10641 = false;
        this.f10639 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m8489(int i) {
        AbstractC13378 abstractC13378 = this.f10643;
        int i2 = abstractC13378 == null ? 0 : abstractC13378.f44317;
        C13638.checkFromToIndex(i, i, i2);
        Arrays.fill(this.f10645, 0, this.f10644, (Object) null);
        this.f10644 = 0;
        this.f10640 = null;
        this.f10637 = -1;
        this.f10641 = false;
        AbstractC13378 abstractC13379 = this.f10643;
        if (abstractC13379 == null) {
            this.f10642 = 0;
            this.f10638 = 0;
            this.f10639 = -1;
            return false;
        }
        if (i == i2) {
            i = i2 - 1;
        }
        int i3 = 0;
        while (abstractC13379 instanceof C14084) {
            C14084 c14084 = (C14084) abstractC13379;
            AbstractC13378[] abstractC13378Arr = this.f10645;
            int i4 = this.f10644;
            abstractC13378Arr[i4] = c14084;
            AbstractC13378 abstractC133710 = c14084.f46248;
            int i5 = abstractC133710.f44317 + i3;
            if (i < i5) {
                boolean[] zArr = this.f10636;
                this.f10644 = i4 + 1;
                zArr[i4] = false;
                abstractC13379 = abstractC133710;
            } else {
                boolean[] zArr2 = this.f10636;
                this.f10644 = i4 + 1;
                zArr2[i4] = true;
                abstractC13379 = c14084.f46249;
                i3 = i5;
            }
        }
        this.f10640 = (C1382) abstractC13379;
        this.f10638 = i3;
        this.f10637 = 0;
        while (true) {
            int i6 = this.f10637;
            C1382 c1382 = this.f10640;
            if (i6 < c1382.f44315) {
                int i7 = this.f10638 + (c1382.f5767[i6] & Integer.MAX_VALUE);
                this.f10642 = i7;
                if (i < i7) {
                    this.f10641 = true;
                    this.f10639 = 0;
                    return true;
                }
                this.f10638 = i7;
                this.f10637 = i6 + 1;
            } else {
                throw new AssertionError("Invalid syntax run coverage");
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m8490() {
        if (this.f10643 == null || this.f10639 > 0) {
            return false;
        }
        if (!this.f10641) {
            return m8489(0);
        }
        int i = this.f10637 + 1;
        this.f10637 = i;
        C1382 c1382 = this.f10640;
        if (i < c1382.f44315) {
            int i2 = this.f10642;
            this.f10638 = i2;
            this.f10642 = i2 + (c1382.f5767[i] & Integer.MAX_VALUE);
            return true;
        }
        int i3 = this.f10644 - 1;
        while (i3 >= 0 && this.f10636[i3]) {
            i3--;
        }
        if (i3 < 0) {
            this.f10641 = false;
            this.f10639 = 1;
            this.f10640 = null;
            this.f10637 = -1;
            Arrays.fill(this.f10645, 0, this.f10644, (Object) null);
            this.f10644 = 0;
            return false;
        }
        AbstractC13378[] abstractC13378Arr = this.f10645;
        C14084 c14084 = (C14084) abstractC13378Arr[i3];
        int i4 = i3 + 1;
        Arrays.fill(abstractC13378Arr, i4, this.f10644, (Object) null);
        this.f10644 = i3;
        this.f10645[i3] = c14084;
        boolean[] zArr = this.f10636;
        this.f10644 = i4;
        zArr[i3] = true;
        m8485(c14084.f46249, true);
        this.f10637 = 0;
        int i5 = this.f10642;
        this.f10638 = i5;
        this.f10642 = i5 + (this.f10640.f5767[0] & Integer.MAX_VALUE);
        return true;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m8493() {
        AbstractC13378 abstractC13378 = this.f10643;
        if (abstractC13378 == null || this.f10639 < 0) {
            return false;
        }
        if (!this.f10641) {
            return m8489(abstractC13378.f44317);
        }
        int i = this.f10637 - 1;
        this.f10637 = i;
        if (i >= 0) {
            int i2 = this.f10638;
            this.f10642 = i2;
            this.f10638 = i2 - (this.f10640.f5767[i] & Integer.MAX_VALUE);
            return true;
        }
        int i3 = this.f10644 - 1;
        while (i3 >= 0 && !this.f10636[i3]) {
            i3--;
        }
        if (i3 < 0) {
            this.f10641 = false;
            this.f10639 = -1;
            this.f10640 = null;
            this.f10637 = -1;
            this.f10642 = 0;
            this.f10638 = 0;
            Arrays.fill(this.f10645, 0, this.f10644, (Object) null);
            this.f10644 = 0;
            return false;
        }
        AbstractC13378[] abstractC13378Arr = this.f10645;
        C14084 c14084 = (C14084) abstractC13378Arr[i3];
        int i4 = i3 + 1;
        Arrays.fill(abstractC13378Arr, i4, this.f10644, (Object) null);
        this.f10644 = i3;
        this.f10645[i3] = c14084;
        boolean[] zArr = this.f10636;
        this.f10644 = i4;
        zArr[i3] = false;
        m8485(c14084.f46248, false);
        C1382 c1382 = this.f10640;
        int i5 = c1382.f44315 - 1;
        this.f10637 = i5;
        int i6 = this.f10638;
        this.f10642 = i6;
        this.f10638 = i6 - (c1382.f5767[i5] & Integer.MAX_VALUE);
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m8492() {
        m8484();
        return this.f10638;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m8487() {
        m8484();
        return this.f10642;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C15682 m8491() {
        m8484();
        return this.f10640.f5768[this.f10637];
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m8486() {
        m8484();
        return this.f10640.f5767[this.f10637] < 0;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m8484() {
        if (!this.f10641) {
            throw new IllegalStateException("Syntax run cursor has no current item");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8485(AbstractC13378 abstractC13378, boolean z) {
        while (abstractC13378 instanceof C14084) {
            C14084 c14084 = (C14084) abstractC13378;
            AbstractC13378[] abstractC13378Arr = this.f10645;
            int i = this.f10644;
            abstractC13378Arr[i] = c14084;
            boolean[] zArr = this.f10636;
            this.f10644 = i + 1;
            zArr[i] = !z;
            abstractC13378 = z ? c14084.f46248 : c14084.f46249;
        }
        this.f10640 = (C1382) abstractC13378;
    }
}
