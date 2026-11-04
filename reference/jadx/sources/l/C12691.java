package l;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes4.dex */
public final class C12691 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public CheckBox f40647;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public CheckBox f40648;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f40649;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public CheckBox f40650;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19404 f40651;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8230 f40652;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12691(ViewOnClickListenerC19404 viewOnClickListenerC19404, AbstractActivityC17204 abstractActivityC17204, final AbstractActivityC17204 abstractActivityC17205, C8230 c8230) {
        super(abstractActivityC17204, -1);
        this.f40651 = viewOnClickListenerC19404;
        this.f40649 = abstractActivityC17205;
        this.f40652 = c8230;
        FrameLayout frameLayoutM22941 = m22941();
        frameLayoutM22941.setVisibility(0);
        LayoutInflater.from(abstractActivityC17205).inflate(R.layout.MT_Protector, frameLayoutM22941);
        CheckBox checkBox = (CheckBox) frameLayoutM22941.findViewById(R.id.MT_Protector);
        this.f40650 = checkBox;
        checkBox.setChecked(ApplicationC17729.f58258.getBoolean("dex_plus_rename_not_exists", true));
        CheckBox checkBox2 = (CheckBox) frameLayoutM22941.findViewById(R.id.checkBox2);
        this.f40648 = checkBox2;
        checkBox2.setChecked(!c8230.m22146().matches("[a-zA-Z]{1,5}"));
        CheckBox checkBox3 = (CheckBox) frameLayoutM22941.findViewById(R.id.MT_Protector);
        this.f40647 = checkBox3;
        checkBox3.setChecked(ApplicationC17729.f58258.getBoolean("dprs", true));
        frameLayoutM22941.findViewById(R.id.help).setOnClickListener(new View.OnClickListener() { // from class: l.᩹᩺ۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                abstractActivityC17205.m40396(R.string.MT_Protector, R.string.MT_Protector, false);
            }
        });
        frameLayoutM22941.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۗ᩺ۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                abstractActivityC17205.m40396(R.string.MT_Protector, R.string.MT_Protector, false);
            }
        });
        if (c8230.m22142()) {
            checkBox.setVisibility(8);
            frameLayoutM22941.findViewById(R.id.help).setVisibility(8);
            String str = c8230.m22146() + "$";
            Iterator it = viewOnClickListenerC19404.f62714.m46608().iterator();
            while (it.hasNext()) {
                if (((C19382) it.next()).f62622.startsWith(str)) {
                    return;
                }
            }
            this.f40647.setVisibility(8);
            return;
        }
        checkBox3.setVisibility(8);
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
    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strM54284 = C24276.m54284(C24276.m54288(m22914()));
        if (strM54284.isEmpty()) {
            m22951();
            return;
        }
        C8230 c8230 = this.f40652;
        boolean zM22142 = c8230.m22142();
        CheckBox checkBox = this.f40648;
        ViewOnClickListenerC19404 viewOnClickListenerC19404 = this.f40651;
        if (zM22142) {
            if (viewOnClickListenerC19404.f62714.m46617(strM54284)) {
                m22925(viewOnClickListenerC19404.getString(R.string.MT_Protector, strM54284));
                return;
            }
            String strM22146 = c8230.m22146();
            HashMap map = new HashMap();
            map.put(strM22146, strM54284);
            CheckBox checkBox2 = this.f40647;
            if (checkBox2.getVisibility() == 0) {
                if (checkBox2.isChecked()) {
                    String strM34972 = C14483.m34972(strM22146, "$");
                    Iterator it = viewOnClickListenerC19404.f62714.m46608().iterator();
                    while (it.hasNext()) {
                        String str = ((C19382) it.next()).f62622;
                        if (str.startsWith(strM34972)) {
                            StringBuilder sbM10405 = C3188.m10405(strM54284, "$");
                            sbM10405.append(str.substring(strM34972.length()));
                            map.put(str, sbM10405.toString());
                        }
                    }
                }
                ApplicationC17729.f58258.edit().putBoolean("dprs", checkBox2.isChecked()).apply();
            }
            Set setSingleton = Collections.singleton(strM54284);
            boolean zIsChecked = checkBox.isChecked();
            m22951();
            new C20896(this, map, null, zIsChecked, setSingleton).m8197();
            return;
        }
        String str2 = c8230.m22146() + "/";
        String strConcat = strM54284.concat("/");
        HashMap map2 = new HashMap();
        Iterator it2 = viewOnClickListenerC19404.f62714.m46608().iterator();
        while (it2.hasNext()) {
            String str3 = ((C19382) it2.next()).f62622;
            if (str3.startsWith(str2)) {
                StringBuilder sbM27333 = C10732.m27333(strConcat);
                sbM27333.append(str3.substring(str2.length()));
                String string = sbM27333.toString();
                if (viewOnClickListenerC19404.f62714.m46617(string)) {
                    m22925(viewOnClickListenerC19404.getString(R.string.MT_Protector, string));
                    return;
                }
                map2.put(str3, string);
            }
        }
        InterfaceC18752 interfaceC18752Edit = ApplicationC17729.f58258.edit();
        CheckBox checkBox3 = this.f40650;
        interfaceC18752Edit.putBoolean("dex_plus_rename_not_exists", checkBox3.isChecked()).apply();
        if (!checkBox3.isChecked()) {
            Set setSingleton2 = Collections.singleton(strConcat);
            boolean zIsChecked2 = checkBox.isChecked();
            m22951();
            new C20896(this, map2, null, zIsChecked2, setSingleton2).m8197();
            return;
        }
        Set setSingleton3 = Collections.singleton(strConcat);
        C2310 c2310 = new C2310(str2, strConcat);
        boolean zIsChecked3 = checkBox.isChecked();
        m22951();
        new C20896(this, map2, c2310, zIsChecked3, setSingleton3).m8197();
    }
}
