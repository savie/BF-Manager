package l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۛܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C6501 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24401 f21831;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Iterator f21833;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f21834 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Set f21832 = null;

    public C6501(C24401 c24401) {
        this.f21831 = c24401;
        this.f21833 = c24401.f23892.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws Throwable {
        Set setSingleton;
        Set setSingleton2;
        Throwable th;
        InterfaceC24329 interfaceC24329;
        C24401 c24401 = this.f21831;
        InterfaceC24928 interfaceC24928 = c24401.f55348;
        C22185 c22185 = c24401.f79168;
        int i = 1;
        if (this.f21832 != null) {
            return true;
        }
        while (this.f21832 == null) {
            Iterator it = this.f21833;
            int i2 = 0;
            if (!it.hasNext()) {
                return false;
            }
            InterfaceC24329 interfaceC243210 = (InterfaceC24329) it.next();
            String str = "[";
            String str2 = ":";
            String str3 = "]";
            if (C3445.isDirectory(interfaceC243210, new EnumC20599[0])) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    DirectoryStream directoryStreamNewDirectoryStream = C3445.newDirectoryStream(interfaceC243210);
                    try {
                        Iterator it2 = directoryStreamNewDirectoryStream.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                interfaceC24329 = null;
                                break;
                            }
                            try {
                                interfaceC24329 = (InterfaceC24329) it2.next();
                                if (interfaceC24329.endsWith("module-info.class")) {
                                    break;
                                }
                                linkedHashSet.add(interfaceC24329);
                            } catch (Throwable th2) {
                                th = th2;
                                if (directoryStreamNewDirectoryStream != null) {
                                    try {
                                        try {
                                            directoryStreamNewDirectoryStream.close();
                                        } catch (Throwable th3) {
                                            th.addSuppressed(th3);
                                        }
                                    } catch (IOException | DirectoryIteratorException unused) {
                                        C7312 c7312 = c22185.f71482;
                                        C11040 c11040 = C22843.f74058;
                                        c7312.m34525(new C11040("compiler", "locn.cant.read.directory", interfaceC243210));
                                        setSingleton2 = Collections.EMPTY_SET;
                                        this.f21832 = setSingleton2;
                                        this.f21834++;
                                        c24401 = c24401;
                                        i = 1;
                                    }
                                }
                                throw th;
                            }
                        }
                        directoryStreamNewDirectoryStream.close();
                        if (interfaceC24329 != null) {
                            try {
                                String strM18353 = m18353(interfaceC24329);
                                setSingleton2 = Collections.singleton(new C3517(c22185, c24401, interfaceC24928.getName() + "[" + this.f21834 + ":" + strM18353 + "]", strM18353, Collections.singletonList(interfaceC243210), false));
                            } catch (IOException unused2) {
                                c22185.f71482.m34525(C22843.m51556(interfaceC243210));
                                setSingleton2 = Collections.EMPTY_SET;
                            } catch (C0141 unused3) {
                                C7312 c7313 = c22185.f71482;
                                C11040 c11041 = C22843.f74058;
                                Object[] objArr = new Object[i];
                                objArr[0] = interfaceC243210;
                                c7313.m34525(new C11040("compiler", "locn.bad.module-info", objArr));
                                setSingleton2 = Collections.EMPTY_SET;
                            }
                            c24401 = c24401;
                        } else {
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            Iterator it3 = linkedHashSet.iterator();
                            while (it3.hasNext()) {
                                C5558 c5558M18352 = m18352((InterfaceC24329) it3.next());
                                if (c5558M18352 != null) {
                                    String str4 = (String) c5558M18352.f19300;
                                    linkedHashSet2.add(new C3517(c22185, c24401, interfaceC24928.getName() + str + this.f21834 + "." + i2 + str2 + str4 + str3, str4, Collections.singletonList((InterfaceC24329) c5558M18352.f19301), false));
                                    str2 = str2;
                                    str = str;
                                    str3 = str3;
                                    i2++;
                                    c24401 = c24401;
                                    it3 = it3;
                                }
                            }
                            c24401 = c24401;
                            setSingleton2 = linkedHashSet2;
                        }
                        this.f21832 = setSingleton2;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (IOException | DirectoryIteratorException unused4) {
                    c24401 = c24401;
                }
            } else {
                c24401 = c24401;
                C5558 c5558M18353 = m18352(interfaceC243210);
                if (c5558M18353 == null) {
                    setSingleton = Collections.EMPTY_SET;
                } else {
                    String str5 = (String) c5558M18353.f19300;
                    setSingleton = Collections.singleton(new C3517(c22185, c24401, interfaceC24928.getName() + "[" + this.f21834 + ":" + str5 + "]", str5, Collections.singletonList((InterfaceC24329) c5558M18353.f19301), false));
                }
                this.f21832 = setSingleton;
            }
            this.f21834++;
            c24401 = c24401;
            i = 1;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() throws Throwable {
        hasNext();
        Set set = this.f21832;
        if (set != null) {
            this.f21832 = null;
            return set;
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5558 m18352(InterfaceC24329 interfaceC24329) throws Throwable {
        String value;
        boolean zM49269;
        C22185 c22185 = this.f21831.f79168;
        if (C3445.isDirectory(interfaceC24329, new EnumC20599[0])) {
            if (C3445.exists(interfaceC24329.resolve("module-info.class"), new EnumC20599[0]) || C3445.exists(interfaceC24329.resolve("module-info.sig"), new EnumC20599[0])) {
                String string = interfaceC24329.getFileName().toString();
                if (EnumC21704.m49269(string)) {
                    return new C5558(string, interfaceC24329);
                }
            }
            return null;
        }
        if (!interfaceC24329.getFileName().toString().endsWith(".jar") || !c22185.f71486.mo3173(interfaceC24329)) {
            if (interfaceC24329.getFileName().toString().endsWith(".jmod")) {
                try {
                    C24182.m54156(interfaceC24329);
                    if (((AbstractC25075) c22185.f71485.get(interfaceC24329)) == null) {
                        C10009 c10009M3172 = c22185.f71486.m3172();
                        if (c10009M3172 == null) {
                            c22185.f71482.m34525(C22843.m51556(interfaceC24329));
                            return null;
                        }
                        AbstractC25075 abstractC25075NewFileSystem = c10009M3172.newFileSystem(interfaceC24329, Collections.EMPTY_MAP);
                        try {
                            String strM18353 = m18353(abstractC25075NewFileSystem.getPath("classes/module-info.class", new String[0]));
                            InterfaceC24329 path = abstractC25075NewFileSystem.getPath("classes", new String[0]);
                            c22185.f71485.put(interfaceC24329, abstractC25075NewFileSystem);
                            c22185.f71479.add(abstractC25075NewFileSystem);
                            try {
                                return new C5558(strM18353, path);
                            } catch (Throwable th) {
                                th = th;
                                abstractC25075NewFileSystem = null;
                                if (abstractC25075NewFileSystem != null) {
                                    abstractC25075NewFileSystem.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (IOException unused) {
                    c22185.f71482.m34525(C22843.m51556(interfaceC24329));
                    return null;
                } catch (C0141 unused2) {
                    C7312 c7312 = c22185.f71482;
                    C11040 c11040 = C22843.f74058;
                    c7312.m34525(new C11040("compiler", "locn.bad.module-info", interfaceC24329));
                }
            }
            boolean unused3 = c22185.f71478;
            return null;
        }
        C10009 c10009M3173 = c22185.f71486.m3172();
        if (c10009M3173 == null) {
            C7312 c7313 = c22185.f71482;
            C11040 c11041 = C22843.f74058;
            c7313.m34525(new C11040("compiler", "no.zipfs.for.archive", interfaceC24329));
            return null;
        }
        try {
            AbstractC25075 abstractC25075NewFileSystem2 = c10009M3173.newFileSystem(interfaceC24329, c22185.f71481);
            try {
                InterfaceC24329 path2 = abstractC25075NewFileSystem2.getPath("module-info.class", new String[0]);
                if (C3445.exists(path2, new EnumC20599[0])) {
                    C5558 c5558 = new C5558(m18353(path2), interfaceC24329);
                    abstractC25075NewFileSystem2.close();
                    return c5558;
                }
                InterfaceC24329 path3 = abstractC25075NewFileSystem2.getPath("META-INF/MANIFEST.MF", new String[0]);
                if (C3445.exists(path3, new EnumC20599[0])) {
                    InputStream inputStreamNewInputStream = C3445.newInputStream(path3, new InterfaceC12394[0]);
                    try {
                        Attributes mainAttributes = new Manifest(inputStreamNewInputStream).getMainAttributes();
                        if (mainAttributes != null && (value = mainAttributes.getValue(new Attributes.Name("Automatic-Module-Name"))) != null) {
                            int i = 0;
                            while (true) {
                                int iIndexOf = value.indexOf(46, i);
                                if (iIndexOf == -1) {
                                    zM49269 = EnumC21704.m49269(value.substring(i));
                                    break;
                                }
                                if (!EnumC21704.m49269(value.substring(i, iIndexOf))) {
                                    zM49269 = false;
                                    break;
                                }
                                i = iIndexOf + 1;
                            }
                            if (zM49269) {
                                C5558 c5559 = new C5558(value, interfaceC24329);
                                if (inputStreamNewInputStream != null) {
                                    inputStreamNewInputStream.close();
                                }
                                abstractC25075NewFileSystem2.close();
                                return c5559;
                            }
                            C7312 c7314 = c22185.f71482;
                            C11040 c11042 = C22843.f74058;
                            c7314.m34525(new C11040("compiler", "locn.cant.get.module.name.for.jar", interfaceC24329));
                            if (inputStreamNewInputStream != null) {
                                inputStreamNewInputStream.close();
                            }
                            abstractC25075NewFileSystem2.close();
                            return null;
                        }
                        if (inputStreamNewInputStream != null) {
                            inputStreamNewInputStream.close();
                        }
                    } catch (Throwable th3) {
                        if (inputStreamNewInputStream != null) {
                            try {
                                inputStreamNewInputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                }
                abstractC25075NewFileSystem2.close();
                String strM5124 = C1402.m5124(4, 0, interfaceC24329.getFileName().toString());
                Matcher matcher = Pattern.compile("-(\\d+(\\.|$))").matcher(strM5124);
                if (matcher.find()) {
                    strM5124 = strM5124.substring(0, matcher.start());
                }
                String strReplaceAll = strM5124.replaceAll("[^A-Za-z0-9]", ".").replaceAll("(\\.)(\\1)+", ".").replaceAll("^\\.", "").replaceAll("\\.$", "");
                if (!strReplaceAll.isEmpty()) {
                    return new C5558(strReplaceAll, interfaceC24329);
                }
                C7312 c7315 = c22185.f71482;
                C11040 c11043 = C22843.f74058;
                c7315.m34525(new C11040("compiler", "locn.cant.get.module.name.for.jar", interfaceC24329));
                return null;
            } catch (Throwable th5) {
                try {
                    abstractC25075NewFileSystem2.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } catch (IOException unused4) {
            c22185.f71482.m34525(C22843.m51556(interfaceC24329));
            return null;
        } catch (C0141 unused5) {
            C7312 c7316 = c22185.f71482;
            C11040 c11044 = C22843.f74058;
            c7316.m34525(new C11040("compiler", "locn.bad.module-info", interfaceC24329));
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private String m18353(InterfaceC24329 interfaceC24329) throws IOException {
        C22185 c22185 = this.f21831.f79168;
        if (c22185.f71480 == null) {
            c22185.f71480 = new C7599();
        }
        C7599 c7599 = c22185.f71480;
        c7599.getClass();
        InputStream inputStreamNewInputStream = C3445.newInputStream(interfaceC24329, new InterfaceC12394[0]);
        try {
            String strM20764 = c7599.m20764(inputStreamNewInputStream);
            if (inputStreamNewInputStream != null) {
                inputStreamNewInputStream.close();
            }
            return strM20764;
        } catch (Throwable th) {
            if (inputStreamNewInputStream != null) {
                try {
                    inputStreamNewInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
