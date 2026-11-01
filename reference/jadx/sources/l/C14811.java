package l;

import android.content.DialogInterface;
import android.widget.Spinner;
import bin.mt.plus.R;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ܳ᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes4.dex */
public final class C14811 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC3520 f48419;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f48420;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f48421;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f48422;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f48423;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f48424;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f48425 = new ArrayList();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f48426;

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
    }

    public C14811(ViewOnClickListenerC3520 viewOnClickListenerC3520, AbstractActivityC12483 abstractActivityC12483, Spinner spinner, String str, ArrayList arrayList, String str2, boolean z) {
        this.f48419 = viewOnClickListenerC3520;
        this.f48422 = abstractActivityC12483;
        this.f48421 = spinner;
        this.f48424 = str;
        this.f48426 = arrayList;
        this.f48423 = str2;
        this.f48420 = z;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f48422, R.string.MT_Protector);
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
        String string;
        ViewOnClickListenerC3520 viewOnClickListenerC3520 = this.f48419;
        C3947 c3947 = new C3947((AbstractActivityC12483) viewOnClickListenerC3520.requireActivity());
        String str = (String) viewOnClickListenerC3520.f12880.m16569().get(Math.max(0, this.f48421.getSelectedItemPosition()));
        try {
            C2455 c2455M7448 = C2455.m7448(C5553.m15313(this.f48424, new String[0]), (byte[]) null);
            try {
                viewOnClickListenerC3520.f12880.m16548(false);
                for (C12107 c12107 : this.f48426) {
                    String strM15307 = C5553.m15307(c12107.getName(), false);
                    String strSubstring = strM15307.substring(0, strM15307.length() - 6);
                    this.f12806.m40698(viewOnClickListenerC3520.getString(R.string.MT_Protector, strSubstring));
                    String str2 = this.f48423 + strSubstring;
                    String strM45297 = C20010.m45297(c2455M7448.m7471(c12107), StandardCharsets.UTF_8);
                    boolean zM16563 = viewOnClickListenerC3520.f12880.m16563(str2);
                    ArrayList arrayList = this.f48425;
                    if (zM16563) {
                        if (c3947.mo11428()) {
                            c3947.m11429(str2);
                            if (c3947.mo2357()) {
                                break;
                            }
                        }
                        int iMo11431 = c3947.mo11431();
                        if (iMo11431 == 0) {
                            viewOnClickListenerC3520.f12880.m16533(str2, strM45297);
                            arrayList.add(str2);
                        } else if (iMo11431 == 2) {
                            int i = 1;
                            do {
                                StringBuilder sb = new StringBuilder();
                                sb.append(str2);
                                i++;
                                sb.append(i);
                                string = sb.toString();
                            } while (viewOnClickListenerC3520.f12880.m16563(string));
                            viewOnClickListenerC3520.f12880.m16534(str, string, strM45297);
                            arrayList.add(string);
                        }
                    } else {
                        viewOnClickListenerC3520.f12880.m16534(str, str2, strM45297);
                        arrayList.add(str2);
                    }
                }
                c2455M7448.close();
                viewOnClickListenerC3520.f12880.m16548(true);
            } catch (Throwable th) {
                try {
                    c2455M7448.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            viewOnClickListenerC3520.f12880.m16548(true);
            throw th3;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f48422.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        ArrayList arrayList = this.f48425;
        if (!arrayList.isEmpty()) {
            ViewOnClickListenerC3520 viewOnClickListenerC3520 = this.f48419;
            viewOnClickListenerC3520.m10378();
            viewOnClickListenerC3520.f12888.m24998((Collection) arrayList);
        }
        this.f12806.m40694();
        if (this.f48420) {
            C5553.m15313(this.f48424, new String[0]).mo24647();
        }
    }
}
