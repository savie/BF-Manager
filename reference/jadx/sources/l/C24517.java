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

/* JADX INFO: renamed from: l.᩺᩵ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: FC0P */
/* JADX INFO: loaded from: classes.dex */
public final class C24517 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12582[] f79500;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12394[] f79501;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12394[] f79502 = {EnumC0462.CREATE, EnumC0462.TRUNCATE_EXISTING};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final EnumC20599[] f79503;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    @Deprecated
    public static final EnumC20599[] f79504;

    static {
        EnumC0462 enumC0462 = EnumC0462.APPEND;
        f79500 = new InterfaceC12582[0];
        f79503 = new EnumC20599[0];
        f79504 = new EnumC20599[]{EnumC20599.NOFOLLOW_LINKS};
        f79501 = new InterfaceC12394[0];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC17803 m54776(InterfaceC24329 interfaceC24329, EnumC20599[] enumC20599Arr, InterfaceC12582... interfaceC12582Arr) throws Throwable {
        InterfaceC10624 interfaceC10624;
        InterfaceC8665 attributes;
        if (C3445.isDirectory(interfaceC24329, enumC20599Arr)) {
            C6617 c6617 = new C6617(C16311.m38694(), enumC20599Arr, interfaceC12582Arr, new String[0]);
            C3445.walkFileTree(interfaceC24329, c6617);
            return c6617.m47571();
        }
        if (C3445.isDirectory(interfaceC24329, enumC20599Arr)) {
            throw new NoSuchFileException(interfaceC24329.toString());
        }
        InterfaceC17803 interfaceC17803M38694 = C16311.m38694();
        long size = 0;
        long size2 = (!m54777(interfaceC24329, enumC20599Arr) || C3445.isSymbolicLink(interfaceC24329)) ? 0L : C3445.size(interfaceC24329);
        try {
            if (C3445.deleteIfExists(interfaceC24329)) {
                C2142 c2142 = (C2142) interfaceC17803M38694;
                c2142.mo7399().mo29683();
                c2142.m7398().add(size2);
                return interfaceC17803M38694;
            }
        } catch (AccessDeniedException unused) {
        }
        InterfaceC10624 interfaceC10625 = null;
        InterfaceC24329 parent = interfaceC24329 == null ? null : interfaceC24329.getParent();
        try {
            if (C23654.of((Object[]) interfaceC12582Arr).anyMatch(new C19060(3))) {
                if (parent == null) {
                    attributes = null;
                } else {
                    try {
                        attributes = C3445.readAttributes(parent, InterfaceC10624.class, enumC20599Arr);
                    } catch (IOException | UnsupportedOperationException unused2) {
                        attributes = null;
                    }
                }
                interfaceC10624 = (InterfaceC10624) attributes;
                try {
                    m54778(interfaceC24329, enumC20599Arr);
                    interfaceC10625 = interfaceC10624;
                } catch (Throwable th) {
                    th = th;
                    if (interfaceC10624 != null) {
                        C3445.setPosixFilePermissions(parent, interfaceC10624.permissions());
                    }
                    throw th;
                }
            }
            if (m54777(interfaceC24329, enumC20599Arr) && !C3445.isSymbolicLink(interfaceC24329)) {
                size = C3445.size(interfaceC24329);
            }
            if (C3445.deleteIfExists(interfaceC24329)) {
                C2142 c2143 = (C2142) interfaceC17803M38694;
                c2143.mo7399().mo29683();
                c2143.m7398().add(size);
            }
            if (interfaceC10625 != null) {
                C3445.setPosixFilePermissions(parent, interfaceC10625.permissions());
            }
            return interfaceC17803M38694;
        } catch (Throwable th2) {
            th = th2;
            interfaceC10624 = interfaceC10625;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m54777(InterfaceC24329 interfaceC24329, EnumC20599... enumC20599Arr) {
        if (interfaceC24329 != null) {
            if (enumC20599Arr != null) {
                if (C3445.exists(interfaceC24329, enumC20599Arr)) {
                    return true;
                }
            } else if (C3445.exists(interfaceC24329, new EnumC20599[0])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m54778(InterfaceC24329 interfaceC24329, EnumC20599... enumC20599Arr) throws IOException {
        try {
            InterfaceC7174 interfaceC7174 = (InterfaceC7174) C3445.getFileAttributeView(interfaceC24329, InterfaceC7174.class, enumC20599Arr);
            if (interfaceC7174 != null) {
                interfaceC7174.setReadOnly(false);
                return;
            }
        } catch (IOException unused) {
        }
        InterfaceC8665 attributes = null;
        InterfaceC24329 parent = interfaceC24329 == null ? null : interfaceC24329.getParent();
        if (m54777(parent, enumC20599Arr)) {
            if (parent != null) {
                try {
                    attributes = C3445.readAttributes(parent, InterfaceC10624.class, enumC20599Arr);
                } catch (IOException | UnsupportedOperationException unused2) {
                }
            }
            if (((InterfaceC10624) attributes) != null) {
                List listAsList = Arrays.asList(EnumC22559.OWNER_WRITE, EnumC22559.OWNER_EXECUTE);
                if (parent != null) {
                    Set posixFilePermissions = C3445.getPosixFilePermissions(parent, enumC20599Arr);
                    HashSet hashSet = new HashSet(posixFilePermissions);
                    hashSet.addAll(listAsList);
                    if (hashSet.equals(posixFilePermissions)) {
                        return;
                    }
                    C3445.setPosixFilePermissions(parent, hashSet);
                    return;
                }
                return;
            }
        }
        throw new IOException(String.format("DOS or POSIX file operations not available for '%s', linkOptions %s", interfaceC24329, Arrays.toString(enumC20599Arr)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static OutputStream m54775(InterfaceC24329 interfaceC24329) {
        EnumC20599[] enumC20599Arr = f79503;
        if (!m54777(interfaceC24329, enumC20599Arr)) {
            InterfaceC24329 symbolicLink = null;
            EnumC20599 enumC20599 = (enumC20599Arr == null || enumC20599Arr.length <= 0) ? null : enumC20599Arr[0];
            InterfaceC13885[] interfaceC13885Arr = new InterfaceC13885[0];
            InterfaceC24329 parent = interfaceC24329 == null ? null : interfaceC24329.getParent();
            if (enumC20599 != EnumC20599.NOFOLLOW_LINKS) {
                if (parent != null) {
                    symbolicLink = C3445.isSymbolicLink(parent) ? C3445.readSymbolicLink(parent) : parent;
                }
                parent = symbolicLink;
            }
            if (parent != null) {
                if (!(enumC20599 == null ? C3445.exists(parent, new EnumC20599[0]) : C3445.exists(parent, enumC20599))) {
                    C3445.createDirectories(parent, interfaceC13885Arr);
                }
            }
        }
        InterfaceC12394[] interfaceC12394Arr = f79502;
        InterfaceC12394[] interfaceC12394Arr2 = f79501;
        if (interfaceC12394Arr == null) {
            interfaceC12394Arr = interfaceC12394Arr2;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(interfaceC12394Arr));
        arrayList.addAll(Arrays.asList(enumC20599Arr));
        return C3445.newOutputStream(interfaceC24329, (InterfaceC12394[]) arrayList.toArray(interfaceC12394Arr2));
    }
}
