package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.֫ۘ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes2.dex */
public final class C1571 extends AbstractC2982 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C10122 f6320;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22116 f6321;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1571(C22116 c22116, AbstractC16579 abstractC16579, Object obj) {
        this.f6321 = c22116;
        int iM25336 = C10039.m25336(abstractC16579);
        super(c22116, iM25336);
        switch (iM25336) {
            case 0:
            case 5:
            case 6:
            case 7:
                Integer num = (Integer) obj;
                num.getClass();
                this.f6320 = new C10122(3, num);
                return;
            case 1:
                Long l2 = (Long) obj;
                l2.getClass();
                this.f6320 = new C10122(5, l2);
                return;
            case 2:
                Float f = (Float) obj;
                f.getClass();
                this.f6320 = new C10122(4, f);
                return;
            case 3:
                Double d = (Double) obj;
                d.getClass();
                this.f6320 = new C10122(6, d);
                return;
            case 4:
                this.f6320 = C8711.m22544((String) obj);
                return;
            default:
                throw new UnsupportedOperationException(C8479.m22141(iM25336, "unsupported tag: "));
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m5373() {
        C10122 c10122 = this.f6320;
        C22116 c22116 = this.f6321;
        int i = this.f11189;
        if (i == 1 || i == 3) {
            C10039 c10039 = c22116.f71608;
            c10039.m25365(20, c10039.f34293.m16112((InterfaceC7299) c10122), (InterfaceC15767) c10122);
        } else {
            c22116.f71608.m25371(c10122);
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private Number m5372() {
        return (Number) this.f6320.f34604;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC2982 mo5374() {
        C22116 c22116 = this.f6321;
        int i = this.f11189;
        switch (i) {
            case 0:
            case 5:
            case 6:
            case 7:
                int iIntValue = m5372().intValue();
                if (-1 <= iIntValue && iIntValue <= 5) {
                    c22116.f71608.m25378(iIntValue + 3);
                } else if (-128 <= iIntValue && iIntValue <= 127) {
                    c22116.f71608.m25364(16, iIntValue, (InterfaceC7299) null);
                } else if (-32768 > iIntValue || iIntValue > 32767) {
                    m5373();
                } else {
                    c22116.f71608.m25365(17, iIntValue, (InterfaceC15767) null);
                }
                break;
            case 1:
                long jLongValue = m5372().longValue();
                if (jLongValue == 0 || jLongValue == 1) {
                    c22116.f71608.m25378(((int) jLongValue) + 9);
                } else {
                    m5373();
                }
                break;
            case 2:
                float fFloatValue = m5372().floatValue();
                if (fFloatValue == 0.0f && 1.0f / fFloatValue > 0.0f) {
                    c22116.f71608.m25378(((int) fFloatValue) + 11);
                } else {
                    double d = fFloatValue;
                    if (d == 1.0d || d == 2.0d) {
                        c22116.f71608.m25378(((int) fFloatValue) + 11);
                    } else {
                        m5373();
                    }
                }
                break;
            case 3:
                double dDoubleValue = m5372().doubleValue();
                if ((dDoubleValue == 0.0d && 1.0d / dDoubleValue > 0.0d) || dDoubleValue == 1.0d) {
                    c22116.f71608.m25378(((int) dDoubleValue) + 14);
                } else {
                    m5373();
                }
                break;
            case 4:
                m5373();
                break;
            default:
                C6171.m17170();
                throw null;
        }
        return c22116.f71611[i];
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C23445 mo5376() {
        return this.f6321.m49073(m5372().intValue() != 0 ? 167 : 168);
    }

    @Override // l.AbstractC2982
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC2982 mo5375(int i) {
        int i2 = this.f11189;
        if (i2 != i) {
            C22116 c22116 = this.f6321;
            if (i != 0) {
                if (i == 1) {
                    return new C1571(c22116, c22116.f71607.f14264, Long.valueOf(m5372().longValue()));
                }
                if (i == 2) {
                    return new C1571(c22116, c22116.f71607.f14256, Float.valueOf(m5372().floatValue()));
                }
                if (i == 3) {
                    return new C1571(c22116, c22116.f71607.f14291, Double.valueOf(m5372().doubleValue()));
                }
                if (i == 5) {
                    return new C1571(c22116, c22116.f71607.f14271, Integer.valueOf((byte) m5372().intValue()));
                }
                if (i == 6) {
                    return new C1571(c22116, c22116.f71607.f14294, Integer.valueOf((char) m5372().intValue()));
                }
                if (i == 7) {
                    return new C1571(c22116, c22116.f71607.f14225, Integer.valueOf((short) m5372().intValue()));
                }
                return super.mo5375(i);
            }
            if (C10039.m25348(i2) != 0) {
                return new C1571(c22116, c22116.f71607.f14232, Integer.valueOf(m5372().intValue()));
            }
        }
        return this;
    }

    public final String toString() {
        return "immediate(" + this.f6320 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
