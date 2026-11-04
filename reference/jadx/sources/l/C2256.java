package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBGP */
/* JADX INFO: loaded from: classes2.dex */
public final class C2256 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16646 f7376;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f7377;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f7379;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f7381;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f7383;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f7380 = -1;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f7378 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f7382 = false;

    public C2256(C16646 c16646, int i, int i2, int i3) {
        this.f7376 = c16646;
        this.f7377 = i2;
        this.f7383 = new ArrayList(i);
        this.f7381 = i3;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m7684() {
        return this.f7378;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m7681() {
        return this.f7382;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashSet m7683() {
        HashSet hashSet = new HashSet(20);
        for (AbstractC18884 abstractC18884 : this.f7383) {
            if (abstractC18884 instanceof C18138) {
                hashSet.add(((C18138) abstractC18884).m42255());
            } else {
                int i = 0;
                if (abstractC18884 instanceof C15679) {
                    C15679 c15679 = (C15679) abstractC18884;
                    while (i < c15679.m37452()) {
                        hashSet.add(c15679.m37451(i));
                        i++;
                    }
                } else if (abstractC18884 instanceof C23139) {
                    C7521 c7521M52062 = ((C23139) abstractC18884).m52062();
                    int size = c7521M52062.size();
                    while (i < size) {
                        m7671(hashSet, c7521M52062.get(i));
                        i++;
                    }
                } else if (abstractC18884 instanceof C20155) {
                    m7671(hashSet, ((C20155) abstractC18884).m46373());
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7671(HashSet hashSet, C20946 c20946) {
        if (c20946 == null) {
            return;
        }
        C3046 c3046M47896 = c20946.m47896();
        C9976 name = c3046M47896.getName();
        C9976 signature = c3046M47896.getSignature();
        C5085 type = c20946.getType();
        if (type != C5085.f17762) {
            hashSet.add(C1028.m3931(type));
        } else {
            hashSet.add(C1028.m3931(C5085.f17733));
        }
        if (name != null) {
            hashSet.add(name);
        }
        if (signature != null) {
            hashSet.add(signature);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7679(AbstractC18884 abstractC18884) {
        C20946 c20946M46373;
        this.f7383.add(abstractC18884);
        if (!this.f7378 && abstractC18884.m43799().m24067() >= 0) {
            this.f7378 = true;
        }
        if (this.f7382) {
            return;
        }
        if (abstractC18884 instanceof C23139) {
            C7521 c7521M52062 = ((C23139) abstractC18884).m52062();
            int size = c7521M52062.size();
            for (int i = 0; i < size; i++) {
                C20946 c20946 = c7521M52062.get(i);
                if (c20946 == null || c20946.m47896().getName() == null) {
                }
            }
            return;
        }
        if (!(abstractC18884 instanceof C20155) || (c20946M46373 = ((C20155) abstractC18884).m46373()) == null || c20946M46373.m47896().getName() == null) {
            return;
        }
        this.f7382 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC18884 m7677(int i) {
        return (AbstractC18884) this.f7383.get(i);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m7682() {
        return this.f7383.size();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7680(C21122 c21122) {
        int size = this.f7383.size() - 2;
        try {
            C24631 c24631 = (C24631) this.f7383.get(size);
            this.f7383.set(size, new C24631(c24631.m43802().m3866(), c24631.m43799(), c24631.m43795(), c21122));
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException("non-reversible instruction");
        } catch (IndexOutOfBoundsException unused2) {
            throw new IllegalArgumentException("too few instructions");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7678(InterfaceC0239 interfaceC0239) {
        int iMo1721;
        for (AbstractC18884 abstractC18884 : this.f7383) {
            if (abstractC18884 instanceof C18138) {
                C18138 c18138 = (C18138) abstractC18884;
                AbstractC13487 abstractC13487M42255 = c18138.m42255();
                int iMo1722 = interfaceC0239.mo1721(abstractC13487M42255);
                if (iMo1722 >= 0) {
                    c18138.m42256(iMo1722);
                }
                if ((abstractC13487M42255 instanceof AbstractC14451) && (iMo1721 = interfaceC0239.mo1721(((AbstractC14451) abstractC13487M42255).m34884())) >= 0) {
                    c18138.m42253(iMo1721);
                }
            } else if (abstractC18884 instanceof C15679) {
                C15679 c15679 = (C15679) abstractC18884;
                for (int i = 0; i < c15679.m37452(); i++) {
                    AbstractC13487 abstractC13487M37451 = c15679.m37451(i);
                    c15679.m37449(i, interfaceC0239.mo1721(abstractC13487M37451));
                    if (abstractC13487M37451 instanceof AbstractC14451) {
                        c15679.m37453(interfaceC0239.mo1721(((AbstractC14451) abstractC13487M37451).m34884()));
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0133 A[LOOP:9: B:67:0x012d->B:69:0x0133, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0142  */
    /* JADX WARN: Code duplicated, block: B:75:0x014b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9933 m7676() {
        int i;
        C20901 c20901M43805;
        C8442 c8442;
        Iterator it;
        boolean z;
        if (this.f7380 >= 0) {
            throw new UnsupportedOperationException("already processed");
        }
        int size = this.f7383.size();
        C0985[] c0985Arr = new C0985[size];
        for (int i2 = 0; i2 < size; i2++) {
            c0985Arr[i2] = ((AbstractC18884) this.f7383.get(i2)).m43802();
        }
        m7672(c0985Arr);
        this.f7376.getClass();
        do {
            int i3 = this.f7380;
            i = this.f7377;
            int i4 = i3 + i + this.f7379;
            int i5 = this.f7381;
            int i6 = i4 - i5;
            Iterator it2 = this.f7383.iterator();
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (it2.hasNext()) {
                C0063 c0063M43795 = ((AbstractC18884) it2.next()).m43795();
                for (int i11 = 0; i11 < c0063M43795.size(); i11++) {
                    C20946 c20946M31619get = c0063M43795.m31619get(i11);
                    if (c20946M31619get.m47895()) {
                        boolean z2 = c20946M31619get.m47903() >= i6;
                        if (c20946M31619get.m47893()) {
                            if (z2) {
                                i8++;
                            } else {
                                i10++;
                            }
                        } else if (z2) {
                            i7++;
                        } else {
                            i9++;
                        }
                    }
                }
            }
            if (i7 > i8 && i9 > i10) {
                m7673();
            } else if (i7 > i8) {
                m7674();
            } else {
                if (i9 <= i10) {
                    break;
                }
                m7673();
                if (i5 != 0 && i8 > i7) {
                    m7674();
                }
            }
        } while (m7672(c0985Arr));
        if (this.f7380 == 0) {
            int size2 = this.f7383.size();
            for (int i12 = 0; i12 < size2; i12++) {
                AbstractC18884 abstractC18884 = (AbstractC18884) this.f7383.get(i12);
                C0985 c0985M43802 = abstractC18884.m43802();
                C0985 c0985 = c0985Arr[i12];
                if (c0985M43802 != c0985) {
                    this.f7383.set(i12, abstractC18884.mo14214(c0985));
                }
            }
        } else {
            int size3 = this.f7383.size();
            ArrayList arrayList = new ArrayList(size3 * 2);
            ArrayList arrayList2 = new ArrayList();
            for (int i13 = 0; i13 < size3; i13++) {
                AbstractC18884 abstractC18884M43800 = (AbstractC18884) this.f7383.get(i13);
                C0985 c0985M43803 = abstractC18884M43800.m43802();
                C0985 c0985M7675 = c0985Arr[i13];
                if (c0985M7675 != null) {
                    c8442 = null;
                    c20901M43805 = null;
                } else {
                    c0985M7675 = m7675(abstractC18884M43800);
                    BitSet bitSetMo3135 = c0985M7675.m3868().mo3135(abstractC18884M43800);
                    C8442 c8442M43796 = abstractC18884M43800.m43796(bitSetMo3135);
                    c20901M43805 = abstractC18884M43800.m43805(bitSetMo3135);
                    abstractC18884M43800 = abstractC18884M43800.m43800(bitSetMo3135);
                    c8442 = c8442M43796;
                }
                if (abstractC18884M43800 instanceof C21122) {
                    C21122 c21122 = (C21122) abstractC18884M43800;
                    if (c21122.m48222()) {
                        arrayList2.add(c21122);
                    } else {
                        if (c8442 != null) {
                            arrayList.add(c8442);
                        }
                        if (!(abstractC18884M43800 instanceof AbstractC14933) && arrayList2.size() > 0) {
                            it = arrayList2.iterator();
                            while (it.hasNext()) {
                                arrayList.add((C21122) it.next());
                            }
                            arrayList2.clear();
                        }
                        if (c0985M7675 != c0985M43803) {
                            abstractC18884M43800 = abstractC18884M43800.mo14214(c0985M7675);
                        }
                        arrayList.add(abstractC18884M43800);
                        if (c20901M43805 != null) {
                            arrayList.add(c20901M43805);
                        }
                    }
                } else {
                    if (c8442 != null) {
                        arrayList.add(c8442);
                    }
                    if (!(abstractC18884M43800 instanceof AbstractC14933)) {
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList.add((C21122) it.next());
                        }
                        arrayList2.clear();
                    }
                    if (c0985M7675 != c0985M43803) {
                        abstractC18884M43800 = abstractC18884M43800.mo14214(c0985M7675);
                    }
                    arrayList.add(abstractC18884M43800);
                    if (c20901M43805 != null) {
                        arrayList.add(c20901M43805);
                    }
                }
            }
            this.f7383 = arrayList;
        }
        do {
            int size4 = this.f7383.size();
            int iMo8331 = 0;
            for (int i14 = 0; i14 < size4; i14++) {
                AbstractC18884 abstractC18885 = (AbstractC18884) this.f7383.get(i14);
                abstractC18885.m43798(iMo8331);
                iMo8331 += abstractC18885.mo8331();
            }
            int size5 = this.f7383.size();
            int i15 = 0;
            z = false;
            while (i15 < size5) {
                AbstractC18884 abstractC18886 = (AbstractC18884) this.f7383.get(i15);
                if (abstractC18886 instanceof C24631) {
                    C0985 c0985M43804 = abstractC18886.m43802();
                    C24631 c24631 = (C24631) abstractC18886;
                    if (c0985M43804.m3868().mo16072(c24631)) {
                        continue;
                    } else {
                        if (c0985M43804.m3863() == 40) {
                            C0985 c0985M7670 = m7670(abstractC18886, c0985M43804);
                            if (c0985M7670 == null) {
                                throw new UnsupportedOperationException("method too long");
                            }
                            this.f7383.set(i15, abstractC18886.mo14214(c0985M7670));
                        } else {
                            try {
                                int i16 = i15 + 1;
                                C21122 c21123 = (C21122) this.f7383.get(i16);
                                this.f7383.set(i15, new C24631(C9187.f29815, c24631.m43799(), C0063.f947, c24631.m54969()));
                                this.f7383.add(i15, new C24631(c24631.m43802().m3866(), c24631.m43799(), c24631.m43795(), c21123));
                                size5++;
                                i15 = i16;
                            } catch (ClassCastException unused) {
                                throw new IllegalStateException("unpaired TargetInsn");
                            } catch (IndexOutOfBoundsException unused2) {
                                throw new IllegalStateException("unpaired TargetInsn (dangling)");
                            }
                        }
                        z = true;
                    }
                }
                i15++;
            }
        } while (z);
        return C9933.m25766(this.f7383, this.f7380 + i + this.f7379);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m7672(C0985[] c0985Arr) {
        int i = this.f7380;
        if (i < 0) {
            i = 0;
        }
        boolean z = false;
        while (true) {
            int size = this.f7383.size();
            int i2 = this.f7380;
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC18884 abstractC18884 = (AbstractC18884) this.f7383.get(i3);
                C0985 c0985 = c0985Arr[i3];
                C0985 c0985M7670 = m7670(abstractC18884, c0985);
                if (c0985M7670 == null) {
                    int iM43806 = abstractC18884.m43806(m7675(abstractC18884).m3868().mo3135(abstractC18884));
                    if (iM43806 > i2) {
                        i2 = iM43806;
                    }
                } else {
                    if (c0985 == c0985M7670) {
                    }
                }
                c0985Arr[i3] = c0985M7670;
            }
            if (i < i2) {
                int i4 = i2 - i;
                int size2 = this.f7383.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    AbstractC18884 abstractC18885 = (AbstractC18884) this.f7383.get(i5);
                    if (!(abstractC18885 instanceof C21122)) {
                        this.f7383.set(i5, abstractC18885.mo8332(i4));
                    }
                }
                z = true;
                i = i2;
            } else {
                this.f7380 = i;
                return z;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C0985 m7670(AbstractC18884 abstractC18884, C0985 c0985) {
        while (c0985 != null) {
            if (c0985.m3868().mo3138(abstractC18884)) {
                this.f7376.getClass();
                return c0985;
            }
            c0985 = C9187.m24310(c0985);
        }
        return c0985;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C0985 m7675(AbstractC18884 abstractC18884) {
        C0985 c0985M7670 = m7670(abstractC18884.m43803(), abstractC18884.m43802());
        if (c0985M7670 != null) {
            return c0985M7670;
        }
        throw new C20288("No expanded opcode for " + abstractC18884, null);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m7673() {
        int size = this.f7383.size();
        for (int i = 0; i < size; i++) {
            AbstractC18884 abstractC18884 = (AbstractC18884) this.f7383.get(i);
            if (!(abstractC18884 instanceof C21122)) {
                this.f7383.set(i, abstractC18884.mo8332(1));
            }
        }
        this.f7380++;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m7674() {
        int size = this.f7383.size();
        int i = this.f7377 + this.f7380 + this.f7379;
        int i2 = i - this.f7381;
        C22985 c22985 = new C22985(i);
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 >= i2) {
                c22985.mo13841(i3, i3 + 1, 1);
            } else {
                c22985.mo13841(i3, i3, 1);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC18884 abstractC18884 = (AbstractC18884) this.f7383.get(i4);
            if (!(abstractC18884 instanceof C21122)) {
                this.f7383.set(i4, abstractC18884.mo43797(c22985));
            }
        }
        this.f7379++;
    }
}
