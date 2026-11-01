package l;

import com.alipay.sdk.m.u0.b;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.۫ᩴ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Y43E */
/* JADX INFO: loaded from: classes4.dex */
public final class C12590 extends C6281 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final String[] f42076 = {"", EnumC19730.f63352, ASN1Dump.TAB, "      ", EnumC19730.f63358, "          ", "            ", "              ", "                ", "                  ", "                    "};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16865 f42077;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final PrintWriter f42078;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f42079 = 0;

    public C12590(PrintWriter printWriter, C16202 c16202) {
        this.f42078 = new PrintWriter(printWriter);
        this.f42077 = c16202;
    }

    @Override // l.C11221, l.AbstractC7693
    /* JADX INFO: renamed from: ۙ */
    public final Object mo20326(C6263 c6263, Object obj) {
        EnumC1923 enumC1923Mo17325 = c6263.mo17325();
        m31336((InterfaceC14625) c6263, (Boolean) obj);
        EnumC1923 enumC1923 = EnumC1923.ENUM_CONSTANT;
        PrintWriter printWriter = this.f42078;
        if (enumC1923Mo17325 == enumC1923) {
            printWriter.print(c6263.mo2883());
            return this;
        }
        printWriter.print(c6263.mo17328().toString() + " " + ((Object) c6263.mo2883()));
        Object objM17324 = c6263.m17324();
        if (objM17324 != null) {
            printWriter.print(" = ");
            ((C16202) this.f42077).getClass();
            printWriter.print(C20104.m45468(objM17324));
        }
        printWriter.println(l.b);
        return this;
    }

    @Override // l.C11221, l.AbstractC7693
    /* JADX INFO: renamed from: ۙ */
    public final Object mo18689(C7675 c7675, Object obj) {
        m31336((InterfaceC14625) c7675, Boolean.FALSE);
        boolean zM20275 = c7675.m20275();
        PrintWriter printWriter = this.f42078;
        if (!zM20275) {
            printWriter.println("package " + ((Object) c7675.f25396) + l.b);
            return this;
        }
        printWriter.println("// Unnamed package");
        return this;
    }

    @Override // l.C11221, l.AbstractC7693
    /* JADX INFO: renamed from: ۙ */
    public final Object mo20327(C16142 c16142, Object obj) {
        return this;
    }

    @Override // l.C11221, l.AbstractC7693
    /* JADX INFO: renamed from: ۙ */
    public final Object mo20328(C16847 c16847, Object obj) {
        this.f42078.print(c16847.f77453);
        return this;
    }

    @Override // l.C11221, l.AbstractC7693
    /* JADX INFO: renamed from: ۙ */
    public final Object mo18690(C18258 c18258, Object obj) {
        EnumC1923 enumC1923Mo17325 = c18258.mo17325();
        if (enumC1923Mo17325 != EnumC1923.STATIC_INIT && enumC1923Mo17325 != EnumC1923.INSTANCE_INIT) {
            InterfaceC14625 interfaceC14625Mo2880 = c18258.mo2880();
            if (enumC1923Mo17325 != EnumC1923.CONSTRUCTOR || interfaceC14625Mo2880 == null || EnumC1342.ANONYMOUS != interfaceC14625Mo2880.mo3841(new C20351(), null)) {
                m31336((InterfaceC14625) c18258, Boolean.TRUE);
                m31334((InterfaceC13338) c18258, true);
                int i = C21056.f68580[enumC1923Mo17325.ordinal()];
                PrintWriter printWriter = this.f42078;
                if (i == 1) {
                    printWriter.print(c18258.mo2880().mo2883());
                } else if (i == 2) {
                    printWriter.print(c18258.mo24650().toString());
                    printWriter.print(" ");
                    printWriter.print(c18258.mo2883().toString());
                }
                printWriter.print(MotionUtils.EASING_TYPE_FORMAT_START);
                m31332((InterfaceC9686) c18258);
                printWriter.print(MotionUtils.EASING_TYPE_FORMAT_END);
                AbstractC23156 abstractC23156Mo24654 = c18258.mo24654();
                if (abstractC23156Mo24654 != null) {
                    printWriter.print(" default " + abstractC23156Mo24654);
                }
                C21825<InterfaceC9105> c21825Mo24651 = c18258.mo24651();
                int iM48596 = c21825Mo24651.m48596();
                if (iM48596 != 0) {
                    printWriter.print(" throws");
                    int i2 = 1;
                    for (InterfaceC9105 interfaceC9105 : c21825Mo24651) {
                        if (i2 == 1) {
                            printWriter.print(" ");
                        }
                        if (i2 == 2) {
                            this.f42079++;
                        }
                        if (i2 >= 2) {
                            m31331();
                        }
                        printWriter.print(interfaceC9105);
                        if (i2 != iM48596) {
                            printWriter.println(", ");
                        }
                        i2++;
                    }
                    if (iM48596 >= 2) {
                        this.f42079--;
                    }
                }
                printWriter.println(l.b);
            }
        }
        return this;
    }

    @Override // l.C11221, l.AbstractC7693
    /* JADX INFO: renamed from: ۙ */
    public final Object mo20329(C19670 c19670, Object obj) {
        m31336((InterfaceC14625) c19670, Boolean.FALSE);
        boolean zM44806 = c19670.m44806();
        PrintWriter printWriter = this.f42078;
        if (zM44806) {
            printWriter.println("// Unnamed module");
            return this;
        }
        if (c19670.f63137.contains(EnumC18964.OPEN)) {
            printWriter.print("open ");
        }
        printWriter.println("module " + ((Object) c19670.f77453) + " {");
        this.f42079 = this.f42079 + 1;
        c19670.m52718();
        InterfaceC13320 interfaceC13320 = c19670.f63147;
        InterfaceC13320 interfaceC13321 = InterfaceC13320.f44208;
        if (interfaceC13320 != interfaceC13321) {
            c19670.f63147 = interfaceC13321;
            interfaceC13320.mo1179(c19670);
        }
        for (InterfaceC14044 interfaceC14044 : C0561.unmodifiableList(c19670.f63146)) {
            m31331();
            interfaceC14044.mo4647(new C16823(printWriter));
            printWriter.println(l.b);
        }
        this.f42079--;
        printWriter.println(l.d);
        return this;
    }

    @Override // l.AbstractC7693
    /* JADX INFO: renamed from: ۙ */
    public final Object mo18691(C22492 c22492, Object obj) {
        EnumC1923 enumC1923Mo17325 = c22492.mo17325();
        EnumC1342 enumC1342M50012 = c22492.m50012();
        EnumC1342 enumC1342 = EnumC1342.ANONYMOUS;
        int i = 0;
        PrintWriter printWriter = this.f42078;
        if (enumC1342 == enumC1342M50012) {
            printWriter.print("new ");
            C21825 c21825M50007 = c22492.m50007();
            if (c21825M50007.isEmpty()) {
                printWriter.print(c22492.mo49995());
            } else {
                printWriter.print(c21825M50007.get(0));
            }
            printWriter.print(MotionUtils.EASING_TYPE_FORMAT_START);
            if (c21825M50007.isEmpty()) {
                ArrayList arrayListM47533 = C21098.m47533(c22492.mo2882());
                if (!arrayListM47533.isEmpty()) {
                    m31332((InterfaceC9686) arrayListM47533.get(0));
                }
            }
            printWriter.print(MotionUtils.EASING_TYPE_FORMAT_END);
        } else {
            if (enumC1342M50012 == EnumC1342.TOP_LEVEL) {
                C7675 c7675M38306 = ((C16202) this.f42077).m38306(c22492);
                if (!c7675M38306.m20275()) {
                    printWriter.print("package " + ((Object) c7675M38306.f25396) + ";\n");
                }
            }
            m31336((InterfaceC14625) c22492, Boolean.TRUE);
            if (C21056.f68580[enumC1923Mo17325.ordinal()] != 3) {
                printWriter.print(enumC1923Mo17325.toString().toLowerCase(Locale.US));
            } else {
                printWriter.print("@interface");
            }
            printWriter.print(" ");
            printWriter.print(c22492.f77453);
            m31334((InterfaceC13338) c22492, false);
            if (enumC1923Mo17325 == EnumC1923.RECORD) {
                printWriter.print(MotionUtils.EASING_TYPE_FORMAT_START);
                printWriter.print((String) C9030.stream(c22492.m50005()).map(new C22057(this)).collect(C1890.joining(", ")));
                printWriter.print(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            if (enumC1923Mo17325 == EnumC1923.CLASS) {
                InterfaceC9105 interfaceC9105Mo49995 = c22492.mo49995();
                EnumC19688 enumC19688Mo1931 = interfaceC9105Mo49995.mo1931();
                EnumC19688 enumC19688 = EnumC19688.NONE;
                if (enumC19688Mo1931 != enumC19688 && ((InterfaceC23216) ((InterfaceC8399) interfaceC9105Mo49995).mo1935()).mo49995().mo1931() != enumC19688) {
                    printWriter.print(" extends " + interfaceC9105Mo49995);
                }
            }
            EnumC1923 enumC1923Mo17326 = c22492.mo17325();
            if (enumC1923Mo17326 != EnumC1923.ANNOTATION_TYPE) {
                C21825 c21825M50008 = c22492.m50007();
                if (!c21825M50008.isEmpty()) {
                    printWriter.print(enumC1923Mo17326.m6255() ? " implements " : " extends ");
                    printWriter.print((String) C9030.stream(c21825M50008).map(new C11739(7)).collect(C1890.joining(", ")));
                }
            }
            C21825 c21825M48592 = c22492.f73421.m48592((Function) new C1852(6));
            if (!c21825M48592.isEmpty()) {
                printWriter.print(" permits ");
                printWriter.print((String) C9030.stream(c21825M48592).map(new C12964(6)).collect(C1890.joining(", ")));
            }
        }
        printWriter.println(" {");
        this.f42079++;
        if (enumC1923Mo17325 == EnumC1923.ENUM) {
            ArrayList<InterfaceC14625> arrayList = new ArrayList(c22492.mo2882());
            ArrayList arrayList2 = new ArrayList();
            for (InterfaceC14625 interfaceC14625 : arrayList) {
                if (interfaceC14625.mo17325() == EnumC1923.ENUM_CONSTANT) {
                    arrayList2.add(interfaceC14625);
                }
            }
            if (!arrayList2.isEmpty()) {
                while (i < arrayList2.size() - 1) {
                    ((InterfaceC14625) arrayList2.get(i)).mo3841(this, Boolean.TRUE);
                    printWriter.print(",");
                    i++;
                }
                ((InterfaceC14625) arrayList2.get(i)).mo3841(this, Boolean.TRUE);
                printWriter.println(";\n");
                arrayList.removeAll(arrayList2);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC14625) it.next()).mo3841(this, null);
            }
        } else {
            Iterator it2 = (enumC1923Mo17325 != EnumC1923.RECORD ? c22492.mo2882() : C9030.stream(c22492.mo2882()).filter(new Predicate() { // from class: l.ܺᩴ۟
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C8512.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo9645negate() {
                    return C8512.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C8512.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return ((C16202) this.f52109.f42077).m38309((InterfaceC14625) obj2) == EnumC0636.EXPLICIT;
                }
            }).toList()).iterator();
            while (it2.hasNext()) {
                ((InterfaceC14625) it2.next()).mo3841(this, null);
            }
        }
        this.f42079--;
        m31331();
        printWriter.println(l.d);
        return this;
    }

    @Override // l.C11221
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo28183(AbstractC23903 abstractC23903, Object obj) {
        m31336((InterfaceC14625) abstractC23903, (Boolean) obj);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31336(InterfaceC14625 interfaceC14625, Boolean bool) {
        PrintWriter printWriter = this.f42078;
        if (bool != null && bool.booleanValue()) {
            printWriter.println();
        }
        String strM38310 = ((C16202) this.f42077).m38310(interfaceC14625);
        if (strM38310 != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(strM38310, "\n\r");
            m31331();
            printWriter.println("/**");
            while (stringTokenizer.hasMoreTokens()) {
                m31331();
                printWriter.print(" *");
                printWriter.println(stringTokenizer.nextToken());
            }
            m31331();
            printWriter.println(" */");
        }
        m31335(interfaceC14625);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m31328(InterfaceC6987 interfaceC6987) {
        return m31329((InterfaceC14625) interfaceC6987) + interfaceC6987.mo17328().toString() + " " + ((Object) interfaceC6987.mo2883());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m31335(InterfaceC14625 interfaceC14625) {
        EnumC1923 enumC1923Mo17325 = interfaceC14625.mo17325();
        EnumC1923 enumC1923 = EnumC1923.PARAMETER;
        PrintWriter printWriter = this.f42078;
        if (enumC1923Mo17325 == enumC1923 || enumC1923Mo17325 == EnumC1923.RECORD_COMPONENT) {
            printWriter.print(m31329(interfaceC14625));
        } else {
            for (InterfaceC6157 interfaceC6157 : interfaceC14625.mo2878()) {
                boolean zBooleanValue = false;
                if (((C16202) this.f42077).m38304(interfaceC6157) == EnumC0636.MANDATED) {
                    Set setEntrySet = interfaceC6157.mo17160().entrySet();
                    if (setEntrySet.size() == 1) {
                        AbstractC0618 abstractC0618Mo1935 = interfaceC6157.mo17159().mo1935();
                        InterfaceC11097 interfaceC11097 = (InterfaceC11097) ((Map.Entry) setEntrySet.iterator().next()).getValue();
                        if (abstractC0618Mo1935.mo17325() == EnumC1923.ANNOTATION_TYPE) {
                            ArrayList arrayListM47534 = C21098.m47534(abstractC0618Mo1935.mo2882());
                            if (arrayListM47534.size() == 1) {
                                InterfaceC9686 interfaceC9686 = (InterfaceC9686) arrayListM47534.get(0);
                                AbstractC16579 abstractC16579Mo24650 = interfaceC9686.mo24650();
                                if (b.d.equals(interfaceC9686.mo2883().toString()) && abstractC16579Mo24650.mo1931() == EnumC19688.ARRAY) {
                                    zBooleanValue = ((Boolean) interfaceC11097.mo8225(new C0594(this))).booleanValue();
                                }
                            }
                        }
                    }
                }
                if (!zBooleanValue) {
                    m31331();
                    printWriter.println(interfaceC6157);
                }
            }
            m31331();
        }
        if (enumC1923Mo17325 == EnumC1923.ENUM_CONSTANT || enumC1923Mo17325 == EnumC1923.RECORD_COMPONENT) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(interfaceC14625.mo35138());
        switch (C21056.f68580[enumC1923Mo17325.ordinal()]) {
            case 2:
            case 7:
                InterfaceC14625 interfaceC14625Mo2880 = interfaceC14625.mo2880();
                if (interfaceC14625Mo2880 != null && interfaceC14625Mo2880.mo17325().m6256()) {
                    linkedHashSet.remove(EnumC4870.f17141);
                    linkedHashSet.remove(EnumC4870.f17140);
                    linkedHashSet.remove(EnumC4870.f17128);
                    linkedHashSet.remove(EnumC4870.f17138);
                }
                break;
            case 3:
            case 4:
                linkedHashSet.remove(EnumC4870.f17140);
                break;
            case 5:
                linkedHashSet.remove(EnumC4870.f17138);
                linkedHashSet.remove(EnumC4870.f17140);
                linkedHashSet.remove(EnumC4870.f17136);
                break;
            case 6:
                linkedHashSet.remove(EnumC4870.f17138);
                break;
        }
        if (linkedHashSet.isEmpty()) {
            return;
        }
        printWriter.print((String) C9030.stream(linkedHashSet).map(new C5008(9)).collect(C1890.joining(" ", "", " ")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31334(InterfaceC13338 interfaceC13338, boolean z) {
        C21825 c21825Mo24652 = interfaceC13338.mo24652();
        if (c21825Mo24652.isEmpty()) {
            return;
        }
        String str = (String) C9030.stream(c21825Mo24652).map(new C19929(this)).collect(C1890.joining(", ", "<", ">"));
        PrintWriter printWriter = this.f42078;
        printWriter.print(str);
        if (z) {
            printWriter.print(" ");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m31330(InterfaceC15455 interfaceC15455) {
        return m31329((InterfaceC14625) interfaceC15455) + interfaceC15455.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m31329(InterfaceC14625 interfaceC14625) {
        C21825 c21825Mo2878 = interfaceC14625.mo2878();
        return c21825Mo2878.isEmpty() ? "" : (String) C9030.stream(c21825Mo2878).map(new C16025(5)).collect(C1890.joining(" ", "", " "));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31332(InterfaceC9686 interfaceC9686) {
        C21825<InterfaceC18276> parameters = interfaceC9686.getParameters();
        int iM48596 = parameters.m48596();
        if (iM48596 != 0) {
            PrintWriter printWriter = this.f42078;
            if (iM48596 == 1) {
                for (InterfaceC18276 interfaceC18276 : parameters) {
                    m31335(interfaceC18276);
                    if (interfaceC9686.mo24653()) {
                        AbstractC16579 abstractC16579Mo17328 = interfaceC18276.mo17328();
                        if (abstractC16579Mo17328.mo1931() != EnumC19688.ARRAY) {
                            throw new AssertionError("Var-args parameter is not an array type: " + abstractC16579Mo17328);
                        }
                        printWriter.print(((InterfaceC18982) InterfaceC18982.class.cast(abstractC16579Mo17328)).mo21285());
                        printWriter.print("...");
                    } else {
                        printWriter.print(interfaceC18276.mo17328());
                    }
                    printWriter.print(" " + ((Object) interfaceC18276.mo2883()));
                }
                return;
            }
            int i = 1;
            for (InterfaceC18276 interfaceC18277 : parameters) {
                if (i == 2) {
                    this.f42079++;
                }
                if (i > 1) {
                    m31331();
                }
                m31335(interfaceC18277);
                if (i == iM48596 && interfaceC9686.mo24653()) {
                    AbstractC16579 abstractC16579Mo17329 = interfaceC18277.mo17328();
                    if (abstractC16579Mo17329.mo1931() != EnumC19688.ARRAY) {
                        throw new AssertionError("Var-args parameter is not an array type: " + abstractC16579Mo17329);
                    }
                    printWriter.print(((InterfaceC18982) InterfaceC18982.class.cast(abstractC16579Mo17329)).mo21285());
                    printWriter.print("...");
                } else {
                    printWriter.print(interfaceC18277.mo17328());
                }
                printWriter.print(" " + ((Object) interfaceC18277.mo2883()));
                if (i < iM48596) {
                    printWriter.println(",");
                }
                i++;
            }
            if (parameters.m48596() >= 2) {
                this.f42079--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m31331() {
        int i = this.f42079;
        if (i < 0) {
            return;
        }
        while (true) {
            String[] strArr = f42076;
            PrintWriter printWriter = this.f42078;
            if (i > 10) {
                printWriter.print(strArr[10]);
                i -= 10;
            } else {
                printWriter.print(strArr[i]);
                return;
            }
        }
    }
}
