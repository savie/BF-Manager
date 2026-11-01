package l;

import android.view.View;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ܽ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AOV */
/* JADX INFO: loaded from: classes4.dex */
public final class C16839 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f53880 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BooleanSupplier f53883;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C23895 f53884;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12606 f53885;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static int f53882 = ApplicationC0716.f2992.getInt("tfcgi", 0);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean f53881 = ApplicationC0716.f2992.getBoolean("tfcge", false);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static boolean f53879 = ApplicationC0716.f2992.getBoolean("tfrge", false);

    public C16839(AbstractActivityC10490 abstractActivityC10490, final C6111 c6111) {
        C13638.requireNonNull(c6111);
        this.f53883 = new BooleanSupplier() { // from class: l.᩷᩵ۖ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return c6111.m17004();
            }
        };
        C23895 c23895 = (C23895) abstractActivityC10490.m31016(R.id.MT_Protector);
        this.f53884 = c23895;
        C12606 c12606 = (C12606) abstractActivityC10490.m31016(R.id.MT_Protector);
        this.f53885 = c12606;
        m39492();
        c12606.m31379(c23895, c6111, c6111);
        c23895.m52679(new C0610());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16839(View view, final C6111 c6111) {
        this(view, new BooleanSupplier() { // from class: l.᩷᩵ۖ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return c6111.m17004();
            }
        }, c6111);
        C13638.requireNonNull(c6111);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C16839(View view, BooleanSupplier booleanSupplier, InterfaceC11612 interfaceC11612) {
        this.f53883 = booleanSupplier;
        C23895 c23895 = (C23895) view.findViewById(R.id.MT_Protector);
        this.f53884 = c23895;
        C12606 c12606 = (C12606) view.findViewById(R.id.MT_Protector);
        this.f53885 = c12606;
        m39492();
        c12606.m31379(c23895, interfaceC11612, interfaceC11612 instanceof View ? (View) interfaceC11612 : null);
        c23895.m52679(new C0610());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m39487() {
        return f53879;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m39489(boolean z) {
        C1679.m5597(ApplicationC0716.f2992, "tfrge", z);
        f53879 = z;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m39484() {
        return f53881;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m39491(boolean z) {
        if (f53881 != z) {
            f53881 = z;
            C4716.m13050("tfcge", 5000L, new RunnableC7667(0));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39494(boolean z) {
        C12606 c12606 = this.f53885;
        C23895 c23895 = this.f53884;
        if (z) {
            c23895.setVisibility(0);
            c12606.setVisibility(0);
        } else {
            c23895.setVisibility(8);
            c12606.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39492() {
        m39494(ApplicationC0716.f2988.getBoolean("symbol_input", true) && !this.f53883.getAsBoolean());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39493(InterfaceC1423 interfaceC1423, InterfaceC4433 interfaceC4433, C10948 c10948, C10948 c10949) {
        ArrayList arrayList = new ArrayList(C7754.m20409());
        int iM16969 = interfaceC4433.mo11315().m16969();
        C23895 c23895 = this.f53884;
        c23895.setBackgroundColor(iM16969);
        c23895.m52678(arrayList, interfaceC4433, c10948, c10949);
        c23895.m52676(f53882);
        C7754.m20410().m44959(interfaceC1423, new C16134(0, this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39486(C16839 c16839) {
        c16839.f53884.m52677(new ArrayList(C7754.m20409()));
        c16839.m39492();
    }
}
