package l;

/* JADX INFO: renamed from: l.ܺۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16673 implements InterfaceC8665 {
    public final C21813 a;
    public final C21813 b;
    public final C21813 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final Object i;

    public C16673(C21813 c21813, C21813 c21814, C21813 c21815, boolean z, boolean z2, boolean z3, boolean z4, long j, Object obj) {
        this.a = c21813;
        this.b = c21814;
        this.c = c21815;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = j;
        this.i = obj;
    }

    @Override // l.InterfaceC8665
    public final C21813 lastModifiedTime() {
        return this.a;
    }

    @Override // l.InterfaceC8665
    public final C21813 lastAccessTime() {
        return this.b;
    }

    @Override // l.InterfaceC8665
    public final C21813 creationTime() {
        return this.c;
    }

    @Override // l.InterfaceC8665
    public final boolean isRegularFile() {
        return this.d;
    }

    @Override // l.InterfaceC8665
    public final boolean isDirectory() {
        return this.e;
    }

    @Override // l.InterfaceC8665
    public final boolean isSymbolicLink() {
        return this.f;
    }

    @Override // l.InterfaceC8665
    public final boolean isOther() {
        return this.g;
    }

    @Override // l.InterfaceC8665
    public final long size() {
        return this.h;
    }

    @Override // l.InterfaceC8665
    public final Object fileKey() {
        return this.i;
    }
}
