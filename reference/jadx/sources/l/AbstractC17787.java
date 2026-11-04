package l;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܽᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7TM */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17787 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C24132 f58373;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f58374;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C1380 f58375;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f58376;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Executor f58377;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f58378;

    static {
        ApplicationC23172.m52091(131);
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract C17041 mo23701(int i, CharSequence charSequence);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo41619(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo41620(C24132 c24132) {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo23702(C24132 c24132, CharSequence charSequence);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final native void m41624(CharSequence charSequence, int i, int i2, int i3);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean mo41627(C24132 c24132, CharSequence charSequence) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.֫ᩴᩴ] */
    public AbstractC17787(Context context) {
        ExecutorService executorService = C5261.f18540;
        this.f58376 = new AtomicInteger();
        this.f58377 = executorService;
        C1380 c1380 = new C1380(context, 240);
        this.f58375 = c1380;
        c1380.m5066(new AdapterView.OnItemClickListener() { // from class: l.ۚᩴᩴ
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                AbstractC17787.m41616(this.f20093, i);
            }
        });
        c1380.m5068((C2126) new AdapterView.OnItemLongClickListener() { // from class: l.֫ᩴᩴ
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
                return AbstractC17787.m41617(this.f7004, i);
            }
        });
        m41623();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41616(AbstractC17787 abstractC17787, int i) {
        abstractC17787.mo23702(abstractC17787.f58373, abstractC17787.f58375.m5064(i));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m41617(AbstractC17787 abstractC17787, int i) {
        return abstractC17787.mo41627(abstractC17787.f58373, abstractC17787.f58375.m5064(i));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m41623() {
        int i = ApplicationC17729.f58262.getInt("comp_max_lines", 3);
        if (i == this.f58378) {
            return;
        }
        C1380 c1380 = this.f58375;
        int iM5072 = c1380.m5072();
        this.f58378 = i;
        int i2 = (iM5072 / 4) + (i * iM5072);
        this.f58374 = i2;
        c1380.m5073(i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41618() {
        return this.f58374;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m41625(C24132 c24132) {
        this.f58373 = c24132;
        this.f58376.incrementAndGet();
        mo41620(c24132);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m41626() {
        C1380 c1380 = this.f58375;
        if (!c1380.m5074() || c1380.m5070() || !ApplicationC17729.f58262.getBoolean("comp_enter_accept", true)) {
            return false;
        }
        mo23702(this.f58373, c1380.m5064(0));
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m41622(C24132 c24132) {
        if (this.f58373 == c24132) {
            this.f58373 = null;
            m41621();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m41628() {
        C24132 c24132 = this.f58373;
        if (c24132 == null) {
            return;
        }
        boolean zM44078 = C18978.m44078();
        AtomicInteger atomicInteger = this.f58376;
        if (zM44078 && ApplicationC17729.f58258.getBoolean("cc", true)) {
            int iM53968 = c24132.m53968();
            if (iM53968 == c24132.m53882()) {
                InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
                atomicInteger.incrementAndGet();
                m41615((CharSequence) interfaceC19106M54021, iM53968, -1, false);
                return;
            } else {
                atomicInteger.incrementAndGet();
                m41621();
                return;
            }
        }
        atomicInteger.incrementAndGet();
        m41621();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41615(CharSequence charSequence, int i, int i2, boolean z) {
        C24132 c24132 = this.f58373;
        if (c24132 == null) {
            return;
        }
        if (z && !c24132.m54033()) {
            m41621();
            return;
        }
        C15508 c15508Mo15350 = charSequence instanceof InterfaceC9629 ? ((InterfaceC9629) charSequence).mo15350() : null;
        if (c15508Mo15350 != null) {
            charSequence = c15508Mo15350;
        }
        try {
            C17041 c17041Mo23701 = mo23701(i, charSequence);
            if (c15508Mo15350 != null) {
                c15508Mo15350.close();
            }
            if (c17041Mo23701 == null || c17041Mo23701.isEmpty() || (i2 >= 0 && i2 < c17041Mo23701.m40151())) {
                m41621();
            } else {
                if (((C11650.f37687.intValue() ^ C21576.m49056().uid) ^ (-1913575638)) != 0) {
                    return;
                }
                m41623();
                C1380 c1380 = this.f58375;
                c1380.m5067(c17041Mo23701);
                c1380.m5069(this.f58373, i);
            }
        } catch (Throwable th) {
            if (c15508Mo15350 != null) {
                try {
                    c15508Mo15350.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m41621() {
        this.f58375.m5065();
    }
}
