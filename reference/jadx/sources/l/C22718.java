package l;

import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸ۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04UF */
/* JADX INFO: loaded from: classes.dex */
public final class C22718 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23790 f73732;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f73733;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C5564 f73734;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f73735;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15258 f73736;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC1928 f73737;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7140 f73738;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8631 f73739;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12447 f73740;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10783 f73741;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C23790 f73742;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C20354 f73731 = new C20354(0);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C20354 f73730 = new C20354(0);

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final C20528 f73729 = new C20528();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m51250() {
        C23790 c23790 = this.f73732;
        C20528 c20528 = f73729;
        c20528.m47060(c23790);
        c20528.m47060(this.f73742);
        ArrayList<InterfaceC23331> arrayList = this.f73735;
        for (InterfaceC23331 interfaceC23331 : arrayList) {
            if (interfaceC23331 instanceof C12557) {
                C12557 c12557 = (C12557) interfaceC23331;
                c12557.f62313.m55790(c12557);
            } else if (interfaceC23331 instanceof C13303) {
                C13303 c13303 = (C13303) interfaceC23331;
                c13303.f62313.m55791(c13303);
            } else if (interfaceC23331 instanceof C9661) {
                C9661 c9661 = (C9661) interfaceC23331;
                c9661.f62313.m55789(c9661);
            }
        }
        ArrayList arrayList2 = this.f73733;
        C20354 c20354 = f73730;
        c20354.m46771(arrayList2);
        c20354.m46771(arrayList);
    }

    public C22718(C5564 c5564, InterfaceC8631 interfaceC8631, InterfaceC7140 interfaceC7140) {
        boolean z;
        int iMo3033;
        boolean z2;
        C10783 c10783 = new C10783();
        c10783.f34221 = new HashMap();
        this.f73741 = c10783;
        this.f73734 = c5564;
        this.f73739 = interfaceC8631;
        this.f73738 = interfaceC7140;
        try {
            C20354 c20354 = f73730;
            ArrayList arrayListM46770 = c20354.m46770();
            ArrayList arrayListM46771 = c20354.m46770();
            for (InterfaceC23331 interfaceC23331 : interfaceC7140.mo2840()) {
                arrayListM46770.add(interfaceC23331);
                arrayListM46771.add(interfaceC23331);
            }
            this.f73735 = arrayListM46770;
            this.f73733 = arrayListM46771;
            this.f73737 = AbstractC1928.copyOf((Collection) interfaceC8631.getParameters());
            C20528 c20528 = f73729;
            C23790 c23790 = (C23790) c20528.m47061();
            if (c23790 == null) {
                c23790 = new C23790();
            } else {
                c23790.m53069();
            }
            this.f73732 = c23790;
            C23790 c23791 = (C23790) c20528.m47061();
            if (c23791 == null) {
                c23791 = new C23790();
            } else {
                c23791.m53069();
            }
            this.f73742 = c23791;
            C12447 c12447 = new C12447(arrayListM46770);
            this.f73740 = c12447;
            int iM30916 = c12447.m30916(arrayListM46770.size() - 1) + ((InterfaceC23331) arrayListM46770.get(arrayListM46770.size() - 1)).mo3033();
            for (int i = 0; i < arrayListM46770.size(); i++) {
                InterfaceC23331 interfaceC23332 = (InterfaceC23331) arrayListM46770.get(i);
                EnumC22631 enumC22631Mo30864 = interfaceC23332.mo30864();
                if (enumC22631Mo30864 == EnumC22631.f73464) {
                    int iM30917 = this.f73740.m30916(i);
                    int iMo11703 = ((InterfaceC20347) interfaceC23332).mo11703() + iM30917;
                    try {
                        iMo11703 = m51245(iMo11703, EnumC22631.f73432);
                        z2 = true;
                    } catch (C21972 unused) {
                        z2 = false;
                    }
                    if (z2) {
                        if (this.f73732.m53068(iMo11703) != -1) {
                            InterfaceC23331 interfaceC23331M51249 = m51249(iMo11703, EnumC22631.f73432);
                            arrayListM46771.set(i, new C23154(enumC22631Mo30864, ((InterfaceC20237) interfaceC23332).mo1542(), iM30916 - iM30917));
                            arrayListM46771.add(interfaceC23331M51249);
                            iMo3033 = interfaceC23331M51249.mo3033() + iM30916;
                        } else {
                            iMo3033 = iM30916;
                            iM30916 = iMo11703;
                        }
                        this.f73732.m53070(iM30916, iM30917);
                        iM30916 = iMo3033;
                    }
                } else if (enumC22631Mo30864 == EnumC22631.f73309) {
                    int iM30918 = this.f73740.m30916(i);
                    int iMo11704 = ((InterfaceC20347) interfaceC23332).mo11703() + iM30918;
                    try {
                        iMo11704 = m51245(iMo11704, EnumC22631.f73383);
                        z = true;
                    } catch (C21972 unused2) {
                        z = false;
                    }
                    if (z) {
                        if (this.f73742.m53068(iMo11704) != -1) {
                            InterfaceC23331 interfaceC23331M512410 = m51249(iMo11704, EnumC22631.f73383);
                            arrayListM46771.set(i, new C23154(enumC22631Mo30864, ((InterfaceC20237) interfaceC23332).mo1542(), iM30916 - iM30918));
                            arrayListM46771.add(interfaceC23331M512410);
                            iMo3033 = interfaceC23331M512410.mo3033() + iM30916;
                        } else {
                            iMo3033 = iM30916;
                            iM30916 = iMo11704;
                        }
                        this.f73742.m53070(iM30916, iM30918);
                        iM30916 = iMo3033;
                    }
                }
            }
        } catch (Exception e) {
            try {
                throw C23044.m51951(e, "Error while processing method %s", C14684.m35306((InterfaceC4859) interfaceC8631, false));
            } catch (Exception unused3) {
                throw C23044.m51951(e, "Error while processing method", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51243(C2161 c2161, InterfaceC8631 interfaceC8631, C5564 c5564) throws IOException {
        c2161.getClass();
        c2161.write(".method ", 0, 8);
        m51241(c2161, interfaceC8631.mo13184(), interfaceC8631.mo13176());
        c2161.write(interfaceC8631.getName());
        c2161.write(MotionUtils.EASING_TYPE_FORMAT_START, 0, 1);
        AbstractC1928 abstractC1928CopyOf = AbstractC1928.copyOf((Collection) interfaceC8631.getParameters());
        AbstractC14956 abstractC14956ListIterator = abstractC1928CopyOf.listIterator(0);
        while (abstractC14956ListIterator.hasNext()) {
            c2161.write(((InterfaceC13851) abstractC14956ListIterator.next()).getType());
        }
        c2161.write(MotionUtils.EASING_TYPE_FORMAT_END, 0, 1);
        c2161.write(interfaceC8631.mo6802());
        c2161.write(10);
        c2161.m7439();
        m51242(c2161, interfaceC8631, abstractC1928CopyOf, c5564);
        c5564.getClass();
        C13701.m33494(c2161, interfaceC8631.getAnnotations());
        c2161.m7435();
        c2161.write(".end method\n", 0, 12);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51241(C2161 c2161, int i, Set set) throws IOException {
        for (EnumC2536 enumC2536 : EnumC2536.m8452(i)) {
            c2161.write(enumC2536.toString());
            c2161.write(32);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c2161.write(((EnumC13722) it.next()).toString());
            c2161.write(32);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51242(C2161 c2161, InterfaceC8631 interfaceC8631, List list, C5564 c5564) throws IOException {
        int i = !EnumC2536.STATIC.m8459(interfaceC8631.mo13184()) ? 1 : 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC13851 interfaceC13851 = (InterfaceC13851) it.next();
            String type = interfaceC13851.getType();
            String name = interfaceC13851.getName();
            Set annotations = interfaceC13851.getAnnotations();
            if ((c5564.f19338 && name != null) || annotations.size() != 0) {
                c2161.getClass();
                c2161.write(".param p", 0, 8);
                c2161.m7440(i);
                if (name != null && c5564.f19338) {
                    c2161.write(", ", 0, 2);
                    c2161.write(34);
                    C3652.m11836(c2161, name);
                    c2161.write(34);
                }
                c2161.write("  # ", 0, 4);
                c2161.write(type);
                c2161.write("\n", 0, 1);
                if (annotations.size() > 0) {
                    c2161.m7439();
                    C13701.m33494(c2161, annotations);
                    c2161.m7435();
                    c2161.write(".end param\n", 0, 11);
                }
            }
            i = C23800.m53096(type) ? i + 2 : i + 1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51247(C2161 c2161) {
        int iMo3033;
        EnumC2536 enumC2536 = EnumC2536.STATIC;
        InterfaceC8631 interfaceC8631 = this.f73739;
        int i = 1;
        int i2 = !enumC2536.m8459(interfaceC8631.mo13184()) ? 1 : 0;
        c2161.getClass();
        boolean z = false;
        c2161.write(".method ", 0, 8);
        m51241(c2161, interfaceC8631.mo13184(), interfaceC8631.mo13176());
        C14684.m35309((Writer) c2161, (InterfaceC4859) interfaceC8631, true);
        AbstractC1928 abstractC1928 = this.f73737;
        AbstractC14956 abstractC14956ListIterator = abstractC1928.listIterator(0);
        while (abstractC14956ListIterator.hasNext()) {
            i2 = C23800.m53096(((InterfaceC13851) abstractC14956ListIterator.next()).getType()) ? i2 + 2 : i2 + 1;
        }
        c2161.write(10);
        c2161.m7439();
        C5564 c5564 = this.f73734;
        c5564.getClass();
        boolean z2 = c5564.f19339;
        InterfaceC7140 interfaceC7140 = this.f73738;
        if (!z2) {
            c2161.write(".registers ", 0, 11);
            c2161.m7440(interfaceC7140.mo2841());
        }
        c2161.write(10);
        m51242(c2161, interfaceC8631, abstractC1928, c5564);
        if (this.f73736 == null) {
            this.f73736 = new C15258(c5564, interfaceC7140.mo2841(), i2);
        }
        C13701.m33494(c2161, interfaceC8631.getAnnotations());
        c2161.write(10);
        C20354 c20354 = f73731;
        ArrayList<AbstractC19734> arrayListM46770 = c20354.m46770();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f73733;
            if (i3 >= arrayList.size()) {
                break;
            }
            InterfaceC23331 interfaceC23331 = (InterfaceC23331) arrayList.get(i3);
            if (c5564.f19340 && interfaceC23331.mo30864() == EnumC22631.f73424) {
                iMo3033 = interfaceC23331.mo3033();
            } else {
                arrayListM46770.add(C21489.m48893(this, i4, interfaceC23331));
                if (!c5564.f19334 && i3 != arrayList.size() - 1) {
                    arrayListM46770.add(C5081.m15361(i4));
                }
                iMo3033 = interfaceC23331.mo3033();
            }
            i4 += iMo3033;
            i3++;
        }
        List<InterfaceC4685> listMo2839 = interfaceC7140.mo2839();
        if (listMo2839.size() != 0) {
            if (c5564.f19333) {
                listMo2839 = C4135.m13260(listMo2839);
            }
            ArrayList arrayList2 = this.f73735;
            int size = arrayList2.size() - 1;
            C12447 c12447 = this.f73740;
            int iMo3034 = ((InterfaceC23331) j$$ExternalSyntheticOutline0.m(arrayList2, 1)).mo3033() + c12447.m30916(size);
            for (InterfaceC4685 interfaceC4685 : listMo2839) {
                int iMo4114 = interfaceC4685.mo4114();
                int iMo4115 = interfaceC4685.mo4115() + iMo4114;
                if (iMo4114 >= iMo3034) {
                    Object[] objArr = new Object[i];
                    objArr[0] = Integer.valueOf(iMo4114);
                    throw new RuntimeException(String.format("Try start offset %d is past the end of the code block.", objArr));
                }
                if (iMo4115 > iMo3034) {
                    Object[] objArr2 = new Object[i];
                    objArr2[0] = Integer.valueOf(iMo4115);
                    throw new RuntimeException(String.format("Try end offset %d is past the end of the code block.", objArr2));
                }
                int iM30916 = c12447.m30916(c12447.m30917(iMo4115 - 1, z));
                for (InterfaceC9376 interfaceC9376 : interfaceC4685.mo4116()) {
                    int iMo11197 = interfaceC9376.mo11197();
                    if (iMo11197 >= iMo3034) {
                        throw new C23044(null, "Exception handler offset %d is past the end of the code block.", Integer.valueOf(iMo11197));
                    }
                    C10783 c10783 = this.f73741;
                    String strMo11196 = interfaceC9376.mo11196();
                    int i5 = iMo4115;
                    int i6 = iMo4114;
                    arrayListM46770.add(new C22235(this.f73734, c10783, iM30916, strMo11196, i6, i5, iMo11197));
                    iMo4114 = i6;
                    iMo4115 = i5;
                    i = 1;
                    z = false;
                }
            }
        }
        if (c5564.f19338) {
            for (InterfaceC10650 interfaceC10650 : interfaceC7140.mo2842()) {
                if (c5564.f19337 || interfaceC10650.mo4171() != 10) {
                    arrayListM46770.add(AbstractC13284.m32826(this.f73736, interfaceC10650));
                }
            }
        }
        boolean z3 = c5564.f19335;
        C10783 c10784 = this.f73741;
        if (z3) {
            HashMap map = new HashMap();
            ArrayList<C4818> arrayList3 = new ArrayList(c10784.f34221.values());
            Collections.sort(arrayList3);
            for (C4818 c4818 : arrayList3) {
                Integer num = (Integer) map.get(c4818.m14845());
                if (num == null) {
                    num = 0;
                }
                c4818.m14843(num.intValue());
                map.put(c4818.m14845(), Integer.valueOf(num.intValue() + 1));
            }
        }
        Collection collectionValues = c10784.f34221.values();
        arrayListM46770.ensureCapacity(collectionValues.size() + arrayListM46770.size());
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayListM46770.add((C4818) it.next());
        }
        Collections.sort(arrayListM46770);
        for (AbstractC19734 abstractC19734 : arrayListM46770) {
            if (abstractC19734.mo4982(c2161)) {
                c2161.write(10);
            }
            abstractC19734.mo2720();
        }
        c20354.m46771(arrayListM46770);
        c2161.m7435();
        c2161.write(".end method\n", 0, 12);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC23331 m51249(int i, EnumC22631 enumC22631) {
        int i2;
        try {
            int iM30917 = this.f73740.m30917(i, true);
            ArrayList arrayList = this.f73735;
            InterfaceC23331 interfaceC23331 = (InterfaceC23331) arrayList.get(iM30917);
            if (interfaceC23331.mo30864() == enumC22631) {
                return interfaceC23331;
            }
            if (interfaceC23331.mo30864() == EnumC22631.f73424 && (i2 = iM30917 + 1) < arrayList.size()) {
                InterfaceC23331 interfaceC23332 = (InterfaceC23331) arrayList.get(i2);
                if (interfaceC23332.mo30864() == enumC22631) {
                    return interfaceC23332;
                }
            }
            throw new C21972(i);
        } catch (C20652 unused) {
            throw new C21972(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m51245(int i, EnumC22631 enumC22631) {
        int i2;
        C12447 c12447 = this.f73740;
        try {
            int iM30917 = c12447.m30917(i, true);
            ArrayList arrayList = this.f73735;
            InterfaceC23331 interfaceC23331 = (InterfaceC23331) arrayList.get(iM30917);
            if (interfaceC23331.mo30864() == enumC22631) {
                return i;
            }
            if (interfaceC23331.mo30864() == EnumC22631.f73424 && (i2 = iM30917 + 1) < arrayList.size() && ((InterfaceC23331) arrayList.get(i2)).mo30864() == enumC22631) {
                return c12447.m30916(i2);
            }
            throw new C21972(i);
        } catch (C20652 unused) {
            throw new C21972(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10783 m51246() {
        return this.f73741;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m51244(int i) {
        return this.f73732.m53068(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m51248(int i) {
        return this.f73742.m53068(i);
    }
}
