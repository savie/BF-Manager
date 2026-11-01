package l;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۛᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6229 extends AbstractC18245 implements InterfaceC18266 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C8347 f21147;

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public /* bridge */ /* synthetic */ InterfaceC23206 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public AbstractC6229() {
        this.f21147 = C8347.m21834();
    }

    public AbstractC6229(AbstractC12580 abstractC12580) {
        super(abstractC12580);
        this.f21147 = AbstractC12580.m31296(abstractC12580);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object m17284(AbstractC14802 abstractC14802) {
        AbstractC23974 abstractC23974M42420 = AbstractC18245.m42420(abstractC14802);
        if (abstractC23974M42420.mo36901().m44910() != getDescriptorForType()) {
            throw new IllegalArgumentException("Extension is for type \"" + abstractC23974M42420.mo36901().m44910().mo8523() + "\" which does not match message type \"" + getDescriptorForType().mo8523() + "\".");
        }
        C19741 c19741Mo36901 = abstractC23974M42420.mo36901();
        Object objM21838 = this.f21147.m21838((InterfaceC18930) c19741Mo36901);
        if (objM21838 == null) {
            if (c19741Mo36901.mo23408()) {
                return Collections.EMPTY_LIST;
            }
            if (c19741Mo36901.m44913() == EnumC19035.MESSAGE) {
                return abstractC23974M42420.mo36899();
            }
            return abstractC23974M42420.mo36896(c19741Mo36901.m44911());
        }
        return abstractC23974M42420.mo36896(objM21838);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m17285() {
        return this.f21147.m21835();
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
    public boolean isInitialized() {
        return super.isInitialized() && this.f21147.m21835();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m17282() {
        return this.f21147.m21836();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Map m17283() {
        return this.f21147.m21848();
    }

    @Override // l.AbstractC18245, l.InterfaceC18266
    public final Map getAllFields() {
        Map mapM42394 = m42394(false);
        mapM42394.putAll(this.f21147.m21848());
        return C0561.unmodifiableMap(mapM42394);
    }

    @Override // l.AbstractC18245
    public final Map getAllFieldsRaw() {
        Map mapM42394 = m42394(false);
        mapM42394.putAll(this.f21147.m21848());
        return C0561.unmodifiableMap(mapM42394);
    }

    @Override // l.AbstractC18245, l.InterfaceC18266
    public final boolean hasField(C19741 c19741) {
        if (c19741.m44908()) {
            m17281(c19741);
            return this.f21147.m21844(c19741);
        }
        return super.hasField(c19741);
    }

    @Override // l.AbstractC18245, l.InterfaceC18266
    public final Object getField(C19741 c19741) {
        if (c19741.m44908()) {
            m17281(c19741);
            Object objM21838 = this.f21147.m21838((InterfaceC18930) c19741);
            if (objM21838 != null) {
                return objM21838;
            }
            if (c19741.mo23408()) {
                return Collections.EMPTY_LIST;
            }
            if (c19741.m44913() == EnumC19035.MESSAGE) {
                return C6334.m17438(c19741.m44907());
            }
            return c19741.m44911();
        }
        return super.getField(c19741);
    }

    @Override // l.AbstractC18245
    public final int getRepeatedFieldCount(C19741 c19741) {
        if (c19741.m44908()) {
            m17281(c19741);
            C8347 c8347 = this.f21147;
            c8347.getClass();
            if (!c19741.mo23408()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objM21838 = c8347.m21838((InterfaceC18930) c19741);
            if (objM21838 == null) {
                return 0;
            }
            return ((List) objM21838).size();
        }
        return super.getRepeatedFieldCount(c19741);
    }

    @Override // l.AbstractC18245
    public final Object getRepeatedField(C19741 c19741, int i) {
        if (c19741.m44908()) {
            m17281(c19741);
            C8347 c8347 = this.f21147;
            c8347.getClass();
            if (!c19741.mo23408()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objM21838 = c8347.m21838((InterfaceC18930) c19741);
            if (objM21838 == null) {
                throw new IndexOutOfBoundsException();
            }
            return ((List) objM21838).get(i);
        }
        return super.getRepeatedField(c19741, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m17281(C19741 c19741) {
        if (c19741.m44910() != getDescriptorForType()) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }
}
