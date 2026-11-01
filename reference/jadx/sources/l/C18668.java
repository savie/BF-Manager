package l;

import bin.mt.plus.R;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ᩴۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes5.dex */
public final class C18668 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC15847 f60597;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f60598;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f60600;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f60601 = new ArrayList();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f60599 = 0;

    public C18668(ViewOnClickListenerC15847 viewOnClickListenerC15847, AbstractActivityC12483 abstractActivityC12483, String str) {
        this.f60597 = viewOnClickListenerC15847;
        this.f60600 = abstractActivityC12483;
        this.f60598 = str;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10245(this.f60600);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
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
        ViewOnClickListenerC15847 viewOnClickListenerC15847 = this.f60597;
        C3947 c3947 = new C3947(this.f60600);
        c3947.m11426();
        try {
            C2455 c2455 = new C2455(this.f60598);
            try {
                viewOnClickListenerC15847.f51287.m21587(false);
                ArrayList<C12107> arrayListM7489 = c2455.m7489();
                for (C12107 c12107 : arrayListM7489) {
                    C5553.m15307(c12107.getName(), c12107.isDirectory());
                }
                for (C12107 c12108 : arrayListM7489) {
                    if (!c12108.isDirectory() && c12108.getName().toLowerCase().endsWith(".xml")) {
                        this.f60599++;
                        String strM15307 = C5553.m15307(c12108.getName(), false);
                        String strSubstring = strM15307.substring(0, strM15307.length() - 4);
                        this.f12806.m40698(viewOnClickListenerC15847.getString(R.string.MT_Protector, strSubstring));
                        String strM45297 = C20010.m45297(c2455.m7471(c12108), StandardCharsets.UTF_8);
                        try {
                            C4105.m11650(strM45297);
                            boolean zM21609 = viewOnClickListenerC15847.f51287.m21609(strSubstring);
                            ArrayList arrayList = this.f60601;
                            if (zM21609) {
                                if (c3947.mo11428()) {
                                    c3947.m11429(strSubstring);
                                    if (c3947.mo2357()) {
                                        break;
                                    }
                                }
                                int iMo11431 = c3947.mo11431();
                                if (iMo11431 == 0) {
                                    viewOnClickListenerC15847.f51287.m21571(strSubstring, strM45297);
                                    arrayList.add(strSubstring);
                                } else if (iMo11431 == 2) {
                                    throw new RuntimeException();
                                }
                            } else {
                                viewOnClickListenerC15847.f51287.m21576(strSubstring, strM45297);
                                arrayList.add(strSubstring);
                            }
                        } catch (Exception e) {
                            throw new Exception("Parse xml failed: " + c12108.getName(), e);
                        }
                    }
                }
                c2455.close();
                viewOnClickListenerC15847.f51287.m21587(true);
            } catch (Throwable th) {
                try {
                    c2455.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            viewOnClickListenerC15847.f51287.m21587(true);
            throw th3;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f60599 == 0) {
            C15829.m37618(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f60597.f51295.m42627((Throwable) exc);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        ArrayList arrayList = this.f60601;
        if (!arrayList.isEmpty()) {
            ViewOnClickListenerC15847 viewOnClickListenerC15847 = this.f60597;
            viewOnClickListenerC15847.m37734();
            viewOnClickListenerC15847.f51297.m24998((Collection) arrayList);
        }
        m10251();
    }
}
