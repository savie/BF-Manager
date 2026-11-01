package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۛ᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6376 extends AbstractC0584 implements InterfaceC18266 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f21655;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC23890 f21656;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C15135 f21657;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public C15135 f21658;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Object f21659;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC23890 f21660;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public C11087 f21661;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public List f21662;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C3553 f21663;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C22190 f21664;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public List f21665;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f21666;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public C22190 f21667;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Object f21668;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f21669;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C22190 f21670;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C22190 f21671;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C21463 f21672;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public Object f21673;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public List f21674;

    public /* synthetic */ C6376(int i) {
        this();
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0584 mo2777clear() {
        m17501();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2777clear() {
        m17501();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC6977 mo2777clear() {
        m17501();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2777clear() {
        m17501();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC3967 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m17504(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC6977 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m17504(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC21607 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m17504(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC22500 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m17504(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC0584
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46271;
        c6956.m18696(C11316.class, C6376.class);
        return c6956;
    }

    public C6376() {
        this.f21668 = "";
        this.f21659 = "";
        this.f21672 = C21463.m48084();
        this.f21660 = AbstractC18245.m42411();
        this.f21656 = AbstractC18245.m42411();
        List list = Collections.EMPTY_LIST;
        this.f21674 = list;
        this.f21666 = list;
        this.f21665 = list;
        this.f21662 = list;
        this.f21673 = "";
        this.f21655 = 0;
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m17493();
            m17499();
            m17500();
            m17497();
            m17495();
            m17498();
        }
    }

    public C6376(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        this.f21668 = "";
        this.f21659 = "";
        this.f21672 = C21463.m48084();
        this.f21660 = AbstractC18245.m42411();
        this.f21656 = AbstractC18245.m42411();
        List list = Collections.EMPTY_LIST;
        this.f21674 = list;
        this.f21666 = list;
        this.f21665 = list;
        this.f21662 = list;
        this.f21673 = "";
        this.f21655 = 0;
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m17493();
            m17499();
            m17500();
            m17497();
            m17495();
            m17498();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17501() {
        super.mo2777clear();
        this.f21669 = 0;
        this.f21668 = "";
        this.f21659 = "";
        this.f21672 = C21463.m48084();
        this.f21660 = AbstractC18245.m42411();
        this.f21656 = AbstractC18245.m42411();
        C22190 c22190 = this.f21664;
        if (c22190 == null) {
            this.f21674 = Collections.EMPTY_LIST;
        } else {
            this.f21674 = null;
            c22190.m49245();
        }
        this.f21669 &= -33;
        C22190 c22191 = this.f21670;
        if (c22191 == null) {
            this.f21666 = Collections.EMPTY_LIST;
        } else {
            this.f21666 = null;
            c22191.m49245();
        }
        this.f21669 &= -65;
        C22190 c22192 = this.f21667;
        if (c22192 == null) {
            this.f21665 = Collections.EMPTY_LIST;
        } else {
            this.f21665 = null;
            c22192.m49245();
        }
        this.f21669 &= -129;
        C22190 c22193 = this.f21671;
        if (c22193 == null) {
            this.f21662 = Collections.EMPTY_LIST;
        } else {
            this.f21662 = null;
            c22193.m49245();
        }
        this.f21669 &= -257;
        this.f21663 = null;
        C15135 c15135 = this.f21657;
        if (c15135 != null) {
            c15135.m36296();
            this.f21657 = null;
        }
        this.f21661 = null;
        C15135 c15136 = this.f21658;
        if (c15136 != null) {
            c15136.m36296();
            this.f21658 = null;
        }
        this.f21673 = "";
        this.f21655 = 0;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46294;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C11316.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C11316.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C11316 c11316BuildPartial = buildPartial();
        if (c11316BuildPartial.isInitialized()) {
            return c11316BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c11316BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C11316 c11316BuildPartial = buildPartial();
        if (c11316BuildPartial.isInitialized()) {
            return c11316BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c11316BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C11316 buildPartial() {
        C11087 c11087;
        C3553 c3553;
        int i = 0;
        C11316 c11316 = new C11316(this, 0);
        C22190 c22190 = this.f21664;
        if (c22190 != null) {
            c11316.f38193 = c22190.m49248();
        } else {
            if ((this.f21669 & 32) != 0) {
                this.f21674 = C0561.unmodifiableList(this.f21674);
                this.f21669 &= -33;
            }
            c11316.f38193 = this.f21674;
        }
        C22190 c22191 = this.f21670;
        if (c22191 != null) {
            c11316.f38200 = c22191.m49248();
        } else {
            if ((this.f21669 & 64) != 0) {
                this.f21666 = C0561.unmodifiableList(this.f21666);
                this.f21669 &= -65;
            }
            c11316.f38200 = this.f21666;
        }
        C22190 c22192 = this.f21667;
        if (c22192 != null) {
            c11316.f38194 = c22192.m49248();
        } else {
            if ((this.f21669 & 128) != 0) {
                this.f21665 = C0561.unmodifiableList(this.f21665);
                this.f21669 &= -129;
            }
            c11316.f38194 = this.f21665;
        }
        C22190 c22193 = this.f21671;
        if (c22193 != null) {
            c11316.f38196 = c22193.m49248();
        } else {
            if ((this.f21669 & 256) != 0) {
                this.f21662 = C0561.unmodifiableList(this.f21662);
                this.f21669 &= -257;
            }
            c11316.f38196 = this.f21662;
        }
        int i2 = this.f21669;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c11316.f38195 = this.f21668;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c11316.f38198 = this.f21659;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                this.f21672.mo6483();
                c11316.f38202 = this.f21672;
            }
            if ((i2 & 8) != 0) {
                this.f21660.mo6483();
                c11316.f38190 = this.f21660;
            }
            if ((i2 & 16) != 0) {
                this.f21656.mo6483();
                c11316.f38197 = this.f21656;
            }
            if ((i2 & 512) != 0) {
                C15135 c15135 = this.f21657;
                if (c15135 == null) {
                    c3553 = this.f21663;
                } else {
                    c3553 = (C3553) c15135.m36297();
                }
                c11316.f38203 = c3553;
                i |= 4;
            }
            if ((i2 & 1024) != 0) {
                C15135 c15136 = this.f21658;
                if (c15136 == null) {
                    c11087 = this.f21661;
                } else {
                    c11087 = (C11087) c15136.m36297();
                }
                c11316.f38191 = c11087;
                i |= 8;
            }
            if ((i2 & 2048) != 0) {
                c11316.f38192 = this.f21673;
                i |= 16;
            }
            if ((i2 & 4096) != 0) {
                c11316.f38189 = this.f21655;
                i |= 32;
            }
            c11316.f38199 = i | c11316.f38199;
        }
        onBuilt();
        return c11316;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C11316) {
            m17505((C11316) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C11316) {
            m17505((C11316) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17505(C11316 c11316) {
        C11087 c11087;
        C3553 c3553;
        if (c11316 == C11316.getDefaultInstance()) {
            return;
        }
        if (c11316.hasName()) {
            this.f21668 = c11316.f38195;
            this.f21669 |= 1;
            onChanged();
        }
        if (c11316.m28358()) {
            this.f21659 = c11316.f38198;
            this.f21669 |= 2;
            onChanged();
        }
        if (!c11316.f38202.isEmpty()) {
            if (this.f21672.isEmpty()) {
                this.f21672 = c11316.f38202;
                this.f21669 |= 4;
            } else {
                if (!this.f21672.mo6484()) {
                    this.f21672 = new C21463(this.f21672);
                }
                this.f21669 |= 4;
                this.f21672.addAll(c11316.f38202);
            }
            onChanged();
        }
        if (!c11316.f38190.isEmpty()) {
            if (this.f21660.isEmpty()) {
                InterfaceC23890 interfaceC23890 = c11316.f38190;
                this.f21660 = interfaceC23890;
                interfaceC23890.mo6483();
                this.f21669 |= 8;
            } else {
                m17492();
                this.f21660.addAll(c11316.f38190);
            }
            onChanged();
        }
        if (!c11316.f38197.isEmpty()) {
            if (this.f21656.isEmpty()) {
                InterfaceC23890 interfaceC23891 = c11316.f38197;
                this.f21656 = interfaceC23891;
                interfaceC23891.mo6483();
                this.f21669 |= 16;
            } else {
                m17494();
                this.f21656.addAll(c11316.f38197);
            }
            onChanged();
        }
        if (this.f21664 == null) {
            if (!c11316.f38193.isEmpty()) {
                if (this.f21674.isEmpty()) {
                    this.f21674 = c11316.f38193;
                    this.f21669 &= -33;
                } else {
                    m17496();
                    this.f21674.addAll(c11316.f38193);
                }
                onChanged();
            }
        } else if (!c11316.f38193.isEmpty()) {
            if (!this.f21664.m49238()) {
                this.f21664.m49242(c11316.f38193);
            } else {
                this.f21664.m49236();
                this.f21664 = null;
                this.f21674 = c11316.f38193;
                this.f21669 &= -33;
                this.f21664 = AbstractC18245.alwaysUseFieldBuilders ? m17493() : null;
            }
        }
        if (this.f21670 == null) {
            if (!c11316.f38200.isEmpty()) {
                if (this.f21666.isEmpty()) {
                    this.f21666 = c11316.f38200;
                    this.f21669 &= -65;
                } else {
                    if ((this.f21669 & 64) == 0) {
                        this.f21666 = new ArrayList(this.f21666);
                        this.f21669 |= 64;
                    }
                    this.f21666.addAll(c11316.f38200);
                }
                onChanged();
            }
        } else if (!c11316.f38200.isEmpty()) {
            if (!this.f21670.m49238()) {
                this.f21670.m49242(c11316.f38200);
            } else {
                this.f21670.m49236();
                this.f21670 = null;
                this.f21666 = c11316.f38200;
                this.f21669 &= -65;
                this.f21670 = AbstractC18245.alwaysUseFieldBuilders ? m17499() : null;
            }
        }
        if (this.f21667 == null) {
            if (!c11316.f38194.isEmpty()) {
                if (this.f21665.isEmpty()) {
                    this.f21665 = c11316.f38194;
                    this.f21669 &= -129;
                } else {
                    if ((this.f21669 & 128) == 0) {
                        this.f21665 = new ArrayList(this.f21665);
                        this.f21669 |= 128;
                    }
                    this.f21665.addAll(c11316.f38194);
                }
                onChanged();
            }
        } else if (!c11316.f38194.isEmpty()) {
            if (!this.f21667.m49238()) {
                this.f21667.m49242(c11316.f38194);
            } else {
                this.f21667.m49236();
                this.f21667 = null;
                this.f21665 = c11316.f38194;
                this.f21669 &= -129;
                this.f21667 = AbstractC18245.alwaysUseFieldBuilders ? m17500() : null;
            }
        }
        if (this.f21671 == null) {
            if (!c11316.f38196.isEmpty()) {
                if (this.f21662.isEmpty()) {
                    this.f21662 = c11316.f38196;
                    this.f21669 &= -257;
                } else {
                    if ((this.f21669 & 256) == 0) {
                        this.f21662 = new ArrayList(this.f21662);
                        this.f21669 |= 256;
                    }
                    this.f21662.addAll(c11316.f38196);
                }
                onChanged();
            }
        } else if (!c11316.f38196.isEmpty()) {
            if (!this.f21671.m49238()) {
                this.f21671.m49242(c11316.f38196);
            } else {
                this.f21671.m49236();
                this.f21671 = null;
                this.f21662 = c11316.f38196;
                this.f21669 &= -257;
                this.f21671 = AbstractC18245.alwaysUseFieldBuilders ? m17497() : null;
            }
        }
        if (c11316.m28345()) {
            C3553 c3553M28359 = c11316.m28359();
            C15135 c15135 = this.f21657;
            if (c15135 == null) {
                if ((this.f21669 & 512) == 0 || (c3553 = this.f21663) == null || c3553 == C3553.getDefaultInstance()) {
                    this.f21663 = c3553M28359;
                } else {
                    this.f21669 |= 512;
                    onChanged();
                    ((C14844) m17495().m36293()).m35534(c3553M28359);
                }
            } else {
                c15135.m36294(c3553M28359);
            }
            if (this.f21663 != null) {
                this.f21669 |= 512;
                onChanged();
            }
        }
        if (c11316.m28353()) {
            C11087 c11087M28356 = c11316.m28356();
            C15135 c15136 = this.f21658;
            if (c15136 == null) {
                if ((this.f21669 & 1024) == 0 || (c11087 = this.f21661) == null || c11087 == C11087.getDefaultInstance()) {
                    this.f21661 = c11087M28356;
                } else {
                    this.f21669 |= 1024;
                    onChanged();
                    ((C16731) m17498().m36293()).m39246(c11087M28356);
                }
            } else {
                c15136.m36294(c11087M28356);
            }
            if (this.f21661 != null) {
                this.f21669 |= 1024;
                onChanged();
            }
        }
        if (c11316.m28357()) {
            this.f21673 = c11316.f38192;
            this.f21669 |= 2048;
            onChanged();
        }
        if (c11316.m28348()) {
            EnumC12167 enumC12167M28341 = c11316.m28341();
            enumC12167M28341.getClass();
            this.f21669 |= 4096;
            this.f21655 = enumC12167M28341.getNumber();
            onChanged();
        }
        mo2781mergeUnknownFields(c11316.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17504(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    switch (iMo6048) {
                        case 0:
                            break;
                        case 10:
                            this.f21668 = abstractC3262.mo6050();
                            this.f21669 |= 1;
                            continue;
                        case 18:
                            this.f21659 = abstractC3262.mo6050();
                            this.f21669 |= 2;
                            continue;
                        case 26:
                            AbstractC23725 abstractC23725Mo6050 = abstractC3262.mo6050();
                            if (!this.f21672.mo6484()) {
                                this.f21672 = new C21463(this.f21672);
                            }
                            this.f21669 |= 4;
                            this.f21672.mo21383(abstractC23725Mo6050);
                            continue;
                        case 34:
                            C0171 c0171 = (C0171) abstractC3262.mo6024(C0171.parser(), c2701);
                            C22190 c22190 = this.f21664;
                            if (c22190 == null) {
                                m17496();
                                this.f21674.add(c0171);
                            } else {
                                c22190.m49251(c0171);
                                continue;
                            }
                            break;
                        case 42:
                            C1582 c1582 = (C1582) abstractC3262.mo6024(C1582.parser(), c2701);
                            C22190 c22191 = this.f21670;
                            if (c22191 != null) {
                                c22191.m49251(c1582);
                                continue;
                            } else {
                                if ((this.f21669 & 64) == 0) {
                                    this.f21666 = new ArrayList(this.f21666);
                                    this.f21669 |= 64;
                                }
                                this.f21666.add(c1582);
                            }
                            break;
                        case 50:
                            C7558 c7558 = (C7558) abstractC3262.mo6024(C7558.parser(), c2701);
                            C22190 c22192 = this.f21667;
                            if (c22192 != null) {
                                c22192.m49251(c7558);
                                continue;
                            } else {
                                if ((this.f21669 & 128) == 0) {
                                    this.f21665 = new ArrayList(this.f21665);
                                    this.f21669 |= 128;
                                }
                                this.f21665.add(c7558);
                            }
                            break;
                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            C4259 c4259 = (C4259) abstractC3262.mo6024(C4259.parser(), c2701);
                            C22190 c22193 = this.f21671;
                            if (c22193 != null) {
                                c22193.m49251(c4259);
                                continue;
                            } else {
                                if ((this.f21669 & 256) == 0) {
                                    this.f21662 = new ArrayList(this.f21662);
                                    this.f21669 |= 256;
                                }
                                this.f21662.add(c4259);
                            }
                            break;
                        case 66:
                            abstractC3262.mo6027(m17495().m36293(), c2701);
                            this.f21669 |= 512;
                            continue;
                        case 74:
                            abstractC3262.mo6027(m17498().m36293(), c2701);
                            this.f21669 |= 1024;
                            continue;
                        case 80:
                            int iMo6040 = abstractC3262.mo6040();
                            m17492();
                            this.f21660.mo45940(iMo6040);
                            continue;
                        case 82:
                            int iMo6035 = abstractC3262.mo6035(abstractC3262.mo6044());
                            m17492();
                            while (abstractC3262.mo6038() > 0) {
                                this.f21660.mo45940(abstractC3262.mo6040());
                            }
                            abstractC3262.mo6039(iMo6035);
                            continue;
                        case 88:
                            int iMo6041 = abstractC3262.mo6040();
                            m17494();
                            this.f21656.mo45940(iMo6041);
                            continue;
                        case 90:
                            int iMo6036 = abstractC3262.mo6035(abstractC3262.mo6044());
                            m17494();
                            while (abstractC3262.mo6038() > 0) {
                                this.f21656.mo45940(abstractC3262.mo6040());
                            }
                            abstractC3262.mo6039(iMo6036);
                            continue;
                        case 98:
                            this.f21673 = abstractC3262.mo6050();
                            this.f21669 |= 2048;
                            continue;
                        case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                            int iMo6037 = abstractC3262.mo6037();
                            if (EnumC12167.m30252(iMo6037) == null) {
                                mergeUnknownVarintField(14, iMo6037);
                            } else {
                                this.f21655 = iMo6037;
                                this.f21669 |= 4096;
                                continue;
                            }
                            break;
                        default:
                            if (!super.parseUnknownField(abstractC3262, c2701, iMo6048)) {
                                break;
                            }
                            break;
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17502(String str) {
        str.getClass();
        this.f21668 = str;
        this.f21669 |= 1;
        onChanged();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m17506(String str) {
        str.getClass();
        this.f21659 = str;
        this.f21669 |= 2;
        onChanged();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m17492() {
        if (!this.f21660.mo6484()) {
            this.f21660 = (InterfaceC23890) AbstractC18245.m42400((InterfaceC2016) this.f21660);
        }
        this.f21669 |= 8;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m17494() {
        if (!this.f21656.mo6484()) {
            this.f21656 = (InterfaceC23890) AbstractC18245.m42400((InterfaceC2016) this.f21656);
        }
        this.f21669 |= 16;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m17496() {
        if ((this.f21669 & 32) == 0) {
            this.f21674 = new ArrayList(this.f21674);
            this.f21669 |= 32;
        }
    }

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        int iM49252;
        int iM49253;
        int iM49254;
        int iM49255;
        C3553 defaultInstance;
        C4259 c4259;
        C7558 c7558;
        C1582 c1582;
        C0171 c0171;
        int i = 0;
        while (true) {
            C22190 c22190 = this.f21664;
            if (c22190 == null) {
                iM49252 = this.f21674.size();
            } else {
                iM49252 = c22190.m49252();
            }
            if (i < iM49252) {
                C22190 c22191 = this.f21664;
                if (c22191 == null) {
                    c0171 = (C0171) this.f21674.get(i);
                } else {
                    c0171 = (C0171) c22191.m49249(i);
                }
                if (!c0171.isInitialized()) {
                    break;
                }
                i++;
            } else {
                int i2 = 0;
                while (true) {
                    C22190 c22192 = this.f21670;
                    if (c22192 == null) {
                        iM49253 = this.f21666.size();
                    } else {
                        iM49253 = c22192.m49252();
                    }
                    if (i2 < iM49253) {
                        C22190 c22193 = this.f21670;
                        if (c22193 == null) {
                            c1582 = (C1582) this.f21666.get(i2);
                        } else {
                            c1582 = (C1582) c22193.m49249(i2);
                        }
                        if (!c1582.isInitialized()) {
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 0;
                        while (true) {
                            C22190 c22194 = this.f21667;
                            if (c22194 == null) {
                                iM49254 = this.f21665.size();
                            } else {
                                iM49254 = c22194.m49252();
                            }
                            if (i3 < iM49254) {
                                C22190 c22195 = this.f21667;
                                if (c22195 == null) {
                                    c7558 = (C7558) this.f21665.get(i3);
                                } else {
                                    c7558 = (C7558) c22195.m49249(i3);
                                }
                                if (!c7558.isInitialized()) {
                                    break;
                                }
                                i3++;
                            } else {
                                int i4 = 0;
                                while (true) {
                                    C22190 c22196 = this.f21671;
                                    if (c22196 == null) {
                                        iM49255 = this.f21662.size();
                                    } else {
                                        iM49255 = c22196.m49252();
                                    }
                                    if (i4 < iM49255) {
                                        C22190 c22197 = this.f21671;
                                        if (c22197 == null) {
                                            c4259 = (C4259) this.f21662.get(i4);
                                        } else {
                                            c4259 = (C4259) c22197.m49249(i4);
                                        }
                                        if (!c4259.isInitialized()) {
                                            break;
                                        }
                                        i4++;
                                    } else {
                                        if ((this.f21669 & 512) == 0) {
                                            return true;
                                        }
                                        C15135 c15135 = this.f21657;
                                        if (c15135 == null) {
                                            defaultInstance = this.f21663;
                                            if (defaultInstance == null) {
                                                defaultInstance = C3553.getDefaultInstance();
                                            }
                                        } else {
                                            defaultInstance = (C3553) c15135.m36295();
                                        }
                                        if (!defaultInstance.isInitialized()) {
                                            break;
                                        }
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17503(C0171 c0171) {
        C22190 c22190 = this.f21664;
        if (c22190 == null) {
            c0171.getClass();
            m17496();
            this.f21674.add(c0171);
            onChanged();
            return;
        }
        c22190.m49251(c0171);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private C22190 m17493() {
        if (this.f21664 == null) {
            this.f21664 = new C22190(this.f21674, (this.f21669 & 32) != 0, getParentForChildren(), isClean());
            this.f21674 = null;
        }
        return this.f21664;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private C22190 m17499() {
        if (this.f21670 == null) {
            this.f21670 = new C22190(this.f21666, (this.f21669 & 64) != 0, getParentForChildren(), isClean());
            this.f21666 = null;
        }
        return this.f21670;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private C22190 m17500() {
        if (this.f21667 == null) {
            this.f21667 = new C22190(this.f21665, (this.f21669 & 128) != 0, getParentForChildren(), isClean());
            this.f21665 = null;
        }
        return this.f21667;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private C22190 m17497() {
        if (this.f21671 == null) {
            this.f21671 = new C22190(this.f21662, (this.f21669 & 256) != 0, getParentForChildren(), isClean());
            this.f21662 = null;
        }
        return this.f21671;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private C15135 m17495() {
        C3553 defaultInstance;
        C15135 c15135 = this.f21657;
        if (c15135 == null) {
            if (c15135 == null) {
                defaultInstance = this.f21663;
                if (defaultInstance == null) {
                    defaultInstance = C3553.getDefaultInstance();
                }
            } else {
                defaultInstance = (C3553) c15135.m36295();
            }
            this.f21657 = new C15135(defaultInstance, getParentForChildren(), isClean());
            this.f21663 = null;
        }
        return this.f21657;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private C15135 m17498() {
        C11087 defaultInstance;
        C15135 c15135 = this.f21658;
        if (c15135 == null) {
            if (c15135 == null) {
                defaultInstance = this.f21661;
                if (defaultInstance == null) {
                    defaultInstance = C11087.getDefaultInstance();
                }
            } else {
                defaultInstance = (C11087) c15135.m36295();
            }
            this.f21658 = new C15135(defaultInstance, getParentForChildren(), isClean());
            this.f21661 = null;
        }
        return this.f21658;
    }
}
