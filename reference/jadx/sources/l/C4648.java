package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۙ۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O2OZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4648 extends AbstractC2656 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11705 f16438;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Object f16439;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f16440;

    public C4648(C11705 c11705, int i) {
        this.f16438 = c11705;
        this.f16439 = C11705.m29227(c11705, i);
        this.f16440 = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f16439;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m12831() {
        int i = this.f16440;
        Object obj = this.f16439;
        C11705 c11705 = this.f16438;
        if (i == -1 || i >= c11705.size() || !C13638.equals(obj, C11705.m29227(c11705, this.f16440))) {
            this.f16440 = c11705.m29225(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C11705 c11705 = this.f16438;
        Map mapM29242 = c11705.m29242();
        if (mapM29242 != null) {
            return mapM29242.get(this.f16439);
        }
        m12831();
        int i = this.f16440;
        if (i == -1) {
            return null;
        }
        return C11705.m29238(c11705, i);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C11705 c11705 = this.f16438;
        Map mapM29242 = c11705.m29242();
        Object obj2 = this.f16439;
        if (mapM29242 != null) {
            return mapM29242.put(obj2, obj);
        }
        m12831();
        int i = this.f16440;
        if (i == -1) {
            c11705.put(obj2, obj);
            return null;
        }
        Object objM29238 = C11705.m29238(c11705, i);
        C11705.m29229(c11705, this.f16440, obj);
        return objM29238;
    }
}
