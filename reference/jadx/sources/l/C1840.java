package l;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.֫ۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69R1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1840 extends AbstractC0479 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C7719 f6219;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C9296 f6220;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C24478 f6221;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7323[] f6222;

    public /* synthetic */ C1840(C24478 c24478, int i) {
        this(c24478);
    }

    @Override // l.AbstractC0479
    /* JADX INFO: renamed from: mergeUnknownFields */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2317mergeUnknownFields(C7719 c7719) {
        m6347mergeUnknownFields(c7719);
        return this;
    }

    @Override // l.AbstractC0479
    /* JADX INFO: renamed from: mergeUnknownFields */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2317mergeUnknownFields(C7719 c7719) {
        m6347mergeUnknownFields(c7719);
        return this;
    }

    public C1840(C24478 c24478) {
        this.f6221 = c24478;
        int i = C8551.f27923;
        this.f6220 = new C9296(0);
        this.f6219 = C7719.m21003();
        this.f6222 = new C7323[c24478.mo5000().m37133()];
    }

    @Override // l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final AbstractC0479 mo2313clear() {
        int i = C8551.f27923;
        this.f6220 = new C9296(0);
        this.f6219 = C7719.m21003();
        return this;
    }

    @Override // l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final InterfaceC7588 mo2313clear() {
        int i = C8551.f27923;
        this.f6220 = new C9296(0);
        this.f6219 = C7719.m21003();
        return this;
    }

    @Override // l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final InterfaceC14299 mo2313clear() {
        int i = C8551.f27923;
        this.f6220 = new C9296(0);
        this.f6219 = C7719.m21003();
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final C1840 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C11534) {
            C11534 c11534 = (C11534) interfaceC21013;
            if (c11534.f36280 == this.f6221) {
                this.f6220.m24521(c11534.f36282);
                m6347mergeUnknownFields(c11534.f36281);
                int i = 0;
                while (true) {
                    C7323[] c7323Arr = this.f6222;
                    if (i >= c7323Arr.length) {
                        return this;
                    }
                    if (c7323Arr[i] == null) {
                        c7323Arr[i] = c11534.f36283[i];
                    } else if (c11534.f36283[i] != null && c7323Arr[i] != c11534.f36283[i]) {
                        this.f6220.m24518(c7323Arr[i]);
                        c7323Arr[i] = c11534.f36283[i];
                    }
                    i++;
                }
            } else {
                throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
            }
        } else {
            return (C1840) super.mergeFrom(interfaceC21013);
        }
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C11534 build() {
        if (!isInitialized()) {
            C8551 c8551M24517 = this.f6220.m24517();
            C7323[] c7323Arr = this.f6222;
            throw AbstractC0479.m2311((InterfaceC21013) new C11534(this.f6221, c8551M24517, (C7323[]) Arrays.copyOf(c7323Arr, c7323Arr.length), this.f6219));
        }
        return buildPartial();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C11534 buildPartial() {
        C24478 c24478 = this.f6221;
        if (c24478.m54744().m17892()) {
            for (C7323 c7323 : c24478.getFields()) {
                if (c7323.m20091() && !this.f6220.m24523(c7323)) {
                    if (c7323.m20086() == EnumC2848.MESSAGE) {
                        this.f6220.m24526(c7323, C11534.m29035(c7323.m20093()));
                    } else {
                        this.f6220.m24526(c7323, c7323.m20097());
                    }
                }
            }
        }
        C8551 c8551M24525 = this.f6220.m24525();
        C7323[] c7323Arr = this.f6222;
        return new C11534(c24478, c8551M24525, (C7323[]) Arrays.copyOf(c7323Arr, c7323Arr.length), this.f6219);
    }

    @Override // l.AbstractC0479, l.AbstractC1225
    /* JADX INFO: renamed from: clone */
    public final C1840 mo2316clone() {
        C1840 c1840 = new C1840(this.f6221);
        c1840.f6220.m24521(this.f6220.m24517());
        c1840.m6347mergeUnknownFields(this.f6219);
        C7323[] c7323Arr = c1840.f6222;
        C7323[] c7323Arr2 = this.f6222;
        System.arraycopy(c7323Arr2, 0, c7323Arr, 0, c7323Arr2.length);
        return c1840;
    }

    @Override // l.InterfaceC9824
    public final boolean isInitialized() {
        for (C7323 c7323 : this.f6221.getFields()) {
            if (c7323.m20090() && !this.f6220.m24523(c7323)) {
                return false;
            }
        }
        return this.f6220.m24527();
    }

    @Override // l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return this.f6221;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C11534.m29035(this.f6221);
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C11534.m29035(this.f6221);
    }

    @Override // l.InterfaceC9078
    public final Map getAllFields() {
        return this.f6220.m24522();
    }

    @Override // l.InterfaceC14299
    public final InterfaceC14299 newBuilderForField(C7323 c7323) {
        m6345(c7323);
        if (c7323.m20086() != EnumC2848.MESSAGE) {
            throw new IllegalArgumentException("newBuilderForField is only valid for fields with message type.");
        }
        return new C1840(c7323.m20093());
    }

    @Override // l.InterfaceC9078
    public final boolean hasField(C7323 c7323) {
        m6345(c7323);
        return this.f6220.m24523(c7323);
    }

    @Override // l.InterfaceC9078
    public final Object getField(C7323 c7323) {
        m6345(c7323);
        Object objM24524 = this.f6220.m24524(c7323);
        if (objM24524 != null) {
            return objM24524;
        }
        if (c7323.mo8649()) {
            return Collections.EMPTY_LIST;
        }
        if (c7323.m20086() == EnumC2848.MESSAGE) {
            return C11534.m29035(c7323.m20093());
        }
        return c7323.m20097();
    }

    @Override // l.InterfaceC14299
    public final InterfaceC14299 setField(C7323 c7323, Object obj) {
        m6345(c7323);
        if (c7323.mo8649()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m6346(c7323, it.next());
            }
        } else {
            m6346(c7323, obj);
        }
        C10788 c10788M20094 = c7323.m20094();
        if (c10788M20094 != null) {
            int iM27501 = c10788M20094.m27501();
            C7323[] c7323Arr = this.f6222;
            C7323 c7324 = c7323Arr[iM27501];
            if (c7324 != null && c7324 != c7323) {
                this.f6220.m24518(c7324);
            }
            c7323Arr[iM27501] = c7323;
        } else if (!c7323.m20095() && !c7323.mo8649() && obj.equals(c7323.m20097())) {
            this.f6220.m24518(c7323);
            return this;
        }
        this.f6220.m24526(c7323, obj);
        return this;
    }

    @Override // l.InterfaceC14299
    public final InterfaceC14299 clearField(C7323 c7323) {
        m6345(c7323);
        C10788 c10788M20094 = c7323.m20094();
        if (c10788M20094 != null) {
            int iM27501 = c10788M20094.m27501();
            C7323[] c7323Arr = this.f6222;
            if (c7323Arr[iM27501] == c7323) {
                c7323Arr[iM27501] = null;
            }
        }
        this.f6220.m24518(c7323);
        return this;
    }

    @Override // l.InterfaceC14299
    public final InterfaceC14299 addRepeatedField(C7323 c7323, Object obj) {
        m6345(c7323);
        m6346(c7323, obj);
        this.f6220.m24520(c7323, obj);
        return this;
    }

    @Override // l.InterfaceC9078
    public final C7719 getUnknownFields() {
        return this.f6219;
    }

    @Override // l.InterfaceC14299
    public final InterfaceC14299 setUnknownFields(C7719 c7719) {
        this.f6219 = c7719;
        return this;
    }

    /* JADX INFO: renamed from: mergeUnknownFields, reason: collision with other method in class */
    public final void m6347mergeUnknownFields(C7719 c7719) {
        C7719 c77110 = this.f6219;
        int i = C7719.f25443;
        C14430 c14430M34853 = C14430.m34853();
        c14430M34853.m34859(c77110);
        c14430M34853.m34859(c7719);
        this.f6219 = c14430M34853.build();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m6345(C7323 c7323) {
        if (c7323.m20099() != this.f6221) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }

    @Override // l.AbstractC0479
    /* JADX INFO: renamed from: clearOneof */
    public final AbstractC0479 mo2314clearOneof(C10788 c10788) {
        if (c10788.m27500() == this.f6221) {
            int iM27501 = c10788.m27501();
            C7323[] c7323Arr = this.f6222;
            C7323 c7323 = c7323Arr[iM27501];
            if (c7323 != null) {
                m6345(c7323);
                C10788 c10788M20094 = c7323.m20094();
                if (c10788M20094 != null) {
                    int iM27502 = c10788M20094.m27501();
                    if (c7323Arr[iM27502] == c7323) {
                        c7323Arr[iM27502] = null;
                    }
                }
                this.f6220.m24518(c7323);
            }
            return this;
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    @Override // l.AbstractC0479
    /* JADX INFO: renamed from: clearOneof */
    public final InterfaceC14299 mo2314clearOneof(C10788 c10788) {
        if (c10788.m27500() == this.f6221) {
            int iM27501 = c10788.m27501();
            C7323[] c7323Arr = this.f6222;
            C7323 c7323 = c7323Arr[iM27501];
            if (c7323 != null) {
                m6345(c7323);
                C10788 c10788M20094 = c7323.m20094();
                if (c10788M20094 != null) {
                    int iM27502 = c10788M20094.m27501();
                    if (c7323Arr[iM27502] == c7323) {
                        c7323Arr[iM27502] = null;
                    }
                }
                this.f6220.m24518(c7323);
            }
            return this;
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    @Override // l.AbstractC0479
    public final C7323 getOneofFieldDescriptor(C10788 c10788) {
        if (c10788.m27500() == this.f6221) {
            return this.f6222[c10788.m27501()];
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    @Override // l.AbstractC0479
    public final boolean hasOneof(C10788 c10788) {
        if (c10788.m27500() == this.f6221) {
            return this.f6222[c10788.m27501()] != null;
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6346(C7323 c7323, Object obj) {
        int i = C5569.f19348[c7323.getType().ordinal()];
        if (i == 1) {
            obj.getClass();
            if (!(obj instanceof C1357)) {
                throw new IllegalArgumentException("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
            }
        } else if (i == 2 && (obj instanceof InterfaceC14299)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(c7323.getNumber()), c7323.mo8652().m11207(), obj.getClass().getName()));
        }
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 getFieldBuilder(C7323 c7323) {
        InterfaceC14299 interfaceC14299M6344;
        m6345(c7323);
        if (c7323.m20096()) {
            throw new UnsupportedOperationException("Nested builder not supported for map fields.");
        }
        if (c7323.m20086() != EnumC2848.MESSAGE) {
            throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
        }
        Object objM24514 = this.f6220.m24514((InterfaceC2585) c7323);
        if (objM24514 == null) {
            interfaceC14299M6344 = new C1840(c7323.m20093());
        } else {
            interfaceC14299M6344 = m6344(objM24514);
        }
        this.f6220.m24526(c7323, interfaceC14299M6344);
        return interfaceC14299M6344;
    }

    @Override // l.AbstractC0479
    public final InterfaceC14299 getRepeatedFieldBuilder(C7323 c7323, int i) {
        m6345(c7323);
        if (c7323.m20096()) {
            throw new UnsupportedOperationException("Map fields cannot be repeated");
        }
        if (c7323.m20086() != EnumC2848.MESSAGE) {
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
        }
        InterfaceC14299 interfaceC14299M6344 = m6344(this.f6220.m24515((InterfaceC2585) c7323, i));
        this.f6220.m24519(c7323, i, interfaceC14299M6344);
        return interfaceC14299M6344;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC14299 m6344(Object obj) {
        if (obj instanceof InterfaceC14299) {
            return (InterfaceC14299) obj;
        }
        if (obj instanceof C18971) {
            obj = ((C18971) obj).m44067();
        }
        if (obj instanceof InterfaceC21013) {
            return ((InterfaceC21013) obj).toBuilder();
        }
        throw new IllegalArgumentException(C20551.m47117(obj.getClass(), "Cannot convert ", " to Message.Builder"));
    }
}
