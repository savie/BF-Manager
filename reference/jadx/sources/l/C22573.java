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

/* JADX INFO: renamed from: l.᩹᩹۟, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes.dex */
public final class C22573 implements Iterator {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Iterator f73576;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1405 f73578;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f73579 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Set f73577 = null;

    public C22573(C1405 c1405) {
        this.f73578 = c1405;
        this.f73576 = c1405.f25610.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws Throwable {
        Set setSingleton;
        Set setSingleton2;
        Throwable th;
        InterfaceC3800 interfaceC3800;
        C1405 c1405 = this.f73578;
        InterfaceC4290 interfaceC4290 = c1405.f31747;
        C20456 c20456 = c1405.f5825;
        int i = 1;
        if (this.f73577 != null) {
            return true;
        }
        while (this.f73577 == null) {
            Iterator it = this.f73576;
            int i2 = 0;
            if (!it.hasNext()) {
                return false;
            }
            InterfaceC3800 interfaceC3801 = (InterfaceC3800) it.next();
            String str = "[";
            String str2 = ":";
            String str3 = "]";
            if (C5212.isDirectory(interfaceC3801, new EnumC22146[0])) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    DirectoryStream directoryStreamNewDirectoryStream = C5212.newDirectoryStream(interfaceC3801);
                    try {
                        Iterator it2 = directoryStreamNewDirectoryStream.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                interfaceC3800 = null;
                                break;
                            }
                            try {
                                interfaceC3800 = (InterfaceC3800) it2.next();
                                if (interfaceC3800.endsWith("module-info.class")) {
                                    break;
                                }
                                linkedHashSet.add(interfaceC3800);
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
                                        C20414 c20414 = c20456.f66387;
                                        C5909 c5909 = C23879.f77204;
                                        c20414.m48197(new C5909("compiler", "locn.cant.read.directory", interfaceC3801));
                                        setSingleton2 = Collections.EMPTY_SET;
                                        this.f73577 = setSingleton2;
                                        this.f73579++;
                                        c1405 = c1405;
                                        i = 1;
                                    }
                                }
                                throw th;
                            }
                        }
                        directoryStreamNewDirectoryStream.close();
                        if (interfaceC3800 != null) {
                            try {
                                String strM50075 = m50075(interfaceC3800);
                                setSingleton2 = Collections.singleton(new C11990(c20456, c1405, interfaceC4290.getName() + "[" + this.f73579 + ":" + strM50075 + "]", strM50075, Collections.singletonList(interfaceC3801), false));
                            } catch (IOException unused2) {
                                c20456.f66387.m48197(C23879.m52619(interfaceC3801));
                                setSingleton2 = Collections.EMPTY_SET;
                            } catch (C15061 unused3) {
                                C20414 c20415 = c20456.f66387;
                                C5909 c59010 = C23879.f77204;
                                Object[] objArr = new Object[i];
                                objArr[0] = interfaceC3801;
                                c20415.m48197(new C5909("compiler", "locn.bad.module-info", objArr));
                                setSingleton2 = Collections.EMPTY_SET;
                            }
                            c1405 = c1405;
                        } else {
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            Iterator it3 = linkedHashSet.iterator();
                            while (it3.hasNext()) {
                                C2068 c2068M50074 = m50074((InterfaceC3800) it3.next());
                                if (c2068M50074 != null) {
                                    String str4 = (String) c2068M50074.f7664;
                                    linkedHashSet2.add(new C11990(c20456, c1405, interfaceC4290.getName() + str + this.f73579 + "." + i2 + str2 + str4 + str3, str4, Collections.singletonList((InterfaceC3800) c2068M50074.f7665), false));
                                    str2 = str2;
                                    str = str;
                                    str3 = str3;
                                    i2++;
                                    c1405 = c1405;
                                    it3 = it3;
                                }
                            }
                            c1405 = c1405;
                            setSingleton2 = linkedHashSet2;
                        }
                        this.f73577 = setSingleton2;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (IOException | DirectoryIteratorException unused4) {
                    c1405 = c1405;
                }
            } else {
                c1405 = c1405;
                C2068 c2068M50075 = m50074(interfaceC3801);
                if (c2068M50075 == null) {
                    setSingleton = Collections.EMPTY_SET;
                } else {
                    String str5 = (String) c2068M50075.f7664;
                    setSingleton = Collections.singleton(new C11990(c20456, c1405, interfaceC4290.getName() + "[" + this.f73579 + ":" + str5 + "]", str5, Collections.singletonList((InterfaceC3800) c2068M50075.f7665), false));
                }
                this.f73577 = setSingleton;
            }
            this.f73579++;
            c1405 = c1405;
            i = 1;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() throws Throwable {
        hasNext();
        Set set = this.f73577;
        if (set != null) {
            this.f73577 = null;
            return set;
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C2068 m50074(InterfaceC3800 interfaceC3800) throws Throwable {
        String value;
        boolean zM31069;
        C20456 c20456 = this.f73578.f5825;
        if (C5212.isDirectory(interfaceC3800, new EnumC22146[0])) {
            if (C5212.exists(interfaceC3800.resolve("module-info.class"), new EnumC22146[0]) || C5212.exists(interfaceC3800.resolve("module-info.sig"), new EnumC22146[0])) {
                String string = interfaceC3800.getFileName().toString();
                if (EnumC12508.m31069(string)) {
                    return new C2068(string, interfaceC3800);
                }
            }
            return null;
        }
        if (!interfaceC3800.getFileName().toString().endsWith(".jar") || !c20456.f66388.mo36009(interfaceC3800)) {
            if (interfaceC3800.getFileName().toString().endsWith(".jmod")) {
                try {
                    C6407.m17552(interfaceC3800);
                    if (((AbstractC3178) c20456.f66394.get(interfaceC3800)) == null) {
                        C9936 c9936M47900 = c20456.f66388.m47900();
                        if (c9936M47900 == null) {
                            c20456.f66387.m48197(C23879.m52619(interfaceC3800));
                            return null;
                        }
                        AbstractC3178 abstractC3178NewFileSystem = c9936M47900.newFileSystem(interfaceC3800, Collections.EMPTY_MAP);
                        try {
                            String strM50075 = m50075(abstractC3178NewFileSystem.getPath("classes/module-info.class", new String[0]));
                            InterfaceC3800 path = abstractC3178NewFileSystem.getPath("classes", new String[0]);
                            c20456.f66394.put(interfaceC3800, abstractC3178NewFileSystem);
                            c20456.f66390.add(abstractC3178NewFileSystem);
                            try {
                                return new C2068(strM50075, path);
                            } catch (Throwable th) {
                                th = th;
                                abstractC3178NewFileSystem = null;
                                if (abstractC3178NewFileSystem != null) {
                                    abstractC3178NewFileSystem.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (IOException unused) {
                    c20456.f66387.m48197(C23879.m52619(interfaceC3800));
                    return null;
                } catch (C15061 unused2) {
                    C20414 c20414 = c20456.f66387;
                    C5909 c5909 = C23879.f77204;
                    c20414.m48197(new C5909("compiler", "locn.bad.module-info", interfaceC3800));
                }
            }
            boolean unused3 = c20456.f66389;
            return null;
        }
        C9936 c9936M47901 = c20456.f66388.m47900();
        if (c9936M47901 == null) {
            C20414 c20415 = c20456.f66387;
            C5909 c59010 = C23879.f77204;
            c20415.m48197(new C5909("compiler", "no.zipfs.for.archive", interfaceC3800));
            return null;
        }
        try {
            AbstractC3178 abstractC3178NewFileSystem2 = c9936M47901.newFileSystem(interfaceC3800, c20456.f66392);
            try {
                InterfaceC3800 path2 = abstractC3178NewFileSystem2.getPath("module-info.class", new String[0]);
                if (C5212.exists(path2, new EnumC22146[0])) {
                    C2068 c2068 = new C2068(m50075(path2), interfaceC3800);
                    abstractC3178NewFileSystem2.close();
                    return c2068;
                }
                InterfaceC3800 path3 = abstractC3178NewFileSystem2.getPath("META-INF/MANIFEST.MF", new String[0]);
                if (C5212.exists(path3, new EnumC22146[0])) {
                    InputStream inputStreamNewInputStream = C5212.newInputStream(path3, new InterfaceC0978[0]);
                    try {
                        Attributes mainAttributes = new Manifest(inputStreamNewInputStream).getMainAttributes();
                        if (mainAttributes != null && (value = mainAttributes.getValue(new Attributes.Name("Automatic-Module-Name"))) != null) {
                            int i = 0;
                            while (true) {
                                int iIndexOf = value.indexOf(46, i);
                                if (iIndexOf == -1) {
                                    zM31069 = EnumC12508.m31069(value.substring(i));
                                    break;
                                }
                                if (!EnumC12508.m31069(value.substring(i, iIndexOf))) {
                                    zM31069 = false;
                                    break;
                                }
                                i = iIndexOf + 1;
                            }
                            if (zM31069) {
                                C2068 c2069 = new C2068(value, interfaceC3800);
                                if (inputStreamNewInputStream != null) {
                                    inputStreamNewInputStream.close();
                                }
                                abstractC3178NewFileSystem2.close();
                                return c2069;
                            }
                            C20414 c20416 = c20456.f66387;
                            C5909 c59011 = C23879.f77204;
                            c20416.m48197(new C5909("compiler", "locn.cant.get.module.name.for.jar", interfaceC3800));
                            if (inputStreamNewInputStream != null) {
                                inputStreamNewInputStream.close();
                            }
                            abstractC3178NewFileSystem2.close();
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
                abstractC3178NewFileSystem2.close();
                String strM46498 = C20630.m46498(4, 0, interfaceC3800.getFileName().toString());
                Matcher matcher = Pattern.compile("-(\\d+(\\.|$))").matcher(strM46498);
                if (matcher.find()) {
                    strM46498 = strM46498.substring(0, matcher.start());
                }
                String strReplaceAll = strM46498.replaceAll("[^A-Za-z0-9]", ".").replaceAll("(\\.)(\\1)+", ".").replaceAll("^\\.", "").replaceAll("\\.$", "");
                if (!strReplaceAll.isEmpty()) {
                    return new C2068(strReplaceAll, interfaceC3800);
                }
                C20414 c20417 = c20456.f66387;
                C5909 c59012 = C23879.f77204;
                c20417.m48197(new C5909("compiler", "locn.cant.get.module.name.for.jar", interfaceC3800));
                return null;
            } catch (Throwable th5) {
                try {
                    abstractC3178NewFileSystem2.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } catch (IOException unused4) {
            c20456.f66387.m48197(C23879.m52619(interfaceC3800));
            return null;
        } catch (C15061 unused5) {
            C20414 c20418 = c20456.f66387;
            C5909 c59013 = C23879.f77204;
            c20418.m48197(new C5909("compiler", "locn.bad.module-info", interfaceC3800));
            return null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private String m50075(InterfaceC3800 interfaceC3800) throws IOException {
        C20456 c20456 = this.f73578.f5825;
        if (c20456.f66393 == null) {
            c20456.f66393 = new C21410();
        }
        C21410 c21410 = c20456.f66393;
        c21410.getClass();
        InputStream inputStreamNewInputStream = C5212.newInputStream(interfaceC3800, new InterfaceC0978[0]);
        try {
            String strM47953 = c21410.m47953(inputStreamNewInputStream);
            if (inputStreamNewInputStream != null) {
                inputStreamNewInputStream.close();
            }
            return strM47953;
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
