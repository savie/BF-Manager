package l;

import java.net.URI;
import java.nio.file.ProviderNotFoundException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: l.ܺ۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16869 {
    public static AbstractC25075 getDefault() {
        return AbstractC23808.a;
    }

    public static AbstractC25075 getFileSystem(URI uri) {
        String scheme = uri.getScheme();
        for (AbstractC22733 abstractC22733 : AbstractC22733.d()) {
            if (scheme.equalsIgnoreCase(abstractC22733.getScheme())) {
                return abstractC22733.getFileSystem(uri);
            }
        }
        throw new ProviderNotFoundException("Provider \"" + scheme + "\" not found");
    }

    public static AbstractC25075 newFileSystem(URI uri, Map map) {
        return newFileSystem(uri, map, null);
    }

    public static AbstractC25075 newFileSystem(URI uri, Map map, ClassLoader classLoader) {
        String scheme = uri.getScheme();
        for (AbstractC22733 abstractC22733 : AbstractC22733.d()) {
            if (scheme.equalsIgnoreCase(abstractC22733.getScheme())) {
                try {
                    return abstractC22733.newFileSystem(uri, map);
                } catch (UnsupportedOperationException unused) {
                }
            }
        }
        if (classLoader != null) {
            for (AbstractC22733 abstractC22734 : ServiceLoader.load(AbstractC22733.class, classLoader)) {
                if (scheme.equalsIgnoreCase(abstractC22734.getScheme())) {
                    try {
                        return abstractC22734.newFileSystem(uri, map);
                    } catch (UnsupportedOperationException unused2) {
                    }
                }
            }
        }
        throw new ProviderNotFoundException("Provider \"" + scheme + "\" not found");
    }

    public static AbstractC25075 newFileSystem(InterfaceC24329 interfaceC24329, ClassLoader classLoader) {
        interfaceC24329.getClass();
        Map map = Collections.EMPTY_MAP;
        Iterator it = AbstractC22733.d().iterator();
        while (it.hasNext()) {
            try {
                return ((AbstractC22733) it.next()).newFileSystem(interfaceC24329, map);
            } catch (UnsupportedOperationException unused) {
            }
        }
        if (classLoader != null) {
            Iterator it2 = ServiceLoader.load(AbstractC22733.class, classLoader).iterator();
            while (it2.hasNext()) {
                try {
                    return ((AbstractC22733) it2.next()).newFileSystem(interfaceC24329, map);
                } catch (UnsupportedOperationException unused2) {
                }
            }
        }
        throw new ProviderNotFoundException("Provider not found");
    }
}
