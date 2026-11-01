package l;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ۢۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 359P */
/* JADX INFO: loaded from: classes4.dex */
public final class C9295 extends AbstractC10442 implements InterfaceC5143 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC23844 f31570;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f31571;

    public C9295(String str, Collection collection) {
        this.f31571 = str;
        this.f31570 = C3648.m10754(collection);
    }

    @Override // l.InterfaceC20147
    public final String getType() {
        return this.f31571;
    }

    @Override // l.InterfaceC20147
    public final Set getElements() {
        return this.f31570;
    }
}
