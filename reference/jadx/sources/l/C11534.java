package l;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۧۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11534 extends AbstractC19124 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C24478 f36280;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C7719 f36281;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C8551 f36282;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7323[] f36283;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f36284 = -1;

    public C11534(C24478 c24478, C8551 c8551, C7323[] c7323Arr, C7719 c7719) {
        this.f36280 = c24478;
        this.f36282 = c8551;
        this.f36283 = c7323Arr;
        this.f36281 = c7719;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11534 m29035(C24478 c24478) {
        return new C11534(c24478, C8551.m22888(), new C7323[c24478.mo5000().m37133()], C7719.m21003());
    }

    @Override // l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return this.f36280;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return m29035(this.f36280);
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return m29035(this.f36280);
    }

    @Override // l.InterfaceC9078
    public final Map getAllFields() {
        return this.f36282.m22909();
    }

    @Override // l.InterfaceC9078
    public final C7719 getUnknownFields() {
        return this.f36281;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        Iterator it = this.f36280.getFields().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C8551 c8551 = this.f36282;
            if (zHasNext) {
                C7323 c7323 = (C7323) it.next();
                if (c7323.m20090() && !c8551.m22903(c7323)) {
                    return false;
                }
            } else {
                return c8551.m22906();
            }
        }
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final void writeTo(AbstractC14846 abstractC14846) {
        boolean zM17896 = this.f36280.m54744().m17896();
        C7719 c7719 = this.f36281;
        C8551 c8551 = this.f36282;
        if (zM17896) {
            c8551.m22902(abstractC14846);
            c7719.m21005(abstractC14846);
        } else {
            c8551.m22910(abstractC14846);
            c7719.writeTo(abstractC14846);
        }
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final int getSerializedSize() {
        int iM22911;
        int serializedSize;
        int i = this.f36284;
        if (i != -1) {
            return i;
        }
        boolean zM17896 = this.f36280.m54744().m17896();
        C7719 c7719 = this.f36281;
        C8551 c8551 = this.f36282;
        if (zM17896) {
            iM22911 = c8551.m22905();
            serializedSize = c7719.m21008();
        } else {
            iM22911 = c8551.m22911();
            serializedSize = c7719.getSerializedSize();
        }
        int i2 = serializedSize + iM22911;
        this.f36284 = i2;
        return i2;
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final C1840 newBuilderForType() {
        return new C1840(this.f36280, 0);
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC7588 toBuilder() {
        return newBuilderForType().mergeFrom((InterfaceC21013) this);
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public final InterfaceC14299 toBuilder() {
        return newBuilderForType().mergeFrom((InterfaceC21013) this);
    }

    @Override // l.InterfaceC18775
    public final InterfaceC11490 getParserForType() {
        return new C13026(this);
    }

    @Override // l.InterfaceC9078
    public final Object getField(C7323 c7323) {
        if (c7323.m20099() == this.f36280) {
            Object objM22897 = this.f36282.m22897((InterfaceC2585) c7323);
            if (objM22897 != null) {
                return objM22897;
            }
            if (c7323.mo8649()) {
                return Collections.EMPTY_LIST;
            }
            if (c7323.m20086() == EnumC2848.MESSAGE) {
                return m29035(c7323.m20093());
            }
            return c7323.m20097();
        }
        throw new IllegalArgumentException("FieldDescriptor does not match message type.");
    }

    @Override // l.InterfaceC9078
    public final boolean hasField(C7323 c7323) {
        if (c7323.m20099() == this.f36280) {
            return this.f36282.m22903(c7323);
        }
        throw new IllegalArgumentException("FieldDescriptor does not match message type.");
    }

    @Override // l.AbstractC19124
    public final C7323 getOneofFieldDescriptor(C10788 c10788) {
        if (c10788.m27500() == this.f36280) {
            return this.f36283[c10788.m27501()];
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    @Override // l.AbstractC19124
    public final boolean hasOneof(C10788 c10788) {
        if (c10788.m27500() == this.f36280) {
            return this.f36283[c10788.m27501()] != null;
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }
}
