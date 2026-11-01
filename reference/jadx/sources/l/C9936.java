package l;

import java.io.InputStream;
import java.net.URI;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessDeniedException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.NoSuchFileException;
import java.nio.file.ProviderMismatchException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۤ֡۟, reason: contains not printable characters */
/* JADX INFO: compiled from: B7L8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9936 extends AbstractC17455 {
    @Override // l.AbstractC17455
    public final String getScheme() {
        return "jar";
    }

    @Override // l.AbstractC17455
    public final boolean isHidden(InterfaceC3800 interfaceC3800) {
        return false;
    }

    @Override // l.AbstractC17455
    public final AbstractC3178 newFileSystem(InterfaceC3800 interfaceC3800, Map map) {
        if (!C5212.exists(interfaceC3800, new EnumC22146[0])) {
            throw new FileSystemNotFoundException("JAR file not found: " + interfaceC3800);
        }
        return new C8525(this, interfaceC3800);
    }

    @Override // l.AbstractC17455
    public final InputStream newInputStream(InterfaceC3800 interfaceC3800, InterfaceC0978... interfaceC0978Arr) {
        if (!(interfaceC3800 instanceof C7113)) {
            throw new ProviderMismatchException();
        }
        C7113 c7113 = (C7113) interfaceC3800;
        return c7113.getFileSystem().m22263(c7113);
    }

    @Override // l.AbstractC17455
    public final DirectoryStream newDirectoryStream(InterfaceC3800 interfaceC3800, DirectoryStream.Filter filter) {
        if (!(interfaceC3800 instanceof C7113)) {
            throw new ProviderMismatchException();
        }
        C7113 c7113 = (C7113) interfaceC3800;
        return c7113.getFileSystem().m22264(c7113, filter);
    }

    @Override // l.AbstractC17455
    public final void checkAccess(InterfaceC3800 interfaceC3800, EnumC14469... enumC14469Arr) throws NoSuchFileException, AccessDeniedException {
        if (!(interfaceC3800 instanceof C7113)) {
            throw new ProviderMismatchException();
        }
        C7113 c7113 = (C7113) interfaceC3800;
        c7113.getFileSystem().m22265(c7113, enumC14469Arr);
    }

    @Override // l.AbstractC17455
    public final InterfaceC20735 readAttributes(InterfaceC3800 interfaceC3800, Class cls, EnumC22146... enumC22146Arr) {
        if (!(interfaceC3800 instanceof C7113)) {
            throw new ProviderMismatchException();
        }
        C7113 c7113 = (C7113) interfaceC3800;
        C8525 fileSystem = c7113.getFileSystem();
        if (cls != InterfaceC20735.class) {
            fileSystem.getClass();
            throw new UnsupportedOperationException("Attribute type not supported: " + cls);
        }
        return new C21224(fileSystem.m22266(c7113));
    }

    @Override // l.AbstractC17455
    public final Map readAttributes(InterfaceC3800 interfaceC3800, String str, EnumC22146... enumC22146Arr) throws NoSuchFileException {
        if (!(interfaceC3800 instanceof C7113)) {
            throw new ProviderMismatchException();
        }
        C7113 c7113 = (C7113) interfaceC3800;
        C12107 c12107M22266 = c7113.getFileSystem().m22266(c7113);
        HashMap map = new HashMap();
        C21224 c21224 = new C21224(c12107M22266);
        if (!str.equals("*") && !str.equals("basic:*")) {
            return map;
        }
        map.put("size", Long.valueOf(c21224.size()));
        map.put("isDirectory", Boolean.valueOf(c21224.isDirectory()));
        map.put("isRegularFile", Boolean.valueOf(c21224.isRegularFile()));
        map.put("lastModifiedTime", c21224.lastModifiedTime());
        map.put("creationTime", c21224.creationTime());
        map.put("lastAccessTime", c21224.lastAccessTime());
        return map;
    }

    @Override // l.AbstractC17455
    public final boolean isSameFile(InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801) {
        return interfaceC3800.equals(interfaceC3801);
    }

    @Override // l.AbstractC17455
    public final AbstractC3178 newFileSystem(URI uri, Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC17455
    public final AbstractC3178 getFileSystem(URI uri) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC17455
    public final InterfaceC3800 getPath(URI uri) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC17455
    public final SeekableByteChannel newByteChannel(InterfaceC3800 interfaceC3800, Set set, InterfaceC20030... interfaceC20030Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC17455
    public final void createDirectory(InterfaceC3800 interfaceC3800, InterfaceC20030... interfaceC20030Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC17455
    public final void delete(InterfaceC3800 interfaceC3800) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC17455
    public final void copy(InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801, InterfaceC1767... interfaceC1767Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC17455
    public final void move(InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801, InterfaceC1767... interfaceC1767Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC17455
    public final AbstractC9530 getFileStore(InterfaceC3800 interfaceC3800) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC17455
    public final InterfaceC0273 getFileAttributeView(InterfaceC3800 interfaceC3800, Class cls, EnumC22146... enumC22146Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC17455
    public final void setAttribute(InterfaceC3800 interfaceC3800, String str, Object obj, EnumC22146... enumC22146Arr) {
        throw new UnsupportedOperationException();
    }
}
