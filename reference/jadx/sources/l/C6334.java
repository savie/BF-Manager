package l;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۛ᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 69R1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6334 extends AbstractC23019 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C19741[] f21379;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C6708 f21380;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C8347 f21381;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2806 f21382;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f21383 = -1;

    public C6334(C2806 c2806, C8347 c8347, C19741[] c19741Arr, C6708 c6708) {
        this.f21382 = c2806;
        this.f21381 = c8347;
        this.f21379 = c19741Arr;
        this.f21380 = c6708;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6334 m17438(C2806 c2806) {
        return new C6334(c2806, C8347.m21825(), new C19741[c2806.mo8524().m1366()], C6708.m18141());
    }

    @Override // l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return this.f21382;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return m17438(this.f21382);
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return m17438(this.f21382);
    }

    @Override // l.InterfaceC18266
    public final Map getAllFields() {
        return this.f21381.m21848();
    }

    @Override // l.InterfaceC18266
    public final C6708 getUnknownFields() {
        return this.f21380;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445
    public final boolean isInitialized() {
        Iterator it = this.f21382.getFields().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C8347 c8347 = this.f21381;
            if (zHasNext) {
                C19741 c19741 = (C19741) it.next();
                if (c19741.m44914() && !c8347.m21844(c19741)) {
                    return false;
                }
            } else {
                return c8347.m21835();
            }
        }
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final void writeTo(AbstractC22044 abstractC22044) {
        boolean zM29472 = this.f21382.m8525().m29472();
        C6708 c6708 = this.f21380;
        C8347 c8347 = this.f21381;
        if (zM29472) {
            c8347.m21843(abstractC22044);
            c6708.m18144(abstractC22044);
        } else {
            c8347.m21849(abstractC22044);
            c6708.writeTo(abstractC22044);
        }
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final int getSerializedSize() {
        int iM21836;
        int serializedSize;
        int i = this.f21383;
        if (i != -1) {
            return i;
        }
        boolean zM29472 = this.f21382.m8525().m29472();
        C6708 c6708 = this.f21380;
        C8347 c8347 = this.f21381;
        if (zM29472) {
            iM21836 = c8347.m21846();
            serializedSize = c6708.m18146();
        } else {
            iM21836 = c8347.m21836();
            serializedSize = c6708.getSerializedSize();
        }
        int i2 = serializedSize + iM21836;
        this.f21383 = i2;
        return i2;
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final C17623 newBuilderForType() {
        return new C17623(this.f21382, 0);
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC6977 toBuilder() {
        return newBuilderForType().mergeFrom((InterfaceC1332) this);
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public final InterfaceC22500 toBuilder() {
        return newBuilderForType().mergeFrom((InterfaceC1332) this);
    }

    @Override // l.InterfaceC23206
    public final InterfaceC6271 getParserForType() {
        return new C16918(this);
    }

    @Override // l.InterfaceC18266
    public final Object getField(C19741 c19741) {
        if (c19741.m44910() == this.f21382) {
            Object objM21838 = this.f21381.m21838((InterfaceC18930) c19741);
            if (objM21838 != null) {
                return objM21838;
            }
            if (c19741.mo23408()) {
                return Collections.EMPTY_LIST;
            }
            if (c19741.m44913() == EnumC19035.MESSAGE) {
                return m17438(c19741.m44907());
            }
            return c19741.m44911();
        }
        throw new IllegalArgumentException("FieldDescriptor does not match message type.");
    }

    @Override // l.InterfaceC18266
    public final boolean hasField(C19741 c19741) {
        if (c19741.m44910() == this.f21382) {
            return this.f21381.m21844(c19741);
        }
        throw new IllegalArgumentException("FieldDescriptor does not match message type.");
    }

    @Override // l.AbstractC23019
    public final C19741 getOneofFieldDescriptor(C21151 c21151) {
        if (c21151.m47593() == this.f21382) {
            return this.f21379[c21151.m47595()];
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    @Override // l.AbstractC23019
    public final boolean hasOneof(C21151 c21151) {
        if (c21151.m47593() == this.f21382) {
            return this.f21379[c21151.m47595()] != null;
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }
}
