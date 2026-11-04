package l;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

/* JADX INFO: renamed from: l.֡᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U42P */
/* JADX INFO: loaded from: classes2.dex */
public class C0776 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C10009 f2802 = new C10009();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C10009 m3172() {
        return this.f2802;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC24329 mo3175(InterfaceC24329 interfaceC24329) {
        try {
            return interfaceC24329.toRealPath(new EnumC20599[0]);
        } catch (IOException unused) {
            return interfaceC24329.toAbsolutePath().normalize();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo3173(InterfaceC24329 interfaceC24329) {
        return C3445.exists(interfaceC24329, new EnumC20599[0]);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean mo3176(InterfaceC24329 interfaceC24329) {
        return C3445.isRegularFile(interfaceC24329, new EnumC20599[0]);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public List mo3174(InterfaceC24329 interfaceC24329) throws IOException {
        JarFile jarFile = new JarFile(interfaceC24329.toFile());
        try {
            Manifest manifest = jarFile.getManifest();
            if (manifest == null) {
                List list = Collections.EMPTY_LIST;
                jarFile.close();
                return list;
            }
            Attributes mainAttributes = manifest.getMainAttributes();
            if (mainAttributes == null) {
                List list2 = Collections.EMPTY_LIST;
                jarFile.close();
                return list2;
            }
            String value = mainAttributes.getValue(Attributes.Name.CLASS_PATH);
            if (value == null) {
                List list3 = Collections.EMPTY_LIST;
                jarFile.close();
                return list3;
            }
            ArrayList arrayList = new ArrayList();
            URL url = interfaceC24329.toUri().toURL();
            StringTokenizer stringTokenizer = new StringTokenizer(value);
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                try {
                    URL url2 = new URL(url, strNextToken);
                    if (strNextToken.indexOf(58) >= 0 && !"file".equalsIgnoreCase(url2.getProtocol())) {
                        url2 = null;
                    }
                    if (url2 != null) {
                        arrayList.add(C6429.of(url2.toURI()));
                    }
                } catch (URISyntaxException e) {
                    throw new IOException(e);
                }
            }
            jarFile.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                jarFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
