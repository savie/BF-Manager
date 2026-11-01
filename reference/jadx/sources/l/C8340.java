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

/* JADX INFO: renamed from: l.۠ᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81EW */
/* JADX INFO: loaded from: classes3.dex */
public final class C8340 extends AbstractC23157 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f28877;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList f28878;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f28879;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C19805 f28876 = new C19805(10000);

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C19805 f28874 = new C19805(10000);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C19805 f28875 = new C19805();

    @Override // l.AbstractC23157
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean mo21788() {
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m21777() {
        f28876.m45012();
        f28874.m45012();
    }

    public C8340() {
        ArrayList arrayList = (ArrayList) f28876.m45009();
        this.f28878 = arrayList == null ? new ArrayList(1) : arrayList;
        ArrayList arrayList2 = (ArrayList) f28874.m45009();
        this.f28879 = arrayList2 == null ? new ArrayList(1) : arrayList2;
    }

    @Override // l.AbstractC23157
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo21783(C17367 c17367, SparseArray sparseArray) throws IOException {
        AbstractC23157 c10457;
        String str = (String) sparseArray.get(c17367.m40454());
        C13638.requireNonNull(str);
        this.f28877 = str;
        this.f75170 = c17367.m40454();
        this.f75169 = c17367.m40454();
        this.f75168 = c17367.m40454();
        this.f75171 = c17367.m40454();
        int iM40454 = c17367.m40454();
        int iM40455 = c17367.m40454();
        ArrayList arrayList = this.f28878;
        arrayList.clear();
        ArrayList arrayList2 = this.f28879;
        arrayList2.clear();
        arrayList.ensureCapacity(iM40454);
        for (int i = 0; i < iM40454; i++) {
            C18923 c18923 = new C18923();
            String str2 = (String) sparseArray.get(c17367.m40454());
            C13638.requireNonNull(str2);
            c18923.f61220 = str2;
            String str3 = (String) sparseArray.get(c17367.m40454());
            C13638.requireNonNull(str3);
            c18923.f61226 = str3;
            c18923.f61218 = c17367.m40454();
            c18923.f61225 = c17367.m40454();
            c18923.f61221 = c17367.m40454();
            c18923.f61223 = c17367.m40454();
            c18923.f61219 = c17367.m40454();
            c18923.f61217 = c17367.m40454();
            c18923.f61222 = c17367.m40454();
            c18923.f61224 = c17367.m40454();
            arrayList.add(c18923);
        }
        arrayList2.ensureCapacity(iM40455);
        for (int i2 = 0; i2 < iM40455; i2++) {
            int i3 = c17367.readByte() & 255;
            if (i3 == 15) {
                c10457 = new C8340();
            } else if (i3 == 240) {
                c10457 = new C10457();
            } else {
                throw new IOException();
            }
            c10457.mo21783(c17367, sparseArray);
            arrayList2.add(c10457);
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m21787() {
        ArrayList arrayList = this.f28879;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC23157 abstractC23157 = (AbstractC23157) arrayList.get(i);
            if (abstractC23157.mo21788()) {
                abstractC23157.m51156().m21787();
            }
        }
        ArrayList arrayList2 = this.f28878;
        arrayList2.clear();
        f28876.m45011(arrayList2);
        arrayList.clear();
        f28874.m45011(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8340 m21775(String str, boolean z) {
        return m21774(new StringReader(str), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8340 m21774(Reader reader, boolean z) {
        C3504 c3504 = new C3504();
        c3504.m10317(reader);
        C9046 c9046M23372 = C9046.m23372(c3504, z);
        if (c9046M23372.isEmpty()) {
            return new C8340();
        }
        return (C8340) c9046M23372.get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8340 m21776(C17367 c17367) throws IOException {
        SparseArray sparseArray = new SparseArray();
        if (c17367.m40449() == -2106358635) {
            C20190.m45649((InterfaceC0433) c17367, -2106358635);
            int iM40454 = c17367.m40454();
            for (int i = 0; i < iM40454; i++) {
                sparseArray.put(i, c17367.m40458());
            }
            C20190.m45649((InterfaceC0433) c17367, -2106358635);
        } else {
            C20190.m45649((InterfaceC0433) c17367, -2106358634);
            int iM40455 = c17367.m40454();
            for (int i2 = 0; i2 < iM40455; i2++) {
                sparseArray.put(i2, c17367.m40442());
            }
            C20190.m45649((InterfaceC0433) c17367, -2106358634);
        }
        C8340 c8340 = new C8340();
        byte b = c17367.readByte();
        if (b != 15) {
            throw new IOException(String.format("Expected: 0x%02x, got: 0x%02x", (byte) 15, Byte.valueOf(b)));
        }
        c8340.mo21783(c17367, sparseArray);
        return c8340;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21781(C11018 c11018) {
        HashMap map = new HashMap();
        C19805 c19805 = f28875;
        C11018 c11019 = (C11018) c19805.m45009();
        if (c11019 == null) {
            c11019 = new C11018();
        } else {
            c11019.m27774();
        }
        c11019.writeByte(15);
        mo21782(c11019, map);
        c11018.writeInt(-2106358634);
        c11018.m27775(map.size());
        int size = map.size();
        String[] strArr = new String[size];
        for (Map.Entry entry : map.entrySet()) {
            strArr[((Integer) entry.getValue()).intValue()] = (String) entry.getKey();
        }
        for (int i = 0; i < size; i++) {
            c11018.m27782((CharSequence) strArr[i]);
        }
        c11018.writeInt(-2106358634);
        c11018.write(c11019.m27788(), 0, c11019.size());
        c19805.m45011(c11019);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m21779() {
        return this.f28877;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList m21778() {
        return this.f28878;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList m21785() {
        return this.f28879;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Iterator m21772(C8340 c8340) {
        int i = 0;
        return C9030.stream(c8340.f28879).filter(new C15396(i)).map(new C21745(i)).iterator();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Iterator m21773(C8340 c8340, final String str) {
        int i = 0;
        return C9030.stream(c8340.f28879).filter(new C15396(i)).map(new C21745(i)).filter(new Predicate() { // from class: l.ᩳᩳۨ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((C8340) obj).f28877.equals(str);
            }
        }).iterator();
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m21789() {
        ArrayList arrayList = this.f28879;
        return arrayList.isEmpty() || (arrayList.size() == 1 && !((AbstractC23157) arrayList.get(0)).mo21788());
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C10457 m21784() throws C4811 {
        ArrayList arrayList = this.f28879;
        if (arrayList.isEmpty()) {
            C10457 c10457 = new C10457();
            c10457.f35694 = "";
            c10457.f75170 = this.f75170;
            return c10457;
        }
        AbstractC23157 abstractC23157 = (AbstractC23157) arrayList.get(0);
        if (arrayList.size() != 1 || abstractC23157.mo21788()) {
            throw new C4811("Expected text", abstractC23157);
        }
        if (abstractC23157.mo21788()) {
            throw new UnsupportedOperationException();
        }
        return (C10457) abstractC23157;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18923 m21780(String str) {
        ArrayList arrayList = this.f28878;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C18923 c18923 = (C18923) arrayList.get(i);
            if (c18923.f61220.equals(str)) {
                return c18923;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18923 m21786(String str) throws C4811 {
        C18923 c18923M21780 = m21780(str);
        if (c18923M21780 != null) {
            return c18923M21780;
        }
        throw new C4811("Attribute required: ".concat(str), this);
    }

    public final String toString() {
        return "XmlNode{name='" + this.f28877 + "', line=" + this.f75170 + ", column=" + this.f75169 + ", startPosition=" + this.f75168 + ", endPosition=" + this.f75171 + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8340.class == obj.getClass()) {
            C8340 c8340 = (C8340) obj;
            if (!this.f28878.equals(c8340.f28878) || !this.f28879.equals(c8340.f28879)) {
                return false;
            }
            String str = this.f28877;
            String str2 = c8340.f28877;
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
        int iHashCode = (this.f28879.hashCode() + (this.f28878.hashCode() * 31)) * 31;
        String str = this.f28877;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // l.AbstractC23157
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo21782(C11018 c11018, HashMap map) {
        AbstractC23157.m51154(c11018, map, this.f28877);
        c11018.m27775(this.f75170);
        c11018.m27775(this.f75169);
        c11018.m27775(this.f75168);
        c11018.m27775(this.f75171);
        ArrayList arrayList = this.f28878;
        c11018.m27775(arrayList.size());
        ArrayList arrayList2 = this.f28879;
        c11018.m27775(arrayList2.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C18923 c18923 = (C18923) arrayList.get(i);
            AbstractC23157.m51154(c11018, map, c18923.f61220);
            AbstractC23157.m51154(c11018, map, c18923.f61226);
            c11018.m27775(c18923.f61218);
            c11018.m27775(c18923.f61225);
            c11018.m27775(c18923.f61221);
            c11018.m27775(c18923.f61223);
            c11018.m27775(c18923.f61219);
            c11018.m27775(c18923.f61217);
            c11018.m27775(c18923.f61222);
            c11018.m27775(c18923.f61224);
        }
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AbstractC23157 abstractC23157 = (AbstractC23157) arrayList2.get(i2);
            c11018.writeByte(abstractC23157.mo21788() ? 15 : 240);
            abstractC23157.mo21782(c11018, map);
        }
    }
}
