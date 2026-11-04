package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩻ܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBIH */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25194 extends AbstractC17734 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Object f81430;

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ۤ */
    public int mo9543() {
        return 0;
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ۤ */
    public final void mo37083(String str) {
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ܳ */
    public AbstractC17734 mo9544() {
        return this;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m56168() {
        Object obj = this.f81430;
        if (obj instanceof C10363) {
            return;
        }
        C10363 c10363 = new C10363();
        this.f81430 = c10363;
        if (obj != null) {
            c10363.put(mo5151(), (String) obj);
        }
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo37065() {
        return this.f81430 instanceof C10363;
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ۙ */
    public AbstractC17734 mo41528(String str, String str2) {
        if (!(this.f81430 instanceof C10363) && str.equals("#doctype")) {
            this.f81430 = str2;
            return this;
        }
        m56168();
        super.mo41528(str, str2);
        return this;
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ᩷ */
    public String mo41538(String str) {
        if (this.f81430 instanceof C10363) {
            return super.mo41538(str);
        }
        return mo5151().equals(str) ? (String) this.f81430 : "";
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ۙ */
    public final C10363 mo37069() {
        m56168();
        return (C10363) this.f81430;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String m56169() {
        return m56171();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m56171() {
        return mo41538(mo5151());
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String m56170() {
        return m56171();
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ᩸ */
    public boolean mo41539(String str) {
        m56168();
        return super.mo41539(str);
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ۙ */
    public String mo41526(String str) {
        m56168();
        return super.mo41526(str);
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ᩷ */
    public String mo37098() {
        return m41531() ? this.f58267.mo37098() : "";
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ۚ */
    public final List mo37075() {
        return AbstractC17734.f58266;
    }

    @Override // l.AbstractC17734
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17734 mo37070(AbstractC17734 abstractC17734) {
        AbstractC25194 abstractC25194 = (AbstractC25194) super.mo37070(abstractC17734);
        Object obj = this.f81430;
        if (obj instanceof C10363) {
            abstractC25194.f81430 = ((C10363) obj).clone();
        }
        return abstractC25194;
    }
}
