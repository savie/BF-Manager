package l;

import android.view.View;
import android.widget.EditText;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes3.dex */
public final class C11897 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C5546 f39911;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public transient String f39912;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C0690 f39913;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f39914;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public transient WeakReference f39915;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public transient int f39916;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f39917;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C14600 f39918;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f39919;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m29666(C0690 c0690, C14600 c14600) {
        C13465.m32966(c0690, "typeIcon");
        C13465.m32966(c14600, "icon");
        this.f39913 = c0690;
        this.f39918 = c14600;
        this.f39912 = null;
        this.f39915 = null;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final synchronized void m29675() {
        this.f39918 = null;
        this.f39916++;
        this.f39912 = null;
        this.f39915 = null;
    }

    public C11897(String str, String str2) {
        C13465.m32966(str, "name");
        C13465.m32966(str2, MotionUtils.EASING_TYPE_PATH);
        this.f39919 = str;
        this.f39917 = str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29669(AbstractActivityC12483 abstractActivityC12483) {
        C13465.m32966(abstractActivityC12483, "activity");
        C0690 c0690 = this.f39913;
        if (c0690 == null) {
            c0690 = C0690.f2873;
        }
        C5546 c5546 = this.f39911;
        C12628 c12628 = new C12628(abstractActivityC12483);
        c12628.m31413(this.f39919);
        c12628.m31414(new C14745(c0690));
        c12628.m31417(this.f39917);
        c12628.m31411();
        if (c5546 == null) {
            c12628.m31419(c0690 == C0690.f2900 ? "goto" : "locate");
        } else {
            c12628.m31419("open-ns");
            c12628.m31412(c5546.m15296());
            c12628.m31415(c5546.m15295());
        }
        c12628.m31418();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29670(AbstractActivityC12483 abstractActivityC12483, Runnable runnable) {
        C13465.m32966(abstractActivityC12483, "activity");
        C14014 c14014 = new C14014(abstractActivityC12483, this, runnable);
        c14014.m47198(R.string.MT_Protector);
        c14014.m47195(R.string.MT_Protector, this.f39919);
        c14014.m47195(R.string.MT_Protector, this.f39917);
        C5546 c5546 = this.f39911;
        if (c5546 != null) {
            c14014.m47195(R.string.MT_Protector, null);
            TextInputLayout textInputLayoutM47200 = c14014.m47200(2);
            EditText editTextM47193 = c14014.m47193(2);
            editTextM47193.setKeyListener(null);
            AbstractC12068 abstractC12068M15770 = C5717.m15770(c5546.m15296());
            editTextM47193.setText(abstractC12068M15770 != null ? abstractC12068M15770.getName() : null);
            textInputLayoutM47200.setExpandedHintEnabled(false);
            textInputLayoutM47200.setEndIconMode(-1);
            textInputLayoutM47200.setEndIconDrawable(R.drawable.MT_Protector);
            ArrayList arrayList = new ArrayList(C5717.m15769());
            C21931 c21931 = new C21931();
            c21931.f71137 = arrayList.indexOf(abstractC12068M15770);
            final ViewOnClickListenerC1996 viewOnClickListenerC1996 = new ViewOnClickListenerC1996(editTextM47193, abstractActivityC12483, (CharSequence[]) C9030.stream(arrayList).map(new C23870(0, new C11170())).toArray(new C14698(0)), c21931, arrayList, textInputLayoutM47200);
            textInputLayoutM47200.setEndIconOnClickListener(viewOnClickListenerC1996);
            editTextM47193.setOnClickListener(viewOnClickListenerC1996);
            if (c21931.f71137 == -1) {
                editTextM47193.requestFocus();
                textInputLayoutM47200.setError(C16737.m39288(R.string.MT_Protector));
            }
            editTextM47193.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.ۢᩳ᩹
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        viewOnClickListenerC1996.onClick(view);
                    }
                }
            });
            if (c21931.f71137 == -1) {
                c14014.m47192();
                return;
            }
        }
        c14014.m47192();
        C16737.m39274(new RunnableC3185(4, c14014), 200L);
        c14014.m47193(0).selectAll();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29680(String str) {
        C13465.m32966(str, "<set-?>");
        this.f39919 = str;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m29681() {
        return this.f39919;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29671(C14600 c14600) {
        this.f39918 = c14600;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14600 m29679() {
        return this.f39918;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C0690 m29661() {
        return this.f39913;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29665(C0690 c0690) {
        this.f39913 = c0690;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29662(int i) {
        this.f39916 = i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m29676() {
        return this.f39916;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m29660() {
        return this.f39912;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29663(String str) {
        this.f39912 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29664(WeakReference weakReference) {
        this.f39915 = weakReference;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final WeakReference m29674() {
        return this.f39915;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m29678() {
        return this.f39917;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m29677(String str) {
        if (C13465.m32965((Object) this.f39917, (Object) str)) {
            return;
        }
        this.f39917 = str;
        synchronized (this) {
            this.f39913 = null;
            this.f39918 = null;
            this.f39916++;
            this.f39912 = null;
            this.f39915 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29672(boolean z) {
        this.f39914 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29673() {
        return this.f39914;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C5546 m29659() {
        return this.f39911;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29667(C5546 c5546) {
        C5546 c5547;
        if (c5546 != null) {
            c5546.getClass();
            ConcurrentMapC13783 concurrentMapC13783 = (ConcurrentMapC13783) C23186.f75237;
            Object objComputeIfAbsent = C2492.computeIfAbsent(concurrentMapC13783, c5546, new C22798(1, new C2723(c5546)));
            C13465.m32967(objComputeIfAbsent, "computeIfAbsent(...)");
            c5547 = (C5546) objComputeIfAbsent;
        } else {
            c5547 = null;
        }
        this.f39911 = c5547;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29668(C11018 c11018) {
        c11018.m27786(this.f39919);
        c11018.m27786(this.f39917);
        C5546 c5546 = this.f39911;
        if (c5546 != null) {
            c11018.mo24508(0);
            c11018.m27786(c5546.m15292().toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C11897.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C13465.m32963(obj, "null cannot be cast to non-null type bin.mt.manager.bottom.BookmarksManager.Item");
        C11897 c11897 = (C11897) obj;
        return C13465.m32965((Object) this.f39919, (Object) c11897.f39919) && C13465.m32965((Object) this.f39917, (Object) c11897.f39917) && C13465.m32965(this.f39911, c11897.f39911);
    }

    public final int hashCode() {
        int iM33812 = C13958.m33812(this.f39919.hashCode() * 31, 31, this.f39917);
        C5546 c5546 = this.f39911;
        return iM33812 + (c5546 != null ? c5546.hashCode() : 0);
    }
}
