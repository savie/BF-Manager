package l;

import com.alipay.sdk.m.u0.b;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۚ᩶ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2IV0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5886 implements InterfaceC13343 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f20166;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC11105 f20167;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f20168;

    public C5886(EnumC11105 enumC11105, String str, LinkedHashMap linkedHashMap) {
        this.f20167 = enumC11105;
        this.f20166 = str;
        this.f20168 = linkedHashMap;
    }

    @Override // l.InterfaceC13343
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String mo17110() {
        return this.f20166;
    }

    @Override // l.InterfaceC13343
    public final EnumC11105 getVisibility() {
        return this.f20167;
    }

    @Override // l.InterfaceC13343
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C15580 mo17111() {
        return (C15580) this.f20168.get(b.d);
    }

    @Override // l.InterfaceC13343
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Map mo17112() {
        return this.f20168;
    }

    public final String toString() {
        return "Annotation{" + this.f20167 + ", type=" + this.f20166 + ", values=" + this.f20168 + '}';
    }
}
