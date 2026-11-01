package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import bin.mt.plus.R;
import java.text.DateFormat;
import java.util.Date;

/* JADX INFO: renamed from: l.۫ܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes3.dex */
public final class C12543 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C8716 f41983;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f41984;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C8010 f41985;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f41986;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public View f41987;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f41988;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f41989;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20304 f41990 = new C20304(this);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C12562 f41991;

    public C12543(AbstractActivityC12483 abstractActivityC12483, C8716 c8716) {
        this.f41986 = abstractActivityC12483;
        this.f41983 = c8716;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12543 m31180(View view, AbstractActivityC12483 abstractActivityC12483, DialogInterfaceC19356 dialogInterfaceC19356) {
        C12543 c12543 = new C12543(abstractActivityC12483, C8716.m22551());
        c12543.f41984 = dialogInterfaceC19356;
        C21423 c21423 = (C21423) view.findViewById(R.id.MT_Protector);
        c21423.m47992();
        c12543.m31201();
        c21423.setAdapter(c12543.f41990);
        return c12543;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31182(final C12543 c12543, View view) {
        c12543.f41991 = (C12562) view.findViewById(R.id.MT_Protector);
        c12543.f41987 = view.findViewById(R.id.MT_Protector);
        c12543.m31178();
        c12543.f41991.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۘܿ֨
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C12543.m31194(this.f14987, z);
            }
        });
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m31194(final C12543 c12543, final boolean z) {
        if (c12543.f41989) {
            return;
        }
        c12543.m31201();
        if (c12543.f41988) {
            return;
        }
        if (z && c12543.f41983.m22559().f26263.isEmpty()) {
            C15829.m37618(R.string.MT_Protector);
            return;
        }
        AbstractActivityC12483 abstractActivityC12483 = c12543.f41986;
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21274(R.string.MT_Protector);
        c8067.m21253(z ? R.string.MT_Protector : R.string.MT_Protector);
        c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩺ܿ֨
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C12543.m31198(this.f75110, z);
            }
        });
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21269();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m31198(final C12543 c12543, final boolean z) {
        c12543.m31191(new InterfaceC21009() { // from class: l.ܶܿ֨
            @Override // l.InterfaceC21009
            public final C17887 run() {
                this.f50040.f41983.m22557(z);
                return null;
            }
        }, (Runnable) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31200() {
        if (this.f41988) {
            return;
        }
        C8716 c8716 = this.f41983;
        if (c8716.m22559().f26263.size() >= 32) {
            C15829.m37618(R.string.MT_Protector);
            return;
        }
        if (!c8716.m22559().f26261) {
            int i = DialogInterfaceC19356.f62401;
            C8067 c8067 = new C8067(this.f41986);
            c8067.m21274(R.string.MT_Protector);
            c8067.m21253(R.string.MT_Protector);
            c8067.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC13249(0, this));
            c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067.m21269();
            return;
        }
        m31190((C18593) null, (DialogInterfaceC19356) null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m31202() {
        return this.f41988;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m31201() {
        this.f41985 = this.f41983.m22559();
        m31178();
        this.f41990.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m31178() {
        C12562 c12562 = this.f41991;
        if (c12562 == null) {
            return;
        }
        this.f41989 = true;
        c12562.setChecked(this.f41985.f26260);
        this.f41989 = false;
        this.f41987.setVisibility(this.f41985.f26263.isEmpty() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m31190(C18593 c18593, DialogInterfaceC19356 dialogInterfaceC19356) {
        AbstractActivityC12483 abstractActivityC12483 = this.f41986;
        C10427 c10427 = new C10427(this, abstractActivityC12483, c18593, dialogInterfaceC19356);
        c10427.m40376(c18593 == null ? R.string.MT_Protector : R.string.MT_Protector);
        c10427.m40367(abstractActivityC12483.getString(R.string.MT_Protector));
        c10427.m40346((CharSequence) (c18593 == null ? "" : c18593.f59151));
        c10427.m40371();
        c10427.m40340();
        c10427.m40368(true);
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
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m31193(final C12543 c12543, final String str) {
        AbstractActivityC12483 abstractActivityC12483 = c12543.f41986;
        C8716 c8716 = c12543.f41983;
        C18593 c18593M22560 = c8716.m22560(str);
        if (c18593M22560 == null) {
            c12543.m31201();
            return;
        }
        String str2 = c18593M22560.f59152;
        String str3 = c18593M22560.f59153;
        long j = c18593M22560.f59154;
        String str4 = j == 0 ? "—" : DateFormat.getDateTimeInstance().format(new Date(j));
        long j2 = c18593M22560.f59155;
        String str5 = j2 == 0 ? "—" : DateFormat.getDateTimeInstance().format(new Date(j2));
        if (str2.isEmpty()) {
            str2 = "—";
        }
        String string = abstractActivityC12483.getString(R.string.MT_Protector, str3, str4, str5, str2);
        String strM22558 = c8716.m22558(str);
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21277(c18593M22560.f59151);
        if (strM22558 == null) {
            StringBuilder sbM8976 = C3012.m8976(string, "\n\n");
            sbM8976.append(abstractActivityC12483.getString(R.string.MT_Protector));
            string = sbM8976.toString();
        }
        c8067.m21261(string);
        c8067.m21251(R.string.MT_Protector, null);
        c8067.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067.m21269();
        dialogInterfaceC19356M21269.m44361().setOnClickListener(new View.OnClickListener() { // from class: l.᩸ܿ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12543.m31185(this.f70405, str, dialogInterfaceC19356M21269, view);
            }
        });
        dialogInterfaceC19356M21269.m44373().setEnabled(strM22558 != null);
        dialogInterfaceC19356M21269.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ᩳܿ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12543.m31183(this.f58135, str);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m31183(C12543 c12543, String str) {
        String strM22558 = c12543.f41983.m22558(str);
        if (strM22558 != null) {
            C16737.m39272((CharSequence) strM22558);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31185(final C12543 c12543, final String str, final DialogInterfaceC19356 dialogInterfaceC19356, View view) {
        final C18593 c18593M22560 = c12543.f41983.m22560(str);
        if (c18593M22560 != null) {
            C16195 c16195 = new C16195(c12543.f41986, view, 0);
            c16195.m38298().add(R.string.MT_Protector).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.ᩴܿ֨
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    this.f61172.m31190(c18593M22560, dialogInterfaceC19356);
                    return true;
                }
            });
            c16195.m38298().add(R.string.MT_Protector).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.۠ܿ֨
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    C12543.m31186(this.f28833, c18593M22560, str, dialogInterfaceC19356);
                    return true;
                }
            });
            c16195.m38297();
            return;
        }
        c12543.m31201();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31186(C12543 c12543, C18593 c18593, String str, DialogInterfaceC19356 dialogInterfaceC19356) {
        boolean z;
        C8010 c8010M22559 = c12543.f41983.m22559();
        int i = 0;
        if (c8010M22559.f26260) {
            z = c8010M22559.f26263.size() == 1;
        }
        AbstractActivityC12483 abstractActivityC12483 = c12543.f41986;
        int i2 = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21277(c18593.f59151);
        c8067.m21253(z ? R.string.MT_Protector : R.string.MT_Protector);
        c8067.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC1253(c12543, str, dialogInterfaceC19356, i));
        c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067.m21269();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m31191(InterfaceC21009 interfaceC21009, Runnable runnable) {
        if (this.f41988) {
            return;
        }
        this.f41988 = true;
        new C7604(this, interfaceC21009, runnable).m10243();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m31179(C12543 c12543, String str) {
        AbstractActivityC12483 abstractActivityC12483 = c12543.f41986;
        int i = DialogInterfaceC19356.f62401;
        C8067 c8067 = new C8067(abstractActivityC12483);
        c8067.m21274(R.string.MT_Protector);
        c8067.m21261(abstractActivityC12483.getString(R.string.MT_Protector) + "\n\n" + str);
        c8067.m21251(R.string.MT_Protector, null);
        c8067.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC19356 dialogInterfaceC19356M21252 = c8067.m21252();
        dialogInterfaceC19356M21252.m44362();
        dialogInterfaceC19356M21252.m44361().setOnClickListener(new ViewOnClickListenerC6898(0, str));
    }
}
