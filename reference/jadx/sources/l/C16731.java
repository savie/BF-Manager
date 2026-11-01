package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܽܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16731 extends AbstractC0584 implements InterfaceC18266 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public List f53582;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f53583;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C22190 f53584;

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C16731(int i) {
        this();
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0584 mo2777clear() {
        m39244();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2777clear() {
        m39244();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC6977 mo2777clear() {
        m39244();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2777clear() {
        m39244();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC3967 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m39245(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC6977 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m39245(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC21607 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m39245(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC22500 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m39245(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC0584
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46266;
        c6956.m18696(C11087.class, C16731.class);
        return c6956;
    }

    public C16731() {
        this.f53582 = Collections.EMPTY_LIST;
    }

    public C16731(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        this.f53582 = Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39244() {
        super.mo2777clear();
        this.f53583 = 0;
        C22190 c22190 = this.f53584;
        if (c22190 == null) {
            this.f53582 = Collections.EMPTY_LIST;
        } else {
            this.f53582 = null;
            c22190.m49245();
        }
        this.f53583 &= -2;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46317;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C11087.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C11087.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C11087 c11087BuildPartial = buildPartial();
        if (c11087BuildPartial.isInitialized()) {
            return c11087BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c11087BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C11087 c11087BuildPartial = buildPartial();
        if (c11087BuildPartial.isInitialized()) {
            return c11087BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c11087BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C11087 buildPartial() {
        C11087 c11087 = new C11087(this, 0);
        C22190 c22190 = this.f53584;
        if (c22190 != null) {
            c11087.f37639 = c22190.m49248();
        } else {
            if ((this.f53583 & 1) != 0) {
                this.f53582 = C0561.unmodifiableList(this.f53582);
                this.f53583 &= -2;
            }
            c11087.f37639 = this.f53582;
        }
        onBuilt();
        return c11087;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C11087) {
            m39246((C11087) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C11087) {
            m39246((C11087) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39246(C11087 c11087) {
        if (c11087 == C11087.getDefaultInstance()) {
            return;
        }
        if (this.f53584 == null) {
            if (!c11087.f37639.isEmpty()) {
                if (this.f53582.isEmpty()) {
                    this.f53582 = c11087.f37639;
                    this.f53583 &= -2;
                } else {
                    if ((this.f53583 & 1) == 0) {
                        this.f53582 = new ArrayList(this.f53582);
                        this.f53583 |= 1;
                    }
                    this.f53582.addAll(c11087.f37639);
                }
                onChanged();
            }
        } else if (!c11087.f37639.isEmpty()) {
            if (!this.f53584.m49238()) {
                this.f53584.m49242(c11087.f37639);
            } else {
                this.f53584.m49236();
                C22190 c22190 = null;
                this.f53584 = null;
                List list = c11087.f37639;
                this.f53582 = list;
                this.f53583 &= -2;
                if (AbstractC18245.alwaysUseFieldBuilders) {
                    if (this.f53584 == null) {
                        this.f53584 = new C22190(list, false, getParentForChildren(), isClean());
                        this.f53582 = null;
                    }
                    c22190 = this.f53584;
                }
                this.f53584 = c22190;
            }
        }
        mo2781mergeUnknownFields(c11087.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39245(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 10) {
                            C6147 c6147 = (C6147) abstractC3262.mo6024(C6147.parser(), c2701);
                            C22190 c22190 = this.f53584;
                            if (c22190 != null) {
                                c22190.m49251(c6147);
                            } else {
                                if ((this.f53583 & 1) == 0) {
                                    this.f53582 = new ArrayList(this.f53582);
                                    this.f53583 |= 1;
                                }
                                this.f53582.add(c6147);
                            }
                        } else if (!super.parseUnknownField(abstractC3262, c2701, iMo6048)) {
                        }
                    }
                    z = true;
                } catch (C4529 e) {
                    throw e.m12650();
                }
            } catch (Throwable th) {
                onChanged();
                throw th;
            }
        }
        onChanged();
    }
}
