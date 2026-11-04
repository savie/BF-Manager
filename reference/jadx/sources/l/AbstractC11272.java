package l;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۧ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11272 extends AbstractC9035 implements InterfaceC9078 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C8551 f35569;

    @Override // l.AbstractC19124, l.InterfaceC9824
    public /* bridge */ /* synthetic */ InterfaceC18775 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public AbstractC11272() {
        this.f35569 = C8551.m22895();
    }

    public AbstractC11272(AbstractC5307 abstractC5307) {
        super(abstractC5307);
        this.f35569 = AbstractC5307.m15940(abstractC5307);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object m28525(AbstractC17501 abstractC17501) {
        AbstractC16755 abstractC16755M24126 = AbstractC9035.m24126(abstractC17501);
        if (abstractC16755M24126.mo25504().m20099() != getDescriptorForType()) {
            throw new IllegalArgumentException("Extension is for type \"" + abstractC16755M24126.mo25504().m20099().mo5002() + "\" which does not match message type \"" + getDescriptorForType().mo5002() + "\".");
        }
        C7323 c7323Mo25504 = abstractC16755M24126.mo25504();
        Object objM22897 = this.f35569.m22897((InterfaceC2585) c7323Mo25504);
        if (objM22897 == null) {
            if (c7323Mo25504.mo8649()) {
                return Collections.EMPTY_LIST;
            }
            if (c7323Mo25504.m20086() == EnumC2848.MESSAGE) {
                return abstractC16755M24126.mo25502();
            }
            return abstractC16755M24126.mo25499(c7323Mo25504.m20097());
        }
        return abstractC16755M24126.mo25499(objM22897);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m28524() {
        return this.f35569.m22906();
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public boolean isInitialized() {
        return super.isInitialized() && this.f35569.m22906();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m28523() {
        return this.f35569.m22911();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map m28526() {
        return this.f35569.m22909();
    }

    @Override // l.AbstractC9035, l.InterfaceC9078
    public final Map getAllFields() {
        Map mapM24100 = m24100(false);
        mapM24100.putAll(this.f35569.m22909());
        return C4681.unmodifiableMap(mapM24100);
    }

    @Override // l.AbstractC9035
    public final Map getAllFieldsRaw() {
        Map mapM24100 = m24100(false);
        mapM24100.putAll(this.f35569.m22909());
        return C4681.unmodifiableMap(mapM24100);
    }

    @Override // l.AbstractC9035, l.InterfaceC9078
    public final boolean hasField(C7323 c7323) {
        if (c7323.m20083()) {
            m28522(c7323);
            return this.f35569.m22903(c7323);
        }
        return super.hasField(c7323);
    }

    @Override // l.AbstractC9035, l.InterfaceC9078
    public final Object getField(C7323 c7323) {
        if (c7323.m20083()) {
            m28522(c7323);
            Object objM22897 = this.f35569.m22897((InterfaceC2585) c7323);
            if (objM22897 != null) {
                return objM22897;
            }
            if (c7323.mo8649()) {
                return Collections.EMPTY_LIST;
            }
            if (c7323.m20086() == EnumC2848.MESSAGE) {
                return C11534.m29035(c7323.m20093());
            }
            return c7323.m20097();
        }
        return super.getField(c7323);
    }

    @Override // l.AbstractC9035
    public final int getRepeatedFieldCount(C7323 c7323) {
        if (c7323.m20083()) {
            m28522(c7323);
            C8551 c8551 = this.f35569;
            c8551.getClass();
            if (!c7323.mo8649()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objM22897 = c8551.m22897((InterfaceC2585) c7323);
            if (objM22897 == null) {
                return 0;
            }
            return ((List) objM22897).size();
        }
        return super.getRepeatedFieldCount(c7323);
    }

    @Override // l.AbstractC9035
    public final Object getRepeatedField(C7323 c7323, int i) {
        if (c7323.m20083()) {
            m28522(c7323);
            C8551 c8551 = this.f35569;
            c8551.getClass();
            if (!c7323.mo8649()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objM22897 = c8551.m22897((InterfaceC2585) c7323);
            if (objM22897 == null) {
                throw new IndexOutOfBoundsException();
            }
            return ((List) objM22897).get(i);
        }
        return super.getRepeatedField(c7323, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28522(C7323 c7323) {
        if (c7323.m20099() != getDescriptorForType()) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }
}
