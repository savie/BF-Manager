package l;

import java.io.InputStream;
import java.nio.file.AccessDeniedException;
import java.nio.file.ClosedFileSystemException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.NoSuchFileException;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩳۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47LN */
/* JADX INFO: loaded from: classes5.dex */
public final class C18960 extends AbstractC25075 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C22941 f61474;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C10009 f61476;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13244 f61477;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C8002 f61473 = new C8002("/");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f61475 = false;

    @Override // l.AbstractC25075
    public final String getSeparator() {
        return "/";
    }

    @Override // l.AbstractC25075
    public final boolean isReadOnly() {
        return true;
    }

    public C18960(C10009 c10009, InterfaceC24329 interfaceC24329) {
        this.f61476 = c10009;
        C22941 c22941 = new C22941(interfaceC24329.toFile().getPath());
        this.f61474 = c22941;
        this.f61477 = new C13244(c22941.m51742());
    }

    @Override // l.AbstractC25075
    public final AbstractC22733 provider() {
        return this.f61476;
    }

    @Override // l.AbstractC25075, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f61475) {
            return;
        }
        this.f61475 = true;
        this.f61474.close();
    }

    @Override // l.AbstractC25075
    public final boolean isOpen() {
        return !this.f61475;
    }

    @Override // l.AbstractC25075
    public final Iterable getRootDirectories() {
        return Collections.singleton(getPath("/", new String[0]));
    }

    @Override // l.AbstractC25075
    public final Iterable getFileStores() {
        throw new UnsupportedOperationException("getFileStores");
    }

    @Override // l.AbstractC25075
    public final Set supportedFileAttributeViews() {
        return Collections.singleton("basic");
    }

    @Override // l.AbstractC25075
    public final InterfaceC24329 getPath(String str, String... strArr) {
        StringBuilder sb = new StringBuilder(str);
        for (String str2 : strArr) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) != '/' && !str2.startsWith("/")) {
                sb.append("/");
            }
            sb.append(str2);
        }
        return new C1061(this, sb.toString());
    }

    @Override // l.AbstractC25075
    public final InterfaceC4191 getPathMatcher(String str) {
        return C16869.getDefault().getPathMatcher(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m44041(C1061 c1061) throws FileSystemException {
        if (!this.f61475) {
            C8002 c8002M44044 = m44044(c1061);
            if (c8002M44044.isDirectory()) {
                throw new FileSystemException(c1061.f45594, null, "Is a directory");
            }
            return this.f61474.m51727(c8002M44044);
        }
        throw new ClosedFileSystemException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final DirectoryStream m44042(C1061 c1061, DirectoryStream.Filter filter) {
        if (!this.f61475) {
            return new C7773(this, filter, c1061);
        }
        throw new ClosedFileSystemException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44043(C1061 c1061, EnumC5683... enumC5683Arr) throws NoSuchFileException, AccessDeniedException {
        if (!this.f61475) {
            m44044(c1061);
            for (EnumC5683 enumC5683 : enumC5683Arr) {
                if (enumC5683 == EnumC5683.WRITE) {
                    throw new AccessDeniedException(c1061.f45594, null, "Read-only file system");
                }
            }
            return;
        }
        throw new ClosedFileSystemException();
    }

    @Override // l.AbstractC25075
    public final AbstractC19575 getUserPrincipalLookupService() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC25075
    public final InterfaceC1208 newWatchService() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8002 m44044(C1061 c1061) throws NoSuchFileException {
        C8002 c8002;
        String strSubstring = c1061.f45594;
        if (strSubstring.equals("/")) {
            c8002 = this.f61473;
        } else {
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            C22941 c22941 = this.f61474;
            C8002 entry = c22941.getEntry(strSubstring);
            if (entry == null) {
                String strM34972 = C14483.m34972(strSubstring, "/");
                C8002 entry2 = c22941.getEntry(strM34972);
                c8002 = entry2 == null ? (C8002) this.f61477.m18364(strM34972) : entry2;
            } else {
                c8002 = entry;
            }
        }
        if (c8002 != null) {
            return c8002;
        }
        throw new NoSuchFileException(c1061.f45594);
    }
}
