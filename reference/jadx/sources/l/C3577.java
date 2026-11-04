package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۗܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 25I */
/* JADX INFO: loaded from: classes3.dex */
public final class C3577 extends AbstractC5991 implements Serializable {
    public static final long serialVersionUID = -7046029254386353130L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient C17001 f12248;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient C17001 f12251;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient boolean[] f12252 = new boolean[48];

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient C17001 f12249 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f12250 = 0;

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC16695, java.util.SortedSet
    public final InterfaceC4544 comparator() {
        return null;
    }

    @Override // l.InterfaceC1340
    public final boolean contains(int i) {
        C17001 c17001M40062 = this.f12249;
        while (c17001M40062 != null) {
            int iCompare = Integer.compare(i, c17001M40062.f55552);
            if (iCompare == 0) {
                break;
            }
            c17001M40062 = iCompare < 0 ? c17001M40062.m40062() : c17001M40062.m40069();
        }
        return c17001M40062 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17001 m11628(int i) {
        C17001 c17001M40062 = this.f12249;
        C17001 c17001 = c17001M40062;
        int iCompare = 0;
        while (c17001M40062 != null) {
            iCompare = Integer.compare(i, c17001M40062.f55552);
            if (iCompare == 0) {
                break;
            }
            c17001 = c17001M40062;
            c17001M40062 = iCompare < 0 ? c17001M40062.m40062() : c17001M40062.m40069();
        }
        return iCompare == 0 ? c17001M40062 : c17001;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x018d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0190  */
    /* JADX WARN: Code duplicated, block: B:90:0x0194  */
    /* JADX WARN: Code duplicated, block: B:92:0x0197  */
    @Override // l.AbstractC6957, l.InterfaceC1340
    public final boolean add(int i) {
        C17001 c17001;
        C17001 c17002;
        C17001 c17003;
        C17001 c17004;
        C17001 c17005 = this.f12249;
        if (c17005 == null) {
            this.f12250++;
            C17001 c17006 = new C17001(i);
            this.f12251 = c17006;
            this.f12248 = c17006;
            this.f12249 = c17006;
            return true;
        }
        C17001 c17007 = null;
        C17001 c17008 = null;
        int i2 = 0;
        C17001 c17009 = c17005;
        while (true) {
            int iCompare = Integer.compare(i, c17005.f55552);
            if (iCompare == 0) {
                return false;
            }
            if (((byte) c17005.f55550) != 0) {
                i2 = 0;
                c17009 = c17005;
                c17008 = c17007;
            }
            boolean[] zArr = this.f12252;
            int i3 = i2 + 1;
            boolean z = iCompare > 0;
            zArr[i2] = z;
            if (z) {
                if (c17005.m40066()) {
                    this.f12250++;
                    c17001 = new C17001(i);
                    C17001 c170010 = c17005.f55549;
                    if (c170010 == null) {
                        this.f12248 = c17001;
                    }
                    c17001.f55551 = c17005;
                    c17001.f55549 = c170010;
                    c17005.f55550 &= Integer.MAX_VALUE;
                    c17005.f55549 = c17001;
                    break;
                }
                c17002 = c17005.f55549;
                i2 = i3;
                C17001 c170011 = c17002;
                c17007 = c17005;
                c17005 = c170011;
            } else {
                if (c17005.m40068()) {
                    this.f12250++;
                    c17001 = new C17001(i);
                    C17001 c170012 = c17005.f55551;
                    if (c170012 == null) {
                        this.f12251 = c17001;
                    }
                    c17001.f55549 = c17005;
                    c17001.f55551 = c170012;
                    c17005.f55550 &= -1073741825;
                    c17005.f55551 = c17001;
                    break;
                }
                c17002 = c17005.f55551;
                i2 = i3;
                C17001 c170013 = c17002;
                c17007 = c17005;
                c17005 = c170013;
            }
        }
        int i4 = 0;
        C17001 c170014 = c17009;
        while (c170014 != c17001) {
            boolean z2 = this.f12252[i4];
            if (z2) {
                int i5 = c170014.f55550;
                c170014.f55550 = ((((byte) i5) + 1) & 255) | (i5 & (-256));
            } else {
                int i6 = c170014.f55550;
                c170014.f55550 = ((((byte) i6) - 1) & 255) | (i6 & (-256));
            }
            i4++;
            c170014 = z2 ? c170014.f55549 : c170014.f55551;
        }
        byte b = (byte) c17009.f55550;
        if (b == -2) {
            c17003 = c17009.f55551;
            if (((byte) c17003.f55550) == -1) {
                if (c17003.m40066()) {
                    c17003.m40067(false);
                    c17009.m40064(c17003);
                } else {
                    c17009.f55551 = c17003.f55549;
                }
                c17003.f55549 = c17009;
                c17003.m40063(0);
                c17009.m40063(0);
            } else {
                c17004 = c17003.f55549;
                c17003.f55549 = c17004.f55551;
                c17004.f55551 = c17003;
                c17009.f55551 = c17004.f55549;
                c17004.f55549 = c17009;
                byte b2 = (byte) c17004.f55550;
                if (b2 == -1) {
                    c17003.m40063(0);
                    c17009.m40063(1);
                } else if (b2 == 0) {
                    c17003.m40063(0);
                    c17009.m40063(0);
                } else {
                    c17003.m40063(-1);
                    c17009.m40063(0);
                }
                c17004.m40063(0);
                if (c17004.m40068()) {
                    c17003.m40072(c17004);
                    c17004.m40065(false);
                }
                if (c17004.m40066()) {
                    c17009.m40064(c17004);
                    c17004.m40067(false);
                }
                c17003 = c17004;
            }
            if (c17008 == null) {
                this.f12249 = c17003;
                return true;
            }
            if (c17008.f55551 == c17009) {
                c17008.f55551 = c17003;
                return true;
            }
            c17008.f55549 = c17003;
        } else if (b == 2) {
            c17003 = c17009.f55549;
            if (((byte) c17003.f55550) == 1) {
                if (c17003.m40068()) {
                    c17003.m40065(false);
                    c17009.m40072(c17003);
                } else {
                    c17009.f55549 = c17003.f55551;
                }
                c17003.f55551 = c17009;
                c17003.m40063(0);
                c17009.m40063(0);
            } else {
                c17004 = c17003.f55551;
                c17003.f55551 = c17004.f55549;
                c17004.f55549 = c17003;
                c17009.f55549 = c17004.f55551;
                c17004.f55551 = c17009;
                byte b3 = (byte) c17004.f55550;
                if (b3 == 1) {
                    c17003.m40063(0);
                    c17009.m40063(-1);
                } else if (b3 == 0) {
                    c17003.m40063(0);
                    c17009.m40063(0);
                } else {
                    c17003.m40063(1);
                    c17009.m40063(0);
                }
                c17004.m40063(0);
                if (c17004.m40068()) {
                    c17009.m40072(c17004);
                    c17004.m40065(false);
                }
                if (c17004.m40066()) {
                    c17003.m40064(c17004);
                    c17004.m40067(false);
                }
                c17003 = c17004;
            }
            if (c17008 == null) {
                this.f12249 = c17003;
                return true;
            }
            if (c17008.f55551 == c17009) {
                c17008.f55551 = c17003;
                return true;
            }
            c17008.f55549 = c17003;
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
    @Override // l.AbstractC13448
    public final boolean remove(int r11) {
        /*
            Method dump skipped, instruction units count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3577.remove(int):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f12250 = 0;
        this.f12249 = null;
        this.f12248 = null;
        this.f12251 = null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12250;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f12250 == 0;
    }

    @Override // l.InterfaceC16695
    /* JADX INFO: renamed from: ᩵ */
    public final int mo8337() {
        if (this.f12249 == null) {
            throw new NoSuchElementException();
        }
        return this.f12251.f55552;
    }

    @Override // l.InterfaceC16695
    /* JADX INFO: renamed from: ۫ۙ */
    public final int mo8335() {
        if (this.f12249 == null) {
            throw new NoSuchElementException();
        }
        return this.f12248.f55552;
    }

    @Override // l.AbstractC5991, l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C17747(this);
    }

    @Override // l.AbstractC5991, l.AbstractC6957, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC6036 iterator() {
        return new C17747(this);
    }

    @Override // l.InterfaceC16695
    /* JADX INFO: renamed from: ۟ */
    public final InterfaceC8273 mo11424() {
        return new C17747(this);
    }

    @Override // l.InterfaceC16695
    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC16695 mo8338(int i) {
        return new C23715(this, 0, true, i, false);
    }

    @Override // l.InterfaceC16695
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC16695 mo8336(int i) {
        return new C23715(this, i, false, 0, true);
    }

    @Override // l.InterfaceC16695
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC16695 mo8334(int i, int i2) {
        return new C23715(this, i, false, i2, false);
    }

    public final Object clone() {
        try {
            C3577 c3577 = (C3577) super.clone();
            c3577.f12252 = new boolean[48];
            if (this.f12250 != 0) {
                C17001 c17001 = new C17001();
                C17001 c17002 = new C17001();
                C17001 c17003 = this.f12249;
                c17001.f55550 &= -1073741825;
                c17001.f55551 = c17003;
                c17002.m40064((C17001) null);
                C17001 c17004 = c17002;
                loop0: while (true) {
                    if (!c17001.m40068()) {
                        C17001 c17001Clone = c17001.f55551.clone();
                        c17001Clone.m40064(c17004.f55551);
                        c17001Clone.m40072(c17004);
                        c17004.f55550 &= -1073741825;
                        c17004.f55551 = c17001Clone;
                        c17001 = c17001.f55551;
                        c17004 = c17001Clone;
                    } else {
                        while (c17001.m40066()) {
                            c17001 = c17001.f55549;
                            if (c17001 == null) {
                                break loop0;
                            }
                            c17004 = c17004.f55549;
                        }
                        c17001 = c17001.f55549;
                        c17004 = c17004.f55549;
                    }
                    if (!c17001.m40066()) {
                        C17001 c17001Clone2 = c17001.f55549.clone();
                        c17001Clone2.m40072(c17004.f55549);
                        c17001Clone2.m40064(c17004);
                        c17004.f55550 &= Integer.MAX_VALUE;
                        c17004.f55549 = c17001Clone2;
                    }
                }
                c17004.f55549 = null;
                C17001 c17005 = c17002.f55551;
                c3577.f12249 = c17005;
                c3577.f12251 = c17005;
                while (true) {
                    C17001 c17006 = c3577.f12251.f55551;
                    if (c17006 == null) {
                        break;
                    }
                    c3577.f12251 = c17006;
                }
                c3577.f12248 = c3577.f12249;
                while (true) {
                    C17001 c17007 = c3577.f12248.f55549;
                    if (c17007 == null) {
                        break;
                    }
                    c3577.f12248 = c17007;
                }
            }
            return c3577;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i = this.f12250;
        C17747 c17747 = new C17747(this);
        objectOutputStream.defaultWriteObject();
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeInt(c17747.nextInt());
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17001 m11627(ObjectInputStream objectInputStream, int i, C17001 c17001, C17001 c17002) {
        if (i == 1) {
            C17001 c17003 = new C17001(objectInputStream.readInt());
            c17003.m40064(c17001);
            c17003.m40072(c17002);
            return c17003;
        }
        if (i == 2) {
            C17001 c17004 = new C17001(objectInputStream.readInt());
            C17001 c17005 = new C17001(objectInputStream.readInt());
            c17004.f55550 &= Integer.MAX_VALUE;
            c17004.f55549 = c17005;
            c17005.m40064(c17004);
            c17004.m40063(1);
            c17004.m40064(c17001);
            c17004.f55549.m40072(c17002);
            return c17004;
        }
        int i2 = i / 2;
        C17001 c17006 = new C17001();
        C17001 c17001M11627 = m11627(objectInputStream, (i - i2) - 1, c17001, c17006);
        c17006.f55550 &= -1073741825;
        c17006.f55551 = c17001M11627;
        c17006.f55552 = objectInputStream.readInt();
        C17001 c17001M11628 = m11627(objectInputStream, i2, c17006, c17002);
        c17006.f55550 &= Integer.MAX_VALUE;
        c17006.f55549 = c17001M11628;
        if (i == ((-i) & i)) {
            c17006.m40063(1);
        }
        return c17006;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f12252 = new boolean[48];
        int i = this.f12250;
        if (i != 0) {
            C17001 c17001M11627 = m11627(objectInputStream, i, null, null);
            this.f12249 = c17001M11627;
            while (c17001M11627.m40062() != null) {
                c17001M11627 = c17001M11627.m40062();
            }
            this.f12251 = c17001M11627;
            C17001 c17001M40069 = this.f12249;
            while (c17001M40069.m40069() != null) {
                c17001M40069 = c17001M40069.m40069();
            }
            this.f12248 = c17001M40069;
        }
    }
}
