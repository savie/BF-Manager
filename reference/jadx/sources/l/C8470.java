package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.۠᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1MK */
/* JADX INFO: loaded from: classes3.dex */
public final class C8470 implements InterfaceC19053 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f29372;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f29373;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f29374;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f29375;

    public C8470(int i, int i2, int i3, int i4) {
        this.f29374 = i;
        this.f29373 = i2;
        this.f29372 = i3;
        this.f29375 = i4;
        if (i == i2 && i3 == i4) {
            System.err.println("DiffFragmentImpl should not be empty: " + toString());
        }
        if (this.f29374 > this.f29373 || this.f29372 > this.f29375) {
            System.err.println("DiffFragmentImpl is invalid: " + toString());
        }
    }

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo22127(boolean z) {
        return z ? mo22124() : mo22129();
    }

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo22131(boolean z) {
        return z ? mo22126() : mo22123();
    }

    public C8470(C17367 c17367) {
        this.f29374 = c17367.readInt();
        this.f29373 = c17367.readInt();
        this.f29372 = c17367.readInt();
        this.f29375 = c17367.readInt();
    }

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo22134(int i, boolean z) {
        if (z) {
            mo22130(i);
        } else {
            mo22135(i);
        }
    }

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int mo22124() {
        return this.f29374;
    }

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo22125(int i, boolean z) {
        if (z) {
            mo22132(i);
        } else {
            mo22133(i);
        }
    }

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo22126() {
        return this.f29373;
    }

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int mo22129() {
        return this.f29372;
    }

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int mo22123() {
        return this.f29375;
    }

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo22130(int i) {
        this.f29374 = i;
    }

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo22132(int i) {
        this.f29373 = i;
    }

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void mo22135(int i) {
        this.f29372 = i;
    }

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo22133(int i) {
        this.f29375 = i;
    }

    @Override // l.InterfaceC19053
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo22128(C11018 c11018) {
        c11018.writeInt(this.f29374);
        c11018.writeInt(this.f29373);
        c11018.writeInt(this.f29372);
        c11018.writeInt(this.f29375);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiffFragmentImpl [");
        sb.append(this.f29374);
        sb.append(", ");
        sb.append(this.f29373);
        sb.append(") - [");
        sb.append(this.f29372);
        sb.append(", ");
        return C12441.m30911(this.f29375, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }
}
