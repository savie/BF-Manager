package l;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.alipay.sdk.m.l.d;
import com.alipay.sdk.m.t0.b;
import java.util.Map;

/* JADX INFO: renamed from: l.֫ۖܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes2.dex */
public final class C1536 extends C14395 {

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final C1536 f6235 = new C1536(new C14238(), 0);

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f6236;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f6237;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final boolean f6238;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f6239;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final boolean f6240;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final boolean f6241;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final boolean f6242;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final boolean f6243;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f6244;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final boolean f6245;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f6246;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final boolean f6247;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f6248;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final boolean f6249;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final SparseArray f6250;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f6251;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f6252;

    public /* synthetic */ C1536(C14238 c14238, int i) {
        this(c14238);
    }

    static {
        C9023.m23358(1000, 1001, b.c, b.d, 1004);
        C9023.m23358(1005, 1006, 1007, 1008, 1009);
        C9023.m23358(d.a, 1011, 1012, 1013, 1014);
        C17983.m41806(1015);
        C17983.m41806(1016);
        C17983.m41806(1017);
        C17983.m41806(1018);
    }

    public C1536(C14238 c14238) {
        super(c14238);
        this.f6252 = c14238.f46652;
        this.f6251 = c14238.f46651;
        this.f6236 = c14238.f46636;
        this.f6242 = c14238.f46642;
        this.f6240 = c14238.f46640;
        this.f6239 = c14238.f46639;
        this.f6241 = c14238.f46641;
        this.f6237 = c14238.f46637;
        this.f6244 = c14238.f46644;
        this.f6247 = c14238.f46647;
        this.f6246 = c14238.f46646;
        this.f6243 = c14238.f46643;
        this.f6249 = c14238.f46649;
        this.f6238 = c14238.f46638;
        this.f6245 = c14238.f46645;
        this.f6250 = c14238.f46650;
        this.f6248 = c14238.f46648;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m5309(int i) {
        return this.f6248.get(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m5310(int i, C23679 c23679) {
        Map map = (Map) this.f6250.get(i);
        return map != null && map.containsKey(c23679);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9299 m5307(int i, C23679 c23679) {
        Map map = (Map) this.f6250.get(i);
        if (map != null) {
            return (C9299) map.get(c23679);
        }
        return null;
    }

    @Override // l.C14395
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23567 mo5308() {
        return new C14238(this);
    }

    @Override // l.C14395
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1536.class == obj.getClass()) {
            C1536 c1536 = (C1536) obj;
            if (super.equals(c1536) && this.f6252 == c1536.f6252 && this.f6251 == c1536.f6251 && this.f6236 == c1536.f6236 && this.f6242 == c1536.f6242 && this.f6240 == c1536.f6240 && this.f6239 == c1536.f6239 && this.f6241 == c1536.f6241 && this.f6237 == c1536.f6237 && this.f6244 == c1536.f6244 && this.f6247 == c1536.f6247 && this.f6246 == c1536.f6246 && this.f6243 == c1536.f6243 && this.f6249 == c1536.f6249 && this.f6238 == c1536.f6238 && this.f6245 == c1536.f6245) {
                SparseBooleanArray sparseBooleanArray = c1536.f6248;
                SparseBooleanArray sparseBooleanArray2 = this.f6248;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = c1536.f6250;
                    SparseArray sparseArray2 = this.f6250;
                    int size2 = sparseArray2.size();
                    if (sparseArray.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray2.valueAt(i2);
                                Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        C23679 c23679 = (C23679) entry.getKey();
                                        if (!map2.containsKey(c23679) || !C13638.equals(entry.getValue(), map2.get(c23679))) {
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

    @Override // l.C14395
    public final int hashCode() {
        return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f6252 ? 1 : 0)) * 31) + (this.f6251 ? 1 : 0)) * 31) + (this.f6236 ? 1 : 0)) * 31) + (this.f6242 ? 1 : 0)) * 31) + (this.f6240 ? 1 : 0)) * 31) + (this.f6239 ? 1 : 0)) * 31) + (this.f6241 ? 1 : 0)) * 31) + (this.f6237 ? 1 : 0)) * 31) + (this.f6244 ? 1 : 0)) * 31) + (this.f6247 ? 1 : 0)) * 31) + (this.f6246 ? 1 : 0)) * 31) + (this.f6243 ? 1 : 0)) * 31) + (this.f6249 ? 1 : 0)) * 31) + (this.f6238 ? 1 : 0)) * 31) + (this.f6245 ? 1 : 0);
    }
}
