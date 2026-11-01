package l;

import java.net.URI;
import java.nio.file.FileSystemNotFoundException;

/* JADX INFO: renamed from: l.۬۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12974 {
    public static InterfaceC3800 of(String str, String... strArr) {
        return C4506.getDefault().getPath(str, strArr);
    }

    public static InterfaceC3800 of(URI uri) {
        String scheme = uri.getScheme();
        if (scheme == null) {
            throw new IllegalArgumentException("Missing scheme");
        }
        if (scheme.equalsIgnoreCase("file")) {
            return C4506.getDefault().provider().getPath(uri);
        }
        for (AbstractC17455 abstractC17455 : AbstractC17455.d()) {
            if (abstractC17455.getScheme().equalsIgnoreCase(scheme)) {
                return abstractC17455.getPath(uri);
            }
        }
        throw new FileSystemNotFoundException("Provider \"" + scheme + "\" not installed");
    }
}
