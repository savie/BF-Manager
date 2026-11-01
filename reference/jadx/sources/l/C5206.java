package l;

import com.google.android.material.motion.MotionUtils;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۚ۟ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5206 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C16576 f18042 = new C16576();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C23942 f18043;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17573 f18044;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C20414 f18045;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6761 f18046;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5206 m14386(C12343 c12343) {
        C5206 c5206 = (C5206) c12343.m30656(f18042);
        return c5206 == null ? new C5206(c12343) : c5206;
    }

    public C5206(C12343 c12343) {
        c12343.m30659(f18042, this);
        this.f18043 = C23942.m52776(c12343);
        this.f18045 = C20414.m46161(c12343);
        C3836.m11131(c12343);
        this.f18044 = C17573.m40852(c12343);
        this.f18046 = C6761.m18268(c12343);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.ۢۤۤ] */
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
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14389(final C4603 c4603, final C8753 c8753) {
        this.f18044.m40870((RunnableC9524) new Runnable() { // from class: l.ۢۤۤ
            @Override // java.lang.Runnable
            public final void run() {
                C8753 c8754 = c8753;
                C5206 c5206 = this.f32209;
                C20414 c20414 = c5206.f18045;
                InterfaceC2173 interfaceC2173M48202 = c20414.m48202(c4603.f16295.f34725);
                try {
                    new C2383(c5206, true).mo7248(c8754);
                } finally {
                    c20414.m48202(interfaceC2173M48202);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m14391(final C4603 c4603, final C8753 c8753) {
        this.f18044.m40876(new Runnable() { // from class: l.֫ۤۤ
            @Override // java.lang.Runnable
            public final void run() {
                C8753 c8754 = c8753;
                C5206 c5206 = this.f6893;
                C20414 c20414 = c5206.f18045;
                InterfaceC2173 interfaceC2173M48202 = c20414.m48202(c4603.f16295.f34725);
                try {
                    c5206.f18046.m18316((AbstractC8774) c8754, true);
                } finally {
                    c20414.m48202(interfaceC2173M48202);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14390(C8753 c8753) {
        new C2383(this, false).mo7248(c8753);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21825 m14388(AbstractC0618 abstractC0618) {
        C11867 c11867Mo38252 = abstractC0618.mo2884().mo38252();
        if (c11867Mo38252 == null) {
            return null;
        }
        AbstractC23156 abstractC23156M29574 = c11867Mo38252.m29574(this.f18043.f77643);
        if (!(abstractC23156M29574 instanceof C4810)) {
            return null;
        }
        C21825 c21825M48586 = C21825.m48586((Object[]) ((C4810) abstractC23156M29574).f16902);
        if (C9030.stream(c21825M48586).anyMatch(new C15584(1))) {
            return null;
        }
        return c21825M48586;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC4500 m14387(C11867 c11867, final AbstractC23903 abstractC23903) {
        if (!c11867.f75167.f53222.mo2877()) {
            return EnumC4500.NONE;
        }
        C21825 c21825M14388 = m14388(c11867.f75167.f53222);
        if (c21825M14388 == null) {
            return EnumC4500.DECLARATION;
        }
        return (EnumC4500) C9030.stream(c21825M14388).map(new Function() { // from class: l.᩻ۤۤ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C4277.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                EnumC10477 enumC10477;
                C5206 c5206 = this.f76556;
                c5206.getClass();
                C6263 c6263 = ((C5516) ((AbstractC23156) obj)).f18928;
                AbstractC11242 abstractC11242 = c6263.f77453;
                C23942 c23942 = c5206.f18043;
                AbstractC11242 abstractC11243 = c23942.f77634;
                AbstractC23903 abstractC23904 = abstractC23903;
                if (abstractC11242 == abstractC11243) {
                    if (abstractC23904.f77452 == EnumC10477.f35865) {
                        return EnumC4500.DECLARATION;
                    }
                } else if (abstractC11242 == c23942.f77577 || abstractC11242 == c23942.f77555) {
                    if (abstractC23904.f77452 == EnumC10477.f35878 && abstractC23904.f77448.f77452 != EnumC10477.f35879) {
                        return EnumC4500.DECLARATION;
                    }
                } else if (abstractC11242 == c23942.f77532) {
                    if (abstractC23904.f77452 == EnumC10477.f35879 && !abstractC23904.m52713()) {
                        return EnumC4500.DECLARATION;
                    }
                } else if (abstractC11242 == c23942.f77581) {
                    if (abstractC23904.f77452 == EnumC10477.f35878 && abstractC23904.f77448.f77452 == EnumC10477.f35879 && (abstractC23904.mo20276() & 8589934592L) != 0) {
                        return EnumC4500.DECLARATION;
                    }
                } else if (abstractC11242 == c23942.f77550) {
                    if (abstractC23904.f77452 == EnumC10477.f35879 && abstractC23904.m52713()) {
                        return EnumC4500.DECLARATION;
                    }
                } else if (abstractC11242 == c23942.f77569) {
                    if (abstractC23904.f77452 == EnumC10477.f35878 && abstractC23904.f77448.f77452 == EnumC10477.f35879 && (abstractC23904.mo20276() & 8589934592L) == 0) {
                        return EnumC4500.DECLARATION;
                    }
                } else if (abstractC11242 == c23942.f77554) {
                    if (abstractC23904.f77452 == EnumC10477.f35865 && (abstractC23904.mo20276() & 8192) != 0) {
                        return EnumC4500.DECLARATION;
                    }
                } else if (abstractC11242 == c23942.f77540) {
                    if (abstractC23904.f77452 == EnumC10477.f35867) {
                        return EnumC4500.DECLARATION;
                    }
                } else if (abstractC11242 == c23942.f77585) {
                    EnumC10477 enumC10478 = abstractC23904.f77452;
                    if (enumC10478 == EnumC10477.f35865 || enumC10478 == EnumC10477.f35878 || ((enumC10478 == (enumC10477 = EnumC10477.f35879) && !abstractC23904.m52713() && !abstractC23904.f77449.mo16235().m39001(EnumC6617.VOID)) || (abstractC23904.f77452 == enumC10477 && abstractC23904.m52713()))) {
                        return EnumC4500.TYPE;
                    }
                } else if (abstractC11242 != c23942.f77578) {
                    if (abstractC11242 != c23942.f77618) {
                        C6171.m17174("annotationTargetType(): unrecognized Attribute name " + ((Object) c6263.f77453) + " (" + c6263.f77453.getClass() + MotionUtils.EASING_TYPE_FORMAT_END);
                        throw null;
                    }
                    if (abstractC23904.f77452 == EnumC10477.f35868) {
                        return EnumC4500.DECLARATION;
                    }
                }
                return EnumC4500.NONE;
            }
        }).reduce(EnumC4500.NONE, new BinaryOperator() { // from class: l.ܳۤۤ
            public /* synthetic */ BiFunction andThen(Function function) {
                return C5689.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                EnumC4500 enumC4500 = (EnumC4500) obj;
                EnumC4500 enumC4501 = (EnumC4500) obj2;
                this.f47432.getClass();
                EnumC4500 enumC4502 = EnumC4500.NONE;
                if (enumC4500 == enumC4502) {
                    return enumC4501;
                }
                return (enumC4501 == enumC4502 || enumC4500 == enumC4501) ? enumC4500 : EnumC4500.BOTH;
            }
        });
    }
}
