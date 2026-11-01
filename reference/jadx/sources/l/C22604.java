package l;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.AccessDeniedException;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩹᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: FC0P */
/* JADX INFO: loaded from: classes.dex */
public final class C22604 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    @Deprecated
    public static final EnumC22146[] f73657;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2847[] f73658;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC0978[] f73659 = {EnumC17912.CREATE, EnumC17912.TRUNCATE_EXISTING};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC0978[] f73660;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC22146[] f73661;

    static {
        EnumC17912 enumC17912 = EnumC17912.APPEND;
        f73658 = new InterfaceC2847[0];
        f73661 = new EnumC22146[0];
        f73657 = new EnumC22146[]{EnumC22146.NOFOLLOW_LINKS};
        f73660 = new InterfaceC0978[0];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC9427 m50102(InterfaceC3800 interfaceC3800, EnumC22146[] enumC22146Arr, InterfaceC2847... interfaceC2847Arr) throws Throwable {
        InterfaceC12269 interfaceC12269;
        InterfaceC20735 attributes;
        if (C5212.isDirectory(interfaceC3800, enumC22146Arr)) {
            C5670 c5670 = new C5670(C3075.m9255(), enumC22146Arr, interfaceC2847Arr, new String[0]);
            C5212.walkFileTree(interfaceC3800, c5670);
            return c5670.m29920();
        }
        if (C5212.isDirectory(interfaceC3800, enumC22146Arr)) {
            throw new NoSuchFileException(interfaceC3800.toString());
        }
        InterfaceC9427 interfaceC9427M9255 = C3075.m9255();
        long size = 0;
        long size2 = (!m50103(interfaceC3800, enumC22146Arr) || C5212.isSymbolicLink(interfaceC3800)) ? 0L : C5212.size(interfaceC3800);
        try {
            if (C5212.deleteIfExists(interfaceC3800)) {
                C10838 c10838 = (C10838) interfaceC9427M9255;
                c10838.mo24188().mo34603();
                c10838.m27161().add(size2);
                return interfaceC9427M9255;
            }
        } catch (AccessDeniedException unused) {
        }
        InterfaceC12269 interfaceC122610 = null;
        InterfaceC3800 parent = interfaceC3800 == null ? null : interfaceC3800.getParent();
        try {
            if (C11397.of((Object[]) interfaceC2847Arr).anyMatch(new C16173(3))) {
                if (parent == null) {
                    attributes = null;
                } else {
                    try {
                        attributes = C5212.readAttributes(parent, InterfaceC12269.class, enumC22146Arr);
                    } catch (IOException | UnsupportedOperationException unused2) {
                        attributes = null;
                    }
                }
                interfaceC12269 = (InterfaceC12269) attributes;
                try {
                    m50104(interfaceC3800, enumC22146Arr);
                    interfaceC122610 = interfaceC12269;
                } catch (Throwable th) {
                    th = th;
                    if (interfaceC12269 != null) {
                        C5212.setPosixFilePermissions(parent, interfaceC12269.permissions());
                    }
                    throw th;
                }
            }
            if (m50103(interfaceC3800, enumC22146Arr) && !C5212.isSymbolicLink(interfaceC3800)) {
                size = C5212.size(interfaceC3800);
            }
            if (C5212.deleteIfExists(interfaceC3800)) {
                C10838 c10839 = (C10838) interfaceC9427M9255;
                c10839.mo24188().mo34603();
                c10839.m27161().add(size);
            }
            if (interfaceC122610 != null) {
                C5212.setPosixFilePermissions(parent, interfaceC122610.permissions());
            }
            return interfaceC9427M9255;
        } catch (Throwable th2) {
            th = th2;
            interfaceC12269 = interfaceC122610;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50103(InterfaceC3800 interfaceC3800, EnumC22146... enumC22146Arr) {
        if (interfaceC3800 != null) {
            if (enumC22146Arr != null) {
                if (C5212.exists(interfaceC3800, enumC22146Arr)) {
                    return true;
                }
            } else if (C5212.exists(interfaceC3800, new EnumC22146[0])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m50104(InterfaceC3800 interfaceC3800, EnumC22146... enumC22146Arr) throws IOException {
        try {
            InterfaceC15797 interfaceC15797 = (InterfaceC15797) C5212.getFileAttributeView(interfaceC3800, InterfaceC15797.class, enumC22146Arr);
            if (interfaceC15797 != null) {
                interfaceC15797.setReadOnly(false);
                return;
            }
        } catch (IOException unused) {
        }
        InterfaceC20735 attributes = null;
        InterfaceC3800 parent = interfaceC3800 == null ? null : interfaceC3800.getParent();
        if (m50103(parent, enumC22146Arr)) {
            if (parent != null) {
                try {
                    attributes = C5212.readAttributes(parent, InterfaceC12269.class, enumC22146Arr);
                } catch (IOException | UnsupportedOperationException unused2) {
                }
            }
            if (((InterfaceC12269) attributes) != null) {
                List listAsList = Arrays.asList(EnumC17207.OWNER_WRITE, EnumC17207.OWNER_EXECUTE);
                if (parent != null) {
                    Set posixFilePermissions = C5212.getPosixFilePermissions(parent, enumC22146Arr);
                    HashSet hashSet = new HashSet(posixFilePermissions);
                    hashSet.addAll(listAsList);
                    if (hashSet.equals(posixFilePermissions)) {
                        return;
                    }
                    C5212.setPosixFilePermissions(parent, hashSet);
                    return;
                }
                return;
            }
        }
        throw new IOException(String.format("DOS or POSIX file operations not available for '%s', linkOptions %s", interfaceC3800, Arrays.toString(enumC22146Arr)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static OutputStream m50101(InterfaceC3800 interfaceC3800) {
        EnumC22146[] enumC22146Arr = f73661;
        if (!m50103(interfaceC3800, enumC22146Arr)) {
            InterfaceC3800 symbolicLink = null;
            EnumC22146 enumC22146 = (enumC22146Arr == null || enumC22146Arr.length <= 0) ? null : enumC22146Arr[0];
            InterfaceC20030[] interfaceC20030Arr = new InterfaceC20030[0];
            InterfaceC3800 parent = interfaceC3800 == null ? null : interfaceC3800.getParent();
            if (enumC22146 != EnumC22146.NOFOLLOW_LINKS) {
                if (parent != null) {
                    symbolicLink = C5212.isSymbolicLink(parent) ? C5212.readSymbolicLink(parent) : parent;
                }
                parent = symbolicLink;
            }
            if (parent != null) {
                if (!(enumC22146 == null ? C5212.exists(parent, new EnumC22146[0]) : C5212.exists(parent, enumC22146))) {
                    C5212.createDirectories(parent, interfaceC20030Arr);
                }
            }
        }
        InterfaceC0978[] interfaceC0978Arr = f73659;
        InterfaceC0978[] interfaceC0978Arr2 = f73660;
        if (interfaceC0978Arr == null) {
            interfaceC0978Arr = interfaceC0978Arr2;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(interfaceC0978Arr));
        arrayList.addAll(Arrays.asList(enumC22146Arr));
        return C5212.newOutputStream(interfaceC3800, (InterfaceC0978[]) arrayList.toArray(interfaceC0978Arr2));
    }
}
