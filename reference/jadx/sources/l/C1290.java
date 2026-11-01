package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.֨ᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 29P0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1290 extends AbstractC5524 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f5538 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final long f5539;

    static {
        try {
            f5539 = C15882.m37794(AbstractC6229.class.getDeclaredField("ܺ"));
        } catch (Throwable unused) {
            throw new IllegalStateException("Unable to lookup extension field offset");
        }
    }

    @Override // l.AbstractC5524
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo4623(InterfaceC23206 interfaceC23206) {
        return interfaceC23206 instanceof AbstractC6229;
    }

    @Override // l.AbstractC5524
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8347 mo4619(Object obj) {
        return (C8347) C15882.m37785(f5539, obj);
    }

    @Override // l.AbstractC5524
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C8347 mo4625(Object obj) {
        C8347 c8347Mo4619 = mo4619(obj);
        if (!c8347Mo4619.m21850()) {
            return c8347Mo4619;
        }
        C8347 c8347Clone = c8347Mo4619.clone();
        C15882.m37774(f5539, obj, c8347Clone);
        return c8347Clone;
    }

    @Override // l.AbstractC5524
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo4624(Object obj) {
        mo4619(obj).m21837();
    }

    @Override // l.AbstractC5524
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo4617(Object obj, InterfaceC13724 interfaceC13724, Object obj2, C2701 c2701, C8347 c8347, Object obj3, AbstractC5297 abstractC5297) {
        Object objValueOf;
        Object objM21838;
        ArrayList arrayList;
        ArrayList arrayList2;
        C3511 c3511 = (C3511) obj2;
        C19741 c19741 = c3511.f12865;
        InterfaceC1332 interfaceC1332 = c3511.f12864;
        int number = c19741.getNumber();
        if (c19741.mo23408() && c19741.mo23406()) {
            switch (C22458.f73310[c19741.mo23407().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    interfaceC13724.mo12316(arrayList);
                    arrayList2 = arrayList;
                    c8347.m21841((InterfaceC18930) c19741, (Object) arrayList2);
                    return obj3;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC13724.mo12314(arrayList);
                    arrayList2 = arrayList;
                    c8347.m21841((InterfaceC18930) c19741, (Object) arrayList2);
                    return obj3;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC13724.mo12283(arrayList);
                    arrayList2 = arrayList;
                    c8347.m21841((InterfaceC18930) c19741, (Object) arrayList2);
                    return obj3;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC13724.mo12301(arrayList);
                    arrayList2 = arrayList;
                    c8347.m21841((InterfaceC18930) c19741, (Object) arrayList2);
                    return obj3;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC13724.mo12310(arrayList);
                    arrayList2 = arrayList;
                    c8347.m21841((InterfaceC18930) c19741, (Object) arrayList2);
                    return obj3;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC13724.mo12303(arrayList);
                    arrayList2 = arrayList;
                    c8347.m21841((InterfaceC18930) c19741, (Object) arrayList2);
                    return obj3;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC13724.mo12318(arrayList);
                    arrayList2 = arrayList;
                    c8347.m21841((InterfaceC18930) c19741, (Object) arrayList2);
                    return obj3;
                case 8:
                    arrayList = new ArrayList();
                    interfaceC13724.mo12320(arrayList);
                    arrayList2 = arrayList;
                    c8347.m21841((InterfaceC18930) c19741, (Object) arrayList2);
                    return obj3;
                case 9:
                    arrayList = new ArrayList();
                    interfaceC13724.mo12295(arrayList);
                    arrayList2 = arrayList;
                    c8347.m21841((InterfaceC18930) c19741, (Object) arrayList2);
                    return obj3;
                case 10:
                    arrayList = new ArrayList();
                    interfaceC13724.mo12289(arrayList);
                    arrayList2 = arrayList;
                    c8347.m21841((InterfaceC18930) c19741, (Object) arrayList2);
                    return obj3;
                case 11:
                    arrayList = new ArrayList();
                    interfaceC13724.mo12322(arrayList);
                    arrayList2 = arrayList;
                    c8347.m21841((InterfaceC18930) c19741, (Object) arrayList2);
                    return obj3;
                case 12:
                    arrayList = new ArrayList();
                    interfaceC13724.mo12285(arrayList);
                    arrayList2 = arrayList;
                    c8347.m21841((InterfaceC18930) c19741, (Object) arrayList2);
                    return obj3;
                case 13:
                    arrayList = new ArrayList();
                    interfaceC13724.mo12306(arrayList);
                    arrayList2 = arrayList;
                    c8347.m21841((InterfaceC18930) c19741, (Object) arrayList2);
                    return obj3;
                case 14:
                    ArrayList arrayList3 = new ArrayList();
                    interfaceC13724.mo12293(arrayList3);
                    arrayList2 = new ArrayList();
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Integer) it.next()).intValue();
                        C21857 c21857M18883 = c19741.m44901().m18883(iIntValue);
                        if (c21857M18883 != null) {
                            arrayList2.add(c21857M18883);
                        } else {
                            obj3 = C22896.m50660(obj, number, iIntValue, obj3, abstractC5297);
                        }
                    }
                    c8347.m21841((InterfaceC18930) c19741, (Object) arrayList2);
                    return obj3;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + c19741.mo23407());
            }
        }
        if (c19741.mo23407() == EnumC3180.f11954) {
            int iMo12284 = interfaceC13724.mo12284();
            objValueOf = c19741.m44901().m18883(iMo12284);
            if (objValueOf == null) {
                return C22896.m50660(obj, number, iMo12284, obj3, abstractC5297);
            }
        } else {
            switch (C22458.f73310[c19741.mo23407().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(interfaceC13724.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(interfaceC13724.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(interfaceC13724.mo12298());
                    break;
                case 4:
                    objValueOf = Long.valueOf(interfaceC13724.mo12294());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(interfaceC13724.mo12284());
                    break;
                case 6:
                    objValueOf = Long.valueOf(interfaceC13724.mo12286());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(interfaceC13724.mo12321());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(interfaceC13724.mo12308());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(interfaceC13724.mo12282());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(interfaceC13724.mo12315());
                    break;
                case 11:
                    objValueOf = Long.valueOf(interfaceC13724.mo12300());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(interfaceC13724.mo12280());
                    break;
                case 13:
                    objValueOf = Long.valueOf(interfaceC13724.mo12309());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = interfaceC13724.mo12302();
                    break;
                case 16:
                    objValueOf = interfaceC13724.mo12317();
                    break;
                case 17:
                    objValueOf = interfaceC13724.mo12287(interfaceC1332.getClass(), c2701);
                    break;
                case 18:
                    objValueOf = interfaceC13724.mo12304(interfaceC1332.getClass(), c2701);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        }
        if (c19741.mo23408()) {
            c8347.m21842(c19741, objValueOf);
            return obj3;
        }
        int i = C22458.f73310[c19741.mo23407().ordinal()];
        if ((i == 17 || i == 18) && (objM21838 = c8347.m21838((InterfaceC18930) c19741)) != null) {
            objValueOf = ((InterfaceC23206) objM21838).toBuilder().mergeFrom((InterfaceC23206) objValueOf).buildPartial();
        }
        c8347.m21841((InterfaceC18930) c19741, objValueOf);
        return obj3;
    }

    @Override // l.AbstractC5524
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo4616(Map.Entry entry) {
        return ((C19741) entry.getKey()).getNumber();
    }

    @Override // l.AbstractC5524
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4620(InterfaceC12976 interfaceC12976, Map.Entry entry) {
        C19741 c19741 = (C19741) entry.getKey();
        if (c19741.mo23408()) {
            int i = 0;
            switch (C22458.f73310[c19741.mo23407().ordinal()]) {
                case 1:
                    C22896.m50677(c19741.getNumber(), (List) entry.getValue(), interfaceC12976, c19741.mo23406());
                    break;
                case 2:
                    C22896.m50682(c19741.getNumber(), (List) entry.getValue(), interfaceC12976, c19741.mo23406());
                    break;
                case 3:
                    C22896.m50672(c19741.getNumber(), (List) entry.getValue(), interfaceC12976, c19741.mo23406());
                    break;
                case 4:
                    C22896.m50679(c19741.getNumber(), (List) entry.getValue(), interfaceC12976, c19741.mo23406());
                    break;
                case 5:
                    C22896.m50654(c19741.getNumber(), (List) entry.getValue(), interfaceC12976, c19741.mo23406());
                    break;
                case 6:
                    C22896.m50668(c19741.getNumber(), (List) entry.getValue(), interfaceC12976, c19741.mo23406());
                    break;
                case 7:
                    C22896.m50656(c19741.getNumber(), (List) entry.getValue(), interfaceC12976, c19741.mo23406());
                    break;
                case 8:
                    C22896.m50664(c19741.getNumber(), (List) entry.getValue(), interfaceC12976, c19741.mo23406());
                    break;
                case 9:
                    C22896.m50680(c19741.getNumber(), (List) entry.getValue(), interfaceC12976, c19741.mo23406());
                    break;
                case 10:
                    C22896.m50657(c19741.getNumber(), (List) entry.getValue(), interfaceC12976, c19741.mo23406());
                    break;
                case 11:
                    C22896.m50669(c19741.getNumber(), (List) entry.getValue(), interfaceC12976, c19741.mo23406());
                    break;
                case 12:
                    C22896.m50683(c19741.getNumber(), (List) entry.getValue(), interfaceC12976, c19741.mo23406());
                    break;
                case 13:
                    C22896.m50678(c19741.getNumber(), (List) entry.getValue(), interfaceC12976, c19741.mo23406());
                    break;
                case 14:
                    List list = (List) entry.getValue();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((C21857) it.next()).getNumber()));
                    }
                    C22896.m50654(c19741.getNumber(), arrayList, interfaceC12976, c19741.mo23406());
                    break;
                case 15:
                    int number = c19741.getNumber();
                    List list2 = (List) entry.getValue();
                    int i2 = C22896.f74441;
                    if (list2 != null && !list2.isEmpty()) {
                        ((C0876) interfaceC12976).m3523(number, list2);
                        break;
                    }
                    break;
                case 16:
                    int number2 = c19741.getNumber();
                    List list3 = (List) entry.getValue();
                    int i3 = C22896.f74441;
                    if (list3 != null && !list3.isEmpty()) {
                        ((C0876) interfaceC12976).m3542(number2, list3);
                        break;
                    }
                    break;
                case 17:
                    int number3 = c19741.getNumber();
                    List list4 = (List) entry.getValue();
                    int i4 = C22896.f74441;
                    if (list4 != null && !list4.isEmpty()) {
                        C0876 c0876 = (C0876) interfaceC12976;
                        c0876.getClass();
                        while (i < list4.size()) {
                            c0876.m3520(number3, list4.get(i));
                            i++;
                        }
                        break;
                    }
                    break;
                case 18:
                    int number4 = c19741.getNumber();
                    List list5 = (List) entry.getValue();
                    int i5 = C22896.f74441;
                    if (list5 != null && !list5.isEmpty()) {
                        C0876 c0877 = (C0876) interfaceC12976;
                        c0877.getClass();
                        while (i < list5.size()) {
                            c0877.m3540(number4, list5.get(i));
                            i++;
                        }
                        break;
                    }
                    break;
            }
        }
        switch (C22458.f73310[c19741.mo23407().ordinal()]) {
            case 1:
                ((C0876) interfaceC12976).m3517(c19741.getNumber(), ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                C0876 c0878 = (C0876) interfaceC12976;
                c0878.m3515(((Float) entry.getValue()).floatValue(), c19741.getNumber());
                break;
            case 3:
                ((C0876) interfaceC12976).m3539(c19741.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 4:
                ((C0876) interfaceC12976).m3529(c19741.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 5:
                ((C0876) interfaceC12976).m3532(c19741.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                ((C0876) interfaceC12976).m3519(c19741.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 7:
                ((C0876) interfaceC12976).m3538(c19741.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                ((C0876) interfaceC12976).m3526(c19741.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                ((C0876) interfaceC12976).m3547(c19741.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                ((C0876) interfaceC12976).m3511(c19741.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                ((C0876) interfaceC12976).m3533(c19741.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 12:
                ((C0876) interfaceC12976).m3528(c19741.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                ((C0876) interfaceC12976).m3512(c19741.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 14:
                ((C0876) interfaceC12976).m3532(c19741.getNumber(), ((C21857) entry.getValue()).getNumber());
                break;
            case 15:
                ((C0876) interfaceC12976).m3525(c19741.getNumber(), (AbstractC23725) entry.getValue());
                break;
            case 16:
                ((C0876) interfaceC12976).m3522(c19741.getNumber(), (String) entry.getValue());
                break;
            case 17:
                ((C0876) interfaceC12976).m3520(c19741.getNumber(), entry.getValue());
                break;
            case 18:
                ((C0876) interfaceC12976).m3540(c19741.getNumber(), entry.getValue());
                break;
        }
    }

    @Override // l.AbstractC5524
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo4618(C2701 c2701, InterfaceC23206 interfaceC23206, int i) {
        return ((C4818) c2701).m13399(((InterfaceC1332) interfaceC23206).getDescriptorForType(), i);
    }

    @Override // l.AbstractC5524
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4621(InterfaceC13724 interfaceC13724, Object obj, C2701 c2701, C8347 c8347) {
        C3511 c3511 = (C3511) obj;
        C2701 c2702 = C2701.f10402;
        c8347.m21841((InterfaceC18930) c3511.f12865, (Object) new C22875(c3511.f12864, c2701, interfaceC13724.mo12302()));
    }

    @Override // l.AbstractC5524
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4622(AbstractC23725 abstractC23725, Object obj, C2701 c2701, C8347 c8347) {
        C3511 c3511 = (C3511) obj;
        InterfaceC1332 interfaceC1332 = c3511.f12864;
        interfaceC1332.newBuilderForType().buildPartial();
        C2701 c2702 = C2701.f10402;
        c8347.m21841((InterfaceC18930) c3511.f12865, (Object) new C22875(interfaceC1332, c2701, abstractC23725));
    }
}
