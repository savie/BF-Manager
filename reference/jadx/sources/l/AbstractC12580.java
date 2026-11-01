package l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۫ᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12580 extends AbstractC0584 implements InterfaceC18266 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C18224 f42050;

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public /* bridge */ /* synthetic */ InterfaceC23206 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public AbstractC12580 mo2777clear() {
        this.f42050 = null;
        return (AbstractC12580) super.mo2777clear();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m31298() {
        if (this.f42050 == null) {
            int i = C8347.f28924;
            this.f42050 = new C18224(0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31300(AbstractC14802 abstractC14802, C22169 c22169) {
        AbstractC23974 abstractC23974M42420 = AbstractC18245.m42420(abstractC14802);
        if (abstractC23974M42420.mo36901().m44910() != getDescriptorForType()) {
            throw new IllegalArgumentException("Extension is for type \"" + abstractC23974M42420.mo36901().m44910().mo8523() + "\" which does not match message type \"" + getDescriptorForType().mo8523() + "\".");
        }
        m31298();
        this.f42050.m42371(abstractC23974M42420.mo36901(), abstractC23974M42420.mo36897(c22169));
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31301() {
        C18224 c18224 = this.f42050;
        return c18224 == null || c18224.m42358();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8347 m31296(AbstractC12580 abstractC12580) {
        C18224 c18224 = abstractC12580.f42050;
        if (c18224 == null) {
            return C8347.m21825();
        }
        return c18224.m42370();
    }

    @Override // l.AbstractC0584, l.InterfaceC15445
    public boolean isInitialized() {
        return super.isInitialized() && m31301();
    }

    @Override // l.AbstractC0584, l.InterfaceC18266
    public final Map getAllFields() {
        Map mapM2773 = m2773();
        C18224 c18224 = this.f42050;
        if (c18224 != null) {
            mapM2773.putAll(c18224.m42367());
        }
        return C0561.unmodifiableMap(mapM2773);
    }

    @Override // l.AbstractC0584, l.InterfaceC18266
    public final Object getField(C19741 c19741) {
        if (c19741.m44908()) {
            m31297(c19741);
            C18224 c18224 = this.f42050;
            Object objM42369 = c18224 == null ? null : c18224.m42369(c19741);
            if (objM42369 != null) {
                return objM42369;
            }
            if (c19741.m44913() == EnumC19035.MESSAGE) {
                return C6334.m17438(c19741.m44907());
            }
            return c19741.m44911();
        }
        return super.getField(c19741);
    }

    @Override // l.AbstractC0584, l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 getFieldBuilder(C19741 c19741) {
        if (c19741.m44908()) {
            m31297(c19741);
            if (c19741.m44913() != EnumC19035.MESSAGE) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }
            m31298();
            Object objM42359 = this.f42050.m42359((InterfaceC18930) c19741);
            if (objM42359 == null) {
                C17623 c17623 = new C17623(c19741.m44907(), 0);
                this.f42050.m42371(c19741, c17623);
                onChanged();
                return c17623;
            }
            if (objM42359 instanceof InterfaceC22500) {
                return (InterfaceC22500) objM42359;
            }
            if (objM42359 instanceof InterfaceC1332) {
                InterfaceC22500 builder = ((InterfaceC1332) objM42359).toBuilder();
                this.f42050.m42371(c19741, builder);
                onChanged();
                return builder;
            }
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
        }
        return super.getFieldBuilder(c19741);
    }

    @Override // l.AbstractC0584
    public final int getRepeatedFieldCount(C19741 c19741) {
        if (c19741.m44908()) {
            m31297(c19741);
            C18224 c18224 = this.f42050;
            if (c18224 == null) {
                return 0;
            }
            c18224.getClass();
            if (!c19741.mo23408()) {
                throw new IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
            }
            Object objM42359 = c18224.m42359((InterfaceC18930) c19741);
            if (objM42359 == null) {
                return 0;
            }
            return ((List) objM42359).size();
        }
        return super.getRepeatedFieldCount(c19741);
    }

    @Override // l.AbstractC0584
    public final Object getRepeatedField(C19741 c19741, int i) {
        if (c19741.m44908()) {
            m31297(c19741);
            C18224 c18224 = this.f42050;
            if (c18224 == null) {
                throw new IndexOutOfBoundsException();
            }
            return c18224.m42361(c19741, i);
        }
        return super.getRepeatedField(c19741, i);
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    public final InterfaceC22500 getRepeatedFieldBuilder(C19741 c19741, int i) {
        if (c19741.m44908()) {
            m31297(c19741);
            m31298();
            if (c19741.m44913() != EnumC19035.MESSAGE) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            Object objM42360 = this.f42050.m42360((InterfaceC18930) c19741, i);
            if (objM42360 instanceof InterfaceC22500) {
                return (InterfaceC22500) objM42360;
            }
            if (objM42360 instanceof InterfaceC1332) {
                InterfaceC22500 builder = ((InterfaceC1332) objM42360).toBuilder();
                this.f42050.m42365(c19741, i, builder);
                onChanged();
                return builder;
            }
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
        }
        return super.getRepeatedFieldBuilder(c19741, i);
    }

    @Override // l.AbstractC0584, l.InterfaceC18266
    public final boolean hasField(C19741 c19741) {
        if (c19741.m44908()) {
            m31297(c19741);
            C18224 c18224 = this.f42050;
            return c18224 != null && c18224.m42368(c19741);
        }
        return super.hasField(c19741);
    }

    @Override // l.AbstractC0584, l.InterfaceC22500
    public final AbstractC0584 setField(C19741 c19741, Object obj) {
        if (c19741.m44908()) {
            m31297(c19741);
            m31298();
            this.f42050.m42371(c19741, obj);
            onChanged();
            return this;
        }
        return (AbstractC12580) super.setField(c19741, obj);
    }

    @Override // l.AbstractC0584, l.InterfaceC22500
    public final InterfaceC22500 setField(C19741 c19741, Object obj) {
        if (c19741.m44908()) {
            m31297(c19741);
            m31298();
            this.f42050.m42371(c19741, obj);
            onChanged();
            return this;
        }
        return (AbstractC12580) super.setField(c19741, obj);
    }

    @Override // l.AbstractC0584, l.InterfaceC22500
    public final AbstractC0584 clearField(C19741 c19741) {
        if (c19741.m44908()) {
            m31297(c19741);
            m31298();
            this.f42050.m42364(c19741);
            onChanged();
            return this;
        }
        return (AbstractC12580) super.clearField(c19741);
    }

    @Override // l.AbstractC0584, l.InterfaceC22500
    public final InterfaceC22500 clearField(C19741 c19741) {
        if (c19741.m44908()) {
            m31297(c19741);
            m31298();
            this.f42050.m42364(c19741);
            onChanged();
            return this;
        }
        return (AbstractC12580) super.clearField(c19741);
    }

    @Override // l.AbstractC0584
    /* JADX INFO: renamed from: setRepeatedField */
    public final AbstractC0584 mo2782setRepeatedField(C19741 c19741, int i, Object obj) {
        if (c19741.m44908()) {
            m31297(c19741);
            m31298();
            this.f42050.m42365(c19741, i, obj);
            onChanged();
            return this;
        }
        return (AbstractC12580) super.mo2782setRepeatedField(c19741, i, obj);
    }

    @Override // l.AbstractC0584
    /* JADX INFO: renamed from: setRepeatedField */
    public final InterfaceC22500 mo2782setRepeatedField(C19741 c19741, int i, Object obj) {
        if (c19741.m44908()) {
            m31297(c19741);
            m31298();
            this.f42050.m42365(c19741, i, obj);
            onChanged();
            return this;
        }
        return (AbstractC12580) super.mo2782setRepeatedField(c19741, i, obj);
    }

    @Override // l.AbstractC0584, l.InterfaceC22500
    public final AbstractC0584 addRepeatedField(C19741 c19741, Object obj) {
        if (c19741.m44908()) {
            m31297(c19741);
            m31298();
            this.f42050.m42366(c19741, obj);
            onChanged();
            return this;
        }
        return (AbstractC12580) super.addRepeatedField(c19741, obj);
    }

    @Override // l.AbstractC0584, l.InterfaceC22500
    public final InterfaceC22500 addRepeatedField(C19741 c19741, Object obj) {
        if (c19741.m44908()) {
            m31297(c19741);
            m31298();
            this.f42050.m42366(c19741, obj);
            onChanged();
            return this;
        }
        return (AbstractC12580) super.addRepeatedField(c19741, obj);
    }

    @Override // l.AbstractC0584, l.InterfaceC22500
    public final InterfaceC22500 newBuilderForField(C19741 c19741) {
        if (c19741.m44908()) {
            return new C17623(c19741.m44907(), 0);
        }
        return super.newBuilderForField(c19741);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31299(AbstractC6229 abstractC6229) {
        if (abstractC6229.f21147 != null) {
            m31298();
            this.f42050.m42363(abstractC6229.f21147);
            onChanged();
        }
    }

    @Override // l.AbstractC0584
    public final boolean parseUnknownField(AbstractC3262 abstractC3262, C2701 c2701, int i) {
        m31298();
        abstractC3262.getClass();
        return C7683.m20316(abstractC3262, getUnknownFieldSetBuilder(), c2701, getDescriptorForType(), new C19678(this.f42050), i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31297(C19741 c19741) {
        if (c19741.m44910() != getDescriptorForType()) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }
}
