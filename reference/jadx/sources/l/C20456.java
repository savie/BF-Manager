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

/* JADX INFO: renamed from: l.᩶᩹۟, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C20456 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3800 f66385;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final InterfaceC3800 f66386;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C20414 f66387;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C21369 f66388;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f66389;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C21410 f66393;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f66394 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f66390 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Map f66392 = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public HashMap f66391 = new HashMap();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public EnumMap f66395 = new EnumMap(EnumC19730.class);

    /* JADX WARN: Code duplicated, block: B:13:0x0049  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m46266(C20456 c20456, Collection collection, InterfaceC3800 interfaceC3800) {
        InterfaceC3800 interfaceC3801;
        c20456.getClass();
        if (collection != null) {
            if (interfaceC3800.getFileSystem().provider() == c20456.f66388.m47900()) {
                URI uri = interfaceC3800.toUri();
                if (uri.getScheme().equals("jar")) {
                    String schemeSpecificPart = uri.getSchemeSpecificPart();
                    int iLastIndexOf = schemeSpecificPart.lastIndexOf("!");
                    if (!schemeSpecificPart.startsWith("file:") || iLastIndexOf <= 0) {
                        interfaceC3801 = null;
                    } else {
                        interfaceC3801 = C22852.get(URI.create(schemeSpecificPart.substring(0, iLastIndexOf)));
                    }
                } else {
                    interfaceC3801 = null;
                }
            } else {
                interfaceC3801 = null;
            }
            InterfaceC3800 interfaceC3800M46261 = m46261(interfaceC3800);
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                InterfaceC3800 interfaceC3800M46262 = m46261((InterfaceC3800) it.next());
                if (interfaceC3800M46262.getFileSystem() == interfaceC3800M46261.getFileSystem() && C5212.isDirectory(interfaceC3800M46262, new EnumC22146[0]) && interfaceC3800M46261.startsWith(interfaceC3800M46262)) {
                    return true;
                }
                if (interfaceC3801 != null && C5212.isSameFile(interfaceC3801, interfaceC3800M46262)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m46267(C20456 c20456, InterfaceC3800 interfaceC3800) {
        c20456.getClass();
        String lowerCase = interfaceC3800.getFileName().toString().toLowerCase(Locale.US);
        if (c20456.f66388.mo36008(interfaceC3800)) {
            return lowerCase.endsWith(".jar") || lowerCase.endsWith(".zip");
        }
        return false;
    }

    static {
        InterfaceC3800 path = C4506.getDefault().getPath(System.getProperty("java.home"), new String[0]);
        f66385 = path;
        f66386 = path.resolve("lib").resolve("modules");
    }

    public C20456() {
        AbstractC9376[] abstractC9376Arr = {new C3024(this), new C4933(this), new C7756(this, EnumC3584.SOURCE_PATH, EnumC19730.f63394), new C7756(this, EnumC3584.ANNOTATION_PROCESSOR_PATH, EnumC19730.f63376), new C7756(this, EnumC3584.ANNOTATION_PROCESSOR_MODULE_PATH, EnumC19730.f63403), new C19045(this, EnumC3584.CLASS_OUTPUT, EnumC19730.f63321), new C19045(this, EnumC3584.SOURCE_OUTPUT, EnumC19730.f63350), new C19045(this, EnumC3584.NATIVE_HEADER_OUTPUT, EnumC19730.f63319), new C23279(this), new C8462(this), new C1405(this, EnumC3584.UPGRADE_MODULE_PATH, EnumC19730.f63320), new C1405(this, EnumC3584.MODULE_PATH, EnumC19730.f63325), new C16223(this)};
        for (int i = 0; i < 13; i++) {
            AbstractC9376 abstractC9376 = abstractC9376Arr[i];
            this.f66391.put(abstractC9376.f31747, abstractC9376);
            Iterator it = abstractC9376.f31746.iterator();
            while (it.hasNext()) {
                this.f66395.put((EnumC19730) it.next(), abstractC9376);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 m46271(String str, String... strArr) {
        try {
            return C22852.get(str, strArr);
        } catch (InvalidPathException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46273() throws IOException {
        C19003 c19003 = new C19003();
        C0356.forEach(this.f66390, new C10134(1, c19003));
        if (c19003.m43722()) {
            IOException iOException = new IOException();
            Iterator it = c19003.iterator();
            while (it.hasNext()) {
                iOException.addSuppressed((IOException) it.next());
            }
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46275(C20414 c20414, boolean z, C21369 c21369) {
        this.f66387 = c20414;
        this.f66389 = z;
        this.f66388 = c21369;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19003 m46263(C20456 c20456, String str) {
        return c20456.m46262(str, (InterfaceC3800) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C19003 m46262(String str, InterfaceC3800 interfaceC3800) {
        C19003 c19003 = new C19003();
        for (String str2 : str.split(Pattern.quote(File.pathSeparator), -1)) {
            if (!str2.isEmpty()) {
                try {
                    c19003.m43723(m46271(str2, new String[0]));
                } catch (IllegalArgumentException unused) {
                    if (this.f66389) {
                        C20414 c20414 = this.f66387;
                        EnumC0597 enumC0597 = EnumC0597.PATH;
                        C14065 c14065 = C9768.f32836;
                        c20414.m48195(enumC0597, new C14065("compiler", "invalid.path", str2));
                    }
                }
            } else if (interfaceC3800 != null) {
                c19003.m43723(interfaceC3800);
            }
        }
        return c19003;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46274(String str) {
        this.f66392 = Collections.singletonMap("releaseVersion", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC14107 m46272(InterfaceC4290 interfaceC4290) {
        C13638.requireNonNull(interfaceC4290);
        return interfaceC4290 instanceof AbstractC14107 ? (AbstractC14107) interfaceC4290 : (AbstractC14107) this.f66391.get(interfaceC4290);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC3800 m46261(InterfaceC3800 interfaceC3800) {
        try {
            return interfaceC3800.toRealPath(new EnumC22146[0]);
        } catch (IOException unused) {
            return interfaceC3800.toAbsolutePath().normalize();
        }
    }
}
