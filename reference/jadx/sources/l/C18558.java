package l;

import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ܿ᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 06SC */
/* JADX INFO: loaded from: classes4.dex */
public final class C18558 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16320 f60299;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7941 f60300;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserver f60301;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f60302;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Point f60303;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f60304;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Handler f60305;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C24132 f60306;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Point f60307;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4388 f60308;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f60309;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f60310;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f60311;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserverOnScrollChangedListenerC14828 f60312;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [l.ۘ᩵᩸, l.ۧ᩷ᩴ] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.ViewTreeObserver$OnScrollChangedListener, l.ܰ᩵᩸] */
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
    public C18558(C7941 c7941, C16320 c16320, Point point, Point point2) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f60305 = handler;
        this.f60300 = c7941;
        this.f60299 = c16320;
        C24132 c24132 = c7941.f26387;
        this.f60306 = c24132;
        this.f60307 = new Point(point);
        this.f60303 = new Point(point2);
        this.f60302 = c24132.m53968();
        this.f60310 = c24132.m53882();
        this.f60311 = c24132.getScrollX();
        this.f60309 = c24132.m54026();
        ?? r4 = new InterfaceC11886() { // from class: l.ۘ᩵᩸
            @Override // l.InterfaceC11886
            /* JADX INFO: renamed from: ۙ */
            public final void mo1160(int i, int i2) {
                C18558.m43137(this.f15815, i, i2);
            }
        };
        this.f60308 = r4;
        ?? r5 = new ViewTreeObserver.OnScrollChangedListener() { // from class: l.ܰ᩵᩸
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                C18558.m43136(this.f48512);
            }
        };
        this.f60312 = r5;
        ViewTreeObserver viewTreeObserver = c24132.getViewTreeObserver();
        this.f60301 = viewTreeObserver;
        c24132.m53913((InterfaceC11886) r4);
        viewTreeObserver.addOnScrollChangedListener(r5);
        handler.post(new RunnableC21542(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43137(C18558 c18558, int i, int i2) {
        if (i == c18558.f60302 && i2 == c18558.f60310) {
            return;
        }
        c18558.f60304 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43136(C18558 c18558) {
        C24132 c24132 = c18558.f60306;
        if (c24132.getScrollX() == c18558.f60311 && c24132.m54026() == c18558.f60309) {
            return;
        }
        c18558.f60304 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m43138(C18558 c18558) {
        ViewTreeObserver viewTreeObserver = c18558.f60301;
        Point point = c18558.f60303;
        C7941 c7941 = c18558.f60300;
        C16320 c16320 = c18558.f60299;
        C24132 c24132 = c18558.f60306;
        boolean zM21633 = c7941.m21633(c16320, c24132);
        if (zM21633 && !c18558.f60304 && c24132.m53884()) {
            c18558.f60305.postDelayed(new RunnableC21542(c18558), 10L);
            return;
        }
        c24132.m53908(c18558.f60308);
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(c18558.f60312);
        }
        if (zM21633 && !c18558.f60304 && c16320.f52980.mo11043().m41081().m48300()) {
            int i = c16320.f52975;
            if (i >= 0) {
                c24132.mo52339(i);
                if (c16320.f52990) {
                    c24132.m54073(c24132.m53948(point.x), c24132.m53873(point.y));
                    return;
                } else {
                    c24132.m54077(false);
                    return;
                }
            }
            Point point2 = c18558.f60307;
            C15301.m36736(point2.x, point2.y - 1).m36745(c24132);
            c24132.m54073(c24132.m53948(point.x), c24132.m53873(point.y));
        }
    }
}
