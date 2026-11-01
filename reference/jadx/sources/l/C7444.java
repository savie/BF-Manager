package l;

/* JADX INFO: renamed from: l.۟ۨ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7444 extends AbstractC8856 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20145 f24818;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7444(C20145 c20145, EnumC10477 enumC10477) {
        super(c20145, enumC10477, "symbol not found error");
        this.f24818 = c20145;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.AbstractC8856
    /* JADX INFO: renamed from: ۙ */
    public final C11948 mo8964(EnumC17198 enumC17198, InterfaceC12260 interfaceC12260, AbstractC23903 abstractC23903, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242, C21825 c21825, C21825 c21826) {
        C21825 c21827;
        C21825 c21825M48588;
        boolean z;
        Object objM45522;
        Object objM45523;
        char c;
        EnumC7654 enumC7654;
        C11948 c11948M51910;
        C21825 c21825M48589;
        AbstractC11242 abstractC11243 = abstractC11242;
        if (c21825 == null) {
            c21825M48589 = C21825.m48588();
        } else {
            c21827 = c21825;
        }
        if (c21826 == null) {
            c21827 = c21825M48589;
            c21825M48588 = C21825.m48588();
        } else {
            c21827 = c21825M48589;
            c21825M48588 = c21826;
        }
        C20145 c20145 = this.f24818;
        C23942 c23942 = c20145.f65436;
        C23549 c23549 = c20145.f65420;
        C20414 c20414 = c20145.f65441;
        C23942 c23943 = c20145.f65436;
        if (abstractC11243 == c23942.f77652) {
            return null;
        }
        AbstractC23903 abstractC23904 = abstractC23903 == null ? abstractC16579.f53222 : abstractC23903;
        if (abstractC23904.f77453.isEmpty()) {
            z = false;
        } else {
            if (abstractC23904.f77452 == EnumC10477.f35867 && !abstractC16579.f53222.mo20273() && abstractC23904.f77453 != c23943.f77636) {
                return c20145.f65420.m51912(enumC17198, c20414.m48186(), interfaceC12260, "doesnt.exist", abstractC23904);
            }
            if (abstractC23904.f77453.equals(c23943.f77533) || abstractC23904.f77453.equals(c23943.f77638)) {
                z = false;
            } else {
                z = true;
            }
        }
        boolean z2 = abstractC11243 == c23943.f77632;
        EnumC7654 enumC7654M26578 = z2 ? EnumC7654.CONSTRUCTOR : this.f77452.m26578();
        if (z2) {
            abstractC11243 = abstractC16579.f53222.f77453;
        }
        boolean zM48595 = c21825M48588.m48595();
        String string = z ? ".location" : "";
        int i = C14999.f48928[enumC7654M26578.ordinal()];
        if (i == 1 || i == 2) {
            StringBuilder sbM23356 = C9023.m23356(string.concat(".args"));
            sbM23356.append(zM48595 ? ".params" : "");
            string = sbM23356.toString();
        }
        String strM1693 = C0252.m1693("cant.resolve", string);
        if (!z) {
            C23549 c235410 = c20145.f65420;
            C22137 c22137M48186 = c20414.m48186();
            if (!c21827.isEmpty()) {
                objM45522 = c21827;
                objM45522 = c20145.m45522(c21827);
            }
            objM45522 = c21827;
            return c235410.m51912(enumC17198, c22137M48186, interfaceC12260, strM1693, enumC7654M26578, abstractC11243, c21825M48588, objM45522);
        }
        C23549 c235411 = c20145.f65420;
        C22137 c22137M48187 = c20414.m48186();
        if (!c21827.isEmpty()) {
            objM45523 = c21827;
            objM45523 = c20145.m45522(c21827);
        }
        objM45523 = c21827;
        if (abstractC23904.f77452 == EnumC10477.f35878) {
            EnumC7654 enumC7654M38160 = C16121.m38160(abstractC23904);
            AbstractC16579 abstractC165710 = abstractC23904.f77449;
            C14377 c14377 = C14707.f48054;
            c = 1;
            c11948M51910 = c23549.m51910(new C14377("compiler", "location.1", enumC7654M38160, abstractC23904, abstractC165710));
        } else {
            c = 1;
            if (abstractC16579.m39001(EnumC6617.TYPEVAR) || (abstractC16579.m39001(EnumC6617.CLASS) && (abstractC16579.f53222.mo20276() & 16777216) != 0)) {
                enumC7654 = EnumC7654.BOUND;
            } else if (abstractC16579.m39001(EnumC6617.PACKAGE)) {
                enumC7654 = EnumC7654.PACKAGE;
            } else {
                long j = abstractC16579.f53222.f77447;
                if ((j & 8192) != 0) {
                    enumC7654 = EnumC7654.ANNOTATION;
                } else {
                    enumC7654 = (j & 512) != 0 ? EnumC7654.INTERFACE : EnumC7654.CLASS;
                }
            }
            C14377 c14378 = C14707.f48054;
            c11948M51910 = c23549.m51910(new C14377("compiler", "location", enumC7654, abstractC16579, null));
        }
        Object[] objArr = new Object[5];
        objArr[0] = enumC7654M26578;
        objArr[c] = abstractC11243;
        objArr[2] = c21825M48588;
        objArr[3] = objM45523;
        objArr[4] = c11948M51910;
        return c235411.m51912(enumC17198, c22137M48187, interfaceC12260, strM1693, objArr);
    }
}
