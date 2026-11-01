package l;

import java.io.InputStream;
import java.nio.file.AccessDeniedException;
import java.nio.file.ClosedFileSystemException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.NoSuchFileException;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: l.ۡ֡۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 47LN */
/* JADX INFO: loaded from: classes3.dex */
public final class C8525 extends AbstractC3178 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C9936 f29510;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C2455 f29511;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1044 f29514;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12107 f29513 = new C12107("/");

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile boolean f29512 = false;

    @Override // l.AbstractC3178
    public final String getSeparator() {
        return "/";
    }

    @Override // l.AbstractC3178
    public final boolean isReadOnly() {
        return true;
    }

    public C8525(C9936 c9936, InterfaceC3800 interfaceC3800) {
        this.f29510 = c9936;
        C2455 c2455 = new C2455(interfaceC3800.toFile().getPath());
        this.f29511 = c2455;
        this.f29514 = new C1044(c2455.m7466());
    }

    @Override // l.AbstractC3178
    public final AbstractC17455 provider() {
        return this.f29510;
    }

    @Override // l.AbstractC3178, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f29512) {
            return;
        }
        this.f29512 = true;
        this.f29511.close();
    }

    @Override // l.AbstractC3178
    public final boolean isOpen() {
        return !this.f29512;
    }

    @Override // l.AbstractC3178
    public final Iterable getRootDirectories() {
        return Collections.singleton(getPath("/", new String[0]));
    }

    @Override // l.AbstractC3178
    public final Iterable getFileStores() {
        throw new UnsupportedOperationException("getFileStores");
    }

    @Override // l.AbstractC3178
    public final Set supportedFileAttributeViews() {
        return Collections.singleton("basic");
    }

    @Override // l.AbstractC3178
    public final InterfaceC3800 getPath(String str, String... strArr) {
        StringBuilder sb = new StringBuilder(str);
        for (String str2 : strArr) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) != '/' && !str2.startsWith("/")) {
                sb.append("/");
            }
            sb.append(str2);
        }
        return new C7113(this, sb.toString());
    }

    @Override // l.AbstractC3178
    public final InterfaceC6623 getPathMatcher(String str) {
        return C4506.getDefault().getPathMatcher(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m22263(C7113 c7113) throws FileSystemException {
        if (!this.f29512) {
            C12107 c12107M22266 = m22266(c7113);
            if (c12107M22266.isDirectory()) {
                throw new FileSystemException(c7113.f48629, null, "Is a directory");
            }
            return this.f29511.m7471(c12107M22266);
        }
        throw new ClosedFileSystemException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final DirectoryStream m22264(C7113 c7113, DirectoryStream.Filter filter) {
        if (!this.f29512) {
            return new C19108(this, filter, c7113);
        }
        throw new ClosedFileSystemException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22265(C7113 c7113, EnumC14469... enumC14469Arr) throws NoSuchFileException, AccessDeniedException {
        if (!this.f29512) {
            m22266(c7113);
            for (EnumC14469 enumC14469 : enumC14469Arr) {
                if (enumC14469 == EnumC14469.WRITE) {
                    throw new AccessDeniedException(c7113.f48629, null, "Read-only file system");
                }
            }
            return;
        }
        throw new ClosedFileSystemException();
    }

    @Override // l.AbstractC3178
    public final AbstractC5918 getUserPrincipalLookupService() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC3178
    public final InterfaceC8741 newWatchService() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12107 m22266(C7113 c7113) throws NoSuchFileException {
        C12107 c12107;
        String strSubstring = c7113.f48629;
        if (strSubstring.equals("/")) {
            c12107 = this.f29513;
        } else {
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            C2455 c2455 = this.f29511;
            C12107 entry = c2455.getEntry(strSubstring);
            if (entry == null) {
                String strM37076 = C15489.m37076(strSubstring, "/");
                C12107 entry2 = c2455.getEntry(strM37076);
                c12107 = entry2 == null ? (C12107) this.f29514.m25250(strM37076) : entry2;
            } else {
                c12107 = entry;
            }
        }
        if (c12107 != null) {
            return c12107;
        }
        throw new NoSuchFileException(c7113.f48629);
    }
}
