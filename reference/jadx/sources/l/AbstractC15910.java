package l;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܺۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7TM */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15910 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f51517;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C6111 f51518;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f51519;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f51520;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Executor f51521;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C2233 f51522;

    static {
        ApplicationC6132.m17119(135);
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract C20848 mo30806(int i, CharSequence charSequence);

    /* JADX INFO: renamed from: ۙ */
    public void mo30807(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo30808(C6111 c6111) {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo30809(C6111 c6111, CharSequence charSequence);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final native void m37829(CharSequence charSequence, int i, int i2, int i3);

    /* JADX INFO: renamed from: ܰ */
    public boolean mo30810(C6111 c6111, CharSequence charSequence) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.ۡۨۚ] */
    public AbstractC15910(Context context) {
        ExecutorService executorService = C4716.f16636;
        this.f51519 = new AtomicInteger();
        this.f51521 = executorService;
        C2233 c2233 = new C2233(context, 240);
        this.f51522 = c2233;
        c2233.m6863(new AdapterView.OnItemClickListener() { // from class: l.᩵ۨۚ
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                AbstractC15910.m37822(this.f62600, i);
            }
        });
        c2233.m6866((C8854) new AdapterView.OnItemLongClickListener() { // from class: l.ۡۨۚ
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
                return AbstractC15910.m37823(this.f30398, i);
            }
        });
        m37826();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37822(AbstractC15910 abstractC15910, int i) {
        abstractC15910.mo30809(abstractC15910.f51518, abstractC15910.f51522.m6861(i));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m37823(AbstractC15910 abstractC15910, int i) {
        return abstractC15910.mo30810(abstractC15910.f51518, abstractC15910.f51522.m6861(i));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m37826() {
        int i = ApplicationC0716.f2988.getInt("comp_max_lines", 3);
        if (i == this.f51517) {
            return;
        }
        C2233 c2233 = this.f51522;
        int iM6869 = c2233.m6869();
        this.f51517 = i;
        int i2 = (iM6869 / 4) + (i * iM6869);
        this.f51520 = i2;
        c2233.m6870(i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m37825() {
        return this.f51520;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m37830(C6111 c6111) {
        this.f51518 = c6111;
        this.f51519.incrementAndGet();
        mo30808(c6111);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m37831() {
        C2233 c2233 = this.f51522;
        if (!c2233.m6860() || c2233.m6868() || !ApplicationC0716.f2988.getBoolean("comp_enter_accept", true)) {
            return false;
        }
        mo30809(this.f51518, c2233.m6861(0));
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m37828(C6111 c6111) {
        if (this.f51518 == c6111) {
            this.f51518 = null;
            m37827();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m37824() {
        C6111 c6111 = this.f51518;
        if (c6111 == null) {
            return;
        }
        boolean zM5693 = C1709.m5693();
        AtomicInteger atomicInteger = this.f51519;
        if (zM5693 && ApplicationC0716.f2992.getBoolean("cc", true)) {
            int iM16916 = c6111.m16916();
            if (iM16916 == c6111.m17020()) {
                InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
                atomicInteger.incrementAndGet();
                m37821((CharSequence) interfaceC2916M17000, iM16916, -1, false);
                return;
            } else {
                atomicInteger.incrementAndGet();
                m37827();
                return;
            }
        }
        atomicInteger.incrementAndGet();
        m37827();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37821(CharSequence charSequence, int i, int i2, boolean z) {
        C6111 c6111 = this.f51518;
        if (c6111 == null) {
            return;
        }
        if (z && !c6111.m17061()) {
            m37827();
            return;
        }
        C3329 c3329Mo2399 = charSequence instanceof InterfaceC0507 ? ((InterfaceC0507) charSequence).mo2399() : null;
        if (c3329Mo2399 != null) {
            charSequence = c3329Mo2399;
        }
        try {
            C20848 c20848Mo30806 = mo30806(i, charSequence);
            if (c3329Mo2399 != null) {
                c3329Mo2399.close();
            }
            if (c20848Mo30806 == null || c20848Mo30806.isEmpty() || (i2 >= 0 && i2 < c20848Mo30806.m46874())) {
                m37827();
            } else {
                if (((C21444.f69717.intValue() ^ C16737.m39261().uid) ^ (-1913575638)) != 0) {
                    return;
                }
                m37826();
                C2233 c2233 = this.f51522;
                c2233.m6864(c20848Mo30806);
                c2233.m6865(this.f51518, i);
            }
        } catch (Throwable th) {
            if (c3329Mo2399 != null) {
                try {
                    c3329Mo2399.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m37827() {
        this.f51522.m6862();
    }
}
