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

/* JADX INFO: renamed from: l.۬ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y43E */
/* JADX INFO: loaded from: classes4.dex */
public final class C13586 extends C22690 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final String[] f43153 = {"", EnumC7687.f25319, ASN1Dump.TAB, "      ", EnumC7687.f25280, "          ", "            ", "              ", "                ", "                  ", "                    "};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4790 f43154;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final PrintWriter f43155;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f43156 = 0;

    public C13586(PrintWriter printWriter, C2466 c2466) {
        this.f43155 = new PrintWriter(printWriter);
        this.f43154 = c2466;
    }

    @Override // l.C19706, l.AbstractC9024
    /* JADX INFO: renamed from: ۙ */
    public final Object mo22364(C2920 c2920, Object obj) {
        m33302((InterfaceC12753) c2920, Boolean.FALSE);
        boolean zM9557 = c2920.m9557();
        PrintWriter printWriter = this.f43155;
        if (zM9557) {
            printWriter.println("// Unnamed module");
            return this;
        }
        if (c2920.f9552.contains(EnumC1429.OPEN)) {
            printWriter.print("open ");
        }
        printWriter.println("module " + ((Object) c2920.f38072) + " {");
        this.f43156 = this.f43156 + 1;
        c2920.m29583();
        InterfaceC14852 interfaceC14852 = c2920.f9555;
        InterfaceC14852 interfaceC14853 = InterfaceC14852.f48554;
        if (interfaceC14852 != interfaceC14853) {
            c2920.f9555 = interfaceC14853;
            interfaceC14852.mo11629(c2920);
        }
        for (InterfaceC16482 interfaceC16482 : C4681.unmodifiableList(c2920.f9543)) {
            m33296();
            interfaceC16482.mo1476(new C6875(printWriter));
            printWriter.println(l.b);
        }
        this.f43156--;
        printWriter.println(l.d);
        return this;
    }

    @Override // l.C19706, l.AbstractC9024
    /* JADX INFO: renamed from: ۙ */
    public final Object mo22365(C5816 c5816, Object obj) {
        EnumC5296 enumC5296Mo9558 = c5816.mo9558();
        m33302((InterfaceC12753) c5816, (Boolean) obj);
        EnumC5296 enumC5296 = EnumC5296.ENUM_CONSTANT;
        PrintWriter printWriter = this.f43155;
        if (enumC5296Mo9558 == enumC5296) {
            printWriter.print(c5816.mo9563());
            return this;
        }
        printWriter.print(c5816.mo16952().toString() + " " + ((Object) c5816.mo9563()));
        Object objM16958 = c5816.m16958();
        if (objM16958 != null) {
            printWriter.print(" = ");
            ((C2466) this.f43154).getClass();
            printWriter.print(C8257.m22248(objM16958));
        }
        printWriter.println(l.b);
        return this;
    }

    @Override // l.C19706, l.AbstractC9024
    /* JADX INFO: renamed from: ۙ */
    public final Object mo24076(C10377 c10377, Object obj) {
        EnumC5296 enumC5296Mo9558 = c10377.mo9558();
        if (enumC5296Mo9558 != EnumC5296.STATIC_INIT && enumC5296Mo9558 != EnumC5296.INSTANCE_INIT) {
            InterfaceC12753 interfaceC12753Mo16951 = c10377.mo16951();
            if (enumC5296Mo9558 != EnumC5296.CONSTRUCTOR || interfaceC12753Mo16951 == null || EnumC20212.ANONYMOUS != interfaceC12753Mo16951.mo7871(new C2400(), null)) {
                m33302((InterfaceC12753) c10377, Boolean.TRUE);
                m33298((InterfaceC12007) c10377, true);
                int i = C0909.f3409[enumC5296Mo9558.ordinal()];
                PrintWriter printWriter = this.f43155;
                if (i == 1) {
                    printWriter.print(c10377.mo16951().mo9563());
                } else if (i == 2) {
                    printWriter.print(c10377.mo5572().toString());
                    printWriter.print(" ");
                    printWriter.print(c10377.mo9563().toString());
                }
                printWriter.print(MotionUtils.EASING_TYPE_FORMAT_START);
                m33297((InterfaceC1567) c10377);
                printWriter.print(MotionUtils.EASING_TYPE_FORMAT_END);
                AbstractC21654 abstractC21654Mo5573 = c10377.mo5573();
                if (abstractC21654Mo5573 != null) {
                    printWriter.print(" default " + abstractC21654Mo5573);
                }
                C14769<InterfaceC9769> c14769Mo5571 = c10377.mo5571();
                int iM35551 = c14769Mo5571.m35551();
                if (iM35551 != 0) {
                    printWriter.print(" throws");
                    int i2 = 1;
                    for (InterfaceC9769 interfaceC9769 : c14769Mo5571) {
                        if (i2 == 1) {
                            printWriter.print(" ");
                        }
                        if (i2 == 2) {
                            this.f43156++;
                        }
                        if (i2 >= 2) {
                            m33296();
                        }
                        printWriter.print(interfaceC9769);
                        if (i2 != iM35551) {
                            printWriter.println(", ");
                        }
                        i2++;
                    }
                    if (iM35551 >= 2) {
                        this.f43156--;
                    }
                }
                printWriter.println(l.b);
            }
        }
        return this;
    }

    @Override // l.C19706
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ Object mo33301(AbstractC11781 abstractC11781, Object obj) {
        m33302((InterfaceC12753) abstractC11781, (Boolean) obj);
        return this;
    }

    @Override // l.C19706, l.AbstractC9024
    /* JADX INFO: renamed from: ۙ */
    public final Object mo24077(C14106 c14106, Object obj) {
        m33302((InterfaceC12753) c14106, Boolean.FALSE);
        boolean zM34259 = c14106.m34259();
        PrintWriter printWriter = this.f43155;
        if (!zM34259) {
            printWriter.println("package " + ((Object) c14106.f44619) + l.b);
            return this;
        }
        printWriter.println("// Unnamed package");
        return this;
    }

    @Override // l.C19706, l.AbstractC9024
    /* JADX INFO: renamed from: ۙ */
    public final Object mo18929(C19986 c19986, Object obj) {
        this.f43155.print(c19986.f38072);
        return this;
    }

    @Override // l.C19706, l.AbstractC9024
    /* JADX INFO: renamed from: ۙ */
    public final Object mo22366(C22224 c22224, Object obj) {
        return this;
    }

    @Override // l.AbstractC9024
    /* JADX INFO: renamed from: ۙ */
    public final Object mo8141(C24550 c24550, Object obj) {
        EnumC5296 enumC5296Mo9558 = c24550.mo9558();
        EnumC20212 enumC20212M54836 = c24550.m54836();
        EnumC20212 enumC20212 = EnumC20212.ANONYMOUS;
        int i = 0;
        PrintWriter printWriter = this.f43155;
        if (enumC20212 == enumC20212M54836) {
            printWriter.print("new ");
            C14769 c14769M54832 = c24550.m54832();
            if (c14769M54832.isEmpty()) {
                printWriter.print(c24550.mo12339());
            } else {
                printWriter.print(c14769M54832.get(0));
            }
            printWriter.print(MotionUtils.EASING_TYPE_FORMAT_START);
            if (c14769M54832.isEmpty()) {
                ArrayList arrayListM7817 = C2313.m7817(c24550.mo9561());
                if (!arrayListM7817.isEmpty()) {
                    m33297((InterfaceC1567) arrayListM7817.get(0));
                }
            }
            printWriter.print(MotionUtils.EASING_TYPE_FORMAT_END);
        } else {
            if (enumC20212M54836 == EnumC20212.TOP_LEVEL) {
                C14106 c14106M8320 = ((C2466) this.f43154).m8320(c24550);
                if (!c14106M8320.m34259()) {
                    printWriter.print("package " + ((Object) c14106M8320.f44619) + ";\n");
                }
            }
            m33302((InterfaceC12753) c24550, Boolean.TRUE);
            if (C0909.f3409[enumC5296Mo9558.ordinal()] != 3) {
                printWriter.print(enumC5296Mo9558.toString().toLowerCase(Locale.US));
            } else {
                printWriter.print("@interface");
            }
            printWriter.print(" ");
            printWriter.print(c24550.f38072);
            m33298((InterfaceC12007) c24550, false);
            if (enumC5296Mo9558 == EnumC5296.RECORD) {
                printWriter.print(MotionUtils.EASING_TYPE_FORMAT_START);
                printWriter.print((String) C1170.stream(c24550.m54825()).map(new C0652(this)).collect(C2025.joining(", ")));
                printWriter.print(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            if (enumC5296Mo9558 == EnumC5296.CLASS) {
                InterfaceC9769 interfaceC9769Mo12339 = c24550.mo12339();
                EnumC18720 enumC18720Mo5501 = interfaceC9769Mo12339.mo5501();
                EnumC18720 enumC18720 = EnumC18720.NONE;
                if (enumC18720Mo5501 != enumC18720 && ((InterfaceC3804) ((InterfaceC7533) interfaceC9769Mo12339).mo14287()).mo12339().mo5501() != enumC18720) {
                    printWriter.print(" extends " + interfaceC9769Mo12339);
                }
            }
            EnumC5296 enumC5296Mo9559 = c24550.mo9558();
            if (enumC5296Mo9559 != EnumC5296.ANNOTATION_TYPE) {
                C14769 c14769M54833 = c24550.m54832();
                if (!c14769M54833.isEmpty()) {
                    printWriter.print(enumC5296Mo9559.m15891() ? " implements " : " extends ");
                    printWriter.print((String) C1170.stream(c14769M54833).map(new C24057(7)).collect(C2025.joining(", ")));
                }
            }
            C14769 c14769M35547 = c24550.f79583.m35547((Function) new C0948(9));
            if (!c14769M35547.isEmpty()) {
                printWriter.print(" permits ");
                printWriter.print((String) C1170.stream(c14769M35547).map(new C17205(6)).collect(C2025.joining(", ")));
            }
        }
        printWriter.println(" {");
        this.f43156++;
        if (enumC5296Mo9558 == EnumC5296.ENUM) {
            ArrayList<InterfaceC12753> arrayList = new ArrayList(c24550.mo9561());
            ArrayList arrayList2 = new ArrayList();
            for (InterfaceC12753 interfaceC12753 : arrayList) {
                if (interfaceC12753.mo9558() == EnumC5296.ENUM_CONSTANT) {
                    arrayList2.add(interfaceC12753);
                }
            }
            if (!arrayList2.isEmpty()) {
                while (i < arrayList2.size() - 1) {
                    ((InterfaceC12753) arrayList2.get(i)).mo7871(this, Boolean.TRUE);
                    printWriter.print(",");
                    i++;
                }
                ((InterfaceC12753) arrayList2.get(i)).mo7871(this, Boolean.TRUE);
                printWriter.println(";\n");
                arrayList.removeAll(arrayList2);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC12753) it.next()).mo7871(this, null);
            }
        } else {
            Iterator it2 = (enumC5296Mo9558 != EnumC5296.RECORD ? c24550.mo9561() : C1170.stream(c24550.mo9561()).filter(new Predicate() { // from class: l.ۡۘۘ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19025.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo7134negate() {
                    return C19025.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19025.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return ((C2466) this.f29596.f43154).m8324((InterfaceC12753) obj2) == EnumC13499.EXPLICIT;
                }
            }).toList()).iterator();
            while (it2.hasNext()) {
                ((InterfaceC12753) it2.next()).mo7871(this, null);
            }
        }
        this.f43156--;
        m33296();
        printWriter.println(l.d);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33302(InterfaceC12753 interfaceC12753, Boolean bool) {
        PrintWriter printWriter = this.f43155;
        if (bool != null && bool.booleanValue()) {
            printWriter.println();
        }
        String strM8325 = ((C2466) this.f43154).m8325(interfaceC12753);
        if (strM8325 != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(strM8325, "\n\r");
            m33296();
            printWriter.println("/**");
            while (stringTokenizer.hasMoreTokens()) {
                m33296();
                printWriter.print(" *");
                printWriter.println(stringTokenizer.nextToken());
            }
            m33296();
            printWriter.println(" */");
        }
        m33300(interfaceC12753);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m33295(InterfaceC23942 interfaceC23942) {
        return m33293((InterfaceC12753) interfaceC23942) + interfaceC23942.mo16952().toString() + " " + ((Object) interfaceC23942.mo9563());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m33300(InterfaceC12753 interfaceC12753) {
        EnumC5296 enumC5296Mo9558 = interfaceC12753.mo9558();
        EnumC5296 enumC5296 = EnumC5296.PARAMETER;
        PrintWriter printWriter = this.f43155;
        if (enumC5296Mo9558 == enumC5296 || enumC5296Mo9558 == EnumC5296.RECORD_COMPONENT) {
            printWriter.print(m33293(interfaceC12753));
        } else {
            for (InterfaceC22450 interfaceC22450 : interfaceC12753.mo16957()) {
                boolean zBooleanValue = false;
                if (((C2466) this.f43154).m8319(interfaceC22450) == EnumC13499.MANDATED) {
                    Set setEntrySet = interfaceC22450.mo50624().entrySet();
                    if (setEntrySet.size() == 1) {
                        AbstractC22970 abstractC22970Mo14287 = interfaceC22450.mo50625().mo14287();
                        InterfaceC19466 interfaceC19466 = (InterfaceC19466) ((Map.Entry) setEntrySet.iterator().next()).getValue();
                        if (abstractC22970Mo14287.mo9558() == EnumC5296.ANNOTATION_TYPE) {
                            ArrayList arrayListM7818 = C2313.m7818(abstractC22970Mo14287.mo9561());
                            if (arrayListM7818.size() == 1) {
                                InterfaceC1567 interfaceC1567 = (InterfaceC1567) arrayListM7818.get(0);
                                AbstractC22664 abstractC22664Mo5572 = interfaceC1567.mo5572();
                                if (b.d.equals(interfaceC1567.mo9563().toString()) && abstractC22664Mo5572.mo5501() == EnumC18720.ARRAY) {
                                    zBooleanValue = ((Boolean) interfaceC19466.mo12191(new C8366(this))).booleanValue();
                                }
                            }
                        }
                    }
                }
                if (!zBooleanValue) {
                    m33296();
                    printWriter.println(interfaceC22450);
                }
            }
            m33296();
        }
        if (enumC5296Mo9558 == EnumC5296.ENUM_CONSTANT || enumC5296Mo9558 == EnumC5296.RECORD_COMPONENT) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(interfaceC12753.mo26692());
        switch (C0909.f3409[enumC5296Mo9558.ordinal()]) {
            case 2:
            case 7:
                InterfaceC12753 interfaceC12753Mo16951 = interfaceC12753.mo16951();
                if (interfaceC12753Mo16951 != null && interfaceC12753Mo16951.mo9558().m15892()) {
                    linkedHashSet.remove(EnumC24688.f79880);
                    linkedHashSet.remove(EnumC24688.f79886);
                    linkedHashSet.remove(EnumC24688.f79879);
                    linkedHashSet.remove(EnumC24688.f79873);
                }
                break;
            case 3:
            case 4:
                linkedHashSet.remove(EnumC24688.f79886);
                break;
            case 5:
                linkedHashSet.remove(EnumC24688.f79873);
                linkedHashSet.remove(EnumC24688.f79886);
                linkedHashSet.remove(EnumC24688.f79875);
                break;
            case 6:
                linkedHashSet.remove(EnumC24688.f79873);
                break;
        }
        if (linkedHashSet.isEmpty()) {
            return;
        }
        printWriter.print((String) C1170.stream(linkedHashSet).map(new C10346(7)).collect(C2025.joining(" ", "", " ")));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33298(InterfaceC12007 interfaceC12007, boolean z) {
        C14769 c14769Mo5575 = interfaceC12007.mo5575();
        if (c14769Mo5575.isEmpty()) {
            return;
        }
        String str = (String) C1170.stream(c14769Mo5575).map(new C19297(this)).collect(C2025.joining(", ", "<", ">"));
        PrintWriter printWriter = this.f43155;
        printWriter.print(str);
        if (z) {
            printWriter.print(" ");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m33294(InterfaceC14244 interfaceC14244) {
        return m33293((InterfaceC12753) interfaceC14244) + interfaceC14244.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m33293(InterfaceC12753 interfaceC12753) {
        C14769 c14769Mo16957 = interfaceC12753.mo16957();
        return c14769Mo16957.isEmpty() ? "" : (String) C1170.stream(c14769Mo16957).map(new C6376(7)).collect(C2025.joining(" ", "", " "));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33297(InterfaceC1567 interfaceC1567) {
        C14769<InterfaceC17974> parameters = interfaceC1567.getParameters();
        int iM35551 = parameters.m35551();
        if (iM35551 != 0) {
            PrintWriter printWriter = this.f43155;
            if (iM35551 == 1) {
                for (InterfaceC17974 interfaceC17974 : parameters) {
                    m33300(interfaceC17974);
                    if (interfaceC1567.mo5574()) {
                        AbstractC22664 abstractC22664Mo16952 = interfaceC17974.mo16952();
                        if (abstractC22664Mo16952.mo5501() != EnumC18720.ARRAY) {
                            throw new AssertionError("Var-args parameter is not an array type: " + abstractC22664Mo16952);
                        }
                        printWriter.print(((InterfaceC0075) InterfaceC0075.class.cast(abstractC22664Mo16952)).mo1131());
                        printWriter.print("...");
                    } else {
                        printWriter.print(interfaceC17974.mo16952());
                    }
                    printWriter.print(" " + ((Object) interfaceC17974.mo9563()));
                }
                return;
            }
            int i = 1;
            for (InterfaceC17974 interfaceC17975 : parameters) {
                if (i == 2) {
                    this.f43156++;
                }
                if (i > 1) {
                    m33296();
                }
                m33300(interfaceC17975);
                if (i == iM35551 && interfaceC1567.mo5574()) {
                    AbstractC22664 abstractC22664Mo16953 = interfaceC17975.mo16952();
                    if (abstractC22664Mo16953.mo5501() != EnumC18720.ARRAY) {
                        throw new AssertionError("Var-args parameter is not an array type: " + abstractC22664Mo16953);
                    }
                    printWriter.print(((InterfaceC0075) InterfaceC0075.class.cast(abstractC22664Mo16953)).mo1131());
                    printWriter.print("...");
                } else {
                    printWriter.print(interfaceC17975.mo16952());
                }
                printWriter.print(" " + ((Object) interfaceC17975.mo9563()));
                if (i < iM35551) {
                    printWriter.println(",");
                }
                i++;
            }
            if (parameters.m35551() >= 2) {
                this.f43156--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m33296() {
        int i = this.f43156;
        if (i < 0) {
            return;
        }
        while (true) {
            String[] strArr = f43153;
            PrintWriter printWriter = this.f43155;
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
