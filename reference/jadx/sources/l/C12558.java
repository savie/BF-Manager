package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۨᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45YI */
/* JADX INFO: loaded from: classes4.dex */
public final class C12558 extends AbstractC5101 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f40326 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f40327;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public HashMap f40329 = new HashMap();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public HashMap f40328 = new HashMap();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f40330 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m31255(String str) {
        C20763 c20763 = new C20763(this, str);
        this.f40330.add(c20763);
        this.f40329.put(str, c20763);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12558 m31245(InterfaceC3412 interfaceC3412) {
        C20763 c20763;
        C25042[] c25042ArrMo8824;
        C12558 c12558 = new C12558();
        c12558.f40327 = interfaceC3412.mo11157();
        for (InterfaceC16090 interfaceC16090 : ((AbstractC5101) interfaceC3412).m15440()) {
            if (interfaceC16090.mo8825()) {
                if (interfaceC16090 instanceof C20763) {
                    c25042ArrMo8824 = interfaceC16090.mo8826();
                } else {
                    c25042ArrMo8824 = interfaceC16090.mo8824();
                }
                c20763 = new C20763(c12558, interfaceC16090.getValue(), c25042ArrMo8824, false);
            } else {
                c20763 = new C20763(c12558, interfaceC16090.getValue());
            }
            c12558.f40330.add(c20763);
            if (c20763.mo8825()) {
                c12558.f40328.put(c20763, c20763);
            } else {
                c12558.f40329.put(c20763.getValue(), c20763);
            }
        }
        return c12558;
    }

    @Override // l.InterfaceC3412
    public final int size() {
        return this.f40330.size();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m31254() {
        return this.f40330.size();
    }

    @Override // l.InterfaceC3412
    public final C20763 getItem(int i) {
        if (i < 0 || i >= this.f40330.size()) {
            return new C20763(this, "Error!!");
        }
        return (C20763) this.f40330.get(i);
    }

    @Override // l.InterfaceC3412
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC16090 mo11156(int i) {
        if (i < 0 || i >= this.f40330.size()) {
            throw C12295.m30686(i, this.f40330.size());
        }
        return (InterfaceC16090) this.f40330.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31250(boolean z) {
        this.f40327 = z;
    }

    @Override // l.InterfaceC3412
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11157() {
        return this.f40327;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m31253() {
        Iterator it = this.f40330.iterator();
        while (it.hasNext()) {
            ((C20763) it.next()).f66506 = false;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m31252() {
        HashSet hashSet = new HashSet();
        for (C20763 c20763 : this.f40330) {
            if (c20763.f66506 && c20763.mo8825()) {
                for (C25042 c25042 : c20763.mo8826()) {
                    hashSet.add(c25042.f81015);
                }
            }
        }
        ArrayList arrayList = new ArrayList(this.f40330.size());
        for (C20763 c20764 : this.f40330) {
            if (c20764.f66506 || (!c20764.mo8825() && hashSet.contains(c20764.getValue()))) {
                arrayList.add(c20764);
            } else if (c20764.mo8825()) {
                this.f40328.remove(c20764);
            } else {
                this.f40329.remove(c20764.getValue());
            }
        }
        this.f40330 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C20763 m31248(String str, C25042[] c25042Arr) {
        try {
            if (c25042Arr != null) {
                C20763 c20763 = new C20763(this, str, c25042Arr, true);
                C20763 c20764 = (C20763) this.f40328.get(c20763);
                if (c20764 != null) {
                    return c20764;
                }
                this.f40330.add(c20763);
                this.f40328.put(c20763, c20763);
                return c20763;
            }
            return m31256(str);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final synchronized C20763 m31256(String str) {
        C20763 c20763 = (C20763) this.f40329.get(str);
        if (c20763 != null) {
            if (c20763.mo8825() || !c20763.getValue().equals(str)) {
                throw new RuntimeException("No-Style item from map has been modified.");
            }
            return c20763;
        }
        C20763 c20764 = new C20763(this, str);
        this.f40330.add(c20764);
        this.f40329.put(str, c20764);
        return c20764;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m31257() {
        boolean z = true;
        for (int i = 0; i < this.f40330.size(); i++) {
            C20763 c20763 = (C20763) this.f40330.get(i);
            if (c20763.mo8825()) {
                if (!z) {
                    LinkedList linkedList = new LinkedList();
                    LinkedList linkedList2 = new LinkedList();
                    for (C20763 c20764 : this.f40330) {
                        if (c20764.mo8825()) {
                            linkedList.add(c20764);
                        } else {
                            linkedList2.add(c20764);
                        }
                    }
                    this.f40330.clear();
                    this.f40330.addAll(linkedList);
                    this.f40330.addAll(linkedList2);
                    for (int i2 = 0; i2 < this.f40330.size(); i2++) {
                        ((C20763) this.f40330.get(i2)).f66508 = i2;
                    }
                    return;
                }
            } else if (z) {
                z = false;
            }
            c20763.f66508 = i;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m31251(String str) {
        for (int i = 0; i < this.f40330.size(); i++) {
            C20763 c20763 = (C20763) this.f40330.get(i);
            if (!c20763.mo8825() && c20763.getValue().equals(str)) {
                return i;
            }
        }
        C20763 c20764 = new C20763(this, str);
        this.f40330.add(c20764);
        this.f40329.put(str, c20764);
        return this.f40330.size() - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m31247(C20763 c20763) {
        for (int i = 0; i < this.f40330.size(); i++) {
            if (this.f40330.get(i) == c20763) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31249(InterfaceC23332 interfaceC23332, boolean z, C3374 c3374) {
        int[] iArr;
        long j;
        ArrayList arrayList;
        int i;
        int[] iArr2;
        long j2;
        int i2;
        long j3;
        if (z) {
            m31257();
        } else {
            for (int i3 = 0; i3 < this.f40330.size(); i3++) {
                ((C20763) this.f40330.get(i3)).f66508 = i3;
            }
        }
        int i4 = 1;
        interfaceC23332.mo17788((short) 1);
        interfaceC23332.mo17788((short) 28);
        long position = interfaceC23332.getPosition();
        interfaceC23332.mo17795();
        int size = this.f40330.size();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC16090 interfaceC16090 : m15440()) {
            if (!interfaceC16090.mo8825()) {
                break;
            } else {
                arrayList2.add(interfaceC16090.getStyle());
            }
        }
        boolean z2 = this.f40327;
        if (!z2) {
            iArr = null;
            break;
        }
        iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            String value = getItem(i5).getValue();
            long jM48760 = C21443.m48760(value, true);
            if (value.length() > 32767 || jM48760 > 32767) {
                z2 = false;
                iArr = null;
                break;
            }
            iArr[i5] = (int) jM48760;
        }
        interfaceC23332.writeInt(size);
        interfaceC23332.writeInt(arrayList2.size());
        interfaceC23332.writeInt(z2 ? 256 : 0);
        long j4 = size;
        int iM31243 = m31243(((((long) arrayList2.size()) + j4) * 4) + 28, "strings offset");
        interfaceC23332.writeInt(iM31243);
        long position2 = interfaceC23332.getPosition();
        interfaceC23332.mo17795();
        interfaceC23332.skipBytes(m31243(j4 * 4, "string offset array size"));
        interfaceC23332.skipBytes(m31243(((long) arrayList2.size()) * 4, "style offset array size"));
        int[] iArr3 = new int[size];
        if (z2) {
            C6259 c6259 = new C6259(interfaceC23332);
            int i6 = 0;
            j2 = 0;
            while (i6 < size) {
                int i7 = iM31243;
                if (c3374 != null) {
                    c3374.m11079(1);
                }
                iArr3[i6] = m31243(j2, "string offset");
                String value2 = getItem(i6).getValue();
                long j5 = position;
                int length = value2.length();
                int i8 = iArr[i6];
                int i9 = size;
                long j6 = i8;
                m31243(((long) (m31246(length) + m31246(i8))) + j6 + 1 + j2, "string data size");
                long jM31244 = j2 + ((long) m31244(interfaceC23332, length)) + ((long) m31244(interfaceC23332, i8));
                C21443.m48764((InterfaceC7669) c6259, (CharSequence) value2, true);
                interfaceC23332.writeByte(0);
                j2 = jM31244 + j6 + 1;
                i6++;
                iM31243 = i7;
                size = i9;
                iArr = iArr;
                position = j5;
                iArr3 = iArr3;
                arrayList2 = arrayList2;
            }
            j = position;
            arrayList = arrayList2;
            i = iM31243;
            iArr2 = iArr3;
        } else {
            j = position;
            arrayList = arrayList2;
            i = iM31243;
            iArr2 = iArr3;
            int i10 = 0;
            j2 = 0;
            while (i10 < size) {
                if (c3374 != null) {
                    c3374.m11079(i4);
                }
                iArr2[i10] = m31243(j2, "string offset");
                String value3 = getItem(i10).getValue();
                int length2 = value3.length();
                if (length2 < 0) {
                    throw new IOException(C13645.m33382(length2, "UTF-16 string length is out of range: "));
                }
                long j7 = ((long) length2) * 2;
                m31243(((long) (length2 <= 32767 ? 2 : 4)) + j7 + 2 + j2, "string data size");
                if (length2 < 0) {
                    throw new IOException(C13645.m33382(length2, "UTF-16 string length is out of range: "));
                }
                if (length2 <= 32767) {
                    interfaceC23332.mo17788((short) length2);
                    i2 = 2;
                } else {
                    interfaceC23332.mo17788((short) ((length2 >>> 16) | 32768));
                    interfaceC23332.mo17788((short) (65535 & length2));
                    i2 = 4;
                }
                long j8 = j2 + ((long) i2);
                for (int i11 = 0; i11 < length2; i11++) {
                    interfaceC23332.mo17801(value3.charAt(i11));
                }
                interfaceC23332.mo17788((short) 0);
                j2 = j8 + j7 + 2;
                i10++;
                i4 = 1;
            }
        }
        int i12 = (int) (j2 % 4);
        if (i12 != 0) {
            int i13 = 4 - i12;
            for (int i14 = 0; i14 < i13; i14++) {
                interfaceC23332.writeByte(0);
                j2++;
            }
        }
        int iM31244 = m31243(j2, "string data size");
        int size2 = arrayList.size();
        int[] iArr4 = new int[size2];
        if (size2 > 0) {
            long jM29929 = 0;
            for (int i15 = 0; i15 < size2; i15++) {
                iArr4[i15] = m31243(jM29929, "style offset");
                int[] iArr5 = (int[]) arrayList.get(i15);
                jM29929 = C11958.m29929(iArr5.length, 4L, 4L, jM29929);
                m31243(jM29929, "style data size");
                interfaceC23332.mo17790(iArr5);
                interfaceC23332.writeInt(-1);
            }
            j3 = jM29929 + 8;
            m31243(j3, "style data size");
            interfaceC23332.writeInt(-1);
            interfaceC23332.writeInt(-1);
        } else {
            j3 = 0;
        }
        m31243(j3, "style data size");
        long position3 = interfaceC23332.getPosition();
        long j9 = j;
        interfaceC23332.seek(j9);
        interfaceC23332.writeInt(m31243((position3 - j9) + 4, "string pool chunk size"));
        interfaceC23332.seek(position2);
        interfaceC23332.writeInt(arrayList.isEmpty() ? 0 : m31243(((long) i) + ((long) iM31244), "style offset"));
        interfaceC23332.mo17790(iArr2);
        interfaceC23332.mo17790(iArr4);
        interfaceC23332.seek(position3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m31244(InterfaceC23332 interfaceC23332, int i) throws IOException {
        if (i < 0 || i > 32767) {
            throw new IOException(C13645.m33382(i, "UTF-8 string length is out of range: "));
        }
        if (i <= 127) {
            interfaceC23332.writeByte(i);
            return 1;
        }
        interfaceC23332.writeByte((i >>> 8) | 128);
        interfaceC23332.writeByte(i & 255);
        return 2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m31246(int i) throws IOException {
        if (i < 0 || i > 32767) {
            throw new IOException(C13645.m33382(i, "UTF-8 string length is out of range: "));
        }
        return i <= 127 ? 1 : 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m31243(long j, String str) throws IOException {
        if (j >= 0 && j <= 2147483647L) {
            return (int) j;
        }
        throw new IOException(str + " is too large: " + j);
    }
}
