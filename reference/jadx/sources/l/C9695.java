package l;

import java.io.File;
import java.net.URI;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۢܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C9695 implements InterfaceC3800, InterfaceC16585 {
    public final /* synthetic */ Path a;

    public /* synthetic */ C9695(Path path) {
        this.a = path;
    }

    public static /* synthetic */ InterfaceC3800 l(Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof C3343 ? ((C3343) path).a : new C9695(path);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo(AbstractC1726.p(obj));
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ int compareTo(InterfaceC3800 interfaceC3800) {
        return this.a.compareTo(C3343.l(interfaceC3800));
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ boolean endsWith(String str) {
        return this.a.endsWith(str);
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ boolean endsWith(InterfaceC3800 interfaceC3800) {
        return this.a.endsWith(C3343.l(interfaceC3800));
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ boolean equals(Object obj) {
        Path path = this.a;
        if (obj instanceof C9695) {
            obj = ((C9695) obj).a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable, l.InterfaceC16585
    public final /* synthetic */ void forEach(Consumer consumer) {
        C0356.forEach(this.a, consumer);
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ InterfaceC3800 getFileName() {
        return l(this.a.getFileName());
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ AbstractC3178 getFileSystem() {
        return C2077.b(this.a.getFileSystem());
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ InterfaceC3800 getName(int i) {
        return l(this.a.getName(i));
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ int getNameCount() {
        return this.a.getNameCount();
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ InterfaceC3800 getParent() {
        return l(this.a.getParent());
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ InterfaceC3800 getRoot() {
        return l(this.a.getRoot());
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ boolean isAbsolute() {
        return this.a.isAbsolute();
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ InterfaceC3800 normalize() {
        return l(this.a.normalize());
    }

    @Override // l.InterfaceC3800, l.InterfaceC16750
    public final /* synthetic */ InterfaceC19324 register(InterfaceC8741 interfaceC8741, InterfaceC18618[] interfaceC18618Arr) {
        return C21688.a(this.a.register(C10400.b(interfaceC8741), AbstractC1726.L(interfaceC18618Arr)));
    }

    @Override // l.InterfaceC3800, l.InterfaceC16750
    public final /* synthetic */ InterfaceC19324 register(InterfaceC8741 interfaceC8741, InterfaceC18618[] interfaceC18618Arr, InterfaceC8035[] interfaceC8035Arr) {
        return C21688.a(this.a.register(C10400.b(interfaceC8741), AbstractC1726.L(interfaceC18618Arr), AbstractC1726.M(interfaceC8035Arr)));
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ InterfaceC3800 relativize(InterfaceC3800 interfaceC3800) {
        return l(this.a.relativize(C3343.l(interfaceC3800)));
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ InterfaceC3800 resolve(String str) {
        return l(this.a.resolve(str));
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ InterfaceC3800 resolve(InterfaceC3800 interfaceC3800) {
        return l(this.a.resolve(C3343.l(interfaceC3800)));
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ InterfaceC3800 resolveSibling(String str) {
        return l(this.a.resolveSibling(str));
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ InterfaceC3800 resolveSibling(InterfaceC3800 interfaceC3800) {
        return l(this.a.resolveSibling(C3343.l(interfaceC3800)));
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return C7287.convert(spliterator());
    }

    @Override // java.lang.Iterable, l.InterfaceC16585, l.InterfaceC10441, java.util.Set, l.InterfaceC22810
    public final /* synthetic */ InterfaceC20693 spliterator() {
        return C12696.a(this.a.spliterator());
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ boolean startsWith(String str) {
        return this.a.startsWith(str);
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ boolean startsWith(InterfaceC3800 interfaceC3800) {
        return this.a.startsWith(C3343.l(interfaceC3800));
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ InterfaceC3800 subpath(int i, int i2) {
        return l(this.a.subpath(i, i2));
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ InterfaceC3800 toAbsolutePath() {
        return l(this.a.toAbsolutePath());
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ File toFile() {
        return this.a.toFile();
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ InterfaceC3800 toRealPath(EnumC22146[] enumC22146Arr) {
        return l(this.a.toRealPath(AbstractC1726.K(enumC22146Arr)));
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }

    @Override // l.InterfaceC3800
    public final /* synthetic */ URI toUri() {
        return this.a.toUri();
    }

    @Override // l.InterfaceC3800, java.lang.Iterable
    public final Iterator iterator() {
        return new C10152(this.a.iterator());
    }
}
