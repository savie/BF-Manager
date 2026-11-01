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

/* JADX INFO: renamed from: l.ܽ᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes4.dex */
public final class C16927 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f54120;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public CheckBox f54121;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public CheckBox f54122;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11381 f54123;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC3520 f54124;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public CheckBox f54125;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16927(ViewOnClickListenerC3520 viewOnClickListenerC3520, AbstractActivityC12483 abstractActivityC12483, final AbstractActivityC12483 abstractActivityC12484, C11381 c11381) {
        super(abstractActivityC12483, -1);
        this.f54124 = viewOnClickListenerC3520;
        this.f54120 = abstractActivityC12484;
        this.f54123 = c11381;
        FrameLayout frameLayoutM40333 = m40333();
        frameLayoutM40333.setVisibility(0);
        LayoutInflater.from(abstractActivityC12484).inflate(R.layout.MT_Protector, frameLayoutM40333);
        CheckBox checkBox = (CheckBox) frameLayoutM40333.findViewById(R.id.MT_Protector);
        this.f54122 = checkBox;
        checkBox.setChecked(ApplicationC0716.f2992.getBoolean("dex_plus_rename_not_exists", true));
        CheckBox checkBox2 = (CheckBox) frameLayoutM40333.findViewById(R.id.checkBox2);
        this.f54121 = checkBox2;
        checkBox2.setChecked(!c11381.m28482().matches("[a-zA-Z]{1,5}"));
        CheckBox checkBox3 = (CheckBox) frameLayoutM40333.findViewById(R.id.MT_Protector);
        this.f54125 = checkBox3;
        checkBox3.setChecked(ApplicationC0716.f2992.getBoolean("dprs", true));
        frameLayoutM40333.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC16222(0, abstractActivityC12484));
        frameLayoutM40333.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.᩶᩹ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                abstractActivityC12484.m30996(R.string.MT_Protector, R.string.MT_Protector, false);
            }
        });
        if (c11381.m28481()) {
            checkBox.setVisibility(8);
            frameLayoutM40333.findViewById(R.id.MT_Protector).setVisibility(8);
            String str = c11381.m28482() + "$";
            Iterator it = viewOnClickListenerC3520.f12880.m16565().iterator();
            while (it.hasNext()) {
                if (((C2565) it.next()).f10124.startsWith(str)) {
                    return;
                }
            }
            this.f54125.setVisibility(8);
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
    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strM40352 = m40352();
        if (!C6851.m18462((CharSequence) strM40352)) {
            strM40352 = C6851.m18457(C6851.m18465(strM40352));
        }
        if (strM40352.isEmpty()) {
            m40364();
            return;
        }
        C11381 c11381 = this.f54123;
        boolean zM28481 = c11381.m28481();
        CheckBox checkBox = this.f54121;
        ViewOnClickListenerC3520 viewOnClickListenerC3520 = this.f54124;
        if (zM28481) {
            if (viewOnClickListenerC3520.f12880.m16563(strM40352)) {
                m40347(viewOnClickListenerC3520.getString(R.string.MT_Protector, strM40352));
                return;
            }
            String strM28482 = c11381.m28482();
            HashMap map = new HashMap();
            map.put(strM28482, strM40352);
            CheckBox checkBox2 = this.f54125;
            if (checkBox2.getVisibility() == 0) {
                if (checkBox2.isChecked()) {
                    String strM37076 = C15489.m37076(strM28482, "$");
                    Iterator it = viewOnClickListenerC3520.f12880.m16565().iterator();
                    while (it.hasNext()) {
                        String str = ((C2565) it.next()).f10124;
                        if (str.startsWith(strM37076)) {
                            StringBuilder sbM8976 = C3012.m8976(strM40352, "$");
                            sbM8976.append(str.substring(strM37076.length()));
                            map.put(str, sbM8976.toString());
                        }
                    }
                }
                ApplicationC0716.f2992.edit().putBoolean("dprs", checkBox2.isChecked()).apply();
            }
            Set setSingleton = Collections.singleton(strM40352);
            boolean zIsChecked = checkBox.isChecked();
            m40364();
            new C0698(this, map, null, zIsChecked, setSingleton).m10243();
            return;
        }
        String str2 = c11381.m28482() + "/";
        String strConcat = strM40352.concat("/");
        HashMap map2 = new HashMap();
        Iterator it2 = viewOnClickListenerC3520.f12880.m16565().iterator();
        while (it2.hasNext()) {
            String str3 = ((C2565) it2.next()).f10124;
            if (str3.startsWith(str2)) {
                StringBuilder sbM23356 = C9023.m23356(strConcat);
                sbM23356.append(str3.substring(str2.length()));
                String string = sbM23356.toString();
                if (viewOnClickListenerC3520.f12880.m16563(string)) {
                    m40347(viewOnClickListenerC3520.getString(R.string.MT_Protector, string));
                    return;
                }
                map2.put(str3, string);
            }
        }
        InterfaceC17314 interfaceC17314Edit = ApplicationC0716.f2992.edit();
        CheckBox checkBox3 = this.f54122;
        interfaceC17314Edit.putBoolean("dex_plus_rename_not_exists", checkBox3.isChecked()).apply();
        if (!checkBox3.isChecked()) {
            Set setSingleton2 = Collections.singleton(strConcat);
            boolean zIsChecked2 = checkBox.isChecked();
            m40364();
            new C0698(this, map2, null, zIsChecked2, setSingleton2).m10243();
            return;
        }
        Set setSingleton3 = Collections.singleton(strConcat);
        C10946 c10946 = new C10946(str2, strConcat);
        boolean zIsChecked3 = checkBox.isChecked();
        m40364();
        new C0698(this, map2, c10946, zIsChecked3, setSingleton3).m10243();
    }
}
