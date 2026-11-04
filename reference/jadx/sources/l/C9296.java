package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29QV */
/* JADX INFO: loaded from: classes3.dex */
public final class C9296 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1050 f30228;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f30229;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f30230;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f30231;

    public C9296(int i) {
        int i2 = C22636.f73524;
        this.f30228 = new C1050(16);
        this.f30231 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8551 m24517() {
        return m24509(false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8551 m24525() {
        return m24509(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C8551 m24509(boolean z) {
        if (this.f30228.isEmpty()) {
            return C8551.m22888();
        }
        this.f30231 = false;
        C1050 c1050M22876 = this.f30228;
        if (this.f30229) {
            c1050M22876 = C8551.m22876((C22636) c1050M22876, false, false);
            m24511(c1050M22876, z);
        }
        C8551 c8551 = new C8551(c1050M22876, 0);
        c8551.f27926 = this.f30230;
        return c8551;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24511(C1050 c1050, boolean z) {
        for (int i = 0; i < c1050.m51024(); i++) {
            Map.Entry entryM51025 = c1050.m51025(i);
            entryM51025.setValue(m24508((InterfaceC2585) entryM51025.getKey(), entryM51025.getValue(), z));
        }
        for (Map.Entry entry : c1050.m51026()) {
            entry.setValue(m24508((InterfaceC2585) entry.getKey(), entry.getValue(), z));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m24508(InterfaceC2585 interfaceC2585, Object obj, boolean z) {
        if (obj == null || interfaceC2585.mo8651() != EnumC20594.MESSAGE) {
            return obj;
        }
        if (interfaceC2585.mo8649()) {
            if (!(obj instanceof List)) {
                throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
            }
            List arrayList = (List) obj;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj2 = arrayList.get(i);
                Object objM24507 = m24507(obj2, z);
                if (objM24507 != obj2) {
                    if (arrayList == obj) {
                        arrayList = new ArrayList(arrayList);
                    }
                    arrayList.set(i, objM24507);
                }
            }
            return arrayList;
        }
        return m24507(obj, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m24507(Object obj, boolean z) {
        if (!(obj instanceof InterfaceC7588)) {
            return obj;
        }
        InterfaceC7588 interfaceC7588 = (InterfaceC7588) obj;
        if (z) {
            return interfaceC7588.buildPartial();
        }
        return interfaceC7588.build();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Map m24522() {
        if (!this.f30230) {
            return this.f30228.m51023() ? this.f30228 : C4681.unmodifiableMap(this.f30228);
        }
        C1050 c1050M22876 = C8551.m22876((C22636) this.f30228, false, true);
        if (this.f30228.m51023()) {
            c1050M22876.mo3949();
            return c1050M22876;
        }
        m24511(c1050M22876, true);
        return c1050M22876;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m24523(C7323 c7323) {
        if (c7323.mo8649()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f30228.get(c7323) != null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m24524(C7323 c7323) {
        return m24508((InterfaceC2585) c7323, m24514((InterfaceC2585) c7323), true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m24514(InterfaceC2585 interfaceC2585) {
        Object obj = this.f30228.get(interfaceC2585);
        return obj instanceof C18971 ? ((C18971) obj).m44067() : obj;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m24513() {
        if (this.f30231) {
            return;
        }
        this.f30228 = C8551.m22876((C22636) this.f30228, true, false);
        this.f30231 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m24526(C7323 c7323, Object obj) {
        m24513();
        if (c7323.mo8649()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList((List) obj);
            for (Object obj2 : arrayList) {
                m24512((InterfaceC2585) c7323, obj2);
                this.f30229 = this.f30229 || (obj2 instanceof InterfaceC7588);
            }
            obj = arrayList;
        } else {
            m24512((InterfaceC2585) c7323, obj);
        }
        if (obj instanceof C18971) {
            this.f30230 = true;
        }
        this.f30229 = this.f30229 || (obj instanceof InterfaceC7588);
        this.f30228.m51021(c7323, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24518(C7323 c7323) {
        m24513();
        this.f30228.remove(c7323);
        if (this.f30228.isEmpty()) {
            this.f30230 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m24516(C7323 c7323, int i) {
        if (this.f30229) {
            m24513();
        }
        return m24507(m24515((InterfaceC2585) c7323, i), true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m24515(InterfaceC2585 interfaceC2585, int i) {
        if (!interfaceC2585.mo8649()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objM24514 = m24514(interfaceC2585);
        if (objM24514 == null) {
            throw new IndexOutOfBoundsException();
        }
        return ((List) objM24514).get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24519(C7323 c7323, int i, Object obj) {
        m24513();
        if (!c7323.mo8649()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        this.f30229 = this.f30229 || (obj instanceof InterfaceC7588);
        Object objM24514 = m24514((InterfaceC2585) c7323);
        if (objM24514 == null) {
            throw new IndexOutOfBoundsException();
        }
        m24512((InterfaceC2585) c7323, obj);
        ((List) objM24514).set(i, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24520(C7323 c7323, Object obj) {
        List arrayList;
        m24513();
        if (!c7323.mo8649()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        this.f30229 = this.f30229 || (obj instanceof InterfaceC7588);
        m24512((InterfaceC2585) c7323, obj);
        Object objM24514 = m24514((InterfaceC2585) c7323);
        if (objM24514 == null) {
            arrayList = new ArrayList();
            this.f30228.m51021(c7323, arrayList);
        } else {
            arrayList = (List) objM24514;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24512(InterfaceC2585 interfaceC2585, Object obj) {
        if (C8551.m22887(interfaceC2585.mo8652(), obj)) {
            return;
        }
        if (interfaceC2585.mo8652().m11207() != EnumC20594.MESSAGE || !(obj instanceof InterfaceC7588)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC2585.getNumber()), interfaceC2585.mo8652().m11207(), obj.getClass().getName()));
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m24527() {
        for (int i = 0; i < this.f30228.m51024(); i++) {
            if (!C8551.m22886(this.f30228.m51025(i))) {
                return false;
            }
        }
        Iterator it = this.f30228.m51026().iterator();
        while (it.hasNext()) {
            if (!C8551.m22886((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24521(C8551 c8551) {
        m24513();
        for (int i = 0; i < c8551.f27924.m51024(); i++) {
            m24510(c8551.f27924.m51025(i));
        }
        Iterator it = c8551.f27924.m51026().iterator();
        while (it.hasNext()) {
            m24510((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24510(Map.Entry entry) {
        InterfaceC2585 interfaceC2585 = (InterfaceC2585) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof C18971;
        if (interfaceC2585.mo8649()) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            List arrayList = (List) m24514(interfaceC2585);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f30228.m51021(interfaceC2585, arrayList);
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                arrayList.add(C8551.m22892(it.next()));
            }
            return;
        }
        if (interfaceC2585.mo8651() != EnumC20594.MESSAGE) {
            if (!z) {
                this.f30228.m51021(interfaceC2585, C8551.m22892(value));
                return;
            }
            throw new IllegalStateException("Lazy fields must be message-valued");
        }
        Object objM24514 = m24514(interfaceC2585);
        if (objM24514 == null) {
            this.f30228.m51021(interfaceC2585, C8551.m22892(value));
            if (z) {
                this.f30230 = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((C18971) value).m44067();
        }
        if (objM24514 instanceof InterfaceC7588) {
            interfaceC2585.mo8648((InterfaceC7588) objM24514, (InterfaceC18775) value);
        } else {
            this.f30228.m51021(interfaceC2585, interfaceC2585.mo8648(((InterfaceC18775) objM24514).toBuilder(), (InterfaceC18775) value).build());
        }
    }
}
