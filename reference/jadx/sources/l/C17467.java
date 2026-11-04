package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܽۡۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 83GQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17467 extends AbstractC12531 implements InterfaceC4043 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C24927 f56786;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public List f56787 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C10293 f56788;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public AbstractC1566 f56789;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C9856 f56790;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C14022 f56791;

    @Override // l.InterfaceC24181
    public final String typeName() {
        return "field";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m40964(C2551 c2551) {
        this.f56787 = C6823.m19001(this.f56787, (AbstractC12531) c2551);
    }

    public C17467(C24927 c24927, C14022 c14022, int i) {
        this.f56786 = c24927;
        this.f56791 = c14022;
        this.f56789 = c14022.m34149();
        this.f56788 = new C10293(i, EnumC19244.FIELD);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40963(AbstractC1566 abstractC1566) {
        this.f56789 = abstractC1566;
    }

    @Override // l.InterfaceC4043
    /* JADX INFO: renamed from: ᩺ */
    public final C14022 mo13008() {
        return this.f56791;
    }

    @Override // l.InterfaceC20451
    /* JADX INFO: renamed from: ᩷ */
    public final C10293 mo8547() {
        return this.f56788;
    }

    @Override // l.InterfaceC20451
    /* JADX INFO: renamed from: ۙ */
    public final void mo8501(C10293 c10293) {
        this.f56788 = c10293;
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m40969() {
        return this.f56788.m26540();
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final boolean m40970() {
        return !this.f56788.m26540();
    }

    public final String getName() {
        return this.f56791.m34147();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m40967() {
        return this.f56791.m34145();
    }

    public final AbstractC1566 getType() {
        return this.f56789;
    }

    @Override // l.InterfaceC20451
    public final C24927 getDeclaringClass() {
        return this.f56786;
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C24927 m40972() {
        return this.f56786;
    }

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final List m40968() {
        return this.f56787;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40971(List list) {
        this.f56787 = list;
    }

    @Override // l.InterfaceC24181
    /* JADX INFO: renamed from: ܰ */
    public final C1610 mo8527() {
        return this.f56786.mo8527();
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final C9856 m40966() {
        return this.f56790;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40965(C9856 c9856) {
        this.f56790 = c9856;
    }

    @Override // l.InterfaceC11653
    /* JADX INFO: renamed from: ۘ */
    public final EnumC1959 mo8493() {
        return EnumC1959.FIELD;
    }

    public final int hashCode() {
        return this.f56791.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17467.class != obj.getClass()) {
            return false;
        }
        return this.f56791.equals(((C17467) obj).f56791);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C14022 c14022 = this.f56791;
        sb.append(c14022.m34148());
        sb.append(".");
        sb.append(c14022.m34147());
        sb.append(" :");
        sb.append(this.f56789);
        return sb.toString();
    }
}
