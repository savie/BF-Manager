package l;

/* JADX INFO: renamed from: l.ܽᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16813 implements InterfaceC11169 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile C19741 f53820;

    @Override // l.InterfaceC11169
    /* JADX INFO: renamed from: ֨ */
    public final C19741 mo28101() {
        if (this.f53820 == null) {
            C21046 c21046 = (C21046) this;
            C19741 c19741 = (C19741) c21046.f68561.getDescriptorForType().m8533().get(c21046.f68562);
            synchronized (this) {
                if (this.f53820 == null) {
                    this.f53820 = c19741;
                }
            }
        }
        return this.f53820;
    }
}
