package l;

import java.io.File;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3343 implements Path {
    public final /* synthetic */ InterfaceC3800 a;

    public /* synthetic */ C3343(InterfaceC3800 interfaceC3800) {
        this.a = interfaceC3800;
    }

    public static /* synthetic */ Path l(InterfaceC3800 interfaceC3800) {
        if (interfaceC3800 == null) {
            return null;
        }
        return interfaceC3800 instanceof C9695 ? ((C9695) interfaceC3800).a : new C3343(interfaceC3800);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Path path) {
        return this.a.compareTo(AbstractC1726.p(path));
    }

    @Override // java.nio.file.Path
    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public final /* synthetic */ int compareTo2(Path path) {
        return this.a.compareTo(C9695.l(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.a.endsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(Path path) {
        return this.a.endsWith(C9695.l(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC3800 interfaceC3800 = this.a;
        if (obj instanceof C3343) {
            obj = ((C3343) obj).a;
        }
        return interfaceC3800.equals(obj);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(Consumer<? super Path> consumer) {
        C0356.forEach(this.a, consumer);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path getFileName() {
        return l(this.a.getFileName());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ FileSystem getFileSystem() {
        return C3488.b(this.a.getFileSystem());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path getName(int i) {
        return l(this.a.getName(i));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.a.getNameCount();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path getParent() {
        return l(this.a.getParent());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path getRoot() {
        return l(this.a.getRoot());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.a.isAbsolute();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path normalize() {
        return l(this.a.normalize());
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr) {
        return C18866.a(this.a.register(C19572.b(watchService), AbstractC1726.G(kindArr)));
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr, WatchEvent.Modifier[] modifierArr) {
        return C18866.a(this.a.register(C19572.b(watchService), AbstractC1726.G(kindArr), AbstractC1726.H(modifierArr)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path relativize(Path path) {
        return l(this.a.relativize(C9695.l(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path resolve(String str) {
        return l(this.a.resolve(str));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path resolve(Path path) {
        return l(this.a.resolve(C9695.l(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path resolveSibling(String str) {
        return l(this.a.resolveSibling(str));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path resolveSibling(Path path) {
        return l(this.a.resolveSibling(C9695.l(path)));
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator<Path> spliterator() {
        return C7287.convert(C0356.spliterator(this.a));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.a.startsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(Path path) {
        return this.a.startsWith(C9695.l(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path subpath(int i, int i2) {
        return l(this.a.subpath(i, i2));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path toAbsolutePath() {
        return l(this.a.toAbsolutePath());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.a.toFile();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path toRealPath(LinkOption[] linkOptionArr) {
        return l(this.a.toRealPath(AbstractC1726.F(linkOptionArr)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.a.toUri();
    }

    @Override // java.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new C10152(this.a.iterator());
    }
}
