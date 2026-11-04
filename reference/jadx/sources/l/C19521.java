package l;

import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ᩴۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9PU */
/* JADX INFO: loaded from: classes5.dex */
public final class C19521 extends AbstractC0479 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f62989;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f62990;

    @Override // l.InterfaceC14299
    public final InterfaceC14299 setUnknownFields(C7719 c7719) {
        return this;
    }

    public /* synthetic */ C19521(int i) {
        this(true, true);
    }

    public C19521(boolean z, boolean z2) {
        this.f62989 = z;
        this.f62990 = z2;
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        buildPartial();
        throw null;
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        buildPartial();
        throw null;
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C15045 buildPartial() {
        return new C15045(0);
    }

    @Override // l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        throw null;
    }

    @Override // l.InterfaceC14299
    public final InterfaceC14299 clearField(C7323 c7323) {
        c7323.m20099();
        throw null;
    }

    @Override // l.InterfaceC9078
    public final Object getField(C7323 c7323) {
        c7323.m20099();
        throw null;
    }

    @Override // l.InterfaceC9078
    public final boolean hasField(C7323 c7323) {
        c7323.m20099();
        throw null;
    }

    @Override // l.InterfaceC14299
    public final InterfaceC14299 newBuilderForField(C7323 c7323) {
        c7323.m20099();
        throw null;
    }

    @Override // l.InterfaceC14299
    public final InterfaceC14299 setField(C7323 c7323, Object obj) {
        c7323.m20099();
        throw null;
    }

    @Override // l.InterfaceC14299
    public final InterfaceC14299 addRepeatedField(C7323 c7323, Object obj) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        throw null;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        throw null;
    }

    @Override // l.InterfaceC9078
    public final Map getAllFields() {
        new TreeMap();
        throw null;
    }

    @Override // l.InterfaceC9078
    public final C7719 getUnknownFields() {
        return C7719.m21003();
    }

    @Override // l.AbstractC0479, l.AbstractC1225
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C19521 mo2316clone() {
        return new C19521(this.f62989, this.f62990);
    }

    @Override // l.InterfaceC9824
    public final boolean isInitialized() {
        throw null;
    }
}
