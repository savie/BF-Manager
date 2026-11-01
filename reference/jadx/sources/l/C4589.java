package l;

/* JADX INFO: renamed from: l.ۙۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4589 implements InterfaceC20735 {
    public final C16502 a;
    public final C16502 b;
    public final C16502 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final Object i;

    public C4589(C16502 c16502, C16502 c16503, C16502 c16504, boolean z, boolean z2, boolean z3, boolean z4, long j, Object obj) {
        this.a = c16502;
        this.b = c16503;
        this.c = c16504;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = j;
        this.i = obj;
    }

    @Override // l.InterfaceC20735
    public final C16502 lastModifiedTime() {
        return this.a;
    }

    @Override // l.InterfaceC20735
    public final C16502 lastAccessTime() {
        return this.b;
    }

    @Override // l.InterfaceC20735
    public final C16502 creationTime() {
        return this.c;
    }

    @Override // l.InterfaceC20735
    public final boolean isRegularFile() {
        return this.d;
    }

    @Override // l.InterfaceC20735
    public final boolean isDirectory() {
        return this.e;
    }

    @Override // l.InterfaceC20735
    public final boolean isSymbolicLink() {
        return this.f;
    }

    @Override // l.InterfaceC20735
    public final boolean isOther() {
        return this.g;
    }

    @Override // l.InterfaceC20735
    public final long size() {
        return this.h;
    }

    @Override // l.InterfaceC20735
    public final Object fileKey() {
        return this.i;
    }
}
