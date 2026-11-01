package l;

import android.content.ClipboardManager;
import android.content.Context;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܳܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes4.dex */
public final class C14582 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f47709;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Context f47710;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13026 f47711;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f47712;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2213 f47713;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C11690 f47714;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f47715;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C6750 f47716;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22198 f47717;

    public C14582(C2213 c2213, AbstractActivityC12483 abstractActivityC12483, C22198 c22198, C13026 c13026, int i, Context context) {
        this.f47713 = c2213;
        this.f47712 = abstractActivityC12483;
        this.f47717 = c22198;
        this.f47711 = c13026;
        this.f47715 = i;
        this.f47710 = context;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        this.f47714 = this.f47713.f7977.m7806();
        AbstractActivityC12483 abstractActivityC12483 = this.f47712;
        if (abstractActivityC12483 != null) {
            m10248(abstractActivityC12483, R.string.MT_Protector, 200, new Runnable() { // from class: l.᩻ܳۚ
                @Override // java.lang.Runnable
                public final void run() {
                    C14582.m35057(this.f76859);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m35057(C14582 c14582) {
        c14582.f12806.m40697((Runnable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean m35056() {
        if (this.f47717.m49255()) {
            return true;
        }
        C17485 c17485 = this.f12806;
        if (c17485 != null && c17485.m40693()) {
            return true;
        }
        AbstractActivityC12483 abstractActivityC12483 = this.f47712;
        return (abstractActivityC12483 != null && (abstractActivityC12483.isFinishing() || abstractActivityC12483.isDestroyed())) || !this.f47713.m6829(this.f47711);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ۧܳۚ] */
    /* JADX WARN: Type inference failed for: r5v0, types: [l.ۧܳۚ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        int i = this.f47715;
        C2213 c2213 = this.f47713;
        try {
            C6750 c6750M29188 = this.f47714.m29188(c2213.f7978, c2213.f7975, new InterfaceC5614() { // from class: l.ۧܳۚ
                @Override // l.InterfaceC5614
                /* JADX INFO: renamed from: ֨ */
                public final boolean mo2357() {
                    return this.f37541.m35056();
                }
            });
            this.f47716 = c6750M29188;
            String strM17633 = C6447.m17633(c6750M29188, c2213.f7974, i, new InterfaceC5614() { // from class: l.ۧܳۚ
                @Override // l.InterfaceC5614
                /* JADX INFO: renamed from: ֨ */
                public final boolean mo2357() {
                    return this.f37541.m35056();
                }
            });
            this.f47709 = strM17633;
            if (strM17633.length() > 524288 && i < 5) {
                throw new C5036();
            }
        } finally {
            C11690 c11690 = this.f47714;
            if (c11690 != null) {
                c11690.close();
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (m35056()) {
            return;
        }
        if (C6447.m17635(this.f47711, this.f47713, this.f47712)) {
            ((ClipboardManager) this.f47710.getSystemService("clipboard")).setText(this.f47709);
            C15829.m37611(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (m35056() || (exc instanceof C11387)) {
            return;
        }
        boolean z = exc instanceof C5036;
        AbstractActivityC12483 abstractActivityC12483 = this.f47712;
        C2213 c2213 = this.f47713;
        C13026 c13026 = this.f47711;
        if (z) {
            if (C6447.m17635(c13026, c2213, abstractActivityC12483)) {
                C15829.m37611(R.string.MT_Protector);
            }
        } else if (exc instanceof IOException) {
            if (C6447.m17635(c13026, c2213, abstractActivityC12483)) {
                c13026.m32228((IOException) exc);
            }
        } else if (C6447.m17635(c13026, c2213, abstractActivityC12483)) {
            C15829.m37611(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C11690 c11690 = this.f47714;
        if (c11690 != null) {
            c11690.close();
        }
        C6750 c6750 = this.f47716;
        if (c6750 != null) {
            try {
                c6750.close();
            } catch (IOException unused) {
            }
        }
        this.f47717.close();
        m10251();
    }
}
