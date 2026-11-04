package l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩶ۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7K0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21198 implements InterfaceC8665 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8002 f67674;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21813 f67675;

    @Override // l.InterfaceC8665
    public final Object fileKey() {
        return null;
    }

    @Override // l.InterfaceC8665
    public final boolean isOther() {
        return false;
    }

    @Override // l.InterfaceC8665
    public final boolean isSymbolicLink() {
        return false;
    }

    public C21198(C8002 c8002) {
        this.f67674 = c8002;
        this.f67675 = C21813.from(c8002.getTime(), TimeUnit.MILLISECONDS);
    }

    @Override // l.InterfaceC8665
    public final C21813 lastModifiedTime() {
        return this.f67675;
    }

    @Override // l.InterfaceC8665
    public final C21813 lastAccessTime() {
        return this.f67675;
    }

    @Override // l.InterfaceC8665
    public final C21813 creationTime() {
        return this.f67675;
    }

    @Override // l.InterfaceC8665
    public final boolean isRegularFile() {
        return !this.f67674.isDirectory();
    }

    @Override // l.InterfaceC8665
    public final boolean isDirectory() {
        return this.f67674.isDirectory();
    }

    @Override // l.InterfaceC8665
    public final long size() {
        return this.f67674.getSize();
    }
}
