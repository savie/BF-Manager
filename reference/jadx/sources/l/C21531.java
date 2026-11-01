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

/* JADX INFO: renamed from: l.᩸ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21531 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C1777 f69943;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f69944;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f69945;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5677 f69946;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f69947;

    public C21531(ActivityC5677 activityC5677, boolean z, boolean z2) {
        this.f69946 = activityC5677;
        this.f69944 = z;
        this.f69945 = z2;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        ActivityC5677 activityC5677 = this.f69946;
        C1777 c1777 = new C1777(activityC5677);
        c1777.m5837(R.string.MT_Protector);
        c1777.m5832("...");
        c1777.mo5828((Runnable) null);
        c1777.mo5843();
        this.f69943 = c1777;
        c1777.m5842().setEllipsize(TextUtils.TruncateAt.START);
        if (activityC5677.f19365 != null) {
            activityC5677.f19365.m16557();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws Throwable {
        ActivityC5677 activityC5677 = this.f69946;
        if (activityC5677.f19365 != null) {
            activityC5677.f19365.m16553();
            activityC5677.f19365.m16544(new C22943(this));
        }
        if (this.f69943.m5824()) {
            return;
        }
        if (activityC5677.f19360 != null) {
            if (this.f69944) {
                this.f69943.m5841("resources.arsc");
                this.f69943.m5830(R.string.MT_Protector);
                this.f69943.m5840(0);
                ArrayList arrayListM21594 = activityC5677.f19360.m21594();
                if (!arrayListM21594.isEmpty()) {
                    this.f69947 = arrayListM21594;
                    return;
                }
            }
            activityC5677.f19360.m21588(true, (InterfaceC24022) new C15182(this));
        }
        if (this.f69943.m5824()) {
            return;
        }
        this.f69943.m5840(100);
        this.f69943.m5837(R.string.MT_Protector);
        if (activityC5677.m15649() && activityC5677.m15663() != null) {
            String strM15663 = activityC5677.m15663();
            if (activityC5677.f19365 != null) {
                this.f69943.m5832("classes.dex");
                activityC5677.f19365.m16547(C5553.m15313(strM15663, new String[0]), C0674.f2826);
            }
            if (activityC5677.f19360 != null) {
                this.f69943.m5832(activityC5677.f19360.m21608());
                activityC5677.f19360.m21585(C5553.m15313(strM15663, new String[0]), C0674.f2826);
                return;
            }
            return;
        }
        if (activityC5677.f19365 != null) {
            this.f69943.m5832("classes.dex");
            activityC5677.f19365.m16527();
        }
        if (activityC5677.f19360 != null) {
            this.f69943.m5832(activityC5677.f19360.m21608());
            activityC5677.f19360.m21598();
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
        if (this.f69943.m5824() || this.f69947 != null) {
            return;
        }
        boolean z = this.f69945;
        ActivityC5677 activityC5677 = this.f69946;
        if (z) {
            activityC5677.finish();
            return;
        }
        if (activityC5677.m15649()) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        final String strMo33986 = activityC5677.f19380.m33320("out").mo33986();
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(activityC5677);
        c8067.m21274(R.string.MT_Protector);
        c8067.m21261(activityC5677.getString(R.string.MT_Protector, strMo33986));
        c8067.m21251(R.string.MT_Protector, null);
        c8067.m21271(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۘۧۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C21531 c21531 = this.f14551;
                c21531.getClass();
                Intent intent = new Intent();
                intent.putExtra(MotionUtils.EASING_TYPE_PATH, strMo33986);
                ActivityC5677 activityC5678 = c21531.f69946;
                activityC5678.setResult(-1, intent);
                activityC5678.finish();
            }
        });
        c8067.m21269();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        ActivityC5677.m15591(this.f69946, exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        final ActivityC5677 activityC5677 = this.f69946;
        if (activityC5677.f19365 != null) {
            activityC5677.f19365.m16573();
        }
        this.f69943.m5825();
        if (this.f69947 == null || this.f69943.m5824()) {
            return;
        }
        final ArrayList<C18106> arrayList = this.f69947;
        if (arrayList.isEmpty()) {
            return;
        }
        View viewM30995 = activityC5677.m30995(R.layout.MT_Protector);
        ((TextView) viewM30995.findViewById(R.id.MT_Protector)).setText(activityC5677.getString(R.string.MT_Protector, Integer.valueOf(arrayList.size())));
        StringBuilder sb = new StringBuilder();
        ?? r8 = 0;
        for (C18106 c18106 : arrayList) {
            ?? r10 = c18106.f57914;
            if (!r10.equals(r8)) {
                if (r8 != 0) {
                    sb.append('\n');
                }
                C0219.m1594(sb, "<!-- ", r10, ".xml -->\n");
                r8 = r10;
            }
            sb.append("<entry id=\"");
            sb.append(String.format(Locale.ENGLISH, "0x%08x", Integer.valueOf(c18106.f57920)));
            sb.append("\" name=\"");
            sb.append(C11168.f37848.m35229(c18106.f57919));
            sb.append("\" />\n");
            r8 = r8;
        }
        C10948 c10948 = (C10948) viewM30995.findViewById(R.id.MT_Protector);
        c10948.m17065(true);
        c10948.mo16989((CharSequence) sb.toString().trim());
        c10948.m27470();
        final C18106 c18107 = (C18106) arrayList.get(0);
        C8067 c8067BuildDialog = activityC5677.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        final boolean z = this.f69945;
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܽۛۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = ActivityC5677.f19358;
                new C13065(activityC5677, arrayList, z).m10243();
            }
        });
        c8067BuildDialog.m21271(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۫ۛۘ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC5677.m15598(activityC5677, c18107);
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog.m21269();
    }
}
