package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩻ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes.dex */
public final class C24754 extends AbstractC17294 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6108 f80136;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2378 f80137;

    /* JADX WARN: Illegal instructions before constructor call */
    public C24754(C6108 c6108, AbstractC22664 abstractC22664, Object obj) {
        this.f80136 = c6108;
        int iM23847 = C8935.m23847(abstractC22664);
        super(c6108, iM23847);
        switch (iM23847) {
            case 0:
            case 5:
            case 6:
            case 7:
                Integer num = (Integer) obj;
                num.getClass();
                this.f80137 = new C2378(3, num);
                return;
            case 1:
                Long l2 = (Long) obj;
                l2.getClass();
                this.f80137 = new C2378(5, l2);
                return;
            case 2:
                Float f = (Float) obj;
                f.getClass();
                this.f80137 = new C2378(4, f);
                return;
            case 3:
                Double d = (Double) obj;
                d.getClass();
                this.f80137 = new C2378(6, d);
                return;
            case 4:
                this.f80137 = C9089.m24226((String) obj);
                return;
            default:
                throw new UnsupportedOperationException(C13645.m33382(iM23847, "unsupported tag: "));
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m55259() {
        C2378 c2378 = this.f80137;
        C6108 c6108 = this.f80136;
        int i = this.f56323;
        if (i == 1 || i == 3) {
            C8935 c8935 = c6108.f20850;
            c8935.m23870(20, c8935.f29132.m37270((InterfaceC8344) c2378), (InterfaceC13564) c2378);
        } else {
            c6108.f20850.m23875(c2378);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Number m55258() {
        return (Number) this.f80137.f7649;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC17294 mo5785() {
        C6108 c6108 = this.f80136;
        int i = this.f56323;
        switch (i) {
            case 0:
            case 5:
            case 6:
            case 7:
                int iIntValue = m55258().intValue();
                if (-1 <= iIntValue && iIntValue <= 5) {
                    c6108.f20850.m23883(iIntValue + 3);
                } else if (-128 <= iIntValue && iIntValue <= 127) {
                    c6108.f20850.m23869(16, iIntValue, (InterfaceC8344) null);
                } else if (-32768 > iIntValue || iIntValue > 32767) {
                    m55259();
                } else {
                    c6108.f20850.m23870(17, iIntValue, (InterfaceC13564) null);
                }
                break;
            case 1:
                long jLongValue = m55258().longValue();
                if (jLongValue == 0 || jLongValue == 1) {
                    c6108.f20850.m23883(((int) jLongValue) + 9);
                } else {
                    m55259();
                }
                break;
            case 2:
                float fFloatValue = m55258().floatValue();
                if (fFloatValue == 0.0f && 1.0f / fFloatValue > 0.0f) {
                    c6108.f20850.m23883(((int) fFloatValue) + 11);
                } else {
                    double d = fFloatValue;
                    if (d == 1.0d || d == 2.0d) {
                        c6108.f20850.m23883(((int) fFloatValue) + 11);
                    } else {
                        m55259();
                    }
                }
                break;
            case 3:
                double dDoubleValue = m55258().doubleValue();
                if ((dDoubleValue == 0.0d && 1.0d / dDoubleValue > 0.0d) || dDoubleValue == 1.0d) {
                    c6108.f20850.m23883(((int) dDoubleValue) + 14);
                } else {
                    m55259();
                }
                break;
            case 4:
                m55259();
                break;
            default:
                C11972.m30019();
                throw null;
        }
        return c6108.f20855[i];
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ᩴ */
    public final C1633 mo5782() {
        return this.f80136.m17624(m55258().intValue() != 0 ? 167 : 168);
    }

    @Override // l.AbstractC17294
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17294 mo40623(int i) {
        int i2 = this.f56323;
        if (i2 != i) {
            C6108 c6108 = this.f80136;
            if (i != 0) {
                if (i == 1) {
                    return new C24754(c6108, c6108.f20856.f48256, Long.valueOf(m55258().longValue()));
                }
                if (i == 2) {
                    return new C24754(c6108, c6108.f20856.f48239, Float.valueOf(m55258().floatValue()));
                }
                if (i == 3) {
                    return new C24754(c6108, c6108.f20856.f48249, Double.valueOf(m55258().doubleValue()));
                }
                if (i == 5) {
                    return new C24754(c6108, c6108.f20856.f48293, Integer.valueOf((byte) m55258().intValue()));
                }
                if (i == 6) {
                    return new C24754(c6108, c6108.f20856.f48296, Integer.valueOf((char) m55258().intValue()));
                }
                if (i == 7) {
                    return new C24754(c6108, c6108.f20856.f48316, Integer.valueOf((short) m55258().intValue()));
                }
                return super.mo40623(i);
            }
            if (C8935.m23859(i2) != 0) {
                return new C24754(c6108, c6108.f20856.f48253, Integer.valueOf(m55258().intValue()));
            }
        }
        return this;
    }

    public final String toString() {
        return "immediate(" + this.f80137 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
