package l;

import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: l.ۚ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06SC */
/* JADX INFO: loaded from: classes2.dex */
public final class C5550 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f19042;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f19043;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C14393 f19044;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20409 f19045;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f19046;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Point f19047;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f19048;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserver f19049;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f19050;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Point f19051;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C6111 f19052;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14018 f19053;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Handler f19054;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserverOnScrollChangedListenerC11901 f19055;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [l.۟ۗۖ, l.ܰ᩵ۖ] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.ViewTreeObserver$OnScrollChangedListener, l.ۨ᩵ۖ] */
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
    public C5550(C20409 c20409, C14393 c14393, Point point, Point point2) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f19054 = handler;
        this.f19045 = c20409;
        this.f19044 = c14393;
        C6111 c6111 = c20409.f66125;
        this.f19052 = c6111;
        this.f19051 = new Point(point);
        this.f19047 = new Point(point2);
        this.f19048 = c6111.m16916();
        this.f19050 = c6111.m17020();
        this.f19043 = c6111.getScrollX();
        this.f19046 = c6111.m17066();
        ?? r4 = new InterfaceC7191() { // from class: l.ܰ᩵ۖ
            @Override // l.InterfaceC7191
            /* JADX INFO: renamed from: ۙ */
            public final void mo4041(int i, int i2) {
                C5550.m15301(this.f46075, i, i2);
            }
        };
        this.f19053 = r4;
        ?? r5 = new ViewTreeObserver.OnScrollChangedListener() { // from class: l.ۨ᩵ۖ
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                C5550.m15300(this.f39931);
            }
        };
        this.f19055 = r5;
        ViewTreeObserver viewTreeObserver = c6111.getViewTreeObserver();
        this.f19049 = viewTreeObserver;
        c6111.m16864((InterfaceC7191) r4);
        viewTreeObserver.addOnScrollChangedListener(r5);
        handler.post(new RunnableC2727(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15301(C5550 c5550, int i, int i2) {
        if (i == c5550.f19048 && i2 == c5550.f19050) {
            return;
        }
        c5550.f19042 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15300(C5550 c5550) {
        C6111 c6111 = c5550.f19052;
        if (c6111.getScrollX() == c5550.f19043 && c6111.m17066() == c5550.f19046) {
            return;
        }
        c5550.f19042 = true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m15302(C5550 c5550) {
        ViewTreeObserver viewTreeObserver = c5550.f19049;
        Point point = c5550.f19047;
        C20409 c20409 = c5550.f19045;
        C14393 c14393 = c5550.f19044;
        C6111 c6111 = c5550.f19052;
        boolean zM46144 = c20409.m46144(c14393, c6111);
        if (zM46144 && !c5550.f19042 && c6111.m16973()) {
            c5550.f19054.postDelayed(new RunnableC2727(c5550), 10L);
            return;
        }
        c6111.m16874(c5550.f19053);
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(c5550.f19055);
        }
        if (zM46144 && !c5550.f19042 && c14393.f47162.mo8735().m4556().m23300()) {
            int i = c14393.f47163;
            if (i >= 0) {
                c6111.mo17029(i);
                if (c14393.f47160) {
                    c6111.m16987(c6111.m16974(point.x), c6111.m16837(point.y));
                    return;
                } else {
                    c6111.m16992(false);
                    return;
                }
            }
            Point point2 = c5550.f19051;
            C8500.m22223(point2.x, point2.y - 1).m22227(c6111);
            c6111.m16987(c6111.m16974(point.x), c6111.m16837(point.y));
        }
    }
}
