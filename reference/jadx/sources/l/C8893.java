package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import bin.mt.plus.R;
import java.text.DateFormat;
import java.util.Date;

/* JADX INFO: renamed from: l.۠᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes3.dex */
public final class C8893 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C16572 f29055;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f29056;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f29057;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f29058;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C15826 f29059;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C1255 f29060;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public View f29061;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1436 f29062 = new C1436(this);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f29063;

    public C8893(AbstractActivityC17204 abstractActivityC17204, C15826 c15826) {
        this.f29056 = abstractActivityC17204;
        this.f29059 = c15826;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8893 m23784(View view, AbstractActivityC17204 abstractActivityC17204, DialogInterfaceC8327 dialogInterfaceC8327) {
        C8893 c8893 = new C8893(abstractActivityC17204, C15826.m37762());
        c8893.f29063 = dialogInterfaceC8327;
        C5817 c5817 = (C5817) view.findViewById(R.id.MT_Protector);
        c5817.m16967();
        c8893.m23809();
        c5817.setAdapter(c8893.f29062);
        return c8893;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23786(final C8893 c8893, View view) {
        c8893.f29060 = (C1255) view.findViewById(R.id.MT_Protector);
        c8893.f29061 = view.findViewById(R.id.MT_Protector);
        c8893.m23806();
        c8893.f29060.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩹᩷ۚ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C8893.m23797(this.f77131, z);
            }
        });
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m23797(final C8893 c8893, final boolean z) {
        if (c8893.f29057) {
            return;
        }
        c8893.m23809();
        if (c8893.f29058) {
            return;
        }
        if (z && c8893.f29059.m37771().f53645.isEmpty()) {
            C22673.m51159(R.string.MT_Protector);
            return;
        }
        AbstractActivityC17204 abstractActivityC17204 = c8893.f29056;
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8021(R.string.MT_Protector);
        c2361.m8000(z ? R.string.MT_Protector : R.string.MT_Protector);
        c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩵᩷ۚ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C8893.m23804(this.f66697, z);
            }
        });
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8016();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m23804(final C8893 c8893, final boolean z) {
        c8893.m23794(new InterfaceC19335() { // from class: l.ۨ᩷ۚ
            @Override // l.InterfaceC19335
            public final C11351 run() {
                this.f40481.f29059.m37768(z);
                return null;
            }
        }, (Runnable) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23808() {
        if (this.f29058) {
            return;
        }
        C15826 c15826 = this.f29059;
        if (c15826.m37771().f53645.size() >= 32) {
            C22673.m51159(R.string.MT_Protector);
            return;
        }
        if (!c15826.m37771().f53644) {
            int i = DialogInterfaceC8327.f27315;
            C2361 c2361 = new C2361(this.f29056);
            c2361.m8021(R.string.MT_Protector);
            c2361.m8000(R.string.MT_Protector);
            c2361.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC16351(0, this));
            c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c2361.m8016();
            return;
        }
        m23795((C24778) null, (DialogInterfaceC8327) null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m23810() {
        return this.f29058;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m23809() {
        this.f29055 = this.f29059.m37771();
        m23806();
        this.f29062.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m23806() {
        C1255 c1255 = this.f29060;
        if (c1255 == null) {
            return;
        }
        this.f29057 = true;
        c1255.setChecked(this.f29055.f53643);
        this.f29057 = false;
        this.f29061.setVisibility(this.f29055.f53645.isEmpty() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m23795(C24778 c24778, DialogInterfaceC8327 dialogInterfaceC8327) {
        AbstractActivityC17204 abstractActivityC17204 = this.f29056;
        C0690 c0690 = new C0690(this, abstractActivityC17204, c24778, dialogInterfaceC8327);
        c0690.m22945(c24778 == null ? R.string.MT_Protector : R.string.MT_Protector);
        c0690.m22933(abstractActivityC17204.getString(R.string.MT_Protector));
        c0690.m22924((CharSequence) (c24778 == null ? "" : c24778.f80213));
        c0690.m22916();
        c0690.m22918();
        c0690.m22955(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m23796(final C8893 c8893, final String str) {
        AbstractActivityC17204 abstractActivityC17204 = c8893.f29056;
        C15826 c15826 = c8893.f29059;
        C24778 c24778M37772 = c15826.m37772(str);
        if (c24778M37772 == null) {
            c8893.m23809();
            return;
        }
        String str2 = c24778M37772.f80217;
        Object obj = c24778M37772.f80214;
        long j = c24778M37772.f80218;
        Object obj2 = j == 0 ? "—" : DateFormat.getDateTimeInstance().format(new Date(j));
        long j2 = c24778M37772.f80216;
        Object obj3 = j2 == 0 ? "—" : DateFormat.getDateTimeInstance().format(new Date(j2));
        if (str2.isEmpty()) {
            str2 = "—";
        }
        Object[] objArr = 0;
        String string = abstractActivityC17204.getString(R.string.MT_Protector, obj, obj2, obj3, str2);
        String strM37770 = c15826.m37770(str);
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8024(c24778M37772.f80213);
        if (strM37770 == null) {
            StringBuilder sbM10405 = C3188.m10405(string, "\n\n");
            sbM10405.append(abstractActivityC17204.getString(R.string.MT_Protector));
            string = sbM10405.toString();
        }
        c2361.m8008(string);
        c2361.m8026(R.string.MT_Protector, null);
        c2361.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361.m8016();
        dialogInterfaceC8327M8016.m22440().setOnClickListener(new ViewOnClickListenerC6657(c8893, str, dialogInterfaceC8327M8016, objArr == true ? 1 : 0));
        dialogInterfaceC8327M8016.m22436().setEnabled(strM37770 != null);
        dialogInterfaceC8327M8016.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.᩺᩷ۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8893.m23787(this.f79596, str);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23787(C8893 c8893, String str) {
        String strM37770 = c8893.f29059.m37770(str);
        if (strM37770 != null) {
            C21576.m49067((CharSequence) strM37770);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23789(final C8893 c8893, final String str, final DialogInterfaceC8327 dialogInterfaceC8327, View view) {
        final C24778 c24778M37772 = c8893.f29059.m37772(str);
        if (c24778M37772 != null) {
            C18452 c18452 = new C18452(c8893.f29056, view, 0);
            c18452.m42995().add(R.string.MT_Protector).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.ۘ᩷ۚ
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    this.f15856.m23795(c24778M37772, dialogInterfaceC8327);
                    return true;
                }
            });
            c18452.m42995().add(R.string.MT_Protector).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.ܰ᩷ۚ
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    C8893.m23791(this.f48569, c24778M37772, str, dialogInterfaceC8327);
                    return true;
                }
            });
            c18452.mo21878();
            return;
        }
        c8893.m23809();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23791(final C8893 c8893, C24778 c24778, final String str, final DialogInterfaceC8327 dialogInterfaceC8327) {
        boolean z;
        C16572 c16572M37771 = c8893.f29059.m37771();
        if (c16572M37771.f53643) {
            z = c16572M37771.f53645.size() == 1;
        }
        AbstractActivityC17204 abstractActivityC17204 = c8893.f29056;
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8024(c24778.f80213);
        c2361.m8000(z ? R.string.MT_Protector : R.string.MT_Protector);
        c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܽ᩷ۚ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                String str2 = str;
                DialogInterfaceC8327 dialogInterfaceC8328 = dialogInterfaceC8327;
                C8893 c8894 = this.f58529;
                c8894.m23794(new InterfaceC19335() { // from class: l.ܺ᩷ۚ
                    @Override // l.InterfaceC19335
                    public final C11351 run() {
                        this.f55814.f29059.m37773(str2);
                        return null;
                    }
                }, new RunnableC22205(1, dialogInterfaceC8328));
            }
        });
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8016();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m23794(InterfaceC19335 interfaceC19335, Runnable runnable) {
        if (this.f29058) {
            return;
        }
        this.f29058 = true;
        new C8148(this, interfaceC19335, runnable).m8197();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m23807(C8893 c8893, String str) {
        AbstractActivityC17204 abstractActivityC17204 = c8893.f29056;
        int i = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(abstractActivityC17204);
        c2361.m8021(R.string.MT_Protector);
        c2361.m8008(abstractActivityC17204.getString(R.string.MT_Protector) + "\n\n" + str);
        c2361.m8026(R.string.MT_Protector, null);
        c2361.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC8327 dialogInterfaceC8327M7999 = c2361.m7999();
        dialogInterfaceC8327M7999.m22432();
        dialogInterfaceC8327M7999.m22440().setOnClickListener(new ViewOnClickListenerC3673(0, str));
    }
}
