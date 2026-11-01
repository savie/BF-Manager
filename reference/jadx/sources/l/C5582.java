package l;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: l.ۚ᩶ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: U647 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5582 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC2759 f19165;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f19166;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public SharedPreferences f19167;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f19168;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC14050 f19169;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f19170;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f19171 = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C13344 f19172;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public SharedPreferences.Editor f19173;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Object f19174;

    public C5582(Context context) {
        this.f19168 = context;
        m15448(context.getPackageName() + "_preferences");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences m15442(Context context) {
        return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m15456() {
        long j;
        synchronized (this) {
            j = this.f19171;
            this.f19171 = 1 + j;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15448(String str) {
        this.f19170 = str;
        this.f19167 = null;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final SharedPreferences m15457() {
        if (this.f19167 == null) {
            this.f19167 = this.f19168.getSharedPreferences(this.f19170, 0);
        }
        return this.f19167;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C13344 m15454() {
        return this.f19172;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m15453(C13344 c13344) {
        C13344 c13345 = this.f19172;
        if (c13344 == c13345) {
            return false;
        }
        if (c13345 != null) {
            c13345.mo13172();
        }
        this.f19172 = c13344;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4751 m15446(CharSequence charSequence) {
        C13344 c13344 = this.f19172;
        if (c13344 == null) {
            return null;
        }
        return c13344.m31077(charSequence);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SharedPreferences.Editor m15445() {
        if (this.f19166) {
            if (this.f19173 == null) {
                this.f19173 = m15457().edit();
            }
            return this.f19173;
        }
        return m15457().edit();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m15443() {
        return !this.f19166;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13344 m15447(Context context, int i, C13344 c13344) {
        this.f19166 = true;
        C13344 c13345 = (C13344) new C4876(context, this).m13587(i, c13344);
        c13345.m13146(this);
        SharedPreferences.Editor editor = this.f19173;
        if (editor != null) {
            editor.apply();
        }
        this.f19166 = false;
        return c13345;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15451(InterfaceC14050 interfaceC14050) {
        this.f19169 = interfaceC14050;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15452(AbstractC14071 abstractC14071) {
        InterfaceC14050 interfaceC14050 = this.f19169;
        if (interfaceC14050 != null) {
            interfaceC14050.mo33996(abstractC14071);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15449(InterfaceC2759 interfaceC2759) {
        this.f19165 = interfaceC2759;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2759 m15444() {
        return this.f19165;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15450(InterfaceC11933 interfaceC11933) {
        this.f19174 = interfaceC11933;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ۨ᩶ܰ] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11933 m15455() {
        return this.f19174;
    }
}
