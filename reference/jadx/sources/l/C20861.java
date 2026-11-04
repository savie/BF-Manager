package l;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.alipay.sdk.m.l.d;
import com.alipay.sdk.m.t0.b;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵᩸᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20861 extends C3125 {

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final C20861 f66765 = new C20861(new C3707(), 0);

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f66766;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean f66767;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final boolean f66768;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f66769;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean f66770;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final boolean f66771;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final boolean f66772;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f66773;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f66774;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final boolean f66775;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final boolean f66776;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f66777;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final SparseArray f66778;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final boolean f66779;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f66780;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f66781;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f66782;

    public /* synthetic */ C20861(C3707 c3707, int i) {
        this(c3707);
    }

    static {
        C4794.m14773(1000, 1001, b.c, b.d, 1004);
        C4794.m14773(1005, 1006, 1007, 1008, 1009);
        C4794.m14773(d.a, 1011, 1012, 1013, 1014);
        C7116.m19499(1015);
        C7116.m19499(1016);
        C7116.m19499(1017);
        C7116.m19499(1018);
    }

    public C20861(C3707 c3707) {
        super(c3707);
        this.f66782 = c3707.f12735;
        this.f66775 = c3707.f12728;
        this.f66773 = c3707.f12726;
        this.f66779 = c3707.f12732;
        this.f66766 = c3707.f12719;
        this.f66774 = c3707.f12727;
        this.f66767 = c3707.f12720;
        this.f66770 = c3707.f12723;
        this.f66769 = c3707.f12722;
        this.f66780 = c3707.f12733;
        this.f66768 = c3707.f12721;
        this.f66772 = c3707.f12725;
        this.f66776 = c3707.f12729;
        this.f66781 = c3707.f12734;
        this.f66771 = c3707.f12724;
        this.f66778 = c3707.f12731;
        this.f66777 = c3707.f12730;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47687(int i) {
        return this.f66777.get(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m47688(int i, C3356 c3356) {
        Map map = (Map) this.f66778.get(i);
        return map != null && map.containsKey(c3356);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12656 m47686(int i, C3356 c3356) {
        Map map = (Map) this.f66778.get(i);
        if (map != null) {
            return (C12656) map.get(c3356);
        }
        return null;
    }

    @Override // l.C3125
    /* JADX INFO: renamed from: ۙ */
    public final C23263 mo10195() {
        return new C3707(this);
    }

    @Override // l.C3125
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20861.class == obj.getClass()) {
            C20861 c20861 = (C20861) obj;
            if (super.equals(c20861) && this.f66782 == c20861.f66782 && this.f66775 == c20861.f66775 && this.f66773 == c20861.f66773 && this.f66779 == c20861.f66779 && this.f66766 == c20861.f66766 && this.f66774 == c20861.f66774 && this.f66767 == c20861.f66767 && this.f66770 == c20861.f66770 && this.f66769 == c20861.f66769 && this.f66780 == c20861.f66780 && this.f66768 == c20861.f66768 && this.f66772 == c20861.f66772 && this.f66776 == c20861.f66776 && this.f66781 == c20861.f66781 && this.f66771 == c20861.f66771) {
                SparseBooleanArray sparseBooleanArray = c20861.f66777;
                SparseBooleanArray sparseBooleanArray2 = this.f66777;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = c20861.f66778;
                    SparseArray sparseArray2 = this.f66778;
                    int size2 = sparseArray2.size();
                    if (sparseArray.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray2.valueAt(i2);
                                Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        C3356 c3356 = (C3356) entry.getKey();
                                        if (!map2.containsKey(c3356) || !C17359.equals(entry.getValue(), map2.get(c3356))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // l.C3125
    public final int hashCode() {
        return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f66782 ? 1 : 0)) * 31) + (this.f66775 ? 1 : 0)) * 31) + (this.f66773 ? 1 : 0)) * 31) + (this.f66779 ? 1 : 0)) * 31) + (this.f66766 ? 1 : 0)) * 31) + (this.f66774 ? 1 : 0)) * 31) + (this.f66767 ? 1 : 0)) * 31) + (this.f66770 ? 1 : 0)) * 31) + (this.f66769 ? 1 : 0)) * 31) + (this.f66780 ? 1 : 0)) * 31) + (this.f66768 ? 1 : 0)) * 31) + (this.f66772 ? 1 : 0)) * 31) + (this.f66776 ? 1 : 0)) * 31) + (this.f66781 ? 1 : 0)) * 31) + (this.f66771 ? 1 : 0);
    }
}
