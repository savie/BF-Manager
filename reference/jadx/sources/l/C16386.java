package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: VB94 */
/* JADX INFO: loaded from: classes4.dex */
public class C16386 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC22654 f52724;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC0157 f52725;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public EnumC19914 f52726;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f52722 = new ArrayList();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final HashSet f52720 = new HashSet();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f52721 = false;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f52723 = false;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public void mo38578() {
    }

    public C16386(EnumC0157 enumC0157, EnumC19914 enumC19914, ComponentCallbacksC22654 componentCallbacksC22654, C0921 c0921) {
        this.f52725 = enumC0157;
        this.f52726 = enumC19914;
        this.f52724 = componentCallbacksC22654;
        c0921.m3652(new C15681(this));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC0157 m38577() {
        return this.f52725;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final EnumC19914 m38576() {
        return this.f52726;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC22654 m38571() {
        return this.f52724;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38572() {
        if (this.f52721) {
            return;
        }
        this.f52721 = true;
        HashSet hashSet = this.f52720;
        if (hashSet.isEmpty()) {
            mo38579();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            ((C0921) it.next()).m3651();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m38581() {
        return this.f52721;
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f52725 + "} {mLifecycleImpact = " + this.f52726 + "} {mFragment = " + this.f52724 + l.d;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38574(EnumC0157 enumC0157, EnumC19914 enumC19914) {
        int i = C7213.f24025[enumC19914.ordinal()];
        ComponentCallbacksC22654 componentCallbacksC22654 = this.f52724;
        if (i == 1) {
            if (this.f52725 == EnumC0157.REMOVED) {
                if (AbstractC8894.m23060(2)) {
                    C13638.toString(componentCallbacksC22654);
                    C13638.toString(this.f52726);
                }
                this.f52725 = EnumC0157.VISIBLE;
                this.f52726 = EnumC19914.ADDING;
                return;
            }
            return;
        }
        if (i == 2) {
            if (AbstractC8894.m23060(2)) {
                C13638.toString(componentCallbacksC22654);
                C13638.toString(this.f52725);
                C13638.toString(this.f52726);
            }
            this.f52725 = EnumC0157.REMOVED;
            this.f52726 = EnumC19914.REMOVING;
            return;
        }
        if (i == 3 && this.f52725 != EnumC0157.REMOVED) {
            if (AbstractC8894.m23060(2)) {
                C13638.toString(componentCallbacksC22654);
                C13638.toString(this.f52725);
                C13638.toString(enumC0157);
            }
            this.f52725 = enumC0157;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38573(Runnable runnable) {
        this.f52722.add(runnable);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m38580(C0921 c0921) {
        mo38578();
        this.f52720.add(c0921);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38575(C0921 c0921) {
        HashSet hashSet = this.f52720;
        if (hashSet.remove(c0921) && hashSet.isEmpty()) {
            mo38579();
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m38570() {
        return this.f52723;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void mo38579() {
        if (this.f52723) {
            return;
        }
        if (AbstractC8894.m23060(2)) {
            toString();
        }
        this.f52723 = true;
        Iterator it = this.f52722.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
