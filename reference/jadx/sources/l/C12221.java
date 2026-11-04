package l;

import com.google.android.material.motion.MotionUtils;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۨ۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12221 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C13477 f39264 = new C13477();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11518 f39265;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C7312 f39266;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0310 f39267;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C15252 f39268;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12221 m30493(C4747 c4747) {
        C12221 c12221 = (C12221) c4747.m14643(f39264);
        return c12221 == null ? new C12221(c4747) : c12221;
    }

    public C12221(C4747 c4747) {
        c4747.m14646(f39264, this);
        this.f39268 = C15252.m36599(c4747);
        this.f39266 = C7312.m20023(c4747);
        C14764.m35506(c4747);
        this.f39265 = C11518.m28979(c4747);
        this.f39267 = C0310.m1899(c4747);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.ܺ۟᩺] */
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
    public final void m30496(final C3168 c3168, final C7926 c7926) {
        this.f39265.m28999((RunnableC16696) new Runnable() { // from class: l.ܺ۟᩺
            @Override // java.lang.Runnable
            public final void run() {
                C7926 c7927 = c7926;
                C12221 c12221 = this.f53940;
                C7312 c7312 = c12221.f39266;
                InterfaceC15976 interfaceC15976M34530 = c7312.m34530(c3168.f10275.f61856);
                try {
                    new C20426(c12221, true).mo5474(c7927);
                } finally {
                    c7312.m34530(interfaceC15976M34530);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30498(final C3168 c3168, final C7926 c7926) {
        this.f39265.m29005(new Runnable() { // from class: l.᩻۟᩺
            @Override // java.lang.Runnable
            public final void run() {
                C7926 c7927 = c7926;
                C12221 c12221 = this.f80579;
                C7312 c7312 = c12221.f39266;
                InterfaceC15976 interfaceC15976M34530 = c7312.m34530(c3168.f10275.f61856);
                try {
                    c12221.f39267.m1950((AbstractC8036) c7927, true);
                } finally {
                    c7312.m34530(interfaceC15976M34530);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30497(C7926 c7926) {
        new C20426(this, false).mo5474(c7926);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m30494(AbstractC22970 abstractC22970) {
        C23892 c23892Mo45423 = abstractC22970.mo51845().mo45423();
        if (c23892Mo45423 == null) {
            return null;
        }
        AbstractC21654 abstractC21654M53392 = c23892Mo45423.m53392(this.f39268.f49766);
        if (!(abstractC21654M53392 instanceof C17924)) {
            return null;
        }
        C14769 c14769M35542 = C14769.m35542((Object[]) ((C17924) abstractC21654M53392).f58709);
        if (C1170.stream(c14769M35542).anyMatch(new C18214(2))) {
            return null;
        }
        return c14769M35542;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC15950 m30495(C23892 c23892, final AbstractC11781 abstractC11781) {
        if (!c23892.f69124.f73596.mo51844()) {
            return EnumC15950.NONE;
        }
        C14769 c14769M30494 = m30494(c23892.f69124.f73596);
        if (c14769M30494 == null) {
            return EnumC15950.DECLARATION;
        }
        return (EnumC15950) C1170.stream(c14769M30494).map(new Function() { // from class: l.֫۟᩺
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                EnumC13603 enumC13603;
                C12221 c12221 = this.f6085;
                c12221.getClass();
                C5816 c5816 = ((C20908) ((AbstractC21654) obj)).f66917;
                AbstractC19728 abstractC19728 = c5816.f38072;
                C15252 c15252 = c12221.f39268;
                AbstractC19728 abstractC19729 = c15252.f49847;
                AbstractC11781 abstractC11782 = abstractC11781;
                if (abstractC19728 == abstractC19729) {
                    if (abstractC11782.f38066 == EnumC13603.f43213) {
                        return EnumC15950.DECLARATION;
                    }
                } else if (abstractC19728 == c15252.f49804 || abstractC19728 == c15252.f49769) {
                    if (abstractC11782.f38066 == EnumC13603.f43205 && abstractC11782.f38069.f38066 != EnumC13603.f43218) {
                        return EnumC15950.DECLARATION;
                    }
                } else if (abstractC19728 == c15252.f49835) {
                    if (abstractC11782.f38066 == EnumC13603.f43218 && !abstractC11782.m29570()) {
                        return EnumC15950.DECLARATION;
                    }
                } else if (abstractC19728 == c15252.f49780) {
                    if (abstractC11782.f38066 == EnumC13603.f43205 && abstractC11782.f38069.f38066 == EnumC13603.f43218 && (abstractC11782.mo29591() & 8589934592L) != 0) {
                        return EnumC15950.DECLARATION;
                    }
                } else if (abstractC19728 == c15252.f49753) {
                    if (abstractC11782.f38066 == EnumC13603.f43218 && abstractC11782.m29570()) {
                        return EnumC15950.DECLARATION;
                    }
                } else if (abstractC19728 == c15252.f49866) {
                    if (abstractC11782.f38066 == EnumC13603.f43205 && abstractC11782.f38069.f38066 == EnumC13603.f43218 && (abstractC11782.mo29591() & 8589934592L) == 0) {
                        return EnumC15950.DECLARATION;
                    }
                } else if (abstractC19728 == c15252.f49768) {
                    if (abstractC11782.f38066 == EnumC13603.f43213 && (abstractC11782.mo29591() & 8192) != 0) {
                        return EnumC15950.DECLARATION;
                    }
                } else if (abstractC19728 == c15252.f49787) {
                    if (abstractC11782.f38066 == EnumC13603.f43219) {
                        return EnumC15950.DECLARATION;
                    }
                } else if (abstractC19728 == c15252.f49777) {
                    EnumC13603 enumC13604 = abstractC11782.f38066;
                    if (enumC13604 == EnumC13603.f43213 || enumC13604 == EnumC13603.f43205 || ((enumC13604 == (enumC13603 = EnumC13603.f43218) && !abstractC11782.m29570() && !abstractC11782.f38067.mo31585().m51067(EnumC21172.VOID)) || (abstractC11782.f38066 == enumC13603 && abstractC11782.m29570()))) {
                        return EnumC15950.TYPE;
                    }
                } else if (abstractC19728 != c15252.f49805) {
                    if (abstractC19728 != c15252.f49746) {
                        C11972.m30024("annotationTargetType(): unrecognized Attribute name " + ((Object) c5816.f38072) + " (" + c5816.f38072.getClass() + MotionUtils.EASING_TYPE_FORMAT_END);
                        throw null;
                    }
                    if (abstractC11782.f38066 == EnumC13603.f43214) {
                        return EnumC15950.DECLARATION;
                    }
                }
                return EnumC15950.NONE;
            }
        }).reduce(EnumC15950.NONE, new BinaryOperator() { // from class: l.ۧ۟᩺
            public /* synthetic */ BiFunction andThen(Function function) {
                return C3363.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                EnumC15950 enumC15950 = (EnumC15950) obj;
                EnumC15950 enumC15951 = (EnumC15950) obj2;
                this.f36084.getClass();
                EnumC15950 enumC15952 = EnumC15950.NONE;
                if (enumC15950 == enumC15952) {
                    return enumC15951;
                }
                return (enumC15951 == enumC15952 || enumC15950 == enumC15951) ? enumC15950 : EnumC15950.BOTH;
            }
        });
    }
}
