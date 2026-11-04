package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۖ᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QA30 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2982 implements InterfaceC6492 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f9689;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f9690 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f9688 = new ConcurrentMapC17249();

    public C2982(String str) {
        this.f9689 = str;
    }

    @Override // l.InterfaceC6492
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo9705(AbstractC3508 abstractC3508) {
        synchronized (this) {
            AbstractC12457 abstractC12457Mo11502 = abstractC3508.mo11502();
            if (abstractC12457Mo11502 != null && abstractC12457Mo11502.mo30935()) {
                this.f9690.put(abstractC3508.getName(), abstractC12457Mo11502);
            } else {
                this.f9690.put(abstractC3508.getName(), ((C14168) abstractC3508.mo11500()).m34413(abstractC3508.mo11501(), abstractC3508.getName(), abstractC12457Mo11502 != null ? abstractC12457Mo11502.mo30948() : ""));
            }
        }
    }

    @Override // l.InterfaceC6492
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9703(AbstractC3508 abstractC3508) {
        synchronized (this) {
            this.f9690.remove(abstractC3508.getName());
            this.f9688.remove(abstractC3508.getName());
        }
    }

    @Override // l.InterfaceC6492
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo9704(AbstractC3508 abstractC3508) {
        synchronized (this) {
            this.f9690.put(abstractC3508.getName(), abstractC3508.mo11502());
            this.f9688.remove(abstractC3508.getName());
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n\tType: ");
        sb.append(this.f9689);
        ConcurrentMapC17249 concurrentMapC17249 = this.f9690;
        if (concurrentMapC17249.isEmpty()) {
            sb.append("\n\tNo services collected.");
        } else {
            sb.append("\n\tServices");
            for (Map.Entry entry : concurrentMapC17249.entrySet()) {
                sb.append("\n\t\tService: ");
                sb.append((String) entry.getKey());
                sb.append(": ");
                sb.append(entry.getValue());
            }
        }
        ConcurrentMapC17249 concurrentMapC172410 = this.f9688;
        if (concurrentMapC172410.isEmpty()) {
            sb.append("\n\tNo event queued.");
        } else {
            sb.append("\n\tEvents");
            for (Map.Entry entry2 : concurrentMapC172410.entrySet()) {
                sb.append("\n\t\tEvent: ");
                sb.append((String) entry2.getKey());
                sb.append(": ");
                sb.append(entry2.getValue());
            }
        }
        return sb.toString();
    }
}
