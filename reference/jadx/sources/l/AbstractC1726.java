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

/* JADX INFO: renamed from: l.֫ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1726 {
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
            arrayList.add(C13638.requireNonNull(obj));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ Map.Entry C(Object obj, Object obj2) {
        return new AbstractMap.SimpleImmutableEntry(C13638.requireNonNull(obj), C13638.requireNonNull(obj2));
    }

    public static /* synthetic */ Set D(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            if (!hashSet.add(C13638.requireNonNull(obj))) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static /* synthetic */ boolean E(Unsafe unsafe, Object obj, long j, C19427 c19427) {
        while (!unsafe.compareAndSwapObject(obj, j, (Object) null, c19427)) {
            if (unsafe.getObject(obj, j) != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ EnumC22146[] F(LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        EnumC22146[] enumC22146Arr = new EnumC22146[length];
        for (int i = 0; i < length; i++) {
            enumC22146Arr[i] = linkOptionArr[i] == null ? null : EnumC22146.NOFOLLOW_LINKS;
        }
        return enumC22146Arr;
    }

    public static /* synthetic */ InterfaceC8035[] H(WatchEvent.Modifier[] modifierArr) {
        if (modifierArr == null) {
            return null;
        }
        int length = modifierArr.length;
        InterfaceC8035[] interfaceC8035Arr = new InterfaceC8035[length];
        for (int i = 0; i < length; i++) {
            WatchEvent.Modifier modifier = modifierArr[i];
            interfaceC8035Arr[i] = modifier == null ? null : modifier instanceof C4048 ? ((C4048) modifier).a : new C1226(modifier);
        }
        return interfaceC8035Arr;
    }

    public static /* synthetic */ CopyOption[] J(InterfaceC1767[] interfaceC1767Arr) {
        CopyOption c12662;
        if (interfaceC1767Arr == null) {
            return null;
        }
        int length = interfaceC1767Arr.length;
        CopyOption[] copyOptionArr = new CopyOption[length];
        for (int i = 0; i < length; i++) {
            InterfaceC1767 interfaceC1767 = interfaceC1767Arr[i];
            if (interfaceC1767 == null) {
                c12662 = null;
            } else if (interfaceC1767 instanceof C7329) {
                c12662 = ((C7329) interfaceC1767).a;
            } else if (interfaceC1767 instanceof EnumC22146) {
                c12662 = LinkOption.NOFOLLOW_LINKS;
            } else if (interfaceC1767 instanceof EnumC21440) {
                EnumC21440 enumC21440 = (EnumC21440) interfaceC1767;
                c12662 = enumC21440 == EnumC21440.REPLACE_EXISTING ? StandardCopyOption.REPLACE_EXISTING : enumC21440 == EnumC21440.COPY_ATTRIBUTES ? StandardCopyOption.COPY_ATTRIBUTES : StandardCopyOption.ATOMIC_MOVE;
            } else {
                c12662 = new C12662(interfaceC1767);
            }
            copyOptionArr[i] = c12662;
        }
        return copyOptionArr;
    }

    public static /* synthetic */ LinkOption[] K(EnumC22146[] enumC22146Arr) {
        if (enumC22146Arr == null) {
            return null;
        }
        int length = enumC22146Arr.length;
        LinkOption[] linkOptionArr = new LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr[i] = enumC22146Arr[i] == null ? null : LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr;
    }

    public static /* synthetic */ WatchEvent.Modifier[] M(InterfaceC8035[] interfaceC8035Arr) {
        if (interfaceC8035Arr == null) {
            return null;
        }
        int length = interfaceC8035Arr.length;
        WatchEvent.Modifier[] modifierArr = new WatchEvent.Modifier[length];
        for (int i = 0; i < length; i++) {
            InterfaceC8035 interfaceC8035 = interfaceC8035Arr[i];
            modifierArr[i] = interfaceC8035 == null ? null : interfaceC8035 instanceof C1226 ? ((C1226) interfaceC8035).a : new C4048(interfaceC8035);
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

    public static /* synthetic */ StandardOpenOption n(EnumC17912 enumC17912) {
        if (enumC17912 == null) {
            return null;
        }
        if (enumC17912 == EnumC17912.READ) {
            return StandardOpenOption.READ;
        }
        if (enumC17912 == EnumC17912.WRITE) {
            return StandardOpenOption.WRITE;
        }
        if (enumC17912 == EnumC17912.APPEND) {
            return StandardOpenOption.APPEND;
        }
        if (enumC17912 == EnumC17912.TRUNCATE_EXISTING) {
            return StandardOpenOption.TRUNCATE_EXISTING;
        }
        if (enumC17912 == EnumC17912.CREATE) {
            return StandardOpenOption.CREATE;
        }
        if (enumC17912 == EnumC17912.CREATE_NEW) {
            return StandardOpenOption.CREATE_NEW;
        }
        if (enumC17912 == EnumC17912.DELETE_ON_CLOSE) {
            return StandardOpenOption.DELETE_ON_CLOSE;
        }
        if (enumC17912 == EnumC17912.SPARSE) {
            return StandardOpenOption.SPARSE;
        }
        return enumC17912 == EnumC17912.SYNC ? StandardOpenOption.SYNC : StandardOpenOption.DSYNC;
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

    public static C16502 m(FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        return C16502.fromMillis(fileTime.toMillis());
    }

    public static WatchEvent.Kind[] L(InterfaceC18618[] interfaceC18618Arr) {
        WatchEvent.Kind c5460;
        if (interfaceC18618Arr == null) {
            return null;
        }
        int length = interfaceC18618Arr.length;
        WatchEvent.Kind[] kindArr = new WatchEvent.Kind[length];
        for (int i = 0; i < length; i++) {
            InterfaceC18618 interfaceC18618 = interfaceC18618Arr[i];
            if (interfaceC18618 == null) {
                c5460 = null;
            } else if (interfaceC18618 == AbstractC14779.b) {
                c5460 = StandardWatchEventKinds.ENTRY_CREATE;
            } else if (interfaceC18618 == AbstractC14779.c) {
                c5460 = StandardWatchEventKinds.ENTRY_DELETE;
            } else if (interfaceC18618 == AbstractC14779.d) {
                c5460 = StandardWatchEventKinds.ENTRY_MODIFY;
            } else if (interfaceC18618 == AbstractC14779.a) {
                c5460 = StandardWatchEventKinds.OVERFLOW;
            } else {
                c5460 = interfaceC18618 instanceof C11811 ? ((C11811) interfaceC18618).a : new C5460(interfaceC18618);
            }
            kindArr[i] = c5460;
        }
        return kindArr;
    }

    public static Class r(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == BasicFileAttributes.class) {
            return InterfaceC20735.class;
        }
        if (cls == InterfaceC20735.class) {
            return BasicFileAttributes.class;
        }
        if (cls == PosixFileAttributes.class) {
            return InterfaceC12269.class;
        }
        if (cls == InterfaceC12269.class) {
            return PosixFileAttributes.class;
        }
        if (cls == C13368.class) {
            return DosFileAttributes.class;
        }
        if (cls == DosFileAttributes.class) {
            return C13368.class;
        }
        C12040.a(cls, "java.nio.file.attribute.BasicFileAttributes");
        throw null;
    }

    public static FileTime o(C16502 c16502) {
        if (c16502 == null) {
            return null;
        }
        return FileTime.fromMillis(c16502.toMillis());
    }

    public static InterfaceC20030[] I(FileAttribute[] fileAttributeArr) {
        InterfaceC20030 c4194;
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        InterfaceC20030[] interfaceC20030Arr = new InterfaceC20030[length];
        for (int i = 0; i < length; i++) {
            FileAttribute fileAttribute = fileAttributeArr[i];
            if (fileAttribute == null) {
                c4194 = null;
            } else if (x(fileAttribute.value())) {
                c4194 = new C5295(3, fileAttribute);
            } else {
                c4194 = fileAttribute instanceof C7017 ? ((C7017) fileAttribute).a : new C4194(fileAttribute);
            }
            interfaceC20030Arr[i] = c4194;
        }
        return interfaceC20030Arr;
    }

    public static InterfaceC18618[] G(WatchEvent.Kind[] kindArr) {
        InterfaceC18618 c11811;
        if (kindArr == null) {
            return null;
        }
        int length = kindArr.length;
        InterfaceC18618[] interfaceC18618Arr = new InterfaceC18618[length];
        for (int i = 0; i < length; i++) {
            WatchEvent.Kind kind = kindArr[i];
            if (kind == null) {
                c11811 = null;
            } else if (kind == StandardWatchEventKinds.ENTRY_CREATE) {
                c11811 = AbstractC14779.b;
            } else if (kind == StandardWatchEventKinds.ENTRY_DELETE) {
                c11811 = AbstractC14779.c;
            } else if (kind == StandardWatchEventKinds.ENTRY_MODIFY) {
                c11811 = AbstractC14779.d;
            } else if (kind == StandardWatchEventKinds.OVERFLOW) {
                c11811 = AbstractC14779.a;
            } else {
                c11811 = kind instanceof C5460 ? ((C5460) kind).a : new C11811(kind);
            }
            interfaceC18618Arr[i] = c11811;
        }
        return interfaceC18618Arr;
    }

    public static Object p(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof InterfaceC3800) {
            return C3343.l((InterfaceC3800) obj);
        }
        return obj instanceof Path ? C9695.l((Path) obj) : obj;
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
            return InterfaceC11957.class;
        }
        if (cls == InterfaceC11957.class) {
            return BasicFileAttributeView.class;
        }
        if (cls == PosixFileAttributeView.class) {
            return C7723.class;
        }
        if (cls == C7723.class) {
            return PosixFileAttributeView.class;
        }
        if (cls == FileOwnerAttributeView.class) {
            return InterfaceC8429.class;
        }
        if (cls == InterfaceC8429.class) {
            return FileOwnerAttributeView.class;
        }
        if (cls == InterfaceC15797.class) {
            return DosFileAttributeView.class;
        }
        if (cls == DosFileAttributeView.class) {
            return InterfaceC15797.class;
        }
        if (cls == C20423.class) {
            return UserDefinedFileAttributeView.class;
        }
        if (cls == UserDefinedFileAttributeView.class) {
            return C20423.class;
        }
        if (cls == C23558.class) {
            return AclFileAttributeView.class;
        }
        if (cls == AclFileAttributeView.class) {
            return C23558.class;
        }
        C12040.a(cls, "java.nio.file.attribute.FileAttributeView");
        throw null;
    }

    public static FileAttribute[] N(InterfaceC20030[] interfaceC20030Arr) {
        FileAttribute c7017;
        if (interfaceC20030Arr == null) {
            return null;
        }
        int length = interfaceC20030Arr.length;
        FileAttribute[] fileAttributeArr = new FileAttribute[length];
        for (int i = 0; i < length; i++) {
            InterfaceC20030 interfaceC20030 = interfaceC20030Arr[i];
            if (interfaceC20030 == null) {
                c7017 = null;
            } else if (x(interfaceC20030.value())) {
                c7017 = new C23246(interfaceC20030);
            } else {
                c7017 = interfaceC20030 instanceof C4194 ? ((C4194) interfaceC20030).a : new C7017(interfaceC20030);
            }
            fileAttributeArr[i] = c7017;
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
        return (next instanceof EnumC17207) || (next instanceof PosixFilePermission);
    }

    public static FileChannel T(InterfaceC3800 interfaceC3800, Set set) throws IOException {
        String str;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC0978) it.next()).getClass();
        }
        if (interfaceC3800.toFile().exists()) {
            if (set.contains(EnumC17912.CREATE_NEW) && set.contains(EnumC17912.WRITE)) {
                throw new FileAlreadyExistsException(interfaceC3800.toString());
            }
        } else if (!set.contains(EnumC17912.CREATE) && !set.contains(EnumC17912.CREATE_NEW)) {
            throw new NoSuchFileException(interfaceC3800.toString());
        }
        if (set.contains(EnumC17912.READ) && set.contains(EnumC17912.APPEND)) {
            throw new IllegalArgumentException("READ + APPEND not allowed");
        }
        EnumC17912 enumC17912 = EnumC17912.APPEND;
        if (set.contains(enumC17912) && set.contains(EnumC17912.TRUNCATE_EXISTING)) {
            throw new IllegalArgumentException("APPEND + TRUNCATE_EXISTING not allowed");
        }
        File file = interfaceC3800.toFile();
        EnumC17912 enumC17913 = EnumC17912.WRITE;
        if (!set.contains(enumC17913) && !set.contains(enumC17912)) {
            str = "r";
        } else if (set.contains(EnumC17912.SYNC)) {
            str = "rws";
        } else {
            str = set.contains(EnumC17912.DSYNC) ? "rwd" : "rw";
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, str);
        if (set.contains(EnumC17912.TRUNCATE_EXISTING) && set.contains(enumC17913)) {
            randomAccessFile.setLength(0L);
        }
        if (!set.contains(enumC17912) && !set.contains(EnumC17912.DELETE_ON_CLOSE)) {
            return C6001.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        }
        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = C6001.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        int i = C11646.e;
        if (fileChannelConvertMaybeLegacyFileChannelFromLibrary instanceof C11646) {
            fileChannelConvertMaybeLegacyFileChannelFromLibrary = ((C11646) fileChannelConvertMaybeLegacyFileChannelFromLibrary).a;
        }
        return new C11646(fileChannelConvertMaybeLegacyFileChannelFromLibrary, set.contains(EnumC17912.DELETE_ON_CLOSE), set.contains(enumC17912), interfaceC3800);
    }

    public static Set u(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof InterfaceC0978) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(C14634.a((InterfaceC0978) it.next()));
                } catch (ClassCastException e) {
                    C12040.a(e, "java.nio.file.OpenOption");
                    throw null;
                }
            }
        } else {
            if (!(next instanceof OpenOption)) {
                C12040.a(next.getClass(), "java.nio.file.OpenOption");
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    hashSet.add(C12517.a((OpenOption) it2.next()));
                } catch (ClassCastException e2) {
                    C12040.a(e2, "java.nio.file.OpenOption");
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
                C12040.a(e, "java.nio.file.attribute.FileTime");
                throw null;
            }
        }
        if (!(obj instanceof C16502)) {
            return obj;
        }
        try {
            return o((C16502) obj);
        } catch (ClassCastException e2) {
            C12040.a(e2, "java.nio.file.attribute.FileTime");
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
        EnumC17207 enumC17207;
        PosixFilePermission posixFilePermission;
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof EnumC17207) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    EnumC17207 enumC17208 = (EnumC17207) it.next();
                    if (enumC17208 == null) {
                        posixFilePermission = null;
                    } else if (enumC17208 == EnumC17207.OWNER_READ) {
                        posixFilePermission = PosixFilePermission.OWNER_READ;
                    } else if (enumC17208 == EnumC17207.OWNER_WRITE) {
                        posixFilePermission = PosixFilePermission.OWNER_WRITE;
                    } else if (enumC17208 == EnumC17207.OWNER_EXECUTE) {
                        posixFilePermission = PosixFilePermission.OWNER_EXECUTE;
                    } else if (enumC17208 == EnumC17207.GROUP_READ) {
                        posixFilePermission = PosixFilePermission.GROUP_READ;
                    } else if (enumC17208 == EnumC17207.GROUP_WRITE) {
                        posixFilePermission = PosixFilePermission.GROUP_WRITE;
                    } else if (enumC17208 == EnumC17207.GROUP_EXECUTE) {
                        posixFilePermission = PosixFilePermission.GROUP_EXECUTE;
                    } else if (enumC17208 == EnumC17207.OTHERS_READ) {
                        posixFilePermission = PosixFilePermission.OTHERS_READ;
                    } else {
                        posixFilePermission = enumC17208 == EnumC17207.OTHERS_WRITE ? PosixFilePermission.OTHERS_WRITE : PosixFilePermission.OTHERS_EXECUTE;
                    }
                    hashSet.add(posixFilePermission);
                } catch (ClassCastException e) {
                    C12040.a(e, "java.nio.file.attribute.PosixFilePermission");
                    throw null;
                }
            }
        } else {
            if (!(next instanceof PosixFilePermission)) {
                C12040.a(next.getClass(), "java.nio.file.attribute.PosixFilePermission");
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    PosixFilePermission posixFilePermission2 = (PosixFilePermission) it2.next();
                    if (posixFilePermission2 == null) {
                        enumC17207 = null;
                    } else if (posixFilePermission2 == PosixFilePermission.OWNER_READ) {
                        enumC17207 = EnumC17207.OWNER_READ;
                    } else if (posixFilePermission2 == PosixFilePermission.OWNER_WRITE) {
                        enumC17207 = EnumC17207.OWNER_WRITE;
                    } else if (posixFilePermission2 == PosixFilePermission.OWNER_EXECUTE) {
                        enumC17207 = EnumC17207.OWNER_EXECUTE;
                    } else if (posixFilePermission2 == PosixFilePermission.GROUP_READ) {
                        enumC17207 = EnumC17207.GROUP_READ;
                    } else if (posixFilePermission2 == PosixFilePermission.GROUP_WRITE) {
                        enumC17207 = EnumC17207.GROUP_WRITE;
                    } else if (posixFilePermission2 == PosixFilePermission.GROUP_EXECUTE) {
                        enumC17207 = EnumC17207.GROUP_EXECUTE;
                    } else if (posixFilePermission2 == PosixFilePermission.OTHERS_READ) {
                        enumC17207 = EnumC17207.OTHERS_READ;
                    } else {
                        enumC17207 = posixFilePermission2 == PosixFilePermission.OTHERS_WRITE ? EnumC17207.OTHERS_WRITE : EnumC17207.OTHERS_EXECUTE;
                    }
                    hashSet.add(enumC17207);
                } catch (ClassCastException e2) {
                    C12040.a(e2, "java.nio.file.attribute.PosixFilePermission");
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static int e(InterfaceC20402 interfaceC20402, InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            int i = AbstractC0771.a[((EnumC18762) interfaceC11002).ordinal()];
            if (i == 1) {
                throw new C14530("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i != 2) {
                return interfaceC20402.t().l(interfaceC11002);
            }
            return interfaceC20402.h().b;
        }
        return AbstractC23702.a(interfaceC20402, interfaceC11002);
    }

    public static List w(List list) {
        if (list == null || list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Object obj = list.get(0);
        if (obj instanceof C23100) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    C23100 c23100 = (C23100) it.next();
                    arrayList.add(c23100 == null ? null : c23100.a);
                } catch (ClassCastException e) {
                    C12040.a(e, "java.nio.file.WatchEvent");
                    throw null;
                }
            }
        } else {
            if (!(obj instanceof WatchEvent)) {
                C12040.a(obj.getClass(), "java.nio.file.WatchEvent");
                throw null;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    WatchEvent watchEvent = (WatchEvent) it2.next();
                    arrayList.add(watchEvent == null ? null : new C23100(watchEvent));
                } catch (ClassCastException e2) {
                    C12040.a(e2, "java.nio.file.WatchEvent");
                    throw null;
                }
            }
        }
        return arrayList;
    }

    public static Object h(InterfaceC9819 interfaceC9819, C22935 c22935) {
        if (c22935 == AbstractC23702.a || c22935 == AbstractC23702.e || c22935 == AbstractC23702.d) {
            return null;
        }
        if (c22935 == AbstractC23702.g) {
            return interfaceC9819.b();
        }
        if (c22935 == AbstractC23702.b) {
            return interfaceC9819.a();
        }
        if (c22935 == AbstractC23702.c) {
            return EnumC22996.NANOS;
        }
        return c22935.h(interfaceC9819);
    }

    public static boolean f(InterfaceC17579 interfaceC17579, InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            return ((EnumC18762) interfaceC11002).isDateBased();
        }
        return interfaceC11002 != null && interfaceC11002.l(interfaceC17579);
    }

    public static C18285 l(InterfaceC9819 interfaceC9819, C2678 c2678) {
        return C18285.ofEpochSecond(interfaceC9819.r(c2678), interfaceC9819.b().d);
    }

    public static long j(InterfaceC9819 interfaceC9819, C2678 c2678) {
        C13638.requireNonNull(c2678, "offset");
        return ((interfaceC9819.f().H() * 86400) + ((long) interfaceC9819.b().i0())) - ((long) c2678.b);
    }

    public static Object i(InterfaceC20402 interfaceC20402, C22935 c22935) {
        if (c22935 == AbstractC23702.e || c22935 == AbstractC23702.a) {
            return interfaceC20402.F();
        }
        if (c22935 == AbstractC23702.d) {
            return interfaceC20402.h();
        }
        if (c22935 == AbstractC23702.g) {
            return interfaceC20402.b();
        }
        if (c22935 == AbstractC23702.b) {
            return interfaceC20402.a();
        }
        if (c22935 == AbstractC23702.c) {
            return EnumC22996.NANOS;
        }
        return c22935.h(interfaceC20402);
    }

    public static int c(InterfaceC9819 interfaceC9819, InterfaceC9819 interfaceC98110) {
        int iR = interfaceC9819.f().compareTo(interfaceC98110.f());
        return (iR == 0 && (iR = interfaceC9819.b().compareTo(interfaceC98110.b())) == 0) ? ((AbstractC16874) interfaceC9819.a()).k().compareTo(interfaceC98110.a().k()) : iR;
    }

    public static Object g(InterfaceC17579 interfaceC17579, C22935 c22935) {
        if (c22935 == AbstractC23702.a || c22935 == AbstractC23702.e || c22935 == AbstractC23702.d || c22935 == AbstractC23702.g) {
            return null;
        }
        if (c22935 == AbstractC23702.b) {
            return interfaceC17579.a();
        }
        if (c22935 == AbstractC23702.c) {
            return EnumC22996.DAYS;
        }
        return c22935.h(interfaceC17579);
    }

    public static InterfaceC15235 a(InterfaceC17579 interfaceC17579, InterfaceC15235 interfaceC15235) {
        return interfaceC15235.c(interfaceC17579.H(), EnumC18762.EPOCH_DAY);
    }

    public static long k(InterfaceC20402 interfaceC20402) {
        return ((interfaceC20402.f().H() * 86400) + ((long) interfaceC20402.b().i0())) - ((long) interfaceC20402.h().b);
    }

    public static int d(InterfaceC20402 interfaceC20402, InterfaceC20402 interfaceC20403) {
        int iCompare = Long.compare(interfaceC20402.U(), interfaceC20403.U());
        return (iCompare == 0 && (iCompare = interfaceC20402.b().d - interfaceC20403.b().d) == 0 && (iCompare = interfaceC20402.t().compareTo(interfaceC20403.t())) == 0 && (iCompare = interfaceC20402.F().k().compareTo(interfaceC20403.F().k())) == 0) ? ((AbstractC16874) interfaceC20402.a()).k().compareTo(interfaceC20403.a().k()) : iCompare;
    }

    public static int b(InterfaceC17579 interfaceC17579, InterfaceC17579 interfaceC175710) {
        int iCompare = Long.compare(interfaceC17579.H(), interfaceC175710.H());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC16874) interfaceC17579.a()).k().compareTo(interfaceC175710.a().k());
    }
}
