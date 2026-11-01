package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩹ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25I */
/* JADX INFO: loaded from: classes2.dex */
public final class C22125 extends AbstractC14324 implements Serializable {
    public static final long serialVersionUID = -7046029254386353130L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient C13659 f71625;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient C13659 f71628;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient boolean[] f71629 = new boolean[48];

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient C13659 f71626 = null;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f71627 = 0;

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC4733, java.util.SortedSet
    public final InterfaceC16481 comparator() {
        return null;
    }

    @Override // l.InterfaceC10131
    public final boolean contains(int i) {
        C13659 c13659M33352 = this.f71626;
        while (c13659M33352 != null) {
            int iCompare = Integer.compare(i, c13659M33352.f45048);
            if (iCompare == 0) {
                break;
            }
            c13659M33352 = iCompare < 0 ? c13659M33352.m33352() : c13659M33352.m33361();
        }
        return c13659M33352 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13659 m49084(int i) {
        C13659 c13659M33352 = this.f71626;
        C13659 c13659 = c13659M33352;
        int iCompare = 0;
        while (c13659M33352 != null) {
            iCompare = Integer.compare(i, c13659M33352.f45048);
            if (iCompare == 0) {
                break;
            }
            c13659 = c13659M33352;
            c13659M33352 = iCompare < 0 ? c13659M33352.m33352() : c13659M33352.m33361();
        }
        return iCompare == 0 ? c13659M33352 : c13659;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x018d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0190  */
    /* JADX WARN: Code duplicated, block: B:90:0x0194  */
    /* JADX WARN: Code duplicated, block: B:92:0x0197  */
    @Override // l.AbstractC15735, l.InterfaceC10131
    public final boolean add(int i) {
        C13659 c13659;
        C13659 c136510;
        C13659 c136511;
        C13659 c136512;
        C13659 c136513 = this.f71626;
        if (c136513 == null) {
            this.f71627++;
            C13659 c136514 = new C13659(i);
            this.f71625 = c136514;
            this.f71628 = c136514;
            this.f71626 = c136514;
            return true;
        }
        C13659 c136515 = null;
        C13659 c136516 = null;
        int i2 = 0;
        C13659 c136517 = c136513;
        while (true) {
            int iCompare = Integer.compare(i, c136513.f45048);
            if (iCompare == 0) {
                return false;
            }
            if (((byte) c136513.f45046) != 0) {
                i2 = 0;
                c136517 = c136513;
                c136516 = c136515;
            }
            boolean[] zArr = this.f71629;
            int i3 = i2 + 1;
            boolean z = iCompare > 0;
            zArr[i2] = z;
            if (z) {
                if (c136513.m33359()) {
                    this.f71627++;
                    c13659 = new C13659(i);
                    C13659 c136518 = c136513.f45047;
                    if (c136518 == null) {
                        this.f71628 = c13659;
                    }
                    c13659.f45045 = c136513;
                    c13659.f45047 = c136518;
                    c136513.f45046 &= Integer.MAX_VALUE;
                    c136513.f45047 = c13659;
                    break;
                }
                c136510 = c136513.f45047;
                i2 = i3;
                C13659 c136519 = c136510;
                c136515 = c136513;
                c136513 = c136519;
            } else {
                if (c136513.m33351()) {
                    this.f71627++;
                    c13659 = new C13659(i);
                    C13659 c136520 = c136513.f45045;
                    if (c136520 == null) {
                        this.f71625 = c13659;
                    }
                    c13659.f45047 = c136513;
                    c13659.f45045 = c136520;
                    c136513.f45046 &= -1073741825;
                    c136513.f45045 = c13659;
                    break;
                }
                c136510 = c136513.f45045;
                i2 = i3;
                C13659 c1365110 = c136510;
                c136515 = c136513;
                c136513 = c1365110;
            }
        }
        int i4 = 0;
        C13659 c136521 = c136517;
        while (c136521 != c13659) {
            boolean z2 = this.f71629[i4];
            if (z2) {
                int i5 = c136521.f45046;
                c136521.f45046 = ((((byte) i5) + 1) & 255) | (i5 & (-256));
            } else {
                int i6 = c136521.f45046;
                c136521.f45046 = ((((byte) i6) - 1) & 255) | (i6 & (-256));
            }
            i4++;
            c136521 = z2 ? c136521.f45047 : c136521.f45045;
        }
        byte b = (byte) c136517.f45046;
        if (b == -2) {
            c136511 = c136517.f45045;
            if (((byte) c136511.f45046) == -1) {
                if (c136511.m33359()) {
                    c136511.m33358(false);
                    c136517.m33354(c136511);
                } else {
                    c136517.f45045 = c136511.f45047;
                }
                c136511.f45047 = c136517;
                c136511.m33353(0);
                c136517.m33353(0);
            } else {
                c136512 = c136511.f45047;
                c136511.f45047 = c136512.f45045;
                c136512.f45045 = c136511;
                c136517.f45045 = c136512.f45047;
                c136512.f45047 = c136517;
                byte b2 = (byte) c136512.f45046;
                if (b2 == -1) {
                    c136511.m33353(0);
                    c136517.m33353(1);
                } else if (b2 == 0) {
                    c136511.m33353(0);
                    c136517.m33353(0);
                } else {
                    c136511.m33353(-1);
                    c136517.m33353(0);
                }
                c136512.m33353(0);
                if (c136512.m33351()) {
                    c136511.m33360(c136512);
                    c136512.m33355(false);
                }
                if (c136512.m33359()) {
                    c136517.m33354(c136512);
                    c136512.m33358(false);
                }
                c136511 = c136512;
            }
            if (c136516 == null) {
                this.f71626 = c136511;
                return true;
            }
            if (c136516.f45045 == c136517) {
                c136516.f45045 = c136511;
                return true;
            }
            c136516.f45047 = c136511;
        } else if (b == 2) {
            c136511 = c136517.f45047;
            if (((byte) c136511.f45046) == 1) {
                if (c136511.m33351()) {
                    c136511.m33355(false);
                    c136517.m33360(c136511);
                } else {
                    c136517.f45047 = c136511.f45045;
                }
                c136511.f45045 = c136517;
                c136511.m33353(0);
                c136517.m33353(0);
            } else {
                c136512 = c136511.f45045;
                c136511.f45045 = c136512.f45047;
                c136512.f45047 = c136511;
                c136517.f45047 = c136512.f45045;
                c136512.f45045 = c136517;
                byte b3 = (byte) c136512.f45046;
                if (b3 == 1) {
                    c136511.m33353(0);
                    c136517.m33353(-1);
                } else if (b3 == 0) {
                    c136511.m33353(0);
                    c136517.m33353(0);
                } else {
                    c136511.m33353(1);
                    c136517.m33353(0);
                }
                c136512.m33353(0);
                if (c136512.m33351()) {
                    c136517.m33360(c136512);
                    c136512.m33355(false);
                }
                if (c136512.m33359()) {
                    c136511.m33354(c136512);
                    c136512.m33358(false);
                }
                c136511 = c136512;
            }
            if (c136516 == null) {
                this.f71626 = c136511;
                return true;
            }
            if (c136516.f45045 == c136517) {
                c136516.f45045 = c136511;
                return true;
            }
            c136516.f45047 = c136511;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:171:0x0284 A[LOOP:1: B:65:0x00f0->B:171:0x0284, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:192:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x010a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0114  */
    /* JADX WARN: Code duplicated, block: B:85:0x0121 A[LOOP:2: B:83:0x011b->B:85:0x0121, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00a0 -> B:60:0x00e6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // l.AbstractC23496
    public final boolean remove(int r11) {
        /*
            Method dump skipped, instruction units count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22125.remove(int):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f71627 = 0;
        this.f71626 = null;
        this.f71628 = null;
        this.f71625 = null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f71627;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f71627 == 0;
    }

    @Override // l.InterfaceC4733
    /* JADX INFO: renamed from: ᩵ */
    public final int mo13103() {
        if (this.f71626 == null) {
            throw new NoSuchElementException();
        }
        return this.f71625.f45048;
    }

    @Override // l.InterfaceC4733
    /* JADX INFO: renamed from: ֨ۙ */
    public final int mo13099() {
        if (this.f71626 == null) {
            throw new NoSuchElementException();
        }
        return this.f71628.f45048;
    }

    @Override // l.AbstractC14324, l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C11542(this);
    }

    @Override // l.AbstractC14324, l.AbstractC15735, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final InterfaceC13431 iterator() {
        return new C11542(this);
    }

    @Override // l.InterfaceC4733
    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC21191 mo13101() {
        return new C11542(this);
    }

    @Override // l.InterfaceC4733
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC4733 mo13102(int i) {
        return new C5191(this, 0, true, i, false);
    }

    @Override // l.InterfaceC4733
    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC4733 mo13104(int i) {
        return new C5191(this, i, false, 0, true);
    }

    @Override // l.InterfaceC4733
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC4733 mo13100(int i, int i2) {
        return new C5191(this, i, false, i2, false);
    }

    public final Object clone() {
        try {
            C22125 c22125 = (C22125) super.clone();
            c22125.f71629 = new boolean[48];
            if (this.f71627 != 0) {
                C13659 c13659 = new C13659();
                C13659 c136510 = new C13659();
                C13659 c136511 = this.f71626;
                c13659.f45046 &= -1073741825;
                c13659.f45045 = c136511;
                c136510.m33354((C13659) null);
                C13659 c136512 = c136510;
                loop0: while (true) {
                    if (!c13659.m33351()) {
                        C13659 c13659Clone = c13659.f45045.clone();
                        c13659Clone.m33354(c136512.f45045);
                        c13659Clone.m33360(c136512);
                        c136512.f45046 &= -1073741825;
                        c136512.f45045 = c13659Clone;
                        c13659 = c13659.f45045;
                        c136512 = c13659Clone;
                    } else {
                        while (c13659.m33359()) {
                            c13659 = c13659.f45047;
                            if (c13659 == null) {
                                break loop0;
                            }
                            c136512 = c136512.f45047;
                        }
                        c13659 = c13659.f45047;
                        c136512 = c136512.f45047;
                    }
                    if (!c13659.m33359()) {
                        C13659 c13659Clone2 = c13659.f45047.clone();
                        c13659Clone2.m33360(c136512.f45047);
                        c13659Clone2.m33354(c136512);
                        c136512.f45046 &= Integer.MAX_VALUE;
                        c136512.f45047 = c13659Clone2;
                    }
                }
                c136512.f45047 = null;
                C13659 c136513 = c136510.f45045;
                c22125.f71626 = c136513;
                c22125.f71625 = c136513;
                while (true) {
                    C13659 c136514 = c22125.f71625.f45045;
                    if (c136514 == null) {
                        break;
                    }
                    c22125.f71625 = c136514;
                }
                c22125.f71628 = c22125.f71626;
                while (true) {
                    C13659 c136515 = c22125.f71628.f45047;
                    if (c136515 == null) {
                        break;
                    }
                    c22125.f71628 = c136515;
                }
            }
            return c22125;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i = this.f71627;
        C11542 c11542 = new C11542(this);
        objectOutputStream.defaultWriteObject();
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeInt(c11542.nextInt());
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13659 m49083(ObjectInputStream objectInputStream, int i, C13659 c13659, C13659 c136510) {
        if (i == 1) {
            C13659 c136511 = new C13659(objectInputStream.readInt());
            c136511.m33354(c13659);
            c136511.m33360(c136510);
            return c136511;
        }
        if (i == 2) {
            C13659 c136512 = new C13659(objectInputStream.readInt());
            C13659 c136513 = new C13659(objectInputStream.readInt());
            c136512.f45046 &= Integer.MAX_VALUE;
            c136512.f45047 = c136513;
            c136513.m33354(c136512);
            c136512.m33353(1);
            c136512.m33354(c13659);
            c136512.f45047.m33360(c136510);
            return c136512;
        }
        int i2 = i / 2;
        C13659 c136514 = new C13659();
        C13659 c13659M49083 = m49083(objectInputStream, (i - i2) - 1, c13659, c136514);
        c136514.f45046 &= -1073741825;
        c136514.f45045 = c13659M49083;
        c136514.f45048 = objectInputStream.readInt();
        C13659 c13659M49084 = m49083(objectInputStream, i2, c136514, c136510);
        c136514.f45046 &= Integer.MAX_VALUE;
        c136514.f45047 = c13659M49084;
        if (i == ((-i) & i)) {
            c136514.m33353(1);
        }
        return c136514;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f71629 = new boolean[48];
        int i = this.f71627;
        if (i != 0) {
            C13659 c13659M49083 = m49083(objectInputStream, i, null, null);
            this.f71626 = c13659M49083;
            while (c13659M49083.m33352() != null) {
                c13659M49083 = c13659M49083.m33352();
            }
            this.f71625 = c13659M49083;
            C13659 c13659M33361 = this.f71626;
            while (c13659M33361.m33361() != null) {
                c13659M33361 = c13659M33361.m33361();
            }
            this.f71628 = c13659M33361;
        }
    }
}
