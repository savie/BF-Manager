package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۢܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1XZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9660 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC3384 f32480;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f32481;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24562(int i, List list) {
        AbstractC3384 abstractC3384 = (AbstractC3384) list.get(i);
        if (!C16467.m38730(abstractC3384)) {
            return false;
        }
        this.f32480 = abstractC3384;
        this.f32481 = ((InterfaceC4685) abstractC3384).mo1140();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24560() {
        return this.f32481;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24561(C20700 c20700) {
        c20700.f67315.m25739(this.f32480);
    }
}
