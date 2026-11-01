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

/* JADX INFO: renamed from: l.᩺᩹۟, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes.dex */
public final class C23279 extends AbstractC9376 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20456 f75514;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C12252 f75515;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C18339 f75516;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public List f75517;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23279(C20456 c20456) {
        super(EnumC3584.MODULE_SOURCE_PATH, EnumC19730.f63354);
        this.f75514 = c20456;
        this.f75515 = new C12252(3);
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4921(EnumC19730 enumC19730, String str) {
        boolean z;
        int i;
        char cCharAt;
        char c;
        int i2;
        InterfaceC3800 interfaceC3800M46271;
        this.f31745 = true;
        Pattern patternCompile = Pattern.compile("([\\p{Alnum}$_.]+)=(.*)");
        ArrayList arrayList = new ArrayList();
        InterfaceC3800 interfaceC3800 = null;
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
                m51355(str4, arrayList2);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            boolean z2 = false;
            while (true) {
                boolean zHasNext = it.hasNext();
                C20456 c20456 = this.f75514;
                if (zHasNext) {
                    String str5 = (String) it.next();
                    int iIndexOf = str5.indexOf("*");
                    if (iIndexOf == -1) {
                        InterfaceC3800 interfaceC3800M46272 = c20456.m46271(str5, new String[i3]);
                        m51357(linkedHashMap, interfaceC3800M46272, interfaceC3800);
                        arrayList3.add(interfaceC3800M46272);
                    } else {
                        if (iIndexOf == 0 || ((cCharAt = str5.charAt((i = iIndexOf - 1))) != (c = File.separatorChar) && cCharAt != '/')) {
                            throw new IllegalArgumentException("illegal use of * in ".concat(str5));
                        }
                        InterfaceC3800 interfaceC3800M46273 = c20456.m46271(str5.substring(i3, i), new String[i3]);
                        int i4 = iIndexOf + 1;
                        if (i4 == str5.length()) {
                            interfaceC3800M46271 = null;
                            i2 = 0;
                        } else {
                            char cCharAt2 = str5.charAt(i4);
                            if ((cCharAt2 != c && cCharAt2 != '/') || str5.indexOf("*", i4) != -1) {
                                throw new IllegalArgumentException("illegal use of * in ".concat(str5));
                            }
                            String strSubstring = str5.substring(iIndexOf + 2);
                            i2 = 0;
                            interfaceC3800M46271 = c20456.m46271(strSubstring, new String[0]);
                            z2 = true;
                        }
                        m51357(linkedHashMap, interfaceC3800M46273, interfaceC3800M46271);
                        if (interfaceC3800M46271 == null) {
                            arrayList3.add(interfaceC3800M46273);
                        }
                        i3 = i2;
                    }
                    interfaceC3800 = null;
                } else {
                    z = true;
                    this.f75516 = new C18339(c20456);
                    C9735.forEach(linkedHashMap, new C7050(this));
                    if (z2) {
                        arrayList3 = null;
                    }
                    this.f75517 = arrayList3;
                    break;
                }
            }
        } else {
            z = true;
        }
        C0356.forEach(arrayList, new Consumer() { // from class: l.۬᩹۟
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C1455.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                String str6 = (String) obj;
                C23279 c23279 = this.f44362;
                c23279.getClass();
                int iIndexOf2 = str6.indexOf(61);
                String strSubstring2 = str6.substring(0, iIndexOf2);
                ArrayList arrayList4 = new ArrayList();
                for (String str7 : str6.substring(iIndexOf2 + 1).split(File.pathSeparator)) {
                    try {
                        arrayList4.add(C22852.get(str7, new String[0]));
                    } catch (InvalidPathException e) {
                        throw new IllegalArgumentException(C0252.m1693("invalid path: ", str7), e);
                    }
                }
                try {
                    c23279.mo4919(arrayList4, strSubstring2);
                } catch (IOException e2) {
                    throw new IllegalArgumentException(C0252.m1693("cannot set path for module ", strSubstring2), e2);
                }
            }
        });
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51356(C23279 c23279, String str, List list) {
        if (C9030.stream(list).anyMatch(c23279.f75515)) {
            c23279.f75516.m42590(new C11990(c23279.f75514, c23279, c23279.f31747.getName() + "[" + str + "]", str, list, false));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51357(LinkedHashMap linkedHashMap, InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801) {
        C14065 c14065;
        if (!C5212.isDirectory(interfaceC3800, new EnumC22146[0])) {
            C20456 c20456 = this.f75514;
            if (c20456.f66389) {
                if (C5212.exists(interfaceC3800, new EnumC22146[0])) {
                    C14065 c14066 = C9768.f32836;
                    c14065 = new C14065("compiler", "dir.path.element.not.directory", interfaceC3800);
                } else {
                    C14065 c14067 = C9768.f32836;
                    c14065 = new C14065("compiler", "dir.path.element.not.found", interfaceC3800);
                }
                c20456.f66387.m48195(EnumC0597.PATH, c14065);
                return;
            }
            return;
        }
        try {
            DirectoryStream<InterfaceC3800> directoryStreamNewDirectoryStream = C5212.newDirectoryStream(interfaceC3800, new C4227());
            try {
                for (InterfaceC3800 interfaceC3802 : directoryStreamNewDirectoryStream) {
                    InterfaceC3800 interfaceC3800Resolve = interfaceC3801 == null ? interfaceC3802 : interfaceC3802.resolve(interfaceC3801);
                    if (C5212.isDirectory(interfaceC3800Resolve, new EnumC22146[0])) {
                        String string = interfaceC3802.getFileName().toString();
                        List arrayList = (List) linkedHashMap.get(string);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(string, arrayList);
                        }
                        arrayList.add(interfaceC3800Resolve);
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
    public static void m51355(String str, ArrayList arrayList) {
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
                        m51355(C1679.m5594(str2, str.substring(i, i3), strSubstring), arrayList);
                        return;
                    }
                    i2--;
                }
            } else if (i2 == 1) {
                m51355(C1679.m5594(str2, str.substring(i, i3), strSubstring), arrayList);
                i = i3 + 1;
            }
        }
        if (i2 > 0) {
            throw new IllegalArgumentException("mismatched braces");
        }
        arrayList.add(str);
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo22116() {
        return this.f75516 != null;
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۨ */
    public final Collection mo9021() {
        List list = this.f75517;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("paths not available");
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final void mo4918(Iterable iterable) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C8670) iterable).iterator();
        while (true) {
            C7258 c7258 = (C7258) it;
            if (!c7258.f24163.hasNext()) {
                this.f75516 = new C18339(this.f75514);
                C9735.forEach(linkedHashMap, new C7050(this));
                this.f31745 = true;
                this.f75517 = C0561.unmodifiableList(arrayList);
                return;
            }
            InterfaceC3800 interfaceC3800 = (InterfaceC3800) c7258.next();
            m51357(linkedHashMap, interfaceC3800, (InterfaceC3800) null);
            arrayList.add(interfaceC3800);
        }
    }

    @Override // l.AbstractC9376, l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final void mo4919(Iterable iterable, String str) {
        C13638.requireNonNull(iterable);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC3800 interfaceC3800 = (InterfaceC3800) it.next();
            AbstractC9376.m24052(interfaceC3800);
            arrayList.add(interfaceC3800);
        }
        C18339 c18339 = this.f75516;
        C20456 c20456 = this.f75514;
        if (c18339 == null) {
            this.f75516 = new C18339(c20456);
        }
        C11990 c11990M42588 = this.f75516.m42588(str);
        if (c11990M42588 == null) {
            this.f75516.m42590(new C11990(c20456, this, this.f31747.getName() + "[" + str + "]", str, arrayList, true));
        } else {
            c11990M42588.f40189 = arrayList;
            this.f75516.m42595(c11990M42588);
        }
        this.f31745 = true;
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC4290 mo4917(String str) {
        C18339 c18339 = this.f75516;
        if (c18339 == null) {
            return null;
        }
        return c18339.m42588(str);
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC4290 mo4922(InterfaceC3800 interfaceC3800) {
        C18339 c18339 = this.f75516;
        if (c18339 == null) {
            return null;
        }
        return c18339.m42594(interfaceC3800);
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ᩹ */
    public final Iterable mo4923() {
        C18339 c18339 = this.f75516;
        if (c18339 == null) {
            return Collections.EMPTY_SET;
        }
        return Collections.singleton(c18339.m42587());
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4920(InterfaceC3800 interfaceC3800) {
        C18339 c18339 = this.f75516;
        if (c18339 == null) {
            return false;
        }
        return c18339.m42591(interfaceC3800);
    }
}
