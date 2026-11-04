package l;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܰᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T7ET */
/* JADX INFO: loaded from: classes5.dex */
public final class C14808 extends AbstractC0449 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C24866 f48430;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21522 f48431;

    public C14808(C21522 c21522) {
        this.f48431 = c21522;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x02b9 A[Catch: ᩻ۜۛ -> 0x02cf, TryCatch #5 {᩻ۜۛ -> 0x02cf, blocks: (B:107:0x024c, B:109:0x0256, B:110:0x025d, B:126:0x02af, B:127:0x02b3, B:129:0x02b9, B:130:0x02bc, B:117:0x0276, B:118:0x0294, B:120:0x0298, B:122:0x029e, B:123:0x02a1, B:124:0x02a5, B:125:0x02aa), top: B:163:0x024c }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0317 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:153:0x0318  */
    /* JADX WARN: Code duplicated, block: B:99:0x0231 A[Catch: ᩻ۜۛ -> 0x0247, TryCatch #2 {᩻ۜۛ -> 0x0247, blocks: (B:72:0x01c0, B:74:0x01c8, B:75:0x01cf, B:96:0x0227, B:97:0x022b, B:99:0x0231, B:100:0x0234, B:83:0x01ea, B:84:0x01fe, B:86:0x0202, B:88:0x0208, B:89:0x020c, B:90:0x0210, B:92:0x0216, B:93:0x0219, B:94:0x021d, B:95:0x0223), top: B:158:0x01c0 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC18847 m35657(EnumC3185 enumC3185) {
        EnumC20339 enumC20339M38394;
        C7660 c7660M38385;
        AbstractC18847 c1451;
        AbstractC18847 c8908;
        C7660 c7660M38395;
        long j;
        float f;
        int iFloatToIntBits;
        C7660 c7660M38396;
        double d;
        long jDoubleToLongBits;
        C24866 c24866;
        AbstractC18847 c22005 = null;
        this.f48430 = null;
        int i = C18348.f59819[enumC3185.ordinal()];
        int i2 = 0;
        C21522 c21522 = this.f48431;
        switch (i) {
            case 1:
            case 2:
                try {
                    c21522.f12427.m21679(EnumC5202.f18252);
                    break;
                } catch (C24866 e) {
                    this.f48430 = e;
                }
                c22005 = new C10816(c21522.f12427.f26453);
                c24866 = this.f48430;
                if (c24866 == null) {
                    return c22005;
                }
                throw c24866;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                try {
                    C7965 c7965 = c21522.f12427;
                    if (c7965.f26465 == EnumC5202.f18173) {
                        c7965.m21671();
                        c21522.f12427.f26466 = true;
                    }
                    C7965 c7966 = c21522.f12427;
                    i2 = c7966.f26455 * c7966.f26459;
                    c7966.m21679(EnumC5202.f18162);
                    break;
                } catch (C24866 e2) {
                    this.f48430 = e2;
                }
                c22005 = new C0705(enumC3185, Integer.valueOf(i2));
                c24866 = this.f48430;
                if (c24866 == null) {
                    return c22005;
                }
                throw c24866;
            case 13:
            case 14:
                try {
                    C7965 c7967 = c21522.f12427;
                    c7967.f26466 = false;
                    if (c7967.f26465 == EnumC5202.f18173) {
                        c7967.m21671();
                        c21522.f12427.f26466 = true;
                    }
                    int i3 = C20776.f66559[c21522.f12427.f26465.ordinal()];
                    try {
                        if (i3 == 6) {
                            f = (float) c21522.f12427.f26456;
                        } else if (i3 == 8) {
                            f = c21522.f12427.f26449;
                        } else {
                            if (i3 == 12) {
                                C7965 c7968 = c21522.f12427;
                                if (c7968.f26466) {
                                    iFloatToIntBits = c7968.f26459;
                                } else {
                                    f = c7968.f26459;
                                }
                                if (c21522.f12427.f26455 == -1) {
                                    iFloatToIntBits ^= Integer.MIN_VALUE;
                                }
                                c8908 = new C18604(Integer.valueOf(iFloatToIntBits));
                                c21522.f12427.m21671();
                                c22005 = c8908;
                                c24866 = this.f48430;
                                if (c24866 == null) {
                                    return c22005;
                                }
                                throw c24866;
                            }
                            if (i3 == 20) {
                                f = Float.POSITIVE_INFINITY;
                            } else {
                                if (i3 != 21) {
                                    c21522.f12426.m32299(new Supplier() { // from class: l.᩺ᩴ᩺
                                        @Override // java.util.function.Supplier
                                        public final Object get() {
                                            return "token=" + this.f79489.f48431.f12427.f26465;
                                        }
                                    });
                                    c21522.f12426.mo4159(c21522.f12427.f26464, "\"{0}\" token is expected", "<Float>");
                                    throw new C24866();
                                }
                                f = Float.NaN;
                            }
                        }
                        c21522.f12427.m21671();
                        c22005 = c8908;
                    } catch (C24866 e3) {
                        e = e3;
                        c22005 = c8908;
                        this.f48430 = e;
                    }
                    iFloatToIntBits = Float.floatToIntBits(f);
                    if (c21522.f12427.f26455 == -1) {
                        iFloatToIntBits ^= Integer.MIN_VALUE;
                    }
                    c8908 = new C18604(Integer.valueOf(iFloatToIntBits));
                } catch (C24866 e4) {
                    e = e4;
                }
                c24866 = this.f48430;
                if (c24866 == null) {
                    return c22005;
                }
                throw c24866;
            case 15:
            case 16:
                try {
                    C7965 c7969 = c21522.f12427;
                    if (c7969.f26465 == EnumC5202.f18173) {
                        c7969.m21671();
                        c21522.f12427.f26466 = true;
                    }
                    int i4 = C20776.f66559[c21522.f12427.f26465.ordinal()];
                    try {
                        if (i4 == 6) {
                            d = c21522.f12427.f26456;
                        } else {
                            if (i4 != 8) {
                                if (i4 == 10) {
                                    C7965 c79610 = c21522.f12427;
                                    if (c79610.f26466) {
                                        jDoubleToLongBits = c79610.f26460;
                                    } else {
                                        d = c79610.f26460;
                                    }
                                } else if (i4 == 12) {
                                    C7965 c79611 = c21522.f12427;
                                    if (c79611.f26466) {
                                        jDoubleToLongBits = c79611.f26459;
                                    } else {
                                        d = c79611.f26459;
                                    }
                                } else if (i4 == 20) {
                                    d = Double.POSITIVE_INFINITY;
                                } else {
                                    if (i4 != 21) {
                                        c21522.f12426.mo4159(c21522.f12427.f26464, "\"{0}\" token is expected", "Double");
                                        throw new C24866();
                                    }
                                    d = Double.NaN;
                                }
                                if (c21522.f12427.f26455 == -1) {
                                    jDoubleToLongBits ^= Long.MIN_VALUE;
                                }
                                c8908 = new C4434(Long.valueOf(jDoubleToLongBits));
                                c21522.f12427.m21671();
                                c22005 = c8908;
                                c24866 = this.f48430;
                                if (c24866 == null) {
                                    return c22005;
                                }
                                throw c24866;
                            }
                            d = c21522.f12427.f26449;
                        }
                        c21522.f12427.m21671();
                        c22005 = c8908;
                    } catch (C24866 e5) {
                        e = e5;
                        c22005 = c8908;
                        this.f48430 = e;
                    }
                    jDoubleToLongBits = Double.doubleToLongBits(d);
                    if (c21522.f12427.f26455 == -1) {
                        jDoubleToLongBits ^= Long.MIN_VALUE;
                    }
                    c8908 = new C4434(Long.valueOf(jDoubleToLongBits));
                } catch (C24866 e6) {
                    e = e6;
                }
                c24866 = this.f48430;
                if (c24866 == null) {
                    return c22005;
                }
                throw c24866;
            case 17:
            case 18:
                try {
                    C7965 c79612 = c21522.f12427;
                    if (c79612.f26465 == EnumC5202.f18173) {
                        c79612.m21671();
                        c21522.f12427.f26466 = true;
                    }
                    int i5 = C20776.f66559[c21522.f12427.f26465.ordinal()];
                    if (i5 == 10) {
                        j = c21522.f12427.f26460;
                    } else {
                        if (i5 != 12) {
                            c21522.f12426.mo4159(c21522.f12427.f26450, "\"{0}\" token is expected", "Integer");
                            throw new C24866();
                        }
                        j = c21522.f12427.f26459;
                    }
                    C10399 c10399 = new C10399(Long.valueOf(j * ((long) c21522.f12427.f26455)));
                    try {
                        c21522.f12427.m21671();
                        c22005 = c10399;
                    } catch (C24866 e7) {
                        e = e7;
                        c22005 = c10399;
                        this.f48430 = e;
                    }
                } catch (C24866 e8) {
                    e = e8;
                }
                c24866 = this.f48430;
                if (c24866 == null) {
                    return c22005;
                }
                throw c24866;
            case 19:
                try {
                    c7660M38396 = c21522.f12428.m38395();
                    break;
                } catch (C24866 e9) {
                    this.f48430 = e9;
                    c7660M38396 = null;
                }
                if (this.f48430 == null) {
                    c22005 = new C2942(EnumC3185.f10356, c7660M38396);
                }
                c24866 = this.f48430;
                if (c24866 == null) {
                    return c22005;
                }
                throw c24866;
            case 20:
            case 21:
                try {
                    c7660M38395 = c21522.f12428.m38395();
                    break;
                } catch (C24866 e10) {
                    this.f48430 = e10;
                    c7660M38395 = null;
                }
                if (this.f48430 == null) {
                    c22005 = new C22005(c7660M38395);
                }
                c24866 = this.f48430;
                if (c24866 == null) {
                    return c22005;
                }
                throw c24866;
            case 22:
            case 23:
                try {
                    c8908 = new C24572(c21522.f12428.m38386(true));
                    c22005 = c8908;
                } catch (C24866 e11) {
                    this.f48430 = e11;
                }
                c24866 = this.f48430;
                if (c24866 == null) {
                    return c22005;
                }
                throw c24866;
            case 24:
            case 25:
                c22005 = m35658(EnumC3185.f10340);
                c24866 = this.f48430;
                if (c24866 == null) {
                    return c22005;
                }
                throw c24866;
            case 26:
            case 27:
                c22005 = m35658(EnumC3185.f10352);
                c24866 = this.f48430;
                if (c24866 == null) {
                    return c22005;
                }
                throw c24866;
            case 28:
            case 29:
                c22005 = m35658(EnumC3185.f10369);
                c24866 = this.f48430;
                if (c24866 == null) {
                    return c22005;
                }
                throw c24866;
            case 30:
                try {
                    C7660 c7660M38397 = c21522.f12428.m38395();
                    c21522.f12427.m21679(EnumC5202.f18334);
                    c1451 = new C7417(c7660M38397, c21522.f12428.m38395());
                    c22005 = c1451;
                } catch (C24866 e12) {
                    this.f48430 = e12;
                }
                c24866 = this.f48430;
                if (c24866 == null) {
                    return c22005;
                }
                throw c24866;
            case 31:
                try {
                    C7965 c79613 = c21522.f12427;
                    if (c79613.f26465 == EnumC5202.f18162) {
                        enumC20339M38394 = C12134.m30329(c79613.f26459);
                        c21522.f12427.m21671();
                        c21522.f12427.m21679(EnumC5202.f18334);
                        C7965 c79614 = c21522.f12427;
                        if (c79614.f26465 == EnumC5202.f18285) {
                            c7660M38385 = c21522.f12428.f52487.m36703(c79614.f26459);
                            c21522.f12427.m21671();
                        } else {
                            c7660M38385 = c21522.f12428.m38385(enumC20339M38394);
                        }
                    } else {
                        enumC20339M38394 = c21522.f12428.m38394();
                        c21522.f12427.m21679(EnumC5202.f18334);
                        C7965 c79615 = c21522.f12427;
                        if (c79615.f26465 == EnumC5202.f18285) {
                            c7660M38385 = c21522.f12428.f52487.m36703(c79615.f26459);
                            c21522.f12427.m21671();
                        } else {
                            c7660M38385 = c21522.f12428.m38385(enumC20339M38394);
                        }
                    }
                    c1451 = new C1451(enumC20339M38394, c7660M38385);
                    c22005 = c1451;
                } catch (C24866 e13) {
                    this.f48430 = e13;
                }
                c24866 = this.f48430;
                if (c24866 == null) {
                    return c22005;
                }
                throw c24866;
            case 32:
                c22005 = (C14874) m35656(new C12571());
                c24866 = this.f48430;
                if (c24866 == null) {
                    return c22005;
                }
                throw c24866;
            case 33:
                c22005 = (C19350) m35656(new C6606());
                c24866 = this.f48430;
                if (c24866 == null) {
                    return c22005;
                }
                throw c24866;
            case 34:
                try {
                    c8908 = new C14128(EnumC3185.f10333, c21522.f12428.m38393());
                    c22005 = c8908;
                } catch (C24866 e14) {
                    this.f48430 = e14;
                }
                c24866 = this.f48430;
                if (c24866 == null) {
                    return c22005;
                }
                throw c24866;
            case 35:
                try {
                    c8908 = new C8908(EnumC3185.f10366, c21522.f12428.m38397());
                    c22005 = c8908;
                } catch (C24866 e15) {
                    this.f48430 = e15;
                }
                c24866 = this.f48430;
                if (c24866 == null) {
                    return c22005;
                }
                throw c24866;
            default:
                throw new RuntimeException(C14442.m34865("The Constant Type \"", enumC3185.m10399(), "\" does not have a corresponding visitor function."));
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4 A[Catch: ᩻ۜۛ -> 0x00dc, TryCatch #0 {᩻ۜۛ -> 0x00dc, blocks: (B:3:0x0003, B:5:0x0016, B:9:0x0030, B:17:0x0078, B:19:0x0080, B:20:0x0099, B:33:0x00c4, B:34:0x00db, B:27:0x00ab, B:28:0x00b1, B:29:0x00b9, B:8:0x001e, B:10:0x003a, B:12:0x004a, B:15:0x0059, B:16:0x006e), top: B:38:0x0003 }] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C4851 m35658(EnumC3185 enumC3185) {
        C7660 c7660M39297;
        C4851 c8163;
        C21522 c21522 = this.f48431;
        C4851 c4851 = null;
        try {
            EnumC5202 enumC5202 = c21522.f12427.f26465;
            C7660 c7660M38386 = c21522.f12428.m38386(false);
            C7965 c7965 = c21522.f12427;
            if (c7965.f26465 == EnumC5202.f18331) {
                c7965.m21671();
                if (enumC5202 != EnumC5202.f18285) {
                    C15291 c15291 = c21522.f12428.f52487;
                    EnumC3185 enumC3186 = EnumC3185.f10346;
                    c15291.getClass();
                    c7660M38386 = c15291.m36707((AbstractC18847) new C6672(enumC3186, c7660M38386));
                }
                C7660 c7660 = c7660M38386;
                c7660M38386 = c21522.f12428.m38395();
                c7660M39297 = c7660;
            } else if (c21522.f12428.f52490.f56489.m39297().mo20871() || c21522.f12428.f52490.f56489.m39297().f25232 == null) {
                c7660M39297 = c21522.f12428.f52490.f56489.m39297();
            } else {
                C16168 c16168 = c21522.f12428;
                c7660M39297 = c16168.f52487.m36707(c16168.f52490.f56489.m39297().f25232);
            }
            C7965 c7966 = c21522.f12427;
            if (c7966.f26465 == EnumC5202.f18334) {
                c7966.m21671();
                C16168 c16169 = c21522.f12428;
                C15291 c15292 = c16169.f52487;
                EnumC3185 enumC3187 = EnumC3185.f10361;
                C7660 c7660M38395 = c16169.m38395();
                c15292.getClass();
                c7660M38386 = c15292.m36707((AbstractC18847) new C4851(enumC3187, c7660M38386, c7660M38395));
            }
            int i = C20776.f66558[enumC3185.ordinal()];
            if (i == 1) {
                c8163 = new C8163(EnumC3185.f10369, c7660M39297, c7660M38386);
            } else {
                if (i != 2) {
                    if (i == 3) {
                        c8163 = new C21588(c7660M39297, c7660M38386);
                    }
                    if (c4851 != null) {
                        return c4851;
                    }
                    c21522.f12426.mo4160("Invalid type of Constant Pool Constant {0}", enumC3185.m10399());
                    C24866 c24866 = new C24866();
                    c24866.m55392();
                    throw c24866;
                }
                c8163 = new C9653(EnumC3185.f10340, c7660M39297, c7660M38386);
            }
            c4851 = c8163;
            if (c4851 != null) {
                return c4851;
            }
            c21522.f12426.mo4160("Invalid type of Constant Pool Constant {0}", enumC3185.m10399());
            C24866 c24867 = new C24866();
            c24867.m55392();
            throw c24867;
        } catch (C24866 e) {
            this.f48430 = e;
            return c4851;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ef A[Catch: ᩻ۜۛ -> 0x0118, TryCatch #0 {᩻ۜۛ -> 0x0118, blocks: (B:3:0x0003, B:5:0x000d, B:7:0x0021, B:9:0x0045, B:10:0x0065, B:11:0x0066, B:13:0x0091, B:14:0x0099, B:15:0x00a0, B:17:0x00a6, B:19:0x00ae, B:25:0x00c7, B:27:0x00cd, B:28:0x00d4, B:20:0x00b7, B:22:0x00bb, B:30:0x00e7, B:32:0x00ef, B:33:0x00f2, B:35:0x00fa, B:37:0x0114, B:36:0x0108, B:23:0x00bf), top: B:42:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00fa A[Catch: ᩻ۜۛ -> 0x0118, TryCatch #0 {᩻ۜۛ -> 0x0118, blocks: (B:3:0x0003, B:5:0x000d, B:7:0x0021, B:9:0x0045, B:10:0x0065, B:11:0x0066, B:13:0x0091, B:14:0x0099, B:15:0x00a0, B:17:0x00a6, B:19:0x00ae, B:25:0x00c7, B:27:0x00cd, B:28:0x00d4, B:20:0x00b7, B:22:0x00bb, B:30:0x00e7, B:32:0x00ef, B:33:0x00f2, B:35:0x00fa, B:37:0x0114, B:36:0x0108, B:23:0x00bf), top: B:42:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0108 A[Catch: ᩻ۜۛ -> 0x0118, TryCatch #0 {᩻ۜۛ -> 0x0118, blocks: (B:3:0x0003, B:5:0x000d, B:7:0x0021, B:9:0x0045, B:10:0x0065, B:11:0x0066, B:13:0x0091, B:14:0x0099, B:15:0x00a0, B:17:0x00a6, B:19:0x00ae, B:25:0x00c7, B:27:0x00cd, B:28:0x00d4, B:20:0x00b7, B:22:0x00bb, B:30:0x00e7, B:32:0x00ef, B:33:0x00f2, B:35:0x00fa, B:37:0x0114, B:36:0x0108, B:23:0x00bf), top: B:42:0x0003 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C12637 m35656(BiFunction biFunction) {
        C7965 c7965;
        C7965 c7966;
        C7660 c7660M36707;
        C21522 c21522 = this.f48431;
        try {
            C7965 c7967 = c21522.f12427;
            if (c7967.f26465 == EnumC5202.f18162) {
                int i = c7967.f26459;
                c7967.m21671();
                c21522.f12427.m21679(EnumC5202.f18334);
                C7965 c7968 = c21522.f12427;
                if (c7968.f26465 != EnumC5202.f18285) {
                    c21522.f12426.m32299(new Supplier() { // from class: l.ۘᩴ᩺
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return "token=" + this.f15747.f48431.f12427.f26465;
                        }
                    });
                    c21522.f12426.mo4159(c21522.f12427.f26464, "\"{0}\" token is expected", "<CPINDEX>");
                    throw new C24866();
                }
                int i2 = c7968.f26459;
                c7968.m21671();
                C21332 c21332 = new C21332();
                c21332.f67971 = null;
                c21332.f67972 = new ArrayList();
                c21332.f67820 = i;
                return (C12637) biFunction.apply(c21332, c21522.f12428.f52487.m36703(i2));
            }
            C7660 c7660M36708 = c21522.f12428.f52487.m36707(c21522.m48930(EnumC3185.f10370));
            c21522.f12427.m21679(EnumC5202.f18334);
            C7660 c7660M36709 = c21522.f12428.f52487.m36707(c21522.m48930(EnumC3185.f10361));
            if (c21522.f12427.f26465 == EnumC5202.f18213) {
                c21522.m48935();
                c21522.f12427.m21671();
            }
            ArrayList arrayList = new ArrayList(256);
            while (true) {
                if (c21522.f68763 > 0) {
                    C7965 c7969 = c21522.f12427;
                    EnumC5202 enumC5202 = c7969.f26465;
                    EnumC5202 enumC5203 = EnumC5202.f18314;
                    if (enumC5202 == enumC5203) {
                        c21522.m48932();
                        c21522.f12427.m21671();
                        break;
                    }
                    if (enumC5202 == EnumC5202.f18144) {
                        c7969.m21679(enumC5203);
                    }
                    c7965 = c21522.f12427;
                    if (c7965.f26465 == EnumC5202.f18309) {
                        c7965.m21671();
                    }
                    c7966 = c21522.f12427;
                    if (c7966.f26465 == EnumC5202.f18285) {
                        int i3 = c7966.f26459;
                        c7966.m21671();
                        c7660M36707 = c21522.f12428.f52487.m36703(i3);
                    } else {
                        c7660M36707 = c21522.f12428.f52487.m36707(c21522.m48931(null, null, false, true));
                    }
                    arrayList.add(c7660M36707);
                } else {
                    if (c21522.f12427.f26465 == EnumC5202.f18144) {
                        break;
                    }
                    c7965 = c21522.f12427;
                    if (c7965.f26465 == EnumC5202.f18309) {
                        c7965.m21671();
                    }
                    c7966 = c21522.f12427;
                    if (c7966.f26465 == EnumC5202.f18285) {
                        int i4 = c7966.f26459;
                        c7966.m21671();
                        c7660M36707 = c21522.f12428.f52487.m36703(i4);
                    } else {
                        c7660M36707 = c21522.f12428.f52487.m36707(c21522.m48931(null, null, false, true));
                    }
                    arrayList.add(c7660M36707);
                }
            }
            if (c21522.f68763 == 0) {
                c21522.f12427.m21674(EnumC5202.f18144);
            }
            C21332 c21333 = new C21332(c7660M36708, arrayList);
            c21522.f12428.f52490.m40767(c21333);
            return (C12637) biFunction.apply(c21333, c7660M36709);
        } catch (C24866 e) {
            this.f48430 = e;
            return null;
        }
    }
}
