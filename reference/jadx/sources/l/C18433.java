package l;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.InvalidPathException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ܿܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes5.dex */
public final class C18433 extends AbstractC16941 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22185 f60023;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public List f60024;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C19179 f60025;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0319 f60026;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18433(C22185 c22185) {
        super(EnumC6282.MODULE_SOURCE_PATH, EnumC7687.f25301);
        this.f60023 = c22185;
        this.f60026 = new C0319(1);
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4671(EnumC7687 enumC7687, String str) {
        boolean z;
        int i;
        char cCharAt;
        char c;
        int i2;
        InterfaceC24329 interfaceC24329M50194;
        this.f55346 = true;
        Pattern patternCompile = Pattern.compile("([\\p{Alnum}$_.]+)=(.*)");
        ArrayList arrayList = new ArrayList();
        InterfaceC24329 interfaceC24329 = null;
        int i3 = 0;
        String str2 = null;
        for (String str3 : str.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
            if (patternCompile.matcher(str3).matches()) {
                arrayList.add(str3);
            } else {
                str2 = str3;
            }
        }
        if (str2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (String str4 : str2.split(File.pathSeparator)) {
                m42957(str4, arrayList2);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            boolean z2 = false;
            while (true) {
                boolean zHasNext = it.hasNext();
                C22185 c22185 = this.f60023;
                if (zHasNext) {
                    String str5 = (String) it.next();
                    int iIndexOf = str5.indexOf("*");
                    if (iIndexOf == -1) {
                        InterfaceC24329 interfaceC24329M50195 = c22185.m50194(str5, new String[i3]);
                        m42959(linkedHashMap, interfaceC24329M50195, interfaceC24329);
                        arrayList3.add(interfaceC24329M50195);
                    } else {
                        if (iIndexOf == 0 || ((cCharAt = str5.charAt((i = iIndexOf - 1))) != (c = File.separatorChar) && cCharAt != '/')) {
                            throw new IllegalArgumentException("illegal use of * in ".concat(str5));
                        }
                        InterfaceC24329 interfaceC24329M50196 = c22185.m50194(str5.substring(i3, i), new String[i3]);
                        int i4 = iIndexOf + 1;
                        if (i4 == str5.length()) {
                            interfaceC24329M50194 = null;
                            i2 = 0;
                        } else {
                            char cCharAt2 = str5.charAt(i4);
                            if ((cCharAt2 != c && cCharAt2 != '/') || str5.indexOf("*", i4) != -1) {
                                throw new IllegalArgumentException("illegal use of * in ".concat(str5));
                            }
                            String strSubstring = str5.substring(iIndexOf + 2);
                            i2 = 0;
                            interfaceC24329M50194 = c22185.m50194(strSubstring, new String[0]);
                            z2 = true;
                        }
                        m42959(linkedHashMap, interfaceC24329M50196, interfaceC24329M50194);
                        if (interfaceC24329M50194 == null) {
                            arrayList3.add(interfaceC24329M50196);
                        }
                        i3 = i2;
                    }
                    interfaceC24329 = null;
                } else {
                    z = true;
                    this.f60025 = new C19179(c22185);
                    C11392.forEach(linkedHashMap, new C21417(this));
                    if (z2) {
                        arrayList3 = null;
                    }
                    this.f60024 = arrayList3;
                    break;
                }
            }
        } else {
            z = true;
        }
        C4937.forEach(arrayList, new Consumer() { // from class: l.ۘܺۘ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                String str6 = (String) obj;
                C18433 c18433 = this.f15501;
                c18433.getClass();
                int iIndexOf2 = str6.indexOf(61);
                String strSubstring2 = str6.substring(0, iIndexOf2);
                ArrayList arrayList4 = new ArrayList();
                for (String str7 : str6.substring(iIndexOf2 + 1).split(File.pathSeparator)) {
                    try {
                        arrayList4.add(C14631.get(str7, new String[0]));
                    } catch (InvalidPathException e) {
                        throw new IllegalArgumentException(C25272.m56409("invalid path: ", str7), e);
                    }
                }
                try {
                    c18433.mo4670(arrayList4, strSubstring2);
                } catch (IOException e2) {
                    throw new IllegalArgumentException(C25272.m56409("cannot set path for module ", strSubstring2), e2);
                }
            }
        });
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m42958(C18433 c18433, String str, List list) {
        if (C1170.stream(list).anyMatch(c18433.f60026)) {
            c18433.f60025.m44444(new C3517(c18433.f60023, c18433, c18433.f55348.getName() + "[" + str + "]", str, list, false));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42959(LinkedHashMap linkedHashMap, InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210) {
        C25213 c25213;
        if (!C3445.isDirectory(interfaceC24329, new EnumC20599[0])) {
            C22185 c22185 = this.f60023;
            if (c22185.f71478) {
                if (C3445.exists(interfaceC24329, new EnumC20599[0])) {
                    C25213 c25214 = C13146.f42046;
                    c25213 = new C25213("compiler", "dir.path.element.not.directory", interfaceC24329);
                } else {
                    C25213 c25215 = C13146.f42046;
                    c25213 = new C25213("compiler", "dir.path.element.not.found", interfaceC24329);
                }
                c22185.f71482.m34528(EnumC19876.PATH, c25213);
                return;
            }
            return;
        }
        try {
            DirectoryStream<InterfaceC24329> directoryStreamNewDirectoryStream = C3445.newDirectoryStream(interfaceC24329, new C14703());
            try {
                for (InterfaceC24329 interfaceC243211 : directoryStreamNewDirectoryStream) {
                    InterfaceC24329 interfaceC24329Resolve = interfaceC243210 == null ? interfaceC243211 : interfaceC243211.resolve(interfaceC243210);
                    if (C3445.isDirectory(interfaceC24329Resolve, new EnumC20599[0])) {
                        String string = interfaceC243211.getFileName().toString();
                        List arrayList = (List) linkedHashMap.get(string);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(string, arrayList);
                        }
                        arrayList.add(interfaceC24329Resolve);
                    }
                }
                directoryStreamNewDirectoryStream.close();
            } catch (Throwable th) {
                if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42957(String str, ArrayList arrayList) {
        int i = -1;
        String str2 = null;
        String strSubstring = null;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            int i4 = 1;
            if (cCharAt != ',') {
                if (cCharAt == '{') {
                    i2++;
                    if (i2 == 1) {
                        String strSubstring2 = str.substring(0, i3);
                        int i5 = i3 + 1;
                        int i6 = i5;
                        while (true) {
                            if (i6 >= str.length()) {
                                throw new IllegalArgumentException("mismatched braces");
                            }
                            char cCharAt2 = str.charAt(i6);
                            if (cCharAt2 != '{') {
                                if (cCharAt2 == '}' && (i4 = i4 - 1) == 0) {
                                    strSubstring = str.substring(i6 + 1);
                                    str2 = strSubstring2;
                                    i = i5;
                                    break;
                                }
                            } else {
                                i4++;
                            }
                            i6++;
                        }
                    } else {
                        continue;
                    }
                } else if (cCharAt != '}') {
                    continue;
                } else {
                    if (i2 == 0) {
                        throw new IllegalArgumentException("mismatched braces");
                    }
                    if (i2 == 1) {
                        m42957(C20196.m46451(str2, str.substring(i, i3), strSubstring), arrayList);
                        return;
                    }
                    i2--;
                }
            } else if (i2 == 1) {
                m42957(C20196.m46451(str2, str.substring(i, i3), strSubstring), arrayList);
                i = i3 + 1;
            }
        }
        if (i2 > 0) {
            throw new IllegalArgumentException("mismatched braces");
        }
        arrayList.add(str);
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo4674() {
        return this.f60025 != null;
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ᩷ */
    public final Collection mo4675() {
        List list = this.f60024;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("paths not available");
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final void mo4669(Iterable iterable) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C9724) iterable).iterator();
        while (true) {
            C8979 c8979 = (C8979) it;
            if (!c8979.f29276.hasNext()) {
                this.f60025 = new C19179(this.f60023);
                C11392.forEach(linkedHashMap, new C21417(this));
                this.f55346 = true;
                this.f60024 = C4681.unmodifiableList(arrayList);
                return;
            }
            InterfaceC24329 interfaceC24329 = (InterfaceC24329) c8979.next();
            m42959(linkedHashMap, interfaceC24329, (InterfaceC24329) null);
            arrayList.add(interfaceC24329);
        }
    }

    @Override // l.AbstractC16941, l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final void mo4670(Iterable iterable, String str) {
        C17359.requireNonNull(iterable);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC24329 interfaceC24329 = (InterfaceC24329) it.next();
            AbstractC16941.m39916(interfaceC24329);
            arrayList.add(interfaceC24329);
        }
        C19179 c19179 = this.f60025;
        C22185 c22185 = this.f60023;
        if (c19179 == null) {
            this.f60025 = new C19179(c22185);
        }
        C3517 c3517M44442 = this.f60025.m44442(str);
        if (c3517M44442 == null) {
            this.f60025.m44444(new C3517(c22185, this, this.f55348.getName() + "[" + str + "]", str, arrayList, true));
        } else {
            c3517M44442.f12094 = arrayList;
            this.f60025.m44449(c3517M44442);
        }
        this.f55346 = true;
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC24928 mo4668(String str) {
        C19179 c19179 = this.f60025;
        if (c19179 == null) {
            return null;
        }
        return c19179.m44442(str);
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC24928 mo4676(InterfaceC24329 interfaceC24329) {
        C19179 c19179 = this.f60025;
        if (c19179 == null) {
            return null;
        }
        return c19179.m44448(interfaceC24329);
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ܳ */
    public final Iterable mo4673() {
        C19179 c19179 = this.f60025;
        if (c19179 == null) {
            return Collections.EMPTY_SET;
        }
        return Collections.singleton(c19179.m44450());
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4672(InterfaceC24329 interfaceC24329) {
        C19179 c19179 = this.f60025;
        if (c19179 == null) {
            return false;
        }
        return c19179.m44445(interfaceC24329);
    }
}
