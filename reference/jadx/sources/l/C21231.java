package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩶ۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29P0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21231 extends AbstractC4077 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f67753 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final long f67754;

    static {
        try {
            f67754 = C22832.m51527(AbstractC11272.class.getDeclaredField("ܰ"));
        } catch (Throwable unused) {
            throw new IllegalStateException("Unable to lookup extension field offset");
        }
    }

    @Override // l.AbstractC4077
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2101(InterfaceC18775 interfaceC18775) {
        return interfaceC18775 instanceof AbstractC11272;
    }

    @Override // l.AbstractC4077
    /* JADX INFO: renamed from: ۙ */
    public final C8551 mo2097(Object obj) {
        return (C8551) C22832.m51520(f67754, obj);
    }

    @Override // l.AbstractC4077
    /* JADX INFO: renamed from: ᩷ */
    public final C8551 mo2103(Object obj) {
        C8551 c8551Mo2097 = mo2097(obj);
        if (!c8551Mo2097.m22907()) {
            return c8551Mo2097;
        }
        C8551 c8551Clone = c8551Mo2097.clone();
        C22832.m51505(f67754, obj, c8551Clone);
        return c8551Clone;
    }

    @Override // l.AbstractC4077
    /* JADX INFO: renamed from: ۤ */
    public final void mo2102(Object obj) {
        mo2097(obj).m22896();
    }

    @Override // l.AbstractC4077
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2095(Object obj, InterfaceC12236 interfaceC12236, Object obj2, C24215 c24215, C8551 c8551, Object obj3, AbstractC3990 abstractC3990) {
        Object objValueOf;
        Object objM22897;
        ArrayList arrayList;
        ArrayList arrayList2;
        C3331 c3331 = (C3331) obj2;
        C7323 c7323 = c3331.f10901;
        InterfaceC21013 interfaceC21013 = c3331.f10900;
        int number = c7323.getNumber();
        if (c7323.mo8649() && c7323.mo8650()) {
            switch (C14517.f45668[c7323.mo8652().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    interfaceC12236.mo30558(arrayList);
                    arrayList2 = arrayList;
                    c8551.m22899((InterfaceC2585) c7323, (Object) arrayList2);
                    return obj3;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC12236.mo30567(arrayList);
                    arrayList2 = arrayList;
                    c8551.m22899((InterfaceC2585) c7323, (Object) arrayList2);
                    return obj3;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC12236.mo30565(arrayList);
                    arrayList2 = arrayList;
                    c8551.m22899((InterfaceC2585) c7323, (Object) arrayList2);
                    return obj3;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC12236.mo30541(arrayList);
                    arrayList2 = arrayList;
                    c8551.m22899((InterfaceC2585) c7323, (Object) arrayList2);
                    return obj3;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC12236.mo30552(arrayList);
                    arrayList2 = arrayList;
                    c8551.m22899((InterfaceC2585) c7323, (Object) arrayList2);
                    return obj3;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC12236.mo30538(arrayList);
                    arrayList2 = arrayList;
                    c8551.m22899((InterfaceC2585) c7323, (Object) arrayList2);
                    return obj3;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC12236.mo30554(arrayList);
                    arrayList2 = arrayList;
                    c8551.m22899((InterfaceC2585) c7323, (Object) arrayList2);
                    return obj3;
                case 8:
                    arrayList = new ArrayList();
                    interfaceC12236.mo30548(arrayList);
                    arrayList2 = arrayList;
                    c8551.m22899((InterfaceC2585) c7323, (Object) arrayList2);
                    return obj3;
                case 9:
                    arrayList = new ArrayList();
                    interfaceC12236.mo30543(arrayList);
                    arrayList2 = arrayList;
                    c8551.m22899((InterfaceC2585) c7323, (Object) arrayList2);
                    return obj3;
                case 10:
                    arrayList = new ArrayList();
                    interfaceC12236.mo30535(arrayList);
                    arrayList2 = arrayList;
                    c8551.m22899((InterfaceC2585) c7323, (Object) arrayList2);
                    return obj3;
                case 11:
                    arrayList = new ArrayList();
                    interfaceC12236.mo30569(arrayList);
                    arrayList2 = arrayList;
                    c8551.m22899((InterfaceC2585) c7323, (Object) arrayList2);
                    return obj3;
                case 12:
                    arrayList = new ArrayList();
                    interfaceC12236.mo30529(arrayList);
                    arrayList2 = arrayList;
                    c8551.m22899((InterfaceC2585) c7323, (Object) arrayList2);
                    return obj3;
                case 13:
                    arrayList = new ArrayList();
                    interfaceC12236.mo30561(arrayList);
                    arrayList2 = arrayList;
                    c8551.m22899((InterfaceC2585) c7323, (Object) arrayList2);
                    return obj3;
                case 14:
                    ArrayList arrayList3 = new ArrayList();
                    interfaceC12236.mo30556(arrayList3);
                    arrayList2 = new ArrayList();
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Integer) it.next()).intValue();
                        C1357 c1357M21963 = c7323.m20092().m21963(iIntValue);
                        if (c1357M21963 != null) {
                            arrayList2.add(c1357M21963);
                        } else {
                            obj3 = C18949.m43979(obj, number, iIntValue, obj3, abstractC3990);
                        }
                    }
                    c8551.m22899((InterfaceC2585) c7323, (Object) arrayList2);
                    return obj3;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + c7323.mo8652());
            }
        }
        if (c7323.mo8652() == EnumC3440.f11211) {
            int iMo30528 = interfaceC12236.mo30528();
            objValueOf = c7323.m20092().m21963(iMo30528);
            if (objValueOf == null) {
                return C18949.m43979(obj, number, iMo30528, obj3, abstractC3990);
            }
        } else {
            switch (C14517.f45668[c7323.mo8652().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(interfaceC12236.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(interfaceC12236.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(interfaceC12236.mo30544());
                    break;
                case 4:
                    objValueOf = Long.valueOf(interfaceC12236.mo30542());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(interfaceC12236.mo30528());
                    break;
                case 6:
                    objValueOf = Long.valueOf(interfaceC12236.mo30532());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(interfaceC12236.mo30568());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(interfaceC12236.mo30563());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(interfaceC12236.mo30564());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(interfaceC12236.mo30557());
                    break;
                case 11:
                    objValueOf = Long.valueOf(interfaceC12236.mo30540());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(interfaceC12236.mo30545());
                    break;
                case 13:
                    objValueOf = Long.valueOf(interfaceC12236.mo30551());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = interfaceC12236.mo30537();
                    break;
                case 16:
                    objValueOf = interfaceC12236.mo30553();
                    break;
                case 17:
                    objValueOf = interfaceC12236.mo30533(interfaceC21013.getClass(), c24215);
                    break;
                case 18:
                    objValueOf = interfaceC12236.mo30559(interfaceC21013.getClass(), c24215);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        }
        if (c7323.mo8649()) {
            c8551.m22900(c7323, objValueOf);
            return obj3;
        }
        int i = C14517.f45668[c7323.mo8652().ordinal()];
        if ((i == 17 || i == 18) && (objM22897 = c8551.m22897((InterfaceC2585) c7323)) != null) {
            objValueOf = ((InterfaceC18775) objM22897).toBuilder().mergeFrom((InterfaceC18775) objValueOf).buildPartial();
        }
        c8551.m22899((InterfaceC2585) c7323, objValueOf);
        return obj3;
    }

    @Override // l.AbstractC4077
    /* JADX INFO: renamed from: ۙ */
    public final int mo2094(Map.Entry entry) {
        return ((C7323) entry.getKey()).getNumber();
    }

    @Override // l.AbstractC4077
    /* JADX INFO: renamed from: ۙ */
    public final void mo2100(InterfaceC18356 interfaceC18356, Map.Entry entry) {
        C7323 c7323 = (C7323) entry.getKey();
        if (c7323.mo8649()) {
            int i = 0;
            switch (C14517.f45668[c7323.mo8652().ordinal()]) {
                case 1:
                    C18949.m44003(c7323.getNumber(), (List) entry.getValue(), interfaceC18356, c7323.mo8650());
                    break;
                case 2:
                    C18949.m43993(c7323.getNumber(), (List) entry.getValue(), interfaceC18356, c7323.mo8650());
                    break;
                case 3:
                    C18949.m43986(c7323.getNumber(), (List) entry.getValue(), interfaceC18356, c7323.mo8650());
                    break;
                case 4:
                    C18949.m43994(c7323.getNumber(), (List) entry.getValue(), interfaceC18356, c7323.mo8650());
                    break;
                case 5:
                    C18949.m43991(c7323.getNumber(), (List) entry.getValue(), interfaceC18356, c7323.mo8650());
                    break;
                case 6:
                    C18949.m43998(c7323.getNumber(), (List) entry.getValue(), interfaceC18356, c7323.mo8650());
                    break;
                case 7:
                    C18949.m44005(c7323.getNumber(), (List) entry.getValue(), interfaceC18356, c7323.mo8650());
                    break;
                case 8:
                    C18949.m43983(c7323.getNumber(), (List) entry.getValue(), interfaceC18356, c7323.mo8650());
                    break;
                case 9:
                    C18949.m43996(c7323.getNumber(), (List) entry.getValue(), interfaceC18356, c7323.mo8650());
                    break;
                case 10:
                    C18949.m43976(c7323.getNumber(), (List) entry.getValue(), interfaceC18356, c7323.mo8650());
                    break;
                case 11:
                    C18949.m43989(c7323.getNumber(), (List) entry.getValue(), interfaceC18356, c7323.mo8650());
                    break;
                case 12:
                    C18949.m44006(c7323.getNumber(), (List) entry.getValue(), interfaceC18356, c7323.mo8650());
                    break;
                case 13:
                    C18949.m43995(c7323.getNumber(), (List) entry.getValue(), interfaceC18356, c7323.mo8650());
                    break;
                case 14:
                    List list = (List) entry.getValue();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((C1357) it.next()).getNumber()));
                    }
                    C18949.m43991(c7323.getNumber(), arrayList, interfaceC18356, c7323.mo8650());
                    break;
                case 15:
                    int number = c7323.getNumber();
                    List list2 = (List) entry.getValue();
                    int i2 = C18949.f61453;
                    if (list2 != null && !list2.isEmpty()) {
                        ((C21560) interfaceC18356).m48998(number, list2);
                        break;
                    }
                    break;
                case 16:
                    int number2 = c7323.getNumber();
                    List list3 = (List) entry.getValue();
                    int i3 = C18949.f61453;
                    if (list3 != null && !list3.isEmpty()) {
                        ((C21560) interfaceC18356).m49023(number2, list3);
                        break;
                    }
                    break;
                case 17:
                    int number3 = c7323.getNumber();
                    List list4 = (List) entry.getValue();
                    int i4 = C18949.f61453;
                    if (list4 != null && !list4.isEmpty()) {
                        C21560 c21560 = (C21560) interfaceC18356;
                        c21560.getClass();
                        while (i < list4.size()) {
                            c21560.m48995(number3, list4.get(i));
                            i++;
                        }
                        break;
                    }
                    break;
                case 18:
                    int number4 = c7323.getNumber();
                    List list5 = (List) entry.getValue();
                    int i5 = C18949.f61453;
                    if (list5 != null && !list5.isEmpty()) {
                        C21560 c21561 = (C21560) interfaceC18356;
                        c21561.getClass();
                        while (i < list5.size()) {
                            c21561.m49021(number4, list5.get(i));
                            i++;
                        }
                        break;
                    }
                    break;
            }
        }
        switch (C14517.f45668[c7323.mo8652().ordinal()]) {
            case 1:
                ((C21560) interfaceC18356).m48992(c7323.getNumber(), ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                C21560 c21562 = (C21560) interfaceC18356;
                c21562.m48990(((Float) entry.getValue()).floatValue(), c7323.getNumber());
                break;
            case 3:
                ((C21560) interfaceC18356).m49020(c7323.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 4:
                ((C21560) interfaceC18356).m49016(c7323.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 5:
                ((C21560) interfaceC18356).m49004(c7323.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                ((C21560) interfaceC18356).m48994(c7323.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 7:
                ((C21560) interfaceC18356).m49019(c7323.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                ((C21560) interfaceC18356).m49001(c7323.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                ((C21560) interfaceC18356).m49010(c7323.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                ((C21560) interfaceC18356).m49025(c7323.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                ((C21560) interfaceC18356).m49005(c7323.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 12:
                ((C21560) interfaceC18356).m49015(c7323.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                ((C21560) interfaceC18356).m49026(c7323.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 14:
                ((C21560) interfaceC18356).m49004(c7323.getNumber(), ((C1357) entry.getValue()).getNumber());
                break;
            case 15:
                ((C21560) interfaceC18356).m49000(c7323.getNumber(), (AbstractC17084) entry.getValue());
                break;
            case 16:
                ((C21560) interfaceC18356).m48997(c7323.getNumber(), (String) entry.getValue());
                break;
            case 17:
                ((C21560) interfaceC18356).m48995(c7323.getNumber(), entry.getValue());
                break;
            case 18:
                ((C21560) interfaceC18356).m49021(c7323.getNumber(), entry.getValue());
                break;
        }
    }

    @Override // l.AbstractC4077
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2096(C24215 c24215, InterfaceC18775 interfaceC18775, int i) {
        return ((C20485) c24215).m46987(((InterfaceC21013) interfaceC18775).getDescriptorForType(), i);
    }

    @Override // l.AbstractC4077
    /* JADX INFO: renamed from: ۙ */
    public final void mo2098(InterfaceC12236 interfaceC12236, Object obj, C24215 c24215, C8551 c8551) {
        C3331 c3331 = (C3331) obj;
        C24215 c24216 = C24215.f78465;
        c8551.m22899((InterfaceC2585) c3331.f10901, (Object) new C18971(c3331.f10900, c24215, interfaceC12236.mo30537()));
    }

    @Override // l.AbstractC4077
    /* JADX INFO: renamed from: ۙ */
    public final void mo2099(AbstractC17084 abstractC17084, Object obj, C24215 c24215, C8551 c8551) {
        C3331 c3331 = (C3331) obj;
        InterfaceC21013 interfaceC21013 = c3331.f10900;
        interfaceC21013.newBuilderForType().buildPartial();
        C24215 c24216 = C24215.f78465;
        c8551.m22899((InterfaceC2585) c3331.f10901, (Object) new C18971(interfaceC21013, c24215, abstractC17084));
    }
}
