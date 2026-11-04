package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩶ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes2.dex */
public final class C21407 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final AbstractC19169[] f68191 = new AbstractC19169[0];

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final boolean[] f68192 = new boolean[0];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f68193;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f68194;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC19169 f68195;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f68196;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f68197;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C7982 f68200;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f68201;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC19169[] f68199 = f68191;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean[] f68198 = f68192;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f68202 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48710(C1270 c1270) {
        C17359.requireNonNull(c1270, "store");
        AbstractC19169 abstractC19169 = c1270.f4571;
        this.f68195 = abstractC19169;
        int i = abstractC19169 == null ? 0 : abstractC19169.f62020;
        AbstractC19169[] abstractC19169Arr = this.f68199;
        if (abstractC19169Arr.length < i) {
            this.f68199 = (AbstractC19169[]) Arrays.copyOf(abstractC19169Arr, i);
            this.f68198 = Arrays.copyOf(this.f68198, i);
        }
        Arrays.fill(this.f68199, 0, this.f68201, (Object) null);
        this.f68201 = 0;
        this.f68200 = null;
        this.f68202 = -1;
        this.f68193 = 0;
        this.f68196 = 0;
        this.f68197 = false;
        this.f68194 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48711(int i) {
        AbstractC19169 abstractC19169 = this.f68195;
        int i2 = abstractC19169 == null ? 0 : abstractC19169.f62019;
        C17359.checkFromToIndex(i, i, i2);
        Arrays.fill(this.f68199, 0, this.f68201, (Object) null);
        this.f68201 = 0;
        this.f68200 = null;
        this.f68202 = -1;
        this.f68197 = false;
        AbstractC19169 abstractC191610 = this.f68195;
        if (abstractC191610 == null) {
            this.f68196 = 0;
            this.f68193 = 0;
            this.f68194 = -1;
            return false;
        }
        if (i == i2) {
            i = i2 - 1;
        }
        int i3 = 0;
        while (abstractC191610 instanceof C4253) {
            C4253 c4253 = (C4253) abstractC191610;
            AbstractC19169[] abstractC19169Arr = this.f68199;
            int i4 = this.f68201;
            abstractC19169Arr[i4] = c4253;
            AbstractC19169 abstractC191611 = c4253.f15481;
            int i5 = abstractC191611.f62019 + i3;
            if (i < i5) {
                boolean[] zArr = this.f68198;
                this.f68201 = i4 + 1;
                zArr[i4] = false;
                abstractC191610 = abstractC191611;
            } else {
                boolean[] zArr2 = this.f68198;
                this.f68201 = i4 + 1;
                zArr2[i4] = true;
                abstractC191610 = c4253.f15480;
                i3 = i5;
            }
        }
        this.f68200 = (C7982) abstractC191610;
        this.f68193 = i3;
        this.f68202 = 0;
        while (true) {
            int i6 = this.f68202;
            C7982 c7982 = this.f68200;
            if (i6 < c7982.f62021) {
                int i7 = this.f68193 + (c7982.f26521[i6] & Integer.MAX_VALUE);
                this.f68196 = i7;
                if (i < i7) {
                    this.f68197 = true;
                    this.f68194 = 0;
                    return true;
                }
                this.f68193 = i7;
                this.f68202 = i6 + 1;
            } else {
                throw new AssertionError("Invalid syntax run coverage");
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m48714() {
        if (this.f68195 == null || this.f68194 > 0) {
            return false;
        }
        if (!this.f68197) {
            return m48711(0);
        }
        int i = this.f68202 + 1;
        this.f68202 = i;
        C7982 c7982 = this.f68200;
        if (i < c7982.f62021) {
            int i2 = this.f68196;
            this.f68193 = i2;
            this.f68196 = i2 + (c7982.f26521[i] & Integer.MAX_VALUE);
            return true;
        }
        int i3 = this.f68201 - 1;
        while (i3 >= 0 && this.f68198[i3]) {
            i3--;
        }
        if (i3 < 0) {
            this.f68197 = false;
            this.f68194 = 1;
            this.f68200 = null;
            this.f68202 = -1;
            Arrays.fill(this.f68199, 0, this.f68201, (Object) null);
            this.f68201 = 0;
            return false;
        }
        AbstractC19169[] abstractC19169Arr = this.f68199;
        C4253 c4253 = (C4253) abstractC19169Arr[i3];
        int i4 = i3 + 1;
        Arrays.fill(abstractC19169Arr, i4, this.f68201, (Object) null);
        this.f68201 = i3;
        this.f68199[i3] = c4253;
        boolean[] zArr = this.f68198;
        this.f68201 = i4;
        zArr[i3] = true;
        m48707(c4253.f15480, true);
        this.f68202 = 0;
        int i5 = this.f68196;
        this.f68193 = i5;
        this.f68196 = i5 + (this.f68200.f26521[0] & Integer.MAX_VALUE);
        return true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m48713() {
        AbstractC19169 abstractC19169 = this.f68195;
        if (abstractC19169 == null || this.f68194 < 0) {
            return false;
        }
        if (!this.f68197) {
            return m48711(abstractC19169.f62019);
        }
        int i = this.f68202 - 1;
        this.f68202 = i;
        if (i >= 0) {
            int i2 = this.f68193;
            this.f68196 = i2;
            this.f68193 = i2 - (this.f68200.f26521[i] & Integer.MAX_VALUE);
            return true;
        }
        int i3 = this.f68201 - 1;
        while (i3 >= 0 && !this.f68198[i3]) {
            i3--;
        }
        if (i3 < 0) {
            this.f68197 = false;
            this.f68194 = -1;
            this.f68200 = null;
            this.f68202 = -1;
            this.f68196 = 0;
            this.f68193 = 0;
            Arrays.fill(this.f68199, 0, this.f68201, (Object) null);
            this.f68201 = 0;
            return false;
        }
        AbstractC19169[] abstractC19169Arr = this.f68199;
        C4253 c4253 = (C4253) abstractC19169Arr[i3];
        int i4 = i3 + 1;
        Arrays.fill(abstractC19169Arr, i4, this.f68201, (Object) null);
        this.f68201 = i3;
        this.f68199[i3] = c4253;
        boolean[] zArr = this.f68198;
        this.f68201 = i4;
        zArr[i3] = false;
        m48707(c4253.f15481, false);
        C7982 c7982 = this.f68200;
        int i5 = c7982.f62021 - 1;
        this.f68202 = i5;
        int i6 = this.f68193;
        this.f68196 = i6;
        this.f68193 = i6 - (c7982.f26521[i5] & Integer.MAX_VALUE);
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m48715() {
        m48708();
        return this.f68193;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m48709() {
        m48708();
        return this.f68196;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11974 m48712() {
        m48708();
        return this.f68200.f26520[this.f68202];
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m48716() {
        m48708();
        return this.f68200.f26521[this.f68202] < 0;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m48708() {
        if (!this.f68197) {
            throw new IllegalStateException("Syntax run cursor has no current item");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48707(AbstractC19169 abstractC19169, boolean z) {
        while (abstractC19169 instanceof C4253) {
            C4253 c4253 = (C4253) abstractC19169;
            AbstractC19169[] abstractC19169Arr = this.f68199;
            int i = this.f68201;
            abstractC19169Arr[i] = c4253;
            boolean[] zArr = this.f68198;
            this.f68201 = i + 1;
            zArr[i] = !z;
            abstractC19169 = z ? c4253.f15481 : c4253.f15480;
        }
        this.f68200 = (C7982) abstractC19169;
    }
}
