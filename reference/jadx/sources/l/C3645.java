package l;

import android.text.TextUtils;
import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۘۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BN4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3645 extends AbstractC12176 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public List f13368;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f13369;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Object f13370;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public List f13371;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f13372;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public List f13373;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22611 f13374;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public List f13375;

    public C3645() {
        List list = Collections.EMPTY_LIST;
        this.f13368 = list;
        this.f13373 = list;
        this.f13371 = list;
        this.f13375 = list;
    }

    @Override // l.AbstractC21616
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10753(C6094 c6094, CharSequence charSequence) {
        m30282(charSequence, new C18372(this, c6094));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static RunnableC3039 m10747(C3645 c3645, C6094 c6094, CharSequence charSequence, InterfaceC5614 interfaceC5614) {
        Iterator it;
        HashMap map;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        C10164 c10164M16097 = C5884.m16097(charSequence);
        final ArrayList<String> arrayList5 = new ArrayList(1);
        final HashMap map2 = new HashMap();
        map2.put("AbstractMethodError", "java.lang.AbstractMethodError");
        map2.put("Appendable", "java.lang.Appendable");
        map2.put("ArithmeticException", "java.lang.ArithmeticException");
        map2.put("ArrayIndexOutOfBoundsException", "java.lang.ArrayIndexOutOfBoundsException");
        map2.put("ArrayStoreException", "java.lang.ArrayStoreException");
        map2.put("AssertionError", "java.lang.AssertionError");
        map2.put("AutoCloseable", "java.lang.AutoCloseable");
        map2.put("Boolean", "java.lang.Boolean");
        map2.put("BootstrapMethodError", "java.lang.BootstrapMethodError");
        map2.put("Byte", "java.lang.Byte");
        map2.put("Character", "java.lang.Character");
        map2.put("CharSequence", "java.lang.CharSequence");
        map2.put("Class", "java.lang.Class");
        map2.put("ClassCastException", "java.lang.ClassCastException");
        map2.put("ClassCircularityError", "java.lang.ClassCircularityError");
        map2.put("ClassFormatError", "java.lang.ClassFormatError");
        map2.put("ClassLoader", "java.lang.ClassLoader");
        map2.put("ClassNotFoundException", "java.lang.ClassNotFoundException");
        map2.put("Cloneable", "java.lang.Cloneable");
        map2.put("CloneNotSupportedException", "java.lang.CloneNotSupportedException");
        map2.put("Comparable", "java.lang.Comparable");
        map2.put("Compiler", "java.lang.Compiler");
        map2.put("Deprecated", "java.lang.Deprecated");
        map2.put("Double", "java.lang.Double");
        map2.put("Enum", "java.lang.Enum");
        map2.put("EnumConstantNotPresentException", "java.lang.EnumConstantNotPresentException");
        map2.put("Error", "java.lang.Error");
        map2.put("Exception", "java.lang.Exception");
        map2.put("ExceptionInInitializerError", "java.lang.ExceptionInInitializerError");
        map2.put("Float", "java.lang.Float");
        map2.put("FunctionalInterface", "java.lang.FunctionalInterface");
        map2.put("IllegalAccessError", "java.lang.IllegalAccessError");
        map2.put("IllegalAccessException", "java.lang.IllegalAccessException");
        map2.put("IllegalArgumentException", "java.lang.IllegalArgumentException");
        map2.put("IllegalMonitorStateException", "java.lang.IllegalMonitorStateException");
        map2.put("IllegalStateException", "java.lang.IllegalStateException");
        map2.put("IllegalThreadStateException", "java.lang.IllegalThreadStateException");
        map2.put("IncompatibleClassChangeError", "java.lang.IncompatibleClassChangeError");
        map2.put("IndexOutOfBoundsException", "java.lang.IndexOutOfBoundsException");
        map2.put("InheritableThreadLocal", "java.lang.InheritableThreadLocal");
        map2.put("InstantiationError", "java.lang.InstantiationError");
        map2.put("InstantiationException", "java.lang.InstantiationException");
        map2.put("Integer", "java.lang.Integer");
        map2.put("InternalError", "java.lang.InternalError");
        map2.put("InterruptedException", "java.lang.InterruptedException");
        map2.put("Iterable", "java.lang.Iterable");
        map2.put("LinkageError", "java.lang.LinkageError");
        map2.put("Long", "java.lang.Long");
        map2.put("Math", "java.lang.Math");
        map2.put("NegativeArraySizeException", "java.lang.NegativeArraySizeException");
        map2.put("NoClassDefFoundError", "java.lang.NoClassDefFoundError");
        map2.put("NoSuchFieldError", "java.lang.NoSuchFieldError");
        map2.put("NoSuchFieldException", "java.lang.NoSuchFieldException");
        map2.put("NoSuchMethodError", "java.lang.NoSuchMethodError");
        map2.put("NoSuchMethodException", "java.lang.NoSuchMethodException");
        map2.put("NullPointerException", "java.lang.NullPointerException");
        map2.put("Number", "java.lang.Number");
        map2.put("NumberFormatException", "java.lang.NumberFormatException");
        map2.put("Object", "java.lang.Object");
        map2.put("OutOfMemoryError", "java.lang.OutOfMemoryError");
        map2.put("Override", "java.lang.Override");
        map2.put("Package", "java.lang.Package");
        map2.put("Process", "java.lang.Process");
        map2.put("ProcessBuilder", "java.lang.ProcessBuilder");
        map2.put("Readable", "java.lang.Readable");
        map2.put("ReflectiveOperationException", "java.lang.ReflectiveOperationException");
        map2.put("Runnable", "java.lang.Runnable");
        map2.put("Runtime", "java.lang.Runtime");
        map2.put("RuntimeException", "java.lang.RuntimeException");
        map2.put("RuntimePermission", "java.lang.RuntimePermission");
        map2.put("SafeVarargs", "java.lang.SafeVarargs");
        map2.put("SecurityException", "java.lang.SecurityException");
        map2.put("SecurityManager", "java.lang.SecurityManager");
        map2.put("Short", "java.lang.Short");
        map2.put("StackOverflowError", "java.lang.StackOverflowError");
        map2.put("StackTraceElement", "java.lang.StackTraceElement");
        map2.put("StrictMath", "java.lang.StrictMath");
        map2.put("String", "java.lang.String");
        map2.put("StringBuffer", "java.lang.StringBuffer");
        map2.put("StringBuilder", "java.lang.StringBuilder");
        map2.put("StringIndexOutOfBoundsException", "java.lang.StringIndexOutOfBoundsException");
        map2.put("SuppressWarnings", "java.lang.SuppressWarnings");
        map2.put("System", "java.lang.System");
        map2.put("Thread", "java.lang.Thread");
        map2.put("ThreadDeath", "java.lang.ThreadDeath");
        map2.put("ThreadGroup", "java.lang.ThreadGroup");
        map2.put("ThreadLocal", "java.lang.ThreadLocal");
        map2.put("Throwable", "java.lang.Throwable");
        map2.put("TypeNotPresentException", "java.lang.TypeNotPresentException");
        map2.put("UnknownError", "java.lang.UnknownError");
        map2.put("UnsatisfiedLinkError", "java.lang.UnsatisfiedLinkError");
        map2.put("UnsupportedClassVersionError", "java.lang.UnsupportedClassVersionError");
        map2.put("UnsupportedOperationException", "java.lang.UnsupportedOperationException");
        map2.put("VerifyError", "java.lang.VerifyError");
        map2.put("VirtualMachineError", "java.lang.VirtualMachineError");
        map2.put("Void", "java.lang.Void");
        for (AbstractC8774 abstractC8774 : c10164M16097.f34727) {
            if (abstractC8774 instanceof C14023) {
                C23570 c23570 = (C23570) ((C14023) abstractC8774).f46089;
                map2.put(c23570.f76356.toString(), c23570.toString());
            } else if (abstractC8774 instanceof C8753) {
                arrayList5.add(((C8753) abstractC8774).f30093.toString());
            }
        }
        final String str = c10164M16097.m25898() == null ? "" : c10164M16097.m25898().toString() + ".";
        char c = '/';
        RunnableC3039 runnableC3039 = null;
        c6094.m16542(new InterfaceC3002() { // from class: l.ܰۖۜ
            @Override // l.InterfaceC3002
            /* JADX INFO: renamed from: ۙ */
            public final void mo8963(InterfaceC9354 interfaceC9354) {
                String strMo24004 = ((C17383) interfaceC9354).mo24004();
                String str2 = str;
                String strSubstring = strMo24004.substring(str2.length());
                int iIndexOf = strSubstring.indexOf(36);
                HashMap map3 = map2;
                if (iIndexOf == -1) {
                    map3.put(strSubstring, str2.concat(strSubstring));
                    return;
                }
                String strSubstring2 = strSubstring.substring(0, iIndexOf);
                String strSubstring3 = strSubstring.substring(iIndexOf + 1);
                if (arrayList5.contains(strSubstring2) && strSubstring3.indexOf(36) == -1) {
                    map3.put(strSubstring3, str2 + strSubstring2 + '$' + strSubstring3);
                }
            }
        }, str.replace('.', '/'), false, (Predicate) null);
        for (String str2 : arrayList5) {
            map2.put(str2, str + str2);
        }
        Iterator it2 = c10164M16097.f34727.iterator();
        while (it2.hasNext()) {
            AbstractC8774 abstractC8775 = (AbstractC8774) it2.next();
            if (interfaceC5614.mo2357()) {
                return runnableC3039;
            }
            if (abstractC8775 instanceof C8753) {
                C8753 c8753 = (C8753) abstractC8775;
                C23028 c23028 = new C23028();
                c23028.f74837 = c8753.f30093.toString();
                StringBuilder sb = new StringBuilder("L");
                sb.append(str.replace('.', c));
                c23028.f74834 = C22697.m50267(sb, c23028.f74837, l.b);
                int iM9453 = C3128.m9453(c8753);
                c23028.f74836 = iM9453;
                int iIndexOf = TextUtils.indexOf(charSequence, '\n', iM9453 + 1);
                c23028.f74835 = iIndexOf;
                if (iIndexOf == -1) {
                    c23028.f74835 = charSequence.length();
                }
                arrayList.add(c23028);
                for (AbstractC8774 abstractC8776 : c8753.f30090) {
                    if (abstractC8776 instanceof C6656) {
                        C6656 c6656 = (C6656) abstractC8776;
                        C22322 c22322 = new C22322();
                        c22322.f72894 = c6656.f22478.toString();
                        c22322.f72899 = m10746(map2, c6656.f22477);
                        c22322.f72898 = c23028.f74834;
                        AbstractC5930 abstractC5930 = c6656.f22481;
                        if (abstractC5930 instanceof C1321) {
                            c22322.f72893 = abstractC5930.toString();
                        }
                        c22322.f72897 = (c6656.f22476.f70567 & 8) != 0;
                        c22322.f72896 = C3128.m9453(c6656);
                        c22322.f72895 = C3128.m9435(c6656, c10164M16097.f34724);
                        arrayList3.add(c22322);
                        it = it2;
                        map = map2;
                    } else if (abstractC8776 instanceof C23195) {
                        C23195 c23195 = (C23195) abstractC8776;
                        C1154 c1154 = new C1154();
                        c1154.f5175 = c23195.f75272.toString();
                        c1154.f5177 = m10746(map2, c23195.f75266);
                        c1154.f5178 = c23028.f74834;
                        StringBuilder sb2 = new StringBuilder();
                        Iterator it3 = c23195.f75270.iterator();
                        while (it3.hasNext()) {
                            sb2.append(m10746(map2, ((C6656) it3.next()).f22477));
                            it2 = it2;
                        }
                        it = it2;
                        map = map2;
                        Set setM21885 = C8360.m21885(c23195.f75267.f70567);
                        c1154.f5174 = (setM21885.contains(EnumC4870.f17131) || setM21885.contains(EnumC4870.f17128) || c1154.f5175.equals("<init>")) ? false : true;
                        c1154.f5176 = sb2.toString();
                        c1154.f5180 = C3128.m9453(c23195);
                        c1154.f5179 = C3128.m9435(c23195, c10164M16097.f34724);
                        arrayList2.add(c1154);
                    } else {
                        it = it2;
                        map = map2;
                        if (abstractC8776 instanceof C21452) {
                            C21452 c21452 = (C21452) abstractC8776;
                            C1154 c1155 = new C1154();
                            c1155.f5175 = "<clinit>";
                            c1155.f5177 = "V";
                            c1155.f5176 = "";
                            c1155.f5178 = c23028.f74834;
                            c1155.f5174 = false;
                            c1155.f5180 = C3128.m9453(c21452);
                            c1155.f5179 = C3128.m9435(c21452, c10164M16097.f34724);
                            arrayList2.add(c1155);
                        }
                    }
                    c = '/';
                    it2 = it;
                    map2 = map;
                }
                runnableC3039 = null;
            }
        }
        new C2234(c10164M16097, charSequence, arrayList4).mo3935(c10164M16097);
        return new RunnableC3039(c3645, arrayList, arrayList2, arrayList3, arrayList4, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.ۘܰۜ, l.᩹᩻ۘ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10748(C3645 c3645, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        c3645.f13368 = C0561.unmodifiableList(arrayList);
        c3645.f13373 = C0561.unmodifiableList(arrayList2);
        c3645.f13371 = C0561.unmodifiableList(arrayList3);
        c3645.f13375 = C0561.unmodifiableList(arrayList4);
        ?? r1 = c3645.f13374;
        if (r1 != 0) {
            c3645.m10750(c3645.f13369, c3645.f13372, r1);
        }
        InterfaceC13150 interfaceC13150 = c3645.f70111;
        if (interfaceC13150 != null) {
            interfaceC13150.mo9540(c3645.f13368, c3645.f13373, c3645.f13371, c3645.f13375);
        }
    }

    @Override // l.AbstractC21616
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo10751() {
        if (m30285()) {
            return this.f13370;
        }
        return null;
    }

    @Override // l.AbstractC21616
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10752(final int i, final int i2, final InterfaceC3976 interfaceC3976) {
        m30283(new Runnable(interfaceC3976, i, i2) { // from class: l.ۙۖۜ

            /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f15564;

            /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f15566;

            /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ AbstractC22611 f15567;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f15567 = (AbstractC22611) interfaceC3976;
                this.f15564 = i;
                this.f15566 = i2;
            }

            /* JADX WARN: Type inference failed for: r3v0, types: [l.ۘܰۜ, l.᩹᩻ۘ] */
            @Override // java.lang.Runnable
            public final void run() {
                C3645.m10749(this.f15565, (InterfaceC3976) this.f15567, this.f15564, this.f15566);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10749(C3645 c3645, InterfaceC3976 interfaceC3976, int i, int i2) {
        c3645.f13374 = (AbstractC22611) interfaceC3976;
        c3645.f13369 = i;
        c3645.f13372 = i2;
        if (c3645.m30285()) {
            c3645.m10750(i, i2, interfaceC3976);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m10750(int i, int i2, InterfaceC3976 interfaceC3976) {
        int i3;
        int i4;
        int i5;
        this.f13370 = null;
        for (C23028 c23028 : this.f13368) {
            int i6 = c23028.f74836;
            if (i >= i6 && i <= (i5 = c23028.f74835)) {
                if (i2 < i6 || i2 > i5) {
                    interfaceC3976.mo11470(0, 0, null);
                    return;
                } else {
                    this.f13370 = c23028;
                    interfaceC3976.mo11470(-1, -1, c23028.f74837);
                    return;
                }
            }
        }
        for (C22322 c22322 : this.f13371) {
            int i7 = c22322.f72896;
            if (i >= i7 && i <= (i4 = c22322.f72895)) {
                if (i2 < i7 || i2 > i4) {
                    interfaceC3976.mo11470(0, 0, null);
                    return;
                } else {
                    this.f13370 = c22322;
                    interfaceC3976.mo11470(-1, -1, c22322.f72894);
                    return;
                }
            }
        }
        for (C1154 c1154 : this.f13373) {
            int i8 = c1154.f5180;
            if (i >= i8 && i <= (i3 = c1154.f5179)) {
                if (i2 < i8 || i2 > i3) {
                    interfaceC3976.mo11470(0, 0, null);
                    return;
                } else {
                    this.f13370 = c1154;
                    interfaceC3976.mo11470(c1154.f5180, c1154.f5179, C22697.m50267(new StringBuilder(), c1154.f5175, "()"));
                    return;
                }
            }
        }
        interfaceC3976.mo11470(0, 0, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m10746(HashMap map, AbstractC5930 abstractC5930) {
        if (abstractC5930 == null) {
            return "V";
        }
        if (abstractC5930 instanceof C12611) {
            C12611 c12611 = (C12611) abstractC5930;
            switch (C11408.f38415[c12611.f42127.ordinal()]) {
                case 1:
                    return "Z";
                case 2:
                    return "B";
                case 3:
                    return "S";
                case 4:
                    return "I";
                case 5:
                    return "J";
                case 6:
                    return "C";
                case 7:
                    return "F";
                case 8:
                    return "D";
                case 9:
                    return "V";
                default:
                    throw new RuntimeException("unknown primitive type " + c12611);
            }
        }
        if (!(abstractC5930 instanceof C3107) && !(abstractC5930 instanceof C23570)) {
            if (abstractC5930 instanceof C0990) {
                return "[" + m10746(map, ((C0990) abstractC5930).f4638);
            }
            if (abstractC5930 instanceof C11596) {
                return m10746(map, ((C11596) abstractC5930).f38963);
            }
            if (abstractC5930 instanceof C12281) {
                return "<error>";
            }
            throw new RuntimeException("unknown type " + abstractC5930.getClass().getSimpleName() + " " + abstractC5930);
        }
        String string = abstractC5930.toString();
        int iIndexOf = string.indexOf(46);
        if (iIndexOf == -1) {
            String str = (String) C9735.getOrDefault(map, string, string);
            C13638.requireNonNull(str);
            return "L" + str.replace('.', '/') + l.b;
        }
        String strSubstring = string.substring(0, iIndexOf);
        if (((String) map.get(strSubstring)) == null) {
            return "L" + string.replace('.', '/') + l.b;
        }
        StringBuilder sbM23356 = C9023.m23356(strSubstring);
        sbM23356.append(string.substring(iIndexOf).replace('.', '$'));
        return "L" + sbM23356.toString().replace('.', '/') + l.b;
    }
}
