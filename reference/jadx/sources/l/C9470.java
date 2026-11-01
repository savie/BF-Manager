package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۢ۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 89PP */
/* JADX INFO: loaded from: classes3.dex */
public final class C9470 extends AbstractC4860 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C14409 f32034;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12292 f32035;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public volatile EnumC1707 f32036;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f32037;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f32038;

    public C9470() {
        throw null;
    }

    public C9470(InterfaceC12292 interfaceC12292, EnumC1707 enumC1707, LinkedHashMap linkedHashMap) {
        this.f32035 = interfaceC12292;
        this.f32038 = true;
        this.f32036 = enumC1707;
        this.f32034 = new C14409(this, linkedHashMap);
        this.f32037 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9470 m24241(C0296 c0296) {
        return new C9470(new C17230(c0296), EnumC1707.MAP, new LinkedHashMap());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m24240(C14409 c14409) {
        ArrayList arrayList = new ArrayList();
        C10881 c10881 = (C10881) ((C23581) c14409.entrySet()).iterator();
        if (!c10881.hasNext()) {
            return arrayList;
        }
        Map.Entry entry = (Map.Entry) c10881.next();
        entry.getKey();
        entry.getValue();
        ((C17230) this.f32035).m40168();
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14409 m24242(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC1332 interfaceC1332 = (InterfaceC1332) it.next();
            ((C17230) this.f32035).getClass();
            ((C0296) interfaceC1332).getClass();
            linkedHashMap.put(null, null);
        }
        return new C14409(this, linkedHashMap);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Map m24248() {
        EnumC1707 enumC1707 = this.f32036;
        EnumC1707 enumC1708 = EnumC1707.LIST;
        if (enumC1707 == enumC1708) {
            synchronized (this) {
                if (this.f32036 == enumC1708) {
                    this.f32034 = m24242(this.f32037);
                    this.f32036 = EnumC1707.BOTH;
                }
            }
        }
        return C0561.unmodifiableMap(this.f32034);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Map m24243() {
        EnumC1707 enumC1707 = this.f32036;
        EnumC1707 enumC1708 = EnumC1707.MAP;
        if (enumC1707 != enumC1708) {
            if (this.f32036 == EnumC1707.LIST) {
                this.f32034 = m24242(this.f32037);
            }
            this.f32037 = null;
            this.f32036 = enumC1708;
        }
        return this.f32034;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9470) {
            return C3118.m9386(m24248(), ((C9470) obj).m24248());
        }
        return false;
    }

    public final int hashCode() {
        return C3118.m9385(m24248());
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m24244() {
        new C9470(this.f32035, EnumC1707.MAP, C3118.m9388(m24248()));
    }

    @Override // l.AbstractC4860
    /* JADX INFO: renamed from: ۙ */
    public final List mo13557() {
        EnumC1707 enumC1707 = this.f32036;
        EnumC1707 enumC1708 = EnumC1707.MAP;
        if (enumC1707 == enumC1708) {
            synchronized (this) {
                if (this.f32036 == enumC1708) {
                    this.f32037 = m24240(this.f32034);
                    this.f32036 = EnumC1707.BOTH;
                }
            }
        }
        return C0561.unmodifiableList(this.f32037);
    }

    @Override // l.AbstractC4860
    /* JADX INFO: renamed from: ۨ */
    public final List mo13558() {
        EnumC1707 enumC1707 = this.f32036;
        EnumC1707 enumC1708 = EnumC1707.LIST;
        if (enumC1707 != enumC1708) {
            if (this.f32036 == EnumC1707.MAP) {
                this.f32037 = m24240(this.f32034);
            }
            this.f32034 = null;
            this.f32036 = enumC1708;
        }
        return this.f32037;
    }

    @Override // l.AbstractC4860
    /* JADX INFO: renamed from: ܰ */
    public final C0296 mo13559() {
        return ((C17230) this.f32035).m40169();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m24245() {
        this.f32038 = false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m24246() {
        if (!this.f32038) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m24247() {
        return this.f32038;
    }
}
