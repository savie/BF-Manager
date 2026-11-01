package l;

import android.text.TextUtils;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.ۛۖܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes3.dex */
public final class C5770 extends AbstractC2324 implements Comparable {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final int f19589;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f19590;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final int f19591;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f19592;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final int f19593;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final int f19594;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final int f19595;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f19596;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final boolean f19597;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f19598;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f19599;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final C1536 f19600;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f19601;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final int f19602;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final int f19603;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f19604;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f19605;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final int f19606;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f19607;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f19608;

    @Override // l.AbstractC2324
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3635(AbstractC2324 abstractC2324) {
        int i;
        String str;
        int i2;
        C5770 c5770 = (C5770) abstractC2324;
        C7648 c7648 = c5770.f8252;
        C1536 c1536 = this.f19600;
        boolean z = c1536.f6237;
        C7648 c7649 = this.f8252;
        if (!z && ((i2 = c7649.f25249) == -1 || i2 != c7648.f25249)) {
            return false;
        }
        if (!this.f19601 && ((str = c7649.f25265) == null || !TextUtils.equals(str, c7648.f25265))) {
            return false;
        }
        if (!c1536.f6241 && ((i = c7649.f25260) == -1 || i != c7648.f25260)) {
            return false;
        }
        if (c1536.f6244) {
            return true;
        }
        return this.f19607 == c5770.f19607 && this.f19597 == c5770.f19597;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0145  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:89:0x0120  */
    /* JADX WARN: Code duplicated, block: B:90:0x0122  */
    /* JADX WARN: Code duplicated, block: B:93:0x012b  */
    /* JADX WARN: Code duplicated, block: B:94:0x012d  */
    public C5770(int i, C17216 c17216, int i2, C1536 c1536, int i3, boolean z, C17059 c17059, int i4) {
        int i5;
        int iM31987;
        boolean z2;
        int iM31988;
        boolean z3;
        boolean z4;
        boolean z5;
        C10867 c10867;
        super(i, c17216, i2);
        this.f19600 = c1536;
        boolean z6 = c1536.f6247;
        AbstractC22433 abstractC22433 = c1536.f47174;
        AbstractC22433 abstractC22434 = c1536.f47177;
        int i6 = z6 ? 24 : 16;
        int i7 = 1;
        this.f19601 = c1536.f6239 && (i4 & i6) != 0;
        this.f19592 = C12909.m31989(this.f8252.f25269);
        this.f19598 = C13958.m33815(i3, false);
        int i8 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i8 >= abstractC22434.size()) {
                i8 = Integer.MAX_VALUE;
                iM31987 = 0;
                break;
            } else {
                iM31987 = C12909.m31987(this.f8252, (String) abstractC22434.get(i8), false);
                if (iM31987 > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f19591 = i8;
        this.f19595 = iM31987;
        int i9 = this.f8252.f25244;
        int i10 = c1536.f47192;
        this.f19589 = (i9 == 0 || i9 != i10) ? Integer.bitCount(i9 & i10) : Integer.MAX_VALUE;
        C7648 c7648 = this.f8252;
        int i11 = c7648.f25244;
        this.f19599 = i11 == 0 || (i11 & 1) != 0;
        this.f19608 = (c7648.f25243 & 1) != 0;
        String str = c7648.f25265;
        if (str != null) {
            switch (str) {
                case "audio/eac3-joc":
                case "audio/ac4":
                case "audio/iamf":
                    z2 = true;
                    break;
                default:
                    z2 = false;
                    break;
            }
        } else {
            z2 = false;
        }
        this.f19604 = z2;
        int i12 = c7648.f25249;
        this.f19596 = i12;
        this.f19602 = c7648.f25260;
        int i13 = c7648.f25242;
        this.f19605 = i13;
        this.f19590 = (i13 == -1 || i13 <= c1536.f47181) && (i12 == -1 || i12 <= c1536.f47169) && c17059.apply(c7648);
        String[] strArrM41863 = C17983.m41863();
        int i14 = 0;
        while (true) {
            if (i14 < strArrM41863.length) {
                iM31988 = C12909.m31987(this.f8252, strArrM41863[i14], false);
                if (iM31988 <= 0) {
                    i14++;
                }
            } else {
                i14 = Integer.MAX_VALUE;
                iM31988 = 0;
            }
        }
        this.f19594 = i14;
        this.f19603 = iM31988;
        for (int i15 = 0; i15 < abstractC22433.size(); i15++) {
            String str2 = this.f8252.f25265;
            if (str2 != null && str2.equals(abstractC22433.get(i15))) {
                i5 = i15;
                this.f19606 = i5;
                if ((i3 & MLKEMEngine.KyberPolyBytes) == 128) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f19607 = z3;
                if ((i3 & 64) == 64) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f19597 = z4;
                boolean z7 = this.f19590;
                C1536 c1537 = this.f19600;
                z5 = c1537.f6243;
                c10867 = c1537.f47170;
                if (!C13958.m33815(i3, z5) && (z7 || c1537.f6240)) {
                    c10867.getClass();
                    if (C13958.m33815(i3, false) && z7 && this.f8252.f25242 != -1 && !c1537.f47179 && !c1537.f47168 && ((c1537.f6238 || !z) && (i6 & i3) != 0)) {
                        i7 = 2;
                    }
                } else {
                    i7 = 0;
                }
                this.f19593 = i7;
            }
        }
        this.f19606 = i5;
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 128) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f19607 = z3;
        if ((i3 & 64) == 64) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f19597 = z4;
        boolean z8 = this.f19590;
        C1536 c1538 = this.f19600;
        z5 = c1538.f6243;
        c10867 = c1538.f47170;
        if (C13958.m33815(i3, z5)) {
            i7 = 0;
        } else {
            c10867.getClass();
            if (C13958.m33815(i3, false)) {
                i7 = 2;
            }
        }
        this.f19593 = i7;
    }

    @Override // l.AbstractC2324
    /* JADX INFO: renamed from: ۙ */
    public final int mo3634() {
        return this.f19593;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C5770 c5770) {
        AbstractC10959 abstractC10959Mo27718;
        boolean z = this.f19598;
        boolean z2 = this.f19590;
        if (z2 && z) {
            abstractC10959Mo27718 = C12909.f42905;
        } else {
            abstractC10959Mo27718 = C12909.f42905.mo27718();
        }
        AbstractC13116 abstractC13116M32469 = AbstractC13116.m32469();
        boolean z3 = c5770.f19598;
        int i = c5770.f19605;
        AbstractC13116 abstractC13116Mo4145 = abstractC13116M32469.mo4146(z, z3).mo4145(Integer.valueOf(this.f19591), Integer.valueOf(c5770.f19591), AbstractC10959.m27714().mo27718()).mo4143(this.f19595, c5770.f19595).mo4143(this.f19589, c5770.f19589).mo4146(this.f19608, c5770.f19608).mo4146(this.f19599, c5770.f19599).mo4145(Integer.valueOf(this.f19594), Integer.valueOf(c5770.f19594), AbstractC10959.m27714().mo27718()).mo4143(this.f19603, c5770.f19603).mo4146(z2, c5770.f19590).mo4145(Integer.valueOf(this.f19606), Integer.valueOf(c5770.f19606), AbstractC10959.m27714().mo27718());
        boolean z4 = this.f19600.f47168;
        int i2 = this.f19605;
        if (z4) {
            abstractC13116Mo4145 = abstractC13116Mo4145.mo4145(Integer.valueOf(i2), Integer.valueOf(i), C12909.f42905.mo27718());
        }
        AbstractC13116 abstractC13116Mo4146 = abstractC13116Mo4145.mo4146(this.f19607, c5770.f19607).mo4146(this.f19597, c5770.f19597).mo4146(this.f19604, c5770.f19604).mo4145(Integer.valueOf(this.f19596), Integer.valueOf(c5770.f19596), abstractC10959Mo27718).mo4145(Integer.valueOf(this.f19602), Integer.valueOf(c5770.f19602), abstractC10959Mo27718);
        if (C13638.equals(this.f19592, c5770.f19592)) {
            abstractC13116Mo4146 = abstractC13116Mo4146.mo4145(Integer.valueOf(i2), Integer.valueOf(i), abstractC10959Mo27718);
        }
        return abstractC13116Mo4146.mo4142();
    }
}
