package l;

import java.net.URI;
import java.nio.file.ProviderNotFoundException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: l.ۙ۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4506 {
    public static AbstractC3178 getDefault() {
        return AbstractC2637.a;
    }

    public static AbstractC3178 getFileSystem(URI uri) {
        String scheme = uri.getScheme();
        for (AbstractC17455 abstractC17455 : AbstractC17455.d()) {
            if (scheme.equalsIgnoreCase(abstractC17455.getScheme())) {
                return abstractC17455.getFileSystem(uri);
            }
        }
        throw new ProviderNotFoundException("Provider \"" + scheme + "\" not found");
    }

    public static AbstractC3178 newFileSystem(URI uri, Map map) {
        return newFileSystem(uri, map, null);
    }

    public static AbstractC3178 newFileSystem(URI uri, Map map, ClassLoader classLoader) {
        String scheme = uri.getScheme();
        for (AbstractC17455 abstractC17455 : AbstractC17455.d()) {
            if (scheme.equalsIgnoreCase(abstractC17455.getScheme())) {
                try {
                    return abstractC17455.newFileSystem(uri, map);
                } catch (UnsupportedOperationException unused) {
                }
            }
        }
        if (classLoader != null) {
            for (AbstractC17455 abstractC17456 : ServiceLoader.load(AbstractC17455.class, classLoader)) {
                if (scheme.equalsIgnoreCase(abstractC17456.getScheme())) {
                    try {
                        return abstractC17456.newFileSystem(uri, map);
                    } catch (UnsupportedOperationException unused2) {
                    }
                }
            }
        }
        throw new ProviderNotFoundException("Provider \"" + scheme + "\" not found");
    }

    public static AbstractC3178 newFileSystem(InterfaceC3800 interfaceC3800, ClassLoader classLoader) {
        interfaceC3800.getClass();
        Map map = Collections.EMPTY_MAP;
        Iterator it = AbstractC17455.d().iterator();
        while (it.hasNext()) {
            try {
                return ((AbstractC17455) it.next()).newFileSystem(interfaceC3800, map);
            } catch (UnsupportedOperationException unused) {
            }
        }
        if (classLoader != null) {
            Iterator it2 = ServiceLoader.load(AbstractC17455.class, classLoader).iterator();
            while (it2.hasNext()) {
                try {
                    return ((AbstractC17455) it2.next()).newFileSystem(interfaceC3800, map);
                } catch (UnsupportedOperationException unused2) {
                }
            }
        }
        throw new ProviderNotFoundException("Provider not found");
    }
}
