package l;

import bin.mt.plus.R;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۧܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes4.dex */
public final class C11747 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f37983;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f37984;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC20698 f37986;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f37987 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f37985 = 0;

    public C11747(ViewOnClickListenerC20698 viewOnClickListenerC20698, AbstractActivityC17204 abstractActivityC17204, String str) {
        this.f37986 = viewOnClickListenerC20698;
        this.f37984 = abstractActivityC17204;
        this.f37983 = str;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8190(this.f37984);
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
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        ViewOnClickListenerC20698 viewOnClickListenerC20698 = this.f37986;
        C11378 c11378 = new C11378(this.f37984);
        c11378.m28701();
        try {
            C22941 c22941 = new C22941(this.f37983);
            try {
                viewOnClickListenerC20698.f66350.m29984(false);
                ArrayList<C8002> arrayListM51740 = c22941.m51740();
                for (C8002 c8002 : arrayListM51740) {
                    C14584.m35187(c8002.getName(), c8002.isDirectory());
                }
                for (C8002 c8003 : arrayListM51740) {
                    if (!c8003.isDirectory() && c8003.getName().toLowerCase().endsWith(".xml")) {
                        this.f37985++;
                        String strM35187 = C14584.m35187(c8003.getName(), false);
                        String strSubstring = strM35187.substring(0, strM35187.length() - 4);
                        this.f7780.m33189(viewOnClickListenerC20698.getString(R.string.MT_Protector, strSubstring));
                        String strM15490 = C5125.m15490(c22941.m51727(c8003), StandardCharsets.UTF_8);
                        try {
                            C22145.m50102(strM15490);
                            boolean zM30009 = viewOnClickListenerC20698.f66350.m30009(strSubstring);
                            ArrayList arrayList = this.f37987;
                            if (zM30009) {
                                if (c11378.mo28694()) {
                                    c11378.m28699(strSubstring);
                                    if (c11378.mo924()) {
                                        break;
                                    }
                                }
                                int iMo28700 = c11378.mo28700();
                                if (iMo28700 == 0) {
                                    viewOnClickListenerC20698.f66350.m30006(strSubstring, strM15490);
                                    arrayList.add(strSubstring);
                                } else if (iMo28700 == 2) {
                                    throw new RuntimeException();
                                }
                            } else {
                                viewOnClickListenerC20698.f66350.m29973(strSubstring, strM15490);
                                arrayList.add(strSubstring);
                            }
                        } catch (Exception e) {
                            throw new Exception("Parse xml failed: " + c8003.getName(), e);
                        }
                    }
                }
                c22941.close();
                viewOnClickListenerC20698.f66350.m29984(true);
            } catch (Throwable th) {
                try {
                    c22941.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            viewOnClickListenerC20698.f66350.m29984(true);
            throw th3;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f37985 == 0) {
            C22673.m51159(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f37986.f66353.m51299(exc);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        ArrayList arrayList = this.f37987;
        if (!arrayList.isEmpty()) {
            ViewOnClickListenerC20698 viewOnClickListenerC20698 = this.f37986;
            viewOnClickListenerC20698.m47363();
            viewOnClickListenerC20698.f66349.m35940((Collection) arrayList);
        }
        m8196();
    }
}
