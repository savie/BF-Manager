package l;

import java.util.Comparator;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 857H */
/* JADX INFO: loaded from: classes5.dex */
public final class C18838 extends AbstractC4090 implements InterfaceC18632 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Comparator f61031 = new C18132();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f61032;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC23844 f61033 = AbstractC23844.of();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f61034;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f61035;

    @Override // l.AbstractC4090, l.InterfaceC19234, l.InterfaceC19940
    public final String getSignature() {
        return null;
    }

    public C18838(int i, String str) {
        this.f61032 = i;
        this.f61034 = str;
    }

    @Override // l.InterfaceC18632
    /* JADX INFO: renamed from: ۙ */
    public final int mo10133() {
        return this.f61032;
    }

    @Override // l.InterfaceC15914
    public final String getType() {
        return this.f61034;
    }

    @Override // l.InterfaceC19234
    public final Set getAnnotations() {
        return this.f61033;
    }

    @Override // l.InterfaceC19234, l.InterfaceC19940
    public final String getName() {
        return this.f61035;
    }
}
