package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۖ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1MK */
/* JADX INFO: loaded from: classes3.dex */
public final class C3000 implements InterfaceC9711 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f9756;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f9757;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f9758;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f9759;

    public C3000(int i, int i2, int i3, int i4) {
        this.f9757 = i;
        this.f9756 = i2;
        this.f9759 = i3;
        this.f9758 = i4;
        if (i == i2 && i3 == i4) {
            System.err.println("DiffFragmentImpl should not be empty: " + toString());
        }
        if (this.f9757 > this.f9756 || this.f9759 > this.f9758) {
            System.err.println("DiffFragmentImpl is invalid: " + toString());
        }
    }

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo9797(boolean z) {
        return z ? mo9807() : mo9803();
    }

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int mo9799(boolean z) {
        return z ? mo9796() : mo9801();
    }

    public C3000(C20348 c20348) {
        this.f9757 = c20348.readInt();
        this.f9756 = c20348.readInt();
        this.f9759 = c20348.readInt();
        this.f9758 = c20348.readInt();
    }

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo9806(int i, boolean z) {
        if (z) {
            mo9804(i);
        } else {
            mo9802(i);
        }
    }

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int mo9807() {
        return this.f9757;
    }

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo9808(int i, boolean z) {
        if (z) {
            mo9800(i);
        } else {
            mo9805(i);
        }
    }

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo9796() {
        return this.f9756;
    }

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int mo9803() {
        return this.f9759;
    }

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int mo9801() {
        return this.f9758;
    }

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo9804(int i) {
        this.f9757 = i;
    }

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo9800(int i) {
        this.f9756 = i;
    }

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo9802(int i) {
        this.f9759 = i;
    }

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo9805(int i) {
        this.f9758 = i;
    }

    @Override // l.InterfaceC9711
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9798(C6178 c6178) {
        c6178.writeInt(this.f9757);
        c6178.writeInt(this.f9756);
        c6178.writeInt(this.f9759);
        c6178.writeInt(this.f9758);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiffFragmentImpl [");
        sb.append(this.f9757);
        sb.append(", ");
        sb.append(this.f9756);
        sb.append(") - [");
        sb.append(this.f9759);
        sb.append(", ");
        return C12669.m31437(this.f9758, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }
}
