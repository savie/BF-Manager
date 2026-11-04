package l;

import java.io.File;
import java.net.URI;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۧۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11544 implements InterfaceC24329, InterfaceC22091 {
    public final /* synthetic */ Path a;

    public /* synthetic */ C11544(Path path) {
        this.a = path;
    }

    public static /* synthetic */ InterfaceC24329 i(Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof C24971 ? ((C24971) path).a : new C11544(path);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo(AbstractC1758.p(obj));
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ int compareTo(InterfaceC24329 interfaceC24329) {
        return this.a.compareTo(C24971.i(interfaceC24329));
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ boolean endsWith(String str) {
        return this.a.endsWith(str);
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ boolean endsWith(InterfaceC24329 interfaceC24329) {
        return this.a.endsWith(C24971.i(interfaceC24329));
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ boolean equals(Object obj) {
        Path path = this.a;
        if (obj instanceof C11544) {
            obj = ((C11544) obj).a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable, l.InterfaceC22091
    public final /* synthetic */ void forEach(Consumer consumer) {
        C4937.forEach(this.a, consumer);
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ InterfaceC24329 getFileName() {
        return i(this.a.getFileName());
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ AbstractC25075 getFileSystem() {
        return C2179.b(this.a.getFileSystem());
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ InterfaceC24329 getName(int i) {
        return i(this.a.getName(i));
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ int getNameCount() {
        return this.a.getNameCount();
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ InterfaceC24329 getParent() {
        return i(this.a.getParent());
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ InterfaceC24329 getRoot() {
        return i(this.a.getRoot());
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ boolean isAbsolute() {
        return this.a.isAbsolute();
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ InterfaceC24329 normalize() {
        return i(this.a.normalize());
    }

    @Override // l.InterfaceC24329, l.InterfaceC21987
    public final /* synthetic */ InterfaceC10156 register(InterfaceC1208 interfaceC1208, InterfaceC7920[] interfaceC7920Arr) {
        return C18586.a(this.a.register(C9635.b(interfaceC1208), AbstractC1758.L(interfaceC7920Arr)));
    }

    @Override // l.InterfaceC24329, l.InterfaceC21987
    public final /* synthetic */ InterfaceC10156 register(InterfaceC1208 interfaceC1208, InterfaceC7920[] interfaceC7920Arr, InterfaceC19107[] interfaceC19107Arr) {
        return C18586.a(this.a.register(C9635.b(interfaceC1208), AbstractC1758.L(interfaceC7920Arr), AbstractC1758.M(interfaceC19107Arr)));
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ InterfaceC24329 relativize(InterfaceC24329 interfaceC24329) {
        return i(this.a.relativize(C24971.i(interfaceC24329)));
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ InterfaceC24329 resolve(String str) {
        return i(this.a.resolve(str));
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ InterfaceC24329 resolve(InterfaceC24329 interfaceC24329) {
        return i(this.a.resolve(C24971.i(interfaceC24329)));
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ InterfaceC24329 resolveSibling(String str) {
        return i(this.a.resolveSibling(str));
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ InterfaceC24329 resolveSibling(InterfaceC24329 interfaceC24329) {
        return i(this.a.resolveSibling(C24971.i(interfaceC24329)));
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    @Override // java.lang.Iterable, l.InterfaceC22091, l.InterfaceC13409
    public final /* synthetic */ InterfaceC8409 spliterator() {
        return C19553.a(this.a.spliterator());
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ boolean startsWith(String str) {
        return this.a.startsWith(str);
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ boolean startsWith(InterfaceC24329 interfaceC24329) {
        return this.a.startsWith(C24971.i(interfaceC24329));
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ InterfaceC24329 subpath(int i, int i2) {
        return i(this.a.subpath(i, i2));
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ InterfaceC24329 toAbsolutePath() {
        return i(this.a.toAbsolutePath());
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ File toFile() {
        return this.a.toFile();
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ InterfaceC24329 toRealPath(EnumC20599[] enumC20599Arr) {
        return i(this.a.toRealPath(AbstractC1758.K(enumC20599Arr)));
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }

    @Override // l.InterfaceC24329
    public final /* synthetic */ URI toUri() {
        return this.a.toUri();
    }

    @Override // l.InterfaceC24329, java.lang.Iterable
    public final Iterator iterator() {
        return new C9410(this.a.iterator());
    }
}
