package l;

import java.io.File;
import java.net.URI;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC24329 extends Comparable, Iterable, InterfaceC21987 {
    int compareTo(InterfaceC24329 interfaceC24329);

    boolean endsWith(String str);

    boolean endsWith(InterfaceC24329 interfaceC24329);

    boolean equals(Object obj);

    InterfaceC24329 getFileName();

    AbstractC25075 getFileSystem();

    InterfaceC24329 getName(int i);

    int getNameCount();

    InterfaceC24329 getParent();

    InterfaceC24329 getRoot();

    int hashCode();

    boolean isAbsolute();

    Iterator iterator();

    InterfaceC24329 normalize();

    InterfaceC10156 register(InterfaceC1208 interfaceC1208, InterfaceC7920... interfaceC7920Arr);

    InterfaceC10156 register(InterfaceC1208 interfaceC1208, InterfaceC7920[] interfaceC7920Arr, InterfaceC19107... interfaceC19107Arr);

    InterfaceC24329 relativize(InterfaceC24329 interfaceC24329);

    InterfaceC24329 resolve(String str);

    InterfaceC24329 resolve(InterfaceC24329 interfaceC24329);

    InterfaceC24329 resolveSibling(String str);

    InterfaceC24329 resolveSibling(InterfaceC24329 interfaceC24329);

    boolean startsWith(String str);

    boolean startsWith(InterfaceC24329 interfaceC24329);

    InterfaceC24329 subpath(int i, int i2);

    InterfaceC24329 toAbsolutePath();

    File toFile();

    InterfaceC24329 toRealPath(EnumC20599... enumC20599Arr);

    String toString();

    URI toUri();
}
