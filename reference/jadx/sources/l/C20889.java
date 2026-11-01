package l;

import android.graphics.Point;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.᩷۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4TV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20889 extends AbstractC6839 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C12812 f67846 = new C12812();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList f67847;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f67848;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C16387 f67849;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC5366 f67850;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C15682 f67851;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final ArrayList f67852;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Callable f67853;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Set f67854;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList f67855;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final List f67856;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C3249 f67857;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f67858;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f67859;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f67860;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f67861;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC13128 f67862;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Map f67863;

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final C20889 mo18442() {
        return this;
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18446(C11018 c11018) {
        String str;
        c11018.mo24508(20224);
        c11018.m27799();
        c11018.m27786(this.f67860);
        Set set = this.f67854;
        c11018.mo24508(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c11018.m27786((String) it.next());
        }
        c11018.m27784(this.f67859);
        ArrayList<InterfaceC8334> arrayList = this.f67847;
        c11018.mo24508(arrayList.size());
        for (InterfaceC8334 interfaceC8334 : arrayList) {
            if (interfaceC8334 instanceof C19623) {
                C19623 c19623 = (C19623) interfaceC8334;
                c11018.writeByte(0);
                c11018.m27786(c19623.f62985);
                c11018.m27784(c19623.f62984);
                c11018.m27784(c19623.f62986);
            } else if (interfaceC8334 instanceof C9040) {
                C9040 c9040 = (C9040) interfaceC8334;
                c11018.writeByte(1);
                c11018.m27786(c9040.f30851);
                c11018.m27786(c9040.f30849);
                c11018.m27784(c9040.f30850);
                c11018.m27784(c9040.f30848);
            } else {
                throw new RuntimeException();
            }
        }
        int i = C12859.f42771;
        InterfaceC5366 interfaceC5366 = InterfaceC5366.f18534;
        String str2 = null;
        InterfaceC5366 interfaceC5367 = this.f67850;
        if (interfaceC5367 == interfaceC5366) {
            str = "#BUILT_IN_LUA_FORMATTER#";
        } else if (interfaceC5367 == InterfaceC5366.f18532) {
            str = "#BUILT_IN_PYTHON_FORMATTER#";
        } else if (interfaceC5367 == null) {
            str = null;
        } else if (interfaceC5367 == InterfaceC5366.f18525) {
            str = "#BUILT_IN_MTSX_FORMATTER#";
        } else if (interfaceC5367 == InterfaceC5366.f18528) {
            str = "#BUILT_IN_CSS_FORMATTER#";
        } else if (interfaceC5367 == InterfaceC5366.f18533) {
            str = "#BUILT_IN_HTML_FORMATTER#";
        } else if (interfaceC5367 == InterfaceC5366.f18526) {
            str = "#BUILT_IN_JS_FORMATTER#";
        } else if (interfaceC5367 == InterfaceC5366.f18530) {
            str = "#BUILT_IN_TS_FORMATTER#";
        } else if (interfaceC5367 == InterfaceC5366.f18529) {
            str = "#BUILT_IN_JSON_FORMATTER#";
        } else if (interfaceC5367 == InterfaceC5366.f18535) {
            str = "#BUILT_IN_XML_FORMATTER#";
        } else if (interfaceC5367 == InterfaceC5366.f18527) {
            str = "#BUILT_IN_SMALI_FORMATTER#";
        } else {
            if (interfaceC5367 != InterfaceC5366.f18531) {
                throw new RuntimeException(interfaceC5367.toString());
            }
            str = "#BUILT_IN_JAVA_FORMATTER#";
        }
        c11018.m27783(str);
        InterfaceC13128 interfaceC13128 = this.f67862;
        if (interfaceC13128 != null) {
            if (interfaceC13128 == InterfaceC13128.f43717) {
                str2 = "#BUILT_IN_CSS_SHRINKER#";
            } else if (interfaceC13128 == InterfaceC13128.f43719) {
                str2 = "#BUILT_IN_HTML_SHRINKER#";
            } else if (interfaceC13128 == InterfaceC13128.f43718) {
                str2 = "#BUILT_IN_JS_SHRINKER#";
            } else {
                if (interfaceC13128 != InterfaceC13128.f43716) {
                    throw new RuntimeException(interfaceC13128.toString());
                }
                str2 = "#BUILT_IN_JSON_SHRINKER#";
            }
        }
        c11018.m27783(str2);
        C16387 c16387 = this.f67849;
        c11018.mo24508(c16387.m38588());
        InterfaceC6269 it2 = c16387.m38589().iterator();
        while (it2.hasNext()) {
            InterfaceC14551 interfaceC14551 = (InterfaceC14551) it2.next();
            c11018.m27786(C16387.m38584(interfaceC14551.mo17726()));
            ((C15682) interfaceC14551.getValue()).m37373(c11018);
        }
        ArrayList<C7483> arrayList2 = this.f67852;
        c11018.mo24508(arrayList2.size());
        for (C7483 c7483 : arrayList2) {
            c11018.m27786(c7483.f24929.pattern());
            c11018.mo24508(c7483.f24929.flags());
            c7483.f24928.m37373(c11018);
        }
        List list = this.f67856;
        c11018.mo24508(list.size());
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ((AbstractC6839) it3.next()).mo18446(c11018);
        }
        Map map = this.f67863;
        c11018.mo24508(map.size());
        for (Map.Entry entry : map.entrySet()) {
            c11018.m27786((String) entry.getKey());
            Object value = entry.getValue();
            if (value instanceof AbstractC6839) {
                c11018.writeByte(0);
                ((AbstractC6839) value).mo18446(c11018);
            } else if (value instanceof String) {
                c11018.writeByte(1);
                c11018.m27786((String) value);
            } else if (value instanceof C2898) {
                c11018.writeByte(2);
                ((C2898) value).m8708(c11018);
            } else {
                throw new RuntimeException();
            }
        }
        ArrayList arrayList3 = this.f67855;
        if (arrayList3 == null) {
            c11018.mo24505((short) -1);
        } else {
            c11018.mo24505((short) arrayList3.size());
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                c11018.m27786((String) it4.next());
            }
        }
        c11018.m27777();
    }

    public C20889(C17367 c17367) throws IOException {
        super(null);
        this.f67849 = new C16387();
        this.f67852 = new ArrayList();
        this.f67847 = new ArrayList();
        this.f67850 = null;
        this.f67862 = null;
        this.f67857 = C12859.m31900();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        this.f67854 = C0561.unmodifiableSet(linkedHashSet);
        this.f67856 = C0561.unmodifiableList(arrayList);
        this.f67863 = C0561.unmodifiableMap(map);
        C20190.m45650(c17367, 20224);
        c17367.readInt();
        this.f67860 = c17367.m40458();
        int iM40462 = c17367.m40462();
        for (int i = 0; i < iM40462; i++) {
            linkedHashSet.add(c17367.m40458());
        }
        this.f67859 = c17367.m40461();
        int iM40463 = c17367.m40462();
        this.f67847.ensureCapacity(iM40463);
        for (int i2 = 0; i2 < iM40463; i2++) {
            byte b = c17367.readByte();
            if (b == 0) {
                this.f67847.add(new C19623(c17367.m40458(), c17367.m40461(), c17367.m40461()));
            } else {
                if (b != 1) {
                    throw new RuntimeException("Unknown comment type");
                }
                this.f67847.add(new C9040(c17367.m40458(), c17367.m40458(), c17367.m40461(), c17367.m40461()));
            }
        }
        this.f67850 = C12859.m31901(c17367.m40448());
        this.f67862 = C12859.m31896(c17367.m40448());
        int iM40464 = c17367.m40462();
        for (int i3 = 0; i3 < iM40464; i3++) {
            this.f67849.m38587(c17367.m40458(), C15682.m37366(c17367));
        }
        int iM40465 = c17367.m40462();
        this.f67852.ensureCapacity(iM40465);
        for (int i4 = 0; i4 < iM40465; i4++) {
            this.f67852.add(new C7483(C12859.m31876(c17367.m40462(), c17367.m40458()), C15682.m37366(c17367)));
        }
        int iM40466 = c17367.m40462();
        for (int i5 = 0; i5 < iM40466; i5++) {
            arrayList.add(AbstractC6839.m18440(this, c17367));
        }
        int iM40467 = c17367.m40462();
        for (int i6 = 0; i6 < iM40467; i6++) {
            String strM40458 = c17367.m40458();
            byte b2 = c17367.readByte();
            if (b2 == 0) {
                map.put(strM40458, AbstractC6839.m18440(this, c17367));
            } else if (b2 == 1) {
                map.put(strM40458, c17367.m40458());
            } else {
                if (b2 != 2) {
                    throw new IOException(C8479.m22141(b2, "Unknown syntax definition type: "));
                }
                map.put(strM40458, C2898.m8705(c17367));
            }
        }
        short s = c17367.readShort();
        if (s < 0) {
            this.f67855 = null;
            return;
        }
        this.f67855 = new ArrayList(s);
        for (int i7 = 0; i7 < s; i7++) {
            this.f67855.add(c17367.m40458());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20889(C6115 c6115) {
        Iterator it;
        ArrayList arrayList;
        Class<C3292> cls;
        Class<C16699> cls2;
        ArrayList arrayList2;
        Class<C4559> cls3;
        Class<C16699> cls4;
        C15682 c15682M37365;
        super(null);
        ArrayList arrayList3 = null;
        this.f67849 = new C16387();
        this.f67852 = new ArrayList();
        this.f67847 = new ArrayList();
        this.f67850 = null;
        this.f67862 = null;
        this.f67857 = C12859.m31900();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList<AbstractC6839> arrayList4 = new ArrayList();
        HashMap map = new HashMap();
        this.f67854 = C0561.unmodifiableSet(linkedHashSet);
        this.f67856 = C0561.unmodifiableList(arrayList4);
        this.f67863 = C0561.unmodifiableMap(map);
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = c6115.m51372(C11055.class).iterator();
        int i = 0;
        boolean zM46950 = false;
        while (true) {
            Class<C3292> cls5 = C3292.class;
            Class<C16699> cls6 = C16699.class;
            if (!it2.hasNext()) {
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    C11055 c11055 = (C11055) it3.next();
                    C16699 c16699 = (C16699) c11055.m51374(cls6, 0);
                    if (c16699 != null) {
                        C17404 c17404 = (C17404) c16699.m51374(C17404.class, 0);
                        C12466 c12466 = (C12466) c16699.m51374(C12466.class, 0);
                        C6448 c6448 = (C6448) c16699.m51374(C6448.class, 0);
                        C1175 c1175 = (C1175) c16699.m51374(C1175.class, 0);
                        String strM46949 = m46949(c17404.m51373(46, 0));
                        String strM469410 = c12466 == null ? null : m46949(c12466.m51373(46, 0));
                        boolean z = c6448 == null || m46950(c6448.m51373(48, 0));
                        boolean z2 = c1175 == null || m46950(c1175.m51373(48, 0));
                        C10037 c10037 = new C10037(this);
                        if (strM469410 == null) {
                            this.f67847.add(new C19623(strM46949, z, zM46950));
                            if (z2) {
                                c10037.m25327(C12859.m31876(zM46950 ? 2 : 0, C15489.m37076(C17874.m41459(strM46949), ".*")));
                            }
                            it = it3;
                        } else {
                            it = it3;
                            this.f67847.add(new C9040(strM46949, strM469410, z, zM46950));
                            if (z2) {
                                c10037.m25327(C12859.m31876(zM46950 ? 2 : 0, C0242.m1617("(?s)", C17874.m41459(strM46949), ".*?(", C17874.m41459(strM469410), "|$)")));
                            }
                        }
                        if (z2) {
                            c10037.m25326(C12154.m30235(0, "comment"));
                            arrayList4.add(c10037);
                        }
                    } else {
                        it = it3;
                        C3292 c3292 = (C3292) c11055.m51374(cls5, 0);
                        Class<C4559> cls7 = C4559.class;
                        if (c3292 != null) {
                            Iterator it4 = c3292.m51372(C9644.class).iterator();
                            while (it4.hasNext()) {
                                C9644 c9644 = (C9644) it4.next();
                                String strM469411 = m46949(c9644.m51373(46, 0));
                                if (map.containsKey(strM469411)) {
                                    throw new RuntimeException(C0252.m1693("Duplicate defines: ", strM469411));
                                }
                                Iterator it5 = it4;
                                C13733 c13733 = (C13733) c9644.m51374(C13733.class, 0);
                                Class<C3292> cls8 = cls5;
                                C20932 c20932 = (C20932) c9644.m51374(C20932.class, 0);
                                List listM51372 = c9644.m51372(C19855.class);
                                if (c13733 != null) {
                                    map.put(strM469411, m46940(this, c13733.m51372(cls7)));
                                    arrayList2 = arrayList3;
                                    cls3 = cls7;
                                    cls4 = cls6;
                                } else if (c20932 != null) {
                                    List listM51373 = c20932.m51372(C7526.class);
                                    ArrayList arrayList6 = new ArrayList(listM51373.size());
                                    cls4 = cls6;
                                    ArrayList arrayList7 = new ArrayList(listM51373.size());
                                    Iterator it6 = listM51373.iterator();
                                    while (it6.hasNext()) {
                                        C7526 c7526 = (C7526) it6.next();
                                        Iterator it7 = it6;
                                        ArrayList arrayList8 = arrayList3;
                                        C15994 c15994 = (C15994) c7526.m51374(C15994.class, 0);
                                        Class<C4559> cls9 = cls7;
                                        InterfaceC17809 interfaceC17809M51373 = c15994.m51373(46, 0);
                                        if (interfaceC17809M51373 == null) {
                                            interfaceC17809M51373 = c15994.m51373(45, 0);
                                        }
                                        arrayList6.add(m46949(interfaceC17809M51373));
                                        arrayList7.add(m46949(c7526.m51373(46, 0)));
                                        it6 = it7;
                                        arrayList3 = arrayList8;
                                        cls7 = cls9;
                                    }
                                    arrayList2 = arrayList3;
                                    cls3 = cls7;
                                    try {
                                        map.put(strM469411, C2898.m8704(arrayList6, arrayList7));
                                    } catch (IllegalArgumentException e) {
                                        Point pointM46939 = m46939(c20932);
                                        C18066 c18066 = new C18066(null, pointM46939.x, pointM46939.y, e.getMessage());
                                        c18066.initCause((Throwable) e);
                                        throw c18066;
                                    }
                                } else {
                                    arrayList2 = arrayList3;
                                    cls3 = cls7;
                                    cls4 = cls6;
                                    if (listM51372 == null) {
                                        throw new RuntimeException();
                                    }
                                    if (listM51372.isEmpty()) {
                                        throw new RuntimeException("[Define " + c9644.m51373(46, 0).getText() + "]: Matchers cannot be empty");
                                    }
                                    if (listM51372.size() == 1) {
                                        AbstractC6839 abstractC6839M46944 = m46944(this, (C19855) listM51372.get(0), zM46950);
                                        m46947(abstractC6839M46944, strM469411);
                                        map.put(strM469411, abstractC6839M46944);
                                    } else {
                                        C21594 c21594 = new C21594(this);
                                        ArrayList arrayList9 = new ArrayList();
                                        Iterator it8 = listM51372.iterator();
                                        int i2 = 1;
                                        while (it8.hasNext()) {
                                            AbstractC6839 abstractC6839M46945 = m46944(c21594, (C19855) it8.next(), zM46950);
                                            StringBuilder sbM8976 = C3012.m8976(strM469411, "[");
                                            sbM8976.append(i2);
                                            sbM8976.append("]");
                                            m46947(abstractC6839M46945, sbM8976.toString());
                                            arrayList9.add(abstractC6839M46945);
                                            i2++;
                                        }
                                        c21594.m48308(arrayList9);
                                        map.put(strM469411, c21594);
                                    }
                                }
                                cls5 = cls8;
                                it4 = it5;
                                cls6 = cls4;
                                arrayList3 = arrayList2;
                                cls7 = cls3;
                            }
                        } else {
                            arrayList = arrayList3;
                            cls = cls5;
                            cls2 = cls6;
                            C23755 c23755 = (C23755) c11055.m51374(C23755.class, 0);
                            if (c23755 != null) {
                                Iterator it9 = c23755.m51372(C19855.class).iterator();
                                while (it9.hasNext()) {
                                    arrayList4.add(m46944(this, (C19855) it9.next(), zM46950));
                                }
                            } else {
                                C14916 c14916 = (C14916) c11055.m51374(C14916.class, 0);
                                if (c14916 == null) {
                                    throw new RuntimeException(c11055.getText());
                                }
                                AbstractC6839 abstractC6839 = this.f23037;
                                List listM51374 = ((C13733) ((C21265) c14916.m51374(C21265.class, 0)).m51374(C13733.class, 0)).m51372(cls7);
                                try {
                                    this.f67852.add(new C7483(C12859.m31876(zM46950 ? 2 : 0, m46940(abstractC6839, listM51374)), m46955(C16387.m38583(m46949(((C11616) c14916.m51374(C11616.class, 0)).m51373(46, 0))))));
                                } catch (PatternSyntaxException e2) {
                                    throw new RuntimeException(m46942(((C23289) listM51374.get(0)).f75536) + " " + e2.getMessage());
                                }
                            }
                        }
                        it3 = it;
                        cls5 = cls;
                        cls6 = cls2;
                        arrayList3 = arrayList;
                    }
                    arrayList = arrayList3;
                    cls = cls5;
                    cls2 = cls6;
                    it3 = it;
                    cls5 = cls;
                    cls6 = cls2;
                    arrayList3 = arrayList;
                }
                this.f67855 = arrayList3;
                mo18445(new C4016());
                ArrayList arrayList10 = new ArrayList();
                for (AbstractC6839 abstractC68310 : arrayList4) {
                    if (abstractC68310 instanceof C19478) {
                        arrayList10.addAll(m46943(abstractC68310, new HashSet()));
                    } else {
                        arrayList10.add(abstractC68310);
                    }
                }
                arrayList4.clear();
                arrayList4.addAll(arrayList10);
                return;
            }
            C11055 c11056 = (C11055) it2.next();
            C8566 c8566 = (C8566) c11056.m51374(C8566.class, i);
            if (c8566 != null) {
                List listM51376 = ((C2920) c8566.m51374(C2920.class, i)).m51376(46);
                this.f67860 = m46949((InterfaceC17809) listM51376.get(i));
                for (int i3 = 1; i3 < listM51376.size(); i3++) {
                    linkedHashSet.add(m46949((InterfaceC17809) listM51376.get(i3)));
                }
            } else {
                C21971 c21971 = (C21971) c11056.m51374(C21971.class, i);
                if (c21971 != null) {
                    this.f67859 = m46950(c21971.m51373(48, i));
                } else {
                    C14583 c14583 = (C14583) c11056.m51374(C14583.class, i);
                    if (c14583 != null) {
                        for (C1881 c1881 : c14583.m51372(C1881.class)) {
                            List listM51377 = c1881.m51376(46);
                            List listM51378 = c1881.m51376(49);
                            InterfaceC17809 interfaceC17809M51374 = c1881.m51373(51, i);
                            String strM469412 = m46949((InterfaceC17809) listM51377.get(i));
                            if (strM469412.startsWith("!!")) {
                                throw new RuntimeException("Illegal style name: " + listM51378);
                            }
                            if (listM51377.size() == 2) {
                                c15682M37365 = m46955(C16387.m38583(m46949((InterfaceC17809) listM51377.get(1))));
                                if (interfaceC17809M51374 != null) {
                                    c15682M37365 = c15682M37365.m37370(m46938(interfaceC17809M51374));
                                }
                            } else if (listM51378.size() == 2) {
                                int[] iArr = new int[2];
                                m46946(c1881.m51373(49, 0).getText(), iArr);
                                int i4 = iArr[0];
                                int i5 = iArr[1];
                                m46946(c1881.m51373(49, 1).getText(), iArr);
                                c15682M37365 = C15682.m37365(null, i4, i5, iArr[0], iArr[1], m46938(c1881.m51373(51, 0)));
                            } else {
                                c15682M37365 = C15682.m37365(null, 1447446, 1447446, 1447446, 1447446, m46938(interfaceC17809M51374));
                            }
                            this.f67849.m38587(strM469412, c15682M37365);
                            i = 0;
                        }
                    } else {
                        C20227 c20227 = (C20227) c11056.m51374(C20227.class, 0);
                        if (c20227 != null) {
                            this.f67850 = C12859.m31901(c20227.m51373(50, 0).getText());
                        } else {
                            C0470 c0470 = (C0470) c11056.m51374(C0470.class, 0);
                            if (c0470 != null) {
                                this.f67862 = C12859.m31896(c0470.m51373(50, 0).getText());
                            } else {
                                C13171 c13171 = (C13171) c11056.m51374(C13171.class, 0);
                                if (c13171 != null) {
                                    List<InterfaceC17809> listM51379 = c13171.m51376(46);
                                    ArrayList arrayList11 = new ArrayList(listM51379.size());
                                    for (InterfaceC17809 interfaceC17809 : listM51379) {
                                        String strM469413 = m46949(interfaceC17809);
                                        if (strM469413.length() != 2 || strM469413.charAt(0) == strM469413.charAt(1)) {
                                            throw new RuntimeException(m46942(interfaceC17809.mo41396()) + " Illegal bracket pair " + interfaceC17809.getText());
                                        }
                                        arrayList11.add(strM469413);
                                    }
                                    arrayList3 = arrayList11;
                                } else {
                                    C12799 c12799 = (C12799) c11056.m51374(C12799.class, 0);
                                    if (c12799 != null) {
                                        zM46950 = m46950(c12799.m51373(48, 0));
                                    } else if (((C16699) c11056.m51374(cls6, 0)) != null) {
                                        arrayList5.add(c11056);
                                    } else if (((C3292) c11056.m51374(cls5, 0)) != null) {
                                        arrayList5.add(c11056);
                                    } else if (((C23755) c11056.m51374(C23755.class, 0)) != null) {
                                        arrayList5.add(c11056);
                                    } else {
                                        if (((C14916) c11056.m51374(C14916.class, 0)) == null) {
                                            throw new RuntimeException(c11056.getText());
                                        }
                                        arrayList5.add(c11056);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Point m46939(C23289 c23289) {
        InterfaceC19761 interfaceC19761 = c23289.f75536;
        return new Point(interfaceC19761.getLine(), interfaceC19761.mo22509());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private List m46943(AbstractC6839 abstractC6839, HashSet hashSet) {
        if (abstractC6839 instanceof C19478) {
            C19478 c19478 = (C19478) abstractC6839;
            if (hashSet.add(c19478.m44540())) {
                AbstractC6839 abstractC6839M46962 = m46962(c19478.m44540());
                if (abstractC6839M46962 instanceof C21594) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((C21594) abstractC6839M46962).m48307().iterator();
                    while (it.hasNext()) {
                        arrayList.addAll(m46943((AbstractC6839) it.next(), new HashSet(hashSet)));
                    }
                    return arrayList;
                }
                return m46943(abstractC6839M46962, new HashSet(hashSet));
            }
        }
        if (abstractC6839.f23037 != this) {
            return Collections.singletonList(abstractC6839.mo18441(this));
        }
        return Collections.singletonList(abstractC6839);
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18445(C4016 c4016) {
        Iterator it = this.f67856.iterator();
        while (it.hasNext()) {
            ((AbstractC6839) it.next()).mo18445(c4016);
        }
        for (Map.Entry entry : this.f67863.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof AbstractC6839) {
                AbstractC6839 abstractC6839 = (AbstractC6839) value;
                if (c4016.f14872.add((String) entry.getKey())) {
                    abstractC6839.mo18445(c4016);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46947(AbstractC6839 abstractC6839, String str) {
        if (abstractC6839 instanceof C10037) {
            C10037 c10037 = (C10037) abstractC6839;
            if (c10037.m25322() == null) {
                c10037.m25324(str);
                return;
            }
            return;
        }
        if (abstractC6839 instanceof C7214) {
            C7214 c7214 = (C7214) abstractC6839;
            if (c7214.m19162() == null) {
                c7214.m19168(str);
                return;
            }
            return;
        }
        if (abstractC6839 instanceof C17797) {
            C17797 c17797 = (C17797) abstractC6839;
            if (c17797.m41378() == null) {
                c17797.m41376(str);
                return;
            }
            return;
        }
        if (abstractC6839 instanceof C8189) {
            C8189 c8189 = (C8189) abstractC6839;
            if (c8189.m21479() == null) {
                c8189.m21480(str);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46940(AbstractC6839 abstractC6839, List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4559 c4559 = (C4559) it.next();
            if (((C5265) c4559.m51374(C5265.class, 0)) != null) {
                Point pointM46939 = m46939(c4559);
                throw new C18066(null, pointM46939.x, pointM46939.y, "var() is not allowed in regex definitions or static match fields");
            }
            sb.append(m46941(abstractC6839, c4559));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46946(String str, int[] iArr) {
        boolean z;
        int iIndexOf = str.indexOf(35, 4);
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf(36, 4);
            z = true;
        } else {
            z = false;
        }
        if (iIndexOf == -1) {
            iArr[0] = m46948(str);
            iArr[1] = 1447446;
            return;
        }
        iArr[0] = m46948(str.substring(0, iIndexOf));
        if (z) {
            int iM46948 = m46948("#" + str.substring(iIndexOf + 1));
            iArr[1] = iM46948;
            iArr[1] = (iM46948 & 16777215) | 100663296;
            return;
        }
        iArr[1] = m46948(str.substring(iIndexOf));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m46948(String str) {
        if (str.equalsIgnoreCase("#NULL")) {
            return 1447446;
        }
        C12812 c12812 = f67846;
        synchronized (c12812) {
            if (!C6461.m17649(str, c12812)) {
                return -65536;
            }
            return c12812.f42662;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m46938(InterfaceC17809 interfaceC17809) {
        int i = 0;
        if (interfaceC17809 != null) {
            String text = interfaceC17809.getText();
            i = text.indexOf(66) != -1 ? 1 : 0;
            if (text.indexOf(73) != -1) {
                i |= 2;
            }
            if (text.indexOf(85) != -1) {
                i |= 4;
            }
            if (text.indexOf(83) != -1) {
                return i | 8;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m46949(InterfaceC17809 interfaceC17809) {
        return C11168.f37846.m35229(C20630.m46498(1, 1, interfaceC17809.getText()));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m46950(InterfaceC17809 interfaceC17809) {
        return interfaceC17809.getText().equals("true");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46942(InterfaceC19761 interfaceC19761) {
        int line = interfaceC19761.getLine();
        int iMo22509 = interfaceC19761.mo22509();
        StringBuilder sb = new StringBuilder();
        if (iMo22509 > 0) {
            sb.append('[');
            sb.append(line);
            sb.append(':');
            sb.append(iMo22509 + 1);
            sb.append(']');
        } else {
            sb.append("[line ");
            sb.append(line);
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15682 m46969() {
        C15682 c15682 = this.f67851;
        if (c15682 != null) {
            return c15682;
        }
        C15682 c15682M46955 = m46955(C16387.f52729);
        this.f67851 = c15682M46955;
        return c15682M46955;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15682 m46955(int i) {
        boolean z = i < 0;
        if (z) {
            i = -i;
        }
        C15682 c15682M38585 = this.f67849.m38585(i);
        if (c15682M38585 == null) {
            int i2 = C12859.f42771;
            C3249 c3249 = this.f67857;
            C15682 c15682M38586 = c3249.f12084.m38585(i);
            if (c15682M38586 == null) {
                c15682M38586 = c3249.f12082;
            }
            c15682M38585 = c15682M38586;
        }
        return z ? c15682M38585.m37380() : c15682M38585;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C3249 m46951() {
        return this.f67857;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m46958() {
        return this.f67860;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Set m46965() {
        return this.f67854;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final List m46953() {
        return C0561.unmodifiableList(this.f67847);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final List m46960() {
        return this.f67855;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5366 m46952() {
        InterfaceC5366 interfaceC5366 = this.f67850;
        return (interfaceC5366 == null && "MT-Syntax".equals(this.f67860)) ? InterfaceC5366.f18525 : interfaceC5366;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13128 m46957() {
        return this.f67862;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList m46961() {
        return this.f67852;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m46966() {
        return this.f67859;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        mo18443(sb, 0);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC6839 m46962(String str) {
        Object obj = this.f67863.get(str);
        if (obj == null) {
            throw new RuntimeException(C0252.m1693("Definition not found: ", str));
        }
        if (obj instanceof AbstractC6839) {
            return (AbstractC6839) obj;
        }
        throw new RuntimeException(C0252.m1693("Not a matcher definition: ", str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2898 m46954(String str) {
        Object obj = this.f67863.get(str);
        if (obj == null) {
            throw new IllegalArgumentException(C0252.m1693("Definition not found: ", str));
        }
        if (obj instanceof C2898) {
            return (C2898) obj;
        }
        throw new IllegalArgumentException(C0252.m1693("Not a childrenSyntax mapping definition: ", str));
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC6839 mo18441(AbstractC6839 abstractC6839) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18443(StringBuilder sb, int i) {
        sb.append("[Language]\n");
        sb.append("Name: ");
        sb.append(this.f67860);
        sb.append('\n');
        sb.append("Suffixes: ");
        sb.append(this.f67854);
        sb.append('\n');
        sb.append("Comment: ");
        sb.append(this.f67847);
        sb.append('\n');
        Map map = this.f67863;
        if (!map.isEmpty()) {
            sb.append("Defines: ");
            sb.append('\n');
            for (Map.Entry entry : map.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(": ");
                Object value = entry.getValue();
                if (value instanceof AbstractC6839) {
                    ((AbstractC6839) value).mo18443(sb, 0);
                } else if (value instanceof C2898) {
                    ((C2898) value).m8706(sb);
                } else {
                    sb.append(value);
                    sb.append("\n");
                }
            }
        }
        sb.append("Contains: ");
        sb.append('\n');
        Iterator it = this.f67856.iterator();
        while (it.hasNext()) {
            ((AbstractC6839) it.next()).mo18443(sb, 0);
        }
    }

    @Override // l.AbstractC6839
    /* JADX INFO: renamed from: ۙ */
    public final void mo18444(ArrayList arrayList) {
        Iterator it = this.f67856.iterator();
        while (it.hasNext()) {
            ((AbstractC6839) it.next()).mo18444(arrayList);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46963() {
        mo18444(new ArrayList());
        for (Object obj : this.f67863.values()) {
            if (obj instanceof AbstractC6839) {
                ((AbstractC6839) obj).mo18444(new ArrayList());
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List m46968() {
        return this.f67856;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46956(Callable callable) {
        this.f67853 = callable;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m46970() {
        return (String) this.f67853.call();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15682 m46945(C21637 c21637) {
        int[] iArr = new int[2];
        m46946(c21637.m51373(49, 0).getText(), iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        m46946(c21637.m51373(49, 1).getText(), iArr);
        return C15682.m37365(null, i, i2, iArr[0], iArr[1], m46938(c21637.m51373(51, 0)));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46964(int i) {
        if (this.f67858 && this.f67861 != i) {
            throw new IllegalStateException("Language semantic hash is already initialized");
        }
        this.f67861 = i;
        this.f67858 = true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m46967() {
        this.f67848 = true;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m46959() {
        if (this.f67848) {
            throw new IllegalArgumentException("Cached language requires recompilation");
        }
    }

    public final int hashCode() {
        return this.f67861;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [l.ۜܶۚ, l.۠۬ۚ] */
    /* JADX WARN: Type inference failed for: r9v1, types: [l.ۜܶۚ, l.᩵۬ۚ] */
    /* JADX WARN: Type inference failed for: r9v2, types: [l.ۜܶۚ, l.ܳ֨ۚ] */
    /* JADX WARN: Type inference failed for: r9v3, types: [l.ۜܶۚ, l.ᩳۘۚ] */
    /* JADX WARN: Type inference failed for: r9v4, types: [l.ۜܶۚ, l.۟ۘۚ] */
    /* JADX WARN: Type inference failed for: r9v5, types: [l.ۜܶۚ] */
    /* JADX WARN: Type inference failed for: r9v6, types: [l.ۜܶۚ, l.ۤۘۚ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC6839 m46944(AbstractC6839 abstractC6839, C19855 c19855, boolean z) {
        ?? c8189;
        Class<C11616> cls;
        boolean z2;
        boolean z3;
        Iterator it;
        C4660 c4660M12849;
        C0098 c0098 = (C0098) c19855.m51374(C0098.class, 0);
        if (c0098 != null) {
            c8189 = new C10037(abstractC6839);
            C18443 c18443 = (C18443) c0098.m51374(C18443.class, 0);
            if (c18443 != null) {
                c8189.m25324(m46949(c18443.m51373(46, 0)));
            }
            List<C4559> listM51372 = ((C13733) ((C21265) c0098.m51374(C21265.class, 0)).m51374(C13733.class, 0)).m51372(C4559.class);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            StringBuilder sb = new StringBuilder();
            for (C4559 c4559 : listM51372) {
                C5265 c5265 = (C5265) c4559.m51374(C5265.class, 0);
                if (c5265 == null) {
                    sb.append(m46941(abstractC6839, c4559));
                } else {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                    arrayList2.add(m46949(c5265.m51373(46, 0)));
                }
            }
            arrayList.add(sb.toString());
            try {
                C8626 c8626M22404 = C8626.m22404(arrayList, arrayList2, z ? 2 : 0);
                c8189.m25325(c8626M22404);
                int iM22415 = c8626M22404.m22415();
                C10683 c10683 = (C10683) c0098.m51374(C10683.class, 0);
                if (c10683 != null) {
                    c8189.m25328(m46950(c10683.m51373(48, 0)));
                }
                ArrayList arrayList3 = new ArrayList();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                for (C18109 c18109 : c0098.m51372(C18109.class)) {
                    int i = Integer.parseInt(c18109.m51373(44, 0).getText());
                    String strM46949 = m46949(c18109.m51373(46, 0));
                    if (i > iM22415) {
                        Point pointM46939 = m46939(c18109);
                        throw new C18066(null, pointM46939.x, pointM46939.y, "No start capture group " + i + " for exported variable \"" + strM46949 + "\"");
                    }
                    if (!hashSet.add(Integer.valueOf(i))) {
                        Point pointM469310 = m46939(c18109);
                        throw new C18066(null, pointM469310.x, pointM469310.y, C2271.m6966(i, "Capture group ", " is exported more than once"));
                    }
                    if (!hashSet2.add(strM46949)) {
                        Point pointM469311 = m46939(c18109);
                        throw new C18066(null, pointM469311.x, pointM469311.y, C0252.m1693("Duplicate exported variable: ", strM46949));
                    }
                    arrayList3.add(new C1487(i, strM46949));
                }
                c8189.m25333(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i2 = 0;
                for (C23383 c23383 : c0098.m51372(C23383.class)) {
                    int i3 = Integer.parseInt(c23383.m51373(44, 0).getText());
                    if (i3 > iM22415) {
                        String text = c23383.getText();
                        int iIndexOf = text.indexOf(58);
                        if (iIndexOf >= 0 && iIndexOf < 10) {
                            text = "\n".concat(text);
                        }
                        throw new RuntimeException(m46942(c23383.f75536) + " No group " + i3 + ": " + text);
                    }
                    InterfaceC17809 interfaceC17809M51373 = c23383.m51373(46, 0);
                    if (interfaceC17809M51373 != null) {
                        String strM469410 = m46949(interfaceC17809M51373);
                        if (i3 == 0) {
                            arrayList4.add(i2, C12154.m30235(i3, strM469410));
                            i2++;
                        } else {
                            arrayList4.add(C12154.m30235(i3, strM469410));
                        }
                    } else {
                        arrayList5.add(new C23068(i3, m46944(c8189, (C19855) c23383.m51374(C19855.class, 0), z)));
                    }
                }
                c8189.m25331(arrayList4);
                c8189.m25323(arrayList5);
            } catch (IllegalArgumentException e) {
                Point pointM469312 = m46939((C23289) listM51372.get(0));
                C18066 c18066 = new C18066(null, pointM469312.x, pointM469312.y, e.getMessage());
                c18066.initCause((Throwable) e);
                throw c18066;
            }
        } else {
            C17032 c17032 = (C17032) c19855.m51374(C17032.class, 0);
            Class<C11616> cls2 = C11616.class;
            if (c17032 != null) {
                c8189 = new C7214(abstractC6839);
                C18443 c18444 = (C18443) c17032.m51374(C18443.class, 0);
                if (c18444 != null) {
                    c8189.m19168(m46949(c18444.m51373(46, 0)));
                }
                Iterator it2 = c17032.m51372(C5743.class).iterator();
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                while (it2.hasNext()) {
                    C5743 c5743 = (C5743) it2.next();
                    C14211 c14211 = (C14211) c5743.m51374(C14211.class, 0);
                    if (c14211 != null) {
                        c8189.m19165(m46944(c8189, (C19855) c14211.m51374(C19855.class, 0), z));
                    } else {
                        C4331 c4331 = (C4331) c5743.m51374(C4331.class, 0);
                        if (c4331 != null) {
                            c8189.m19169(m46944(c8189, (C19855) c4331.m51374(C19855.class, 0), z));
                        } else {
                            C13505 c13505 = (C13505) c5743.m51374(C13505.class, 0);
                            if (c13505 != null) {
                                c8189.m19156(Integer.parseInt(c13505.m51373(44, 0).getText()));
                                if (z6) {
                                    throw new RuntimeException(C22697.m50267(new StringBuilder(), m46942(c13505.f75536), " <EndMatcher> and endPriority cannot be specified at the same time!"));
                                }
                                z9 = true;
                            } else {
                                C17737 c17737 = (C17737) c5743.m51374(C17737.class, 0);
                                if (c17737 != null) {
                                    c8189.m19160(m46950(c17737.m51373(48, 0)));
                                    z5 = true;
                                } else {
                                    C19149 c19149 = (C19149) c5743.m51374(C19149.class, 0);
                                    if (c19149 != null) {
                                        it = it2;
                                        c8189.m19170(m46950(c19149.m51373(48, 0)));
                                    } else {
                                        it = it2;
                                        C11616 c11616 = (C11616) c5743.m51374(cls2, 0);
                                        if (c11616 != null) {
                                            c8189.m19154(m46949(c11616.m51373(46, 0)));
                                        } else {
                                            C18815 c18815 = (C18815) c5743.m51374(C18815.class, 0);
                                            if (c18815 != null) {
                                                c8189.m19157(m46949(c18815.m51373(46, 0)));
                                            } else {
                                                C8938 c8938 = (C8938) c5743.m51374(C8938.class, 0);
                                                if (c8938 == null) {
                                                    cls = cls2;
                                                    z3 = z6;
                                                    z2 = z8;
                                                    C7860 c7860 = (C7860) c5743.m51374(C7860.class, 0);
                                                    if (c7860 == null) {
                                                        C1509 c1509 = (C1509) c5743.m51374(C1509.class, 0);
                                                        if (c1509 == null) {
                                                            throw new RuntimeException(c5743.getText());
                                                        }
                                                        if (z4) {
                                                            Point pointM469313 = m46939(c1509);
                                                            throw new C18066(null, pointM469313.x, pointM469313.y, "childrenSyntax and contains cannot be used together");
                                                        }
                                                        z6 = z3;
                                                        for (C9272 c9272 : c1509.m51372(C9272.class)) {
                                                            if (c9272.m51373(42, 0) == null) {
                                                                c8189.m19159(m46944(c8189, (C19855) c9272.m51374(C19855.class, 0), z), c9272.m51373(52, 0) != null);
                                                            } else {
                                                                if (z9) {
                                                                    throw new RuntimeException(C22697.m50267(new StringBuilder(), m46942(c9272.f75536), " <EndMatcher> and endPriority cannot be specified at the same time!"));
                                                                }
                                                                if (z6) {
                                                                    throw new RuntimeException(C22697.m50267(new StringBuilder(), m46942(c9272.f75536), " Duplicate <EndMatcher>!"));
                                                                }
                                                                c8189.m19156(((ArrayList) c8189.m19161()).size());
                                                                z6 = true;
                                                            }
                                                        }
                                                        z8 = true;
                                                        it2 = it;
                                                    } else {
                                                        if (z7) {
                                                            Point pointM469314 = m46939(c7860);
                                                            throw new C18066(null, pointM469314.x, pointM469314.y, "Duplicate missingStyle");
                                                        }
                                                        c8189.m19164(m46949(c7860.m51373(46, 0)));
                                                        z7 = true;
                                                    }
                                                } else {
                                                    if (z4) {
                                                        Point pointM469315 = m46939(c8938);
                                                        throw new C18066(null, pointM469315.x, pointM469315.y, "Duplicate childrenSyntax");
                                                    }
                                                    if (z8) {
                                                        Point pointM469316 = m46939(c8938);
                                                        throw new C18066(null, pointM469316.x, pointM469316.y, "childrenSyntax and contains cannot be used together");
                                                    }
                                                    C8232 c8232 = (C8232) c8938.m51374(C8232.class, 0);
                                                    if (c8232 == null) {
                                                        c4660M12849 = C4660.m12850(m46949(c8938.m51373(46, 0)));
                                                        cls = cls2;
                                                        z3 = z6;
                                                        z2 = z8;
                                                    } else {
                                                        int i4 = Integer.parseInt(c8232.m51373(44, 0).getText());
                                                        C12799 c12799 = (C12799) c8938.m51374(C12799.class, 0);
                                                        boolean zM46950 = c12799 == null ? z : m46950(c12799.m51373(48, 0));
                                                        List listM51373 = c8938.m51372(C19521.class);
                                                        List listM51374 = c8938.m51372(C10349.class);
                                                        ArrayList arrayList6 = new ArrayList(listM51374.size());
                                                        HashSet hashSet3 = new HashSet();
                                                        Iterator it3 = listM51374.iterator();
                                                        while (it3.hasNext()) {
                                                            Iterator it4 = it3;
                                                            C10349 c10349 = (C10349) it3.next();
                                                            boolean z10 = z6;
                                                            String strM469411 = m46949(c10349.m51373(46, 0));
                                                            if (!hashSet3.add(strM469411)) {
                                                                Point pointM469317 = m46939(c10349);
                                                                throw new C18066(null, pointM469317.x, pointM469317.y, C0252.m1693("Duplicate childrenSyntax include: ", strM469411));
                                                            }
                                                            arrayList6.add(strM469411);
                                                            it3 = it4;
                                                            z6 = z10;
                                                        }
                                                        z3 = z6;
                                                        ArrayList arrayList7 = new ArrayList(listM51373.size());
                                                        ArrayList arrayList8 = new ArrayList(listM51373.size());
                                                        HashSet hashSet4 = new HashSet();
                                                        Iterator it5 = listM51373.iterator();
                                                        boolean z11 = false;
                                                        String strM469412 = null;
                                                        while (it5.hasNext()) {
                                                            z8 = z8;
                                                            C19521 c19521 = (C19521) it5.next();
                                                            it5 = it5;
                                                            if (c19521.m51373(14, 0) == null) {
                                                                C15994 c15994 = (C15994) c19521.m51374(C15994.class, 0);
                                                                Class<C11616> cls3 = cls2;
                                                                InterfaceC17809 interfaceC17809M51374 = c15994.m51373(46, 0);
                                                                if (interfaceC17809M51374 == null) {
                                                                    interfaceC17809M51374 = c15994.m51373(45, 0);
                                                                }
                                                                String strM469413 = m46949(interfaceC17809M51374);
                                                                if (!hashSet4.add(C4660.m12848(strM469413, zM46950))) {
                                                                    Point pointM469318 = m46939(c19521);
                                                                    throw new C18066(null, pointM469318.x, pointM469318.y, C0252.m1693("Duplicate childrenSyntax selector: ", strM469413));
                                                                }
                                                                arrayList7.add(strM469413);
                                                                arrayList8.add(m46949(c19521.m51373(46, 0)));
                                                                cls2 = cls3;
                                                            } else {
                                                                if (z11) {
                                                                    Point pointM469319 = m46939(c19521);
                                                                    throw new C18066(null, pointM469319.x, pointM469319.y, "Duplicate childrenSyntax default");
                                                                }
                                                                strM469412 = m46949(c19521.m51373(46, 0));
                                                                z11 = true;
                                                            }
                                                        }
                                                        cls = cls2;
                                                        z2 = z8;
                                                        c4660M12849 = C4660.m12849(i4, zM46950, arrayList6, arrayList7, arrayList8, strM469412);
                                                    }
                                                    c8189.m19158(c4660M12849);
                                                    z4 = true;
                                                }
                                                z8 = z2;
                                                it2 = it;
                                                z6 = z3;
                                            }
                                        }
                                    }
                                    cls = cls2;
                                    z3 = z6;
                                    z2 = z8;
                                    z8 = z2;
                                    it2 = it;
                                    z6 = z3;
                                }
                                cls2 = cls;
                            }
                        }
                    }
                    it = it2;
                    cls = cls2;
                    z3 = z6;
                    z2 = z8;
                    z8 = z2;
                    it2 = it;
                    z6 = z3;
                    cls2 = cls;
                }
                if (z4 && !z5) {
                    c8189.m19160(true);
                }
                c8189.m19167();
            } else {
                Class<C11616> cls4 = cls2;
                C12094 c12094 = (C12094) c19855.m51374(C12094.class, 0);
                if (c12094 != null) {
                    c8189 = new C17797(abstractC6839);
                    C18443 c18445 = (C18443) c12094.m51374(C18443.class, 0);
                    if (c18445 != null) {
                        c8189.m41376(m46949(c18445.m51373(46, 0)));
                    }
                    String strM469414 = m46949(((C9977) c12094.m51374(C9977.class, 0)).m51373(46, 0));
                    String strM469415 = "";
                    String strM469416 = "";
                    for (C16327 c16327 : c12094.m51372(C16327.class)) {
                        C0803 c0803 = (C0803) c16327.m51374(C0803.class, 0);
                        if (c0803 != null) {
                            strM469415 = m46949(c0803.m51373(46, 0));
                        } else {
                            C11388 c11388 = (C11388) c16327.m51374(C11388.class, 0);
                            if (c11388 != null) {
                                strM469416 = m46949(c11388.m51373(46, 0));
                            } else {
                                Class<C11616> cls5 = cls4;
                                C11616 c11617 = (C11616) c16327.m51374(cls5, 0);
                                if (c11617 == null) {
                                    throw new RuntimeException(c16327.getText());
                                }
                                c8189.m41380(m46949(c11617.m51373(46, 0)));
                                cls4 = cls5;
                            }
                        }
                    }
                    c8189.m41377(new C21325(strM469414, strM469415, strM469416));
                } else {
                    C7154 c7154 = (C7154) c19855.m51374(C7154.class, 0);
                    if (c7154 != null) {
                        String text2 = ((C3997) c7154.m51374(C3997.class, 0)).m51373(50, 0).getText();
                        c8189 = new C14189(abstractC6839);
                        c8189.m34280(text2);
                    } else {
                        C15622 c15622 = (C15622) c19855.m51374(C15622.class, 0);
                        if (c15622 != null) {
                            String strM469417 = m46949(c15622.m51373(46, 0));
                            c8189 = new C19478(abstractC6839);
                            c8189.m44539(strM469417);
                        } else {
                            C20560 c20560 = (C20560) c19855.m51374(C20560.class, 0);
                            if (c20560 == null) {
                                throw new RuntimeException(c19855.getText());
                            }
                            c8189 = new C8189(abstractC6839);
                            C18443 c18446 = (C18443) c20560.m51374(C18443.class, 0);
                            if (c18446 != null) {
                                c8189.m21480(m46949(c18446.m51373(46, 0)));
                            }
                            c8189.m21483(((C5037) ((C2214) c20560.m51374(C2214.class, 0)).m51374(C5037.class, 0)).getText());
                            C11616 c11618 = (C11616) c20560.m51374(cls4, 0);
                            if (c11618 != null) {
                                c8189.m21485(m46949(c11618.m51373(46, 0)));
                            }
                            Iterator it6 = ((C23755) c20560.m51374(C23755.class, 0)).m51372(C19855.class).iterator();
                            while (it6.hasNext()) {
                                c8189.m21486(m46944(c8189, (C19855) it6.next(), z));
                            }
                        }
                    }
                }
            }
        }
        c8189.f23038 = m46939(c19855);
        return c8189;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46941(AbstractC6839 abstractC6839, C4559 c4559) {
        int i;
        int i2;
        int i3 = 0;
        InterfaceC17809 interfaceC17809M51373 = c4559.m51373(46, 0);
        InterfaceC17809 interfaceC17809M51374 = c4559.m51373(47, 0);
        C22677 c22677 = (C22677) c4559.m51374(C22677.class, 0);
        C3625 c3625 = (C3625) c4559.m51374(C3625.class, 0);
        if (interfaceC17809M51373 != null) {
            return m46949(interfaceC17809M51373);
        }
        int i4 = 1;
        if (interfaceC17809M51374 != null) {
            String text = interfaceC17809M51374.getText();
            return text.substring(1, text.length() - 1).replace("\\/", "/");
        }
        if (c22677 == null) {
            if (c3625 == null) {
                throw new IllegalArgumentException("Expected a static regex fragment");
            }
            C20889 c20889Mo18442 = abstractC6839 == null ? null : abstractC6839.mo18442();
            if (c20889Mo18442 == null) {
                throw new RuntimeException("Include regex is not supported here!");
            }
            String strM46949 = m46949(c3625.m51373(46, 0));
            Object obj = c20889Mo18442.f67863.get(strM46949);
            if (obj == null) {
                throw new RuntimeException(C0252.m1693("Definition not found: ", strM46949));
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            throw new RuntimeException(C0252.m1693("Not a regex definition: ", strM46949));
        }
        HashSet<String> hashSet = new HashSet();
        Iterator it = c22677.m51376(46).iterator();
        while (it.hasNext()) {
            Collections.addAll(hashSet, m46949((InterfaceC17809) it.next()).split("\\s+"));
        }
        if (hashSet.isEmpty()) {
            return "";
        }
        C8895 c8895 = new C8895("Start", i3);
        C8895 c8896 = new C8895("End", i3);
        C8895 c8897 = new C8895("StartEnd", i3);
        C8895 c8898 = new C8895("None", i3);
        for (String str : hashSet) {
            if (!str.isEmpty()) {
                char cCharAt = str.charAt(i3);
                boolean z = cCharAt == '_' || Character.isLetterOrDigit(cCharAt);
                char cM9601 = C3184.m9601(i4, str);
                boolean z2 = cM9601 == '_' || Character.isLetterOrDigit(cM9601);
                ArrayList arrayList = new ArrayList(str.length() + i4);
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                boolean z3 = true;
                for (int i5 = 0; i5 < length; i5++) {
                    char cCharAt2 = str.charAt(i5);
                    if (i5 == 0) {
                        arrayList.add(C17874.m41459(String.valueOf(cCharAt2)));
                    } else {
                        boolean zIsLetterOrDigit = Character.isLetterOrDigit(cCharAt2);
                        if (zIsLetterOrDigit != z3) {
                            if (sb.length() > 0) {
                                arrayList.add(C17874.m41459(sb.toString()));
                                sb.setLength(0);
                            }
                            z3 = zIsLetterOrDigit;
                        }
                        sb.append(cCharAt2);
                    }
                }
                if (sb.length() > 0) {
                    arrayList.add(C17874.m41459(sb.toString()));
                }
                arrayList.add("");
                if (z && z2) {
                    c8897.m23146(arrayList, 0);
                } else if (z) {
                    c8895.m23146(arrayList, 0);
                } else if (z2) {
                    c8896.m23146(arrayList, 0);
                } else {
                    c8898.m23146(arrayList, 0);
                }
                i3 = 0;
                i4 = 1;
            }
        }
        C8895 c8899 = new C8895("Root", 0);
        ArrayList arrayList2 = new ArrayList(3);
        if (c8895.f30523.isEmpty()) {
            i = 0;
        } else {
            arrayList2.add("\\b");
            arrayList2.add(c8895.f30523.m26121());
            i = 0;
            c8899.m23146(arrayList2, 0);
            arrayList2.clear();
        }
        if (!c8896.f30523.isEmpty()) {
            arrayList2.add(c8896.f30523.m26121());
            arrayList2.add("\\b");
            c8899.m23146(arrayList2, i);
            arrayList2.clear();
        }
        if (c8897.f30523.isEmpty()) {
            i2 = 0;
        } else {
            arrayList2.add("\\b");
            arrayList2.add(c8897.f30523.m26121());
            arrayList2.add("\\b");
            i2 = 0;
            c8899.m23146(arrayList2, 0);
            arrayList2.clear();
        }
        if (!c8898.f30523.isEmpty()) {
            arrayList2.add(c8898.f30523.m26121());
            c8899.m23146(arrayList2, i2);
            arrayList2.clear();
        }
        ArrayList<C8895> arrayList3 = new ArrayList(c8899.f30523.values());
        Collections.sort(arrayList3);
        StringBuilder sb2 = new StringBuilder("(?:");
        boolean z4 = true;
        for (C8895 c88910 : arrayList3) {
            if (z4) {
                z4 = false;
            } else {
                sb2.append('|');
            }
            sb2.append(c88910.m23145());
        }
        sb2.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb2.toString();
    }
}
