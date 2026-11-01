package l;

/* JADX INFO: renamed from: l.֨֨ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01EH */
/* JADX INFO: loaded from: classes2.dex */
public final class C0787 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f3366;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f3367;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C15606[] f3368;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f3369;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f3370;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f3371;

    public C0787(int i, int i2, String str, C15606[] c15606Arr, int i3, int i4) {
        this.f3371 = i;
        this.f3370 = i2;
        this.f3366 = str;
        this.f3368 = c15606Arr;
        this.f3369 = i3;
        this.f3367 = i4;
    }

    public C0787(C16435 c16435, int i, int i2) {
        if (c16435.mo25185()) {
            this.f3371 = 1;
            this.f3370 = -1;
            this.f3366 = c16435.mo25187().getValue();
            this.f3368 = c16435.mo25187().mo11446();
        } else if (c16435.mo25189()) {
            this.f3371 = 2;
            this.f3370 = c16435.getValue();
            this.f3366 = null;
            this.f3368 = null;
        } else if (c16435.mo25191()) {
            this.f3371 = 3;
            this.f3370 = c16435.getValue();
            this.f3366 = null;
            this.f3368 = null;
        } else {
            throw new RuntimeException();
        }
        this.f3369 = i;
        this.f3367 = i2;
    }

    public C0787(int i, int i2, int i3) {
        this.f3371 = 0;
        this.f3370 = i;
        this.f3366 = null;
        this.f3368 = null;
        this.f3369 = i2;
        this.f3367 = i3;
    }
}
