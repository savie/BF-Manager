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

/* JADX INFO: renamed from: l.᩸ۚ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: U42P */
/* JADX INFO: loaded from: classes4.dex */
public class C21369 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9936 f69503 = new C9936();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C9936 m47900() {
        return this.f69503;
    }

    /* JADX INFO: renamed from: ܰ */
    public InterfaceC3800 mo36011(InterfaceC3800 interfaceC3800) {
        try {
            return interfaceC3800.toRealPath(new EnumC22146[0]);
        } catch (IOException unused) {
            return interfaceC3800.toAbsolutePath().normalize();
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo36009(InterfaceC3800 interfaceC3800) {
        return C5212.exists(interfaceC3800, new EnumC22146[0]);
    }

    /* JADX INFO: renamed from: ۖ */
    public boolean mo36008(InterfaceC3800 interfaceC3800) {
        return C5212.isRegularFile(interfaceC3800, new EnumC22146[0]);
    }

    /* JADX INFO: renamed from: ۨ */
    public List mo36010(InterfaceC3800 interfaceC3800) throws IOException {
        JarFile jarFile = new JarFile(interfaceC3800.toFile());
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
            URL url = interfaceC3800.toUri().toURL();
            StringTokenizer stringTokenizer = new StringTokenizer(value);
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                try {
                    URL url2 = new URL(url, strNextToken);
                    if (strNextToken.indexOf(58) >= 0 && !"file".equalsIgnoreCase(url2.getProtocol())) {
                        url2 = null;
                    }
                    if (url2 != null) {
                        arrayList.add(C12974.of(url2.toURI()));
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
