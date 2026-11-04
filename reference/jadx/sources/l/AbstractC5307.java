package l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۚ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5307 extends AbstractC15001 implements InterfaceC9078 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C9296 f18685;

    @Override // l.AbstractC0479, l.InterfaceC9824
    public /* bridge */ /* synthetic */ InterfaceC18775 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public AbstractC5307 mo2313clear() {
        this.f18685 = null;
        return (AbstractC5307) super.mo2313clear();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m15942() {
        if (this.f18685 == null) {
            int i = C8551.f27923;
            this.f18685 = new C9296(0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15944(AbstractC17501 abstractC17501, C14495 c14495) {
        AbstractC16755 abstractC16755M24126 = AbstractC9035.m24126(abstractC17501);
        if (abstractC16755M24126.mo25504().m20099() != getDescriptorForType()) {
            throw new IllegalArgumentException("Extension is for type \"" + abstractC16755M24126.mo25504().m20099().mo5002() + "\" which does not match message type \"" + getDescriptorForType().mo5002() + "\".");
        }
        m15942();
        this.f18685.m24526(abstractC16755M24126.mo25504(), abstractC16755M24126.mo25500(c14495));
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m15945() {
        C9296 c9296 = this.f18685;
        return c9296 == null || c9296.m24527();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8551 m15940(AbstractC5307 abstractC5307) {
        C9296 c9296 = abstractC5307.f18685;
        if (c9296 == null) {
            return C8551.m22888();
        }
        return c9296.m24525();
    }

    @Override // l.AbstractC15001, l.InterfaceC9824
    public boolean isInitialized() {
        return super.isInitialized() && m15945();
    }

    @Override // l.AbstractC15001, l.InterfaceC9078
    public final Map getAllFields() {
        Map mapM36130 = m36130();
        C9296 c9296 = this.f18685;
        if (c9296 != null) {
            mapM36130.putAll(c9296.m24522());
        }
        return C4681.unmodifiableMap(mapM36130);
    }

    @Override // l.AbstractC15001, l.InterfaceC9078
    public final Object getField(C7323 c7323) {
        if (c7323.m20083()) {
            m15941(c7323);
            C9296 c9296 = this.f18685;
            Object objM24524 = c9296 == null ? null : c9296.m24524(c7323);
            if (objM24524 != null) {
                return objM24524;
            }
            if (c7323.m20086() == EnumC2848.MESSAGE) {
                return C11534.m29035(c7323.m20093());
            }
            return c7323.m20097();
        }
        return super.getField(c7323);
    }

    @Override // l.AbstractC15001, l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 getFieldBuilder(C7323 c7323) {
        if (c7323.m20083()) {
            m15941(c7323);
            if (c7323.m20086() != EnumC2848.MESSAGE) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }
            m15942();
            Object objM24514 = this.f18685.m24514((InterfaceC2585) c7323);
            if (objM24514 == null) {
                C1840 c1840 = new C1840(c7323.m20093(), 0);
                this.f18685.m24526(c7323, c1840);
                onChanged();
                return c1840;
            }
            if (objM24514 instanceof InterfaceC14299) {
                return (InterfaceC14299) objM24514;
            }
            if (objM24514 instanceof InterfaceC21013) {
                InterfaceC14299 builder = ((InterfaceC21013) objM24514).toBuilder();
                this.f18685.m24526(c7323, builder);
                onChanged();
                return builder;
            }
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
        }
        return super.getFieldBuilder(c7323);
    }

    @Override // l.AbstractC15001
    public final int getRepeatedFieldCount(C7323 c7323) {
        if (c7323.m20083()) {
            m15941(c7323);
            C9296 c9296 = this.f18685;
            if (c9296 == null) {
                return 0;
            }
            c9296.getClass();
            if (!c7323.mo8649()) {
                throw new IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
            }
            Object objM24514 = c9296.m24514((InterfaceC2585) c7323);
            if (objM24514 == null) {
                return 0;
            }
            return ((List) objM24514).size();
        }
        return super.getRepeatedFieldCount(c7323);
    }

    @Override // l.AbstractC15001
    public final Object getRepeatedField(C7323 c7323, int i) {
        if (c7323.m20083()) {
            m15941(c7323);
            C9296 c9296 = this.f18685;
            if (c9296 == null) {
                throw new IndexOutOfBoundsException();
            }
            return c9296.m24516(c7323, i);
        }
        return super.getRepeatedField(c7323, i);
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    public final InterfaceC14299 getRepeatedFieldBuilder(C7323 c7323, int i) {
        if (c7323.m20083()) {
            m15941(c7323);
            m15942();
            if (c7323.m20086() != EnumC2848.MESSAGE) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            Object objM24515 = this.f18685.m24515((InterfaceC2585) c7323, i);
            if (objM24515 instanceof InterfaceC14299) {
                return (InterfaceC14299) objM24515;
            }
            if (objM24515 instanceof InterfaceC21013) {
                InterfaceC14299 builder = ((InterfaceC21013) objM24515).toBuilder();
                this.f18685.m24519(c7323, i, builder);
                onChanged();
                return builder;
            }
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
        }
        return super.getRepeatedFieldBuilder(c7323, i);
    }

    @Override // l.AbstractC15001, l.InterfaceC9078
    public final boolean hasField(C7323 c7323) {
        if (c7323.m20083()) {
            m15941(c7323);
            C9296 c9296 = this.f18685;
            return c9296 != null && c9296.m24523(c7323);
        }
        return super.hasField(c7323);
    }

    @Override // l.AbstractC15001, l.InterfaceC14299
    public final InterfaceC14299 setField(C7323 c7323, Object obj) {
        if (c7323.m20083()) {
            m15941(c7323);
            m15942();
            this.f18685.m24526(c7323, obj);
            onChanged();
            return this;
        }
        return (AbstractC5307) super.setField(c7323, obj);
    }

    @Override // l.AbstractC15001, l.InterfaceC14299
    public final AbstractC15001 setField(C7323 c7323, Object obj) {
        if (c7323.m20083()) {
            m15941(c7323);
            m15942();
            this.f18685.m24526(c7323, obj);
            onChanged();
            return this;
        }
        return (AbstractC5307) super.setField(c7323, obj);
    }

    @Override // l.AbstractC15001, l.InterfaceC14299
    public final InterfaceC14299 clearField(C7323 c7323) {
        if (c7323.m20083()) {
            m15941(c7323);
            m15942();
            this.f18685.m24518(c7323);
            onChanged();
            return this;
        }
        return (AbstractC5307) super.clearField(c7323);
    }

    @Override // l.AbstractC15001, l.InterfaceC14299
    public final AbstractC15001 clearField(C7323 c7323) {
        if (c7323.m20083()) {
            m15941(c7323);
            m15942();
            this.f18685.m24518(c7323);
            onChanged();
            return this;
        }
        return (AbstractC5307) super.clearField(c7323);
    }

    @Override // l.AbstractC15001
    public final InterfaceC14299 setRepeatedField(C7323 c7323, int i, Object obj) {
        if (c7323.m20083()) {
            m15941(c7323);
            m15942();
            this.f18685.m24519(c7323, i, obj);
            onChanged();
            return this;
        }
        return (AbstractC5307) super.setRepeatedField(c7323, i, obj);
    }

    @Override // l.AbstractC15001
    public final AbstractC15001 setRepeatedField(C7323 c7323, int i, Object obj) {
        if (c7323.m20083()) {
            m15941(c7323);
            m15942();
            this.f18685.m24519(c7323, i, obj);
            onChanged();
            return this;
        }
        return (AbstractC5307) super.setRepeatedField(c7323, i, obj);
    }

    @Override // l.AbstractC15001, l.InterfaceC14299
    public final InterfaceC14299 addRepeatedField(C7323 c7323, Object obj) {
        if (c7323.m20083()) {
            m15941(c7323);
            m15942();
            this.f18685.m24520(c7323, obj);
            onChanged();
            return this;
        }
        return (AbstractC5307) super.addRepeatedField(c7323, obj);
    }

    @Override // l.AbstractC15001, l.InterfaceC14299
    public final AbstractC15001 addRepeatedField(C7323 c7323, Object obj) {
        if (c7323.m20083()) {
            m15941(c7323);
            m15942();
            this.f18685.m24520(c7323, obj);
            onChanged();
            return this;
        }
        return (AbstractC5307) super.addRepeatedField(c7323, obj);
    }

    @Override // l.AbstractC15001, l.InterfaceC14299
    public final InterfaceC14299 newBuilderForField(C7323 c7323) {
        if (c7323.m20083()) {
            return new C1840(c7323.m20093(), 0);
        }
        return super.newBuilderForField(c7323);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15943(AbstractC11272 abstractC11272) {
        if (abstractC11272.f35569 != null) {
            m15942();
            this.f18685.m24521(abstractC11272.f35569);
            onChanged();
        }
    }

    @Override // l.AbstractC15001
    public final boolean parseUnknownField(AbstractC3660 abstractC3660, C24215 c24215, int i) {
        m15942();
        abstractC3660.getClass();
        return C21933.m49631(abstractC3660, getUnknownFieldSetBuilder(), c24215, getDescriptorForType(), new C6842(this.f18685), i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15941(C7323 c7323) {
        if (c7323.m20099() != getDescriptorForType()) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }
}
