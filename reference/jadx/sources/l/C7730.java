package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟᩸ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q649 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7730 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f25554;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21135 f25555;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f25556;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C23229 f25557;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C3329 f25558;

    public C7730(ActivityC21135 activityC21135, String str) {
        this.f25555 = activityC21135;
        this.f25556 = str;
        this.f25557 = C23229.m51233(activityC21135);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        ActivityC21135 activityC21135 = this.f25555;
        this.f25558 = activityC21135.f68829.m17000().mo2398();
        this.f25554 = activityC21135.f68829.m17042();
        m10246(activityC21135, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C3329 c3329 = this.f25558;
        try {
            C10386.m26283(C5553.m15313(this.f25556, new String[0]), c3329, this.f25554, C22037.f71424);
            if (c3329 != null) {
                c3329.close();
            }
        } catch (Throwable th) {
            if (c3329 != null) {
                try {
                    c3329.close();
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
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        ActivityC21135 activityC21135 = this.f25555;
        boolean zIsEmpty = TextUtils.isEmpty(activityC21135.f68832);
        final String str = this.f25556;
        if (!zIsEmpty) {
            activityC21135.f68832 = str;
        } else {
            activityC21135.f68828 = C6730.m18172(str);
            ApplicationC0716.f2992.edit().putString("text_viewer_save_as_path", activityC21135.f68828);
        }
        if (this.f25557.m51236()) {
            String string = activityC21135.getString(R.string.MT_Protector, str);
            int i = DialogInterfaceC19356.f62401;
            C8067 c8067 = new C8067(activityC21135);
            c8067.m21274(R.string.MT_Protector);
            c8067.m21261(string);
            c8067.m21251(R.string.MT_Protector, null);
            if (activityC21135.f68830) {
                c8067.m21271(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۤ᩸ۖ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        Main.m67(this.f36135.f25555, str);
                    }
                });
            }
            c8067.m21269();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f25557.m51236()) {
            this.f25555.m31002(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C3329 c3329 = this.f25558;
        if (c3329 != null) {
            c3329.close();
        }
        m10251();
    }
}
