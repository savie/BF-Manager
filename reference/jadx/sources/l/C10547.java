package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۤ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 04UF */
/* JADX INFO: loaded from: classes3.dex */
public final class C10547 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f36103;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C9136 f36104;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C1698 f36105;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f36106;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18528 f36107;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C21129 f36108;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f36109;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C20424 f36110;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13838 f36111;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC7945 f36112;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C1698 f36113;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C10114 f36102 = new C10114();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final C10114 f36100 = new C10114();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C19805 f36101 = new C19805();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m26687() {
        C1698 c1698 = this.f36105;
        C19805 c19805 = f36101;
        c19805.m45011(c1698);
        c19805.m45011(this.f36113);
        ArrayList<InterfaceC1594> arrayList = this.f36109;
        for (InterfaceC1594 interfaceC1594 : arrayList) {
            if (interfaceC1594 instanceof C4569) {
                C4569 c4569 = (C4569) interfaceC1594;
                c4569.f22552.m41175(c4569);
            } else if (interfaceC1594 instanceof C0108) {
                C0108 c0108 = (C0108) interfaceC1594;
                c0108.f22552.m41174(c0108);
            } else if (interfaceC1594 instanceof C21275) {
                C21275 c21275 = (C21275) interfaceC1594;
                c21275.f22552.m41176(c21275);
            }
        }
        ArrayList arrayList2 = this.f36106;
        C10114 c10114 = f36100;
        c10114.m25741(arrayList2);
        c10114.m25741(arrayList);
    }

    public C10547(C20424 c20424, InterfaceC18528 interfaceC18528, InterfaceC7945 interfaceC7945) {
        boolean z;
        int iMo5436;
        boolean z2;
        C9136 c9136 = new C9136();
        c9136.f31079 = new HashMap();
        this.f36104 = c9136;
        this.f36110 = c20424;
        this.f36107 = interfaceC18528;
        this.f36112 = interfaceC7945;
        try {
            C10114 c10114 = f36100;
            ArrayList arrayListM25742 = c10114.m25742();
            ArrayList arrayListM25743 = c10114.m25742();
            for (InterfaceC1594 interfaceC1594 : interfaceC7945.mo11508()) {
                arrayListM25742.add(interfaceC1594);
                arrayListM25743.add(interfaceC1594);
            }
            this.f36109 = arrayListM25742;
            this.f36106 = arrayListM25743;
            this.f36103 = AbstractC22433.copyOf((Collection) interfaceC18528.getParameters());
            C19805 c19805 = f36101;
            C1698 c1698 = (C1698) c19805.m45009();
            if (c1698 == null) {
                c1698 = new C1698();
            } else {
                c1698.m5641();
            }
            this.f36105 = c1698;
            C1698 c1699 = (C1698) c19805.m45009();
            if (c1699 == null) {
                c1699 = new C1698();
            } else {
                c1699.m5641();
            }
            this.f36113 = c1699;
            C13838 c13838 = new C13838(arrayListM25742);
            this.f36111 = c13838;
            int iM33658 = c13838.m33658(arrayListM25742.size() - 1) + ((InterfaceC1594) arrayListM25742.get(arrayListM25742.size() - 1)).mo5436();
            for (int i = 0; i < arrayListM25742.size(); i++) {
                InterfaceC1594 interfaceC1595 = (InterfaceC1594) arrayListM25742.get(i);
                EnumC10297 enumC10297Mo5435 = interfaceC1595.mo5435();
                if (enumC10297Mo5435 == EnumC10297.f35282) {
                    int iM33659 = this.f36111.m33658(i);
                    int iMo8965 = ((InterfaceC3005) interfaceC1595).mo8965() + iM33659;
                    try {
                        iMo8965 = m26682(iMo8965, EnumC10297.f35054);
                        z2 = true;
                    } catch (C19719 unused) {
                        z2 = false;
                    }
                    if (z2) {
                        if (this.f36105.m5640(iMo8965) != -1) {
                            InterfaceC1594 interfaceC1594M26686 = m26686(iMo8965, EnumC10297.f35054);
                            arrayListM25743.set(i, new C20583(enumC10297Mo5435, ((InterfaceC3274) interfaceC1595).mo1140(), iM33658 - iM33659));
                            arrayListM25743.add(interfaceC1594M26686);
                            iMo5436 = interfaceC1594M26686.mo5436() + iM33658;
                        } else {
                            iMo5436 = iM33658;
                            iM33658 = iMo8965;
                        }
                        this.f36105.m5642(iM33658, iM33659);
                        iM33658 = iMo5436;
                    }
                } else if (enumC10297Mo5435 == EnumC10297.f35153) {
                    int iM336510 = this.f36111.m33658(i);
                    int iMo8966 = ((InterfaceC3005) interfaceC1595).mo8965() + iM336510;
                    try {
                        iMo8966 = m26682(iMo8966, EnumC10297.f35081);
                        z = true;
                    } catch (C19719 unused2) {
                        z = false;
                    }
                    if (z) {
                        if (this.f36113.m5640(iMo8966) != -1) {
                            InterfaceC1594 interfaceC1594M26687 = m26686(iMo8966, EnumC10297.f35081);
                            arrayListM25743.set(i, new C20583(enumC10297Mo5435, ((InterfaceC3274) interfaceC1595).mo1140(), iM33658 - iM336510));
                            arrayListM25743.add(interfaceC1594M26687);
                            iMo5436 = interfaceC1594M26687.mo5436() + iM33658;
                        } else {
                            iMo5436 = iM33658;
                            iM33658 = iMo8966;
                        }
                        this.f36113.m5642(iM33658, iM336510);
                        iM33658 = iMo5436;
                    }
                }
            }
        } catch (Exception e) {
            try {
                throw C20749.m46751(e, "Error while processing method %s", C22304.m49465((InterfaceC8858) interfaceC18528, false));
            } catch (Exception unused3) {
                throw C20749.m46751(e, "Error while processing method", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26680(C12283 c12283, InterfaceC18528 interfaceC18528, C20424 c20424) throws IOException {
        c12283.getClass();
        c12283.write(".method ", 0, 8);
        m26678(c12283, interfaceC18528.mo25750(), interfaceC18528.mo25749());
        c12283.write(interfaceC18528.getName());
        c12283.write(MotionUtils.EASING_TYPE_FORMAT_START, 0, 1);
        AbstractC22433 abstractC22433CopyOf = AbstractC22433.copyOf((Collection) interfaceC18528.getParameters());
        AbstractC16706 abstractC16706ListIterator = abstractC22433CopyOf.listIterator(0);
        while (abstractC16706ListIterator.hasNext()) {
            c12283.write(((InterfaceC19234) abstractC16706ListIterator.next()).getType());
        }
        c12283.write(MotionUtils.EASING_TYPE_FORMAT_END, 0, 1);
        c12283.write(interfaceC18528.mo9698());
        c12283.write(10);
        c12283.m30527();
        m26679(c12283, interfaceC18528, abstractC22433CopyOf, c20424);
        c20424.getClass();
        C18619.m43060(c12283, interfaceC18528.getAnnotations());
        c12283.m30526();
        c12283.write(".end method\n", 0, 12);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26678(C12283 c12283, int i, Set set) throws IOException {
        for (EnumC15236 enumC15236 : EnumC15236.m36496(i)) {
            c12283.write(enumC15236.toString());
            c12283.write(32);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c12283.write(((EnumC18763) it.next()).toString());
            c12283.write(32);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26679(C12283 c12283, InterfaceC18528 interfaceC18528, List list, C20424 c20424) throws IOException {
        int i = !EnumC15236.STATIC.m36501(interfaceC18528.mo25750()) ? 1 : 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC19234 interfaceC19234 = (InterfaceC19234) it.next();
            String type = interfaceC19234.getType();
            String name = interfaceC19234.getName();
            Set annotations = interfaceC19234.getAnnotations();
            if ((c20424.f66199 && name != null) || annotations.size() != 0) {
                c12283.getClass();
                c12283.write(".param p", 0, 8);
                c12283.m30529(i);
                if (name != null && c20424.f66199) {
                    c12283.write(", ", 0, 2);
                    c12283.write(34);
                    C9461.m24219(c12283, name);
                    c12283.write(34);
                }
                c12283.write("  # ", 0, 4);
                c12283.write(type);
                c12283.write("\n", 0, 1);
                if (annotations.size() > 0) {
                    c12283.m30527();
                    C18619.m43060(c12283, annotations);
                    c12283.m30526();
                    c12283.write(".end param\n", 0, 11);
                }
            }
            i = C13571.m33174(type) ? i + 2 : i + 1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26684(C12283 c12283) {
        int iMo5436;
        EnumC15236 enumC15236 = EnumC15236.STATIC;
        InterfaceC18528 interfaceC18528 = this.f36107;
        int i = 1;
        int i2 = !enumC15236.m36501(interfaceC18528.mo25750()) ? 1 : 0;
        c12283.getClass();
        boolean z = false;
        c12283.write(".method ", 0, 8);
        m26678(c12283, interfaceC18528.mo25750(), interfaceC18528.mo25749());
        C22304.m49469((Writer) c12283, (InterfaceC8858) interfaceC18528, true);
        AbstractC22433 abstractC22433 = this.f36103;
        AbstractC16706 abstractC16706ListIterator = abstractC22433.listIterator(0);
        while (abstractC16706ListIterator.hasNext()) {
            i2 = C13571.m33174(((InterfaceC19234) abstractC16706ListIterator.next()).getType()) ? i2 + 2 : i2 + 1;
        }
        c12283.write(10);
        c12283.m30527();
        C20424 c20424 = this.f36110;
        c20424.getClass();
        boolean z2 = c20424.f66202;
        InterfaceC7945 interfaceC7945 = this.f36112;
        if (!z2) {
            c12283.write(".registers ", 0, 11);
            c12283.m30529(interfaceC7945.mo11507());
        }
        c12283.write(10);
        m26679(c12283, interfaceC18528, abstractC22433, c20424);
        if (this.f36108 == null) {
            this.f36108 = new C21129(c20424, interfaceC7945.mo11507(), i2);
        }
        C18619.m43060(c12283, interfaceC18528.getAnnotations());
        c12283.write(10);
        C10114 c10114 = f36102;
        ArrayList<AbstractC7724> arrayListM25742 = c10114.m25742();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f36106;
            if (i3 >= arrayList.size()) {
                break;
            }
            InterfaceC1594 interfaceC1594 = (InterfaceC1594) arrayList.get(i3);
            if (c20424.f66196 && interfaceC1594.mo5435() == EnumC10297.f35298) {
                iMo5436 = interfaceC1594.mo5436();
            } else {
                arrayListM25742.add(C2784.m8456(this, i4, interfaceC1594));
                if (!c20424.f66200 && i3 != arrayList.size() - 1) {
                    arrayListM25742.add(C8036.m21144(i4));
                }
                iMo5436 = interfaceC1594.mo5436();
            }
            i4 += iMo5436;
            i3++;
        }
        List<InterfaceC8651> listMo11511 = interfaceC7945.mo11511();
        if (listMo11511.size() != 0) {
            if (c20424.f66195) {
                listMo11511 = C2609.m8081(listMo11511);
            }
            ArrayList arrayList2 = this.f36109;
            int size = arrayList2.size() - 1;
            C13838 c13838 = this.f36111;
            int iMo5437 = ((InterfaceC1594) C19084.m43861(arrayList2, 1)).mo5436() + c13838.m33658(size);
            for (InterfaceC8651 interfaceC8651 : listMo11511) {
                int iMo18941 = interfaceC8651.mo18941();
                int iMo18942 = interfaceC8651.mo18942() + iMo18941;
                if (iMo18941 >= iMo5437) {
                    Object[] objArr = new Object[i];
                    objArr[0] = Integer.valueOf(iMo18941);
                    throw new RuntimeException(String.format("Try start offset %d is past the end of the code block.", objArr));
                }
                if (iMo18942 > iMo5437) {
                    Object[] objArr2 = new Object[i];
                    objArr2[0] = Integer.valueOf(iMo18942);
                    throw new RuntimeException(String.format("Try end offset %d is past the end of the code block.", objArr2));
                }
                int iM33658 = c13838.m33658(c13838.m33659(iMo18942 - 1, z));
                for (InterfaceC21350 interfaceC21350 : interfaceC8651.mo18943()) {
                    int iMo6346 = interfaceC21350.mo6346();
                    if (iMo6346 >= iMo5437) {
                        throw new C20749(null, "Exception handler offset %d is past the end of the code block.", Integer.valueOf(iMo6346));
                    }
                    C9136 c9136 = this.f36104;
                    String strMo6347 = interfaceC21350.mo6347();
                    int i5 = iMo18942;
                    int i6 = iMo18941;
                    arrayListM25742.add(new C19325(this.f36110, c9136, iM33658, strMo6347, i6, i5, iMo6346));
                    iMo18941 = i6;
                    iMo18942 = i5;
                    i = 1;
                    z = false;
                }
            }
        }
        if (c20424.f66199) {
            Iterator it = interfaceC7945.mo11510().iterator();
            while (it.hasNext()) {
                arrayListM25742.add(AbstractC15798.m37571(this.f36108, (InterfaceC7239) it.next()));
            }
        }
        boolean z3 = c20424.f66197;
        C9136 c9137 = this.f36104;
        if (z3) {
            HashMap map = new HashMap();
            ArrayList<C8430> arrayList3 = new ArrayList(c9137.f31079.values());
            Collections.sort(arrayList3);
            for (C8430 c8430 : arrayList3) {
                Integer num = (Integer) map.get(c8430.m22079());
                if (num == null) {
                    num = 0;
                }
                c8430.m22077(num.intValue());
                map.put(c8430.m22079(), Integer.valueOf(num.intValue() + 1));
            }
        }
        Collection collectionValues = c9137.f31079.values();
        arrayListM25742.ensureCapacity(collectionValues.size() + arrayListM25742.size());
        Iterator it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            arrayListM25742.add((C8430) it2.next());
        }
        Collections.sort(arrayListM25742);
        for (AbstractC7724 abstractC7724 : arrayListM25742) {
            if (abstractC7724.mo1773(c12283)) {
                c12283.write(10);
            }
            abstractC7724.mo9290();
        }
        c10114.m25741(arrayListM25742);
        c12283.m30526();
        c12283.write(".end method\n", 0, 12);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1594 m26686(int i, EnumC10297 enumC10297) {
        int i2;
        try {
            int iM33659 = this.f36111.m33659(i, true);
            ArrayList arrayList = this.f36109;
            InterfaceC1594 interfaceC1594 = (InterfaceC1594) arrayList.get(iM33659);
            if (interfaceC1594.mo5435() == enumC10297) {
                return interfaceC1594;
            }
            if (interfaceC1594.mo5435() == EnumC10297.f35298 && (i2 = iM33659 + 1) < arrayList.size()) {
                InterfaceC1594 interfaceC1595 = (InterfaceC1594) arrayList.get(i2);
                if (interfaceC1595.mo5435() == enumC10297) {
                    return interfaceC1595;
                }
            }
            throw new C19719(i);
        } catch (C4664 unused) {
            throw new C19719(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m26682(int i, EnumC10297 enumC10297) {
        int i2;
        C13838 c13838 = this.f36111;
        try {
            int iM33659 = c13838.m33659(i, true);
            ArrayList arrayList = this.f36109;
            InterfaceC1594 interfaceC1594 = (InterfaceC1594) arrayList.get(iM33659);
            if (interfaceC1594.mo5435() == enumC10297) {
                return i;
            }
            if (interfaceC1594.mo5435() == EnumC10297.f35298 && (i2 = iM33659 + 1) < arrayList.size() && ((InterfaceC1594) arrayList.get(i2)).mo5435() == enumC10297) {
                return c13838.m33658(i2);
            }
            throw new C19719(i);
        } catch (C4664 unused) {
            throw new C19719(i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9136 m26683() {
        return this.f36104;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m26681(int i) {
        return this.f36105.m5640(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m26685(int i) {
        return this.f36113.m5640(i);
    }
}
