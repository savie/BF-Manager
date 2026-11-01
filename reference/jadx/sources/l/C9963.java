package l;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۤ֨ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8Q4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9963 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final ExecutorC16229 f34039 = new ExecutorC16229();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC8065 f34040;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13136 f34041;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final SparseArray f34042;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11593 f34043;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f34044;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f34045;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f34046;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22486 f34047;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C7648 f34048;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Pair f34049;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f34050;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Context f34051;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f34052;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f34053;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f34054;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public InterfaceC19841 f34055;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C3871 f34056 = new C3871();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f34057;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArraySet f34058;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ InterfaceC1318 m25194(C9963 c9963) {
        c9963.getClass();
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m25198(Surface surface, int i, int i2) {
    }

    public C9963(C3611 c3611) {
        this.f34051 = c3611.f13269;
        InterfaceC22486 interfaceC22486 = c3611.f13271;
        C2023.m6508(interfaceC22486);
        this.f34047 = interfaceC22486;
        this.f34042 = new SparseArray();
        AbstractC22433.of();
        this.f34044 = c3611.f13266;
        InterfaceC11593 interfaceC11593 = c3611.f13270;
        this.f34043 = interfaceC11593;
        this.f34041 = new C11290(c3611.f13268, interfaceC11593);
        this.f34058 = new CopyOnWriteArraySet();
        this.f34048 = new C10471().m26497();
        this.f34045 = -9223372036854775807L;
        this.f34057 = -9223372036854775807L;
        this.f34046 = -1;
        this.f34054 = 0;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m25219() {
        this.f34046 = 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13136 m25224() {
        SparseArray sparseArray = this.f34042;
        if (C17983.m41840(sparseArray, 0)) {
            return (InterfaceC13136) sparseArray.get(0);
        }
        C21251 c21251 = new C21251(this, this.f34051);
        this.f34058.add(c21251);
        sparseArray.put(0, c21251);
        return c21251;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25221(Surface surface, C5283 c5283) {
        Pair pair = this.f34049;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C5283) this.f34049.second).equals(c5283)) {
            return;
        }
        this.f34049 = Pair.create(surface, c5283);
        m25198(surface, c5283.m14575(), c5283.m14574());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25220() {
        C5283 c5283 = C5283.f18286;
        m25198((Surface) null, c5283.m14575(), c5283.m14574());
        this.f34049 = null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m25222() {
        ((C11290) this.f34041).mo28297();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m25225() {
        ((C11290) this.f34041).mo28282();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m25223() {
        if (this.f34054 == 2) {
            return;
        }
        InterfaceC8065 interfaceC8065 = this.f34040;
        if (interfaceC8065 != null) {
            interfaceC8065.mo21247();
        }
        this.f34049 = null;
        this.f34054 = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [l.۬֨ܰ] */
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
    public static boolean m25207(C9963 c9963, C7648 c7648) throws C1140 {
        InterfaceC13136 interfaceC13136 = c9963.f34041;
        C2023.m6510(c9963.f34054 == 0);
        C4119 c4119M32773 = c7648.f25239;
        if (c4119M32773 == null || !c4119M32773.m11708()) {
            c4119M32773 = C4119.f15082;
        }
        try {
            int i = c4119M32773.f15084;
            if (i == 7 && Build.VERSION.SDK_INT < 34 && C17942.m41768()) {
                C13293 c13293M11706 = c4119M32773.m11706();
                c13293M11706.m32772(6);
                c4119M32773 = c13293M11706.m32773();
            } else if (!C17942.m41764(i) && Build.VERSION.SDK_INT >= 29) {
                Locale locale = Locale.US;
                C0303.m1848("Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                c4119M32773 = C4119.f15082;
            }
            InterfaceC11593 interfaceC11593 = c9963.f34043;
            Looper looperMyLooper = Looper.myLooper();
            C2023.m6508(looperMyLooper);
            final InterfaceC8065 interfaceC8065Mo28887 = interfaceC11593.mo28887(looperMyLooper, null);
            c9963.f34040 = interfaceC8065Mo28887;
            c9963.f34047.mo43961(c9963.f34051, c4119M32773, c9963, new Executor() { // from class: l.۬֨ܰ
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    interfaceC8065Mo28887.mo21243(runnable);
                }
            }).m4714();
            throw null;
        } catch (C21470 e) {
            throw new C1140(e, c7648);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m25215(C9963 c9963, boolean z) {
        return ((C11290) c9963.f34041).mo28295(z && c9963.f34052 == 0);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static void m25216(C9963 c9963) {
        ((C11290) c9963.f34041).mo28280();
        c9963.f34050 = true;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m25209(C9963 c9963) {
        return c9963.f34052 == 0 && c9963.f34050 && ((C11290) c9963.f34041).mo28301();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25203(C9963 c9963, long j, long j2) {
        ((C11290) c9963.f34041).mo28287(j, j2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25206(C9963 c9963, boolean z) {
        InterfaceC13136 interfaceC13136 = c9963.f34041;
        if (c9963.f34054 == 1) {
            c9963.f34052++;
            C11290 c11290 = (C11290) interfaceC13136;
            c11290.mo28300(z);
            while (c9963.f34056.m11202() > 1) {
                c9963.f34056.m11203();
            }
            if (c9963.f34056.m11202() == 1) {
                C8552 c8552 = (C8552) c9963.f34056.m11203();
                c8552.getClass();
                c11290.mo28291(c9963.f34048, c8552.f29582, c8552.f29581, AbstractC22433.of());
            }
            c9963.f34045 = -9223372036854775807L;
            c9963.f34057 = -9223372036854775807L;
            c9963.f34050 = false;
            InterfaceC8065 interfaceC8065 = c9963.f34040;
            C2023.m6508(interfaceC8065);
            interfaceC8065.mo21243(new RunnableC3787(1, c9963));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25199(C9963 c9963) {
        c9963.f34052--;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m25211(C9963 c9963, boolean z) {
        ((C11290) c9963.f34041).mo28298(z);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m25197(C9963 c9963) {
        ((C11290) c9963.f34041).mo28299();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25205(C9963 c9963, InterfaceC19841 interfaceC19841) {
        c9963.f34055 = interfaceC19841;
        ((C11290) c9963.f34041).mo28292(interfaceC19841);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25200(C9963 c9963, float f) {
        ((C11290) c9963.f34041).mo28284(f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25201(C9963 c9963, int i) {
        ((C11290) c9963.f34041).mo28285(i);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static boolean m25218(C9963 c9963) {
        int i = c9963.f34046;
        return i != -1 && i == c9963.f34053;
    }
}
