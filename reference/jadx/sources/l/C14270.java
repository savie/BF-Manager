package l;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ܰ֫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5DU */
/* JADX INFO: loaded from: classes4.dex */
public final class C14270 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f45086 = true;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public EnumC3830 f45087;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object f45088;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m34665() {
        this.f45088 = null;
        this.f45087 = null;
    }

    public final String toString() {
        return this.f45088.toString();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m34646() {
        return this.f45088 == null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m34664(C14270 c14270, C14270 c14271) {
        EnumC3830 enumC3830;
        EnumC3830 enumC3831;
        EnumC3830 enumC3832 = this.f45087;
        EnumC3830 enumC3833 = EnumC3830.STRING;
        if (enumC3832 == enumC3833 || (enumC3830 = c14270.f45087) == enumC3833 || enumC3832 == (enumC3831 = EnumC3830.OBJECT) || enumC3830 == enumC3831) {
            c14271.m34626(this.f45088.equals(c14270.f45088));
            return;
        }
        EnumC3830 enumC3834 = EnumC3830.BOOLEAN;
        if (enumC3832 == enumC3834 && enumC3830 == enumC3834) {
            c14271.m34626(m34633() == c14270.m34633());
        } else {
            c14271.m34626(m34602() == c14270.m34602());
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34636(C14270 c14270, C14270 c14271) {
        EnumC3830 enumC3830;
        EnumC3830 enumC3831;
        EnumC3830 enumC3832 = this.f45087;
        EnumC3830 enumC3833 = EnumC3830.STRING;
        if (enumC3832 == enumC3833 || (enumC3830 = c14270.f45087) == enumC3833 || enumC3832 == (enumC3831 = EnumC3830.OBJECT) || enumC3830 == enumC3831) {
            c14271.m34626(!this.f45088.equals(c14270.f45088));
            return;
        }
        EnumC3830 enumC3834 = EnumC3830.BOOLEAN;
        if (enumC3832 == enumC3834 && enumC3830 == enumC3834) {
            c14271.m34626(m34633() != c14270.m34633());
        } else {
            c14271.m34626(m34602() != c14270.m34602());
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m34643(C14270 c14270, C14270 c14271) {
        EnumC3830 enumC3830 = this.f45087;
        EnumC3830 enumC3831 = EnumC3830.STRING;
        if (enumC3830 == enumC3831 && c14270.f45087 == enumC3831) {
            c14271.m34626(((String) this.f45088).compareTo((String) c14270.f45088) > 0);
        } else {
            c14271.m34626(m34602() > c14270.m34602());
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m34629(C14270 c14270, C14270 c14271) {
        EnumC3830 enumC3830 = this.f45087;
        EnumC3830 enumC3831 = EnumC3830.STRING;
        if (enumC3830 == enumC3831 && c14270.f45087 == enumC3831) {
            c14271.m34626(((String) this.f45088).compareTo((String) c14270.f45088) < 0);
        } else {
            c14271.m34626(m34602() < c14270.m34602());
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m34655(C14270 c14270, C14270 c14271) {
        EnumC3830 enumC3830 = this.f45087;
        EnumC3830 enumC3831 = EnumC3830.STRING;
        if (enumC3830 == enumC3831 && c14270.f45087 == enumC3831) {
            c14271.m34626(((String) this.f45088).compareTo((String) c14270.f45088) >= 0);
        } else {
            c14271.m34626(m34602() >= c14270.m34602());
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m34640(C14270 c14270, C14270 c14271) {
        EnumC3830 enumC3830 = this.f45087;
        EnumC3830 enumC3831 = EnumC3830.STRING;
        if (enumC3830 == enumC3831 && c14270.f45087 == enumC3831) {
            c14271.m34626(((String) this.f45088).compareTo((String) c14270.f45088) <= 0);
        } else {
            c14271.m34626(m34602() <= c14270.m34602());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34624(C14270 c14270, C14270 c14271) {
        EnumC3830 enumC3830;
        EnumC3830 enumC3831 = this.f45087;
        EnumC3830 enumC3832 = EnumC3830.STRING;
        if (enumC3831 == enumC3832 || (enumC3830 = c14270.f45087) == enumC3832) {
            c14271.m34621(this.f45088.toString() + c14270.f45088.toString());
            return;
        }
        EnumC3830 enumC3833 = EnumC3830.DOUBLE;
        if (enumC3831 == enumC3833 || enumC3830 == enumC3833) {
            c14271.m34616(m34602() + c14270.m34602());
            return;
        }
        EnumC3830 enumC3834 = EnumC3830.FLOAT;
        if (enumC3831 == enumC3834 || enumC3830 == enumC3834) {
            c14271.m34617(m34605() + c14270.m34605());
            return;
        }
        EnumC3830 enumC3835 = EnumC3830.LONG;
        if (enumC3831 == enumC3835 || enumC3830 == enumC3835) {
            c14271.m34619(m34603() + c14270.m34603());
        } else {
            c14271.m34618(m34604() + c14270.m34604());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34622(C14270 c14270) {
        int iOrdinal = this.f45087.ordinal();
        if (iOrdinal == 9) {
            this.f45088 = this.f45088.toString() + c14270.f45088.toString();
            return;
        }
        switch (iOrdinal) {
            case 0:
                this.f45088 = Byte.valueOf((byte) (c14270.m34606().byteValue() + m34662()));
                break;
            case 1:
                this.f45088 = Character.valueOf((char) (c14270.m34606().intValue() + m34653()));
                break;
            case 2:
                this.f45088 = Short.valueOf((short) (c14270.m34606().shortValue() + m34669()));
                break;
            case 3:
                this.f45088 = Integer.valueOf(c14270.m34606().intValue() + m34627());
                break;
            case 4:
                this.f45088 = Long.valueOf(c14270.m34606().longValue() + m34607());
                break;
            case 5:
                this.f45088 = Float.valueOf(c14270.m34606().floatValue() + m34638());
                break;
            case 6:
                this.f45088 = Double.valueOf(c14270.m34606().doubleValue() + m34641());
                break;
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m34611(C14270 c14270, C14270 c14271) {
        EnumC3830 enumC3830;
        EnumC3830 enumC3831 = this.f45087;
        EnumC3830 enumC3832 = EnumC3830.DOUBLE;
        if (enumC3831 == enumC3832 || (enumC3830 = c14270.f45087) == enumC3832) {
            c14271.m34616(m34602() - c14270.m34602());
            return;
        }
        EnumC3830 enumC3833 = EnumC3830.FLOAT;
        if (enumC3831 == enumC3833 || enumC3830 == enumC3833) {
            c14271.m34617(m34605() - c14270.m34605());
            return;
        }
        EnumC3830 enumC3834 = EnumC3830.LONG;
        if (enumC3831 == enumC3834 || enumC3830 == enumC3834) {
            c14271.m34619(m34603() - c14270.m34603());
        } else {
            c14271.m34618(m34604() - c14270.m34604());
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m34668(C14270 c14270) {
        switch (this.f45087) {
            case BYTE:
                this.f45088 = Byte.valueOf((byte) (m34662() - c14270.m34606().byteValue()));
                break;
            case CHAR:
                this.f45088 = Character.valueOf((char) (m34653() - c14270.m34606().intValue()));
                break;
            case SHORT:
                this.f45088 = Short.valueOf((short) (m34669() - c14270.m34606().shortValue()));
                break;
            case INT:
                this.f45088 = Integer.valueOf(m34627() - c14270.m34606().intValue());
                break;
            case LONG:
                this.f45088 = Long.valueOf(m34607() - c14270.m34606().longValue());
                break;
            case FLOAT:
                this.f45088 = Float.valueOf(m34638() - c14270.m34606().floatValue());
                break;
            case DOUBLE:
                this.f45088 = Double.valueOf(m34641() - c14270.m34606().doubleValue());
                break;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m34632(C14270 c14270, C14270 c14271) {
        EnumC3830 enumC3830;
        EnumC3830 enumC3831 = this.f45087;
        EnumC3830 enumC3832 = EnumC3830.DOUBLE;
        if (enumC3831 == enumC3832 || (enumC3830 = c14270.f45087) == enumC3832) {
            c14271.m34616(m34602() / c14270.m34602());
            return;
        }
        EnumC3830 enumC3833 = EnumC3830.FLOAT;
        if (enumC3831 == enumC3833 || enumC3830 == enumC3833) {
            c14271.m34617(m34605() / c14270.m34605());
            return;
        }
        EnumC3830 enumC3834 = EnumC3830.LONG;
        if (enumC3831 == enumC3834 || enumC3830 == enumC3834) {
            c14271.m34619(m34603() / c14270.m34603());
        } else {
            c14271.m34618(m34604() / c14270.m34604());
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m34670(C14270 c14270) {
        switch (this.f45087) {
            case BYTE:
                this.f45088 = Byte.valueOf((byte) (m34662() / c14270.m34606().byteValue()));
                break;
            case CHAR:
                this.f45088 = Character.valueOf((char) (m34653() / c14270.m34606().intValue()));
                break;
            case SHORT:
                this.f45088 = Short.valueOf((short) (m34669() / c14270.m34606().shortValue()));
                break;
            case INT:
                this.f45088 = Integer.valueOf(m34627() / c14270.m34606().intValue());
                break;
            case LONG:
                this.f45088 = Long.valueOf(m34607() / c14270.m34606().longValue());
                break;
            case FLOAT:
                this.f45088 = Float.valueOf(m34638() / c14270.m34606().floatValue());
                break;
            case DOUBLE:
                this.f45088 = Double.valueOf(m34641() / c14270.m34606().doubleValue());
                break;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34609(C14270 c14270, C14270 c14271) {
        EnumC3830 enumC3830;
        EnumC3830 enumC3831 = this.f45087;
        EnumC3830 enumC3832 = EnumC3830.DOUBLE;
        if (enumC3831 == enumC3832 || (enumC3830 = c14270.f45087) == enumC3832) {
            c14271.m34616(m34602() * c14270.m34602());
            return;
        }
        EnumC3830 enumC3833 = EnumC3830.FLOAT;
        if (enumC3831 == enumC3833 || enumC3830 == enumC3833) {
            c14271.m34617(m34605() * c14270.m34605());
            return;
        }
        EnumC3830 enumC3834 = EnumC3830.LONG;
        if (enumC3831 == enumC3834 || enumC3830 == enumC3834) {
            c14271.m34619(m34603() * c14270.m34603());
        } else {
            c14271.m34618(m34604() * c14270.m34604());
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m34648(C14270 c14270) {
        switch (this.f45087) {
            case BYTE:
                this.f45088 = Byte.valueOf((byte) (c14270.m34606().byteValue() * m34662()));
                break;
            case CHAR:
                this.f45088 = Character.valueOf((char) (c14270.m34606().intValue() * m34653()));
                break;
            case SHORT:
                this.f45088 = Short.valueOf((short) (c14270.m34606().shortValue() * m34669()));
                break;
            case INT:
                this.f45088 = Integer.valueOf(c14270.m34606().intValue() * m34627());
                break;
            case LONG:
                this.f45088 = Long.valueOf(c14270.m34606().longValue() * m34607());
                break;
            case FLOAT:
                this.f45088 = Float.valueOf(c14270.m34606().floatValue() * m34638());
                break;
            case DOUBLE:
                this.f45088 = Double.valueOf(c14270.m34606().doubleValue() * m34641());
                break;
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m34649(C14270 c14270, C14270 c14271) {
        EnumC3830 enumC3830;
        EnumC3830 enumC3831 = this.f45087;
        EnumC3830 enumC3832 = EnumC3830.DOUBLE;
        if (enumC3831 == enumC3832 || (enumC3830 = c14270.f45087) == enumC3832) {
            c14271.m34616(m34602() % c14270.m34602());
            return;
        }
        EnumC3830 enumC3833 = EnumC3830.FLOAT;
        if (enumC3831 == enumC3833 || enumC3830 == enumC3833) {
            c14271.m34617(m34605() % c14270.m34605());
            return;
        }
        EnumC3830 enumC3834 = EnumC3830.LONG;
        if (enumC3831 == enumC3834 || enumC3830 == enumC3834) {
            c14271.m34619(m34603() % c14270.m34603());
        } else {
            c14271.m34618(m34604() % c14270.m34604());
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m34610(C14270 c14270) {
        switch (this.f45087) {
            case BYTE:
                this.f45088 = Byte.valueOf((byte) (m34662() % c14270.m34606().byteValue()));
                break;
            case CHAR:
                this.f45088 = Character.valueOf((char) (m34653() % c14270.m34606().intValue()));
                break;
            case SHORT:
                this.f45088 = Short.valueOf((short) (m34669() % c14270.m34606().shortValue()));
                break;
            case INT:
                this.f45088 = Integer.valueOf(m34627() % c14270.m34606().intValue());
                break;
            case LONG:
                this.f45088 = Long.valueOf(m34607() % c14270.m34606().longValue());
                break;
            case FLOAT:
                this.f45088 = Float.valueOf(m34638() % c14270.m34606().floatValue());
                break;
            case DOUBLE:
                this.f45088 = Double.valueOf(m34641() % c14270.m34606().doubleValue());
                break;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34661(C14270 c14270, C14270 c14271) {
        EnumC3830 enumC3830 = this.f45087;
        EnumC3830 enumC3831 = EnumC3830.LONG;
        if (enumC3830 == enumC3831 || c14270.f45087 == enumC3831) {
            c14271.m34619(m34603() & c14270.m34603());
        } else {
            c14271.m34618(c14270.m34604() & m34604());
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34659(C14270 c14270) {
        int iOrdinal = this.f45087.ordinal();
        if (iOrdinal == 0) {
            this.f45088 = Byte.valueOf((byte) (c14270.m34606().byteValue() & m34662()));
            return;
        }
        if (iOrdinal == 2) {
            this.f45088 = Short.valueOf((short) (c14270.m34606().shortValue() & m34669()));
        } else if (iOrdinal == 3) {
            this.f45088 = Integer.valueOf(c14270.m34606().intValue() & m34627());
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f45088 = Long.valueOf(m34607() & c14270.m34606().longValue());
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m34671(C14270 c14270, C14270 c14271) {
        EnumC3830 enumC3830 = this.f45087;
        EnumC3830 enumC3831 = EnumC3830.LONG;
        if (enumC3830 == enumC3831 || c14270.f45087 == enumC3831) {
            c14271.m34619(m34603() | c14270.m34603());
        } else {
            c14271.m34618(c14270.m34604() | m34604());
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m34666(C14270 c14270) {
        int iOrdinal = this.f45087.ordinal();
        if (iOrdinal == 0) {
            this.f45088 = Byte.valueOf((byte) (c14270.m34606().byteValue() | m34662()));
            return;
        }
        if (iOrdinal == 2) {
            this.f45088 = Short.valueOf((short) (c14270.m34606().shortValue() | m34669()));
        } else if (iOrdinal == 3) {
            this.f45088 = Integer.valueOf(c14270.m34606().intValue() | m34627());
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f45088 = Long.valueOf(m34607() | c14270.m34606().longValue());
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m34657(C14270 c14270, C14270 c14271) {
        EnumC3830 enumC3830 = this.f45087;
        EnumC3830 enumC3831 = EnumC3830.LONG;
        if (enumC3830 == enumC3831 || c14270.f45087 == enumC3831) {
            c14271.m34619(m34603() ^ c14270.m34603());
        } else {
            c14271.m34618(c14270.m34604() ^ m34604());
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m34612(C14270 c14270) {
        int iOrdinal = this.f45087.ordinal();
        if (iOrdinal == 0) {
            this.f45088 = Byte.valueOf((byte) (c14270.m34606().byteValue() ^ m34662()));
            return;
        }
        if (iOrdinal == 2) {
            this.f45088 = Short.valueOf((short) (c14270.m34606().shortValue() ^ m34669()));
        } else if (iOrdinal == 3) {
            this.f45088 = Integer.valueOf(c14270.m34606().intValue() ^ m34627());
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f45088 = Long.valueOf(m34607() ^ c14270.m34606().longValue());
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m34652(C14270 c14270, C14270 c14271) {
        EnumC3830 enumC3830 = this.f45087;
        EnumC3830 enumC3831 = EnumC3830.LONG;
        if (enumC3830 == enumC3831 || c14270.f45087 == enumC3831) {
            c14271.m34619(m34603() << ((int) c14270.m34603()));
        } else {
            c14271.m34618(m34604() << c14270.m34604());
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m34656(C14270 c14270) {
        int iOrdinal = this.f45087.ordinal();
        if (iOrdinal == 0) {
            this.f45088 = Byte.valueOf((byte) (m34662() << c14270.m34606().byteValue()));
            return;
        }
        if (iOrdinal == 2) {
            this.f45088 = Short.valueOf((short) (m34669() << c14270.m34606().byteValue()));
        } else if (iOrdinal == 3) {
            this.f45088 = Integer.valueOf(m34627() << c14270.m34606().byteValue());
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f45088 = Long.valueOf(m34607() << c14270.m34606().byteValue());
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m34645(C14270 c14270, C14270 c14271) {
        EnumC3830 enumC3830 = this.f45087;
        EnumC3830 enumC3831 = EnumC3830.LONG;
        if (enumC3830 == enumC3831 || c14270.f45087 == enumC3831) {
            c14271.m34619(m34603() >> ((int) c14270.m34603()));
        } else {
            c14271.m34618(m34604() >> c14270.m34604());
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m34637(C14270 c14270) {
        int iOrdinal = this.f45087.ordinal();
        if (iOrdinal == 0) {
            this.f45088 = Byte.valueOf((byte) (m34662() >> c14270.m34606().byteValue()));
            return;
        }
        if (iOrdinal == 2) {
            this.f45088 = Short.valueOf((short) (m34669() >> c14270.m34606().byteValue()));
        } else if (iOrdinal == 3) {
            this.f45088 = Integer.valueOf(m34627() >> c14270.m34606().byteValue());
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f45088 = Long.valueOf(m34607() >> c14270.m34606().byteValue());
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m34667(C14270 c14270, C14270 c14271) {
        EnumC3830 enumC3830 = this.f45087;
        EnumC3830 enumC3831 = EnumC3830.LONG;
        if (enumC3830 == enumC3831 || c14270.f45087 == enumC3831) {
            c14271.m34619(m34603() >>> ((int) c14270.m34603()));
        } else {
            c14271.m34618(m34604() >>> c14270.m34604());
        }
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m34630(C14270 c14270) {
        int iOrdinal = this.f45087.ordinal();
        if (iOrdinal == 0) {
            this.f45088 = Byte.valueOf((byte) (m34662() >>> c14270.m34606().byteValue()));
            return;
        }
        if (iOrdinal == 2) {
            this.f45088 = Short.valueOf((short) (m34669() >>> c14270.m34606().byteValue()));
        } else if (iOrdinal == 3) {
            this.f45088 = Integer.valueOf(m34627() >>> c14270.m34606().byteValue());
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f45088 = Long.valueOf(m34607() >>> c14270.m34606().byteValue());
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m34644(C14270 c14270) {
        if (this.f45087 == EnumC3830.LONG) {
            c14270.m34619(~m34603());
        } else {
            c14270.m34618(~m34604());
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m34651(C14270 c14270) {
        if (this.f45087 == EnumC3830.BOOLEAN) {
            c14270.m34626(!m34633());
            return;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34660(C14270 c14270, int i) {
        Object obj = this.f45088;
        if (obj instanceof int[]) {
            Array.setInt(obj, i, c14270.m34627());
            return;
        }
        if (obj instanceof byte[]) {
            Array.setByte(obj, i, c14270.m34662());
            return;
        }
        if (obj instanceof String[]) {
            Array.set(obj, i, c14270.m34647());
            return;
        }
        if (obj instanceof char[]) {
            Array.setChar(obj, i, c14270.m34653());
            return;
        }
        if (obj instanceof boolean[]) {
            Array.setBoolean(obj, i, c14270.m34633());
            return;
        }
        if (obj instanceof short[]) {
            Array.setShort(obj, i, c14270.m34669());
            return;
        }
        if (obj instanceof float[]) {
            Array.setFloat(obj, i, c14270.m34638());
        } else if (obj instanceof double[]) {
            Array.setDouble(obj, i, c14270.m34641());
        } else {
            Array.set(obj, i, c14270.f45088);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m34658() {
        return Array.getLength(this.f45088);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34623(C14270 c14270, int i) {
        Object obj = this.f45088;
        if (obj instanceof int[]) {
            c14270.m34618(Array.getInt(obj, i));
            return;
        }
        if (obj instanceof byte[]) {
            c14270.m34614(Array.getByte(obj, i));
            return;
        }
        if (obj instanceof String[]) {
            c14270.m34621((String) Array.get(obj, i));
            return;
        }
        if (obj instanceof long[]) {
            c14270.m34619(Array.getLong(obj, i));
            return;
        }
        if (obj instanceof char[]) {
            c14270.m34615(Array.getChar(obj, i));
            return;
        }
        if (obj instanceof boolean[]) {
            c14270.m34626(Array.getBoolean(obj, i));
            return;
        }
        if (obj instanceof short[]) {
            c14270.m34625(Array.getShort(obj, i));
            return;
        }
        if (obj instanceof float[]) {
            c14270.m34617(Array.getFloat(obj, i));
        } else if (obj instanceof double[]) {
            c14270.m34616(Array.getDouble(obj, i));
        } else {
            c14270.m34620(Array.get(obj, i));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34621(String str) {
        this.f45087 = EnumC3830.STRING;
        this.f45088 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34625(short s) {
        this.f45087 = EnumC3830.SHORT;
        this.f45088 = Short.valueOf(s);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34618(int i) {
        this.f45087 = EnumC3830.INT;
        this.f45088 = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34619(long j) {
        this.f45087 = EnumC3830.LONG;
        this.f45088 = Long.valueOf(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34626(boolean z) {
        this.f45087 = EnumC3830.BOOLEAN;
        this.f45088 = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34614(byte b) {
        this.f45087 = EnumC3830.BYTE;
        this.f45088 = Byte.valueOf(b);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34615(char c) {
        this.f45087 = EnumC3830.CHAR;
        this.f45088 = Character.valueOf(c);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34617(float f) {
        this.f45087 = EnumC3830.FLOAT;
        this.f45088 = Float.valueOf(f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34616(double d) {
        this.f45087 = EnumC3830.DOUBLE;
        this.f45088 = Double.valueOf(d);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34620(Object obj) {
        this.f45087 = EnumC3830.OBJECT;
        this.f45088 = obj;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m34647() {
        Object obj = this.f45088;
        return obj == null ? "" : (String) obj;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final short m34669() {
        Object obj = this.f45088;
        if (obj == null) {
            return (short) 0;
        }
        return ((Short) obj).shortValue();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m34627() {
        Object obj = this.f45088;
        if (obj == null) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m34607() {
        Object obj = this.f45088;
        if (obj == null) {
            return 0L;
        }
        return ((Long) obj).longValue();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float m34638() {
        Object obj = this.f45088;
        if (obj == null) {
            return 0.0f;
        }
        return ((Float) obj).floatValue();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final double m34641() {
        Object obj = this.f45088;
        if (obj == null) {
            return 0.0d;
        }
        return ((Double) obj).doubleValue();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m34633() {
        Object obj = this.f45088;
        return obj != null && ((Boolean) obj).booleanValue();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte m34662() {
        Object obj = this.f45088;
        if (obj == null) {
            return (byte) 0;
        }
        return ((Byte) obj).byteValue();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final char m34653() {
        Object obj = this.f45088;
        if (obj == null) {
            return (char) 0;
        }
        return ((Character) obj).charValue();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m34634() {
        return this.f45088;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m34650() {
        int iOrdinal = this.f45087.ordinal();
        if (iOrdinal == 0) {
            this.f45088 = Byte.valueOf((byte) (((Byte) this.f45088).byteValue() + 1));
            return;
        }
        if (iOrdinal == 1) {
            this.f45088 = Character.valueOf((char) (((Character) this.f45088).charValue() + 1));
            return;
        }
        if (iOrdinal == 2) {
            this.f45088 = Short.valueOf((short) (((Short) this.f45088).shortValue() + 1));
        } else if (iOrdinal == 3) {
            this.f45088 = Integer.valueOf(((Integer) this.f45088).intValue() + 1);
        } else {
            if (iOrdinal == 4) {
                this.f45088 = Long.valueOf(((Long) this.f45088).longValue() + 1);
                return;
            }
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34613() {
        int iOrdinal = this.f45087.ordinal();
        if (iOrdinal == 0) {
            this.f45088 = Byte.valueOf((byte) (((Byte) this.f45088).byteValue() - 1));
            return;
        }
        if (iOrdinal == 1) {
            this.f45088 = Character.valueOf((char) (((Character) this.f45088).charValue() - 1));
            return;
        }
        if (iOrdinal == 2) {
            this.f45088 = Short.valueOf((short) (((Short) this.f45088).shortValue() - 1));
        } else if (iOrdinal == 3) {
            this.f45088 = Integer.valueOf(((Integer) this.f45088).intValue() - 1);
        } else {
            if (iOrdinal == 4) {
                this.f45088 = Long.valueOf(((Long) this.f45088).longValue() - 1);
                return;
            }
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private Number m34606() {
        if (this.f45088 == null) {
            return Double.valueOf(0.0d);
        }
        switch (this.f45087) {
            case BYTE:
                Byte b = (Byte) this.f45088;
                b.byteValue();
                return b;
            case CHAR:
            case INT:
                Integer num = (Integer) this.f45088;
                num.intValue();
                return num;
            case SHORT:
                Short sh = (Short) this.f45088;
                sh.shortValue();
                return sh;
            case LONG:
                Long l2 = (Long) this.f45088;
                l2.longValue();
                return l2;
            case FLOAT:
                Float f = (Float) this.f45088;
                f.floatValue();
                return f;
            case DOUBLE:
                Double d = (Double) this.f45088;
                d.doubleValue();
                return d;
            default:
                throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private double m34602() {
        if (this.f45088 == null) {
            return 0.0d;
        }
        switch (this.f45087) {
            case BYTE:
                return ((Byte) this.f45088).byteValue();
            case CHAR:
                return ((Character) this.f45088).charValue();
            case SHORT:
                return ((Short) this.f45088).shortValue();
            case INT:
                return ((Integer) this.f45088).intValue();
            case LONG:
                return ((Long) this.f45088).longValue();
            case FLOAT:
                return ((Float) this.f45088).floatValue();
            case DOUBLE:
                return ((Double) this.f45088).doubleValue();
            default:
                throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private float m34605() {
        if (this.f45088 == null) {
            return 0.0f;
        }
        int iOrdinal = this.f45087.ordinal();
        if (iOrdinal == 0) {
            return ((Byte) this.f45088).byteValue();
        }
        if (iOrdinal == 1) {
            return ((Character) this.f45088).charValue();
        }
        if (iOrdinal == 2) {
            return ((Short) this.f45088).shortValue();
        }
        if (iOrdinal == 3) {
            return ((Integer) this.f45088).intValue();
        }
        if (iOrdinal == 4) {
            return ((Long) this.f45088).longValue();
        }
        if (iOrdinal == 5) {
            return ((Float) this.f45088).floatValue();
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    private long m34603() {
        if (this.f45088 == null) {
            return 0L;
        }
        int iOrdinal = this.f45087.ordinal();
        if (iOrdinal == 0) {
            return ((Byte) this.f45088).byteValue();
        }
        if (iOrdinal == 1) {
            return ((Character) this.f45088).charValue();
        }
        if (iOrdinal == 2) {
            return ((Short) this.f45088).shortValue();
        }
        if (iOrdinal == 3) {
            return ((Integer) this.f45088).intValue();
        }
        if (iOrdinal == 4) {
            return ((Long) this.f45088).longValue();
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m34604() {
        if (this.f45088 == null) {
            return 0;
        }
        int iOrdinal = this.f45087.ordinal();
        if (iOrdinal == 0) {
            return ((Byte) this.f45088).byteValue();
        }
        if (iOrdinal == 1) {
            return ((Character) this.f45088).charValue();
        }
        if (iOrdinal == 2) {
            return ((Short) this.f45088).shortValue();
        }
        if (iOrdinal == 3) {
            return ((Integer) this.f45088).intValue();
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34608(C14270 c14270) {
        if (this.f45087 == EnumC3830.VOID) {
            throw new RuntimeException();
        }
        c14270.m34620(this.f45088);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m34631(C14270 c14270) {
        c14270.m34614((byte) m34602());
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m34663(C14270 c14270) {
        c14270.m34615((char) m34602());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34635(C14270 c14270) {
        c14270.m34625((short) m34602());
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m34639(C14270 c14270) {
        c14270.m34618((int) m34602());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m34628(C14270 c14270) {
        c14270.m34619((long) m34602());
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m34642(C14270 c14270) {
        c14270.m34617((float) m34602());
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m34654(C14270 c14270) {
        c14270.m34616(m34602());
    }
}
