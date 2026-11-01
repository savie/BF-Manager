package l;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۡۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PE */
/* JADX INFO: loaded from: classes3.dex */
public final class C8826 extends AbstractC20820 {
    @Override // l.AbstractC20820
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo19849() {
        return false;
    }

    @Override // l.AbstractC20820
    /* JADX INFO: renamed from: ۙ */
    public final Object mo19839(Field field) {
        try {
            return field.get(null);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // l.AbstractC20820
    /* JADX INFO: renamed from: ܰ */
    public final byte mo19848(long j, Object obj) {
        if (C15882.f51457) {
            return C15882.m37767(j, obj);
        }
        return C15882.m37792(j, obj);
    }

    @Override // l.AbstractC20820
    /* JADX INFO: renamed from: ۙ */
    public final void mo19841(Object obj, long j, byte b) {
        if (C15882.f51457) {
            C15882.m37788(obj, j, b);
        } else {
            C15882.m37761(obj, j, b);
        }
    }

    @Override // l.AbstractC20820
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19846(long j, Object obj) {
        if (C15882.f51457) {
            return C15882.m37790(j, obj);
        }
        return C15882.m37763(j, obj);
    }

    @Override // l.AbstractC20820
    /* JADX INFO: renamed from: ۙ */
    public final void mo19844(Object obj, long j, boolean z) {
        if (C15882.f51457) {
            C15882.m37780(obj, j, z);
        } else {
            C15882.m37797(obj, j, z);
        }
    }

    @Override // l.AbstractC20820
    /* JADX INFO: renamed from: ۖ */
    public final float mo19837(long j, Object obj) {
        return Float.intBitsToFloat(m46823(j, obj));
    }

    @Override // l.AbstractC20820
    /* JADX INFO: renamed from: ۙ */
    public final void mo19843(Object obj, long j, float f) {
        m46820(Float.floatToIntBits(f), j, obj);
    }

    @Override // l.AbstractC20820
    /* JADX INFO: renamed from: ۨ */
    public final double mo19847(long j, Object obj) {
        return Double.longBitsToDouble(m46826(j, obj));
    }

    @Override // l.AbstractC20820
    /* JADX INFO: renamed from: ۙ */
    public final void mo19842(Object obj, long j, double d) {
        m46822(obj, j, Double.doubleToLongBits(d));
    }

    @Override // l.AbstractC20820
    /* JADX INFO: renamed from: ۙ */
    public final byte mo19838(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC20820
    /* JADX INFO: renamed from: ۙ */
    public final void mo19840(long j, byte[] bArr, long j2, long j3) {
        throw new UnsupportedOperationException();
    }
}
