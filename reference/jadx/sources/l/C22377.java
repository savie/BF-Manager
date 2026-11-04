package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩷᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes2.dex */
public final class C22377 extends AbstractC24439 implements Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient C14697 f72453;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient InterfaceC17067 f72455;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC21938 f72456;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public transient boolean f72457;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC9257 f72459;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient C14697 f72460;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient boolean[] f72461 = new boolean[48];

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public transient C14697 f72454 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f72458 = 0;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC10442, java.util.SortedMap
    public final void comparator() {
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14697 m50461(char c) {
        C14697 c14697M35371 = this.f72454;
        while (c14697M35371 != null) {
            int iCompare = Character.compare(c, c14697M35371.f66377);
            if (iCompare == 0) {
                break;
            }
            c14697M35371 = iCompare < 0 ? c14697M35371.m35371() : c14697M35371.m35370();
        }
        return c14697M35371;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C14697 m50460(char c) {
        C14697 c14697M35371 = this.f72454;
        C14697 c14697 = c14697M35371;
        int iCompare = 0;
        while (c14697M35371 != null) {
            iCompare = Character.compare(c, c14697M35371.f66377);
            if (iCompare == 0) {
                break;
            }
            c14697 = c14697M35371;
            c14697M35371 = iCompare < 0 ? c14697M35371.m35371() : c14697M35371.m35370();
        }
        return iCompare == 0 ? c14697M35371 : c14697;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0198  */
    /* JADX WARN: Code duplicated, block: B:86:0x019b  */
    /* JADX WARN: Code duplicated, block: B:88:0x019f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a2  */
    @Override // l.AbstractC3555, l.InterfaceC23123
    /* JADX INFO: renamed from: ۙ */
    public final Object mo11584(char c, Object obj) {
        C14697 c14697;
        C14697 c14698;
        C14697 c14699;
        C14697 c146910;
        C14697 c146911;
        this.f72457 = false;
        C14697 c146912 = this.f72454;
        if (c146912 == null) {
            this.f72458++;
            c14697 = new C14697(c, null);
            this.f72453 = c14697;
            this.f72460 = c14697;
            this.f72454 = c14697;
            this.f72457 = true;
        } else {
            C14697 c146913 = c146912;
            C14697 c146914 = null;
            C14697 c146915 = null;
            int i = 0;
            while (true) {
                int iCompare = Character.compare(c, c146912.f66377);
                if (iCompare == 0) {
                    c14697 = c146912;
                } else {
                    if (((byte) c146912.f48035) != 0) {
                        i = 0;
                        c146913 = c146912;
                        c146915 = c146914;
                    }
                    boolean[] zArr = this.f72461;
                    int i2 = i + 1;
                    boolean z = iCompare > 0;
                    zArr[i] = z;
                    if (z) {
                        if (c146912.m35369()) {
                            this.f72458++;
                            c14698 = new C14697(c, null);
                            this.f72457 = true;
                            C14697 c146916 = c146912.f48034;
                            if (c146916 == null) {
                                this.f72460 = c14698;
                            }
                            c14698.f48033 = c146912;
                            c14698.f48034 = c146916;
                            c146912.f48035 &= Integer.MAX_VALUE;
                            c146912.f48034 = c14698;
                            break;
                        }
                        c14699 = c146912.f48034;
                        c146914 = c146912;
                        c146912 = c14699;
                        i = i2;
                    } else {
                        if (c146912.m35368()) {
                            this.f72458++;
                            c14698 = new C14697(c, null);
                            this.f72457 = true;
                            C14697 c146917 = c146912.f48033;
                            if (c146917 == null) {
                                this.f72453 = c14698;
                            }
                            c14698.f48034 = c146912;
                            c14698.f48033 = c146917;
                            c146912.f48035 &= -1073741825;
                            c146912.f48033 = c14698;
                            break;
                        }
                        c14699 = c146912.f48033;
                        c146914 = c146912;
                        c146912 = c14699;
                        i = i2;
                    }
                }
            }
            int i3 = 0;
            C14697 c146918 = c146913;
            while (c146918 != c14698) {
                boolean z2 = this.f72461[i3];
                if (z2) {
                    int i4 = c146918.f48035;
                    c146918.f48035 = ((((byte) i4) + 1) & 255) | (i4 & (-256));
                } else {
                    int i5 = c146918.f48035;
                    c146918.f48035 = ((((byte) i5) - 1) & 255) | (i5 & (-256));
                }
                i3++;
                c146918 = z2 ? c146918.f48034 : c146918.f48033;
            }
            byte b = (byte) c146913.f48035;
            if (b == -2) {
                c146910 = c146913.f48033;
                if (((byte) c146910.f48035) == -1) {
                    if (c146910.m35369()) {
                        c146910.m35367(false);
                        c146913.m35363(c146910);
                    } else {
                        c146913.f48033 = c146910.f48034;
                    }
                    c146910.f48034 = c146913;
                    c146910.m35362(0);
                    c146913.m35362(0);
                } else {
                    c146911 = c146910.f48034;
                    c146910.f48034 = c146911.f48033;
                    c146911.f48033 = c146910;
                    c146913.f48033 = c146911.f48034;
                    c146911.f48034 = c146913;
                    byte b2 = (byte) c146911.f48035;
                    if (b2 == -1) {
                        c146910.m35362(0);
                        c146913.m35362(1);
                    } else if (b2 == 0) {
                        c146910.m35362(0);
                        c146913.m35362(0);
                    } else {
                        c146910.m35362(-1);
                        c146913.m35362(0);
                    }
                    c146911.m35362(0);
                    if (c146911.m35368()) {
                        c146910.m35372(c146911);
                        c146911.m35364(false);
                    }
                    if (c146911.m35369()) {
                        c146913.m35363(c146911);
                        c146911.m35367(false);
                    }
                    c146910 = c146911;
                }
                if (c146915 == null) {
                    this.f72454 = c146910;
                } else if (c146915.f48033 == c146913) {
                    c146915.f48033 = c146910;
                } else {
                    c146915.f48034 = c146910;
                }
            } else if (b == 2) {
                c146910 = c146913.f48034;
                if (((byte) c146910.f48035) == 1) {
                    if (c146910.m35368()) {
                        c146910.m35364(false);
                        c146913.m35372(c146910);
                    } else {
                        c146913.f48034 = c146910.f48033;
                    }
                    c146910.f48033 = c146913;
                    c146910.m35362(0);
                    c146913.m35362(0);
                } else {
                    c146911 = c146910.f48033;
                    c146910.f48033 = c146911.f48034;
                    c146911.f48034 = c146910;
                    c146913.f48034 = c146911.f48033;
                    c146911.f48033 = c146913;
                    byte b3 = (byte) c146911.f48035;
                    if (b3 == 1) {
                        c146910.m35362(0);
                        c146913.m35362(-1);
                    } else if (b3 == 0) {
                        c146910.m35362(0);
                        c146913.m35362(0);
                    } else {
                        c146910.m35362(1);
                        c146913.m35362(0);
                    }
                    c146911.m35362(0);
                    if (c146911.m35368()) {
                        c146913.m35372(c146911);
                        c146911.m35364(false);
                    }
                    if (c146911.m35369()) {
                        c146910.m35363(c146911);
                        c146911.m35367(false);
                    }
                    c146910 = c146911;
                }
                if (c146915 == null) {
                    this.f72454 = c146910;
                } else if (c146915.f48033 == c146913) {
                    c146915.f48033 = c146910;
                } else {
                    c146915.f48034 = c146910;
                }
            }
            c14697 = c14698;
        }
        Object obj2 = c14697.f66378;
        c14697.f66378 = obj;
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:171:0x0285 A[LOOP:1: B:65:0x00f1->B:171:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:192:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0115  */
    /* JADX WARN: Code duplicated, block: B:85:0x0122 A[LOOP:2: B:83:0x011c->B:85:0x0122, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00a1 -> B:60:0x00e7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // l.AbstractC3555, l.InterfaceC23123
    /* JADX INFO: renamed from: ᩴ */
    public final java.lang.Object mo11585(char r12) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22377.mo11585(char):java.lang.Object");
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C5223 c5223 = new C5223(this);
        int i = this.f72458;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (C17359.equals(c5223.m34022().f66378, obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.f72458 = 0;
        this.f72454 = null;
        this.f72459 = null;
        this.f72456 = null;
        this.f72455 = null;
        this.f72460 = null;
        this.f72453 = null;
    }

    @Override // l.AbstractC12504, l.InterfaceC23123
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19857(char c) {
        return m50461(c) != null;
    }

    @Override // l.AbstractC3555, l.InterfaceC21433, java.util.Map
    public final int size() {
        return this.f72458;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f72458 == 0;
    }

    @Override // l.InterfaceC23123
    /* JADX INFO: renamed from: ᩷ */
    public final Object mo19863(char c) {
        C14697 c14697M50461 = m50461(c);
        if (c14697M50461 == null) {
            return null;
        }
        return c14697M50461.f66378;
    }

    @Override // l.InterfaceC10442
    /* JADX INFO: renamed from: ᩳۙ */
    public final char mo19862() {
        if (this.f72454 == null) {
            throw new NoSuchElementException();
        }
        return this.f72453.f66377;
    }

    @Override // l.InterfaceC10442
    /* JADX INFO: renamed from: ܳۙ */
    public final char mo19861() {
        if (this.f72454 == null) {
            throw new NoSuchElementException();
        }
        return this.f72460.f66377;
    }

    @Override // l.AbstractC24439, l.InterfaceC11934, l.InterfaceC10442
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC9257 mo19859() {
        if (this.f72459 == null) {
            this.f72459 = new C24395(this);
        }
        return this.f72459;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final InterfaceC17067 keySet() {
        if (this.f72455 == null) {
            this.f72455 = new C0528(this);
        }
        return this.f72455;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final InterfaceC21938 values() {
        if (this.f72456 == null) {
            this.f72456 = new C4257(this);
        }
        return this.f72456;
    }

    @Override // l.InterfaceC10442
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC10442 mo19865(char c) {
        return new C7240(this, (char) 0, true, c, false);
    }

    @Override // l.InterfaceC10442
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC10442 mo19860(char c) {
        return new C7240(this, c, false, (char) 0, true);
    }

    @Override // l.InterfaceC10442
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC10442 mo19864(char c, char c2) {
        return new C7240(this, c, false, c2, false);
    }

    public final Object clone() {
        try {
            C22377 c22377 = (C22377) super.clone();
            c22377.f72455 = null;
            c22377.f72456 = null;
            c22377.f72459 = null;
            c22377.f72461 = new boolean[48];
            if (this.f72458 != 0) {
                C14697 c14697 = new C14697();
                C14697 c14698 = new C14697();
                C14697 c14699 = this.f72454;
                c14697.f48035 &= -1073741825;
                c14697.f48033 = c14699;
                c14698.m35363((C14697) null);
                C14697 c146910 = c14698;
                loop0: while (true) {
                    if (!c14697.m35368()) {
                        C14697 c14697Clone = c14697.f48033.clone();
                        c14697Clone.m35363(c146910.f48033);
                        c14697Clone.m35372(c146910);
                        c146910.f48035 &= -1073741825;
                        c146910.f48033 = c14697Clone;
                        c14697 = c14697.f48033;
                        c146910 = c14697Clone;
                    } else {
                        while (c14697.m35369()) {
                            c14697 = c14697.f48034;
                            if (c14697 == null) {
                                break loop0;
                            }
                            c146910 = c146910.f48034;
                        }
                        c14697 = c14697.f48034;
                        c146910 = c146910.f48034;
                    }
                    if (!c14697.m35369()) {
                        C14697 c14697Clone2 = c14697.f48034.clone();
                        c14697Clone2.m35372(c146910.f48034);
                        c14697Clone2.m35363(c146910);
                        c146910.f48035 &= Integer.MAX_VALUE;
                        c146910.f48034 = c14697Clone2;
                    }
                }
                c146910.f48034 = null;
                C14697 c146911 = c14698.f48033;
                c22377.f72454 = c146911;
                c22377.f72453 = c146911;
                while (true) {
                    C14697 c146912 = c22377.f72453.f48033;
                    if (c146912 == null) {
                        break;
                    }
                    c22377.f72453 = c146912;
                }
                c22377.f72460 = c22377.f72454;
                while (true) {
                    C14697 c146913 = c22377.f72460.f48034;
                    if (c146913 == null) {
                        break;
                    }
                    c22377.f72460 = c146913;
                }
            }
            return c22377;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i = this.f72458;
        C21411 c21411 = new C21411(this);
        objectOutputStream.defaultWriteObject();
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            C14697 c14697M34022 = c21411.m34022();
            objectOutputStream.writeChar(c14697M34022.f66377);
            objectOutputStream.writeObject(c14697M34022.f66378);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14697 m50459(ObjectInputStream objectInputStream, int i, C14697 c14697, C14697 c14698) {
        if (i == 1) {
            C14697 c14699 = new C14697(objectInputStream.readChar(), objectInputStream.readObject());
            c14699.m35363(c14697);
            c14699.m35372(c14698);
            return c14699;
        }
        if (i == 2) {
            C14697 c146910 = new C14697(objectInputStream.readChar(), objectInputStream.readObject());
            C14697 c146911 = new C14697(objectInputStream.readChar(), objectInputStream.readObject());
            c146910.f48035 &= Integer.MAX_VALUE;
            c146910.f48034 = c146911;
            c146911.m35363(c146910);
            c146910.m35362(1);
            c146910.m35363(c14697);
            c146910.f48034.m35372(c14698);
            return c146910;
        }
        int i2 = i / 2;
        C14697 c146912 = new C14697();
        C14697 c14697M50459 = m50459(objectInputStream, (i - i2) - 1, c14697, c146912);
        c146912.f48035 &= -1073741825;
        c146912.f48033 = c14697M50459;
        c146912.f66377 = objectInputStream.readChar();
        c146912.f66378 = objectInputStream.readObject();
        C14697 c14697M504510 = m50459(objectInputStream, i2, c146912, c14698);
        c146912.f48035 &= Integer.MAX_VALUE;
        c146912.f48034 = c14697M504510;
        if (i == ((-i) & i)) {
            c146912.m35362(1);
        }
        return c146912;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f72461 = new boolean[48];
        int i = this.f72458;
        if (i != 0) {
            C14697 c14697M50459 = m50459(objectInputStream, i, null, null);
            this.f72454 = c14697M50459;
            while (c14697M50459.m35371() != null) {
                c14697M50459 = c14697M50459.m35371();
            }
            this.f72453 = c14697M50459;
            C14697 c14697M35370 = this.f72454;
            while (c14697M35370.m35370() != null) {
                c14697M35370 = c14697M35370.m35370();
            }
            this.f72460 = c14697M35370;
        }
    }
}
