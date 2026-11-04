package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Q649 */
/* JADX INFO: loaded from: classes.dex */
public final class C24438 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC4300 f79349;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11555 f79350;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f79351;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f79352;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C15508 f79353;

    public C24438(ActivityC4300 activityC4300, String str) {
        this.f79349 = activityC4300;
        this.f79351 = str;
        this.f79350 = C11555.m29068(activityC4300);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        ActivityC4300 activityC4300 = this.f79349;
        this.f79353 = activityC4300.f15593.m54021().mo15337();
        this.f79352 = activityC4300.f15593.m54047();
        m8191(activityC4300, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C15508 c15508 = this.f79353;
        try {
            C0681.m2967(C14584.m35193(this.f79351, new String[0]), c15508, this.f79352, C2448.f7850);
            if (c15508 != null) {
                c15508.close();
            }
        } catch (Throwable th) {
            if (c15508 != null) {
                try {
                    c15508.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
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
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        ActivityC4300 activityC4300 = this.f79349;
        boolean zIsEmpty = TextUtils.isEmpty(activityC4300.f15598);
        final String str = this.f79351;
        if (!zIsEmpty) {
            activityC4300.f15598 = str;
        } else {
            activityC4300.f15594 = C11293.m28556(str);
            ApplicationC17729.f58258.edit().putString("text_viewer_save_as_path", activityC4300.f15594);
        }
        if (this.f79350.m29071()) {
            String string = activityC4300.getString(R.string.MT_Protector, str);
            int i = DialogInterfaceC8327.f27315;
            C2361 c2361 = new C2361(activityC4300);
            c2361.m8021(R.string.MT_Protector);
            c2361.m8008(string);
            c2361.m8026(R.string.MT_Protector, null);
            if (activityC4300.f15595) {
                c2361.m8018(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۛܽ᩸
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        Main.m54(this.f21973.f79349, str);
                    }
                });
            }
            c2361.m8016();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f79350.m29071()) {
            this.f79349.m40401(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C15508 c15508 = this.f79353;
        if (c15508 != null) {
            c15508.close();
        }
        m8196();
    }
}
