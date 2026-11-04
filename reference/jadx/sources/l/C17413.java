package l;

import android.graphics.Path;

/* JADX INFO: renamed from: l.ܽۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes5.dex */
public final class C17413 implements InterfaceC8332 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f56610;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Path f56611 = new Path();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f56612;

    public C17413(C2366 c2366) {
        if (c2366 == null) {
            return;
        }
        c2366.m8041(this);
    }

    @Override // l.InterfaceC8332
    /* JADX INFO: renamed from: ۙ */
    public final void mo8037(float f, float f2) {
        this.f56611.moveTo(f, f2);
        this.f56610 = f;
        this.f56612 = f2;
    }

    @Override // l.InterfaceC8332
    /* JADX INFO: renamed from: ᩷ */
    public final void mo8042(float f, float f2) {
        this.f56611.lineTo(f, f2);
        this.f56610 = f;
        this.f56612 = f2;
    }

    @Override // l.InterfaceC8332
    /* JADX INFO: renamed from: ۙ */
    public final void mo8039(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f56611.cubicTo(f, f2, f3, f4, f5, f6);
        this.f56610 = f5;
        this.f56612 = f6;
    }

    @Override // l.InterfaceC8332
    /* JADX INFO: renamed from: ۙ */
    public final void mo8038(float f, float f2, float f3, float f4) {
        this.f56611.quadTo(f, f2, f3, f4);
        this.f56610 = f3;
        this.f56612 = f4;
    }

    @Override // l.InterfaceC8332
    /* JADX INFO: renamed from: ۙ */
    public final void mo8040(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        C3989.m12868(this.f56610, this.f56612, f, f2, f3, z, z2, f4, f5, this);
        this.f56610 = f4;
        this.f56612 = f5;
    }

    @Override // l.InterfaceC8332
    public final void close() {
        this.f56611.close();
    }
}
