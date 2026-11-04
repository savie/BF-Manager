package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: VB94 */
/* JADX INFO: loaded from: classes5.dex */
public class C20981 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC11612 f67086;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public EnumC3827 f67088;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumC14267 f67090;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f67085 = new ArrayList();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final HashSet f67087 = new HashSet();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f67091 = false;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f67089 = false;

    /* JADX INFO: renamed from: ۚ */
    public void mo17571() {
    }

    public C20981(EnumC14267 enumC14267, EnumC3827 enumC3827, ComponentCallbacksC11612 componentCallbacksC11612, C24947 c24947) {
        this.f67090 = enumC14267;
        this.f67088 = enumC3827;
        this.f67086 = componentCallbacksC11612;
        c24947.m55704(new C23965(this));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC14267 m47959() {
        return this.f67090;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final EnumC3827 m47962() {
        return this.f67088;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC11612 m47964() {
        return this.f67086;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47955() {
        if (this.f67091) {
            return;
        }
        this.f67091 = true;
        HashSet hashSet = this.f67087;
        if (hashSet.isEmpty()) {
            mo17572();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            ((C24947) it.next()).m55703();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m47961() {
        return this.f67091;
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f67090 + "} {mLifecycleImpact = " + this.f67088 + "} {mFragment = " + this.f67086 + l.d;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47957(EnumC14267 enumC14267, EnumC3827 enumC3827) {
        int i = C12030.f38766[enumC3827.ordinal()];
        ComponentCallbacksC11612 componentCallbacksC11612 = this.f67086;
        if (i == 1) {
            if (this.f67090 == EnumC14267.REMOVED) {
                if (AbstractC3191.m10427(2)) {
                    C17359.toString(componentCallbacksC11612);
                    C17359.toString(this.f67088);
                }
                this.f67090 = EnumC14267.VISIBLE;
                this.f67088 = EnumC3827.ADDING;
                return;
            }
            return;
        }
        if (i == 2) {
            if (AbstractC3191.m10427(2)) {
                C17359.toString(componentCallbacksC11612);
                C17359.toString(this.f67090);
                C17359.toString(this.f67088);
            }
            this.f67090 = EnumC14267.REMOVED;
            this.f67088 = EnumC3827.REMOVING;
            return;
        }
        if (i == 3 && this.f67090 != EnumC14267.REMOVED) {
            if (AbstractC3191.m10427(2)) {
                C17359.toString(componentCallbacksC11612);
                C17359.toString(this.f67090);
                C17359.toString(enumC14267);
            }
            this.f67090 = enumC14267;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47956(Runnable runnable) {
        this.f67085.add(runnable);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m47963(C24947 c24947) {
        mo17571();
        this.f67087.add(c24947);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47958(C24947 c24947) {
        HashSet hashSet = this.f67087;
        if (hashSet.remove(c24947) && hashSet.isEmpty()) {
            mo17572();
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m47960() {
        return this.f67089;
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo17572() {
        if (this.f67089) {
            return;
        }
        if (AbstractC3191.m10427(2)) {
            toString();
        }
        this.f67089 = true;
        Iterator it = this.f67085.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
