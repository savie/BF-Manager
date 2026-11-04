package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes5.dex */
public final class C17792 extends C3622 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C17046 f58387 = new C17046();

    public C17792(C16168 c16168) {
        this.f12426 = c16168.f12426;
        C7965 c7965 = c16168.f12427;
        this.f12427 = c7965;
        this.f12428 = c16168;
        f58387.m40170(c7965);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m41646() {
        C22817 c22817;
        C7965 c7965;
        EnumC5202 enumC5202;
        C4171 c4171;
        ArrayList arrayList = new ArrayList();
        while (true) {
            C7965 c7966 = this.f12427;
            if (c7966.f26465 != EnumC5202.f18198) {
                if (arrayList.size() > 0) {
                    return arrayList;
                }
                return null;
            }
            if (EnumC9324.m24560(c7966.f26453)) {
                arrayList.add(m41645());
            } else {
                if (!EnumC9324.m24561(this.f12427.f26453)) {
                    return null;
                }
                boolean zM24559 = EnumC9324.m24559(this.f12427.f26453);
                this.f12427.m21671();
                C7965 c7967 = this.f12427;
                if (c7967.f26465 == EnumC5202.f18285) {
                    int i = c7967.f26459;
                    c7967.m21672(String.format("     [ParserAnnotation.parseTypeAnnotation]: cpIndex = #%d", Integer.valueOf(i)));
                    c22817 = new C22817(this.f12428.f52487.m36703(i), zM24559);
                } else {
                    String str = c7967.f26453;
                    c7967.m21672(C25272.m56409("     [ParserAnnotation.parseTypeAnnotation]: value = ", str));
                    c22817 = new C22817(this.f12428.f52487.m36704(str), zM24559);
                }
                this.f12427.m21671();
                C7965 c7968 = this.f12427;
                EnumC5202 enumC5203 = EnumC5202.f18213;
                c7968.m21679(enumC5203);
                m41644(c22817);
                this.f12427.m21672("     [ParserAnnotation._scanTypeTarget]: Begin ");
                this.f12427.m21679(enumC5203);
                this.f12427.m21679(EnumC5202.f18168);
                this.f12427.m21672("     [ParserAnnotation._scanTypeTarget]: TargetType: " + this.f12427.f26454);
                EnumC24309 enumC24309M54349 = EnumC24309.m54349(this.f12427.f26454);
                if (enumC24309M54349 == null) {
                    C1122 c1122 = this.f12426;
                    C7965 c7969 = this.f12427;
                    throw C10185.m26296(c1122, c7969.f26464, "Incorrect TypeAnnotation target \"{0}\"", new Object[]{c7969.f26454});
                }
                this.f12427.m21672("     [ParserAnnotation._scanTypeTarget]: Got TargetType: " + enumC24309M54349);
                C17046 c17046 = f58387;
                if (c17046.f55691 == null) {
                    c17046.f55691 = this.f12427;
                }
                c17046.m40171(enumC24309M54349);
                c22817.f73947 = c17046.m40169();
                c22817.f73948 = enumC24309M54349;
                this.f12427.m21672("     [ParserAnnotation._scanTypeTarget]: Got TargetInfo: " + c22817.f73947);
                C7965 c79610 = this.f12427;
                EnumC5202 enumC5204 = EnumC5202.f18314;
                c79610.m21679(enumC5204);
                C7965 c79611 = this.f12427;
                if (c79611.f26465 != enumC5204) {
                    c79611.m21679(enumC5203);
                    while (true) {
                        c7965 = this.f12427;
                        EnumC5202 enumC5205 = c7965.f26465;
                        EnumC5202 enumC5206 = EnumC5202.f18303;
                        if (enumC5205 == enumC5206 || enumC5205 == (enumC5202 = EnumC5202.f18314)) {
                            break;
                        }
                        if (enumC5205 == enumC5206 || !enumC5205.m15641()) {
                            C1122 c1123 = this.f12426;
                            C7965 c79612 = this.f12427;
                            throw C10185.m26296(c1123, c79612.f26464, "Incorrect TypeAnnotation TargetPath PathEntry \"{0}\"", new Object[]{c79612.f26465});
                        }
                        EnumC12374 enumC12374M30856 = EnumC12374.m30856(this.f12427.f26453);
                        if (enumC12374M30856 == EnumC12374.TYPE_ARGUMENT) {
                            this.f12427.m21671();
                            this.f12427.m21679(EnumC5202.f18213);
                            C7965 c79613 = this.f12427;
                            EnumC5202 enumC5207 = c79613.f26465;
                            if (enumC5207 == enumC5206 || enumC5207 != EnumC5202.f18162) {
                                throw C10185.m26296(this.f12426, c79613.f26464, "Incorrect TypeAnnotation TargetPath PathEntry ArgIndex (expected Integer),  \"{0}\"", new Object[]{enumC5207});
                            }
                            int i2 = c79613.f26459;
                            c79613.m21671();
                            c4171 = new C4171(enumC12374M30856, i2);
                            this.f12427.m21679(enumC5202);
                        } else {
                            c4171 = new C4171(enumC12374M30856, 0);
                            this.f12427.m21671();
                        }
                        c22817.f73949.m47171(c4171);
                        C7965 c79614 = this.f12427;
                        if (c79614.f26465 == EnumC5202.f18309) {
                            c79614.m21671();
                        }
                    }
                    c7965.m21679(EnumC5202.f18314);
                }
                this.f12427.m21679(EnumC5202.f18314);
                arrayList.add(c22817);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20513 m41647() {
        this.f12427.m21671();
        this.f12427.m21679(EnumC5202.f18213);
        EnumC5202 enumC5202 = this.f12427.f26465;
        InterfaceC5597 interfaceC5597M41643 = (enumC5202 == EnumC5202.f18303 || enumC5202 == EnumC5202.f18314) ? null : m41643("default");
        this.f12427.m21679(EnumC5202.f18314);
        C20513 c20513 = new C20513(this.f12428.f52487, EnumC13127.f41968);
        c20513.f65717 = interfaceC5597M41643;
        return c20513;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C12381 m41645() {
        C12381 c12381;
        boolean zM24559 = EnumC9324.m24559(this.f12427.f26453);
        this.f12427.m21672(" - - - > [ParserAnnotation.parseAnnotation]: Begin ");
        this.f12427.m21671();
        C7965 c7965 = this.f12427;
        if (c7965.f26465 == EnumC5202.f18285) {
            int i = c7965.f26459;
            c7965.m21672(String.format("     [ParserAnnotation.parseAnnotation]: cpIndex = #%d", Integer.valueOf(i)));
            c12381 = new C12381(this.f12428.f52487.m36703(i), zM24559);
        } else {
            String str = c7965.f26453;
            c7965.m21672(C25272.m56409("     [ParserAnnotation.parseAnnotation]: value = ", str));
            c12381 = new C12381(this.f12428.f52487.m36704(str), zM24559);
        }
        this.f12427.m21671();
        m41644(c12381);
        return c12381;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41644(C12381 c12381) {
        C7965 c7965;
        this.f12427.m21672(" - - - > [ParserAnnotation._scanAnnotation]: Begin");
        this.f12427.m21679(EnumC5202.f18213);
        while (true) {
            c7965 = this.f12427;
            EnumC5202 enumC5202 = c7965.f26465;
            if (enumC5202 == EnumC5202.f18303 || enumC5202 == EnumC5202.f18314) {
                break;
            }
            C7660 c7660M38395 = this.f12428.m38395();
            this.f12427.m21679(EnumC5202.f18167);
            if (c7660M38395.mo20871()) {
                AbstractC18847 abstractC18847 = c7660M38395.f25232;
                if (abstractC18847.f61223 != EnumC3185.f10335) {
                    throw new C24866();
                }
                String strMo27553 = abstractC18847.mo27553();
                this.f12427.m21672(C25272.m56409("     [ParserAnnotation._scanAnnotation]: Annot - Field Name: ", strMo27553));
                c12381.m30862(new C20586(c7660M38395, m41643(strMo27553)));
            } else if (this.f12427.f26465 == EnumC5202.f18285) {
                C7660 c7660M38396 = this.f12428.m38395();
                this.f12427.m21672("     [ParserAnnotation._scanAnnotation]: " + c7660M38395.f67820 + " = " + c7660M38396.f67820);
                c12381.m30862(new C20586(c7660M38395, c7660M38396));
            } else {
                c12381.m30862(new C20586(c7660M38395, m41643("unknown")));
            }
            C7965 c7966 = this.f12427;
            if (c7966.f26465 == EnumC5202.f18309) {
                c7966.m21671();
            }
        }
        c7965.m21679(EnumC5202.f18314);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC5597 m41643(String str) {
        C7965 c7965;
        int[] iArr = C20030.f64341;
        int i = 1;
        switch (iArr[this.f12427.f26465.ordinal()]) {
            case 1:
                C1122 c1122 = this.f12426;
                StringBuilder sbM51387 = C22783.m51387("[ParserAnnotation.scanAnnotationData]:: JASM Keyword: (annotation field name: ", str, ") keyword: ");
                sbM51387.append(this.f12427.f26453);
                c1122.m32315(sbM51387.toString(), new Object[0]);
                String str2 = this.f12427.f26453;
                int i2 = C20030.f64340[C12134.m30330(str2).ordinal()];
                if (i2 == 1) {
                    this.f12427.m21671();
                    int i3 = iArr[this.f12427.f26465.ordinal()];
                    if (i3 == 1) {
                        String str3 = this.f12427.f26453;
                        str3.getClass();
                        if (!str3.equals("true")) {
                            if (!str3.equals("false")) {
                                throw C10185.m26296(this.f12426, this.f12427.f26464, "Incorrect Annotation ({0}), expected {1}, got \"{2}\"", new Object[]{EnumC15863.AE_BOOLEAN.m37825(), EnumC5202.f18162.m15637() + ", " + EnumC5202.f18285.m15637() + ", " + EnumC5202.f18175.m15637() + ", " + EnumC5202.f18233.m15637(), this.f12427.f26453});
                            }
                            i = 0;
                        }
                        C1122 c1123 = this.f12426;
                        StringBuilder sbM51388 = C22783.m51387("Boolean Field: ", str, " = ");
                        sbM51388.append(this.f12427.f26453);
                        c1123.m32315(sbM51388.toString(), new Object[0]);
                        C11825 c11825 = new C11825(EnumC15863.AE_BOOLEAN.m37827(), this.f12428.f52487.m36720(Integer.valueOf(i)));
                        this.f12427.m21671();
                        return c11825;
                    }
                    if (i3 == 3) {
                        C11825 c11826 = new C11825(EnumC15863.AE_BOOLEAN.m37827(), this.f12428.f52487.m36703(Integer.parseInt(this.f12427.f26453)));
                        this.f12427.m21671();
                        return c11826;
                    }
                    if (i3 != 4) {
                        throw C10185.m26296(this.f12426, this.f12427.f26464, "Incorrect Annotation ({0}), expected {1}, got \"{2}\"", new Object[]{EnumC15863.AE_BOOLEAN.m37825(), EnumC5202.f18162.m15637() + ", " + EnumC5202.f18285.m15637(), this.f12427.f26453});
                    }
                    C1122 c1124 = this.f12426;
                    StringBuilder sbM51389 = C22783.m51387("Boolean Field: ", str, " = ");
                    sbM51389.append(this.f12427.f26459);
                    c1124.m32315(sbM51389.toString(), new Object[0]);
                    int i4 = this.f12427.f26459;
                    if (i4 > 1 || i4 < 0) {
                        C1122 c1125 = this.f12426;
                        StringBuilder sbM513810 = C22783.m51387("Warning: Boolean Field: ", str, " value is not 0 or 1, value = ");
                        sbM513810.append(this.f12427.f26459);
                        c1125.m32315(sbM513810.toString(), new Object[0]);
                    }
                    C11825 c11827 = new C11825(EnumC15863.AE_BOOLEAN.m37827(), this.f12428.f52487.m36720(Integer.valueOf(i4)));
                    this.f12427.m21671();
                    return c11827;
                }
                if (i2 == 2) {
                    this.f12427.m21671();
                    int i5 = iArr[this.f12427.f26465.ordinal()];
                    if (i5 == 3) {
                        C11825 c11828 = new C11825(EnumC15863.AE_BYTE.m37827(), this.f12428.f52487.m36703(Integer.parseInt(this.f12427.f26453)));
                        this.f12427.m21671();
                        return c11828;
                    }
                    if (i5 != 4) {
                        throw C10185.m26296(this.f12426, this.f12427.f26464, "Incorrect Annotation ({0}), expected {1}, got \"{2}\"", new Object[]{EnumC15863.AE_BYTE.m37825(), EnumC5202.f18162.m15637() + ", " + EnumC5202.f18285.m15637(), this.f12427.f26453});
                    }
                    C1122 c1126 = this.f12426;
                    StringBuilder sbM513811 = C22783.m51387("Byte Field: ", str, " = ");
                    sbM513811.append(this.f12427.f26459);
                    c1126.m32315(sbM513811.toString(), new Object[0]);
                    int i6 = this.f12427.f26459;
                    if (i6 > 255) {
                        C1122 c1127 = this.f12426;
                        StringBuilder sbM513812 = C22783.m51387("Warning: Byte Field: ", str, " value is greater than 0xFF, value = ");
                        sbM513812.append(this.f12427.f26459);
                        c1127.m32315(sbM513812.toString(), new Object[0]);
                    }
                    C11825 c11829 = new C11825(EnumC15863.AE_BYTE.m37827(), this.f12428.f52487.m36720(Integer.valueOf(i6)));
                    this.f12427.m21671();
                    return c11829;
                }
                if (i2 == 3) {
                    this.f12427.m21671();
                    int i7 = iArr[this.f12427.f26465.ordinal()];
                    if (i7 == 3) {
                        C11825 c118210 = new C11825(EnumC15863.AE_CHAR.m37827(), this.f12428.f52487.m36703(Integer.parseInt(this.f12427.f26453)));
                        this.f12427.m21671();
                        return c118210;
                    }
                    if (i7 == 4) {
                        C1122 c1128 = this.f12426;
                        StringBuilder sbM513813 = C22783.m51387("Char Field: ", str, " = ");
                        sbM513813.append(this.f12427.f26459);
                        c1128.m32315(sbM513813.toString(), new Object[0]);
                        C11825 c118211 = new C11825(EnumC15863.AE_CHAR.m37827(), this.f12428.f52487.m36720(Integer.valueOf(this.f12427.f26459)));
                        this.f12427.m21671();
                        return c118211;
                    }
                    throw C10185.m26296(this.f12426, this.f12427.f26464, "Incorrect Annotation ({0}), expected {1}, got \"{2}\"", new Object[]{EnumC15863.AE_CHAR.m37825(), EnumC5202.f18162.m15637() + ", " + EnumC5202.f18285.m15637(), this.f12427.f26453});
                }
                if (i2 != 4) {
                    throw C10185.m26296(this.f12426, this.f12427.f26464, "Incorrect Annotation keyword \"{0}\"", new Object[]{str2});
                }
                this.f12427.m21671();
                int i8 = iArr[this.f12427.f26465.ordinal()];
                if (i8 == 3) {
                    C11825 c118212 = new C11825(EnumC15863.AE_SHORT.m37827(), this.f12428.f52487.m36703(Integer.parseInt(this.f12427.f26453)));
                    this.f12427.m21671();
                    return c118212;
                }
                if (i8 != 4) {
                    throw C10185.m26296(this.f12426, this.f12427.f26464, "Incorrect Annotation ({0}), expected {1}, got \"{2}\"", new Object[]{EnumC15863.AE_SHORT.m37825(), EnumC5202.f18162.m15637() + ", " + EnumC5202.f18285.m15637(), this.f12427.f26453});
                }
                C1122 c1129 = this.f12426;
                StringBuilder sbM513814 = C22783.m51387("Short Field: ", str, " = ");
                sbM513814.append(this.f12427.f26459);
                c1129.m32315(sbM513814.toString(), new Object[0]);
                int i9 = this.f12427.f26459;
                if (i9 > 65535) {
                    C1122 c11210 = this.f12426;
                    StringBuilder sbM513815 = C22783.m51387("Warning: Short Field: ", str, " value is greater than 0xFFFF, value = ");
                    sbM513815.append(this.f12427.f26459);
                    c11210.m32315(sbM513815.toString(), new Object[0]);
                }
                C11825 c118213 = new C11825(EnumC15863.AE_SHORT.m37827(), this.f12428.f52487.m36720(Integer.valueOf(i9)));
                this.f12427.m21671();
                return c118213;
            case 2:
                C1122 c11211 = this.f12426;
                StringBuilder sbM513816 = C22783.m51387("[ParserAnnotation.scanAnnotationData]:: String Field: ", str, " = ");
                sbM513816.append(this.f12427.f26453);
                c11211.m32315(sbM513816.toString(), new Object[0]);
                C11825 c118214 = new C11825(EnumC3185.f10335.m10395(), this.f12428.f52487.m36704(this.f12427.f26453));
                this.f12427.m21671();
                return c118214;
            case 3:
                C1122 c11212 = this.f12426;
                StringBuilder sbM513817 = C22783.m51387("[ParserAnnotation.scanAnnotationData]:: Constant Field by index: ", str, " = #");
                sbM513817.append(this.f12427.f26453);
                c11212.m32315(sbM513817.toString(), new Object[0]);
                int i10 = Integer.parseInt(this.f12427.f26453);
                C7660 c7660M36703 = this.f12428.f52487.m36703(i10);
                EnumC3185 enumC3185M20873 = c7660M36703.m20873();
                InterfaceC5597 c118215 = enumC3185M20873.m10398(EnumC3185.f10350, EnumC3185.f10360, EnumC3185.f10371, EnumC3185.f10365, EnumC3185.f10354, EnumC3185.f10335) ? new C11825(enumC3185M20873.m10395(), c7660M36703) : new C2131(this.f12428.f52487.m36703(i10));
                this.f12427.m21671();
                return c118215;
            case 4:
                C1122 c11213 = this.f12426;
                StringBuilder sbM513818 = C22783.m51387("[ParserAnnotation.scanAnnotationData]:: Integer Field: ", str, " = ");
                sbM513818.append(this.f12427.f26459);
                c11213.m32315(sbM513818.toString(), new Object[0]);
                C11825 c118216 = new C11825(EnumC3185.f10360.m10395(), this.f12428.f52487.m36720(Integer.valueOf(this.f12427.f26459)));
                this.f12427.m21671();
                return c118216;
            case 5:
                C1122 c11214 = this.f12426;
                StringBuilder sbM513819 = C22783.m51387("[ParserAnnotation.scanAnnotationData]:: Double Field: ", str, " = ");
                sbM513819.append(this.f12427.f26456);
                c11214.m32315(sbM513819.toString(), new Object[0]);
                Long lValueOf = Long.valueOf(Double.doubleToLongBits(this.f12427.f26456));
                char cM10395 = EnumC3185.f10354.m10395();
                C15291 c15291 = this.f12428.f52487;
                c15291.getClass();
                C11825 c118217 = new C11825(cM10395, c15291.m36707(new C4434(lValueOf)));
                this.f12427.m21671();
                return c118217;
            case 6:
                C1122 c11215 = this.f12426;
                StringBuilder sbM513820 = C22783.m51387("[ParserAnnotation.scanAnnotationData]:: Float Field: ", str, " = ");
                sbM513820.append(this.f12427.f26449);
                c11215.m32315(sbM513820.toString(), new Object[0]);
                Integer numValueOf = Integer.valueOf(Float.floatToIntBits(this.f12427.f26449));
                char cM10396 = EnumC3185.f10371.m10395();
                C15291 c15292 = this.f12428.f52487;
                c15292.getClass();
                C11825 c118218 = new C11825(cM10396, c15292.m36707(new C18604(numValueOf)));
                this.f12427.m21671();
                return c118218;
            case 7:
                C1122 c11216 = this.f12426;
                StringBuilder sbM513821 = C22783.m51387("[ParserAnnotation.scanAnnotationData]:: Long Field: ", str, " = ");
                sbM513821.append(this.f12427.f26460);
                c11216.m32315(sbM513821.toString(), new Object[0]);
                char cM10397 = EnumC3185.f10365.m10395();
                C15291 c15293 = this.f12428.f52487;
                Long lValueOf2 = Long.valueOf(this.f12427.f26460);
                c15293.getClass();
                C11825 c118219 = new C11825(cM10397, c15293.m36707(new C10399(lValueOf2)));
                this.f12427.m21671();
                return c118219;
            case 8:
                this.f12426.m32315("[ParserAnnotation.scanAnnotationData]:: Class) keyword: " + this.f12427.f26453, new Object[0]);
                this.f12427.m21671();
                int i11 = iArr[this.f12427.f26465.ordinal()];
                if (i11 == 1 || i11 == 2) {
                    C1122 c11217 = this.f12426;
                    StringBuilder sbM513822 = C22783.m51387("[ParserAnnotation.scanAnnotationData]:: Constant Class Field: ", str, " = ");
                    sbM513822.append(this.f12427.f26453);
                    c11217.m32315(sbM513822.toString(), new Object[0]);
                    C11825 c118220 = new C11825(EnumC15863.AE_CLASS.m37827(), this.f12428.f52487.m36704(this.f12427.f26453));
                    this.f12427.m21671();
                    return c118220;
                }
                if (i11 != 3) {
                    C1122 c11218 = this.f12426;
                    C7965 c7966 = this.f12427;
                    throw C10185.m26296(c11218, c7966.f26464, "Incorrect Annotation (class), expected class name or CP index, got \"{0}\"", new Object[]{c7966.f26453});
                }
                C1122 c11219 = this.f12426;
                StringBuilder sbM513823 = C22783.m51387("[ParserAnnotation.scanAnnotationData]:: Constant Class Field: ", str, " = ");
                sbM513823.append(this.f12427.f26453);
                c11219.m32315(sbM513823.toString(), new Object[0]);
                C2131 c2131 = new C2131(this.f12428.f52487.m36703(Integer.valueOf(this.f12427.f26453).intValue()));
                this.f12427.m21671();
                return c2131;
            case 9:
                this.f12426.m32315("[ParserAnnotation.scanAnnotationData]:: Enum) keyword: " + this.f12427.f26453, new Object[0]);
                this.f12427.m21671();
                int i12 = iArr[this.f12427.f26465.ordinal()];
                if (i12 == 1 || i12 == 2) {
                    String str4 = this.f12427.f26453;
                    EnumC15863 enumC15863 = EnumC15863.AE_STRING;
                    enumC15863.m37827();
                    C7660 c7660M36704 = this.f12428.f52487.m36704(str4);
                    this.f12427.m21671();
                    this.f12427.m21679(EnumC5202.f18331);
                    int i13 = iArr[this.f12427.f26465.ordinal()];
                    if (i13 == 1 || i13 == 2) {
                        String str5 = this.f12427.f26453;
                        enumC15863.m37827();
                        C25252 c25252 = new C25252(c7660M36704, this.f12428.f52487.m36704(str5));
                        this.f12427.m21671();
                        return c25252;
                    }
                    if (i13 == 3) {
                        C25252 c25253 = new C25252(c7660M36704, this.f12428.f52487.m36703(this.f12427.f26459));
                        this.f12427.m21671();
                        return c25253;
                    }
                    C1122 c11220 = this.f12426;
                    C7965 c7967 = this.f12427;
                    throw C10185.m26296(c11220, c7967.f26464, "=Incorrect Annotation (enum), expected const_name or CP index, got \"{0}\"", new Object[]{c7967.f26453});
                }
                if (i12 != 3) {
                    C1122 c11221 = this.f12426;
                    C7965 c7968 = this.f12427;
                    throw C10185.m26296(c11221, c7968.f26464, "Incorrect Annotation (enum), expected type_name or CP index, got \"{0}\"", new Object[]{c7968.f26453});
                }
                C7965 c7969 = this.f12427;
                int i14 = c7969.f26459;
                c7969.m21671();
                C7965 c79610 = this.f12427;
                if (c79610.f26465 == EnumC5202.f18331) {
                    c79610.m21671();
                }
                int i15 = iArr[this.f12427.f26465.ordinal()];
                if (i15 == 1 || i15 == 2) {
                    String str6 = this.f12427.f26453;
                    EnumC15863.AE_STRING.m37827();
                    C25252 c25254 = new C25252(this.f12428.f52487.m36703(i14), this.f12428.f52487.m36704(str6));
                    this.f12427.m21671();
                    return c25254;
                }
                if (i15 == 3) {
                    C25252 c25255 = new C25252(this.f12428.f52487.m36703(i14), this.f12428.f52487.m36703(this.f12427.f26459));
                    this.f12427.m21671();
                    return c25255;
                }
                C1122 c11222 = this.f12426;
                C7965 c79611 = this.f12427;
                throw C10185.m26296(c11222, c79611.f26464, "=Incorrect Annotation (enum), expected const_name or CP index, got \"{0}\"", new Object[]{c79611.f26453});
            case 10:
                C1122 c11223 = this.f12426;
                StringBuilder sbM513824 = C22783.m51387("[ParserAnnotation.scanAnnotationData]:: Annotation Field: ", str, " = ");
                sbM513824.append(this.f12427.f26453);
                c11223.m32315(sbM513824.toString(), new Object[0]);
                C12381 c12381M41645 = m41645();
                C15554 c15554 = new C15554();
                c15554.f50598 = c12381M41645;
                return c15554;
            case 11:
                this.f12426.m32315(C25272.m56409("[ParserAnnotation.scanAnnotationData]:: Annotation Array Field: ", str), new Object[0]);
                this.f12427.m21671();
                C5860 c5860 = new C5860();
                c5860.f20100 = new ArrayList();
                while (true) {
                    c7965 = this.f12427;
                    EnumC5202 enumC5202 = c7965.f26465;
                    if (enumC5202 != EnumC5202.f18303 && enumC5202 != EnumC5202.f18314) {
                        c5860.f20100.add(m41643(C14483.m34972(str, " {}")));
                        C7965 c79612 = this.f12427;
                        if (c79612.f26465 == EnumC5202.f18309) {
                            c79612.m21671();
                        }
                    }
                }
                c7965.m21679(EnumC5202.f18314);
                return c5860;
            default:
                C1122 c11224 = this.f12426;
                C7965 c79613 = this.f12427;
                throw C10185.m26296(c11224, c79613.f26464, "Incorrect Annotation, unrecognized token: \"{0}\"", new Object[]{c79613.f26465});
        }
    }
}
