package l;

import android.graphics.Path;

/* JADX INFO: renamed from: l.֨ۤܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes2.dex */
public final class C1059 implements InterfaceC17556 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f4908;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Path f4909 = new Path();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f4910;

    public C1059(C12618 c12618) {
        if (c12618 == null) {
            return;
        }
        c12618.m31404(this);
    }

    @Override // l.InterfaceC17556
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4004(float f, float f2) {
        this.f4909.moveTo(f, f2);
        this.f4908 = f;
        this.f4910 = f2;
    }

    @Override // l.InterfaceC17556
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo4008(float f, float f2) {
        this.f4909.lineTo(f, f2);
        this.f4908 = f;
        this.f4910 = f2;
    }

    @Override // l.InterfaceC17556
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4006(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f4909.cubicTo(f, f2, f3, f4, f5, f6);
        this.f4908 = f5;
        this.f4910 = f6;
    }

    @Override // l.InterfaceC17556
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4005(float f, float f2, float f3, float f4) {
        this.f4909.quadTo(f, f2, f3, f4);
        this.f4908 = f3;
        this.f4910 = f4;
    }

    @Override // l.InterfaceC17556
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4007(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        C18699.m43200(this.f4908, this.f4910, f, f2, f3, z, z2, f4, f5, this);
        this.f4908 = f4;
        this.f4910 = f5;
    }

    @Override // l.InterfaceC17556
    public final void close() {
        this.f4909.close();
    }
}
