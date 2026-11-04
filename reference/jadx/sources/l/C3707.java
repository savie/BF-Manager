package l;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۗ᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes3.dex */
public final class C3707 extends C23263 {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f12719;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public boolean f12720;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f12721;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f12722;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f12723;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f12724;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public boolean f12725;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f12726;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f12727;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public boolean f12728;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f12729;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f12730;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final SparseArray f12731;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public boolean f12732;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f12733;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f12734;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public boolean f12735;

    public C3707() {
        this.f12731 = new SparseArray();
        this.f12730 = new SparseBooleanArray();
        this.f12735 = true;
        this.f12728 = false;
        this.f12726 = true;
        this.f12732 = false;
        this.f12719 = true;
        this.f12727 = false;
        this.f12720 = false;
        this.f12723 = false;
        this.f12722 = false;
        this.f12733 = true;
        this.f12721 = true;
        this.f12725 = true;
        this.f12729 = false;
        this.f12734 = true;
        this.f12724 = false;
    }

    public C3707(C20861 c20861) {
        super(c20861);
        this.f12735 = c20861.f66782;
        this.f12728 = c20861.f66775;
        this.f12726 = c20861.f66773;
        this.f12732 = c20861.f66779;
        this.f12719 = c20861.f66766;
        this.f12727 = c20861.f66774;
        this.f12720 = c20861.f66767;
        this.f12723 = c20861.f66770;
        this.f12722 = c20861.f66769;
        this.f12733 = c20861.f66780;
        this.f12721 = c20861.f66768;
        this.f12725 = c20861.f66772;
        this.f12729 = c20861.f66776;
        this.f12734 = c20861.f66781;
        this.f12724 = c20861.f66771;
        SparseArray sparseArray = c20861.f66778;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.f12731 = sparseArray2;
        this.f12730 = c20861.f66777.clone();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m12050(C3125 c3125) {
        m52379(c3125);
    }

    @Override // l.C23263
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C23263 mo12048() {
        super.mo12048();
        return this;
    }

    @Override // l.C23263
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23263 mo12047(String[] strArr) {
        super.mo12047(strArr);
        return this;
    }

    @Override // l.C23263
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23263 mo12051() {
        super.mo12051();
        return this;
    }

    @Override // l.C23263
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23263 mo12049() {
        super.mo12049();
        return this;
    }

    @Override // l.C23263
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23263 mo12046(C17295 c17295) {
        super.mo12046(c17295);
        return this;
    }

    @Override // l.C23263
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23263 mo12043(int i) {
        super.mo12043(i);
        return this;
    }

    @Override // l.C23263
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23263 mo12045(Set set) {
        super.mo12045(set);
        return this;
    }

    @Override // l.C23263
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23263 mo12044(int i, boolean z) {
        super.mo12044(i, z);
        return this;
    }

    @Override // l.C23263
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3125 mo12042() {
        return new C20861(this, 0);
    }
}
