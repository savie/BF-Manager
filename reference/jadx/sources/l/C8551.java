package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۠ۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29QV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8551 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C8551 f27922;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f27923 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22636 f27924;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f27925;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f27926;

    public /* synthetic */ C8551(C22636 c22636, int i) {
        this(c22636);
    }

    public C8551() {
        this.f27924 = new C1050(16);
    }

    public C8551(C22636 c22636) {
        this.f27924 = c22636;
        m22896();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C8551 m22895() {
        return new C8551();
    }

    public final C8551 clone() {
        C22636 c22636;
        C8551 c8551 = new C8551();
        int i = 0;
        while (true) {
            c22636 = this.f27924;
            if (i >= c22636.m51024()) {
                break;
            }
            Map.Entry entryM51025 = c22636.m51025(i);
            c8551.m22899((InterfaceC2585) entryM51025.getKey(), entryM51025.getValue());
            i++;
        }
        for (Map.Entry entry : c22636.m51026()) {
            c8551.m22899((InterfaceC2585) entry.getKey(), entry.getValue());
        }
        c8551.f27926 = this.f27926;
        return c8551;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C8551 m22888() {
        return f27922;
    }

    static {
        C8551 c8551 = new C8551(new C1050(0));
        c8551.m22896();
        f27922 = c8551;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m22908() {
        return this.f27924.isEmpty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22896() {
        if (this.f27925) {
            return;
        }
        int i = 0;
        while (true) {
            C22636 c22636 = this.f27924;
            if (i < c22636.m51024()) {
                Map.Entry entryM51025 = c22636.m51025(i);
                if (entryM51025.getValue() instanceof AbstractC22701) {
                    AbstractC22701 abstractC22701 = (AbstractC22701) entryM51025.getValue();
                    abstractC22701.getClass();
                    C17457 c17457M40958 = C17457.m40958();
                    c17457M40958.getClass();
                    c17457M40958.m40959(abstractC22701.getClass()).mo21140((Object) abstractC22701);
                    abstractC22701.m51178();
                }
                i++;
            } else {
                c22636.mo3949();
                this.f27925 = true;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m22907() {
        return this.f27925;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8551) {
            return this.f27924.equals(((C8551) obj).f27924);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27924.hashCode();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Map m22909() {
        boolean z = this.f27926;
        C22636 c22636 = this.f27924;
        if (!z) {
            return c22636.m51023() ? c22636 : C4681.unmodifiableMap(c22636);
        }
        C1050 c1050M22876 = m22876(c22636, false, true);
        if (c22636.m51023()) {
            c1050M22876.mo3949();
        }
        return c1050M22876;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1050 m22876(C22636 c22636, boolean z, boolean z2) {
        int i = C22636.f73524;
        C1050 c1050 = new C1050(16);
        for (int i2 = 0; i2 < c22636.m51024(); i2++) {
            m22878(c1050, c22636.m51025(i2), z, z2);
        }
        Iterator it = c22636.m51026().iterator();
        while (it.hasNext()) {
            m22878(c1050, (Map.Entry) it.next(), z, z2);
        }
        return c1050;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22878(Map map, Map.Entry entry, boolean z, boolean z2) {
        InterfaceC2585 interfaceC2585 = (InterfaceC2585) entry.getKey();
        Object value = entry.getValue();
        if (z2 && (value instanceof C18971)) {
            ((C1050) map).m51021(interfaceC2585, ((C18971) value).m44067());
        } else if (!z || !(value instanceof List)) {
            ((C1050) map).m51021(interfaceC2585, value);
        } else {
            ((C1050) map).m51021(interfaceC2585, new ArrayList((List) value));
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Iterator m22904() {
        boolean z = this.f27926;
        C22636 c22636 = this.f27924;
        if (z) {
            return new C7784(((C10701) c22636.entrySet()).iterator());
        }
        return ((C10701) c22636.entrySet()).iterator();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Iterator m22898() {
        boolean z = this.f27926;
        C22636 c22636 = this.f27924;
        if (z) {
            return new C7784(((C2541) c22636.m51022()).iterator());
        }
        return ((C2541) c22636.m51022()).iterator();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m22903(C7323 c7323) {
        if (c7323.mo8649()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f27924.get(c7323) != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m22897(InterfaceC2585 interfaceC2585) {
        Object obj = this.f27924.get(interfaceC2585);
        return obj instanceof C18971 ? ((C18971) obj).m44067() : obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22899(InterfaceC2585 interfaceC2585, Object obj) {
        if (interfaceC2585.mo8649()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m22885(interfaceC2585, it.next());
            }
            obj = arrayList;
        } else {
            m22885(interfaceC2585, obj);
        }
        if (obj instanceof C18971) {
            this.f27926 = true;
        }
        this.f27924.m51021(interfaceC2585, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22900(C7323 c7323, Object obj) {
        List arrayList;
        if (!c7323.mo8649()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m22885(c7323, obj);
        Object objM22897 = m22897((InterfaceC2585) c7323);
        if (objM22897 == null) {
            arrayList = new ArrayList();
            this.f27924.m51021(c7323, arrayList);
        } else {
            arrayList = (List) objM22897;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m22885(InterfaceC2585 interfaceC2585, Object obj) {
        if (!m22887(interfaceC2585.mo8652(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2585.getNumber()), interfaceC2585.mo8652().m11207(), obj.getClass().getName()));
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m22887(EnumC3440 enumC3440, Object obj) {
        byte[] bArr = C23447.f75887;
        obj.getClass();
        switch (C1094.f3902[enumC3440.m11207().ordinal()]) {
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
                return (obj instanceof AbstractC17084) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof InterfaceC5547);
            case 9:
                return (obj instanceof InterfaceC18775) || (obj instanceof C18971);
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m22906() {
        int i = 0;
        while (true) {
            C22636 c22636 = this.f27924;
            if (i < c22636.m51024()) {
                if (!m22886(c22636.m51025(i))) {
                    return false;
                }
                i++;
            } else {
                Iterator it = c22636.m51026().iterator();
                while (it.hasNext()) {
                    if (!m22886((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m22886(Map.Entry entry) {
        boolean zIsInitialized;
        InterfaceC2585 interfaceC2585 = (InterfaceC2585) entry.getKey();
        if (interfaceC2585.mo8651() == EnumC20594.MESSAGE) {
            if (interfaceC2585.mo8649()) {
                for (Object obj : (List) entry.getValue()) {
                    if (obj instanceof InterfaceC9824) {
                        zIsInitialized = ((InterfaceC9824) obj).isInitialized();
                    } else {
                        if (!(obj instanceof C18971)) {
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
                if (value instanceof InterfaceC9824) {
                    return ((InterfaceC9824) value).isInitialized();
                }
                if (value instanceof C18971) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22901(C8551 c8551) {
        C22636 c22636;
        int i = 0;
        while (true) {
            c22636 = c8551.f27924;
            if (i >= c22636.m51024()) {
                break;
            }
            m22894(c22636.m51025(i));
            i++;
        }
        Iterator it = c22636.m51026().iterator();
        while (it.hasNext()) {
            m22894((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Object m22892(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m22894(Map.Entry entry) {
        InterfaceC2585 interfaceC2585 = (InterfaceC2585) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof C18971;
        boolean zMo8649 = interfaceC2585.mo8649();
        C22636 c22636 = this.f27924;
        if (zMo8649) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objM22897 = m22897(interfaceC2585);
            if (objM22897 == null) {
                objM22897 = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objM22897).add(m22892(it.next()));
            }
            c22636.m51021(interfaceC2585, objM22897);
            return;
        }
        if (interfaceC2585.mo8651() != EnumC20594.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            c22636.m51021(interfaceC2585, m22892(value));
            return;
        }
        Object objM22898 = m22897(interfaceC2585);
        if (objM22898 == null) {
            c22636.m51021(interfaceC2585, m22892(value));
            if (z) {
                this.f27926 = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((C18971) value).m44067();
        }
        c22636.m51021(interfaceC2585, interfaceC2585.mo8648(((InterfaceC18775) objM22898).toBuilder(), (InterfaceC18775) value).build());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m22910(AbstractC14846 abstractC14846) {
        C22636 c22636;
        int i = 0;
        while (true) {
            c22636 = this.f27924;
            if (i >= c22636.m51024()) {
                break;
            }
            Map.Entry entryM51025 = c22636.m51025(i);
            m22879((InterfaceC2585) entryM51025.getKey(), entryM51025.getValue(), abstractC14846);
            i++;
        }
        for (Map.Entry entry : c22636.m51026()) {
            m22879((InterfaceC2585) entry.getKey(), entry.getValue(), abstractC14846);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22902(AbstractC14846 abstractC14846) {
        C22636 c22636;
        int i = 0;
        while (true) {
            c22636 = this.f27924;
            if (i >= c22636.m51024()) {
                break;
            }
            m22877(c22636.m51025(i), abstractC14846);
            i++;
        }
        Iterator it = c22636.m51026().iterator();
        while (it.hasNext()) {
            m22877((Map.Entry) it.next(), abstractC14846);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22877(Map.Entry entry, AbstractC14846 abstractC14846) {
        InterfaceC2585 interfaceC2585 = (InterfaceC2585) entry.getKey();
        if (interfaceC2585.mo8651() == EnumC20594.MESSAGE && !interfaceC2585.mo8649() && !interfaceC2585.mo8650()) {
            Object value = entry.getValue();
            if (value instanceof C18971) {
                abstractC14846.mo14024(((InterfaceC2585) entry.getKey()).getNumber(), ((C18971) value).m25871());
                return;
            } else {
                abstractC14846.mo14020(((InterfaceC2585) entry.getKey()).getNumber(), (InterfaceC18775) value);
                return;
            }
        }
        m22879(interfaceC2585, entry.getValue(), abstractC14846);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22881(AbstractC14846 abstractC14846, EnumC3440 enumC3440, int i, Object obj) {
        if (enumC3440 == EnumC3440.f11209) {
            abstractC14846.m35775(i, (InterfaceC18775) obj);
        } else {
            abstractC14846.mo14019(i, enumC3440.m11209());
            m22882(abstractC14846, enumC3440, obj);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22882(AbstractC14846 abstractC14846, EnumC3440 enumC3440, Object obj) {
        switch (C1094.f3901[enumC3440.ordinal()]) {
            case 1:
                double dDoubleValue = ((Double) obj).doubleValue();
                abstractC14846.getClass();
                abstractC14846.mo14012(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                abstractC14846.getClass();
                abstractC14846.mo14003(Float.floatToRawIntBits(fFloatValue));
                break;
            case 3:
                abstractC14846.mo14026(((Long) obj).longValue());
                break;
            case 4:
                abstractC14846.mo14026(((Long) obj).longValue());
                break;
            case 5:
                abstractC14846.mo14021(((Integer) obj).intValue());
                break;
            case 6:
                abstractC14846.mo14012(((Long) obj).longValue());
                break;
            case 7:
                abstractC14846.mo14003(((Integer) obj).intValue());
                break;
            case 8:
                abstractC14846.mo14002(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                abstractC14846.getClass();
                ((InterfaceC18775) obj).writeTo(abstractC14846);
                break;
            case 10:
                abstractC14846.mo14015((InterfaceC18775) obj);
                break;
            case 11:
                if (obj instanceof AbstractC17084) {
                    abstractC14846.mo14014((AbstractC17084) obj);
                } else {
                    abstractC14846.mo14013((String) obj);
                }
                break;
            case 12:
                if (obj instanceof AbstractC17084) {
                    abstractC14846.mo14014((AbstractC17084) obj);
                } else {
                    byte[] bArr = (byte[]) obj;
                    abstractC14846.getClass();
                    abstractC14846.mo14011(bArr.length, bArr);
                }
                break;
            case 13:
                abstractC14846.mo14018(((Integer) obj).intValue());
                break;
            case 14:
                abstractC14846.mo14003(((Integer) obj).intValue());
                break;
            case 15:
                abstractC14846.mo14012(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                abstractC14846.mo14018((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                abstractC14846.mo14026((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 18:
                if (obj instanceof InterfaceC5547) {
                    abstractC14846.mo14021(((InterfaceC5547) obj).getNumber());
                } else {
                    abstractC14846.mo14021(((Integer) obj).intValue());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22879(InterfaceC2585 interfaceC2585, Object obj, AbstractC14846 abstractC14846) {
        EnumC3440 enumC3440Mo8652 = interfaceC2585.mo8652();
        int number = interfaceC2585.getNumber();
        if (interfaceC2585.mo8649()) {
            List list = (List) obj;
            if (interfaceC2585.mo8650()) {
                if (list.isEmpty()) {
                    return;
                }
                abstractC14846.mo14019(number, 2);
                Iterator it = list.iterator();
                int iM22891 = 0;
                while (it.hasNext()) {
                    iM22891 += m22891(enumC3440Mo8652, it.next());
                }
                abstractC14846.mo14018(iM22891);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    m22882(abstractC14846, enumC3440Mo8652, it2.next());
                }
                return;
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                m22881(abstractC14846, enumC3440Mo8652, number, it3.next());
            }
            return;
        }
        if (obj instanceof C18971) {
            m22881(abstractC14846, enumC3440Mo8652, number, ((C18971) obj).m44067());
        } else {
            m22881(abstractC14846, enumC3440Mo8652, number, obj);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m22911() {
        C22636 c22636;
        int i = 0;
        int iM22890 = 0;
        while (true) {
            c22636 = this.f27924;
            if (i >= c22636.m51024()) {
                break;
            }
            Map.Entry entryM51025 = c22636.m51025(i);
            iM22890 += m22890((InterfaceC2585) entryM51025.getKey(), entryM51025.getValue());
            i++;
        }
        for (Map.Entry entry : c22636.m51026()) {
            iM22890 += m22890((InterfaceC2585) entry.getKey(), entry.getValue());
        }
        return iM22890;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m22905() {
        C22636 c22636;
        int i = 0;
        int iM22889 = 0;
        while (true) {
            c22636 = this.f27924;
            if (i >= c22636.m51024()) {
                break;
            }
            iM22889 += m22889(c22636.m51025(i));
            i++;
        }
        Iterator it = c22636.m51026().iterator();
        while (it.hasNext()) {
            iM22889 += m22889((Map.Entry) it.next());
        }
        return iM22889;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m22889(Map.Entry entry) {
        int iM35764;
        int iM35774;
        InterfaceC2585 interfaceC2585 = (InterfaceC2585) entry.getKey();
        Object value = entry.getValue();
        if (interfaceC2585.mo8651() == EnumC20594.MESSAGE && !interfaceC2585.mo8649() && !interfaceC2585.mo8650()) {
            if (value instanceof C18971) {
                int number = ((InterfaceC2585) entry.getKey()).getNumber();
                iM35764 = AbstractC14846.m35764(2, number) + (AbstractC14846.m35765(1) * 2);
                iM35774 = AbstractC14846.m35759(3, (C18971) value);
            } else {
                int number2 = ((InterfaceC2585) entry.getKey()).getNumber();
                iM35764 = AbstractC14846.m35764(2, number2) + (AbstractC14846.m35765(1) * 2);
                iM35774 = AbstractC14846.m35774(3, (InterfaceC18775) value);
            }
            return iM35774 + iM35764;
        }
        return m22890(interfaceC2585, value);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m22891(EnumC3440 enumC3440, Object obj) {
        int iM25869;
        AbstractC17084 abstractC17084;
        switch (C1094.f3901[enumC3440.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                int i = AbstractC14846.f48541;
                return 8;
            case 2:
                ((Float) obj).getClass();
                int i2 = AbstractC14846.f48541;
                return 4;
            case 3:
                return AbstractC14846.m35762(((Long) obj).longValue());
            case 4:
                return AbstractC14846.m35762(((Long) obj).longValue());
            case 5:
                return AbstractC14846.m35762(((Integer) obj).intValue());
            case 6:
                ((Long) obj).getClass();
                int i3 = AbstractC14846.f48541;
                return 8;
            case 7:
                ((Integer) obj).getClass();
                int i4 = AbstractC14846.f48541;
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                int i5 = AbstractC14846.f48541;
                return 1;
            case 9:
                int i6 = AbstractC14846.f48541;
                return ((InterfaceC18775) obj).getSerializedSize();
            case 10:
                if (obj instanceof C18971) {
                    int i7 = AbstractC14846.f48541;
                    iM25869 = ((C18971) obj).m25869();
                    return AbstractC14846.m35763(iM25869) + iM25869;
                }
                return AbstractC14846.m35770((InterfaceC18775) obj);
            case 11:
                if (obj instanceof AbstractC17084) {
                    abstractC17084 = (AbstractC17084) obj;
                    int i8 = AbstractC14846.f48541;
                    iM25869 = abstractC17084.size();
                    return AbstractC14846.m35763(iM25869) + iM25869;
                }
                return AbstractC14846.m35769((String) obj);
            case 12:
                if (obj instanceof AbstractC17084) {
                    abstractC17084 = (AbstractC17084) obj;
                    int i9 = AbstractC14846.f48541;
                    iM25869 = abstractC17084.size();
                } else {
                    int i10 = AbstractC14846.f48541;
                    iM25869 = ((byte[]) obj).length;
                }
                return AbstractC14846.m35763(iM25869) + iM25869;
            case 13:
                return AbstractC14846.m35763(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i11 = AbstractC14846.f48541;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i12 = AbstractC14846.f48541;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return AbstractC14846.m35763((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return AbstractC14846.m35762((jLongValue >> 63) ^ (jLongValue << 1));
            case 18:
                return obj instanceof InterfaceC5547 ? AbstractC14846.m35762(((InterfaceC5547) obj).getNumber()) : AbstractC14846.m35762(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m22890(InterfaceC2585 interfaceC2585, Object obj) {
        EnumC3440 enumC3440Mo8652 = interfaceC2585.mo8652();
        int number = interfaceC2585.getNumber();
        if (!interfaceC2585.mo8649()) {
            int iM35765 = AbstractC14846.m35765(number);
            if (enumC3440Mo8652 == EnumC3440.f11209) {
                iM35765 *= 2;
            }
            return iM35765 + m22891(enumC3440Mo8652, obj);
        }
        List list = (List) obj;
        int iM22891 = 0;
        if (interfaceC2585.mo8650()) {
            if (list.isEmpty()) {
                return 0;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iM22891 += m22891(enumC3440Mo8652, it.next());
            }
            return AbstractC14846.m35763(iM22891) + AbstractC14846.m35765(number) + iM22891;
        }
        for (Object obj2 : list) {
            int iM35766 = AbstractC14846.m35765(number);
            if (enumC3440Mo8652 == EnumC3440.f11209) {
                iM35766 *= 2;
            }
            iM22891 += iM35766 + m22891(enumC3440Mo8652, obj2);
        }
        return iM22891;
    }
}
