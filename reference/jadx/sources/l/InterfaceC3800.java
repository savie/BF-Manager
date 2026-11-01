package l;

import java.io.File;
import java.net.URI;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3800 extends Comparable, Iterable, InterfaceC16750 {
    int compareTo(InterfaceC3800 interfaceC3800);

    boolean endsWith(String str);

    boolean endsWith(InterfaceC3800 interfaceC3800);

    boolean equals(Object obj);

    InterfaceC3800 getFileName();

    AbstractC3178 getFileSystem();

    InterfaceC3800 getName(int i);

    int getNameCount();

    InterfaceC3800 getParent();

    InterfaceC3800 getRoot();

    int hashCode();

    boolean isAbsolute();

    @Override // java.lang.Iterable
    Iterator iterator();

    InterfaceC3800 normalize();

    @Override // l.InterfaceC16750
    InterfaceC19324 register(InterfaceC8741 interfaceC8741, InterfaceC18618... interfaceC18618Arr);

    @Override // l.InterfaceC16750
    InterfaceC19324 register(InterfaceC8741 interfaceC8741, InterfaceC18618[] interfaceC18618Arr, InterfaceC8035... interfaceC8035Arr);

    InterfaceC3800 relativize(InterfaceC3800 interfaceC3800);

    InterfaceC3800 resolve(String str);

    InterfaceC3800 resolve(InterfaceC3800 interfaceC3800);

    InterfaceC3800 resolveSibling(String str);

    InterfaceC3800 resolveSibling(InterfaceC3800 interfaceC3800);

    boolean startsWith(String str);

    boolean startsWith(InterfaceC3800 interfaceC3800);

    InterfaceC3800 subpath(int i, int i2);

    InterfaceC3800 toAbsolutePath();

    File toFile();

    InterfaceC3800 toRealPath(EnumC22146... enumC22146Arr);

    String toString();

    URI toUri();
}
