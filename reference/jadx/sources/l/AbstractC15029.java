package l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15029 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC5335 f49067;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Object f49068;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1606 f49070;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f49069 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f49066 = AbstractC20997.f67126;

    /* JADX INFO: renamed from: ᩷ */
    public int mo14389() {
        return 1;
    }

    public AbstractC15029(C1606 c1606, EnumC5335 enumC5335, Object obj) {
        this.f49070 = c1606;
        this.f49067 = enumC5335;
        this.f49068 = obj;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo14387(InterfaceC13676 interfaceC13676, int i) {
        interfaceC13676.mo3879(this.f49070.m47996(i, this.f49067.m15992()));
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo14390(InterfaceC13676 interfaceC13676, int i) {
        interfaceC13676.mo3879(this.f49070.m47996(i, this.f49067.m15993()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m36184() {
        return this.f49069;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36185(IOException iOException) {
        this.f49069.add(iOException);
    }

    /* JADX INFO: renamed from: ۤ */
    public String mo14388() {
        return String.valueOf(this.f49068);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC15029)) {
            return false;
        }
        AbstractC15029 abstractC15029 = (AbstractC15029) obj;
        if (this.f49067 != abstractC15029.f49067) {
            return false;
        }
        return this.f49068.equals(abstractC15029.f49068);
    }

    public int hashCode() {
        return this.f49068.hashCode() + (this.f49067.hashCode() * 31);
    }

    public final String toString() {
        return "<CONSTANT " + this.f49067 + " " + mo14388() + ">";
    }
}
