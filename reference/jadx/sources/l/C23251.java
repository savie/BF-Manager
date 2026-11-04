package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89PP */
/* JADX INFO: loaded from: classes.dex */
public final class C23251 extends AbstractC20267 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5351 f75330;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f75331;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public volatile EnumC15791 f75332;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile boolean f75333;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C17283 f75334;

    public C23251() {
        throw null;
    }

    public C23251(InterfaceC5351 interfaceC5351, EnumC15791 enumC15791, LinkedHashMap linkedHashMap) {
        this.f75330 = interfaceC5351;
        this.f75333 = true;
        this.f75332 = enumC15791;
        this.f75334 = new C17283(this, linkedHashMap);
        this.f75331 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23251 m52268(C15045 c15045) {
        return new C23251(new C1622(c15045), EnumC15791.MAP, new LinkedHashMap());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m52266(C17283 c17283) {
        ArrayList arrayList = new ArrayList();
        C24743 c24743 = (C24743) ((C16537) c17283.entrySet()).iterator();
        if (!c24743.hasNext()) {
            return arrayList;
        }
        Map.Entry entry = (Map.Entry) c24743.next();
        entry.getKey();
        entry.getValue();
        ((C1622) this.f75330).m5721();
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C17283 m52267(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC21013 interfaceC21013 = (InterfaceC21013) it.next();
            ((C1622) this.f75330).getClass();
            ((C15045) interfaceC21013).getClass();
            linkedHashMap.put(null, null);
        }
        return new C17283(this, linkedHashMap);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Map m52272() {
        EnumC15791 enumC15791 = this.f75332;
        EnumC15791 enumC15792 = EnumC15791.LIST;
        if (enumC15791 == enumC15792) {
            synchronized (this) {
                if (this.f75332 == enumC15792) {
                    this.f75334 = m52267(this.f75331);
                    this.f75332 = EnumC15791.BOTH;
                }
            }
        }
        return C4681.unmodifiableMap(this.f75334);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Map m52271() {
        EnumC15791 enumC15791 = this.f75332;
        EnumC15791 enumC15792 = EnumC15791.MAP;
        if (enumC15791 != enumC15792) {
            if (this.f75332 == EnumC15791.LIST) {
                this.f75334 = m52267(this.f75331);
            }
            this.f75331 = null;
            this.f75332 = enumC15792;
        }
        return this.f75334;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C23251) {
            return C3113.m10187(m52272(), ((C23251) obj).m52272());
        }
        return false;
    }

    public final int hashCode() {
        return C3113.m10186(m52272());
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m52274() {
        new C23251(this.f75330, EnumC15791.MAP, C3113.m10189(m52272()));
    }

    @Override // l.AbstractC20267
    /* JADX INFO: renamed from: ۙ */
    public final List mo46533() {
        EnumC15791 enumC15791 = this.f75332;
        EnumC15791 enumC15792 = EnumC15791.MAP;
        if (enumC15791 == enumC15792) {
            synchronized (this) {
                if (this.f75332 == enumC15792) {
                    this.f75331 = m52266(this.f75334);
                    this.f75332 = EnumC15791.BOTH;
                }
            }
        }
        return C4681.unmodifiableList(this.f75331);
    }

    @Override // l.AbstractC20267
    /* JADX INFO: renamed from: ۤ */
    public final List mo46534() {
        EnumC15791 enumC15791 = this.f75332;
        EnumC15791 enumC15792 = EnumC15791.LIST;
        if (enumC15791 != enumC15792) {
            if (this.f75332 == EnumC15791.MAP) {
                this.f75331 = m52266(this.f75334);
            }
            this.f75334 = null;
            this.f75332 = enumC15792;
        }
        return this.f75331;
    }

    @Override // l.AbstractC20267
    /* JADX INFO: renamed from: ᩷ */
    public final C15045 mo46535() {
        return ((C1622) this.f75330).m5722();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52269() {
        this.f75333 = false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m52270() {
        return this.f75333;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m52273() {
        if (!this.f75333) {
            throw new UnsupportedOperationException();
        }
    }
}
