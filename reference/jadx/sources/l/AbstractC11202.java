package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۧ᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBIH */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11202 extends AbstractC14730 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Object f37918;

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ۖ */
    public int mo2831() {
        return 0;
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ۨ */
    public final void mo2854(String str) {
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ᩹ */
    public AbstractC14730 mo2867() {
        return this;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m28138() {
        Object obj = this.f37918;
        if (obj instanceof C15436) {
            return;
        }
        C15436 c15436 = new C15436();
        this.f37918 = c15436;
        if (obj != null) {
            c15436.put(mo2863(), (String) obj);
        }
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ۘ */
    public final boolean mo2836() {
        return this.f37918 instanceof C15436;
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ۙ */
    public AbstractC14730 mo20268(String str, String str2) {
        if (!(this.f37918 instanceof C15436) && str.equals("#doctype")) {
            this.f37918 = str2;
            return this;
        }
        m28138();
        super.mo20268(str, str2);
        return this;
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String mo28144(String str) {
        if (this.f37918 instanceof C15436) {
            return super.mo28144(str);
        }
        return mo2863().equals(str) ? (String) this.f37918 : "";
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ۙ */
    public final C15436 mo2839() {
        m28138();
        return (C15436) this.f37918;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String m28143() {
        return m28139();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String m28139() {
        return mo28144(mo2863());
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String m28142() {
        return m28139();
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean mo28140(String str) {
        m28138();
        return super.mo28140(str);
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String mo28141(String str) {
        m28138();
        return super.mo28141(str);
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ۨ */
    public String mo2853() {
        return m35266() ? this.f48150.mo2853() : "";
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ۬ */
    public final List mo2858() {
        return AbstractC14730.f48149;
    }

    @Override // l.AbstractC14730
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC14730 mo2838(AbstractC14730 abstractC14730) {
        AbstractC11202 abstractC11202 = (AbstractC11202) super.mo2838(abstractC14730);
        Object obj = this.f37918;
        if (obj instanceof C15436) {
            abstractC11202.f37918 = ((C15436) obj).clone();
        }
        return abstractC11202;
    }
}
