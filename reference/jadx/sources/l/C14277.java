package l;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ܳۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5DU */
/* JADX INFO: loaded from: classes3.dex */
public final class C14277 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f46795 = true;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public EnumC23449 f46796;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object f46797;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m34499() {
        this.f46797 = null;
        this.f46796 = null;
    }

    public final String toString() {
        return this.f46797.toString();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m34498() {
        return this.f46797 == null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m34454(C14277 c14277, C14277 c14278) {
        EnumC23449 enumC23449;
        EnumC23449 enumC234410;
        EnumC23449 enumC234411 = this.f46796;
        EnumC23449 enumC234412 = EnumC23449.STRING;
        if (enumC234411 == enumC234412 || (enumC23449 = c14277.f46796) == enumC234412 || enumC234411 == (enumC234410 = EnumC23449.OBJECT) || enumC23449 == enumC234410) {
            c14278.m34471(this.f46797.equals(c14277.f46797));
            return;
        }
        EnumC23449 enumC234413 = EnumC23449.BOOLEAN;
        if (enumC234411 == enumC234413 && enumC23449 == enumC234413) {
            c14278.m34471(m34485() == c14277.m34485());
        } else {
            c14278.m34471(m34445() == c14277.m34445());
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m34477(C14277 c14277, C14277 c14278) {
        EnumC23449 enumC23449;
        EnumC23449 enumC234410;
        EnumC23449 enumC234411 = this.f46796;
        EnumC23449 enumC234412 = EnumC23449.STRING;
        if (enumC234411 == enumC234412 || (enumC23449 = c14277.f46796) == enumC234412 || enumC234411 == (enumC234410 = EnumC23449.OBJECT) || enumC23449 == enumC234410) {
            c14278.m34471(!this.f46797.equals(c14277.f46797));
            return;
        }
        EnumC23449 enumC234413 = EnumC23449.BOOLEAN;
        if (enumC234411 == enumC234413 && enumC23449 == enumC234413) {
            c14278.m34471(m34485() != c14277.m34485());
        } else {
            c14278.m34471(m34445() != c14277.m34445());
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m34510(C14277 c14277, C14277 c14278) {
        EnumC23449 enumC23449 = this.f46796;
        EnumC23449 enumC234410 = EnumC23449.STRING;
        if (enumC23449 == enumC234410 && c14277.f46796 == enumC234410) {
            c14278.m34471(((String) this.f46797).compareTo((String) c14277.f46797) > 0);
        } else {
            c14278.m34471(m34445() > c14277.m34445());
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m34488(C14277 c14277, C14277 c14278) {
        EnumC23449 enumC23449 = this.f46796;
        EnumC23449 enumC234410 = EnumC23449.STRING;
        if (enumC23449 == enumC234410 && c14277.f46796 == enumC234410) {
            c14278.m34471(((String) this.f46797).compareTo((String) c14277.f46797) < 0);
        } else {
            c14278.m34471(m34445() < c14277.m34445());
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m34474(C14277 c14277, C14277 c14278) {
        EnumC23449 enumC23449 = this.f46796;
        EnumC23449 enumC234410 = EnumC23449.STRING;
        if (enumC23449 == enumC234410 && c14277.f46796 == enumC234410) {
            c14278.m34471(((String) this.f46797).compareTo((String) c14277.f46797) >= 0);
        } else {
            c14278.m34471(m34445() >= c14277.m34445());
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m34451(C14277 c14277, C14277 c14278) {
        EnumC23449 enumC23449 = this.f46796;
        EnumC23449 enumC234410 = EnumC23449.STRING;
        if (enumC23449 == enumC234410 && c14277.f46796 == enumC234410) {
            c14278.m34471(((String) this.f46797).compareTo((String) c14277.f46797) <= 0);
        } else {
            c14278.m34471(m34445() <= c14277.m34445());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34469(C14277 c14277, C14277 c14278) {
        EnumC23449 enumC23449;
        EnumC23449 enumC234410 = this.f46796;
        EnumC23449 enumC234411 = EnumC23449.STRING;
        if (enumC234410 == enumC234411 || (enumC23449 = c14277.f46796) == enumC234411) {
            c14278.m34466(this.f46797.toString() + c14277.f46797.toString());
            return;
        }
        EnumC23449 enumC234412 = EnumC23449.DOUBLE;
        if (enumC234410 == enumC234412 || enumC23449 == enumC234412) {
            c14278.m34461(m34445() + c14277.m34445());
            return;
        }
        EnumC23449 enumC234413 = EnumC23449.FLOAT;
        if (enumC234410 == enumC234413 || enumC23449 == enumC234413) {
            c14278.m34462(m34448() + c14277.m34448());
            return;
        }
        EnumC23449 enumC234414 = EnumC23449.LONG;
        if (enumC234410 == enumC234414 || enumC23449 == enumC234414) {
            c14278.m34464(m34447() + c14277.m34447());
        } else {
            c14278.m34463(m34446() + c14277.m34446());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34467(C14277 c14277) {
        int iOrdinal = this.f46796.ordinal();
        if (iOrdinal == 9) {
            this.f46797 = this.f46797.toString() + c14277.f46797.toString();
            return;
        }
        switch (iOrdinal) {
            case 0:
                this.f46797 = Byte.valueOf((byte) (c14277.m34444().byteValue() + m34452()));
                break;
            case 1:
                this.f46797 = Character.valueOf((char) (c14277.m34444().intValue() + m34472()));
                break;
            case 2:
                this.f46797 = Short.valueOf((short) (c14277.m34444().shortValue() + m34511()));
                break;
            case 3:
                this.f46797 = Integer.valueOf(c14277.m34444().intValue() + m34486());
                break;
            case 4:
                this.f46797 = Long.valueOf(c14277.m34444().longValue() + m34455());
                break;
            case 5:
                this.f46797 = Float.valueOf(c14277.m34444().floatValue() + m34449());
                break;
            case 6:
                this.f46797 = Double.valueOf(c14277.m34444().doubleValue() + m34508());
                break;
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m34480(C14277 c14277, C14277 c14278) {
        EnumC23449 enumC23449;
        EnumC23449 enumC234410 = this.f46796;
        EnumC23449 enumC234411 = EnumC23449.DOUBLE;
        if (enumC234410 == enumC234411 || (enumC23449 = c14277.f46796) == enumC234411) {
            c14278.m34461(m34445() - c14277.m34445());
            return;
        }
        EnumC23449 enumC234412 = EnumC23449.FLOAT;
        if (enumC234410 == enumC234412 || enumC23449 == enumC234412) {
            c14278.m34462(m34448() - c14277.m34448());
            return;
        }
        EnumC23449 enumC234413 = EnumC23449.LONG;
        if (enumC234410 == enumC234413 || enumC23449 == enumC234413) {
            c14278.m34464(m34447() - c14277.m34447());
        } else {
            c14278.m34463(m34446() - c14277.m34446());
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m34478(C14277 c14277) {
        switch (this.f46796) {
            case BYTE:
                this.f46797 = Byte.valueOf((byte) (m34452() - c14277.m34444().byteValue()));
                break;
            case CHAR:
                this.f46797 = Character.valueOf((char) (m34472() - c14277.m34444().intValue()));
                break;
            case SHORT:
                this.f46797 = Short.valueOf((short) (m34511() - c14277.m34444().shortValue()));
                break;
            case INT:
                this.f46797 = Integer.valueOf(m34486() - c14277.m34444().intValue());
                break;
            case LONG:
                this.f46797 = Long.valueOf(m34455() - c14277.m34444().longValue());
                break;
            case FLOAT:
                this.f46797 = Float.valueOf(m34449() - c14277.m34444().floatValue());
                break;
            case DOUBLE:
                this.f46797 = Double.valueOf(m34508() - c14277.m34444().doubleValue());
                break;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m34484(C14277 c14277, C14277 c14278) {
        EnumC23449 enumC23449;
        EnumC23449 enumC234410 = this.f46796;
        EnumC23449 enumC234411 = EnumC23449.DOUBLE;
        if (enumC234410 == enumC234411 || (enumC23449 = c14277.f46796) == enumC234411) {
            c14278.m34461(m34445() / c14277.m34445());
            return;
        }
        EnumC23449 enumC234412 = EnumC23449.FLOAT;
        if (enumC234410 == enumC234412 || enumC23449 == enumC234412) {
            c14278.m34462(m34448() / c14277.m34448());
            return;
        }
        EnumC23449 enumC234413 = EnumC23449.LONG;
        if (enumC234410 == enumC234413 || enumC23449 == enumC234413) {
            c14278.m34464(m34447() / c14277.m34447());
        } else {
            c14278.m34463(m34446() / c14277.m34446());
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m34512(C14277 c14277) {
        switch (this.f46796) {
            case BYTE:
                this.f46797 = Byte.valueOf((byte) (m34452() / c14277.m34444().byteValue()));
                break;
            case CHAR:
                this.f46797 = Character.valueOf((char) (m34472() / c14277.m34444().intValue()));
                break;
            case SHORT:
                this.f46797 = Short.valueOf((short) (m34511() / c14277.m34444().shortValue()));
                break;
            case INT:
                this.f46797 = Integer.valueOf(m34486() / c14277.m34444().intValue());
                break;
            case LONG:
                this.f46797 = Long.valueOf(m34455() / c14277.m34444().longValue());
                break;
            case FLOAT:
                this.f46797 = Float.valueOf(m34449() / c14277.m34444().floatValue());
                break;
            case DOUBLE:
                this.f46797 = Double.valueOf(m34508() / c14277.m34444().doubleValue());
                break;
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m34457(C14277 c14277, C14277 c14278) {
        EnumC23449 enumC23449;
        EnumC23449 enumC234410 = this.f46796;
        EnumC23449 enumC234411 = EnumC23449.DOUBLE;
        if (enumC234410 == enumC234411 || (enumC23449 = c14277.f46796) == enumC234411) {
            c14278.m34461(m34445() * c14277.m34445());
            return;
        }
        EnumC23449 enumC234412 = EnumC23449.FLOAT;
        if (enumC234410 == enumC234412 || enumC23449 == enumC234412) {
            c14278.m34462(m34448() * c14277.m34448());
            return;
        }
        EnumC23449 enumC234413 = EnumC23449.LONG;
        if (enumC234410 == enumC234413 || enumC23449 == enumC234413) {
            c14278.m34464(m34447() * c14277.m34447());
        } else {
            c14278.m34463(m34446() * c14277.m34446());
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m34494(C14277 c14277) {
        switch (this.f46796) {
            case BYTE:
                this.f46797 = Byte.valueOf((byte) (c14277.m34444().byteValue() * m34452()));
                break;
            case CHAR:
                this.f46797 = Character.valueOf((char) (c14277.m34444().intValue() * m34472()));
                break;
            case SHORT:
                this.f46797 = Short.valueOf((short) (c14277.m34444().shortValue() * m34511()));
                break;
            case INT:
                this.f46797 = Integer.valueOf(c14277.m34444().intValue() * m34486());
                break;
            case LONG:
                this.f46797 = Long.valueOf(c14277.m34444().longValue() * m34455());
                break;
            case FLOAT:
                this.f46797 = Float.valueOf(c14277.m34444().floatValue() * m34449());
                break;
            case DOUBLE:
                this.f46797 = Double.valueOf(c14277.m34444().doubleValue() * m34508());
                break;
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m34495(C14277 c14277, C14277 c14278) {
        EnumC23449 enumC23449;
        EnumC23449 enumC234410 = this.f46796;
        EnumC23449 enumC234411 = EnumC23449.DOUBLE;
        if (enumC234410 == enumC234411 || (enumC23449 = c14277.f46796) == enumC234411) {
            c14278.m34461(m34445() % c14277.m34445());
            return;
        }
        EnumC23449 enumC234412 = EnumC23449.FLOAT;
        if (enumC234410 == enumC234412 || enumC23449 == enumC234412) {
            c14278.m34462(m34448() % c14277.m34448());
            return;
        }
        EnumC23449 enumC234413 = EnumC23449.LONG;
        if (enumC234410 == enumC234413 || enumC23449 == enumC234413) {
            c14278.m34464(m34447() % c14277.m34447());
        } else {
            c14278.m34463(m34446() % c14277.m34446());
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m34479(C14277 c14277) {
        switch (this.f46796) {
            case BYTE:
                this.f46797 = Byte.valueOf((byte) (m34452() % c14277.m34444().byteValue()));
                break;
            case CHAR:
                this.f46797 = Character.valueOf((char) (m34472() % c14277.m34444().intValue()));
                break;
            case SHORT:
                this.f46797 = Short.valueOf((short) (m34511() % c14277.m34444().shortValue()));
                break;
            case INT:
                this.f46797 = Integer.valueOf(m34486() % c14277.m34444().intValue());
                break;
            case LONG:
                this.f46797 = Long.valueOf(m34455() % c14277.m34444().longValue());
                break;
            case FLOAT:
                this.f46797 = Float.valueOf(m34449() % c14277.m34444().floatValue());
                break;
            case DOUBLE:
                this.f46797 = Double.valueOf(m34508() % c14277.m34444().doubleValue());
                break;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34492(C14277 c14277, C14277 c14278) {
        EnumC23449 enumC23449 = this.f46796;
        EnumC23449 enumC234410 = EnumC23449.LONG;
        if (enumC23449 == enumC234410 || c14277.f46796 == enumC234410) {
            c14278.m34464(m34447() & c14277.m34447());
        } else {
            c14278.m34463(c14277.m34446() & m34446());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34490(C14277 c14277) {
        int iOrdinal = this.f46796.ordinal();
        if (iOrdinal == 0) {
            this.f46797 = Byte.valueOf((byte) (c14277.m34444().byteValue() & m34452()));
            return;
        }
        if (iOrdinal == 2) {
            this.f46797 = Short.valueOf((short) (c14277.m34444().shortValue() & m34511()));
        } else if (iOrdinal == 3) {
            this.f46797 = Integer.valueOf(c14277.m34444().intValue() & m34486());
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f46797 = Long.valueOf(m34455() & c14277.m34444().longValue());
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m34513(C14277 c14277, C14277 c14278) {
        EnumC23449 enumC23449 = this.f46796;
        EnumC23449 enumC234410 = EnumC23449.LONG;
        if (enumC23449 == enumC234410 || c14277.f46796 == enumC234410) {
            c14278.m34464(m34447() | c14277.m34447());
        } else {
            c14278.m34463(c14277.m34446() | m34446());
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m34500(C14277 c14277) {
        int iOrdinal = this.f46796.ordinal();
        if (iOrdinal == 0) {
            this.f46797 = Byte.valueOf((byte) (c14277.m34444().byteValue() | m34452()));
            return;
        }
        if (iOrdinal == 2) {
            this.f46797 = Short.valueOf((short) (c14277.m34444().shortValue() | m34511()));
        } else if (iOrdinal == 3) {
            this.f46797 = Integer.valueOf(c14277.m34444().intValue() | m34486());
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f46797 = Long.valueOf(m34455() | c14277.m34444().longValue());
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m34503(C14277 c14277, C14277 c14278) {
        EnumC23449 enumC23449 = this.f46796;
        EnumC23449 enumC234410 = EnumC23449.LONG;
        if (enumC23449 == enumC234410 || c14277.f46796 == enumC234410) {
            c14278.m34464(m34447() ^ c14277.m34447());
        } else {
            c14278.m34463(c14277.m34446() ^ m34446());
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34504(C14277 c14277) {
        int iOrdinal = this.f46796.ordinal();
        if (iOrdinal == 0) {
            this.f46797 = Byte.valueOf((byte) (c14277.m34444().byteValue() ^ m34452()));
            return;
        }
        if (iOrdinal == 2) {
            this.f46797 = Short.valueOf((short) (c14277.m34444().shortValue() ^ m34511()));
        } else if (iOrdinal == 3) {
            this.f46797 = Integer.valueOf(c14277.m34444().intValue() ^ m34486());
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f46797 = Long.valueOf(m34455() ^ c14277.m34444().longValue());
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m34507(C14277 c14277, C14277 c14278) {
        EnumC23449 enumC23449 = this.f46796;
        EnumC23449 enumC234410 = EnumC23449.LONG;
        if (enumC23449 == enumC234410 || c14277.f46796 == enumC234410) {
            c14278.m34464(m34447() << ((int) c14277.m34447()));
        } else {
            c14278.m34463(m34446() << c14277.m34446());
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m34502(C14277 c14277) {
        int iOrdinal = this.f46796.ordinal();
        if (iOrdinal == 0) {
            this.f46797 = Byte.valueOf((byte) (m34452() << c14277.m34444().byteValue()));
            return;
        }
        if (iOrdinal == 2) {
            this.f46797 = Short.valueOf((short) (m34511() << c14277.m34444().byteValue()));
        } else if (iOrdinal == 3) {
            this.f46797 = Integer.valueOf(m34486() << c14277.m34444().byteValue());
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f46797 = Long.valueOf(m34455() << c14277.m34444().byteValue());
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m34497(C14277 c14277, C14277 c14278) {
        EnumC23449 enumC23449 = this.f46796;
        EnumC23449 enumC234410 = EnumC23449.LONG;
        if (enumC23449 == enumC234410 || c14277.f46796 == enumC234410) {
            c14278.m34464(m34447() >> ((int) c14277.m34447()));
        } else {
            c14278.m34463(m34446() >> c14277.m34446());
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m34481(C14277 c14277) {
        int iOrdinal = this.f46796.ordinal();
        if (iOrdinal == 0) {
            this.f46797 = Byte.valueOf((byte) (m34452() >> c14277.m34444().byteValue()));
            return;
        }
        if (iOrdinal == 2) {
            this.f46797 = Short.valueOf((short) (m34511() >> c14277.m34444().byteValue()));
        } else if (iOrdinal == 3) {
            this.f46797 = Integer.valueOf(m34486() >> c14277.m34444().byteValue());
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f46797 = Long.valueOf(m34455() >> c14277.m34444().byteValue());
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m34501(C14277 c14277, C14277 c14278) {
        EnumC23449 enumC23449 = this.f46796;
        EnumC23449 enumC234410 = EnumC23449.LONG;
        if (enumC23449 == enumC234410 || c14277.f46796 == enumC234410) {
            c14278.m34464(m34447() >>> ((int) c14277.m34447()));
        } else {
            c14278.m34463(m34446() >>> c14277.m34446());
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m34482(C14277 c14277) {
        int iOrdinal = this.f46796.ordinal();
        if (iOrdinal == 0) {
            this.f46797 = Byte.valueOf((byte) (m34452() >>> c14277.m34444().byteValue()));
            return;
        }
        if (iOrdinal == 2) {
            this.f46797 = Short.valueOf((short) (m34511() >>> c14277.m34444().byteValue()));
        } else if (iOrdinal == 3) {
            this.f46797 = Integer.valueOf(m34486() >>> c14277.m34444().byteValue());
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.f46797 = Long.valueOf(m34455() >>> c14277.m34444().byteValue());
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m34496(C14277 c14277) {
        if (this.f46796 == EnumC23449.LONG) {
            c14277.m34464(~m34447());
        } else {
            c14277.m34463(~m34446());
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m34506(C14277 c14277) {
        if (this.f46796 == EnumC23449.BOOLEAN) {
            c14277.m34471(!m34485());
            return;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34491(C14277 c14277, int i) {
        Object obj = this.f46797;
        if (obj instanceof int[]) {
            Array.setInt(obj, i, c14277.m34486());
            return;
        }
        if (obj instanceof byte[]) {
            Array.setByte(obj, i, c14277.m34452());
            return;
        }
        if (obj instanceof String[]) {
            Array.set(obj, i, c14277.m34493());
            return;
        }
        if (obj instanceof char[]) {
            Array.setChar(obj, i, c14277.m34472());
            return;
        }
        if (obj instanceof boolean[]) {
            Array.setBoolean(obj, i, c14277.m34485());
            return;
        }
        if (obj instanceof short[]) {
            Array.setShort(obj, i, c14277.m34511());
            return;
        }
        if (obj instanceof float[]) {
            Array.setFloat(obj, i, c14277.m34449());
        } else if (obj instanceof double[]) {
            Array.setDouble(obj, i, c14277.m34508());
        } else {
            Array.set(obj, i, c14277.f46797);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m34489() {
        return Array.getLength(this.f46797);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34468(C14277 c14277, int i) {
        Object obj = this.f46797;
        if (obj instanceof int[]) {
            c14277.m34463(Array.getInt(obj, i));
            return;
        }
        if (obj instanceof byte[]) {
            c14277.m34459(Array.getByte(obj, i));
            return;
        }
        if (obj instanceof String[]) {
            c14277.m34466((String) Array.get(obj, i));
            return;
        }
        if (obj instanceof long[]) {
            c14277.m34464(Array.getLong(obj, i));
            return;
        }
        if (obj instanceof char[]) {
            c14277.m34460(Array.getChar(obj, i));
            return;
        }
        if (obj instanceof boolean[]) {
            c14277.m34471(Array.getBoolean(obj, i));
            return;
        }
        if (obj instanceof short[]) {
            c14277.m34470(Array.getShort(obj, i));
            return;
        }
        if (obj instanceof float[]) {
            c14277.m34462(Array.getFloat(obj, i));
        } else if (obj instanceof double[]) {
            c14277.m34461(Array.getDouble(obj, i));
        } else {
            c14277.m34465(Array.get(obj, i));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34466(String str) {
        this.f46796 = EnumC23449.STRING;
        this.f46797 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34470(short s) {
        this.f46796 = EnumC23449.SHORT;
        this.f46797 = Short.valueOf(s);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34463(int i) {
        this.f46796 = EnumC23449.INT;
        this.f46797 = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34464(long j) {
        this.f46796 = EnumC23449.LONG;
        this.f46797 = Long.valueOf(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34471(boolean z) {
        this.f46796 = EnumC23449.BOOLEAN;
        this.f46797 = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34459(byte b) {
        this.f46796 = EnumC23449.BYTE;
        this.f46797 = Byte.valueOf(b);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34460(char c) {
        this.f46796 = EnumC23449.CHAR;
        this.f46797 = Character.valueOf(c);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34462(float f) {
        this.f46796 = EnumC23449.FLOAT;
        this.f46797 = Float.valueOf(f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34461(double d) {
        this.f46796 = EnumC23449.DOUBLE;
        this.f46797 = Double.valueOf(d);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34465(Object obj) {
        this.f46796 = EnumC23449.OBJECT;
        this.f46797 = obj;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m34493() {
        Object obj = this.f46797;
        return obj == null ? "" : (String) obj;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final short m34511() {
        Object obj = this.f46797;
        if (obj == null) {
            return (short) 0;
        }
        return ((Short) obj).shortValue();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m34486() {
        Object obj = this.f46797;
        if (obj == null) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long m34455() {
        Object obj = this.f46797;
        if (obj == null) {
            return 0L;
        }
        return ((Long) obj).longValue();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final float m34449() {
        Object obj = this.f46797;
        if (obj == null) {
            return 0.0f;
        }
        return ((Float) obj).floatValue();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final double m34508() {
        Object obj = this.f46797;
        if (obj == null) {
            return 0.0d;
        }
        return ((Double) obj).doubleValue();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m34485() {
        Object obj = this.f46797;
        return obj != null && ((Boolean) obj).booleanValue();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte m34452() {
        Object obj = this.f46797;
        if (obj == null) {
            return (byte) 0;
        }
        return ((Byte) obj).byteValue();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final char m34472() {
        Object obj = this.f46797;
        if (obj == null) {
            return (char) 0;
        }
        return ((Character) obj).charValue();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Object m34475() {
        return this.f46797;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m34505() {
        int iOrdinal = this.f46796.ordinal();
        if (iOrdinal == 0) {
            this.f46797 = Byte.valueOf((byte) (((Byte) this.f46797).byteValue() + 1));
            return;
        }
        if (iOrdinal == 1) {
            this.f46797 = Character.valueOf((char) (((Character) this.f46797).charValue() + 1));
            return;
        }
        if (iOrdinal == 2) {
            this.f46797 = Short.valueOf((short) (((Short) this.f46797).shortValue() + 1));
        } else if (iOrdinal == 3) {
            this.f46797 = Integer.valueOf(((Integer) this.f46797).intValue() + 1);
        } else {
            if (iOrdinal == 4) {
                this.f46797 = Long.valueOf(((Long) this.f46797).longValue() + 1);
                return;
            }
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34458() {
        int iOrdinal = this.f46796.ordinal();
        if (iOrdinal == 0) {
            this.f46797 = Byte.valueOf((byte) (((Byte) this.f46797).byteValue() - 1));
            return;
        }
        if (iOrdinal == 1) {
            this.f46797 = Character.valueOf((char) (((Character) this.f46797).charValue() - 1));
            return;
        }
        if (iOrdinal == 2) {
            this.f46797 = Short.valueOf((short) (((Short) this.f46797).shortValue() - 1));
        } else if (iOrdinal == 3) {
            this.f46797 = Integer.valueOf(((Integer) this.f46797).intValue() - 1);
        } else {
            if (iOrdinal == 4) {
                this.f46797 = Long.valueOf(((Long) this.f46797).longValue() - 1);
                return;
            }
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private Number m34444() {
        if (this.f46797 == null) {
            return Double.valueOf(0.0d);
        }
        switch (this.f46796) {
            case BYTE:
                Byte b = (Byte) this.f46797;
                b.byteValue();
                return b;
            case CHAR:
            case INT:
                Integer num = (Integer) this.f46797;
                num.intValue();
                return num;
            case SHORT:
                Short sh = (Short) this.f46797;
                sh.shortValue();
                return sh;
            case LONG:
                Long l2 = (Long) this.f46797;
                l2.longValue();
                return l2;
            case FLOAT:
                Float f = (Float) this.f46797;
                f.floatValue();
                return f;
            case DOUBLE:
                Double d = (Double) this.f46797;
                d.doubleValue();
                return d;
            default:
                throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private double m34445() {
        if (this.f46797 == null) {
            return 0.0d;
        }
        switch (this.f46796) {
            case BYTE:
                return ((Byte) this.f46797).byteValue();
            case CHAR:
                return ((Character) this.f46797).charValue();
            case SHORT:
                return ((Short) this.f46797).shortValue();
            case INT:
                return ((Integer) this.f46797).intValue();
            case LONG:
                return ((Long) this.f46797).longValue();
            case FLOAT:
                return ((Float) this.f46797).floatValue();
            case DOUBLE:
                return ((Double) this.f46797).doubleValue();
            default:
                throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private float m34448() {
        if (this.f46797 == null) {
            return 0.0f;
        }
        int iOrdinal = this.f46796.ordinal();
        if (iOrdinal == 0) {
            return ((Byte) this.f46797).byteValue();
        }
        if (iOrdinal == 1) {
            return ((Character) this.f46797).charValue();
        }
        if (iOrdinal == 2) {
            return ((Short) this.f46797).shortValue();
        }
        if (iOrdinal == 3) {
            return ((Integer) this.f46797).intValue();
        }
        if (iOrdinal == 4) {
            return ((Long) this.f46797).longValue();
        }
        if (iOrdinal == 5) {
            return ((Float) this.f46797).floatValue();
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private long m34447() {
        if (this.f46797 == null) {
            return 0L;
        }
        int iOrdinal = this.f46796.ordinal();
        if (iOrdinal == 0) {
            return ((Byte) this.f46797).byteValue();
        }
        if (iOrdinal == 1) {
            return ((Character) this.f46797).charValue();
        }
        if (iOrdinal == 2) {
            return ((Short) this.f46797).shortValue();
        }
        if (iOrdinal == 3) {
            return ((Integer) this.f46797).intValue();
        }
        if (iOrdinal == 4) {
            return ((Long) this.f46797).longValue();
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private int m34446() {
        if (this.f46797 == null) {
            return 0;
        }
        int iOrdinal = this.f46796.ordinal();
        if (iOrdinal == 0) {
            return ((Byte) this.f46797).byteValue();
        }
        if (iOrdinal == 1) {
            return ((Character) this.f46797).charValue();
        }
        if (iOrdinal == 2) {
            return ((Short) this.f46797).shortValue();
        }
        if (iOrdinal == 3) {
            return ((Integer) this.f46797).intValue();
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m34456(C14277 c14277) {
        if (this.f46796 == EnumC23449.VOID) {
            throw new RuntimeException();
        }
        c14277.m34465(this.f46797);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m34483(C14277 c14277) {
        c14277.m34459((byte) m34445());
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m34453(C14277 c14277) {
        c14277.m34460((char) m34445());
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m34476(C14277 c14277) {
        c14277.m34470((short) m34445());
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m34450(C14277 c14277) {
        c14277.m34463((int) m34445());
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m34487(C14277 c14277) {
        c14277.m34464((long) m34445());
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m34509(C14277 c14277) {
        c14277.m34462((float) m34445());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m34473(C14277 c14277) {
        c14277.m34461(m34445());
    }
}
