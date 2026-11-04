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

/* JADX INFO: renamed from: l.ܺۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4TV */
/* JADX INFO: loaded from: classes5.dex */
public final class C16800 extends AbstractC2805 {

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final C5765 f54195 = new C5765();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17941 f54196;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList f54197;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List f54198;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Set f54199;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f54200;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C11974 f54201;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Callable f54202;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f54203;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC8313 f54204;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f54205;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C14562 f54206;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f54207;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC0855 f54208;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f54209;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f54210;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f54211;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Map f54212;

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final C16800 mo9276() {
        return this;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C11579 m39673(String str) {
        return new C11579(str);
    }

    public C16800(C11579 c11579) {
        super(null);
        C17941 c17941 = new C17941();
        this.f54196 = c17941;
        this.f54197 = new ArrayList();
        this.f54203 = new ArrayList();
        this.f54208 = null;
        this.f54204 = null;
        this.f54206 = C9341.m24623();
        this.f54209 = "In-memory regex";
        this.f54211 = true;
        this.f54199 = Collections.EMPTY_SET;
        this.f54212 = Collections.EMPTY_MAP;
        this.f54200 = Collections.EMPTY_LIST;
        if (c11579.f36376 != null) {
            c17941.m41881(C17941.f58776, C11974.m30032(null, c11579.f36376.intValue(), 1447446, c11579.f36376.intValue(), 1447446, 0));
        }
        C13466 c13466 = new C13466(this);
        c13466.m33114(c11579.f36379);
        ArrayList arrayList = new ArrayList(c11579.f36378.size());
        int iHash = C17359.hash("In-memory regex", c11579.f36379.pattern(), Integer.valueOf(c11579.f36379.flags()), Boolean.valueOf(c11579.f36376 != null), c11579.f36376);
        for (Map.Entry entry : c11579.f36378.entrySet()) {
            String str = "memoryRegexGroup" + entry.getKey();
            this.f54196.m41882(str, C11974.m30032(null, ((Integer) entry.getValue()).intValue(), 1447446, ((Integer) entry.getValue()).intValue(), 1447446, 0));
            arrayList.add(C16449.m39003(((Integer) entry.getKey()).intValue(), str));
            iHash = ((Integer) entry.getValue()).intValue() + ((((Integer) entry.getKey()).intValue() + (iHash * 31)) * 31);
        }
        c13466.m33117(arrayList);
        this.f54198 = Collections.singletonList(c13466);
        this.f54202 = new CallableC1885();
        m39692((C14562.m35123(this.f54206) * 31) + iHash);
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9279(C6178 c6178) {
        String str;
        c6178.mo17812(20224);
        c6178.m17797();
        c6178.m17800(this.f54209);
        Set set = this.f54199;
        c6178.mo17812(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c6178.m17800((String) it.next());
        }
        c6178.m17789(this.f54211);
        ArrayList<InterfaceC7456> arrayList = this.f54203;
        c6178.mo17812(arrayList.size());
        for (InterfaceC7456 interfaceC7456 : arrayList) {
            if (interfaceC7456 instanceof C14167) {
                C14167 c14167 = (C14167) interfaceC7456;
                c6178.writeByte(0);
                c6178.m17800(c14167.f44793);
                c6178.m17789(c14167.f44794);
                c6178.m17789(c14167.f44795);
            } else if (interfaceC7456 instanceof C4628) {
                C4628 c4628 = (C4628) interfaceC7456;
                c6178.writeByte(1);
                c6178.m17800(c4628.f16390);
                c6178.m17800(c4628.f16388);
                c6178.m17789(c4628.f16387);
                c6178.m17789(c4628.f16389);
            } else {
                throw new RuntimeException();
            }
        }
        int i = C9341.f30354;
        InterfaceC0855 interfaceC0855 = InterfaceC0855.f3222;
        String str2 = null;
        InterfaceC0855 interfaceC0856 = this.f54208;
        if (interfaceC0856 == interfaceC0855) {
            str = "#BUILT_IN_LUA_FORMATTER#";
        } else if (interfaceC0856 == InterfaceC0855.f3218) {
            str = "#BUILT_IN_PYTHON_FORMATTER#";
        } else if (interfaceC0856 == null) {
            str = null;
        } else if (interfaceC0856 == InterfaceC0855.f3221) {
            str = "#BUILT_IN_MTSX_FORMATTER#";
        } else if (interfaceC0856 == InterfaceC0855.f3217) {
            str = "#BUILT_IN_CSS_FORMATTER#";
        } else if (interfaceC0856 == InterfaceC0855.f3224) {
            str = "#BUILT_IN_HTML_FORMATTER#";
        } else if (interfaceC0856 == InterfaceC0855.f3225) {
            str = "#BUILT_IN_JS_FORMATTER#";
        } else if (interfaceC0856 == InterfaceC0855.f3220) {
            str = "#BUILT_IN_TS_FORMATTER#";
        } else if (interfaceC0856 == InterfaceC0855.f3223) {
            str = "#BUILT_IN_JSON_FORMATTER#";
        } else if (interfaceC0856 == InterfaceC0855.f3226) {
            str = "#BUILT_IN_XML_FORMATTER#";
        } else if (interfaceC0856 == InterfaceC0855.f3216) {
            str = "#BUILT_IN_SMALI_FORMATTER#";
        } else {
            if (interfaceC0856 != InterfaceC0855.f3219) {
                throw new RuntimeException(interfaceC0856.toString());
            }
            str = "#BUILT_IN_JAVA_FORMATTER#";
        }
        c6178.m17787(str);
        InterfaceC8313 interfaceC8313 = this.f54204;
        if (interfaceC8313 != null) {
            if (interfaceC8313 == InterfaceC8313.f27281) {
                str2 = "#BUILT_IN_CSS_SHRINKER#";
            } else if (interfaceC8313 == InterfaceC8313.f27283) {
                str2 = "#BUILT_IN_HTML_SHRINKER#";
            } else if (interfaceC8313 == InterfaceC8313.f27282) {
                str2 = "#BUILT_IN_JS_SHRINKER#";
            } else {
                if (interfaceC8313 != InterfaceC8313.f27284) {
                    throw new RuntimeException(interfaceC8313.toString());
                }
                str2 = "#BUILT_IN_JSON_SHRINKER#";
            }
        }
        c6178.m17787(str2);
        C17941 c17941 = this.f54196;
        c6178.mo17812(c17941.m41883());
        InterfaceC15224 it2 = c17941.m41884().iterator();
        while (it2.hasNext()) {
            InterfaceC5903 interfaceC5903 = (InterfaceC5903) it2.next();
            c6178.m17800(C17941.m41878(interfaceC5903.mo3870()));
            ((C11974) interfaceC5903.getValue()).m30039(c6178);
        }
        ArrayList<C25006> arrayList2 = this.f54197;
        c6178.mo17812(arrayList2.size());
        for (C25006 c25006 : arrayList2) {
            c6178.m17800(c25006.f80945.pattern());
            c6178.mo17812(c25006.f80945.flags());
            c25006.f80944.m30039(c6178);
        }
        List list = this.f54198;
        c6178.mo17812(list.size());
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ((AbstractC2805) it3.next()).mo9279(c6178);
        }
        Map map = this.f54212;
        c6178.mo17812(map.size());
        for (Map.Entry entry : map.entrySet()) {
            c6178.m17800((String) entry.getKey());
            Object value = entry.getValue();
            if (value instanceof AbstractC2805) {
                c6178.writeByte(0);
                ((AbstractC2805) value).mo9279(c6178);
            } else if (value instanceof String) {
                c6178.writeByte(1);
                c6178.m17800((String) value);
            } else if (value instanceof C0109) {
                c6178.writeByte(2);
                ((C0109) value).m1219(c6178);
            } else {
                throw new RuntimeException();
            }
        }
        List list2 = this.f54200;
        if (list2 == null) {
            c6178.mo17788((short) -1);
        } else {
            c6178.mo17788((short) list2.size());
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                c6178.m17800((String) it4.next());
            }
        }
        c6178.m17780();
    }

    public C16800(C20348 c20348) throws IOException {
        super(null);
        this.f54196 = new C17941();
        this.f54197 = new ArrayList();
        this.f54203 = new ArrayList();
        this.f54208 = null;
        this.f54204 = null;
        this.f54206 = C9341.m24623();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        this.f54199 = C4681.unmodifiableSet(linkedHashSet);
        this.f54198 = C4681.unmodifiableList(arrayList);
        this.f54212 = C4681.unmodifiableMap(map);
        C17364.m40796(c20348, 20224);
        c20348.readInt();
        this.f54209 = c20348.m46758();
        int iM46749 = c20348.m46749();
        for (int i = 0; i < iM46749; i++) {
            linkedHashSet.add(c20348.m46758());
        }
        this.f54211 = c20348.m46753();
        int iM467410 = c20348.m46749();
        this.f54203.ensureCapacity(iM467410);
        for (int i2 = 0; i2 < iM467410; i2++) {
            byte b = c20348.readByte();
            if (b == 0) {
                this.f54203.add(new C14167(c20348.m46758(), c20348.m46753(), c20348.m46753()));
            } else {
                if (b != 1) {
                    throw new RuntimeException("Unknown comment type");
                }
                this.f54203.add(new C4628(c20348.m46758(), c20348.m46758(), c20348.m46753(), c20348.m46753()));
            }
        }
        this.f54208 = C9341.m24621(c20348.m46742());
        this.f54204 = C9341.m24614(c20348.m46742());
        int iM467411 = c20348.m46749();
        for (int i3 = 0; i3 < iM467411; i3++) {
            this.f54196.m41882(c20348.m46758(), C11974.m30033(c20348));
        }
        int iM467412 = c20348.m46749();
        this.f54197.ensureCapacity(iM467412);
        for (int i4 = 0; i4 < iM467412; i4++) {
            this.f54197.add(new C25006(C9341.m24595(c20348.m46749(), c20348.m46758()), C11974.m30033(c20348)));
        }
        int iM467413 = c20348.m46749();
        for (int i5 = 0; i5 < iM467413; i5++) {
            arrayList.add(AbstractC2805.m9274(this, c20348));
        }
        int iM467414 = c20348.m46749();
        for (int i6 = 0; i6 < iM467414; i6++) {
            String strM46758 = c20348.m46758();
            byte b2 = c20348.readByte();
            if (b2 == 0) {
                map.put(strM46758, AbstractC2805.m9274(this, c20348));
            } else if (b2 == 1) {
                map.put(strM46758, c20348.m46758());
            } else {
                if (b2 != 2) {
                    throw new IOException(C13645.m33382(b2, "Unknown syntax definition type: "));
                }
                map.put(strM46758, C0109.m1216(c20348));
            }
        }
        short s = c20348.readShort();
        if (s < 0) {
            this.f54200 = null;
            return;
        }
        this.f54200 = new ArrayList(s);
        for (int i7 = 0; i7 < s; i7++) {
            this.f54200.add(c20348.m46758());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16800(C3777 c3777) {
        Iterator it;
        ArrayList arrayList;
        Class<C14963> cls;
        Class<C17947> cls2;
        ArrayList arrayList2;
        Class<C21435> cls3;
        Class<C17947> cls4;
        C11974 c11974M30032;
        super(null);
        ArrayList arrayList3 = null;
        this.f54196 = new C17941();
        this.f54197 = new ArrayList();
        this.f54203 = new ArrayList();
        this.f54208 = null;
        this.f54204 = null;
        this.f54206 = C9341.m24623();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList<AbstractC2805> arrayList4 = new ArrayList();
        HashMap map = new HashMap();
        this.f54199 = C4681.unmodifiableSet(linkedHashSet);
        this.f54198 = C4681.unmodifiableList(arrayList4);
        this.f54212 = C4681.unmodifiableMap(map);
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = c3777.m21803(C20931.class).iterator();
        int i = 0;
        boolean zM39674 = false;
        while (true) {
            Class<C14963> cls5 = C14963.class;
            Class<C17947> cls6 = C17947.class;
            if (!it2.hasNext()) {
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    C20931 c20931 = (C20931) it3.next();
                    C17947 c17947 = (C17947) c20931.m21805(cls6, 0);
                    if (c17947 != null) {
                        C23915 c23915 = (C23915) c17947.m21805(C23915.class, 0);
                        C16455 c16455 = (C16455) c17947.m21805(C16455.class, 0);
                        C8997 c8997 = (C8997) c17947.m21805(C8997.class, 0);
                        C1145 c1145 = (C1145) c17947.m21805(C1145.class, 0);
                        String strM39672 = m39672(c23915.m21804(46, 0));
                        String strM39673 = c16455 == null ? null : m39672(c16455.m21804(46, 0));
                        boolean z = c8997 == null || m39674(c8997.m21804(48, 0));
                        boolean z2 = c1145 == null || m39674(c1145.m21804(48, 0));
                        C13466 c13466 = new C13466(this);
                        if (strM39673 == null) {
                            this.f54203.add(new C14167(strM39672, z, zM39674));
                            if (z2) {
                                c13466.m33114(C9341.m24595(zM39674 ? 2 : 0, C14483.m34972(C17370.m40798(strM39672), ".*")));
                            }
                            it = it3;
                        } else {
                            it = it3;
                            this.f54203.add(new C4628(strM39672, strM39673, z, zM39674));
                            if (z2) {
                                c13466.m33114(C9341.m24595(zM39674 ? 2 : 0, C3188.m10404("(?s)", C17370.m40798(strM39672), ".*?(", C17370.m40798(strM39673), "|$)")));
                            }
                        }
                        if (z2) {
                            c13466.m33113(C16449.m39003(0, "comment"));
                            arrayList4.add(c13466);
                        }
                    } else {
                        it = it3;
                        C14963 c14963 = (C14963) c20931.m21805(cls5, 0);
                        Class<C21435> cls7 = C21435.class;
                        if (c14963 != null) {
                            Iterator it4 = c14963.m21803(C4523.class).iterator();
                            while (it4.hasNext()) {
                                C4523 c4523 = (C4523) it4.next();
                                String strM39674 = m39672(c4523.m21804(46, 0));
                                if (map.containsKey(strM39674)) {
                                    throw new RuntimeException(C25272.m56409("Duplicate defines: ", strM39674));
                                }
                                Iterator it5 = it4;
                                C18451 c18451 = (C18451) c4523.m21805(C18451.class, 0);
                                Class<C14963> cls8 = cls5;
                                C2286 c2286 = (C2286) c4523.m21805(C2286.class, 0);
                                List listM21803 = c4523.m21803(C25165.class);
                                if (c18451 != null) {
                                    map.put(strM39674, m39664(this, c18451.m21803(cls7)));
                                    arrayList2 = arrayList3;
                                    cls3 = cls7;
                                    cls4 = cls6;
                                } else if (c2286 != null) {
                                    List listM21804 = c2286.m21803(C6015.class);
                                    ArrayList arrayList6 = new ArrayList(listM21804.size());
                                    cls4 = cls6;
                                    ArrayList arrayList7 = new ArrayList(listM21804.size());
                                    Iterator it6 = listM21804.iterator();
                                    while (it6.hasNext()) {
                                        C6015 c6015 = (C6015) it6.next();
                                        Iterator it7 = it6;
                                        ArrayList arrayList8 = arrayList3;
                                        C11980 c11980 = (C11980) c6015.m21805(C11980.class, 0);
                                        Class<C21435> cls9 = cls7;
                                        InterfaceC1484 interfaceC1484M21804 = c11980.m21804(46, 0);
                                        if (interfaceC1484M21804 == null) {
                                            interfaceC1484M21804 = c11980.m21804(45, 0);
                                        }
                                        arrayList6.add(m39672(interfaceC1484M21804));
                                        arrayList7.add(m39672(c6015.m21804(46, 0)));
                                        it6 = it7;
                                        arrayList3 = arrayList8;
                                        cls7 = cls9;
                                    }
                                    arrayList2 = arrayList3;
                                    cls3 = cls7;
                                    try {
                                        map.put(strM39674, C0109.m1215(arrayList6, arrayList7));
                                    } catch (IllegalArgumentException e) {
                                        Point pointM39663 = m39663(c2286);
                                        C10833 c10833 = new C10833(null, pointM39663.x, pointM39663.y, e.getMessage());
                                        c10833.initCause((Throwable) e);
                                        throw c10833;
                                    }
                                } else {
                                    arrayList2 = arrayList3;
                                    cls3 = cls7;
                                    cls4 = cls6;
                                    if (listM21803 == null) {
                                        throw new RuntimeException();
                                    }
                                    if (listM21803.isEmpty()) {
                                        throw new RuntimeException("[Define " + c4523.m21804(46, 0).getText() + "]: Matchers cannot be empty");
                                    }
                                    if (listM21803.size() == 1) {
                                        AbstractC2805 abstractC2805M39668 = m39668(this, (C25165) listM21803.get(0), zM39674);
                                        m39671(abstractC2805M39668, strM39674);
                                        map.put(strM39674, abstractC2805M39668);
                                    } else {
                                        C22022 c22022 = new C22022(this);
                                        ArrayList arrayList9 = new ArrayList();
                                        Iterator it8 = listM21803.iterator();
                                        int i2 = 1;
                                        while (it8.hasNext()) {
                                            AbstractC2805 abstractC2805M39669 = m39668(c22022, (C25165) it8.next(), zM39674);
                                            StringBuilder sbM10405 = C3188.m10405(strM39674, "[");
                                            sbM10405.append(i2);
                                            sbM10405.append("]");
                                            m39671(abstractC2805M39669, sbM10405.toString());
                                            arrayList9.add(abstractC2805M39669);
                                            i2++;
                                        }
                                        c22022.m49806(arrayList9);
                                        map.put(strM39674, c22022);
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
                            C12726 c12726 = (C12726) c20931.m21805(C12726.class, 0);
                            if (c12726 != null) {
                                Iterator it9 = c12726.m21803(C25165.class).iterator();
                                while (it9.hasNext()) {
                                    arrayList4.add(m39668(this, (C25165) it9.next(), zM39674));
                                }
                            } else {
                                C14217 c14217 = (C14217) c20931.m21805(C14217.class, 0);
                                if (c14217 == null) {
                                    throw new RuntimeException(c20931.getText());
                                }
                                AbstractC2805 abstractC2805 = this.f9223;
                                List listM21805 = ((C18451) ((C5027) c14217.m21805(C5027.class, 0)).m21805(C18451.class, 0)).m21803(cls7);
                                try {
                                    this.f54197.add(new C25006(C9341.m24595(zM39674 ? 2 : 0, m39664(abstractC2805, listM21805)), m39679(C17941.m41877(m39672(((C0552) c14217.m21805(C0552.class, 0)).m21804(46, 0))))));
                                } catch (PatternSyntaxException e2) {
                                    throw new RuntimeException(m39666(((C7998) listM21805.get(0)).f26549) + " " + e2.getMessage());
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
                this.f54200 = arrayList3;
                mo9280(new C9516());
                ArrayList arrayList10 = new ArrayList();
                for (AbstractC2805 abstractC2806 : arrayList4) {
                    if (abstractC2806 instanceof C15308) {
                        arrayList10.addAll(m39667(abstractC2806, new HashSet()));
                    } else {
                        arrayList10.add(abstractC2806);
                    }
                }
                arrayList4.clear();
                arrayList4.addAll(arrayList10);
                return;
            }
            C20931 c20932 = (C20931) it2.next();
            C15467 c15467 = (C15467) c20932.m21805(C15467.class, i);
            if (c15467 != null) {
                List listM21807 = ((C14721) c15467.m21805(C14721.class, i)).m21807(46);
                this.f54209 = m39672((InterfaceC1484) listM21807.get(i));
                for (int i3 = 1; i3 < listM21807.size(); i3++) {
                    linkedHashSet.add(m39672((InterfaceC1484) listM21807.get(i3)));
                }
            } else {
                C10488 c10488 = (C10488) c20932.m21805(C10488.class, i);
                if (c10488 != null) {
                    this.f54211 = m39674(c10488.m21804(48, i));
                } else {
                    C6761 c6761 = (C6761) c20932.m21805(C6761.class, i);
                    if (c6761 != null) {
                        for (C24661 c24661 : c6761.m21803(C24661.class)) {
                            List listM21808 = c24661.m21807(46);
                            List listM21809 = c24661.m21807(49);
                            InterfaceC1484 interfaceC1484M21805 = c24661.m21804(51, i);
                            String strM39675 = m39672((InterfaceC1484) listM21808.get(i));
                            if (strM39675.startsWith("!!")) {
                                throw new RuntimeException("Illegal style name: " + listM21809);
                            }
                            if (listM21808.size() == 2) {
                                c11974M30032 = m39679(C17941.m41877(m39672((InterfaceC1484) listM21808.get(1))));
                                if (interfaceC1484M21805 != null) {
                                    c11974M30032 = c11974M30032.m30036(m39662(interfaceC1484M21805));
                                }
                            } else if (listM21809.size() == 2) {
                                int[] iArr = new int[2];
                                m39670(c24661.m21804(49, 0).getText(), iArr);
                                int i4 = iArr[0];
                                int i5 = iArr[1];
                                m39670(c24661.m21804(49, 1).getText(), iArr);
                                c11974M30032 = C11974.m30032(null, i4, i5, iArr[0], iArr[1], m39662(c24661.m21804(51, 0)));
                            } else {
                                c11974M30032 = C11974.m30032(null, 1447446, 1447446, 1447446, 1447446, m39662(interfaceC1484M21805));
                            }
                            this.f54196.m41882(strM39675, c11974M30032);
                            i = 0;
                        }
                    } else {
                        C25407 c25407 = (C25407) c20932.m21805(C25407.class, 0);
                        if (c25407 != null) {
                            this.f54208 = C9341.m24621(c25407.m21804(50, 0).getText());
                        } else {
                            C17201 c17201 = (C17201) c20932.m21805(C17201.class, 0);
                            if (c17201 != null) {
                                this.f54204 = C9341.m24614(c17201.m21804(50, 0).getText());
                            } else {
                                C9347 c9347 = (C9347) c20932.m21805(C9347.class, 0);
                                if (c9347 != null) {
                                    List<InterfaceC1484> listM218010 = c9347.m21807(46);
                                    ArrayList arrayList11 = new ArrayList(listM218010.size());
                                    for (InterfaceC1484 interfaceC1484 : listM218010) {
                                        String strM39676 = m39672(interfaceC1484);
                                        if (strM39676.length() != 2 || strM39676.charAt(0) == strM39676.charAt(1)) {
                                            throw new RuntimeException(m39666(interfaceC1484.mo5285()) + " Illegal bracket pair " + interfaceC1484.getText());
                                        }
                                        arrayList11.add(strM39676);
                                    }
                                    arrayList3 = arrayList11;
                                } else {
                                    C9742 c9742 = (C9742) c20932.m21805(C9742.class, 0);
                                    if (c9742 != null) {
                                        zM39674 = m39674(c9742.m21804(48, 0));
                                    } else if (((C17947) c20932.m21805(cls6, 0)) != null) {
                                        arrayList5.add(c20932);
                                    } else if (((C14963) c20932.m21805(cls5, 0)) != null) {
                                        arrayList5.add(c20932);
                                    } else if (((C12726) c20932.m21805(C12726.class, 0)) != null) {
                                        arrayList5.add(c20932);
                                    } else {
                                        if (((C14217) c20932.m21805(C14217.class, 0)) == null) {
                                            throw new RuntimeException(c20932.getText());
                                        }
                                        arrayList5.add(c20932);
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
    public static Point m39663(C7998 c7998) {
        InterfaceC8743 interfaceC8743 = c7998.f26549;
        return new Point(interfaceC8743.getLine(), interfaceC8743.mo23437());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private List m39667(AbstractC2805 abstractC2805, HashSet hashSet) {
        if (abstractC2805 instanceof C15308) {
            C15308 c15308 = (C15308) abstractC2805;
            if (hashSet.add(c15308.m36764())) {
                AbstractC2805 abstractC2805M39690 = m39690(c15308.m36764());
                if (abstractC2805M39690 instanceof C22022) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((C22022) abstractC2805M39690).m49805().iterator();
                    while (it.hasNext()) {
                        arrayList.addAll(m39667((AbstractC2805) it.next(), new HashSet(hashSet)));
                    }
                    return arrayList;
                }
                return m39667(abstractC2805M39690, new HashSet(hashSet));
            }
        }
        if (abstractC2805.f9223 != this) {
            return Collections.singletonList(abstractC2805.mo9275(this));
        }
        return Collections.singletonList(abstractC2805);
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9280(C9516 c9516) {
        Iterator it = this.f54198.iterator();
        while (it.hasNext()) {
            ((AbstractC2805) it.next()).mo9280(c9516);
        }
        for (Map.Entry entry : this.f54212.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof AbstractC2805) {
                AbstractC2805 abstractC2805 = (AbstractC2805) value;
                if (c9516.f30821.add((String) entry.getKey())) {
                    abstractC2805.mo9280(c9516);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39671(AbstractC2805 abstractC2805, String str) {
        if (abstractC2805 instanceof C13466) {
            C13466 c13466 = (C13466) abstractC2805;
            if (c13466.m33123() == null) {
                c13466.m33111(str);
                return;
            }
            return;
        }
        if (abstractC2805 instanceof C6009) {
            C6009 c6009 = (C6009) abstractC2805;
            if (c6009.m17469() == null) {
                c6009.m17477(str);
                return;
            }
            return;
        }
        if (abstractC2805 instanceof C22417) {
            C22417 c22417 = (C22417) abstractC2805;
            if (c22417.m50560() == null) {
                c22417.m50558(str);
                return;
            }
            return;
        }
        if (abstractC2805 instanceof C19784) {
            C19784 c19784 = (C19784) abstractC2805;
            if (c19784.m45570() == null) {
                c19784.m45563(str);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m39664(AbstractC2805 abstractC2805, List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C21435 c21435 = (C21435) it.next();
            if (((C19197) c21435.m21805(C19197.class, 0)) != null) {
                Point pointM39663 = m39663(c21435);
                throw new C10833(null, pointM39663.x, pointM39663.y, "var() is not allowed in regex definitions or static match fields");
            }
            sb.append(m39665(abstractC2805, c21435));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39670(String str, int[] iArr) {
        boolean z;
        int iIndexOf = str.indexOf(35, 4);
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf(36, 4);
            z = true;
        } else {
            z = false;
        }
        if (iIndexOf == -1) {
            iArr[0] = m39675(str);
            iArr[1] = 1447446;
            return;
        }
        iArr[0] = m39675(str.substring(0, iIndexOf));
        if (z) {
            int iM39675 = m39675("#" + str.substring(iIndexOf + 1));
            iArr[1] = iM39675;
            iArr[1] = (iM39675 & 16777215) | 100663296;
            return;
        }
        iArr[1] = m39675(str.substring(iIndexOf));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m39675(String str) {
        if (str.equalsIgnoreCase("#NULL")) {
            return 1447446;
        }
        C5765 c5765 = f54195;
        synchronized (c5765) {
            if (!C11730.m29454(str, c5765)) {
                return -65536;
            }
            return c5765.f19813;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m39662(InterfaceC1484 interfaceC1484) {
        int i = 0;
        if (interfaceC1484 != null) {
            String text = interfaceC1484.getText();
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m39672(InterfaceC1484 interfaceC1484) {
        return C15830.f51499.m10291(C1402.m5124(1, 1, interfaceC1484.getText()));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m39674(InterfaceC1484 interfaceC1484) {
        return interfaceC1484.getText().equals("true");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m39666(InterfaceC8743 interfaceC8743) {
        int line = interfaceC8743.getLine();
        int iMo23437 = interfaceC8743.mo23437();
        StringBuilder sb = new StringBuilder();
        if (iMo23437 > 0) {
            sb.append('[');
            sb.append(line);
            sb.append(':');
            sb.append(iMo23437 + 1);
            sb.append(']');
        } else {
            sb.append("[line ");
            sb.append(line);
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C11974 m39685() {
        C11974 c11974 = this.f54201;
        if (c11974 != null) {
            return c11974;
        }
        C11974 c11974M39679 = m39679(C17941.f58776);
        this.f54201 = c11974M39679;
        return c11974M39679;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11974 m39679(int i) {
        boolean z = i < 0;
        if (z) {
            i = -i;
        }
        C11974 c11974M41879 = this.f54196.m41879(i);
        if (c11974M41879 == null) {
            int i2 = C9341.f30354;
            C14562 c14562 = this.f54206;
            C11974 c11974M418710 = c14562.f45882.m41879(i);
            if (c11974M418710 == null) {
                c11974M418710 = c14562.f45884;
            }
            c11974M41879 = c11974M418710;
        }
        return z ? c11974M41879.m30043() : c11974M41879;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C14562 m39684() {
        return this.f54206;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m39683() {
        return this.f54209;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Set m39687() {
        return this.f54199;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m39676() {
        return C4681.unmodifiableList(this.f54203);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List m39682() {
        return this.f54200;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC0855 m39693() {
        InterfaceC0855 interfaceC0855 = this.f54208;
        return (interfaceC0855 == null && "MT-Syntax".equals(this.f54209)) ? InterfaceC0855.f3221 : interfaceC0855;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8313 m39689() {
        return this.f54204;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList m39681() {
        return this.f54197;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m39686() {
        return this.f54211;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        mo9277(sb, 0);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC2805 m39690(String str) {
        Object obj = this.f54212.get(str);
        if (obj == null) {
            throw new RuntimeException(C25272.m56409("Definition not found: ", str));
        }
        if (obj instanceof AbstractC2805) {
            return (AbstractC2805) obj;
        }
        throw new RuntimeException(C25272.m56409("Not a matcher definition: ", str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11974 m39669(C5269 c5269) {
        int[] iArr = new int[2];
        m39670(c5269.m21804(49, 0).getText(), iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        m39670(c5269.m21804(49, 1).getText(), iArr);
        return C11974.m30032(null, i, i2, iArr[0], iArr[1], m39662(c5269.m21804(51, 0)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0109 m39678(String str) {
        Object obj = this.f54212.get(str);
        if (obj == null) {
            throw new IllegalArgumentException(C25272.m56409("Definition not found: ", str));
        }
        if (obj instanceof C0109) {
            return (C0109) obj;
        }
        throw new IllegalArgumentException(C25272.m56409("Not a childrenSyntax mapping definition: ", str));
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC2805 mo9275(AbstractC2805 abstractC2805) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9277(StringBuilder sb, int i) {
        sb.append("[Language]\n");
        sb.append("Name: ");
        sb.append(this.f54209);
        sb.append('\n');
        sb.append("Suffixes: ");
        sb.append(this.f54199);
        sb.append('\n');
        sb.append("Comment: ");
        sb.append(this.f54203);
        sb.append('\n');
        Map map = this.f54212;
        if (!map.isEmpty()) {
            sb.append("Defines: ");
            sb.append('\n');
            for (Map.Entry entry : map.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(": ");
                Object value = entry.getValue();
                if (value instanceof AbstractC2805) {
                    ((AbstractC2805) value).mo9277(sb, 0);
                } else if (value instanceof C0109) {
                    ((C0109) value).m1217(sb);
                } else {
                    sb.append(value);
                    sb.append("\n");
                }
            }
        }
        sb.append("Contains: ");
        sb.append('\n');
        Iterator it = this.f54198.iterator();
        while (it.hasNext()) {
            ((AbstractC2805) it.next()).mo9277(sb, 0);
        }
    }

    @Override // l.AbstractC2805
    /* JADX INFO: renamed from: ۙ */
    public final void mo9278(ArrayList arrayList) {
        Iterator it = this.f54198.iterator();
        while (it.hasNext()) {
            ((AbstractC2805) it.next()).mo9278(arrayList);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39691() {
        mo9278(new ArrayList());
        for (Object obj : this.f54212.values()) {
            if (obj instanceof AbstractC2805) {
                ((AbstractC2805) obj).mo9278(new ArrayList());
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m39688() {
        return this.f54198;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39680(Callable callable) {
        this.f54202 = callable;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m39695() {
        return (String) this.f54202.call();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39692(int i) {
        if (this.f54205 && this.f54207 != i) {
            throw new IllegalStateException("Language semantic hash is already initialized");
        }
        this.f54207 = i;
        this.f54205 = true;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m39694() {
        this.f54210 = true;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m39677() {
        if (this.f54210) {
            throw new IllegalArgumentException("Cached language requires recompilation");
        }
    }

    public final int hashCode() {
        return this.f54207;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [l.ۖܽᩴ, l.ᩴۧᩴ] */
    /* JADX WARN: Type inference failed for: r9v1, types: [l.ۖܽᩴ, l.ܳۧᩴ] */
    /* JADX WARN: Type inference failed for: r9v2, types: [l.ۖܽᩴ, l.ܰ֫ᩴ] */
    /* JADX WARN: Type inference failed for: r9v3, types: [l.ۖܽᩴ, l.᩷᩻ᩴ] */
    /* JADX WARN: Type inference failed for: r9v4, types: [l.ۖܽᩴ, l.ۚ᩻ᩴ] */
    /* JADX WARN: Type inference failed for: r9v5, types: [l.ۖܽᩴ] */
    /* JADX WARN: Type inference failed for: r9v6, types: [l.ۖܽᩴ, l.۫᩻ᩴ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC2805 m39668(AbstractC2805 abstractC2805, C25165 c25165, boolean z) {
        ?? c19784;
        Class<C0552> cls;
        boolean z2;
        boolean z3;
        Iterator it;
        C7567 c7567M20664;
        C16959 c16959 = (C16959) c25165.m21805(C16959.class, 0);
        if (c16959 != null) {
            c19784 = new C13466(abstractC2805);
            C10992 c10992 = (C10992) c16959.m21805(C10992.class, 0);
            if (c10992 != null) {
                c19784.m33111(m39672(c10992.m21804(46, 0)));
            }
            List<C21435> listM21803 = ((C18451) ((C5027) c16959.m21805(C5027.class, 0)).m21805(C18451.class, 0)).m21803(C21435.class);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            StringBuilder sb = new StringBuilder();
            for (C21435 c21435 : listM21803) {
                C19197 c19197 = (C19197) c21435.m21805(C19197.class, 0);
                if (c19197 == null) {
                    sb.append(m39665(abstractC2805, c21435));
                } else {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                    arrayList2.add(m39672(c19197.m21804(46, 0)));
                }
            }
            arrayList.add(sb.toString());
            try {
                C15703 c15703M37484 = C15703.m37484(arrayList, arrayList2, z ? 2 : 0);
                c19784.m33112(c15703M37484);
                int iM37496 = c15703M37484.m37496();
                C20689 c20689 = (C20689) c16959.m21805(C20689.class, 0);
                if (c20689 != null) {
                    c19784.m33115(m39674(c20689.m21804(48, 0)));
                }
                ArrayList arrayList3 = new ArrayList();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                for (C22423 c22423 : c16959.m21803(C22423.class)) {
                    int i = Integer.parseInt(c22423.m21804(44, 0).getText());
                    String strM39672 = m39672(c22423.m21804(46, 0));
                    if (i > iM37496) {
                        Point pointM39663 = m39663(c22423);
                        throw new C10833(null, pointM39663.x, pointM39663.y, "No start capture group " + i + " for exported variable \"" + strM39672 + "\"");
                    }
                    if (!hashSet.add(Integer.valueOf(i))) {
                        Point pointM39664 = m39663(c22423);
                        throw new C10833(null, pointM39664.x, pointM39664.y, C14442.m34864(i, "Capture group ", " is exported more than once"));
                    }
                    if (!hashSet2.add(strM39672)) {
                        Point pointM39665 = m39663(c22423);
                        throw new C10833(null, pointM39665.x, pointM39665.y, C25272.m56409("Duplicate exported variable: ", strM39672));
                    }
                    arrayList3.add(new C20992(i, strM39672));
                }
                c19784.m33122(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i2 = 0;
                for (C12484 c12484 : c16959.m21803(C12484.class)) {
                    int i3 = Integer.parseInt(c12484.m21804(44, 0).getText());
                    if (i3 > iM37496) {
                        String text = c12484.getText();
                        int iIndexOf = text.indexOf(58);
                        if (iIndexOf >= 0 && iIndexOf < 10) {
                            text = "\n".concat(text);
                        }
                        throw new RuntimeException(m39666(c12484.f26549) + " No group " + i3 + ": " + text);
                    }
                    InterfaceC1484 interfaceC1484M21804 = c12484.m21804(46, 0);
                    if (interfaceC1484M21804 != null) {
                        String strM39673 = m39672(interfaceC1484M21804);
                        if (i3 == 0) {
                            arrayList4.add(i2, C16449.m39003(i3, strM39673));
                            i2++;
                        } else {
                            arrayList4.add(C16449.m39003(i3, strM39673));
                        }
                    } else {
                        arrayList5.add(new C8771(i3, m39668(c19784, (C25165) c12484.m21805(C25165.class, 0), z)));
                    }
                }
                c19784.m33117(arrayList4);
                c19784.m33124(arrayList5);
            } catch (IllegalArgumentException e) {
                Point pointM39666 = m39663((C7998) listM21803.get(0));
                C10833 c10833 = new C10833(null, pointM39666.x, pointM39666.y, e.getMessage());
                c10833.initCause((Throwable) e);
                throw c10833;
            }
        } else {
            C23673 c23673 = (C23673) c25165.m21805(C23673.class, 0);
            Class<C0552> cls2 = C0552.class;
            if (c23673 != null) {
                c19784 = new C6009(abstractC2805);
                C10992 c10993 = (C10992) c23673.m21805(C10992.class, 0);
                if (c10993 != null) {
                    c19784.m17477(m39672(c10993.m21804(46, 0)));
                }
                Iterator it2 = c23673.m21803(C3535.class).iterator();
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                while (it2.hasNext()) {
                    C3535 c3535 = (C3535) it2.next();
                    C6519 c6519 = (C6519) c3535.m21805(C6519.class, 0);
                    if (c6519 != null) {
                        c19784.m17468(m39668(c19784, (C25165) c6519.m21805(C25165.class, 0), z));
                    } else {
                        C21677 c21677 = (C21677) c3535.m21805(C21677.class, 0);
                        if (c21677 != null) {
                            c19784.m17478(m39668(c19784, (C25165) c21677.m21805(C25165.class, 0), z));
                        } else {
                            C18693 c18693 = (C18693) c3535.m21805(C18693.class, 0);
                            if (c18693 != null) {
                                c19784.m17460(Integer.parseInt(c18693.m21804(44, 0).getText()));
                                if (z6) {
                                    throw new RuntimeException(C8947.m23910(new StringBuilder(), m39666(c18693.f26549), " <EndMatcher> and endPriority cannot be specified at the same time!"));
                                }
                                z9 = true;
                            } else {
                                C22181 c22181 = (C22181) c3535.m21805(C22181.class, 0);
                                if (c22181 != null) {
                                    c19784.m17464(m39674(c22181.m21804(48, 0)));
                                    z5 = true;
                                } else {
                                    C19943 c19943 = (C19943) c3535.m21805(C19943.class, 0);
                                    if (c19943 != null) {
                                        it = it2;
                                        c19784.m17479(m39674(c19943.m21804(48, 0)));
                                    } else {
                                        it = it2;
                                        C0552 c0552 = (C0552) c3535.m21805(cls2, 0);
                                        if (c0552 != null) {
                                            c19784.m17481(m39672(c0552.m21804(46, 0)));
                                        } else {
                                            C11234 c11234 = (C11234) c3535.m21805(C11234.class, 0);
                                            if (c11234 != null) {
                                                c19784.m17461(m39672(c11234.m21804(46, 0)));
                                            } else {
                                                C15709 c15709 = (C15709) c3535.m21805(C15709.class, 0);
                                                if (c15709 == null) {
                                                    cls = cls2;
                                                    z3 = z6;
                                                    z2 = z8;
                                                    C22927 c22927 = (C22927) c3535.m21805(C22927.class, 0);
                                                    if (c22927 == null) {
                                                        C24419 c24419 = (C24419) c3535.m21805(C24419.class, 0);
                                                        if (c24419 == null) {
                                                            throw new RuntimeException(c3535.getText());
                                                        }
                                                        if (z4) {
                                                            Point pointM39667 = m39663(c24419);
                                                            throw new C10833(null, pointM39667.x, pointM39667.y, "childrenSyntax and contains cannot be used together");
                                                        }
                                                        z6 = z3;
                                                        for (C4281 c4281 : c24419.m21803(C4281.class)) {
                                                            if (c4281.m21804(42, 0) == null) {
                                                                c19784.m17462(m39668(c19784, (C25165) c4281.m21805(C25165.class, 0), z), c4281.m21804(52, 0) != null);
                                                            } else {
                                                                if (z9) {
                                                                    throw new RuntimeException(C8947.m23910(new StringBuilder(), m39666(c4281.f26549), " <EndMatcher> and endPriority cannot be specified at the same time!"));
                                                                }
                                                                if (z6) {
                                                                    throw new RuntimeException(C8947.m23910(new StringBuilder(), m39666(c4281.f26549), " Duplicate <EndMatcher>!"));
                                                                }
                                                                c19784.m17460(((ArrayList) c19784.m17475()).size());
                                                                z6 = true;
                                                            }
                                                        }
                                                        z8 = true;
                                                        it2 = it;
                                                    } else {
                                                        if (z7) {
                                                            Point pointM39668 = m39663(c22927);
                                                            throw new C10833(null, pointM39668.x, pointM39668.y, "Duplicate missingStyle");
                                                        }
                                                        c19784.m17467(m39672(c22927.m21804(46, 0)));
                                                        z7 = true;
                                                    }
                                                } else {
                                                    if (z4) {
                                                        Point pointM39669 = m39663(c15709);
                                                        throw new C10833(null, pointM39669.x, pointM39669.y, "Duplicate childrenSyntax");
                                                    }
                                                    if (z8) {
                                                        Point pointM396610 = m39663(c15709);
                                                        throw new C10833(null, pointM396610.x, pointM396610.y, "childrenSyntax and contains cannot be used together");
                                                    }
                                                    C23169 c23169 = (C23169) c15709.m21805(C23169.class, 0);
                                                    if (c23169 == null) {
                                                        c7567M20664 = C7567.m20665(m39672(c15709.m21804(46, 0)));
                                                        cls = cls2;
                                                        z3 = z6;
                                                        z2 = z8;
                                                    } else {
                                                        int i4 = Integer.parseInt(c23169.m21804(44, 0).getText());
                                                        C9742 c9742 = (C9742) c15709.m21805(C9742.class, 0);
                                                        boolean zM39674 = c9742 == null ? z : m39674(c9742.m21804(48, 0));
                                                        List listM21804 = c15709.m21803(C20185.class);
                                                        List listM21805 = c15709.m21803(C13472.class);
                                                        ArrayList arrayList6 = new ArrayList(listM21805.size());
                                                        HashSet hashSet3 = new HashSet();
                                                        Iterator it3 = listM21805.iterator();
                                                        while (it3.hasNext()) {
                                                            Iterator it4 = it3;
                                                            C13472 c13472 = (C13472) it3.next();
                                                            boolean z10 = z6;
                                                            String strM39674 = m39672(c13472.m21804(46, 0));
                                                            if (!hashSet3.add(strM39674)) {
                                                                Point pointM396611 = m39663(c13472);
                                                                throw new C10833(null, pointM396611.x, pointM396611.y, C25272.m56409("Duplicate childrenSyntax include: ", strM39674));
                                                            }
                                                            arrayList6.add(strM39674);
                                                            it3 = it4;
                                                            z6 = z10;
                                                        }
                                                        z3 = z6;
                                                        ArrayList arrayList7 = new ArrayList(listM21804.size());
                                                        ArrayList arrayList8 = new ArrayList(listM21804.size());
                                                        HashSet hashSet4 = new HashSet();
                                                        Iterator it5 = listM21804.iterator();
                                                        boolean z11 = false;
                                                        String strM39675 = null;
                                                        while (it5.hasNext()) {
                                                            z8 = z8;
                                                            C20185 c20185 = (C20185) it5.next();
                                                            it5 = it5;
                                                            if (c20185.m21804(14, 0) == null) {
                                                                C11980 c11980 = (C11980) c20185.m21805(C11980.class, 0);
                                                                Class<C0552> cls3 = cls2;
                                                                InterfaceC1484 interfaceC1484M21805 = c11980.m21804(46, 0);
                                                                if (interfaceC1484M21805 == null) {
                                                                    interfaceC1484M21805 = c11980.m21804(45, 0);
                                                                }
                                                                String strM39676 = m39672(interfaceC1484M21805);
                                                                if (!hashSet4.add(C7567.m20663(strM39676, zM39674))) {
                                                                    Point pointM396612 = m39663(c20185);
                                                                    throw new C10833(null, pointM396612.x, pointM396612.y, C25272.m56409("Duplicate childrenSyntax selector: ", strM39676));
                                                                }
                                                                arrayList7.add(strM39676);
                                                                arrayList8.add(m39672(c20185.m21804(46, 0)));
                                                                cls2 = cls3;
                                                            } else {
                                                                if (z11) {
                                                                    Point pointM396613 = m39663(c20185);
                                                                    throw new C10833(null, pointM396613.x, pointM396613.y, "Duplicate childrenSyntax default");
                                                                }
                                                                strM39675 = m39672(c20185.m21804(46, 0));
                                                                z11 = true;
                                                            }
                                                        }
                                                        cls = cls2;
                                                        z2 = z8;
                                                        c7567M20664 = C7567.m20664(i4, zM39674, arrayList6, arrayList7, arrayList8, strM39675);
                                                    }
                                                    c19784.m17463(c7567M20664);
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
                    c19784.m17464(true);
                }
                c19784.m17476();
            } else {
                Class<C0552> cls4 = cls2;
                C16213 c16213 = (C16213) c25165.m21805(C16213.class, 0);
                if (c16213 != null) {
                    c19784 = new C22417(abstractC2805);
                    C10992 c10994 = (C10992) c16213.m21805(C10992.class, 0);
                    if (c10994 != null) {
                        c19784.m50558(m39672(c10994.m21804(46, 0)));
                    }
                    String strM39677 = m39672(((C13230) c16213.m21805(C13230.class, 0)).m21804(46, 0));
                    String strM39678 = "";
                    String strM39679 = "";
                    for (C17705 c17705 : c16213.m21803(C17705.class)) {
                        C1540 c1540 = (C1540) c17705.m21805(C1540.class, 0);
                        if (c1540 != null) {
                            strM39678 = m39672(c1540.m21804(46, 0));
                        } else {
                            C0794 c0794 = (C0794) c17705.m21805(C0794.class, 0);
                            if (c0794 != null) {
                                strM39679 = m39672(c0794.m21804(46, 0));
                            } else {
                                Class<C0552> cls5 = cls4;
                                C0552 c0553 = (C0552) c17705.m21805(cls5, 0);
                                if (c0553 == null) {
                                    throw new RuntimeException(c17705.getText());
                                }
                                c19784.m50562(m39672(c0553.m21804(46, 0)));
                                cls4 = cls5;
                            }
                        }
                    }
                    c19784.m50559(new C5263(strM39677, strM39678, strM39679));
                } else {
                    C5773 c5773 = (C5773) c25165.m21805(C5773.class, 0);
                    if (c5773 != null) {
                        String text2 = ((C2636) c5773.m21805(C2636.class, 0)).m21804(50, 0).getText();
                        c19784 = new C14278(abstractC2805);
                        c19784.m34690(text2);
                    } else {
                        C11738 c11738 = (C11738) c25165.m21805(C11738.class, 0);
                        if (c11738 != null) {
                            String strM396710 = m39672(c11738.m21804(46, 0));
                            c19784 = new C15308(abstractC2805);
                            c19784.m36763(strM396710);
                        } else {
                            C2044 c2044 = (C2044) c25165.m21805(C2044.class, 0);
                            if (c2044 == null) {
                                throw new RuntimeException(c25165.getText());
                            }
                            c19784 = new C19784(abstractC2805);
                            C10992 c10995 = (C10992) c2044.m21805(C10992.class, 0);
                            if (c10995 != null) {
                                c19784.m45563(m39672(c10995.m21804(46, 0)));
                            }
                            c19784.m45565(((C19439) ((C8252) c2044.m21805(C8252.class, 0)).m21805(C19439.class, 0)).getText());
                            C0552 c0554 = (C0552) c2044.m21805(cls4, 0);
                            if (c0554 != null) {
                                c19784.m45568(m39672(c0554.m21804(46, 0)));
                            }
                            Iterator it6 = ((C12726) c2044.m21805(C12726.class, 0)).m21803(C25165.class).iterator();
                            while (it6.hasNext()) {
                                c19784.m45569(m39668(c19784, (C25165) it6.next(), z));
                            }
                        }
                    }
                }
            }
        }
        c19784.f9224 = m39663(c25165);
        return c19784;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m39665(AbstractC2805 abstractC2805, C21435 c21435) {
        int i;
        int i2;
        int i3 = 0;
        InterfaceC1484 interfaceC1484M21804 = c21435.m21804(46, 0);
        InterfaceC1484 interfaceC1484M21805 = c21435.m21804(47, 0);
        C7506 c7506 = (C7506) c21435.m21805(C7506.class, 0);
        C3031 c3031 = (C3031) c21435.m21805(C3031.class, 0);
        if (interfaceC1484M21804 != null) {
            return m39672(interfaceC1484M21804);
        }
        int i4 = 1;
        if (interfaceC1484M21805 != null) {
            String text = interfaceC1484M21805.getText();
            return text.substring(1, text.length() - 1).replace("\\/", "/");
        }
        if (c7506 == null) {
            if (c3031 == null) {
                throw new IllegalArgumentException("Expected a static regex fragment");
            }
            C16800 c16800Mo9276 = abstractC2805 == null ? null : abstractC2805.mo9276();
            if (c16800Mo9276 == null) {
                throw new RuntimeException("Include regex is not supported here!");
            }
            String strM39672 = m39672(c3031.m21804(46, 0));
            Object obj = c16800Mo9276.f54212.get(strM39672);
            if (obj == null) {
                throw new RuntimeException(C25272.m56409("Definition not found: ", strM39672));
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            throw new RuntimeException(C25272.m56409("Not a regex definition: ", strM39672));
        }
        HashSet<String> hashSet = new HashSet();
        Iterator it = c7506.m21807(46).iterator();
        while (it.hasNext()) {
            Collections.addAll(hashSet, m39672((InterfaceC1484) it.next()).split("\\s+"));
        }
        if (hashSet.isEmpty()) {
            return "";
        }
        C13071 c13071 = new C13071("Start", i3);
        C13071 c13072 = new C13071("End", i3);
        C13071 c13073 = new C13071("StartEnd", i3);
        C13071 c13074 = new C13071("None", i3);
        for (String str : hashSet) {
            if (!str.isEmpty()) {
                char cCharAt = str.charAt(i3);
                boolean z = cCharAt == '_' || Character.isLetterOrDigit(cCharAt);
                char cM50373 = C22313.m50373(i4, str);
                boolean z2 = cM50373 == '_' || Character.isLetterOrDigit(cM50373);
                ArrayList arrayList = new ArrayList(str.length() + i4);
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                boolean z3 = true;
                for (int i5 = 0; i5 < length; i5++) {
                    char cCharAt2 = str.charAt(i5);
                    if (i5 == 0) {
                        arrayList.add(C17370.m40798(String.valueOf(cCharAt2)));
                    } else {
                        boolean zIsLetterOrDigit = Character.isLetterOrDigit(cCharAt2);
                        if (zIsLetterOrDigit != z3) {
                            if (sb.length() > 0) {
                                arrayList.add(C17370.m40798(sb.toString()));
                                sb.setLength(0);
                            }
                            z3 = zIsLetterOrDigit;
                        }
                        sb.append(cCharAt2);
                    }
                }
                if (sb.length() > 0) {
                    arrayList.add(C17370.m40798(sb.toString()));
                }
                arrayList.add("");
                if (z && z2) {
                    c13073.m32551(arrayList, 0);
                } else if (z) {
                    c13071.m32551(arrayList, 0);
                } else if (z2) {
                    c13072.m32551(arrayList, 0);
                } else {
                    c13074.m32551(arrayList, 0);
                }
                i3 = 0;
                i4 = 1;
            }
        }
        C13071 c13075 = new C13071("Root", 0);
        ArrayList arrayList2 = new ArrayList(3);
        if (c13071.f41812.isEmpty()) {
            i = 0;
        } else {
            arrayList2.add("\\b");
            arrayList2.add(c13071.f41812.m16594());
            i = 0;
            c13075.m32551(arrayList2, 0);
            arrayList2.clear();
        }
        if (!c13072.f41812.isEmpty()) {
            arrayList2.add(c13072.f41812.m16594());
            arrayList2.add("\\b");
            c13075.m32551(arrayList2, i);
            arrayList2.clear();
        }
        if (c13073.f41812.isEmpty()) {
            i2 = 0;
        } else {
            arrayList2.add("\\b");
            arrayList2.add(c13073.f41812.m16594());
            arrayList2.add("\\b");
            i2 = 0;
            c13075.m32551(arrayList2, 0);
            arrayList2.clear();
        }
        if (!c13074.f41812.isEmpty()) {
            arrayList2.add(c13074.f41812.m16594());
            c13075.m32551(arrayList2, i2);
            arrayList2.clear();
        }
        ArrayList<C13071> arrayList3 = new ArrayList(c13075.f41812.values());
        Collections.sort(arrayList3);
        StringBuilder sb2 = new StringBuilder("(?:");
        boolean z4 = true;
        for (C13071 c13076 : arrayList3) {
            if (z4) {
                z4 = false;
            } else {
                sb2.append('|');
            }
            sb2.append(c13076.m32550());
        }
        sb2.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb2.toString();
    }
}
