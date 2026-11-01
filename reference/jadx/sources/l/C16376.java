package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܽۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes5.dex */
public final class C16376 extends AbstractC13035 implements Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient InterfaceC10194 f52696;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient boolean f52697;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient InterfaceC4630 f52699;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient C22726 f52701;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public transient C22726 f52702;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public transient InterfaceC0624 f52704;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient boolean[] f52703 = new boolean[48];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public transient C22726 f52698 = null;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f52700 = 0;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC19241, java.util.SortedMap
    public final void comparator() {
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C22726 m38563(char c) {
        C22726 c22726M50385 = this.f52698;
        while (c22726M50385 != null) {
            int iCompare = Character.compare(c, c22726M50385.f18265);
            if (iCompare == 0) {
                break;
            }
            c22726M50385 = iCompare < 0 ? c22726M50385.m50385() : c22726M50385.m50390();
        }
        return c22726M50385;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C22726 m38564(char c) {
        C22726 c22726M50385 = this.f52698;
        C22726 c22726 = c22726M50385;
        int iCompare = 0;
        while (c22726M50385 != null) {
            iCompare = Character.compare(c, c22726M50385.f18265);
            if (iCompare == 0) {
                break;
            }
            c22726 = c22726M50385;
            c22726M50385 = iCompare < 0 ? c22726M50385.m50385() : c22726M50385.m50390();
        }
        return iCompare == 0 ? c22726M50385 : c22726;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0198  */
    /* JADX WARN: Code duplicated, block: B:86:0x019b  */
    /* JADX WARN: Code duplicated, block: B:88:0x019f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a2  */
    @Override // l.AbstractC2450, l.InterfaceC17081
    /* JADX INFO: renamed from: ۙ */
    public final Object mo7435(char c, Object obj) {
        C22726 c22726;
        C22726 c22727;
        C22726 c22728;
        C22726 c22729;
        C22726 c227210;
        this.f52697 = false;
        C22726 c227211 = this.f52698;
        if (c227211 == null) {
            this.f52700++;
            c22726 = new C22726(c, null);
            this.f52701 = c22726;
            this.f52702 = c22726;
            this.f52698 = c22726;
            this.f52697 = true;
        } else {
            C22726 c227212 = c227211;
            C22726 c227213 = null;
            C22726 c227214 = null;
            int i = 0;
            while (true) {
                int iCompare = Character.compare(c, c227211.f18265);
                if (iCompare == 0) {
                    c22726 = c227211;
                } else {
                    if (((byte) c227211.f74037) != 0) {
                        i = 0;
                        c227212 = c227211;
                        c227214 = c227213;
                    }
                    boolean[] zArr = this.f52703;
                    int i2 = i + 1;
                    boolean z = iCompare > 0;
                    zArr[i] = z;
                    if (z) {
                        if (c227211.m50389()) {
                            this.f52700++;
                            c22727 = new C22726(c, null);
                            this.f52697 = true;
                            C22726 c227215 = c227211.f74038;
                            if (c227215 == null) {
                                this.f52702 = c22727;
                            }
                            c22727.f74039 = c227211;
                            c22727.f74038 = c227215;
                            c227211.f74037 &= Integer.MAX_VALUE;
                            c227211.f74038 = c22727;
                            break;
                        }
                        c22728 = c227211.f74038;
                        c227213 = c227211;
                        c227211 = c22728;
                        i = i2;
                    } else {
                        if (c227211.m50391()) {
                            this.f52700++;
                            c22727 = new C22726(c, null);
                            this.f52697 = true;
                            C22726 c227216 = c227211.f74039;
                            if (c227216 == null) {
                                this.f52701 = c22727;
                            }
                            c22727.f74038 = c227211;
                            c22727.f74039 = c227216;
                            c227211.f74037 &= -1073741825;
                            c227211.f74039 = c22727;
                            break;
                        }
                        c22728 = c227211.f74039;
                        c227213 = c227211;
                        c227211 = c22728;
                        i = i2;
                    }
                }
            }
            int i3 = 0;
            C22726 c227217 = c227212;
            while (c227217 != c22727) {
                boolean z2 = this.f52703[i3];
                if (z2) {
                    int i4 = c227217.f74037;
                    c227217.f74037 = ((((byte) i4) + 1) & 255) | (i4 & (-256));
                } else {
                    int i5 = c227217.f74037;
                    c227217.f74037 = ((((byte) i5) - 1) & 255) | (i5 & (-256));
                }
                i3++;
                c227217 = z2 ? c227217.f74038 : c227217.f74039;
            }
            byte b = (byte) c227212.f74037;
            if (b == -2) {
                c22729 = c227212.f74039;
                if (((byte) c22729.f74037) == -1) {
                    if (c22729.m50389()) {
                        c22729.m50386(false);
                        c227212.m50383(c22729);
                    } else {
                        c227212.f74039 = c22729.f74038;
                    }
                    c22729.f74038 = c227212;
                    c22729.m50382(0);
                    c227212.m50382(0);
                } else {
                    c227210 = c22729.f74038;
                    c22729.f74038 = c227210.f74039;
                    c227210.f74039 = c22729;
                    c227212.f74039 = c227210.f74038;
                    c227210.f74038 = c227212;
                    byte b2 = (byte) c227210.f74037;
                    if (b2 == -1) {
                        c22729.m50382(0);
                        c227212.m50382(1);
                    } else if (b2 == 0) {
                        c22729.m50382(0);
                        c227212.m50382(0);
                    } else {
                        c22729.m50382(-1);
                        c227212.m50382(0);
                    }
                    c227210.m50382(0);
                    if (c227210.m50391()) {
                        c22729.m50388(c227210);
                        c227210.m50384(false);
                    }
                    if (c227210.m50389()) {
                        c227212.m50383(c227210);
                        c227210.m50386(false);
                    }
                    c22729 = c227210;
                }
                if (c227214 == null) {
                    this.f52698 = c22729;
                } else if (c227214.f74039 == c227212) {
                    c227214.f74039 = c22729;
                } else {
                    c227214.f74038 = c22729;
                }
            } else if (b == 2) {
                c22729 = c227212.f74038;
                if (((byte) c22729.f74037) == 1) {
                    if (c22729.m50391()) {
                        c22729.m50384(false);
                        c227212.m50388(c22729);
                    } else {
                        c227212.f74038 = c22729.f74039;
                    }
                    c22729.f74039 = c227212;
                    c22729.m50382(0);
                    c227212.m50382(0);
                } else {
                    c227210 = c22729.f74039;
                    c22729.f74039 = c227210.f74038;
                    c227210.f74038 = c22729;
                    c227212.f74038 = c227210.f74039;
                    c227210.f74039 = c227212;
                    byte b3 = (byte) c227210.f74037;
                    if (b3 == 1) {
                        c22729.m50382(0);
                        c227212.m50382(-1);
                    } else if (b3 == 0) {
                        c22729.m50382(0);
                        c227212.m50382(0);
                    } else {
                        c22729.m50382(1);
                        c227212.m50382(0);
                    }
                    c227210.m50382(0);
                    if (c227210.m50391()) {
                        c227212.m50388(c227210);
                        c227210.m50384(false);
                    }
                    if (c227210.m50389()) {
                        c22729.m50383(c227210);
                        c227210.m50386(false);
                    }
                    c22729 = c227210;
                }
                if (c227214 == null) {
                    this.f52698 = c22729;
                } else if (c227214.f74039 == c227212) {
                    c227214.f74039 = c22729;
                } else {
                    c227214.f74038 = c22729;
                }
            }
            c22726 = c22727;
        }
        Object obj2 = c22726.f18266;
        c22726.f18266 = obj;
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
    @Override // l.AbstractC2450, l.InterfaceC17081
    /* JADX INFO: renamed from: ۚ */
    public final java.lang.Object mo7436(char r12) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16376.mo7436(char):java.lang.Object");
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C0147 c0147 = new C0147(this);
        int i = this.f52700;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (C13638.equals(c0147.m45175().f18266, obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.f52700 = 0;
        this.f52698 = null;
        this.f52696 = null;
        this.f52704 = null;
        this.f52699 = null;
        this.f52702 = null;
        this.f52701 = null;
    }

    @Override // l.AbstractC22207, l.InterfaceC17081
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15965(char c) {
        return m38563(c) != null;
    }

    @Override // l.AbstractC2450, l.InterfaceC6456
    public final int size() {
        return this.f52700;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f52700 == 0;
    }

    @Override // l.InterfaceC17081
    /* JADX INFO: renamed from: ܰ */
    public final Object mo15966(char c) {
        C22726 c22726M38563 = m38563(c);
        if (c22726M38563 == null) {
            return null;
        }
        return c22726M38563.f18266;
    }

    @Override // l.InterfaceC19241
    /* JADX INFO: renamed from: ܿۙ */
    public final char mo37341() {
        if (this.f52698 == null) {
            throw new NoSuchElementException();
        }
        return this.f52701.f18265;
    }

    @Override // l.InterfaceC19241
    /* JADX INFO: renamed from: ᩹ۙ */
    public final char mo37343() {
        if (this.f52698 == null) {
            throw new NoSuchElementException();
        }
        return this.f52702.f18265;
    }

    @Override // l.AbstractC13035, l.InterfaceC9321
    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC10194 mo8794() {
        if (this.f52696 == null) {
            this.f52696 = new C3674(this);
        }
        return this.f52696;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final InterfaceC4630 keySet() {
        if (this.f52699 == null) {
            this.f52699 = new C17786(this);
        }
        return this.f52699;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final InterfaceC0624 values() {
        if (this.f52704 == null) {
            this.f52704 = new C6497(this);
        }
        return this.f52704;
    }

    @Override // l.InterfaceC19241
    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC19241 mo37338(char c) {
        return new C15671(this, (char) 0, true, c, false);
    }

    @Override // l.InterfaceC19241
    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC19241 mo37342(char c) {
        return new C15671(this, c, false, (char) 0, true);
    }

    @Override // l.InterfaceC19241
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC19241 mo37340(char c, char c2) {
        return new C15671(this, c, false, c2, false);
    }

    public final Object clone() {
        try {
            C16376 c16376 = (C16376) super.clone();
            c16376.f52699 = null;
            c16376.f52704 = null;
            c16376.f52696 = null;
            c16376.f52703 = new boolean[48];
            if (this.f52700 != 0) {
                C22726 c22726 = new C22726();
                C22726 c22727 = new C22726();
                C22726 c22728 = this.f52698;
                c22726.f74037 &= -1073741825;
                c22726.f74039 = c22728;
                c22727.m50383((C22726) null);
                C22726 c22729 = c22727;
                loop0: while (true) {
                    if (!c22726.m50391()) {
                        C22726 c22726Clone = c22726.f74039.clone();
                        c22726Clone.m50383(c22729.f74039);
                        c22726Clone.m50388(c22729);
                        c22729.f74037 &= -1073741825;
                        c22729.f74039 = c22726Clone;
                        c22726 = c22726.f74039;
                        c22729 = c22726Clone;
                    } else {
                        while (c22726.m50389()) {
                            c22726 = c22726.f74038;
                            if (c22726 == null) {
                                break loop0;
                            }
                            c22729 = c22729.f74038;
                        }
                        c22726 = c22726.f74038;
                        c22729 = c22729.f74038;
                    }
                    if (!c22726.m50389()) {
                        C22726 c22726Clone2 = c22726.f74038.clone();
                        c22726Clone2.m50388(c22729.f74038);
                        c22726Clone2.m50383(c22729);
                        c22729.f74037 &= Integer.MAX_VALUE;
                        c22729.f74038 = c22726Clone2;
                    }
                }
                c22729.f74038 = null;
                C22726 c227210 = c22727.f74039;
                c16376.f52698 = c227210;
                c16376.f52701 = c227210;
                while (true) {
                    C22726 c227211 = c16376.f52701.f74039;
                    if (c227211 == null) {
                        break;
                    }
                    c16376.f52701 = c227211;
                }
                c16376.f52702 = c16376.f52698;
                while (true) {
                    C22726 c227212 = c16376.f52702.f74038;
                    if (c227212 == null) {
                        break;
                    }
                    c16376.f52702 = c227212;
                }
            }
            return c16376;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i = this.f52700;
        C14965 c14965 = new C14965(this);
        objectOutputStream.defaultWriteObject();
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            C22726 c22726M45175 = c14965.m45175();
            objectOutputStream.writeChar(c22726M45175.f18265);
            objectOutputStream.writeObject(c22726M45175.f18266);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22726 m38562(ObjectInputStream objectInputStream, int i, C22726 c22726, C22726 c22727) {
        if (i == 1) {
            C22726 c22728 = new C22726(objectInputStream.readChar(), objectInputStream.readObject());
            c22728.m50383(c22726);
            c22728.m50388(c22727);
            return c22728;
        }
        if (i == 2) {
            C22726 c22729 = new C22726(objectInputStream.readChar(), objectInputStream.readObject());
            C22726 c227210 = new C22726(objectInputStream.readChar(), objectInputStream.readObject());
            c22729.f74037 &= Integer.MAX_VALUE;
            c22729.f74038 = c227210;
            c227210.m50383(c22729);
            c22729.m50382(1);
            c22729.m50383(c22726);
            c22729.f74038.m50388(c22727);
            return c22729;
        }
        int i2 = i / 2;
        C22726 c227211 = new C22726();
        C22726 c22726M38562 = m38562(objectInputStream, (i - i2) - 1, c22726, c227211);
        c227211.f74037 &= -1073741825;
        c227211.f74039 = c22726M38562;
        c227211.f18265 = objectInputStream.readChar();
        c227211.f18266 = objectInputStream.readObject();
        C22726 c22726M38563 = m38562(objectInputStream, i2, c227211, c22727);
        c227211.f74037 &= Integer.MAX_VALUE;
        c227211.f74038 = c22726M38563;
        if (i == ((-i) & i)) {
            c227211.m50382(1);
        }
        return c227211;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f52703 = new boolean[48];
        int i = this.f52700;
        if (i != 0) {
            C22726 c22726M38562 = m38562(objectInputStream, i, null, null);
            this.f52698 = c22726M38562;
            while (c22726M38562.m50385() != null) {
                c22726M38562 = c22726M38562.m50385();
            }
            this.f52701 = c22726M38562;
            C22726 c22726M50390 = this.f52698;
            while (c22726M50390.m50390() != null) {
                c22726M50390 = c22726M50390.m50390();
            }
            this.f52702 = c22726M50390;
        }
    }
}
