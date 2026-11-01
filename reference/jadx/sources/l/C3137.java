package l;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۗۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3137 implements InterfaceC11957 {
    public static final Set b;
    public final InterfaceC3800 a;

    @Override // l.InterfaceC1684
    public final String name() {
        return "basic";
    }

    @Override // l.InterfaceC11957
    public final InterfaceC20735 readAttributes() {
        boolean z;
        InterfaceC3800 interfaceC3800 = this.a;
        interfaceC3800.getFileSystem().provider().checkAccess(interfaceC3800, new EnumC14469[0]);
        File file = interfaceC3800.toFile();
        C16502 c16502From = C16502.from(file.lastModified(), TimeUnit.MILLISECONDS);
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        try {
            File file2 = file.getParent() == null ? file : new File(file.getParentFile().getCanonicalFile(), file.getName());
            z = !file2.getCanonicalFile().equals(file2.getAbsoluteFile());
        } catch (IOException unused) {
            z = false;
        }
        return new C4589(c16502From, c16502From, c16502From, zIsFile, zIsDirectory, z, (zIsFile || zIsDirectory || z) ? false : true, file.length(), Integer.valueOf(file.hashCode()));
    }

    @Override // l.InterfaceC11957
    public final void a(C16502 c16502, C16502 c16503, C16502 c16504) {
        if (c16502 == null && c16503 == null) {
            return;
        }
        InterfaceC3800 interfaceC3800 = this.a;
        interfaceC3800.getFileSystem().provider().checkAccess(interfaceC3800, EnumC14469.WRITE);
        if (interfaceC3800.toFile().setLastModified(c16502.to(TimeUnit.MILLISECONDS))) {
            return;
        }
        throw new IOException("File.setLastModified did not succeed on " + interfaceC3800);
    }

    static {
        String[] strArr = {"size", "creationTime", "lastAccessTime", "lastModifiedTime", "fileKey", "isDirectory", "isRegularFile", "isSymbolicLink", "isOther"};
        Charset charset = AbstractC17995.a;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 9; i++) {
            hashSet.add(strArr[i]);
        }
        b = hashSet;
    }

    public C3137(InterfaceC3800 interfaceC3800) {
        this.a = interfaceC3800;
    }
}
