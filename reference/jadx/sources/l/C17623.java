package l;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܿ᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 69R1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17623 extends AbstractC3967 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C2806 f56028;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C18224 f56029;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C6708 f56030;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C19741[] f56031;

    public /* synthetic */ C17623(C2806 c2806, int i) {
        this(c2806);
    }

    @Override // l.AbstractC3967
    /* JADX INFO: renamed from: mergeUnknownFields */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2781mergeUnknownFields(C6708 c6708) {
        m41004mergeUnknownFields(c6708);
        return this;
    }

    @Override // l.AbstractC3967
    /* JADX INFO: renamed from: mergeUnknownFields */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2781mergeUnknownFields(C6708 c6708) {
        m41004mergeUnknownFields(c6708);
        return this;
    }

    public C17623(C2806 c2806) {
        this.f56028 = c2806;
        int i = C8347.f28924;
        this.f56029 = new C18224(0);
        this.f56030 = C6708.m18141();
        this.f56031 = new C19741[c2806.mo8524().m1366()];
    }

    @Override // l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final AbstractC3967 mo2777clear() {
        int i = C8347.f28924;
        this.f56029 = new C18224(0);
        this.f56030 = C6708.m18141();
        return this;
    }

    @Override // l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final InterfaceC6977 mo2777clear() {
        int i = C8347.f28924;
        this.f56029 = new C18224(0);
        this.f56030 = C6708.m18141();
        return this;
    }

    @Override // l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final InterfaceC22500 mo2777clear() {
        int i = C8347.f28924;
        this.f56029 = new C18224(0);
        this.f56030 = C6708.m18141();
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final C17623 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C6334) {
            C6334 c6334 = (C6334) interfaceC1332;
            if (c6334.f21382 == this.f56028) {
                this.f56029.m42363(c6334.f21381);
                m41004mergeUnknownFields(c6334.f21380);
                int i = 0;
                while (true) {
                    C19741[] c19741Arr = this.f56031;
                    if (i >= c19741Arr.length) {
                        return this;
                    }
                    if (c19741Arr[i] == null) {
                        c19741Arr[i] = c6334.f21379[i];
                    } else if (c6334.f21379[i] != null && c19741Arr[i] != c6334.f21379[i]) {
                        this.f56029.m42364(c19741Arr[i]);
                        c19741Arr[i] = c6334.f21379[i];
                    }
                    i++;
                }
            } else {
                throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
            }
        } else {
            return (C17623) super.mergeFrom(interfaceC1332);
        }
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C6334 build() {
        if (!isInitialized()) {
            C8347 c8347M42362 = this.f56029.m42362();
            C19741[] c19741Arr = this.f56031;
            throw AbstractC3967.m11452((InterfaceC1332) new C6334(this.f56028, c8347M42362, (C19741[]) Arrays.copyOf(c19741Arr, c19741Arr.length), this.f56030));
        }
        return buildPartial();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C6334 buildPartial() {
        C2806 c2806 = this.f56028;
        if (c2806.m8525().m29471()) {
            for (C19741 c19741 : c2806.getFields()) {
                if (c19741.m44899() && !this.f56029.m42368(c19741)) {
                    if (c19741.m44913() == EnumC19035.MESSAGE) {
                        this.f56029.m42371(c19741, C6334.m17438(c19741.m44907()));
                    } else {
                        this.f56029.m42371(c19741, c19741.m44911());
                    }
                }
            }
        }
        C8347 c8347M42370 = this.f56029.m42370();
        C19741[] c19741Arr = this.f56031;
        return new C6334(c2806, c8347M42370, (C19741[]) Arrays.copyOf(c19741Arr, c19741Arr.length), this.f56030);
    }

    @Override // l.AbstractC3967, l.AbstractC21607
    /* JADX INFO: renamed from: clone */
    public final C17623 mo2780clone() {
        C17623 c17623 = new C17623(this.f56028);
        c17623.f56029.m42363(this.f56029.m42362());
        c17623.m41004mergeUnknownFields(this.f56030);
        C19741[] c19741Arr = c17623.f56031;
        C19741[] c19741Arr2 = this.f56031;
        System.arraycopy(c19741Arr2, 0, c19741Arr, 0, c19741Arr2.length);
        return c17623;
    }

    @Override // l.InterfaceC15445
    public final boolean isInitialized() {
        for (C19741 c19741 : this.f56028.getFields()) {
            if (c19741.m44914() && !this.f56029.m42368(c19741)) {
                return false;
            }
        }
        return this.f56029.m42358();
    }

    @Override // l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return this.f56028;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C6334.m17438(this.f56028);
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C6334.m17438(this.f56028);
    }

    @Override // l.InterfaceC18266
    public final Map getAllFields() {
        return this.f56029.m42367();
    }

    @Override // l.InterfaceC22500
    public final InterfaceC22500 newBuilderForField(C19741 c19741) {
        m41002(c19741);
        if (c19741.m44913() != EnumC19035.MESSAGE) {
            throw new IllegalArgumentException("newBuilderForField is only valid for fields with message type.");
        }
        return new C17623(c19741.m44907());
    }

    @Override // l.InterfaceC18266
    public final boolean hasField(C19741 c19741) {
        m41002(c19741);
        return this.f56029.m42368(c19741);
    }

    @Override // l.InterfaceC18266
    public final Object getField(C19741 c19741) {
        m41002(c19741);
        Object objM42369 = this.f56029.m42369(c19741);
        if (objM42369 != null) {
            return objM42369;
        }
        if (c19741.mo23408()) {
            return Collections.EMPTY_LIST;
        }
        if (c19741.m44913() == EnumC19035.MESSAGE) {
            return C6334.m17438(c19741.m44907());
        }
        return c19741.m44911();
    }

    @Override // l.InterfaceC22500
    public final InterfaceC22500 setField(C19741 c19741, Object obj) {
        m41002(c19741);
        if (c19741.mo23408()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m41003(c19741, it.next());
            }
        } else {
            m41003(c19741, obj);
        }
        C21151 c21151M44906 = c19741.m44906();
        if (c21151M44906 != null) {
            int iM47595 = c21151M44906.m47595();
            C19741[] c19741Arr = this.f56031;
            C19741 c19742 = c19741Arr[iM47595];
            if (c19742 != null && c19742 != c19741) {
                this.f56029.m42364(c19742);
            }
            c19741Arr[iM47595] = c19741;
        } else if (!c19741.m44897() && !c19741.mo23408() && obj.equals(c19741.m44911())) {
            this.f56029.m42364(c19741);
            return this;
        }
        this.f56029.m42371(c19741, obj);
        return this;
    }

    @Override // l.InterfaceC22500
    public final InterfaceC22500 clearField(C19741 c19741) {
        m41002(c19741);
        C21151 c21151M44906 = c19741.m44906();
        if (c21151M44906 != null) {
            int iM47595 = c21151M44906.m47595();
            C19741[] c19741Arr = this.f56031;
            if (c19741Arr[iM47595] == c19741) {
                c19741Arr[iM47595] = null;
            }
        }
        this.f56029.m42364(c19741);
        return this;
    }

    @Override // l.InterfaceC22500
    public final InterfaceC22500 addRepeatedField(C19741 c19741, Object obj) {
        m41002(c19741);
        m41003(c19741, obj);
        this.f56029.m42366(c19741, obj);
        return this;
    }

    @Override // l.InterfaceC18266
    public final C6708 getUnknownFields() {
        return this.f56030;
    }

    @Override // l.InterfaceC22500
    public final InterfaceC22500 setUnknownFields(C6708 c6708) {
        this.f56030 = c6708;
        return this;
    }

    /* JADX INFO: renamed from: mergeUnknownFields, reason: collision with other method in class */
    public final void m41004mergeUnknownFields(C6708 c6708) {
        C6708 c6709 = this.f56030;
        int i = C6708.f22609;
        C22231 c22231M49355 = C22231.m49355();
        c22231M49355.m49360(c6709);
        c22231M49355.m49360(c6708);
        this.f56030 = c22231M49355.build();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m41002(C19741 c19741) {
        if (c19741.m44910() != this.f56028) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }

    @Override // l.AbstractC3967
    /* JADX INFO: renamed from: clearOneof */
    public final AbstractC3967 mo2778clearOneof(C21151 c21151) {
        if (c21151.m47593() == this.f56028) {
            int iM47595 = c21151.m47595();
            C19741[] c19741Arr = this.f56031;
            C19741 c19741 = c19741Arr[iM47595];
            if (c19741 != null) {
                m41002(c19741);
                C21151 c21151M44906 = c19741.m44906();
                if (c21151M44906 != null) {
                    int iM47596 = c21151M44906.m47595();
                    if (c19741Arr[iM47596] == c19741) {
                        c19741Arr[iM47596] = null;
                    }
                }
                this.f56029.m42364(c19741);
            }
            return this;
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    @Override // l.AbstractC3967
    /* JADX INFO: renamed from: clearOneof */
    public final InterfaceC22500 mo2778clearOneof(C21151 c21151) {
        if (c21151.m47593() == this.f56028) {
            int iM47595 = c21151.m47595();
            C19741[] c19741Arr = this.f56031;
            C19741 c19741 = c19741Arr[iM47595];
            if (c19741 != null) {
                m41002(c19741);
                C21151 c21151M44906 = c19741.m44906();
                if (c21151M44906 != null) {
                    int iM47596 = c21151M44906.m47595();
                    if (c19741Arr[iM47596] == c19741) {
                        c19741Arr[iM47596] = null;
                    }
                }
                this.f56029.m42364(c19741);
            }
            return this;
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    @Override // l.AbstractC3967
    public final C19741 getOneofFieldDescriptor(C21151 c21151) {
        if (c21151.m47593() == this.f56028) {
            return this.f56031[c21151.m47595()];
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    @Override // l.AbstractC3967
    public final boolean hasOneof(C21151 c21151) {
        if (c21151.m47593() == this.f56028) {
            return this.f56031[c21151.m47595()] != null;
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41003(C19741 c19741, Object obj) {
        int i = C12685.f42355[c19741.getType().ordinal()];
        if (i == 1) {
            obj.getClass();
            if (!(obj instanceof C21857)) {
                throw new IllegalArgumentException("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
            }
        } else if (i == 2 && (obj instanceof InterfaceC22500)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(c19741.getNumber()), c19741.mo23407().m9597(), obj.getClass().getName()));
        }
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 getFieldBuilder(C19741 c19741) {
        InterfaceC22500 interfaceC22500M41001;
        m41002(c19741);
        if (c19741.m44909()) {
            throw new UnsupportedOperationException("Nested builder not supported for map fields.");
        }
        if (c19741.m44913() != EnumC19035.MESSAGE) {
            throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
        }
        Object objM42359 = this.f56029.m42359((InterfaceC18930) c19741);
        if (objM42359 == null) {
            interfaceC22500M41001 = new C17623(c19741.m44907());
        } else {
            interfaceC22500M41001 = m41001(objM42359);
        }
        this.f56029.m42371(c19741, interfaceC22500M41001);
        return interfaceC22500M41001;
    }

    @Override // l.AbstractC3967
    public final InterfaceC22500 getRepeatedFieldBuilder(C19741 c19741, int i) {
        m41002(c19741);
        if (c19741.m44909()) {
            throw new UnsupportedOperationException("Map fields cannot be repeated");
        }
        if (c19741.m44913() != EnumC19035.MESSAGE) {
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
        }
        InterfaceC22500 interfaceC22500M41001 = m41001(this.f56029.m42360((InterfaceC18930) c19741, i));
        this.f56029.m42365(c19741, i, interfaceC22500M41001);
        return interfaceC22500M41001;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC22500 m41001(Object obj) {
        if (obj instanceof InterfaceC22500) {
            return (InterfaceC22500) obj;
        }
        if (obj instanceof C22875) {
            obj = ((C22875) obj).m50621();
        }
        if (obj instanceof InterfaceC1332) {
            return ((InterfaceC1332) obj).toBuilder();
        }
        throw new IllegalArgumentException(C16236.m38347(obj.getClass(), "Cannot convert ", " to Message.Builder"));
    }
}
