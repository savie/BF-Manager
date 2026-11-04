package l;

import java.net.URI;
import java.nio.file.FileSystemNotFoundException;

/* JADX INFO: renamed from: l.ۛ۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6429 {
    public static InterfaceC24329 of(String str, String... strArr) {
        return C16869.getDefault().getPath(str, strArr);
    }

    public static InterfaceC24329 of(URI uri) {
        String scheme = uri.getScheme();
        if (scheme == null) {
            throw new IllegalArgumentException("Missing scheme");
        }
        if (scheme.equalsIgnoreCase("file")) {
            return C16869.getDefault().provider().getPath(uri);
        }
        for (AbstractC22733 abstractC22733 : AbstractC22733.d()) {
            if (abstractC22733.getScheme().equalsIgnoreCase(scheme)) {
                return abstractC22733.getPath(uri);
            }
        }
        throw new FileSystemNotFoundException("Provider \"" + scheme + "\" not installed");
    }
}
