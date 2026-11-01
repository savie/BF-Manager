package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۠ᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 29QV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8347 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f28924 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C8347 f28925;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15841 f28926;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f28927;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f28928;

    public /* synthetic */ C8347(C15841 c15841, int i) {
        this(c15841);
    }

    public C8347() {
        this.f28926 = new C21484(16);
    }

    public C8347(C15841 c15841) {
        this.f28926 = c15841;
        m21837();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static C8347 m21834() {
        return new C8347();
    }

    public final C8347 clone() {
        C15841 c15841;
        C8347 c8347 = new C8347();
        int i = 0;
        while (true) {
            c15841 = this.f28926;
            if (i >= c15841.m37664()) {
                break;
            }
            Map.Entry entryM37665 = c15841.m37665(i);
            c8347.m21841((InterfaceC18930) entryM37665.getKey(), entryM37665.getValue());
            i++;
        }
        for (Map.Entry entry : c15841.m37663()) {
            c8347.m21841((InterfaceC18930) entry.getKey(), entry.getValue());
        }
        c8347.f28928 = this.f28928;
        return c8347;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C8347 m21825() {
        return f28925;
    }

    static {
        C8347 c8347 = new C8347(new C21484(0));
        c8347.m21837();
        f28925 = c8347;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m21845() {
        return this.f28926.isEmpty();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m21837() {
        if (this.f28927) {
            return;
        }
        int i = 0;
        while (true) {
            C15841 c15841 = this.f28926;
            if (i < c15841.m37664()) {
                Map.Entry entryM37665 = c15841.m37665(i);
                if (entryM37665.getValue() instanceof AbstractC16129) {
                    AbstractC16129 abstractC16129 = (AbstractC16129) entryM37665.getValue();
                    abstractC16129.getClass();
                    C14739 c14739M35321 = C14739.m35321();
                    c14739M35321.getClass();
                    c14739M35321.m35322(abstractC16129.getClass()).mo18055((Object) abstractC16129);
                    abstractC16129.m38185();
                }
                i++;
            } else {
                c15841.mo37659();
                this.f28927 = true;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m21850() {
        return this.f28927;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8347) {
            return this.f28926.equals(((C8347) obj).f28926);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28926.hashCode();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Map m21848() {
        boolean z = this.f28928;
        C15841 c15841 = this.f28926;
        if (!z) {
            return c15841.m37662() ? c15841 : C0561.unmodifiableMap(c15841);
        }
        C21484 c21484M21815 = m21815(c15841, false, true);
        if (c15841.m37662()) {
            c21484M21815.mo37659();
        }
        return c21484M21815;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21484 m21815(C15841 c15841, boolean z, boolean z2) {
        int i = C15841.f51267;
        C21484 c21484 = new C21484(16);
        for (int i2 = 0; i2 < c15841.m37664(); i2++) {
            m21818(c21484, c15841.m37665(i2), z, z2);
        }
        Iterator it = c15841.m37663().iterator();
        while (it.hasNext()) {
            m21818(c21484, (Map.Entry) it.next(), z, z2);
        }
        return c21484;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21818(Map map, Map.Entry entry, boolean z, boolean z2) {
        InterfaceC18930 interfaceC18930 = (InterfaceC18930) entry.getKey();
        Object value = entry.getValue();
        if (z2 && (value instanceof C22875)) {
            ((C21484) map).m37660(interfaceC18930, ((C22875) value).m50621());
        } else if (!z || !(value instanceof List)) {
            ((C21484) map).m37660(interfaceC18930, value);
        } else {
            ((C21484) map).m37660(interfaceC18930, new ArrayList((List) value));
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Iterator m21847() {
        boolean z = this.f28928;
        C15841 c15841 = this.f28926;
        if (z) {
            return new C6646(((C20779) c15841.entrySet()).iterator());
        }
        return ((C20779) c15841.entrySet()).iterator();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Iterator m21839() {
        boolean z = this.f28928;
        C15841 c15841 = this.f28926;
        if (z) {
            return new C6646(((C18662) c15841.m37661()).iterator());
        }
        return ((C18662) c15841.m37661()).iterator();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21844(C19741 c19741) {
        if (c19741.mo23408()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f28926.get(c19741) != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m21838(InterfaceC18930 interfaceC18930) {
        Object obj = this.f28926.get(interfaceC18930);
        return obj instanceof C22875 ? ((C22875) obj).m50621() : obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21841(InterfaceC18930 interfaceC18930, Object obj) {
        if (interfaceC18930.mo23408()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m21826(interfaceC18930, it.next());
            }
            obj = arrayList;
        } else {
            m21826(interfaceC18930, obj);
        }
        if (obj instanceof C22875) {
            this.f28928 = true;
        }
        this.f28926.m37660(interfaceC18930, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21842(C19741 c19741, Object obj) {
        List arrayList;
        if (!c19741.mo23408()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m21826(c19741, obj);
        Object objM21838 = m21838((InterfaceC18930) c19741);
        if (objM21838 == null) {
            arrayList = new ArrayList();
            this.f28926.m37660(c19741, arrayList);
        } else {
            arrayList = (List) objM21838;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m21826(InterfaceC18930 interfaceC18930, Object obj) {
        if (!m21828(interfaceC18930.mo23407(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC18930.getNumber()), interfaceC18930.mo23407().m9597(), obj.getClass().getName()));
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m21828(EnumC3180 enumC3180, Object obj) {
        byte[] bArr = C9779.f33478;
        obj.getClass();
        switch (C21752.f70494[enumC3180.m9597().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof AbstractC23725) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof InterfaceC12601);
            case 9:
                return (obj instanceof InterfaceC23206) || (obj instanceof C22875);
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m21835() {
        int i = 0;
        while (true) {
            C15841 c15841 = this.f28926;
            if (i < c15841.m37664()) {
                if (!m21827(c15841.m37665(i))) {
                    return false;
                }
                i++;
            } else {
                Iterator it = c15841.m37663().iterator();
                while (it.hasNext()) {
                    if (!m21827((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m21827(Map.Entry entry) {
        boolean zIsInitialized;
        InterfaceC18930 interfaceC18930 = (InterfaceC18930) entry.getKey();
        if (interfaceC18930.mo23410() == EnumC4508.MESSAGE) {
            if (interfaceC18930.mo23408()) {
                for (Object obj : (List) entry.getValue()) {
                    if (obj instanceof InterfaceC15445) {
                        zIsInitialized = ((InterfaceC15445) obj).isInitialized();
                    } else {
                        if (!(obj instanceof C22875)) {
                            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                        }
                        zIsInitialized = true;
                    }
                    if (!zIsInitialized) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof InterfaceC15445) {
                    return ((InterfaceC15445) value).isInitialized();
                }
                if (value instanceof C22875) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21840(C8347 c8347) {
        C15841 c15841;
        int i = 0;
        while (true) {
            c15841 = c8347.f28926;
            if (i >= c15841.m37664()) {
                break;
            }
            m21813(c15841.m37665(i));
            i++;
        }
        Iterator it = c15841.m37663().iterator();
        while (it.hasNext()) {
            m21813((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Object m21832(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m21813(Map.Entry entry) {
        InterfaceC18930 interfaceC18930 = (InterfaceC18930) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof C22875;
        boolean zMo23408 = interfaceC18930.mo23408();
        C15841 c15841 = this.f28926;
        if (zMo23408) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objM21838 = m21838(interfaceC18930);
            if (objM21838 == null) {
                objM21838 = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objM21838).add(m21832(it.next()));
            }
            c15841.m37660(interfaceC18930, objM21838);
            return;
        }
        if (interfaceC18930.mo23410() != EnumC4508.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            c15841.m37660(interfaceC18930, m21832(value));
            return;
        }
        Object objM21839 = m21838(interfaceC18930);
        if (objM21839 == null) {
            c15841.m37660(interfaceC18930, m21832(value));
            if (z) {
                this.f28928 = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((C22875) value).m50621();
        }
        c15841.m37660(interfaceC18930, interfaceC18930.mo23409(((InterfaceC23206) objM21839).toBuilder(), (InterfaceC23206) value).build());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m21849(AbstractC22044 abstractC22044) {
        C15841 c15841;
        int i = 0;
        while (true) {
            c15841 = this.f28926;
            if (i >= c15841.m37664()) {
                break;
            }
            Map.Entry entryM37665 = c15841.m37665(i);
            m21820((InterfaceC18930) entryM37665.getKey(), entryM37665.getValue(), abstractC22044);
            i++;
        }
        for (Map.Entry entry : c15841.m37663()) {
            m21820((InterfaceC18930) entry.getKey(), entry.getValue(), abstractC22044);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21843(AbstractC22044 abstractC22044) {
        C15841 c15841;
        int i = 0;
        while (true) {
            c15841 = this.f28926;
            if (i >= c15841.m37664()) {
                break;
            }
            m21817(c15841.m37665(i), abstractC22044);
            i++;
        }
        Iterator it = c15841.m37663().iterator();
        while (it.hasNext()) {
            m21817((Map.Entry) it.next(), abstractC22044);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21817(Map.Entry entry, AbstractC22044 abstractC22044) {
        InterfaceC18930 interfaceC18930 = (InterfaceC18930) entry.getKey();
        if (interfaceC18930.mo23410() == EnumC4508.MESSAGE && !interfaceC18930.mo23408() && !interfaceC18930.mo23406()) {
            Object value = entry.getValue();
            if (value instanceof C22875) {
                abstractC22044.mo14255(((InterfaceC18930) entry.getKey()).getNumber(), ((C22875) value).m36207());
                return;
            } else {
                abstractC22044.mo14250(((InterfaceC18930) entry.getKey()).getNumber(), (InterfaceC23206) value);
                return;
            }
        }
        m21820(interfaceC18930, entry.getValue(), abstractC22044);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21821(AbstractC22044 abstractC22044, EnumC3180 enumC3180, int i, Object obj) {
        if (enumC3180 == EnumC3180.f11949) {
            abstractC22044.m48975(i, (InterfaceC23206) obj);
        } else {
            abstractC22044.mo14249(i, enumC3180.m9598());
            m21822(abstractC22044, enumC3180, obj);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21822(AbstractC22044 abstractC22044, EnumC3180 enumC3180, Object obj) {
        switch (C21752.f70493[enumC3180.ordinal()]) {
            case 1:
                double dDoubleValue = ((Double) obj).doubleValue();
                abstractC22044.getClass();
                abstractC22044.mo14242(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                abstractC22044.getClass();
                abstractC22044.mo14233(Float.floatToRawIntBits(fFloatValue));
                break;
            case 3:
                abstractC22044.mo14256(((Long) obj).longValue());
                break;
            case 4:
                abstractC22044.mo14256(((Long) obj).longValue());
                break;
            case 5:
                abstractC22044.mo14251(((Integer) obj).intValue());
                break;
            case 6:
                abstractC22044.mo14242(((Long) obj).longValue());
                break;
            case 7:
                abstractC22044.mo14233(((Integer) obj).intValue());
                break;
            case 8:
                abstractC22044.mo14232(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                abstractC22044.getClass();
                ((InterfaceC23206) obj).writeTo(abstractC22044);
                break;
            case 10:
                abstractC22044.mo14244((InterfaceC23206) obj);
                break;
            case 11:
                if (obj instanceof AbstractC23725) {
                    abstractC22044.mo14245((AbstractC23725) obj);
                } else {
                    abstractC22044.mo14243((String) obj);
                }
                break;
            case 12:
                if (obj instanceof AbstractC23725) {
                    abstractC22044.mo14245((AbstractC23725) obj);
                } else {
                    byte[] bArr = (byte[]) obj;
                    abstractC22044.getClass();
                    abstractC22044.mo14241(bArr.length, bArr);
                }
                break;
            case 13:
                abstractC22044.mo14248(((Integer) obj).intValue());
                break;
            case 14:
                abstractC22044.mo14233(((Integer) obj).intValue());
                break;
            case 15:
                abstractC22044.mo14242(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                abstractC22044.mo14248((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                abstractC22044.mo14256((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 18:
                if (obj instanceof InterfaceC12601) {
                    abstractC22044.mo14251(((InterfaceC12601) obj).getNumber());
                } else {
                    abstractC22044.mo14251(((Integer) obj).intValue());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21820(InterfaceC18930 interfaceC18930, Object obj, AbstractC22044 abstractC22044) {
        EnumC3180 enumC3180Mo23407 = interfaceC18930.mo23407();
        int number = interfaceC18930.getNumber();
        if (interfaceC18930.mo23408()) {
            List list = (List) obj;
            if (interfaceC18930.mo23406()) {
                if (list.isEmpty()) {
                    return;
                }
                abstractC22044.mo14249(number, 2);
                Iterator it = list.iterator();
                int iM21830 = 0;
                while (it.hasNext()) {
                    iM21830 += m21830(enumC3180Mo23407, it.next());
                }
                abstractC22044.mo14248(iM21830);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    m21822(abstractC22044, enumC3180Mo23407, it2.next());
                }
                return;
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                m21821(abstractC22044, enumC3180Mo23407, number, it3.next());
            }
            return;
        }
        if (obj instanceof C22875) {
            m21821(abstractC22044, enumC3180Mo23407, number, ((C22875) obj).m50621());
        } else {
            m21821(abstractC22044, enumC3180Mo23407, number, obj);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m21836() {
        C15841 c15841;
        int i = 0;
        int iM21831 = 0;
        while (true) {
            c15841 = this.f28926;
            if (i >= c15841.m37664()) {
                break;
            }
            Map.Entry entryM37665 = c15841.m37665(i);
            iM21831 += m21831((InterfaceC18930) entryM37665.getKey(), entryM37665.getValue());
            i++;
        }
        for (Map.Entry entry : c15841.m37663()) {
            iM21831 += m21831((InterfaceC18930) entry.getKey(), entry.getValue());
        }
        return iM21831;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m21846() {
        C15841 c15841;
        int i = 0;
        int iM21829 = 0;
        while (true) {
            c15841 = this.f28926;
            if (i >= c15841.m37664()) {
                break;
            }
            iM21829 += m21829(c15841.m37665(i));
            i++;
        }
        Iterator it = c15841.m37663().iterator();
        while (it.hasNext()) {
            iM21829 += m21829((Map.Entry) it.next());
        }
        return iM21829;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m21829(Map.Entry entry) {
        int iM48960;
        int iM48963;
        InterfaceC18930 interfaceC18930 = (InterfaceC18930) entry.getKey();
        Object value = entry.getValue();
        if (interfaceC18930.mo23410() == EnumC4508.MESSAGE && !interfaceC18930.mo23408() && !interfaceC18930.mo23406()) {
            if (value instanceof C22875) {
                int number = ((InterfaceC18930) entry.getKey()).getNumber();
                iM48960 = AbstractC22044.m48960(2, number) + (AbstractC22044.m48973(1) * 2);
                iM48963 = AbstractC22044.m48964(3, (C22875) value);
            } else {
                int number2 = ((InterfaceC18930) entry.getKey()).getNumber();
                iM48960 = AbstractC22044.m48960(2, number2) + (AbstractC22044.m48973(1) * 2);
                iM48963 = AbstractC22044.m48963(3, (InterfaceC23206) value);
            }
            return iM48963 + iM48960;
        }
        return m21831(interfaceC18930, value);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m21830(EnumC3180 enumC3180, Object obj) {
        int iM36204;
        AbstractC23725 abstractC23725;
        switch (C21752.f70493[enumC3180.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                int i = AbstractC22044.f71447;
                return 8;
            case 2:
                ((Float) obj).getClass();
                int i2 = AbstractC22044.f71447;
                return 4;
            case 3:
                return AbstractC22044.m48969(((Long) obj).longValue());
            case 4:
                return AbstractC22044.m48969(((Long) obj).longValue());
            case 5:
                return AbstractC22044.m48969(((Integer) obj).intValue());
            case 6:
                ((Long) obj).getClass();
                int i3 = AbstractC22044.f71447;
                return 8;
            case 7:
                ((Integer) obj).getClass();
                int i4 = AbstractC22044.f71447;
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                int i5 = AbstractC22044.f71447;
                return 1;
            case 9:
                int i6 = AbstractC22044.f71447;
                return ((InterfaceC23206) obj).getSerializedSize();
            case 10:
                if (obj instanceof C22875) {
                    int i7 = AbstractC22044.f71447;
                    iM36204 = ((C22875) obj).m36204();
                    return AbstractC22044.m48959(iM36204) + iM36204;
                }
                return AbstractC22044.m48971((InterfaceC23206) obj);
            case 11:
                if (obj instanceof AbstractC23725) {
                    abstractC23725 = (AbstractC23725) obj;
                    int i8 = AbstractC22044.f71447;
                    iM36204 = abstractC23725.size();
                    return AbstractC22044.m48959(iM36204) + iM36204;
                }
                return AbstractC22044.m48970((String) obj);
            case 12:
                if (obj instanceof AbstractC23725) {
                    abstractC23725 = (AbstractC23725) obj;
                    int i9 = AbstractC22044.f71447;
                    iM36204 = abstractC23725.size();
                } else {
                    int i10 = AbstractC22044.f71447;
                    iM36204 = ((byte[]) obj).length;
                }
                return AbstractC22044.m48959(iM36204) + iM36204;
            case 13:
                return AbstractC22044.m48959(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i11 = AbstractC22044.f71447;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i12 = AbstractC22044.f71447;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return AbstractC22044.m48959((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return AbstractC22044.m48969((jLongValue >> 63) ^ (jLongValue << 1));
            case 18:
                return obj instanceof InterfaceC12601 ? AbstractC22044.m48969(((InterfaceC12601) obj).getNumber()) : AbstractC22044.m48969(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m21831(InterfaceC18930 interfaceC18930, Object obj) {
        EnumC3180 enumC3180Mo23407 = interfaceC18930.mo23407();
        int number = interfaceC18930.getNumber();
        if (!interfaceC18930.mo23408()) {
            int iM48973 = AbstractC22044.m48973(number);
            if (enumC3180Mo23407 == EnumC3180.f11949) {
                iM48973 *= 2;
            }
            return iM48973 + m21830(enumC3180Mo23407, obj);
        }
        List list = (List) obj;
        int iM21830 = 0;
        if (interfaceC18930.mo23406()) {
            if (list.isEmpty()) {
                return 0;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iM21830 += m21830(enumC3180Mo23407, it.next());
            }
            return AbstractC22044.m48959(iM21830) + AbstractC22044.m48973(number) + iM21830;
        }
        for (Object obj2 : list) {
            int iM48974 = AbstractC22044.m48973(number);
            if (enumC3180Mo23407 == EnumC3180.f11949) {
                iM48974 *= 2;
            }
            iM21830 += iM48974 + m21830(enumC3180Mo23407, obj2);
        }
        return iM21830;
    }
}
