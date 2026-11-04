package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܺ᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4YZ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17184 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Object f55999 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Runnable f56000;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f56001;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public volatile Object f56002;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile Object f56003;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f56004;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C15053 f56005;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f56006;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f56007;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f56008;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f56009;

    /* JADX INFO: renamed from: ۤ */
    public void mo21783() {
    }

    /* JADX INFO: renamed from: ᩸ */
    public void mo21784() {
    }

    public AbstractC17184(Object obj) {
        this.f56009 = new Object();
        this.f56005 = new C15053();
        this.f56001 = 0;
        this.f56002 = f55999;
        this.f56000 = new RunnableC5998(this);
        this.f56003 = obj;
        this.f56004 = 0;
    }

    public AbstractC17184() {
        this.f56009 = new Object();
        this.f56005 = new C15053();
        this.f56001 = 0;
        Object obj = f55999;
        this.f56002 = obj;
        this.f56000 = new RunnableC5998(this);
        this.f56003 = obj;
        this.f56004 = -1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m40345(AbstractC25390 abstractC25390) {
        if (abstractC25390.f81965) {
            if (!abstractC25390.mo7700()) {
                abstractC25390.m56748(false);
                return;
            }
            int i = abstractC25390.f81967;
            int i2 = this.f56004;
            if (i >= i2) {
                return;
            }
            abstractC25390.f81967 = i2;
            abstractC25390.f81966.mo1486(this.f56003);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40352(AbstractC25390 abstractC25390) {
        if (this.f56006) {
            this.f56007 = true;
            return;
        }
        this.f56006 = true;
        do {
            this.f56007 = false;
            if (abstractC25390 != null) {
                m40345(abstractC25390);
                abstractC25390 = null;
            } else {
                C10578 c10578M36206 = this.f56005.m36206();
                while (c10578M36206.hasNext()) {
                    m40345((AbstractC25390) ((Map.Entry) c10578M36206.next()).getValue());
                    if (this.f56007) {
                        break;
                    }
                }
            }
        } while (this.f56007);
        this.f56006 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40350(InterfaceC11217 interfaceC11217, InterfaceC16438 interfaceC16438) {
        m40344("observe");
        if (interfaceC11217.getLifecycle().mo23076() == EnumC2619.DESTROYED) {
            return;
        }
        C11963 c11963 = new C11963(this, interfaceC11217, interfaceC16438);
        AbstractC25390 abstractC25390 = (AbstractC25390) this.f56005.mo20394(interfaceC16438, c11963);
        if (abstractC25390 != null && !abstractC25390.mo29940(interfaceC11217)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC25390 != null) {
            return;
        }
        interfaceC11217.getLifecycle().mo23077(c11963);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40351(InterfaceC16438 interfaceC16438) {
        m40344("observeForever");
        C2269 c2269 = new C2269(this, interfaceC16438);
        AbstractC25390 abstractC25390 = (AbstractC25390) this.f56005.mo20394(interfaceC16438, c2269);
        if (abstractC25390 instanceof C11963) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC25390 != null) {
            return;
        }
        c2269.m56748(true);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m40354(InterfaceC16438 interfaceC16438) {
        m40344("removeObserver");
        AbstractC25390 abstractC25390 = (AbstractC25390) this.f56005.remove(interfaceC16438);
        if (abstractC25390 == null) {
            return;
        }
        abstractC25390.mo29939();
        abstractC25390.m56748(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40349(InterfaceC11217 interfaceC11217) {
        m40344("removeObservers");
        for (Map.Entry entry : this.f56005) {
            if (((AbstractC25390) entry.getValue()).mo29940(interfaceC11217)) {
                m40354((InterfaceC16438) entry.getKey());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo40348(Object obj) {
        boolean z;
        synchronized (this.f56009) {
            z = this.f56002 == f55999;
            this.f56002 = obj;
        }
        if (z) {
            C1475.m5264().m5265(this.f56000);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo40353(Object obj) {
        m40344("setValue");
        this.f56004++;
        this.f56003 = obj;
        m40352((AbstractC25390) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m40346() {
        Object obj = this.f56003;
        if (obj != f55999) {
            return obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m40355() {
        return this.f56005.size() > 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40347(int i) {
        int i2 = this.f56001;
        this.f56001 = i + i2;
        if (this.f56008) {
            return;
        }
        this.f56008 = true;
        while (true) {
            try {
                int i3 = this.f56001;
                if (i2 == i3) {
                    this.f56008 = false;
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    mo21783();
                } else if (z2) {
                    mo21784();
                }
                i2 = i3;
            } catch (Throwable th) {
                this.f56008 = false;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40344(String str) {
        if (!C1475.m5264().m5266()) {
            throw new IllegalStateException(C14442.m34865("Cannot invoke ", str, " on a background thread"));
        }
    }
}
