package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۧ۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11469 extends AbstractC15001 implements InterfaceC9078 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C14473 f36059;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C14473 f36060;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Object f36061;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC16733 f36062;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C3266 f36063;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public List f36064;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C9998 f36065;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public List f36066;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public List f36067;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public List f36068;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC16733 f36069;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Object f36070;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f36071;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public Object f36072;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f36073;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C14473 f36074;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public C25224 f36075;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C1072 f36076;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C14473 f36077;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public C9998 f36078;

    public /* synthetic */ C11469(int i) {
        this();
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2313clear() {
        m28833();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC7588 mo2313clear() {
        m28833();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2313clear() {
        m28833();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC15001 mo2313clear() {
        m28833();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC0479 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m28835(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC1225 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m28835(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC7588 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m28835(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC14299 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m28835(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC15001
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40302;
        c7544.m20621(C24896.class, C11469.class);
        return c7544;
    }

    public C11469() {
        this.f36061 = "";
        this.f36070 = "";
        this.f36076 = C1072.m4023();
        this.f36062 = AbstractC9035.m24122();
        this.f36069 = AbstractC9035.m24122();
        List list = Collections.EMPTY_LIST;
        this.f36066 = list;
        this.f36064 = list;
        this.f36068 = list;
        this.f36067 = list;
        this.f36072 = "";
        this.f36073 = 0;
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m28824();
            m28828();
            m28832();
            m28825();
            m28827();
            m28829();
        }
    }

    public C11469(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        this.f36061 = "";
        this.f36070 = "";
        this.f36076 = C1072.m4023();
        this.f36062 = AbstractC9035.m24122();
        this.f36069 = AbstractC9035.m24122();
        List list = Collections.EMPTY_LIST;
        this.f36066 = list;
        this.f36064 = list;
        this.f36068 = list;
        this.f36067 = list;
        this.f36072 = "";
        this.f36073 = 0;
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m28824();
            m28828();
            m28832();
            m28825();
            m28827();
            m28829();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28833() {
        super.mo2313clear();
        this.f36071 = 0;
        this.f36061 = "";
        this.f36070 = "";
        this.f36076 = C1072.m4023();
        this.f36062 = AbstractC9035.m24122();
        this.f36069 = AbstractC9035.m24122();
        C14473 c14473 = this.f36060;
        if (c14473 == null) {
            this.f36066 = Collections.EMPTY_LIST;
        } else {
            this.f36066 = null;
            c14473.m34945();
        }
        this.f36071 &= -33;
        C14473 c14474 = this.f36059;
        if (c14474 == null) {
            this.f36064 = Collections.EMPTY_LIST;
        } else {
            this.f36064 = null;
            c14474.m34945();
        }
        this.f36071 &= -65;
        C14473 c14475 = this.f36077;
        if (c14475 == null) {
            this.f36068 = Collections.EMPTY_LIST;
        } else {
            this.f36068 = null;
            c14475.m34945();
        }
        this.f36071 &= -129;
        C14473 c14476 = this.f36074;
        if (c14476 == null) {
            this.f36067 = Collections.EMPTY_LIST;
        } else {
            this.f36067 = null;
            c14476.m34945();
        }
        this.f36071 &= -257;
        this.f36063 = null;
        C9998 c9998 = this.f36065;
        if (c9998 != null) {
            c9998.m25851();
            this.f36065 = null;
        }
        this.f36075 = null;
        C9998 c9999 = this.f36078;
        if (c9999 != null) {
            c9999.m25851();
            this.f36078 = null;
        }
        this.f36072 = "";
        this.f36073 = 0;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40271;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C24896.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C24896.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C24896 c24896BuildPartial = buildPartial();
        if (c24896BuildPartial.isInitialized()) {
            return c24896BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c24896BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C24896 c24896BuildPartial = buildPartial();
        if (c24896BuildPartial.isInitialized()) {
            return c24896BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c24896BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C24896 buildPartial() {
        C25224 c25224;
        C3266 c3266;
        int i = 0;
        C24896 c24896 = new C24896(this, 0);
        C14473 c14473 = this.f36060;
        if (c14473 != null) {
            c24896.f80561 = c14473.m34950();
        } else {
            if ((this.f36071 & 32) != 0) {
                this.f36066 = C4681.unmodifiableList(this.f36066);
                this.f36071 &= -33;
            }
            c24896.f80561 = this.f36066;
        }
        C14473 c14474 = this.f36059;
        if (c14474 != null) {
            c24896.f80553 = c14474.m34950();
        } else {
            if ((this.f36071 & 64) != 0) {
                this.f36064 = C4681.unmodifiableList(this.f36064);
                this.f36071 &= -65;
            }
            c24896.f80553 = this.f36064;
        }
        C14473 c14475 = this.f36077;
        if (c14475 != null) {
            c24896.f80557 = c14475.m34950();
        } else {
            if ((this.f36071 & 128) != 0) {
                this.f36068 = C4681.unmodifiableList(this.f36068);
                this.f36071 &= -129;
            }
            c24896.f80557 = this.f36068;
        }
        C14473 c14476 = this.f36074;
        if (c14476 != null) {
            c24896.f80558 = c14476.m34950();
        } else {
            if ((this.f36071 & 256) != 0) {
                this.f36067 = C4681.unmodifiableList(this.f36067);
                this.f36071 &= -257;
            }
            c24896.f80558 = this.f36067;
        }
        int i2 = this.f36071;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c24896.f80554 = this.f36061;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c24896.f80555 = this.f36070;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                this.f36076.mo23372();
                c24896.f80566 = this.f36076;
            }
            if ((i2 & 8) != 0) {
                this.f36062.mo23372();
                c24896.f80559 = this.f36062;
            }
            if ((i2 & 16) != 0) {
                this.f36069.mo23372();
                c24896.f80567 = this.f36069;
            }
            if ((i2 & 512) != 0) {
                C9998 c9998 = this.f36065;
                if (c9998 == null) {
                    c3266 = this.f36063;
                } else {
                    c3266 = (C3266) c9998.m25854();
                }
                c24896.f80560 = c3266;
                i |= 4;
            }
            if ((i2 & 1024) != 0) {
                C9998 c9999 = this.f36078;
                if (c9999 == null) {
                    c25224 = this.f36075;
                } else {
                    c25224 = (C25224) c9999.m25854();
                }
                c24896.f80562 = c25224;
                i |= 8;
            }
            if ((i2 & 2048) != 0) {
                c24896.f80556 = this.f36072;
                i |= 16;
            }
            if ((i2 & 4096) != 0) {
                c24896.f80564 = this.f36073;
                i |= 32;
            }
            c24896.f80563 = i | c24896.f80563;
        }
        onBuilt();
        return c24896;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C24896) {
            m28837((C24896) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C24896) {
            m28837((C24896) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28837(C24896 c24896) {
        C25224 c25224;
        C3266 c3266;
        if (c24896 == C24896.getDefaultInstance()) {
            return;
        }
        if (c24896.hasName()) {
            this.f36061 = c24896.f80554;
            this.f36071 |= 1;
            onChanged();
        }
        if (c24896.m55454()) {
            this.f36070 = c24896.f80555;
            this.f36071 |= 2;
            onChanged();
        }
        if (!c24896.f80566.isEmpty()) {
            if (this.f36076.isEmpty()) {
                this.f36076 = c24896.f80566;
                this.f36071 |= 4;
            } else {
                if (!this.f36076.mo23371()) {
                    this.f36076 = new C1072(this.f36076);
                }
                this.f36071 |= 4;
                this.f36076.addAll(c24896.f80566);
            }
            onChanged();
        }
        if (!c24896.f80559.isEmpty()) {
            if (this.f36062.isEmpty()) {
                InterfaceC16733 interfaceC16733 = c24896.f80559;
                this.f36062 = interfaceC16733;
                interfaceC16733.mo23372();
                this.f36071 |= 8;
            } else {
                m28826();
                this.f36062.addAll(c24896.f80559);
            }
            onChanged();
        }
        if (!c24896.f80567.isEmpty()) {
            if (this.f36069.isEmpty()) {
                InterfaceC16733 interfaceC16734 = c24896.f80567;
                this.f36069 = interfaceC16734;
                interfaceC16734.mo23372();
                this.f36071 |= 16;
            } else {
                m28830();
                this.f36069.addAll(c24896.f80567);
            }
            onChanged();
        }
        if (this.f36060 == null) {
            if (!c24896.f80561.isEmpty()) {
                if (this.f36066.isEmpty()) {
                    this.f36066 = c24896.f80561;
                    this.f36071 &= -33;
                } else {
                    m28831();
                    this.f36066.addAll(c24896.f80561);
                }
                onChanged();
            }
        } else if (!c24896.f80561.isEmpty()) {
            if (!this.f36060.m34938()) {
                this.f36060.m34942(c24896.f80561);
            } else {
                this.f36060.m34954();
                this.f36060 = null;
                this.f36066 = c24896.f80561;
                this.f36071 &= -33;
                this.f36060 = AbstractC9035.alwaysUseFieldBuilders ? m28824() : null;
            }
        }
        if (this.f36059 == null) {
            if (!c24896.f80553.isEmpty()) {
                if (this.f36064.isEmpty()) {
                    this.f36064 = c24896.f80553;
                    this.f36071 &= -65;
                } else {
                    if ((this.f36071 & 64) == 0) {
                        this.f36064 = new ArrayList(this.f36064);
                        this.f36071 |= 64;
                    }
                    this.f36064.addAll(c24896.f80553);
                }
                onChanged();
            }
        } else if (!c24896.f80553.isEmpty()) {
            if (!this.f36059.m34938()) {
                this.f36059.m34942(c24896.f80553);
            } else {
                this.f36059.m34954();
                this.f36059 = null;
                this.f36064 = c24896.f80553;
                this.f36071 &= -65;
                this.f36059 = AbstractC9035.alwaysUseFieldBuilders ? m28828() : null;
            }
        }
        if (this.f36077 == null) {
            if (!c24896.f80557.isEmpty()) {
                if (this.f36068.isEmpty()) {
                    this.f36068 = c24896.f80557;
                    this.f36071 &= -129;
                } else {
                    if ((this.f36071 & 128) == 0) {
                        this.f36068 = new ArrayList(this.f36068);
                        this.f36071 |= 128;
                    }
                    this.f36068.addAll(c24896.f80557);
                }
                onChanged();
            }
        } else if (!c24896.f80557.isEmpty()) {
            if (!this.f36077.m34938()) {
                this.f36077.m34942(c24896.f80557);
            } else {
                this.f36077.m34954();
                this.f36077 = null;
                this.f36068 = c24896.f80557;
                this.f36071 &= -129;
                this.f36077 = AbstractC9035.alwaysUseFieldBuilders ? m28832() : null;
            }
        }
        if (this.f36074 == null) {
            if (!c24896.f80558.isEmpty()) {
                if (this.f36067.isEmpty()) {
                    this.f36067 = c24896.f80558;
                    this.f36071 &= -257;
                } else {
                    if ((this.f36071 & 256) == 0) {
                        this.f36067 = new ArrayList(this.f36067);
                        this.f36071 |= 256;
                    }
                    this.f36067.addAll(c24896.f80558);
                }
                onChanged();
            }
        } else if (!c24896.f80558.isEmpty()) {
            if (!this.f36074.m34938()) {
                this.f36074.m34942(c24896.f80558);
            } else {
                this.f36074.m34954();
                this.f36074 = null;
                this.f36067 = c24896.f80558;
                this.f36071 &= -257;
                this.f36074 = AbstractC9035.alwaysUseFieldBuilders ? m28825() : null;
            }
        }
        if (c24896.m55472()) {
            C3266 c3266M55465 = c24896.m55465();
            C9998 c9998 = this.f36065;
            if (c9998 == null) {
                if ((this.f36071 & 512) == 0 || (c3266 = this.f36063) == null || c3266 == C3266.getDefaultInstance()) {
                    this.f36063 = c3266M55465;
                } else {
                    this.f36071 |= 512;
                    onChanged();
                    ((C17436) m28827().m25856()).m40936(c3266M55465);
                }
            } else {
                c9998.m25850(c3266M55465);
            }
            if (this.f36063 != null) {
                this.f36071 |= 512;
                onChanged();
            }
        }
        if (c24896.m55461()) {
            C25224 c25224M55467 = c24896.m55467();
            C9998 c9999 = this.f36078;
            if (c9999 == null) {
                if ((this.f36071 & 1024) == 0 || (c25224 = this.f36075) == null || c25224 == C25224.getDefaultInstance()) {
                    this.f36075 = c25224M55467;
                } else {
                    this.f36071 |= 1024;
                    onChanged();
                    ((C13289) m28829().m25856()).m32830(c25224M55467);
                }
            } else {
                c9999.m25850(c25224M55467);
            }
            if (this.f36075 != null) {
                this.f36071 |= 1024;
                onChanged();
            }
        }
        if (c24896.m55468()) {
            this.f36072 = c24896.f80556;
            this.f36071 |= 2048;
            onChanged();
        }
        if (c24896.m55457()) {
            EnumC5810 enumC5810M55452 = c24896.m55452();
            enumC5810M55452.getClass();
            this.f36071 |= 4096;
            this.f36073 = enumC5810M55452.getNumber();
            onChanged();
        }
        mo2317mergeUnknownFields(c24896.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28835(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    switch (iMo11876) {
                        case 0:
                            break;
                        case 10:
                            this.f36061 = abstractC3660.mo11890();
                            this.f36071 |= 1;
                            continue;
                        case 18:
                            this.f36070 = abstractC3660.mo11890();
                            this.f36071 |= 2;
                            continue;
                        case 26:
                            AbstractC17084 abstractC17084Mo11890 = abstractC3660.mo11890();
                            if (!this.f36076.mo23371()) {
                                this.f36076 = new C1072(this.f36076);
                            }
                            this.f36071 |= 4;
                            this.f36076.mo4028(abstractC17084Mo11890);
                            continue;
                        case 34:
                            C15504 c15504 = (C15504) abstractC3660.mo11877(C15504.parser(), c24215);
                            C14473 c14473 = this.f36060;
                            if (c14473 == null) {
                                m28831();
                                this.f36066.add(c15504);
                            } else {
                                c14473.m34953(c15504);
                                continue;
                            }
                            break;
                        case 42:
                            C16250 c16250 = (C16250) abstractC3660.mo11877(C16250.parser(), c24215);
                            C14473 c14474 = this.f36059;
                            if (c14474 != null) {
                                c14474.m34953(c16250);
                                continue;
                            } else {
                                if ((this.f36071 & 64) == 0) {
                                    this.f36064 = new ArrayList(this.f36064);
                                    this.f36071 |= 64;
                                }
                                this.f36064.add(c16250);
                            }
                            break;
                        case 50:
                            C22240 c22240 = (C22240) abstractC3660.mo11877(C22240.parser(), c24215);
                            C14473 c14475 = this.f36077;
                            if (c14475 != null) {
                                c14475.m34953(c22240);
                                continue;
                            } else {
                                if ((this.f36071 & 128) == 0) {
                                    this.f36068 = new ArrayList(this.f36068);
                                    this.f36071 |= 128;
                                }
                                this.f36068.add(c22240);
                            }
                            break;
                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            C0064 c0064 = (C0064) abstractC3660.mo11877(C0064.parser(), c24215);
                            C14473 c14476 = this.f36074;
                            if (c14476 != null) {
                                c14476.m34953(c0064);
                                continue;
                            } else {
                                if ((this.f36071 & 256) == 0) {
                                    this.f36067 = new ArrayList(this.f36067);
                                    this.f36071 |= 256;
                                }
                                this.f36067.add(c0064);
                            }
                            break;
                        case 66:
                            abstractC3660.mo11881(m28827().m25856(), c24215);
                            this.f36071 |= 512;
                            continue;
                        case 74:
                            abstractC3660.mo11881(m28829().m25856(), c24215);
                            this.f36071 |= 1024;
                            continue;
                        case 80:
                            int iMo11892 = abstractC3660.mo11892();
                            m28826();
                            this.f36062.mo39511(iMo11892);
                            continue;
                        case 82:
                            int iMo11885 = abstractC3660.mo11885(abstractC3660.mo11891());
                            m28826();
                            while (abstractC3660.mo11897() > 0) {
                                this.f36062.mo39511(abstractC3660.mo11892());
                            }
                            abstractC3660.mo11898(iMo11885);
                            continue;
                        case 88:
                            int iMo11893 = abstractC3660.mo11892();
                            m28830();
                            this.f36069.mo39511(iMo11893);
                            continue;
                        case 90:
                            int iMo11886 = abstractC3660.mo11885(abstractC3660.mo11891());
                            m28830();
                            while (abstractC3660.mo11897() > 0) {
                                this.f36069.mo39511(abstractC3660.mo11892());
                            }
                            abstractC3660.mo11898(iMo11886);
                            continue;
                        case 98:
                            this.f36072 = abstractC3660.mo11890();
                            this.f36071 |= 2048;
                            continue;
                        case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                            int iMo11882 = abstractC3660.mo11882();
                            if (EnumC5810.m16936(iMo11882) == null) {
                                mergeUnknownVarintField(14, iMo11882);
                            } else {
                                this.f36073 = iMo11882;
                                this.f36071 |= 4096;
                                continue;
                            }
                            break;
                        default:
                            if (!super.parseUnknownField(abstractC3660, c24215, iMo11876)) {
                                break;
                            }
                            break;
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28834(String str) {
        str.getClass();
        this.f36061 = str;
        this.f36071 |= 1;
        onChanged();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m28838(String str) {
        str.getClass();
        this.f36070 = str;
        this.f36071 |= 2;
        onChanged();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m28826() {
        if (!this.f36062.mo23371()) {
            this.f36062 = (InterfaceC16733) AbstractC9035.m24104((InterfaceC15987) this.f36062);
        }
        this.f36071 |= 8;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m28830() {
        if (!this.f36069.mo23371()) {
            this.f36069 = (InterfaceC16733) AbstractC9035.m24104((InterfaceC15987) this.f36069);
        }
        this.f36071 |= 16;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m28831() {
        if ((this.f36071 & 32) == 0) {
            this.f36066 = new ArrayList(this.f36066);
            this.f36071 |= 32;
        }
    }

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        int iM34948;
        int iM34949;
        int iM349410;
        int iM349411;
        C3266 defaultInstance;
        C0064 c0064;
        C22240 c22240;
        C16250 c16250;
        C15504 c15504;
        int i = 0;
        while (true) {
            C14473 c14473 = this.f36060;
            if (c14473 == null) {
                iM34948 = this.f36066.size();
            } else {
                iM34948 = c14473.m34948();
            }
            if (i < iM34948) {
                C14473 c14474 = this.f36060;
                if (c14474 == null) {
                    c15504 = (C15504) this.f36066.get(i);
                } else {
                    c15504 = (C15504) c14474.m34951(i);
                }
                if (!c15504.isInitialized()) {
                    break;
                }
                i++;
            } else {
                int i2 = 0;
                while (true) {
                    C14473 c14475 = this.f36059;
                    if (c14475 == null) {
                        iM34949 = this.f36064.size();
                    } else {
                        iM34949 = c14475.m34948();
                    }
                    if (i2 < iM34949) {
                        C14473 c14476 = this.f36059;
                        if (c14476 == null) {
                            c16250 = (C16250) this.f36064.get(i2);
                        } else {
                            c16250 = (C16250) c14476.m34951(i2);
                        }
                        if (!c16250.isInitialized()) {
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 0;
                        while (true) {
                            C14473 c14477 = this.f36077;
                            if (c14477 == null) {
                                iM349410 = this.f36068.size();
                            } else {
                                iM349410 = c14477.m34948();
                            }
                            if (i3 < iM349410) {
                                C14473 c14478 = this.f36077;
                                if (c14478 == null) {
                                    c22240 = (C22240) this.f36068.get(i3);
                                } else {
                                    c22240 = (C22240) c14478.m34951(i3);
                                }
                                if (!c22240.isInitialized()) {
                                    break;
                                }
                                i3++;
                            } else {
                                int i4 = 0;
                                while (true) {
                                    C14473 c14479 = this.f36074;
                                    if (c14479 == null) {
                                        iM349411 = this.f36067.size();
                                    } else {
                                        iM349411 = c14479.m34948();
                                    }
                                    if (i4 < iM349411) {
                                        C14473 c144710 = this.f36074;
                                        if (c144710 == null) {
                                            c0064 = (C0064) this.f36067.get(i4);
                                        } else {
                                            c0064 = (C0064) c144710.m34951(i4);
                                        }
                                        if (!c0064.isInitialized()) {
                                            break;
                                        }
                                        i4++;
                                    } else {
                                        if ((this.f36071 & 512) == 0) {
                                            return true;
                                        }
                                        C9998 c9998 = this.f36065;
                                        if (c9998 == null) {
                                            defaultInstance = this.f36063;
                                            if (defaultInstance == null) {
                                                defaultInstance = C3266.getDefaultInstance();
                                            }
                                        } else {
                                            defaultInstance = (C3266) c9998.m25853();
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
    public final void m28836(C15504 c15504) {
        C14473 c14473 = this.f36060;
        if (c14473 == null) {
            c15504.getClass();
            m28831();
            this.f36066.add(c15504);
            onChanged();
            return;
        }
        c14473.m34953(c15504);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C14473 m28824() {
        if (this.f36060 == null) {
            this.f36060 = new C14473(this.f36066, (this.f36071 & 32) != 0, getParentForChildren(), isClean());
            this.f36066 = null;
        }
        return this.f36060;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private C14473 m28828() {
        if (this.f36059 == null) {
            this.f36059 = new C14473(this.f36064, (this.f36071 & 64) != 0, getParentForChildren(), isClean());
            this.f36064 = null;
        }
        return this.f36059;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private C14473 m28832() {
        if (this.f36077 == null) {
            this.f36077 = new C14473(this.f36068, (this.f36071 & 128) != 0, getParentForChildren(), isClean());
            this.f36068 = null;
        }
        return this.f36077;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C14473 m28825() {
        if (this.f36074 == null) {
            this.f36074 = new C14473(this.f36067, (this.f36071 & 256) != 0, getParentForChildren(), isClean());
            this.f36067 = null;
        }
        return this.f36074;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C9998 m28827() {
        C3266 defaultInstance;
        C9998 c9998 = this.f36065;
        if (c9998 == null) {
            if (c9998 == null) {
                defaultInstance = this.f36063;
                if (defaultInstance == null) {
                    defaultInstance = C3266.getDefaultInstance();
                }
            } else {
                defaultInstance = (C3266) c9998.m25853();
            }
            this.f36065 = new C9998(defaultInstance, getParentForChildren(), isClean());
            this.f36063 = null;
        }
        return this.f36065;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private C9998 m28829() {
        C25224 defaultInstance;
        C9998 c9998 = this.f36078;
        if (c9998 == null) {
            if (c9998 == null) {
                defaultInstance = this.f36075;
                if (defaultInstance == null) {
                    defaultInstance = C25224.getDefaultInstance();
                }
            } else {
                defaultInstance = (C25224) c9998.m25853();
            }
            this.f36078 = new C9998(defaultInstance, getParentForChildren(), isClean());
            this.f36075 = null;
        }
        return this.f36078;
    }
}
