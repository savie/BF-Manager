package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩵᩺ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4YZ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19769 {

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final Object f63513 = new Object();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C13685 f63514;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object f63515;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Runnable f63516;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f63517;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f63518;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f63519;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile Object f63520;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile Object f63521;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f63522;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f63523;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void mo44955() {
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void mo44962() {
    }

    public AbstractC19769(Object obj) {
        this.f63515 = new Object();
        this.f63514 = new C13685();
        this.f63517 = 0;
        this.f63521 = f63513;
        this.f63516 = new RunnableC21885(this);
        this.f63520 = obj;
        this.f63519 = 0;
    }

    public AbstractC19769() {
        this.f63515 = new Object();
        this.f63514 = new C13685();
        this.f63517 = 0;
        Object obj = f63513;
        this.f63521 = obj;
        this.f63516 = new RunnableC21885(this);
        this.f63520 = obj;
        this.f63519 = -1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m44954(AbstractC8480 abstractC8480) {
        if (abstractC8480.f29397) {
            if (!abstractC8480.mo22148()) {
                abstractC8480.m22147(false);
                return;
            }
            int i = abstractC8480.f29399;
            int i2 = this.f63519;
            if (i >= i2) {
                return;
            }
            abstractC8480.f29399 = i2;
            abstractC8480.f29396.mo1473(this.f63520);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44960(AbstractC8480 abstractC8480) {
        if (this.f63523) {
            this.f63518 = true;
            return;
        }
        this.f63523 = true;
        do {
            this.f63518 = false;
            if (abstractC8480 != null) {
                m44954(abstractC8480);
                abstractC8480 = null;
            } else {
                C9761 c9761M33392 = this.f63514.m33392();
                while (c9761M33392.hasNext()) {
                    m44954((AbstractC8480) ((Map.Entry) c9761M33392.next()).getValue());
                    if (this.f63518) {
                        break;
                    }
                }
            }
        } while (this.f63518);
        this.f63523 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44959(InterfaceC1423 interfaceC1423, InterfaceC10597 interfaceC10597) {
        m44953("observe");
        if (interfaceC1423.getLifecycle().mo9170() == EnumC9414.DESTROYED) {
            return;
        }
        C19063 c19063 = new C19063(this, interfaceC1423, interfaceC10597);
        AbstractC8480 abstractC8480 = (AbstractC8480) this.f63514.mo28103(interfaceC10597, c19063);
        if (abstractC8480 != null && !abstractC8480.mo22145(interfaceC1423)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC8480 != null) {
            return;
        }
        interfaceC1423.getLifecycle().mo9171(c19063);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44961(InterfaceC10597 interfaceC10597) {
        m44953("observeForever");
        C18357 c18357 = new C18357(this, interfaceC10597);
        AbstractC8480 abstractC8480 = (AbstractC8480) this.f63514.mo28103(interfaceC10597, c18357);
        if (abstractC8480 instanceof C19063) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC8480 != null) {
            return;
        }
        c18357.m22147(true);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m44963(InterfaceC10597 interfaceC10597) {
        m44953("removeObserver");
        AbstractC8480 abstractC8480 = (AbstractC8480) this.f63514.remove(interfaceC10597);
        if (abstractC8480 == null) {
            return;
        }
        abstractC8480.mo22146();
        abstractC8480.m22147(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44958(InterfaceC1423 interfaceC1423) {
        m44953("removeObservers");
        for (Map.Entry entry : this.f63514) {
            if (((AbstractC8480) entry.getValue()).mo22145(interfaceC1423)) {
                m44963((InterfaceC10597) entry.getKey());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo23641(Object obj) {
        boolean z;
        synchronized (this.f63515) {
            z = this.f63521 == f63513;
            this.f63521 = obj;
        }
        if (z) {
            C16816.m39456().m39457(this.f63516);
        }
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo23642(Object obj) {
        m44953("setValue");
        this.f63519++;
        this.f63520 = obj;
        m44960((AbstractC8480) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m44956() {
        Object obj = this.f63520;
        if (obj != f63513) {
            return obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m44964() {
        return this.f63514.size() > 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44957(int i) {
        int i2 = this.f63517;
        this.f63517 = i + i2;
        if (this.f63522) {
            return;
        }
        this.f63522 = true;
        while (true) {
            try {
                int i3 = this.f63517;
                if (i2 == i3) {
                    this.f63522 = false;
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    mo44962();
                } else if (z2) {
                    mo44955();
                }
                i2 = i3;
            } catch (Throwable th) {
                this.f63522 = false;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44953(String str) {
        if (!C16816.m39456().m39458()) {
            throw new IllegalStateException(C16523.m38890("Cannot invoke ", str, " on a background thread"));
        }
    }
}
