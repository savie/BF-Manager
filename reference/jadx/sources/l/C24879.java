package l;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩻ۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C24879 implements InterfaceC15845 {
    public static final Set b;
    public final InterfaceC24329 a;

    @Override // l.InterfaceC1676
    public final String name() {
        return "basic";
    }

    @Override // l.InterfaceC15845
    public final InterfaceC8665 readAttributes() {
        boolean z;
        InterfaceC24329 interfaceC24329 = this.a;
        interfaceC24329.getFileSystem().provider().checkAccess(interfaceC24329, new EnumC5683[0]);
        File file = interfaceC24329.toFile();
        C21813 c21813From = C21813.from(file.lastModified(), TimeUnit.MILLISECONDS);
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        try {
            File file2 = file.getParent() == null ? file : new File(file.getParentFile().getCanonicalFile(), file.getName());
            z = !file2.getCanonicalFile().equals(file2.getAbsoluteFile());
        } catch (IOException unused) {
            z = false;
        }
        return new C16673(c21813From, c21813From, c21813From, zIsFile, zIsDirectory, z, (zIsFile || zIsDirectory || z) ? false : true, file.length(), Integer.valueOf(file.hashCode()));
    }

    @Override // l.InterfaceC15845
    public final void a(C21813 c21813, C21813 c21814, C21813 c21815) {
        if (c21813 == null && c21814 == null) {
            return;
        }
        InterfaceC24329 interfaceC24329 = this.a;
        interfaceC24329.getFileSystem().provider().checkAccess(interfaceC24329, EnumC5683.WRITE);
        if (interfaceC24329.toFile().setLastModified(c21813.to(TimeUnit.MILLISECONDS))) {
            return;
        }
        throw new IOException("File.setLastModified did not succeed on " + interfaceC24329);
    }

    static {
        String[] strArr = {"size", "creationTime", "lastAccessTime", "lastModifiedTime", "fileKey", "isDirectory", "isRegularFile", "isSymbolicLink", "isOther"};
        Charset charset = AbstractC0266.a;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 9; i++) {
            hashSet.add(strArr[i]);
        }
        b = hashSet;
    }

    public C24879(InterfaceC24329 interfaceC24329) {
        this.a = interfaceC24329;
    }
}
