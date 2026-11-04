package l;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.InvalidPathException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩷ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes.dex */
public final class C22185 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC24329 f71476;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final InterfaceC24329 f71477;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f71478;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C7599 f71480;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C7312 f71482;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C0776 f71486;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f71485 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f71479 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Map f71481 = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public HashMap f71484 = new HashMap();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public EnumMap f71483 = new EnumMap(EnumC7687.class);

    /* JADX WARN: Code duplicated, block: B:13:0x0049  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50187(C22185 c22185, Collection collection, InterfaceC24329 interfaceC24329) {
        InterfaceC24329 interfaceC243210;
        c22185.getClass();
        if (collection != null) {
            if (interfaceC24329.getFileSystem().provider() == c22185.f71486.m3172()) {
                URI uri = interfaceC24329.toUri();
                if (uri.getScheme().equals("jar")) {
                    String schemeSpecificPart = uri.getSchemeSpecificPart();
                    int iLastIndexOf = schemeSpecificPart.lastIndexOf("!");
                    if (!schemeSpecificPart.startsWith("file:") || iLastIndexOf <= 0) {
                        interfaceC243210 = null;
                    } else {
                        interfaceC243210 = C14631.get(URI.create(schemeSpecificPart.substring(0, iLastIndexOf)));
                    }
                } else {
                    interfaceC243210 = null;
                }
            } else {
                interfaceC243210 = null;
            }
            InterfaceC24329 interfaceC24329M50185 = m50185(interfaceC24329);
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                InterfaceC24329 interfaceC24329M50186 = m50185((InterfaceC24329) it.next());
                if (interfaceC24329M50186.getFileSystem() == interfaceC24329M50185.getFileSystem() && C3445.isDirectory(interfaceC24329M50186, new EnumC20599[0]) && interfaceC24329M50185.startsWith(interfaceC24329M50186)) {
                    return true;
                }
                if (interfaceC243210 != null && C3445.isSameFile(interfaceC243210, interfaceC24329M50186)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m50188(C22185 c22185, InterfaceC24329 interfaceC24329) {
        c22185.getClass();
        String lowerCase = interfaceC24329.getFileName().toString().toLowerCase(Locale.US);
        if (c22185.f71486.mo3176(interfaceC24329)) {
            return lowerCase.endsWith(".jar") || lowerCase.endsWith(".zip");
        }
        return false;
    }

    static {
        InterfaceC24329 path = C16869.getDefault().getPath(System.getProperty("java.home"), new String[0]);
        f71476 = path;
        f71477 = path.resolve("lib").resolve("modules");
    }

    public C22185() {
        AbstractC16941[] abstractC16941Arr = {new C17687(this), new C16195(this), new C7246(this, EnumC6282.SOURCE_PATH, EnumC7687.f25291), new C7246(this, EnumC6282.ANNOTATION_PROCESSOR_PATH, EnumC7687.f25336), new C7246(this, EnumC6282.ANNOTATION_PROCESSOR_MODULE_PATH, EnumC7687.f25364), new C10228(this, EnumC6282.CLASS_OUTPUT, EnumC7687.f25320), new C10228(this, EnumC6282.SOURCE_OUTPUT, EnumC7687.f25289), new C10228(this, EnumC6282.NATIVE_HEADER_OUTPUT, EnumC7687.f25340), new C18433(this), new C1280(this), new C24401(this, EnumC6282.UPGRADE_MODULE_PATH, EnumC7687.f25341), new C24401(this, EnumC6282.MODULE_PATH, EnumC7687.f25306), new C5031(this)};
        for (int i = 0; i < 13; i++) {
            AbstractC16941 abstractC16941 = abstractC16941Arr[i];
            this.f71484.put(abstractC16941.f55348, abstractC16941);
            Iterator it = abstractC16941.f55347.iterator();
            while (it.hasNext()) {
                this.f71483.put((EnumC7687) it.next(), abstractC16941);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 m50194(String str, String... strArr) {
        try {
            return C14631.get(str, strArr);
        } catch (InvalidPathException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50195() throws IOException {
        C18499 c18499 = new C18499();
        C4937.forEach(this.f71479, new C11720(0, c18499));
        if (c18499.m43096()) {
            IOException iOException = new IOException();
            Iterator it = c18499.iterator();
            while (it.hasNext()) {
                iOException.addSuppressed((IOException) it.next());
            }
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50197(C7312 c7312, boolean z, C0776 c0776) {
        this.f71482 = c7312;
        this.f71478 = z;
        this.f71486 = c0776;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18499 m50183(C22185 c22185, String str) {
        return c22185.m50182(str, (InterfaceC24329) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18499 m50182(String str, InterfaceC24329 interfaceC24329) {
        C18499 c18499 = new C18499();
        for (String str2 : str.split(Pattern.quote(File.pathSeparator), -1)) {
            if (!str2.isEmpty()) {
                try {
                    c18499.m43089(m50194(str2, new String[0]));
                } catch (IllegalArgumentException unused) {
                    if (this.f71478) {
                        C7312 c7312 = this.f71482;
                        EnumC19876 enumC19876 = EnumC19876.PATH;
                        C25213 c25213 = C13146.f42046;
                        c7312.m34528(enumC19876, new C25213("compiler", "invalid.path", str2));
                    }
                }
            } else if (interfaceC24329 != null) {
                c18499.m43089(interfaceC24329);
            }
        }
        return c18499;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50196(String str) {
        this.f71481 = Collections.singletonMap("releaseVersion", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23655 m50193(InterfaceC24928 interfaceC24928) {
        C17359.requireNonNull(interfaceC24928);
        return interfaceC24928 instanceof AbstractC23655 ? (AbstractC23655) interfaceC24928 : (AbstractC23655) this.f71484.get(interfaceC24928);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC24329 m50185(InterfaceC24329 interfaceC24329) {
        try {
            return interfaceC24329.toRealPath(new EnumC20599[0]);
        } catch (IOException unused) {
            return interfaceC24329.toAbsolutePath().normalize();
        }
    }
}
