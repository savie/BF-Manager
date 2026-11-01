package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۢ۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: G1V7 */
/* JADX INFO: loaded from: classes3.dex */
public class C9595 implements InterfaceC7945 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7945 f32333;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11992 f32334;

    public C9595(C11992 c11992, InterfaceC7945 interfaceC7945) {
        this.f32334 = c11992;
        this.f32333 = interfaceC7945;
    }

    @Override // l.InterfaceC7945
    /* JADX INFO: renamed from: ֨ */
    public final int mo11507() {
        return this.f32333.mo11507();
    }

    @Override // l.InterfaceC7945
    /* JADX INFO: renamed from: ۬ */
    public final List mo11511() {
        return C15604.m37270((InterfaceC2196) this.f32334.m29865(), this.f32333.mo11511());
    }

    @Override // l.InterfaceC7945
    /* JADX INFO: renamed from: ۜ */
    public final Iterable mo11510() {
        return C15604.m37268(this.f32333.mo11510(), this.f32334.m29863());
    }
}
