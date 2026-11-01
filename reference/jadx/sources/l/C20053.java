package l;

import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩶۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: D9PU */
/* JADX INFO: loaded from: classes5.dex */
public final class C20053 extends AbstractC3967 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f64189;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f64190;

    @Override // l.InterfaceC22500
    public final InterfaceC22500 setUnknownFields(C6708 c6708) {
        return this;
    }

    public /* synthetic */ C20053(int i) {
        this(true, true);
    }

    public C20053(boolean z, boolean z2) {
        this.f64189 = z;
        this.f64190 = z2;
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        buildPartial();
        throw null;
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        buildPartial();
        throw null;
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C0296 buildPartial() {
        return new C0296(0);
    }

    @Override // l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        throw null;
    }

    @Override // l.InterfaceC22500
    public final InterfaceC22500 clearField(C19741 c19741) {
        c19741.m44910();
        throw null;
    }

    @Override // l.InterfaceC18266
    public final Object getField(C19741 c19741) {
        c19741.m44910();
        throw null;
    }

    @Override // l.InterfaceC18266
    public final boolean hasField(C19741 c19741) {
        c19741.m44910();
        throw null;
    }

    @Override // l.InterfaceC22500
    public final InterfaceC22500 newBuilderForField(C19741 c19741) {
        c19741.m44910();
        throw null;
    }

    @Override // l.InterfaceC22500
    public final InterfaceC22500 setField(C19741 c19741, Object obj) {
        c19741.m44910();
        throw null;
    }

    @Override // l.InterfaceC22500
    public final InterfaceC22500 addRepeatedField(C19741 c19741, Object obj) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        throw null;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        throw null;
    }

    @Override // l.InterfaceC18266
    public final Map getAllFields() {
        new TreeMap();
        throw null;
    }

    @Override // l.InterfaceC18266
    public final C6708 getUnknownFields() {
        return C6708.m18141();
    }

    @Override // l.AbstractC3967, l.AbstractC21607
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C20053 mo2780clone() {
        return new C20053(this.f64189, this.f64190);
    }

    @Override // l.InterfaceC15445
    public final boolean isInitialized() {
        throw null;
    }
}
