package l;

/* JADX INFO: renamed from: l.᩵ۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBHJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19446 implements InterfaceC23181 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f62610;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7451 f62611;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C4129 f62612;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f62613;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f62614;

    public C19446(int i, int i2, int i3, C4129 c4129, C7451 c7451) {
        if (i < 0) {
            throw new IllegalArgumentException("label < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        if (i3 <= i2) {
            throw new IllegalArgumentException("end <= start");
        }
        int size = c4129.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (c4129.get(i4) < 0) {
                StringBuilder sbM40153 = C17214.m40153(i4, "successors[", "] == ");
                sbM40153.append(c4129.get(i4));
                throw new IllegalArgumentException(sbM40153.toString());
            }
        }
        if (c7451 == null) {
            throw new NullPointerException("catches == null");
        }
        this.f62613 = i;
        this.f62610 = i2;
        this.f62614 = i3;
        this.f62612 = c4129;
        this.f62611 = c7451;
    }

    public final String toString() {
        return "{" + C22475.m49982(this.f62613) + ": " + C22475.m49982(this.f62610) + ".." + C22475.m49982(this.f62614) + '}';
    }

    @Override // l.InterfaceC23181
    /* JADX INFO: renamed from: ۙ */
    public final int mo29913() {
        return this.f62613;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m44491() {
        return this.f62610;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m44493() {
        return this.f62614;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C4129 m44492() {
        return this.f62612;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7451 m44494() {
        return this.f62611;
    }
}
