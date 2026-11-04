package l;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.۬ۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PE */
/* JADX INFO: loaded from: classes4.dex */
public final class C13684 extends AbstractC10897 {
    @Override // l.AbstractC10897
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo15128() {
        return false;
    }

    @Override // l.AbstractC10897
    /* JADX INFO: renamed from: ۙ */
    public final Object mo15119(Field field) {
        try {
            return field.get(null);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // l.AbstractC10897
    /* JADX INFO: renamed from: ᩷ */
    public final byte mo15127(long j, Object obj) {
        if (C22832.f74007) {
            return C22832.m51498(j, obj);
        }
        return C22832.m51525(j, obj);
    }

    @Override // l.AbstractC10897
    /* JADX INFO: renamed from: ۙ */
    public final void mo15121(Object obj, long j, byte b) {
        if (C22832.f74007) {
            C22832.m51517(obj, j, b);
        } else {
            C22832.m51531(obj, j, b);
        }
    }

    @Override // l.AbstractC10897
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo15125(long j, Object obj) {
        if (C22832.f74007) {
            return C22832.m51519(j, obj);
        }
        return C22832.m51533(j, obj);
    }

    @Override // l.AbstractC10897
    /* JADX INFO: renamed from: ۙ */
    public final void mo15124(Object obj, long j, boolean z) {
        if (C22832.f74007) {
            C22832.m51511(obj, j, z);
        } else {
            C22832.m51530(obj, j, z);
        }
    }

    @Override // l.AbstractC10897
    /* JADX INFO: renamed from: ᩸ */
    public final float mo15129(long j, Object obj) {
        return Float.intBitsToFloat(m27660(j, obj));
    }

    @Override // l.AbstractC10897
    /* JADX INFO: renamed from: ۙ */
    public final void mo15123(Object obj, long j, float f) {
        m27654(Float.floatToIntBits(f), j, obj);
    }

    @Override // l.AbstractC10897
    /* JADX INFO: renamed from: ۤ */
    public final double mo15126(long j, Object obj) {
        return Double.longBitsToDouble(m27659(j, obj));
    }

    @Override // l.AbstractC10897
    /* JADX INFO: renamed from: ۙ */
    public final void mo15122(Object obj, long j, double d) {
        m27656(obj, j, Double.doubleToLongBits(d));
    }

    @Override // l.AbstractC10897
    /* JADX INFO: renamed from: ۙ */
    public final byte mo15118(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC10897
    /* JADX INFO: renamed from: ۙ */
    public final void mo15120(long j, byte[] bArr, long j2, long j3) {
        throw new UnsupportedOperationException();
    }
}
