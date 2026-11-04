package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۫ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13289 extends AbstractC15001 implements InterfaceC9078 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f42440;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f42441;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C14473 f42442;

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C13289(int i) {
        this();
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2313clear() {
        m32828();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC7588 mo2313clear() {
        m32828();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2313clear() {
        m32828();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC15001 mo2313clear() {
        m32828();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC0479 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m32829(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC1225 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m32829(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC7588 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m32829(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC14299 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m32829(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC15001
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40290;
        c7544.m20621(C25224.class, C13289.class);
        return c7544;
    }

    public C13289() {
        this.f42441 = Collections.EMPTY_LIST;
    }

    public C13289(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        this.f42441 = Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32828() {
        super.mo2313clear();
        this.f42440 = 0;
        C14473 c14473 = this.f42442;
        if (c14473 == null) {
            this.f42441 = Collections.EMPTY_LIST;
        } else {
            this.f42441 = null;
            c14473.m34945();
        }
        this.f42440 &= -2;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40298;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C25224.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C25224.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C25224 c25224BuildPartial = buildPartial();
        if (c25224BuildPartial.isInitialized()) {
            return c25224BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c25224BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C25224 c25224BuildPartial = buildPartial();
        if (c25224BuildPartial.isInitialized()) {
            return c25224BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c25224BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C25224 buildPartial() {
        C25224 c25224 = new C25224(this, 0);
        C14473 c14473 = this.f42442;
        if (c14473 != null) {
            c25224.f81477 = c14473.m34950();
        } else {
            if ((this.f42440 & 1) != 0) {
                this.f42441 = C4681.unmodifiableList(this.f42441);
                this.f42440 &= -2;
            }
            c25224.f81477 = this.f42441;
        }
        onBuilt();
        return c25224;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C25224) {
            m32830((C25224) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C25224) {
            m32830((C25224) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32830(C25224 c25224) {
        if (c25224 == C25224.getDefaultInstance()) {
            return;
        }
        if (this.f42442 == null) {
            if (!c25224.f81477.isEmpty()) {
                if (this.f42441.isEmpty()) {
                    this.f42441 = c25224.f81477;
                    this.f42440 &= -2;
                } else {
                    if ((this.f42440 & 1) == 0) {
                        this.f42441 = new ArrayList(this.f42441);
                        this.f42440 |= 1;
                    }
                    this.f42441.addAll(c25224.f81477);
                }
                onChanged();
            }
        } else if (!c25224.f81477.isEmpty()) {
            if (!this.f42442.m34938()) {
                this.f42442.m34942(c25224.f81477);
            } else {
                this.f42442.m34954();
                C14473 c14473 = null;
                this.f42442 = null;
                List list = c25224.f81477;
                this.f42441 = list;
                this.f42440 &= -2;
                if (AbstractC9035.alwaysUseFieldBuilders) {
                    if (this.f42442 == null) {
                        this.f42442 = new C14473(list, false, getParentForChildren(), isClean());
                        this.f42441 = null;
                    }
                    c14473 = this.f42442;
                }
                this.f42442 = c14473;
            }
        }
        mo2317mergeUnknownFields(c25224.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32829(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 10) {
                            C11797 c11797 = (C11797) abstractC3660.mo11877(C11797.parser(), c24215);
                            C14473 c14473 = this.f42442;
                            if (c14473 != null) {
                                c14473.m34953(c11797);
                            } else {
                                if ((this.f42440 & 1) == 0) {
                                    this.f42441 = new ArrayList(this.f42441);
                                    this.f42440 |= 1;
                                }
                                this.f42441.add(c11797);
                            }
                        } else if (!super.parseUnknownField(abstractC3660, c24215, iMo11876)) {
                        }
                    }
                    z = true;
                } catch (C20463 e) {
                    throw e.m46971();
                }
            } catch (Throwable th) {
                onChanged();
                throw th;
            }
        }
        onChanged();
    }
}
