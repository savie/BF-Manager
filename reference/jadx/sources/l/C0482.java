package l;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: l.֡ܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U647 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0482 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public SharedPreferences f2111;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f2112;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C10176 f2113;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f2114 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f2115;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC18381 f2116;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Object f2117;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC14651 f2118;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public SharedPreferences.Editor f2119;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f2120;

    public C0482(Context context) {
        this.f2112 = context;
        m2330(context.getPackageName() + "_preferences");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences m2326(Context context) {
        return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m2340() {
        long j;
        synchronized (this) {
            j = this.f2114;
            this.f2114 = 1 + j;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2330(String str) {
        this.f2115 = str;
        this.f2111 = null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final SharedPreferences m2338() {
        if (this.f2111 == null) {
            this.f2111 = this.f2112.getSharedPreferences(this.f2115, 0);
        }
        return this.f2111;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C10176 m2339() {
        return this.f2113;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m2335(C10176 c10176) {
        C10176 c10177 = this.f2113;
        if (c10176 == c10177) {
            return false;
        }
        if (c10177 != null) {
            c10177.mo12581();
        }
        this.f2113 = c10176;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3906 m2328(CharSequence charSequence) {
        C10176 c10176 = this.f2113;
        if (c10176 == null) {
            return null;
        }
        return c10176.m39850(charSequence);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SharedPreferences.Editor m2327() {
        if (this.f2120) {
            if (this.f2119 == null) {
                this.f2119 = m2338().edit();
            }
            return this.f2119;
        }
        return m2338().edit();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m2337() {
        return !this.f2120;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10176 m2329(Context context, int i, C10176 c10176) {
        this.f2120 = true;
        C10176 c10177 = (C10176) new C4211(context, this).m13464(i, c10176);
        c10177.m12568(this);
        SharedPreferences.Editor editor = this.f2119;
        if (editor != null) {
            editor.apply();
        }
        this.f2120 = false;
        return c10177;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2331(InterfaceC14651 interfaceC14651) {
        this.f2118 = interfaceC14651;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2332(AbstractC14937 abstractC14937) {
        InterfaceC14651 interfaceC14651 = this.f2118;
        if (interfaceC14651 != null) {
            interfaceC14651.mo16735(abstractC14937);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2333(InterfaceC18381 interfaceC18381) {
        this.f2116 = interfaceC18381;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC18381 m2341() {
        return this.f2116;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2334(InterfaceC21365 interfaceC21365) {
        this.f2117 = interfaceC21365;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.᩶ܰ᩷] */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21365 m2336() {
        return this.f2117;
    }
}
