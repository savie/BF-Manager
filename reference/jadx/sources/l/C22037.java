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

/* JADX INFO: renamed from: l.᩷ۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BN4 */
/* JADX INFO: loaded from: classes.dex */
public final class C22037 extends AbstractC20874 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public List f71067;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public List f71068;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public List f71069;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Object f71070;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public List f71071;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f71072;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC9051 f71073;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f71074;

    public C22037() {
        List list = Collections.EMPTY_LIST;
        this.f71069 = list;
        this.f71068 = list;
        this.f71067 = list;
        this.f71071 = list;
    }

    @Override // l.AbstractC21775
    /* JADX INFO: renamed from: ۙ */
    public final void mo14428(C20283 c20283, CharSequence charSequence) {
        m47706(charSequence, new C6849(this, c20283));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static RunnableC1395 m49823(C22037 c22037, C20283 c20283, CharSequence charSequence, InterfaceC7509 interfaceC7509) {
        Iterator it;
        HashMap map;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        C19113 c19113M11814 = C3647.m11814(charSequence);
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
        for (AbstractC8036 abstractC8036 : c19113M11814.f61857) {
            if (abstractC8036 instanceof C11852) {
                C23041 c23041 = (C23041) ((C11852) abstractC8036).f38181;
                map2.put(c23041.f74774.toString(), c23041.toString());
            } else if (abstractC8036 instanceof C7926) {
                arrayList5.add(((C7926) abstractC8036).f26346.toString());
            }
        }
        final String str = c19113M11814.m44236() == null ? "" : c19113M11814.m44236().toString() + ".";
        char c = '/';
        RunnableC1395 runnableC1395 = null;
        c20283.m46589(new InterfaceC21620() { // from class: l.ۢ᩵ۧ
            @Override // l.InterfaceC21620
            /* JADX INFO: renamed from: ۙ */
            public final void mo25303(InterfaceC14906 interfaceC14906) {
                String strMo10208 = ((C3129) interfaceC14906).mo10208();
                String str2 = str;
                String strSubstring = strMo10208.substring(str2.length());
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
        Iterator it2 = c19113M11814.f61857.iterator();
        while (it2.hasNext()) {
            AbstractC8036 abstractC8037 = (AbstractC8036) it2.next();
            if (interfaceC7509.mo924()) {
                return runnableC1395;
            }
            if (abstractC8037 instanceof C7926) {
                C7926 c7926 = (C7926) abstractC8037;
                C14160 c14160 = new C14160();
                c14160.f44771 = c7926.f26346.toString();
                StringBuilder sb = new StringBuilder("L");
                sb.append(str.replace('.', c));
                c14160.f44772 = C8947.m23910(sb, c14160.f44771, l.b);
                int iM28342 = C11239.m28342(c7926);
                c14160.f44770 = iM28342;
                int iIndexOf = TextUtils.indexOf(charSequence, '\n', iM28342 + 1);
                c14160.f44769 = iIndexOf;
                if (iIndexOf == -1) {
                    c14160.f44769 = charSequence.length();
                }
                arrayList.add(c14160);
                for (AbstractC8036 abstractC8038 : c7926.f26344) {
                    if (abstractC8038 instanceof C12510) {
                        C12510 c12510 = (C12510) abstractC8038;
                        C1483 c1483 = new C1483();
                        c1483.f5157 = c12510.f40164.toString();
                        c1483.f5154 = m49822(map2, c12510.f40166);
                        c1483.f5156 = c14160.f44772;
                        AbstractC22295 abstractC22295 = c12510.f40171;
                        if (abstractC22295 instanceof C23787) {
                            c1483.f5153 = abstractC22295.toString();
                        }
                        c1483.f5152 = (c12510.f40170.f15825 & 8) != 0;
                        c1483.f5155 = C11239.m28342(c12510);
                        c1483.f5151 = C11239.m28320(c12510, c19113M11814.f61860);
                        arrayList3.add(c1483);
                        it = it2;
                        map = map2;
                    } else if (abstractC8038 instanceof C6633) {
                        C6633 c6633 = (C6633) abstractC8038;
                        C9685 c9685 = new C9685();
                        c9685.f31271 = c6633.f22150.toString();
                        c9685.f31269 = m49822(map2, c6633.f22147);
                        c9685.f31266 = c14160.f44772;
                        StringBuilder sb2 = new StringBuilder();
                        Iterator it3 = c6633.f22145.iterator();
                        while (it3.hasNext()) {
                            sb2.append(m49822(map2, ((C12510) it3.next()).f40166));
                            it2 = it2;
                        }
                        it = it2;
                        map = map2;
                        Set setM8160 = C2417.m8160(c6633.f22144.f15825);
                        c9685.f31267 = (setM8160.contains(EnumC24688.f79881) || setM8160.contains(EnumC24688.f79879) || c9685.f31271.equals("<init>")) ? false : true;
                        c9685.f31265 = sb2.toString();
                        c9685.f31268 = C11239.m28342(c6633);
                        c9685.f31270 = C11239.m28320(c6633, c19113M11814.f61860);
                        arrayList2.add(c9685);
                    } else {
                        it = it2;
                        map = map2;
                        if (abstractC8038 instanceof C4197) {
                            C4197 c4197 = (C4197) abstractC8038;
                            C9685 c9686 = new C9685();
                            c9686.f31271 = "<clinit>";
                            c9686.f31269 = "V";
                            c9686.f31265 = "";
                            c9686.f31266 = c14160.f44772;
                            c9686.f31267 = false;
                            c9686.f31268 = C11239.m28342(c4197);
                            c9686.f31270 = C11239.m28320(c4197, c19113M11814.f61860);
                            arrayList2.add(c9686);
                        }
                    }
                    c = '/';
                    it2 = it;
                    map2 = map;
                }
                runnableC1395 = null;
            }
        }
        new C2886(c19113M11814, charSequence, arrayList4).mo2609(c19113M11814);
        return new RunnableC1395(c22037, arrayList, arrayList2, arrayList3, arrayList4, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.۠᩹ۧ, l.ۡ֫ۧ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49824(C22037 c22037, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        c22037.f71069 = C4681.unmodifiableList(arrayList);
        c22037.f71068 = C4681.unmodifiableList(arrayList2);
        c22037.f71067 = C4681.unmodifiableList(arrayList3);
        c22037.f71071 = C4681.unmodifiableList(arrayList4);
        ?? r1 = c22037.f71073;
        if (r1 != 0) {
            c22037.m49826(c22037.f71074, c22037.f71072, r1);
        }
        InterfaceC2974 interfaceC2974 = c22037.f69427;
        if (interfaceC2974 != null) {
            interfaceC2974.mo9690(c22037.f71069, c22037.f71068, c22037.f71067, c22037.f71071);
        }
    }

    @Override // l.AbstractC21775
    /* JADX INFO: renamed from: ۙ */
    public final Object mo14424() {
        if (m47708()) {
            return this.f71070;
        }
        return null;
    }

    @Override // l.AbstractC21775
    /* JADX INFO: renamed from: ۙ */
    public final void mo14425(final int i, final int i2, final InterfaceC8940 interfaceC8940) {
        m47707(new Runnable(interfaceC8940, i, i2) { // from class: l.ᩳ᩵ۧ

            /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f62366;

            /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f62368;

            /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ AbstractC9051 f62369;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f62369 = (AbstractC9051) interfaceC8940;
                this.f62368 = i;
                this.f62366 = i2;
            }

            /* JADX WARN: Type inference failed for: r3v0, types: [l.۠᩹ۧ, l.ۡ֫ۧ] */
            @Override // java.lang.Runnable
            public final void run() {
                C22037.m49825(this.f62367, (InterfaceC8940) this.f62369, this.f62368, this.f62366);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49825(C22037 c22037, InterfaceC8940 interfaceC8940, int i, int i2) {
        c22037.f71073 = (AbstractC9051) interfaceC8940;
        c22037.f71074 = i;
        c22037.f71072 = i2;
        if (c22037.m47708()) {
            c22037.m49826(i, i2, interfaceC8940);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m49826(int i, int i2, InterfaceC8940 interfaceC8940) {
        int i3;
        int i4;
        int i5;
        this.f71070 = null;
        for (C14160 c14160 : this.f71069) {
            int i6 = c14160.f44770;
            if (i >= i6 && i <= (i5 = c14160.f44769)) {
                if (i2 < i6 || i2 > i5) {
                    interfaceC8940.mo1434(0, 0, null);
                    return;
                } else {
                    this.f71070 = c14160;
                    interfaceC8940.mo1434(-1, -1, c14160.f44771);
                    return;
                }
            }
        }
        for (C1483 c1483 : this.f71067) {
            int i7 = c1483.f5155;
            if (i >= i7 && i <= (i4 = c1483.f5151)) {
                if (i2 < i7 || i2 > i4) {
                    interfaceC8940.mo1434(0, 0, null);
                    return;
                } else {
                    this.f71070 = c1483;
                    interfaceC8940.mo1434(-1, -1, c1483.f5157);
                    return;
                }
            }
        }
        for (C9685 c9685 : this.f71068) {
            int i8 = c9685.f31268;
            if (i >= i8 && i <= (i3 = c9685.f31270)) {
                if (i2 < i8 || i2 > i3) {
                    interfaceC8940.mo1434(0, 0, null);
                    return;
                } else {
                    this.f71070 = c9685;
                    interfaceC8940.mo1434(c9685.f31268, c9685.f31270, C8947.m23910(new StringBuilder(), c9685.f31271, "()"));
                    return;
                }
            }
        }
        interfaceC8940.mo1434(0, 0, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m49822(HashMap map, AbstractC22295 abstractC22295) {
        if (abstractC22295 == null) {
            return "V";
        }
        if (abstractC22295 instanceof C14089) {
            C14089 c14089 = (C14089) abstractC22295;
            switch (C9597.f31062[c14089.f44595.ordinal()]) {
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
                    throw new RuntimeException("unknown primitive type " + c14089);
            }
        }
        if (!(abstractC22295 instanceof C5887) && !(abstractC22295 instanceof C23041)) {
            if (abstractC22295 instanceof C23589) {
                return "[" + m49822(map, ((C23589) abstractC22295).f76594);
            }
            if (abstractC22295 instanceof C25191) {
                return m49822(map, ((C25191) abstractC22295).f81425);
            }
            if (abstractC22295 instanceof C13891) {
                return "<error>";
            }
            throw new RuntimeException("unknown type " + abstractC22295.getClass().getSimpleName() + " " + abstractC22295);
        }
        String string = abstractC22295.toString();
        int iIndexOf = string.indexOf(46);
        if (iIndexOf == -1) {
            String str = (String) C11392.getOrDefault(map, string, string);
            C17359.requireNonNull(str);
            return "L" + str.replace('.', '/') + l.b;
        }
        String strSubstring = string.substring(0, iIndexOf);
        if (((String) map.get(strSubstring)) == null) {
            return "L" + string.replace('.', '/') + l.b;
        }
        StringBuilder sbM27333 = C10732.m27333(strSubstring);
        sbM27333.append(string.substring(iIndexOf).replace('.', '$'));
        return "L" + sbM27333.toString().replace('.', '/') + l.b;
    }
}
