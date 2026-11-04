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

/* JADX INFO: renamed from: l.ۙ۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8Q4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4914 {

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final ExecutorC15419 f17150 = new ExecutorC15419();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SparseArray f17151;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f17152;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14814 f17153;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f17154;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C15648 f17155;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Pair f17156;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f17157;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0142 f17158;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC4879 f17159;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f17160;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f17161;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f17162;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C10098 f17163 = new C10098();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f17164;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public InterfaceC19830 f17165;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Context f17166;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC7897 f17167;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f17168;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArraySet f17169;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15069(Surface surface, int i, int i2) {
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ InterfaceC7600 m15083(C4914 c4914) {
        c4914.getClass();
        return null;
    }

    public C4914(C19149 c19149) {
        this.f17166 = c19149.f61971;
        InterfaceC0142 interfaceC0142 = c19149.f61972;
        C20782.m47566(interfaceC0142);
        this.f17158 = interfaceC0142;
        this.f17151 = new SparseArray();
        AbstractC1928.of();
        this.f17164 = c19149.f61975;
        InterfaceC14814 interfaceC14814 = c19149.f61974;
        this.f17153 = interfaceC14814;
        this.f17167 = new C17657(c19149.f61973, interfaceC14814);
        this.f17169 = new CopyOnWriteArraySet();
        this.f17155 = new C20124().m46295();
        this.f17157 = -9223372036854775807L;
        this.f17160 = -9223372036854775807L;
        this.f17152 = -1;
        this.f17168 = 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m15099() {
        this.f17152 = 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC7897 m15098() {
        SparseArray sparseArray = this.f17151;
        if (C7116.m19487(sparseArray, 0)) {
            return (InterfaceC7897) sparseArray.get(0);
        }
        C1250 c1250 = new C1250(this, this.f17166);
        this.f17169.add(c1250);
        sparseArray.put(0, c1250);
        return c1250;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15094(Surface surface, C18303 c18303) {
        Pair pair = this.f17156;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C18303) this.f17156.second).equals(c18303)) {
            return;
        }
        this.f17156 = Pair.create(surface, c18303);
        m15069(surface, c18303.m42689(), c18303.m42688());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15093() {
        C18303 c18303 = C18303.f59691;
        m15069((Surface) null, c18303.m42689(), c18303.m42688());
        this.f17156 = null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m15097() {
        ((C17657) this.f17167).mo4522();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m15096() {
        ((C17657) this.f17167).mo4504();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m15095() {
        if (this.f17168 == 2) {
            return;
        }
        InterfaceC4879 interfaceC4879 = this.f17159;
        if (interfaceC4879 != null) {
            interfaceC4879.mo14970();
        }
        this.f17156 = null;
        this.f17168 = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [l.۟ܳ᩷] */
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
    public static boolean m15078(C4914 c4914, C15648 c15648) throws C0439 {
        InterfaceC7897 interfaceC7897 = c4914.f17167;
        C20782.m47568(c4914.f17168 == 0);
        C1259 c1259M26329 = c15648.f50832;
        if (c1259M26329 == null || !c1259M26329.m4564()) {
            c1259M26329 = C1259.f4534;
        }
        try {
            int i = c1259M26329.f4541;
            if (i == 7 && Build.VERSION.SDK_INT < 34 && C7357.m20181()) {
                C10207 c10207M4562 = c1259M26329.m4562();
                c10207M4562.m26335(6);
                c1259M26329 = c10207M4562.m26329();
            } else if (!C7357.m20177(i) && Build.VERSION.SDK_INT >= 29) {
                Locale locale = Locale.US;
                C1896.m6517("Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
                c1259M26329 = C1259.f4534;
            }
            InterfaceC14814 interfaceC14814 = c4914.f17153;
            Looper looperMyLooper = Looper.myLooper();
            C20782.m47566(looperMyLooper);
            final InterfaceC4879 interfaceC4879Mo2209 = interfaceC14814.mo2209(looperMyLooper, null);
            c4914.f17159 = interfaceC4879Mo2209;
            c4914.f17158.mo1300(c4914.f17166, c1259M26329, c4914, new Executor() { // from class: l.۟ܳ᩷
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    interfaceC4879Mo2209.mo14966(runnable);
                }
            }).m20767();
            throw null;
        } catch (C8848 e) {
            throw new C0439(e, c15648);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m15090(C4914 c4914, boolean z) {
        return ((C17657) c4914.f17167).mo4518(z && c4914.f17162 == 0);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static void m15086(C4914 c4914) {
        ((C17657) c4914.f17167).mo4523();
        c4914.f17154 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m15082(C4914 c4914) {
        return c4914.f17162 == 0 && c4914.f17154 && ((C17657) c4914.f17167).mo4527();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15074(C4914 c4914, long j, long j2) {
        ((C17657) c4914.f17167).mo4509(j, j2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15077(C4914 c4914, boolean z) {
        InterfaceC7897 interfaceC7897 = c4914.f17167;
        if (c4914.f17168 == 1) {
            c4914.f17162++;
            C17657 c17657 = (C17657) interfaceC7897;
            c17657.mo4526(z);
            while (c4914.f17163.m26056() > 1) {
                c4914.f17163.m26057();
            }
            if (c4914.f17163.m26056() == 1) {
                C13927 c13927 = (C13927) c4914.f17163.m26057();
                c13927.getClass();
                c17657.mo4512(c4914.f17155, c13927.f44158, c13927.f44157, AbstractC1928.of());
            }
            c4914.f17157 = -9223372036854775807L;
            c4914.f17160 = -9223372036854775807L;
            c4914.f17154 = false;
            InterfaceC4879 interfaceC4879 = c4914.f17159;
            C20782.m47566(interfaceC4879);
            interfaceC4879.mo14966(new RunnableC4783(1, c4914));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15070(C4914 c4914) {
        c4914.f17162--;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m15081(C4914 c4914, boolean z) {
        ((C17657) c4914.f17167).mo4521(z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15068(C4914 c4914) {
        ((C17657) c4914.f17167).mo4519();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15076(C4914 c4914, InterfaceC19830 interfaceC19830) {
        c4914.f17165 = interfaceC19830;
        ((C17657) c4914.f17167).mo4514(interfaceC19830);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15071(C4914 c4914, float f) {
        ((C17657) c4914.f17167).mo4506(f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15072(C4914 c4914, int i) {
        ((C17657) c4914.f17167).mo4507(i);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m15092(C4914 c4914) {
        int i = c4914.f17152;
        return i != -1 && i == c4914.f17161;
    }
}
