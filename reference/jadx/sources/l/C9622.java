package l;

import android.view.View;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡ᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes3.dex */
public final class C9622 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C20613 f31122;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f31123;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f31124;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public transient int f31125;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C8877 f31126;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f31127;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public transient WeakReference f31128;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C11983 f31129;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient String f31130;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m25114(C20613 c20613, C11983 c11983) {
        C15243.m36590(c20613, "typeIcon");
        C15243.m36590(c11983, "icon");
        this.f31122 = c20613;
        this.f31129 = c11983;
        this.f31130 = null;
        this.f31128 = null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m25120() {
        this.f31129 = null;
        this.f31125++;
        this.f31130 = null;
        this.f31128 = null;
    }

    public C9622(String str, String str2) {
        C15243.m36590(str, "name");
        C15243.m36590(str2, MotionUtils.EASING_TYPE_PATH);
        this.f31127 = str;
        this.f31124 = str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25111(AbstractActivityC17204 abstractActivityC17204) {
        C15243.m36590(abstractActivityC17204, "activity");
        C20613 c20613 = this.f31122;
        if (c20613 == null) {
            c20613 = C20613.f66045;
        }
        C8877 c8877 = this.f31126;
        C0364 c0364 = new C0364(abstractActivityC17204);
        c0364.m2131(this.f31127);
        c0364.m2132(new C9312(c20613));
        c0364.m2135(this.f31124);
        c0364.m2129();
        if (c8877 == null) {
            c0364.m2137(c20613 == C20613.f66109 ? "goto" : "locate");
        } else {
            c0364.m2137("open-ns");
            c0364.m2130(c8877.m23755());
            c0364.m2133(c8877.m23754());
        }
        c0364.m2136();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25112(AbstractActivityC17204 abstractActivityC17204, Runnable runnable) {
        C15243.m36590(abstractActivityC17204, "activity");
        C1420 c1420 = new C1420(abstractActivityC17204, this, runnable);
        c1420.m25513(R.string.MT_Protector);
        c1420.m25511(R.string.MT_Protector, this.f31127);
        c1420.m25511(R.string.MT_Protector, this.f31124);
        C8877 c8877 = this.f31126;
        if (c8877 != null) {
            c1420.m25511(R.string.MT_Protector, null);
            C1626 c1626M25516 = c1420.m25516(2);
            C23255 c23255M25509 = c1420.m25509(2);
            c23255M25509.m54107(true);
            c23255M25509.setOnTouchListener(null);
            AbstractC0148 abstractC0148M20792 = C7606.m20792(c8877.m23755());
            c23255M25509.mo52335((CharSequence) (abstractC0148M20792 != null ? abstractC0148M20792.getName() : null));
            c1626M25516.m5771();
            c1626M25516.m5767(-1);
            c1626M25516.m5757(R.drawable.MT_Protector);
            ArrayList arrayList = new ArrayList(C7606.m20791());
            C11514 c11514 = new C11514();
            c11514.f36230 = arrayList.indexOf(abstractC0148M20792);
            final ViewOnClickListenerC0674 viewOnClickListenerC0674 = new ViewOnClickListenerC0674(c23255M25509, abstractActivityC17204, (CharSequence[]) C1170.stream(arrayList).map(new C2573(1, new C21557())).toArray(new C18573()), c11514, arrayList, c1626M25516);
            c1626M25516.m5759(viewOnClickListenerC0674);
            c23255M25509.setOnClickListener(viewOnClickListenerC0674);
            if (c11514.f36230 == -1) {
                c23255M25509.requestFocus();
                c1626M25516.m5768(C21576.m49088(R.string.MT_Protector));
            }
            c23255M25509.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.۟᩶ܳ
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        viewOnClickListenerC0674.onClick(view);
                    }
                }
            });
            if (c11514.f36230 == -1) {
                c1420.m25517();
                return;
            }
        }
        c1420.m25517();
        C21576.m49069(new RunnableC12350(2, c1420), 200L);
        c1420.m25509(0).m52289();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m25125(String str) {
        C15243.m36590(str, "<set-?>");
        this.f31127 = str;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m25122() {
        return this.f31127;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25110(C11983 c11983) {
        this.f31129 = c11983;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11983 m25124() {
        return this.f31129;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20613 m25104() {
        return this.f31122;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25113(C20613 c20613) {
        this.f31122 = c20613;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25105(int i) {
        this.f31125 = i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m25118() {
        return this.f31125;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25106(String str) {
        this.f31130 = str;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m25126() {
        return this.f31130;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25107(WeakReference weakReference) {
        this.f31128 = weakReference;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final WeakReference m25123() {
        return this.f31128;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m25117() {
        return this.f31124;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m25119(String str) {
        if (C15243.m36589((Object) this.f31124, (Object) str)) {
            return;
        }
        this.f31124 = str;
        synchronized (this) {
            this.f31122 = null;
            this.f31129 = null;
            this.f31125++;
            this.f31130 = null;
            this.f31128 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25115(boolean z) {
        this.f31123 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25116() {
        return this.f31123;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C8877 m25121() {
        return this.f31126;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25109(C8877 c8877) {
        C8877 c8878;
        if (c8877 != null) {
            c8877.getClass();
            ConcurrentMapC17249 concurrentMapC17249 = (ConcurrentMapC17249) C22961.f74588;
            Object objComputeIfAbsent = C23217.computeIfAbsent(concurrentMapC17249, c8877, new C0856(1, new C2911(c8877)));
            C15243.m36591(objComputeIfAbsent, "computeIfAbsent(...)");
            c8878 = (C8877) objComputeIfAbsent;
        } else {
            c8878 = null;
        }
        this.f31126 = c8878;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25108(C6178 c6178) {
        c6178.m17800(this.f31127);
        c6178.m17800(this.f31124);
        C8877 c8877 = this.f31126;
        if (c8877 != null) {
            c6178.mo17812(0);
            c6178.m17800(c8877.m23756().toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C9622.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C15243.m36587(obj, "null cannot be cast to non-null type bin.mt.manager.bottom.BookmarksManager.Item");
        C9622 c9622 = (C9622) obj;
        return C15243.m36589((Object) this.f31127, (Object) c9622.f31127) && C15243.m36589((Object) this.f31124, (Object) c9622.f31124) && C15243.m36589(this.f31126, c9622.f31126);
    }

    public final int hashCode() {
        int iM30817 = C12351.m30817(this.f31127.hashCode() * 31, 31, this.f31124);
        C8877 c8877 = this.f31126;
        return iM30817 + (c8877 != null ? c8877.hashCode() : 0);
    }
}
