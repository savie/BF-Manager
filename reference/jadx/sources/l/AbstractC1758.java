package l;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.֫ۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1758 {
    public static /* synthetic */ String A(Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "/");
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ List B(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(C17359.requireNonNull(obj));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ Map.Entry C(Object obj, Object obj2) {
        return new AbstractMap.SimpleImmutableEntry(C17359.requireNonNull(obj), C17359.requireNonNull(obj2));
    }

    public static /* synthetic */ Set D(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            if (!hashSet.add(C17359.requireNonNull(obj))) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static /* synthetic */ boolean E(Unsafe unsafe, Object obj, long j, C9790 c9790) {
        while (!unsafe.compareAndSwapObject(obj, j, (Object) null, c9790)) {
            if (unsafe.getObject(obj, j) != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ EnumC20599[] F(LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        EnumC20599[] enumC20599Arr = new EnumC20599[length];
        for (int i = 0; i < length; i++) {
            enumC20599Arr[i] = linkOptionArr[i] == null ? null : EnumC20599.NOFOLLOW_LINKS;
        }
        return enumC20599Arr;
    }

    public static /* synthetic */ InterfaceC19107[] H(WatchEvent.Modifier[] modifierArr) {
        if (modifierArr == null) {
            return null;
        }
        int length = modifierArr.length;
        InterfaceC19107[] interfaceC19107Arr = new InterfaceC19107[length];
        for (int i = 0; i < length; i++) {
            WatchEvent.Modifier modifier = modifierArr[i];
            interfaceC19107Arr[i] = modifier == null ? null : modifier instanceof C24554 ? ((C24554) modifier).a : new C12619(modifier);
        }
        return interfaceC19107Arr;
    }

    public static /* synthetic */ CopyOption[] J(InterfaceC1954[] interfaceC1954Arr) {
        CopyOption c11127;
        if (interfaceC1954Arr == null) {
            return null;
        }
        int length = interfaceC1954Arr.length;
        CopyOption[] copyOptionArr = new CopyOption[length];
        for (int i = 0; i < length; i++) {
            InterfaceC1954 interfaceC1954 = interfaceC1954Arr[i];
            if (interfaceC1954 == null) {
                c11127 = null;
            } else if (interfaceC1954 instanceof C2699) {
                c11127 = ((C2699) interfaceC1954).a;
            } else if (interfaceC1954 instanceof EnumC20599) {
                c11127 = LinkOption.NOFOLLOW_LINKS;
            } else if (interfaceC1954 instanceof EnumC18361) {
                EnumC18361 enumC18361 = (EnumC18361) interfaceC1954;
                c11127 = enumC18361 == EnumC18361.REPLACE_EXISTING ? StandardCopyOption.REPLACE_EXISTING : enumC18361 == EnumC18361.COPY_ATTRIBUTES ? StandardCopyOption.COPY_ATTRIBUTES : StandardCopyOption.ATOMIC_MOVE;
            } else {
                c11127 = new C11127(interfaceC1954);
            }
            copyOptionArr[i] = c11127;
        }
        return copyOptionArr;
    }

    public static /* synthetic */ LinkOption[] K(EnumC20599[] enumC20599Arr) {
        if (enumC20599Arr == null) {
            return null;
        }
        int length = enumC20599Arr.length;
        LinkOption[] linkOptionArr = new LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr[i] = enumC20599Arr[i] == null ? null : LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr;
    }

    public static /* synthetic */ WatchEvent.Modifier[] M(InterfaceC19107[] interfaceC19107Arr) {
        if (interfaceC19107Arr == null) {
            return null;
        }
        int length = interfaceC19107Arr.length;
        WatchEvent.Modifier[] modifierArr = new WatchEvent.Modifier[length];
        for (int i = 0; i < length; i++) {
            InterfaceC19107 interfaceC19107 = interfaceC19107Arr[i];
            modifierArr[i] = interfaceC19107 == null ? null : interfaceC19107 instanceof C12619 ? ((C12619) interfaceC19107).a : new C24554(interfaceC19107);
        }
        return modifierArr;
    }

    public static /* synthetic */ long O(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    public static /* synthetic */ long P(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long Q(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (iNumberOfLeadingZeros >= 64) {
            if ((j >= 0) | (j2 != Long.MIN_VALUE)) {
                long j3 = j * j2;
                if (j == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long R(long j, long j2) {
        long j3 = j - j2;
        if (((j2 ^ j) >= 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ StandardOpenOption n(EnumC0462 enumC0462) {
        if (enumC0462 == null) {
            return null;
        }
        if (enumC0462 == EnumC0462.READ) {
            return StandardOpenOption.READ;
        }
        if (enumC0462 == EnumC0462.WRITE) {
            return StandardOpenOption.WRITE;
        }
        if (enumC0462 == EnumC0462.APPEND) {
            return StandardOpenOption.APPEND;
        }
        if (enumC0462 == EnumC0462.TRUNCATE_EXISTING) {
            return StandardOpenOption.TRUNCATE_EXISTING;
        }
        if (enumC0462 == EnumC0462.CREATE) {
            return StandardOpenOption.CREATE;
        }
        if (enumC0462 == EnumC0462.CREATE_NEW) {
            return StandardOpenOption.CREATE_NEW;
        }
        if (enumC0462 == EnumC0462.DELETE_ON_CLOSE) {
            return StandardOpenOption.DELETE_ON_CLOSE;
        }
        if (enumC0462 == EnumC0462.SPARSE) {
            return StandardOpenOption.SPARSE;
        }
        return enumC0462 == EnumC0462.SYNC ? StandardOpenOption.SYNC : StandardOpenOption.DSYNC;
    }

    public static /* synthetic */ int y(long j) {
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long z(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    public static C21813 m(FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        return C21813.fromMillis(fileTime.toMillis());
    }

    public static WatchEvent.Kind[] L(InterfaceC7920[] interfaceC7920Arr) {
        WatchEvent.Kind c3670;
        if (interfaceC7920Arr == null) {
            return null;
        }
        int length = interfaceC7920Arr.length;
        WatchEvent.Kind[] kindArr = new WatchEvent.Kind[length];
        for (int i = 0; i < length; i++) {
            InterfaceC7920 interfaceC7920 = interfaceC7920Arr[i];
            if (interfaceC7920 == null) {
                c3670 = null;
            } else if (interfaceC7920 == AbstractC5908.b) {
                c3670 = StandardWatchEventKinds.ENTRY_CREATE;
            } else if (interfaceC7920 == AbstractC5908.c) {
                c3670 = StandardWatchEventKinds.ENTRY_DELETE;
            } else if (interfaceC7920 == AbstractC5908.d) {
                c3670 = StandardWatchEventKinds.ENTRY_MODIFY;
            } else if (interfaceC7920 == AbstractC5908.a) {
                c3670 = StandardWatchEventKinds.OVERFLOW;
            } else {
                c3670 = interfaceC7920 instanceof C16348 ? ((C16348) interfaceC7920).a : new C3670(interfaceC7920);
            }
            kindArr[i] = c3670;
        }
        return kindArr;
    }

    public static Class r(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == BasicFileAttributes.class) {
            return InterfaceC8665.class;
        }
        if (cls == InterfaceC8665.class) {
            return BasicFileAttributes.class;
        }
        if (cls == PosixFileAttributes.class) {
            return InterfaceC10624.class;
        }
        if (cls == InterfaceC10624.class) {
            return PosixFileAttributes.class;
        }
        if (cls == C6151.class) {
            return DosFileAttributes.class;
        }
        if (cls == DosFileAttributes.class) {
            return C6151.class;
        }
        C16041.a(cls, "java.nio.file.attribute.BasicFileAttributes");
        throw null;
    }

    public static FileTime o(C21813 c21813) {
        if (c21813 == null) {
            return null;
        }
        return FileTime.fromMillis(c21813.toMillis());
    }

    public static InterfaceC13885[] I(FileAttribute[] fileAttributeArr) {
        InterfaceC13885 c24051;
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        InterfaceC13885[] interfaceC13885Arr = new InterfaceC13885[length];
        for (int i = 0; i < length; i++) {
            FileAttribute fileAttribute = fileAttributeArr[i];
            if (fileAttribute == null) {
                c24051 = null;
            } else if (x(fileAttribute.value())) {
                c24051 = new C3249(3, fileAttribute);
            } else {
                c24051 = fileAttribute instanceof C3913 ? ((C3913) fileAttribute).a : new C24051(fileAttribute);
            }
            interfaceC13885Arr[i] = c24051;
        }
        return interfaceC13885Arr;
    }

    public static InterfaceC7920[] G(WatchEvent.Kind[] kindArr) {
        InterfaceC7920 c16348;
        if (kindArr == null) {
            return null;
        }
        int length = kindArr.length;
        InterfaceC7920[] interfaceC7920Arr = new InterfaceC7920[length];
        for (int i = 0; i < length; i++) {
            WatchEvent.Kind kind = kindArr[i];
            if (kind == null) {
                c16348 = null;
            } else if (kind == StandardWatchEventKinds.ENTRY_CREATE) {
                c16348 = AbstractC5908.b;
            } else if (kind == StandardWatchEventKinds.ENTRY_DELETE) {
                c16348 = AbstractC5908.c;
            } else if (kind == StandardWatchEventKinds.ENTRY_MODIFY) {
                c16348 = AbstractC5908.d;
            } else if (kind == StandardWatchEventKinds.OVERFLOW) {
                c16348 = AbstractC5908.a;
            } else {
                c16348 = kind instanceof C3670 ? ((C3670) kind).a : new C16348(kind);
            }
            interfaceC7920Arr[i] = c16348;
        }
        return interfaceC7920Arr;
    }

    public static Object p(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof InterfaceC24329) {
            return C24971.i((InterfaceC24329) obj);
        }
        return obj instanceof Path ? C11544.i((Path) obj) : obj;
    }

    public static char S(String str, int i) {
        if (i < str.length()) {
            return str.charAt(i);
        }
        return (char) 0;
    }

    public static Class q(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == BasicFileAttributeView.class) {
            return InterfaceC15845.class;
        }
        if (cls == InterfaceC15845.class) {
            return BasicFileAttributeView.class;
        }
        if (cls == PosixFileAttributeView.class) {
            return C2421.class;
        }
        if (cls == C2421.class) {
            return PosixFileAttributeView.class;
        }
        if (cls == FileOwnerAttributeView.class) {
            return InterfaceC18829.class;
        }
        if (cls == InterfaceC18829.class) {
            return FileOwnerAttributeView.class;
        }
        if (cls == InterfaceC7174.class) {
            return DosFileAttributeView.class;
        }
        if (cls == DosFileAttributeView.class) {
            return InterfaceC7174.class;
        }
        if (cls == C13607.class) {
            return UserDefinedFileAttributeView.class;
        }
        if (cls == UserDefinedFileAttributeView.class) {
            return C13607.class;
        }
        if (cls == C12862.class) {
            return AclFileAttributeView.class;
        }
        if (cls == AclFileAttributeView.class) {
            return C12862.class;
        }
        C16041.a(cls, "java.nio.file.attribute.FileAttributeView");
        throw null;
    }

    public static FileAttribute[] N(InterfaceC13885[] interfaceC13885Arr) {
        FileAttribute c3913;
        if (interfaceC13885Arr == null) {
            return null;
        }
        int length = interfaceC13885Arr.length;
        FileAttribute[] fileAttributeArr = new FileAttribute[length];
        for (int i = 0; i < length; i++) {
            InterfaceC13885 interfaceC13885 = interfaceC13885Arr[i];
            if (interfaceC13885 == null) {
                c3913 = null;
            } else if (x(interfaceC13885.value())) {
                c3913 = new C14353(interfaceC13885);
            } else {
                c3913 = interfaceC13885 instanceof C24051 ? ((C24051) interfaceC13885).a : new C3913(interfaceC13885);
            }
            fileAttributeArr[i] = c3913;
        }
        return fileAttributeArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    public static RuntimeException U(String str, Integer... numArr) {
        int i;
        String strConcat;
        List listB = B(numArr);
        if (listB == null) {
            strConcat = "Range check failed: ".concat(str);
        } else {
            switch (str) {
                case "checkIndex":
                    i = 2;
                    break;
                case "checkFromToIndex":
                case "checkFromIndexSize":
                    i = 3;
                    break;
                default:
                    i = 0;
                    break;
            }
            switch (listB.size() != i ? "" : str) {
                case "checkIndex":
                    strConcat = String.format("Index %d out of bounds for length %d", listB.get(0), listB.get(1));
                    break;
                case "checkFromToIndex":
                    strConcat = String.format("Range [%d, %d) out of bounds for length %d", listB.get(0), listB.get(1), listB.get(2));
                    break;
                case "checkFromIndexSize":
                    strConcat = String.format("Range [%d, %<d + %d) out of bounds for length %d", listB.get(0), listB.get(1), listB.get(2));
                    break;
                default:
                    strConcat = String.format("Range check failed: %s %s", str, listB);
                    break;
            }
        }
        return new IndexOutOfBoundsException(strConcat);
    }

    public static boolean x(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.isEmpty()) {
            return false;
        }
        Object next = set.iterator().next();
        return (next instanceof EnumC22559) || (next instanceof PosixFilePermission);
    }

    public static FileChannel T(InterfaceC24329 interfaceC24329, Set set) throws IOException {
        String str;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC12394) it.next()).getClass();
        }
        if (interfaceC24329.toFile().exists()) {
            if (set.contains(EnumC0462.CREATE_NEW) && set.contains(EnumC0462.WRITE)) {
                throw new FileAlreadyExistsException(interfaceC24329.toString());
            }
        } else if (!set.contains(EnumC0462.CREATE) && !set.contains(EnumC0462.CREATE_NEW)) {
            throw new NoSuchFileException(interfaceC24329.toString());
        }
        if (set.contains(EnumC0462.READ) && set.contains(EnumC0462.APPEND)) {
            throw new IllegalArgumentException("READ + APPEND not allowed");
        }
        EnumC0462 enumC0462 = EnumC0462.APPEND;
        if (set.contains(enumC0462) && set.contains(EnumC0462.TRUNCATE_EXISTING)) {
            throw new IllegalArgumentException("APPEND + TRUNCATE_EXISTING not allowed");
        }
        File file = interfaceC24329.toFile();
        EnumC0462 enumC0463 = EnumC0462.WRITE;
        if (!set.contains(enumC0463) && !set.contains(enumC0462)) {
            str = "r";
        } else if (set.contains(EnumC0462.SYNC)) {
            str = "rws";
        } else {
            str = set.contains(EnumC0462.DSYNC) ? "rwd" : "rw";
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, str);
        if (set.contains(EnumC0462.TRUNCATE_EXISTING) && set.contains(enumC0463)) {
            randomAccessFile.setLength(0L);
        }
        if (!set.contains(enumC0462) && !set.contains(EnumC0462.DELETE_ON_CLOSE)) {
            return C19853.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        }
        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = C19853.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        int i = C15927.e;
        if (fileChannelConvertMaybeLegacyFileChannelFromLibrary instanceof C15927) {
            fileChannelConvertMaybeLegacyFileChannelFromLibrary = ((C15927) fileChannelConvertMaybeLegacyFileChannelFromLibrary).a;
        }
        return new C15927(fileChannelConvertMaybeLegacyFileChannelFromLibrary, set.contains(EnumC0462.DELETE_ON_CLOSE), set.contains(enumC0462), interfaceC24329);
    }

    public static Set u(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof InterfaceC12394) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(C5579.a((InterfaceC12394) it.next()));
                } catch (ClassCastException e) {
                    C16041.a(e, "java.nio.file.OpenOption");
                    throw null;
                }
            }
        } else {
            if (!(next instanceof OpenOption)) {
                C16041.a(next.getClass(), "java.nio.file.OpenOption");
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    hashSet.add(C10798.a((OpenOption) it2.next()));
                } catch (ClassCastException e2) {
                    C16041.a(e2, "java.nio.file.OpenOption");
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static Object t(Object obj) {
        if (obj instanceof FileTime) {
            try {
                return m((FileTime) obj);
            } catch (ClassCastException e) {
                C16041.a(e, "java.nio.file.attribute.FileTime");
                throw null;
            }
        }
        if (!(obj instanceof C21813)) {
            return obj;
        }
        try {
            return o((C21813) obj);
        } catch (ClassCastException e2) {
            C16041.a(e2, "java.nio.file.attribute.FileTime");
            throw null;
        }
    }

    public static Map s(Map map) {
        if (map == null || map.isEmpty()) {
            return map;
        }
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            map2.put(str, t(map.get(str)));
        }
        return map2;
    }

    public static Set v(Set set) {
        EnumC22559 enumC22559;
        PosixFilePermission posixFilePermission;
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof EnumC22559) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    EnumC22559 enumC225510 = (EnumC22559) it.next();
                    if (enumC225510 == null) {
                        posixFilePermission = null;
                    } else if (enumC225510 == EnumC22559.OWNER_READ) {
                        posixFilePermission = PosixFilePermission.OWNER_READ;
                    } else if (enumC225510 == EnumC22559.OWNER_WRITE) {
                        posixFilePermission = PosixFilePermission.OWNER_WRITE;
                    } else if (enumC225510 == EnumC22559.OWNER_EXECUTE) {
                        posixFilePermission = PosixFilePermission.OWNER_EXECUTE;
                    } else if (enumC225510 == EnumC22559.GROUP_READ) {
                        posixFilePermission = PosixFilePermission.GROUP_READ;
                    } else if (enumC225510 == EnumC22559.GROUP_WRITE) {
                        posixFilePermission = PosixFilePermission.GROUP_WRITE;
                    } else if (enumC225510 == EnumC22559.GROUP_EXECUTE) {
                        posixFilePermission = PosixFilePermission.GROUP_EXECUTE;
                    } else if (enumC225510 == EnumC22559.OTHERS_READ) {
                        posixFilePermission = PosixFilePermission.OTHERS_READ;
                    } else {
                        posixFilePermission = enumC225510 == EnumC22559.OTHERS_WRITE ? PosixFilePermission.OTHERS_WRITE : PosixFilePermission.OTHERS_EXECUTE;
                    }
                    hashSet.add(posixFilePermission);
                } catch (ClassCastException e) {
                    C16041.a(e, "java.nio.file.attribute.PosixFilePermission");
                    throw null;
                }
            }
        } else {
            if (!(next instanceof PosixFilePermission)) {
                C16041.a(next.getClass(), "java.nio.file.attribute.PosixFilePermission");
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    PosixFilePermission posixFilePermission2 = (PosixFilePermission) it2.next();
                    if (posixFilePermission2 == null) {
                        enumC22559 = null;
                    } else if (posixFilePermission2 == PosixFilePermission.OWNER_READ) {
                        enumC22559 = EnumC22559.OWNER_READ;
                    } else if (posixFilePermission2 == PosixFilePermission.OWNER_WRITE) {
                        enumC22559 = EnumC22559.OWNER_WRITE;
                    } else if (posixFilePermission2 == PosixFilePermission.OWNER_EXECUTE) {
                        enumC22559 = EnumC22559.OWNER_EXECUTE;
                    } else if (posixFilePermission2 == PosixFilePermission.GROUP_READ) {
                        enumC22559 = EnumC22559.GROUP_READ;
                    } else if (posixFilePermission2 == PosixFilePermission.GROUP_WRITE) {
                        enumC22559 = EnumC22559.GROUP_WRITE;
                    } else if (posixFilePermission2 == PosixFilePermission.GROUP_EXECUTE) {
                        enumC22559 = EnumC22559.GROUP_EXECUTE;
                    } else if (posixFilePermission2 == PosixFilePermission.OTHERS_READ) {
                        enumC22559 = EnumC22559.OTHERS_READ;
                    } else {
                        enumC22559 = posixFilePermission2 == PosixFilePermission.OTHERS_WRITE ? EnumC22559.OTHERS_WRITE : EnumC22559.OTHERS_EXECUTE;
                    }
                    hashSet.add(enumC22559);
                } catch (ClassCastException e2) {
                    C16041.a(e2, "java.nio.file.attribute.PosixFilePermission");
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static int e(InterfaceC5930 interfaceC5930, InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            int i = AbstractC8167.a[((EnumC8692) interfaceC16831).ordinal()];
            if (i == 1) {
                throw new C16085("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return interfaceC5930.getOffset().getTotalSeconds();
            }
            return interfaceC5930.q().i(interfaceC16831);
        }
        return AbstractC17577.a(interfaceC5930, interfaceC16831);
    }

    public static List w(List list) {
        if (list == null || list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Object obj = list.get(0);
        if (obj instanceof C14856) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    C14856 c14856 = (C14856) it.next();
                    arrayList.add(c14856 == null ? null : c14856.a);
                } catch (ClassCastException e) {
                    C16041.a(e, "java.nio.file.WatchEvent");
                    throw null;
                }
            }
        } else {
            if (!(obj instanceof WatchEvent)) {
                C16041.a(obj.getClass(), "java.nio.file.WatchEvent");
                throw null;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    WatchEvent watchEvent = (WatchEvent) it2.next();
                    arrayList.add(watchEvent == null ? null : new C14856(watchEvent));
                } catch (ClassCastException e2) {
                    C16041.a(e2, "java.nio.file.WatchEvent");
                    throw null;
                }
            }
        }
        return arrayList;
    }

    public static Object h(InterfaceC12641 interfaceC12641, C14435 c14435) {
        if (c14435 == AbstractC17577.a || c14435 == AbstractC17577.e || c14435 == AbstractC17577.d) {
            return null;
        }
        if (c14435 == AbstractC17577.g) {
            return interfaceC12641.toLocalTime();
        }
        if (c14435 == AbstractC17577.b) {
            return interfaceC12641.a();
        }
        if (c14435 == AbstractC17577.c) {
            return EnumC10183.NANOS;
        }
        return c14435.g(interfaceC12641);
    }

    public static boolean f(InterfaceC17116 interfaceC17116, InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            return ((EnumC8692) interfaceC16831).isDateBased();
        }
        return interfaceC16831 != null && interfaceC16831.i(interfaceC17116);
    }

    public static C0358 l(InterfaceC12641 interfaceC12641, C11149 c11149) {
        return C0358.ofEpochSecond(interfaceC12641.o(c11149), interfaceC12641.toLocalTime().getNano());
    }

    public static long j(InterfaceC12641 interfaceC12641, C11149 c11149) {
        C17359.requireNonNull(c11149, "offset");
        return ((interfaceC12641.e().D() * 86400) + ((long) interfaceC12641.toLocalTime().d0())) - ((long) c11149.getTotalSeconds());
    }

    public static Object i(InterfaceC5930 interfaceC5930, C14435 c14435) {
        if (c14435 == AbstractC17577.e || c14435 == AbstractC17577.a) {
            return interfaceC5930.getZone();
        }
        if (c14435 == AbstractC17577.d) {
            return interfaceC5930.getOffset();
        }
        if (c14435 == AbstractC17577.g) {
            return interfaceC5930.toLocalTime();
        }
        if (c14435 == AbstractC17577.b) {
            return interfaceC5930.a();
        }
        if (c14435 == AbstractC17577.c) {
            return EnumC10183.NANOS;
        }
        return c14435.g(interfaceC5930);
    }

    public static int c(InterfaceC12641 interfaceC12641, InterfaceC12641 interfaceC12642) {
        int iN = interfaceC12641.e().compareTo(interfaceC12642.e());
        return (iN == 0 && (iN = interfaceC12641.toLocalTime().compareTo(interfaceC12642.toLocalTime())) == 0) ? ((AbstractC11895) interfaceC12641.a()).getId().compareTo(interfaceC12642.a().getId()) : iN;
    }

    public static Object g(InterfaceC17116 interfaceC17116, C14435 c14435) {
        if (c14435 == AbstractC17577.a || c14435 == AbstractC17577.e || c14435 == AbstractC17577.d || c14435 == AbstractC17577.g) {
            return null;
        }
        if (c14435 == AbstractC17577.b) {
            return interfaceC17116.a();
        }
        if (c14435 == AbstractC17577.c) {
            return EnumC10183.DAYS;
        }
        return c14435.g(interfaceC17116);
    }

    public static InterfaceC1235 a(InterfaceC17116 interfaceC17116, InterfaceC1235 interfaceC1235) {
        return interfaceC1235.b(interfaceC17116.D(), EnumC8692.EPOCH_DAY);
    }

    public static long k(InterfaceC5930 interfaceC5930) {
        return ((interfaceC5930.e().D() * 86400) + ((long) interfaceC5930.toLocalTime().d0())) - ((long) interfaceC5930.getOffset().getTotalSeconds());
    }

    public static int d(InterfaceC5930 interfaceC5930, InterfaceC5930 interfaceC5931) {
        int iCompare = Long.compare(interfaceC5930.Q(), interfaceC5931.Q());
        return (iCompare == 0 && (iCompare = interfaceC5930.toLocalTime().getNano() - interfaceC5931.toLocalTime().getNano()) == 0 && (iCompare = interfaceC5930.q().compareTo(interfaceC5931.q())) == 0 && (iCompare = interfaceC5930.getZone().getId().compareTo(interfaceC5931.getZone().getId())) == 0) ? ((AbstractC11895) interfaceC5930.a()).getId().compareTo(interfaceC5931.a().getId()) : iCompare;
    }

    public static int b(InterfaceC17116 interfaceC17116, InterfaceC17116 interfaceC17117) {
        int iCompare = Long.compare(interfaceC17116.D(), interfaceC17117.D());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC11895) interfaceC17116.a()).getId().compareTo(interfaceC17117.a().getId());
    }
}
