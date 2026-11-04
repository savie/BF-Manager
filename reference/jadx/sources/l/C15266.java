package l;

import android.os.Bundle;
import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.ܳۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M6BV */
/* JADX INFO: loaded from: classes4.dex */
public final class C15266 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24964 f49909;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C4826 f49910;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m36622() {
        if (!this.f49909.m55762()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C4826 c4826 = this.f49910;
        if (c4826 == null) {
            c4826 = new C4826(this);
        }
        this.f49910 = c4826;
        try {
            C18281.class.getDeclaredConstructor(null);
            C4826 c4827 = this.f49910;
            if (c4827 != null) {
                c4827.m14861(C18281.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + C18281.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36621(String str, InterfaceC19742 interfaceC19742) {
        C15243.m36590(interfaceC19742, d.M);
        this.f49909.m55759(str, interfaceC19742);
    }

    public C15266(C24964 c24964) {
        this.f49909 = c24964;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bundle m36619(String str) {
        return this.f49909.m55756(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19742 m36620() {
        return this.f49909.m55757();
    }
}
