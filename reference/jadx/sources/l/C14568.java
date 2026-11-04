package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ܰۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E6PC */
/* JADX INFO: loaded from: classes4.dex */
public final class C14568 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence f45890;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f45893;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f45894;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f45895;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f45897;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f45898;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C11228 f45900;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList f45892 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ArrayList f45899 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f45891 = new ArrayList();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f45902 = new ArrayList();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f45901 = new ArrayList();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f45896 = "//__MTSX_FORMAT_DIRECTIVE_";

    public C14568(CharSequence charSequence, boolean z, int i, boolean z2) {
        String str;
        this.f45890 = charSequence;
        this.f45898 = z;
        this.f45897 = i;
        this.f45894 = z2;
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
        this.f45895 = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0140  */
    /* JADX WARN: Code duplicated, block: B:102:0x0144  */
    /* JADX WARN: Code duplicated, block: B:104:0x0148  */
    /* JADX WARN: Code duplicated, block: B:106:0x0150  */
    /* JADX WARN: Code duplicated, block: B:108:0x0154  */
    /* JADX WARN: Code duplicated, block: B:110:0x015d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0161  */
    /* JADX WARN: Code duplicated, block: B:117:0x018d  */
    /* JADX WARN: Code duplicated, block: B:154:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:79:0x010a  */
    /* JADX WARN: Code duplicated, block: B:80:0x010c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0116  */
    /* JADX WARN: Code duplicated, block: B:87:0x011d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0120  */
    /* JADX WARN: Code duplicated, block: B:91:0x0127  */
    /* JADX WARN: Code duplicated, block: B:92:0x012a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0131  */
    /* JADX WARN: Code duplicated, block: B:96:0x0134  */
    /* JADX WARN: Code duplicated, block: B:99:0x013b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35136(CharSequence charSequence, boolean z, int i, boolean z2, C11228 c11228) throws InterruptedException {
        int i2;
        String strM43743;
        C6366 c6366;
        C12331 c12331;
        C12331 c12332;
        C14568 c14568 = new C14568(charSequence, z, i, z2);
        int i3 = 0;
        C12331 c12333 = null;
        int i4 = 0;
        int i5 = 1;
        while (true) {
            CharSequence charSequence2 = c14568.f45890;
            int length = charSequence2.length();
            ArrayList arrayList = c14568.f45892;
            if (i3 >= length) {
                if (c12333 != null) {
                    throw new C18298(i5, 0, "Unclosed #if block");
                }
                arrayList.add(new C24266(i4, new C18334(i4, charSequence2.length(), charSequence2), null, null));
                while (C18856.m43742(c14568.f45896, charSequence2, 0) >= 0) {
                    c14568.f45896 = C8947.m23910(new StringBuilder(), c14568.f45896, "_");
                }
                if (arrayList.size() == 1) {
                    C19044.m44154(charSequence, z, i, c11228);
                    return;
                }
                C11228 c11228M28291 = c11228.m28291();
                try {
                    c14568.f45900 = c11228M28291;
                    c14568.m35137(c11228);
                    c11228M28291.close();
                    return;
                } catch (Throwable th) {
                    try {
                        c11228M28291.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            m35135();
            int i6 = i3;
            while (i6 < charSequence2.length() && charSequence2.charAt(i6) != '\r' && charSequence2.charAt(i6) != '\n') {
                if ((i6 & 4095) == 0) {
                    m35135();
                }
                char cCharAt = charSequence2.charAt(i6);
                if (!Character.isWhitespace(cCharAt) && cCharAt != ',') {
                    c14568.f45893++;
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
                        strM43743 = C18856.m43743(i8, i9, charSequence2);
                        strM43743.getClass();
                        switch (strM43743) {
                            case "if":
                            case "elif":
                            case "else":
                            case "endif":
                            case "error":
                                break;
                            default:
                                strM43743 = null;
                                break;
                        }
                    } else {
                        strM43743 = null;
                    }
                    if (strM43743 != null) {
                        int i10 = i6;
                        int i11 = i7;
                        arrayList.add(new C24266(i4, new C18334(i4, i3, charSequence2), c12333, null));
                        if (c12333 == null) {
                            c6366 = null;
                        } else {
                            c6366 = c12333.f39612;
                        }
                        switch (strM43743) {
                            case "if":
                                if (c12333 == null && c12333.f39613 >= 128) {
                                    throw new C18298(i5, 0, "Directive nesting limit exceeded", EnumC21282.LIMIT);
                                }
                                ArrayList arrayList2 = c14568.f45899;
                                c6366 = new C6366(arrayList2.size(), c12333);
                                arrayList2.add(c6366);
                                c12331 = new C12331(c6366, 0);
                                break;
                                break;
                            case "elif":
                            case "else":
                            case "endif":
                                if (c6366 != null) {
                                    throw new C18298(i5, 0, "Unexpected #".concat(strM43743));
                                }
                                c12332 = c6366.f21496;
                                if (!strM43743.equals("endif")) {
                                    if (!c6366.f21497) {
                                        c6366.f21494++;
                                    }
                                    c12331 = c12332;
                                    c12333 = c12331;
                                } else {
                                    if (!c6366.f21497) {
                                        throw new C18298(i5, 0, C14442.m34865("Unexpected #", strM43743, " after #else"));
                                    }
                                    c6366.f21497 = strM43743.equals("else");
                                    int i12 = c6366.f21494;
                                    c6366.f21494 = i12 + 1;
                                    c12331 = new C12331(c6366, i12);
                                    c12333 = c12332;
                                }
                                break;
                                break;
                            default:
                                c6366 = null;
                                c12331 = c12333;
                                break;
                        }
                        C24266 c24266 = new C24266(i3, new C18334(i3, i2, charSequence2), c12333, strM43743);
                        c24266.f78565 = C18856.m43743(i11, i10, charSequence2);
                        c24266.f78568 = c6366;
                        arrayList.add(c24266);
                        c12333 = c12331;
                        i4 = i2;
                    }
                    i5++;
                    i3 = i2;
                }
            }
            if (i7 == i6) {
                strM43743 = null;
            } else {
                strM43743 = null;
            }
            if (strM43743 != null) {
                int i13 = i6;
                int i14 = i7;
                arrayList.add(new C24266(i4, new C18334(i4, i3, charSequence2), c12333, null));
                if (c12333 == null) {
                    c6366 = null;
                } else {
                    c6366 = c12333.f39612;
                }
                switch (strM43743) {
                    case 3357:
                        if (strM43743.equals("if")) {
                        }
                        break;
                    case 3116036:
                        if (strM43743.equals("elif")) {
                        }
                        break;
                    case 3116345:
                        if (strM43743.equals("else")) {
                        }
                        break;
                    case 96652088:
                        if (strM43743.equals("endif")) {
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
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
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    */
                /*
                    Method dump skipped, instruction units count: 642
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: l.C14568.m35136(java.lang.CharSequence, boolean, int, boolean, l.ۤ᩻ᩴ):void");
            }

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            private void m35137(C11228 c11228) throws InterruptedException {
                char cCharAt;
                ArrayList<C6366> arrayList = this.f45899;
                int size = arrayList.size();
                int[] iArr = new int[size];
                m35140(iArr);
                for (C6366 c6366 : arrayList) {
                    for (int i = 0; i < c6366.f21494 && m35142(); i++) {
                        Arrays.fill(iArr, 0);
                        iArr[c6366.f21498] = i;
                        C12331 c12331 = c6366.f21496;
                        while (c12331 != null) {
                            C6366 c6367 = c12331.f39612;
                            iArr[c6367.f21498] = c12331.f39611;
                            c12331 = c6367.f21496;
                        }
                        m35140(iArr);
                    }
                    if (!m35142()) {
                        break;
                    }
                }
                Arrays.fill(iArr, 0);
                loop3: while (m35142()) {
                    int i2 = size - 1;
                    while (true) {
                        if (i2 < 0) {
                            break loop3;
                        }
                        int i3 = iArr[i2] + 1;
                        iArr[i2] = i3;
                        if (i3 < ((C6366) arrayList.get(i2)).f21494) {
                            break;
                        }
                        iArr[i2] = 0;
                        i2--;
                    }
                    m35140(iArr);
                }
                boolean z = this.f45894;
                ArrayList<C24266> arrayList2 = this.f45892;
                if (z) {
                    C4128 c4128 = null;
                    int i4 = Integer.MAX_VALUE;
                    for (C4128 c4129 : this.f45901) {
                        for (int i5 = 0; i5 <= c4129.f13998; i5++) {
                            m35135();
                            C24266 c24266 = (C24266) arrayList2.get(i5);
                            if (c24266.f78569 == null && c24266.f78566.length() != 0 && c24266.f78570 == null && m35141(c24266.f78563, c4129.f13997)) {
                                if (c4128 == null) {
                                    c4128 = c4129;
                                }
                                for (int[] iArr2 : this.f45902) {
                                    int i6 = 0;
                                    for (C6366 c6368 : arrayList) {
                                        m35135();
                                        boolean zM35141 = m35141(c6368.f21496, c4129.f13997);
                                        if (zM35141 == m35141(c6368.f21496, iArr2)) {
                                            if (zM35141) {
                                                int[] iArr3 = c4129.f13997;
                                                int i7 = c6368.f21498;
                                                if (iArr3[i7] == iArr2[i7]) {
                                                    continue;
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                        i6++;
                                        if (i6 >= i4) {
                                            break;
                                        }
                                    }
                                    if (i6 < i4) {
                                        c4128 = c4129;
                                        i4 = i6;
                                    }
                                }
                                if (i4 == 1) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    if (c4128 != null) {
                        throw c4128.f13999;
                    }
                }
                for (C24266 c24267 : arrayList2) {
                    String str = c24267.f78569;
                    C18334 c18334 = c24267.f78566;
                    if (str == null) {
                        C18334 c18335 = c24267.f78570;
                        if (c18335 != null) {
                            c18334 = c18335;
                        }
                        c11228.append((CharSequence) c18334);
                    } else {
                        C6366 c6369 = c24267.f78568;
                        String str2 = c6369 == null ? c24267.f78567 : c6369.f21495;
                        if (str2 == null) {
                            c11228.append((CharSequence) c18334);
                        } else {
                            c11228.append((CharSequence) str2).append((CharSequence) c24267.f78565);
                            if (c18334.length() != 0 && ((cCharAt = c18334.charAt(c18334.length() - 1)) == '\r' || cCharAt == '\n')) {
                                c11228.append((CharSequence) this.f45895);
                            }
                        }
                    }
                }
            }

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            private void m35140(int[] iArr) throws InterruptedException {
                int[] iArr2;
                char c;
                char cCharAt;
                m35135();
                if (m35142()) {
                    ArrayList arrayList = this.f45891;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (Arrays.equals((int[]) it.next(), iArr)) {
                            return;
                        }
                    }
                    int[] iArr3 = (int[]) iArr.clone();
                    arrayList.add(iArr3);
                    C11228 c11228M28291 = this.f45900.m28291();
                    try {
                        C11228 c11228M28292 = this.f45900.m28291();
                        boolean z = this.f45894;
                        ArrayList arrayList2 = this.f45892;
                        if (z) {
                            try {
                                iArr2 = new int[arrayList2.size()];
                            } catch (Throwable th) {
                                try {
                                    c11228M28292.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } else {
                            iArr2 = null;
                        }
                        if (iArr2 != null) {
                            Arrays.fill(iArr2, -1);
                        }
                        int i = 0;
                        while (true) {
                            c = '\n';
                            boolean z2 = true;
                            if (i < arrayList2.size()) {
                                m35135();
                                C24266 c24266 = (C24266) arrayList2.get(i);
                                String str = c24266.f78569;
                                C18334 c18334 = c24266.f78566;
                                if (str == null) {
                                    if (m35141(c24266.f78563, iArr)) {
                                        if (iArr2 != null) {
                                            iArr2[i] = c11228M28291.length();
                                        }
                                        c11228M28291.append((CharSequence) c18334);
                                    }
                                } else {
                                    c11228M28291.append((CharSequence) (this.f45896 + i + "__"));
                                    if (c18334.length() == 0 || ((cCharAt = c18334.charAt(c18334.length() - 1)) != '\r' && cCharAt != '\n')) {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        c11228M28291.append((CharSequence) this.f45895);
                                    }
                                }
                                i++;
                            } else {
                                try {
                                    break;
                                } catch (C18298 e) {
                                    if (e.m42631()) {
                                        throw e;
                                    }
                                    if (z) {
                                        m35138(c11228M28291, iArr2, iArr3, e);
                                    }
                                    c11228M28292.close();
                                    c11228M28291.close();
                                    return;
                                }
                            }
                        }
                        C19044.m44154(c11228M28291, this.f45898, this.f45897, c11228M28292);
                        if (z) {
                            this.f45902.add(iArr3);
                        }
                        int i2 = 0;
                        int i3 = 1;
                        while (i3 < arrayList2.size()) {
                            m35135();
                            C24266 c24267 = (C24266) arrayList2.get(i3);
                            String str2 = this.f45896 + i3 + "__";
                            int iM43742 = C18856.m43742(str2, c11228M28292, i2);
                            int i4 = iM43742;
                            while (i4 > i2) {
                                char cCharAt2 = c11228M28292.charAt(i4 - 1);
                                if (cCharAt2 == '\r' || cCharAt2 == c) {
                                    break;
                                } else {
                                    i4--;
                                }
                            }
                            int i5 = i4;
                            m35139((C24266) arrayList2.get(i3 - 1), iArr, c11228M28292, i2, i5);
                            if (m35141(c24267.f78563, iArr) && c24267.f78567 == null) {
                                c24267.f78567 = C18856.m43743(i5, iM43742, c11228M28292);
                                if (c24267.f78569.equals("if")) {
                                    C6366 c6366 = c24267.f78568;
                                    if (c6366.f21495 == null) {
                                        c6366.f21495 = c24267.f78567;
                                    }
                                }
                            }
                            int length = iM43742 + str2.length();
                            if (length < c11228M28292.length() && c11228M28292.charAt(length) == '\r') {
                                length++;
                            }
                            if (length < c11228M28292.length() && c11228M28292.charAt(length) == '\n') {
                                length++;
                            }
                            i2 = length;
                            i3 += 2;
                            c = '\n';
                        }
                        m35139((C24266) arrayList2.get(arrayList2.size() - 1), iArr, c11228M28292, i2, c11228M28292.length());
                        c11228M28292.close();
                        c11228M28291.close();
                    } catch (Throwable th3) {
                        try {
                            c11228M28291.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                }
            }

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            private void m35138(C11228 c11228, int[] iArr, int[] iArr2, C18298 c18298) {
                int iM25739 = C9919.m25739(c11228, c18298.m42632(), c18298.m42630(), true);
                ArrayList arrayList = this.f45892;
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    C24266 c24266 = (C24266) arrayList.get(size);
                    int i = iArr[size];
                    if (i >= 0 && i <= iM25739 && c24266.f78566.length() != 0) {
                        C5949 c5949M25740 = C9919.m25740(c18298.getMessage(), this.f45890, Math.min(c24266.f78566.length(), iM25739 - iArr[size]) + c24266.f78564);
                        if (c18298.m42633()) {
                            size = arrayList.size() - 1;
                        }
                        this.f45901.add(new C4128(iArr2, size, c5949M25740));
                        return;
                    }
                    size--;
                }
            }

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            private void m35139(C24266 c24266, int[] iArr, C11228 c11228, int i, int i2) {
                if (c24266.f78570 == null && m35141(c24266.f78563, iArr)) {
                    int length = this.f45900.length();
                    this.f45900.m28292(i, i2, c11228);
                    C11228 c11229 = this.f45900;
                    c24266.f78570 = new C18334(length, c11229.length(), c11229);
                }
            }

            /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
            private boolean m35142() {
                return ((long) this.f45891.size()) < Math.max(1L, Math.min(64L, X931RNG.BLOCK128_RESEED_MAX / Math.max(1L, this.f45893)));
            }

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public static boolean m35141(C12331 c12331, int[] iArr) {
                while (c12331 != null) {
                    C6366 c6366 = c12331.f39612;
                    if (iArr[c6366.f21498] != c12331.f39611) {
                        return false;
                    }
                    c12331 = c6366.f21496;
                }
                return true;
            }

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public static void m35135() throws InterruptedException {
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
            }
        }
