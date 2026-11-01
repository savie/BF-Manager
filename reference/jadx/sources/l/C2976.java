package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes2.dex */
public final class C2976 implements InterfaceC21404 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9328 f11145;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17876 f11146 = new C17876();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3764 f11147;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m8868(int i, String str) {
        if (this.f11147.m11009()) {
            return;
        }
        Iterator it = this.f11146.m41472(i, str).iterator();
        while (it.hasNext()) {
            C9328.m23981(this.f11145, this.f11147, (String) it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m8869(String str, String str2) {
        if (this.f11147.m11009()) {
            return;
        }
        Iterator it = this.f11146.m41473(str, str2).iterator();
        while (it.hasNext()) {
            C9328.m23981(this.f11145, this.f11147, (String) it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m8870(String str, String str2, String str3, C13644 c13644) {
        if (this.f11147.m11009()) {
            return;
        }
        for (String str4 : this.f11146.m41474(str, str2, c13644)) {
            if (!str4.equals(str)) {
                C9328.m23981(this.f11145, this.f11147, str4);
            }
        }
        C9328.m23982(this.f11145, this.f11147, str, c13644);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m8871(String str, String str2, String str3, C13644 c13644) {
        if (!this.f11147.m11009() && this.f11146.m41475(str, str2, c13644)) {
            C9328.m23982(this.f11145, this.f11147, str, c13644);
        }
    }

    public C2976(C9328 c9328, C3764 c3764) {
        this.f11145 = c9328;
        this.f11147 = c3764;
    }
}
