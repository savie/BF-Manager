package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۧ᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: R2RY */
/* JADX INFO: loaded from: classes4.dex */
public final class C11286 implements InterfaceC7945 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC7945 f38111;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23986 f38112;

    public C11286(C23986 c23986, InterfaceC7945 interfaceC7945) {
        this.f38112 = c23986;
        this.f38111 = interfaceC7945;
    }

    @Override // l.InterfaceC7945
    /* JADX INFO: renamed from: ֨ */
    public final int mo11507() {
        return this.f38111.mo11507();
    }

    @Override // l.InterfaceC7945
    /* JADX INFO: renamed from: ۘ */
    public final Iterable mo11508() {
        return new C17719(this.f38111.mo11508(), this.f38112.f77746.m29864());
    }

    @Override // l.InterfaceC7945
    /* JADX INFO: renamed from: ۬ */
    public final List mo11511() {
        return new C14898(this.f38112.f77746.m29865(), this.f38111.mo11511());
    }

    @Override // l.InterfaceC7945
    /* JADX INFO: renamed from: ۜ */
    public final Iterable mo11510() {
        return new C17719(this.f38111.mo11510(), this.f38112.f77746.m29863());
    }
}
