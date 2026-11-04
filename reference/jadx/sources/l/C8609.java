package l;

import java.util.Comparator;
import java.util.Set;

/* JADX INFO: renamed from: l.۠ۨۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 857H */
/* JADX INFO: loaded from: classes4.dex */
public final class C8609 extends AbstractC18901 implements InterfaceC8674 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final Comparator f28109 = new C2643();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f28110;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC8639 f28111 = AbstractC8639.of();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f28112;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f28113;

    @Override // l.AbstractC18901, l.InterfaceC13851, l.InterfaceC15125
    public final String getSignature() {
        return null;
    }

    public C8609(int i, String str) {
        this.f28112 = i;
        this.f28110 = str;
    }

    @Override // l.InterfaceC8674
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo23116() {
        return this.f28112;
    }

    @Override // l.InterfaceC19775
    public final String getType() {
        return this.f28110;
    }

    @Override // l.InterfaceC13851
    public final Set getAnnotations() {
        return this.f28111;
    }

    @Override // l.InterfaceC13851, l.InterfaceC15125
    public final String getName() {
        return this.f28113;
    }
}
