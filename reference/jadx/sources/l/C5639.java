package l;

import android.view.View;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۚۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AOV */
/* JADX INFO: loaded from: classes2.dex */
public final class C5639 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f19498 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BooleanSupplier f19499;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C16079 f19500;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1910 f19501;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int f19496 = ApplicationC17729.f58258.getInt("tfcgi", 0);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean f19497 = ApplicationC17729.f58258.getBoolean("tfcge", false);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean f19495 = ApplicationC17729.f58258.getBoolean("tfrge", false);

    public C5639(AbstractActivityC22047 abstractActivityC22047, final C24132 c24132) {
        C17359.requireNonNull(c24132);
        this.f19499 = new BooleanSupplier() { // from class: l.᩸ۨ᩸
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return c24132.m54083();
            }
        };
        C16079 c16079 = (C16079) abstractActivityC22047.m40418(R.id.MT_Protector);
        this.f19500 = c16079;
        C1910 c1910 = (C1910) abstractActivityC22047.m40418(R.id.MT_Protector);
        this.f19501 = c1910;
        m16625();
        c1910.m6577(c16079, c24132, c24132);
        c16079.m38239(new C13096());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5639(View view, final C24132 c24132) {
        this(view, new BooleanSupplier() { // from class: l.᩸ۨ᩸
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return c24132.m54083();
            }
        }, c24132);
        C17359.requireNonNull(c24132);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5639(View view, BooleanSupplier booleanSupplier, InterfaceC9409 interfaceC9409) {
        this.f19499 = booleanSupplier;
        C16079 c16079 = (C16079) view.findViewById(R.id.MT_Protector);
        this.f19500 = c16079;
        C1910 c1910 = (C1910) view.findViewById(R.id.MT_Protector);
        this.f19501 = c1910;
        m16625();
        c1910.m6577(c16079, interfaceC9409, interfaceC9409 instanceof View ? (View) interfaceC9409 : null);
        c16079.m38239(new C13096());
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m16621() {
        return f19495;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m16620(boolean z) {
        C6421.m18184(ApplicationC17729.f58258, "tfrge", z);
        f19495 = z;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m16624() {
        return f19497;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m16623(boolean z) {
        if (f19497 != z) {
            f19497 = z;
            C5261.m15835("tfcge", 5000L, new RunnableC10858(0));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16627(boolean z) {
        C1910 c1910 = this.f19501;
        C16079 c16079 = this.f19500;
        if (z) {
            c16079.setVisibility(0);
            c1910.setVisibility(0);
        } else {
            c16079.setVisibility(8);
            c1910.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16625() {
        m16627(ApplicationC17729.f58262.getBoolean("symbol_input", true) && !this.f19499.getAsBoolean());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16626(InterfaceC11217 interfaceC11217, InterfaceC7960 interfaceC7960, C23255 c23255, C23255 c23256) {
        ArrayList arrayList = new ArrayList(C24832.m55353());
        int iM54006 = interfaceC7960.mo10928().m54006();
        C16079 c16079 = this.f19500;
        c16079.setBackgroundColor(iM54006);
        c16079.m38238(arrayList, interfaceC7960, c23255, c23256);
        c16079.m38236(f19496);
        C24832.m55357().m40350(interfaceC11217, new InterfaceC16438() { // from class: l.ᩴۨ᩸
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                C5639.m16618(this.f63681);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16618(C5639 c5639) {
        c5639.f19500.m38237(new ArrayList(C24832.m55353()));
        c5639.m16625();
    }
}
