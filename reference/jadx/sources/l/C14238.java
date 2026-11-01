package l;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳۖܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes4.dex */
public final class C14238 extends C23567 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public boolean f46636;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f46637;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public boolean f46638;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f46639;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f46640;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f46641;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f46642;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public boolean f46643;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f46644;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f46645;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f46646;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f46647;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f46648;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public boolean f46649;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final SparseArray f46650;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f46651;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f46652;

    public C14238() {
        this.f46650 = new SparseArray();
        this.f46648 = new SparseBooleanArray();
        this.f46652 = true;
        this.f46651 = false;
        this.f46636 = true;
        this.f46642 = false;
        this.f46640 = true;
        this.f46639 = false;
        this.f46641 = false;
        this.f46637 = false;
        this.f46644 = false;
        this.f46647 = true;
        this.f46646 = true;
        this.f46643 = true;
        this.f46649 = false;
        this.f46638 = true;
        this.f46645 = false;
    }

    public C14238(C1536 c1536) {
        super(c1536);
        this.f46652 = c1536.f6252;
        this.f46651 = c1536.f6251;
        this.f46636 = c1536.f6236;
        this.f46642 = c1536.f6242;
        this.f46640 = c1536.f6240;
        this.f46639 = c1536.f6239;
        this.f46641 = c1536.f6241;
        this.f46637 = c1536.f6237;
        this.f46644 = c1536.f6244;
        this.f46647 = c1536.f6247;
        this.f46646 = c1536.f6246;
        this.f46643 = c1536.f6243;
        this.f46649 = c1536.f6249;
        this.f46638 = c1536.f6238;
        this.f46645 = c1536.f6245;
        SparseArray sparseArray = c1536.f6250;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.f46650 = sparseArray2;
        this.f46648 = c1536.f6248.clone();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34369(C14395 c14395) {
        m51999(c14395);
    }

    @Override // l.C23567
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C23567 mo34367() {
        super.mo34367();
        return this;
    }

    @Override // l.C23567
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23567 mo34366(String[] strArr) {
        super.mo34366(strArr);
        return this;
    }

    @Override // l.C23567
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C23567 mo34360() {
        super.mo34360();
        return this;
    }

    @Override // l.C23567
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23567 mo34368() {
        super.mo34368();
        return this;
    }

    @Override // l.C23567
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23567 mo34365(C5927 c5927) {
        super.mo34365(c5927);
        return this;
    }

    @Override // l.C23567
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23567 mo34362(int i) {
        super.mo34362(i);
        return this;
    }

    @Override // l.C23567
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23567 mo34364(Set set) {
        super.mo34364(set);
        return this;
    }

    @Override // l.C23567
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23567 mo34363(int i, boolean z) {
        super.mo34363(i, z);
        return this;
    }

    @Override // l.C23567
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14395 mo34361() {
        return new C1536(this, 0);
    }
}
