package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܿܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes5.dex */
public final class C18383 extends AbstractC8448 implements Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient C11670 f59888;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient InterfaceC16695 f59890;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC21938 f59891;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public transient boolean f59892;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC9257 f59894;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public transient C11670 f59895;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient boolean[] f59896 = new boolean[48];

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public transient C11670 f59889 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f59893 = 0;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC25207
    /* JADX INFO: renamed from: ۢ */
    public final void mo13470() {
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11670 m42894(int i) {
        C11670 c11670M29349 = this.f59889;
        while (c11670M29349 != null) {
            int iCompare = Integer.compare(i, c11670M29349.f3592);
            if (iCompare == 0) {
                break;
            }
            c11670M29349 = iCompare < 0 ? c11670M29349.m29349() : c11670M29349.m29348();
        }
        return c11670M29349;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C11670 m42895(int i) {
        C11670 c11670M29349 = this.f59889;
        C11670 c11670 = c11670M29349;
        int iCompare = 0;
        while (c11670M29349 != null) {
            iCompare = Integer.compare(i, c11670M29349.f3592);
            if (iCompare == 0) {
                break;
            }
            c11670 = c11670M29349;
            c11670M29349 = iCompare < 0 ? c11670M29349.m29349() : c11670M29349.m29348();
        }
        return iCompare == 0 ? c11670M29349 : c11670;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0198  */
    /* JADX WARN: Code duplicated, block: B:86:0x019b  */
    /* JADX WARN: Code duplicated, block: B:88:0x019f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a2  */
    @Override // l.AbstractC9939, l.InterfaceC23057
    /* JADX INFO: renamed from: ۙ */
    public final Object mo13466(int i, Object obj) {
        C11670 c11670;
        C11670 c11671;
        C11670 c11672;
        C11670 c11673;
        C11670 c11674;
        this.f59892 = false;
        C11670 c11675 = this.f59889;
        if (c11675 == null) {
            this.f59893++;
            c11670 = new C11670(i, null);
            this.f59888 = c11670;
            this.f59895 = c11670;
            this.f59889 = c11670;
            this.f59892 = true;
        } else {
            C11670 c11676 = c11675;
            C11670 c11677 = null;
            C11670 c11678 = null;
            int i2 = 0;
            while (true) {
                int iCompare = Integer.compare(i, c11675.f3592);
                if (iCompare == 0) {
                    c11670 = c11675;
                } else {
                    if (((byte) c11675.f37814) != 0) {
                        i2 = 0;
                        c11676 = c11675;
                        c11678 = c11677;
                    }
                    boolean[] zArr = this.f59896;
                    int i3 = i2 + 1;
                    boolean z = iCompare > 0;
                    zArr[i2] = z;
                    if (z) {
                        if (c11675.m29347()) {
                            this.f59893++;
                            c11671 = new C11670(i, null);
                            this.f59892 = true;
                            C11670 c11679 = c11675.f37813;
                            if (c11679 == null) {
                                this.f59895 = c11671;
                            }
                            c11671.f37812 = c11675;
                            c11671.f37813 = c11679;
                            c11675.f37814 &= Integer.MAX_VALUE;
                            c11675.f37813 = c11671;
                            break;
                        }
                        c11672 = c11675.f37813;
                        c11677 = c11675;
                        c11675 = c11672;
                        i2 = i3;
                    } else {
                        if (c11675.m29346()) {
                            this.f59893++;
                            c11671 = new C11670(i, null);
                            this.f59892 = true;
                            C11670 c116710 = c11675.f37812;
                            if (c116710 == null) {
                                this.f59888 = c11671;
                            }
                            c11671.f37813 = c11675;
                            c11671.f37812 = c116710;
                            c11675.f37814 &= -1073741825;
                            c11675.f37812 = c11671;
                            break;
                        }
                        c11672 = c11675.f37812;
                        c11677 = c11675;
                        c11675 = c11672;
                        i2 = i3;
                    }
                }
            }
            int i4 = 0;
            C11670 c116711 = c11676;
            while (c116711 != c11671) {
                boolean z2 = this.f59896[i4];
                if (z2) {
                    int i5 = c116711.f37814;
                    c116711.f37814 = ((((byte) i5) + 1) & 255) | (i5 & (-256));
                } else {
                    int i6 = c116711.f37814;
                    c116711.f37814 = ((((byte) i6) - 1) & 255) | (i6 & (-256));
                }
                i4++;
                c116711 = z2 ? c116711.f37813 : c116711.f37812;
            }
            byte b = (byte) c11676.f37814;
            if (b == -2) {
                c11673 = c11676.f37812;
                if (((byte) c11673.f37814) == -1) {
                    if (c11673.m29347()) {
                        c11673.m29345(false);
                        c11676.m29341(c11673);
                    } else {
                        c11676.f37812 = c11673.f37813;
                    }
                    c11673.f37813 = c11676;
                    c11673.m29340(0);
                    c11676.m29340(0);
                } else {
                    c11674 = c11673.f37813;
                    c11673.f37813 = c11674.f37812;
                    c11674.f37812 = c11673;
                    c11676.f37812 = c11674.f37813;
                    c11674.f37813 = c11676;
                    byte b2 = (byte) c11674.f37814;
                    if (b2 == -1) {
                        c11673.m29340(0);
                        c11676.m29340(1);
                    } else if (b2 == 0) {
                        c11673.m29340(0);
                        c11676.m29340(0);
                    } else {
                        c11673.m29340(-1);
                        c11676.m29340(0);
                    }
                    c11674.m29340(0);
                    if (c11674.m29346()) {
                        c11673.m29350(c11674);
                        c11674.m29342(false);
                    }
                    if (c11674.m29347()) {
                        c11676.m29341(c11674);
                        c11674.m29345(false);
                    }
                    c11673 = c11674;
                }
                if (c11678 == null) {
                    this.f59889 = c11673;
                } else if (c11678.f37812 == c11676) {
                    c11678.f37812 = c11673;
                } else {
                    c11678.f37813 = c11673;
                }
            } else if (b == 2) {
                c11673 = c11676.f37813;
                if (((byte) c11673.f37814) == 1) {
                    if (c11673.m29346()) {
                        c11673.m29342(false);
                        c11676.m29350(c11673);
                    } else {
                        c11676.f37813 = c11673.f37812;
                    }
                    c11673.f37812 = c11676;
                    c11673.m29340(0);
                    c11676.m29340(0);
                } else {
                    c11674 = c11673.f37812;
                    c11673.f37812 = c11674.f37813;
                    c11674.f37813 = c11673;
                    c11676.f37813 = c11674.f37812;
                    c11674.f37812 = c11676;
                    byte b3 = (byte) c11674.f37814;
                    if (b3 == 1) {
                        c11673.m29340(0);
                        c11676.m29340(-1);
                    } else if (b3 == 0) {
                        c11673.m29340(0);
                        c11676.m29340(0);
                    } else {
                        c11673.m29340(1);
                        c11676.m29340(0);
                    }
                    c11674.m29340(0);
                    if (c11674.m29346()) {
                        c11676.m29350(c11674);
                        c11674.m29342(false);
                    }
                    if (c11674.m29347()) {
                        c11673.m29341(c11674);
                        c11674.m29345(false);
                    }
                    c11673 = c11674;
                }
                if (c11678 == null) {
                    this.f59889 = c11673;
                } else if (c11678.f37812 == c11676) {
                    c11678.f37812 = c11673;
                } else {
                    c11678.f37813 = c11673;
                }
            }
            c11670 = c11671;
        }
        Object obj2 = c11670.f3593;
        c11670.f3593 = obj;
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
    @Override // l.AbstractC9939, l.InterfaceC23057
    public final java.lang.Object remove(int r12) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18383.remove(int):java.lang.Object");
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C21367 c21367 = new C21367(this);
        int i = this.f59893;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (C17359.equals(c21367.m35284().f3593, obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.f59893 = 0;
        this.f59889 = null;
        this.f59894 = null;
        this.f59891 = null;
        this.f59890 = null;
        this.f59895 = null;
        this.f59888 = null;
    }

    @Override // l.AbstractC9193, l.InterfaceC23057, l.InterfaceC11868
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13467(int i) {
        return m42894(i) != null;
    }

    @Override // l.AbstractC9939, l.InterfaceC21433, java.util.Map
    public final int size() {
        return this.f59893;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f59893 == 0;
    }

    @Override // l.InterfaceC23057
    public final Object get(int i) {
        C11670 c11670M42894 = m42894(i);
        if (c11670M42894 == null) {
            return null;
        }
        return c11670M42894.f3593;
    }

    @Override // l.InterfaceC25207
    /* JADX INFO: renamed from: ᩻ */
    public final int mo13474() {
        if (this.f59889 == null) {
            throw new NoSuchElementException();
        }
        return this.f59888.f3592;
    }

    @Override // l.InterfaceC25207
    /* JADX INFO: renamed from: ۡ */
    public final int mo13469() {
        if (this.f59889 == null) {
            throw new NoSuchElementException();
        }
        return this.f59895.f3592;
    }

    @Override // l.AbstractC8448, l.InterfaceC11868, l.InterfaceC25207
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC9257 mo13468() {
        if (this.f59894 == null) {
            this.f59894 = new C5705(this);
        }
        return this.f59894;
    }

    @Override // l.AbstractC8448, java.util.Map, l.InterfaceC25207, java.util.SortedMap
    public final InterfaceC16695 keySet() {
        if (this.f59890 == null) {
            this.f59890 = new C17637(this);
        }
        return this.f59890;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final InterfaceC21938 values() {
        if (this.f59891 == null) {
            this.f59891 = new C1976(this);
        }
        return this.f59891;
    }

    @Override // l.InterfaceC25207
    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC25207 mo13472(int i) {
        return new C4213(this, 0, true, i, false);
    }

    @Override // l.InterfaceC25207
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC25207 mo13475(int i) {
        return new C4213(this, i, false, 0, true);
    }

    @Override // l.InterfaceC25207
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC25207 mo13473(int i, int i2) {
        return new C4213(this, i, false, i2, false);
    }

    public final Object clone() {
        try {
            C18383 c18383 = (C18383) super.clone();
            c18383.f59890 = null;
            c18383.f59891 = null;
            c18383.f59894 = null;
            c18383.f59896 = new boolean[48];
            if (this.f59893 != 0) {
                C11670 c11670 = new C11670();
                C11670 c11671 = new C11670();
                C11670 c11672 = this.f59889;
                c11670.f37814 &= -1073741825;
                c11670.f37812 = c11672;
                c11671.m29341((C11670) null);
                C11670 c11673 = c11671;
                loop0: while (true) {
                    if (!c11670.m29346()) {
                        C11670 c11670Clone = c11670.f37812.clone();
                        c11670Clone.m29341(c11673.f37812);
                        c11670Clone.m29350(c11673);
                        c11673.f37814 &= -1073741825;
                        c11673.f37812 = c11670Clone;
                        c11670 = c11670.f37812;
                        c11673 = c11670Clone;
                    } else {
                        while (c11670.m29347()) {
                            c11670 = c11670.f37813;
                            if (c11670 == null) {
                                break loop0;
                            }
                            c11673 = c11673.f37813;
                        }
                        c11670 = c11670.f37813;
                        c11673 = c11673.f37813;
                    }
                    if (!c11670.m29347()) {
                        C11670 c11670Clone2 = c11670.f37813.clone();
                        c11670Clone2.m29350(c11673.f37813);
                        c11670Clone2.m29341(c11673);
                        c11673.f37814 &= Integer.MAX_VALUE;
                        c11673.f37813 = c11670Clone2;
                    }
                }
                c11673.f37813 = null;
                C11670 c11674 = c11671.f37812;
                c18383.f59889 = c11674;
                c18383.f59888 = c11674;
                while (true) {
                    C11670 c11675 = c18383.f59888.f37812;
                    if (c11675 == null) {
                        break;
                    }
                    c18383.f59888 = c11675;
                }
                c18383.f59895 = c18383.f59889;
                while (true) {
                    C11670 c11676 = c18383.f59895.f37813;
                    if (c11676 == null) {
                        break;
                    }
                    c18383.f59895 = c11676;
                }
            }
            return c18383;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i = this.f59893;
        C25097 c25097 = new C25097(this);
        objectOutputStream.defaultWriteObject();
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            C11670 c11670M35284 = c25097.m35284();
            objectOutputStream.writeInt(c11670M35284.f3592);
            objectOutputStream.writeObject(c11670M35284.f3593);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11670 m42893(ObjectInputStream objectInputStream, int i, C11670 c11670, C11670 c11671) {
        if (i == 1) {
            C11670 c11672 = new C11670(objectInputStream.readInt(), objectInputStream.readObject());
            c11672.m29341(c11670);
            c11672.m29350(c11671);
            return c11672;
        }
        if (i == 2) {
            C11670 c11673 = new C11670(objectInputStream.readInt(), objectInputStream.readObject());
            C11670 c11674 = new C11670(objectInputStream.readInt(), objectInputStream.readObject());
            c11673.f37814 &= Integer.MAX_VALUE;
            c11673.f37813 = c11674;
            c11674.m29341(c11673);
            c11673.m29340(1);
            c11673.m29341(c11670);
            c11673.f37813.m29350(c11671);
            return c11673;
        }
        int i2 = i / 2;
        C11670 c11675 = new C11670();
        C11670 c11670M42893 = m42893(objectInputStream, (i - i2) - 1, c11670, c11675);
        c11675.f37814 &= -1073741825;
        c11675.f37812 = c11670M42893;
        c11675.f3592 = objectInputStream.readInt();
        c11675.f3593 = objectInputStream.readObject();
        C11670 c11670M42894 = m42893(objectInputStream, i2, c11675, c11671);
        c11675.f37814 &= Integer.MAX_VALUE;
        c11675.f37813 = c11670M42894;
        if (i == ((-i) & i)) {
            c11675.m29340(1);
        }
        return c11675;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f59896 = new boolean[48];
        int i = this.f59893;
        if (i != 0) {
            C11670 c11670M42893 = m42893(objectInputStream, i, null, null);
            this.f59889 = c11670M42893;
            while (c11670M42893.m29349() != null) {
                c11670M42893 = c11670M42893.m29349();
            }
            this.f59888 = c11670M42893;
            C11670 c11670M29348 = this.f59889;
            while (c11670M29348.m29348() != null) {
                c11670M29348 = c11670M29348.m29348();
            }
            this.f59895 = c11670M29348;
        }
    }
}
