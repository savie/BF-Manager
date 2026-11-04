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

/* JADX INFO: renamed from: l.ۢۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7L8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10009 extends AbstractC22733 {
    @Override // l.AbstractC22733
    public final String getScheme() {
        return "jar";
    }

    @Override // l.AbstractC22733
    public final boolean isHidden(InterfaceC24329 interfaceC24329) {
        return false;
    }

    @Override // l.AbstractC22733
    public final AbstractC25075 newFileSystem(InterfaceC24329 interfaceC24329, Map map) {
        if (!C3445.exists(interfaceC24329, new EnumC20599[0])) {
            throw new FileSystemNotFoundException("JAR file not found: " + interfaceC24329);
        }
        return new C18960(this, interfaceC24329);
    }

    @Override // l.AbstractC22733
    public final InputStream newInputStream(InterfaceC24329 interfaceC24329, InterfaceC12394... interfaceC12394Arr) {
        if (!(interfaceC24329 instanceof C1061)) {
            throw new ProviderMismatchException();
        }
        C1061 c1061 = (C1061) interfaceC24329;
        return c1061.getFileSystem().m44041(c1061);
    }

    @Override // l.AbstractC22733
    public final DirectoryStream newDirectoryStream(InterfaceC24329 interfaceC24329, DirectoryStream.Filter filter) {
        if (!(interfaceC24329 instanceof C1061)) {
            throw new ProviderMismatchException();
        }
        C1061 c1061 = (C1061) interfaceC24329;
        return c1061.getFileSystem().m44042(c1061, filter);
    }

    @Override // l.AbstractC22733
    public final void checkAccess(InterfaceC24329 interfaceC24329, EnumC5683... enumC5683Arr) throws NoSuchFileException, AccessDeniedException {
        if (!(interfaceC24329 instanceof C1061)) {
            throw new ProviderMismatchException();
        }
        C1061 c1061 = (C1061) interfaceC24329;
        c1061.getFileSystem().m44043(c1061, enumC5683Arr);
    }

    @Override // l.AbstractC22733
    public final InterfaceC8665 readAttributes(InterfaceC24329 interfaceC24329, Class cls, EnumC20599... enumC20599Arr) {
        if (!(interfaceC24329 instanceof C1061)) {
            throw new ProviderMismatchException();
        }
        C1061 c1061 = (C1061) interfaceC24329;
        C18960 fileSystem = c1061.getFileSystem();
        if (cls == InterfaceC8665.class) {
            return new C21198(fileSystem.m44044(c1061));
        }
        fileSystem.getClass();
        throw new UnsupportedOperationException(C24966.m55772(cls, "Attribute type not supported: "));
    }

    @Override // l.AbstractC22733
    public final Map readAttributes(InterfaceC24329 interfaceC24329, String str, EnumC20599... enumC20599Arr) throws NoSuchFileException {
        if (!(interfaceC24329 instanceof C1061)) {
            throw new ProviderMismatchException();
        }
        C1061 c1061 = (C1061) interfaceC24329;
        C8002 c8002M44044 = c1061.getFileSystem().m44044(c1061);
        HashMap map = new HashMap();
        C21198 c21198 = new C21198(c8002M44044);
        if (!str.equals("*") && !str.equals("basic:*")) {
            return map;
        }
        map.put("size", Long.valueOf(c21198.size()));
        map.put("isDirectory", Boolean.valueOf(c21198.isDirectory()));
        map.put("isRegularFile", Boolean.valueOf(c21198.isRegularFile()));
        map.put("lastModifiedTime", c21198.lastModifiedTime());
        map.put("creationTime", c21198.creationTime());
        map.put("lastAccessTime", c21198.lastAccessTime());
        return map;
    }

    @Override // l.AbstractC22733
    public final boolean isSameFile(InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210) {
        return interfaceC24329.equals(interfaceC243210);
    }

    @Override // l.AbstractC22733
    public final AbstractC25075 newFileSystem(URI uri, Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC22733
    public final AbstractC25075 getFileSystem(URI uri) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC22733
    public final InterfaceC24329 getPath(URI uri) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC22733
    public final SeekableByteChannel newByteChannel(InterfaceC24329 interfaceC24329, Set set, InterfaceC13885... interfaceC13885Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC22733
    public final void createDirectory(InterfaceC24329 interfaceC24329, InterfaceC13885... interfaceC13885Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC22733
    public final void delete(InterfaceC24329 interfaceC24329) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC22733
    public final void copy(InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210, InterfaceC1954... interfaceC1954Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC22733
    public final void move(InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210, InterfaceC1954... interfaceC1954Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC22733
    public final AbstractC11648 getFileStore(InterfaceC24329 interfaceC24329) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC22733
    public final InterfaceC4659 getFileAttributeView(InterfaceC24329 interfaceC24329, Class cls, EnumC20599... enumC20599Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC22733
    public final void setAttribute(InterfaceC24329 interfaceC24329, String str, Object obj, EnumC20599... enumC20599Arr) {
        throw new UnsupportedOperationException();
    }
}
