package l;

import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۧܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: QB32 */
/* JADX INFO: loaded from: classes4.dex */
public class C11713 extends AbstractC13213 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C17930 f37897;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C17930 f37898;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f37899;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C17930 f37900;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C17930 f37901;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C7941 f37902;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C17930 f37903;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C17930 f37904;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C17930 f37905;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C17930 f37906;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C17930 f37907;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final C17930 f37908;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final C17930 f37909;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f37910;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C17930 f37911;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final C17930 f37912;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f37913;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17930 f37914;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C17930 f37915;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f37916;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C17930 f37917;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final C17930 f37918;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final C17930 f37919;

    public C11713() {
        Boolean bool = Boolean.FALSE;
        this.f37911 = new C17930(bool);
        this.f37916 = true;
        this.f37897 = new C17930(bool);
        this.f37906 = new C17930(bool);
        this.f37917 = new C17930(0);
        this.f37901 = new C17930(Boolean.TRUE);
        this.f37914 = new C17930(bool);
        this.f37909 = new C17930(bool);
        this.f37919 = new C17930(bool);
        this.f37918 = new C17930(bool);
        this.f37900 = new C17930(bool);
        this.f37912 = new C17930(bool);
        this.f37898 = new C17930(bool);
        this.f37908 = new C17930(bool);
        this.f37904 = new C17930(bool);
        this.f37907 = new C17930(bool);
        this.f37903 = new C17930();
        this.f37905 = new C17930(0);
        this.f37915 = new C17930();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29396(C7941 c7941) {
        C7941 c7942 = this.f37902;
        if (c7942 == c7941) {
            return;
        }
        boolean z = c7942 != null;
        this.f37902 = c7941;
        this.f37910 = false;
        this.f37899 = false;
        this.f37897.mo40353(Boolean.valueOf(this.f37913));
        if (z) {
            this.f37916 = true;
            this.f37911.mo40353(Boolean.FALSE);
            this.f37901.mo40353(Boolean.valueOf(!m29430()));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29404(C7941 c7941, boolean z) {
        if (this.f37902 == c7941) {
            if (!z) {
                this.f37910 = false;
            }
            this.f37899 = false;
            this.f37897.mo40353(Boolean.valueOf(this.f37913));
            this.f37916 = true;
            this.f37911.mo40353(Boolean.valueOf(z));
            this.f37901.mo40353(Boolean.valueOf(true ^ m29430()));
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m29409(C7941 c7941) {
        if (this.f37902 == c7941 && m29430()) {
            this.f37899 = true;
            Boolean bool = Boolean.TRUE;
            this.f37911.mo40353(bool);
            this.f37897.mo40353(bool);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29423(C7941 c7941) {
        if (this.f37902 == c7941) {
            this.f37910 = true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29399(C7941 c7941, final View view, final C24132 c24132) {
        this.f37911.m40350(c7941.getViewLifecycleOwner(), new InterfaceC16438() { // from class: l.ᩴܶ᩸
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                C11713 c11713 = this.f64078;
                c24132.m53900(view, ((Boolean) obj).booleanValue() && !c11713.f37899, c11713.f37916);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29395(C1975 c1975) {
        this.f37911.m40351((InterfaceC16438) c1975);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29422(C1975 c1975) {
        this.f37911.m40354((InterfaceC16438) c1975);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m29430() {
        return this.f37910 || ((Boolean) this.f37911.m40346()).booleanValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29400(C7941 c7941, ProgressBar progressBar) {
        this.f37897.m40350(c7941.getViewLifecycleOwner(), new C22902(progressBar, 0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29406(boolean z) {
        this.f37913 = z;
        this.f37897.mo40353(Boolean.valueOf(z || this.f37899));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29405(C7941 c7941, MenuItem... menuItemArr) {
        this.f37906.m40350(c7941.getViewLifecycleOwner(), new C10967(0, menuItemArr));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29426(C7941 c7941, MenuItem... menuItemArr) {
        this.f37906.m40350(c7941.getViewLifecycleOwner(), new C15916(1, menuItemArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29402(C7941 c7941, C0990 c0990) {
        this.f37906.m40350(c7941.getViewLifecycleOwner(), c0990);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m29416(boolean z) {
        this.f37906.mo40353(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29420(int i) {
        C17930 c17930 = this.f37917;
        if (((Integer) c17930.m40346()).intValue() != i) {
            c17930.mo40353(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.۫ܶ᩸, l.ܶ᩻ۙ] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.ۚܶ᩸, l.ܶ᩻ۙ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29403(C7941 c7941, C10177 c10177) {
        final RunnableC15442 runnableC15442 = new RunnableC15442(this, c10177);
        ?? r1 = new InterfaceC16438() { // from class: l.۫ܶ᩸
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                runnableC15442.run();
            }
        };
        ?? r2 = new InterfaceC16438() { // from class: l.ۚܶ᩸
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                runnableC15442.run();
            }
        };
        C23304 c23304 = new C23304(1, runnableC15442);
        this.f37900.m40350(c7941.getViewLifecycleOwner(), r1);
        this.f37917.m40350(c7941.getViewLifecycleOwner(), r2);
        this.f37901.m40350(c7941.getViewLifecycleOwner(), c23304);
        c10177.m26292(new RunnableC2019(this, r1, r2, c23304));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29390(C11713 c11713, C13205 c13205, C5748 c5748, C23304 c23304) {
        c11713.f37900.m40354((InterfaceC16438) c13205);
        c11713.f37917.m40354((InterfaceC16438) c5748);
        c11713.f37901.m40354((InterfaceC16438) c23304);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m29411(boolean z) {
        this.f37914.mo40353(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m29431(boolean z) {
        this.f37909.mo40353(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m29407(C7941 c7941, MenuItem menuItem) {
        m29388(c7941, menuItem, this.f37919);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m29417(boolean z) {
        C17930 c17930 = this.f37919;
        if (((Boolean) c17930.m40346()).booleanValue() != z) {
            c17930.mo40353(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m29418(C7941 c7941, MenuItem menuItem) {
        m29388(c7941, menuItem, this.f37918);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29392(boolean z) {
        C17930 c17930 = this.f37918;
        if (((Boolean) c17930.m40346()).booleanValue() != z) {
            c17930.mo40353(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m29414(boolean z) {
        this.f37900.mo40353(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m29415(C7941 c7941, MenuItem menuItem) {
        m29388(c7941, menuItem, this.f37912);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29412(boolean z) {
        C17930 c17930 = this.f37912;
        if (((Boolean) c17930.m40346()).booleanValue() != z) {
            c17930.mo40353(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m29419(boolean z) {
        C17930 c17930 = this.f37898;
        if (((Boolean) c17930.m40346()).booleanValue() != z) {
            c17930.mo40353(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29398(C7941 c7941, MenuItem menuItem, MenuItem menuItem2) {
        this.f37908.m40350(c7941.getViewLifecycleOwner(), new C22156(0, menuItem, menuItem2));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m29408(boolean z) {
        C17930 c17930 = this.f37908;
        if (((Boolean) c17930.m40346()).booleanValue() != z) {
            c17930.mo40353(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29397(C7941 c7941, MenuItem menuItem) {
        m29388(c7941, menuItem, this.f37904);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29427(boolean z) {
        C17930 c17930 = this.f37904;
        if (((Boolean) c17930.m40346()).booleanValue() != z) {
            c17930.mo40353(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m29410(C7941 c7941, MenuItem menuItem) {
        m29388(c7941, menuItem, this.f37907);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m29429(boolean z) {
        C17930 c17930 = this.f37907;
        if (((Boolean) c17930.m40346()).booleanValue() != z) {
            c17930.mo40353(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29401(C7941 c7941, TextView textView) {
        InterfaceC11217 viewLifecycleOwner = c7941.getViewLifecycleOwner();
        C17359.requireNonNull(textView);
        this.f37903.m40350(viewLifecycleOwner, new C19787(0, textView));
        this.f37905.m40350(c7941.getViewLifecycleOwner(), new C15311(0, textView));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29394(String str) {
        C17930 c17930 = this.f37903;
        if (C17359.equals(c17930.m40346(), str)) {
            return;
        }
        c17930.mo40353(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29393(int i) {
        C17930 c17930 = this.f37905;
        if (((Integer) c17930.m40346()).intValue() != i) {
            c17930.mo40353(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29425(C7941 c7941, TextView textView) {
        InterfaceC11217 viewLifecycleOwner = c7941.getViewLifecycleOwner();
        C17359.requireNonNull(textView);
        this.f37915.m40350(viewLifecycleOwner, new C19787(0, textView));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29421(String str) {
        C17930 c17930 = this.f37915;
        if (C17359.equals(c17930.m40346(), str)) {
            return;
        }
        c17930.mo40353(str);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m29413(C7941 c7941, MenuItem menuItem) {
        InterfaceC11217 viewLifecycleOwner = c7941.getViewLifecycleOwner();
        C17359.requireNonNull(menuItem);
        this.f37909.m40350(viewLifecycleOwner, new C1038(1, menuItem));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29424(C7941 c7941, MenuItem menuItem) {
        InterfaceC11217 viewLifecycleOwner = c7941.getViewLifecycleOwner();
        C17359.requireNonNull(menuItem);
        this.f37914.m40350(viewLifecycleOwner, new C1038(1, menuItem));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29388(C7941 c7941, MenuItem menuItem, C17930 c17930) {
        InterfaceC11217 viewLifecycleOwner = c7941.getViewLifecycleOwner();
        C17359.requireNonNull(menuItem);
        c17930.m40350(viewLifecycleOwner, new C2667(1, menuItem));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m29428(C7941 c7941, MenuItem menuItem) {
        InterfaceC11217 viewLifecycleOwner = c7941.getViewLifecycleOwner();
        C17359.requireNonNull(menuItem);
        this.f37898.m40350(viewLifecycleOwner, new C6825(menuItem));
    }
}
