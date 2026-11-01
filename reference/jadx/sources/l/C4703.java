package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۙܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6PC */
/* JADX INFO: loaded from: classes2.dex */
public final class C4703 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f16602;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f16605;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f16606;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final CharSequence f16607;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C18503 f16608;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f16609;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList f16600 = new ArrayList();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f16601 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f16603 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f16604 = "//__MTSX_FORMAT_DIRECTIVE_";

    public C4703(int i, CharSequence charSequence, boolean z) {
        String str;
        this.f16607 = charSequence;
        this.f16605 = z;
        this.f16602 = i;
        int i2 = 0;
        while (i2 < charSequence.length() && charSequence.charAt(i2) != '\r' && charSequence.charAt(i2) != '\n') {
            i2++;
        }
        if (i2 >= charSequence.length() || charSequence.charAt(i2) != '\r') {
            str = "\n";
        } else {
            int i3 = i2 + 1;
            str = (i3 >= charSequence.length() || charSequence.charAt(i3) != '\n') ? "\r" : "\r\n";
        }
        this.f16609 = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0132  */
    /* JADX WARN: Code duplicated, block: B:102:0x0136  */
    /* JADX WARN: Code duplicated, block: B:103:0x013a  */
    /* JADX WARN: Code duplicated, block: B:105:0x013e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0146  */
    /* JADX WARN: Code duplicated, block: B:109:0x014a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0152  */
    /* JADX WARN: Code duplicated, block: B:113:0x0156  */
    /* JADX WARN: Code duplicated, block: B:118:0x0185  */
    /* JADX WARN: Code duplicated, block: B:155:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:79:0x0102  */
    /* JADX WARN: Code duplicated, block: B:80:0x0104  */
    /* JADX WARN: Code duplicated, block: B:84:0x010e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0115  */
    /* JADX WARN: Code duplicated, block: B:88:0x0117  */
    /* JADX WARN: Code duplicated, block: B:91:0x011e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0120  */
    /* JADX WARN: Code duplicated, block: B:95:0x0127  */
    /* JADX WARN: Code duplicated, block: B:96:0x0129  */
    /* JADX WARN: Code duplicated, block: B:99:0x0130  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m13018(CharSequence charSequence, boolean z, int i, C18503 c18503) throws InterruptedException {
        int i2;
        String strM48081;
        C9914 c9914;
        C2151 c2151;
        C4703 c4703 = new C4703(i, charSequence, z);
        int i3 = 0;
        C2151 c2152 = null;
        int i4 = 0;
        int i5 = 1;
        while (true) {
            CharSequence charSequence2 = c4703.f16607;
            int length = charSequence2.length();
            ArrayList arrayList = c4703.f16600;
            if (i3 >= length) {
                if (c2152 != null) {
                    throw new C13877(i5, 0, "Unclosed #if block");
                }
                arrayList.add(new C3562(new C17499(i4, charSequence2.length(), charSequence2), null, null));
                while (C21460.m48079(c4703.f16604, charSequence2, 0) >= 0) {
                    c4703.f16604 = C22697.m50267(new StringBuilder(), c4703.f16604, "_");
                }
                if (arrayList.size() == 1) {
                    C5409.m14981(charSequence, z, i, c18503);
                    return;
                }
                C18503 c18503M42895 = c18503.m42895();
                try {
                    c4703.f16608 = c18503M42895;
                    c4703.m13020(c18503);
                    c18503M42895.close();
                    return;
                } catch (Throwable th) {
                    try {
                        c18503M42895.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            m13017();
            int i6 = i3;
            while (i6 < charSequence2.length() && charSequence2.charAt(i6) != '\r' && charSequence2.charAt(i6) != '\n') {
                if ((i6 & 4095) == 0) {
                    m13017();
                }
                char cCharAt = charSequence2.charAt(i6);
                if (!Character.isWhitespace(cCharAt) && cCharAt != ',') {
                    c4703.f16606++;
                }
                i6++;
            }
            if (i6 < charSequence2.length()) {
                i2 = i6 + 1;
                if (charSequence2.charAt(i6) == '\r' && i2 < charSequence2.length() && charSequence2.charAt(i2) == '\n') {
                    i2 = i6 + 2;
                }
            } else {
                i2 = i6;
            }
            for (int i7 = i3; i7 < i6; i7++) {
                char cCharAt2 = charSequence2.charAt(i7);
                if (cCharAt2 != ' ' && cCharAt2 != '\t' && cCharAt2 != '\f') {
                    if (i7 == i6 && charSequence2.charAt(i7) == '#') {
                        int i8 = i7 + 1;
                        int i9 = i8;
                        while (i9 < i6 && !Character.isWhitespace(charSequence2.charAt(i9))) {
                            i9++;
                        }
                        strM48081 = C21460.m48081(i8, i9, charSequence2);
                        strM48081.getClass();
                        switch (strM48081) {
                            case "if":
                            case "elif":
                            case "else":
                            case "endif":
                            case "error":
                                break;
                            default:
                                strM48081 = null;
                                break;
                        }
                    } else {
                        strM48081 = null;
                    }
                    if (strM48081 != null) {
                        int i10 = i6;
                        arrayList.add(new C3562(new C17499(i4, i3, charSequence2), c2152, null));
                        if (c2152 == null) {
                            c9914 = null;
                        } else {
                            c9914 = c2152.f7821;
                        }
                        switch (strM48081) {
                            case "if":
                                if (c2152 == null && c2152.f7822 >= 128) {
                                    throw new C13877(i5, 0, "Directive nesting limit exceeded");
                                }
                                ArrayList arrayList2 = c4703.f16601;
                                c9914 = new C9914(arrayList2.size(), c2152);
                                arrayList2.add(c9914);
                                c2151 = new C2151(c9914, 0);
                                break;
                                break;
                            case "elif":
                            case "else":
                            case "endif":
                                if (c9914 != null) {
                                    throw new C13877(i5, 0, "Unexpected #".concat(strM48081));
                                }
                                c2151 = c9914.f33886;
                                if (!strM48081.equals("endif")) {
                                    if (!c9914.f33888) {
                                        c9914.f33885++;
                                    }
                                    c2152 = c2151;
                                } else {
                                    if (!c9914.f33888) {
                                        throw new C13877(i5, 0, C16523.m38890("Unexpected #", strM48081, " after #else"));
                                    }
                                    c9914.f33888 = strM48081.equals("else");
                                    int i11 = c9914.f33885;
                                    c9914.f33885 = i11 + 1;
                                    c2151 = new C2151(c9914, i11);
                                    c2152 = c2151;
                                }
                                break;
                                break;
                            default:
                                c9914 = null;
                                c2151 = c2152;
                                break;
                        }
                        C3562 c3562 = new C3562(new C17499(i3, i2, charSequence2), c2152, strM48081);
                        c3562.f13118 = C21460.m48081(i7, i10, charSequence2);
                        c3562.f13117 = c9914;
                        arrayList.add(c3562);
                        c2152 = c2151;
                        i4 = i2;
                    }
                    i5++;
                    i3 = i2;
                }
            }
            if (i7 == i6) {
                strM48081 = null;
            } else {
                strM48081 = null;
            }
            if (strM48081 != null) {
                int i12 = i6;
                arrayList.add(new C3562(new C17499(i4, i3, charSequence2), c2152, null));
                if (c2152 == null) {
                    c9914 = null;
                } else {
                    c9914 = c2152.f7821;
                }
                switch (strM48081) {
                    case 3357:
                        if (!strM48081.equals("if")) {
                        }
                        break;
                    case 3116036:
                        if (!strM48081.equals("elif")) {
                        }
                        break;
                    case 3116345:
                        if (!strM48081.equals("else")) {
                        }
                        break;
                    case 96652088:
                        if (!strM48081.equals("endif")) {
                        }
                        break;
                    default:
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:235)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
                    	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    */
                /*
                    Method dump skipped, instruction units count: 620
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: l.C4703.m13018(java.lang.CharSequence, boolean, int, l.ᩴۘۚ):void");
            }

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            private void m13020(C18503 c18503) throws InterruptedException {
                char cCharAt;
                ArrayList<C9914> arrayList = this.f16601;
                int size = arrayList.size();
                int[] iArr = new int[size];
                m13021(iArr);
                for (C9914 c9914 : arrayList) {
                    for (int i = 0; i < c9914.f33885 && m13023(); i++) {
                        Arrays.fill(iArr, 0);
                        iArr[c9914.f33884] = i;
                        C2151 c2151 = c9914.f33886;
                        while (c2151 != null) {
                            C9914 c9915 = c2151.f7821;
                            iArr[c9915.f33884] = c2151.f7820;
                            c2151 = c9915.f33886;
                        }
                        m13021(iArr);
                    }
                    if (!m13023()) {
                        break;
                    }
                }
                Arrays.fill(iArr, 0);
                loop3: while (m13023()) {
                    int i2 = size - 1;
                    while (true) {
                        if (i2 < 0) {
                            break loop3;
                        }
                        int i3 = iArr[i2] + 1;
                        iArr[i2] = i3;
                        if (i3 < ((C9914) arrayList.get(i2)).f33885) {
                            break;
                        }
                        iArr[i2] = 0;
                        i2--;
                    }
                    m13021(iArr);
                }
                for (C3562 c3562 : this.f16600) {
                    String str = c3562.f13119;
                    C17499 c17499 = c3562.f13114;
                    if (str == null) {
                        C17499 c174910 = c3562.f13115;
                        if (c174910 != null) {
                            c17499 = c174910;
                        }
                        c18503.append((CharSequence) c17499);
                    } else {
                        C9914 c9916 = c3562.f13117;
                        String str2 = c9916 == null ? c3562.f13120 : c9916.f33887;
                        if (str2 == null) {
                            c18503.append((CharSequence) c17499);
                        } else {
                            c18503.append((CharSequence) str2).append((CharSequence) c3562.f13118);
                            if (c17499.length() != 0 && ((cCharAt = c17499.charAt(c17499.length() - 1)) == '\r' || cCharAt == '\n')) {
                                c18503.append((CharSequence) this.f16609);
                            }
                        }
                    }
                }
            }

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            private void m13021(int[] iArr) throws InterruptedException {
                char c;
                char cCharAt;
                ArrayList arrayList = this.f16600;
                m13017();
                if (m13023()) {
                    ArrayList arrayList2 = this.f16603;
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (Arrays.equals((int[]) it.next(), iArr)) {
                            return;
                        }
                    }
                    arrayList2.add((int[]) iArr.clone());
                    C18503 c18503M42895 = this.f16608.m42895();
                    try {
                        C18503 c18503M42896 = this.f16608.m42895();
                        int i = 0;
                        while (true) {
                            try {
                                c = '\n';
                                boolean z = true;
                                if (i >= arrayList.size()) {
                                    try {
                                        break;
                                    } catch (C13877 unused) {
                                        c18503M42896.close();
                                        c18503M42895.close();
                                        return;
                                    }
                                }
                                m13017();
                                C3562 c3562 = (C3562) arrayList.get(i);
                                String str = c3562.f13119;
                                C17499 c17499 = c3562.f13114;
                                if (str == null) {
                                    if (m13022(c3562.f13116, iArr)) {
                                        c18503M42895.append((CharSequence) c17499);
                                    }
                                } else {
                                    c18503M42895.append((CharSequence) (this.f16604 + i + "__"));
                                    if (c17499.length() == 0 || ((cCharAt = c17499.charAt(c17499.length() - 1)) != '\r' && cCharAt != '\n')) {
                                        z = false;
                                    }
                                    if (z) {
                                        c18503M42895.append((CharSequence) this.f16609);
                                    }
                                }
                                i++;
                            } catch (Throwable th) {
                                try {
                                    c18503M42896.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                            try {
                                c18503M42895.close();
                                throw th;
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                                throw th;
                            }
                        }
                        C5409.m14981(c18503M42895, this.f16605, this.f16602, c18503M42896);
                        int i2 = 0;
                        int i3 = 1;
                        while (i3 < arrayList.size()) {
                            m13017();
                            C3562 c3563 = (C3562) arrayList.get(i3);
                            String str2 = this.f16604 + i3 + "__";
                            int iM48079 = C21460.m48079(str2, c18503M42896, i2);
                            int i4 = iM48079;
                            while (i4 > i2) {
                                char cCharAt2 = c18503M42896.charAt(i4 - 1);
                                if (cCharAt2 == '\r' || cCharAt2 == c) {
                                    break;
                                } else {
                                    i4--;
                                }
                            }
                            int i5 = i4;
                            m13019((C3562) arrayList.get(i3 - 1), iArr, c18503M42896, i2, i5);
                            if (m13022(c3563.f13116, iArr) && c3563.f13120 == null) {
                                c3563.f13120 = C21460.m48081(i5, iM48079, c18503M42896);
                                if (c3563.f13119.equals("if")) {
                                    C9914 c9914 = c3563.f13117;
                                    if (c9914.f33887 == null) {
                                        c9914.f33887 = c3563.f13120;
                                    }
                                }
                            }
                            int length = iM48079 + str2.length();
                            if (length < c18503M42896.length() && c18503M42896.charAt(length) == '\r') {
                                length++;
                            }
                            if (length < c18503M42896.length() && c18503M42896.charAt(length) == '\n') {
                                length++;
                            }
                            i2 = length;
                            i3 += 2;
                            c = '\n';
                        }
                        m13019((C3562) arrayList.get(arrayList.size() - 1), iArr, c18503M42896, i2, c18503M42896.length());
                        c18503M42896.close();
                        c18503M42895.close();
                    } catch (Throwable th4) {
                        c18503M42895.close();
                        throw th4;
                    }
                }
            }

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            private void m13019(C3562 c3562, int[] iArr, C18503 c18503, int i, int i2) {
                if (c3562.f13115 == null && m13022(c3562.f13116, iArr)) {
                    int length = this.f16608.length();
                    this.f16608.m42896(i, i2, c18503);
                    C18503 c18504 = this.f16608;
                    c3562.f13115 = new C17499(length, c18504.length(), c18504);
                }
            }

            /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
            private boolean m13023() {
                return ((long) this.f16603.size()) < Math.max(1L, Math.min(64L, X931RNG.BLOCK128_RESEED_MAX / Math.max(1L, this.f16606)));
            }

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public static boolean m13022(C2151 c2151, int[] iArr) {
                while (c2151 != null) {
                    C9914 c9914 = c2151.f7821;
                    if (iArr[c9914.f33884] != c2151.f7820) {
                        return false;
                    }
                    c2151 = c9914.f33886;
                }
                return true;
            }

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public static void m13017() throws InterruptedException {
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
            }
        }
