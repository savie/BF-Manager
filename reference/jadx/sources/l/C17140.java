package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ܿۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45YI */
/* JADX INFO: loaded from: classes5.dex */
public final class C17140 extends AbstractC3733 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f54673 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public HashMap f54674 = new HashMap();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public HashMap f54675 = new HashMap();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f54676 = new ArrayList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f54677;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m40063(String str) {
        C12202 c12202 = new C12202(this, str);
        this.f54676.add(c12202);
        this.f54674.put(str, c12202);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17140 m40052(InterfaceC5727 interfaceC5727) {
        C12202 c12202;
        C15606[] c15606ArrMo11446;
        C17140 c17140 = new C17140();
        c17140.f54677 = interfaceC5727.mo15780();
        for (InterfaceC12078 interfaceC12078 : ((AbstractC3733) interfaceC5727).m10938()) {
            if (interfaceC12078.mo11445()) {
                if (interfaceC12078 instanceof C12202) {
                    c15606ArrMo11446 = interfaceC12078.mo11444();
                } else {
                    c15606ArrMo11446 = interfaceC12078.mo11446();
                }
                c12202 = new C12202(c17140, interfaceC12078.getValue(), c15606ArrMo11446, false);
            } else {
                c12202 = new C12202(c17140, interfaceC12078.getValue());
            }
            c17140.f54676.add(c12202);
            if (c12202.mo11445()) {
                c17140.f54675.put(c12202, c12202);
            } else {
                c17140.f54674.put(c12202.getValue(), c12202);
            }
        }
        return c17140;
    }

    @Override // l.InterfaceC5727
    public final int size() {
        return this.f54676.size();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m40061() {
        return this.f54676.size();
    }

    @Override // l.InterfaceC5727
    public final C12202 getItem(int i) {
        if (i < 0 || i >= this.f54676.size()) {
            return new C12202(this, "Error!!");
        }
        return (C12202) this.f54676.get(i);
    }

    @Override // l.InterfaceC5727
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC12078 mo15779(int i) {
        if (i < 0 || i >= this.f54676.size()) {
            throw C20149.m45565(i, this.f54676.size());
        }
        return (InterfaceC12078) this.f54676.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40060(boolean z) {
        this.f54677 = z;
    }

    @Override // l.InterfaceC5727
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15780() {
        return this.f54677;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m40064() {
        Iterator it = this.f54676.iterator();
        while (it.hasNext()) {
            ((C12202) it.next()).f40807 = false;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m40054() {
        HashSet hashSet = new HashSet();
        for (C12202 c12202 : this.f54676) {
            if (c12202.f40807 && c12202.mo11445()) {
                for (C15606 c15606 : c12202.mo11444()) {
                    hashSet.add(c15606.f50740);
                }
            }
        }
        ArrayList arrayList = new ArrayList(this.f54676.size());
        for (C12202 c12203 : this.f54676) {
            if (c12203.f40807 || (!c12203.mo11445() && hashSet.contains(c12203.getValue()))) {
                arrayList.add(c12203);
            } else if (c12203.mo11445()) {
                this.f54675.remove(c12203);
            } else {
                this.f54674.remove(c12203.getValue());
            }
        }
        this.f54676 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C12202 m40058(String str, C15606[] c15606Arr) {
        try {
            if (c15606Arr != null) {
                C12202 c12202 = new C12202(this, str, c15606Arr, true);
                C12202 c12203 = (C12202) this.f54675.get(c12202);
                if (c12203 != null) {
                    return c12203;
                }
                this.f54676.add(c12202);
                this.f54675.put(c12202, c12202);
                return c12202;
            }
            return m40055(str);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized C12202 m40055(String str) {
        C12202 c12202 = (C12202) this.f54674.get(str);
        if (c12202 != null) {
            if (c12202.mo11445() || !c12202.getValue().equals(str)) {
                throw new RuntimeException("No-Style item from map has been modified.");
            }
            return c12202;
        }
        C12202 c12203 = new C12202(this, str);
        this.f54676.add(c12203);
        this.f54674.put(str, c12203);
        return c12203;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m40056() {
        boolean z = true;
        for (int i = 0; i < this.f54676.size(); i++) {
            C12202 c12202 = (C12202) this.f54676.get(i);
            if (c12202.mo11445()) {
                if (!z) {
                    LinkedList linkedList = new LinkedList();
                    LinkedList linkedList2 = new LinkedList();
                    for (C12202 c12203 : this.f54676) {
                        if (c12203.mo11445()) {
                            linkedList.add(c12203);
                        } else {
                            linkedList2.add(c12203);
                        }
                    }
                    this.f54676.clear();
                    this.f54676.addAll(linkedList);
                    this.f54676.addAll(linkedList2);
                    for (int i2 = 0; i2 < this.f54676.size(); i2++) {
                        ((C12202) this.f54676.get(i2)).f40806 = i2;
                    }
                    return;
                }
            } else if (z) {
                z = false;
            }
            c12202.f40806 = i;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m40062(String str) {
        for (int i = 0; i < this.f54676.size(); i++) {
            C12202 c12202 = (C12202) this.f54676.get(i);
            if (!c12202.mo11445() && c12202.getValue().equals(str)) {
                return i;
            }
        }
        C12202 c12203 = new C12202(this, str);
        this.f54676.add(c12203);
        this.f54674.put(str, c12203);
        return this.f54676.size() - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m40057(C12202 c12202) {
        for (int i = 0; i < this.f54676.size(); i++) {
            if (this.f54676.get(i) == c12202) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40059(InterfaceC16662 interfaceC16662, boolean z, C8516 c8516) {
        int[] iArr;
        long j;
        ArrayList arrayList;
        int i;
        int[] iArr2;
        long j2;
        int i2;
        long j3;
        if (z) {
            m40056();
        } else {
            for (int i3 = 0; i3 < this.f54676.size(); i3++) {
                ((C12202) this.f54676.get(i3)).f40806 = i3;
            }
        }
        int i4 = 1;
        interfaceC16662.mo24505((short) 1);
        interfaceC16662.mo24505((short) 28);
        long position = interfaceC16662.getPosition();
        interfaceC16662.mo24500();
        int size = this.f54676.size();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC12078 interfaceC12078 : m10938()) {
            if (!interfaceC12078.mo11445()) {
                break;
            } else {
                arrayList2.add(interfaceC12078.getStyle());
            }
        }
        boolean z2 = this.f54677;
        if (!z2) {
            iArr = null;
            break;
        }
        iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            String value = getItem(i5).getValue();
            long jM52795 = C23967.m52795(value, true);
            if (value.length() > 32767 || jM52795 > 32767) {
                z2 = false;
                iArr = null;
                break;
            }
            iArr[i5] = (int) jM52795;
        }
        interfaceC16662.writeInt(size);
        interfaceC16662.writeInt(arrayList2.size());
        interfaceC16662.writeInt(z2 ? 256 : 0);
        long j4 = size;
        int iM40050 = m40050(((((long) arrayList2.size()) + j4) * 4) + 28, "strings offset");
        interfaceC16662.writeInt(iM40050);
        long position2 = interfaceC16662.getPosition();
        interfaceC16662.mo24500();
        interfaceC16662.skipBytes(m40050(j4 * 4, "string offset array size"));
        interfaceC16662.skipBytes(m40050(((long) arrayList2.size()) * 4, "style offset array size"));
        int[] iArr3 = new int[size];
        if (z2) {
            C15952 c15952 = new C15952(interfaceC16662);
            int i6 = 0;
            j2 = 0;
            while (i6 < size) {
                int i7 = iM40050;
                if (c8516 != null) {
                    c8516.m22242(1);
                }
                iArr3[i6] = m40050(j2, "string offset");
                String value2 = getItem(i6).getValue();
                long j5 = position;
                int length = value2.length();
                int i8 = iArr[i6];
                int i9 = size;
                long j6 = i8;
                m40050(((long) (m40053(length) + m40053(i8))) + j6 + 1 + j2, "string data size");
                long jM40051 = j2 + ((long) m40051(interfaceC16662, length)) + ((long) m40051(interfaceC16662, i8));
                C23967.m52799((InterfaceC4397) c15952, (CharSequence) value2, true);
                interfaceC16662.writeByte(0);
                j2 = jM40051 + j6 + 1;
                i6++;
                iM40050 = i7;
                size = i9;
                iArr = iArr;
                position = j5;
                iArr3 = iArr3;
                arrayList2 = arrayList2;
            }
            j = position;
            arrayList = arrayList2;
            i = iM40050;
            iArr2 = iArr3;
        } else {
            j = position;
            arrayList = arrayList2;
            i = iM40050;
            iArr2 = iArr3;
            int i10 = 0;
            j2 = 0;
            while (i10 < size) {
                if (c8516 != null) {
                    c8516.m22242(i4);
                }
                iArr2[i10] = m40050(j2, "string offset");
                String value3 = getItem(i10).getValue();
                int length2 = value3.length();
                if (length2 < 0) {
                    throw new IOException(C8479.m22141(length2, "UTF-16 string length is out of range: "));
                }
                long j7 = ((long) length2) * 2;
                m40050(((long) (length2 <= 32767 ? 2 : 4)) + j7 + 2 + j2, "string data size");
                if (length2 < 0) {
                    throw new IOException(C8479.m22141(length2, "UTF-16 string length is out of range: "));
                }
                if (length2 <= 32767) {
                    interfaceC16662.mo24505((short) length2);
                    i2 = 2;
                } else {
                    interfaceC16662.mo24505((short) ((length2 >>> 16) | 32768));
                    interfaceC16662.mo24505((short) (65535 & length2));
                    i2 = 4;
                }
                long j8 = j2 + ((long) i2);
                for (int i11 = 0; i11 < length2; i11++) {
                    interfaceC16662.mo24501(value3.charAt(i11));
                }
                interfaceC16662.mo24505((short) 0);
                j2 = j8 + j7 + 2;
                i10++;
                i4 = 1;
            }
        }
        int i12 = (int) (j2 % 4);
        if (i12 != 0) {
            int i13 = 4 - i12;
            for (int i14 = 0; i14 < i13; i14++) {
                interfaceC16662.writeByte(0);
                j2++;
            }
        }
        int iM40051 = m40050(j2, "string data size");
        int size2 = arrayList.size();
        int[] iArr4 = new int[size2];
        if (size2 > 0) {
            long jM19505 = 0;
            for (int i15 = 0; i15 < size2; i15++) {
                iArr4[i15] = m40050(jM19505, "style offset");
                int[] iArr5 = (int[]) arrayList.get(i15);
                jM19505 = C7309.m19505(iArr5.length, 4L, 4L, jM19505);
                m40050(jM19505, "style data size");
                interfaceC16662.mo24506(iArr5);
                interfaceC16662.writeInt(-1);
            }
            j3 = jM19505 + 8;
            m40050(j3, "style data size");
            interfaceC16662.writeInt(-1);
            interfaceC16662.writeInt(-1);
        } else {
            j3 = 0;
        }
        m40050(j3, "style data size");
        long position3 = interfaceC16662.getPosition();
        long j9 = j;
        interfaceC16662.seek(j9);
        interfaceC16662.writeInt(m40050((position3 - j9) + 4, "string pool chunk size"));
        interfaceC16662.seek(position2);
        interfaceC16662.writeInt(arrayList.isEmpty() ? 0 : m40050(((long) i) + ((long) iM40051), "style offset"));
        interfaceC16662.mo24506(iArr2);
        interfaceC16662.mo24506(iArr4);
        interfaceC16662.seek(position3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m40051(InterfaceC16662 interfaceC16662, int i) throws IOException {
        if (i < 0 || i > 32767) {
            throw new IOException(C8479.m22141(i, "UTF-8 string length is out of range: "));
        }
        if (i <= 127) {
            interfaceC16662.writeByte(i);
            return 1;
        }
        interfaceC16662.writeByte((i >>> 8) | 128);
        interfaceC16662.writeByte(i & 255);
        return 2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m40053(int i) throws IOException {
        if (i < 0 || i > 32767) {
            throw new IOException(C8479.m22141(i, "UTF-8 string length is out of range: "));
        }
        return i <= 127 ? 1 : 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m40050(long j, String str) throws IOException {
        if (j >= 0 && j <= 2147483647L) {
            return (int) j;
        }
        throw new IOException(str + " is too large: " + j);
    }
}
