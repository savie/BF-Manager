package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩸۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes5.dex */
public final class C21605 extends AbstractC20673 implements Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient InterfaceC10194 f70074;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient boolean f70075;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient InterfaceC4733 f70077;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient C9261 f70079;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient C9261 f70080;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public transient InterfaceC0624 f70082;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient boolean[] f70081 = new boolean[48];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public transient C9261 f70076 = null;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f70078 = 0;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ۛ */
    public final void mo8947() {
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C9261 m48311(int i) {
        C9261 c9261M23789 = this.f70076;
        while (c9261M23789 != null) {
            int iCompare = Integer.compare(i, c9261M23789.f29881);
            if (iCompare == 0) {
                break;
            }
            c9261M23789 = iCompare < 0 ? c9261M23789.m23789() : c9261M23789.m23794();
        }
        return c9261M23789;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C9261 m48310(int i) {
        C9261 c9261M23789 = this.f70076;
        C9261 c9261 = c9261M23789;
        int iCompare = 0;
        while (c9261M23789 != null) {
            iCompare = Integer.compare(i, c9261M23789.f29881);
            if (iCompare == 0) {
                break;
            }
            c9261 = c9261M23789;
            c9261M23789 = iCompare < 0 ? c9261M23789.m23789() : c9261M23789.m23794();
        }
        return iCompare == 0 ? c9261M23789 : c9261;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0198  */
    /* JADX WARN: Code duplicated, block: B:86:0x019b  */
    /* JADX WARN: Code duplicated, block: B:88:0x019f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a2  */
    @Override // l.AbstractC19262, l.InterfaceC17372
    /* JADX INFO: renamed from: ۙ */
    public final Object mo8944(int i, Object obj) {
        C9261 c9261;
        C9261 c9262;
        C9261 c9263;
        C9261 c9264;
        C9261 c9265;
        this.f70075 = false;
        C9261 c9266 = this.f70076;
        if (c9266 == null) {
            this.f70078++;
            c9261 = new C9261(i, null);
            this.f70079 = c9261;
            this.f70080 = c9261;
            this.f70076 = c9261;
            this.f70075 = true;
        } else {
            C9261 c9267 = c9266;
            C9261 c9268 = null;
            C9261 c9269 = null;
            int i2 = 0;
            while (true) {
                int iCompare = Integer.compare(i, c9266.f29881);
                if (iCompare == 0) {
                    c9261 = c9266;
                } else {
                    if (((byte) c9266.f31484) != 0) {
                        i2 = 0;
                        c9267 = c9266;
                        c9269 = c9268;
                    }
                    boolean[] zArr = this.f70081;
                    int i3 = i2 + 1;
                    boolean z = iCompare > 0;
                    zArr[i2] = z;
                    if (z) {
                        if (c9266.m23793()) {
                            this.f70078++;
                            c9262 = new C9261(i, null);
                            this.f70075 = true;
                            C9261 c92610 = c9266.f31485;
                            if (c92610 == null) {
                                this.f70080 = c9262;
                            }
                            c9262.f31486 = c9266;
                            c9262.f31485 = c92610;
                            c9266.f31484 &= Integer.MAX_VALUE;
                            c9266.f31485 = c9262;
                            break;
                        }
                        c9263 = c9266.f31485;
                        c9268 = c9266;
                        c9266 = c9263;
                        i2 = i3;
                    } else {
                        if (c9266.m23795()) {
                            this.f70078++;
                            c9262 = new C9261(i, null);
                            this.f70075 = true;
                            C9261 c92611 = c9266.f31486;
                            if (c92611 == null) {
                                this.f70079 = c9262;
                            }
                            c9262.f31485 = c9266;
                            c9262.f31486 = c92611;
                            c9266.f31484 &= -1073741825;
                            c9266.f31486 = c9262;
                            break;
                        }
                        c9263 = c9266.f31486;
                        c9268 = c9266;
                        c9266 = c9263;
                        i2 = i3;
                    }
                }
            }
            int i4 = 0;
            C9261 c92612 = c9267;
            while (c92612 != c9262) {
                boolean z2 = this.f70081[i4];
                if (z2) {
                    int i5 = c92612.f31484;
                    c92612.f31484 = ((((byte) i5) + 1) & 255) | (i5 & (-256));
                } else {
                    int i6 = c92612.f31484;
                    c92612.f31484 = ((((byte) i6) - 1) & 255) | (i6 & (-256));
                }
                i4++;
                c92612 = z2 ? c92612.f31485 : c92612.f31486;
            }
            byte b = (byte) c9267.f31484;
            if (b == -2) {
                c9264 = c9267.f31486;
                if (((byte) c9264.f31484) == -1) {
                    if (c9264.m23793()) {
                        c9264.m23790(false);
                        c9267.m23787(c9264);
                    } else {
                        c9267.f31486 = c9264.f31485;
                    }
                    c9264.f31485 = c9267;
                    c9264.m23786(0);
                    c9267.m23786(0);
                } else {
                    c9265 = c9264.f31485;
                    c9264.f31485 = c9265.f31486;
                    c9265.f31486 = c9264;
                    c9267.f31486 = c9265.f31485;
                    c9265.f31485 = c9267;
                    byte b2 = (byte) c9265.f31484;
                    if (b2 == -1) {
                        c9264.m23786(0);
                        c9267.m23786(1);
                    } else if (b2 == 0) {
                        c9264.m23786(0);
                        c9267.m23786(0);
                    } else {
                        c9264.m23786(-1);
                        c9267.m23786(0);
                    }
                    c9265.m23786(0);
                    if (c9265.m23795()) {
                        c9264.m23792(c9265);
                        c9265.m23788(false);
                    }
                    if (c9265.m23793()) {
                        c9267.m23787(c9265);
                        c9265.m23790(false);
                    }
                    c9264 = c9265;
                }
                if (c9269 == null) {
                    this.f70076 = c9264;
                } else if (c9269.f31486 == c9267) {
                    c9269.f31486 = c9264;
                } else {
                    c9269.f31485 = c9264;
                }
            } else if (b == 2) {
                c9264 = c9267.f31485;
                if (((byte) c9264.f31484) == 1) {
                    if (c9264.m23795()) {
                        c9264.m23788(false);
                        c9267.m23792(c9264);
                    } else {
                        c9267.f31485 = c9264.f31486;
                    }
                    c9264.f31486 = c9267;
                    c9264.m23786(0);
                    c9267.m23786(0);
                } else {
                    c9265 = c9264.f31486;
                    c9264.f31486 = c9265.f31485;
                    c9265.f31485 = c9264;
                    c9267.f31485 = c9265.f31486;
                    c9265.f31486 = c9267;
                    byte b3 = (byte) c9265.f31484;
                    if (b3 == 1) {
                        c9264.m23786(0);
                        c9267.m23786(-1);
                    } else if (b3 == 0) {
                        c9264.m23786(0);
                        c9267.m23786(0);
                    } else {
                        c9264.m23786(1);
                        c9267.m23786(0);
                    }
                    c9265.m23786(0);
                    if (c9265.m23795()) {
                        c9267.m23792(c9265);
                        c9265.m23788(false);
                    }
                    if (c9265.m23793()) {
                        c9264.m23787(c9265);
                        c9265.m23790(false);
                    }
                    c9264 = c9265;
                }
                if (c9269 == null) {
                    this.f70076 = c9264;
                } else if (c9269.f31486 == c9267) {
                    c9269.f31486 = c9264;
                } else {
                    c9269.f31485 = c9264;
                }
            }
            c9261 = c9262;
        }
        Object obj2 = c9261.f29882;
        c9261.f29882 = obj;
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
    @Override // l.AbstractC19262, l.InterfaceC17372
    public final java.lang.Object remove(int r12) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21605.remove(int):java.lang.Object");
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C15256 c15256 = new C15256(this);
        int i = this.f70078;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (C13638.equals(c15256.m50909().f29882, obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.f70078 = 0;
        this.f70076 = null;
        this.f70074 = null;
        this.f70082 = null;
        this.f70077 = null;
        this.f70080 = null;
        this.f70079 = null;
    }

    @Override // l.AbstractC10090, l.InterfaceC17372, l.InterfaceC9612
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8945(int i) {
        return m48311(i) != null;
    }

    @Override // l.AbstractC19262, l.InterfaceC6456
    public final int size() {
        return this.f70078;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f70078 == 0;
    }

    @Override // l.InterfaceC17372
    public final Object get(int i) {
        C9261 c9261M48311 = m48311(i);
        if (c9261M48311 == null) {
            return null;
        }
        return c9261M48311.f29882;
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ᩺ */
    public final int mo8951() {
        if (this.f70076 == null) {
            throw new NoSuchElementException();
        }
        return this.f70079.f29881;
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ᩻ */
    public final int mo8953() {
        if (this.f70076 == null) {
            throw new NoSuchElementException();
        }
        return this.f70080.f29881;
    }

    @Override // l.AbstractC20673, l.InterfaceC9612, l.InterfaceC4485
    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC10194 mo8949() {
        if (this.f70074 == null) {
            this.f70074 = new C14200(this);
        }
        return this.f70074;
    }

    @Override // l.AbstractC20673, java.util.Map, l.InterfaceC4485, java.util.SortedMap
    public final InterfaceC4733 keySet() {
        if (this.f70077 == null) {
            this.f70077 = new C13845(this);
        }
        return this.f70077;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final InterfaceC0624 values() {
        if (this.f70082 == null) {
            this.f70082 = new C1498(this);
        }
        return this.f70082;
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ֨ */
    public final InterfaceC4485 mo8943(int i) {
        return new C6788(this, 0, true, i, false);
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ᩺ */
    public final InterfaceC4485 mo8952(int i) {
        return new C6788(this, i, false, 0, true);
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC4485 mo8950(int i, int i2) {
        return new C6788(this, i, false, i2, false);
    }

    public final Object clone() {
        try {
            C21605 c21605 = (C21605) super.clone();
            c21605.f70077 = null;
            c21605.f70082 = null;
            c21605.f70074 = null;
            c21605.f70081 = new boolean[48];
            if (this.f70078 != 0) {
                C9261 c9261 = new C9261();
                C9261 c9262 = new C9261();
                C9261 c9263 = this.f70076;
                c9261.f31484 &= -1073741825;
                c9261.f31486 = c9263;
                c9262.m23787((C9261) null);
                C9261 c9264 = c9262;
                loop0: while (true) {
                    if (!c9261.m23795()) {
                        C9261 c9261Clone = c9261.f31486.clone();
                        c9261Clone.m23787(c9264.f31486);
                        c9261Clone.m23792(c9264);
                        c9264.f31484 &= -1073741825;
                        c9264.f31486 = c9261Clone;
                        c9261 = c9261.f31486;
                        c9264 = c9261Clone;
                    } else {
                        while (c9261.m23793()) {
                            c9261 = c9261.f31485;
                            if (c9261 == null) {
                                break loop0;
                            }
                            c9264 = c9264.f31485;
                        }
                        c9261 = c9261.f31485;
                        c9264 = c9264.f31485;
                    }
                    if (!c9261.m23793()) {
                        C9261 c9261Clone2 = c9261.f31485.clone();
                        c9261Clone2.m23792(c9264.f31485);
                        c9261Clone2.m23787(c9264);
                        c9264.f31484 &= Integer.MAX_VALUE;
                        c9264.f31485 = c9261Clone2;
                    }
                }
                c9264.f31485 = null;
                C9261 c9265 = c9262.f31486;
                c21605.f70076 = c9265;
                c21605.f70079 = c9265;
                while (true) {
                    C9261 c9266 = c21605.f70079.f31486;
                    if (c9266 == null) {
                        break;
                    }
                    c21605.f70079 = c9266;
                }
                c21605.f70080 = c21605.f70076;
                while (true) {
                    C9261 c9267 = c21605.f70080.f31485;
                    if (c9267 == null) {
                        break;
                    }
                    c21605.f70080 = c9267;
                }
            }
            return c21605;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i = this.f70078;
        C2909 c2909 = new C2909(this);
        objectOutputStream.defaultWriteObject();
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            C9261 c9261M50909 = c2909.m50909();
            objectOutputStream.writeInt(c9261M50909.f29881);
            objectOutputStream.writeObject(c9261M50909.f29882);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9261 m48309(ObjectInputStream objectInputStream, int i, C9261 c9261, C9261 c9262) {
        if (i == 1) {
            C9261 c9263 = new C9261(objectInputStream.readInt(), objectInputStream.readObject());
            c9263.m23787(c9261);
            c9263.m23792(c9262);
            return c9263;
        }
        if (i == 2) {
            C9261 c9264 = new C9261(objectInputStream.readInt(), objectInputStream.readObject());
            C9261 c9265 = new C9261(objectInputStream.readInt(), objectInputStream.readObject());
            c9264.f31484 &= Integer.MAX_VALUE;
            c9264.f31485 = c9265;
            c9265.m23787(c9264);
            c9264.m23786(1);
            c9264.m23787(c9261);
            c9264.f31485.m23792(c9262);
            return c9264;
        }
        int i2 = i / 2;
        C9261 c9266 = new C9261();
        C9261 c9261M48309 = m48309(objectInputStream, (i - i2) - 1, c9261, c9266);
        c9266.f31484 &= -1073741825;
        c9266.f31486 = c9261M48309;
        c9266.f29881 = objectInputStream.readInt();
        c9266.f29882 = objectInputStream.readObject();
        C9261 c9261M483010 = m48309(objectInputStream, i2, c9266, c9262);
        c9266.f31484 &= Integer.MAX_VALUE;
        c9266.f31485 = c9261M483010;
        if (i == ((-i) & i)) {
            c9266.m23786(1);
        }
        return c9266;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f70081 = new boolean[48];
        int i = this.f70078;
        if (i != 0) {
            C9261 c9261M48309 = m48309(objectInputStream, i, null, null);
            this.f70076 = c9261M48309;
            while (c9261M48309.m23789() != null) {
                c9261M48309 = c9261M48309.m23789();
            }
            this.f70079 = c9261M48309;
            C9261 c9261M23794 = this.f70076;
            while (c9261M23794.m23794() != null) {
                c9261M23794 = c9261M23794.m23794();
            }
            this.f70080 = c9261M23794;
        }
    }
}
