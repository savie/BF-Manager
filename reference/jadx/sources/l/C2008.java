package l;

import android.util.SparseArray;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֫ܶۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81EW */
/* JADX INFO: loaded from: classes3.dex */
public final class C2008 extends AbstractC22891 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f6679;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f6680;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ArrayList f6681;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C20528 f6677 = new C20528(10000);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C20528 f6676 = new C20528(10000);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C20528 f6678 = new C20528();

    @Override // l.AbstractC22891
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean mo6861() {
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m6852() {
        f6677.m47062();
        f6676.m47062();
    }

    public C2008() {
        ArrayList arrayList = (ArrayList) f6677.m47061();
        this.f6681 = arrayList == null ? new ArrayList(1) : arrayList;
        ArrayList arrayList2 = (ArrayList) f6676.m47061();
        this.f6680 = arrayList2 == null ? new ArrayList(1) : arrayList2;
    }

    @Override // l.AbstractC22891
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6857(C20348 c20348, SparseArray sparseArray) throws IOException {
        AbstractC22891 c16923;
        String str = (String) sparseArray.get(c20348.m46741());
        C17359.requireNonNull(str);
        this.f6679 = str;
        this.f74367 = c20348.m46741();
        this.f74366 = c20348.m46741();
        this.f74369 = c20348.m46741();
        this.f74368 = c20348.m46741();
        int iM46741 = c20348.m46741();
        int iM46742 = c20348.m46741();
        ArrayList arrayList = this.f6681;
        arrayList.clear();
        ArrayList arrayList2 = this.f6680;
        arrayList2.clear();
        arrayList.ensureCapacity(iM46741);
        for (int i = 0; i < iM46741; i++) {
            C5737 c5737 = new C5737();
            String str2 = (String) sparseArray.get(c20348.m46741());
            C17359.requireNonNull(str2);
            c5737.f19745 = str2;
            String str3 = (String) sparseArray.get(c20348.m46741());
            C17359.requireNonNull(str3);
            c5737.f19750 = str3;
            c5737.f19753 = c20348.m46741();
            c5737.f19752 = c20348.m46741();
            c5737.f19751 = c20348.m46741();
            c5737.f19747 = c20348.m46741();
            c5737.f19744 = c20348.m46741();
            c5737.f19749 = c20348.m46741();
            c5737.f19748 = c20348.m46741();
            c5737.f19746 = c20348.m46741();
            arrayList.add(c5737);
        }
        arrayList2.ensureCapacity(iM46742);
        for (int i2 = 0; i2 < iM46742; i2++) {
            int i3 = c20348.readByte() & 255;
            if (i3 == 15) {
                c16923 = new C2008();
            } else if (i3 == 240) {
                c16923 = new C16923();
            } else {
                throw new IOException();
            }
            c16923.mo6857(c20348, sparseArray);
            arrayList2.add(c16923);
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m6862() {
        ArrayList arrayList = this.f6680;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC22891 abstractC22891 = (AbstractC22891) arrayList.get(i);
            if (abstractC22891.mo6861()) {
                abstractC22891.m51622().m6862();
            }
        }
        ArrayList arrayList2 = this.f6681;
        arrayList2.clear();
        f6677.m47060(arrayList2);
        arrayList.clear();
        f6676.m47060(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2008 m6850(String str, boolean z) {
        return m6849(new StringReader(str), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2008 m6849(Reader reader, boolean z) {
        C19205 c19205 = new C19205();
        c19205.m44493(reader);
        C25129 c25129M55999 = C25129.m55999(c19205, z);
        if (c25129M55999.isEmpty()) {
            return new C2008();
        }
        return (C2008) c25129M55999.get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2008 m6851(C20348 c20348) throws IOException {
        SparseArray sparseArray = new SparseArray();
        if (c20348.m46759() == -2106358635) {
            C17364.m40795((InterfaceC15872) c20348, -2106358635);
            int iM46741 = c20348.m46741();
            for (int i = 0; i < iM46741; i++) {
                sparseArray.put(i, c20348.m46758());
            }
            C17364.m40795((InterfaceC15872) c20348, -2106358635);
        } else {
            C17364.m40795((InterfaceC15872) c20348, -2106358634);
            int iM46742 = c20348.m46741();
            for (int i2 = 0; i2 < iM46742; i2++) {
                sparseArray.put(i2, c20348.m46756());
            }
            C17364.m40795((InterfaceC15872) c20348, -2106358634);
        }
        C2008 c2008 = new C2008();
        byte b = c20348.readByte();
        if (b != 15) {
            throw new IOException(String.format("Expected: 0x%02x, got: 0x%02x", (byte) 15, Byte.valueOf(b)));
        }
        c2008.mo6857(c20348, sparseArray);
        return c2008;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6855(C6178 c6178) {
        HashMap map = new HashMap();
        C20528 c20528 = f6678;
        C6178 c6179 = (C6178) c20528.m47061();
        if (c6179 == null) {
            c6179 = new C6178();
        } else {
            c6179.m17793();
        }
        c6179.writeByte(15);
        mo6856(c6179, map);
        c6178.writeInt(-2106358634);
        c6178.m17809(map.size());
        int size = map.size();
        String[] strArr = new String[size];
        for (Map.Entry entry : map.entrySet()) {
            strArr[((Integer) entry.getValue()).intValue()] = (String) entry.getKey();
        }
        for (int i = 0; i < size; i++) {
            c6178.m17786((CharSequence) strArr[i]);
        }
        c6178.writeInt(-2106358634);
        c6178.write(c6179.m17808(), 0, c6179.size());
        c20528.m47060(c6179);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m6853() {
        return this.f6679;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList m6860() {
        return this.f6681;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList m6858() {
        return this.f6680;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Iterator m6847(C2008 c2008) {
        int i = 0;
        return C1170.stream(c2008.f6680).filter(new C19907(i)).map(new C15431(i)).iterator();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Iterator m6848(C2008 c2008, final String str) {
        int i = 0;
        return C1170.stream(c2008.f6680).filter(new C19907(i)).map(new C15431(i)).filter(new Predicate() { // from class: l.۫ܶۤ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((C2008) obj).f6679.equals(str);
            }
        }).iterator();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m6864() {
        ArrayList arrayList = this.f6680;
        return arrayList.isEmpty() || (arrayList.size() == 1 && !((AbstractC22891) arrayList.get(0)).mo6861());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16923 m6859() throws C10254 {
        ArrayList arrayList = this.f6680;
        if (arrayList.isEmpty()) {
            C16923 c16923 = new C16923();
            c16923.f55314 = "";
            c16923.f74367 = this.f74367;
            return c16923;
        }
        AbstractC22891 abstractC22891 = (AbstractC22891) arrayList.get(0);
        if (arrayList.size() != 1 || abstractC22891.mo6861()) {
            throw new C10254("Expected text", abstractC22891);
        }
        if (abstractC22891.mo6861()) {
            throw new UnsupportedOperationException();
        }
        return (C16923) abstractC22891;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5737 m6854(String str) {
        ArrayList arrayList = this.f6681;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C5737 c5737 = (C5737) arrayList.get(i);
            if (c5737.f19745.equals(str)) {
                return c5737;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5737 m6863(String str) throws C10254 {
        C5737 c5737M6854 = m6854(str);
        if (c5737M6854 != null) {
            return c5737M6854;
        }
        throw new C10254("Attribute required: ".concat(str), this);
    }

    public final String toString() {
        return "XmlNode{name='" + this.f6679 + "', line=" + this.f74367 + ", column=" + this.f74366 + ", startPosition=" + this.f74369 + ", endPosition=" + this.f74368 + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2008.class == obj.getClass()) {
            C2008 c2008 = (C2008) obj;
            if (!this.f6681.equals(c2008.f6681) || !this.f6680.equals(c2008.f6680)) {
                return false;
            }
            String str = this.f6679;
            String str2 = c2008.f6679;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f6680.hashCode() + (this.f6681.hashCode() * 31)) * 31;
        String str = this.f6679;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // l.AbstractC22891
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6856(C6178 c6178, HashMap map) {
        AbstractC22891.m51621(c6178, map, this.f6679);
        c6178.m17809(this.f74367);
        c6178.m17809(this.f74366);
        c6178.m17809(this.f74369);
        c6178.m17809(this.f74368);
        ArrayList arrayList = this.f6681;
        c6178.m17809(arrayList.size());
        ArrayList arrayList2 = this.f6680;
        c6178.m17809(arrayList2.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C5737 c5737 = (C5737) arrayList.get(i);
            AbstractC22891.m51621(c6178, map, c5737.f19745);
            AbstractC22891.m51621(c6178, map, c5737.f19750);
            c6178.m17809(c5737.f19753);
            c6178.m17809(c5737.f19752);
            c6178.m17809(c5737.f19751);
            c6178.m17809(c5737.f19747);
            c6178.m17809(c5737.f19744);
            c6178.m17809(c5737.f19749);
            c6178.m17809(c5737.f19748);
            c6178.m17809(c5737.f19746);
        }
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AbstractC22891 abstractC22891 = (AbstractC22891) arrayList2.get(i2);
            c6178.writeByte(abstractC22891.mo6861() ? 15 : 240);
            abstractC22891.mo6856(c6178, map);
        }
    }
}
