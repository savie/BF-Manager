package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 29QV */
/* JADX INFO: loaded from: classes4.dex */
public final class C18224 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f58195;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21484 f58196;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f58197;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f58198;

    public C18224(int i) {
        int i2 = C15841.f51267;
        this.f58196 = new C21484(16);
        this.f58195 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8347 m42362() {
        return m42353(false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C8347 m42370() {
        return m42353(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C8347 m42353(boolean z) {
        if (this.f58196.isEmpty()) {
            return C8347.m21825();
        }
        this.f58195 = false;
        C21484 c21484M21815 = this.f58196;
        if (this.f58197) {
            c21484M21815 = C8347.m21815((C15841) c21484M21815, false, false);
            m42356(c21484M21815, z);
        }
        C8347 c8347 = new C8347(c21484M21815, 0);
        c8347.f28928 = this.f58198;
        return c8347;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42356(C21484 c21484, boolean z) {
        for (int i = 0; i < c21484.m37664(); i++) {
            Map.Entry entryM37665 = c21484.m37665(i);
            entryM37665.setValue(m42352((InterfaceC18930) entryM37665.getKey(), entryM37665.getValue(), z));
        }
        for (Map.Entry entry : c21484.m37663()) {
            entry.setValue(m42352((InterfaceC18930) entry.getKey(), entry.getValue(), z));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m42352(InterfaceC18930 interfaceC18930, Object obj, boolean z) {
        if (obj == null || interfaceC18930.mo23410() != EnumC4508.MESSAGE) {
            return obj;
        }
        if (interfaceC18930.mo23408()) {
            if (!(obj instanceof List)) {
                throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
            }
            List arrayList = (List) obj;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj2 = arrayList.get(i);
                Object objM42351 = m42351(obj2, z);
                if (objM42351 != obj2) {
                    if (arrayList == obj) {
                        arrayList = new ArrayList(arrayList);
                    }
                    arrayList.set(i, objM42351);
                }
            }
            return arrayList;
        }
        return m42351(obj, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m42351(Object obj, boolean z) {
        if (!(obj instanceof InterfaceC6977)) {
            return obj;
        }
        InterfaceC6977 interfaceC6977 = (InterfaceC6977) obj;
        if (z) {
            return interfaceC6977.buildPartial();
        }
        return interfaceC6977.build();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Map m42367() {
        if (!this.f58198) {
            return this.f58196.m37662() ? this.f58196 : C0561.unmodifiableMap(this.f58196);
        }
        C21484 c21484M21815 = C8347.m21815((C15841) this.f58196, false, true);
        if (this.f58196.m37662()) {
            c21484M21815.mo37659();
            return c21484M21815;
        }
        m42356(c21484M21815, true);
        return c21484M21815;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m42368(C19741 c19741) {
        if (c19741.mo23408()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f58196.get(c19741) != null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m42369(C19741 c19741) {
        return m42352((InterfaceC18930) c19741, m42359((InterfaceC18930) c19741), true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m42359(InterfaceC18930 interfaceC18930) {
        Object obj = this.f58196.get(interfaceC18930);
        return obj instanceof C22875 ? ((C22875) obj).m50621() : obj;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m42357() {
        if (this.f58195) {
            return;
        }
        this.f58196 = C8347.m21815((C15841) this.f58196, true, false);
        this.f58195 = true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42371(C19741 c19741, Object obj) {
        m42357();
        if (c19741.mo23408()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList((List) obj);
            for (Object obj2 : arrayList) {
                m42355((InterfaceC18930) c19741, obj2);
                this.f58197 = this.f58197 || (obj2 instanceof InterfaceC6977);
            }
            obj = arrayList;
        } else {
            m42355((InterfaceC18930) c19741, obj);
        }
        if (obj instanceof C22875) {
            this.f58198 = true;
        }
        this.f58197 = this.f58197 || (obj instanceof InterfaceC6977);
        this.f58196.m37660(c19741, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42364(C19741 c19741) {
        m42357();
        this.f58196.remove(c19741);
        if (this.f58196.isEmpty()) {
            this.f58198 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m42361(C19741 c19741, int i) {
        if (this.f58197) {
            m42357();
        }
        return m42351(m42360((InterfaceC18930) c19741, i), true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m42360(InterfaceC18930 interfaceC18930, int i) {
        if (!interfaceC18930.mo23408()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objM42359 = m42359(interfaceC18930);
        if (objM42359 == null) {
            throw new IndexOutOfBoundsException();
        }
        return ((List) objM42359).get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42365(C19741 c19741, int i, Object obj) {
        m42357();
        if (!c19741.mo23408()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        this.f58197 = this.f58197 || (obj instanceof InterfaceC6977);
        Object objM42359 = m42359((InterfaceC18930) c19741);
        if (objM42359 == null) {
            throw new IndexOutOfBoundsException();
        }
        m42355((InterfaceC18930) c19741, obj);
        ((List) objM42359).set(i, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42366(C19741 c19741, Object obj) {
        List arrayList;
        m42357();
        if (!c19741.mo23408()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        this.f58197 = this.f58197 || (obj instanceof InterfaceC6977);
        m42355((InterfaceC18930) c19741, obj);
        Object objM42359 = m42359((InterfaceC18930) c19741);
        if (objM42359 == null) {
            arrayList = new ArrayList();
            this.f58196.m37660(c19741, arrayList);
        } else {
            arrayList = (List) objM42359;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42355(InterfaceC18930 interfaceC18930, Object obj) {
        if (C8347.m21828(interfaceC18930.mo23407(), obj)) {
            return;
        }
        if (interfaceC18930.mo23407().m9597() != EnumC4508.MESSAGE || !(obj instanceof InterfaceC6977)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC18930.getNumber()), interfaceC18930.mo23407().m9597(), obj.getClass().getName()));
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m42358() {
        for (int i = 0; i < this.f58196.m37664(); i++) {
            if (!C8347.m21827(this.f58196.m37665(i))) {
                return false;
            }
        }
        Iterator it = this.f58196.m37663().iterator();
        while (it.hasNext()) {
            if (!C8347.m21827((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42363(C8347 c8347) {
        m42357();
        for (int i = 0; i < c8347.f28926.m37664(); i++) {
            m42354(c8347.f28926.m37665(i));
        }
        Iterator it = c8347.f28926.m37663().iterator();
        while (it.hasNext()) {
            m42354((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42354(Map.Entry entry) {
        InterfaceC18930 interfaceC18930 = (InterfaceC18930) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof C22875;
        if (interfaceC18930.mo23408()) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            List arrayList = (List) m42359(interfaceC18930);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f58196.m37660(interfaceC18930, arrayList);
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                arrayList.add(C8347.m21832(it.next()));
            }
            return;
        }
        if (interfaceC18930.mo23410() != EnumC4508.MESSAGE) {
            if (!z) {
                this.f58196.m37660(interfaceC18930, C8347.m21832(value));
                return;
            }
            throw new IllegalStateException("Lazy fields must be message-valued");
        }
        Object objM42359 = m42359(interfaceC18930);
        if (objM42359 == null) {
            this.f58196.m37660(interfaceC18930, C8347.m21832(value));
            if (z) {
                this.f58198 = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((C22875) value).m50621();
        }
        if (objM42359 instanceof InterfaceC6977) {
            interfaceC18930.mo23409((InterfaceC6977) objM42359, (InterfaceC23206) value);
        } else {
            this.f58196.m37660(interfaceC18930, interfaceC18930.mo23409(((InterfaceC23206) objM42359).toBuilder(), (InterfaceC23206) value).build());
        }
    }
}
