package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩸֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final class C22477 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f72718;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0848 f72719;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f72720;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C10745 f72721;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f72722;

    public C22477(ActivityC0848 activityC0848, boolean z, boolean z2) {
        this.f72719 = activityC0848;
        this.f72718 = z;
        this.f72720 = z2;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        ActivityC0848 activityC0848 = this.f72719;
        C10745 c10745 = new C10745(activityC0848);
        c10745.m27397(R.string.MT_Protector);
        c10745.m27393("...");
        c10745.mo25916((Runnable) null);
        c10745.mo25931();
        this.f72721 = c10745;
        c10745.m27400().setEllipsize(TextUtils.TruncateAt.START);
        if (activityC0848.f3179 != null) {
            activityC0848.f3179.m46595();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Throwable {
        ActivityC0848 activityC0848 = this.f72719;
        if (activityC0848.f3179 != null) {
            activityC0848.f3179.m46621();
            activityC0848.f3179.m46583(new C4577(this));
        }
        if (this.f72721.m27399()) {
            return;
        }
        if (activityC0848.f3181 != null) {
            if (this.f72718) {
                this.f72721.m27404("resources.arsc");
                this.f72721.m27391(R.string.MT_Protector);
                this.f72721.m27403(0);
                ArrayList arrayListM29970 = activityC0848.f3181.m29970();
                if (!arrayListM29970.isEmpty()) {
                    this.f72722 = arrayListM29970;
                    return;
                }
            }
            activityC0848.f3181.m29985(true, (InterfaceC4115) new C10542(this));
        }
        if (this.f72721.m27399()) {
            return;
        }
        this.f72721.m27403(100);
        this.f72721.m27397(R.string.MT_Protector);
        if (activityC0848.m3446() && activityC0848.m3444() != null) {
            String strM3444 = activityC0848.m3444();
            if (activityC0848.f3179 != null) {
                this.f72721.m27393("classes.dex");
                activityC0848.f3179.m46590(C14584.m35193(strM3444, new String[0]), C17423.f56646);
            }
            if (activityC0848.f3181 != null) {
                this.f72721.m27393(activityC0848.f3181.m30008());
                activityC0848.f3181.m29983(C14584.m35193(strM3444, new String[0]), C17423.f56646);
                return;
            }
            return;
        }
        if (activityC0848.f3179 != null) {
            this.f72721.m27393("classes.dex");
            activityC0848.f3179.m46601();
        }
        if (activityC0848.f3181 != null) {
            this.f72721.m27393(activityC0848.f3181.m30008());
            activityC0848.f3181.m29988();
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
        if (this.f72721.m27399() || this.f72722 != null) {
            return;
        }
        boolean z = this.f72720;
        ActivityC0848 activityC0848 = this.f72719;
        if (z) {
            activityC0848.finish();
            return;
        }
        if (activityC0848.m3446()) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        final String strMo4294 = activityC0848.f3191.m24694("out").mo4294();
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(activityC0848);
        c2361.m8021(R.string.MT_Protector);
        c2361.m8008(activityC0848.getString(R.string.MT_Protector, strMo4294));
        c2361.m8026(R.string.MT_Protector, null);
        c2361.m8018(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜۚۧ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C22477 c22477 = this.f22924;
                c22477.getClass();
                Intent intent = new Intent();
                intent.putExtra(MotionUtils.EASING_TYPE_PATH, strMo4294);
                ActivityC0848 activityC0849 = c22477.f72719;
                activityC0849.setResult(-1, intent);
                activityC0849.finish();
            }
        });
        c2361.m8016();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        ActivityC0848.m3365(this.f72719, exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        final ActivityC0848 activityC0848 = this.f72719;
        if (activityC0848.f3179 != null) {
            activityC0848.f3179.m46573();
        }
        this.f72721.m27405();
        if (this.f72722 == null || this.f72721.m27399()) {
            return;
        }
        final ArrayList<C6002> arrayList = this.f72722;
        if (arrayList.isEmpty()) {
            return;
        }
        View viewM40395 = activityC0848.m40395(R.layout.MT_Protector);
        int i = 0;
        ((TextView) viewM40395.findViewById(R.id.MT_Protector)).setText(activityC0848.getString(R.string.MT_Protector, Integer.valueOf(arrayList.size())));
        StringBuilder sb = new StringBuilder();
        ?? r8 = 0;
        for (C6002 c6002 : arrayList) {
            ?? r10 = c6002.f20531;
            if (!r10.equals(r8)) {
                if (r8 != 0) {
                    sb.append('\n');
                }
                C22121.m50078(sb, "<!-- ", (String) r10, ".xml -->\n");
                r8 = r10;
            }
            sb.append("<entry id=\"");
            sb.append(String.format(Locale.ENGLISH, "0x%08x", Integer.valueOf(c6002.f20532)));
            sb.append("\" name=\"");
            sb.append(C15830.f51497.m10291(c6002.f20534));
            sb.append("\" />\n");
            r8 = r8;
        }
        C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        c23255.m54107(true);
        c23255.mo52335((CharSequence) sb.toString().trim());
        c23255.m52294();
        C6002 c6003 = (C6002) arrayList.get(0);
        C2361 c2361BuildDialog = activityC0848.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        final boolean z = this.f72720;
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܶۚۧ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = ActivityC0848.f3169;
                new C8415(activityC0848, arrayList, z).m8197();
            }
        });
        c2361BuildDialog.m8018(R.string.MT_Protector, new DialogInterfaceOnClickListenerC23333(i, activityC0848, c6003));
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016();
    }
}
