package l;

/* JADX INFO: renamed from: l.۫֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12764 implements InterfaceC24699 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile C7323 f40835;

    @Override // l.InterfaceC24699
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C7323 mo31623() {
        if (this.f40835 == null) {
            C10526 c10526 = (C10526) this;
            C7323 c7323 = (C7323) c10526.f33474.getDescriptorForType().m54741().get(c10526.f33475);
            synchronized (this) {
                if (this.f40835 == null) {
                    this.f40835 = c7323;
                }
            }
        }
        return this.f40835;
    }
}
