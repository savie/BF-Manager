package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H6OO */
/* JADX INFO: loaded from: classes4.dex */
public final class C19044 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean[] f61714;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7857[] f61715;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11228 f61716;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f61717;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f61718;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C7857[] f61719;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f61720;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int[] f61721;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean[] f61722;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f61723;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f61724;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final List f61725;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m44156(int i) {
        return i == 59 || i == 57 || i == 55;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44155(CharSequence charSequence, boolean z, int i, boolean z2, C11228 c11228) throws InterruptedException {
        try {
            C14568.m35136(charSequence, z, i, z2, c11228);
        } catch (C7683 unused) {
            throw new InterruptedException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:112:0x020a  */
    /* JADX WARN: Code duplicated, block: B:119:0x024e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0255  */
    /* JADX WARN: Code duplicated, block: B:124:0x025d  */
    /* JADX WARN: Code duplicated, block: B:186:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x026e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:100:0x01db. Please report as an issue. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44154(java.lang.CharSequence r12, boolean r13, int r14, l.C11228 r15) {
        /*
            Method dump skipped, instruction units count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19044.m44154(java.lang.CharSequence, boolean, int, l.ۤ᩻ᩴ):void");
    }

    public C19044(CharSequence charSequence, ArrayList arrayList, boolean z, int i, C11228 c11228) {
        String str;
        char cCharAt;
        this.f61725 = arrayList;
        int iMax = Math.max(1, i);
        this.f61718 = iMax;
        this.f61724 = z ? "\t" : C24276.m54280(' ', iMax);
        int i2 = 0;
        while (true) {
            str = "\n";
            if (i2 >= charSequence.length() || (cCharAt = charSequence.charAt(i2)) == '\n') {
                break;
            }
            if (cCharAt == '\r') {
                int i3 = i2 + 1;
                if (i3 < charSequence.length() && charSequence.charAt(i3) == '\n') {
                    str = "\r\n";
                    break;
                } else {
                    str = "\r";
                    break;
                }
            }
            i2++;
        }
        this.f61720 = str;
        this.f61716 = c11228;
        this.f61719 = new C7857[arrayList.size()];
        this.f61715 = new C7857[arrayList.size()];
        this.f61722 = new boolean[arrayList.size()];
        this.f61714 = new boolean[arrayList.size()];
        this.f61717 = new int[arrayList.size()];
        this.f61721 = new int[arrayList.size() + 1];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m44157(int i, int i2) {
        return ((!this.f61722[i2] && !this.f61714[i2]) || i == 0 || i == 65 || m44156(i) || i == 54 || i == 61 || i == 62 || i == 63 || ((InterfaceC8743) this.f61725.get(i2)).getType() == 61) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0128  */
    /* JADX WARN: Code duplicated, block: B:103:0x012e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0143  */
    /* JADX WARN: Code duplicated, block: B:111:0x0152  */
    /* JADX WARN: Code duplicated, block: B:113:0x0155 A[LOOP:3: B:112:0x0153->B:113:0x0155, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x017d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0199  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00db  */
    /* JADX WARN: Code duplicated, block: B:91:0x010d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0115  */
    /* JADX WARN: Code duplicated, block: B:97:0x0118 A[LOOP:2: B:96:0x0116->B:97:0x0118, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0124  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44153(CharSequence charSequence) throws Throwable {
        String str;
        C11228 c11228;
        String str2;
        boolean z;
        int i;
        boolean z2;
        C7857 c7857;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        int i3;
        int i4;
        int i5;
        ArrayDeque arrayDeque = new ArrayDeque();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        boolean z6 = false;
        boolean z7 = false;
        int i9 = 0;
        while (true) {
            List list = this.f61725;
            int size = list.size();
            str = this.f61720;
            c11228 = this.f61716;
            if (i6 >= size) {
                break;
            }
            m44152();
            InterfaceC8743 interfaceC8743 = (InterfaceC8743) list.get(i6);
            int type = interfaceC8743.getType();
            if (type == -1) {
                break;
            }
            if (type != 53) {
                if (type == 64) {
                    String text = interfaceC8743.getText();
                    int i10 = 0;
                    for (int i11 = 0; i11 < text.length(); i11++) {
                        char cCharAt = text.charAt(i11);
                        if (cCharAt == '\n' || (cCharAt == '\r' && ((i5 = i11 + 1) == text.length() || text.charAt(i5) != '\n'))) {
                            i10++;
                        }
                    }
                    i8 += i10;
                } else {
                    C7857 c7858 = this.f61715[i6];
                    if (c7858 != null) {
                        arrayDeque.pop();
                        i9 = c7858.f26183;
                    }
                    boolean[] zArr = this.f61722;
                    boolean z8 = (!zArr[i6] || arrayDeque.isEmpty() || !((C7857) arrayDeque.peek()).f26181 || i7 == 54 || i7 == 61) ? false : true;
                    boolean z9 = type == 65 ? z6 || i8 > 0 : z6 || z7 || z8 || (c7858 != null && c7858.f26181);
                    int[] iArr = this.f61721;
                    if (z9) {
                        str2 = str;
                        z = z9;
                    } else {
                        z = z9;
                        int i12 = this.f61717[i6];
                        str2 = str;
                        if (i12 != 0 && (this.f61723 + iArr[i12]) - iArr[i6] > 120) {
                            i = i9 + 1;
                            z2 = true;
                        }
                        if (!z2) {
                            if (c7858 != null && !z7 && ((z8 || type == 65 || (z6 && (zArr[i6] || arrayDeque.isEmpty()))) && i7 != 0 && !m44156(i7) && i7 != 54 && i7 != 61 && i7 != 62 && i7 != 63)) {
                                i3 = i8 < 2 ? 1 : 2;
                            }
                            if (c11228.length() != 0) {
                                for (i4 = 0; i4 < i3; i4++) {
                                    c11228.append((CharSequence) str2);
                                }
                                this.f61723 = 0;
                            }
                        } else if (this.f61723 > 0) {
                            if (m44157(i7, i6)) {
                                c11228.append(',');
                                this.f61723++;
                            }
                            if (type != 65 || m44158(i7, type)) {
                                c11228.append(' ');
                                this.f61723++;
                            }
                        }
                        if (this.f61723 == 0) {
                            for (i2 = 0; i2 < i; i2++) {
                                c11228.append((CharSequence) this.f61724);
                            }
                            this.f61723 = i * this.f61718;
                        }
                        c11228.append((CharSequence) interfaceC8743.getText());
                        int length = interfaceC8743.getText().length() + this.f61723;
                        this.f61723 = length;
                        c7857 = this.f61719[i6];
                        if (c7857 != null) {
                            c7857.f26183 = i9;
                            if (c7857.f26179 || (!c7857.f26182 && (length + iArr[c7857.f26178 + 1]) - iArr[i6 + 1] <= 120)) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            c7857.f26181 = z5;
                            arrayDeque.push(c7857);
                            if (c7857.f26181) {
                                i9++;
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            z3 = false;
                        }
                        if (type == 65) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        i8 = 0;
                        z7 = z3;
                        z6 = z4;
                        i7 = type;
                    }
                    i = i9;
                    z2 = z;
                    if (!z2) {
                        if (this.f61723 > 0) {
                            if (m44157(i7, i6)) {
                                c11228.append(',');
                                this.f61723++;
                            }
                            if (type != 65) {
                                c11228.append(' ');
                                this.f61723++;
                            } else {
                                c11228.append(' ');
                                this.f61723++;
                            }
                        }
                    } else {
                        if (c7858 != null) {
                        }
                        if (c11228.length() != 0) {
                            while (i4 < i3) {
                                c11228.append((CharSequence) str2);
                            }
                            this.f61723 = 0;
                        }
                    }
                    if (this.f61723 == 0) {
                        while (i2 < i) {
                            c11228.append((CharSequence) this.f61724);
                        }
                        this.f61723 = i * this.f61718;
                    }
                    c11228.append((CharSequence) interfaceC8743.getText());
                    int length2 = interfaceC8743.getText().length() + this.f61723;
                    this.f61723 = length2;
                    c7857 = this.f61719[i6];
                    if (c7857 != null) {
                        c7857.f26183 = i9;
                        if (c7857.f26179) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        c7857.f26181 = z5;
                        arrayDeque.push(c7857);
                        if (c7857.f26181) {
                            i9++;
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else {
                        z3 = false;
                    }
                    if (type == 65) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    i8 = 0;
                    z7 = z3;
                    z6 = z4;
                    i7 = type;
                }
            }
            i6++;
        }
        if (i7 != 0) {
            if (charSequence.charAt(charSequence.length() - 1) == '\n' || charSequence.charAt(charSequence.length() - 1) == '\r') {
                c11228.append((CharSequence) str);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m44158(int i, int i2) {
        return (i == 0 || m44156(i) || i2 == 54 || i2 == 53 || i2 == 55 || i2 == 60 || i2 == 58 || i2 == 56) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44152() throws InterruptedException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }
    }
}
